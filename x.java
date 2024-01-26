import favax.microedition.lcdui.Canvas;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class x extends Canvas implements Runnable, CommandListener, PlayerListener {
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  public Image a;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private boolean g;
  
  private boolean h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  private f a;
  
  public static boolean a;
  
  private static StringBuffer a;
  
  private boolean n;
  
  private int l;
  
  private int m;
  
  public byte a;
  
  private final Font a;
  
  private final int n = this.a.charWidth('0') + ((v.G == '\002') ? 2 : 0);
  
  private int o;
  
  private final Command a;
  
  private final Command b;
  
  private int p;
  
  private int q;
  
  private r a;
  
  private String b;
  
  private String c;
  
  private static int r = 20;
  
  private boolean o;
  
  private Player a;
  
  private VolumeControl a;
  
  public boolean b;
  
  public boolean c;
  
  public static boolean d;
  
  private long a = Font.getFont(32, 0, 16);
  
  public static boolean e;
  
  private f b;
  
  private f c;
  
  public static boolean f;
  
  public static String[] a;
  
  public static String a;
  
  public static int a;
  
  private boolean p;
  
  private String d;
  
  private String e;
  
  private int s;
  
  private int t;
  
  private Font b;
  
  private boolean q;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private int x;
  
  public final void setFullScreenMode(boolean paramBoolean) {
    super.setFullScreenMode((paramBoolean && v.v != null));
  }
  
  private void c() {
    if (v.h == 2) {
      addCommand(this.a = new f("x", 1, 1));
      setCommandListener(this);
    } 
  }
  
  public x(byte paramByte) {
    this.a = new Command(v.d(1), 2, 1);
    this.b = (Font)new Command(v.d(0), 4, 1);
    v.C();
    this.a = v.a(v.a[((v)((af)af.b).a).c]);
    if (this.a == null) {
      int i;
      paramByte = 0;
      do {
        m m;
        i = (m = new m()).a((byte[])null, 0, null.length, 0, true) >> 16;
        try {
          m.a((byte[])null, 0, null.length, paramByte, false);
          this.a = v.a((int[])m.c, m.b, m.a, false);
        } catch (Throwable throwable) {}
        paramByte++;
      } while (this.a == null && i >> paramByte > getWidth());
    } 
    af.b.b(false, (v)((af)af.b).a);
    e();
    if (!(this.g = (v.cB || v.G == '\002')) && (v.h != 2 || (v.h == 2 && v.v != null)))
      setFullScreenMode(true); 
    this.j = true;
    this.q = this.k = this.l = this.i = false;
    c();
  }
  
  public final void paint(Graphics paramGraphics) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Z
    //   4: ifeq -> 53
    //   7: aload_0
    //   8: getfield j : Z
    //   11: ifne -> 28
    //   14: aload_0
    //   15: getfield k : Z
    //   18: ifne -> 28
    //   21: aload_0
    //   22: getfield l : Z
    //   25: ifeq -> 53
    //   28: getstatic v.h : I
    //   31: iconst_2
    //   32: if_icmpne -> 48
    //   35: getstatic v.h : I
    //   38: iconst_2
    //   39: if_icmpne -> 53
    //   42: getstatic v.v : Z
    //   45: ifeq -> 53
    //   48: aload_0
    //   49: iconst_1
    //   50: invokevirtual setFullScreenMode : (Z)V
    //   53: aload_0
    //   54: getfield j : Z
    //   57: ifeq -> 132
    //   60: aload_0
    //   61: getfield h : Z
    //   64: ifne -> 76
    //   67: aload_0
    //   68: invokespecial d : ()V
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield h : Z
    //   76: aload_0
    //   77: getfield a : Ljavax/microedition/lcdui/Image;
    //   80: ifnull -> 123
    //   83: aload_1
    //   84: ldc 16777215
    //   86: invokevirtual setColor : (I)V
    //   89: aload_1
    //   90: iconst_0
    //   91: iconst_0
    //   92: aload_1
    //   93: invokevirtual getClipWidth : ()I
    //   96: aload_1
    //   97: invokevirtual getClipHeight : ()I
    //   100: invokevirtual fillRect : (IIII)V
    //   103: aload_1
    //   104: aload_0
    //   105: getfield a : Ljavax/microedition/lcdui/Image;
    //   108: aload_0
    //   109: getfield d : I
    //   112: aload_0
    //   113: getfield e : I
    //   116: iconst_3
    //   117: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   120: goto -> 1311
    //   123: getstatic af.b : Laf;
    //   126: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   129: goto -> 1311
    //   132: aload_0
    //   133: getfield k : Z
    //   136: ifeq -> 613
    //   139: aload_0
    //   140: getfield l : Z
    //   143: ifne -> 613
    //   146: aload_0
    //   147: getfield c : Z
    //   150: ifeq -> 601
    //   153: aload_0
    //   154: getfield m : Z
    //   157: ifeq -> 164
    //   160: aload_1
    //   161: invokestatic a : (Ljavax/microedition/lcdui/Graphics;)V
    //   164: aload_0
    //   165: getfield c : I
    //   168: iconst_2
    //   169: ishr
    //   170: istore_2
    //   171: getstatic v.b : Ljavax/microedition/lcdui/Font;
    //   174: iconst_0
    //   175: invokestatic a : (Ljavax/microedition/lcdui/Font;Z)I
    //   178: istore_3
    //   179: getstatic af.b : Laf;
    //   182: aload_1
    //   183: iconst_5
    //   184: iload_2
    //   185: aload_0
    //   186: getfield b : I
    //   189: bipush #10
    //   191: isub
    //   192: iload_3
    //   193: iconst_5
    //   194: imul
    //   195: iconst_1
    //   196: iadd
    //   197: iconst_1
    //   198: aload_0
    //   199: getfield m : Z
    //   202: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIIZZ)V
    //   205: aload_0
    //   206: iconst_0
    //   207: putfield m : Z
    //   210: aload_1
    //   211: getstatic v.a : [I
    //   214: bipush #7
    //   216: iaload
    //   217: invokevirtual setColor : (I)V
    //   220: aload_1
    //   221: bipush #6
    //   223: iload_2
    //   224: iinc #2, 1
    //   227: aload_0
    //   228: getfield b : I
    //   231: bipush #12
    //   233: isub
    //   234: iload_3
    //   235: invokevirtual fillRect : (IIII)V
    //   238: aload_1
    //   239: getstatic v.a : [I
    //   242: bipush #47
    //   244: iaload
    //   245: invokevirtual setColor : (I)V
    //   248: aload_1
    //   249: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   252: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   255: aload_0
    //   256: getfield c : Ljava/lang/String;
    //   259: aload_0
    //   260: getfield b : I
    //   263: bipush #14
    //   265: isub
    //   266: iconst_1
    //   267: iconst_1
    //   268: invokestatic a : (Ljavax/microedition/lcdui/Font;Ljava/lang/String;IZZ)Ljava/lang/String;
    //   271: aload_0
    //   272: getfield b : I
    //   275: iconst_1
    //   276: ishr
    //   277: iload_2
    //   278: iload_3
    //   279: iadd
    //   280: dup
    //   281: istore_2
    //   282: bipush #17
    //   284: getstatic v.a : [I
    //   287: bipush #6
    //   289: iaload
    //   290: iconst_0
    //   291: iconst_0
    //   292: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;Ljava/lang/String;IIIIZZ)V
    //   295: iload_2
    //   296: iload_3
    //   297: iconst_2
    //   298: ishl
    //   299: iadd
    //   300: istore #4
    //   302: iconst_1
    //   303: istore #5
    //   305: iload #5
    //   307: iconst_5
    //   308: if_icmpgt -> 397
    //   311: aload_0
    //   312: getfield o : Z
    //   315: ifne -> 362
    //   318: getstatic x.r : I
    //   321: bipush #20
    //   323: idiv
    //   324: iload #5
    //   326: if_icmplt -> 362
    //   329: aload_1
    //   330: bipush #11
    //   332: iload #4
    //   334: iload #5
    //   336: iconst_2
    //   337: ishl
    //   338: isub
    //   339: iconst_1
    //   340: iadd
    //   341: bipush #10
    //   343: iload #5
    //   345: iconst_2
    //   346: ishl
    //   347: getstatic v.a : [I
    //   350: bipush #38
    //   352: iaload
    //   353: getstatic v.a : [I
    //   356: bipush #39
    //   358: iaload
    //   359: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIII)V
    //   362: aload_1
    //   363: getstatic v.a : [I
    //   366: bipush #26
    //   368: iaload
    //   369: invokevirtual setColor : (I)V
    //   372: aload_1
    //   373: bipush #10
    //   375: iload #4
    //   377: iload #5
    //   379: iconst_2
    //   380: ishl
    //   381: isub
    //   382: bipush #10
    //   384: iload #5
    //   386: iconst_2
    //   387: ishl
    //   388: invokevirtual drawRect : (IIII)V
    //   391: iinc #5, 1
    //   394: goto -> 305
    //   397: aload_1
    //   398: getstatic v.a : [I
    //   401: bipush #47
    //   403: iaload
    //   404: invokevirtual setColor : (I)V
    //   407: iload_2
    //   408: iload_3
    //   409: iadd
    //   410: istore_2
    //   411: aload_0
    //   412: getfield a : Ljavax/microedition/media/Player;
    //   415: ifnull -> 449
    //   418: aload_0
    //   419: getfield a : Ljavax/microedition/media/Player;
    //   422: invokeinterface getState : ()I
    //   427: sipush #400
    //   430: if_icmpne -> 449
    //   433: invokestatic currentTimeMillis : ()J
    //   436: aload_0
    //   437: getfield a : J
    //   440: lsub
    //   441: invokestatic c : (J)Ljava/lang/String;
    //   444: astore #5
    //   446: goto -> 453
    //   449: ldc '--.--.--'
    //   451: astore #5
    //   453: aload_1
    //   454: getstatic v.b : Ljavax/microedition/lcdui/Font;
    //   457: aload #5
    //   459: aload_0
    //   460: getfield b : I
    //   463: iconst_1
    //   464: ishr
    //   465: iload_2
    //   466: iload_3
    //   467: iadd
    //   468: bipush #17
    //   470: getstatic v.a : [I
    //   473: iconst_5
    //   474: iaload
    //   475: iconst_0
    //   476: iconst_0
    //   477: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;Ljava/lang/String;IIIIZZ)V
    //   480: getstatic x.a : [Ljava/lang/String;
    //   483: ifnull -> 583
    //   486: getstatic x.a : Ljava/lang/StringBuffer;
    //   489: iconst_0
    //   490: invokevirtual setLength : (I)V
    //   493: getstatic x.a : Ljava/lang/StringBuffer;
    //   496: getstatic x.a : I
    //   499: iconst_1
    //   500: iadd
    //   501: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   504: bipush #47
    //   506: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   509: getstatic x.a : [Ljava/lang/String;
    //   512: arraylength
    //   513: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   516: invokevirtual toString : ()Ljava/lang/String;
    //   519: astore #5
    //   521: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   524: aload #5
    //   526: invokevirtual toCharArray : ()[C
    //   529: invokestatic a : (Ljavax/microedition/lcdui/Font;[C)I
    //   532: istore #6
    //   534: aload_0
    //   535: getfield b : I
    //   538: bipush #10
    //   540: isub
    //   541: iload #6
    //   543: isub
    //   544: bipush #25
    //   546: invokestatic a : (II)I
    //   549: istore #7
    //   551: aload_1
    //   552: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   555: aload #5
    //   557: iload #7
    //   559: iload_2
    //   560: iload_3
    //   561: iadd
    //   562: iload_3
    //   563: iadd
    //   564: bipush #20
    //   566: getstatic v.a : [I
    //   569: iconst_5
    //   570: iaload
    //   571: iconst_0
    //   572: iconst_0
    //   573: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;Ljava/lang/String;IIIIZZ)V
    //   576: getstatic x.a : Ljava/lang/StringBuffer;
    //   579: iconst_0
    //   580: invokevirtual setLength : (I)V
    //   583: getstatic af.b : Laf;
    //   586: aload_1
    //   587: aload_0
    //   588: getfield b : Lf;
    //   591: aload_0
    //   592: getfield c : Lf;
    //   595: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Lf;Lf;)V
    //   598: goto -> 1311
    //   601: invokestatic C : ()V
    //   604: getstatic af.b : Laf;
    //   607: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   610: goto -> 1311
    //   613: aload_0
    //   614: getfield l : Z
    //   617: ifeq -> 662
    //   620: aload_0
    //   621: getfield c : Z
    //   624: ifeq -> 1311
    //   627: aload_0
    //   628: getfield m : Z
    //   631: ifeq -> 654
    //   634: aload_1
    //   635: ldc 16777215
    //   637: invokevirtual setColor : (I)V
    //   640: aload_1
    //   641: iconst_0
    //   642: iconst_0
    //   643: aload_0
    //   644: getfield b : I
    //   647: aload_0
    //   648: getfield c : I
    //   651: invokevirtual fillRect : (IIII)V
    //   654: aload_0
    //   655: iconst_0
    //   656: putfield c : Z
    //   659: goto -> 1311
    //   662: aload_0
    //   663: getfield i : Z
    //   666: ifeq -> 1026
    //   669: aload_0
    //   670: aload_0
    //   671: invokevirtual getHeight : ()I
    //   674: dup_x1
    //   675: putfield c : I
    //   678: iconst_4
    //   679: idiv
    //   680: istore_2
    //   681: aload_0
    //   682: getfield b : I
    //   685: bipush #6
    //   687: aload_0
    //   688: getfield n : I
    //   691: imul
    //   692: isub
    //   693: iconst_1
    //   694: ishr
    //   695: istore_3
    //   696: aload_1
    //   697: ldc 16777215
    //   699: invokevirtual setColor : (I)V
    //   702: aload_1
    //   703: iconst_0
    //   704: iconst_0
    //   705: aload_0
    //   706: getfield b : I
    //   709: aload_0
    //   710: getfield c : I
    //   713: invokevirtual fillRect : (IIII)V
    //   716: aload_1
    //   717: aload_0
    //   718: getfield o : I
    //   721: invokevirtual setColor : (I)V
    //   724: aload_1
    //   725: iconst_2
    //   726: iconst_2
    //   727: aload_0
    //   728: getfield b : I
    //   731: iconst_4
    //   732: isub
    //   733: iload_2
    //   734: invokevirtual fillRect : (IIII)V
    //   737: aload_1
    //   738: iconst_0
    //   739: invokevirtual setColor : (I)V
    //   742: aload_1
    //   743: iconst_0
    //   744: iconst_0
    //   745: aload_0
    //   746: getfield b : I
    //   749: iconst_1
    //   750: isub
    //   751: iload_2
    //   752: iconst_3
    //   753: iadd
    //   754: invokevirtual drawRect : (IIII)V
    //   757: aload_1
    //   758: aload_0
    //   759: getfield o : I
    //   762: iconst_m1
    //   763: ixor
    //   764: invokevirtual setColor : (I)V
    //   767: aload_0
    //   768: getfield o : I
    //   771: invokestatic a : (I)Ljava/lang/String;
    //   774: astore #4
    //   776: aload_0
    //   777: getfield a : Ljavax/microedition/lcdui/Font;
    //   780: aload #4
    //   782: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   785: istore #5
    //   787: aload_1
    //   788: aload #4
    //   790: aload_0
    //   791: getfield b : I
    //   794: iload #5
    //   796: isub
    //   797: iconst_1
    //   798: ishr
    //   799: iload #5
    //   801: iconst_1
    //   802: ishr
    //   803: iadd
    //   804: iload_2
    //   805: iconst_1
    //   806: ishr
    //   807: iconst_2
    //   808: isub
    //   809: bipush #17
    //   811: invokevirtual drawString : (Ljava/lang/String;III)V
    //   814: aload_1
    //   815: aload_0
    //   816: getfield p : I
    //   819: invokevirtual setColor : (I)V
    //   822: aload_1
    //   823: iconst_2
    //   824: iload_2
    //   825: bipush #7
    //   827: iadd
    //   828: aload_0
    //   829: getfield b : I
    //   832: iconst_4
    //   833: isub
    //   834: iload_2
    //   835: invokevirtual fillRect : (IIII)V
    //   838: aload_1
    //   839: iconst_0
    //   840: invokevirtual setColor : (I)V
    //   843: aload_1
    //   844: iconst_0
    //   845: iload_2
    //   846: iconst_5
    //   847: iadd
    //   848: aload_0
    //   849: getfield b : I
    //   852: iconst_1
    //   853: isub
    //   854: iload_2
    //   855: iconst_3
    //   856: iadd
    //   857: invokevirtual drawRect : (IIII)V
    //   860: aload_0
    //   861: getfield p : I
    //   864: invokestatic a : (I)Ljava/lang/String;
    //   867: astore #4
    //   869: iload_2
    //   870: iconst_1
    //   871: ishl
    //   872: iload_2
    //   873: iconst_1
    //   874: ishr
    //   875: iadd
    //   876: istore #5
    //   878: iconst_0
    //   879: istore #7
    //   881: iload #7
    //   883: aload #4
    //   885: invokevirtual length : ()I
    //   888: if_icmpge -> 1023
    //   891: iload #7
    //   893: iconst_2
    //   894: if_icmplt -> 914
    //   897: iload #7
    //   899: iconst_4
    //   900: if_icmplt -> 909
    //   903: sipush #255
    //   906: goto -> 916
    //   909: ldc 65280
    //   911: goto -> 916
    //   914: ldc 16711680
    //   916: istore #6
    //   918: aload_1
    //   919: iload #6
    //   921: invokevirtual setColor : (I)V
    //   924: aload_1
    //   925: aload #4
    //   927: iload #7
    //   929: iconst_1
    //   930: iload_3
    //   931: iload #7
    //   933: aload_0
    //   934: getfield n : I
    //   937: imul
    //   938: iadd
    //   939: iload #5
    //   941: iconst_4
    //   942: iadd
    //   943: bipush #20
    //   945: invokevirtual drawSubstring : (Ljava/lang/String;IIIII)V
    //   948: iload #7
    //   950: aload_0
    //   951: getfield q : I
    //   954: if_icmpne -> 1017
    //   957: aload_1
    //   958: iload #6
    //   960: invokevirtual setColor : (I)V
    //   963: aload_1
    //   964: iload_3
    //   965: iload #7
    //   967: aload_0
    //   968: getfield n : I
    //   971: imul
    //   972: iadd
    //   973: iload #5
    //   975: iconst_1
    //   976: iadd
    //   977: aload_0
    //   978: getfield n : I
    //   981: iconst_3
    //   982: isub
    //   983: iconst_2
    //   984: invokevirtual fillRect : (IIII)V
    //   987: aload_1
    //   988: iload_3
    //   989: iload #7
    //   991: aload_0
    //   992: getfield n : I
    //   995: imul
    //   996: iadd
    //   997: iload #5
    //   999: aload_0
    //   1000: getfield a : Ljavax/microedition/lcdui/Font;
    //   1003: invokevirtual getHeight : ()I
    //   1006: iadd
    //   1007: aload_0
    //   1008: getfield n : I
    //   1011: iconst_3
    //   1012: isub
    //   1013: iconst_2
    //   1014: invokevirtual fillRect : (IIII)V
    //   1017: iinc #7, 1
    //   1020: goto -> 881
    //   1023: goto -> 1311
    //   1026: aload_0
    //   1027: getfield q : Z
    //   1030: ifeq -> 1311
    //   1033: aload_1
    //   1034: ldc 16777215
    //   1036: invokevirtual setColor : (I)V
    //   1039: aload_1
    //   1040: iconst_0
    //   1041: iconst_0
    //   1042: aload_0
    //   1043: invokevirtual getWidth : ()I
    //   1046: aload_0
    //   1047: invokevirtual getHeight : ()I
    //   1050: invokevirtual fillRect : (IIII)V
    //   1053: aload_1
    //   1054: iconst_0
    //   1055: invokevirtual setColor : (I)V
    //   1058: aload_1
    //   1059: aload_0
    //   1060: getfield b : Ljavax/microedition/lcdui/Font;
    //   1063: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   1066: aload_0
    //   1067: getfield b : Ljavax/microedition/lcdui/Font;
    //   1070: invokevirtual getHeight : ()I
    //   1073: istore_2
    //   1074: aload_1
    //   1075: ldc 'Press any key '
    //   1077: aload_0
    //   1078: invokevirtual hasPointerEvents : ()Z
    //   1081: ifeq -> 1089
    //   1084: ldc 'or tap on screen'
    //   1086: goto -> 1091
    //   1089: ldc ''
    //   1091: ldc '...'
    //   1093: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1096: iconst_5
    //   1097: iconst_5
    //   1098: bipush #20
    //   1100: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1103: iconst_5
    //   1104: iload_2
    //   1105: iconst_5
    //   1106: iadd
    //   1107: iadd
    //   1108: istore_3
    //   1109: aload_0
    //   1110: getfield p : Z
    //   1113: ifne -> 1276
    //   1116: aload_1
    //   1117: ldc 'Keycode: '
    //   1119: aload_0
    //   1120: getfield s : I
    //   1123: invokestatic valueOf : (I)Ljava/lang/String;
    //   1126: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1129: iconst_5
    //   1130: iload_3
    //   1131: bipush #20
    //   1133: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1136: iload_3
    //   1137: iload_2
    //   1138: iadd
    //   1139: istore_3
    //   1140: aload_1
    //   1141: ldc 'Label: '
    //   1143: aload_0
    //   1144: getfield e : Ljava/lang/String;
    //   1147: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1150: iconst_5
    //   1151: iload_3
    //   1152: bipush #20
    //   1154: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1157: iload_3
    //   1158: iload_2
    //   1159: iadd
    //   1160: istore_3
    //   1161: aload_1
    //   1162: ldc 'Action: '
    //   1164: aload_0
    //   1165: getfield t : I
    //   1168: invokestatic valueOf : (I)Ljava/lang/String;
    //   1171: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1174: iconst_5
    //   1175: iload_3
    //   1176: bipush #20
    //   1178: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1181: iload_3
    //   1182: iload_2
    //   1183: iconst_5
    //   1184: iadd
    //   1185: iadd
    //   1186: istore_3
    //   1187: aload_1
    //   1188: ldc 'Event: '
    //   1190: aload_0
    //   1191: getfield d : Ljava/lang/String;
    //   1194: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1197: iconst_5
    //   1198: iload_3
    //   1199: bipush #20
    //   1201: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1204: iload_3
    //   1205: iload_2
    //   1206: bipush #10
    //   1208: iadd
    //   1209: iadd
    //   1210: istore_3
    //   1211: aload_0
    //   1212: invokevirtual hasPointerEvents : ()Z
    //   1215: ifeq -> 1266
    //   1218: aload_1
    //   1219: aload_0
    //   1220: getfield u : I
    //   1223: invokestatic valueOf : (I)Ljava/lang/String;
    //   1226: ldc ';'
    //   1228: aload_0
    //   1229: getfield v : I
    //   1232: invokestatic valueOf : (I)Ljava/lang/String;
    //   1235: ldc ' : '
    //   1237: aload_0
    //   1238: getfield w : I
    //   1241: invokestatic valueOf : (I)Ljava/lang/String;
    //   1244: ldc ';'
    //   1246: aload_0
    //   1247: getfield x : I
    //   1250: invokestatic valueOf : (I)Ljava/lang/String;
    //   1253: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1256: iconst_5
    //   1257: iload_3
    //   1258: bipush #20
    //   1260: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1263: goto -> 1276
    //   1266: aload_1
    //   1267: ldc '-no pointer events...'
    //   1269: iconst_5
    //   1270: iload_3
    //   1271: bipush #20
    //   1273: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1276: iload_3
    //   1277: iload_2
    //   1278: iconst_5
    //   1279: iadd
    //   1280: iadd
    //   1281: istore_3
    //   1282: aload_1
    //   1283: ldc 'Press 0 '
    //   1285: aload_0
    //   1286: invokevirtual hasPointerEvents : ()Z
    //   1289: ifeq -> 1297
    //   1292: ldc 'or double tap '
    //   1294: goto -> 1299
    //   1297: ldc ''
    //   1299: ldc 'to quit.'
    //   1301: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1304: iconst_5
    //   1305: iload_3
    //   1306: bipush #20
    //   1308: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1311: aload_0
    //   1312: getfield g : Z
    //   1315: ifeq -> 1331
    //   1318: aload_0
    //   1319: iconst_0
    //   1320: putfield g : Z
    //   1323: aload_0
    //   1324: invokespecial d : ()V
    //   1327: aload_0
    //   1328: invokevirtual repaint : ()V
    //   1331: return
    //   1332: pop
    //   1333: return
    // Exception table:
    //   from	to	target	type
    //   53	1331	1332	java/lang/Throwable
  }
  
  private void d() {
    this.b = getWidth();
    this.c = getHeight();
    this.f = this.b / 6;
    this.g = this.c / 6;
    this.d = this.b >> 1;
    this.e = this.c >> 1;
  }
  
  private void e() {
    if (this.a != null) {
      this.h = this.a.getWidth();
      this.i = this.h >> 1;
      this.j = this.a.getHeight();
      this.k = this.j >> 1;
    } 
  }
  
  private void a(int paramInt) {
    this.d += paramInt;
    if (paramInt > 0) {
      if (this.d - this.i > 0) {
        this.d = this.i;
        return;
      } 
    } else if (this.d + this.i < this.b) {
      this.d = this.b - this.i;
    } 
  }
  
  private void b(int paramInt) {
    this.e += paramInt;
    if (paramInt > 0) {
      if (this.e - this.k > 0) {
        this.e = this.k;
        return;
      } 
    } else if (this.e + this.k < this.c) {
      this.e = this.c - this.k;
    } 
  }
  
  private void c(int paramInt) {
    switch (paramInt = af.b.b(paramInt)) {
      case 6:
        if (this.c < this.j) {
          b(-this.g);
          break;
        } 
        return;
      case 1:
        if (this.c < this.j) {
          b(this.g);
          break;
        } 
        return;
      case 2:
        if (this.b < this.h) {
          a(this.f);
          break;
        } 
        return;
      case 5:
        if (this.b < this.h) {
          a(-this.f);
          break;
        } 
        return;
      case 8:
        this.d = this.b >> 1;
        this.e = this.c >> 1;
        break;
      case -7:
      case -6:
        this.a = null;
        v.a((Displayable)af.b);
        break;
      default:
        if (paramInt == 42) {
          d();
          try {
            if (this.a.getHeight() > this.a.getWidth()) {
              this.a = v.a(this.a, 0, getHeight(), 0);
            } else {
              paramInt = this.a.getHeight() * getWidth() / this.a.getWidth();
              this.a = v.a(this.a, 0, paramInt, 0);
            } 
            e();
          } catch (Throwable throwable) {
            System.gc();
          } 
          break;
        } 
        this.a = null;
        v.a((Displayable)af.b);
        break;
    } 
    repaint();
  }
  
  public final void feyPressed(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Z
    //   4: ifne -> 14
    //   7: aload_0
    //   8: getfield l : Z
    //   11: ifeq -> 21
    //   14: getstatic x.d : Z
    //   17: ifeq -> 21
    //   20: return
    //   21: invokestatic r : ()V
    //   24: getstatic af.b : Laf;
    //   27: iload_1
    //   28: invokevirtual a : (I)I
    //   31: istore_2
    //   32: getstatic af.b : Laf;
    //   35: ldc2_w -1
    //   38: putfield d : J
    //   41: aload_0
    //   42: getfield j : Z
    //   45: ifeq -> 54
    //   48: aload_0
    //   49: iload_1
    //   50: invokespecial c : (I)V
    //   53: return
    //   54: aload_0
    //   55: getfield k : Z
    //   58: ifne -> 68
    //   61: aload_0
    //   62: getfield l : Z
    //   65: ifeq -> 445
    //   68: aload_0
    //   69: getfield a : Ljavax/microedition/media/Player;
    //   72: ifnonnull -> 87
    //   75: iload_2
    //   76: bipush #-6
    //   78: if_icmpeq -> 87
    //   81: iload_2
    //   82: bipush #-7
    //   84: if_icmpne -> 445
    //   87: aload_0
    //   88: getfield a : Ljavax/microedition/media/Player;
    //   91: ifnull -> 324
    //   94: aload_0
    //   95: getfield a : Ljavax/microedition/media/Player;
    //   98: invokeinterface getState : ()I
    //   103: sipush #400
    //   106: if_icmpne -> 324
    //   109: aload_0
    //   110: getfield a : Ljavax/microedition/media/control/VolumeControl;
    //   113: ifnull -> 324
    //   116: iload_2
    //   117: iconst_1
    //   118: if_icmpne -> 176
    //   121: aload_0
    //   122: getfield a : Ljavax/microedition/media/control/VolumeControl;
    //   125: aload_0
    //   126: iconst_0
    //   127: dup_x1
    //   128: putfield o : Z
    //   131: invokeinterface setMute : (Z)V
    //   136: getstatic x.r : I
    //   139: bipush #80
    //   141: if_icmpgt -> 320
    //   144: aload_0
    //   145: getfield o : Z
    //   148: ifne -> 320
    //   151: getstatic x.r : I
    //   154: bipush #20
    //   156: iadd
    //   157: putstatic x.r : I
    //   160: aload_0
    //   161: getfield a : Ljavax/microedition/media/control/VolumeControl;
    //   164: getstatic x.r : I
    //   167: invokeinterface setLevel : (I)I
    //   172: pop
    //   173: goto -> 320
    //   176: iload_2
    //   177: bipush #6
    //   179: if_icmpne -> 237
    //   182: aload_0
    //   183: getfield a : Ljavax/microedition/media/control/VolumeControl;
    //   186: aload_0
    //   187: iconst_0
    //   188: dup_x1
    //   189: putfield o : Z
    //   192: invokeinterface setMute : (Z)V
    //   197: getstatic x.r : I
    //   200: bipush #20
    //   202: if_icmplt -> 320
    //   205: aload_0
    //   206: getfield o : Z
    //   209: ifne -> 320
    //   212: getstatic x.r : I
    //   215: bipush #20
    //   217: isub
    //   218: putstatic x.r : I
    //   221: aload_0
    //   222: getfield a : Ljavax/microedition/media/control/VolumeControl;
    //   225: getstatic x.r : I
    //   228: invokeinterface setLevel : (I)I
    //   233: pop
    //   234: goto -> 320
    //   237: iload_2
    //   238: bipush #8
    //   240: if_icmpne -> 275
    //   243: aload_0
    //   244: aload_0
    //   245: getfield o : Z
    //   248: ifne -> 255
    //   251: iconst_1
    //   252: goto -> 256
    //   255: iconst_0
    //   256: putfield o : Z
    //   259: aload_0
    //   260: getfield a : Ljavax/microedition/media/control/VolumeControl;
    //   263: aload_0
    //   264: getfield o : Z
    //   267: invokeinterface setMute : (Z)V
    //   272: goto -> 320
    //   275: iload_2
    //   276: iconst_2
    //   277: if_icmpne -> 299
    //   280: getstatic v.a : [Lai;
    //   283: getstatic af.b : Laf;
    //   286: getfield a : Lv;
    //   289: getfield c : B
    //   292: aaload
    //   293: invokevirtual q : ()V
    //   296: goto -> 320
    //   299: iload_2
    //   300: iconst_5
    //   301: if_icmpne -> 320
    //   304: getstatic v.a : [Lai;
    //   307: getstatic af.b : Laf;
    //   310: getfield a : Lv;
    //   313: getfield c : B
    //   316: aaload
    //   317: invokevirtual p : ()V
    //   320: aload_0
    //   321: invokevirtual repaint : ()V
    //   324: iload_2
    //   325: bipush #-6
    //   327: if_icmpeq -> 336
    //   330: iload_2
    //   331: bipush #-7
    //   333: if_icmpne -> 592
    //   336: aload_0
    //   337: getfield l : Z
    //   340: ifne -> 411
    //   343: getstatic af.b : Laf;
    //   346: invokevirtual b : ()Z
    //   349: ifeq -> 364
    //   352: getstatic af.b : Laf;
    //   355: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   358: getstatic af.b : Laf;
    //   361: invokevirtual repaint : ()V
    //   364: iload_2
    //   365: bipush #-7
    //   367: if_icmpne -> 382
    //   370: iconst_1
    //   371: putstatic x.e : Z
    //   374: aconst_null
    //   375: putstatic x.a : [Ljava/lang/String;
    //   378: aload_0
    //   379: invokevirtual a : ()V
    //   382: getstatic af.b : Laf;
    //   385: invokevirtual d : ()V
    //   388: aload_0
    //   389: iconst_0
    //   390: putfield c : Z
    //   393: iload_2
    //   394: bipush #-6
    //   396: if_icmpne -> 403
    //   399: iconst_1
    //   400: goto -> 404
    //   403: iconst_0
    //   404: putstatic x.d : Z
    //   407: invokestatic C : ()V
    //   410: return
    //   411: iconst_1
    //   412: putstatic x.e : Z
    //   415: aconst_null
    //   416: putstatic x.a : [Ljava/lang/String;
    //   419: aload_0
    //   420: invokevirtual a : ()V
    //   423: getstatic af.b : Laf;
    //   426: invokevirtual b : ()Z
    //   429: ifeq -> 444
    //   432: getstatic af.b : Laf;
    //   435: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   438: getstatic af.b : Laf;
    //   441: invokevirtual repaint : ()V
    //   444: return
    //   445: aload_0
    //   446: getfield i : Z
    //   449: ifeq -> 557
    //   452: iload_2
    //   453: iconst_2
    //   454: if_icmpeq -> 462
    //   457: iload_2
    //   458: iconst_5
    //   459: if_icmpne -> 490
    //   462: aload_0
    //   463: aload_0
    //   464: getfield q : I
    //   467: iload_2
    //   468: iconst_2
    //   469: if_icmpeq -> 476
    //   472: iconst_1
    //   473: goto -> 477
    //   476: iconst_m1
    //   477: iadd
    //   478: bipush #6
    //   480: iadd
    //   481: bipush #6
    //   483: irem
    //   484: putfield q : I
    //   487: goto -> 552
    //   490: iload_2
    //   491: iconst_1
    //   492: if_icmpeq -> 501
    //   495: iload_2
    //   496: bipush #6
    //   498: if_icmpne -> 552
    //   501: ldc 1048576
    //   503: aload_0
    //   504: getfield q : I
    //   507: iconst_2
    //   508: ishl
    //   509: ishr
    //   510: istore_1
    //   511: ldc 15728640
    //   513: aload_0
    //   514: getfield q : I
    //   517: iconst_2
    //   518: ishl
    //   519: ishr
    //   520: istore_3
    //   521: aload_0
    //   522: aload_0
    //   523: getfield p : I
    //   526: iload_3
    //   527: iconst_m1
    //   528: ixor
    //   529: iand
    //   530: aload_0
    //   531: getfield p : I
    //   534: iload_2
    //   535: iconst_1
    //   536: if_icmpeq -> 544
    //   539: iload_1
    //   540: ineg
    //   541: goto -> 545
    //   544: iload_1
    //   545: iadd
    //   546: iload_3
    //   547: iand
    //   548: ior
    //   549: putfield p : I
    //   552: aload_0
    //   553: invokevirtual repaint : ()V
    //   556: return
    //   557: aload_0
    //   558: getfield q : Z
    //   561: ifeq -> 592
    //   564: iload_1
    //   565: bipush #48
    //   567: if_icmpne -> 577
    //   570: getstatic af.b : Laf;
    //   573: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   576: return
    //   577: aload_0
    //   578: ldc 'pressed'
    //   580: putfield d : Ljava/lang/String;
    //   583: aload_0
    //   584: iload_1
    //   585: invokespecial d : (I)V
    //   588: aload_0
    //   589: invokevirtual repaint : ()V
    //   592: return
  }
  
  public final void feyReleased(int paramInt) {
    if (this.q) {
      this.d = "released";
      d(paramInt);
      repaint();
      return;
    } 
    ((af)af.b).d = -1L;
    if (af.v && hasPointerEvents() && (paramInt == 112 || paramInt == 113))
      feyPressed(-6); 
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2) {
    if ((this.j || this.k) && paramInt2 > getHeight() - ((af)af.b).d)
      feyPressed(-6); 
    this.u = paramInt1;
    this.v = paramInt2;
    this.w = paramInt1;
    this.x = paramInt2;
    if (this.q) {
      this.p = false;
      repaint();
    } 
    if (!this.j && !this.q)
      return; 
    if (this.n == 0) {
      this.l = paramInt1;
      this.m = paramInt2;
      this.n = 1;
    } 
    this.a = (byte)(this.a + 1);
    if (this.a == 0) {
      ((af)af.b).c = (Command)new l(37);
      ((l)((af)af.b).c).a = this;
      ((af)af.b).a.schedule((TimerTask)((af)af.b).c, 1000L);
      return;
    } 
    if (this.a == 2) {
      if (this.q) {
        v.a((Displayable)af.b);
      } else {
        c(42);
      } 
      this.a = 0;
      af.b.p();
    } 
  }
  
  public final void pointerReleased(int paramInt1, int paramInt2) {
    this.n = 0;
    this.w = paramInt1;
    this.x = paramInt2;
    if (this.q)
      repaint(); 
  }
  
  public final void pointerDragged(int paramInt1, int paramInt2) {
    this.w = paramInt1;
    this.x = paramInt2;
    if (this.q) {
      repaint();
      return;
    } 
    if (this.n != 0) {
      if (this.l > paramInt1 && this.b < this.h) {
        a(-(this.l - paramInt1));
      } else if (paramInt1 > this.l && this.b < this.h) {
        a(paramInt1 - this.l);
      } 
      if (this.m > paramInt2 && this.c < this.j) {
        b(-(this.m - paramInt2));
      } else if (paramInt2 > this.m && this.c < this.j) {
        b(paramInt2 - this.m);
      } 
      this.l = paramInt1;
      this.m = paramInt2;
      repaint();
    } 
  }
  
  public x(int paramInt, String paramString, r paramr) {
    this.a = new Command(v.d(1), 2, 1);
    this.b = (Font)new Command(v.d(0), 4, 1);
    setFullScreenMode(false);
    addCommand((Command)this.b);
    addCommand(this.a);
    setCommandListener(this);
    this.p = this.o = paramInt;
    this.a = paramr;
    d();
    this.i = true;
    this.q = this.k = this.l = this.j = false;
    setTitle(paramString);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Z
    //   4: ifne -> 15
    //   7: aload_1
    //   8: aload_0
    //   9: getfield a : Lf;
    //   12: if_acmpne -> 22
    //   15: aload_0
    //   16: bipush #-6
    //   18: invokevirtual feyPressed : (I)V
    //   21: return
    //   22: aload_0
    //   23: getfield a : Lr;
    //   26: ifnonnull -> 82
    //   29: aload_1
    //   30: aload_0
    //   31: getfield a : Ljavax/microedition/lcdui/Command;
    //   34: if_acmpne -> 47
    //   37: getstatic af.b : Laf;
    //   40: sipush #17235
    //   43: invokevirtual b : (I)V
    //   46: return
    //   47: aload_1
    //   48: aload_0
    //   49: getfield b : Ljavax/microedition/lcdui/Command;
    //   52: if_acmpne -> 142
    //   55: getstatic v.b : [I
    //   58: getstatic af.b : Laf;
    //   61: getfield a : Lv;
    //   64: getfield bz : I
    //   67: aload_0
    //   68: getfield p : I
    //   71: iastore
    //   72: getstatic af.b : Laf;
    //   75: sipush #17235
    //   78: invokevirtual b : (I)V
    //   81: return
    //   82: aload_0
    //   83: getfield a : Lr;
    //   86: ifnull -> 142
    //   89: aload_1
    //   90: aload_0
    //   91: getfield a : Ljavax/microedition/lcdui/Command;
    //   94: if_acmpne -> 105
    //   97: aload_0
    //   98: getfield a : Lr;
    //   101: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   104: return
    //   105: aload_1
    //   106: aload_0
    //   107: getfield b : Ljavax/microedition/lcdui/Command;
    //   110: if_acmpne -> 142
    //   113: aload_0
    //   114: getfield a : Lr;
    //   117: ldc '#'
    //   119: aload_0
    //   120: getfield p : I
    //   123: invokestatic a : (I)Ljava/lang/String;
    //   126: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   129: getstatic v.bT : Z
    //   132: invokevirtual b : (Ljava/lang/String;Z)V
    //   135: aload_0
    //   136: getfield a : Lr;
    //   139: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   142: return
  }
  
  public x(boolean paramBoolean1, String paramString, boolean paramBoolean2) {
    this.a = new Command(v.d(1), 2, 1);
    this.b = (Font)new Command(v.d(0), 4, 1);
    a = 1;
    if (paramString == null || paramString.length() < 4)
      return; 
    if (paramBoolean2 && !(this.g = paramBoolean1) && (v.h != 2 || (v.h == 2 && v.v != null)))
      setFullScreenMode(true); 
    d();
    this.b = (Font)paramString;
    this.c = (f)paramString.substring(paramString.lastIndexOf('/') + 1);
    this.k = true;
    this.l = ai.c((String)this.c);
    this.q = this.j = this.i = false;
    this.a = null;
    this.b = (Font)(this.c = paramBoolean2);
    if (d != null)
      this.c = false; 
    this.b = (Font)af.a[46];
    this.c = (f)af.a[3];
    if (paramBoolean2)
      c(); 
    e = Character.MIN_VALUE;
    a = new StringBuffer();
    v.a(this);
  }
  
  public final void run() {
    // Byte code:
    //   0: getstatic x.e : Z
    //   3: ifeq -> 11
    //   6: aconst_null
    //   7: putstatic x.a : [Ljava/lang/String;
    //   10: return
    //   11: ldc ''
    //   13: astore_1
    //   14: aconst_null
    //   15: astore_2
    //   16: aconst_null
    //   17: astore_3
    //   18: iconst_1
    //   19: putstatic x.f : Z
    //   22: aload_0
    //   23: invokevirtual a : ()V
    //   26: getstatic v.bd : I
    //   29: iconst_4
    //   30: if_icmpne -> 41
    //   33: new java/lang/Exception
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: athrow
    //   41: aload_0
    //   42: aload_0
    //   43: getfield b : Ljava/lang/String;
    //   46: invokestatic createPlayer : (Ljava/lang/String;)Ljavax/microedition/media/Player;
    //   49: putfield a : Ljavax/microedition/media/Player;
    //   52: goto -> 439
    //   55: astore_3
    //   56: aload_0
    //   57: getfield b : Ljava/lang/String;
    //   60: ldc 'seq://'
    //   62: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   65: ifeq -> 74
    //   68: ldc 'audio/x-tone-seq'
    //   70: astore_3
    //   71: goto -> 390
    //   74: aload_3
    //   75: invokevirtual toString : ()Ljava/lang/String;
    //   78: astore_1
    //   79: aload_0
    //   80: getfield c : Ljava/lang/String;
    //   83: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
    //   86: dup
    //   87: astore #4
    //   89: ldc '.wav'
    //   91: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   94: ifne -> 107
    //   97: aload #4
    //   99: ldc '.wave'
    //   101: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   104: ifeq -> 113
    //   107: ldc 'audio/x-wav'
    //   109: astore_3
    //   110: goto -> 359
    //   113: aload #4
    //   115: ldc '.mp3'
    //   117: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   120: ifeq -> 129
    //   123: ldc 'audio/mpeg'
    //   125: astore_3
    //   126: goto -> 359
    //   129: aload #4
    //   131: ldc '.mid'
    //   133: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   136: ifne -> 159
    //   139: aload #4
    //   141: ldc '.midi'
    //   143: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   146: ifne -> 159
    //   149: aload #4
    //   151: ldc '.kar'
    //   153: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   156: ifeq -> 165
    //   159: ldc 'audio/midi'
    //   161: astore_3
    //   162: goto -> 359
    //   165: aload #4
    //   167: ldc '.amr'
    //   169: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   172: ifeq -> 181
    //   175: ldc 'audio/amr'
    //   177: astore_3
    //   178: goto -> 359
    //   181: aload #4
    //   183: ldc '.mmf'
    //   185: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   188: ifeq -> 197
    //   191: ldc 'audio/mmf'
    //   193: astore_3
    //   194: goto -> 359
    //   197: aload #4
    //   199: ldc '.imy'
    //   201: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   204: ifeq -> 213
    //   207: ldc 'audio/imy'
    //   209: astore_3
    //   210: goto -> 359
    //   213: aload #4
    //   215: ldc '.bas'
    //   217: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   220: ifeq -> 229
    //   223: ldc 'audio/bas'
    //   225: astore_3
    //   226: goto -> 359
    //   229: aload #4
    //   231: ldc '.m4a'
    //   233: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   236: ifeq -> 245
    //   239: ldc 'audio/x-m4a'
    //   241: astore_3
    //   242: goto -> 359
    //   245: aload #4
    //   247: ldc '.aac'
    //   249: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   252: ifeq -> 261
    //   255: ldc 'audio/x-aac'
    //   257: astore_3
    //   258: goto -> 359
    //   261: aload #4
    //   263: ldc '.jts'
    //   265: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   268: ifeq -> 277
    //   271: ldc 'audio/x-tone-seq'
    //   273: astore_3
    //   274: goto -> 359
    //   277: aload #4
    //   279: ldc '.3gp'
    //   281: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   284: ifeq -> 293
    //   287: ldc 'video/3gpp'
    //   289: astore_3
    //   290: goto -> 359
    //   293: aload #4
    //   295: ldc '.mpg'
    //   297: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   300: ifne -> 313
    //   303: aload #4
    //   305: ldc '.mp4'
    //   307: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   310: ifeq -> 319
    //   313: ldc 'video/mp4'
    //   315: astore_3
    //   316: goto -> 359
    //   319: aload_0
    //   320: iconst_0
    //   321: putfield c : Z
    //   324: aconst_null
    //   325: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   328: pop
    //   329: aload_0
    //   330: getfield b : Z
    //   333: ifeq -> 343
    //   336: iconst_0
    //   337: invokestatic e : (Z)V
    //   340: goto -> 347
    //   343: aload_0
    //   344: invokevirtual a : ()V
    //   347: aload_0
    //   348: getfield b : Z
    //   351: ifeq -> 358
    //   354: iconst_0
    //   355: putstatic x.f : Z
    //   358: return
    //   359: aload_0
    //   360: invokevirtual a : ()V
    //   363: getstatic v.a : [Lag;
    //   366: getstatic af.b : Laf;
    //   369: getfield a : Lv;
    //   372: getfield c : B
    //   375: aaload
    //   376: aload_0
    //   377: getfield b : Ljava/lang/String;
    //   380: bipush #8
    //   382: invokevirtual substring : (I)Ljava/lang/String;
    //   385: invokeinterface a : (Ljava/lang/String;)V
    //   390: ldc 'audio/x-tone-seq'
    //   392: aload_3
    //   393: invokevirtual equals : (Ljava/lang/Object;)Z
    //   396: ifeq -> 411
    //   399: aload_0
    //   400: ldc 'device://tone'
    //   402: invokestatic createPlayer : (Ljava/lang/String;)Ljavax/microedition/media/Player;
    //   405: putfield a : Ljavax/microedition/media/Player;
    //   408: goto -> 439
    //   411: getstatic v.a : [Lag;
    //   414: getstatic af.b : Laf;
    //   417: getfield a : Lv;
    //   420: getfield c : B
    //   423: aaload
    //   424: invokeinterface a : ()Ljava/io/InputStream;
    //   429: astore_2
    //   430: aload_0
    //   431: aload_2
    //   432: aload_3
    //   433: invokestatic createPlayer : (Ljava/io/InputStream;Ljava/lang/String;)Ljavax/microedition/media/Player;
    //   436: putfield a : Ljavax/microedition/media/Player;
    //   439: aload_0
    //   440: getfield a : Ljavax/microedition/media/Player;
    //   443: invokeinterface realize : ()V
    //   448: aload_0
    //   449: getfield a : Ljavax/microedition/media/Player;
    //   452: aload_0
    //   453: invokeinterface addPlayerListener : (Ljavax/microedition/media/PlayerListener;)V
    //   458: ldc 'audio/x-tone-seq'
    //   460: aload_3
    //   461: invokevirtual equals : (Ljava/lang/Object;)Z
    //   464: ifeq -> 539
    //   467: aload_0
    //   468: getfield a : Ljavax/microedition/media/Player;
    //   471: ldc 'ToneControl'
    //   473: invokeinterface getControl : (Ljava/lang/String;)Ljavax/microedition/media/Control;
    //   478: checkcast javax/microedition/media/control/ToneControl
    //   481: astore_3
    //   482: aload_0
    //   483: getfield b : Ljava/lang/String;
    //   486: ldc 'seq://'
    //   488: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   491: ifeq -> 515
    //   494: aload_3
    //   495: aload_0
    //   496: getfield b : Ljava/lang/String;
    //   499: bipush #6
    //   501: invokevirtual substring : (I)Ljava/lang/String;
    //   504: invokestatic b : (Ljava/lang/String;)[B
    //   507: invokeinterface setSequence : ([B)V
    //   512: goto -> 539
    //   515: aload_3
    //   516: getstatic v.a : [Lag;
    //   519: getstatic af.b : Laf;
    //   522: getfield a : Lv;
    //   525: getfield c : B
    //   528: aaload
    //   529: invokeinterface a : ()[B
    //   534: invokeinterface setSequence : ([B)V
    //   539: aload_0
    //   540: aload_0
    //   541: iconst_1
    //   542: dup_x1
    //   543: putfield c : Z
    //   546: putfield m : Z
    //   549: aload_0
    //   550: getfield b : Z
    //   553: ifeq -> 676
    //   556: aload_0
    //   557: getfield l : Z
    //   560: ifeq -> 676
    //   563: aload_0
    //   564: getfield a : Ljavax/microedition/media/Player;
    //   567: ldc 'VideoControl'
    //   569: invokeinterface getControl : (Ljava/lang/String;)Ljavax/microedition/media/Control;
    //   574: checkcast javax/microedition/media/control/VideoControl
    //   577: dup
    //   578: astore_3
    //   579: ifnull -> 676
    //   582: getstatic v.w : Z
    //   585: ifne -> 600
    //   588: aload_3
    //   589: iconst_1
    //   590: aload_0
    //   591: invokeinterface initDisplayMode : (ILjava/lang/Object;)Ljava/lang/Object;
    //   596: pop
    //   597: goto -> 676
    //   600: new javax/microedition/lcdui/Form
    //   603: dup
    //   604: aload_0
    //   605: getfield c : Ljava/lang/String;
    //   608: invokespecial <init> : (Ljava/lang/String;)V
    //   611: astore #4
    //   613: aload_3
    //   614: iconst_0
    //   615: aconst_null
    //   616: invokeinterface initDisplayMode : (ILjava/lang/Object;)Ljava/lang/Object;
    //   621: checkcast javax/microedition/lcdui/Item
    //   624: dup
    //   625: astore_3
    //   626: iconst_3
    //   627: invokevirtual setLayout : (I)V
    //   630: aload #4
    //   632: aload_3
    //   633: invokevirtual append : (Ljavax/microedition/lcdui/Item;)I
    //   636: pop
    //   637: aload #4
    //   639: new javax/microedition/lcdui/Command
    //   642: dup
    //   643: iconst_4
    //   644: invokestatic d : (I)Ljava/lang/String;
    //   647: iconst_2
    //   648: iconst_2
    //   649: invokespecial <init> : (Ljava/lang/String;II)V
    //   652: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   655: aload #4
    //   657: aload_0
    //   658: invokevirtual setCommandListener : (Ljavax/microedition/lcdui/CommandListener;)V
    //   661: aload #4
    //   663: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   666: aload_0
    //   667: aload_0
    //   668: iconst_0
    //   669: dup_x1
    //   670: putfield c : Z
    //   673: putfield m : Z
    //   676: aload_0
    //   677: aload_0
    //   678: getfield a : Ljavax/microedition/media/Player;
    //   681: ldc 'VolumeControl'
    //   683: invokeinterface getControl : (Ljava/lang/String;)Ljavax/microedition/media/Control;
    //   688: checkcast javax/microedition/media/control/VolumeControl
    //   691: putfield a : Ljavax/microedition/media/control/VolumeControl;
    //   694: aload_0
    //   695: getfield b : Z
    //   698: ifne -> 717
    //   701: aload_0
    //   702: getfield a : Ljavax/microedition/media/control/VolumeControl;
    //   705: getstatic w.f : I
    //   708: invokeinterface setLevel : (I)I
    //   713: pop
    //   714: goto -> 730
    //   717: aload_0
    //   718: getfield a : Ljavax/microedition/media/control/VolumeControl;
    //   721: getstatic x.r : I
    //   724: invokeinterface setLevel : (I)I
    //   729: pop
    //   730: aload_0
    //   731: invokestatic currentTimeMillis : ()J
    //   734: putfield a : J
    //   737: aload_0
    //   738: getfield b : Z
    //   741: ifeq -> 765
    //   744: aload_0
    //   745: getfield c : Z
    //   748: ifeq -> 765
    //   751: getstatic x.d : Z
    //   754: ifne -> 765
    //   757: aload_0
    //   758: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   761: aload_0
    //   762: invokevirtual repaint : ()V
    //   765: aload_0
    //   766: getfield a : Ljavax/microedition/media/Player;
    //   769: invokeinterface prefetch : ()V
    //   774: goto -> 778
    //   777: pop
    //   778: aload_0
    //   779: getfield a : Ljavax/microedition/media/Player;
    //   782: invokeinterface start : ()V
    //   787: aload_0
    //   788: getfield b : Z
    //   791: ifeq -> 818
    //   794: aload_0
    //   795: getfield c : Z
    //   798: ifeq -> 818
    //   801: aload_0
    //   802: getfield l : Z
    //   805: ifne -> 818
    //   808: getstatic x.d : Z
    //   811: ifne -> 818
    //   814: aload_0
    //   815: invokevirtual repaint : ()V
    //   818: aload_0
    //   819: getfield a : Ljavax/microedition/media/Player;
    //   822: ifnull -> 853
    //   825: aload_0
    //   826: getfield a : Ljavax/microedition/media/Player;
    //   829: invokeinterface getState : ()I
    //   834: sipush #400
    //   837: if_icmpne -> 853
    //   840: ldc2_w 250
    //   843: invokestatic sleep : (J)V
    //   846: goto -> 787
    //   849: pop
    //   850: goto -> 787
    //   853: aload_0
    //   854: iconst_0
    //   855: putfield c : Z
    //   858: aload_2
    //   859: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   862: pop
    //   863: aload_0
    //   864: getfield b : Z
    //   867: ifeq -> 877
    //   870: iconst_0
    //   871: invokestatic e : (Z)V
    //   874: goto -> 881
    //   877: aload_0
    //   878: invokevirtual a : ()V
    //   881: aload_0
    //   882: getfield b : Z
    //   885: ifeq -> 1030
    //   888: iconst_0
    //   889: putstatic x.f : Z
    //   892: goto -> 1030
    //   895: astore_3
    //   896: aload_1
    //   897: ldc '>>'
    //   899: aload_3
    //   900: invokevirtual toString : ()Ljava/lang/String;
    //   903: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   906: dup
    //   907: astore_1
    //   908: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   911: ldc 'unsupported'
    //   913: invokevirtual indexOf : (Ljava/lang/String;)I
    //   916: iconst_m1
    //   917: if_icmpeq -> 939
    //   920: sipush #686
    //   923: invokestatic d : (I)Ljava/lang/String;
    //   926: ldc '\\n'
    //   928: sipush #688
    //   931: invokestatic d : (I)Ljava/lang/String;
    //   934: aload_1
    //   935: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   938: astore_1
    //   939: getstatic af.b : Laf;
    //   942: aload_1
    //   943: invokevirtual c : (Ljava/lang/String;)V
    //   946: aload_0
    //   947: iconst_0
    //   948: putfield c : Z
    //   951: aload_2
    //   952: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   955: pop
    //   956: aload_0
    //   957: getfield b : Z
    //   960: ifeq -> 970
    //   963: iconst_0
    //   964: invokestatic e : (Z)V
    //   967: goto -> 974
    //   970: aload_0
    //   971: invokevirtual a : ()V
    //   974: aload_0
    //   975: getfield b : Z
    //   978: ifeq -> 1030
    //   981: iconst_0
    //   982: putstatic x.f : Z
    //   985: goto -> 1030
    //   988: astore_1
    //   989: aload_0
    //   990: iconst_0
    //   991: putfield c : Z
    //   994: aload_2
    //   995: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   998: pop
    //   999: aload_0
    //   1000: getfield b : Z
    //   1003: ifeq -> 1013
    //   1006: iconst_0
    //   1007: invokestatic e : (Z)V
    //   1010: goto -> 1017
    //   1013: aload_0
    //   1014: invokevirtual a : ()V
    //   1017: aload_0
    //   1018: getfield b : Z
    //   1021: ifeq -> 1028
    //   1024: iconst_0
    //   1025: putstatic x.f : Z
    //   1028: aload_1
    //   1029: athrow
    //   1030: getstatic x.a : [Ljava/lang/String;
    //   1033: ifnull -> 1077
    //   1036: getstatic x.e : Z
    //   1039: ifne -> 1077
    //   1042: aload_0
    //   1043: getfield b : Z
    //   1046: ifeq -> 1077
    //   1049: getstatic v.bX : Z
    //   1052: ifeq -> 1077
    //   1055: getstatic af.b : Laf;
    //   1058: invokevirtual f : ()V
    //   1061: getstatic v.a : [Lai;
    //   1064: getstatic af.b : Laf;
    //   1067: getfield a : Lv;
    //   1070: getfield c : B
    //   1073: aaload
    //   1074: invokevirtual p : ()V
    //   1077: aload_0
    //   1078: getstatic w.a : Lx;
    //   1081: if_acmpne -> 1088
    //   1084: aconst_null
    //   1085: putstatic w.a : Lx;
    //   1088: return
    // Exception table:
    //   from	to	target	type
    //   22	52	55	java/lang/Exception
    //   22	319	895	java/lang/Throwable
    //   22	319	988	finally
    //   359	853	895	java/lang/Throwable
    //   359	853	988	finally
    //   765	774	777	javax/microedition/media/MediaException
    //   840	846	849	java/lang/Exception
    //   895	946	988	finally
  }
  
  public final synchronized void a() {
    try {
      if (this.a != null) {
        if (this.a.getState() == 400)
          this.a.stop(); 
        if (this.a.getState() == 300)
          this.a.deallocate(); 
        if (this.a.getState() == 200 || this.a.getState() == 100)
          this.a.close(); 
      } 
    } catch (Exception exception) {}
    this.a = null;
    this.c = false;
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (paramString.equals("volumeChanged") && this.a != null && paramPlayer != null)
      r = this.a.getLevel(); 
    if (paramString.equals("endOfMedia"))
      a(); 
  }
  
  public static String[] a(String[] paramArrayOfString, boolean paramBoolean) {
    Vector vector = new Vector(paramArrayOfString.length);
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if ((paramBoolean && ai.b(paramArrayOfString[b])) || (!paramBoolean && ai.c(paramArrayOfString[b])))
        vector.addElement(paramArrayOfString[b]); 
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  public static synchronized void b() {
    if (w.a != null)
      return; 
    try {
      int i;
      switch (w.e) {
        case 1:
          i = w.m.indexOf(',');
          Manager.playTone(v.a(w.m.substring(0, i), 90), v.a(w.m.substring(i + 1), 500), w.f);
          return;
        case 2:
          w.a = new x(v.cB, v.a("seq://", w.n), false);
          return;
        case 4:
          w.a = new x(v.cB, w.o.startsWith("file:///") ? w.o : v.a("file:///", w.o), false);
          break;
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public x() {
    this.a = new Command(v.d(1), 2, 1);
    this.b = (Font)new Command(v.d(0), 4, 1);
    this.q = this.p = true;
    this.d = "";
    this.e = "";
    this.s = 0;
    this.t = 0;
    this.b = Font.getFont(64, 0, 8);
    this.j = this.i = this.k = this.l = 0;
  }
  
  private int a(int paramInt) {
    int i = 0;
    try {
      i = getGameAction(paramInt);
    } catch (IllegalArgumentException illegalArgumentException) {}
    return (i != 0) ? i : paramInt;
  }
  
  public final String getKeyName(int paramInt) {
    try {
      return super.getKeyName(paramInt);
    } catch (Exception exception) {
      return "<unknown>";
    } 
  }
  
  private void d(int paramInt) {
    this.p = false;
    this.s = paramInt;
    this.t = a(paramInt);
    this.e = getKeyName(paramInt);
  }
  
  public final void keyRepeated(int paramInt) {
    if (this.q) {
      this.d = "repeated";
      d(paramInt);
      repaint();
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\x.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */