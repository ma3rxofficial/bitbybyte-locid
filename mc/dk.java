package mc;

public final class dk {
  private static final int[] a = new int[256];
  
  private int b = -1;
  
  public final dk a() {
    this.b = -1;
    return this;
  }
  
  public final dk a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt2; i++)
      this.b = this.b >>> 8 & 0xFFFFFF ^ a[(this.b ^ paramArrayOfbyte[i]) & 0xFF]; 
    return this;
  }
  
  public final int b() {
    return this.b ^ 0xFFFFFFFF;
  }
  
  static {
    for (short s = 0; s < 256; s = (short)(s + 1)) {
      int i = s;
      for (byte b = 1; b < 9; b = (byte)(b + 1))
        i = ((i & 0x1) == 1) ? (i >>> 1 ^ 0xEDB88320) : (i >>> 1); 
      a[s] = i;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\dk.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */