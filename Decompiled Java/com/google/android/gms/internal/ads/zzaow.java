package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzaow {
    private final zzbdv zzdae;
    private final String zzdhh;

    public zzaow(zzbdv zzbdv) {
        this(zzbdv, "");
    }

    public zzaow(zzbdv zzbdv, String str) {
        this.zzdae = zzbdv;
        this.zzdhh = str;
    }

    public final void zzdt(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzdhh);
            if (this.zzdae != null) {
                this.zzdae.zza("onError", put);
            }
        } catch (JSONException e) {
            zzawf.zzc("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzdu(String str) {
        try {
            this.zzdae.zza("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zzawf.zzc("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zza(int i, int i2, int i3, int i4) {
        try {
            this.zzdae.zza("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzawf.zzc("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        try {
            this.zzdae.zza("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzawf.zzc("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzdv(String str) {
        try {
            this.zzdae.zza("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zzawf.zzc("Error occurred while dispatching state change.", e);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zzdae.zza("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            zzawf.zzc("Error occurred while obtaining screen information.", e);
        }
    }
}
