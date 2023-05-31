package jp.co.koeitecmo.ktgl.android.http.client.request;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import jp.co.koeitecmo.ktgl.android.http.client.request.Executor;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class Get {
    /* access modifiers changed from: private */
    public Abort abort_ = null;
    /* access modifiers changed from: private */
    public Context context_ = null;

    /* access modifiers changed from: private */
    public native void onError(long j, int i);

    /* access modifiers changed from: private */
    public native void onReceive(long j, int i, byte[] bArr, String[] strArr, String[] strArr2);

    public Get(Context context) {
        this.context_ = context;
        this.abort_ = new Abort();
    }

    public void send(String str, long j) {
        send(str, j, 10000, 300000, new String[0], new String[0]);
    }

    public void send(String str, long j, int i, int i2, String[] strArr, String[] strArr2) {
        final String str2 = str;
        final long j2 = j;
        final int i3 = i;
        final int i4 = i2;
        final String[] strArr3 = strArr;
        final String[] strArr4 = strArr2;
        new Thread(new Runnable() {
            public void run() {
                Cookie cookie = new Cookie(Get.this.context_);
                try {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                        try {
                            httpURLConnection.setConnectTimeout(i3);
                            httpURLConnection.setReadTimeout(i4);
                            if (!Get.this.abort_.prepare(httpURLConnection)) {
                                Get.this.notifyError(j2, 1);
                                return;
                            }
                            for (int i = 0; i != strArr3.length; i++) {
                                httpURLConnection.setRequestProperty(strArr3[i], strArr4[i]);
                            }
                            Executor.Result execute = Executor.execute(httpURLConnection, Get.this.abort_, (byte[]) null, cookie);
                            if (execute.error() != 0) {
                                Get.this.notifyError(j2, execute.error());
                                httpURLConnection.disconnect();
                                return;
                            }
                            httpURLConnection.disconnect();
                            final Response response = execute.response();
                            Get.createMainLoopHandler().post(new Runnable() {
                                public final void run() {
                                    Get.this.onReceive(j2, response.status(), response.content(), response.headerNames(), response.headerValues());
                                }
                            });
                        } finally {
                            httpURLConnection.disconnect();
                        }
                    } catch (IOException e) {
                        Log.e((Throwable) e);
                        Get.this.notifyError(j2, 6);
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                        Get.this.notifyError(j2, 6);
                    }
                } catch (MalformedURLException e3) {
                    Log.e((Throwable) e3);
                    Get.this.notifyError(j2, 3);
                } catch (Exception e4) {
                    Log.e((Throwable) e4);
                    Get.this.notifyError(j2, 3);
                }
            }
        }).start();
    }

    public final Abort abort() {
        return this.abort_;
    }

    /* access modifiers changed from: private */
    public static final Handler createMainLoopHandler() {
        return new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: private */
    public final void notifyError(final long j, final int i) {
        createMainLoopHandler().post(new Runnable() {
            public final void run() {
                Get.this.onError(j, i);
            }
        });
    }
}
