package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxx {
    private static zzu zzdvg;
    private static final Object zzdvh = new Object();
    @Deprecated
    private static final zzayb<Void> zzdvi = new zzaya();

    public zzaxx(Context context) {
        zzbk(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    public static zzdof<zzo> zzer(String str) {
        zzazy zzazy = new zzazy();
        zzdvg.zze(new zzayd(str, zzazy));
        return zzazy;
    }

    public final zzdof<String> zza(int i, String str, @Nullable Map<String, String> map, @Nullable byte[] bArr) {
        String str2 = str;
        zzaye zzaye = new zzaye((zzaya) null);
        zzaxz zzaxz = new zzaxz(this, str2, zzaye);
        zzazb zzazb = new zzazb((String) null);
        zzayc zzayc = new zzayc(this, i, str, zzaye, zzaxz, bArr, map, zzazb);
        if (zzazb.isEnabled()) {
            try {
                zzazb.zza(str2, "GET", zzayc.getHeaders(), zzayc.zzg());
            } catch (zzb e) {
                zzawf.zzfa(e.getMessage());
            }
        }
        zzdvg.zze(zzayc);
        return zzaye;
    }

    public final zzdof<String> zzc(String str, Map<String, String> map) {
        return zza(0, str, map, (byte[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzu zzbk(android.content.Context r3) {
        /*
            java.lang.Object r0 = zzdvh
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzu r1 = zzdvg     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzzx.initialize(r3)     // Catch:{ all -> 0x0036 }
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzzx.zzcod     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.zzzt r2 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzu r3 = com.google.android.gms.internal.ads.zzaxq.zzbj(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0030
        L_0x002c:
            com.google.android.gms.internal.ads.zzu r3 = com.google.android.gms.internal.ads.zzba.zza(r3)     // Catch:{ all -> 0x0036 }
        L_0x0030:
            zzdvg = r3     // Catch:{ all -> 0x0036 }
        L_0x0032:
            com.google.android.gms.internal.ads.zzu r3 = zzdvg     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return r3
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxx.zzbk(android.content.Context):com.google.android.gms.internal.ads.zzu");
    }
}
