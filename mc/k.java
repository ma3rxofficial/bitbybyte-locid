package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VideoControl;

public final class k extends ca {
  public aw a = null;
  
  public ab b = null;
  
  public boolean c = false;
  
  public int d = 0;
  
  public int e = 0;
  
  public Player f = null;
  
  public VideoControl g = null;
  
  public String h;
  
  public boolean i = true;
  
  public int j = 0;
  
  public int k = 0;
  
  public int l = 0;
  
  public int m = 0;
  
  public int n = 0;
  
  public int o = 0;
  
  public long p = 0L;
  
  public k(aw paramaw, ab paramab, String paramString) {
    this.a = paramaw;
    this.b = paramab;
    this.h = paramString.toLowerCase();
    setFullScreenMode(true);
  }
  
  public final void a() {
    d();
  }
  
  public final void paint(Graphics paramGraphics) {
    if (!this.c) {
      this.c = true;
      this.d = getWidth();
      this.e = getHeight();
      if (x.N)
        this.e -= aw.l.getHeight() + 2; 
      this.l = this.d / 2;
      this.m = this.e / 2;
      c();
    } 
    paramGraphics.setColor(ab.r);
    paramGraphics.fillRect(0, 0, this.d, this.e);
    if (x.j > 0) {
      String str = cx.c(cx.a(this.b.f, this.b.d));
      paramGraphics.setColor(ab.r);
      paramGraphics.fillRect(0, 0, aw.j.d(str), aw.j.a);
      aw.j.a(paramGraphics, str, 0, 0, 0, ab.s);
    } 
    if (x.j > 1) {
      String str = cx.a(this.p, false);
      paramGraphics.setColor(ab.r);
      paramGraphics.fillRect(0, aw.j.a, aw.j.d(str), aw.j.a);
      aw.j.a(paramGraphics, str, 0, aw.j.a, 0, ab.s);
    } 
    if (((cb)this.b.f.elementAt(this.b.d)).b && this.a.u != null)
      paramGraphics.drawImage(this.a.u, this.d - this.a.u.getWidth(), 0, 20); 
    a(paramGraphics);
  }
  
  public final boolean b() {
    d();
    try {
      m m = new m();
      try {
        m.a(this.h);
        this.p = m.a();
        m.d();
      } catch (Exception exception) {
        try {
          m.d();
        } catch (Exception exception1) {}
      } 
      this.f = Manager.createPlayer("file://" + this.h.toLowerCase());
      this.f.realize();
      return true;
    } catch (Exception exception) {
      try {
        if (this.f != null)
          this.f.deallocate(); 
      } catch (Exception exception1) {}
      return false;
    } 
  }
  
