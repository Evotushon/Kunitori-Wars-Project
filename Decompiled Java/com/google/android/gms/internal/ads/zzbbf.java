package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbbf implements SensorEventListener {
    private final SensorManager zzeab;
    private final Object zzeac = new Object();
    private final Display zzead;
    private final float[] zzeae = new float[9];
    private final float[] zzeaf = new float[9];
    @GuardedBy("sensorThreadLock")
    private float[] zzeag;
    private Handler zzeah;
    private zzbbh zzeai;

    zzbbf(Context context) {
        this.zzeab = (SensorManager) context.getSystemService("sensor");
        this.zzead = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* access modifiers changed from: package-private */
    public final void start() {
        if (this.zzeah == null) {
            Sensor defaultSensor = this.zzeab.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzawf.zzey("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.zzeah = new zzdkp(handlerThread.getLooper());
            if (!this.zzeab.registerListener(this, defaultSensor, 0, this.zzeah)) {
                zzawf.zzey("SensorManager.registerListener failed.");
                stop();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void stop() {
        if (this.zzeah != null) {
            this.zzeab.unregisterListener(this);
            this.zzeah.post(new zzbbi(this));
            this.zzeah = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbbh zzbbh) {
        this.zzeai = zzbbh;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.zzeac) {
                if (this.zzeag == null) {
                    this.zzeag = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.zzeae, fArr);
            int rotation = this.zzead.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.zzeae, 2, 129, this.zzeaf);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.zzeae, 129, 130, this.zzeaf);
            } else if (rotation != 3) {
                System.arraycopy(this.zzeae, 0, this.zzeaf, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.zzeae, 130, 1, this.zzeaf);
            }
            zzl(1, 3);
            zzl(2, 6);
            zzl(5, 7);
            synchronized (this.zzeac) {
                System.arraycopy(this.zzeaf, 0, this.zzeag, 0, 9);
            }
            zzbbh zzbbh = this.zzeai;
            if (zzbbh != null) {
                zzbbh.zztv();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(float[] fArr) {
        synchronized (this.zzeac) {
            if (this.zzeag == null) {
                return false;
            }
            System.arraycopy(this.zzeag, 0, fArr, 0, this.zzeag.length);
            return true;
        }
    }

    private final void zzl(int i, int i2) {
        float[] fArr = this.zzeaf;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }
}
