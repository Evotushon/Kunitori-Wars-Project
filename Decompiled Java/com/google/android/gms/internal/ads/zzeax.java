package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
interface zzeax {
    int getTag();

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> list) throws IOException;

    <T> T zza(zzebd<T> zzebd, zzdym zzdym) throws IOException;

    <T> void zza(List<T> list, zzebd<T> zzebd, zzdym zzdym) throws IOException;

    <K, V> void zza(Map<K, V> map, zzeac<K, V> zzeac, zzdym zzdym) throws IOException;

    @Deprecated
    <T> T zzb(zzebd<T> zzebd, zzdym zzdym) throws IOException;

    @Deprecated
    <T> void zzb(List<T> list, zzebd<T> zzebd, zzdym zzdym) throws IOException;

    long zzbbc() throws IOException;

    long zzbbd() throws IOException;

    int zzbbe() throws IOException;

    long zzbbf() throws IOException;

    int zzbbg() throws IOException;

    boolean zzbbh() throws IOException;

    String zzbbi() throws IOException;

    zzdxn zzbbj() throws IOException;

    int zzbbk() throws IOException;

    int zzbbl() throws IOException;

    int zzbbm() throws IOException;

    long zzbbn() throws IOException;

    int zzbbo() throws IOException;

    long zzbbp() throws IOException;

    int zzbbz() throws IOException;

    boolean zzbca() throws IOException;

    void zzj(List<Double> list) throws IOException;

    void zzk(List<Float> list) throws IOException;

    void zzl(List<Long> list) throws IOException;

    void zzm(List<Long> list) throws IOException;

    void zzn(List<Integer> list) throws IOException;

    void zzo(List<Long> list) throws IOException;

    void zzp(List<Integer> list) throws IOException;

    void zzq(List<Boolean> list) throws IOException;

    void zzr(List<String> list) throws IOException;

    void zzs(List<zzdxn> list) throws IOException;

    void zzt(List<Integer> list) throws IOException;

    void zzu(List<Integer> list) throws IOException;

    void zzv(List<Integer> list) throws IOException;

    void zzw(List<Long> list) throws IOException;

    void zzx(List<Integer> list) throws IOException;

    void zzy(List<Long> list) throws IOException;
}
