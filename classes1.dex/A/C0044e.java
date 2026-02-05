package a;

import Q0.E;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: a.e  reason: case insensitive filesystem */
public final class C0044e {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f1028j = {8, 8, 8};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f1029k = {8};

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f1030l = {-1, -40, -1};

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f1031m = {79, 76, 89, 77, 80, 0};

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f1032n = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f1033o = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f1034p = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f1035q = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: r  reason: collision with root package name */
    public static final C0042c f1036r;

    /* renamed from: s  reason: collision with root package name */
    public static final C0042c[][] f1037s;

    /* renamed from: t  reason: collision with root package name */
    public static final C0042c[] f1038t;

    /* renamed from: u  reason: collision with root package name */
    public static final HashMap[] f1039u = new HashMap[10];

    /* renamed from: v  reason: collision with root package name */
    public static final HashMap[] f1040v = new HashMap[10];

    /* renamed from: w  reason: collision with root package name */
    public static final HashSet f1041w = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: x  reason: collision with root package name */
    public static final HashMap f1042x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    public static final Charset f1043y;

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f1044z;

    /* renamed from: a  reason: collision with root package name */
    public final String f1045a;

    /* renamed from: b  reason: collision with root package name */
    public int f1046b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap[] f1047c = new HashMap[f1037s.length];

    /* renamed from: d  reason: collision with root package name */
    public ByteOrder f1048d = ByteOrder.BIG_ENDIAN;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1049f;

    /* renamed from: g  reason: collision with root package name */
    public int f1050g;

    /* renamed from: h  reason: collision with root package name */
    public int f1051h;
    public int i;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        C0042c cVar = new C0042c("NewSubfileType", 254, 4);
        C0042c cVar2 = new C0042c("SubfileType", 255, 4);
        C0042c cVar3 = new C0042c("ImageWidth", 256);
        C0042c cVar4 = new C0042c("ImageLength", 257);
        C0042c cVar5 = new C0042c("BitsPerSample", 258, 3);
        C0042c cVar6 = new C0042c("Compression", 259, 3);
        C0042c cVar7 = new C0042c("PhotometricInterpretation", 262, 3);
        C0042c cVar8 = new C0042c("ImageDescription", 270, 2);
        C0042c cVar9 = new C0042c("Make", 271, 2);
        C0042c cVar10 = new C0042c("Model", 272, 2);
        C0042c cVar11 = new C0042c("StripOffsets", 273);
        String str = "StripOffsets";
        C0042c cVar12 = new C0042c("Orientation", 274, 3);
        C0042c cVar13 = new C0042c("SamplesPerPixel", 277, 3);
        C0042c cVar14 = cVar13;
        String str2 = "SubIFDPointer";
        String str3 = "ExifIFDPointer";
        String str4 = "GPSInfoIFDPointer";
        C0042c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar14, new C0042c("RowsPerStrip", 278), new C0042c("StripByteCounts", 279), new C0042c("XResolution", 282, 5), new C0042c("YResolution", 283, 5), new C0042c("PlanarConfiguration", 284, 3), new C0042c("ResolutionUnit", 296, 3), new C0042c("TransferFunction", 301, 3), new C0042c("Software", 305, 2), new C0042c("DateTime", 306, 2), new C0042c("Artist", 315, 2), new C0042c("WhitePoint", 318, 5), new C0042c("PrimaryChromaticities", 319, 5), new C0042c("SubIFDPointer", 330, 4), new C0042c("JPEGInterchangeFormat", 513, 4), new C0042c("JPEGInterchangeFormatLength", 514, 4), new C0042c("YCbCrCoefficients", 529, 5), new C0042c("YCbCrSubSampling", 530, 3), new C0042c("YCbCrPositioning", 531, 3), new C0042c("ReferenceBlackWhite", 532, 5), new C0042c("Copyright", 33432, 2), new C0042c("ExifIFDPointer", 34665, 4), new C0042c("GPSInfoIFDPointer", 34853, 4), new C0042c("SensorTopBorder", 4, 4), new C0042c("SensorLeftBorder", 5, 4), new C0042c("SensorBottomBorder", 6, 4), new C0042c("SensorRightBorder", 7, 4), new C0042c("ISO", 23, 3), new C0042c("JpgFromRaw", 46, 7)};
        C0042c[] cVarArr2 = cVarArr;
        C0042c[] cVarArr3 = {new C0042c("ExposureTime", 33434, 5), new C0042c("FNumber", 33437, 5), new C0042c("ExposureProgram", 34850, 3), new C0042c("SpectralSensitivity", 34852, 2), new C0042c("PhotographicSensitivity", 34855, 3), new C0042c("OECF", 34856, 7), new C0042c("ExifVersion", 36864, 2), new C0042c("DateTimeOriginal", 36867, 2), new C0042c("DateTimeDigitized", 36868, 2), new C0042c("ComponentsConfiguration", 37121, 7), new C0042c("CompressedBitsPerPixel", 37122, 5), new C0042c("ShutterSpeedValue", 37377, 10), new C0042c("ApertureValue", 37378, 5), new C0042c("BrightnessValue", 37379, 10), new C0042c("ExposureBiasValue", 37380, 10), new C0042c("MaxApertureValue", 37381, 5), new C0042c("SubjectDistance", 37382, 5), new C0042c("MeteringMode", 37383, 3), new C0042c("LightSource", 37384, 3), new C0042c("Flash", 37385, 3), new C0042c("FocalLength", 37386, 5), new C0042c("SubjectArea", 37396, 3), new C0042c("MakerNote", 37500, 7), new C0042c("UserComment", 37510, 7), new C0042c("SubSecTime", 37520, 2), new C0042c("SubSecTimeOriginal", 37521, 2), new C0042c("SubSecTimeDigitized", 37522, 2), new C0042c("FlashpixVersion", 40960, 7), new C0042c("ColorSpace", 40961, 3), new C0042c("PixelXDimension", 40962), new C0042c("PixelYDimension", 40963), new C0042c("RelatedSoundFile", 40964, 2), new C0042c("InteroperabilityIFDPointer", 40965, 4), new C0042c("FlashEnergy", 41483, 5), new C0042c("SpatialFrequencyResponse", 41484, 7), new C0042c("FocalPlaneXResolution", 41486, 5), new C0042c("FocalPlaneYResolution", 41487, 5), new C0042c("FocalPlaneResolutionUnit", 41488, 3), new C0042c("SubjectLocation", 41492, 3), new C0042c("ExposureIndex", 41493, 5), new C0042c("SensingMethod", 41495, 3), new C0042c("FileSource", 41728, 7), new C0042c("SceneType", 41729, 7), new C0042c("CFAPattern", 41730, 7), new C0042c("CustomRendered", 41985, 3), new C0042c("ExposureMode", 41986, 3), new C0042c("WhiteBalance", 41987, 3), new C0042c("DigitalZoomRatio", 41988, 5), new C0042c("FocalLengthIn35mmFilm", 41989, 3), new C0042c("SceneCaptureType", 41990, 3), new C0042c("GainControl", 41991, 3), new C0042c("Contrast", 41992, 3), new C0042c("Saturation", 41993, 3), new C0042c("Sharpness", 41994, 3), new C0042c("DeviceSettingDescription", 41995, 7), new C0042c("SubjectDistanceRange", 41996, 3), new C0042c("ImageUniqueID", 42016, 2), new C0042c("DNGVersion", 50706, 1), new C0042c("DefaultCropSize", 50720)};
        C0042c[] cVarArr4 = {new C0042c("GPSVersionID", 0, 1), new C0042c("GPSLatitudeRef", 1, 2), new C0042c("GPSLatitude", 2, 5), new C0042c("GPSLongitudeRef", 3, 2), new C0042c("GPSLongitude", 4, 5), new C0042c("GPSAltitudeRef", 5, 1), new C0042c("GPSAltitude", 6, 5), new C0042c("GPSTimeStamp", 7, 5), new C0042c("GPSSatellites", 8, 2), new C0042c("GPSStatus", 9, 2), new C0042c("GPSMeasureMode", 10, 2), new C0042c("GPSDOP", 11, 5), new C0042c("GPSSpeedRef", 12, 2), new C0042c("GPSSpeed", 13, 5), new C0042c("GPSTrackRef", 14, 2), new C0042c("GPSTrack", 15, 5), new C0042c("GPSImgDirectionRef", 16, 2), new C0042c("GPSImgDirection", 17, 5), new C0042c("GPSMapDatum", 18, 2), new C0042c("GPSDestLatitudeRef", 19, 2), new C0042c("GPSDestLatitude", 20, 5), new C0042c("GPSDestLongitudeRef", 21, 2), new C0042c("GPSDestLongitude", 22, 5), new C0042c("GPSDestBearingRef", 23, 2), new C0042c("GPSDestBearing", 24, 5), new C0042c("GPSDestDistanceRef", 25, 2), new C0042c("GPSDestDistance", 26, 5), new C0042c("GPSProcessingMethod", 27, 7), new C0042c("GPSAreaInformation", 28, 7), new C0042c("GPSDateStamp", 29, 2), new C0042c("GPSDifferential", 30, 3)};
        C0042c[] cVarArr5 = {new C0042c("InteroperabilityIndex", 1, 2)};
        C0042c[] cVarArr6 = cVarArr5;
        C0042c[] cVarArr7 = {new C0042c("NewSubfileType", 254, 4), new C0042c("SubfileType", 255, 4), new C0042c("ThumbnailImageWidth", 256), new C0042c("ThumbnailImageLength", 257), new C0042c("BitsPerSample", 258, 3), new C0042c("Compression", 259, 3), new C0042c("PhotometricInterpretation", 262, 3), new C0042c("ImageDescription", 270, 2), new C0042c("Make", 271, 2), new C0042c("Model", 272, 2), new C0042c(str, 273), new C0042c("Orientation", 274, 3), new C0042c("SamplesPerPixel", 277, 3), new C0042c("RowsPerStrip", 278), new C0042c("StripByteCounts", 279), new C0042c("XResolution", 282, 5), new C0042c("YResolution", 283, 5), new C0042c("PlanarConfiguration", 284, 3), new C0042c("ResolutionUnit", 296, 3), new C0042c("TransferFunction", 301, 3), new C0042c("Software", 305, 2), new C0042c("DateTime", 306, 2), new C0042c("Artist", 315, 2), new C0042c("WhitePoint", 318, 5), new C0042c("PrimaryChromaticities", 319, 5), new C0042c(str2, 330, 4), new C0042c("JPEGInterchangeFormat", 513, 4), new C0042c("JPEGInterchangeFormatLength", 514, 4), new C0042c("YCbCrCoefficients", 529, 5), new C0042c("YCbCrSubSampling", 530, 3), new C0042c("YCbCrPositioning", 531, 3), new C0042c("ReferenceBlackWhite", 532, 5), new C0042c("Copyright", 33432, 2), new C0042c(str3, 34665, 4), new C0042c(str4, 34853, 4), new C0042c("DNGVersion", 50706, 1), new C0042c("DefaultCropSize", 50720)};
        f1036r = new C0042c(str, 273, 3);
        f1037s = new C0042c[][]{cVarArr2, cVarArr3, cVarArr4, cVarArr6, cVarArr7, cVarArr2, new C0042c[]{new C0042c("ThumbnailImage", 256, 7), new C0042c("CameraSettingsIFDPointer", 8224, 4), new C0042c("ImageProcessingIFDPointer", 8256, 4)}, new C0042c[]{new C0042c("PreviewImageStart", 257, 4), new C0042c("PreviewImageLength", 258, 4)}, new C0042c[]{new C0042c("AspectFrame", 4371, 3)}, new C0042c[]{new C0042c("ColorSpace", 55, 3)}};
        f1038t = new C0042c[]{new C0042c(str2, 330, 4), new C0042c(str3, 34665, 4), new C0042c(str4, 34853, 4), new C0042c("InteroperabilityIFDPointer", 40965, 4), new C0042c("CameraSettingsIFDPointer", 8224, 1), new C0042c("ImageProcessingIFDPointer", 8256, 1)};
        Charset forName = Charset.forName("US-ASCII");
        f1043y = forName;
        f1044z = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            C0042c[][] cVarArr8 = f1037s;
            if (i2 < cVarArr8.length) {
                f1039u[i2] = new HashMap();
                f1040v[i2] = new HashMap();
                for (C0042c cVar15 : cVarArr8[i2]) {
                    f1039u[i2].put(Integer.valueOf(cVar15.f1022a), cVar15);
                    f1040v[i2].put(cVar15.f1023b, cVar15);
                }
                i2++;
            } else {
                HashMap hashMap = f1042x;
                C0042c[] cVarArr9 = f1038t;
                hashMap.put(Integer.valueOf(cVarArr9[0].f1022a), 5);
                hashMap.put(Integer.valueOf(cVarArr9[1].f1022a), 1);
                hashMap.put(Integer.valueOf(cVarArr9[2].f1022a), 2);
                hashMap.put(Integer.valueOf(cVarArr9[3].f1022a), 3);
                hashMap.put(Integer.valueOf(cVarArr9[4].f1022a), 7);
                hashMap.put(Integer.valueOf(cVarArr9[5].f1022a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public final String c(String str) {
        C0041b d2 = d(str);
        if (d2 != null) {
            if (!f1041w.contains(str)) {
                return d2.f(this.f1048d);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = d2.f1019a;
                if (i2 == 5 || i2 == 10) {
                    C0043d[] dVarArr = (C0043d[]) d2.g(this.f1048d);
                    if (dVarArr == null || dVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                        return null;
                    }
                    C0043d dVar = dVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) dVar.f1026a) / ((float) dVar.f1027b)));
                    C0043d dVar2 = dVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) dVar2.f1026a) / ((float) dVar2.f1027b)));
                    C0043d dVar3 = dVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) dVar3.f1026a) / ((float) dVar3.f1027b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
                return null;
            }
            try {
                return Double.toString(d2.d(this.f1048d));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void m(FileInputStream fileInputStream) {
        int i2 = 0;
        while (i2 < f1037s.length) {
            try {
                this.f1047c[i2] = new HashMap();
                i2++;
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 5000);
        this.f1046b = f(bufferedInputStream);
        C0040a aVar = new C0040a((InputStream) bufferedInputStream);
        switch (this.f1046b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                i(aVar);
                break;
            case 4:
                e(aVar, 0, 0);
                break;
            case 7:
                g(aVar);
                break;
            case 9:
                h(aVar);
                break;
            case 10:
                j(aVar);
                break;
        }
        q(aVar);
        a();
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public final void a() {
        String c2 = c("DateTimeOriginal");
        HashMap[] hashMapArr = this.f1047c;
        if (c2 != null && c("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = c2.concat("\u0000").getBytes(f1043y);
            hashMap.put("DateTime", new C0041b(bytes, 2, bytes.length));
        }
        if (c("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C0041b.a(0, this.f1048d));
        }
        if (c("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C0041b.a(0, this.f1048d));
        }
        if (c("Orientation") == null) {
            hashMapArr[0].put("Orientation", C0041b.a(0, this.f1048d));
        }
        if (c("LightSource") == null) {
            hashMapArr[1].put("LightSource", C0041b.a(0, this.f1048d));
        }
    }

    public final C0041b d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < f1037s.length; i2++) {
            C0041b bVar = (C0041b) this.f1047c[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0084 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0107 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(a.C0040a r12, int r13, int r14) {
        /*
            r11 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r12.f1016b = r0
            long r0 = (long) r13
            r12.f(r0)
            byte r0 = r12.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x015c
            byte r3 = r12.readByte()
            r4 = -40
            if (r3 != r4) goto L_0x0144
            r0 = 2
            int r13 = r13 + r0
        L_0x001b:
            byte r1 = r12.readByte()
            if (r1 != r2) goto L_0x012a
            byte r1 = r12.readByte()
            r3 = -39
            if (r1 == r3) goto L_0x0125
            r3 = -38
            if (r1 != r3) goto L_0x002f
            goto L_0x0125
        L_0x002f:
            int r3 = r12.readUnsignedShort()
            int r4 = r3 + -2
            int r5 = r13 + 4
            java.lang.String r6 = "Invalid length"
            if (r4 < 0) goto L_0x011f
            r7 = -31
            r8 = 0
            java.lang.String r9 = "Invalid exif"
            if (r1 == r7) goto L_0x00c0
            java.util.HashMap[] r13 = r11.f1047c
            r7 = -2
            r10 = 1
            if (r1 == r7) goto L_0x008c
            switch(r1) {
                case -64: goto L_0x0056;
                case -63: goto L_0x0056;
                case -62: goto L_0x0056;
                case -61: goto L_0x0056;
                default: goto L_0x004b;
            }
        L_0x004b:
            switch(r1) {
                case -59: goto L_0x0056;
                case -58: goto L_0x0056;
                case -57: goto L_0x0056;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r1) {
                case -55: goto L_0x0056;
                case -54: goto L_0x0056;
                case -53: goto L_0x0056;
                default: goto L_0x0051;
            }
        L_0x0051:
            switch(r1) {
                case -51: goto L_0x0056;
                case -50: goto L_0x0056;
                case -49: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x00f3
        L_0x0056:
            int r1 = r12.skipBytes(r10)
            if (r1 != r10) goto L_0x0084
            r1 = r13[r14]
            int r4 = r12.readUnsignedShort()
            long r7 = (long) r4
            java.nio.ByteOrder r4 = r11.f1048d
            a.b r4 = a.C0041b.a(r7, r4)
            java.lang.String r7 = "ImageLength"
            r1.put(r7, r4)
            r13 = r13[r14]
            int r1 = r12.readUnsignedShort()
            long r7 = (long) r1
            java.nio.ByteOrder r1 = r11.f1048d
            a.b r1 = a.C0041b.a(r7, r1)
            java.lang.String r4 = "ImageWidth"
            r13.put(r4, r1)
            int r4 = r3 + -7
            goto L_0x00f3
        L_0x0084:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Invalid SOFx"
            r12.<init>(r13)
            throw r12
        L_0x008c:
            byte[] r1 = new byte[r4]
            int r3 = r12.read(r1)
            if (r3 != r4) goto L_0x00ba
            java.lang.String r3 = "UserComment"
            java.lang.String r4 = r11.c(r3)
            if (r4 != 0) goto L_0x00b8
            r13 = r13[r10]
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r7 = f1043y
            r4.<init>(r1, r7)
            java.lang.String r1 = "\u0000"
            java.lang.String r1 = r4.concat(r1)
            byte[] r1 = r1.getBytes(r7)
            a.b r4 = new a.b
            int r7 = r1.length
            r4.<init>(r1, r0, r7)
            r13.put(r3, r4)
        L_0x00b8:
            r4 = 0
            goto L_0x00f3
        L_0x00ba:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r9)
            throw r12
        L_0x00c0:
            r1 = 6
            if (r4 >= r1) goto L_0x00c4
            goto L_0x00f3
        L_0x00c4:
            byte[] r4 = new byte[r1]
            int r5 = r12.read(r4)
            if (r5 != r1) goto L_0x0119
            int r5 = r13 + 10
            int r13 = r3 + -8
            byte[] r1 = f1044z
            boolean r1 = java.util.Arrays.equals(r4, r1)
            if (r1 != 0) goto L_0x00da
            r4 = r13
            goto L_0x00f3
        L_0x00da:
            if (r13 <= 0) goto L_0x0113
            r11.e = r5
            byte[] r1 = new byte[r13]
            int r3 = r12.read(r1)
            if (r3 != r13) goto L_0x010d
            int r5 = r5 + r13
            a.a r3 = new a.a
            r3.<init>((byte[]) r1)
            r11.n(r3, r13)
            r11.p(r3, r14)
            goto L_0x00b8
        L_0x00f3:
            if (r4 < 0) goto L_0x0107
            int r13 = r12.skipBytes(r4)
            if (r13 != r4) goto L_0x00ff
            int r13 = r5 + r4
            goto L_0x001b
        L_0x00ff:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Invalid JPEG segment"
            r12.<init>(r13)
            throw r12
        L_0x0107:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r6)
            throw r12
        L_0x010d:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r9)
            throw r12
        L_0x0113:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r9)
            throw r12
        L_0x0119:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r9)
            throw r12
        L_0x011f:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r6)
            throw r12
        L_0x0125:
            java.nio.ByteOrder r13 = r11.f1048d
            r12.f1016b = r13
            return
        L_0x012a:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Invalid marker:"
            r13.<init>(r14)
            r14 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r14 = java.lang.Integer.toHexString(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0144:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r14 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r14 = java.lang.Integer.toHexString(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x015c:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r14 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r14 = java.lang.Integer.toHexString(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.C0044e.e(a.a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f1030l;
            if (i2 >= bArr2.length) {
                return 4;
            }
            if (bArr[i2] != bArr2[i2]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i3 = 0; i3 < bytes.length; i3++) {
                    if (bArr[i3] != bytes[i3]) {
                        C0040a aVar = new C0040a(bArr);
                        ByteOrder o2 = o(aVar);
                        this.f1048d = o2;
                        aVar.f1016b = o2;
                        short readShort = aVar.readShort();
                        aVar.close();
                        if (readShort == 20306 || readShort == 21330) {
                            return 7;
                        }
                        C0040a aVar2 = new C0040a(bArr);
                        ByteOrder o3 = o(aVar2);
                        this.f1048d = o3;
                        aVar2.f1016b = o3;
                        short readShort2 = aVar2.readShort();
                        aVar2.close();
                        if (readShort2 == 85) {
                            return 10;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i2++;
        }
    }

    public final void h(C0040a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        e(aVar, i2, 5);
        aVar.f((long) i3);
        aVar.f1016b = ByteOrder.BIG_ENDIAN;
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f1036r.f1022a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C0041b c2 = C0041b.c(readShort, this.f1048d);
                C0041b c3 = C0041b.c(readShort2, this.f1048d);
                HashMap[] hashMapArr = this.f1047c;
                hashMapArr[0].put("ImageLength", c2);
                hashMapArr[0].put("ImageWidth", c3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void i(C0040a aVar) {
        C0041b bVar;
        n(aVar, aVar.f1015a.available());
        p(aVar, 0);
        s(aVar, 0);
        s(aVar, 5);
        s(aVar, 4);
        r(0, 5);
        r(0, 4);
        r(5, 4);
        HashMap[] hashMapArr = this.f1047c;
        C0041b bVar2 = (C0041b) hashMapArr[1].get("PixelXDimension");
        C0041b bVar3 = (C0041b) hashMapArr[1].get("PixelYDimension");
        if (!(bVar2 == null || bVar3 == null)) {
            hashMapArr[0].put("ImageWidth", bVar2);
            hashMapArr[0].put("ImageLength", bVar3);
        }
        if (hashMapArr[4].isEmpty() && l(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        l(hashMapArr[4]);
        if (this.f1046b == 8 && (bVar = (C0041b) hashMapArr[1].get("MakerNote")) != null) {
            C0040a aVar2 = new C0040a(bVar.f1021c);
            aVar2.f1016b = this.f1048d;
            aVar2.f(6);
            p(aVar2, 9);
            C0041b bVar4 = (C0041b) hashMapArr[9].get("ColorSpace");
            if (bVar4 != null) {
                hashMapArr[1].put("ColorSpace", bVar4);
            }
        }
    }

    public final void k(C0040a aVar, HashMap hashMap) {
        int i2;
        C0041b bVar = (C0041b) hashMap.get("JPEGInterchangeFormat");
        C0041b bVar2 = (C0041b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int e2 = bVar.e(this.f1048d);
            int min = Math.min(bVar2.e(this.f1048d), aVar.f1015a.available() - e2);
            int i3 = this.f1046b;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i2 = this.e;
            } else {
                if (i3 == 7) {
                    i2 = this.f1049f;
                }
                if (e2 > 0 && min > 0 && this.f1045a == null) {
                    aVar.f((long) e2);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            e2 += i2;
            if (e2 > 0) {
            }
        }
    }

    public final boolean l(HashMap hashMap) {
        C0041b bVar = (C0041b) hashMap.get("ImageLength");
        C0041b bVar2 = (C0041b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        int e2 = bVar.e(this.f1048d);
        int e3 = bVar2.e(this.f1048d);
        if (e2 > 512 || e3 > 512) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(a.C0040a r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            int r3 = r1.f1018d
            int r3 = r3 + 2
            int r4 = r1.f1017c
            if (r3 <= r4) goto L_0x000f
            return
        L_0x000f:
            short r3 = r30.readShort()
            int r5 = r1.f1018d
            int r6 = r3 * 12
            int r6 = r6 + r5
            if (r6 <= r4) goto L_0x001b
            return
        L_0x001b:
            r6 = 0
        L_0x001c:
            java.util.HashMap[] r7 = r0.f1047c
            if (r6 >= r3) goto L_0x0292
            int r10 = r30.readUnsignedShort()
            int r11 = r30.readUnsignedShort()
            int r12 = r30.readInt()
            int r13 = r1.f1018d
            long r13 = (long) r13
            r15 = 4
            long r13 = r13 + r15
            java.util.HashMap[] r17 = f1039u
            r5 = r17[r2]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r5.get(r15)
            a.c r5 = (a.C0042c) r5
            r20 = 0
            java.lang.String r8 = "ExifInterface"
            if (r5 != 0) goto L_0x005f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r15 = "Skip the tag entry since tag number is not defined: "
            r9.<init>(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9)
            r23 = r3
            r24 = r6
            r15 = r10
            r6 = r4
            goto L_0x0104
        L_0x005f:
            if (r11 <= 0) goto L_0x0066
            int[] r9 = f1034p
            int r15 = r9.length
            if (r11 < r15) goto L_0x006e
        L_0x0066:
            r23 = r3
            r24 = r6
            r15 = r10
            r6 = r4
            goto L_0x00f3
        L_0x006e:
            int r15 = r5.f1024c
            r23 = r3
            r3 = 7
            if (r15 == r3) goto L_0x007e
            if (r11 != r3) goto L_0x0078
            goto L_0x007e
        L_0x0078:
            if (r15 == r11) goto L_0x007e
            int r3 = r5.f1025d
            if (r3 != r11) goto L_0x0081
        L_0x007e:
            r24 = r6
            goto L_0x008f
        L_0x0081:
            r24 = r6
            r6 = 4
            if (r15 == r6) goto L_0x0088
            if (r3 != r6) goto L_0x008a
        L_0x0088:
            r6 = 3
            goto L_0x008d
        L_0x008a:
            r6 = 9
            goto L_0x0091
        L_0x008d:
            if (r11 != r6) goto L_0x008a
        L_0x008f:
            r3 = 7
            goto L_0x00c7
        L_0x0091:
            if (r15 == r6) goto L_0x0095
            if (r3 != r6) goto L_0x009a
        L_0x0095:
            r6 = 8
            if (r11 != r6) goto L_0x009a
            goto L_0x008f
        L_0x009a:
            r6 = 12
            if (r15 == r6) goto L_0x00a0
            if (r3 != r6) goto L_0x00a5
        L_0x00a0:
            r3 = 11
            if (r11 != r3) goto L_0x00a5
            goto L_0x008f
        L_0x00a5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Skip the tag entry since data format ("
            r3.<init>(r6)
            java.lang.String[] r6 = f1033o
            r6 = r6[r11]
            r3.append(r6)
            java.lang.String r6 = ") is unexpected for tag: "
            r3.append(r6)
            java.lang.String r6 = r5.f1023b
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r8, r3)
            r6 = r4
            r15 = r10
            goto L_0x0104
        L_0x00c7:
            r6 = r4
            if (r11 != r3) goto L_0x00cb
            r11 = r15
        L_0x00cb:
            long r3 = (long) r12
            r9 = r9[r11]
            r15 = r10
            long r9 = (long) r9
            long r3 = r3 * r9
            int r9 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r9 < 0) goto L_0x00e0
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r25 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r25 <= 0) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            r9 = 1
            goto L_0x0107
        L_0x00e0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Skip the tag entry since the number of components is invalid: "
            r9.<init>(r10)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9)
        L_0x00f1:
            r9 = 0
            goto L_0x0107
        L_0x00f3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r8, r3)
        L_0x0104:
            r3 = r20
            goto L_0x00f1
        L_0x0107:
            if (r9 != 0) goto L_0x010e
            r1.f(r13)
            goto L_0x0287
        L_0x010e:
            java.lang.String r9 = "Compression"
            r18 = 4
            int r10 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b3
            int r10 = r30.readInt()
            r18 = r11
            int r11 = r0.f1046b
            r19 = r15
            r15 = 7
            if (r11 != r15) goto L_0x0177
            java.lang.String r11 = r5.f1023b
            java.lang.String r15 = "MakerNote"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x0134
            r0.f1049f = r10
        L_0x012f:
            r22 = r12
            r25 = r13
            goto L_0x018b
        L_0x0134:
            r11 = 6
            if (r2 != r11) goto L_0x012f
            java.lang.String r15 = r5.f1023b
            java.lang.String r11 = "ThumbnailImage"
            boolean r11 = r11.equals(r15)
            if (r11 == 0) goto L_0x012f
            r0.f1050g = r10
            r0.f1051h = r12
            java.nio.ByteOrder r11 = r0.f1048d
            r15 = 6
            a.b r11 = a.C0041b.c(r15, r11)
            int r15 = r0.f1050g
            r22 = r12
            r25 = r13
            long r12 = (long) r15
            java.nio.ByteOrder r14 = r0.f1048d
            a.b r12 = a.C0041b.a(r12, r14)
            int r13 = r0.f1051h
            long r13 = (long) r13
            java.nio.ByteOrder r15 = r0.f1048d
            a.b r13 = a.C0041b.a(r13, r15)
            r14 = 4
            r15 = r7[r14]
            r15.put(r9, r11)
            r11 = r7[r14]
            java.lang.String r15 = "JPEGInterchangeFormat"
            r11.put(r15, r12)
            r11 = r7[r14]
            java.lang.String r12 = "JPEGInterchangeFormatLength"
            r11.put(r12, r13)
            goto L_0x018b
        L_0x0177:
            r22 = r12
            r25 = r13
            r12 = 10
            if (r11 != r12) goto L_0x018b
            java.lang.String r11 = r5.f1023b
            java.lang.String r12 = "JpgFromRaw"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x018b
            r0.i = r10
        L_0x018b:
            long r11 = (long) r10
            long r13 = r11 + r3
            r27 = r3
            long r2 = (long) r6
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x019b
            r1.f(r11)
            r13 = r25
            goto L_0x01bb
        L_0x019b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r8, r2)
            r13 = r25
            r1.f(r13)
            goto L_0x0287
        L_0x01b3:
            r27 = r3
            r18 = r11
            r22 = r12
            r19 = r15
        L_0x01bb:
            java.util.HashMap r2 = f1042x
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0225
            r11 = r18
            r3 = 3
            if (r11 == r3) goto L_0x01f7
            r3 = 4
            if (r11 == r3) goto L_0x01eb
            r3 = 8
            if (r11 == r3) goto L_0x01e6
            r3 = 9
            if (r11 == r3) goto L_0x01e0
            r3 = 13
            if (r11 == r3) goto L_0x01e0
            r3 = -1
            goto L_0x01fc
        L_0x01e0:
            int r3 = r30.readInt()
        L_0x01e4:
            long r3 = (long) r3
            goto L_0x01fc
        L_0x01e6:
            short r3 = r30.readShort()
            goto L_0x01e4
        L_0x01eb:
            int r3 = r30.readInt()
            long r3 = (long) r3
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r9
            goto L_0x01fc
        L_0x01f7:
            int r3 = r30.readUnsignedShort()
            goto L_0x01e4
        L_0x01fc:
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x0210
            long r9 = (long) r6
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0210
            r1.f(r3)
            int r2 = r2.intValue()
            r0.p(r1, r2)
            goto L_0x0221
        L_0x0210:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Skip jump into the IFD since its offset is invalid: "
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r8, r2)
        L_0x0221:
            r1.f(r13)
            goto L_0x0287
        L_0x0225:
            r11 = r18
            r3 = r27
            int r2 = (int) r3
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            a.b r3 = new a.b
            r4 = r22
            r3.<init>(r2, r11, r4)
            r2 = r7[r31]
            java.lang.String r4 = r5.f1023b
            r2.put(r4, r3)
            java.lang.String r2 = r5.f1023b
            java.lang.String r4 = "DNGVersion"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x024a
            r4 = 3
            r0.f1046b = r4
        L_0x024a:
            java.lang.String r4 = "Make"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x025a
            java.lang.String r4 = "Model"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0268
        L_0x025a:
            java.nio.ByteOrder r4 = r0.f1048d
            java.lang.String r4 = r3.f(r4)
            java.lang.String r5 = "PENTAX"
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x0279
        L_0x0268:
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x027d
            java.nio.ByteOrder r2 = r0.f1048d
            int r2 = r3.e(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x027d
        L_0x0279:
            r2 = 8
            r0.f1046b = r2
        L_0x027d:
            int r2 = r1.f1018d
            long r2 = (long) r2
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0287
            r1.f(r13)
        L_0x0287:
            int r2 = r24 + 1
            short r2 = (short) r2
            r4 = r6
            r3 = r23
            r6 = r2
            r2 = r31
            goto L_0x001c
        L_0x0292:
            r6 = r4
            int r2 = r1.f1018d
            r3 = 4
            int r2 = r2 + r3
            if (r2 > r6) goto L_0x02bf
            int r2 = r30.readInt()
            r4 = 8
            if (r2 <= r4) goto L_0x02bf
            if (r2 >= r6) goto L_0x02bf
            long r4 = (long) r2
            r1.f(r4)
            r2 = r7[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02b3
            r0.p(r1, r3)
            goto L_0x02bf
        L_0x02b3:
            r2 = 5
            r3 = r7[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x02bf
            r0.p(r1, r2)
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.C0044e.p(a.a, int):void");
    }

    public final void q(C0040a aVar) {
        C0041b bVar;
        HashMap hashMap = this.f1047c[4];
        C0041b bVar2 = (C0041b) hashMap.get("Compression");
        if (bVar2 != null) {
            int e2 = bVar2.e(this.f1048d);
            if (e2 != 1) {
                if (e2 == 6) {
                    k(aVar, hashMap);
                    return;
                } else if (e2 != 7) {
                    return;
                }
            }
            C0041b bVar3 = (C0041b) hashMap.get("BitsPerSample");
            if (bVar3 != null) {
                int[] iArr = (int[]) bVar3.g(this.f1048d);
                int[] iArr2 = f1028j;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.f1046b == 3 && (bVar = (C0041b) hashMap.get("PhotometricInterpretation")) != null) {
                        int e3 = bVar.e(this.f1048d);
                        if ((e3 != 1 || !Arrays.equals(iArr, f1029k)) && (e3 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C0041b bVar4 = (C0041b) hashMap.get("StripOffsets");
                C0041b bVar5 = (C0041b) hashMap.get("StripByteCounts");
                if (bVar4 != null && bVar5 != null) {
                    long[] b2 = b(bVar4.g(this.f1048d));
                    long[] b3 = b(bVar5.g(this.f1048d));
                    if (b2 == null) {
                        Log.w("ExifInterface", "stripOffsets should not be null.");
                    } else if (b3 == null) {
                        Log.w("ExifInterface", "stripByteCounts should not be null.");
                    } else {
                        long j2 = 0;
                        for (long j3 : b3) {
                            j2 += j3;
                        }
                        byte[] bArr = new byte[((int) j2)];
                        int i2 = 0;
                        int i3 = 0;
                        for (int i4 = 0; i4 < b2.length; i4++) {
                            int i5 = (int) b2[i4];
                            int i6 = (int) b3[i4];
                            int i7 = i5 - i2;
                            aVar.f((long) i7);
                            int i8 = i2 + i7;
                            byte[] bArr2 = new byte[i6];
                            aVar.read(bArr2);
                            i2 = i8 + i6;
                            System.arraycopy(bArr2, 0, bArr, i3, i6);
                            i3 += i6;
                        }
                    }
                }
            }
        } else {
            k(aVar, hashMap);
        }
    }

    public final void r(int i2, int i3) {
        HashMap[] hashMapArr = this.f1047c;
        if (!hashMapArr[i2].isEmpty() && !hashMapArr[i3].isEmpty()) {
            C0041b bVar = (C0041b) hashMapArr[i2].get("ImageLength");
            C0041b bVar2 = (C0041b) hashMapArr[i2].get("ImageWidth");
            C0041b bVar3 = (C0041b) hashMapArr[i3].get("ImageLength");
            C0041b bVar4 = (C0041b) hashMapArr[i3].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int e2 = bVar.e(this.f1048d);
                int e3 = bVar2.e(this.f1048d);
                int e4 = bVar3.e(this.f1048d);
                int e5 = bVar4.e(this.f1048d);
                if (e2 < e4 && e3 < e5) {
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public final void s(C0040a aVar, int i2) {
        C0041b bVar;
        C0041b bVar2;
        C0041b bVar3;
        HashMap[] hashMapArr = this.f1047c;
        C0041b bVar4 = (C0041b) hashMapArr[i2].get("DefaultCropSize");
        C0041b bVar5 = (C0041b) hashMapArr[i2].get("SensorTopBorder");
        C0041b bVar6 = (C0041b) hashMapArr[i2].get("SensorLeftBorder");
        C0041b bVar7 = (C0041b) hashMapArr[i2].get("SensorBottomBorder");
        C0041b bVar8 = (C0041b) hashMapArr[i2].get("SensorRightBorder");
        if (bVar4 != null) {
            if (bVar4.f1019a == 5) {
                C0043d[] dVarArr = (C0043d[]) bVar4.g(this.f1048d);
                if (dVarArr == null || dVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                    return;
                }
                bVar3 = C0041b.b(dVarArr[0], this.f1048d);
                bVar2 = C0041b.b(dVarArr[1], this.f1048d);
            } else {
                int[] iArr = (int[]) bVar4.g(this.f1048d);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                bVar3 = C0041b.c(iArr[0], this.f1048d);
                bVar2 = C0041b.c(iArr[1], this.f1048d);
            }
            hashMapArr[i2].put("ImageWidth", bVar3);
            hashMapArr[i2].put("ImageLength", bVar2);
        } else if (bVar5 == null || bVar6 == null || bVar7 == null || bVar8 == null) {
            C0041b bVar9 = (C0041b) hashMapArr[i2].get("ImageLength");
            C0041b bVar10 = (C0041b) hashMapArr[i2].get("ImageWidth");
            if ((bVar9 == null || bVar10 == null) && (bVar = (C0041b) hashMapArr[i2].get("JPEGInterchangeFormat")) != null) {
                e(aVar, bVar.e(this.f1048d), i2);
            }
        } else {
            int e2 = bVar5.e(this.f1048d);
            int e3 = bVar7.e(this.f1048d);
            int e4 = bVar8.e(this.f1048d);
            int e5 = bVar6.e(this.f1048d);
            if (e3 > e2 && e4 > e5) {
                C0041b c2 = C0041b.c(e3 - e2, this.f1048d);
                C0041b c3 = C0041b.c(e4 - e5, this.f1048d);
                hashMapArr[i2].put("ImageLength", c2);
                hashMapArr[i2].put("ImageWidth", c3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0044e(java.lang.String r3) {
        /*
            r2 = this;
            r2.<init>()
            a.c[][] r0 = f1037s
            int r0 = r0.length
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            r2.f1047c = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.f1048d = r0
            if (r3 == 0) goto L_0x002e
            r2.f1045a = r3
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0024 }
            r1.<init>(r3)     // Catch:{ all -> 0x0024 }
            r2.m(r1)     // Catch:{ all -> 0x0021 }
            r1.close()     // Catch:{ RuntimeException -> 0x001f, Exception -> 0x001e }
        L_0x001e:
            return
        L_0x001f:
            r3 = move-exception
            throw r3
        L_0x0021:
            r3 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r3 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ RuntimeException -> 0x002b, Exception -> 0x002d }
            goto L_0x002d
        L_0x002b:
            r3 = move-exception
            throw r3
        L_0x002d:
            throw r3
        L_0x002e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "filename cannot be null"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.C0044e.<init>(java.lang.String):void");
    }

    public static ByteOrder o(C0040a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void g(C0040a aVar) {
        int i2;
        int i3;
        i(aVar);
        HashMap[] hashMapArr = this.f1047c;
        C0041b bVar = (C0041b) hashMapArr[1].get("MakerNote");
        if (bVar != null) {
            C0040a aVar2 = new C0040a(bVar.f1021c);
            aVar2.f1016b = this.f1048d;
            byte[] bArr = f1031m;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.f(0);
            byte[] bArr3 = f1032n;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.f(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.f(12);
            }
            p(aVar2, 6);
            C0041b bVar2 = (C0041b) hashMapArr[7].get("PreviewImageStart");
            C0041b bVar3 = (C0041b) hashMapArr[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", bVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            C0041b bVar4 = (C0041b) hashMapArr[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.g(this.f1048d);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 > i5 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                    int i6 = (i4 - i5) + 1;
                    int i7 = (i2 - i3) + 1;
                    if (i6 < i7) {
                        int i8 = i6 + i7;
                        i7 = i8 - i7;
                        i6 = i8 - i7;
                    }
                    C0041b c2 = C0041b.c(i6, this.f1048d);
                    C0041b c3 = C0041b.c(i7, this.f1048d);
                    hashMapArr[0].put("ImageWidth", c2);
                    hashMapArr[0].put("ImageLength", c3);
                }
            }
        }
    }

    public final void j(C0040a aVar) {
        i(aVar);
        HashMap[] hashMapArr = this.f1047c;
        if (((C0041b) hashMapArr[0].get("JpgFromRaw")) != null) {
            e(aVar, this.i, 5);
        }
        C0041b bVar = (C0041b) hashMapArr[0].get("ISO");
        C0041b bVar2 = (C0041b) hashMapArr[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            hashMapArr[1].put("PhotographicSensitivity", bVar);
        }
    }

    public final void n(C0040a aVar, int i2) {
        ByteOrder o2 = o(aVar);
        this.f1048d = o2;
        aVar.f1016b = o2;
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.f1046b;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(E.e("Invalid first Ifd offset: ", readInt));
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aVar.skipBytes(i4) != i4) {
                throw new IOException(E.e("Couldn't jump to first Ifd: ", i4));
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }
}
