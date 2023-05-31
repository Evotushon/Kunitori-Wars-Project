package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzakq implements zzagh {
    private final /* synthetic */ zzakp zzdcb;
    private final zzajr zzdcf;
    private final zzazy<O> zzdcg;

    public zzakq(zzakp zzakp, zzajr zzajr, zzazy<O> zzazy) {
        this.zzdcb = zzakp;
        this.zzdcf = zzajr;
        this.zzdcg = zzazy;
    }

    public final void zzc(JSONObject jSONObject) {
        try {
            this.zzdcg.set(this.zzdcb.zzdcc.zzd(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzdcg.setException(e);
        } finally {
            this.zzdcf.release();
        }
    }

    public final void onFailure(@Nullable String str) {
        if (str == null) {
            try {
                this.zzdcg.setException(new zzakd());
            } catch (IllegalStateException unused) {
                this.zzdcf.release();
                return;
            } catch (Throwable th) {
                this.zzdcf.release();
                throw th;
            }
        } else {
            this.zzdcg.setException(new zzakd(str));
        }
        this.zzdcf.release();
    }
}
