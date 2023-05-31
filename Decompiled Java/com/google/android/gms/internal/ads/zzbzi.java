package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzi {
    zzads zzfps;
    zzadr zzfpt;
    zzaeg zzfpu;
    zzaef zzfpv;
    zzaht zzfpw;
    final SimpleArrayMap<String, zzady> zzfpx = new SimpleArrayMap<>();
    final SimpleArrayMap<String, zzadx> zzfpy = new SimpleArrayMap<>();

    public final zzbzi zzb(zzads zzads) {
        this.zzfps = zzads;
        return this;
    }

    public final zzbzi zzb(zzadr zzadr) {
        this.zzfpt = zzadr;
        return this;
    }

    public final zzbzi zzb(zzaeg zzaeg) {
        this.zzfpu = zzaeg;
        return this;
    }

    public final zzbzi zza(zzaef zzaef) {
        this.zzfpv = zzaef;
        return this;
    }

    public final zzbzi zzb(zzaht zzaht) {
        this.zzfpw = zzaht;
        return this;
    }

    public final zzbzi zzb(String str, zzady zzady, zzadx zzadx) {
        this.zzfpx.put(str, zzady);
        this.zzfpy.put(str, zzadx);
        return this;
    }

    public final zzbzg zzala() {
        return new zzbzg(this);
    }
}
