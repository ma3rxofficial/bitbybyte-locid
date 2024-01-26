package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.MetaDataControl;
import javax.microedition.media.control.VolumeControl;

public final class cq extends dl implements PlayerListener {
  public Font a;
  
  public aw b = null;
  
  public Image c = null;
  
  public int d = 0;
  
  public long e = 0L;
  
  public Vector f;
  
  public boolean g = false;
  
  public Player h = null;
  
  public InputStream i = null;
  
  public VolumeControl j = null;
  
  public int k;
  
  public int l = 0;
  
  public int m = 0;
  
  public int n = 0;
  
  public int o = 0;
  
  public int p = 0;
  
  public int q = 0;
  
  public int r = 0;
  
  public int s = 0;
  
  public int t = 0;
  
  public boolean u = false;
  
  public boolean v = false;
  
  public Random w = new Random(System.currentTimeMillis());
  
  public String x = null;
  
  public Vector y = new Vector();
  
  public int z = 0;
  
  public mc/z A;
  
  public cq(aw paramaw, Vector paramVector, int paramInt) {
    this.f = paramVector;
    this.d = paramInt;
    this.b = paramaw;
    try {
      b();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void b() throws Exception {
    this.a = Font.getDefaultFont();
    setFullScreenMode(true);
  }
  
  private void c() {
    this.g = true;
    this.k = cx.b(this);
    if (x.N)
      this.k -= aw.l.getHeight() + 2; 
    try {
      this.c = Image.createImage("/img/audiopanel.png");
    } catch (IOException iOException) {}
    if (this.c != null) {
      this.n = this.c.getHeight();
      this.l = cx.a(this) * 3 / 4 - this.c.getWidth() / 2;
    } else {
      this.n = 30;
      this.l = 30;
    } 
    this.s = 4;
    this.t = 2;
    this.q = this.t * 10;
    this.p = (this.n - this.q) / 2;
    this.r = this.s * 10;
    this.o = cx.a(this) / 4 - this.r / 2;
  }
  
  public final void paint(Graphics paramGraphics) {
    Image image;
    Graphics graphics;
    (graphics = (image = aw.h).getGraphics()).setFont(this.a);
    cb cb = this.f.elementAt(this.d);
    if (!this.g) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
      c();
      a(this.v);
    } 
    graphics.setColor(0);
    graphics.fillRect(0, 0, cx.a(this), this.k);
    if (this.c != null)
      graphics.drawImage(this.c, this.l, this.m, 20); 
    int i;
    for (i = 0; i < 11; i++) {
      int j = i * this.t;
      if (i <= x.n / 10) {
        graphics.setColor(10526880);
      } else {
        graphics.setColor(1052688);
      } 
      graphics.fillRect(this.o + i * this.s, this.p + this.q - j, this.s - 1, j);
    } 
    i = this.n;
    graphics.setColor(16777215);
    String str = this.y.elementAt(this.z / 2);
    this.z++;
    if (this.z >= this.y.size() * 2)
      this.z = 0; 
    graphics.drawString(str, 0, i, 20);
    i += this.a.getHeight();
    long l = 0L;
    if (this.h != null)
      l = this.h.getMediaTime(); 
    if (l != -1L) {
      String str1;
      if ((str1 = String.valueOf((l /= 1000000L) % 60L)).length() == 1)
        str1 = "0" + str1; 
      str = String.valueOf(l / 60L) + ":" + str1 + " / ";
    } else {
      str = "0:00 / ";
    } 
    if (this.h != null)
      l = this.h.getDuration(); 
    if (l != -1L) {
      String str1;
      if ((str1 = String.valueOf((l /= 1000000L) % 60L)).length() == 1)
        str1 = "0" + str1; 
      str = str + String.valueOf(l / 60L) + ":" + str1;
    } else {
      str = str + "0:00";
    } 
    graphics.drawString(str, 0, i, 20);
    i += this.a.getHeight();
    if (x.J == 1) {
      str = cx.b(this.e, false);
      if (this.h != null && l > 0L)
        str = str + " " + (this.e / 128L / l) + bn.aA; 
      graphics.drawString(str, 0, i, 20);
      i += this.a.getHeight();
    } 
    if (cb.b && this.b.u != null)
      graphics.drawImage(this.b.u, cx.a(this) - this.b.u.getWidth(), 0, 20); 
    if (this.x != null) {
      graphics.setColor(16711680);
      graphics.drawString(this.x, 0, i, 20);
      this.a.getHeight();
    } else if (x.S > 0) {
      graphics.setColor(12303291);
      str = "";
      if (x.S == 1) {
        str = bn.ay;
      } else if (x.S == 2) {
        str = bn.ax;
      } 
      graphics.drawString(str, 0, i, 20);
      this.a.getHeight();
    } 
    if (x.p == 0) {
      paramGraphics.drawImage(image, 0, 0, 20);
      return;
    } 
    if (x.p == 1) {
      Sprite sprite1;
      (sprite1 = new Sprite(image)).setPosition(getWidth() - 1, 0);
      sprite1.setTransform(5);
      sprite1.paint(paramGraphics);
      return;
    } 
    Sprite sprite;
    (sprite = new Sprite(image)).setPosition(0, getHeight() - 1);
    sprite.setTransform(6);
    sprite.paint(paramGraphics);
  }
  
  public final void a() {
    if (this.A != null)
      try {
        this.A.a();
      } catch (Exception exception) {} 
    if (this.h != null) {
      try {
        this.h.stop();
      } catch (Exception exception) {}
      try {
        if (this.i != null)
          this.i.close(); 
      } catch (Exception exception) {
      
      } catch (Error error) {}
      try {
        this.h.close();
      } catch (Exception exception) {}
    } 
    this.i = null;
    this.j = null;
    this.h = null;
    this.A = null;
    System.gc();
    this.u = false;
  }
  
  public final void a(boolean paramBoolean) {
    this.x = null;
    a();
    String str = ((cb)this.f.elementAt(this.d)).d;
    this.y.removeAllElements();
    this.y.addElement(cx.c(str));
    this.z = 0;
    this.e = 0L;
    try {
      if (x.J == 1) {
        m m;
        (m = new m()).a(str, 1);
        this.e = m.a();
        m.d();
      } 
      try {
        this.h = Manager.createPlayer("file:/" + str);
      } catch (Exception exception) {
        this.h = Manager.createPlayer("file://" + str);
      } 
      this.h.realize();
      this.h.prefetch();
      this.j = (VolumeControl)this.h.getControl("VolumeControl");
      if (this.j != null)
        this.j.setLevel(x.n); 
      this.h.addPlayerListener(this);
      this.h.start();
      this.u = true;
      this.A = new mc/z(this, this, this.h, paramBoolean);
      this.A.a(1L, 1000L);
    } catch (Exception exception) {
      try {
        if (this.h != null)
          this.h.stop(); 
      } catch (Exception exception1) {}
      try {
        if (this.h != null)
          this.h.close(); 
      } catch (Exception exception1) {}
      try {
        if (this.A != null)
          this.A.a(); 
      } catch (Exception exception1) {}
      this.j = null;
      this.h = null;
      this.A = null;
      System.gc();
      try {
        m m;
        (m = new m()).a(str);
        this.h = Manager.createPlayer(this.i = m.g(), cx.a(str));
        this.h.realize();
        this.h.prefetch();
        this.j = (VolumeControl)this.h.getControl("VolumeControl");
        if (this.j != null)
          this.j.setLevel(x.n); 
        this.h.addPlayerListener(this);
        this.h.start();
        this.u = true;
        this.A = new mc/z(this, this, this.h, paramBoolean);
        this.A.a(1L, 1000L);
      } catch (Exception exception1) {
        this.j = null;
        this.h = null;
        this.A = null;
        this.x = exception1.getMessage();
        if (this.x == null)
          this.x = exception1.toString(); 
        repaint();
        cx.a(bn.eq, exception1.toString(), (Displayable)this);
      } 
    } 
    if (this.h != null) {
      MetaDataControl metaDataControl = (MetaDataControl)this.h.getControl("MetaDataControl");
      String str1 = null;
      try {
        if ((str1 = metaDataControl.getKeyValue("title")) != null && str1.length() > 0)
          this.y.addElement(str1); 
      } catch (Exception exception) {}
      try {
        if ((str1 = metaDataControl.getKeyValue("author")) != null && str1.length() > 0)
          this.y.addElement(str1); 
      } catch (Exception exception) {}
      try {
        if ((str1 = metaDataControl.getKeyValue("album")) != null && str1.length() > 0)
          this.y.addElement(str1); 
        return;
      } catch (Exception exception) {}
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
      this.b.a(cx.a(this.f, this.d));
      a();
      this.b.w = null;
      cx.a();
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
    if ((str = cx.b(cx.a(this, paramInt))).equals("SOFT1")) {
      this.b.a(cx.a(this.f, this.d));
      a();
      this.b.w = null;
      cx.a();
      return;
    } 
    if (str.equals("SOFT2") || str.equals("SOFT3")) {
      this.A.c = false;
      ba ba = new ba(this);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ba);
      return;
    } 
    if (paramInt == 48) {
      cb cb;
      (cb = this.f.elementAt(this.d)).b = !cb.b;
      repaint();
      return;
    } 
    if (paramInt == 49) {
      x.J ^= 0x1;
      repaint();
      return;
    } 
    if (paramInt == 51) {
      x.S++;
      if (x.S > 2)
        x.S = 0; 
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
      if (this.j != null) {
        x.n += 10;
        if (x.n > 100)
          x.n = 100; 
        this.j.setLevel(x.n);
        repaint();
        return;
      } 
    } else if (paramInt == 42) {
      if (this.j != null) {
        x.n -= 10;
        if (x.n < 0)
          x.n = 0; 
        this.j.setLevel(x.n);
        repaint();
        return;
      } 
    } else {
      if (i == 6) {
        d();
        return;
      } 
      if (i == 1) {
        if (x.S == 2) {
          d();
          return;
        } 
        this.d--;
        if (this.d < 0)
          this.d = this.f.size() - 1; 
        a(this.v);
        repaint();
        return;
      } 
      if (i == 5) {
        a(this.v);
        repaint();
        return;
      } 
      if (i == 8 || paramInt == 53) {
        if (this.h != null)
          try {
            if (this.h.getState() == 400) {
              this.h.stop();
              this.u = false;
            } else {
              this.h.start();
              this.u = true;
            } 
          } catch (Exception exception) {} 
        repaint();
        return;
      } 
      if (i == 2) {
        if (this.h != null)
          try {
            this.h.stop();
            this.u = false;
          } catch (Exception exception) {} 
        repaint();
      } 
    } 
  }
  
  private void d() {
    if (x.S == 2) {
      int i = 0;
      while (this.f.size() > 1) {
        i = (this.w.nextInt() & 0xFFFFFF) % this.f.size();
        if (this.d != i)
          break; 
      } 
      this.d = i;
    } else {
      this.d++;
      if (this.d >= this.f.size())
        if (x.S == 1) {
          this.d = 0;
        } else if (x.S == 0) {
          this.d--;
          a();
          repaint();
          return;
        }  
    } 
    a(this.v);
    repaint();
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (paramString.equals("endOfMedia"))
      d(); 
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
  
  public class mc/z extends TimerTask {
    public cq a;
    
    public Timer b;
    
    public boolean c;
    
    private final cq d;
    
    public mc/z(cq this$0, cq param1cq1, Player param1Player, boolean param1Boolean) {
      this.d = this$0;
      this.c = true;
      param1cq1.v = param1Boolean;
      this.a = param1cq1;
      this.b = new Timer();
    }
    
    public final void a(long param1Long1, long param1Long2) {
      this.b.scheduleAtFixedRate(this, param1Long1, param1Long2);
    }
    
    public final void a() {
      this.b.cancel();
    }
    
    public final void run() {
      if (this.c) {
        if (Display.getDisplay((MIDlet)MiniCommander.a).getCurrent() != this.a && !this.d.v && this.d.u == true) {
          this.d.v = true;
          this.d.a(this.d.v);
        } else if (Display.getDisplay((MIDlet)MiniCommander.a).getCurrent() == this.a && this.d.v == true) {
          this.d.v = false;
        } 
        this.a.repaint();
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\cq.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */