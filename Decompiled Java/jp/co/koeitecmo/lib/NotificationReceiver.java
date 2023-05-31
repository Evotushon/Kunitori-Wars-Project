package jp.co.koeitecmo.lib;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.Level5.YSG2.R;
import jp.co.koeitecmo.DFusion.DFusionActivity;
import jp.co.koeitecmo.lib.io.PrivateStorageManager;

public class NotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        Context context2 = context;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("MESSAGE");
        String stringExtra2 = intent2.getStringExtra("TITLE");
        if (Build.VERSION.SDK_INT >= 26) {
            String stringExtra3 = intent2.getStringExtra("CHANNEL_ID");
            if (stringExtra3.equals("")) {
                stringExtra3 = "koeitecmo_default";
            }
            String stringExtra4 = intent2.getStringExtra("CHANNEL_NAME");
            if (stringExtra4.equals("")) {
                stringExtra4 = "miscellaneous";
            }
            NotificationChannel notificationChannel = new NotificationChannel(stringExtra3, stringExtra4, 4);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.enableVibration(false);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context2.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            Intent intent3 = new Intent(context2, DFusionActivity.class);
            Notification.Builder when = new Notification.Builder(context2, stringExtra3).setSmallIcon(R.drawable.ic_push).setContentTitle(stringExtra2).setContentText(stringExtra).setWhen(System.currentTimeMillis());
            int intExtra = intent2.getIntExtra("REQUEST_CODE", 0);
            if (Build.VERSION.SDK_INT >= 31) {
                pendingIntent2 = PendingIntent.getActivity(context2, intExtra, intent3, 301989888);
            } else {
                pendingIntent2 = PendingIntent.getActivity(context2, intExtra, intent3, 268435456);
            }
            when.setContentIntent(pendingIntent2);
            when.setAutoCancel(true);
            ((NotificationManager) context2.getSystemService("notification")).notify(0, when.build());
            PrivateStorageManager.save(context2, PrivateStorageManager.remove(context2, intExtra));
            return;
        }
        Intent intent4 = new Intent(context2, DFusionActivity.class);
        NotificationCompat.Builder when2 = new NotificationCompat.Builder(context2).setSmallIcon(R.drawable.ic_push).setContentTitle(stringExtra2).setContentText(stringExtra).setWhen(System.currentTimeMillis());
        int intExtra2 = intent2.getIntExtra("REQUEST_CODE", 0);
        if (Build.VERSION.SDK_INT >= 31) {
            pendingIntent = PendingIntent.getActivity(context2, intExtra2, intent4, 301989888);
        } else {
            pendingIntent = PendingIntent.getActivity(context2, intExtra2, intent4, 268435456);
        }
        when2.setContentIntent(pendingIntent);
        when2.setAutoCancel(true);
        ((NotificationManager) context2.getSystemService("notification")).notify(0, when2.build());
        PrivateStorageManager.save(context2, PrivateStorageManager.remove(context2, intExtra2));
    }
}
