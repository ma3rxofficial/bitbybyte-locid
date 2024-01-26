package p;

import i.PI;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;

public class PlgSms extends PI implements CommandListener {
  public String a = "http://sms.owap.biz/";
  
  public String b;
  
  private List k;
  
  private Form l;
  
  private Command m = new Command("Назад", 2, 2);
  
  private Command n = new Command("Выбор", 4, 1);
  
  private Command o = new Command("Отправить", 4, 1);
  
  private Display p;
  
  private Vector q = new Vector();
  
  private TextField r;
  
  private TextField s;
  
  private TextField t;
  
  private String u = "";
  
  public String c;
  
  public String d;
  
  public String e;
  
  public String f;
  
  public String g;
  
  public byte[] h;
  
  public int i;
  
  public int j = 0;
  
  public String getName() {
    return "Бесплатные SMS";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 39 || paramInt == 2) {
      a((Display)paramObject);
    } else if (paramInt == 37) {
      if (paramObject == null) {
        String str1 = "&";
        String str2 = "";
        if (this.b != null)
          str2 = str2 + "code=" + this.r.getString() + str1; 
        str2 = str2 + "phone=" + this.s.getString() + str1;
        this.u = this.s.getString();
        if (this.e != null)
          str2 = str2 + this.e + "=" + this.d + str1; 
        str2 = str2 + "text=" + a(this.t.getString());
        a(this.a + this.c, str2, "POST", 0, false);
        String str3;
        if ((str3 = a("<div>", "<", 0)) == null)
          str3 = a("Ошибка!", "<", 0); 
        if (str3 == null)
          str3 = a("<p>", "<", 0); 
        if (str3 == null)
          str3 = "UnknownError: " + a("<body", "<a", 0); 
        Alert alert;
        (alert = new Alert("Info", str3, null, AlertType.INFO)).setTimeout(-2);
        this.p.setCurrent(alert, (Displayable)this.k);
      } else {
        b((String)paramObject);
      } 
    } 
    return null;
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.m)
      if (paramDisplayable == this.k) {
        request(1, null, new Integer(0));
      } else {
        a(this.p);
      }  
    if (paramCommand == List.SELECT_COMMAND || paramCommand == this.n) {
      String str = this.q.elementAt(this.k.getSelectedIndex());
      request(30, null, str);
    } 
    if (paramCommand == this.o)
      request(30, null, null); 
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield f : Ljava/lang/String;
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield i : I
    //   10: aload_0
    //   11: aconst_null
    //   12: putfield h : [B
    //   15: aconst_null
    //   16: astore #6
    //   18: aconst_null
    //   19: astore #7
    //   21: aconst_null
    //   22: astore #8
    //   24: aload_1
    //   25: iconst_3
    //   26: iconst_0
    //   27: invokestatic open : (Ljava/lang/String;IZ)Ljavax/microedition/io/Connection;
    //   30: checkcast javax/microedition/io/HttpConnection
    //   33: dup
    //   34: astore #6
    //   36: aload_3
    //   37: invokeinterface setRequestMethod : (Ljava/lang/String;)V
    //   42: aload_2
    //   43: ldc 'utf-8'
    //   45: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   48: astore #9
    //   50: iload #5
    //   52: ifeq -> 69
    //   55: aload #6
    //   57: ldc 'Accept'
    //   59: ldc 'image/png,image/*;q=0.8,*/*;q=0.5'
    //   61: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   66: goto -> 80
    //   69: aload #6
    //   71: ldc 'Accept'
    //   73: ldc 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8,text/vnd.wap.wml;q=0.6'
    //   75: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   80: aload #6
    //   82: ldc 'User-Agent'
    //   84: ldc 'Opera/9.60 (J2ME/MIDP; Opera Mini/4.2.14320/504; U; ru) Presto/2.2.0'
    //   86: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload #6
    //   93: ldc 'Accept-Charset'
    //   95: ldc 'windows-1251,utf-8;q=0.7,*;q=0.7'
    //   97: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload #6
    //   104: ldc 'Referer'
    //   106: ldc 'http://sms.owap.biz/mts/'
    //   108: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload #6
    //   115: ldc 'Accept-Language'
    //   117: ldc 'ru,en-us;q=0.7,en;q=0.3'
    //   119: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   124: aload #9
    //   126: arraylength
    //   127: ifeq -> 160
    //   130: aload #6
    //   132: ldc 'Content-Length'
    //   134: new java/lang/StringBuffer
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: ldc ''
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   146: aload #9
    //   148: arraylength
    //   149: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   152: invokevirtual toString : ()Ljava/lang/String;
    //   155: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload #6
    //   162: ldc 'Content-Type'
    //   164: ldc 'application/x-www-form-urlencoded'
    //   166: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   171: aload #6
    //   173: invokeinterface openOutputStream : ()Ljava/io/OutputStream;
    //   178: dup
    //   179: astore #8
    //   181: aload #9
    //   183: invokevirtual write : ([B)V
    //   186: aload #8
    //   188: ifnull -> 196
    //   191: aload #8
    //   193: invokevirtual close : ()V
    //   196: goto -> 200
    //   199: pop
    //   200: aload #6
    //   202: invokeinterface openInputStream : ()Ljava/io/InputStream;
    //   207: astore #7
    //   209: aload_0
    //   210: aload #6
    //   212: invokeinterface getResponseCode : ()I
    //   217: putfield i : I
    //   220: aload_0
    //   221: aload #6
    //   223: ldc 'location'
    //   225: invokeinterface getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   230: putfield g : Ljava/lang/String;
    //   233: aload_0
    //   234: getfield i : I
    //   237: sipush #200
    //   240: if_icmpeq -> 320
    //   243: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   246: new java/lang/StringBuffer
    //   249: dup
    //   250: invokespecial <init> : ()V
    //   253: ldc 'EndReq: '
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   258: aload_1
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   262: ldc ' ['
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   267: aload_0
    //   268: getfield i : I
    //   271: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   274: ldc ']'
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   279: invokevirtual toString : ()Ljava/lang/String;
    //   282: invokevirtual println : (Ljava/lang/String;)V
    //   285: aload #7
    //   287: ifnull -> 295
    //   290: aload #7
    //   292: invokevirtual close : ()V
    //   295: aload #8
    //   297: ifnull -> 305
    //   300: aload #8
    //   302: invokevirtual close : ()V
    //   305: aload #6
    //   307: ifnull -> 317
    //   310: aload #6
    //   312: invokeinterface close : ()V
    //   317: return
    //   318: pop
    //   319: return
    //   320: aload #6
    //   322: invokeinterface getType : ()Ljava/lang/String;
    //   327: pop
    //   328: aconst_null
    //   329: astore #10
    //   331: aload #6
    //   333: invokeinterface getLength : ()J
    //   338: l2i
    //   339: istore #11
    //   341: sipush #1024
    //   344: istore #13
    //   346: iload #11
    //   348: bipush #10
    //   350: if_icmple -> 359
    //   353: iload #11
    //   355: iconst_1
    //   356: iadd
    //   357: istore #13
    //   359: iload #13
    //   361: newarray byte
    //   363: astore #12
    //   365: iconst_0
    //   366: istore #14
    //   368: aload #7
    //   370: invokevirtual read : ()I
    //   373: dup
    //   374: istore #15
    //   376: iconst_m1
    //   377: if_icmpeq -> 402
    //   380: iload #14
    //   382: aload #12
    //   384: arraylength
    //   385: if_icmpge -> 402
    //   388: aload #12
    //   390: iload #14
    //   392: iinc #14, 1
    //   395: iload #15
    //   397: i2b
    //   398: bastore
    //   399: goto -> 368
    //   402: iload #14
    //   404: aload #12
    //   406: arraylength
    //   407: if_icmpne -> 457
    //   410: aload #12
    //   412: arraylength
    //   413: aload #12
    //   415: arraylength
    //   416: iadd
    //   417: newarray byte
    //   419: astore #16
    //   421: aload #12
    //   423: iconst_0
    //   424: aload #16
    //   426: iconst_0
    //   427: aload #12
    //   429: arraylength
    //   430: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   433: aload #16
    //   435: astore #12
    //   437: iload #15
    //   439: iconst_m1
    //   440: if_icmpeq -> 454
    //   443: aload #12
    //   445: iload #14
    //   447: iinc #14, 1
    //   450: iload #15
    //   452: i2b
    //   453: bastore
    //   454: goto -> 368
    //   457: iload #14
    //   459: newarray byte
    //   461: astore #16
    //   463: aload #12
    //   465: iconst_0
    //   466: aload #16
    //   468: iconst_0
    //   469: iload #14
    //   471: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   474: iload #4
    //   476: ifne -> 686
    //   479: iconst_0
    //   480: istore #17
    //   482: iload #17
    //   484: aload #16
    //   486: arraylength
    //   487: if_icmpge -> 547
    //   490: aload #16
    //   492: iload #17
    //   494: baload
    //   495: bipush #13
    //   497: if_icmpne -> 507
    //   500: aload #16
    //   502: iload #17
    //   504: bipush #32
    //   506: bastore
    //   507: aload #16
    //   509: iload #17
    //   511: baload
    //   512: bipush #9
    //   514: if_icmpne -> 524
    //   517: aload #16
    //   519: iload #17
    //   521: bipush #32
    //   523: bastore
    //   524: aload #16
    //   526: iload #17
    //   528: baload
    //   529: bipush #10
    //   531: if_icmpne -> 541
    //   534: aload #16
    //   536: iload #17
    //   538: bipush #32
    //   540: bastore
    //   541: iinc #17, 1
    //   544: goto -> 482
    //   547: aload_0
    //   548: new java/lang/String
    //   551: dup
    //   552: aload #16
    //   554: ldc 'utf-8'
    //   556: invokespecial <init> : ([BLjava/lang/String;)V
    //   559: putfield f : Ljava/lang/String;
    //   562: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   565: new java/lang/StringBuffer
    //   568: dup
    //   569: invokespecial <init> : ()V
    //   572: ldc '"'
    //   574: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   577: aload_0
    //   578: getfield f : Ljava/lang/String;
    //   581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   584: ldc '"'
    //   586: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   589: invokevirtual toString : ()Ljava/lang/String;
    //   592: invokevirtual println : (Ljava/lang/String;)V
    //   595: goto -> 692
    //   598: dup
    //   599: astore #17
    //   601: invokevirtual printStackTrace : ()V
    //   604: aload_0
    //   605: iconst_m1
    //   606: putfield i : I
    //   609: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   612: new java/lang/StringBuffer
    //   615: dup
    //   616: invokespecial <init> : ()V
    //   619: ldc 'EndReq: '
    //   621: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   624: aload_1
    //   625: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   628: ldc ' ['
    //   630: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   633: aload_0
    //   634: getfield i : I
    //   637: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   640: ldc ']'
    //   642: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   645: invokevirtual toString : ()Ljava/lang/String;
    //   648: invokevirtual println : (Ljava/lang/String;)V
    //   651: aload #7
    //   653: ifnull -> 661
    //   656: aload #7
    //   658: invokevirtual close : ()V
    //   661: aload #8
    //   663: ifnull -> 671
    //   666: aload #8
    //   668: invokevirtual close : ()V
    //   671: aload #6
    //   673: ifnull -> 683
    //   676: aload #6
    //   678: invokeinterface close : ()V
    //   683: return
    //   684: pop
    //   685: return
    //   686: aload_0
    //   687: aload #16
    //   689: putfield h : [B
    //   692: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   695: new java/lang/StringBuffer
    //   698: dup
    //   699: invokespecial <init> : ()V
    //   702: ldc 'EndReq: '
    //   704: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   707: aload_1
    //   708: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   711: ldc ' ['
    //   713: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   716: aload_0
    //   717: getfield i : I
    //   720: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   723: ldc ']'
    //   725: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   728: invokevirtual toString : ()Ljava/lang/String;
    //   731: invokevirtual println : (Ljava/lang/String;)V
    //   734: aload #7
    //   736: ifnull -> 744
    //   739: aload #7
    //   741: invokevirtual close : ()V
    //   744: aload #8
    //   746: ifnull -> 754
    //   749: aload #8
    //   751: invokevirtual close : ()V
    //   754: aload #6
    //   756: ifnull -> 766
    //   759: aload #6
    //   761: invokeinterface close : ()V
    //   766: return
    //   767: pop
    //   768: return
    //   769: dup
    //   770: astore #9
    //   772: invokevirtual printStackTrace : ()V
    //   775: aload_0
    //   776: bipush #-2
    //   778: putfield i : I
    //   781: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   784: new java/lang/StringBuffer
    //   787: dup
    //   788: invokespecial <init> : ()V
    //   791: ldc 'EndReq: '
    //   793: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   796: aload_1
    //   797: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   800: ldc ' ['
    //   802: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   805: aload_0
    //   806: getfield i : I
    //   809: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   812: ldc ']'
    //   814: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   817: invokevirtual toString : ()Ljava/lang/String;
    //   820: invokevirtual println : (Ljava/lang/String;)V
    //   823: aload #7
    //   825: ifnull -> 833
    //   828: aload #7
    //   830: invokevirtual close : ()V
    //   833: aload #8
    //   835: ifnull -> 843
    //   838: aload #8
    //   840: invokevirtual close : ()V
    //   843: aload #6
    //   845: ifnull -> 855
    //   848: aload #6
    //   850: invokeinterface close : ()V
    //   855: return
    //   856: pop
    //   857: return
    //   858: astore #19
    //   860: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   863: new java/lang/StringBuffer
    //   866: dup
    //   867: invokespecial <init> : ()V
    //   870: ldc 'EndReq: '
    //   872: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   875: aload_1
    //   876: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   879: ldc ' ['
    //   881: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   884: aload_0
    //   885: getfield i : I
    //   888: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   891: ldc ']'
    //   893: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   896: invokevirtual toString : ()Ljava/lang/String;
    //   899: invokevirtual println : (Ljava/lang/String;)V
    //   902: aload #7
    //   904: ifnull -> 912
    //   907: aload #7
    //   909: invokevirtual close : ()V
    //   912: aload #8
    //   914: ifnull -> 922
    //   917: aload #8
    //   919: invokevirtual close : ()V
    //   922: aload #6
    //   924: ifnull -> 934
    //   927: aload #6
    //   929: invokeinterface close : ()V
    //   934: goto -> 938
    //   937: pop
    //   938: aload #19
    //   940: athrow
    // Exception table:
    //   from	to	target	type
    //   24	243	769	java/lang/Exception
    //   24	243	858	finally
    //   186	196	199	java/lang/Throwable
    //   285	317	318	java/io/IOException
    //   320	609	769	java/lang/Exception
    //   320	609	858	finally
    //   479	595	598	java/lang/Exception
    //   651	683	684	java/io/IOException
    //   686	692	769	java/lang/Exception
    //   686	692	858	finally
    //   734	766	767	java/io/IOException
    //   769	781	858	finally
    //   823	855	856	java/io/IOException
    //   858	860	858	finally
    //   902	934	937	java/io/IOException
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
  
  private void b(String paramString) {
    a(this.a + paramString, "", "GET", 0, false);
    while (this.i == 302) {
      if (this.g.startsWith("http:")) {
        a(this.g, "", "GET", 0, false);
        continue;
      } 
      a(c(this.a + paramString) + this.g, "", "GET", 0, false);
    } 
    if (this.i != 200) {
      Alert alert;
      (alert = new Alert("Error", "Ошибка соединения " + this.i, null, AlertType.ERROR)).setTimeout(-2);
      this.p.setCurrent((Displayable)alert);
      return;
    } 
    this.f = d(this.f);
    String str1 = a("<title>", "</title>", 0);
    this.c = a("<form method=\"post\" action=\"", "\"", this.j);
    this.b = a("<img src=\"img.php?", "\"", this.j);
    if (this.b != null)
      this.b = "img.php?" + this.b; 
    String str2 = a("+", "<", this.j);
    String str3 = a("Сообщение", "<", this.j);
    this.e = a("ype=\"hidden\" name=\"", "\"", this.j);
    this.d = a("value=\"", "\"", this.j);
    if (str2 == null) {
      a("<body", ">", 0);
      str3 = a("p>", "<", this.j);
      Alert alert;
      (alert = new Alert("Error", str3, null, AlertType.ERROR)).setTimeout(-2);
      this.p.setCurrent((Displayable)alert);
      return;
    } 
    if (this.b != null) {
      this.i = 302;
      this.g = c(this.a + paramString) + "/" + this.b;
      while (this.i == 302) {
        a(this.g, "", "GET", 1, true);
        if (this.i != 200 && this.i != 302) {
          Alert alert;
          (alert = new Alert("Error", "Ошибка соединения #2, status " + this.i, null, AlertType.ERROR)).setTimeout(-2);
          this.p.setCurrent((Displayable)alert);
          return;
        } 
      } 
    } 
    this.l = null;
    this.l = new Form(str1);
    if (this.b != null) {
      Image image = Image.createImage(this.h, 0, this.h.length);
      this.l.append(image);
    } 
    if (this.b != null) {
      this.l.append((Item)(this.r = new TextField("Код:", "", 20, 0)));
      this.r.setInitialInputMode("IS_LATIN_DIGITS");
    } 
    this.l.append((Item)(this.s = new TextField("+" + str2, this.u, 20, 3)));
    int i = 0;
    for (byte b = 0; b < str3.length(); b++) {
      if (str3.charAt(b) >= '0' && str3.charAt(b) <= '9')
        i = i * 10 + (str3.charAt(b) & 0xF); 
    } 
    if (i < 10 || i > 300)
      i = 120; 
    this.l.append((Item)(this.t = new TextField("Сообщение (" + i + "):", "", i, 0)));
    this.l.setCommandListener(this);
    this.l.addCommand(this.o);
    this.l.addCommand(this.m);
    this.p.setCurrent((Displayable)this.l);
  }
  
  private static String c(String paramString) {
    int i;
    if ((i = paramString.lastIndexOf('/')) > 0)
      paramString = paramString.substring(0, i); 
    return paramString;
  }
  
  private static String d(String paramString) {
    while (paramString.indexOf("<!--") >= 0) {
      int j;
      if ((j = paramString.indexOf("<!--")) > 0)
        paramString = paramString.substring(0, j) + "{" + paramString.substring(j + 4); 
    } 
    while (paramString.indexOf("-->") >= 0) {
      int j;
      if ((j = paramString.indexOf("-->")) > 0)
        paramString = paramString.substring(0, j) + "}" + paramString.substring(j + 3); 
    } 
    StringBuffer stringBuffer = new StringBuffer();
    byte b = 0;
    int i;
    for (i = 0; i < paramString.length(); i++) {
      char c = paramString.charAt(i);
      if (!b) {
        if (c == '{') {
          b = 1;
        } else if (c == '"') {
          b = 2;
          stringBuffer.append(c);
        } else if (c == '\'') {
          b = 3;
          stringBuffer.append("\"");
        } else if (c >= 'A' && c <= 'Z') {
          stringBuffer.append((char)(c + 32));
        } else {
          stringBuffer.append(c);
        } 
      } else if (b == 1) {
        if (c == '}')
          b = 0; 
      } else if (b == 2) {
        if (c == '"' || c == '>')
          b = 0; 
        if (c >= 'A' && c <= 'Z') {
          stringBuffer.append((char)(c + 32));
        } else {
          stringBuffer.append(c);
        } 
      } else if (b == 3) {
        if (c == '\'') {
          b = 0;
          stringBuffer.append("\"");
        } else if (c == '>') {
          b = 0;
          stringBuffer.append(c);
        } else if (c >= 'A' && c <= 'Z') {
          stringBuffer.append((char)(c + 32));
        } else {
          stringBuffer.append(c);
        } 
      } 
    } 
    paramString = stringBuffer.toString();
    while (paramString.indexOf("  ") >= 0) {
      if ((i = paramString.indexOf("  ")) > 0 && i > 0 && i + 1 < paramString.length())
        paramString = paramString.substring(0, i) + paramString.substring(i + 1); 
    } 
    return paramString;
  }
  
  private String a(String paramString1, String paramString2, int paramInt) {
    if (paramInt < 0)
      paramInt = 0; 
    int i;
    if ((i = this.f.indexOf(paramString1, paramInt)) >= 0)
      i += paramString1.length(); 
    if (i < 0)
      return null; 
    this.j = this.f.indexOf(paramString2, i);
    return (this.j < 0) ? null : this.f.substring(i, this.j);
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
  
  private synchronized void a(Display paramDisplay) {
    this.p = paramDisplay;
    if (this.k == null) {
      this.k = new List("Смс рассылка", 3);
      try {
        InputStream inputStream;
        byte[] arrayOfByte = new byte[(inputStream = this.k.getClass().getResourceAsStream("/PlgSmsUrls.txt")).available()];
        inputStream.read(arrayOfByte);
        inputStream.close();
        String[] arrayOfString = a(new String(arrayOfByte, "utf-8"), "\n");
        this.a = arrayOfString[1].trim();
        for (byte b = 2; b < arrayOfString.length - 1; b += 2) {
          this.k.append(arrayOfString[b].trim(), null);
          this.q.addElement(arrayOfString[b + 1].trim());
        } 
      } catch (Exception exception) {
        System.out.println("NoResource");
      } 
      this.k.addCommand(this.n);
      this.k.addCommand(this.m);
      this.k.setCommandListener(this);
    } 
    paramDisplay.setCurrent((Displayable)this.k);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgSms.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */