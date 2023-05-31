package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzayv {
    private static Map<String, List<Map<String, Object>>> zzdwj = new HashMap();
    private static List<MediaCodecInfo> zzdwk;
    private static final Object zzdwl = new Object();

    @TargetApi(16)
    public static List<Map<String, Object>> zzes(String str) {
        synchronized (zzdwl) {
            if (zzdwj.containsKey(str)) {
                List<Map<String, Object>> list = zzdwj.get(str);
                return list;
            }
            try {
                synchronized (zzdwl) {
                    if (zzdwk == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            zzdwk = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else {
                            int codecCount = MediaCodecList.getCodecCount();
                            zzdwk = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                zzdwk.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo next : zzdwk) {
                    if (!next.isEncoder() && Arrays.asList(next.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", next.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = next.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", zza(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", zza(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", zza(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", zza(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                zzdwj.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                zzdwj.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    private static Integer[] zza(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
