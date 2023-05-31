package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnk {
    private final AtomicReference<zzalk> zzgcd = new AtomicReference<>();

    zzcnk() {
    }

    public final void zzb(zzalk zzalk) {
        this.zzgcd.compareAndSet((Object) null, zzalk);
    }

    public final zzdfb zze(String str, JSONObject jSONObject) throws zzdfa {
        zzalp zzalp;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzalp = new zzamg((MediationAdapter) new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zzalp = new zzamg((MediationAdapter) new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzalp = new zzamg((MediationAdapter) new zzaog());
            } else {
                zzalp = zzf(str, jSONObject);
            }
            return new zzdfb(zzalp);
        } catch (Throwable th) {
            throw new zzdfa(th);
        }
    }

    public final zzanq zzdh(String str) throws RemoteException {
        return zzaoe().zzdh(str);
    }

    public final boolean zzaod() {
        return this.zzgcd.get() != null;
    }

    private final zzalp zzf(String str, JSONObject jSONObject) throws RemoteException {
        zzalk zzaoe = zzaoe();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                if (zzaoe.zzdg(jSONObject.getString("class_name"))) {
                    return zzaoe.zzdf("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                }
                return zzaoe.zzdf("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                zzawf.zzc("Invalid custom event.", e);
            }
        }
        return zzaoe.zzdf(str);
    }

    private final zzalk zzaoe() throws RemoteException {
        zzalk zzalk = this.zzgcd.get();
        if (zzalk != null) {
            return zzalk;
        }
        zzawf.zzfa("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
