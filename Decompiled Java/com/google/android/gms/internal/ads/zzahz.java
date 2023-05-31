package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzahz {
    private final zzui zzabf;
    private final zzvp zzabg;
    private final Context zzur;

    zzahz(Context context, zzvp zzvp) {
        this(context, zzvp, zzui.zzcdb);
    }

    private zzahz(Context context, zzvp zzvp, zzui zzui) {
        this.zzur = context;
        this.zzabg = zzvp;
        this.zzabf = zzui;
    }

    private final void zza(zzxr zzxr) {
        try {
            this.zzabg.zzb(zzui.zza(this.zzur, zzxr));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(AdRequest adRequest) {
        zza(adRequest.zzdl());
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzdl());
    }
}
