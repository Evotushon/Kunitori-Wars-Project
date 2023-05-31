package jp.co.koeitecmo.ktgl.android.systemfont;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import androidx.core.view.ViewCompat;

public final class Attribute {
    private int align_ = 0;
    private boolean antialiasing_ = true;
    private int backgroundColor_ = ViewCompat.MEASURED_STATE_MASK;
    private int fontColor_ = -1;
    private String newline_ = "\n";
    private int size_ = 26;
    private Typeface typeface_ = null;

    public final class Align {
        static final int LEFT = 0;

        public Align() {
        }
    }

    public Attribute() {
    }

    public Attribute(int i, boolean z, int i2, String str, int i3, int i4) {
        this.size_ = i;
        this.antialiasing_ = z;
        this.align_ = i2;
        this.newline_ = str;
        this.fontColor_ = i3;
        this.backgroundColor_ = i4;
    }

    public final int size() {
        return this.size_;
    }

    public final void size(int i) {
        this.size_ = i;
    }

    public final boolean antialiasing() {
        return this.antialiasing_;
    }

    public final void antialiasing(boolean z) {
        this.antialiasing_ = z;
    }

    public final int align() {
        return this.align_;
    }

    public final void align(int i) {
        this.align_ = i;
    }

    public final String newline() {
        return this.newline_;
    }

    public final void newline(String str) {
        this.newline_ = str;
    }

    public final int fontColor() {
        return this.fontColor_;
    }

    public final void fontColor(int i) {
        this.fontColor_ = i;
    }

    public final int backgroundColor() {
        return this.backgroundColor_;
    }

    public final void backgroundColor(int i) {
        this.backgroundColor_ = i;
    }

    public final Paint paint() {
        Paint paint = new Paint();
        Typeface typeface = this.typeface_;
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        paint.setTextSize((float) size());
        paint.setAntiAlias(antialiasing());
        paint.setColor(fontColor());
        if (align() == 0) {
            paint.setTextAlign(Paint.Align.LEFT);
        }
        return paint;
    }

    public final Canvas canvas(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(backgroundColor(), PorterDuff.Mode.SRC);
        return canvas;
    }
}
