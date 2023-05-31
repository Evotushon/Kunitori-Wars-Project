package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzazb {
    @GuardedBy("lock")
    private static boolean enabled = false;
    private static Object lock = new Object();
    private static Clock zzbmz = DefaultClock.getInstance();
    @GuardedBy("lock")
    private static boolean zzdwy = false;
    private static final Set<String> zzdwz = new HashSet(Arrays.asList(new String[0]));
    private final List<String> zzdxa;

    public zzazb() {
        this((String) null);
    }

    public zzazb(@Nullable String str) {
        List<String> list;
        if (!isEnabled()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.zzdxa = list;
    }

    public final void zza(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        HashMap hashMap;
        if (isEnabled()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            zzb(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    public final void zza(String str, String str2, @Nullable Map<String, ?> map, @Nullable byte[] bArr) {
        if (isEnabled()) {
            zzb(str, str2, map, bArr);
        }
    }

    private final void zzb(String str, String str2, @Nullable Map<String, ?> map, @Nullable byte[] bArr) {
        zza("onNetworkRequest", (zzazi) new zzaze(str, str2, map, bArr));
    }

    public final void zza(HttpURLConnection httpURLConnection, int i) {
        if (isEnabled()) {
            String str = null;
            zzb(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzazh.zzfa(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                zzew(str);
            }
        }
    }

    public final void zza(@Nullable Map<String, ?> map, int i) {
        if (isEnabled()) {
            zzb(map, i);
            if (i < 200 || i >= 300) {
                zzew((String) null);
            }
        }
    }

    private final void zzb(@Nullable Map<String, ?> map, int i) {
        zza("onNetworkResponse", (zzazi) new zzazd(i, map));
    }

    public final void zzev(@Nullable String str) {
        if (isEnabled() && str != null) {
            zzi(str.getBytes());
        }
    }

    public final void zzi(byte[] bArr) {
        zza("onNetworkResponseBody", (zzazi) new zzazg(bArr));
    }

    private final void zzew(@Nullable String str) {
        zza("onNetworkRequestError", (zzazi) new zzazf(str));
    }

    private static void zza(JsonWriter jsonWriter, @Nullable Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!zzdwz.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            zzazh.zzey("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    private final void zza(String str, zzazi zzazi) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zzbmz.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.zzdxa) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            zzazi.zzb(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzazh.zzc("unable to log", e);
        }
        zzex(stringWriter.toString());
    }

    private static synchronized void zzex(String str) {
        synchronized (zzazb.class) {
            zzazh.zzez("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzazh.zzez(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzazh.zzez("GMA Debug FINISH");
        }
    }

    public static void zzxp() {
        synchronized (lock) {
            zzdwy = false;
            enabled = false;
            zzazh.zzfa("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzar(boolean z) {
        synchronized (lock) {
            zzdwy = true;
            enabled = z;
        }
    }

    public static boolean zzxq() {
        boolean z;
        synchronized (lock) {
            z = zzdwy;
        }
        return z;
    }

    public static boolean isEnabled() {
        boolean z;
        synchronized (lock) {
            z = zzdwy && enabled;
        }
        return z;
    }

    public static boolean zzbr(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !zzabh.zzcuu.get().booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            zzazh.zzd("Fail to determine debug setting.", e);
            return false;
        }
    }

    static final /* synthetic */ void zza(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    static final /* synthetic */ void zza(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(encode);
        } else {
            String zzet = zzayx.zzet(encode);
            if (zzet != null) {
                jsonWriter.name("bodydigest").value(zzet);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    static final /* synthetic */ void zza(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        zza(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    static final /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zza(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }
}
