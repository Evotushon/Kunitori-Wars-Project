package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdna;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
abstract class zzdnf<V, C> extends zzdna<V, C> {
    private List<zzdla<V>> zzhco;

    zzdnf(zzdlq<? extends zzdof<? extends V>> zzdlq, boolean z) {
        super(zzdlq, true, true);
        List<zzdla<V>> list;
        if (zzdlq.isEmpty()) {
            list = zzdlr.zzauc();
        } else {
            list = zzdlz.zzdz(zzdlq.size());
        }
        this.zzhco = list;
        for (int i = 0; i < zzdlq.size(); i++) {
            this.zzhco.add((Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract C zzi(List<zzdla<V>> list);

    /* access modifiers changed from: package-private */
    public final void zzb(int i, @NullableDecl V v) {
        List<zzdla<V>> list = this.zzhco;
        if (list != null) {
            list.set(i, zzdla.zzac(v));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaun() {
        List<zzdla<V>> list = this.zzhco;
        if (list != null) {
            set(zzi(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzdna.zza zza) {
        super.zza(zza);
        this.zzhco = null;
    }
}
