package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdyg implements zzeax {
    private int tag;
    private final zzdxz zzhpa;
    private int zzhpb;
    private int zzhpc = 0;

    public static zzdyg zza(zzdxz zzdxz) {
        if (zzdxz.zzhop != null) {
            return zzdxz.zzhop;
        }
        return new zzdyg(zzdxz);
    }

    private zzdyg(zzdxz zzdxz) {
        this.zzhpa = (zzdxz) zzdzc.zza(zzdxz, "input");
        this.zzhpa.zzhop = this;
    }

    public final int zzbbz() throws IOException {
        int i = this.zzhpc;
        if (i != 0) {
            this.tag = i;
            this.zzhpc = 0;
        } else {
            this.tag = this.zzhpa.zzbbb();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zzhpb) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzbca() throws IOException {
        int i;
        if (this.zzhpa.zzbbr() || (i = this.tag) == this.zzhpb) {
            return false;
        }
        return this.zzhpa.zzfi(i);
    }

    private final void zzfr(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzdzh.zzbdn();
        }
    }

    public final double readDouble() throws IOException {
        zzfr(1);
        return this.zzhpa.readDouble();
    }

    public final float readFloat() throws IOException {
        zzfr(5);
        return this.zzhpa.readFloat();
    }

    public final long zzbbc() throws IOException {
        zzfr(0);
        return this.zzhpa.zzbbc();
    }

    public final long zzbbd() throws IOException {
        zzfr(0);
        return this.zzhpa.zzbbd();
    }

    public final int zzbbe() throws IOException {
        zzfr(0);
        return this.zzhpa.zzbbe();
    }

    public final long zzbbf() throws IOException {
        zzfr(1);
        return this.zzhpa.zzbbf();
    }

    public final int zzbbg() throws IOException {
        zzfr(5);
        return this.zzhpa.zzbbg();
    }

    public final boolean zzbbh() throws IOException {
        zzfr(0);
        return this.zzhpa.zzbbh();
    }

    public final String readString() throws IOException {
        zzfr(2);
        return this.zzhpa.readString();
    }

    public final String zzbbi() throws IOException {
        zzfr(2);
        return this.zzhpa.zzbbi();
    }

    public final <T> T zza(zzebd<T> zzebd, zzdym zzdym) throws IOException {
        zzfr(2);
        return zzc(zzebd, zzdym);
    }

    public final <T> T zzb(zzebd<T> zzebd, zzdym zzdym) throws IOException {
        zzfr(3);
        return zzd(zzebd, zzdym);
    }

    private final <T> T zzc(zzebd<T> zzebd, zzdym zzdym) throws IOException {
        int zzbbk = this.zzhpa.zzbbk();
        if (this.zzhpa.zzhom < this.zzhpa.zzhon) {
            int zzfj = this.zzhpa.zzfj(zzbbk);
            T newInstance = zzebd.newInstance();
            this.zzhpa.zzhom++;
            zzebd.zza(newInstance, this, zzdym);
            zzebd.zzan(newInstance);
            this.zzhpa.zzfh(0);
            zzdxz zzdxz = this.zzhpa;
            zzdxz.zzhom--;
            this.zzhpa.zzfk(zzfj);
            return newInstance;
        }
        throw new zzdzh("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final <T> T zzd(zzebd<T> zzebd, zzdym zzdym) throws IOException {
        int i = this.zzhpb;
        this.zzhpb = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzebd.newInstance();
            zzebd.zza(newInstance, this, zzdym);
            zzebd.zzan(newInstance);
            if (this.tag == this.zzhpb) {
                return newInstance;
            }
            throw zzdzh.zzbdp();
        } finally {
            this.zzhpb = i;
        }
    }

    public final zzdxn zzbbj() throws IOException {
        zzfr(2);
        return this.zzhpa.zzbbj();
    }

    public final int zzbbk() throws IOException {
        zzfr(0);
        return this.zzhpa.zzbbk();
    }

    public final int zzbbl() throws IOException {
        zzfr(0);
        return this.zzhpa.zzbbl();
    }

    public final int zzbbm() throws IOException {
        zzfr(5);
        return this.zzhpa.zzbbm();
    }

    public final long zzbbn() throws IOException {
        zzfr(1);
        return this.zzhpa.zzbbn();
    }

    public final int zzbbo() throws IOException {
        zzfr(0);
        return this.zzhpa.zzbbo();
    }

    public final long zzbbp() throws IOException {
        zzfr(0);
        return this.zzhpa.zzbbp();
    }

    public final void zzj(List<Double> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdyl) {
            zzdyl zzdyl = (zzdyl) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzdyl.zzd(this.zzhpa.readDouble());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbk = this.zzhpa.zzbbk();
                zzfs(zzbbk);
                int zzbbs = this.zzhpa.zzbbs() + zzbbk;
                do {
                    zzdyl.zzd(this.zzhpa.readDouble());
                } while (this.zzhpa.zzbbs() < zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.zzhpa.readDouble()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbk2 = this.zzhpa.zzbbk();
                zzfs(zzbbk2);
                int zzbbs2 = this.zzhpa.zzbbs() + zzbbk2;
                do {
                    list.add(Double.valueOf(this.zzhpa.readDouble()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzk(List<Float> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdyv) {
            zzdyv zzdyv = (zzdyv) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbbk = this.zzhpa.zzbbk();
                zzft(zzbbk);
                int zzbbs = this.zzhpa.zzbbs() + zzbbk;
                do {
                    zzdyv.zzh(this.zzhpa.readFloat());
                } while (this.zzhpa.zzbbs() < zzbbs);
            } else if (i == 5) {
                do {
                    zzdyv.zzh(this.zzhpa.readFloat());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzbbk2 = this.zzhpa.zzbbk();
                zzft(zzbbk2);
                int zzbbs2 = this.zzhpa.zzbbs() + zzbbk2;
                do {
                    list.add(Float.valueOf(this.zzhpa.readFloat()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.zzhpa.readFloat()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzl(List<Long> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdzv) {
            zzdzv zzdzv = (zzdzv) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbc());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbs = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbc());
                } while (this.zzhpa.zzbbs() < zzbbs);
                zzfu(zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbc()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbs2 = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbc()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
                zzfu(zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzm(List<Long> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdzv) {
            zzdzv zzdzv = (zzdzv) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbd());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbs = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbd());
                } while (this.zzhpa.zzbbs() < zzbbs);
                zzfu(zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbd()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbs2 = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbd()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
                zzfu(zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzn(List<Integer> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdza.zzgl(this.zzhpa.zzbbe());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbs = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    zzdza.zzgl(this.zzhpa.zzbbe());
                } while (this.zzhpa.zzbbs() < zzbbs);
                zzfu(zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbe()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbs2 = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbe()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
                zzfu(zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzo(List<Long> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdzv) {
            zzdzv zzdzv = (zzdzv) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbf());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbk = this.zzhpa.zzbbk();
                zzfs(zzbbk);
                int zzbbs = this.zzhpa.zzbbs() + zzbbk;
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbf());
                } while (this.zzhpa.zzbbs() < zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbf()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbk2 = this.zzhpa.zzbbk();
                zzfs(zzbbk2);
                int zzbbs2 = this.zzhpa.zzbbs() + zzbbk2;
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbf()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzp(List<Integer> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbbk = this.zzhpa.zzbbk();
                zzft(zzbbk);
                int zzbbs = this.zzhpa.zzbbs() + zzbbk;
                do {
                    zzdza.zzgl(this.zzhpa.zzbbg());
                } while (this.zzhpa.zzbbs() < zzbbs);
            } else if (i == 5) {
                do {
                    zzdza.zzgl(this.zzhpa.zzbbg());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzbbk2 = this.zzhpa.zzbbk();
                zzft(zzbbk2);
                int zzbbs2 = this.zzhpa.zzbbs() + zzbbk2;
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbg()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbg()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzq(List<Boolean> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdxl) {
            zzdxl zzdxl = (zzdxl) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdxl.addBoolean(this.zzhpa.zzbbh());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbs = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    zzdxl.addBoolean(this.zzhpa.zzbbh());
                } while (this.zzhpa.zzbbs() < zzbbs);
                zzfu(zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zzhpa.zzbbh()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbs2 = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    list.add(Boolean.valueOf(this.zzhpa.zzbbh()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
                zzfu(zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    public final void zzr(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzbbb;
        int zzbbb2;
        if ((this.tag & 7) != 2) {
            throw zzdzh.zzbdn();
        } else if (!(list instanceof zzdzs) || z) {
            do {
                list.add(z ? zzbbi() : readString());
                if (!this.zzhpa.zzbbr()) {
                    zzbbb = this.zzhpa.zzbbb();
                } else {
                    return;
                }
            } while (zzbbb == this.tag);
            this.zzhpc = zzbbb;
        } else {
            zzdzs zzdzs = (zzdzs) list;
            do {
                zzdzs.zzaj(zzbbj());
                if (!this.zzhpa.zzbbr()) {
                    zzbbb2 = this.zzhpa.zzbbb();
                } else {
                    return;
                }
            } while (zzbbb2 == this.tag);
            this.zzhpc = zzbbb2;
        }
    }

    public final <T> void zza(List<T> list, zzebd<T> zzebd, zzdym zzdym) throws IOException {
        int zzbbb;
        int i = this.tag;
        if ((i & 7) == 2) {
            do {
                list.add(zzc(zzebd, zzdym));
                if (!this.zzhpa.zzbbr() && this.zzhpc == 0) {
                    zzbbb = this.zzhpa.zzbbb();
                } else {
                    return;
                }
            } while (zzbbb == i);
            this.zzhpc = zzbbb;
            return;
        }
        throw zzdzh.zzbdn();
    }

    public final <T> void zzb(List<T> list, zzebd<T> zzebd, zzdym zzdym) throws IOException {
        int zzbbb;
        int i = this.tag;
        if ((i & 7) == 3) {
            do {
                list.add(zzd(zzebd, zzdym));
                if (!this.zzhpa.zzbbr() && this.zzhpc == 0) {
                    zzbbb = this.zzhpa.zzbbb();
                } else {
                    return;
                }
            } while (zzbbb == i);
            this.zzhpc = zzbbb;
            return;
        }
        throw zzdzh.zzbdn();
    }

    public final void zzs(List<zzdxn> list) throws IOException {
        int zzbbb;
        if ((this.tag & 7) == 2) {
            do {
                list.add(zzbbj());
                if (!this.zzhpa.zzbbr()) {
                    zzbbb = this.zzhpa.zzbbb();
                } else {
                    return;
                }
            } while (zzbbb == this.tag);
            this.zzhpc = zzbbb;
            return;
        }
        throw zzdzh.zzbdn();
    }

    public final void zzt(List<Integer> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdza.zzgl(this.zzhpa.zzbbk());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbs = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    zzdza.zzgl(this.zzhpa.zzbbk());
                } while (this.zzhpa.zzbbs() < zzbbs);
                zzfu(zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbk()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbs2 = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbk()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
                zzfu(zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzu(List<Integer> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdza.zzgl(this.zzhpa.zzbbl());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbs = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    zzdza.zzgl(this.zzhpa.zzbbl());
                } while (this.zzhpa.zzbbs() < zzbbs);
                zzfu(zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbl()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbs2 = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbl()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
                zzfu(zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzv(List<Integer> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbbk = this.zzhpa.zzbbk();
                zzft(zzbbk);
                int zzbbs = this.zzhpa.zzbbs() + zzbbk;
                do {
                    zzdza.zzgl(this.zzhpa.zzbbm());
                } while (this.zzhpa.zzbbs() < zzbbs);
            } else if (i == 5) {
                do {
                    zzdza.zzgl(this.zzhpa.zzbbm());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzbbk2 = this.zzhpa.zzbbk();
                zzft(zzbbk2);
                int zzbbs2 = this.zzhpa.zzbbs() + zzbbk2;
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbm()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbm()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzw(List<Long> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdzv) {
            zzdzv zzdzv = (zzdzv) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbn());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbk = this.zzhpa.zzbbk();
                zzfs(zzbbk);
                int zzbbs = this.zzhpa.zzbbs() + zzbbk;
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbn());
                } while (this.zzhpa.zzbbs() < zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbn()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbk2 = this.zzhpa.zzbbk();
                zzfs(zzbbk2);
                int zzbbs2 = this.zzhpa.zzbbs() + zzbbk2;
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbn()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzx(List<Integer> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdza) {
            zzdza zzdza = (zzdza) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdza.zzgl(this.zzhpa.zzbbo());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbs = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    zzdza.zzgl(this.zzhpa.zzbbo());
                } while (this.zzhpa.zzbbs() < zzbbs);
                zzfu(zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbo()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbs2 = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    list.add(Integer.valueOf(this.zzhpa.zzbbo()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
                zzfu(zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    public final void zzy(List<Long> list) throws IOException {
        int zzbbb;
        int zzbbb2;
        if (list instanceof zzdzv) {
            zzdzv zzdzv = (zzdzv) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbp());
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb2 = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb2 == this.tag);
                this.zzhpc = zzbbb2;
            } else if (i == 2) {
                int zzbbs = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    zzdzv.zzfs(this.zzhpa.zzbbp());
                } while (this.zzhpa.zzbbs() < zzbbs);
                zzfu(zzbbs);
            } else {
                throw zzdzh.zzbdn();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbp()));
                    if (!this.zzhpa.zzbbr()) {
                        zzbbb = this.zzhpa.zzbbb();
                    } else {
                        return;
                    }
                } while (zzbbb == this.tag);
                this.zzhpc = zzbbb;
            } else if (i2 == 2) {
                int zzbbs2 = this.zzhpa.zzbbs() + this.zzhpa.zzbbk();
                do {
                    list.add(Long.valueOf(this.zzhpa.zzbbp()));
                } while (this.zzhpa.zzbbs() < zzbbs2);
                zzfu(zzbbs2);
            } else {
                throw zzdzh.zzbdn();
            }
        }
    }

    private static void zzfs(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzdzh.zzbdp();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (zzbca() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new com.google.android.gms.internal.ads.zzdzh("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.ads.zzeac<K, V> r9, com.google.android.gms.internal.ads.zzdym r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzfr(r0)
            com.google.android.gms.internal.ads.zzdxz r1 = r7.zzhpa
            int r1 = r1.zzbbk()
            com.google.android.gms.internal.ads.zzdxz r2 = r7.zzhpa
            int r1 = r2.zzfj(r1)
            K r2 = r9.zzhva
            V r3 = r9.zzcgl
        L_0x0014:
            int r4 = r7.zzbbz()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            com.google.android.gms.internal.ads.zzdxz r5 = r7.zzhpa     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.zzbbr()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.zzbca()     // Catch:{ zzdzk -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.ads.zzdzh r4 = new com.google.android.gms.internal.ads.zzdzh     // Catch:{ zzdzk -> 0x004e }
            r4.<init>(r6)     // Catch:{ zzdzk -> 0x004e }
            throw r4     // Catch:{ zzdzk -> 0x004e }
        L_0x0039:
            com.google.android.gms.internal.ads.zzecm r4 = r9.zzhvb     // Catch:{ zzdzk -> 0x004e }
            V r5 = r9.zzcgl     // Catch:{ zzdzk -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzdzk -> 0x004e }
            java.lang.Object r3 = r7.zza((com.google.android.gms.internal.ads.zzecm) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.zzdym) r10)     // Catch:{ zzdzk -> 0x004e }
            goto L_0x0014
        L_0x0046:
            com.google.android.gms.internal.ads.zzecm r4 = r9.zzhuz     // Catch:{ zzdzk -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.zza((com.google.android.gms.internal.ads.zzecm) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.zzdym) r5)     // Catch:{ zzdzk -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.zzbca()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            com.google.android.gms.internal.ads.zzdzh r8 = new com.google.android.gms.internal.ads.zzdzh     // Catch:{ all -> 0x0064 }
            r8.<init>(r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.ads.zzdxz r8 = r7.zzhpa
            r8.zzfk(r1)
            return
        L_0x0064:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzdxz r9 = r7.zzhpa
            r9.zzfk(r1)
            goto L_0x006c
        L_0x006b:
            throw r8
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyg.zza(java.util.Map, com.google.android.gms.internal.ads.zzeac, com.google.android.gms.internal.ads.zzdym):void");
    }

    private final Object zza(zzecm zzecm, Class<?> cls, zzdym zzdym) throws IOException {
        switch (zzdyf.zzhoz[zzecm.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzbbh());
            case 2:
                return zzbbj();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzbbl());
            case 5:
                return Integer.valueOf(zzbbg());
            case 6:
                return Long.valueOf(zzbbf());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzbbe());
            case 9:
                return Long.valueOf(zzbbd());
            case 10:
                zzfr(2);
                return zzc(zzeaw.zzbem().zzh(cls), zzdym);
            case 11:
                return Integer.valueOf(zzbbm());
            case 12:
                return Long.valueOf(zzbbn());
            case 13:
                return Integer.valueOf(zzbbo());
            case 14:
                return Long.valueOf(zzbbp());
            case 15:
                return zzbbi();
            case 16:
                return Integer.valueOf(zzbbk());
            case 17:
                return Long.valueOf(zzbbc());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzft(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzdzh.zzbdp();
        }
    }

    private final void zzfu(int i) throws IOException {
        if (this.zzhpa.zzbbs() != i) {
            throw zzdzh.zzbdi();
        }
    }
}
