package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbtl;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcsi extends zzvw {
    private final Executor zzfeo;
    private final zzbgk zzgcx;
    private final Context zzgfp;
    @GuardedBy("this")
    private final zzdew zzgfq = new zzdew();
    private final zzcsg zzgfu = new zzcsg();
    private final zzcsj zzgfw = new zzcsj();
    private final zzcsf zzgfx = new zzcsf();
    @GuardedBy("this")
    @Nullable
    private zzaaq zzgfz;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzdof<zzbvu> zzgga;
    private final zzdct zzggf = new zzdct(new zzdfw());
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzbvu zzggg;
    @GuardedBy("this")
    private boolean zzggh = false;

    public zzcsi(zzbgk zzbgk, Context context, zzuk zzuk, String str) {
        this.zzgcx = zzbgk;
        this.zzgfq.zzd(zzuk).zzgn(str);
        this.zzfeo = zzbgk.zzacf();
        this.zzgfp = context;
    }

    public final zzxj getVideoController() {
        return null;
    }

    public final void setUserId(String str) {
    }

    public final void stopLoading() {
    }

    public final void zza(zzapl zzapl) {
    }

    public final void zza(zzapr zzapr, String str) {
    }

    public final void zza(zzrh zzrh) {
    }

    public final void zza(zzuk zzuk) {
    }

    public final void zza(zzur zzur) {
    }

    public final void zza(zzvj zzvj) {
    }

    public final void zza(zzxp zzxp) {
    }

    public final void zzbs(String str) {
    }

    public final IObjectWrapper zzkc() {
        return null;
    }

    public final void zzkd() {
    }

    public final zzuk zzke() {
        return null;
    }

    public final synchronized boolean zza(zzuh zzuh) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (this.zzgga == null) {
            if (!zzaoo()) {
                zzdfc.zze(this.zzgfp, zzuh.zzccp);
                this.zzggg = null;
                zzdeu zzarb = this.zzgfq.zzg(zzuh).zzarb();
                zzbtl.zza zza = new zzbtl.zza();
                if (this.zzggf != null) {
                    zza.zza((zzbqh) this.zzggf, this.zzgcx.zzacf()).zza((zzbrn) this.zzggf, this.zzgcx.zzacf()).zza((zzbqm) this.zzggf, this.zzgcx.zzacf());
                }
                zzbwt zzaev = this.zzgcx.zzacp().zzd(new zzbpt.zza().zzcc(this.zzgfp).zza(zzarb).zzahz()).zzd(zza.zza((zzbqh) this.zzgfu, this.zzgcx.zzacf()).zza((zzbrn) this.zzgfu, this.zzgcx.zzacf()).zza((zzbqm) this.zzgfu, this.zzgcx.zzacf()).zza((zztz) this.zzgfu, this.zzgcx.zzacf()).zza((AppEventListener) this.zzgfw, this.zzgcx.zzacf()).zza((zzbsg) this.zzgfx, this.zzgcx.zzacf()).zzais()).zzb(new zzcrh(this.zzgfz)).zzaev();
                this.zzgga = zzaev.zzadx().zzahq();
                zzdnt.zza(this.zzgga, new zzcsl(this, zzaev), this.zzfeo);
                return true;
            }
        }
        return false;
    }

    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzggg != null) {
            this.zzggg.zzahh().zzca((Context) null);
        }
    }

    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzggg != null) {
            this.zzggg.zzahh().zzby((Context) null);
        }
    }

    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzggg != null) {
            this.zzggg.zzahh().zzbz((Context) null);
        }
    }

    public final void zza(zzvk zzvk) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgfu.zzc(zzvk);
    }

    public final void zza(zzwf zzwf) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgfw.zzb(zzwf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void showInterstitial() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showInterstitial must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x001d }
            com.google.android.gms.internal.ads.zzbvu r0 = r2.zzggg     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000c
            monitor-exit(r2)
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzbvu r0 = r2.zzggg     // Catch:{ all -> 0x001d }
            boolean r0 = r0.zzaja()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzbvu r0 = r2.zzggg     // Catch:{ all -> 0x001d }
            boolean r1 = r2.zzggh     // Catch:{ all -> 0x001d }
            r0.zzbi(r1)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcsi.showInterstitial():void");
    }

    public final synchronized String getMediationAdapterClassName() {
        if (this.zzggg == null || this.zzggg.zzahi() == null) {
            return null;
        }
        return this.zzggg.zzahi().getMediationAdapterClassName();
    }

    public final synchronized String zzkf() {
        if (this.zzggg == null || this.zzggg.zzahi() == null) {
            return null;
        }
        return this.zzggg.zzahi().getMediationAdapterClassName();
    }

    public final synchronized zzxe zzkg() {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcsf)).booleanValue()) {
            return null;
        }
        if (this.zzggg == null) {
            return null;
        }
        return this.zzggg.zzahi();
    }

    public final synchronized void zza(zzwl zzwl) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzgfq.zzc(zzwl);
    }

    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzgfq.zzbo(z);
    }

    public final synchronized boolean isLoading() {
        return this.zzgga != null && !this.zzgga.isDone();
    }

    public final synchronized boolean isReady() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzaoo();
    }

    public final synchronized String getAdUnitId() {
        return this.zzgfq.zzara();
    }

    public final zzwf zzkh() {
        return this.zzgfw.zzaop();
    }

    public final zzvk zzki() {
        return this.zzgfu.zzaon();
    }

    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzggh = z;
    }

    public final synchronized void zza(zzzc zzzc) {
        this.zzgfq.zzc(zzzc);
    }

    public final synchronized void zza(zzaaq zzaaq) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgfz = zzaaq;
    }

    private final synchronized boolean zzaoo() {
        return this.zzggg != null && !this.zzggg.isClosed();
    }

    public final void zza(zzxd zzxd) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzgfx.zzb(zzxd);
    }

    public final void zza(zzwa zzwa) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final void zza(zzasb zzasb) {
        this.zzggf.zzb(zzasb);
    }
}
