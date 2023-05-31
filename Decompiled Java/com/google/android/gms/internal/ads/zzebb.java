package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebb implements Iterator<zzdxy> {
    private final ArrayDeque<zzeba> zzhwl;
    private zzdxy zzhwm;

    private zzebb(zzdxn zzdxn) {
        if (zzdxn instanceof zzeba) {
            zzeba zzeba = (zzeba) zzdxn;
            this.zzhwl = new ArrayDeque<>(zzeba.zzbav());
            this.zzhwl.push(zzeba);
            this.zzhwm = zzak(zzeba.zzhwh);
            return;
        }
        this.zzhwl = null;
        this.zzhwm = (zzdxy) zzdxn;
    }

    private final zzdxy zzak(zzdxn zzdxn) {
        while (zzdxn instanceof zzeba) {
            zzeba zzeba = (zzeba) zzdxn;
            this.zzhwl.push(zzeba);
            zzdxn = zzeba.zzhwh;
        }
        return (zzdxy) zzdxn;
    }

    public final boolean hasNext() {
        return this.zzhwm != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        zzdxy zzdxy;
        zzdxy zzdxy2 = this.zzhwm;
        if (zzdxy2 != null) {
            while (true) {
                ArrayDeque<zzeba> arrayDeque = this.zzhwl;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    zzdxy = zzak(this.zzhwl.pop().zzhwi);
                    if (!zzdxy.isEmpty()) {
                        break;
                    }
                } else {
                    zzdxy = null;
                }
            }
            zzdxy = null;
            this.zzhwm = zzdxy;
            return zzdxy2;
        }
        throw new NoSuchElementException();
    }

    /* synthetic */ zzebb(zzdxn zzdxn, zzeaz zzeaz) {
        this(zzdxn);
    }
}
