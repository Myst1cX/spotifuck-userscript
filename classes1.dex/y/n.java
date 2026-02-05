package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class n {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5130d = {0, 4, 8};
    public static final SparseIntArray e;

    /* renamed from: f  reason: collision with root package name */
    public static final SparseIntArray f5131f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5132a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5133b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5134c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5131f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(C0355a aVar, String str) {
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = q.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1432r) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f1432r.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r3v120, types: [y.h, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x05b9, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x05c9, code lost:
        r6 = r6 + r10;
        r10 = r19;
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0624, code lost:
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0627, code lost:
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0629, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00aa, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x07b1, code lost:
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x07b3, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0ceb, code lost:
        r12 = r12 + r0;
        r3 = r23;
        r20 = r15;
        r0 = r18;
        r18 = r10;
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0ceb, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static y.i d(android.content.Context r21, android.util.AttributeSet r22, boolean r23) {
        /*
            y.i r1 = new y.i
            r1.<init>()
            if (r23 == 0) goto L_0x000e
            int[] r2 = y.r.f5138c
        L_0x0009:
            r3 = r21
            r4 = r22
            goto L_0x0011
        L_0x000e:
            int[] r2 = y.r.f5136a
            goto L_0x0009
        L_0x0011:
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r4, r2)
            int[] r3 = f5130d
            android.util.SparseIntArray r4 = e
            y.l r5 = r1.f5038b
            java.lang.String[] r6 = u.C0342a.f4680a
            y.m r7 = r1.e
            y.k r8 = r1.f5039c
            y.j r9 = r1.f5040d
            java.lang.String r12 = "CURRENTLY UNSUPPORTED"
            java.lang.String r13 = "/"
            java.lang.String r14 = "unused attribute 0x"
            java.lang.String r15 = "Unknown attribute 0x"
            java.lang.String r11 = "   "
            java.lang.String r0 = "ConstraintSet"
            if (r23 == 0) goto L_0x05d0
            int r10 = r2.getIndexCount()
            r16 = r3
            y.h r3 = new y.h
            r3.<init>()
            r17 = r6
            r6 = 10
            r18 = r12
            int[] r12 = new int[r6]
            r3.f5027a = r12
            int[] r12 = new int[r6]
            r3.f5028b = r12
            r12 = 0
            r3.f5029c = r12
            int[] r12 = new int[r6]
            r3.f5030d = r12
            float[] r6 = new float[r6]
            r3.e = r6
            r6 = 0
            r3.f5031f = r6
            r12 = 5
            int[] r6 = new int[r12]
            r3.f5032g = r6
            java.lang.String[] r6 = new java.lang.String[r12]
            r3.f5033h = r6
            r6 = 0
            r3.i = r6
            r12 = 4
            int[] r6 = new int[r12]
            r3.f5034j = r6
            boolean[] r6 = new boolean[r12]
            r3.f5035k = r6
            r6 = 0
            r3.f5036l = r6
            r8.getClass()
            r9.getClass()
            r7.getClass()
            r6 = 0
        L_0x007a:
            if (r6 >= r10) goto L_0x0cfe
            int r12 = r2.getIndex(r6)
            r19 = r10
            android.util.SparseIntArray r10 = f5131f
            int r10 = r10.get(r12)
            switch(r10) {
                case 2: goto L_0x05bb;
                case 3: goto L_0x008b;
                case 4: goto L_0x008b;
                case 5: goto L_0x05af;
                case 6: goto L_0x05a1;
                case 7: goto L_0x0593;
                case 8: goto L_0x0584;
                case 9: goto L_0x008b;
                case 10: goto L_0x008b;
                case 11: goto L_0x0575;
                case 12: goto L_0x0566;
                case 13: goto L_0x0557;
                case 14: goto L_0x0548;
                case 15: goto L_0x0539;
                case 16: goto L_0x052a;
                case 17: goto L_0x051b;
                case 18: goto L_0x050c;
                case 19: goto L_0x04fd;
                case 20: goto L_0x04ee;
                case 21: goto L_0x04df;
                case 22: goto L_0x04ce;
                case 23: goto L_0x04bf;
                case 24: goto L_0x04b0;
                case 25: goto L_0x008b;
                case 26: goto L_0x008b;
                case 27: goto L_0x04a1;
                case 28: goto L_0x0492;
                case 29: goto L_0x008b;
                case 30: goto L_0x008b;
                case 31: goto L_0x0483;
                case 32: goto L_0x008b;
                case 33: goto L_0x008b;
                case 34: goto L_0x0474;
                case 35: goto L_0x008b;
                case 36: goto L_0x008b;
                case 37: goto L_0x0465;
                case 38: goto L_0x0454;
                case 39: goto L_0x0445;
                case 40: goto L_0x0436;
                case 41: goto L_0x0427;
                case 42: goto L_0x0418;
                case 43: goto L_0x0409;
                case 44: goto L_0x03f6;
                case 45: goto L_0x03e7;
                case 46: goto L_0x03d8;
                case 47: goto L_0x03c9;
                case 48: goto L_0x03ba;
                case 49: goto L_0x03ab;
                case 50: goto L_0x039c;
                case 51: goto L_0x038d;
                case 52: goto L_0x037e;
                case 53: goto L_0x036f;
                case 54: goto L_0x0360;
                case 55: goto L_0x0351;
                case 56: goto L_0x0342;
                case 57: goto L_0x0333;
                case 58: goto L_0x0324;
                case 59: goto L_0x0315;
                case 60: goto L_0x0306;
                case 61: goto L_0x008b;
                case 62: goto L_0x02f7;
                case 63: goto L_0x02e8;
                case 64: goto L_0x02d9;
                case 65: goto L_0x02b4;
                case 66: goto L_0x02a6;
                case 67: goto L_0x0297;
                case 68: goto L_0x0288;
                case 69: goto L_0x0279;
                case 70: goto L_0x0268;
                case 71: goto L_0x025f;
                case 72: goto L_0x0250;
                case 73: goto L_0x0241;
                case 74: goto L_0x0234;
                case 75: goto L_0x0225;
                case 76: goto L_0x0216;
                case 77: goto L_0x0209;
                case 78: goto L_0x01fa;
                case 79: goto L_0x01eb;
                case 80: goto L_0x01dc;
                case 81: goto L_0x01cd;
                case 82: goto L_0x01be;
                case 83: goto L_0x01af;
                case 84: goto L_0x01a0;
                case 85: goto L_0x0191;
                case 86: goto L_0x012f;
                case 87: goto L_0x010e;
                case 88: goto L_0x008b;
                case 89: goto L_0x008b;
                case 90: goto L_0x008b;
                case 91: goto L_0x008b;
                case 92: goto L_0x008b;
                case 93: goto L_0x0100;
                case 94: goto L_0x00f2;
                case 95: goto L_0x00eb;
                case 96: goto L_0x00e4;
                case 97: goto L_0x00d6;
                case 98: goto L_0x00bc;
                case 99: goto L_0x00ae;
                default: goto L_0x008b;
            }
        L_0x008b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r15)
            r20 = r15
            java.lang.String r15 = java.lang.Integer.toHexString(r12)
            r10.append(r15)
            r10.append(r11)
            int r12 = r4.get(r12)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r0, r10)
        L_0x00aa:
            r10 = 1
        L_0x00ab:
            r15 = 5
            goto L_0x05c9
        L_0x00ae:
            r20 = r15
            boolean r10 = r9.f5079g
            boolean r10 = r2.getBoolean(r12, r10)
            r12 = 99
            r3.c(r12, r10)
            goto L_0x00aa
        L_0x00bc:
            r20 = r15
            int r10 = x.C0354a.f4927v
            android.util.TypedValue r10 = r2.peekValue(r12)
            int r10 = r10.type
            r15 = 3
            if (r10 != r15) goto L_0x00cd
            r2.getString(r12)
            goto L_0x00aa
        L_0x00cd:
            int r10 = r1.f5037a
            int r10 = r2.getResourceId(r12, r10)
            r1.f5037a = r10
            goto L_0x00aa
        L_0x00d6:
            r20 = r15
            int r10 = r9.f5094o0
            int r10 = r2.getInt(r12, r10)
            r12 = 97
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x00e4:
            r20 = r15
            r10 = 1
            g(r3, r2, r12, r10)
            goto L_0x00ab
        L_0x00eb:
            r20 = r15
            r10 = 0
            g(r3, r2, r12, r10)
            goto L_0x00aa
        L_0x00f2:
            r20 = r15
            int r10 = r9.f5060S
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 94
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0100:
            r20 = r15
            int r10 = r9.f5053L
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 93
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x010e:
            r20 = r15
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r14)
            java.lang.String r15 = java.lang.Integer.toHexString(r12)
            r10.append(r15)
            r10.append(r11)
            int r12 = r4.get(r12)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r0, r10)
            goto L_0x00aa
        L_0x012f:
            r20 = r15
            android.util.TypedValue r10 = r2.peekValue(r12)
            int r10 = r10.type
            r15 = 1
            if (r10 != r15) goto L_0x0152
            r15 = -1
            int r10 = r2.getResourceId(r12, r15)
            r8.i = r10
            r12 = 89
            r3.b(r12, r10)
            int r10 = r8.i
            if (r10 == r15) goto L_0x00aa
            r10 = -2
            r12 = 88
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0152:
            r15 = 3
            if (r10 != r15) goto L_0x0184
            java.lang.String r10 = r2.getString(r12)
            r8.f5113h = r10
            r15 = 90
            r3.d(r10, r15)
            java.lang.String r10 = r8.f5113h
            int r10 = r10.indexOf(r13)
            if (r10 <= 0) goto L_0x017c
            r10 = -1
            int r12 = r2.getResourceId(r12, r10)
            r8.i = r12
            r15 = 89
            r3.b(r15, r12)
            r12 = -2
            r15 = 88
            r3.b(r15, r12)
            goto L_0x00aa
        L_0x017c:
            r10 = -1
            r15 = 88
            r3.b(r15, r10)
            goto L_0x00aa
        L_0x0184:
            r15 = 88
            int r10 = r8.i
            int r10 = r2.getInteger(r12, r10)
            r3.b(r15, r10)
            goto L_0x00aa
        L_0x0191:
            r20 = r15
            float r10 = r8.f5111f
            float r10 = r2.getFloat(r12, r10)
            r12 = 85
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x01a0:
            r20 = r15
            int r10 = r8.f5112g
            int r10 = r2.getInteger(r12, r10)
            r12 = 84
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x01af:
            r20 = r15
            int r10 = r7.f5125h
            int r10 = f(r2, r12, r10)
            r12 = 83
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x01be:
            r20 = r15
            int r10 = r8.f5108b
            int r10 = r2.getInteger(r12, r10)
            r12 = 82
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x01cd:
            r20 = r15
            boolean r10 = r9.m0
            boolean r10 = r2.getBoolean(r12, r10)
            r12 = 81
            r3.c(r12, r10)
            goto L_0x00aa
        L_0x01dc:
            r20 = r15
            boolean r10 = r9.f5089l0
            boolean r10 = r2.getBoolean(r12, r10)
            r12 = 80
            r3.c(r12, r10)
            goto L_0x00aa
        L_0x01eb:
            r20 = r15
            float r10 = r8.f5110d
            float r10 = r2.getFloat(r12, r10)
            r12 = 79
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x01fa:
            r20 = r15
            int r10 = r5.f5115b
            int r10 = r2.getInt(r12, r10)
            r12 = 78
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0209:
            r20 = r15
            r10 = 77
            java.lang.String r12 = r2.getString(r12)
            r3.d(r12, r10)
            goto L_0x00aa
        L_0x0216:
            r20 = r15
            int r10 = r8.f5109c
            int r10 = r2.getInt(r12, r10)
            r12 = 76
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0225:
            r20 = r15
            boolean r10 = r9.f5092n0
            boolean r10 = r2.getBoolean(r12, r10)
            r12 = 75
            r3.c(r12, r10)
            goto L_0x00aa
        L_0x0234:
            r20 = r15
            r10 = 74
            java.lang.String r12 = r2.getString(r12)
            r3.d(r12, r10)
            goto L_0x00aa
        L_0x0241:
            r20 = r15
            int r10 = r9.f5080g0
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 73
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0250:
            r20 = r15
            int r10 = r9.f5078f0
            int r10 = r2.getInt(r12, r10)
            r12 = 72
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x025f:
            r20 = r15
            r10 = r18
            android.util.Log.e(r0, r10)
            goto L_0x00aa
        L_0x0268:
            r20 = r15
            r10 = r18
            r15 = 70
            r10 = 1065353216(0x3f800000, float:1.0)
            float r12 = r2.getFloat(r12, r10)
            r3.a(r15, r12)
            goto L_0x00aa
        L_0x0279:
            r20 = r15
            r10 = 1065353216(0x3f800000, float:1.0)
            r15 = 69
            float r12 = r2.getFloat(r12, r10)
            r3.a(r15, r12)
            goto L_0x00aa
        L_0x0288:
            r20 = r15
            float r10 = r5.f5117d
            float r10 = r2.getFloat(r12, r10)
            r12 = 68
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0297:
            r20 = r15
            float r10 = r8.e
            float r10 = r2.getFloat(r12, r10)
            r12 = 67
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x02a6:
            r20 = r15
            r10 = 66
            r15 = 0
            int r12 = r2.getInt(r12, r15)
            r3.b(r10, r12)
            goto L_0x00aa
        L_0x02b4:
            r20 = r15
            r15 = 0
            android.util.TypedValue r10 = r2.peekValue(r12)
            int r10 = r10.type
            r15 = 3
            if (r10 != r15) goto L_0x02cb
            java.lang.String r10 = r2.getString(r12)
            r15 = 65
            r3.d(r10, r15)
            goto L_0x00aa
        L_0x02cb:
            r10 = 0
            r15 = 65
            int r12 = r2.getInteger(r12, r10)
            r10 = r17[r12]
            r3.d(r10, r15)
            goto L_0x00aa
        L_0x02d9:
            r20 = r15
            int r10 = r8.f5107a
            int r10 = f(r2, r12, r10)
            r12 = 64
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x02e8:
            r20 = r15
            float r10 = r9.f5044B
            float r10 = r2.getFloat(r12, r10)
            r12 = 63
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x02f7:
            r20 = r15
            int r10 = r9.f5043A
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 62
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0306:
            r20 = r15
            float r10 = r7.f5119a
            float r10 = r2.getFloat(r12, r10)
            r12 = 60
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0315:
            r20 = r15
            int r10 = r9.f5073c0
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 59
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0324:
            r20 = r15
            int r10 = r9.f5071b0
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 58
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0333:
            r20 = r15
            int r10 = r9.f5069a0
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 57
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0342:
            r20 = r15
            int r10 = r9.f5067Z
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 56
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0351:
            r20 = r15
            int r10 = r9.f5066Y
            int r10 = r2.getInt(r12, r10)
            r12 = 55
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0360:
            r20 = r15
            int r10 = r9.f5065X
            int r10 = r2.getInt(r12, r10)
            r12 = 54
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x036f:
            r20 = r15
            float r10 = r7.f5127k
            float r10 = r2.getDimension(r12, r10)
            r12 = 53
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x037e:
            r20 = r15
            float r10 = r7.f5126j
            float r10 = r2.getDimension(r12, r10)
            r12 = 52
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x038d:
            r20 = r15
            float r10 = r7.i
            float r10 = r2.getDimension(r12, r10)
            r12 = 51
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x039c:
            r20 = r15
            float r10 = r7.f5124g
            float r10 = r2.getDimension(r12, r10)
            r12 = 50
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03ab:
            r20 = r15
            float r10 = r7.f5123f
            float r10 = r2.getDimension(r12, r10)
            r12 = 49
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03ba:
            r20 = r15
            float r10 = r7.e
            float r10 = r2.getFloat(r12, r10)
            r12 = 48
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03c9:
            r20 = r15
            float r10 = r7.f5122d
            float r10 = r2.getFloat(r12, r10)
            r12 = 47
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03d8:
            r20 = r15
            float r10 = r7.f5121c
            float r10 = r2.getFloat(r12, r10)
            r12 = 46
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03e7:
            r20 = r15
            float r10 = r7.f5120b
            float r10 = r2.getFloat(r12, r10)
            r12 = 45
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x03f6:
            r20 = r15
            r10 = 44
            r15 = 1
            r3.c(r10, r15)
            float r15 = r7.f5129m
            float r12 = r2.getDimension(r12, r15)
            r3.a(r10, r12)
            goto L_0x00aa
        L_0x0409:
            r20 = r15
            float r10 = r5.f5116c
            float r10 = r2.getFloat(r12, r10)
            r12 = 43
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0418:
            r20 = r15
            int r10 = r9.f5064W
            int r10 = r2.getInt(r12, r10)
            r12 = 42
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0427:
            r20 = r15
            int r10 = r9.f5063V
            int r10 = r2.getInt(r12, r10)
            r12 = 41
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0436:
            r20 = r15
            float r10 = r9.f5061T
            float r10 = r2.getFloat(r12, r10)
            r12 = 40
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0445:
            r20 = r15
            float r10 = r9.f5062U
            float r10 = r2.getFloat(r12, r10)
            r12 = 39
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0454:
            r20 = r15
            int r10 = r1.f5037a
            int r10 = r2.getResourceId(r12, r10)
            r1.f5037a = r10
            r12 = 38
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0465:
            r20 = r15
            float r10 = r9.f5103x
            float r10 = r2.getFloat(r12, r10)
            r12 = 37
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x0474:
            r20 = r15
            int r10 = r9.f5050H
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 34
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0483:
            r20 = r15
            int r10 = r9.f5052K
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 31
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0492:
            r20 = r15
            int r10 = r9.f5049G
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 28
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04a1:
            r20 = r15
            int r10 = r9.f5047E
            int r10 = r2.getInt(r12, r10)
            r12 = 27
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04b0:
            r20 = r15
            int r10 = r9.f5048F
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 24
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04bf:
            r20 = r15
            int r10 = r9.f5070b
            int r10 = r2.getLayoutDimension(r12, r10)
            r12 = 23
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04ce:
            r20 = r15
            int r10 = r5.f5114a
            int r10 = r2.getInt(r12, r10)
            r10 = r16[r10]
            r12 = 22
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04df:
            r20 = r15
            int r10 = r9.f5072c
            int r10 = r2.getLayoutDimension(r12, r10)
            r12 = 21
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x04ee:
            r20 = r15
            float r10 = r9.f5102w
            float r10 = r2.getFloat(r12, r10)
            r12 = 20
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x04fd:
            r20 = r15
            float r10 = r9.f5077f
            float r10 = r2.getFloat(r12, r10)
            r12 = 19
            r3.a(r12, r10)
            goto L_0x00aa
        L_0x050c:
            r20 = r15
            int r10 = r9.e
            int r10 = r2.getDimensionPixelOffset(r12, r10)
            r12 = 18
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x051b:
            r20 = r15
            int r10 = r9.f5074d
            int r10 = r2.getDimensionPixelOffset(r12, r10)
            r12 = 17
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x052a:
            r20 = r15
            int r10 = r9.f5055N
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 16
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0539:
            r20 = r15
            int r10 = r9.f5059R
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 15
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0548:
            r20 = r15
            int r10 = r9.f5056O
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 14
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0557:
            r20 = r15
            int r10 = r9.f5054M
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 13
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0566:
            r20 = r15
            int r10 = r9.f5058Q
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 12
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0575:
            r20 = r15
            int r10 = r9.f5057P
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 11
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0584:
            r20 = r15
            int r10 = r9.f5051J
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 8
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x0593:
            r20 = r15
            int r10 = r9.f5046D
            int r10 = r2.getDimensionPixelOffset(r12, r10)
            r12 = 7
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x05a1:
            r20 = r15
            int r10 = r9.f5045C
            int r10 = r2.getDimensionPixelOffset(r12, r10)
            r12 = 6
            r3.b(r12, r10)
            goto L_0x00aa
        L_0x05af:
            r20 = r15
            java.lang.String r10 = r2.getString(r12)
            r15 = 5
            r3.d(r10, r15)
        L_0x05b9:
            r10 = 1
            goto L_0x05c9
        L_0x05bb:
            r20 = r15
            r15 = 5
            int r10 = r9.I
            int r10 = r2.getDimensionPixelSize(r12, r10)
            r12 = 2
            r3.b(r12, r10)
            goto L_0x05b9
        L_0x05c9:
            int r6 = r6 + r10
            r10 = r19
            r15 = r20
            goto L_0x007a
        L_0x05d0:
            r16 = r3
            r17 = r6
            r18 = r12
            r20 = r15
            r10 = 1
            int r3 = r2.getIndexCount()
            r12 = 0
        L_0x05de:
            if (r12 >= r3) goto L_0x0cf7
            int r6 = r2.getIndex(r12)
            if (r6 == r10) goto L_0x05f8
            r10 = 23
            r15 = 24
            if (r10 == r6) goto L_0x05fc
            if (r15 == r6) goto L_0x05fc
            r8.getClass()
            r9.getClass()
            r7.getClass()
            goto L_0x05fc
        L_0x05f8:
            r10 = 23
            r15 = 24
        L_0x05fc:
            int r19 = r4.get(r6)
            switch(r19) {
                case 1: goto L_0x0cd8;
                case 2: goto L_0x0cc5;
                case 3: goto L_0x0cb2;
                case 4: goto L_0x0c9f;
                case 5: goto L_0x0c8e;
                case 6: goto L_0x0c7b;
                case 7: goto L_0x0c68;
                case 8: goto L_0x0c55;
                case 9: goto L_0x0c42;
                case 10: goto L_0x0c2f;
                case 11: goto L_0x0c1c;
                case 12: goto L_0x0c09;
                case 13: goto L_0x0bf6;
                case 14: goto L_0x0be3;
                case 15: goto L_0x0bd0;
                case 16: goto L_0x0bbd;
                case 17: goto L_0x0baa;
                case 18: goto L_0x0b97;
                case 19: goto L_0x0b84;
                case 20: goto L_0x0b71;
                case 21: goto L_0x0b5e;
                case 22: goto L_0x0b47;
                case 23: goto L_0x0b34;
                case 24: goto L_0x0b21;
                case 25: goto L_0x0b0e;
                case 26: goto L_0x0afb;
                case 27: goto L_0x0ae8;
                case 28: goto L_0x0ad5;
                case 29: goto L_0x0ac2;
                case 30: goto L_0x0aaf;
                case 31: goto L_0x0a9c;
                case 32: goto L_0x0a89;
                case 33: goto L_0x0a76;
                case 34: goto L_0x0a63;
                case 35: goto L_0x0a50;
                case 36: goto L_0x0a3d;
                case 37: goto L_0x0a2a;
                case 38: goto L_0x0a17;
                case 39: goto L_0x0a04;
                case 40: goto L_0x09f1;
                case 41: goto L_0x09de;
                case 42: goto L_0x09cb;
                case 43: goto L_0x09b8;
                case 44: goto L_0x09a2;
                case 45: goto L_0x098f;
                case 46: goto L_0x097c;
                case 47: goto L_0x0969;
                case 48: goto L_0x0956;
                case 49: goto L_0x0943;
                case 50: goto L_0x0930;
                case 51: goto L_0x091d;
                case 52: goto L_0x090a;
                case 53: goto L_0x08f7;
                case 54: goto L_0x08e4;
                case 55: goto L_0x08d1;
                case 56: goto L_0x08be;
                case 57: goto L_0x08ab;
                case 58: goto L_0x0898;
                case 59: goto L_0x0885;
                case 60: goto L_0x0872;
                case 61: goto L_0x085f;
                case 62: goto L_0x084c;
                case 63: goto L_0x0839;
                case 64: goto L_0x0826;
                case 65: goto L_0x0802;
                case 66: goto L_0x07f3;
                case 67: goto L_0x07e4;
                case 68: goto L_0x07d5;
                case 69: goto L_0x07c6;
                case 70: goto L_0x07b7;
                case 71: goto L_0x07a7;
                case 72: goto L_0x0798;
                case 73: goto L_0x0789;
                case 74: goto L_0x077c;
                case 75: goto L_0x076d;
                case 76: goto L_0x075e;
                case 77: goto L_0x0751;
                case 78: goto L_0x0742;
                case 79: goto L_0x0733;
                case 80: goto L_0x0724;
                case 81: goto L_0x0715;
                case 82: goto L_0x0706;
                case 83: goto L_0x06f7;
                case 84: goto L_0x06e8;
                case 85: goto L_0x06d9;
                case 86: goto L_0x06a3;
                case 87: goto L_0x0681;
                case 88: goto L_0x0603;
                case 89: goto L_0x0603;
                case 90: goto L_0x0603;
                case 91: goto L_0x0674;
                case 92: goto L_0x0667;
                case 93: goto L_0x065a;
                case 94: goto L_0x064d;
                case 95: goto L_0x0642;
                case 96: goto L_0x0639;
                case 97: goto L_0x062c;
                default: goto L_0x0603;
            }
        L_0x0603:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r15 = r20
            r10.<init>(r15)
            r23 = r3
            java.lang.String r3 = java.lang.Integer.toHexString(r6)
            r10.append(r3)
            r10.append(r11)
            int r3 = r4.get(r6)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            android.util.Log.w(r0, r3)
        L_0x0624:
            r10 = r18
            r3 = 0
        L_0x0627:
            r18 = r0
        L_0x0629:
            r0 = 1
            goto L_0x0ceb
        L_0x062c:
            r23 = r3
            r15 = r20
            int r3 = r9.f5094o0
            int r3 = r2.getInt(r6, r3)
            r9.f5094o0 = r3
            goto L_0x0624
        L_0x0639:
            r23 = r3
            r15 = r20
            r3 = 1
            g(r9, r2, r6, r3)
            goto L_0x0624
        L_0x0642:
            r23 = r3
            r15 = r20
            r3 = 0
            g(r9, r2, r6, r3)
            r10 = r18
            goto L_0x0627
        L_0x064d:
            r23 = r3
            r15 = r20
            int r3 = r9.f5060S
            int r3 = r2.getDimensionPixelSize(r6, r3)
            r9.f5060S = r3
            goto L_0x0624
        L_0x065a:
            r23 = r3
            r15 = r20
            int r3 = r9.f5053L
            int r3 = r2.getDimensionPixelSize(r6, r3)
            r9.f5053L = r3
            goto L_0x0624
        L_0x0667:
            r23 = r3
            r15 = r20
            int r3 = r9.f5097r
            int r3 = f(r2, r6, r3)
            r9.f5097r = r3
            goto L_0x0624
        L_0x0674:
            r23 = r3
            r15 = r20
            int r3 = r9.f5096q
            int r3 = f(r2, r6, r3)
            r9.f5096q = r3
            goto L_0x0624
        L_0x0681:
            r23 = r3
            r15 = r20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r14)
            java.lang.String r10 = java.lang.Integer.toHexString(r6)
            r3.append(r10)
            r3.append(r11)
            int r6 = r4.get(r6)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r0, r3)
            goto L_0x0624
        L_0x06a3:
            r23 = r3
            r15 = r20
            android.util.TypedValue r3 = r2.peekValue(r6)
            int r3 = r3.type
            r10 = 1
            if (r3 != r10) goto L_0x06b9
            r10 = -1
            int r3 = r2.getResourceId(r6, r10)
            r8.i = r3
            goto L_0x0624
        L_0x06b9:
            r10 = 3
            if (r3 != r10) goto L_0x06d1
            java.lang.String r3 = r2.getString(r6)
            r8.f5113h = r3
            int r3 = r3.indexOf(r13)
            if (r3 <= 0) goto L_0x0624
            r3 = -1
            int r6 = r2.getResourceId(r6, r3)
            r8.i = r6
            goto L_0x0624
        L_0x06d1:
            r3 = -1
            int r10 = r8.i
            r2.getInteger(r6, r10)
            goto L_0x0624
        L_0x06d9:
            r23 = r3
            r15 = r20
            r3 = -1
            float r10 = r8.f5111f
            float r6 = r2.getFloat(r6, r10)
            r8.f5111f = r6
            goto L_0x0624
        L_0x06e8:
            r23 = r3
            r15 = r20
            r3 = -1
            int r10 = r8.f5112g
            int r6 = r2.getInteger(r6, r10)
            r8.f5112g = r6
            goto L_0x0624
        L_0x06f7:
            r23 = r3
            r15 = r20
            r3 = -1
            int r10 = r7.f5125h
            int r6 = f(r2, r6, r10)
            r7.f5125h = r6
            goto L_0x0624
        L_0x0706:
            r23 = r3
            r15 = r20
            r3 = -1
            int r10 = r8.f5108b
            int r6 = r2.getInteger(r6, r10)
            r8.f5108b = r6
            goto L_0x0624
        L_0x0715:
            r23 = r3
            r15 = r20
            r3 = -1
            boolean r10 = r9.m0
            boolean r6 = r2.getBoolean(r6, r10)
            r9.m0 = r6
            goto L_0x0624
        L_0x0724:
            r23 = r3
            r15 = r20
            r3 = -1
            boolean r10 = r9.f5089l0
            boolean r6 = r2.getBoolean(r6, r10)
            r9.f5089l0 = r6
            goto L_0x0624
        L_0x0733:
            r23 = r3
            r15 = r20
            r3 = -1
            float r10 = r8.f5110d
            float r6 = r2.getFloat(r6, r10)
            r8.f5110d = r6
            goto L_0x0624
        L_0x0742:
            r23 = r3
            r15 = r20
            r3 = -1
            int r10 = r5.f5115b
            int r6 = r2.getInt(r6, r10)
            r5.f5115b = r6
            goto L_0x0624
        L_0x0751:
            r23 = r3
            r15 = r20
            r3 = -1
            java.lang.String r6 = r2.getString(r6)
            r9.f5087k0 = r6
            goto L_0x0624
        L_0x075e:
            r23 = r3
            r15 = r20
            r3 = -1
            int r10 = r8.f5109c
            int r6 = r2.getInt(r6, r10)
            r8.f5109c = r6
            goto L_0x0624
        L_0x076d:
            r23 = r3
            r15 = r20
            r3 = -1
            boolean r10 = r9.f5092n0
            boolean r6 = r2.getBoolean(r6, r10)
            r9.f5092n0 = r6
            goto L_0x0624
        L_0x077c:
            r23 = r3
            r15 = r20
            r3 = -1
            java.lang.String r6 = r2.getString(r6)
            r9.f5085j0 = r6
            goto L_0x0624
        L_0x0789:
            r23 = r3
            r15 = r20
            r3 = -1
            int r10 = r9.f5080g0
            int r6 = r2.getDimensionPixelSize(r6, r10)
            r9.f5080g0 = r6
            goto L_0x0624
        L_0x0798:
            r23 = r3
            r15 = r20
            r3 = -1
            int r10 = r9.f5078f0
            int r6 = r2.getInt(r6, r10)
            r9.f5078f0 = r6
            goto L_0x0624
        L_0x07a7:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = -1
            android.util.Log.e(r0, r10)
        L_0x07b1:
            r18 = r0
        L_0x07b3:
            r0 = 1
            r3 = 0
            goto L_0x0ceb
        L_0x07b7:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 1065353216(0x3f800000, float:1.0)
            float r6 = r2.getFloat(r6, r3)
            r9.f5076e0 = r6
            goto L_0x07b1
        L_0x07c6:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 1065353216(0x3f800000, float:1.0)
            float r6 = r2.getFloat(r6, r3)
            r9.f5075d0 = r6
            goto L_0x07b1
        L_0x07d5:
            r23 = r3
            r10 = r18
            r15 = r20
            float r3 = r5.f5117d
            float r3 = r2.getFloat(r6, r3)
            r5.f5117d = r3
            goto L_0x07b1
        L_0x07e4:
            r23 = r3
            r10 = r18
            r15 = r20
            float r3 = r8.e
            float r3 = r2.getFloat(r6, r3)
            r8.e = r3
            goto L_0x07b1
        L_0x07f3:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r2.getInt(r6, r3)
            r8.getClass()
            goto L_0x0627
        L_0x0802:
            r23 = r3
            r10 = r18
            r15 = r20
            android.util.TypedValue r3 = r2.peekValue(r6)
            int r3 = r3.type
            r18 = r0
            r0 = 3
            if (r3 != r0) goto L_0x081a
            r2.getString(r6)
            r8.getClass()
            goto L_0x07b3
        L_0x081a:
            r3 = 0
            int r6 = r2.getInteger(r6, r3)
            r6 = r17[r6]
            r8.getClass()
            goto L_0x0629
        L_0x0826:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r8.f5107a
            int r0 = f(r2, r6, r0)
            r8.f5107a = r0
            goto L_0x0629
        L_0x0839:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f5044B
            float r0 = r2.getFloat(r6, r0)
            r9.f5044B = r0
            goto L_0x0629
        L_0x084c:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5043A
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5043A = r0
            goto L_0x0629
        L_0x085f:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5105z
            int r0 = f(r2, r6, r0)
            r9.f5105z = r0
            goto L_0x0629
        L_0x0872:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f5119a
            float r0 = r2.getFloat(r6, r0)
            r7.f5119a = r0
            goto L_0x0629
        L_0x0885:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5073c0
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5073c0 = r0
            goto L_0x0629
        L_0x0898:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5071b0
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5071b0 = r0
            goto L_0x0629
        L_0x08ab:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5069a0
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5069a0 = r0
            goto L_0x0629
        L_0x08be:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5067Z
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5067Z = r0
            goto L_0x0629
        L_0x08d1:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5066Y
            int r0 = r2.getInt(r6, r0)
            r9.f5066Y = r0
            goto L_0x0629
        L_0x08e4:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5065X
            int r0 = r2.getInt(r6, r0)
            r9.f5065X = r0
            goto L_0x0629
        L_0x08f7:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f5127k
            float r0 = r2.getDimension(r6, r0)
            r7.f5127k = r0
            goto L_0x0629
        L_0x090a:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f5126j
            float r0 = r2.getDimension(r6, r0)
            r7.f5126j = r0
            goto L_0x0629
        L_0x091d:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.i
            float r0 = r2.getDimension(r6, r0)
            r7.i = r0
            goto L_0x0629
        L_0x0930:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f5124g
            float r0 = r2.getDimension(r6, r0)
            r7.f5124g = r0
            goto L_0x0629
        L_0x0943:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f5123f
            float r0 = r2.getDimension(r6, r0)
            r7.f5123f = r0
            goto L_0x0629
        L_0x0956:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.e
            float r0 = r2.getFloat(r6, r0)
            r7.e = r0
            goto L_0x0629
        L_0x0969:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f5122d
            float r0 = r2.getFloat(r6, r0)
            r7.f5122d = r0
            goto L_0x0629
        L_0x097c:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f5121c
            float r0 = r2.getFloat(r6, r0)
            r7.f5121c = r0
            goto L_0x0629
        L_0x098f:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r7.f5120b
            float r0 = r2.getFloat(r6, r0)
            r7.f5120b = r0
            goto L_0x0629
        L_0x09a2:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            r0 = 1
            r7.f5128l = r0
            float r0 = r7.f5129m
            float r0 = r2.getDimension(r6, r0)
            r7.f5129m = r0
            goto L_0x0629
        L_0x09b8:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r5.f5116c
            float r0 = r2.getFloat(r6, r0)
            r5.f5116c = r0
            goto L_0x0629
        L_0x09cb:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5064W
            int r0 = r2.getInt(r6, r0)
            r9.f5064W = r0
            goto L_0x0629
        L_0x09de:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5063V
            int r0 = r2.getInt(r6, r0)
            r9.f5063V = r0
            goto L_0x0629
        L_0x09f1:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f5061T
            float r0 = r2.getFloat(r6, r0)
            r9.f5061T = r0
            goto L_0x0629
        L_0x0a04:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f5062U
            float r0 = r2.getFloat(r6, r0)
            r9.f5062U = r0
            goto L_0x0629
        L_0x0a17:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r1.f5037a
            int r0 = r2.getResourceId(r6, r0)
            r1.f5037a = r0
            goto L_0x0629
        L_0x0a2a:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f5103x
            float r0 = r2.getFloat(r6, r0)
            r9.f5103x = r0
            goto L_0x0629
        L_0x0a3d:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5088l
            int r0 = f(r2, r6, r0)
            r9.f5088l = r0
            goto L_0x0629
        L_0x0a50:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5090m
            int r0 = f(r2, r6, r0)
            r9.f5090m = r0
            goto L_0x0629
        L_0x0a63:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5050H
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5050H = r0
            goto L_0x0629
        L_0x0a76:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5099t
            int r0 = f(r2, r6, r0)
            r9.f5099t = r0
            goto L_0x0629
        L_0x0a89:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5098s
            int r0 = f(r2, r6, r0)
            r9.f5098s = r0
            goto L_0x0629
        L_0x0a9c:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5052K
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5052K = r0
            goto L_0x0629
        L_0x0aaf:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5086k
            int r0 = f(r2, r6, r0)
            r9.f5086k = r0
            goto L_0x0629
        L_0x0ac2:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5084j
            int r0 = f(r2, r6, r0)
            r9.f5084j = r0
            goto L_0x0629
        L_0x0ad5:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5049G
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5049G = r0
            goto L_0x0629
        L_0x0ae8:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5047E
            int r0 = r2.getInt(r6, r0)
            r9.f5047E = r0
            goto L_0x0629
        L_0x0afb:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.i
            int r0 = f(r2, r6, r0)
            r9.i = r0
            goto L_0x0629
        L_0x0b0e:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5081h
            int r0 = f(r2, r6, r0)
            r9.f5081h = r0
            goto L_0x0629
        L_0x0b21:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5048F
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5048F = r0
            goto L_0x0629
        L_0x0b34:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5070b
            int r0 = r2.getLayoutDimension(r6, r0)
            r9.f5070b = r0
            goto L_0x0629
        L_0x0b47:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r5.f5114a
            int r0 = r2.getInt(r6, r0)
            r5.f5114a = r0
            r0 = r16[r0]
            r5.f5114a = r0
            goto L_0x0629
        L_0x0b5e:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5072c
            int r0 = r2.getLayoutDimension(r6, r0)
            r9.f5072c = r0
            goto L_0x0629
        L_0x0b71:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f5102w
            float r0 = r2.getFloat(r6, r0)
            r9.f5102w = r0
            goto L_0x0629
        L_0x0b84:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            float r0 = r9.f5077f
            float r0 = r2.getFloat(r6, r0)
            r9.f5077f = r0
            goto L_0x0629
        L_0x0b97:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.e
            int r0 = r2.getDimensionPixelOffset(r6, r0)
            r9.e = r0
            goto L_0x0629
        L_0x0baa:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5074d
            int r0 = r2.getDimensionPixelOffset(r6, r0)
            r9.f5074d = r0
            goto L_0x0629
        L_0x0bbd:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5055N
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5055N = r0
            goto L_0x0629
        L_0x0bd0:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5059R
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5059R = r0
            goto L_0x0629
        L_0x0be3:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5056O
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5056O = r0
            goto L_0x0629
        L_0x0bf6:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5054M
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5054M = r0
            goto L_0x0629
        L_0x0c09:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5058Q
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5058Q = r0
            goto L_0x0629
        L_0x0c1c:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5057P
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5057P = r0
            goto L_0x0629
        L_0x0c2f:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5100u
            int r0 = f(r2, r6, r0)
            r9.f5100u = r0
            goto L_0x0629
        L_0x0c42:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5101v
            int r0 = f(r2, r6, r0)
            r9.f5101v = r0
            goto L_0x0629
        L_0x0c55:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5051J
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.f5051J = r0
            goto L_0x0629
        L_0x0c68:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5046D
            int r0 = r2.getDimensionPixelOffset(r6, r0)
            r9.f5046D = r0
            goto L_0x0629
        L_0x0c7b:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5045C
            int r0 = r2.getDimensionPixelOffset(r6, r0)
            r9.f5045C = r0
            goto L_0x0629
        L_0x0c8e:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            java.lang.String r0 = r2.getString(r6)
            r9.f5104y = r0
            goto L_0x0629
        L_0x0c9f:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5091n
            int r0 = f(r2, r6, r0)
            r9.f5091n = r0
            goto L_0x0629
        L_0x0cb2:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5093o
            int r0 = f(r2, r6, r0)
            r9.f5093o = r0
            goto L_0x0629
        L_0x0cc5:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.I
            int r0 = r2.getDimensionPixelSize(r6, r0)
            r9.I = r0
            goto L_0x0629
        L_0x0cd8:
            r23 = r3
            r10 = r18
            r15 = r20
            r3 = 0
            r18 = r0
            int r0 = r9.f5095p
            int r0 = f(r2, r6, r0)
            r9.f5095p = r0
            goto L_0x0629
        L_0x0ceb:
            int r12 = r12 + r0
            r3 = r23
            r20 = r15
            r0 = r18
            r18 = r10
            r10 = 1
            goto L_0x05de
        L_0x0cf7:
            java.lang.String r0 = r9.f5085j0
            if (r0 == 0) goto L_0x0cfe
            r0 = 0
            r9.f5083i0 = r0
        L_0x0cfe:
            r2.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.n.d(android.content.Context, android.util.AttributeSet, boolean):y.i");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r8 == -1) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r8.peekValue(r9)
            int r0 = r0.type
            r1 = 3
            r2 = 23
            r3 = 21
            r4 = 1
            r5 = 5
            r6 = 0
            if (r0 == r1) goto L_0x006e
            if (r0 == r5) goto L_0x002b
            int r8 = r8.getInt(r9, r6)
            r9 = -4
            r0 = -2
            if (r8 == r9) goto L_0x0029
            r9 = -3
            if (r8 == r9) goto L_0x0025
            if (r8 == r0) goto L_0x0027
            r9 = -1
            if (r8 == r9) goto L_0x0027
        L_0x0025:
            r4 = 0
            goto L_0x0030
        L_0x0027:
            r6 = r8
            goto L_0x0025
        L_0x0029:
            r6 = -2
            goto L_0x0030
        L_0x002b:
            int r8 = r8.getDimensionPixelSize(r9, r6)
            goto L_0x0027
        L_0x0030:
            boolean r8 = r7 instanceof y.e
            if (r8 == 0) goto L_0x0042
            y.e r7 = (y.e) r7
            if (r10 != 0) goto L_0x003d
            r7.width = r6
            r7.f4973W = r4
            goto L_0x006d
        L_0x003d:
            r7.height = r6
            r7.f4974X = r4
            goto L_0x006d
        L_0x0042:
            boolean r8 = r7 instanceof y.j
            if (r8 == 0) goto L_0x0054
            y.j r7 = (y.j) r7
            if (r10 != 0) goto L_0x004f
            r7.f5070b = r6
            r7.f5089l0 = r4
            goto L_0x006d
        L_0x004f:
            r7.f5072c = r6
            r7.m0 = r4
            goto L_0x006d
        L_0x0054:
            boolean r8 = r7 instanceof y.h
            if (r8 == 0) goto L_0x006d
            y.h r7 = (y.h) r7
            if (r10 != 0) goto L_0x0065
            r7.b(r2, r6)
            r8 = 80
            r7.c(r8, r4)
            goto L_0x006d
        L_0x0065:
            r7.b(r3, r6)
            r8 = 81
            r7.c(r8, r4)
        L_0x006d:
            return
        L_0x006e:
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x0076
            goto L_0x0176
        L_0x0076:
            r9 = 61
            int r9 = r8.indexOf(r9)
            int r0 = r8.length()
            if (r9 <= 0) goto L_0x0176
            int r0 = r0 - r4
            if (r9 >= r0) goto L_0x0176
            java.lang.String r0 = r8.substring(r6, r9)
            int r9 = r9 + r4
            java.lang.String r8 = r8.substring(r9)
            int r9 = r8.length()
            if (r9 <= 0) goto L_0x0176
            java.lang.String r9 = r0.trim()
            java.lang.String r8 = r8.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x00cb
            boolean r9 = r7 instanceof y.e
            if (r9 == 0) goto L_0x00b6
            y.e r7 = (y.e) r7
            if (r10 != 0) goto L_0x00af
            r7.width = r6
            goto L_0x00b1
        L_0x00af:
            r7.height = r6
        L_0x00b1:
            h(r7, r8)
            goto L_0x0176
        L_0x00b6:
            boolean r9 = r7 instanceof y.j
            if (r9 == 0) goto L_0x00c0
            y.j r7 = (y.j) r7
            r7.f5104y = r8
            goto L_0x0176
        L_0x00c0:
            boolean r9 = r7 instanceof y.h
            if (r9 == 0) goto L_0x0176
            y.h r7 = (y.h) r7
            r7.d(r8, r5)
            goto L_0x0176
        L_0x00cb:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x0119
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x0176 }
            boolean r9 = r7 instanceof y.e     // Catch:{ NumberFormatException -> 0x0176 }
            if (r9 == 0) goto L_0x00eb
            y.e r7 = (y.e) r7     // Catch:{ NumberFormatException -> 0x0176 }
            if (r10 != 0) goto L_0x00e5
            r7.width = r6     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f4959H = r8     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x00e5:
            r7.height = r6     // Catch:{ NumberFormatException -> 0x0176 }
            r7.I = r8     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x00eb:
            boolean r9 = r7 instanceof y.j     // Catch:{ NumberFormatException -> 0x0176 }
            if (r9 == 0) goto L_0x00ff
            y.j r7 = (y.j) r7     // Catch:{ NumberFormatException -> 0x0176 }
            if (r10 != 0) goto L_0x00f9
            r7.f5070b = r6     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f5062U = r8     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x00f9:
            r7.f5072c = r6     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f5061T = r8     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x00ff:
            boolean r9 = r7 instanceof y.h     // Catch:{ NumberFormatException -> 0x0176 }
            if (r9 == 0) goto L_0x0176
            y.h r7 = (y.h) r7     // Catch:{ NumberFormatException -> 0x0176 }
            if (r10 != 0) goto L_0x0110
            r7.b(r2, r6)     // Catch:{ NumberFormatException -> 0x0176 }
            r9 = 39
            r7.a(r9, r8)     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x0110:
            r7.b(r3, r6)     // Catch:{ NumberFormatException -> 0x0176 }
            r9 = 40
            r7.a(r9, r8)     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x0119:
            java.lang.String r0 = "parent"
            boolean r9 = r0.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0176
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ NumberFormatException -> 0x0176 }
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r9, r8)     // Catch:{ NumberFormatException -> 0x0176 }
            r9 = 0
            float r8 = java.lang.Math.max(r9, r8)     // Catch:{ NumberFormatException -> 0x0176 }
            boolean r9 = r7 instanceof y.e     // Catch:{ NumberFormatException -> 0x0176 }
            r0 = 2
            if (r9 == 0) goto L_0x0147
            y.e r7 = (y.e) r7     // Catch:{ NumberFormatException -> 0x0176 }
            if (r10 != 0) goto L_0x0140
            r7.width = r6     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f4968R = r8     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f4962L = r0     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x0140:
            r7.height = r6     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f4969S = r8     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f4963M = r0     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x0147:
            boolean r9 = r7 instanceof y.j     // Catch:{ NumberFormatException -> 0x0176 }
            if (r9 == 0) goto L_0x015d
            y.j r7 = (y.j) r7     // Catch:{ NumberFormatException -> 0x0176 }
            if (r10 != 0) goto L_0x0156
            r7.f5070b = r6     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f5075d0 = r8     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f5065X = r0     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x0156:
            r7.f5072c = r6     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f5076e0 = r8     // Catch:{ NumberFormatException -> 0x0176 }
            r7.f5066Y = r0     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x015d:
            boolean r8 = r7 instanceof y.h     // Catch:{ NumberFormatException -> 0x0176 }
            if (r8 == 0) goto L_0x0176
            y.h r7 = (y.h) r7     // Catch:{ NumberFormatException -> 0x0176 }
            if (r10 != 0) goto L_0x016e
            r7.b(r2, r6)     // Catch:{ NumberFormatException -> 0x0176 }
            r8 = 54
            r7.b(r8, r0)     // Catch:{ NumberFormatException -> 0x0176 }
            goto L_0x0176
        L_0x016e:
            r7.b(r3, r6)     // Catch:{ NumberFormatException -> 0x0176 }
            r8 = 55
            r7.b(r8, r0)     // Catch:{ NumberFormatException -> 0x0176 }
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            char c2 = 65535;
            int i = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    c2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    c2 = 1;
                }
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (c2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        eVar.f4958G = str;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.View, y.a, y.c] */
    /* JADX WARNING: type inference failed for: r6v4, types: [v.i, v.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0110, code lost:
        r20 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.constraintlayout.widget.ConstraintLayout r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = 1
            int r4 = r22.getChildCount()
            java.util.HashSet r5 = new java.util.HashSet
            java.util.HashMap r6 = r1.f5134c
            java.util.Set r0 = r6.keySet()
            r5.<init>(r0)
            r8 = 0
        L_0x0015:
            if (r8 >= r4) goto L_0x035a
            android.view.View r9 = r2.getChildAt(r8)
            int r0 = r9.getId()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            boolean r10 = r6.containsKey(r10)
            if (r10 != 0) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r10 = "id unknown "
            r0.<init>(r10)
            android.content.Context r10 = r9.getContext()     // Catch:{ Exception -> 0x0041 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ Exception -> 0x0041 }
            int r9 = r9.getId()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r9 = r10.getResourceEntryName(r9)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0043
        L_0x0041:
            java.lang.String r9 = "UNKNOWN"
        L_0x0043:
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "ConstraintSet"
            android.util.Log.w(r9, r0)
        L_0x004f:
            r19 = r4
            r20 = r6
        L_0x0053:
            r1 = 1
            goto L_0x034e
        L_0x0056:
            boolean r10 = r1.f5133b
            r11 = -1
            if (r10 == 0) goto L_0x0066
            if (r0 == r11) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r0.<init>(r2)
            throw r0
        L_0x0066:
            if (r0 != r11) goto L_0x0069
        L_0x0068:
            goto L_0x004f
        L_0x0069:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            boolean r10 = r6.containsKey(r10)
            if (r10 == 0) goto L_0x004f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r5.remove(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Object r10 = r6.get(r10)
            y.i r10 = (y.i) r10
            if (r10 != 0) goto L_0x0087
            goto L_0x0068
        L_0x0087:
            boolean r12 = r9 instanceof y.C0355a
            if (r12 == 0) goto L_0x00b9
            y.j r12 = r10.f5040d
            r12.f5082h0 = r3
            r13 = r9
            y.a r13 = (y.C0355a) r13
            r13.setId(r0)
            int r0 = r12.f5078f0
            r13.setType(r0)
            int r0 = r12.f5080g0
            r13.setMargin(r0)
            boolean r0 = r12.f5092n0
            r13.setAllowsGoneWidget(r0)
            int[] r0 = r12.f5083i0
            if (r0 == 0) goto L_0x00ac
            r13.setReferencedIds(r0)
            goto L_0x00b9
        L_0x00ac:
            java.lang.String r0 = r12.f5085j0
            if (r0 == 0) goto L_0x00b9
            int[] r0 = c(r13, r0)
            r12.f5083i0 = r0
            r13.setReferencedIds(r0)
        L_0x00b9:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            r12 = r0
            y.e r12 = (y.e) r12
            r12.a()
            r10.a(r12)
            java.util.HashMap r13 = r10.f5041f
            java.lang.String r14 = "\" not found on "
            java.lang.String r15 = " Custom Attribute \""
            java.lang.String r11 = "TransitionLayout"
            java.lang.Class r7 = r9.getClass()
            java.util.Set r0 = r13.keySet()
            java.util.Iterator r17 = r0.iterator()
        L_0x00da:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0294
            java.lang.Object r0 = r17.next()
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r13.get(r3)
            y.b r0 = (y.b) r0
            boolean r1 = r0.f4939a
            if (r1 != 0) goto L_0x0102
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r18 = r13
            java.lang.String r13 = "set"
            r1.<init>(r13)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x0105
        L_0x0102:
            r18 = r13
            r1 = r3
        L_0x0105:
            int r13 = r0.f4940b     // Catch:{ NoSuchMethodException -> 0x0233, IllegalAccessException -> 0x022e, InvocationTargetException -> 0x0229 }
            int r13 = t.C0339e.a(r13)     // Catch:{ NoSuchMethodException -> 0x0233, IllegalAccessException -> 0x022e, InvocationTargetException -> 0x0229 }
            switch(r13) {
                case 0: goto L_0x020a;
                case 1: goto L_0x01ea;
                case 2: goto L_0x01ca;
                case 3: goto L_0x01a5;
                case 4: goto L_0x018a;
                case 5: goto L_0x016a;
                case 6: goto L_0x0141;
                case 7: goto L_0x0114;
                default: goto L_0x010e;
            }
        L_0x010e:
            r19 = r4
        L_0x0110:
            r20 = r6
            goto L_0x0287
        L_0x0114:
            r19 = r4
            r13 = 1
            java.lang.Class[] r4 = new java.lang.Class[r13]     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            r16 = 0
            r4[r16] = r13     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            java.lang.reflect.Method r4 = r7.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            int r0 = r0.f4941c     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            r13 = 1
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            r2[r16] = r0     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            r4.invoke(r9, r2)     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            goto L_0x0110
        L_0x0132:
            r0 = move-exception
        L_0x0133:
            r20 = r6
            goto L_0x0238
        L_0x0137:
            r0 = move-exception
        L_0x0138:
            r20 = r6
            goto L_0x0252
        L_0x013c:
            r0 = move-exception
        L_0x013d:
            r20 = r6
            goto L_0x026c
        L_0x0141:
            r19 = r4
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            r13 = 0
            r4[r13] = r2     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            java.lang.reflect.Method r2 = r7.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            float r0 = r0.f4942d     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x013c, IllegalAccessException -> 0x0137, InvocationTargetException -> 0x0132 }
            r20 = r6
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r6[r13] = r0     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r2.invoke(r9, r6)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            goto L_0x0287
        L_0x0161:
            r0 = move-exception
            goto L_0x0238
        L_0x0164:
            r0 = move-exception
            goto L_0x0252
        L_0x0167:
            r0 = move-exception
            goto L_0x026c
        L_0x016a:
            r19 = r4
            r20 = r6
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r6 = 0
            r4[r6] = r2     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.reflect.Method r2 = r7.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            boolean r0 = r0.f4943f     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r4 = 1
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r13[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r2.invoke(r9, r13)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            goto L_0x0287
        L_0x018a:
            r19 = r4
            r20 = r6
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Class<java.lang.CharSequence> r6 = java.lang.CharSequence.class
            r13 = 0
            r4[r13] = r6     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.reflect.Method r4 = r7.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.String r0 = r0.e     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r6[r13] = r0     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r4.invoke(r9, r6)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            goto L_0x0287
        L_0x01a5:
            r19 = r4
            r20 = r6
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            r6 = 0
            r4[r6] = r2     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.reflect.Method r2 = r7.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r4.<init>()     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            int r0 = r0.f4944g     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r4.setColor(r0)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r6 = 0
            r0[r6] = r4     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r2.invoke(r9, r0)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            goto L_0x0287
        L_0x01ca:
            r19 = r4
            r20 = r6
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r6 = 0
            r4[r6] = r2     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.reflect.Method r2 = r7.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            int r0 = r0.f4944g     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r4 = 1
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r13[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r2.invoke(r9, r13)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            goto L_0x0287
        L_0x01ea:
            r19 = r4
            r20 = r6
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r6 = 0
            r4[r6] = r2     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.reflect.Method r2 = r7.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            float r0 = r0.f4942d     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r4 = 1
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r13[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r2.invoke(r9, r13)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            goto L_0x0287
        L_0x020a:
            r19 = r4
            r20 = r6
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r6 = 0
            r4[r6] = r2     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.reflect.Method r2 = r7.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            int r0 = r0.f4941c     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r4 = 1
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r13[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            r2.invoke(r9, r13)     // Catch:{ NoSuchMethodException -> 0x0167, IllegalAccessException -> 0x0164, InvocationTargetException -> 0x0161 }
            goto L_0x0287
        L_0x0229:
            r0 = move-exception
            r19 = r4
            goto L_0x0133
        L_0x022e:
            r0 = move-exception
            r19 = r4
            goto L_0x0138
        L_0x0233:
            r0 = move-exception
            r19 = r4
            goto L_0x013d
        L_0x0238:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r15)
            r1.append(r3)
            r1.append(r14)
            java.lang.String r2 = r7.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x0287
        L_0x0252:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r15)
            r1.append(r3)
            r1.append(r14)
            java.lang.String r2 = r7.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto L_0x0287
        L_0x026c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getName()
            r2.append(r3)
            java.lang.String r3 = " must have a method "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.e(r11, r1, r0)
        L_0x0287:
            r1 = r21
            r2 = r22
            r13 = r18
            r4 = r19
            r6 = r20
            r3 = 1
            goto L_0x00da
        L_0x0294:
            r19 = r4
            r20 = r6
            r9.setLayoutParams(r12)
            y.l r0 = r10.f5038b
            int r1 = r0.f5115b
            if (r1 != 0) goto L_0x02a6
            int r1 = r0.f5114a
            r9.setVisibility(r1)
        L_0x02a6:
            float r0 = r0.f5116c
            r9.setAlpha(r0)
            y.m r0 = r10.e
            float r1 = r0.f5119a
            r9.setRotation(r1)
            float r1 = r0.f5120b
            r9.setRotationX(r1)
            float r1 = r0.f5121c
            r9.setRotationY(r1)
            float r1 = r0.f5122d
            r9.setScaleX(r1)
            float r1 = r0.e
            r9.setScaleY(r1)
            int r1 = r0.f5125h
            r2 = -1
            if (r1 == r2) goto L_0x031a
            android.view.ViewParent r1 = r9.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f5125h
            android.view.View r1 = r1.findViewById(r2)
            if (r1 == 0) goto L_0x0334
            int r2 = r1.getTop()
            int r3 = r1.getBottom()
            int r3 = r3 + r2
            float r2 = (float) r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r4 = r1.getLeft()
            int r1 = r1.getRight()
            int r1 = r1 + r4
            float r1 = (float) r1
            float r1 = r1 / r3
            int r3 = r9.getRight()
            int r4 = r9.getLeft()
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0334
            int r3 = r9.getBottom()
            int r4 = r9.getTop()
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0334
            int r3 = r9.getLeft()
            float r3 = (float) r3
            float r1 = r1 - r3
            int r3 = r9.getTop()
            float r3 = (float) r3
            float r2 = r2 - r3
            r9.setPivotX(r1)
            r9.setPivotY(r2)
            goto L_0x0334
        L_0x031a:
            float r1 = r0.f5123f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0327
            float r1 = r0.f5123f
            r9.setPivotX(r1)
        L_0x0327:
            float r1 = r0.f5124g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0334
            float r1 = r0.f5124g
            r9.setPivotY(r1)
        L_0x0334:
            float r1 = r0.i
            r9.setTranslationX(r1)
            float r1 = r0.f5126j
            r9.setTranslationY(r1)
            float r1 = r0.f5127k
            r9.setTranslationZ(r1)
            boolean r1 = r0.f5128l
            if (r1 == 0) goto L_0x0053
            float r0 = r0.f5129m
            r9.setElevation(r0)
            goto L_0x0053
        L_0x034e:
            int r8 = r8 + r1
            r1 = r21
            r2 = r22
            r4 = r19
            r6 = r20
            r3 = 1
            goto L_0x0015
        L_0x035a:
            r19 = r4
            r20 = r6
            java.util.Iterator r0 = r5.iterator()
        L_0x0362:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x040e
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = r20
            java.lang.Object r3 = r2.get(r1)
            y.i r3 = (y.i) r3
            if (r3 != 0) goto L_0x037b
        L_0x0378:
            r20 = r2
            goto L_0x0362
        L_0x037b:
            y.j r4 = r3.f5040d
            int r5 = r4.f5082h0
            r6 = 1
            if (r5 != r6) goto L_0x03eb
            y.a r5 = new y.a
            android.content.Context r6 = r22.getContext()
            r5.<init>(r6)
            r7 = 32
            int[] r7 = new int[r7]
            r5.f4945f = r7
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r5.f4950l = r7
            r5.f4947h = r6
            v.a r6 = new v.a
            r6.<init>()
            r7 = 0
            r6.f4682s0 = r7
            r8 = 1
            r6.f4683t0 = r8
            r6.f4684u0 = r7
            r6.f4685v0 = r7
            r5.f4938o = r6
            r5.i = r6
            r5.i()
            r6 = 8
            r5.setVisibility(r6)
            int r6 = r1.intValue()
            r5.setId(r6)
            int[] r6 = r4.f5083i0
            if (r6 == 0) goto L_0x03c4
            r5.setReferencedIds(r6)
            goto L_0x03d1
        L_0x03c4:
            java.lang.String r6 = r4.f5085j0
            if (r6 == 0) goto L_0x03d1
            int[] r6 = c(r5, r6)
            r4.f5083i0 = r6
            r5.setReferencedIds(r6)
        L_0x03d1:
            int r6 = r4.f5078f0
            r5.setType(r6)
            int r6 = r4.f5080g0
            r5.setMargin(r6)
            y.e r6 = androidx.constraintlayout.widget.ConstraintLayout.g()
            r5.i()
            r3.a(r6)
            r8 = r22
            r8.addView(r5, r6)
            goto L_0x03ee
        L_0x03eb:
            r8 = r22
            r7 = 0
        L_0x03ee:
            boolean r4 = r4.f5068a
            if (r4 == 0) goto L_0x0378
            y.p r4 = new y.p
            android.content.Context r5 = r22.getContext()
            r4.<init>(r5)
            int r1 = r1.intValue()
            r4.setId(r1)
            y.e r1 = androidx.constraintlayout.widget.ConstraintLayout.g()
            r3.a(r1)
            r8.addView(r4, r1)
            goto L_0x0378
        L_0x040e:
            r8 = r22
            r7 = 0
            r1 = r19
        L_0x0413:
            if (r7 >= r1) goto L_0x0425
            android.view.View r0 = r8.getChildAt(r7)
            boolean r2 = r0 instanceof y.c
            if (r2 == 0) goto L_0x0422
            y.c r0 = (y.c) r0
            r0.e(r8)
        L_0x0422:
            r2 = 1
            int r7 = r7 + r2
            goto L_0x0413
        L_0x0425:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.n.a(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public final void b(ConstraintLayout constraintLayout) {
        HashMap hashMap;
        int i;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f5134c;
        hashMap2.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!nVar.f5133b || id != -1) {
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new i());
                }
                i iVar = (i) hashMap2.get(Integer.valueOf(id));
                if (iVar == null) {
                    i = childCount;
                    hashMap = hashMap2;
                } else {
                    HashMap hashMap3 = nVar.f5132a;
                    HashMap hashMap4 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap3.keySet()) {
                        b bVar = (b) hashMap3.get(str);
                        int i3 = childCount;
                        try {
                            if (str.equals("BackgroundColor")) {
                                hashMap = hashMap2;
                                try {
                                    hashMap4.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                    childCount = i3;
                                    hashMap2 = hashMap;
                                } catch (IllegalAccessException e3) {
                                    e = e3;
                                    Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                    childCount = i3;
                                    hashMap2 = hashMap;
                                } catch (InvocationTargetException e4) {
                                    e = e4;
                                    Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                    childCount = i3;
                                    hashMap2 = hashMap;
                                }
                            } else {
                                hashMap = hashMap2;
                                hashMap4.put(str, new b(bVar, cls.getMethod("getMap" + str, (Class[]) null).invoke(childAt, (Object[]) null)));
                            }
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            hashMap = hashMap2;
                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            childCount = i3;
                            hashMap2 = hashMap;
                        } catch (IllegalAccessException e6) {
                            e = e6;
                            hashMap = hashMap2;
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            childCount = i3;
                            hashMap2 = hashMap;
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            hashMap = hashMap2;
                            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                            childCount = i3;
                            hashMap2 = hashMap;
                        }
                        childCount = i3;
                        hashMap2 = hashMap;
                    }
                    i = childCount;
                    hashMap = hashMap2;
                    iVar.f5041f = hashMap4;
                    iVar.f5037a = id;
                    int i4 = eVar.e;
                    j jVar = iVar.f5040d;
                    jVar.f5081h = i4;
                    jVar.i = eVar.f4986f;
                    jVar.f5084j = eVar.f4988g;
                    jVar.f5086k = eVar.f4990h;
                    jVar.f5088l = eVar.i;
                    jVar.f5090m = eVar.f4993j;
                    jVar.f5091n = eVar.f4995k;
                    jVar.f5093o = eVar.f4997l;
                    jVar.f5095p = eVar.f4999m;
                    jVar.f5096q = eVar.f5000n;
                    jVar.f5097r = eVar.f5002o;
                    jVar.f5098s = eVar.f5008s;
                    jVar.f5099t = eVar.f5009t;
                    jVar.f5100u = eVar.f5010u;
                    jVar.f5101v = eVar.f5011v;
                    jVar.f5102w = eVar.f4956E;
                    jVar.f5103x = eVar.f4957F;
                    jVar.f5104y = eVar.f4958G;
                    jVar.f5105z = eVar.f5004p;
                    jVar.f5043A = eVar.f5006q;
                    jVar.f5044B = eVar.f5007r;
                    jVar.f5045C = eVar.f4970T;
                    jVar.f5046D = eVar.f4971U;
                    jVar.f5047E = eVar.f4972V;
                    jVar.f5077f = eVar.f4981c;
                    jVar.f5074d = eVar.f4977a;
                    jVar.e = eVar.f4979b;
                    jVar.f5070b = eVar.width;
                    jVar.f5072c = eVar.height;
                    jVar.f5048F = eVar.leftMargin;
                    jVar.f5049G = eVar.rightMargin;
                    jVar.f5050H = eVar.topMargin;
                    jVar.I = eVar.bottomMargin;
                    jVar.f5053L = eVar.f4955D;
                    jVar.f5061T = eVar.I;
                    jVar.f5062U = eVar.f4959H;
                    jVar.f5064W = eVar.f4961K;
                    jVar.f5063V = eVar.f4960J;
                    jVar.f5089l0 = eVar.f4973W;
                    jVar.m0 = eVar.f4974X;
                    jVar.f5065X = eVar.f4962L;
                    jVar.f5066Y = eVar.f4963M;
                    jVar.f5067Z = eVar.f4966P;
                    jVar.f5069a0 = eVar.f4967Q;
                    jVar.f5071b0 = eVar.f4964N;
                    jVar.f5073c0 = eVar.f4965O;
                    jVar.f5075d0 = eVar.f4968R;
                    jVar.f5076e0 = eVar.f4969S;
                    jVar.f5087k0 = eVar.f4975Y;
                    jVar.f5055N = eVar.f5013x;
                    jVar.f5057P = eVar.f5015z;
                    jVar.f5054M = eVar.f5012w;
                    jVar.f5056O = eVar.f5014y;
                    jVar.f5059R = eVar.f4952A;
                    jVar.f5058Q = eVar.f4953B;
                    jVar.f5060S = eVar.f4954C;
                    jVar.f5094o0 = eVar.f4976Z;
                    jVar.f5051J = eVar.getMarginEnd();
                    jVar.f5052K = eVar.getMarginStart();
                    int visibility = childAt.getVisibility();
                    l lVar = iVar.f5038b;
                    lVar.f5114a = visibility;
                    lVar.f5116c = childAt.getAlpha();
                    float rotation = childAt.getRotation();
                    m mVar = iVar.e;
                    mVar.f5119a = rotation;
                    mVar.f5120b = childAt.getRotationX();
                    mVar.f5121c = childAt.getRotationY();
                    mVar.f5122d = childAt.getScaleX();
                    mVar.e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        mVar.f5123f = pivotX;
                        mVar.f5124g = pivotY;
                    }
                    mVar.i = childAt.getTranslationX();
                    mVar.f5126j = childAt.getTranslationY();
                    mVar.f5127k = childAt.getTranslationZ();
                    if (mVar.f5128l) {
                        mVar.f5129m = childAt.getElevation();
                    }
                    if (childAt instanceof C0355a) {
                        C0355a aVar = (C0355a) childAt;
                        jVar.f5092n0 = aVar.getAllowsGoneWidget();
                        jVar.f5083i0 = aVar.getReferencedIds();
                        jVar.f5078f0 = aVar.getType();
                        jVar.f5080g0 = aVar.getMargin();
                    }
                }
                i2++;
                nVar = this;
                childCount = i;
                hashMap2 = hashMap;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f5040d.f5068a = true;
                    }
                    this.f5134c.put(Integer.valueOf(d2.f5037a), d2);
                }
            }
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (IOException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }
}
