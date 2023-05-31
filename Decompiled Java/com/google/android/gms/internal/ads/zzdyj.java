package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdyj implements zzecs {
    private final zzdyi zzhok;

    public static zzdyj zza(zzdyi zzdyi) {
        if (zzdyi.zzhpe != null) {
            return zzdyi.zzhpe;
        }
        return new zzdyj(zzdyi);
    }

    private zzdyj(zzdyi zzdyi) {
        this.zzhok = (zzdyi) zzdzc.zza(zzdyi, "output");
        this.zzhok.zzhpe = this;
    }

    public final int zzbcf() {
        return zzdyz.zzf.zzhtn;
    }

    public final void zzam(int i, int i2) throws IOException {
        this.zzhok.zzaf(i, i2);
    }

    public final void zzp(int i, long j) throws IOException {
        this.zzhok.zzh(i, j);
    }

    public final void zzq(int i, long j) throws IOException {
        this.zzhok.zzj(i, j);
    }

    public final void zza(int i, float f) throws IOException {
        this.zzhok.zza(i, f);
    }

    public final void zzb(int i, double d) throws IOException {
        this.zzhok.zzb(i, d);
    }

    public final void zzan(int i, int i2) throws IOException {
        this.zzhok.zzac(i, i2);
    }

    public final void zzh(int i, long j) throws IOException {
        this.zzhok.zzh(i, j);
    }

    public final void zzac(int i, int i2) throws IOException {
        this.zzhok.zzac(i, i2);
    }

    public final void zzj(int i, long j) throws IOException {
        this.zzhok.zzj(i, j);
    }

    public final void zzaf(int i, int i2) throws IOException {
        this.zzhok.zzaf(i, i2);
    }

    public final void zzh(int i, boolean z) throws IOException {
        this.zzhok.zzh(i, z);
    }

    public final void zzf(int i, String str) throws IOException {
        this.zzhok.zzf(i, str);
    }

    public final void zza(int i, zzdxn zzdxn) throws IOException {
        this.zzhok.zza(i, zzdxn);
    }

    public final void zzad(int i, int i2) throws IOException {
        this.zzhok.zzad(i, i2);
    }

    public final void zzae(int i, int i2) throws IOException {
        this.zzhok.zzae(i, i2);
    }

    public final void zzi(int i, long j) throws IOException {
        this.zzhok.zzi(i, j);
    }

    public final void zza(int i, Object obj, zzebd zzebd) throws IOException {
        this.zzhok.zza(i, (zzeah) obj, zzebd);
    }

    public final void zzb(int i, Object obj, zzebd zzebd) throws IOException {
        zzdyi zzdyi = this.zzhok;
        zzdyi.zzab(i, 3);
        zzebd.zza((zzeah) obj, zzdyi.zzhpe);
        zzdyi.zzab(i, 4);
    }

    public final void zzgi(int i) throws IOException {
        this.zzhok.zzab(i, 3);
    }

    public final void zzgj(int i) throws IOException {
        this.zzhok.zzab(i, 4);
    }

    public final void zzc(int i, Object obj) throws IOException {
        if (obj instanceof zzdxn) {
            this.zzhok.zzb(i, (zzdxn) obj);
        } else {
            this.zzhok.zzb(i, (zzeah) obj);
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzga(list.get(i4).intValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfv(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzac(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzgd(list.get(i4).intValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfy(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzaf(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzfk(list.get(i4).longValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfh(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzh(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzfl(list.get(i4).longValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfh(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzh(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzfn(list.get(i4).longValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfj(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzj(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzg(list.get(i4).floatValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzf(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzc(list.get(i4).doubleValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzb(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzb(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzgf(list.get(i4).intValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfv(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzac(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzbq(list.get(i4).booleanValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzbp(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzh(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzdzs) {
            zzdzs zzdzs = (zzdzs) list;
            while (i2 < list.size()) {
                Object zzgm = zzdzs.zzgm(i2);
                if (zzgm instanceof String) {
                    this.zzhok.zzf(i, (String) zzgm);
                } else {
                    this.zzhok.zza(i, (zzdxn) zzgm);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzf(i, list.get(i2));
            i2++;
        }
    }

    public final void zzb(int i, List<zzdxn> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzhok.zza(i, list.get(i2));
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzgb(list.get(i4).intValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfw(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzad(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzge(list.get(i4).intValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfy(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzaf(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzfo(list.get(i4).longValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfj(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzj(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzgc(list.get(i4).intValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfx(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzae(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhok.zzab(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdyi.zzfm(list.get(i4).longValue());
            }
            this.zzhok.zzfw(i3);
            while (i2 < list.size()) {
                this.zzhok.zzfi(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhok.zzi(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zza(int i, List<?> list, zzebd zzebd) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, (Object) list.get(i2), zzebd);
        }
    }

    public final void zzb(int i, List<?> list, zzebd zzebd) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, (Object) list.get(i2), zzebd);
        }
    }

    public final <K, V> void zza(int i, zzeac<K, V> zzeac, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.zzhok.zzab(i, 2);
            this.zzhok.zzfw(zzdzz.zza(zzeac, next.getKey(), next.getValue()));
            zzdzz.zza(this.zzhok, zzeac, next.getKey(), next.getValue());
        }
    }
}
