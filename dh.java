import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Image;

public final class dh {
  public static final byte[] a = b("09,46,13,49,4C,7F,11,D1,82,22,44,45,53,54,00,00", ',', 16);
  
  public static final byte[] b = b("09,46,13,4E,4C,7F,11,D1,82,22,44,45,53,54,00,00", ',', 16);
  
  public static final byte[] c = b("7b,30,39,34,36,31,33,34,45,2D,34,43,37,46,2D,31,31,44,31,2D,38,32,32,32,2D,34,34,34,35,35,33,35,34,30,30,30,30,7D", ',', 16);
  
  public static final byte[] d = b("*{00001251-0000-0000-0000-000000001251}", ',', 16);
  
  private static final byte[] I = b("09,49,13,49,4c,7f,11,d1,82,22,44,45,53,54,00,00", ',', 16);
  
  public static final byte[] e = b("4D,69,72,61,6E,64,61,4D,00,06,03,00,00,03,08,07", ',', 16);
  
  public static final byte[] f = b("97,b1,27,51,24,3c,43,34,ad,22,d6,ab,f7,3f,14,09", ',', 16);
  
  public static final byte[] g = b("f2,e7,c7,f4,fe,ad,4d,fb,b2,35,36,79,8b,df,00,00", ',', 16);
  
  private static final byte[] J = b("*SIM client  ,00,00,00,00", ',', 16);
  
  private static final byte[] K = b("97,b1,27,51,24,3c,43,34,ad,22,d6,ab,f7,3f,14,00", ',', 16);
  
  public static final byte[] h = b("*Licq client ,00,00,00,00", ',', 16);
  
  public static final byte[] i = b("*Kopete ICQ  ,00,0c,00,02", ',', 16);
  
  public static final byte[] j = b("*&RQinside,08,08,09,00,00,00,00", ',', 16);
  
  public static final byte[] k = b("56,3F,C8,09,0B,6F,41,*QIP 2005a", ',', 16);
  
  public static final byte[] l = b("56,3F,C8,09,0B,6F,41,*QIP     !", ',', 16);
  
  public static final byte[] m = b("51,AD,D1,90,72,04,47,3D,A1,A1,49,F4,A3,97,A4,1F", ',', 16);
  
  public static final byte[] n = b("7C,73,75,02,C3,BE,4F,3E,A6,9F,01,53,13,43,1E,1A", ',', 16);
  
  public static final byte[] o = b("*VmICQ ,76,30,2E,31,2E,39,62,00,00,00", ',', 16);
  
  private static final byte[] L = b("74,ED,C3,36,44,DF,48,5B,8B,1C,67,1A,1F,86,09,9F", ',', 16);
  
  public static final byte[] p = b("dd,16,f2,02,84,e6,11,d4,90,db,00,10,4b,9b,4b,7d", ',', 16);
  
  public static final byte[] q = b("97,b1,27,51,24,3c,43,34,ad,22,d6,ab,f7,3f,14,92", ',', 16);
  
  public static final byte[] r = b("01,38,ca,7b,76,9a,49,15,88,f2,13,fc,00,97,9e,a8", ',', 16);
  
  private static final byte[] M = b("a0,e9,3f,37,4f,e9,d3,11,bc,d2,00,04,ac,96,dd,96", ',', 16);
  
  private static final byte[] N = b("09,46,13,46,4c,7f,11,d1,82,22,44,45,53,54,00,00", ',', 16);
  
  private static final byte[] O = b("09,46,13,45,4c,7f,11,d1,82,22,44,45,53,54,00,00", ',', 16);
  
  private static final byte[] P = b("74,8F,24,20,62,87,11,D1,82,22,44,45,53,54,00,00", ',', 16);
  
  private static final byte[] Q = a("*MIP ", ',', 16);
  
  private static final byte[] R = a("*Yapp", ',', 16);
  
  private static final byte[] S = a("*Smaper", ',', 16);
  
  public static final byte[] s = b("1A,09,3C,6C,D7,FD,4E,C5,9D,51,A6,47,4E,34,F5,A0", ',', 16);
  
  public static final byte[] t = b("09,46,13,43,4C,7F,11,D1,82,22,44,45,53,54,00,00", ',', 16);
  
  public static final byte[] u = b("09,46,13,44,4C,7F,11,D1,82,22,44,45,53,54,00,00", ',', 16);
  
  public static final byte[] v = b("*Jimm ,00,00,00,00,00,00,00,00,00,00,00", ',', 16);
  
  public static final byte[] w = b("09,46,13,4C,4C,7F,11,D1,82,22,44,45,53,54,00,00", ',', 16);
  
  public static final byte[] x = b("56,3f,c8,09,0b,6f,41,bd,9f,79,42,26,09,df,a2,f3", ',', 16);
  
  public static final byte[] y = b("*mChat icq 2.3.0,6D", ',', 16);
  
  private static final byte[] T = b("09,46,13,48,4c,7f,11,d1,82,22,44,45,53,54,00,00", ',', 16);
  
  private static final byte[] U = a("*NatICQ", ',', 16);
  
  public static final byte[] z = a("*D[i]Chat v.0.80", ',', 16);
  
  public static final byte[] A = a("*Smaper v1.7", ',', 16);
  
  public static final byte[] B = b("*LocID ,00,00,00,00,00,00,00,00,00,00", ',', 16);
  
  public static final byte[] C = b("*FAy ,00,00,00,00,00,00,00,00,00,00,00,00", ',', 16);
  
  public static final byte[] D = b("*bayanICQ0.2,00,00,00,00,00", ',', 16);
  
  private static final byte[] V = b("09,46", ',', 16);
  
  private static final byte[] W = b("4C,7F,11,D1,82,22,44,45,53,54,00,00", ',', 16);
  
  private static boolean X;
  
  private static boolean Y;
  
  private static boolean Z;
  
  private static boolean aa;
  
  private static boolean ab;
  
  private static final String[] ac = a("Not detected|QIP|Miranda|&RQ|R&Q|Trillian|SIM|Kopete|Jimm|StICQ|Agile Messenger|Libicq2000|VmICQ|QIP PDA (Symbian)|QIP PDA (Windows)|QIP Infium|ICQ v6|ICQ Lite|ICQ Lite v4|ICQ Lite v5|ICQ 2003b|ICQ2GO!|mChat|Mac ICQ|Pidgin (Gaim)|GnomeICU|LICQ|MIP|Yapp|Sm@peR|D[i]Chat|LocID|Bayan|SmartICQ|ICQ for PPC|mICQ|WebICQ|StrICQ|YSM|vICQ|Alicq|CenterICQ|Libicq2000 from Jabber|SPAM|AOL AIM|Slick|IM2|NatICQ", '|');
  
  private static boolean ad;
  
  public static final byte[][] E = new byte[][] { b("F3,26,81,C4,39,86,DB,92,71,A3,B9,E6,53,7A,95,7C", ',', 16), b("16,A3,B9,E6,53,7A,95,31,23,45,e3,d7,78,12,35,7C", ',', 16) };
  
  private static int ae = 0;
  
  public static Random F = new Random(System.currentTimeMillis());
  
  private static final byte[] af = b("31,28,31,30,31,30,31,31,30,31,30,31", ',', 10);
  
  private static final int[] ag = new int[] { 
      0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
      10, 11 };
  
  public static final byte[] G = b("*AOL Instant Messenger (SM)", ',', 16);
  
  public static final byte[] H = b("-128,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0", ',', 10);
  
  private static long[] ah = new long[4];
  
  private static long[] ai = new long[2];
  
  private static byte[] aj = new byte[64];
  
  private static byte[] ak = new byte[16];
  
  public static Image a(Image paramImage, int paramInt1, int paramInt2, boolean paramBoolean) {
    int i = paramImage.getWidth();
    int j = paramImage.getHeight();
    int k = paramInt2;
    int m = paramInt2;
    if (j > paramInt2)
      m = j; 
    if (i * k / m > paramInt1) {
      k = paramInt1;
      m = i;
    } 
    if (paramBoolean && k == m) {
      k = paramInt2;
      m = j;
    } 
    int n = i * k / m;
    int i1 = j * k / m;
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[n * i1];
    for (byte b = 0; b < i1; b++) {
      int i2;
      if ((i2 = b * m / k) < 0)
        i2 = 0; 
      if (i2 >= j)
        i2 = j - 1; 
      paramImage.getRGB(arrayOfInt1, 0, i, 0, i2, i, 1);
      int i3 = arrayOfInt1[0];
      for (byte b1 = 0; b1 < n; b1++) {
        try {
          i3 = arrayOfInt1[b1 * m / k];
        } catch (Exception exception) {}
        try {
          arrayOfInt2[b1 + b * n] = i3;
        } catch (Exception exception) {}
      } 
    } 
    Object object = null;
    return Image.createRGBImage(arrayOfInt2, n, i1, true);
  }
  
  public static void a(byte[] paramArrayOfbyte, int paramInt, StringBuffer paramStringBuffer) {
    if (paramArrayOfbyte.length - paramInt < 15)
      return; 
    boolean bool = true;
    byte b1 = 16;
    byte b2;
    for (b2 = 0; b2 < 16; b2++) {
      int i;
      if (((i = paramArrayOfbyte[paramInt + b2] & 0xFF) < 32 || i >= 127) && i != 0)
        bool = false; 
      if ((((i == 0) ? 1 : 0) & ((b2 < b1) ? 1 : 0)) != 0)
        b1 = b2; 
    } 
    if (bool && b1 > 5) {
      for (b2 = 0; b2 < b1; b2++)
        paramStringBuffer.append((char)paramArrayOfbyte[paramInt + b2]); 
    } else {
      for (b2 = 0; b2 < 16; b2++) {
        int i;
        if ((i = paramArrayOfbyte[paramInt + b2] & 0xFF) < 16)
          paramStringBuffer.append('0'); 
        paramStringBuffer.append(Integer.toHexString(i));
      } 
    } 
    paramStringBuffer.append('\n');
  }
  
