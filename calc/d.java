package calc;

import favax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class d extends Canvas implements CommandListener {
  public char[] a = new char[] { 
      ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', 
      '9', '.', '/', '-', '*', '+', '(', ')', 'q', 'v', 
      's', 'h', 't', 'x', 'n', 'g', 'd', '!', 'V', 'Q', 
      'm', 'i', 'o', 'j', 'p', 'b', 'e', 'R', 'X', 'W', 
      'Y', 'S', 'H', 'T', 'I', 'O', 'J', '_' };
  
  public char[] b = new char[] { 
      ' ', 'A', 'B', 'C', 'D', 'E', 'F', ' ', ' ', '\\', 
      '|', '&', '%', '#', '$', '>', '<' };
  
  public String c = "123456789.0Ks*/h+-t()qvKingoxmjdpQVKSIWHObTJ!XYK123456789F0KA*\\B+-C()DEK|&%#$Q><!XWK1*\\q+-1()00K";
  
  public Command d = new Command(" = ", 4, 0);
  
  public Command e = new Command("DEL", 3, 0);
  
  public Command f = new Command("Settings", 8, 1);
  
  public Command g = new Command("ANS -> X", 8, 1);
  
  public Command h = new Command("ANS -> Y", 8, 1);
  
  public Command i = new Command("Constants", 8, 1);
  
  public Command j = new Command("Number Format", 8, 1);
  
  public Command k = new Command("Clear", 8, 1);
  
  public Command l = new Command("About", 8, 1);
  
  public Command m = new Command("Convert ANS", 8, 1);
  
  public Command n = new Command("Past ANS", 8, 1);
  
  public Command o = new Command("ANS to a b/c", 8, 1);
  
  public Command p = new Command("ANS to A/b", 8, 1);
  
  public Command q = new Command("Exit", 8, 1);
  
  public boolean r = false;
  
  public byte s;
  
  public byte t;
  
  public byte u;
  
  public Image v;
  
  public Image w;
  
  public Image x;
  
  public Image y;
  
  public Image z;
  
  public Image A;
  
  public Image B;
  
  public Image C;
  
  public Image D;
  
  public Image E;
  
  public Image[] F;
  
  public Image G;
  
  public Image H;
  
  public Image I;
  
  public Image J;
  
  public Image K;
  
  public Image[] L;
  
  public Image M;
  
  public Image N;
  
  public Image O;
  
  public Graphics P;
  
  public Graphics Q;
  
  public Graphics R;
  
  public Graphics S;
  
  public int T;
  
  public int U;
  
  public int V;
  
  public int W;
  
  public boolean Z;
  
  public boolean aa;
  
  public boolean ab;
  
  public boolean ac;
  
  public boolean ad;
  
  public boolean ae;
  
  public boolean af;
  
  public int ag;
  
  public String ah;
  
  public c ai;
  
  public d() throws Exception {
    System.out.println("FACE CONSTR START");
    try {
      this.v = Image.createImage("/font3.png");
      this.w = Image.createImage("/font4.png");
      this.x = Image.createImage("/deg.png");
      this.y = Image.createImage("/rad.png");
      this.z = Image.createImage("/gra.png");
      this.A = Image.createImage("/arc.png");
      this.E = Image.createImage("/hex.png");
      this.C = Image.createImage("/bin.png");
      this.D = Image.createImage("/oct.png");
      this.B = Image.createImage("/dec.png");
      this.F = new Image[8];
      byte b;
      for (b = 0; b < 8; b++)
        this.F[b] = Image.createImage("/level" + Integer.toString(b) + ".png"); 
      this.L = new Image[9];
      for (b = 0; b < 9; b++)
        this.L[b] = Image.createImage("/" + Integer.toString(b + 1) + ".png"); 
      this.I = Image.createImage("/x0.png");
      this.H = Image.createImage("/x1.png");
      this.K = Image.createImage("/y0.png");
      this.J = Image.createImage("/y1.png");
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    this.t = 0;
    this.af = true;
    this.ag = 0;
    this.U = 0;
    this.s = 0;
    this.u = 0;
    this.V = 0;
    this.W = 0;
    b.b.b = getWidth() / 8;
    this.M = Image.createImage(getWidth(), 10);
    this.N = Image.createImage(getWidth(), 10);
    this.O = Image.createImage(8, 10);
    this.G = Image.createImage(25, 10);
    this.P = this.M.getGraphics();
    this.Q = this.N.getGraphics();
    this.R = this.O.getGraphics();
    this.S = this.G.getGraphics();
    this.ah = "0";
    this.T = (b.b(26) > 1) ? 4 : ((b.b(26) == 1) ? 7 : 0);
    if (b.c(1))
      addCommand(this.e); 
    if (b.c(0))
      addCommand(this.d); 
    addCommand(this.f);
    if (b.c(6))
      addCommand(this.m); 
    if (b.c(10))
      addCommand(this.n); 
    if (b.c(2))
      addCommand(this.g); 
    if (b.c(3))
      addCommand(this.h); 
    if (b.c(4))
      addCommand(this.i); 
    if (b.c(5))
      addCommand(this.j); 
    if (b.c(8))
      addCommand(this.o); 
    if (b.c(7))
      addCommand(this.p); 
    if (b.c(9))
      addCommand(this.k); 
    addCommand(this.l);
    addCommand(this.q);
    setCommandListener(this);
  }
  
  public final void paint(Graphics paramGraphics) {
    int i = getWidth();
    int j = getHeight();
    int k = i / 48;
    int m = (j - 50) / 40;
    int n = (j - 48 - 4 * m) / 4;
    int i1 = (i - 4 * k) / 3;
    int i2 = k;
    int i3 = 47 + m;
    if (this.af) {
      paramGraphics.setColor(0, 0, 0);
      paramGraphics.fillRect(0, 0, i, 5);
      paramGraphics.setColor(255, 255, 255);
      paramGraphics.fillRect(0, 21, i, 12);
      paramGraphics.setColor(117, 117, 117);
      paramGraphics.drawLine(0, 33, i, 33);
      paramGraphics.drawRect(0, 19, i, 1);
      paramGraphics.setColor(20, 131, 141);
      paramGraphics.fillRect(0, 34, i, j);
      switch (b.b(23)) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
          paramGraphics.drawImage(this.A, i - k - 28, 34, 0);
          break;
      } 
      switch (b.b(26)) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
          paramGraphics.drawImage(this.E, 2 * k + 11, 34, 0);
          break;
      } 
      paramGraphics.drawImage((b.a(41).length() > 0 && !b.a(41).equals("0")) ? this.H : this.I, i - 3 * k - 50, 34, 0);
      paramGraphics.drawImage((b.a(42).length() > 0 && !b.a(42).equals("0")) ? this.J : this.K, i - 2 * k - 39, 34, 0);
      for (byte b = 0; b < 12; b++) {
        paramGraphics.setColor(0, 0, 0);
        paramGraphics.drawRect(i2, i3, i1, n);
        paramGraphics.setColor(0, 65, 84);
        paramGraphics.fillRect(i2, i3, i1, n);
        if (b == 2 || b == 5 || b == 8) {
          i2 = k;
          i3 = i3 + n + m;
        } else {
          i2 = i2 + i1 + k;
        } 
      } 
    } 
    if (this.ab || this.af)
      paramGraphics.drawImage(this.L[this.t], k, 34, 0); 
    if (this.ac || this.af) {
      paramGraphics.setColor(0, 0, (this.V > 0) ? 255 : 0);
      paramGraphics.drawLine(3, 1, 3, 3);
      paramGraphics.drawLine(2, 2, 2, 2);
      paramGraphics.setColor(0, 0, (b.a[b.b(26)][this.t].length() - this.V > i / 8) ? 255 : 0);
      paramGraphics.drawLine(i - 3, 1, i - 3, 3);
      paramGraphics.drawLine(i - 2, 2, i - 2, 2);
      a(b.a[b.b(26)][this.t].substring(this.V, (this.V + i / 8 < b.a[b.b(26)][this.t].length()) ? (this.V + i / 8) : b.a[b.b(26)][this.t].length()), this.P, false);
      paramGraphics.drawImage(this.M, 0, 7, 0);
    } 
    if (this.ae || this.af) {
      paramGraphics.setColor(255, 255, 255);
      paramGraphics.drawRect(0, 5, i, 1);
      paramGraphics.drawRect(0, 17, i, 1);
      paramGraphics.setColor(0, 0, 0);
      if (!this.r) {
        paramGraphics.drawLine(this.W * 8, 18, this.W * 8 + 8, 18);
      } else {
        paramGraphics.drawRect(this.W * 8, 5, 8, 1);
        paramGraphics.drawRect(this.W * 8, 17, 8, 1);
      } 
    } 
    if (this.ad || this.af) {
      a(this.ah, this.Q, b.c(11));
      paramGraphics.drawImage(this.N, 0, 22, 0);
    } 
    if (this.aa || this.af) {
      i2 = k;
      i3 = 47 + m;
      for (byte b = 0; b < 12; b++) {
        int i4 = b;
        int i5 = 0;
        int i6;
        if ((i6 = i4 / 2) > 0) {
          i4 -= 2 * i6;
          i5 = -10 * i6;
        } 
        i4 = -25 * i4;
        this.S.setColor(0, 65, 84);
        this.S.fillRect(0, 0, 25, 10);
        this.S.drawImage(this.F[this.T], i4, i5, 0);
        paramGraphics.drawImage(this.G, i2 + i1 / 2 - 12, i3 + n / 2 - 5, 0);
        if ((i2 = i2 + i1 + k) + i1 / 2 - 12 > i) {
          i2 = k;
          i3 = i3 + n + m;
        } 
      } 
    } 
    this.ad = false;
    this.ae = false;
    this.ab = false;
    this.ac = false;
    this.aa = false;
    this.af = true;
  }
  
  private void a(String paramString, Graphics paramGraphics, boolean paramBoolean) {
    int i = paramString.length() * 8;
    boolean bool = false;
    for (byte b = 0; b < paramString.length(); b++) {
      int j = b(paramString.charAt(b));
      bool = ((j = a(paramString.charAt(b))) < 0) ? false : true;
      int k = j - 1;
      int m = 0;
      int n;
      if ((n = k / 8) > 0) {
        k -= 8 * n;
        m = -10 * n;
      } 
      k = -8 * k;
      this.R.drawImage(bool ? this.v : this.w, k, m, 0);
      k = !paramBoolean ? (b * 8) : ((k = (k = b * 8) + getWidth()) - i);
      paramGraphics.drawImage(this.O, k, 0, 0);
    } 
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.fillRect(0, 0, !paramBoolean ? getWidth() : (getWidth() - i), 10);
  }
  
  private int a(char paramChar) {
    for (byte b = 1; b < this.a.length; b++) {
      if (paramChar == this.a[b])
        return b; 
    } 
    return -1;
  }
  
  private int b(char paramChar) {
    for (byte b = 1; b < this.b.length; b++) {
      if (paramChar == this.b[b])
        return b; 
    } 
    return this.b.length;
  }
  
  private void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield s : B
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield u : B
    //   10: getstatic calc/b.a : [[Ljava/lang/String;
    //   13: bipush #26
    //   15: invokestatic b : (I)I
    //   18: aaload
    //   19: aload_0
    //   20: getfield t : B
    //   23: aaload
    //   24: invokevirtual length : ()I
    //   27: ifle -> 255
    //   30: aload_0
    //   31: getfield U : I
    //   34: getstatic calc/b.a : [[Ljava/lang/String;
    //   37: bipush #26
    //   39: invokestatic b : (I)I
    //   42: aaload
    //   43: aload_0
    //   44: getfield t : B
    //   47: aaload
    //   48: invokevirtual length : ()I
    //   51: if_icmpge -> 255
    //   54: aload_0
    //   55: getfield r : Z
    //   58: ifne -> 255
    //   61: new java/lang/String
    //   64: dup
    //   65: getstatic calc/b.a : [[Ljava/lang/String;
    //   68: bipush #26
    //   70: invokestatic b : (I)I
    //   73: aaload
    //   74: aload_0
    //   75: getfield t : B
    //   78: aaload
    //   79: aload_0
    //   80: getfield U : I
    //   83: getstatic calc/b.a : [[Ljava/lang/String;
    //   86: bipush #26
    //   88: invokestatic b : (I)I
    //   91: aaload
    //   92: aload_0
    //   93: getfield t : B
    //   96: aaload
    //   97: invokevirtual length : ()I
    //   100: invokevirtual substring : (II)Ljava/lang/String;
    //   103: invokespecial <init> : (Ljava/lang/String;)V
    //   106: astore_2
    //   107: aload_0
    //   108: getfield U : I
    //   111: ifle -> 211
    //   114: getstatic calc/b.a : [[Ljava/lang/String;
    //   117: bipush #26
    //   119: invokestatic b : (I)I
    //   122: aaload
    //   123: aload_0
    //   124: getfield t : B
    //   127: getstatic calc/b.a : [[Ljava/lang/String;
    //   130: bipush #26
    //   132: invokestatic b : (I)I
    //   135: aaload
    //   136: aload_0
    //   137: getfield t : B
    //   140: aaload
    //   141: iconst_0
    //   142: aload_0
    //   143: getfield U : I
    //   146: invokevirtual substring : (II)Ljava/lang/String;
    //   149: aastore
    //   150: getstatic calc/b.a : [[Ljava/lang/String;
    //   153: bipush #26
    //   155: invokestatic b : (I)I
    //   158: aaload
    //   159: aload_0
    //   160: getfield t : B
    //   163: getstatic calc/b.a : [[Ljava/lang/String;
    //   166: bipush #26
    //   168: invokestatic b : (I)I
    //   171: aaload
    //   172: aload_0
    //   173: getfield t : B
    //   176: aaload
    //   177: aload_0
    //   178: getfield c : Ljava/lang/String;
    //   181: bipush #12
    //   183: aload_0
    //   184: getfield T : I
    //   187: imul
    //   188: iload_1
    //   189: iadd
    //   190: iconst_1
    //   191: isub
    //   192: bipush #12
    //   194: aload_0
    //   195: getfield T : I
    //   198: imul
    //   199: iload_1
    //   200: iadd
    //   201: invokevirtual substring : (II)Ljava/lang/String;
    //   204: aload_2
    //   205: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   208: goto -> 586
    //   211: getstatic calc/b.a : [[Ljava/lang/String;
    //   214: bipush #26
    //   216: invokestatic b : (I)I
    //   219: aaload
    //   220: aload_0
    //   221: getfield t : B
    //   224: aload_0
    //   225: getfield c : Ljava/lang/String;
    //   228: bipush #12
    //   230: aload_0
    //   231: getfield T : I
    //   234: imul
    //   235: iload_1
    //   236: iadd
    //   237: iconst_1
    //   238: isub
    //   239: bipush #12
    //   241: aload_0
    //   242: getfield T : I
    //   245: imul
    //   246: iload_1
    //   247: iadd
    //   248: invokevirtual substring : (II)Ljava/lang/String;
    //   251: aload_2
    //   252: goto -> 586
    //   255: getstatic calc/b.a : [[Ljava/lang/String;
    //   258: bipush #26
    //   260: invokestatic b : (I)I
    //   263: aaload
    //   264: aload_0
    //   265: getfield t : B
    //   268: aaload
    //   269: invokevirtual length : ()I
    //   272: ifle -> 503
    //   275: aload_0
    //   276: getfield U : I
    //   279: getstatic calc/b.a : [[Ljava/lang/String;
    //   282: bipush #26
    //   284: invokestatic b : (I)I
    //   287: aaload
    //   288: aload_0
    //   289: getfield t : B
    //   292: aaload
    //   293: invokevirtual length : ()I
    //   296: if_icmpge -> 503
    //   299: aload_0
    //   300: getfield r : Z
    //   303: iconst_1
    //   304: if_icmpne -> 503
    //   307: new java/lang/String
    //   310: dup
    //   311: getstatic calc/b.a : [[Ljava/lang/String;
    //   314: bipush #26
    //   316: invokestatic b : (I)I
    //   319: aaload
    //   320: aload_0
    //   321: getfield t : B
    //   324: aaload
    //   325: aload_0
    //   326: getfield U : I
    //   329: iconst_1
    //   330: iadd
    //   331: getstatic calc/b.a : [[Ljava/lang/String;
    //   334: bipush #26
    //   336: invokestatic b : (I)I
    //   339: aaload
    //   340: aload_0
    //   341: getfield t : B
    //   344: aaload
    //   345: invokevirtual length : ()I
    //   348: invokevirtual substring : (II)Ljava/lang/String;
    //   351: invokespecial <init> : (Ljava/lang/String;)V
    //   354: astore_2
    //   355: aload_0
    //   356: getfield U : I
    //   359: ifle -> 459
    //   362: getstatic calc/b.a : [[Ljava/lang/String;
    //   365: bipush #26
    //   367: invokestatic b : (I)I
    //   370: aaload
    //   371: aload_0
    //   372: getfield t : B
    //   375: getstatic calc/b.a : [[Ljava/lang/String;
    //   378: bipush #26
    //   380: invokestatic b : (I)I
    //   383: aaload
    //   384: aload_0
    //   385: getfield t : B
    //   388: aaload
    //   389: iconst_0
    //   390: aload_0
    //   391: getfield U : I
    //   394: invokevirtual substring : (II)Ljava/lang/String;
    //   397: aastore
    //   398: getstatic calc/b.a : [[Ljava/lang/String;
    //   401: bipush #26
    //   403: invokestatic b : (I)I
    //   406: aaload
    //   407: aload_0
    //   408: getfield t : B
    //   411: getstatic calc/b.a : [[Ljava/lang/String;
    //   414: bipush #26
    //   416: invokestatic b : (I)I
    //   419: aaload
    //   420: aload_0
    //   421: getfield t : B
    //   424: aaload
    //   425: aload_0
    //   426: getfield c : Ljava/lang/String;
    //   429: bipush #12
    //   431: aload_0
    //   432: getfield T : I
    //   435: imul
    //   436: iload_1
    //   437: iadd
    //   438: iconst_1
    //   439: isub
    //   440: bipush #12
    //   442: aload_0
    //   443: getfield T : I
    //   446: imul
    //   447: iload_1
    //   448: iadd
    //   449: invokevirtual substring : (II)Ljava/lang/String;
    //   452: aload_2
    //   453: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   456: goto -> 586
    //   459: getstatic calc/b.a : [[Ljava/lang/String;
    //   462: bipush #26
    //   464: invokestatic b : (I)I
    //   467: aaload
    //   468: aload_0
    //   469: getfield t : B
    //   472: aload_0
    //   473: getfield c : Ljava/lang/String;
    //   476: bipush #12
    //   478: aload_0
    //   479: getfield T : I
    //   482: imul
    //   483: iload_1
    //   484: iadd
    //   485: iconst_1
    //   486: isub
    //   487: bipush #12
    //   489: aload_0
    //   490: getfield T : I
    //   493: imul
    //   494: iload_1
    //   495: iadd
    //   496: invokevirtual substring : (II)Ljava/lang/String;
    //   499: aload_2
    //   500: goto -> 586
    //   503: aload_0
    //   504: getfield U : I
    //   507: getstatic calc/b.a : [[Ljava/lang/String;
    //   510: bipush #26
    //   512: invokestatic b : (I)I
    //   515: aaload
    //   516: aload_0
    //   517: getfield t : B
    //   520: aaload
    //   521: invokevirtual length : ()I
    //   524: if_icmpne -> 590
    //   527: aload_0
    //   528: iconst_0
    //   529: putfield r : Z
    //   532: getstatic calc/b.a : [[Ljava/lang/String;
    //   535: bipush #26
    //   537: invokestatic b : (I)I
    //   540: aaload
    //   541: aload_0
    //   542: getfield t : B
    //   545: getstatic calc/b.a : [[Ljava/lang/String;
    //   548: bipush #26
    //   550: invokestatic b : (I)I
    //   553: aaload
    //   554: aload_0
    //   555: getfield t : B
    //   558: aaload
    //   559: aload_0
    //   560: getfield c : Ljava/lang/String;
    //   563: bipush #12
    //   565: aload_0
    //   566: getfield T : I
    //   569: imul
    //   570: iload_1
    //   571: iadd
    //   572: iconst_1
    //   573: isub
    //   574: bipush #12
    //   576: aload_0
    //   577: getfield T : I
    //   580: imul
    //   581: iload_1
    //   582: iadd
    //   583: invokevirtual substring : (II)Ljava/lang/String;
    //   586: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   589: aastore
    //   590: aload_0
    //   591: dup
    //   592: getfield W : I
    //   595: iconst_1
    //   596: iadd
    //   597: putfield W : I
    //   600: aload_0
    //   601: getfield W : I
    //   604: aload_0
    //   605: invokevirtual getWidth : ()I
    //   608: bipush #8
    //   610: idiv
    //   611: iconst_1
    //   612: isub
    //   613: if_icmple -> 639
    //   616: aload_0
    //   617: dup
    //   618: getfield V : I
    //   621: iconst_1
    //   622: iadd
    //   623: putfield V : I
    //   626: aload_0
    //   627: dup
    //   628: getfield W : I
    //   631: iconst_1
    //   632: isub
    //   633: putfield W : I
    //   636: goto -> 644
    //   639: aload_0
    //   640: iconst_1
    //   641: putfield ae : Z
    //   644: aload_0
    //   645: dup
    //   646: getfield U : I
    //   649: iconst_1
    //   650: iadd
    //   651: putfield U : I
    //   654: aload_0
    //   655: getfield T : I
    //   658: ifle -> 666
    //   661: aload_0
    //   662: iconst_1
    //   663: putfield aa : Z
    //   666: aload_0
    //   667: iconst_1
    //   668: putfield ac : Z
    //   671: aload_0
    //   672: iconst_0
    //   673: putfield af : Z
    //   676: bipush #26
    //   678: invokestatic b : (I)I
    //   681: iconst_1
    //   682: if_icmple -> 690
    //   685: aload_0
    //   686: iconst_4
    //   687: goto -> 707
    //   690: bipush #26
    //   692: invokestatic b : (I)I
    //   695: iconst_1
    //   696: if_icmpne -> 705
    //   699: aload_0
    //   700: bipush #7
    //   702: goto -> 707
    //   705: aload_0
    //   706: iconst_0
    //   707: putfield T : I
    //   710: aload_0
    //   711: invokevirtual repaint : ()V
    //   714: return
  }
  
  public final void a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield s : B
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield u : B
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield r : Z
    //   15: getstatic calc/b.a : [[Ljava/lang/String;
    //   18: bipush #26
    //   20: invokestatic b : (I)I
    //   23: aaload
    //   24: aload_0
    //   25: getfield t : B
    //   28: aaload
    //   29: invokevirtual length : ()I
    //   32: ifle -> 208
    //   35: aload_0
    //   36: getfield U : I
    //   39: getstatic calc/b.a : [[Ljava/lang/String;
    //   42: bipush #26
    //   44: invokestatic b : (I)I
    //   47: aaload
    //   48: aload_0
    //   49: getfield t : B
    //   52: aaload
    //   53: invokevirtual length : ()I
    //   56: if_icmpge -> 208
    //   59: aload_0
    //   60: getfield r : Z
    //   63: ifne -> 208
    //   66: new java/lang/String
    //   69: dup
    //   70: getstatic calc/b.a : [[Ljava/lang/String;
    //   73: bipush #26
    //   75: invokestatic b : (I)I
    //   78: aaload
    //   79: aload_0
    //   80: getfield t : B
    //   83: aaload
    //   84: aload_0
    //   85: getfield U : I
    //   88: getstatic calc/b.a : [[Ljava/lang/String;
    //   91: bipush #26
    //   93: invokestatic b : (I)I
    //   96: aaload
    //   97: aload_0
    //   98: getfield t : B
    //   101: aaload
    //   102: invokevirtual length : ()I
    //   105: invokevirtual substring : (II)Ljava/lang/String;
    //   108: invokespecial <init> : (Ljava/lang/String;)V
    //   111: astore_2
    //   112: aload_0
    //   113: getfield U : I
    //   116: ifle -> 190
    //   119: getstatic calc/b.a : [[Ljava/lang/String;
    //   122: bipush #26
    //   124: invokestatic b : (I)I
    //   127: aaload
    //   128: aload_0
    //   129: getfield t : B
    //   132: getstatic calc/b.a : [[Ljava/lang/String;
    //   135: bipush #26
    //   137: invokestatic b : (I)I
    //   140: aaload
    //   141: aload_0
    //   142: getfield t : B
    //   145: aaload
    //   146: iconst_0
    //   147: aload_0
    //   148: getfield U : I
    //   151: invokevirtual substring : (II)Ljava/lang/String;
    //   154: aastore
    //   155: getstatic calc/b.a : [[Ljava/lang/String;
    //   158: bipush #26
    //   160: invokestatic b : (I)I
    //   163: aaload
    //   164: aload_0
    //   165: getfield t : B
    //   168: getstatic calc/b.a : [[Ljava/lang/String;
    //   171: bipush #26
    //   173: invokestatic b : (I)I
    //   176: aaload
    //   177: aload_0
    //   178: getfield t : B
    //   181: aaload
    //   182: aload_1
    //   183: aload_2
    //   184: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   187: goto -> 260
    //   190: getstatic calc/b.a : [[Ljava/lang/String;
    //   193: bipush #26
    //   195: invokestatic b : (I)I
    //   198: aaload
    //   199: aload_0
    //   200: getfield t : B
    //   203: aload_1
    //   204: aload_2
    //   205: goto -> 260
    //   208: aload_0
    //   209: getfield U : I
    //   212: getstatic calc/b.a : [[Ljava/lang/String;
    //   215: bipush #26
    //   217: invokestatic b : (I)I
    //   220: aaload
    //   221: aload_0
    //   222: getfield t : B
    //   225: aaload
    //   226: invokevirtual length : ()I
    //   229: if_icmpne -> 264
    //   232: getstatic calc/b.a : [[Ljava/lang/String;
    //   235: bipush #26
    //   237: invokestatic b : (I)I
    //   240: aaload
    //   241: aload_0
    //   242: getfield t : B
    //   245: getstatic calc/b.a : [[Ljava/lang/String;
    //   248: bipush #26
    //   250: invokestatic b : (I)I
    //   253: aaload
    //   254: aload_0
    //   255: getfield t : B
    //   258: aaload
    //   259: aload_1
    //   260: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   263: aastore
    //   264: aload_0
    //   265: dup
    //   266: getfield W : I
    //   269: aload_1
    //   270: invokevirtual length : ()I
    //   273: iadd
    //   274: putfield W : I
    //   277: aload_0
    //   278: getfield W : I
    //   281: aload_0
    //   282: invokevirtual getWidth : ()I
    //   285: bipush #8
    //   287: idiv
    //   288: iconst_1
    //   289: isub
    //   290: isub
    //   291: dup
    //   292: istore_2
    //   293: ifle -> 316
    //   296: aload_0
    //   297: dup
    //   298: getfield W : I
    //   301: iload_2
    //   302: isub
    //   303: putfield W : I
    //   306: aload_0
    //   307: dup
    //   308: getfield V : I
    //   311: iload_2
    //   312: iadd
    //   313: putfield V : I
    //   316: aload_0
    //   317: dup
    //   318: getfield U : I
    //   321: aload_1
    //   322: invokevirtual length : ()I
    //   325: iadd
    //   326: putfield U : I
    //   329: aload_0
    //   330: iconst_1
    //   331: putfield af : Z
    //   334: bipush #26
    //   336: invokestatic b : (I)I
    //   339: iconst_1
    //   340: if_icmple -> 348
    //   343: aload_0
    //   344: iconst_4
    //   345: goto -> 365
    //   348: bipush #26
    //   350: invokestatic b : (I)I
    //   353: iconst_1
    //   354: if_icmpne -> 363
    //   357: aload_0
    //   358: bipush #7
    //   360: goto -> 365
    //   363: aload_0
    //   364: iconst_0
    //   365: putfield T : I
    //   368: aload_0
    //   369: invokevirtual repaint : ()V
    //   372: return
  }
  
  public final void a() {
    if (this.t > 0) {
      String str = b.a[b.b(26)][this.t];
      for (byte b = this.t; b > 0; b--)
        b.a[b.b(26)][b] = b.a[b.b(26)][b - 1]; 
      b.a[b.b(26)][0] = (b.a[b.b(26)][0].length() == 0) ? b.a[b.b(26)][this.t] : str;
      this.t = 0;
      this.ab = true;
    } 
    this.s = 0;
    this.u = 0;
    this.r = false;
    this.Z = false;
    this.ai = new c();
    if (a.a(b.a[b.b(26)][this.t])) {
      a.a(b.a[b.b(26)][this.t], 0);
      if (b.a[b.b(26)][this.t].length() > 0) {
        this.ai.a(a.b());
        String str;
        if (!(str = this.ai.g(16)).equals("nan") && !str.equals("inf") && !str.equals("-inf")) {
          b.a(40, str);
          if (b.b(26) > 0) {
            this.ah = a.a(this.ai, a.a());
          } else {
            this.ah = this.ai.a(b.b);
          } 
        } else {
        
        } 
      } else {
        this.ah = "0";
        b.a(40, "0");
      } 
    } else {
      this.ah = "ERR.(...";
      this.Z = true;
    } 
    if (this.ag > 0 && !this.Z) {
      String str;
      if ((str = a.a(this.ai, (this.ag < 2))) != null)
        this.ah = str; 
      this.ag = 0;
    } 
    this.af = true;
    repaint();
  }
  
  private void c() {
    if (this.r)
      this.ae = true; 
    this.s = 0;
    this.u = 0;
    this.r = false;
    if (b.a[b.b(26)][this.t].length() > 0 && this.U == b.a[b.b(26)][this.t].length()) {
      this.U--;
      if (this.V > 0) {
        this.V--;
      } else if (this.W > 0) {
        this.W--;
      } 
      b.a[b.b(26)][this.t] = b.a[b.b(26)][this.t].substring(0, b.a[b.b(26)][this.t].length() - 1);
      this.ae = true;
    } else if (b.a[b.b(26)][this.t].length() > 0 && this.U < b.a[b.b(26)][this.t].length()) {
      String str = new String(b.a[b.b(26)][this.t].substring(this.U + 1, b.a[b.b(26)][this.t].length()));
      b.a[b.b(26)][this.t] = b.a[b.b(26)][this.t].substring(0, this.U);
      b.a[b.b(26)][this.t] = (this.U > 0) ? b.a[b.b(26)][this.t].concat(str) : str;
    } 
    this.ac = true;
    this.af = false;
    repaint();
  }
  
  private void d() {
    this.s = 0;
    this.u = 0;
    this.r = !this.r;
    this.af = false;
    this.ae = true;
    repaint();
  }
  
  public final void keyRepeated(int paramInt) {
    b(paramInt);
  }
  
  public final void feyPressed(int paramInt) {
    b(paramInt);
  }
  
  private void b(int paramInt) {
    if (paramInt == -8)
      c(); 
    if (paramInt == -10 || paramInt == 10 || paramInt == -11) {
      switch (b.b(20)) {
        case 0:
          a();
          return;
        case 1:
          c();
          return;
        case 2:
          d();
          break;
      } 
      return;
    } 
    if (paramInt == -12) {
      switch (b.b(21)) {
        case 1:
          a();
          return;
        case 2:
          c();
          return;
        case 3:
          d();
          break;
      } 
      return;
    } 
    if (8 == getGameAction(paramInt) && paramInt != 53) {
      switch (b.b(22)) {
        case 0:
          d();
          return;
        case 1:
          a();
          return;
        case 2:
          c();
          break;
      } 
      return;
    } 
    if (2 == getGameAction(paramInt) && paramInt != 52) {
      if (this.r)
        this.ae = true; 
      this.u = 0;
      this.r = false;
      for (byte b = 0; b <= this.s; b += 8) {
        if (this.W > 0) {
          this.W--;
          this.U--;
          this.ae = true;
        } else if (this.V > 0) {
          this.V--;
          this.U--;
          this.ac = true;
        } 
      } 
      this.s = (byte)(this.s + 1);
      this.af = false;
    } else if (5 == getGameAction(paramInt) && paramInt != 54) {
      if (this.r)
        this.ae = true; 
      this.s = 0;
      this.r = false;
      for (byte b = 0; b <= this.u; b += 8) {
        if (this.W < b.a[b.b(26)][this.t].length() - this.V)
          if (this.W < getWidth() / 8 - 1) {
            this.W++;
            this.U++;
            this.ae = true;
          } else if (this.V < b.a[b.b(26)][this.t].length() - getWidth() / 8 + 1) {
            this.V++;
            this.U++;
            this.ac = true;
          }  
      } 
      this.u = (byte)(this.u + 1);
      this.af = false;
    } else if (6 == getGameAction(paramInt) && paramInt != 56) {
      this.s = 0;
      this.u = 0;
      if (this.t != 0 || b.a[b.b(26)][this.t].length() != 0) {
        this.r = false;
        if (this.t == 0) {
          for (byte b = 8; b > 0; b--)
            b.a[b.b(26)][b] = b.a[b.b(26)][b - 1]; 
          b.a[b.b(26)][0] = "";
        } else {
          this.t = (byte)(this.t - 1);
        } 
        this.W = 0;
        this.U = 0;
        this.V = 0;
        this.ac = true;
        this.af = false;
        this.ae = true;
        this.ab = true;
      } else {
        return;
      } 
    } else if (1 == getGameAction(paramInt) && paramInt != 50) {
      this.s = 0;
      this.u = 0;
      if (this.t != 8) {
        this.W = 0;
        this.U = 0;
        this.V = 0;
        this.t = (byte)(this.t + 1);
        this.ac = true;
        this.af = false;
        this.ae = true;
        this.ab = true;
        this.r = false;
      } else {
        return;
      } 
    } else {
      boolean bool = false;
      switch (paramInt) {
        case 49:
          if (this.T != 5 || b.b(26) != 2) {
            a(1);
            return;
          } 
          break;
        case 50:
          a(2);
          return;
        case 51:
          a(3);
          return;
        case 52:
          if (this.T != 5 || b.b(26) != 2) {
            a(4);
            return;
          } 
          break;
        case 53:
          a(5);
          return;
        case 54:
          a(6);
          return;
        case 55:
          if (this.T == 7)
            bool = true; 
          if (this.T != 5 || b.b(26) != 2)
            a(7); 
          if (bool) {
            a(7);
            return;
          } 
          break;
        case 56:
          if (this.T != 4 || b.b(26) != 2) {
            a(8);
            return;
          } 
          break;
        case 57:
          if (this.T != 4 || b.b(26) != 2) {
            a(9);
            return;
          } 
          break;
        case 42:
          if (this.T == 7)
            bool = true; 
          if ((this.T != 4 && this.T != 5) || b.b(26) != 2)
            a(10); 
          if (bool) {
            a(10);
            return;
          } 
          break;
        case 48:
          if (this.T != 5 || b.b(26) != 2) {
            a(11);
            return;
          } 
          break;
        case 35:
          this.s = 0;
          this.u = 0;
          this.T = (b.b(26) > 1) ? ((this.T < 4) ? 4 : ((this.T < 6) ? (this.T + 1) : 4)) : ((b.b(26) == 1) ? ((this.T == 6) ? 7 : ((this.T == 7) ? 6 : 7)) : ((this.T < 3) ? (this.T + 1) : 0));
          this.af = false;
          this.aa = true;
          repaint();
          break;
      } 
      return;
    } 
    repaint();
    break;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.d) {
      a();
      return;
    } 
    if (paramCommand == this.o) {
      this.ag = 1;
      a();
      return;
    } 
    if (paramCommand == this.p) {
      this.ag = 2;
      a();
      return;
    } 
    if (paramCommand == this.e) {
      c();
      return;
    } 
    if (paramCommand == this.n) {
      c c1 = new c(b.a(40), 16);
      a(a.a(c1, a.a()));
      return;
    } 
    if (paramCommand == this.g) {
      b.a(41, b.a(40));
      this.af = true;
      repaint();
      return;
    } 
    if (paramCommand == this.h) {
      b.a(42, b.a(40));
      this.af = true;
      repaint();
      return;
    } 
    if (paramCommand == this.f) {
      Stud.f.a("settings");
      return;
    } 
    if (paramCommand == this.j) {
      Stud.f.a("number_format");
      return;
    } 
    if (paramCommand == this.l) {
      Stud.f.a("about");
      return;
    } 
    if (paramCommand == this.i) {
      Stud.f.a("constants");
      return;
    } 
    if (paramCommand == this.m) {
      Stud.f.a("convert_ans");
      return;
    } 
    if (paramCommand == this.k) {
      this.s = 0;
      this.u = 0;
      this.r = false;
      this.T = (b.b(26) > 1) ? 4 : ((b.b(26) == 1) ? 7 : 0);
      b.a[b.b(26)][this.t] = "";
      this.W = 0;
      this.U = 0;
      this.V = 0;
      b.a(40, "0");
      this.ah = "0";
      this.af = true;
      repaint();
      return;
    } 
    if (paramCommand == this.q)
      try {
        Stud.e.destroyApp(false);
        return;
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      }  
  }
  
  public final void b() {
    this.ah = "0";
    this.s = 0;
    this.u = 0;
    this.t = 0;
    this.W = 0;
    this.U = 0;
    this.V = 0;
    this.r = false;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\calc\d.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */