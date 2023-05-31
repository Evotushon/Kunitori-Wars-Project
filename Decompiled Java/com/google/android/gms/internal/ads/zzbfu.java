package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbfu implements zzdlk {
    private final Context zzcgz;
    private final String zzdcq;
    private final zzbfl zzegj;
    private final boolean zzegk;
    private final boolean zzegl;
    private final zzdq zzegm;
    private final zzazo zzegn;
    private final zzaak zzego;
    private final zzi zzegp;
    private final zza zzegq;
    private final zzsn zzegr;
    private final zzrp zzegs;
    private final boolean zzegt;

    zzbfu(Context context, zzbfl zzbfl, String str, boolean z, boolean z2, zzdq zzdq, zzazo zzazo, zzaak zzaak, zzi zzi, zza zza, zzsn zzsn, zzrp zzrp, boolean z3) {
        this.zzcgz = context;
        this.zzegj = zzbfl;
        this.zzdcq = str;
        this.zzegk = z;
        this.zzegl = z2;
        this.zzegm = zzdq;
        this.zzegn = zzazo;
        this.zzego = zzaak;
        this.zzegp = zzi;
        this.zzegq = zza;
        this.zzegr = zzsn;
        this.zzegs = zzrp;
        this.zzegt = z3;
    }

    public final Object get() {
        Context context = this.zzcgz;
        zzbfl zzbfl = this.zzegj;
        String str = this.zzdcq;
        boolean z = this.zzegk;
        boolean z2 = this.zzegl;
        zzdq zzdq = this.zzegm;
        zzazo zzazo = this.zzegn;
        zzaak zzaak = this.zzego;
        zzi zzi = this.zzegp;
        zza zza = this.zzegq;
        zzsn zzsn = this.zzegr;
        zzrp zzrp = this.zzegs;
        boolean z3 = this.zzegt;
        zzbfo zzbfo = new zzbfo();
        zzrp zzrp2 = zzrp;
        zzbft zzbft = new zzbft(new zzbfm(context), zzbfo, zzbfl, str, z, z2, zzdq, zzazo, zzaak, zzi, zza, zzsn, zzrp2, z3);
        zzbeh zzbeh = new zzbeh(zzbft);
        zzbft.setWebChromeClient(new zzbdn(zzbeh));
        zzbfo.zza((zzbdv) zzbeh, z2);
        return zzbeh;
    }
}
