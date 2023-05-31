package jp.co.koeitecmo.ktgl.android.http.client.request;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import jp.co.koeitecmo.ktgl.android.http.client.request.Executor;
import jp.co.koeitecmo.ktgl.android.util.Log;

public final class Post {
    private Abort abort_ = null;
    private Context context_ = null;

    /* access modifiers changed from: private */
    public native void onError(long j, int i);

    /* access modifiers changed from: private */
    public native void onReceive(long j, int i, byte[] bArr, String[] strArr, String[] strArr2);

    public class PartElement {
        static final int KEY = 0;
        static final int NUM = 2;
        static final int VALUE = 1;

        public PartElement() {
        }
    }

    public Post(Context context) {
        this.context_ = context;
        this.abort_ = new Abort();
    }

    public final boolean sendForm(String str, long j, String[] strArr, byte[][] bArr, String[] strArr2, String str2, int i, int i2, String[] strArr3, String[] strArr4) {
        String[] strArr5 = strArr;
        byte[][] bArr2 = bArr;
        String[] strArr6 = strArr2;
        String str3 = str2;
        if (strArr3.length != strArr4.length) {
            Log.e("invalid argument for HTTP POST : The size of Header fields is invalid");
            return false;
        } else if (strArr5.length == bArr2.length && strArr5.length == strArr6.length) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            String str4 = new String("\r\n");
            String str5 = new String("--");
            try {
                int length = strArr5.length;
                int i3 = 0;
                while (length != i3) {
                    String str6 = strArr5[i3];
                    byte[] bArr3 = bArr2[i3];
                    String str7 = strArr6[i3];
                    dataOutputStream.writeBytes(str5 + str3 + str4);
                    if (str6.length() > 0) {
                        dataOutputStream.writeBytes(String.format("Content-Disposition: form-data; %s", new Object[]{str6}));
                        dataOutputStream.writeBytes(str4);
                    }
                    if (str7.length() > 0) {
                        dataOutputStream.writeBytes(String.format("Content-Type: %s", new Object[]{str7}));
                        dataOutputStream.writeBytes(str4);
                    }
                    dataOutputStream.writeBytes(str4);
                    dataOutputStream.write(bArr3);
                    dataOutputStream.writeBytes(str4);
                    i3++;
                    strArr5 = strArr;
                }
                dataOutputStream.writeBytes(str5 + str3 + str5 + str4);
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                final String str8 = str;
                final long j2 = j;
                final String str9 = str2;
                final int i4 = i;
                final int i5 = i2;
                final String[] strArr7 = strArr3;
                final String[] strArr8 = strArr4;
                new Thread(new Runnable() {
                    public void run() {
                        Post.this.sendMultipart(str8, j2, byteArray, str9, i4, i5, strArr7, strArr8);
                    }
                }).start();
                return true;
            } catch (IOException e) {
                Log.e((Throwable) e);
                return false;
            }
        } else {
            Log.e("invalid argument for HTTP POST : The size of array is invalid");
            return false;
        }
    }

    public final boolean sendMultipart(String str, long j, Body body, String str2, int i, int i2, String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            Log.e("invalid argument for HTTP POST : The size of Header fields is invalid");
            return false;
        }
        final byte[] entity = body != null ? body.entity(str2) : null;
        final String str3 = str;
        final long j2 = j;
        final String str4 = str2;
        final int i3 = i;
        final int i4 = i2;
        final String[] strArr3 = strArr;
        final String[] strArr4 = strArr2;
        new Thread(new Runnable() {
            public void run() {
                Post.this.sendMultipart(str3, j2, entity, str4, i3, i4, strArr3, strArr4);
            }
        }).start();
        return true;
    }

    public final boolean sendRaw(String str, long j, Body body, int i, int i2, String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            Log.e("invalid argument for HTTP POST : The size of Header fields is invalid");
            return false;
        }
        final byte[] entity = body != null ? body.entity() : null;
        final String str2 = str;
        final long j2 = j;
        final int i3 = i;
        final int i4 = i2;
        final String[] strArr3 = strArr;
        final String[] strArr4 = strArr2;
        new Thread(new Runnable() {
            public void run() {
                Post.this.send(str2, j2, entity, i3, i4, strArr3, strArr4);
            }
        }).start();
        return true;
    }

    public final Abort abort() {
        return this.abort_;
    }

    private static final Handler createMainLoopHandler() {
        return new Handler(Looper.getMainLooper());
    }

    private final void notifyError(final long j, final int i) {
        createMainLoopHandler().post(new Runnable() {
            public final void run() {
                Post.this.onError(j, i);
            }
        });
    }

    /* access modifiers changed from: private */
    public final void sendMultipart(String str, long j, byte[] bArr, String str2, int i, int i2, String[] strArr, String[] strArr2) {
        String[] strArr3 = strArr;
        String[] strArr4 = strArr2;
        String[] strArr5 = new String[(strArr3.length + 1)];
        System.arraycopy(strArr3, 0, strArr5, 0, strArr3.length);
        String[] strArr6 = new String[(strArr4.length + 1)];
        System.arraycopy(strArr4, 0, strArr6, 0, strArr4.length);
        strArr5[strArr3.length] = "Content-Type";
        strArr6[strArr4.length] = String.format("multipart/form-data; boundary=\"%s\"", new Object[]{str2});
        send(str, j, bArr, i, i2, strArr5, strArr6);
    }

    /* access modifiers changed from: private */
    public final void send(String str, final long j, byte[] bArr, int i, int i2, String[] strArr, String[] strArr2) {
        Cookie cookie = new Cookie(this.context_);
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i2);
                    if (!this.abort_.prepare(httpURLConnection)) {
                        notifyError(j, 1);
                        return;
                    }
                    for (int i3 = 0; i3 != strArr.length; i3++) {
                        httpURLConnection.setRequestProperty(strArr[i3], strArr2[i3]);
                    }
                    Executor.Result execute = Executor.execute(httpURLConnection, this.abort_, bArr, cookie);
                    if (execute.error() != 0) {
                        notifyError(j, execute.error());
                        httpURLConnection.disconnect();
                        return;
                    }
                    httpURLConnection.disconnect();
                    final Response response = execute.response();
                    createMainLoopHandler().post(new Runnable() {
                        public final void run() {
                            Post.this.onReceive(j, response.status(), response.content(), response.headerNames(), response.headerValues());
                        }
                    });
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                Log.e((Throwable) e);
                notifyError(j, 6);
            } catch (Exception e2) {
                Log.e((Throwable) e2);
                notifyError(j, 6);
            }
        } catch (MalformedURLException e3) {
            Log.e((Throwable) e3);
            notifyError(j, 3);
        } catch (Exception e4) {
            Log.e((Throwable) e4);
            notifyError(j, 3);
        }
    }
}
