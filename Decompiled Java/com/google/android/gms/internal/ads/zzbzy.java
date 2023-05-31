package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzy implements View.OnClickListener {
    private final Clock zzbmz;
    private final zzccv zzfqy;
    @Nullable
    private zzaem zzfqz;
    @Nullable
    private zzafz<Object> zzfra;
    @VisibleForTesting
    @Nullable
    String zzfrb;
    @VisibleForTesting
    @Nullable
    Long zzfrc;
    @VisibleForTesting
    @Nullable
    WeakReference<View> zzfrd;

    public zzbzy(zzccv zzccv, Clock clock) {
        this.zzfqy = zzccv;
        this.zzbmz = clock;
    }

    public final void zza(zzaem zzaem) {
        this.zzfqz = zzaem;
        zzafz<Object> zzafz = this.zzfra;
        if (zzafz != null) {
            this.zzfqy.zzb("/unconfirmedClick", zzafz);
        }
        this.zzfra = new zzcab(this, zzaem);
        this.zzfqy.zza("/unconfirmedClick", this.zzfra);
    }

    @Nullable
    public final zzaem zzaln() {
        return this.zzfqz;
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzfqz != null && this.zzfrc != null) {
            zzalo();
            try {
                this.zzfqz.onUnconfirmedClickCancelled();
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzfrd;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zzfrb == null || this.zzfrc == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zzfrb);
                hashMap.put("time_interval", String.valueOf(this.zzbmz.currentTimeMillis() - this.zzfrc.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzfqy.zza("sendMessageToNativeJs", (Map<String, ?>) hashMap);
            }
            zzalo();
        }
    }

    private final void zzalo() {
        View view;
        this.zzfrb = null;
        this.zzfrc = null;
        WeakReference<View> weakReference = this.zzfrd;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzfrd = null;
        }
    }
}
