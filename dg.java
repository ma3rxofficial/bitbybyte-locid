public final class dg extends bj {
  public int i;
  
  public String j;
  
  public int k;
  
  private dg(long paramLong, int paramInt1, int paramInt2, String paramString, int paramInt3, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    super(21, 2, paramInt1, paramLong, paramArrayOfbyte1, paramArrayOfbyte2);
    this.i = paramInt2;
    this.j = paramString;
    this.k = paramInt3;
  }
  
  public dg(long paramLong, int paramInt1, String paramString, int paramInt2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(paramLong, 0, paramInt1, paramString, paramInt2, paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public dg(long paramLong, String paramString, int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(paramLong, 0, -1, paramString, paramInt, paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public final byte[] a(int paramInt) {
    byte[] arrayOfByte;
    dh.a(arrayOfByte = new byte[30 + this.f.length + ((this.e.length > 0) ? (2 + this.e.length) : 0)], 0, 42);
    dh.a(arrayOfByte, 1, 2);
    dh.b(arrayOfByte, 2, paramInt);
    dh.b(arrayOfByte, 4, 24 + this.f.length + ((this.e.length > 0) ? (2 + this.e.length) : 0));
    dh.b(arrayOfByte, 6, this.a);
    dh.b(arrayOfByte, 8, this.b);
    dh.b(arrayOfByte, 10, (this.e.length > 0) ? 32768 : 0);
    dh.a(arrayOfByte, 12, this.d);
    if (this.e.length > 0) {
      dh.b(arrayOfByte, 16, this.e.length);
      System.arraycopy(this.e, 0, arrayOfByte, 18, this.e.length);
      dh.b(arrayOfByte, 18 + this.e.length, 1);
      dh.b(arrayOfByte, 20 + this.e.length, 10 + this.f.length);
      dh.a(arrayOfByte, 22 + this.e.length, 8 + this.f.length, false);
      dh.a(arrayOfByte, 24 + this.e.length, Long.parseLong(this.j), false);
      dh.a(arrayOfByte, 28 + this.e.length, this.k, false);
      dh.a(arrayOfByte, 30 + this.e.length, this.i, false);
      System.arraycopy(this.f, 0, arrayOfByte, 32 + this.e.length, this.f.length);
    } else {
      dh.b(arrayOfByte, 16, 1);
      dh.b(arrayOfByte, 18, 10 + this.f.length);
      dh.a(arrayOfByte, 20, 8 + this.f.length, false);
      dh.a(arrayOfByte, 22, Long.parseLong(this.j), false);
      dh.a(arrayOfByte, 26, this.k, false);
      dh.a(arrayOfByte, 28, this.i, false);
      System.arraycopy(this.f, 0, arrayOfByte, 30, this.f.length);
    } 
    return arrayOfByte;
  }
  
  public static dd a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws cr {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    String str;
    int k;
    int m;
    int i;
    if ((i = dh.c(paramArrayOfbyte, paramInt1 + 4)) < 24)
      throw new cr((short)625, 137, 3); 
    int j = dh.c(paramArrayOfbyte, paramInt1 + 10);
    long l = dh.d(paramArrayOfbyte, paramInt1 + 12);
    if (j == 32768) {
      if (i < 36)
        throw new cr((short)625, 137, 4); 
      int n = dh.c(paramArrayOfbyte, paramInt1 + 16);
      if (i < 36 + n)
        throw new cr((short)625, 137, 5); 
      arrayOfByte1 = new byte[n];
      System.arraycopy(paramArrayOfbyte, paramInt1 + 6 + 10 + 2, arrayOfByte1, 0, n);
      str = String.valueOf(dh.b(paramArrayOfbyte, paramInt1 + 6 + 10 + 6 + 2 + n, false));
      k = dh.a(paramArrayOfbyte, paramInt1 + 6 + 10 + 10 + 2 + n, false);
      m = dh.a(paramArrayOfbyte, paramInt1 + 6 + 10 + 12 + 2 + n, false);
      arrayOfByte2 = new byte[i - 10 - 14 - 2 - n];
      System.arraycopy(paramArrayOfbyte, paramInt1 + 6 + 10 + 14 + 2 + n, arrayOfByte2, 0, i - 10 - 14 - 2 - n);
    } else {
      str = String.valueOf(dh.b(paramArrayOfbyte, paramInt1 + 6 + 10 + 6, false));
      k = dh.a(paramArrayOfbyte, paramInt1 + 6 + 10 + 10, false);
      m = dh.a(paramArrayOfbyte, paramInt1 + 6 + 10 + 12, false);
      arrayOfByte1 = new byte[0];
      arrayOfByte2 = new byte[i - 10 - 14];
      System.arraycopy(paramArrayOfbyte, paramInt1 + 6 + 10 + 14, arrayOfByte2, 0, i - 10 - 14);
    } 
    return new dg(l, j, m, str, k, arrayOfByte1, arrayOfByte2);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */