package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzait implements zzaii, zzair {
    /* access modifiers changed from: private */
    public final zzbdv zzdae;
    private final Context zzur;

    public zzait(Context context, zzazo zzazo, @Nullable zzdq zzdq, zza zza) throws zzbei {
        Context context2 = context;
        this.zzur = context2;
        zzq.zzkw();
        this.zzdae = zzbee.zza(context2, zzbfl.zzabv(), "", false, false, zzdq, zzazo, (zzaak) null, (zzi) null, (zza) null, zzsn.zzmy(), (zzrp) null, false);
        this.zzdae.getView().setWillNotDraw(true);
    }

    public final void zza(String str, Map map) {
        zzail.zza((zzaii) this, str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzail.zzb(this, str, jSONObject);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        zzail.zza((zzaii) this, str, jSONObject);
    }

    public final void zzj(String str, String str2) {
        zzail.zza((zzaii) this, str, str2);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzvh.zzoz();
        if (zzayx.zzxj()) {
            runnable.run();
        } else {
            zzawo.zzdtx.post(runnable);
        }
    }

    public final void zzcz(String str) {
        runOnUiThread(new zzais(this, str));
    }

    public final void zzcw(String str) {
        runOnUiThread(new zzaix(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void zzcx(String str) {
        runOnUiThread(new zzaiw(this, str));
    }

    public final void zzcy(String str) {
        runOnUiThread(new zzaiz(this, str));
    }

    public final void zza(String str, zzafz<? super zzajy> zzafz) {
        this.zzdae.zza(str, (zzafz<? super zzbdv>) new zzaiy(this, zzafz));
    }

    public final void zzb(String str, zzafz<? super zzajy> zzafz) {
        this.zzdae.zza(str, (Predicate<zzafz<? super zzbdv>>) new zzaiv(zzafz));
    }

    public final void zza(zzaiq zzaiq) {
        zzbfi zzaaf = this.zzdae.zzaaf();
        zzaiq.getClass();
        zzaaf.zza(zzaiu.zzb(zzaiq));
    }

    public final zzakb zzse() {
        return new zzaka(this);
    }

    public final void destroy() {
        this.zzdae.destroy();
    }

    public final boolean isDestroyed() {
        return this.zzdae.isDestroyed();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzde(String str) {
        this.zzdae.zzcz(str);
    }
}
