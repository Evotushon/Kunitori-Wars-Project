package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.0.1 */
final class zzdxb extends WeakReference<Throwable> {
    private final int zzhno;

    public zzdxb(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.zzhno = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.zzhno;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzdxb zzdxb = (zzdxb) obj;
            return this.zzhno == zzdxb.zzhno && get() == zzdxb.get();
        }
    }
}