  public static int a(String paramString, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte, int paramInt4, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: new java/io/ByteArrayOutputStream
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #8
    //   12: iconst_0
    //   13: istore #9
    //   15: ldc ''
    //   17: astore #10
    //   19: iconst_0
    //   20: istore #11
    //   22: aload_0
    //   23: invokestatic a : (Ljava/lang/String;)Ldm;
    //   26: astore #12
    //   28: iconst_m1
    //   29: istore #13
    //   31: aload #12
    //   33: iconst_5
    //   34: invokevirtual getStringValue : (I)Ljava/lang/String;
    //   37: dup
    //   38: astore #14
    //   40: ifnull -> 89
    //   43: aload #14
    //   45: invokevirtual length : ()I
    //   48: ifle -> 89
    //   51: aload #14
    //   53: iconst_0
    //   54: invokevirtual charAt : (I)C
    //   57: bipush #35
    //   59: if_icmpeq -> 89
    //   62: aload #12
    //   64: iconst_5
    //   65: new java/lang/StringBuffer
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: ldc_w '#'
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   78: aload #14
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   83: invokevirtual toString : ()Ljava/lang/String;
    //   86: invokevirtual a : (ILjava/lang/String;)V
    //   89: aload #12
    //   91: ifnull -> 3859
    //   94: aload #4
    //   96: ifnull -> 1443
    //   99: iconst_0
    //   100: istore #14
    //   102: iload #14
    //   104: aload #4
    //   106: arraylength
    //   107: bipush #16
    //   109: idiv
    //   110: if_icmpge -> 1434
    //   113: iload #14
    //   115: bipush #16
    //   117: imul
    //   118: istore #15
    //   120: aload #4
    //   122: iload #15
    //   124: getstatic dh.a : [B
    //   127: iconst_0
    //   128: bipush #16
    //   130: invokestatic a : ([BI[BII)Z
    //   133: ifeq -> 145
    //   136: iload #11
    //   138: iconst_1
    //   139: ior
    //   140: istore #11
    //   142: goto -> 1428
    //   145: aload #4
    //   147: iload #15
    //   149: getstatic dh.b : [B
    //   152: iconst_0
    //   153: bipush #16
    //   155: invokestatic a : ([BI[BII)Z
    //   158: ifeq -> 170
    //   161: iload #11
    //   163: iconst_2
    //   164: ior
    //   165: istore #11
    //   167: goto -> 1428
    //   170: aload #4
    //   172: iload #15
    //   174: getstatic dh.e : [B
    //   177: iconst_0
    //   178: bipush #8
    //   180: invokestatic a : ([BI[BII)Z
    //   183: ifeq -> 205
    //   186: iload #11
    //   188: iconst_4
    //   189: ior
    //   190: istore #11
    //   192: aload #4
    //   194: iconst_4
    //   195: iload #14
    //   197: invokestatic h : ([BII)Ljava/lang/String;
    //   200: astore #10
    //   202: goto -> 1428
    //   205: aload #4
    //   207: iload #15
    //   209: getstatic dh.f : [B
    //   212: iconst_0
    //   213: bipush #16
    //   215: invokestatic a : ([BI[BII)Z
    //   218: ifeq -> 231
    //   221: iload #11
    //   223: bipush #8
    //   225: ior
    //   226: istore #11
    //   228: goto -> 1428
    //   231: aload #4
    //   233: iload #15
    //   235: getstatic dh.g : [B
    //   238: iconst_0
    //   239: bipush #16
    //   241: invokestatic a : ([BI[BII)Z
    //   244: ifeq -> 257
    //   247: iload #11
    //   249: bipush #16
    //   251: ior
    //   252: istore #11
    //   254: goto -> 1428
    //   257: aload #4
    //   259: iload #15
    //   261: getstatic dh.J : [B
    //   264: iconst_0
    //   265: bipush #12
    //   267: invokestatic a : ([BI[BII)Z
    //   270: ifeq -> 283
    //   273: iload #11
    //   275: bipush #32
    //   277: ior
    //   278: istore #11
    //   280: goto -> 1428
    //   283: aload #4
    //   285: iload #15
    //   287: getstatic dh.K : [B
    //   290: iconst_0
    //   291: bipush #16
    //   293: invokestatic a : ([BI[BII)Z
    //   296: ifeq -> 309
    //   299: iload #11
    //   301: bipush #64
    //   303: ior
    //   304: istore #11
    //   306: goto -> 1428
    //   309: aload #4
    //   311: iload #15
    //   313: getstatic dh.h : [B
    //   316: iconst_0
    //   317: bipush #12
    //   319: invokestatic a : ([BI[BII)Z
    //   322: ifeq -> 348
    //   325: iload #11
    //   327: sipush #128
    //   330: ior
    //   331: istore #11
    //   333: aload #4
    //   335: sipush #128
    //   338: iload #14
    //   340: invokestatic h : ([BII)Ljava/lang/String;
    //   343: astore #10
    //   345: goto -> 1428
    //   348: aload #4
    //   350: iload #15
    //   352: getstatic dh.I : [B
    //   355: iconst_0
    //   356: bipush #16
    //   358: invokestatic a : ([BI[BII)Z
    //   361: ifeq -> 375
    //   364: iload #11
    //   366: sipush #128
    //   369: ior
    //   370: istore #11
    //   372: goto -> 1428
    //   375: aload #4
    //   377: iload #15
    //   379: getstatic dh.i : [B
    //   382: iconst_0
    //   383: bipush #12
    //   385: invokestatic a : ([BI[BII)Z
    //   388: ifeq -> 414
    //   391: iload #11
    //   393: sipush #256
    //   396: ior
    //   397: istore #11
    //   399: aload #4
    //   401: sipush #256
    //   404: iload #14
    //   406: invokestatic h : ([BII)Ljava/lang/String;
    //   409: astore #10
    //   411: goto -> 1428
    //   414: aload #4
    //   416: iload #15
    //   418: getstatic dh.j : [B
    //   421: iconst_0
    //   422: bipush #9
    //   424: invokestatic a : ([BI[BII)Z
    //   427: ifeq -> 453
    //   430: iload #11
    //   432: sipush #1024
    //   435: ior
    //   436: istore #11
    //   438: aload #4
    //   440: sipush #1024
    //   443: iload #14
    //   445: invokestatic h : ([BII)Ljava/lang/String;
    //   448: astore #10
    //   450: goto -> 1428
    //   453: aload #4
    //   455: iload #15
    //   457: getstatic dh.k : [B
    //   460: iconst_0
    //   461: bipush #16
    //   463: invokestatic a : ([BI[BII)Z
    //   466: ifeq -> 492
    //   469: iload #11
    //   471: sipush #2048
    //   474: ior
    //   475: istore #11
    //   477: aload #4
    //   479: sipush #2048
    //   482: iload #14
    //   484: invokestatic h : ([BII)Ljava/lang/String;
    //   487: astore #10
    //   489: goto -> 1428
    //   492: aload #4
    //   494: iload #15
    //   496: getstatic dh.n : [B
    //   499: iconst_0
    //   500: bipush #16
    //   502: invokestatic a : ([BI[BII)Z
    //   505: ifeq -> 519
    //   508: iload #11
    //   510: sipush #512
    //   513: ior
    //   514: istore #11
    //   516: goto -> 1428
    //   519: aload #4
    //   521: iload #15
    //   523: getstatic dh.L : [B
    //   526: iconst_0
    //   527: bipush #16
    //   529: invokestatic a : ([BI[BII)Z
    //   532: ifeq -> 546
    //   535: iload #11
    //   537: sipush #4096
    //   540: ior
    //   541: istore #11
    //   543: goto -> 1428
    //   546: aload #4
    //   548: iload #15
    //   550: getstatic dh.p : [B
    //   553: iconst_0
    //   554: bipush #16
    //   556: invokestatic a : ([BI[BII)Z
    //   559: ifeq -> 573
    //   562: iload #11
    //   564: sipush #8192
    //   567: ior
    //   568: istore #11
    //   570: goto -> 1428
    //   573: aload #4
    //   575: iload #15
    //   577: getstatic dh.q : [B
    //   580: iconst_0
    //   581: bipush #16
    //   583: invokestatic a : ([BI[BII)Z
    //   586: ifeq -> 600
    //   589: iload #11
    //   591: sipush #16384
    //   594: ior
    //   595: istore #11
    //   597: goto -> 1428
    //   600: aload #4
    //   602: iload #15
    //   604: getstatic dh.o : [B
    //   607: iconst_0
    //   608: bipush #6
    //   610: invokestatic a : ([BI[BII)Z
    //   613: ifeq -> 639
    //   616: iload #11
    //   618: ldc_w 32768
    //   621: ior
    //   622: istore #11
    //   624: aload #4
    //   626: ldc_w 32768
    //   629: iload #14
    //   631: invokestatic h : ([BII)Ljava/lang/String;
    //   634: astore #10
    //   636: goto -> 1428
    //   639: aload #4
    //   641: iload #15
    //   643: getstatic dh.m : [B
    //   646: iconst_0
    //   647: bipush #16
    //   649: invokestatic a : ([BI[BII)Z
    //   652: ifeq -> 666
    //   655: iload #11
    //   657: ldc_w 65536
    //   660: ior
    //   661: istore #11
    //   663: goto -> 1428
    //   666: aload #4
    //   668: iload #15
    //   670: getstatic dh.M : [B
    //   673: iconst_0
    //   674: bipush #16
    //   676: invokestatic a : ([BI[BII)Z
    //   679: ifeq -> 693
    //   682: iload #11
    //   684: ldc_w 131072
    //   687: ior
    //   688: istore #11
    //   690: goto -> 1428
    //   693: aload #4
    //   695: iload #15
    //   697: getstatic dh.N : [B
    //   700: iconst_0
    //   701: bipush #16
    //   703: invokestatic a : ([BI[BII)Z
    //   706: ifeq -> 720
    //   709: iload #11
    //   711: ldc_w 262144
    //   714: ior
    //   715: istore #11
    //   717: goto -> 1428
    //   720: aload #4
    //   722: iload #15
    //   724: getstatic dh.r : [B
    //   727: iconst_0
    //   728: bipush #16
    //   730: invokestatic a : ([BI[BII)Z
    //   733: ifeq -> 747
    //   736: iload #11
    //   738: ldc_w 1048576
    //   741: ior
    //   742: istore #11
    //   744: goto -> 1428
    //   747: aload #4
    //   749: iload #15
    //   751: getstatic dh.l : [B
    //   754: iconst_0
    //   755: bipush #16
    //   757: invokestatic a : ([BI[BII)Z
    //   760: ifeq -> 774
    //   763: iload #11
    //   765: ldc_w 2097152
    //   768: ior
    //   769: istore #11
    //   771: goto -> 1428
    //   774: aload #4
    //   776: iload #15
    //   778: getstatic dh.s : [B
    //   781: iconst_0
    //   782: bipush #16
    //   784: invokestatic a : ([BI[BII)Z
    //   787: ifeq -> 801
    //   790: iload #11
    //   792: ldc_w 16777216
    //   795: ior
    //   796: istore #11
    //   798: goto -> 1428
    //   801: aload #4
    //   803: iload #15
    //   805: getstatic dh.t : [B
    //   808: iconst_0
    //   809: bipush #16
    //   811: invokestatic a : ([BI[BII)Z
    //   814: ifeq -> 828
    //   817: iload #11
    //   819: ldc_w 33554432
    //   822: ior
    //   823: istore #11
    //   825: goto -> 1428
    //   828: aload #4
    //   830: iload #15
    //   832: getstatic dh.v : [B
    //   835: iconst_0
    //   836: iconst_5
    //   837: invokestatic a : ([BI[BII)Z
    //   840: ifeq -> 866
    //   843: iload #11
    //   845: ldc_w 67108864
    //   848: ior
    //   849: istore #11
    //   851: aload #4
    //   853: ldc_w 67108864
    //   856: iload #14
    //   858: invokestatic h : ([BII)Ljava/lang/String;
    //   861: astore #10
    //   863: goto -> 1428
    //   866: aload #4
    //   868: iload #15
    //   870: getstatic dh.O : [B
    //   873: iconst_0
    //   874: bipush #16
    //   876: invokestatic a : ([BI[BII)Z
    //   879: ifeq -> 893
    //   882: iload #11
    //   884: ldc_w 134217728
    //   887: ior
    //   888: istore #11
    //   890: goto -> 1428
    //   893: aload #4
    //   895: iload #15
    //   897: getstatic dh.w : [B
    //   900: iconst_0
    //   901: bipush #16
    //   903: invokestatic a : ([BI[BII)Z
    //   906: ifeq -> 920
    //   909: iload #11
    //   911: ldc_w 268435456
    //   914: ior
    //   915: istore #11
    //   917: goto -> 1428
    //   920: aload #4
    //   922: iload #15
    //   924: getstatic dh.u : [B
    //   927: iconst_0
    //   928: bipush #16
    //   930: invokestatic a : ([BI[BII)Z
    //   933: ifeq -> 947
    //   936: iload #11
    //   938: ldc_w 536870912
    //   941: ior
    //   942: istore #11
    //   944: goto -> 1428
    //   947: aload #4
    //   949: iload #15
    //   951: getstatic dh.x : [B
    //   954: iconst_0
    //   955: bipush #16
    //   957: invokestatic a : ([BI[BII)Z
    //   960: ifeq -> 974
    //   963: iload #11
    //   965: ldc_w 1073741824
    //   968: ior
    //   969: istore #11
    //   971: goto -> 1428
    //   974: aload #4
    //   976: iload #15
    //   978: getstatic dh.y : [B
    //   981: iconst_0
    //   982: bipush #9
    //   984: invokestatic a : ([BI[BII)Z
    //   987: ifeq -> 1013
    //   990: iload #11
    //   992: ldc_w -2147483648
    //   995: ior
    //   996: istore #11
    //   998: aload #4
    //   1000: ldc_w -2147483648
    //   1003: iload #14
    //   1005: invokestatic h : ([BII)Ljava/lang/String;
    //   1008: astore #10
    //   1010: goto -> 1428
    //   1013: aload #4
    //   1015: iload #15
    //   1017: getstatic dh.Q : [B
    //   1020: iconst_0
    //   1021: iconst_4
    //   1022: invokestatic a : ([BI[BII)Z
    //   1025: ifeq -> 1051
    //   1028: iload #11
    //   1030: ldc_w 4194304
    //   1033: ior
    //   1034: istore #11
    //   1036: aload #4
    //   1038: ldc_w 4194304
    //   1041: iload #14
    //   1043: invokestatic h : ([BII)Ljava/lang/String;
    //   1046: astore #10
    //   1048: goto -> 1428
    //   1051: aload #4
    //   1053: iload #15
    //   1055: getstatic dh.R : [B
    //   1058: iconst_0
    //   1059: iconst_4
    //   1060: invokestatic a : ([BI[BII)Z
    //   1063: ifeq -> 1089
    //   1066: iload #11
    //   1068: ldc_w 8388608
    //   1071: ior
    //   1072: istore #11
    //   1074: aload #4
    //   1076: ldc_w 8388608
    //   1079: iload #14
    //   1081: invokestatic h : ([BII)Ljava/lang/String;
    //   1084: astore #10
    //   1086: goto -> 1428
    //   1089: aload #4
    //   1091: iload #15
    //   1093: getstatic dh.S : [B
    //   1096: iconst_0
    //   1097: iconst_5
    //   1098: invokestatic a : ([BI[BII)Z
    //   1101: ifeq -> 1127
    //   1104: iload #11
    //   1106: ldc_w 524288
    //   1109: ior
    //   1110: istore #11
    //   1112: aload #4
    //   1114: ldc_w 524288
    //   1117: iload #14
    //   1119: invokestatic h : ([BII)Ljava/lang/String;
    //   1122: astore #10
    //   1124: goto -> 1428
    //   1127: aload #4
    //   1129: iload #15
    //   1131: getstatic dh.T : [B
    //   1134: iconst_0
    //   1135: bipush #16
    //   1137: invokestatic a : ([BI[BII)Z
    //   1140: ifeq -> 1150
    //   1143: iconst_1
    //   1144: putstatic dh.X : Z
    //   1147: goto -> 1428
    //   1150: aload #4
    //   1152: iload #15
    //   1154: getstatic eu.a : [B
    //   1157: iconst_0
    //   1158: iconst_3
    //   1159: invokestatic a : ([BI[BII)Z
    //   1162: ifeq -> 1223
    //   1165: iconst_0
    //   1166: istore #16
    //   1168: iload #16
    //   1170: bipush #13
    //   1172: if_icmpge -> 1194
    //   1175: aload #4
    //   1177: iconst_3
    //   1178: iload #15
    //   1180: iadd
    //   1181: iload #16
    //   1183: iadd
    //   1184: baload
    //   1185: ifeq -> 1194
    //   1188: iinc #16, 1
    //   1191: goto -> 1168
    //   1194: aload #4
    //   1196: iload #15
    //   1198: iconst_3
    //   1199: iadd
    //   1200: iload #16
    //   1202: iconst_0
    //   1203: invokestatic b : ([BIIZ)Ljava/lang/String;
    //   1206: astore #17
    //   1208: aload #12
    //   1210: iconst_5
    //   1211: aload #17
    //   1213: invokevirtual a : (ILjava/lang/String;)V
    //   1216: goto -> 1428
    //   1219: pop
    //   1220: goto -> 1428
    //   1223: aload #4
    //   1225: iload #15
    //   1227: getstatic dh.U : [B
    //   1230: iconst_0
    //   1231: bipush #6
    //   1233: invokestatic a : ([BI[BII)Z
    //   1236: ifeq -> 1246
    //   1239: iconst_1
    //   1240: putstatic dh.Y : Z
    //   1243: goto -> 1428
    //   1246: aload #4
    //   1248: iload #15
    //   1250: getstatic dh.P : [B
    //   1253: iconst_0
    //   1254: bipush #16
    //   1256: invokestatic a : ([BI[BII)Z
    //   1259: ifeq -> 1269
    //   1262: iconst_1
    //   1263: putstatic dh.Z : Z
    //   1266: goto -> 1428
    //   1269: aload #4
    //   1271: iload #15
    //   1273: bipush #16
    //   1275: aload #4
    //   1277: iload #15
    //   1279: bipush #15
    //   1281: iadd
    //   1282: baload
    //   1283: invokestatic a : ([BIIB)[B
    //   1286: iconst_0
    //   1287: getstatic dh.C : [B
    //   1290: iconst_0
    //   1291: iconst_4
    //   1292: invokestatic a : ([BI[BII)Z
    //   1295: ifeq -> 1309
    //   1298: iconst_1
    //   1299: putstatic dh.aa : Z
    //   1302: iload #15
    //   1304: istore #13
    //   1306: goto -> 1428
    //   1309: aload #4
    //   1311: iload #15
    //   1313: getstatic dh.D : [B
    //   1316: iconst_0
    //   1317: bipush #8
    //   1319: invokestatic a : ([BI[BII)Z
    //   1322: ifeq -> 1391
    //   1325: iconst_1
    //   1326: putstatic dh.ab : Z
    //   1329: iload #15
    //   1331: bipush #8
    //   1333: iadd
    //   1334: istore #16
    //   1336: iload #16
    //   1338: iload #15
    //   1340: bipush #16
    //   1342: iadd
    //   1343: if_icmpge -> 1388
    //   1346: aload #4
    //   1348: iload #16
    //   1350: baload
    //   1351: bipush #32
    //   1353: if_icmplt -> 1382
    //   1356: new java/lang/StringBuffer
    //   1359: dup
    //   1360: invokespecial <init> : ()V
    //   1363: aload #10
    //   1365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1368: aload #4
    //   1370: iload #16
    //   1372: baload
    //   1373: i2c
    //   1374: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   1377: invokevirtual toString : ()Ljava/lang/String;
    //   1380: astore #10
    //   1382: iinc #16, 1
    //   1385: goto -> 1336
    //   1388: goto -> 1428
    //   1391: bipush #53
    //   1393: invokestatic h : (I)Z
    //   1396: ifeq -> 1428
    //   1399: iconst_0
    //   1400: istore #16
    //   1402: iload #16
    //   1404: bipush #16
    //   1406: if_icmpge -> 1428
    //   1409: aload #8
    //   1411: aload #4
    //   1413: iload #15
    //   1415: iload #16
    //   1417: iadd
    //   1418: baload
    //   1419: invokevirtual write : (I)V
    //   1422: iinc #16, 1
    //   1425: goto -> 1402
    //   1428: iinc #14, 1
    //   1431: goto -> 102
    //   1434: aload #12
    //   1436: bipush #75
    //   1438: iload #11
    //   1440: invokevirtual a : (II)V
    //   1443: aload #12
    //   1445: iconst_0
    //   1446: putfield f : I
    //   1449: getstatic dh.X : Z
    //   1452: ifeq -> 1466
    //   1455: aload #12
    //   1457: dup
    //   1458: getfield f : I
    //   1461: iconst_1
    //   1462: ior
    //   1463: putfield f : I
    //   1466: getstatic dh.Z : Z
    //   1469: ifeq -> 1483
    //   1472: aload #12
    //   1474: dup
    //   1475: getfield f : I
    //   1478: iconst_2
    //   1479: ior
    //   1480: putfield f : I
    //   1483: aload #12
    //   1485: iload_1
    //   1486: putfield c : I
    //   1489: aload #12
    //   1491: iload_2
    //   1492: putfield d : I
    //   1495: aload #12
    //   1497: iload_3
    //   1498: putfield e : I
    //   1501: iload #6
    //   1503: ifne -> 3859
    //   1506: getstatic dh.ab : Z
    //   1509: ifeq -> 1519
    //   1512: bipush #32
    //   1514: istore #7
    //   1516: goto -> 3251
    //   1519: iload #11
    //   1521: ldc_w 32768
    //   1524: iand
    //   1525: ifeq -> 1535
    //   1528: bipush #12
    //   1530: istore #7
    //   1532: goto -> 3251
    //   1535: iload #11
    //   1537: ldc_w 65536
    //   1540: iand
    //   1541: ifeq -> 1551
    //   1544: bipush #13
    //   1546: istore #7
    //   1548: goto -> 3251
    //   1551: iload #11
    //   1553: ldc_w 2097152
    //   1556: iand
    //   1557: ifeq -> 1567
    //   1560: bipush #14
    //   1562: istore #7
    //   1564: goto -> 3251
    //   1567: iload #11
    //   1569: ldc_w -2147483648
    //   1572: iand
    //   1573: ifeq -> 1583
    //   1576: bipush #22
    //   1578: istore #7
    //   1580: goto -> 3251
    //   1583: iload #11
    //   1585: sipush #2048
    //   1588: iand
    //   1589: ifeq -> 1678
    //   1592: iconst_1
    //   1593: istore #7
    //   1595: iload_1
    //   1596: bipush #24
    //   1598: ishr
    //   1599: sipush #255
    //   1602: iand
    //   1603: ifeq -> 3251
    //   1606: new java/lang/StringBuffer
    //   1609: dup
    //   1610: invokespecial <init> : ()V
    //   1613: aload #10
    //   1615: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1618: ldc ' ('
    //   1620: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1623: iload_1
    //   1624: bipush #24
    //   1626: ishr
    //   1627: sipush #255
    //   1630: iand
    //   1631: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1634: iload_1
    //   1635: bipush #16
    //   1637: ishr
    //   1638: sipush #255
    //   1641: iand
    //   1642: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1645: iload_1
    //   1646: bipush #8
    //   1648: ishr
    //   1649: sipush #255
    //   1652: iand
    //   1653: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1656: iload_1
    //   1657: sipush #255
    //   1660: iand
    //   1661: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1664: ldc_w ')'
    //   1667: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1670: invokevirtual toString : ()Ljava/lang/String;
    //   1673: astore #10
    //   1675: goto -> 3251
    //   1678: iload #11
    //   1680: sipush #512
    //   1683: iand
    //   1684: ifeq -> 1739
    //   1687: bipush #15
    //   1689: istore #7
    //   1691: iload_1
    //   1692: ldc_w 65535
    //   1695: iand
    //   1696: ifeq -> 3251
    //   1699: new java/lang/StringBuffer
    //   1702: dup
    //   1703: invokespecial <init> : ()V
    //   1706: aload #10
    //   1708: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1711: ldc_w '('
    //   1714: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1717: iload_1
    //   1718: ldc_w 65535
    //   1721: iand
    //   1722: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1725: ldc_w ')'
    //   1728: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1731: invokevirtual toString : ()Ljava/lang/String;
    //   1734: astore #10
    //   1736: goto -> 3251
    //   1739: iload #5
    //   1741: sipush #31337
    //   1744: if_icmpne -> 1772
    //   1747: iload #11
    //   1749: iconst_2
    //   1750: iand
    //   1751: ifeq -> 1761
    //   1754: bipush #15
    //   1756: istore #7
    //   1758: goto -> 3251
    //   1761: iconst_1
    //   1762: istore #7
    //   1764: ldc_w '2005a'
    //   1767: astore #10
    //   1769: goto -> 3251
    //   1772: iload #11
    //   1774: ldc_w 67108864
    //   1777: iand
    //   1778: ifeq -> 1788
    //   1781: bipush #8
    //   1783: istore #7
    //   1785: goto -> 3251
    //   1788: iload #11
    //   1790: ldc_w 4194304
    //   1793: iand
    //   1794: ifeq -> 1804
    //   1797: bipush #27
    //   1799: istore #7
    //   1801: goto -> 3251
    //   1804: iload #11
    //   1806: ldc_w 8388608
    //   1809: iand
    //   1810: ifeq -> 1820
    //   1813: bipush #28
    //   1815: istore #7
    //   1817: goto -> 3251
    //   1820: iload #11
    //   1822: ldc_w 524288
    //   1825: iand
    //   1826: ifeq -> 1836
    //   1829: bipush #29
    //   1831: istore #7
    //   1833: goto -> 3251
    //   1836: iload #11
    //   1838: ldc_w 1048576
    //   1841: iand
    //   1842: ifeq -> 1852
    //   1845: bipush #16
    //   1847: istore #7
    //   1849: goto -> 3251
    //   1852: iload #11
    //   1854: bipush #24
    //   1856: iand
    //   1857: ifeq -> 1866
    //   1860: iconst_5
    //   1861: istore #7
    //   1863: goto -> 3251
    //   1866: iload #11
    //   1868: sipush #4096
    //   1871: iand
    //   1872: ifeq -> 1882
    //   1875: bipush #46
    //   1877: istore #7
    //   1879: goto -> 3251
    //   1882: iload #11
    //   1884: bipush #96
    //   1886: iand
    //   1887: ifeq -> 1897
    //   1890: bipush #6
    //   1892: istore #7
    //   1894: goto -> 3251
    //   1897: iload #11
    //   1899: sipush #256
    //   1902: iand
    //   1903: ifeq -> 1913
    //   1906: bipush #7
    //   1908: istore #7
    //   1910: goto -> 3251
    //   1913: iload #11
    //   1915: sipush #128
    //   1918: iand
    //   1919: ifeq -> 1929
    //   1922: bipush #26
    //   1924: istore #7
    //   1926: goto -> 3251
    //   1929: getstatic dh.Z : Z
    //   1932: ifeq -> 1956
    //   1935: iload #11
    //   1937: iconst_2
    //   1938: iand
    //   1939: ifeq -> 1949
    //   1942: bipush #24
    //   1944: istore #7
    //   1946: goto -> 3251
    //   1949: bipush #44
    //   1951: istore #7
    //   1953: goto -> 3251
    //   1956: iload #11
    //   1958: iconst_2
    //   1959: iand
    //   1960: ifeq -> 2145
    //   1963: iload #5
    //   1965: lookupswitch default -> 2049, 7 -> 2014, 10 -> 1992
    //   1992: iload #11
    //   1994: ldc_w 1073741824
    //   1997: iand
    //   1998: ifeq -> 2014
    //   2001: iload #11
    //   2003: sipush #16384
    //   2006: iand
    //   2007: ifeq -> 2014
    //   2010: bipush #20
    //   2012: istore #7
    //   2014: iload #11
    //   2016: iconst_1
    //   2017: iand
    //   2018: ifne -> 2145
    //   2021: iload #11
    //   2023: ldc_w 536870912
    //   2026: iand
    //   2027: ifne -> 2145
    //   2030: iload_1
    //   2031: ifne -> 2145
    //   2034: iload_2
    //   2035: ifne -> 2145
    //   2038: iload_3
    //   2039: ifne -> 2145
    //   2042: bipush #21
    //   2044: istore #7
    //   2046: goto -> 2145
    //   2049: iload_1
    //   2050: ifne -> 2145
    //   2053: iload_2
    //   2054: ifne -> 2145
    //   2057: iload_3
    //   2058: ifne -> 2145
    //   2061: iload #11
    //   2063: sipush #16384
    //   2066: iand
    //   2067: ifeq -> 2115
    //   2070: bipush #17
    //   2072: istore #7
    //   2074: iload #11
    //   2076: ldc_w 268435456
    //   2079: iand
    //   2080: ifeq -> 2145
    //   2083: iload #11
    //   2085: ldc_w 16777216
    //   2088: iand
    //   2089: ifeq -> 2145
    //   2092: iload #11
    //   2094: ldc_w 33554432
    //   2097: iand
    //   2098: ifeq -> 2108
    //   2101: bipush #19
    //   2103: istore #7
    //   2105: goto -> 2145
    //   2108: bipush #18
    //   2110: istore #7
    //   2112: goto -> 2145
    //   2115: getstatic dh.X : Z
    //   2118: ifeq -> 2128
    //   2121: bipush #45
    //   2123: istore #7
    //   2125: goto -> 2145
    //   2128: getstatic dh.Y : Z
    //   2131: ifeq -> 2141
    //   2134: bipush #47
    //   2136: istore #7
    //   2138: goto -> 2145
    //   2141: bipush #10
    //   2143: istore #7
    //   2145: iload #11
    //   2147: sipush #8192
    //   2150: iand
    //   2151: ifeq -> 2161
    //   2154: bipush #23
    //   2156: istore #7
    //   2158: goto -> 3251
    //   2161: iload_1
    //   2162: ldc_w -8454144
    //   2165: iand
    //   2166: ldc_w 2097152000
    //   2169: if_icmpne -> 2286
    //   2172: bipush #26
    //   2174: istore #7
    //   2176: iload_1
    //   2177: ldc_w 65535
    //   2180: iand
    //   2181: dup
    //   2182: istore #14
    //   2184: bipush #10
    //   2186: irem
    //   2187: ifeq -> 2245
    //   2190: new java/lang/StringBuffer
    //   2193: dup
    //   2194: invokespecial <init> : ()V
    //   2197: iload #14
    //   2199: sipush #1000
    //   2202: idiv
    //   2203: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2206: ldc_w '.'
    //   2209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2212: iload #14
    //   2214: bipush #10
    //   2216: idiv
    //   2217: bipush #100
    //   2219: irem
    //   2220: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2223: ldc_w '.'
    //   2226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2229: iload #14
    //   2231: bipush #10
    //   2233: irem
    //   2234: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2237: invokevirtual toString : ()Ljava/lang/String;
    //   2240: astore #10
    //   2242: goto -> 3251
    //   2245: new java/lang/StringBuffer
    //   2248: dup
    //   2249: invokespecial <init> : ()V
    //   2252: iload #14
    //   2254: sipush #1000
    //   2257: idiv
    //   2258: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2261: ldc_w '.'
    //   2264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2267: iload #14
    //   2269: bipush #10
    //   2271: idiv
    //   2272: bipush #100
    //   2274: irem
    //   2275: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2278: invokevirtual toString : ()Ljava/lang/String;
    //   2281: astore #10
    //   2283: goto -> 3251
    //   2286: iload_1
    //   2287: lookupswitch default -> 3074, -268505090 -> 2545, -2458 -> 2595, -190 -> 2569, -129 -> 2583, -113 -> 2562, -85 -> 2626, -66 -> 2576, -2 -> 2533, -1 -> 2456, 67312000 -> 2633, 984052718 -> 2640, 997567497 -> 2700, 1000922031 -> 2706, 1072798699 -> 2719, 1107424276 -> 2738, 1209341475 -> 2932, 1210059011 -> 3001, 1717986918 -> 2759, 2004248166 -> 3039, 2147483647 -> 2521
    //   2456: iload_2
    //   2457: ifne -> 2509
    //   2460: iload_3
    //   2461: iconst_m1
    //   2462: if_icmpeq -> 2509
    //   2465: iload #5
    //   2467: bipush #7
    //   2469: if_icmpne -> 2479
    //   2472: bipush #36
    //   2474: istore #7
    //   2476: goto -> 3074
    //   2479: iload_3
    //   2480: ldc_w 997345517
    //   2483: if_icmpne -> 2509
    //   2486: iload #11
    //   2488: iconst_2
    //   2489: iand
    //   2490: ifne -> 2509
    //   2493: iload #11
    //   2495: sipush #16384
    //   2498: iand
    //   2499: ifne -> 2509
    //   2502: bipush #43
    //   2504: istore #7
    //   2506: goto -> 3074
    //   2509: iconst_2
    //   2510: istore #7
    //   2512: iload_2
    //   2513: invokestatic f : (I)Ljava/lang/String;
    //   2516: astore #10
    //   2518: goto -> 3074
    //   2521: iconst_2
    //   2522: istore #7
    //   2524: iload_2
    //   2525: invokestatic f : (I)Ljava/lang/String;
    //   2528: astore #10
    //   2530: goto -> 3074
    //   2533: iload_3
    //   2534: iload_1
    //   2535: if_icmpne -> 3074
    //   2538: bipush #8
    //   2540: istore #7
    //   2542: goto -> 3074
    //   2545: iload_3
    //   2546: iload_1
    //   2547: if_icmpne -> 3074
    //   2550: bipush #8
    //   2552: istore #7
    //   2554: ldc_w 'wJimm '
    //   2557: astore #10
    //   2559: goto -> 3074
    //   2562: bipush #37
    //   2564: istore #7
    //   2566: goto -> 3074
    //   2569: bipush #35
    //   2571: istore #7
    //   2573: goto -> 3074
    //   2576: bipush #40
    //   2578: istore #7
    //   2580: goto -> 3074
    //   2583: iconst_3
    //   2584: istore #7
    //   2586: iload_2
    //   2587: invokestatic f : (I)Ljava/lang/String;
    //   2590: astore #10
    //   2592: goto -> 3074
    //   2595: iconst_4
    //   2596: istore #7
    //   2598: new java/lang/StringBuffer
    //   2601: dup
    //   2602: invokespecial <init> : ()V
    //   2605: iload_2
    //   2606: ldc_w 65535
    //   2609: iand
    //   2610: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2613: ldc ''
    //   2615: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2618: invokevirtual toString : ()Ljava/lang/String;
    //   2621: astore #10
    //   2623: goto -> 3074
    //   2626: bipush #38
    //   2628: istore #7
    //   2630: goto -> 3074
    //   2633: bipush #39
    //   2635: istore #7
    //   2637: goto -> 3074
    //   2640: iload_2
    //   2641: ldc_w 983982976
    //   2644: if_icmpne -> 3074
    //   2647: iload_3
    //   2648: ldc_w 981957186
    //   2651: if_icmpne -> 3074
    //   2654: iload #5
    //   2656: bipush #7
    //   2658: if_icmpne -> 2693
    //   2661: iload #11
    //   2663: iconst_1
    //   2664: iand
    //   2665: ifeq -> 2693
    //   2668: iload #11
    //   2670: ldc_w 536870912
    //   2673: iand
    //   2674: ifeq -> 2693
    //   2677: iload #11
    //   2679: sipush #16384
    //   2682: iand
    //   2683: ifeq -> 2693
    //   2686: bipush #41
    //   2688: istore #7
    //   2690: goto -> 3074
    //   2693: bipush #11
    //   2695: istore #7
    //   2697: goto -> 3074
    //   2700: iconst_5
    //   2701: istore #7
    //   2703: goto -> 3074
    //   2706: iload #5
    //   2708: iconst_2
    //   2709: if_icmpne -> 3074
    //   2712: bipush #9
    //   2714: istore #7
    //   2716: goto -> 3074
    //   2719: iload #5
    //   2721: bipush #8
    //   2723: if_icmpne -> 3074
    //   2726: iload_1
    //   2727: iload_3
    //   2728: if_icmpne -> 3074
    //   2731: bipush #46
    //   2733: istore #7
    //   2735: goto -> 3074
    //   2738: iload_2
    //   2739: iload_3
    //   2740: iand
    //   2741: iload_1
    //   2742: if_icmpne -> 3074
    //   2745: iload #5
    //   2747: bipush #8
    //   2749: if_icmpne -> 3074
    //   2752: bipush #43
    //   2754: istore #7
    //   2756: goto -> 3074
    //   2759: iload_3
    //   2760: iload_1
    //   2761: if_icmpne -> 3074
    //   2764: new java/lang/StringBuffer
    //   2767: dup
    //   2768: bipush #20
    //   2770: invokespecial <init> : (I)V
    //   2773: dup
    //   2774: astore #14
    //   2776: bipush #118
    //   2778: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2781: pop
    //   2782: iload_2
    //   2783: ldc_w 65536
    //   2786: if_icmpne -> 2801
    //   2789: aload #14
    //   2791: ldc_w '0.1a'
    //   2794: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2797: pop
    //   2798: goto -> 2918
    //   2801: iload_2
    //   2802: bipush #64
    //   2804: if_icmpgt -> 2890
    //   2807: aload #14
    //   2809: iload_2
    //   2810: bipush #8
    //   2812: ishr
    //   2813: bipush #15
    //   2815: iand
    //   2816: iload_2
    //   2817: iconst_4
    //   2818: ishr
    //   2819: bipush #15
    //   2821: iand
    //   2822: iconst_m1
    //   2823: iconst_m1
    //   2824: invokestatic a : (Ljava/lang/StringBuffer;IIII)V
    //   2827: iload_2
    //   2828: bipush #15
    //   2830: iand
    //   2831: tableswitch default -> 2887, 1 -> 2856, 2 -> 2867, 3 -> 2878
    //   2856: aload #14
    //   2858: ldc ' alpha'
    //   2860: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2863: pop
    //   2864: goto -> 2918
    //   2867: aload #14
    //   2869: ldc ' beta'
    //   2871: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2874: pop
    //   2875: goto -> 2918
    //   2878: aload #14
    //   2880: ldc_w ' final'
    //   2883: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2886: pop
    //   2887: goto -> 2918
    //   2890: aload #14
    //   2892: iload_2
    //   2893: bipush #8
    //   2895: ishr
    //   2896: bipush #15
    //   2898: iand
    //   2899: iload_2
    //   2900: iconst_4
    //   2901: ishr
    //   2902: bipush #15
    //   2904: iand
    //   2905: bipush #10
    //   2907: imul
    //   2908: iload_2
    //   2909: bipush #15
    //   2911: iand
    //   2912: iadd
    //   2913: iconst_m1
    //   2914: iconst_m1
    //   2915: invokestatic a : (Ljava/lang/StringBuffer;IIII)V
    //   2918: bipush #30
    //   2920: istore #7
    //   2922: aload #14
    //   2924: invokevirtual toString : ()Ljava/lang/String;
    //   2927: astore #10
    //   2929: goto -> 3074
    //   2932: iload_3
    //   2933: iload_1
    //   2934: if_icmpne -> 3074
    //   2937: bipush #31
    //   2939: istore #7
    //   2941: iload_2
    //   2942: ldc_w 2147418112
    //   2945: iand
    //   2946: bipush #16
    //   2948: ishr
    //   2949: istore #14
    //   2951: iload_2
    //   2952: iconst_1
    //   2953: invokestatic a : (IZ)Ljava/lang/String;
    //   2956: astore #10
    //   2958: iload_2
    //   2959: ldc_w 65535
    //   2962: iand
    //   2963: sipush #4501
    //   2966: if_icmple -> 2973
    //   2969: iconst_1
    //   2970: goto -> 2974
    //   2973: iconst_0
    //   2974: putstatic dh.ad : Z
    //   2977: getstatic dh.ad : Z
    //   2980: ifne -> 2998
    //   2983: iload #14
    //   2985: bipush #78
    //   2987: if_icmple -> 2994
    //   2990: iconst_1
    //   2991: goto -> 2995
    //   2994: iconst_0
    //   2995: putstatic dh.ad : Z
    //   2998: goto -> 3074
    //   3001: iload_3
    //   3002: iload_1
    //   3003: if_icmpne -> 3074
    //   3006: bipush #8
    //   3008: istore #7
    //   3010: new java/lang/StringBuffer
    //   3013: dup
    //   3014: invokespecial <init> : ()V
    //   3017: ldc_w 'RC '
    //   3020: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3023: iload_2
    //   3024: iconst_0
    //   3025: invokestatic a : (IZ)Ljava/lang/String;
    //   3028: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3031: invokevirtual toString : ()Ljava/lang/String;
    //   3034: astore #10
    //   3036: goto -> 3074
    //   3039: iload_3
    //   3040: iload_1
    //   3041: if_icmpne -> 3074
    //   3044: bipush #8
    //   3046: istore #7
    //   3048: new java/lang/StringBuffer
    //   3051: dup
    //   3052: invokespecial <init> : ()V
    //   3055: ldc_w 'D[im]m '
    //   3058: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3061: iload_2
    //   3062: iconst_0
    //   3063: invokestatic a : (IZ)Ljava/lang/String;
    //   3066: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3069: invokevirtual toString : ()Ljava/lang/String;
    //   3072: astore #10
    //   3074: iload #7
    //   3076: ifeq -> 3082
    //   3079: goto -> 3251
    //   3082: iload_1
    //   3083: ifeq -> 3108
    //   3086: iload_1
    //   3087: iload_3
    //   3088: if_icmpne -> 3108
    //   3091: iload_3
    //   3092: iload_2
    //   3093: if_icmpne -> 3108
    //   3096: iload #11
    //   3098: ifne -> 3108
    //   3101: bipush #39
    //   3103: istore #7
    //   3105: goto -> 3251
    //   3108: iload #11
    //   3110: ldc_w 131073
    //   3113: iand
    //   3114: ifeq -> 3141
    //   3117: iload_1
    //   3118: ifne -> 3141
    //   3121: iload_2
    //   3122: ifne -> 3141
    //   3125: iload_3
    //   3126: ifne -> 3141
    //   3129: iload #5
    //   3131: ifne -> 3141
    //   3134: bipush #34
    //   3136: istore #7
    //   3138: goto -> 3251
    //   3141: iload #5
    //   3143: bipush #7
    //   3145: if_icmpne -> 3198
    //   3148: iload #11
    //   3150: iconst_1
    //   3151: iand
    //   3152: ifeq -> 3182
    //   3155: iload #11
    //   3157: ldc_w 536870912
    //   3160: iand
    //   3161: ifeq -> 3182
    //   3164: iload_1
    //   3165: ifne -> 3198
    //   3168: iload_2
    //   3169: ifne -> 3198
    //   3172: iload_3
    //   3173: ifne -> 3198
    //   3176: iconst_3
    //   3177: istore #7
    //   3179: goto -> 3251
    //   3182: iload #11
    //   3184: sipush #16384
    //   3187: iand
    //   3188: ifeq -> 3198
    //   3191: bipush #25
    //   3193: istore #7
    //   3195: goto -> 3251
    //   3198: iload_1
    //   3199: ldc_w 889192448
    //   3202: if_icmple -> 3251
    //   3205: iload_1
    //   3206: ldc_w 1073741824
    //   3209: if_icmpge -> 3251
    //   3212: iload #5
    //   3214: lookupswitch default -> 3251, 9 -> 3240, 10 -> 3247
    //   3240: bipush #17
    //   3242: istore #7
    //   3244: goto -> 3251
    //   3247: bipush #20
    //   3249: istore #7
    //   3251: getstatic dh.aa : Z
    //   3254: ifeq -> 3771
    //   3257: iload #13
    //   3259: iflt -> 3771
    //   3262: aload #4
    //   3264: iload #13
    //   3266: bipush #16
    //   3268: aload #4
    //   3270: iload #13
    //   3272: bipush #15
    //   3274: iadd
    //   3275: baload
    //   3276: invokestatic a : ([BIIB)[B
    //   3279: dup
    //   3280: astore #14
    //   3282: bipush #7
    //   3284: baload
    //   3285: istore #9
    //   3287: getstatic jimm/Jimm.g : Z
    //   3290: ifeq -> 3771
    //   3293: new java/lang/StringBuffer
    //   3296: dup
    //   3297: invokespecial <init> : ()V
    //   3300: aload #10
    //   3302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3305: ldc '\\n LocID build.'
    //   3307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3310: invokevirtual toString : ()Ljava/lang/String;
    //   3313: astore #10
    //   3315: new java/lang/StringBuffer
    //   3318: dup
    //   3319: invokespecial <init> : ()V
    //   3322: aload #10
    //   3324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3327: aload #14
    //   3329: iconst_4
    //   3330: baload
    //   3331: bipush #8
    //   3333: ishl
    //   3334: aload #14
    //   3336: iconst_5
    //   3337: baload
    //   3338: iadd
    //   3339: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   3342: invokevirtual toString : ()Ljava/lang/String;
    //   3345: astore #10
    //   3347: new java/lang/StringBuffer
    //   3350: dup
    //   3351: invokespecial <init> : ()V
    //   3354: aload #10
    //   3356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3359: ldc ' '
    //   3361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3364: invokevirtual toString : ()Ljava/lang/String;
    //   3367: astore #10
    //   3369: aload #14
    //   3371: bipush #6
    //   3373: baload
    //   3374: tableswitch default -> 3748, 1 -> 3436, 2 -> 3462, 3 -> 3488, 4 -> 3514, 5 -> 3540, 6 -> 3566, 7 -> 3592, 8 -> 3618, 9 -> 3644, 10 -> 3670, 11 -> 3696, 12 -> 3722
    //   3436: new java/lang/StringBuffer
    //   3439: dup
    //   3440: invokespecial <init> : ()V
    //   3443: aload #10
    //   3445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3448: ldc_w 'Nokia'
    //   3451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3454: invokevirtual toString : ()Ljava/lang/String;
    //   3457: astore #10
    //   3459: goto -> 3771
    //   3462: new java/lang/StringBuffer
    //   3465: dup
    //   3466: invokespecial <init> : ()V
    //   3469: aload #10
    //   3471: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3474: ldc_w 'SonyEricsson'
    //   3477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3480: invokevirtual toString : ()Ljava/lang/String;
    //   3483: astore #10
    //   3485: goto -> 3771
    //   3488: new java/lang/StringBuffer
    //   3491: dup
    //   3492: invokespecial <init> : ()V
    //   3495: aload #10
    //   3497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3500: ldc_w 'Siemens'
    //   3503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3506: invokevirtual toString : ()Ljava/lang/String;
    //   3509: astore #10
    //   3511: goto -> 3771
    //   3514: new java/lang/StringBuffer
    //   3517: dup
    //   3518: invokespecial <init> : ()V
    //   3521: aload #10
    //   3523: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3526: ldc_w 'Samsung'
    //   3529: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3532: invokevirtual toString : ()Ljava/lang/String;
    //   3535: astore #10
    //   3537: goto -> 3771
    //   3540: new java/lang/StringBuffer
    //   3543: dup
    //   3544: invokespecial <init> : ()V
    //   3547: aload #10
    //   3549: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3552: ldc_w 'Motorola'
    //   3555: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3558: invokevirtual toString : ()Ljava/lang/String;
    //   3561: astore #10
    //   3563: goto -> 3771
    //   3566: new java/lang/StringBuffer
    //   3569: dup
    //   3570: invokespecial <init> : ()V
    //   3573: aload #10
    //   3575: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3578: ldc_w 'Jbed'
    //   3581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3584: invokevirtual toString : ()Ljava/lang/String;
    //   3587: astore #10
    //   3589: goto -> 3771
    //   3592: new java/lang/StringBuffer
    //   3595: dup
    //   3596: invokespecial <init> : ()V
    //   3599: aload #10
    //   3601: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3604: ldc_w 'Fly'
    //   3607: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3610: invokevirtual toString : ()Ljava/lang/String;
    //   3613: astore #10
    //   3615: goto -> 3771
    //   3618: new java/lang/StringBuffer
    //   3621: dup
    //   3622: invokespecial <init> : ()V
    //   3625: aload #10
    //   3627: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3630: ldc_w 'HP'
    //   3633: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3636: invokevirtual toString : ()Ljava/lang/String;
    //   3639: astore #10
    //   3641: goto -> 3771
    //   3644: new java/lang/StringBuffer
    //   3647: dup
    //   3648: invokespecial <init> : ()V
    //   3651: aload #10
    //   3653: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3656: ldc_w 'LG'
    //   3659: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3662: invokevirtual toString : ()Ljava/lang/String;
    //   3665: astore #10
    //   3667: goto -> 3771
    //   3670: new java/lang/StringBuffer
    //   3673: dup
    //   3674: invokespecial <init> : ()V
    //   3677: aload #10
    //   3679: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3682: ldc_w 'Benq'
    //   3685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3688: invokevirtual toString : ()Ljava/lang/String;
    //   3691: astore #10
    //   3693: goto -> 3771
    //   3696: new java/lang/StringBuffer
    //   3699: dup
    //   3700: invokespecial <init> : ()V
    //   3703: aload #10
    //   3705: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3708: ldc_w 'X'
    //   3711: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3714: invokevirtual toString : ()Ljava/lang/String;
    //   3717: astore #10
    //   3719: goto -> 3771
    //   3722: new java/lang/StringBuffer
    //   3725: dup
    //   3726: invokespecial <init> : ()V
    //   3729: aload #10
    //   3731: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3734: ldc_w 'Sun'
    //   3737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3740: invokevirtual toString : ()Ljava/lang/String;
    //   3743: astore #10
    //   3745: goto -> 3771
    //   3748: new java/lang/StringBuffer
    //   3751: dup
    //   3752: invokespecial <init> : ()V
    //   3755: aload #10
    //   3757: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3760: ldc_w 'Other'
    //   3763: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   3766: invokevirtual toString : ()Ljava/lang/String;
    //   3769: astore #10
    //   3771: aload #12
    //   3773: bipush #76
    //   3775: iload #7
    //   3777: invokevirtual a : (II)V
    //   3780: aload #12
    //   3782: iconst_2
    //   3783: aload #10
    //   3785: invokevirtual a : (ILjava/lang/String;)V
    //   3788: aload #12
    //   3790: bipush #64
    //   3792: getstatic dh.ad : Z
    //   3795: invokevirtual a : (IZ)V
    //   3798: bipush #53
    //   3800: invokestatic h : (I)Z
    //   3803: ifeq -> 3835
    //   3806: aload #8
    //   3808: invokevirtual size : ()I
    //   3811: bipush #16
    //   3813: if_icmpge -> 3825
    //   3816: aload #12
    //   3818: aconst_null
    //   3819: putfield b : [B
    //   3822: goto -> 3835
    //   3825: aload #12
    //   3827: aload #8
    //   3829: invokevirtual toByteArray : ()[B
    //   3832: putfield b : [B
    //   3835: iconst_0
    //   3836: putstatic dh.X : Z
    //   3839: iconst_0
    //   3840: putstatic dh.Y : Z
    //   3843: iconst_0
    //   3844: putstatic dh.Z : Z
    //   3847: iconst_0
    //   3848: putstatic dh.aa : Z
    //   3851: iconst_0
    //   3852: putstatic dh.ad : Z
    //   3855: iconst_0
    //   3856: putstatic dh.ab : Z
    //   3859: iload #9
    //   3861: ireturn
    // Exception table:
    //   from	to	target	type
    //   1194	1216	1219	java/lang/Exception
  }
  
