package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$CDavwmIaUoxPoo5Upyr-1hcsJXE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CrashlyticsReportJsonTransform$CDavwmIaUoxPoo5Upyr1hcsJXE implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ $$Lambda$CrashlyticsReportJsonTransform$CDavwmIaUoxPoo5Upyr1hcsJXE INSTANCE = new $$Lambda$CrashlyticsReportJsonTransform$CDavwmIaUoxPoo5Upyr1hcsJXE();

    private /* synthetic */ $$Lambda$CrashlyticsReportJsonTransform$CDavwmIaUoxPoo5Upyr1hcsJXE() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader);
    }
}
