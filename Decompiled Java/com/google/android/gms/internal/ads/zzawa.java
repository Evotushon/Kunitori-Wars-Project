package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzawa {
    @GuardedBy("this")
    private String zzdjw = "0";
    @GuardedBy("this")
    private BigInteger zzdst = BigInteger.ONE;

    public final synchronized String zzvu() {
        String bigInteger;
        bigInteger = this.zzdst.toString();
        this.zzdst = this.zzdst.add(BigInteger.ONE);
        this.zzdjw = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzvv() {
        return this.zzdjw;
    }
}
