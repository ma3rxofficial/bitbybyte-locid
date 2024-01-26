public final class m {
  private int[] d;
  
  private byte[] a;
  
  private byte[][] a;
  
  public int a;
  
  private int e;
  
  public int b;
  
  public static short[] a;
  
  public static short[] b;
  
  public static short[] c;
  
  public static int[] a;
  
  private short[] d;
  
  public static int[] b;
  
  private int f;
  
  private int[] e = new int[3];
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int[] f = new int[3];
  
  private int[] g = new int[3];
  
  private int[] h = new int[3];
  
  private int[] i = new int[3];
  
  private short[][] a;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int[] j = new int[3];
  
  private int u;
  
  private int v;
  
  private int w;
  
  public int[] c;
  
  public int c;
  
  public int d;
  
  private int[] k = new int[6];
  
  private int[][] a = (int[][])new byte[3][];
  
  private int[][] b;
  
  private byte[][] b;
  
  private byte[][] c;
  
  private int[][] c;
  
  private int x;
  
  private int y;
  
  private int[] l;
  
  private int z;
  
  private int A;
  
  public final int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield a : [B
    //   5: aload_0
    //   6: iload_2
    //   7: putfield f : I
    //   10: aload_0
    //   11: iload_3
    //   12: putfield g : I
    //   15: aload_0
    //   16: iload #4
    //   18: putfield e : I
    //   21: iconst_0
    //   22: istore_1
    //   23: iload_1
    //   24: ifne -> 4030
    //   27: aload_0
    //   28: getfield i : I
    //   31: ifle -> 94
    //   34: aload_0
    //   35: getfield i : I
    //   38: aload_0
    //   39: getfield g : I
    //   42: if_icmplt -> 60
    //   45: aload_0
    //   46: dup
    //   47: getfield i : I
    //   50: aload_0
    //   51: getfield g : I
    //   54: isub
    //   55: putfield i : I
    //   58: iconst_0
    //   59: ireturn
    //   60: aload_0
    //   61: dup
    //   62: getfield f : I
    //   65: aload_0
    //   66: getfield i : I
    //   69: iadd
    //   70: putfield f : I
    //   73: aload_0
    //   74: dup
    //   75: getfield g : I
    //   78: aload_0
    //   79: getfield i : I
    //   82: isub
    //   83: putfield g : I
    //   86: aload_0
    //   87: iconst_0
    //   88: putfield i : I
    //   91: goto -> 27
    //   94: aload_0
    //   95: getfield h : I
    //   98: tableswitch default -> 4027, 0 -> 3989, 1 -> 140, 2 -> 140, 3 -> 2376, 4 -> 2915, 5 -> 2760, 6 -> 3987
    //   140: aload_0
    //   141: getfield g : I
    //   144: iconst_2
    //   145: if_icmpge -> 153
    //   148: aload_0
    //   149: getfield g : I
    //   152: ireturn
    //   153: aload_0
    //   154: getfield g : I
    //   157: iconst_2
    //   158: if_icmplt -> 4027
    //   161: iload_1
    //   162: ifne -> 4027
    //   165: aload_0
    //   166: getfield i : I
    //   169: ifne -> 4027
    //   172: aload_0
    //   173: getfield h : I
    //   176: iconst_1
    //   177: if_icmpeq -> 188
    //   180: aload_0
    //   181: getfield h : I
    //   184: iconst_2
    //   185: if_icmpne -> 4027
    //   188: aload_0
    //   189: getfield a : [B
    //   192: aload_0
    //   193: getfield f : I
    //   196: baload
    //   197: sipush #255
    //   200: iand
    //   201: sipush #255
    //   204: if_icmpeq -> 230
    //   207: aload_0
    //   208: dup
    //   209: getfield f : I
    //   212: iconst_1
    //   213: iadd
    //   214: putfield f : I
    //   217: aload_0
    //   218: dup
    //   219: getfield g : I
    //   222: iconst_1
    //   223: isub
    //   224: putfield g : I
    //   227: goto -> 153
    //   230: aload_0
    //   231: getfield a : [B
    //   234: aload_0
    //   235: getfield f : I
    //   238: iconst_1
    //   239: iadd
    //   240: baload
    //   241: sipush #255
    //   244: iand
    //   245: lookupswitch default -> 2292, 0 -> 2269, 192 -> 328, 193 -> 328, 196 -> 1015, 217 -> 2240, 218 -> 672, 219 -> 1745, 221 -> 2097, 255 -> 2269
    //   328: aload_0
    //   329: getfield g : I
    //   332: iconst_4
    //   333: if_icmpge -> 341
    //   336: aload_0
    //   337: getfield g : I
    //   340: ireturn
    //   341: aload_0
    //   342: aload_0
    //   343: getfield a : [B
    //   346: aload_0
    //   347: getfield f : I
    //   350: iconst_2
    //   351: iadd
    //   352: baload
    //   353: sipush #255
    //   356: iand
    //   357: bipush #8
    //   359: ishl
    //   360: aload_0
    //   361: getfield a : [B
    //   364: aload_0
    //   365: getfield f : I
    //   368: iconst_3
    //   369: iadd
    //   370: baload
    //   371: sipush #255
    //   374: iand
    //   375: ior
    //   376: putfield j : I
    //   379: aload_0
    //   380: getfield g : I
    //   383: bipush #10
    //   385: if_icmpge -> 393
    //   388: aload_0
    //   389: getfield g : I
    //   392: ireturn
    //   393: aload_0
    //   394: dup
    //   395: getfield f : I
    //   398: iconst_4
    //   399: iadd
    //   400: putfield f : I
    //   403: aload_0
    //   404: dup
    //   405: getfield g : I
    //   408: iconst_4
    //   409: isub
    //   410: putfield g : I
    //   413: aload_0
    //   414: dup
    //   415: getfield j : I
    //   418: iconst_2
    //   419: isub
    //   420: putfield j : I
    //   423: aload_0
    //   424: aload_0
    //   425: getfield a : [B
    //   428: aload_0
    //   429: getfield f : I
    //   432: iconst_3
    //   433: iadd
    //   434: baload
    //   435: sipush #255
    //   438: iand
    //   439: bipush #8
    //   441: ishl
    //   442: aload_0
    //   443: getfield a : [B
    //   446: aload_0
    //   447: getfield f : I
    //   450: iconst_4
    //   451: iadd
    //   452: baload
    //   453: sipush #255
    //   456: iand
    //   457: ior
    //   458: putfield c : I
    //   461: aload_0
    //   462: aload_0
    //   463: getfield a : [B
    //   466: aload_0
    //   467: getfield f : I
    //   470: iconst_1
    //   471: iadd
    //   472: baload
    //   473: sipush #255
    //   476: iand
    //   477: bipush #8
    //   479: ishl
    //   480: aload_0
    //   481: getfield a : [B
    //   484: aload_0
    //   485: getfield f : I
    //   488: iconst_2
    //   489: iadd
    //   490: baload
    //   491: sipush #255
    //   494: iand
    //   495: ior
    //   496: putfield d : I
    //   499: iload #5
    //   501: ifeq -> 522
    //   504: aload_0
    //   505: iconst_0
    //   506: putfield h : I
    //   509: aload_0
    //   510: getfield c : I
    //   513: bipush #16
    //   515: ishl
    //   516: aload_0
    //   517: getfield d : I
    //   520: ior
    //   521: ireturn
    //   522: aload_0
    //   523: aload_0
    //   524: getfield c : I
    //   527: aload_0
    //   528: getfield e : I
    //   531: ishr
    //   532: putfield b : I
    //   535: aload_0
    //   536: aload_0
    //   537: getfield d : I
    //   540: aload_0
    //   541: getfield e : I
    //   544: ishr
    //   545: putfield a : I
    //   548: aload_0
    //   549: aload_0
    //   550: getfield b : I
    //   553: aload_0
    //   554: getfield a : I
    //   557: imul
    //   558: newarray int
    //   560: putfield c : [I
    //   563: aload_0
    //   564: getfield c : [I
    //   567: arraylength
    //   568: putstatic l.a : I
    //   571: iconst_0
    //   572: putstatic l.c : I
    //   575: aload_0
    //   576: aload_0
    //   577: getfield a : [B
    //   580: aload_0
    //   581: getfield f : I
    //   584: iconst_5
    //   585: iadd
    //   586: baload
    //   587: sipush #255
    //   590: iand
    //   591: putfield k : I
    //   594: iconst_0
    //   595: istore_3
    //   596: iload_3
    //   597: iconst_3
    //   598: if_icmpge -> 627
    //   601: aload_0
    //   602: getfield k : [I
    //   605: iload_3
    //   606: iconst_1
    //   607: ishl
    //   608: iconst_0
    //   609: iastore
    //   610: aload_0
    //   611: getfield k : [I
    //   614: iload_3
    //   615: iconst_1
    //   616: ishl
    //   617: iconst_1
    //   618: iadd
    //   619: iconst_4
    //   620: iastore
    //   621: iinc #3, 1
    //   624: goto -> 596
    //   627: aload_0
    //   628: invokespecial b : ()V
    //   631: aload_0
    //   632: dup
    //   633: getfield f : I
    //   636: bipush #6
    //   638: iadd
    //   639: putfield f : I
    //   642: aload_0
    //   643: dup
    //   644: getfield g : I
    //   647: bipush #6
    //   649: isub
    //   650: putfield g : I
    //   653: aload_0
    //   654: dup
    //   655: getfield j : I
    //   658: bipush #6
    //   660: isub
    //   661: putfield j : I
    //   664: aload_0
    //   665: iconst_3
    //   666: putfield h : I
    //   669: goto -> 153
    //   672: aload_0
    //   673: getfield g : I
    //   676: iconst_4
    //   677: if_icmpge -> 685
    //   680: aload_0
    //   681: getfield g : I
    //   684: ireturn
    //   685: aload_0
    //   686: aload_0
    //   687: getfield a : [B
    //   690: aload_0
    //   691: getfield f : I
    //   694: iconst_2
    //   695: iadd
    //   696: baload
    //   697: sipush #255
    //   700: iand
    //   701: bipush #8
    //   703: ishl
    //   704: aload_0
    //   705: getfield a : [B
    //   708: aload_0
    //   709: getfield f : I
    //   712: iconst_3
    //   713: iadd
    //   714: baload
    //   715: sipush #255
    //   718: iand
    //   719: ior
    //   720: putfield j : I
    //   723: aload_0
    //   724: getfield g : I
    //   727: aload_0
    //   728: getfield j : I
    //   731: iconst_2
    //   732: iadd
    //   733: if_icmpge -> 741
    //   736: aload_0
    //   737: getfield g : I
    //   740: ireturn
    //   741: aload_0
    //   742: aload_0
    //   743: getfield a : [B
    //   746: aload_0
    //   747: getfield f : I
    //   750: iconst_4
    //   751: iadd
    //   752: baload
    //   753: sipush #255
    //   756: iand
    //   757: putfield p : I
    //   760: aload_0
    //   761: dup
    //   762: getfield f : I
    //   765: iconst_5
    //   766: iadd
    //   767: putfield f : I
    //   770: aload_0
    //   771: dup
    //   772: getfield g : I
    //   775: iconst_5
    //   776: isub
    //   777: putfield g : I
    //   780: aload_0
    //   781: dup
    //   782: getfield j : I
    //   785: iconst_3
    //   786: isub
    //   787: putfield j : I
    //   790: iconst_0
    //   791: istore_2
    //   792: iload_2
    //   793: aload_0
    //   794: getfield p : I
    //   797: if_icmpge -> 953
    //   800: aload_0
    //   801: getfield a : [B
    //   804: aload_0
    //   805: getfield f : I
    //   808: baload
    //   809: sipush #255
    //   812: iand
    //   813: istore_3
    //   814: aload_0
    //   815: getfield i : [I
    //   818: iload_2
    //   819: iload_2
    //   820: iastore
    //   821: iconst_0
    //   822: istore #4
    //   824: iload #4
    //   826: aload_0
    //   827: getfield k : I
    //   830: if_icmpge -> 864
    //   833: iload_3
    //   834: aload_0
    //   835: getfield f : [I
    //   838: iload #4
    //   840: iaload
    //   841: if_icmpne -> 858
    //   844: aload_0
    //   845: getfield i : [I
    //   848: iload_2
    //   849: iload #4
    //   851: iastore
    //   852: aload_0
    //   853: getfield k : I
    //   856: istore #4
    //   858: iinc #4, 1
    //   861: goto -> 824
    //   864: aload_0
    //   865: getfield a : [B
    //   868: aload_0
    //   869: getfield f : I
    //   872: iconst_1
    //   873: iadd
    //   874: baload
    //   875: sipush #255
    //   878: iand
    //   879: istore_3
    //   880: aload_0
    //   881: getfield k : [I
    //   884: aload_0
    //   885: getfield i : [I
    //   888: iload_2
    //   889: iaload
    //   890: iconst_1
    //   891: ishl
    //   892: iload_3
    //   893: iconst_4
    //   894: ishr
    //   895: iastore
    //   896: aload_0
    //   897: getfield k : [I
    //   900: aload_0
    //   901: getfield i : [I
    //   904: iload_2
    //   905: iaload
    //   906: iconst_1
    //   907: ishl
    //   908: iconst_1
    //   909: iadd
    //   910: iconst_4
    //   911: iload_3
    //   912: bipush #15
    //   914: iand
    //   915: iadd
    //   916: iastore
    //   917: aload_0
    //   918: dup
    //   919: getfield f : I
    //   922: iconst_2
    //   923: iadd
    //   924: putfield f : I
    //   927: aload_0
    //   928: dup
    //   929: getfield g : I
    //   932: iconst_2
    //   933: isub
    //   934: putfield g : I
    //   937: aload_0
    //   938: dup
    //   939: getfield j : I
    //   942: iconst_2
    //   943: isub
    //   944: putfield j : I
    //   947: iinc #2, 1
    //   950: goto -> 792
    //   953: aload_0
    //   954: invokespecial b : ()V
    //   957: aload_0
    //   958: iconst_0
    //   959: putfield r : I
    //   962: aload_0
    //   963: iconst_0
    //   964: putfield q : I
    //   967: aload_0
    //   968: iconst_0
    //   969: putfield s : I
    //   972: aload_0
    //   973: iconst_0
    //   974: putfield w : I
    //   977: aload_0
    //   978: invokespecial a : ()V
    //   981: aload_0
    //   982: dup
    //   983: getfield f : I
    //   986: aload_0
    //   987: getfield j : I
    //   990: iadd
    //   991: putfield f : I
    //   994: aload_0
    //   995: dup
    //   996: getfield g : I
    //   999: aload_0
    //   1000: getfield j : I
    //   1003: isub
    //   1004: putfield g : I
    //   1007: aload_0
    //   1008: iconst_4
    //   1009: putfield h : I
    //   1012: goto -> 153
    //   1015: aload_0
    //   1016: getfield g : I
    //   1019: iconst_4
    //   1020: if_icmpge -> 1029
    //   1023: bipush #-2
    //   1025: istore_1
    //   1026: goto -> 153
    //   1029: aload_0
    //   1030: getfield a : [B
    //   1033: aload_0
    //   1034: getfield f : I
    //   1037: iconst_2
    //   1038: iadd
    //   1039: baload
    //   1040: sipush #255
    //   1043: iand
    //   1044: bipush #8
    //   1046: ishl
    //   1047: aload_0
    //   1048: getfield a : [B
    //   1051: aload_0
    //   1052: getfield f : I
    //   1055: iconst_3
    //   1056: iadd
    //   1057: baload
    //   1058: sipush #255
    //   1061: iand
    //   1062: ior
    //   1063: istore_2
    //   1064: aload_0
    //   1065: getfield g : I
    //   1068: iload_2
    //   1069: iconst_2
    //   1070: iadd
    //   1071: if_icmpge -> 1080
    //   1074: bipush #-2
    //   1076: istore_1
    //   1077: goto -> 153
    //   1080: iinc #2, -2
    //   1083: aload_0
    //   1084: dup
    //   1085: getfield f : I
    //   1088: iconst_4
    //   1089: iadd
    //   1090: putfield f : I
    //   1093: aload_0
    //   1094: dup
    //   1095: getfield g : I
    //   1098: iconst_4
    //   1099: isub
    //   1100: putfield g : I
    //   1103: iload_2
    //   1104: ifle -> 1740
    //   1107: aload_0
    //   1108: getfield a : [B
    //   1111: aload_0
    //   1112: getfield f : I
    //   1115: baload
    //   1116: bipush #15
    //   1118: iand
    //   1119: aload_0
    //   1120: getfield a : [B
    //   1123: aload_0
    //   1124: getfield f : I
    //   1127: baload
    //   1128: bipush #16
    //   1130: iand
    //   1131: iconst_2
    //   1132: ishr
    //   1133: ior
    //   1134: istore_3
    //   1135: aload_0
    //   1136: dup
    //   1137: getfield f : I
    //   1140: iconst_1
    //   1141: iadd
    //   1142: putfield f : I
    //   1145: aload_0
    //   1146: dup
    //   1147: getfield g : I
    //   1150: iconst_1
    //   1151: isub
    //   1152: putfield g : I
    //   1155: iinc #2, -1
    //   1158: iconst_0
    //   1159: istore #4
    //   1161: bipush #16
    //   1163: newarray short
    //   1165: astore_1
    //   1166: iconst_0
    //   1167: istore #6
    //   1169: iconst_0
    //   1170: istore #7
    //   1172: iload #7
    //   1174: bipush #16
    //   1176: if_icmpge -> 1215
    //   1179: aload_1
    //   1180: iload #7
    //   1182: aload_0
    //   1183: getfield a : [B
    //   1186: aload_0
    //   1187: getfield f : I
    //   1190: iload #7
    //   1192: iadd
    //   1193: baload
    //   1194: sipush #255
    //   1197: iand
    //   1198: i2s
    //   1199: sastore
    //   1200: iload #6
    //   1202: aload_1
    //   1203: iload #7
    //   1205: saload
    //   1206: iadd
    //   1207: istore #6
    //   1209: iinc #7, 1
    //   1212: goto -> 1172
    //   1215: iload #6
    //   1217: iconst_1
    //   1218: iadd
    //   1219: newarray int
    //   1221: astore #7
    //   1223: iload #6
    //   1225: newarray int
    //   1227: astore #8
    //   1229: iconst_0
    //   1230: istore #9
    //   1232: iload #9
    //   1234: bipush #16
    //   1236: if_icmpge -> 1275
    //   1239: iconst_1
    //   1240: istore #10
    //   1242: iload #10
    //   1244: aload_1
    //   1245: iload #9
    //   1247: saload
    //   1248: if_icmpgt -> 1269
    //   1251: aload #7
    //   1253: iload #4
    //   1255: iload #9
    //   1257: iconst_1
    //   1258: iadd
    //   1259: iastore
    //   1260: iinc #10, 1
    //   1263: iinc #4, 1
    //   1266: goto -> 1242
    //   1269: iinc #9, 1
    //   1272: goto -> 1232
    //   1275: aload #7
    //   1277: iload #4
    //   1279: iconst_0
    //   1280: iastore
    //   1281: iconst_0
    //   1282: istore #9
    //   1284: iconst_0
    //   1285: istore #10
    //   1287: aload #7
    //   1289: iconst_0
    //   1290: iaload
    //   1291: istore #11
    //   1293: aload #7
    //   1295: iload #9
    //   1297: iaload
    //   1298: ifeq -> 1357
    //   1301: aload #7
    //   1303: iload #9
    //   1305: iaload
    //   1306: iload #11
    //   1308: if_icmpne -> 1327
    //   1311: aload #8
    //   1313: iload #9
    //   1315: iload #10
    //   1317: iastore
    //   1318: iinc #10, 1
    //   1321: iinc #9, 1
    //   1324: goto -> 1301
    //   1327: aload #7
    //   1329: iload #9
    //   1331: iaload
    //   1332: ifeq -> 1293
    //   1335: aload #7
    //   1337: iload #9
    //   1339: iaload
    //   1340: iload #11
    //   1342: if_icmpeq -> 1293
    //   1345: iload #10
    //   1347: iconst_1
    //   1348: ishl
    //   1349: istore #10
    //   1351: iinc #11, 1
    //   1354: goto -> 1335
    //   1357: aload_0
    //   1358: getfield b : [[I
    //   1361: iload_3
    //   1362: bipush #16
    //   1364: newarray int
    //   1366: aastore
    //   1367: aload_0
    //   1368: getfield a : [[I
    //   1371: iload_3
    //   1372: bipush #16
    //   1374: newarray int
    //   1376: aastore
    //   1377: aload_0
    //   1378: getfield a : [[S
    //   1381: iload_3
    //   1382: bipush #16
    //   1384: newarray short
    //   1386: aastore
    //   1387: iconst_0
    //   1388: istore #12
    //   1390: iconst_0
    //   1391: istore #13
    //   1393: iload #13
    //   1395: bipush #16
    //   1397: if_icmpge -> 1483
    //   1400: aload_1
    //   1401: iload #13
    //   1403: saload
    //   1404: ifne -> 1423
    //   1407: aload_0
    //   1408: getfield a : [[I
    //   1411: iload_3
    //   1412: aaload
    //   1413: iload #13
    //   1415: iconst_m1
    //   1416: iastore
    //   1417: iinc #13, 1
    //   1420: goto -> 1393
    //   1423: aload_0
    //   1424: getfield a : [[S
    //   1427: iload_3
    //   1428: aaload
    //   1429: iload #13
    //   1431: iload #12
    //   1433: i2s
    //   1434: sastore
    //   1435: aload_0
    //   1436: getfield b : [[I
    //   1439: iload_3
    //   1440: aaload
    //   1441: iload #13
    //   1443: aload #8
    //   1445: iload #12
    //   1447: iaload
    //   1448: iastore
    //   1449: iload #12
    //   1451: aload_1
    //   1452: iload #13
    //   1454: saload
    //   1455: iconst_1
    //   1456: isub
    //   1457: iadd
    //   1458: istore #12
    //   1460: aload_0
    //   1461: getfield a : [[I
    //   1464: iload_3
    //   1465: aaload
    //   1466: iload #13
    //   1468: aload #8
    //   1470: iload #12
    //   1472: iaload
    //   1473: iastore
    //   1474: iinc #12, 1
    //   1477: iinc #13, 1
    //   1480: goto -> 1393
    //   1483: aload_0
    //   1484: dup
    //   1485: getfield f : I
    //   1488: bipush #16
    //   1490: iadd
    //   1491: putfield f : I
    //   1494: aload_0
    //   1495: dup
    //   1496: getfield g : I
    //   1499: bipush #16
    //   1501: isub
    //   1502: putfield g : I
    //   1505: iinc #2, -16
    //   1508: aload_0
    //   1509: getfield b : [[B
    //   1512: iload_3
    //   1513: iload #4
    //   1515: newarray byte
    //   1517: aastore
    //   1518: iconst_0
    //   1519: istore #12
    //   1521: iload #12
    //   1523: iload #4
    //   1525: if_icmpge -> 1555
    //   1528: aload_0
    //   1529: getfield b : [[B
    //   1532: iload_3
    //   1533: aaload
    //   1534: iload #12
    //   1536: aload_0
    //   1537: getfield a : [B
    //   1540: aload_0
    //   1541: getfield f : I
    //   1544: iload #12
    //   1546: iadd
    //   1547: baload
    //   1548: bastore
    //   1549: iinc #12, 1
    //   1552: goto -> 1521
    //   1555: aload_0
    //   1556: dup
    //   1557: getfield f : I
    //   1560: iload #4
    //   1562: iadd
    //   1563: putfield f : I
    //   1566: aload_0
    //   1567: dup
    //   1568: getfield g : I
    //   1571: iload #4
    //   1573: isub
    //   1574: putfield g : I
    //   1577: iload_2
    //   1578: iload #4
    //   1580: isub
    //   1581: istore_2
    //   1582: aload_0
    //   1583: getfield c : [[B
    //   1586: iload_3
    //   1587: sipush #512
    //   1590: newarray byte
    //   1592: aastore
    //   1593: iconst_0
    //   1594: istore #4
    //   1596: iload #4
    //   1598: sipush #256
    //   1601: if_icmpge -> 1621
    //   1604: aload_0
    //   1605: getfield c : [[B
    //   1608: iload_3
    //   1609: aaload
    //   1610: iload #4
    //   1612: bipush #9
    //   1614: bastore
    //   1615: iinc #4, 1
    //   1618: goto -> 1596
    //   1621: iconst_0
    //   1622: istore #4
    //   1624: iconst_1
    //   1625: istore #12
    //   1627: iload #12
    //   1629: bipush #8
    //   1631: if_icmpgt -> 1737
    //   1634: iconst_0
    //   1635: istore #13
    //   1637: iload #13
    //   1639: aload_1
    //   1640: iload #12
    //   1642: iconst_1
    //   1643: isub
    //   1644: saload
    //   1645: if_icmpge -> 1731
    //   1648: aload #8
    //   1650: iload #4
    //   1652: iaload
    //   1653: bipush #8
    //   1655: iload #12
    //   1657: isub
    //   1658: ishl
    //   1659: istore #14
    //   1661: iconst_0
    //   1662: istore #6
    //   1664: iload #6
    //   1666: iconst_1
    //   1667: bipush #8
    //   1669: iload #12
    //   1671: isub
    //   1672: ishl
    //   1673: if_icmpge -> 1722
    //   1676: aload_0
    //   1677: getfield c : [[B
    //   1680: iload_3
    //   1681: aaload
    //   1682: iload #14
    //   1684: iload #6
    //   1686: ior
    //   1687: iload #12
    //   1689: i2b
    //   1690: bastore
    //   1691: aload_0
    //   1692: getfield c : [[B
    //   1695: iload_3
    //   1696: aaload
    //   1697: sipush #256
    //   1700: iload #14
    //   1702: iload #6
    //   1704: ior
    //   1705: iadd
    //   1706: aload_0
    //   1707: getfield b : [[B
    //   1710: iload_3
    //   1711: aaload
    //   1712: iload #4
    //   1714: baload
    //   1715: bastore
    //   1716: iinc #6, 1
    //   1719: goto -> 1664
    //   1722: iinc #4, 1
    //   1725: iinc #13, 1
    //   1728: goto -> 1637
    //   1731: iinc #12, 1
    //   1734: goto -> 1627
    //   1737: goto -> 1103
    //   1740: iconst_0
    //   1741: istore_1
    //   1742: goto -> 153
    //   1745: aload_0
    //   1746: getfield g : I
    //   1749: iconst_4
    //   1750: if_icmpge -> 1759
    //   1753: bipush #-2
    //   1755: istore_1
    //   1756: goto -> 153
    //   1759: aload_0
    //   1760: getfield a : [B
    //   1763: aload_0
    //   1764: getfield f : I
    //   1767: iconst_2
    //   1768: iadd
    //   1769: baload
    //   1770: sipush #255
    //   1773: iand
    //   1774: bipush #8
    //   1776: ishl
    //   1777: aload_0
    //   1778: getfield a : [B
    //   1781: aload_0
    //   1782: getfield f : I
    //   1785: iconst_3
    //   1786: iadd
    //   1787: baload
    //   1788: sipush #255
    //   1791: iand
    //   1792: ior
    //   1793: istore_2
    //   1794: aload_0
    //   1795: getfield g : I
    //   1798: iload_2
    //   1799: iconst_2
    //   1800: iadd
    //   1801: if_icmpge -> 1810
    //   1804: bipush #-2
    //   1806: istore_1
    //   1807: goto -> 153
    //   1810: aload_0
    //   1811: dup
    //   1812: getfield f : I
    //   1815: iconst_4
    //   1816: iadd
    //   1817: putfield f : I
    //   1820: aload_0
    //   1821: dup
    //   1822: getfield g : I
    //   1825: iconst_4
    //   1826: isub
    //   1827: putfield g : I
    //   1830: iinc #2, -2
    //   1833: iload_2
    //   1834: ifle -> 2092
    //   1837: aload_0
    //   1838: getfield a : [B
    //   1841: aload_0
    //   1842: getfield f : I
    //   1845: baload
    //   1846: sipush #240
    //   1849: iand
    //   1850: dup
    //   1851: ineg
    //   1852: ior
    //   1853: bipush #31
    //   1855: iushr
    //   1856: istore_3
    //   1857: aload_0
    //   1858: getfield a : [B
    //   1861: aload_0
    //   1862: getfield f : I
    //   1865: baload
    //   1866: bipush #15
    //   1868: iand
    //   1869: istore #4
    //   1871: aload_0
    //   1872: dup
    //   1873: getfield f : I
    //   1876: iconst_1
    //   1877: iadd
    //   1878: putfield f : I
    //   1881: aload_0
    //   1882: dup
    //   1883: getfield g : I
    //   1886: iconst_1
    //   1887: isub
    //   1888: putfield g : I
    //   1891: iinc #2, -1
    //   1894: aload_0
    //   1895: getfield c : [[I
    //   1898: iload #4
    //   1900: bipush #64
    //   1902: newarray int
    //   1904: aastore
    //   1905: iload_3
    //   1906: ifeq -> 2014
    //   1909: iconst_0
    //   1910: istore_3
    //   1911: iload_3
    //   1912: bipush #64
    //   1914: if_icmpge -> 1984
    //   1917: getstatic m.a : [I
    //   1920: iload_3
    //   1921: iaload
    //   1922: istore_1
    //   1923: aload_0
    //   1924: getfield c : [[I
    //   1927: iload #4
    //   1929: aaload
    //   1930: iload_3
    //   1931: aload_0
    //   1932: getfield a : [B
    //   1935: aload_0
    //   1936: getfield f : I
    //   1939: iload_1
    //   1940: iconst_1
    //   1941: ishl
    //   1942: iadd
    //   1943: baload
    //   1944: sipush #255
    //   1947: iand
    //   1948: bipush #8
    //   1950: ishl
    //   1951: aload_0
    //   1952: getfield a : [B
    //   1955: aload_0
    //   1956: getfield f : I
    //   1959: iload_1
    //   1960: iconst_1
    //   1961: ishl
    //   1962: iadd
    //   1963: iconst_1
    //   1964: iadd
    //   1965: baload
    //   1966: sipush #255
    //   1969: iand
    //   1970: ior
    //   1971: getstatic m.b : [I
    //   1974: iload_3
    //   1975: iaload
    //   1976: imul
    //   1977: iastore
    //   1978: iinc #3, 1
    //   1981: goto -> 1911
    //   1984: aload_0
    //   1985: dup
    //   1986: getfield f : I
    //   1989: sipush #128
    //   1992: iadd
    //   1993: putfield f : I
    //   1996: aload_0
    //   1997: dup
    //   1998: getfield g : I
    //   2001: sipush #128
    //   2004: isub
    //   2005: putfield g : I
    //   2008: iinc #2, -128
    //   2011: goto -> 1833
    //   2014: iconst_0
    //   2015: istore_3
    //   2016: iload_3
    //   2017: bipush #64
    //   2019: if_icmpge -> 2064
    //   2022: getstatic m.a : [I
    //   2025: iload_3
    //   2026: iaload
    //   2027: istore_1
    //   2028: aload_0
    //   2029: getfield c : [[I
    //   2032: iload #4
    //   2034: aaload
    //   2035: iload_3
    //   2036: aload_0
    //   2037: getfield a : [B
    //   2040: aload_0
    //   2041: getfield f : I
    //   2044: iload_1
    //   2045: iadd
    //   2046: baload
    //   2047: sipush #255
    //   2050: iand
    //   2051: getstatic m.b : [I
    //   2054: iload_3
    //   2055: iaload
    //   2056: imul
    //   2057: iastore
    //   2058: iinc #3, 1
    //   2061: goto -> 2016
    //   2064: aload_0
    //   2065: dup
    //   2066: getfield f : I
    //   2069: bipush #64
    //   2071: iadd
    //   2072: putfield f : I
    //   2075: aload_0
    //   2076: dup
    //   2077: getfield g : I
    //   2080: bipush #64
    //   2082: isub
    //   2083: putfield g : I
    //   2086: iinc #2, -64
    //   2089: goto -> 1833
    //   2092: iconst_0
    //   2093: istore_1
    //   2094: goto -> 153
    //   2097: aload_0
    //   2098: getfield g : I
    //   2101: iconst_4
    //   2102: if_icmpge -> 2110
    //   2105: aload_0
    //   2106: getfield g : I
    //   2109: ireturn
    //   2110: aload_0
    //   2111: aload_0
    //   2112: getfield a : [B
    //   2115: aload_0
    //   2116: getfield f : I
    //   2119: iconst_2
    //   2120: iadd
    //   2121: baload
    //   2122: sipush #255
    //   2125: iand
    //   2126: bipush #8
    //   2128: ishl
    //   2129: aload_0
    //   2130: getfield a : [B
    //   2133: aload_0
    //   2134: getfield f : I
    //   2137: iconst_3
    //   2138: iadd
    //   2139: baload
    //   2140: sipush #255
    //   2143: iand
    //   2144: ior
    //   2145: putfield i : I
    //   2148: aload_0
    //   2149: getfield g : I
    //   2152: bipush #6
    //   2154: if_icmpge -> 2162
    //   2157: aload_0
    //   2158: getfield g : I
    //   2161: ireturn
    //   2162: aload_0
    //   2163: aload_0
    //   2164: getfield a : [B
    //   2167: aload_0
    //   2168: getfield f : I
    //   2171: iconst_4
    //   2172: iadd
    //   2173: baload
    //   2174: sipush #255
    //   2177: iand
    //   2178: bipush #8
    //   2180: ishl
    //   2181: aload_0
    //   2182: getfield a : [B
    //   2185: aload_0
    //   2186: getfield f : I
    //   2189: iconst_5
    //   2190: iadd
    //   2191: baload
    //   2192: sipush #255
    //   2195: iand
    //   2196: ior
    //   2197: putfield t : I
    //   2200: aload_0
    //   2201: iconst_0
    //   2202: putfield s : I
    //   2205: aload_0
    //   2206: dup
    //   2207: getfield f : I
    //   2210: bipush #6
    //   2212: iadd
    //   2213: putfield f : I
    //   2216: aload_0
    //   2217: dup
    //   2218: getfield g : I
    //   2221: bipush #6
    //   2223: isub
    //   2224: putfield g : I
    //   2227: aload_0
    //   2228: dup
    //   2229: getfield i : I
    //   2232: iconst_4
    //   2233: isub
    //   2234: putfield i : I
    //   2237: goto -> 153
    //   2240: aload_0
    //   2241: dup
    //   2242: getfield f : I
    //   2245: iconst_2
    //   2246: iadd
    //   2247: putfield f : I
    //   2250: aload_0
    //   2251: dup
    //   2252: getfield g : I
    //   2255: iconst_2
    //   2256: isub
    //   2257: putfield g : I
    //   2260: aload_0
    //   2261: bipush #6
    //   2263: putfield h : I
    //   2266: goto -> 153
    //   2269: aload_0
    //   2270: dup
    //   2271: getfield f : I
    //   2274: iconst_1
    //   2275: iadd
    //   2276: putfield f : I
    //   2279: aload_0
    //   2280: dup
    //   2281: getfield g : I
    //   2284: iconst_1
    //   2285: isub
    //   2286: putfield g : I
    //   2289: goto -> 153
    //   2292: aload_0
    //   2293: getfield g : I
    //   2296: iconst_4
    //   2297: if_icmpge -> 2305
    //   2300: aload_0
    //   2301: getfield g : I
    //   2304: ireturn
    //   2305: aload_0
    //   2306: aload_0
    //   2307: getfield a : [B
    //   2310: aload_0
    //   2311: getfield f : I
    //   2314: iconst_2
    //   2315: iadd
    //   2316: baload
    //   2317: sipush #255
    //   2320: iand
    //   2321: bipush #8
    //   2323: ishl
    //   2324: aload_0
    //   2325: getfield a : [B
    //   2328: aload_0
    //   2329: getfield f : I
    //   2332: iconst_3
    //   2333: iadd
    //   2334: baload
    //   2335: sipush #255
    //   2338: iand
    //   2339: ior
    //   2340: putfield i : I
    //   2343: aload_0
    //   2344: dup
    //   2345: getfield f : I
    //   2348: iconst_4
    //   2349: iadd
    //   2350: putfield f : I
    //   2353: aload_0
    //   2354: dup
    //   2355: getfield g : I
    //   2358: iconst_4
    //   2359: isub
    //   2360: putfield g : I
    //   2363: aload_0
    //   2364: dup
    //   2365: getfield i : I
    //   2368: iconst_2
    //   2369: isub
    //   2370: putfield i : I
    //   2373: goto -> 153
    //   2376: aload_0
    //   2377: getfield g : I
    //   2380: aload_0
    //   2381: getfield k : I
    //   2384: iconst_3
    //   2385: imul
    //   2386: if_icmpge -> 2394
    //   2389: aload_0
    //   2390: getfield g : I
    //   2393: ireturn
    //   2394: iconst_0
    //   2395: istore_2
    //   2396: iload_2
    //   2397: aload_0
    //   2398: getfield k : I
    //   2401: if_icmpge -> 2549
    //   2404: aload_0
    //   2405: getfield f : [I
    //   2408: iload_2
    //   2409: aload_0
    //   2410: getfield a : [B
    //   2413: aload_0
    //   2414: getfield f : I
    //   2417: baload
    //   2418: sipush #255
    //   2421: iand
    //   2422: iastore
    //   2423: aload_0
    //   2424: getfield a : [B
    //   2427: aload_0
    //   2428: getfield f : I
    //   2431: iconst_1
    //   2432: iadd
    //   2433: baload
    //   2434: sipush #255
    //   2437: iand
    //   2438: dup
    //   2439: istore_3
    //   2440: bipush #15
    //   2442: iand
    //   2443: istore #4
    //   2445: iload_3
    //   2446: iconst_4
    //   2447: iushr
    //   2448: dup
    //   2449: istore_3
    //   2450: aload_0
    //   2451: getfield m : I
    //   2454: if_icmple -> 2462
    //   2457: aload_0
    //   2458: iload_3
    //   2459: putfield m : I
    //   2462: iload #4
    //   2464: aload_0
    //   2465: getfield l : I
    //   2468: if_icmple -> 2477
    //   2471: aload_0
    //   2472: iload #4
    //   2474: putfield l : I
    //   2477: aload_0
    //   2478: getfield h : [I
    //   2481: iload_2
    //   2482: iload_3
    //   2483: iastore
    //   2484: aload_0
    //   2485: getfield g : [I
    //   2488: iload_2
    //   2489: iload #4
    //   2491: iastore
    //   2492: aload_0
    //   2493: getfield l : [I
    //   2496: iload_2
    //   2497: aload_0
    //   2498: getfield a : [B
    //   2501: aload_0
    //   2502: getfield f : I
    //   2505: iconst_2
    //   2506: iadd
    //   2507: baload
    //   2508: sipush #255
    //   2511: iand
    //   2512: iastore
    //   2513: aload_0
    //   2514: dup
    //   2515: getfield f : I
    //   2518: iconst_3
    //   2519: iadd
    //   2520: putfield f : I
    //   2523: aload_0
    //   2524: dup
    //   2525: getfield g : I
    //   2528: iconst_3
    //   2529: isub
    //   2530: putfield g : I
    //   2533: aload_0
    //   2534: dup
    //   2535: getfield j : I
    //   2538: iconst_3
    //   2539: isub
    //   2540: putfield j : I
    //   2543: iinc #2, 1
    //   2546: goto -> 2396
    //   2549: aload_0
    //   2550: getfield j : I
    //   2553: ifle -> 2564
    //   2556: aload_0
    //   2557: aload_0
    //   2558: getfield j : I
    //   2561: putfield i : I
    //   2564: iconst_0
    //   2565: istore_2
    //   2566: iload_2
    //   2567: aload_0
    //   2568: getfield k : I
    //   2571: if_icmpge -> 2675
    //   2574: aload_0
    //   2575: getfield e : [I
    //   2578: iload_2
    //   2579: aload_0
    //   2580: getfield c : I
    //   2583: aload_0
    //   2584: getfield h : [I
    //   2587: iload_2
    //   2588: iaload
    //   2589: imul
    //   2590: aload_0
    //   2591: getfield m : I
    //   2594: iadd
    //   2595: iconst_1
    //   2596: isub
    //   2597: aload_0
    //   2598: getfield m : I
    //   2601: idiv
    //   2602: bipush #7
    //   2604: iadd
    //   2605: iconst_3
    //   2606: ishr
    //   2607: iastore
    //   2608: aload_0
    //   2609: getfield e : I
    //   2612: ifne -> 2645
    //   2615: aload_0
    //   2616: getfield a : [[B
    //   2619: iload_2
    //   2620: bipush #64
    //   2622: aload_0
    //   2623: getfield e : [I
    //   2626: iload_2
    //   2627: iaload
    //   2628: imul
    //   2629: aload_0
    //   2630: getfield g : [I
    //   2633: iload_2
    //   2634: iaload
    //   2635: imul
    //   2636: newarray byte
    //   2638: aastore
    //   2639: iinc #2, 1
    //   2642: goto -> 2566
    //   2645: aload_0
    //   2646: getfield a : [[B
    //   2649: iload_2
    //   2650: bipush #64
    //   2652: aload_0
    //   2653: getfield g : [I
    //   2656: iload_2
    //   2657: iaload
    //   2658: imul
    //   2659: aload_0
    //   2660: getfield h : [I
    //   2663: iload_2
    //   2664: iaload
    //   2665: imul
    //   2666: newarray byte
    //   2668: aastore
    //   2669: iinc #2, 1
    //   2672: goto -> 2566
    //   2675: aload_0
    //   2676: iconst_0
    //   2677: putfield w : I
    //   2680: aload_0
    //   2681: getfield k : I
    //   2684: iconst_1
    //   2685: if_icmple -> 2752
    //   2688: aload_0
    //   2689: aload_0
    //   2690: getfield m : I
    //   2693: iconst_3
    //   2694: ishl
    //   2695: aload_0
    //   2696: getfield c : I
    //   2699: bipush #8
    //   2701: aload_0
    //   2702: getfield m : I
    //   2705: imul
    //   2706: iadd
    //   2707: iconst_1
    //   2708: isub
    //   2709: aload_0
    //   2710: getfield m : I
    //   2713: iconst_3
    //   2714: ishl
    //   2715: idiv
    //   2716: imul
    //   2717: putfield n : I
    //   2720: aload_0
    //   2721: aload_0
    //   2722: getfield l : I
    //   2725: iconst_3
    //   2726: ishl
    //   2727: aload_0
    //   2728: getfield d : I
    //   2731: bipush #8
    //   2733: aload_0
    //   2734: getfield l : I
    //   2737: imul
    //   2738: iadd
    //   2739: iconst_1
    //   2740: isub
    //   2741: aload_0
    //   2742: getfield l : I
    //   2745: iconst_3
    //   2746: ishl
    //   2747: idiv
    //   2748: imul
    //   2749: putfield o : I
    //   2752: aload_0
    //   2753: iconst_2
    //   2754: putfield h : I
    //   2757: goto -> 23
    //   2760: aload_0
    //   2761: getfield h : I
    //   2764: iconst_5
    //   2765: if_icmpne -> 4027
    //   2768: aload_0
    //   2769: getfield g : I
    //   2772: iconst_2
    //   2773: if_icmpge -> 2781
    //   2776: aload_0
    //   2777: getfield g : I
    //   2780: ireturn
    //   2781: aload_0
    //   2782: getfield a : [B
    //   2785: aload_0
    //   2786: getfield f : I
    //   2789: baload
    //   2790: sipush #255
    //   2793: iand
    //   2794: sipush #255
    //   2797: if_icmpne -> 2892
    //   2800: aload_0
    //   2801: getfield a : [B
    //   2804: aload_0
    //   2805: getfield f : I
    //   2808: iconst_1
    //   2809: iadd
    //   2810: baload
    //   2811: ifeq -> 2892
    //   2814: aload_0
    //   2815: getfield a : [B
    //   2818: aload_0
    //   2819: getfield f : I
    //   2822: iconst_1
    //   2823: iadd
    //   2824: baload
    //   2825: sipush #255
    //   2828: iand
    //   2829: sipush #208
    //   2832: if_icmplt -> 2884
    //   2835: aload_0
    //   2836: getfield a : [B
    //   2839: aload_0
    //   2840: getfield f : I
    //   2843: iconst_1
    //   2844: iadd
    //   2845: baload
    //   2846: sipush #255
    //   2849: iand
    //   2850: sipush #215
    //   2853: if_icmpgt -> 2884
    //   2856: aload_0
    //   2857: iconst_4
    //   2858: putfield h : I
    //   2861: aload_0
    //   2862: dup
    //   2863: getfield f : I
    //   2866: iconst_2
    //   2867: iadd
    //   2868: putfield f : I
    //   2871: aload_0
    //   2872: dup
    //   2873: getfield g : I
    //   2876: iconst_2
    //   2877: isub
    //   2878: putfield g : I
    //   2881: goto -> 2760
    //   2884: aload_0
    //   2885: iconst_2
    //   2886: putfield h : I
    //   2889: goto -> 2760
    //   2892: aload_0
    //   2893: dup
    //   2894: getfield f : I
    //   2897: iconst_1
    //   2898: iadd
    //   2899: putfield f : I
    //   2902: aload_0
    //   2903: dup
    //   2904: getfield g : I
    //   2907: iconst_1
    //   2908: isub
    //   2909: putfield g : I
    //   2912: goto -> 2760
    //   2915: bipush #64
    //   2917: newarray short
    //   2919: astore_1
    //   2920: aload_0
    //   2921: getfield e : I
    //   2924: ifeq -> 2952
    //   2927: aload_0
    //   2928: getfield d : [I
    //   2931: ifnonnull -> 2952
    //   2934: aload_0
    //   2935: aload_0
    //   2936: getfield l : I
    //   2939: aload_0
    //   2940: getfield m : I
    //   2943: imul
    //   2944: bipush #6
    //   2946: ishl
    //   2947: newarray int
    //   2949: putfield d : [I
    //   2952: aload_0
    //   2953: getfield i : [I
    //   2956: aload_0
    //   2957: getfield q : I
    //   2960: iaload
    //   2961: istore_3
    //   2962: iconst_0
    //   2963: istore #4
    //   2965: iload #4
    //   2967: bipush #64
    //   2969: if_icmpge -> 2983
    //   2972: aload_1
    //   2973: iload #4
    //   2975: iconst_0
    //   2976: sastore
    //   2977: iinc #4, 1
    //   2980: goto -> 2965
    //   2983: iload_3
    //   2984: istore #7
    //   2986: aload_0
    //   2987: getfield g : I
    //   2990: istore #8
    //   2992: aload_0
    //   2993: getfield x : I
    //   2996: istore #9
    //   2998: aload_0
    //   2999: getfield y : I
    //   3002: istore #10
    //   3004: aload_0
    //   3005: getfield k : [I
    //   3008: iload #7
    //   3010: iconst_1
    //   3011: ishl
    //   3012: iaload
    //   3013: istore #11
    //   3015: aload_0
    //   3016: iload #11
    //   3018: invokespecial b : (I)I
    //   3021: dup
    //   3022: istore #11
    //   3024: ifge -> 3064
    //   3027: aload_0
    //   3028: dup
    //   3029: getfield f : I
    //   3032: iload #8
    //   3034: aload_0
    //   3035: getfield g : I
    //   3038: isub
    //   3039: isub
    //   3040: putfield f : I
    //   3043: aload_0
    //   3044: iload #8
    //   3046: putfield g : I
    //   3049: aload_0
    //   3050: iload #9
    //   3052: putfield x : I
    //   3055: aload_0
    //   3056: iload #10
    //   3058: putfield y : I
    //   3061: iload #11
    //   3063: ireturn
    //   3064: aload_0
    //   3065: iload #11
    //   3067: invokespecial a : (I)I
    //   3070: dup
    //   3071: istore #6
    //   3073: ifge -> 3113
    //   3076: aload_0
    //   3077: dup
    //   3078: getfield f : I
    //   3081: iload #8
    //   3083: aload_0
    //   3084: getfield g : I
    //   3087: isub
    //   3088: isub
    //   3089: putfield f : I
    //   3092: aload_0
    //   3093: iload #8
    //   3095: putfield g : I
    //   3098: aload_0
    //   3099: iload #9
    //   3101: putfield x : I
    //   3104: aload_0
    //   3105: iload #10
    //   3107: putfield y : I
    //   3110: iload #6
    //   3112: ireturn
    //   3113: iload #11
    //   3115: iload #6
    //   3117: invokestatic a : (II)I
    //   3120: istore #11
    //   3122: aload_1
    //   3123: iconst_0
    //   3124: iload #11
    //   3126: aload_0
    //   3127: getfield d : [S
    //   3130: iload #7
    //   3132: saload
    //   3133: iadd
    //   3134: i2s
    //   3135: sastore
    //   3136: aload_0
    //   3137: getfield k : [I
    //   3140: iload #7
    //   3142: iconst_1
    //   3143: ishl
    //   3144: iconst_1
    //   3145: iadd
    //   3146: iaload
    //   3147: istore #11
    //   3149: iconst_1
    //   3150: istore #6
    //   3152: iload #6
    //   3154: bipush #64
    //   3156: if_icmpge -> 3327
    //   3159: aload_0
    //   3160: iload #11
    //   3162: invokespecial b : (I)I
    //   3165: dup
    //   3166: istore #12
    //   3168: ifge -> 3208
    //   3171: aload_0
    //   3172: dup
    //   3173: getfield f : I
    //   3176: iload #8
    //   3178: aload_0
    //   3179: getfield g : I
    //   3182: isub
    //   3183: isub
    //   3184: putfield f : I
    //   3187: aload_0
    //   3188: iload #8
    //   3190: putfield g : I
    //   3193: aload_0
    //   3194: iload #9
    //   3196: putfield x : I
    //   3199: aload_0
    //   3200: iload #10
    //   3202: putfield y : I
    //   3205: iload #12
    //   3207: ireturn
    //   3208: iload #12
    //   3210: bipush #15
    //   3212: iand
    //   3213: istore #13
    //   3215: iload #12
    //   3217: iconst_4
    //   3218: ishr
    //   3219: istore #12
    //   3221: iload #13
    //   3223: ifne -> 3243
    //   3226: iload #12
    //   3228: bipush #15
    //   3230: if_icmpne -> 3327
    //   3233: iload #6
    //   3235: iload #12
    //   3237: iadd
    //   3238: istore #6
    //   3240: goto -> 3321
    //   3243: aload_0
    //   3244: iload #13
    //   3246: invokespecial a : (I)I
    //   3249: dup
    //   3250: istore #14
    //   3252: ifge -> 3292
    //   3255: aload_0
    //   3256: dup
    //   3257: getfield f : I
    //   3260: iload #8
    //   3262: aload_0
    //   3263: getfield g : I
    //   3266: isub
    //   3267: isub
    //   3268: putfield f : I
    //   3271: aload_0
    //   3272: iload #8
    //   3274: putfield g : I
    //   3277: aload_0
    //   3278: iload #9
    //   3280: putfield x : I
    //   3283: aload_0
    //   3284: iload #10
    //   3286: putfield y : I
    //   3289: iload #14
    //   3291: ireturn
    //   3292: iload #6
    //   3294: iload #12
    //   3296: iadd
    //   3297: dup
    //   3298: istore #6
    //   3300: bipush #64
    //   3302: if_icmplt -> 3309
    //   3305: bipush #63
    //   3307: istore #6
    //   3309: aload_1
    //   3310: iload #6
    //   3312: iload #13
    //   3314: iload #14
    //   3316: invokestatic a : (II)I
    //   3319: i2s
    //   3320: sastore
    //   3321: iinc #6, 1
    //   3324: goto -> 3152
    //   3327: aload_0
    //   3328: getfield d : [S
    //   3331: iload #7
    //   3333: aload_1
    //   3334: iconst_0
    //   3335: saload
    //   3336: sastore
    //   3337: aload_0
    //   3338: getfield j : [I
    //   3341: iload_3
    //   3342: iaload
    //   3343: aload_0
    //   3344: getfield g : [I
    //   3347: iload_3
    //   3348: iaload
    //   3349: aload_0
    //   3350: getfield h : [I
    //   3353: iload_3
    //   3354: iaload
    //   3355: imul
    //   3356: idiv
    //   3357: istore #4
    //   3359: aload_0
    //   3360: getfield j : [I
    //   3363: iload_3
    //   3364: iaload
    //   3365: aload_0
    //   3366: getfield g : [I
    //   3369: iload_3
    //   3370: iaload
    //   3371: aload_0
    //   3372: getfield h : [I
    //   3375: iload_3
    //   3376: iaload
    //   3377: imul
    //   3378: irem
    //   3379: istore #12
    //   3381: aload_0
    //   3382: getfield h : [I
    //   3385: iload_3
    //   3386: iaload
    //   3387: iload #4
    //   3389: imul
    //   3390: iload #12
    //   3392: aload_0
    //   3393: getfield h : [I
    //   3396: iload_3
    //   3397: iaload
    //   3398: irem
    //   3399: iadd
    //   3400: dup
    //   3401: istore #4
    //   3403: aload_0
    //   3404: getfield e : [I
    //   3407: iload_3
    //   3408: iaload
    //   3409: if_icmpge -> 3524
    //   3412: aload_0
    //   3413: getfield e : I
    //   3416: ifne -> 3469
    //   3419: iload #4
    //   3421: iload #12
    //   3423: aload_0
    //   3424: getfield h : [I
    //   3427: iload_3
    //   3428: iaload
    //   3429: idiv
    //   3430: aload_0
    //   3431: getfield e : [I
    //   3434: iload_3
    //   3435: iaload
    //   3436: imul
    //   3437: iconst_3
    //   3438: ishl
    //   3439: iadd
    //   3440: iconst_3
    //   3441: ishl
    //   3442: istore #4
    //   3444: aload_0
    //   3445: iload_3
    //   3446: aload_1
    //   3447: aload_0
    //   3448: getfield a : [[B
    //   3451: iload_3
    //   3452: aaload
    //   3453: iload #4
    //   3455: aload_0
    //   3456: getfield e : [I
    //   3459: iload_3
    //   3460: iaload
    //   3461: iconst_3
    //   3462: ishl
    //   3463: invokespecial a : (I[S[BII)V
    //   3466: goto -> 3524
    //   3469: iload #12
    //   3471: aload_0
    //   3472: getfield h : [I
    //   3475: iload_3
    //   3476: iaload
    //   3477: idiv
    //   3478: aload_0
    //   3479: getfield h : [I
    //   3482: iload_3
    //   3483: iaload
    //   3484: bipush #6
    //   3486: ishl
    //   3487: imul
    //   3488: iload #12
    //   3490: aload_0
    //   3491: getfield h : [I
    //   3494: iload_3
    //   3495: iaload
    //   3496: irem
    //   3497: iconst_3
    //   3498: ishl
    //   3499: iadd
    //   3500: istore #4
    //   3502: aload_0
    //   3503: iload_3
    //   3504: aload_1
    //   3505: aload_0
    //   3506: getfield a : [[B
    //   3509: iload_3
    //   3510: aaload
    //   3511: iload #4
    //   3513: aload_0
    //   3514: getfield h : [I
    //   3517: iload_3
    //   3518: iaload
    //   3519: iconst_3
    //   3520: ishl
    //   3521: invokespecial a : (I[S[BII)V
    //   3524: aload_0
    //   3525: getfield j : [I
    //   3528: iload_3
    //   3529: dup2
    //   3530: iaload
    //   3531: iconst_1
    //   3532: iadd
    //   3533: iastore
    //   3534: aload_0
    //   3535: dup
    //   3536: getfield u : I
    //   3539: iconst_1
    //   3540: isub
    //   3541: putfield u : I
    //   3544: aload_0
    //   3545: getfield u : I
    //   3548: aload_0
    //   3549: getfield v : I
    //   3552: irem
    //   3553: ifne -> 3742
    //   3556: aload_0
    //   3557: getfield e : I
    //   3560: ifeq -> 3742
    //   3563: aload_0
    //   3564: iconst_1
    //   3565: invokespecial a : (Z)V
    //   3568: aload_0
    //   3569: getfield z : I
    //   3572: aload_0
    //   3573: getfield c : I
    //   3576: irem
    //   3577: istore #13
    //   3579: aload_0
    //   3580: getfield z : I
    //   3583: aload_0
    //   3584: getfield c : I
    //   3587: idiv
    //   3588: istore #14
    //   3590: iload #13
    //   3592: aload_0
    //   3593: getfield e : I
    //   3596: ishr
    //   3597: istore #13
    //   3599: iload #14
    //   3601: aload_0
    //   3602: getfield e : I
    //   3605: ishr
    //   3606: dup
    //   3607: istore #14
    //   3609: aload_0
    //   3610: getfield b : I
    //   3613: imul
    //   3614: iload #13
    //   3616: iadd
    //   3617: istore #13
    //   3619: iconst_0
    //   3620: istore #6
    //   3622: iconst_0
    //   3623: istore_2
    //   3624: iload_2
    //   3625: aload_0
    //   3626: getfield l : I
    //   3629: iconst_3
    //   3630: ishl
    //   3631: aload_0
    //   3632: getfield e : I
    //   3635: ishr
    //   3636: if_icmpge -> 3737
    //   3639: iload_2
    //   3640: iload #14
    //   3642: iadd
    //   3643: aload_0
    //   3644: getfield a : I
    //   3647: if_icmpge -> 3737
    //   3650: iconst_0
    //   3651: istore #4
    //   3653: iload #4
    //   3655: aload_0
    //   3656: getfield A : I
    //   3659: aload_0
    //   3660: getfield e : I
    //   3663: ishr
    //   3664: if_icmpge -> 3706
    //   3667: aload_0
    //   3668: getfield c : [I
    //   3671: iload #13
    //   3673: iload #4
    //   3675: iadd
    //   3676: aload_0
    //   3677: getfield d : [I
    //   3680: iload #6
    //   3682: iload #4
    //   3684: aload_0
    //   3685: getfield e : I
    //   3688: ishl
    //   3689: iadd
    //   3690: iaload
    //   3691: iastore
    //   3692: getstatic l.c : I
    //   3695: iconst_1
    //   3696: iadd
    //   3697: putstatic l.c : I
    //   3700: iinc #4, 1
    //   3703: goto -> 3653
    //   3706: iload #13
    //   3708: aload_0
    //   3709: getfield b : I
    //   3712: iadd
    //   3713: istore #13
    //   3715: iload #6
    //   3717: aload_0
    //   3718: getfield m : I
    //   3721: iconst_3
    //   3722: ishl
    //   3723: aload_0
    //   3724: getfield e : I
    //   3727: ishl
    //   3728: iadd
    //   3729: istore #6
    //   3731: iinc #2, 1
    //   3734: goto -> 3624
    //   3737: aload_0
    //   3738: iconst_m1
    //   3739: putfield z : I
    //   3742: aload_0
    //   3743: getfield u : I
    //   3746: ifne -> 3871
    //   3749: aload_0
    //   3750: getfield e : I
    //   3753: ifne -> 3779
    //   3756: aload_0
    //   3757: iconst_0
    //   3758: invokespecial a : (Z)V
    //   3761: getstatic l.c : I
    //   3764: aload_0
    //   3765: getfield c : I
    //   3768: aload_0
    //   3769: getfield l : I
    //   3772: imul
    //   3773: iconst_3
    //   3774: ishl
    //   3775: iadd
    //   3776: putstatic l.c : I
    //   3779: aload_0
    //   3780: dup
    //   3781: getfield w : I
    //   3784: iconst_1
    //   3785: iadd
    //   3786: putfield w : I
    //   3789: aload_0
    //   3790: getfield p : I
    //   3793: iconst_1
    //   3794: if_icmple -> 3816
    //   3797: aload_0
    //   3798: getfield w : I
    //   3801: aload_0
    //   3802: getfield o : I
    //   3805: bipush #8
    //   3807: aload_0
    //   3808: getfield l : I
    //   3811: imul
    //   3812: idiv
    //   3813: if_icmpge -> 3859
    //   3816: aload_0
    //   3817: getfield p : I
    //   3820: iconst_1
    //   3821: if_icmpne -> 3867
    //   3824: aload_0
    //   3825: getfield w : I
    //   3828: aload_0
    //   3829: getfield g : [I
    //   3832: iload_3
    //   3833: iaload
    //   3834: aload_0
    //   3835: getfield d : I
    //   3838: imul
    //   3839: aload_0
    //   3840: getfield l : I
    //   3843: iadd
    //   3844: iconst_1
    //   3845: isub
    //   3846: aload_0
    //   3847: getfield l : I
    //   3850: idiv
    //   3851: bipush #7
    //   3853: iadd
    //   3854: iconst_3
    //   3855: ishr
    //   3856: if_icmplt -> 3867
    //   3859: aload_0
    //   3860: iconst_2
    //   3861: putfield h : I
    //   3864: goto -> 3968
    //   3867: aload_0
    //   3868: invokespecial a : ()V
    //   3871: aload_0
    //   3872: dup
    //   3873: getfield r : I
    //   3876: iconst_1
    //   3877: iadd
    //   3878: putfield r : I
    //   3881: aload_0
    //   3882: getfield r : I
    //   3885: aload_0
    //   3886: getfield g : [I
    //   3889: iload_3
    //   3890: iaload
    //   3891: aload_0
    //   3892: getfield h : [I
    //   3895: iload_3
    //   3896: iaload
    //   3897: imul
    //   3898: if_icmpge -> 3909
    //   3901: aload_0
    //   3902: getfield p : I
    //   3905: iconst_1
    //   3906: if_icmpne -> 3950
    //   3909: aload_0
    //   3910: iconst_0
    //   3911: putfield r : I
    //   3914: aload_0
    //   3915: dup
    //   3916: getfield q : I
    //   3919: iconst_1
    //   3920: iadd
    //   3921: putfield q : I
    //   3924: aload_0
    //   3925: getfield q : I
    //   3928: aload_0
    //   3929: getfield p : I
    //   3932: if_icmplt -> 3950
    //   3935: aload_0
    //   3936: iconst_0
    //   3937: putfield q : I
    //   3940: aload_0
    //   3941: dup
    //   3942: getfield s : I
    //   3945: iconst_1
    //   3946: iadd
    //   3947: putfield s : I
    //   3950: aload_0
    //   3951: getfield s : I
    //   3954: aload_0
    //   3955: getfield t : I
    //   3958: if_icmpne -> 2952
    //   3961: aload_0
    //   3962: getfield t : I
    //   3965: ifle -> 2952
    //   3968: aload_0
    //   3969: iconst_0
    //   3970: putfield s : I
    //   3973: aload_0
    //   3974: invokespecial b : ()V
    //   3977: aload_0
    //   3978: iconst_5
    //   3979: putfield h : I
    //   3982: iconst_0
    //   3983: istore_1
    //   3984: goto -> 23
    //   3987: iconst_0
    //   3988: ireturn
    //   3989: aload_0
    //   3990: getfield g : I
    //   3993: iconst_2
    //   3994: if_icmpge -> 4002
    //   3997: aload_0
    //   3998: getfield g : I
    //   4001: ireturn
    //   4002: aload_0
    //   4003: dup
    //   4004: getfield f : I
    //   4007: iconst_2
    //   4008: iadd
    //   4009: putfield f : I
    //   4012: aload_0
    //   4013: dup
    //   4014: getfield g : I
    //   4017: iconst_2
    //   4018: isub
    //   4019: putfield g : I
    //   4022: aload_0
    //   4023: iconst_1
    //   4024: putfield h : I
    //   4027: goto -> 23
    //   4030: iload_1
    //   4031: bipush #-2
    //   4033: if_icmpne -> 4041
    //   4036: aload_0
    //   4037: getfield g : I
    //   4040: ireturn
    //   4041: iload_1
    //   4042: ireturn
  }
  
  private void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : I
    //   4: iconst_3
    //   5: ishl
    //   6: dup
    //   7: istore_2
    //   8: aload_0
    //   9: getfield w : I
    //   12: imul
    //   13: istore_3
    //   14: iconst_3
    //   15: newarray int
    //   17: astore #4
    //   19: iconst_3
    //   20: newarray int
    //   22: astore #5
    //   24: iconst_3
    //   25: newarray int
    //   27: astore #6
    //   29: iconst_3
    //   30: newarray int
    //   32: astore #7
    //   34: aload_0
    //   35: getfield k : I
    //   38: iconst_3
    //   39: if_icmpne -> 165
    //   42: aload #4
    //   44: iconst_0
    //   45: iconst_0
    //   46: iastore
    //   47: aload #5
    //   49: iconst_0
    //   50: aload_0
    //   51: getfield g : [I
    //   54: iconst_0
    //   55: iaload
    //   56: bipush #11
    //   58: ishl
    //   59: aload_0
    //   60: getfield l : I
    //   63: idiv
    //   64: iastore
    //   65: aload #7
    //   67: iconst_0
    //   68: aload_0
    //   69: getfield h : [I
    //   72: iconst_0
    //   73: iaload
    //   74: bipush #11
    //   76: ishl
    //   77: aload_0
    //   78: getfield m : I
    //   81: idiv
    //   82: iastore
    //   83: aload #4
    //   85: iconst_1
    //   86: iconst_0
    //   87: iastore
    //   88: aload #5
    //   90: iconst_1
    //   91: aload_0
    //   92: getfield g : [I
    //   95: iconst_1
    //   96: iaload
    //   97: bipush #11
    //   99: ishl
    //   100: aload_0
    //   101: getfield l : I
    //   104: idiv
    //   105: iastore
    //   106: aload #7
    //   108: iconst_1
    //   109: aload_0
    //   110: getfield h : [I
    //   113: iconst_1
    //   114: iaload
    //   115: bipush #11
    //   117: ishl
    //   118: aload_0
    //   119: getfield m : I
    //   122: idiv
    //   123: iastore
    //   124: aload #4
    //   126: iconst_2
    //   127: iconst_0
    //   128: iastore
    //   129: aload #5
    //   131: iconst_2
    //   132: aload_0
    //   133: getfield g : [I
    //   136: iconst_2
    //   137: iaload
    //   138: bipush #11
    //   140: ishl
    //   141: aload_0
    //   142: getfield l : I
    //   145: idiv
    //   146: iastore
    //   147: aload #7
    //   149: iconst_2
    //   150: aload_0
    //   151: getfield h : [I
    //   154: iconst_2
    //   155: iaload
    //   156: bipush #11
    //   158: ishl
    //   159: aload_0
    //   160: getfield m : I
    //   163: idiv
    //   164: iastore
    //   165: iload_1
    //   166: ifne -> 180
    //   169: aload_0
    //   170: aload_0
    //   171: getfield c : I
    //   174: putfield A : I
    //   177: goto -> 228
    //   180: aload_0
    //   181: aload_0
    //   182: getfield u : I
    //   185: ifeq -> 197
    //   188: aload_0
    //   189: getfield m : I
    //   192: iconst_3
    //   193: ishl
    //   194: goto -> 208
    //   197: aload_0
    //   198: getfield c : I
    //   201: aload_0
    //   202: getfield m : I
    //   205: iconst_3
    //   206: ishl
    //   207: irem
    //   208: putfield A : I
    //   211: aload_0
    //   212: getfield A : I
    //   215: ifne -> 228
    //   218: aload_0
    //   219: aload_0
    //   220: getfield m : I
    //   223: iconst_3
    //   224: ishl
    //   225: putfield A : I
    //   228: iload_1
    //   229: ifeq -> 239
    //   232: aload_0
    //   233: getfield d : [I
    //   236: goto -> 243
    //   239: aload_0
    //   240: getfield c : [I
    //   243: astore #8
    //   245: iconst_0
    //   246: istore #9
    //   248: iload #9
    //   250: iload_2
    //   251: if_icmpge -> 1443
    //   254: iload_3
    //   255: iload #9
    //   257: iadd
    //   258: aload_0
    //   259: getfield d : I
    //   262: if_icmpge -> 1437
    //   265: aload_0
    //   266: getfield k : I
    //   269: iconst_3
    //   270: if_icmpne -> 1437
    //   273: iload_3
    //   274: iload #9
    //   276: iadd
    //   277: aload_0
    //   278: getfield c : I
    //   281: imul
    //   282: istore #10
    //   284: iload_1
    //   285: ifeq -> 350
    //   288: iload #10
    //   290: aload_0
    //   291: getfield e : [I
    //   294: iconst_0
    //   295: iaload
    //   296: iconst_1
    //   297: iadd
    //   298: bipush #-2
    //   300: iand
    //   301: iconst_3
    //   302: ishl
    //   303: aload_0
    //   304: getfield u : I
    //   307: aload_0
    //   308: getfield v : I
    //   311: idiv
    //   312: iconst_1
    //   313: iadd
    //   314: aload_0
    //   315: getfield m : I
    //   318: imul
    //   319: iconst_3
    //   320: ishl
    //   321: isub
    //   322: iadd
    //   323: istore #10
    //   325: aload_0
    //   326: getfield z : I
    //   329: iconst_m1
    //   330: if_icmpne -> 339
    //   333: aload_0
    //   334: iload #10
    //   336: putfield z : I
    //   339: iload #9
    //   341: aload_0
    //   342: getfield m : I
    //   345: imul
    //   346: iconst_3
    //   347: ishl
    //   348: istore #10
    //   350: aload #4
    //   352: iconst_0
    //   353: iaload
    //   354: bipush #11
    //   356: ishr
    //   357: iload_1
    //   358: ifeq -> 372
    //   361: aload_0
    //   362: getfield h : [I
    //   365: iconst_0
    //   366: iaload
    //   367: iconst_3
    //   368: ishl
    //   369: goto -> 380
    //   372: aload_0
    //   373: getfield e : [I
    //   376: iconst_0
    //   377: iaload
    //   378: iconst_3
    //   379: ishl
    //   380: imul
    //   381: istore #11
    //   383: aload #4
    //   385: iconst_0
    //   386: dup2
    //   387: iaload
    //   388: aload #5
    //   390: iconst_0
    //   391: iaload
    //   392: iadd
    //   393: iastore
    //   394: aload #6
    //   396: iconst_0
    //   397: iconst_0
    //   398: iastore
    //   399: aload #4
    //   401: iconst_1
    //   402: iaload
    //   403: bipush #11
    //   405: ishr
    //   406: iload_1
    //   407: ifeq -> 421
    //   410: aload_0
    //   411: getfield h : [I
    //   414: iconst_1
    //   415: iaload
    //   416: iconst_3
    //   417: ishl
    //   418: goto -> 429
    //   421: aload_0
    //   422: getfield e : [I
    //   425: iconst_1
    //   426: iaload
    //   427: iconst_3
    //   428: ishl
    //   429: imul
    //   430: istore #12
    //   432: aload #4
    //   434: iconst_1
    //   435: dup2
    //   436: iaload
    //   437: aload #5
    //   439: iconst_1
    //   440: iaload
    //   441: iadd
    //   442: iastore
    //   443: aload #6
    //   445: iconst_1
    //   446: iconst_0
    //   447: iastore
    //   448: aload #4
    //   450: iconst_2
    //   451: iaload
    //   452: bipush #11
    //   454: ishr
    //   455: iload_1
    //   456: ifeq -> 470
    //   459: aload_0
    //   460: getfield h : [I
    //   463: iconst_2
    //   464: iaload
    //   465: iconst_3
    //   466: ishl
    //   467: goto -> 478
    //   470: aload_0
    //   471: getfield e : [I
    //   474: iconst_2
    //   475: iaload
    //   476: iconst_3
    //   477: ishl
    //   478: imul
    //   479: istore #13
    //   481: aload #4
    //   483: iconst_2
    //   484: dup2
    //   485: iaload
    //   486: aload #5
    //   488: iconst_2
    //   489: iaload
    //   490: iadd
    //   491: iastore
    //   492: aload #6
    //   494: iconst_2
    //   495: iconst_0
    //   496: iastore
    //   497: aload_0
    //   498: getfield h : [I
    //   501: iconst_0
    //   502: iaload
    //   503: iconst_2
    //   504: if_icmpne -> 1006
    //   507: aload_0
    //   508: getfield h : [I
    //   511: iconst_1
    //   512: iaload
    //   513: iconst_1
    //   514: if_icmpne -> 1006
    //   517: aload_0
    //   518: getfield h : [I
    //   521: iconst_2
    //   522: iaload
    //   523: iconst_1
    //   524: if_icmpne -> 1006
    //   527: iconst_0
    //   528: istore #14
    //   530: iload #14
    //   532: aload_0
    //   533: getfield A : I
    //   536: iconst_1
    //   537: ishr
    //   538: if_icmpge -> 803
    //   541: aload_0
    //   542: getfield a : [[B
    //   545: iconst_0
    //   546: aaload
    //   547: iload #11
    //   549: iload #14
    //   551: iconst_1
    //   552: ishl
    //   553: iadd
    //   554: baload
    //   555: sipush #255
    //   558: iand
    //   559: istore #15
    //   561: aload_0
    //   562: getfield a : [[B
    //   565: iconst_1
    //   566: aaload
    //   567: iload #12
    //   569: iload #14
    //   571: iadd
    //   572: baload
    //   573: sipush #255
    //   576: iand
    //   577: istore #16
    //   579: aload_0
    //   580: getfield a : [[B
    //   583: iconst_2
    //   584: aaload
    //   585: iload #13
    //   587: iload #14
    //   589: iadd
    //   590: baload
    //   591: sipush #255
    //   594: iand
    //   595: istore #17
    //   597: getstatic m.b : [S
    //   600: iload #17
    //   602: saload
    //   603: istore #18
    //   605: getstatic m.c : [S
    //   608: iload #16
    //   610: saload
    //   611: istore #19
    //   613: iinc #16, -128
    //   616: iinc #17, -128
    //   619: iload #16
    //   621: sipush #705
    //   624: imul
    //   625: iload #17
    //   627: sipush #1463
    //   630: imul
    //   631: iadd
    //   632: sipush #1024
    //   635: iadd
    //   636: bipush #11
    //   638: ishr
    //   639: istore #16
    //   641: getstatic m.a : [S
    //   644: iload #15
    //   646: iload #18
    //   648: iadd
    //   649: sipush #256
    //   652: iadd
    //   653: saload
    //   654: istore #17
    //   656: getstatic m.a : [S
    //   659: iload #15
    //   661: iload #16
    //   663: isub
    //   664: sipush #256
    //   667: iadd
    //   668: saload
    //   669: istore #20
    //   671: getstatic m.a : [S
    //   674: iload #15
    //   676: iload #19
    //   678: iadd
    //   679: sipush #256
    //   682: iadd
    //   683: saload
    //   684: istore #15
    //   686: aload #8
    //   688: iload #10
    //   690: iinc #10, 1
    //   693: iload #17
    //   695: bipush #16
    //   697: ishl
    //   698: iload #20
    //   700: bipush #8
    //   702: ishl
    //   703: ior
    //   704: iload #15
    //   706: ior
    //   707: iastore
    //   708: aload_0
    //   709: getfield a : [[B
    //   712: iconst_0
    //   713: aaload
    //   714: iload #11
    //   716: iload #14
    //   718: iconst_1
    //   719: ishl
    //   720: iadd
    //   721: iconst_1
    //   722: iadd
    //   723: baload
    //   724: sipush #255
    //   727: iand
    //   728: istore #15
    //   730: getstatic m.a : [S
    //   733: iload #15
    //   735: iload #18
    //   737: iadd
    //   738: sipush #256
    //   741: iadd
    //   742: saload
    //   743: istore #17
    //   745: getstatic m.a : [S
    //   748: iload #15
    //   750: iload #16
    //   752: isub
    //   753: sipush #256
    //   756: iadd
    //   757: saload
    //   758: istore #16
    //   760: getstatic m.a : [S
    //   763: iload #15
    //   765: iload #19
    //   767: iadd
    //   768: sipush #256
    //   771: iadd
    //   772: saload
    //   773: istore #15
    //   775: aload #8
    //   777: iload #10
    //   779: iinc #10, 1
    //   782: iload #17
    //   784: bipush #16
    //   786: ishl
    //   787: iload #16
    //   789: bipush #8
    //   791: ishl
    //   792: ior
    //   793: iload #15
    //   795: ior
    //   796: iastore
    //   797: iinc #14, 1
    //   800: goto -> 530
    //   803: aload_0
    //   804: getfield c : I
    //   807: iconst_1
    //   808: iand
    //   809: ifeq -> 1437
    //   812: aload_0
    //   813: getfield u : I
    //   816: ifne -> 1437
    //   819: iload_1
    //   820: ifeq -> 833
    //   823: bipush #8
    //   825: aload_0
    //   826: getfield m : I
    //   829: imul
    //   830: goto -> 837
    //   833: aload_0
    //   834: getfield c : I
    //   837: istore #14
    //   839: aload_0
    //   840: getfield a : [[B
    //   843: iconst_0
    //   844: aaload
    //   845: iload #11
    //   847: iload #14
    //   849: iadd
    //   850: iconst_1
    //   851: isub
    //   852: baload
    //   853: sipush #255
    //   856: iand
    //   857: istore #11
    //   859: aload_0
    //   860: getfield a : [[B
    //   863: iconst_1
    //   864: aaload
    //   865: iload #12
    //   867: iload #14
    //   869: iconst_1
    //   870: isub
    //   871: iconst_1
    //   872: ishr
    //   873: iadd
    //   874: baload
    //   875: sipush #255
    //   878: iand
    //   879: istore #12
    //   881: aload_0
    //   882: getfield a : [[B
    //   885: iconst_2
    //   886: aaload
    //   887: iload #13
    //   889: iload #14
    //   891: iconst_1
    //   892: isub
    //   893: iconst_1
    //   894: ishr
    //   895: iadd
    //   896: baload
    //   897: sipush #255
    //   900: iand
    //   901: istore #13
    //   903: getstatic m.a : [S
    //   906: iload #11
    //   908: getstatic m.c : [S
    //   911: iload #12
    //   913: saload
    //   914: iadd
    //   915: sipush #256
    //   918: iadd
    //   919: saload
    //   920: istore #14
    //   922: iinc #12, -128
    //   925: iinc #13, -128
    //   928: getstatic m.a : [S
    //   931: iload #11
    //   933: iload #12
    //   935: sipush #705
    //   938: imul
    //   939: iload #13
    //   941: sipush #1463
    //   944: imul
    //   945: iadd
    //   946: sipush #1024
    //   949: iadd
    //   950: bipush #11
    //   952: ishr
    //   953: isub
    //   954: sipush #256
    //   957: iadd
    //   958: saload
    //   959: istore #12
    //   961: getstatic m.a : [S
    //   964: iload #11
    //   966: getstatic m.b : [S
    //   969: iload #13
    //   971: sipush #128
    //   974: iadd
    //   975: saload
    //   976: iadd
    //   977: sipush #256
    //   980: iadd
    //   981: saload
    //   982: istore #11
    //   984: aload #8
    //   986: iload #10
    //   988: iload #11
    //   990: bipush #16
    //   992: ishl
    //   993: iload #12
    //   995: bipush #8
    //   997: ishl
    //   998: ior
    //   999: iload #14
    //   1001: ior
    //   1002: iastore
    //   1003: goto -> 1437
    //   1006: aload_0
    //   1007: getfield h : [I
    //   1010: iconst_0
    //   1011: iaload
    //   1012: iconst_1
    //   1013: if_icmpne -> 1214
    //   1016: aload_0
    //   1017: getfield h : [I
    //   1020: iconst_1
    //   1021: iaload
    //   1022: iconst_1
    //   1023: if_icmpne -> 1214
    //   1026: aload_0
    //   1027: getfield h : [I
    //   1030: iconst_2
    //   1031: iaload
    //   1032: iconst_1
    //   1033: if_icmpne -> 1214
    //   1036: iconst_0
    //   1037: istore #14
    //   1039: iload #14
    //   1041: aload_0
    //   1042: getfield A : I
    //   1045: if_icmpge -> 1211
    //   1048: aload_0
    //   1049: getfield a : [[B
    //   1052: iconst_0
    //   1053: aaload
    //   1054: iload #11
    //   1056: iload #14
    //   1058: iadd
    //   1059: baload
    //   1060: sipush #255
    //   1063: iand
    //   1064: istore #15
    //   1066: aload_0
    //   1067: getfield a : [[B
    //   1070: iconst_1
    //   1071: aaload
    //   1072: iload #12
    //   1074: iload #14
    //   1076: iadd
    //   1077: baload
    //   1078: sipush #255
    //   1081: iand
    //   1082: istore #16
    //   1084: aload_0
    //   1085: getfield a : [[B
    //   1088: iconst_2
    //   1089: aaload
    //   1090: iload #13
    //   1092: iload #14
    //   1094: iadd
    //   1095: baload
    //   1096: sipush #255
    //   1099: iand
    //   1100: istore #17
    //   1102: getstatic m.a : [S
    //   1105: iload #15
    //   1107: getstatic m.c : [S
    //   1110: iload #16
    //   1112: saload
    //   1113: iadd
    //   1114: sipush #256
    //   1117: iadd
    //   1118: saload
    //   1119: istore #18
    //   1121: iinc #16, -128
    //   1124: iinc #17, -128
    //   1127: getstatic m.a : [S
    //   1130: iload #15
    //   1132: iload #16
    //   1134: sipush #705
    //   1137: imul
    //   1138: iload #17
    //   1140: sipush #1463
    //   1143: imul
    //   1144: iadd
    //   1145: sipush #1024
    //   1148: iadd
    //   1149: bipush #11
    //   1151: ishr
    //   1152: isub
    //   1153: sipush #256
    //   1156: iadd
    //   1157: saload
    //   1158: istore #16
    //   1160: getstatic m.a : [S
    //   1163: iload #15
    //   1165: getstatic m.b : [S
    //   1168: iload #17
    //   1170: sipush #128
    //   1173: iadd
    //   1174: saload
    //   1175: iadd
    //   1176: sipush #256
    //   1179: iadd
    //   1180: saload
    //   1181: istore #15
    //   1183: aload #8
    //   1185: iload #10
    //   1187: iinc #10, 1
    //   1190: iload #15
    //   1192: bipush #16
    //   1194: ishl
    //   1195: iload #16
    //   1197: bipush #8
    //   1199: ishl
    //   1200: ior
    //   1201: iload #18
    //   1203: ior
    //   1204: iastore
    //   1205: iinc #14, 1
    //   1208: goto -> 1039
    //   1211: goto -> 1437
    //   1214: iconst_0
    //   1215: istore #14
    //   1217: iload #14
    //   1219: aload_0
    //   1220: getfield A : I
    //   1223: if_icmpge -> 1437
    //   1226: aload #6
    //   1228: iconst_0
    //   1229: iaload
    //   1230: bipush #11
    //   1232: ishr
    //   1233: istore #15
    //   1235: aload #6
    //   1237: iconst_0
    //   1238: dup2
    //   1239: iaload
    //   1240: aload #7
    //   1242: iconst_0
    //   1243: iaload
    //   1244: iadd
    //   1245: iastore
    //   1246: aload_0
    //   1247: getfield a : [[B
    //   1250: iconst_0
    //   1251: aaload
    //   1252: iload #11
    //   1254: iload #15
    //   1256: iadd
    //   1257: baload
    //   1258: istore #15
    //   1260: aload #6
    //   1262: iconst_1
    //   1263: iaload
    //   1264: bipush #11
    //   1266: ishr
    //   1267: istore #16
    //   1269: aload #6
    //   1271: iconst_1
    //   1272: dup2
    //   1273: iaload
    //   1274: aload #7
    //   1276: iconst_1
    //   1277: iaload
    //   1278: iadd
    //   1279: iastore
    //   1280: aload_0
    //   1281: getfield a : [[B
    //   1284: iconst_1
    //   1285: aaload
    //   1286: iload #12
    //   1288: iload #16
    //   1290: iadd
    //   1291: baload
    //   1292: istore #16
    //   1294: aload #6
    //   1296: iconst_2
    //   1297: iaload
    //   1298: bipush #11
    //   1300: ishr
    //   1301: istore #17
    //   1303: aload #6
    //   1305: iconst_2
    //   1306: dup2
    //   1307: iaload
    //   1308: aload #7
    //   1310: iconst_2
    //   1311: iaload
    //   1312: iadd
    //   1313: iastore
    //   1314: aload_0
    //   1315: getfield a : [[B
    //   1318: iconst_2
    //   1319: aaload
    //   1320: iload #13
    //   1322: iload #17
    //   1324: iadd
    //   1325: baload
    //   1326: istore #17
    //   1328: getstatic m.a : [S
    //   1331: iload #15
    //   1333: getstatic m.c : [S
    //   1336: iload #16
    //   1338: saload
    //   1339: iadd
    //   1340: sipush #256
    //   1343: iadd
    //   1344: saload
    //   1345: istore #18
    //   1347: iinc #16, -128
    //   1350: iinc #17, -128
    //   1353: getstatic m.a : [S
    //   1356: iload #15
    //   1358: iload #16
    //   1360: sipush #705
    //   1363: imul
    //   1364: iload #17
    //   1366: sipush #1463
    //   1369: imul
    //   1370: iadd
    //   1371: sipush #1024
    //   1374: iadd
    //   1375: bipush #11
    //   1377: ishr
    //   1378: isub
    //   1379: sipush #256
    //   1382: iadd
    //   1383: saload
    //   1384: istore #16
    //   1386: getstatic m.a : [S
    //   1389: iload #15
    //   1391: getstatic m.b : [S
    //   1394: iload #17
    //   1396: sipush #128
    //   1399: iadd
    //   1400: saload
    //   1401: iadd
    //   1402: sipush #256
    //   1405: iadd
    //   1406: saload
    //   1407: istore #15
    //   1409: aload #8
    //   1411: iload #10
    //   1413: iinc #10, 1
    //   1416: iload #15
    //   1418: bipush #16
    //   1420: ishl
    //   1421: iload #16
    //   1423: bipush #8
    //   1425: ishl
    //   1426: ior
    //   1427: iload #18
    //   1429: ior
    //   1430: iastore
    //   1431: iinc #14, 1
    //   1434: goto -> 1217
    //   1437: iinc #9, 1
    //   1440: goto -> 248
    //   1443: return
  }
  
  private void a() {
    if (this.p == 1) {
      int i = this.i[this.q];
      this.u = (this.h[i] * this.c + this.m - 1) / this.m + 7 >> 3;
      this.j[this.i[this.q]] = 0;
      return;
    } 
    this.u = 0;
    for (byte b = 0; b < this.p; b++) {
      this.u += this.g[this.i[b]] * this.h[this.i[b]];
      this.j[this.i[b]] = 0;
    } 
    this.v = this.u;
    this.u *= this.n / 8 * this.m;
  }
  
  private void b() {
    for (byte b = 0; b < 3; b++)
      this.d[b] = 0; 
    this.x = 0;
    this.y = 0;
  }
  
  private void c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield y : I
    //   4: bipush #24
    //   6: if_icmpgt -> 132
    //   9: aload_0
    //   10: getfield g : I
    //   13: ifle -> 132
    //   16: aload_0
    //   17: getfield a : [B
    //   20: aload_0
    //   21: getfield f : I
    //   24: baload
    //   25: sipush #255
    //   28: iand
    //   29: dup
    //   30: istore_1
    //   31: sipush #255
    //   34: if_icmpne -> 80
    //   37: aload_0
    //   38: getfield g : I
    //   41: iconst_2
    //   42: if_icmplt -> 59
    //   45: aload_0
    //   46: getfield a : [B
    //   49: aload_0
    //   50: getfield f : I
    //   53: iconst_1
    //   54: iadd
    //   55: baload
    //   56: ifeq -> 60
    //   59: return
    //   60: aload_0
    //   61: dup
    //   62: getfield f : I
    //   65: iconst_1
    //   66: iadd
    //   67: putfield f : I
    //   70: aload_0
    //   71: dup
    //   72: getfield g : I
    //   75: iconst_1
    //   76: isub
    //   77: putfield g : I
    //   80: aload_0
    //   81: dup
    //   82: getfield f : I
    //   85: iconst_1
    //   86: iadd
    //   87: putfield f : I
    //   90: aload_0
    //   91: dup
    //   92: getfield g : I
    //   95: iconst_1
    //   96: isub
    //   97: putfield g : I
    //   100: aload_0
    //   101: dup
    //   102: getfield x : I
    //   105: iload_1
    //   106: bipush #24
    //   108: aload_0
    //   109: getfield y : I
    //   112: isub
    //   113: ishl
    //   114: ior
    //   115: putfield x : I
    //   118: aload_0
    //   119: dup
    //   120: getfield y : I
    //   123: bipush #8
    //   125: iadd
    //   126: putfield y : I
    //   129: goto -> 0
    //   132: return
  }
  
  private static int a(int paramInt1, int paramInt2) {
    return (paramInt2 < 1 << paramInt1 - 1) ? (paramInt2 + (-1 << paramInt1) + 1) : paramInt2;
  }
  
  private int a(int paramInt) {
    if (paramInt == 0)
      return 0; 
    if (this.y < paramInt) {
      c();
      if (this.y < paramInt)
        return -2; 
    } 
    int i = this.x >>> 32 - paramInt;
    this.x <<= paramInt;
    this.y -= paramInt;
    return i;
  }
  
  public m() {
    this.a = new int[16][];
    this.b = (byte[][])new int[16][];
    this.a = (int[][])new short[16][];
    this.b = new byte[16][];
    this.c = (int[][])new byte[16][];
    this.d = new short[3];
    this.l = new int[3];
    this.c = new int[4][];
    this.z = -1;
    l.a();
    for (byte b = 0; b < 3; b++) {
      this.a[b] = null;
      this.a[b] = null;
      this.b[b] = null;
      this.a[b] = null;
      this.b[b] = null;
      this.c[b] = null;
    } 
  }
  
  private int b(int paramInt) {
    if (this.y < 8) {
      c();
      if (this.y < 8)
        return b(paramInt, 1); 
    } 
    int i = this.x >>> 24;
    int j;
    if ((j = this.c[paramInt][i]) <= 8) {
      this.x <<= j;
      this.y -= j;
      return this.c[paramInt][i + 256] & 0xFF;
    } 
    return b(paramInt, 9);
  }
  
  private int b(int paramInt1, int paramInt2) {
    int i = paramInt2 - 1;
    if ((paramInt2 = a(paramInt2)) < 0)
      return paramInt2; 
    while (i < 16 && paramInt2 > this.a[paramInt1][i]) {
      i++;
      int j;
      if ((j = a(1)) < 0)
        return j; 
      paramInt2 = paramInt2 << 1 | j;
    } 
    paramInt2 = this.a[paramInt1][i] + paramInt2 - this.b[paramInt1][i];
    return this.b[paramInt1][paramInt2] & 0xFF;
  }
  
  private static int c(int paramInt1, int paramInt2) {
    return (paramInt1 >> 8) * (paramInt2 >> 3);
  }
  
  private void a(int paramInt1, short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    int[] arrayOfInt = new int[64];
    int i;
    for (i = 0; i < 64; i += 8) {
      arrayOfInt[i] = paramArrayOfshort[a[i]] * this.c[this.l[paramInt1]][i];
      arrayOfInt[i + 1] = paramArrayOfshort[a[i + 1]];
      arrayOfInt[i + 2] = paramArrayOfshort[a[i + 2]];
      arrayOfInt[i + 3] = paramArrayOfshort[a[i + 3]];
      arrayOfInt[i + 4] = paramArrayOfshort[a[i + 4]];
      arrayOfInt[i + 5] = paramArrayOfshort[a[i + 5]];
      arrayOfInt[i + 6] = paramArrayOfshort[a[i + 6]];
      arrayOfInt[i + 7] = paramArrayOfshort[a[i + 7]];
      if (arrayOfInt[i + 1] != 0 || arrayOfInt[i + 2] != 0 || arrayOfInt[i + 3] != 0 || arrayOfInt[i + 4] != 0 || arrayOfInt[i + 5] != 0 || arrayOfInt[i + 6] != 0 || arrayOfInt[i + 7] != 0) {
        arrayOfInt[i + 1] = arrayOfInt[i + 1] * this.c[this.l[paramInt1]][i + 1];
        arrayOfInt[i + 2] = arrayOfInt[i + 2] * this.c[this.l[paramInt1]][i + 2];
        arrayOfInt[i + 3] = arrayOfInt[i + 3] * this.c[this.l[paramInt1]][i + 3];
        arrayOfInt[i + 4] = arrayOfInt[i + 4] * this.c[this.l[paramInt1]][i + 4];
        arrayOfInt[i + 5] = arrayOfInt[i + 5] * this.c[this.l[paramInt1]][i + 5];
        arrayOfInt[i + 6] = arrayOfInt[i + 6] * this.c[this.l[paramInt1]][i + 6];
        arrayOfInt[i + 7] = arrayOfInt[i + 7] * this.c[this.l[paramInt1]][i + 7];
        int j = arrayOfInt[i + 1] + arrayOfInt[i + 7];
        int k = arrayOfInt[i + 3] + arrayOfInt[i + 5];
        int n = arrayOfInt[i + 1] - arrayOfInt[i + 7];
        arrayOfInt[i + 1] = arrayOfInt[i + 4];
        arrayOfInt[i + 4] = arrayOfInt[i + 5] - arrayOfInt[i + 3];
        arrayOfInt[i + 3] = arrayOfInt[i + 2] + arrayOfInt[i + 6];
        arrayOfInt[i + 2] = arrayOfInt[i + 2] - arrayOfInt[i + 6];
        arrayOfInt[i + 5] = j - k;
        arrayOfInt[i + 6] = n;
        arrayOfInt[i + 7] = j + k;
      } 
    } 
    for (i = 0; i < 8; i++) {
      if (arrayOfInt[i + 8] != 0 || arrayOfInt[i + 16] != 0 || arrayOfInt[i + 24] != 0 || arrayOfInt[i + 32] != 0 || arrayOfInt[i + 40] != 0 || arrayOfInt[i + 48] != 0 || arrayOfInt[i + 56] != 0) {
        paramInt1 = arrayOfInt[i + 8] + arrayOfInt[i + 56];
        int j = arrayOfInt[i + 24] + arrayOfInt[i + 40];
        int k = arrayOfInt[i + 8] - arrayOfInt[i + 56];
        arrayOfInt[i + 8] = arrayOfInt[i + 32];
        arrayOfInt[i + 32] = arrayOfInt[i + 40] - arrayOfInt[i + 24];
        arrayOfInt[i + 24] = arrayOfInt[i + 16] + arrayOfInt[i + 48];
        arrayOfInt[i + 16] = arrayOfInt[i + 16] - arrayOfInt[i + 48];
        arrayOfInt[i + 40] = paramInt1 - j;
        arrayOfInt[i + 48] = k;
        arrayOfInt[i + 56] = paramInt1 + j;
      } 
    } 
    i = c(arrayOfInt[4] + arrayOfInt[6], 1567);
    arrayOfInt[2] = c(arrayOfInt[2], 2896);
    arrayOfInt[4] = -c(arrayOfInt[4], 2217) - i;
    arrayOfInt[5] = c(arrayOfInt[5], 2896);
    arrayOfInt[6] = c(arrayOfInt[6], 5352) - i;
    i = c(arrayOfInt[12] + arrayOfInt[14], 1567);
    arrayOfInt[10] = c(arrayOfInt[10], 2896);
    arrayOfInt[12] = -c(arrayOfInt[12], 2217) - i;
    arrayOfInt[13] = c(arrayOfInt[13], 2896);
    arrayOfInt[14] = c(arrayOfInt[14], 5352) - i;
    i = c(arrayOfInt[28] + arrayOfInt[30], 1567);
    arrayOfInt[26] = c(arrayOfInt[26], 2896);
    arrayOfInt[28] = -c(arrayOfInt[28], 2217) - i;
    arrayOfInt[29] = c(arrayOfInt[29], 2896);
    arrayOfInt[30] = c(arrayOfInt[30], 5352) - i;
    i = c(arrayOfInt[60] + arrayOfInt[62], 1567);
    arrayOfInt[58] = c(arrayOfInt[58], 2896);
    arrayOfInt[60] = -c(arrayOfInt[60], 2217) - i;
    arrayOfInt[61] = c(arrayOfInt[61], 2896);
    arrayOfInt[62] = c(arrayOfInt[62], 5352) - i;
    i = c(arrayOfInt[20] + arrayOfInt[22], 2217);
    arrayOfInt[16] = c(arrayOfInt[16], 2896);
    arrayOfInt[17] = c(arrayOfInt[17], 2896);
    arrayOfInt[18] = arrayOfInt[18] << 1;
    arrayOfInt[19] = c(arrayOfInt[19], 2896);
    arrayOfInt[20] = -c(arrayOfInt[20], 3135) - i;
    arrayOfInt[21] = arrayOfInt[21] << 1;
    arrayOfInt[22] = c(arrayOfInt[22], 7568) - i;
    arrayOfInt[23] = c(arrayOfInt[23], 2896);
    i = c(arrayOfInt[44] + arrayOfInt[46], 2217);
    arrayOfInt[40] = c(arrayOfInt[40], 2896);
    arrayOfInt[41] = c(arrayOfInt[41], 2896);
    arrayOfInt[42] = arrayOfInt[42] << 1;
    arrayOfInt[43] = c(arrayOfInt[43], 2896);
    arrayOfInt[44] = -c(arrayOfInt[44], 3135) - i;
    arrayOfInt[45] = arrayOfInt[45] << 1;
    arrayOfInt[46] = c(arrayOfInt[46], 7568) - i;
    arrayOfInt[47] = c(arrayOfInt[47], 2896);
    i = arrayOfInt[32];
    arrayOfInt[32] = -c(i, 3784) - c(arrayOfInt[48], 1567);
    arrayOfInt[48] = -c(i, 1567) + c(arrayOfInt[48], 3784);
    if (arrayOfInt[33] == 0 && arrayOfInt[34] == 0 && arrayOfInt[35] == 0 && arrayOfInt[36] == 0 && arrayOfInt[37] == 0 && arrayOfInt[38] == 0 && arrayOfInt[39] == 0) {
      arrayOfInt[33] = -c(arrayOfInt[49], 1567);
      arrayOfInt[49] = c(arrayOfInt[49], 3784);
      arrayOfInt[34] = -c(arrayOfInt[50], 2217);
      arrayOfInt[50] = c(arrayOfInt[50], 5352);
      arrayOfInt[35] = -c(arrayOfInt[51], 1567);
      arrayOfInt[51] = c(arrayOfInt[51], 3784);
      arrayOfInt[37] = -c(arrayOfInt[53], 2217);
      arrayOfInt[53] = c(arrayOfInt[53], 5352);
      arrayOfInt[39] = -c(arrayOfInt[55], 1567);
      arrayOfInt[55] = c(arrayOfInt[55], 3784);
      i = c(-arrayOfInt[54] + arrayOfInt[52], 2896);
      paramInt1 = c(-arrayOfInt[54] - arrayOfInt[52], 2896);
      int j = arrayOfInt[54] << 1;
      int k = -arrayOfInt[52] << 1;
      arrayOfInt[36] = i + j;
      arrayOfInt[38] = paramInt1 - k;
      arrayOfInt[52] = paramInt1 + k;
      arrayOfInt[54] = -i + j;
    } else {
      i = arrayOfInt[33];
      arrayOfInt[33] = -c(i, 3784) - c(arrayOfInt[49], 1567);
      arrayOfInt[49] = -c(i, 1567) + c(arrayOfInt[49], 3784);
      i = arrayOfInt[34];
      arrayOfInt[34] = -c(i, 5352) - c(arrayOfInt[50], 2217);
      arrayOfInt[50] = -c(i, 2217) + c(arrayOfInt[50], 5352);
      i = arrayOfInt[35];
      arrayOfInt[35] = -c(i, 3784) - c(arrayOfInt[51], 1567);
      arrayOfInt[51] = -c(i, 1567) + c(arrayOfInt[51], 3784);
      i = arrayOfInt[37];
      arrayOfInt[37] = -c(i, 5352) - c(arrayOfInt[53], 2217);
      arrayOfInt[53] = -c(i, 2217) + c(arrayOfInt[53], 5352);
      i = arrayOfInt[39];
      arrayOfInt[39] = -c(i, 3784) - c(arrayOfInt[55], 1567);
      arrayOfInt[55] = -c(i, 1567) + c(arrayOfInt[55], 3784);
      i = arrayOfInt[36] - arrayOfInt[54];
      paramInt1 = arrayOfInt[38] + arrayOfInt[52];
      int j = c(i + paramInt1, 2896);
      i = c(i - paramInt1, 2896);
      paramInt1 = arrayOfInt[36] + arrayOfInt[54] << 1;
      int k = arrayOfInt[38] - arrayOfInt[52] << 1;
      arrayOfInt[36] = j + paramInt1;
      arrayOfInt[38] = i - k;
      arrayOfInt[52] = i + k;
      arrayOfInt[54] = -j + paramInt1;
    } 
    byte b;
    for (b = 0; b < 64; b += 8) {
      paramInt1 = arrayOfInt[b + 7];
      int n;
      int i1 = (n = arrayOfInt[b + 6] - arrayOfInt[b + 7]) - arrayOfInt[b + 5];
      int j = arrayOfInt[b] - arrayOfInt[b + 1];
      int k = j;
      i = arrayOfInt[b + 2] - arrayOfInt[b + 3];
      j += i;
      k -= i;
      int i2 = i = arrayOfInt[b] + arrayOfInt[b + 1];
      i += arrayOfInt[b + 3];
      i2 -= arrayOfInt[b + 3];
      int i3 = arrayOfInt[b + 4] - i1;
      arrayOfInt[b] = i + paramInt1;
      arrayOfInt[b + 1] = j + n;
      arrayOfInt[b + 2] = k - i1;
      arrayOfInt[b + 3] = i2 - i3;
      arrayOfInt[b + 4] = i2 + i3;
      arrayOfInt[b + 5] = k + i1;
      arrayOfInt[b + 6] = j - n;
      arrayOfInt[b + 7] = i - paramInt1;
    } 
    for (b = 0; b < 8; b++) {
      paramInt1 = arrayOfInt[b + 56];
      int n;
      int i1 = (n = arrayOfInt[b + 48] - arrayOfInt[b + 56]) - arrayOfInt[b + 40];
      int j = arrayOfInt[b] - arrayOfInt[b + 8];
      int k = j;
      i = arrayOfInt[b + 16] - arrayOfInt[b + 24];
      j += i;
      k -= i;
      int i2 = i = arrayOfInt[b] + arrayOfInt[b + 8];
      i += arrayOfInt[b + 24];
      i2 -= arrayOfInt[b + 24];
      int i3 = arrayOfInt[b + 32] - i1;
      arrayOfInt[b] = i + paramInt1;
      arrayOfInt[b + 8] = j + n;
      arrayOfInt[b + 16] = k - i1;
      arrayOfInt[b + 24] = i2 - i3;
      arrayOfInt[b + 32] = i2 + i3;
      arrayOfInt[b + 40] = k + i1;
      arrayOfInt[b + 48] = j - n;
      arrayOfInt[b + 56] = i - paramInt1;
    } 
    b = 0;
    while (b < 64) {
      paramArrayOfbyte[paramInt2] = (byte)a[(arrayOfInt[b++] + 1024 >> 11) + 128 + 256];
      paramArrayOfbyte[paramInt2 + 1] = (byte)a[(arrayOfInt[b++] + 1024 >> 11) + 128 + 256];
      paramArrayOfbyte[paramInt2 + 2] = (byte)a[(arrayOfInt[b++] + 1024 >> 11) + 128 + 256];
      paramArrayOfbyte[paramInt2 + 3] = (byte)a[(arrayOfInt[b++] + 1024 >> 11) + 128 + 256];
      paramArrayOfbyte[paramInt2 + 4] = (byte)a[(arrayOfInt[b++] + 1024 >> 11) + 128 + 256];
      paramArrayOfbyte[paramInt2 + 5] = (byte)a[(arrayOfInt[b++] + 1024 >> 11) + 128 + 256];
      paramArrayOfbyte[paramInt2 + 6] = (byte)a[(arrayOfInt[b++] + 1024 >> 11) + 128 + 256];
      paramArrayOfbyte[paramInt2 + 7] = (byte)a[(arrayOfInt[b++] + 1024 >> 11) + 128 + 256];
      paramInt2 += paramInt3;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\m.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */