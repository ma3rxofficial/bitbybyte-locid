import java.io.ByteArrayOutputStream;

public final class h extends ByteArrayOutputStream {
  public h() {}
  
  public h(int paramInt) {
    super(paramInt);
  }
  
  public h(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte.length);
    a(paramArrayOfbyte);
  }
  
  public final void a(byte[] paramArrayOfbyte) {
    this.buf = null;
    this.buf = new byte[paramArrayOfbyte.length];
    System.arraycopy(paramArrayOfbyte, 0, this.buf, 0, paramArrayOfbyte.length);
    this.count = paramArrayOfbyte.length;
  }
  
  public final byte[] a() {
    return toByteArray();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\h.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */