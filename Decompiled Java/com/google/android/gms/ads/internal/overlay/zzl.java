package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzawo;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzl {
    public static void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzdiy == 4 && adOverlayInfoParcel.zzdit == null) {
            if (adOverlayInfoParcel.zzcch != null) {
                adOverlayInfoParcel.zzcch.onAdClicked();
            }
            zzq.zzkt();
            zza.zza(context, adOverlayInfoParcel.zzdis, adOverlayInfoParcel.zzdix);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzblu.zzdxh);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (!PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        zzq.zzkv();
        zzawo.zza(context, intent);
    }
}
