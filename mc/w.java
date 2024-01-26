package mc;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class w {
  public Image a;
  
  private Graphics b;
  
  private am c;
  
  private int d;
  
  public w(int paramInt1, int paramInt2, am paramam) {
    this.a = Image.createImage(paramInt1, paramInt2);
    this.b = this.a.getGraphics();
    this.c = paramam;
    this.d = paramInt2 - paramam.a;
    a();
  }
  
  public final void a() {
    this.b.setColor(0);
    this.b.fillRect(0, 0, this.a.getWidth(), this.a.getHeight());
  }
  
  private void b() {
    this.b.copyArea(0, this.c.a, this.a.getWidth(), this.d, 0, 0, 0);
    this.b.setColor(0);
    this.b.fillRect(0, this.d, this.a.getWidth(), this.c.a);
  }
  
  public final synchronized void a(String paramString, int paramInt) {
    int i = paramString.length();
    int[] arrayOfInt = new int[1];
    int j;
    for (j = 0; i > 0; j += arrayOfInt[0]) {
      b();
      String str = paramString.substring(j, paramString.length());
      this.c.b(this.b, str, 0, this.d, this.a.getWidth(), paramInt, arrayOfInt);
      i -= arrayOfInt[0];
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\w.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */