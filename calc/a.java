package calc;

import java.util.Vector;

public final class a {
  public static Vector a;
  
  private static int d;
  
  private static int e = 0;
  
  private static final byte[] f = new byte[] { 
      0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 
      2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
      2, 2, 2, 2, 2, 10, 10, 5, 5, 4, 
      4, 4, 9, 7, 4, 8, 6, 6, 1, 1 };
  
  public char b;
  
  public byte c;
  
  private c g;
  
  private String h;
  
  private a(char paramChar, byte paramByte, String paramString) {
    this.b = paramChar;
    this.h = paramString;
    this.c = paramByte;
  }
  
  private a(char paramChar, byte paramByte, c paramc) {
    this.b = paramChar;
    this.g = new c(paramc);
    this.c = paramByte;
  }
  
  private c a(int paramInt) {
    b(paramInt);
    if (b.b(26) > 0)
      this.g.a(c(this.g), 2); 
    return this.g;
  }
  
  public static int a() {
    switch (b.b(26)) {
      case 0:
        return 10;
      case 1:
        return 2;
      case 2:
        return 8;
      case 3:
        return 16;
    } 
    return 10;
  }
  
  private static int c() {
    switch (b.b(27)) {
      case 0:
        return 1;
      case 1:
        return 2;
      case 2:
        return 4;
    } 
    return 4;
  }
  
  private static c a(c paramc) {
    c c1 = new c(c.q);
    switch (b.b(23)) {
      case 1:
        paramc.e(c1);
        paramc.d(180);
        return paramc;
      case 2:
        paramc.e(c1);
        paramc.d(200);
        return paramc;
      case 3:
        paramc.e(c1);
        paramc.c(2);
        return paramc;
    } 
    return paramc;
  }
  
  private static c b(c paramc) {
    c c1 = new c(c.q);
    switch (b.b(23)) {
      case 1:
        paramc.c(180);
        paramc.f(c1);
        return paramc;
      case 2:
        paramc.c(200);
        paramc.f(c1);
        return paramc;
      case 3:
        paramc.f(c1);
        paramc.d(2);
        return paramc;
    } 
    return paramc;
  }
  
  public static String a(c paramc, int paramInt) {
    if (paramInt != 10) {
      c c1;
      (c1 = new c(paramc)).c();
      String str1 = c1.g(paramInt);
      String str2 = "123456789ABCDEF.R";
      int i = 0;
      int j = str1.length();
      for (byte b = 0; b < str2.length(); b++) {
        if ((i = str1.indexOf(str2.charAt(b), 0)) >= 0 && i < j)
          j = i; 
      } 
      return (str1.substring(j).length() > 0) ? str1.substring(j) : "0";
    } 
    return paramc.g(10);
  }
  
  private static String c(c paramc) {
    c c1;
    (c1 = new c(paramc)).c();
    String str;
    if ((str = c1.g(2)).length() > c() * 8)
      str = str.substring(str.length() - c() * 8, str.length()); 
    return str;
  }
  
  private static c d(c paramc) {
    String str1 = c(paramc);
    String str2 = "";
    for (byte b = 0; b < str1.length(); b++) {
      if (str1.charAt(b) == '1') {
      
      } else {
        continue;
      } 
      str2 = str2.concat((str1.charAt(b) == '0') ? "1" : "0");
      continue;
    } 
    c c1;
    return c1 = new c(str2, 2);
  }
  
  private int b(int paramInt) {
    // Byte code:
    //   0: ldc ' pWXY'
    //   2: aload_0
    //   3: getfield b : C
    //   6: invokevirtual indexOf : (I)I
    //   9: iflt -> 453
    //   12: getstatic calc/a.e : I
    //   15: ifne -> 375
    //   18: aload_0
    //   19: getfield b : C
    //   22: lookupswitch default -> 132, 87 -> 78, 88 -> 96, 89 -> 114, 112 -> 64
    //   64: aload_0
    //   65: new calc/c
    //   68: dup
    //   69: getstatic calc/c.q : Lcalc/c;
    //   72: invokespecial <init> : (Lcalc/c;)V
    //   75: goto -> 129
    //   78: aload_0
    //   79: new calc/c
    //   82: dup
    //   83: bipush #40
    //   85: invokestatic a : (I)Ljava/lang/String;
    //   88: bipush #16
    //   90: invokespecial <init> : (Ljava/lang/String;I)V
    //   93: goto -> 129
    //   96: aload_0
    //   97: new calc/c
    //   100: dup
    //   101: bipush #41
    //   103: invokestatic a : (I)Ljava/lang/String;
    //   106: bipush #16
    //   108: invokespecial <init> : (Ljava/lang/String;I)V
    //   111: goto -> 129
    //   114: aload_0
    //   115: new calc/c
    //   118: dup
    //   119: bipush #42
    //   121: invokestatic a : (I)Ljava/lang/String;
    //   124: bipush #16
    //   126: invokespecial <init> : (Ljava/lang/String;I)V
    //   129: putfield g : Lcalc/c;
    //   132: aload_0
    //   133: getfield g : Lcalc/c;
    //   136: ifnonnull -> 164
    //   139: aload_0
    //   140: getfield h : Ljava/lang/String;
    //   143: ifnull -> 164
    //   146: aload_0
    //   147: new calc/c
    //   150: dup
    //   151: aload_0
    //   152: getfield h : Ljava/lang/String;
    //   155: invokestatic a : ()I
    //   158: invokespecial <init> : (Ljava/lang/String;I)V
    //   161: putfield g : Lcalc/c;
    //   164: iload_1
    //   165: iconst_1
    //   166: iadd
    //   167: getstatic calc/a.a : Ljava/util/Vector;
    //   170: invokevirtual size : ()I
    //   173: if_icmpge -> 292
    //   176: ldc 'q!'
    //   178: getstatic calc/a.a : Ljava/util/Vector;
    //   181: iload_1
    //   182: iconst_1
    //   183: iadd
    //   184: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   187: checkcast calc/a
    //   190: getfield b : C
    //   193: invokevirtual indexOf : (I)I
    //   196: iflt -> 292
    //   199: getstatic calc/a.a : Ljava/util/Vector;
    //   202: iload_1
    //   203: iconst_1
    //   204: iadd
    //   205: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   208: checkcast calc/a
    //   211: getfield b : C
    //   214: lookupswitch default -> 286, 33 -> 250, 113 -> 240
    //   240: aload_0
    //   241: getfield g : Lcalc/c;
    //   244: invokevirtual g : ()V
    //   247: goto -> 286
    //   250: aload_0
    //   251: getfield g : Lcalc/c;
    //   254: aload_0
    //   255: getfield g : Lcalc/c;
    //   258: invokevirtual toString : ()Ljava/lang/String;
    //   261: invokevirtual a : (Ljava/lang/String;)V
    //   264: aload_0
    //   265: getfield g : Lcalc/c;
    //   268: invokevirtual f : ()Z
    //   271: ifeq -> 284
    //   274: aload_0
    //   275: getfield g : Lcalc/c;
    //   278: invokevirtual y : ()V
    //   281: goto -> 286
    //   284: iconst_m1
    //   285: ireturn
    //   286: getstatic calc/a.a : Ljava/util/Vector;
    //   289: goto -> 355
    //   292: iload_1
    //   293: iconst_1
    //   294: iadd
    //   295: getstatic calc/a.a : Ljava/util/Vector;
    //   298: invokevirtual size : ()I
    //   301: if_icmpge -> 361
    //   304: ldc ' pWXY'
    //   306: getstatic calc/a.a : Ljava/util/Vector;
    //   309: iload_1
    //   310: iconst_1
    //   311: iadd
    //   312: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   315: checkcast calc/a
    //   318: getfield b : C
    //   321: invokevirtual indexOf : (I)I
    //   324: ifle -> 361
    //   327: aload_0
    //   328: getfield g : Lcalc/c;
    //   331: getstatic calc/a.a : Ljava/util/Vector;
    //   334: iload_1
    //   335: iconst_1
    //   336: iadd
    //   337: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   340: checkcast calc/a
    //   343: iload_1
    //   344: iconst_1
    //   345: iadd
    //   346: invokespecial a : (I)Lcalc/c;
    //   349: invokevirtual e : (Lcalc/c;)V
    //   352: getstatic calc/a.a : Ljava/util/Vector;
    //   355: iload_1
    //   356: iconst_1
    //   357: iadd
    //   358: invokevirtual removeElementAt : (I)V
    //   361: aload_0
    //   362: bipush #32
    //   364: putfield b : C
    //   367: aload_0
    //   368: iconst_3
    //   369: putfield c : B
    //   372: goto -> 451
    //   375: getstatic calc/a.e : I
    //   378: iconst_3
    //   379: if_icmpne -> 451
    //   382: iload_1
    //   383: iconst_1
    //   384: iadd
    //   385: getstatic calc/a.a : Ljava/util/Vector;
    //   388: invokevirtual size : ()I
    //   391: if_icmpge -> 451
    //   394: ldc ' pWXY'
    //   396: getstatic calc/a.a : Ljava/util/Vector;
    //   399: iload_1
    //   400: iconst_1
    //   401: iadd
    //   402: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   405: checkcast calc/a
    //   408: getfield b : C
    //   411: invokevirtual indexOf : (I)I
    //   414: ifne -> 451
    //   417: aload_0
    //   418: getfield g : Lcalc/c;
    //   421: getstatic calc/a.a : Ljava/util/Vector;
    //   424: iload_1
    //   425: iconst_1
    //   426: iadd
    //   427: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   430: checkcast calc/a
    //   433: iload_1
    //   434: iconst_1
    //   435: iadd
    //   436: invokespecial a : (I)Lcalc/c;
    //   439: invokevirtual e : (Lcalc/c;)V
    //   442: getstatic calc/a.a : Ljava/util/Vector;
    //   445: iload_1
    //   446: iconst_1
    //   447: iadd
    //   448: invokevirtual removeElementAt : (I)V
    //   451: iconst_0
    //   452: ireturn
    //   453: ldc 'dvshtxbngmiojSHTIOJ$'
    //   455: aload_0
    //   456: getfield b : C
    //   459: invokevirtual indexOf : (I)I
    //   462: iflt -> 1165
    //   465: iload_1
    //   466: iconst_1
    //   467: iadd
    //   468: getstatic calc/a.a : Ljava/util/Vector;
    //   471: invokevirtual size : ()I
    //   474: if_icmpge -> 1163
    //   477: getstatic calc/a.a : Ljava/util/Vector;
    //   480: iload_1
    //   481: iconst_1
    //   482: iadd
    //   483: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   486: checkcast calc/a
    //   489: getfield c : B
    //   492: iconst_4
    //   493: if_icmpge -> 1163
    //   496: aload_0
    //   497: new calc/c
    //   500: dup
    //   501: getstatic calc/a.a : Ljava/util/Vector;
    //   504: iload_1
    //   505: iconst_1
    //   506: iadd
    //   507: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   510: checkcast calc/a
    //   513: iload_1
    //   514: iconst_1
    //   515: iadd
    //   516: invokespecial a : (I)Lcalc/c;
    //   519: invokespecial <init> : (Lcalc/c;)V
    //   522: putfield g : Lcalc/c;
    //   525: aload_0
    //   526: getfield b : C
    //   529: tableswitch default -> 1141, 36 -> 976, 37 -> 1141, 38 -> 1141, 39 -> 1141, 40 -> 1141, 41 -> 1141, 42 -> 1141, 43 -> 1141, 44 -> 1141, 45 -> 1141, 46 -> 1141, 47 -> 1141, 48 -> 1141, 49 -> 1141, 50 -> 1141, 51 -> 1141, 52 -> 1141, 53 -> 1141, 54 -> 1141, 55 -> 1141, 56 -> 1141, 57 -> 1141, 58 -> 1141, 59 -> 1141, 60 -> 1141, 61 -> 1141, 62 -> 1141, 63 -> 1141, 64 -> 1141, 65 -> 1141, 66 -> 1141, 67 -> 1141, 68 -> 1141, 69 -> 1141, 70 -> 1141, 71 -> 1141, 72 -> 1050, 73 -> 1070, 74 -> 1090, 75 -> 1141, 76 -> 1141, 77 -> 1141, 78 -> 1141, 79 -> 1080, 80 -> 1141, 81 -> 1141, 82 -> 1141, 83 -> 1040, 84 -> 1060, 85 -> 1141, 86 -> 1141, 87 -> 1141, 88 -> 1141, 89 -> 1141, 90 -> 1141, 91 -> 1141, 92 -> 1141, 93 -> 1141, 94 -> 1141, 95 -> 1141, 96 -> 1141, 97 -> 1141, 98 -> 1000, 99 -> 1141, 100 -> 884, 101 -> 1141, 102 -> 1141, 103 -> 1020, 104 -> 928, 105 -> 1100, 106 -> 1120, 107 -> 1141, 108 -> 1141, 109 -> 1030, 110 -> 1010, 111 -> 1110, 112 -> 1141, 113 -> 1141, 114 -> 1141, 115 -> 904, 116 -> 952, 117 -> 1141, 118 -> 894, 119 -> 1141, 120 -> 990
    //   884: aload_0
    //   885: getfield g : Lcalc/c;
    //   888: invokevirtual j : ()V
    //   891: goto -> 1141
    //   894: aload_0
    //   895: getfield g : Lcalc/c;
    //   898: invokevirtual h : ()V
    //   901: goto -> 1141
    //   904: aload_0
    //   905: getfield g : Lcalc/c;
    //   908: aload_0
    //   909: getfield g : Lcalc/c;
    //   912: invokestatic a : (Lcalc/c;)Lcalc/c;
    //   915: invokevirtual a : (Lcalc/c;)V
    //   918: aload_0
    //   919: getfield g : Lcalc/c;
    //   922: invokevirtual m : ()V
    //   925: goto -> 1141
    //   928: aload_0
    //   929: getfield g : Lcalc/c;
    //   932: aload_0
    //   933: getfield g : Lcalc/c;
    //   936: invokestatic a : (Lcalc/c;)Lcalc/c;
    //   939: invokevirtual a : (Lcalc/c;)V
    //   942: aload_0
    //   943: getfield g : Lcalc/c;
    //   946: invokevirtual n : ()V
    //   949: goto -> 1141
    //   952: aload_0
    //   953: getfield g : Lcalc/c;
    //   956: aload_0
    //   957: getfield g : Lcalc/c;
    //   960: invokestatic a : (Lcalc/c;)Lcalc/c;
    //   963: invokevirtual a : (Lcalc/c;)V
    //   966: aload_0
    //   967: getfield g : Lcalc/c;
    //   970: invokevirtual o : ()V
    //   973: goto -> 1141
    //   976: aload_0
    //   977: getfield g : Lcalc/c;
    //   980: aload_0
    //   981: getfield g : Lcalc/c;
    //   984: invokestatic d : (Lcalc/c;)Lcalc/c;
    //   987: goto -> 1138
    //   990: aload_0
    //   991: getfield g : Lcalc/c;
    //   994: invokevirtual i : ()V
    //   997: goto -> 1141
    //   1000: aload_0
    //   1001: getfield g : Lcalc/c;
    //   1004: invokevirtual a : ()V
    //   1007: goto -> 1141
    //   1010: aload_0
    //   1011: getfield g : Lcalc/c;
    //   1014: invokevirtual k : ()V
    //   1017: goto -> 1141
    //   1020: aload_0
    //   1021: getfield g : Lcalc/c;
    //   1024: invokevirtual l : ()V
    //   1027: goto -> 1141
    //   1030: aload_0
    //   1031: getfield g : Lcalc/c;
    //   1034: invokevirtual b : ()V
    //   1037: goto -> 1141
    //   1040: aload_0
    //   1041: getfield g : Lcalc/c;
    //   1044: invokevirtual s : ()V
    //   1047: goto -> 1141
    //   1050: aload_0
    //   1051: getfield g : Lcalc/c;
    //   1054: invokevirtual t : ()V
    //   1057: goto -> 1141
    //   1060: aload_0
    //   1061: getfield g : Lcalc/c;
    //   1064: invokevirtual u : ()V
    //   1067: goto -> 1141
    //   1070: aload_0
    //   1071: getfield g : Lcalc/c;
    //   1074: invokevirtual v : ()V
    //   1077: goto -> 1141
    //   1080: aload_0
    //   1081: getfield g : Lcalc/c;
    //   1084: invokevirtual w : ()V
    //   1087: goto -> 1141
    //   1090: aload_0
    //   1091: getfield g : Lcalc/c;
    //   1094: invokevirtual x : ()V
    //   1097: goto -> 1141
    //   1100: aload_0
    //   1101: getfield g : Lcalc/c;
    //   1104: invokevirtual p : ()V
    //   1107: goto -> 1127
    //   1110: aload_0
    //   1111: getfield g : Lcalc/c;
    //   1114: invokevirtual q : ()V
    //   1117: goto -> 1127
    //   1120: aload_0
    //   1121: getfield g : Lcalc/c;
    //   1124: invokevirtual r : ()V
    //   1127: aload_0
    //   1128: getfield g : Lcalc/c;
    //   1131: aload_0
    //   1132: getfield g : Lcalc/c;
    //   1135: invokestatic b : (Lcalc/c;)Lcalc/c;
    //   1138: invokevirtual a : (Lcalc/c;)V
    //   1141: aload_0
    //   1142: bipush #32
    //   1144: putfield b : C
    //   1147: aload_0
    //   1148: iconst_3
    //   1149: putfield c : B
    //   1152: getstatic calc/a.a : Ljava/util/Vector;
    //   1155: iload_1
    //   1156: iconst_1
    //   1157: iadd
    //   1158: invokevirtual removeElementAt : (I)V
    //   1161: iconst_0
    //   1162: ireturn
    //   1163: iconst_m1
    //   1164: ireturn
    //   1165: ldc '+-*/\|&%#><VQ'
    //   1167: aload_0
    //   1168: getfield b : C
    //   1171: invokevirtual indexOf : (I)I
    //   1174: iflt -> 1815
    //   1177: iload_1
    //   1178: ifle -> 1813
    //   1181: iload_1
    //   1182: iconst_1
    //   1183: iadd
    //   1184: getstatic calc/a.a : Ljava/util/Vector;
    //   1187: invokevirtual size : ()I
    //   1190: if_icmpge -> 1813
    //   1193: getstatic calc/a.a : Ljava/util/Vector;
    //   1196: iload_1
    //   1197: iconst_1
    //   1198: iadd
    //   1199: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1202: checkcast calc/a
    //   1205: getfield c : B
    //   1208: iconst_4
    //   1209: if_icmpge -> 1813
    //   1212: getstatic calc/a.a : Ljava/util/Vector;
    //   1215: iload_1
    //   1216: iconst_1
    //   1217: isub
    //   1218: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1221: checkcast calc/a
    //   1224: getfield b : C
    //   1227: bipush #32
    //   1229: if_icmpne -> 1813
    //   1232: aload_0
    //   1233: new calc/c
    //   1236: dup
    //   1237: getstatic calc/a.a : Ljava/util/Vector;
    //   1240: iload_1
    //   1241: iconst_1
    //   1242: isub
    //   1243: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1246: checkcast calc/a
    //   1249: iload_1
    //   1250: iconst_1
    //   1251: isub
    //   1252: invokespecial a : (I)Lcalc/c;
    //   1255: invokespecial <init> : (Lcalc/c;)V
    //   1258: putfield g : Lcalc/c;
    //   1261: aload_0
    //   1262: getfield b : C
    //   1265: lookupswitch default -> 1782, 35 -> 1604, 37 -> 1576, 38 -> 1548, 42 -> 1436, 43 -> 1380, 45 -> 1408, 47 -> 1464, 60 -> 1671, 62 -> 1632, 81 -> 1757, 86 -> 1709, 92 -> 1492, 124 -> 1520
    //   1380: aload_0
    //   1381: getfield g : Lcalc/c;
    //   1384: getstatic calc/a.a : Ljava/util/Vector;
    //   1387: iload_1
    //   1388: iconst_1
    //   1389: iadd
    //   1390: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1393: checkcast calc/a
    //   1396: iload_1
    //   1397: iconst_1
    //   1398: iadd
    //   1399: invokespecial a : (I)Lcalc/c;
    //   1402: invokevirtual c : (Lcalc/c;)V
    //   1405: goto -> 1782
    //   1408: aload_0
    //   1409: getfield g : Lcalc/c;
    //   1412: getstatic calc/a.a : Ljava/util/Vector;
    //   1415: iload_1
    //   1416: iconst_1
    //   1417: iadd
    //   1418: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1421: checkcast calc/a
    //   1424: iload_1
    //   1425: iconst_1
    //   1426: iadd
    //   1427: invokespecial a : (I)Lcalc/c;
    //   1430: invokevirtual d : (Lcalc/c;)V
    //   1433: goto -> 1782
    //   1436: aload_0
    //   1437: getfield g : Lcalc/c;
    //   1440: getstatic calc/a.a : Ljava/util/Vector;
    //   1443: iload_1
    //   1444: iconst_1
    //   1445: iadd
    //   1446: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1449: checkcast calc/a
    //   1452: iload_1
    //   1453: iconst_1
    //   1454: iadd
    //   1455: invokespecial a : (I)Lcalc/c;
    //   1458: invokevirtual e : (Lcalc/c;)V
    //   1461: goto -> 1782
    //   1464: aload_0
    //   1465: getfield g : Lcalc/c;
    //   1468: getstatic calc/a.a : Ljava/util/Vector;
    //   1471: iload_1
    //   1472: iconst_1
    //   1473: iadd
    //   1474: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1477: checkcast calc/a
    //   1480: iload_1
    //   1481: iconst_1
    //   1482: iadd
    //   1483: invokespecial a : (I)Lcalc/c;
    //   1486: invokevirtual f : (Lcalc/c;)V
    //   1489: goto -> 1782
    //   1492: aload_0
    //   1493: getfield g : Lcalc/c;
    //   1496: getstatic calc/a.a : Ljava/util/Vector;
    //   1499: iload_1
    //   1500: iconst_1
    //   1501: iadd
    //   1502: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1505: checkcast calc/a
    //   1508: iload_1
    //   1509: iconst_1
    //   1510: iadd
    //   1511: invokespecial a : (I)Lcalc/c;
    //   1514: invokevirtual g : (Lcalc/c;)V
    //   1517: goto -> 1782
    //   1520: aload_0
    //   1521: getfield g : Lcalc/c;
    //   1524: getstatic calc/a.a : Ljava/util/Vector;
    //   1527: iload_1
    //   1528: iconst_1
    //   1529: iadd
    //   1530: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1533: checkcast calc/a
    //   1536: iload_1
    //   1537: iconst_1
    //   1538: iadd
    //   1539: invokespecial a : (I)Lcalc/c;
    //   1542: invokevirtual j : (Lcalc/c;)V
    //   1545: goto -> 1782
    //   1548: aload_0
    //   1549: getfield g : Lcalc/c;
    //   1552: getstatic calc/a.a : Ljava/util/Vector;
    //   1555: iload_1
    //   1556: iconst_1
    //   1557: iadd
    //   1558: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1561: checkcast calc/a
    //   1564: iload_1
    //   1565: iconst_1
    //   1566: iadd
    //   1567: invokespecial a : (I)Lcalc/c;
    //   1570: invokevirtual i : (Lcalc/c;)V
    //   1573: goto -> 1782
    //   1576: aload_0
    //   1577: getfield g : Lcalc/c;
    //   1580: getstatic calc/a.a : Ljava/util/Vector;
    //   1583: iload_1
    //   1584: iconst_1
    //   1585: iadd
    //   1586: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1589: checkcast calc/a
    //   1592: iload_1
    //   1593: iconst_1
    //   1594: iadd
    //   1595: invokespecial a : (I)Lcalc/c;
    //   1598: invokevirtual h : (Lcalc/c;)V
    //   1601: goto -> 1782
    //   1604: aload_0
    //   1605: getfield g : Lcalc/c;
    //   1608: getstatic calc/a.a : Ljava/util/Vector;
    //   1611: iload_1
    //   1612: iconst_1
    //   1613: iadd
    //   1614: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1617: checkcast calc/a
    //   1620: iload_1
    //   1621: iconst_1
    //   1622: iadd
    //   1623: invokespecial a : (I)Lcalc/c;
    //   1626: invokevirtual k : (Lcalc/c;)V
    //   1629: goto -> 1782
    //   1632: aload_0
    //   1633: getfield g : Lcalc/c;
    //   1636: getstatic calc/a.a : Ljava/util/Vector;
    //   1639: iload_1
    //   1640: iconst_1
    //   1641: iadd
    //   1642: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1645: checkcast calc/a
    //   1648: iload_1
    //   1649: iconst_1
    //   1650: iadd
    //   1651: invokespecial a : (I)Lcalc/c;
    //   1654: invokevirtual e : ()I
    //   1657: ineg
    //   1658: invokevirtual b : (I)V
    //   1661: aload_0
    //   1662: getfield g : Lcalc/c;
    //   1665: invokevirtual c : ()V
    //   1668: goto -> 1782
    //   1671: aload_0
    //   1672: getfield g : Lcalc/c;
    //   1675: getstatic calc/a.a : Ljava/util/Vector;
    //   1678: iload_1
    //   1679: iconst_1
    //   1680: iadd
    //   1681: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1684: checkcast calc/a
    //   1687: iload_1
    //   1688: iconst_1
    //   1689: iadd
    //   1690: invokespecial a : (I)Lcalc/c;
    //   1693: invokevirtual e : ()I
    //   1696: invokevirtual b : (I)V
    //   1699: aload_0
    //   1700: getfield g : Lcalc/c;
    //   1703: invokevirtual c : ()V
    //   1706: goto -> 1782
    //   1709: new calc/c
    //   1712: dup
    //   1713: aload_0
    //   1714: getfield g : Lcalc/c;
    //   1717: invokespecial <init> : (Lcalc/c;)V
    //   1720: astore_2
    //   1721: aload_0
    //   1722: getfield g : Lcalc/c;
    //   1725: getstatic calc/a.a : Ljava/util/Vector;
    //   1728: iload_1
    //   1729: iconst_1
    //   1730: iadd
    //   1731: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1734: checkcast calc/a
    //   1737: iload_1
    //   1738: iconst_1
    //   1739: iadd
    //   1740: invokespecial a : (I)Lcalc/c;
    //   1743: invokevirtual a : (Lcalc/c;)V
    //   1746: aload_0
    //   1747: getfield g : Lcalc/c;
    //   1750: aload_2
    //   1751: invokevirtual l : (Lcalc/c;)V
    //   1754: goto -> 1782
    //   1757: aload_0
    //   1758: getfield g : Lcalc/c;
    //   1761: getstatic calc/a.a : Ljava/util/Vector;
    //   1764: iload_1
    //   1765: iconst_1
    //   1766: iadd
    //   1767: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1770: checkcast calc/a
    //   1773: iload_1
    //   1774: iconst_1
    //   1775: iadd
    //   1776: invokespecial a : (I)Lcalc/c;
    //   1779: invokevirtual m : (Lcalc/c;)V
    //   1782: aload_0
    //   1783: bipush #32
    //   1785: putfield b : C
    //   1788: aload_0
    //   1789: iconst_3
    //   1790: putfield c : B
    //   1793: getstatic calc/a.a : Ljava/util/Vector;
    //   1796: iload_1
    //   1797: iconst_1
    //   1798: iadd
    //   1799: invokevirtual removeElementAt : (I)V
    //   1802: getstatic calc/a.a : Ljava/util/Vector;
    //   1805: iload_1
    //   1806: iconst_1
    //   1807: isub
    //   1808: invokevirtual removeElementAt : (I)V
    //   1811: iconst_1
    //   1812: ireturn
    //   1813: iconst_m1
    //   1814: ireturn
    //   1815: iconst_m1
    //   1816: ireturn
  }
  
  public static c b() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: iconst_0
    //   3: putstatic calc/a.e : I
    //   6: getstatic calc/a.e : I
    //   9: bipush #10
    //   11: if_icmpge -> 93
    //   14: iconst_0
    //   15: istore_1
    //   16: iload_1
    //   17: getstatic calc/a.a : Ljava/util/Vector;
    //   20: invokevirtual size : ()I
    //   23: if_icmpge -> 85
    //   26: getstatic calc/a.a : Ljava/util/Vector;
    //   29: iload_1
    //   30: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   33: checkcast calc/a
    //   36: getfield c : B
    //   39: getstatic calc/a.e : I
    //   42: if_icmpne -> 79
    //   45: getstatic calc/a.a : Ljava/util/Vector;
    //   48: iload_1
    //   49: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   52: checkcast calc/a
    //   55: iload_1
    //   56: invokespecial b : (I)I
    //   59: dup
    //   60: istore_0
    //   61: ifge -> 75
    //   64: new calc/c
    //   67: dup
    //   68: getstatic calc/c.w : Lcalc/c;
    //   71: invokespecial <init> : (Lcalc/c;)V
    //   74: areturn
    //   75: iload_1
    //   76: iload_0
    //   77: isub
    //   78: istore_1
    //   79: iinc #1, 1
    //   82: goto -> 16
    //   85: getstatic calc/a.e : I
    //   88: iconst_1
    //   89: iadd
    //   90: goto -> 3
    //   93: getstatic calc/a.a : Ljava/util/Vector;
    //   96: invokevirtual size : ()I
    //   99: iconst_1
    //   100: if_icmpne -> 136
    //   103: getstatic calc/a.a : Ljava/util/Vector;
    //   106: iconst_0
    //   107: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   110: checkcast calc/a
    //   113: getfield b : C
    //   116: bipush #32
    //   118: if_icmpne -> 136
    //   121: getstatic calc/a.a : Ljava/util/Vector;
    //   124: iconst_0
    //   125: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   128: checkcast calc/a
    //   131: iconst_0
    //   132: invokespecial a : (I)Lcalc/c;
    //   135: areturn
    //   136: new calc/c
    //   139: dup
    //   140: getstatic calc/c.w : Lcalc/c;
    //   143: invokespecial <init> : (Lcalc/c;)V
    //   146: areturn
  }
  
  public static int a(String paramString, int paramInt) {
    d = paramInt;
    Vector vector = new Vector();
    while (d < paramString.length()) {
      char c1 = paramString.charAt(d);
      int i;
      if ((i = " pWXYdvshtxbngmiojSHTIOJ$q!+-*/\\|&%#><VQ".indexOf(c1)) >= 0) {
        vector.addElement(new a(c1, f[i], (String)null));
      } else if (c1 == '(') {
        a(paramString, d + 1);
        vector.addElement(new a(' ', (byte)0, b()));
      } else {
        if (c1 == ')')
          break; 
        int j = paramString.length();
        for (byte b = 0; b < " pWXYdvshtxbngmiojSHTIOJ$q!+-*/\\|&%#><VQ()".length(); b++) {
          int k;
          if ((k = paramString.indexOf(" pWXYdvshtxbngmiojSHTIOJ$q!+-*/\\|&%#><VQ()".charAt(b), d)) >= 0 && (paramString.charAt(k) != '-' || paramString.charAt(k - 1) != 'E') && k < j)
            j = k; 
        } 
        vector.addElement(new a(' ', (byte)0, paramString.substring(d, j)));
        d = j - 1;
      } 
      d++;
    } 
    a = vector;
    return d;
  }
  
  public static boolean a(String paramString) {
    int i = paramString.indexOf('(');
    int j = paramString.indexOf(')');
    byte b = 0;
    do {
      if (i != -1 && i < j) {
        b++;
        j = ++i;
      } else if ((j != -1 && j < i) || (j != -1 && i == -1)) {
        b--;
        j = i = j + 1;
      } else {
        if (i != -1 && j == -1)
          b++; 
        break;
      } 
      if (b < 0)
        break; 
      i = paramString.indexOf('(', i);
      j = paramString.indexOf(')', j);
    } while (i != -1 || j != -1);
    return (b == 0);
  }
  
  public static String a(c paramc, boolean paramBoolean) {
    new String();
    String str = null;
    c c1;
    (c1 = new c(paramc)).d();
    int i = c1.e();
    c1.a(paramc);
    c1.f(i);
    c1.a();
    c1.c(1000000);
    int j = c1.e();
    int k = 1;
    byte b = 1;
    if (j > 100 && j < 999530) {
      int m;
      do {
        if ((m = 1000000 * k / ++b - j) >= 0)
          continue; 
        k++;
      } while (m != 0 && k < 2146);
      c1.a(k);
      c1.d(b);
      c1.e(i);
      c1.a(c1.toString());
      String str1 = !c1.b(new c(paramc.toString())) ? "_E_" : "_";
      if (!paramBoolean) {
        k += i * b;
        i = 0;
      } 
      return str = ((i != 0) ? "_" : str1) + Integer.toString(k) + "/" + Integer.toString(b);
    } 
    return null;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\calc\a.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */