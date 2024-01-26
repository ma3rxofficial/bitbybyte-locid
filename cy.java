import i.I;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDletStateChangeException;
import jimm.Jimm;

public final class cy implements CommandListener {
  public static cy a;
  
  public static final Command b = new cc(bb.a((short)186), 4, 2, bi.d.a(17), 49);
  
  public static final Command c = new cc(bb.a((short)214), 4, 2, bi.d.a(18));
  
  public static final Command d = new cc(bb.a((short)367), 4, 5, bi.d.a(3), 56);
  
  public static final Command e = new cc(bb.a((short)489), 4, 5, bi.d.a(24));
  
  public static final Command f = new cc(bb.a((short)297), 4, 1, bi.d.a(0));
  
  public static final Command g = new cc(bb.a((short)690), 4, 4, null, 51);
  
  public static final Command h = new cc(bb.a((short)329), 4, 4, bi.d.a(1), 52);
  
  public static final Command i = new cc(c(false), 4, 4, b(false));
  
  public static final Command j = new cc(c(true), 4, 4, b(true));
  
  public static final Command k = new cc(bb.a((short)89), 4, 5, bi.d.a(4));
  
  public static final Command l = new cc(bb.a((short)674), 4, 5, bi.c.a(0), 53);
  
  public static final Command m = new cc(bb.a((short)338), 4, 6, bi.d.a(27), 48);
  
  public static final Command n = new cc(bb.a((short)135), 4, 5, dv.N.a(14));
  
  public static final Command o = new cc(bb.a((short)343), 4, 4, bi.d.a(9), 55);
  
  public static final Command p = new cc(bb.a((short)76), 4, 5, bi.d.a(33));
  
  public static final Command q = new cc(bb.a((short)828), 4, 6, bi.d.a(4));
  
  public static final Command r = new cc(bb.a((short)224), 4, 6, bi.d.a(28));
  
  public static final Command s = new cc(bb.a((short)674), 4, 5, 53);
  
  public static Command t = new Command(bb.a((short)17), 4, 1);
  
  private static Command z = new Command(bb.a((short)224), 7, 1);
  
  private static be A;
  
  private static be B;
  
  private static be C;
  
  private static be D;
  
  public static be u;
  
  private static int E = 0;
  
  private static fa F;
  
  private static be G = new be(bb.a((short)332));
  
  private static int[] H;
  
  public static Form v;
  
  private static TextField I;
  
  private static TextBox J;
  
  public static boolean w;
  
  public static boolean x;
  
  public static bk y;
  
  public cy() {
    a = this;
  }
  
  public static I a() {
    int i = dw.a(em.i(300));
    return bi.b().a(i);
  }
  
  public static I b() {
    return dv.b(eu.c());
  }
  
  public static I c() {
    byte b = 4;
    switch (em.f(238)) {
      case 1:
        b = 0;
        break;
      case 3:
        b = 1;
        break;
      case 4:
        b = 2;
        break;
      case 5:
        b = 3;
        break;
      case 2:
        b = 4;
        break;
    } 
    return bi.j.a(b);
  }
  
  public static void d() {
    int i = u.A();
    u.q();
    u.y();
    u.z();
    dw.a(u, bb.a((short)427), a(), 7, 49);
    dw.a(u, bb.a((short)428), b(), 8, 50);
    dw.a(u, bb.a((short)387), c(), 9, 51);
    ((cc)g).a = a();
    boolean bool = em.h(33);
    dw.a(u, d(bool), e(bool), 19, 52);
    u.w(i);
    u.s();
    u.a(a);
    u.a(dw.q, bd.Z);
    u.a(dw.f, bd.aa);
    u.b(Jimm.d);
  }
  
