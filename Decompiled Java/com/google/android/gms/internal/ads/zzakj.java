package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzakj {
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    public static final zzakg<JSONObject> zzdbu = new zzakl();
    public static final zzake<InputStream> zzdbv = zzaki.zzdbt;

    static final /* synthetic */ InputStream zze(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(UTF_8));
    }
}
