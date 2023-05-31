package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzeaz extends zzdxs {
    private final zzebb zzhwc = new zzebb(this.zzhwe, (zzeaz) null);
    private zzdxw zzhwd = zzbep();
    private final /* synthetic */ zzeba zzhwe;

    zzeaz(zzeba zzeba) {
        this.zzhwe = zzeba;
    }

    private final zzdxw zzbep() {
        if (this.zzhwc.hasNext()) {
            return (zzdxw) ((zzdxy) this.zzhwc.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzhwd != null;
    }

    public final byte nextByte() {
        zzdxw zzdxw = this.zzhwd;
        if (zzdxw != null) {
            byte nextByte = zzdxw.nextByte();
            if (!this.zzhwd.hasNext()) {
                this.zzhwd = zzbep();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
