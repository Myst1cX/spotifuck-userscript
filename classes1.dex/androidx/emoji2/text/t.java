package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p0.C0320a;

public final class t extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1544a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1545b = new ArrayList();

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        C0320a.j("watcherClass cannot be null", cls);
        this.f1544a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1545b;
            if (i < arrayList.size()) {
                ((s) arrayList.get(i)).f1543g.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final s c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1545b;
            if (i >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i);
            if (sVar.f1542f == obj) {
                return sVar;
            }
            i++;
        }
    }

    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1545b;
            if (i < arrayList.size()) {
                ((s) arrayList.get(i)).f1543g.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m1append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final boolean d(Object obj) {
        if (obj == null || this.f1544a != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m6delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f1544a != cls) {
            return super.getSpans(i, i2, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i, i2, s.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, sVarArr.length);
        for (int i3 = 0; i3 < sVarArr.length; i3++) {
            objArr[i3] = sVarArr[i3].f1542f;
        }
        return objArr;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m7insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final int nextSpanTransition(int i, int i2, Class<s> cls) {
        if (cls == null || this.f1544a == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final CharSequence subSequence(int i, int i2) {
        return new t(this.f1544a, this, i, i2);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m4append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1545b;
            if (i < arrayList.size()) {
                ((s) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        s c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        s c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        s c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanStart(obj);
    }

    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.f1545b.remove(sVar);
        }
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        e();
        return this;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f1545b.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m8insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public t(Class cls, t tVar, int i, int i2) {
        super(tVar, i, i2);
        C0320a.j("watcherClass cannot be null", cls);
        this.f1544a = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m0append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m3append(char c2) {
        super.append(c2);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        e();
        return this;
    }

    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m2append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m5append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
