package mc;

import MiniCommander;
import favax.microedition.lcdui.Canvas;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class ci extends Canvas implements CommandListener {
  public am a = aw.j;
  
  public ae b;
  
  public boolean c = false;
  
  public int d = 0;
  
  public int e = 0;
  
  public Image f = null;
  
  public Graphics g = null;
  
  public int h = 0;
  
  public int i = 0;
  
  public int j = 0;
  
  public int k = 0;
  
  public int l = 0;
  
  public int m = 0;
  
  public int n = 0;
  
  public int o = 0;
  
  public int p = 0;
  
  public int q = 0;
  
  public int r = 0;
  
  public int s = 0;
  
  public int t = 0;
  
  public int[] u = new int[] { 0, 0, 0 };
  
  public int v = 0;
  
  public static int w = 0;
  
  public ci x = this;
  
  public Thread y = null;
  
  public cv z = null;
  
  public ci(ae paramae, int paramInt) {
    this.b = paramae;
    this.u[0] = (paramInt & 0xFF0000) >> 16;
    this.u[1] = (paramInt & 0xFF00) >> 8;
    this.u[2] = paramInt & 0xFF;
    try {
      a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void a() throws Exception {
    setCommandListener(this);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
  }
  
  private void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.g.setColor(16777215);
      this.g.fillRect(0, 0, this.d, this.e);
      this.g.setColor(0);
      this.g.drawRect(this.j, this.k, this.i, this.h);
      for (byte b1 = 0; b1 < 3; b1++) {
        for (byte b2 = 0; b2 <= this.p; b2++) {
          int m = 255 * b2 / this.p;
          if (b1 == 1)
            m <<= 8; 
          if (b1 == 0)
            m <<= 16; 
          int k = this.r + b1 * this.s + 4;
          int j = this.q + b2;
          this.g.setColor(m);
          this.g.drawLine(j, k, j, k + this.t);
        } 
      } 
    } 
    int i = this.u[0] << 16 | this.u[1] << 8 | this.u[2];
    this.g.setColor(i);
    this.g.fillRect(this.j + 2, this.k + 2, this.i - 3, this.h - 3);
    for (byte b = 0; b < 3; b++) {
      int j = this.q + this.p * this.u[b] / 255;
      int k = this.r + b * this.s + 3;
      if (!paramBoolean) {
        this.g.setColor(16777215);
        this.g.fillRect(this.q - 1, k - 1, this.p + 3, 2);
        this.g.fillRect(this.q - 1, k + this.t + 2, this.p + 3, 2);
        this.g.fillRect(this.q + this.p + 3, k + 1 + this.n, this.l * 2, this.m);
      } 
      this.g.setColor(0);
      this.g.drawLine(j - 1, k - 1, j + 1, k - 1);
      this.g.drawLine(j, k, j, k);
      this.g.drawLine(j - 1, k + 3 + this.t, j + 1, k + 3 + this.t);
      this.g.drawLine(j, k + this.t + 2, j, k + this.t + 2);
      this.a.a(this.g, cx.b(this.u[b], 2), this.q + this.p + 3, k + 1 + this.n, 0, 0);
    } 
    this.g.setColor(0);
    this.g.drawRect(0, this.r + this.s * this.v, this.d - 1, this.s);
    repaint();
  }
  
  public final void paint(Graphics paramGraphics) {
    if (!this.c) {
      this.c = true;
      this.d = cx.a(this);
      this.e = cx.b(this);
      this.f = Image.createImage(this.d, this.e);
      this.g = this.f.getGraphics();
      this.m = this.a.a;
      int i = 0;
      for (byte b = 0; b < "0123456789ABCDEF".length(); b++) {
        if ((i = this.a.d("0123456789ABCDEF".substring(b, b + 1))) > this.l)
          this.l = i; 
      } 
      this.p = this.d - 7;
      this.t = this.m;
      if (this.m >= 15 && this.e < 140) {
        this.n = -1;
        this.t -= 4;
      } 
      this.s = this.t + 8;
      this.o = this.s * 3;
      this.q = 3;
      this.r = this.e - this.o - 1;
      this.p -= this.l * 2 + 2;
      this.h = this.e - this.o - 6;
      this.i = this.h;
      if (this.i > this.d) {
        this.i = this.d - 2;
        this.h = this.i;
      } 
      this.k = 2;
      this.j = (this.d - this.i) / 2;
      a(true);
    } 
    if (x.p == 0) {
      paramGraphics.drawImage(this.f, 0, 0, 20);
      return;
    } 
    if (x.p == 1) {
      Sprite sprite1;
      (sprite1 = new Sprite(this.f)).setPosition(getWidth() - 1, 0);
      sprite1.setTransform(5);
      sprite1.paint(paramGraphics);
      return;
    } 
    Sprite sprite;
    (sprite = new Sprite(this.f)).setPosition(0, getHeight() - 1);
    sprite.setTransform(6);
    sprite.paint(paramGraphics);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() != 2 && paramCommand.getCommandType() == 4) {
      int i = this.u[0] << 16 | this.u[1] << 8 | this.u[2];
      this.b.a(i);
    } 
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.b);
  }
  
  public final void feyReleased(int paramInt) {
    w = 0;
    if (this.z != null)
      this.z.a = true; 
    this.y = null;
    System.gc();
  }
  
  public static void a(ci paramci, cv paramcv) throws Exception {
    try {
      boolean bool = false;
      byte b = 0;
      while (w != 0) {
        if (!paramcv.a) {
          if (w == 2) {
            paramci.u[paramci.v] = paramci.u[paramci.v] - ((b++ < 10) ? 1 : 10);
            if (paramci.u[paramci.v] < 0)
              paramci.u[paramci.v] = 255; 
            paramci.a(false);
          } else if (w == 5) {
            paramci.u[paramci.v] = paramci.u[paramci.v] + ((b++ < 10) ? 1 : 10);
            if (paramci.u[paramci.v] > 255)
              paramci.u[paramci.v] = 0; 
            paramci.a(false);
          } else if (w == 1) {
            paramci.v--;
            if (paramci.v < 0)
              paramci.v = 2; 
            paramci.a(true);
          } else if (w == 6) {
            paramci.v++;
            if (paramci.v > 2)
              paramci.v = 0; 
            paramci.a(true);
          } 
          if (bool) {
            Thread.sleep(x.l);
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
    w = paramInt;
    this.z = new cv();
    this.y = new bo(this);
    this.y.start();
    Thread.yield();
  }
  
  public final void feyPressed(int paramInt) {
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    i = cx.a(i);
    paramInt = cx.b(paramInt);
    cx.b(cx.a(this, paramInt));
    Object object = null;
    if (i == 2 || i == 5 || i == 1 || i == 6)
      a(i); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ci.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */