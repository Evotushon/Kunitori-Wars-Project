package jp.co.koeitecmo.DFusion;

import android.app.Application;

public class DFusionView extends KTBaseView {
    public DFusionView(Application application, KTBaseActivity kTBaseActivity, boolean z, int i, int i2) {
        super(application, kTBaseActivity, z, i, i2);
    }

    /* access modifiers changed from: protected */
    public void LoadLibrary() {
        System.loadLibrary("DFusion");
    }
}
