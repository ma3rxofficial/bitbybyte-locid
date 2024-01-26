import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.ServerSocketConnection;
import javax.microedition.io.SocketConnection;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextBox;

public final class ad implements Runnable, CommandListener {
  private int f;
  
  public Vector a;
  
  public boolean a;
  
  public String[] a;
  
  public static int a;
  
  public String a;
  
  public String b;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private boolean f;
  
  private Command a;
  
  private Command b;
  
  private Thread a;
  
  public int b;
  
  public aa a;
  
  public int c;
  
  public String c;
  
  private l a;
  
  public static boolean b;
  
  private Hashtable a;
  
  private boolean g;
  
  private Vector b;
  
  private String h;
  
  private int g;
  
  public static boolean c;
  
  private SocketConnection a;
  
  private InputStream a;
  
  private OutputStream a;
  
  private boolean h;
  
  private SocketConnection b;
  
  private InputStream b;
  
  private OutputStream b;
  
  private String i;
  
  private String j;
  
  private String k;
  
  private String l;
  
  private String m;
  
  private boolean i;
  
  private String n;
  
  private String o;
  
  private String p;
  
  private String q;
  
  private boolean j;
  
  public int d;
  
  public int e;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private String r;
  
  private String s;
  
  private int h;
  
  public boolean d;
  
  public boolean e = "";
  
  private int i;
  
  private int j;
  
  public String d;
  
  private StringBuffer a;
  
  private int k;
  
  private int l;
  
  public long a;
  
  private l b = (l)"";
  
  private Timer a;
  
  private int m;
  
  private boolean n;
  
  private static String t = "*";
  
  public ad() {
    this.b = false;
    this.k = 0;
    this.l = 0;
    this.a = (Timer)new Command(v.d(0), 4, 0);
    this.b = (l)new Command(v.d(4), 3, 1);
    this.a = null;
    this.a = null;
    this.a = null;
    this.h = 0;
    this.b = null;
    this.b = null;
    this.b = null;
    this.r = "/";
    this.s = "";
    this.i = v.bv << 10;
    this.b = (l)new Vector(0);
    this.a = (Timer)new Vector(0);
    this.a = (Timer)new StringBuffer(0);
    a = false;
  }
  
  private void s() {
    if (this.a == null || ((aa)this.a).a == null || !v.a((v)((aa)this.a).a, false)) {
      this.a = null;
      this.a = (Timer)new aa((v)((af)af.b).a);
      ((aa)this.a).a = true;
      return;
    } 
    if (!v.a((v)((aa)this.a).a, true))
      ((aa)this.a).a = (Thread)((af)af.b).a; 
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2) {
    String[] arrayOfString;
    s();
    if (!a() || paramBoolean2) {
      if (!v.cL || paramBoolean2) {
        v.cL = true;
        ((aa)this.a).a.d(61446);
        return;
      } 
      v.cL = false;
      aa.a = (Thread)(arrayOfString = v.k.elementAt(v.bk))[0];
      this.i = arrayOfString[1];
      this.j = arrayOfString[2];
      this.k = arrayOfString[3];
      this.l = arrayOfString[4];
      this.m = arrayOfString[5];
      this.i = "1".equals(arrayOfString[6]);
      this.n = arrayOfString[7];
      this.o = arrayOfString[8];
      this.j = "1".equals(arrayOfString[9]);
      this.d = v.a(arrayOfString[10], 90);
      this.p = arrayOfString[11];
      this.q = arrayOfString[12];
      this.l = "1".equals(arrayOfString[13]);
      this.k = "1".equals(arrayOfString[14]);
      this.m = arrayOfString[15].startsWith("1");
      b(21);
      return;
    } 
    if (arrayOfString != null) {
      t();
      b(20);
      return;
    } 
    if (this.a != null && this.b != null && this.b < 10) {
      this.a.c();
      return;
    } 
    ((aa)this.a).a.d(61441);
  }
  
  public final void a(String paramString) {
    if (paramString.equals(v.c(61472))) {
      a += v.aN;
      ((aa)this.a).a.d(61441);
      return;
    } 
    if (paramString.equals(v.c(61473))) {
      a = v.a(a -= v.aN, 0);
      ((aa)this.a).a.d(61441);
      return;
    } 
    if (!this.a.isEmpty() && this.a != null && ai.g(paramString)) {
      this.a = (Timer)paramString;
      af.b.b(45085);
      return;
    } 
    l();
    if (!ai.e(paramString)) {
      this.f = paramString;
      b(3);
    } 
  }
  
  private void c(boolean paramBoolean) {
    a = false;
    if (paramBoolean)
      u(); 
    this.a = (Timer)ai.a(a(v.t, v.ab), -1);
  }
  
  private void b(int paramInt) {
    if (this.a == null || paramInt == 12 || paramInt == 11 || (paramInt == 21 && this.b == 21)) {
      this.b = paramInt;
      this.a = null;
      (this.a = (Timer)v.a(this)).setPriority(1);
      return;
    } 
    this.g = 0;
    if (paramInt != 10)
      af.b.a(1500, v.a(v.d(536), String.valueOf(this.b), ":", String.valueOf(paramInt)), v.d(332)); 
  }
  
  public final void run() {
    // Byte code:
    //   0: iconst_1
    //   1: putstatic ad.c : Z
    //   4: aload_0
    //   5: getfield b : I
    //   8: ifne -> 17
    //   11: aload_0
    //   12: bipush #12
    //   14: putfield b : I
    //   17: aload_0
    //   18: getfield b : I
    //   21: bipush #10
    //   23: if_icmpeq -> 30
    //   26: aload_0
    //   27: invokespecial s : ()V
    //   30: iconst_0
    //   31: istore_1
    //   32: iconst_0
    //   33: istore_2
    //   34: aload_0
    //   35: ldc ''
    //   37: putfield s : Ljava/lang/String;
    //   40: aload_0
    //   41: iconst_0
    //   42: putfield e : Z
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield d : Z
    //   50: invokestatic a : ()Z
    //   53: ifeq -> 87
    //   56: getstatic af.b : Laf;
    //   59: sipush #683
    //   62: invokestatic d : (I)Ljava/lang/String;
    //   65: invokevirtual c : (Ljava/lang/String;)V
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield e : Z
    //   73: aload_0
    //   74: bipush #11
    //   76: putfield j : I
    //   79: new java/io/IOException
    //   82: dup
    //   83: invokespecial <init> : ()V
    //   86: athrow
    //   87: aload_0
    //   88: getfield b : I
    //   91: tableswitch default -> 1336, 3 -> 427, 4 -> 780, 5 -> 930, 6 -> 485, 7 -> 444, 8 -> 594, 9 -> 1176, 10 -> 1307, 11 -> 1332, 12 -> 1332, 13 -> 1336, 14 -> 1336, 15 -> 1336, 16 -> 1336, 17 -> 1336, 18 -> 1336, 19 -> 1336, 20 -> 411, 21 -> 184, 22 -> 419
    //   184: aload_0
    //   185: getfield a : Laa;
    //   188: getfield a : Lv;
    //   191: iconst_2
    //   192: putfield aM : I
    //   195: aload_0
    //   196: getfield q : Ljava/lang/String;
    //   199: invokevirtual length : ()I
    //   202: iconst_1
    //   203: if_icmple -> 229
    //   206: getstatic v.a : [Lai;
    //   209: getstatic af.b : Laf;
    //   212: getfield a : Lv;
    //   215: getfield c : B
    //   218: aaload
    //   219: aload_0
    //   220: getfield q : Ljava/lang/String;
    //   223: invokestatic g : (Ljava/lang/String;)Ljava/lang/String;
    //   226: invokevirtual b : (Ljava/lang/String;)V
    //   229: aload_0
    //   230: getfield i : Z
    //   233: ifne -> 263
    //   236: aload_0
    //   237: aload_0
    //   238: getfield i : Ljava/lang/String;
    //   241: aload_0
    //   242: getfield j : Ljava/lang/String;
    //   245: aload_0
    //   246: getfield k : Ljava/lang/String;
    //   249: aload_0
    //   250: getfield l : Ljava/lang/String;
    //   253: aload_0
    //   254: getfield m : Ljava/lang/String;
    //   257: invokespecial a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   260: goto -> 285
    //   263: aload_0
    //   264: aload_0
    //   265: getfield i : Ljava/lang/String;
    //   268: aload_0
    //   269: getfield j : Ljava/lang/String;
    //   272: aload_0
    //   273: getfield n : Ljava/lang/String;
    //   276: aload_0
    //   277: getfield o : Ljava/lang/String;
    //   280: ldc ''
    //   282: invokespecial a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   285: aload_0
    //   286: getfield d : Z
    //   289: ifne -> 299
    //   292: aload_0
    //   293: getfield e : Z
    //   296: ifeq -> 312
    //   299: iconst_1
    //   300: istore_2
    //   301: aload_0
    //   302: invokevirtual k : ()V
    //   305: aload_0
    //   306: invokevirtual j : ()V
    //   309: goto -> 1336
    //   312: aload_0
    //   313: getfield f : Ljava/lang/String;
    //   316: ifnull -> 342
    //   319: aload_0
    //   320: getfield f : Ljava/lang/String;
    //   323: invokevirtual length : ()I
    //   326: iconst_1
    //   327: if_icmple -> 342
    //   330: aload_0
    //   331: aload_0
    //   332: getfield f : Ljava/lang/String;
    //   335: invokespecial c : (Ljava/lang/String;)I
    //   338: pop
    //   339: goto -> 384
    //   342: aload_0
    //   343: getfield p : Ljava/lang/String;
    //   346: invokevirtual length : ()I
    //   349: iconst_1
    //   350: if_icmple -> 365
    //   353: aload_0
    //   354: aload_0
    //   355: getfield p : Ljava/lang/String;
    //   358: invokespecial c : (Ljava/lang/String;)I
    //   361: pop
    //   362: goto -> 384
    //   365: ldc '/'
    //   367: aload_0
    //   368: getfield r : Ljava/lang/String;
    //   371: invokevirtual equals : (Ljava/lang/Object;)Z
    //   374: ifne -> 384
    //   377: aload_0
    //   378: ldc '/'
    //   380: invokespecial c : (Ljava/lang/String;)I
    //   383: pop
    //   384: aload_0
    //   385: getfield d : Z
    //   388: ifne -> 398
    //   391: aload_0
    //   392: getfield e : Z
    //   395: ifeq -> 411
    //   398: iconst_1
    //   399: istore_2
    //   400: aload_0
    //   401: invokevirtual k : ()V
    //   404: aload_0
    //   405: invokevirtual j : ()V
    //   408: goto -> 1336
    //   411: aload_0
    //   412: iconst_1
    //   413: invokespecial c : (Z)V
    //   416: goto -> 1336
    //   419: aload_0
    //   420: iconst_0
    //   421: invokespecial c : (Z)V
    //   424: goto -> 1336
    //   427: aload_0
    //   428: aload_0
    //   429: getfield f : Ljava/lang/String;
    //   432: invokespecial c : (Ljava/lang/String;)I
    //   435: pop
    //   436: aload_0
    //   437: iconst_1
    //   438: invokespecial c : (Z)V
    //   441: goto -> 1336
    //   444: aload_0
    //   445: aload_0
    //   446: getfield f : Ljava/lang/String;
    //   449: invokespecial e : (Ljava/lang/String;)I
    //   452: iconst_2
    //   453: if_icmpne -> 472
    //   456: aload_0
    //   457: invokespecial w : ()V
    //   460: aload_0
    //   461: invokespecial t : ()V
    //   464: aload_0
    //   465: iconst_1
    //   466: invokespecial c : (Z)V
    //   469: goto -> 1336
    //   472: getstatic af.b : Laf;
    //   475: aload_0
    //   476: getfield s : Ljava/lang/String;
    //   479: invokevirtual c : (Ljava/lang/String;)V
    //   482: goto -> 1336
    //   485: iconst_0
    //   486: putstatic ad.b : Z
    //   489: aload_0
    //   490: getfield a : Z
    //   493: ifne -> 505
    //   496: aload_0
    //   497: aload_0
    //   498: getfield a : Ljava/lang/String;
    //   501: iconst_1
    //   502: invokespecial a : (Ljava/lang/String;Z)V
    //   505: aload_0
    //   506: invokespecial t : ()V
    //   509: iconst_0
    //   510: istore_3
    //   511: iload_3
    //   512: aload_0
    //   513: getfield a : Ljava/util/Vector;
    //   516: invokevirtual size : ()I
    //   519: if_icmpge -> 586
    //   522: aload_0
    //   523: aload_0
    //   524: getfield a : Ljava/util/Vector;
    //   527: iload_3
    //   528: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   531: checkcast java/lang/String
    //   534: invokespecial b : (Ljava/lang/String;)I
    //   537: iconst_2
    //   538: if_icmpne -> 570
    //   541: aload_0
    //   542: invokespecial t : ()V
    //   545: iload_3
    //   546: aload_0
    //   547: getfield a : Ljava/util/Vector;
    //   550: invokevirtual size : ()I
    //   553: if_icmpge -> 580
    //   556: aload_0
    //   557: getfield a : Ljava/util/Vector;
    //   560: iload_3
    //   561: invokevirtual removeElementAt : (I)V
    //   564: iinc #3, -1
    //   567: goto -> 580
    //   570: getstatic af.b : Laf;
    //   573: aload_0
    //   574: getfield s : Ljava/lang/String;
    //   577: invokevirtual c : (Ljava/lang/String;)V
    //   580: iinc #3, 1
    //   583: goto -> 511
    //   586: aload_0
    //   587: iconst_1
    //   588: invokespecial c : (Z)V
    //   591: goto -> 1336
    //   594: aload_0
    //   595: aload_0
    //   596: getfield f : Ljava/lang/String;
    //   599: invokespecial d : (Ljava/lang/String;)Z
    //   602: ifeq -> 655
    //   605: getstatic af.b : Laf;
    //   608: sipush #277
    //   611: invokestatic d : (I)Ljava/lang/String;
    //   614: ldc ' '
    //   616: aload_0
    //   617: getfield f : Ljava/lang/String;
    //   620: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   623: iconst_0
    //   624: invokevirtual a : (Ljava/lang/String;Z)I
    //   627: iconst_1
    //   628: if_icmpne -> 642
    //   631: aload_0
    //   632: aload_0
    //   633: getfield f : Ljava/lang/String;
    //   636: putfield e : Ljava/lang/String;
    //   639: goto -> 655
    //   642: getstatic af.b : Laf;
    //   645: aload_0
    //   646: getfield s : Ljava/lang/String;
    //   649: invokevirtual c : (Ljava/lang/String;)V
    //   652: goto -> 1336
    //   655: aload_0
    //   656: getfield e : Ljava/lang/String;
    //   659: ifnull -> 688
    //   662: aload_0
    //   663: getfield e : Ljava/lang/String;
    //   666: invokevirtual length : ()I
    //   669: ifle -> 688
    //   672: aload_0
    //   673: getfield a : Z
    //   676: ifne -> 688
    //   679: aload_0
    //   680: aload_0
    //   681: getfield e : Ljava/lang/String;
    //   684: invokespecial b : (Ljava/lang/String;)I
    //   687: pop
    //   688: aload_0
    //   689: invokespecial t : ()V
    //   692: aload_0
    //   693: ldc ''
    //   695: putfield e : Ljava/lang/String;
    //   698: aload_0
    //   699: aload_0
    //   700: getfield a : Ljava/lang/String;
    //   703: aload_0
    //   704: getfield f : Ljava/lang/String;
    //   707: astore #7
    //   709: astore #6
    //   711: astore_3
    //   712: aload #6
    //   714: invokestatic h : (Ljava/lang/String;)Ljava/lang/String;
    //   717: astore #6
    //   719: aload #7
    //   721: invokestatic h : (Ljava/lang/String;)Ljava/lang/String;
    //   724: astore #7
    //   726: aload_3
    //   727: ldc 'RNFR '
    //   729: aload #6
    //   731: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   734: aload_3
    //   735: invokespecial a : ()I
    //   738: iconst_3
    //   739: if_icmpne -> 757
    //   742: aload_3
    //   743: ldc 'RNTO '
    //   745: aload #7
    //   747: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   750: aload_3
    //   751: invokespecial a : ()I
    //   754: goto -> 768
    //   757: getstatic af.b : Laf;
    //   760: aload_3
    //   761: getfield s : Ljava/lang/String;
    //   764: invokevirtual c : (Ljava/lang/String;)V
    //   767: iconst_0
    //   768: iconst_2
    //   769: if_icmpne -> 1336
    //   772: aload_0
    //   773: iconst_1
    //   774: invokespecial c : (Z)V
    //   777: goto -> 1336
    //   780: iconst_0
    //   781: putstatic ad.b : Z
    //   784: aload_0
    //   785: aload_0
    //   786: iconst_0
    //   787: dup_x1
    //   788: putfield d : Z
    //   791: putfield e : Z
    //   794: aload_0
    //   795: getfield a : Z
    //   798: ifne -> 810
    //   801: aload_0
    //   802: aload_0
    //   803: getfield a : Ljava/lang/String;
    //   806: iconst_1
    //   807: invokespecial a : (Ljava/lang/String;Z)V
    //   810: aload_0
    //   811: iconst_1
    //   812: putfield k : I
    //   815: aload_0
    //   816: aload_0
    //   817: getfield a : Ljava/util/Vector;
    //   820: invokevirtual size : ()I
    //   823: putfield l : I
    //   826: iconst_0
    //   827: istore_3
    //   828: iload_3
    //   829: aload_0
    //   830: getfield a : Ljava/util/Vector;
    //   833: invokevirtual size : ()I
    //   836: if_icmpge -> 927
    //   839: aload_0
    //   840: getstatic v.a : [Lai;
    //   843: getstatic af.b : Laf;
    //   846: getfield a : Lv;
    //   849: getfield c : B
    //   852: aaload
    //   853: invokevirtual a : ()Ljava/lang/String;
    //   856: aload_0
    //   857: getfield a : Ljava/util/Vector;
    //   860: iload_3
    //   861: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   864: checkcast java/lang/String
    //   867: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   870: invokespecial a : (Ljava/lang/String;)Z
    //   873: ifeq -> 901
    //   876: iload_3
    //   877: aload_0
    //   878: getfield a : Ljava/util/Vector;
    //   881: invokevirtual size : ()I
    //   884: if_icmpge -> 911
    //   887: aload_0
    //   888: getfield a : Ljava/util/Vector;
    //   891: iload_3
    //   892: invokevirtual removeElementAt : (I)V
    //   895: iinc #3, -1
    //   898: goto -> 911
    //   901: getstatic af.b : Laf;
    //   904: aload_0
    //   905: getfield s : Ljava/lang/String;
    //   908: invokevirtual c : (Ljava/lang/String;)V
    //   911: aload_0
    //   912: dup
    //   913: getfield k : I
    //   916: iconst_1
    //   917: iadd
    //   918: putfield k : I
    //   921: iinc #3, 1
    //   924: goto -> 828
    //   927: goto -> 1336
    //   930: iconst_1
    //   931: putstatic ad.b : Z
    //   934: aload_0
    //   935: aload_0
    //   936: iconst_0
    //   937: dup_x1
    //   938: putfield d : Z
    //   941: putfield e : Z
    //   944: getstatic ai.a : Z
    //   947: ifne -> 983
    //   950: getstatic v.a : [Lai;
    //   953: getstatic af.b : Laf;
    //   956: getfield a : Lv;
    //   959: getfield c : B
    //   962: aaload
    //   963: getstatic v.a : [Lai;
    //   966: getstatic af.b : Laf;
    //   969: getfield a : Lv;
    //   972: getfield c : B
    //   975: aaload
    //   976: getfield b : Ljava/lang/String;
    //   979: iconst_1
    //   980: invokevirtual b : (Ljava/lang/String;Z)V
    //   983: aload_0
    //   984: getstatic ai.a : Ljava/util/Vector;
    //   987: putfield a : Ljava/util/Vector;
    //   990: new java/util/Vector
    //   993: dup
    //   994: invokespecial <init> : ()V
    //   997: putstatic ai.a : Ljava/util/Vector;
    //   1000: getstatic v.a : [Lai;
    //   1003: getstatic af.b : Laf;
    //   1006: getfield a : Lv;
    //   1009: getfield c : B
    //   1012: aaload
    //   1013: invokevirtual a : ()Ljava/lang/String;
    //   1016: astore_3
    //   1017: aload_0
    //   1018: invokespecial t : ()V
    //   1021: aload_0
    //   1022: iconst_1
    //   1023: putfield k : I
    //   1026: aload_0
    //   1027: aload_0
    //   1028: getfield a : Ljava/util/Vector;
    //   1031: invokevirtual size : ()I
    //   1034: putfield l : I
    //   1037: iconst_0
    //   1038: istore #4
    //   1040: iload #4
    //   1042: aload_0
    //   1043: getfield a : Ljava/util/Vector;
    //   1046: invokevirtual size : ()I
    //   1049: if_icmpge -> 1146
    //   1052: aload_0
    //   1053: getfield e : Z
    //   1056: ifne -> 1146
    //   1059: aload_0
    //   1060: getfield d : Z
    //   1063: ifne -> 1146
    //   1066: aload_0
    //   1067: aload_3
    //   1068: aload_0
    //   1069: getfield a : Ljava/util/Vector;
    //   1072: iload #4
    //   1074: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1077: checkcast java/lang/String
    //   1080: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1083: invokespecial b : (Ljava/lang/String;)Z
    //   1086: ifeq -> 1120
    //   1089: aload_0
    //   1090: invokespecial t : ()V
    //   1093: iload #4
    //   1095: aload_0
    //   1096: getfield a : Ljava/util/Vector;
    //   1099: invokevirtual size : ()I
    //   1102: if_icmpge -> 1130
    //   1105: aload_0
    //   1106: getfield a : Ljava/util/Vector;
    //   1109: iload #4
    //   1111: invokevirtual removeElementAt : (I)V
    //   1114: iinc #4, -1
    //   1117: goto -> 1130
    //   1120: getstatic af.b : Laf;
    //   1123: aload_0
    //   1124: getfield s : Ljava/lang/String;
    //   1127: invokevirtual c : (Ljava/lang/String;)V
    //   1130: aload_0
    //   1131: dup
    //   1132: getfield k : I
    //   1135: iconst_1
    //   1136: iadd
    //   1137: putfield k : I
    //   1140: iinc #4, 1
    //   1143: goto -> 1040
    //   1146: aload_0
    //   1147: getfield a : Ljava/util/Vector;
    //   1150: dup
    //   1151: putstatic ai.a : Ljava/util/Vector;
    //   1154: invokevirtual isEmpty : ()Z
    //   1157: ifne -> 1164
    //   1160: iconst_1
    //   1161: goto -> 1165
    //   1164: iconst_0
    //   1165: putstatic ai.a : Z
    //   1168: aload_0
    //   1169: iconst_1
    //   1170: invokespecial c : (Z)V
    //   1173: goto -> 1336
    //   1176: aload_0
    //   1177: getfield a : Z
    //   1180: ifne -> 1192
    //   1183: aload_0
    //   1184: aload_0
    //   1185: getfield a : Ljava/lang/String;
    //   1188: iconst_1
    //   1189: invokespecial a : (Ljava/lang/String;Z)V
    //   1192: iconst_0
    //   1193: istore #4
    //   1195: iload #4
    //   1197: aload_0
    //   1198: getfield a : Ljava/util/Vector;
    //   1201: invokevirtual size : ()I
    //   1204: if_icmpge -> 1299
    //   1207: aload_0
    //   1208: aload_0
    //   1209: getfield a : Ljava/util/Vector;
    //   1212: iload #4
    //   1214: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1217: checkcast java/lang/String
    //   1220: aload_0
    //   1221: getfield g : Ljava/lang/String;
    //   1224: astore #7
    //   1226: astore #6
    //   1228: dup
    //   1229: astore_3
    //   1230: ldc 'SITE chmod '
    //   1232: aload #7
    //   1234: ldc ' '
    //   1236: aload #6
    //   1238: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1241: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   1244: aload_3
    //   1245: invokespecial a : ()I
    //   1248: iconst_2
    //   1249: if_icmpne -> 1283
    //   1252: aload_0
    //   1253: invokespecial t : ()V
    //   1256: iload #4
    //   1258: aload_0
    //   1259: getfield a : Ljava/util/Vector;
    //   1262: invokevirtual size : ()I
    //   1265: if_icmpge -> 1293
    //   1268: aload_0
    //   1269: getfield a : Ljava/util/Vector;
    //   1272: iload #4
    //   1274: invokevirtual removeElementAt : (I)V
    //   1277: iinc #4, -1
    //   1280: goto -> 1293
    //   1283: getstatic af.b : Laf;
    //   1286: aload_0
    //   1287: getfield s : Ljava/lang/String;
    //   1290: invokevirtual c : (Ljava/lang/String;)V
    //   1293: iinc #4, 1
    //   1296: goto -> 1195
    //   1299: aload_0
    //   1300: iconst_1
    //   1301: invokespecial c : (Z)V
    //   1304: goto -> 1336
    //   1307: aload_0
    //   1308: getfield g : Z
    //   1311: ifeq -> 1336
    //   1314: aload_0
    //   1315: dup
    //   1316: astore_3
    //   1317: ldc 'NOOP'
    //   1319: ldc ''
    //   1321: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   1324: aload_3
    //   1325: invokespecial a : ()I
    //   1328: pop
    //   1329: goto -> 1336
    //   1332: aload_0
    //   1333: invokespecial y : ()V
    //   1336: aload_0
    //   1337: getfield e : Z
    //   1340: ifeq -> 1357
    //   1343: aload_0
    //   1344: bipush #11
    //   1346: putfield j : I
    //   1349: new java/io/IOException
    //   1352: dup
    //   1353: invokespecial <init> : ()V
    //   1356: athrow
    //   1357: aload_0
    //   1358: invokespecial z : ()V
    //   1361: getstatic af.b : Laf;
    //   1364: aload_0
    //   1365: getfield b : I
    //   1368: bipush #10
    //   1370: if_icmpeq -> 1382
    //   1373: aload_0
    //   1374: getfield b : I
    //   1377: bipush #12
    //   1379: if_icmpne -> 1386
    //   1382: iconst_1
    //   1383: goto -> 1387
    //   1386: iconst_0
    //   1387: aload_0
    //   1388: getfield a : Laa;
    //   1391: getfield a : Lv;
    //   1394: invokevirtual b : (ZLv;)V
    //   1397: aload_0
    //   1398: ldc ''
    //   1400: putfield f : Ljava/lang/String;
    //   1403: aload_0
    //   1404: iconst_0
    //   1405: putfield f : I
    //   1408: aload_0
    //   1409: aconst_null
    //   1410: putfield a : Ljava/lang/Thread;
    //   1413: aload_0
    //   1414: aload_0
    //   1415: iconst_0
    //   1416: dup_x1
    //   1417: putfield d : Z
    //   1420: putfield e : Z
    //   1423: aload_0
    //   1424: getfield b : I
    //   1427: bipush #11
    //   1429: if_icmpne -> 1433
    //   1432: return
    //   1433: aload_0
    //   1434: getfield b : I
    //   1437: bipush #10
    //   1439: if_icmpne -> 1456
    //   1442: aload_0
    //   1443: iconst_0
    //   1444: putfield b : I
    //   1447: aload_0
    //   1448: aload_0
    //   1449: getfield g : I
    //   1452: putfield f : I
    //   1455: return
    //   1456: aload_0
    //   1457: getfield a : Laa;
    //   1460: invokevirtual b : ()V
    //   1463: aload_0
    //   1464: iconst_0
    //   1465: putfield b : I
    //   1468: aload_0
    //   1469: getfield a : Laa;
    //   1472: getfield a : Lv;
    //   1475: iconst_0
    //   1476: putfield aM : I
    //   1479: invokestatic r : ()V
    //   1482: aload_0
    //   1483: aload_0
    //   1484: getfield a : Ljava/util/Vector;
    //   1487: invokevirtual isEmpty : ()Z
    //   1490: ifne -> 1497
    //   1493: iconst_1
    //   1494: goto -> 1498
    //   1497: iconst_0
    //   1498: putfield a : Z
    //   1501: aload_0
    //   1502: getfield b : I
    //   1505: iconst_4
    //   1506: if_icmpeq -> 1517
    //   1509: aload_0
    //   1510: getfield b : I
    //   1513: iconst_5
    //   1514: if_icmpne -> 1551
    //   1517: getstatic w.c : I
    //   1520: ifeq -> 1551
    //   1523: getstatic w.A : Z
    //   1526: ifeq -> 1542
    //   1529: getstatic af.b : Laf;
    //   1532: getfield a : Lfavax/microedition/lcdui/Display;
    //   1535: getstatic w.d : I
    //   1538: invokevirtual vibrate : (I)Z
    //   1541: pop
    //   1542: getstatic w.e : I
    //   1545: ifeq -> 1551
    //   1548: invokestatic b : ()V
    //   1551: iload_1
    //   1552: ifeq -> 1572
    //   1555: aload_0
    //   1556: aload_0
    //   1557: getfield r : Ljava/lang/String;
    //   1560: putfield f : Ljava/lang/String;
    //   1563: aload_0
    //   1564: bipush #21
    //   1566: invokespecial b : (I)V
    //   1569: goto -> 1639
    //   1572: iload_2
    //   1573: ifeq -> 1601
    //   1576: aload_0
    //   1577: getfield a : Laa;
    //   1580: getfield a : Lv;
    //   1583: dup
    //   1584: getfield L : I
    //   1587: iconst_1
    //   1588: isub
    //   1589: putfield L : I
    //   1592: aload_0
    //   1593: iconst_0
    //   1594: iconst_1
    //   1595: invokevirtual a : (ZZ)V
    //   1598: goto -> 1639
    //   1601: aload_0
    //   1602: invokevirtual a : ()Z
    //   1605: ifne -> 1627
    //   1608: iconst_1
    //   1609: putstatic v.cL : Z
    //   1612: aload_0
    //   1613: getfield a : Laa;
    //   1616: getfield a : Lv;
    //   1619: ldc 61446
    //   1621: invokevirtual d : (I)V
    //   1624: goto -> 1639
    //   1627: aload_0
    //   1628: getfield a : Laa;
    //   1631: getfield a : Lv;
    //   1634: ldc 61441
    //   1636: invokevirtual d : (I)V
    //   1639: iconst_0
    //   1640: putstatic ad.c : Z
    //   1643: return
    //   1644: dup
    //   1645: astore_3
    //   1646: invokevirtual toString : ()Ljava/lang/String;
    //   1649: ldc 'send'
    //   1651: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1654: iconst_m1
    //   1655: if_icmpne -> 1671
    //   1658: aload_3
    //   1659: invokevirtual toString : ()Ljava/lang/String;
    //   1662: ldc 'read'
    //   1664: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1667: iconst_m1
    //   1668: if_icmpeq -> 1693
    //   1671: getstatic af.b : Laf;
    //   1674: sipush #530
    //   1677: invokestatic d : (I)Ljava/lang/String;
    //   1680: iconst_0
    //   1681: invokevirtual a : (Ljava/lang/String;Z)I
    //   1684: iconst_1
    //   1685: if_icmpne -> 1693
    //   1688: iconst_1
    //   1689: istore_1
    //   1690: goto -> 2008
    //   1693: aload_0
    //   1694: getfield e : Z
    //   1697: ifeq -> 1709
    //   1700: aload_0
    //   1701: bipush #11
    //   1703: putfield j : I
    //   1706: goto -> 1714
    //   1709: aload_3
    //   1710: instanceof java/io/IOException
    //   1713: istore_2
    //   1714: getstatic af.b : Laf;
    //   1717: aload_0
    //   1718: new java/lang/StringBuffer
    //   1721: dup
    //   1722: bipush #50
    //   1724: invokespecial <init> : (I)V
    //   1727: bipush #40
    //   1729: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   1732: aload_3
    //   1733: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   1736: bipush #41
    //   1738: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   1741: astore #6
    //   1743: dup
    //   1744: astore_3
    //   1745: getfield j : I
    //   1748: tableswitch default -> 1964, 1 -> 1812, 2 -> 1827, 3 -> 1887, 4 -> 1864, 5 -> 1887, 6 -> 1887, 7 -> 1887, 8 -> 1964, 9 -> 1964, 10 -> 1902, 11 -> 1918, 12 -> 1939
    //   1812: aload #6
    //   1814: iconst_0
    //   1815: bipush #39
    //   1817: invokestatic d : (I)Ljava/lang/String;
    //   1820: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuffer;
    //   1823: pop
    //   1824: goto -> 1964
    //   1827: aload #6
    //   1829: iconst_0
    //   1830: bipush #100
    //   1832: bipush #37
    //   1834: invokestatic d : (I)Ljava/lang/String;
    //   1837: ldc ' > '
    //   1839: bipush #36
    //   1841: invokestatic d : (I)Ljava/lang/String;
    //   1844: ldc ' > '
    //   1846: bipush #61
    //   1848: invokestatic d : (I)Ljava/lang/String;
    //   1851: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1854: invokestatic a : (ILjava/lang/String;)Ljava/lang/String;
    //   1857: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuffer;
    //   1860: pop
    //   1861: goto -> 1964
    //   1864: aload #6
    //   1866: iconst_0
    //   1867: sipush #580
    //   1870: invokestatic d : (I)Ljava/lang/String;
    //   1873: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuffer;
    //   1876: aload_3
    //   1877: getfield s : Ljava/lang/String;
    //   1880: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1883: pop
    //   1884: goto -> 1964
    //   1887: aload #6
    //   1889: iconst_0
    //   1890: bipush #63
    //   1892: invokestatic d : (I)Ljava/lang/String;
    //   1895: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuffer;
    //   1898: pop
    //   1899: goto -> 1964
    //   1902: aload #6
    //   1904: iconst_0
    //   1905: sipush #581
    //   1908: invokestatic d : (I)Ljava/lang/String;
    //   1911: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuffer;
    //   1914: pop
    //   1915: goto -> 1964
    //   1918: aload #6
    //   1920: iconst_0
    //   1921: invokevirtual setLength : (I)V
    //   1924: aload #6
    //   1926: sipush #582
    //   1929: invokestatic d : (I)Ljava/lang/String;
    //   1932: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1935: pop
    //   1936: goto -> 1964
    //   1939: aload #6
    //   1941: iconst_0
    //   1942: invokevirtual setLength : (I)V
    //   1945: aload #6
    //   1947: sipush #583
    //   1950: invokestatic d : (I)Ljava/lang/String;
    //   1953: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1956: aload_3
    //   1957: getfield s : Ljava/lang/String;
    //   1960: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1963: pop
    //   1964: aload #6
    //   1966: bipush #32
    //   1968: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   1971: aload_0
    //   1972: getfield b : I
    //   1975: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1978: bipush #58
    //   1980: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   1983: aload_0
    //   1984: getfield j : I
    //   1987: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1990: bipush #58
    //   1992: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   1995: aload_0
    //   1996: getfield h : I
    //   1999: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2002: invokevirtual toString : ()Ljava/lang/String;
    //   2005: invokevirtual c : (Ljava/lang/String;)V
    //   2008: aload_0
    //   2009: invokevirtual k : ()V
    //   2012: iload_1
    //   2013: ifeq -> 2020
    //   2016: aload_0
    //   2017: invokespecial y : ()V
    //   2020: aload_0
    //   2021: invokespecial z : ()V
    //   2024: getstatic af.b : Laf;
    //   2027: aload_0
    //   2028: getfield b : I
    //   2031: bipush #10
    //   2033: if_icmpeq -> 2045
    //   2036: aload_0
    //   2037: getfield b : I
    //   2040: bipush #12
    //   2042: if_icmpne -> 2049
    //   2045: iconst_1
    //   2046: goto -> 2050
    //   2049: iconst_0
    //   2050: aload_0
    //   2051: getfield a : Laa;
    //   2054: getfield a : Lv;
    //   2057: invokevirtual b : (ZLv;)V
    //   2060: aload_0
    //   2061: ldc ''
    //   2063: putfield f : Ljava/lang/String;
    //   2066: aload_0
    //   2067: iconst_0
    //   2068: putfield f : I
    //   2071: aload_0
    //   2072: aconst_null
    //   2073: putfield a : Ljava/lang/Thread;
    //   2076: aload_0
    //   2077: aload_0
    //   2078: iconst_0
    //   2079: dup_x1
    //   2080: putfield d : Z
    //   2083: putfield e : Z
    //   2086: aload_0
    //   2087: getfield b : I
    //   2090: bipush #11
    //   2092: if_icmpne -> 2096
    //   2095: return
    //   2096: aload_0
    //   2097: getfield b : I
    //   2100: bipush #10
    //   2102: if_icmpne -> 2119
    //   2105: aload_0
    //   2106: iconst_0
    //   2107: putfield b : I
    //   2110: aload_0
    //   2111: aload_0
    //   2112: getfield g : I
    //   2115: putfield f : I
    //   2118: return
    //   2119: aload_0
    //   2120: getfield a : Laa;
    //   2123: invokevirtual b : ()V
    //   2126: aload_0
    //   2127: iconst_0
    //   2128: putfield b : I
    //   2131: aload_0
    //   2132: getfield a : Laa;
    //   2135: getfield a : Lv;
    //   2138: iconst_0
    //   2139: putfield aM : I
    //   2142: invokestatic r : ()V
    //   2145: aload_0
    //   2146: aload_0
    //   2147: getfield a : Ljava/util/Vector;
    //   2150: invokevirtual isEmpty : ()Z
    //   2153: ifne -> 2160
    //   2156: iconst_1
    //   2157: goto -> 2161
    //   2160: iconst_0
    //   2161: putfield a : Z
    //   2164: aload_0
    //   2165: getfield b : I
    //   2168: iconst_4
    //   2169: if_icmpeq -> 2180
    //   2172: aload_0
    //   2173: getfield b : I
    //   2176: iconst_5
    //   2177: if_icmpne -> 2214
    //   2180: getstatic w.c : I
    //   2183: ifeq -> 2214
    //   2186: getstatic w.A : Z
    //   2189: ifeq -> 2205
    //   2192: getstatic af.b : Laf;
    //   2195: getfield a : Lfavax/microedition/lcdui/Display;
    //   2198: getstatic w.d : I
    //   2201: invokevirtual vibrate : (I)Z
    //   2204: pop
    //   2205: getstatic w.e : I
    //   2208: ifeq -> 2214
    //   2211: invokestatic b : ()V
    //   2214: iload_1
    //   2215: ifeq -> 2235
    //   2218: aload_0
    //   2219: aload_0
    //   2220: getfield r : Ljava/lang/String;
    //   2223: putfield f : Ljava/lang/String;
    //   2226: aload_0
    //   2227: bipush #21
    //   2229: invokespecial b : (I)V
    //   2232: goto -> 2302
    //   2235: iload_2
    //   2236: ifeq -> 2264
    //   2239: aload_0
    //   2240: getfield a : Laa;
    //   2243: getfield a : Lv;
    //   2246: dup
    //   2247: getfield L : I
    //   2250: iconst_1
    //   2251: isub
    //   2252: putfield L : I
    //   2255: aload_0
    //   2256: iconst_0
    //   2257: iconst_1
    //   2258: invokevirtual a : (ZZ)V
    //   2261: goto -> 2302
    //   2264: aload_0
    //   2265: invokevirtual a : ()Z
    //   2268: ifne -> 2290
    //   2271: iconst_1
    //   2272: putstatic v.cL : Z
    //   2275: aload_0
    //   2276: getfield a : Laa;
    //   2279: getfield a : Lv;
    //   2282: ldc 61446
    //   2284: invokevirtual d : (I)V
    //   2287: goto -> 2302
    //   2290: aload_0
    //   2291: getfield a : Laa;
    //   2294: getfield a : Lv;
    //   2297: ldc 61441
    //   2299: invokevirtual d : (I)V
    //   2302: iconst_0
    //   2303: putstatic ad.c : Z
    //   2306: return
    //   2307: astore #5
    //   2309: aload_0
    //   2310: invokespecial z : ()V
    //   2313: getstatic af.b : Laf;
    //   2316: aload_0
    //   2317: getfield b : I
    //   2320: bipush #10
    //   2322: if_icmpeq -> 2334
    //   2325: aload_0
    //   2326: getfield b : I
    //   2329: bipush #12
    //   2331: if_icmpne -> 2338
    //   2334: iconst_1
    //   2335: goto -> 2339
    //   2338: iconst_0
    //   2339: aload_0
    //   2340: getfield a : Laa;
    //   2343: getfield a : Lv;
    //   2346: invokevirtual b : (ZLv;)V
    //   2349: aload_0
    //   2350: ldc ''
    //   2352: putfield f : Ljava/lang/String;
    //   2355: aload_0
    //   2356: iconst_0
    //   2357: putfield f : I
    //   2360: aload_0
    //   2361: aconst_null
    //   2362: putfield a : Ljava/lang/Thread;
    //   2365: aload_0
    //   2366: aload_0
    //   2367: iconst_0
    //   2368: dup_x1
    //   2369: putfield d : Z
    //   2372: putfield e : Z
    //   2375: aload_0
    //   2376: getfield b : I
    //   2379: bipush #11
    //   2381: if_icmpne -> 2385
    //   2384: return
    //   2385: aload_0
    //   2386: getfield b : I
    //   2389: bipush #10
    //   2391: if_icmpne -> 2408
    //   2394: aload_0
    //   2395: iconst_0
    //   2396: putfield b : I
    //   2399: aload_0
    //   2400: aload_0
    //   2401: getfield g : I
    //   2404: putfield f : I
    //   2407: return
    //   2408: aload_0
    //   2409: getfield a : Laa;
    //   2412: invokevirtual b : ()V
    //   2415: aload_0
    //   2416: iconst_0
    //   2417: putfield b : I
    //   2420: aload_0
    //   2421: getfield a : Laa;
    //   2424: getfield a : Lv;
    //   2427: iconst_0
    //   2428: putfield aM : I
    //   2431: invokestatic r : ()V
    //   2434: aload_0
    //   2435: aload_0
    //   2436: getfield a : Ljava/util/Vector;
    //   2439: invokevirtual isEmpty : ()Z
    //   2442: ifne -> 2449
    //   2445: iconst_1
    //   2446: goto -> 2450
    //   2449: iconst_0
    //   2450: putfield a : Z
    //   2453: aload_0
    //   2454: getfield b : I
    //   2457: iconst_4
    //   2458: if_icmpeq -> 2469
    //   2461: aload_0
    //   2462: getfield b : I
    //   2465: iconst_5
    //   2466: if_icmpne -> 2503
    //   2469: getstatic w.c : I
    //   2472: ifeq -> 2503
    //   2475: getstatic w.A : Z
    //   2478: ifeq -> 2494
    //   2481: getstatic af.b : Laf;
    //   2484: getfield a : Lfavax/microedition/lcdui/Display;
    //   2487: getstatic w.d : I
    //   2490: invokevirtual vibrate : (I)Z
    //   2493: pop
    //   2494: getstatic w.e : I
    //   2497: ifeq -> 2503
    //   2500: invokestatic b : ()V
    //   2503: iload_1
    //   2504: ifeq -> 2524
    //   2507: aload_0
    //   2508: aload_0
    //   2509: getfield r : Ljava/lang/String;
    //   2512: putfield f : Ljava/lang/String;
    //   2515: aload_0
    //   2516: bipush #21
    //   2518: invokespecial b : (I)V
    //   2521: goto -> 2591
    //   2524: iload_2
    //   2525: ifeq -> 2553
    //   2528: aload_0
    //   2529: getfield a : Laa;
    //   2532: getfield a : Lv;
    //   2535: dup
    //   2536: getfield L : I
    //   2539: iconst_1
    //   2540: isub
    //   2541: putfield L : I
    //   2544: aload_0
    //   2545: iconst_0
    //   2546: iconst_1
    //   2547: invokevirtual a : (ZZ)V
    //   2550: goto -> 2591
    //   2553: aload_0
    //   2554: invokevirtual a : ()Z
    //   2557: ifne -> 2579
    //   2560: iconst_1
    //   2561: putstatic v.cL : Z
    //   2564: aload_0
    //   2565: getfield a : Laa;
    //   2568: getfield a : Lv;
    //   2571: ldc 61446
    //   2573: invokevirtual d : (I)V
    //   2576: goto -> 2591
    //   2579: aload_0
    //   2580: getfield a : Laa;
    //   2583: getfield a : Lv;
    //   2586: ldc 61441
    //   2588: invokevirtual d : (I)V
    //   2591: iconst_0
    //   2592: putstatic ad.c : Z
    //   2595: aload #5
    //   2597: athrow
    // Exception table:
    //   from	to	target	type
    //   50	1357	1644	java/lang/Throwable
    //   50	1357	2307	finally
    //   1644	2020	2307	finally
  }
  
  private void t() {
    if (this.a != null)
      this.a.remove(this.r); 
  }
  
  private int b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: astore_3
    //   3: astore_2
    //   4: aload_3
    //   5: bipush #47
    //   7: invokestatic a : (Ljava/lang/String;C)Z
    //   10: ifeq -> 17
    //   13: iconst_1
    //   14: goto -> 71
    //   17: aload_2
    //   18: getfield b : Ljava/util/Vector;
    //   21: invokevirtual size : ()I
    //   24: istore #5
    //   26: iload #5
    //   28: iinc #5, -1
    //   31: ifle -> 70
    //   34: aload_2
    //   35: getfield b : Ljava/util/Vector;
    //   38: iload #5
    //   40: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   43: dup
    //   44: astore #4
    //   46: ifnull -> 26
    //   49: aload_3
    //   50: invokestatic g : (Ljava/lang/String;)Ljava/lang/String;
    //   53: aload #4
    //   55: checkcast [Ljava/lang/String;
    //   58: iconst_0
    //   59: aaload
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: ifeq -> 26
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: ifeq -> 86
    //   74: aload_0
    //   75: aload_1
    //   76: invokespecial c : (Ljava/lang/String;)Z
    //   79: ifeq -> 84
    //   82: iconst_2
    //   83: ireturn
    //   84: iconst_4
    //   85: ireturn
    //   86: aload_0
    //   87: aload_1
    //   88: invokespecial d : (Ljava/lang/String;)I
    //   91: ireturn
  }
  
  private void a(String paramString1, String paramString2) {
    r r;
    (r = new r(paramString1, (paramString2.length() > 255) ? paramString2.substring(0, 254) : paramString2, 256, 256, 0, null)).addCommand((Command)this.a);
    r.addCommand((Command)this.b);
    r.setCommandListener(this);
    v.a((Displayable)r);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    ad ad1;
    String str;
    if (paramCommand == this.a) {
      String str1 = "";
      if (paramDisplayable instanceof TextBox) {
        if ((str1 = ai.a(((TextBox)paramDisplayable).getString(), this.f, this.f)) == null)
          return; 
        str1 = str1.replace(' ', '_');
      } 
      switch (this.f) {
        case true:
          this.f = false;
          this.f = str1;
          v.a((Displayable)af.b);
          if (!d(this.f)) {
            b(7);
            return;
          } 
          b(3);
          return;
        case true:
          v.a((Displayable)af.b);
          if (!v.h((String)this.a).equals(v.h(str1))) {
            this.f = str1;
            if (this.f == 8)
              b(8); 
          } 
          this.f = false;
          return;
        case true:
          str = str1;
          ad1 = this;
          if (str != null && str.length() > 0 && ad1.a != null && ad1.a.length > 0) {
            t = str;
            ad1.l();
            if (!v.cK)
              str = v.f(str); 
            for (byte b = 0; b < ad1.a.length; b++) {
              Timer timer;
              if (!v.cK) {
                String str2 = v.f((String)ad1.a[b]);
              } else {
                timer = ad1.a[b];
              } 
              if (ai.g((String)timer) && ai.a((String)timer, str, 0, 0))
                ad1.a((String)ad1.a[b], false); 
            } 
          } 
          af.b.b(61441);
          break;
      } 
      this.f = false;
      a(false, false);
      return;
    } 
    if (ad1 == this.b) {
      this.e = "";
      this.f = false;
      ((v)((af)af.b).a).aM = 0;
      v.a((Displayable)af.b);
      return;
    } 
    if (ad1 == af.a[11] && str == ((af)af.b).a) {
      ((af)af.b).a.f();
      o();
      return;
    } 
    if (ad1 == af.a[10] && str == ((af)af.b).a && this.n) {
      if (this.m != -1 && this.m < v.j.size()) {
        v.j.setElementAt(((r)str).a(), this.m);
      } else {
        v.j.addElement(((r)str).a());
      } 
      this.n = false;
      this.m = -1;
      o();
      v.i = true;
      v.d((DataOutputStream)null);
      return;
    } 
    if (str instanceof List) {
      int i = ((List)str).getSelectedIndex();
      if (ad1 == List.SELECT_COMMAND) {
        v.a((Displayable)af.b);
        this.f = v.N = v.j.elementAt(i);
        b(3);
        return;
      } 
      if (ad1 == af.a[33]) {
        this.n = true;
        this.m = -1;
        af.b.a("", this);
        return;
      } 
      if (ad1 == af.a[34]) {
        if (i != -1 && i < v.j.size()) {
          this.n = true;
          this.m = i;
          af.b.a(v.j.elementAt(i), this);
          return;
        } 
      } else if (ad1 == af.a[35]) {
        if (i >= 0 && i < v.j.size()) {
          v.j.removeElementAt(i);
          o();
          v.i = true;
          v.d((DataOutputStream)null);
          return;
        } 
      } else if (ad1 == af.a[32]) {
        v.a((Displayable)af.b);
      } 
    } 
  }
  
  public final void a() {
    this.f = true;
    a(v.d(320), "");
  }
  
  public final void b() {
    b(6);
    this.f = false;
  }
  
  public final void c() {
    v.J = (String)this.a;
    this.f = true;
    this.f = v.a((String)this.a, '/');
    a(v.d(323), v.h((String)this.a));
  }
  
  public final void d() {
    if (v.cM)
      return; 
    v.J = (String)this.a;
    b(4);
    this.f = false;
  }
  
  public final void e() {
    if (v.cM)
      return; 
    b(5);
    this.f = false;
  }
  
  public final void a(int paramInt) {
    this.g = String.valueOf(paramInt);
    b(9);
    this.f = false;
  }
  
  public final void f() {
    b(22);
    this.f = false;
  }
  
  public static String a(String paramString) {
    StringBuffer stringBuffer = new StringBuffer(3);
    for (byte b = 0; b < paramString.length(); b += 3)
      stringBuffer.append(((paramString.charAt(b) == 'r') ? 4 : 0) + ((paramString.charAt(b + 1) == 'w') ? 2 : 0) + ((paramString.charAt(b + 2) == 'x') ? 1 : 0)); 
    return stringBuffer.toString();
  }
  
  public final void g() {
    this.e = true;
  }
  
  public final void a(boolean paramBoolean) {
    if (!this.e) {
      this.e = true;
      this.a.b();
      m();
      k();
      if (this.b == 21)
        j(); 
      ((v)((af)af.b).a).aM = 0;
      if (paramBoolean)
        ((af)af.b).a.d(false); 
    } 
  }
  
  public final void h() {
    this.a = null;
    l();
    a(false);
    if (a()) {
      b(false);
      j();
    } 
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    this.a = null;
    if (this.k != 0 && this.a != null)
      this.a.clear(); 
    if (this.k != 0 && this.a == null)
      this.a = (Timer)new Hashtable(0); 
    c("", null);
    af.b.a(true, (v)((aa)this.a).a);
    if (paramString1.startsWith("ftp://"))
      paramString1 = paramString1.substring(6); 
    this.j = 0;
    try {
      try {
        b();
        this.a = (Timer)Connector.open("socket://" + paramString1 + ':' + paramString2);
        this.a = (Timer)this.a.openInputStream();
        this.a = (Timer)this.a.openOutputStream();
      } catch (SecurityException null) {
        this.j = 1;
        throw throwable;
      } catch (ConnectionNotFoundException connectionNotFoundException) {
        this.j = 2;
        throw connectionNotFoundException;
      } catch (IOException null) {
        this.j = 3;
        throw throwable;
      } catch (IllegalArgumentException null) {
        this.j = 4;
        throw throwable;
      } catch (Throwable throwable) {
        this.j = 5;
        throw throwable;
      } 
      this.e = this.d = v.b(throwable.length() + 20);
      if (this.e || this.d != null) {
        j();
        return;
      } 
      if (a() != 2) {
        this.j = 12;
        throw new IOException();
      } 
      this.d = c();
      b("USER ", paramString3);
      if (this.e || this.d != null) {
        j();
        return;
      } 
      int i;
      if ((i = a()) == 3) {
        b("PASS ", paramString4);
        if (this.e || this.d != null) {
          j();
          return;
        } 
        if (a() != 2)
          if (paramString5.length() > 0) {
            b("ACCT ", paramString5);
            if (a() != 2) {
              this.j = 12;
              throw new IOException();
            } 
          } else {
            this.j = 4;
            throw new IOException();
          }  
      } else if (i != 2 || !this.s.startsWith("230")) {
        this.j = 12;
        throw new IOException();
      } 
      if (this.e || this.d != null) {
        j();
        return;
      } 
      if (this.j != 0 && ((af)af.b).a != null) {
        this.a = (Timer)new l(33);
        this.e = false;
        ((af)af.b).a.scheduleAtFixedRate((TimerTask)this.a, 0L, 1000L);
      } 
      this.h = 1;
      return;
    } catch (Throwable throwable) {
      throw new Throwable(throwable.toString());
    } finally {
      m();
      this.a.b();
    } 
  }
  
  private void b(String paramString1, String paramString2) {
    if (this.a == null || this.a == null || this.a == null) {
      this.j = 7;
      this.h = 5;
      throw new IOException("Error sending data");
    } 
    b();
    this.a.setLength(0);
    this.a.append(paramString1).append((this.m != 0) ? ai.a(paramString2) : paramString2).append("\r\n");
    this.a.write(this.a.toString().getBytes());
    this.a.flush();
    this.e = false;
    this.e = this.d = v.b(this.a.length() + 2);
  }
  
  private SocketConnection a() {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'PASV'
    //   3: ldc ''
    //   5: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   8: aload_0
    //   9: invokespecial a : ()I
    //   12: iconst_2
    //   13: if_icmpne -> 167
    //   16: aload_0
    //   17: getfield h : Ljava/lang/String;
    //   20: aload_0
    //   21: getfield h : Ljava/lang/String;
    //   24: bipush #40
    //   26: invokevirtual indexOf : (I)I
    //   29: iconst_1
    //   30: iadd
    //   31: aload_0
    //   32: getfield h : Ljava/lang/String;
    //   35: bipush #41
    //   37: invokevirtual indexOf : (I)I
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: bipush #6
    //   45: bipush #44
    //   47: invokestatic a : (Ljava/lang/String;IC)[Ljava/lang/String;
    //   50: astore_0
    //   51: new java/lang/StringBuffer
    //   54: dup
    //   55: bipush #26
    //   57: invokespecial <init> : (I)V
    //   60: dup
    //   61: astore_1
    //   62: aload_0
    //   63: iconst_0
    //   64: aaload
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   68: bipush #46
    //   70: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   73: aload_0
    //   74: iconst_1
    //   75: aaload
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   79: bipush #46
    //   81: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   84: aload_0
    //   85: iconst_2
    //   86: aaload
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   90: bipush #46
    //   92: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   95: aload_0
    //   96: iconst_3
    //   97: aaload
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   101: bipush #58
    //   103: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   106: aload_0
    //   107: iconst_4
    //   108: aaload
    //   109: invokestatic parseInt : (Ljava/lang/String;)I
    //   112: bipush #8
    //   114: ishl
    //   115: aload_0
    //   116: iconst_5
    //   117: aaload
    //   118: invokestatic parseInt : (Ljava/lang/String;)I
    //   121: iadd
    //   122: invokestatic valueOf : (I)Ljava/lang/String;
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   128: pop
    //   129: ldc 'socket://'
    //   131: aload_1
    //   132: invokevirtual toString : ()Ljava/lang/String;
    //   135: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   138: invokestatic open : (Ljava/lang/String;)Ljavax/microedition/io/Connection;
    //   141: checkcast javax/microedition/io/SocketConnection
    //   144: areturn
    //   145: astore_0
    //   146: new java/io/IOException
    //   149: dup
    //   150: sipush #584
    //   153: invokestatic d : (I)Ljava/lang/String;
    //   156: aload_0
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   163: invokespecial <init> : (Ljava/lang/String;)V
    //   166: athrow
    //   167: aconst_null
    //   168: areturn
    // Exception table:
    //   from	to	target	type
    //   16	144	145	java/lang/Exception
  }
  
  private ServerSocketConnection a() {
    try {
      String str;
      if ((str = v.h(this.a.getLocalAddress())).startsWith("/"))
        str = str.substring(1); 
      String[] arrayOfString = v.a(str, 6, '.');
      ServerSocketConnection serverSocketConnection;
      int i = (serverSocketConnection = (ServerSocketConnection)Connector.open("socket://")).getLocalPort();
      arrayOfString[4] = String.valueOf(i >> 8 & 0xFF);
      arrayOfString[5] = String.valueOf(i & 0xFF);
      StringBuffer stringBuffer;
      (stringBuffer = new StringBuffer(26)).append(arrayOfString[0]).append(',').append(arrayOfString[1]).append(',').append(arrayOfString[2]).append(',').append(arrayOfString[3]).append(',').append(arrayOfString[4]).append(',').append(arrayOfString[5]);
      b("PORT ", stringBuffer.toString());
    } catch (Exception exception) {
      throw new IOException(v.a(v.d(585), exception.toString()));
    } 
    return (ServerSocketConnection)exception;
  }
  
  private void a(SocketConnection paramSocketConnection, ServerSocketConnection paramServerSocketConnection, boolean paramBoolean) {
    try {
      if (this.l == 0) {
        c(this.c, null);
        paramSocketConnection = (SocketConnection)paramServerSocketConnection.acceptAndOpen();
        paramServerSocketConnection.close();
      } 
      if (paramBoolean) {
        this.b = (l)(this.b = (l)paramSocketConnection).openInputStream();
      } else {
        this.b = (l)(this.b = (l)paramSocketConnection).openOutputStream();
      } 
      this.e = this.d = v.b(50);
      return;
    } catch (Exception exception) {
      this.j = 10;
      throw new IOException(exception.toString());
    } 
  }
  
  private void u() {
    c("", (String)(aa.a = (Thread)v.d(524)));
    this.e = this.d = Character.MIN_VALUE;
    w();
    if (this.a == null || !this.a.containsKey(this.r)) {
      b("TYPE A", "");
      if (a() != 2) {
        this.j = 12;
        throw new IOException();
      } 
      if (this.e || this.d != null) {
        x();
        v();
        return;
      } 
      SocketConnection socketConnection = null;
      ServerSocketConnection serverSocketConnection = null;
      if (this.l != 0) {
        c("", null);
        socketConnection = a();
      } else {
        serverSocketConnection = a();
      } 
      if (this.l != 0 || a() == 2) {
        if (this.e || this.d != null) {
          x();
          v();
          return;
        } 
        b();
        b("LIST", v.cI ? " -la" : "");
        if (a() == 1) {
          if (this.e || this.d != null) {
            x();
            v();
            return;
          } 
          a(socketConnection, serverSocketConnection, true);
          c("", (String)(aa.a = (Thread)v.d(524)));
          try {
            int i = a((InputStream)this.b, true);
            this.e = this.d = v.b(i);
          } catch (Throwable throwable) {
          
          } finally {
            v();
            if (a() > 3)
              throw new IOException(this.s); 
          } 
        } 
        m();
        return;
      } 
      this.j = 12;
      throw new IOException();
    } 
    a(new ByteArrayInputStream((byte[])this.a.get(this.r)), false);
  }
  
  private int a(InputStream paramInputStream, boolean paramBoolean) {
    byte b;
    ByteArrayOutputStream byteArrayOutputStream = null;
    if (this.k != 0 && this.a != null)
      byteArrayOutputStream = new ByteArrayOutputStream(); 
    this.b.removeAllElements();
    byte[] arrayOfByte = new byte[this.i];
    int i = 0;
    StringBuffer stringBuffer = new StringBuffer(0);
    do {
      try {
        if (this.e || this.d != null) {
          if (paramBoolean)
            x(); 
          break;
        } 
        b = paramInputStream.read(arrayOfByte);
        if (byteArrayOutputStream != null && b > 0)
          byteArrayOutputStream.write(arrayOfByte, 0, b); 
      } catch (Exception exception) {
        b = -1;
      } 
      i += b;
      for (byte b1 = 0; b1 < b; b1++) {
        ad ad1;
        boolean bool;
        if (bool = (this.m != 0) ? ai.a(arrayOfByte[b1]) : arrayOfByte[b1])
          bool += true; 
        if (!bool) {
          b = -1;
          break;
        } 
        if (this.e || this.d != null) {
          if (paramBoolean)
            x(); 
          b = -1;
          break;
        } 
        if ((bool == 10 || bool == 13) && stringBuffer.length() > 0) {
          try {
            if (!stringBuffer.toString().startsWith("total")) {
              String str2 = this.d;
              String str1 = stringBuffer.toString();
              ad1 = this;
              if (str1.length() > 0) {
                char c;
                if (str2.toLowerCase().indexOf("windows") == -1 && ((c = str1.charAt(0)) == 'd' || c == '-' || c == 'l' || c == 'b' || c == 'c')) {
                  ad1.c(str1);
                } else {
                  ad1.d = "windows";
                  ad1.b(str1);
                } 
              } 
            } 
          } catch (Exception exception) {}
          stringBuffer.setLength(0);
        } else if (ad1 != 10 && ad1 != 13) {
          stringBuffer.append((char)ad1);
        } 
      } 
    } while (b != -1);
    if (this.d == null && this.a != null && byteArrayOutputStream != null && paramBoolean)
      this.a.put(this.r, byteArrayOutputStream.toByteArray()); 
    return i;
  }
  
  private boolean a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Z
    //   4: ifeq -> 16
    //   7: aload_0
    //   8: getfield d : Z
    //   11: ifne -> 16
    //   14: iconst_1
    //   15: ireturn
    //   16: aload_0
    //   17: getfield d : Z
    //   20: ifeq -> 25
    //   23: iconst_0
    //   24: ireturn
    //   25: aload_1
    //   26: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   29: astore_2
    //   30: getstatic v.a : [Lag;
    //   33: getstatic af.b : Laf;
    //   36: getfield a : Lv;
    //   39: getfield c : B
    //   42: aaload
    //   43: aload_1
    //   44: invokeinterface a : (Ljava/lang/String;)V
    //   49: aload_1
    //   50: invokestatic e : (Ljava/lang/String;)Z
    //   53: ifne -> 181
    //   56: getstatic v.a : [Lag;
    //   59: getstatic af.b : Laf;
    //   62: getfield a : Lv;
    //   65: getfield c : B
    //   68: aaload
    //   69: invokeinterface b : ()Z
    //   74: ifne -> 96
    //   77: getstatic v.a : [Lag;
    //   80: getstatic af.b : Laf;
    //   83: getfield a : Lv;
    //   86: getfield c : B
    //   89: aaload
    //   90: invokeinterface f : ()Z
    //   95: pop
    //   96: aload_0
    //   97: invokespecial w : ()V
    //   100: aload_0
    //   101: aload_2
    //   102: invokespecial c : (Ljava/lang/String;)I
    //   105: iconst_3
    //   106: if_icmple -> 114
    //   109: iconst_0
    //   110: istore_2
    //   111: goto -> 168
    //   114: aload_0
    //   115: invokespecial u : ()V
    //   118: aload_0
    //   119: iconst_m1
    //   120: iconst_0
    //   121: invokespecial a : (IZ)[Ljava/lang/String;
    //   124: astore_3
    //   125: iconst_1
    //   126: istore_2
    //   127: iconst_0
    //   128: istore #4
    //   130: iload #4
    //   132: aload_3
    //   133: arraylength
    //   134: if_icmpge -> 168
    //   137: iload_2
    //   138: ifeq -> 160
    //   141: aload_0
    //   142: aload_1
    //   143: aload_3
    //   144: iload #4
    //   146: aaload
    //   147: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   150: invokespecial a : (Ljava/lang/String;)Z
    //   153: ifeq -> 160
    //   156: iconst_1
    //   157: goto -> 161
    //   160: iconst_0
    //   161: istore_2
    //   162: iinc #4, 1
    //   165: goto -> 130
    //   168: aload_0
    //   169: invokespecial w : ()V
    //   172: aload_0
    //   173: ldc '..'
    //   175: invokespecial c : (Ljava/lang/String;)I
    //   178: pop
    //   179: iload_2
    //   180: ireturn
    //   181: ldc2_w 40
    //   184: invokestatic sleep : (J)V
    //   187: aload_0
    //   188: getfield e : Z
    //   191: ifeq -> 203
    //   194: aload_0
    //   195: getfield d : Z
    //   198: ifne -> 203
    //   201: iconst_1
    //   202: ireturn
    //   203: aload_0
    //   204: getfield d : Z
    //   207: ifeq -> 212
    //   210: iconst_0
    //   211: ireturn
    //   212: iconst_0
    //   213: istore_3
    //   214: getstatic v.a : [Lag;
    //   217: getstatic af.b : Laf;
    //   220: getfield a : Lv;
    //   223: getfield c : B
    //   226: aaload
    //   227: invokeinterface b : ()Z
    //   232: ifeq -> 310
    //   235: getstatic af.b : Laf;
    //   238: sipush #277
    //   241: invokestatic d : (I)Ljava/lang/String;
    //   244: ldc '\\n'
    //   246: aload_1
    //   247: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   250: iconst_1
    //   251: invokevirtual a : (Ljava/lang/String;Z)I
    //   254: dup
    //   255: istore #4
    //   257: iconst_1
    //   258: if_icmpne -> 284
    //   261: getstatic v.a : [Lag;
    //   264: getstatic af.b : Laf;
    //   267: getfield a : Lv;
    //   270: getfield c : B
    //   273: aaload
    //   274: iconst_0
    //   275: invokeinterface a : (Z)Z
    //   280: pop
    //   281: goto -> 310
    //   284: iload #4
    //   286: iconst_2
    //   287: if_icmpne -> 295
    //   290: iconst_1
    //   291: istore_3
    //   292: goto -> 310
    //   295: iload #4
    //   297: iconst_3
    //   298: if_icmpne -> 308
    //   301: aload_0
    //   302: iconst_1
    //   303: putfield e : Z
    //   306: iconst_1
    //   307: ireturn
    //   308: iconst_1
    //   309: ireturn
    //   310: aload_0
    //   311: aload_2
    //   312: iload_3
    //   313: invokespecial a : (Ljava/lang/String;Z)Z
    //   316: ireturn
  }
  
  private boolean a(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: sipush #188
    //   3: invokestatic d : (I)Ljava/lang/String;
    //   6: putstatic aa.a : Ljava/lang/String;
    //   9: ldc2_w -1
    //   12: lstore #5
    //   14: aconst_null
    //   15: astore #4
    //   17: aload_0
    //   18: aload_1
    //   19: aconst_null
    //   20: invokespecial c : (Ljava/lang/String;Ljava/lang/String;)V
    //   23: aload_0
    //   24: ldc 'TYPE I'
    //   26: ldc ''
    //   28: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   31: aload_0
    //   32: invokespecial a : ()I
    //   35: iconst_2
    //   36: if_icmpeq -> 116
    //   39: aload_0
    //   40: invokespecial v : ()V
    //   43: aconst_null
    //   44: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   47: pop
    //   48: aload_0
    //   49: getfield d : Z
    //   52: ifeq -> 62
    //   55: aload_0
    //   56: invokespecial x : ()V
    //   59: goto -> 114
    //   62: lload #5
    //   64: ldc2_w -1
    //   67: lcmp
    //   68: ifne -> 82
    //   71: aload_0
    //   72: invokespecial x : ()V
    //   75: goto -> 114
    //   78: pop
    //   79: goto -> 114
    //   82: aload_0
    //   83: invokespecial b : ()Z
    //   86: pop
    //   87: aload_0
    //   88: invokespecial a : ()I
    //   91: iconst_3
    //   92: if_icmple -> 114
    //   95: aload_0
    //   96: getfield e : Z
    //   99: ifne -> 114
    //   102: new java/io/IOException
    //   105: dup
    //   106: aload_0
    //   107: getfield s : Ljava/lang/String;
    //   110: invokespecial <init> : (Ljava/lang/String;)V
    //   113: athrow
    //   114: iconst_0
    //   115: ireturn
    //   116: aconst_null
    //   117: astore #7
    //   119: aconst_null
    //   120: astore #8
    //   122: aload_0
    //   123: getfield l : Z
    //   126: ifeq -> 138
    //   129: aload_0
    //   130: invokespecial a : ()Ljavax/microedition/io/SocketConnection;
    //   133: astore #7
    //   135: goto -> 144
    //   138: aload_0
    //   139: invokespecial a : ()Ljavax/microedition/io/ServerSocketConnection;
    //   142: astore #8
    //   144: aload_0
    //   145: getfield l : Z
    //   148: ifne -> 159
    //   151: aload_0
    //   152: invokespecial a : ()I
    //   155: iconst_2
    //   156: if_icmpne -> 752
    //   159: lconst_0
    //   160: lstore #9
    //   162: iload_2
    //   163: ifne -> 188
    //   166: getstatic v.a : [Lag;
    //   169: getstatic af.b : Laf;
    //   172: getfield a : Lv;
    //   175: getfield c : B
    //   178: aaload
    //   179: invokeinterface a : ()Z
    //   184: pop
    //   185: goto -> 208
    //   188: getstatic v.a : [Lag;
    //   191: getstatic af.b : Laf;
    //   194: getfield a : Lv;
    //   197: getfield c : B
    //   200: aaload
    //   201: invokeinterface b : ()J
    //   206: lstore #9
    //   208: aload_0
    //   209: aload_1
    //   210: invokevirtual a : (Ljava/lang/String;)I
    //   213: istore_3
    //   214: invokestatic currentTimeMillis : ()J
    //   217: lstore #11
    //   219: aload_0
    //   220: getfield a : Laa;
    //   223: lload #11
    //   225: putfield a : J
    //   228: lload #9
    //   230: lstore #13
    //   232: aload_0
    //   233: getfield a : Laa;
    //   236: iconst_1
    //   237: lconst_0
    //   238: iload_3
    //   239: i2l
    //   240: lload #13
    //   242: iconst_1
    //   243: aconst_null
    //   244: invokevirtual a : (ZJJJZLjava/lang/String;)V
    //   247: aload_0
    //   248: invokespecial b : ()Z
    //   251: pop
    //   252: iload_2
    //   253: ifeq -> 361
    //   256: aload_0
    //   257: ldc 'REST '
    //   259: lload #9
    //   261: invokestatic valueOf : (J)Ljava/lang/String;
    //   264: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   267: aload_0
    //   268: invokespecial a : ()I
    //   271: iconst_3
    //   272: if_icmpeq -> 361
    //   275: aload_0
    //   276: iconst_1
    //   277: putfield d : Z
    //   280: aload_0
    //   281: invokespecial x : ()V
    //   284: aload_0
    //   285: invokespecial v : ()V
    //   288: aconst_null
    //   289: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   292: pop
    //   293: aload_0
    //   294: getfield d : Z
    //   297: ifeq -> 307
    //   300: aload_0
    //   301: invokespecial x : ()V
    //   304: goto -> 359
    //   307: lload #5
    //   309: ldc2_w -1
    //   312: lcmp
    //   313: ifne -> 327
    //   316: aload_0
    //   317: invokespecial x : ()V
    //   320: goto -> 359
    //   323: pop
    //   324: goto -> 359
    //   327: aload_0
    //   328: invokespecial b : ()Z
    //   331: pop
    //   332: aload_0
    //   333: invokespecial a : ()I
    //   336: iconst_3
    //   337: if_icmple -> 359
    //   340: aload_0
    //   341: getfield e : Z
    //   344: ifne -> 359
    //   347: new java/io/IOException
    //   350: dup
    //   351: aload_0
    //   352: getfield s : Ljava/lang/String;
    //   355: invokespecial <init> : (Ljava/lang/String;)V
    //   358: athrow
    //   359: iconst_0
    //   360: ireturn
    //   361: aload_0
    //   362: ldc 'RETR '
    //   364: aload_1
    //   365: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   368: aload_0
    //   369: invokespecial a : ()I
    //   372: iconst_1
    //   373: if_icmpne -> 734
    //   376: aload_0
    //   377: aload #7
    //   379: aload #8
    //   381: iconst_1
    //   382: invokespecial a : (Ljavax/microedition/io/SocketConnection;Ljavax/microedition/io/ServerSocketConnection;Z)V
    //   385: aload_0
    //   386: iconst_2
    //   387: putfield c : I
    //   390: getstatic v.bd : I
    //   393: iconst_4
    //   394: if_icmpne -> 562
    //   397: iload_3
    //   398: newarray byte
    //   400: astore_1
    //   401: aload_0
    //   402: invokespecial b : ()Z
    //   405: ifeq -> 535
    //   408: aload_0
    //   409: getfield b : Ljava/io/InputStream;
    //   412: aload_1
    //   413: lload #13
    //   415: l2i
    //   416: iload_3
    //   417: i2l
    //   418: lload #13
    //   420: lsub
    //   421: l2i
    //   422: invokevirtual read : ([BII)I
    //   425: dup
    //   426: istore_2
    //   427: iconst_m1
    //   428: if_icmpeq -> 535
    //   431: lload #13
    //   433: iload_3
    //   434: i2l
    //   435: lcmp
    //   436: ifge -> 535
    //   439: lload #13
    //   441: iload_2
    //   442: i2l
    //   443: ladd
    //   444: lstore #13
    //   446: lload #5
    //   448: iload_2
    //   449: i2l
    //   450: ladd
    //   451: lstore #5
    //   453: iload_2
    //   454: invokestatic a : (I)Z
    //   457: ifeq -> 470
    //   460: aload_0
    //   461: aload_0
    //   462: iconst_1
    //   463: dup_x1
    //   464: putfield e : Z
    //   467: putfield d : Z
    //   470: ldc2_w 40
    //   473: invokestatic sleep : (J)V
    //   476: aload_0
    //   477: getfield d : Z
    //   480: ifne -> 490
    //   483: aload_0
    //   484: getfield e : Z
    //   487: ifeq -> 497
    //   490: aload_0
    //   491: invokespecial x : ()V
    //   494: goto -> 535
    //   497: aload_0
    //   498: getfield a : Laa;
    //   501: iconst_0
    //   502: lload #11
    //   504: iload_3
    //   505: i2l
    //   506: lload #13
    //   508: iconst_0
    //   509: aload_0
    //   510: getfield a : Laa;
    //   513: aload_0
    //   514: getfield k : I
    //   517: ldc '/'
    //   519: aload_0
    //   520: getfield l : I
    //   523: aconst_null
    //   524: iconst_m1
    //   525: aconst_null
    //   526: invokevirtual a : (ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   529: invokevirtual a : (ZJJJZLjava/lang/String;)V
    //   532: goto -> 401
    //   535: getstatic v.a : [Lag;
    //   538: getstatic af.b : Laf;
    //   541: getfield a : Lv;
    //   544: getfield c : B
    //   547: aaload
    //   548: aload_1
    //   549: iconst_0
    //   550: lload #13
    //   552: l2i
    //   553: invokeinterface a : ([BII)Z
    //   558: pop
    //   559: goto -> 727
    //   562: getstatic v.a : [Lag;
    //   565: getstatic af.b : Laf;
    //   568: getfield a : Lv;
    //   571: getfield c : B
    //   574: aaload
    //   575: lload #9
    //   577: invokeinterface a : (J)Ljava/io/OutputStream;
    //   582: astore #4
    //   584: aload_0
    //   585: getfield i : I
    //   588: newarray byte
    //   590: astore_1
    //   591: aload_0
    //   592: invokespecial b : ()Z
    //   595: ifeq -> 727
    //   598: aload_0
    //   599: getfield b : Ljava/io/InputStream;
    //   602: aload_1
    //   603: invokevirtual read : ([B)I
    //   606: dup
    //   607: istore_2
    //   608: iconst_m1
    //   609: if_icmpeq -> 727
    //   612: lload #13
    //   614: iload_2
    //   615: i2l
    //   616: ladd
    //   617: lstore #13
    //   619: lload #5
    //   621: iload_2
    //   622: i2l
    //   623: ladd
    //   624: lstore #5
    //   626: iload_2
    //   627: invokestatic a : (I)Z
    //   630: ifeq -> 643
    //   633: aload_0
    //   634: aload_0
    //   635: iconst_1
    //   636: dup_x1
    //   637: putfield e : Z
    //   640: putfield d : Z
    //   643: ldc2_w 40
    //   646: invokestatic sleep : (J)V
    //   649: aload_0
    //   650: getfield d : Z
    //   653: ifne -> 663
    //   656: aload_0
    //   657: getfield e : Z
    //   660: ifeq -> 670
    //   663: aload_0
    //   664: invokespecial x : ()V
    //   667: goto -> 727
    //   670: aload #4
    //   672: aload_1
    //   673: iconst_0
    //   674: iload_2
    //   675: invokevirtual write : ([BII)V
    //   678: getstatic v.dg : Z
    //   681: ifeq -> 689
    //   684: aload #4
    //   686: invokevirtual flush : ()V
    //   689: aload_0
    //   690: getfield a : Laa;
    //   693: iconst_0
    //   694: lload #11
    //   696: iload_3
    //   697: i2l
    //   698: lload #13
    //   700: iconst_0
    //   701: aload_0
    //   702: getfield a : Laa;
    //   705: aload_0
    //   706: getfield k : I
    //   709: ldc '/'
    //   711: aload_0
    //   712: getfield l : I
    //   715: aconst_null
    //   716: iconst_m1
    //   717: aconst_null
    //   718: invokevirtual a : (ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   721: invokevirtual a : (ZJJJZLjava/lang/String;)V
    //   724: goto -> 591
    //   727: aload_0
    //   728: invokevirtual m : ()V
    //   731: goto -> 752
    //   734: aload_0
    //   735: bipush #12
    //   737: putfield j : I
    //   740: new java/io/IOException
    //   743: dup
    //   744: aload_0
    //   745: getfield s : Ljava/lang/String;
    //   748: invokespecial <init> : (Ljava/lang/String;)V
    //   751: athrow
    //   752: aload_0
    //   753: invokespecial v : ()V
    //   756: aload #4
    //   758: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   761: pop
    //   762: aload_0
    //   763: getfield d : Z
    //   766: ifeq -> 776
    //   769: aload_0
    //   770: invokespecial x : ()V
    //   773: goto -> 989
    //   776: lload #5
    //   778: ldc2_w -1
    //   781: lcmp
    //   782: ifne -> 796
    //   785: aload_0
    //   786: invokespecial x : ()V
    //   789: goto -> 989
    //   792: pop
    //   793: goto -> 989
    //   796: aload_0
    //   797: invokespecial b : ()Z
    //   800: pop
    //   801: aload_0
    //   802: invokespecial a : ()I
    //   805: iconst_3
    //   806: if_icmple -> 989
    //   809: aload_0
    //   810: getfield e : Z
    //   813: ifne -> 989
    //   816: new java/io/IOException
    //   819: dup
    //   820: aload_0
    //   821: getfield s : Ljava/lang/String;
    //   824: invokespecial <init> : (Ljava/lang/String;)V
    //   827: athrow
    //   828: pop
    //   829: aload_0
    //   830: iconst_1
    //   831: putfield d : Z
    //   834: aload_0
    //   835: invokespecial v : ()V
    //   838: aload #4
    //   840: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   843: pop
    //   844: aload_0
    //   845: getfield d : Z
    //   848: ifeq -> 858
    //   851: aload_0
    //   852: invokespecial x : ()V
    //   855: goto -> 989
    //   858: lload #5
    //   860: ldc2_w -1
    //   863: lcmp
    //   864: ifne -> 878
    //   867: aload_0
    //   868: invokespecial x : ()V
    //   871: goto -> 989
    //   874: pop
    //   875: goto -> 989
    //   878: aload_0
    //   879: invokespecial b : ()Z
    //   882: pop
    //   883: aload_0
    //   884: invokespecial a : ()I
    //   887: iconst_3
    //   888: if_icmple -> 989
    //   891: aload_0
    //   892: getfield e : Z
    //   895: ifne -> 989
    //   898: new java/io/IOException
    //   901: dup
    //   902: aload_0
    //   903: getfield s : Ljava/lang/String;
    //   906: invokespecial <init> : (Ljava/lang/String;)V
    //   909: athrow
    //   910: astore_1
    //   911: aload_0
    //   912: invokespecial v : ()V
    //   915: aload #4
    //   917: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   920: pop
    //   921: aload_0
    //   922: getfield d : Z
    //   925: ifeq -> 935
    //   928: aload_0
    //   929: invokespecial x : ()V
    //   932: goto -> 987
    //   935: lload #5
    //   937: ldc2_w -1
    //   940: lcmp
    //   941: ifne -> 955
    //   944: aload_0
    //   945: invokespecial x : ()V
    //   948: goto -> 987
    //   951: pop
    //   952: goto -> 987
    //   955: aload_0
    //   956: invokespecial b : ()Z
    //   959: pop
    //   960: aload_0
    //   961: invokespecial a : ()I
    //   964: iconst_3
    //   965: if_icmple -> 987
    //   968: aload_0
    //   969: getfield e : Z
    //   972: ifne -> 987
    //   975: new java/io/IOException
    //   978: dup
    //   979: aload_0
    //   980: getfield s : Ljava/lang/String;
    //   983: invokespecial <init> : (Ljava/lang/String;)V
    //   986: athrow
    //   987: aload_1
    //   988: athrow
    //   989: aload_0
    //   990: getfield d : Z
    //   993: ifne -> 998
    //   996: iconst_1
    //   997: ireturn
    //   998: iconst_0
    //   999: ireturn
    // Exception table:
    //   from	to	target	type
    //   17	39	828	java/lang/Throwable
    //   17	39	910	finally
    //   71	75	78	java/lang/Exception
    //   116	284	828	java/lang/Throwable
    //   116	284	910	finally
    //   316	320	323	java/lang/Exception
    //   361	752	828	java/lang/Throwable
    //   361	752	910	finally
    //   785	789	792	java/lang/Exception
    //   828	834	910	finally
    //   867	871	874	java/lang/Exception
    //   944	948	951	java/lang/Exception
  }
  
  private boolean b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Z
    //   4: ifeq -> 16
    //   7: aload_0
    //   8: getfield d : Z
    //   11: ifne -> 16
    //   14: iconst_1
    //   15: ireturn
    //   16: aload_0
    //   17: getfield d : Z
    //   20: ifeq -> 25
    //   23: iconst_0
    //   24: ireturn
    //   25: getstatic v.a : [Lag;
    //   28: getstatic af.b : Laf;
    //   31: getfield a : Lv;
    //   34: getfield c : B
    //   37: aaload
    //   38: aload_1
    //   39: invokeinterface a : (Ljava/lang/String;)V
    //   44: getstatic v.a : [Lag;
    //   47: getstatic af.b : Laf;
    //   50: getfield a : Lv;
    //   53: getfield c : B
    //   56: aaload
    //   57: invokeinterface b : ()Z
    //   62: ifne -> 83
    //   65: new java/lang/Exception
    //   68: dup
    //   69: ldc 'file '
    //   71: ldc 'file:///'
    //   73: aload_1
    //   74: ldc ' not found'
    //   76: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   79: invokespecial <init> : (Ljava/lang/String;)V
    //   82: athrow
    //   83: aload_1
    //   84: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   87: bipush #32
    //   89: bipush #95
    //   91: invokevirtual replace : (CC)Ljava/lang/String;
    //   94: dup
    //   95: astore_2
    //   96: invokestatic e : (Ljava/lang/String;)Z
    //   99: ifne -> 221
    //   102: aload_0
    //   103: aload_2
    //   104: invokespecial d : (Ljava/lang/String;)Z
    //   107: ifne -> 120
    //   110: aload_0
    //   111: aload_2
    //   112: invokespecial e : (Ljava/lang/String;)I
    //   115: pop
    //   116: aload_0
    //   117: invokespecial t : ()V
    //   120: getstatic v.a : [Lag;
    //   123: getstatic af.b : Laf;
    //   126: getfield a : Lv;
    //   129: getfield c : B
    //   132: aaload
    //   133: invokeinterface a : ()[Ljava/lang/String;
    //   138: astore_3
    //   139: aload_0
    //   140: invokespecial w : ()V
    //   143: aload_0
    //   144: aload_2
    //   145: invokespecial c : (Ljava/lang/String;)I
    //   148: iconst_3
    //   149: if_icmple -> 157
    //   152: iconst_0
    //   153: istore_2
    //   154: goto -> 204
    //   157: aload_0
    //   158: invokespecial u : ()V
    //   161: iconst_1
    //   162: istore_2
    //   163: iconst_0
    //   164: istore #4
    //   166: iload #4
    //   168: aload_3
    //   169: arraylength
    //   170: if_icmpge -> 204
    //   173: iload_2
    //   174: ifeq -> 196
    //   177: aload_0
    //   178: aload_1
    //   179: aload_3
    //   180: iload #4
    //   182: aaload
    //   183: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   186: invokespecial b : (Ljava/lang/String;)Z
    //   189: ifeq -> 196
    //   192: iconst_1
    //   193: goto -> 197
    //   196: iconst_0
    //   197: istore_2
    //   198: iinc #4, 1
    //   201: goto -> 166
    //   204: aload_0
    //   205: invokespecial w : ()V
    //   208: aload_0
    //   209: ldc '..'
    //   211: invokespecial c : (Ljava/lang/String;)I
    //   214: pop
    //   215: aload_0
    //   216: invokespecial u : ()V
    //   219: iload_2
    //   220: ireturn
    //   221: ldc2_w 40
    //   224: invokestatic sleep : (J)V
    //   227: aload_0
    //   228: getfield e : Z
    //   231: ifeq -> 243
    //   234: aload_0
    //   235: getfield d : Z
    //   238: ifne -> 243
    //   241: iconst_1
    //   242: ireturn
    //   243: aload_0
    //   244: getfield d : Z
    //   247: ifeq -> 252
    //   250: iconst_0
    //   251: ireturn
    //   252: iconst_0
    //   253: istore_3
    //   254: aload_0
    //   255: aload_2
    //   256: invokespecial d : (Ljava/lang/String;)Z
    //   259: ifeq -> 323
    //   262: getstatic af.b : Laf;
    //   265: sipush #277
    //   268: invokestatic d : (I)Ljava/lang/String;
    //   271: ldc '\\n'
    //   273: aload_2
    //   274: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   277: iconst_1
    //   278: invokevirtual a : (Ljava/lang/String;Z)I
    //   281: dup
    //   282: istore #4
    //   284: iconst_1
    //   285: if_icmpne -> 297
    //   288: aload_0
    //   289: aload_2
    //   290: invokespecial b : (Ljava/lang/String;)I
    //   293: pop
    //   294: goto -> 323
    //   297: iload #4
    //   299: iconst_2
    //   300: if_icmpne -> 308
    //   303: iconst_1
    //   304: istore_3
    //   305: goto -> 323
    //   308: iload #4
    //   310: iconst_3
    //   311: if_icmpne -> 321
    //   314: aload_0
    //   315: iconst_1
    //   316: putfield e : Z
    //   319: iconst_1
    //   320: ireturn
    //   321: iconst_1
    //   322: ireturn
    //   323: aload_0
    //   324: aload_1
    //   325: iload_3
    //   326: invokespecial b : (Ljava/lang/String;Z)Z
    //   329: ireturn
  }
  
  private boolean b(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: sipush #523
    //   3: invokestatic d : (I)Ljava/lang/String;
    //   6: putstatic aa.a : Ljava/lang/String;
    //   9: aconst_null
    //   10: astore_3
    //   11: aload_0
    //   12: aload_1
    //   13: aconst_null
    //   14: invokespecial c : (Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: ldc 'TYPE I'
    //   20: ldc ''
    //   22: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_0
    //   26: invokespecial a : ()I
    //   29: iconst_2
    //   30: if_icmpeq -> 94
    //   33: aload_0
    //   34: invokespecial t : ()V
    //   37: aconst_null
    //   38: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   41: pop
    //   42: aload_0
    //   43: invokespecial v : ()V
    //   46: aload_0
    //   47: getfield d : Z
    //   50: ifeq -> 60
    //   53: aload_0
    //   54: invokespecial x : ()V
    //   57: goto -> 92
    //   60: aload_0
    //   61: invokespecial b : ()Z
    //   64: pop
    //   65: aload_0
    //   66: invokespecial a : ()I
    //   69: iconst_3
    //   70: if_icmple -> 92
    //   73: aload_0
    //   74: getfield e : Z
    //   77: ifne -> 92
    //   80: new java/io/IOException
    //   83: dup
    //   84: aload_0
    //   85: getfield s : Ljava/lang/String;
    //   88: invokespecial <init> : (Ljava/lang/String;)V
    //   91: athrow
    //   92: iconst_0
    //   93: ireturn
    //   94: aconst_null
    //   95: astore #4
    //   97: aconst_null
    //   98: astore #5
    //   100: aload_0
    //   101: getfield l : Z
    //   104: ifeq -> 116
    //   107: aload_0
    //   108: invokespecial a : ()Ljavax/microedition/io/SocketConnection;
    //   111: astore #4
    //   113: goto -> 122
    //   116: aload_0
    //   117: invokespecial a : ()Ljavax/microedition/io/ServerSocketConnection;
    //   120: astore #5
    //   122: aload_0
    //   123: getfield l : Z
    //   126: ifne -> 137
    //   129: aload_0
    //   130: invokespecial a : ()I
    //   133: iconst_2
    //   134: if_icmpne -> 603
    //   137: aload_1
    //   138: bipush #32
    //   140: bipush #95
    //   142: invokevirtual replace : (CC)Ljava/lang/String;
    //   145: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   148: astore_1
    //   149: getstatic v.a : [Lag;
    //   152: getstatic af.b : Laf;
    //   155: getfield a : Lv;
    //   158: getfield c : B
    //   161: aaload
    //   162: invokeinterface b : ()J
    //   167: lstore #6
    //   169: lconst_0
    //   170: lstore #8
    //   172: iload_2
    //   173: ifeq -> 184
    //   176: aload_0
    //   177: aload_1
    //   178: invokevirtual a : (Ljava/lang/String;)I
    //   181: i2l
    //   182: lstore #8
    //   184: invokestatic currentTimeMillis : ()J
    //   187: lstore #10
    //   189: aload_0
    //   190: getfield a : Laa;
    //   193: lload #10
    //   195: putfield a : J
    //   198: lload #8
    //   200: lstore #12
    //   202: aload_0
    //   203: getfield a : Laa;
    //   206: iconst_1
    //   207: lconst_0
    //   208: lload #6
    //   210: lload #12
    //   212: iconst_1
    //   213: aconst_null
    //   214: invokevirtual a : (ZJJJZLjava/lang/String;)V
    //   217: aload_0
    //   218: invokespecial b : ()Z
    //   221: pop
    //   222: iload_2
    //   223: ifeq -> 315
    //   226: aload_0
    //   227: ldc 'REST '
    //   229: lload #8
    //   231: invokestatic valueOf : (J)Ljava/lang/String;
    //   234: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   237: aload_0
    //   238: invokespecial a : ()I
    //   241: iconst_3
    //   242: if_icmpeq -> 315
    //   245: aload_0
    //   246: iconst_1
    //   247: putfield d : Z
    //   250: aload_0
    //   251: invokespecial x : ()V
    //   254: aload_0
    //   255: invokespecial t : ()V
    //   258: aconst_null
    //   259: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   262: pop
    //   263: aload_0
    //   264: invokespecial v : ()V
    //   267: aload_0
    //   268: getfield d : Z
    //   271: ifeq -> 281
    //   274: aload_0
    //   275: invokespecial x : ()V
    //   278: goto -> 313
    //   281: aload_0
    //   282: invokespecial b : ()Z
    //   285: pop
    //   286: aload_0
    //   287: invokespecial a : ()I
    //   290: iconst_3
    //   291: if_icmple -> 313
    //   294: aload_0
    //   295: getfield e : Z
    //   298: ifne -> 313
    //   301: new java/io/IOException
    //   304: dup
    //   305: aload_0
    //   306: getfield s : Ljava/lang/String;
    //   309: invokespecial <init> : (Ljava/lang/String;)V
    //   312: athrow
    //   313: iconst_0
    //   314: ireturn
    //   315: aload_0
    //   316: ldc 'STOR '
    //   318: aload_1
    //   319: invokespecial b : (Ljava/lang/String;Ljava/lang/String;)V
    //   322: aload_0
    //   323: invokespecial a : ()I
    //   326: iconst_1
    //   327: if_icmpne -> 585
    //   330: aload_0
    //   331: aload #4
    //   333: aload #5
    //   335: iconst_0
    //   336: invokespecial a : (Ljavax/microedition/io/SocketConnection;Ljavax/microedition/io/ServerSocketConnection;Z)V
    //   339: aload_0
    //   340: iconst_2
    //   341: putfield c : I
    //   344: lload #8
    //   346: lstore #14
    //   348: aload_0
    //   349: getfield i : I
    //   352: newarray byte
    //   354: astore_1
    //   355: getstatic v.a : [Lag;
    //   358: getstatic af.b : Laf;
    //   361: getfield a : Lv;
    //   364: getfield c : B
    //   367: aaload
    //   368: invokeinterface a : ()Ljava/io/InputStream;
    //   373: dup
    //   374: astore_3
    //   375: ifnull -> 392
    //   378: aload_3
    //   379: lload #14
    //   381: l2i
    //   382: i2l
    //   383: invokevirtual skip : (J)J
    //   386: lload #14
    //   388: lcmp
    //   389: ifeq -> 462
    //   392: aload_0
    //   393: iconst_1
    //   394: putfield d : Z
    //   397: aload_0
    //   398: invokespecial x : ()V
    //   401: aload_0
    //   402: invokespecial t : ()V
    //   405: aload_3
    //   406: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   409: pop
    //   410: aload_0
    //   411: invokespecial v : ()V
    //   414: aload_0
    //   415: getfield d : Z
    //   418: ifeq -> 428
    //   421: aload_0
    //   422: invokespecial x : ()V
    //   425: goto -> 460
    //   428: aload_0
    //   429: invokespecial b : ()Z
    //   432: pop
    //   433: aload_0
    //   434: invokespecial a : ()I
    //   437: iconst_3
    //   438: if_icmple -> 460
    //   441: aload_0
    //   442: getfield e : Z
    //   445: ifne -> 460
    //   448: new java/io/IOException
    //   451: dup
    //   452: aload_0
    //   453: getfield s : Ljava/lang/String;
    //   456: invokespecial <init> : (Ljava/lang/String;)V
    //   459: athrow
    //   460: iconst_0
    //   461: ireturn
    //   462: aload_0
    //   463: invokespecial b : ()Z
    //   466: ifeq -> 582
    //   469: aload_0
    //   470: getfield d : Z
    //   473: ifne -> 582
    //   476: aload_3
    //   477: aload_1
    //   478: invokevirtual read : ([B)I
    //   481: dup
    //   482: istore_2
    //   483: iconst_m1
    //   484: if_icmpeq -> 582
    //   487: lload #12
    //   489: iload_2
    //   490: i2l
    //   491: ladd
    //   492: lstore #12
    //   494: aload_0
    //   495: aload_0
    //   496: iload_2
    //   497: invokestatic b : (I)Z
    //   500: dup_x1
    //   501: putfield d : Z
    //   504: putfield e : Z
    //   507: ldc2_w 40
    //   510: invokestatic sleep : (J)V
    //   513: aload_0
    //   514: getfield d : Z
    //   517: ifne -> 582
    //   520: aload_0
    //   521: getfield e : Z
    //   524: ifne -> 582
    //   527: aload_0
    //   528: getfield b : Ljava/io/OutputStream;
    //   531: aload_1
    //   532: iconst_0
    //   533: iload_2
    //   534: invokevirtual write : ([BII)V
    //   537: aload_0
    //   538: getfield b : Ljava/io/OutputStream;
    //   541: invokevirtual flush : ()V
    //   544: aload_0
    //   545: getfield a : Laa;
    //   548: iconst_0
    //   549: lload #10
    //   551: lload #6
    //   553: lload #12
    //   555: iconst_0
    //   556: aload_0
    //   557: getfield a : Laa;
    //   560: aload_0
    //   561: getfield k : I
    //   564: ldc '/'
    //   566: aload_0
    //   567: getfield l : I
    //   570: aconst_null
    //   571: iconst_m1
    //   572: aconst_null
    //   573: invokevirtual a : (ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   576: invokevirtual a : (ZJJJZLjava/lang/String;)V
    //   579: goto -> 462
    //   582: goto -> 603
    //   585: aload_0
    //   586: bipush #12
    //   588: putfield j : I
    //   591: new java/io/IOException
    //   594: dup
    //   595: aload_0
    //   596: getfield s : Ljava/lang/String;
    //   599: invokespecial <init> : (Ljava/lang/String;)V
    //   602: athrow
    //   603: aload_0
    //   604: invokespecial t : ()V
    //   607: aload_3
    //   608: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   611: pop
    //   612: aload_0
    //   613: invokespecial v : ()V
    //   616: aload_0
    //   617: getfield d : Z
    //   620: ifeq -> 630
    //   623: aload_0
    //   624: invokespecial x : ()V
    //   627: goto -> 789
    //   630: aload_0
    //   631: invokespecial b : ()Z
    //   634: pop
    //   635: aload_0
    //   636: invokespecial a : ()I
    //   639: iconst_3
    //   640: if_icmple -> 789
    //   643: aload_0
    //   644: getfield e : Z
    //   647: ifne -> 789
    //   650: new java/io/IOException
    //   653: dup
    //   654: aload_0
    //   655: getfield s : Ljava/lang/String;
    //   658: invokespecial <init> : (Ljava/lang/String;)V
    //   661: athrow
    //   662: pop
    //   663: aload_0
    //   664: iconst_1
    //   665: putfield d : Z
    //   668: aload_0
    //   669: invokespecial t : ()V
    //   672: aload_3
    //   673: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   676: pop
    //   677: aload_0
    //   678: invokespecial v : ()V
    //   681: aload_0
    //   682: getfield d : Z
    //   685: ifeq -> 695
    //   688: aload_0
    //   689: invokespecial x : ()V
    //   692: goto -> 789
    //   695: aload_0
    //   696: invokespecial b : ()Z
    //   699: pop
    //   700: aload_0
    //   701: invokespecial a : ()I
    //   704: iconst_3
    //   705: if_icmple -> 789
    //   708: aload_0
    //   709: getfield e : Z
    //   712: ifne -> 789
    //   715: new java/io/IOException
    //   718: dup
    //   719: aload_0
    //   720: getfield s : Ljava/lang/String;
    //   723: invokespecial <init> : (Ljava/lang/String;)V
    //   726: athrow
    //   727: astore_1
    //   728: aload_0
    //   729: invokespecial t : ()V
    //   732: aload_3
    //   733: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   736: pop
    //   737: aload_0
    //   738: invokespecial v : ()V
    //   741: aload_0
    //   742: getfield d : Z
    //   745: ifeq -> 755
    //   748: aload_0
    //   749: invokespecial x : ()V
    //   752: goto -> 787
    //   755: aload_0
    //   756: invokespecial b : ()Z
    //   759: pop
    //   760: aload_0
    //   761: invokespecial a : ()I
    //   764: iconst_3
    //   765: if_icmple -> 787
    //   768: aload_0
    //   769: getfield e : Z
    //   772: ifne -> 787
    //   775: new java/io/IOException
    //   778: dup
    //   779: aload_0
    //   780: getfield s : Ljava/lang/String;
    //   783: invokespecial <init> : (Ljava/lang/String;)V
    //   786: athrow
    //   787: aload_1
    //   788: athrow
    //   789: aload_0
    //   790: getfield d : Z
    //   793: ifne -> 798
    //   796: iconst_1
    //   797: ireturn
    //   798: iconst_0
    //   799: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	33	662	java/lang/Exception
    //   11	33	727	finally
    //   94	254	662	java/lang/Exception
    //   94	254	727	finally
    //   315	401	662	java/lang/Exception
    //   315	401	727	finally
    //   462	603	662	java/lang/Exception
    //   462	603	727	finally
    //   662	668	727	finally
  }
  
  private void v() {
    ((v)((af)af.b).a).aM = 0;
    af.b.b(true, (v)((aa)this.a).a);
    this.a.b();
    k();
  }
  
  private void w() {
    b("PWD", "");
    a();
  }
  
  private int c(String paramString) {
    int i;
    c("", (String)(aa.a = (Thread)v.d(524)));
    if (paramString.equals("..")) {
      if (!this.r.equals("/"))
        try {
          i = this.r.lastIndexOf('/', this.r.length() - 2);
          v.J = this.r.substring(this.r.lastIndexOf('/', this.r.length() - 2) + 1);
          b("CWD ", this.r.substring(0, i + 1));
          return a();
        } catch (Exception exception) {} 
    } else {
      if (v.b(i, '/')) {
        b("CWD ", i);
      } else {
        v.g(i);
        b("CWD ", v.a(this.r, i));
      } 
      return a();
    } 
    return 5;
  }
  
  private int d(String paramString) {
    b("DELE ", paramString);
    return a();
  }
  
  private boolean c(String paramString) {
    if (this.e && this.d == null)
      return true; 
    if (this.d != null)
      return false; 
    try {
      w();
      if (c(paramString) > 3) {
        c("..");
        return false;
      } 
      u();
      String[] arrayOfString = a(-1, false);
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (v.a(arrayOfString[b], '/')) {
          t();
          if (!c(arrayOfString[b])) {
            c("..");
            return false;
          } 
          c("..");
        } else {
          d(arrayOfString[b]);
          t();
        } 
      } 
      Thread.sleep(40L);
      if (this.e && this.d == null)
        return true; 
      if (this.d != null)
        return false; 
      try {
        w();
        c("..");
        paramString = v.h(paramString);
        b("RMD ", paramString);
        a();
      } catch (Exception exception) {}
    } catch (Exception exception) {
      return false;
    } 
    return true;
  }
  
  private int e(String paramString) {
    paramString = v.h(paramString);
    b("MKD ", paramString);
    return a();
  }
  
  private void x() {
    String str = this.s;
    b("ABOR", "");
    a();
    this.s = str;
  }
  
  public final String a() {
    return this.r;
  }
  
  private String[] a(int paramInt, boolean paramBoolean) {
    if (paramInt >= 0 && paramInt <= 6) {
      if (paramInt == 1)
        v.a((Vector)this.b, 0, this.b.size(), 0, false); 
      v.a((Vector)this.b, 0, this.b.size(), paramInt, paramBoolean);
    } 
    String[] arrayOfString = new String[this.b.size()];
    int i = this.b.size();
    while (i-- > 0) {
      String[] arrayOfString1 = this.b.elementAt(i);
      arrayOfString[i] = arrayOfString1[0];
    } 
    return arrayOfString;
  }
  
  public final String a(String paramString, int paramInt) {
    if (paramString == null || paramInt < 0 || paramInt > this.b.size())
      return ""; 
    int i = this.b.size();
    while (i-- > 0) {
      String str;
      if ((str = (String)this.b.elementAt(i)) != null && paramString.equals(((String[])str)[0]) && (str = ((String[])str)[paramInt]) != null)
        return str; 
    } 
    return "";
  }
  
  private boolean d(String paramString) {
    int i = this.b.size();
    while (i-- > 0) {
      Object object;
      if ((object = this.b.elementAt(i)) != null && v.h(paramString).equals(v.h(((String[])object)[0])))
        return true; 
    } 
    return false;
  }
  
  public final int a(String paramString) {
    return v.a(a(paramString, 1), -1);
  }
  
  public final String b(String paramString) {
    return a(paramString, 2);
  }
  
  private String b() {
    StringBuffer stringBuffer = new StringBuffer(0);
    int i;
    while ((i = this.a.read()) != -1) {
      if (this.m != 0)
        i = ai.a(i); 
      if (i != 10)
        if (i != 13)
          stringBuffer.append((char)i);  
    } 
    v.a(stringBuffer.length());
    this.h = stringBuffer.toString();
    return this.h;
  }
  
  private void b(String paramString) {
    String[] arrayOfString1 = new String[20];
    byte b1 = 0;
    StringBuffer stringBuffer = new StringBuffer(0);
    int i = paramString.length();
    for (byte b2 = 0; b2 < i; b2++) {
      char c;
      if ((c = paramString.charAt(b2)) != ' ' || (c == ' ' && b1 == 3 && stringBuffer.length() > 0)) {
        stringBuffer.append(c);
      } else if (stringBuffer.length() > 0) {
        arrayOfString1[b1++] = stringBuffer.toString();
        stringBuffer.setLength(0);
      } 
    } 
    if (stringBuffer.length() > 0)
      arrayOfString1[b1] = stringBuffer.toString(); 
    String[] arrayOfString2;
    (arrayOfString2 = new String[6])[0] = arrayOfString1[3];
    boolean bool = arrayOfString1[2].equals("<DIR>");
    if (!arrayOfString2[0].equals(".") && !arrayOfString2[0].equals("..")) {
      arrayOfString2[1] = bool ? "0" : arrayOfString1[2];
      arrayOfString2[2] = arrayOfString1[0];
      arrayOfString2[3] = "";
      arrayOfString2[4] = "";
      arrayOfString2[5] = "";
      if (arrayOfString1[1].indexOf(':') != -1)
        arrayOfString2[2] = v.a(arrayOfString2[2], " ", arrayOfString1[1]); 
      if (bool) {
        arrayOfString2[0] = v.a(arrayOfString2[0], "/");
        if (!this.b.isEmpty()) {
          this.b.insertElementAt(arrayOfString2, 0);
          return;
        } 
      } 
      this.b.addElement(arrayOfString2);
    } 
  }
  
  private void c(String paramString) {
    String[] arrayOfString1 = new String[20];
    byte b1 = 0;
    StringBuffer stringBuffer = new StringBuffer(0);
    int i = paramString.length();
    for (byte b2 = 0; b2 < i; b2++) {
      char c;
      if ((c = paramString.charAt(b2)) != ' ' || (c == ' ' && b1 == 8 && stringBuffer.length() > 0)) {
        stringBuffer.append(c);
      } else if (stringBuffer.length() > 0) {
        arrayOfString1[b1++] = stringBuffer.toString();
        stringBuffer.setLength(0);
      } 
    } 
    if (stringBuffer.length() > 0)
      arrayOfString1[b1] = stringBuffer.toString(); 
    String[] arrayOfString2;
    (arrayOfString2 = new String[6])[0] = arrayOfString1[8];
    if (!arrayOfString2[0].equals(".") && !arrayOfString2[0].equals("..")) {
      arrayOfString2[1] = arrayOfString1[4];
      arrayOfString2[2] = arrayOfString1[6];
      arrayOfString2[3] = arrayOfString1[0].substring(1);
      arrayOfString2[4] = arrayOfString1[2];
      arrayOfString2[5] = arrayOfString1[3];
      StringBuffer stringBuffer1 = new StringBuffer(".");
      if (arrayOfString1[7].indexOf(':') == -1) {
        stringBuffer1.append(arrayOfString1[7]).append(" 00:00");
      } else {
        stringBuffer1.append(v.u).append(' ').append(arrayOfString1[7]);
      } 
      arrayOfString2[2] = v.a(arrayOfString2[2], ".", v.k(arrayOfString1[5]), stringBuffer1.toString());
      if (paramString.charAt(0) == 'd') {
        arrayOfString2[0] = v.a(arrayOfString2[0], "/");
        if (!this.b.isEmpty()) {
          this.b.insertElementAt(arrayOfString2, 0);
          return;
        } 
      } 
      this.b.addElement(arrayOfString2);
    } 
  }
  
  private int a() {
    if (this.a == null) {
      this.j = 7;
      this.h = 5;
      throw new IOException("Error reading data");
    } 
    int i = ((aa)this.a).b;
    this.a.a(v.d(579), false);
    if (this.a < 1L)
      b(); 
    while (true) {
      String str;
      if (((str = this.s = b()) == null || str.length() <= 3 || str.charAt(3) != ' ' || !Character.isDigit(str.charAt(0)) || !Character.isDigit(str.charAt(1)) || !Character.isDigit(str.charAt(2)))) {
        if (this.s != null) {
          if (this.s.length() < 3)
            continue; 
          continue;
        } 
        this.j = 12;
        this.h = 4;
        throw new IOException(this.s);
      } 
      this.h = -1;
      this.h = Character.digit(this.s.charAt(0), 10);
      if (this.h < 4 && this.s.startsWith("257")) {
        int j;
        if ((j = this.s.indexOf('"')) != -1) {
          this.r = this.s.substring(j + 1, this.s.lastIndexOf('"'));
        } else if ((j = this.s.indexOf('\'')) != -1) {
          this.r = this.s.substring(j + 1, this.s.lastIndexOf('\''));
        } 
        if (!v.a(this.r, '/'))
          this.r += "/"; 
      } 
      m();
      this.a.a(i, true);
      return this.h;
    } 
  }
  
  public final boolean a() {
    return (this.h != 0 && this.a != null && this.a != null && this.a != null);
  }
  
  public final void i() {
    this.e = false;
    this.g = this.f;
    b(10);
  }
  
  public final void b(boolean paramBoolean) {
    b(paramBoolean ? 11 : 12);
    this.f = false;
  }
  
  private void y() {
    if (this.a != null)
      this.a.clear(); 
    try {
      b("QUIT", "");
    } catch (Throwable throwable) {}
    j();
    v.C();
  }
  
  public final void j() {
    ad ad1;
    (ad1 = this).e = true;
    v.a((TimerTask)ad1.a);
    ad1.a = null;
    z();
    l l1;
    (l1 = new l(20)).a.addElement(this.a);
    l1.a.addElement(this.a);
    l1.a.addElement(this.a);
    v.a(l1);
    this.a = null;
    this.a = null;
    this.a = null;
    this.h = 0;
    this.a = null;
  }
  
  public final void k() {
    l l1;
    (l1 = new l(20)).a.addElement(this.b);
    l1.a.addElement(this.b);
    l1.a.addElement(this.b);
    v.a(l1);
    this.b = null;
    this.b = null;
    this.b = null;
  }
  
  private String c() {
    try {
      b("SYST", "");
      a();
      this.d = this.s.substring(4);
    } catch (Throwable throwable) {}
    return this.d;
  }
  
  private void c(String paramString1, String paramString2) {
    this.a.b();
    this.c = true;
    this.c = paramString1;
    this.a.a(true, "", (paramString2 != null) ? paramString2 : v.d(21), "", "", 0, 0, true, null);
    this.a.a();
  }
  
  private void a(String paramString, boolean paramBoolean) {
    if (this.a.contains(paramString)) {
      if (paramBoolean)
        this.a.removeElement(paramString); 
    } else {
      this.a.addElement(paramString);
    } 
    this.a = !this.a.isEmpty() ? 1 : 0;
    this.b = (l)this.r;
  }
  
  public final void l() {
    this.a.removeAllElements();
    this.a = false;
  }
  
  private boolean b() {
    m();
    if (v.a())
      return false; 
    if (this.b == null)
      this.b = new l(34); 
    this.a = (Timer)(this.b.a = System.currentTimeMillis());
    if (this.a == null) {
      this.a = new Timer();
      this.a.scheduleAtFixedRate(this.b, 0L, 1000L);
    } 
    return true;
  }
  
  public final void m() {
    this.a = -1L;
    this.g = 1;
    this.e = false;
  }
  
  private void z() {
    m();
    v.a(this.b);
    this.b = null;
    try {
      if (this.a != null) {
        this.a.cancel();
        this.a = null;
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void n() {
    if (v.j == null)
      v.j = new Vector(1); 
    if (!v.j.contains(v.N)) {
      v.j.addElement(v.N);
      v.d((DataOutputStream)null);
    } 
    o();
  }
  
  public final void o() {
    if (v.j == null)
      v.j = new Vector(0); 
    t.a(541, v.j, null, "m", false, this.m, true, false, this);
    this.m = -1;
  }
  
  public final void p() {
    if (!ai.g((String)this.a))
      return; 
    a((String)this.a, true);
    v.J = (String)this.a;
    af.b.a(61441, false);
  }
  
  public final void q() {
    this.f = true;
    a("mask", t);
  }
  
  public final void r() {
    if (this.a == null)
      return; 
    for (byte b = 0; b < this.a.length; b++) {
      if (ai.g((String)this.a[b]))
        a((String)this.a[b], true); 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ad.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */