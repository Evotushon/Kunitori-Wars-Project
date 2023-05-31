package jp.co.koeitecmo.ktgl.android.obb;

import android.content.Context;
import android.os.storage.StorageManager;
import jp.co.koeitecmo.ktgl.android.util.Log;

public final class Module {
    private StorageManager storageManager_ = null;

    public Module(Context context) {
        this.storageManager_ = (StorageManager) context.getSystemService("storage");
        if (this.storageManager_ == null) {
            Log.e("failed to retrieves the Storage Manager");
        }
    }

    public final boolean mount(String str, long j) {
        return mount(str, (String) null, j);
    }

    public final boolean mount(String str, String str2, long j) {
        String str3;
        if (this.storageManager_.mountObb(str, str2, new Listener(this.storageManager_, j))) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("failed to mount ");
        sb.append(str);
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = "with " + str2;
        }
        sb.append(str3);
        Log.e(sb.toString());
        return false;
    }

    public final boolean unmount(String str, long j) {
        if (this.storageManager_.unmountObb(str, false, new Listener(this.storageManager_, j))) {
            return true;
        }
        Log.e("failed to unmount " + str);
        return false;
    }
}
