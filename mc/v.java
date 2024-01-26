package mc;

import MiniCommander;
import favax.microedition.lcdui.Canvas;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public abstract class v extends Canvas {
  public aw a = null;
  
  public Canvas b = null;
  
  public Image c;
  
  public int d = 0;
  
  public int e = 0;
  
  public cu f = null;
  
  private boolean m = false;
  
  public Image g;
  
  public static int h = 0;
  
  public v i = this;
  
  public Thread j = null;
  
  public cv k = null;
  
  public Displayable l;
  
  public final void a() throws Exception {
    setFullScreenMode(true);
    b();
    this.f.b();
  }
  
  public abstract void b();
  
  public void paint(Graphics paramGraphics) {
    if (!this.m) {
      this.m = true;
      this.g = Image.createImage(this.c.getWidth(), this.c.getHeight());
    } 
    this.g.getGraphics().drawImage(this.c, 0, 0, 20);
    if (this.a != null) {
      cy cy = this.a.e[this.a.f];
      if (this.d == 0) {
        this.f.a(this.g.getGraphics(), cy.a, 0);
      } else if (this.d == 1) {
        this.f.a(this.g.getGraphics(), cy.e + cy.a, cy.f + aw.j.a * (cy.k - cy.j));
      } else if (this.d == 2) {
        this.f.a(this.g.getGraphics(), -1, -1);
      } 
    } else if (this.d == 0) {
      this.f.a(this.g.getGraphics(), 0, 0);
    } else if (this.d == 1) {
      this.f.a(this.g.getGraphics(), this.c.getWidth(), 0);
    } else if (this.d == 2) {
      this.f.a(this.g.getGraphics(), -1, -1);
    } 
    if (x.p == 0) {
      paramGraphics.drawImage(this.g, 0, 0, 20);
      return;
    } 
    Sprite sprite = new Sprite(this.g);
    if (x.p == 1) {
      sprite.setPosition(getWidth() - 1, 0);
      sprite.setTransform(5);
    } else {
      sprite.setPosition(0, getHeight() - 1);
      sprite.setTransform(6);
    } 
    sprite.paint(paramGraphics);
  }
  
  private void a(cv paramcv) throws Exception {
    try {
      boolean bool = false;
      byte b = 0;
      while (h != 0) {
        if (!paramcv.a) {
          if (h == 2) {
            if (this.e == 0) {
              int i;
              if ((i = this.f.i()) == -1) {
                Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((this.a != null) ? (Displayable)this.a : (Displayable)this.b);
                return;
              } 
            } else {
              this.f.e();
            } 
          } else if (h == 5) {
            if (this.e == 0) {
              cu.mc/bm mc/bm;
              if ((mc/bm = this.f.h()).c != null)
                this.f.a(true); 
            } else {
              this.f.f();
            } 
          } else if (h == 1) {
            this.f.c();
          } else if (h == 6) {
            this.f.d();
          } 
          repaint();
          serviceRepaints();
          if (bool) {
            Thread.sleep((b++ < 10) ? x.l : (x.l / 2));
            continue;
          } 
          Thread.sleep(x.k);
          bool = true;
          continue;
        } 
        return;
      } 
      return;
    } catch (Exception exception) {}
  }
  
  private void a(int paramInt) {
    h = paramInt;
    this.k = new cv();
    this.j = new bp(this);
    this.j.start();
    Thread.yield();
  }
  
  public void feyReleased(int paramInt) {
    cx.b(cx.a(this, paramInt));
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    i = cx.a(i);
    if (paramInt >= 48 && paramInt <= 57)
      return; 
    if (cx.a(i) == 8) {
      cu.mc/bm mc/bm;
      if ((mc/bm = this.f.h()).c != null) {
        this.f.a(true);
        repaint();
      } else {
        d();
        return;
      } 
    } else {
      h = 0;
      if (this.k != null)
        this.k.a = true; 
      this.j = null;
      System.gc();
    } 
  }
  
  public void keyRepeated(int paramInt) {}
  
  public void feyPressed(int paramInt) {
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    i = cx.a(i);
    String str = cx.b(cx.a(this, paramInt));
    if (paramInt >= 48 && paramInt <= 57) {
      paramInt -= 49;
      if (paramInt < this.f.g()) {
        int j;
        if ((j = this.f.b(paramInt)) == 2) {
          repaint();
        } else {
          if (j == 1)
            d(); 
          return;
        } 
      } 
    } else if (str.equals("SOFT1") || str.equals("BACK") || str.equals("C")) {
      int j;
      if ((j = this.f.i()) == -1) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((this.a != null) ? (Displayable)this.a : (Displayable)this.b);
      } else {
        repaint();
        return;
      } 
    } else if (str.equals("SOFT2") || str.equals("SOFT3")) {
      cu.mc/bm mc/bm;
      if ((mc/bm = this.f.h()).c != null) {
        this.f.a(true);
        repaint();
      } else {
        d();
        return;
      } 
    } else {
      if (i == 2 || i == 5 || i == 1 || i == 6) {
        a(i);
        return;
      } 
      if (!str.equals("BACK"))
        str.equals("C"); 
    } 
  }
  
  private void d() {
    cu.mc/bm mc/bm;
    int i = (mc/bm = this.f.h()).a;
    String str = mc/bm.b;
    c();
    a(i, str);
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public final void c() {
    this.f.a();
  }
  
  public final void a(Displayable paramDisplayable) {
    this.l = paramDisplayable;
    de de;
    (de = new de(this)).start();
    try {
      Thread.yield();
      Thread.sleep(20L);
      return;
    } catch (InterruptedException interruptedException) {
      return;
    } 
  }
  
  public void pointerPressed(int paramInt1, int paramInt2) {
    if (!x.N)
      return; 
  }
  
  public static void a(v paramv1, v paramv2, cv paramcv) throws Exception {
    paramv1.a(paramcv);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\v.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */