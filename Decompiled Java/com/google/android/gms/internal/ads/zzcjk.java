package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcjk extends zzcji {
    public zzcjk(Context context) {
        this.zzfyk = new zzaqf(context, zzq.zzlj().zzxg(), this, this);
    }

    public final zzdof<InputStream> zzh(zzaqx zzaqx) {
        synchronized (this.mLock) {
            if (this.zzfyh) {
                zzazy zzazy = this.zzdcg;
                return zzazy;
            }
            this.zzfyh = true;
            this.zzfyj = zzaqx;
            this.zzfyk.checkAvailabilityAndConnect();
            this.zzdcg.addListener(new zzcjn(this), zzazq.zzdxp);
            zzazy zzazy2 = this.zzdcg;
            return zzazy2;
        }
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzfyi) {
                this.zzfyi = true;
                try {
                    this.zzfyk.zzuc().zzb(this.zzfyj, new zzcjl(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdcg.setException(new zzcjv(0));
                } catch (Throwable th) {
                    zzq.zzkz().zza(th, "RemoteSignalsClientTask.onConnected");
                    this.zzdcg.setException(new zzcjv(0));
                }
            }
        }
    }
}
