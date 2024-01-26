import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class co extends bd {
  public final cx ae = new cx(null);
  
  private Vector ah;
  
  private boolean ai = false;
  
  private int aj = 6;
  
  private boolean ak = true;
  
  private boolean al = true;
  
  private int am;
  
  public bo af;
  
  public cx ag;
  
  public co(String paramString, boolean paramBoolean) {
    super(paramString);
    this.ae.c = true;
    this.ag = null;
    this.al = paramBoolean;
  }
  
  private void B() {
    this.ai = true;
  }
  
  private cx u(int paramInt) {
    return this.ah.elementAt(paramInt);
  }
  
  private void C() {
    if (this.ai || this.ah == null)
      D(); 
  }
  
  public final void t(int paramInt) {
    this.aj = paramInt;
    k();
  }
  
  public final void c(boolean paramBoolean) {
    if (paramBoolean == this.ak)
      return; 
    this.ak = paramBoolean;
    k();
  }
  
  public final cx z() {
    return (this.t < 0 || this.t >= this.ah.size()) ? null : u(this.t);
  }
  
  public final void a(cx paramcx) {
    if (this.r) {
      this.ag = paramcx;
      return;
    } 
    C();
    if (z() == paramcx)
      return; 
    int i = this.ah.size();
    byte b = 0;
    while (b < i) {
      if (u(b) != paramcx) {
        b++;
        continue;
      } 
      p(b);
      return;
    } 
    Vector vector = new Vector();
    a(vector, this.ae, paramcx);
    if ((i = vector.size()) != 0) {
      for (b = 0; b < i; b++)
        ((cx)vector.elementAt(b)).c = true; 
      D();
      a(paramcx);
      B();
      k();
    } 
  }
  
  private boolean a(Vector paramVector, cx paramcx1, cx paramcx2) {
    int i = paramcx1.b();
    for (byte b = 0; b < i; b++) {
      cx cx1;
      if ((cx1 = paramcx1.a(b)) == paramcx2)
        return true; 
      if (a(paramVector, cx1, paramcx2)) {
        paramVector.addElement(cx1);
        return true;
      } 
    } 
    return false;
  }
  
  public final boolean o() {
    cx cx1;
    if ((cx1 = z()) == null)
      return false; 
    if (this.al) {
      if (cx1.b() != 0) {
        cx1.c = !cx1.c;
        D();
        k();
      } 
      return false;
    } 
    a(s(4));
    return true;
  }
  
  public final boolean n(int paramInt) {
    cx cx1;
    if ((cx1 = z()) == null)
      return false; 
    if (cx1.b() > 0 && paramInt < 3 * p() / 2 + cx1.d * this.aj) {
      o();
      return true;
    } 
    return false;
  }
  
  public final int c() {
    C();
    return this.ah.size();
  }
  
  private void D() {
    this.ai = false;
    if (this.ah == null)
      this.ah = new Vector(); 
    this.ah.removeAllElements();
    int i = this.ae.b();
    for (byte b = 0; b < i; b++)
      b(this.ae.a(b), 0); 
    g(3);
  }
  
  private void b(cx paramcx, int paramInt) {
    this.ah.addElement(paramcx);
    paramcx.d = paramInt;
    if (paramcx.c == true) {
      int i = paramcx.b();
      for (byte b = 0; b < i; b++)
        b(paramcx.a(b), paramInt + 1); 
    } 
  }
  
  public final void a(int paramInt1, ev paramev, int paramInt2) {
    C();
    cx cx1 = u(paramInt1);
    this.af.a(cx1, paramev, paramInt2);
    paramev.m = cx1.d * this.aj;
    if (this.ak && cx1.b() != 0)
      paramev.m += 3 * this.am / 4; 
  }
  
  private static int a(Graphics paramGraphics, cx paramcx, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    if ((i = 2 * paramInt4 / 3) < 7)
      i = 7; 
    if (i % 2 == 0)
      i--; 
    if (paramcx.b() != 0) {
      int j = (paramInt2 + paramInt3 - i) / 2;
      int k = paramGraphics.getColor();
      paramGraphics.setColor(8421504);
      paramGraphics.drawRect(paramInt1, j, i - 1, i - 1);
      int m = paramInt1 + i / 2;
      int n = j + i / 2;
      paramGraphics.drawLine(paramInt1 + 2, n, paramInt1 + i - 3, n);
      if (!paramcx.c)
        paramGraphics.drawLine(m, j + 2, m, j + i - 3); 
      paramGraphics.setColor(k);
    } 
    return i + 1;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.am = paramInt6;
    C();
    super.a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    if (this.ak) {
      cx cx1 = u(paramInt1);
      int i = paramInt2 + cx1.d * this.aj;
      a(paramGraphics, cx1, i, paramInt3, paramInt5, paramInt6);
    } 
  }
  
  public final cx a(cx paramcx, Object paramObject) {
    if (paramcx == null)
      paramcx = this.ae; 
    cx cx1 = new cx(paramObject);
    paramcx.a(cx1);
    B();
    k();
    return cx1;
  }
  
  private cx b(cx paramcx1, cx paramcx2) {
    if (paramcx1.b(paramcx2) != -1)
      return paramcx1; 
    int i = paramcx1.b();
    for (byte b = 0; b < i; b++) {
      cx cx1;
      if ((cx1 = b(paramcx1.a(b), paramcx2)) != null)
        return cx1; 
    } 
    return null;
  }
  
  public final boolean b(cx paramcx) {
    E();
    cx cx1;
    if ((cx1 = b(this.ae, paramcx)) == null)
      return false; 
    int i;
    if ((i = cx1.b(paramcx)) == -1)
      return false; 
    cx1.b(i);
    g(3);
    B();
    k();
    F();
    return true;
  }
  
  public final void c(cx paramcx) {
    E();
    if (paramcx == null)
      paramcx = this.ae; 
    paramcx.a(this.af);
    if (paramcx.c) {
      B();
      k();
    } 
    F();
  }
  
  public final void a(cx paramcx1, cx paramcx2, int paramInt) {
    if (paramcx1 == null)
      paramcx1 = this.ae; 
    E();
    paramcx1.a(paramcx2, paramInt);
    if (paramcx1.c) {
      B();
      k();
    } 
    F();
  }
  
  public final void a(cx paramcx, int paramInt) {
    if (paramcx == null)
      paramcx = this.ae; 
    E();
    paramcx.b.removeElementAt(paramInt);
    if (paramcx.c) {
      B();
      k();
    } 
    F();
  }
  
  public static int a(cx paramcx1, cx paramcx2) {
    return (paramcx1.b == null) ? -1 : paramcx1.b.indexOf(paramcx2);
  }
  
  public final void a(cx paramcx, boolean paramBoolean) {
    if (paramcx.c == paramBoolean)
      return; 
    paramcx.c = paramBoolean;
    B();
    k();
  }
  
  public final void A() {
    this.ae.a();
    D();
    g(3);
    l();
    k();
  }
  
  private void E() {
    this.ag = z();
  }
  
  public final void r() {
    F();
  }
  
  private void F() {
    if (this.r)
      return; 
    a(this.ag);
    this.ag = null;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\co.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */