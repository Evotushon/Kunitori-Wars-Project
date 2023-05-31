package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzddw extends zzasw {
    private final String zzbri;
    private final zzdep zzfkb;
    private final zzddq zzgoy;
    private final zzdct zzgoz;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzcdn zzgpa;

    public zzddw(@Nullable String str, zzddq zzddq, zzdct zzdct, zzdep zzdep) {
        this.zzbri = str;
        this.zzgoy = zzddq;
        this.zzgoz = zzdct;
        this.zzfkb = zzdep;
    }

    public final synchronized void zza(zzuh zzuh, zzatb zzatb) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgoz.zza(zzatb);
        if (this.zzgpa == null) {
            zzddn zzddn = new zzddn((String) null);
            this.zzgoy.zzaqq();
            this.zzgoy.zza(zzuh, this.zzbri, zzddn, new zzddv(this));
        }
    }

    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zza(iObjectWrapper, false);
    }

    public final synchronized void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzgpa == null) {
            zzawf.zzfa("Rewarded can not be shown before loaded");
            this.zzgoz.zzco(2);
            return;
        }
        this.zzgpa.zzb(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgpa == null || this.zzgpa.zzahi() == null) {
            return null;
        }
        return this.zzgpa.zzahi().getMediationAdapterClassName();
    }

    public final boolean isLoaded() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcdn zzcdn = this.zzgpa;
        return zzcdn != null && !zzcdn.zzaly();
    }

    public final void zza(zzasy zzasy) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgoz.zzb(zzasy);
    }

    public final void zza(zzatg zzatg) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgoz.zzb(zzatg);
    }

    public final void zza(zzwy zzwy) {
        if (zzwy == null) {
            this.zzgoz.zza((AdMetadataListener) null);
        } else {
            this.zzgoz.zza((AdMetadataListener) new zzddy(this, zzwy));
        }
    }

    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcdn zzcdn = this.zzgpa;
        return zzcdn != null ? zzcdn.getAdMetadata() : new Bundle();
    }

    @Nullable
    public final zzass zzqc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcdn zzcdn = this.zzgpa;
        if (zzcdn != null) {
            return zzcdn.zzqc();
        }
        return null;
    }

    public final synchronized void zza(zzato zzato) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdep zzdep = this.zzfkb;
        zzdep.zzdpa = zzato.zzdpa;
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjt)).booleanValue()) {
            zzdep.zzdpb = zzato.zzdpb;
        }
    }

    public final zzxe zzkg() {
        zzcdn zzcdn;
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcsf)).booleanValue() && (zzcdn = this.zzgpa) != null) {
            return zzcdn.zzahi();
        }
        return null;
    }

    public final void zza(zzxd zzxd) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzgoz.zzc(zzxd);
    }
}
