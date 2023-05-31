package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzlv implements zzoa {
    private final Uri uri;
    private final zzno zzamy;
    private final /* synthetic */ zzls zzbab;
    private final zzly zzbaj;
    private final zzod zzbak;
    private final zzjm zzbbd = new zzjm();
    private volatile boolean zzbbe;
    private boolean zzbbf = true;
    private long zzbbg;
    /* access modifiers changed from: private */
    public long zzce = -1;

    public zzlv(zzls zzls, Uri uri2, zzno zzno, zzly zzly, zzod zzod) {
        this.zzbab = zzls;
        this.uri = (Uri) zzob.checkNotNull(uri2);
        this.zzamy = (zzno) zzob.checkNotNull(zzno);
        this.zzbaj = (zzly) zzob.checkNotNull(zzly);
        this.zzbak = zzod;
    }

    public final void zze(long j, long j2) {
        this.zzbbd.zzana = j;
        this.zzbbg = j2;
        this.zzbbf = true;
    }

    public final void cancelLoad() {
        this.zzbbe = true;
    }

    public final boolean zzhu() {
        return this.zzbbe;
    }

    public final void zzhv() throws IOException, InterruptedException {
        zzjd zzjd;
        int i = 0;
        while (i == 0 && !this.zzbbe) {
            try {
                long j = this.zzbbd.zzana;
                this.zzce = this.zzamy.zza(new zznp(this.uri, j, -1, this.zzbab.zzbag));
                if (this.zzce != -1) {
                    this.zzce += j;
                }
                zzjd = new zzjd(this.zzamy, j, this.zzce);
                try {
                    zzjg zza = this.zzbaj.zza(zzjd, this.zzamy.getUri());
                    if (this.zzbbf) {
                        zza.zzc(j, this.zzbbg);
                        this.zzbbf = false;
                    }
                    while (i == 0 && !this.zzbbe) {
                        this.zzbak.block();
                        i = zza.zza(zzjd, this.zzbbd);
                        if (zzjd.getPosition() > this.zzbab.zzbah + j) {
                            j = zzjd.getPosition();
                            this.zzbak.zzir();
                            this.zzbab.zzadx.post(this.zzbab.zzbam);
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.zzbbd.zzana = zzjd.getPosition();
                    }
                    zzop.zza(this.zzamy);
                } catch (Throwable th) {
                    th = th;
                    if (!(i == 1 || zzjd == null)) {
                        this.zzbbd.zzana = zzjd.getPosition();
                    }
                    zzop.zza(this.zzamy);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zzjd = null;
                this.zzbbd.zzana = zzjd.getPosition();
                zzop.zza(this.zzamy);
                throw th;
            }
        }
    }
}
