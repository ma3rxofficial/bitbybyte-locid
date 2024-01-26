import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;

public final class ew extends TimerTask implements CommandListener {
  private static int f = (int)em.i(300);
  
  private static int g = em.f(218);
  
  private static String h = em.d(130);
  
  private static String i = em.d(131);
  
  public static int a = em.f(237) * 60000;
  
  private static Timer j;
  
  private static Timer k;
  
  private static Timer l;
  
  public int b = -1;
  
  private bg m;
  
  public boolean c = false;
  
  public boolean d = false;
  
  private Object n;
  
  private String o;
  
  private String p;
  
  private int q;
  
  public static long e = dh.a(false, true);
  
  public ew(bg parambg) {
    this.m = parambg;
  }
  
  public ew(int paramInt) {
    this.b = paramInt;
  }
  
  public ew(Object paramObject, String paramString, int paramInt1, int paramInt2) {
    this.n = paramObject;
    this.o = paramString;
    this.p = dw.c(paramObject);
    this.q = (paramInt2 == 4) ? paramInt1 : 0;
    this.b = paramInt2;
  }
  
  public final boolean cancel() {
    this.d = true;
    return super.cancel();
  }
  
  public final void run() {
    if (this.c)
      return; 
    if (this.b != -1) {
      switch (this.b) {
        case 1:
          ef.b();
          return;
        case 2:
          ef.i = false;
          ef.b();
          ef.d = null;
          return;
        case 3:
          ef.a(bb.a((short)298));
          ef.a(dw.a(cd.j()));
          ef.a(cd.k());
          ef.b();
          return;
        case 100:
          if (cd.f() && em.h(0))
            try {
              cd.i.a(new dd(5, new byte[0]));
            } catch (cr cr2) {
              cr cr1;
              cr.a(cr1 = null);
              if (cr1.a)
                cancel(); 
            }  
          dw.i();
          if (e != dh.a(false, true)) {
            ci.a();
            return;
          } 
          break;
        case 4:
          if (this.q == 0) {
            dw.a(this.n, this.p, this.p);
            cancel();
            this.n = null;
            return;
          } 
          if (e())
            return; 
          dw.a(this.n, ((this.q & 0x1) == 0) ? this.o : " ", this.o);
          this.q--;
          return;
        case 5:
          if (e())
            return; 
          dw.a(this.n, this.o.substring(this.q), this.o);
          this.q++;
          if (this.q > this.o.length() - 5) {
            this.q = 0;
            return;
          } 
          break;
        case 200:
          if (cd.f() && em.h(29)) {
            switch (cd.j()) {
              case 0:
              case 2:
              case 16:
              case 32:
              case 8193:
              case 12288:
              case 16384:
              case 20480:
              case 24576:
                f = (int)em.i(300);
                a(1);
                cy.w = true;
                return;
              case 1:
                if (cy.w) {
                  a(4);
                  cy.w = true;
                } 
                break;
            } 
            return;
          } 
          j.cancel();
          return;
        case 300:
          if (cd.f() && em.h(75)) {
            ef.c();
            return;
          } 
          break;
        case 400:
          if (cd.f()) {
            g = em.f(218);
            h = em.d(130);
            i = em.d(131);
            cy.x = true;
            int i = g;
            int j;
            if ((j = em.f(241)) == 1)
              i = 18; 
            if (j == 2)
              i = 11; 
            if (j == 3)
              i = 16; 
            em.a(218, i);
            em.b(130, dv.c(i));
            em.b(131, "");
            try {
              eu.b();
            } catch (cr cr) {}
            bi.a.b(cd.k());
            return;
          } 
          l.cancel();
          break;
      } 
      return;
    } 
    String str;
    if ((str = this.m.f()) != null)
      ef.a(str); 
    ef.b(this.m.e());
    if (this.m.c()) {
      cancel();
      this.m.a(1);
      return;
    } 
    if (this.m.d()) {
      this.c = true;
      cancel();
      this.m.a(3);
    } 
  }
  
  public static void a() {
    if (j != null) {
      j.cancel();
      j = null;
    } 
    j = new Timer();
    j.schedule(new ew(200), a, a);
    if (cy.w && em.h(28)) {
      int i;
      if ((i = (int)em.i(300)) == 1 || i == 4)
        a(f); 
      em.b(5);
    } 
  }
  
  public static void b() {
    if (k != null) {
      k.cancel();
      k = null;
    } 
    k = new Timer();
    k.schedule(new ew(300), a, a);
  }
  
  public static void c() {
    if (l != null) {
      l.cancel();
      l = null;
    } 
    l = new Timer();
    l.schedule(new ew(400), a, a);
    int i = em.f(218);
    if (cy.x && em.h(28) && (i == 11 || i == 18 || i == 16)) {
      em.a(218, g);
      em.b(130, h);
      em.b(131, i);
      bi.a.b(cd.k());
      try {
        eu.b();
      } catch (cr cr) {}
      em.b(5);
    } 
  }
  
  public static void a(int paramInt) {
    try {
      em.a(300, paramInt);
      cd.a(paramInt);
      bi.a.a(bi.b.a(dw.a(cd.j())));
      return;
    } catch (cr cr) {
      cr.a(null);
      return;
    } 
  }
  
  private boolean e() {
    boolean bool = false;
    if (this.n instanceof bd) {
      bool = dw.a((bd)this.n);
    } else if (this.n instanceof Displayable) {
      bool = ((Displayable)this.n).isShown();
    } 
    if (!bool) {
      dw.a(this.n, this.p, this.p);
      cancel();
      this.n = null;
    } 
    return !bool;
  }
  
  public final void d() {
    dw.a(this.n, this.p, this.p);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == ef.c) {
      this.m.a(2);
      cancel();
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ew.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */