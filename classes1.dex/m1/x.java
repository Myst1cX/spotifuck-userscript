package m1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r1.c;
import r1.o;

public final class x extends c {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f3776k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f3777l;

    public /* synthetic */ x(int i, Object obj) {
        this.f3776k = i;
        this.f3777l = obj;
    }

    public final IOException l(IOException iOException) {
        switch (this.f3776k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    public final void m() {
        switch (this.f3776k) {
            case 0:
                y yVar = (y) this.f3777l;
                if (yVar.d(6)) {
                    yVar.f3781d.m(yVar.f3780c, 6);
                    return;
                }
                return;
            default:
                Socket socket = (Socket) this.f3777l;
                try {
                    socket.close();
                    return;
                } catch (Exception e) {
                    Logger logger = o.f4594a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + socket, e);
                    return;
                } catch (AssertionError e2) {
                    if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                        throw e2;
                    }
                    Logger logger2 = o.f4594a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + socket, e2);
                    return;
                }
        }
    }

    public void n() {
        if (k()) {
            throw l((IOException) null);
        }
    }
}
