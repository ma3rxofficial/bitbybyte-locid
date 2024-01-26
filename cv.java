public final class cv extends bg {
  private bt c;
  
  public cv(bt parambt) {
    super(false, true);
    this.c = parambt;
  }
  
  public final void b() throws cr {
    byte[] arrayOfByte1 = dh.a(this.c.g);
    byte[] arrayOfByte2 = dh.a(this.c.c, true);
    if (this.c.a == 4) {
      byte[] arrayOfByte;
      if (this.c.b) {
        arrayOfByte = new byte[1 + arrayOfByte1.length + 1 + 4];
      } else {
        arrayOfByte = new byte[1 + arrayOfByte1.length + 1 + 2 + arrayOfByte2.length];
      } 
      int i = 0;
      dh.a(arrayOfByte, 0, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, 1, arrayOfByte1.length);
      i = 0 + 1 + arrayOfByte1.length;
      if (this.c.b) {
        dh.a(arrayOfByte, i, 1);
        dh.b(arrayOfByte, ++i, 0);
        i += 2;
        dh.b(arrayOfByte, i, 0);
      } else {
        dh.a(arrayOfByte, i, 0);
        dh.b(arrayOfByte, ++i, arrayOfByte2.length);
        i += 2;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte, i, arrayOfByte2.length);
      } 
      bj bj = new bj(19, 26, 26L, new byte[0], arrayOfByte);
      cd.i.a(bj);
      return;
    } 
    if (this.c.a == 5) {
      byte[] arrayOfByte = new byte[1 + arrayOfByte1.length + 2 + arrayOfByte2.length + 2];
      int i = 0;
      dh.a(arrayOfByte, 0, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, 1, arrayOfByte1.length);
      i = 0 + 1 + arrayOfByte1.length;
      dh.b(arrayOfByte, i, arrayOfByte2.length);
      i += 2;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte, i, arrayOfByte2.length);
      i += arrayOfByte2.length;
      dh.b(arrayOfByte, i, 0);
      bj bj = new bj(19, 24, 24L, new byte[0], arrayOfByte);
      cd.i.a(bj);
    } 
  }
  
  public final boolean a(dd paramdd) throws cr {
    return false;
  }
  
  public final boolean c() {
    return true;
  }
  
  public final boolean d() {
    return false;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */