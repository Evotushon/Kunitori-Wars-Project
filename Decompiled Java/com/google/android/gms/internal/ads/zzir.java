package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzir {
    public byte[] iv;
    private byte[] key;
    private int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    private int numSubSamples;
    private int zzamf;
    private int zzamg;
    private final MediaCodec.CryptoInfo zzamh;
    private final zzit zzami;

    public zzir() {
        this.zzamh = zzop.SDK_INT >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzami = zzop.SDK_INT >= 24 ? new zzit(this.zzamh) : null;
    }

    public final void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.mode = i2;
        this.zzamf = 0;
        this.zzamg = 0;
        if (zzop.SDK_INT >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.zzamh;
            cryptoInfo.numSubSamples = this.numSubSamples;
            cryptoInfo.numBytesOfClearData = this.numBytesOfClearData;
            cryptoInfo.numBytesOfEncryptedData = this.numBytesOfEncryptedData;
            cryptoInfo.key = this.key;
            cryptoInfo.iv = this.iv;
            cryptoInfo.mode = this.mode;
            if (zzop.SDK_INT >= 24) {
                this.zzami.set(0, 0);
            }
        }
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo zzgh() {
        return this.zzamh;
    }
}
