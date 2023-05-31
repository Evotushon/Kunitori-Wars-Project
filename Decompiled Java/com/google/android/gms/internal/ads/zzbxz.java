package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxz implements zzbzh {
    private final zzazo zzblu;
    private final Clock zzbmz;
    private final zzdq zzehb;
    private final zzdis zzfdr;
    private final zzbzg zzfge;
    private final zzdei zzfhg;
    private final zzdeu zzfir;
    private final JSONObject zzfnc;
    private final zzccv zzfnd;
    private final zzbyz zzfne;
    /* access modifiers changed from: private */
    public final zzbqp zzfnf;
    /* access modifiers changed from: private */
    public final zzbqg zzfng;
    private final zzbkb zzfnh;
    private final zzbzy zzfni;
    private final zzbuu zzfnj;
    private boolean zzfnk = false;
    private boolean zzfnl;
    private boolean zzfnm = false;
    private boolean zzfnn = false;
    private Point zzfno = new Point();
    private Point zzfnp = new Point();
    private long zzfnq = 0;
    private long zzfnr = 0;
    private zzwq zzfns;
    private final Context zzur;

    public zzbxz(Context context, zzbzg zzbzg, JSONObject jSONObject, zzccv zzccv, zzbyz zzbyz, zzdq zzdq, zzbqp zzbqp, zzbqg zzbqg, zzdei zzdei, zzazo zzazo, zzdeu zzdeu, zzbkb zzbkb, zzbzy zzbzy, Clock clock, zzbuu zzbuu, zzdis zzdis) {
        this.zzur = context;
        this.zzfge = zzbzg;
        this.zzfnc = jSONObject;
        this.zzfnd = zzccv;
        this.zzfne = zzbyz;
        this.zzehb = zzdq;
        this.zzfnf = zzbqp;
        this.zzfng = zzbqg;
        this.zzfhg = zzdei;
        this.zzblu = zzazo;
        this.zzfir = zzdeu;
        this.zzfnh = zzbkb;
        this.zzfni = zzbzy;
        this.zzbmz = clock;
        this.zzfnj = zzbuu;
        this.zzfdr = zzdis;
    }

    public final void zza(View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzfno = new Point();
        this.zzfnp = new Point();
        if (!this.zzfnl) {
            this.zzfnj.zzq(view);
            this.zzfnl = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzfnh.zzo(this);
        boolean zzcs = zzayl.zzcs(this.zzblu.zzdxg);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (zzcs) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (zzcs) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void zza(View view, @Nullable Map<String, WeakReference<View>> map) {
        this.zzfno = new Point();
        this.zzfnp = new Point();
        this.zzfnj.zzr(view);
        this.zzfnl = false;
    }

    private final boolean zzfu(String str) {
        JSONObject optJSONObject = this.zzfnc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    public final void zza(View view, @Nullable View view2, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, boolean z) {
        View view3 = view2;
        Map<String, WeakReference<View>> map3 = map;
        JSONObject zza = zza(map, map2, view2);
        JSONObject zzs = zzs(view2);
        JSONObject zzt = zzt(view2);
        JSONObject zzu = zzu(view2);
        View view4 = view;
        String zzb = zzb(view, map);
        zza(view, zzs, zza, zzt, zzu, zzb, zzfw(zzb), (JSONObject) null, z, false);
    }

    @Nullable
    private final String zzb(@Nullable View view, @Nullable Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry next : map.entrySet()) {
                if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                    return (String) next.getKey();
                }
            }
        }
        int zzake = this.zzfne.zzake();
        if (zzake == 1) {
            return "1099";
        }
        if (zzake == 2) {
            return "2099";
        }
        if (zzake == 3 || zzake != 6) {
            return null;
        }
        return "3099";
    }

    public final void zzfv(String str) {
        zza((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void zzf(@Nullable Bundle bundle) {
        if (bundle == null) {
            zzawf.zzeb("Click data is null. No click is reported.");
        } else if (!zzfu("click_reporting")) {
            zzawf.zzey("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zza((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzq.zzkv().zza(bundle, (JSONObject) null), false, false);
        }
    }

    public final void zza(@Nullable View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfnn) {
            zzawf.zzeb("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!zzajr()) {
            zzawf.zzeb("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            JSONObject zza = zza(map, map2, view);
            JSONObject zzs = zzs(view);
            JSONObject zzt = zzt(view);
            JSONObject zzu = zzu(view);
            String zzb = zzb((View) null, map);
            zza(view, zzs, zza, zzt, zzu, zzb, zzfw(zzb), (JSONObject) null, z, true);
        }
    }

    private final boolean zzajr() {
        return this.zzfnc.optBoolean("allow_custom_click_gesture", false);
    }

    public final void zzru() {
        this.zzfnn = true;
    }

    public final boolean isCustomClickGestureEnabled() {
        return zzajr();
    }

    private final void zza(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z, boolean z2) {
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzfnc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.zzfge.zzgb(this.zzfne.getCustomTemplateId()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zzfne.zzake());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.zzfir.zzdff != null && this.zzfir.zzdff.zzbkj);
            jSONObject8.put("custom_mute_enabled", !this.zzfne.getMuteThisAdReasons().isEmpty() && this.zzfne.zzakh() != null);
            if (this.zzfni.zzaln() != null && this.zzfnc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzbmz.currentTimeMillis());
            if (this.zzfnn && zzajr()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzfge.zzgb(this.zzfne.getCustomTemplateId()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            jSONObject8.put("click_signals", zzv(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzbmz.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzfnq);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzfnr);
            jSONObject7.put("touch_signal", jSONObject9);
            zzazu.zza(this.zzfnd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e) {
            zzawf.zzc("Unable to create click JSON.", e);
        }
    }

    public final void zza(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        int[] zzx = zzx(view2);
        this.zzfno = new Point(((int) motionEvent.getRawX()) - zzx[0], ((int) motionEvent.getRawY()) - zzx[1]);
        long currentTimeMillis = this.zzbmz.currentTimeMillis();
        this.zzfnr = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzfnq = currentTimeMillis;
            this.zzfnp = this.zzfno;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation((float) this.zzfno.x, (float) this.zzfno.y);
        this.zzehb.zza(obtain);
        obtain.recycle();
    }

    public final void zzg(@Nullable Bundle bundle) {
        if (bundle == null) {
            zzawf.zzeb("Touch event data is null. No touch event is reported.");
        } else if (!zzfu("touch_reporting")) {
            zzawf.zzey("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.zzehb.zzcb().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    public final void zzajs() {
        zza((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null);
    }

    public final void setClickConfirmingView(View view) {
        if (!this.zzfnc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzawf.zzfa("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzbzy zzbzy = this.zzfni;
        if (view != null) {
            view.setOnClickListener(zzbzy);
            view.setClickable(true);
            zzbzy.zzfrd = new WeakReference<>(view);
        }
    }

    public final void zza(zzaem zzaem) {
        if (!this.zzfnc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzawf.zzfa("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzfni.zza(zzaem);
        }
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzfnc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzfni.cancelUnconfirmedClick();
        }
    }

    public final void zza(@Nullable zzwu zzwu) {
        try {
            if (!this.zzfnm) {
                if (zzwu != null || this.zzfne.zzakh() == null) {
                    this.zzfnm = true;
                    this.zzfdr.zzeo(zzwu.zzpm());
                    zzajt();
                    return;
                }
                this.zzfnm = true;
                this.zzfdr.zzeo(this.zzfne.zzakh().zzpm());
                zzajt();
            }
        } catch (RemoteException e) {
            zzawf.zze("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzwq zzwq) {
        this.zzfns = zzwq;
    }

    public final void zzajt() {
        try {
            if (this.zzfns != null) {
                this.zzfns.onAdMuted();
            }
        } catch (RemoteException e) {
            zzawf.zze("#007 Could not call remote method.", e);
        }
    }

    public final void zza(@Nullable View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2) {
        zza(zzs(view), zza(map, map2, view), zzt(view), zzu(view), zzw(view), (JSONObject) null);
    }

    public final void zzaju() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzfnc);
            zzazu.zza(this.zzfnd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzazh.zzc("", e);
        }
    }

    public final boolean zzh(Bundle bundle) {
        if (!zzfu("impression_reporting")) {
            zzawf.zzey("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return zza((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, zzq.zzkv().zza(bundle, (JSONObject) null));
    }

    private final boolean zza(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzfnc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmo)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            this.zzfnd.zza("/logScionEvent", (zzafz<Object>) new zzbyb(this));
            this.zzfnd.zza("/nativeImpression", (zzafz<Object>) new zzbya(this));
            zzazu.zza(this.zzfnd.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzfnk || this.zzfhg.zzgpv == null) {
                return true;
            }
            this.zzfnk |= zzq.zzlf().zzb(this.zzur, this.zzblu.zzbmj, this.zzfhg.zzgpv.toString(), this.zzfir.zzgqr);
            return true;
        } catch (JSONException e) {
            zzawf.zzc("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final JSONObject zzb(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzdi(rect.right - rect.left));
        jSONObject.put("height", zzdi(rect.bottom - rect.top));
        jSONObject.put("x", zzdi(rect.left));
        jSONObject.put("y", zzdi(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d4 A[Catch:{ JSONException -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[Catch:{ JSONException -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc A[Catch:{ JSONException -> 0x0100 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject zzs(@androidx.annotation.Nullable android.view.View r14) {
        /*
            r13 = this;
            java.lang.String r0 = "window"
            java.lang.String r1 = "relative_to"
            java.lang.String r2 = "y"
            java.lang.String r3 = "x"
            java.lang.String r4 = "height"
            java.lang.String r5 = "width"
            java.lang.String r6 = "Cannot access method getTemplateTypeName: "
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            if (r14 != 0) goto L_0x0016
            return r7
        L_0x0016:
            r8 = 1
            r9 = 0
            int[] r10 = zzx(r14)     // Catch:{ Exception -> 0x0088 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0088 }
            r11.<init>()     // Catch:{ Exception -> 0x0088 }
            int r12 = r14.getMeasuredWidth()     // Catch:{ Exception -> 0x0088 }
            int r12 = r13.zzdi(r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r5, r12)     // Catch:{ Exception -> 0x0088 }
            int r12 = r14.getMeasuredHeight()     // Catch:{ Exception -> 0x0088 }
            int r12 = r13.zzdi(r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r4, r12)     // Catch:{ Exception -> 0x0088 }
            r12 = r10[r9]     // Catch:{ Exception -> 0x0088 }
            int r12 = r13.zzdi(r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r3, r12)     // Catch:{ Exception -> 0x0088 }
            r12 = r10[r8]     // Catch:{ Exception -> 0x0088 }
            int r12 = r13.zzdi(r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r2, r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r1, r0)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r12 = "frame"
            r7.put(r12, r11)     // Catch:{ Exception -> 0x0088 }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x0088 }
            r11.<init>()     // Catch:{ Exception -> 0x0088 }
            boolean r12 = r14.getGlobalVisibleRect(r11)     // Catch:{ Exception -> 0x0088 }
            if (r12 == 0) goto L_0x0061
            org.json.JSONObject r0 = r13.zzb((android.graphics.Rect) r11)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0082
        L_0x0061:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0088 }
            r11.<init>()     // Catch:{ Exception -> 0x0088 }
            r11.put(r5, r9)     // Catch:{ Exception -> 0x0088 }
            r11.put(r4, r9)     // Catch:{ Exception -> 0x0088 }
            r4 = r10[r9]     // Catch:{ Exception -> 0x0088 }
            int r4 = r13.zzdi(r4)     // Catch:{ Exception -> 0x0088 }
            r11.put(r3, r4)     // Catch:{ Exception -> 0x0088 }
            r3 = r10[r8]     // Catch:{ Exception -> 0x0088 }
            int r3 = r13.zzdi(r3)     // Catch:{ Exception -> 0x0088 }
            r11.put(r2, r3)     // Catch:{ Exception -> 0x0088 }
            r11.put(r1, r0)     // Catch:{ Exception -> 0x0088 }
            r0 = r11
        L_0x0082:
            java.lang.String r1 = "visible_bounds"
            r7.put(r1, r0)     // Catch:{ Exception -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            java.lang.String r0 = "Unable to get native ad view bounding box"
            com.google.android.gms.internal.ads.zzawf.zzfa(r0)
        L_0x008d:
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzcrg
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0106
            android.view.ViewParent r14 = r14.getParent()
            if (r14 == 0) goto L_0x00c8
            java.lang.Class r0 = r14.getClass()     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.String r1 = "getTemplateTypeName"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.Object r14 = r0.invoke(r14, r1)     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            goto L_0x00ca
        L_0x00ba:
            r14 = move-exception
            com.google.android.gms.internal.ads.zzawf.zzc(r6, r14)
            goto L_0x00c8
        L_0x00bf:
            r14 = move-exception
            com.google.android.gms.internal.ads.zzawf.zzc(r6, r14)
            goto L_0x00c8
        L_0x00c4:
            r14 = move-exception
            com.google.android.gms.internal.ads.zzawf.zzc(r6, r14)
        L_0x00c8:
            java.lang.String r14 = ""
        L_0x00ca:
            r0 = -1
            int r1 = r14.hashCode()     // Catch:{ JSONException -> 0x0100 }
            r2 = -2066603854(0xffffffff84d220b2, float:-4.940079E-36)
            if (r1 == r2) goto L_0x00e4
            r2 = 2019754500(0x78630204, float:1.8417067E34)
            if (r1 == r2) goto L_0x00da
            goto L_0x00ed
        L_0x00da:
            java.lang.String r1 = "medium_template"
            boolean r14 = r14.equals(r1)     // Catch:{ JSONException -> 0x0100 }
            if (r14 == 0) goto L_0x00ed
            r0 = 1
            goto L_0x00ed
        L_0x00e4:
            java.lang.String r1 = "small_template"
            boolean r14 = r14.equals(r1)     // Catch:{ JSONException -> 0x0100 }
            if (r14 == 0) goto L_0x00ed
            r0 = 0
        L_0x00ed:
            java.lang.String r14 = "native_template_type"
            if (r0 == 0) goto L_0x00fc
            if (r0 == r8) goto L_0x00f7
            r7.put(r14, r9)     // Catch:{ JSONException -> 0x0100 }
            goto L_0x0106
        L_0x00f7:
            r0 = 2
            r7.put(r14, r0)     // Catch:{ JSONException -> 0x0100 }
            goto L_0x0106
        L_0x00fc:
            r7.put(r14, r8)     // Catch:{ JSONException -> 0x0100 }
            goto L_0x0106
        L_0x0100:
            r14 = move-exception
            java.lang.String r0 = "Could not log native template signal to JSON"
            com.google.android.gms.internal.ads.zzawf.zzc(r0, r14)
        L_0x0106:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxz.zzs(android.view.View):org.json.JSONObject");
    }

    private static JSONObject zzt(@Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzq.zzkv();
            jSONObject.put("contained_in_scroll_view", zzawo.zzp(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject zzu(@Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzq.zzkv();
            jSONObject.put("can_show_on_lock_screen", zzawo.zzo(view));
            zzq.zzkv();
            jSONObject.put("is_keyguard_locked", zzawo.zzaz(this.zzur));
        } catch (JSONException unused) {
            zzawf.zzfa("Unable to get lock screen information");
        }
        return jSONObject;
    }

    private final JSONObject zza(@Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, @Nullable View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        Map<String, WeakReference<View>> map3 = map2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (!(map == null || view == null)) {
            int[] zzx = zzx(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                View view2 = (View) ((WeakReference) next.getValue()).get();
                if (view2 != null) {
                    int[] zzx2 = zzx(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", zzdi(view2.getMeasuredWidth()));
                        jSONObject4.put("height", zzdi(view2.getMeasuredHeight()));
                        jSONObject4.put("x", zzdi(zzx2[0] - zzx[0]));
                        jSONObject4.put("y", zzdi(zzx2[1] - zzx[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = zzb(rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", zzdi(zzx2[0] - zzx[0]));
                            jSONObject.put("y", zzdi(zzx2[1] - zzx[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str2 = str3;
                            str = str4;
                            try {
                                jSONObject3.put("font_size", (double) textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                zzawf.zzfa("Unable to get asset views information");
                                it = it2;
                                str3 = str2;
                                str4 = str;
                            }
                        } else {
                            str2 = str3;
                            str = str4;
                        }
                        jSONObject3.put("is_clickable", map3 != null && map3.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put((String) next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str2 = str3;
                        str = str4;
                        zzawf.zzfa("Unable to get asset views information");
                        it = it2;
                        str3 = str2;
                        str4 = str;
                    }
                    it = it2;
                    str3 = str2;
                    str4 = str;
                }
            }
        }
        return jSONObject2;
    }

    private final String zzv(View view) {
        try {
            JSONObject optJSONObject = this.zzfnc.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.zzehb.zzcb().zza(this.zzur, optJSONObject.optString("click_string"), view);
        } catch (Exception e) {
            zzawf.zzc("Exception obtaining click signals", e);
            return null;
        }
    }

    private final String zzw(View view) {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcmo)).booleanValue()) {
            return null;
        }
        try {
            return this.zzehb.zzcb().zza(this.zzur, view, (Activity) null);
        } catch (Exception unused) {
            zzawf.zzey("Exception getting data.");
            return null;
        }
    }

    private final JSONObject zzfw(@Nullable String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("click_point", zzajv());
                jSONObject.put("asset_id", str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            jSONObject = null;
            zzawf.zzc("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
        return jSONObject;
    }

    @Nullable
    private final JSONObject zzajv() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", zzdi(this.zzfno.x));
            jSONObject.put("y", zzdi(this.zzfno.y));
            jSONObject.put("start_x", zzdi(this.zzfnp.x));
            jSONObject.put("start_y", zzdi(this.zzfnp.y));
            return jSONObject;
        } catch (JSONException e) {
            zzawf.zzc("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    private static int[] zzx(@Nullable View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private final int zzdi(int i) {
        return zzvh.zzoz().zzc(this.zzur, i);
    }

    public final void destroy() {
        this.zzfnd.destroy();
    }
}
