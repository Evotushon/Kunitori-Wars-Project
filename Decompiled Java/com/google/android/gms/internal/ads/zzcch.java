package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcch extends zzahm implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzaca {
    private boolean zzehn = false;
    private zzxj zzfpc;
    private View zzfph;
    private zzbyo zzfqg;
    private boolean zzftd = false;

    public zzcch(zzbyo zzbyo, zzbyz zzbyz) {
        this.zzfph = zzbyz.zzaki();
        this.zzfpc = zzbyz.getVideoController();
        this.zzfqg = zzbyo;
        if (zzbyz.zzakj() != null) {
            zzbyz.zzakj().zza((zzaca) this);
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaho zzaho) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzehn) {
            zzawf.zzey("Instream ad can not be shown after destroy().");
            zza(zzaho, 2);
        } else if (this.zzfph == null || this.zzfpc == null) {
            String str = this.zzfph == null ? "can not get video view." : "can not get video controller.";
            zzawf.zzey(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            zza(zzaho, 0);
        } else if (this.zzftd) {
            zzawf.zzey("Instream ad should not be used again.");
            zza(zzaho, 1);
        } else {
            this.zzftd = true;
            zzalt();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zzfph, new ViewGroup.LayoutParams(-1, -1));
            zzq.zzls();
            zzbag.zza(this.zzfph, (ViewTreeObserver.OnGlobalLayoutListener) this);
            zzq.zzls();
            zzbag.zza(this.zzfph, (ViewTreeObserver.OnScrollChangedListener) this);
            zzalu();
            try {
                zzaho.zzrz();
            } catch (RemoteException e) {
                zzawf.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zza(iObjectWrapper, (zzaho) new zzccj(this));
    }

    public final zzxj getVideoController() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzehn) {
            return this.zzfpc;
        }
        zzawf.zzey("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzacm zzrv() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzehn) {
            zzawf.zzey("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzbyo zzbyo = this.zzfqg;
        if (zzbyo == null || zzbyo.zzakb() == null) {
            return null;
        }
        return this.zzfqg.zzakb().zzrv();
    }

    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzalt();
        zzbyo zzbyo = this.zzfqg;
        if (zzbyo != null) {
            zzbyo.destroy();
        }
        this.zzfqg = null;
        this.zzfph = null;
        this.zzfpc = null;
        this.zzehn = true;
    }

    private final void zzalt() {
        View view = this.zzfph;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zzfph);
            }
        }
    }

    public final void onGlobalLayout() {
        zzalu();
    }

    public final void onScrollChanged() {
        zzalu();
    }

    public final void zzrf() {
        zzawo.zzdtx.post(new zzccg(this));
    }

    private final void zzalu() {
        View view;
        zzbyo zzbyo = this.zzfqg;
        if (zzbyo != null && (view = this.zzfph) != null) {
            zzbyo.zzb(view, Collections.emptyMap(), Collections.emptyMap(), zzbyo.zzy(this.zzfph));
        }
    }

    private static void zza(zzaho zzaho, int i) {
        try {
            zzaho.zzcn(i);
        } catch (RemoteException e) {
            zzawf.zze("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzalv() {
        try {
            destroy();
        } catch (RemoteException e) {
            zzawf.zze("#007 Could not call remote method.", e);
        }
    }
}
