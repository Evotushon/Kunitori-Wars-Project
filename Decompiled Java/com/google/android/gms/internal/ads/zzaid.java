package com.google.android.gms.internal.ads;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaid extends zzaim<zzajy> implements zzaii, zzair {
    private final zzbfz zzczt;
    /* access modifiers changed from: private */
    public zzaiq zzczu;

    public zzaid(Context context, zzazo zzazo) throws zzbei {
        try {
            this.zzczt = new zzbfz(context, new zzaij(this));
            this.zzczt.setWillNotDraw(true);
            this.zzczt.addJavascriptInterface(new zzaig(this), "GoogleJsInterface");
            zzq.zzkv().zza(context, zzazo.zzbmj, this.zzczt.getSettings());
            super.zzg(this);
        } catch (Throwable th) {
            throw new zzbei("Init failed.", th);
        }
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

    public final void zzcw(String str) {
        zzcx(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    public final void zzcx(String str) {
        zzazq.zzdxo.execute(new zzaic(this, str));
    }

    public final void zzcy(String str) {
        zzazq.zzdxo.execute(new zzaif(this, str));
    }

    public final void zza(zzaiq zzaiq) {
        this.zzczu = zzaiq;
    }

    public final void destroy() {
        this.zzczt.destroy();
    }

    public final boolean isDestroyed() {
        return this.zzczt.isDestroyed();
    }

    public final zzakb zzse() {
        return new zzaka(this);
    }

    public final void zzcz(String str) {
        zzazq.zzdxo.execute(new zzaie(this, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzda(String str) {
        this.zzczt.zzcz(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzdb(String str) {
        this.zzczt.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzdc(String str) {
        this.zzczt.loadData(str, "text/html", Constants.ENCODING);
    }
}
