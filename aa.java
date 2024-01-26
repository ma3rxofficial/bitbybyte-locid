import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class aa implements Runnable {
  public static String a;
  
  private String c;
  
  String b;
  
  public long a;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private String g;
  
  private l a;
  
  public boolean a;
  
  public v a;
  
  public long b;
  
  public long c;
  
  public boolean b;
  
  private int d;
  
  public int a;
  
  public int b;
  
  public int c;
  
  Vector a;
  
  private StringBuffer a;
  
  private Thread a;
  
  private String h;
  
  private String i;
  
  public aa(v paramv) {
    this.a = (Thread)paramv;
    this.b = 0;
    this.a = (Thread)new Vector();
  }
  
  public final void a() {
    if (this.a != null)
      return; 
    this.b = 0L;
    this.c = 0L;
    ((l)(this.a = (Thread)new l(29))).b = System.currentTimeMillis();
    ((l)this.a).b = (this.a == null);
    ((af)af.b).a.scheduleAtFixedRate((TimerTask)this.a, 0L, 1000L);
  }
  
  public final void b() {
    if (this.a != null) {
      this.b = 0L;
      this.c = 0L;
      ((l)this.a).b = -1L;
      v.a((TimerTask)this.a);
      this.a = null;
    } 
  }
  
  public final void a(boolean paramBoolean1, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean2, String paramString) {
    long l1 = 0L;
    if (paramBoolean1) {
      if (paramLong2 > 0L) {
        paramLong2 >>= 10L;
        a(false, "", a(-1, v.d(308), (int)paramLong2, v.d(310), -1, (String)null), "", "", (int)paramLong2, 0, paramBoolean2, paramString);
        return;
      } 
      a(false, "", a(-1, v.d(308), -1, "?", -1, (String)null), "", "", 0, 0, paramBoolean2, paramString);
      return;
    } 
    paramLong2 >>= 10L;
    long l3 = paramLong3 >> 10L;
    long l2;
    if ((l2 = System.currentTimeMillis() - paramLong1) != 0L)
      l1 = (int)(1000L * paramLong3 / l2); 
    if (paramLong2 > 0L) {
      if (l1 != 0L) {
        l4 = (paramLong2 - l3 << 10L) / l1;
      } else {
        l4 = paramLong2 - l3 << 10L;
      } 
      long l4 = v.a(1000L * l4);
      a(false, v.a(String.valueOf(l3 * 100L / paramLong2), "%"), a((int)l3, v.d(310), -1, "/", (int)paramLong2, v.d(310)), a(-1, v.d(313), -1, v.c(v.a(l4)), -1, (String)null), a(-1, v.d(314), (int)l1, v.d(315), -1, (String)null), (int)paramLong2, (int)l3, paramBoolean2, paramString);
      return;
    } 
    a(false, "", a((int)l3, v.d(310), -1, (String)null, -1, (String)null), a(-1, v.d(314), (int)l1, v.d(315), -1, (String)null), "", (int)l3, (int)l3 >> 1, paramBoolean2, paramString);
  }
  
  public final void a(boolean paramBoolean1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, boolean paramBoolean2, String paramString5) {
    if (paramBoolean1 && ((af)af.b).a == this.a)
      c(); 
    this.f = v.a(v.a, ai.e(v.a.c), af.b() - 6, true, true);
    this.b = paramString2;
    this.c = paramString1;
    this.d = paramString3;
    this.e = paramString4;
    this.c = (paramInt1 > 0) ? paramInt1 : paramInt2;
    this.b = paramInt2;
    this.g = paramString5;
    if (paramBoolean2 && ((af)af.b).a == this.a)
      af.b.repaint(); 
  }
  
  public final void a(String paramString, boolean paramBoolean) {
    this.b = paramString;
    if (paramBoolean) {
      af.b.repaint();
      af.b.serviceRepaints();
    } 
  }
  
  public final synchronized void c() {
    if (this.a == null)
      this.a = (Thread)((af)af.b).a; 
    ((v)this.a).aM = 2;
    if (((v)this.a).c == null || !((a)((v)this.a).c).z || (this.a == null && ((a)((v)this.a).c).u == 0))
      this.a.a(v.c((this.a != null) ? 61456 : 17456), false, false, (String)null, (String)null, (byte[])null); 
    if (this.a != null || ((v)this.a).c == null)
      return; 
    e();
    d();
    if (this.b != -1 && ((v)this.a).c != null && ((a)((v)this.a).c).a > ((v)this.a).ao && (this.b + 1) * a() > ((v)this.a).ao)
      ((v)this.a).ac = -this.b * a() + (a() >> 1); 
  }
  
  public final void d() {
    ((v)this.a).ao = af.c() - ((af)af.b).d - (v.a(v.a, this.a) + 3 << 2) - 1 - ((v)this.a).ay;
    int i;
    ((v)this.a).at = ((v)this.a).ao - ((i = a()) >> 1);
    ((a)((v)this.a).c).a = 4 + w.a.size() * i;
    ((v)this.a).aj = i + (i >> 1);
  }
  
  private static int a() {
    return (v.a(v.a, false) >> 1) + v.a(v.a, false) + 11;
  }
  
  public final void a(Graphics paramGraphics, int paramInt) {
    // Byte code:
    //   0: getstatic af.b : Laf;
    //   3: getfield a : Lv;
    //   6: ifnull -> 29
    //   9: aload_0
    //   10: getfield a : Lv;
    //   13: ifnull -> 30
    //   16: getstatic af.b : Laf;
    //   19: getfield a : Lv;
    //   22: aload_0
    //   23: getfield a : Lv;
    //   26: if_acmpeq -> 30
    //   29: return
    //   30: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   33: aload_0
    //   34: getfield a : Z
    //   37: invokestatic a : (Ljavax/microedition/lcdui/Font;Z)I
    //   40: dup
    //   41: istore_3
    //   42: iconst_2
    //   43: irem
    //   44: ifne -> 53
    //   47: iload_3
    //   48: iconst_1
    //   49: iadd
    //   50: goto -> 54
    //   53: iload_3
    //   54: istore #4
    //   56: iload_3
    //   57: iconst_3
    //   58: iadd
    //   59: istore #5
    //   61: aload_0
    //   62: getfield a : Lv;
    //   65: getfield an : I
    //   68: aload_0
    //   69: getfield a : Lv;
    //   72: getfield bh : Z
    //   75: ifeq -> 97
    //   78: aload_0
    //   79: getfield a : Z
    //   82: ifne -> 97
    //   85: getstatic v.bY : Z
    //   88: ifne -> 97
    //   91: getstatic v.aw : I
    //   94: goto -> 98
    //   97: iconst_0
    //   98: isub
    //   99: istore #6
    //   101: aload_0
    //   102: getfield a : Lv;
    //   105: getfield ax : I
    //   108: istore #7
    //   110: getstatic v.bY : Z
    //   113: ifeq -> 134
    //   116: aload_0
    //   117: getfield a : Lv;
    //   120: getfield bh : Z
    //   123: ifeq -> 134
    //   126: iload #7
    //   128: getstatic v.aw : I
    //   131: iadd
    //   132: istore #7
    //   134: aload_0
    //   135: getfield a : Lv;
    //   138: getfield ay : I
    //   141: istore #8
    //   143: iload #6
    //   145: iload #7
    //   147: isub
    //   148: istore #9
    //   150: invokestatic c : ()I
    //   153: getstatic af.b : Laf;
    //   156: getfield d : I
    //   159: isub
    //   160: istore #10
    //   162: aload_1
    //   163: iload #7
    //   165: iload #8
    //   167: iload #6
    //   169: iload_2
    //   170: getstatic v.a : Z
    //   173: ifeq -> 182
    //   176: getstatic v.a : I
    //   179: goto -> 184
    //   182: ldc 16777215
    //   184: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIII)V
    //   187: iinc #6, -1
    //   190: iinc #8, 4
    //   193: iload #10
    //   195: iload #5
    //   197: iconst_2
    //   198: ishl
    //   199: isub
    //   200: iconst_1
    //   201: isub
    //   202: istore_2
    //   203: aload_0
    //   204: getfield a : Z
    //   207: ifne -> 1341
    //   210: getstatic w.a : Ljava/util/Vector;
    //   213: ifnonnull -> 217
    //   216: return
    //   217: aload_0
    //   218: invokespecial e : ()V
    //   221: aload_0
    //   222: getfield a : Ljava/util/Vector;
    //   225: invokevirtual removeAllElements : ()V
    //   228: iload #8
    //   230: aload_0
    //   231: getfield a : Lv;
    //   234: getfield ac : I
    //   237: invokestatic a : (I)I
    //   240: isub
    //   241: istore #8
    //   243: aload_0
    //   244: aload_0
    //   245: iconst_m1
    //   246: dup_x1
    //   247: putfield a : I
    //   250: putfield c : I
    //   253: iconst_0
    //   254: istore #11
    //   256: iload #11
    //   258: getstatic w.a : Ljava/util/Vector;
    //   261: invokevirtual size : ()I
    //   264: if_icmpge -> 1015
    //   267: getstatic w.a : Ljava/util/Vector;
    //   270: iload #11
    //   272: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   275: checkcast i
    //   278: dup
    //   279: astore #10
    //   281: ifnull -> 1009
    //   284: iload #8
    //   286: iload_2
    //   287: if_icmpge -> 1015
    //   290: iload #8
    //   292: aload_0
    //   293: getfield a : Lv;
    //   296: getfield ay : I
    //   299: if_icmple -> 622
    //   302: aload_0
    //   303: getfield a : I
    //   306: iconst_m1
    //   307: if_icmpne -> 316
    //   310: aload_0
    //   311: iload #11
    //   313: putfield a : I
    //   316: aload_0
    //   317: iload #11
    //   319: putfield c : I
    //   322: aload_0
    //   323: getfield b : I
    //   326: iload #11
    //   328: if_icmpne -> 353
    //   331: aload_1
    //   332: iload #7
    //   334: iconst_1
    //   335: iadd
    //   336: iload #8
    //   338: iload #9
    //   340: iconst_2
    //   341: isub
    //   342: iload #4
    //   344: getstatic v.a : [I
    //   347: bipush #11
    //   349: iaload
    //   350: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIII)V
    //   353: aload_0
    //   354: getfield a : Ljava/util/Vector;
    //   357: iconst_5
    //   358: newarray short
    //   360: dup
    //   361: iconst_0
    //   362: iload #11
    //   364: i2s
    //   365: sastore
    //   366: dup
    //   367: iconst_1
    //   368: iload #7
    //   370: iconst_1
    //   371: iadd
    //   372: i2s
    //   373: sastore
    //   374: dup
    //   375: iconst_2
    //   376: iload #8
    //   378: i2s
    //   379: sastore
    //   380: dup
    //   381: iconst_3
    //   382: iload #9
    //   384: iconst_2
    //   385: isub
    //   386: i2s
    //   387: sastore
    //   388: dup
    //   389: iconst_4
    //   390: iload_3
    //   391: i2s
    //   392: sastore
    //   393: invokevirtual addElement : (Ljava/lang/Object;)V
    //   396: getstatic af.b : Laf;
    //   399: getfield p : Z
    //   402: ifne -> 622
    //   405: iload #6
    //   407: iload #7
    //   409: isub
    //   410: istore #12
    //   412: aload #10
    //   414: invokevirtual b : ()Z
    //   417: ifeq -> 540
    //   420: aload #10
    //   422: invokevirtual b : ()I
    //   425: ifle -> 540
    //   428: sipush #-360
    //   431: aload #10
    //   433: invokevirtual b : ()I
    //   436: imul
    //   437: getstatic v.e : I
    //   440: idiv
    //   441: istore #13
    //   443: sipush #255
    //   446: iload #13
    //   448: invokestatic a : (I)I
    //   451: sipush #255
    //   454: imul
    //   455: sipush #360
    //   458: idiv
    //   459: iand
    //   460: istore #14
    //   462: aload_1
    //   463: iload #14
    //   465: bipush #16
    //   467: ishl
    //   468: sipush #255
    //   471: iload #14
    //   473: isub
    //   474: bipush #8
    //   476: ishl
    //   477: ior
    //   478: invokevirtual setColor : (I)V
    //   481: aload_1
    //   482: iload #6
    //   484: iload #4
    //   486: isub
    //   487: iload #8
    //   489: iload #4
    //   491: iload #4
    //   493: bipush #90
    //   495: iload #13
    //   497: invokevirtual fillArc : (IIIIII)V
    //   500: aload_1
    //   501: ldc 14211288
    //   503: invokevirtual setColor : (I)V
    //   506: aload_1
    //   507: iload #6
    //   509: iload #4
    //   511: isub
    //   512: iload #8
    //   514: iload #4
    //   516: iconst_1
    //   517: isub
    //   518: iload #4
    //   520: iconst_1
    //   521: isub
    //   522: bipush #90
    //   524: sipush #360
    //   527: invokevirtual drawArc : (IIIIII)V
    //   530: iload #12
    //   532: iload #4
    //   534: bipush #7
    //   536: iadd
    //   537: isub
    //   538: istore #12
    //   540: aload_1
    //   541: aload #10
    //   543: aload_0
    //   544: getfield b : I
    //   547: iload #11
    //   549: if_icmpne -> 556
    //   552: iconst_1
    //   553: goto -> 557
    //   556: iconst_0
    //   557: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Li;Z)V
    //   560: aload_1
    //   561: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   564: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   567: aload #10
    //   569: invokevirtual b : ()Ljava/lang/String;
    //   572: iload #12
    //   574: invokestatic a : (Ljavax/microedition/lcdui/Font;Ljava/lang/String;I)Ljava/lang/String;
    //   577: iload #7
    //   579: iconst_3
    //   580: iadd
    //   581: iload #8
    //   583: bipush #20
    //   585: aload_0
    //   586: getfield b : I
    //   589: iload #11
    //   591: if_icmpne -> 603
    //   594: getstatic v.a : [I
    //   597: bipush #11
    //   599: iaload
    //   600: goto -> 617
    //   603: getstatic v.a : Z
    //   606: ifeq -> 615
    //   609: getstatic v.a : I
    //   612: goto -> 617
    //   615: ldc 16777215
    //   617: iconst_0
    //   618: iconst_0
    //   619: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljavax/microedition/lcdui/Font;Ljava/lang/String;IIIIZZ)V
    //   622: iload #8
    //   624: iload #5
    //   626: iadd
    //   627: dup
    //   628: istore #8
    //   630: iload_2
    //   631: bipush #6
    //   633: isub
    //   634: if_icmpge -> 1015
    //   637: iload #8
    //   639: aload_0
    //   640: getfield a : Lv;
    //   643: getfield ay : I
    //   646: if_icmple -> 998
    //   649: aload_0
    //   650: aload #10
    //   652: invokevirtual a : ()J
    //   655: putfield c : J
    //   658: aload_0
    //   659: aload #10
    //   661: invokevirtual b : ()J
    //   664: putfield b : J
    //   667: iconst_0
    //   668: istore #12
    //   670: aload_0
    //   671: getfield c : J
    //   674: lconst_0
    //   675: lcmp
    //   676: ifgt -> 770
    //   679: aload #10
    //   681: invokevirtual e : ()Z
    //   684: ifeq -> 698
    //   687: aload_0
    //   688: aload_0
    //   689: getfield b : J
    //   692: putfield c : J
    //   695: goto -> 770
    //   698: aload #10
    //   700: invokevirtual b : ()Z
    //   703: ifeq -> 729
    //   706: aload_0
    //   707: ldc2_w 100
    //   710: putfield c : J
    //   713: aload_0
    //   714: aload_0
    //   715: getfield d : I
    //   718: iconst_5
    //   719: iadd
    //   720: bipush #100
    //   722: irem
    //   723: putfield d : I
    //   726: goto -> 767
    //   729: aload_0
    //   730: aload_0
    //   731: getfield b : J
    //   734: iconst_1
    //   735: lshl
    //   736: putfield c : J
    //   739: aload_0
    //   740: getfield c : J
    //   743: lconst_0
    //   744: lcmp
    //   745: ifgt -> 767
    //   748: aload_0
    //   749: aload_0
    //   750: bipush #50
    //   752: dup_x1
    //   753: putfield d : I
    //   756: i2l
    //   757: putfield b : J
    //   760: aload_0
    //   761: ldc2_w 100
    //   764: putfield c : J
    //   767: iconst_1
    //   768: istore #12
    //   770: iload #8
    //   772: istore #13
    //   774: aload #10
    //   776: getfield c : B
    //   779: iconst_2
    //   780: if_icmpne -> 804
    //   783: aload_1
    //   784: ldc 65280
    //   786: invokevirtual setColor : (I)V
    //   789: aload_1
    //   790: iload #7
    //   792: iconst_2
    //   793: iadd
    //   794: iload #13
    //   796: invokestatic a : (Ljavax/microedition/lcdui/Graphics;II)I
    //   799: istore #13
    //   801: goto -> 828
    //   804: aload #10
    //   806: getfield c : B
    //   809: iconst_1
    //   810: if_icmpne -> 822
    //   813: aload_1
    //   814: ldc 16711680
    //   816: invokevirtual setColor : (I)V
    //   819: goto -> 828
    //   822: aload_1
    //   823: ldc 14540253
    //   825: invokevirtual setColor : (I)V
    //   828: aload_1
    //   829: iload #7
    //   831: iconst_2
    //   832: iadd
    //   833: iload #13
    //   835: invokestatic a : (Ljavax/microedition/lcdui/Graphics;II)I
    //   838: pop
    //   839: aload #10
    //   841: getfield c : B
    //   844: iconst_2
    //   845: if_icmpne -> 878
    //   848: aload_1
    //   849: ldc 45568
    //   851: invokevirtual setColor : (I)V
    //   854: aload_1
    //   855: iload #7
    //   857: iconst_2
    //   858: iadd
    //   859: iload #8
    //   861: iconst_3
    //   862: iadd
    //   863: iload #7
    //   865: iconst_5
    //   866: iadd
    //   867: iload #8
    //   869: bipush #6
    //   871: iadd
    //   872: invokevirtual drawLine : (IIII)V
    //   875: goto -> 902
    //   878: aload #10
    //   880: getfield c : B
    //   883: iconst_1
    //   884: if_icmpne -> 896
    //   887: aload_1
    //   888: ldc 11665408
    //   890: invokevirtual setColor : (I)V
    //   893: goto -> 902
    //   896: aload_1
    //   897: ldc 10197915
    //   899: invokevirtual setColor : (I)V
    //   902: aload_1
    //   903: iload #7
    //   905: iconst_2
    //   906: iadd
    //   907: iload #8
    //   909: iload #7
    //   911: iconst_5
    //   912: iadd
    //   913: iload #8
    //   915: iconst_3
    //   916: iadd
    //   917: invokevirtual drawLine : (IIII)V
    //   920: aload_1
    //   921: iload #7
    //   923: bipush #12
    //   925: iadd
    //   926: iload #8
    //   928: iconst_1
    //   929: iadd
    //   930: iload #6
    //   932: iload #7
    //   934: bipush #12
    //   936: iadd
    //   937: isub
    //   938: iconst_3
    //   939: isub
    //   940: iconst_5
    //   941: aload_0
    //   942: getfield c : J
    //   945: iload #12
    //   947: ifne -> 957
    //   950: aload_0
    //   951: getfield b : J
    //   954: goto -> 962
    //   957: aload_0
    //   958: getfield d : I
    //   961: i2l
    //   962: aload_0
    //   963: getfield b : J
    //   966: lconst_0
    //   967: lcmp
    //   968: ifle -> 975
    //   971: iconst_0
    //   972: goto -> 977
    //   975: iload #12
    //   977: iload #12
    //   979: ifeq -> 994
    //   982: aload #10
    //   984: invokevirtual b : ()Z
    //   987: ifeq -> 994
    //   990: iconst_1
    //   991: goto -> 995
    //   994: iconst_0
    //   995: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIJJZZ)V
    //   998: iload #8
    //   1000: iload_3
    //   1001: iconst_1
    //   1002: ishr
    //   1003: bipush #7
    //   1005: iadd
    //   1006: iadd
    //   1007: istore #8
    //   1009: iinc #11, 1
    //   1012: goto -> 256
    //   1015: getstatic w.a : Ljava/util/Vector;
    //   1018: invokevirtual isEmpty : ()Z
    //   1021: ifne -> 1063
    //   1024: aload_0
    //   1025: getfield b : I
    //   1028: iflt -> 1063
    //   1031: aload_0
    //   1032: getfield b : I
    //   1035: getstatic w.a : Ljava/util/Vector;
    //   1038: invokevirtual size : ()I
    //   1041: if_icmpge -> 1063
    //   1044: getstatic w.a : Ljava/util/Vector;
    //   1047: aload_0
    //   1048: getfield b : I
    //   1051: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1054: checkcast i
    //   1057: dup
    //   1058: astore #10
    //   1060: ifnonnull -> 1064
    //   1063: return
    //   1064: getstatic v.bY : Z
    //   1067: ifeq -> 1088
    //   1070: aload_0
    //   1071: getfield a : Lv;
    //   1074: getfield bh : Z
    //   1077: ifeq -> 1088
    //   1080: iload #7
    //   1082: getstatic v.aw : I
    //   1085: isub
    //   1086: istore #7
    //   1088: iload_2
    //   1089: istore #8
    //   1091: aload_1
    //   1092: getstatic v.a : Z
    //   1095: ifeq -> 1104
    //   1098: getstatic v.a : I
    //   1101: goto -> 1106
    //   1104: ldc 16317688
    //   1106: iload #7
    //   1108: iload #8
    //   1110: aload_0
    //   1111: getfield a : Lv;
    //   1114: getfield an : I
    //   1117: iconst_1
    //   1118: isub
    //   1119: iload #5
    //   1121: iconst_2
    //   1122: ishl
    //   1123: aconst_null
    //   1124: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIILjavax/microedition/lcdui/Image;)V
    //   1127: aload_1
    //   1128: aload #10
    //   1130: iconst_0
    //   1131: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Li;Z)V
    //   1134: iinc #8, 2
    //   1137: iinc #7, 3
    //   1140: aload_1
    //   1141: aload #10
    //   1143: invokevirtual a : ()Ljava/lang/String;
    //   1146: iload #7
    //   1148: iload #8
    //   1150: iload #6
    //   1152: iload #7
    //   1154: isub
    //   1155: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1158: iload #8
    //   1160: iload #5
    //   1162: iadd
    //   1163: istore #8
    //   1165: aload #10
    //   1167: invokevirtual b : ()Z
    //   1170: ifeq -> 1216
    //   1173: aload_1
    //   1174: sipush #314
    //   1177: invokestatic d : (I)Ljava/lang/String;
    //   1180: aload #10
    //   1182: invokevirtual a : ()I
    //   1185: invokestatic valueOf : (I)Ljava/lang/String;
    //   1188: sipush #315
    //   1191: invokestatic d : (I)Ljava/lang/String;
    //   1194: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1197: iload #7
    //   1199: iload #8
    //   1201: iload #6
    //   1203: iload #7
    //   1205: isub
    //   1206: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1209: iload #8
    //   1211: iload #5
    //   1213: iadd
    //   1214: istore #8
    //   1216: aload_1
    //   1217: aload #10
    //   1219: invokevirtual c : ()Ljava/lang/String;
    //   1222: iload #7
    //   1224: iload #8
    //   1226: iload #6
    //   1228: iload #7
    //   1230: isub
    //   1231: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1234: iload #8
    //   1236: iload #5
    //   1238: iadd
    //   1239: istore #8
    //   1241: aload #10
    //   1243: invokevirtual f : ()Z
    //   1246: ifeq -> 1269
    //   1249: aload_1
    //   1250: sipush #627
    //   1253: invokestatic d : (I)Ljava/lang/String;
    //   1256: iload #7
    //   1258: iload #8
    //   1260: iload #6
    //   1262: iload #7
    //   1264: isub
    //   1265: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1268: return
    //   1269: aload #10
    //   1271: invokevirtual d : ()Z
    //   1274: ifeq -> 1296
    //   1277: aload_1
    //   1278: bipush #38
    //   1280: invokestatic d : (I)Ljava/lang/String;
    //   1283: iload #7
    //   1285: iload #8
    //   1287: iload #6
    //   1289: iload #7
    //   1291: isub
    //   1292: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1295: return
    //   1296: aload #10
    //   1298: invokevirtual e : ()Z
    //   1301: ifne -> 1323
    //   1304: aload_1
    //   1305: aload #10
    //   1307: invokevirtual d : ()Ljava/lang/String;
    //   1310: iload #7
    //   1312: iload #8
    //   1314: iload #6
    //   1316: iload #7
    //   1318: isub
    //   1319: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1322: return
    //   1323: aload_1
    //   1324: iconst_0
    //   1325: invokestatic d : (I)Ljava/lang/String;
    //   1328: iload #7
    //   1330: iload #8
    //   1332: iload #6
    //   1334: iload #7
    //   1336: isub
    //   1337: invokestatic a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;III)V
    //   1340: return
    //   1341: iload #7
    //   1343: iload #9
    //   1345: iconst_1
    //   1346: ishr
    //   1347: iadd
    //   1348: istore #10
    //   1350: aload_1
    //   1351: getstatic v.b : Z
    //   1354: ifeq -> 1363
    //   1357: getstatic v.b : I
    //   1360: goto -> 1364
    //   1363: iconst_0
    //   1364: invokevirtual setColor : (I)V
    //   1367: aload_1
    //   1368: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   1371: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   1374: aload_0
    //   1375: getfield f : Ljava/lang/String;
    //   1378: ifnull -> 1395
    //   1381: aload_1
    //   1382: aload_0
    //   1383: getfield f : Ljava/lang/String;
    //   1386: iload #10
    //   1388: iload #8
    //   1390: bipush #17
    //   1392: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1395: iload #8
    //   1397: iload_3
    //   1398: iconst_1
    //   1399: iadd
    //   1400: iadd
    //   1401: istore #8
    //   1403: aload_0
    //   1404: getfield b : Ljava/lang/String;
    //   1407: ifnull -> 1426
    //   1410: aload_1
    //   1411: aload_0
    //   1412: getfield b : Ljava/lang/String;
    //   1415: iload #7
    //   1417: iconst_3
    //   1418: iadd
    //   1419: iload #8
    //   1421: bipush #20
    //   1423: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1426: iload #8
    //   1428: iload_3
    //   1429: iconst_1
    //   1430: iadd
    //   1431: iadd
    //   1432: istore #8
    //   1434: aload_1
    //   1435: iload #7
    //   1437: iconst_3
    //   1438: iadd
    //   1439: iload #8
    //   1441: iconst_1
    //   1442: iadd
    //   1443: invokestatic b : ()I
    //   1446: bipush #8
    //   1448: isub
    //   1449: iload #5
    //   1451: iconst_1
    //   1452: isub
    //   1453: aload_0
    //   1454: getfield c : J
    //   1457: l2i
    //   1458: i2l
    //   1459: aload_0
    //   1460: getfield b : J
    //   1463: l2i
    //   1464: i2l
    //   1465: iconst_0
    //   1466: iconst_0
    //   1467: invokestatic a : (Ljavax/microedition/lcdui/Graphics;IIIIJJZZ)V
    //   1470: iinc #8, 3
    //   1473: aload_1
    //   1474: getstatic v.b : Ljavax/microedition/lcdui/Font;
    //   1477: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   1480: aload_0
    //   1481: getfield c : Ljava/lang/String;
    //   1484: ifnull -> 1501
    //   1487: aload_1
    //   1488: aload_0
    //   1489: getfield c : Ljava/lang/String;
    //   1492: iload #10
    //   1494: iload #8
    //   1496: bipush #17
    //   1498: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1501: iinc #8, 2
    //   1504: aload_1
    //   1505: getstatic v.a : Ljavax/microedition/lcdui/Font;
    //   1508: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   1511: aload_0
    //   1512: getfield a : J
    //   1515: lconst_0
    //   1516: lcmp
    //   1517: ifeq -> 1561
    //   1520: iload #8
    //   1522: iload #5
    //   1524: iconst_2
    //   1525: iadd
    //   1526: iadd
    //   1527: istore #8
    //   1529: aload_1
    //   1530: sipush #316
    //   1533: invokestatic d : (I)Ljava/lang/String;
    //   1536: invokestatic currentTimeMillis : ()J
    //   1539: aload_0
    //   1540: getfield a : J
    //   1543: lsub
    //   1544: invokestatic c : (J)Ljava/lang/String;
    //   1547: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1550: iload #7
    //   1552: iconst_3
    //   1553: iadd
    //   1554: iload #8
    //   1556: bipush #20
    //   1558: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1561: aload_0
    //   1562: getfield d : Ljava/lang/String;
    //   1565: ifnull -> 1602
    //   1568: aload_0
    //   1569: getfield d : Ljava/lang/String;
    //   1572: invokevirtual length : ()I
    //   1575: ifeq -> 1602
    //   1578: iload #8
    //   1580: iload_3
    //   1581: iconst_2
    //   1582: iadd
    //   1583: iadd
    //   1584: istore #8
    //   1586: aload_1
    //   1587: aload_0
    //   1588: getfield d : Ljava/lang/String;
    //   1591: iload #7
    //   1593: iconst_3
    //   1594: iadd
    //   1595: iload #8
    //   1597: bipush #20
    //   1599: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1602: iload #8
    //   1604: iload_3
    //   1605: iconst_2
    //   1606: iadd
    //   1607: iadd
    //   1608: istore #8
    //   1610: aload_0
    //   1611: getfield e : Ljava/lang/String;
    //   1614: ifnull -> 1633
    //   1617: aload_1
    //   1618: aload_0
    //   1619: getfield e : Ljava/lang/String;
    //   1622: iload #7
    //   1624: iconst_3
    //   1625: iadd
    //   1626: iload #8
    //   1628: bipush #20
    //   1630: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1633: aload_0
    //   1634: getfield g : Ljava/lang/String;
    //   1637: ifnull -> 1728
    //   1640: aload_0
    //   1641: getfield g : Ljava/lang/String;
    //   1644: invokevirtual length : ()I
    //   1647: ifle -> 1728
    //   1650: aload_1
    //   1651: ldc 10066329
    //   1653: invokevirtual setColor : (I)V
    //   1656: iload #8
    //   1658: iload_3
    //   1659: iconst_2
    //   1660: iadd
    //   1661: iadd
    //   1662: istore #8
    //   1664: aload_1
    //   1665: iconst_0
    //   1666: iinc #8, 2
    //   1669: iload #8
    //   1671: iload #9
    //   1673: iload #8
    //   1675: invokevirtual drawLine : (IIII)V
    //   1678: iinc #8, 4
    //   1681: aload_1
    //   1682: getstatic v.b : Z
    //   1685: ifeq -> 1694
    //   1688: getstatic v.b : I
    //   1691: goto -> 1695
    //   1694: iconst_0
    //   1695: invokevirtual setColor : (I)V
    //   1698: aload_1
    //   1699: aload_0
    //   1700: iconst_m1
    //   1701: sipush #537
    //   1704: invokestatic d : (I)Ljava/lang/String;
    //   1707: iconst_m1
    //   1708: aload_0
    //   1709: getfield g : Ljava/lang/String;
    //   1712: iconst_m1
    //   1713: aconst_null
    //   1714: invokevirtual a : (ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   1717: iload #7
    //   1719: iconst_3
    //   1720: iadd
    //   1721: iload #8
    //   1723: bipush #20
    //   1725: invokevirtual drawString : (Ljava/lang/String;III)V
    //   1728: return
  }
  
  private static void a(Graphics paramGraphics, i parami, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual e : ()Z
    //   4: ifeq -> 12
    //   7: iconst_0
    //   8: istore_1
    //   9: goto -> 41
    //   12: aload_1
    //   13: invokevirtual f : ()Z
    //   16: ifeq -> 25
    //   19: ldc 15785984
    //   21: istore_1
    //   22: goto -> 41
    //   25: aload_1
    //   26: invokevirtual d : ()Z
    //   29: ifeq -> 38
    //   32: ldc 15204352
    //   34: istore_1
    //   35: goto -> 41
    //   38: ldc 45056
    //   40: istore_1
    //   41: aload_0
    //   42: iload_2
    //   43: ifeq -> 55
    //   46: getstatic v.a : [I
    //   49: bipush #12
    //   51: iaload
    //   52: goto -> 56
    //   55: iload_1
    //   56: invokevirtual setColor : (I)V
    //   59: return
  }
  
  private static int a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    for (byte b = 6; b >= 0; b -= 2) {
      paramGraphics.drawLine(paramInt1, paramInt2, paramInt1 + b, paramInt2);
      paramInt1++;
      paramInt2++;
    } 
    return --paramInt2;
  }
  
  private void e() {
    if (w.a == null || w.a.isEmpty())
      this.b = -1; 
    this.b = v.a(v.b(this.b, w.a.size() - 1), 0);
  }
  
  public final boolean a() {
    return (this.b != -1 && this.b >= this.a && this.b <= this.c);
  }
  
  private static void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    v.a(v.a, paramString, paramInt3, false, (String)null);
    v.a(paramGraphics, v.a, paramString, paramInt1, paramInt2, 20, (v.a != 0) ? v.a : 16316664, false, false);
  }
  
  public final String a(int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3, String paramString3) {
    if (this.a == null) {
      this.a = (Thread)new StringBuffer();
    } else {
      this.a.setLength(0);
    } 
    if (paramInt1 != -1)
      this.a.append(paramInt1); 
    if (paramString1 != null)
      this.a.append(paramString1); 
    if (paramInt2 != -1)
      this.a.append(paramInt2); 
    if (paramString2 != null)
      this.a.append(paramString2); 
    if (paramInt3 != -1)
      this.a.append(paramInt3); 
    if (paramString3 != null)
      this.a.append(paramString3); 
    return this.a.toString();
  }
  
  public final void a(String paramString1, String paramString2) {
    this.h = paramString1;
    this.i = paramString2;
    try {
      this.a = (v.G == '\003') ? null : (Thread)ai.a;
      v.a(this);
      /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Thread}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Thread}, expression=ThisExpression{ObjectType{aa}}, name=a, descriptor=Ljava/lang/Thread;}} */
      if (this.a != null) {
        Thread thread;
        try {
          this.a.wait();
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Thread}, name=null} */
        } finally {
          this = null;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Thread}, name=null} */
        } 
      } 
      this.a = null;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void run() {
    af.b.a(this.i, this.h);
    /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Thread}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Thread}, expression=ThisExpression{ObjectType{aa}}, name=a, descriptor=Ljava/lang/Thread;}} */
    if (this.a != null) {
      Thread thread;
      try {
        return;
      } finally {
        this = null;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Thread}, name=null} */
      } 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\aa.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */