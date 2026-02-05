package it.deviato.spotifuck;

import Q0.E;
import Q0.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.fragment.app.C0047a;
import androidx.fragment.app.C0065t;
import androidx.fragment.app.H;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import g0.r;
import g0.v;
import g0.w;
import h.C0121l;
import h.N;
import o.f1;

public class SettingsActivity extends C0121l implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: D  reason: collision with root package name */
    public static SharedPreferences f3178D;

    public static class a extends r {
        /* JADX INFO: finally extract failed */
        public final void K(String str) {
            Preference preference;
            PreferenceScreen preferenceScreen;
            PreferenceScreen preferenceScreen2;
            w wVar = this.f2584a0;
            if (wVar != null) {
                Context F2 = F();
                wVar.e = true;
                v vVar = new v(F2, wVar);
                XmlResourceParser xml = F2.getResources().getXml(2131951620);
                try {
                    PreferenceGroup c2 = vVar.c(xml);
                    xml.close();
                    PreferenceScreen preferenceScreen3 = (PreferenceScreen) c2;
                    preferenceScreen3.j(wVar);
                    SharedPreferences.Editor editor = wVar.f2608d;
                    if (editor != null) {
                        editor.apply();
                    }
                    wVar.e = false;
                    Object obj = preferenceScreen3;
                    if (str != null) {
                        Object w2 = preferenceScreen3.w(str);
                        boolean z2 = w2 instanceof PreferenceScreen;
                        obj = w2;
                        if (!z2) {
                            throw new IllegalArgumentException(E.g("Preference object with key ", str, " is not a PreferenceScreen"));
                        }
                    }
                    PreferenceScreen preferenceScreen4 = (PreferenceScreen) obj;
                    w wVar2 = this.f2584a0;
                    PreferenceScreen preferenceScreen5 = wVar2.f2610g;
                    if (preferenceScreen4 != preferenceScreen5) {
                        if (preferenceScreen5 != null) {
                            preferenceScreen5.m();
                        }
                        wVar2.f2610g = preferenceScreen4;
                        if (preferenceScreen4 != null) {
                            this.f2586c0 = true;
                            if (this.f2587d0) {
                                j jVar = this.f2589f0;
                                if (!jVar.hasMessages(1)) {
                                    jVar.obtainMessage(1).sendToTarget();
                                }
                            }
                        }
                    }
                    w wVar3 = this.f2584a0;
                    Preference preference2 = null;
                    if (wVar3 == null || (preferenceScreen2 = wVar3.f2610g) == null) {
                        preference = null;
                    } else {
                        preference = preferenceScreen2.w("ClearCache");
                    }
                    preference.e = new R0.j(this, 0);
                    w wVar4 = this.f2584a0;
                    if (!(wVar4 == null || (preferenceScreen = wVar4.f2610g) == null)) {
                        preference2 = preferenceScreen.w("ClearData");
                    }
                    preference2.e = new R0.j(this, 1);
                } catch (Throwable th) {
                    xml.close();
                    throw th;
                }
            } else {
                throw new RuntimeException("This should be called after super.onCreate.");
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r21, java.lang.String r22) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "GuiMode"
            java.lang.String r3 = "Amoled"
            java.lang.String r4 = "AutoShut"
            java.lang.String r5 = "ForceEn"
            java.lang.String r6 = "CloseNowPlay"
            java.lang.String r7 = "AndAuto"
            java.lang.String r8 = "APlayMode"
            java.lang.String r9 = "ForcePortrait"
            java.lang.String r10 = "HPAS"
            java.lang.String r11 = "HPAP"
            java.lang.String r12 = "BTAS"
            java.lang.String r13 = "BTAP"
            java.lang.String r14 = "TakeControl"
            java.lang.String r15 = "AutoSleep"
            java.lang.String r0 = "SwipeStop"
            r22.getClass()
            r16 = r0
            java.lang.String r0 = "0"
            r17 = r0
            r18 = -1
            int r19 = r22.hashCode()
            switch(r19) {
                case -752898500: goto L_0x00c9;
                case -641026488: goto L_0x00bc;
                case -79717706: goto L_0x00b0;
                case 2049025: goto L_0x00a6;
                case 2049028: goto L_0x009c;
                case 2223927: goto L_0x0092;
                case 2223930: goto L_0x0088;
                case 40550278: goto L_0x007e;
                case 422777432: goto L_0x0074;
                case 801808390: goto L_0x006a;
                case 950613554: goto L_0x0060;
                case 986914004: goto L_0x0056;
                case 1503339043: goto L_0x004c;
                case 1964972424: goto L_0x0042;
                case 2037236062: goto L_0x0038;
                default: goto L_0x0034;
            }
        L_0x0034:
            r0 = r16
            goto L_0x00d4
        L_0x0038:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003f
            goto L_0x0034
        L_0x003f:
            r18 = 14
            goto L_0x0034
        L_0x0042:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0049
            goto L_0x0034
        L_0x0049:
            r18 = 13
            goto L_0x0034
        L_0x004c:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0053
            goto L_0x0034
        L_0x0053:
            r18 = 12
            goto L_0x0034
        L_0x0056:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x005d
            goto L_0x0034
        L_0x005d:
            r18 = 11
            goto L_0x0034
        L_0x0060:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0067
            goto L_0x0034
        L_0x0067:
            r18 = 10
            goto L_0x0034
        L_0x006a:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0071
            goto L_0x0034
        L_0x0071:
            r18 = 9
            goto L_0x0034
        L_0x0074:
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x007b
            goto L_0x0034
        L_0x007b:
            r18 = 8
            goto L_0x0034
        L_0x007e:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0085
            goto L_0x0034
        L_0x0085:
            r18 = 7
            goto L_0x0034
        L_0x0088:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x008f
            goto L_0x0034
        L_0x008f:
            r18 = 6
            goto L_0x0034
        L_0x0092:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0099
            goto L_0x0034
        L_0x0099:
            r18 = 5
            goto L_0x0034
        L_0x009c:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x00a3
            goto L_0x0034
        L_0x00a3:
            r18 = 4
            goto L_0x0034
        L_0x00a6:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x00ad
            goto L_0x0034
        L_0x00ad:
            r18 = 3
            goto L_0x0034
        L_0x00b0:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00b8
            goto L_0x0034
        L_0x00b8:
            r18 = 2
            goto L_0x0034
        L_0x00bc:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x00c4
            goto L_0x0034
        L_0x00c4:
            r0 = r16
            r18 = 1
            goto L_0x00d4
        L_0x00c9:
            r0 = r16
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r18 = 0
        L_0x00d4:
            switch(r18) {
                case 0: goto L_0x0183;
                case 1: goto L_0x016f;
                case 2: goto L_0x0165;
                case 3: goto L_0x015b;
                case 4: goto L_0x0151;
                case 5: goto L_0x0147;
                case 6: goto L_0x013d;
                case 7: goto L_0x0133;
                case 8: goto L_0x0128;
                case 9: goto L_0x011d;
                case 10: goto L_0x0112;
                case 11: goto L_0x0107;
                case 12: goto L_0x00f0;
                case 13: goto L_0x00e5;
                case 14: goto L_0x00d9;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            goto L_0x018d
        L_0x00d9:
            java.lang.String r0 = "csshack"
            r1 = r21
            java.lang.String r0 = r1.getString(r2, r0)
            it.deviato.spotifuck.AppSingleton.f3147l = r0
            goto L_0x018d
        L_0x00e5:
            r1 = r21
            r0 = 0
            boolean r0 = r1.getBoolean(r3, r0)
            it.deviato.spotifuck.AppSingleton.f3152q = r0
            goto L_0x018d
        L_0x00f0:
            r1 = r21
            r0 = r17
            java.lang.String r0 = r1.getString(r4, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            it.deviato.spotifuck.AppSingleton.f3161z = r0
            boolean r0 = it.deviato.spotifuck.WebService.f3182D
            r2 = 1
            r0 = r0 ^ r2
            R0.f.manageTShut(r0)
            goto L_0x018d
        L_0x0107:
            r1 = r21
            r0 = 0
            boolean r0 = r1.getBoolean(r5, r0)
            it.deviato.spotifuck.AppSingleton.f3156u = r0
            goto L_0x018d
        L_0x0112:
            r1 = r21
            r2 = 1
            boolean r0 = r1.getBoolean(r6, r2)
            it.deviato.spotifuck.AppSingleton.f3151p = r0
            goto L_0x018d
        L_0x011d:
            r1 = r21
            r2 = 1
            boolean r0 = r1.getBoolean(r7, r2)
            it.deviato.spotifuck.AppSingleton.f3153r = r0
            goto L_0x018d
        L_0x0128:
            r1 = r21
            java.lang.String r0 = "disabled"
            java.lang.String r0 = r1.getString(r8, r0)
            it.deviato.spotifuck.AppSingleton.f3146k = r0
            goto L_0x018d
        L_0x0133:
            r1 = r21
            r0 = 0
            boolean r0 = r1.getBoolean(r9, r0)
            it.deviato.spotifuck.AppSingleton.f3155t = r0
            goto L_0x018d
        L_0x013d:
            r1 = r21
            r0 = 0
            boolean r0 = r1.getBoolean(r10, r0)
            it.deviato.spotifuck.AppSingleton.f3158w = r0
            goto L_0x018d
        L_0x0147:
            r1 = r21
            r0 = 0
            boolean r0 = r1.getBoolean(r11, r0)
            it.deviato.spotifuck.AppSingleton.f3157v = r0
            goto L_0x018d
        L_0x0151:
            r1 = r21
            r0 = 0
            boolean r0 = r1.getBoolean(r12, r0)
            it.deviato.spotifuck.AppSingleton.f3160y = r0
            goto L_0x018d
        L_0x015b:
            r1 = r21
            r0 = 0
            boolean r0 = r1.getBoolean(r13, r0)
            it.deviato.spotifuck.AppSingleton.f3159x = r0
            goto L_0x018d
        L_0x0165:
            r1 = r21
            r0 = 1
            boolean r0 = r1.getBoolean(r14, r0)
            it.deviato.spotifuck.AppSingleton.f3150o = r0
            goto L_0x018d
        L_0x016f:
            r1 = r21
            r0 = r17
            java.lang.String r0 = r1.getString(r15, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            it.deviato.spotifuck.AppSingleton.f3136A = r0
            boolean r0 = it.deviato.spotifuck.WebService.f3182D
            R0.f.manageTSleep(r0)
            goto L_0x018d
        L_0x0183:
            r1 = r21
            r2 = r0
            r0 = 1
            boolean r0 = r1.getBoolean(r2, r0)
            it.deviato.spotifuck.AppSingleton.f3154s = r0
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it.deviato.spotifuck.SettingsActivity.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public final void onCreate(Bundle bundle) {
        f3178D = PreferenceManager.getDefaultSharedPreferences(this);
        super.onCreate(bundle);
        setContentView(2131492999);
        if (bundle == null) {
            H h2 = ((C0065t) this.f3019x.f2g).i;
            h2.getClass();
            C0047a aVar = new C0047a(h2);
            aVar.e(2131296680, new a(), (String) null, 2);
            aVar.d(false);
        }
        N l2 = l();
        if (l2 != null) {
            f1 f1Var = (f1) l2.f2938p;
            int i = f1Var.f4189b;
            l2.f2941s = true;
            f1Var.a((i & -5) | 4);
        }
    }

    public final void onPause() {
        super.onPause();
        f3178D.unregisterOnSharedPreferenceChangeListener(this);
    }

    public final void onResume() {
        super.onResume();
        f3178D.registerOnSharedPreferenceChangeListener(this);
    }
}
