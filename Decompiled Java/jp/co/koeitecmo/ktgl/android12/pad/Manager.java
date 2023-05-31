package jp.co.koeitecmo.ktgl.android12.pad;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public final class Manager {

    public static class ManagerBase {
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return false;
        }

        public boolean downKey(int i, int i2) {
            return false;
        }

        public boolean onStickEvent(float f, float f2, float f3, float f4, int i) {
            return false;
        }

        public boolean upKey(int i, int i2) {
            return false;
        }
    }

    public static class PadView extends View {
        private final float DPAD_PLAY_VALUE = 0.2f;
        private float hat_axis_x = 0.0f;
        private float hat_axis_y = 0.0f;
        private float left_axis_x = 0.0f;
        private float left_axis_y = 0.0f;
        private ManagerBase manager_ = null;
        private float right_axis_x = 0.0f;
        private float right_axis_y = 0.0f;

        public PadView(Context context, ManagerBase managerBase) {
            super(context);
            this.manager_ = managerBase;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.manager_.dispatchKeyEvent(keyEvent);
        }

        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            if (!(this.left_axis_x == motionEvent.getAxisValue(0) && this.left_axis_y == motionEvent.getAxisValue(1) * -1.0f && this.right_axis_x == motionEvent.getAxisValue(11) && this.right_axis_y == motionEvent.getAxisValue(14) * -1.0f)) {
                this.left_axis_x = motionEvent.getAxisValue(0);
                this.left_axis_y = motionEvent.getAxisValue(1) * -1.0f;
                this.right_axis_x = motionEvent.getAxisValue(11);
                this.right_axis_y = motionEvent.getAxisValue(14) * -1.0f;
                this.manager_.onStickEvent(this.left_axis_x, this.left_axis_y, this.right_axis_x, this.right_axis_y, motionEvent.getDeviceId());
            }
            if (!(this.hat_axis_x == motionEvent.getAxisValue(15) && this.hat_axis_y == motionEvent.getAxisValue(16) * -1.0f)) {
                float axisValue = motionEvent.getAxisValue(15);
                float axisValue2 = motionEvent.getAxisValue(16) * -1.0f;
                int deviceId = motionEvent.getDeviceId();
                float f = this.hat_axis_x;
                if (f != axisValue) {
                    if (f <= -0.2f) {
                        if (axisValue > -0.2f) {
                            this.manager_.upKey(21, deviceId);
                            if (axisValue >= 0.2f) {
                                this.manager_.downKey(22, deviceId);
                            }
                        }
                    } else if (f >= 0.2f) {
                        if (axisValue < 0.2f) {
                            this.manager_.upKey(22, deviceId);
                            if (axisValue <= -0.2f) {
                                this.manager_.downKey(21, deviceId);
                            }
                        }
                    } else if (axisValue <= -0.2f) {
                        this.manager_.downKey(21, deviceId);
                    } else if (axisValue >= 0.2f) {
                        this.manager_.downKey(22, deviceId);
                    }
                    this.hat_axis_x = axisValue;
                }
                float f2 = this.hat_axis_y;
                if (f2 != axisValue2) {
                    if (f2 <= -0.2f) {
                        if (axisValue2 > -0.2f) {
                            this.manager_.upKey(20, deviceId);
                            if (axisValue2 >= 0.2f) {
                                this.manager_.downKey(19, deviceId);
                            }
                        }
                    } else if (f2 >= 0.2f) {
                        if (axisValue2 < 0.2f) {
                            this.manager_.upKey(19, deviceId);
                            if (axisValue2 <= -0.2f) {
                                this.manager_.downKey(20, deviceId);
                            }
                        }
                    } else if (axisValue2 <= -0.2f) {
                        this.manager_.downKey(20, deviceId);
                    } else if (axisValue2 >= 0.2f) {
                        this.manager_.downKey(19, deviceId);
                    }
                    this.hat_axis_y = axisValue2;
                }
            }
            return true;
        }
    }
}
