package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbs;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdjc implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final String packageName;
    private final HandlerThread zzdvv = new HandlerThread("GassClient");
    @VisibleForTesting
    private zzdjs zzgwu;
    private final String zzgwv;
    private final LinkedBlockingQueue<zzbs.zza> zzgww;

    public zzdjc(Context context, String str, String str2) {
        this.packageName = str;
        this.zzgwv = str2;
        this.zzdvv.start();
        this.zzgwu = new zzdjs(context, this.zzdvv.getLooper(), this, this);
        this.zzgww = new LinkedBlockingQueue<>();
        this.zzgwu.checkAvailabilityAndConnect();
    }

    public final zzbs.zza zzdn(int i) {
        zzbs.zza zza;
        try {
            zza = this.zzgww.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zza = null;
        }
        return zza == null ? zzatd() : zza;
    }

    private final zzdjz zzatc() {
        try {
            return this.zzgwu.zzatk();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            this.zzgww.put(zzatd());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        zzans();
        r3.zzdvv.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.zzgww.put(zzatd());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        zzans();
        r3.zzdvv.quit();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[ExcHandler: all (r4v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzdjz r4 = r3.zzatc()
            if (r4 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzdjv r0 = new com.google.android.gms.internal.ads.zzdjv     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.packageName     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.zzgwv     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzdjx r4 = r4.zza((com.google.android.gms.internal.ads.zzdjv) r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbs$zza r4 = r4.zzatl()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zzbs$zza> r0 = r3.zzgww     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r3.zzans()
            android.os.HandlerThread r4 = r3.zzdvv
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zzbs$zza> r4 = r3.zzgww     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbs$zza r0 = zzatd()     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            goto L_0x003a
        L_0x0031:
            r3.zzans()
            android.os.HandlerThread r0 = r3.zzdvv
            r0.quit()
            throw r4
        L_0x003a:
            r3.zzans()
            android.os.HandlerThread r4 = r3.zzdvv
            r4.quit()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjc.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzgww.put(zzatd());
        } catch (InterruptedException unused) {
        }
    }

    private final void zzans() {
        zzdjs zzdjs = this.zzgwu;
        if (zzdjs == null) {
            return;
        }
        if (zzdjs.isConnected() || this.zzgwu.isConnecting()) {
            this.zzgwu.disconnect();
        }
    }

    @VisibleForTesting
    private static zzbs.zza zzatd() {
        return (zzbs.zza) ((zzdyz) zzbs.zza.zzao().zzau(32768).zzbcx());
    }
}
