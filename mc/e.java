package mc;

public final class e {
  private int a;
  
  private boolean b;
  
  private int c;
  
  private int d;
  
  private p e;
  
  private bv f;
  
  public e() {
    this(-1, false);
  }
  
  public e(int paramInt, boolean paramBoolean) {
    if (paramInt == -1) {
      paramInt = 6;
    } else if (paramInt < 0 || paramInt > 9) {
      throw new IllegalArgumentException();
    } 
    this.e = new p();
    this.f = new bv(this.e);
    this.b = paramBoolean;
    b(0);
    a(paramInt);
    a();
  }
  
  public final void a() {
    this.c = this.b ? 16 : 0;
    this.d = 0;
    this.e.a();
    this.f.a();
  }
  
  public final void b() {
    this.c |= 0xC;
  }
  
  public final boolean c() {
    return (this.c == 30 && this.e.c());
  }
  
  public final boolean d() {
    return this.f.d();
  }
  
  public final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if ((this.c & 0x8) != 0)
      throw new IllegalStateException("finish()/end() already called"); 
    this.f.a(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private void a(int paramInt) {
    if (paramInt == -1) {
      paramInt = 6;
    } else if (paramInt < 0 || paramInt > 9) {
      throw new IllegalArgumentException();
    } 
    if (this.a != paramInt) {
      this.a = paramInt;
      this.f.a(paramInt);
    } 
  }
  
  private void b(int paramInt) {
    if (paramInt != 0 && paramInt != 1 && paramInt != 2)
      throw new IllegalArgumentException(); 
    this.f.g = paramInt;
  }
  
  public final int a(byte[] paramArrayOfbyte) {
    return b(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  private int b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (this.c == 127)
      throw new IllegalStateException("Deflater closed"); 
    if (this.c < 16) {
      int k = 0;
      int m;
      if ((m = this.a - 1 >> 1) < 0 || m > 3)
        m = 3; 
      k = 0x7800 | m << 6;
      if ((this.c & 0x1) != 0)
        k |= 0x20; 
      k += 31 - k % 31;
      this.e.b(k);
      if ((this.c & 0x1) != 0) {
        int n = this.f.c();
        this.f.b();
        this.e.b(n >> 16);
        this.e.b(n & 0xFFFF);
      } 
      this.c = 0x10 | this.c & 0xC;
    } 
    int j = this.e.b(paramArrayOfbyte, paramInt1, paramInt2);
    paramInt1 += j;
    this.d += j;
    while ((paramInt2 -= j) != 0 && this.c != 30) {
      if (!this.f.a(((this.c & 0x4) != 0), ((this.c & 0x8) != 0))) {
        if (this.c == 16)
          return i - paramInt2; 
        if (this.c == 20) {
          if (this.a != 0)
            for (int k = 8 + (-this.e.e & 0x7); k > 0; k -= 10)
              this.e.a(2, 10);  
          this.c = 16;
          continue;
        } 
        if (this.c == 28) {
          this.e.b();
          if (!this.b) {
            int k = this.f.c();
            this.e.b(k >> 16);
            this.e.b(k & 0xFFFF);
          } 
          this.c = 30;
        } 
      } 
    } 
    return i - paramInt2;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\e.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */