package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public interface zzhp {
    public static final ByteBuffer zzahl = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void flush();

    boolean isActive();

    void reset();

    boolean zzb(int i, int i2, int i3) throws zzho;

    boolean zzez();

    int zzfe();

    int zzff();

    void zzfg();

    ByteBuffer zzfh();

    void zzi(ByteBuffer byteBuffer);
}
