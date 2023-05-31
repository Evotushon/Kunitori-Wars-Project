package jp.co.koeitecmo.DFusion;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Calendar;
import jp.co.koeitecmo.lib.NotificationReceiver;
import jp.co.koeitecmo.lib.io.PrivateStorageManager;

public class DFusionActivity extends KTBaseActivity {
    private static final String TAG = "DFusion.DFusionActivity";
    /* access modifiers changed from: private */
    public static String cFCMToken = "";
    public static Context context;

    public KTBaseJni createJni(Application application, DFusionActivity dFusionActivity, DFusionView dFusionView) {
        return new DFusionJni(application, dFusionActivity, dFusionView);
    }

    public KTBaseView createView(Application application, KTBaseActivity kTBaseActivity, boolean z, int i, int i2) {
        return new DFusionView(application, kTBaseActivity, z, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        requestFirebaseInstanceId();
        setContext(this);
    }

    public void copyToClipBoard(String str) {
        m_ClipboardManager.setText(str);
    }

    public static void setContext(Context context2) {
        context = context2;
    }

    public static void reserveLocalNotification(String str, String str2, int i, int i2, String str3, String str4) {
        PendingIntent pendingIntent;
        int i3 = i;
        Intent intent = new Intent(context, NotificationReceiver.class);
        String str5 = str2;
        intent.putExtra("MESSAGE", str2);
        intent.putExtra("REQUEST_CODE", i);
        String str6 = str;
        intent.putExtra("TITLE", str);
        String str7 = str3;
        intent.putExtra("CHANNEL_ID", str3);
        intent.putExtra("CHANNEL_NAME", str4);
        if (Build.VERSION.SDK_INT >= 31) {
            pendingIntent = PendingIntent.getBroadcast(context, i, intent, 167772160);
        } else {
            pendingIntent = PendingIntent.getBroadcast(context, i, intent, 134217728);
        }
        PendingIntent pendingIntent2 = pendingIntent;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        int i4 = i2;
        instance.add(13, i2);
        PrivateStorageManager.add(context, PrivateStorageManager.remove(context, i), str2, i, str, str3, str4, instance.getTimeInMillis());
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (Build.VERSION.SDK_INT < 19) {
            alarmManager.set(0, instance.getTimeInMillis(), pendingIntent2);
        } else if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 23) {
            alarmManager.setExact(0, instance.getTimeInMillis(), pendingIntent2);
        } else if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(0, instance.getTimeInMillis(), pendingIntent2);
        }
    }

    public static void cancelLocalNotification(int i) {
        PendingIntent pendingIntent;
        Intent intent = new Intent(context, NotificationReceiver.class);
        if (Build.VERSION.SDK_INT >= 31) {
            pendingIntent = PendingIntent.getBroadcast(context, i, intent, 167772160);
        } else {
            pendingIntent = PendingIntent.getBroadcast(context, i, intent, 134217728);
        }
        ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(pendingIntent);
        PrivateStorageManager.save(context, PrivateStorageManager.remove(context, i));
    }

    public static Activity GetCurrentActivity() {
        return m_activity;
    }

    public void sendFoxPurchaseEvent(String str, int i, int i2, double d, String str2, int i3) {
        if (i2 == 0) {
            AdjustEvent adjustEvent = new AdjustEvent(str);
            adjustEvent.setRevenue(d, "JPY");
            adjustEvent.addCallbackParameter("buid", String.valueOf(i));
            adjustEvent.addCallbackParameter("sku", str2);
            adjustEvent.addCallbackParameter(FirebaseAnalytics.Param.QUANTITY, String.valueOf(i3));
            Adjust.trackEvent(adjustEvent);
            Log.i("koeitecmo.KTBaseActivity", "Adjust Send purchaseEvent " + str + "price " + d);
        }
    }

    public void sendFoxTrackEvent(String str, int i, int i2) {
        if (i2 == 0) {
            AdjustEvent adjustEvent = new AdjustEvent(str);
            adjustEvent.addCallbackParameter("buid", String.valueOf(i));
            Adjust.trackEvent(adjustEvent);
            Log.i("koeitecmo.KTBaseActivity", "Adjust Send Event " + str);
        }
    }

    public void requestFirebaseInstanceId() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            public void onComplete(@NonNull Task<String> task) {
                if (task.isComplete() && task.isSuccessful()) {
                    String unused = DFusionActivity.cFCMToken = task.getResult();
                    Log.i(DFusionActivity.TAG, "Save FirebaseInstance token as:" + task.getResult());
                }
            }
        });
    }

    public String getFirebaseInstanceId() throws InterruptedException {
        Log.i(TAG, "Get FirebaseInstance token: " + cFCMToken);
        String str = cFCMToken;
        return str == null ? "" : str;
    }

    public void subscribeFirebaseTopic(String str) {
        FirebaseMessaging.getInstance().subscribeToTopic(str).addOnCompleteListener(new OnCompleteListener<Void>() {
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.i(DFusionActivity.TAG, "Subscribe Success");
                } else {
                    Log.i(DFusionActivity.TAG, "Subscribe Faild");
                }
            }
        });
    }

    public void unsubscribeFirebaseTopic(String str) {
        FirebaseMessaging.getInstance().unsubscribeFromTopic(str).addOnCompleteListener(new OnCompleteListener<Void>() {
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.i(DFusionActivity.TAG, "UnSubscribe Success");
                } else {
                    Log.i(DFusionActivity.TAG, "UnSubscribe Faild");
                }
            }
        });
    }

    public void crashlyticsSetUserId(String str) {
        FirebaseCrashlytics.getInstance().setUserId(str);
    }

    public void crashlyticsSetLog(String str) {
        FirebaseCrashlytics.getInstance().log(str);
    }
}
