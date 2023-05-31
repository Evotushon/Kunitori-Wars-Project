package jp.co.koeitecmo.ktgl.android.systemfont;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public final class Bitmap {
    private int[] data_ = null;
    private int height_;
    private int width_;

    public Bitmap(String str, Attribute attribute) {
        this.width_ = 0;
        this.height_ = 0;
        Measurement measurement = new Measurement(str, attribute);
        int width = measurement.width();
        int height = measurement.height();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = attribute.canvas(createBitmap);
        Paint paint = attribute.paint();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        String[] split = str.split(attribute.newline());
        int lineHeight = measurement.lineHeight();
        int abs = (int) Math.abs(fontMetrics.descent);
        int i = lineHeight;
        for (String drawText : split) {
            canvas.drawText(drawText, 0.0f, (float) (i - abs), paint);
            i += lineHeight;
        }
        int[] iArr = new int[(width * height)];
        createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        this.data_ = iArr;
        this.width_ = width;
        this.height_ = height;
    }

    public final int[] data() {
        return this.data_;
    }

    public final int width() {
        return this.width_;
    }

    public final int height() {
        return this.height_;
    }
}
