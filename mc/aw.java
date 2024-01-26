package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.lcdui.game.Sprite;

public final class aw extends dl implements CommandListener {
  public Image a = null;
  
  public Image b = null;
  
  public Image c = null;
  
  public Image d = null;
  
  public cy[] e = null;
  
  public int f = 0;
  
  public int g = 1;
  
  public static Image h = null;
  
  public static Graphics i = null;
  
  public static am j = new am();
  
  public int k = 0;
  
  public static Font l;
  
  public Vector m = new Vector();
  
  public TextField n;
  
  public ChoiceGroup o;
  
  public static int p = 320;
  
  public static int q = 240;
  
  public static av r = null;
  
  public static av s = null;
  
  public bn t = null;
  
  public Image u = null;
  
  public Image v = null;
  
  public cq w = null;
  
  public boolean[] x = new boolean[1];
  
  public boolean y = false;
  
  public int z = 0;
  
  public static boolean A = false;
  
  public static boolean B = false;
  
  public static boolean C = false;
  
  public x D = new x(this);
  
  public static int E = 0;
  
  public Thread F = null;
  
  public Thread G = null;
  
  public cv H = null;
  
  public static aw I = null;
  
  public static int J = 0;
  
  public boolean K = false;
  
  public boolean L = false;
  
  public int M = 0;
  
  public aw(bn parambn) {
    this.t = parambn;
    I = this;
    try {
      n();
      this.a = Image.createImage("/img/logo.png");
      this.c = Image.createImage("/img/progr0.png");
      this.d = Image.createImage("/img/progr1.png");
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void n() throws Exception {
    this.D.b();
    this.e = new cy[2];
    this.e[0] = new cy(this, 0);
    this.e[1] = new cy(this, 1);
    bn.a(x.i);
    if (System.getProperty("com.sonyericsson.imei") != null)
      A = true; 
    B = (System.getProperty("com.sonyericsson.jackknifeopen") != null);
    System.getProperty("com.sonyericsson.java.platform");
    if (A && !B && System.getProperty("com.sonyericsson.flipopen") == null)
      System.getProperty("com.sonyericsson.java.platform"); 
    String str;
    if ((str = System.getProperty("microedition.platform")) != null && str.toLowerCase().indexOf("nokia") != -1)
      C = true; 
    System.getProperty("device.model");
    System.getProperty("device.software.version");
    System.getProperty("microedition.hostname");
    setFullScreenMode(true);
    setCommandListener(this);
  }
  
  public final void a() {
    this.b = Image.createImage(getWidth(), getHeight());
    Graphics graphics;
    (graphics = this.b.getGraphics()).setColor(16777215);
    graphics.fillRect(0, 0, getWidth(), getHeight());
    int i = getWidth();
    int j = getHeight();
    int k = i;
    if (j > i)
      k = j; 
    int m;
    for (m = 0; m <= k; m++) {
      int n;
      if ((n = 255 - 255 * m / k) < 0) {
        n = 0;
      } else if (n > 255) {
        n = 255;
      } 
      graphics.setColor(n << 16 | n << 8 | 0xFF);
      graphics.drawLine(0, j * m / k, i - i * m / k, j - 1);
      graphics.drawLine(i * m / k, 0, i - 1, j - j * m / k);
    } 
    long l1 = System.currentTimeMillis();
    h = Image.createImage(cx.a(this), cx.b(this));
    i = h.getGraphics();
    this.k = 1;
    repaint();
    serviceRepaints();
    hasPointerEvents();
    if (x.e == 5) {
      j.a();
    } else {
      j.a("/img/font" + String.valueOf(x.e + 1) + ".png");
    } 
    this.k = 2;
    repaint();
    serviceRepaints();
    String str1 = MiniCommander.a.getAppProperty("Motorola-Image-Width");
    String str2 = MiniCommander.a.getAppProperty("Motorola-Image-Height");
    String str3;
    if ((str3 = MiniCommander.a.getAppProperty("Reverse-Soft-Keys")) != null && str3.toLowerCase().equals("true")) {
      String str = cx.a[0];
      cx.a[0] = cx.a[1];
      cx.a[1] = str;
    } 
    if (str1 != null && str2 != null)
      try {
        m = Integer.parseInt(str1);
        int n = Integer.parseInt(str2);
        if (m > 0 && n > 0) {
          p = m;
          q = n;
        } 
      } catch (NumberFormatException numberFormatException) {} 
    this.f = x.A;
    this.g = (this.f == 0) ? 1 : 0;
    (this.e[0]).m = true;
    (this.e[0]).l = j;
    (this.e[1]).l = j;
    (this.e[0]).a = 0;
    (this.e[0]).b = 0;
    if (x.N) {
      l = Font.getFont(32, 1, 0);
    } else {
      l = null;
    } 
    m = cx.b(this);
    if (x.N)
      m -= l.getHeight() + 2; 
    if (x.g == 3) {
      o();
      this.k = 3;
      repaint();
      serviceRepaints();
    } else if (x.g == 2) {
      (this.e[1]).a = 0;
      (this.e[1]).b = 0;
      this.e[0].a(cx.a(this), m);
      this.k = 3;
      repaint();
      serviceRepaints();
      this.e[1].a(cx.a(this), m);
    } else if (x.g == 1) {
      (this.e[1]).a = 0;
      (this.e[1]).b = m / 2;
      this.e[0].a(cx.a(this), m / 2);
      this.k = 3;
      repaint();
      serviceRepaints();
      this.e[1].a(cx.a(this), m / 2);
    } else {
      (this.e[1]).a = cx.a(this) / 2;
      (this.e[1]).b = 0;
      this.e[0].a(cx.a(this) / 2, m);
      this.k = 3;
      repaint();
      serviceRepaints();
      this.e[1].a(cx.a(this) / 2, m);
    } 
    try {
      this.u = Image.createImage("/img/check.png");
    } catch (IOException iOException) {}
    try {
      this.v = Image.createImage("/img/err.png");
    } catch (IOException iOException) {}
    if (x.c != 0) {
      (this.e[0]).s = x.a;
      (this.e[1]).s = x.b;
    } 
    this.k = 4;
    repaint();
    serviceRepaints();
    (this.e[this.f]).m = true;
    (this.e[this.g]).m = false;
    this.e[0].d();
    this.k = 5;
    repaint();
    serviceRepaints();
    this.e[1].d();
    if (x.x != 0) {
      if (x.y.length() > 0 && this.e[0].a(x.y) >= 0)
        this.e[0].e(); 
      if (x.z.length() > 0 && this.e[1].a(x.z) >= 0)
        this.e[1].e(); 
    } 
    e(-1);
    if ((this.e[0]).q != null || (this.e[1]).q != null) {
      Alert alert;
      (alert = new Alert("Error", ((this.e[0]).q != null) ? (this.e[0]).q : (this.e[1]).q, null, AlertType.ERROR)).setTimeout(-2);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)alert);
      alert.setCommandListener((CommandListener)MiniCommander.a);
    } 
    r = new av(i, j);
    s = new av(i, j);
    s.a = 8388608;
    s.b = 16777215;
    long l2;
    if ((l2 = 3000L - System.currentTimeMillis() - l1) > 0L)
      try {
        Thread.sleep(l2);
      } catch (InterruptedException interruptedException) {} 
    this.k = 7;
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    System.gc();
    if (x.I.length() > 0) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new f(this));
      return;
    } 
    repaint();
    serviceRepaints();
  }
  
  private void o() {
    int i = cx.b(this);
    if (x.N)
      i -= l.getHeight() + 2; 
    int j;
    int k = (j = cx.a(this)) * (1 + ((this.f == 0) ? 1 : 0)) / 3;
    (this.e[1]).a = k;
    (this.e[1]).b = 0;
    this.e[0].a(k, i);
    this.e[1].a(j - k, i);
  }
  
  public final void b() {
    this.y = true;
    this.x[0] = false;
    String str1 = this.n.getString();
    Vector vector = this.e[this.f].f();
    byte b1 = 0;
    String str2;
    boolean bool1 = ((str2 = this.n.getString()).toLowerCase().indexOf("[c]") != -1) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    int i = 0;
    byte b2;
    label95: for (b2 = 0; b2 < vector.size() && !this.x[0]; b2++) {
      String str4;
      boolean bool;
      String str5;
      String str6 = cx.h(str5 = (bool = (str4 = cx.a(vector, b2)).endsWith("/")) ? cx.j(str4) : cx.c(str4));
      cx.a("Renaming", str5, "", "", 5);
      if (str6.length() > 0)
        str5 = str5.substring(0, str5.length() - str6.length() - 1); 
      if (str5.length() == 0)
        break; 
      str1 = cx.a(str1 = cx.a(str1 = cx.a(str1 = cx.a(str1 = cx.a(str1 = cx.a(str2, "[N]", str5), "[n]", str5), "[E]", str6), "[e]", str6), "[C]", String.valueOf(b1)), "[c]", String.valueOf(b1));
      if (bool2) {
        String str7 = cx.c(str1);
        String str8;
        if ((str8 = cx.h(str1)).length() > 0)
          str7 = str7.substring(0, str7.length() - str8.length() - 1); 
        str1 = str7 + "_" + b1;
        if (str8.length() > 0)
          str1 = str1 + "." + str8; 
      } 
      if (bool1 || bool2)
        b1++; 
      while (str1.endsWith("."))
        str1 = str1.substring(0, str1.length() - 1); 
      str1 = (this.e[this.f]).s + str1;
      if (bool && !str1.endsWith("/"))
        str1 = str1 + "/"; 
      System.out.println(str4 + " -> " + str1 + " " + b1 + " " + bool1);
      while (true) {
        i = a(str4, str1, (bool5 || bool3), false);
        bool5 = false;
        if (i != 2)
          break; 
        if (!bool2) {
          if (bool4) {
            i = 0;
            break;
          } 
          int j;
          if ((j = a(str4, 1)) == 48) {
            i = 0;
            this.x[0] = true;
            break;
          } 
          if (j == 49) {
            bool5 = true;
            continue;
          } 
          if (j == 50) {
            bool3 = true;
            continue;
          } 
          if (j == 51) {
            i = 0;
            break;
          } 
          if (j == 52) {
            bool4 = true;
            i = 0;
            break;
          } 
          if (j == 53) {
            i = 0;
            bool2 = true;
            b2--;
          } else {
            continue;
          } 
        } else {
          b2--;
          continue label95;
        } 
        b2++;
      } 
      if (i != 0)
        break; 
      bool2 = false;
      if (!bool1)
        b1 = 0; 
    } 
    String str3 = this.e[this.f].b();
    this.e[this.f].d();
    if (this.e[this.f].a(str3) == -1)
      this.e[this.f].a(str1); 
    this.e[this.f].e();
    if ((this.e[0]).s.compareTo((this.e[1]).s) == 0 && (this.e[0]).o == (this.e[1]).o) {
      boolean bool = (this.f == 0) ? true : false;
      str3 = this.e[bool].b();
      this.e[bool].d();
      this.e[bool].a(str3);
      this.e[bool].e();
    } 
    e(-1);
    if (i != 0) {
      this.z = 5;
      s.a("Error", 0);
    } 
    repaint();
    this.y = false;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    String str = paramCommand.getLabel();
    if (this.z == 6) {
      this.z = 0;
      String str1;
      if (str.compareTo(bn.eO) == 0 && (str1 = this.n.getString()).length() != 0) {
        String str2 = this.e[this.f].b();
        if ((this.e[this.f]).o == 0) {
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
          ap ap;
          (ap = new ap(this)).start();
          return;
        } 
        if ((this.e[this.f]).o == 1) {
          if (str2.endsWith("/") && !str1.endsWith("/"))
            str1 = str1 + "/"; 
          dd dd = (this.e[this.f]).u;
          boolean bool = false;
          if (str2.endsWith("/")) {
            for (byte b = 0; b < dd.d(); b++) {
              dd.mc/cs mc/cs;
              if ((mc/cs = dd.d(b)).a.startsWith(str2)) {
                String str3 = str1 + mc/cs.a.substring(str2.length(), mc/cs.a.length());
                mc/cs.a = str3;
              } 
            } 
          } else {
            for (byte b = 0; b < dd.d(); b++) {
              dd.mc/cs mc/cs;
              if ((mc/cs = dd.d(b)).a.equals(str2)) {
                mc/cs.a = str1;
                break;
              } 
            } 
          } 
          if (dd.f() == 0 && dd.a(this) == 0 && dd.g() == 0) {
            dd.c();
            a(dd.c(dd.a), dd.a, true, false);
            dd.a(dd.a);
            this.e[this.f].d();
            this.e[this.f].a(str1);
            this.e[this.f].e();
          } 
          e(-1);
        } else if ((this.e[this.f]).o == 2) {
          if (str2.endsWith("/") && !str1.endsWith("/"))
            str1 = str1 + "/"; 
          try {
            (this.e[this.f]).v.e(str2.startsWith("/") ? str2 : ("/" + str2));
            (this.e[this.f]).v.f(str1.startsWith("/") ? str1 : ("/" + str1));
            this.e[this.f].d();
            this.e[this.f].a(str1);
            this.e[this.f].e();
          } catch (Exception exception) {
            cx.a(bn.eq, exception.getMessage(), (Displayable)this);
            return;
          } 
          e(-1);
        } 
      } 
      this.n = null;
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
      return;
    } 
    if (this.z == 8) {
      this.z = 0;
      if (str.compareTo(bn.eO) == 0)
        try {
          boolean bool1 = this.o.isSelected(0);
          boolean bool2 = this.o.isSelected(1);
          boolean bool3 = this.o.isSelected(2);
          cb cb = this.e[this.f].c();
          m m;
          (m = new m()).a(cb.d);
          m.b(bool1);
          m.c(bool2);
          m.a(bool3);
          m.d();
        } catch (Exception exception) {} 
      this.o = null;
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
      return;
    } 
    if (this.z == 7) {
      this.z = 0;
      if (str.compareTo(bn.eO) == 0) {
        byte b = (this.e[this.f]).o;
        String str1 = this.n.getString();
        int i = 0;
        if (str1.length() != 0) {
          if (b == 0) {
            str1 = (this.e[this.f]).s + str1;
          } else if (b == 2) {
            str1 = (this.e[this.f]).w + str1;
          } 
          if (!str1.endsWith("/"))
            str1 = str1 + "/"; 
          if (b == 0) {
            if ((i = d(str1)) == 0) {
              this.e[this.f].d();
              this.e[this.f].a(str1);
              this.e[this.f].e();
              if ((this.e[this.f]).s.compareTo((this.e[this.g]).s) == 0 && (this.e[this.f]).o == (this.e[this.g]).o) {
                String str2 = this.e[this.g].b();
                this.e[this.g].d();
                this.e[this.g].a(str2);
                this.e[this.g].e();
              } 
              e(-1);
            } else {
              cx.a(bn.eq, (i == 2) ? bn.O : bn.eq, (Displayable)this);
              return;
            } 
          } else if (b == 2) {
            try {
              (this.e[this.f]).v.c(str1.startsWith("/") ? str1 : ("/" + str1));
              this.e[this.f].d();
              this.e[this.f].a(str1);
              this.e[this.f].e();
              e(-1);
            } catch (Exception exception) {
              cx.a(bn.eq, exception.getMessage(), (Displayable)this);
              return;
            } 
          } else if (b == 3) {
            try {
              boolean bool = false;
              if ((this.e[this.f]).x.a(cx.j(str1), false, true) == 160) {
                (this.e[this.f]).x.a("", true, false);
                boolean bool1 = false;
              } else {
                this.z = 5;
                s.a(bn.z, bn.A, 0);
                repaint();
                return;
              } 
              this.e[this.f].d();
              String str2 = (str2 = (this.e[this.f]).y + str1).substring(0, str2.length() - 1);
              this.e[this.f].a(str2);
              this.e[this.f].e();
              e(-1);
            } catch (Exception exception) {
              cx.a(bn.eq, exception.getMessage(), (Displayable)this);
              return;
            } 
          } 
        } 
      } 
      this.n = null;
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
    } 
  }
  
  private void p() {
    cw cw;
    (cw = new cw(this)).start();
    Thread.yield();
  }
  
  public final void paint(Graphics paramGraphics) {
    if (h == null && this.k == 0)
      p(); 
    if (this.k != 7) {
      if (this.a != null) {
        int i = 0;
        int j = 0;
        i = getWidth() / 2 - this.a.getWidth() / 2;
        j = getHeight() / 2 - this.a.getHeight() / 2;
        if (this.c != null && this.d != null)
          j -= this.c.getHeight() / 2; 
        paramGraphics.drawImage(this.b, 0, 0, 20);
        paramGraphics.drawImage(this.a, i, j, 20);
        if (this.k < 6 && this.c != null && this.d != null) {
          int k = this.c.getWidth() + 2;
          int m = this.c.getHeight();
          i = getWidth() / 2 - k * 5 / 2;
          j = getHeight() - m - 1;
          for (byte b = 0; b < 5; b++) {
            if (this.k >= b + 1) {
              paramGraphics.drawImage(this.d, i + b * k, j, 20);
            } else {
              paramGraphics.drawImage(this.c, i + b * k, j, 20);
            } 
          } 
        } 
        return;
      } 
      paramGraphics.drawString(bn.b, 0, 0, 20);
      return;
    } 
    if (x.p == 0) {
      paramGraphics.drawImage(h, 0, 0, 20);
      return;
    } 
    Sprite sprite = new Sprite(h);
    if (x.p == 1) {
      sprite.setPosition(getWidth() - 1, 0);
      sprite.setTransform(5);
    } else {
      sprite.setPosition(0, getHeight() - 1);
      sprite.setTransform(6);
    } 
    sprite.paint(paramGraphics);
  }
  
  public final void keyRepeated(int paramInt) {}
  
  public final void feyReleased(int paramInt) {
    if (this.H != null)
      this.H.a = true; 
    if (this.G != null) {
      int i = E;
      E = 0;
      this.G = null;
      if (this.K) {
        h(i);
      } else {
        g(i);
      } 
    } else {
      E = 0;
      this.F = null;
    } 
    System.gc();
  }
  
  public final void a(cv paramcv) throws Exception {
    try {
      boolean bool = false;
      J = 0;
      while (E != 0) {
        if (!paramcv.a) {
          if (E == 6) {
            this.e[this.f].i();
          } else if (E == 1) {
            this.e[this.f].h();
          } else if (E == 2) {
            this.e[this.f].j();
          } else if (E == 5) {
            this.e[this.f].k();
          } else if (E == 48) {
            this.e[this.f].g();
          } 
          e(this.f);
          repaint();
          if (bool) {
            if (x.l > 0)
              Thread.sleep((J++ < 10) ? x.l : (x.l / 2)); 
            continue;
          } 
          if (x.k > 0)
            Thread.sleep(x.k); 
          bool = true;
          continue;
        } 
        return;
      } 
      return;
    } catch (Exception exception) {}
  }
  
  public final void a(int paramInt) {
    this.H = new cv();
    E = paramInt;
    this.F = new ad(this);
    this.F.start();
    Thread.yield();
  }
  
  public final void b(cv paramcv) throws Exception {
    try {
      boolean bool = false;
      this.K = false;
      if (E == 0 || paramcv.a)
        throw new Exception(); 
      Thread.sleep(x.m);
      if (E == 0 || paramcv.a)
        throw new Exception(); 
      this.K = true;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void f(int paramInt) {
    this.H = new cv();
    E = paramInt;
    this.G = new c(this);
    this.G.start();
    Thread.yield();
  }
  
  private int b(String paramString) {
    return a(paramString, 0);
  }
  
  private int a(String paramString, int paramInt) {
    cx.a(cx.c(paramString), bn.O.toLowerCase(), bn.ac, (paramInt == 0) ? bn.ad : bn.ae, 4);
    this.L = true;
    this.M = 0;
    while (true) {
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {}
      if (this.M != 0) {
        if (this.M == 48 || this.M == 49 || this.M == 50 || this.M == 51 || this.M == 52 || (this.M == 53 && paramInt == 1))
          break; 
        this.M = 0;
      } 
    } 
    this.L = false;
    cx.a(bn.F, "", "", "", 0);
    return this.M;
  }
  
  private void g(int paramInt) {
    String str = cx.b(cx.a(this, paramInt));
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    i = cx.a(i);
    if (this.z == 0)
      if (str.equals("BACK")) {
        if (this.e[this.f].a("..") != -1) {
          this.e[this.f].a();
          e(this.f);
          repaint();
          return;
        } 
      } else {
        if (str.equals("SEND") && (this.e[this.f]).o == 0) {
          f(paramInt);
          bc bc = new bc(this);
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bc);
          return;
        } 
        if (paramInt == 49) {
          cx.b(bn.eH, bn.a, (Displayable)this);
          return;
        } 
        if (paramInt == 50) {
          if ((this.e[this.f]).o == 0) {
            if (this.e[this.f].f().size() > 0) {
              Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new ax(this));
              return;
            } 
          } else {
            cb cb;
            if ((cb = this.e[this.f].c()).d.length() != 0 && cb.d.compareTo("..") != 0 && cb.a != 0) {
              long l1 = 0L;
              long l2 = 0L;
              String str1 = "";
              if ((this.e[this.f]).o == 1) {
                int j;
                if ((j = (this.e[this.f]).u.a(cb.d, false)) == -1)
                  return; 
                l1 = (this.e[this.f]).u.b(j);
                l2 = (this.e[this.f]).u.c(j);
                str1 = cx.c((this.e[this.f]).u.a);
              } else {
                l1 = cb.f;
                l2 = cb.e;
                if ((this.e[this.f]).o == 2)
                  str1 = "FTP"; 
                if ((this.e[this.f]).o == 3)
                  str1 = "Bluetooth"; 
              } 
              String str2 = cb.d + "\n";
              str2 = str2 + bn.af + "\n" + cx.a(l2) + "\n";
              str2 = str2 + bn.W + cx.a(l1, true);
              cx.a(str1, str2, (Displayable)this);
            } 
            return;
          } 
        } else if (paramInt == 51) {
          if ((this.e[this.f]).o == 0 || (this.e[this.f]).o == 1) {
            d(false);
            return;
          } 
        } else if (paramInt == 52) {
          if ((this.e[this.f]).o == 0 || (this.e[this.f]).o == 1) {
            a(false);
            return;
          } 
        } else if (paramInt == 53) {
          if ((this.e[this.f]).o == 0 && (this.e[this.g]).o == 0) {
            int j;
            if ((j = this.e[this.f].f().size()) != 0 && (this.e[this.g]).s.length() != 0) {
              if ((this.e[this.f]).s.equals((this.e[this.g]).s)) {
                this.z = 5;
                s.a(bn.c, bn.d, 0);
                repaint();
              } else {
                this.z = 1;
                r.a(bn.e, String.valueOf(j) + bn.f + " " + bn.M, j.a((this.e[this.g]).s, r.c), 2);
                repaint();
                return;
              } 
            } else {
              return;
            } 
          } else if ((this.e[this.f]).o == 1 && (this.e[this.g]).o == 0) {
            int j;
            if ((j = this.e[this.f].f().size()) != 0) {
              if ((this.e[this.g]).s.length() == 0) {
                this.z = 5;
                s.a(bn.D, bn.E, 0);
                repaint();
              } else {
                this.z = 9;
                r.a(bn.y, String.valueOf(j) + bn.f + " " + bn.M, j.a((this.e[this.g]).s, r.c), 2);
                repaint();
                return;
              } 
            } else {
              return;
            } 
          } else {
            if ((this.e[this.f]).o == 1 && (this.e[this.g]).o == 1) {
              int j;
              if ((j = this.e[this.f].f().size()) != 0) {
                bj bj = new bj(this, (this.e[this.g]).u.a, 2);
                Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bj);
              } 
              return;
            } 
            if ((this.e[this.f]).o == 0 && (this.e[this.g]).o == 1) {
              int j;
              if ((j = this.e[this.f].f().size()) != 0) {
                bj bj = new bj(this, (this.e[this.g]).u.a, 1);
                Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bj);
              } 
              return;
            } 
            if ((this.e[this.f]).o == 2 && (this.e[this.g]).o == 0) {
              Vector vector;
              int j;
              if ((j = (vector = this.e[this.f].f()).size()) != 0) {
                this.z = 16;
                r.a(bn.ej, String.valueOf(j) + bn.f + " " + bn.M, j.a((this.e[this.g]).s, r.c), 2);
                repaint();
              } 
              return;
            } 
            if ((this.e[this.f]).o == 0 && (this.e[this.g]).o == 2) {
              Vector vector;
              int j;
              if ((j = (vector = this.e[this.f].f()).size()) != 0)
                Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new bh(this)); 
              return;
            } 
            if ((this.e[this.f]).o == 3 && (this.e[this.g]).o == 0) {
              Vector vector;
              int j;
              if ((j = (vector = this.e[this.f].f()).size()) != 0) {
                this.z = 20;
                r.a(bn.ej, String.valueOf(j) + bn.f + " " + bn.M, j.a((this.e[this.g]).s, r.c), 2);
                repaint();
              } 
              return;
            } 
            if ((this.e[this.f]).o == 0 && (this.e[this.g]).o == 3) {
              Vector vector;
              int j;
              if ((j = (vector = this.e[this.f].f()).size()) != 0) {
                this.z = 21;
                r.a(bn.K, String.valueOf(j) + bn.f + " " + bn.M, j.a((this.e[this.g]).y, r.c), 2);
                repaint();
              } 
              return;
            } 
          } 
        } else if (paramInt == 54) {
          if ((this.e[this.f]).o == 0 && (this.e[this.g]).o == 0) {
            int j;
            if ((j = this.e[this.f].f().size()) != 0 && (this.e[this.g]).s.length() != 0) {
              if ((this.e[this.f]).s.equals((this.e[this.g]).s)) {
                this.z = 5;
                s.a(bn.g, bn.d, 0);
                repaint();
              } else {
                this.z = 2;
                r.a(bn.h, String.valueOf(j) + bn.f + " " + bn.M, j.a((this.e[this.g]).s, r.c), 2);
                repaint();
                return;
              } 
            } else {
              return;
            } 
          } 
        } else if (paramInt == 55) {
          if (((this.e[this.f]).o == 0 || (this.e[this.f]).o == 2 || (this.e[this.f]).o == 3) && (this.e[this.f]).s.length() != 0) {
            Form form = new Form(bn.aa);
            this.n = new TextField(bn.ab, null, 255, 0);
            form.append((Item)this.n);
            form.addCommand(new Command(bn.eN, 2, 1));
            form.addCommand(new Command(bn.eO, 4, 1));
            form.setCommandListener(this);
            this.z = 7;
            Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)form);
            return;
          } 
        } else if (paramInt == 56 || str.equals("C")) {
          if ((this.e[this.f]).o == 0) {
            int j;
            if ((j = this.e[this.f].f().size()) != 0) {
              this.z = 3;
              r.a(bn.j, String.valueOf(j) + bn.f + " " + bn.N, j.a((this.e[this.f]).s, r.c), 2);
              repaint();
            } 
            return;
          } 
          if ((this.e[this.f]).o == 1) {
            int j;
            if ((j = this.e[this.f].f().size()) != 0) {
              this.z = 10;
              r.a(bn.j, String.valueOf(j) + bn.f + " " + bn.N, j.a(cx.c((this.e[this.f]).u.a), r.c), 2);
              repaint();
            } 
            return;
          } 
          if ((this.e[this.f]).o == 2) {
            int j;
            if ((j = this.e[this.f].f().size()) != 0) {
              this.z = 18;
              r.a(bn.j, String.valueOf(j) + bn.f + " " + bn.N, j.a((this.e[this.f]).w, r.c), 2);
              repaint();
            } 
            return;
          } 
          if ((this.e[this.f]).o == 3) {
            int j;
            if ((j = this.e[this.f].f().size()) != 0) {
              this.z = 22;
              r.a(bn.j, String.valueOf(j) + bn.f + " " + bn.N, j.a((this.e[this.f]).y, r.c), 2);
              repaint();
            } 
            return;
          } 
        } else {
          if (paramInt == 57) {
            if (x.h == -1) {
              x.h = x.g;
              if (x.g != 2) {
                x.g = 2;
              } else {
                x.g = 0;
              } 
            } else if (x.g == 2) {
              boolean bool = false;
              x.g = x.h;
              x.h = x.g;
            } else {
              x.h = x.g;
              x.g = 2;
            } 
            h();
            this.e[0].a(this.e[0].b());
            this.e[1].a(this.e[1].b());
            this.e[0].e();
            this.e[1].e();
            e(-1);
            repaint();
            return;
          } 
          if (i == 8) {
            this.e[this.f].a();
            if (this.z == 0) {
              e(this.f);
              repaint();
            } 
          } 
        } 
      }  
  }
  
  private void h(int paramInt) {
    String str = cx.b(cx.a(this, paramInt));
    if (paramInt == 50) {
      String str1;
      String str2 = this.e[this.f].n();
      try {
        m m;
        (m = new m()).a(str2, 1);
        str2 = bn.Q + str2 + "\n";
        str2 = str2 + bn.R + (this.e[this.f]).s + "\n";
        str2 = str2 + bn.S + cx.a(m.h(), true) + "\n";
        str2 = str2 + bn.T + cx.a(m.j(), true) + "\n";
        str2 = str2 + bn.U + cx.a(m.i(), true);
        str1 = bn.P;
        m.d();
      } catch (Exception exception) {
        str2 = bn.eq + ":\n" + exception.getMessage() + " : " + exception.toString();
        str1 = bn.eq;
      } 
      cx.a(str1, str2, (Displayable)this);
      return;
    } 
    if (paramInt == 51) {
      if ((this.e[this.f]).o == 0 || (this.e[this.f]).o == 1) {
        d(true);
        return;
      } 
    } else if (paramInt == 52) {
      if ((this.e[this.f]).o == 0 || (this.e[this.f]).o == 1) {
        a(true);
        return;
      } 
    } else if (paramInt == 53) {
      if ((this.e[this.g]).o == 0 && !(this.e[this.f]).s.equals((this.e[this.g]).s)) {
        (this.e[this.g]).s = (this.e[this.f]).s;
        this.e[this.g].d();
        e(this.g);
        repaint();
        return;
      } 
    } else {
      if (paramInt == 54) {
        Vector vector;
        if ((vector = this.e[this.f].f()).size() > 0) {
          Form form = new Form(bn.L);
          if ((this.e[this.f]).o == 0) {
            String str1;
            if (vector.size() == 1) {
              str1 = cx.c(((cb)vector.elementAt(0)).d);
            } else {
              str1 = "[N].[E]";
            } 
            form.append((vector.size() == 1) ? str1 : (vector.size() + " file(s)"));
            this.n = new TextField(bn.M, str1, 255, 0);
            form.addCommand(new Command(bn.eN, 2, 1));
            form.addCommand(new Command(bn.eO, 4, 1));
          } else if ((this.e[this.f]).o == 1 || (this.e[this.f]).o == 2) {
            cb cb;
            String str1 = (cb = this.e[this.f].c()).d;
            if (cb.a == 0)
              str1 = str1.substring(0, str1.length() - 1); 
            this.n = new TextField(null, str1, 255, 0);
            form.addCommand(new Command(bn.eN, 2, 1));
            form.addCommand(new Command(bn.eO, 4, 1));
          } 
          form.append((Item)this.n);
          this.z = 6;
          form.setCommandListener(this);
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)form);
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrentItem((Item)this.n);
        } 
        return;
      } 
      if (paramInt == 55) {
        (this.e[this.f]).n = true;
        this.e[this.f].e();
        e(this.f);
        repaint();
        serviceRepaints();
        (this.e[this.f]).n = false;
        String str1 = this.e[this.f].b();
        this.e[this.f].d();
        this.e[this.f].a(str1);
        this.e[this.f].e();
        e(this.f);
        repaint();
        return;
      } 
      if (paramInt == 57) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent(null);
        return;
      } 
      if ((str.equals("C") || str.equals("SEND")) && this.e[this.f].a("..") != -1) {
        this.e[this.f].a();
        e(this.f);
        repaint();
      } 
    } 
  }
  
  public final void feyPressed(int paramInt) {
    if (this.k != 7)
      return; 
    if (this.L) {
      this.M = paramInt;
      return;
    } 
    if (this.y) {
      if (paramInt == 48)
        this.x[0] = true; 
      return;
    } 
    E = 0;
    if (this.H != null)
      this.H.a = true; 
    this.F = null;
    System.gc();
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    String str = cx.b(cx.a(this, paramInt));
    if (this.z == 0) {
      if (str.equals("SOFT2") || str.equals("SOFT3")) {
        bb bb;
        (bb = new bb(this, h)).repaint();
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bb);
        return;
      } 
      if (str.equals("SEND") || str.equals("BACK")) {
        f(paramInt);
        return;
      } 
      if (paramInt == 48) {
        a(paramInt);
        return;
      } 
      if ((paramInt >= 49 && paramInt <= 57) || str.equals("C")) {
        f(paramInt);
        return;
      } 
      if (i == 6 || i == 1 || i == 2 || i == 5) {
        a(cx.a(i));
        return;
      } 
      if (paramInt == 42) {
        this.e[this.f].l();
        e(this.f);
        repaint();
        return;
      } 
      if (paramInt == 35) {
        this.e[this.f].m();
        e(this.f);
        repaint();
        return;
      } 
      if (str.equals("SOFT1")) {
        q();
        repaint();
        return;
      } 
      if (i == 8) {
        f(paramInt);
        return;
      } 
    } else {
      if (this.z == 5) {
        this.z = 0;
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 1) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          az az;
          (az = new az(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        this.e[this.g].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 2) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          cg cg;
          (cg = new cg(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        this.e[this.g].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 3) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          bz bz;
          (bz = new bz(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 9) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          t t;
          (t = new t(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        this.e[this.g].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 10) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          i i1;
          (i1 = new i(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        this.e[this.g].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 16) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          bw bw;
          (bw = new bw(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        this.e[this.g].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 18) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          be be;
          (be = new be(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 20) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          bi bi;
          (bi = new bi(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        this.e[this.g].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 21) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          db db;
          (db = new db(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        this.e[this.g].e();
        e(-1);
        repaint();
        return;
      } 
      if (this.z == 22) {
        if (str.equals("SOFT1") || (i == 8 && paramInt != 53 && !str.equals("SOFT2"))) {
          ct ct;
          (ct = new ct(this)).start();
          return;
        } 
        this.z = 0;
        this.e[this.f].e();
        e(-1);
        repaint();
      } 
    } 
  }
  
  private void q() {
    if (this.f == 0) {
      this.f = 1;
      this.g = 0;
    } else {
      this.f = 0;
      this.g = 1;
    } 
    (this.e[this.f]).m = true;
    (this.e[this.g]).m = false;
    if (x.g == 3)
      o(); 
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2) {
    if (!x.N || this.k != 7)
      return; 
    if (a(paramInt1, paramInt2))
      return; 
    if (paramInt2 > cx.b(this) - l.getHeight())
      return; 
    if (!this.y && !this.L && this.z == 0)
      a(paramInt1, paramInt2, false); 
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    int i = b(paramInt1, paramInt2);
    if (this.f != i)
      q(); 
    this.e[i].a(paramInt1, paramInt2, paramBoolean);
    if (this.z != 0)
      return; 
    e(i);
    repaint();
  }
  
  public final void pointerReleased(int paramInt1, int paramInt2) {
    if (this.k != 7 || this.y || this.L || this.z != 0)
      return; 
    if (!x.N) {
      x.N = true;
      h();
      this.e[0].a(this.e[0].b());
      this.e[1].a(this.e[1].b());
      this.e[0].e();
      this.e[1].e();
      e(-1);
      repaint();
      return;
    } 
    if (x.N)
      feyReleased(0); 
  }
  
  public final void pointerDragged(int paramInt1, int paramInt2) {
    if (!x.N || this.k != 7 || this.y || this.L || this.z != 0)
      return; 
    if (x.N && paramInt2 > cx.b(this) - l.getHeight())
      return; 
    a(paramInt1, paramInt2, true);
  }
  
  private int b(int paramInt1, int paramInt2) {
    return (x.g == 2) ? this.f : ((paramInt1 >= (this.e[0]).a && paramInt1 < (this.e[0]).a + (this.e[0]).c + 5 && paramInt2 >= (this.e[0]).b && paramInt2 < (this.e[0]).b + (this.e[0]).d) ? 0 : 1);
  }
  
  public final void a(boolean paramBoolean) {
    cb cb;
    if ((cb = this.e[this.f].c()).a == 1 && !cb.d.equals("..")) {
      if (x.D == 0 || paramBoolean) {
        ai ai;
        (ai = new ai(this, h, true)).repaint();
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ai);
        return;
      } 
      b(x.D);
    } 
  }
  
  public final void b(int paramInt) {
    cb cb = this.e[this.f].c();
    try {
      dh dh;
      (dh = new dh(this, null)).o = true;
      dh.h = cb.d;
      dh.i = (this.e[this.f]).u;
      dh.K = paramInt;
      dh.a();
      return;
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString() + " : " + bn.t + cb.d, (Displayable)this);
      return;
    } 
  }
  
  private void d(boolean paramBoolean) {
    cb cb;
    if ((cb = this.e[this.f].c()).a == 1 && !cb.d.equals("..")) {
      if (x.D == 0 || paramBoolean) {
        ai ai;
        (ai = new ai(this, h, false)).repaint();
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ai);
        return;
      } 
      c(x.D);
    } 
  }
  
  public final void c(int paramInt) {
    cb cb = this.e[this.f].c();
    try {
      dh dh;
      (dh = new dh(this, null)).h = cb.d;
      dh.i = (this.e[this.f]).u;
      dh.K = paramInt;
      dh.a();
      return;
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString() + " : " + bn.t + cb.d, (Displayable)this);
      return;
    } 
  }
  
  private boolean c(String paramString) {
    for (byte b = 0; b < this.m.size(); b++) {
      if (((String)this.m.elementAt(b)).equals(paramString))
        return true; 
    } 
    m m = new m();
    try {
      m.a(paramString);
      if (m.p()) {
        m.d();
        this.m.addElement(new String(paramString));
        return true;
      } 
      String str;
      if ((str = cx.e(paramString)) == null) {
        m.d();
        return true;
      } 
      if (str.length() == 0) {
        m.d();
        return true;
      } 
      if (!c(str)) {
        m.d();
        return false;
      } 
      m.q();
      m.d();
      this.m.addElement(new String(paramString));
      return true;
    } catch (Exception exception) {
    
    } catch (Error error) {}
    try {
      m.d();
    } catch (Exception exception) {}
    return false;
  }
  
  private void a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    if (paramInt2 < paramInt1)
      return; 
    int m = 0;
    int i = paramInt1;
    int j = paramInt2;
    int k = paramArrayOfint[(i + j) / 2];
    while (true) {
      while (paramArrayOfint[i] < k)
        i++; 
      while (paramArrayOfint[j] > k)
        j--; 
      if (i <= j) {
        m = paramArrayOfint[i];
        paramArrayOfint[i] = paramArrayOfint[j];
        paramArrayOfint[j] = m;
        i++;
        j--;
      } 
      if (i > j) {
        if (j > paramInt1)
          a(paramArrayOfint, paramInt1, j); 
        if (i < paramInt2)
          a(paramArrayOfint, i, paramInt2); 
        return;
      } 
    } 
  }
  
  private int[] a(Vector paramVector, dd paramdd, boolean paramBoolean1, boolean paramBoolean2) {
    cx.a(bn.w, "", "", 0);
    int[] arrayOfInt = null;
    Vector vector = new Vector();
    cb cb = null;
    int i = 0;
    if (paramBoolean2) {
      for (byte b1 = 0; b1 < paramdd.d(); b1++)
        vector.addElement(new Integer(b1)); 
    } else {
      for (byte b1 = 0; b1 < paramVector.size(); b1++) {
        (cb = paramVector.elementAt(b1)).b = false;
        if (cb.a != 0) {
          if ((i = paramdd.a(cb.d, false)) >= 0) {
            vector.addElement(new Integer(i));
            if (paramBoolean1)
              (paramdd.d(i)).l = true; 
          } 
        } else {
          for (byte b2 = 0; b2 < paramdd.d(); b2++) {
            if (paramdd.a(b2).startsWith(cb.d)) {
              vector.addElement(new Integer(b2));
              if (paramBoolean1)
                (paramdd.d(b2)).l = true; 
            } 
          } 
        } 
      } 
    } 
    if (vector.size() == 0)
      return null; 
    arrayOfInt = new int[vector.size()];
    for (byte b = 0; b < vector.size(); b++)
      arrayOfInt[b] = ((Integer)vector.elementAt(b)).intValue(); 
    a(arrayOfInt, 0, arrayOfInt.length - 1);
    return arrayOfInt;
  }
  
  public final void d(int paramInt) {
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    int i = i(paramInt);
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 2) {
        s.a(bn.C, bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else if (i == 4) {
        s.a(bn.z, bn.A, 0);
      } else {
        s.a(bn.o, bn.B, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int i(int paramInt) {
    this.y = true;
    this.x[0] = false;
    int i = 0;
    dd dd;
    if ((dd = (this.e[this.f]).u) == null && !(dd = new dd()).a(this.e[this.f].b()))
      return -1; 
    Vector vector = this.e[this.f].f();
    String str = (this.e[this.g]).s;
    if (paramInt == 1)
      str = (this.e[this.f]).s; 
    if (paramInt == 2)
      str = this.e[this.f].b().substring(0, dd.a.length() - cx.h(dd.a).length() - 1) + "/"; 
    this.m.removeAllElements();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    int[] arrayOfInt;
    if ((arrayOfInt = a(vector, dd, false, (paramInt != 0))) == null)
      return 0; 
    for (byte b = 0; b < arrayOfInt.length && !this.x[0]; b++) {
      String str2;
      String str1 = dd.a(arrayOfInt[b]);
      if (MiniCommander.c == 0) {
        str2 = str + cx.c(str1);
      } else {
        str2 = str + str1.substring((paramInt == 0) ? (this.e[this.f]).t.length() : 0, str1.length());
      } 
      while (true) {
        i = a(dd, str1, str2, (bool3 || bool1));
        bool3 = false;
        if (i != 2)
          break; 
        if (bool2) {
          i = 0;
          break;
        } 
        int j;
        if ((j = b(str2)) == 48) {
          i = 0;
          this.x[0] = true;
          break;
        } 
        if (j == 49) {
          bool3 = true;
          continue;
        } 
        if (j == 50) {
          bool1 = true;
          continue;
        } 
        if (j == 51) {
          i = 0;
          break;
        } 
        if (j == 52) {
          bool2 = true;
          i = 0;
          break;
        } 
      } 
      if (this.x[0]) {
        i = 0;
        break;
      } 
      if (i != 0)
        break; 
    } 
    if (paramInt != 0) {
      dd.c();
      String str1 = this.e[this.f].b();
      this.e[this.f].d();
      this.e[this.f].a(str1);
    } 
    if (paramInt == 0 || (paramInt != 0 && (this.e[this.f]).s.equals((this.e[this.g]).s) && (this.e[this.f]).o == (this.e[this.g]).o)) {
      String str1 = this.e[this.g].b();
      this.e[this.g].d();
      this.e[this.g].a(str1);
    } 
    return i;
  }
  
  private int a(dd paramdd, String paramString1, String paramString2, boolean paramBoolean) {
    try {
      int i = paramdd.a(paramString1, false);
      DataOutputStream dataOutputStream = null;
      if (!c(cx.d(paramString2)))
        return 4; 
      m m = new m();
      String str1;
      if (x.L && ((str1 = paramString2.toLowerCase()).endsWith(".jad") || str1.endsWith(".jar")))
        paramString2 = paramString2.substring(0, paramString2.length() - 4) + "_" + paramString2.substring(paramString2.length() - 3, paramString2.length()); 
      m.a(paramString2);
      if (m.p()) {
        if (!paramBoolean) {
          m.d();
          return 2;
        } 
        m.o();
        m.d();
        m.a(paramString2);
      } 
      if (x.K && m.j() < paramdd.b(i)) {
        m.d();
        return 3;
      } 
      m.n();
      m.b(true);
      m.c(true);
      m.a(false);
      dataOutputStream = m.c();
      long l1 = paramdd.b(i);
      long l2 = l1;
      long l3 = 0L;
      int j = 0;
      byte[] arrayOfByte;
      long l4 = (arrayOfByte = new byte[6144]).length;
      if (!paramdd.e(i))
        throw new Exception("openEntry error"); 
      String str2 = j.a(cx.c(paramString1), r.c);
      String str3 = j.a(cx.d(paramString2), r.c);
      long l5 = 0L;
      while (l2 != 0L && !this.x[0]) {
        long l = System.currentTimeMillis();
        if (l5 < l) {
          l5 = l + 1000L;
          cx.a(bn.x + " (" + String.valueOf(l3 * 100L / l1) + "%)", str2, str3, 4);
        } 
        if (l2 > l4) {
          j = (int)l4;
        } else {
          j = (int)l2;
        } 
        j = paramdd.a(arrayOfByte, 0, j);
        if (this.x[0])
          break; 
        dataOutputStream.write(arrayOfByte, 0, j);
        l2 -= j;
        l3 = l1 - l2;
      } 
      dataOutputStream.close();
      if (this.x[0])
        m.o(); 
      m.d();
      paramdd.e();
      if (this.x[0])
        return 5; 
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString() + bn.t + paramString2, (Displayable)this);
      return -1;
    } catch (Error error) {
      cx.a(bn.eq, error.toString(), (Displayable)this);
      return -1;
    } 
    return 0;
  }
  
  public final void c() {
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    String str = cx.c((this.e[this.f]).u.a);
    int i = r();
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 17) {
        s.a(bn.ah, bn.ai, 0);
      } else if (i == 2) {
        s.a(bn.C, bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else {
        s.a(bn.aj, bn.ak, str, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int r() {
    this.y = true;
    this.x[0] = false;
    int i = 0;
    dd dd = (this.e[this.f]).u;
    Vector vector = this.e[this.f].f();
    this.m.removeAllElements();
    int[] arrayOfInt = a(vector, dd, true, false);
    r.a(bn.v + "...", 4);
    repaint();
    if (arrayOfInt == null)
      return 0; 
    if ((i = dd.f()) == 0 && (i = dd.a(this)) == 0 && (i = dd.g()) == 0) {
      dd.c();
      a(dd.c(dd.a), dd.a, true, false);
      dd.a(dd.a);
      for (byte b = 0; b < vector.size(); b++)
        ((cb)vector.elementAt(b)).c = true; 
    } 
    a(this.e[this.f]);
    return i;
  }
  
  private void b(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    this.z = 11;
    this.y = true;
    this.x[0] = false;
    String str = cx.c(paramString);
    long l1 = System.currentTimeMillis();
    int i = c(paramString, paramInt, paramBoolean1, paramBoolean2);
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 17) {
        s.a(bn.ah, bn.ai, 0);
      } else if (i == 2) {
        s.a(dd.c(str), bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else {
        s.a(bn.aj, bn.ak, str, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int c(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    this.y = true;
    this.x[0] = false;
    int i = 0;
    dd dd1 = (this.e[this.f]).u;
    dd dd2 = (this.e[this.g]).u;
    Vector vector = this.e[this.f].f();
    int[] arrayOfInt;
    if ((arrayOfInt = a(vector, dd1, false, false)) == null)
      return 0; 
    this.m.removeAllElements();
    r.a(bn.w, 0);
    repaint();
    if ((i = dd2.f()) == 0 && (i = dd2.a(new byte[4096], new byte[8192], new byte[12], dd1, arrayOfInt, (this.e[this.f]).t, (this.e[this.g]).t, this, paramBoolean1)) == 0 && (i = dd2.a(this)) == 0 && (i = dd2.g()) == 0) {
      dd2.c();
      a(dd.c(dd2.a), dd2.a, true, false);
      if (!paramBoolean2)
        dd2.a(dd2.a); 
    } 
    if (i != 0) {
      dd2.c();
      if (paramBoolean2) {
        a(paramString, false);
      } else {
        dd2.a(dd2.a);
      } 
    } 
    a(this.e[this.f]);
    String str = this.e[this.g].b();
    this.e[this.g].d();
    this.e[this.g].a(str);
    if (paramBoolean2 && i == 0)
      this.e[this.f].a(paramString); 
    return i;
  }
  
  public final void a(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    if ((this.e[this.f]).o == 1 && (this.e[this.g]).o == 1) {
      b(paramString, paramInt, paramBoolean1, paramBoolean2);
      return;
    } 
    this.z = 11;
    this.y = true;
    this.x[0] = false;
    String str = cx.c(paramString);
    long l1 = System.currentTimeMillis();
    int i = d(paramString, paramInt, paramBoolean1, paramBoolean2);
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 17) {
        s.a(bn.ah, bn.ai, 0);
      } else if (i == 2) {
        s.a(dd.c(str), bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else {
        s.a(bn.aj, bn.ak, str, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int d(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    this.y = true;
    this.x[0] = false;
    int i = 0;
    dd dd = null;
    if (paramBoolean2) {
      if ((i = (dd = new dd()).b(paramString)) == 2) {
        if (!dd.a(paramString))
          return 15; 
      } else if (i != 0) {
        return 14;
      } 
    } else {
      dd = (this.e[this.g]).u;
    } 
    Vector vector = this.e[this.f].f();
    this.m.removeAllElements();
    cb cb = null;
    Vector vector1 = new Vector();
    r.a(bn.w, 0);
    repaint();
    for (byte b = 0; b < vector.size(); b++) {
      String str1;
      if ((str1 = (cb = vector.elementAt(b)).d).endsWith("/")) {
        a(str1, vector1, false);
      } else {
        vector1.addElement(str1);
      } 
    } 
    if (vector1.size() == 0)
      return 0; 
    if ((i = dd.f()) == 0)
      if ((i = dd.a(new byte[4096], new byte[8192], new byte[12], vector1, (this.e[this.f]).s, paramBoolean2 ? "" : (this.e[this.g]).t, this, paramInt, paramBoolean1)) == 0 && (i = dd.a(this)) == 0 && (i = dd.g()) == 0) {
        dd.c();
        a(dd.c(dd.a), dd.a, true, false);
        if (!paramBoolean2)
          dd.a(dd.a); 
      }  
    if (i != 0) {
      dd.c();
      if (paramBoolean2) {
        a(paramString, false);
      } else {
        dd.a(dd.a);
      } 
    } 
    a(this.e[this.f]);
    String str = this.e[this.g].b();
    this.e[this.g].d();
    this.e[this.g].a(str);
    if (paramBoolean2 && i == 0)
      this.e[this.f].a(paramString); 
    return i;
  }
  
  private void a(long paramLong1, long paramLong2, int paramInt) {
    if (paramInt != 5 && x.O && (paramLong2 - paramLong1) / 1000L >= x.P)
      cx.b(); 
  }
  
  public final void d() {
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    int i = s();
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 2) {
        s.a(bn.C, bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else if (i == 4) {
        s.a(bn.z, bn.A, 0);
      } else {
        s.a(bn.o, bn.p, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int s() {
    int i = 0;
    Vector vector = this.e[this.f].f();
    cb cb = null;
    this.m.removeAllElements();
    Vector vector1 = new Vector();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    for (byte b = 0; b < vector.size(); b++) {
      String str1;
      if ((str1 = (cb = vector.elementAt(b)).d).endsWith("/")) {
        vector1.removeAllElements();
        a(str1, vector1, true);
        if (vector1.size() == 0) {
          String str2 = str1.substring((this.e[this.f]).s.length(), str1.length());
          str2 = (this.e[this.g]).s + str2;
          if (!c(str2)) {
            i = 4;
            break;
          } 
        } else {
          for (byte b1 = 0; b1 < vector1.size() && !this.x[0]; b1++) {
            String str2 = (str1 = vector1.elementAt(b1)).substring((this.e[this.f]).s.length(), str1.length());
            str2 = (this.e[this.g]).s + str2;
            if (!str1.equals(str2))
              if (str1.endsWith("/")) {
                if (!c(str2)) {
                  i = 4;
                  break;
                } 
              } else {
                while (true) {
                  i = a(str1, str2, (bool3 || bool1));
                  bool3 = false;
                  if (i != 2)
                    break; 
                  if (bool2) {
                    i = 0;
                    break;
                  } 
                  int j;
                  if ((j = b(str1)) == 48) {
                    i = 0;
                    this.x[0] = true;
                    break;
                  } 
                  if (j == 49) {
                    bool3 = true;
                    continue;
                  } 
                  if (j == 50) {
                    bool1 = true;
                    continue;
                  } 
                  if (j == 51) {
                    i = 0;
                    break;
                  } 
                  if (j == 52) {
                    bool2 = true;
                    i = 0;
                    break;
                  } 
                } 
                if (this.x[0]) {
                  i = 0;
                  break;
                } 
                if (i != 0)
                  break; 
              }  
          } 
        } 
        if (this.x[0] || i != 0)
          break; 
      } else {
        if (this.x[0])
          break; 
        String str2 = (str1 = cx.a(vector, b)).substring((this.e[this.f]).s.length(), str1.length());
        str2 = (this.e[this.g]).s + str2;
        if (!str1.equals(str2)) {
          while (true) {
            i = a(str1, str2, (bool3 || bool1));
            bool3 = false;
            if (i != 2)
              break; 
            if (bool2) {
              i = 0;
              break;
            } 
            int j;
            if ((j = b(str1)) == 48) {
              i = 0;
              this.x[0] = true;
              break;
            } 
            if (j == 49) {
              bool3 = true;
              continue;
            } 
            if (j == 50) {
              bool1 = true;
              continue;
            } 
            if (j == 51) {
              i = 0;
              break;
            } 
            if (j == 52) {
              bool2 = true;
              i = 0;
              break;
            } 
          } 
          if (this.x[0]) {
            i = 0;
            break;
          } 
          if (i != 0)
            break; 
        } 
      } 
      cb.b = false;
    } 
    String str = this.e[this.g].b();
    this.e[this.g].d();
    this.e[this.g].a(str);
    return i;
  }
  
  public final Vector b(boolean paramBoolean) {
    // Byte code:
    //   0: new java/util/Vector
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield e : [Lmc/cy;
    //   12: aload_0
    //   13: getfield f : I
    //   16: aaload
    //   17: invokevirtual f : ()Ljava/util/Vector;
    //   20: astore_3
    //   21: iconst_0
    //   22: istore #5
    //   24: iload #5
    //   26: aload_3
    //   27: invokevirtual size : ()I
    //   30: if_icmpge -> 86
    //   33: aload_3
    //   34: iload #5
    //   36: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   39: checkcast mc/cb
    //   42: dup
    //   43: astore #4
    //   45: getfield d : Ljava/lang/String;
    //   48: ldc_w '/'
    //   51: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   54: ifeq -> 71
    //   57: aload #4
    //   59: getfield d : Ljava/lang/String;
    //   62: aload_2
    //   63: iload_1
    //   64: invokestatic a : (Ljava/lang/String;Ljava/util/Vector;Z)V
    //   67: iload_1
    //   68: ifeq -> 80
    //   71: aload_2
    //   72: aload #4
    //   74: getfield d : Ljava/lang/String;
    //   77: invokevirtual addElement : (Ljava/lang/Object;)V
    //   80: iinc #5, 1
    //   83: goto -> 24
    //   86: aload_2
    //   87: areturn
  }
  
  public static void a(String paramString, Vector paramVector, boolean paramBoolean) {
    m m = null;
    m = new m();
    try {
      m.a(paramString, 1);
      String[] arrayOfString = m.a(paramString, true);
      m.d();
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b].endsWith("/")) {
          a(arrayOfString[b], paramVector, paramBoolean);
          if (paramBoolean)
            paramVector.addElement(new String(arrayOfString[b])); 
        } else {
          paramVector.addElement(new String(arrayOfString[b]));
        } 
      } 
      return;
    } catch (Exception exception) {
      try {
        m.d();
        return;
      } catch (Exception exception1) {
        return;
      } 
    } 
  }
  
  private int a(String paramString1, String paramString2, boolean paramBoolean) {
    m m1 = null;
    m m2 = null;
    DataInputStream dataInputStream = null;
    DataOutputStream dataOutputStream = null;
    try {
      if (!c(cx.d(paramString2)))
        return 4; 
      (m1 = new m()).a(paramString1, 1);
      if (!m1.k())
        return 1; 
      (m2 = new m()).a(paramString2);
      if (m2.p()) {
        if (!paramBoolean) {
          m2.d();
          m1.d();
          return 2;
        } 
        if (x.K && m2.j() - m2.a() < m1.a()) {
          m2.d();
          m1.d();
          return 3;
        } 
        m2.o();
        m2.d();
        m2.a(paramString2);
      } 
      if (x.K && m2.j() < m1.a()) {
        m2.d();
        m1.d();
        return 3;
      } 
      m2.n();
      m2.b(true);
      m2.c(true);
      m2.a(false);
      dataInputStream = m1.b();
      dataOutputStream = m2.c();
      long l1 = m1.a();
      long l2 = l1;
      long l3 = 0L;
      int i = 0;
      byte[] arrayOfByte;
      long l4 = (arrayOfByte = new byte[10240]).length;
      String str1 = j.a(cx.c(paramString1) + " " + bn.M, r.c);
      String str2 = j.a(cx.d(paramString2), r.c);
      long l5 = 0L;
      while (l2 != 0L && !this.x[0]) {
        long l = System.currentTimeMillis();
        if (l5 < l) {
          l5 = l + 1000L;
          cx.a(bn.s + " (" + String.valueOf(l3 * 100L / l1) + "%)", str1, str2, 4);
        } 
        if (l2 > l4) {
          i = (int)l4;
        } else {
          i = (int)l2;
        } 
        i = dataInputStream.read(arrayOfByte, 0, i);
        if (this.x[0])
          break; 
        dataOutputStream.write(arrayOfByte, 0, i);
        l2 -= i;
        l3 = l1 - l2;
      } 
      dataInputStream.close();
      dataOutputStream.close();
      if (this.x[0])
        m2.o(); 
      m1.d();
      m2.d();
      if (this.x[0])
        return 5; 
    } catch (Exception exception) {
      try {
        if (dataOutputStream != null)
          dataOutputStream.close(); 
      } catch (Exception exception1) {}
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } catch (Exception exception1) {}
      try {
        if (m2 != null)
          m2.d(); 
      } catch (Exception exception1) {}
      try {
        if (m1 != null)
          m1.d(); 
      } catch (Exception exception1) {}
      cx.a(bn.eq, exception.toString() + bn.t + paramString1, (Displayable)this);
      return -1;
    } catch (Error error) {
      try {
        if (dataOutputStream != null)
          dataOutputStream.close(); 
      } catch (Exception exception) {}
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } catch (Exception exception) {}
      try {
        if (m2 != null)
          m2.d(); 
      } catch (Exception exception) {}
      try {
        if (m1 != null)
          m1.d(); 
      } catch (Exception exception) {}
      cx.a(bn.eq, error.toString(), (Displayable)this);
      return -1;
    } 
    return 0;
  }
  
  public final void e() {
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    int i = t();
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 2) {
        s.a(bn.C, bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else if (i == 4) {
        s.a(bn.z, bn.A, 0);
      } else {
        s.a(bn.o, bn.q, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int t() {
    int i = 0;
    cy cy1;
    Vector vector = (cy1 = this.e[this.f]).f();
    cb cb = null;
    this.m.removeAllElements();
    Vector vector1 = new Vector();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    for (byte b = 0; b < vector.size(); b++) {
      String str1;
      if ((str1 = (cb = vector.elementAt(b)).d).endsWith("/")) {
        vector1.removeAllElements();
        a(str1, vector1, true);
        if (vector1.size() == 0) {
          String str2 = str1.substring(cy1.s.length(), str1.length());
          str2 = (this.e[this.g]).s + str2;
          if (!c(str2)) {
            i = 4;
            break;
          } 
          a(str1, true);
        } else {
          for (byte b1 = 0; b1 < vector1.size() && !this.x[0]; b1++) {
            String str2 = (str1 = vector1.elementAt(b1)).substring(cy1.s.length(), str1.length());
            str2 = (this.e[this.g]).s + str2;
            if (!str1.equals(str2))
              if (str1.endsWith("/")) {
                if (!c(str2)) {
                  i = 4;
                  break;
                } 
              } else {
                while (true) {
                  i = a(str1, str2, (bool3 || bool1), true);
                  bool3 = false;
                  if (i != 2)
                    break; 
                  if (bool2) {
                    i = 0;
                    break;
                  } 
                  int j;
                  if ((j = b(str1)) == 48) {
                    i = 0;
                    this.x[0] = true;
                    break;
                  } 
                  if (j == 49) {
                    bool3 = true;
                    continue;
                  } 
                  if (j == 50) {
                    bool1 = true;
                    continue;
                  } 
                  if (j == 51) {
                    i = 0;
                    break;
                  } 
                  if (j == 52) {
                    bool2 = true;
                    i = 0;
                    break;
                  } 
                } 
                if (this.x[0]) {
                  i = 0;
                  break;
                } 
                if (i != 0)
                  break; 
              }  
          } 
        } 
        if (this.x[0])
          break; 
        if (i == 0) {
          a(cb.d, true);
        } else if (i != 0) {
          break;
        } 
      } else {
        if (this.x[0])
          break; 
        String str2 = (str1 = cx.a(vector, b)).substring(cy1.s.length(), str1.length());
        str2 = (this.e[this.g]).s + str2;
        if (!str1.equals(str2)) {
          while (true) {
            i = a(str1, str2, (bool3 || bool1), true);
            bool3 = false;
            if (i != 2)
              break; 
            if (bool2) {
              i = 0;
              break;
            } 
            int j;
            if ((j = b(str1)) == 48) {
              i = 0;
              this.x[0] = true;
              break;
            } 
            if (j == 49) {
              bool3 = true;
              continue;
            } 
            if (j == 50) {
              bool1 = true;
              continue;
            } 
            if (j == 51) {
              i = 0;
              break;
            } 
            if (j == 52) {
              bool2 = true;
              i = 0;
              break;
            } 
          } 
          if (this.x[0]) {
            i = 0;
            break;
          } 
          if (i != 0)
            break; 
        } 
      } 
      cb.b = false;
      cb.c = true;
    } 
    String str = this.e[this.g].b();
    this.e[this.g].d();
    this.e[this.g].a(str);
    a(cy1);
    return i;
  }
  
  public final int a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2) {
    m m = null;
    try {
      if (this.z == 2)
        cx.a(bn.u, j.a(cx.c(paramString1) + " " + bn.M, r.c), j.a(cx.d(paramString2), r.c), 4); 
      if (paramString1.equals(paramString2))
        return 0; 
      if (paramBoolean2 && !c(cx.d(paramString2)))
        return 4; 
      m = new m();
      if (!paramString1.toLowerCase().equals(paramString2.toLowerCase())) {
        m.a(paramString2);
        if (m.p()) {
          if (!paramBoolean1) {
            m.d();
            return 2;
          } 
          m.o();
        } 
        m.d();
      } 
      m.a(paramString1);
      if (!m.k()) {
        m.d();
        return 1;
      } 
      boolean bool = m.b(paramString2);
      m.d();
      if (!bool) {
        int i;
        if ((i = a(paramString1, paramString2, paramBoolean1)) != 0)
          return i; 
        m.a(paramString1);
        m.o();
        m.d();
      } 
    } catch (Exception exception) {
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception1) {}
      cx.a(bn.eq, exception.toString() + " " + bn.t + paramString1, Display.getDisplay((MIDlet)MiniCommander.a).getCurrent());
      return -1;
    } 
    return 0;
  }
  
  public final void f() {
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    int i = u();
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0) {
      this.z = 5;
      this.e[this.f].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else {
        s.a(bn.o, bn.r, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  public static void a(cy paramcy) {
    String str1 = paramcy.b();
    int i = paramcy.k;
    Vector vector = paramcy.E;
    cb cb = paramcy.c();
    boolean bool = false;
    if (cb.c == true) {
      int j;
      for (j = i; j < vector.size(); j++) {
        if (!(cb = vector.elementAt(j)).c) {
          str1 = cb.d;
          break;
        } 
      } 
      if (j == vector.size())
        bool = true; 
    } 
    paramcy.d();
    if (bool && vector.size() > 1)
      str1 = cx.a(vector, vector.size() - 1); 
    String str2 = "";
    for (byte b = 0; b < paramcy.E.size(); b++)
      str2 = str2 + ((cb)paramcy.E.elementAt(b)).d + "\r\n"; 
    paramcy.a(str1);
  }
  
  private int u() {
    int i = 0;
    cy cy1 = this.e[this.f];
    cy cy2 = this.e[this.g];
    Vector vector = cy1.f();
    cb cb = null;
    for (byte b = 0; b < vector.size() && !this.x[0]; b++) {
      cb = vector.elementAt(b);
      String str = cx.a(vector, b);
      if ((i = a(str, true)) == 0) {
        cb.b = false;
        cb.c = true;
      } else {
        if (i == -1 || i == 1)
          break; 
        i = 0;
      } 
    } 
    a(cy1);
    if (cy1.s.compareTo(cy2.s) == 0 && cy1.o == cy2.o) {
      String str = cy2.b();
      int j = cy2.k;
      cy2.d();
      if (cy2.a(str) == -1 && cy2.E.size() > 1) {
        if (j < cy2.E.size()) {
          str = cx.a(cy2.E, j);
        } else {
          str = cx.a(cy2.E, cy2.E.size() - 1);
        } 
        cy2.a(str);
      } 
    } 
    return i;
  }
  
  private int a(String paramString, boolean paramBoolean) {
    m m = null;
    try {
      boolean bool = false;
      cx.a(bn.v, j.a(paramString, r.c), "", 4);
      (m = new m()).a(paramString);
      if (m.f()) {
        m.d();
        bool = m.a(paramString, null, this.x);
      } else {
        if (!m.k())
          return 1; 
        bool = m.o();
        m.d();
      } 
      if (!bool)
        return -1; 
    } catch (Exception exception) {
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception1) {}
      if (paramBoolean)
        cx.a(bn.eq, exception.toString() + " " + bn.t + paramString, (Displayable)this); 
      return -1;
    } 
    return 0;
  }
  
  private static int d(String paramString) {
    m m = null;
    try {
      m = new m();
      if (!paramString.endsWith("/"))
        paramString = paramString + "/"; 
      m.a(paramString, 3);
      if (m.p()) {
        m.d();
        return 2;
      } 
      m.q();
      m.f();
      m.d();
    } catch (Error error) {
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception) {}
      return -1;
    } catch (Exception exception) {
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception1) {}
      return -1;
    } 
    return 0;
  }
  
  public final void e(int paramInt) {
    if (x.N && paramInt == -1)
      i.fillRect(0, 0, cx.a(this), cx.b(this)); 
    if (paramInt != -1) {
      i.drawImage((this.e[paramInt]).D, (this.e[paramInt]).a, (this.e[paramInt]).b, 20);
    } else {
      i.drawImage((this.e[this.f]).D, (this.e[this.f]).a, (this.e[this.f]).b, 20);
    } 
    if (x.g != 2 && paramInt == -1)
      i.drawImage((this.e[this.g]).D, (this.e[this.g]).a, (this.e[this.g]).b, 20); 
    if (x.N && paramInt == -1)
      a(i); 
  }
  
  public final void a(String paramString) {
    this.e[this.f].a(paramString);
    this.e[this.f].e();
    e(this.f);
    repaint();
  }
  
  public final void g() {
    if (x.e == 5) {
      j.a();
      return;
    } 
    j.a("/img/font" + String.valueOf(x.e + 1) + ".png");
  }
  
  public final void h() {
    i = null;
    h = null;
    r = null;
    s = null;
    System.gc();
    if (x.N)
      x.p = 0; 
    h = Image.createImage(cx.a(this), cx.b(this));
    i = h.getGraphics();
    if (x.N) {
      l = Font.getFont(32, 1, 0);
    } else {
      l = null;
    } 
    int i = cx.b(this);
    if (x.N)
      i -= l.getHeight() + 2; 
    (this.e[0]).l = j;
    (this.e[1]).l = j;
    (this.e[0]).a = 0;
    (this.e[0]).b = 0;
    if (x.g == 3) {
      o();
    } else if (x.g == 2) {
      (this.e[1]).a = 0;
      (this.e[1]).b = 0;
      this.e[0].a(cx.a(this), i);
      this.e[1].a(cx.a(this), i);
    } else if (x.g == 1) {
      (this.e[1]).a = 0;
      (this.e[1]).b = i / 2;
      this.e[0].a(cx.a(this), i / 2);
      this.e[1].a(cx.a(this), i / 2);
    } else {
      (this.e[1]).a = cx.a(this) / 2;
      (this.e[1]).b = 0;
      this.e[0].a(cx.a(this) / 2, i);
      this.e[1].a(cx.a(this) / 2, i);
    } 
    r = new av(i, j);
    s = new av(i, j);
    s.a = 8388608;
    s.b = 16777215;
  }
  
  public final void a(o paramo) {
    this.z = 15;
    this.y = true;
    this.x[0] = false;
    this.e[this.f].a(paramo);
    this.y = false;
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  public final void i() {
    this.z = 16;
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    int i = v();
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 2) {
        s.a(bn.C, bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else if (i == 4) {
        s.a(bn.z, bn.A, 0);
      } else {
        s.a(bn.o, bn.p, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private static void a(cz paramcz, String paramString, Vector paramVector, boolean paramBoolean) {
    try {
      Vector vector = new Vector();
      paramcz.a(paramString);
      paramcz.a(vector, paramString);
      for (byte b = 0; b < vector.size(); b++) {
        cb cb;
        if ((cb = vector.elementAt(b)).d.endsWith("/")) {
          a(paramcz, cb.d, paramVector, paramBoolean);
          if (paramBoolean) {
            cb cb1;
            (cb1 = new cb()).d = cb.d;
            cb1.f = cb.f;
            cb1.a = cb.a;
            paramVector.addElement(cb1);
          } 
        } else {
          cb cb1;
          (cb1 = new cb()).d = cb.d;
          cb1.f = cb.f;
          cb1.a = cb.a;
          paramVector.addElement(cb1);
        } 
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private int v() {
    try {
      (this.e[this.f]).v.a('I');
    } catch (cp cp) {
    
    } catch (IOException iOException) {}
    int i = 0;
    Vector vector = this.e[this.f].f();
    cb cb = null;
    this.m.removeAllElements();
    Vector vector1 = new Vector();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    for (byte b = 0; b < vector.size(); b++) {
      String str1;
      if ((str1 = (cb = vector.elementAt(b)).d).endsWith("/")) {
        vector1.removeAllElements();
        cx.a(bn.el, bn.em, j.a(str1, r.c), 0);
        a((this.e[this.f]).v, str1, vector1, true);
        if (vector1.size() == 0) {
          String str2 = str1.substring((this.e[this.f]).w.length(), str1.length());
          str2 = (this.e[this.g]).s + str2;
          if (!c(str2)) {
            i = 4;
            break;
          } 
        } else {
          for (byte b1 = 0; b1 < vector1.size() && !this.x[0]; b1++) {
            String str2 = (str1 = ((cb)vector1.elementAt(b1)).d).substring((this.e[this.f]).w.length(), str1.length());
            str2 = (this.e[this.g]).s + str2;
            if (!str1.equals(str2))
              if (str1.endsWith("/")) {
                if (!c(str2)) {
                  i = 4;
                  break;
                } 
              } else {
                while (true) {
                  i = a(str1, str2, cx.b(vector1, b1), (bool3 || bool1));
                  bool3 = false;
                  if (i != 2)
                    break; 
                  if (bool2) {
                    i = 0;
                    break;
                  } 
                  int j;
                  if ((j = b(str1)) == 48) {
                    i = 0;
                    this.x[0] = true;
                    break;
                  } 
                  if (j == 49) {
                    bool3 = true;
                    continue;
                  } 
                  if (j == 50) {
                    bool1 = true;
                    continue;
                  } 
                  if (j == 51) {
                    i = 0;
                    break;
                  } 
                  if (j == 52) {
                    bool2 = true;
                    i = 0;
                    break;
                  } 
                } 
                if (this.x[0]) {
                  i = 0;
                  break;
                } 
                if (i != 0)
                  break; 
              }  
          } 
        } 
        if (this.x[0] || i != 0)
          break; 
      } else {
        if (this.x[0])
          break; 
        String str2 = (str1 = cx.a(vector, b)).substring((this.e[this.f]).w.length(), str1.length());
        str2 = (this.e[this.g]).s + str2;
        if (!str1.equals(str2)) {
          while (true) {
            i = a(str1, str2, cx.b(vector, b), (bool3 || bool1));
            bool3 = false;
            if (i != 2)
              break; 
            if (bool2) {
              i = 0;
              break;
            } 
            int j;
            if ((j = b(str1)) == 48) {
              i = 0;
              this.x[0] = true;
              break;
            } 
            if (j == 49) {
              bool3 = true;
              continue;
            } 
            if (j == 50) {
              bool1 = true;
              continue;
            } 
            if (j == 51) {
              i = 0;
              break;
            } 
            if (j == 52) {
              bool2 = true;
              i = 0;
              break;
            } 
          } 
          if (this.x[0]) {
            i = 0;
            break;
          } 
          if (i != 0)
            break; 
        } 
      } 
      cb.b = false;
    } 
    String str = this.e[this.g].b();
    this.e[this.g].d();
    this.e[this.g].a(str);
    return i;
  }
  
  private int a(String paramString1, String paramString2, long paramLong, boolean paramBoolean) {
    cx.a(bn.ei, j.a(paramString1, r.c), "", 0);
    if (!c(cx.d(paramString2)))
      return 4; 
    m m = new m();
    DataOutputStream dataOutputStream = null;
    try {
      m.a(paramString2);
      if (m.p()) {
        if (!paramBoolean) {
          m.d();
          return 2;
        } 
        if (x.K && m.j() - m.a() < paramLong) {
          m.d();
          return 3;
        } 
        m.o();
        m.d();
        m.a(paramString2);
      } 
      if (x.K && m.j() < paramLong) {
        m.d();
        return 3;
      } 
      m.n();
      m.b(true);
      m.c(true);
      m.a(false);
      dataOutputStream = m.c();
      try {
        (this.e[this.f]).v.a(dataOutputStream, paramString1, paramLong, this);
      } catch (cp cp) {}
      dataOutputStream.close();
      if (this.x[0])
        m.o(); 
      m.d();
      m = null;
      return this.x[0] ? 5 : 0;
    } catch (Exception exception) {
      try {
        if (dataOutputStream != null)
          dataOutputStream.close(); 
      } catch (Exception exception1) {}
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception1) {}
      cx.a(bn.eq, exception.toString() + bn.t + paramString1, (Displayable)this);
      return -1;
    } 
  }
  
  private boolean a(cz paramcz, String paramString) {
    for (byte b = 0; b < this.m.size(); b++) {
      if (((String)this.m.elementAt(b)).equals(paramString))
        return true; 
    } 
    try {
      paramcz.a(paramString);
      this.m.addElement(new String(paramString));
      return true;
    } catch (cp cp) {
      String str;
      if ((str = cx.e(paramString)) == null)
        return true; 
      if (str.length() == 0)
        return true; 
      if (!a(paramcz, str))
        return false; 
      try {
        paramcz.c(paramString);
      } catch (cp cp1) {
        return false;
      } 
      this.m.addElement(new String(paramString));
      return true;
    } catch (Exception exception) {
    
    } catch (Error error) {}
    return false;
  }
  
  public final void c(boolean paramBoolean) {
    this.z = 17;
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    int i = e(paramBoolean);
    this.y = false;
    this.m.removeAllElements();
    System.gc();
    long l2 = System.currentTimeMillis();
    a(l1, l2, i);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 2) {
        s.a(bn.C, bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else if (i == 4) {
        s.a(bn.z, bn.A, 0);
      } else {
        s.a(bn.o, bn.p, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int e(boolean paramBoolean) {
    try {
      (this.e[this.g]).v.a('I');
    } catch (cp cp) {
    
    } catch (IOException iOException) {}
    int i = 0;
    Vector vector = this.e[this.f].f();
    cb cb = null;
    this.m.removeAllElements();
    Vector vector1 = new Vector();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramBoolean) {
      bool1 = true;
      bool3 = true;
    } 
    for (byte b = 0; b < vector.size(); b++) {
      String str1;
      if ((str1 = (cb = vector.elementAt(b)).d).endsWith("/")) {
        vector1.removeAllElements();
        a(str1, vector1, true);
        if (vector1.size() == 0) {
          String str2 = str1.substring((this.e[this.f]).s.length(), str1.length());
          if (!(str2 = (this.e[this.g]).w + str2).startsWith("/"))
            str2 = "/" + str2; 
          if (!a((this.e[this.g]).v, str2)) {
            i = 4;
            break;
          } 
        } else {
          for (byte b1 = 0; b1 < vector1.size() && !this.x[0]; b1++) {
            String str2 = (str1 = vector1.elementAt(b1)).substring((this.e[this.f]).s.length(), str1.length());
            if (!(str2 = (this.e[this.g]).w + str2).startsWith("/"))
              str2 = "/" + str2; 
            if (!str1.equals(str2))
              if (str1.endsWith("/")) {
                if (!a((this.e[this.g]).v, str2)) {
                  i = 4;
                  break;
                } 
              } else {
                while (true) {
                  i = b(str1, str2, (bool3 || bool1));
                  bool3 = false;
                  if (i != 2)
                    break; 
                  if (bool2) {
                    i = 0;
                    break;
                  } 
                  int j;
                  if ((j = b(str1)) == 48) {
                    i = 0;
                    this.x[0] = true;
                    break;
                  } 
                  if (j == 49) {
                    bool3 = true;
                    continue;
                  } 
                  if (j == 50) {
                    bool1 = true;
                    continue;
                  } 
                  if (j == 51) {
                    i = 0;
                    break;
                  } 
                  if (j == 52) {
                    bool2 = true;
                    i = 0;
                    break;
                  } 
                } 
                if (this.x[0]) {
                  i = 0;
                  break;
                } 
                if (i != 0)
                  break; 
              }  
          } 
        } 
        if (this.x[0] || i != 0)
          break; 
      } else {
        if (this.x[0])
          break; 
        String str2 = (str1 = cx.a(vector, b)).substring((this.e[this.f]).s.length(), str1.length());
        str2 = (this.e[this.g]).w + str2;
        if (!str1.equals(str2)) {
          while (true) {
            i = b(str1, str2, (bool3 || bool1));
            bool3 = false;
            if (i != 2)
              break; 
            if (bool2) {
              i = 0;
              break;
            } 
            int j;
            if ((j = b(str1)) == 48) {
              i = 0;
              this.x[0] = true;
              break;
            } 
            if (j == 49) {
              bool3 = true;
              continue;
            } 
            if (j == 50) {
              bool1 = true;
              continue;
            } 
            if (j == 51) {
              i = 0;
              break;
            } 
            if (j == 52) {
              bool2 = true;
              i = 0;
              break;
            } 
          } 
          if (this.x[0]) {
            i = 0;
            break;
          } 
          if (i != 0)
            break; 
        } 
      } 
      cb.b = false;
    } 
    String str = this.e[this.g].b();
    this.e[this.g].d();
    this.e[this.g].a(str);
    return i;
  }
  
  private int b(String paramString1, String paramString2, boolean paramBoolean) {
    cx.a(bn.ek, j.a(paramString2, r.c), "", 0);
    cz cz = (this.e[this.g]).v;
    m m = new m();
    InputStream inputStream = null;
    try {
      if (!paramBoolean) {
        String str = cx.d(paramString2);
        boolean bool = false;
        byte b;
        for (b = 0; b < this.m.size(); b++) {
          if (((String)this.m.elementAt(b)).equals(str)) {
            bool = true;
            break;
          } 
        } 
        if (!bool) {
          Vector vector = new Vector();
          try {
            cz.a(str);
            cz.a(vector, str);
            for (byte b1 = 0; b1 < vector.size(); b1++)
              this.m.addElement(new String(((cb)vector.elementAt(b1)).d)); 
          } catch (Exception exception) {}
        } 
        for (b = 0; b < this.m.size(); b++) {
          if (((String)this.m.elementAt(b)).equals(paramString2))
            return 2; 
        } 
      } 
      if (!a(cz, cx.d(paramString2)))
        return 4; 
      m.a(paramString1, 1);
      inputStream = m.g();
      cz.a(inputStream, paramString2, m.a(), this);
      inputStream.close();
      m.d();
      return this.x[0] ? 5 : 0;
    } catch (Exception exception) {
      try {
        if (inputStream != null)
          inputStream.close(); 
      } catch (Exception exception1) {}
      try {
        m.d();
      } catch (Exception exception1) {}
      cx.a(bn.eq, exception.toString(), (Displayable)this);
      return -1;
    } 
  }
  
  public final void j() {
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    int i = w();
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    if (i != 0) {
      this.z = 5;
      this.e[this.f].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else {
        s.a(bn.o, bn.r, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int w() {
    int i = 0;
    cy cy1;
    Vector vector = (cy1 = this.e[this.f]).f();
    cb cb = null;
    for (byte b = 0; b < vector.size() && !this.x[0]; b++) {
      cb = vector.elementAt(b);
      String str = cx.a(vector, b);
      if ((i = b(cy1.v, str)) == 0) {
        cb.b = false;
        cb.c = true;
      } else {
        if (i == -1 || i == 1)
          break; 
        i = 0;
      } 
    } 
    a(cy1);
    return i;
  }
  
  private int b(cz paramcz, String paramString) {
    try {
      int i = 0;
      cx.a(bn.v, j.a(paramString, r.c), "", 4);
      if (paramString.endsWith("/")) {
        if ((i = c(paramcz, paramString)) != 0)
          return i; 
      } else {
        if (!paramString.startsWith("/"))
          paramString = "/" + paramString; 
        paramcz.b(paramString);
      } 
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString() + " " + bn.t + paramString, (Displayable)this);
      return -1;
    } 
    return 0;
  }
  
  private int c(cz paramcz, String paramString) {
    try {
      int i = 0;
      Vector vector = new Vector();
      paramcz.a(paramString);
      if (this.x[0])
        return 5; 
      paramcz.a(vector, paramString);
      for (byte b = 0; b < vector.size(); b++) {
        if (this.x[0])
          return 5; 
        cb cb;
        String str;
        if (!(str = (cb = vector.elementAt(b)).d).startsWith("/"))
          str = "/" + str; 
        cx.a(bn.v, j.a(cb.d, r.c), "", 4);
        if (cb.a == 0) {
          if ((i = c(paramcz, str)) != 0)
            return i; 
        } else {
          paramcz.b(str);
        } 
      } 
      cx.a(bn.v, j.a(paramString, r.c), "", 4);
      if (!paramString.startsWith("/"))
        paramString = "/" + paramString; 
      paramcz.d(paramString);
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString() + " " + bn.t + paramString, (Displayable)this);
      return -1;
    } 
    return 0;
  }
  
  public final void a(ag paramag) {
    this.z = 19;
    this.y = true;
    this.x[0] = false;
    this.e[this.f].a(paramag);
    this.y = false;
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  public final void k() {
    this.z = 20;
    this.y = true;
    this.x[0] = false;
    this.m.removeAllElements();
    long l1 = System.currentTimeMillis();
    boolean[] arrayOfBoolean1 = new boolean[1];
    boolean[] arrayOfBoolean2 = new boolean[1];
    int i = a((this.e[this.f]).y, (this.e[this.g]).s, this.e[this.f].f(), arrayOfBoolean1, arrayOfBoolean2);
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    String str = this.e[this.g].b();
    this.e[this.g].d();
    this.e[this.g].a(str);
    e(-1);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 2) {
        s.a(bn.C, bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else if (i == 4) {
        s.a(bn.z, bn.A, 0);
      } else if (i == 19) {
        s.a(bn.ar, bn.em, 0);
      } else {
        s.a(bn.o, bn.p, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int a(String paramString1, String paramString2, Vector paramVector, boolean[] paramArrayOfboolean1, boolean[] paramArrayOfboolean2) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual size : ()I
    //   4: istore #6
    //   6: iconst_0
    //   7: istore #9
    //   9: iconst_0
    //   10: istore #10
    //   12: iload #10
    //   14: iload #6
    //   16: if_icmpge -> 384
    //   19: aload_3
    //   20: iload #10
    //   22: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   25: checkcast mc/cb
    //   28: dup
    //   29: astore #7
    //   31: getfield a : I
    //   34: iconst_1
    //   35: if_icmpne -> 378
    //   38: new java/lang/StringBuffer
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: aload_2
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   49: aload #7
    //   51: getfield d : Ljava/lang/String;
    //   54: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: astore #8
    //   65: new mc/m
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: astore #11
    //   74: aconst_null
    //   75: astore #12
    //   77: aload #11
    //   79: aload #8
    //   81: invokevirtual a : (Ljava/lang/String;)Z
    //   84: pop
    //   85: aload #11
    //   87: invokevirtual p : ()Z
    //   90: ifeq -> 207
    //   93: aload #5
    //   95: iconst_0
    //   96: baload
    //   97: ifeq -> 108
    //   100: aload #11
    //   102: invokevirtual d : ()V
    //   105: goto -> 378
    //   108: aload #4
    //   110: iconst_0
    //   111: baload
    //   112: ifne -> 188
    //   115: aload_0
    //   116: aload #8
    //   118: invokespecial b : (Ljava/lang/String;)I
    //   121: dup
    //   122: istore #13
    //   124: bipush #48
    //   126: if_icmpeq -> 143
    //   129: iload #13
    //   131: bipush #51
    //   133: if_icmpeq -> 143
    //   136: iload #13
    //   138: bipush #52
    //   140: if_icmpne -> 176
    //   143: aload #11
    //   145: invokevirtual d : ()V
    //   148: iload #13
    //   150: bipush #48
    //   152: if_icmpne -> 161
    //   155: iconst_5
    //   156: istore #9
    //   158: goto -> 384
    //   161: iload #13
    //   163: bipush #52
    //   165: if_icmpne -> 173
    //   168: aload #5
    //   170: iconst_0
    //   171: iconst_1
    //   172: bastore
    //   173: goto -> 378
    //   176: iload #13
    //   178: bipush #50
    //   180: if_icmpne -> 188
    //   183: aload #4
    //   185: iconst_0
    //   186: iconst_1
    //   187: bastore
    //   188: aload #11
    //   190: invokevirtual o : ()Z
    //   193: pop
    //   194: aload #11
    //   196: invokevirtual d : ()V
    //   199: aload #11
    //   201: aload #8
    //   203: invokevirtual a : (Ljava/lang/String;)Z
    //   206: pop
    //   207: aload #11
    //   209: invokevirtual n : ()Z
    //   212: pop
    //   213: aload #11
    //   215: invokevirtual c : ()Ljava/io/DataOutputStream;
    //   218: astore #12
    //   220: aload_0
    //   221: getfield e : [Lmc/cy;
    //   224: aload_0
    //   225: getfield f : I
    //   228: aaload
    //   229: getfield x : Lmc/ag;
    //   232: aload #7
    //   234: getfield d : Ljava/lang/String;
    //   237: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   240: aload #12
    //   242: aload #7
    //   244: getfield f : J
    //   247: invokevirtual a : (Ljava/lang/String;Ljava/io/OutputStream;J)I
    //   250: istore #9
    //   252: aload #12
    //   254: invokevirtual close : ()V
    //   257: aload_0
    //   258: getfield x : [Z
    //   261: iconst_0
    //   262: baload
    //   263: ifne -> 272
    //   266: iload #9
    //   268: iconst_5
    //   269: if_icmpne -> 281
    //   272: aload #11
    //   274: invokevirtual o : ()Z
    //   277: pop
    //   278: goto -> 287
    //   281: aload #7
    //   283: iconst_0
    //   284: putfield b : Z
    //   287: aload #11
    //   289: invokevirtual d : ()V
    //   292: iload #9
    //   294: ifeq -> 300
    //   297: goto -> 384
    //   300: goto -> 378
    //   303: astore #13
    //   305: aload #12
    //   307: ifnull -> 315
    //   310: aload #12
    //   312: invokevirtual close : ()V
    //   315: goto -> 319
    //   318: pop
    //   319: aload #11
    //   321: invokevirtual d : ()V
    //   324: goto -> 328
    //   327: pop
    //   328: getstatic mc/bn.eq : Ljava/lang/String;
    //   331: new java/lang/StringBuffer
    //   334: dup
    //   335: invokespecial <init> : ()V
    //   338: aload #13
    //   340: invokevirtual toString : ()Ljava/lang/String;
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   346: ldc_w ' : '
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   352: aload #13
    //   354: invokevirtual getMessage : ()Ljava/lang/String;
    //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   360: invokevirtual toString : ()Ljava/lang/String;
    //   363: aload_0
    //   364: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljavax/microedition/lcdui/Displayable;)V
    //   367: iload #9
    //   369: ifne -> 375
    //   372: iconst_m1
    //   373: istore #9
    //   375: goto -> 384
    //   378: iinc #10, 1
    //   381: goto -> 12
    //   384: iload #9
    //   386: ifne -> 794
    //   389: iconst_0
    //   390: istore #10
    //   392: iload #10
    //   394: iload #6
    //   396: if_icmpge -> 794
    //   399: aload_3
    //   400: iload #10
    //   402: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   405: checkcast mc/cb
    //   408: dup
    //   409: astore #7
    //   411: getfield a : I
    //   414: ifne -> 774
    //   417: aload #7
    //   419: getfield d : Ljava/lang/String;
    //   422: invokestatic j : (Ljava/lang/String;)Ljava/lang/String;
    //   425: astore #8
    //   427: new java/lang/StringBuffer
    //   430: dup
    //   431: invokespecial <init> : ()V
    //   434: aload_2
    //   435: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   438: aload #8
    //   440: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   443: ldc_w '/'
    //   446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   449: invokevirtual toString : ()Ljava/lang/String;
    //   452: astore_2
    //   453: aload_0
    //   454: aload_2
    //   455: invokespecial c : (Ljava/lang/String;)Z
    //   458: ifeq -> 771
    //   461: getstatic mc/bn.H : Ljava/lang/String;
    //   464: getstatic mc/aw.j : Lmc/am;
    //   467: new java/lang/StringBuffer
    //   470: dup
    //   471: invokespecial <init> : ()V
    //   474: aload_1
    //   475: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   478: ldc_w '/'
    //   481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   484: aload #8
    //   486: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   489: invokevirtual toString : ()Ljava/lang/String;
    //   492: getstatic mc/aw.r : Lmc/av;
    //   495: getfield c : I
    //   498: invokevirtual a : (Ljava/lang/String;I)Ljava/lang/String;
    //   501: ldc_w ''
    //   504: iconst_0
    //   505: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   508: aload_0
    //   509: getfield e : [Lmc/cy;
    //   512: aload_0
    //   513: getfield f : I
    //   516: aaload
    //   517: getfield x : Lmc/ag;
    //   520: aload #8
    //   522: iconst_0
    //   523: iconst_0
    //   524: invokevirtual a : (Ljava/lang/String;ZZ)I
    //   527: sipush #160
    //   530: if_icmpne -> 764
    //   533: new java/util/Vector
    //   536: dup
    //   537: invokespecial <init> : ()V
    //   540: astore #11
    //   542: new java/util/Vector
    //   545: dup
    //   546: invokespecial <init> : ()V
    //   549: astore #12
    //   551: getstatic mc/bn.I : Ljava/lang/String;
    //   554: getstatic mc/bn.J : Ljava/lang/String;
    //   557: ldc_w ''
    //   560: iconst_0
    //   561: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   564: aload_0
    //   565: getfield e : [Lmc/cy;
    //   568: aload_0
    //   569: getfield f : I
    //   572: aaload
    //   573: getfield x : Lmc/ag;
    //   576: aload #11
    //   578: aload #12
    //   580: new java/lang/StringBuffer
    //   583: dup
    //   584: invokespecial <init> : ()V
    //   587: aload_1
    //   588: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   591: ldc_w '/'
    //   594: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   597: aload #8
    //   599: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   602: ldc_w '/'
    //   605: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   608: invokevirtual toString : ()Ljava/lang/String;
    //   611: invokevirtual a : (Ljava/util/Vector;Ljava/util/Vector;Ljava/lang/String;)I
    //   614: dup
    //   615: istore #13
    //   617: sipush #160
    //   620: if_icmpeq -> 631
    //   623: iload #13
    //   625: sipush #160
    //   628: if_icmpne -> 703
    //   631: iconst_0
    //   632: istore #14
    //   634: iload #14
    //   636: aload #12
    //   638: invokevirtual size : ()I
    //   641: if_icmpge -> 665
    //   644: aload #11
    //   646: aload #12
    //   648: iload #14
    //   650: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   653: checkcast mc/cb
    //   656: invokevirtual addElement : (Ljava/lang/Object;)V
    //   659: iinc #14, 1
    //   662: goto -> 634
    //   665: aload_0
    //   666: new java/lang/StringBuffer
    //   669: dup
    //   670: invokespecial <init> : ()V
    //   673: aload_1
    //   674: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   677: ldc_w '/'
    //   680: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   683: aload #8
    //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   688: invokevirtual toString : ()Ljava/lang/String;
    //   691: aload_2
    //   692: aload #11
    //   694: aload #4
    //   696: aload #5
    //   698: invokespecial a : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;[Z[Z)I
    //   701: istore #9
    //   703: getstatic mc/bn.H : Ljava/lang/String;
    //   706: getstatic mc/aw.j : Lmc/am;
    //   709: aload_1
    //   710: getstatic mc/aw.r : Lmc/av;
    //   713: getfield c : I
    //   716: invokevirtual a : (Ljava/lang/String;I)Ljava/lang/String;
    //   719: ldc_w ''
    //   722: iconst_0
    //   723: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   726: aload_0
    //   727: getfield e : [Lmc/cy;
    //   730: aload_0
    //   731: getfield f : I
    //   734: aaload
    //   735: getfield x : Lmc/ag;
    //   738: ldc_w ''
    //   741: iconst_1
    //   742: iconst_0
    //   743: invokevirtual a : (Ljava/lang/String;ZZ)I
    //   746: sipush #160
    //   749: if_icmpeq -> 761
    //   752: iload #9
    //   754: ifne -> 761
    //   757: bipush #19
    //   759: istore #9
    //   761: goto -> 774
    //   764: bipush #19
    //   766: istore #9
    //   768: goto -> 774
    //   771: iconst_4
    //   772: istore #9
    //   774: iload #9
    //   776: ifeq -> 782
    //   779: goto -> 794
    //   782: aload #7
    //   784: iconst_0
    //   785: putfield b : Z
    //   788: iinc #10, 1
    //   791: goto -> 392
    //   794: iload #9
    //   796: ireturn
    // Exception table:
    //   from	to	target	type
    //   77	105	303	java/lang/Exception
    //   108	158	303	java/lang/Exception
    //   161	173	303	java/lang/Exception
    //   176	297	303	java/lang/Exception
    //   305	315	318	java/lang/Exception
    //   319	324	327	java/lang/Exception
  }
  
  public final void l() {
    this.z = 21;
    this.y = true;
    this.x[0] = false;
    this.m.removeAllElements();
    long l1 = System.currentTimeMillis();
    boolean[] arrayOfBoolean1 = new boolean[1];
    boolean[] arrayOfBoolean2 = new boolean[1];
    int i = a((this.e[this.g]).y, this.e[this.f].f(), arrayOfBoolean1, arrayOfBoolean2);
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    String str = this.e[this.g].b();
    this.e[this.g].d();
    this.e[this.g].a(str);
    e(-1);
    if (i != 0 && i != 5) {
      this.z = 5;
      this.e[this.f].e();
      this.e[this.g].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 2) {
        s.a(bn.C, bn.bR, 0);
      } else if (i == 3) {
        s.a(bn.l, bn.m, bn.n, 0);
      } else if (i == 4) {
        s.a(bn.z, bn.A, 0);
      } else if (i == 19) {
        s.a(bn.ar, bn.em, 0);
      } else {
        s.a(bn.o, bn.p, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int a(String paramString, Vector paramVector, boolean[] paramArrayOfboolean1, boolean[] paramArrayOfboolean2) {
    int i = paramVector.size();
    int j = 0;
    m m = null;
    Vector vector1 = new Vector();
    Vector vector2 = new Vector();
    cx.a(bn.I, bn.J, j.a(paramString, r.c), 0);
    if (!paramArrayOfboolean1[0] && ((j = (this.e[this.g]).x.a(vector1, vector2, paramString)) == 160 || j == 144))
      for (byte b = 0; b < vector2.size(); b++)
        vector1.addElement(vector2.elementAt(b));  
    if (j == 160 || j == 144) {
      j = 0;
      m = new m();
      for (byte b = 0; b < i; b++) {
        cb cb;
        if ((cb = paramVector.elementAt(b)).a == 1) {
          String str = paramString + cx.c(cb.d);
          InputStream inputStream = null;
          try {
            int k;
            if ((k = cx.a(vector1, str)) != -1) {
              if (paramArrayOfboolean2[0])
                continue; 
              if (!paramArrayOfboolean1[0]) {
                int n;
                if ((n = b(str)) == 48 || n == 51 || n == 52) {
                  if (n == 48) {
                    j = 5;
                    break;
                  } 
                  if (n == 52)
                    paramArrayOfboolean2[0] = true; 
                } else {
                  if (n == 50)
                    paramArrayOfboolean1[0] = true; 
                  m.a(cb.d, 1);
                  inputStream = m.g();
                  j = (this.e[this.g]).x.a(cx.c(cb.d), inputStream, m.a());
                  inputStream.close();
                  m.d();
                } 
                continue;
              } 
            } 
            m.a(cb.d, 1);
            inputStream = m.g();
            j = (this.e[this.g]).x.a(cx.c(cb.d), inputStream, m.a());
            inputStream.close();
            m.d();
          } catch (Exception exception) {
            try {
              if (inputStream != null)
                inputStream.close(); 
            } catch (Exception exception1) {}
            try {
              m.d();
            } catch (Exception exception1) {}
            cx.a(bn.eq, exception.toString() + " : " + exception.getMessage(), (Displayable)this);
            if (j == 0)
              j = -1; 
            break;
          } 
        } 
        continue;
      } 
    } 
    if (j == 0)
      for (byte b = 0; b < i; b++) {
        cb cb;
        if ((cb = paramVector.elementAt(b)).a == 0) {
          String str = cx.j(cb.d);
          paramString = paramString + str + "/";
          cx.a(bn.H, j.a(paramString, r.c), "", 0);
          if ((this.e[this.g]).x.a(str, false, true) == 160) {
            Vector vector = new Vector();
            m = new m();
            String[] arrayOfString = null;
            try {
              m.a(cb.d, 1);
              arrayOfString = m.a(cb.d, true);
              m.d();
            } catch (IOException iOException) {}
            if (arrayOfString != null)
              for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
                cb cb1;
                (cb1 = new cb()).d = arrayOfString[b1];
                cb1.a = cb1.d.endsWith("/") ? 0 : 1;
                vector.addElement(cb1);
              }  
            j = a(paramString, vector, paramArrayOfboolean1, paramArrayOfboolean2);
            if ((this.e[this.g]).x.a("", true, false) != 160 && j == 0)
              j = 19; 
          } else {
            j = 4;
          } 
        } 
        if (j != 0)
          break; 
        cb.b = false;
      }  
    return j;
  }
  
  public final void m() {
    this.y = true;
    this.x[0] = false;
    long l1 = System.currentTimeMillis();
    int i = a((this.e[this.f]).y, this.e[this.f].f());
    long l2 = System.currentTimeMillis();
    this.y = false;
    a(l1, l2, i);
    a(this.e[this.f]);
    if (i != 0) {
      this.z = 5;
      this.e[this.f].e();
      if (i == 1) {
        s.a(bn.k, 0);
      } else if (i == 19) {
        s.a(bn.i, bn.as, 0);
      } else if (i == 19) {
        s.a(bn.ar, bn.em, 0);
      } else {
        s.a(bn.o, bn.r, 0);
      } 
      repaint();
      return;
    } 
    this.z = 0;
    this.e[this.f].e();
    this.e[this.g].e();
    e(-1);
    repaint();
  }
  
  private int a(String paramString, Vector paramVector) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : [Lmc/cy;
    //   4: aload_0
    //   5: getfield f : I
    //   8: aaload
    //   9: astore_3
    //   10: iconst_0
    //   11: istore #8
    //   13: aload_2
    //   14: ifnonnull -> 125
    //   17: new java/util/Vector
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore_2
    //   25: new java/util/Vector
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore #9
    //   34: getstatic mc/bn.I : Ljava/lang/String;
    //   37: getstatic mc/bn.J : Ljava/lang/String;
    //   40: getstatic mc/aw.j : Lmc/am;
    //   43: aload_1
    //   44: getstatic mc/aw.r : Lmc/av;
    //   47: getfield c : I
    //   50: invokevirtual a : (Ljava/lang/String;I)Ljava/lang/String;
    //   53: iconst_0
    //   54: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   57: aload_3
    //   58: getfield x : Lmc/ag;
    //   61: aload_2
    //   62: aload #9
    //   64: aload_1
    //   65: invokevirtual a : (Ljava/util/Vector;Ljava/util/Vector;Ljava/lang/String;)I
    //   68: dup
    //   69: istore #10
    //   71: sipush #160
    //   74: if_icmpeq -> 85
    //   77: iload #10
    //   79: sipush #144
    //   82: if_icmpne -> 121
    //   85: iconst_0
    //   86: istore #11
    //   88: iload #11
    //   90: aload #9
    //   92: invokevirtual size : ()I
    //   95: if_icmpge -> 118
    //   98: aload_2
    //   99: aload #9
    //   101: iload #11
    //   103: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   106: checkcast mc/cb
    //   109: invokevirtual addElement : (Ljava/lang/Object;)V
    //   112: iinc #11, 1
    //   115: goto -> 88
    //   118: goto -> 125
    //   121: bipush #19
    //   123: istore #8
    //   125: aload_2
    //   126: invokevirtual size : ()I
    //   129: istore #9
    //   131: iload #8
    //   133: ifne -> 330
    //   136: iconst_0
    //   137: istore #10
    //   139: iload #10
    //   141: iload #9
    //   143: if_icmpge -> 330
    //   146: aload_2
    //   147: iload #10
    //   149: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   152: checkcast mc/cb
    //   155: dup
    //   156: astore #4
    //   158: getfield a : I
    //   161: iconst_1
    //   162: if_icmpne -> 324
    //   165: new java/lang/StringBuffer
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: aload_1
    //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   176: aload #4
    //   178: getfield d : Ljava/lang/String;
    //   181: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   187: invokevirtual toString : ()Ljava/lang/String;
    //   190: pop
    //   191: new mc/m
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: astore #11
    //   200: getstatic mc/bn.v : Ljava/lang/String;
    //   203: getstatic mc/aw.j : Lmc/am;
    //   206: aload #4
    //   208: getfield d : Ljava/lang/String;
    //   211: getstatic mc/aw.r : Lmc/av;
    //   214: getfield c : I
    //   217: invokevirtual a : (Ljava/lang/String;I)Ljava/lang/String;
    //   220: ldc_w ''
    //   223: iconst_0
    //   224: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   227: aload_3
    //   228: getfield x : Lmc/ag;
    //   231: aload #4
    //   233: getfield d : Ljava/lang/String;
    //   236: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   239: invokevirtual a : (Ljava/lang/String;)I
    //   242: dup
    //   243: istore #8
    //   245: ifeq -> 251
    //   248: goto -> 330
    //   251: aload #4
    //   253: iconst_1
    //   254: putfield c : Z
    //   257: goto -> 324
    //   260: astore #13
    //   262: goto -> 265
    //   265: aload #11
    //   267: invokevirtual d : ()V
    //   270: goto -> 274
    //   273: pop
    //   274: getstatic mc/bn.eq : Ljava/lang/String;
    //   277: new java/lang/StringBuffer
    //   280: dup
    //   281: invokespecial <init> : ()V
    //   284: aload #13
    //   286: invokevirtual toString : ()Ljava/lang/String;
    //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   292: ldc_w ' : '
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   298: aload #13
    //   300: invokevirtual getMessage : ()Ljava/lang/String;
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: aload_0
    //   310: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljavax/microedition/lcdui/Displayable;)V
    //   313: iload #8
    //   315: ifne -> 321
    //   318: iconst_m1
    //   319: istore #8
    //   321: goto -> 330
    //   324: iinc #10, 1
    //   327: goto -> 139
    //   330: iload #8
    //   332: ifne -> 545
    //   335: iconst_0
    //   336: istore #10
    //   338: iload #10
    //   340: iload #9
    //   342: if_icmpge -> 545
    //   345: aload_2
    //   346: iload #10
    //   348: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   351: checkcast mc/cb
    //   354: dup
    //   355: astore #4
    //   357: getfield a : I
    //   360: ifne -> 531
    //   363: aload #4
    //   365: getfield d : Ljava/lang/String;
    //   368: invokestatic j : (Ljava/lang/String;)Ljava/lang/String;
    //   371: astore #5
    //   373: new java/lang/StringBuffer
    //   376: dup
    //   377: invokespecial <init> : ()V
    //   380: aload_1
    //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   384: aload #5
    //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   389: ldc_w '/'
    //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   395: invokevirtual toString : ()Ljava/lang/String;
    //   398: astore_1
    //   399: getstatic mc/bn.H : Ljava/lang/String;
    //   402: getstatic mc/aw.j : Lmc/am;
    //   405: aload_1
    //   406: getstatic mc/aw.r : Lmc/av;
    //   409: getfield c : I
    //   412: invokevirtual a : (Ljava/lang/String;I)Ljava/lang/String;
    //   415: ldc_w ''
    //   418: iconst_0
    //   419: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   422: aload_3
    //   423: getfield x : Lmc/ag;
    //   426: aload #5
    //   428: iconst_0
    //   429: iconst_0
    //   430: invokevirtual a : (Ljava/lang/String;ZZ)I
    //   433: iconst_0
    //   434: istore #11
    //   436: sipush #160
    //   439: if_icmpne -> 527
    //   442: aload_0
    //   443: aload_1
    //   444: aconst_null
    //   445: invokespecial a : (Ljava/lang/String;Ljava/util/Vector;)I
    //   448: istore #8
    //   450: aload_3
    //   451: getfield x : Lmc/ag;
    //   454: ldc_w ''
    //   457: iconst_1
    //   458: iconst_0
    //   459: invokevirtual a : (Ljava/lang/String;ZZ)I
    //   462: sipush #160
    //   465: if_icmpeq -> 476
    //   468: iload #8
    //   470: ifne -> 531
    //   473: goto -> 527
    //   476: getstatic mc/bn.v : Ljava/lang/String;
    //   479: getstatic mc/aw.j : Lmc/am;
    //   482: aload #4
    //   484: getfield d : Ljava/lang/String;
    //   487: getstatic mc/aw.r : Lmc/av;
    //   490: getfield c : I
    //   493: invokevirtual a : (Ljava/lang/String;I)Ljava/lang/String;
    //   496: ldc_w ''
    //   499: iconst_0
    //   500: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   503: aload_3
    //   504: getfield x : Lmc/ag;
    //   507: aload #5
    //   509: invokevirtual a : (Ljava/lang/String;)I
    //   512: dup
    //   513: istore #8
    //   515: ifne -> 531
    //   518: aload #4
    //   520: iconst_1
    //   521: putfield c : Z
    //   524: goto -> 531
    //   527: bipush #19
    //   529: istore #8
    //   531: iload #8
    //   533: ifeq -> 539
    //   536: goto -> 545
    //   539: iinc #10, 1
    //   542: goto -> 338
    //   545: iload #8
    //   547: ireturn
    // Exception table:
    //   from	to	target	type
    //   200	248	260	java/lang/Exception
    //   251	257	260	java/lang/Exception
    //   265	270	273	java/lang/Exception
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\aw.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */