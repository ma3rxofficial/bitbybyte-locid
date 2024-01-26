package mc;

import favax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public abstract class dl extends Canvas {
  public final boolean a(int paramInt1, int paramInt2) {
    if (!x.N)
      return true; 
    if (paramInt2 > cx.b(this) - aw.l.getHeight()) {
      int i = cx.a(this);
      aw.l.getHeight();
      cx.b(this);
      int j = i / 14;
      int k = (i - j * 14) / 2;
      for (byte b = 0; b < 14; b++) {
        if (paramInt1 >= k + b * j && paramInt1 < k + b * j + j - 2) {
          int m = 0;
          if (b == 11) {
            m = 48;
          } else if (b == 0) {
            m = -21;
          } else if (b == 13) {
            m = -22;
          } else if (b == 1) {
            m = 42;
          } else if (b == 12) {
            m = 35;
          } else {
            m = 49 + b - 2;
          } 
          feyPressed(m);
          break;
        } 
      } 
      return true;
    } 
    return false;
  }
  
  public final void a(Graphics paramGraphics) {
    if (!x.N)
      return; 
    String str = "L*1234567890#R";
    int i = cx.a(this);
    int j = aw.l.getHeight();
    int k = cx.b(this) - j;
    int m = i / 14;
    int n = (i - m * 14) / 2;
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, k - 2, i, j + 2);
    paramGraphics.setColor(16777215);
    byte b;
    for (b = 0; b < 14; b++)
      paramGraphics.fillRect(n + b * m, k, m - 2, j); 
    paramGraphics.setFont(aw.l);
    paramGraphics.setColor(0);
    for (b = 0; b < 14; b++)
      paramGraphics.drawString("" + str.charAt(b), n + b * m + m / 2 - aw.l.charWidth(str.charAt(b)) / 2, k, 20); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\dl.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */