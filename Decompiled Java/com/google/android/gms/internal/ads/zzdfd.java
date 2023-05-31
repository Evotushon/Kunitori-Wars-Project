package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfd {
    public static ParcelFileDescriptor zze(InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzazq.zzdxk.execute(new zzdfg(inputStream, createPipe[1]));
        return parcelFileDescriptor;
    }
}
