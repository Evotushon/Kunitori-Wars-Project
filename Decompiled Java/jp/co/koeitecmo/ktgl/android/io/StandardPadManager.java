package jp.co.koeitecmo.ktgl.android.io;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import jp.co.koeitecmo.ktgl.android.util.Log;
import jp.co.koeitecmo.ktgl.android12.pad.Manager;

public final class StandardPadManager extends Manager.ManagerBase {
    public final int TURNING_VERSION = 12;
    private View view_ = null;

    private native void eventKeyDown(int i, int i2);

    private native void eventKeyUp(int i, int i2);

    private native void eventStick(float f, float f2, float f3, float f4, int i);

    public StandardPadManager(Context context) {
        if (Build.VERSION.SDK_INT >= 12) {
            this.view_ = new Manager.PadView(context, this);
        } else {
            this.view_ = new PadView(context);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        int deviceId = keyEvent.getDeviceId();
        if (action == 0) {
            eventKeyDown(keyCode, deviceId);
        } else if (action == 1) {
            eventKeyUp(keyCode, deviceId);
        }
        return true;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT >= 12) {
            return ((Manager.PadView) this.view_).onGenericMotionEvent(motionEvent);
        }
        return ((PadView) this.view_).onGenericMotionEvent(motionEvent);
    }

    public boolean onStickEvent(float f, float f2, float f3, float f4, int i) {
        eventStick(f, f2, f3, f4, i);
        return true;
    }

    public boolean downKey(int i, int i2) {
        eventKeyDown(i, i2);
        return true;
    }

    public boolean upKey(int i, int i2) {
        eventKeyUp(i, i2);
        return true;
    }

    public View getView() {
        return this.view_;
    }

    private class PadView extends View {
        public PadView(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return StandardPadManager.this.dispatchKeyEvent(keyEvent);
        }

        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            Log.i("GenericMotionEvent is not supported under Android API 12.");
            return false;
        }
    }
}
