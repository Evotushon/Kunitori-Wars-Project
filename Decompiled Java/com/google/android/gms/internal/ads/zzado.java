package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzado implements NativeCustomTemplateAd {
    private static WeakHashMap<IBinder, zzado> zzcxe = new WeakHashMap<>();
    private final VideoController zzcfe = new VideoController();
    private final zzadn zzcxf;
    private final MediaView zzcxg;
    private NativeCustomTemplateAd.DisplayOpenMeasurement zzcxh;

    @VisibleForTesting
    private zzado(zzadn zzadn) {
        Context context;
        this.zzcxf = zzadn;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzadn.zzro());
        } catch (RemoteException | NullPointerException e) {
            zzazh.zzc("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.zzcxf.zzp(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzazh.zzc("", e2);
            }
        }
        this.zzcxg = mediaView;
    }

    public static zzado zza(zzadn zzadn) {
        synchronized (zzcxe) {
            zzado zzado = zzcxe.get(zzadn.asBinder());
            if (zzado != null) {
                return zzado;
            }
            zzado zzado2 = new zzado(zzadn);
            zzcxe.put(zzadn.asBinder(), zzado2);
            return zzado2;
        }
    }

    public final zzadn zzrs() {
        return this.zzcxf;
    }

    public final CharSequence getText(String str) {
        try {
            return this.zzcxf.zzcu(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzacr zzcv = this.zzcxf.zzcv(str);
            if (zzcv != null) {
                return new zzacs(zzcv);
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzxj videoController = this.zzcxf.getVideoController();
            if (videoController != null) {
                this.zzcfe.zza(videoController);
            }
        } catch (RemoteException e) {
            zzazh.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcfe;
    }

    public final MediaView getVideoMediaView() {
        return this.zzcxg;
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zzcxf.getAvailableAssetNames();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.zzcxf.getCustomTemplateId();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zzcxf.performClick(str);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zzcxf.recordImpression();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzcxh == null && this.zzcxf.zzrp()) {
                this.zzcxh = new zzacn(this.zzcxf);
            }
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
        return this.zzcxh;
    }

    public final void destroy() {
        try {
            this.zzcxf.destroy();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
