package jp.co.koeitecmo.DFusion;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.Constants;

public class YSG2Application extends Application {
    public void onCreate() {
        super.onCreate();
        Log.i("koeitecmo", "Adjust Activate PRODUCTION");
        AdjustConfig adjustConfig = new AdjustConfig(this, "ho9rt96clvr4", AdjustConfig.ENVIRONMENT_PRODUCTION);
        adjustConfig.setAppSecret(2, 1223712994, 1546629744, 984973313, 1948714964);
        Adjust.onCreate(adjustConfig);
        registerActivityLifecycleCallbacks(new AdjustLifecycleCallbaks());
    }

    private static final class AdjustLifecycleCallbaks implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private AdjustLifecycleCallbaks() {
        }

        public void onActivityResumed(Activity activity) {
            Log.i(Constants.LOGTAG, "onActivityResumed");
            Adjust.onResume();
        }

        public void onActivityPaused(Activity activity) {
            Log.i(Constants.LOGTAG, "onActivityPaused");
            Adjust.onPause();
        }
    }
}
