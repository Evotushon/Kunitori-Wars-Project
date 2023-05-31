package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkk implements zzpt {
    private final Clock zzbmz;
    private boolean zzbsm = false;
    private zzbdv zzdae;
    private final zzbjz zzfel;
    private final Executor zzfeo;
    private zzbkd zzfeq = new zzbkd();
    private boolean zzffk = false;

    public zzbkk(Executor executor, zzbjz zzbjz, Clock clock) {
        this.zzfeo = executor;
        this.zzfel = zzbjz;
        this.zzbmz = clock;
    }

    private final void zzafz() {
        try {
            JSONObject zza = this.zzfel.zzj(this.zzfeq);
            if (this.zzdae != null) {
                this.zzfeo.execute(new zzbkn(this, zza));
            }
        } catch (JSONException e) {
            zzawf.zza("Failed to call video active view js", e);
        }
    }

    public final void zza(zzpu zzpu) {
        this.zzfeq.zzbnz = this.zzffk ? false : zzpu.zzbnz;
        this.zzfeq.timestamp = this.zzbmz.elapsedRealtime();
        this.zzfeq.zzffb = zzpu;
        if (this.zzbsm) {
            zzafz();
        }
    }

    public final void zzg(zzbdv zzbdv) {
        this.zzdae = zzbdv;
    }

    public final void disable() {
        this.zzbsm = false;
    }

    public final void enable() {
        this.zzbsm = true;
        zzafz();
    }

    public final void zzbf(boolean z) {
        this.zzffk = z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(JSONObject jSONObject) {
        this.zzdae.zzb("AFMA_updateActiveView", jSONObject);
    }
}
