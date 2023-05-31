package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcbc {
    private final Executor executor;
    private final zzazo zzblu;
    private final zzach zzdff;
    private final zzsn zzefm;
    private final zzdq zzehb;
    private final ScheduledExecutorService zzfib;
    private final zzcax zzfsi;
    private final zza zzfsj;
    private final zzcbt zzfsk;
    private final Context zzur;

    public zzcbc(Context context, zzcax zzcax, zzdq zzdq, zzazo zzazo, zza zza, zzsn zzsn, Executor executor2, zzdeu zzdeu, zzcbt zzcbt, ScheduledExecutorService scheduledExecutorService) {
        this.zzur = context;
        this.zzfsi = zzcax;
        this.zzehb = zzdq;
        this.zzblu = zzazo;
        this.zzfsj = zza;
        this.zzefm = zzsn;
        this.executor = executor2;
        this.zzdff = zzdeu.zzdff;
        this.zzfsk = zzcbt;
        this.zzfib = scheduledExecutorService;
    }

    public static List<zzyc> zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzyc zzl = zzl(optJSONArray.optJSONObject(i));
            if (zzl != null) {
                arrayList.add(zzl);
            }
        }
        return arrayList;
    }

    @Nullable
    public static zzyc zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzl(optJSONObject);
    }

    @Nullable
    private static zzyc zzl(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzyc(optString, optString2);
    }

    public final zzdof<zzacd> zzc(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONObject(str), this.zzdff.zzcws);
    }

    public final zzdof<List<zzacd>> zzd(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONArray(str), this.zzdff.zzcws, this.zzdff.zzbkg);
    }

    private final zzdof<List<zzacd>> zza(@Nullable JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzdnt.zzaj(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zza(jSONArray.optJSONObject(i), z));
        }
        return zzdnt.zzb(zzdnt.zzg(arrayList), zzcbf.zzdpv, this.executor);
    }

    private final zzdof<zzacd> zza(@Nullable JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzdnt.zzaj(null);
        }
        String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzdnt.zzaj(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzdnt.zzaj(new zzacd((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zza(jSONObject.optBoolean("require"), zzdnt.zzb(this.zzfsi.zza(optString, optDouble, optBoolean), new zzcbe(optString, optDouble, optInt, optInt2), this.executor), (Object) null);
    }

    public final zzdof<zzaby> zze(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzdnt.zzaj(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zza(optJSONObject.optBoolean("require"), zzdnt.zzb(zza(optJSONArray, false, true), new zzcbh(this, optJSONObject), this.executor), (Object) null);
    }

    private static Integer zzf(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final zzdof<zzbdv> zzm(JSONObject jSONObject) {
        JSONObject zza = zzayf.zza(jSONObject, "html_containers", "instream");
        if (zza == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzdnt.zzaj(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                zzawf.zzfa("Required field 'vast_xml' is missing");
                return zzdnt.zzaj(null);
            }
            return zza(zzdnt.zza(this.zzfsk.zzn(optJSONObject), (long) ((Integer) zzvh.zzpd().zzd(zzzx.zzcmw)).intValue(), TimeUnit.SECONDS, this.zzfib), (Object) null);
        }
        zzdof<zzbdv> zzo = this.zzfsk.zzo(zza.optString("base_url"), zza.optString("html"));
        return zzdnt.zzb(zzo, new zzcbj(zzo), (Executor) zzazq.zzdxp);
    }

    private static <T> zzdof<T> zza(zzdof<T> zzdof, T t) {
        return zzdnt.zzb(zzdof, Exception.class, new zzcbi((Object) null), zzazq.zzdxp);
    }

    private static <T> zzdof<T> zza(boolean z, zzdof<T> zzdof, T t) {
        if (z) {
            return zzdnt.zzb(zzdof, new zzcbl(zzdof), (Executor) zzazq.zzdxp);
        }
        return zza(zzdof, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzb(String str, Object obj) throws Exception {
        zzq.zzkw();
        zzbdv zza = zzbee.zza(this.zzur, zzbfl.zzabv(), "native-omid", false, false, this.zzehb, this.zzblu, (zzaak) null, (zzi) null, this.zzfsj, this.zzefm, (zzrp) null, false);
        zzazv zzl = zzazv.zzl(zza);
        zza.zzaaf().zza((zzbfh) new zzcbk(zzl));
        zza.loadData(str, "text/html", Constants.ENCODING);
        return zzl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzaby zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzf = zzf(jSONObject, "bg_color");
        Integer zzf2 = zzf(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzaby(optString, list, zzf, zzf2, num, optInt3 + optInt2, this.zzdff.zzbkh, optBoolean);
    }
}
