package j0;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    public int f3315a;

    /* renamed from: b  reason: collision with root package name */
    public int f3316b;

    /* renamed from: c  reason: collision with root package name */
    public int f3317c;

    /* renamed from: d  reason: collision with root package name */
    public int f3318d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3319f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3320g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3321h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3322j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3323k;

    /* renamed from: l  reason: collision with root package name */
    public int f3324l;

    /* renamed from: m  reason: collision with root package name */
    public long f3325m;

    /* renamed from: n  reason: collision with root package name */
    public int f3326n;

    public final void a(int i2) {
        if ((this.f3318d & i2) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f3318d));
        }
    }

    public final int b() {
        if (this.f3320g) {
            return this.f3316b - this.f3317c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3315a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f3316b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3317c + ", mStructureChanged=" + this.f3319f + ", mInPreLayout=" + this.f3320g + ", mRunSimpleAnimations=" + this.f3322j + ", mRunPredictiveAnimations=" + this.f3323k + '}';
    }
}
