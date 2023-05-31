package jp.co.koeitecmo.ktgl.android.touch;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import jp.co.koeitecmo.ktgl.android.touch.RotateDetector;

public final class Region {
    private final int G_DEFAULT_TOUCH_ID = 0;
    private final short G_INVALID_REGION_ID = -1;
    /* access modifiers changed from: private */
    public short region_id_;
    private SimpleView simple_view_raw_ = null;
    /* access modifiers changed from: private */
    public android.view.View view_ = null;
    private View view_raw_ = null;

    /* access modifiers changed from: private */
    public native void downGesture(short s, float f, float f2, int i);

    private native void fringGesture(short s, float f, float f2);

    /* access modifiers changed from: private */
    public native void longPressEndGesture(short s, float f, float f2);

    /* access modifiers changed from: private */
    public native void longPressGesture(short s, float f, float f2);

    /* access modifiers changed from: private */
    public native void longPressMoveGesture(short s, float f, float f2, float f3, float f4);

    /* access modifiers changed from: private */
    public native void rotateBeginGesture(short s, float f);

    /* access modifiers changed from: private */
    public native void rotateEndGesture(short s, float f);

    /* access modifiers changed from: private */
    public native void rotateGesture(short s, float f);

    /* access modifiers changed from: private */
    public native void scaleBeginGesture(short s, float f);

    /* access modifiers changed from: private */
    public native void scaleEndGesture(short s, float f);

    /* access modifiers changed from: private */
    public native void scaleGesture(short s, float f);

    /* access modifiers changed from: private */
    public native void scrollGesture(short s, float f, float f2, float f3, float f4, int i);

    /* access modifiers changed from: private */
    public native void setViewSize(short s, float f, float f2, float f3, float f4);

    /* access modifiers changed from: private */
    public native void showPressGesture(short s, float f, float f2);

    /* access modifiers changed from: private */
    public native void singleTapUpGesture(short s, float f, float f2);

    /* access modifiers changed from: private */
    public native void upGesture(short s, float f, float f2, int i);

    public Region(Context context, float f, float f2, float f3, float f4, short s, boolean z, boolean z2) {
        this.region_id_ = s;
        if (z2) {
            this.view_raw_ = new View(context, f, f2, f3, f4, z);
            this.view_ = this.view_raw_;
            return;
        }
        this.simple_view_raw_ = new SimpleView(context, f, f2, f3, f4, z);
        this.view_ = this.simple_view_raw_;
    }

    public android.view.View getView() {
        return this.view_;
    }

    public void invalidateView() {
        this.region_id_ = -1;
        final ViewGroup viewGroup = (ViewGroup) this.view_.getParent();
        if (viewGroup != null) {
            createUIHandler().post(new Runnable() {
                public final void run() {
                    viewGroup.removeView(Region.this.view_);
                }
            });
        }
    }

    private class View extends android.view.View implements GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, RotateDetector.OnRotateListener {
        private static final int DETECT_LONG_PRESS = 1;
        private static final int DETECT_NONE = 0;
        private static final int DETECT_PINCH = 2;
        private static final int DETECT_ROTATE = 3;
        private static final float PINCH_COEFFICIENT = 0.4f;
        private static final float ROTATE_RANGE = 60.0f;
        /* access modifiers changed from: private */
        public ScaleGestureDetector ges_pinch_ = null;
        /* access modifiers changed from: private */
        public RotateDetector ges_rotate_ = null;
        /* access modifiers changed from: private */
        public GestureDetector ges_single_ = null;
        /* access modifiers changed from: private */
        public float height_ = 0.0f;
        private boolean is_cover_parent_ = false;
        /* access modifiers changed from: private */
        public float left_ = 0.0f;
        private Point line_ = new Point();
        private int multi_detect_ = 0;
        private Point point_first_ = new Point();
        private Point point_long_press_ = new Point();
        private Point point_second_ = new Point();
        private boolean tapping_ = false;
        /* access modifiers changed from: private */
        public float top_ = 0.0f;
        /* access modifiers changed from: private */
        public float width_ = 0.0f;

        private class Point {
            public int id_;
            public float x_;
            public float y_;

            private Point() {
                this.x_ = -1.0f;
                this.y_ = -1.0f;
                this.id_ = -1;
            }

            public void reset() {
                this.x_ = -1.0f;
                this.y_ = -1.0f;
                this.id_ = -1;
            }
        }

        public View(final Context context, float f, float f2, float f3, float f4, boolean z) {
            super(context);
            if (z) {
                this.is_cover_parent_ = true;
            } else {
                this.left_ = f;
                this.top_ = f2;
                this.width_ = f3;
                this.height_ = f4;
            }
            Region.createUIHandler().post(new Runnable(Region.this) {
                public final void run() {
                    View view = View.this;
                    GestureDetector unused = view.ges_single_ = new GestureDetector(context, view);
                    View view2 = View.this;
                    ScaleGestureDetector unused2 = view2.ges_pinch_ = new ScaleGestureDetector(context, view2);
                    View view3 = View.this;
                    RotateDetector unused3 = view3.ges_rotate_ = new RotateDetector(view3);
                }
            });
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.is_cover_parent_) {
                this.left_ = (float) i;
                this.top_ = (float) i2;
                this.width_ = (float) (i3 - i);
                this.height_ = (float) (i4 - i2);
            }
            Region.createUIHandler().post(new Runnable() {
                public final void run() {
                    View view = View.this;
                    view.layout((int) view.left_, (int) View.this.top_, (int) (View.this.left_ + View.this.width_), (int) (View.this.top_ + View.this.height_));
                }
            });
            if (((int) this.left_) == i && ((int) this.top_) == i2 && ((int) this.width_) == i3 - i && ((int) this.height_) == i4 - i2) {
                Region region = Region.this;
                region.setViewSize(region.region_id_, this.left_, this.top_, this.width_, this.height_);
            }
        }

        public boolean checkInvalid() {
            if (-1 == Region.this.region_id_ || this.ges_single_ == null || this.ges_pinch_ == null || this.ges_rotate_ == null) {
                return true;
            }
            return false;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            boolean z2;
            float f2;
            float f3;
            float f4;
            MotionEvent motionEvent2 = motionEvent;
            if (checkInvalid()) {
                return false;
            }
            int i = this.multi_detect_;
            if (i == 0) {
                if (2 > motionEvent.getPointerCount()) {
                    this.ges_single_.onTouchEvent(motionEvent2);
                    if (1 == motionEvent.getActionMasked()) {
                        if (this.tapping_) {
                            this.tapping_ = false;
                        } else {
                            onUp(motionEvent);
                            this.tapping_ = false;
                        }
                    }
                } else if (-1 == this.point_first_.id_ || -1 == this.point_second_.id_) {
                    Point point = this.point_first_;
                    point.id_ = 0;
                    point.x_ = motionEvent2.getX(point.id_);
                    Point point2 = this.point_first_;
                    point2.y_ = motionEvent2.getY(point2.id_);
                    Point point3 = this.point_second_;
                    point3.id_ = 1;
                    point3.x_ = motionEvent2.getX(point3.id_);
                    Point point4 = this.point_second_;
                    point4.y_ = motionEvent2.getY(point4.id_);
                    this.line_.x_ = this.point_first_.x_ - this.point_second_.x_;
                    this.line_.y_ = this.point_first_.y_ - this.point_second_.y_;
                } else {
                    float degrees = (float) Math.toDegrees(Math.atan2((double) this.line_.y_, (double) this.line_.x_));
                    float x = motionEvent2.getX(this.point_first_.id_) - this.point_first_.x_;
                    float y = motionEvent2.getY(this.point_first_.id_) - this.point_first_.y_;
                    if (x == 0.0f || y == 0.0f) {
                        f = 0.0f;
                        z = false;
                    } else {
                        f = (float) Math.toDegrees(Math.atan2((double) y, (double) x));
                        z = true;
                    }
                    float x2 = motionEvent2.getX(this.point_second_.id_) - this.point_second_.x_;
                    float y2 = motionEvent2.getY(this.point_second_.id_) - this.point_second_.y_;
                    if (x2 == 0.0f || y2 == 0.0f) {
                        f2 = 0.0f;
                        z2 = false;
                    } else {
                        f2 = (float) Math.toDegrees(Math.atan2((double) y2, (double) x2));
                        z2 = true;
                    }
                    if (z) {
                        f3 = degrees - f;
                        if (f3 < -180.0f) {
                            f3 += 360.0f;
                        } else if (f3 > 180.0f) {
                            f3 -= 360.0f;
                        }
                        if ((30.0f > f3 || 150.0f < f3) && (-150.0f > f3 || -30.0f < f3)) {
                            this.ges_pinch_.onTouchEvent(motionEvent2);
                            this.multi_detect_ = 2;
                            return true;
                        }
                    } else {
                        f3 = 0.0f;
                    }
                    if (z2) {
                        f4 = degrees - f2;
                        if (f4 < -180.0f) {
                            f4 += 360.0f;
                        } else if (f4 > 180.0f) {
                            f4 -= 360.0f;
                        }
                        if ((30.0f > f4 || 150.0f < f4) && (-150.0f > f4 || -30.0f < f4)) {
                            this.ges_pinch_.onTouchEvent(motionEvent2);
                            this.multi_detect_ = 2;
                            return true;
                        }
                    } else {
                        f4 = 0.0f;
                    }
                    if (!z || !z2) {
                        if (z || z2) {
                            this.ges_rotate_.onTouchEvent(motionEvent2);
                            this.multi_detect_ = 3;
                            return true;
                        }
                    } else if ((0.0f < f3 && 0.0f > f4) || (0.0f > f3 && 0.0f < f4)) {
                        this.ges_rotate_.onTouchEvent(motionEvent2);
                        this.multi_detect_ = 3;
                        return true;
                    }
                }
            } else if (2 == i) {
                this.ges_pinch_.onTouchEvent(motionEvent2);
            } else if (3 == i) {
                this.ges_rotate_.onTouchEvent(motionEvent2);
            } else if (1 == i) {
                if (1 == motionEvent.getActionMasked() || 3 == motionEvent.getActionMasked()) {
                    onLongPressEnd(motionEvent);
                } else {
                    onLongPressMove(motionEvent);
                }
            }
            if (1 == motionEvent.getActionMasked() || 3 == motionEvent.getActionMasked()) {
                int i2 = this.multi_detect_;
                if (2 == i2 || 3 == i2) {
                    this.ges_single_.onTouchEvent(motionEvent2);
                }
                this.multi_detect_ = 0;
                this.point_first_.reset();
                this.point_second_.reset();
                this.point_long_press_.reset();
            }
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            Region region = Region.this;
            region.downGesture(region.region_id_, motionEvent.getRawX(), motionEvent.getRawY(), 0);
            return true;
        }

        public boolean onUp(MotionEvent motionEvent) {
            Region region = Region.this;
            region.upGesture(region.region_id_, motionEvent.getRawX(), motionEvent.getRawY(), 0);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int i = this.multi_detect_;
            if (2 == i || 3 == i) {
            }
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            int i = this.multi_detect_;
            if (2 != i && 3 != i) {
                Region region = Region.this;
                region.longPressGesture(region.region_id_, motionEvent.getRawX(), motionEvent.getRawY());
                this.point_long_press_.x_ = motionEvent.getRawX();
                this.point_long_press_.y_ = motionEvent.getRawY();
                this.point_long_press_.id_ = motionEvent.getPointerId(0);
                this.multi_detect_ = 1;
            }
        }

        public void onLongPressMove(MotionEvent motionEvent) {
            Region region = Region.this;
            region.longPressMoveGesture(region.region_id_, motionEvent.getRawX(), motionEvent.getRawY(), this.point_long_press_.x_, this.point_long_press_.y_);
            this.point_long_press_.x_ = motionEvent.getRawX();
            this.point_long_press_.y_ = motionEvent.getRawY();
        }

        public void onLongPressEnd(MotionEvent motionEvent) {
            Region region = Region.this;
            region.longPressEndGesture(region.region_id_, motionEvent.getRawX(), motionEvent.getRawY());
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int i = this.multi_detect_;
            if (!(2 == i || 3 == i)) {
                float rawX = motionEvent2.getRawX() - motionEvent2.getX();
                float rawY = motionEvent2.getRawY() - motionEvent2.getY();
                float rawX2 = motionEvent2.getRawX() + f;
                float rawY2 = motionEvent2.getRawY() + f2;
                int historySize = motionEvent2.getHistorySize();
                int i2 = 0;
                float f3 = rawY2;
                float f4 = rawX2;
                while (historySize != i2) {
                    float historicalX = motionEvent2.getHistoricalX(i2) + rawX;
                    float historicalY = motionEvent2.getHistoricalY(i2) + rawY;
                    Region region = Region.this;
                    region.scrollGesture(region.region_id_, historicalX, historicalY, f4, f3, 0);
                    i2++;
                    f4 = historicalX;
                    f3 = historicalY;
                }
                Region region2 = Region.this;
                region2.scrollGesture(region2.region_id_, motionEvent2.getRawX(), motionEvent2.getRawY(), f4, f3, 0);
            }
            return true;
        }

        public void onShowPress(MotionEvent motionEvent) {
            int i = this.multi_detect_;
            if (2 != i && 3 != i) {
                Region region = Region.this;
                region.showPressGesture(region.region_id_, motionEvent.getRawX(), motionEvent.getRawY());
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            int i = this.multi_detect_;
            if (!(2 == i || 3 == i)) {
                Region region = Region.this;
                region.singleTapUpGesture(region.region_id_, motionEvent.getRawX(), motionEvent.getRawY());
                this.tapping_ = true;
            }
            return true;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan()) * PINCH_COEFFICIENT;
            Region region = Region.this;
            region.scaleGesture(region.region_id_, currentSpan);
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan()) * PINCH_COEFFICIENT;
            Region region = Region.this;
            region.scaleBeginGesture(region.region_id_, currentSpan);
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan()) * PINCH_COEFFICIENT;
            Region region = Region.this;
            region.scaleEndGesture(region.region_id_, currentSpan);
        }

        public boolean onRotate(float f) {
            Region region = Region.this;
            region.rotateGesture(region.region_id_, f);
            return true;
        }

        public boolean onRotateBegin(float f) {
            Region region = Region.this;
            region.rotateBeginGesture(region.region_id_, f);
            return true;
        }

        public boolean onRotateEnd(float f) {
            Region region = Region.this;
            region.rotateEndGesture(region.region_id_, f);
            return true;
        }
    }

    private class SimpleView extends android.view.View {
        /* access modifiers changed from: private */
        public float height_ = 0.0f;
        private boolean is_cover_parent_ = false;
        /* access modifiers changed from: private */
        public float left_ = 0.0f;
        /* access modifiers changed from: private */
        public float top_ = 0.0f;
        /* access modifiers changed from: private */
        public float width_ = 0.0f;

        public SimpleView(Context context, float f, float f2, float f3, float f4, boolean z) {
            super(context);
            if (z) {
                this.is_cover_parent_ = true;
                return;
            }
            this.left_ = f;
            this.top_ = f2;
            this.width_ = f3;
            this.height_ = f4;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.is_cover_parent_) {
                this.left_ = (float) i;
                this.top_ = (float) i2;
                this.width_ = (float) (i3 - i);
                this.height_ = (float) (i4 - i2);
            }
            Region.createUIHandler().post(new Runnable() {
                public final void run() {
                    SimpleView simpleView = SimpleView.this;
                    simpleView.layout((int) simpleView.left_, (int) SimpleView.this.top_, (int) (SimpleView.this.left_ + SimpleView.this.width_), (int) (SimpleView.this.top_ + SimpleView.this.height_));
                }
            });
            if (((int) this.left_) == i && ((int) this.top_) == i2 && ((int) this.width_) == i3 - i && ((int) this.height_) == i4 - i2) {
                Region region = Region.this;
                region.setViewSize(region.region_id_, this.left_, this.top_, this.width_, this.height_);
            }
        }

        public boolean checkInvalid() {
            return -1 == Region.this.region_id_;
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            int historySize;
            MotionEvent motionEvent2 = motionEvent;
            if (checkInvalid()) {
                return false;
            }
            char c = (motionEvent.getActionMasked() == 0 || 5 == motionEvent.getActionMasked()) ? 0 : (1 == motionEvent.getActionMasked() || 6 == motionEvent.getActionMasked()) ? 1 : 2 == motionEvent.getActionMasked() ? 2 : 3 == motionEvent.getActionMasked() ? (char) 3 : 4;
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            if (c == 0) {
                int actionIndex = motionEvent.getActionIndex();
                Region region = Region.this;
                region.downGesture(region.region_id_, motionEvent2.getX(actionIndex) + rawX, motionEvent2.getY(actionIndex) + rawY, motionEvent2.getPointerId(actionIndex));
            } else if (c == 1) {
                int actionIndex2 = motionEvent.getActionIndex();
                Region region2 = Region.this;
                region2.upGesture(region2.region_id_, motionEvent2.getX(actionIndex2) + rawX, motionEvent2.getY(actionIndex2) + rawY, motionEvent2.getPointerId(actionIndex2));
            } else if (c != 2 || (historySize = motionEvent.getHistorySize()) == 0) {
                return true;
            } else {
                int pointerCount = motionEvent.getPointerCount();
                for (int i = 0; pointerCount != i; i++) {
                    float historicalX = motionEvent2.getHistoricalX(i, 0) + rawX;
                    float historicalY = motionEvent2.getHistoricalY(i, 0) + rawY;
                    for (int i2 = 0; historySize != i2; i2++) {
                        float historicalX2 = motionEvent2.getHistoricalX(i, i2) + rawX;
                        float historicalY2 = motionEvent2.getHistoricalY(i, i2) + rawY;
                        if (historicalX2 != historicalX || historicalY2 != historicalY) {
                            Region region3 = Region.this;
                            region3.scrollGesture(region3.region_id_, historicalX2, historicalY2, historicalX, historicalY, motionEvent2.getPointerId(i));
                            historicalX = historicalX2;
                            historicalY = historicalY2;
                        }
                    }
                    float x = motionEvent2.getX(i) + rawX;
                    float y = motionEvent2.getY(i) + rawY;
                    if (x != historicalX || y != historicalY) {
                        Region region4 = Region.this;
                        region4.scrollGesture(region4.region_id_, x, y, historicalX, historicalY, motionEvent2.getPointerId(i));
                    }
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static final Handler createUIHandler() {
        return new Handler(Looper.getMainLooper());
    }
}
