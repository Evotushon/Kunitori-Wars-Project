package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzayx;
import com.google.android.gms.internal.ads.zzvh;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzo extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdjb;
    private final zzw zzdjc;

    public zzo(Context context, zzr zzr, @Nullable zzw zzw) {
        super(context);
        this.zzdjc = zzw;
        setOnClickListener(this);
        this.zzdjb = new ImageButton(context);
        this.zzdjb.setImageResource(17301527);
        this.zzdjb.setBackgroundColor(0);
        this.zzdjb.setOnClickListener(this);
        ImageButton imageButton = this.zzdjb;
        zzvh.zzoz();
        int zzb = zzayx.zzb(context, zzr.paddingLeft);
        zzvh.zzoz();
        int zzb2 = zzayx.zzb(context, 0);
        zzvh.zzoz();
        int zzb3 = zzayx.zzb(context, zzr.paddingRight);
        zzvh.zzoz();
        imageButton.setPadding(zzb, zzb2, zzb3, zzayx.zzb(context, zzr.paddingBottom));
        this.zzdjb.setContentDescription("Interstitial close button");
        ImageButton imageButton2 = this.zzdjb;
        zzvh.zzoz();
        int zzb4 = zzayx.zzb(context, zzr.size + zzr.paddingLeft + zzr.paddingRight);
        zzvh.zzoz();
        addView(imageButton2, new FrameLayout.LayoutParams(zzb4, zzayx.zzb(context, zzr.size + zzr.paddingBottom), 17));
    }

    public final void onClick(View view) {
        zzw zzw = this.zzdjc;
        if (zzw != null) {
            zzw.zztq();
        }
    }

    public final void zzal(boolean z) {
        if (z) {
            this.zzdjb.setVisibility(8);
        } else {
            this.zzdjb.setVisibility(0);
        }
    }
}
