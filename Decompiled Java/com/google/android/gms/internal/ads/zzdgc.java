package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzsz;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdgc implements zzdfz {
    @GuardedBy("this")
    private final ConcurrentHashMap<zzdgj, zzdga> zzgry;
    private zzdgg zzgrz;
    private zzdge zzgsa = new zzdge();

    public zzdgc(zzdgg zzdgg) {
        this.zzgry = new ConcurrentHashMap<>(zzdgg.zzgst);
        this.zzgrz = zzdgg;
    }

    @Nullable
    public final synchronized zzdgk<?> zza(zzdgj zzdgj) {
        zzdgk<?> zzdgk;
        zzdga zzdga = this.zzgry.get(zzdgj);
        zzdgk = null;
        if (zzdga != null) {
            zzdgk = zzdga.zzarj();
            if (zzdgk == null) {
                this.zzgsa.zzarr();
            }
            zza(zzdgk, zzdga.zzarn());
        } else {
            this.zzgsa.zzarq();
            zza((zzdgk<?>) null, (zzdha) null);
        }
        return zzdgk;
    }

    public final synchronized boolean zza(zzdgj zzdgj, zzdgk<?> zzdgk) {
        boolean zzb;
        zzdga zzdga = this.zzgry.get(zzdgj);
        zzdgk.zzgtm = zzq.zzlc().currentTimeMillis();
        if (zzdga == null) {
            zzdga = new zzdga(this.zzgrz.zzgst, this.zzgrz.zzgsu * 1000);
            if (this.zzgry.size() == this.zzgrz.zzgss) {
                int i = zzdgb.zzgrx[this.zzgrz.zzgsx - 1];
                long j = Long.MAX_VALUE;
                zzdgj zzdgj2 = null;
                if (i == 1) {
                    for (Map.Entry next : this.zzgry.entrySet()) {
                        if (((zzdga) next.getValue()).getCreationTimeMillis() < j) {
                            j = ((zzdga) next.getValue()).getCreationTimeMillis();
                            zzdgj2 = (zzdgj) next.getKey();
                        }
                    }
                    if (zzdgj2 != null) {
                        this.zzgry.remove(zzdgj2);
                    }
                } else if (i == 2) {
                    for (Map.Entry next2 : this.zzgry.entrySet()) {
                        if (((zzdga) next2.getValue()).zzark() < j) {
                            j = ((zzdga) next2.getValue()).zzark();
                            zzdgj2 = (zzdgj) next2.getKey();
                        }
                    }
                    if (zzdgj2 != null) {
                        this.zzgry.remove(zzdgj2);
                    }
                } else if (i == 3) {
                    int i2 = Integer.MAX_VALUE;
                    for (Map.Entry next3 : this.zzgry.entrySet()) {
                        if (((zzdga) next3.getValue()).zzarl() < i2) {
                            i2 = ((zzdga) next3.getValue()).zzarl();
                            zzdgj2 = (zzdgj) next3.getKey();
                        }
                    }
                    if (zzdgj2 != null) {
                        this.zzgry.remove(zzdgj2);
                    }
                }
                this.zzgsa.zzart();
            }
            this.zzgry.put(zzdgj, zzdga);
            this.zzgsa.zzars();
        }
        zzb = zzdga.zzb(zzdgk);
        this.zzgsa.zzaru();
        zzdgd zzarv = this.zzgsa.zzarv();
        zzdha zzarn = zzdga.zzarn();
        if (zzdgk != null) {
            zzdgk.zzgtk.zzahr().zzb((zzsz.zza) ((zzdyz) zzsz.zza.zzne().zza(zzsz.zza.C0020zza.zznc().zzb(zzsz.zza.zzc.IN_MEMORY).zza(zzsz.zza.zze.zzni().zzu(zzarv.zzgsb).zzv(zzarv.zzgsc).zzbv(zzarn.zzgug))).zzbcx()));
        }
        dumpToLog();
        return zzb;
    }

    public final synchronized boolean zzb(zzdgj zzdgj) {
        zzdga zzdga = this.zzgry.get(zzdgj);
        if (zzdga == null) {
            return true;
        }
        if (zzdga.size() < this.zzgrz.zzgst) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final zzdgj zza(zzuh zzuh, String str, zzur zzur) {
        return new zzdgm(zzuh, str, new zzarf(this.zzgrz.zzur).zzul().zzdnt, this.zzgrz.zzgsv, zzur);
    }

    public final zzdgg zzari() {
        return this.zzgrz;
    }

    private final void zza(zzdgk<?> zzdgk, zzdha zzdha) {
        if (zzdgk != null) {
            zzdgk.zzgtk.zzahr().zza((zzsz.zza) ((zzdyz) zzsz.zza.zzne().zza(zzsz.zza.C0020zza.zznc().zzb(zzsz.zza.zzc.IN_MEMORY).zza(zzsz.zza.zzd.zzng().zzt(zzdha.zzguh).zzbu(zzdha.zzgug))).zzbcx()));
        }
        dumpToLog();
    }

    private final void dumpToLog() {
        if (zzdgg.zzarx()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzgrz.zzgsr);
            sb.append(" PoolCollection");
            sb.append(this.zzgsa.zzarw());
            int i = 0;
            for (Map.Entry next : this.zzgry.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(next.getValue());
                sb.append("#");
                sb.append(((zzdgj) next.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzdga) next.getValue()).size(); i2++) {
                    sb.append("[O]");
                }
                for (int size = ((zzdga) next.getValue()).size(); size < this.zzgrz.zzgst; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzdga) next.getValue()).zzarm());
                sb.append("\n");
            }
            while (i < this.zzgrz.zzgss) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzawf.zzeb(sb.toString());
        }
    }
}
