package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdct extends AdMetadataListener implements zzbqh, zzbqm, zzbqq, zzbrn, zzbsg, zzdcl {
    private final zzdfw zzgmy;
    private final AtomicReference<AdMetadataListener> zzgoj = new AtomicReference<>();
    private final AtomicReference<zzatb> zzgok = new AtomicReference<>();
    private final AtomicReference<zzasy> zzgol = new AtomicReference<>();
    private final AtomicReference<zzasb> zzgom = new AtomicReference<>();
    private final AtomicReference<zzatg> zzgon = new AtomicReference<>();
    private final AtomicReference<zzarw> zzgoo = new AtomicReference<>();
    private final AtomicReference<zzxd> zzgop = new AtomicReference<>();
    private zzdct zzgoq = null;

    public zzdct(zzdfw zzdfw) {
        this.zzgmy = zzdfw;
    }

    public static zzdct zza(zzdct zzdct) {
        zzdct zzdct2 = new zzdct(zzdct.zzgmy);
        zzdct2.zzb((zzdcl) zzdct);
        return zzdct2;
    }

    public final void zza(zzatb zzatb) {
        this.zzgok.set(zzatb);
    }

    public final void zzb(zzasy zzasy) {
        this.zzgol.set(zzasy);
    }

    public final void zzb(zzatg zzatg) {
        this.zzgon.set(zzatg);
    }

    public final void zza(AdMetadataListener adMetadataListener) {
        this.zzgoj.set(adMetadataListener);
    }

    public final void zzc(zzxd zzxd) {
        this.zzgop.set(zzxd);
    }

    @Deprecated
    public final void zzb(zzasb zzasb) {
        this.zzgom.set(zzasb);
    }

    @Deprecated
    public final void zzb(zzarw zzarw) {
        this.zzgoo.set(zzarw);
    }

    public final void onAdLoaded() {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgok, zzdcw.zzgne);
                zzdce.zza(zzdct.zzgom, zzdcv.zzgne);
                return;
            }
        }
    }

    public final void onAdFailedToLoad(int i) {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgok, new zzddg(i));
                zzdce.zza(zzdct.zzgom, new zzddf(i));
                return;
            }
        }
    }

    public final void onAdOpened() {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgol, zzddi.zzgne);
                zzdce.zza(zzdct.zzgom, zzddh.zzgne);
                return;
            }
        }
    }

    public final void onAdClosed() {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdct.zzgmy.onAdClosed();
                zzdce.zza(zzdct.zzgol, zzddk.zzgne);
                zzdce.zza(zzdct.zzgom, zzddj.zzgne);
                return;
            }
        }
    }

    public final void onAdLeftApplication() {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgom, zzddm.zzgne);
                return;
            }
        }
    }

    public final void onRewardedVideoStarted() {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgom, zzddl.zzgne);
                return;
            }
        }
    }

    public final void zzb(zzarr zzarr, String str, String str2) {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgol, new zzdcy(zzarr));
                zzdce.zza(zzdct.zzgon, new zzdcx(zzarr, str, str2));
                zzdce.zza(zzdct.zzgom, new zzdda(zzarr));
                zzdce.zza(zzdct.zzgoo, new zzdcz(zzarr, str, str2));
                return;
            }
        }
    }

    public final void onRewardedVideoCompleted() {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgom, zzddc.zzgne);
                return;
            }
        }
    }

    public final void zzco(int i) {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgol, new zzddb(i));
                return;
            }
        }
    }

    public final void onAdMetadataChanged() {
        zzdct zzdct = this.zzgoq;
        if (zzdct != null) {
            zzdct.onAdMetadataChanged();
        } else {
            zzdce.zza(this.zzgoj, zzdde.zzgne);
        }
    }

    public final void zzb(@NonNull zzum zzum) {
        zzdct zzdct = this;
        while (true) {
            zzdct zzdct2 = zzdct.zzgoq;
            if (zzdct2 != null) {
                zzdct = zzdct2;
            } else {
                zzdce.zza(zzdct.zzgop, new zzddd(zzum));
                return;
            }
        }
    }

    public final void zzb(zzdcl zzdcl) {
        this.zzgoq = (zzdct) zzdcl;
    }
}
