import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class l extends TimerTask {
  private a b;
  
  public String a;
  
  public static int a;
  
  private af a;
  
  private int e;
  
  public r a;
  
  public long a;
  
  public Vector a;
  
  public a a;
  
  public int b;
  
  private int f;
  
  private int g;
  
  public boolean a;
  
  public v a;
  
  public long b;
  
  public static int c;
  
  public x a = (x)af.b;
  
  public int d;
  
  public boolean b = -1L;
  
  public l(int paramInt) {
    this.e = paramInt;
    if (paramInt == 20)
      this.a = (x)new Vector(4); 
    if (this.e == 28 && ((af)this.a).a != null && ((v)((af)this.a).a).c != null)
      this.b = ((v)((af)this.a).a).c; 
  }
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : I
    //   4: tableswitch default -> 4099, 0 -> 420, 1 -> 528, 2 -> 536, 3 -> 454, 4 -> 761, 5 -> 812, 6 -> 833, 7 -> 929, 8 -> 4099, 9 -> 1089, 10 -> 4099, 11 -> 1553, 12 -> 912, 13 -> 1596, 14 -> 4099, 15 -> 1639, 16 -> 844, 17 -> 1804, 18 -> 1825, 19 -> 1894, 20 -> 1980, 21 -> 4099, 22 -> 895, 23 -> 2015, 24 -> 2209, 25 -> 2213, 26 -> 4099, 27 -> 2482, 28 -> 2525, 29 -> 2587, 30 -> 2261, 31 -> 4099, 32 -> 2821, 33 -> 3131, 34 -> 2996, 35 -> 3198, 36 -> 2348, 37 -> 3269, 38 -> 4099, 39 -> 2518, 40 -> 3820, 41 -> 3841, 42 -> 3997, 43 -> 4099, 44 -> 4042, 45 -> 4099, 46 -> 4099, 47 -> 4099, 48 -> 4099, 49 -> 4099, 50 -> 4099, 51 -> 4099, 52 -> 4099, 53 -> 4099, 54 -> 4099, 55 -> 4099, 56 -> 4099, 57 -> 4099, 58 -> 4099, 59 -> 4099, 60 -> 4099, 61 -> 4099, 62 -> 4099, 63 -> 4099, 64 -> 4099, 65 -> 4099, 66 -> 4099, 67 -> 4099, 68 -> 4099, 69 -> 4099, 70 -> 4099, 71 -> 4099, 72 -> 4099, 73 -> 4099, 74 -> 4099, 75 -> 4099, 76 -> 4099, 77 -> 4099, 78 -> 4099, 79 -> 4099, 80 -> 4099, 81 -> 4099, 82 -> 4099, 83 -> 4099, 84 -> 4099, 85 -> 4099, 86 -> 4099, 87 -> 4099, 88 -> 4099, 89 -> 4099, 90 -> 4099, 91 -> 4099, 92 -> 4099, 93 -> 4099, 94 -> 4099, 95 -> 4099, 96 -> 4099, 97 -> 4099, 98 -> 4099, 99 -> 4006
    //   420: getstatic v.bH : Z
    //   423: ifne -> 446
    //   426: aload_0
    //   427: getfield a : Laf;
    //   430: getfield a : Lv;
    //   433: invokevirtual e : ()Z
    //   436: ifne -> 446
    //   439: aload_0
    //   440: getfield a : Laf;
    //   443: invokevirtual v : ()V
    //   446: aload_0
    //   447: getfield a : Laf;
    //   450: invokevirtual o : ()V
    //   453: return
    //   454: getstatic v.bs : Z
    //   457: ifeq -> 519
    //   460: aload_0
    //   461: getfield a : Laf;
    //   464: invokevirtual i : ()V
    //   467: getstatic v.df : Z
    //   470: ifeq -> 491
    //   473: aload_0
    //   474: getfield a : Laf;
    //   477: getfield B : Z
    //   480: ifne -> 491
    //   483: aload_0
    //   484: getfield a : Laf;
    //   487: invokevirtual l : ()V
    //   490: return
    //   491: aload_0
    //   492: getfield a : Laf;
    //   495: invokevirtual a : ()Z
    //   498: ifne -> 511
    //   501: aload_0
    //   502: getfield a : Laf;
    //   505: getfield B : Z
    //   508: ifeq -> 527
    //   511: aload_0
    //   512: getfield a : Laf;
    //   515: invokevirtual o : ()V
    //   518: return
    //   519: aload_0
    //   520: getfield a : Laf;
    //   523: iconst_0
    //   524: invokevirtual b : (Z)V
    //   527: return
    //   528: aload_0
    //   529: getfield a : Laf;
    //   532: invokevirtual f : ()V
    //   535: return
    //   536: invokestatic currentTimeMillis : ()J
    //   539: lstore_1
    //   540: aload_0
    //   541: getfield a : Laf;
    //   544: getfield f : Z
    //   547: ifeq -> 715
    //   550: aload_0
    //   551: getfield a : Laf;
    //   554: getfield a : Lfavax/microedition/lcdui/Display;
    //   557: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   560: instanceof favax/microedition/lcdui/Canvas
    //   563: ifne -> 575
    //   566: aload_0
    //   567: getfield a : Laf;
    //   570: iconst_0
    //   571: putfield f : Z
    //   574: return
    //   575: aload_0
    //   576: getfield a : Laf;
    //   579: getfield i : Z
    //   582: ifeq -> 618
    //   585: aload_0
    //   586: getfield a : Laf;
    //   589: getfield a : J
    //   592: lload_1
    //   593: aload_0
    //   594: getfield a : Laf;
    //   597: getfield g : Z
    //   600: ifeq -> 609
    //   603: ldc2_w 500
    //   606: goto -> 613
    //   609: getstatic v.w : I
    //   612: i2l
    //   613: lsub
    //   614: lcmp
    //   615: ifge -> 4099
    //   618: aload_0
    //   619: getfield a : Laf;
    //   622: iconst_0
    //   623: putfield i : Z
    //   626: aload_0
    //   627: getfield a : Laf;
    //   630: getfield m : Z
    //   633: ifne -> 706
    //   636: lload_1
    //   637: aload_0
    //   638: getfield a : Laf;
    //   641: getfield b : J
    //   644: lsub
    //   645: aload_0
    //   646: getfield a : Laf;
    //   649: getfield g : Z
    //   652: ifeq -> 661
    //   655: getstatic v.k : I
    //   658: goto -> 663
    //   661: bipush #50
    //   663: i2l
    //   664: lcmp
    //   665: ifle -> 706
    //   668: aload_0
    //   669: getfield a : Laf;
    //   672: aload_0
    //   673: getfield a : Laf;
    //   676: getfield g : Z
    //   679: putfield h : Z
    //   682: aload_0
    //   683: getfield a : Laf;
    //   686: aload_0
    //   687: getfield a : Laf;
    //   690: getfield b : I
    //   693: lload_1
    //   694: aload_0
    //   695: getfield a : Laf;
    //   698: getfield c : J
    //   701: lsub
    //   702: l2i
    //   703: invokevirtual a : (II)V
    //   706: aload_0
    //   707: getfield a : Laf;
    //   710: lload_1
    //   711: putfield a : J
    //   714: return
    //   715: aload_0
    //   716: getfield a : Laf;
    //   719: getfield a : J
    //   722: lload_1
    //   723: ldc2_w 20000
    //   726: lsub
    //   727: lcmp
    //   728: ifge -> 4099
    //   731: aload_0
    //   732: getfield a : Laf;
    //   735: aload_0
    //   736: getfield a : Laf;
    //   739: iconst_0
    //   740: dup_x1
    //   741: putfield g : Z
    //   744: putfield h : Z
    //   747: aload_0
    //   748: getfield a : Laf;
    //   751: aconst_null
    //   752: putfield a : Ljava/util/TimerTask;
    //   755: aload_0
    //   756: invokevirtual cancel : ()Z
    //   759: pop
    //   760: return
    //   761: aload_0
    //   762: getfield a : Laf;
    //   765: getfield a : Lfavax/microedition/lcdui/Display;
    //   768: aload_0
    //   769: getfield a : Laf;
    //   772: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   775: aload_0
    //   776: iconst_5
    //   777: putfield e : I
    //   780: new l
    //   783: dup
    //   784: iconst_5
    //   785: invokespecial <init> : (I)V
    //   788: dup
    //   789: astore_1
    //   790: aload_0
    //   791: getfield a : Lr;
    //   794: putfield a : Lr;
    //   797: aload_0
    //   798: getfield a : Laf;
    //   801: getfield a : Ljava/util/Timer;
    //   804: aload_1
    //   805: ldc2_w 50
    //   808: invokevirtual schedule : (Ljava/util/TimerTask;J)V
    //   811: return
    //   812: aload_0
    //   813: getfield a : Lr;
    //   816: getfield a : Lah;
    //   819: aload_0
    //   820: getfield a : Laf;
    //   823: getfield a : Lv;
    //   826: getfield c : La;
    //   829: invokestatic a : (Lah;La;)V
    //   832: return
    //   833: aload_0
    //   834: getfield a : Laf;
    //   837: getstatic v.u : Ljava/lang/String;
    //   840: invokevirtual b : (Ljava/lang/String;)V
    //   843: return
    //   844: aload_0
    //   845: getfield a : Laf;
    //   848: getfield a : Lv;
    //   851: invokevirtual e : ()Z
    //   854: ifne -> 4099
    //   857: aload_0
    //   858: getfield a : Laf;
    //   861: getfield d : Z
    //   864: ifne -> 877
    //   867: aload_0
    //   868: getfield a : Laf;
    //   871: getfield o : Z
    //   874: ifeq -> 4099
    //   877: aload_0
    //   878: getfield a : Laf;
    //   881: iconst_3
    //   882: aconst_null
    //   883: aconst_null
    //   884: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   887: aload_0
    //   888: getfield a : Laf;
    //   891: invokevirtual repaint : ()V
    //   894: return
    //   895: aload_0
    //   896: getfield a : Laf;
    //   899: iconst_0
    //   900: putfield t : Z
    //   903: aload_0
    //   904: getfield a : Laf;
    //   907: iconst_1
    //   908: invokevirtual a : (Z)V
    //   911: return
    //   912: aload_0
    //   913: getfield a : Laf;
    //   916: iconst_1
    //   917: putfield a : Z
    //   920: aload_0
    //   921: getfield a : Laf;
    //   924: iconst_1
    //   925: invokevirtual a : (Z)V
    //   928: return
    //   929: getstatic v.R : Z
    //   932: ifeq -> 949
    //   935: aload_0
    //   936: getfield a : Laf;
    //   939: sipush #683
    //   942: invokestatic d : (I)Ljava/lang/String;
    //   945: invokevirtual c : (Ljava/lang/String;)V
    //   948: return
    //   949: aload_0
    //   950: getfield a : Laf;
    //   953: getfield a : LBrowser;
    //   956: aload_0
    //   957: getfield a : Laf;
    //   960: getfield a : Lv;
    //   963: getfield c : La;
    //   966: getfield g : Ljava/lang/String;
    //   969: invokevirtual platformRequest : (Ljava/lang/String;)Z
    //   972: istore_1
    //   973: getstatic v.av : Z
    //   976: ifne -> 1027
    //   979: iload_1
    //   980: ifne -> 1027
    //   983: aload_0
    //   984: getfield a : Laf;
    //   987: getfield a : Lv;
    //   990: getfield c : La;
    //   993: getfield g : Ljava/lang/String;
    //   996: ldc '.jad'
    //   998: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1001: iconst_m1
    //   1002: if_icmpne -> 1027
    //   1005: aload_0
    //   1006: getfield a : Laf;
    //   1009: getfield a : Lv;
    //   1012: getfield c : La;
    //   1015: getfield g : Ljava/lang/String;
    //   1018: ldc '.jar'
    //   1020: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1023: iconst_m1
    //   1024: if_icmpeq -> 1061
    //   1027: aload_0
    //   1028: getfield a : Z
    //   1031: ifeq -> 1061
    //   1034: iconst_1
    //   1035: iconst_0
    //   1036: invokestatic b : (ZZ)V
    //   1039: aload_0
    //   1040: getfield a : Laf;
    //   1043: getfield a : LBrowser;
    //   1046: iconst_1
    //   1047: invokevirtual destroyApp : (Z)V
    //   1050: aload_0
    //   1051: getfield a : Laf;
    //   1054: getfield a : LBrowser;
    //   1057: invokevirtual notifyDestroyed : ()V
    //   1060: return
    //   1061: return
    //   1062: pop
    //   1063: aload_0
    //   1064: getfield a : Laf;
    //   1067: bipush #39
    //   1069: invokestatic d : (I)Ljava/lang/String;
    //   1072: invokevirtual c : (Ljava/lang/String;)V
    //   1075: return
    //   1076: astore_1
    //   1077: aload_0
    //   1078: getfield a : Laf;
    //   1081: aload_1
    //   1082: invokevirtual toString : ()Ljava/lang/String;
    //   1085: invokevirtual c : (Ljava/lang/String;)V
    //   1088: return
    //   1089: getstatic v.b : [Ljava/lang/String;
    //   1092: arraylength
    //   1093: dup
    //   1094: istore_1
    //   1095: newarray int
    //   1097: putstatic v.f : [I
    //   1100: iload_1
    //   1101: newarray boolean
    //   1103: putstatic v.a : [Z
    //   1106: getstatic v.R : I
    //   1109: iconst_1
    //   1110: if_icmpne -> 1150
    //   1113: iconst_0
    //   1114: istore_3
    //   1115: iload_3
    //   1116: iload_1
    //   1117: if_icmpge -> 1150
    //   1120: getstatic v.P : I
    //   1123: iconst_1
    //   1124: iload_3
    //   1125: ishl
    //   1126: iand
    //   1127: dup
    //   1128: ineg
    //   1129: ior
    //   1130: bipush #31
    //   1132: iushr
    //   1133: istore #4
    //   1135: getstatic v.f : [I
    //   1138: iload_3
    //   1139: iload #4
    //   1141: iconst_5
    //   1142: imul
    //   1143: iastore
    //   1144: iinc #3, 1
    //   1147: goto -> 1115
    //   1150: iconst_1
    //   1151: putstatic v.R : I
    //   1154: aload_0
    //   1155: getfield a : Laf;
    //   1158: ifnull -> 4099
    //   1161: aload_0
    //   1162: getfield a : Laf;
    //   1165: getfield a : Lv;
    //   1168: ifnull -> 4099
    //   1171: iconst_1
    //   1172: putstatic v.bH : Z
    //   1175: aload_0
    //   1176: getfield a : Laf;
    //   1179: iconst_1
    //   1180: putfield s : Z
    //   1183: aload_0
    //   1184: getfield a : Laf;
    //   1187: bipush #80
    //   1189: invokestatic c : (I)Ljava/lang/String;
    //   1192: invokevirtual b : (Ljava/lang/String;)V
    //   1195: aload_0
    //   1196: getfield a : Laf;
    //   1199: invokevirtual u : ()V
    //   1202: iconst_0
    //   1203: istore_2
    //   1204: iload_2
    //   1205: iload_1
    //   1206: if_icmpge -> 1469
    //   1209: iload_2
    //   1210: putstatic v.aB : I
    //   1213: getstatic v.b : [Ljava/lang/String;
    //   1216: iload_2
    //   1217: aaload
    //   1218: astore_3
    //   1219: iload_2
    //   1220: ifle -> 1241
    //   1223: aload_3
    //   1224: getstatic v.b : [Ljava/lang/String;
    //   1227: iload_2
    //   1228: iconst_1
    //   1229: isub
    //   1230: aaload
    //   1231: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1234: ifeq -> 1241
    //   1237: iconst_1
    //   1238: goto -> 1242
    //   1241: iconst_0
    //   1242: putstatic v.ak : Z
    //   1245: getstatic v.f : [I
    //   1248: iload_2
    //   1249: iaload
    //   1250: iconst_5
    //   1251: if_icmpeq -> 1459
    //   1254: aload_3
    //   1255: ldc 'socket://'
    //   1257: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1260: ifeq -> 1269
    //   1263: getstatic v.aS : Z
    //   1266: ifne -> 1459
    //   1269: getstatic v.f : [I
    //   1272: iload_2
    //   1273: iconst_4
    //   1274: iastore
    //   1275: getstatic v.a : [Z
    //   1278: iload_2
    //   1279: iconst_1
    //   1280: bastore
    //   1281: getstatic v.P : I
    //   1284: iconst_1
    //   1285: iload_2
    //   1286: ishl
    //   1287: ior
    //   1288: i2s
    //   1289: putstatic v.P : I
    //   1292: aconst_null
    //   1293: iconst_0
    //   1294: invokestatic a : (Ljava/io/DataOutputStream;Z)V
    //   1297: aload_0
    //   1298: getfield a : Laf;
    //   1301: iconst_1
    //   1302: putfield s : Z
    //   1305: aload_0
    //   1306: getfield a : Laf;
    //   1309: getfield a : Lv;
    //   1312: invokevirtual k : ()V
    //   1315: invokestatic a : ()V
    //   1318: new l
    //   1321: dup
    //   1322: bipush #19
    //   1324: invokespecial <init> : (I)V
    //   1327: dup
    //   1328: astore #4
    //   1330: iload_2
    //   1331: putfield f : I
    //   1334: aload #4
    //   1336: invokestatic a : (Ljava/lang/Runnable;)Ljava/lang/Thread;
    //   1339: pop
    //   1340: getstatic v.a : Ljava/lang/Object;
    //   1343: ldc 40000
    //   1345: invokestatic a : (Ljava/lang/Object;I)V
    //   1348: aload #4
    //   1350: iconst_1
    //   1351: putfield a : Z
    //   1354: aload #4
    //   1356: getfield g : I
    //   1359: istore_3
    //   1360: getstatic v.P : I
    //   1363: iconst_1
    //   1364: iload_2
    //   1365: ishl
    //   1366: iconst_m1
    //   1367: ixor
    //   1368: iand
    //   1369: i2s
    //   1370: putstatic v.P : I
    //   1373: getstatic v.b : [Ljava/lang/String;
    //   1376: aload #4
    //   1378: getfield f : I
    //   1381: aaload
    //   1382: ldc 'socket://'
    //   1384: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1387: ifeq -> 1394
    //   1390: iconst_1
    //   1391: putstatic v.ai : Z
    //   1394: iload_3
    //   1395: tableswitch default -> 1449, 0 -> 1443, 1 -> 1424, 2 -> 1443, 3 -> 1433
    //   1424: getstatic v.f : [I
    //   1427: iload_2
    //   1428: iconst_1
    //   1429: iastore
    //   1430: goto -> 1469
    //   1433: getstatic v.f : [I
    //   1436: iload_2
    //   1437: bipush #6
    //   1439: iastore
    //   1440: goto -> 1449
    //   1443: getstatic v.f : [I
    //   1446: iload_2
    //   1447: iconst_2
    //   1448: iastore
    //   1449: getstatic v.R : I
    //   1452: iconst_3
    //   1453: if_icmpne -> 1459
    //   1456: goto -> 1469
    //   1459: goto -> 1463
    //   1462: pop
    //   1463: iinc #2, 1
    //   1466: goto -> 1204
    //   1469: aload_0
    //   1470: getfield a : Laf;
    //   1473: invokevirtual v : ()V
    //   1476: lconst_0
    //   1477: putstatic v.n : J
    //   1480: iconst_m1
    //   1481: putstatic v.Y : I
    //   1484: iconst_0
    //   1485: putstatic v.aB : I
    //   1488: invokestatic a : ()V
    //   1491: iconst_0
    //   1492: putstatic v.bH : Z
    //   1495: aload_0
    //   1496: getfield a : Laf;
    //   1499: iconst_1
    //   1500: putfield s : Z
    //   1503: getstatic v.R : I
    //   1506: iconst_3
    //   1507: if_icmpeq -> 1535
    //   1510: iconst_2
    //   1511: putstatic v.R : I
    //   1514: aload_0
    //   1515: getfield a : Laf;
    //   1518: iconst_1
    //   1519: putfield s : Z
    //   1522: aload_0
    //   1523: getfield a : Laf;
    //   1526: getfield a : Lv;
    //   1529: invokevirtual k : ()V
    //   1532: goto -> 1547
    //   1535: aload_0
    //   1536: getfield a : Laf;
    //   1539: bipush #72
    //   1541: invokestatic c : (I)Ljava/lang/String;
    //   1544: invokevirtual b : (Ljava/lang/String;)V
    //   1547: aconst_null
    //   1548: iconst_0
    //   1549: invokestatic a : (Ljava/io/DataOutputStream;Z)V
    //   1552: return
    //   1553: aload_0
    //   1554: invokevirtual cancel : ()Z
    //   1557: pop
    //   1558: aload_0
    //   1559: getfield a : Lv;
    //   1562: ifnull -> 1590
    //   1565: aload_0
    //   1566: getfield a : Lv;
    //   1569: getfield a : La;
    //   1572: aload_0
    //   1573: getfield a : La;
    //   1576: if_acmpne -> 1590
    //   1579: aload_0
    //   1580: getfield a : Laf;
    //   1583: getfield a : Lv;
    //   1586: iconst_1
    //   1587: invokevirtual c : (Z)V
    //   1590: aload_0
    //   1591: aconst_null
    //   1592: putfield a : La;
    //   1595: return
    //   1596: aload_0
    //   1597: getfield a : Laf;
    //   1600: iconst_0
    //   1601: putfield e : Z
    //   1604: aload_0
    //   1605: getfield a : Laf;
    //   1608: iconst_0
    //   1609: putfield L : Z
    //   1612: aload_0
    //   1613: getfield a : Laf;
    //   1616: iconst_0
    //   1617: putfield M : Z
    //   1620: aload_0
    //   1621: getfield a : Laf;
    //   1624: getfield a : Lv;
    //   1627: iconst_1
    //   1628: putfield cd : Z
    //   1631: aload_0
    //   1632: getfield a : Laf;
    //   1635: invokevirtual repaint : ()V
    //   1638: return
    //   1639: aload_0
    //   1640: getfield a : Laf;
    //   1643: getfield a : Ln;
    //   1646: astore_1
    //   1647: getstatic af.a : Laf;
    //   1650: getfield a : Lfavax/microedition/lcdui/Display;
    //   1653: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   1656: checkcast favax/microedition/lcdui/Canvas
    //   1659: invokevirtual repaint : ()V
    //   1662: aload_1
    //   1663: aload_1
    //   1664: getfield a : Ljavax/microedition/media/control/VideoControl;
    //   1667: getstatic af.a : [Ljava/lang/String;
    //   1670: getstatic v.aG : I
    //   1673: aaload
    //   1674: invokeinterface getSnapshot : (Ljava/lang/String;)[B
    //   1679: putfield a : [B
    //   1682: goto -> 1700
    //   1685: pop
    //   1686: aload_1
    //   1687: aload_1
    //   1688: getfield a : Ljavax/microedition/media/control/VideoControl;
    //   1691: aconst_null
    //   1692: invokeinterface getSnapshot : (Ljava/lang/String;)[B
    //   1697: putfield a : [B
    //   1700: aload_0
    //   1701: getfield a : Laf;
    //   1704: getfield a : Ln;
    //   1707: invokevirtual b : ()V
    //   1710: invokestatic c : ()V
    //   1713: goto -> 1793
    //   1716: astore_3
    //   1717: aload_0
    //   1718: getfield a : Laf;
    //   1721: getfield a : Ln;
    //   1724: invokevirtual b : ()V
    //   1727: aload_0
    //   1728: getfield a : Laf;
    //   1731: aconst_null
    //   1732: putfield a : Ln;
    //   1735: aload_0
    //   1736: getfield a : Laf;
    //   1739: getfield a : Lv;
    //   1742: iconst_0
    //   1743: invokevirtual d : (Z)V
    //   1746: aload_3
    //   1747: invokevirtual getMessage : ()Ljava/lang/String;
    //   1750: astore #4
    //   1752: getstatic v.G : I
    //   1755: iconst_3
    //   1756: if_icmpne -> 1774
    //   1759: aload #4
    //   1761: ldc '. '
    //   1763: sipush #148
    //   1766: invokestatic d : (I)Ljava/lang/String;
    //   1769: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1772: astore #4
    //   1774: aload_0
    //   1775: getfield a : Laf;
    //   1778: aload #4
    //   1780: invokevirtual c : (Ljava/lang/String;)V
    //   1783: invokestatic c : ()V
    //   1786: return
    //   1787: astore_1
    //   1788: invokestatic c : ()V
    //   1791: aload_1
    //   1792: athrow
    //   1793: aload_0
    //   1794: getfield a : Laf;
    //   1797: getfield a : Lv;
    //   1800: invokevirtual k : ()V
    //   1803: return
    //   1804: aload_0
    //   1805: getfield a : Laf;
    //   1808: getfield a : Lfavax/microedition/lcdui/Display;
    //   1811: aload_0
    //   1812: getfield a : Laf;
    //   1815: getfield a : Lfavax/microedition/lcdui/Display;
    //   1818: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   1821: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   1824: return
    //   1825: getstatic v.b : Ljava/lang/Object;
    //   1828: dup
    //   1829: astore_3
    //   1830: monitorenter
    //   1831: getstatic v.a : Ll;
    //   1834: aload_0
    //   1835: if_acmpeq -> 1843
    //   1838: aload_0
    //   1839: invokevirtual cancel : ()Z
    //   1842: pop
    //   1843: aload_0
    //   1844: getfield b : J
    //   1847: invokestatic currentTimeMillis : ()J
    //   1850: lcmp
    //   1851: ifge -> 1879
    //   1854: aload_0
    //   1855: getfield b : J
    //   1858: ldc2_w -1
    //   1861: lcmp
    //   1862: ifeq -> 1879
    //   1865: getstatic v.bH : Z
    //   1868: ifne -> 1879
    //   1871: invokestatic a : ()V
    //   1874: aload_0
    //   1875: invokevirtual cancel : ()Z
    //   1878: pop
    //   1879: aload_3
    //   1880: monitorexit
    //   1881: return
    //   1882: astore_2
    //   1883: aload_3
    //   1884: monitorexit
    //   1885: aload_2
    //   1886: athrow
    //   1887: pop
    //   1888: aload_0
    //   1889: invokevirtual cancel : ()Z
    //   1892: pop
    //   1893: return
    //   1894: new a
    //   1897: dup
    //   1898: aload_0
    //   1899: getfield a : Laf;
    //   1902: getfield a : Lv;
    //   1905: aconst_null
    //   1906: aconst_null
    //   1907: aconst_null
    //   1908: aconst_null
    //   1909: iconst_0
    //   1910: iconst_0
    //   1911: invokespecial <init> : (Lv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZI)V
    //   1914: astore_3
    //   1915: aload_0
    //   1916: getfield a : Laf;
    //   1919: getfield a : Lv;
    //   1922: aload_3
    //   1923: putfield a : La;
    //   1926: aload_0
    //   1927: aload_0
    //   1928: aload_3
    //   1929: aload_0
    //   1930: getfield f : I
    //   1933: invokespecial a : (La;I)I
    //   1936: putfield g : I
    //   1939: getstatic v.a : [Z
    //   1942: aload_0
    //   1943: getfield f : I
    //   1946: iconst_0
    //   1947: bastore
    //   1948: getstatic v.a : Ljava/lang/Object;
    //   1951: dup
    //   1952: astore #4
    //   1954: monitorenter
    //   1955: aload_0
    //   1956: getfield a : Z
    //   1959: ifne -> 1968
    //   1962: getstatic v.a : Ljava/lang/Object;
    //   1965: invokevirtual notify : ()V
    //   1968: aload #4
    //   1970: monitorexit
    //   1971: return
    //   1972: astore_1
    //   1973: aload #4
    //   1975: monitorexit
    //   1976: aload_1
    //   1977: athrow
    //   1978: pop
    //   1979: return
    //   1980: iconst_0
    //   1981: istore #4
    //   1983: iload #4
    //   1985: aload_0
    //   1986: getfield a : Ljava/util/Vector;
    //   1989: invokevirtual size : ()I
    //   1992: if_icmpge -> 2014
    //   1995: aload_0
    //   1996: getfield a : Ljava/util/Vector;
    //   1999: iload #4
    //   2001: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   2004: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2007: pop
    //   2008: iinc #4, 1
    //   2011: goto -> 1983
    //   2014: return
    //   2015: new m
    //   2018: dup
    //   2019: invokespecial <init> : ()V
    //   2022: astore_3
    //   2023: aload_0
    //   2024: getfield a : Laf;
    //   2027: invokevirtual u : ()V
    //   2030: iconst_0
    //   2031: istore_1
    //   2032: aload_3
    //   2033: aload_0
    //   2034: getfield a : Laf;
    //   2037: getfield a : Ln;
    //   2040: getfield a : [B
    //   2043: iconst_0
    //   2044: aload_0
    //   2045: getfield a : Laf;
    //   2048: getfield a : Ln;
    //   2051: getfield a : [B
    //   2054: arraylength
    //   2055: iconst_0
    //   2056: iconst_1
    //   2057: invokevirtual a : ([BIIIZ)I
    //   2060: istore_2
    //   2061: aload_0
    //   2062: getfield a : Laf;
    //   2065: getfield a : Ln;
    //   2068: iload_2
    //   2069: bipush #16
    //   2071: ishr
    //   2072: putfield a : I
    //   2075: aload_0
    //   2076: getfield a : Laf;
    //   2079: getfield a : Ln;
    //   2082: iload_2
    //   2083: ldc 65535
    //   2085: iand
    //   2086: putfield b : I
    //   2089: aload_0
    //   2090: getfield a : Laf;
    //   2093: getfield a : Ln;
    //   2096: getfield a : I
    //   2099: aload_0
    //   2100: getfield a : Laf;
    //   2103: invokevirtual getWidth : ()I
    //   2106: if_icmple -> 2137
    //   2109: aload_0
    //   2110: getfield a : Laf;
    //   2113: getfield a : Ln;
    //   2116: getfield a : I
    //   2119: iload_1
    //   2120: ishr
    //   2121: aload_0
    //   2122: getfield a : Laf;
    //   2125: invokevirtual getWidth : ()I
    //   2128: if_icmple -> 2137
    //   2131: iinc #1, 1
    //   2134: goto -> 2109
    //   2137: aload_3
    //   2138: aload_0
    //   2139: getfield a : Laf;
    //   2142: getfield a : Ln;
    //   2145: getfield a : [B
    //   2148: iconst_0
    //   2149: aload_0
    //   2150: getfield a : Laf;
    //   2153: getfield a : Ln;
    //   2156: getfield a : [B
    //   2159: arraylength
    //   2160: iload_1
    //   2161: iconst_0
    //   2162: invokevirtual a : ([BIIIZ)I
    //   2165: pop
    //   2166: aload_3
    //   2167: getfield c : [I
    //   2170: aload_3
    //   2171: getfield b : I
    //   2174: aload_3
    //   2175: getfield a : I
    //   2178: iconst_0
    //   2179: invokestatic a : ([IIIZ)Ljavax/microedition/lcdui/Image;
    //   2182: astore #4
    //   2184: getstatic v.b : [Ljavax/microedition/lcdui/Image;
    //   2187: iconst_2
    //   2188: aload #4
    //   2190: aastore
    //   2191: aload_0
    //   2192: getfield a : Laf;
    //   2195: invokevirtual v : ()V
    //   2198: aload_0
    //   2199: getfield a : Laf;
    //   2202: getfield a : Lv;
    //   2205: invokevirtual k : ()V
    //   2208: return
    //   2209: invokestatic e : ()V
    //   2212: return
    //   2213: iconst_1
    //   2214: putstatic v.ak : Z
    //   2217: new a
    //   2220: dup
    //   2221: aload_0
    //   2222: getfield a : Laf;
    //   2225: getfield a : Lv;
    //   2228: aconst_null
    //   2229: aconst_null
    //   2230: aconst_null
    //   2231: aconst_null
    //   2232: iconst_0
    //   2233: iconst_0
    //   2234: invokespecial <init> : (Lv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZI)V
    //   2237: ldc '0/server:test'
    //   2239: iconst_m1
    //   2240: iconst_0
    //   2241: iconst_0
    //   2242: getstatic v.b : [Ljava/lang/String;
    //   2245: iconst_2
    //   2246: aaload
    //   2247: invokevirtual a : (Ljava/lang/String;IIZLjava/lang/String;)Lv;
    //   2250: pop
    //   2251: getstatic v.c : Ljava/lang/Object;
    //   2254: invokestatic b : (Ljava/lang/Object;)V
    //   2257: goto -> 2261
    //   2260: pop
    //   2261: aload_0
    //   2262: getfield a : Lr;
    //   2265: ifnull -> 2285
    //   2268: aload_0
    //   2269: getfield a : Laf;
    //   2272: getfield a : Lfavax/microedition/lcdui/Display;
    //   2275: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   2278: aload_0
    //   2279: getfield a : Lr;
    //   2282: if_acmpeq -> 2301
    //   2285: aload_0
    //   2286: getfield a : Laf;
    //   2289: getfield a : Lfavax/microedition/lcdui/Display;
    //   2292: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   2295: instanceof javax/microedition/lcdui/Alert
    //   2298: ifeq -> 2340
    //   2301: aload_0
    //   2302: getfield a : Lr;
    //   2305: aload_0
    //   2306: getfield a : Lr;
    //   2309: invokevirtual size : ()I
    //   2312: invokestatic valueOf : (I)Ljava/lang/String;
    //   2315: ldc '/'
    //   2317: aload_0
    //   2318: getfield a : Lr;
    //   2321: invokevirtual getMaxSize : ()I
    //   2324: invokestatic valueOf : (I)Ljava/lang/String;
    //   2327: ldc ' '
    //   2329: aload_0
    //   2330: getfield a : Ljava/lang/String;
    //   2333: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2336: invokevirtual setTitle : (Ljava/lang/String;)V
    //   2339: return
    //   2340: aload_0
    //   2341: invokevirtual cancel : ()Z
    //   2344: pop
    //   2345: return
    //   2346: pop
    //   2347: return
    //   2348: aload_0
    //   2349: getfield a : Laf;
    //   2352: getfield a : Ll;
    //   2355: ifnonnull -> 2476
    //   2358: aload_0
    //   2359: getfield a : Laf;
    //   2362: getfield a : Lv;
    //   2365: getfield c : La;
    //   2368: aload_0
    //   2369: getfield a : Laf;
    //   2372: getfield a : Lv;
    //   2375: getfield as : I
    //   2378: invokevirtual c : (I)I
    //   2381: bipush #76
    //   2383: if_icmpne -> 2476
    //   2386: aload_0
    //   2387: getfield a : Laf;
    //   2390: new l
    //   2393: dup
    //   2394: bipush #13
    //   2396: invokespecial <init> : (I)V
    //   2399: putfield a : Ll;
    //   2402: aload_0
    //   2403: getfield a : Laf;
    //   2406: getfield a : Ll;
    //   2409: aload_0
    //   2410: getfield a : Laf;
    //   2413: getfield a : Lv;
    //   2416: getfield as : I
    //   2419: putfield b : I
    //   2422: aload_0
    //   2423: getfield a : Laf;
    //   2426: iconst_1
    //   2427: putfield L : Z
    //   2430: aload_0
    //   2431: getfield a : Laf;
    //   2434: getfield a : Ljava/util/Timer;
    //   2437: aload_0
    //   2438: getfield a : Laf;
    //   2441: getfield a : Ll;
    //   2444: ldc2_w 2500
    //   2447: invokevirtual schedule : (Ljava/util/TimerTask;J)V
    //   2450: aload_0
    //   2451: getfield a : Laf;
    //   2454: aconst_null
    //   2455: putfield e : Ll;
    //   2458: aload_0
    //   2459: getfield a : Laf;
    //   2462: getfield a : Lv;
    //   2465: iconst_1
    //   2466: putfield cd : Z
    //   2469: aload_0
    //   2470: getfield a : Laf;
    //   2473: invokevirtual repaint : ()V
    //   2476: aload_0
    //   2477: invokevirtual cancel : ()Z
    //   2480: pop
    //   2481: return
    //   2482: getstatic v.cF : Z
    //   2485: ifne -> 2504
    //   2488: aload_0
    //   2489: getfield a : Laf;
    //   2492: getfield a : Lfavax/microedition/lcdui/Display;
    //   2495: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   2498: instanceof favax/microedition/lcdui/Canvas
    //   2501: ifne -> 2513
    //   2504: iconst_0
    //   2505: putstatic v.cF : Z
    //   2508: iconst_1
    //   2509: invokestatic g : (Z)V
    //   2512: return
    //   2513: iconst_0
    //   2514: invokestatic g : (Z)V
    //   2517: return
    //   2518: getstatic v.cG : Z
    //   2521: invokestatic f : (Z)V
    //   2524: return
    //   2525: aload_0
    //   2526: getfield b : La;
    //   2529: ifnull -> 2576
    //   2532: aload_0
    //   2533: getfield b : La;
    //   2536: getfield a : Lv;
    //   2539: ifnull -> 2576
    //   2542: aload_0
    //   2543: getfield b : La;
    //   2546: getfield a : Lv;
    //   2549: getfield cX : Z
    //   2552: ifeq -> 2576
    //   2555: aload_0
    //   2556: getfield b : La;
    //   2559: invokevirtual b : ()Z
    //   2562: ifne -> 2576
    //   2565: aload_0
    //   2566: getfield b : La;
    //   2569: getfield a : Lv;
    //   2572: invokevirtual k : ()V
    //   2575: return
    //   2576: aload_0
    //   2577: aconst_null
    //   2578: putfield b : La;
    //   2581: aload_0
    //   2582: invokevirtual cancel : ()Z
    //   2585: pop
    //   2586: return
    //   2587: aload_0
    //   2588: getfield b : J
    //   2591: ldc2_w -1
    //   2594: lcmp
    //   2595: ifne -> 2604
    //   2598: aload_0
    //   2599: invokevirtual cancel : ()Z
    //   2602: pop
    //   2603: return
    //   2604: aload_0
    //   2605: getfield a : Laf;
    //   2608: getfield a : Lv;
    //   2611: getfield aM : I
    //   2614: iconst_2
    //   2615: if_icmpne -> 4099
    //   2618: iconst_0
    //   2619: istore_1
    //   2620: aconst_null
    //   2621: astore_2
    //   2622: aload_0
    //   2623: getfield b : Z
    //   2626: ifeq -> 2667
    //   2629: getstatic w.a : Laa;
    //   2632: ifnull -> 2667
    //   2635: getstatic w.a : Laa;
    //   2638: getfield a : Z
    //   2641: ifne -> 2667
    //   2644: aload_0
    //   2645: getfield b : J
    //   2648: ldc2_w -1
    //   2651: lcmp
    //   2652: ifeq -> 2667
    //   2655: getstatic w.a : Laa;
    //   2658: getfield a : Lv;
    //   2661: astore_2
    //   2662: iconst_1
    //   2663: istore_1
    //   2664: goto -> 2764
    //   2667: getstatic v.a : Lad;
    //   2670: ifnull -> 2764
    //   2673: getstatic v.a : Lad;
    //   2676: getfield a : Laa;
    //   2679: ifnull -> 2764
    //   2682: getstatic v.a : Lad;
    //   2685: getfield a : Laa;
    //   2688: getfield a : Z
    //   2691: ifeq -> 2764
    //   2694: aload_0
    //   2695: getfield b : J
    //   2698: ldc2_w -1
    //   2701: lcmp
    //   2702: ifeq -> 2764
    //   2705: getstatic v.a : Lad;
    //   2708: getfield c : I
    //   2711: iconst_1
    //   2712: if_icmpne -> 2752
    //   2715: getstatic v.a : Lad;
    //   2718: getfield a : Laa;
    //   2721: ldc2_w 100
    //   2724: putfield c : J
    //   2727: getstatic v.a : Lad;
    //   2730: getfield a : Laa;
    //   2733: invokestatic currentTimeMillis : ()J
    //   2736: aload_0
    //   2737: getfield b : J
    //   2740: lsub
    //   2741: getstatic v.e : I
    //   2744: bipush #100
    //   2746: idiv
    //   2747: i2l
    //   2748: ldiv
    //   2749: putfield b : J
    //   2752: getstatic v.a : Lad;
    //   2755: getfield a : Laa;
    //   2758: getfield a : Lv;
    //   2761: astore_2
    //   2762: iconst_1
    //   2763: istore_1
    //   2764: iload_1
    //   2765: ifeq -> 4099
    //   2768: aload_2
    //   2769: ifnull -> 4099
    //   2772: aload_2
    //   2773: aload_0
    //   2774: getfield a : Laf;
    //   2777: getfield a : Lv;
    //   2780: if_acmpne -> 4099
    //   2783: aload_0
    //   2784: getfield a : Laf;
    //   2787: invokevirtual repaint : ()V
    //   2790: ldc2_w 30
    //   2793: invokestatic sleep : (J)V
    //   2796: goto -> 2800
    //   2799: pop
    //   2800: getstatic v.aQ : Z
    //   2803: ifeq -> 4099
    //   2806: aload_0
    //   2807: getfield a : Laf;
    //   2810: getfield a : Lfavax/microedition/lcdui/Display;
    //   2813: aload_0
    //   2814: getfield a : Laf;
    //   2817: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   2820: return
    //   2821: iconst_0
    //   2822: istore_3
    //   2823: aload_0
    //   2824: getfield b : Z
    //   2827: ifeq -> 2951
    //   2830: getstatic w.a : Ljava/util/Vector;
    //   2833: invokevirtual isEmpty : ()Z
    //   2836: ifne -> 2951
    //   2839: iconst_0
    //   2840: istore #4
    //   2842: iload #4
    //   2844: getstatic w.a : Ljava/util/Vector;
    //   2847: invokevirtual size : ()I
    //   2850: if_icmpge -> 2951
    //   2853: getstatic w.a : Ljava/util/Vector;
    //   2856: iload #4
    //   2858: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   2861: checkcast i
    //   2864: dup
    //   2865: astore_0
    //   2866: ifnull -> 2945
    //   2869: aload_0
    //   2870: getfield i : J
    //   2873: ldc2_w -1
    //   2876: lcmp
    //   2877: ifeq -> 2945
    //   2880: aload_0
    //   2881: getfield i : J
    //   2884: lconst_0
    //   2885: lcmp
    //   2886: ifle -> 2901
    //   2889: aload_0
    //   2890: dup
    //   2891: getfield i : J
    //   2894: ldc2_w 1000
    //   2897: ladd
    //   2898: putfield i : J
    //   2901: aload_0
    //   2902: getfield i : J
    //   2905: aload_0
    //   2906: getfield j : J
    //   2909: getstatic v.e : I
    //   2912: i2l
    //   2913: ladd
    //   2914: lcmp
    //   2915: ifle -> 2943
    //   2918: aload_0
    //   2919: invokevirtual a : ()Z
    //   2922: ifeq -> 2945
    //   2925: aload_0
    //   2926: sipush #410
    //   2929: invokestatic d : (I)Ljava/lang/String;
    //   2932: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   2935: pop
    //   2936: aload_0
    //   2937: invokevirtual g : ()V
    //   2940: goto -> 2945
    //   2943: iconst_1
    //   2944: istore_3
    //   2945: iinc #4, 1
    //   2948: goto -> 2842
    //   2951: iload_3
    //   2952: ifne -> 2995
    //   2955: getstatic i.a : Ll;
    //   2958: invokestatic a : (Ljava/util/TimerTask;)V
    //   2961: aconst_null
    //   2962: putstatic i.a : Ll;
    //   2965: getstatic i.a : Ljava/util/Timer;
    //   2968: ifnull -> 2977
    //   2971: getstatic i.a : Ljava/util/Timer;
    //   2974: invokevirtual cancel : ()V
    //   2977: aconst_null
    //   2978: putstatic i.a : Ljava/util/Timer;
    //   2981: return
    //   2982: pop
    //   2983: aconst_null
    //   2984: putstatic i.a : Ljava/util/Timer;
    //   2987: return
    //   2988: astore_0
    //   2989: aconst_null
    //   2990: putstatic i.a : Ljava/util/Timer;
    //   2993: aload_0
    //   2994: athrow
    //   2995: return
    //   2996: getstatic v.a : Lad;
    //   2999: ifnonnull -> 3008
    //   3002: aload_0
    //   3003: invokevirtual cancel : ()Z
    //   3006: pop
    //   3007: return
    //   3008: getstatic v.a : Lad;
    //   3011: getfield a : J
    //   3014: ldc2_w -1
    //   3017: lcmp
    //   3018: ifeq -> 4099
    //   3021: getstatic v.a : Lad;
    //   3024: dup
    //   3025: getfield a : J
    //   3028: ldc2_w 1000
    //   3031: ladd
    //   3032: putfield a : J
    //   3035: getstatic v.a : Lad;
    //   3038: getfield a : J
    //   3041: aload_0
    //   3042: getfield a : J
    //   3045: getstatic v.e : I
    //   3048: i2l
    //   3049: ladd
    //   3050: lcmp
    //   3051: iflt -> 4099
    //   3054: getstatic v.a : Lad;
    //   3057: ldc2_w -1
    //   3060: putfield a : J
    //   3063: getstatic v.a : Lad;
    //   3066: ifnull -> 3108
    //   3069: getstatic v.a : Lad;
    //   3072: iconst_1
    //   3073: putfield d : Z
    //   3076: getstatic v.a : Lad;
    //   3079: getfield a : Laa;
    //   3082: invokevirtual b : ()V
    //   3085: getstatic v.a : Lad;
    //   3088: invokevirtual k : ()V
    //   3091: getstatic v.a : Lad;
    //   3094: getfield b : I
    //   3097: bipush #21
    //   3099: if_icmpne -> 3108
    //   3102: getstatic v.a : Lad;
    //   3105: invokevirtual j : ()V
    //   3108: goto -> 3112
    //   3111: pop
    //   3112: aload_0
    //   3113: getfield a : Laf;
    //   3116: sipush #286
    //   3119: invokestatic d : (I)Ljava/lang/String;
    //   3122: invokevirtual c : (Ljava/lang/String;)V
    //   3125: aload_0
    //   3126: invokevirtual cancel : ()Z
    //   3129: pop
    //   3130: return
    //   3131: getstatic v.a : Lad;
    //   3134: ifnull -> 3185
    //   3137: getstatic v.a : Lad;
    //   3140: invokevirtual a : ()Z
    //   3143: ifeq -> 3185
    //   3146: getstatic v.a : Lad;
    //   3149: getfield e : I
    //   3152: iconst_m1
    //   3153: if_icmpeq -> 3185
    //   3156: getstatic v.a : Lad;
    //   3159: dup
    //   3160: getfield e : I
    //   3163: iconst_1
    //   3164: iadd
    //   3165: dup_x1
    //   3166: putfield e : I
    //   3169: getstatic v.a : Lad;
    //   3172: getfield d : I
    //   3175: if_icmplt -> 3197
    //   3178: getstatic v.a : Lad;
    //   3181: invokevirtual i : ()V
    //   3184: return
    //   3185: getstatic v.a : Lad;
    //   3188: iconst_m1
    //   3189: putfield e : I
    //   3192: aload_0
    //   3193: invokevirtual cancel : ()Z
    //   3196: pop
    //   3197: return
    //   3198: aload_0
    //   3199: getfield a : Laf;
    //   3202: getfield a : Lv;
    //   3205: getfield c : La;
    //   3208: getfield a : Lf;
    //   3211: ifnull -> 3236
    //   3214: aload_0
    //   3215: getfield a : Laf;
    //   3218: getfield a : Lv;
    //   3221: getfield c : La;
    //   3224: getfield a : Lf;
    //   3227: getstatic af.a : [Lf;
    //   3230: bipush #7
    //   3232: aaload
    //   3233: if_acmpeq -> 4099
    //   3236: aload_0
    //   3237: getfield a : Laf;
    //   3240: getfield a : Lfavax/microedition/lcdui/Display;
    //   3243: ifnull -> 3263
    //   3246: aload_0
    //   3247: getfield a : Laf;
    //   3250: getfield a : Lfavax/microedition/lcdui/Display;
    //   3253: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   3256: aload_0
    //   3257: getfield a : Laf;
    //   3260: if_acmpne -> 4099
    //   3263: iconst_0
    //   3264: iconst_0
    //   3265: invokestatic b : (ZZ)V
    //   3268: return
    //   3269: invokestatic o : ()V
    //   3272: aload_0
    //   3273: getfield a : Lx;
    //   3276: ifnull -> 3295
    //   3279: aload_0
    //   3280: getfield a : Lx;
    //   3283: iconst_0
    //   3284: putfield a : B
    //   3287: aload_0
    //   3288: aconst_null
    //   3289: putfield a : Lx;
    //   3292: goto -> 3814
    //   3295: aload_0
    //   3296: getfield a : Laf;
    //   3299: ifnull -> 3325
    //   3302: aload_0
    //   3303: getfield a : Laf;
    //   3306: getfield a : Lv;
    //   3309: ifnull -> 3325
    //   3312: aload_0
    //   3313: getfield a : Laf;
    //   3316: getfield a : Lv;
    //   3319: getfield c : La;
    //   3322: ifnonnull -> 3333
    //   3325: aload_0
    //   3326: getfield a : Laf;
    //   3329: invokevirtual p : ()V
    //   3332: return
    //   3333: aload_0
    //   3334: getfield a : Laf;
    //   3337: getfield I : Z
    //   3340: ifeq -> 3351
    //   3343: aload_0
    //   3344: getfield a : Laf;
    //   3347: invokevirtual p : ()V
    //   3350: return
    //   3351: aload_0
    //   3352: getfield a : Laf;
    //   3355: getfield a : I
    //   3358: bipush #-45
    //   3360: if_icmpne -> 3371
    //   3363: aload_0
    //   3364: getfield a : Laf;
    //   3367: invokevirtual p : ()V
    //   3370: return
    //   3371: aload_0
    //   3372: getfield a : Laf;
    //   3375: getfield a : I
    //   3378: sipush #360
    //   3381: if_icmpeq -> 3412
    //   3384: aload_0
    //   3385: getfield a : Laf;
    //   3388: dup
    //   3389: getfield a : I
    //   3392: bipush #45
    //   3394: iadd
    //   3395: putfield a : I
    //   3398: getstatic v.aa : Z
    //   3401: ifeq -> 3411
    //   3404: aload_0
    //   3405: getfield a : Laf;
    //   3408: invokevirtual s : ()V
    //   3411: return
    //   3412: aload_0
    //   3413: getfield a : Laf;
    //   3416: getfield a : I
    //   3419: sipush #360
    //   3422: if_icmpne -> 3460
    //   3425: getstatic v.aa : Z
    //   3428: ifeq -> 3438
    //   3431: aload_0
    //   3432: getfield a : Laf;
    //   3435: invokevirtual s : ()V
    //   3438: aload_0
    //   3439: getfield a : Laf;
    //   3442: bipush #-45
    //   3444: putfield a : I
    //   3447: getstatic v.aa : Z
    //   3450: ifeq -> 3460
    //   3453: aload_0
    //   3454: getfield a : Laf;
    //   3457: invokevirtual repaint : ()V
    //   3460: aload_0
    //   3461: getfield a : Laf;
    //   3464: getfield G : Z
    //   3467: ifeq -> 3522
    //   3470: aload_0
    //   3471: getfield a : Laf;
    //   3474: iconst_0
    //   3475: putfield G : Z
    //   3478: aload_0
    //   3479: getfield a : Laf;
    //   3482: iconst_1
    //   3483: putfield H : Z
    //   3486: aload_0
    //   3487: getfield a : Laf;
    //   3490: getfield a : Lf;
    //   3493: ifnull -> 3507
    //   3496: aload_0
    //   3497: getfield a : Laf;
    //   3500: getfield a : Lf;
    //   3503: iconst_0
    //   3504: putfield a : Z
    //   3507: aload_0
    //   3508: getfield a : Laf;
    //   3511: ldc 53323
    //   3513: invokevirtual b : (I)V
    //   3516: aload_0
    //   3517: invokevirtual cancel : ()Z
    //   3520: pop
    //   3521: return
    //   3522: aload_0
    //   3523: getfield a : Laf;
    //   3526: aload_0
    //   3527: getfield a : Laf;
    //   3530: iconst_1
    //   3531: dup_x1
    //   3532: putfield c : Z
    //   3535: putfield D : Z
    //   3538: aload_0
    //   3539: getfield a : Laf;
    //   3542: getfield E : Z
    //   3545: ifeq -> 3568
    //   3548: aload_0
    //   3549: getfield a : Laf;
    //   3552: invokevirtual r : ()V
    //   3555: aload_0
    //   3556: getfield a : Laf;
    //   3559: sipush #272
    //   3562: invokevirtual b : (I)V
    //   3565: goto -> 3814
    //   3568: aload_0
    //   3569: getfield a : Laf;
    //   3572: getfield a : Lv;
    //   3575: getfield c : La;
    //   3578: invokevirtual b : ()Ljava/lang/String;
    //   3581: ldc 61446
    //   3583: invokestatic c : (I)Ljava/lang/String;
    //   3586: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3589: ifeq -> 3605
    //   3592: aload_0
    //   3593: getfield a : Laf;
    //   3596: sipush #295
    //   3599: invokevirtual b : (I)V
    //   3602: goto -> 3814
    //   3605: aload_0
    //   3606: getfield a : Laf;
    //   3609: invokevirtual e : ()Z
    //   3612: ifne -> 3776
    //   3615: aload_0
    //   3616: getfield a : Laf;
    //   3619: invokevirtual f : ()Z
    //   3622: ifne -> 3776
    //   3625: aload_0
    //   3626: getfield a : Laf;
    //   3629: getfield a : Lv;
    //   3632: getfield c : La;
    //   3635: invokevirtual b : ()Ljava/lang/String;
    //   3638: ldc 53265
    //   3640: invokestatic c : (I)Ljava/lang/String;
    //   3643: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3646: ifne -> 3814
    //   3649: aload_0
    //   3650: getfield a : Laf;
    //   3653: getfield a : Lv;
    //   3656: getfield c : La;
    //   3659: aload_0
    //   3660: getfield a : Laf;
    //   3663: getfield a : Lv;
    //   3666: getfield as : I
    //   3669: invokevirtual c : (I)I
    //   3672: bipush #76
    //   3674: if_icmpeq -> 3705
    //   3677: aload_0
    //   3678: getfield a : Laf;
    //   3681: getfield a : Lv;
    //   3684: getfield c : La;
    //   3687: aload_0
    //   3688: getfield a : Laf;
    //   3691: getfield a : Lv;
    //   3694: getfield as : I
    //   3697: invokevirtual c : (I)I
    //   3700: bipush #90
    //   3702: if_icmpne -> 3718
    //   3705: aload_0
    //   3706: getfield a : Laf;
    //   3709: sipush #288
    //   3712: invokevirtual b : (I)V
    //   3715: goto -> 3814
    //   3718: aload_0
    //   3719: getfield a : Laf;
    //   3722: getfield a : Lv;
    //   3725: getfield c : La;
    //   3728: getfield u : Z
    //   3731: ifeq -> 3763
    //   3734: getstatic w.a : Laa;
    //   3737: ifnull -> 3763
    //   3740: getstatic w.a : Laa;
    //   3743: getfield b : I
    //   3746: iconst_m1
    //   3747: if_icmpeq -> 3814
    //   3750: aload_0
    //   3751: getfield a : Laf;
    //   3754: sipush #306
    //   3757: invokevirtual b : (I)V
    //   3760: goto -> 3814
    //   3763: aload_0
    //   3764: getfield a : Laf;
    //   3767: sipush #289
    //   3770: invokevirtual b : (I)V
    //   3773: goto -> 3814
    //   3776: aload_0
    //   3777: getfield a : Laf;
    //   3780: getfield a : Lv;
    //   3783: getfield c : La;
    //   3786: aload_0
    //   3787: getfield a : Laf;
    //   3790: getfield a : Lv;
    //   3793: getfield as : I
    //   3796: invokevirtual c : (I)I
    //   3799: bipush #76
    //   3801: if_icmpne -> 3814
    //   3804: aload_0
    //   3805: getfield a : Laf;
    //   3808: sipush #294
    //   3811: invokevirtual b : (I)V
    //   3814: aload_0
    //   3815: invokevirtual cancel : ()Z
    //   3818: pop
    //   3819: return
    //   3820: aload_0
    //   3821: getfield a : Lv;
    //   3824: aload_0
    //   3825: getfield b : I
    //   3828: aload_0
    //   3829: getfield d : I
    //   3832: invokevirtual b : (II)V
    //   3835: aload_0
    //   3836: invokevirtual cancel : ()Z
    //   3839: pop
    //   3840: return
    //   3841: iconst_0
    //   3842: istore_3
    //   3843: getstatic w.a : Ljava/util/Vector;
    //   3846: invokevirtual isEmpty : ()Z
    //   3849: ifne -> 3936
    //   3852: invokestatic a : ()J
    //   3855: lstore_1
    //   3856: iconst_0
    //   3857: istore #4
    //   3859: iload #4
    //   3861: getstatic w.a : Ljava/util/Vector;
    //   3864: invokevirtual size : ()I
    //   3867: if_icmpge -> 3936
    //   3870: getstatic w.a : Ljava/util/Vector;
    //   3873: iload #4
    //   3875: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   3878: checkcast i
    //   3881: dup
    //   3882: astore_0
    //   3883: ifnull -> 3930
    //   3886: aload_0
    //   3887: invokevirtual g : ()Z
    //   3890: ifeq -> 3930
    //   3893: lload_1
    //   3894: aload_0
    //   3895: getfield f : J
    //   3898: lcmp
    //   3899: iflt -> 3928
    //   3902: invokestatic c : ()I
    //   3905: invokestatic d : ()I
    //   3908: iadd
    //   3909: getstatic w.d : B
    //   3912: if_icmpge -> 3928
    //   3915: aload_0
    //   3916: lconst_0
    //   3917: putfield f : J
    //   3920: aload_0
    //   3921: iconst_0
    //   3922: invokevirtual a : (Z)V
    //   3925: goto -> 3930
    //   3928: iconst_1
    //   3929: istore_3
    //   3930: iinc #4, 1
    //   3933: goto -> 3859
    //   3936: getstatic w.l : J
    //   3939: lconst_0
    //   3940: lcmp
    //   3941: ifle -> 3989
    //   3944: invokestatic a : ()J
    //   3947: getstatic w.l : J
    //   3950: lcmp
    //   3951: iflt -> 3987
    //   3954: getstatic w.a : Ljava/util/Vector;
    //   3957: invokevirtual size : ()I
    //   3960: getstatic w.b : Ljava/util/Vector;
    //   3963: invokevirtual size : ()I
    //   3966: iadd
    //   3967: sipush #255
    //   3970: if_icmpgt -> 3987
    //   3973: iconst_1
    //   3974: putstatic w.v : Z
    //   3977: lconst_0
    //   3978: putstatic w.l : J
    //   3981: invokestatic i : ()V
    //   3984: goto -> 3989
    //   3987: iconst_1
    //   3988: istore_3
    //   3989: iload_3
    //   3990: ifne -> 4099
    //   3993: invokestatic p : ()V
    //   3996: return
    //   3997: invokestatic o : ()V
    //   4000: aload_0
    //   4001: invokevirtual cancel : ()Z
    //   4004: pop
    //   4005: return
    //   4006: aload_0
    //   4007: getfield a : Laf;
    //   4010: iconst_1
    //   4011: putfield C : Z
    //   4014: aload_0
    //   4015: getfield a : Laf;
    //   4018: invokevirtual repaint : ()V
    //   4021: aload_0
    //   4022: getfield a : Laf;
    //   4025: invokevirtual serviceRepaints : ()V
    //   4028: aload_0
    //   4029: getfield a : Laf;
    //   4032: iconst_0
    //   4033: putfield C : Z
    //   4036: aload_0
    //   4037: invokevirtual cancel : ()Z
    //   4040: pop
    //   4041: return
    //   4042: getstatic a.a : Ljavax/microedition/io/HttpConnection;
    //   4045: ifnull -> 4091
    //   4048: getstatic a.a : Ljava/io/DataInputStream;
    //   4051: ifnull -> 4091
    //   4054: getstatic a.a : Ljava/io/DataInputStream;
    //   4057: invokevirtual read : ()I
    //   4060: pop
    //   4061: iconst_1
    //   4062: invokestatic c : (I)Z
    //   4065: ifne -> 4074
    //   4068: invokestatic a : ()Z
    //   4071: ifeq -> 4089
    //   4074: getstatic af.b : Laf;
    //   4077: sipush #683
    //   4080: invokestatic d : (I)Ljava/lang/String;
    //   4083: invokevirtual c : (Ljava/lang/String;)V
    //   4086: goto -> 4091
    //   4089: return
    //   4090: pop
    //   4091: invokestatic f : ()V
    //   4094: aload_0
    //   4095: invokevirtual cancel : ()Z
    //   4098: pop
    //   4099: return
    //   4100: pop
    //   4101: return
    // Exception table:
    //   from	to	target	type
    //   0	453	4100	java/lang/Throwable
    //   454	527	4100	java/lang/Throwable
    //   528	535	4100	java/lang/Throwable
    //   536	574	4100	java/lang/Throwable
    //   575	714	4100	java/lang/Throwable
    //   715	760	4100	java/lang/Throwable
    //   761	811	4100	java/lang/Throwable
    //   812	832	4100	java/lang/Throwable
    //   833	843	4100	java/lang/Throwable
    //   844	894	4100	java/lang/Throwable
    //   895	911	4100	java/lang/Throwable
    //   912	928	4100	java/lang/Throwable
    //   929	948	1062	java/lang/SecurityException
    //   929	948	1076	java/lang/Throwable
    //   929	1060	4100	java/lang/Throwable
    //   949	1060	1062	java/lang/SecurityException
    //   949	1060	1076	java/lang/Throwable
    //   1061	1552	4100	java/lang/Throwable
    //   1209	1430	1462	java/lang/Throwable
    //   1433	1456	1462	java/lang/Throwable
    //   1553	1595	4100	java/lang/Throwable
    //   1596	1638	4100	java/lang/Throwable
    //   1639	1710	1716	java/lang/Exception
    //   1639	1710	1787	finally
    //   1639	1786	4100	java/lang/Throwable
    //   1662	1682	1685	java/lang/Exception
    //   1716	1783	1787	finally
    //   1787	1803	4100	java/lang/Throwable
    //   1804	1824	4100	java/lang/Throwable
    //   1825	1887	1887	java/lang/Exception
    //   1825	1893	4100	java/lang/Throwable
    //   1831	1881	1882	finally
    //   1882	1885	1882	finally
    //   1894	1979	4100	java/lang/Throwable
    //   1948	1978	1978	java/lang/Exception
    //   1955	1971	1972	finally
    //   1972	1976	1972	finally
    //   1980	2208	4100	java/lang/Throwable
    //   2209	2212	4100	java/lang/Throwable
    //   2213	2481	4100	java/lang/Throwable
    //   2217	2257	2260	java/lang/Exception
    //   2261	2345	2346	java/lang/Exception
    //   2482	2995	4100	java/lang/Throwable
    //   2790	2796	2799	java/lang/Exception
    //   2965	2977	2982	java/lang/Exception
    //   2965	2977	2988	finally
    //   2996	3007	4100	java/lang/Throwable
    //   3008	3130	4100	java/lang/Throwable
    //   3063	3108	3111	java/lang/Exception
    //   3131	3197	4100	java/lang/Throwable
    //   3198	3268	4100	java/lang/Throwable
    //   3269	3332	4100	java/lang/Throwable
    //   3333	3350	4100	java/lang/Throwable
    //   3351	3370	4100	java/lang/Throwable
    //   3371	3411	4100	java/lang/Throwable
    //   3412	4099	4100	java/lang/Throwable
    //   4054	4089	4090	java/lang/Exception
  }
  
  private int a(a parama, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: getstatic v.bF : Z
    //   5: ifeq -> 26
    //   8: aload_1
    //   9: ldc '0/server:test'
    //   11: iconst_0
    //   12: iconst_0
    //   13: iconst_0
    //   14: getstatic v.b : [Ljava/lang/String;
    //   17: iload_2
    //   18: aaload
    //   19: invokevirtual a : (Ljava/lang/String;IIZLjava/lang/String;)Lv;
    //   22: astore_2
    //   23: goto -> 41
    //   26: aload_1
    //   27: ldc '0/server:t0'
    //   29: iconst_0
    //   30: iconst_0
    //   31: iconst_0
    //   32: getstatic v.b : [Ljava/lang/String;
    //   35: iload_2
    //   36: aaload
    //   37: invokevirtual a : (Ljava/lang/String;IIZLjava/lang/String;)Lv;
    //   40: astore_2
    //   41: iconst_3
    //   42: istore_3
    //   43: aload_2
    //   44: getfield a : Ljava/io/DataInputStream;
    //   47: ldc2_w 5
    //   50: invokestatic a : (Ljava/io/InputStream;J)V
    //   53: getstatic v.bF : Z
    //   56: ifeq -> 79
    //   59: aload_2
    //   60: getfield a : Ljava/io/DataInputStream;
    //   63: invokevirtual readUTF : ()Ljava/lang/String;
    //   66: ldc 'server:test'
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: ifeq -> 188
    //   74: iconst_1
    //   75: istore_3
    //   76: goto -> 188
    //   79: aload_2
    //   80: getfield a : Ljava/io/DataInputStream;
    //   83: invokevirtual readUnsignedShort : ()I
    //   86: dup
    //   87: istore #4
    //   89: ifne -> 100
    //   92: new java/io/IOException
    //   95: dup
    //   96: invokespecial <init> : ()V
    //   99: athrow
    //   100: iload #4
    //   102: newarray byte
    //   104: astore #4
    //   106: aload_2
    //   107: getfield a : Ljava/io/DataInputStream;
    //   110: aload #4
    //   112: invokevirtual readFully : ([B)V
    //   115: aload_0
    //   116: getfield a : Z
    //   119: ifne -> 188
    //   122: iconst_m1
    //   123: aload #4
    //   125: ldc 'r'
    //   127: iconst_1
    //   128: invokestatic a : (I[BLjava/lang/String;Z)I
    //   131: iconst_1
    //   132: if_icmpne -> 149
    //   135: iconst_1
    //   136: putstatic v.bF : Z
    //   139: iconst_1
    //   140: istore_3
    //   141: aconst_null
    //   142: iconst_0
    //   143: invokestatic a : (Ljava/io/DataOutputStream;Z)V
    //   146: goto -> 188
    //   149: iconst_0
    //   150: istore_0
    //   151: ldc 'r'
    //   153: iconst_1
    //   154: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   157: invokevirtual getSizeAvailable : ()I
    //   160: istore_0
    //   161: goto -> 165
    //   164: pop
    //   165: getstatic af.b : Laf;
    //   168: sipush #147
    //   171: invokestatic d : (I)Ljava/lang/String;
    //   174: ldc '('
    //   176: iload_0
    //   177: invokestatic valueOf : (I)Ljava/lang/String;
    //   180: ldc ').'
    //   182: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   185: invokevirtual c : (Ljava/lang/String;)V
    //   188: aload_1
    //   189: getfield b : Z
    //   192: ifeq -> 197
    //   195: iconst_2
    //   196: istore_3
    //   197: aload_1
    //   198: ifnull -> 205
    //   201: aload_1
    //   202: invokevirtual e : ()V
    //   205: goto -> 217
    //   208: pop
    //   209: aload_1
    //   210: ifnull -> 217
    //   213: aload_1
    //   214: invokevirtual e : ()V
    //   217: iload_3
    //   218: ireturn
    // Exception table:
    //   from	to	target	type
    //   2	205	208	java/lang/Exception
    //   151	161	164	java/lang/Exception
  }
  
  public static void a() {
    DataInputStream dataInputStream = null;
    if (m.a != null)
      return; 
    try {
      dataInputStream = v.a(1);
      m.a = (int[][])new short[768];
      m.b = (byte[][])new short[256];
      m.c = (int[][])new short[256];
      m.a = (int[][])new int[64];
      m.b = (byte[][])new int[64];
      short s = 0;
      byte b;
      for (b = 0; b < '̀'; b++)
        m.a[b] = s = (short)(s + dataInputStream.readShort()); 
      s = 0;
      for (b = 0; b < 'Ā'; b++)
        m.b[b] = s = (short)(s + dataInputStream.readShort()); 
      s = 0;
      for (b = 0; b < 'Ā'; b++)
        m.c[b] = s = (short)(s + dataInputStream.readShort()); 
      s = 0;
      for (b = 0; b < 64; b++)
        m.a[b] = s = (short)(s + dataInputStream.readShort()); 
      s = 0;
      for (b = 0; b < 64; b++)
        m.b[b] = s = (short)(s + dataInputStream.readShort()); 
      return;
    } catch (Exception exception) {
      return;
    } finally {
      v.a(dataInputStream);
    } 
  }
  
  public static Image a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Image image = null;
    if (v.aE != 0 && paramInt1 != 0) {
      byte[] arrayOfByte = new byte[paramInt2];
      System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
      paramArrayOfbyte = arrayOfByte;
      paramInt1 = 0;
    } 
    try {
      if (v.aN != 0 || paramArrayOfbyte[paramInt1] == -119)
        return v.a(paramArrayOfbyte, paramInt1, paramInt2); 
      m m;
      if ((m = new m()).a(paramArrayOfbyte, paramInt1, paramInt2, 0, false) == 0 && m.c > null && m.d > 0)
        image = v.a((int[])m.c, m.b, m.a, false); 
      return image;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static int a(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt, a parama) {
    int i = 0;
    if (paramInt > 0) {
      int j = v.b(paramInt, 10240);
      try {
        if (parama != null) {
          parama.q = paramInt;
          parama.r = 0;
        } 
        byte[] arrayOfByte = new byte[j];
        int k;
        for (k = paramInt; k > 0 && ((parama != null && parama.b == null) || (parama == null && !ai.b)); k -= paramInt) {
          i += paramInt = paramInputStream.read(arrayOfByte, 0, (k >= arrayOfByte.length) ? arrayOfByte.length : k);
          if (parama != null) {
            parama.r = i;
            if (i % 1024 == 0) {
              af.b.o();
              v.i();
            } 
            paramOutputStream.flush();
          } 
          paramOutputStream.write(arrayOfByte, 0, paramInt);
        } 
      } catch (Throwable throwable2) {
        Throwable throwable1;
        if (throwable1 = null instanceof OutOfMemoryError) {
          af.b.c(v.d(62));
          if (parama != null)
            af.b.a(1, (v)parama.a); 
        } else {
          af.b.c(throwable1.toString());
        } 
      } 
    } 
    return i;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\l.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */