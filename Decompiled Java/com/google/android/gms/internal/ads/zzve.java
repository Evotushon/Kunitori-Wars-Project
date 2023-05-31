package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
abstract class zzve<T> {
    @Nullable
    private static final zzwg zzced = zzow();

    zzve() {
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract T zza(zzwg zzwg) throws RemoteException;

    /* access modifiers changed from: protected */
    @NonNull
    public abstract T zzou();

    /* access modifiers changed from: protected */
    @Nullable
    public abstract T zzov() throws RemoteException;

    private static zzwg zzow() {
        try {
            Object newInstance = zzus.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzazh.zzfa("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof zzwg) {
                return (zzwg) queryLocalInterface;
            }
            return new zzwi(iBinder);
        } catch (Exception unused) {
            zzazh.zzfa("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    @Nullable
    private final T zzox() {
        zzwg zzwg = zzced;
        if (zzwg == null) {
            zzazh.zzfa("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zza(zzwg);
        } catch (RemoteException e) {
            zzazh.zzd("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    @Nullable
    private final T zzoy() {
        try {
            return zzov();
        } catch (RemoteException e) {
            zzazh.zzd("Cannot invoke remote loader.", e);
            return null;
        }
    }

    public final T zzd(Context context, boolean z) {
        T t;
        boolean z2 = false;
        boolean z3 = z;
        if (!z3) {
            zzvh.zzoz();
            if (!zzayx.zzd(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzazh.zzeb("Google Play Services is not available.");
                z3 = true;
            }
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)) {
            z3 = true;
        }
        zzzx.initialize(context);
        if (zzabe.zzcue.get().booleanValue()) {
            z3 = false;
        }
        if (z3) {
            t = zzox();
            if (t == null) {
                t = zzoy();
            }
        } else {
            T zzoy = zzoy();
            int i = zzoy == null ? 1 : 0;
            if (i != 0) {
                if (zzvh.zzpg().nextInt(zzabo.zzcvh.get().intValue()) == 0) {
                    z2 = true;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    zzvh.zzoz().zza(context, zzvh.zzpf().zzbmj, "gmob-apps", bundle, true);
                }
            }
            t = zzoy == null ? zzox() : zzoy;
        }
        return t == null ? zzou() : t;
    }
}
