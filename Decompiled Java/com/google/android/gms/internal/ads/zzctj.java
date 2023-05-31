package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.zzq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctj {
    public final String zzghm;
    public String zzghn;
    private Bundle zzgho = new Bundle();

    public zzctj(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        Map hashMap = new HashMap();
        jsonReader.beginObject();
        Map map = hashMap;
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c = 1;
                }
            } else if (nextName.equals("params")) {
                c = 0;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                map = zzayf.zzb(jsonReader);
            }
        }
        this.zzghm = str;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                this.zzgho.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzctj zzn(Bundle bundle) {
        try {
            this.zzghn = zzq.zzkv().zzd(bundle).toString();
        } catch (JSONException unused) {
            this.zzghn = "{}";
        }
        return this;
    }
}
