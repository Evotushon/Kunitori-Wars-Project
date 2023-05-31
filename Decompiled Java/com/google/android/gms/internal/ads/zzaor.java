package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaor extends zzaow {
    private final Map<String, String> zzcsz;
    /* access modifiers changed from: private */
    public final Context zzur;

    public zzaor(zzbdv zzbdv, Map<String, String> map) {
        super(zzbdv, "storePicture");
        this.zzcsz = map;
        this.zzur = zzbdv.zzys();
    }

    public final void execute() {
        if (this.zzur == null) {
            zzdt("Activity context is not available");
            return;
        }
        zzq.zzkv();
        if (!zzawo.zzau(this.zzur).zzqg()) {
            zzdt("Feature is not supported by the device.");
            return;
        }
        String str = this.zzcsz.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzdt("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            zzdt(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzq.zzkv();
            if (!zzawo.zzek(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                zzdt(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources resources = zzq.zzkz().getResources();
            zzq.zzkv();
            AlertDialog.Builder zzat = zzawo.zzat(this.zzur);
            zzat.setTitle(resources != null ? resources.getString(R.string.s1) : "Save image");
            zzat.setMessage(resources != null ? resources.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
            zzat.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzaoq(this, str, lastPathSegment));
            zzat.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzaot(this));
            zzat.create().show();
        }
    }
}
