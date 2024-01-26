import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

public final class b implements CommandListener {
  public List a;
  
  af a;
  
  public r a;
  
  public b(af paramaf) {
    this.a = (r)paramaf;
  }
  
  public final void a(v paramv, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 11
    //   4: aload_1
    //   5: getfield c : La;
    //   8: ifnonnull -> 12
    //   11: return
    //   12: invokestatic C : ()V
    //   15: aload_1
    //   16: aload_1
    //   17: getfield c : La;
    //   20: iconst_0
    //   21: invokevirtual b : (Z)Ljava/lang/String;
    //   24: putfield q : Ljava/lang/String;
    //   27: getstatic v.aC : I
    //   30: istore #5
    //   32: iconst_0
    //   33: istore #6
    //   35: getstatic v.bM : Z
    //   38: ifeq -> 47
    //   41: iconst_0
    //   42: ldc 2097152
    //   44: ior
    //   45: istore #6
    //   47: getstatic v.bN : Z
    //   50: ifne -> 60
    //   53: iload #6
    //   55: ldc 524288
    //   57: ior
    //   58: istore #6
    //   60: aload_0
    //   61: new r
    //   64: dup
    //   65: aload_1
    //   66: getfield q : Ljava/lang/String;
    //   69: aconst_null
    //   70: iload #5
    //   72: getstatic v.aD : I
    //   75: iload #6
    //   77: aconst_null
    //   78: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;IIILah;)V
    //   81: putfield a : Lr;
    //   84: getstatic v.bJ : Z
    //   87: ifeq -> 160
    //   90: getstatic r.a : Ljava/lang/String;
    //   93: invokevirtual length : ()I
    //   96: ifeq -> 128
    //   99: aload_0
    //   100: getfield a : Lr;
    //   103: getstatic af.a : [Lf;
    //   106: bipush #21
    //   108: aaload
    //   109: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   112: aload_0
    //   113: getfield a : Lr;
    //   116: getstatic af.a : [Lf;
    //   119: bipush #22
    //   121: aaload
    //   122: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   125: goto -> 141
    //   128: aload_0
    //   129: getfield a : Lr;
    //   132: getstatic af.a : [Lf;
    //   135: bipush #18
    //   137: aaload
    //   138: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   141: getstatic v.bK : Z
    //   144: ifeq -> 160
    //   147: aload_0
    //   148: getfield a : Lr;
    //   151: getstatic af.a : [Lf;
    //   154: bipush #23
    //   156: aaload
    //   157: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   160: iload_3
    //   161: ifeq -> 180
    //   164: aload_0
    //   165: getfield a : Lr;
    //   168: getstatic af.a : [Lf;
    //   171: bipush #10
    //   173: aaload
    //   174: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   177: goto -> 193
    //   180: aload_0
    //   181: getfield a : Lr;
    //   184: getstatic af.a : [Lf;
    //   187: bipush #36
    //   189: aaload
    //   190: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   193: iload_2
    //   194: ifeq -> 242
    //   197: getstatic v.bL : Z
    //   200: ifeq -> 242
    //   203: aload_0
    //   204: getfield a : Lr;
    //   207: getstatic af.a : [Lf;
    //   210: bipush #27
    //   212: aaload
    //   213: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   216: aload_0
    //   217: getfield a : Lr;
    //   220: getstatic af.a : [Lf;
    //   223: bipush #28
    //   225: aaload
    //   226: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   229: aload_0
    //   230: getfield a : Lr;
    //   233: getstatic af.a : [Lf;
    //   236: bipush #29
    //   238: aaload
    //   239: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   242: aload_0
    //   243: getfield a : Lr;
    //   246: getstatic af.a : [Lf;
    //   249: bipush #30
    //   251: aaload
    //   252: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   255: getstatic v.bP : Z
    //   258: ifeq -> 274
    //   261: aload_0
    //   262: getfield a : Lr;
    //   265: getstatic af.a : [Lf;
    //   268: bipush #24
    //   270: aaload
    //   271: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   274: getstatic v.bQ : Z
    //   277: ifeq -> 293
    //   280: aload_0
    //   281: getfield a : Lr;
    //   284: getstatic af.a : [Lf;
    //   287: bipush #45
    //   289: aaload
    //   290: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   293: getstatic v.bR : Z
    //   296: ifeq -> 325
    //   299: aload_0
    //   300: getfield a : Lr;
    //   303: getstatic af.a : [Lf;
    //   306: bipush #25
    //   308: aaload
    //   309: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   312: aload_0
    //   313: getfield a : Lr;
    //   316: getstatic af.a : [Lf;
    //   319: bipush #26
    //   321: aaload
    //   322: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   325: aload_0
    //   326: getfield a : Lr;
    //   329: getstatic af.a : [Lf;
    //   332: bipush #12
    //   334: aaload
    //   335: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   338: aload_0
    //   339: getfield a : Lr;
    //   342: getstatic af.a : [Lf;
    //   345: bipush #11
    //   347: aaload
    //   348: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   351: aload_0
    //   352: getfield a : Lr;
    //   355: aload_0
    //   356: getfield a : Laf;
    //   359: invokevirtual setCommandListener : (Ljavax/microedition/lcdui/CommandListener;)V
    //   362: iload_3
    //   363: ifne -> 524
    //   366: iload_2
    //   367: ifeq -> 374
    //   370: iconst_0
    //   371: goto -> 385
    //   374: aload_1
    //   375: getfield c : La;
    //   378: getfield t : I
    //   381: iconst_0
    //   382: invokestatic a : (II)I
    //   385: aload_1
    //   386: getfield c : La;
    //   389: iconst_1
    //   390: iload_2
    //   391: ifeq -> 399
    //   394: ldc 2147483647
    //   396: goto -> 401
    //   399: iload #5
    //   401: aconst_null
    //   402: iconst_0
    //   403: iconst_0
    //   404: iconst_0
    //   405: invokestatic a : (ILa;ZILjava/lang/String;ZZZ)Ljava/util/Vector;
    //   408: dup
    //   409: astore_3
    //   410: ifnull -> 422
    //   413: aload_3
    //   414: invokevirtual size : ()I
    //   417: dup
    //   418: istore_1
    //   419: ifge -> 423
    //   422: return
    //   423: new java/lang/StringBuffer
    //   426: dup
    //   427: iconst_0
    //   428: invokespecial <init> : (I)V
    //   431: astore #4
    //   433: iconst_0
    //   434: istore #6
    //   436: iload #6
    //   438: iload_1
    //   439: if_icmpge -> 463
    //   442: aload #4
    //   444: aload_3
    //   445: iload #6
    //   447: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   450: checkcast java/lang/String
    //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   456: pop
    //   457: iinc #6, 1
    //   460: goto -> 436
    //   463: iload_2
    //   464: ifeq -> 473
    //   467: getstatic v.bL : Z
    //   470: ifne -> 490
    //   473: aload #4
    //   475: invokevirtual length : ()I
    //   478: iload #5
    //   480: if_icmple -> 490
    //   483: aload #4
    //   485: iload #5
    //   487: invokevirtual setLength : (I)V
    //   490: aload_0
    //   491: getfield a : Lr;
    //   494: aload #4
    //   496: invokevirtual toString : ()Ljava/lang/String;
    //   499: invokevirtual a : (Ljava/lang/String;)V
    //   502: goto -> 840
    //   505: pop
    //   506: getstatic r.a : I
    //   509: iconst_1
    //   510: ishr
    //   511: dup
    //   512: putstatic v.aC : I
    //   515: putstatic v.aD : I
    //   518: aconst_null
    //   519: invokestatic e : (Ljava/io/DataOutputStream;)Ljava/io/DataOutputStream;
    //   522: pop
    //   523: return
    //   524: aload_1
    //   525: getfield c : La;
    //   528: getfield L : Z
    //   531: ifne -> 568
    //   534: iload #4
    //   536: ifeq -> 568
    //   539: aload_1
    //   540: getfield c : La;
    //   543: getfield t : I
    //   546: iconst_0
    //   547: invokestatic a : (II)I
    //   550: aload_1
    //   551: getfield c : La;
    //   554: iconst_0
    //   555: ldc 2147483647
    //   557: aconst_null
    //   558: iconst_0
    //   559: iconst_0
    //   560: iconst_1
    //   561: invokestatic a : (ILa;ZILjava/lang/String;ZZZ)Ljava/util/Vector;
    //   564: astore_3
    //   565: goto -> 570
    //   568: aconst_null
    //   569: astore_3
    //   570: aload_1
    //   571: getfield c : La;
    //   574: getfield L : Z
    //   577: ifne -> 672
    //   580: iload #4
    //   582: ifeq -> 672
    //   585: aload_3
    //   586: ifnull -> 672
    //   589: aload_3
    //   590: invokevirtual size : ()I
    //   593: iconst_1
    //   594: if_icmpne -> 672
    //   597: aload_1
    //   598: aload_3
    //   599: iconst_0
    //   600: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   603: checkcast java/lang/String
    //   606: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   609: invokevirtual intValue : ()I
    //   612: putfield bm : I
    //   615: aload_0
    //   616: getfield a : Lr;
    //   619: new java/lang/String
    //   622: dup
    //   623: aload_1
    //   624: getfield c : [C
    //   627: aload_1
    //   628: getfield bm : I
    //   631: aload_1
    //   632: getfield c : [C
    //   635: arraylength
    //   636: aload_1
    //   637: getfield bm : I
    //   640: getstatic v.aD : I
    //   643: iadd
    //   644: if_icmple -> 653
    //   647: getstatic v.aD : I
    //   650: goto -> 663
    //   653: aload_1
    //   654: getfield c : [C
    //   657: arraylength
    //   658: aload_1
    //   659: getfield bm : I
    //   662: isub
    //   663: invokespecial <init> : ([CII)V
    //   666: invokevirtual a : (Ljava/lang/String;)V
    //   669: goto -> 840
    //   672: aload_1
    //   673: getfield c : La;
    //   676: getfield L : Z
    //   679: ifeq -> 730
    //   682: getstatic v.dk : Z
    //   685: ifeq -> 730
    //   688: aload_1
    //   689: aload_1
    //   690: invokevirtual a : ()I
    //   693: putfield bm : I
    //   696: aload_0
    //   697: getfield a : Lr;
    //   700: new java/lang/String
    //   703: dup
    //   704: aload_1
    //   705: getfield c : [C
    //   708: aload_1
    //   709: getfield bm : I
    //   712: aload_1
    //   713: invokevirtual b : ()I
    //   716: aload_1
    //   717: getfield bm : I
    //   720: isub
    //   721: invokespecial <init> : ([CII)V
    //   724: invokevirtual a : (Ljava/lang/String;)V
    //   727: goto -> 840
    //   730: aload_1
    //   731: getfield c : La;
    //   734: getfield L : Z
    //   737: ifeq -> 810
    //   740: iload #4
    //   742: ifeq -> 810
    //   745: aload_1
    //   746: aload_1
    //   747: invokevirtual a : ()I
    //   750: putfield bm : I
    //   753: aload_0
    //   754: getfield a : Lr;
    //   757: new java/lang/String
    //   760: dup
    //   761: aload_1
    //   762: getfield c : [C
    //   765: aload_1
    //   766: getfield bm : I
    //   769: aload_1
    //   770: getfield c : [C
    //   773: arraylength
    //   774: aload_1
    //   775: getfield bm : I
    //   778: getstatic v.aD : I
    //   781: iadd
    //   782: if_icmple -> 791
    //   785: getstatic v.aD : I
    //   788: goto -> 801
    //   791: aload_1
    //   792: getfield c : [C
    //   795: arraylength
    //   796: aload_1
    //   797: getfield bm : I
    //   800: isub
    //   801: invokespecial <init> : ([CII)V
    //   804: invokevirtual a : (Ljava/lang/String;)V
    //   807: goto -> 840
    //   810: aload_1
    //   811: getfield c : [C
    //   814: ifnull -> 840
    //   817: aload_1
    //   818: iconst_m1
    //   819: putfield bm : I
    //   822: aload_0
    //   823: getfield a : Lr;
    //   826: new java/lang/String
    //   829: dup
    //   830: aload_1
    //   831: getfield c : [C
    //   834: invokespecial <init> : ([C)V
    //   837: invokevirtual a : (Ljava/lang/String;)V
    //   840: aload_0
    //   841: getfield a : Laf;
    //   844: aload_0
    //   845: getfield a : Lr;
    //   848: invokevirtual e : (Lr;)V
    //   851: aload_0
    //   852: getfield a : Lr;
    //   855: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   858: return
    // Exception table:
    //   from	to	target	type
    //   490	502	505	java/lang/Throwable
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == af.a[32]) {
      this.a = null;
      v.a((Displayable)this.a);
    } 
    if (paramDisplayable instanceof List) {
      List list;
      short s = (short)(list = (List)paramDisplayable).getSelectedIndex();
      String str = "";
      if (s != -1)
        str = list.getString(s); 
      if ((paramCommand == List.SELECT_COMMAND || paramCommand == af.a[31]) && list == this.a) {
        v.aO = (short)(v.a(str.substring(0, str.indexOf('_')), 1) - 1);
        if (((af)this.a).a != null) {
          ((af)this.a).a = (j)((v)((af)this.a).a).c;
          ((v)((af)this.a).a).cq = true;
          v.g(12);
        } 
        return;
      } 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\b.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */