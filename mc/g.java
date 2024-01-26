package mc;

public final class g {
  private int a;
  
  public g() {
    a();
  }
  
  public final void a() {
    this.a = 1;
  }
  
  public final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.a & 0xFFFF;
    int j;
    for (j = this.a >>> 16; paramInt2 > 0; j %= 65521) {
      int k = 3800;
      if (3800 > paramInt2)
        k = paramInt2; 
      paramInt2 -= k;
      while (--k >= 0) {
        i += paramArrayOfbyte[paramInt1++] & 0xFF;
        j += i;
      } 
      i %= 65521;
    } 
    this.a = j << 16 | i;
  }
  
  public final long b() {
    return this.a & 0xFFFFFFFFL;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\g.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */