package jp.co.koeitecmo.ktgl.android.systemfont;

import android.graphics.Paint;

public final class Measurement {
    private int height_;
    private int lineHeight_;
    private int width_;

    public Measurement(String str, Attribute attribute) {
        Paint paint = attribute.paint();
        String[] split = str.split(attribute.newline());
        float f = 0.0f;
        for (String measureText : split) {
            f = Math.max(f, paint.measureText(measureText));
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float abs = Math.abs(fontMetrics.descent) + Math.abs(fontMetrics.ascent);
        this.width_ = (int) f;
        this.height_ = (int) (((float) split.length) * abs);
        this.lineHeight_ = (int) abs;
    }

    public Measurement(String str) {
        this(str, new Attribute());
    }

    public final int width() {
        return this.width_;
    }

    public final int height() {
        return this.height_;
    }

    public final int lineHeight() {
        return this.lineHeight_;
    }
}
