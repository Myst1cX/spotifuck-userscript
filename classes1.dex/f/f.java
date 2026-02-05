package F;

import android.graphics.Path;
import android.util.Log;
import p0.C0320a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public char f230a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f231b;

    public f(char c2, float[] fArr) {
        this.f230a = c2;
        this.f231b = fArr;
    }

    public static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
        double d2;
        double d3;
        float f9 = f2;
        float f10 = f4;
        float f11 = f6;
        boolean z4 = z3;
        double radians = Math.toRadians((double) f8);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = (double) f9;
        double d5 = (double) f3;
        double d6 = (d5 * sin) + (d4 * cos);
        double d7 = d4;
        double d8 = (double) f11;
        double d9 = d6 / d8;
        double d10 = radians;
        double d11 = (double) f7;
        double d12 = ((d5 * cos) + (((double) (-f9)) * sin)) / d11;
        double d13 = d5;
        double d14 = (double) f5;
        double d15 = ((d14 * sin) + (((double) f10) * cos)) / d8;
        double d16 = ((d14 * cos) + (((double) (-f10)) * sin)) / d11;
        double d17 = d9 - d15;
        double d18 = d12 - d16;
        double d19 = (d9 + d15) / 2.0d;
        double d20 = (d12 + d16) / 2.0d;
        double d21 = sin;
        double d22 = (d18 * d18) + (d17 * d17);
        if (d22 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d23 = (1.0d / d22) - 0.25d;
        if (d23 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d22);
            float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
            a(path, f2, f3, f4, f5, f11 * sqrt, f7 * sqrt, f8, z2, z3);
            return;
        }
        double sqrt2 = Math.sqrt(d23);
        double d24 = d17 * sqrt2;
        double d25 = sqrt2 * d18;
        if (z2 == z4) {
            d3 = d19 - d25;
            d2 = d20 + d24;
        } else {
            d3 = d19 + d25;
            d2 = d20 - d24;
        }
        double atan2 = Math.atan2(d12 - d2, d9 - d3);
        double atan22 = Math.atan2(d16 - d2, d15 - d3) - atan2;
        int i = 0;
        int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z4 != (i2 >= 0)) {
            atan22 = i2 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d26 = d3 * d8;
        double d27 = d2 * d11;
        double d28 = (d26 * cos) - (d27 * d21);
        double d29 = (d27 * cos) + (d26 * d21);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d10);
        double sin2 = Math.sin(d10);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = -d8;
        double d31 = d30 * cos2;
        double d32 = d11 * sin2;
        double d33 = (d31 * sin3) - (d32 * cos3);
        double d34 = d30 * sin2;
        double d35 = d11 * cos2;
        double d36 = (cos3 * d35) + (sin3 * d34);
        double d37 = atan22 / ((double) ceil);
        double d38 = atan2;
        while (i < ceil) {
            double d39 = d38 + d37;
            double sin4 = Math.sin(d39);
            double cos4 = Math.cos(d39);
            double d40 = d37;
            double d41 = (((d8 * cos2) * cos4) + d28) - (d32 * sin4);
            double d42 = d28;
            double d43 = (d35 * sin4) + (d8 * sin2 * cos4) + d29;
            double d44 = (d31 * sin4) - (d32 * cos4);
            double d45 = (cos4 * d35) + (sin4 * d34);
            double d46 = d39 - d38;
            double tan = Math.tan(d46 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            double d47 = (d33 * sqrt3) + d7;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) d47, (float) ((d36 * sqrt3) + d13), (float) (d41 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d41, (float) d43);
            i++;
            d35 = d35;
            d34 = d34;
            ceil = ceil;
            cos2 = cos2;
            d38 = d39;
            d8 = d8;
            d36 = d45;
            d33 = d44;
            d7 = d41;
            d13 = d43;
            d37 = d40;
            d28 = d42;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i;
        int i2;
        int i3;
        char c2;
        int i4;
        f fVar;
        int i5;
        char c3;
        int i6;
        int i7;
        f fVar2;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        int i8;
        char c4;
        int i9;
        int i10;
        float f4;
        float f5;
        boolean z4;
        boolean z5;
        int i11;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        f[] fVarArr2 = fVarArr;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = fVarArr2.length;
        char c5 = 'm';
        int i12 = 0;
        while (i12 < length) {
            f fVar3 = fVarArr2[i12];
            char c6 = fVar3.f230a;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = fArr[4];
            float f21 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f20, f21);
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                    break;
            }
            i = 2;
            float f22 = f20;
            float f23 = f21;
            float f24 = f16;
            float f25 = f17;
            int i13 = 0;
            while (true) {
                float[] fArr2 = fVar3.f231b;
                if (i13 < fArr2.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 == 'H') {
                                float[] fArr3 = fArr2;
                                i2 = i13;
                                c2 = c6;
                                i3 = i12;
                                i4 = length;
                                fVar = fVar3;
                                path2.lineTo(fArr3[i2], f25);
                                f24 = fArr3[i2];
                            } else if (c6 == 'Q') {
                                float[] fArr4 = fArr2;
                                i8 = i13;
                                c4 = c6;
                                i9 = i12;
                                i10 = length;
                                fVar = fVar3;
                                int i14 = i8 + 1;
                                int i15 = i8 + 2;
                                int i16 = i8 + 3;
                                path2.quadTo(fArr4[i8], fArr4[i14], fArr4[i15], fArr4[i16]);
                                f4 = fArr4[i8];
                                f5 = fArr4[i14];
                                f24 = fArr4[i15];
                                f25 = fArr4[i16];
                            } else if (c6 == 'V') {
                                float[] fArr5 = fArr2;
                                i2 = i13;
                                c2 = c6;
                                i3 = i12;
                                i4 = length;
                                fVar = fVar3;
                                path2.lineTo(f24, fArr5[i2]);
                                f25 = fArr5[i2];
                            } else if (c6 != 'a') {
                                if (c6 != 'c') {
                                    if (c6 == 'h') {
                                        float[] fArr6 = fArr2;
                                        i2 = i13;
                                        float f26 = f25;
                                        path2.rLineTo(fArr6[i2], 0.0f);
                                        f24 += fArr6[i2];
                                    } else if (c6 == 'q') {
                                        float[] fArr7 = fArr2;
                                        i2 = i13;
                                        float f27 = f25;
                                        float f28 = f24;
                                        int i17 = i2 + 1;
                                        int i18 = i2 + 2;
                                        int i19 = i2 + 3;
                                        path2.rQuadTo(fArr7[i2], fArr7[i17], fArr7[i18], fArr7[i19]);
                                        float f29 = f28 + fArr7[i2];
                                        float f30 = f28 + fArr7[i18];
                                        f25 = f27 + fArr7[i19];
                                        f19 = fArr7[i17] + f27;
                                        f18 = f29;
                                        c2 = c6;
                                        i3 = i12;
                                        i4 = length;
                                        f24 = f30;
                                    } else if (c6 == 'v') {
                                        float[] fArr8 = fArr2;
                                        i2 = i13;
                                        float f31 = f24;
                                        path2.rLineTo(0.0f, fArr8[i2]);
                                        f25 += fArr8[i2];
                                    } else if (c6 != 'L') {
                                        if (c6 == 'M') {
                                            float[] fArr9 = fArr2;
                                            i2 = i13;
                                            f24 = fArr9[i2];
                                            f25 = fArr9[i2 + 1];
                                            if (i2 > 0) {
                                                path2.lineTo(f24, f25);
                                            } else {
                                                path2.moveTo(f24, f25);
                                            }
                                        } else if (c6 != 'S') {
                                            if (c6 == 'T') {
                                                float[] fArr10 = fArr2;
                                                i11 = i13;
                                                float f32 = f25;
                                                float f33 = f24;
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f6 = (f33 * 2.0f) - f18;
                                                    f7 = (f32 * 2.0f) - f19;
                                                } else {
                                                    f6 = f33;
                                                    f7 = f32;
                                                }
                                                int i20 = i11 + 1;
                                                path2.quadTo(f6, f7, fArr10[i11], fArr10[i20]);
                                                f8 = fArr10[i11];
                                                f9 = fArr10[i20];
                                            } else if (c6 == 'l') {
                                                float[] fArr11 = fArr2;
                                                i2 = i13;
                                                int i21 = i2 + 1;
                                                path2.rLineTo(fArr11[i2], fArr11[i21]);
                                                f24 += fArr11[i2];
                                                f25 += fArr11[i21];
                                            } else if (c6 == 'm') {
                                                float[] fArr12 = fArr2;
                                                i2 = i13;
                                                float f34 = fArr12[i2];
                                                f24 += f34;
                                                float f35 = fArr12[i2 + 1];
                                                f25 += f35;
                                                if (i2 > 0) {
                                                    path2.rLineTo(f34, f35);
                                                } else {
                                                    path2.rMoveTo(f34, f35);
                                                }
                                            } else if (c6 == 's') {
                                                if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                    float f36 = f24 - f18;
                                                    f13 = f25 - f19;
                                                    f12 = f36;
                                                } else {
                                                    f13 = 0.0f;
                                                    f12 = 0.0f;
                                                }
                                                float f37 = fArr2[i13];
                                                int i22 = i13 + 1;
                                                float f38 = fArr2[i22];
                                                int i23 = i13 + 2;
                                                int i24 = i13 + 3;
                                                float[] fArr13 = fArr2;
                                                i11 = i13;
                                                float f39 = f13;
                                                float f40 = f37;
                                                float f41 = f38;
                                                float f42 = f25;
                                                float f43 = f24;
                                                path.rCubicTo(f12, f39, f40, f41, fArr2[i23], fArr2[i24]);
                                                f6 = f43 + fArr13[i11];
                                                f7 = f42 + fArr13[i22];
                                                f8 = f43 + fArr13[i23];
                                                f9 = fArr13[i24] + f42;
                                            } else if (c6 != 't') {
                                                i2 = i13;
                                            } else {
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f14 = f24 - f18;
                                                    f15 = f25 - f19;
                                                } else {
                                                    f15 = 0;
                                                    f14 = 0;
                                                }
                                                int i25 = i13 + 1;
                                                path2.rQuadTo(f14, f15, fArr2[i13], fArr2[i25]);
                                                float f44 = f14 + f24;
                                                float f45 = f15 + f25;
                                                f24 += fArr2[i13];
                                                f25 += fArr2[i25];
                                                f19 = f45;
                                                i2 = i13;
                                                c2 = c6;
                                                i3 = i12;
                                                i4 = length;
                                                f18 = f44;
                                            }
                                            f19 = f7;
                                            f18 = f6;
                                            c2 = c6;
                                            i3 = i12;
                                            i4 = length;
                                            f24 = f8;
                                            f25 = f9;
                                        } else {
                                            float[] fArr14 = fArr2;
                                            i2 = i13;
                                            float f46 = f25;
                                            float f47 = f24;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f10 = (f46 * 2.0f) - f19;
                                                f11 = (f47 * 2.0f) - f18;
                                            } else {
                                                f11 = f47;
                                                f10 = f46;
                                            }
                                            int i26 = i2 + 1;
                                            int i27 = i2 + 2;
                                            int i28 = i2 + 3;
                                            path.cubicTo(f11, f10, fArr14[i2], fArr14[i26], fArr14[i27], fArr14[i28]);
                                            float f48 = fArr14[i2];
                                            float f49 = fArr14[i26];
                                            f24 = fArr14[i27];
                                            f25 = fArr14[i28];
                                            f19 = f49;
                                            f18 = f48;
                                        }
                                        f23 = f25;
                                        f22 = f24;
                                    } else {
                                        float[] fArr15 = fArr2;
                                        i2 = i13;
                                        int i29 = i2 + 1;
                                        path2.lineTo(fArr15[i2], fArr15[i29]);
                                        f24 = fArr15[i2];
                                        f25 = fArr15[i29];
                                    }
                                    c2 = c6;
                                    i3 = i12;
                                    i4 = length;
                                } else {
                                    float[] fArr16 = fArr2;
                                    i11 = i13;
                                    float f50 = f25;
                                    float f51 = f24;
                                    int i30 = i11 + 2;
                                    int i31 = i11 + 3;
                                    int i32 = i11 + 4;
                                    int i33 = i11 + 5;
                                    path.rCubicTo(fArr16[i11], fArr16[i11 + 1], fArr16[i30], fArr16[i31], fArr16[i32], fArr16[i33]);
                                    f6 = f51 + fArr16[i30];
                                    f7 = f50 + fArr16[i31];
                                    f8 = f51 + fArr16[i32];
                                    f9 = fArr16[i33] + f50;
                                    f19 = f7;
                                    f18 = f6;
                                    c2 = c6;
                                    i3 = i12;
                                    i4 = length;
                                    f24 = f8;
                                    f25 = f9;
                                }
                                fVar = fVar3;
                            } else {
                                float[] fArr17 = fArr2;
                                i5 = i13;
                                float f52 = f25;
                                float f53 = f24;
                                int i34 = i5 + 5;
                                float f54 = fArr17[i34] + f53;
                                int i35 = i5 + 6;
                                float f55 = fArr17[i35] + f52;
                                float f56 = fArr17[i5];
                                float f57 = fArr17[i5 + 1];
                                float f58 = fArr17[i5 + 2];
                                if (fArr17[i5 + 3] != 0.0f) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (fArr17[i5 + 4] != 0.0f) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                c3 = c6;
                                float f59 = f58;
                                i7 = length;
                                fVar2 = fVar3;
                                i6 = i12;
                                a(path, f53, f52, f54, f55, f56, f57, f59, z4, z5);
                                f2 = f53 + fArr17[i34];
                                f3 = f52 + fArr17[i35];
                            }
                            i13 = i2 + i;
                            f[] fVarArr3 = fVarArr;
                            fVar3 = fVar;
                            length = i4;
                            c5 = c2;
                            c6 = c5;
                            i12 = i3;
                        } else {
                            float[] fArr18 = fArr2;
                            i8 = i13;
                            c4 = c6;
                            i9 = i12;
                            i10 = length;
                            fVar = fVar3;
                            int i36 = i8 + 2;
                            int i37 = i8 + 3;
                            int i38 = i8 + 4;
                            int i39 = i8 + 5;
                            path.cubicTo(fArr18[i8], fArr18[i8 + 1], fArr18[i36], fArr18[i37], fArr18[i38], fArr18[i39]);
                            f24 = fArr18[i38];
                            f25 = fArr18[i39];
                            f4 = fArr18[i36];
                            f5 = fArr18[i37];
                        }
                        f18 = f4;
                        f19 = f5;
                        i13 = i2 + i;
                        f[] fVarArr32 = fVarArr;
                        fVar3 = fVar;
                        length = i4;
                        c5 = c2;
                        c6 = c5;
                        i12 = i3;
                    } else {
                        float[] fArr19 = fArr2;
                        i5 = i13;
                        float f60 = f25;
                        float f61 = f24;
                        c3 = c6;
                        i6 = i12;
                        i7 = length;
                        fVar2 = fVar3;
                        int i40 = i5 + 5;
                        float f62 = fArr19[i40];
                        int i41 = i5 + 6;
                        float f63 = fArr19[i41];
                        float f64 = fArr19[i5];
                        float f65 = fArr19[i5 + 1];
                        float f66 = fArr19[i5 + 2];
                        if (fArr19[i5 + 3] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (fArr19[i5 + 4] != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        a(path, f61, f60, f62, f63, f64, f65, f66, z2, z3);
                        f2 = fArr19[i40];
                        f3 = fArr19[i41];
                    }
                    f19 = f25;
                    f18 = f24;
                    i13 = i2 + i;
                    f[] fVarArr322 = fVarArr;
                    fVar3 = fVar;
                    length = i4;
                    c5 = c2;
                    c6 = c5;
                    i12 = i3;
                } else {
                    fArr[0] = f24;
                    fArr[1] = f25;
                    fArr[2] = f18;
                    fArr[3] = f19;
                    fArr[4] = f22;
                    fArr[5] = f23;
                    c5 = fVar3.f230a;
                    i12++;
                    fVarArr2 = fVarArr;
                    length = length;
                }
            }
        }
    }

    public f(f fVar) {
        this.f230a = fVar.f230a;
        float[] fArr = fVar.f231b;
        this.f231b = C0320a.p(fArr, fArr.length);
    }
}
