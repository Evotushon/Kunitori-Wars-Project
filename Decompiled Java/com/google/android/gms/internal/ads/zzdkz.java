package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzdkz {
    private final String className;
    private final zzdky zzgyr;
    private zzdky zzgys;
    private boolean zzgyt;

    private zzdkz(String str) {
        this.zzgyr = new zzdky();
        this.zzgys = this.zzgyr;
        this.zzgyt = false;
        this.className = (String) zzdlg.checkNotNull(str);
    }

    public final zzdkz zzab(@NullableDecl Object obj) {
        zzdky zzdky = new zzdky();
        this.zzgys.zzgyq = zzdky;
        this.zzgys = zzdky;
        zzdky.value = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.className);
        sb.append('{');
        zzdky zzdky = this.zzgyr.zzgyq;
        String str = "";
        while (zzdky != null) {
            Object obj = zzdky.value;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzdky = zzdky.zzgyq;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
