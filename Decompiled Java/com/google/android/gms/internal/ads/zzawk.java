package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzawk implements zzawh {
    private final Object lock = new Object();
    @GuardedBy("lock")
    @Nullable
    private SharedPreferences zzcgv;
    @GuardedBy("lock")
    private boolean zzdka = true;
    @GuardedBy("lock")
    private boolean zzdkn = false;
    @GuardedBy("lock")
    private String zzdkq = "";
    @GuardedBy("lock")
    private boolean zzdlz = true;
    @GuardedBy("lock")
    private boolean zzdmk = true;
    private boolean zzdtc;
    private final List<Runnable> zzdtd = new ArrayList();
    private zzdof<?> zzdte;
    @GuardedBy("lock")
    @Nullable
    private zzqj zzdtf = null;
    @GuardedBy("lock")
    @Nullable
    private SharedPreferences.Editor zzdtg;
    @GuardedBy("lock")
    private boolean zzdth = false;
    @GuardedBy("lock")
    @Nullable
    private String zzdti;
    @GuardedBy("lock")
    @Nullable
    private String zzdtj;
    @GuardedBy("lock")
    private long zzdtk = 0;
    @GuardedBy("lock")
    private long zzdtl = 0;
    @GuardedBy("lock")
    private long zzdtm = 0;
    @GuardedBy("lock")
    private int zzdtn = -1;
    @GuardedBy("lock")
    private int zzdto = 0;
    @GuardedBy("lock")
    private Set<String> zzdtp = Collections.emptySet();
    @GuardedBy("lock")
    private JSONObject zzdtq = new JSONObject();
    @GuardedBy("lock")
    private String zzdtr = null;
    @GuardedBy("lock")
    private int zzdts = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r4.length() == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = "admob__".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4 = new java.lang.String("admob__");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r2.zzdte = com.google.android.gms.internal.ads.zzazq.zzdxk.zzf(new com.google.android.gms.internal.ads.zzawj(r2, r3, r4));
        r2.zzdtc = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r4 = com.adjust.sdk.AdjustConfig.AD_REVENUE_ADMOB;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r2.zzcgv     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x000f
            java.lang.String r4 = "admob"
            goto L_0x0025
        L_0x000f:
            java.lang.String r0 = "admob__"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0020
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0025
        L_0x0020:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0025:
            com.google.android.gms.internal.ads.zzdoe r0 = com.google.android.gms.internal.ads.zzazq.zzdxk
            com.google.android.gms.internal.ads.zzawj r1 = new com.google.android.gms.internal.ads.zzawj
            r1.<init>(r2, r3, r4)
            com.google.android.gms.internal.ads.zzdof r3 = r0.zzf(r1)
            r2.zzdte = r3
            r2.zzdtc = r5
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawk.zza(android.content.Context, java.lang.String, boolean):void");
    }

    private final void zzwm() {
        zzdof<?> zzdof = this.zzdte;
        if (zzdof != null && !zzdof.isDone()) {
            try {
                this.zzdte.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                zzawf.zzd("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                zzawf.zzc("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    private final Bundle zzwn() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.lock) {
            bundle.putBoolean("use_https", this.zzdka);
            bundle.putBoolean("content_url_opted_out", this.zzdlz);
            bundle.putBoolean("content_vertical_opted_out", this.zzdmk);
            bundle.putBoolean("auto_collect_location", this.zzdkn);
            bundle.putInt("version_code", this.zzdto);
            bundle.putStringArray("never_pool_slots", (String[]) this.zzdtp.toArray(new String[0]));
            bundle.putString("app_settings_json", this.zzdkq);
            bundle.putLong("app_settings_last_update_ms", this.zzdtk);
            bundle.putLong("app_last_background_time_ms", this.zzdtl);
            bundle.putInt("request_in_session_count", this.zzdtn);
            bundle.putLong("first_ad_req_time_ms", this.zzdtm);
            bundle.putString("native_advanced_settings", this.zzdtq.toString());
            bundle.putString("display_cutout", this.zzdtr);
            bundle.putInt("app_measurement_npa", this.zzdts);
            if (this.zzdti != null) {
                bundle.putString("content_url_hashes", this.zzdti);
            }
            if (this.zzdtj != null) {
                bundle.putString("content_vertical_hashes", this.zzdtj);
            }
        }
        return bundle;
    }

    private final void zzc(Bundle bundle) {
        zzazq.zzdxk.execute(new zzawm(this));
    }

    @Nullable
    public final zzqj zzvy() {
        if (!this.zzdtc) {
            return null;
        }
        if ((zzvz() && zzwb()) || !zzabc.zzctu.get().booleanValue()) {
            return null;
        }
        synchronized (this.lock) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zzdtf == null) {
                this.zzdtf = new zzqj();
            }
            this.zzdtf.zzmg();
            zzawf.zzez("start fetching content...");
            zzqj zzqj = this.zzdtf;
            return zzqj;
        }
    }

    public final void zzao(boolean z) {
        zzwm();
        synchronized (this.lock) {
            if (this.zzdlz != z) {
                this.zzdlz = z;
                if (this.zzdtg != null) {
                    this.zzdtg.putBoolean("content_url_opted_out", z);
                    this.zzdtg.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.zzdlz);
                bundle.putBoolean("content_vertical_opted_out", this.zzdmk);
                zzc(bundle);
            }
        }
    }

    public final boolean zzvz() {
        boolean z;
        zzwm();
        synchronized (this.lock) {
            z = this.zzdlz;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzef(@androidx.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r3.zzwm()
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.zzdti     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.zzdti = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.zzdtg     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.zzdtg     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.zzdtg     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.zzc(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawk.zzef(java.lang.String):void");
    }

    @Nullable
    public final String zzwa() {
        String str;
        zzwm();
        synchronized (this.lock) {
            str = this.zzdti;
        }
        return str;
    }

    public final void zzap(boolean z) {
        zzwm();
        synchronized (this.lock) {
            if (this.zzdmk != z) {
                this.zzdmk = z;
                if (this.zzdtg != null) {
                    this.zzdtg.putBoolean("content_vertical_opted_out", z);
                    this.zzdtg.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.zzdlz);
                bundle.putBoolean("content_vertical_opted_out", this.zzdmk);
                zzc(bundle);
            }
        }
    }

    public final boolean zzwb() {
        boolean z;
        zzwm();
        synchronized (this.lock) {
            z = this.zzdmk;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzeg(@androidx.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r3.zzwm()
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.zzdtj     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.zzdtj = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.zzdtg     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.zzdtg     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.zzdtg     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.zzc(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawk.zzeg(java.lang.String):void");
    }

    @Nullable
    public final String zzwc() {
        String str;
        zzwm();
        synchronized (this.lock) {
            str = this.zzdtj;
        }
        return str;
    }

    public final void zzaq(boolean z) {
        zzwm();
        synchronized (this.lock) {
            if (this.zzdkn != z) {
                this.zzdkn = z;
                if (this.zzdtg != null) {
                    this.zzdtg.putBoolean("auto_collect_location", z);
                    this.zzdtg.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                zzc(bundle);
            }
        }
    }

    public final boolean zzwd() {
        boolean z;
        zzwm();
        synchronized (this.lock) {
            z = this.zzdkn;
        }
        return z;
    }

    public final void zzcp(int i) {
        zzwm();
        synchronized (this.lock) {
            if (this.zzdto != i) {
                this.zzdto = i;
                if (this.zzdtg != null) {
                    this.zzdtg.putInt("version_code", i);
                    this.zzdtg.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                zzc(bundle);
            }
        }
    }

    public final int zzwe() {
        int i;
        zzwm();
        synchronized (this.lock) {
            i = this.zzdto;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzeh(java.lang.String r6) {
        /*
            r5 = this;
            r5.zzwm()
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzq.zzlc()     // Catch:{ all -> 0x0060 }
            long r1 = r1.currentTimeMillis()     // Catch:{ all -> 0x0060 }
            r5.zzdtk = r1     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r3 = r5.zzdkq     // Catch:{ all -> 0x0060 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            r5.zzdkq = r6     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.zzdtg     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.zzdtg     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.zzdtg     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.zzdtg     // Catch:{ all -> 0x0060 }
            r3.apply()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x0060 }
            r5.zzc(r3)     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Runnable> r6 = r5.zzdtd     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
        L_0x004c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
            r1.run()     // Catch:{ all -> 0x0060 }
            goto L_0x004c
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0064
        L_0x0063:
            throw r6
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawk.zzeh(java.lang.String):void");
    }

    public final zzavs zzwf() {
        zzavs zzavs;
        zzwm();
        synchronized (this.lock) {
            zzavs = new zzavs(this.zzdkq, this.zzdtk);
        }
        return zzavs;
    }

    public final void zzb(Runnable runnable) {
        this.zzdtd.add(runnable);
    }

    public final void zzez(long j) {
        zzwm();
        synchronized (this.lock) {
            if (this.zzdtl != j) {
                this.zzdtl = j;
                if (this.zzdtg != null) {
                    this.zzdtg.putLong("app_last_background_time_ms", j);
                    this.zzdtg.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                zzc(bundle);
            }
        }
    }

    public final long zzwg() {
        long j;
        zzwm();
        synchronized (this.lock) {
            j = this.zzdtl;
        }
        return j;
    }

    public final void zzcq(int i) {
        zzwm();
        synchronized (this.lock) {
            if (this.zzdtn != i) {
                this.zzdtn = i;
                if (this.zzdtg != null) {
                    this.zzdtg.putInt("request_in_session_count", i);
                    this.zzdtg.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                zzc(bundle);
            }
        }
    }

    public final int zzwh() {
        int i;
        zzwm();
        synchronized (this.lock) {
            i = this.zzdtn;
        }
        return i;
    }

    public final void zzfa(long j) {
        zzwm();
        synchronized (this.lock) {
            if (this.zzdtm != j) {
                this.zzdtm = j;
                if (this.zzdtg != null) {
                    this.zzdtg.putLong("first_ad_req_time_ms", j);
                    this.zzdtg.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                zzc(bundle);
            }
        }
    }

    public final long zzwi() {
        long j;
        zzwm();
        synchronized (this.lock) {
            j = this.zzdtm;
        }
        return j;
    }

    public final void zza(String str, String str2, boolean z) {
        zzwm();
        synchronized (this.lock) {
            JSONArray optJSONArray = this.zzdtq.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzq.zzlc().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzdtq.put(str, optJSONArray);
            } catch (JSONException e) {
                zzawf.zzd("Could not update native advanced settings", e);
            }
            if (this.zzdtg != null) {
                this.zzdtg.putString("native_advanced_settings", this.zzdtq.toString());
                this.zzdtg.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.zzdtq.toString());
            zzc(bundle);
        }
    }

    public final JSONObject zzwj() {
        JSONObject jSONObject;
        zzwm();
        synchronized (this.lock) {
            jSONObject = this.zzdtq;
        }
        return jSONObject;
    }

    public final void zzwk() {
        zzwm();
        synchronized (this.lock) {
            this.zzdtq = new JSONObject();
            if (this.zzdtg != null) {
                this.zzdtg.remove("native_advanced_settings");
                this.zzdtg.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            zzc(bundle);
        }
    }

    public final String zzwl() {
        String str;
        zzwm();
        synchronized (this.lock) {
            str = this.zzdtr;
        }
        return str;
    }

    public final void zzei(String str) {
        zzwm();
        synchronized (this.lock) {
            if (!TextUtils.equals(this.zzdtr, str)) {
                this.zzdtr = str;
                if (this.zzdtg != null) {
                    this.zzdtg.putString("display_cutout", str);
                    this.zzdtg.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("display_cutout", str);
                zzc(bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.lock) {
            this.zzcgv = sharedPreferences;
            this.zzdtg = edit;
            if (PlatformVersion.isAtLeastM() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.zzdth = z;
            this.zzdka = this.zzcgv.getBoolean("use_https", this.zzdka);
            this.zzdlz = this.zzcgv.getBoolean("content_url_opted_out", this.zzdlz);
            this.zzdti = this.zzcgv.getString("content_url_hashes", this.zzdti);
            this.zzdkn = this.zzcgv.getBoolean("auto_collect_location", this.zzdkn);
            this.zzdmk = this.zzcgv.getBoolean("content_vertical_opted_out", this.zzdmk);
            this.zzdtj = this.zzcgv.getString("content_vertical_hashes", this.zzdtj);
            this.zzdto = this.zzcgv.getInt("version_code", this.zzdto);
            this.zzdkq = this.zzcgv.getString("app_settings_json", this.zzdkq);
            this.zzdtk = this.zzcgv.getLong("app_settings_last_update_ms", this.zzdtk);
            this.zzdtl = this.zzcgv.getLong("app_last_background_time_ms", this.zzdtl);
            this.zzdtn = this.zzcgv.getInt("request_in_session_count", this.zzdtn);
            this.zzdtm = this.zzcgv.getLong("first_ad_req_time_ms", this.zzdtm);
            this.zzdtp = this.zzcgv.getStringSet("never_pool_slots", this.zzdtp);
            this.zzdtr = this.zzcgv.getString("display_cutout", this.zzdtr);
            this.zzdts = this.zzcgv.getInt("app_measurement_npa", this.zzdts);
            try {
                this.zzdtq = new JSONObject(this.zzcgv.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzawf.zzd("Could not convert native advanced settings to json object", e);
            }
            zzc(zzwn());
        }
    }
}
