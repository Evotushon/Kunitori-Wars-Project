package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzajr extends zzbab<zzajy> {
    private final Object lock = new Object();
    /* access modifiers changed from: private */
    public final zzajv zzdbe;
    private boolean zzdbf;

    public zzajr(zzajv zzajv) {
        this.zzdbe = zzajv;
    }

    public final void release() {
        synchronized (this.lock) {
            if (!this.zzdbf) {
                this.zzdbf = true;
                zza(new zzajq(this), new zzazz());
                zza(new zzajt(this), new zzajs(this));
            }
        }
    }
}
