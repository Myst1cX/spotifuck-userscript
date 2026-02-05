package g0;

import N0.B;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class v {
    public static final Class[] e = {Context.class, AttributeSet.class};

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f2600f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2601a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2602b = new Object[2];

    /* renamed from: c  reason: collision with root package name */
    public final w f2603c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f2604d;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r0 = new android.view.InflateException(r14.getPositionDescription() + ": Error inflating class " + r12);
        r0.initCause(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        throw r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[ExcHandler: Exception (r13v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.Preference a(java.lang.String r12, java.lang.String[] r13, android.util.AttributeSet r14) {
        /*
            r11 = this;
            java.util.HashMap r0 = f2600f
            java.lang.Object r1 = r0.get(r12)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r2 = ": Error inflating class "
            r3 = 1
            if (r1 != 0) goto L_0x006f
            android.content.Context r1 = r11.f2601a     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r4 = 0
            if (r13 == 0) goto L_0x005f
            int r5 = r13.length     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            if (r5 != 0) goto L_0x001a
            goto L_0x005f
        L_0x001a:
            int r5 = r13.length     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r6 = 0
            r8 = r6
            r7 = 0
        L_0x001e:
            if (r7 >= r5) goto L_0x003e
            r9 = r13[r7]     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            r10.append(r9)     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            r10.append(r12)     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            java.lang.String r9 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            java.lang.Class r6 = java.lang.Class.forName(r9, r4, r1)     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            goto L_0x003e
        L_0x0036:
            r13 = move-exception
            goto L_0x007a
        L_0x0038:
            r8 = move-exception
            int r7 = r7 + 1
            goto L_0x001e
        L_0x003c:
            r12 = move-exception
            goto L_0x0099
        L_0x003e:
            if (r6 != 0) goto L_0x0063
            if (r8 != 0) goto L_0x005e
            android.view.InflateException r13 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.String r1 = r14.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r0.append(r1)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r0.append(r12)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r13.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            throw r13     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
        L_0x005e:
            throw r8     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
        L_0x005f:
            java.lang.Class r6 = java.lang.Class.forName(r12, r4, r1)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
        L_0x0063:
            java.lang.Class[] r13 = e     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.reflect.Constructor r1 = r6.getConstructor(r13)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r1.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r0.put(r12, r1)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
        L_0x006f:
            java.lang.Object[] r13 = r11.f2602b     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r13[r3] = r14     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.Object r13 = r1.newInstance(r13)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            androidx.preference.Preference r13 = (androidx.preference.Preference) r13     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            return r13
        L_0x007a:
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r14 = r14.getPositionDescription()
            r1.append(r14)
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            r0.initCause(r13)
            throw r0
        L_0x0099:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.v.a(java.lang.String, java.lang.String[], android.util.AttributeSet):androidx.preference.Preference");
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return a(str, this.f2604d, attributeSet);
            }
            return a(str, (String[]) null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[SYNTHETIC, Splitter:B:18:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.PreferenceGroup c(android.content.res.XmlResourceParser r6) {
        /*
            r5 = this;
            java.lang.Object[] r0 = r5.f2602b
            monitor-enter(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ all -> 0x002e }
            java.lang.Object[] r2 = r5.f2602b     // Catch:{ all -> 0x002e }
            android.content.Context r3 = r5.f2601a     // Catch:{ all -> 0x002e }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x002e }
        L_0x000e:
            int r2 = r6.next()     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            r3 = 2
            if (r2 == r3) goto L_0x0018
            r4 = 1
            if (r2 != r4) goto L_0x000e
        L_0x0018:
            if (r2 != r3) goto L_0x0036
            java.lang.String r2 = r6.getName()     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            androidx.preference.Preference r2 = r5.b(r2, r1)     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            g0.w r3 = r5.f2603c     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            r2.j(r3)     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            r5.d(r6, r2, r1)     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r2
        L_0x002e:
            r6 = move-exception
            goto L_0x0084
        L_0x0030:
            r1 = move-exception
            goto L_0x0051
        L_0x0032:
            r6 = move-exception
            goto L_0x0076
        L_0x0034:
            r6 = move-exception
            goto L_0x0083
        L_0x0036:
            android.view.InflateException r1 = new android.view.InflateException     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            r2.<init>()     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            java.lang.String r3 = r6.getPositionDescription()     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            r2.append(r3)     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            java.lang.String r3 = ": No start tag found!"
            r2.append(r3)     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            java.lang.String r2 = r2.toString()     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            r1.<init>(r2)     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
            throw r1     // Catch:{ InflateException -> 0x0034, XmlPullParserException -> 0x0032, IOException -> 0x0030 }
        L_0x0051:
            android.view.InflateException r2 = new android.view.InflateException     // Catch:{ all -> 0x002e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
            r3.<init>()     // Catch:{ all -> 0x002e }
            java.lang.String r6 = r6.getPositionDescription()     // Catch:{ all -> 0x002e }
            r3.append(r6)     // Catch:{ all -> 0x002e }
            java.lang.String r6 = ": "
            r3.append(r6)     // Catch:{ all -> 0x002e }
            java.lang.String r6 = r1.getMessage()     // Catch:{ all -> 0x002e }
            r3.append(r6)     // Catch:{ all -> 0x002e }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x002e }
            r2.<init>(r6)     // Catch:{ all -> 0x002e }
            r2.initCause(r1)     // Catch:{ all -> 0x002e }
            throw r2     // Catch:{ all -> 0x002e }
        L_0x0076:
            android.view.InflateException r1 = new android.view.InflateException     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r6.getMessage()     // Catch:{ all -> 0x002e }
            r1.<init>(r2)     // Catch:{ all -> 0x002e }
            r1.initCause(r6)     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0083:
            throw r6     // Catch:{ all -> 0x002e }
        L_0x0084:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.v.c(android.content.res.XmlResourceParser):androidx.preference.PreferenceGroup");
    }

    public v(Context context, w wVar) {
        this.f2601a = context;
        this.f2603c = wVar;
        this.f2604d = new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
    }

    /* JADX INFO: finally extract failed */
    public final void d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) {
        long j2;
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f1907l = Intent.parseIntent(this.f2601a.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f2601a.getResources();
                    if (preference.f1909n == null) {
                        preference.f1909n = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f1909n);
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b2 = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.f1923N.contains(b2)) {
                        if (b2.f1906k != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.f1894H;
                                if (preferenceGroup3 == null) {
                                    break;
                                }
                                preferenceGroup2 = preferenceGroup3;
                            }
                            String str = b2.f1906k;
                            if (preferenceGroup2.w(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        int i = b2.f1902f;
                        if (i == Integer.MAX_VALUE) {
                            if (preferenceGroup.f1924O) {
                                int i2 = preferenceGroup.f1925P;
                                preferenceGroup.f1925P = i2 + 1;
                                if (i2 != i) {
                                    b2.f1902f = i2;
                                    u uVar = b2.f1892F;
                                    if (uVar != null) {
                                        Handler handler = uVar.f2598g;
                                        B b3 = uVar.f2599h;
                                        handler.removeCallbacks(b3);
                                        handler.post(b3);
                                    }
                                }
                            }
                            if (b2 instanceof PreferenceGroup) {
                                ((PreferenceGroup) b2).f1924O = preferenceGroup.f1924O;
                            }
                        }
                        int binarySearch = Collections.binarySearch(preferenceGroup.f1923N, b2);
                        if (binarySearch < 0) {
                            binarySearch = (binarySearch * -1) - 1;
                        }
                        boolean u2 = preferenceGroup.u();
                        if (b2.f1916u == u2) {
                            b2.f1916u = !u2;
                            b2.h(b2.u());
                            b2.g();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.f1923N.add(binarySearch, b2);
                        }
                        w wVar = preferenceGroup.f1899b;
                        String str2 = b2.f1906k;
                        if (str2 == null || !preferenceGroup.f1922M.containsKey(str2)) {
                            j2 = wVar.b();
                        } else {
                            j2 = ((Long) preferenceGroup.f1922M.getOrDefault(str2, (Object) null)).longValue();
                            preferenceGroup.f1922M.remove(str2);
                        }
                        b2.f1900c = j2;
                        b2.f1901d = true;
                        try {
                            b2.j(wVar);
                            b2.f1901d = false;
                            if (b2.f1894H == null) {
                                b2.f1894H = preferenceGroup;
                                if (preferenceGroup.f1926Q) {
                                    b2.i();
                                }
                                u uVar2 = preferenceGroup.f1892F;
                                if (uVar2 != null) {
                                    Handler handler2 = uVar2.f2598g;
                                    B b4 = uVar2.f2599h;
                                    handler2.removeCallbacks(b4);
                                    handler2.post(b4);
                                }
                            } else {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                        } catch (Throwable th) {
                            b2.f1901d = false;
                            throw th;
                        }
                    }
                    d(xmlResourceParser, b2, attributeSet);
                }
            }
        }
        while (true) {
        }
    }
}
