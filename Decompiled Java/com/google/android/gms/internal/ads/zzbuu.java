package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbuu extends zzbtk<zzpt> implements zzpt {
    private final zzdei zzfhg;
    @GuardedBy("this")
    private Map<View, zzpp> zzflo = new WeakHashMap(1);
    private final Context zzur;

    public zzbuu(Context context, Set<zzbuv<zzpt>> set, zzdei zzdei) {
        super(set);
        this.zzur = context;
        this.zzfhg = zzdei;
    }

    public final synchronized void zza(zzpu zzpu) {
        zza(new zzbux(zzpu));
    }

    public final synchronized void zzq(View view) {
        zzpp zzpp = this.zzflo.get(view);
        if (zzpp == null) {
            zzpp = new zzpp(this.zzur, view);
            zzpp.zza((zzpt) this);
            this.zzflo.put(view, zzpp);
        }
        if (this.zzfhg != null && this.zzfhg.zzdmr) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclc)).booleanValue()) {
                zzpp.zzen(((Long) zzvh.zzpd().zzd(zzzx.zzclb)).longValue());
                return;
            }
        }
        zzpp.zzlu();
    }

    public final synchronized void zzr(View view) {
        if (this.zzflo.containsKey(view)) {
            this.zzflo.get(view).zzb(this);
            this.zzflo.remove(view);
        }
    }
}
