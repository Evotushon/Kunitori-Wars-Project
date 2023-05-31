package jp.co.koeitecmo.lib.io;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class SharedPreferencesManager {
    private static final String TAG = "lib.io.SharedPreferences";
    private static SharedPreferences sp;

    public SharedPreferencesManager(Context context) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public synchronized void clearPreferences() {
        SharedPreferences.Editor edit = sp.edit();
        edit.clear();
        edit.commit();
    }

    public synchronized int getIntPreferences(String str) {
        int i;
        i = sp.getInt(str, 0);
        Log.i("lib.io.SharedPreferences.getIntPreferences", str + " : " + i);
        return i;
    }

    public synchronized String getStringPreferences(String str) {
        String string;
        string = sp.getString(str, "");
        Log.i("lib.io.SharedPreferences.getStringPreferences", str + " : " + string);
        return string;
    }

    public synchronized boolean setIntPreferences(String str, int i) {
        boolean commit;
        commit = sp.edit().putInt(str, i).commit();
        if (!commit) {
            Log.w("lib.io.SharedPreferences.setPreferences", "commit failed " + str + " : " + i);
        } else {
            Log.i("lib.io.SharedPreferences.setPreferences", "commit success " + str + " : " + i);
        }
        return commit;
    }

    public synchronized boolean setStringPreferences(String str, String str2) {
        boolean commit;
        commit = sp.edit().putString(str, str2).commit();
        if (!commit) {
            Log.w("lib.io.SharedPreferences.setPreferences", "commit failed " + str + " : " + str2);
        } else {
            Log.i("lib.io.SharedPreferences.setPreferences", "commit success " + str + " : " + str2);
        }
        return commit;
    }
}
