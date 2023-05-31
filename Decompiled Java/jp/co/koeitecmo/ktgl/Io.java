package jp.co.koeitecmo.ktgl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class Io {
    private Context context_;

    public Io(Context context) {
        this.context_ = context;
    }

    public File openFile(String str) {
        return new File(str);
    }

    public InputStream openAsset(String str) {
        try {
            return this.context_.getAssets().open(str);
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return null;
        }
    }

    public AssetFileDescriptor openAssetAsFD(String str) {
        try {
            return this.context_.getAssets().openFd(str);
        } catch (IOException unused) {
            return null;
        }
    }

    public FileInputStream openInternalInput(String str) {
        try {
            return this.context_.openFileInput(str);
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return null;
        }
    }

    public FileOutputStream openInternalOutput(String str, boolean z) {
        int i = 0;
        if (z) {
            i = 32768;
        }
        try {
            return this.context_.openFileOutput(str, i);
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return null;
        }
    }

    public FileInputStream openExternalInput(String str) {
        try {
            return new FileInputStream(new File(this.context_.getExternalFilesDir((String) null), str));
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return null;
        }
    }

    public FileOutputStream openExternalOutput(String str) {
        try {
            return new FileOutputStream(new File(this.context_.getExternalFilesDir((String) null), str));
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return null;
        }
    }

    public FileOutputStream openFileOutputStream(String str) {
        try {
            return new FileOutputStream(new File(str));
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return null;
        }
    }

    public FileInputStream openFileInputStream(String str) {
        try {
            return new FileInputStream(new File(str));
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return null;
        }
    }

    public InputStream openRes(String str) {
        int findRes = findRes(str);
        if (findRes != 0) {
            return this.context_.getResources().openRawResource(findRes);
        }
        Log.w(str + " is not found in res/ directory.");
        return null;
    }

    public AssetFileDescriptor openResAsFD(String str) {
        int findRes = findRes(str);
        if (findRes == 0) {
            Log.w(str + " is not found in res/ directory.");
            return null;
        }
        try {
            return this.context_.getResources().openRawResourceFd(findRes);
        } catch (Exception e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return null;
        }
    }

    public long getStartOffset(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            return assetFileDescriptor.getStartOffset();
        }
        Log.e("file discripter is null");
        return 0;
    }

    public boolean existsAsset(String str) {
        String[] split = str.replaceFirst("^/*", "").split("/");
        int length = Array.getLength(split);
        if (1 > length) {
            return false;
        }
        String str2 = split[0];
        if (Arrays.binarySearch(listAssets(""), str2) < 0) {
            return false;
        }
        String concat = "".concat(str2);
        for (int i = 1; length != i; i++) {
            String str3 = split[i];
            if (Arrays.binarySearch(listAssets(concat), str3) < 0) {
                return false;
            }
            concat = concat.concat("/").concat(str3);
        }
        return true;
    }

    public boolean existsExternal(String str) {
        return new File(this.context_.getExternalFilesDir((String) null), str).exists();
    }

    public boolean existsInternal(String str) {
        return new File(getInternalPath(), str).exists();
    }

    public boolean existsRes(String str) {
        return findRes(str) != 0;
    }

    public boolean existsFile(String str) {
        return new File(str).exists();
    }

    public long lengthAsset(String str) {
        try {
            return (long) this.context_.getAssets().open(str).available();
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return 0;
        }
    }

    public long lengthExternal(String str) {
        return new File(this.context_.getExternalFilesDir((String) null), str).length();
    }

    public long lengthFile(String str) {
        return new File(str).length();
    }

    public long lengthRes(String str) {
        int findRes = findRes(str);
        if (findRes == 0) {
            Log.w(str + " is not found in res/ directory.");
            return 0;
        }
        try {
            return (long) this.context_.getResources().openRawResource(findRes).available();
        } catch (IOException e) {
            Log.w("failed to open " + str + ":" + e.toString() + ":" + e.getMessage());
            return 0;
        }
    }

    public boolean deleteExternal(String str) {
        return new File(this.context_.getExternalFilesDir((String) null), str).delete();
    }

    public boolean deleteFile(String str) {
        return new File(str).delete();
    }

    public String getInternalPath() {
        File filesDir = this.context_.getFilesDir();
        if (filesDir != null) {
            return filesDir.getAbsolutePath();
        }
        Log.w("failed to get the directory");
        return null;
    }

    public String getExternalPath() {
        File externalFilesDir = this.context_.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        Log.w("failed to get the directory of external storage");
        return null;
    }

    public String getExternalRootPath() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            return externalStorageDirectory.getAbsolutePath();
        }
        Log.w("failed to get the directory of external storage");
        return null;
    }

    public String getInternalCachePath() {
        File cacheDir = this.context_.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getAbsolutePath();
        }
        Log.w("failed to get the cache directory");
        return null;
    }

    public String getExternalCachePath() {
        File externalCacheDir = this.context_.getExternalCacheDir();
        if (externalCacheDir != null) {
            return externalCacheDir.getAbsolutePath();
        }
        Log.w("failed to get the external cache directory");
        return null;
    }

    public void closeInputStream(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            Log.w("failed to close the input stream:" + e.toString() + ":" + e.getMessage());
        }
    }

    public void closeOutputStream(OutputStream outputStream) {
        try {
            outputStream.close();
        } catch (IOException e) {
            Log.w("failed to close the output stream:" + e.toString() + ":" + e.getMessage());
        }
    }

    private final String[] listAssets(String str) {
        try {
            return this.context_.getAssets().list(str);
        } catch (IOException e) {
            Log.e("failed to list assets:" + e.toString() + ":" + e.getMessage());
            return new String[0];
        }
    }

    private final int findRes(String str) {
        String packageName = this.context_.getPackageName();
        return this.context_.getResources().getIdentifier(packageName + ":" + normalizeResPath(str), (String) null, (String) null);
    }

    private final String normalizeResPath(String str) {
        return str.replaceFirst("^/*", "");
    }
}
