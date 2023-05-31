package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$PcYtebWm8LLEihGxNBWQex7movQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CrashlyticsReportJsonTransform$PcYtebWm8LLEihGxNBWQex7movQ implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ $$Lambda$CrashlyticsReportJsonTransform$PcYtebWm8LLEihGxNBWQex7movQ INSTANCE = new $$Lambda$CrashlyticsReportJsonTransform$PcYtebWm8LLEihGxNBWQex7movQ();

    private /* synthetic */ $$Lambda$CrashlyticsReportJsonTransform$PcYtebWm8LLEihGxNBWQex7movQ() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseFile(jsonReader);
    }
}
