package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$dIOx2087eNrDPBVbiDN535D2ZNE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CrashlyticsReportJsonTransform$dIOx2087eNrDPBVbiDN535D2ZNE implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ $$Lambda$CrashlyticsReportJsonTransform$dIOx2087eNrDPBVbiDN535D2ZNE INSTANCE = new $$Lambda$CrashlyticsReportJsonTransform$dIOx2087eNrDPBVbiDN535D2ZNE();

    private /* synthetic */ $$Lambda$CrashlyticsReportJsonTransform$dIOx2087eNrDPBVbiDN535D2ZNE() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
    }
}
