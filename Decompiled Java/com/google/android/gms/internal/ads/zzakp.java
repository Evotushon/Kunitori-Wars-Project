package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzakp<I, O> implements zzakc<I, O> {
    private final zzaja zzdby;
    /* access modifiers changed from: private */
    public final zzake<O> zzdcc;
    private final zzakh<I> zzdcd;
    private final String zzdce;

    zzakp(zzaja zzaja, String str, zzakh<I> zzakh, zzake<O> zzake) {
        this.zzdby = zzaja;
        this.zzdce = str;
        this.zzdcd = zzakh;
        this.zzdcc = zzake;
    }

    public final zzdof<O> zzi(I i) {
        zzazy zzazy = new zzazy();
        zzajr zzb = this.zzdby.zzb((zzdq) null);
        zzb.zza(new zzako(this, zzb, i, zzazy), new zzakr(this, zzazy, zzb));
        return zzazy;
    }

    /* access modifiers changed from: private */
    public final void zza(zzajr zzajr, zzajy zzajy, I i, zzazy<O> zzazy) {
        try {
            zzq.zzkv();
            String zzwp = zzawo.zzwp();
            zzafi.zzcyk.zza(zzwp, (zzagh) new zzakq(this, zzajr, zzazy));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", zzwp);
            jSONObject.put("args", this.zzdcd.zzj(i));
            zzajy.zzb(this.zzdce, jSONObject);
        } catch (Exception e) {
            zzazy.setException(e);
            zzawf.zzc("Unable to invokeJavascript", e);
            zzajr.release();
        } catch (Throwable th) {
            zzajr.release();
            throw th;
        }
    }

    public final zzdof<O> zzf(@Nullable I i) throws Exception {
        return zzi(i);
    }
}
