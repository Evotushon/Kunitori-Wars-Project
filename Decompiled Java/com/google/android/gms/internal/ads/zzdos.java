package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdos extends zzdob<zzdof<V>> {
    private final zzdne<V> zzhdq;
    private final /* synthetic */ zzdot zzhdr;

    zzdos(zzdot zzdot, zzdne<V> zzdne) {
        this.zzhdr = zzdot;
        this.zzhdq = (zzdne) zzdlg.checkNotNull(zzdne);
    }

    /* access modifiers changed from: package-private */
    public final boolean isDone() {
        return this.zzhdr.isDone();
    }

    /* access modifiers changed from: package-private */
    public final String zzaus() {
        return this.zzhdq.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, Throwable th) {
        zzdof zzdof = (zzdof) obj;
        if (th == null) {
            this.zzhdr.setFuture(zzdof);
        } else {
            this.zzhdr.setException(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzaur() throws Exception {
        return (zzdof) zzdlg.zza(this.zzhdq.zzapl(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzhdq);
    }
}
