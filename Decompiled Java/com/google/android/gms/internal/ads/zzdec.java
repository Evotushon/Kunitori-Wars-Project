package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdec extends zzarx {
    private final zzdep zzfkb;
    @GuardedBy("this")
    private boolean zzggh = false;
    private final zzddq zzgoy;
    private final zzdct zzgoz;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzcdn zzgpa;

    public zzdec(zzddq zzddq, zzdct zzdct, zzdep zzdep) {
        this.zzgoy = zzddq;
        this.zzgoz = zzdct;
        this.zzfkb = zzdep;
    }

    public final void setAppPackageName(String str) throws RemoteException {
    }

    public final synchronized void zza(zzash zzash) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (!zzzz.zzcq(zzash.zzbri)) {
            if (zzaoo()) {
                if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcpo)).booleanValue()) {
                    return;
                }
            }
            zzddn zzddn = new zzddn((String) null);
            this.zzgpa = null;
            this.zzgoy.zza(zzash.zzdjt, zzash.zzbri, zzddn, new zzdeb(this));
        }
    }

    public final void destroy() throws RemoteException {
        zzl((IObjectWrapper) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzl(com.google.android.gms.dynamic.IObjectWrapper r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzdct r0 = r2.zzgoz     // Catch:{ all -> 0x0025 }
            r1 = 0
            r0.zza((com.google.android.gms.ads.reward.AdMetadataListener) r1)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzcdn r0 = r2.zzgpa     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0023
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch:{ all -> 0x0025 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0025 }
        L_0x001a:
            com.google.android.gms.internal.ads.zzcdn r3 = r2.zzgpa     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbqw r3 = r3.zzahh()     // Catch:{ all -> 0x0025 }
            r3.zzca(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdec.zzl(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final void pause() {
        zzj((IObjectWrapper) null);
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgpa != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzgpa.zzahh().zzby(context);
        }
    }

    public final void resume() {
        zzk((IObjectWrapper) null);
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgpa != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzgpa.zzahh().zzbz(context);
        }
    }

    public final synchronized void show() throws RemoteException {
        zzi((IObjectWrapper) null);
    }

    public final synchronized void zzi(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzgpa != null) {
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                    this.zzgpa.zzb(this.zzggh, activity);
                }
            }
            activity = null;
            this.zzgpa.zzb(this.zzggh, activity);
        }
    }

    public final boolean zzqd() {
        zzcdn zzcdn = this.zzgpa;
        return zzcdn != null && zzcdn.zzqd();
    }

    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgpa == null || this.zzgpa.zzahi() == null) {
            return null;
        }
        return this.zzgpa.zzahi().getMediationAdapterClassName();
    }

    public final boolean isLoaded() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzaoo();
    }

    public final void zza(zzasb zzasb) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzgoz.zzb(zzasb);
    }

    public final void zza(zzarw zzarw) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzgoz.zzb(zzarw);
    }

    public final void zza(zzwa zzwa) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzwa == null) {
            this.zzgoz.zza((AdMetadataListener) null);
        } else {
            this.zzgoz.zza((AdMetadataListener) new zzdee(this, zzwa));
        }
    }

    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzcdn zzcdn = this.zzgpa;
        return zzcdn != null ? zzcdn.getAdMetadata() : new Bundle();
    }

    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzfkb.zzdpa = str;
    }

    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjt)).booleanValue()) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.zzfkb.zzdpb = str;
        }
    }

    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzggh = z;
    }

    public final synchronized zzxe zzkg() throws RemoteException {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcsf)).booleanValue()) {
            return null;
        }
        if (this.zzgpa == null) {
            return null;
        }
        return this.zzgpa.zzahi();
    }

    private final synchronized boolean zzaoo() {
        return this.zzgpa != null && !this.zzgpa.isClosed();
    }
}
