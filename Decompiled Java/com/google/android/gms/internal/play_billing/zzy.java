package com.google.android.gms.internal.play_billing;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public abstract class zzy extends zzr implements Set {
    @CheckForNull
    private transient zzu zza;

    zzy() {
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return zzag.zza(this);
    }

    /* renamed from: zzd */
    public abstract zzah iterator();

    public final zzu zzf() {
        zzu zzu = this.zza;
        if (zzu != null) {
            return zzu;
        }
        zzu zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    /* access modifiers changed from: package-private */
    public zzu zzg() {
        return zzu.zzg(toArray());
    }
}
