public final class fe extends bg {
  private String c;
  
  public fe(String paramString) {
    super(false, true);
    this.c = paramString;
  }
  
  public final void b() throws cr {
    byte[] arrayOfByte2 = dh.a(this.c);
    byte[] arrayOfByte1;
    dh.a(arrayOfByte1 = new byte[1 + arrayOfByte2.length], 0, arrayOfByte2.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 1, arrayOfByte2.length);
    bj bj = new bj(19, 22, 3L, new byte[0], arrayOfByte1);
    cd.i.a(bj);
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


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\fe.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */