package android.support.v4.media.session;

import A.k;
import E.r;
import K0.e;
import N.Q;
import R0.o;
import S.g;
import Z0.c;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.d;
import androidx.emoji2.text.v;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.media.session.MediaButtonReceiver;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0084a;
import b0.b;
import it.deviato.spotifuck.WebService;
import j0.B;
import j0.C0141c;
import j0.a0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLSocket;
import o.C0264T;
import o.C0302s;
import p0.C0320a;
import v.C0347d;
import v.C0348e;
import w.C0351b;
import y.f;

public final class t implements g {
    public static int e;

    /* renamed from: f  reason: collision with root package name */
    public static t f1129f;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1130a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1131b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1132c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1133d;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i) {
        this.f1130a = i;
        this.f1131b = obj;
        this.f1132c = obj2;
        this.f1133d = obj3;
    }

    public static Bundle G(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        j(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public Object d() {
        return null;
    }

    public int s(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((B) this.f1131b).f3263a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0141c cVar = (C0141c) this.f1132c;
            int b2 = i - (i2 - cVar.b(i2));
            if (b2 == 0) {
                while (cVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r6 >= r7) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean v(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.u r13) {
        /*
            r9 = this;
            r0 = 1
            int r1 = r13.f1549c
            r1 = r1 & 3
            r2 = 2
            r3 = 0
            if (r1 != 0) goto L_0x0110
            java.lang.Object r1 = r9.f1133d
            androidx.emoji2.text.d r1 = (androidx.emoji2.text.d) r1
            W.a r4 = r13.c()
            r5 = 8
            int r5 = r4.a(r5)
            if (r5 == 0) goto L_0x0025
            java.lang.Object r6 = r4.f500d
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r4 = r4.f497a
            int r5 = r5 + r4
            short r4 = r6.getShort(r5)
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            r1.getClass()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 >= r6) goto L_0x0034
            if (r4 <= r5) goto L_0x0034
        L_0x0031:
            r10 = 0
            goto L_0x0103
        L_0x0034:
            java.lang.ThreadLocal r4 = androidx.emoji2.text.d.f1504b
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L_0x0044
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4.set(r5)
        L_0x0044:
            java.lang.Object r4 = r4.get()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.setLength(r3)
        L_0x004d:
            if (r11 >= r12) goto L_0x0058
            char r5 = r10.charAt(r11)
            r4.append(r5)
            int r11 = r11 + r0
            goto L_0x004d
        L_0x0058:
            android.text.TextPaint r10 = r1.f1505a
            java.lang.String r11 = r4.toString()
            java.lang.ThreadLocal r12 = F.e.f229a
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r6) goto L_0x006a
            boolean r10 = F.d.a(r10, r11)
            goto L_0x0103
        L_0x006a:
            int r12 = r11.length()
            if (r12 != r0) goto L_0x007d
            char r1 = r11.charAt(r3)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 == 0) goto L_0x007d
        L_0x007a:
            r10 = 1
            goto L_0x0103
        L_0x007d:
            java.lang.String r1 = "󟿽"
            float r4 = r10.measureText(r1)
            java.lang.String r5 = "m"
            float r5 = r10.measureText(r5)
            float r6 = r10.measureText(r11)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x0093
            goto L_0x0031
        L_0x0093:
            int r8 = r11.length()
            int r8 = r11.codePointCount(r3, r8)
            if (r8 <= r0) goto L_0x00bf
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r8
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a6
            goto L_0x0031
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            if (r5 >= r12) goto L_0x00b9
            int r8 = r11.codePointAt(r5)
            int r8 = java.lang.Character.charCount(r8)
            int r8 = r8 + r5
            float r5 = r10.measureText(r11, r5, r8)
            float r7 = r7 + r5
            r5 = r8
            goto L_0x00a7
        L_0x00b9:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x00bf
            goto L_0x0031
        L_0x00bf:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00c4
            goto L_0x007a
        L_0x00c4:
            java.lang.ThreadLocal r4 = F.e.f229a
            java.lang.Object r5 = r4.get()
            M.b r5 = (M.b) r5
            if (r5 != 0) goto L_0x00e1
            M.b r5 = new M.b
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.<init>(r6, r7)
            r4.set(r5)
            goto L_0x00ef
        L_0x00e1:
            java.lang.Object r4 = r5.f479a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
            java.lang.Object r4 = r5.f480b
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
        L_0x00ef:
            java.lang.Object r4 = r5.f479a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r10.getTextBounds(r1, r3, r2, r4)
            java.lang.Object r1 = r5.f480b
            r5 = r1
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            r10.getTextBounds(r11, r3, r12, r5)
            boolean r10 = r4.equals(r1)
            r10 = r10 ^ r0
        L_0x0103:
            int r11 = r13.f1549c
            r11 = r11 & 4
            if (r10 == 0) goto L_0x010c
            r10 = r11 | 2
            goto L_0x010e
        L_0x010c:
            r10 = r11 | 1
        L_0x010e:
            r13.f1549c = r10
        L_0x0110:
            int r10 = r13.f1549c
            r10 = r10 & 3
            if (r10 != r2) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.t.v(java.lang.CharSequence, int, int, androidx.emoji2.text.u):boolean");
    }

    public t(P p2, O o2, b bVar) {
        this.f1130a = 4;
        c.e("store", p2);
        c.e("defaultCreationExtras", bVar);
        this.f1131b = p2;
        this.f1132c = o2;
        this.f1133d = bVar;
    }

    public static t A(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new t(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static void j(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(t.class.getClassLoader());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object B(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, androidx.emoji2.text.n r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            androidx.emoji2.text.o r5 = new androidx.emoji2.text.o
            java.lang.Object r6 = r0.f1132c
            A.k r6 = (A.k) r6
            java.lang.Object r6 = r6.f23h
            androidx.emoji2.text.r r6 = (androidx.emoji2.text.r) r6
            r5.<init>(r6)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 1
            r8 = 0
            r8 = r18
            r9 = r6
            r10 = 0
            r11 = 1
            r6 = r8
        L_0x0023:
            r12 = 2
            if (r6 >= r2) goto L_0x00ce
            if (r10 >= r3) goto L_0x00ce
            if (r11 == 0) goto L_0x00ce
            androidx.emoji2.text.r r13 = r5.f1529c
            android.util.SparseArray r13 = r13.f1540a
            if (r13 != 0) goto L_0x0032
            r13 = 0
            goto L_0x0038
        L_0x0032:
            java.lang.Object r13 = r13.get(r9)
            androidx.emoji2.text.r r13 = (androidx.emoji2.text.r) r13
        L_0x0038:
            int r14 = r5.f1527a
            r15 = 3
            if (r14 == r12) goto L_0x004c
            if (r13 != 0) goto L_0x0044
            r5.a()
        L_0x0042:
            r13 = 1
            goto L_0x008c
        L_0x0044:
            r5.f1527a = r12
            r5.f1529c = r13
            r5.f1531f = r7
        L_0x004a:
            r13 = 2
            goto L_0x008c
        L_0x004c:
            if (r13 == 0) goto L_0x0056
            r5.f1529c = r13
            int r13 = r5.f1531f
            int r13 = r13 + r7
            r5.f1531f = r13
            goto L_0x004a
        L_0x0056:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L_0x005f
            r5.a()
            goto L_0x0042
        L_0x005f:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L_0x0065
            goto L_0x004a
        L_0x0065:
            androidx.emoji2.text.r r13 = r5.f1529c
            androidx.emoji2.text.u r14 = r13.f1541b
            if (r14 == 0) goto L_0x0088
            int r14 = r5.f1531f
            if (r14 != r7) goto L_0x0082
            boolean r13 = r5.b()
            if (r13 == 0) goto L_0x007e
            androidx.emoji2.text.r r13 = r5.f1529c
            r5.f1530d = r13
            r5.a()
        L_0x007c:
            r13 = 3
            goto L_0x008c
        L_0x007e:
            r5.a()
            goto L_0x0042
        L_0x0082:
            r5.f1530d = r13
            r5.a()
            goto L_0x007c
        L_0x0088:
            r5.a()
            goto L_0x0042
        L_0x008c:
            r5.e = r9
            if (r13 == r7) goto L_0x00bd
            if (r13 == r12) goto L_0x00ae
            if (r13 == r15) goto L_0x0095
            goto L_0x0023
        L_0x0095:
            if (r21 != 0) goto L_0x00a1
            androidx.emoji2.text.r r12 = r5.f1530d
            androidx.emoji2.text.u r12 = r12.f1541b
            boolean r12 = r0.v(r1, r8, r6, r12)
            if (r12 != 0) goto L_0x00ab
        L_0x00a1:
            androidx.emoji2.text.r r11 = r5.f1530d
            androidx.emoji2.text.u r11 = r11.f1541b
            boolean r11 = r4.c(r1, r8, r6, r11)
            int r10 = r10 + 1
        L_0x00ab:
            r8 = r6
            goto L_0x0023
        L_0x00ae:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto L_0x00ba
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        L_0x00ba:
            r6 = r12
            goto L_0x0023
        L_0x00bd:
            int r6 = java.lang.Character.codePointAt(r1, r8)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r8
            if (r6 >= r2) goto L_0x00ab
            int r8 = java.lang.Character.codePointAt(r1, r6)
            r9 = r8
            goto L_0x00ab
        L_0x00ce:
            int r2 = r5.f1527a
            if (r2 != r12) goto L_0x00f9
            androidx.emoji2.text.r r2 = r5.f1529c
            androidx.emoji2.text.u r2 = r2.f1541b
            if (r2 == 0) goto L_0x00f9
            int r2 = r5.f1531f
            if (r2 > r7) goto L_0x00e2
            boolean r2 = r5.b()
            if (r2 == 0) goto L_0x00f9
        L_0x00e2:
            if (r10 >= r3) goto L_0x00f9
            if (r11 == 0) goto L_0x00f9
            if (r21 != 0) goto L_0x00f2
            androidx.emoji2.text.r r2 = r5.f1529c
            androidx.emoji2.text.u r2 = r2.f1541b
            boolean r2 = r0.v(r1, r8, r6, r2)
            if (r2 != 0) goto L_0x00f9
        L_0x00f2:
            androidx.emoji2.text.r r2 = r5.f1529c
            androidx.emoji2.text.u r2 = r2.f1541b
            r4.c(r1, r8, r6, r2)
        L_0x00f9:
            java.lang.Object r1 = r22.h()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.t.B(java.lang.CharSequence, int, int, int, boolean, androidx.emoji2.text.n):java.lang.Object");
    }

    public void C() {
        ((TypedArray) this.f1132c).recycle();
    }

    public void D(PlaybackStateCompat playbackStateCompat) {
        o oVar = (o) this.f1131b;
        oVar.f1125f = playbackStateCompat;
        synchronized (oVar.f1124d) {
            for (int beginBroadcast = oVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) oVar.e.getBroadcastItem(beginBroadcast)).G(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            oVar.e.finishBroadcast();
        }
        MediaSession mediaSession = oVar.f1121a;
        if (playbackStateCompat.f1105l == null) {
            PlaybackState.Builder d2 = u.d();
            u.x(d2, playbackStateCompat.f1096a, playbackStateCompat.f1097b, playbackStateCompat.f1099d, playbackStateCompat.f1102h);
            u.u(d2, playbackStateCompat.f1098c);
            u.s(d2, playbackStateCompat.e);
            u.v(d2, playbackStateCompat.f1101g);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.i) {
                PlaybackState.CustomAction customAction2 = customAction.e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e2 = u.e(customAction.f1106a, customAction.f1107b, customAction.f1108c);
                    u.w(e2, customAction.f1109d);
                    customAction2 = u.b(e2);
                }
                u.a(d2, customAction2);
            }
            u.t(d2, playbackStateCompat.f1103j);
            if (Build.VERSION.SDK_INT >= 22) {
                v.b(d2, playbackStateCompat.f1104k);
            }
            playbackStateCompat.f1105l = u.c(d2);
        }
        mediaSession.setPlaybackState(playbackStateCompat.f1105l);
    }

    public void F(View view) {
        if (((ArrayList) this.f1133d).remove(view)) {
            B b2 = (B) this.f1131b;
            a0 I = RecyclerView.I(view);
            if (I != null) {
                int i = I.f3351p;
                RecyclerView recyclerView = b2.f3263a;
                if (recyclerView.L()) {
                    I.f3352q = i;
                    recyclerView.f2041w0.add(I);
                } else {
                    WeakHashMap weakHashMap = Q.f509a;
                    I.f3338a.setImportantForAccessibility(i);
                }
                I.f3351p = 0;
            }
        }
    }

    public void H(C0348e eVar) {
        ArrayList arrayList = (ArrayList) this.f1133d;
        arrayList.clear();
        int size = eVar.f4782q0.size();
        for (int i = 0; i < size; i++) {
            C0347d dVar = (C0347d) eVar.f4782q0.get(i);
            int[] iArr = dVar.f4761p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f4784s0.f4865b = true;
    }

    public ClipDescription a() {
        return (ClipDescription) this.f1132c;
    }

    public void b() {
    }

    public Uri c() {
        return (Uri) this.f1133d;
    }

    public Uri e() {
        return (Uri) this.f1131b;
    }

    public void f(View view, int i, boolean z2) {
        int i2;
        RecyclerView recyclerView = ((B) this.f1131b).f3263a;
        if (i < 0) {
            i2 = recyclerView.getChildCount();
        } else {
            i2 = s(i);
        }
        ((C0141c) this.f1132c).e(i2, z2);
        if (z2) {
            w(view);
        }
        recyclerView.addView(view, i2);
        RecyclerView.I(view);
    }

    public void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int i2;
        RecyclerView recyclerView = ((B) this.f1131b).f3263a;
        if (i < 0) {
            i2 = recyclerView.getChildCount();
        } else {
            i2 = s(i);
        }
        ((C0141c) this.f1132c).e(i2, z2);
        if (z2) {
            w(view);
        }
        a0 I = RecyclerView.I(view);
        if (I != null) {
            if (I.k() || I.p()) {
                I.f3345j &= -257;
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I + recyclerView.y());
            }
        }
        recyclerView.attachViewToParent(view, i2, layoutParams);
    }

    public M k(String str, Class cls) {
        M m2;
        c.e("key", str);
        P p2 = (P) this.f1131b;
        p2.getClass();
        LinkedHashMap linkedHashMap = p2.f1817a;
        M m3 = (M) linkedHashMap.get(str);
        boolean isInstance = cls.isInstance(m3);
        O o2 = (O) this.f1132c;
        if (isInstance) {
            if (o2 instanceof L) {
                L l2 = (L) o2;
            }
            c.c("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", m3);
            return m3;
        }
        b0.c cVar = new b0.c((b) this.f1133d);
        cVar.f2076a.put(N.f1816b, str);
        try {
            m2 = o2.e(cls, cVar);
        } catch (AbstractMethodError unused) {
            m2 = o2.g(cls);
        }
        c.e("viewModel", m2);
        M m4 = (M) linkedHashMap.put(str, m2);
        if (m4 != null) {
            m4.b();
        }
        return m2;
    }

    public int m() {
        return ((B) this.f1131b).f3263a.getChildCount() - ((ArrayList) this.f1133d).size();
    }

    public ColorStateList n(int i) {
        int resourceId;
        ColorStateList I;
        TypedArray typedArray = (TypedArray) this.f1132c;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (I = C0320a.I((Context) this.f1131b, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return I;
    }

    public Drawable o(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f1132c;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return typedArray.getDrawable(i);
        }
        return T0.g.n((Context) this.f1131b, resourceId);
    }

    public Drawable p(int i) {
        int resourceId;
        Drawable g2;
        if (!((TypedArray) this.f1132c).hasValue(i) || (resourceId = ((TypedArray) this.f1132c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0302s a2 = C0302s.a();
        Context context = (Context) this.f1131b;
        synchronized (a2) {
            g2 = a2.f4296a.g(context, resourceId, true);
        }
        return g2;
    }

    public Typeface q(int i, int i2, C0264T t2) {
        int resourceId = ((TypedArray) this.f1132c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f1133d) == null) {
            this.f1133d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f1133d;
        ThreadLocal threadLocal = r.f121a;
        Context context = (Context) this.f1131b;
        if (context.isRestricted()) {
            return null;
        }
        return r.c(context, resourceId, typedValue, i2, t2, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Method r(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1132c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.f1133d
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0019 }
            int r0 = r4.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0017 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x001b
        L_0x0015:
            r4 = r2
            goto L_0x001b
        L_0x0017:
            goto L_0x001b
        L_0x0019:
            goto L_0x0015
        L_0x001b:
            if (r4 == 0) goto L_0x002e
            java.lang.Object r0 = r3.f1131b
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L_0x002e
            java.lang.Class r1 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = r4
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.t.r(java.lang.Class):java.lang.reflect.Method");
    }

    public View t(int i) {
        return ((B) this.f1131b).f3263a.getChildAt(i);
    }

    public String toString() {
        switch (this.f1130a) {
            case 7:
                return ((C0141c) this.f1132c).toString() + ", hidden list:" + ((ArrayList) this.f1133d).size();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((B) this.f1131b).f3263a.getChildCount();
    }

    public void w(View view) {
        ((ArrayList) this.f1133d).add(view);
        B b2 = (B) this.f1131b;
        a0 I = RecyclerView.I(view);
        if (I != null) {
            int i = I.f3352q;
            View view2 = I.f3338a;
            if (i != -1) {
                I.f3351p = i;
            } else {
                WeakHashMap weakHashMap = Q.f509a;
                I.f3351p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = b2.f3263a;
            if (recyclerView.L()) {
                I.f3352q = 4;
                recyclerView.f2041w0.add(I);
                return;
            }
            WeakHashMap weakHashMap2 = Q.f509a;
            view2.setImportantForAccessibility(4);
        }
    }

    public boolean z(int i, C0347d dVar, f fVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int[] iArr = dVar.f4761p0;
        int i2 = iArr[0];
        C0351b bVar = (C0351b) this.f1131b;
        bVar.f4854a = i2;
        bVar.f4855b = iArr[1];
        bVar.f4856c = dVar.q();
        bVar.f4857d = dVar.k();
        bVar.i = false;
        bVar.f4861j = i;
        if (bVar.f4854a == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar.f4855b == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || dVar.f4729W <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z3 || dVar.f4729W <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        int[] iArr2 = dVar.f4765t;
        if (z4 && iArr2[0] == 4) {
            bVar.f4854a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            bVar.f4855b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.e);
        dVar.L(bVar.f4858f);
        dVar.f4712E = bVar.f4860h;
        dVar.I(bVar.f4859g);
        bVar.f4861j = 0;
        return bVar.i;
    }

    public static boolean h(Editable editable, KeyEvent keyEvent, boolean z2) {
        v[] vVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) == null || vVarArr.length <= 0)) {
            int length = vVarArr.length;
            int i = 0;
            while (i < length) {
                v vVar = vVarArr[i];
                int spanStart = editable.getSpanStart(vVar);
                int spanEnd = editable.getSpanEnd(vVar);
                if ((!z2 || spanStart != selectionStart) && ((z2 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public void E(C0348e eVar, int i, int i2, int i3) {
        eVar.getClass();
        int i4 = eVar.f4736b0;
        int i5 = eVar.f4738c0;
        eVar.f4736b0 = 0;
        eVar.f4738c0 = 0;
        eVar.O(i2);
        eVar.L(i3);
        if (i4 < 0) {
            eVar.f4736b0 = 0;
        } else {
            eVar.f4736b0 = i4;
        }
        if (i5 < 0) {
            eVar.f4738c0 = 0;
        } else {
            eVar.f4738c0 = i5;
        }
        C0348e eVar2 = (C0348e) this.f1132c;
        eVar2.f4785t0 = i;
        eVar2.U();
    }

    public void i(int i) {
        a0 I;
        int s2 = s(i);
        ((C0141c) this.f1132c).f(s2);
        RecyclerView recyclerView = ((B) this.f1131b).f3263a;
        View childAt = recyclerView.getChildAt(s2);
        if (!(childAt == null || (I = RecyclerView.I(childAt)) == null)) {
            if (!I.k() || I.p()) {
                I.a(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + I + recyclerView.y());
            }
        }
        recyclerView.detachViewFromParent(s2);
    }

    public View l(int i) {
        return ((B) this.f1131b).f3263a.getChildAt(s(i));
    }

    public Object x(SSLSocket sSLSocket, Object... objArr) {
        Method r2 = r(sSLSocket.getClass());
        if (r2 != null) {
            try {
                return r2.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e2) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + r2);
                assertionError.initCause(e2);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + ((String) this.f1132c) + " not supported for object " + sSLSocket);
        }
    }

    public void y(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method r2 = r(sSLSocket.getClass());
            if (r2 != null) {
                try {
                    r2.invoke(sSLSocket, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public t(B b2) {
        this.f1130a = 7;
        this.f1131b = b2;
        this.f1132c = new C0141c();
        this.f1133d = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t(P p2, O o2) {
        this(p2, o2, C0084a.f2075b);
        this.f1130a = 4;
        c.e("store", p2);
    }

    public t(Runnable runnable) {
        this.f1130a = 1;
        this.f1132c = new CopyOnWriteArrayList();
        this.f1133d = new HashMap();
        this.f1131b = runnable;
    }

    public t(Context context, TypedArray typedArray) {
        this.f1130a = 8;
        this.f1131b = context;
        this.f1132c = typedArray;
    }

    public t(Context context, LocationManager locationManager) {
        this.f1130a = 6;
        this.f1133d = new Object();
        this.f1131b = context;
        this.f1132c = locationManager;
    }

    public t(C0348e eVar) {
        this.f1130a = 12;
        this.f1133d = new ArrayList();
        this.f1131b = new Object();
        this.f1132c = eVar;
    }

    public t(k kVar, e eVar, d dVar, Set set) {
        this.f1130a = 3;
        this.f1131b = eVar;
        this.f1132c = kVar;
        this.f1133d = dVar;
        if (!set.isEmpty()) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                int[] iArr = (int[]) it2.next();
                String str = new String(iArr, 0, iArr.length);
                B(str, 0, str.length(), 1, true, new A.b(16, (Object) str));
            }
        }
    }

    public t(WebService webService, String str) {
        PendingIntent pendingIntent;
        this.f1130a = 0;
        this.f1133d = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            ComponentName b2 = MediaButtonReceiver.b(webService);
            if (b2 == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (b2 != null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(b2);
                pendingIntent = PendingIntent.getBroadcast(webService, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            } else {
                pendingIntent = null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.f1131b = new o(webService, str);
            } else if (i >= 28) {
                this.f1131b = new o(webService, str);
            } else if (i >= 22) {
                this.f1131b = new o(webService, str);
            } else {
                this.f1131b = new o(webService, str);
            }
            ((o) this.f1131b).e(new o(1), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            ((o) this.f1131b).f1121a.setMediaButtonReceiver(pendingIntent);
            this.f1132c = new A.b(webService, ((o) this.f1131b).f1123c);
            if (e == 0) {
                e = (int) (TypedValue.applyDimension(1, 320.0f, webService.getResources().getDisplayMetrics()) + 0.5f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public t(int i) {
        this.f1130a = i;
        switch (i) {
            case 11:
                return;
            default:
                this.f1132c = null;
                return;
        }
    }
}
