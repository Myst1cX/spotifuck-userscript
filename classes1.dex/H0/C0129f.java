package h0;

import K0.e;
import Q0.E;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: h0.f  reason: case insensitive filesystem */
public abstract class C0129f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f3063a = new e(20);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3064b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f3065c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f3066d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f3067f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f3068g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f3069h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f3070j = {48, 48, 50, 0};

    public static byte[] b(C0126c[] cVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (C0126c cVar : cVarArr) {
            i3 += ((((cVar.f3061g * 2) + 7) & -8) / 8) + (cVar.e * 2) + d(cVar.f3056a, cVar.f3057b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f3060f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f3067f)) {
            int length = cVarArr.length;
            while (i2 < length) {
                C0126c cVar2 = cVarArr[i2];
                q(byteArrayOutputStream, cVar2, d(cVar2.f3056a, cVar2.f3057b, bArr));
                p(byteArrayOutputStream, cVar2);
                i2++;
            }
        } else {
            for (C0126c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f3056a, cVar3.f3057b, bArr));
            }
            int length2 = cVarArr.length;
            while (i2 < length2) {
                p(byteArrayOutputStream, cVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        u(byteArrayOutputStream, (long) i2, 2);
    }

    public static byte[] a(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static String d(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = f3069h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3068g;
        String str4 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            str3 = str4;
        } else {
            str3 = ":";
        }
        if (str.length() <= 0) {
            if (str4.equals(str3)) {
                return str2.replace(":", str4);
            }
            if (":".equals(str3)) {
                return str2.replace(str4, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str4) || str2.contains(":")) {
                if (str4.equals(str3)) {
                    return str2.replace(":", str4);
                }
                if (":".equals(str3)) {
                    return str2.replace(str4, ":");
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str4 = ":";
                }
                sb.append(str4);
                sb.append(str2);
                return sb.toString();
            }
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                throw new IllegalStateException(E.e("Not enough bytes to read: ", i2));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) m(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
            }
            if (i4 != i2) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e2) {
            throw new IllegalStateException(e2.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static C0126c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0126c[] cVarArr) {
        byte[] bArr3 = i;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(f3066d, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int m2 = (int) m(fileInputStream, 1);
                byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
                    try {
                        C0126c[] j2 = j(byteArrayInputStream, m2, cVarArr);
                        byteArrayInputStream.close();
                        return j2;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, f3070j)) {
            int m3 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h3);
                try {
                    C0126c[] k2 = k(byteArrayInputStream2, bArr2, m3, cVarArr);
                    byteArrayInputStream2.close();
                    return k2;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static C0126c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, e)) {
            int m2 = (int) m(fileInputStream, 1);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
                try {
                    C0126c[] n2 = n(byteArrayInputStream, str, m2);
                    byteArrayInputStream.close();
                    return n2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static C0126c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        int i3;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i4 = i2;
        if (byteArrayInputStream.available() == 0) {
            return new C0126c[0];
        }
        C0126c[] cVarArr = new C0126c[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int m2 = (int) m(byteArrayInputStream2, 2);
            String str2 = str;
            cVarArr[i5] = new C0126c(str2, new String(f(byteArrayInputStream2, (int) m(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream2, 4), m2, (int) m(byteArrayInputStream2, 4), (int) m(byteArrayInputStream2, 4), new int[m2], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i4) {
            C0126c cVar = cVarArr[i6];
            int available = byteArrayInputStream.available() - cVar.f3060f;
            int i7 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.i;
                if (available2 <= available) {
                    break;
                }
                i7 += (int) m(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i7), 1);
                for (int m3 = (int) m(byteArrayInputStream2, 2); m3 > 0; m3--) {
                    m(byteArrayInputStream2, 2);
                    int m4 = (int) m(byteArrayInputStream2, 1);
                    if (!(m4 == 6 || m4 == 7)) {
                        while (m4 > 0) {
                            m(byteArrayInputStream2, 1);
                            for (int m5 = (int) m(byteArrayInputStream2, 1); m5 > 0; m5--) {
                                m(byteArrayInputStream2, 2);
                            }
                            m4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                cVar.f3062h = g(byteArrayInputStream2, cVar.e);
                int i8 = cVar.f3061g;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream2, (((i8 * 2) + 7) & -8) / 8));
                for (int i9 = 0; i9 < i8; i9++) {
                    if (valueOf.get(i9)) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    if (valueOf.get(i9 + i8)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i9), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i6++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0126c[] cVarArr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j2;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        C0126c[] cVarArr2 = cVarArr;
        byte[] bArr3 = f3066d;
        int i2 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                v(byteArrayOutputStream5, cVarArr2.length);
                int i3 = 2;
                int i4 = 2;
                for (C0126c cVar : cVarArr2) {
                    u(byteArrayOutputStream5, cVar.f3058c, 4);
                    u(byteArrayOutputStream5, cVar.f3059d, 4);
                    u(byteArrayOutputStream5, (long) cVar.f3061g, 4);
                    String d2 = d(cVar.f3056a, cVar.f3057b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d2.getBytes(charset).length;
                    v(byteArrayOutputStream5, length2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream5.write(d2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i4 == byteArray.length) {
                    k kVar = new k(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(kVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < cVarArr2.length) {
                        try {
                            C0126c cVar2 = cVarArr2[i5];
                            v(byteArrayOutputStream6, i5);
                            v(byteArrayOutputStream6, cVar2.e);
                            i6 = i6 + 4 + (cVar2.e * 2);
                            int[] iArr = cVar2.f3062h;
                            int length3 = iArr.length;
                            int i7 = 0;
                            while (i2 < length3) {
                                int i8 = iArr[i2];
                                v(byteArrayOutputStream6, i8 - i7);
                                i2++;
                                i7 = i8;
                            }
                            i5++;
                            i2 = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i6 == byteArray2.length) {
                        k kVar2 = new k(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(kVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < cVarArr2.length) {
                            try {
                                C0126c cVar3 = cVarArr2[i9];
                                int i11 = 0;
                                for (Map.Entry value : cVar3.i.entrySet()) {
                                    i11 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream2, i11, cVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                s(byteArrayOutputStream3, cVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                v(byteArrayOutputStream7, i9);
                                int length4 = byteArray3.length + i3 + byteArray4.length;
                                int i12 = i10 + 6;
                                ArrayList arrayList4 = arrayList3;
                                u(byteArrayOutputStream7, (long) length4, 4);
                                v(byteArrayOutputStream7, i11);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i10 = i12 + length4;
                                i9++;
                                arrayList3 = arrayList4;
                                i3 = 2;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i10 == byteArray5.length) {
                            k kVar3 = new k(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(kVar3);
                            long j3 = (long) 4;
                            long size = j3 + j3 + 4 + ((long) (arrayList2.size() * 16));
                            u(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i13 = 0;
                            while (i13 < arrayList2.size()) {
                                k kVar4 = (k) arrayList2.get(i13);
                                int i14 = kVar4.f3080a;
                                if (i14 == 1) {
                                    j2 = 0;
                                } else if (i14 == 2) {
                                    j2 = 1;
                                } else if (i14 == 3) {
                                    j2 = 2;
                                } else if (i14 == 4) {
                                    j2 = 3;
                                } else if (i14 == 5) {
                                    j2 = 4;
                                } else {
                                    throw null;
                                }
                                u(byteArrayOutputStream4, j2, 4);
                                u(byteArrayOutputStream4, size, 4);
                                byte[] bArr4 = kVar4.f3081b;
                                if (kVar4.f3082c) {
                                    long length5 = (long) bArr4.length;
                                    byte[] a2 = a(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    u(byteArrayOutputStream4, (long) a2.length, 4);
                                    u(byteArrayOutputStream4, length5, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    u(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    u(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i13++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i15));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = e;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] b2 = b(cVarArr2, bArr5);
                u(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                u(byteArrayOutputStream4, (long) b2.length, 4);
                byte[] a3 = a(b2);
                u(byteArrayOutputStream4, (long) a3.length, 4);
                byteArrayOutputStream4.write(a3);
                return true;
            }
            byte[] bArr6 = f3068g;
            if (Arrays.equals(bArr2, bArr6)) {
                u(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                for (C0126c cVar4 : cVarArr2) {
                    String d3 = d(cVar4.f3056a, cVar4.f3057b, bArr6);
                    Charset charset2 = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream4, d3.getBytes(charset2).length);
                    v(byteArrayOutputStream4, cVar4.f3062h.length);
                    u(byteArrayOutputStream4, (long) (cVar4.i.size() * 4), 4);
                    u(byteArrayOutputStream4, cVar4.f3058c, 4);
                    byteArrayOutputStream4.write(d3.getBytes(charset2));
                    for (Integer intValue : cVar4.i.keySet()) {
                        v(byteArrayOutputStream4, intValue.intValue());
                        v(byteArrayOutputStream4, 0);
                    }
                    for (int v2 : cVar4.f3062h) {
                        v(byteArrayOutputStream4, v2);
                    }
                }
                return true;
            }
            byte[] bArr7 = f3067f;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] b3 = b(cVarArr2, bArr7);
                u(byteArrayOutputStream4, (long) cVarArr2.length, 1);
                u(byteArrayOutputStream4, (long) b3.length, 4);
                byte[] a4 = a(b3);
                u(byteArrayOutputStream4, (long) a4.length, 4);
                byteArrayOutputStream4.write(a4);
                return true;
            }
            byte[] bArr8 = f3069h;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            v(byteArrayOutputStream4, cVarArr2.length);
            for (C0126c cVar5 : cVarArr2) {
                String d4 = d(cVar5.f3056a, cVar5.f3057b, bArr8);
                Charset charset3 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream4, d4.getBytes(charset3).length);
                TreeMap treeMap = cVar5.i;
                v(byteArrayOutputStream4, treeMap.size());
                v(byteArrayOutputStream4, cVar5.f3062h.length);
                u(byteArrayOutputStream4, cVar5.f3058c, 4);
                byteArrayOutputStream4.write(d4.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    v(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int v3 : cVar5.f3062h) {
                    v(byteArrayOutputStream4, v3);
                }
            }
            return true;
        }
        throw th2;
        throw th4;
        throw th;
        throw th5;
        throw th3;
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C0126c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.e);
        u(byteArrayOutputStream, (long) cVar.f3060f, 4);
        u(byteArrayOutputStream, cVar.f3058c, 4);
        u(byteArrayOutputStream, (long) cVar.f3061g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i2, C0126c cVar) {
        int bitCount = Integer.bitCount(i2 & -2);
        int i3 = cVar.f3061g;
        byte[] bArr = new byte[((((bitCount * i3) + 7) & -8) / 8)];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (!(i5 == 1 || (i5 & i2) == 0)) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, C0126c cVar) {
        int i2 = 0;
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i2);
                v(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:213:0x025e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0261, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0264, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x027d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        r7.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x028c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0299, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:199:0x0240, B:228:0x0279] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:201:0x0243, B:238:0x0288] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:203:0x0246, B:247:0x0295] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x015f A[SYNTHETIC, Splitter:B:109:0x015f] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0194 A[Catch:{ all -> 0x0181, all -> 0x018e, FileNotFoundException -> 0x017f, IOException -> 0x017c, IllegalStateException -> 0x017a }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0279 A[SYNTHETIC, Splitter:B:228:0x0279] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0288 A[SYNTHETIC, Splitter:B:238:0x0288] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6 A[SYNTHETIC, Splitter:B:58:0x00e6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void t(android.content.Context r16, java.util.concurrent.Executor r17, h0.C0128e r18, boolean r19) {
        /*
            r1 = r16
            r8 = r18
            android.content.Context r0 = r16.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r16.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x02df }
            java.io.File r13 = r16.getFilesDir()
            r14 = 0
            r15 = 1
            if (r19 != 0) goto L_0x007a
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x003f
        L_0x003d:
            r0 = 0
            goto L_0x006e
        L_0x003f:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0060 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0060 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0060 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0060 }
            long r4 = r3.readLong()     // Catch:{ all -> 0x0062 }
            r3.close()     // Catch:{ IOException -> 0x0060 }
            long r10 = r12.lastUpdateTime
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x006e
            r3 = 2
            r8.k(r3, r14)
            goto L_0x006e
        L_0x0060:
            goto L_0x003d
        L_0x0062:
            r0 = move-exception
            r4 = r0
            r3.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006d
        L_0x0068:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ IOException -> 0x0060 }
        L_0x006d:
            throw r4     // Catch:{ IOException -> 0x0060 }
        L_0x006e:
            if (r0 != 0) goto L_0x0071
            goto L_0x007a
        L_0x0071:
            r16.getPackageName()
            r2 = 0
            h0.j.c(r1, r2)
            goto L_0x02de
        L_0x007a:
            r16.getPackageName()
            java.io.File r0 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r0.<init>(r3, r2)
            h0.b r10 = new h0.b
            java.lang.String r11 = "dexopt/baseline.prof"
            r2 = r10
            r3 = r9
            r4 = r17
            r5 = r18
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r2 = r10.f3051c
            if (r2 != 0) goto L_0x00aa
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r10.b(r2, r0)
        L_0x00a7:
            r6 = 1
            goto L_0x02d3
        L_0x00aa:
            boolean r3 = r0.exists()
            r4 = 4
            if (r3 == 0) goto L_0x00bb
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L_0x00c8
            r10.b(r4, r14)
            goto L_0x00a7
        L_0x00bb:
            boolean r0 = r0.createNewFile()     // Catch:{ IOException -> 0x00c5 }
            if (r0 != 0) goto L_0x00c8
            r10.b(r4, r14)     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00a7
        L_0x00c5:
            r6 = 1
            goto L_0x02d0
        L_0x00c8:
            r10.f3053f = r15
            byte[] r3 = f3064b
            r5 = 6
            java.io.FileInputStream r0 = r10.a(r9, r11)     // Catch:{ FileNotFoundException -> 0x00da, IOException -> 0x00d3 }
            r6 = r0
            goto L_0x00e0
        L_0x00d3:
            r0 = move-exception
            r6 = r0
            r7 = 7
            r8.k(r7, r6)
            goto L_0x00df
        L_0x00da:
            r0 = move-exception
            r6 = r0
            r8.k(r5, r6)
        L_0x00df:
            r6 = r14
        L_0x00e0:
            java.lang.String r7 = "Invalid magic"
            r11 = 8
            if (r6 == 0) goto L_0x013f
            byte[] r0 = f(r6, r4)     // Catch:{ IOException -> 0x010d, IllegalStateException -> 0x010b }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ IOException -> 0x010d, IllegalStateException -> 0x010b }
            if (r0 == 0) goto L_0x010f
            byte[] r0 = f(r6, r4)     // Catch:{ IOException -> 0x010d, IllegalStateException -> 0x010b }
            java.lang.String r5 = r10.e     // Catch:{ IOException -> 0x010d, IllegalStateException -> 0x010b }
            h0.c[] r5 = l(r6, r0, r5)     // Catch:{ IOException -> 0x010d, IllegalStateException -> 0x010b }
            r6.close()     // Catch:{ IOException -> 0x00fe }
            goto L_0x0131
        L_0x00fe:
            r0 = move-exception
            r6 = r0
            r15 = 7
            r8.k(r15, r6)
            goto L_0x0131
        L_0x0105:
            r1 = r0
            goto L_0x0134
        L_0x0107:
            r15 = 7
            goto L_0x0126
        L_0x0109:
            r0 = move-exception
            goto L_0x0105
        L_0x010b:
            r0 = move-exception
            goto L_0x0115
        L_0x010d:
            r0 = move-exception
            goto L_0x0107
        L_0x010f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x010d, IllegalStateException -> 0x010b }
            r0.<init>(r7)     // Catch:{ IOException -> 0x010d, IllegalStateException -> 0x010b }
            throw r0     // Catch:{ IOException -> 0x010d, IllegalStateException -> 0x010b }
        L_0x0115:
            r8.k(r11, r0)     // Catch:{ all -> 0x0123 }
            r6.close()     // Catch:{ IOException -> 0x011c }
            goto L_0x0130
        L_0x011c:
            r0 = move-exception
            r5 = r0
            r15 = 7
        L_0x011f:
            r8.k(r15, r5)
            goto L_0x0130
        L_0x0123:
            r0 = move-exception
            r15 = 7
            goto L_0x0105
        L_0x0126:
            r8.k(r15, r0)     // Catch:{ all -> 0x0109 }
            r6.close()     // Catch:{ IOException -> 0x012d }
            goto L_0x0130
        L_0x012d:
            r0 = move-exception
            r5 = r0
            goto L_0x011f
        L_0x0130:
            r5 = r14
        L_0x0131:
            r10.f3054g = r5
            goto L_0x013f
        L_0x0134:
            r6.close()     // Catch:{ IOException -> 0x0138 }
            goto L_0x013e
        L_0x0138:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.k(r3, r2)
        L_0x013e:
            throw r1
        L_0x013f:
            h0.c[] r0 = r10.f3054g
            if (r0 == 0) goto L_0x01ad
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 >= r6) goto L_0x014b
            goto L_0x01ad
        L_0x014b:
            r15 = 31
            if (r5 < r15) goto L_0x0150
            goto L_0x0157
        L_0x0150:
            if (r5 == r6) goto L_0x0157
            r6 = 25
            if (r5 == r6) goto L_0x0157
            goto L_0x01ad
        L_0x0157:
            java.lang.String r5 = "dexopt/baseline.profm"
            java.io.FileInputStream r5 = r10.a(r9, r5)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x017c, IllegalStateException -> 0x017a }
            if (r5 == 0) goto L_0x0194
            byte[] r6 = f3065c     // Catch:{ all -> 0x0181 }
            byte[] r9 = f(r5, r4)     // Catch:{ all -> 0x0181 }
            boolean r6 = java.util.Arrays.equals(r6, r9)     // Catch:{ all -> 0x0181 }
            if (r6 == 0) goto L_0x0184
            byte[] r4 = f(r5, r4)     // Catch:{ all -> 0x0181 }
            h0.c[] r0 = i(r5, r4, r2, r0)     // Catch:{ all -> 0x0181 }
            r10.f3054g = r0     // Catch:{ all -> 0x0181 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x017c, IllegalStateException -> 0x017a }
            r0 = r10
            goto L_0x01aa
        L_0x017a:
            r0 = move-exception
            goto L_0x019a
        L_0x017c:
            r0 = move-exception
            r2 = 7
            goto L_0x01a0
        L_0x017f:
            r0 = move-exception
            goto L_0x01a4
        L_0x0181:
            r0 = move-exception
            r2 = r0
            goto L_0x018a
        L_0x0184:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0181 }
            r0.<init>(r7)     // Catch:{ all -> 0x0181 }
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x018a:
            r5.close()     // Catch:{ all -> 0x018e }
            goto L_0x0193
        L_0x018e:
            r0 = move-exception
            r4 = r0
            r2.addSuppressed(r4)     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x017c, IllegalStateException -> 0x017a }
        L_0x0193:
            throw r2     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x017c, IllegalStateException -> 0x017a }
        L_0x0194:
            if (r5 == 0) goto L_0x01a9
            r5.close()     // Catch:{ FileNotFoundException -> 0x017f, IOException -> 0x017c, IllegalStateException -> 0x017a }
            goto L_0x01a9
        L_0x019a:
            r10.f3054g = r14
            r8.k(r11, r0)
            goto L_0x01a9
        L_0x01a0:
            r8.k(r2, r0)
            goto L_0x01a9
        L_0x01a4:
            r2 = 9
            r8.k(r2, r0)
        L_0x01a9:
            r0 = r14
        L_0x01aa:
            if (r0 == 0) goto L_0x01ad
            r10 = r0
        L_0x01ad:
            h0.e r2 = r10.f3050b
            h0.c[] r0 = r10.f3054g
            java.lang.String r4 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0205
            byte[] r5 = r10.f3051c
            if (r5 != 0) goto L_0x01ba
            goto L_0x0205
        L_0x01ba:
            boolean r6 = r10.f3053f
            if (r6 == 0) goto L_0x01ff
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
            r6.<init>()     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
            r6.write(r3)     // Catch:{ all -> 0x01de }
            r6.write(r5)     // Catch:{ all -> 0x01de }
            boolean r0 = o(r6, r5, r0)     // Catch:{ all -> 0x01de }
            if (r0 != 0) goto L_0x01e1
            r0 = 5
            r2.k(r0, r14)     // Catch:{ all -> 0x01de }
            r10.f3054g = r14     // Catch:{ all -> 0x01de }
            r6.close()     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
            goto L_0x0205
        L_0x01d9:
            r0 = move-exception
            goto L_0x01f5
        L_0x01db:
            r0 = move-exception
            r3 = 7
            goto L_0x01f9
        L_0x01de:
            r0 = move-exception
            r3 = r0
            goto L_0x01eb
        L_0x01e1:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x01de }
            r10.f3055h = r0     // Catch:{ all -> 0x01de }
            r6.close()     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
            goto L_0x01fc
        L_0x01eb:
            r6.close()     // Catch:{ all -> 0x01ef }
            goto L_0x01f4
        L_0x01ef:
            r0 = move-exception
            r5 = r0
            r3.addSuppressed(r5)     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
        L_0x01f4:
            throw r3     // Catch:{ IOException -> 0x01db, IllegalStateException -> 0x01d9 }
        L_0x01f5:
            r2.k(r11, r0)
            goto L_0x01fc
        L_0x01f9:
            r2.k(r3, r0)
        L_0x01fc:
            r10.f3054g = r14
            goto L_0x0205
        L_0x01ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0205:
            byte[] r0 = r10.f3055h
            if (r0 != 0) goto L_0x020d
            r2 = 0
            r6 = 1
            goto L_0x02bf
        L_0x020d:
            boolean r2 = r10.f3053f
            if (r2 == 0) goto L_0x02ca
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x02af, IOException -> 0x02ac }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x02af, IOException -> 0x02ac }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x029f }
            java.io.File r0 = r10.f3052d     // Catch:{ all -> 0x029f }
            r3.<init>(r0)     // Catch:{ all -> 0x029f }
            java.nio.channels.FileChannel r4 = r3.getChannel()     // Catch:{ all -> 0x0292 }
            java.nio.channels.FileLock r5 = r4.tryLock()     // Catch:{ all -> 0x0283 }
            if (r5 == 0) goto L_0x026a
            boolean r0 = r5.isValid()     // Catch:{ all -> 0x026c }
            if (r0 == 0) goto L_0x026a
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x026c }
        L_0x0231:
            int r6 = r2.read(r0)     // Catch:{ all -> 0x026c }
            if (r6 <= 0) goto L_0x023c
            r7 = 0
            r3.write(r0, r7, r6)     // Catch:{ all -> 0x026c }
            goto L_0x0231
        L_0x023c:
            r6 = 1
            r10.b(r6, r14)     // Catch:{ all -> 0x0267 }
            r5.close()     // Catch:{ all -> 0x0264 }
            r4.close()     // Catch:{ all -> 0x0261 }
            r3.close()     // Catch:{ all -> 0x025e }
            r2.close()     // Catch:{ FileNotFoundException -> 0x025a, IOException -> 0x0256 }
            r10.f3055h = r14
            r10.f3054g = r14
            r2 = 1
            goto L_0x02bf
        L_0x0253:
            r0 = move-exception
            goto L_0x02c5
        L_0x0256:
            r0 = move-exception
        L_0x0257:
            r2 = 7
            goto L_0x02b2
        L_0x025a:
            r0 = move-exception
        L_0x025b:
            r2 = 6
            goto L_0x02ba
        L_0x025e:
            r0 = move-exception
        L_0x025f:
            r3 = r0
            goto L_0x02a2
        L_0x0261:
            r0 = move-exception
        L_0x0262:
            r4 = r0
            goto L_0x0295
        L_0x0264:
            r0 = move-exception
        L_0x0265:
            r5 = r0
            goto L_0x0286
        L_0x0267:
            r0 = move-exception
        L_0x0268:
            r7 = r0
            goto L_0x0277
        L_0x026a:
            r6 = 1
            goto L_0x026f
        L_0x026c:
            r0 = move-exception
            r6 = 1
            goto L_0x0268
        L_0x026f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0267 }
            java.lang.String r7 = "Unable to acquire a lock on the underlying file channel."
            r0.<init>(r7)     // Catch:{ all -> 0x0267 }
            throw r0     // Catch:{ all -> 0x0267 }
        L_0x0277:
            if (r5 == 0) goto L_0x0282
            r5.close()     // Catch:{ all -> 0x027d }
            goto L_0x0282
        L_0x027d:
            r0 = move-exception
            r5 = r0
            r7.addSuppressed(r5)     // Catch:{ all -> 0x0264 }
        L_0x0282:
            throw r7     // Catch:{ all -> 0x0264 }
        L_0x0283:
            r0 = move-exception
            r6 = 1
            goto L_0x0265
        L_0x0286:
            if (r4 == 0) goto L_0x0291
            r4.close()     // Catch:{ all -> 0x028c }
            goto L_0x0291
        L_0x028c:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ all -> 0x0261 }
        L_0x0291:
            throw r5     // Catch:{ all -> 0x0261 }
        L_0x0292:
            r0 = move-exception
            r6 = 1
            goto L_0x0262
        L_0x0295:
            r3.close()     // Catch:{ all -> 0x0299 }
            goto L_0x029e
        L_0x0299:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ all -> 0x025e }
        L_0x029e:
            throw r4     // Catch:{ all -> 0x025e }
        L_0x029f:
            r0 = move-exception
            r6 = 1
            goto L_0x025f
        L_0x02a2:
            r2.close()     // Catch:{ all -> 0x02a6 }
            goto L_0x02ab
        L_0x02a6:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x025a, IOException -> 0x0256 }
        L_0x02ab:
            throw r3     // Catch:{ FileNotFoundException -> 0x025a, IOException -> 0x0256 }
        L_0x02ac:
            r0 = move-exception
            r6 = 1
            goto L_0x0257
        L_0x02af:
            r0 = move-exception
            r6 = 1
            goto L_0x025b
        L_0x02b2:
            r10.b(r2, r0)     // Catch:{ all -> 0x0253 }
        L_0x02b5:
            r10.f3055h = r14
            r10.f3054g = r14
            goto L_0x02be
        L_0x02ba:
            r10.b(r2, r0)     // Catch:{ all -> 0x0253 }
            goto L_0x02b5
        L_0x02be:
            r2 = 0
        L_0x02bf:
            if (r2 == 0) goto L_0x02d4
            e(r12, r13)
            goto L_0x02d4
        L_0x02c5:
            r10.f3055h = r14
            r10.f3054g = r14
            throw r0
        L_0x02ca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x02d0:
            r10.b(r4, r14)
        L_0x02d3:
            r2 = 0
        L_0x02d4:
            if (r2 == 0) goto L_0x02da
            if (r19 == 0) goto L_0x02da
            r11 = 1
            goto L_0x02db
        L_0x02da:
            r11 = 0
        L_0x02db:
            h0.j.c(r1, r11)
        L_0x02de:
            return
        L_0x02df:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.k(r3, r2)
            r2 = 0
            h0.j.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0129f.t(android.content.Context, java.util.concurrent.Executor, h0.e, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((int) ((j2 >> (i3 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File c2 : listFiles) {
                if (!c(c2) || !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static C0126c[] j(ByteArrayInputStream byteArrayInputStream, int i2, C0126c[] cVarArr) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0126c[0];
        }
        if (i2 == cVarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                int m2 = (int) m(byteArrayInputStream, 2);
                iArr[i4] = (int) m(byteArrayInputStream, 2);
                strArr[i4] = new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8);
            }
            while (i3 < i2) {
                C0126c cVar = cVarArr[i3];
                if (cVar.f3057b.equals(strArr[i3])) {
                    int i5 = iArr[i3];
                    cVar.e = i5;
                    cVar.f3062h = g(byteArrayInputStream, i5);
                    i3++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C0126c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0126c[] cVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new C0126c[0];
        }
        if (i2 == cVarArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m2 = m(byteArrayInputStream, 4);
                int m3 = (int) m(byteArrayInputStream, 2);
                C0126c cVar = null;
                if (cVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= cVarArr.length) {
                            break;
                        } else if (cVarArr[i4].f3057b.equals(str)) {
                            cVar = cVarArr[i4];
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                if (cVar != null) {
                    cVar.f3059d = m2;
                    int[] g2 = g(byteArrayInputStream, m3);
                    if (Arrays.equals(bArr, f3069h)) {
                        cVar.e = m3;
                        cVar.f3062h = g2;
                    }
                    i3++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static long m(InputStream inputStream, int i2) {
        byte[] f2 = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (f2[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C0126c cVar) {
        s(byteArrayOutputStream, cVar);
        int[] iArr = cVar.f3062h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            v(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        int i5 = cVar.f3061g;
        byte[] bArr = new byte[((((i5 * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i5;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }
}
