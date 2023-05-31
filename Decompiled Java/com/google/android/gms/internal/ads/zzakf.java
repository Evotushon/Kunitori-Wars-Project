package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzakf {
    private final Object zzdbp = new Object();
    private final Object zzdbq = new Object();
    @GuardedBy("lockClient")
    private zzakk zzdbr;
    @GuardedBy("lockService")
    private zzakk zzdbs;

    public final zzakk zza(Context context, zzazo zzazo) {
        zzakk zzakk;
        synchronized (this.zzdbq) {
            if (this.zzdbs == null) {
                this.zzdbs = new zzakk(zzm(context), zzazo, zzabr.zzcvs.get());
            }
            zzakk = this.zzdbs;
        }
        return zzakk;
    }

    public final zzakk zzb(Context context, zzazo zzazo) {
        zzakk zzakk;
        synchronized (this.zzdbp) {
            if (this.zzdbr == null) {
                this.zzdbr = new zzakk(zzm(context), zzazo, (String) zzvh.zzpd().zzd(zzzx.zzcha));
            }
            zzakk = this.zzdbr;
        }
        return zzakk;
    }

    private static Context zzm(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
