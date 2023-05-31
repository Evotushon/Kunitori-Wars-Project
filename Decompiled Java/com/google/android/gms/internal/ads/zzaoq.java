package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaoq implements DialogInterface.OnClickListener {
    private final /* synthetic */ String zzdgz;
    private final /* synthetic */ String zzdha;
    private final /* synthetic */ zzaor zzdhb;

    zzaoq(zzaor zzaor, String str, String str2) {
        this.zzdhb = zzaor;
        this.zzdgz = str;
        this.zzdha = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.zzdhb.zzur.getSystemService("download");
        try {
            String str = this.zzdgz;
            String str2 = this.zzdha;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzq.zzkx();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzdhb.zzdt("Could not store picture.");
        }
    }
}
