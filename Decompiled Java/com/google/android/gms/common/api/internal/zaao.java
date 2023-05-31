package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaao extends zaas {
    private final /* synthetic */ zaai zago;
    private final ArrayList<Api.Client> zags;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaao(zaai zaai, ArrayList<Api.Client> arrayList) {
        super(zaai, (zaal) null);
        this.zago = zaai;
        this.zags = arrayList;
    }

    @WorkerThread
    public final void zaak() {
        this.zago.zafy.zaej.zahe = this.zago.zaar();
        ArrayList arrayList = this.zags;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Api.Client) obj).getRemoteService(this.zago.zagj, this.zago.zafy.zaej.zahe);
        }
    }
}
