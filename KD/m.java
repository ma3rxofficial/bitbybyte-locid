package KD;

import favax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.game.Layer;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;

public final class m extends Canvas implements Runnable, CommandListener {
  public ae a;
  
  private boolean m = false;
  
  private byte n = 0;
  
  public boolean b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  public int i;
  
  private int o;
  
  private int p;
  
  public final String[] j = new String[] { "Свернуть", "Информация", "Плейлист", "Главное меню", "Справка", "О программе", "Выход" };
  
  public boolean k = false;
  
  public t l;
  
  private LayerManager q;
  
  private Sprite r;
  
  private Sprite s;
  
  private Sprite t;
  
  private Sprite u;
  
  private Sprite v;
  
  private Sprite w;
  
  private Sprite x;
  
  private Sprite y;
  
  private boolean z = false;
  
  private e A;
  
  private int B = 0;
  
  private int C = 0;
  
  private String D;
  
  private String E;
  
  private String F;
  
  private String G;
  
  private String H;
  
  private String I;
  
  private String J;
  
  private boolean K = false;
  
  private String L = "Воспр.";
  
  private int M = 0;
  
  private int N = 0;
  
  private int O = 0;
  
  private int P = 0;
  
  private int Q = 0;
  
  private byte R = 0;
  
  private int S = 0;
  
  private int T = 0;
  
  private int U = 0;
  
  private int V = 0;
  
  private int W = 0;
  
  private int Z = 0;
  
  private int aa = 0;
  
  private int ab = 0;
  
  private int ac = 0;
  
  private int ad = 0;
  
  private int ae = 0;
  
  private int af = 0;
  
  private Font ag;
  
  private Font ah;
  
  private Font ai;
  
  private Font aj;
  
  private Font ak;
  
  private List al;
  
  private Command am;
  
  private Command an;
  
  private p ao;
  
  private Form ap;
  
  private ai aq;
  
  public m(ae paramae) {
    setFullScreenMode(true);
    this.a = paramae;
    this.am = new Command("Выбрать", 4, 0);
    this.an = new Command("Назад", 2, 1);
    this.ag = Font.getFont(0, 1, 0);
    this.ah = Font.getFont(0, 1, 8);
    this.ai = Font.getFont(0, 1, 16);
    this.aj = Font.getFont(0, 1, 0);
    this.ak = Font.getFont(0, 0, 0);
    this.l = new t(getHeight(), getWidth());
    e();
    this.V = this.t.getY() - this.ah.getHeight() + 1;
    this.U = this.V;
    this.T = this.l.c + 2;
    this.S = this.l.b - this.l.d - 2;
    this.Z = this.l.c + 2;
    this.ac = this.Z;
    this.ad = this.Z;
    this.W = this.Z;
    this.i = this.l.a - this.l.f - this.ah.getHeight() - 2;
    this.g = this.i;
    this.h = this.T;
    this.f = this.S;
    this.B = this.l.c + 2;
    this.C = this.V - this.A.e - 1;
    this.d = this.B;
    this.e = this.i - this.A.e;
    if (this.C % 2 != 0)
      this.C++; 
    if (this.e % 2 != 0)
      this.e++; 
    int i = this.C - this.l.e - this.l.l - 2;
    int j = this.ai.getHeight() + this.aj.getHeight() + this.ak.getHeight();
    this.ab = this.l.e + this.l.l + (i - j) / 2;
    this.ae = this.ab + this.ai.getHeight();
    this.af = this.ae + this.aj.getHeight();
    this.aa = this.l.e + this.l.l + (i - this.ai.getHeight()) / 2;
    this.c = this.e - 1;
    int k = (this.l.b - this.p) / 2;
    int n;
    if ((n = (this.c - this.o) / 2 - 10) < 0)
      n = 0; 
    if (n % 2 == 0)
      n--; 
    this.y.setPosition(k, n);
    this.t.setFrame(this.a.e.m);
    if (this.a.e.h)
      this.w.setFrame(2); 
    if (this.a.e.g)
      this.v.setFrame(2); 
  }
  
  public final void a() {
    this.k = true;
    setFullScreenMode(true);
    Thread thread;
    (thread = new Thread(this)).start();
  }
  
  public final void b() {
    this.k = false;
  }
  
  private void c() {
    boolean bool = this.b;
    a((this.a.e.d != null));
    if (bool != this.b) {
      repaint();
      return;
    } 
    if (!this.b) {
      repaint();
      return;
    } 
    repaint(0, this.e, this.l.b, this.l.a - this.e);
  }
  
  public final void run() {
    while (this.k) {
      c();
      try {
        Thread.sleep(300L);
      } catch (InterruptedException interruptedException) {}
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.an) {
      this.a.g();
      this.al.deleteAll();
      this.al = null;
      this.ao = null;
      this.ap = null;
      this.aq = null;
      return;
    } 
    if (paramCommand == this.am) {
      byte b;
      if ((b = (byte)this.al.getSelectedIndex()) == 0) {
        this.a.f();
        this.al.deleteAll();
        this.al = null;
        this.ao = null;
        this.a.a.setCurrent(null);
        return;
      } 
      if (b == 1) {
        this.ao = new p(this.a.e.p, this.a.a);
        this.ao.addCommand(this.an);
        this.ao.setCommandListener(this);
        return;
      } 
      if (b == 2) {
        o();
        this.al.deleteAll();
        this.al = null;
        this.ao = null;
        return;
      } 
      if (b == 3) {
        this.a.f();
        this.al.deleteAll();
        this.al = null;
        this.ao = null;
        return;
      } 
      if (b == 4) {
        this.ap = new Form("Справка");
        an an = new an();
        an.getClass();
        an.getClass();
        this.ap.append((Item)new StringItem("Управление проигрывателем:\n", "[Джостик/5]-воспроизведение/пауза\n[Влево/4]-предыдущая дорожка (перемотка назад при удерживании)\n[Вправо/6]-следующая дорожка (перемотка вперед при удерживании)\n[Вверх/2]-увелечение громкости\n[Вниз/8]-уменьшение громкости\n[1]-текущий плейлист\n[3]-выход из проигрывателя\n[7]-вкл/выкл Перемешивание\n[9]-вкл/выкл Повтор\n[0]-главное меню\n[*]-фоновый режим\n[#]-вкл/выкл блокировку клавиатуры (при удерживании)\n"));
        this.ap.addCommand(this.an);
        this.ap.setCommandListener(this);
        this.a.a.setCurrent((Displayable)this.ap);
        return;
      } 
      if (b == 5) {
        this.aq = new ai();
        this.aq.addCommand(this.an);
        this.aq.setCommandListener(this);
        this.a.a.setCurrent((Displayable)this.aq);
        return;
      } 
      if (b == 6) {
        this.a.a.setCurrent((Displayable)this);
        this.al.deleteAll();
        this.al = null;
        this.ao = null;
        this.a.i();
      } 
    } 
  }
  
  private void d() {
    if (this.J != this.a.e.p) {
      String str = this.a.e.r;
      int i = this.ai.stringWidth(str);
      if (this.Z + i > this.l.b - this.l.d) {
        while (this.Z + this.ai.stringWidth(str + "..") >= this.l.b - this.l.d)
          str = str.substring(0, str.length() - 1); 
        str = str + "...";
      } 
      this.F = str;
      str = this.a.e.s;
      i = this.aj.stringWidth(str);
      if (this.ac + i > this.l.b - this.l.d) {
        while (this.ac + this.aj.stringWidth(str + "..") >= this.l.b - this.l.d)
          str = str.substring(0, str.length() - 1); 
        str = str.trim();
        str = str + "...";
      } 
      this.G = str;
      str = this.a.e.t;
      i = this.ak.stringWidth(str);
      if (this.ad + i > this.l.b - this.l.d) {
        while (this.ad + this.ak.stringWidth(str + "..") >= this.l.b - this.l.d)
          str = str.substring(0, str.length() - 1); 
        str = str.trim();
        str = str + "...";
      } 
      this.H = str;
      str = this.a.e.q;
      i = this.ai.stringWidth(str);
      if (this.W + i > this.l.b - this.l.d) {
        while (this.W + this.ai.stringWidth(str + "..") >= this.l.b - this.l.d)
          str = str.substring(0, str.length() - 1); 
        str = str.trim();
        str = str + "...";
      } 
      this.I = str;
      this.J = this.a.e.p;
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    if (!isShown()) {
      this.a.a.flashBacklight(0);
      return;
    } 
    if ((this.b & this.a.e.a()) != 0) {
      this.a.a.flashBacklight(1000);
    } else {
      this.a.a.flashBacklight(0);
    } 
    a((this.a.e.d != null));
    this.x.setVisible(this.z);
    this.q.paint(paramGraphics, 0, 0);
    this.D = this.a.e.k();
    paramGraphics.setColor(70, 94, 116);
    paramGraphics.setFont(this.ah);
    this.E = ((this.a.f.b < this.a.f.c) ? (this.a.f.b + 1) : this.a.f.b) + "/" + this.a.f.c;
    this.A.a(this.a.e.o, this.a.e.n);
    paramGraphics.drawString(this.D, this.S - this.ah.stringWidth(this.D), this.U, 0);
    paramGraphics.drawString(this.E, this.T, this.V, 0);
    d();
    a(paramGraphics);
    paramGraphics.drawString(this.D, this.f - this.ah.stringWidth(this.D), this.g, 0);
    paramGraphics.drawString(this.E, this.h, this.i, 0);
    paramGraphics.drawImage(this.A.a, this.d, !this.b ? this.C : this.e, 0);
    paramGraphics.setFont(this.ag);
    paramGraphics.setColor(127, 156, 175);
    paramGraphics.drawString("Стоп", this.M, this.O, 0);
    paramGraphics.drawString("Меню", this.N, this.P, 0);
    this.L = this.a.e.a() ? "Пауза" : "Воспр.";
    paramGraphics.drawString(this.L, this.R + (this.l.b - this.ag.stringWidth(this.L)) / 2, this.Q, 0);
  }
  
  private void a(Graphics paramGraphics) {
    paramGraphics.setFont(this.ai);
    paramGraphics.drawString(this.F, this.Z, this.ab, 0);
    paramGraphics.setFont(this.aj);
    paramGraphics.drawString(this.G, this.ac, this.ae, 0);
    paramGraphics.setFont(this.ak);
    paramGraphics.setFont(this.ai);
    paramGraphics.drawString(this.I, this.W, (this.F.length() + this.G.length() + this.a.e.t.length() > 0) ? this.af : this.aa, 0);
  }
  
  public final void feyPressed(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield n : B
    //   5: aload_0
    //   6: getfield z : Z
    //   9: ifeq -> 13
    //   12: return
    //   13: aload_0
    //   14: iload_1
    //   15: invokevirtual getGameAction : (I)I
    //   18: istore_2
    //   19: aload_0
    //   20: iconst_1
    //   21: putfield K : Z
    //   24: iload_1
    //   25: bipush #48
    //   27: if_icmpne -> 34
    //   30: iconst_1
    //   31: goto -> 35
    //   34: iconst_0
    //   35: iload_1
    //   36: bipush #-11
    //   38: if_icmpne -> 45
    //   41: iconst_1
    //   42: goto -> 46
    //   45: iconst_0
    //   46: ior
    //   47: ifeq -> 90
    //   50: aload_0
    //   51: getfield a : LKD/ae;
    //   54: invokevirtual f : ()V
    //   57: aload_0
    //   58: getfield u : Ljavax/microedition/lcdui/game/Sprite;
    //   61: iconst_0
    //   62: invokevirtual setFrame : (I)V
    //   65: aload_0
    //   66: getfield m : Z
    //   69: ifeq -> 298
    //   72: aload_0
    //   73: getfield a : LKD/ae;
    //   76: getfield e : LKD/b;
    //   79: invokevirtual j : ()V
    //   82: aload_0
    //   83: iconst_0
    //   84: putfield m : Z
    //   87: goto -> 298
    //   90: iload_1
    //   91: bipush #53
    //   93: if_icmpne -> 100
    //   96: iconst_1
    //   97: goto -> 101
    //   100: iconst_0
    //   101: iload_2
    //   102: bipush #8
    //   104: if_icmpne -> 111
    //   107: iconst_1
    //   108: goto -> 112
    //   111: iconst_0
    //   112: ior
    //   113: ifeq -> 142
    //   116: aload_0
    //   117: getfield u : Ljavax/microedition/lcdui/game/Sprite;
    //   120: iconst_1
    //   121: invokevirtual setFrame : (I)V
    //   124: aload_0
    //   125: dup
    //   126: getfield Q : I
    //   129: iconst_1
    //   130: iadd
    //   131: putfield Q : I
    //   134: aload_0
    //   135: iconst_1
    //   136: putfield R : B
    //   139: goto -> 298
    //   142: iload_1
    //   143: bipush #52
    //   145: if_icmpne -> 152
    //   148: iconst_1
    //   149: goto -> 153
    //   152: iconst_0
    //   153: iload_2
    //   154: iconst_2
    //   155: if_icmpne -> 162
    //   158: iconst_1
    //   159: goto -> 163
    //   162: iconst_0
    //   163: ior
    //   164: ifeq -> 178
    //   167: aload_0
    //   168: getfield u : Ljavax/microedition/lcdui/game/Sprite;
    //   171: iconst_2
    //   172: invokevirtual setFrame : (I)V
    //   175: goto -> 298
    //   178: iload_1
    //   179: bipush #54
    //   181: if_icmpne -> 188
    //   184: iconst_1
    //   185: goto -> 189
    //   188: iconst_0
    //   189: iload_2
    //   190: iconst_5
    //   191: if_icmpne -> 198
    //   194: iconst_1
    //   195: goto -> 199
    //   198: iconst_0
    //   199: ior
    //   200: ifeq -> 214
    //   203: aload_0
    //   204: getfield u : Ljavax/microedition/lcdui/game/Sprite;
    //   207: iconst_3
    //   208: invokevirtual setFrame : (I)V
    //   211: goto -> 298
    //   214: iload_1
    //   215: bipush #-6
    //   217: if_icmpne -> 243
    //   220: aload_0
    //   221: dup
    //   222: getfield M : I
    //   225: iconst_1
    //   226: iadd
    //   227: putfield M : I
    //   230: aload_0
    //   231: dup
    //   232: getfield O : I
    //   235: iconst_1
    //   236: iadd
    //   237: putfield O : I
    //   240: goto -> 298
    //   243: iload_1
    //   244: bipush #-7
    //   246: if_icmpne -> 272
    //   249: aload_0
    //   250: dup
    //   251: getfield N : I
    //   254: iconst_1
    //   255: iadd
    //   256: putfield N : I
    //   259: aload_0
    //   260: dup
    //   261: getfield P : I
    //   264: iconst_1
    //   265: iadd
    //   266: putfield P : I
    //   269: goto -> 298
    //   272: iload_1
    //   273: bipush #55
    //   275: if_icmpne -> 285
    //   278: aload_0
    //   279: getfield v : Ljavax/microedition/lcdui/game/Sprite;
    //   282: goto -> 295
    //   285: iload_1
    //   286: bipush #57
    //   288: if_icmpne -> 298
    //   291: aload_0
    //   292: getfield w : Ljavax/microedition/lcdui/game/Sprite;
    //   295: invokevirtual nextFrame : ()V
    //   298: aload_0
    //   299: invokespecial c : ()V
    //   302: return
  }
  
  public final void feyReleased(int paramInt) {
    this.n = 0;
    if (this.z)
      return; 
    if (!this.K)
      return; 
    this.K = false;
    int i = getGameAction(paramInt);
    if (paramInt == 51) {
      this.a.i();
      return;
    } 
    if (paramInt == 49) {
      o();
    } else if (paramInt == 42) {
      this.a.f();
      this.a.a.setCurrent(null);
    } else if ((((paramInt == 53) ? 1 : 0) | ((i == 8) ? 1 : 0)) != 0) {
      this.Q--;
      this.R = 0;
      this.u.setFrame(0);
      f();
    } else if ((((paramInt == 52) ? 1 : 0) | ((i == 2) ? 1 : 0)) != 0) {
      this.u.setFrame(0);
      if (!this.m) {
        g();
      } else {
        this.m = false;
        this.a.e.j();
      } 
    } else if ((((paramInt == 54) ? 1 : 0) | ((i == 5) ? 1 : 0)) != 0) {
      this.u.setFrame(0);
      if (!this.m) {
        h();
      } else {
        this.m = false;
        this.a.e.j();
      } 
    } else if ((((paramInt == 50) ? 1 : 0) | ((i == 1) ? 1 : 0)) != 0) {
      j();
    } else if ((((paramInt == 56) ? 1 : 0) | ((i == 6) ? 1 : 0)) != 0) {
      k();
    } else if (paramInt == -6) {
      this.M--;
      this.O--;
      i();
    } else if (paramInt == -7) {
      this.N--;
      this.P--;
      n();
    } else if (paramInt == 55) {
      this.v.nextFrame();
      l();
    } else if (paramInt == 57) {
      this.w.nextFrame();
      m();
    } 
    c();
    this.m = false;
  }
  
  public final void keyRepeated(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: getfield n : B
    //   5: iconst_1
    //   6: iadd
    //   7: i2b
    //   8: putfield n : B
    //   11: aload_0
    //   12: getfield n : B
    //   15: bipush #10
    //   17: if_icmple -> 26
    //   20: aload_0
    //   21: bipush #10
    //   23: putfield n : B
    //   26: iload_1
    //   27: bipush #-36
    //   29: if_icmpne -> 69
    //   32: aload_0
    //   33: getfield n : B
    //   36: iconst_3
    //   37: if_icmpne -> 109
    //   40: aload_0
    //   41: getfield m : Z
    //   44: ifeq -> 62
    //   47: aload_0
    //   48: getfield a : LKD/ae;
    //   51: getfield e : LKD/b;
    //   54: invokevirtual j : ()V
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield m : Z
    //   62: aload_0
    //   63: invokespecial g : ()V
    //   66: goto -> 109
    //   69: iload_1
    //   70: bipush #-37
    //   72: if_icmpne -> 109
    //   75: aload_0
    //   76: getfield n : B
    //   79: iconst_3
    //   80: if_icmpne -> 109
    //   83: aload_0
    //   84: getfield m : Z
    //   87: ifeq -> 105
    //   90: aload_0
    //   91: getfield a : LKD/ae;
    //   94: getfield e : LKD/b;
    //   97: invokevirtual j : ()V
    //   100: aload_0
    //   101: iconst_0
    //   102: putfield m : Z
    //   105: aload_0
    //   106: invokespecial h : ()V
    //   109: aload_0
    //   110: getfield z : Z
    //   113: iload_1
    //   114: bipush #35
    //   116: if_icmpeq -> 123
    //   119: iconst_1
    //   120: goto -> 124
    //   123: iconst_0
    //   124: iand
    //   125: ifeq -> 129
    //   128: return
    //   129: aload_0
    //   130: iload_1
    //   131: invokevirtual getGameAction : (I)I
    //   134: istore_2
    //   135: iload_1
    //   136: bipush #35
    //   138: if_icmpne -> 168
    //   141: aload_0
    //   142: getfield n : B
    //   145: iconst_3
    //   146: if_icmpne -> 317
    //   149: aload_0
    //   150: aload_0
    //   151: getfield z : Z
    //   154: ifne -> 161
    //   157: iconst_1
    //   158: goto -> 162
    //   161: iconst_0
    //   162: putfield z : Z
    //   165: goto -> 317
    //   168: iload_1
    //   169: bipush #52
    //   171: if_icmpne -> 178
    //   174: iconst_1
    //   175: goto -> 179
    //   178: iconst_0
    //   179: iload_2
    //   180: iconst_2
    //   181: if_icmpne -> 188
    //   184: iconst_1
    //   185: goto -> 189
    //   188: iconst_0
    //   189: ior
    //   190: ifeq -> 239
    //   193: aload_0
    //   194: getfield u : Ljavax/microedition/lcdui/game/Sprite;
    //   197: iconst_2
    //   198: invokevirtual setFrame : (I)V
    //   201: aload_0
    //   202: getfield n : B
    //   205: iconst_3
    //   206: if_icmpne -> 228
    //   209: aload_0
    //   210: iconst_1
    //   211: putfield m : Z
    //   214: aload_0
    //   215: getfield a : LKD/ae;
    //   218: getfield e : LKD/b;
    //   221: iconst_0
    //   222: invokevirtual b : (Z)V
    //   225: goto -> 317
    //   228: aload_0
    //   229: getfield n : B
    //   232: iconst_3
    //   233: if_icmple -> 317
    //   236: goto -> 307
    //   239: iload_1
    //   240: bipush #54
    //   242: if_icmpne -> 249
    //   245: iconst_1
    //   246: goto -> 250
    //   249: iconst_0
    //   250: iload_2
    //   251: iconst_5
    //   252: if_icmpne -> 259
    //   255: iconst_1
    //   256: goto -> 260
    //   259: iconst_0
    //   260: ior
    //   261: ifeq -> 317
    //   264: aload_0
    //   265: getfield u : Ljavax/microedition/lcdui/game/Sprite;
    //   268: iconst_3
    //   269: invokevirtual setFrame : (I)V
    //   272: aload_0
    //   273: getfield n : B
    //   276: iconst_3
    //   277: if_icmpne -> 299
    //   280: aload_0
    //   281: iconst_1
    //   282: putfield m : Z
    //   285: aload_0
    //   286: getfield a : LKD/ae;
    //   289: getfield e : LKD/b;
    //   292: iconst_1
    //   293: invokevirtual b : (Z)V
    //   296: goto -> 317
    //   299: aload_0
    //   300: getfield n : B
    //   303: iconst_3
    //   304: if_icmple -> 317
    //   307: aload_0
    //   308: getfield a : LKD/ae;
    //   311: getfield e : LKD/b;
    //   314: invokevirtual i : ()V
    //   317: aload_0
    //   318: invokespecial c : ()V
    //   321: return
  }
  
  public final void pointerDragged(int paramInt1, int paramInt2) {}
  
  public final void pointerPressed(int paramInt1, int paramInt2) {}
  
  public final void pointerReleased(int paramInt1, int paramInt2) {}
  
  private void e() {
    try {
      Image image = null;
      this.l.a();
      this.q = new LayerManager();
      image = this.l.c();
      this.r = new Sprite(image);
      this.s = new Sprite(t.d(), this.l.k, this.l.l);
      this.t = new Sprite(t.e(), this.l.g, this.l.h);
      this.u = new Sprite(t.f(), this.l.i, this.l.j);
      this.v = new Sprite(t.g(), this.l.m, this.l.n);
      this.w = new Sprite(t.h(), this.l.o, this.l.p);
      image = u.a("/images/player/pl_keylock.png");
      this.x = new Sprite(image, image.getWidth(), image.getHeight());
      this.r.setPosition(0, 0);
      this.s.setPosition(this.l.c, this.l.e + 1);
      int i = 0;
      int j = 0;
      i = (this.l.b - this.l.g) / 2;
      j = this.l.a - this.l.f - this.l.h - 1;
      i++;
      if (j % 2 == 0)
        j--; 
      this.t.setPosition(i, j);
      i = (this.l.b - this.l.i) / 2;
      j += (this.l.h - this.l.j) / 2;
      i++;
      if (j % 2 != 0)
        j++; 
      this.u.setPosition(i, j);
      i = this.l.c;
      if ((j = this.t.getY() + (this.l.h - this.l.n) / 2) % 2 != 0)
        j++; 
      this.v.setPosition(i, j);
      i = this.l.b - this.l.d - this.l.o;
      if ((j = this.t.getY() + (this.l.h - this.l.p) / 2) % 2 != 0)
        j++; 
      this.w.setPosition(i, j);
      i = this.l.b - this.l.c - image.getWidth() - 5;
      this.x.setPosition(i, 12);
      image = u.a("/images/player/pl_video.png");
      this.o = image.getHeight();
      this.p = image.getWidth();
      this.y = new Sprite(image, this.p, this.o);
      this.y.setVisible(false);
      this.q.append((Layer)this.u);
      this.q.append((Layer)this.t);
      this.q.append((Layer)this.v);
      this.q.append((Layer)this.w);
      this.q.append((Layer)this.x);
      this.q.append((Layer)this.y);
      this.q.append((Layer)this.s);
      this.q.append((Layer)this.r);
      this.A = new e(this.l.b - this.l.c - this.l.d - 4);
      this.M = this.l.c;
      this.O = this.l.a - this.l.f + (this.l.f - this.ag.getHeight()) / 2;
      this.N = this.l.b - this.l.d - this.ag.stringWidth("Меню");
      this.P = this.O;
      this.Q = this.O;
      this.R = 0;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void a(boolean paramBoolean) {
    if (this.b == paramBoolean)
      return; 
    this.b = paramBoolean;
    this.y.setVisible(paramBoolean);
    this.s.setVisible(!paramBoolean);
    this.u.setVisible(!paramBoolean);
    this.t.setVisible(!paramBoolean);
    this.v.setVisible(!paramBoolean);
    this.w.setVisible(!paramBoolean);
  }
  
  private void f() {
    if (this.a.e.a()) {
      this.a.e.d();
      return;
    } 
    this.a.e.c();
  }
  
  private void g() {
    this.a.e.f();
  }
  
  private void h() {
    this.a.e.a(false);
  }
  
  private void i() {
    this.a.e.e();
  }
  
  private void j() {
    this.a.e.g();
    this.t.setFrame(this.a.e.m);
  }
  
  private void k() {
    this.a.e.h();
    this.t.setFrame(this.a.e.m);
  }
  
  private void l() {
    this.a.e.c((this.v.getFrame() == 2));
  }
  
  private void m() {
    this.a.e.h = (this.w.getFrame() == 2);
  }
  
  private void n() {
    Image image = u.a("/images/lib/lib_sel.png");
    this.al = new List("Меню", 3);
    for (byte b = 0; b < this.j.length; b++)
      this.al.append(this.j[b], image); 
    this.al.setSelectCommand(this.am);
    this.al.addCommand(this.an);
    this.al.setCommandListener(this);
    this.a.a.setCurrent((Displayable)this.al);
  }
  
  private void o() {
    this.a.h();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */