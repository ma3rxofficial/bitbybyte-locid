package p;

import i.C;
import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

public class PlgVkontakte extends PI implements CommandListener {
  private Form j;
  
  private Command k = new Command("Обновить VK", 8, 3);
  
  private Command l = new Command("Сохранить", 2, 3);
  
  private Vector m = new Vector();
  
  private Vector n = new Vector();
  
  public ChoiceGroup a;
  
  public StringItem b;
  
  public int[] c = new int[2];
  
  private boolean[] o = new boolean[] { true, false, true, true };
  
  private String[] p = new String[] { "", "", "", "", "" };
  
  private int[] q = new int[] { 30, 10 };
  
  private int r = 0;
  
  private String s = "http://vepurovk.xyz";
  
  private Display t;
  
  private TextField u;
  
  private TextField v;
  
  private TextField w;
  
  private TextField x;
  
  private String y = "";
  
  private boolean z = true;
  
  public int d = 0;
  
  public int e;
  
  public String f;
  
  public String g;
  
  public Object[] h = new Object[] { "300", { 1 } };
  
  public Timer i;
  
  public PlgVkontakte() {
    this.m.addElement(this.k);
    this.n.addElement(this.k);
  }
  
  public String getName() {
    return "VKontakte";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    Vector vector;
    switch (paramInt) {
      case 0:
        a(request(7, null, null));
        return null;
      case 2:
        this.t = (Display)paramObject;
        d();
        return null;
    } 
    if (!this.o[0])
      return null; 
    switch (paramInt) {
      case 19:
        return this.m;
      case 16:
        return this.n;
      case 20:
        return (paramObject instanceof C && "300".equals(paramArrayOfObject[0])) ? this.m : null;
      case 17:
        return (paramObject instanceof C && "300".equals(paramArrayOfObject[4])) ? this.n : null;
      case 21:
        if (paramObject != this.k)
          return null; 
        request(30, null, null);
        return this;
      case 18:
        if (paramObject != this.k)
          return null; 
        request(30, null, null);
        return this;
      case 22:
        if ("300".equals(paramArrayOfObject[0])) {
          if (paramArrayOfObject[1] != null) {
            String str;
            int i;
            if ((i = (str = (String)paramArrayOfObject[1]).indexOf("[") + 1) <= 0) {
              d("Error#1", "Нету [номера]:");
            } else {
              int j;
              if ((j = str.indexOf("]", i)) <= 0) {
                d("Error#2", "Нету [номера]:");
              } else {
                String str1 = str.substring(i, j);
                str = str.substring(j + 2);
                paramArrayOfObject[1] = str;
                paramArrayOfObject[2] = str1;
                request(30, paramArrayOfObject, null);
                d("Я", str);
              } 
            } 
          } 
          return new Boolean(false);
        } 
        return null;
      case 37:
        if (paramArrayOfObject == null) {
          a(false, (String)null, (String)null);
        } else {
          a(false, (String)paramArrayOfObject[2], (String)paramArrayOfObject[1]);
        } 
        return null;
      case 36:
        a(true, (String)null, (String)null);
        return null;
      case 35:
        (vector = new Vector()).addElement("300");
        return vector;
      case 4:
        if (this.o[0] && this.o[2])
          a(1000); 
        return null;
      case 39:
        if (paramObject != null && paramObject instanceof C) {
          C c = (C)paramObject;
          if ("300".equals(c.getUinString())) {
            Object[] arrayOfObject = { c.getUinString(), "" };
            request(30, arrayOfObject, paramObject);
          } 
        } 
        return null;
      case 27:
        if (paramArrayOfObject[1] == null || "".equals(paramArrayOfObject[1]) || this.y.equals(paramArrayOfObject[1]))
          if (paramArrayOfObject[2] != null && "300".equals(paramArrayOfObject[2]) && paramArrayOfObject[3] != null && (paramArrayOfObject[4] == null || "".equals(paramArrayOfObject[4]))) {
            String str;
            if ((str = ((String[])paramArrayOfObject[3])[0]) != null) {
              String str1 = d(str);
              if (this.y.equals(paramArrayOfObject[1]))
                paramArrayOfObject[1] = ""; 
              if (str1 != null && !"".equals(str1) && !str1.startsWith("AutoREQ") && !str1.startsWith("Req")) {
                this.y = str1 + " ";
                paramArrayOfObject[4] = this.y;
              } 
            } 
          } else if (this.y.equals(paramArrayOfObject[1])) {
            paramArrayOfObject[1] = "";
          }  
        return null;
    } 
    return null;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield f : Ljava/lang/String;
    //   5: aload_0
    //   6: aconst_null
    //   7: putfield g : Ljava/lang/String;
    //   10: aload_0
    //   11: aconst_null
    //   12: putfield f : Ljava/lang/String;
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield e : I
    //   20: aconst_null
    //   21: astore #4
    //   23: aconst_null
    //   24: astore #5
    //   26: aconst_null
    //   27: astore #6
    //   29: aload_0
    //   30: iconst_4
    //   31: putfield d : I
    //   34: aload_1
    //   35: iconst_3
    //   36: iconst_0
    //   37: invokestatic open : (Ljava/lang/String;IZ)Ljavax/microedition/io/Connection;
    //   40: checkcast javax/microedition/io/HttpConnection
    //   43: astore #4
    //   45: aload_0
    //   46: iconst_5
    //   47: putfield d : I
    //   50: aload #4
    //   52: aload_3
    //   53: invokeinterface setRequestMethod : (Ljava/lang/String;)V
    //   58: aload_2
    //   59: ldc_w 'utf-8'
    //   62: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   65: astore #7
    //   67: aload #4
    //   69: ldc 'User-Agent'
    //   71: ldc 'Mozilla/5.0 (Windows; U; Windows NT 5.1; ru; rv:1.9.0.10) Gecko/2009042316 Firefox/3.0.10'
    //   73: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload #4
    //   80: ldc 'Accept'
    //   82: ldc_w 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8,text/vnd.wap.wml;q=0.6'
    //   85: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   90: aload #4
    //   92: ldc 'Accept-Language'
    //   94: ldc_w 'ru,en-us;q=0.7,en;q=0.3'
    //   97: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload #4
    //   104: ldc 'Accept-Charset'
    //   106: ldc_w 'windows-1251,utf-8;q=0.7,*;q=0.7'
    //   109: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   114: aload #4
    //   116: ldc 'Keep-Alive'
    //   118: ldc '300'
    //   120: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   125: aload #4
    //   127: ldc 'Proxy-Connection'
    //   129: ldc_w 'keep-alive'
    //   132: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   137: aload #4
    //   139: ldc 'Cookie'
    //   141: aload_0
    //   142: getfield p : [Ljava/lang/String;
    //   145: iconst_2
    //   146: aaload
    //   147: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   152: aload #4
    //   154: ldc 'Content-Length'
    //   156: new java/lang/StringBuffer
    //   159: dup
    //   160: invokespecial <init> : ()V
    //   163: ldc ''
    //   165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   168: aload #7
    //   170: arraylength
    //   171: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   174: invokevirtual toString : ()Ljava/lang/String;
    //   177: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   182: aload #4
    //   184: ldc 'Content-Type'
    //   186: ldc 'application/x-www-form-urlencoded'
    //   188: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   193: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   196: new java/lang/StringBuffer
    //   199: dup
    //   200: invokespecial <init> : ()V
    //   203: ldc 'Sent url: '
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   208: aload_1
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   212: invokevirtual toString : ()Ljava/lang/String;
    //   215: invokevirtual println : (Ljava/lang/String;)V
    //   218: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   221: new java/lang/StringBuffer
    //   224: dup
    //   225: invokespecial <init> : ()V
    //   228: ldc 'Sent cookie: '
    //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   233: aload_0
    //   234: getfield p : [Ljava/lang/String;
    //   237: iconst_2
    //   238: aaload
    //   239: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   242: invokevirtual toString : ()Ljava/lang/String;
    //   245: invokevirtual println : (Ljava/lang/String;)V
    //   248: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   251: new java/lang/StringBuffer
    //   254: dup
    //   255: invokespecial <init> : ()V
    //   258: ldc 'Sent content: '
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   263: aload_2
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   267: invokevirtual toString : ()Ljava/lang/String;
    //   270: invokevirtual println : (Ljava/lang/String;)V
    //   273: aconst_null
    //   274: astore #6
    //   276: aload_0
    //   277: bipush #6
    //   279: putfield d : I
    //   282: aload #4
    //   284: invokeinterface openOutputStream : ()Ljava/io/OutputStream;
    //   289: astore #6
    //   291: aload_0
    //   292: bipush #7
    //   294: putfield d : I
    //   297: aload #6
    //   299: aload #7
    //   301: invokevirtual write : ([B)V
    //   304: aload_1
    //   305: invokevirtual length : ()I
    //   308: bipush #50
    //   310: iadd
    //   311: aload #7
    //   313: arraylength
    //   314: iadd
    //   315: istore #8
    //   317: aload_0
    //   318: iconst_0
    //   319: iload #8
    //   321: invokespecial a : (II)V
    //   324: aload_0
    //   325: dup
    //   326: getfield r : I
    //   329: iload #8
    //   331: iadd
    //   332: putfield r : I
    //   335: aload_0
    //   336: bipush #8
    //   338: putfield d : I
    //   341: aload #6
    //   343: ifnull -> 351
    //   346: aload #6
    //   348: invokevirtual close : ()V
    //   351: goto -> 355
    //   354: pop
    //   355: aload_0
    //   356: bipush #9
    //   358: putfield d : I
    //   361: aload #4
    //   363: invokeinterface openInputStream : ()Ljava/io/InputStream;
    //   368: astore #5
    //   370: aload_0
    //   371: bipush #10
    //   373: putfield d : I
    //   376: aload_0
    //   377: aload #4
    //   379: invokeinterface getResponseCode : ()I
    //   384: putfield e : I
    //   387: aconst_null
    //   388: astore #9
    //   390: iconst_0
    //   391: istore #11
    //   393: aload #4
    //   395: iload #11
    //   397: invokeinterface getHeaderFieldKey : (I)Ljava/lang/String;
    //   402: dup
    //   403: astore #10
    //   405: ifnull -> 517
    //   408: ldc_w 'set-cookie'
    //   411: aload #10
    //   413: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   416: invokevirtual equals : (Ljava/lang/Object;)Z
    //   419: ifeq -> 511
    //   422: aload #9
    //   424: ifnonnull -> 431
    //   427: ldc ''
    //   429: astore #9
    //   431: aload #4
    //   433: iload #11
    //   435: invokeinterface getHeaderField : (I)Ljava/lang/String;
    //   440: dup
    //   441: astore #12
    //   443: ifnull -> 511
    //   446: aload #12
    //   448: bipush #59
    //   450: invokevirtual indexOf : (I)I
    //   453: iflt -> 511
    //   456: new java/lang/StringBuffer
    //   459: dup
    //   460: invokespecial <init> : ()V
    //   463: aload #12
    //   465: iconst_0
    //   466: aload #12
    //   468: bipush #59
    //   470: invokevirtual indexOf : (I)I
    //   473: invokevirtual substring : (II)Ljava/lang/String;
    //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   479: ldc '; '
    //   481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   484: invokevirtual toString : ()Ljava/lang/String;
    //   487: astore #12
    //   489: new java/lang/StringBuffer
    //   492: dup
    //   493: invokespecial <init> : ()V
    //   496: aload #9
    //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   501: aload #12
    //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   506: invokevirtual toString : ()Ljava/lang/String;
    //   509: astore #9
    //   511: iinc #11, 1
    //   514: goto -> 393
    //   517: aload #9
    //   519: ifnull -> 641
    //   522: aload_0
    //   523: getfield p : [Ljava/lang/String;
    //   526: iconst_2
    //   527: aload #9
    //   529: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   532: aastore
    //   533: aload_0
    //   534: getfield p : [Ljava/lang/String;
    //   537: iconst_2
    //   538: aaload
    //   539: dup
    //   540: astore #9
    //   542: ldc_w 'remixmid='
    //   545: invokevirtual indexOf : (Ljava/lang/String;)I
    //   548: dup
    //   549: istore #11
    //   551: iflt -> 641
    //   554: aload #9
    //   556: ldc ';'
    //   558: iload #11
    //   560: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   563: istore #12
    //   565: aload_0
    //   566: getfield p : [Ljava/lang/String;
    //   569: iconst_4
    //   570: aload #9
    //   572: iload #11
    //   574: bipush #9
    //   576: iadd
    //   577: iload #12
    //   579: invokevirtual substring : (II)Ljava/lang/String;
    //   582: aastore
    //   583: aload_0
    //   584: getfield z : Z
    //   587: ifeq -> 641
    //   590: aload_0
    //   591: getfield p : [Ljava/lang/String;
    //   594: iconst_4
    //   595: aaload
    //   596: invokevirtual length : ()I
    //   599: iconst_3
    //   600: if_icmple -> 641
    //   603: aload_0
    //   604: iconst_0
    //   605: putfield z : Z
    //   608: aload_0
    //   609: bipush #27
    //   611: aconst_null
    //   612: new java/lang/StringBuffer
    //   615: dup
    //   616: invokespecial <init> : ()V
    //   619: ldc_w '|VK'
    //   622: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   625: aload_0
    //   626: getfield p : [Ljava/lang/String;
    //   629: iconst_4
    //   630: aaload
    //   631: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   634: invokevirtual toString : ()Ljava/lang/String;
    //   637: invokevirtual request : (I[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   640: pop
    //   641: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   644: new java/lang/StringBuffer
    //   647: dup
    //   648: invokespecial <init> : ()V
    //   651: ldc 'New cookie: '
    //   653: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   656: aload #9
    //   658: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   661: invokevirtual toString : ()Ljava/lang/String;
    //   664: invokevirtual println : (Ljava/lang/String;)V
    //   667: aload_0
    //   668: aload #4
    //   670: ldc_w 'location'
    //   673: invokeinterface getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   678: putfield g : Ljava/lang/String;
    //   681: aload_0
    //   682: getfield e : I
    //   685: sipush #200
    //   688: if_icmpeq -> 768
    //   691: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   694: new java/lang/StringBuffer
    //   697: dup
    //   698: invokespecial <init> : ()V
    //   701: ldc 'EndReq: '
    //   703: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   706: aload_1
    //   707: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   710: ldc ' ['
    //   712: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   715: aload_0
    //   716: getfield e : I
    //   719: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   722: ldc ']'
    //   724: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   727: invokevirtual toString : ()Ljava/lang/String;
    //   730: invokevirtual println : (Ljava/lang/String;)V
    //   733: aload #5
    //   735: ifnull -> 743
    //   738: aload #5
    //   740: invokevirtual close : ()V
    //   743: aload #6
    //   745: ifnull -> 753
    //   748: aload #6
    //   750: invokevirtual close : ()V
    //   753: aload #4
    //   755: ifnull -> 765
    //   758: aload #4
    //   760: invokeinterface close : ()V
    //   765: return
    //   766: pop
    //   767: return
    //   768: aload #4
    //   770: invokeinterface getType : ()Ljava/lang/String;
    //   775: pop
    //   776: aconst_null
    //   777: astore #11
    //   779: aload #4
    //   781: invokeinterface getLength : ()J
    //   786: l2i
    //   787: istore #12
    //   789: aload_0
    //   790: bipush #11
    //   792: putfield d : I
    //   795: sipush #1024
    //   798: istore #14
    //   800: iload #12
    //   802: bipush #10
    //   804: if_icmple -> 813
    //   807: iload #12
    //   809: iconst_1
    //   810: iadd
    //   811: istore #14
    //   813: iload #14
    //   815: newarray byte
    //   817: astore #13
    //   819: iconst_0
    //   820: istore #15
    //   822: aload_0
    //   823: bipush #12
    //   825: putfield d : I
    //   828: aload #5
    //   830: invokevirtual read : ()I
    //   833: dup
    //   834: istore #16
    //   836: iconst_m1
    //   837: if_icmpeq -> 868
    //   840: iload #15
    //   842: aload #13
    //   844: arraylength
    //   845: if_icmpge -> 868
    //   848: aload_0
    //   849: bipush #13
    //   851: putfield d : I
    //   854: aload #13
    //   856: iload #15
    //   858: iinc #15, 1
    //   861: iload #16
    //   863: i2b
    //   864: bastore
    //   865: goto -> 828
    //   868: iload #15
    //   870: aload #13
    //   872: arraylength
    //   873: if_icmpne -> 941
    //   876: aload_0
    //   877: bipush #14
    //   879: putfield d : I
    //   882: aload #13
    //   884: arraylength
    //   885: aload #13
    //   887: arraylength
    //   888: iadd
    //   889: newarray byte
    //   891: astore #17
    //   893: aload #13
    //   895: iconst_0
    //   896: aload #17
    //   898: iconst_0
    //   899: aload #13
    //   901: arraylength
    //   902: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   905: aload #17
    //   907: astore #13
    //   909: iload #16
    //   911: iconst_m1
    //   912: if_icmpeq -> 926
    //   915: aload #13
    //   917: iload #15
    //   919: iinc #15, 1
    //   922: iload #16
    //   924: i2b
    //   925: bastore
    //   926: aload_0
    //   927: bipush #15
    //   929: putfield d : I
    //   932: aload_0
    //   933: bipush #16
    //   935: putfield d : I
    //   938: goto -> 828
    //   941: aload_0
    //   942: bipush #78
    //   944: putfield d : I
    //   947: aload_0
    //   948: iload #15
    //   950: bipush #20
    //   952: iadd
    //   953: iconst_0
    //   954: invokespecial a : (II)V
    //   957: aload_0
    //   958: dup
    //   959: getfield r : I
    //   962: iload #15
    //   964: bipush #20
    //   966: iadd
    //   967: iadd
    //   968: putfield r : I
    //   971: iload #15
    //   973: newarray byte
    //   975: astore #17
    //   977: aload #13
    //   979: iconst_0
    //   980: aload #17
    //   982: iconst_0
    //   983: iload #15
    //   985: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   988: aload_0
    //   989: bipush #17
    //   991: putfield d : I
    //   994: aload_0
    //   995: bipush #18
    //   997: putfield d : I
    //   1000: aload_0
    //   1001: new java/lang/String
    //   1004: dup
    //   1005: aload #17
    //   1007: ldc_w 'utf-8'
    //   1010: invokespecial <init> : ([BLjava/lang/String;)V
    //   1013: putfield f : Ljava/lang/String;
    //   1016: aload_0
    //   1017: sipush #181
    //   1020: putfield d : I
    //   1023: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1026: new java/lang/StringBuffer
    //   1029: dup
    //   1030: invokespecial <init> : ()V
    //   1033: ldc '"'
    //   1035: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1038: aload_0
    //   1039: getfield f : Ljava/lang/String;
    //   1042: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1045: ldc '"'
    //   1047: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1050: invokevirtual toString : ()Ljava/lang/String;
    //   1053: invokevirtual println : (Ljava/lang/String;)V
    //   1056: aload_0
    //   1057: bipush #19
    //   1059: putfield d : I
    //   1062: goto -> 1157
    //   1065: dup
    //   1066: astore #18
    //   1068: invokevirtual printStackTrace : ()V
    //   1071: aload_0
    //   1072: aload_0
    //   1073: getfield d : I
    //   1076: ineg
    //   1077: putfield e : I
    //   1080: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1083: new java/lang/StringBuffer
    //   1086: dup
    //   1087: invokespecial <init> : ()V
    //   1090: ldc 'EndReq: '
    //   1092: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1095: aload_1
    //   1096: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1099: ldc ' ['
    //   1101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1104: aload_0
    //   1105: getfield e : I
    //   1108: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1111: ldc ']'
    //   1113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1116: invokevirtual toString : ()Ljava/lang/String;
    //   1119: invokevirtual println : (Ljava/lang/String;)V
    //   1122: aload #5
    //   1124: ifnull -> 1132
    //   1127: aload #5
    //   1129: invokevirtual close : ()V
    //   1132: aload #6
    //   1134: ifnull -> 1142
    //   1137: aload #6
    //   1139: invokevirtual close : ()V
    //   1142: aload #4
    //   1144: ifnull -> 1154
    //   1147: aload #4
    //   1149: invokeinterface close : ()V
    //   1154: return
    //   1155: pop
    //   1156: return
    //   1157: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1160: new java/lang/StringBuffer
    //   1163: dup
    //   1164: invokespecial <init> : ()V
    //   1167: ldc 'EndReq: '
    //   1169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1172: aload_1
    //   1173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1176: ldc ' ['
    //   1178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1181: aload_0
    //   1182: getfield e : I
    //   1185: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1188: ldc ']'
    //   1190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1193: invokevirtual toString : ()Ljava/lang/String;
    //   1196: invokevirtual println : (Ljava/lang/String;)V
    //   1199: aload #5
    //   1201: ifnull -> 1209
    //   1204: aload #5
    //   1206: invokevirtual close : ()V
    //   1209: aload #6
    //   1211: ifnull -> 1219
    //   1214: aload #6
    //   1216: invokevirtual close : ()V
    //   1219: aload #4
    //   1221: ifnull -> 1231
    //   1224: aload #4
    //   1226: invokeinterface close : ()V
    //   1231: return
    //   1232: pop
    //   1233: return
    //   1234: dup
    //   1235: astore #7
    //   1237: invokevirtual printStackTrace : ()V
    //   1240: aload_0
    //   1241: aload_0
    //   1242: getfield d : I
    //   1245: ineg
    //   1246: putfield e : I
    //   1249: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1252: new java/lang/StringBuffer
    //   1255: dup
    //   1256: invokespecial <init> : ()V
    //   1259: ldc 'EndReq: '
    //   1261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1264: aload_1
    //   1265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1268: ldc ' ['
    //   1270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1273: aload_0
    //   1274: getfield e : I
    //   1277: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1280: ldc ']'
    //   1282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1285: invokevirtual toString : ()Ljava/lang/String;
    //   1288: invokevirtual println : (Ljava/lang/String;)V
    //   1291: aload #5
    //   1293: ifnull -> 1301
    //   1296: aload #5
    //   1298: invokevirtual close : ()V
    //   1301: aload #6
    //   1303: ifnull -> 1311
    //   1306: aload #6
    //   1308: invokevirtual close : ()V
    //   1311: aload #4
    //   1313: ifnull -> 1323
    //   1316: aload #4
    //   1318: invokeinterface close : ()V
    //   1323: return
    //   1324: pop
    //   1325: return
    //   1326: astore #20
    //   1328: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1331: new java/lang/StringBuffer
    //   1334: dup
    //   1335: invokespecial <init> : ()V
    //   1338: ldc 'EndReq: '
    //   1340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1343: aload_1
    //   1344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1347: ldc ' ['
    //   1349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1352: aload_0
    //   1353: getfield e : I
    //   1356: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1359: ldc ']'
    //   1361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1364: invokevirtual toString : ()Ljava/lang/String;
    //   1367: invokevirtual println : (Ljava/lang/String;)V
    //   1370: aload #5
    //   1372: ifnull -> 1380
    //   1375: aload #5
    //   1377: invokevirtual close : ()V
    //   1380: aload #6
    //   1382: ifnull -> 1390
    //   1385: aload #6
    //   1387: invokevirtual close : ()V
    //   1390: aload #4
    //   1392: ifnull -> 1402
    //   1395: aload #4
    //   1397: invokeinterface close : ()V
    //   1402: goto -> 1406
    //   1405: pop
    //   1406: aload #20
    //   1408: athrow
    // Exception table:
    //   from	to	target	type
    //   29	691	1234	java/lang/Exception
    //   29	691	1326	finally
    //   341	351	354	java/lang/Throwable
    //   733	765	766	java/io/IOException
    //   768	1080	1234	java/lang/Exception
    //   768	1080	1326	finally
    //   994	1062	1065	java/lang/Exception
    //   1122	1154	1155	java/io/IOException
    //   1199	1231	1232	java/io/IOException
    //   1234	1249	1326	finally
    //   1291	1323	1324	java/io/IOException
    //   1326	1328	1326	finally
    //   1370	1402	1405	java/io/IOException
  }
  
  private void a(int paramInt1, int paramInt2) {
    this.c[0] = paramInt1;
    this.c[1] = paramInt2;
    request(32, null, this.c);
  }
  
  private static String a(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      if ("@#$%&? /\\\r\n:".indexOf(c) >= 0) {
        String str;
        if ((str = Integer.toHexString(c)).length() < 2)
          str = "0" + str; 
        stringBuffer.append("%" + str);
      } else {
        stringBuffer.append(c);
      } 
    } 
    return stringBuffer.toString();
  }
  
  public final void a(boolean paramBoolean, String paramString1, String paramString2) {
    Thread thread;
    int i = (thread = Thread.currentThread()).getPriority();
    thread.setPriority(1);
    if (this.p[1] == null || this.p[1].equals("")) {
      d("REQ", "No password " + this.p[0]);
      return;
    } 
    try {
      if (this.o[1])
        d("REQ", "start " + this.p[0]); 
      b();
      if (paramString1 != null) {
        b(this.s + "?act=write&to=" + paramString1, "", "GET");
        if (this.e != 200)
          throw new Exception("ErrSent " + this.e); 
        int j;
        if ((j = this.f.indexOf("name=\"chas\" value=\"") + 19) < 30)
          throw new Exception("ErrChas"); 
        String str1 = this.f.substring(j, this.f.indexOf("\"", j));
        String str2 = "to_id=" + paramString1 + "&" + "to_reply=0&" + "chas=" + str1 + "&" + "title=&" + "message=" + a(paramString2);
        b(this.s + "mailsent?pda=1", str2, "POST");
        if (this.f == null || this.f.length() < 200) {
          c(this.f);
          d("Не Отправлено [" + paramString1 + "]:", paramString2);
        } else {
          paramString1 = null;
          b("Отправлено:", paramString2);
        } 
      } else {
        b(this.s + "inbox", "", "GET");
      } 
      if (paramString1 == null) {
        String[] arrayOfString1;
        String[] arrayOfString2 = new String[(arrayOfString1 = a(this.f, "<a href=\"/letter")).length - 1];
        for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
          String str;
          int j;
          if ((j = (str = arrayOfString1[b1 + 1]).indexOf('?')) > 0) {
            str = e(str.substring(0, j));
            arrayOfString2[b1] = str;
            System.out.println("find message:" + str);
          } 
        } 
        byte b2;
        for (b2 = 0; b2 < arrayOfString2.length && this.p[3].indexOf(arrayOfString2[b2]) < 0; b2++);
        while (--b2 >= 0) {
          String str = arrayOfString2[b2--];
          b(this.s + "letter" + str + "?", "", "GET");
          int j;
          if ((j = this.f.indexOf(":</span> <a href=\"id")) >= 0) {
            int k = this.f.indexOf("id", j) + 2;
            int m = this.f.indexOf("\"", k);
            String str1 = e(this.f.substring(k, m));
            int n = m + 2;
            int i1 = this.f.indexOf("</a>", n);
            String str2 = e(this.f.substring(n, i1));
            int i2 = this.f.indexOf("</span>", i1) + 6;
            i2 = this.f.indexOf("</span>", i2) + 7;
            int i3 = this.f.indexOf("<br/>", i2);
            String str3 = e(this.f.substring(i2, i3));
            int i4 = this.f.indexOf("</span>", i3) + 7;
            int i5 = this.f.indexOf("<br/>", i4);
            String str4 = e(this.f.substring(i4, i5));
            int i6 = i5 + 10;
            int i7 = this.f.indexOf("<span", i6);
            String str5 = e(this.f.substring(i6, i7));
            str2 = b((String)request(42, null, str2));
            str5 = b((String)request(42, null, str5));
            c(str2 + " [" + str1 + "]" + str3, str4 + "\n" + str5);
            System.out.println("name:" + str2);
            System.out.println("id:" + str1);
            System.out.println("dateS:" + str3);
            System.out.println("themeS:" + str4);
            System.out.println("msgS:" + str5);
          } 
          this.p[3] = this.p[3] + "%" + str;
          if (this.p[3].length() > 200)
            this.p[3] = this.p[3].substring(50); 
        } 
      } 
      c();
      if (this.o[1])
        d("REQ", "finish"); 
      System.out.println("End req");
      a(paramBoolean);
      return;
    } catch (Exception exception) {
      a(paramBoolean);
      c("" + exception.getMessage() + " " + exception.getClass().getName());
      a();
      return;
    } finally {
      thread.setPriority(i);
    } 
  }
  
  private static String b(String paramString) {
    return paramString.trim();
  }
  
  private static String[] a(String paramString1, String paramString2) {
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
  
  private void a() {
    request(37, this.h, null);
  }
  
  private void b(String paramString1, String paramString2) {
    a(paramString1, paramString2, null, false, false, false);
  }
  
  private void c(String paramString1, String paramString2) {
    a(paramString1, paramString2, null, true, false, false);
  }
  
  private void d(String paramString1, String paramString2) {
    a(paramString1, paramString2, null, true, true, true);
  }
  
  private void c(String paramString) {
    a("Error", paramString, null, true, true, true);
  }
  
  public final void a(String paramString1, String paramString2, I paramI, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    (new String[3])[0] = "300";
    (new String[3])[1] = paramString1;
    (new String[3])[2] = paramString2;
    (new Object[4])[0] = new String[3];
    (new int[2])[0] = 0;
    (new int[2])[1] = (!paramBoolean2 ? true : false) | (paramBoolean1 ? true : false);
    (new Object[4])[1] = new int[2];
    (new long[1])[0] = 0L;
    request(38, new Object[] { null, null, paramBoolean3 ? new long[1] : null, paramI }, null);
    a();
  }
  
  private void b(String paramString1, String paramString2, String paramString3) throws Exception {
    if (this.o[1])
      d("GetData", "inbox " + paramString1); 
    a(paramString1, paramString2, paramString3);
    if (this.e != 200 && this.e != 302)
      throw new Exception("Error " + this.e); 
    if (this.e == 302 && "/inbox?sent=1".equals(this.g)) {
      if (this.o[1])
        d("GetData", "inbox3 " + paramString1); 
      a(this.s + this.g.substring(1), "", "GET");
      if (this.e != 200)
        throw new Exception("Error Sending"); 
    } else if (this.e == 302 || (this.f != null && this.f.indexOf("type=\"password\"") > 0)) {
      if (this.o[1])
        d("GetData", "login"); 
      String str = (String)request(41, (Object[])new String[] { this.p[0], "@", "%40" }, null);
      a(this.s + "login?pda=inbox", "email=" + str + "&pass=" + this.p[1], "POST");
      if (this.e == 200)
        throw new Exception("Error BadPassword"); 
      if (this.e == 302) {
        if (this.o[1])
          d("GetData", "inbox2 " + paramString1); 
        a(paramString1, paramString2, paramString3);
        if (this.e != 200)
          throw new Exception("Error " + this.e + " Bad Password?"); 
      } else {
        throw new Exception("Error " + this.e);
      } 
    } 
  }
  
  private void a(boolean paramBoolean) {
    if (this.o[0]) {
      int i;
      if ((i = this.q[0] * 60 * 1000) == 0)
        i = paramBoolean ? 300000 : 1800000; 
      if (i == -1)
        i = paramBoolean ? 300000 : 900000; 
      a(i);
    } 
  }
  
  private void b() {
    if (this.i != null) {
      this.i.cancel();
      this.i = null;
    } 
  }
  
  public final void a(int paramInt) {
    Object[] arrayOfObject = { "300", "" };
    arrayOfObject = new Object[] { new Long(paramInt), new Long(0L), arrayOfObject };
    b();
    if (this.o[1])
      d("AutoREQ", "time: " + (paramInt / 60 / 1000) + "min"); 
    this.i = (Timer)request(31, arrayOfObject, null);
  }
  
  private static String d(String paramString) {
    int i;
    if ((i = paramString.indexOf("]")) >= 0) {
      paramString = paramString.substring(0, i).trim() + "]:";
    } else {
      paramString = "Впишите\n[номер_контакта]: ваше сообщение.";
    } 
    return paramString;
  }
  
  private static String e(String paramString) {
    return (new StringBuffer(paramString.length())).append(paramString).toString();
  }
  
  private void a(Object paramObject) {
    try {
      if (paramObject == null)
        throw new Exception(); 
      DataInputStream dataInputStream;
      int i = (dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject))).readUnsignedByte();
      byte b;
      for (b = 0; b < i; b++)
        this.o[b] = dataInputStream.readBoolean(); 
      i = dataInputStream.readUnsignedByte();
      for (b = 0; b < i; b++)
        this.p[b] = dataInputStream.readUTF(); 
      i = dataInputStream.readUnsignedByte();
      for (b = 0; b < i; b++)
        this.q[b] = dataInputStream.readInt(); 
      String str;
      int j;
      if (this.p[4].length() < 4 && (j = (str = this.p[2]).indexOf("remixmid=")) >= 0) {
        int k = str.indexOf(";", j);
        this.p[4] = str.substring(j + 9, k);
        if (this.z && this.p[4].length() > 3) {
          this.z = false;
          request(27, null, "|VK" + this.p[4]);
        } 
      } 
      if (this.z && this.p[4].length() > 3) {
        this.z = false;
        request(27, null, "VK" + this.p[4]);
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private synchronized void c() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(this.o.length);
      byte b;
      for (b = 0; b < this.o.length; b++)
        dataOutputStream.writeBoolean(this.o[b]); 
      dataOutputStream.writeByte(this.p.length);
      for (b = 0; b < this.p.length; b++)
        dataOutputStream.writeUTF(this.p[b]); 
      dataOutputStream.writeByte(this.q.length);
      for (b = 0; b < this.q.length; b++)
        dataOutputStream.writeInt(this.q[b]); 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.l) {
      this.a.getSelectedFlags(this.o);
      boolean bool = false;
      if (!this.p[0].equals(this.w.getString()) || !this.p[1].equals(this.x.getString()))
        bool = true; 
      this.p[0] = this.w.getString();
      this.p[1] = this.x.getString();
      if (bool)
        this.p[2] = ""; 
      c();
      int i = Integer.parseInt(this.v.getString());
      int j = Integer.parseInt(this.u.getString());
      this.q[0] = i;
      this.q[1] = j;
      request(1, null, new Integer(0));
    } 
  }
  
  private synchronized void d() {
    if (this.j == null) {
      this.j = new Form("VKontakte.ru");
      this.j.addCommand(this.l);
      this.x = new TextField("Пароль:", "", 20, 0);
      this.u = new TextField("Колво сообщений в историю:", "0", 20, 2);
      this.w = new TextField("Email:", "", 40, 1);
      this.v = new TextField("Автозапрос мин:", "100", 40, 2);
      this.a = new ChoiceGroup("Опции:", 2, new String[] { "Активировать", "Логировать запросы", "Автозапрос", "+ только когда онлайн" }, null);
      this.j.setCommandListener(this);
      this.b = new StringItem("Трафик:", "" + (this.r / 1024) + "k");
      this.j.append((Item)this.a);
      this.j.append((Item)this.w);
      this.j.append((Item)this.x);
      this.j.append((Item)this.u);
      this.j.append((Item)this.v);
      this.j.append((Item)this.b);
    } 
    this.a.setSelectedFlags(this.o);
    if (this.r < 11000) {
      this.b.setText("" + this.r + " bytes");
    } else {
      this.b.setText("" + (this.r / 1024) + " kb");
    } 
    this.x.setString(this.p[1]);
    this.w.setString(this.p[0]);
    this.v.setString("" + this.q[0]);
    this.u.setString("" + this.q[1]);
    this.t.setCurrent((Displayable)this.j);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgVkontakte.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */