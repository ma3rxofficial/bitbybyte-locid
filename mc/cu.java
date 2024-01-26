package mc;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cu {
  public v a;
  
  public boolean b = true;
  
  public Image c = null;
  
  public Graphics d = null;
  
  private Vector n = new Vector();
  
  public am e;
  
  private int o = 0;
  
  private int p = 0;
  
  private boolean q = false;
  
  private int r = 0;
  
  private int s = 0;
  
  public int f = 0;
  
  public int g = 0;
  
  public int h = 0;
  
  public int i = 0;
  
  public int j = 0;
  
  public int k = 0;
  
  public int l = 5;
  
  public int m = 5;
  
  public final mc/bm a(int paramInt) {
    return (this.n.size() < paramInt) ? null : this.n.elementAt(paramInt);
  }
  
  public final void a() {
    for (byte b = 0; b < j(); b++) {
      if ((a(b)).c != null)
        (a(b)).c.a(); 
      mc/bm.a(a(b), null);
      this.n.setElementAt(null, b);
    } 
    this.n.removeAllElements();
    this.c = null;
    this.d = null;
    System.gc();
  }
  
  public final mc/bm a(int paramInt, String paramString) {
    if (paramString == null)
      return null; 
    mc/bm mc/bm = new mc/bm(this, paramInt, paramString);
    this.n.addElement(mc/bm);
    return mc/bm;
  }
  
  private String c(int paramInt) {
    return (this.n.size() < paramInt) ? null : ((mc/bm)this.n.elementAt(paramInt)).b;
  }
  
  private int j() {
    return this.n.size();
  }
  
  private String d(int paramInt) {
    return a(paramInt, 0);
  }
  
  private String a(int paramInt1, int paramInt2) {
    return this.b ? ((this.n.size() < paramInt1) ? null : ((paramInt2 == 0) ? ((paramInt1 + 1) + (((mc/bm)this.n.elementAt(paramInt1)).d ? "*" : " ") + c(paramInt1)) : ((paramInt1 + 1) + (((mc/bm)this.n.elementAt(paramInt1)).d ? "*" : " ") + c(paramInt1).substring(paramInt2)))) : ((paramInt2 == 0) ? c(paramInt1) : c(paramInt1).substring(paramInt2));
  }
  
  public cu(v paramv, Image paramImage, am paramam) {
    this.a = paramv;
    this.j = paramImage.getWidth();
    this.k = paramImage.getHeight();
    this.e = paramam;
  }
  
  public final void b() {
    int i = this.j - this.l * 2;
    if (this.s == 0)
      this.s = (this.k - this.m * 2) / this.e.a; 
    int j = this.s * this.e.a;
    this.k = j + this.m * 2;
    if (this.c == null) {
      this.c = Image.createImage(this.j, this.k);
      this.d = this.c.getGraphics();
    } 
    this.f = this.r;
    this.g = 0;
    this.h = 0;
    this.i = 0;
    boolean bool = false;
    if (this.r == 0)
      for (byte b = 0; b < this.n.size(); b++) {
        int m;
        if ((m = this.e.e(d(b))) > this.f)
          this.f = m; 
        if ((a(b)).c != null)
          bool = true; 
      }  
    if (this.r == 0)
      if (bool) {
        if (this.f > i - 5) {
          this.f = i - 5;
        } else {
          this.f += 5;
        } 
      } else if (!bool && this.f > i) {
        this.f = i;
      }  
    this.d.setColor(x.ah);
    this.d.fillRect(0, 0, this.j, this.k);
    this.h = this.f + this.l * 2;
    for (int k = this.o; k < this.n.size() && k - this.o != this.s; k++) {
      if (this.p == k) {
        this.d.setColor(x.al);
        this.d.fillRect(this.l, this.m + (k - this.o) * this.e.a, this.f, this.e.a);
      } 
      this.e.a(this.d, d(k), this.l, this.m + (k - this.o) * this.e.a, this.f, x.aj);
      if (this.b)
        this.e.a(this.d, String.valueOf(k + 1), this.l, this.m + (k - this.o) * this.e.a, this.f, x.ak); 
      if ((a(k)).c != null) {
        this.d.setColor(x.ai);
        this.d.fillRect(this.l + this.f + 1 - 4, this.m + (k - this.o) * this.e.a + this.e.a / 2 - 2, 1, 5);
        this.d.fillRect(this.l + this.f + 1 - 3, this.m + (k - this.o) * this.e.a + this.e.a / 2 - 1, 1, 3);
        this.d.fillRect(this.l + this.f + 1 - 2, this.m + (k - this.o) * this.e.a + this.e.a / 2, 1, 1);
      } 
      this.g += this.e.a;
    } 
    this.i = this.g + this.m * 2;
    this.d.setColor(x.ai);
    this.d.drawRect(1, 1, this.h - 3, this.i - 3);
    this.d.drawRect(3, 3, this.h - 7, this.i - 7);
    if (this.o > 0) {
      this.d.setColor(x.ah);
      this.d.fillRect(this.h / 2 - 4, 0, 9, 5);
      this.d.setColor(x.ai);
      this.d.fillRect(this.h / 2, 1, 1, 1);
      this.d.fillRect(this.h / 2 - 1, 2, 3, 1);
      this.d.fillRect(this.h / 2 - 2, 3, 5, 1);
    } 
    if (this.o + this.s < this.n.size()) {
      this.d.setColor(x.ah);
      this.d.fillRect(this.h / 2 - 4, this.i - 5, 9, 5);
      this.d.setColor(x.ai);
      this.d.fillRect(this.h / 2, this.i - 2, 1, 1);
      this.d.fillRect(this.h / 2 - 1, this.i - 3, 3, 1);
      this.d.fillRect(this.h / 2 - 2, this.i - 4, 5, 1);
    } 
    if (this.c.getWidth() != this.h || this.c.getHeight() != this.i) {
      Image image;
      (image = Image.createImage(this.h, this.i)).getGraphics().drawRegion(this.c, 0, 0, this.h, this.i, 0, 0, 0, 20);
      this.d = null;
      this.c = null;
      System.gc();
      this.c = image;
      this.d = this.c.getGraphics();
    } 
    if (this.q && (a(this.p)).c != null)
      (a(this.p)).c.b(); 
    b(false);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      if (paramInt1 + this.h > this.j)
        paramInt1 = this.j - this.h; 
    } else {
      paramInt1 = (this.j - this.h) / 2;
    } 
    if (paramInt2 >= 0) {
      if (paramInt2 + this.i > this.k)
        paramInt2 = this.k - this.i; 
    } else {
      paramInt2 = (this.k - this.i) / 2;
    } 
    paramGraphics.drawRegion(this.c, 0, 0, this.h, this.i, 0, paramInt1, paramInt2, 20);
    paramGraphics.setColor(0);
    paramGraphics.fillRect(paramInt1 + this.h, paramInt2 + 2, 2, this.i);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2 + this.i, this.h, 2);
    if (this.q && (a(this.p)).c != null)
      (a(this.p)).c.a(paramGraphics, paramInt1 + this.h * 4 / 5, paramInt2 + this.m + (this.p - this.o) * this.e.a); 
  }
  
  private void e(int paramInt) {
    b(paramInt, 0);
  }
  
  public final void c() {
    int i = this.o;
    int j = this.p;
    mc/bm mc/bm = this.n.elementAt(this.p);
    if (this.q && mc/bm.a(mc/bm) != null) {
      mc/bm.a(mc/bm).c();
      return;
    } 
    if (this.p == 0) {
      this.p = this.n.size() - 1;
      this.o = this.p - this.s + 1;
      if (this.o < 0)
        this.o = 0; 
      if (this.o != i) {
        b();
        return;
      } 
    } else {
      if (this.p == this.o)
        this.o--; 
      this.p--;
    } 
    if (this.o != i) {
      for (int k = this.s - 2; k >= 1; k--)
        this.d.copyArea(this.l, this.m + this.e.a * k, this.f, this.e.a, this.l, this.m + this.e.a * (k + 1), 20); 
      e(j);
      e(this.p);
    } else {
      e(this.p);
      e(j);
    } 
    b(true);
  }
  
  public final void d() {
    int i = this.o;
    int j = this.p;
    mc/bm mc/bm = this.n.elementAt(this.p);
    if (this.q && mc/bm.a(mc/bm) != null) {
      mc/bm.a(mc/bm).d();
      return;
    } 
    this.p++;
    if (this.p == this.n.size()) {
      this.p = 0;
      this.o = 0;
      if (this.o != i) {
        b();
        return;
      } 
    } else if (this.p - this.o + 1 > this.s) {
      this.o++;
    } 
    if (this.o != i) {
      this.d.copyArea(this.l, this.m + this.e.a, this.f, this.e.a * (this.s - 2), this.l, this.m, 20);
      e(j);
      e(this.p);
    } else {
      e(this.p);
      e(j);
    } 
    b(true);
  }
  
  public final void e() {
    int i = this.o;
    int j = this.p;
    mc/bm mc/bm = this.n.elementAt(this.p);
    if (this.q && mc/bm.a(mc/bm) != null) {
      mc/bm.a(mc/bm).e();
      return;
    } 
    if (this.p > 0)
      if (this.p > this.o) {
        this.p = this.o;
      } else {
        this.p -= this.s;
        if (this.p < 0)
          this.p = 0; 
        this.o = this.p;
      }  
    if (this.o != i) {
      b();
    } else {
      e(this.p);
      e(j);
    } 
    b(true);
  }
  
  public final void f() {
    int i = this.o;
    int j = this.p;
    mc/bm mc/bm = this.n.elementAt(this.p);
    if (this.q && mc/bm.a(mc/bm) != null) {
      mc/bm.a(mc/bm).f();
      return;
    } 
    if (this.p == this.o + this.s - 1) {
      this.o += this.s;
      if (this.o + this.s > this.n.size() - 1)
        this.o = this.n.size() - this.s; 
    } 
    this.p = this.o + this.s - 1;
    if (this.p > this.n.size() - 1)
      this.p = this.n.size() - 1; 
    if (this.o != i) {
      b();
    } else {
      e(this.p);
      e(j);
    } 
    b(true);
  }
  
  public final void a(boolean paramBoolean) {
    mc/bm mc/bm = a(this.p);
    if (this.q && mc/bm.a(mc/bm) != null) {
      mc/bm.a(mc/bm).a(paramBoolean);
      return;
    } 
    this.q = paramBoolean;
    if (paramBoolean == true) {
      mc/bm.a(a(this.p)).b();
      return;
    } 
    this.d = null;
    this.c = null;
    System.gc();
  }
  
  public final int g() {
    mc/bm mc/bm = a(this.p);
    return (this.q && mc/bm.a(mc/bm) != null) ? mc/bm.a(mc/bm).g() : this.n.size();
  }
  
  public final mc/bm h() {
    mc/bm mc/bm = this.n.elementAt(this.p);
    if (this.q && mc/bm.a(mc/bm) != null)
      mc/bm = mc/bm.a(mc/bm).h(); 
    return mc/bm;
  }
  
  public final int b(int paramInt) {
    mc/bm mc/bm = this.n.elementAt(this.p);
    if (this.q && mc/bm.a(mc/bm) != null)
      return mc/bm.a(mc/bm).b(paramInt); 
    if (paramInt >= this.n.size())
      return 0; 
    if (this.p < paramInt) {
      while (this.p < paramInt)
        d(); 
    } else if (this.p > paramInt) {
      while (this.p > paramInt)
        c(); 
    } 
    if (mc/bm.a(a(this.p)) != null) {
      this.q = true;
      mc/bm.a(a(this.p)).b();
      return 2;
    } 
    return 1;
  }
  
  public final int i() {
    return f(0);
  }
  
  private int f(int paramInt) {
    mc/bm mc/bm = this.n.elementAt(this.p);
    if (this.q && mc/bm.a(mc/bm) != null && (mc/bm.a(mc/bm)).q)
      return mc/bm.a(mc/bm).f(paramInt + 1); 
    if (this.q) {
      this.q = false;
      return paramInt;
    } 
    return paramInt - 1;
  }
  
  private void b(boolean paramBoolean) {
    int i = this.i - 10;
    int j = this.h - 5;
    int k = this.m;
    if (paramBoolean) {
      this.d.setColor(x.ah);
      this.d.fillRect(j, this.m, 5, i);
      this.d.setColor(x.ai);
      this.d.drawRect(j + 1, this.m, 0, i);
      this.d.drawRect(j + 3, this.m, 0, i);
    } 
    this.d.setColor(x.ai);
    if (this.n.size() > 1)
      k += (i - 8) * this.p / (this.n.size() - 1); 
    this.d.fillRect(j, k, 5, 8);
  }
  
  private boolean b(int paramInt1, int paramInt2) {
    boolean bool = false;
    int[] arrayOfInt = { 0 };
    int i = paramInt1;
    String str = a(i, paramInt2);
    if (i < this.o || i > this.o + this.s - 1)
      return false; 
    if (this.p == i) {
      this.d.setColor(x.al);
    } else {
      this.d.setColor(x.ah);
    } 
    this.d.fillRect(this.l, this.m + (i - this.o) * this.e.a, this.f, this.e.a);
    this.e.b(this.d, str, this.l, this.m + (i - this.o) * this.e.a, this.f, x.aj, arrayOfInt);
    if (this.b && paramInt2 == 0)
      this.e.b(this.d, String.valueOf(i + 1), this.l, this.m + (i - this.o) * this.e.a, this.f, x.ak, arrayOfInt); 
    if ((a(i)).c != null) {
      this.d.setColor(x.ai);
      this.d.fillRect(this.l + this.f + 1 - 4, this.m + (i - this.o) * this.e.a + this.e.a / 2 - 2, 1, 5);
      this.d.fillRect(this.l + this.f + 1 - 3, this.m + (i - this.o) * this.e.a + this.e.a / 2 - 1, 1, 3);
      this.d.fillRect(this.l + this.f + 1 - 2, this.m + (i - this.o) * this.e.a + this.e.a / 2, 1, 1);
    } 
    if (str.length() == arrayOfInt[0])
      bool = true; 
    return bool;
  }
  
  public class mc/bm {
    public int a;
    
    public String b;
    
    public cu c;
    
    public boolean d;
    
    private final cu e;
    
    public mc/bm(cu this$0, int param1Int, String param1String) {
      this.e = this$0;
      this.c = null;
      this.d = false;
      this.a = param1Int;
      this.b = param1String;
    }
    
    public final cu a(Image param1Image) {
      if (this.c == null)
        this.c = new cu(this.e.a, param1Image, this.e.e); 
      this.c.b = this.e.b;
      return this.c;
    }
    
    public static cu a(mc/bm param1mc/bm) {
      return param1mc/bm.c;
    }
    
    public static cu a(mc/bm param1mc/bm, cu param1cu) {
      return param1mc/bm.c = param1cu;
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\cu.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */