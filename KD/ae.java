package KD;

import KDPlayer;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;

public final class ae {
  private KDPlayer m;
  
  public Display a;
  
  public al b;
  
  public i c;
  
  public y d;
  
  public b e;
  
  public v f;
  
  public aa g;
  
  public m h;
  
  public d i;
  
  public s j;
  
  private ag n;
  
  public boolean k;
  
  public boolean l;
  
  public ae(KDPlayer paramKDPlayer) {
    if (paramKDPlayer != null) {
      this.m = paramKDPlayer;
      this.a = Display.getDisplay((MIDlet)this.m);
    } 
  }
  
  public final void a() {
    this.n = new ag();
    this.n.a();
    this.c = new i(this);
    this.e = new b(this);
    this.i = new d(this);
    this.j = new s(this);
    this.d = new y(this.c);
    this.f = new v(this);
    this.g = new aa(this);
  }
  
  public final void b() {
    if (this.b == null) {
      this.b = new al("Поиск файлов...");
      this.b.a();
      this.a.setCurrent((Displayable)this.b);
      this.n.g();
      this.k = this.n.d;
      this.l = this.n.e;
      this.c.a();
      a("Чтение плейлистов...");
      this.d.a("");
      this.n.a(this.d);
      if (this.d.a != null && this.d.a.length > 0)
        this.d.c(); 
      this.f.a();
      this.n.f();
      this.e.i = this.n.g;
      this.e.m = this.n.h;
      this.e.c(this.n.d);
      this.e.h = this.n.e;
      this.h = new m(this);
      if ((((this.n.f >= 0) ? 1 : 0) & ((this.n.f < this.f.c) ? 1 : 0)) != 0)
        this.e.a(this.n.f, this.l); 
      byte b1;
      if ((b1 = this.n.c()) == 1) {
        g();
      } else {
        f();
      } 
      this.b.b();
    } 
  }
  
  public final void c() {
    this.n.h();
    boolean bool = false;
    if (this.h.isShown())
      bool = true; 
    this.n.a(bool);
    this.n.a(this.c.b);
    this.n.b(this.c.c);
    this.n.a(this.e.g, this.e.h, this.f.b, this.e.o, this.e.m);
    this.n.b(this.d);
    this.n.a(this.k, this.l);
  }
  
  public final void d() {
    this.n.b();
    this.n = null;
    this.h.b();
    this.e.b();
    this.c.b();
    this.c = null;
    this.b.b();
    this.b = null;
  }
  
  public final void a(String paramString1, String paramString2, Image paramImage, AlertType paramAlertType, int paramInt) {
    Alert alert;
    (alert = new Alert(paramString1, paramString2, paramImage, paramAlertType)).setTimeout(paramInt);
    this.a.setCurrent((Displayable)alert);
  }
  
  public final void e() {
    this.a.setCurrent((Displayable)this.j.c);
  }
  
  public final void f() {
    this.i.getClass();
    this.i.b = 0;
    this.i.a();
  }
  
  public final void g() {
    (new Thread(new ac(this))).start();
  }
  
  public final void h() {
    this.g.a(this.f.b);
  }
  
  public final void i() {
    this.m.a();
  }
  
  public final void a(String paramString) {
    this.b.a(paramString);
  }
  
  public final String[] j() {
    return (this.c.b == null) ? this.n.d() : this.c.b;
  }
  
  public final String[] k() {
    return (this.c.c == null) ? this.n.e() : this.c.c;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\ae.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */