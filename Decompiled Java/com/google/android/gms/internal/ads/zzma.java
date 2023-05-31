package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzma implements zzmd, zzme {
    private final Uri uri;
    private final zzdkp zzada;
    private final zzhl zzade;
    private zzhj zzadl;
    private final int zzbac;
    private final zzlz zzbad;
    private zzmd zzbae;
    private final String zzbag = null;
    private final zznn zzbbk;
    private final zzjh zzbbl;
    private final int zzbbm;
    private boolean zzbbn;

    public zzma(Uri uri2, zznn zznn, zzjh zzjh, int i, zzdkp zzdkp, zzlz zzlz, String str, int i2) {
        this.uri = uri2;
        this.zzbbk = zznn;
        this.zzbbl = zzjh;
        this.zzbac = i;
        this.zzada = zzdkp;
        this.zzbad = zzlz;
        this.zzbbm = i2;
        this.zzade = new zzhl();
    }

    public final void zzhw() throws IOException {
    }

    public final void zza(zzgn zzgn, boolean z, zzmd zzmd) {
        this.zzbae = zzmd;
        this.zzadl = new zzms(-9223372036854775807L, false);
        zzmd.zzb(this.zzadl, (Object) null);
    }

    public final zzmc zza(int i, zznm zznm) {
        zzob.checkArgument(i == 0);
        return new zzls(this.uri, this.zzbbk.zzim(), this.zzbbl.zzgo(), this.zzbac, this.zzada, this.zzbad, this, zznm, (String) null, this.zzbbm);
    }

    public final void zzb(zzmc zzmc) {
        ((zzls) zzmc).release();
    }

    public final void zzhx() {
        this.zzbae = null;
    }

    public final void zzb(zzhj zzhj, Object obj) {
        boolean z = false;
        if (zzhj.zza(0, this.zzade, false).zzagy != -9223372036854775807L) {
            z = true;
        }
        if (!this.zzbbn || z) {
            this.zzadl = zzhj;
            this.zzbbn = z;
            this.zzbae.zzb(this.zzadl, (Object) null);
        }
    }
}
