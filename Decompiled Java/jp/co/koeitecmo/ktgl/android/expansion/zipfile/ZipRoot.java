package jp.co.koeitecmo.ktgl.android.expansion.zipfile;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.android.vending.expansion.zipfile.APKExpansionSupport;
import com.android.vending.expansion.zipfile.ZipResourceFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.HashMap;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class ZipRoot {
    private HashMap<String, ZipResourceFile.ZipEntryRO> entries_ = null;
    private ZipResourceFile resource_ = null;

    public static ZipRoot instantiate(Context context, int i, int i2, int i3) {
        ZipRoot zipRoot = new ZipRoot();
        if (!zipRoot.reset(context, i, i2, i3)) {
            return null;
        }
        return zipRoot;
    }

    public static ZipRoot instantiateMain(Context context, int i) {
        ZipRoot zipRoot = new ZipRoot();
        if (!zipRoot.resetMain(context, i)) {
            return null;
        }
        return zipRoot;
    }

    public static ZipRoot instantiatePatch(Context context, int i) {
        ZipRoot zipRoot = new ZipRoot();
        if (!zipRoot.resetPatch(context, i)) {
            return null;
        }
        return zipRoot;
    }

    public InputStream open(String str) {
        if (str == null) {
            return null;
        }
        String normalizePath = normalizePath(str);
        if (!this.entries_.containsKey(normalizePath)) {
            Log.e("failed to open an entry in expansion zipfile: The specified path is invalid: " + str);
            return null;
        }
        try {
            return this.resource_.getInputStream(normalizePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public AssetFileDescriptor openAsFD(String str) {
        if (str == null) {
            return null;
        }
        String normalizePath = normalizePath(str);
        if (this.entries_.containsKey(normalizePath)) {
            return this.resource_.getAssetFileDescriptor(normalizePath);
        }
        Log.e("failed to open an entry in expansion zipfile as FD: The specified path is invalid: " + normalizePath);
        return null;
    }

    public long getUncompressedLength(String str) {
        if (str == null) {
            Log.e("failed to get the length of entry: The specified path is null.");
            return -1;
        }
        String normalizePath = normalizePath(str);
        if (this.entries_.containsKey(normalizePath)) {
            return this.entries_.get(normalizePath).mUncompressedLength;
        }
        Log.e("failed to get the length of entry: The specified path is invalid: " + str);
        return -1;
    }

    public long getWhenModified(String str) {
        if (str == null) {
            Log.e("failed to get the length of entry: The specified path is null.");
            return -1;
        }
        String normalizePath = normalizePath(str);
        if (!this.entries_.containsKey(normalizePath)) {
            Log.e("failed to get the length of entry: The specified path is invalid: " + str);
            return -1;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.entries_.get(normalizePath).mWhenModified * 1024);
        return (long) ((instance.get(1) << 40) | (instance.get(2) << 32) | (instance.get(5) << 24) | (instance.get(11) << 16) | (instance.get(12) << 8) | instance.get(13));
    }

    public boolean exists(String str) {
        return this.entries_.containsKey(normalizePath(str));
    }

    private boolean reset(Context context, int i, int i2, int i3) {
        if (context == null) {
            Log.e("The context is null.");
            return false;
        }
        try {
            this.resource_ = APKExpansionSupport.getAPKExpansionZipFile(context, i, i2, i3);
            buildEntries();
            return true;
        } catch (IOException e) {
            Log.e((Throwable) e);
            Log.e("failed to initialize the root of Expansion Zipfile:{mainVersion:" + i + ",patchVersion:" + i2 + ",thirdVersion:" + i3 + ",package:" + context.getPackageName() + "}");
            return false;
        }
    }

    private final boolean resetMain(Context context, int i) {
        if (context == null) {
            Log.e("The context is null.");
            return false;
        }
        try {
            this.resource_ = APKExpansionSupport.getMainAPKExpansionZipFile(context, i);
            buildEntries();
            return true;
        } catch (IOException e) {
            Log.e((Throwable) e);
            Log.e("failed to initialize the root of Expansion Zipfile:{mainVersion:" + i + ",package:" + context.getPackageName() + "}");
            return false;
        }
    }

    private final boolean resetPatch(Context context, int i) {
        if (context == null) {
            Log.e("The context is null.");
            return false;
        }
        try {
            this.resource_ = APKExpansionSupport.getPatchAPKExpansionZipFile(context, i);
            buildEntries();
            return true;
        } catch (IOException e) {
            Log.e((Throwable) e);
            Log.e("failed to initialize the root of Expansion Zipfile:{patchVersion:" + i + ",package:" + context.getPackageName() + "}");
            return false;
        }
    }

    private final void buildEntries() {
        ZipResourceFile.ZipEntryRO[] allEntries = this.resource_.getAllEntries();
        this.entries_ = new HashMap<>(allEntries.length);
        for (ZipResourceFile.ZipEntryRO zipEntryRO : allEntries) {
            this.entries_.put(zipEntryRO.mFileName, zipEntryRO);
        }
    }

    private final String normalizePath(String str) {
        return str.replaceFirst("^/*", "");
    }
}
