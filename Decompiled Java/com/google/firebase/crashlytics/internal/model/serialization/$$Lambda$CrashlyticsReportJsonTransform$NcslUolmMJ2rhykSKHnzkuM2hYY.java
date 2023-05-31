package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* renamed from: com.google.firebase.crashlytics.internal.model.serialization.-$$Lambda$CrashlyticsReportJsonTransform$NcslUolmMJ2rhykSKHnzkuM2hYY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CrashlyticsReportJsonTransform$NcslUolmMJ2rhykSKHnzkuM2hYY implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final /* synthetic */ $$Lambda$CrashlyticsReportJsonTransform$NcslUolmMJ2rhykSKHnzkuM2hYY INSTANCE = new $$Lambda$CrashlyticsReportJsonTransform$NcslUolmMJ2rhykSKHnzkuM2hYY();

    private /* synthetic */ $$Lambda$CrashlyticsReportJsonTransform$NcslUolmMJ2rhykSKHnzkuM2hYY() {
    }

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventThread(jsonReader);
    }
}
