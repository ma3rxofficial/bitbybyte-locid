public final class ch {
  public byte[] a;
  
  public ch(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
  }
  
  public final boolean a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != this.a.length)
      return false; 
    for (byte b = 0; b < this.a.length; b++) {
      if (paramArrayOfbyte[b] != this.a[b])
        return false; 
    } 
    return true;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ch.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */