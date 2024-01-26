import i.I;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class be extends bd {
  public Vector ae = new Vector();
  
  private Hashtable ag = new Hashtable();
  
  public int[] af = new int[10];
  
  public be(String paramString) {
    super(paramString);
  }
  
  public final int c() {
    if (this.ae.isEmpty())
      return 0; 
    int i = this.ae.size();
    return (((eh)this.ae.lastElement()).a() == 0) ? (i - 1) : i;
  }
  
  public final eh t(int paramInt) {
    return this.ae.elementAt(paramInt);
  }
  
  public final boolean q(int paramInt) {
    int i;
    boolean bool;
    return ((bool = ((i = this.t) >= this.ae.size()) ? true : (t(i)).c) == -1) ? false : (((t(paramInt)).c == bool));
  }
  
  public final void a(int paramInt1, ev paramev, int paramInt2) {
    eh eh = t(paramInt1);
    paramev.a();
    if (eh.a() == 0)
      return; 
    ee ee = eh.a(0);
    paramev.a = ee.b;
    paramev.l = ee.a();
    paramev.k = ee.b();
  }
  
  public final void z() {
    this.ae.removeAllElements();
    this.ag.clear();
    this.af = new int[10];
    p(0);
    k();
  }
  
  private void a(String paramString, int paramInt) {
    a(paramString, paramInt, 0, -1, true, false);
    k();
  }
  
  private void a(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, char paramChar) {
    ee ee;
    (ee = new ee()).b = paramString;
    ee.c(paramInt1);
    ee.d(paramInt2);
    if (this.ae.isEmpty())
      this.ae.addElement(new eh()); 
    eh eh;
    (eh = this.ae.lastElement()).a(ee);
    eh.c = paramInt3;
    if (paramBoolean) {
      eh.d = paramChar;
      eh eh1;
      (eh1 = new eh()).c = paramInt3;
      this.ae.addElement(eh1);
    } 
  }
  
  public final void u(int paramInt) {
    for (byte b = 0; b < this.ae.size(); b++)
      ((eh)this.ae.elementAt(b)).d(paramInt); 
  }
  
  public final void v(int paramInt) {
    for (byte b = 0; b < this.ae.size(); b++)
      ((eh)this.ae.elementAt(b)).e(paramInt); 
  }
  
  public final void b(String paramString) {
    a(paramString, bd.g());
  }
  
  public final int f(int paramInt) {
    return (this.y != 3) ? super.f(paramInt) : ((paramInt >= this.ae.size()) ? 1 : t(paramInt).b(this.x));
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (this.y != 3) {
      super.a(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
      return;
    } 
    t(paramInt1).a(paramInt2, paramInt3, paramGraphics, this.x, this);
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    int j;
    byte b2;
    byte b1 = 0;
    int k = h() / 2;
    switch (paramInt) {
      case -1:
      case 1:
        j = A();
        i = c();
        m();
        b2 = 0;
        while (b2 < k) {
          this.t += paramInt;
          if (this.t < 0 || this.t >= i) {
            if (b1)
              this.t -= paramInt; 
            break;
          } 
          eh eh = t(this.t);
          if (j != eh.c) {
            j = eh.c;
            if (++b1 == 2 || (!h(this.t) && b2 > 0)) {
              this.t -= paramInt;
              break;
            } 
          } 
          if (!h(this.t) || b1 != 0)
            b2++; 
        } 
        g(paramInt);
        l();
        n();
        break;
      default:
        super.a(paramInt, paramBoolean1, true);
        return;
    } 
    if (!paramBoolean2 && bd.a)
      bd.a(bd.k, 3); 
  }
  
  public final String a(int paramInt1, boolean paramBoolean, int paramInt2) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = this.ae.size();
    boolean bool = false;
    int j = 0;
    if (paramBoolean || paramInt2 == -1 || i < 20) {
      j = 0;
    } else if ((j = a(paramInt2, i, 20)) == 0) {
      j = a(paramInt2, i, 40);
    } 
    for (int k = j; k < i; k++) {
      eh eh = t(k);
      if (paramBoolean || paramInt2 == -1 || eh.c == paramInt2) {
        eh.a(stringBuffer);
        if (eh.d != '\000')
          if (eh.d == '\n') {
            stringBuffer.append("\n");
          } else {
            stringBuffer.append(eh.d);
          }  
        bool = true;
      } else if (bool) {
        break;
      } 
    } 
    if (stringBuffer.length() == 0)
      return null; 
    String str;
    int m = (str = stringBuffer.toString()).length();
    return (paramInt1 > m) ? null : str.substring(paramInt1, m);
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3) {
    int i;
    if ((i = paramInt2 - paramInt3) < 0)
      i = 0; 
    if ((t(i)).c >= paramInt1)
      i = 0; 
    return i;
  }
  
  public final void w(int paramInt) {
    if (paramInt == -1)
      return; 
    int i = this.ae.size();
    for (byte b = 0; b < i; b++) {
      if ((t(b)).c == paramInt) {
        p(b);
        return;
      } 
    } 
  }
  
  public final String a(int paramInt, boolean paramBoolean) {
    return a(paramInt, paramBoolean, A());
  }
  
  public final int A() {
    int i;
    return ((i = this.t) < 0 || i >= this.ae.size()) ? -1 : (t(i)).c;
  }
  
  public final be x(int paramInt) {
    if (this.ae.size() != 0)
      ((eh)this.ae.lastElement()).d = '\n'; 
    eh eh;
    (eh = new eh()).c = paramInt;
    this.ae.addElement(eh);
    return this;
  }
  
  public final void a(long paramLong, I paramI, boolean paramBoolean) {
    Long long_ = new Long(paramLong);
    if (this.ag.containsKey(long_)) {
      int i;
      eh eh;
      ee ee;
      if ((i = ((Integer)this.ag.get(long_)).intValue()) < this.ae.size() && (eh = this.ae.elementAt(i)).a() > 0 && (ee = eh.a.elementAt(0)).a != null) {
        ee.a = paramI;
        k();
      } 
      if (paramBoolean)
        this.ag.remove(long_); 
    } 
  }
  
  public final void a(I paramI, int paramInt, long paramLong) {
    if (this.ae.isEmpty())
      this.ae.addElement(new eh()); 
    eh eh;
    (eh = this.ae.lastElement()).c = paramInt;
    if (eh.a() > 0) {
      x(paramInt);
      eh = this.ae.lastElement();
    } 
    ee ee;
    (ee = new ee()).a = paramI;
    ee.b = "";
    eh.a(ee);
    if (paramLong != 0L) {
      int i = this.ae.size() - 1;
      this.ag.put(new Long(paramLong), new Integer(i));
    } 
  }
  
  public final be a(I paramI, String paramString, int paramInt) {
    if (this.ae.isEmpty())
      this.ae.addElement(new eh()); 
    eh eh;
    (eh = this.ae.lastElement()).c = paramInt;
    if (eh.c(this.x) + paramI.getWidth() > B()) {
      x(paramInt);
      eh = this.ae.lastElement();
    } 
    ee ee;
    (ee = new ee()).a = paramI;
    ee.b = paramString;
    eh.a(ee);
    return this;
  }
  
  public final be a(int paramInt, I paramI, String paramString) {
    if (this.ae.isEmpty())
      this.ae.addElement(new eh()); 
    eh eh = this.ae.elementAt(paramInt);
    ee ee;
    (ee = new ee()).a = paramI;
    ee.b = paramString;
    eh.a(ee);
    eh.b = -1;
    return this;
  }
  
  private int B() {
    return u() - bd.o - this.w * 2;
  }
  
  private boolean b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return a(paramString, paramInt1, paramInt2, paramInt3, paramInt4, false);
  }
  
  private boolean a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    int i1 = 0;
    int i2 = paramInt1;
    boolean bool1 = false;
    String str = null;
    if (paramString == null)
      return paramBoolean; 
    paramString = dh.a(dh.a(paramString, "\r\n", "\n", 0), "\r", "\n", 0);
    Font font = b(paramInt2);
    int n = this.ae.isEmpty() ? paramInt4 : (paramInt4 - ((eh)this.ae.lastElement()).c(this.x));
    int m = 0;
    int k = -1;
    int i = paramString.length();
    if (paramBoolean)
      i2 = a(paramInt1, ">", paramInt1, true); 
    boolean bool2 = !paramBoolean ? true : false;
    for (int j = 0; j < i; j++) {
      char c;
      boolean bool3 = ((c = paramString.charAt(j)) == ' ') ? true : false;
      bool1 = (c == '\n') ? true : false;
      boolean bool4 = (j == i - 1) ? true : false;
      boolean bool5 = false;
      if (bool4 && !bool1)
        j++; 
      if (bool1 || bool4 || bool3) {
        str = paramString.substring(m, j);
        if (fd.a == null || this.x != 16) {
          i1 = font.stringWidth(str);
        } else {
          i1 = fd.a.a(str);
        } 
      } 
      if ((bool1 || bool4) && i1 <= n) {
        i2 = a(paramInt1, str, i2, bool2);
        bool2 = bool1;
        a(str, i2, paramInt2, paramInt3, bool1, bool1 ? 10 : 32);
        n = paramInt4;
        m = ++j;
        k = -1;
        continue;
      } 
      if ((bool1 || bool4 || bool3) && i1 > n)
        if (i1 < paramInt4 && k != -1) {
          bool5 = true;
        } else if (paramInt4 != n && k == -1) {
          x(paramInt3);
          j = m;
          n = paramInt4;
          k = -1;
          continue;
        }  
      if ((bool1 || bool4 || bool3) && i1 > paramInt4 && !bool5) {
        if (k == -1) {
          while (j >= 1) {
            str = paramString.substring(m, j);
            if (fd.a != null) {
              int i3;
              if (this.x != 16) {
                i3 = font.stringWidth(str);
              } else {
                i3 = fd.a.a(str);
              } 
              if (i3 <= n)
                break; 
            } else if (font.stringWidth(str) <= n) {
              break;
            } 
            j--;
          } 
          i2 = a(paramInt1, str, i2, bool2);
          bool2 = bool1;
          a(str, i2, paramInt2, paramInt3, true, false);
          n = paramInt4;
          m = j;
          k = -1;
          continue;
        } 
        bool5 = true;
      } 
      if (bool5) {
        if (em.h(39)) {
          int i3 = j;
          str = paramString.substring(m, i3);
          while (i3 >= 1 && (i1 = font.stringWidth(str)) > n)
            i3--; 
          if (i3 - k + 1 > 1) {
            String str1 = paramString.substring(m, i3);
            i2 = a(paramInt1, str1, i2, bool2);
            bool2 = bool1;
            a(str1, i2, paramInt2, paramInt3, true, false);
            j = i3;
          } else {
            String str1 = paramString.substring(m, k);
            i2 = a(paramInt1, str1, i2, bool2);
            bool2 = bool1;
            a(str1, i2, paramInt2, paramInt3, true, ' ');
            j = k + 1;
          } 
        } else {
          String str1 = paramString.substring(m, k);
          i2 = a(paramInt1, str1, i2, bool2);
          bool2 = bool1;
          a(str1, i2, paramInt2, paramInt3, true, ' ');
          j = k + 1;
        } 
        m = j;
        n = paramInt4;
        k = -1;
        continue;
      } 
      if (bool3)
        k = j; 
    } 
    return (i2 != paramInt1);
  }
  
  private static int a(int paramInt1, String paramString, int paramInt2, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      if (paramString.length() > 0 && paramString.charAt(0) == '>') {
        if ((paramInt1 & 0x808080) > 0) {
          i = bd.e(paramInt1, -64);
        } else {
          i = bd.e(paramInt1, 64);
        } 
      } else {
        i = paramInt1;
      } 
    } else {
      i = paramInt2;
    } 
    return i;
  }
  
  public final be a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    b(paramString, paramInt1, paramInt2, paramInt3, B());
    k();
    return this;
  }
  
  public final boolean a(String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    boolean bool = a(paramString, paramInt1, paramInt2, paramInt3, B(), paramBoolean);
    k();
    return bool;
  }
  
  public static int a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    be be1;
    (be1 = new be(null)).c(paramInt2);
    be1.b(paramString, paramInt4, paramInt3, -1, paramInt1);
    return be1.c();
  }
  
  public static void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    be be1;
    (be1 = new be(null)).c(paramInt5);
    be1.b(paramString, paramInt7, paramInt6, -1, paramInt3);
    int i = 0;
    int j = be1.c();
    byte b;
    for (b = 0; b < j; b++)
      i += be1.t(b).b(paramInt5); 
    int k = paramInt2 + (paramInt4 - i) / 2;
    for (b = 0; b < j; b++) {
      be1.t(b).a(paramInt1, k, paramGraphics, paramInt5, be1);
      k += be1.t(b).b(paramInt5);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\be.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */