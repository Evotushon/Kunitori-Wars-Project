package jp.co.koeitecmo.DFusion;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.Level5.YSG2.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final int NOTIFICATION_ID = 0;
    private static final String TAG = "DFusion";

    public void onMessageReceived(RemoteMessage remoteMessage) {
        PendingIntent pendingIntent;
        String title = remoteMessage.getNotification().getTitle();
        String body = remoteMessage.getNotification().getBody();
        if (title == null || title.isEmpty()) {
            title = getString(R.string.app_name);
        }
        NotificationCompat.Builder contentText = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.ic_push).setContentTitle(title).setContentText(body);
        Intent intent = new Intent(getApplicationContext(), DFusionActivity.class);
        if (Build.VERSION.SDK_INT >= 31) {
            pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 167772160);
        } else {
            pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 134217728);
        }
        contentText.setContentIntent(pendingIntent);
        contentText.setAutoCancel(true);
        ((NotificationManager) getSystemService("notification")).notify(0, contentText.build());
    }
}
