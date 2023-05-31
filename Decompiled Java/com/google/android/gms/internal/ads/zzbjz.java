package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzq;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjz implements zzakh<zzbkd> {
    private final zzpo zzfei;
    private final Context zzur;
    private final PowerManager zzza;

    public zzbjz(Context context, zzpo zzpo) {
        this.zzur = context;
        this.zzfei = zzpo;
        this.zzza = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: zza */
    public final JSONObject zzj(zzbkd zzbkd) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (zzbkd.zzffb == null) {
            jSONObject = new JSONObject();
        } else {
            zzpu zzpu = zzbkd.zzffb;
            if (this.zzfei.zzkq() != null) {
                boolean z2 = zzpu.zzboi;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject put = jSONObject3.put("afmaVersion", this.zzfei.zzkp()).put("activeViewJSON", this.zzfei.zzkq()).put("timestamp", zzbkd.timestamp).put("adFormat", this.zzfei.zzko()).put("hashCode", this.zzfei.zzkr());
                zzpo zzpo = this.zzfei;
                JSONObject put2 = put.put("isMraid", false).put("isStopped", false).put("isPaused", zzbkd.zzfey).put("isNative", this.zzfei.zzks());
                if (Build.VERSION.SDK_INT >= 20) {
                    z = this.zzza.isInteractive();
                } else {
                    z = this.zzza.isScreenOn();
                }
                put2.put("isScreenOn", z).put("appMuted", zzq.zzla().zzpk()).put("appVolume", (double) zzq.zzla().zzpj()).put("deviceVolume", (double) zzaxd.zzbh(this.zzur.getApplicationContext()));
                Rect rect = new Rect();
                Display defaultDisplay = ((WindowManager) this.zzur.getSystemService("window")).getDefaultDisplay();
                rect.right = defaultDisplay.getWidth();
                rect.bottom = defaultDisplay.getHeight();
                jSONObject3.put("windowVisibility", zzpu.zzzh).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", zzpu.zzboj.top).put("bottom", zzpu.zzboj.bottom).put("left", zzpu.zzboj.left).put("right", zzpu.zzboj.right)).put("adBox", new JSONObject().put("top", zzpu.zzbok.top).put("bottom", zzpu.zzbok.bottom).put("left", zzpu.zzbok.left).put("right", zzpu.zzbok.right)).put("globalVisibleBox", new JSONObject().put("top", zzpu.zzbol.top).put("bottom", zzpu.zzbol.bottom).put("left", zzpu.zzbol.left).put("right", zzpu.zzbol.right)).put("globalVisibleBoxVisible", zzpu.zzbom).put("localVisibleBox", new JSONObject().put("top", zzpu.zzbon.top).put("bottom", zzpu.zzbon.bottom).put("left", zzpu.zzbon.left).put("right", zzpu.zzbon.right)).put("localVisibleBoxVisible", zzpu.zzboo).put("hitBox", new JSONObject().put("top", zzpu.zzbop.top).put("bottom", zzpu.zzbop.bottom).put("left", zzpu.zzbop.left).put("right", zzpu.zzbop.right)).put("screenDensity", (double) this.zzur.getResources().getDisplayMetrics().density);
                jSONObject3.put("isVisible", zzbkd.zzbnz);
                if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcld)).booleanValue()) {
                    JSONArray jSONArray2 = new JSONArray();
                    if (zzpu.zzbor != null) {
                        for (Rect next : zzpu.zzbor) {
                            jSONArray2.put(new JSONObject().put("top", next.top).put("bottom", next.bottom).put("left", next.left).put("right", next.right));
                        }
                    }
                    jSONObject3.put("scrollableContainerBoxes", jSONArray2);
                }
                if (!TextUtils.isEmpty(zzbkd.zzffa)) {
                    jSONObject3.put("doneReasonCode", "u");
                }
                jSONObject = jSONObject3;
            } else {
                throw new JSONException("Active view Info cannot be null.");
            }
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
