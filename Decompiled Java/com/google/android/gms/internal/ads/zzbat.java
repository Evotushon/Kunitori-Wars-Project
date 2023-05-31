package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzbat extends TextureView implements zzbbq {
    protected final zzbbd zzdyy = new zzbbd();
    protected final zzbbn zzdyz;

    public zzbat(Context context) {
        super(context);
        this.zzdyz = new zzbbn(context, this);
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void pause();

    public abstract void play();

    public abstract void seekTo(int i);

    public abstract void setVideoPath(String str);

    public abstract void stop();

    public abstract void zza(float f, float f2);

    public abstract void zza(zzbau zzbau);

    public void zzcv(int i) {
    }

    public void zzcw(int i) {
    }

    public void zzcx(int i) {
    }

    public void zzcy(int i) {
    }

    public void zzcz(int i) {
    }

    public abstract String zzxt();

    public abstract void zzxx();

    public void zzb(String str, String[] strArr) {
        setVideoPath(str);
    }
}
