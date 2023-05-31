package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzrr {
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    private final Runnable zzbrl = new zzru(this);
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable
    public zzsa zzbrm;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable
    public zzse zzbrn;
    @GuardedBy("lock")
    @Nullable
    private Context zzur;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initialize(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            android.content.Context r1 = r2.zzur     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.zzur = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzzx.zzcnw     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzd(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.connect()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzzx.zzcnv     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzd(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzrt r3 = new com.google.android.gms.internal.ads.zzrt     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzqf r1 = com.google.android.gms.ads.internal.zzq.zzky()     // Catch:{ all -> 0x0048 }
            r1.zza(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrr.initialize(android.content.Context):void");
    }

    public final void zzmt() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcnx)).booleanValue()) {
            synchronized (this.lock) {
                connect();
                zzq.zzkv();
                zzawo.zzdtx.removeCallbacks(this.zzbrl);
                zzq.zzkv();
                zzawo.zzdtx.postDelayed(this.zzbrl, ((Long) zzvh.zzpd().zzd(zzzx.zzcny)).longValue());
            }
        }
    }

    public final zzry zza(zzrz zzrz) {
        synchronized (this.lock) {
            if (this.zzbrn == null) {
                zzry zzry = new zzry();
                return zzry;
            }
            try {
                zzry zza = this.zzbrn.zza(zzrz);
                return zza;
            } catch (RemoteException e) {
                zzawf.zzc("Unable to call into cache service.", e);
                return new zzry();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            android.content.Context r1 = r3.zzur     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.zzsa r1 = r3.zzbrm     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0023
        L_0x000c:
            com.google.android.gms.internal.ads.zzrw r1 = new com.google.android.gms.internal.ads.zzrw     // Catch:{ all -> 0x0025 }
            r1.<init>(r3)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzrv r2 = new com.google.android.gms.internal.ads.zzrv     // Catch:{ all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzsa r1 = r3.zza((com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) r1, (com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) r2)     // Catch:{ all -> 0x0025 }
            r3.zzbrm = r1     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzsa r1 = r3.zzbrm     // Catch:{ all -> 0x0025 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrr.connect():void");
    }

    @VisibleForTesting
    private final synchronized zzsa zza(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzsa(this.zzur, zzq.zzlj().zzxg(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbrm != null) {
                if (this.zzbrm.isConnected() || this.zzbrm.isConnecting()) {
                    this.zzbrm.disconnect();
                }
                this.zzbrm = null;
                this.zzbrn = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
