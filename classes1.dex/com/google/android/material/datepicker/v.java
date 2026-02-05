package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f2291a = new AtomicReference();

    public static Calendar b() {
        u uVar = (u) f2291a.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar c(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    public static Calendar a(Calendar calendar) {
        Calendar c2 = c(calendar);
        Calendar c3 = c((Calendar) null);
        c3.set(c2.get(1), c2.get(2), c2.get(5));
        return c3;
    }
}
