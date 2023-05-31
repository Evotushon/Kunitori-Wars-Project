package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzack extends NativeAd.AdChoicesInfo {
    private String text;
    private final List<NativeAd.Image> zzcwj = new ArrayList();
    private final zzacj zzcwu;

    public zzack(zzacj zzacj) {
        zzacr zzacr;
        IBinder iBinder;
        this.zzcwu = zzacj;
        try {
            this.text = this.zzcwu.getText();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            this.text = "";
        }
        try {
            for (zzacr next : zzacj.zzrb()) {
                if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                    zzacr = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzacr = queryLocalInterface instanceof zzacr ? (zzacr) queryLocalInterface : new zzact(iBinder);
                }
                if (zzacr != null) {
                    this.zzcwj.add(new zzacs(zzacr));
                }
            }
        } catch (RemoteException e2) {
            zzazh.zzc("", e2);
        }
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzcwj;
    }
}
