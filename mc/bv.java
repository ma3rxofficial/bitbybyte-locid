package mc;

public final class bv implements au {
  private int h;
  
  private short[] i;
  
  private short[] j;
  
  private int k;
  
  private int l;
  
  private boolean m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private byte[] q;
  
  public int g;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private byte[] w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  private p A;
  
  private ck B;
  
  private g C;
  
  public bv(p paramp) {
    this.A = paramp;
    this.B = new ck(paramp);
    this.C = new g();
    this.q = new byte[65536];
    this.i = new short[32768];
    this.j = new short[32768];
    this.n = this.o = 1;
  }
  
  public final void a() {
    this.B.a();
    this.C.a();
    this.n = this.o = 1;
    this.p = 0;
    this.x = 0;
    this.m = false;
    this.l = 2;
    byte b;
    for (b = 0; b < '耀'; b++)
      this.i[b] = 0; 
    for (b = 0; b < '耀'; b++)
      this.j[b] = 0; 
  }
  
  public final void b() {
    this.C.a();
  }
  
  public final int c() {
    int i;
    return i = (int)this.C.b();
  }
  
  public final void a(int paramInt) {
    this.u = au.b[paramInt];
    this.s = au.c[paramInt];
    this.t = au.d[paramInt];
    this.r = au.e[paramInt];
    if (au.f[paramInt] != this.v) {
      switch (this.v) {
        case 0:
          if (this.o > this.n) {
            this.B.a(this.q, this.n, this.o - this.n, false);
            this.n = this.o;
          } 
          e();
          break;
        case 1:
          if (this.o > this.n) {
            this.B.b(this.q, this.n, this.o - this.n, false);
            this.n = this.o;
          } 
          break;
        case 2:
          if (this.m)
            this.B.b(this.q[this.o - 1] & 0xFF); 
          if (this.o > this.n) {
            this.B.b(this.q, this.n, this.o - this.n, false);
            this.n = this.o;
          } 
          this.m = false;
          this.l = 2;
          break;
      } 
      this.v = au.f[paramInt];
    } 
  }
  
  private final void e() {
    this.h = this.q[this.o] << 5 ^ this.q[this.o + 1];
  }
  
  private final int f() {
    int i = (this.h << 5 ^ this.q[this.o + 2]) & 0x7FFF;
    short s = this.i[i];
    this.i[i] = (short)this.o;
    this.h = i;
    return s & 0xFFFF;
  }
  
  private void g() {
    System.arraycopy(this.q, 32768, this.q, 0, 32768);
    this.k -= 32768;
    this.o -= 32768;
    this.n -= 32768;
    byte b;
    for (b = 0; b < '耀'; b++) {
      int i = this.i[b] & 0xFFFF;
      this.i[b] = (i >= 32768) ? (short)(i - 32768) : 0;
    } 
    for (b = 0; b < '耀'; b++) {
      int i = this.j[b] & 0xFFFF;
      this.j[b] = (i >= 32768) ? (short)(i - 32768) : 0;
    } 
  }
  
  private void h() {
    if (this.o >= 65274)
      g(); 
    while (this.p < 262 && this.y < this.z) {
      int i;
      if ((i = 65536 - this.p - this.o) > this.z - this.y)
        i = this.z - this.y; 
      System.arraycopy(this.w, this.y, this.q, this.o + this.p, i);
      this.C.a(this.w, this.y, i);
      this.y += i;
      this.x += i;
      this.p += i;
    } 
    if (this.p >= 3)
      e(); 
  }
  
  private boolean b(int paramInt) {
    int i = this.r;
    int j = this.t;
    short[] arrayOfShort = this.j;
    int k = this.o;
    int m = this.o + this.l;
    int n = Math.max(this.l, 2);
    int i1 = Math.max(this.o - 32506, 0);
    int i2 = k + 258 - 1;
    byte b1 = this.q[m - 1];
    byte b2 = this.q[m];
    if (n >= this.u)
      i >>= 2; 
    if (j > this.p)
      j = this.p; 
    do {
      if (this.q[paramInt + n] != b2 || this.q[paramInt + n - 1] != b1 || this.q[paramInt] != this.q[k] || this.q[paramInt + 1] != this.q[k + 1])
        continue; 
      int i3 = paramInt + 2;
      k += 2;
      while (this.q[++k] == this.q[++i3] && this.q[++k] == this.q[++i3] && this.q[++k] == this.q[++i3] && this.q[++k] == this.q[++i3] && this.q[++k] == this.q[++i3] && this.q[++k] == this.q[++i3] && this.q[++k] == this.q[++i3] && this.q[++k] == this.q[++i3] && k < i2);
      if (k > m) {
        this.k = paramInt;
        m = k;
        if ((n = k - this.o) >= j)
          break; 
        b1 = this.q[m - 1];
        b2 = this.q[m];
      } 
      k = this.o;
    } while ((paramInt = arrayOfShort[paramInt & 0x7FFF] & 0xFFFF) > i1 && --i != 0);
    this.l = Math.min(n, this.p);
    return (this.l >= 3);
  }
  
  private boolean b(boolean paramBoolean1, boolean paramBoolean2) {
    if (!paramBoolean1 && this.p == 0)
      return false; 
    this.o += this.p;
    this.p = 0;
    int i;
    if ((i = this.o - this.n) >= au.a || (this.n < 32768 && i >= 32506) || paramBoolean1) {
      boolean bool = paramBoolean2;
      if (i > au.a) {
        i = au.a;
        bool = false;
      } 
      this.B.a(this.q, this.n, i, bool);
      this.n += i;
      return !bool;
    } 
    return true;
  }
  
  private boolean c(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.p < 262 && !paramBoolean1)
      return false; 
    while (true) {
      if (this.p >= 262 || paramBoolean1) {
        if (this.p == 0) {
          this.B.b(this.q, this.n, this.o - this.n, paramBoolean2);
          this.n = this.o;
          return false;
        } 
        if (this.o > 65274)
          g(); 
        int i;
        if (this.p >= 3 && (i = f()) != 0 && this.g != 2 && this.o - i <= 32506 && b(i)) {
          this.B.a(this.o - this.k, this.l);
          this.p -= this.l;
          if (this.l <= this.s && this.p >= 3) {
            while (--this.l > 0) {
              this.o++;
              f();
            } 
            this.o++;
          } else {
            this.o += this.l;
            if (this.p >= 2)
              e(); 
          } 
          this.l = 2;
          continue;
        } 
        this.B.b(this.q[this.o] & 0xFF);
        this.o++;
        this.p--;
        if (this.B.b()) {
          boolean bool = (paramBoolean2 && this.p == 0) ? true : false;
          this.B.b(this.q, this.n, this.o - this.n, bool);
          this.n = this.o;
          return !bool;
        } 
        continue;
      } 
      return true;
    } 
  }
  
  private boolean d(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.p < 262 && !paramBoolean1)
      return false; 
    while (true) {
      if (this.p >= 262 || paramBoolean1) {
        if (this.p == 0) {
          if (this.m)
            this.B.b(this.q[this.o - 1] & 0xFF); 
          this.m = false;
          this.B.b(this.q, this.n, this.o - this.n, paramBoolean2);
          this.n = this.o;
          return false;
        } 
        if (this.o >= 65274)
          g(); 
        int i = this.k;
        int j = this.l;
        if (this.p >= 3) {
          int k = f();
          if (this.g != 2 && k != 0 && this.o - k <= 32506 && b(k) && this.l <= 5 && (this.g == 1 || (this.l == 3 && this.o - this.k > 4096)))
            this.l = 2; 
        } 
        if (j >= 3 && this.l <= j) {
          this.B.a(this.o - 1 - i, j);
          j -= 2;
          while (true) {
            this.o++;
            this.p--;
            if (this.p >= 3)
              f(); 
            if (--j <= 0) {
              this.o++;
              this.p--;
              this.m = false;
              this.l = 2;
              break;
            } 
          } 
        } else {
          if (this.m)
            this.B.b(this.q[this.o - 1] & 0xFF); 
          this.m = true;
          this.o++;
          this.p--;
        } 
        if (this.B.b()) {
          int k = this.o - this.n;
          if (this.m)
            k--; 
          boolean bool = (paramBoolean2 && this.p == 0 && !this.m) ? true : false;
          this.B.b(this.q, this.n, k, bool);
          this.n += k;
          return !bool;
        } 
        continue;
      } 
      return true;
    } 
  }
  
  public final boolean a(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool;
    do {
      h();
      boolean bool1 = (paramBoolean1 && this.y == this.z) ? true : false;
      switch (this.v) {
        case 0:
          bool = b(bool1, paramBoolean2);
          break;
        case 1:
          bool = c(bool1, paramBoolean2);
          break;
        case 2:
          bool = d(bool1, paramBoolean2);
          break;
        default:
          throw new Error();
      } 
    } while (this.A.c() && bool);
    return bool;
  }
  
  public final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.y < this.z)
      throw new IllegalStateException("Old input was not completely processed"); 
    int i = paramInt1 + paramInt2;
    if (0 > paramInt1 || paramInt1 > i || i > paramArrayOfbyte.length)
      throw new ArrayIndexOutOfBoundsException(); 
    this.w = paramArrayOfbyte;
    this.y = paramInt1;
    this.z = i;
  }
  
  public final boolean d() {
    return (this.z == this.y);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bv.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */