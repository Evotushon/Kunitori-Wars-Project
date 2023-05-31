package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbeq extends zzxi {
    private final Object lock = new Object();
    @GuardedBy("lock")
    private boolean zzace;
    @GuardedBy("lock")
    private boolean zzacf;
    @GuardedBy("lock")
    private int zzadh;
    @GuardedBy("lock")
    private zzxk zzdek;
    private final zzbbm zzdza;
    private final boolean zzeil;
    private final boolean zzeim;
    @GuardedBy("lock")
    private boolean zzein;
    @GuardedBy("lock")
    private boolean zzeio = true;
    @GuardedBy("lock")
    private float zzeip;
    @GuardedBy("lock")
    private float zzeiq;
    @GuardedBy("lock")
    private float zzeir;
    @GuardedBy("lock")
    private zzaed zzeis;

    public zzbeq(zzbbm zzbbm, float f, boolean z, boolean z2) {
        this.zzdza = zzbbm;
        this.zzeip = f;
        this.zzeil = z;
        this.zzeim = z2;
    }

    public final void play() {
        zzf("play", (Map<String, String>) null);
    }

    public final void pause() {
        zzf("pause", (Map<String, String>) null);
    }

    public final void stop() {
        zzf("stop", (Map<String, String>) null);
    }

    public final void mute(boolean z) {
        zzf(z ? "mute" : "unmute", (Map<String, String>) null);
    }

    public final void zzb(zzzc zzzc) {
        boolean z = zzzc.zzacd;
        boolean z2 = zzzc.zzace;
        boolean z3 = zzzc.zzacf;
        synchronized (this.lock) {
            this.zzace = z2;
            this.zzacf = z3;
        }
        zzf("initialState", CollectionUtils.mapOf("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    private final void zzf(String str, @Nullable Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzazq.zzdxo.execute(new zzbep(this, hashMap));
    }

    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeio;
        }
        return z;
    }

    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzadh;
        }
        return i;
    }

    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzeir;
        }
        return f;
    }

    public final float getDuration() {
        float f;
        synchronized (this.lock) {
            f = this.zzeip;
        }
        return f;
    }

    public final float getCurrentTime() {
        float f;
        synchronized (this.lock) {
            f = this.zzeiq;
        }
        return f;
    }

    public final void zza(zzxk zzxk) {
        synchronized (this.lock) {
            this.zzdek = zzxk;
        }
    }

    public final zzxk zzpo() throws RemoteException {
        zzxk zzxk;
        synchronized (this.lock) {
            zzxk = this.zzdek;
        }
        return zzxk;
    }

    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeil && this.zzace;
        }
        return z;
    }

    public final boolean isClickToExpandEnabled() {
        boolean z;
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    if (this.zzacf && this.zzeim) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }

    public final void zze(float f) {
        synchronized (this.lock) {
            this.zzeiq = f;
        }
    }

    public final void zzabt() {
        boolean z;
        int i;
        synchronized (this.lock) {
            z = this.zzeio;
            i = this.zzadh;
            this.zzadh = 3;
        }
        zza(i, 3, z, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            float r1 = r3.zzeip     // Catch:{ all -> 0x0051 }
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0012
            float r1 = r3.zzeir     // Catch:{ all -> 0x0051 }
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r3.zzeip = r5     // Catch:{ all -> 0x0051 }
            r3.zzeiq = r4     // Catch:{ all -> 0x0051 }
            boolean r4 = r3.zzeio     // Catch:{ all -> 0x0051 }
            r3.zzeio = r7     // Catch:{ all -> 0x0051 }
            int r5 = r3.zzadh     // Catch:{ all -> 0x0051 }
            r3.zzadh = r6     // Catch:{ all -> 0x0051 }
            float r2 = r3.zzeir     // Catch:{ all -> 0x0051 }
            r3.zzeir = r8     // Catch:{ all -> 0x0051 }
            float r8 = r3.zzeir     // Catch:{ all -> 0x0051 }
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0051 }
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x003a
            com.google.android.gms.internal.ads.zzbbm r8 = r3.zzdza     // Catch:{ all -> 0x0051 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x0051 }
            r8.invalidate()     // Catch:{ all -> 0x0051 }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzaed r8 = r3.zzeis     // Catch:{ RemoteException -> 0x0047 }
            if (r8 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzaed r8 = r3.zzeis     // Catch:{ RemoteException -> 0x0047 }
            r8.zzrt()     // Catch:{ RemoteException -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzazh.zze(r0, r8)
        L_0x004d:
            r3.zza(r5, r6, r4, r7)
            return
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbeq.zza(float, float, int, boolean, float):void");
    }

    public final void zza(zzaed zzaed) {
        synchronized (this.lock) {
            this.zzeis = zzaed;
        }
    }

    private final void zza(int i, int i2, boolean z, boolean z2) {
        zzazq.zzdxo.execute(new zzbes(this, i, i2, z, z2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(int i, int i2, boolean z, boolean z2) {
        synchronized (this.lock) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.zzein && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (this.zzein || z5) {
                z3 = true;
            }
            this.zzein = z3;
            if (z5) {
                try {
                    if (this.zzdek != null) {
                        this.zzdek.onVideoStart();
                    }
                } catch (RemoteException e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
            if (z6 && this.zzdek != null) {
                this.zzdek.onVideoPlay();
            }
            if (z7 && this.zzdek != null) {
                this.zzdek.onVideoPause();
            }
            if (z8) {
                if (this.zzdek != null) {
                    this.zzdek.onVideoEnd();
                }
                this.zzdza.zzyz();
            }
            if (z9 && this.zzdek != null) {
                this.zzdek.onVideoMute(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(Map map) {
        this.zzdza.zza("pubVideoCmd", (Map<String, ?>) map);
    }
}