  public static void e() {
    boolean bool1 = cd.f();
    G.q();
    int i = G.A();
    G.y();
    G.z();
    if (bool1) {
      dw.a(G, bb.a((short)297), bi.d.a(0), 6);
      dw.a(G, bb.a((short)214), bi.d.a(18), 2);
    } else {
      dw.a(G, bb.a((short)186), bi.d.a(17), 1);
    } 
    dw.a(G, bb.a((short)690), bi.b.a(7), 18, 51);
    dw.a(G, bb.a((short)691), bi.d.a(21), 20);
    boolean bool2 = em.h(43);
    dw.a(G, c(bool2), b(bool2), 15);
    if (bool1) {
      dw.a(G, bb.a((short)329), bi.d.a(1), 10);
      dw.a(G, bb.a((short)343), bi.d.a(9), 16);
    } else {
      dw.a(G, bb.a((short)192), bi.d.a(1), 3);
    } 
    if (em.h(34))
      dw.a(G, bb.a((short)76), bi.d.a(33), 17); 
    dw.a(G, bb.a((short)673), bi.c.a(0), 12, 53);
    if (!Jimm.i && !Jimm.j)
      dw.a(G, bb.a((short)135), dv.N.a(14), 14); 
    dw.a(G, bb.a((short)367), bi.d.a(3), 4, 56);
    dw.a(G, bb.a((short)489), bi.d.a(24), 5);
    dw.a(G, bb.a((short)89), bi.d.a(4), 11);
    if (Jimm.i)
      dw.a(G, bb.a((short)338), bi.d.a(27), 13, 48); 
    dw.a(G, bb.a((short)828), bi.d.a(4), 21);
    if (cd.e() || em.h(61))
      dw.a(G, bb.a((short)224), bi.d.a(28), 22); 
    G.a(dw.q, bd.Z);
    G.a(dw.f, bd.aa);
    G.w(i);
    G.s();
    G.u = true;
    G.a(a);
  }
  
  public static void a(Alert paramAlert) {
    if (em.h(72)) {
      bi.a(paramAlert);
      return;
    } 
    e();
    G.a(Jimm.d, paramAlert);
  }
  
  public static void f() {
    if (em.h(72)) {
      bi.i();
      return;
    } 
    if (em.h(22))
      dw.i(); 
    e();
    G.b(Jimm.d);
    dw.a(G);
  }
  
  public static be g() {
    return G;
  }
  
  private static void a(String paramString1, String paramString2, String paramString3, int paramInt) {
    v = new Form(paramString1);
    I = new TextField(paramString2, paramString3, 16, paramInt);
    v.append((Item)I);
    v.addCommand(t);
    v.addCommand(dw.e);
    v.setCommandListener(a);
    Jimm.d.setCurrent((Displayable)v);
  }
  
  public static void a(boolean paramBoolean) {
    if (!paramBoolean && bi.u() > 0) {
      dw.a(bb.a((short)112), bb.a((short)274), 1, a, 1);
      return;
    } 
    cd.d();
    try {
      Thread.sleep(500L);
    } catch (InterruptedException interruptedException) {}
    try {
      Jimm.c.destroyApp(true);
      return;
    } catch (MIDletStateChangeException mIDletStateChangeException) {
      return;
    } 
  }
  
  private static String c(boolean paramBoolean) {
    return bb.a(paramBoolean ? 440 : 441);
  }
  
  private static String d(boolean paramBoolean) {
    return bb.a(paramBoolean ? 692 : 693);
  }
  
  private static I e(boolean paramBoolean) {
    return bi.h.a(0);
  }
  
  private static void c(int paramInt) {
    switch (paramInt) {
      case 7:
        i();
        return;
      case 8:
        j();
        return;
      case 9:
        k();
        return;
      case 19:
        bi.d(false);
        d();
        break;
    } 
  }
  
  private static void d(int paramInt) {
    switch (paramInt) {
      case 4:
        em.a(43, false);
        em.a(211, 1);
        em.a(24, true);
        em.a(20, true);
        em.a(209, 1);
        em.a(10, false);
        f();
        return;
      case 5:
        em.a(43, true);
        em.a(211, 0);
        em.a(24, true);
        em.a(20, true);
        em.a(209, 1);
        em.a(10, false);
        f();
        return;
      case 6:
        em.a(43, false);
        em.a(211, 1);
        em.a(24, false);
        em.a(20, false);
        em.a(209, 0);
        em.a(10, true);
        f();
        return;
      case 7:
        em.a(43, true);
        em.a(211, 0);
        em.a(24, false);
        em.a(20, false);
        em.a(209, 0);
        em.a(10, true);
        f();
        break;
    } 
  }
  
