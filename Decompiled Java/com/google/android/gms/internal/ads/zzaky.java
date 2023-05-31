package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaky implements zzagh {
    private final zzazy<O> zzdcg;
    private final /* synthetic */ zzakw zzdcj;

    public zzaky(zzakw zzakw, zzazy<O> zzazy) {
        this.zzdcj = zzakw;
        this.zzdcg = zzazy;
    }

    public final void zzc(JSONObject jSONObject) {
        try {
            this.zzdcg.set(this.zzdcj.zzdcc.zzd(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzdcg.setException(e);
        }
    }

    public final void onFailure(@Nullable String str) {
        if (str == null) {
            try {
                this.zzdcg.setException(new zzakd());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.zzdcg.setException(new zzakd(str));
        }
    }
}
