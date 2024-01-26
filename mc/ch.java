package mc;

import MiniCommander;
import com.nokia.mid.ui.DeviceControl;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VideoControl;
import javax.microedition.media.control.VolumeControl;

public final class ch extends dl implements PlayerListener {
  public aw a = null;
  
  public int b = 0;
  
  public long c = 0L;
  
  public Vector d;
  
  public boolean e = false;
  
  public int f = 0;
  
  public int g = 0;
  
  public Player h = null;
  
  public VideoControl i = null;
  
  public VolumeControl j = null;
  
  public Thread k = null;
  
  public int l = x.p;
  
  public long m = 0L;
  
  public boolean n = false;
  
  public boolean o = cx.f("com.nokia.mid.ui.DeviceControl");
  
  public dd p = null;
  
  public boolean q = false;
  
  public ch(aw paramaw, Vector paramVector, int paramInt) {
    this.d = paramVector;
    this.b = paramInt;
    this.a = paramaw;
    setFullScreenMode(true);
    if ((paramaw.e[paramaw.f]).o == 1)
      this.p = (paramaw.e[paramaw.f]).u; 
  }
  
  private static void b() {
    DeviceControl.setLights(0, 100);
  }
  
  public final void paint(Graphics paramGraphics) {
    if (!this.e) {
      this.e = true;
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
      this.f = getWidth();
      this.g = getHeight();
      if (x.N)
        this.g -= aw.l.getHeight() + 2; 
      c();
    } 
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, this.f, this.g);
    if (x.j > 0) {
      String str = cx.c(cx.a(this.d, this.b));
      aw.j.a(paramGraphics, str, 0, 0, 0, 8421504);
    } 
    if (x.j > 1) {
      String str = cx.a(this.c, false);
      aw.j.a(paramGraphics, str, 0, aw.j.a, 0, 8421504);
    } 
    if (((cb)this.d.elementAt(this.b)).b && this.a.u != null)
      paramGraphics.drawImage(this.a.u, cx.a(this) - this.a.u.getWidth(), 0, 20); 
    a(paramGraphics);
  }
  
  private void c() {
    d();
    String str = cx.a(this.d, this.b).toLowerCase();
    try {
      byte b = 0;
      if (this.l == 1) {
        b = 5;
      } else if (this.l == 2) {
        b = 6;
      } 
      this.c = 0L;
      if (this.p == null) {
        m m = new m();
        try {
          m.a(str, 1);
          if (m.p())
            this.c = (int)m.a(); 
          m.d();
        } catch (Exception exception) {
          try {
            m.d();
          } catch (Exception exception1) {}
        } 
      } 
      if (this.p == null) {
        try {
          this.h = Manager.createPlayer("file:/" + str);
        } catch (Exception exception) {}
        try {
          if (this.h == null)
            this.h = Manager.createPlayer("file://" + str); 
        } catch (Exception exception) {}
        if (this.h == null)
          this.h = Manager.createPlayer("file:///" + str); 
      } else {
        int k;
        if ((k = this.p.a(str, true)) == -1)
          throw new Exception("Entry not found"); 
        if (!this.p.e(k))
          throw new Exception("Open entry error"); 
        this.h = Manager.createPlayer(this.p.c, "video/3gpp");
      } 
      this.h.realize();
      this.h.prefetch();
      this.i = (VideoControl)this.h.getControl("VideoControl");
      int i = this.i.getSourceWidth();
      int j = this.i.getSourceHeight();
      if (this.l != 0) {
        j = this.i.getSourceWidth();
        i = this.i.getSourceHeight();
      } 
      if (this.i != null) {
        if (this.n) {
          int k = this.f * j / i;
          int m = this.f;
          if (k > this.g) {
            m = i * this.g / j;
            k = this.g;
          } 
          i = m;
          j = k;
        } 
        if (!aw.A)
          b = 0; 
        try {
          this.i.initDisplayMode(0x1 | b << 4, this);
        } catch (Exception exception) {}
        try {
          this.i.setDisplayLocation((this.f - i) / 2, (this.g - j) / 2);
        } catch (Exception exception) {}
        try {
          this.i.setDisplayFullScreen(false);
        } catch (Exception exception) {}
        try {
          this.i.setDisplaySize(i, j);
        } catch (Exception exception) {}
        try {
          this.i.setVisible(true);
        } catch (Exception exception) {}
      } 
      this.j = (VolumeControl)this.h.getControl("VolumeControl");
      this.h.addPlayerListener(this);
      this.h.start();
      if (this.j != null)
        this.j.setLevel(x.n); 
      if (this.m > 0L)
        this.h.setMediaTime(this.m); 
      this.q = false;
      if (aw.A && this.k == null) {
        this.k = new dc(this);
        this.k.start();
      } 
      return;
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString(), (Displayable)this);
      return;
    } catch (Error error) {
      cx.a(bn.eq, error.toString(), (Displayable)this);
      return;
    } 
  }
  
  private void d() {
    if (this.h != null) {
      try {
        this.h.stop();
      } catch (Exception exception) {}
      try {
        this.h.close();
      } catch (Exception exception) {}
      try {
        this.h.deallocate();
      } catch (Exception exception) {}
    } else {
      return;
    } 
    this.i = null;
    this.j = null;
    this.h = null;
    this.m = 0L;
    System.gc();
    this.q = true;
  }
  
  public final void a() {
    try {
      while (!this.q) {
        for (byte b = 0; b < 14; b++) {
          Thread.sleep(1000L);
          if (this.q) {
            this.k = null;
            return;
          } 
        } 
        if (this.o) {
          b();
          continue;
        } 
        Display.getDisplay((MIDlet)MiniCommander.a).flashBacklight(1);
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void a(int paramInt) {
    if (this.h != null && paramInt != 0) {
      try {
        long l1 = this.h.getMediaTime();
        long l2 = this.h.getDuration();
        if (l1 != -1L && l2 != -1L) {
          l1 += paramInt;
          if (paramInt < 0) {
            if (l1 < 0L)
              l1 = 0L; 
          } else if (l1 >= l2) {
            return;
          } 
          this.h.setMediaTime(l1);
        } 
      } catch (Exception exception) {}
      repaint();
    } 
  }
  
  public final void a(long paramLong) {
    if (this.h != null && paramLong != 0L) {
      try {
        long l1 = this.h.getMediaTime();
        long l2 = this.h.getDuration();
        if (l1 != -1L && l2 != -1L) {
          if ((l1 = paramLong) >= l2)
            return; 
          this.h.setMediaTime(l1);
        } 
      } catch (Exception exception) {}
      repaint();
    } 
  }
  
  public final void feyReleased(int paramInt) {
    String str;
    if ((str = cx.b(cx.a(this, paramInt))).equals("BACK")) {
      if (this.h != null)
        d(); 
      this.q = true;
      this.a.a(cx.a(this.d, this.b));
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
    } 
  }
  
  public final void feyPressed(int paramInt) {
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    i = cx.a(i);
    paramInt = cx.b(paramInt);
    String str;
    if ((str = cx.b(cx.a(this, paramInt))).equals("SOFT1") || str.equals("BACK")) {
      if (this.h != null)
        d(); 
      this.q = true;
      this.a.a(cx.a(this.d, this.b));
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (str.equals("SOFT2") || str.equals("SOFT3")) {
      u u = new u(this);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)u);
      return;
    } 
    if (paramInt == 49) {
      x.j++;
      if (x.j > 2)
        x.j = 0; 
      repaint();
      return;
    } 
    if (paramInt == 51)
      try {
        this.n ^= 0x1;
        this.h.stop();
        this.m = this.h.getMediaTime();
        this.h.deallocate();
        this.h = null;
        c();
        return;
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString(), (Displayable)this);
        return;
      }  
    if (paramInt == 48) {
      cb cb;
      (cb = this.d.elementAt(this.b)).b = !cb.b;
      repaint();
      return;
    } 
    if (paramInt == 54) {
      a(5000000);
      return;
    } 
    if (paramInt == 52) {
      a(-5000000);
      return;
    } 
    if (paramInt == 50) {
      a(10000000);
      return;
    } 
    if (paramInt == 56) {
      a(-10000000);
      return;
    } 
    if (paramInt == 35) {
      if (this.i != null) {
        x.n += 10;
        if (x.n > 100)
          x.n = 100; 
        this.j.setLevel(x.n);
        repaint();
        return;
      } 
    } else if (paramInt == 42) {
      if (this.i != null) {
        x.n -= 10;
        if (x.n < 0)
          x.n = 0; 
        this.j.setLevel(x.n);
        repaint();
        return;
      } 
    } else if (i == 5) {
      if (aw.A)
        try {
          this.l++;
          if (this.l == 3)
            this.l = 0; 
          this.h.stop();
          this.m = this.h.getMediaTime();
          this.h.deallocate();
          this.h = null;
          c();
          return;
        } catch (Exception exception) {
          cx.a(bn.eq, exception.toString(), (Displayable)this);
          return;
        }  
    } else if (i == 2) {
      if (aw.A)
        try {
          this.l--;
          if (this.l < 0)
            this.l = 2; 
          this.h.stop();
          this.m = this.h.getMediaTime();
          this.h.deallocate();
          this.h = null;
          c();
          return;
        } catch (Exception exception) {
          cx.a(bn.eq, exception.toString(), (Displayable)this);
          return;
        }  
    } else {
      if (i == 1) {
        this.b--;
        if (this.b < 0)
          this.b = this.d.size() - 1; 
        c();
        repaint();
        return;
      } 
      if (i == 6) {
        this.b++;
        if (this.b >= this.d.size())
          this.b = 0; 
        c();
        repaint();
        return;
      } 
      if (i == 8 || paramInt == 53) {
        if (this.h != null)
          try {
            if (this.h.getState() == 400) {
              this.h.stop();
            } else {
              this.h.start();
            } 
          } catch (Exception exception) {} 
        repaint();
      } 
    } 
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (paramString.equals("endOfMedia")) {
      this.m = 0L;
      this.b++;
      if (this.b >= this.d.size())
        this.b = 0; 
      c();
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


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ch.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */