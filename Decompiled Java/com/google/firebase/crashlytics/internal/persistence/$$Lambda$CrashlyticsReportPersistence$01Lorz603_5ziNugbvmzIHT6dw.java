package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.google.firebase.crashlytics.internal.persistence.-$$Lambda$CrashlyticsReportPersistence$01Lorz603_-5ziNugbvmzIHT6dw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CrashlyticsReportPersistence$01Lorz603_5ziNugbvmzIHT6dw implements Comparator {
    public static final /* synthetic */ $$Lambda$CrashlyticsReportPersistence$01Lorz603_5ziNugbvmzIHT6dw INSTANCE = new $$Lambda$CrashlyticsReportPersistence$01Lorz603_5ziNugbvmzIHT6dw();

    private /* synthetic */ $$Lambda$CrashlyticsReportPersistence$01Lorz603_5ziNugbvmzIHT6dw() {
    }

    public final int compare(Object obj, Object obj2) {
        return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
    }
}
