import i.I;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import jimm.Jimm;

public final class eo implements bx, CommandListener {
  public be a = new be(null);
  
  private static final Command g = new Command(bb.a((short)7), 4, 8);
  
  private static final Command h = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 2);
  
  private static final Command i = new Command(bb.a((short)206), 3, 3);
  
  private static final Command j = new Command(bb.a((short)410), 8, 3);
  
  private static final Command k = new Command(bb.a((short)269), 8, 3);
  
  private static final Command l = new cc(bb.a((short)188), 8, 4, 52);
  
  private static final Command m = new cc(bb.a((short)679), 8, 5, 55);
  
  private static final Command n = new Command(bb.a((short)95), 8, 6);
  
  private static final Command o = new Command(bb.a((short)569), 8, 7);
  
  private static final Command p = new Command(bb.a((short)203, 1), 8, 9);
  
  public String b;
  
  public dm c;
  
  public Vector d = new Vector();
  
  private int q = 0;
  
  private static int r;
  
  public static String[] e;
  
  public Object[] f = new Object[7];
  
  public eo(String paramString, dm paramdm) {
    this.a.a(true);
    this.a.e(3);
    if (fd.a != null) {
      this.a.c(em.h(15) ? 16 : 0);
    } else {
      this.a.c(em.h(15) ? 8 : 0);
    } 
    this.c = paramdm;
    this.b = paramString;
    this.a.p = this;
  }
  
  public final void f(int paramInt) {}
  
  public final void a(dm paramdm) {
    this.c = paramdm;
    this.a.y();
    this.a.a(dw.p, bd.Z);
    this.a.a(h, bd.aa);
    this.a.a(cj.a, bd.ab);
    this.a.a(cy.s, bd.ab);
    this.a.a(g, bd.ab);
    this.a.a(p, bd.ab);
    this.a.a(l, bd.ab);
    if (!dw.g()) {
      this.a.a(m, bd.ab);
      this.a.a(dw.u, bd.ab);
      this.a.a(dw.v, bd.ab);
    } 
    if ((this.c.getBooleanValue(8) || this.c.getBooleanValue(32)) && !this.c.getBooleanValue(2))
      this.a.a(n, bd.ab); 
    if (this.c.getBooleanValue(2))
      this.a.a(j, bd.ab); 
    if (!em.h(17))
      this.a.a(o, bd.ab); 
    c();
    d();
    this.a.a(this);
  }
  
  public final boolean a() {
    return (this.a != null) ? this.a.i() : false;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    try {
      e = cj.c(this.c.getUinString());
    } catch (Exception exception) {}
    if (r == 1 && paramCommand == dw.d) {
      byte b = -1;
      switch (dw.l()) {
        case 0:
          b = 1;
          break;
        case 1:
          b = 2;
          break;
        case 2:
          b = 3;
          break;
      } 
      cj.a(this.c.getUinString(), b);
      dm.a = bi.u();
      bi.i();
      return;
    } 
    if (paramCommand == g) {
      dw.a(this.c, (String)null, false);
      return;
    } 
    if (paramCommand == h) {
      this.c.m();
      this.a.ad = 0;
      dw.T = null;
      bi.i();
      return;
    } 
    if (paramCommand == cy.s) {
      cp.g.b();
      return;
    } 
    if (paramCommand == p) {
      r = 1;
      dw.a((short)203, dw.R, this, 1);
      return;
    } 
    if (paramCommand == l || paramCommand == m) {
      cj.a(this.c.getUinString(), this.b, (paramCommand == m));
      this.a.a(dw.u, bd.ab);
      this.a.a(dw.v, bd.ab);
      this.a.a(m, bd.ab);
      return;
    } 
    if (paramCommand == dw.u || paramCommand == dw.v) {
      dw.a(this.c, dw.a((paramCommand == dw.u)), false);
      return;
    } 
    if (paramCommand == dw.z) {
      dw.a(this.a.a(0, false), this.a);
      return;
    } 
    if (paramCommand == n) {
      ff ff = new ff(true);
      String[] arrayOfString;
      (arrayOfString = new String[10])[0] = this.c.getUinString();
      bz bz = new bz(ff, arrayOfString);
      try {
        cd.a(bz);
      } catch (cr cr) {
        cr.a(null);
      } 
      ef.a(bb.a((short)543), bz, false);
      return;
    } 
    if (paramCommand == o) {
      int j = this.a.A();
      ey ey = this.d.elementAt(j);
      String str;
      if ((str = this.a.a(ey.b(), false)) == null)
        return; 
      Object object = null;
      ea.a(this.c.getUinString(), str, ey.a() ? 0 : 1, ey.a() ? this.b : cd.a, ey.a);
      return;
    } 
    if (paramCommand == k) {
      this.c.a(70, 0);
      b();
      bt bt = new bt(4, this.c.getUinString(), true, "");
      cv cv = new cv(bt);
      try {
        cd.a(cv);
        return;
      } catch (cr cr2) {
        cr cr1;
        cr.a(cr1 = null);
        if (cr1.a)
          return; 
        return;
      } 
    } 
    if (paramCommand == i) {
      dw.a(10001, this.c, bb.a((short)397), (String)null);
      return;
    } 
    if (paramCommand == j) {
      dw.a(10002, this.c, bb.a((short)410), bb.a((short)383));
      return;
    } 
    if (paramCommand == cj.a) {
      dw.a(this.c);
      return;
    } 
    int i;
    if ((i = this.a.A()) != -1) {
      ey ey = this.d.elementAt(i);
      Object[] arrayOfObject = a(ey);
      if (cp.a(18, arrayOfObject, paramCommand) != null)
        c(); 
      return;
    } 
    if (cp.a(18, a((ey)null), paramCommand) != null)
      c(); 
  }
  
  private Object[] a(ey paramey) {
    this.f[0] = null;
    this.f[1] = null;
    this.f[2] = null;
    this.f[0] = paramey.a() ? this.c.o : cd.a;
    this.f[1] = dh.a(true, true, paramey.a);
    this.f[2] = cj.b(this.c.getUinString());
    this.f[3] = (paramey == null) ? "none" : (paramey.a() ? "in" : "out");
    this.f[4] = this.c.getUinString();
    this.f[5] = this.c.o;
    this.f[6] = this.c;
    return this.f;
  }
  
  public final void b() {
    this.a.b(k);
    this.a.b(i);
  }
  
  public static int a(boolean paramBoolean) {
    return paramBoolean ? em.g(6) : em.g(7);
  }
  
  public final void a(bd parambd) {
    c();
  }
  
  public final void c() {
    if (this.a == null)
      return; 
    this.a.b(dw.z);
    ey ey = null;
    int i;
    if ((i = this.a.A()) != -1 && ((ey)this.d.elementAt(i)).c())
      this.a.a(dw.z, bd.ab); 
    if ((i = this.a.A()) != -1) {
      ey = this.d.elementAt(i);
      Object[] arrayOfObject = a(ey);
      cp.a(17, arrayOfObject, this.c, this.a);
      return;
    } 
    cp.a(17, a((ey)null), this.c, this.a);
  }
  
  public final void d() {
    if (this.c.e(4)) {
      this.a.a(k, bd.ab);
      this.a.a(i, bd.ab);
    } 
  }
  
  public final void a(I paramI) {
    this.a.a(paramI);
  }
  
  public final void b(I paramI) {
    this.a.b(paramI);
  }
  
  public final void c(I paramI) {
    this.a.d(paramI);
  }
  
  public final void b(bd parambd) {}
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {
    if (dw.a(this.c, paramInt1, paramInt2))
      return; 
    switch (paramInt1) {
      case -8:
      case 1000004:
        r = 1;
        if (paramInt2 == 1)
          dw.a((short)203, dw.R, this, 1); 
        return;
      case 42:
        cj.a(this.c.getUinString(), this.b, false);
        this.a.a(dw.u, bd.ab);
        this.a.a(dw.v, bd.ab);
        return;
      case 35:
        if (!dw.g())
          try {
            dw.a(this.c, dw.a(true), false);
            return;
          } catch (Exception exception) {
            Alert alert = new Alert(bb.a((short)484));
            Jimm.d.setCurrent(alert, Jimm.d.getCurrent());
          }  
        return;
    } 
    try {
      if (paramInt2 == 1)
        switch (bd.d(paramInt1)) {
          case 2:
            cj.i(bi.c(false));
            return;
          case 5:
            cj.i(bi.c(true));
            return;
        }  
      dw.b(this.c, paramInt1, paramInt2);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void e() {
    this.a.e();
  }
  
  public final void a(long paramLong, I paramI, boolean paramBoolean) {
    this.a.a(paramLong, paramI, paramBoolean);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, long paramLong1, boolean paramBoolean1, boolean paramBoolean2, I paramI, long paramLong2, boolean paramBoolean3) {
    String str;
    boolean bool1 = false;
    boolean bool2 = (paramLong1 == 0L) ? true : false;
    this.a.q();
    int i = this.a.c();
    StringBuffer stringBuffer = new StringBuffer();
    if (paramI != null)
      this.a.a(paramI, this.q, paramLong2); 
    if (!bool2) {
      if (em.h(77)) {
        str = (new StringBuffer(30)).append(paramBoolean1 ? "<- " : "-> ").toString();
      } else {
        StringBuffer stringBuffer1 = new StringBuffer("");
        if (paramLong1 != -1L)
          stringBuffer1.append(" (").append(dh.a(!paramBoolean2, em.h(21), paramLong1)).append("): "); 
        str = (new StringBuffer(30)).append(paramString1).append(stringBuffer1).toString();
      } 
    } else {
      str = paramString1 + " ";
    } 
    stringBuffer.append(str);
    if (stringBuffer.length() != 0) {
      this.a.a(stringBuffer.toString(), a(paramBoolean1), 1, this.q);
      if (!paramBoolean2 && !bool2)
        this.a.x(this.q); 
      try {
        bool1 = !bool2 ? this.a.a(0, false, this.q).length() : false;
      } catch (Exception exception) {
        bool1 = false;
      } 
      if (paramString3.length() > 0)
        this.a.a(bb.a((short)768) + ": " + paramString3, 65280, 0, this.q); 
      dw.a(this.a, paramString2, !bool2 ? bd.g() : a(paramBoolean1), this.q);
      boolean bool = false;
      if (dh.i(paramString2) != null) {
        bool = true;
        if (bool1 == true)
          this.a.a(dw.z, bd.ab); 
      } 
      this.d.addElement(new ey(paramBoolean1, paramLong1, bool1, bool));
      this.q++;
      if (paramBoolean3 && (!paramBoolean1 || this.a.A() >= this.d.size() - 2))
        this.a.o(i); 
      this.a.s();
      return;
    } 
    bool1 = false;
  }
  
  public final void f() {
    r = 0;
    this.a.b(Jimm.d);
    dw.a(this.a);
    cj.d = this;
    this.c.m();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\eo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */