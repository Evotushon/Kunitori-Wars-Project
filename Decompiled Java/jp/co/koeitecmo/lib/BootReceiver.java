package jp.co.koeitecmo.lib;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import jp.co.koeitecmo.lib.io.PrivateStorageManager;

public class BootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        Log.d("BootReceiverSample", "boot completed");
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            String read = PrivateStorageManager.read(context);
            if (!read.equals("")) {
                String[] split = read.split(":::row:::");
                for (int i = 0; i < split.length; i++) {
                    Log.d("BootReceiverSample", split[i]);
                    String[] split2 = split[i].split(":::sep:::");
                    Intent intent2 = new Intent(context, NotificationReceiver.class);
                    intent2.putExtra("MESSAGE", split2[0]);
                    intent2.putExtra("REQUEST_CODE", split2[1]);
                    intent2.putExtra("TITLE", split2[2]);
                    intent2.putExtra("CHANNEL_ID", split2[3]);
                    intent2.putExtra("CHANNEL_NAME", split2[4]);
                    if (Build.VERSION.SDK_INT >= 31) {
                        pendingIntent = PendingIntent.getBroadcast(context, Integer.parseInt(split2[1]), intent2, 167772160);
                    } else {
                        pendingIntent = PendingIntent.getBroadcast(context, Integer.parseInt(split2[1]), intent2, 134217728);
                    }
                    AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
                    if (Build.VERSION.SDK_INT < 19) {
                        alarmManager.set(0, Long.parseLong(split2[split2.length - 1]), pendingIntent);
                    } else if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 23) {
                        alarmManager.setExact(0, Long.parseLong(split2[split2.length - 1]), pendingIntent);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        alarmManager.setExactAndAllowWhileIdle(0, Long.parseLong(split2[split2.length - 1]), pendingIntent);
                    }
                }
            }
        }
    }
}
