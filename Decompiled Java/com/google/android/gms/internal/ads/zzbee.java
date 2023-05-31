package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbee {
    public static zzdof<zzbdv> zza(Context context, zzazo zzazo, String str, zzdq zzdq, zza zza) {
        return zzdnt.zzb(zzdnt.zzaj(null), new zzbed(context, zzdq, zzazo, zza, str), (Executor) zzazq.zzdxo);
    }

    public static zzbdv zza(Context context, zzbfl zzbfl, String str, boolean z, boolean z2, @Nullable zzdq zzdq, zzazo zzazo, zzaak zzaak, zzi zzi, zza zza, zzsn zzsn, zzrp zzrp, boolean z3) throws zzbei {
        zzzx.initialize(context);
        if (zzabu.zzcvz.get().booleanValue()) {
            return zzbfr.zza(context, zzbfl, str, z, z2, zzdq, zzazo, (zzaak) null, zzi, zza, zzsn, zzrp, z3);
        }
        try {
            return (zzbdv) zzayp.zza(new zzbeg(context, zzbfl, str, z, z2, zzdq, zzazo, (zzaak) null, zzi, zza, zzsn, zzrp, z3));
        } catch (Throwable th) {
            throw new zzbei("Webview initialization failed.", th);
        }
    }
}
