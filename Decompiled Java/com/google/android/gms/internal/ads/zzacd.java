package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzacd extends zzacq {
    private final int height;
    private final Uri uri;
    private final int width;
    private final Drawable zzcwq;
    private final double zzcwr;

    public zzacd(Drawable drawable, Uri uri2, double d, int i, int i2) {
        this.zzcwq = drawable;
        this.uri = uri2;
        this.zzcwr = d;
        this.width = i;
        this.height = i2;
    }

    public final IObjectWrapper zzrg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzcwq);
    }

    public final Uri getUri() throws RemoteException {
        return this.uri;
    }

    public final double getScale() {
        return this.zzcwr;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }
}
