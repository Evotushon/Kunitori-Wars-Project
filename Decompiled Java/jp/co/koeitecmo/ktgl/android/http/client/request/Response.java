package jp.co.koeitecmo.ktgl.android.http.client.request;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp.co.koeitecmo.ktgl.android.util.Log;

public final class Response {
    private byte[] content_ = null;
    private int error_ = 6;
    private String[] headerNames_ = null;
    private String[] headerValues_ = null;
    private HttpURLConnection raw_connection_ = null;
    private int status_ = 0;

    public Response(HttpURLConnection httpURLConnection, Abort abort, byte[] bArr, Cookie cookie) {
        read(httpURLConnection, abort, bArr, cookie);
    }

    public final int status() {
        return this.status_;
    }

    public final byte[] content() {
        return this.content_;
    }

    public final String[] headerNames() {
        return this.headerNames_;
    }

    public final String[] headerValues() {
        return this.headerValues_;
    }

    public final int error() {
        return this.error_;
    }

    /* access modifiers changed from: package-private */
    public final List<String> getHeaders(String str) {
        HttpURLConnection httpURLConnection = this.raw_connection_;
        if (httpURLConnection != null) {
            return (List) httpURLConnection.getHeaderFields().get(str);
        }
        return null;
    }

    private final void read(HttpURLConnection httpURLConnection, Abort abort, byte[] bArr, Cookie cookie) {
        boolean z = Build.VERSION.SDK_INT > 18;
        Map map = null;
        if (!z) {
            httpURLConnection.setInstanceFollowRedirects(false);
            map = httpURLConnection.getRequestProperties();
        }
        Map map2 = map;
        cookie.load(httpURLConnection);
        if (bArr != null) {
            try {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                try {
                    httpURLConnection.getOutputStream().write(bArr);
                } catch (IOException e) {
                    Log.e((Throwable) e);
                    this.error_ = 6;
                    return;
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    this.error_ = 6;
                    return;
                }
            } catch (IllegalStateException e3) {
                Log.e((Throwable) e3);
                this.error_ = 3;
                return;
            } catch (IllegalArgumentException e4) {
                Log.e((Throwable) e4);
                this.error_ = 3;
                return;
            } catch (Exception e5) {
                Log.e((Throwable) e5);
                this.error_ = 3;
                return;
            }
        }
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (!z) {
                switch (responseCode) {
                    case 301:
                    case 302:
                    case 303:
                        redirect(httpURLConnection, abort, bArr, cookie, map2);
                        return;
                }
            }
            Set<String> keySet = httpURLConnection.getHeaderFields().keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(keySet.size());
            for (String str : keySet) {
                if (str != null) {
                    arrayList.add(str);
                    arrayList2.add(httpURLConnection.getHeaderField(str));
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                while (!abort.aborted()) {
                    try {
                        int read = inputStream.read(bArr2);
                        if (-1 == read) {
                            this.raw_connection_ = httpURLConnection;
                            this.status_ = responseCode;
                            this.headerNames_ = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            this.headerValues_ = (String[]) arrayList2.toArray(new String[arrayList.size()]);
                            this.content_ = byteArrayOutputStream.toByteArray();
                            this.error_ = 0;
                            cookie.save(this);
                            return;
                        }
                        try {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } catch (OutOfMemoryError e6) {
                            Log.e((Throwable) e6);
                            this.error_ = 6;
                            return;
                        }
                    } catch (SocketTimeoutException e7) {
                        Log.w((Throwable) e7);
                        if (abort.aborted()) {
                            this.error_ = 1;
                            return;
                        } else {
                            this.error_ = 2;
                            return;
                        }
                    } catch (SocketException e8) {
                        Log.e((Throwable) e8);
                        this.error_ = 6;
                        return;
                    } catch (IOException e9) {
                        Log.e((Throwable) e9);
                        this.error_ = 6;
                        return;
                    } catch (Exception e10) {
                        Log.e((Throwable) e10);
                        this.error_ = 6;
                        return;
                    }
                }
                this.error_ = 1;
            } catch (SocketTimeoutException e11) {
                Log.w((Throwable) e11);
                if (abort.aborted()) {
                    this.error_ = 1;
                } else {
                    this.error_ = 2;
                }
            } catch (SocketException e12) {
                Log.e((Throwable) e12);
                this.error_ = 6;
            } catch (IOException e13) {
                Log.e((Throwable) e13);
                this.error_ = 6;
            } catch (Exception e14) {
                Log.e((Throwable) e14);
                this.error_ = 6;
            }
        } catch (SocketTimeoutException e15) {
            Log.w((Throwable) e15);
            if (abort.aborted()) {
                this.error_ = 1;
            } else {
                this.error_ = 2;
            }
        } catch (SocketException e16) {
            Log.e((Throwable) e16);
            this.error_ = 6;
        } catch (IOException e17) {
            Log.e((Throwable) e17);
            this.error_ = 6;
        } catch (Exception e18) {
            Log.e((Throwable) e18);
            this.error_ = 6;
        }
    }

    private final void redirect(HttpURLConnection httpURLConnection, Abort abort, byte[] bArr, Cookie cookie, Map<String, List<String>> map) {
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(httpURLConnection.getHeaderField("Location")).openConnection();
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Iterator it = ((List) next.getValue()).iterator();
                if (it.hasNext()) {
                    httpURLConnection2.setRequestProperty(str, (String) it.next());
                }
                while (it.hasNext()) {
                    httpURLConnection2.addRequestProperty(str, (String) it.next());
                }
            }
            httpURLConnection2.setAllowUserInteraction(httpURLConnection.getAllowUserInteraction());
            httpURLConnection2.setConnectTimeout(httpURLConnection.getConnectTimeout());
            httpURLConnection2.setDefaultUseCaches(httpURLConnection.getDefaultUseCaches());
            httpURLConnection2.setDoInput(httpURLConnection.getDoInput());
            httpURLConnection2.setDoOutput(httpURLConnection.getDoOutput());
            httpURLConnection2.setIfModifiedSince(httpURLConnection.getIfModifiedSince());
            httpURLConnection2.setReadTimeout(httpURLConnection.getReadTimeout());
            httpURLConnection2.setUseCaches(httpURLConnection.getUseCaches());
            read(httpURLConnection2, abort, bArr, cookie);
        } catch (MalformedURLException e) {
            Log.e((Throwable) e);
        } catch (IOException e2) {
            Log.e((Throwable) e2);
        }
    }
}
