package mc;

import javax.microedition.lcdui.Image;

public final class mc/bm {
  public int a;
  
  public String b;
  
  public cu c;
  
  public boolean d;
  
  private final cu e;
  
  public mc/bm(cu paramcu, int paramInt, String paramString) {
    this.e = paramcu;
    this.c = null;
    this.d = false;
    this.a = paramInt;
    this.b = paramString;
  }
  
  public final cu a(Image paramImage) {
    if (this.c == null)
      this.c = new cu(this.e.a, paramImage, this.e.e); 
    this.c.b = this.e.b;
    return this.c;
  }
  
  public static cu a(mc/bm parammc/bm) {
    return parammc/bm.c;
  }
  
  public static cu a(mc/bm parammc/bm, cu paramcu) {
    return parammc/bm.c = paramcu;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bm.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */