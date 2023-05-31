package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzad extends zzy {
    private final transient zzx zza;
    private final transient zzu zzb;

    zzad(zzx zzx, zzu zzu) {
        this.zza = zzx;
        this.zzb = zzu;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    public final zzah zzd() {
        return this.zzb.listIterator(0);
    }
}
