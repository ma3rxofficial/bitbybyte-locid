public final class cm extends dd {
  public byte[] a = null;
  
  public String b;
  
  public String c;
  
  private cm(int paramInt) {
    this.b = null;
    this.c = null;
  }
  
  public cm() {
    this(-1);
  }
  
  private cm(int paramInt, byte[] paramArrayOfbyte) {
    System.arraycopy(paramArrayOfbyte, 0, this.a, 0, paramArrayOfbyte.length);
    this.b = null;
    this.c = null;
  }
  
  public cm(byte[] paramArrayOfbyte) {
    this(-1, paramArrayOfbyte);
  }
  
  private cm(int paramInt, String paramString1, String paramString2) {
    this.b = new String(paramString1);
    this.c = new String(paramString2);
  }
  
  public cm(String paramString1, String paramString2) {
    this(-1, paramString1, paramString2);
  }
  
  public final int a() {
    return (this.a == null && this.b == null) ? 1 : ((this.b != null) ? 3 : 2);
  }
  
  public final byte[] a(int paramInt) {
    int i = 10;
    if (a() == 2) {
      i = 10 + 4 + this.a.length;
    } else if (a() == 3) {
      i = 10 + 4 + this.b.length() + 4 + this.c.length();
    } 
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    dh.a(arrayOfByte, 0, 42);
    dh.a(arrayOfByte, 1, 1);
    dh.b(arrayOfByte, 2, paramInt);
    dh.b(arrayOfByte, 4, i - 6);
    dh.a(arrayOfByte, 6, 1L);
    if (a() == 2) {
      dh.b(arrayOfByte, 10, 6);
      dh.b(arrayOfByte, 12, this.a.length);
      System.arraycopy(this.a, 0, arrayOfByte, 14, this.a.length);
    } else if (a() == 3) {
      dh.b(arrayOfByte, 10, 1);
      dh.b(arrayOfByte, 12, this.b.length());
      byte[] arrayOfByte1;
      System.arraycopy(arrayOfByte1 = dh.a(this.b), 0, arrayOfByte, 14, arrayOfByte1.length);
      j = 10 + 4 + arrayOfByte1.length;
      dh.b(arrayOfByte, j, 2);
      dh.b(arrayOfByte, j + 2, this.c.length());
      byte[] arrayOfByte2;
      System.arraycopy(arrayOfByte2 = dh.f(dh.a(this.c), 0), 0, arrayOfByte, j + 4, arrayOfByte2.length);
    } 
    return arrayOfByte;
  }
  
  public static dd a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws cr {
    int i = dh.c(paramArrayOfbyte, paramInt1 + 2);
    if (dh.c(paramArrayOfbyte, paramInt1 + 4) < 4 || dh.d(paramArrayOfbyte, paramInt1 + 6) != 1L)
      throw new cr((short)620, 132, 0); 
    byte[] arrayOfByte1 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    byte[] arrayOfByte2 = null;
    int j = paramInt1 + 10;
    while (j < paramInt1 + paramInt2) {
      byte[] arrayOfByte;
      if ((arrayOfByte = dh.e(paramArrayOfbyte, j)) == null)
        throw new cr((short)620, 132, 1); 
      int k = dh.c(paramArrayOfbyte, j);
      j += 4 + arrayOfByte.length;
      switch (k) {
        case 6:
          arrayOfByte1 = arrayOfByte;
          continue;
        case 1:
          str1 = dh.a(arrayOfByte);
          continue;
        case 2:
          str2 = dh.a(dh.f(arrayOfByte, 0));
          continue;
        case 3:
          str3 = dh.a(arrayOfByte);
          continue;
        case 22:
          arrayOfByte2 = arrayOfByte;
          continue;
        case 23:
        case 24:
        case 25:
        case 26:
        case 20:
          continue;
        case 15:
          dh.a(arrayOfByte);
          continue;
        case 14:
          dh.a(arrayOfByte);
          continue;
        case 32769:
          continue;
      } 
      throw new cr((short)620, 132, 2);
    } 
    if (arrayOfByte1 == null && str1 == null && str2 == null && str3 == null && arrayOfByte2 == null)
      return new cm(i); 
    if (arrayOfByte1 != null && str1 == null && str2 == null && str3 == null && arrayOfByte2 == null)
      return new cm(i, arrayOfByte1); 
    if (arrayOfByte1 == null && str1 != null && str2 != null && str3 != null && arrayOfByte2 != null)
      return new cm(i, str1, str2); 
    throw new cr((short)620, 132, 3);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */