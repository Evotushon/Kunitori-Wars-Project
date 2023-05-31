package jp.co.koeitecmo.ktgl.android.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.widget.RelativeLayout;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class SurfaceView {
    /* access modifiers changed from: private */
    public boolean canWrite_ = false;
    private long listener_ = 0;
    /* access modifiers changed from: private */
    public Raw raw_ = null;

    private native void onSurfaceChanged(long j, int i, int i2, int i3);

    private native void onSurfaceCreated(long j);

    private native void onSurfaceDestroyed(long j);

    public SurfaceView(long j, Context context, int i, int i2, int i3, int i4) {
        this.listener_ = j;
        this.raw_ = new Raw(this, context, new Rect(i, i2, i3 + i, i4 + i2));
    }

    public final void clear() {
        this.listener_ = 0;
        this.raw_ = null;
    }

    public final Raw raw() {
        return this.raw_;
    }

    public final boolean write(final int[] iArr) {
        if (this.raw_ == null) {
            Log.e("A raw resource is not initialized.");
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (!SurfaceView.this.canWrite_) {
                    Log.d("This SurfaceView can't be written.\n");
                    return;
                }
                SurfaceHolder holder = SurfaceView.this.raw_.getHolder();
                Rect surfaceFrame = holder.getSurfaceFrame();
                int width = surfaceFrame.width();
                int i = width;
                Bitmap createBitmap = Bitmap.createBitmap(iArr, 0, i, width, surfaceFrame.height(), Bitmap.Config.ARGB_8888);
                Canvas lockCanvas = holder.lockCanvas();
                if (lockCanvas == null) {
                    Log.d("This SurfaceView can't be edited.");
                    return;
                }
                try {
                    lockCanvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                } finally {
                    holder.unlockCanvasAndPost(lockCanvas);
                }
            }
        });
        return true;
    }

    public final boolean clearCanvas() {
        if (this.raw_ == null) {
            Log.e("A raw resource is not initialized.");
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (!SurfaceView.this.canWrite_) {
                    Log.d("This SurfaceView can't be written.\n");
                    return;
                }
                SurfaceHolder holder = SurfaceView.this.raw_.getHolder();
                Canvas lockCanvas = holder.lockCanvas();
                if (lockCanvas == null) {
                    Log.d("This SurfaceView can't be edited.");
                    return;
                }
                try {
                    lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    holder.unlockCanvasAndPost(lockCanvas);
                }
            }
        });
        return true;
    }

    private class Raw extends android.view.SurfaceView {
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        public Raw(final SurfaceView surfaceView, Context context, Rect rect) {
            super(context);
            setZOrderMediaOverlay(true);
            setZOrderOnTop(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(rect.width() > 0 ? rect.width() : -1, rect.height() > 0 ? rect.height() : -1);
            layoutParams.leftMargin = rect.left;
            layoutParams.topMargin = rect.top;
            setLayoutParams(layoutParams);
            getHolder().setFormat(1);
            getHolder().addCallback(new SurfaceHolder.Callback(SurfaceView.this) {
                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    surfaceView.onSurfaceChanged(i, i2, i3);
                }

                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    surfaceView.onSurfaceCreated();
                }

                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    surfaceView.onSurfaceDestroyed();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void onSurfaceChanged(int i, int i2, int i3) {
        long j = this.listener_;
        if (0 != j) {
            this.canWrite_ = true;
            onSurfaceChanged(j, i, i2, i3);
        }
    }

    /* access modifiers changed from: private */
    public void onSurfaceCreated() {
        long j = this.listener_;
        if (0 != j) {
            onSurfaceCreated(j);
        }
    }

    /* access modifiers changed from: private */
    public void onSurfaceDestroyed() {
        long j = this.listener_;
        if (0 != j) {
            this.canWrite_ = false;
            onSurfaceDestroyed(j);
        }
    }
}
