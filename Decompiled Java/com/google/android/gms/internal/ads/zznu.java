package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zznu extends IOException {
    private final int type;
    private final zznp zzbff;

    public zznu(String str, zznp zznp, int i) {
        super(str);
        this.zzbff = zznp;
        this.type = 1;
    }

    public zznu(IOException iOException, zznp zznp, int i) {
        super(iOException);
        this.zzbff = zznp;
        this.type = i;
    }

    public zznu(String str, IOException iOException, zznp zznp, int i) {
        super(str, iOException);
        this.zzbff = zznp;
        this.type = 1;
    }
}
