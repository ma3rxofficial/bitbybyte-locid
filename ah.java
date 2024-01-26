import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ah {
  public String[] a;
  
  public int a;
  
  public byte[] a;
  
  public String a;
  
  public String b;
  
  public String c;
  
  public int b;
  
  public String d;
  
  private Image a;
  
  int c;
  
  public int d;
  
  public boolean a;
  
  private int o;
  
  public String[] b;
  
  public boolean[] a;
  
  public boolean b;
  
  public boolean[] b;
  
  public int e;
  
  public int f;
  
  public boolean c;
  
  public boolean d;
  
  public int g;
  
  public int h;
  
  private int p;
  
  public int i;
  
  public int j;
  
  public int k;
  
  private String e;
  
  private String f;
  
  public int l;
  
  public int m;
  
  public boolean e;
  
  public boolean f;
  
  public int n;
  
  public ah(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4) {
    this(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramInt3, 0);
    this.d = paramBoolean;
    this.c = paramInt4;
    this.a = (boolean[])new String[paramInt4];
    this.b = (boolean[])new String[paramInt4];
    this.a = new boolean[paramInt4];
    this.b = new boolean[paramInt4];
  }
  
  public ah(int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4) {
    this(paramInt1, paramString1, paramString2, paramString3, paramInt2, paramInt3, 0);
    this.c = paramBoolean;
    this.e = paramInt4;
  }
  
  public final void a() {
    if (this.a != null)
      for (byte b = 0; b < this.a.length; b++)
        this.a[b] = false;  
  }
  
  public ah(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: ldc 13421772
    //   7: putfield o : I
    //   10: aload_0
    //   11: iconst_m1
    //   12: putfield g : I
    //   15: aload_0
    //   16: bipush #13
    //   18: putfield k : I
    //   21: aload_0
    //   22: iload_1
    //   23: putfield a : I
    //   26: aload_0
    //   27: aload_2
    //   28: putfield a : Ljava/lang/String;
    //   31: aload_0
    //   32: aload_3
    //   33: putfield b : Ljava/lang/String;
    //   36: aload_0
    //   37: aload #4
    //   39: putfield d : Ljava/lang/String;
    //   42: aload_0
    //   43: iload #5
    //   45: putfield b : I
    //   48: aload_0
    //   49: iload #6
    //   51: putfield p : I
    //   54: aload_0
    //   55: iload #7
    //   57: putfield j : I
    //   60: aload #4
    //   62: ifnull -> 365
    //   65: aload #4
    //   67: ldc 'goto:///'
    //   69: invokevirtual equals : (Ljava/lang/Object;)Z
    //   72: ifeq -> 94
    //   75: aload_0
    //   76: getstatic v.a : [Ljavax/microedition/lcdui/Image;
    //   79: bipush #16
    //   81: aaload
    //   82: putfield a : Ljavax/microedition/lcdui/Image;
    //   85: aload_0
    //   86: ldc 'www.'
    //   88: putfield e : Ljava/lang/String;
    //   91: goto -> 365
    //   94: aload #4
    //   96: ldc 'search:///'
    //   98: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   101: ifeq -> 315
    //   104: iload_1
    //   105: bipush #120
    //   107: if_icmpne -> 315
    //   110: aload #4
    //   112: invokestatic b : (Ljava/lang/String;)I
    //   115: dup
    //   116: istore_2
    //   117: iconst_m1
    //   118: if_icmpne -> 151
    //   121: aload_0
    //   122: bipush #90
    //   124: invokestatic d : (I)Ljava/lang/String;
    //   127: putfield e : Ljava/lang/String;
    //   130: aload_0
    //   131: bipush #50
    //   133: invokestatic d : (I)Ljava/lang/String;
    //   136: putfield f : Ljava/lang/String;
    //   139: aload_0
    //   140: getstatic v.b : [Ljavax/microedition/lcdui/Image;
    //   143: iconst_0
    //   144: aaload
    //   145: putfield a : Ljavax/microedition/lcdui/Image;
    //   148: goto -> 365
    //   151: iload_2
    //   152: bipush #-2
    //   154: if_icmpne -> 165
    //   157: aload_0
    //   158: iconst_1
    //   159: putfield a : Z
    //   162: goto -> 297
    //   165: aload_0
    //   166: aload_0
    //   167: iload_2
    //   168: iconst_1
    //   169: invokestatic a : (II)Ljava/lang/Object;
    //   172: checkcast java/lang/String
    //   175: dup_x1
    //   176: putfield e : Ljava/lang/String;
    //   179: putfield f : Ljava/lang/String;
    //   182: iload_2
    //   183: iconst_2
    //   184: invokestatic a : (II)Ljava/lang/Object;
    //   187: checkcast [B
    //   190: dup
    //   191: astore_3
    //   192: ifnull -> 297
    //   195: ldc 'setsrh:///'
    //   197: iload_2
    //   198: invokestatic valueOf : (I)Ljava/lang/String;
    //   201: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   204: astore_2
    //   205: getstatic af.b : Laf;
    //   208: getfield a : Lv;
    //   211: getfield a : Ljava/util/Hashtable;
    //   214: ifnull -> 233
    //   217: getstatic af.b : Laf;
    //   220: getfield a : Lv;
    //   223: getfield a : Ljava/util/Hashtable;
    //   226: aload_2
    //   227: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   230: ifne -> 277
    //   233: aload_0
    //   234: aload_3
    //   235: iconst_0
    //   236: aload_3
    //   237: arraylength
    //   238: invokestatic a : ([BII)Ljavax/microedition/lcdui/Image;
    //   241: putfield a : Ljavax/microedition/lcdui/Image;
    //   244: getstatic af.b : Laf;
    //   247: getfield a : Lv;
    //   250: getfield a : Ljava/util/Hashtable;
    //   253: ifnull -> 297
    //   256: getstatic af.b : Laf;
    //   259: getfield a : Lv;
    //   262: getfield a : Ljava/util/Hashtable;
    //   265: aload_2
    //   266: aload_0
    //   267: getfield a : Ljavax/microedition/lcdui/Image;
    //   270: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   273: pop
    //   274: goto -> 297
    //   277: aload_0
    //   278: getstatic af.b : Laf;
    //   281: getfield a : Lv;
    //   284: getfield a : Ljava/util/Hashtable;
    //   287: aload_2
    //   288: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   291: checkcast javax/microedition/lcdui/Image
    //   294: putfield a : Ljavax/microedition/lcdui/Image;
    //   297: aload_0
    //   298: dup
    //   299: getfield p : I
    //   302: aload_0
    //   303: invokevirtual a : ()I
    //   306: iconst_1
    //   307: iadd
    //   308: isub
    //   309: putfield p : I
    //   312: goto -> 365
    //   315: aload #4
    //   317: bipush #101
    //   319: invokestatic c : (I)Ljava/lang/String;
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: ifeq -> 365
    //   328: aload_2
    //   329: ldc 't'
    //   331: invokevirtual equals : (Ljava/lang/Object;)Z
    //   334: ifeq -> 365
    //   337: getstatic v.c : [B
    //   340: ifnull -> 365
    //   343: getstatic v.c : [B
    //   346: arraylength
    //   347: ifle -> 365
    //   350: aload_0
    //   351: getstatic v.c : [B
    //   354: iconst_0
    //   355: getstatic v.c : [B
    //   358: arraylength
    //   359: invokestatic a : ([BII)Ljavax/microedition/lcdui/Image;
    //   362: putfield a : Ljavax/microedition/lcdui/Image;
    //   365: iload_1
    //   366: bipush #120
    //   368: if_icmpne -> 428
    //   371: aload_0
    //   372: getfield a : Ljava/lang/String;
    //   375: ifnull -> 428
    //   378: aload_0
    //   379: getfield a : Ljava/lang/String;
    //   382: ldc 'setpath///'
    //   384: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   387: ifne -> 402
    //   390: aload_0
    //   391: getfield a : Ljava/lang/String;
    //   394: ldc 'settime///'
    //   396: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   399: ifeq -> 428
    //   402: aload_0
    //   403: dup
    //   404: getfield p : I
    //   407: getstatic v.c : Ljavax/microedition/lcdui/Font;
    //   410: sipush #623
    //   413: invokestatic d : (I)Ljava/lang/String;
    //   416: iconst_0
    //   417: invokestatic a : (Ljavax/microedition/lcdui/Font;Ljava/lang/String;Z)I
    //   420: bipush #10
    //   422: iadd
    //   423: isub
    //   424: putfield p : I
    //   427: return
    //   428: iload_1
    //   429: bipush #120
    //   431: if_icmpne -> 502
    //   434: aload_0
    //   435: getfield a : Ljava/lang/String;
    //   438: ifnull -> 502
    //   441: aload_0
    //   442: getfield a : Ljava/lang/String;
    //   445: ldc 'setcol:///'
    //   447: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   450: ifeq -> 502
    //   453: aload_0
    //   454: getstatic v.b : [I
    //   457: aload_0
    //   458: getfield a : Ljava/lang/String;
    //   461: invokestatic b : (Ljava/lang/String;)I
    //   464: iaload
    //   465: putfield o : I
    //   468: aload_0
    //   469: aload_0
    //   470: iconst_1
    //   471: dup_x1
    //   472: putfield a : Z
    //   475: putfield f : Z
    //   478: aload_0
    //   479: invokestatic b : ()I
    //   482: getstatic v.aw : I
    //   485: isub
    //   486: iconst_5
    //   487: isub
    //   488: getstatic v.b : Ljavax/microedition/lcdui/Font;
    //   491: ldc 'XXXX'
    //   493: iconst_0
    //   494: invokestatic a : (Ljavax/microedition/lcdui/Font;Ljava/lang/String;Z)I
    //   497: isub
    //   498: putfield p : I
    //   501: return
    //   502: iload_1
    //   503: bipush #85
    //   505: if_icmpne -> 517
    //   508: aload_0
    //   509: bipush #123
    //   511: invokestatic d : (I)Ljava/lang/String;
    //   514: putfield e : Ljava/lang/String;
    //   517: return
  }
  
  public final String a() {
    return (String)((this.f != null) ? this.f : v.d(43));
  }
  
  private Image a() {
    return (v.a == null) ? null : ((this.a == 99) ? (!this.c ? v.a[25] : v.a[26]) : ((this.a == 114) ? (!this.c ? v.a[27] : v.a[28]) : null));
  }
  
  public final int a(boolean paramBoolean) {
    int i;
    if (this.a == 104)
      return 0; 
    if (this.a == 105)
      return this.h; 
    if (this.a == 37)
      return a(); 
    if (this.a == 120 || this.a == 112 || this.a == 97)
      return this.p - (this.e ? 6 : 0); 
    if (this.a == 99 || this.a == 114) {
      Image image;
      return ((image = a()) != null) ? (paramBoolean ? (image.getWidth() + 1) : (image.getWidth() + 5)) : v.a((Font)v.c, false);
    } 
    if (this.a == 85) {
      i = v.a((Font)v.c, v.a(v.d(124), ", XXX KB"), false) + a();
    } else {
      i = v.a((Font)v.c, (this.a != 115) ? (String)this.b : "x", false);
    } 
    if (this.a == 115)
      i *= this.k + a(); 
    i += 9;
    return v.b(i, this.p);
  }
  
  public final int a() {
    Image image;
    if (this.a == 104)
      return 0; 
    if (this.a == 105)
      return this.i; 
    if (this.a == 99 || this.a == 114)
      return ((image = a()) != null) ? (getHeight() + 2) : v.a((Font)v.c, false); 
    short s = (short)v.a((Font)v.c, false);
    if (((ah)super).a == 120 && ((ah)super).a != null)
      s = (short)v.a(((ah)super).a.getHeight(), s); 
    if (((ah)super).a == 37)
      s = (short)v.a(12, s); 
    return (short)(s + 8);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: bipush #104
    //   6: if_icmpeq -> 18
    //   9: aload_0
    //   10: getfield a : I
    //   13: bipush #105
    //   15: if_icmpne -> 19
    //   18: return
    //   19: aload_0
    //   20: iconst_0
    //   21: invokevirtual a : (Z)I
    //   24: iconst_1
    //   25: isub
    //   26: istore #5
    //   28: aload_0
    //   29: invokevirtual a : ()I
    //   32: iconst_1
    //   33: isub
    //   34: istore #6
    //   36: iinc #2, 1
    //   39: iinc #3, 1
    //   42: iinc #5, -2
    //   45: iinc #6, -2
    //   48: iconst_0
    //   49: istore #7
    //   51: ldc 16316664
    //   53: istore #8
    //   55: ldc 2236962
    //   57: istore #9
    //   59: aload_0
    //   60: getfield a : I
    //   63: bipush #98
    //   65: if_icmpeq -> 86
    //   68: aload_0
    //   69: getfield a : I
    //   72: bipush #117
    //   74: if_icmpeq -> 86
    //   77: aload_0
    //   78: getfield a : I
    //   81: bipush #101
    //   83: if_icmpne -> 90
    //   86: ldc 16777215
    //   88: istore #8
    //   90: aload_0
    //   91: getfield a : I
    //   94: bipush #115
    //   96: if_icmpeq -> 117
    //   99: aload_0
    //   100: getfield a : I
    //   103: bipush #37
    //   105: if_icmpeq -> 117
    //   108: aload_0
    //   109: getfield a : I
    //   112: bipush #85
    //   114: if_icmpne -> 121
    //   117: ldc 5592405
    //   119: istore #7
    //   121: aload_0
    //   122: getfield a : I
    //   125: bipush #99
    //   127: if_icmpne -> 239
    //   130: aload_0
    //   131: iload #4
    //   133: aload_0
    //   134: invokevirtual a : ()I
    //   137: isub
    //   138: iconst_1
    //   139: ishr
    //   140: putfield l : I
    //   143: iload_3
    //   144: aload_0
    //   145: getfield l : I
    //   148: iadd
    //   149: istore_3
    //   150: aload_0
    //   151: invokespecial a : ()Ljavax/microedition/lcdui/Image;
    //   154: dup
    //   155: astore #4
    //   157: ifnull -> 171
    //   160: aload_1
    //   161: aload #4
    //   163: iload_2
    //   164: iload_3
    //   165: bipush #20
    //   167: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   170: return
    //   171: aload_1
    //   172: iload #8
    //   174: iload_2
    //   175: iload_3
    //   176: iload #5
    //   178: iload #6
    //   180: aload #4
    //   182: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIILjavax/microedition/lcdui/Image;)V
    //   185: aload_0
    //   186: getfield c : Z
    //   189: ifeq -> 238
    //   192: iinc #2, 2
    //   195: iinc #3, 2
    //   198: iinc #5, -4
    //   201: iinc #6, -4
    //   204: aload_1
    //   205: ldc 2236962
    //   207: invokevirtual setColor : (I)V
    //   210: aload_1
    //   211: iload_2
    //   212: iload_3
    //   213: iload_2
    //   214: iload #5
    //   216: iadd
    //   217: iload_3
    //   218: iload #6
    //   220: iadd
    //   221: invokevirtual drawLine : (IIII)V
    //   224: aload_1
    //   225: iload_2
    //   226: iload #5
    //   228: iadd
    //   229: iload_3
    //   230: iload_2
    //   231: iload_3
    //   232: iload #6
    //   234: iadd
    //   235: invokevirtual drawLine : (IIII)V
    //   238: return
    //   239: aload_0
    //   240: getfield a : I
    //   243: bipush #114
    //   245: if_icmpne -> 368
    //   248: aload_0
    //   249: invokespecial a : ()Ljavax/microedition/lcdui/Image;
    //   252: dup
    //   253: astore #4
    //   255: ifnull -> 269
    //   258: aload_1
    //   259: aload #4
    //   261: iload_2
    //   262: iload_3
    //   263: bipush #20
    //   265: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   268: return
    //   269: iload #5
    //   271: bipush #8
    //   273: isub
    //   274: iconst_1
    //   275: ishr
    //   276: istore #4
    //   278: aload_1
    //   279: iload #8
    //   281: invokevirtual setColor : (I)V
    //   284: aload_1
    //   285: iload_2
    //   286: iload #4
    //   288: iadd
    //   289: iload_3
    //   290: iload #4
    //   292: iadd
    //   293: bipush #8
    //   295: bipush #8
    //   297: iconst_0
    //   298: sipush #360
    //   301: invokevirtual fillArc : (IIIIII)V
    //   304: aload_1
    //   305: iload #7
    //   307: invokevirtual setColor : (I)V
    //   310: aload_1
    //   311: iload_2
    //   312: iload #4
    //   314: iadd
    //   315: iload_3
    //   316: iload #4
    //   318: iadd
    //   319: bipush #8
    //   321: bipush #8
    //   323: iconst_0
    //   324: sipush #360
    //   327: invokevirtual drawArc : (IIIIII)V
    //   330: aload_0
    //   331: getfield c : Z
    //   334: ifeq -> 367
    //   337: aload_1
    //   338: ldc 2236962
    //   340: invokevirtual setColor : (I)V
    //   343: aload_1
    //   344: iload_2
    //   345: iload #4
    //   347: iadd
    //   348: iconst_1
    //   349: iadd
    //   350: iload_3
    //   351: iload #4
    //   353: iadd
    //   354: iconst_1
    //   355: iadd
    //   356: bipush #6
    //   358: bipush #6
    //   360: iconst_0
    //   361: sipush #360
    //   364: invokevirtual fillArc : (IIIIII)V
    //   367: return
    //   368: aload_0
    //   369: getfield b : Ljava/lang/String;
    //   372: astore #4
    //   374: aload_0
    //   375: getfield e : Ljava/lang/String;
    //   378: ifnull -> 410
    //   381: aload #4
    //   383: ifnull -> 394
    //   386: aload #4
    //   388: invokevirtual length : ()I
    //   391: ifne -> 407
    //   394: aload_0
    //   395: getfield e : Ljava/lang/String;
    //   398: astore #4
    //   400: ldc 8947848
    //   402: istore #9
    //   404: goto -> 410
    //   407: iconst_0
    //   408: istore #9
    //   410: aload_0
    //   411: getfield a : I
    //   414: bipush #112
    //   416: if_icmpne -> 464
    //   419: new java/lang/StringBuffer
    //   422: dup
    //   423: invokespecial <init> : ()V
    //   426: astore #10
    //   428: iconst_0
    //   429: istore #7
    //   431: iload #7
    //   433: aload_0
    //   434: getfield b : Ljava/lang/String;
    //   437: invokevirtual length : ()I
    //   440: if_icmpge -> 457
    //   443: aload #10
    //   445: bipush #42
    //   447: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   450: pop
    //   451: iinc #7, 1
    //   454: goto -> 431
    //   457: aload #10
    //   459: invokevirtual toString : ()Ljava/lang/String;
    //   462: astore #4
    //   464: aload_0
    //   465: getfield a : I
    //   468: bipush #120
    //   470: if_icmpeq -> 518
    //   473: aload_0
    //   474: getfield a : I
    //   477: bipush #112
    //   479: if_icmpeq -> 518
    //   482: aload_0
    //   483: getfield a : I
    //   486: bipush #97
    //   488: if_icmpeq -> 518
    //   491: aload_0
    //   492: getfield a : I
    //   495: bipush #115
    //   497: if_icmpeq -> 518
    //   500: aload_0
    //   501: getfield a : I
    //   504: bipush #37
    //   506: if_icmpeq -> 518
    //   509: aload_0
    //   510: getfield a : I
    //   513: bipush #85
    //   515: if_icmpne -> 1014
    //   518: aload_0
    //   519: getfield a : I
    //   522: bipush #37
    //   524: if_icmpeq -> 602
    //   527: aload_0
    //   528: getfield f : Z
    //   531: ifeq -> 574
    //   534: aload_1
    //   535: iload_2
    //   536: iconst_2
    //   537: iadd
    //   538: iload_3
    //   539: iconst_2
    //   540: iadd
    //   541: iload #5
    //   543: iconst_3
    //   544: isub
    //   545: iload #6
    //   547: iconst_3
    //   548: isub
    //   549: aload_0
    //   550: getfield o : I
    //   553: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIII)V
    //   556: aload_1
    //   557: iconst_0
    //   558: invokevirtual setColor : (I)V
    //   561: aload_1
    //   562: iload_2
    //   563: iload_3
    //   564: iload #5
    //   566: iload #6
    //   568: invokevirtual drawRect : (IIII)V
    //   571: goto -> 602
    //   574: aload_1
    //   575: aload_0
    //   576: getfield a : Z
    //   579: ifeq -> 587
    //   582: ldc 13421772
    //   584: goto -> 589
    //   587: iload #8
    //   589: iload_2
    //   590: iload_3
    //   591: iload #5
    //   593: iload #6
    //   595: aload_0
    //   596: getfield a : Ljavax/microedition/lcdui/Image;
    //   599: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIILjavax/microedition/lcdui/Image;)V
    //   602: aload_0
    //   603: getfield a : I
    //   606: bipush #115
    //   608: if_icmpeq -> 629
    //   611: aload_0
    //   612: getfield a : I
    //   615: bipush #37
    //   617: if_icmpeq -> 629
    //   620: aload_0
    //   621: getfield a : I
    //   624: bipush #85
    //   626: if_icmpne -> 1002
    //   629: aload_0
    //   630: getfield a : I
    //   633: bipush #115
    //   635: if_icmpeq -> 659
    //   638: aload_1
    //   639: iload_2
    //   640: iload #5
    //   642: iadd
    //   643: iload #6
    //   645: isub
    //   646: iload_3
    //   647: iload #6
    //   649: iconst_1
    //   650: iadd
    //   651: iload #6
    //   653: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   656: goto -> 677
    //   659: aload_1
    //   660: iload_2
    //   661: iload #5
    //   663: iadd
    //   664: iload #6
    //   666: isub
    //   667: iconst_1
    //   668: iadd
    //   669: iload_3
    //   670: iload #6
    //   672: iload #6
    //   674: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   677: aload_1
    //   678: iconst_0
    //   679: invokevirtual setColor : (I)V
    //   682: aload_0
    //   683: getfield a : I
    //   686: bipush #85
    //   688: if_icmpne -> 936
    //   691: aload_0
    //   692: getfield b : Ljava/lang/String;
    //   695: ifnull -> 783
    //   698: aload_0
    //   699: getfield a : [B
    //   702: ifnull -> 783
    //   705: aload_0
    //   706: getfield a : [B
    //   709: iconst_0
    //   710: baload
    //   711: bipush #102
    //   713: if_icmpne -> 761
    //   716: new java/lang/String
    //   719: dup
    //   720: aload_0
    //   721: getfield a : [B
    //   724: iconst_0
    //   725: aload_0
    //   726: getfield a : [B
    //   729: arraylength
    //   730: invokespecial <init> : ([BII)V
    //   733: dup
    //   734: dup
    //   735: astore #11
    //   737: iconst_2
    //   738: invokevirtual indexOf : (I)I
    //   741: iconst_1
    //   742: iadd
    //   743: aload #11
    //   745: iconst_3
    //   746: invokevirtual indexOf : (I)I
    //   749: invokevirtual substring : (II)Ljava/lang/String;
    //   752: iconst_0
    //   753: invokestatic a : (Ljava/lang/String;I)I
    //   756: istore #10
    //   758: goto -> 768
    //   761: aload_0
    //   762: getfield a : [B
    //   765: arraylength
    //   766: istore #10
    //   768: aload #4
    //   770: ldc ', '
    //   772: iload #10
    //   774: i2l
    //   775: invokestatic a : (J)Ljava/lang/String;
    //   778: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   781: astore #4
    //   783: iload #6
    //   785: iconst_1
    //   786: iadd
    //   787: iload #6
    //   789: iconst_3
    //   790: ishr
    //   791: iconst_1
    //   792: ishl
    //   793: isub
    //   794: istore #7
    //   796: iload #6
    //   798: iconst_1
    //   799: iadd
    //   800: iload #6
    //   802: iconst_2
    //   803: ishr
    //   804: iconst_1
    //   805: ishl
    //   806: isub
    //   807: istore #10
    //   809: iload #6
    //   811: iconst_1
    //   812: iadd
    //   813: iload #6
    //   815: iconst_3
    //   816: ishr
    //   817: iload #6
    //   819: iconst_2
    //   820: ishr
    //   821: iadd
    //   822: iconst_1
    //   823: ishl
    //   824: isub
    //   825: istore #11
    //   827: aload_1
    //   828: iload_2
    //   829: iload #5
    //   831: iadd
    //   832: iload #6
    //   834: isub
    //   835: iload #6
    //   837: iconst_3
    //   838: ishr
    //   839: iadd
    //   840: iload_3
    //   841: iload #6
    //   843: iconst_2
    //   844: ishr
    //   845: iadd
    //   846: iload #7
    //   848: iload #10
    //   850: iconst_0
    //   851: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIII)V
    //   854: aload_1
    //   855: iload_2
    //   856: iload #5
    //   858: iadd
    //   859: iload #6
    //   861: isub
    //   862: iload #6
    //   864: iconst_3
    //   865: ishr
    //   866: iadd
    //   867: iload #6
    //   869: iconst_2
    //   870: ishr
    //   871: iadd
    //   872: iload_3
    //   873: iload #6
    //   875: iconst_3
    //   876: ishr
    //   877: iadd
    //   878: iload #11
    //   880: iload #6
    //   882: iconst_2
    //   883: ishr
    //   884: iconst_0
    //   885: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIII)V
    //   888: aload_1
    //   889: iconst_m1
    //   890: invokevirtual setColor : (I)V
    //   893: aload_1
    //   894: iload_2
    //   895: iload #5
    //   897: iadd
    //   898: iload #6
    //   900: isub
    //   901: iload #6
    //   903: iconst_3
    //   904: ishr
    //   905: iadd
    //   906: iload #6
    //   908: iconst_2
    //   909: ishr
    //   910: iadd
    //   911: iload_3
    //   912: iload #6
    //   914: iconst_2
    //   915: ishr
    //   916: iadd
    //   917: iload #6
    //   919: iconst_3
    //   920: ishr
    //   921: iadd
    //   922: iload #11
    //   924: iload #11
    //   926: iload #11
    //   928: iload #11
    //   930: invokevirtual fillRoundRect : (IIIIII)V
    //   933: goto -> 995
    //   936: iload_2
    //   937: iload #5
    //   939: iadd
    //   940: iload #6
    //   942: iconst_1
    //   943: ishr
    //   944: isub
    //   945: iconst_3
    //   946: isub
    //   947: istore #7
    //   949: iload_3
    //   950: iload #6
    //   952: iconst_1
    //   953: ishr
    //   954: iadd
    //   955: iconst_1
    //   956: isub
    //   957: istore #10
    //   959: bipush #6
    //   961: istore #11
    //   963: iload #11
    //   965: iflt -> 995
    //   968: aload_1
    //   969: iload #7
    //   971: iload #10
    //   973: iload #7
    //   975: iload #11
    //   977: iadd
    //   978: iload #10
    //   980: invokevirtual drawLine : (IIII)V
    //   983: iinc #7, 1
    //   986: iinc #10, 1
    //   989: iinc #11, -2
    //   992: goto -> 963
    //   995: iload #5
    //   997: iload #6
    //   999: isub
    //   1000: istore #5
    //   1002: iinc #2, 3
    //   1005: iinc #3, 3
    //   1008: iinc #5, -6
    //   1011: iinc #6, -6
    //   1014: aload_0
    //   1015: getfield a : I
    //   1018: bipush #98
    //   1020: if_icmpeq -> 1041
    //   1023: aload_0
    //   1024: getfield a : I
    //   1027: bipush #117
    //   1029: if_icmpeq -> 1041
    //   1032: aload_0
    //   1033: getfield a : I
    //   1036: bipush #101
    //   1038: if_icmpne -> 1065
    //   1041: aload_1
    //   1042: iload_2
    //   1043: iload_3
    //   1044: iload #5
    //   1046: iconst_1
    //   1047: iadd
    //   1048: iload #6
    //   1050: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIII)V
    //   1053: iinc #2, 3
    //   1056: iinc #3, 3
    //   1059: iinc #5, -6
    //   1062: iinc #6, -6
    //   1065: aload_1
    //   1066: iload #9
    //   1068: invokevirtual setColor : (I)V
    //   1071: aload_1
    //   1072: invokevirtual getClipX : ()I
    //   1075: istore #7
    //   1077: aload_1
    //   1078: invokevirtual getClipY : ()I
    //   1081: istore #9
    //   1083: aload_1
    //   1084: invokevirtual getClipWidth : ()I
    //   1087: istore #10
    //   1089: aload_1
    //   1090: invokevirtual getClipHeight : ()I
    //   1093: istore #11
    //   1095: aload_1
    //   1096: iload_2
    //   1097: iload_3
    //   1098: iload #5
    //   1100: iconst_1
    //   1101: iadd
    //   1102: iload #6
    //   1104: iconst_1
    //   1105: iadd
    //   1106: invokevirtual clipRect : (IIII)V
    //   1109: aload_0
    //   1110: getfield a : I
    //   1113: bipush #115
    //   1115: if_icmpne -> 1220
    //   1118: aload_0
    //   1119: getfield a : [Z
    //   1122: ifnull -> 1220
    //   1125: aload_0
    //   1126: getfield a : [Ljava/lang/String;
    //   1129: ifnull -> 1220
    //   1132: iconst_0
    //   1133: istore #6
    //   1135: ldc 'hk1'
    //   1137: aload_0
    //   1138: getfield a : Ljava/lang/String;
    //   1141: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1144: ifeq -> 1157
    //   1147: bipush #16
    //   1149: invokestatic d : (I)Ljava/lang/String;
    //   1152: astore #4
    //   1154: goto -> 1220
    //   1157: iconst_0
    //   1158: istore #12
    //   1160: iload #12
    //   1162: aload_0
    //   1163: getfield a : [Z
    //   1166: arraylength
    //   1167: if_icmpge -> 1220
    //   1170: aload_0
    //   1171: getfield a : [Z
    //   1174: iload #12
    //   1176: baload
    //   1177: ifeq -> 1214
    //   1180: aload_0
    //   1181: getfield a : [Ljava/lang/String;
    //   1184: iload #12
    //   1186: aaload
    //   1187: ifnull -> 1214
    //   1190: iload #6
    //   1192: ifeq -> 1202
    //   1195: ldc '...'
    //   1197: astore #4
    //   1199: goto -> 1220
    //   1202: iconst_1
    //   1203: istore #6
    //   1205: aload_0
    //   1206: getfield a : [Ljava/lang/String;
    //   1209: iload #12
    //   1211: aaload
    //   1212: astore #4
    //   1214: iinc #12, 1
    //   1217: goto -> 1160
    //   1220: aload #4
    //   1222: ifnull -> 1296
    //   1225: aload #4
    //   1227: invokevirtual length : ()I
    //   1230: ifle -> 1296
    //   1233: aload_0
    //   1234: getfield c : Ljava/lang/String;
    //   1237: ifnonnull -> 1256
    //   1240: aload_0
    //   1241: getstatic v.c : Ljavax/microedition/lcdui/Font;
    //   1244: aload #4
    //   1246: iload #5
    //   1248: iconst_0
    //   1249: aconst_null
    //   1250: invokestatic a : (Ljavax/microedition/lcdui/Font;Ljava/lang/String;IZLjava/lang/String;)Ljava/lang/String;
    //   1253: putfield c : Ljava/lang/String;
    //   1256: aload_1
    //   1257: getstatic v.c : Ljavax/microedition/lcdui/Font;
    //   1260: aload_0
    //   1261: getfield c : Ljava/lang/String;
    //   1264: aload_0
    //   1265: getfield a : Ljavax/microedition/lcdui/Image;
    //   1268: ifnonnull -> 1275
    //   1271: iload_2
    //   1272: goto -> 1286
    //   1275: iload_2
    //   1276: aload_0
    //   1277: getfield a : Ljavax/microedition/lcdui/Image;
    //   1280: invokevirtual getWidth : ()I
    //   1283: iadd
    //   1284: iconst_3
    //   1285: iadd
    //   1286: iload_3
    //   1287: bipush #20
    //   1289: iload #8
    //   1291: iconst_0
    //   1292: iconst_0
    //   1293: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;Ljava/lang/String;IIIIZZ)V
    //   1296: aload_1
    //   1297: iload #7
    //   1299: iload #9
    //   1301: iload #10
    //   1303: iload #11
    //   1305: invokevirtual setClip : (IIII)V
    //   1308: return
  }
  
  public final String b() {
    if (this.a == 115) {
      StringBuffer stringBuffer = new StringBuffer();
      for (byte b = 0; b < this.f; b++) {
        boolean bool = this.b[b];
        if (this.a[b]) {
          if (stringBuffer.length() > 0)
            stringBuffer.append('&'); 
          stringBuffer.append(v.a((String)this.a, true, true)).append('=').append(v.a(bool, true, true));
        } 
      } 
      return stringBuffer.toString();
    } 
    return (this.a != null && this.b != null && this.a != 111 && this.a != 85) ? v.a(v.a((String)this.a, true, true), "=", v.a((String)this.b, true, true)) : "";
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ah.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */