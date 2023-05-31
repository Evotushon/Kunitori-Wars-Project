package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebx extends zzebv<zzeby, zzeby> {
    zzebx() {
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzeax zzeax) {
        return false;
    }

    private static void zza(Object obj, zzeby zzeby) {
        ((zzdyz) obj).zzhsw = zzeby;
    }

    /* access modifiers changed from: package-private */
    public final void zzan(Object obj) {
        ((zzdyz) obj).zzhsw.zzban();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzax(Object obj) {
        return ((zzeby) obj).zzbda();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzbd(Object obj) {
        return ((zzeby) obj).zzbfh();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzj(Object obj, Object obj2) {
        zzeby zzeby = (zzeby) obj;
        zzeby zzeby2 = (zzeby) obj2;
        if (zzeby2.equals(zzeby.zzbff())) {
            return zzeby;
        }
        return zzeby.zza(zzeby, zzeby2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Object obj, zzecs zzecs) throws IOException {
        ((zzeby) obj).zza(zzecs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzecs zzecs) throws IOException {
        ((zzeby) obj).zzb(zzecs);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        zza(obj, (zzeby) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzbc(Object obj) {
        zzeby zzeby = ((zzdyz) obj).zzhsw;
        if (zzeby != zzeby.zzbff()) {
            return zzeby;
        }
        zzeby zzbfg = zzeby.zzbfg();
        zza(obj, zzbfg);
        return zzbfg;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzbb(Object obj) {
        return ((zzdyz) obj).zzhsw;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        zza(obj, (zzeby) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzav(Object obj) {
        zzeby zzeby = (zzeby) obj;
        zzeby.zzban();
        return zzeby;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzbfe() {
        return zzeby.zzbfg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, Object obj2) {
        ((zzeby) obj).zzd((i << 3) | 3, (zzeby) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, zzdxn zzdxn) {
        ((zzeby) obj).zzd((i << 3) | 2, zzdxn);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, int i, long j) {
        ((zzeby) obj).zzd((i << 3) | 1, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Object obj, int i, int i2) {
        ((zzeby) obj).zzd((i << 3) | 5, Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzeby) obj).zzd(i << 3, Long.valueOf(j));
    }
}
