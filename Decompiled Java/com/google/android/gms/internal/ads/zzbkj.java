package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkj implements zzeej<Set<zzbuv<zzbqt>>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzbkb> zzffc;
    private final zzeew<JSONObject> zzffd;

    private zzbkj(zzeew<zzbkb> zzeew, zzeew<Executor> zzeew2, zzeew<JSONObject> zzeew3) {
        this.zzffc = zzeew;
        this.zzfev = zzeew2;
        this.zzffd = zzeew3;
    }

    public static zzbkj zzd(zzeew<zzbkb> zzeew, zzeew<Executor> zzeew2, zzeew<JSONObject> zzeew3) {
        return new zzbkj(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzbkb zzbkb = this.zzffc.get();
        Executor executor = this.zzfev.get();
        if (this.zzffd.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbuv(zzbkb, executor));
        }
        return (Set) zzeep.zza(set, "Cannot return null from a non-@Nullable @Provides method");
    }
}
