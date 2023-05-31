package jp.co.koeitecmo.lib.io;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrivateStorageManager {
    public static String read(Context context) {
        if (context.getFileStreamPath("notification").exists()) {
            try {
                FileInputStream openFileInput = context.openFileInput("notification");
                byte[] bArr = new byte[openFileInput.available()];
                openFileInput.read(bArr);
                openFileInput.close();
                return new String(bArr).trim();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }

    public static String remove(Context context, int i) {
        String read = read(context);
        if (read.equals("")) {
            return "";
        }
        String[] split = read.split(":::row:::");
        String str = "";
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!split[i2].split(":::sep:::")[1].equals(Integer.toString(i))) {
                if (str == "") {
                    str = split[i2];
                } else {
                    str = str + ":::row:::" + split[i2];
                }
            }
        }
        return str;
    }

    public static void add(Context context, String str, String str2, int i, String str3, String str4, String str5, long j) {
        String str6;
        if (str == "") {
            str6 = str2 + ":::sep:::" + i + ":::sep:::" + str3 + ":::sep:::" + str4 + ":::sep:::" + str5 + ":::sep:::" + j;
        } else {
            str6 = str + ":::row:::" + str2 + ":::sep:::" + i + ":::sep:::" + str3 + ":::sep:::" + str4 + ":::sep:::" + str5 + ":::sep:::" + j;
        }
        save(context, str6);
    }

    public static void save(Context context, String str) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput("notification", 0);
            openFileOutput.write(str.getBytes());
            openFileOutput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
