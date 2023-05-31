package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzazk {
    public static <T> T zza(Context context, String str, zzazj<IBinder, T> zzazj) throws zzazm {
        try {
            return zzazj.apply(zzbt(context).instantiate(str));
        } catch (Exception e) {
            throw new zzazm(e);
        }
    }

    public static Context zzbs(Context context) throws zzazm {
        return zzbt(context).getModuleContext();
    }

    private static DynamiteModule zzbt(Context context) throws zzazm {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzazm(e);
        }
    }
}
