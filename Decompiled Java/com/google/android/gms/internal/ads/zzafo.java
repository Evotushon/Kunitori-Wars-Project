package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzafo implements zzafz<zzbdv> {
    zzafo() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbdv zzbdv = (zzbdv) obj;
        if (zzbdv.zzaat() != null) {
            zzbdv.zzaat().zzmr();
        }
        zze zzaab = zzbdv.zzaab();
        if (zzaab != null) {
            zzaab.close();
            return;
        }
        zze zzaac = zzbdv.zzaac();
        if (zzaac != null) {
            zzaac.close();
        } else {
            zzawf.zzfa("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
