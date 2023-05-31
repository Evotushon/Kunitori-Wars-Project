package jp.co.koeitecmo.lib.io;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StorageManager {
    private static final int BUFFER_SIZE = 1024;
    private static final String TAG = "lib.io.StorageManager";
    private final AssetManager assetManager;
    public final File dataDir;
    private final String path;

    public StorageManager(Context context, String str) {
        this(context, str, false);
    }

    public StorageManager(Context context, String str, boolean z) {
        File file;
        this.path = str;
        this.assetManager = context.getResources().getAssets();
        if (z) {
            file = new File(new File(Environment.getExternalStorageDirectory(), context.getPackageName()), str);
        } else {
            file = context.getFilesDir();
        }
        this.dataDir = file;
    }

    public void initData() throws IOException {
        copyFiles((String) null, this.path, this.dataDir);
    }

    public void deleteData() throws IOException {
        deleteAll(this.dataDir);
    }

    public void unzipData(InputStream inputStream) throws IOException {
        unzip(inputStream, this.dataDir);
    }

    private void copyFiles(String str, String str2, File file) throws IOException {
        String str3;
        if ((str == "" || str == null) ? false : true) {
            str3 = str + File.separator + str2;
        } else {
            str3 = str2;
        }
        if (isDirectory(str3)) {
            if (!file.exists()) {
                file.mkdirs();
            }
            for (String str4 : this.assetManager.list(str3)) {
                copyFiles(str3, str4, new File(file, str4));
            }
        } else if (str3.toLowerCase().endsWith(".zip")) {
            unzip(this.assetManager.open(str3, 2), file.getParentFile());
        } else {
            copyData(this.assetManager.open(str3), new FileOutputStream(new File(file.getParentFile(), str2)));
        }
    }

    private boolean isDirectory(String str) throws IOException {
        try {
            if (this.assetManager.list(str).length > 0) {
                return true;
            }
            this.assetManager.open(str);
            return false;
        } catch (FileNotFoundException unused) {
            return true;
        }
    }

    private void deleteAll(File file) {
        if (file.isDirectory()) {
            for (File deleteAll : file.listFiles()) {
                deleteAll(deleteAll);
            }
        }
        file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void unzip(java.io.InputStream r5, java.io.File r6) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0039 }
            r1.<init>(r5)     // Catch:{ all -> 0x0039 }
        L_0x0006:
            java.util.zip.ZipEntry r5 = r1.getNextEntry()     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0033
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0037 }
            r2 = 92
            char r3 = java.io.File.separatorChar     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r0.replace(r2, r3)     // Catch:{ all -> 0x0037 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0037 }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x0037 }
            boolean r5 = r5.isDirectory()     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0027
            r2.mkdirs()     // Catch:{ all -> 0x0037 }
            goto L_0x0006
        L_0x0027:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0037 }
            r5.<init>(r2)     // Catch:{ all -> 0x0037 }
            r4.writeData(r1, r5)     // Catch:{ all -> 0x0037 }
            r1.closeEntry()     // Catch:{ all -> 0x0037 }
            goto L_0x0006
        L_0x0033:
            r1.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            return
        L_0x0037:
            r5 = move-exception
            goto L_0x003b
        L_0x0039:
            r5 = move-exception
            r1 = r0
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            goto L_0x0042
        L_0x0041:
            throw r5
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.co.koeitecmo.lib.io.StorageManager.unzip(java.io.InputStream, java.io.File):void");
    }

    private void copyData(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            writeData(bufferedInputStream, outputStream);
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023 A[SYNTHETIC, Splitter:B:17:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeData(java.io.InputStream r4, java.io.OutputStream r5) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x001f }
            r1.<init>(r5)     // Catch:{ all -> 0x001f }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x001d }
        L_0x000a:
            int r0 = r5.length     // Catch:{ all -> 0x001d }
            r2 = 0
            int r0 = r4.read(r5, r2, r0)     // Catch:{ all -> 0x001d }
            if (r0 <= 0) goto L_0x0016
            r1.write(r5, r2, r0)     // Catch:{ all -> 0x001d }
            goto L_0x000a
        L_0x0016:
            r1.flush()     // Catch:{ all -> 0x001d }
            r1.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            return
        L_0x001d:
            r4 = move-exception
            goto L_0x0021
        L_0x001f:
            r4 = move-exception
            r1 = r0
        L_0x0021:
            if (r1 == 0) goto L_0x0026
            r1.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            goto L_0x0028
        L_0x0027:
            throw r4
        L_0x0028:
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.co.koeitecmo.lib.io.StorageManager.writeData(java.io.InputStream, java.io.OutputStream):void");
    }
}
