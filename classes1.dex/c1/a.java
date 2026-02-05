package c1;

import Z0.c;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends b1.a {
    public final Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        c.d("current()", current);
        return current;
    }
}
