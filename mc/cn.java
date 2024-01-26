package mc;

public final class cn {
  private static final int[] b = new int[] { 
      3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 
      15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 
      67, 83, 99, 115, 131, 163, 195, 227, 258 };
  
  private static final int[] c = new int[] { 
      0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 
      1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 
      4, 4, 4, 4, 5, 5, 5, 5, 0 };
  
  private static final int[] d = new int[] { 
      1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 
      33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 
      1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577 };
  
  private static final int[] e = new int[] { 
      0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 
      4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 
      9, 9, 10, 10, 11, 11, 12, 12, 13, 13 };
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private boolean l;
  
  public int a;
  
  private int m;
  
  private boolean n;
  
  private br o;
  
  private ay p;
  
  private q q;
  
  private ah r;
  
  private ah s;
  
  private g t;
  
  public cn() {
    this(false);
  }
  
  public cn(boolean paramBoolean) {
    this.n = paramBoolean;
    this.t = new g();
    this.o = new br();
    this.p = new ay();
    this.f = paramBoolean ? 2 : 0;
  }
  
  public final boolean a() {
    return (this.f == 12 && this.p.a == 0);
  }
  
  public final int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws y {
    if (paramInt2 == 0)
      return 0; 
    if (0 > paramInt1 || paramInt1 > paramInt1 + paramInt2 || paramInt1 + paramInt2 > paramArrayOfbyte.length)
      throw new ArrayIndexOutOfBoundsException(); 
    int i = 0;
    do {
      int j = this.p.a(paramArrayOfbyte, paramInt1, paramInt2);
      this.t.a(paramArrayOfbyte, paramInt1, j);
      paramInt1 += j;
      i += j;
      this.a += j;
      if (this.f != 11 && (paramInt2 -= j) == 0)
        return i; 
    } while (i() || (this.p.a > 0 && this.f != 11));
    return i;
  }
  
  public final boolean b() {
    return (this.f == 1 && this.h == 0);
  }
  
  public final boolean c() {
    return this.o.c();
  }
  
  public final void d() {
    this.f = this.n ? 2 : 0;
    this.m = this.a = 0;
    this.o.d();
    this.p.b();
    this.q = null;
    this.r = null;
    this.s = null;
    this.l = false;
    this.t.a();
  }
  
  public final void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.o.b(paramArrayOfbyte, paramInt1, paramInt2);
    this.m += paramInt2;
  }
  
  private boolean e() throws y {
    int i;
    if ((i = this.o.a(16)) < 0)
      return false; 
    this.o.b(16);
    if ((i = (i << 8 | i >> 8) & 0xFFFF) % 31 != 0)
      throw new y("Header checksum illegal"); 
    if ((i & 0xF00) != 2048)
      throw new y("Compression Method unknown"); 
    if ((i & 0x20) == 0) {
      this.f = 2;
    } else {
      this.f = 1;
      this.h = 32;
    } 
    return true;
  }
  
  private boolean f() {
    while (this.h > 0) {
      int i;
      if ((i = this.o.a(8)) < 0)
        return false; 
      this.o.b(8);
      this.g = this.g << 8 | i;
      this.h -= 8;
    } 
    return false;
  }
  
  private boolean g() throws y {
    int i = this.p.a();
    while (i >= 258) {
      int j;
      switch (this.f) {
        case 7:
          while (((j = this.r.a(this.o)) & 0xFFFFFF00) == 0) {
            this.p.a(j);
            if (--i < 258)
              return true; 
          } 
          if (j < 257) {
            if (j < 0)
              return false; 
            this.s = null;
            this.r = null;
            this.f = 2;
            return true;
          } 
          try {
            this.i = b[j - 257];
            this.h = c[j - 257];
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new y("Illegal rep length code");
          } 
        case 8:
          if (this.h > 0) {
            this.f = 8;
            int k;
            if ((k = this.o.a(this.h)) < 0)
              return false; 
            this.o.b(this.h);
            this.i += k;
          } 
          this.f = 9;
        case 9:
          if ((j = this.s.a(this.o)) < 0)
            return false; 
          try {
            this.j = d[j];
            this.h = e[j];
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new y("Illegal rep dist code");
          } 
        case 10:
          if (this.h > 0) {
            this.f = 10;
            int k;
            if ((k = this.o.a(this.h)) < 0)
              return false; 
            this.o.b(this.h);
            this.j += k;
          } 
          this.p.a(this.i, this.j);
          i -= this.i;
          this.f = 7;
          continue;
      } 
      throw new IllegalStateException();
    } 
    return true;
  }
  
  private boolean h() throws y {
    while (this.h > 0) {
      int i;
      if ((i = this.o.a(8)) < 0)
        return false; 
      this.o.b(8);
      this.g = this.g << 8 | i;
      this.h -= 8;
    } 
    if ((int)this.t.b() != this.g)
      throw new y("Adler chksum doesn't match: " + Integer.toHexString((int)this.t.b()) + " vs. " + Integer.toHexString(this.g)); 
    this.f = 12;
    return false;
  }
  
  private boolean i() throws y {
    int i;
    int j;
    switch (this.f) {
      case 0:
        return e();
      case 1:
        return f();
      case 11:
        return h();
      case 2:
        if (this.l) {
          if (this.n) {
            this.f = 12;
            return false;
          } 
          this.o.b();
          this.h = 32;
          this.f = 11;
          return true;
        } 
        if ((i = this.o.a(3)) < 0)
          return false; 
        this.o.b(3);
        if ((i & 0x1) != 0)
          this.l = true; 
        switch (i >> 1) {
          case 0:
            this.o.b();
            this.f = 3;
            return true;
          case 1:
            this.r = ah.a;
            this.s = ah.b;
            this.f = 7;
            return true;
          case 2:
            this.q = new q();
            this.f = 6;
            return true;
        } 
        throw new y("Unknown block type " + i);
      case 3:
        if ((this.k = this.o.a(16)) < 0)
          return false; 
        this.o.b(16);
        this.f = 4;
      case 4:
        if ((j = this.o.a(16)) < 0)
          return false; 
        this.o.b(16);
        if (j != (this.k ^ 0xFFFF))
          throw new y("broken uncompressed block"); 
        this.f = 5;
      case 5:
        j = this.p.a(this.o, this.k);
        this.k -= j;
        if (this.k == 0) {
          this.f = 2;
          return true;
        } 
        return !this.o.c();
      case 6:
        if (!this.q.a(this.o))
          return false; 
        this.r = this.q.a();
        this.s = this.q.b();
        this.f = 7;
      case 7:
      case 8:
      case 9:
      case 10:
        return g();
      case 12:
        return false;
    } 
    throw new IllegalStateException();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\cn.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */