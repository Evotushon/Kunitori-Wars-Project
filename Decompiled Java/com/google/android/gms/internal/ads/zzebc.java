package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzebc {
    private final ArrayDeque<zzdxn> zzhwn;

    private zzebc() {
        this.zzhwn = new ArrayDeque<>();
    }

    /* access modifiers changed from: private */
    public final zzdxn zzc(zzdxn zzdxn, zzdxn zzdxn2) {
        zzal(zzdxn);
        zzal(zzdxn2);
        zzdxn pop = this.zzhwn.pop();
        while (!this.zzhwn.isEmpty()) {
            pop = new zzeba(this.zzhwn.pop(), pop, (zzeaz) null);
        }
        return pop;
    }

    private final void zzal(zzdxn zzdxn) {
        while (!zzdxn.zzbaw()) {
            if (zzdxn instanceof zzeba) {
                zzeba zzeba = (zzeba) zzdxn;
                zzal(zzeba.zzhwh);
                zzdxn = zzeba.zzhwi;
            } else {
                String valueOf = String.valueOf(zzdxn.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int zzgv = zzgv(zzdxn.size());
        int zzgu = zzeba.zzgu(zzgv + 1);
        if (this.zzhwn.isEmpty() || this.zzhwn.peek().size() >= zzgu) {
            this.zzhwn.push(zzdxn);
            return;
        }
        int zzgu2 = zzeba.zzgu(zzgv);
        zzdxn pop = this.zzhwn.pop();
        while (!this.zzhwn.isEmpty() && this.zzhwn.peek().size() < zzgu2) {
            pop = new zzeba(this.zzhwn.pop(), pop, (zzeaz) null);
        }
        zzeba zzeba2 = new zzeba(pop, zzdxn, (zzeaz) null);
        while (!this.zzhwn.isEmpty() && this.zzhwn.peek().size() < zzeba.zzgu(zzgv(zzeba2.size()) + 1)) {
            zzeba2 = new zzeba(this.zzhwn.pop(), zzeba2, (zzeaz) null);
        }
        this.zzhwn.push(zzeba2);
    }

    private static int zzgv(int i) {
        int binarySearch = Arrays.binarySearch(zzeba.zzhwf, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzebc(zzeaz zzeaz) {
        this();
    }
}
