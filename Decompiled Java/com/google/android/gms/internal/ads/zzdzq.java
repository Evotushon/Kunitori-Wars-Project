package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class zzdzq {
    private static final zzdym zzhnv = zzdym.zzbcg();
    private zzdxn zzhun;
    private volatile zzeah zzhuo;
    private volatile zzdxn zzhup;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdzq)) {
            return false;
        }
        zzdzq zzdzq = (zzdzq) obj;
        zzeah zzeah = this.zzhuo;
        zzeah zzeah2 = zzdzq.zzhuo;
        if (zzeah == null && zzeah2 == null) {
            return zzbai().equals(zzdzq.zzbai());
        }
        if (zzeah != null && zzeah2 != null) {
            return zzeah.equals(zzeah2);
        }
        if (zzeah != null) {
            return zzeah.equals(zzdzq.zzm(zzeah.zzbcy()));
        }
        return zzm(zzeah2.zzbcy()).equals(zzeah2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.zzeah zzm(com.google.android.gms.internal.ads.zzeah r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzeah r0 = r1.zzhuo
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzeah r0 = r1.zzhuo     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.zzhuo = r2     // Catch:{ zzdzh -> 0x0012 }
            com.google.android.gms.internal.ads.zzdxn r0 = com.google.android.gms.internal.ads.zzdxn.zzhoe     // Catch:{ zzdzh -> 0x0012 }
            r1.zzhup = r0     // Catch:{ zzdzh -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.zzhuo = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.ads.zzdxn r2 = com.google.android.gms.internal.ads.zzdxn.zzhoe     // Catch:{ all -> 0x001a }
            r1.zzhup = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.ads.zzeah r2 = r1.zzhuo
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdzq.zzm(com.google.android.gms.internal.ads.zzeah):com.google.android.gms.internal.ads.zzeah");
    }

    public final zzeah zzn(zzeah zzeah) {
        zzeah zzeah2 = this.zzhuo;
        this.zzhun = null;
        this.zzhup = null;
        this.zzhuo = zzeah;
        return zzeah2;
    }

    public final int zzbda() {
        if (this.zzhup != null) {
            return this.zzhup.size();
        }
        if (this.zzhuo != null) {
            return this.zzhuo.zzbda();
        }
        return 0;
    }

    public final zzdxn zzbai() {
        if (this.zzhup != null) {
            return this.zzhup;
        }
        synchronized (this) {
            if (this.zzhup != null) {
                zzdxn zzdxn = this.zzhup;
                return zzdxn;
            }
            if (this.zzhuo == null) {
                this.zzhup = zzdxn.zzhoe;
            } else {
                this.zzhup = this.zzhuo.zzbai();
            }
            zzdxn zzdxn2 = this.zzhup;
            return zzdxn2;
        }
    }
}
