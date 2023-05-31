package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzajv extends zzbab<zzair> {
    private final Object lock = new Object();
    /* access modifiers changed from: private */
    public zzaxu<zzair> zzdan;
    private boolean zzdbi;
    private int zzdbj;

    public zzajv(zzaxu<zzair> zzaxu) {
        this.zzdan = zzaxu;
        this.zzdbi = false;
        this.zzdbj = 0;
    }

    public final zzajr zzsh() {
        zzajr zzajr = new zzajr(this);
        synchronized (this.lock) {
            zza(new zzaju(this, zzajr), new zzajx(this, zzajr));
            Preconditions.checkState(this.zzdbj >= 0);
            this.zzdbj++;
        }
        return zzajr;
    }

    /* access modifiers changed from: protected */
    public final void zzsi() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdbj > 0);
            zzawf.zzee("Releasing 1 reference for JS Engine");
            this.zzdbj--;
            zzsk();
        }
    }

    public final void zzsj() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdbj >= 0);
            zzawf.zzee("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzdbi = true;
            zzsk();
        }
    }

    private final void zzsk() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdbj >= 0);
            if (!this.zzdbi || this.zzdbj != 0) {
                zzawf.zzee("There are still references to the engine. Not destroying.");
            } else {
                zzawf.zzee("No reference is left (including root). Cleaning up engine.");
                zza(new zzajw(this), new zzazz());
            }
        }
    }
}
