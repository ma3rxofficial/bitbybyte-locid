package mc;

public class di {
  public byte[] a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public di() {
    this(4096);
  }
  
  public di(int paramInt) {
    this.a = new byte[paramInt];
  }
  
  public final void a() {
    this.b = this.c = this.e = 0;
  }
  
  public final void a(int paramInt) {
    this.a[this.c++] = (byte)paramInt;
    this.a[this.c++] = (byte)(paramInt >> 8);
  }
  
  public final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    System.arraycopy(paramArrayOfbyte, paramInt1, this.a, this.c, paramInt2);
    this.c += paramInt2;
  }
  
  public final void b() {
    if (this.e > 0) {
      this.a[this.c++] = (byte)this.d;
      if (this.e > 8)
        this.a[this.c++] = (byte)(this.d >>> 8); 
    } 
    this.d = 0;
    this.e = 0;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.d |= paramInt1 << this.e;
    this.e += paramInt2;
    if (this.e >= 16) {
      this.a[this.c++] = (byte)this.d;
      this.a[this.c++] = (byte)(this.d >>> 8);
      this.d >>>= 16;
      this.e -= 16;
    } 
  }
  
  public final void b(int paramInt) {
    this.a[this.c++] = (byte)(paramInt >> 8);
    this.a[this.c++] = (byte)paramInt;
  }
  
  public final boolean c() {
    return (this.c == 0);
  }
  
  public final int b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.e >= 8) {
      this.a[this.c++] = (byte)this.d;
      this.d >>>= 8;
      this.e -= 8;
    } 
    if (paramInt2 > this.c - this.b) {
      paramInt2 = this.c - this.b;
      System.arraycopy(this.a, this.b, paramArrayOfbyte, paramInt1, paramInt2);
      this.b = 0;
      this.c = 0;
    } else {
      System.arraycopy(this.a, this.b, paramArrayOfbyte, paramInt1, paramInt2);
      this.b += paramInt2;
    } 
    return paramInt2;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\di.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */