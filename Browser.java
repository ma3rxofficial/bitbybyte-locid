import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;

public class Browser extends MIDlet {
  public Display a;
  
  private boolean a;
  
  public void pauseApp() {
    this.a = true;
    if (v.cS)
      w.b(true); 
  }
  
  public void startApp() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: invokestatic getDisplay : (Lfavax/microedition/midlet/MIDlet;)Lfavax/microedition/lcdui/Display;
    //   5: putfield a : Lfavax/microedition/lcdui/Display;
    //   8: getstatic af.b : Laf;
    //   11: ifnull -> 63
    //   14: getstatic v.cW : Z
    //   17: ifne -> 33
    //   20: aload_0
    //   21: getfield a : Lfavax/microedition/lcdui/Display;
    //   24: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   27: instanceof javax/microedition/lcdui/Alert
    //   30: ifeq -> 63
    //   33: getstatic af.b : Laf;
    //   36: aload_0
    //   37: getfield a : Lfavax/microedition/lcdui/Display;
    //   40: putfield a : Lfavax/microedition/lcdui/Display;
    //   43: iconst_0
    //   44: putstatic v.cW : Z
    //   47: getstatic af.b : Laf;
    //   50: invokevirtual repaint : ()V
    //   53: aload_0
    //   54: getfield a : Lfavax/microedition/lcdui/Display;
    //   57: getstatic af.b : Laf;
    //   60: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   63: getstatic v.cS : Z
    //   66: ifeq -> 72
    //   69: invokestatic m : ()V
    //   72: aload_0
    //   73: getfield a : Z
    //   76: ifeq -> 85
    //   79: aload_0
    //   80: iconst_0
    //   81: putfield a : Z
    //   84: return
    //   85: getstatic v.bG : Z
    //   88: ifne -> 92
    //   91: return
    //   92: iconst_0
    //   93: putstatic v.bG : Z
    //   96: invokestatic b : ()V
    //   99: invokestatic d : ()Ljava/lang/String;
    //   102: putstatic v.m : Ljava/lang/String;
    //   105: aload_0
    //   106: astore_1
    //   107: ldc 'microedition.platform'
    //   109: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   112: dup
    //   113: putstatic v.i : Ljava/lang/String;
    //   116: ifnull -> 128
    //   119: getstatic v.i : Ljava/lang/String;
    //   122: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   125: goto -> 130
    //   128: ldc ''
    //   130: putstatic v.i : Ljava/lang/String;
    //   133: aconst_null
    //   134: iconst_0
    //   135: invokestatic a : (Ljava/io/DataInputStream;Z)Z
    //   138: pop
    //   139: getstatic v.r : Ljava/lang/String;
    //   142: ifnonnull -> 157
    //   145: aload_1
    //   146: checkcast favax/microedition/midlet/MIDlet
    //   149: ldc 'Operette-UA'
    //   151: invokevirtual getAppProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   154: putstatic v.r : Ljava/lang/String;
    //   157: getstatic v.r : Ljava/lang/String;
    //   160: ifnull -> 172
    //   163: getstatic v.r : Ljava/lang/String;
    //   166: invokevirtual length : ()I
    //   169: ifne -> 177
    //   172: ldc 'Opera/8.01 (J2ME/MIDP; Opera Mini/3.1.10423/1724; ru; U; ssr)'
    //   174: putstatic v.r : Ljava/lang/String;
    //   177: iconst_1
    //   178: putstatic v.i : Z
    //   181: iconst_m1
    //   182: putstatic v.G : I
    //   185: aload_1
    //   186: checkcast favax/microedition/midlet/MIDlet
    //   189: invokestatic getDisplay : (Lfavax/microedition/midlet/MIDlet;)Lfavax/microedition/lcdui/Display;
    //   192: invokevirtual numColors : ()I
    //   195: putstatic v.bq : I
    //   198: aload_1
    //   199: checkcast favax/microedition/midlet/MIDlet
    //   202: invokestatic getDisplay : (Lfavax/microedition/midlet/MIDlet;)Lfavax/microedition/lcdui/Display;
    //   205: invokevirtual numAlphaLevels : ()I
    //   208: dup
    //   209: putstatic v.br : I
    //   212: iconst_2
    //   213: if_icmple -> 220
    //   216: iconst_1
    //   217: goto -> 221
    //   220: iconst_0
    //   221: putstatic v.ag : Z
    //   224: getstatic v.r : Ljava/lang/String;
    //   227: ifnull -> 257
    //   230: getstatic v.r : Ljava/lang/String;
    //   233: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   236: ldc 'sagem'
    //   238: invokevirtual indexOf : (Ljava/lang/String;)I
    //   241: iconst_m1
    //   242: if_icmpeq -> 257
    //   245: iconst_5
    //   246: putstatic v.G : I
    //   249: iconst_1
    //   250: putstatic v.aF : Z
    //   253: iconst_1
    //   254: putstatic v.dg : Z
    //   257: getstatic v.i : Ljava/lang/String;
    //   260: ldc 'nokia'
    //   262: invokevirtual indexOf : (Ljava/lang/String;)I
    //   265: iconst_m1
    //   266: if_icmpeq -> 284
    //   269: iconst_1
    //   270: putstatic v.dh : Z
    //   273: iconst_1
    //   274: putstatic v.di : Z
    //   277: iconst_0
    //   278: putstatic v.G : I
    //   281: goto -> 300
    //   284: getstatic v.i : Ljava/lang/String;
    //   287: ldc 'vs'
    //   289: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   292: ifeq -> 300
    //   295: bipush #8
    //   297: putstatic v.G : I
    //   300: getstatic v.i : Ljava/lang/String;
    //   303: ldc 'rim wireless'
    //   305: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   308: ifeq -> 319
    //   311: bipush #7
    //   313: putstatic v.G : I
    //   316: goto -> 587
    //   319: getstatic v.i : Ljava/lang/String;
    //   322: ldc 'siemens_sx1'
    //   324: invokevirtual equals : (Ljava/lang/Object;)Z
    //   327: ifne -> 352
    //   330: getstatic v.i : Ljava/lang/String;
    //   333: ldc 'sendo x'
    //   335: invokevirtual equals : (Ljava/lang/Object;)Z
    //   338: ifne -> 352
    //   341: getstatic v.i : Ljava/lang/String;
    //   344: ldc 'panasonic x700'
    //   346: invokevirtual equals : (Ljava/lang/Object;)Z
    //   349: ifeq -> 359
    //   352: iconst_0
    //   353: putstatic v.G : I
    //   356: goto -> 587
    //   359: getstatic v.i : Ljava/lang/String;
    //   362: ldc 'palm'
    //   364: invokevirtual indexOf : (Ljava/lang/String;)I
    //   367: iconst_m1
    //   368: if_icmpeq -> 379
    //   371: bipush #6
    //   373: putstatic v.G : I
    //   376: goto -> 587
    //   379: ldc 'com.siemens.mp.lcdui.Image'
    //   381: invokestatic b : (Ljava/lang/String;)Z
    //   384: ifeq -> 394
    //   387: iconst_2
    //   388: putstatic v.G : I
    //   391: goto -> 587
    //   394: ldc 'com.motorola.phonebook.PhoneBookRecord'
    //   396: invokestatic b : (Ljava/lang/String;)Z
    //   399: ifne -> 490
    //   402: ldc 'com.motorola.Dialer'
    //   404: invokestatic b : (Ljava/lang/String;)Z
    //   407: ifne -> 490
    //   410: ldc 'com.motorola.phone.Dialer'
    //   412: invokestatic b : (Ljava/lang/String;)Z
    //   415: ifne -> 490
    //   418: ldc 'com.motorola.graphics.j3d.Light'
    //   420: invokestatic b : (Ljava/lang/String;)Z
    //   423: ifne -> 490
    //   426: ldc 'com.motorola.lwt.ComponentScreen'
    //   428: invokestatic b : (Ljava/lang/String;)Z
    //   431: ifne -> 490
    //   434: ldc 'com.motorola.game.GameScreen'
    //   436: invokestatic b : (Ljava/lang/String;)Z
    //   439: ifne -> 490
    //   442: ldc 'com.motorola.funlight.FunLight'
    //   444: invokestatic b : (Ljava/lang/String;)Z
    //   447: ifne -> 490
    //   450: ldc 'com.motorola.multimedia.Lighting'
    //   452: invokestatic b : (Ljava/lang/String;)Z
    //   455: ifne -> 490
    //   458: ldc 'com.motorola.io.ConnectorEvent'
    //   460: invokestatic b : (Ljava/lang/String;)Z
    //   463: ifne -> 490
    //   466: ldc 'com.motorola.extensions.ScalableJPGImage'
    //   468: invokestatic b : (Ljava/lang/String;)Z
    //   471: ifne -> 490
    //   474: ldc 'batterylevel'
    //   476: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   479: ifnonnull -> 490
    //   482: ldc 'BatteryLevel'
    //   484: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   487: ifnull -> 497
    //   490: iconst_1
    //   491: putstatic v.G : I
    //   494: goto -> 587
    //   497: getstatic v.i : Ljava/lang/String;
    //   500: ldc 'sonyericsson'
    //   502: invokevirtual indexOf : (Ljava/lang/String;)I
    //   505: iconst_m1
    //   506: if_icmpne -> 536
    //   509: getstatic v.i : Ljava/lang/String;
    //   512: ldc 'symbian os'
    //   514: invokevirtual equals : (Ljava/lang/Object;)Z
    //   517: ifne -> 536
    //   520: ldc 'com.sonyericsson.IMEI'
    //   522: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   525: ifnonnull -> 536
    //   528: ldc 'com.sonyericsson.imei'
    //   530: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   533: ifnull -> 543
    //   536: iconst_3
    //   537: putstatic v.G : I
    //   540: goto -> 587
    //   543: ldc 'com.samsung.util.AudioClip'
    //   545: invokestatic b : (Ljava/lang/String;)Z
    //   548: ifne -> 583
    //   551: ldc 'com.samsung.util.LCDLight'
    //   553: invokestatic b : (Ljava/lang/String;)Z
    //   556: ifne -> 583
    //   559: ldc 'com.samsung.util.SM'
    //   561: invokestatic b : (Ljava/lang/String;)Z
    //   564: ifne -> 583
    //   567: ldc 'com.samsung.util.SMS'
    //   569: invokestatic b : (Ljava/lang/String;)Z
    //   572: ifne -> 583
    //   575: ldc 'com.samsung.util.Vibration'
    //   577: invokestatic b : (Ljava/lang/String;)Z
    //   580: ifeq -> 587
    //   583: iconst_4
    //   584: putstatic v.G : I
    //   587: getstatic v.G : I
    //   590: ifne -> 605
    //   593: getstatic v.i : Ljava/lang/String;
    //   596: ldc '3220'
    //   598: invokevirtual indexOf : (Ljava/lang/String;)I
    //   601: iconst_m1
    //   602: if_icmpne -> 613
    //   605: getstatic v.G : I
    //   608: bipush #6
    //   610: if_icmpne -> 617
    //   613: iconst_1
    //   614: putstatic v.ba : Z
    //   617: getstatic v.G : I
    //   620: iconst_1
    //   621: if_icmpne -> 671
    //   624: getstatic v.i : Ljava/lang/String;
    //   627: ldc 'j2me'
    //   629: invokevirtual equals : (Ljava/lang/Object;)Z
    //   632: ifeq -> 639
    //   635: iconst_1
    //   636: putstatic af.x : Z
    //   639: sipush #1024
    //   642: putstatic af.g : I
    //   645: sipush #290
    //   648: putstatic v.x : I
    //   651: ldc 'com.mot.iden.multimedia.Lighting'
    //   653: invokestatic b : (Ljava/lang/String;)Z
    //   656: ifeq -> 671
    //   659: iconst_1
    //   660: putstatic v.ao : Z
    //   663: iconst_1
    //   664: putstatic v.bd : Z
    //   667: iconst_1
    //   668: putstatic v.ad : Z
    //   671: getstatic v.G : I
    //   674: iconst_1
    //   675: if_icmpeq -> 697
    //   678: getstatic v.G : I
    //   681: bipush #8
    //   683: if_icmpne -> 701
    //   686: getstatic v.i : Ljava/lang/String;
    //   689: ldc 'vs'
    //   691: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   694: ifeq -> 701
    //   697: iconst_1
    //   698: putstatic v.aI : Z
    //   701: getstatic v.G : I
    //   704: iconst_3
    //   705: if_icmpne -> 872
    //   708: getstatic v.i : Ljava/lang/String;
    //   711: ldc 'g900'
    //   713: invokevirtual indexOf : (Ljava/lang/String;)I
    //   716: iconst_m1
    //   717: if_icmpne -> 768
    //   720: getstatic v.i : Ljava/lang/String;
    //   723: ldc 'p1'
    //   725: invokevirtual indexOf : (Ljava/lang/String;)I
    //   728: iconst_m1
    //   729: if_icmpne -> 768
    //   732: getstatic v.i : Ljava/lang/String;
    //   735: ldc 'p990'
    //   737: invokevirtual indexOf : (Ljava/lang/String;)I
    //   740: iconst_m1
    //   741: if_icmpne -> 768
    //   744: getstatic v.i : Ljava/lang/String;
    //   747: ldc 'm600'
    //   749: invokevirtual indexOf : (Ljava/lang/String;)I
    //   752: iconst_m1
    //   753: if_icmpne -> 768
    //   756: getstatic v.i : Ljava/lang/String;
    //   759: ldc 'w950'
    //   761: invokevirtual indexOf : (Ljava/lang/String;)I
    //   764: iconst_m1
    //   765: if_icmpeq -> 772
    //   768: iconst_1
    //   769: putstatic v.aK : Z
    //   772: getstatic v.i : Ljava/lang/String;
    //   775: ldc 'p910'
    //   777: invokevirtual indexOf : (Ljava/lang/String;)I
    //   780: iconst_m1
    //   781: if_icmpeq -> 796
    //   784: iconst_1
    //   785: dup
    //   786: putstatic af.w : Z
    //   789: putstatic v.cB : Z
    //   792: iconst_1
    //   793: putstatic v.al : Z
    //   796: getstatic v.i : Ljava/lang/String;
    //   799: ldc 'symbian'
    //   801: invokevirtual indexOf : (Ljava/lang/String;)I
    //   804: iconst_m1
    //   805: if_icmpeq -> 812
    //   808: iconst_1
    //   809: putstatic v.al : Z
    //   812: iconst_1
    //   813: putstatic af.x : Z
    //   816: getstatic v.i : Ljava/lang/String;
    //   819: ldc 'z520'
    //   821: invokevirtual indexOf : (Ljava/lang/String;)I
    //   824: iconst_m1
    //   825: if_icmpeq -> 834
    //   828: sipush #320
    //   831: putstatic af.h : I
    //   834: ldc 'javax.wireless.messaging.MultipartMessage'
    //   836: invokestatic b : (Ljava/lang/String;)Z
    //   839: ifeq -> 856
    //   842: ldc 'javax.microedition.amms.GlobalManager'
    //   844: invokestatic b : (Ljava/lang/String;)Z
    //   847: ifne -> 856
    //   850: sipush #2475
    //   853: putstatic af.g : I
    //   856: getstatic v.i : Ljava/lang/String;
    //   859: ldc 'w810i'
    //   861: invokevirtual indexOf : (Ljava/lang/String;)I
    //   864: iconst_m1
    //   865: if_icmpeq -> 872
    //   868: iconst_1
    //   869: putstatic v.aJ : Z
    //   872: ldc 'microedition.profiles'
    //   874: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   877: astore_2
    //   878: ldc 'com.sprintpcs.util.System'
    //   880: invokestatic b : (Ljava/lang/String;)Z
    //   883: ifne -> 900
    //   886: aload_2
    //   887: ifnull -> 912
    //   890: aload_2
    //   891: ldc 'SPRINTPCS-1.0'
    //   893: invokevirtual indexOf : (Ljava/lang/String;)I
    //   896: iconst_m1
    //   897: if_icmpeq -> 912
    //   900: iconst_1
    //   901: putstatic v.am : Z
    //   904: iconst_1
    //   905: putstatic v.ar : Z
    //   908: iconst_1
    //   909: putstatic v.an : Z
    //   912: getstatic v.an : Z
    //   915: ifne -> 945
    //   918: ldc 'javax.wireless.messaging.MessageConnection'
    //   920: invokestatic b : (Ljava/lang/String;)Z
    //   923: ifeq -> 941
    //   926: ldc 'javax.wireless.messaging.TextMessage'
    //   928: invokestatic b : (Ljava/lang/String;)Z
    //   931: ifeq -> 941
    //   934: iconst_1
    //   935: putstatic v.ah : Z
    //   938: goto -> 945
    //   941: iconst_0
    //   942: putstatic v.ah : Z
    //   945: ldc 'javax.microedition.media.control.VideoControl'
    //   947: invokestatic b : (Ljava/lang/String;)Z
    //   950: ifeq -> 1042
    //   953: ldc 'video.snapshot.encodings'
    //   955: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   958: dup
    //   959: putstatic af.f : Ljava/lang/String;
    //   962: ifnull -> 1042
    //   965: aload_1
    //   966: checkcast favax/microedition/midlet/MIDlet
    //   969: ldc 'javax.microedition.media.control.VideoControl.getSnapshot'
    //   971: invokevirtual checkPermission : (Ljava/lang/String;)I
    //   974: ifeq -> 1042
    //   977: getstatic v.am : Z
    //   980: ifne -> 1042
    //   983: getstatic v.i : Ljava/lang/String;
    //   986: ldc 'sonyericssonj300'
    //   988: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   991: ifne -> 1042
    //   994: getstatic v.i : Ljava/lang/String;
    //   997: ldc 'nokia9300'
    //   999: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1002: ifne -> 1042
    //   1005: getstatic v.i : Ljava/lang/String;
    //   1008: ldc 'nokia6280/03'
    //   1010: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1013: ifne -> 1042
    //   1016: getstatic v.i : Ljava/lang/String;
    //   1019: ldc 'nokiae6'
    //   1021: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1024: ifne -> 1042
    //   1027: getstatic v.i : Ljava/lang/String;
    //   1030: ldc 'sk6'
    //   1032: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1035: ifne -> 1042
    //   1038: iconst_1
    //   1039: goto -> 1043
    //   1042: iconst_0
    //   1043: putstatic v.aj : Z
    //   1046: getstatic v.G : I
    //   1049: bipush #6
    //   1051: if_icmpne -> 1082
    //   1054: iconst_1
    //   1055: putstatic v.aH : Z
    //   1058: iconst_1
    //   1059: putstatic af.v : Z
    //   1062: iconst_1
    //   1063: putstatic v.aS : Z
    //   1066: iconst_1
    //   1067: putstatic v.aZ : Z
    //   1070: sipush #1000
    //   1073: putstatic v.w : I
    //   1076: sipush #2000
    //   1079: putstatic v.D : I
    //   1082: getstatic v.i : Ljava/lang/String;
    //   1085: ldc 'windows ce'
    //   1087: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1090: ifeq -> 1101
    //   1093: iconst_1
    //   1094: putstatic af.v : Z
    //   1097: iconst_0
    //   1098: putstatic v.o : Z
    //   1101: getstatic v.i : Ljava/lang/String;
    //   1104: ldc 'nokia6600/'
    //   1106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1109: ifeq -> 1120
    //   1112: iconst_1
    //   1113: putstatic v.at : Z
    //   1116: iconst_1
    //   1117: putstatic af.u : Z
    //   1120: getstatic v.i : Ljava/lang/String;
    //   1123: ldc 'nokia6600/'
    //   1125: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1128: ifne -> 1197
    //   1131: getstatic v.i : Ljava/lang/String;
    //   1134: ldc 'nokia6620/'
    //   1136: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1139: ifne -> 1197
    //   1142: getstatic v.i : Ljava/lang/String;
    //   1145: ldc 'nokia6670/'
    //   1147: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1150: ifne -> 1197
    //   1153: getstatic v.i : Ljava/lang/String;
    //   1156: ldc 'nokia6260/'
    //   1158: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1161: ifne -> 1197
    //   1164: getstatic v.i : Ljava/lang/String;
    //   1167: ldc 'nokia7610/'
    //   1169: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1172: ifne -> 1197
    //   1175: getstatic v.i : Ljava/lang/String;
    //   1178: ldc 'nokia9300/'
    //   1180: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1183: ifne -> 1197
    //   1186: getstatic v.i : Ljava/lang/String;
    //   1189: ldc 'nokia9500/'
    //   1191: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1194: ifeq -> 1201
    //   1197: iconst_1
    //   1198: putstatic v.au : Z
    //   1201: getstatic v.i : Ljava/lang/String;
    //   1204: ldc 'nokia6600/'
    //   1206: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1209: ifne -> 1245
    //   1212: getstatic v.i : Ljava/lang/String;
    //   1215: ldc 'nokia7610/'
    //   1217: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1220: ifne -> 1245
    //   1223: getstatic v.i : Ljava/lang/String;
    //   1226: ldc 'nokia3230/'
    //   1228: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1231: ifne -> 1245
    //   1234: getstatic v.i : Ljava/lang/String;
    //   1237: ldc 'nokia6290/'
    //   1239: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1242: ifeq -> 1249
    //   1245: iconst_1
    //   1246: putstatic v.ay : Z
    //   1249: getstatic v.i : Ljava/lang/String;
    //   1252: ldc 'nokia6630/'
    //   1254: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1257: ifeq -> 1264
    //   1260: iconst_1
    //   1261: putstatic v.az : Z
    //   1264: getstatic v.i : Ljava/lang/String;
    //   1267: ldc 'nokia6630/'
    //   1269: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1272: ifne -> 1284
    //   1275: getstatic v.i : Ljava/lang/String;
    //   1278: ldc 'nokia6280/'
    //   1280: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1283: pop
    //   1284: getstatic v.i : Ljava/lang/String;
    //   1287: ldc 'nokiae61'
    //   1289: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1292: ifne -> 1306
    //   1295: getstatic v.i : Ljava/lang/String;
    //   1298: ldc 'nokiae9'
    //   1300: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1303: ifeq -> 1310
    //   1306: iconst_1
    //   1307: putstatic v.aA : Z
    //   1310: getstatic v.i : Ljava/lang/String;
    //   1313: ldc 'nokia9'
    //   1315: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1318: ifeq -> 1325
    //   1321: iconst_1
    //   1322: putstatic v.aw : Z
    //   1325: getstatic v.i : Ljava/lang/String;
    //   1328: ldc 'nokia6680/'
    //   1330: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1333: ifne -> 1347
    //   1336: getstatic v.i : Ljava/lang/String;
    //   1339: ldc 'nokia6682'
    //   1341: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1344: ifeq -> 1351
    //   1347: iconst_1
    //   1348: putstatic v.av : Z
    //   1351: getstatic v.i : Ljava/lang/String;
    //   1354: ldc 'nokia6230i'
    //   1356: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1359: ifne -> 1384
    //   1362: getstatic v.i : Ljava/lang/String;
    //   1365: ldc 'nokia6233'
    //   1367: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1370: ifne -> 1384
    //   1373: getstatic v.i : Ljava/lang/String;
    //   1376: ldc 'nokia6270'
    //   1378: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1381: ifeq -> 1388
    //   1384: iconst_1
    //   1385: putstatic v.cC : Z
    //   1388: getstatic v.i : Ljava/lang/String;
    //   1391: ldc 'nokia6120'
    //   1393: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1396: ifeq -> 1403
    //   1399: iconst_1
    //   1400: putstatic v.K : Z
    //   1403: getstatic v.G : I
    //   1406: iconst_2
    //   1407: if_icmpne -> 1454
    //   1410: getstatic v.i : Ljava/lang/String;
    //   1413: ldc 'el71'
    //   1415: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1418: iconst_m1
    //   1419: if_icmpne -> 1434
    //   1422: getstatic v.i : Ljava/lang/String;
    //   1425: ldc 'e71'
    //   1427: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1430: iconst_m1
    //   1431: if_icmpeq -> 1438
    //   1434: iconst_1
    //   1435: goto -> 1439
    //   1438: iconst_0
    //   1439: dup
    //   1440: putstatic v.aR : Z
    //   1443: ifeq -> 1454
    //   1446: iconst_1
    //   1447: putstatic v.aQ : Z
    //   1450: iconst_1
    //   1451: putstatic af.u : Z
    //   1454: getstatic v.G : I
    //   1457: iconst_2
    //   1458: if_icmpne -> 1477
    //   1461: getstatic v.i : Ljava/lang/String;
    //   1464: ldc 's68'
    //   1466: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1469: iconst_m1
    //   1470: if_icmpeq -> 1477
    //   1473: iconst_1
    //   1474: putstatic v.ax : Z
    //   1477: getstatic v.G : I
    //   1480: bipush #7
    //   1482: if_icmpne -> 1493
    //   1485: iconst_1
    //   1486: putstatic v.aG : Z
    //   1489: iconst_1
    //   1490: putstatic v.an : Z
    //   1493: iconst_4
    //   1494: putstatic v.be : I
    //   1497: ldc 'com.motorola.io.file.FileConnection'
    //   1499: invokestatic b : (Ljava/lang/String;)Z
    //   1502: ifeq -> 1512
    //   1505: iconst_5
    //   1506: putstatic v.be : I
    //   1509: goto -> 1586
    //   1512: ldc 'com.motorola.io.FileConnection'
    //   1514: invokestatic b : (Ljava/lang/String;)Z
    //   1517: ifeq -> 1527
    //   1520: iconst_1
    //   1521: putstatic v.be : I
    //   1524: goto -> 1586
    //   1527: ldc 'javax.microedition.io.file.FileConnection'
    //   1529: invokestatic b : (Ljava/lang/String;)Z
    //   1532: ifeq -> 1574
    //   1535: getstatic v.i : Ljava/lang/String;
    //   1538: ldc 's75'
    //   1540: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1543: iconst_m1
    //   1544: if_icmpne -> 1559
    //   1547: getstatic v.i : Ljava/lang/String;
    //   1550: ldc 'sl75'
    //   1552: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1555: iconst_m1
    //   1556: if_icmpeq -> 1563
    //   1559: iconst_1
    //   1560: goto -> 1564
    //   1563: iconst_0
    //   1564: putstatic v.cA : Z
    //   1567: iconst_3
    //   1568: putstatic v.be : I
    //   1571: goto -> 1586
    //   1574: ldc 'com.siemens.mp.io.file.FileConnection'
    //   1576: invokestatic b : (Ljava/lang/String;)Z
    //   1579: ifeq -> 1586
    //   1582: iconst_2
    //   1583: putstatic v.be : I
    //   1586: getstatic v.cH : Z
    //   1589: ifeq -> 1596
    //   1592: iconst_4
    //   1593: goto -> 1599
    //   1596: getstatic v.be : I
    //   1599: putstatic v.bd : I
    //   1602: ldc 'com.nokia.mid.ui.DeviceControl'
    //   1604: invokestatic b : (Ljava/lang/String;)Z
    //   1607: putstatic v.cx : Z
    //   1610: ldc 'com.siemens.mp.game.Light'
    //   1612: invokestatic b : (Ljava/lang/String;)Z
    //   1615: putstatic v.cy : Z
    //   1618: ldc 'com.siemens.mp.lcdui.Graphics'
    //   1620: invokestatic b : (Ljava/lang/String;)Z
    //   1623: putstatic v.cz : Z
    //   1626: ldc 'microedition.sensor.version'
    //   1628: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   1631: ifnull -> 1638
    //   1634: iconst_1
    //   1635: goto -> 1639
    //   1638: iconst_0
    //   1639: putstatic v.dm : Z
    //   1642: aconst_null
    //   1643: invokestatic a : (Ljava/lang/Object;)V
    //   1646: new java/util/Vector
    //   1649: dup
    //   1650: bipush #6
    //   1652: invokespecial <init> : (I)V
    //   1655: astore_1
    //   1656: aconst_null
    //   1657: iconst_1
    //   1658: ldc 'srv'
    //   1660: iconst_0
    //   1661: invokestatic a : (Ljava/io/DataInputStream;ZLjava/lang/String;I)Ljava/util/Vector;
    //   1664: dup
    //   1665: astore_2
    //   1666: ifnull -> 1694
    //   1669: aload_2
    //   1670: invokevirtual size : ()I
    //   1673: iconst_3
    //   1674: if_icmple -> 1694
    //   1677: aload_2
    //   1678: invokevirtual size : ()I
    //   1681: anewarray java/lang/String
    //   1684: putstatic v.b : [Ljava/lang/String;
    //   1687: aload_2
    //   1688: getstatic v.b : [Ljava/lang/String;
    //   1691: invokevirtual copyInto : ([Ljava/lang/Object;)V
    //   1694: new java/util/Vector
    //   1697: dup
    //   1698: iconst_4
    //   1699: invokespecial <init> : (I)V
    //   1702: putstatic v.a : Ljava/util/Vector;
    //   1705: iconst_0
    //   1706: istore_2
    //   1707: iload_2
    //   1708: getstatic v.b : [Ljava/lang/String;
    //   1711: arraylength
    //   1712: if_icmpge -> 1769
    //   1715: aload_1
    //   1716: checkcast java/util/Vector
    //   1719: getstatic v.b : [Ljava/lang/String;
    //   1722: iload_2
    //   1723: aaload
    //   1724: invokevirtual addElement : (Ljava/lang/Object;)V
    //   1727: getstatic v.a : Ljava/util/Vector;
    //   1730: getstatic v.b : [Ljava/lang/String;
    //   1733: iload_2
    //   1734: aaload
    //   1735: invokevirtual addElement : (Ljava/lang/Object;)V
    //   1738: getstatic v.b : [Ljava/lang/String;
    //   1741: iload_2
    //   1742: aaload
    //   1743: ldc 'http://'
    //   1745: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1748: ifeq -> 1763
    //   1751: aload_1
    //   1752: checkcast java/util/Vector
    //   1755: getstatic v.b : [Ljava/lang/String;
    //   1758: iload_2
    //   1759: aaload
    //   1760: invokevirtual addElement : (Ljava/lang/Object;)V
    //   1763: iinc #2, 1
    //   1766: goto -> 1707
    //   1769: aload_1
    //   1770: checkcast java/util/Vector
    //   1773: invokevirtual size : ()I
    //   1776: anewarray java/lang/String
    //   1779: putstatic v.b : [Ljava/lang/String;
    //   1782: iconst_0
    //   1783: istore_2
    //   1784: iload_2
    //   1785: getstatic v.b : [Ljava/lang/String;
    //   1788: arraylength
    //   1789: if_icmpge -> 1814
    //   1792: getstatic v.b : [Ljava/lang/String;
    //   1795: iload_2
    //   1796: aload_1
    //   1797: checkcast java/util/Vector
    //   1800: iload_2
    //   1801: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   1804: checkcast java/lang/String
    //   1807: aastore
    //   1808: iinc #2, 1
    //   1811: goto -> 1784
    //   1814: aconst_null
    //   1815: invokestatic c : (Ljava/io/DataInputStream;)Z
    //   1818: pop
    //   1819: aconst_null
    //   1820: invokestatic a : (Ljava/io/DataInputStream;)Z
    //   1823: pop
    //   1824: new af
    //   1827: dup
    //   1828: aload_0
    //   1829: invokespecial <init> : (LBrowser;)V
    //   1832: dup
    //   1833: putstatic af.b : Laf;
    //   1836: invokevirtual repaint : ()V
    //   1839: getstatic v.aw : Z
    //   1842: ifeq -> 1851
    //   1845: getstatic af.b : Laf;
    //   1848: invokevirtual serviceRepaints : ()V
    //   1851: getstatic v.T : Z
    //   1854: ifeq -> 1868
    //   1857: getstatic v.U : Z
    //   1860: ifeq -> 1868
    //   1863: iconst_1
    //   1864: invokestatic h : (I)V
    //   1867: return
    //   1868: aload_0
    //   1869: getfield a : Lfavax/microedition/lcdui/Display;
    //   1872: getstatic af.b : Laf;
    //   1875: invokevirtual callSerially : (Ljava/lang/Runnable;)V
    //   1878: return
  }
  
  public void destroyApp(boolean paramBoolean) {
    if (af.b != null) {
      af.b.A();
      ((af)af.b).a = null;
      ((af)af.b).a = null;
      af.b = null;
    } 
    v.C();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\Browser.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */