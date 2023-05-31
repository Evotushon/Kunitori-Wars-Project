package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdpm {
    private static final CopyOnWriteArrayList<zzdpn> zzhec = new CopyOnWriteArrayList<>();

    public static zzdpn zzgx(String str) throws GeneralSecurityException {
        Iterator<zzdpn> it = zzhec.iterator();
        while (it.hasNext()) {
            zzdpn next = it.next();
            if (next.zzgy(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
