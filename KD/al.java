package KD;

import favax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Layer;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;

public final class al extends Canvas implements Runnable {
  private boolean a = true;
  
  private Thread b = null;
  
  private LayerManager c;
  
  private Sprite d;
  
  private Sprite e;
  
  private Sprite f;
  
  private Font g;
  
  private String h = "";
  
  private int i;
  
  private int j;
  
  public al(String paramString) {
    setFullScreenMode(true);
    t t = new t(getHeight(), getWidth());
    try {
      Image image1 = t.d();
      Image image2 = Image.createImage("/images/lib/lib_load.png");
      this.g = Font.getFont(0, 1, 8);
      this.i = (getWidth() - this.g.stringWidth(paramString)) / 2;
      this.j = getHeight() - this.g.getHeight() - 15;
      this.h = paramString;
      this.e = new Sprite(image1);
      this.d = new Sprite(t.b());
      this.f = new Sprite(image2, image2.getWidth() / 4, image2.getHeight());
      int i = (getWidth() - image1.getWidth()) / 2;
      int j;
      if ((j = (getHeight() - image1.getHeight()) / 2) % 2 != 1)
        j++; 
      this.e.setPosition(i, j);
      i = (getWidth() - image2.getWidth() / 4) / 2;
      j = this.j - image2.getHeight() - 1;
      this.f.setPosition(i, j);
      this.c = new LayerManager();
      this.c.append((Layer)this.e);
      this.c.append((Layer)this.f);
      this.c.append((Layer)this.d);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void a() {
    if (this.b == null) {
      this.a = true;
      this.b = new Thread(this);
      this.b.start();
    } 
  }
  
  public final void b() {
    this.a = false;
    if (this.b != null)
      this.b = null; 
  }
  
  public final void run() {
    while (this.a) {
      repaint();
      try {
        Thread.sleep(400L);
      } catch (Exception exception) {}
    } 
  }
  
  public final void a(String paramString) {
    this.h = paramString;
    this.i = (getWidth() - this.g.stringWidth(this.h)) / 2;
    this.j = getHeight() - this.g.getHeight() - 15;
  }
  
  public final void paint(Graphics paramGraphics) {
    if (isShown()) {
      this.f.nextFrame();
      this.c.paint(paramGraphics, 0, 0);
      paramGraphics.setFont(this.g);
      paramGraphics.setColor(70, 94, 116);
      paramGraphics.drawString(this.h, this.i, this.j, 0);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\al.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */