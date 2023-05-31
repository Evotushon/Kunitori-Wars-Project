package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdem implements zzayk {
    @Nullable
    public final String zzdiu = this.zzgqg.optString("ad_base_url", (String) null);
    @Nullable
    public final String zzdiw = this.zzgqg.optString("ad_html", (String) null);
    public final JSONObject zzfnc = this.zzgqg.optJSONObject("ad_json");
    private final JSONObject zzgqg;

    zzdem(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        this.zzgqg = zzayf.zzc(jsonReader);
    }

    public final void zza(JsonWriter jsonWriter) throws IOException {
        zzayf.zza(jsonWriter, this.zzgqg);
    }
}
