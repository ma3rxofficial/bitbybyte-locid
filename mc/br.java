package mc;

public final class br {
  private byte[] b;
  
  private int c = 0;
  
  private int d = 0;
  
  private int e = 0;
  
  public int a = 0;
  
  public final int a(int paramInt) {
    if (this.a < paramInt) {
      if (this.c == this.d)
        return -1; 
      this.e |= (this.b[this.c++] & 0xFF | (this.b[this.c++] & 0xFF) << 8) << this.a;
      this.a += 16;
    } 
    return this.e & (1 << paramInt) - 1;
  }
  
  public final void b(int paramInt) {
    this.e >>>= paramInt;
    this.a -= paramInt;
  }
  
  public final int a() {
    return this.d - this.c + (this.a >> 3);
  }
  
  public final void b() {
    this.e >>= this.a & 0x7;
    this.a &= 0xFFFFFFF8;
  }
  
  public final boolean c() {
    return (this.c == this.d);
  }
  
  public final int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 < 0)
      throw new IllegalArgumentException("length negative"); 
    if ((this.a & 0x7) != 0)
      throw new IllegalStateException("Bit buffer is not aligned!"); 
    byte b;
    for (b = 0; this.a > 0 && paramInt2 > 0; b++) {
      paramArrayOfbyte[paramInt1++] = (byte)this.e;
      this.e >>>= 8;
      this.a -= 8;
      paramInt2--;
    } 
    if (paramInt2 == 0)
      return b; 
    int i = this.d - this.c;
    if (paramInt2 > i)
      paramInt2 = i; 
    System.arraycopy(this.b, this.c, paramArrayOfbyte, paramInt1, paramInt2);
    this.c += paramInt2;
    if ((this.c - this.d & 0x1) != 0) {
      this.e = this.b[this.c++] & 0xFF;
      this.a = 8;
    } 
    return b + paramInt2;
  }
  
  public final void d() {
    this.c = this.d = this.e = this.a = 0;
  }
  
  public final void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.c < this.d)
      throw new IllegalStateException("Old input was not completely processed"); 
    int i = paramInt1 + paramInt2;
    if (0 > paramInt1 || paramInt1 > i || i > paramArrayOfbyte.length)
      throw new ArrayIndexOutOfBoundsException(); 
    if ((paramInt2 & 0x1) != 0) {
      this.e |= (paramArrayOfbyte[paramInt1++] & 0xFF) << this.a;
      this.a += 8;
    } 
    this.b = paramArrayOfbyte;
    this.c = paramInt1;
    this.d = i;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\br.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */