package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebf {
    private static final Class<?> zzhwt = zzbeu();
    private static final zzebv<?, ?> zzhwu = zzbs(false);
    private static final zzebv<?, ?> zzhwv = zzbs(true);
    private static final zzebv<?, ?> zzhww = new zzebx();

    public static void zzi(Class<?> cls) {
        Class<?> cls2;
        if (!zzdyz.class.isAssignableFrom(cls) && (cls2 = zzhwt) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzg(i, list, z);
        }
    }

    public static void zzb(int i, List<Float> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zza(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzb(i, list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzecs zzecs, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzi(i, list, z);
        }
    }

    public static void zza(int i, List<String> list, zzecs zzecs) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zza(i, list);
        }
    }

    public static void zzb(int i, List<zzdxn> list, zzecs zzecs) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzb(i, list);
        }
    }

    public static void zza(int i, List<?> list, zzecs zzecs, zzebd zzebd) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zza(i, list, zzebd);
        }
    }

    public static void zzb(int i, List<?> list, zzecs zzecs, zzebd zzebd) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzecs.zzb(i, list, zzebd);
        }
    }

    static int zzz(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdzv) {
            zzdzv zzdzv = (zzdzv) list;
            i = 0;
            while (i2 < size) {
                i += zzdyi.zzfk(zzdzv.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdyi.zzfk(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzz(list) + (list.size() * zzdyi.zzfz(i));
    }

    static int zzaa(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdzv) {
            zzdzv zzdzv = (zzdzv) list;
            i = 0;
            while (i2 < size) {
                i += zzdyi.zzfl(zzdzv.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdyi.zzfl(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaa(list) + (size * zzdyi.zzfz(i));
    }

    static int zzab(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdzv) {
            zzdzv zzdzv = (zzdzv) list;
            i = 0;
            while (i2 < size) {
                i += zzdyi.zzfm(zzdzv.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdyi.zzfm(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzab(list) + (size * zzdyi.zzfz(i));
    }

    static int zzac(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            i = 0;
            while (i2 < size) {
                i += zzdyi.zzgf(zzdza.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdyi.zzgf(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzac(list) + (size * zzdyi.zzfz(i));
    }

    static int zzad(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            i = 0;
            while (i2 < size) {
                i += zzdyi.zzga(zzdza.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdyi.zzga(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzad(list) + (size * zzdyi.zzfz(i));
    }

    static int zzae(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            i = 0;
            while (i2 < size) {
                i += zzdyi.zzgb(zzdza.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdyi.zzgb(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzae(list) + (size * zzdyi.zzfz(i));
    }

    static int zzaf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            i = 0;
            while (i2 < size) {
                i += zzdyi.zzgc(zzdza.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzdyi.zzgc(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaf(list) + (size * zzdyi.zzfz(i));
    }

    static int zzag(List<?> list) {
        return list.size() << 2;
    }

    static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdyi.zzaj(i, 0);
    }

    static int zzah(List<?> list) {
        return list.size() << 3;
    }

    static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdyi.zzn(i, 0);
    }

    static int zzai(List<?> list) {
        return list.size();
    }

    static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzdyi.zzi(i, true);
    }

    static int zzc(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzfz = zzdyi.zzfz(i) * size;
        if (list instanceof zzdzs) {
            zzdzs zzdzs = (zzdzs) list;
            while (i4 < size) {
                Object zzgm = zzdzs.zzgm(i4);
                if (zzgm instanceof zzdxn) {
                    i3 = zzdyi.zzai((zzdxn) zzgm);
                } else {
                    i3 = zzdyi.zzhk((String) zzgm);
                }
                zzfz += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzdxn) {
                    i2 = zzdyi.zzai((zzdxn) obj);
                } else {
                    i2 = zzdyi.zzhk((String) obj);
                }
                zzfz += i2;
                i4++;
            }
        }
        return zzfz;
    }

    static int zzc(int i, Object obj, zzebd zzebd) {
        if (obj instanceof zzdzq) {
            return zzdyi.zza(i, (zzdzq) obj);
        }
        return zzdyi.zzb(i, (zzeah) obj, zzebd);
    }

    static int zzc(int i, List<?> list, zzebd zzebd) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzfz = zzdyi.zzfz(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzdzq) {
                i2 = zzdyi.zza((zzdzq) obj);
            } else {
                i2 = zzdyi.zzb((zzeah) obj, zzebd);
            }
            zzfz += i2;
        }
        return zzfz;
    }

    static int zzd(int i, List<zzdxn> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzfz = size * zzdyi.zzfz(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfz += zzdyi.zzai(list.get(i2));
        }
        return zzfz;
    }

    static int zzd(int i, List<zzeah> list, zzebd zzebd) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzdyi.zzc(i, list.get(i3), zzebd);
        }
        return i2;
    }

    public static zzebv<?, ?> zzber() {
        return zzhwu;
    }

    public static zzebv<?, ?> zzbes() {
        return zzhwv;
    }

    public static zzebv<?, ?> zzbet() {
        return zzhww;
    }

    private static zzebv<?, ?> zzbs(boolean z) {
        try {
            Class<?> zzbev = zzbev();
            if (zzbev == null) {
                return null;
            }
            return (zzebv) zzbev.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbeu() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbev() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzg(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zza(zzeae zzeae, T t, T t2, long j) {
        zzecb.zza((Object) t, j, zzeae.zze(zzecb.zzp(t, j), zzecb.zzp(t2, j)));
    }

    static <T, FT extends zzdyr<FT>> void zza(zzdyo<FT> zzdyo, T t, T t2) {
        zzdyp<FT> zzal = zzdyo.zzal(t2);
        if (!zzal.zzhpu.isEmpty()) {
            zzdyo.zzam(t).zza(zzal);
        }
    }

    static <T, UT, UB> void zza(zzebv<UT, UB> zzebv, T t, T t2) {
        zzebv.zzh(t, zzebv.zzj(zzebv.zzbb(t), zzebv.zzbb(t2)));
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzdzd zzdzd, UB ub, zzebv<UT, UB> zzebv) {
        UB ub2;
        if (zzdzd == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!zzdzd.zzf(intValue)) {
                        ub = zza(i, intValue, ub2, zzebv);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (zzdzd.zzf(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = zza(i, intValue2, ub2, zzebv);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    static <UT, UB> UB zza(int i, int i2, UB ub, zzebv<UT, UB> zzebv) {
        if (ub == null) {
            ub = zzebv.zzbfe();
        }
        zzebv.zza(ub, i, (long) i2);
        return ub;
    }
}
