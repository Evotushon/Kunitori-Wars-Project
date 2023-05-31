package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdxq extends zzdxs {
    private final int limit = this.zzhoh.size();
    private int position = 0;
    private final /* synthetic */ zzdxn zzhoh;

    zzdxq(zzdxn zzdxn) {
        this.zzhoh = zzdxn;
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    public final byte nextByte() {
        int i = this.position;
        if (i < this.limit) {
            this.position = i + 1;
            return this.zzhoh.zzff(i);
        }
        throw new NoSuchElementException();
    }
}
