package jp.co.koeitecmo.ktgl.android.http.client.request;

import java.net.HttpURLConnection;

public final class Abort {
    private boolean aborted_ = false;
    private boolean aborting_ = false;
    private HttpURLConnection connection_ = null;
    private Object lock_ = new Object();

    public final boolean prepare(HttpURLConnection httpURLConnection) {
        synchronized (this.lock_) {
            if (this.aborting_) {
                return false;
            }
            this.connection_ = httpURLConnection;
            return true;
        }
    }

    public final void request() {
        synchronized (this.lock_) {
            if (this.connection_ != null) {
                this.connection_.disconnect();
                this.aborted_ = true;
            } else {
                this.aborting_ = true;
            }
        }
    }

    public final boolean aborted() {
        boolean z;
        synchronized (this.lock_) {
            z = this.aborted_;
        }
        return z;
    }
}
