import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import jimm.Jimm;

public final class cl implements CommandListener, bx {
  private static cl a = new cl();
  
  private static be b;
  
  private static cl c;
  
  private Vector d = new Vector();
  
  private static final Command e = new cc(bb.a((short)211), 4, 1, 49);
  
  private int f = 1;
  
  public cl() {
    c = this;
  }
  
  public static void a() {
    b();
    if (b.A() != -1) {
      b.a(dw.p, bd.Z);
      b.a(dw.j, bd.ab);
      b.a(dw.k, bd.ab);
      b.a(dw.m, bd.ab);
      b.a(dw.E, bd.ab);
      b.a(e, bd.ab);
    } 
    b.a(c);
    b.b(Jimm.d);
  }
  
  private static void b() {
    b.b(dw.p);
    b.b(dw.j);
    b.b(dw.m);
    b.b(dw.k);
    b.b(dw.E);
    b.b(e);
  }
  
  private synchronized void b(int paramInt, String paramString1, String paramString2, String paramString3) {
    if (!em.h(34))
      return; 
    this.d.addElement(paramString1);
    dm dm = null;
    if (!"".equals(paramString1))
      dm = bi.a(paramString1); 
    String str = dh.b(true, true);
    int i = em.g(1);
    int j = em.g(7);
    int k = em.g(22);
    if (paramInt == 0) {
      j = em.g(16);
      i = em.g(17);
    } 
    if (paramInt == 2) {
      j = em.g(20);
      i = em.g(21);
    } 
    if (paramInt == 1) {
      j = em.g(18);
      i = em.g(19);
    } 
    b.q();
    b.a("[" + this.f + "]: ", i, 0, this.f);
    if ("".equals(paramString1)) {
      b.a("(" + str + ") ", j, 1, this.f);
    } else if (dm == null) {
      b.a(paramString1 + " (" + str + ") ", j, 1, this.f);
    } else {
      b.a(dm.o + " (" + str + ") ", j, 1, this.f);
    } 
    b.a(paramString2, i, 0, this.f);
    if (null != paramString3) {
      b.x(this.f);
      b.a(paramString3, k, 0, this.f);
    } 
    b.x(this.f);
    this.f++;
    b.o(b.c());
    int m = em.f(246);
    if (b.c() > m) {
      while (b.c() > m)
        b.ae.removeElementAt(0); 
      b.o(b.c());
    } 
    b.s();
  }
  
  public static void a(int paramInt, String paramString1, String paramString2, String paramString3) {
    a.b(paramInt, paramString1, paramString2, paramString3);
  }
  
  public static void a(int paramInt, String paramString1, String paramString2) {
    a.b(paramInt, paramString1, paramString2, null);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == dw.f) {
      b.ad = 0;
      if (dw.c == b) {
        bi.i();
        return;
      } 
      dw.d();
      return;
    } 
    if (paramCommand == e) {
      dw.a(b);
      try {
        String str = this.d.elementAt(b.A() - 1);
        if (!"".equals(str))
          dw.a(bi.b(str)); 
        return;
      } catch (Exception exception) {
        return;
      } 
    } 
    if (paramCommand == dw.j || paramCommand == dw.k || paramCommand == dw.m) {
      dw.a("[" + dw.c(b) + "]\n" + b.a(0, (paramCommand == dw.k)), (paramCommand == dw.m));
      return;
    } 
    if (paramCommand == dw.E)
      synchronized (a) {
        this.d.removeAllElements();
        this.f = 1;
        b.z();
        b();
        return;
      }  
  }
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {
    if (paramInt1 == 1000004)
      commandAction(dw.E, null); 
  }
  
  public final void f(int paramInt) {}
  
  public final void a(bd parambd) {}
  
  public final void b(bd parambd) {}
  
  static {
    b = new be(bb.a((short)76));
    b.c(8);
    b.e(3);
    b.a(dw.f, bd.aa);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */