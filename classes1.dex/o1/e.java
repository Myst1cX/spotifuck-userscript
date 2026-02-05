package o1;

import h1.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    public final Method f4428c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f4429d;

    public final String h(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f4429d.invoke(sSLSocket, (Object[]) null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw c.a("unable to get selected protocols", e);
        }
    }

    public e(Method method, Method method2) {
        this.f4428c = method;
        this.f4429d = method2;
    }

    public final void e(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b2 = g.b(list);
            this.f4428c.invoke(sSLParameters, new Object[]{b2.toArray(new String[b2.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw c.a("unable to set ssl parameters", e);
        }
    }
}
