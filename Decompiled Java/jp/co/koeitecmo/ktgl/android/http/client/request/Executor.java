package jp.co.koeitecmo.ktgl.android.http.client.request;

import java.net.HttpURLConnection;

public final class Executor {

    public static final class Result {
        private int error_ = 0;
        private Response response_ = null;

        public Result(HttpURLConnection httpURLConnection, Abort abort, byte[] bArr, Cookie cookie) {
            this.response_ = new Response(httpURLConnection, abort, bArr, cookie);
            this.error_ = this.response_.error();
        }

        public final Response response() {
            return this.response_;
        }

        public final int error() {
            return this.error_;
        }
    }

    public static final Result execute(HttpURLConnection httpURLConnection, Abort abort, byte[] bArr, Cookie cookie) {
        return new Result(httpURLConnection, abort, bArr, cookie);
    }
}
