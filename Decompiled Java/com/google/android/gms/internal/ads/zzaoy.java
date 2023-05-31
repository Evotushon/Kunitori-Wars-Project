package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaoy {
    private static final Object lock = new Object();
    @GuardedBy("lock")
    @VisibleForTesting
    private static boolean zzdhn = false;
    @GuardedBy("lock")
    @VisibleForTesting
    private static boolean zzyb = false;
    @VisibleForTesting
    private zzdit zzdho;

    public final boolean zzq(Context context) {
        synchronized (lock) {
            if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue()) {
                return false;
            }
            if (zzyb) {
                return true;
            }
            try {
                zzr(context);
                boolean zzau = this.zzdho.zzau(ObjectWrapper.wrap(context));
                zzyb = zzau;
                return zzau;
            } catch (RemoteException e) {
                e = e;
                zzazh.zze("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                zzazh.zze("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    @VisibleForTesting
    private final void zzr(Context context) {
        synchronized (lock) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue() && !zzdhn) {
                try {
                    zzdhn = true;
                    this.zzdho = (zzdit) zzazk.zza(context, "com.google.android.gms.ads.omid.DynamiteOmid", zzapa.zzbun);
                } catch (zzazm e) {
                    zzazh.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Nullable
    public final String getVersion(Context context) {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue()) {
            return null;
        }
        try {
            zzr(context);
            String valueOf = String.valueOf(this.zzdho.getVersion());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Nullable
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4) {
        return zza(str, webView, str2, str3, str4, "Google");
    }

    @Nullable
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (lock) {
            try {
                if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue()) {
                    if (zzyb) {
                        try {
                            return this.zzdho.zza(str, ObjectWrapper.wrap(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            zzazh.zze("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final void zzab(IObjectWrapper iObjectWrapper) {
        synchronized (lock) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue()) {
                if (zzyb) {
                    try {
                        this.zzdho.zzab(iObjectWrapper);
                    } catch (RemoteException | NullPointerException e) {
                        zzazh.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void zzac(IObjectWrapper iObjectWrapper) {
        synchronized (lock) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue()) {
                if (zzyb) {
                    try {
                        this.zzdho.zzac(iObjectWrapper);
                    } catch (RemoteException | NullPointerException e) {
                        zzazh.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, View view) {
        synchronized (lock) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue()) {
                if (zzyb) {
                    try {
                        this.zzdho.zzc(iObjectWrapper, ObjectWrapper.wrap(view));
                    } catch (RemoteException | NullPointerException e) {
                        zzazh.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, View view) {
        synchronized (lock) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue()) {
                if (zzyb) {
                    try {
                        this.zzdho.zzd(iObjectWrapper, ObjectWrapper.wrap(view));
                    } catch (RemoteException | NullPointerException e) {
                        zzazh.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
