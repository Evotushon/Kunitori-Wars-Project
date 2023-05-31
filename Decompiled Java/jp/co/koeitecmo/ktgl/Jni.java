package jp.co.koeitecmo.ktgl;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class Jni {
    private static final String TAG = "ktgl.Jni";
    private Context context_;
    private EGLConfig eglConfig_ = null;
    private EGLContext eglContext_ = null;
    private EGLDisplay eglDisplay_ = null;
    private EGLSurface eglSurface_ = null;
    private Io io_ = null;
    private GLSurfaceView view_ = null;

    public void initSocial(Activity activity) {
    }

    public static final boolean debuggable(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo == null || (packageInfo.applicationInfo.flags & 2) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public Jni(GLSurfaceView gLSurfaceView, Context context) {
        if (!debuggable(context)) {
            Log.suppress(true);
        }
        this.view_ = gLSurfaceView;
        this.context_ = context;
        this.io_ = new Io(context);
    }

    public Jni(Context context) {
        if (!debuggable(context)) {
            Log.suppress(true);
        }
        this.context_ = context;
        this.io_ = new Io(context);
    }

    private void dummy() {
        SoundBank.dummy();
        SoundEffectManager.dummy();
        SoundEffectManager2.dummy();
        SoundStreamPlayer.dummy();
    }

    public void setEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        this.eglContext_ = eGLContext;
        this.eglDisplay_ = eGLDisplay;
    }

    public void setEglSurface(EGLSurface eGLSurface) {
        this.eglSurface_ = eGLSurface;
    }

    public void setEglConfig(EGLConfig eGLConfig) {
        this.eglConfig_ = eGLConfig;
    }

    public boolean disableEglContext() {
        if (this.eglDisplay_ == null) {
            Log.e("EGLDisplay has to be specified by setEglContext.");
            return false;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        egl10.eglMakeCurrent(this.eglDisplay_, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        return checkEglError(egl10, "disableEglContext");
    }

    public boolean enableEglContext() {
        if (this.eglDisplay_ == null) {
            Log.e("EGLDisplay has to be specified by setEglContext.");
            return false;
        } else if (this.eglSurface_ == null) {
            Log.e("EGLSurface has to be specified by setEglSurface.");
            return false;
        } else if (this.eglContext_ == null) {
            Log.e("EGLContext has to be specified by setEglContext.");
            return false;
        } else {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eGLDisplay = this.eglDisplay_;
            EGLSurface eGLSurface = this.eglSurface_;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext_);
            return checkEglError(egl10, "enableEglContext");
        }
    }

    private static final boolean checkEglError(EGL10 egl10, String str) {
        int eglGetError;
        int i = 0;
        boolean z = true;
        while (true) {
            i++;
            if (100 <= i || (eglGetError = egl10.eglGetError()) == 12288) {
                return z;
            }
            Log.e(String.format("%s: EGL error: 0x%x", new Object[]{str, Integer.valueOf(eglGetError)}));
            z = false;
        }
        return z;
    }

    private static final boolean checkGlError(String str) {
        int glGetError;
        int i = 0;
        boolean z = true;
        while (true) {
            i++;
            if (100 <= i || (glGetError = GLES20.glGetError()) == 0) {
                return z;
            }
            Log.e(String.format("%s: GL error: 0x%x", new Object[]{str, Integer.valueOf(glGetError)}));
            z = false;
        }
        return z;
    }
}
