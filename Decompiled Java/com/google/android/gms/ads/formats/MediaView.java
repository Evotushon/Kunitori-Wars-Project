package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.zzacc;
import com.google.android.gms.internal.ads.zzace;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class MediaView extends FrameLayout {
    private MediaContent zzbjx;
    private boolean zzbjy;
    private zzacc zzbjz;
    private ImageView.ScaleType zzbka;
    private boolean zzbkb;
    private zzace zzbkc;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.zzbjy = true;
        this.zzbjx = mediaContent;
        zzacc zzacc = this.zzbjz;
        if (zzacc != null) {
            zzacc.setMediaContent(mediaContent);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zza(zzacc zzacc) {
        this.zzbjz = zzacc;
        if (this.zzbjy) {
            zzacc.setMediaContent(this.zzbjx);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzbkb = true;
        this.zzbka = scaleType;
        zzace zzace = this.zzbkc;
        if (zzace != null) {
            zzace.setImageScaleType(this.zzbka);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zza(zzace zzace) {
        this.zzbkc = zzace;
        if (this.zzbkb) {
            zzace.setImageScaleType(this.zzbka);
        }
    }
}
