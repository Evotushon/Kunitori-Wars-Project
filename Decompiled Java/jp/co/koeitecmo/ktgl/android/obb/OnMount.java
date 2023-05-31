package jp.co.koeitecmo.ktgl.android.obb;

import android.os.storage.OnObbStateChangeListener;
import android.os.storage.StorageManager;

public final class OnMount extends OnObbStateChangeListener {
    private long id_ = 0;
    private StorageManager storageManager_ = null;

    private native void onError(long j, int i);

    private native void onMount(long j, String str);

    public OnMount(StorageManager storageManager, long j) {
        this.storageManager_ = storageManager;
        this.id_ = j;
    }

    public final void onObbStateChange(String str, int i) {
        if (i != 1) {
            onError(this.id_, i);
        } else {
            onMount(this.id_, this.storageManager_.getMountedObbPath(str));
        }
    }
}
