package a;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: a.a  reason: case insensitive filesystem */
public final class C0040a extends InputStream implements DataInput {
    public static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f  reason: collision with root package name */
    public static final ByteOrder f1014f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a  reason: collision with root package name */
    public final DataInputStream f1015a;

    /* renamed from: b  reason: collision with root package name */
    public ByteOrder f1016b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1017c;

    /* renamed from: d  reason: collision with root package name */
    public int f1018d;

    public C0040a(InputStream inputStream) {
        this.f1016b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1015a = dataInputStream;
        int available = dataInputStream.available();
        this.f1017c = available;
        this.f1018d = 0;
        dataInputStream.mark(available);
    }

    public final int read() {
        this.f1018d++;
        return this.f1015a.read();
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.f1018d + i2;
        this.f1018d = i3;
        if (i3 > this.f1017c) {
            throw new EOFException();
        } else if (this.f1015a.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public final String readLine() {
        return null;
    }

    public final int available() {
        return this.f1015a.available();
    }

    public final void f(long j2) {
        int i = this.f1018d;
        if (((long) i) > j2) {
            this.f1018d = 0;
            DataInputStream dataInputStream = this.f1015a;
            dataInputStream.reset();
            dataInputStream.mark(this.f1017c);
        } else {
            j2 -= (long) i;
        }
        int i2 = (int) j2;
        if (skipBytes(i2) != i2) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public final boolean readBoolean() {
        this.f1018d++;
        return this.f1015a.readBoolean();
    }

    public final byte readByte() {
        int i = this.f1018d + 1;
        this.f1018d = i;
        if (i <= this.f1017c) {
            int read = this.f1015a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f1018d += 2;
        return this.f1015a.readChar();
    }

    public final int readInt() {
        int i = this.f1018d + 4;
        this.f1018d = i;
        if (i <= this.f1017c) {
            DataInputStream dataInputStream = this.f1015a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f1016b;
                if (byteOrder == e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f1014f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f1016b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final long readLong() {
        int i = this.f1018d + 8;
        this.f1018d = i;
        if (i <= this.f1017c) {
            DataInputStream dataInputStream = this.f1015a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f1016b;
                if (byteOrder == e) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i2 = read;
                if (byteOrder == f1014f) {
                    return (((long) i2) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f1016b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i = this.f1018d + 2;
        this.f1018d = i;
        if (i <= this.f1017c) {
            DataInputStream dataInputStream = this.f1015a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f1016b;
                if (byteOrder == e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f1014f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f1016b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.f1018d += 2;
        return this.f1015a.readUTF();
    }

    public final int readUnsignedByte() {
        this.f1018d++;
        return this.f1015a.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        int i = this.f1018d + 2;
        this.f1018d = i;
        if (i <= this.f1017c) {
            DataInputStream dataInputStream = this.f1015a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f1016b;
                if (byteOrder == e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f1014f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f1016b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final int skipBytes(int i) {
        int min = Math.min(i, this.f1017c - this.f1018d);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.f1015a.skipBytes(min - i2);
        }
        this.f1018d += i2;
        return i2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f1015a.read(bArr, i, i2);
        this.f1018d += read;
        return read;
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        int length = this.f1018d + bArr.length;
        this.f1018d = length;
        if (length > this.f1017c) {
            throw new EOFException();
        } else if (this.f1015a.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    public C0040a(byte[] bArr) {
        this((InputStream) new ByteArrayInputStream(bArr));
    }
}
