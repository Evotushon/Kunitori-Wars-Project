package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import java.io.File;

class FirebaseCrashlyticsNdk implements CrashlyticsNativeComponent {
    private static final String FILES_PATH = ".com.google.firebase.crashlytics-ndk";
    private final NativeComponentController controller;

    static FirebaseCrashlyticsNdk create(@NonNull Context context) {
        return new FirebaseCrashlyticsNdk(new CrashpadController(context, new JniNativeApi(context), new NdkCrashFilesManager(new File(context.getFilesDir(), FILES_PATH))));
    }

    FirebaseCrashlyticsNdk(@NonNull NativeComponentController nativeComponentController) {
        this.controller = nativeComponentController;
    }

    public boolean hasCrashDataForSession(@NonNull String str) {
        return this.controller.hasCrashDataForSession(str);
    }

    public boolean openSession(String str) {
        boolean initialize = this.controller.initialize(str);
        if (!initialize) {
            Logger logger = Logger.getLogger();
            logger.w("Failed to initialize Crashlytics NDK for session " + str);
        }
        return initialize;
    }

    public boolean finalizeSession(@NonNull String str) {
        return this.controller.finalizeSession(str);
    }

    @NonNull
    public NativeSessionFileProvider getSessionFileProvider(@NonNull String str) {
        return new SessionFilesProvider(this.controller.getFilesForSession(str));
    }

    public void writeBeginSession(@NonNull String str, @NonNull String str2, long j) {
        this.controller.writeBeginSession(str, str2, j);
    }

    public void writeSessionApp(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, int i, @NonNull String str6) {
        this.controller.writeSessionApp(str, str2, str3, str4, str5, i, str6);
    }

    public void writeSessionOs(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z) {
        this.controller.writeSessionOs(str, str2, str3, z);
    }

    public void writeSessionDevice(@NonNull String str, int i, @NonNull String str2, int i2, long j, long j2, boolean z, int i3, @NonNull String str3, @NonNull String str4) {
        this.controller.writeSessionDevice(str, i, str2, i2, j, j2, z, i3, str3, str4);
    }
}
