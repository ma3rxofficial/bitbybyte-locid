import i.I;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import jimm.Jimm;

public abstract class bd {
  public static boolean a = false;
  
  public static boolean b = false;
  
  public static int c;
  
  public static int d;
  
  public static int e;
  
  public static int f;
  
  public static int g;
  
  public static long h;
  
  public static int i = 210;
  
  public static int j = 70;
  
  public static int k = j * 1;
  
  public static boolean l = true;
  
  public static fc m = new fc();
  
  private long ae;
  
  public static Image n;
  
  private Font af;
  
  private Font ag;
  
  private Font ah;
  
  private Font ai;
  
  public static final int o;
  
  private static Font aj = Font.getFont(64, 1, 8);
  
  public bx p;
  
  public String q;
  
  public boolean r = false;
  
  public df s = null;
  
  public int t = 0;
  
  public boolean u = false;
  
  public static final ev v;
  
  private int ak = 0;
  
  private int al = 0;
  
  private boolean am = false;
  
  private I an;
  
  private I ao;
  
  private I ap;
  
  private I aq;
  
  private I ar;
  
  private I as;
  
  private static int at;
  
  private static int au;
  
  private static int av;
  
  public int w = 1;
  
  private int aw = 0;
  
  public int x = 8;
  
  public int y = 2;
  
  public int z = 1;
  
  private int ax;
  
  private int ay;
  
  public int[][] A = new int[0][0];
  
  public int B;
  
  private int[] az = new int[0];
  
  private int[] aA;
  
  private int aB;
  
  public int C = 7496580;
  
  private static int aC;
  
  private static int aD;
  
  public int[] D = new int[5];
  
  public long E;
  
  public static boolean F;
  
  public static long G;
  
  private CommandListener aE;
  
  private static long aF;
  
  private static int aG;
  
  private static int aH;
  
  public int[] H = new int[3];
  
  public Object[] I = new Object[] { this.H };
  
  public int J = -1;
  
  public int K;
  
  public int L;
  
  public int M;
  
  public int N;
  
  public int O;
  
  private static int aI;
  
  private static int aJ;
  
  private static int[] aK;
  
  public static int P;
  
  private static int aL;
  
  public int Q = -1;
  
  public int R = -1;
  
  public int S = -1;
  
  public int T = -1;
  
  public static int U;
  
  public static int V;
  
  private static Image aM;
  
  public Graphics W;
  
  public cf X = new cf();
  
  public String Y;
  
  private int aN = -1;
  
  private int aO = -1;
  
  public static int Z;
  
  public static int aa;
  
  public static int ab;
  
  public static int ac;
  
  public int ad;
  
  private static Font aP;
  
  private static Font aQ;
  
  private Command aR;
  
  private Command aS;
  
  private Vector aT = new Vector();
  
  private Vector aU = new Vector();
  
  private boolean aV = true;
  
  private boolean aW = true;
  
  public static void a_() {
    if (m != null)
      m.a(); 
  }
  
  public static void a(int paramInt1, int paramInt2) {
    m.a(paramInt1, paramInt2);
  }
  
  public static int a(int paramInt) {
    if (!a)
      return 0; 
    if (m.g == 0)
      return 0; 
    if (m.g == paramInt) {
      long l;
      if (b) {
        l = m.b;
        m.b -= j;
      } else {
        l = m.b - System.currentTimeMillis();
      } 
      if (l < 0L) {
        m.g = 0;
        return 0;
      } 
      int i;
      if ((i = (int)l) < 0)
        i = 0; 
      return i;
    } 
    return 0;
  }
  
  public static void b() {
    at = Jimm.k ? (em.f(227) + 2) : 2;
    au = Jimm.i ? (em.f(228) + 2) : 2;
  }
  
  public static void a(Display paramDisplay) {
    m.f = paramDisplay;
  }
  
  public final void a(boolean paramBoolean) {
    if (this.am == paramBoolean)
      return; 
    this.am = paramBoolean;
    if (i())
      m.a(); 
  }
  
  public static void b(boolean paramBoolean) {
    if (m.a != null)
      m.a(paramBoolean); 
  }
  
  public bd(String paramString) {
    a_(paramString);
    z();
    this.y = 2;
  }
  
  public abstract int c();
  
  public abstract void a(int paramInt1, ev paramev, int paramInt2);
  
  public final Font b(int paramInt) {
    switch (paramInt) {
      case 1:
        return this.ag;
      case 0:
        return this.af;
      case 2:
        return this.ah;
      case -1:
        return (this.ai == null) ? (this.ai = Font.getFont(0, 0, 8)) : this.ai;
    } 
    return Font.getFont(0, paramInt, this.x);
  }
  
  public final int d() {
    return t() - E() - G() - this.ay;
  }
  
  public final void c(int paramInt) {
    if (this.x == paramInt)
      return; 
    this.x = paramInt;
    z();
    l();
    k();
  }
  
  public static int d(int paramInt) {
    return m.getGameAction(paramInt);
  }
  
  public final void e() {
    if (i())
      m.a(); 
  }
  
  public final void a(I paramI) {
    if (this.an == paramI)
      return; 
    this.an = paramI;
    k();
  }
  
  public final void b(I paramI) {
    if (this.ao == paramI)
      return; 
    this.ao = paramI;
    k();
  }
  
  public final void c(I paramI) {
    if (this.ap == paramI)
      return; 
    this.ap = paramI;
    k();
  }
  
  public final void d(I paramI) {
    if (this.aq == paramI)
      return; 
    this.aq = paramI;
    k();
  }
  
  public final void e(I paramI) {
    if (this.ar == paramI)
      return; 
    this.ar = paramI;
    k();
  }
  
  public final void f(I paramI) {
    if (this.as == paramI)
      return; 
    this.as = paramI;
    k();
  }
  
  public static bd f() {
    return m.isShown() ? m.a : null;
  }
  
  private void z() {
    this.af = Font.getFont(0, 0, this.x);
    this.ag = Font.getFont(0, 1, this.x);
    this.ah = Font.getFont(0, 2, this.x);
  }
  
  public static int g() {
    return em.d[1];
  }
  
  public final int h() {
    this.ax = -1;
    int i = c();
    int j = 0;
    byte b1 = 0;
    int m = d();
    int n = this.aw;
    if (i == 0)
      return 0; 
    if (n < 0)
      n = 0; 
    if (n >= i)
      n = i - 1; 
    byte b2 = 0;
    int k;
    for (k = n; k < i - 1; k++) {
      if ((j += f(k)) > m) {
        if (this.ax == -1)
          this.ax = b1; 
        if (++b2 == this.z)
          return b1; 
        j = f(k);
      } 
      b1++;
    } 
    j = m;
    b2 = 0;
    b1 = 0;
    for (k = i - 1; k >= 0; k--) {
      if ((j -= f(k)) < 0) {
        if (this.ax == -1)
          this.ax = b1; 
        if (++b2 == this.z)
          break; 
        j = m - f(k);
      } 
      b1++;
    } 
    if (this.ax == -1)
      this.ax = b1; 
    return b1;
  }
  
  public final void e(int paramInt) {
    if (this.y == paramInt)
      return; 
    this.y = paramInt;
    k();
  }
  
  public final boolean i() {
    return (m.a == this && m.isShown());
  }
  
  public final void b(Display paramDisplay) {
    if (i() && Jimm.d.getCurrent() == m && Jimm.d.getCurrent() instanceof javax.microedition.lcdui.Canvas)
      return; 
    c(paramDisplay);
  }
  
  public final void c(Display paramDisplay) {
    m.a = this;
    m.b();
    paramDisplay.setCurrent((Displayable)m);
    fd.a();
    if (em.h(88)) {
      a(i, 1);
      return;
    } 
    a_();
  }
  
  public final void a(Display paramDisplay, Alert paramAlert) {
    m.a = this;
    m.b();
    paramDisplay.setCurrent(paramAlert, (Displayable)m);
    a_();
  }
  
  public final void j() {
    m.setCommandListener(this.aE);
    this.aO = this.aN = -1;
    this.ad = 0;
  }
  
  public int f(int paramInt) {
    int i = 0;
    int j = p();
    if (fd.a != null && em.h(15) && this == cj.a())
      j = fd.a.b(); 
    if (this.s != null)
      i = this.s.b; 
    return (j > i) ? j : i;
  }
  
  public final void k() {
    if (this.r)
      return; 
    if (i())
      m.a(); 
  }
  
  public final void a(df paramdf) {
    this.s = paramdf;
    k();
  }
  
  public final void g(int paramInt) {
    int i = c();
    if (this.u) {
      switch (paramInt) {
        case -1:
          if (this.t < 0) {
            this.t = i - 1;
            return;
          } 
          return;
        case 1:
          if (this.t >= i) {
            this.t = 0;
            return;
          } 
          return;
      } 
      if (this.t < 0)
        this.t = 0; 
      if (this.t >= i)
        this.t = i - 1; 
      return;
    } 
    if (this.t < 0)
      this.t = 0; 
    if (this.t >= i)
      this.t = i - 1; 
  }
  
  public final void l() {
    int i = c();
    int j = h();
    if (i == 0) {
      this.aw = 0;
      return;
    } 
    if (this.t >= this.aw + j - 1)
      this.aw = this.t - j + 1; 
    if (this.t < this.aw)
      this.aw = this.t; 
    if (this.z <= 1 && i - this.aw <= j)
      this.aw = (i > j) ? (i - j) : 0; 
    if (this.aw < 0)
      this.aw = 0; 
  }
  
  public final boolean h(int paramInt) {
    return (paramInt >= this.aw && paramInt <= this.aw + h());
  }
  
  public final void m() {
    this.ak = this.t;
    this.al = this.aw;
  }
  
  public final void n() {
    if (this.ak != this.t || this.al != this.aw)
      k(); 
    if (this.ak != this.t && this.p != null)
      this.p.a(this); 
  }
  
  public void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    m();
    if (paramBoolean1 && this.y == 3)
      this.aw += paramInt; 
    this.t += paramInt;
    g(paramInt);
    l();
    n();
    if (!paramBoolean2 && a)
      a(k, 3); 
  }
  
  public final void i(int paramInt) {
    int i = h();
    int j = this.ax;
    m();
    int k = c();
    if (paramInt == 1) {
      if (this.t + j >= k) {
        this.t = k - 1;
        if (this.t - this.aw > i)
          this.aw += j; 
      } else {
        if (this.t - this.aw >= (this.z - 1) * j)
          this.aw += j; 
        this.t += j;
      } 
    } else {
      if (this.t - this.aw < j)
        this.aw -= j; 
      this.t -= j;
    } 
    g(j);
    l();
    n();
  }
  
  public boolean o() {
    return a(s(4));
  }
  
  private Vector A() {
    Vector vector = null;
    if (this.aR != null)
      if (this.aT.size() == 0) {
        bi.r = true;
        if (a(this.aR))
          return null; 
      } else if (this.ad == 1) {
        this.ad = 0;
      } else {
        if (!this.aV) {
          c(this.aT);
          this.aV = true;
        } 
        this.ad = 1;
        vector = this.aT;
        if (em.h(88)) {
          a(i, 2);
        } else {
          a_();
        } 
      }  
    return vector;
  }
  
  private Vector B() {
    Vector vector = null;
    if (this.aS != null)
      if (this.aU.size() == 0) {
        bi.r = true;
        if (a(this.aS))
          return null; 
      } else if (this.ad == 2) {
        this.ad = 0;
      } else {
        if (!this.aW) {
          c(this.aU);
          this.aW = true;
        } 
        this.ad = 2;
        vector = this.aU;
        if (em.h(88)) {
          a(i, 2);
        } else {
          a_();
        } 
      }  
    return vector;
  }
  
  private void a(Vector paramVector) {
    if (paramVector == null)
      return; 
    av = 0;
    int i;
    int j = a(i = paramVector.size(), paramVector);
    int k = 0;
    k = d() + this.ay;
    int m = b(paramVector);
    if (j > k) {
      aC = k / m;
      aD = 0;
      return;
    } 
    aC = i;
    aD = 0;
  }
  
  private static int b(Vector paramVector) {
    int i = aQ.getHeight();
    for (byte b = 0; b < paramVector.size(); b++) {
      Command command;
      if (command = paramVector.elementAt(b) instanceof cc) {
        cc cc = (cc)command;
        if (i < cc.b())
          i = cc.b(); 
      } 
    } 
    return i;
  }
  
  private static void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (!paramBoolean) {
      av += paramInt1;
      if (av >= paramInt2)
        av = 0; 
      if (av < 0)
        av = paramInt2 - 1; 
      if (av >= aD + aC)
        aD = av - aC + 1; 
      if (av < aD) {
        aD = av;
        return;
      } 
    } else {
      aD += paramInt1;
      if (aD < 0)
        aD = 0; 
      if (aD >= paramInt2 - aC)
        aD = paramInt2 - aC; 
    } 
  }
  
  private boolean f(int paramInt1, int paramInt2) {
    try {
      int i = 1999999;
      if (cp.f != null) {
        this.D[0] = paramInt1;
        this.D[1] = paramInt2;
        this.D[2] = i = t(paramInt1);
        this.D[3] = 0;
        this.D[4] = this.ad;
        if (paramInt2 == 1 && this.ad == 0)
          this.D[3] = 1; 
        Object object = null;
        if (cp.f.activate(38, null, this.D) == null) {
          paramInt1 = this.D[0];
          paramInt2 = this.D[1];
        } else {
          return false;
        } 
      } 
      if (paramInt2 == 1)
        C(); 
      boolean bool = false;
      int j = av;
      Vector vector = null;
      Vector vector1 = null;
      switch (this.ad) {
        case 1:
          bool = true;
          vector = this.aT;
          break;
        case 2:
          bool = true;
          vector = this.aU;
          break;
      } 
      int k = this.ad;
      if (paramInt2 == 1 && !F && paramInt1 >= 48 && paramInt1 <= 57 && em.h(92))
        if (this.ad == 2 || this.ad == 1) {
          if (vector != null)
            for (byte b = 0; b < vector.size(); b++) {
              if (vector.elementAt(b) instanceof cc && paramInt1 == ((cc)vector.elementAt(b)).b) {
                av = b;
                l();
                k();
                this.ad = 0;
                a(vector.elementAt(av));
                return false;
              } 
            }  
        } else if (this instanceof be) {
          be be = (be)this;
          int m = paramInt1 - 48;
          if (be.af[m] != 0) {
            int n = be.af[m] - 10;
            bi.r = false;
            int i1 = be.c();
            for (m = 0; m < i1; m++) {
              if ((be.t(m)).c == n) {
                this.t = m;
                this.aE.commandAction(s(4), null);
                return false;
              } 
            } 
          } 
        }  
      if (i == 1999999)
        i = t(paramInt1); 
      switch (i) {
        case 1000001:
          if (paramInt2 == 1)
            vector1 = A(); 
          break;
        case 1000002:
          if (paramInt2 == 1)
            vector1 = B(); 
          break;
        case 1000003:
          if (paramInt2 == 1) {
            if (Jimm.j && System.currentTimeMillis() - this.ae < 50L)
              return false; 
            this.ae = System.currentTimeMillis();
            switch (this.ad) {
              case 1:
              case 2:
                this.ad = 0;
                k();
                break;
            } 
            Command command;
            if ((command = s(2)) != null) {
              if (a(command))
                return true; 
              break;
            } 
            if (em.h(72) && paramInt2 == 1)
              vector1 = A(); 
          } 
          break;
        case 6:
        case 1610547265:
          if (bool) {
            a(1, vector.size(), false);
            break;
          } 
          if (!F)
            a(1, false, (paramInt2 == 2)); 
          break;
        case 1:
        case 1610547263:
          if (bool) {
            a(-1, vector.size(), false);
            break;
          } 
          if (!F)
            a(-1, false, (paramInt2 == 2)); 
          break;
        case 2:
          if (bool) {
            Vector vector2 = (this.ad == 1) ? A() : B();
            a(vector2);
            k();
            return true;
          } 
          if (this == bi.a && paramInt1 != 52)
            i(-1); 
          break;
        case 5:
          if (bool) {
            a(vector.elementAt(av));
            break;
          } 
          if (this == bi.a && paramInt1 != 54)
            i(1); 
          break;
        case 8:
          if (paramInt2 == 1) {
            if (bool) {
              this.ad = 0;
              a(vector.elementAt(av));
              k();
              break;
            } 
            if (!F) {
              bi.r = false;
              if (!o() && this.p != null)
                this.p.b(this); 
            } 
          } 
          break;
      } 
      a(vector1);
      if ((bool && j != av) || k != this.ad) {
        k();
        return true;
      } 
      if (paramInt2 == 1 && !F) {
        int m;
        switch (paramInt1) {
          case 49:
            if (bool) {
              av = 0;
              aD = 0;
              break;
            } 
            m();
            this.t = this.aw = 0;
            n();
            break;
          case 55:
            if (bool) {
              av = vector.size() - 1;
              aD = av - aC + 1;
              break;
            } 
            m();
            m = c() - 1;
            this.t = m;
            l();
            n();
            break;
          case 51:
            a(-h(), false, (paramInt2 == 2));
            break;
          case 57:
            a(h(), false, (paramInt2 == 2));
            break;
        } 
      } 
      if ((bool && j != av) || k != this.ad)
        k(); 
      return true;
    } catch (Exception exception) {
      return true;
    } 
  }
  
  private void C() {
    if (Runtime.getRuntime().freeMemory() < 200000L && em.h(74) && System.currentTimeMillis() - this.E > 500L) {
      dw.i();
      this.E = System.currentTimeMillis();
    } 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    G = System.currentTimeMillis();
    boolean bool = false;
    switch (paramInt2) {
      case 1:
        cz.b();
        if (em.h(29))
          ew.a(); 
        if (em.f(241) != 0)
          ew.c(); 
        if (em.h(75))
          ew.b(); 
        bool = f(paramInt1, paramInt2);
        break;
      case 2:
        bool = f(paramInt1, paramInt2);
        break;
    } 
    if (this.p != null && bool)
      this.p.a(this, paramInt1, paramInt2); 
  }
  
  public final void j(int paramInt) {
    b(paramInt, 1);
  }
  
  public final void k(int paramInt) {
    b(paramInt, 2);
  }
  
  public final void l(int paramInt) {
    if (this.p != null) {
      t(paramInt);
      this.p.f(paramInt);
    } 
  }
  
  public final void a(CommandListener paramCommandListener) {
    this.aE = paramCommandListener;
    if (i())
      m.setCommandListener(this.aE); 
  }
  
  public final boolean a(Command paramCommand) {
    if (this.aE != null && paramCommand != null) {
      this.aE.commandAction(paramCommand, null);
      return true;
    } 
    return false;
  }
  
  private static int t(int paramInt) {
    String str = null;
    try {
      str = m.getKeyName(paramInt).toLowerCase();
    } catch (IllegalArgumentException illegalArgumentException) {}
    if (str != null) {
      if ("soft1".equals(str) || "soft 1".equals(str) || "soft_1".equals(str) || "softkey 1".equals(str) || "sk2(left)".equals(str) || str.startsWith("left soft"))
        return 1000001; 
      if ("soft2".equals(str) || "soft 2".equals(str) || "soft_2".equals(str) || "softkey 4".equals(str) || "sk1(right)".equals(str) || str.startsWith("right soft"))
        return 1000002; 
      if ("on/off".equals(str) || "back".equals(str) || "end".equals(str))
        return 1000003; 
      if ("calear".equals(str) || "clear".equals(str) || "backspace".equals(str))
        return 1000004; 
      if ("enter".equals(str))
        return 8; 
    } 
    switch (paramInt) {
      case -202:
      case -6:
      case 21:
      case 105:
      case 113:
      case 57345:
        return 1000001;
      case -203:
      case -7:
      case 22:
      case 106:
      case 112:
      case 57346:
        return 1000002;
      case -11:
        return 1000003;
      case -8:
        return 1000004;
    } 
    try {
      int i;
      if ((i = m.getGameAction(paramInt)) > 0)
        return i; 
    } catch (Exception exception) {}
    return paramInt;
  }
  
  public final void m(int paramInt) {
    if (aH == -1)
      return; 
    int i = t() - E() - this.ay;
    int j = c();
    int k = h();
    if (j == k)
      return; 
    m();
    this.aw = aH + j * (paramInt - aG) / i;
    if (this.aw < 0)
      this.aw = 0; 
    if (this.aw > j - k)
      this.aw = j - k; 
    n();
  }
  
  public boolean n(int paramInt) {
    return false;
  }
  
  private int D() {
    return u() - 5 * o;
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if (paramInt2 < E()) {
      if (!bi.a.i())
        return; 
      if (paramInt1 < this.K) {
        cy.i();
        return;
      } 
      if (paramInt1 < this.L) {
        cy.j();
        return;
      } 
      if (paramInt1 < this.M) {
        cy.k();
        return;
      } 
      if (this.N != 0 && paramInt1 > this.N)
        bi.b(true); 
      if (this.O != 0 && paramInt1 > this.O && paramInt1 < this.N)
        bi.s(); 
      C();
      return;
    } 
    bi.r = false;
    if (paramInt1 >= D() && aI <= paramInt2 && paramInt2 < aJ) {
      aG = paramInt2;
      aH = this.aw;
      return;
    } 
    aH = -1;
    aF = System.currentTimeMillis();
    if (aM == null)
      aM = Image.createImage(u(), t()); 
    a(aM.getGraphics(), 2, paramInt1, paramInt2, aM);
    aG = paramInt2;
  }
  
  public final void d(int paramInt1, int paramInt2) {
    if (System.currentTimeMillis() - aF > 250L && paramInt1 < D())
      a(aM.getGraphics(), 3, paramInt1, paramInt2, aM); 
  }
  
  public final void a_(String paramString) {
    if (this.q != null && this.q.equals(paramString))
      return; 
    this.q = paramString;
    k();
  }
  
  public final void o(int paramInt) {
    m();
    this.t = this.aw = paramInt;
    l();
    n();
  }
  
  public final void p(int paramInt) {
    m();
    if (paramInt < 0)
      paramInt = 0; 
    this.t = paramInt;
    l();
    n();
  }
  
  private int E() {
    if (this.J != -1)
      return this.J; 
    int i = 0;
    if (fd.a != null) {
      if (this.q != null)
        i = aj.getHeight(); 
    } else if (this.q != null) {
      i = aj.getHeight() + 2;
    } 
    int j;
    if (this.an != null && (j = this.an.getHeight() + 1) > i)
      i = j; 
    i++;
    try {
      this.ay = 0;
      j = this.w;
      int k = u() - this.w * 2;
      int m = F();
      this.H[0] = k;
      this.H[1] = t();
      this.H[2] = m;
      dm dm = null;
      if (this == cj.a())
        dm = cj.b(); 
      Object object;
      if ((object = cp.a(24, this.I, dm)) != null && object instanceof Vector && ((Vector)object).size() > 0) {
        int n = j;
        byte b1 = 1;
        byte b2 = 0;
        Vector vector;
        if ((vector = (Vector)object).size() > this.A.length)
          this.A = new int[vector.size()][7]; 
        this.B = vector.size();
        int i1;
        for (i1 = 0; i1 < vector.size(); i1++) {
          int[] arrayOfInt;
          if ((arrayOfInt = vector.elementAt(i1))[0] >= k) {
            this.A[i1][0] = n;
            this.A[i1][2] = k + n;
            this.A[i1][3] = arrayOfInt[1];
            this.A[i1][4] = b1;
            this.A[i1][5] = arrayOfInt[2];
            this.A[i1][6] = arrayOfInt[3];
            b1++;
            if (j == n) {
              this.A[i1][4] = b2;
              b2++;
            } 
          } else {
            if (j + arrayOfInt[0] > k) {
              b2 = b1;
              b1++;
              j = n;
              this.A[i1 - 1][2] = k + n;
            } 
            this.A[i1][0] = j;
            this.A[i1][2] = arrayOfInt[0] + j;
            this.A[i1][3] = arrayOfInt[1];
            this.A[i1][4] = b2;
            this.A[i1][5] = arrayOfInt[2];
            this.A[i1][6] = arrayOfInt[3];
            j += arrayOfInt[0] + 1;
          } 
        } 
        this.A[vector.size() - 1][2] = k + n;
        if (b2 > this.az.length)
          this.az = new int[b2]; 
        if (b1 > this.az.length)
          this.az = new int[b1]; 
        for (i1 = 0; i1 < this.az.length; i1++)
          this.az[i1] = -1; 
        for (i1 = 0; i1 < vector.size(); i1++) {
          int i2;
          if ((i2 = this.A[i1][4]) >= 0 && i2 < this.az.length)
            this.az[i2] = i1; 
        } 
        for (i1 = 0; i1 < this.az.length; i1++) {
          int i2;
          if ((i2 = this.az[i1]) >= 0 && i2 < vector.size())
            this.A[i2][2] = k + n; 
        } 
        i1 = i;
        for (b2 = 0; b2 < b1; b2++) {
          int i2 = 0;
          int i3;
          for (i3 = 0; i3 < vector.size(); i3++) {
            if (b2 == this.A[i3][4] && this.A[i3][3] > i2)
              i2 = this.A[i3][3]; 
          } 
          i3 = i2 + i1;
          for (byte b = 0; b < vector.size(); b++) {
            if (b2 == this.A[b][4]) {
              this.A[b][1] = i1;
              this.A[b][3] = i3;
            } 
          } 
          if (i1 != i3)
            i1 = i3 + 1; 
        } 
        this.ay = i1 - i;
      } else {
        this.ay = 0;
        this.B = 0;
      } 
    } catch (Exception exception) {
      this.B = 0;
      this.ay = 0;
    } 
    return this.J = i;
  }
  
  public final int a(Graphics paramGraphics, int paramInt, Object paramObject) {
    if (this.q == null)
      return 0; 
    int i = a(1);
    if (em.h(89))
      i = 0; 
    if (paramInt != 1)
      return E(); 
    int j = em.d[4];
    this.K = 0;
    this.L = 0;
    this.M = 0;
    this.N = 0;
    this.O = 0;
    int k = u();
    int m = E();
    if (n == null || !em.h(55)) {
      int i3 = em.f(243);
      if (n == null)
        i3 = 255; 
      if (U == 3 || U == 4) {
        if (this.ay > 0 && cp.b[2] && U == 3) {
          b(paramGraphics, j, em.d[13], 0, 0, k, m - 1, i3);
        } else {
          b(paramGraphics, j, em.d[0], 0, 0, k, m - 1, i3);
        } 
      } else {
        a(paramGraphics, j, e(j, -48), 0, 0, k, m - ((U > 0) ? 0 : 1), i3);
      } 
      paramGraphics.setColor(e(j, -128));
      if (U == 0)
        paramGraphics.drawLine(0, m - 1, k, m - 1); 
    } else if (cp.b[2]) {
      a(paramGraphics, 0, 0, k, m + this.ay);
    } else {
      a(paramGraphics, 0, 0, k, m);
    } 
    int n = at;
    int i1 = -(i * m / fc.h);
    int i2 = m / 2 + i1;
    if (this.an != null) {
      this.an.drawByLeft(paramGraphics, n, i2);
      n += this.an.getWidth() + 1;
      this.K = n;
    } 
    if (em.h(48) && this.ao != null && this.ao != dv.b(dv.a)) {
      int i3;
      if ((i3 = dm.a) > 0 && bi.d != null && bi.d.a(14) != null && em.h(80)) {
        bi.b.a(14).drawByLeft(paramGraphics, n, i2);
        if (i3 > 1) {
          String str = "" + i3;
          Font font = b(-1);
          a(paramGraphics, n + bi.b.a(14).getWidth() / 2, i2, str, font);
        } 
        n += bi.b.a(14).getWidth() + 1;
        this.L = n;
      } else {
        this.ao.drawByLeft(paramGraphics, n, i2);
        n += this.ao.getWidth() + 1;
        this.L = n;
      } 
    } 
    if (em.h(49) && this.ap != null) {
      this.ap.drawByLeft(paramGraphics, n, i2);
      n += this.ap.getWidth() + 1;
      this.M = n;
    } 
    if (em.h(52) && this.aq != null) {
      this.aq.drawByLeft(paramGraphics, n, i2);
      n += this.aq.getWidth() + 1;
    } 
    if (this.an != null) {
      dw.a(paramGraphics, aj, em.g(11), this.q, n, (m - aj.getHeight()) / 2 + i1, 20, 2);
    } else {
      dw.a(paramGraphics, aj, em.g(11), this.q, k / 2, (m - aj.getHeight()) / 2 + i1, 17, 2);
    } 
    n = k - au;
    if (em.h(50) && this.ar != null) {
      this.ar.drawByRight(paramGraphics, n, i2);
      n -= this.ar.getWidth();
      this.N = n;
    } 
    if (em.h(78) && this.as != null) {
      this.as.drawByRight(paramGraphics, n, i2);
      n -= this.as.getWidth();
      this.O = n - this.as.getWidth();
    } 
    if (this.B != 0) {
      if (cp.b[2]) {
        int i3 = em.g(13);
        int i4 = em.f(243);
        if (n == null)
          i4 = 255; 
        if (cp.b[3]) {
          int i5 = em.d[0];
          if (U < 3)
            i5 = e(i3, -48); 
          a(paramGraphics, i3, i5, this.A[0][0] - 1, this.A[0][1] - 1, this.A[this.B - 1][2] + 1, this.A[this.B - 1][3], i4);
        } else {
          for (byte b = 0; b < this.B; b++) {
            if (U == 3 || U == 4) {
              int i5 = em.d[0];
              if (U == 3 && this.A[b][3] != this.A[this.B - 1][3])
                i5 = em.d[13]; 
              b(paramGraphics, i3, i5, this.A[b][0] - 1, this.A[b][1] - 1, this.A[b][2] + 1, this.A[b][3], i4);
            } else {
              a(paramGraphics, i3, e(i3, -48), this.A[b][0] - 1, this.A[b][1] - 1, this.A[b][2] + 1, this.A[b][3], i4);
            } 
          } 
        } 
      } 
      cp.a(paramGraphics, this.A, this.B, paramObject);
      Object object = null;
      m += this.ay;
      if (!cp.b[2]) {
        paramGraphics.setColor(e(j, -128));
        paramGraphics.drawLine(0, m - 1, k, m - 1);
      } 
      dw.h();
    } 
    return m;
  }
  
  private static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (n == null)
      return; 
    int i = paramInt4;
    int j = n.getWidth();
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, i);
    paramGraphics.drawRegion(n, paramInt1, n.getHeight() - 1 - i + paramInt2, j, i, 0, paramInt3 / 2, 0, 17);
    int k = em.d[4];
    paramGraphics.setColor(e(k, -48));
  }
  
  public boolean q(int paramInt) {
    return (this.t == paramInt && this.y != 3);
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    int i = em.d[0];
    int j = em.d[4];
    int k = u() - o;
    int m = t() - paramInt3;
    int n;
    boolean bool = ((n = c()) > paramInt2 && n > 0) ? true : false;
    int i1;
    if ((i1 = e(e(i, 32), -32)) == 0)
      i1 = 8421504; 
    paramGraphics.setStrokeStyle(0);
    paramGraphics.setColor(e(i1, -96));
    paramGraphics.drawLine(k, paramInt1, k, m);
    paramGraphics.setColor(e(i1, -64));
    paramGraphics.drawLine(k + 1, paramInt1, k + 1, m);
    paramGraphics.setColor(e(i1, -32));
    paramGraphics.drawLine(k + 2, paramInt1, k + 2, m);
    paramGraphics.setColor(i1);
    paramGraphics.drawLine(k + 3, paramInt1, k + 3, m);
    if (bool) {
      int i2;
      if ((i2 = (m - paramInt1) * paramInt2 / n) < 7)
        i2 = 7; 
      aI = this.aw * (m - i2 - paramInt1) / (n - paramInt2) + paramInt1;
      aJ = aI + i2;
      paramGraphics.setColor(e(i1, -192));
      paramGraphics.drawRect(k, aI, o - 1, aJ - aI - 1);
      paramGraphics.setColor(e(j, 96));
      paramGraphics.drawLine(k + 1, aI + 1, k + 1, aJ - 2);
      paramGraphics.drawLine(k + 1, aI + 1, k + o - 2, aI + 1);
      paramGraphics.setColor(j);
      paramGraphics.drawLine(k + 2, aI + 2, k + 2, aJ - 2);
    } 
  }
  
  public static void a(InputStream paramInputStream, boolean paramBoolean) {
    if (paramInputStream == null && paramBoolean) {
      n = null;
      return;
    } 
    try {
      n = Image.createImage(em.d(134));
      return;
    } catch (Exception exception) {
      try {
        n = Image.createImage(paramInputStream);
        return;
      } catch (Exception exception1) {
        n = null;
        return;
      } 
    } 
  }
  
  public static synchronized void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    if (paramInt4 <= 0)
      return; 
    if (paramInt3 <= 0)
      return; 
    if (!paramBoolean) {
      paramGraphics.setColor(paramInt5);
      paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    int i;
    if ((i = 33 * paramInt4) < 10)
      i = 10; 
    if (aK == null || aK.length < i) {
      aK = null;
      aK = new int[i];
    } 
    if (paramInt3 * paramInt4 <= aK.length)
      i = paramInt3 * paramInt4; 
    aK[0] = paramInt5;
    aK[1] = paramInt5;
    int j;
    for (j = 2; j < i; j += n) {
      int n;
      if ((n = i - j) > j)
        n = j; 
      System.arraycopy(aK, 0, aK, j, n);
    } 
    P = paramInt4;
    aL = paramInt5;
    if (paramInt3 * paramInt4 <= aK.length) {
      paramGraphics.drawRGB(aK, 0, paramInt3, paramInt1, paramInt2, paramInt3, paramInt4, true);
      return;
    } 
    int k = paramInt3;
    for (int m = paramInt1; m < paramInt1 + paramInt3; m += 32) {
      paramGraphics.drawRGB(aK, 0, 33, m, paramInt2, (k > 32) ? 32 : k, paramInt4, true);
      k -= 32;
    } 
  }
  
  public static synchronized void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    if (paramInt7 == 0)
      return; 
    int i;
    if ((i = em.f(254)) == 0 || i == 3 || i == 4) {
      b(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
      return;
    } 
    int j = (paramInt1 & 0xFF0000) >> 16;
    int k = (paramInt1 & 0xFF00) >> 8;
    int m = paramInt1 & 0xFF;
    int n = (paramInt2 & 0xFF0000) >> 16;
    int i1 = (paramInt2 & 0xFF00) >> 8;
    int i2 = paramInt2 & 0xFF;
    boolean bool = (paramInt7 != 255) ? true : false;
    for (byte b = 0; b < 5; b++) {
      int i3;
      if (i == 1) {
        i3 = (b * (n - j) / 4 + j << 16) + (b * (i1 - k) / 4 + k << 8) + b * (i2 - m) / 4 + m;
      } else if (b == 0 || b == 3) {
        i3 = paramInt1;
      } else if (b == 1 || b == 4) {
        i3 = paramInt2;
      } else {
        i3 = (2 * (n - j) / 4 + j << 16) + (2 * (i1 - k) / 4 + k << 8) + 2 * (i2 - m) / 4 + m;
      } 
      if (bool)
        i3 += paramInt7 << 24; 
      paramGraphics.setColor(i3);
      if (b == 0) {
        a(paramGraphics, paramInt3, paramInt4, 1, paramInt6 - paramInt4 - 1, i3, bool);
        a(paramGraphics, paramInt3 + 1, paramInt4, paramInt5 - paramInt3 - 2, 1, i3, bool);
      } else if (b == 4) {
        a(paramGraphics, paramInt5 - 1, paramInt4, 1, paramInt6 - paramInt4, i3, bool);
        a(paramGraphics, paramInt3, paramInt6 - 1, paramInt5 - paramInt3 - 1, 1, i3, bool);
      } else if (b == 1) {
        a(paramGraphics, paramInt3 + 1, paramInt4 + 1, 1, paramInt6 - paramInt4 - 2 - 1, i3, bool);
        a(paramGraphics, paramInt3 + 1 + 1, paramInt4 + 1, paramInt5 - paramInt3 - 2 - 2, 1, i3, bool);
      } else if (b == 3) {
        a(paramGraphics, paramInt5 - 2, paramInt4 + 1, 1, paramInt6 - paramInt4 - 2, i3, bool);
        a(paramGraphics, paramInt3 + 1, paramInt6 - 2, paramInt5 - paramInt3 - 2 - 1, 1, i3, bool);
      } else if (b == 2) {
        a(paramGraphics, paramInt3 + 2, paramInt4 + 2, paramInt5 - paramInt3 - 4, paramInt6 - paramInt4 - 4, i3, bool);
      } 
    } 
  }
  
  public static synchronized void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    int i = (paramInt1 & 0xFF0000) >> 16;
    int j = (paramInt1 & 0xFF00) >> 8;
    int k = paramInt1 & 0xFF;
    int m = (paramInt2 & 0xFF0000) >> 16;
    int n = (paramInt2 & 0xFF00) >> 8;
    int i1 = paramInt2 & 0xFF;
    if (paramInt7 == 0)
      return; 
    if (paramInt7 == 255) {
      int i8;
      if ((i8 = (paramInt6 - paramInt4) / 3) < 0)
        i8 = -i8; 
      if (i8 < 17)
        i8 = 17; 
      paramInt6++;
      paramInt5++;
      int i9 = 0;
      int i10 = 0;
      for (byte b = 0; b < i8; b++) {
        i9 = b * (paramInt6 - paramInt4) / i8 + paramInt4;
        i10 = (b + 1) * (paramInt6 - paramInt4) / i8 + paramInt4;
        if (i9 != i10) {
          int i11 = b;
          if (U == 4) {
            if (b >= i8 / 2) {
              i11 = (b - i8 / 2) * 2;
            } else {
              i11 = i8 - 1 - b * 2;
            } 
            if (i11 >= i8)
              i11 = i8 - 1; 
            if (i11 < 0)
              i11 = 0; 
          } 
          paramGraphics.setColor(i11 * (m - i) / (i8 - 1) + i, i11 * (n - j) / (i8 - 1) + j, i11 * (i1 - k) / (i8 - 1) + k);
          paramGraphics.fillRect(paramInt3, i9, paramInt5 - paramInt3, i10 - i9);
        } 
      } 
      return;
    } 
    int i2 = paramInt7 << 24;
    int i3 = paramInt5 - paramInt3;
    int i4 = paramInt6 - paramInt4;
    if (i3 <= 0 || i4 <= 0)
      return; 
    int i5 = 33 * i4;
    if (aK == null || aK.length < i5) {
      aK = null;
      aK = new int[i5];
    } 
    if (P != i4 || aL != paramInt1) {
      byte b1 = 0;
      boolean bool = false;
      int i8 = 0;
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      int i12 = i4 / 2;
      for (byte b2 = 0; b2 < i4; b2++) {
        int i13 = b2;
        if (U == 4) {
          if (b2 >= i12) {
            i13 = (b2 - i12) * 2;
          } else {
            i13 = i4 - 1 - b2 * 2;
          } 
          if (i13 >= i4)
            i13 = i4 - 1; 
          if (i13 < 0)
            i13 = 0; 
        } 
        i8 = i13 * (m - i) / (i4 - 1) + i;
        i9 = i13 * (n - j) / (i4 - 1) + j;
        i10 = i13 * (i1 - k) / (i4 - 1) + k;
        i11 = i8 << 16 | i9 << 8 | i10 | i2;
        for (byte b = 0; b < 33; b++)
          aK[b1++] = i11; 
      } 
      P = i4;
      aL = paramInt1;
    } 
    int i6 = i3;
    for (int i7 = paramInt3; i7 < paramInt5; i7 += 33) {
      paramGraphics.drawRGB(aK, 0, 33, i7, paramInt4, (i6 > 33) ? 33 : i6, i4, true);
      i6 -= 33;
    } 
  }
  
  public final int p() {
    return b(0).getHeight();
  }
  
  private boolean a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    try {
      this.X.a(paramGraphics);
      int i = em.d[0];
      int j = a(1);
      if (em.h(89))
        j = 0; 
      this.Y = em.l[em.f(242)];
      int k = -1;
      int m = -1;
      int n = -1;
      int i1 = -1;
      int i2 = d();
      int i3 = c();
      int i6 = u() - o;
      int i7 = paramInt1 + i2;
      byte b = 0;
      int i8 = i6 / this.z;
      int i9 = j * i6 / fc.h;
      if (paramInt3 == 1) {
        int i10 = i6 + o;
        if (n == null && em.h(82)) {
          if (this.aA == null || i10 * 4 > this.aA.length)
            this.aA = new int[i10 * 4]; 
          if (this.aB != i10 || this.C != i) {
            byte b1;
            this.C = i;
            if ((i & 0x808080) == 8421504) {
              b1 = -40;
            } else {
              b1 = 40;
            } 
            this.aB = i10;
            for (byte b2 = 0; b2 < this.aB; b2++) {
              byte b3 = (b2 < this.aB / 2) ? b1 : (b1 * (this.aB - b2) / this.aB / 2 + 1);
              int i18 = e(i, b3 / 2);
              int i19 = e(i, b3);
              int i20 = e(i, b3 / 8);
              int i21 = b2;
              this.aA[i21] = i;
              this.aA[i21 += this.aB] = i18;
              this.aA[i21 += this.aB] = i19;
              this.aA[i21 + this.aB] = i20;
            } 
          } 
          int i16 = i2 + this.ay;
          for (int i17 = paramInt1 - this.ay; i16 > 0; i17 += 4) {
            paramGraphics.drawRGB(this.aA, 0, this.aB, 0, i17, this.aB, (i16 > 4) ? 4 : i16, false);
            i16 -= 4;
          } 
        } else {
          paramGraphics.setColor(i);
          paramGraphics.fillRect(0, paramInt1 - this.ay, i6 + o, i2 + this.ay);
          if (ef.g != 0 && ef.g < 100) {
            paramGraphics.setColor(i ^ 0x8F8F8F);
            paramGraphics.fillRect(0, paramInt1 + i2 - 3, (i6 + o) * ef.g / 100, 4);
            paramGraphics.setColor(i);
          } 
        } 
        int i11 = v();
        if (n != null)
          paramGraphics.drawImage(n, i11 / 2, w() / 2, 3); 
        int i12 = F();
        int i13 = paramInt1 - this.ay;
        int i14 = 0 + i6 + o;
        int i15 = i13 + i2 + this.ay;
        cp.a(30, new Object[] { { 0, i13, i14, i15, i12, E(), this.ay },  }, paramGraphics);
        Object object = null;
      } 
      v.a();
      int i5 = paramInt1;
      int i4;
      for (i4 = this.aw; i4 < i3; i4++) {
        int i10 = f(i4);
        int i15 = i9;
        if (i2 > 0 && (i15 = i9 - (i5 - paramInt1) * 40 / i2) < 0)
          i15 = 0; 
        int i11;
        int i12 = (i11 = this.w + i8 * b + i15) + i8 - 2;
        int i13 = i5;
        int i14 = i5 + i10;
        if (this.z > 1 && i14 > i7) {
          i5 = paramInt1;
          i12 = (i11 = this.w + i8 * ++b) + i8 - 2;
          i13 = i5;
          i14 = i5 + i10;
          if (b == this.z)
            break; 
        } 
        if (paramInt3 == 1 && q(i4)) {
          if (k == -1 || k > i13)
            k = i13; 
          if (m == -1 || m < i14)
            m = i14; 
          n = i11;
          i1 = i12;
        } 
        if ((i5 += i10) >= i7 && this.z == 1)
          break; 
      } 
      if (a(3) > 0)
        if (k == -1 && m == -1 && n == -1 && i1 == -1) {
          m.a(0L);
        } else if (this.Q == -1 && this.R == -1 && this.S == -1 && this.T == -1) {
          m.a(0L);
        } else {
          n = (n + this.S) / 2;
          i1 = (i1 + this.T) / 2;
          k = (k + this.Q) / 2;
          m = (m + this.R) / 2;
          if (n > i1) {
            int i10 = i1;
            i1 = n;
            n = i10;
          } 
          if (k > m) {
            int i10 = m;
            m = k;
            k = i10;
          } 
          if (i1 - n > 1 && m - k > 1)
            m.a(0L); 
        }  
      b(paramGraphics, n, k, i1, m);
      this.S = n;
      this.T = i1;
      this.Q = k;
      this.R = m;
      i5 = paramInt1;
      b = 0;
      for (i4 = this.aw; i4 < i3; i4++) {
        int i10 = f(i4);
        paramGraphics.setStrokeStyle(0);
        int i15 = i9;
        if (i2 > 0 && (i15 = i9 - (i5 - paramInt1) * 40 / i2) < 0)
          i15 = 0; 
        int i11;
        int i12 = (i11 = this.w + i8 * b + i15) + i8 - 2;
        int i13 = i5;
        int i14 = i5 + i10;
        if (this.z > 1 && i14 > i7) {
          i5 = paramInt1;
          i12 = (i11 = this.w + i8 * ++b) + i8 - 2;
          i13 = i5;
          i14 = i5 + i10;
          if (b == this.z)
            break; 
        } 
        if (paramInt3 == 1) {
          if (i14 > i7 && i13 <= i7) {
            paramGraphics.setClip(i11, i13, i12 - i11 + 1, i7 - i13 + 1);
          } else {
            paramGraphics.setClip(i11, i13, i12 - i11 + 1, i14 - i13 + 1);
          } 
          a(paramGraphics, i4, i11, i13, i12, i14, paramInt2);
        } else if (i13 < paramInt5 && paramInt5 < i14 && i11 < paramInt4 && paramInt4 < i12) {
          switch (paramInt3) {
            case 2:
              if (this.t != i4) {
                this.t = i4;
                if (this.p != null)
                  this.p.a(this); 
                k();
              } 
              break;
            case 3:
              o();
              break;
          } 
          n(paramInt4 - i11);
          boolean bool = false;
          return true;
        } 
        if ((i5 += i10) >= i7 && this.z == 1)
          break; 
      } 
      return false;
    } finally {
      this.X.a();
    } 
  }
  
  private int F() {
    byte b = 0;
    if (this == bi.a)
      b = 1; 
    if (this == cj.a())
      b = 2; 
    if (this == cy.g())
      b = 3; 
    if (cp.f != null)
      b += 1000; 
    return b;
  }
  
  private void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    if ((i = em.e()) > 10) {
      if (i == 255) {
        a(paramGraphics, paramInt1, paramInt2, paramInt3 - paramInt1, paramInt4 - paramInt2, em.g(8), 16, -32, 0);
      } else {
        a(paramGraphics, e(em.g(8), -32), em.g(8), paramInt1, paramInt2, paramInt3, paramInt4, i);
      } 
    } else {
      paramGraphics.setStrokeStyle(1);
    } 
    int j;
    if ((j = em.g(23)) == 0)
      j = e(em.g(8), -48); 
    paramGraphics.setColor(j);
    if (!((this.aw >= 1) ? q(this.aw - 1) : 0))
      paramGraphics.drawLine(paramInt1 + 1, paramInt2, paramInt3 - 1, paramInt2); 
    paramGraphics.drawLine(paramInt1, paramInt2 + 1, paramInt1, paramInt4 - 1);
    paramGraphics.drawLine(paramInt3, paramInt2 + 1, paramInt3, paramInt4 - 1);
    paramGraphics.drawLine(paramInt1 + 1, paramInt4, paramInt3 - 1, paramInt4);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    int i = 0;
    int j = 0;
    for (byte b = 0; b < paramInt6; b++) {
      paramGraphics.setColor(e(paramInt5, (paramInt8 - paramInt7) * b / (paramInt6 - 1) + paramInt7));
      i = paramInt2 + b * paramInt4 / paramInt6;
      j = paramInt2 + (b * paramInt4 + paramInt4) / paramInt6;
      paramGraphics.fillRect(paramInt1, i, paramInt3, j - i);
    } 
  }
  
  public static int e(int paramInt1, int paramInt2) {
    int i = (paramInt1 & 0xFF) + paramInt2;
    int j = ((paramInt1 & 0xFF00) >> 8) + paramInt2;
    int k = ((paramInt1 & 0xFF0000) >> 16) + paramInt2;
    if (i < 0)
      i = 0; 
    if (i > 255)
      i = 255; 
    if (j < 0)
      j = 0; 
    if (j > 255)
      j = 255; 
    if (k < 0)
      k = 0; 
    if (k > 255)
      k = 255; 
    return i | j << 8 | k << 16;
  }
  
  public static int r(int paramInt) {
    int i = paramInt & 0xFF;
    int j = (paramInt & 0xFF00) >> 8;
    int k = (paramInt & 0xFF0000) >> 16;
    return (i + j + k > 381) ? 0 : 16777215;
  }
  
  public final boolean a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, Object paramObject) {
    int n;
    boolean bool;
    U = em.f(254);
    int i = h();
    int j = G();
    this.J = -1;
    int k = 0;
    k = E() + this.ay;
    int m = a(1);
    switch (paramInt1) {
      case 1:
        n = a(2);
        if (!((this.W != paramGraphics) ? 1 : 0)) {
          a(paramGraphics, paramInt1, paramInt2, paramInt3, k, i, j, paramObject);
        } else {
          if ((m == 0 && n == 0) || fc.e || m.d)
            a(paramGraphics, paramInt1, paramInt2, paramInt3, k, i, j, paramObject); 
          int i1 = 0;
          if (m > 0) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i2 = aM.getHeight();
            int i3 = aM.getWidth();
            switch (V) {
              default:
                i1 = m * aM.getWidth() / fc.h;
                this.W.drawImage(aM, i1, 0, 20);
                d(this.W, j, paramInt1, paramInt2, paramInt3);
                return false;
              case 1:
                i4 = k;
                i5 = j;
                i6 = i2 - i4 - i5;
                i7 = i3 / 2;
                i8 = m * i3 / fc.h / 2;
                i9 = m * i4 / fc.h;
                i10 = m * i5 / fc.h;
                this.W.drawRegion(aM, 0, i9, i3, i4 - i9, 0, 0, 0, 20);
                this.W.drawRegion(aM, 0, i4 + i6, i3, i5 - i10, 0, 0, i2 - i5 + i10, 20);
                this.W.drawRegion(aM, i8, i4, i7 - i8, i6, 0, 0, i4, 20);
                this.W.drawRegion(aM, i7, i4, i7 - i8, i6, 0, i7 + i8, i4, 20);
                d(this.W, j, paramInt1, paramInt2, paramInt3);
                return false;
              case 2:
                i4 = m * i3 / fc.h;
                i5 = i3 - i4;
                for (i6 = 0; i6 < i2; i6++) {
                  if ((i6 & 0x1) == 0) {
                    this.W.drawRegion(aM, i4, i6, i5, 1, 0, 0, i6, 20);
                  } else {
                    this.W.drawRegion(aM, 0, i6, i5, 1, 0, i4, i6, 20);
                  } 
                } 
                d(this.W, j, paramInt1, paramInt2, paramInt3);
                return false;
              case 3:
                break;
            } 
            int i4 = m * i3 / fc.h;
            for (int i5 = 0; i5 < i2; i5++) {
              if ((i6 = i4 - i5 / 6) < 0)
                i6 = 0; 
              i7 = i3 - i6;
              if ((i5 & 0x1) == 0) {
                this.W.drawRegion(aM, i6, i5, i7, 1, 0, 0, i5, 20);
              } else {
                this.W.drawRegion(aM, 0, i5, i7, 1, 0, i6, i5, 20);
              } 
            } 
          } else {
            this.W.drawImage(aM, 0, 0, 20);
          } 
          d(this.W, j, paramInt1, paramInt2, paramInt3);
          return false;
        } 
        d(paramGraphics, j, paramInt1, paramInt2, paramInt3);
        break;
      case 2:
      case 3:
        bool = false;
        if (j != 0 && c(paramGraphics, j, paramInt1, paramInt2, paramInt3))
          return true; 
        if (d(paramGraphics, j, paramInt1, paramInt2, paramInt3))
          return true; 
        if (a(paramGraphics, k, p(), paramInt1, paramInt2, paramInt3))
          return true; 
        break;
    } 
    return true;
  }
  
  private void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Object paramObject) {
    a(paramGraphics, paramInt4, p(), paramInt1, paramInt2, paramInt3);
    a(paramGraphics, paramInt4, paramInt5, paramInt6);
    if (paramInt6 != 0)
      c(paramGraphics, paramInt6, paramInt1, paramInt2, paramInt3); 
    a(paramGraphics, paramInt1, paramObject);
  }
  
  public final synchronized void a(Graphics paramGraphics, Object paramObject) {
    this.W = paramGraphics;
    if (this.r)
      return; 
    dw.h();
    if (m.isDoubleBuffered() && !em.h(89)) {
      a(paramGraphics, 1, -1, -1, paramObject);
    } else {
      try {
        if (aM == null)
          aM = Image.createImage(u(), t()); 
        if (a(aM.getGraphics(), 1, -1, -1, paramObject))
          paramGraphics.drawImage(aM, 0, 0, 20); 
      } catch (Exception exception) {
        a(paramGraphics, 1, -1, -1, paramObject);
      } 
    } 
    m.d = false;
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    v.a();
    a(paramInt1, v, paramInt5 - paramInt3);
    int i = v.m + paramInt2 + 1;
    int j = (paramInt3 + paramInt5) / 2;
    int k;
    char c;
    for (k = 0; k < this.Y.length() && (c = this.Y.charAt(k)) != '-'; k++) {
      int m = i;
      i = a(a(c), paramGraphics, i, j, 1, 1);
      if (c == 'c' && v.o)
        dw.a(paramGraphics, b(-1), 16711680, "N", m, paramInt5, 36, 4); 
      a(c, paramGraphics, (i + m) / 2, j);
    } 
    if (v.a != null)
      dw.a(paramGraphics, b(v.k), v.l, v.a, i, (paramInt3 + paramInt5 - paramInt6) / 2, 20, 4); 
    for (k = this.Y.length() - 1; k >= 0; k--) {
      if ((c = this.Y.charAt(k)) == '-')
        return; 
      int m = paramInt4;
      paramInt4 = a(a(c), paramGraphics, paramInt4, j, -1, 1);
      if (c == 'c' && v.o)
        dw.a(paramGraphics, b(-1), 16711680, "N", paramInt4, paramInt5, 36, 4); 
      a(c, paramGraphics, (paramInt4 + m) / 2, j);
    } 
  }
  
  private void a(char paramChar, Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (paramChar == 'i' && v.n > 1) {
      Font font = b(-1);
      a(paramGraphics, paramInt1, paramInt2, "" + v.n, font);
    } 
  }
  
  private static void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, Font paramFont) {
    for (byte b = -1; b <= 1; b++) {
      for (byte b1 = -1; b1 <= 1; b1++) {
        if (b != 0 || b1 != 0)
          a(paramGraphics, paramInt1 + b, paramInt2 + b1, 16777215, paramString, paramFont); 
      } 
    } 
    a(paramGraphics, paramInt1, paramInt2, 0, paramString, paramFont);
  }
  
  private static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, String paramString, Font paramFont) {
    dw.a(paramGraphics, paramFont, paramInt3, paramString, paramInt1, paramInt2 - paramFont.getHeight() / 2, 17, 11);
  }
  
  private static I a(char paramChar) {
    switch (paramChar) {
      case 'i':
        return v.b;
      case 'x':
        return v.c;
      case 'h':
        return v.d;
      case 'b':
        return v.e;
      case 'c':
        return v.i;
      case 'v':
        return v.h;
      case 'n':
        return v.g;
      case 'a':
        return v.f;
      case 't':
        return v.j;
    } 
    return null;
  }
  
  private static int a(I paramI, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramI == null)
      return paramInt1; 
    if (paramInt3 == 1) {
      paramI.drawByLeft(paramGraphics, paramInt1, paramInt2);
      paramInt1 += paramI.getWidth() + paramInt4;
    } else {
      paramI.drawByRight(paramGraphics, paramInt1, paramInt2);
      paramInt1 -= paramI.getWidth() + paramInt4;
    } 
    return paramInt1;
  }
  
  public final void q() {
    this.r = true;
  }
  
  public void r() {}
  
  public final void s() {
    this.r = false;
    r();
    k();
  }
  
  public final int t() {
    return (this.aO == -1) ? m.getHeight() : this.aO;
  }
  
  public final int u() {
    return (this.aN == -1) ? m.getWidth() : this.aN;
  }
  
  public static int v() {
    return m.getWidth();
  }
  
  public static int w() {
    return m.getHeight();
  }
  
  public static void x() {
    if (em.h(26)) {
      Z = 2;
      aa = 1;
      ab = 4;
      ac = 3;
      return;
    } 
    Z = 1;
    aa = 2;
    ab = 3;
    ac = 4;
  }
  
  private boolean c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = a(1);
    if (em.h(89))
      i = 0; 
    int j = t() - paramInt1;
    int k = t();
    int m = u();
    int n = paramInt1 / 4;
    int i1 = i * m / 100 / 2;
    int i2 = i * aP.getHeight() / 100;
    if (paramInt2 == 3 || (this.am && em.h(42)))
      return false; 
    boolean bool = false;
    int i3 = em.f(243);
    if (paramInt2 == 1)
      try {
        if (!em.h(55))
          throw new Exception(); 
        int i5 = n.getWidth();
        int i6 = k - j;
        paramGraphics.fillRect(0, j, m, paramInt1);
        paramGraphics.drawRegion(n, 0, 0, i5, i6, 0, m / 2, j, 17);
        bool = true;
        if (i3 != 0)
          throw new Exception(); 
      } catch (Exception exception) {
        int i5 = em.d[4];
        if (n == null)
          i3 = 255; 
        switch (U) {
          case 4:
            b(paramGraphics, i5, em.d[0], 0, j, m, k, i3);
            break;
          case 3:
            b(paramGraphics, em.d[0], i5, 0, j, m, k, i3);
            break;
          case 0:
            a(paramGraphics, e(i5, -48), i5, 0, j, m, k, i3);
            break;
          default:
            a(paramGraphics, i5, e(i5, -48), 0, j, m, k, i3);
            break;
        } 
      }  
    int i4 = (j + k - aP.getHeight()) / 2 + 1;
    if (this.aR != null) {
      if (paramInt2 == 2 && a(paramInt3, paramInt4, 0, j, u() / 2, k)) {
        Vector vector = A();
        a(vector);
        k();
        return true;
      } 
      dw.a(paramGraphics, aP, em.g(11), this.aR.getLabel(), n - i1, i4, 20, 5);
    } 
    if (this.aS != null) {
      if (paramInt2 == 2 && a(paramInt3, paramInt4, u() / 2, j, u(), k)) {
        Vector vector = B();
        a(vector);
        k();
        return true;
      } 
      dw.a(paramGraphics, aP, em.g(11), this.aS.getLabel(), m - n + i1, i4, 24, 5);
    } 
    if (em.h(9)) {
      dw.a(paramGraphics, aP, em.g(12), dh.b(true, false), m / 2, i4 + i2, 17, 6);
    } else if (!bool) {
      int i5 = m / 2 - 2;
      int i6 = (j + k) / 2;
      paramGraphics.drawLine(i5 - 3, i6 - 1, i5, i6 + 2);
      paramGraphics.drawLine(i5 - 3, i6, i5, i6 + 3);
      paramGraphics.drawLine(i5 - 3, i6 + 1, i5, i6 + 4);
      paramGraphics.drawLine(i5 - 3, i6 + 2, i5, i6 + 5);
      paramGraphics.drawLine(i5, i6 + 2, i5 + 6, i6 - 4);
      paramGraphics.drawLine(i5, i6 + 3, i5 + 6, i6 - 3);
      paramGraphics.drawLine(i5, i6 + 4, i5 + 6, i6 - 2);
      paramGraphics.drawLine(i5, i6 + 5, i5 + 6, i6 - 1);
    } 
    if (U == 0) {
      int i5 = em.d[4];
      paramGraphics.setColor(e(i5, -128));
      if (!bool && i3 < 100)
        paramGraphics.drawLine(0, j, m, j); 
    } 
    return false;
  }
  
  public final Command s(int paramInt) {
    if (this.aR != null && this.aR.getCommandType() == paramInt)
      return this.aR; 
    if (this.aS != null && this.aS.getCommandType() == paramInt)
      return this.aS; 
    int i;
    for (i = this.aT.size() - 1; i >= 0; i--) {
      Command command;
      if ((command = this.aT.elementAt(i)).getCommandType() == paramInt)
        return command; 
    } 
    for (i = this.aU.size() - 1; i >= 0; i--) {
      Command command;
      if ((command = this.aU.elementAt(i)).getCommandType() == paramInt)
        return command; 
    } 
    return null;
  }
  
  private int G() {
    return (this.am && em.h(42)) ? 0 : (aP.getHeight() + 2);
  }
  
  public final void a(Command paramCommand, int paramInt) {
    switch (paramInt) {
      case 1:
        this.aR = paramCommand;
        k();
        return;
      case 2:
        this.aS = paramCommand;
        k();
        return;
      case 3:
        if (this.aT.indexOf(paramCommand) == -1) {
          this.aT.addElement(paramCommand);
          this.aV = false;
          return;
        } 
        break;
      case 4:
        if (this.aU.indexOf(paramCommand) == -1) {
          this.aU.addElement(paramCommand);
          this.aW = false;
        } 
        break;
    } 
  }
  
  public final void b(Command paramCommand) {
    if (paramCommand == this.aR) {
      this.aR = null;
      this.aT.removeAllElements();
      k();
      return;
    } 
    if (paramCommand == this.aS) {
      this.aS = null;
      this.aU.removeAllElements();
      k();
      return;
    } 
    this.aT.removeElement(paramCommand);
    this.aU.removeElement(paramCommand);
  }
  
  public final void y() {
    this.aR = null;
    this.aS = null;
    this.aT.removeAllElements();
    this.aU.removeAllElements();
  }
  
  private boolean d(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    switch (this.ad) {
      case 1:
        return em.h(76) ? a(paramGraphics, this.aT, t() - paramInt1, 1, paramInt2, paramInt3, paramInt4) : a(paramGraphics, this.aT, t() - paramInt1, 4, paramInt2, paramInt3, paramInt4);
      case 2:
        return em.h(76) ? a(paramGraphics, this.aU, t() - paramInt1, 1, paramInt2, paramInt3, paramInt4) : a(paramGraphics, this.aU, t() - paramInt1, 8, paramInt2, paramInt3, paramInt4);
    } 
    return false;
  }
  
  private static int a(int paramInt, Vector paramVector) {
    return b(paramVector) * paramInt + 4;
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    return (paramInt3 <= paramInt1 && paramInt1 < paramInt5 && paramInt4 <= paramInt2 && paramInt2 < paramInt6);
  }
  
  private boolean a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9) {
    int i;
    int j;
    byte b;
    switch (paramInt5) {
      case 1:
        paramGraphics.setColor(em.d[1]);
        i = 0;
        j = (paramInt2 + paramInt4 - 2) / 2;
        for (b = -1; b <= 1; b++) {
          i = (paramInt1 + paramInt3) / 2 - b * 5;
          paramGraphics.fillRect(i, j, 2, 2);
        } 
        break;
      case 2:
      case 3:
        if (a(paramInt6, paramInt7, paramInt1, paramInt2, paramInt3, paramInt4)) {
          a(paramInt8, paramInt9, true);
          k();
          return true;
        } 
        break;
    } 
    return false;
  }
  
  private boolean a(Graphics paramGraphics, Vector paramVector, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i;
    int j = (i = b(paramVector)) / 4;
    int k = paramVector.size();
    int m = em.d[0];
    int n = em.d[1];
    int i1 = a(2);
    int i2 = 0;
    int i3 = a(aC, paramVector);
    int i4 = 0;
    int i5;
    for (i5 = 0; i5 < k; i5++) {
      Command command = paramVector.elementAt(i5);
      int i11;
      if ((i11 = aQ.stringWidth(command.getLabel())) > i2)
        i2 = i11; 
      if (command instanceof cc) {
        cc cc = (cc)command;
        if (i4 < cc.a())
          i4 = cc.a(); 
        if (i < cc.b())
          i = cc.b(); 
      } 
    } 
    if ((i2 = i2 + j * 2 + i4) > v() - 4)
      i2 = v() - 4; 
    i5 = paramInt1 - i3 - 1 + i1 * i3 / fc.h;
    int i6 = 0;
    if (i1 > 0)
      i6 = -i1 * i2 / 2 / fc.h; 
    switch (paramInt2) {
      case 1:
        i6 = (u() - i2 - 1) / 2;
        break;
      case 8:
        if (i1 > 0) {
          i6 = u() - i2 - 1 + i1 * i2 / 2 / fc.h;
          break;
        } 
        i6 = u() - i2 - 1;
        break;
    } 
    if (paramInt3 == 1) {
      int i11 = em.f(250);
      if (i1 != 0)
        if (i11 > 127) {
          i11 = 255;
        } else {
          i11 = 0;
        }  
      a(paramGraphics, e(m, -32), m, i6 + 1, i5 + 1, i6 + i2, i5 + i3, i11);
      a(paramGraphics, i6 + i2 + 1, i5 + 2, 2, i3, -2144128205, true);
      a(paramGraphics, i6 + 2, i5 + i3, i2 - 1, 2, -2144128205, true);
    } 
    if (aD != 0 && a(paramGraphics, i6, i5, i6 + i2, i5 + 3, paramInt3, paramInt4, paramInt5, -1, k))
      return true; 
    if (aD + aC != k && a(paramGraphics, i6, i5 + i3 - 3, i6 + i2, i5 + i3, paramInt3, paramInt4, paramInt5, 1, k))
      return true; 
    int i7 = i5 + 3;
    int i8 = aD;
    int i9;
    for (i9 = 0; i9 < aC; i9++) {
      if (i8 == av && paramInt3 == 1) {
        a(paramGraphics, i6 + 2, i7 - 1, i2 - 3, i + 1, em.g(8), 16, -32, 0);
        paramGraphics.setColor(e(em.g(8), -48));
        paramGraphics.drawRect(i6 + 1, i7 - 1, i2 - 2, i);
      } 
      i7 += i;
      i8++;
    } 
    i7 = i5 + 3;
    boolean bool = em.h(92);
    i9 = i / 2 - aQ.getHeight() / 2;
    int i10 = aD;
    for (byte b = 0; b < aC; b++) {
      char c;
      Command command = paramVector.elementAt(i10);
      switch (paramInt3) {
        case 1:
          c = Character.MIN_VALUE;
          if (command instanceof cc) {
            I i11;
            if ((i11 = ((cc)command).a) != null)
              i11.drawByLeft(paramGraphics, i6 + j, i7 + i / 2); 
            c = (char)((cc)command).b;
          } 
          dw.a(paramGraphics, aQ, (i10 == av) ? r(em.g(8)) : n, command.getLabel(), i6 + j + i4, i7 + i9, 20, 7);
          if (c != '\000' && bool)
            dw.a(paramGraphics, aQ, (i10 == av) ? r(em.g(8)) : em.g(8), "" + c, i6 + i2 - 2, i7 + i9, 24, 7); 
          break;
        case 2:
          if (a(paramInt4, paramInt5, i6, i7, i6 + i2, i7 + i)) {
            this.ad = 0;
            k();
            a(command);
            return true;
          } 
          break;
      } 
      i7 += i;
      i10++;
    } 
    if (paramInt3 == 1) {
      paramGraphics.setColor(n);
      paramGraphics.drawRect(i6, i5, i2, i3);
    } 
    return false;
  }
  
  private static void c(Vector paramVector) {
    boolean bool;
    int i = paramVector.size() - 1;
    do {
      bool = false;
      for (byte b = 0; b < i; b++) {
        Command command1 = paramVector.elementAt(b + 1);
        Command command2 = paramVector.elementAt(b);
        if (command1.getPriority() < command2.getPriority()) {
          paramVector.setElementAt(command1, b);
          paramVector.setElementAt(command2, b + 1);
          bool = true;
        } 
      } 
    } while (bool);
  }
  
  static {
    o = 4;
    v = new ev();
    b();
    x();
    F = false;
    aF = 0L;
    aG = -1;
    aH = -1;
    aI = -1;
    aJ = -1;
    aK = null;
    U = 0;
    V = 1;
    aM = null;
    aP = Font.getFont(64, 1, 8);
    aQ = Font.getFont(64, 0, 8);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */