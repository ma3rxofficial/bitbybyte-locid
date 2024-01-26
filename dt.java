import java.io.InputStream;

public final class dt extends ej {
  public String a;
  
  public String b;
  
  public InputStream c;
  
  public int d;
  
  public dt(String paramString1, dm paramdm, int paramInt1, String paramString2, String paramString3, InputStream paramInputStream, int paramInt2) {
    super(0L, null, paramString1, paramInt1);
    this.h = paramdm;
    this.a = paramString2;
    this.b = paramString3;
    this.c = paramInputStream;
    this.d = paramInt2;
    this.h.u = this;
  }
  
  public final boolean a(int paramInt) {
    return (paramInt <= this.d / 2048);
  }
  
  public final byte[] b(int paramInt) {
    byte[] arrayOfByte;
    if (paramInt < this.d / 2048) {
      arrayOfByte = new byte[2049];
    } else {
      arrayOfByte = new byte[this.d % 2048 + 1];
    } 
    dh.a(arrayOfByte, 0, 6);
    try {
      this.c.read(arrayOfByte, 1, arrayOfByte.length - 1);
    } catch (Exception exception) {
      null.printStackTrace();
    } 
    return arrayOfByte;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dt.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */