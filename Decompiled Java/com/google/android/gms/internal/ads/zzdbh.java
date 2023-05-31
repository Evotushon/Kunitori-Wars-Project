package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdbh implements zzbqm, zzbrw, zzdcl {
    private final zzdfw zzgmy;
    private final AtomicReference<zzrh> zzgmz = new AtomicReference<>();
    private final AtomicReference<zzrm> zzgna = new AtomicReference<>();
    private final AtomicReference<zzbrw> zzgnb = new AtomicReference<>();
    private zzdbh zzgnc = null;

    public zzdbh(zzdfw zzdfw) {
        this.zzgmy = zzdfw;
    }

    public static zzdbh zza(zzdbh zzdbh) {
        zzdbh zzdbh2 = new zzdbh(zzdbh.zzgmy);
        zzdbh2.zzb((zzdcl) zzdbh);
        return zzdbh2;
    }

    public final void zzb(zzrh zzrh) {
        this.zzgmz.set(zzrh);
    }

    public final void zzb(zzrm zzrm) {
        this.zzgna.set(zzrm);
    }

    public final void zza(zzbrw zzbrw) {
        this.zzgnb.set(zzbrw);
    }

    public final void zzb(zzrg zzrg) {
        zzdbh zzdbh = this;
        while (true) {
            zzdbh zzdbh2 = zzdbh.zzgnc;
            if (zzdbh2 != null) {
                zzdbh = zzdbh2;
            } else {
                zzdce.zza(zzdbh.zzgmz, new zzdbk(zzrg));
                return;
            }
        }
    }

    public final void onAdFailedToLoad(int i) {
        zzdbh zzdbh = this;
        while (true) {
            zzdbh zzdbh2 = zzdbh.zzgnc;
            if (zzdbh2 != null) {
                zzdbh = zzdbh2;
            } else {
                zzdce.zza(zzdbh.zzgmz, new zzdbj(i));
                return;
            }
        }
    }

    public final void onAdClosed() {
        zzdbh zzdbh = this;
        while (true) {
            zzdbh zzdbh2 = zzdbh.zzgnc;
            if (zzdbh2 != null) {
                zzdbh = zzdbh2;
            } else {
                zzdbh.zzgmy.onAdClosed();
                zzdce.zza(zzdbh.zzgna, zzdbm.zzgne);
                return;
            }
        }
    }

    public final void zzaia() {
        zzdbh zzdbh = this;
        while (true) {
            zzdbh zzdbh2 = zzdbh.zzgnc;
            if (zzdbh2 != null) {
                zzdbh = zzdbh2;
            } else {
                zzdce.zza(zzdbh.zzgnb, zzdbl.zzgne);
                return;
            }
        }
    }

    public final void zzb(zzdcl zzdcl) {
        this.zzgnc = (zzdbh) zzdcl;
    }
}