  public static I b(boolean paramBoolean) {
    return paramBoolean ? bi.d.a(16) : bi.d.a(15);
  }
  
  public static I a(int paramInt) {
    if (bi.l == null)
      return null; 
    if (bi.l.a() == 0)
      return null; 
    if (paramInt >= bi.l.a())
      paramInt = 1; 
    return bi.l.a(paramInt);
  }
  
  private static void n() {
    A = new be(bb.a((short)427));
    A.e(3);
    A.u = true;
    A.q();
    dw.a(A, bb.a((short)472), bi.b.a(7), 0);
    dw.a(A, bb.a((short)465), bi.b.a(1), 32, 50);
    dw.a(A, bb.a((short)473), bi.b.a(8), 12288, 51);
    dw.a(A, bb.a((short)474), bi.b.a(9), 16384, 52);
    dw.a(A, bb.a((short)475), bi.b.a(10), 20480, 53);
    dw.a(A, bb.a((short)476), bi.b.a(11), 24576, 54);
    dw.a(A, bb.a((short)477), bi.b.a(12), 8193);
    dw.a(A, bb.a((short)464), bi.b.a(0), 1, 55);
    dw.a(A, bb.a((short)469), bi.b.a(4), 4, 56);
    dw.a(A, bb.a((short)470), bi.b.a(5), 16);
    dw.a(A, bb.a((short)466), bi.b.a(2), 2, 57);
    dw.a(A, bb.a((short)467), bi.b.a(3), 256, 48);
    if (c() == null)
      dw.a(A, bb.a((short)468), bi.b.a(13), 512); 
    A.s();
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == z) {
      a(false);
      return;
    } 
    if (dw.a(u)) {
      if (paramCommand == dw.q) {
        c(u.A());
        return;
      } 
      if (paramCommand == dw.f)
        f(); 
      return;
    } 
    if (dw.a(D)) {
      if (paramCommand == dw.q) {
        d(D.A());
        return;
      } 
      if (paramCommand == dw.f)
        f(); 
      return;
    } 
    if (dw.a(B)) {
      if (paramCommand == dw.q) {
        cd.a((byte)B.A());
        q();
        return;
      } 
      if (paramCommand == dw.f)
        u.b(Jimm.d); 
      return;
    } 
    if (dw.a(C)) {
      if (paramCommand == dw.q) {
        g(C.A());
        return;
      } 
      if (paramCommand == dw.f)
        f(); 
      return;
    } 
    if (dw.e() == 2) {
      if (paramCommand == dw.d) {
        String str = bi.c(H[dw.l()]).h();
        a(bb.a((short)409), bb.a((short)271), str, 0);
        return;
      } 
      f();
      return;
    } 
    if (dw.e() == 3) {
      if (paramCommand == dw.d) {
        ei ei = new ei(bi.c(H[dw.l()]), 2);
        try {
          cd.a(ei);
          ef.a(bb.a((short)543), ei, false);
          return;
        } catch (cr cr) {
          cr.a(null);
          return;
        } 
      } 
      f();
      return;
    } 
    if (paramCommand == dw.f && (dw.a(A) || dw.a(F))) {
      u.b(Jimm.d);
      A = null;
      F = null;
      return;
    } 
    if (paramCommand == dw.f && dw.a(G)) {
      bi.i();
      return;
    } 
    if (paramCommand == dw.q && dw.a(F)) {
      p();
      F = null;
      return;
    } 
    if (paramCommand == t && paramDisplayable == v && v != null) {
      bu bu1;
      bu bu2;
      ei ei = null;
      switch (E) {
        case 1:
          bu1 = new bu(I.getString());
          ei = new ei(bu1, 1);
          break;
        case 2:
          (bu2 = bi.c(H[dw.l()])).a(I.getString());
          bi.o();
          ei = new ei(bu2, 3);
          break;
      } 
      E = 0;
      try {
        cd.a(ei);
      } catch (cr cr) {
        cr.a((cr)(bu1 = null));
        if (((cr)bu1).a)
          return; 
      } 
      ef.a(bb.a((short)543), ei, false);
      return;
    } 
    if (paramCommand == dw.e && paramDisplayable == v) {
      f();
      v = null;
      return;
    } 
    if (dw.a(paramCommand, 1) == 3) {
      a(true);
      return;
    } 
    if (dw.a(paramCommand, 1) == 4) {
      bi.i();
      return;
    } 
    if (paramCommand == dw.q && dw.a(G)) {
      boolean bool = false;
      b(G.A());
      return;
    } 
    if (paramCommand == dw.q && dw.a(A)) {
      o();
      return;
    } 
    if (paramDisplayable == J && paramCommand == dw.q) {
      int i;
      em.b(f(i = (int)em.i(300)), J.getString());
      em.b(13);
      e(i);
      return;
    } 
    if (dw.a(paramCommand, 4) == 1)
      g(dw.l()); 
  }
  
  public static void b(int paramInt) {
    switch (paramInt) {
      case 1:
        cd.l = em.f(204);
        bi.k();
        cd.b();
        return;
      case 2:
        cd.d();
        Thread.yield();
        f();
        return;
      case 3:
        bi.i();
        return;
      case 6:
        ef.c();
        return;
      case 18:
        l();
        return;
      case 20:
        D = new be(bb.a((short)691));
        D.e(3);
        D.u = true;
        D.q();
        dw.a(D, bb.a((short)694), bi.d.a(1), 4, 49);
        dw.a(D, bb.a((short)695), bi.d.a(16), 5, 50);
        dw.a(D, bb.a((short)696), bi.d.a(25), 6, 51);
        dw.a(D, bb.a((short)697), bi.d.a(0), 7, 51);
        D.p(3 - (em.h(10) ? 0 : 2) + (em.h(43) ? 0 : 1));
        D.s();
        D.a(a);
        D.a(dw.q, bd.Z);
        D.a(dw.f, bd.aa);
        D.b(Jimm.d);
        return;
      case 10:
        m();
        return;
      case 4:
        if (!dw.L) {
          em.d();
          return;
        } 
        dw.f();
        return;
      case 5:
        db.d.a();
        return;
      case 12:
        if (!dw.L) {
          cp.g.b();
          return;
        } 
        dw.f();
        return;
      case 11:
        dw.f();
        return;
      case 13:
        Jimm.a(true);
        return;
      case 15:
        bi.b(false);
        e();
        return;
      case 17:
        cl.a();
        return;
      case 14:
        bw.a();
        return;
      case 16:
        dw.a(em.c(-1), "", false);
        return;
      case 22:
        a(false);
        return;
      case 21:
        h();
        break;
    } 
  }
  
  public static void h() {
    if (y == null)
      y = new bk(); 
    y.a();
  }
  
  public static void i() {
    w = false;
    n();
    A.w((int)em.i(300));
    A.a(a);
    A.a(dw.q, bd.Z);
    A.a(dw.f, bd.aa);
    A.b(Jimm.d);
  }
  
  public static void j() {
    x = false;
    F = new fa(1, (em.f(218) == dv.a) ? 0 : (em.f(218) + 1));
    F.u = true;
    F.a(dw.q, bd.Z);
    F.a(dw.f, bd.aa);
    F.a(a);
    F.b(Jimm.d);
  }
  
  public static void k() {
    B = new be(bb.a((short)387));
    B.e(3);
    B.u = true;
    B.q();
    dw.a(B, bb.a((short)388), bi.j.a(0), 1, 49);
    dw.a(B, bb.a((short)389), bi.j.a(1), 3, 50);
    dw.a(B, bb.a((short)390), bi.j.a(2), 4, 51);
    dw.a(B, bb.a((short)391), bi.j.a(3), 5, 52);
    dw.a(B, bb.a((short)392), bi.j.a(4), 2, 53);
    B.s();
    B.a(a);
    B.a(dw.q, bd.Z);
    B.a(dw.f, bd.aa);
    B.w(em.f(238));
    B.b(Jimm.d);
  }
  
  public static void l() {
    u = new be(bb.a((short)690));
    u.e(3);
    u.u = true;
    u.q();
    dw.a(u, bb.a((short)427), a(), 7, 49);
    dw.a(u, bb.a((short)428), b(), 8, 50);
    dw.a(u, bb.a((short)387), c(), 9, 51);
    ((cc)g).a = a();
    boolean bool = em.h(33);
    dw.a(u, d(bool), e(bool), 19, 52);
    u.s();
    u.a(a);
    u.a(dw.q, bd.Z);
    u.a(dw.f, bd.aa);
    u.b(Jimm.d);
  }
  
  public static void m() {
    C = new be(bb.a((short)329));
    C.e(3);
    C.u = true;
    C.q();
    dw.a(C, bb.a((short)16), bi.d.a(2), 0, 49);
    dw.a(C, bb.a((short)94), bi.d.a(29), 1, 50);
    dw.a(C, bb.a((short)409), bi.d.a(11), 2, 51);
    dw.a(C, bb.a((short)202), bi.d.a(6), 3, 52);
    C.s();
    C.a(a);
    C.a(dw.q, bd.Z);
    C.a(dw.f, bd.aa);
    C.b(Jimm.d);
  }
  
  private static void o() {
    boolean bool = false;
    int i = A.A();
    em.a(300, i);
    if (i != 256 && i != 512 && i != 0 && i != 32) {
      J = dw.a(new TextBox(bb.a((short)454), em.d(f(i)), 255, 0));
      J.addCommand(dw.q);
      J.setCommandListener(a);
      Jimm.d.setCurrent((Displayable)J);
    } else {
      bool = true;
    } 
    em.b(14);
    A = null;
    if (bool)
      e(i); 
  }
  
  private static void e(int paramInt) {
    if (paramInt == 256)
      try {
        cd.a((byte)3);
      } catch (Exception exception) {} 
    if (cd.f())
      try {
        cd.a(paramInt);
      } catch (cr cr2) {
        cr cr1;
        cr.a(cr1 = null);
        if (cr1.a)
          return; 
      }  
    ef.a(dw.a(cd.j()));
    q();
  }
  
  private static int f(int paramInt) {
    byte b = 116;
    switch (paramInt) {
      case 1:
        b = 116;
        break;
      case 4:
        b = 118;
        break;
      case 2:
        b = 117;
        break;
      case 16:
        b = 119;
        break;
      case 12288:
        b = 120;
        break;
      case 16384:
        b = 121;
        break;
      case 20480:
        b = 122;
        break;
      case 24576:
        b = 123;
        break;
      case 8193:
        b = 124;
        break;
    } 
    return b;
  }
  
  private void g(int paramInt) {
    switch (paramInt) {
      case 0:
        (new ff(false)).b().a(2);
        return;
      case 1:
        E = 1;
        a(bb.a((short)94), bb.a((short)271), null, 0);
        return;
      case 2:
        E = 2;
        H = dw.a(bb.a((short)409), 2, this, 1, -1);
        return;
      case 3:
        H = dw.a(bb.a((short)202), 3, this, 2, -1);
        break;
    } 
  }
  
  private static void p() {
    int i;
    if ((i = fa.z()) == 0) {
      em.a(218, dv.a);
      em.b(15);
      q();
      if (cd.f())
        try {
          eu.b();
        } catch (cr cr) {
          cr.a(null);
        }  
      ef.a(cd.k());
      return;
    } 
    bf.a(i);
  }
  
  private static void q() {
    u.b(Jimm.d);
    d();
  }
  
  static {
    G.e(3);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */