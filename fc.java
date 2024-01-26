import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;

public final class fc extends Canvas implements Runnable {
  public bd a;
  
  private Timer j = new Timer();
  
  private TimerTask k;
  
  public long b = 0L;
  
  private Timer l;
  
  public boolean c = false;
  
  public boolean d = false;
  
  public static boolean e = true;
  
  private int m;
  
  public Display f;
  
  public int g = 0;
  
  private boolean n;
  
  public static int h = 1000;
  
  public boolean i = true;
  
  private synchronized void c() {
    if (this.l != null)
      this.l.cancel(); 
    this.n = true;
    (this.l = new Timer()).schedule(new dj(this), bd.j, bd.j);
    repaint();
  }
  
  public final void a(long paramLong) {
    this.c = false;
    if (paramLong <= 0L) {
      e = true;
      if (!this.c)
        d(); 
    } 
    repaint();
  }
  
  private synchronized void d() {
    if (!this.n)
      return; 
    this.n = false;
    Timer timer = this.l;
    this.l = null;
    timer.cancel();
  }
  
  public final void a() {
    if (bd.a) {
      if (this.n) {
        this.c = true;
        return;
      } 
      repaint();
      return;
    } 
    repaint();
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.g = paramInt2;
    if (bd.b) {
      this.b = (paramInt1 + 20);
      if (this.b > 0L)
        h = (int)this.b; 
    } else if (paramInt1 == 0) {
      this.b = 0L;
    } else {
      this.b = (paramInt1 + 20);
      if (this.b > 0L)
        h = (int)this.b; 
      this.b = System.currentTimeMillis() + this.b;
    } 
    e = false;
    if (bd.a) {
      this.d = true;
      if (this.n) {
        this.c = true;
        return;
      } 
      c();
      return;
    } 
    a();
  }
  
  public fc() {
    setFullScreenMode(bd.l);
  }
  
  public final void paint(Graphics paramGraphics) {
    if (this.a != null) {
      if (this.i)
        try {
          while (this.i) {
            this.i = false;
            bd.h = System.currentTimeMillis();
            long l = Runtime.getRuntime().freeMemory();
            this.a.a(paramGraphics, this);
            bd.c = (int)(System.currentTimeMillis() - bd.h);
            bd.f += bd.c;
            bd.g++;
            bd.d = (int)(Runtime.getRuntime().freeMemory() - l);
            bd.e += bd.c;
          } 
          return;
        } finally {
          this.i = true;
        }  
      this.i = true;
    } 
  }
  
  public final void showNotify() {
    b();
    setFullScreenMode(bd.l);
    if (this.a != null)
      this.a.j(); 
  }
  
  public final void hideNotify() {
    b();
  }
  
  public final void run() {
    if (this.k == null)
      return; 
    this.a.k(this.m);
  }
  
  public final void keyPressed(int paramInt) {
    b();
    if (this.a != null)
      this.a.j(paramInt); 
    this.m = paramInt;
    this.k = new dl(this);
    this.j.schedule(this.k, 400L, 100L);
  }
  
  public final void keyReleased(int paramInt) {
    if (this.a != null)
      this.a.l(paramInt); 
    b();
  }
  
  public final void b() {
    if (this.k != null)
      this.k.cancel(); 
    this.m = 0;
    this.k = null;
  }
  
  public final void pointerDragged(int paramInt1, int paramInt2) {
    if (this.a != null)
      this.a.m(paramInt2); 
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2) {
    if (this.a != null)
      this.a.c(paramInt1, paramInt2); 
  }
  
  public final void pointerReleased(int paramInt1, int paramInt2) {
    if (this.a != null)
      this.a.d(paramInt1, paramInt2); 
  }
  
  public final void a(boolean paramBoolean) {
    if (bd.l != paramBoolean) {
      bd.l = paramBoolean;
      setFullScreenMode(bd.l);
    } 
  }
  
  public static Display a(fc paramfc) {
    return paramfc.f;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\fc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */