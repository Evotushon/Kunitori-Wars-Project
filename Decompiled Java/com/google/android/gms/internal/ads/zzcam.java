package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcam implements zzbzh {
    private final zzazo zzblu;
    private final zzdei zzfhg;
    private final zzdeu zzfir;
    private final zzbqp zzfnf;
    private final zzbqg zzfng;
    private boolean zzfnk = false;
    private boolean zzfnn = false;
    @Nullable
    private final zzalx zzfrl;
    @Nullable
    private final zzaly zzfrm;
    @Nullable
    private final zzamd zzfrn;
    private final Context zzur;

    public zzcam(@Nullable zzalx zzalx, @Nullable zzaly zzaly, @Nullable zzamd zzamd, zzbqp zzbqp, zzbqg zzbqg, Context context, zzdei zzdei, zzazo zzazo, zzdeu zzdeu) {
        this.zzfrl = zzalx;
        this.zzfrm = zzaly;
        this.zzfrn = zzamd;
        this.zzfnf = zzbqp;
        this.zzfng = zzbqg;
        this.zzur = context;
        this.zzfhg = zzdei;
        this.zzblu = zzazo;
        this.zzfir = zzdeu;
    }

    public final void cancelUnconfirmedClick() {
    }

    public final void destroy() {
    }

    public final void setClickConfirmingView(View view) {
    }

    public final void zza(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    public final void zza(zzaem zzaem) {
    }

    public final void zzajs() {
    }

    public final void zzaju() {
    }

    public final void zzf(Bundle bundle) {
    }

    public final void zzfv(String str) {
    }

    public final void zzg(Bundle bundle) {
    }

    public final boolean zzh(Bundle bundle) {
        return false;
    }

    public final void zza(View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            HashMap<String, View> zzb = zzb(map);
            HashMap<String, View> zzb2 = zzb(map2);
            if (this.zzfrn != null) {
                this.zzfrn.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
            } else if (this.zzfrl != null) {
                this.zzfrl.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzfrl.zzv(wrap);
            } else if (this.zzfrm != null) {
                this.zzfrm.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzfrm.zzv(wrap);
            }
        } catch (RemoteException e) {
            zzawf.zzd("Failed to call trackView", e);
        }
    }

    private static HashMap<String, View> zzb(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    public final void zza(View view, @Nullable Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            if (this.zzfrn != null) {
                this.zzfrn.zzw(wrap);
            } else if (this.zzfrl != null) {
                this.zzfrl.zzw(wrap);
            } else if (this.zzfrm != null) {
                this.zzfrm.zzw(wrap);
            }
        } catch (RemoteException e) {
            zzawf.zzd("Failed to call untrackView", e);
        }
    }

    public final void zza(View view, @Nullable View view2, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfnn || !this.zzfhg.zzdee) {
            zzac(view);
        }
    }

    private final void zzac(View view) {
        try {
            if (this.zzfrn != null && !this.zzfrn.getOverrideClickHandling()) {
                this.zzfrn.zzu(ObjectWrapper.wrap(view));
                this.zzfng.onAdClicked();
            } else if (this.zzfrl != null && !this.zzfrl.getOverrideClickHandling()) {
                this.zzfrl.zzu(ObjectWrapper.wrap(view));
                this.zzfng.onAdClicked();
            } else if (this.zzfrm != null && !this.zzfrm.getOverrideClickHandling()) {
                this.zzfrm.zzu(ObjectWrapper.wrap(view));
                this.zzfng.onAdClicked();
            }
        } catch (RemoteException e) {
            zzawf.zzd("Failed to call handleClick", e);
        }
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfnn) {
            zzawf.zzfa("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzfhg.zzdee) {
            zzawf.zzfa("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
        } else {
            zzac(view);
        }
    }

    public final void zzru() {
        this.zzfnn = true;
    }

    public final boolean isCustomClickGestureEnabled() {
        return this.zzfhg.zzdee;
    }

    public final void zza(@Nullable View view, @Nullable Map<String, WeakReference<View>> map, @Nullable Map<String, WeakReference<View>> map2) {
        try {
            if (!this.zzfnk && this.zzfhg.zzgpv != null) {
                this.zzfnk |= zzq.zzlf().zzb(this.zzur, this.zzblu.zzbmj, this.zzfhg.zzgpv.toString(), this.zzfir.zzgqr);
            }
            if (this.zzfrn != null && !this.zzfrn.getOverrideImpressionRecording()) {
                this.zzfrn.recordImpression();
                this.zzfnf.onAdImpression();
            } else if (this.zzfrl != null && !this.zzfrl.getOverrideImpressionRecording()) {
                this.zzfrl.recordImpression();
                this.zzfnf.onAdImpression();
            } else if (this.zzfrm != null && !this.zzfrm.getOverrideImpressionRecording()) {
                this.zzfrm.recordImpression();
                this.zzfnf.onAdImpression();
            }
        } catch (RemoteException e) {
            zzawf.zzd("Failed to call recordImpression", e);
        }
    }

    public final void zza(@Nullable zzwu zzwu) {
        zzawf.zzfa("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zza(zzwq zzwq) {
        zzawf.zzfa("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzajt() {
        zzawf.zzfa("Mute This Ad is not supported for 3rd party ads");
    }
}