  private static String f(int paramInt) {
    return (paramInt >> 24 & 0x7F) + "." + (paramInt >> 16 & 0xFF) + "." + (paramInt >> 8 & 0xFF) + "." + (paramInt & 0xFF);
  }
  
  public static String a(int paramInt, boolean paramBoolean) {
    String str = "";
    int i = (paramInt & 0x7FFF0000) >> 16;
    if ((paramInt & Integer.MIN_VALUE) == 0 && paramBoolean)
      str = "beta "; 
    if ((paramInt >> 12 & 0xF) > 0)
      str = str + "" + (paramInt >> 12 & 0xF) + "."; 
    str = str + "" + (paramInt >> 8 & 0xF) + "." + (paramInt >> 4 & 0xF) + (paramInt >> 0 & 0xF);
    if (i != 0)
      str = str + " p" + i; 
    return str;
  }
  
  private static void a(StringBuffer paramStringBuffer, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramStringBuffer.append(paramInt1).append('.').append(paramInt2);
    if (paramInt3 >= 0)
      paramStringBuffer.append('.').append(paramInt3); 
    if (paramInt4 >= 0)
      paramStringBuffer.append('.').append(paramInt4); 
  }
  
  public static String a(byte paramByte) {
    return ac[paramByte];
  }
  
  private static String h(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[16];
    System.arraycopy(paramArrayOfbyte, paramInt2 * 16, arrayOfByte, 0, 16);
    String str = "";
    if (paramInt1 == 4) {
      if (arrayOfByte[12] == 0 && arrayOfByte[13] == 0 && arrayOfByte[14] == 0 && arrayOfByte[15] == 1) {
        str = "0.1.2.0";
      } else if (arrayOfByte[12] == 0 && arrayOfByte[13] <= 3 && arrayOfByte[14] <= 3 && arrayOfByte[15] <= 1) {
        str = "0." + arrayOfByte[13] + "." + arrayOfByte[14] + "." + arrayOfByte[15];
      } else {
        str = arrayOfByte[8] + "." + arrayOfByte[9] + "." + arrayOfByte[10] + "." + arrayOfByte[11];
      } 
    } else if (paramInt1 == 128) {
      str = arrayOfByte[12] + "." + (arrayOfByte[13] % 100) + "." + arrayOfByte[14];
    } else if (paramInt1 == 256) {
      str = arrayOfByte[12] + "." + arrayOfByte[13] + "." + arrayOfByte[14] + "." + arrayOfByte[15];
    } else if (paramInt1 == 1024) {
      str = arrayOfByte[12] + "." + arrayOfByte[11] + "." + arrayOfByte[10] + "." + arrayOfByte[9];
    } else if (paramInt1 == 67108864) {
      str = d(arrayOfByte, 5, 11);
    } else if (paramInt1 == 2048) {
      str = d(arrayOfByte, 11, 5);
    } else if (paramInt1 == 4194304) {
      str = d(arrayOfByte, 4, 12);
    } else if (paramInt1 == 8388608) {
      str = d(arrayOfByte, 8, 5);
    } else if (paramInt1 == 524288) {
      str = d(arrayOfByte, 7, 6);
    } else if (paramInt1 == Integer.MIN_VALUE) {
      str = d(arrayOfByte, 10, 6);
    } else if (paramInt1 == 32768) {
      str = d(arrayOfByte, 6, 7);
    } 
    return str;
  }
  
