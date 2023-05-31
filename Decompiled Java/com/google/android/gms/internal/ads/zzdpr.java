package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.ads.zzdum;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdpr<P> {
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private final Class<P> zzhdx;
    private ConcurrentMap<String, List<zzdpq<P>>> zzhei = new ConcurrentHashMap();
    private zzdpq<P> zzhej;

    public final zzdpq<P> zzavl() {
        return this.zzhej;
    }

    private zzdpr(Class<P> cls) {
        this.zzhdx = cls;
    }

    public static <P> zzdpr<P> zza(Class<P> cls) {
        return new zzdpr<>(cls);
    }

    public final void zza(zzdpq<P> zzdpq) {
        if (zzdpq == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (zzdpq.zzavi() == zzdug.ENABLED) {
            List list = (List) this.zzhei.get(new String(zzdpq.zzavk(), UTF_8));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.zzhej = zzdpq;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        } else {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
    }

    public final zzdpq<P> zza(P p, zzdum.zza zza) throws GeneralSecurityException {
        byte[] bArr;
        if (zza.zzavi() == zzdug.ENABLED) {
            int i = zzdpd.zzhdu[zza.zzavj().ordinal()];
            if (i == 1 || i == 2) {
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zza.zzaza()).array();
            } else if (i == 3) {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zza.zzaza()).array();
            } else if (i == 4) {
                bArr = zzdpa.zzhdt;
            } else {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzdpq zzdpq = new zzdpq(p, bArr, zza.zzavi(), zza.zzavj(), zza.zzaza());
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzdpq);
            String str = new String(zzdpq.zzavk(), UTF_8);
            List list = (List) this.zzhei.put(str, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzdpq);
                this.zzhei.put(str, Collections.unmodifiableList(arrayList2));
            }
            return zzdpq;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final Class<P> zzauy() {
        return this.zzhdx;
    }
}
