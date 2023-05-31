package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class zzanw {
    public static zzanq zzdp(String str) throws RemoteException {
        try {
            return new zzanz((RtbAdapter) Class.forName(str, false, zzanw.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
