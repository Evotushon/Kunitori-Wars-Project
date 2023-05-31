package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzacs extends NativeAd.Image {
    private final int height;
    private final Uri uri;
    private final int width;
    private final double zzcwr;
    private final zzacr zzcww;
    private final Drawable zzcwx;

    public zzacs(zzacr zzacr) {
        Drawable drawable;
        int i;
        this.zzcww = zzacr;
        Uri uri2 = null;
        try {
            IObjectWrapper zzrg = this.zzcww.zzrg();
            if (zzrg != null) {
                drawable = (Drawable) ObjectWrapper.unwrap(zzrg);
                this.zzcwx = drawable;
                uri2 = this.zzcww.getUri();
                this.uri = uri2;
                double d = 1.0d;
                d = this.zzcww.getScale();
                this.zzcwr = d;
                int i2 = -1;
                i = this.zzcww.getWidth();
                this.width = i;
                i2 = this.zzcww.getHeight();
                this.height = i2;
            }
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
        drawable = null;
        this.zzcwx = drawable;
        try {
            uri2 = this.zzcww.getUri();
        } catch (RemoteException e2) {
            zzazh.zzc("", e2);
        }
        this.uri = uri2;
        double d2 = 1.0d;
        try {
            d2 = this.zzcww.getScale();
        } catch (RemoteException e3) {
            zzazh.zzc("", e3);
        }
        this.zzcwr = d2;
        int i22 = -1;
        try {
            i = this.zzcww.getWidth();
        } catch (RemoteException e4) {
            zzazh.zzc("", e4);
            i = -1;
        }
        this.width = i;
        try {
            i22 = this.zzcww.getHeight();
        } catch (RemoteException e5) {
            zzazh.zzc("", e5);
        }
        this.height = i22;
    }

    public final Drawable getDrawable() {
        return this.zzcwx;
    }

    public final Uri getUri() {
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
