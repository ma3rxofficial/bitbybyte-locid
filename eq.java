public final class eq extends dd {
  public String a;
  
  public String b;
  
  public byte[] c;
  
  public int d;
  
  public String e;
  
  private eq(String paramString1, String paramString2, byte[] paramArrayOfbyte) {
    this.a = paramString1;
    this.b = paramString2;
    this.c = new byte[paramArrayOfbyte.length];
    System.arraycopy(paramArrayOfbyte, 0, this.c, 0, paramArrayOfbyte.length);
    this.d = -1;
    this.e = null;
  }
  
  private eq(int paramInt, String paramString) {
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = paramInt;
    this.e = new String(paramString);
  }
  
  private eq(int paramInt) {
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = -1;
    this.e = null;
  }
  
  public eq() {
    this(-1);
  }
  
  public final int a() {
    return (this.a != null) ? 1 : ((this.d >= 0) ? 2 : 3);
  }
  
  public final String b() {
    return (a() == 1) ? this.b : null;
  }
  
  public final byte[] c() {
    if (a() == 1) {
      byte[] arrayOfByte = new byte[this.c.length];
      System.arraycopy(this.c, 0, arrayOfByte, 0, this.c.length);
      return arrayOfByte;
    } 
    return null;
  }
  
  public final int d() {
    return (a() == 2) ? this.d : -1;
  }
  
  public final byte[] a(int paramInt) {
    int i = 6;
    if (a() == 1) {
      i = 6 + 4 + this.a.length() + 4 + this.b.length() + 4 + this.c.length;
    } else if (a() == 2) {
      i = 12 + 4 + this.e.length();
    } 
    byte[] arrayOfByte;
    dh.a(arrayOfByte = new byte[i], 0, 42);
    dh.a(arrayOfByte, 1, 4);
    dh.b(arrayOfByte, 2, paramInt);
    dh.b(arrayOfByte, 4, i - 6);
    int j = 0;
    if (a() == 1) {
      dh.b(arrayOfByte, 6, 1);
      dh.b(arrayOfByte, 8, this.a.length());
      byte[] arrayOfByte1;
      System.arraycopy(arrayOfByte1 = dh.a(this.a), 0, arrayOfByte, 10, arrayOfByte1.length);
      j = 6 + 4 + arrayOfByte1.length;
      dh.b(arrayOfByte, j, 5);
      dh.b(arrayOfByte, j + 2, this.b.length());
      byte[] arrayOfByte2;
      System.arraycopy(arrayOfByte2 = dh.a(this.b), 0, arrayOfByte, j + 4, arrayOfByte2.length);
      j += 4 + arrayOfByte2.length;
      dh.b(arrayOfByte, j, 6);
      dh.b(arrayOfByte, j + 2, this.c.length);
      System.arraycopy(this.c, 0, arrayOfByte, j + 4, this.c.length);
    } else if (a() == 2) {
      dh.b(arrayOfByte, 6, 1);
      dh.b(arrayOfByte, 8, this.a.length());
      byte[] arrayOfByte1;
      System.arraycopy(arrayOfByte1 = dh.a(this.a), 0, arrayOfByte, 10, arrayOfByte1.length);
      j = 6 + 4 + arrayOfByte1.length;
      dh.b(arrayOfByte, j, 4);
      dh.b(arrayOfByte, j + 2, this.e.length());
      byte[] arrayOfByte2;
      System.arraycopy(arrayOfByte2 = dh.a(this.e), 0, arrayOfByte, j + 4, arrayOfByte2.length);
      dh.b(arrayOfByte, j, 8);
      dh.b(arrayOfByte, j + 2, 2);
      dh.b(arrayOfByte, j + 4, this.d);
    } 
    return arrayOfByte;
  }
  
  public static dd a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws cr {
    int i = dh.c(paramArrayOfbyte, paramInt1 + 2);
    String str1 = null;
    String str2 = null;
    byte[] arrayOfByte = null;
    int j = -1;
    String str3 = null;
    int k = paramInt1 + 6;
    String str4;
    for (str4 = ""; k < paramInt1 + paramInt2; str4 = str4 + " [" + m + "] " + dh.c(arrayOfByte1)) {
      byte[] arrayOfByte1;
      if ((arrayOfByte1 = dh.e(paramArrayOfbyte, k)) == null)
        throw new cr((short)623, 135, 0); 
      int m = dh.c(paramArrayOfbyte, k);
      k += 4 + arrayOfByte1.length;
      switch (m) {
        case 1:
          str1 = dh.a(arrayOfByte1);
          break;
        case 5:
          str2 = dh.a(arrayOfByte1);
          break;
        case 6:
          arrayOfByte = arrayOfByte1;
          break;
        case 8:
        case 9:
          j = dh.c(arrayOfByte1, 0);
          break;
        case 4:
        case 11:
          str3 = dh.a(arrayOfByte1);
          break;
      } 
    } 
    if (str1 == null && str2 == null && arrayOfByte == null && j == -1 && str3 == null)
      return new eq(i); 
    if (str1 != null && str2 != null && arrayOfByte != null && j == -1 && str3 == null)
      return new eq(str1, str2, arrayOfByte); 
    if (str2 == null && arrayOfByte == null && j != -1 && str3 != null)
      return new eq(j, str3); 
    cl.a(0, "", "Error 135.2", "Connection Error: " + str4);
    return null;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\eq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */