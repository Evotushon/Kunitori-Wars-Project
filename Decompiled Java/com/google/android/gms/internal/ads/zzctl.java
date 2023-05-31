package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctl implements zzcye<zzctm> {
    private final zzdeu zzfir;
    private final zzdoe zzghq;
    private final View zzghr;
    private final Context zzur;

    public zzctl(zzdoe zzdoe, Context context, zzdeu zzdeu, @Nullable ViewGroup viewGroup) {
        this.zzghq = zzdoe;
        this.zzur = context;
        this.zzfir = zzdeu;
        this.zzghr = viewGroup;
    }

    public final zzdof<zzctm> zzapb() {
        return this.zzghq.zzd(new zzcto(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzctm zzapc() throws Exception {
        Context context = this.zzur;
        zzuk zzuk = this.zzfir.zzblv;
        ArrayList arrayList = new ArrayList();
        View view = this.zzghr;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int i = -1;
            if (parent instanceof ViewGroup) {
                i = ((ViewGroup) parent).indexOfChild(view);
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzctm(context, zzuk, arrayList);
    }
}
