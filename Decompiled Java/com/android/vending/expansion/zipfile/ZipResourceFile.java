package com.android.vending.expansion.zipfile;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipFile;

public class ZipResourceFile {
    static final boolean LOGV = false;
    static final String LOG_TAG = "zipro";
    static final int kCDECRC = 16;
    static final int kCDECommentLen = 32;
    static final int kCDECompLen = 20;
    static final int kCDEExtraLen = 30;
    static final int kCDELen = 46;
    static final int kCDELocalOffset = 42;
    static final int kCDEMethod = 10;
    static final int kCDEModWhen = 12;
    static final int kCDENameLen = 28;
    static final int kCDESignature = 33639248;
    static final int kCDEUncompLen = 24;
    static final int kCompressDeflated = 8;
    static final int kCompressStored = 0;
    static final int kEOCDFileOffset = 16;
    static final int kEOCDLen = 22;
    static final int kEOCDNumEntries = 8;
    static final int kEOCDSignature = 101010256;
    static final int kEOCDSize = 12;
    static final int kLFHExtraLen = 28;
    static final int kLFHLen = 30;
    static final int kLFHNameLen = 26;
    static final int kLFHSignature = 67324752;
    static final int kMaxCommentLen = 65535;
    static final int kMaxEOCDSearch = 65557;
    static final int kZipEntryAdj = 10000;
    private HashMap<String, ZipEntryRO> mHashMap = new HashMap<>();
    ByteBuffer mLEByteBuffer = ByteBuffer.allocate(4);
    public HashMap<File, ZipFile> mZipFiles = new HashMap<>();

    private static int swapEndian(int i) {
        return ((i & 255) << 24) + ((65280 & i) << 8) + ((16711680 & i) >>> 8) + ((i >>> 24) & 255);
    }

    private static int swapEndian(short s) {
        return ((s & 65280) >>> 8) | ((s & 255) << 8);
    }

    public static final class ZipEntryRO {
        public long mCRC32;
        public long mCompressedLength;
        public final File mFile;
        public final String mFileName;
        public long mLocalHdrOffset;
        public int mMethod;
        public long mOffset = -1;
        public long mUncompressedLength;
        public long mWhenModified;
        public final String mZipFileName;

        public ZipEntryRO(String str, File file, String str2) {
            this.mFileName = str2;
            this.mZipFileName = str;
            this.mFile = file;
        }

        public void setOffsetFromFile(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer) throws IOException {
            long j = this.mLocalHdrOffset;
            try {
                randomAccessFile.seek(j);
                randomAccessFile.readFully(byteBuffer.array());
                if (byteBuffer.getInt(0) == ZipResourceFile.kLFHSignature) {
                    this.mOffset = j + 30 + ((long) (byteBuffer.getShort(26) & 65535)) + ((long) (byteBuffer.getShort(28) & 65535));
                } else {
                    Log.w(ZipResourceFile.LOG_TAG, "didn't find signature at start of lfh");
                    throw new IOException();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        public long getOffset() {
            return this.mOffset;
        }

        public boolean isUncompressed() {
            return this.mMethod == 0;
        }

        public AssetFileDescriptor getAssetFileDescriptor() {
            if (this.mMethod != 0) {
                return null;
            }
            try {
                return new AssetFileDescriptor(ParcelFileDescriptor.open(this.mFile, 268435456), getOffset(), this.mUncompressedLength);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }

        public String getZipFileName() {
            return this.mZipFileName;
        }

        public File getZipFile() {
            return this.mFile;
        }
    }

    public ZipResourceFile(String str) throws IOException {
        addPatchFile(str);
    }

    /* access modifiers changed from: package-private */
    public ZipEntryRO[] getEntriesAt(String str) {
        Vector vector = new Vector();
        Collection<ZipEntryRO> values = this.mHashMap.values();
        if (str == null) {
            str = "";
        }
        int length = str.length();
        for (ZipEntryRO next : values) {
            if (next.mFileName.startsWith(str) && -1 == next.mFileName.indexOf(47, length)) {
                vector.add(next);
            }
        }
        return (ZipEntryRO[]) vector.toArray(new ZipEntryRO[vector.size()]);
    }

    public ZipEntryRO[] getAllEntries() {
        Collection<ZipEntryRO> values = this.mHashMap.values();
        return (ZipEntryRO[]) values.toArray(new ZipEntryRO[values.size()]);
    }

    public AssetFileDescriptor getAssetFileDescriptor(String str) {
        ZipEntryRO zipEntryRO = this.mHashMap.get(str);
        if (zipEntryRO != null) {
            return zipEntryRO.getAssetFileDescriptor();
        }
        return null;
    }

    public class OriginalInputStream extends InputStream {
        private static final int EOS = -1;
        private byte[] buffer_ = new byte[1024];
        private long compressedRest_ = 0;
        private ZipEntryRO entry_ = null;
        private InputStream in_ = null;
        private int inflatedRead_ = 0;
        private int inflatedSize_ = 0;
        private byte[] inflated_ = new byte[1024];
        private Inflater inflater_ = new Inflater(true);
        private long uncompressedRest_ = 0;

        public final void mark(int i) {
        }

        public final boolean markSupported() {
            return false;
        }

        public OriginalInputStream(ZipEntryRO zipEntryRO) {
            this.entry_ = zipEntryRO;
            try {
                this.in_ = new BufferedInputStream(new FileInputStream(this.entry_.getZipFile()));
                this.in_.skip(this.entry_.getOffset());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.compressedRest_ = this.entry_.mCompressedLength;
            this.uncompressedRest_ = this.entry_.mUncompressedLength;
        }

        public final int available() {
            return this.inflatedSize_ - this.inflatedRead_;
        }

        public final void close() {
            try {
                this.in_.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.inflater_.end();
        }

        public final int read(byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            if (i2 == 0) {
                return 0;
            }
            int i5 = this.inflatedSize_;
            int i6 = this.inflatedRead_;
            int i7 = i5 - i6;
            if (i2 <= i7) {
                System.arraycopy(this.inflated_, i6, bArr, i, i2);
                this.uncompressedRest_ -= (long) i2;
                this.inflatedRead_ += i2;
                return i2;
            }
            if (i7 > 0) {
                System.arraycopy(this.inflated_, i6, bArr, i, i7);
                i3 = i7 + 0;
                this.uncompressedRest_ -= (long) i7;
                this.inflatedRead_ = this.inflatedSize_;
            } else {
                i3 = 0;
            }
            while (i3 < i2) {
                if (!inflate() || (i4 = this.inflatedSize_) == 0) {
                    return -1;
                }
                int min = Math.min(i2 - i3, i4);
                System.arraycopy(this.inflated_, 0, bArr, i + i3, min);
                this.uncompressedRest_ -= (long) min;
                this.inflatedRead_ = min;
                i3 += min;
            }
            return i2;
        }

        public final int read() {
            byte b;
            long j = this.uncompressedRest_;
            if (0 == j) {
                return -1;
            }
            int i = this.inflatedRead_;
            if (i < this.inflatedSize_) {
                this.uncompressedRest_ = j - 1;
                byte[] bArr = this.inflated_;
                this.inflatedRead_ = i + 1;
                b = bArr[i];
            } else if (!inflate()) {
                return -1;
            } else {
                this.uncompressedRest_--;
                byte[] bArr2 = this.inflated_;
                int i2 = this.inflatedRead_;
                this.inflatedRead_ = i2 + 1;
                b = bArr2[i2];
            }
            return b & 255;
        }

        public final boolean inflate() {
            while (this.inflater_.needsInput()) {
                long j = this.compressedRest_;
                if (0 == j) {
                    return false;
                }
                try {
                    int read = this.in_.read(this.buffer_, 0, (int) Math.min((long) this.buffer_.length, j));
                    this.compressedRest_ -= (long) read;
                    this.inflater_.setInput(this.buffer_, 0, read);
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
            }
            try {
                this.inflatedSize_ = this.inflater_.inflate(this.inflated_);
                this.inflatedRead_ = 0;
                if (this.uncompressedRest_ >= ((long) this.inflatedSize_)) {
                    return true;
                }
                this.inflatedSize_ = (int) this.uncompressedRest_;
                return true;
            } catch (DataFormatException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    public InputStream getInputStream(String str) throws IOException {
        ZipEntryRO zipEntryRO = this.mHashMap.get(str);
        if (zipEntryRO == null) {
            return null;
        }
        if (zipEntryRO.isUncompressed()) {
            return zipEntryRO.getAssetFileDescriptor().createInputStream();
        }
        ZipFile zipFile = this.mZipFiles.get(zipEntryRO.getZipFile());
        if (zipFile == null) {
            zipFile = new ZipFile(zipEntryRO.getZipFile(), 1);
            this.mZipFiles.put(zipEntryRO.getZipFile(), zipFile);
        }
        if (zipFile.getEntry(str) != null) {
            return new OriginalInputStream(zipEntryRO);
        }
        return null;
    }

    private static int read4LE(RandomAccessFile randomAccessFile) throws EOFException, IOException {
        return swapEndian(randomAccessFile.readInt());
    }

    /* access modifiers changed from: package-private */
    public void addPatchFile(String str) throws IOException {
        String str2 = str;
        File file = new File(str2);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        long length = randomAccessFile.length();
        if (length >= 22) {
            long j = 65557;
            if (65557 > length) {
                j = length;
            }
            randomAccessFile.seek(0);
            int read4LE = read4LE(randomAccessFile);
            if (read4LE == kEOCDSignature) {
                Log.i(LOG_TAG, "Found Zip archive, but it looks empty");
                throw new IOException();
            } else if (read4LE == kLFHSignature) {
                randomAccessFile.seek(length - j);
                ByteBuffer allocate = ByteBuffer.allocate((int) j);
                byte[] array = allocate.array();
                randomAccessFile.readFully(array);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                int length2 = array.length - 22;
                while (length2 >= 0 && (array[length2] != 80 || allocate.getInt(length2) != kEOCDSignature)) {
                    length2--;
                }
                if (length2 < 0) {
                    Log.d(LOG_TAG, "Zip: EOCD not found, " + str2 + " is not zip");
                }
                short s = allocate.getShort(length2 + 8);
                long j2 = ((long) allocate.getInt(length2 + 12)) & 4294967295L;
                long j3 = ((long) allocate.getInt(length2 + 16)) & 4294967295L;
                String str3 = ")";
                if (j3 + j2 > length) {
                    Log.w(LOG_TAG, "bad offsets (dir " + j3 + ", size " + j2 + ", eocd " + length2 + str3);
                    throw new IOException();
                } else if (s != 0) {
                    MappedByteBuffer mappedByteBuffer = new MappedByteBuffer(randomAccessFile, j3);
                    mappedByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    short s2 = 65535;
                    byte[] bArr = new byte[65535];
                    ByteBuffer allocate2 = ByteBuffer.allocate(30);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    int i = 0;
                    int i2 = 0;
                    while (i < s) {
                        if (mappedByteBuffer.getInt((long) i2) == kCDESignature) {
                            short s3 = mappedByteBuffer.getShort((long) (i2 + 28)) & s2;
                            short s4 = mappedByteBuffer.getShort((long) (i2 + 30)) & s2;
                            int i3 = i;
                            short s5 = mappedByteBuffer.getShort((long) (i2 + 32)) & s2;
                            String str4 = str3;
                            mappedByteBuffer.position((long) (i2 + 46));
                            mappedByteBuffer.get(bArr, 0, s3);
                            mappedByteBuffer.position(0);
                            String str5 = new String(bArr, 0, s3);
                            ZipEntryRO zipEntryRO = new ZipEntryRO(str2, file, str5);
                            zipEntryRO.mMethod = mappedByteBuffer.getShort((long) (i2 + 10)) & 65535;
                            RandomAccessFile randomAccessFile2 = randomAccessFile;
                            zipEntryRO.mWhenModified = ((long) mappedByteBuffer.getInt((long) (i2 + 12))) & 4294967295L;
                            zipEntryRO.mCRC32 = mappedByteBuffer.getLong((long) (i2 + 16)) & 4294967295L;
                            zipEntryRO.mCompressedLength = mappedByteBuffer.getLong((long) (i2 + 20)) & 4294967295L;
                            zipEntryRO.mUncompressedLength = mappedByteBuffer.getLong((long) (i2 + 24)) & 4294967295L;
                            zipEntryRO.mLocalHdrOffset = ((long) mappedByteBuffer.getInt((long) (i2 + 42))) & 4294967295L;
                            allocate2.clear();
                            zipEntryRO.setOffsetFromFile(randomAccessFile2, allocate2);
                            this.mHashMap.put(str5, zipEntryRO);
                            i2 += s3 + 46 + s4 + s5;
                            i = i3 + 1;
                            str2 = str;
                            randomAccessFile = randomAccessFile2;
                            str3 = str4;
                            file = file;
                            s2 = 65535;
                        } else {
                            Log.w(LOG_TAG, "Missed a central dir sig (at " + i2 + str3);
                            throw new IOException();
                        }
                    }
                } else {
                    Log.w(LOG_TAG, "empty archive?");
                    throw new IOException();
                }
            } else {
                Log.v(LOG_TAG, "Not a Zip archive");
                throw new IOException();
            }
        } else {
            throw new IOException();
        }
    }
}