  public static synchronized int a() {
    ae++;
    return ae;
  }
  
  public static int a(byte[] paramArrayOfbyte, int paramInt) {
    return paramArrayOfbyte[paramInt] & 0xFF;
  }
  
  public static void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte[paramInt1] = (byte)(paramInt2 & 0xFF);
  }
  
  public static int a(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = 0;
      i = paramArrayOfbyte[paramInt] << 8 & 0xFF00 | paramArrayOfbyte[++paramInt] & 0xFF;
    } else {
      i = 0;
      i = paramArrayOfbyte[paramInt] & 0xFF | paramArrayOfbyte[++paramInt] << 8 & 0xFF00;
    } 
    return i;
  }
  
  public static DataInputStream b(byte[] paramArrayOfbyte, int paramInt) {
    return new DataInputStream(new ByteArrayInputStream(paramArrayOfbyte, paramInt, paramArrayOfbyte.length - paramInt));
  }
  
  public static int a(DataInputStream paramDataInputStream, boolean paramBoolean) throws IOException {
    return paramBoolean ? paramDataInputStream.readUnsignedShort() : (paramDataInputStream.readByte() & 0xFF | paramDataInputStream.readByte() << 8 & 0xFF00);
  }
  
  public static String a(DataInputStream paramDataInputStream) throws IOException {
    int i;
    if ((i = a(paramDataInputStream, false)) == 0)
      return new String(); 
    byte[] arrayOfByte = new byte[i];
    paramDataInputStream.readFully(arrayOfByte);
    return a(arrayOfByte);
  }
  
  public static void a(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      paramByteArrayOutputStream.write((paramInt & 0xFF00) >> 8 & 0xFF);
      paramByteArrayOutputStream.write(paramInt & 0xFF);
      return;
    } 
    paramByteArrayOutputStream.write(paramInt & 0xFF);
    paramByteArrayOutputStream.write((paramInt & 0xFF00) >> 8 & 0xFF);
  }
  
  public static void b(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      paramByteArrayOutputStream.write((paramInt & 0xFF000000) >> 24 & 0xFF);
      paramByteArrayOutputStream.write((paramInt & 0xFF0000) >> 16 & 0xFF);
      paramByteArrayOutputStream.write((paramInt & 0xFF00) >> 8 & 0xFF);
      paramByteArrayOutputStream.write(paramInt & 0xFF);
      return;
    } 
    paramByteArrayOutputStream.write(paramInt & 0xFF);
    paramByteArrayOutputStream.write((paramInt & 0xFF00) >> 8 & 0xFF);
    paramByteArrayOutputStream.write((paramInt & 0xFF0000) >> 16 & 0xFF);
    paramByteArrayOutputStream.write((paramInt & 0xFF000000) >> 24 & 0xFF);
  }
  
  public static void a(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt) {
    paramByteArrayOutputStream.write(paramInt);
  }
  
  public static void a(ByteArrayOutputStream paramByteArrayOutputStream, String paramString, boolean paramBoolean) {
    byte[] arrayOfByte = a(paramString, paramBoolean);
    a(paramByteArrayOutputStream, arrayOfByte.length, true);
    paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static void a(int paramInt, ByteArrayOutputStream paramByteArrayOutputStream, String paramString, boolean paramBoolean) {
    a(paramByteArrayOutputStream, paramInt, paramBoolean);
    byte[] arrayOfByte = a(paramString);
    a(paramByteArrayOutputStream, arrayOfByte.length + 3, false);
    a(paramByteArrayOutputStream, arrayOfByte.length + 1, false);
    paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
    paramByteArrayOutputStream.write(0);
  }
  
  public static void a(int paramInt, ByteArrayOutputStream paramByteArrayOutputStream, String paramString) {
    a(paramInt, paramByteArrayOutputStream, paramString, true);
  }
  
  public static void a(int paramInt1, ByteArrayOutputStream paramByteArrayOutputStream, int paramInt2, String paramString) {
    a(paramByteArrayOutputStream, paramInt1, false);
    byte[] arrayOfByte = a(paramString);
    a(paramByteArrayOutputStream, arrayOfByte.length + 5, false);
    a(paramByteArrayOutputStream, paramInt2, false);
    a(paramByteArrayOutputStream, arrayOfByte.length + 1, false);
    paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
    paramByteArrayOutputStream.write(0);
  }
  
  public static int c(byte[] paramArrayOfbyte, int paramInt) {
    return a(paramArrayOfbyte, paramInt, true);
  }
  
  public static void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean) {
      paramArrayOfbyte[paramInt1] = (byte)(paramInt2 >> 8 & 0xFF);
      paramArrayOfbyte[++paramInt1] = (byte)(paramInt2 & 0xFF);
      return;
    } 
    paramArrayOfbyte[paramInt1] = (byte)(paramInt2 & 0xFF);
    paramArrayOfbyte[++paramInt1] = (byte)(paramInt2 >> 8 & 0xFF);
  }
  
  public static void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    a(paramArrayOfbyte, paramInt1, paramInt2, true);
  }
  
  public static long b(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    long l;
    if (paramBoolean) {
      l = 0L;
      l = paramArrayOfbyte[paramInt] << 24L & 0xFFFFFFFFFF000000L | paramArrayOfbyte[++paramInt] << 16L & 0xFF0000L | paramArrayOfbyte[++paramInt] << 8L & 0xFF00L | paramArrayOfbyte[++paramInt] & 0xFFL;
    } else {
      l = 0L;
      l = paramArrayOfbyte[paramInt] & 0xFFL | paramArrayOfbyte[++paramInt] << 8L & 0xFF00L | paramArrayOfbyte[++paramInt] << 16L & 0xFF0000L | paramArrayOfbyte[++paramInt] << 24L & 0xFFFFFFFFFF000000L;
    } 
    return l;
  }
  
  public static long d(byte[] paramArrayOfbyte, int paramInt) {
    return b(paramArrayOfbyte, paramInt, true);
  }
  
  public static void a(byte[] paramArrayOfbyte, int paramInt, long paramLong, boolean paramBoolean) {
    if (paramBoolean) {
      paramArrayOfbyte[paramInt] = (byte)(int)(paramLong >> 24L & 0xFFL);
      paramArrayOfbyte[++paramInt] = (byte)(int)(paramLong >> 16L & 0xFFL);
      paramArrayOfbyte[++paramInt] = (byte)(int)(paramLong >> 8L & 0xFFL);
      paramArrayOfbyte[++paramInt] = (byte)(int)(paramLong & 0xFFL);
      return;
    } 
    paramArrayOfbyte[paramInt] = (byte)(int)(paramLong & 0xFFL);
    paramArrayOfbyte[++paramInt] = (byte)(int)(paramLong >> 8L & 0xFFL);
    paramArrayOfbyte[++paramInt] = (byte)(int)(paramLong >> 16L & 0xFFL);
    paramArrayOfbyte[++paramInt] = (byte)(int)(paramLong >> 24L & 0xFFL);
  }
  
  public static void a(byte[] paramArrayOfbyte, int paramInt, long paramLong) {
    a(paramArrayOfbyte, paramInt, paramLong, true);
  }
  
  public static byte[] e(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt + 4 > paramArrayOfbyte.length)
      return null; 
    int i = c(paramArrayOfbyte, paramInt + 2);
    if (paramInt + 4 + i > paramArrayOfbyte.length)
      return null; 
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfbyte, paramInt + 4, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public static String b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramArrayOfbyte.length < paramInt1 + paramInt2)
      return null; 
    while (paramInt2 > 0 && paramArrayOfbyte[paramInt1 + paramInt2 - 1] == 0)
      paramInt2--; 
    if (k(paramArrayOfbyte, paramInt1, paramInt2))
      return e(paramArrayOfbyte, paramInt1, paramInt2); 
    if (paramBoolean || (paramInt2 > 2 && paramArrayOfbyte[paramInt1] == -17 && paramArrayOfbyte[paramInt1 + 1] == -69))
      try {
        return j(paramArrayOfbyte, paramInt1, paramInt2);
      } catch (Exception exception) {} 
    return em.h(14) ? g(paramArrayOfbyte, paramInt1, paramInt2) : new String(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public static String c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    return i(paramArrayOfbyte, paramInt1, paramInt2) ? j(paramArrayOfbyte, paramInt1, paramInt2) : g(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private static boolean i(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 > 300)
      paramInt2 = 300; 
    for (int i = paramInt1; i - paramInt1 < paramInt2 - 10; i++) {
      if ((paramArrayOfbyte[i] & 0xFE) == 208 && (paramArrayOfbyte[i + 1] & 0xFE) != 208 && (paramArrayOfbyte[i + 2] & 0xFE) == 208 && (paramArrayOfbyte[i + 3] & 0xFE) != 208 && (paramArrayOfbyte[i + 4] & 0xFE) == 208 && (paramArrayOfbyte[i + 5] & 0xFE) != 208)
        return true; 
    } 
    return false;
  }
  
  private static String j(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    byte[] arrayOfByte;
    b(arrayOfByte = new byte[paramInt2 + 2], 0, paramInt2);
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 2, paramInt2);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    return (new DataInputStream(byteArrayInputStream)).readUTF();
  }
  
  public static String d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return b(paramArrayOfbyte, paramInt1, paramInt2, false);
  }
  
  public static String a(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return b(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramBoolean);
  }
  
  public static String a(byte[] paramArrayOfbyte) {
    return b(paramArrayOfbyte, 0, paramArrayOfbyte.length, false);
  }
  
  public static long b(byte[] paramArrayOfbyte) {
    long l = 0L;
    l = ((0x0L | (paramArrayOfbyte[0] & 0xFF)) << 8L | (paramArrayOfbyte[1] & 0xFF)) << 8L;
    if (paramArrayOfbyte.length > 3)
      l = (l | (paramArrayOfbyte[2] & 0xFF)) << 8L | (paramArrayOfbyte[3] & 0xFF); 
    return l;
  }
  
  public static String c(byte[] paramArrayOfbyte) {
    StringBuffer stringBuffer = new StringBuffer(paramArrayOfbyte.length);
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      String str = Integer.toHexString(256 + (paramArrayOfbyte[b] & 0xFF)).substring(1);
      stringBuffer.append(((str.length() < 2) ? "0" : "") + str);
    } 
    return stringBuffer.toString();
  }
  
  public static byte[] a(String paramString, boolean paramBoolean) {
    if (paramBoolean)
      try {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        (new DataOutputStream(byteArrayOutputStream)).writeUTF(paramString);
        byte[] arrayOfByte1;
        byte[] arrayOfByte2 = new byte[(arrayOfByte1 = byteArrayOutputStream.toByteArray()).length - 2];
        System.arraycopy(arrayOfByte1, 2, arrayOfByte2, 0, arrayOfByte1.length - 2);
        return arrayOfByte2;
      } catch (Exception exception) {} 
    return em.h(14) ? b(paramString, false) : paramString.getBytes();
  }
  
  public static byte[] a(String paramString) {
    return a(paramString, false);
  }
  
  public static byte[] b(String paramString) {
    byte[] arrayOfByte = new byte[paramString.length() * 2];
    for (byte b = 0; b < paramString.length(); b++)
      b(arrayOfByte, b * 2, paramString.charAt(b)); 
    return arrayOfByte;
  }
  
  public static String e(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length || paramInt2 % 2 != 0)
      return null; 
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = paramInt1; i < paramInt1 + paramInt2; i += 2)
      stringBuffer.append((char)c(paramArrayOfbyte, i)); 
    return stringBuffer.toString();
  }
  
  private static boolean k(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if ((paramInt2 & 0x1) != 0)
      return false; 
    int i = paramInt1 + paramInt2;
    boolean bool = true;
    for (int j = paramInt1; j < i; j += 2) {
      byte b;
      if ((b = paramArrayOfbyte[j]) > 0 && b < 9)
        return true; 
      if (b == 0 && paramArrayOfbyte[j + 1] != 0)
        return true; 
      if (b > 32 || b < 0)
        bool = false; 
    } 
    return bool;
  }
  
  public static String c(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramString.length(); b++) {
      char c;
      if ((c = paramString.charAt(b)) != '\000' && c != '\r')
        stringBuffer.append(c); 
    } 
    return stringBuffer.toString();
  }
  
  public static String d(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c;
      if ((c = paramString.charAt(b)) != '\r')
        if (c == '\n') {
          stringBuffer.append("\r\n");
        } else {
          stringBuffer.append(c);
        }  
    } 
    return stringBuffer.toString();
  }
  
  private static boolean a(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    if (paramInt1 + paramInt3 > paramArrayOfbyte1.length || paramInt2 + paramInt3 > paramArrayOfbyte2.length)
      return false; 
    for (byte b = 0; b < paramInt3; b++) {
      if (paramArrayOfbyte1[paramInt1 + b] != paramArrayOfbyte2[paramInt2 + b])
        return false; 
    } 
    return true;
  }
  
  public static byte[] f(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      arrayOfByte[b] = (byte)(paramArrayOfbyte[b] ^ E[paramInt][b % 16]); 
    return arrayOfByte;
  }
  
  public static int a(int paramInt) {
    byte b = 0;
    if (paramInt == -1)
      return -1; 
    if ((paramInt & 0x100) != 0)
      return 256; 
    if ((paramInt & 0x2) != 0)
      b = 2; 
    if ((paramInt & 0x10) != 0)
      b = 16; 
    if ((paramInt & 0x4) != 0)
      b = 4; 
    int i = paramInt & 0x70FF;
    if ((paramInt & 0x100) != 0 && (paramInt & 0xFFFF) != 256 && paramInt != -1)
      paramInt &= 0xFFFFFEFF; 
    return (i == 32) ? 32 : ((i == 8193) ? 8193 : ((i == 12288) ? 12288 : ((i == 20480) ? 20480 : ((i == 24576) ? 24576 : ((i == 16384) ? 16384 : ((b == 0 && (paramInt & 0x1) == 1) ? 1 : b))))));
  }
  
  public static int b(int paramInt) {
    return (paramInt == 1) ? 1 : ((paramInt == 32) ? 32 : ((paramInt == 2) ? 19 : ((paramInt == 256) ? 256 : ((paramInt == 512) ? 256 : ((paramInt == 4) ? 5 : ((paramInt == 16) ? 17 : ((paramInt == 8193) ? 8193 : ((paramInt == 12288) ? 12288 : ((paramInt == 16384) ? 16384 : ((paramInt == 20480) ? 20480 : ((paramInt == 24576) ? 24576 : 0)))))))))));
  }
  
  public static String c(int paramInt) {
    return (paramInt < 10) ? ("0" + String.valueOf(paramInt)) : String.valueOf(paramInt);
  }
  
  public static String d(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return null; 
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < 4; b++) {
      int i = paramArrayOfbyte[b] & 0xFF;
      if (stringBuffer.length() != 0)
        stringBuffer.append('.'); 
      stringBuffer.append(i);
    } 
    return stringBuffer.toString();
  }
  
  public static byte[] e(String paramString) {
    byte[] arrayOfByte;
    return ((arrayOfByte = b(paramString, '.', 10)) == null || arrayOfByte.length != 4) ? null : arrayOfByte;
  }
  
  public static boolean f(String paramString) {
    boolean bool = false;
    try {
      bool = (e(paramString) != null) ? true : false;
    } catch (NumberFormatException numberFormatException) {
      return false;
    } 
    return bool;
  }
  
  public static int b() {
    bu[] arrayOfBu = bi.h();
    dm[] arrayOfDm = bi.f();
    int i;
    if ((i = F.nextInt()) < 0)
      i *= -1; 
    i = i % 28671 + 4096;
    while (true) {
      boolean bool = false;
      if ((cd.a()).o == i) {
        bool = true;
      } else {
        for (byte b = 0; b < arrayOfBu.length; b++) {
          if ((arrayOfBu[b]).a == i) {
            bool = true;
            break;
          } 
        } 
      } 
      if (!bool)
        for (byte b = 0; b < arrayOfDm.length; b++) {
          if (arrayOfDm[b].getIntValue(64) == i || (arrayOfDm[b]).y == i || arrayOfDm[b].r() == i || arrayOfDm[b].s() == i) {
            bool = true;
            break;
          } 
        }  
      if (!bool)
        return i; 
    } 
  }
  
  public static boolean f(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return false; 
    if (paramArrayOfbyte.length < paramInt1 + paramInt2)
      return false; 
    int i = paramInt1;
    int j = paramInt2;
    while (j > 0) {
      byte b1 = 0;
      byte b = paramArrayOfbyte[i++];
      j--;
      if ((b & 0xE0) == 192) {
        b1 = 1;
      } else if ((b & 0xF0) == 224) {
        b1 = 2;
      } else if ((b & 0xF8) == 240) {
        b1 = 3;
      } else if ((b & 0xFC) == 248) {
        b1 = 4;
      } else if ((b & 0xFE) == 252) {
        b1 = 5;
      } 
      if (b1 == 0) {
        if ((b & 0x80) == 128)
          return false; 
        continue;
      } 
      for (byte b2 = 0; b2 < b1; b2++) {
        if (j == 0)
          return false; 
        if ((paramArrayOfbyte[i++] & 0xC0) != 128)
          return false; 
        j--;
      } 
      if (j == 0)
        break; 
    } 
    return true;
  }
  
  public static String d(int paramInt) {
    String str1 = null;
    String str2 = null;
    try {
      if (paramInt != 0) {
        str1 = Integer.toString(paramInt / 1000) + ".";
        for (str2 = Integer.toString(paramInt % 1000); str2.length() < 3; str2 = "0" + str2);
        while (str2.endsWith("0") && str2.length() > 2)
          str2 = str2.substring(0, str2.length() - 1); 
        return str1 + str2;
      } 
      return new String("0.0");
    } catch (Exception exception) {
      return new String("0.0");
    } 
  }
  
  public static int g(String paramString) {
    int i = 0;
    byte b = 0;
    char c = (new String(".")).charAt(0);
    try {
      for (b = 0; b < paramString.length() && c == paramString.charAt(b); b = (byte)(b + 1));
      if (b == paramString.length() - 1)
        return Integer.parseInt(paramString) * 1000; 
      while (c != paramString.charAt(b))
        b = (byte)(b + 1); 
      i = Integer.parseInt(paramString.substring(0, b)) * 1000;
      for (paramString = paramString.substring(b + 1, paramString.length()); paramString.length() > 3; paramString = paramString.substring(0, paramString.length() - 1));
      while (paramString.length() < 3)
        paramString = paramString + "0"; 
      return i + Integer.parseInt(paramString);
    } catch (Exception exception) {
      return 0;
    } 
  }
  
  public static String e(int paramInt) {
    switch (paramInt) {
      case 1:
        return bb.a((short)239);
      case 2:
        return bb.a((short)328);
    } 
    return new String();
  }
  
  public static int h(String paramString) {
    return (paramString == bb.a((short)239)) ? 1 : ((paramString == bb.a((short)328)) ? 2 : 0);
  }
  
  public static byte[] b(String paramString, boolean paramBoolean) {
    byte[] arrayOfByte1 = new byte[paramString.length()];
    byte[] arrayOfByte2 = null;
    byte b1 = 0;
    int i = paramString.length();
    for (byte b2 = 0; b2 < i; b2++) {
      char c;
      switch (c = paramString.charAt(b2)) {
        case 'Ё':
          arrayOfByte1[b2] = -88;
          break;
        case 'ё':
          arrayOfByte1[b2] = -72;
          break;
        case 'Ґ':
          arrayOfByte1[b2] = -91;
          break;
        case 'Є':
          arrayOfByte1[b2] = -86;
          break;
        case 'Ї':
          arrayOfByte1[b2] = -81;
          break;
        case 'І':
          arrayOfByte1[b2] = -78;
          break;
        case 'і':
          arrayOfByte1[b2] = -77;
          break;
        case 'ґ':
          arrayOfByte1[b2] = -76;
          break;
        case 'є':
          arrayOfByte1[b2] = -70;
          break;
        case 'ї':
          arrayOfByte1[b2] = -65;
          break;
        default:
          if (c >= 'А' && c <= 'я') {
            arrayOfByte1[b2] = (byte)(c - 1040 + 192);
            break;
          } 
          if (c < '' || !paramBoolean) {
            arrayOfByte1[b2] = (byte)(c & 0xFF);
            break;
          } 
          if (c >= '' || c <= '\006') {
            if (arrayOfByte2 == null)
              arrayOfByte2 = new byte[paramString.length()]; 
            arrayOfByte2[b2] = (byte)(c >> 8);
            if ((arrayOfByte2[b2] & 0xFF) >= 6)
              b1++; 
            if (arrayOfByte2[b2] == 0)
              arrayOfByte2[b2] = -1; 
            b1++;
          } 
          arrayOfByte1[b2] = (byte)(c & 0xFF);
          break;
      } 
    } 
    if (b1 != 0) {
      byte[] arrayOfByte = new byte[arrayOfByte1.length + b1];
      byte b3 = 0;
      byte b4 = 0;
      while (b3 < arrayOfByte1.length) {
        if (arrayOfByte2[b3] != 0)
          if ((arrayOfByte2[b3] & 0xFF) == 255) {
            arrayOfByte[b4++] = 6;
          } else {
            if ((arrayOfByte2[b3] & 0xFF) >= 6)
              arrayOfByte[b4++] = 7; 
            arrayOfByte[b4++] = arrayOfByte2[b3];
          }  
        arrayOfByte[b4++] = arrayOfByte1[b3];
        b3++;
      } 
      return arrayOfByte;
    } 
    return arrayOfByte1;
  }
  
  public static String g(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt1 + paramInt2;
    StringBuffer stringBuffer = new StringBuffer(paramInt2);
    for (int j = paramInt1; j < i; j++) {
      int k;
      switch (k = paramArrayOfbyte[j] & 0xFF) {
        case 168:
          stringBuffer.append('Ё');
          break;
        case 184:
          stringBuffer.append('ё');
          break;
        case 165:
          stringBuffer.append('Ґ');
          break;
        case 170:
          stringBuffer.append('Є');
          break;
        case 175:
          stringBuffer.append('Ї');
          break;
        case 178:
          stringBuffer.append('І');
          break;
        case 179:
          stringBuffer.append('і');
          break;
        case 180:
          stringBuffer.append('ґ');
          break;
        case 186:
          stringBuffer.append('є');
          break;
        case 191:
          stringBuffer.append('ї');
          break;
        case 150:
          stringBuffer.append('-');
          break;
        default:
          try {
            if (k >= 192 && k <= 255) {
              stringBuffer.append((char)(1040 + k - 192));
              break;
            } 
            if (j < i - 1 && k <= 6) {
              j++;
              if (k == 6)
                k = 0; 
              stringBuffer.append((char)((k << 8) + (paramArrayOfbyte[j] & 0xFF)));
              break;
            } 
            if (j < i - 2 && k == 7) {
              stringBuffer.append((char)(((paramArrayOfbyte[j + 1] & 0xFF) << 8) + (paramArrayOfbyte[j + 2] & 0xFF)));
              j++;
              j++;
              break;
            } 
            stringBuffer.append((char)k);
          } catch (Exception exception) {}
          break;
      } 
    } 
    return stringBuffer.toString();
  }
  
  private static int g(int paramInt) {
    for (byte b = 0; b < ag.length; b++) {
      if (ag[b] == paramInt)
        return b + 1; 
    } 
    return -1;
  }
  
  public static long a(boolean paramBoolean) {
    return a(paramBoolean, false);
  }
  
  public static long a(boolean paramBoolean1, boolean paramBoolean2) {
    long l1;
    Calendar calendar;
    (calendar = Calendar.getInstance()).setTime(new Date());
    if (paramBoolean2) {
      l1 = a(calendar.get(1), g(calendar.get(2)), calendar.get(5), 0, 0, 0);
    } else {
      l1 = a(calendar);
    } 
    long l2 = em.f(223);
    l1 += l2 * 3600L;
    return paramBoolean1 ? l1 : b(l1);
  }
  
  public static long a(Calendar paramCalendar) {
    return a(paramCalendar.get(1), g(paramCalendar.get(2)), paramCalendar.get(5), paramCalendar.get(11), paramCalendar.get(12), paramCalendar.get(13));
  }
  
  public static String a(boolean paramBoolean1, boolean paramBoolean2, long paramLong) {
    if (paramLong == -1L)
      return ""; 
    if (paramLong == 0L)
      return "***error***"; 
    int[] arrayOfInt = a(paramLong);
    StringBuffer stringBuffer = new StringBuffer();
    if (!paramBoolean1)
      stringBuffer.append(c(arrayOfInt[3])).append('.').append(c(arrayOfInt[4])).append('.').append(arrayOfInt[5]).append(' '); 
    stringBuffer.append(c(arrayOfInt[2])).append(':').append(c(arrayOfInt[1]));
    if (paramBoolean2)
      stringBuffer.append(':').append(c(arrayOfInt[0])); 
    return stringBuffer.toString();
  }
  
  public static String b(boolean paramBoolean1, boolean paramBoolean2, long paramLong) {
    if (paramLong == -1L)
      return ""; 
    if (paramLong == 0L)
      return "***error***"; 
    int[] arrayOfInt = a(paramLong);
    StringBuffer stringBuffer = new StringBuffer();
    if (!paramBoolean1)
      stringBuffer.append(arrayOfInt[5]).append(c(arrayOfInt[4])).append(c(arrayOfInt[3])).append('_'); 
    stringBuffer.append(c(arrayOfInt[2])).append(c(arrayOfInt[1]));
    if (paramBoolean2)
      stringBuffer.append(c(arrayOfInt[0])); 
    return stringBuffer.toString();
  }
  
  public static long a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    byte b2;
    int i = 0;
    i = (paramInt1 - 1970) * 365 + paramInt3 + (paramInt1 - 1968) / 4;
    if (paramInt1 >= 2000)
      i--; 
    if (paramInt1 % 4 == 0 && paramInt1 != 2000) {
      i--;
      b2 = 29;
    } else {
      b2 = 28;
    } 
    for (byte b1 = 0; b1 < paramInt2 - 1; b1++)
      i += (b1 == 1) ? b2 : af[b1]; 
    return i * 24L * 3600L + paramInt4 * 3600L + paramInt5 * 60L + paramInt6;
  }
  
  public static int[] a(long paramLong) {
    int j = (int)(paramLong % 60L);
    int k = (int)(paramLong / 60L % 60L);
    int m = (int)((paramLong -= (60 * k)) / 3600L % 24L);
    int i = (int)((paramLong - (3600 * m)) / 86400L);
    for (char c = '޲';; c++) {
      int n;
      if ((n = i - ((c % 4 == 0 && c != 'ߐ') ? 366 : 365)) <= 0) {
        byte b3 = (c % 4 == 0 && c != 'ߐ') ? 29 : 28;
        byte b2 = 1;
        for (byte b1 = 0; b1 < 12; b1++) {
          if ((n = i - ((b1 == 1) ? b3 : af[b1])) <= 0)
            break; 
          b2++;
          i = n;
        } 
        int i1 = i;
        return new int[] { j, k, m, i1, b2, c };
      } 
      i = n;
    } 
  }
  
  public static String b(boolean paramBoolean1, boolean paramBoolean2) {
    return a(paramBoolean1, paramBoolean2, a(false));
  }
  
  public static long b(long paramLong) {
    long l = em.f(222);
    return paramLong + l * 3600L;
  }
  
  public static String c(long paramLong) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = (int)(paramLong / 86400L);
    int j = (int)((paramLong %= 86400L) / 3600L);
    int k = (int)(paramLong % 3600L / 60L);
    if (i != 0)
      stringBuffer.append(i).append(' ').append(bb.a((short)200)).append(' '); 
    if (j != 0)
      stringBuffer.append(j).append(' ').append(bb.a((short)279)).append(' '); 
    if (k != 0)
      stringBuffer.append(k).append(' ').append(bb.a((short)339)); 
    return stringBuffer.toString();
  }
  
  public static byte[] e(byte[] paramArrayOfbyte) {
    d();
    g(paramArrayOfbyte, paramArrayOfbyte.length);
    e();
    return ak;
  }
  
  private static void d() {
    ai[0] = 0L;
    ai[1] = 0L;
    ah[0] = 1732584193L;
    ah[1] = 4023233417L;
    ah[2] = 2562383102L;
    ah[3] = 271733878L;
  }
  
  private static long a(long paramLong1, long paramLong2, long paramLong3) {
    return paramLong1 & paramLong2 | (paramLong1 ^ 0xFFFFFFFFFFFFFFFFL) & paramLong3;
  }
  
  private static long b(long paramLong1, long paramLong2, long paramLong3) {
    return paramLong1 & paramLong3 | paramLong2 & (paramLong3 ^ 0xFFFFFFFFFFFFFFFFL);
  }
  
  private static long c(long paramLong1, long paramLong2, long paramLong3) {
    return paramLong1 ^ paramLong2 ^ paramLong3;
  }
  
  private static long d(long paramLong1, long paramLong2, long paramLong3) {
    return paramLong2 ^ (paramLong1 | paramLong3 ^ 0xFFFFFFFFFFFFFFFFL);
  }
  
  private static long a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    return ((int)(paramLong1 += a(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7) << (int)paramLong6 | (int)paramLong1 >>> (int)(32L - paramLong6)) + paramLong2;
  }
  
  private static long b(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    return ((int)(paramLong1 += b(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7) << (int)paramLong6 | (int)paramLong1 >>> (int)(32L - paramLong6)) + paramLong2;
  }
  
  private static long c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    return ((int)(paramLong1 += c(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7) << (int)paramLong6 | (int)paramLong1 >>> (int)(32L - paramLong6)) + paramLong2;
  }
  
  private static long d(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7) {
    return ((int)(paramLong1 += d(paramLong2, paramLong3, paramLong4) + paramLong5 + paramLong7) << (int)paramLong6 | (int)paramLong1 >>> (int)(32L - paramLong6)) + paramLong2;
  }
  
  private static void g(byte[] paramArrayOfbyte, int paramInt) {
    byte b;
    byte[] arrayOfByte = new byte[64];
    int i = (int)(ai[0] >>> 3L) & 0x3F;
    ai[0] = ai[0] + (paramInt << 3);
    if (ai[0] + (paramInt << 3) < (paramInt << 3))
      ai[1] = ai[1] + 1L; 
    ai[1] = ai[1] + (paramInt >>> 29);
    int j = 64 - i;
    if (paramInt >= j) {
      a(aj, paramArrayOfbyte, i, 0, j);
      f(aj);
      for (b = j; b + 63 < paramInt; b += 64) {
        a(arrayOfByte, paramArrayOfbyte, 0, b, 64);
        f(arrayOfByte);
      } 
      i = 0;
    } else {
      b = 0;
    } 
    a(aj, paramArrayOfbyte, i, b, paramInt - b);
  }
  
  private static void e() {
    byte[] arrayOfByte;
    a(arrayOfByte = new byte[8], ai, 8);
    int i;
    int j = ((i = (int)(ai[0] >>> 3L) & 0x3F) < 56) ? (56 - i) : (120 - i);
    g(H, j);
    g(arrayOfByte, 8);
    a(ak, ah, 16);
  }
  
  private static void a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt3; b++)
      paramArrayOfbyte1[paramInt1 + b] = paramArrayOfbyte2[paramInt2 + b]; 
  }
  
  private static void f(byte[] paramArrayOfbyte) {
    long l1 = ah[0];
    long l2 = ah[1];
    long l3 = ah[2];
    long l4 = ah[3];
    long[] arrayOfLong;
    a(arrayOfLong = new long[16], paramArrayOfbyte, 64);
    l1 = a(l1, l2, l3, l4, arrayOfLong[0], 7L, 3614090360L);
    l4 = a(l4, l1, l2, l3, arrayOfLong[1], 12L, 3905402710L);
    l3 = a(l3, l4, l1, l2, arrayOfLong[2], 17L, 606105819L);
    l2 = a(l2, l3, l4, l1, arrayOfLong[3], 22L, 3250441966L);
    l1 = a(l1, l2, l3, l4, arrayOfLong[4], 7L, 4118548399L);
    l4 = a(l4, l1, l2, l3, arrayOfLong[5], 12L, 1200080426L);
    l3 = a(l3, l4, l1, l2, arrayOfLong[6], 17L, 2821735955L);
    l2 = a(l2, l3, l4, l1, arrayOfLong[7], 22L, 4249261313L);
    l1 = a(l1, l2, l3, l4, arrayOfLong[8], 7L, 1770035416L);
    l4 = a(l4, l1, l2, l3, arrayOfLong[9], 12L, 2336552879L);
    l3 = a(l3, l4, l1, l2, arrayOfLong[10], 17L, 4294925233L);
    l2 = a(l2, l3, l4, l1, arrayOfLong[11], 22L, 2304563134L);
    l1 = a(l1, l2, l3, l4, arrayOfLong[12], 7L, 1804603682L);
    l4 = a(l4, l1, l2, l3, arrayOfLong[13], 12L, 4254626195L);
    l3 = a(l3, l4, l1, l2, arrayOfLong[14], 17L, 2792965006L);
    l2 = a(l2, l3, l4, l1, arrayOfLong[15], 22L, 1236535329L);
    l1 = b(l1, l2, l3, l4, arrayOfLong[1], 5L, 4129170786L);
    l4 = b(l4, l1, l2, l3, arrayOfLong[6], 9L, 3225465664L);
    l3 = b(l3, l4, l1, l2, arrayOfLong[11], 14L, 643717713L);
    l2 = b(l2, l3, l4, l1, arrayOfLong[0], 20L, 3921069994L);
    l1 = b(l1, l2, l3, l4, arrayOfLong[5], 5L, 3593408605L);
    l4 = b(l4, l1, l2, l3, arrayOfLong[10], 9L, 38016083L);
    l3 = b(l3, l4, l1, l2, arrayOfLong[15], 14L, 3634488961L);
    l2 = b(l2, l3, l4, l1, arrayOfLong[4], 20L, 3889429448L);
    l1 = b(l1, l2, l3, l4, arrayOfLong[9], 5L, 568446438L);
    l4 = b(l4, l1, l2, l3, arrayOfLong[14], 9L, 3275163606L);
    l3 = b(l3, l4, l1, l2, arrayOfLong[3], 14L, 4107603335L);
    l2 = b(l2, l3, l4, l1, arrayOfLong[8], 20L, 1163531501L);
    l1 = b(l1, l2, l3, l4, arrayOfLong[13], 5L, 2850285829L);
    l4 = b(l4, l1, l2, l3, arrayOfLong[2], 9L, 4243563512L);
    l3 = b(l3, l4, l1, l2, arrayOfLong[7], 14L, 1735328473L);
    l2 = b(l2, l3, l4, l1, arrayOfLong[12], 20L, 2368359562L);
    l1 = c(l1, l2, l3, l4, arrayOfLong[5], 4L, 4294588738L);
    l4 = c(l4, l1, l2, l3, arrayOfLong[8], 11L, 2272392833L);
    l3 = c(l3, l4, l1, l2, arrayOfLong[11], 16L, 1839030562L);
    l2 = c(l2, l3, l4, l1, arrayOfLong[14], 23L, 4259657740L);
    l1 = c(l1, l2, l3, l4, arrayOfLong[1], 4L, 2763975236L);
    l4 = c(l4, l1, l2, l3, arrayOfLong[4], 11L, 1272893353L);
    l3 = c(l3, l4, l1, l2, arrayOfLong[7], 16L, 4139469664L);
    l2 = c(l2, l3, l4, l1, arrayOfLong[10], 23L, 3200236656L);
    l1 = c(l1, l2, l3, l4, arrayOfLong[13], 4L, 681279174L);
    l4 = c(l4, l1, l2, l3, arrayOfLong[0], 11L, 3936430074L);
    l3 = c(l3, l4, l1, l2, arrayOfLong[3], 16L, 3572445317L);
    l2 = c(l2, l3, l4, l1, arrayOfLong[6], 23L, 76029189L);
    l1 = c(l1, l2, l3, l4, arrayOfLong[9], 4L, 3654602809L);
    l4 = c(l4, l1, l2, l3, arrayOfLong[12], 11L, 3873151461L);
    l3 = c(l3, l4, l1, l2, arrayOfLong[15], 16L, 530742520L);
    l2 = c(l2, l3, l4, l1, arrayOfLong[2], 23L, 3299628645L);
    l1 = d(l1, l2, l3, l4, arrayOfLong[0], 6L, 4096336452L);
    l4 = d(l4, l1, l2, l3, arrayOfLong[7], 10L, 1126891415L);
    l3 = d(l3, l4, l1, l2, arrayOfLong[14], 15L, 2878612391L);
    l2 = d(l2, l3, l4, l1, arrayOfLong[5], 21L, 4237533241L);
    l1 = d(l1, l2, l3, l4, arrayOfLong[12], 6L, 1700485571L);
    l4 = d(l4, l1, l2, l3, arrayOfLong[3], 10L, 2399980690L);
    l3 = d(l3, l4, l1, l2, arrayOfLong[10], 15L, 4293915773L);
    l2 = d(l2, l3, l4, l1, arrayOfLong[1], 21L, 2240044497L);
    l1 = d(l1, l2, l3, l4, arrayOfLong[8], 6L, 1873313359L);
    l4 = d(l4, l1, l2, l3, arrayOfLong[15], 10L, 4264355552L);
    l3 = d(l3, l4, l1, l2, arrayOfLong[6], 15L, 2734768916L);
    l2 = d(l2, l3, l4, l1, arrayOfLong[13], 21L, 1309151649L);
    l1 = d(l1, l2, l3, l4, arrayOfLong[4], 6L, 4149444226L);
    l4 = d(l4, l1, l2, l3, arrayOfLong[11], 10L, 3174756917L);
    l3 = d(l3, l4, l1, l2, arrayOfLong[2], 15L, 718787259L);
    l2 = d(l2, l3, l4, l1, arrayOfLong[9], 21L, 3951481745L);
    ah[0] = ah[0] + l1;
    ah[1] = ah[1] + l2;
    ah[2] = ah[2] + l3;
    ah[3] = ah[3] + l4;
  }
  
  private static void a(byte[] paramArrayOfbyte, long[] paramArrayOflong, int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramInt; b2 += 4) {
      paramArrayOfbyte[b2] = (byte)(int)(paramArrayOflong[b1] & 0xFFL);
      paramArrayOfbyte[b2 + 1] = (byte)(int)(paramArrayOflong[b1] >>> 8L & 0xFFL);
      paramArrayOfbyte[b2 + 2] = (byte)(int)(paramArrayOflong[b1] >>> 16L & 0xFFL);
      paramArrayOfbyte[b2 + 3] = (byte)(int)(paramArrayOflong[b1] >>> 24L & 0xFFL);
      b1++;
    } 
  }
  
  private static void a(long[] paramArrayOflong, byte[] paramArrayOfbyte, int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramInt; b2 += 4) {
      paramArrayOflong[b1] = b(paramArrayOfbyte[b2]) | b(paramArrayOfbyte[b2 + 1]) << 8L | b(paramArrayOfbyte[b2 + 2]) << 16L | b(paramArrayOfbyte[b2 + 3]) << 24L;
      b1++;
    } 
  }
  
  private static long b(byte paramByte) {
    return (paramByte < 0) ? (paramByte & 0xFF) : paramByte;
  }
  
  public static String c() {
    Calendar calendar;
    (calendar = Calendar.getInstance()).setTime(new Date());
    byte b = -1;
    switch (calendar.get(7)) {
      case 2:
        b = 19;
        break;
      case 3:
        b = 20;
        break;
      case 4:
        b = 21;
        break;
      case 5:
        b = 22;
        break;
      case 6:
        b = 23;
        break;
      case 7:
        b = 24;
        break;
      case 1:
        b = 25;
        break;
    } 
    return bb.a(b);
  }
  
  private static boolean a(char paramChar, boolean paramBoolean) {
    return paramBoolean ? (((paramChar >= 'A' && paramChar <= 'Z') || (paramChar >= 'a' && paramChar <= 'z') || (paramChar >= '0' && paramChar <= '9') || paramChar == '-')) : ((paramChar <= ' ' || paramChar == '"') ? false : (((paramChar & 0xFF00) == 0)));
  }
  
  public static Vector i(String paramString) {
    if (paramString.indexOf('.') == -1)
      return null; 
    Vector vector = new Vector();
    int i = paramString.length();
    int j = 0;
    int k;
    while (j < i && (k = paramString.indexOf('.', j)) != -1) {
      int m;
      for (m = k - 1; m >= 0 && a(paramString.charAt(m), true); m--);
      int n;
      for (n = k + 1; n < i && a(paramString.charAt(n), false); n++);
      if (m == -1 || !a(paramString.charAt(m), true))
        m++; 
      j = n;
      if (k == m || n - k < 2)
        continue; 
      vector.addElement("http://" + paramString.substring(m, n));
    } 
    return (vector.size() == 0) ? null : vector;
  }
  
  public static int a(String paramString, int paramInt) {
    if (paramString == null)
      return paramInt; 
    int i = paramInt;
    try {
      i = Integer.parseInt(paramString);
    } catch (Exception exception) {}
    return i;
  }
  
  public static byte[] a(String paramString, char paramChar, int paramInt) {
    byte[] arrayOfByte1 = new byte[16];
    byte[] arrayOfByte2;
    int i;
    if ((i = (arrayOfByte2 = b(paramString, paramChar, paramInt)).length) > 16)
      i = 16; 
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
    return arrayOfByte1;
  }
  
  public static byte[] b(String paramString, char paramChar, int paramInt) {
    String[] arrayOfString = a(paramString, paramChar);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str;
      if ((str = arrayOfString[b]).charAt(0) == '*') {
        for (byte b1 = 1; b1 < str.length(); b1++)
          byteArrayOutputStream.write((byte)str.charAt(b1)); 
      } else {
        byteArrayOutputStream.write(Integer.parseInt(str, paramInt));
      } 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static int[] c(String paramString, char paramChar, int paramInt) {
    String[] arrayOfString;
    int[] arrayOfInt = new int[(arrayOfString = a(paramString, paramChar)).length];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfInt[b] = Integer.parseInt(arrayOfString[b], paramInt); 
    return arrayOfInt;
  }
  
  public static String[] a(String paramString, char paramChar) {
    Vector vector = new Vector();
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c;
      if ((c = paramString.charAt(b)) == paramChar) {
        vector.addElement(stringBuffer.toString());
        stringBuffer.delete(0, stringBuffer.length());
      } else if (c != '\r') {
        stringBuffer.append(c);
      } 
    } 
    vector.addElement(stringBuffer.toString());
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  public static String[] a(String paramString1, String paramString2) {
    if (paramString1.indexOf(paramString2) < 0)
      return new String[] { paramString1 }; 
    Vector vector = new Vector();
    int i = 0;
    int j;
    for (j = paramString1.indexOf(paramString2, 0); j >= 0; j = paramString1.indexOf(paramString2, i)) {
      vector.addElement(paramString1.substring(i, j));
      i = j + paramString2.length();
    } 
    if (i == paramString1.length()) {
      vector.addElement("");
    } else {
      vector.addElement(paramString1.substring(i, paramString1.length()));
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  public static String[] b(String paramString, char paramChar) {
    if (paramString.indexOf(paramChar) < 0)
      return new String[] { paramString }; 
    Vector vector = new Vector();
    int i = 0;
    int j;
    for (j = paramString.indexOf(paramChar, 0); j >= 0; j = paramString.indexOf(paramChar, i)) {
      vector.addElement(paramString.substring(i, j));
      i = j + 1;
    } 
    if (i == paramString.length()) {
      vector.addElement("");
    } else {
      vector.addElement(paramString.substring(i, paramString.length()));
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  public static byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte2 == null)
      return paramArrayOfbyte1; 
    if (paramArrayOfbyte1 == null)
      return paramArrayOfbyte2; 
    byte[] arrayOfByte = new byte[paramArrayOfbyte2.length * 8];
    byte b1;
    for (b1 = 0; b1 < paramArrayOfbyte2.length; b1 += 2) {
      System.arraycopy(V, 0, arrayOfByte, b1 * 8, V.length);
      System.arraycopy(paramArrayOfbyte2, b1, arrayOfByte, b1 * 8 + V.length, 2);
      System.arraycopy(W, 0, arrayOfByte, b1 * 8 + V.length + 2, W.length);
    } 
    b1 = 0;
    for (byte b2 = 0; b2 < paramArrayOfbyte1.length; b2 += 16) {
      byte[] arrayOfByte1 = new byte[16];
      System.arraycopy(paramArrayOfbyte1, b2, arrayOfByte1, 0, 16);
      for (byte b = 0; b < arrayOfByte.length; b += 16) {
        byte[] arrayOfByte2 = new byte[16];
        System.arraycopy(arrayOfByte, b, arrayOfByte2, 0, 16);
        if (arrayOfByte1 == arrayOfByte2) {
          b1 = 1;
          break;
        } 
      } 
      if (b1 == 0) {
        byte[] arrayOfByte2 = new byte[arrayOfByte.length + 16];
        System.arraycopy(arrayOfByte, 0, arrayOfByte2, 0, arrayOfByte.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, arrayOfByte.length, arrayOfByte1.length);
        arrayOfByte = arrayOfByte2;
        b1 = 0;
      } 
    } 
    return arrayOfByte;
  }
  
  public static String j(String paramString) {
    int i = 0;
    int j = 0;
    int k = 0;
    StringBuffer stringBuffer = new StringBuffer(paramString.length());
    stringBuffer.append(paramString.substring(j, i));
    j = i;
    while (i && (i = paramString.indexOf("&", k)) >= 0 && (k = paramString.indexOf(";", j)) >= 0) {
      j = k + 1;
      String str;
      if ((str = paramString.substring(i, k + 1)).equals("&lt;")) {
        stringBuffer.append("<");
        continue;
      } 
      if (str.equals("&gt;")) {
        stringBuffer.append(">");
        continue;
      } 
      if (str.equals("&amp;")) {
        stringBuffer.append("&");
        continue;
      } 
      if (str.equals("&quot;")) {
        stringBuffer.append("\"");
        continue;
      } 
      int m = 0;
      try {
        m = Integer.parseInt(str.substring(1, str.length() - 1));
        stringBuffer.append(m);
      } catch (Exception exception) {
        stringBuffer.append(str);
      } 
    } 
    if (j < paramString.length())
      stringBuffer.append(paramString.substring(j)); 
    return stringBuffer.toString();
  }
  
  public static String k(String paramString) {
    int i = 0;
    int j = 0;
    int k = 0;
    StringBuffer stringBuffer = new StringBuffer(paramString.length());
    stringBuffer.append(paramString.substring(j, i));
    j = i;
    while (i && (i = paramString.indexOf("<", k)) >= 0 && (k = paramString.indexOf(">", j)) >= 0) {
      j = k + 1;
      String str;
      if ((str = paramString.substring(i, k + 1).toLowerCase()).equals("<br>")) {
        stringBuffer.append("\n");
        continue;
      } 
      if (str.equals("<br />")) {
        stringBuffer.append("\n");
        continue;
      } 
      if (str.equals("<br/>")) {
        stringBuffer.append("\n");
        continue;
      } 
      stringBuffer.append("");
    } 
    if (j < paramString.length())
      stringBuffer.append(paramString.substring(j)); 
    return stringBuffer.toString();
  }
  
  public static String l(String paramString) {
    StringBuffer stringBuffer = new StringBuffer(paramString.length());
    for (byte b = 0; b < paramString.length(); b++) {
      char c;
      switch (c = paramString.charAt(b)) {
        case '<':
          stringBuffer.append("&lt;");
          break;
        case '>':
          stringBuffer.append("&gt;");
          break;
        case '&':
          stringBuffer.append("&amp;");
          break;
        default:
          stringBuffer.append(c);
          break;
      } 
    } 
    return stringBuffer.toString();
  }
  
  public static Image a(Image paramImage, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getWidth : ()I
    //   4: istore_3
    //   5: aload_0
    //   6: invokevirtual getHeight : ()I
    //   9: istore #4
    //   11: iload_2
    //   12: ifne -> 22
    //   15: iload_1
    //   16: ifeq -> 22
    //   19: goto -> 56
    //   22: iload_1
    //   23: ifne -> 40
    //   26: iload_2
    //   27: ifeq -> 40
    //   30: iload_2
    //   31: iload_3
    //   32: imul
    //   33: iload #4
    //   35: idiv
    //   36: istore_1
    //   37: goto -> 63
    //   40: iload #4
    //   42: iload_3
    //   43: if_icmplt -> 56
    //   46: iload_2
    //   47: iload_3
    //   48: imul
    //   49: iload #4
    //   51: idiv
    //   52: istore_1
    //   53: goto -> 63
    //   56: iload_1
    //   57: iload #4
    //   59: imul
    //   60: iload_3
    //   61: idiv
    //   62: istore_2
    //   63: iload_1
    //   64: iload_2
    //   65: invokestatic createImage : (II)Ljavax/microedition/lcdui/Image;
    //   68: dup
    //   69: astore #5
    //   71: invokevirtual getGraphics : ()Ljavax/microedition/lcdui/Graphics;
    //   74: astore #6
    //   76: iconst_0
    //   77: istore #7
    //   79: iload #7
    //   81: iload_2
    //   82: if_icmpge -> 152
    //   85: iconst_0
    //   86: istore #8
    //   88: iload #8
    //   90: iload_1
    //   91: if_icmpge -> 146
    //   94: aload #6
    //   96: iload #8
    //   98: iload #7
    //   100: iconst_1
    //   101: iconst_1
    //   102: invokevirtual setClip : (IIII)V
    //   105: iload #8
    //   107: iload_3
    //   108: imul
    //   109: iload_1
    //   110: idiv
    //   111: istore #9
    //   113: iload #7
    //   115: iload #4
    //   117: imul
    //   118: iload_2
    //   119: idiv
    //   120: istore #10
    //   122: aload #6
    //   124: aload_0
    //   125: iload #8
    //   127: iload #9
    //   129: isub
    //   130: iload #7
    //   132: iload #10
    //   134: isub
    //   135: bipush #20
    //   137: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   140: iinc #8, 1
    //   143: goto -> 88
    //   146: iinc #7, 1
    //   149: goto -> 79
    //   152: aload #5
    //   154: invokestatic createImage : (Ljavax/microedition/lcdui/Image;)Ljavax/microedition/lcdui/Image;
    //   157: aconst_null
    //   158: astore #7
    //   160: areturn
  }
  
  public static String m(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    byte b1 = 0;
    byte b2 = 0;
    int i = paramString.length();
    while (b2 < i) {
      char c;
      if ((c = paramString.charAt(b2)) == '{') {
        b1++;
      } else if (c == '}') {
        b1--;
      } 
      if (b1 == 1) {
        b2++;
        boolean bool = false;
        StringBuffer stringBuffer1 = new StringBuffer();
        while (b1 == 1) {
          if ((c = paramString.charAt(b2++)) == '{') {
            b1++;
            break;
          } 
          if (c == '}') {
            b1--;
            break;
          } 
          if (c == '\\') {
            if (stringBuffer1.toString().equals("tab"))
              stringBuffer.append(' '); 
            stringBuffer1.setLength(0);
            char c1;
            if ((c1 = paramString.charAt(b2)) == '\\') {
              stringBuffer.append('\\');
              b2++;
              bool = false;
              continue;
            } 
            if (c1 == '\'') {
              char c2 = (char)Integer.parseInt(paramString.substring(b2 + 1, b2 + 3), 16);
              stringBuffer.append((char)((c2 > '') ? ((c2 == '¨') ? 'Ё' : ((c2 == '¸') ? 'ё' : (c2 + 848))) : c2));
              b2 += 3;
              bool = false;
              continue;
            } 
            bool = true;
            continue;
          } 
          if ((c == ' ' || c == '\n') && bool) {
            bool = false;
            if (stringBuffer1.toString().equals("par"))
              stringBuffer.append('\n'); 
            stringBuffer1.setLength(0);
            continue;
          } 
          if (!bool && c >= ' ') {
            stringBuffer.append(c);
            continue;
          } 
          stringBuffer1.append(c);
        } 
      } 
      b2++;
    } 
    return stringBuffer.toString();
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, int paramInt) {
    int i = paramString2.length();
    int j = 0;
    int k = 0;
    if (paramInt == 0)
      paramInt = paramString1.length(); 
    StringBuffer stringBuffer = new StringBuffer(paramInt);
    if ((k = paramString1.indexOf(paramString2, 0)) == -1)
      return paramString1; 
    while (true) {
      if ((k = paramString1.indexOf(paramString2, k)) == -1) {
        if (k != j)
          stringBuffer.append(paramString1.substring(j)); 
        break;
      } 
      if (k != j)
        stringBuffer.append(paramString1.substring(j, k)); 
      stringBuffer.append(paramString3);
      j = k += i;
    } 
    return stringBuffer.toString();
  }
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    return a(paramString1, paramString2, paramString3, 0);
  }
  
  public static byte[] a(HttpConnection paramHttpConnection) throws IOException {
    InputStream inputStream = paramHttpConnection.openInputStream();
    int i = (int)paramHttpConnection.getLength();
    int j = 4096;
    if (i > 10)
      j = i + 1; 
    byte[] arrayOfByte = new byte[j];
    byte b = 0;
    while (true) {
      int k;
      if ((k = inputStream.read()) != -1 && b < arrayOfByte.length) {
        arrayOfByte[b++] = (byte)k;
        continue;
      } 
      if (b == arrayOfByte.length) {
        byte[] arrayOfByte2 = new byte[arrayOfByte.length + arrayOfByte.length];
        System.arraycopy(arrayOfByte, 0, arrayOfByte2, 0, arrayOfByte.length);
        arrayOfByte = arrayOfByte2;
        if (k != -1)
          arrayOfByte[b++] = (byte)k; 
        continue;
      } 
      byte[] arrayOfByte1 = new byte[b];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, b);
      inputStream.close();
      return arrayOfByte1;
    } 
  }
  
  public static String c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (!paramBoolean)
      return g(paramArrayOfbyte, paramInt1, paramInt2); 
    l(paramArrayOfbyte, paramInt1, paramInt2);
    return g(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private static void l(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte b = 0;
    for (byte b1 = 0; b1 < paramInt2; b1++) {
      byte b2 = paramArrayOfbyte[paramInt1 + b1];
      paramArrayOfbyte[paramInt1 + b1] = (byte)(paramArrayOfbyte[paramInt1 + b1] ^ a(b, b1));
      b = b2;
    } 
  }
  
  private static void m(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte b = 0;
    for (byte b1 = 0; b1 < paramInt2; b1++) {
      paramArrayOfbyte[paramInt1 + b1] = (byte)(paramArrayOfbyte[paramInt1 + b1] ^ a(b, b1));
      b = paramArrayOfbyte[paramInt1 + b1];
    } 
  }
  
  private static int a(int paramInt1, int paramInt2) {
    return 55 + paramInt2 + (paramInt2 << 4) + paramInt1;
  }
  
  public static byte[] a(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    byte[] arrayOfByte = b(paramString, paramBoolean1);
    if (!paramBoolean2)
      return arrayOfByte; 
    m(arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  static {
    B[12] = -107;
    B[11] = 17;
  }
  
  static {
    a("*de,ad,00,00,00", ',', 16);
    a("*wJImm,00,00,00,00,00", ',', 16);
  }
  
  static {
    (new char[16])[0] = '0';
    (new char[16])[1] = '1';
    (new char[16])[2] = '2';
    (new char[16])[3] = '3';
    (new char[16])[4] = '4';
    (new char[16])[5] = '5';
    (new char[16])[6] = '6';
    (new char[16])[7] = '7';
    (new char[16])[8] = '8';
    (new char[16])[9] = '9';
    (new char[16])[10] = 'a';
    (new char[16])[11] = 'b';
    (new char[16])[12] = 'c';
    (new char[16])[13] = 'd';
    (new char[16])[14] = 'e';
    (new char[16])[15] = 'f';
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */