package jp.co.koeitecmo.ktgl.android.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class ViewGroup {
    private long listener_ = 0;
    /* access modifiers changed from: private */
    public android.view.ViewGroup raw_ = null;

    public ViewGroup(long j, Context context, android.view.ViewGroup viewGroup) {
        this.listener_ = j;
        this.raw_ = viewGroup;
    }

    public final void clear() {
        this.listener_ = 0;
        this.raw_ = null;
    }

    public final boolean addView(final View view) {
        if (this.raw_ == null) {
            Log.e("The internal resource is not initialized.\n");
            return false;
        }
        mainLoopHandler().post(new Runnable() {
            public final void run() {
                ViewGroup.this.raw_.addView(view);
            }
        });
        return true;
    }

    public final boolean addView(final View view, int i, int i2) {
        if (this.raw_ == null) {
            Log.e("The internal resource is not initialized.\n");
            return false;
        }
        final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
        }
        mainLoopHandler().post(new Runnable() {
            public final void run() {
                ViewGroup.this.raw_.addView(view, layoutParams);
            }
        });
        return true;
    }

    public final boolean removeView(final View view) {
        if (this.raw_ == null) {
            Log.e("The internal resource is not initialized.\n");
            return false;
        }
        mainLoopHandler().post(new Runnable() {
            public final void run() {
                ViewGroup.this.raw_.removeView(view);
            }
        });
        return true;
    }

    private static Handler mainLoopHandler() {
        return new Handler(Looper.getMainLooper());
    }
}
