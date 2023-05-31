package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public interface zzhe extends zzgp {
    void disable();

    int getState();

    int getTrackType();

    boolean isReady();

    void setIndex(int i);

    void start() throws zzgk;

    void stop() throws zzgk;

    void zza(zzhg zzhg, zzgz[] zzgzArr, zzmn zzmn, long j, boolean z, long j2) throws zzgk;

    void zza(zzgz[] zzgzArr, zzmn zzmn, long j) throws zzgk;

    void zzb(long j, long j2) throws zzgk;

    void zzdm(long j) throws zzgk;

    zzhh zzdu();

    zzof zzdv();

    zzmn zzdw();

    boolean zzdx();

    void zzdy();

    boolean zzdz();

    void zzea() throws IOException;

    boolean zzez();
}
