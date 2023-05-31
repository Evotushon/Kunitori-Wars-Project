package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczc implements zzcye<zzcyz> {
    private final String packageName;
    private final zzdoe zzfrv;
    private final zzare zzgli;
    private final Context zzur;

    public zzczc(@Nullable zzare zzare, Context context, String str, zzdoe zzdoe) {
        this.zzgli = zzare;
        this.zzur = context;
        this.packageName = str;
        this.zzfrv = zzdoe;
    }

    public final zzdof<zzcyz> zzapb() {
        return this.zzfrv.zzd(new zzczb(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcyz zzapt() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzare zzare = this.zzgli;
        if (zzare != null) {
            zzare.zza(this.zzur, this.packageName, jSONObject);
        }
        return new zzcyz(jSONObject);
    }
}
