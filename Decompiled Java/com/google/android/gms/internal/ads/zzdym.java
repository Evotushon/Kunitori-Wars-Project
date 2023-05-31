package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.ads.zzdyz;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class zzdym {
    private static volatile boolean zzhpo = false;
    private static boolean zzhpp = true;
    private static volatile zzdym zzhpq;
    private static volatile zzdym zzhpr;
    private static final zzdym zzhps = new zzdym(true);
    private final Map<zza, zzdyz.zzd<?, ?>> zzhpt;

    public static zzdym zzbcg() {
        zzdym zzdym = zzhpq;
        if (zzdym == null) {
            synchronized (zzdym.class) {
                zzdym = zzhpq;
                if (zzdym == null) {
                    zzdym = zzhps;
                    zzhpq = zzdym;
                }
            }
        }
        return zzdym;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * SupportMenu.USER_MASK) + this.number;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            if (this.object == zza.object && this.number == zza.number) {
                return true;
            }
            return false;
        }
    }

    public static zzdym zzbch() {
        zzdym zzdym = zzhpr;
        if (zzdym != null) {
            return zzdym;
        }
        synchronized (zzdym.class) {
            zzdym zzdym2 = zzhpr;
            if (zzdym2 != null) {
                return zzdym2;
            }
            zzdym zze = zzdyy.zze(zzdym.class);
            zzhpr = zze;
            return zze;
        }
    }

    public final <ContainingType extends zzeah> zzdyz.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return this.zzhpt.get(new zza(containingtype, i));
    }

    zzdym() {
        this.zzhpt = new HashMap();
    }

    private zzdym(boolean z) {
        this.zzhpt = Collections.emptyMap();
    }
}
