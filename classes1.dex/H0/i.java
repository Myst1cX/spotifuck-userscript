package h0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f3073a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3074b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3075c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3076d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f3074b == iVar.f3074b && this.f3075c == iVar.f3075c && this.f3073a == iVar.f3073a && this.f3076d == iVar.f3076d) {
            return true;
        }
        return false;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f3074b), Long.valueOf(this.f3075c), Integer.valueOf(this.f3073a), Long.valueOf(this.f3076d)});
    }

    public i(int i, int i2, long j2, long j3) {
        this.f3073a = i;
        this.f3074b = i2;
        this.f3075c = j2;
        this.f3076d = j3;
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3073a);
            dataOutputStream.writeInt(this.f3074b);
            dataOutputStream.writeLong(this.f3075c);
            dataOutputStream.writeLong(this.f3076d);
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
