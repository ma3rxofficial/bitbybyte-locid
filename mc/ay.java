package mc;

public final class ay {
  private byte[] b = new byte[32768];
  
  private int c = 0;
  
  public int a = 0;
  
  public final void a(int paramInt) {
    if (this.a++ == 32768)
      throw new IllegalStateException("Window full"); 
    this.b[this.c++] = (byte)paramInt;
    this.c &= 0x7FFF;
  }
  
  private final void b(int paramInt1, int paramInt2) {
    while (paramInt2-- > 0) {
      this.b[this.c++] = this.b[paramInt1++];
      this.c &= 0x7FFF;
      paramInt1 &= 0x7FFF;
    } 
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if ((this.a += paramInt1) > 32768)
      throw new IllegalStateException("Window full"); 
    int i = this.c - paramInt2 & 0x7FFF;
    int j = 32768 - paramInt1;
    if (i <= j && this.c < j) {
      if (paramInt1 <= paramInt2) {
        System.arraycopy(this.b, i, this.b, this.c, paramInt1);
        this.c += paramInt1;
        return;
      } 
      while (paramInt1-- > 0)
        this.b[this.c++] = this.b[i++]; 
    } else {
      b(i, paramInt1);
    } 
  }
  
  public final int a(br parambr, int paramInt) {
    int i;
    paramInt = Math.min(Math.min(paramInt, 32768 - this.a), parambr.a());
    int j = 32768 - this.c;
    if (paramInt > j) {
      if ((i = parambr.a(this.b, this.c, j)) == j)
        i += parambr.a(this.b, 0, paramInt - j); 
    } else {
      i = parambr.a(this.b, this.c, paramInt);
    } 
    this.c = this.c + i & 0x7FFF;
    this.a += i;
    return i;
  }
  
  public final int a() {
    return 32768 - this.a;
  }
  
  public final int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.c;
    if (paramInt2 > this.a) {
      paramInt2 = this.a;
    } else {
      i = this.c - this.a + paramInt2 & 0x7FFF;
    } 
    int j = paramInt2;
    int k;
    if ((k = paramInt2 - i) > 0) {
      System.arraycopy(this.b, 32768 - k, paramArrayOfbyte, paramInt1, k);
      paramInt1 += k;
      paramInt2 = i;
    } 
    System.arraycopy(this.b, i - paramInt2, paramArrayOfbyte, paramInt1, paramInt2);
    this.a -= j;
    if (this.a < 0)
      throw new IllegalStateException(); 
    return j;
  }
  
  public final void b() {
    this.a = this.c = 0;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ay.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */