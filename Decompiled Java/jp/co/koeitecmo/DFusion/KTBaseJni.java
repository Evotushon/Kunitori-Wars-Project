package jp.co.koeitecmo.DFusion;

import android.app.Application;
import android.opengl.GLES20;
import android.util.Log;
import java.io.IOException;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import jp.co.koeitecmo.ktgl.Jni;

public class KTBaseJni extends Jni {
    private static final String TAG = "koeitecmo.KTBaseJni";
    private EGLContext eglContext_;
    /* access modifiers changed from: private */
    public EGLDisplay eglDisplay_;
    private EGLSurface eglSurface_;

    private native void initSystem();

    public native void getPlayerData();

    public native void onAdMovieClosed();

    public native void onAdMovieFailed(int i);

    public native void onAdMovieFinished();

    public native void onAdMovieOpened();

    public native void onBackKeyDown();

    public native void onDestroy();

    public native void onDrag(int i, int i2);

    public native void onDrawFrame(long j) throws IOException;

    public native void onEditTextEnd();

    public native void onPause();

    public native void onRestart();

    public native void onResume();

    public native void onStart();

    public native void onStop();

    public native void onSurfaceChanged(int i, int i2);

    public native void onSurfaceCreated();

    public native void onTouch(int i, int i2, int i3, int i4);

    public native void onWebViewAction(String str);

    public native void onWebViewPageFinished();

    public native void onWebViewPageStarted();

    public KTBaseJni(Application application, KTBaseActivity kTBaseActivity, KTBaseView kTBaseView) {
        super(kTBaseView, application);
        initSystem();
    }

    public void setEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        this.eglContext_ = eGLContext;
        this.eglDisplay_ = eGLDisplay;
        super.setEglContext(eGLContext, eGLDisplay);
    }

    public void setEglSurface(EGLSurface eGLSurface) {
        this.eglSurface_ = eGLSurface;
        super.setEglSurface(eGLSurface);
    }

    public void testEgl(final EGLConfig eGLConfig) {
        final EGL10 egl10 = (EGL10) EGLContext.getEGL();
        Thread thread = new Thread(new Runnable() {
            public void run() {
                Log.i(KTBaseJni.TAG, String.format("EGL version: %s", new Object[]{egl10.eglQueryString(KTBaseJni.this.eglDisplay_, 12372)}));
                EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(KTBaseJni.this.eglDisplay_, eGLConfig, new int[]{12344});
                EGLContext eglCreateContext = egl10.eglCreateContext(KTBaseJni.this.eglDisplay_, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                KTBaseJni.this.checkEglError(egl10, "after creating second EGLcontext");
                egl10.eglMakeCurrent(KTBaseJni.this.eglDisplay_, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                KTBaseJni.this.checkEglError(egl10, "after MakeCurrent shared EGLcontext");
                GLES20.glCreateProgram();
                GLES20.glCreateShader(35633);
                KTBaseJni.this.checkGlError("after create shader");
            }
        });
        GLES20.glCreateProgram();
        thread.start();
    }

    /* access modifiers changed from: package-private */
    public void checkEglError(EGL10 egl10, String str) {
        int eglGetError;
        int i = 0;
        while (true) {
            i++;
            if (100 > i && (eglGetError = egl10.eglGetError()) != 12288) {
                Log.e(TAG, String.format("%s: EGL error: 0x%x", new Object[]{str, Integer.valueOf(eglGetError)}));
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void checkGlError(String str) {
        int glGetError;
        int i = 0;
        while (true) {
            i++;
            if (100 > i && (glGetError = GLES20.glGetError()) != 0) {
                Log.e(TAG, String.format("%s: GL error: 0x%x", new Object[]{str, Integer.valueOf(glGetError)}));
            } else {
                return;
            }
        }
    }
}
