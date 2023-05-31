package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdeg {
    private final Object lock = new Object();
    private final Clock zzbmz;
    private volatile long zzdsj = 0;
    @GuardedBy("lock")
    private volatile int zzgpi = zzdef.zzgpe;

    public zzdeg(Clock clock) {
        this.zzbmz = clock;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzr(int r5, int r6) {
        /*
            r4 = this;
            r4.zzaqs()
            com.google.android.gms.common.util.Clock r0 = r4.zzbmz
            long r0 = r0.currentTimeMillis()
            java.lang.Object r2 = r4.lock
            monitor-enter(r2)
            int r3 = r4.zzgpi     // Catch:{ all -> 0x001e }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x0012:
            r4.zzgpi = r6     // Catch:{ all -> 0x001e }
            int r5 = r4.zzgpi     // Catch:{ all -> 0x001e }
            int r6 = com.google.android.gms.internal.ads.zzdef.zzgpg     // Catch:{ all -> 0x001e }
            if (r5 != r6) goto L_0x001c
            r4.zzdsj = r0     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdeg.zzr(int, int):void");
    }

    private final void zzaqs() {
        long currentTimeMillis = this.zzbmz.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzgpi == zzdef.zzgpg) {
                if (this.zzdsj + ((Long) zzvh.zzpd().zzd(zzzx.zzcqp)).longValue() <= currentTimeMillis) {
                    this.zzgpi = zzdef.zzgpe;
                }
            }
        }
    }

    public final void zzbn(boolean z) {
        if (z) {
            zzr(zzdef.zzgpe, zzdef.zzgpf);
        } else {
            zzr(zzdef.zzgpf, zzdef.zzgpe);
        }
    }

    public final boolean zzaqt() {
        boolean z;
        synchronized (this.lock) {
            zzaqs();
            z = this.zzgpi == zzdef.zzgpf;
        }
        return z;
    }

    public final boolean zzaqu() {
        boolean z;
        synchronized (this.lock) {
            zzaqs();
            z = this.zzgpi == zzdef.zzgpg;
        }
        return z;
    }

    public final void zzvg() {
        zzr(zzdef.zzgpf, zzdef.zzgpg);
    }
}
