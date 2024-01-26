import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class ba extends Canvas {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final Font e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private String j;
  
  private String k;
  
  public ba(int paramInt1, int paramInt2) {
    setFullScreenMode(bd.l);
    this.h = paramInt1;
    this.f = em.g(this.h);
    this.g = fa.ae[paramInt2];
    this.a = getHeight();
    this.b = getWidth();
    this.e = Font.getFont(32, 1, 0);
    this.c = this.e.charWidth('0') + 2;
    this.d = this.a - this.e.getHeight() - 7;
    this.k = "00000" + Integer.toHexString(this.f).toUpperCase();
    this.k = this.k.substring(this.k.length() - 6);
    cz.a(true);
  }
  
  public final void keyPressed(int paramInt) {
    int i = getGameAction(paramInt);
    int j = 1048576 >> this.i * 4;
    int k = 15728640 >> this.i * 4;
    if (paramInt >= 48 && paramInt <= 57) {
      this.g = this.g & (k ^ 0xFFFFFFFF) | j * (paramInt - 48);
      this.i = (this.i + 7) % 6;
    } else if (paramInt == 35) {
      this.g |= k;
      this.i = (this.i + 7) % 6;
    } else if (i == 2 || i == 5) {
      this.i = (this.i + ((i != 2) ? 1 : -1) + 6) % 6;
    } else if (i == 1 || i == 6) {
      this.g = this.g & (k ^ 0xFFFFFFFF) | this.g + ((i != 1) ? -j : j) & k;
    } else if (i == 8 || i == 8) {
      a(this.h, Integer.parseInt(this.j, 16));
    } else {
      dw.d();
    } 
    repaint();
  }
  
  private static void a(int paramInt1, int paramInt2) {
    em.b(paramInt1, paramInt2);
    em.b();
    em.y.b();
  }
  
  public final void paint(Graphics paramGraphics) {
    paramGraphics.setColor(16777215);
    paramGraphics.fillRect(0, 0, this.b, this.a);
    paramGraphics.setColor(em.g(this.h));
    paramGraphics.fillRect(2, 2, this.b - 4, (this.d - 4) / 2);
    dw.a(paramGraphics, this.e, bd.r(this.f), this.k, this.b / 2, (this.d - 4) / 4, 17, 0);
    dw.a(paramGraphics, this.e, bd.r(this.f), bb.a(em.e[this.h]), 3, 3, 0, 0);
    paramGraphics.setColor(this.g);
    paramGraphics.fillRect(2, this.d / 2, this.b - 4, (this.d - 4) / 2);
    paramGraphics.setColor(0);
    paramGraphics.drawRect(0, 0, this.b - 1, this.d - 1);
    this.j = "00000" + Integer.toHexString(this.g).toUpperCase();
    this.j = this.j.substring(this.j.length() - 6);
    int i = (this.b - 6 * this.c) / 2;
    int j;
    boolean bool = ((j = em.f[this.h]) >= 2000) ? true : false;
    j %= 1000;
    if (bool) {
      paramGraphics.setColor(this.g);
    } else {
      paramGraphics.setColor(em.d[j]);
    } 
    String str = bool ? "Back" : "Text";
    int k = 2 + paramGraphics.getFont().getHeight();
    paramGraphics.fillRect(3, this.a - 5 - k, paramGraphics.getFont().stringWidth(str) + 2, k);
    int m = this.g;
    if (bool)
      m = em.d[j]; 
    dw.a(paramGraphics, null, m, str, 4, this.a - k - 4, 20, 0);
    for (byte b = 0; b < this.j.length(); b++) {
      dw.a(paramGraphics, null, (b >= 2) ? ((b >= 4) ? 2105568 : 2154528) : 14688288, this.j.substring(b, b + 1), i + b * this.c, this.d + 4, 20, 0);
      if (b == this.i) {
        paramGraphics.setColor(0);
        paramGraphics.fillRect(i + b * this.c, this.d + 3, this.c - 3, 2);
        paramGraphics.fillRect(i + b * this.c, this.d + this.e.getHeight() + 3, this.c - 3, 2);
      } 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ba.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */