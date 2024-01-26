import i.I;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import jimm.Jimm;

public final class ef extends Canvas {
  public static String a = "Мы не гарантируем качетва версии собранной на стороннем конструкторе, собирайте настоящую версию на http://fay.by";
  
  public static ef b;
  
  public static final Command c = new Command(bb.a((short)11), Jimm.j ? 3 : 2, 1);
  
  public static Timer d;
  
  public static Timer e;
  
  private static Image v;
  
  private static byte[] w;
  
  private static Image x;
  
  private static Font y = Font.getFont(0, 1, 16);
  
  public static Font f = Font.getFont(0, 0, 8);
  
  private static int z = f.getHeight();
  
  private static String A;
  
  public static int g;
  
  private static boolean B;
  
  private static int C;
  
  public static long h;
  
  public static boolean i;
  
  public static boolean j = false;
  
  public static boolean k;
  
  public static String l = "none";
  
  private static int D = -1;
  
  private static I E = null;
  
  public static String m = null;
  
  public int[] n;
  
  public int[] o;
  
  public int p = -1;
  
  public int q = -1;
  
  public int r = 0;
  
  public boolean s = false;
  
  public bq t = null;
  
  public static String u = "MIDlet-Jar-Size";
  
  public ef(String paramString) {
    b = this;
    setFullScreenMode(bd.l);
    dw.a = getWidth();
    dw.b = getHeight();
    a(paramString);
    i = false;
  }
  
  public ef() {
    this(null);
  }
  
  public static synchronized void a(String paramString) {
    A = new String(paramString);
    b.repaint();
  }
  
  public static synchronized void a(int paramInt) {
    D = paramInt;
  }
  
  public static synchronized void a(I paramI) {
    E = paramI;
  }
  
  private static Image j() {
    String str = "/logo.png";
    if (m != str)
      try {
        m = str;
        v = Image.createImage(str);
        InputStream inputStream;
        if ((inputStream = v.getClass().getResourceAsStream(str + ".bin")) == null) {
          w = null;
        } else {
          w = new byte[2];
          inputStream.read(w);
        } 
      } catch (Exception exception) {
        v = null;
        w = null;
      }  
    return v;
  }
  
  public static void a() {
    if (e != null) {
      e.cancel();
      e = null;
    } 
    j = false;
    Jimm.d.setCurrent((Displayable)b);
    b.g();
  }
  
  public static void a(Command paramCommand) {
    b.addCommand(paramCommand);
  }
  
  public static void b(Command paramCommand) {
    b.removeCommand(paramCommand);
  }
  
  public static void a(CommandListener paramCommandListener) {
    b.setCommandListener(paramCommandListener);
  }
  
  public static void b() {
    b.repaint();
  }
  
  public static synchronized void b(int paramInt) {
    if (g == paramInt)
      return; 
    int i = g;
    g = paramInt;
    if (paramInt < i) {
      b.repaint();
      return;
    } 
    b.repaint(0, b.getHeight() - z - 2, b.getWidth(), z + 2);
  }
  
  public static synchronized void c() {
    b.removeCommand(c);
    if (B)
      return; 
    B = true;
    a(bb.a((short)298));
    if (em.h(64)) {
      ew.a(4);
      switch (em.f(241)) {
        case 2:
          em.a(218, 11);
          break;
        case 1:
          em.a(218, 18);
          break;
        case 3:
          em.a(218, 16);
          break;
      } 
      try {
        eu.b();
      } catch (cr cr) {}
    } 
    Jimm.d.setCurrent((Displayable)b);
    j = false;
    b.g();
    (e = new Timer()).schedule(new ew(1), 20000L, 20000L);
    b(0);
    Jimm.s = true;
  }
  
  public static synchronized void d() {
    if (B) {
      B = false;
      C = 0;
      if (e != null)
        e.cancel(); 
    } 
    if (!dw.L)
      bi.i(); 
  }
  
  public static boolean e() {
    return B;
  }
  
  public final void hideNotify() {
    m = null;
  }
  
  public static synchronized void f() {
    if (B) {
      C++;
      b.repaint();
    } 
  }
  
  public final void keyPressed(int paramInt) {
    if (B) {
      if (paramInt == 35 || paramInt == 42) {
        h = System.currentTimeMillis();
      } else {
        if (d != null) {
          d.cancel();
          d = null;
        } 
        i = true;
        repaint();
      } 
    } else if (paramInt == 48 && !dw.L) {
      bi.i();
    } 
    cz.b();
  }
  
  private static void k() {
    if (em.d(133).length() > 0) {
      dq.a(Jimm.d.getCurrent());
      return;
    } 
    d();
    h = 0L;
  }
  
  private static void c(int paramInt) {
    if (!B)
      return; 
    if (paramInt != 35 && paramInt != 42) {
      h = 0L;
      return;
    } 
    if (h != 0L && System.currentTimeMillis() - h > 900L)
      k(); 
  }
  
  public final void keyReleased(int paramInt) {
    c(paramInt);
    h = 0L;
  }
  
  public final void keyRepeated(int paramInt) {
    c(paramInt);
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2) {
    if (!B)
      return; 
    if (paramInt2 > getHeight() - z - 3)
      k(); 
  }
  
  public final void paint(Graphics paramGraphics) {
    // Byte code:
    //   0: bipush #9
    //   2: invokestatic g : (I)I
    //   5: dup
    //   6: istore_2
    //   7: invokestatic r : (I)I
    //   10: istore_3
    //   11: aload_0
    //   12: invokevirtual getHeight : ()I
    //   15: getstatic ef.z : I
    //   18: isub
    //   19: istore #4
    //   21: aload_1
    //   22: invokevirtual getClipY : ()I
    //   25: iload #4
    //   27: iconst_2
    //   28: isub
    //   29: if_icmpge -> 1748
    //   32: aload_1
    //   33: iload_2
    //   34: invokevirtual setColor : (I)V
    //   37: aload_1
    //   38: iconst_0
    //   39: iconst_0
    //   40: aload_0
    //   41: invokevirtual getWidth : ()I
    //   44: aload_0
    //   45: invokevirtual getHeight : ()I
    //   48: invokevirtual fillRect : (IIII)V
    //   51: getstatic ef.v : Ljavax/microedition/lcdui/Image;
    //   54: astore #5
    //   56: invokestatic j : ()Ljavax/microedition/lcdui/Image;
    //   59: dup
    //   60: astore #6
    //   62: aload #5
    //   64: if_acmpeq -> 71
    //   67: iconst_1
    //   68: goto -> 72
    //   71: iconst_0
    //   72: istore #7
    //   74: aload #6
    //   76: ifnull -> 1076
    //   79: iload #7
    //   81: ifeq -> 849
    //   84: aload_0
    //   85: iconst_0
    //   86: putfield s : Z
    //   89: aload_0
    //   90: iconst_m1
    //   91: putfield q : I
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield n : [I
    //   99: aload_0
    //   100: aconst_null
    //   101: putfield o : [I
    //   104: iconst_m1
    //   105: istore #8
    //   107: getstatic ef.w : [B
    //   110: ifnull -> 157
    //   113: aload #6
    //   115: invokevirtual getWidth : ()I
    //   118: getstatic ef.w : [B
    //   121: iconst_0
    //   122: baload
    //   123: idiv
    //   124: istore #8
    //   126: aload_0
    //   127: getstatic ef.w : [B
    //   130: iconst_1
    //   131: baload
    //   132: iconst_1
    //   133: if_icmpne -> 140
    //   136: iconst_1
    //   137: goto -> 141
    //   140: iconst_0
    //   141: putfield s : Z
    //   144: aload_0
    //   145: iconst_0
    //   146: putfield q : I
    //   149: aload_0
    //   150: iconst_0
    //   151: putfield p : I
    //   154: goto -> 742
    //   157: aload #6
    //   159: invokevirtual getWidth : ()I
    //   162: aload #6
    //   164: invokevirtual getHeight : ()I
    //   167: if_icmple -> 742
    //   170: aload #6
    //   172: invokevirtual getWidth : ()I
    //   175: aload_0
    //   176: invokevirtual getWidth : ()I
    //   179: iconst_2
    //   180: imul
    //   181: if_icmplt -> 742
    //   184: aload #6
    //   186: invokevirtual getWidth : ()I
    //   189: dup
    //   190: istore #9
    //   192: newarray int
    //   194: astore #10
    //   196: aload #6
    //   198: aload #10
    //   200: iconst_0
    //   201: iload #9
    //   203: iconst_0
    //   204: aload #6
    //   206: invokevirtual getHeight : ()I
    //   209: iconst_1
    //   210: isub
    //   211: iload #9
    //   213: iconst_1
    //   214: invokevirtual getRGB : ([IIIIIII)V
    //   217: aload #6
    //   219: invokevirtual getHeight : ()I
    //   222: aload_0
    //   223: invokevirtual getHeight : ()I
    //   226: if_icmpne -> 232
    //   229: goto -> 736
    //   232: aload #6
    //   234: invokevirtual getHeight : ()I
    //   237: lookupswitch default -> 373, 158 -> 288, 160 -> 339, 220 -> 305, 320 -> 322, 416 -> 356
    //   288: sipush #138
    //   291: istore #8
    //   293: aload_0
    //   294: aload #10
    //   296: sipush #138
    //   299: invokespecial a : ([II)V
    //   302: goto -> 742
    //   305: sipush #176
    //   308: istore #8
    //   310: aload_0
    //   311: aload #10
    //   313: sipush #176
    //   316: invokespecial a : ([II)V
    //   319: goto -> 742
    //   322: sipush #240
    //   325: istore #8
    //   327: aload_0
    //   328: aload #10
    //   330: sipush #240
    //   333: invokespecial a : ([II)V
    //   336: goto -> 742
    //   339: sipush #128
    //   342: istore #8
    //   344: aload_0
    //   345: aload #10
    //   347: sipush #128
    //   350: invokespecial a : ([II)V
    //   353: goto -> 742
    //   356: sipush #352
    //   359: istore #8
    //   361: aload_0
    //   362: aload #10
    //   364: sipush #352
    //   367: invokespecial a : ([II)V
    //   370: goto -> 742
    //   373: aload_0
    //   374: aload_0
    //   375: aload #10
    //   377: iconst_5
    //   378: iconst_4
    //   379: aload #10
    //   381: iconst_0
    //   382: iaload
    //   383: invokespecial a : ([IIII)I
    //   386: putfield q : I
    //   389: aload_0
    //   390: getfield q : I
    //   393: iconst_3
    //   394: if_icmpeq -> 405
    //   397: aload_0
    //   398: getfield q : I
    //   401: iconst_2
    //   402: if_icmpne -> 420
    //   405: aload_0
    //   406: dup
    //   407: getfield q : I
    //   410: iconst_2
    //   411: isub
    //   412: putfield q : I
    //   415: aload_0
    //   416: iconst_1
    //   417: putfield s : Z
    //   420: aload_0
    //   421: getfield q : I
    //   424: iconst_1
    //   425: if_icmpeq -> 435
    //   428: aload_0
    //   429: getfield q : I
    //   432: ifne -> 736
    //   435: aload #10
    //   437: aload #10
    //   439: arraylength
    //   440: iconst_1
    //   441: isub
    //   442: iaload
    //   443: aload #10
    //   445: aload #10
    //   447: arraylength
    //   448: iconst_2
    //   449: isub
    //   450: iaload
    //   451: invokestatic a : (II)Z
    //   454: ifeq -> 736
    //   457: aload #10
    //   459: aload #10
    //   461: arraylength
    //   462: iconst_1
    //   463: isub
    //   464: iaload
    //   465: aload #10
    //   467: aload #10
    //   469: arraylength
    //   470: iconst_3
    //   471: isub
    //   472: iaload
    //   473: invokestatic a : (II)Z
    //   476: ifeq -> 736
    //   479: aload #10
    //   481: aload #10
    //   483: arraylength
    //   484: iconst_1
    //   485: isub
    //   486: iaload
    //   487: aload #10
    //   489: iconst_0
    //   490: iaload
    //   491: invokestatic a : (II)Z
    //   494: ifne -> 736
    //   497: new java/util/Vector
    //   500: dup
    //   501: invokespecial <init> : ()V
    //   504: dup
    //   505: astore #11
    //   507: new java/lang/Integer
    //   510: dup
    //   511: iconst_0
    //   512: invokespecial <init> : (I)V
    //   515: invokevirtual addElement : (Ljava/lang/Object;)V
    //   518: bipush #20
    //   520: istore #12
    //   522: iload #12
    //   524: iload #9
    //   526: if_icmpge -> 570
    //   529: aload #10
    //   531: iload #12
    //   533: iaload
    //   534: aload #10
    //   536: iconst_0
    //   537: iaload
    //   538: invokestatic a : (II)Z
    //   541: ifeq -> 564
    //   544: aload #11
    //   546: new java/lang/Integer
    //   549: dup
    //   550: iload #12
    //   552: invokespecial <init> : (I)V
    //   555: invokevirtual addElement : (Ljava/lang/Object;)V
    //   558: iinc #12, 17
    //   561: goto -> 522
    //   564: iinc #12, 1
    //   567: goto -> 522
    //   570: aload #11
    //   572: new java/lang/Integer
    //   575: dup
    //   576: iload #9
    //   578: invokespecial <init> : (I)V
    //   581: invokevirtual addElement : (Ljava/lang/Object;)V
    //   584: aload_0
    //   585: aload #11
    //   587: invokevirtual size : ()I
    //   590: newarray int
    //   592: putfield n : [I
    //   595: iconst_0
    //   596: istore #12
    //   598: iload #12
    //   600: aload_0
    //   601: getfield n : [I
    //   604: arraylength
    //   605: if_icmpge -> 634
    //   608: aload_0
    //   609: getfield n : [I
    //   612: iload #12
    //   614: aload #11
    //   616: iload #12
    //   618: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   621: checkcast java/lang/Integer
    //   624: invokevirtual intValue : ()I
    //   627: iastore
    //   628: iinc #12, 1
    //   631: goto -> 598
    //   634: aload_0
    //   635: iconst_1
    //   636: putfield r : I
    //   639: aload_0
    //   640: getfield q : I
    //   643: ifne -> 733
    //   646: aload_0
    //   647: aload_0
    //   648: getfield n : [I
    //   651: arraylength
    //   652: iconst_1
    //   653: isub
    //   654: newarray int
    //   656: putfield o : [I
    //   659: iconst_0
    //   660: istore #12
    //   662: iload #12
    //   664: aload_0
    //   665: getfield o : [I
    //   668: arraylength
    //   669: if_icmpge -> 728
    //   672: aload_0
    //   673: getfield o : [I
    //   676: iload #12
    //   678: aload_0
    //   679: aload #10
    //   681: aload_0
    //   682: getfield n : [I
    //   685: iload #12
    //   687: iaload
    //   688: iconst_1
    //   689: iadd
    //   690: iconst_4
    //   691: aload #10
    //   693: iconst_0
    //   694: iaload
    //   695: invokespecial a : ([IIII)I
    //   698: bipush #100
    //   700: imul
    //   701: iastore
    //   702: aload_0
    //   703: getfield o : [I
    //   706: iload #12
    //   708: iaload
    //   709: ifne -> 722
    //   712: aload_0
    //   713: getfield o : [I
    //   716: iload #12
    //   718: sipush #333
    //   721: iastore
    //   722: iinc #12, 1
    //   725: goto -> 662
    //   728: aload_0
    //   729: iconst_0
    //   730: putfield p : I
    //   733: goto -> 742
    //   736: aload_0
    //   737: invokevirtual getWidth : ()I
    //   740: istore #8
    //   742: iload #8
    //   744: iconst_m1
    //   745: if_icmpeq -> 838
    //   748: aload #6
    //   750: invokevirtual getWidth : ()I
    //   753: iload #8
    //   755: idiv
    //   756: istore #9
    //   758: aload_0
    //   759: iload #9
    //   761: iconst_1
    //   762: iadd
    //   763: newarray int
    //   765: putfield n : [I
    //   768: iconst_0
    //   769: istore #10
    //   771: iload #10
    //   773: iload #9
    //   775: if_icmpgt -> 796
    //   778: aload_0
    //   779: getfield n : [I
    //   782: iload #10
    //   784: iload #8
    //   786: iload #10
    //   788: imul
    //   789: iastore
    //   790: iinc #10, 1
    //   793: goto -> 771
    //   796: aload_0
    //   797: aload_0
    //   798: getfield n : [I
    //   801: arraylength
    //   802: iconst_1
    //   803: isub
    //   804: newarray int
    //   806: putfield o : [I
    //   809: iconst_0
    //   810: istore #10
    //   812: iload #10
    //   814: aload_0
    //   815: getfield o : [I
    //   818: arraylength
    //   819: if_icmpge -> 838
    //   822: aload_0
    //   823: getfield o : [I
    //   826: iload #10
    //   828: sipush #333
    //   831: iastore
    //   832: iinc #10, 1
    //   835: goto -> 812
    //   838: aload_0
    //   839: getfield q : I
    //   842: ifne -> 849
    //   845: aload_0
    //   846: invokevirtual g : ()V
    //   849: aload_0
    //   850: getfield q : I
    //   853: iconst_m1
    //   854: if_icmpeq -> 1054
    //   857: aload_0
    //   858: getfield n : [I
    //   861: arraylength
    //   862: iconst_1
    //   863: isub
    //   864: getstatic ef.g : I
    //   867: imul
    //   868: bipush #100
    //   870: idiv
    //   871: istore #8
    //   873: aload_0
    //   874: getfield q : I
    //   877: ifne -> 886
    //   880: aload_0
    //   881: getfield p : I
    //   884: istore #8
    //   886: iload #8
    //   888: aload_0
    //   889: getfield n : [I
    //   892: arraylength
    //   893: iconst_1
    //   894: isub
    //   895: if_icmpne -> 901
    //   898: iinc #8, -1
    //   901: aload_0
    //   902: getfield n : [I
    //   905: iload #8
    //   907: iaload
    //   908: istore #9
    //   910: aload_0
    //   911: getfield n : [I
    //   914: iload #8
    //   916: iconst_1
    //   917: iadd
    //   918: iaload
    //   919: iload #9
    //   921: isub
    //   922: istore #10
    //   924: aload_0
    //   925: getfield s : Z
    //   928: ifeq -> 997
    //   931: iload #8
    //   933: ifeq -> 997
    //   936: aload_1
    //   937: aload #6
    //   939: iconst_0
    //   940: iconst_0
    //   941: aload_0
    //   942: getfield n : [I
    //   945: iconst_1
    //   946: iaload
    //   947: aload #6
    //   949: invokevirtual getHeight : ()I
    //   952: aload_0
    //   953: getfield r : I
    //   956: isub
    //   957: iconst_0
    //   958: aload_0
    //   959: invokevirtual getWidth : ()I
    //   962: iconst_2
    //   963: idiv
    //   964: aload_0
    //   965: getfield n : [I
    //   968: iconst_1
    //   969: iaload
    //   970: iconst_2
    //   971: idiv
    //   972: isub
    //   973: aload_0
    //   974: invokevirtual getHeight : ()I
    //   977: iconst_2
    //   978: idiv
    //   979: aload #6
    //   981: invokevirtual getHeight : ()I
    //   984: aload_0
    //   985: getfield r : I
    //   988: isub
    //   989: iconst_2
    //   990: idiv
    //   991: isub
    //   992: bipush #20
    //   994: invokevirtual drawRegion : (Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   997: aload_1
    //   998: aload #6
    //   1000: iload #9
    //   1002: iconst_0
    //   1003: iload #10
    //   1005: aload #6
    //   1007: invokevirtual getHeight : ()I
    //   1010: aload_0
    //   1011: getfield r : I
    //   1014: isub
    //   1015: iconst_0
    //   1016: aload_0
    //   1017: invokevirtual getWidth : ()I
    //   1020: iconst_2
    //   1021: idiv
    //   1022: iload #10
    //   1024: iconst_2
    //   1025: idiv
    //   1026: isub
    //   1027: aload_0
    //   1028: invokevirtual getHeight : ()I
    //   1031: iconst_2
    //   1032: idiv
    //   1033: aload #6
    //   1035: invokevirtual getHeight : ()I
    //   1038: aload_0
    //   1039: getfield r : I
    //   1042: isub
    //   1043: iconst_2
    //   1044: idiv
    //   1045: isub
    //   1046: bipush #20
    //   1048: invokevirtual drawRegion : (Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   1051: goto -> 1103
    //   1054: aload_1
    //   1055: aload #6
    //   1057: aload_0
    //   1058: invokevirtual getWidth : ()I
    //   1061: iconst_2
    //   1062: idiv
    //   1063: aload_0
    //   1064: invokevirtual getHeight : ()I
    //   1067: iconst_2
    //   1068: idiv
    //   1069: iconst_3
    //   1070: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1073: goto -> 1103
    //   1076: aload_1
    //   1077: getstatic ef.y : Ljavax/microedition/lcdui/Font;
    //   1080: iload_3
    //   1081: ldc 'LocID icq client'
    //   1083: aload_0
    //   1084: invokevirtual getWidth : ()I
    //   1087: iconst_2
    //   1088: idiv
    //   1089: aload_0
    //   1090: invokevirtual getHeight : ()I
    //   1093: iconst_2
    //   1094: idiv
    //   1095: iconst_5
    //   1096: iadd
    //   1097: bipush #65
    //   1099: iconst_1
    //   1100: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;ILjava/lang/String;IIII)V
    //   1103: aload_0
    //   1104: invokevirtual getWidth : ()I
    //   1107: istore #11
    //   1109: aload_0
    //   1110: invokevirtual getHeight : ()I
    //   1113: istore #12
    //   1115: bipush #32
    //   1117: iconst_1
    //   1118: anewarray java/lang/Object
    //   1121: dup
    //   1122: iconst_0
    //   1123: bipush #7
    //   1125: newarray int
    //   1127: dup
    //   1128: iconst_0
    //   1129: iconst_0
    //   1130: iastore
    //   1131: dup
    //   1132: iconst_1
    //   1133: iconst_0
    //   1134: iastore
    //   1135: dup
    //   1136: iconst_2
    //   1137: iload #11
    //   1139: iastore
    //   1140: dup
    //   1141: iconst_3
    //   1142: iload #12
    //   1144: iastore
    //   1145: dup
    //   1146: iconst_4
    //   1147: iconst_m1
    //   1148: iastore
    //   1149: dup
    //   1150: iconst_5
    //   1151: iconst_0
    //   1152: iastore
    //   1153: dup
    //   1154: bipush #6
    //   1156: iconst_0
    //   1157: iastore
    //   1158: aastore
    //   1159: aload_1
    //   1160: invokestatic a : (I[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1163: pop
    //   1164: aconst_null
    //   1165: astore #13
    //   1167: getstatic ef.x : Ljavax/microedition/lcdui/Image;
    //   1170: ifnull -> 1209
    //   1173: aload #6
    //   1175: ifnull -> 1193
    //   1178: aload #6
    //   1180: invokevirtual getHeight : ()I
    //   1183: getstatic ef.z : I
    //   1186: iconst_3
    //   1187: imul
    //   1188: iconst_4
    //   1189: idiv
    //   1190: if_icmpge -> 1209
    //   1193: aload_1
    //   1194: getstatic ef.x : Ljavax/microedition/lcdui/Image;
    //   1197: aload_0
    //   1198: invokevirtual getWidth : ()I
    //   1201: iconst_2
    //   1202: idiv
    //   1203: iconst_2
    //   1204: bipush #17
    //   1206: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1209: getstatic ef.B : Z
    //   1212: ifeq -> 1300
    //   1215: getstatic ef.C : I
    //   1218: ifle -> 1300
    //   1221: aload_0
    //   1222: invokevirtual getHeight : ()I
    //   1225: iconst_2
    //   1226: getstatic ef.z : I
    //   1229: imul
    //   1230: isub
    //   1231: istore #14
    //   1233: getstatic bi.b : Ldf;
    //   1236: bipush #14
    //   1238: invokevirtual a : (I)Li/I;
    //   1241: aload_1
    //   1242: iconst_1
    //   1243: iload #14
    //   1245: bipush #9
    //   1247: isub
    //   1248: invokevirtual drawImage : (Ljavax/microedition/lcdui/Graphics;II)V
    //   1251: aload_1
    //   1252: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   1255: iload_3
    //   1256: new java/lang/StringBuffer
    //   1259: dup
    //   1260: invokespecial <init> : ()V
    //   1263: ldc '# '
    //   1265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1268: getstatic ef.C : I
    //   1271: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1274: invokevirtual toString : ()Ljava/lang/String;
    //   1277: getstatic bi.b : Ldf;
    //   1280: bipush #14
    //   1282: invokevirtual a : (I)Li/I;
    //   1285: invokevirtual getWidth : ()I
    //   1288: iconst_4
    //   1289: iadd
    //   1290: iload #14
    //   1292: iconst_5
    //   1293: isub
    //   1294: bipush #20
    //   1296: iconst_1
    //   1297: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;ILjava/lang/String;IIII)V
    //   1300: bipush #57
    //   1302: invokestatic h : (I)Z
    //   1305: ifeq -> 1361
    //   1308: aload_1
    //   1309: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   1312: iload_3
    //   1313: iconst_0
    //   1314: iconst_0
    //   1315: invokestatic b : (ZZ)Ljava/lang/String;
    //   1318: aload_0
    //   1319: invokevirtual getWidth : ()I
    //   1322: iconst_2
    //   1323: idiv
    //   1324: bipush #12
    //   1326: bipush #17
    //   1328: iconst_1
    //   1329: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;ILjava/lang/String;IIII)V
    //   1332: aload_1
    //   1333: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   1336: iload_3
    //   1337: invokestatic c : ()Ljava/lang/String;
    //   1340: aload_0
    //   1341: invokevirtual getWidth : ()I
    //   1344: iconst_2
    //   1345: idiv
    //   1346: bipush #13
    //   1348: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   1351: invokevirtual getHeight : ()I
    //   1354: iadd
    //   1355: bipush #17
    //   1357: iconst_1
    //   1358: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;ILjava/lang/String;IIII)V
    //   1361: getstatic ef.B : Z
    //   1364: ifne -> 1501
    //   1367: aload_0
    //   1368: invokevirtual getHeight : ()I
    //   1371: getstatic ef.z : I
    //   1374: iconst_5
    //   1375: imul
    //   1376: iconst_2
    //   1377: idiv
    //   1378: isub
    //   1379: istore #14
    //   1381: bipush #83
    //   1383: invokestatic h : (I)Z
    //   1386: ifeq -> 1445
    //   1389: getstatic dw.I : I
    //   1392: invokestatic a : (I)Z
    //   1395: ifeq -> 1445
    //   1398: aload_1
    //   1399: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   1402: iload_3
    //   1403: new java/lang/StringBuffer
    //   1406: dup
    //   1407: invokespecial <init> : ()V
    //   1410: ldc 'New Rel:'
    //   1412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1415: getstatic dw.I : I
    //   1418: iconst_0
    //   1419: invokestatic a : (IZ)Ljava/lang/String;
    //   1422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1425: invokevirtual toString : ()Ljava/lang/String;
    //   1428: iconst_0
    //   1429: iload #14
    //   1431: bipush #36
    //   1433: iconst_1
    //   1434: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;ILjava/lang/String;IIII)V
    //   1437: iload #14
    //   1439: getstatic ef.z : I
    //   1442: isub
    //   1443: istore #14
    //   1445: bipush #84
    //   1447: invokestatic h : (I)Z
    //   1450: ifeq -> 1501
    //   1453: getstatic dw.J : I
    //   1456: invokestatic a : (I)Z
    //   1459: ifeq -> 1501
    //   1462: aload_1
    //   1463: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   1466: iload_3
    //   1467: new java/lang/StringBuffer
    //   1470: dup
    //   1471: invokespecial <init> : ()V
    //   1474: ldc 'New Test:'
    //   1476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1479: getstatic dw.J : I
    //   1482: iconst_0
    //   1483: invokestatic a : (IZ)Ljava/lang/String;
    //   1486: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1489: invokevirtual toString : ()Ljava/lang/String;
    //   1492: iconst_0
    //   1493: iload #14
    //   1495: bipush #36
    //   1497: iconst_1
    //   1498: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;ILjava/lang/String;IIII)V
    //   1501: getstatic ef.i : Z
    //   1504: ifne -> 1519
    //   1507: getstatic ef.k : Z
    //   1510: ifne -> 1519
    //   1513: getstatic ef.j : Z
    //   1516: ifeq -> 1748
    //   1519: aload_0
    //   1520: invokevirtual getWidth : ()I
    //   1523: bipush #10
    //   1525: idiv
    //   1526: bipush #8
    //   1528: imul
    //   1529: istore #16
    //   1531: getstatic ef.a : Ljava/lang/String;
    //   1534: astore #18
    //   1536: getstatic ef.i : Z
    //   1539: ifeq -> 1550
    //   1542: sipush #296
    //   1545: invokestatic a : (S)Ljava/lang/String;
    //   1548: astore #18
    //   1550: getstatic ef.j : Z
    //   1553: ifeq -> 1564
    //   1556: sipush #811
    //   1559: invokestatic a : (S)Ljava/lang/String;
    //   1562: astore #18
    //   1564: iconst_0
    //   1565: iconst_0
    //   1566: iconst_0
    //   1567: invokestatic getFont : (III)Ljavax/microedition/lcdui/Font;
    //   1570: invokevirtual getHeight : ()I
    //   1573: aload #18
    //   1575: iload #16
    //   1577: bipush #8
    //   1579: isub
    //   1580: iconst_0
    //   1581: iconst_0
    //   1582: iconst_0
    //   1583: invokestatic a : (Ljava/lang/String;IIII)I
    //   1586: imul
    //   1587: bipush #8
    //   1589: iadd
    //   1590: istore #17
    //   1592: aload_0
    //   1593: invokevirtual getWidth : ()I
    //   1596: iconst_2
    //   1597: idiv
    //   1598: aload_0
    //   1599: invokevirtual getWidth : ()I
    //   1602: bipush #10
    //   1604: idiv
    //   1605: iconst_4
    //   1606: imul
    //   1607: isub
    //   1608: istore #14
    //   1610: aload_0
    //   1611: invokevirtual getHeight : ()I
    //   1614: iconst_2
    //   1615: idiv
    //   1616: iload #17
    //   1618: iconst_2
    //   1619: idiv
    //   1620: isub
    //   1621: istore #15
    //   1623: aload_1
    //   1624: iload_3
    //   1625: invokevirtual setColor : (I)V
    //   1628: aload_1
    //   1629: iload_3
    //   1630: iload_3
    //   1631: bipush #-48
    //   1633: invokestatic e : (II)I
    //   1636: iload #14
    //   1638: iload #15
    //   1640: iload #14
    //   1642: iload #16
    //   1644: iadd
    //   1645: iload #15
    //   1647: iload #17
    //   1649: iadd
    //   1650: sipush #255
    //   1653: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIIII)V
    //   1656: aload_1
    //   1657: iload_2
    //   1658: invokevirtual setColor : (I)V
    //   1661: aload_1
    //   1662: iload #14
    //   1664: iconst_2
    //   1665: iadd
    //   1666: iload #15
    //   1668: iconst_2
    //   1669: iadd
    //   1670: iload #16
    //   1672: iconst_5
    //   1673: isub
    //   1674: iload #17
    //   1676: iconst_5
    //   1677: isub
    //   1678: invokevirtual drawRect : (IIII)V
    //   1681: aload_1
    //   1682: aload #18
    //   1684: iload #14
    //   1686: iconst_4
    //   1687: iadd
    //   1688: iload #15
    //   1690: iconst_4
    //   1691: iadd
    //   1692: iload #16
    //   1694: bipush #8
    //   1696: isub
    //   1697: iload #17
    //   1699: bipush #8
    //   1701: isub
    //   1702: iconst_0
    //   1703: iconst_0
    //   1704: iload_3
    //   1705: invokestatic r : (I)I
    //   1708: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIIIIII)V
    //   1711: getstatic ef.d : Ljava/util/Timer;
    //   1714: ifnonnull -> 1748
    //   1717: getstatic ef.i : Z
    //   1720: ifeq -> 1748
    //   1723: new java/util/Timer
    //   1726: dup
    //   1727: invokespecial <init> : ()V
    //   1730: dup
    //   1731: putstatic ef.d : Ljava/util/Timer;
    //   1734: new ew
    //   1737: dup
    //   1738: iconst_2
    //   1739: invokespecial <init> : (I)V
    //   1742: ldc2_w 3000
    //   1745: invokevirtual schedule : (Ljava/util/TimerTask;J)V
    //   1748: aload_1
    //   1749: iload_3
    //   1750: invokevirtual setColor : (I)V
    //   1753: invokestatic h : ()V
    //   1756: aconst_null
    //   1757: astore #5
    //   1759: iconst_0
    //   1760: istore #6
    //   1762: getstatic ef.D : I
    //   1765: iconst_m1
    //   1766: if_icmpeq -> 1786
    //   1769: getstatic bi.b : Ldf;
    //   1772: getstatic ef.D : I
    //   1775: invokevirtual a : (I)Li/I;
    //   1778: dup
    //   1779: astore #5
    //   1781: invokevirtual getWidth : ()I
    //   1784: istore #6
    //   1786: iconst_0
    //   1787: istore #7
    //   1789: aload_0
    //   1790: invokevirtual getWidth : ()I
    //   1793: iconst_2
    //   1794: idiv
    //   1795: iload #6
    //   1797: iconst_2
    //   1798: idiv
    //   1799: iadd
    //   1800: istore #8
    //   1802: aload_0
    //   1803: invokevirtual getWidth : ()I
    //   1806: iconst_2
    //   1807: idiv
    //   1808: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   1811: getstatic ef.A : Ljava/lang/String;
    //   1814: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   1817: iconst_2
    //   1818: idiv
    //   1819: isub
    //   1820: iload #6
    //   1822: iconst_2
    //   1823: idiv
    //   1824: iadd
    //   1825: istore #9
    //   1827: getstatic ef.E : Li/I;
    //   1830: ifnull -> 1863
    //   1833: getstatic ef.E : Li/I;
    //   1836: getstatic dv.a : I
    //   1839: invokestatic b : (I)Li/I;
    //   1842: if_acmpeq -> 1863
    //   1845: aload_0
    //   1846: invokevirtual getWidth : ()I
    //   1849: sipush #129
    //   1852: if_icmple -> 1863
    //   1855: getstatic ef.E : Li/I;
    //   1858: invokevirtual getWidth : ()I
    //   1861: istore #7
    //   1863: aload_1
    //   1864: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   1867: iload_3
    //   1868: getstatic ef.A : Ljava/lang/String;
    //   1871: iload #8
    //   1873: aload_0
    //   1874: invokevirtual getHeight : ()I
    //   1877: bipush #33
    //   1879: iconst_1
    //   1880: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;ILjava/lang/String;IIII)V
    //   1883: iload #7
    //   1885: ifeq -> 1907
    //   1888: getstatic ef.E : Li/I;
    //   1891: aload_1
    //   1892: iload #9
    //   1894: aload_0
    //   1895: invokevirtual getHeight : ()I
    //   1898: getstatic ef.z : I
    //   1901: iconst_2
    //   1902: idiv
    //   1903: isub
    //   1904: invokevirtual drawByRight : (Ljavax/microedition/lcdui/Graphics;II)V
    //   1907: aload #5
    //   1909: ifnull -> 1933
    //   1912: aload #5
    //   1914: aload_1
    //   1915: iload #9
    //   1917: iload #7
    //   1919: isub
    //   1920: aload_0
    //   1921: invokevirtual getHeight : ()I
    //   1924: getstatic ef.z : I
    //   1927: iconst_2
    //   1928: idiv
    //   1929: isub
    //   1930: invokevirtual drawByRight : (Ljavax/microedition/lcdui/Graphics;II)V
    //   1933: iload_3
    //   1934: istore #11
    //   1936: sipush #248
    //   1939: invokestatic f : (I)I
    //   1942: lookupswitch default -> 2163, 0 -> 1968, 1 -> 2095
    //   1968: aload_0
    //   1969: invokevirtual getWidth : ()I
    //   1972: iconst_1
    //   1973: isub
    //   1974: getstatic ef.g : I
    //   1977: imul
    //   1978: bipush #100
    //   1980: idiv
    //   1981: dup
    //   1982: istore #10
    //   1984: iconst_1
    //   1985: if_icmpge -> 1989
    //   1988: return
    //   1989: sipush #243
    //   1992: invokestatic f : (I)I
    //   1995: dup
    //   1996: istore #12
    //   1998: sipush #255
    //   2001: if_icmpeq -> 2055
    //   2004: iload #12
    //   2006: sipush #128
    //   2009: if_icmple -> 2017
    //   2012: sipush #128
    //   2015: istore #12
    //   2017: aload_1
    //   2018: iload_3
    //   2019: bipush #-76
    //   2021: invokestatic e : (II)I
    //   2024: iload_3
    //   2025: bipush #-48
    //   2027: invokestatic e : (II)I
    //   2030: iconst_0
    //   2031: iload #4
    //   2033: iconst_2
    //   2034: isub
    //   2035: iload #10
    //   2037: iload #4
    //   2039: iconst_2
    //   2040: isub
    //   2041: getstatic ef.z : I
    //   2044: iadd
    //   2045: iconst_2
    //   2046: iadd
    //   2047: iload #12
    //   2049: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIIII)V
    //   2052: goto -> 2081
    //   2055: aload_1
    //   2056: iload_3
    //   2057: bipush #-76
    //   2059: invokestatic e : (II)I
    //   2062: invokevirtual setColor : (I)V
    //   2065: aload_1
    //   2066: iconst_0
    //   2067: iload #4
    //   2069: iconst_2
    //   2070: isub
    //   2071: iload #10
    //   2073: getstatic ef.z : I
    //   2076: iconst_2
    //   2077: iadd
    //   2078: invokevirtual drawRect : (IIII)V
    //   2081: iload_3
    //   2082: bipush #-76
    //   2084: invokestatic e : (II)I
    //   2087: invokestatic r : (I)I
    //   2090: istore #11
    //   2092: goto -> 2163
    //   2095: aload_0
    //   2096: invokevirtual getHeight : ()I
    //   2099: iconst_1
    //   2100: isub
    //   2101: getstatic ef.g : I
    //   2104: imul
    //   2105: bipush #100
    //   2107: idiv
    //   2108: dup
    //   2109: istore #10
    //   2111: iconst_1
    //   2112: if_icmpge -> 2116
    //   2115: return
    //   2116: aload_1
    //   2117: iconst_1
    //   2118: invokevirtual setStrokeStyle : (I)V
    //   2121: aload_1
    //   2122: iload_3
    //   2123: invokevirtual setColor : (I)V
    //   2126: aload_0
    //   2127: invokevirtual getWidth : ()I
    //   2130: bipush #24
    //   2132: idiv
    //   2133: istore #13
    //   2135: aload_1
    //   2136: iconst_0
    //   2137: iconst_0
    //   2138: iload #13
    //   2140: iload #10
    //   2142: invokevirtual drawRect : (IIII)V
    //   2145: aload_1
    //   2146: aload_0
    //   2147: invokevirtual getWidth : ()I
    //   2150: iload #13
    //   2152: isub
    //   2153: iconst_1
    //   2154: isub
    //   2155: iconst_0
    //   2156: iload #13
    //   2158: iload #10
    //   2160: invokevirtual drawRect : (IIII)V
    //   2163: aload_1
    //   2164: getstatic ef.f : Ljavax/microedition/lcdui/Font;
    //   2167: iload #11
    //   2169: getstatic ef.A : Ljava/lang/String;
    //   2172: iload #8
    //   2174: aload_0
    //   2175: invokevirtual getHeight : ()I
    //   2178: bipush #33
    //   2180: iconst_1
    //   2181: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;ILjava/lang/String;IIII)V
    //   2184: iload #7
    //   2186: ifeq -> 2208
    //   2189: getstatic ef.E : Li/I;
    //   2192: aload_1
    //   2193: iload #9
    //   2195: aload_0
    //   2196: invokevirtual getHeight : ()I
    //   2199: getstatic ef.z : I
    //   2202: iconst_2
    //   2203: idiv
    //   2204: isub
    //   2205: invokevirtual drawByRight : (Ljavax/microedition/lcdui/Graphics;II)V
    //   2208: aload #5
    //   2210: ifnull -> 2234
    //   2213: aload #5
    //   2215: aload_1
    //   2216: iload #9
    //   2218: iload #7
    //   2220: isub
    //   2221: aload_0
    //   2222: invokevirtual getHeight : ()I
    //   2225: getstatic ef.z : I
    //   2228: iconst_2
    //   2229: idiv
    //   2230: isub
    //   2231: invokevirtual drawByRight : (Ljavax/microedition/lcdui/Graphics;II)V
    //   2234: return
  }
  
  private static boolean a(int paramInt1, int paramInt2) {
    return (a(paramInt1, paramInt2, 0) + a(paramInt1, paramInt2, 8) + a(paramInt1, paramInt2, 16) + a(paramInt1, paramInt2, 24) < 128);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = paramInt1 >> paramInt3 & 0xFF;
    paramInt2 = paramInt2 >> paramInt3 & 0xFF;
    if ((paramInt1 -= paramInt2) < 0)
      paramInt1 = -paramInt1; 
    return paramInt1;
  }
  
  private void a(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint.length >= paramInt * 2 && paramArrayOfint.length % paramInt == 0) {
      this.q = 0;
      this.p = 0;
      int i = paramArrayOfint.length / paramInt;
      boolean bool = true;
      byte b1 = 0;
      for (byte b2 = 0; b2 < paramInt; b2++) {
        int j;
        if ((j = paramArrayOfint[b2 + paramInt]) == paramArrayOfint[b2])
          b1++; 
        if (bool)
          for (byte b = 2; b < i; b++) {
            if (bool && paramArrayOfint[b * paramInt + b2] != j)
              bool = false; 
          }  
      } 
      if (b1 == paramInt)
        bool = false; 
      this.s = bool;
    } 
  }
  
  public final void g() {
    if (this.p >= 0 && this.o != null && this.q == 0) {
      if (this.t != null)
        this.t.cancel(); 
      this.t = new bq(this, this.o[this.p++]);
      if (this.p >= this.o.length)
        this.p = 0; 
    } 
  }
  
  private int a(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    for (byte b = 0; b < paramInt2; b++) {
      if (a(paramArrayOfint[paramInt1 + b], paramInt3))
        i |= 1 << b; 
    } 
    return i;
  }
  
  public static void h() {
    if (D != 8)
      (new Timer()).schedule(new ew(3), 15000L); 
  }
  
  public static void a(String paramString, bg parambg, boolean paramBoolean) {
    if (e != null) {
      e.cancel();
      e = null;
    } 
    B = false;
    ew ew = new ew(parambg);
    b.removeCommand(c);
    if (paramBoolean) {
      b.addCommand(c);
      b.setCommandListener(ew);
    } 
    a(paramString);
    b(0);
    j = false;
    Jimm.d.setCurrent((Displayable)b);
    Jimm.b().schedule(ew, 1000L, 1000L);
  }
  
  public static void i() {
    Jimm.a = u;
    Jimm.a();
    if (Jimm.a() != null)
      k = true; 
  }
  
  static {
    Font.getFont(0, 0, 8);
  }
  
  static {
    try {
      x = Image.createImage("/notice.png");
    } catch (IOException iOException) {}
  }
  
  class bq extends TimerTask {
    private final ef a;
    
    public bq(ef this$0, int param1Int) {
      this.a = this$0;
      if (param1Int > 0)
        (new Timer()).schedule(this, param1Int); 
    }
    
    public final void run() {
      if (Jimm.d.getCurrent() != ef.b || this.a.q != 0)
        return; 
      this.a.g();
      this.a.repaint();
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ef.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */