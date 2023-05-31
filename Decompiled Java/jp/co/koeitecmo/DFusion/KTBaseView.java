package jp.co.koeitecmo.DFusion;

import android.app.Application;
import android.opengl.GLSurfaceView;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.IOException;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public abstract class KTBaseView extends GLSurfaceView {
    private static final boolean DEBUG = true;
    private static final String TAG = "koeitecmo.KTBaseView";
    private static final double VIEW_ASPECT_RATIO = 0.5625d;
    /* access modifiers changed from: private */
    public static boolean m_bPaused;
    /* access modifiers changed from: private */
    public static boolean m_bSplash;
    private IAPBCJni IAPBC_ = null;
    private IAPJni IAP_ = null;
    private KTBaseActivity activity_ = null;
    /* access modifiers changed from: private */
    public int frameMilisecond = 16;
    protected KTBaseJni ktgl_ = null;
    public Renderer renderer_ = null;
    private int targetFPS = 60;
    private View.OnTouchListener touch_listener_ = new View.OnTouchListener() {
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            /*
                r12 = this;
                jp.co.koeitecmo.DFusion.KTBaseView r13 = (jp.co.koeitecmo.DFusion.KTBaseView) r13
                int r0 = r14.getActionIndex()
                int r1 = r14.getActionMasked()
                r2 = 0
                r3 = 3
                r4 = 2
                r7 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r7) goto L_0x0023
                if (r1 == r4) goto L_0x0021
                if (r1 == r3) goto L_0x001f
                r3 = 5
                if (r1 == r3) goto L_0x0025
                r3 = 6
                if (r1 == r3) goto L_0x0023
                r1 = -1
                r8 = -1
                goto L_0x0026
            L_0x001f:
                r8 = 3
                goto L_0x0026
            L_0x0021:
                r8 = 0
                goto L_0x0026
            L_0x0023:
                r8 = 2
                goto L_0x0026
            L_0x0025:
                r8 = 1
            L_0x0026:
                if (r8 < 0) goto L_0x005a
                if (r8 != 0) goto L_0x0031
                int r0 = r14.getPointerCount()
                r9 = r0
                r0 = 0
                goto L_0x0034
            L_0x0031:
                int r1 = r0 + 1
                r9 = r1
            L_0x0034:
                r10 = r0
            L_0x0035:
                if (r10 >= r9) goto L_0x005a
                float r0 = r14.getX(r10)
                int r5 = java.lang.Math.round(r0)
                float r0 = r14.getY(r10)
                int r6 = java.lang.Math.round(r0)
                int r3 = r14.getPointerId(r10)
                jp.co.koeitecmo.DFusion.KTBaseView$13$1 r11 = new jp.co.koeitecmo.DFusion.KTBaseView$13$1
                r0 = r11
                r1 = r12
                r2 = r13
                r4 = r8
                r0.<init>(r2, r3, r4, r5, r6)
                r13.queueEvent(r11)
                int r10 = r10 + 1
                goto L_0x0035
            L_0x005a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.co.koeitecmo.DFusion.KTBaseView.AnonymousClass13.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    };
    private ViewAspectRatioMeasurer varm = new ViewAspectRatioMeasurer(VIEW_ASPECT_RATIO);

    /* access modifiers changed from: protected */
    public abstract void LoadLibrary();

    public void onStart() {
        Log.i(TAG, "on start");
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onStart();
            }
        });
    }

    public void onResume() {
        Log.i(TAG, "on resume");
        m_bPaused = false;
        super.onResume();
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onResume();
            }
        });
    }

    public void onPause() {
        Log.i(TAG, "on pause");
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onPause();
            }
        });
        m_bPaused = true;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.varm.measure(i, i2);
        setMeasuredDimension(this.varm.getMeasuredWidth(), this.varm.getMeasuredHeight());
    }

    public void onStop() {
        Log.i(TAG, "on stop");
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onStop();
            }
        });
    }

    public void onRestart() {
        Log.i(TAG, "on restart");
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onRestart();
            }
        });
    }

    public void onDestroy() {
        Log.i(TAG, "on destroy");
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onDestroy();
            }
        });
    }

    public void getPlayerData() {
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.getPlayerData();
            }
        });
    }

    public void onWebViewPageStarted() {
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onWebViewPageStarted();
            }
        });
    }

    public void onWebViewPageFinished() {
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onWebViewPageFinished();
            }
        });
    }

    public void onWebViewAction(final String str) {
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onWebViewAction(str);
            }
        });
    }

    public void onBackKeyDown() {
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onBackKeyDown();
            }
        });
    }

    public void onEditTextEnd() {
        queueEvent(new Runnable() {
            public void run() {
                KTBaseView.this.ktgl_.onEditTextEnd();
            }
        });
    }

    public void setFPS(int i) {
        this.targetFPS = i;
        this.frameMilisecond = 1000 / i;
    }

    private static void printMotionEvent(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < historySize; i++) {
            System.out.printf("At time %d:", new Object[]{Long.valueOf(motionEvent.getHistoricalEventTime(i))});
            for (int i2 = 0; i2 < pointerCount; i2++) {
                Log.i("onTouch", "pointer " + motionEvent.getPointerId(i2) + ": (" + motionEvent.getHistoricalX(i2, i) + "," + motionEvent.getHistoricalY(i2, i) + ")");
            }
        }
        Log.i("onTouch", "At time " + motionEvent.getEventTime() + ":");
        for (int i3 = 0; i3 < pointerCount; i3++) {
            Log.i("onTouch", "pointer " + motionEvent.getPointerId(i3) + ": (" + motionEvent.getX(i3) + "," + motionEvent.getY(i3) + ")");
        }
    }

    public KTBaseView(Application application, KTBaseActivity kTBaseActivity) {
        super(application);
        init(application, kTBaseActivity, false, 0, 0);
    }

    public KTBaseView(Application application, KTBaseActivity kTBaseActivity, boolean z, int i, int i2) {
        super(application);
        init(application, kTBaseActivity, z, i, i2);
    }

    private void init(Application application, KTBaseActivity kTBaseActivity, boolean z, int i, int i2) {
        ConfigChooser configChooser;
        Application application2 = application;
        KTBaseActivity kTBaseActivity2 = kTBaseActivity;
        LoadLibrary();
        this.activity_ = kTBaseActivity2;
        this.ktgl_ = kTBaseActivity2.createJni(application2, kTBaseActivity2, this);
        this.IAP_ = kTBaseActivity2.createIAPJni(application2, kTBaseActivity2, this);
        this.IAPBC_ = kTBaseActivity2.createIAPBCJni(application2, kTBaseActivity2, this);
        setDebugFlags(3);
        if (z) {
            getHolder().setFormat(-3);
        }
        setEGLWindowSurfaceFactory(new EGLWindowSurfaceFactory(this.ktgl_));
        setEGLContextFactory(new ContextFactory(this.ktgl_));
        if (z) {
            configChooser = new ConfigChooser(8, 8, 8, 8, i, i2, false);
        } else {
            configChooser = new ConfigChooser(5, 6, 5, 0, i, i2, false);
        }
        setEGLConfigChooser(configChooser);
        this.renderer_ = new Renderer(this, this.ktgl_, kTBaseActivity2);
        setRenderer(this.renderer_);
        Log.i(TAG, "SetTouchEvent");
        setOnTouchListener(this.touch_listener_);
        setPreserveEGLContextOnPause(true);
        m_bPaused = false;
    }

    private static class ContextFactory implements GLSurfaceView.EGLContextFactory {
        private static int EGL_CONTEXT_CLIENT_VERSION = 12440;
        protected KTBaseJni ktgl_;

        public ContextFactory(KTBaseJni kTBaseJni) {
            this.ktgl_ = kTBaseJni;
        }

        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            Log.i(KTBaseView.TAG, "creating OpenGL ES 2.0 context");
            KTBaseView.checkEglError("Before eglCreateContext", egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
            KTBaseView.checkEglError("After eglCreateContext", egl10);
            this.ktgl_.setEglContext(eglCreateContext, eGLDisplay);
            boolean unused = KTBaseView.m_bSplash = true;
            return eglCreateContext;
        }

        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    /* access modifiers changed from: private */
    public static void checkEglError(String str, EGL10 egl10) {
        while (true) {
            int eglGetError = egl10.eglGetError();
            if (eglGetError != 12288) {
                Log.e(TAG, String.format("%s: EGL error: 0x%x", new Object[]{str, Integer.valueOf(eglGetError)}));
            } else {
                return;
            }
        }
    }

    private static class EGLWindowSurfaceFactory implements GLSurfaceView.EGLWindowSurfaceFactory {
        private KTBaseJni ktgl_;

        EGLWindowSurfaceFactory(KTBaseJni kTBaseJni) {
            this.ktgl_ = kTBaseJni;
        }

        public final EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, (int[]) null);
            this.ktgl_.setEglSurface(eglCreateWindowSurface);
            return eglCreateWindowSurface;
        }

        public final void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    private static class ConfigChooser implements GLSurfaceView.EGLConfigChooser {
        private static int EGL_OPENGL_ES2_BIT = 4;
        private static int[] s_configAttribs2 = {12324, 4, 12323, 4, 12322, 4, 12352, EGL_OPENGL_ES2_BIT, 12344};
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue = new int[1];
        protected boolean multisample_;

        public ConfigChooser(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
            this.multisample_ = z;
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, s_configAttribs2, (EGLConfig[]) null, 0, iArr);
            int i = iArr[0];
            if (i > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                egl10.eglChooseConfig(eGLDisplay, s_configAttribs2, eGLConfigArr, i, iArr);
                printConfigs(egl10, eGLDisplay, eGLConfigArr);
                return chooseConfig(egl10, eGLDisplay, eGLConfigArr);
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int findConfigAttrib = findConfigAttrib(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                    EGL10 egl103 = egl10;
                    EGLDisplay eGLDisplay3 = eGLDisplay;
                    EGLConfig eGLConfig3 = eGLConfig;
                    int findConfigAttrib3 = findConfigAttrib(egl103, eGLDisplay3, eGLConfig3, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl103, eGLDisplay3, eGLConfig3, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl103, eGLDisplay3, eGLConfig3, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl103, eGLDisplay3, eGLConfig3, 12321, 0);
                    if ((!this.multisample_ || 1 == findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12338, 0)) && findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
        }

        private void printConfigs(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            Log.i(KTBaseView.TAG, String.format("%d configurations", new Object[]{Integer.valueOf(length)}));
            for (int i = 0; i < length; i++) {
                Log.i(KTBaseView.TAG, String.format("Configuration %d:\n", new Object[]{Integer.valueOf(i)}));
                printConfig(egl10, eGLDisplay, eGLConfigArr[i]);
            }
        }

        private void printConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};
            String[] strArr = {"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"};
            int[] iArr2 = new int[1];
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                String str = strArr[i];
                if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i2, iArr2)) {
                    Log.i(KTBaseView.TAG, String.format("  %s: %d\n", new Object[]{str, Integer.valueOf(iArr2[0])}));
                } else {
                    do {
                    } while (egl10.eglGetError() != 12288);
                }
            }
        }
    }

    private static class Renderer implements GLSurfaceView.Renderer {
        private KTBaseActivity activity_ = null;
        private byte count_;
        private float fps_;
        private KTBaseJni ktgl_ = null;
        private long prevFrameTime_;
        private long prev_time_;
        private float step_elapse_;
        private KTBaseView view_ = null;

        Renderer(KTBaseView kTBaseView, KTBaseJni kTBaseJni, KTBaseActivity kTBaseActivity) {
            this.view_ = kTBaseView;
            this.ktgl_ = kTBaseJni;
            this.activity_ = kTBaseActivity;
            this.prev_time_ = SystemClock.uptimeMillis();
            this.count_ = 0;
            this.fps_ = 0.0f;
            this.step_elapse_ = 0.0f;
            this.prevFrameTime_ = SystemClock.uptimeMillis();
        }

        public void onDrawFrame(GL10 gl10) {
            if (KTBaseView.m_bSplash) {
                this.activity_.onSurfaceCreated();
                boolean unused = KTBaseView.m_bSplash = false;
            }
            if (!KTBaseView.m_bPaused) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.prev_time_;
                if (uptimeMillis >= j) {
                    this.fps_ = (this.fps_ + (1000.0f / ((float) (uptimeMillis - j)))) / 2.0f;
                }
            }
            this.prev_time_ = SystemClock.uptimeMillis();
            try {
                long access$300 = (long) this.view_.frameMilisecond;
                long uptimeMillis2 = SystemClock.uptimeMillis() - this.prevFrameTime_;
                if (uptimeMillis2 < access$300) {
                    Thread.sleep(access$300 - uptimeMillis2);
                } else {
                    access$300 = uptimeMillis2;
                }
                this.prevFrameTime_ += access$300;
                int i = (access$300 > 100 ? 1 : (access$300 == 100 ? 0 : -1));
                long uptimeMillis3 = SystemClock.uptimeMillis();
                this.ktgl_.onDrawFrame(this.prevFrameTime_);
                long uptimeMillis4 = SystemClock.uptimeMillis() - uptimeMillis3;
                if (0 < uptimeMillis4) {
                    if (0.0f == this.step_elapse_) {
                        this.step_elapse_ = (float) uptimeMillis4;
                    }
                    this.step_elapse_ = (this.step_elapse_ + this.step_elapse_) / 2.0f;
                }
            } catch (IOException e) {
                Log.e("Renderer", e.getMessage());
            } catch (InterruptedException e2) {
                Log.e("Renderer", e2.getMessage());
            }
            if (60 < this.count_) {
                this.count_ = 0;
            }
            this.count_ = (byte) (this.count_ + 1);
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            Log.i(KTBaseView.TAG, "KTBaseView.onSurfaceChanged was called");
            this.ktgl_.onSurfaceChanged(i, i2);
            this.activity_.didSurfaceChanged();
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            this.ktgl_.setEglConfig(eGLConfig);
            Log.i(KTBaseView.TAG, "KTBaseView.onSurfaceCreated was called");
            this.ktgl_.onSurfaceCreated();
        }

        public void onDrag(int i, int i2) {
            this.ktgl_.onDrag(i, i2);
        }

        public void onTouch(int i, int i2, int i3, int i4) {
            this.ktgl_.onTouch(i, i2, i3, i4);
        }
    }

    public KTBaseJni GetJni() {
        return this.ktgl_;
    }
}
