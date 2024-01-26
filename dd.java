public class dd {
  public int g;
  
  public byte[] h;
  
  public dd() {}
  
  public dd(int paramInt, byte[] paramArrayOfbyte) {
    this.g = paramInt;
    this.h = paramArrayOfbyte;
  }
  
  public byte[] a(int paramInt) {
    byte[] arrayOfByte;
    dh.a(arrayOfByte = new byte[6 + this.h.length], 0, 42);
    dh.a(arrayOfByte, 1, this.g);
    dh.b(arrayOfByte, 2, paramInt);
    dh.b(arrayOfByte, 4, this.h.length);
    System.arraycopy(this.h, 0, arrayOfByte, 6, this.h.length);
    return arrayOfByte;
  }
  
  public static dd a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws cr {
    if (paramInt2 < 2)
      throw new cr((short)618, 130, 0); 
    if (dh.a(paramArrayOfbyte, paramInt1) != 42)
      return ck.a(paramArrayOfbyte, paramInt1, paramInt2); 
    int i;
    if ((i = dh.a(paramArrayOfbyte, paramInt1 + 1)) < 1 || i > 5)
      throw new cr((short)618, 130, 2); 
    if (dh.c(paramArrayOfbyte, paramInt1 + 4) + 6 != paramInt2)
      throw new cr((short)618, 130, 3); 
    switch (i) {
      case 1:
        return cm.a(paramArrayOfbyte, paramInt1, paramInt2);
      case 2:
        return bj.a(paramArrayOfbyte, paramInt1, paramInt2);
      case 4:
        return eq.a(paramArrayOfbyte, paramInt1, paramInt2);
    } 
    return null;
  }
  
  public static dd a(byte[] paramArrayOfbyte) throws cr {
    return a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */