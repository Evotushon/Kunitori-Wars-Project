package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcjp extends zzcji {
    private String zzfyp;
    private int zzfyq = zzcjq.zzfyr;

    public zzcjp(Context context) {
        this.zzfyk = new zzaqf(context, zzq.zzlj().zzxg(), this, this);
    }

    public final zzdof<InputStream> zzi(zzaqx zzaqx) {
        synchronized (this.mLock) {
            if (this.zzfyq != zzcjq.zzfyr && this.zzfyq != zzcjq.zzfys) {
                zzdof<InputStream> immediateFailedFuture = zzdnt.immediateFailedFuture(new zzcjv(1));
                return immediateFailedFuture;
            } else if (this.zzfyh) {
                zzazy zzazy = this.zzdcg;
                return zzazy;
            } else {
                this.zzfyq = zzcjq.zzfys;
                this.zzfyh = true;
                this.zzfyj = zzaqx;
                this.zzfyk.checkAvailabilityAndConnect();
                this.zzdcg.addListener(new zzcjo(this), zzazq.zzdxp);
                zzazy zzazy2 = this.zzdcg;
                return zzazy2;
            }
        }
    }

    public final zzdof<InputStream> zzgh(String str) {
        synchronized (this.mLock) {
            if (this.zzfyq != zzcjq.zzfyr && this.zzfyq != zzcjq.zzfyt) {
                zzdof<InputStream> immediateFailedFuture = zzdnt.immediateFailedFuture(new zzcjv(1));
                return immediateFailedFuture;
            } else if (this.zzfyh) {
                zzazy zzazy = this.zzdcg;
                return zzazy;
            } else {
                this.zzfyq = zzcjq.zzfyt;
                this.zzfyh = true;
                this.zzfyp = str;
                this.zzfyk.checkAvailabilityAndConnect();
                this.zzdcg.addListener(new zzcjr(this), zzazq.zzdxp);
                zzazy zzazy2 = this.zzdcg;
                return zzazy2;
            }
        }
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzawf.zzeb("Cannot connect to remote service, fallback to local instance.");
        this.zzdcg.setException(new zzcjv(0));
    }

    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzfyi) {
                this.zzfyi = true;
                try {
                    if (this.zzfyq == zzcjq.zzfys) {
                        this.zzfyk.zzuc().zzc(this.zzfyj, new zzcjl(this));
                    } else if (this.zzfyq == zzcjq.zzfyt) {
                        this.zzfyk.zzuc().zza(this.zzfyp, (zzaqr) new zzcjl(this));
                    } else {
                        this.zzdcg.setException(new zzcjv(0));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdcg.setException(new zzcjv(0));
                } catch (Throwable th) {
                    zzq.zzkz().zza(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zzdcg.setException(new zzcjv(0));
                }
            }
        }
    }
}
