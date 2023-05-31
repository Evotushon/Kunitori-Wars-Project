package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcum implements zzcye<Object> {
    private static final Object lock = new Object();
    private final String zzcei;
    private final String zzdjw;
    private final zzdeu zzfir;
    private final zzbop zzgii;
    private final zzdfj zzgij;

    public zzcum(String str, String str2, zzbop zzbop, zzdfj zzdfj, zzdeu zzdeu) {
        this.zzdjw = str;
        this.zzcei = str2;
        this.zzgii = zzbop;
        this.zzgij = zzdfj;
        this.zzfir = zzdeu;
    }

    public final zzdof<Object> zzapb() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcpx)).booleanValue()) {
            this.zzgii.zzf(this.zzfir.zzgqq);
            bundle.putAll(this.zzgij.zzare());
        }
        return zzdnt.zzaj(new zzcul(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcpx)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcpw)).booleanValue()) {
                synchronized (lock) {
                    this.zzgii.zzf(this.zzfir.zzgqq);
                    bundle2.putBundle("quality_signals", this.zzgij.zzare());
                }
            } else {
                this.zzgii.zzf(this.zzfir.zzgqq);
                bundle2.putBundle("quality_signals", this.zzgij.zzare());
            }
        }
        bundle2.putString("seq_num", this.zzdjw);
        bundle2.putString("session_id", this.zzcei);
    }
}
