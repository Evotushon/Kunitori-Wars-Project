package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdje implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final long startTime;
    private final HandlerThread zzdvv;
    @VisibleForTesting
    private zzdjs zzgwu;
    private final LinkedBlockingQueue<zzdke> zzgww;
    private final String zzgwx;
    private final String zzgwy;
    private final int zzgwz = 1;
    private final zzdix zzuu;

    public zzdje(Context context, int i, String str, String str2, String str3, zzdix zzdix) {
        this.zzgwx = str;
        this.zzgwy = str2;
        this.zzuu = zzdix;
        this.zzdvv = new HandlerThread("GassDGClient");
        this.zzdvv.start();
        this.startTime = System.currentTimeMillis();
        this.zzgwu = new zzdjs(context, this.zzdvv.getLooper(), this, this);
        this.zzgww = new LinkedBlockingQueue<>();
        this.zzgwu.checkAvailabilityAndConnect();
    }

    public final zzdke zzdo(int i) {
        zzdke zzdke;
        try {
            zzdke = this.zzgww.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzb(2009, this.startTime, e);
            zzdke = null;
        }
        zzb(3004, this.startTime, (Exception) null);
        return zzdke == null ? zzate() : zzdke;
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
            this.zzgww.put(zzate());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnected(Bundle bundle) {
        zzdjz zzatc = zzatc();
        if (zzatc != null) {
            try {
                this.zzgww.put(zzatc.zza(new zzdkc(this.zzgwz, this.zzgwx, this.zzgwy)));
            } catch (Throwable th) {
                zzb(2010, this.startTime, new Exception(th));
            } finally {
                zzans();
                this.zzdvv.quit();
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzgww.put(zzate());
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
    private static zzdke zzate() {
        return new zzdke((byte[]) null, 1);
    }

    private final void zzb(int i, long j, Exception exc) {
        zzdix zzdix = this.zzuu;
        if (zzdix != null) {
            zzdix.zza(i, System.currentTimeMillis() - j, exc);
        }
    }
}
