package mc;

public final class ah {
  private short[] c;
  
  public static ah a;
  
  public static ah b;
  
  public ah(byte[] paramArrayOfbyte) throws y {
    a(paramArrayOfbyte);
  }
  
  private void a(byte[] paramArrayOfbyte) throws y {
    int[] arrayOfInt1 = new int[16];
    int[] arrayOfInt2 = new int[16];
    int i;
    for (i = 0; i < paramArrayOfbyte.length; i++) {
      byte b1;
      if ((b1 = paramArrayOfbyte[i]) > 0)
        arrayOfInt1[b1] = arrayOfInt1[b1] + 1; 
    } 
    i = 0;
    int j = 512;
    int k;
    for (k = 1; k <= 15; k++) {
      arrayOfInt2[k] = i;
      i += arrayOfInt1[k] << 16 - k;
      if (k >= 10) {
        int m = arrayOfInt2[k] & 0x1FF80;
        int n = i & 0x1FF80;
        j += n - m >> 16 - k;
      } 
    } 
    if (i != 65536)
      throw new y("Code lengths don't add up properly."); 
    this.c = new short[j];
    k = 512;
    byte b;
    for (b = 15; b >= 10; b--) {
      int m = i & 0x1FF80;
      for (int n = (i -= arrayOfInt1[b] << 16 - b) & 0x1FF80, i1 = n; i1 < m; i1 += 128) {
        this.c[ck.a(i1)] = (short)(-k << 4 | b);
        k += 1 << b - 9;
      } 
    } 
    for (b = 0; b < paramArrayOfbyte.length; b++) {
      byte b1;
      if ((b1 = paramArrayOfbyte[b]) != 0) {
        int m = ck.a(i = arrayOfInt2[b1]);
        if (b1 <= 9) {
          do {
            this.c[m] = (short)(b << 4 | b1);
          } while ((m = m + (1 << b1)) < 512);
        } else {
          short s = this.c[m & 0x1FF];
          int i1 = 1 << (s & 0xF);
          int n = -(s >> 4);
          do {
            this.c[n | m >> 9] = (short)(b << 4 | b1);
          } while ((m += 1 << b1) < i1);
        } 
        arrayOfInt2[b1] = i + (1 << 16 - b1);
      } 
    } 
  }
  
  public final int a(br parambr) throws y {
    int i;
    if ((i = parambr.a(9)) >= 0) {
      short s1;
      if ((s1 = this.c[i]) >= 0) {
        parambr.b(s1 & 0xF);
        return s1 >> 4;
      } 
      int k = -(s1 >> 4);
      int m = s1 & 0xF;
      if ((i = parambr.a(m)) >= 0) {
        s1 = this.c[k | i >> 9];
        parambr.b(s1 & 0xF);
        return s1 >> 4;
      } 
      int n = parambr.a;
      i = parambr.a(n);
      if (((s1 = this.c[k | i >> 9]) & 0xF) <= n) {
        parambr.b(s1 & 0xF);
        return s1 >> 4;
      } 
      return -1;
    } 
    int j = parambr.a;
    i = parambr.a(j);
    short s;
    if ((s = this.c[i]) >= 0 && (s & 0xF) <= j) {
      parambr.b(s & 0xF);
      return s >> 4;
    } 
    return -1;
  }
  
  static {
    try {
      byte[] arrayOfByte = new byte[288];
      byte b = 0;
      while (b < '')
        arrayOfByte[b++] = 8; 
      while (b < 'Ā')
        arrayOfByte[b++] = 9; 
      while (b < 'Ę')
        arrayOfByte[b++] = 7; 
      while (b < 'Ġ')
        arrayOfByte[b++] = 8; 
      a = new ah(arrayOfByte);
      arrayOfByte = new byte[32];
      b = 0;
      while (b < 32)
        arrayOfByte[b++] = 5; 
      b = new ah(arrayOfByte);
      return;
    } catch (y y) {
      throw new Error("InflaterHuffmanTree: static tree length illegal");
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ah.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */