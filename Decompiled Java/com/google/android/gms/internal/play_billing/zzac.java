package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzac extends zzy {
    private final transient zzx zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    /* access modifiers changed from: private */
    public final transient int zzc;

    zzac(zzx zzx, Object[] objArr, int i, int i2) {
        this.zza = zzx;
        this.zzb = objArr;
        this.zzc = i2;
    }

    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zza.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, 0);
    }

    public final zzah zzd() {
        return zzf().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final zzu zzg() {
        return new zzab(this);
    }
}
