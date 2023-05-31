package com.level5.l5id;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class HttpConnect {
    private static final int HTTP_TIME_OUT = 30000;
    private static ResponseCallback f_response_cb = null;
    private static Activity m_activity = null;
    /* access modifiers changed from: private */
    public static HttpGetTask m_task = null;
    private static String m_userAgent = null;
    private static boolean s_isEnableDebug = false;

    public interface ResponseCallback {
        void onExecute(int i, boolean z, int i2, String str);
    }

    public static boolean IsSuccessStatusCode(int i) {
        return 200 <= i && i < 400;
    }

    public static void SetEnableDebug(boolean z) {
        s_isEnableDebug = z;
    }

    public static void PutLog(String str) {
        if (s_isEnableDebug) {
            Log.i("L5iD_HTTP", str);
        }
    }

    public static void Initialize(String str, Activity activity) {
        m_userAgent = str;
        m_activity = activity;
    }

    public static void Finalize() {
        Reset();
    }

    public static int Send(String str, String str2, ResponseCallback responseCallback) {
        HttpRequestParam httpRequestParam = new HttpRequestParam();
        httpRequestParam.ResponseCb = responseCallback;
        httpRequestParam.Param = str2;
        httpRequestParam.Url = str;
        HttpTaskRunnable httpTaskRunnable = new HttpTaskRunnable();
        int GetRequestId = httpTaskRunnable.GetRequestId();
        httpTaskRunnable.SetRequest(httpRequestParam);
        new Handler(m_activity.getMainLooper()).post(httpTaskRunnable);
        return GetRequestId;
    }

    public static void Reset() {
        HttpGetTask httpGetTask = m_task;
        if (httpGetTask != null) {
            httpGetTask.cancel(true);
            m_task = null;
        }
        m_activity = null;
        f_response_cb = null;
    }

    public static String GetResponseContents(HttpURLConnection httpURLConnection) {
        StringBuffer stringBuffer = new StringBuffer();
        if (httpURLConnection != null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                String contentEncoding = httpURLConnection.getContentEncoding();
                if (contentEncoding == null) {
                    contentEncoding = Constants.ENCODING;
                }
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, contentEncoding);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                bufferedReader.close();
                inputStreamReader.close();
                inputStream.close();
            } catch (Exception e) {
                PutLog(e.getMessage());
            }
        }
        return stringBuffer.toString();
    }

    static class HttpTaskRunnable implements Runnable {
        private static int f_request_unique_id = 1;
        private int f_current_request_id = 0;
        private HttpRequestParam f_request = null;

        HttpTaskRunnable() {
        }

        public int GetRequestId() {
            int i = f_request_unique_id;
            f_request_unique_id = i + 1;
            this.f_current_request_id = i;
            return this.f_current_request_id;
        }

        public static int GetRequestIdOnly() {
            int i = f_request_unique_id;
            f_request_unique_id = i + 1;
            return i;
        }

        public void SetRequest(HttpRequestParam httpRequestParam) {
            this.f_request = httpRequestParam;
        }

        public void run() {
            HttpGetTask unused = HttpConnect.m_task = new HttpGetTask();
            HttpConnect.m_task.SetRequestId(this.f_current_request_id);
            HttpConnect.m_task.execute(new HttpRequestParam[]{this.f_request});
        }
    }

    static class HttpRequestParam {
        public String ContentType = "application/x-www-form-urlencoded";
        public String Param = null;
        public ResponseCallback ResponseCb = null;
        public String Url = null;

        HttpRequestParam() {
        }
    }

    static class HttpGetTask extends AsyncTask<HttpRequestParam, Integer, HttpURLConnection> {
        private int m_requestId = 0;
        private String m_response = "";
        private ResponseCallback m_responseCb = null;
        private int m_statusCode = 0;

        HttpGetTask() {
        }

        public void SetRequestId(int i) {
            this.m_requestId = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0072, code lost:
            if (r0 != null) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
            if (r0 != null) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
            r0.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.net.HttpURLConnection doInBackground(com.level5.l5id.HttpConnect.HttpRequestParam... r8) {
            /*
                r7 = this;
                int r0 = r8.length
                r1 = 0
                if (r0 <= 0) goto L_0x0092
                java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
                r2 = 0
                r3 = r8[r2]     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
                java.lang.String r3 = r3.Url     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
                r0.<init>(r3)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
                r3 = 30000(0x7530, float:4.2039E-41)
                r0.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0075 }
                r0.setReadTimeout(r3)     // Catch:{ IOException -> 0x0075 }
                r3 = r8[r2]     // Catch:{ IOException -> 0x0075 }
                java.lang.String r3 = r3.Param     // Catch:{ IOException -> 0x0075 }
                if (r3 == 0) goto L_0x0058
                java.lang.String r3 = "POST"
                r0.setRequestMethod(r3)     // Catch:{ IOException -> 0x0075 }
                java.lang.String r3 = "Content-Type"
                r4 = r8[r2]     // Catch:{ IOException -> 0x0075 }
                java.lang.String r4 = r4.ContentType     // Catch:{ IOException -> 0x0075 }
                r0.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0075 }
                r3 = 1
                r0.setDoOutput(r3)     // Catch:{ IOException -> 0x0075 }
                r0.setDoInput(r3)     // Catch:{ IOException -> 0x0075 }
                java.io.OutputStream r3 = r0.getOutputStream()     // Catch:{ IOException -> 0x0075 }
                java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0075 }
                java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0075 }
                java.lang.String r6 = "UTF-8"
                r5.<init>(r3, r6)     // Catch:{ IOException -> 0x0075 }
                r4.<init>(r5)     // Catch:{ IOException -> 0x0075 }
                r5 = r8[r2]     // Catch:{ IOException -> 0x0075 }
                java.lang.String r5 = r5.Param     // Catch:{ IOException -> 0x0075 }
                r4.write(r5)     // Catch:{ IOException -> 0x0075 }
                r4.flush()     // Catch:{ IOException -> 0x0075 }
                r4.close()     // Catch:{ IOException -> 0x0075 }
                r3.close()     // Catch:{ IOException -> 0x0075 }
                goto L_0x005d
            L_0x0058:
                java.lang.String r3 = "GET"
                r0.setRequestMethod(r3)     // Catch:{ IOException -> 0x0075 }
            L_0x005d:
                r8 = r8[r2]     // Catch:{ IOException -> 0x0075 }
                com.level5.l5id.HttpConnect$ResponseCallback r8 = r8.ResponseCb     // Catch:{ IOException -> 0x0075 }
                r7.m_responseCb = r8     // Catch:{ IOException -> 0x0075 }
                r0.connect()     // Catch:{ IOException -> 0x0075 }
                java.lang.String r8 = com.level5.l5id.HttpConnect.GetResponseContents(r0)     // Catch:{ IOException -> 0x0075 }
                r7.m_response = r8     // Catch:{ IOException -> 0x0075 }
                int r8 = r0.getResponseCode()     // Catch:{ IOException -> 0x0075 }
                r7.m_statusCode = r8     // Catch:{ IOException -> 0x0075 }
                if (r0 == 0) goto L_0x0089
                goto L_0x0085
            L_0x0075:
                r8 = move-exception
                goto L_0x007c
            L_0x0077:
                r8 = move-exception
                r0 = r1
                goto L_0x008c
            L_0x007a:
                r8 = move-exception
                r0 = r1
            L_0x007c:
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x008b }
                com.level5.l5id.HttpConnect.PutLog(r8)     // Catch:{ all -> 0x008b }
                if (r0 == 0) goto L_0x0089
            L_0x0085:
                r0.disconnect()
                goto L_0x0092
            L_0x0089:
                r1 = r0
                goto L_0x0092
            L_0x008b:
                r8 = move-exception
            L_0x008c:
                if (r0 == 0) goto L_0x0091
                r0.disconnect()
            L_0x0091:
                throw r8
            L_0x0092:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.level5.l5id.HttpConnect.HttpGetTask.doInBackground(com.level5.l5id.HttpConnect$HttpRequestParam[]):java.net.HttpURLConnection");
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
        }

        /* access modifiers changed from: protected */
        public void onCancelled(HttpURLConnection httpURLConnection) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            ResponseCallback responseCallback = this.m_responseCb;
            if (responseCallback != null) {
                responseCallback.onExecute(this.m_requestId, false, 0, "");
                this.m_responseCb = null;
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(HttpURLConnection httpURLConnection) {
            HttpConnect.PutLog("Response: " + this.m_response);
            HttpConnect.PutLog("StatusCode: " + this.m_statusCode);
            ResponseCallback responseCallback = this.m_responseCb;
            if (responseCallback != null) {
                responseCallback.onExecute(this.m_requestId, HttpConnect.IsSuccessStatusCode(this.m_statusCode), this.m_statusCode, this.m_response);
                this.m_responseCb = null;
            }
        }
    }
}