  private void c() {
    this.n = 0;
    this.o = 0;
    try {
      repaint();
      serviceRepaints();
      if (!this.i) {
        if (!b())
          throw new MediaException(); 
      } else {
        this.i = false;
      } 
      this.g = (VideoControl)this.f.getControl("VideoControl");
      int i = this.g.getSourceWidth();
      int j = this.g.getSourceHeight();
      if (this.g != null) {
        if ((x.t && (i > this.d || j > this.e)) || (x.u && i < this.e && j < this.e)) {
          int m = this.d * j / i;
          int n = this.d;
          if (m > this.e) {
            n = i * this.e / j;
            m = this.e;
          } 
          i = n;
          j = m;
        } 
        this.j = i;
        this.k = j;
        this.g.initDisplayMode(1, this);
        this.g.setDisplayFullScreen(false);
        this.g.setDisplaySize(i, j);
        this.g.setDisplayLocation((this.d - i) / 2 - this.n, (this.e - j) / 2 - this.o);
        this.g.setVisible(true);
      } 
      this.f.start();
      return;
    } catch (Exception exception) {
    
    } catch (Error error) {}
    this.b.a(this.b.d, false);
    this.b.k = true;
    this.b.repaint();
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.b);
  }
  
  private void d() {
    if (this.f != null) {
      try {
        this.f.deallocate();
      } catch (Exception exception) {}
    } else {
      return;
    } 
    this.g = null;
    this.f = null;
    System.gc();
  }
  
  public final void feyReleased(int paramInt) {
    String str;
    if ((str = cx.b(cx.a(this, paramInt))).equals("BACK")) {
      a();
      this.a.a(cx.a(this.b.f, this.b.d));
      cx.a();
    } 
  }
  
  public final void feyPressed(int paramInt) {
    int i = paramInt;
    int j = -1;
    try {
      j = getGameAction(i);
    } catch (Exception exception) {}
    j = cx.a(j);
    i = cx.b(i);
    String str;
    if ((str = cx.b(cx.a(this, i))).equals("SOFT1") || str.equals("SOFT2")) {
      a();
      this.a.a(cx.a(this.b.f, this.b.d));
      cx.a();
      return;
    } 
    if (str.equals("SOFT2") || str.equals("SOFT3")) {
      co co = new co(this);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)co);
      return;
    } 
    if (i == 49) {
      x.j++;
      if (x.j > 2)
        x.j = 0; 
      repaint();
      return;
    } 
    if (i == 51)
      try {
        x.t ^= 0x1;
        this.f.stop();
        this.f.deallocate();
        this.f = null;
        c();
        return;
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString(), (Displayable)this);
        return;
      }  
    if (i == 57)
      try {
        x.u ^= 0x1;
        this.f.stop();
        this.f.deallocate();
        this.f = null;
        c();
        return;
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString(), (Displayable)this);
        return;
      }  
    if (i == 48) {
      cb cb;
      (cb = this.b.f.elementAt(this.b.d)).b = !cb.b;
      repaint();
      return;
    } 
    if (i == 54) {
      if (this.j > this.d) {
        this.n += this.d / 4;
        if (this.l - this.j / 2 - this.n + this.j < this.d)
          this.n = this.l - this.j / 2 + this.j - this.d; 
        this.g.setDisplayLocation((this.d - this.j) / 2 - this.n, (this.e - this.k) / 2 - this.o);
        return;
      } 
    } else if (i == 52) {
      if (this.j > this.d) {
        this.n -= this.d / 4;
        if (this.l - this.j / 2 - this.n > 0)
          this.n = this.l - this.j / 2; 
        this.g.setDisplayLocation((this.d - this.j) / 2 - this.n, (this.e - this.k) / 2 - this.o);
        return;
      } 
    } else if (i == 50) {
      if (this.k > this.e) {
        this.o -= this.e / 4;
        if (this.m - this.k / 2 - this.o > 0)
          this.o = this.m - this.k / 2; 
        this.g.setDisplayLocation((this.d - this.j) / 2 - this.n, (this.e - this.k) / 2 - this.o);
        return;
      } 
    } else if (i == 56) {
      if (this.k > this.e) {
        this.o += this.e / 4;
        if (this.m - this.k / 2 - this.o + this.k < this.e)
          this.o = this.m - this.k / 2 + this.k - this.e; 
        this.g.setDisplayLocation((this.d - this.j) / 2 - this.n, (this.e - this.k) / 2 - this.o);
        return;
      } 
    } else {
      if (i == 53) {
        this.n = 0;
        this.o = 0;
        this.g.setDisplayLocation((this.d - this.j) / 2 - this.n, (this.e - this.k) / 2 - this.o);
        return;
      } 
      if (i == 55) {
        x.w ^= 0x1;
        return;
      } 
      if (i == 35)
        return; 
      if (i == 42)
        return; 
      if (j == 5)
        return; 
      if (j == 2)
        return; 
      if (j == 1 || j == 6) {
        try {
          this.f.stop();
          this.f.deallocate();
        } catch (Exception exception) {}
        this.f = null;
        this.b.feyPressed(paramInt);
      } 
    } 
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2) {
    if (!x.N)
      return; 
    if (a(paramInt1, paramInt2))
      return; 
  }
  
  public final void pointerReleased(int paramInt1, int paramInt2) {
    if (!x.N)
      return; 
    feyReleased(0);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\k.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */