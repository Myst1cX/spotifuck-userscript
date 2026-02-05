package Q0;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.f;

public final class j extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f816a;

    /* renamed from: b  reason: collision with root package name */
    public Object f817b;

    public /* synthetic */ j(int i) {
        this.f816a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Looper looper, Object obj, int i) {
        super(looper);
        this.f816a = i;
        this.f817b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0334, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 25
            r9 = 1
            int r10 = r1.f816a
            switch(r10) {
                case 0: goto L_0x0309;
                case 1: goto L_0x02a1;
                case 2: goto L_0x0262;
                case 3: goto L_0x0058;
                case 4: goto L_0x003b;
                default: goto L_0x0012;
            }
        L_0x0012:
            int r2 = r0.what
            r3 = -3
            if (r2 == r3) goto L_0x0027
            r3 = -2
            if (r2 == r3) goto L_0x0027
            if (r2 == r5) goto L_0x0027
            if (r2 == r9) goto L_0x001f
            goto L_0x003a
        L_0x001f:
            java.lang.Object r0 = r0.obj
            android.content.DialogInterface r0 = (android.content.DialogInterface) r0
            r0.dismiss()
            goto L_0x003a
        L_0x0027:
            java.lang.Object r2 = r0.obj
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            java.lang.Object r3 = r1.f817b
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            int r0 = r0.what
            r2.onClick(r3, r0)
        L_0x003a:
            return
        L_0x003b:
            int r0 = r0.what
            if (r0 == r9) goto L_0x0040
            goto L_0x0057
        L_0x0040:
            java.lang.Object r0 = r1.f817b
            g0.r r0 = (g0.r) r0
            g0.w r2 = r0.f2584a0
            androidx.preference.PreferenceScreen r2 = r2.f2610g
            if (r2 == 0) goto L_0x0057
            androidx.recyclerview.widget.RecyclerView r0 = r0.f2585b0
            g0.u r3 = new g0.u
            r3.<init>(r2)
            r0.setAdapter(r3)
            r2.i()
        L_0x0057:
            return
        L_0x0058:
            java.lang.Object r2 = r1.f817b
            d0.q r2 = (d0.q) r2
            if (r2 == 0) goto L_0x025e
            r2.getClass()
            android.os.Bundle r3 = r23.getData()
            int r4 = r0.what
            java.lang.String r5 = "data_callback_token"
            java.lang.String r6 = "data_calling_uid"
            java.lang.String r10 = "data_calling_pid"
            java.lang.String r11 = "data_package_name"
            java.lang.String r12 = "data_root_hints"
            java.lang.String r13 = "data_media_item_id"
            java.lang.String r14 = "data_result_receiver"
            A.b r2 = r2.f2499g
            switch(r4) {
                case 1: goto L_0x01f6;
                case 2: goto L_0x01e0;
                case 3: goto L_0x01b3;
                case 4: goto L_0x018d;
                case 5: goto L_0x015f;
                case 6: goto L_0x0130;
                case 7: goto L_0x0119;
                case 8: goto L_0x00d9;
                case 9: goto L_0x0099;
                default: goto L_0x007a;
            }
        L_0x007a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unhandled message: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "\n  Service version: 2\n  Client version: "
            r2.append(r3)
            int r0 = r0.arg1
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MBServiceCompat"
            android.util.Log.w(r2, r0)
            goto L_0x0261
        L_0x0099:
            java.lang.String r4 = "data_custom_action_extras"
            android.os.Bundle r19 = r3.getBundle(r4)
            android.support.v4.media.session.t.j(r19)
            java.lang.String r4 = "data_custom_action"
            java.lang.String r18 = r3.getString(r4)
            android.os.Parcelable r3 = r3.getParcelable(r14)
            r20 = r3
            b.d r20 = (b.d) r20
            A.b r3 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r3.<init>((int) r8, (java.lang.Object) r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x0261
            if (r20 != 0) goto L_0x00c4
            goto L_0x0261
        L_0x00c4:
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            Q0.j r0 = r0.f2502k
            d0.n r4 = new d0.n
            r15 = r4
            r16 = r2
            r17 = r3
            r15.<init>((A.b) r16, (A.b) r17, (java.lang.String) r18, (android.os.Bundle) r19, (b.d) r20)
            r0.a(r4)
            goto L_0x0261
        L_0x00d9:
            java.lang.String r4 = "data_search_extras"
            android.os.Bundle r19 = r3.getBundle(r4)
            android.support.v4.media.session.t.j(r19)
            java.lang.String r4 = "data_search_query"
            java.lang.String r18 = r3.getString(r4)
            android.os.Parcelable r3 = r3.getParcelable(r14)
            r20 = r3
            b.d r20 = (b.d) r20
            A.b r3 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r3.<init>((int) r8, (java.lang.Object) r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x0261
            if (r20 != 0) goto L_0x0104
            goto L_0x0261
        L_0x0104:
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            Q0.j r0 = r0.f2502k
            d0.p r4 = new d0.p
            r15 = r4
            r16 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            r0.a(r4)
            goto L_0x0261
        L_0x0119:
            A.b r3 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r3.<init>((int) r8, (java.lang.Object) r0)
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            Q0.j r0 = r0.f2502k
            d0.m r4 = new d0.m
            r4.<init>(r2, r3, r9)
            r0.a(r4)
            goto L_0x0261
        L_0x0130:
            android.os.Bundle r21 = r3.getBundle(r12)
            android.support.v4.media.session.t.j(r21)
            A.b r4 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r4.<init>((int) r8, (java.lang.Object) r0)
            java.lang.String r19 = r3.getString(r11)
            int r20 = r3.getInt(r10)
            int r18 = r3.getInt(r6)
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            Q0.j r0 = r0.f2502k
            d0.l r3 = new d0.l
            r15 = r3
            r16 = r2
            r17 = r4
            r15.<init>((A.b) r16, (A.b) r17, (int) r18, (java.lang.String) r19, (int) r20, (android.os.Bundle) r21)
            r0.a(r3)
            goto L_0x0261
        L_0x015f:
            java.lang.String r4 = r3.getString(r13)
            android.os.Parcelable r3 = r3.getParcelable(r14)
            b.d r3 = (b.d) r3
            A.b r5 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r5.<init>((int) r8, (java.lang.Object) r0)
            r2.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0261
            if (r3 != 0) goto L_0x017d
            goto L_0x0261
        L_0x017d:
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            Q0.j r0 = r0.f2502k
            d0.p r6 = new d0.p
            r6.<init>(r2, r5, r4, r3)
            r0.a(r6)
            goto L_0x0261
        L_0x018d:
            java.lang.String r18 = r3.getString(r13)
            android.os.IBinder r19 = r3.getBinder(r5)
            A.b r3 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r3.<init>((int) r8, (java.lang.Object) r0)
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            Q0.j r0 = r0.f2502k
            d0.o r4 = new d0.o
            r20 = 0
            r15 = r4
            r16 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            r0.a(r4)
            goto L_0x0261
        L_0x01b3:
            java.lang.String r4 = "data_options"
            android.os.Bundle r20 = r3.getBundle(r4)
            android.support.v4.media.session.t.j(r20)
            java.lang.String r18 = r3.getString(r13)
            android.os.IBinder r19 = r3.getBinder(r5)
            A.b r3 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r3.<init>((int) r8, (java.lang.Object) r0)
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            Q0.j r0 = r0.f2502k
            d0.n r4 = new d0.n
            r15 = r4
            r16 = r2
            r17 = r3
            r15.<init>((A.b) r16, (A.b) r17, (java.lang.String) r18, (android.os.IBinder) r19, (android.os.Bundle) r20)
            r0.a(r4)
            goto L_0x0261
        L_0x01e0:
            A.b r3 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r3.<init>((int) r8, (java.lang.Object) r0)
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            Q0.j r0 = r0.f2502k
            d0.m r4 = new d0.m
            r4.<init>(r2, r3, r7)
            r0.a(r4)
            goto L_0x0261
        L_0x01f6:
            android.os.Bundle r21 = r3.getBundle(r12)
            android.support.v4.media.session.t.j(r21)
            java.lang.String r4 = r3.getString(r11)
            int r19 = r3.getInt(r10)
            int r3 = r3.getInt(r6)
            A.b r5 = new A.b
            android.os.Messenger r0 = r0.replyTo
            r5.<init>((int) r8, (java.lang.Object) r0)
            java.lang.Object r0 = r2.f2g
            d0.q r0 = (d0.q) r0
            if (r4 == 0) goto L_0x023f
            android.content.pm.PackageManager r6 = r0.getPackageManager()
            java.lang.String[] r6 = r6.getPackagesForUid(r3)
            int r8 = r6.length
        L_0x021f:
            if (r7 >= r8) goto L_0x0242
            r10 = r6[r7]
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x023d
            d0.l r6 = new d0.l
            r15 = r6
            r16 = r2
            r17 = r5
            r18 = r4
            r20 = r3
            r15.<init>((A.b) r16, (A.b) r17, (java.lang.String) r18, (int) r19, (int) r20, (android.os.Bundle) r21)
            Q0.j r0 = r0.f2502k
            r0.a(r6)
            goto L_0x0261
        L_0x023d:
            int r7 = r7 + r9
            goto L_0x021f
        L_0x023f:
            r0.getClass()
        L_0x0242:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Package/uid mismatch: uid="
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r3 = " package="
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x025e:
            r1.removeCallbacksAndMessages(r6)
        L_0x0261:
            return
        L_0x0262:
            int r2 = r0.what
            if (r2 != r9) goto L_0x02a0
            java.lang.Object r2 = r1.f817b
            R0.o r2 = (R0.o) r2
            java.lang.Object r2 = r2.f873a
            monitor-enter(r2)
            java.lang.Object r3 = r1.f817b     // Catch:{ all -> 0x029d }
            R0.o r3 = (R0.o) r3     // Catch:{ all -> 0x029d }
            java.lang.ref.WeakReference r3 = r3.f876d     // Catch:{ all -> 0x029d }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x029d }
            android.support.v4.media.session.o r3 = (android.support.v4.media.session.o) r3     // Catch:{ all -> 0x029d }
            java.lang.Object r4 = r1.f817b     // Catch:{ all -> 0x029d }
            R0.o r4 = (R0.o) r4     // Catch:{ all -> 0x029d }
            Q0.j r5 = r4.e     // Catch:{ all -> 0x029d }
            monitor-exit(r2)     // Catch:{ all -> 0x029d }
            if (r3 == 0) goto L_0x02a0
            R0.o r2 = r3.b()
            if (r4 != r2) goto L_0x02a0
            if (r5 != 0) goto L_0x028b
            goto L_0x02a0
        L_0x028b:
            java.lang.Object r0 = r0.obj
            d0.r r0 = (d0.r) r0
            r3.f(r0)
            java.lang.Object r0 = r1.f817b
            R0.o r0 = (R0.o) r0
            r0.a(r3, r5)
            r3.f(r6)
            goto L_0x02a0
        L_0x029d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x029d }
            throw r0
        L_0x02a0:
            return
        L_0x02a1:
            int r5 = r0.what
            r6 = 1
            java.lang.Object r8 = r1.f817b
            Q0.C r8 = (Q0.C) r8
            if (r5 == 0) goto L_0x0303
            if (r5 == r9) goto L_0x02fd
            if (r5 == r4) goto L_0x02eb
            if (r5 == r3) goto L_0x02d7
            if (r5 == r2) goto L_0x02be
            Q0.u r2 = Q0.w.f845g
            Q0.i r3 = new Q0.i
            r3.<init>(r0, r9)
            r2.post(r3)
            goto L_0x0308
        L_0x02be:
            java.lang.Object r0 = r0.obj
            java.lang.Long r0 = (java.lang.Long) r0
            int r2 = r8.f767k
            int r2 = r2 + r9
            r8.f767k = r2
            long r2 = r8.e
            long r4 = r0.longValue()
            long r4 = r4 + r2
            r8.e = r4
            int r0 = r8.f767k
            long r2 = (long) r0
            long r4 = r4 / r2
            r8.f765h = r4
            goto L_0x0308
        L_0x02d7:
            int r0 = r0.arg1
            long r2 = (long) r0
            int r0 = r8.f769m
            int r0 = r0 + r9
            r8.f769m = r0
            long r4 = r8.f764g
            long r4 = r4 + r2
            r8.f764g = r4
            int r0 = r8.f768l
            long r2 = (long) r0
            long r4 = r4 / r2
            r8.f766j = r4
            goto L_0x0308
        L_0x02eb:
            int r0 = r0.arg1
            long r2 = (long) r0
            int r0 = r8.f768l
            int r0 = r0 + r9
            r8.f768l = r0
            long r4 = r8.f763f
            long r4 = r4 + r2
            r8.f763f = r4
            long r2 = (long) r0
            long r4 = r4 / r2
            r8.i = r4
            goto L_0x0308
        L_0x02fd:
            long r2 = r8.f762d
            long r2 = r2 + r6
            r8.f762d = r2
            goto L_0x0308
        L_0x0303:
            long r2 = r8.f761c
            long r2 = r2 + r6
            r8.f761c = r2
        L_0x0308:
            return
        L_0x0309:
            int r8 = r0.what
            java.lang.Object r10 = r1.f817b
            Q0.m r10 = (Q0.m) r10
            switch(r8) {
                case 1: goto L_0x05e2;
                case 2: goto L_0x0594;
                case 3: goto L_0x0312;
                case 4: goto L_0x0535;
                case 5: goto L_0x0499;
                case 6: goto L_0x0490;
                case 7: goto L_0x0463;
                case 8: goto L_0x0312;
                case 9: goto L_0x03e9;
                case 10: goto L_0x03e4;
                case 11: goto L_0x0365;
                case 12: goto L_0x031e;
                default: goto L_0x0312;
            }
        L_0x0312:
            Q0.u r2 = Q0.w.f845g
            Q0.i r3 = new Q0.i
            r3.<init>(r0, r7)
            r2.post(r3)
            goto L_0x05e9
        L_0x031e:
            java.lang.Object r0 = r0.obj
            java.util.LinkedHashSet r2 = r10.f825g
            boolean r2 = r2.remove(r0)
            if (r2 != 0) goto L_0x032a
            goto L_0x05e9
        L_0x032a:
            java.util.WeakHashMap r2 = r10.f824f
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0334:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0356
            java.lang.Object r3 = r2.next()
            Q0.n r3 = (Q0.n) r3
            java.lang.Object r4 = r3.f834d
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0334
            if (r6 != 0) goto L_0x034f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x034f:
            r6.add(r3)
            r2.remove()
            goto L_0x0334
        L_0x0356:
            if (r6 == 0) goto L_0x05e9
            r0 = 13
            Q0.u r2 = r10.i
            android.os.Message r0 = r2.obtainMessage(r0, r6)
            r2.sendMessage(r0)
            goto L_0x05e9
        L_0x0365:
            java.lang.Object r0 = r0.obj
            java.util.LinkedHashSet r2 = r10.f825g
            boolean r2 = r2.add(r0)
            if (r2 != 0) goto L_0x0371
            goto L_0x05e9
        L_0x0371:
            java.util.LinkedHashMap r2 = r10.f823d
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x037b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x05e9
            java.lang.Object r3 = r2.next()
            Q0.f r3 = (Q0.C0037f) r3
            Q0.w r4 = r3.f795b
            r4.getClass()
            Q0.n r4 = r3.f801j
            java.util.ArrayList r6 = r3.f802k
            if (r6 == 0) goto L_0x039a
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L_0x039a
            r8 = 1
            goto L_0x039b
        L_0x039a:
            r8 = 0
        L_0x039b:
            if (r4 != 0) goto L_0x03a0
            if (r8 != 0) goto L_0x03a0
            goto L_0x037b
        L_0x03a0:
            java.util.WeakHashMap r11 = r10.f824f
            if (r4 == 0) goto L_0x03b6
            java.lang.Object r12 = r4.f834d
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x03b6
            r3.c(r4)
            java.lang.Object r12 = r4.a()
            r11.put(r12, r4)
        L_0x03b6:
            if (r8 == 0) goto L_0x03da
            int r4 = r6.size()
            int r4 = r4 - r9
        L_0x03bd:
            if (r4 < 0) goto L_0x03da
            java.lang.Object r8 = r6.get(r4)
            Q0.n r8 = (Q0.n) r8
            java.lang.Object r12 = r8.f834d
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x03ce
            goto L_0x03d8
        L_0x03ce:
            r3.c(r8)
            java.lang.Object r12 = r8.a()
            r11.put(r12, r8)
        L_0x03d8:
            int r4 = r4 + r5
            goto L_0x03bd
        L_0x03da:
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x037b
            r2.remove()
            goto L_0x037b
        L_0x03e4:
            r10.getClass()
            goto L_0x05e9
        L_0x03e9:
            java.lang.Object r0 = r0.obj
            android.net.NetworkInfo r0 = (android.net.NetworkInfo) r0
            Q0.y r5 = r10.f821b
            boolean r6 = r5 instanceof Q0.y
            if (r6 == 0) goto L_0x0433
            if (r0 == 0) goto L_0x0430
            r5.getClass()
            boolean r6 = r0.isConnectedOrConnecting()
            if (r6 != 0) goto L_0x03ff
            goto L_0x0430
        L_0x03ff:
            int r6 = r0.getType()
            if (r6 == 0) goto L_0x0416
            if (r6 == r9) goto L_0x0412
            r4 = 6
            if (r6 == r4) goto L_0x0412
            r4 = 9
            if (r6 == r4) goto L_0x0412
            r5.f(r3)
            goto L_0x0433
        L_0x0412:
            r5.f(r2)
            goto L_0x0433
        L_0x0416:
            int r2 = r0.getSubtype()
            switch(r2) {
                case 1: goto L_0x042c;
                case 2: goto L_0x042c;
                case 3: goto L_0x0428;
                case 4: goto L_0x0428;
                case 5: goto L_0x0428;
                case 6: goto L_0x0428;
                default: goto L_0x041d;
            }
        L_0x041d:
            switch(r2) {
                case 12: goto L_0x0428;
                case 13: goto L_0x0424;
                case 14: goto L_0x0424;
                case 15: goto L_0x0424;
                default: goto L_0x0420;
            }
        L_0x0420:
            r5.f(r3)
            goto L_0x0433
        L_0x0424:
            r5.f(r3)
            goto L_0x0433
        L_0x0428:
            r5.f(r4)
            goto L_0x0433
        L_0x042c:
            r5.f(r9)
            goto L_0x0433
        L_0x0430:
            r5.f(r3)
        L_0x0433:
            if (r0 == 0) goto L_0x05e9
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x05e9
            java.util.WeakHashMap r0 = r10.e
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x05e9
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x044b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05e9
            java.lang.Object r2 = r0.next()
            Q0.n r2 = (Q0.n) r2
            r0.remove()
            Q0.w r3 = r2.f831a
            r3.getClass()
            r10.d(r2, r7)
            goto L_0x044b
        L_0x0463:
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r2 = r10.f829l
            r0.<init>(r2)
            r2.clear()
            r2 = 8
            Q0.u r3 = r10.i
            android.os.Message r2 = r3.obtainMessage(r2, r0)
            r3.sendMessage(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0483
            goto L_0x05e9
        L_0x0483:
            java.lang.Object r0 = r0.get(r7)
            Q0.f r0 = (Q0.C0037f) r0
            Q0.w r0 = r0.f795b
            r0.getClass()
            goto L_0x05e9
        L_0x0490:
            java.lang.Object r0 = r0.obj
            Q0.f r0 = (Q0.C0037f) r0
            r10.c(r0, r7)
            goto L_0x05e9
        L_0x0499:
            java.lang.Object r0 = r0.obj
            Q0.f r0 = (Q0.C0037f) r0
            r10.getClass()
            java.util.concurrent.Future r2 = r0.f804m
            if (r2 == 0) goto L_0x04ac
            boolean r2 = r2.isCancelled()
            if (r2 == 0) goto L_0x04ac
            goto L_0x05e9
        L_0x04ac:
            Q0.y r2 = r10.f821b
            boolean r3 = r2.isShutdown()
            if (r3 == 0) goto L_0x04b9
            r10.c(r0, r7)
            goto L_0x05e9
        L_0x04b9:
            boolean r3 = r10.f830m
            if (r3 == 0) goto L_0x04cd
            r1.h r4 = Q0.H.f783a
            java.lang.String r4 = "connectivity"
            android.content.Context r5 = r10.f820a
            java.lang.Object r4 = r5.getSystemService(r4)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            android.net.NetworkInfo r6 = r4.getActiveNetworkInfo()
        L_0x04cd:
            int r4 = r0.f808q
            Q0.B r5 = r0.i
            if (r4 <= 0) goto L_0x04db
            int r4 = r4 - r9
            r0.f808q = r4
            boolean r4 = r5.d(r6)
            goto L_0x04dc
        L_0x04db:
            r4 = 0
        L_0x04dc:
            if (r4 == 0) goto L_0x04f6
            Q0.w r3 = r0.f795b
            r3.getClass()
            java.lang.Exception r3 = r0.f806o
            boolean r3 = r3 instanceof Q0.r
            if (r3 == 0) goto L_0x04ee
            int r3 = r0.f800h
            r3 = r3 | r9
            r0.f800h = r3
        L_0x04ee:
            java.util.concurrent.Future r2 = r2.submit(r0)
            r0.f804m = r2
            goto L_0x05e9
        L_0x04f6:
            if (r3 == 0) goto L_0x0501
            r5.getClass()
            boolean r2 = r5 instanceof Q0.t
            if (r2 == 0) goto L_0x0501
            r2 = 1
            goto L_0x0502
        L_0x0501:
            r2 = 0
        L_0x0502:
            r10.c(r0, r2)
            if (r2 == 0) goto L_0x05e9
            Q0.n r2 = r0.f801j
            java.util.WeakHashMap r3 = r10.e
            if (r2 == 0) goto L_0x0518
            java.lang.Object r4 = r2.a()
            if (r4 == 0) goto L_0x0518
            r2.e = r9
            r3.put(r4, r2)
        L_0x0518:
            java.util.ArrayList r0 = r0.f802k
            if (r0 == 0) goto L_0x05e9
            int r2 = r0.size()
        L_0x0520:
            if (r7 >= r2) goto L_0x05e9
            java.lang.Object r4 = r0.get(r7)
            Q0.n r4 = (Q0.n) r4
            java.lang.Object r5 = r4.a()
            if (r5 == 0) goto L_0x0533
            r4.e = r9
            r3.put(r5, r4)
        L_0x0533:
            int r7 = r7 + r9
            goto L_0x0520
        L_0x0535:
            java.lang.Object r0 = r0.obj
            Q0.f r0 = (Q0.C0037f) r0
            r10.getClass()
            r0.getClass()
            android.graphics.Bitmap r2 = r0.f803l
            A.b r3 = r10.f827j
            r3.getClass()
            java.lang.String r4 = r0.f798f
            if (r4 == 0) goto L_0x058c
            if (r2 == 0) goto L_0x058c
            r1.h r5 = Q0.H.f783a
            int r5 = r2.getAllocationByteCount()
            if (r5 < 0) goto L_0x0578
            java.lang.Object r3 = r3.f2g
            Q0.o r3 = (Q0.o) r3
            int r6 = r3.maxSize()
            if (r5 <= r6) goto L_0x0562
            r3.remove(r4)
            goto L_0x056a
        L_0x0562:
            Q0.p r6 = new Q0.p
            r6.<init>(r2, r5)
            r3.put(r4, r6)
        L_0x056a:
            java.util.LinkedHashMap r2 = r10.f823d
            r2.remove(r4)
            r10.a(r0)
            Q0.w r0 = r0.f795b
            r0.getClass()
            goto L_0x05e9
        L_0x0578:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Negative size: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x058c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "key == null || bitmap == null"
            r0.<init>(r2)
            throw r0
        L_0x0594:
            java.lang.Object r0 = r0.obj
            Q0.n r0 = (Q0.n) r0
            r10.getClass()
            java.lang.String r2 = r0.f833c
            java.util.LinkedHashMap r3 = r10.f823d
            java.lang.Object r4 = r3.get(r2)
            Q0.f r4 = (Q0.C0037f) r4
            Q0.w r5 = r0.f831a
            if (r4 == 0) goto L_0x05b8
            r4.c(r0)
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x05b8
            r3.remove(r2)
            r5.getClass()
        L_0x05b8:
            java.util.LinkedHashSet r2 = r10.f825g
            java.lang.Object r3 = r0.f834d
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x05ce
            java.util.WeakHashMap r2 = r10.f824f
            java.lang.Object r3 = r0.a()
            r2.remove(r3)
            r5.getClass()
        L_0x05ce:
            java.util.WeakHashMap r2 = r10.e
            java.lang.Object r0 = r0.a()
            java.lang.Object r0 = r2.remove(r0)
            Q0.n r0 = (Q0.n) r0
            if (r0 == 0) goto L_0x05e9
            Q0.w r0 = r0.f831a
            r0.getClass()
            goto L_0x05e9
        L_0x05e2:
            java.lang.Object r0 = r0.obj
            Q0.n r0 = (Q0.n) r0
            r10.d(r0, r9)
        L_0x05e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.j.handleMessage(android.os.Message):void");
    }

    public boolean sendMessageAtTime(Message message, long j2) {
        switch (this.f816a) {
            case 3:
                Bundle data = message.getData();
                data.setClassLoader(f.class.getClassLoader());
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                return super.sendMessageAtTime(message, j2);
            default:
                return super.sendMessageAtTime(message, j2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Looper looper, int i) {
        super(looper);
        this.f816a = i;
        this.f817b = obj;
    }

    public void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }
}
