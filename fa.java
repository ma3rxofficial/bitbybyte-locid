import i.I;
import javax.microedition.lcdui.Graphics;

public final class fa extends bd implements bx {
  private static int ag;
  
  private static int ah;
  
  private static int ai;
  
  private static int aj;
  
  private static int ak;
  
  private static int al;
  
  private static int am;
  
  private static int an;
  
  private static fa ao;
  
  public static final int[] ae = new int[216];
  
  public static int af = 0;
  
  private static int ap = 19;
  
  private static boolean aq = false;
  
  public fa(int paramInt1, int paramInt2) {
    super(null);
    ao = this;
    this.p = this;
    an = paramInt1;
    af = 0;
    int i = bd.v() - bd.o;
    e(3);
    switch (an) {
      case 0:
        ai = dy.a.b;
        aj = ai + 2;
        aq = (em.f(259) > 0);
        break;
      case 1:
        ai = (dv.d()).b;
        aj = ai + ((i > 176) ? 6 : 4);
        break;
      case 2:
        ai = i / ((i < 150) ? 8 : 12);
        aj = ai;
        break;
    } 
    ag = i / aj;
    ah = (C() + ag - 1) / ag;
    ao.v(paramInt2);
    aj += (i - aj * ag) / ag;
    ak = aj - ai;
    B();
  }
  
  public final boolean n(int paramInt) {
    int i = al;
    al = paramInt / aj;
    if (al < 0)
      al = 0; 
    if (al >= ag)
      al = ag - 1; 
    if (i != al) {
      B();
      k();
    } 
    return false;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int j = ag * paramInt1;
    switch (an) {
      case 0:
        am = dy.a.a() + (aq ? ag : 0);
        break;
      case 1:
        am = dv.a() + 1;
        break;
      case 2:
        am = ae.length;
        break;
    } 
    boolean bool = (paramInt1 == this.t) ? true : false;
    int k = C();
    int i = paramInt2;
    byte b = 0;
    while (b < ag) {
      if (j >= k)
        return; 
      int m = i + aj;
      if (bool && b == al) {
        if (em.e() > 10) {
          if (em.e() == 255 || an == 2) {
            bd.a(paramGraphics, i + 1, paramInt3 + 1, aj - 2, paramInt5 - paramInt3 - 2, em.g(8), 16, -32, 0);
          } else {
            bd.a(paramGraphics, bd.e(em.g(8), -48), em.g(8), i, paramInt3, i + aj, paramInt3 + aj, em.e());
          } 
        } else {
          paramGraphics.setStrokeStyle(1);
        } 
        int n;
        if ((n = em.g(23)) == 0)
          n = bd.e(em.g(8), -48); 
        paramGraphics.setColor(n);
        paramGraphics.drawRect(i, paramInt3, aj - 1, paramInt5 - paramInt3 - 1);
      } 
      if (j < am) {
        int n;
        int i1;
        I i2;
        switch (an) {
          case 0:
            n = u(j);
            if (aq && j == ap && ap < ag) {
              paramGraphics.setColor(16711680);
              paramGraphics.drawLine(i, paramInt3, i + 3, paramInt3 + 3);
              paramGraphics.drawLine(i + 3, paramInt3, i + 3, paramInt3 + 3);
              paramGraphics.drawLine(i, paramInt3 + 3, i + 3, paramInt3 + 3);
            } 
            dy.a.a(n).drawInCenter(paramGraphics, i + aj / 2, (paramInt3 + paramInt5) / 2);
            if (aq && j < ag && em.h(92)) {
              paramGraphics.setColor(16777011);
              paramGraphics.drawString("" + (1 + j), i, paramInt5, 36);
            } 
            break;
          case 1:
            i1 = ak / 2 + ak % 2;
            if ((i2 = dv.b((j == 0) ? (dv.a - 1) : (j - 1))) != null)
              i2.drawImage(paramGraphics, i + i1, paramInt3 + i1); 
            break;
          case 2:
            paramGraphics.setColor(ae[j]);
            paramGraphics.fillRect(i + 2, paramInt3 + 2, aj - 4, aj - 4);
            if (bool && b == al) {
              paramGraphics.setColor(ae[j] ^ 0x808080);
              paramGraphics.drawLine(i + 2, paramInt3 + 2, i + 2 + aj - 4, paramInt3 + 2 + aj - 4);
              paramGraphics.drawLine(i + 2, paramInt3 + 2 + aj - 4, i + 2 + aj - 4, paramInt3 + 2);
            } 
            break;
        } 
      } 
      i = m;
      b++;
      j++;
    } 
  }
  
  private static void B() {
    int j;
    int k;
    int m;
    String str;
    int i = ao.t * ag + al;
    switch (an) {
      case 0:
        if (i >= dy.e.length + (aq ? ag : 0))
          return; 
        j = u(i);
        dy.g = dy.d[j];
        if ((k = af / 4) > 10)
          k = 10; 
        if (k > 0) {
          ao.a_(dy.e[j] + " x" + k);
          return;
        } 
        ao.a_(dy.e[j]);
        return;
      case 1:
        if (i > dv.a() + 1)
          return; 
        m = (i == 0) ? (dv.a - 1) : (i - 1);
        ao.a_(dv.c(m));
        return;
      case 2:
        str = "00000" + Integer.toHexString(ae[i]).toUpperCase();
        ao.a_(str.substring(str.length() - 6));
        break;
    } 
  }
  
  public final int f(int paramInt) {
    return aj;
  }
  
  public final int c() {
    return ah;
  }
  
  private static int C() {
    switch (an) {
      case 0:
        return dy.b.length + (aq ? ag : 0);
      case 1:
        return dv.a() + 1;
      case 2:
        return ae.length;
    } 
    return -1;
  }
  
  public static int z() {
    return ao.t * ag + al;
  }
  
  private void v(int paramInt) {
    if (paramInt > C())
      return; 
    ao.p(paramInt / ag);
    al = paramInt % ag;
    k();
  }
  
  public static int t(int paramInt) {
    int i = (paramInt >> 16 & 0xFF) + 21;
    int j = (paramInt >> 8 & 0xFF) + 21;
    int k = (paramInt >> 0 & 0xFF) + 21;
    i -= i % 51;
    j -= j % 51;
    k -= k % 51;
    paramInt = (i << 16) + (j << 8) + k;
    for (byte b = 0; b < ae.length; b++) {
      if (paramInt == ae[b])
        return b; 
    } 
    return 0;
  }
  
  public final void a(int paramInt1, ev paramev, int paramInt2) {}
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {
    int i = al;
    int j = this.t;
    int k = c();
    switch (bd.d(paramInt1)) {
      case 2:
        if (al != 0) {
          al--;
          break;
        } 
        if (j != 0) {
          al = ag - 1;
          j--;
          break;
        } 
        al = (C() - 1) % ag;
        j = k - 1;
        break;
      case 5:
        if (al < ag - 1) {
          al++;
        } else if (j <= k) {
          al = 0;
          j++;
        } 
        if (al + j * ag > C() - 1) {
          al = 0;
          j = 0;
        } 
        break;
    } 
    if (paramInt1 == 48 && an == 0)
      af++; 
    if (paramInt1 == 42 && an == 0) {
      if (j == 0)
        ap = al + j * ag; 
      k();
    } 
    if (aq && paramInt1 == 35 && an == 0 && (ap < ag || ap == 19)) {
      if (ap == 19)
        ap = 0; 
      em.b[ap] = u(al + j * ag);
      ap++;
      if (ap == ag)
        ap = 19; 
      em.b(100);
      k();
    } 
    if (aq && an == 0 && paramInt1 >= 49 && paramInt1 <= 57 && em.h(92) && paramInt1 - 49 < ag) {
      al = paramInt1 - 49;
      j = 0;
      af++;
      k();
      B();
    } 
    p(j);
    int m = al + this.t * ag;
    int n = C();
    if (m >= n)
      al = (n - 1) % ag; 
    if (i != al || paramInt1 == 48) {
      k();
      B();
    } 
  }
  
  public static int u(int paramInt) {
    return (an != 0 || !aq) ? paramInt : ((paramInt < ag) ? em.b[paramInt] : (paramInt - ag));
  }
  
  public final void f(int paramInt) {
    if (an == 0 && paramInt == 48)
      dy.a(); 
    if (aq && an == 0 && paramInt >= 49 && paramInt <= 57 && em.h(92) && paramInt - 49 == al)
      dy.a(); 
  }
  
  public final void a(bd parambd) {
    B();
  }
  
  public final void b(bd parambd) {}
  
  public static int A() {
    return ag;
  }
  
  static {
    byte b1 = 0;
    for (byte b2 = 0; b2 < 'Ā'; b2 += 51) {
      for (byte b = 0; b < 'Ā'; b += 51) {
        for (byte b3 = 0; b3 < 'Ā'; b3 += 51) {
          ae[b1] = b2 * 65536 + b * 256 + b3;
          b1++;
        } 
      } 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\fa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */