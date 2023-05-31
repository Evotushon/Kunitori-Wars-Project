package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdek {
    public final int responseCode;
    public final String zzcac;
    public final List<String> zzdds;
    public final String zzdmp;
    public final long zzfzs;
    public final int zzgqf;

    zzdek(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = "";
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str2 = str;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzayf.zza(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.zzdds = emptyList;
        this.zzgqf = i;
        this.zzcac = str;
        this.zzdmp = str2;
        this.responseCode = i2;
        this.zzfzs = j;
    }
}
