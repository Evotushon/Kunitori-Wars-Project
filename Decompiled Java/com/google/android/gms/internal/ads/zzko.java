package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzlh;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzko {
    private static final int zzawf = zzop.zzbo("nam");
    private static final int zzawg = zzop.zzbo("trk");
    private static final int zzawh = zzop.zzbo("cmt");
    private static final int zzawi = zzop.zzbo("day");
    private static final int zzawj = zzop.zzbo("ART");
    private static final int zzawk = zzop.zzbo("too");
    private static final int zzawl = zzop.zzbo("alb");
    private static final int zzawm = zzop.zzbo("com");
    private static final int zzawn = zzop.zzbo("wrt");
    private static final int zzawo = zzop.zzbo("lyr");
    private static final int zzawp = zzop.zzbo("gen");
    private static final int zzawq = zzop.zzbo("covr");
    private static final int zzawr = zzop.zzbo("gnre");
    private static final int zzaws = zzop.zzbo("grp");
    private static final int zzawt = zzop.zzbo("disk");
    private static final int zzawu = zzop.zzbo("trkn");
    private static final int zzawv = zzop.zzbo("tmpo");
    private static final int zzaww = zzop.zzbo("cpil");
    private static final int zzawx = zzop.zzbo("aART");
    private static final int zzawy = zzop.zzbo("sonm");
    private static final int zzawz = zzop.zzbo("soal");
    private static final int zzaxa = zzop.zzbo("soar");
    private static final int zzaxb = zzop.zzbo("soaa");
    private static final int zzaxc = zzop.zzbo("soco");
    private static final int zzaxd = zzop.zzbo("rtng");
    private static final int zzaxe = zzop.zzbo("pgap");
    private static final int zzaxf = zzop.zzbo("sosn");
    private static final int zzaxg = zzop.zzbo("tvsh");
    private static final int zzaxh = zzop.zzbo("----");
    private static final String[] zzaxi = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static zzlh.zza zzd(zzom zzom) {
        zzln zzln;
        int position = zzom.getPosition() + zzom.readInt();
        int readInt = zzom.readInt();
        int i = readInt >>> 24;
        zzlh.zza zza = null;
        if (i == 169 || i == 65533) {
            int i2 = 16777215 & readInt;
            if (i2 == zzawh) {
                int readInt2 = zzom.readInt();
                if (zzom.readInt() == zzkc.zzaum) {
                    zzom.zzbi(8);
                    String zzbj = zzom.zzbj(readInt2 - 16);
                    zza = new zzlj("und", zzbj, zzbj);
                } else {
                    String valueOf = String.valueOf(zzkc.zzap(readInt));
                    Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                }
                zzom.zzbh(position);
                return zza;
            }
            if (i2 != zzawf) {
                if (i2 != zzawg) {
                    if (i2 != zzawm) {
                        if (i2 != zzawn) {
                            if (i2 == zzawi) {
                                zzln zza2 = zza(readInt, "TDRC", zzom);
                                zzom.zzbh(position);
                                return zza2;
                            } else if (i2 == zzawj) {
                                zzln zza3 = zza(readInt, "TPE1", zzom);
                                zzom.zzbh(position);
                                return zza3;
                            } else if (i2 == zzawk) {
                                zzln zza4 = zza(readInt, "TSSE", zzom);
                                zzom.zzbh(position);
                                return zza4;
                            } else if (i2 == zzawl) {
                                zzln zza5 = zza(readInt, "TALB", zzom);
                                zzom.zzbh(position);
                                return zza5;
                            } else if (i2 == zzawo) {
                                zzln zza6 = zza(readInt, "USLT", zzom);
                                zzom.zzbh(position);
                                return zza6;
                            } else if (i2 == zzawp) {
                                zzln zza7 = zza(readInt, "TCON", zzom);
                                zzom.zzbh(position);
                                return zza7;
                            } else if (i2 == zzaws) {
                                zzln zza8 = zza(readInt, "TIT1", zzom);
                                zzom.zzbh(position);
                                return zza8;
                            }
                        }
                    }
                    zzln zza9 = zza(readInt, "TCOM", zzom);
                    zzom.zzbh(position);
                    return zza9;
                }
            }
            zzln zza10 = zza(readInt, "TIT2", zzom);
            zzom.zzbh(position);
            return zza10;
        }
        try {
            if (readInt == zzawr) {
                int zze = zze(zzom);
                String str = (zze <= 0 || zze > zzaxi.length) ? null : zzaxi[zze - 1];
                if (str != null) {
                    zzln = new zzln("TCON", (String) null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                    zzln = null;
                }
                return zzln;
            } else if (readInt == zzawt) {
                zzln zzb = zzb(readInt, "TPOS", zzom);
                zzom.zzbh(position);
                return zzb;
            } else if (readInt == zzawu) {
                zzln zzb2 = zzb(readInt, "TRCK", zzom);
                zzom.zzbh(position);
                return zzb2;
            } else if (readInt == zzawv) {
                zzlo zza11 = zza(readInt, "TBPM", zzom, true, false);
                zzom.zzbh(position);
                return zza11;
            } else if (readInt == zzaww) {
                zzlo zza12 = zza(readInt, "TCMP", zzom, true, true);
                zzom.zzbh(position);
                return zza12;
            } else if (readInt == zzawq) {
                int readInt3 = zzom.readInt();
                if (zzom.readInt() == zzkc.zzaum) {
                    int zzao = zzkc.zzao(zzom.readInt());
                    String str2 = zzao == 13 ? "image/jpeg" : zzao == 14 ? "image/png" : null;
                    if (str2 == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(zzao);
                        Log.w("MetadataUtil", sb.toString());
                    } else {
                        zzom.zzbi(4);
                        byte[] bArr = new byte[(readInt3 - 16)];
                        zzom.zze(bArr, 0, bArr.length);
                        zza = new zzli(str2, (String) null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                zzom.zzbh(position);
                return zza;
            } else if (readInt == zzawx) {
                zzln zza13 = zza(readInt, "TPE2", zzom);
                zzom.zzbh(position);
                return zza13;
            } else if (readInt == zzawy) {
                zzln zza14 = zza(readInt, "TSOT", zzom);
                zzom.zzbh(position);
                return zza14;
            } else if (readInt == zzawz) {
                zzln zza15 = zza(readInt, "TSO2", zzom);
                zzom.zzbh(position);
                return zza15;
            } else if (readInt == zzaxa) {
                zzln zza16 = zza(readInt, "TSOA", zzom);
                zzom.zzbh(position);
                return zza16;
            } else if (readInt == zzaxb) {
                zzln zza17 = zza(readInt, "TSOP", zzom);
                zzom.zzbh(position);
                return zza17;
            } else if (readInt == zzaxc) {
                zzln zza18 = zza(readInt, "TSOC", zzom);
                zzom.zzbh(position);
                return zza18;
            } else if (readInt == zzaxd) {
                zzlo zza19 = zza(readInt, "ITUNESADVISORY", zzom, false, false);
                zzom.zzbh(position);
                return zza19;
            } else if (readInt == zzaxe) {
                zzlo zza20 = zza(readInt, "ITUNESGAPLESS", zzom, false, true);
                zzom.zzbh(position);
                return zza20;
            } else if (readInt == zzaxf) {
                zzln zza21 = zza(readInt, "TVSHOWSORT", zzom);
                zzom.zzbh(position);
                return zza21;
            } else if (readInt == zzaxg) {
                zzln zza22 = zza(readInt, "TVSHOW", zzom);
                zzom.zzbh(position);
                return zza22;
            } else if (readInt == zzaxh) {
                String str3 = null;
                String str4 = null;
                int i3 = -1;
                int i4 = -1;
                while (zzom.getPosition() < position) {
                    int position2 = zzom.getPosition();
                    int readInt4 = zzom.readInt();
                    int readInt5 = zzom.readInt();
                    zzom.zzbi(4);
                    if (readInt5 == zzkc.zzauk) {
                        str3 = zzom.zzbj(readInt4 - 12);
                    } else if (readInt5 == zzkc.zzaul) {
                        str4 = zzom.zzbj(readInt4 - 12);
                    } else {
                        if (readInt5 == zzkc.zzaum) {
                            i3 = position2;
                            i4 = readInt4;
                        }
                        zzom.zzbi(readInt4 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4)) {
                    if (i3 != -1) {
                        zzom.zzbh(i3);
                        zzom.zzbi(16);
                        zza = new zzlj("und", str4, zzom.zzbj(i4 - 16));
                    }
                }
                zzom.zzbh(position);
                return zza;
            }
        } finally {
            zzom.zzbh(position);
        }
        String valueOf2 = String.valueOf(zzkc.zzap(readInt));
        Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
        zzom.zzbh(position);
        return null;
    }

    private static zzln zza(int i, String str, zzom zzom) {
        int readInt = zzom.readInt();
        if (zzom.readInt() == zzkc.zzaum) {
            zzom.zzbi(8);
            return new zzln(str, (String) null, zzom.zzbj(readInt - 16));
        }
        String valueOf = String.valueOf(zzkc.zzap(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzlo zza(int i, String str, zzom zzom, boolean z, boolean z2) {
        int zze = zze(zzom);
        if (z2) {
            zze = Math.min(1, zze);
        }
        if (zze < 0) {
            String valueOf = String.valueOf(zzkc.zzap(i));
            Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z) {
            return new zzln(str, (String) null, Integer.toString(zze));
        } else {
            return new zzlj("und", str, Integer.toString(zze));
        }
    }

    private static zzln zzb(int i, String str, zzom zzom) {
        int readInt = zzom.readInt();
        if (zzom.readInt() == zzkc.zzaum && readInt >= 22) {
            zzom.zzbi(10);
            int readUnsignedShort = zzom.readUnsignedShort();
            if (readUnsignedShort > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(readUnsignedShort);
                String sb2 = sb.toString();
                int readUnsignedShort2 = zzom.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(readUnsignedShort2);
                    sb2 = sb3.toString();
                }
                return new zzln(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(zzkc.zzap(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzom zzom) {
        zzom.zzbi(4);
        if (zzom.readInt() == zzkc.zzaum) {
            zzom.zzbi(8);
            return zzom.readUnsignedByte();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
