public class bj extends dd {
  public int a;
  
  public int b;
  
  public int c;
  
  public long d;
  
  public byte[] e;
  
  public byte[] f;
  
  public bj(int paramInt1, int paramInt2, int paramInt3, long paramLong, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramLong;
    this.e = paramArrayOfbyte1;
    this.f = paramArrayOfbyte2;
  }
  
  public bj(int paramInt1, int paramInt2, long paramLong, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(paramInt1, paramInt2, 0, paramLong, paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public final byte[] a() {
    byte[] arrayOfByte = new byte[this.f.length];
    System.arraycopy(this.f, 0, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public byte[] a(int paramInt) {
    byte[] arrayOfByte;
    dh.a(arrayOfByte = new byte[16 + this.f.length + ((this.e.length > 0) ? (2 + this.e.length) : 0)], 0, 42);
    dh.a(arrayOfByte, 1, 2);
    dh.b(arrayOfByte, 2, paramInt);
    dh.b(arrayOfByte, 4, 10 + this.f.length + ((this.e.length > 0) ? (2 + this.e.length) : 0));
    dh.b(arrayOfByte, 6, this.a);
    dh.b(arrayOfByte, 8, this.b);
    dh.b(arrayOfByte, 10, (this.e.length > 0) ? 32768 : 0);
    dh.a(arrayOfByte, 12, this.d);
    if (this.e.length > 0) {
      dh.b(arrayOfByte, 16, this.e.length);
      System.arraycopy(this.e, 0, arrayOfByte, 18, this.e.length);
      System.arraycopy(this.f, 0, arrayOfByte, 18 + this.e.length, this.f.length);
    } else {
      System.arraycopy(this.f, 0, arrayOfByte, 16, this.f.length);
    } 
    return arrayOfByte;
  }
  
  public static dd a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws cr {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    int i;
    if ((i = dh.c(paramArrayOfbyte, paramInt1 + 4)) < 10)
      throw new cr((short)621, 133, 0); 
    int j = dh.c(paramArrayOfbyte, paramInt1 + 6);
    int k = dh.c(paramArrayOfbyte, paramInt1 + 8);
    if (j == 21 && k == 2)
      return dg.a(paramArrayOfbyte, paramInt1, paramInt2); 
    if (j == 21 && k == 3)
      return ex.a(paramArrayOfbyte, paramInt1, paramInt2); 
    int m = dh.c(paramArrayOfbyte, paramInt1 + 10);
    long l = dh.d(paramArrayOfbyte, paramInt1 + 12);
    if (m == 32768) {
      if (i < 12)
        throw new cr((short)621, 133, 1); 
      int n = dh.c(paramArrayOfbyte, paramInt1 + 16);
      if (i < 12 + n)
        throw new cr((short)621, 133, 2); 
      arrayOfByte1 = new byte[n];
      System.arraycopy(paramArrayOfbyte, paramInt1 + 6 + 10 + 2, arrayOfByte1, 0, n);
      arrayOfByte2 = new byte[i - 10 - 2 - n];
      System.arraycopy(paramArrayOfbyte, paramInt1 + 6 + 10 + 2 + n, arrayOfByte2, 0, i - 10 - 2 - n);
    } else {
      arrayOfByte1 = new byte[0];
      arrayOfByte2 = new byte[i - 10];
      System.arraycopy(paramArrayOfbyte, paramInt1 + 16, arrayOfByte2, 0, i - 10);
    } 
    return new bj(j, k, m, l, arrayOfByte1, arrayOfByte2);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */