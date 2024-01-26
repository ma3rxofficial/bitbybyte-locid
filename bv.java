import i.I;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import jimm.Jimm;

public final class bv implements CommandListener, ItemStateListener, Runnable {
  private boolean k;
  
  private boolean l;
  
  private int m;
  
  private String n;
  
  private Command o;
  
  private Command p;
  
  private Command q;
  
  private be r;
  
  private Form s;
  
  private TextField[] t;
  
  private TextField[] u;
  
  private TextField v;
  
  private TextField w;
  
  private TextField x;
  
  private ChoiceGroup y;
  
  private TextField z;
  
  private ChoiceGroup A;
  
  private ChoiceGroup B;
  
  private TextField C;
  
  private ChoiceGroup D;
  
  private ChoiceGroup E;
  
  private ChoiceGroup F;
  
  private ChoiceGroup G;
  
  private ChoiceGroup H;
  
  private ChoiceGroup I;
  
  private ChoiceGroup J;
  
  private ChoiceGroup K;
  
  private ChoiceGroup L;
  
  public ChoiceGroup a;
  
  private ChoiceGroup M;
  
  private ChoiceGroup N;
  
  private ChoiceGroup O;
  
  private ChoiceGroup P;
  
  private ChoiceGroup Q;
  
  private ChoiceGroup R;
  
  private ChoiceGroup S;
  
  private ChoiceGroup T;
  
  private TextField U;
  
  private ChoiceGroup V;
  
  private ChoiceGroup W;
  
  private TextField X;
  
  private ChoiceGroup Y;
  
  private ChoiceGroup Z;
  
  private ChoiceGroup aa;
  
  private ChoiceGroup ab;
  
  private ChoiceGroup ac;
  
  private ChoiceGroup ad;
  
  private Gauge ae;
  
  private Gauge af;
  
  private Gauge ag;
  
  private Gauge ah;
  
  private ChoiceGroup ai;
  
  private ChoiceGroup aj;
  
  private ChoiceGroup ak;
  
  private ChoiceGroup al;
  
  private Gauge am;
  
  private TextField an;
  
  private TextField ao;
  
  private TextField ap;
  
  private TextField aq;
  
  private ChoiceGroup ar;
  
  private ChoiceGroup as;
  
  private ChoiceGroup at;
  
  private ChoiceGroup au;
  
  private ChoiceGroup av;
  
  private ChoiceGroup aw;
  
  private TextField ax;
  
  private ChoiceGroup ay;
  
  private TextField az;
  
  private TextField aA;
  
  private TextField aB;
  
  private TextField aC;
  
  private TextField aD;
  
  private TextField aE;
  
  private ChoiceGroup aF;
  
  private TextField aG;
  
  private Gauge aH;
  
  private Gauge aI;
  
  private Gauge aJ;
  
  private TextField aK;
  
  private TextField aL;
  
  private TextField aM;
  
  private ChoiceGroup aN;
  
  private Gauge aO;
  
  private TextField aP;
  
  private TextField aQ;
  
  private TextField aR;
  
  private TextField aS;
  
  private ChoiceGroup aT;
  
  private TextField aU;
  
  private ChoiceGroup aV;
  
  private TextField aW;
  
  private TextField aX;
  
  private TextField aY;
  
  private TextField aZ;
  
  private TextField ba;
  
  private be bb = new be(bb.a((short)225));
  
  private be bc;
  
  private be bd;
  
  private be be;
  
  private be bf;
  
  private final short[] bg = new short[] { 
      236, 284, 421, 578, 237, 367, 332, 295, 338, 201, 
      266, 789, 441, 76, 204, 135, 6, 541, 732, 432 };
  
  private final int[] bh = new int[] { 
      0, 2, 3, 8, 4, 5, 6, 7, 9, 10, 
      11, 19, 12, 14, 15, 17, 13, 16, 18, 20 };
  
  private ChoiceGroup bi;
  
  private TextField bj;
  
  private ChoiceGroup bk;
  
  private TextField bl;
  
  private TextField bm;
  
  private ChoiceGroup bn;
  
  private ChoiceGroup bo;
  
  public Vector b;
  
  public int c;
  
  public boolean d;
  
  public int e;
  
  public String[] f;
  
  public int[] g;
  
  public int[] h;
  
  public boolean[] i;
  
  public es j = new es(this);
  
  private Command bp = new Command(bb.a((short)93), 8, 3);
  
  private Command bq = new Command(bb.a((short)212, 1), 8, 3);
  
  private int br;
  
  private Vector bs = new Vector();
  
  private Vector bt = new Vector();
  
  private int bu = em.q.length / em.p;
  
  private boolean bv = false;
  
  private static fa bw;
  
  public bv() throws NullPointerException {
    this.bb.a(this);
    this.bc = new be(bb.a((short)226));
    this.bc.a(this);
    this.o = new Command(bb.a((short)13), Jimm.h ? 2 : 1, 1);
    this.p = new Command(bb.a((short)86), 8, 2);
    this.q = new Command(bb.a((short)87), 8, 2);
    this.r = new be(bb.a((short)367));
    this.bd = new be(bb.a((short)159));
    this.bf = new be(bb.a((short)817));
    this.be = new be(bb.a((short)154));
    this.r.a(dw.f, bd.aa);
    this.r.a(dw.q, bd.Z);
    this.r.a(this);
    this.s = new Form(bb.a((short)367));
    this.s.addCommand(this.o);
    this.s.addCommand(dw.f);
    this.s.setCommandListener(this);
    this.s.setItemStateListener(this);
  }
  
  public final void a() {
    this.r.w(9);
    commandAction(dw.q, null);
  }
  
  private void e() {
    this.r.z();
    this.r.e(3);
    this.r.u = true;
    if (cd.e())
      dw.a(this.r, bb.a((short)368), bi.d.a(12), 0); 
    dw.a(this.r, bb.a((short)374), bi.d.a(13), 1);
    if (em.f(202) == 2)
      dw.a(this.r, bb.a((short)558), bi.d.a(21), 2); 
    dw.a(this.r, bb.a((short)372), bi.d.a(14), 3, 50);
    dw.a(this.r, bb.a((short)797), bi.d.a(24), 16);
    dw.a(this.r, bb.a((short)798), bi.d.a(14), 17);
    dw.a(this.r, bb.a((short)159), bi.d.a(32), 4);
    dw.a(this.r, bb.a((short)817), bi.d.a(32), 18, 51);
    dw.a(this.r, bb.a((short)802), bi.d.a(14), 19);
    dw.a(this.r, bb.a((short)373), bi.d.a(22), 5, 52);
    dw.a(this.r, bb.a((short)371), bi.b.a(7), 12, 53);
    dw.a(this.r, bb.a((short)707), bi.d.a(8), 13);
    dw.a(this.r, bb.a((short)376), bi.d.a(15), 6, 48);
    dw.a(this.r, bb.a((short)369), bi.d.a(25), 7);
    dw.a(this.r, bb.a((short)485), bi.d.a(26), 8);
    dw.a(this.r, bb.a((short)106), bi.d.a(0), 10);
    dw.a(this.r, bb.a((short)154), bi.e.a(em.f(212)), 11, 54);
    dw.a(this.r, bb.a((short)340), bi.d.a(10), 9, 55);
    dw.a(this.r, bb.a((short)76), bi.d.a(33), 14, 56);
    dw.a(this.r, bb.a((short)765), bi.d.a(1), 15);
  }
  
  private String a(String paramString, int paramInt) {
    String str = paramString;
    byte b;
    for (b = 0; b < this.bg.length; b++) {
      if (this.bh[b] == paramInt)
        return str + ": " + bb.a(this.bg[b]); 
    } 
    if (cp.g != null)
      for (b = 0; b < cp.i.length; b++) {
        if (paramInt == 1000 + b)
          return str + ": " + cp.i[b].getName(); 
      }  
    return str + ": <???>";
  }
  
  private void f() {
    int i = this.bb.A();
    boolean bool = em.h(59);
    this.bb.z();
    if (!bool)
      dw.a(this.bb, a(bb.a((short)227), em.f(230)), (I)null, 230); 
    dw.a(this.bb, a(bb.a((short)229), em.f(231)), (I)null, 231);
    dw.a(this.bb, a(bb.a((short)231), em.f(232)), (I)null, 232);
    dw.a(this.bb, a(bb.a((short)234), em.f(233)), (I)null, 233);
    dw.a(this.bb, a(bb.a((short)233), em.f(235)), (I)null, 235);
    dw.a(this.bb, a(bb.a((short)235), em.f(234)), (I)null, 234);
    if (bool) {
      String str;
      if ((str = em.d(143)).length() < em.o) {
        str = "";
        for (byte b1 = 0; b1 < em.o; b1++)
          str = str + Character.MIN_VALUE; 
        em.b(143, str);
      } 
      for (byte b = 0; b < em.o; b++) {
        char c = str.charAt(b);
        dw.a(this.bb, a("0+" + em.m[b], c), (I)null, 1024 + b);
      } 
    } 
    this.bb.w(i);
    this.bb.u = true;
    this.bb.a(dw.p, bd.aa);
    this.bb.a(this.o, bd.ac);
    if (bool) {
      this.bb.b(this.p);
      this.bb.a(this.q, bd.ac);
    } else {
      this.bb.b(this.q);
      this.bb.a(this.p, bd.ac);
    } 
    this.bb.a(dw.q, bd.Z);
    this.bb.b(Jimm.d);
  }
  
  public final void b() {
    int i = this.bd.A();
    this.bd.z();
    this.bd.e(3);
    this.bd.u = true;
    this.bd.q();
    if (em.h == null) {
      em.h = new I[em.d.length];
      em.i = Font.getFont(0, 1, 8);
      em.k = em.i.getHeight();
      em.j = em.i.charWidth('W');
      em.g = Image.createImage(em.j * em.h.length + 1, em.k);
      for (byte b1 = 0; b1 < em.d.length; b1++)
        em.h[b1] = new I(em.g, b1 * em.j, 0, em.j, em.k); 
    } 
    em.b();
    for (byte b = 0; b < em.d.length; b++)
      dw.a(this.bd, bb.a(em.e[b]), em.h[b], b); 
    this.bd.s();
    this.bd.w(i);
    this.bd.a(this.o, bd.aa);
    this.bd.a(dw.q, bd.Z);
    this.bd.a(this);
    this.bd.b(Jimm.d);
  }
  
  private void g() {
    this.f = null;
    try {
      InputStream inputStream;
      byte[] arrayOfByte = new byte[(inputStream = this.bf.getClass().getResourceAsStream("/themes.txt")).available()];
      inputStream.read(arrayOfByte);
      inputStream.close();
      String str = dh.a(arrayOfByte, true);
      this.f = dh.b(str, '\n');
    } catch (IOException iOException) {
      null.printStackTrace();
    } 
    this.b = new Vector();
    this.c = 0;
    this.e = 0;
    this.d = false;
    boolean bool1 = false;
    boolean bool2 = false;
    int[] arrayOfInt = null;
    byte b;
    for (b = 0; b < this.f.length; b++) {
      if (!bool1) {
        if (this.f[b].startsWith("---theme")) {
          arrayOfInt = new int[4];
          this.b.addElement(arrayOfInt);
          arrayOfInt[0] = b + 1;
          bool1 = true;
        } 
      } else {
        if (this.f[b].startsWith("147.1="))
          arrayOfInt[3] = b; 
        if (this.f[b].startsWith("147=")) {
          arrayOfInt[2] = b;
        } else if (this.f[b].startsWith("---end")) {
          arrayOfInt[1] = b + 1;
          bool1 = false;
        } 
      } 
    } 
    this.g = new int[em.d.length];
    this.h = new int[em.v.length];
    this.i = new boolean[em.u.length];
    System.arraycopy(em.d, 0, this.g, 0, em.d.length);
    System.arraycopy(em.u, 0, this.i, 0, em.u.length);
    System.arraycopy(em.v, 0, this.h, 0, em.v.length);
    this.bf.z();
    this.bf.e(3);
    this.bf.u = true;
    this.bf.q();
    dw.a(this.bf, "Now:" + em.d(147), bi.d.a(32), 0);
    dw.a(this.bf, "LocID original", bi.e.a(30), -100);
    dw.a(this.bf, "LocID extended", bi.e.a(30), -101);
    for (b = 1; b <= this.b.size(); b++) {
      String str;
      arrayOfInt = this.b.elementAt(b - 1);
      I i = null;
      if (arrayOfInt[3] != 0)
        try {
          int j;
          i = bi.a((j = Integer.parseInt(this.f[arrayOfInt[3]].substring(6))) / 1000).a(j % 1000);
        } catch (Exception exception) {} 
      if (i == null)
        i = bi.d.a(32); 
      if (arrayOfInt[2] > 0) {
        str = this.f[arrayOfInt[2]].substring(4);
      } else {
        str = "Scheme" + b;
      } 
      dw.a(this.bf, str, i, b);
    } 
    this.bf.s();
    this.bf.a(dw.f, bd.aa);
    this.bf.a(dw.q, bd.Z);
    this.bf.p = this.j;
    this.bf.a(this);
    this.bf.b(Jimm.d);
  }
  
  private void h() {
    this.be.z();
    this.be.e(3);
    this.be.u = true;
    this.be.q();
    dw.a(this.be, "Jimm", bi.e.a(7), 7, 50);
    dw.a(this.be, "LocID", bi.e.a(30), 30, 48);
    dw.a(this.be, "D[i]Chat", bi.e.a(29), 29, 51);
    dw.a(this.be, "Sm@peR 1.59s", bi.e.a(28), 28);
    dw.a(this.be, "LICQ", bi.e.a(25), 25);
    dw.a(this.be, "Miranda", bi.e.a(1), 1);
    dw.a(this.be, "QIP 2005a", bi.e.a(0), 0, 52);
    dw.a(this.be, "QIP PDA (Symbian)", bi.e.a(12), 12);
    dw.a(this.be, "QIP PDA (Windows)", bi.e.a(13), 13);
    dw.a(this.be, "QIP Infium", bi.e.a(14), 14, 53);
    dw.a(this.be, "ICQ 5.1", bi.e.a(18), 18);
    dw.a(this.be, "ICQ 6", bi.e.a(15), 15, 54);
    dw.a(this.be, "StICQ", bi.e.a(8), 8);
    dw.a(this.be, "VmICQ", bi.e.a(11), 11);
    dw.a(this.be, "mChat", bi.e.a(21), 21);
    dw.a(this.be, "&RQ", bi.e.a(2), 2);
    dw.a(this.be, "R&Q", bi.e.a(3), 3);
    dw.a(this.be, "Kopete", bi.e.a(6), 6);
    dw.a(this.be, "Mac ICQ", bi.e.a(22), 22);
    dw.a(this.be, "Bayan ICQ", bi.e.a(31), 31, 55);
    this.be.s();
    this.be.w(em.f(212));
    this.be.a(dw.f, bd.aa);
    this.be.a(dw.q, bd.Z);
    this.be.a(this);
    this.be.b(Jimm.d);
  }
  
  private void i() {
    this.bs.removeAllElements();
    this.bt.removeAllElements();
    for (byte b = 0; b < this.bu; b++) {
      int i = b * em.p;
      String str = em.c(em.q[i]);
      if (b == 0 || str.length() != 0) {
        this.bs.addElement(str);
        this.bt.addElement(em.c(em.q[i + 1]));
      } 
    } 
    this.br = em.f(200);
  }
  
  private static String a(String paramString) {
    return (paramString == null || paramString.length() == 0) ? "---" : paramString;
  }
  
  private void j() {
    int i;
    if ((i = this.bs.size()) != 1) {
      if (this.Z == null)
        this.Z = new ChoiceGroup(bb.a((short)368), 4); 
      this.Z.deleteAll();
      for (byte b1 = 0; b1 < i; b1++)
        this.Z.append(a(this.bs.elementAt(b1)), null); 
      this.s.append((Item)this.Z);
      if (this.br >= i)
        this.br = i - 1; 
      this.Z.setSelectedIndex(this.br, true);
    } 
    this.t = new TextField[i];
    this.u = new TextField[i];
    for (byte b = 0; b < i; b++) {
      TextField textField1;
      if (i > 1)
        this.s.append("---"); 
      String str = (i == 1) ? "" : ("-" + (b + 1));
      try {
        textField1 = new TextField(bb.a((short)493) + str, this.bs.elementAt(b), 12, 2);
      } catch (Exception exception) {
        textField1 = new TextField(bb.a((short)493) + str, "", 12, 2);
      } 
      TextField textField2 = new TextField(bb.a((short)378) + str, this.bt.elementAt(b), 32, 65536);
      this.s.append((Item)textField1);
      this.s.append((Item)textField2);
      this.t[b] = textField1;
      this.u[b] = textField2;
    } 
    if (i != this.bu)
      this.s.addCommand(this.bp); 
    if (i != 1)
      this.s.addCommand(this.bq); 
  }
  
  private void k() {
    int i = this.bs.size();
    for (byte b = 0; b < this.bu; b++) {
      String str1;
      String str2;
      if (b < i) {
        str1 = this.bs.elementAt(b);
        str2 = this.bt.elementAt(b);
      } else {
        str1 = str2 = em.r;
      } 
      if (!str1.equals(em.j(em.q[em.p * b])))
        em.c(em.q[em.p * b + 2], "NO"); 
      em.c(em.q[em.p * b], str1);
      em.c(em.q[em.p * b + 1], str2);
    } 
    if (this.br >= i)
      this.br = i - 1; 
    em.a(200, this.br);
  }
  
  private void l() {
    this.bs.removeAllElements();
    this.bt.removeAllElements();
    for (byte b = 0; b < this.t.length; b++) {
      this.bs.addElement(this.t[b].getString());
      this.bt.addElement(this.u[b].getString());
    } 
    this.br = (this.Z == null) ? 0 : this.Z.getSelectedIndex();
  }
  
  public final void itemStateChanged(Item paramItem) {
    int i;
    if (this.t != null && (i = this.t.length) != 1) {
      byte b = 0;
      while (b < i) {
        if (this.t[b] != paramItem) {
          b++;
          continue;
        } 
        this.Z.set(b, a(this.t[b].getString()), null);
        return;
      } 
    } 
    if (paramItem == this.aF && (this.aF.isSelected(1) || this.aF.isSelected(2))) {
      em.a(35, true);
      (new Thread(this)).start();
    } 
  }
  
  public final void run() {
    ed.e = false;
    ed ed;
    (ed = new ed(1, (dm)null)).d = this.aF.isSelected(2);
    ed.b();
  }
  
  public final void c() {
    this.n = em.d(106);
    this.l = em.h(7);
    this.k = em.h(16);
    e();
    this.r.b(Jimm.d);
  }
  
  private static void a(ChoiceGroup paramChoiceGroup, short[] paramArrayOfshort) {
    for (byte b = 0; b < paramArrayOfshort.length; b++)
      a(paramChoiceGroup, paramArrayOfshort[b]); 
  }
  
  private static void a(ChoiceGroup paramChoiceGroup, short paramShort) {
    paramChoiceGroup.append(bb.a(paramShort), null);
  }
  
  private static void a(ChoiceGroup paramChoiceGroup, short paramShort, int paramInt) {
    a(paramChoiceGroup, paramShort);
    paramChoiceGroup.setSelectedIndex(paramChoiceGroup.size() - 1, em.h(paramInt));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    boolean bool = false;
    if (dw.a(this.bb) && paramCommand == dw.q) {
      if (this.bc.c() == 0) {
        byte b;
        for (b = 0; b < this.bg.length; b++)
          dw.a(this.bc, bb.a(this.bg[b]), (I)null, this.bh[b]); 
        if (cp.g != null)
          for (b = 0; b < cp.i.length; b++)
            dw.a(this.bc, cp.i[b].getName(), (I)null, 1000 + b);  
      } 
      this.bc.a(dw.q, bd.Z);
      this.bc.a(dw.f, bd.aa);
      int i;
      boolean bool1 = ((i = this.bb.A()) < 1024) ? em.f(i) : em.d(143).charAt(i - 1024);
      this.bc.w(bool1);
      this.bc.u = true;
      this.bc.b(Jimm.d);
      return;
    } 
    if (dw.a(this.bc)) {
      if (paramCommand == dw.q) {
        int i;
        if ((i = this.bb.A()) < 1024) {
          em.a(i, this.bc.A());
        } else {
          StringBuffer stringBuffer;
          (stringBuffer = new StringBuffer(em.d(143))).setCharAt(i - 1024, (char)this.bc.A());
          em.b(143, new String(stringBuffer));
        } 
      } 
      f();
      return;
    } 
    if (dw.a(this.bd) && paramCommand == dw.q) {
      dw.a(this.bd);
      bw = new fa(2, fa.t(em.g(this.bd.A())));
      bw.u = true;
      bw.a(dw.q, bd.Z);
      bw.a(dw.f, bd.aa);
      bw.a(this);
      bw.b(Jimm.d);
      return;
    } 
    if (dw.a(this.bf)) {
      if (paramCommand == dw.q) {
        boolean bool1 = false;
        dw.a(this.bf);
        this.b = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.r.u(em.d[1]);
        this.r.v(em.v[40]);
        this.r.c(Jimm.d);
        em.b(123);
        return;
      } 
      if (paramCommand == dw.f) {
        System.arraycopy(this.g, 0, em.d, 0, em.d.length);
        System.arraycopy(this.i, 0, em.u, 0, em.u.length);
        System.arraycopy(this.h, 0, em.v, 0, em.v.length);
        this.b = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.r.c(Jimm.d);
        return;
      } 
    } 
    if (dw.a(bw)) {
      if (paramCommand == dw.q) {
        dw.a(bw);
        ba ba = new ba(this.bd.A(), fa.z());
        Jimm.d.setCurrent((Displayable)ba);
        return;
      } 
      if (paramCommand == dw.f) {
        em.y.b();
        return;
      } 
    } 
    if (dw.a(this.be) && paramCommand == dw.q) {
      int i = this.be.A();
      em.a(212, i);
      if (i == 29) {
        em.b(132, "$*mi:SEK610i");
      } else if (i == 7) {
        em.b(132, "0.6");
      } else if (i == 14) {
        em.b(132, "9026");
      } else if (i == 0) {
        em.b(132, "8022");
      } 
      em.b(2);
      c();
      m();
      return;
    } 
    if (paramCommand == dw.q) {
      int i;
      int j;
      int k;
      Image image;
      byte b;
      int[] arrayOfInt;
      String str;
      int m;
      int n;
      byte b1;
      Calendar calendar;
      n();
      this.s.addCommand(this.o);
      cz.a(true);
      switch (this.r.A()) {
        case 0:
          i();
          j();
          break;
        case 1:
          this.v = dw.a(new TextField(bb.a((short)423), em.d(101), 255, 0));
          this.w = new TextField(bb.a((short)425), em.d(102), 5, 2);
          this.B = new ChoiceGroup(bb.a((short)184), 4);
          a(this.B, (short)438);
          a(this.B, (short)280);
          a(this.B, (short)558);
          this.B.setSelectedIndex(em.f(202), true);
          this.y = new ChoiceGroup(bb.a((short)294), 2);
          a(this.y, (short)554, 0);
          this.z = new TextField(bb.a((short)486), em.d(103), 4, 2);
          this.A = new ChoiceGroup(bb.a((short)185), 2);
          a(this.A, new short[] { 330, 111, 114, 398, 793 });
          a(this.A, new short[] { 429 });
          this.A.setSelectedIndex(0, em.h(41));
          this.A.setSelectedIndex(1, (em.f(201) != 0));
          this.A.setSelectedIndex(2, em.h(1));
          this.A.setSelectedIndex(3, em.h(3));
          this.A.setSelectedIndex(4, em.h(85));
          this.A.setSelectedIndex(5, em.h(2));
          this.C = new TextField(bb.a((short)399), String.valueOf(em.f(204)), 2, 2);
          this.x = new TextField(bb.a((short)794), String.valueOf(em.f(251)), 3, 2);
          this.bn = new ChoiceGroup(bb.a((short)777), 4);
          this.bn.append("Standart", null);
          this.bn.append("Mode1", null);
          this.bn.append("Mode2", null);
          this.bn.append("Mode3", null);
          this.bn.append("Mode4", null);
          this.bn.append("Mode5", null);
          this.bn.append("Mode6", null);
          try {
            this.bn.setSelectedIndex(em.f(247), true);
          } catch (Exception exception) {}
          this.s.append((Item)this.v);
          this.s.append((Item)this.w);
          this.s.append((Item)this.x);
          this.s.append((Item)this.B);
          this.s.append((Item)this.y);
          this.s.append((Item)this.z);
          this.s.append((Item)this.A);
          this.s.append((Item)this.C);
          this.s.append((Item)this.bn);
          break;
        case 2:
          this.aV = new ChoiceGroup(bb.a((short)559), 4);
          this.aV.append(bb.a((short)561), null);
          this.aV.append(bb.a((short)562), null);
          this.aV.append(bb.a((short)563), null);
          this.aV.setSelectedIndex(em.f(221), true);
          this.aW = new TextField(bb.a((short)564), em.d(138), 32, 0);
          this.aX = new TextField(bb.a((short)565), em.d(139), 5, 2);
          this.aY = new TextField(bb.a((short)566), em.d(141), 32, 0);
          this.aZ = new TextField(bb.a((short)567), em.d(142), 32, 65536);
          this.ba = new TextField(bb.a((short)568), em.d(140), 5, 2);
          this.s.append((Item)this.aV);
          this.s.append((Item)this.aW);
          this.s.append((Item)this.aX);
          this.s.append((Item)this.aY);
          this.s.append((Item)this.aZ);
          this.s.append((Item)this.ba);
          break;
        case 3:
          if (bb.a.length > 1) {
            this.D = new ChoiceGroup(bb.a((short)300), 4);
            for (byte b2 = 0; b2 < bb.a.length; b2++) {
              this.D.append(bb.a((short)312), null);
              if (bb.a[b2].equals(em.d(106)))
                this.D.setSelectedIndex(b2, true); 
            } 
          } 
          this.F = new ChoiceGroup(bb.a((short)120), 4);
          this.F.append(bb.a((short)121), null);
          this.F.append(bb.a((short)122), null);
          if (em.h(5)) {
            this.F.setSelectedIndex(0, true);
          } else {
            this.F.setSelectedIndex(1, true);
          } 
          this.E = new ChoiceGroup(bb.a((short)340), 2);
          a(this.E, (short)266, 42);
          a(this.E, (short)789, 81);
          a(this.E, (short)479, 26);
          a(this.E, (short)780, 77);
          a(this.E, (short)788, 80);
          a(this.E, (short)216, 57);
          a(this.E, (short)724, 58);
          a(this.E, (short)721, 65);
          a(this.E, (short)766, 72);
          a(this.E, (short)779, 76);
          a(this.E, (short)790, 82);
          this.aT = new ChoiceGroup(bb.a((short)192), 2);
          a(this.aT, (short)432, 16);
          a(this.aT, (short)275, 7);
          a(this.aT, (short)276, 8);
          a(this.aT, (short)431, 9);
          this.G = new ChoiceGroup(bb.a((short)445), 4);
          this.G.append(bb.a((short)446), null);
          this.G.append(bb.a((short)447), null);
          this.G.append(bb.a((short)448), null);
          this.G.append(bb.a((short)675), null);
          this.G.setSelectedIndex(em.f(205), true);
          this.au = new ChoiceGroup(bb.a((short)834), 4);
          this.au.append(bb.a((short)835), null);
          this.au.append(bb.a((short)836), null);
          this.au.append(bb.a((short)837), null);
          this.au.setSelectedIndex(em.f(259), true);
          this.H = new ChoiceGroup(bb.a((short)676), 4);
          this.H.append("1", null);
          this.H.append("2", null);
          this.H.append("3", null);
          this.H.setSelectedIndex(em.f(236), true);
          this.K = new ChoiceGroup(bb.a((short)784), 4);
          this.K.append(bb.a((short)785), null);
          this.K.append(bb.a((short)786), null);
          this.K.setSelectedIndex(em.f(248), true);
          this.L = new ChoiceGroup(bb.a((short)434), 2);
          a(this.L, (short)428, 48);
          a(this.L, (short)387, 49);
          a(this.L, (short)273, 52);
          a(this.L, (short)435, 50);
          a(this.L, (short)782, 78);
          a(this.L, (short)433, 51);
          if ((i = em.f(227)) > 30)
            i = 0; 
          this.aD = new TextField(bb.a((short)359), String.valueOf(i), 2, 2);
          if ((i = em.f(228)) > 30)
            i = 0; 
          this.aE = new TextField(bb.a((short)360), String.valueOf(i), 2, 2);
          this.S = new ChoiceGroup(bb.a((short)138), 2);
          a(this.S, (short)139, 15);
          a(this.S, (short)140, 19);
          a(this.S, (short)141, 21);
          a(this.S, (short)495, 38);
          a(this.S, (short)551, 39);
          a(this.S, (short)483, 40);
          a(this.S, (short)494, 17);
          a(this.S, (short)783, 79);
          a(this.S, (short)585, 18);
          a(this.S, (short)193, 14);
          a(this.S, (short)823, 94);
          if (!Jimm.i && !Jimm.j)
            a(this.S, (short)478, 27); 
          a(this.S, (short)801, 86);
          a(this.S, (short)805, 91);
          a(this.S, (short)807, 92);
          this.aU = new TextField(bb.a((short)5), String.valueOf(em.f(220)), 4, 2);
          this.ah = new Gauge(bb.a((short)318), true, 10, em.f(226) / 10);
          this.N = new ChoiceGroup(bb.a((short)254), 4);
          this.N.append(bb.a((short)708), null);
          this.N.append(bb.a((short)709), null);
          this.N.append(bb.a((short)712), null);
          try {
            this.N.setSelectedIndex(em.f(244), true);
          } catch (Exception exception) {}
          this.I = new ChoiceGroup(bb.a((short)808), 4);
          j = bi.b.a(0).getHeight();
          this.I.append(bb.a((short)809), a(j, 0));
          this.I.append(bb.a((short)810), a(j, 1));
          this.I.append(bb.a((short)818), a(j, 2));
          this.I.append(bb.a((short)819), a(j, 3));
          this.I.append(bb.a((short)820), a(j, 4));
          try {
            this.I.setSelectedIndex(em.f(254), true);
          } catch (Exception exception) {}
          this.J = new ChoiceGroup(bb.a((short)838), 4);
          this.J.append("none", null);
          for (k = 1; k < em.a.length; k++) {
            if (em.a[k] < 0) {
              this.J.append("" + (-em.a[k] * 100 / 12) + "%", null);
            } else {
              this.J.append("x" + em.a[k], null);
            } 
          } 
          try {
            k = em.f(255);
            for (byte b2 = 1; b2 < em.a.length; b2++) {
              if (k == em.a[b2])
                this.J.setSelectedIndex(b2, true); 
            } 
          } catch (Exception exception) {}
          if (this.D != null)
            this.s.append((Item)this.D); 
          this.s.append((Item)this.F);
          this.s.append((Item)this.aT);
          this.s.append((Item)this.G);
          this.s.append((Item)this.H);
          this.s.append((Item)this.J);
          this.s.append((Item)this.au);
          this.s.append((Item)this.I);
          this.s.append((Item)this.K);
          this.s.append((Item)this.L);
          if (Jimm.k)
            this.s.append((Item)this.aD); 
          if (Jimm.i)
            this.s.append((Item)this.aE); 
          this.s.append((Item)this.S);
          if (Jimm.l)
            this.s.append((Item)this.aU); 
          if (Jimm.k)
            this.s.append((Item)this.ah); 
          this.s.append((Item)this.E);
          this.M = new ChoiceGroup(bb.a((short)661), 4);
          this.M.append(bb.a((short)662), null);
          this.M.append(bb.a((short)665), null);
          this.M.append(bb.a((short)666), null);
          this.M.append(bb.a((short)667), null);
          this.M.append(bb.a((short)668), null);
          this.M.append(bb.a((short)669), null);
          this.M.append(bb.a((short)670), null);
          this.M.append(bb.a((short)671), null);
          this.M.append(bb.a((short)663), null);
          this.M.setSelectedIndex(em.f(242), true);
          this.s.append((Item)this.M);
          break;
        case 19:
          this.E = new ChoiceGroup(bb.a((short)340), 2);
          a(this.E, (short)802, 88);
          a(this.E, (short)803, 89);
          a(this.E, (short)804, 90);
          this.M = new ChoiceGroup("Type", 4);
          this.M.append("t1", null);
          this.M.append("t2", null);
          this.M.append("t3", null);
          this.M.append("t4", null);
          this.M.append("t5", null);
          try {
            this.M.setSelectedIndex(em.f(263), true);
          } catch (Exception exception) {}
          this.aH = new Gauge(bb.a((short)830), true, 30, em.f(260));
          this.aI = new Gauge(bb.a((short)831), true, 10, em.f(261));
          this.aJ = new Gauge(bb.a((short)832), true, 20, em.f(262));
          this.s.append((Item)this.E);
          this.s.append((Item)this.aH);
          this.s.append((Item)this.aI);
          this.s.append((Item)this.aJ);
          this.s.append((Item)this.M);
          break;
        case 17:
          this.Q = new ChoiceGroup(bb.a((short)253), 4);
          this.Q.append(bb.a((short)247), null);
          this.Q.append(bb.a((short)248), null);
          this.Q.append(bb.a((short)249), null);
          this.Q.setSelectedIndex(em.f(239), true);
          this.R = new ChoiceGroup(bb.a((short)254), 4);
          this.R.append(bb.a((short)250), null);
          this.R.append(bb.a((short)251), null);
          this.R.append(bb.a((short)252), null);
          this.R.setSelectedIndex(em.f(240), true);
          this.N = new ChoiceGroup(bb.a((short)254), 4);
          this.N.append(bb.a((short)708), null);
          this.N.append(bb.a((short)709), null);
          this.N.append(bb.a((short)712), null);
          try {
            this.N.setSelectedIndex(em.f(244), true);
          } catch (Exception exception) {}
          this.s.append((Item)this.Q);
          this.s.append((Item)this.R);
          this.s.append((Item)this.N);
          break;
        case 16:
          this.ae = new Gauge(bb.a((short)698), true, 15, (255 - em.f(243)) / 17);
          this.af = new Gauge(bb.a((short)490), true, 15, (255 - em.f(249)) / 17);
          this.ag = new Gauge(bb.a((short)787), true, 15, (255 - em.f(250)) / 17);
          this.s.append((Item)this.ae);
          this.s.append((Item)this.af);
          this.s.append((Item)this.ag);
          break;
        case 4:
          b();
          return;
        case 5:
          f();
          return;
        case 18:
          g();
          return;
        case 6:
          this.aj = new ChoiceGroup(bb.a((short)363), 4);
          this.aj.append(bb.a((short)349), null);
          this.aj.append(bb.a((short)123), null);
          this.aj.append(bb.a((short)439), null);
          this.ao = new TextField(null, em.d(108), 32, 0);
          this.aj.setSelectedIndex(em.f(207), true);
          this.aw = new ChoiceGroup(null, 2);
          a(this.aw, (short)128, 11);
          a(this.aw, (short)129, 12);
          this.ax = new TextField(bb.a((short)131), String.valueOf(em.f(213)), 3, 2);
          this.ak = new ChoiceGroup(bb.a((short)362), 4);
          this.ak.append(bb.a((short)349), null);
          this.ak.append(bb.a((short)123), null);
          this.ak.append(bb.a((short)439), null);
          this.ap = new TextField(null, em.d(109), 32, 0);
          this.ak.setSelectedIndex(em.f(208), true);
          this.ay = new ChoiceGroup(null, 2);
          a(this.ay, (short)129, 13);
          this.az = new TextField(bb.a((short)131), String.valueOf(em.f(214)), 3, 2);
          this.ai = new ChoiceGroup(bb.a((short)333), 4);
          this.ai.append(bb.a((short)349), null);
          this.ai.append(bb.a((short)123), null);
          this.ai.append(bb.a((short)439), null);
          this.ai.setSelectedIndex(em.f(206), true);
          this.am = new Gauge(bb.a((short)500), true, 10, em.f(210) / 10);
          this.an = new TextField(null, em.d(107), 32, 0);
          this.aq = new TextField(null, em.d(110), 32, 0);
          this.al = new ChoiceGroup(bb.a((short)492), 4);
          this.al.append(bb.a((short)349), null);
          this.al.append(bb.a((short)491), null);
          this.al.append(bb.a((short)123), null);
          this.al.append(bb.a((short)439), null);
          this.al.setSelectedIndex(em.f(209), true);
          this.ar = new ChoiceGroup(null, 2);
          a(this.ar, (short)209, 10);
          this.W = new ChoiceGroup(bb.a((short)498), 4);
          k = 0;
          image = null;
          if (cy.a(0) != null) {
            k++;
            image = cy.a(0).createImage();
          } 
          this.W.append(bb.a((short)349), image);
          if (cy.a(k) != null)
            cy.a(k++).createImage(); 
          this.W.append(bb.a((short)554), cy.a(k++).createImage());
          if (cy.a(k) != null)
            cy.a(k++).createImage(); 
          this.W.append(bb.a((short)544), cy.a(k).createImage());
          this.W.setSelectedIndex(em.f(211), true);
          this.X = dw.a(new TextField(bb.a((short)678), em.d(114), 100, 0));
          this.V = new ChoiceGroup(bb.a((short)384), 4);
          this.V.append(bb.a((short)349), null);
          this.V.append(bb.a((short)393), null);
          this.V.append(bb.a((short)394), null);
          this.V.setSelectedIndex(em.f(224), true);
          this.s.append((Item)this.am);
          this.s.append((Item)this.ai);
          this.s.append((Item)this.an);
          this.s.append((Item)this.W);
          this.s.append((Item)this.X);
          this.s.append((Item)this.aj);
          this.s.append((Item)this.ao);
          this.s.append((Item)this.aw);
          this.s.append((Item)this.ax);
          this.s.append((Item)this.ak);
          this.s.append((Item)this.ap);
          this.s.append((Item)this.ay);
          this.s.append((Item)this.az);
          this.s.append((Item)this.al);
          this.s.append((Item)this.aq);
          this.s.append((Item)this.ar);
          this.s.append((Item)this.V);
          this.Y = new ChoiceGroup(bb.a((short)340), 2);
          a(this.Y, (short)132, 44);
          a(this.Y, (short)196, 45);
          a(this.Y, (short)449, 46);
          this.s.append((Item)this.Y);
          break;
        case 7:
          this.aP = new TextField(bb.a((short)195), dh.d(em.f(215)), 6, 0);
          this.aQ = new TextField(bb.a((short)194), dh.d(em.f(216)), 6, 0);
          this.aR = new TextField(bb.a((short)382), String.valueOf(em.f(217) / 1024), 4, 2);
          this.aS = new TextField(bb.a((short)198), em.d(115), 4, 0);
          this.s.append((Item)this.aP);
          this.s.append((Item)this.aQ);
          this.s.append((Item)this.aR);
          this.s.append((Item)this.aS);
          break;
        case 8:
          k = 0;
          this.ac = new ChoiceGroup(bb.a((short)485), 4);
          for (b = -12; b <= 13; b++)
            this.ac.append("GMT" + ((b < 0) ? "" : "+") + b + ":00", null); 
          this.ac.setSelectedIndex(em.f(222) + 12, true);
          arrayOfInt = dh.a(dh.a(false));
          this.ad = new ChoiceGroup(bb.a((short)325), 4);
          m = arrayOfInt[1];
          n = arrayOfInt[2];
          for (b1 = 0; b1 < 24; b1++)
            this.ad.append(b1 + ":" + m, null); 
          this.ad.setSelectedIndex(n, true);
          (calendar = Calendar.getInstance()).setTime(new Date());
          this.m = calendar.get(11);
          this.s.append((Item)this.ac);
          this.s.append((Item)this.ad);
          break;
        case 10:
          this.aK = dw.a(new TextField(bb.a((short)108), em.d(135), 255, 0));
          this.aL = dw.a(new TextField(bb.a((short)109), em.d(137), 255, 0));
          this.aM = dw.a(new TextField(bb.a((short)110), em.d(136), 255, 0));
          this.aN = new ChoiceGroup(null, 2);
          a(this.aN, (short)107, 36);
          a(this.aN, (short)795, 87);
          this.s.append((Item)this.aK);
          this.s.append((Item)this.aL);
          this.s.append((Item)this.aM);
          this.s.append((Item)this.aN);
          break;
        case 11:
          h();
          return;
        case 9:
          this.as = new ChoiceGroup(null, 2);
          a(this.as, (short)149, 22);
          a(this.as, (short)150, 74);
          a(this.as, (short)677, 55);
          a(this.as, (short)722, 61);
          a(this.as, (short)767, 73);
          a(this.as, (short)791, 83);
          a(this.as, (short)792, 84);
          a(this.as, (short)829, 95);
          a(this.as, (short)841, 96);
          this.at = new ChoiceGroup(bb.a((short)840), 4);
          this.at.append("Standart", null);
          this.at.append("Archive", null);
          this.at.append("Crypto", null);
          this.at.setSelectedIndex(em.f(258), true);
          this.aF = new ChoiceGroup(bb.a((short)124), Jimm.i ? 1 : 4);
          this.aF.append(bb.a((short)349), null);
          this.aF.append(bb.a((short)554), null);
          this.aF.append(bb.a((short)672), null);
          if (em.h(35)) {
            this.aF.setSelectedIndex(1, true);
          } else {
            this.aF.setSelectedIndex(0, true);
          } 
          this.aG = new TextField(null, em.d(134), 255, 0);
          this.aC = new TextField(bb.a((short)451), em.d(133), 20, 65536);
          this.aO = new Gauge(bb.a((short)833), true, 9, em.f(257) - 1);
          this.s.append((Item)this.as);
          this.s.append((Item)this.aO);
          this.s.append((Item)this.aF);
          this.s.append((Item)this.aG);
          this.s.append((Item)this.aC);
          this.s.append((Item)this.at);
          break;
        case 12:
          this.av = new ChoiceGroup(null, 2);
          a(this.av, (short)205, 20);
          a(this.av, (short)134, 23);
          a(this.av, (short)104, 24);
          a(this.av, (short)119, 25);
          a(this.av, (short)152, 53);
          if (cd.n && cd.f()) {
            a(this.av, (short)778, 31);
            a(this.av, (short)113, 32);
          } 
          k = 9;
          str = "0.6";
          try {
            k = em.f(219);
            str = em.d(132);
          } catch (Exception exception) {}
          this.aA = dw.a(new TextField("" + bb.a((short)289), str, 200, 0));
          this.aB = new TextField("" + bb.a((short)290), "" + k, 5, 2);
          this.T = new ChoiceGroup(bb.a((short)115), 2);
          a(this.T, (short)116, 28);
          a(this.T, (short)117, 29);
          a(this.T, (short)725, 64);
          this.U = new TextField(bb.a((short)118), String.valueOf(em.f(237)), 3, 2);
          this.a = new ChoiceGroup(bb.a((short)699), 4);
          this.a.append(bb.a((short)501), null);
          this.a.append(bb.a((short)521), null);
          this.a.append(bb.a((short)513), null);
          this.a.append(bb.a((short)518), null);
          this.a.setSelectedIndex(em.f(241), true);
          a(this.T, (short)781, 75);
          this.s.append((Item)this.av);
          this.s.append((Item)this.aA);
          this.s.append((Item)this.aB);
          this.s.append((Item)this.T);
          this.s.append((Item)this.U);
          this.s.append((Item)this.a);
          break;
        case 13:
          this.ab = new ChoiceGroup(bb.a((short)261), 4);
          this.ab.append(bb.a((short)262), null);
          this.ab.append(bb.a((short)263), null);
          this.ab.setSelectedIndex(em.f(229), true);
          this.aa = new ChoiceGroup(bb.a((short)704), 4);
          this.aa.append(bb.a((short)806), null);
          this.aa.append(bb.a((short)706), null);
          this.aa.append(bb.a((short)705), null);
          if ((m = em.f(203)) < 9)
            m = 9; 
          m -= 9;
          if (m < this.aa.size())
            this.aa.setSelectedIndex(m, true); 
          if (System.getProperty("video.snapshot.encodings") != null) {
            this.P = new ChoiceGroup(bb.a((short)799), 1);
            this.O = new ChoiceGroup(bb.a((short)800), 1);
            String[] arrayOfString = dh.a(System.getProperty("video.snapshot.encodings"), ' ');
            for (byte b2 = 0; b2 < arrayOfString.length; b2++) {
              String[] arrayOfString1 = dh.a(arrayOfString[b2], '&');
              String str1 = null;
              String str2 = null;
              for (byte b3 = 0; b3 < arrayOfString1.length; b3++) {
                String[] arrayOfString2;
                if ((arrayOfString2 = dh.a(arrayOfString1[b3], '='))[0].equals("encoding")) {
                  boolean bool1 = false;
                  for (byte b4 = 0; b4 < this.P.size(); b4++) {
                    if (this.P.getString(b4).equals(arrayOfString2[1]))
                      bool1 = true; 
                  } 
                  if (!bool1)
                    this.P.append(arrayOfString2[1], null); 
                } else if (arrayOfString2[0].equals("width")) {
                  str1 = arrayOfString2[1];
                } else if (arrayOfString2[0].equals("height")) {
                  str2 = arrayOfString2[1];
                } 
              } 
              if (str1 != null && str2 != null)
                this.O.append(str1 + " x " + str2, null); 
            } 
            try {
              if (this.O.size() > 0)
                this.O.setSelectedIndex(em.f(253), true); 
              if (this.P.size() > 0)
                this.P.setSelectedIndex(em.f(252), true); 
            } catch (Exception exception) {}
          } 
          this.s.append((Item)this.ab);
          if (System.getProperty("video.snapshot.encodings") != null) {
            this.s.append((Item)this.P);
            this.s.append((Item)this.O);
          } 
          this.s.append((Item)this.aa);
          break;
        case 14:
          this.bi = new ChoiceGroup(null, 2);
          a(this.bi, (short)76, 34);
          a(this.bi, (short)723, 60);
          a(this.bi, (short)730, 67);
          a(this.bi, (short)731, 68);
          a(this.bi, (short)729, 66);
          a(this.bi, (short)716, 62);
          a(this.bi, (short)717, 63);
          this.s.append((Item)this.bi);
          this.bm = new TextField(bb.a((short)720), "" + em.f(246), 5, 2);
          this.s.append((Item)this.bm);
          this.bj = dw.a(new TextField(bb.a((short)678), em.d(146), 100, 0));
          this.s.append((Item)this.bj);
          this.bk = new ChoiceGroup(bb.a((short)714), 4);
          this.bk.append(bb.a((short)349), null);
          this.bk.append(bb.a((short)123), null);
          this.bk.append(bb.a((short)439), null);
          this.bk.setSelectedIndex(em.f(245), true);
          this.s.append((Item)this.bk);
          this.bl = new TextField(null, em.d(111), 32, 0);
          this.s.append((Item)this.bl);
          break;
        case 15:
          this.bo = new ChoiceGroup(null, 2);
          a(this.bo, (short)759, 69);
          a(this.bo, (short)760, 70);
          a(this.bo, (short)761, 71);
          this.s.append((Item)this.bo);
          break;
      } 
      Jimm.d.setCurrent((Displayable)this.s);
      return;
    } 
    if (paramCommand == dw.f) {
      if (paramDisplayable == this.s || this.be.i()) {
        this.r.b(Jimm.d);
        return;
      } 
      if (this.bv)
        cd.d(); 
      em.y = null;
      cy.f();
      return;
    } 
    if (paramCommand == this.o) {
      int i;
      byte b;
      boolean bool1;
      int j;
      byte b1;
      int k;
      boolean bool2;
      boolean bool3;
      int m;
      int n;
      int i1;
      switch (this.r.A()) {
        case 0:
          l();
          k();
          break;
        case 1:
          em.b(101, this.v.getString());
          em.b(102, this.w.getString());
          em.a(251, Integer.parseInt(this.x.getString()));
          em.a(202, this.B.getSelectedIndex());
          em.a(0, this.y.isSelected(0));
          em.b(103, this.z.getString());
          em.a(41, this.A.isSelected(0));
          if (this.A.isSelected(1)) {
            em.a(201, 1);
          } else {
            em.a(201, 0);
          } 
          em.a(1, this.A.isSelected(2));
          em.a(3, this.A.isSelected(3));
          em.a(85, this.A.isSelected(4));
          em.a(2, this.A.isSelected(5));
          em.a(204, Integer.parseInt(this.C.getString()));
          i = this.bn.getSelectedIndex();
          em.a(247, i);
          break;
        case 2:
          em.a(221, this.aV.getSelectedIndex());
          em.b(138, this.aW.getString());
          em.b(139, this.aX.getString());
          em.b(141, this.aY.getString());
          em.b(142, this.aZ.getString());
          em.b(140, this.ba.getString());
          break;
        case 3:
          if (bb.a.length > 1)
            em.b(106, bb.a[this.D.getSelectedIndex()]); 
          b = 0;
          em.a(42, this.E.isSelected(0));
          bool1 = this.E.isSelected(1);
          em.a(26, this.E.isSelected(2));
          bd.x();
          em.a(77, this.E.isSelected(3));
          em.a(80, this.E.isSelected(4));
          em.a(57, this.E.isSelected(5));
          em.a(58, this.E.isSelected(6));
          em.a(65, this.E.isSelected(7));
          em.a(72, this.E.isSelected(8));
          em.a(76, this.E.isSelected(9));
          em.a(82, this.E.isSelected(10));
          em.a(5, this.F.isSelected(0));
          j = this.G.getSelectedIndex();
          em.a(254, this.I.getSelectedIndex());
          em.a(259, this.au.getSelectedIndex());
          b1 = em.a[this.J.getSelectedIndex()];
          if (em.f(255) != b1)
            em.a(255, b1); 
          k = this.H.getSelectedIndex();
          em.a(236, k);
          bi.a.z = k + 1;
          em.a(248, this.K.getSelectedIndex());
          bool2 = this.aT.isSelected(0);
          bool3 = this.aT.isSelected(1);
          em.a(205, j);
          em.a(7, bool3);
          em.a(8, this.aT.isSelected(2));
          em.a(9, this.aT.isSelected(3));
          em.a(48, this.L.isSelected(0));
          em.a(49, this.L.isSelected(1));
          em.a(52, this.L.isSelected(2));
          em.a(50, this.L.isSelected(3));
          em.a(78, this.L.isSelected(4));
          em.a(51, this.L.isSelected(5));
          b = 0;
          b++;
          em.a(15, this.S.isSelected(0));
          b++;
          em.a(19, this.S.isSelected(1));
          b++;
          em.a(21, this.S.isSelected(2));
          b++;
          em.a(38, this.S.isSelected(3));
          b++;
          em.a(39, this.S.isSelected(4));
          b++;
          em.a(40, this.S.isSelected(5));
          b++;
          em.a(17, this.S.isSelected(6));
          b++;
          em.a(79, this.S.isSelected(7));
          b++;
          em.a(18, this.S.isSelected(8));
          b++;
          em.a(14, this.S.isSelected(9));
          b++;
          em.a(94, this.S.isSelected(10));
          if (!Jimm.i && !Jimm.j) {
            b++;
            boolean bool4 = this.S.isSelected(11);
            if (em.h(27) != bool4) {
              em.a(27, bool4);
              d();
            } 
          } 
          em.a(86, this.S.isSelected(b++));
          em.a(91, this.S.isSelected(b++));
          em.a(92, this.S.isSelected(b));
          if (Jimm.k)
            em.a(227, Integer.parseInt(this.aD.getString())); 
          if (Jimm.i)
            em.a(228, Integer.parseInt(this.aE.getString())); 
          bd.b();
          em.a(16, bool2);
          bi.a((bool2 != this.k || bool3 != this.l));
          if (Jimm.l)
            em.a(220, Integer.parseInt(this.aU.getString())); 
          if (Jimm.k)
            em.a(226, this.ah.getValue() * 10); 
          if (!this.n.equals(em.d(106)))
            em.a(47, true); 
          em.a(242, this.M.getSelectedIndex());
          bd.b(bool1);
          em.a(81, bool1);
          break;
        case 19:
          b = 0;
          em.a(88, this.E.isSelected(0));
          em.a(89, this.E.isSelected(1));
          em.a(90, this.E.isSelected(2));
          em.a(260, this.aH.getValue());
          em.a(261, this.aI.getValue());
          em.a(262, this.aJ.getValue());
          em.a(263, this.M.getSelectedIndex());
          em.c();
          break;
        case 17:
          em.a(239, this.Q.getSelectedIndex());
          em.a(240, this.R.getSelectedIndex());
          em.a(244, this.N.getSelectedIndex());
          break;
        case 16:
          em.a(243, 255 - this.ae.getValue() * 17);
          em.a(249, 255 - this.af.getValue() * 17);
          em.a(250, 255 - this.ag.getValue() * 17);
          break;
        case 6:
          em.a(206, this.ai.getSelectedIndex());
          em.a(211, this.W.getSelectedIndex());
          em.b(114, this.X.getString());
          em.a(207, this.aj.getSelectedIndex());
          em.a(208, this.ak.getSelectedIndex());
          em.a(209, this.al.getSelectedIndex());
          em.a(210, this.am.getValue() * 10);
          em.b(107, this.an.getString());
          em.b(108, this.ao.getString());
          em.b(109, this.ap.getString());
          em.b(110, this.aq.getString());
          em.a(11, this.aw.isSelected(0));
          em.a(12, this.aw.isSelected(1));
          em.a(213, Integer.parseInt(this.ax.getString()));
          em.a(13, this.ay.isSelected(0));
          em.a(214, Integer.parseInt(this.az.getString()));
          em.a(10, this.ar.isSelected(0));
          em.a(224, this.V.getSelectedIndex());
          em.a(44, this.Y.isSelected(0));
          em.a(45, this.Y.isSelected(1));
          em.a(46, this.Y.isSelected(2));
          break;
        case 7:
          em.a(215, dh.g(this.aP.getString()));
          this.aP.setString(dh.d(em.f(215)));
          em.a(216, dh.g(this.aQ.getString()));
          this.aQ.setString(dh.d(em.f(216)));
          em.a(217, Integer.parseInt(this.aR.getString()) * 1024);
          em.b(115, this.aS.getString());
          break;
        case 8:
          m = this.ac.getSelectedIndex() - 12;
          em.a(222, m);
          if ((n = this.ad.getSelectedIndex() - m) < 0)
            n += 24; 
          if (n >= 24)
            n -= 24; 
          for (i1 = n - this.m; i1 >= 12; i1 -= 24);
          while (i1 < -12)
            i1 += 24; 
          em.a(223, i1);
          break;
        case 10:
          em.b(135, this.aK.getString());
          em.b(137, this.aL.getString());
          em.b(136, this.aM.getString());
          em.a(36, this.aN.isSelected(0));
          em.a(87, this.aN.isSelected(1));
          break;
        case 9:
          b = 0;
          em.a(22, this.as.isSelected(0));
          em.a(74, this.as.isSelected(1));
          em.a(55, this.as.isSelected(2));
          em.a(61, this.as.isSelected(3));
          em.a(73, this.as.isSelected(4));
          em.a(83, this.as.isSelected(5));
          em.a(84, this.as.isSelected(6));
          em.a(95, this.as.isSelected(7));
          em.a(96, this.as.isSelected(8));
          em.a(257, this.aO.getValue() + 1);
          em.a(258, this.at.getSelectedIndex());
          em.a(35, this.aF.isSelected(1));
          if (this.aF.isSelected(0)) {
            em.b(134, "/back.png");
            this.aG.setString("/back.png");
            bd.a((InputStream)null, true);
          } 
          em.b(134, this.aG.getString());
          em.b(133, this.aC.getString());
          break;
        case 12:
          b = 0;
          em.a(20, this.av.isSelected(0));
          em.a(23, this.av.isSelected(1));
          em.a(24, this.av.isSelected(2));
          em.a(25, this.av.isSelected(3));
          em.a(53, this.av.isSelected(4));
          if (cd.n && cd.f()) {
            em.a(31, this.av.isSelected(5));
            em.a(32, this.av.isSelected(6));
          } 
          em.b(132, this.aA.getString());
          em.a(219, Integer.parseInt(this.aB.getString()));
          em.a(28, this.T.isSelected(0));
          em.a(29, this.T.isSelected(1));
          em.a(64, this.T.isSelected(2));
          em.a(75, this.T.isSelected(3));
          em.a(237, Integer.parseInt(this.U.getString()));
          ew.a = em.f(237) * 60000;
          em.a(241, this.a.getSelectedIndex());
          bool = true;
          break;
        case 13:
          em.a(229, this.ab.getSelectedIndex());
          em.a(203, this.aa.getSelectedIndex() + 9);
          if (System.getProperty("video.snapshot.encodings") != null) {
            em.a(252, this.P.getSelectedIndex());
            em.a(253, this.O.getSelectedIndex());
          } 
          break;
        case 14:
          b = 0;
          em.a(34, this.bi.isSelected(0));
          em.a(60, this.bi.isSelected(1));
          em.a(67, this.bi.isSelected(2));
          em.a(68, this.bi.isSelected(3));
          em.a(66, this.bi.isSelected(4));
          em.a(62, this.bi.isSelected(5));
          em.a(63, this.bi.isSelected(6));
          em.b(146, this.bj.getString());
          em.a(245, this.bk.getSelectedIndex());
          em.a(246, Integer.parseInt(this.bm.getString()));
          em.b(111, this.bl.getString());
          break;
        case 15:
          b = 0;
          em.a(69, this.bo.isSelected(0));
          em.a(70, this.bo.isSelected(1));
          em.a(71, this.bo.isSelected(2));
          break;
        case 4:
          em.b(147, "Custom");
          break;
      } 
      em.b(3);
      bd.P = 0;
      if (bool) {
        cd.m();
        m();
      } 
      c();
      return;
    } 
    if (paramCommand == this.p) {
      em.a(59, true);
      f();
      return;
    } 
    if (paramCommand == this.q) {
      em.a(59, false);
      f();
      return;
    } 
    if (paramCommand == this.bp) {
      l();
      this.bs.addElement(em.r);
      this.bt.addElement(em.r);
      n();
      j();
      return;
    } 
    if (paramCommand == this.bq) {
      l();
      int i;
      String[] arrayOfString = new String[i = this.bs.size()];
      for (byte b = 0; b < i; b++)
        arrayOfString[b] = a(this.bs.elementAt(b)); 
      dw.a(bb.a((short)212), arrayOfString, this, 1);
      return;
    } 
    if (dw.a(paramCommand, 1) == 1) {
      l();
      int i = dw.l();
      this.bs.removeElementAt(i);
      this.bt.removeElementAt(i);
      n();
      j();
      Jimm.d.setCurrent((Displayable)this.s);
    } 
  }
  
  public static void d() {
    if (em.h(27)) {
      dw.t = new Command(bb.a((short)17), 3, 1);
      dw.e = new Command(bb.a((short)11), 8, 14);
      return;
    } 
    dw.e = new Command(bb.a((short)11), Jimm.j ? 3 : 2, 14);
    dw.t = new Command(bb.a((short)17), 4, 1);
  }
  
  private static Image a(int paramInt1, int paramInt2) {
    int i = em.f(254);
    em.a(254, paramInt2);
    Image image = Image.createImage(paramInt1, paramInt1);
    bd.U = paramInt2;
    switch (paramInt2) {
      case 0:
        bd.b(image.getGraphics(), em.d[4], bd.e(em.d[4], -128), 0, 0, paramInt1 - 1, paramInt1 - 1, 255);
        em.a(254, i);
        return image;
      case 1:
      case 2:
      case 3:
      case 4:
        bd.a(image.getGraphics(), em.d[4], em.d[0], 0, 0, paramInt1 - 1, paramInt1 - 1, 255);
        em.a(254, i);
        return image;
    } 
    bd.b(image.getGraphics(), em.d[4], em.d[0], 0, 0, paramInt1 - 1, paramInt1 - 1, 255);
    em.a(254, i);
    return image;
  }
  
  private static void m() {
    if (cd.f())
      try {
        eu.b();
        eu.a(cd.l() | (int)em.i(300));
        return;
      } catch (Exception exception) {} 
  }
  
  private void n() {
    this.s.removeCommand(this.bp);
    this.s.removeCommand(this.bq);
    this.s.deleteAll();
  }
  
  public static be a(bv parambv) {
    return parambv.bf;
  }
  
  class es implements bx {
    private final bv a;
    
    public es(bv this$0) {
      this.a = this$0;
    }
    
    public final void a(bd param1bd, int param1Int1, int param1Int2) {
      if (param1Int2 == 1) {
        if (param1Int1 == 42) {
          this.a.c = this.a.c + 1 & 0x7;
          a(param1bd);
          bd.a_();
        } 
        if (param1Int1 == 35) {
          this.a.e = (this.a.e + 1) % 6;
          a(param1bd);
          bd.a_();
        } 
        if (param1Int1 == 48) {
          if (this.a.c == 0) {
            this.a.c = 7;
          } else {
            this.a.c = 0;
          } 
          this.a.e = 0;
          a(param1bd);
          bd.a_();
        } 
      } 
    }
    
    public final void f(int param1Int) {}
    
    public final void a(bd param1bd) {
      if (dw.a(bv.a(this.a))) {
        System.arraycopy(this.a.g, 0, em.d, 0, em.d.length);
        System.arraycopy(this.a.i, 0, em.u, 0, em.u.length);
        System.arraycopy(this.a.h, 0, em.v, 0, em.v.length);
        em.t[47] = "Standart";
        int i;
        if ((i = bv.a(this.a).A()) != 0)
          if (i == -100 || i == -101) {
            System.arraycopy(em.c, 0, em.d, 0, em.c.length);
            boolean bool = (i == -101) ? true : false;
            em.v[54] = 0;
            em.u[82] = bool;
            em.v[44] = bool ? 1 : 0;
            em.t[47] = "LocID Theme";
            em.v[40] = bool ? 1 : 0;
          } else if (i > 0) {
            int[] arrayOfInt = this.a.b.elementAt(i - 1);
            em.a(this.a.f, arrayOfInt[0], arrayOfInt[1]);
          }  
        if (this.a.c > 0 || this.a.e > 0) {
          this.a.d = true;
          for (byte b = 0; b < em.d.length; b++) {
            if (b != 23 || em.d[b] != 0) {
              if ((this.a.c & 0x1) != 0)
                em.d[b] = em.d[b] ^ 0xFF; 
              if ((this.a.c & 0x2) != 0)
                em.d[b] = em.d[b] ^ 0xFF00; 
              if ((this.a.c & 0x4) != 0)
                em.d[b] = em.d[b] ^ 0xFF0000; 
              if (this.a.e > 0) {
                int j = (em.d[b] & 0xFF0000) >> 16;
                int k = (em.d[b] & 0xFF00) >> 8;
                int m = em.d[b] & 0xFF;
                switch (this.a.e) {
                  case 1:
                    em.d[b] = (k << 16) + (j << 8) + m;
                    break;
                  case 2:
                    em.d[b] = (j << 16) + (m << 8) + k;
                    break;
                  case 3:
                    em.d[b] = (m << 16) + (j << 8) + k;
                    break;
                  case 4:
                    em.d[b] = (k << 16) + (m << 8) + j;
                    break;
                  case 5:
                    em.d[b] = (m << 16) + (k << 8) + j;
                    break;
                } 
              } 
            } 
          } 
        } 
        if (this.a.d) {
          byte b1 = ((this.a.c & 0x4) != 0) ? 82 : 114;
          byte b2 = ((this.a.c & 0x2) != 0) ? 71 : 103;
          byte b3 = ((this.a.c & 0x1) != 0) ? 66 : 98;
          String str = "" + b1 + b2 + b3;
          switch (this.a.e) {
            case 1:
              str = "" + b2 + b1 + b3;
              break;
            case 2:
              str = "" + b1 + b3 + b2;
              break;
            case 3:
              str = "" + b3 + b1 + b2;
              break;
            case 4:
              str = "" + b2 + b3 + b1;
              break;
            case 5:
              str = "" + b3 + b2 + b1;
              break;
          } 
          bv.a(this.a).a_(str);
          em.t[47] = em.t[47] + " [" + str + "]";
        } 
        bv.a(this.a).u(em.d[1]);
        bv.a(this.a).v(em.v[40]);
      } 
    }
    
    public final void b(bd param1bd) {}
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */