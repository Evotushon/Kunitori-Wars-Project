package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbnf;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdgs<AdT extends zzbnf> {
    /* access modifiers changed from: private */
    public final zzdfz zzgnx;
    private final zzdfw zzgts;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public zzdgy zzgtt;
    @GuardedBy("this")
    private zzdof<zzdgk<AdT>> zzgtu;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public int zzgtv = zzdgi.zzgtg;
    /* access modifiers changed from: private */
    public final zzdgv<AdT> zzgtw;
    private final LinkedList<zzdgy> zzgtx;
    private final zzdnu<zzdgk<AdT>> zzgty = new zzdgt(this);

    public zzdgs(zzdfz zzdfz, zzdfw zzdfw, zzdgv<AdT> zzdgv) {
        this.zzgnx = zzdfz;
        this.zzgts = zzdfw;
        this.zzgtw = zzdgv;
        this.zzgtx = new LinkedList<>();
        this.zzgts.zza(new zzdgu(this));
    }

    public final void zzb(zzdgy zzdgy) {
        this.zzgtx.add(zzdgy);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzdof<com.google.android.gms.internal.ads.zzdgw<AdT>> zzc(com.google.android.gms.internal.ads.zzdgy r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzasc()     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)
            return r1
        L_0x000a:
            int r0 = com.google.android.gms.internal.ads.zzdgi.zzgti     // Catch:{ all -> 0x0044 }
            r3.zzgtv = r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdgy r0 = r3.zzgtt     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdgj r0 = r0.zzaql()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzdgj r0 = r4.zzaql()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzdgy r0 = r3.zzgtt     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdgj r0 = r0.zzaql()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdgj r2 = r4.zzaql()     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x002d
            goto L_0x0042
        L_0x002d:
            int r0 = com.google.android.gms.internal.ads.zzdgi.zzgth     // Catch:{ all -> 0x0044 }
            r3.zzgtv = r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdof<com.google.android.gms.internal.ads.zzdgk<AdT>> r0 = r3.zzgtu     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdgr r1 = new com.google.android.gms.internal.ads.zzdgr     // Catch:{ all -> 0x0044 }
            r1.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.Executor r4 = r4.getExecutor()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdof r4 = com.google.android.gms.internal.ads.zzdnt.zzb(r0, r1, (java.util.concurrent.Executor) r4)     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return r4
        L_0x0042:
            monitor-exit(r3)
            return r1
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdgs.zzc(com.google.android.gms.internal.ads.zzdgy):com.google.android.gms.internal.ads.zzdof");
    }

    /* access modifiers changed from: private */
    public final void zzd(zzdgy zzdgy) {
        while (zzasc()) {
            if (zzdgy != null || !this.zzgtx.isEmpty()) {
                if (zzdgy == null) {
                    zzdgy = this.zzgtx.remove();
                }
                if (zzdgy.zzaql() == null || !this.zzgnx.zzb(zzdgy.zzaql())) {
                    zzdgy = null;
                } else {
                    this.zzgtt = zzdgy.zzaqm();
                    this.zzgtu = this.zzgtw.zza(this.zzgtt);
                    zzdnt.zza(this.zzgtu, this.zzgty, zzdgy.getExecutor());
                    return;
                }
            } else {
                return;
            }
        }
        if (zzdgy != null) {
            this.zzgtx.add(zzdgy);
        }
    }

    private final boolean zzasc() {
        zzdof<zzdgk<AdT>> zzdof = this.zzgtu;
        return zzdof == null || zzdof.isDone();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzasd() {
        synchronized (this) {
            zzd(this.zzgtt);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzc(zzdgk zzdgk) throws Exception {
        return zzdnt.zzaj(new zzdgw(zzdgk, this.zzgtt));
    }
}
