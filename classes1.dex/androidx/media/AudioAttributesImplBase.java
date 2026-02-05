package androidx.media;

import Q0.E;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f1864a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1865b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1866c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1867d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1865b == audioAttributesImplBase.f1865b) {
            int i2 = this.f1866c;
            int i3 = audioAttributesImplBase.f1866c;
            int i4 = audioAttributesImplBase.f1867d;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.f1864a;
                int i6 = AudioAttributesCompat.f1860b;
                if ((i3 & 1) != 1) {
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 13:
                                i = 1;
                                break;
                            default:
                                i = 3;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f1864a == audioAttributesImplBase.f1864a && this.f1867d == i4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1865b), Integer.valueOf(this.f1866c), Integer.valueOf(this.f1864a), Integer.valueOf(this.f1867d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1867d != -1) {
            sb.append(" stream=");
            sb.append(this.f1867d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f1864a;
        int i2 = AudioAttributesCompat.f1860b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = E.e("unknown usage ", i);
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f1865b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1866c).toUpperCase());
        return sb.toString();
    }
}
