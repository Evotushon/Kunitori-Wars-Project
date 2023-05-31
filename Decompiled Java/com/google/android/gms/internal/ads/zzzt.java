package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzzt implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Object lock = new Object();
    private Bundle metaData = new Bundle();
    private final ConditionVariable zzcgt = new ConditionVariable();
    @VisibleForTesting
    private volatile boolean zzcgu = false;
    /* access modifiers changed from: private */
    @Nullable
    public SharedPreferences zzcgv = null;
    private Context zzcgw;
    private JSONObject zzcgx = new JSONObject();
    private volatile boolean zzyb = false;

    public final void initialize(Context context) {
        if (!this.zzyb) {
            synchronized (this.lock) {
                if (!this.zzyb) {
                    if (!this.zzcgu) {
                        this.zzcgu = true;
                    }
                    this.zzcgw = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        this.metaData = Wrappers.packageManager(this.zzcgw).getApplicationInfo(this.zzcgw.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        if (remoteContext == null && context != null && (remoteContext = context.getApplicationContext()) == null) {
                            remoteContext = context;
                        }
                        if (remoteContext != null) {
                            zzvh.zzpb();
                            this.zzcgv = remoteContext.getSharedPreferences("google_ads_flags", 0);
                            if (this.zzcgv != null) {
                                this.zzcgv.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzabw.zza(new zzzu(this));
                            zzql();
                            this.zzyb = true;
                            this.zzcgu = false;
                            this.zzcgt.open();
                        }
                    } finally {
                        this.zzcgu = false;
                        this.zzcgt.open();
                    }
                }
            }
        }
    }

    public final <T> T zzd(zzzi<T> zzzi) {
        if (!this.zzcgt.block(5000)) {
            synchronized (this.lock) {
                if (!this.zzcgu) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzyb || this.zzcgv == null) {
            synchronized (this.lock) {
                if (this.zzyb) {
                    if (this.zzcgv == null) {
                    }
                }
                T zzqi = zzzi.zzqi();
                return zzqi;
            }
        }
        if (zzzi.getSource() == 2) {
            Bundle bundle = this.metaData;
            if (bundle == null) {
                return zzzi.zzqi();
            }
            return zzzi.zza(bundle);
        } else if (zzzi.getSource() != 1 || !this.zzcgx.has(zzzi.getKey())) {
            return zzayp.zza(new zzzs(this, zzzi));
        } else {
            return zzzi.zzb(this.zzcgx);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzql();
        }
    }

    private final void zzql() {
        if (this.zzcgv != null) {
            try {
                this.zzcgx = new JSONObject((String) zzayp.zza(new zzzv(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzqm() {
        return this.zzcgv.getString("flag_configuration", "{}");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zze(zzzi zzzi) {
        return zzzi.zza(this.zzcgv);
    }
}
