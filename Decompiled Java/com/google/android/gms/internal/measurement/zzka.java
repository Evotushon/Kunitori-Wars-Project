package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.6.0 */
interface zzka {
    int zza() throws IOException;

    <T> T zza(zzjz<T> zzjz, zzhm zzhm) throws IOException;

    void zza(List<Double> list) throws IOException;

    <T> void zza(List<T> list, zzjz<T> zzjz, zzhm zzhm) throws IOException;

    <K, V> void zza(Map<K, V> map, zzjc<K, V> zzjc, zzhm zzhm) throws IOException;

    int zzb();

    @Deprecated
    <T> T zzb(zzjz<T> zzjz, zzhm zzhm) throws IOException;

    void zzb(List<Float> list) throws IOException;

    @Deprecated
    <T> void zzb(List<T> list, zzjz<T> zzjz, zzhm zzhm) throws IOException;

    void zzc(List<Long> list) throws IOException;

    boolean zzc() throws IOException;

    double zzd() throws IOException;

    void zzd(List<Long> list) throws IOException;

    float zze() throws IOException;

    void zze(List<Integer> list) throws IOException;

    long zzf() throws IOException;

    void zzf(List<Long> list) throws IOException;

    long zzg() throws IOException;

    void zzg(List<Integer> list) throws IOException;

    int zzh() throws IOException;

    void zzh(List<Boolean> list) throws IOException;

    long zzi() throws IOException;

    void zzi(List<String> list) throws IOException;

    int zzj() throws IOException;

    void zzj(List<String> list) throws IOException;

    void zzk(List<zzgr> list) throws IOException;

    boolean zzk() throws IOException;

    String zzl() throws IOException;

    void zzl(List<Integer> list) throws IOException;

    String zzm() throws IOException;

    void zzm(List<Integer> list) throws IOException;

    zzgr zzn() throws IOException;

    void zzn(List<Integer> list) throws IOException;

    int zzo() throws IOException;

    void zzo(List<Long> list) throws IOException;

    int zzp() throws IOException;

    void zzp(List<Integer> list) throws IOException;

    int zzq() throws IOException;

    void zzq(List<Long> list) throws IOException;

    long zzr() throws IOException;

    int zzs() throws IOException;

    long zzt() throws IOException;
}
