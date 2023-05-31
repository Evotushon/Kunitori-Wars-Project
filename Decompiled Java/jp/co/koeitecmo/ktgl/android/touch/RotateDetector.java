package jp.co.koeitecmo.ktgl.android.touch;

import android.view.MotionEvent;

public final class RotateDetector {
    private static final float ROTATE_COEFFICIENT = 80.0f;
    boolean is_gesturing_ = false;
    private OnRotateListener listener_;
    float prev_delta_;
    float prev_length_x_;
    float prev_length_y_;
    float prev_tan_;

    public interface OnRotateListener {
        boolean onRotate(float f);

        boolean onRotateBegin(float f);

        boolean onRotateEnd(float f);
    }

    RotateDetector(OnRotateListener onRotateListener) {
        this.listener_ = onRotateListener;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = true;
        if (2 == motionEvent.getPointerCount() && 2 == motionEvent.getActionMasked()) {
            float x = motionEvent.getX(1) - motionEvent.getX(0);
            float y = motionEvent.getY(1) - motionEvent.getY(0);
            float degrees = (float) Math.toDegrees(Math.atan2((double) y, (double) x));
            if (!(this.prev_length_x_ == 0.0f || this.prev_length_y_ == 0.0f)) {
                float f = degrees - this.prev_tan_;
                if (f < -180.0f) {
                    f += 360.0f;
                } else if (f > 180.0f) {
                    f -= 360.0f;
                }
                float radians = ((float) Math.toRadians((double) f)) * ROTATE_COEFFICIENT;
                if (!this.is_gesturing_) {
                    z = this.listener_.onRotateBegin(radians);
                    this.is_gesturing_ = true;
                } else {
                    z = this.listener_.onRotate(radians);
                }
                z2 = z;
                this.prev_delta_ = radians;
            }
            this.prev_length_x_ = x;
            this.prev_length_y_ = y;
            this.prev_tan_ = degrees;
            return z2;
        }
        if (1 == motionEvent.getActionMasked() || 3 == motionEvent.getActionMasked()) {
            this.listener_.onRotateEnd(this.prev_delta_);
            this.prev_delta_ = 0.0f;
            this.is_gesturing_ = false;
        } else if (1 == motionEvent.getPointerCount()) {
            this.listener_.onRotate(this.prev_delta_);
        }
        this.prev_length_x_ = 0.0f;
        this.prev_length_y_ = 0.0f;
        this.prev_tan_ = 0.0f;
        return true;
    }
}
