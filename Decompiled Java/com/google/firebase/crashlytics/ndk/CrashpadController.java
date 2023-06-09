package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.ndk.SessionFiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

class CrashpadController implements NativeComponentController {
    private static final String APP_METADATA_FILE = "app.json";
    private static final String DEVICE_METADATA_FILE = "device.json";
    private static final String OS_METADATA_FILE = "os.json";
    private static final String SESSION_METADATA_FILE = "session.json";
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private final Context context;
    private final CrashFilesManager filesManager;
    private final NativeApi nativeApi;

    CrashpadController(Context context2, NativeApi nativeApi2, CrashFilesManager crashFilesManager) {
        this.context = context2;
        this.nativeApi = nativeApi2;
        this.filesManager = crashFilesManager;
    }

    public boolean initialize(String str) {
        File sessionFileDirectory = this.filesManager.getSessionFileDirectory(str);
        if (sessionFileDirectory == null) {
            return false;
        }
        try {
            return this.nativeApi.initialize(sessionFileDirectory.getCanonicalPath(), this.context.getAssets());
        } catch (IOException e) {
            Logger.getLogger().e("Error initializing Crashlytics NDK", e);
            return false;
        }
    }

    public boolean hasCrashDataForSession(String str) {
        File file;
        if (!this.filesManager.hasSessionFileDirectory(str) || (file = getFilesForSession(str).minidump) == null || !file.exists()) {
            return false;
        }
        return true;
    }

    public boolean finalizeSession(String str) {
        this.filesManager.deleteSessionFilesDirectory(str);
        return true;
    }

    @NonNull
    public SessionFiles getFilesForSession(String str) {
        File sessionFileDirectory = this.filesManager.getSessionFileDirectory(str);
        File file = new File(sessionFileDirectory, "pending");
        Logger logger = Logger.getLogger();
        logger.v("Minidump directory: " + file.getAbsolutePath());
        File singleFileWithExtension = getSingleFileWithExtension(file, ".dmp");
        Logger logger2 = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Minidump file ");
        sb.append((singleFileWithExtension == null || !singleFileWithExtension.exists()) ? "does not exist" : "exists");
        logger2.v(sb.toString());
        SessionFiles.Builder builder = new SessionFiles.Builder();
        if (sessionFileDirectory != null && sessionFileDirectory.exists() && file.exists()) {
            builder.minidumpFile(getSingleFileWithExtension(file, ".dmp")).metadataFile(getSingleFileWithExtension(sessionFileDirectory, ".device_info")).sessionFile(new File(sessionFileDirectory, SESSION_METADATA_FILE)).appFile(new File(sessionFileDirectory, APP_METADATA_FILE)).deviceFile(new File(sessionFileDirectory, DEVICE_METADATA_FILE)).osFile(new File(sessionFileDirectory, OS_METADATA_FILE));
        }
        return builder.build();
    }

    public void writeBeginSession(String str, String str2, long j) {
        writeSessionJsonFile(str, SessionMetadataJsonSerializer.serializeBeginSession(str, str2, j), SESSION_METADATA_FILE);
    }

    public void writeSessionApp(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        writeSessionJsonFile(str, SessionMetadataJsonSerializer.serializeSessionApp(str2, str3, str4, str5, i, str6), APP_METADATA_FILE);
    }

    public void writeSessionOs(String str, String str2, String str3, boolean z) {
        writeSessionJsonFile(str, SessionMetadataJsonSerializer.serializeSessionOs(str2, str3, z), OS_METADATA_FILE);
    }

    public void writeSessionDevice(String str, int i, String str2, int i2, long j, long j2, boolean z, int i3, String str3, String str4) {
        writeSessionJsonFile(str, SessionMetadataJsonSerializer.serializeSessionDevice(i, str2, i2, j, j2, z, i3, str3, str4), DEVICE_METADATA_FILE);
    }

    private void writeSessionJsonFile(String str, String str2, String str3) {
        writeTextFile(new File(this.filesManager.getSessionFileDirectory(str), str3), str2);
    }

    private static void writeTextFile(File file, String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
            try {
                bufferedWriter2.write(str);
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
            throw th;
        }
    }

    @Nullable
    private static File getSingleFileWithExtension(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }
}
