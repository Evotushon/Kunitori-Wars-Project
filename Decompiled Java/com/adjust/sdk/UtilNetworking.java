package com.adjust.sdk;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class UtilNetworking {
    /* access modifiers changed from: private */
    public static String userAgent;

    public interface IConnectionOptions {
        void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str);
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static void setUserAgent(String str) {
        userAgent = str;
    }

    public static ResponseData createPOSTHttpsURLConnection(String str, ActivityPackage activityPackage, int i) throws Exception {
        DataOutputStream dataOutputStream = null;
        try {
            HttpsURLConnection httpsURLConnection = AdjustFactory.getHttpsURLConnection(new URL(str));
            HashMap hashMap = new HashMap(activityPackage.getParameters());
            AdjustFactory.getConnectionOptions().applyConnectionOptions(httpsURLConnection, activityPackage.getClientSdk());
            String extractAppSecret = extractAppSecret(hashMap);
            String extractSecretId = extractSecretId(hashMap);
            extractEventCallbackId(hashMap);
            String buildAuthorizationHeader = buildAuthorizationHeader(hashMap, extractAppSecret, extractSecretId, activityPackage.getActivityKind().toString());
            if (buildAuthorizationHeader != null) {
                httpsURLConnection.setRequestProperty("Authorization", buildAuthorizationHeader);
            }
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream2 = new DataOutputStream(httpsURLConnection.getOutputStream());
            try {
                dataOutputStream2.writeBytes(getPostDataString(hashMap, i));
                ResponseData readHttpResponse = readHttpResponse(httpsURLConnection, activityPackage);
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (Exception unused) {
                }
                return readHttpResponse;
            } catch (Exception e) {
                e = e;
                dataOutputStream = dataOutputStream2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            throw e;
        }
    }

    public static ResponseData createGETHttpsURLConnection(ActivityPackage activityPackage, String str) throws Exception {
        try {
            HashMap hashMap = new HashMap(activityPackage.getParameters());
            String extractAppSecret = extractAppSecret(hashMap);
            String extractSecretId = extractSecretId(hashMap);
            extractEventCallbackId(hashMap);
            HttpsURLConnection httpsURLConnection = AdjustFactory.getHttpsURLConnection(new URL(buildUri(activityPackage.getPath(), hashMap, str).toString()));
            AdjustFactory.getConnectionOptions().applyConnectionOptions(httpsURLConnection, activityPackage.getClientSdk());
            String buildAuthorizationHeader = buildAuthorizationHeader(hashMap, extractAppSecret, extractSecretId, activityPackage.getActivityKind().toString());
            if (buildAuthorizationHeader != null) {
                httpsURLConnection.setRequestProperty("Authorization", buildAuthorizationHeader);
            }
            httpsURLConnection.setRequestMethod("GET");
            return readHttpResponse(httpsURLConnection, activityPackage);
        } catch (Exception e) {
            throw e;
        }
    }

    private static ResponseData readHttpResponse(HttpsURLConnection httpsURLConnection, ActivityPackage activityPackage) throws Exception {
        InputStream inputStream;
        JSONObject jSONObject;
        StringBuffer stringBuffer = new StringBuffer();
        ILogger logger = getLogger();
        ResponseData buildResponseData = ResponseData.buildResponseData(activityPackage);
        try {
            httpsURLConnection.connect();
            Integer valueOf = Integer.valueOf(httpsURLConnection.getResponseCode());
            if (valueOf.intValue() >= 400) {
                inputStream = httpsURLConnection.getErrorStream();
            } else {
                inputStream = httpsURLConnection.getInputStream();
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            String stringBuffer2 = stringBuffer.toString();
            logger.verbose("Response: %s", stringBuffer2);
            if (valueOf.intValue() == 429) {
                logger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                return buildResponseData;
            }
            if (!(stringBuffer2 == null || stringBuffer2.length() == 0)) {
                try {
                    jSONObject = new JSONObject(stringBuffer2);
                } catch (JSONException e) {
                    String formatString = Util.formatString("Failed to parse json response. (%s)", e.getMessage());
                    logger.error(formatString, new Object[0]);
                    buildResponseData.message = formatString;
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return buildResponseData;
                }
                buildResponseData.jsonResponse = jSONObject;
                String optString = jSONObject.optString("message", (String) null);
                buildResponseData.message = optString;
                buildResponseData.timestamp = jSONObject.optString("timestamp", (String) null);
                buildResponseData.adid = jSONObject.optString("adid", (String) null);
                String optString2 = jSONObject.optString("tracking_state", (String) null);
                if (optString2 != null && optString2.equals("opted_out")) {
                    buildResponseData.trackingState = TrackingState.OPTED_OUT;
                }
                if (optString == null) {
                    optString = "No message found";
                }
                if (valueOf == null || valueOf.intValue() != 200) {
                    logger.error("%s", optString);
                } else {
                    logger.info("%s", optString);
                    buildResponseData.success = true;
                }
            }
            return buildResponseData;
        } catch (Exception e2) {
            logger.error("Failed to read response. (%s)", e2.getMessage());
            throw e2;
        } catch (Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static String getPostDataString(Map<String, String> map, int i) throws UnsupportedEncodingException {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            String encode = URLEncoder.encode((String) next.getKey(), Constants.ENCODING);
            String str2 = (String) next.getValue();
            if (str2 != null) {
                str = URLEncoder.encode(str2, Constants.ENCODING);
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(encode);
            sb.append("=");
            sb.append(str);
        }
        String format = Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis()));
        sb.append("&");
        sb.append(URLEncoder.encode("sent_at", Constants.ENCODING));
        sb.append("=");
        sb.append(URLEncoder.encode(format, Constants.ENCODING));
        if (i > 0) {
            sb.append("&");
            sb.append(URLEncoder.encode("queue_size", Constants.ENCODING));
            sb.append("=");
            sb.append(URLEncoder.encode(str + i, Constants.ENCODING));
        }
        return sb.toString();
    }

    private static Uri buildUri(String str, Map<String, String> map, String str2) {
        String str3;
        Uri.Builder builder = new Uri.Builder();
        String str4 = Constants.SCHEME;
        String str5 = Constants.AUTHORITY;
        try {
            String baseUrl = AdjustFactory.getBaseUrl();
            if (str2 != null) {
                baseUrl = baseUrl + str2;
            }
            URL url = new URL(baseUrl);
            str4 = url.getProtocol();
            str5 = url.getAuthority();
            str3 = url.getPath();
        } catch (MalformedURLException e) {
            getLogger().error("Unable to parse endpoint (%s)", e.getMessage());
            str3 = "";
        }
        builder.scheme(str4);
        builder.encodedAuthority(str5);
        builder.path(str3);
        builder.appendPath(str);
        for (Map.Entry next : map.entrySet()) {
            builder.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        builder.appendQueryParameter("sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return builder.build();
    }

    private static String extractAppSecret(Map<String, String> map) {
        return map.remove("app_secret");
    }

    private static String extractSecretId(Map<String, String> map) {
        return map.remove("secret_id");
    }

    private static void extractEventCallbackId(Map<String, String> map) {
        map.remove("event_callback_id");
    }

    private static String buildAuthorizationHeader(Map<String, String> map, String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Map<String, String> signature = getSignature(map, str3, str);
        String sha256 = Util.sha256(signature.get("clear_signature"));
        String formatString = Util.formatString("Signature %s,%s,%s,%s", Util.formatString("secret_id=\"%s\"", str2), Util.formatString("signature=\"%s\"", sha256), Util.formatString("algorithm=\"%s\"", "sha256"), Util.formatString("headers=\"%s\"", signature.get("fields")));
        getLogger().verbose("authorizationHeader: %s", formatString);
        return formatString;
    }

    private static Map<String, String> getSignature(Map<String, String> map, String str, String str2) {
        String validIdentifier = getValidIdentifier(map);
        String str3 = map.get("source");
        String str4 = map.get("payload");
        HashMap hashMap = new HashMap();
        hashMap.put("app_secret", str2);
        hashMap.put("created_at", map.get("created_at"));
        hashMap.put("activity_kind", str);
        hashMap.put(validIdentifier, map.get(validIdentifier));
        if (str3 != null) {
            hashMap.put("source", str3);
        }
        if (str4 != null) {
            hashMap.put("payload", str4);
        }
        String str5 = "";
        String str6 = str5;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                str5 = str5 + ((String) entry.getKey()) + " ";
                str6 = str6 + ((String) entry.getValue());
            }
        }
        String substring = str5.substring(0, str5.length() - 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("clear_signature", str6);
        hashMap2.put("fields", substring);
        return hashMap2;
    }

    private static String getValidIdentifier(Map<String, String> map) {
        if (map.get("gps_adid") != null) {
            return "gps_adid";
        }
        if (map.get("fire_adid") != null) {
            return "fire_adid";
        }
        if (map.get("android_id") != null) {
            return "android_id";
        }
        if (map.get("mac_sha1") != null) {
            return "mac_sha1";
        }
        if (map.get("mac_md5") != null) {
            return "mac_md5";
        }
        if (map.get("android_uuid") != null) {
            return "android_uuid";
        }
        return null;
    }

    static class ConnectionOptions implements IConnectionOptions {
        ConnectionOptions() {
        }

        public void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str) {
            httpsURLConnection.setRequestProperty("Client-SDK", str);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setReadTimeout(60000);
            if (UtilNetworking.userAgent != null) {
                httpsURLConnection.setRequestProperty("User-Agent", UtilNetworking.userAgent);
            }
        }
    }
}
