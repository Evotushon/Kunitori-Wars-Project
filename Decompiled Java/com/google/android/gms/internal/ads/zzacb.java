package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzacb extends RelativeLayout {
    private static final float[] zzcwo = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    @Nullable
    private AnimationDrawable zzcwp;

    public zzacb(Context context, zzaby zzaby, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzaby);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzcwo, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(zzaby.getBackgroundColor());
        setLayoutParams(layoutParams);
        zzq.zzkx();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzaby.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzaby.getText());
            textView.setTextColor(zzaby.getTextColor());
            textView.setTextSize((float) zzaby.getTextSize());
            zzvh.zzoz();
            int zzb = zzayx.zzb(context, 4);
            zzvh.zzoz();
            textView.setPadding(zzb, 0, zzayx.zzb(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzacd> zzrc = zzaby.zzrc();
        if (zzrc != null && zzrc.size() > 1) {
            this.zzcwp = new AnimationDrawable();
            for (zzacd zzrg : zzrc) {
                try {
                    this.zzcwp.addFrame((Drawable) ObjectWrapper.unwrap(zzrg.zzrg()), zzaby.zzrd());
                } catch (Exception e) {
                    zzawf.zzc("Error while getting drawable.", e);
                }
            }
            zzq.zzkx();
            imageView.setBackground(this.zzcwp);
        } else if (zzrc.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(zzrc.get(0).zzrg()));
            } catch (Exception e2) {
                zzawf.zzc("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzcwp;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
