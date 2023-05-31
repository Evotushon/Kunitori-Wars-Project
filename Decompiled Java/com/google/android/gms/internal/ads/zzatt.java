package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import com.google.android.gms.internal.ads.zzede;
import java.io.ByteArrayOutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzatt implements Runnable {
    private final /* synthetic */ Bitmap val$bitmap;
    private final /* synthetic */ zzats zzdpu;

    zzatt(zzats zzats, Bitmap bitmap) {
        this.zzdpu = zzats;
        this.val$bitmap = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.val$bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.zzdpu.lock) {
            this.zzdpu.zzdpj.zziel = new zzedq();
            this.zzdpu.zzdpj.zziel.zziff = byteArrayOutputStream.toByteArray();
            this.zzdpu.zzdpj.zziel.mimeType = "image/png";
            this.zzdpu.zzdpj.zziel.zzife = zzede.zzb.zzf.zza.TYPE_CREATIVE;
        }
    }
}
