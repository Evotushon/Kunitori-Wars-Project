package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcjg extends zzcji {
    public zzcjg(Context context) {
        this.zzfyk = new zzaqf(context, zzq.zzlj().zzxg(), this, this);
    }

    public final zzdof<InputStream> zzg(zzaqx zzaqx) {
        synchronized (this.mLock) {
            if (this.zzfyh) {
                zzazy zzazy = this.zzdcg;
                return zzazy;
            }
            this.zzfyh = true;
            this.zzfyj = zzaqx;
            this.zzfyk.checkAvailabilityAndConnect();
            this.zzdcg.addListener(new zzcjj(this), zzazq.zzdxp);
            zzazy zzazy2 = this.zzdcg;
            return zzazy2;
        }
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzawf.zzeb("Cannot connect to remote service, fallback to local instance.");
        this.zzdcg.setException(new zzcjv(0));
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzfyi) {
                this.zzfyi = true;
                try {
                    this.zzfyk.zzuc().zza(this.zzfyj, (zzaqr) new zzcjl(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdcg.setException(new zzcjv(0));
                } catch (Throwable th) {
                    zzq.zzkz().zza(th, "RemoteAdRequestClientTask.onConnected");
                    this.zzdcg.setException(new zzcjv(0));
                }
            }
        }
    }
}
