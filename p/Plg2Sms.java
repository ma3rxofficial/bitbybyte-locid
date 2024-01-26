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
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;

public class Plg2Sms extends PI implements CommandListener {
  public String[] a = null;
  
  public String b = "http://wapinet.ru/sms/";
  
  public int c = -1;
  
  private List g;
  
  private Form h;
  
  private Command i = new Command("Назад", 2, 2);
  
  private Command j = new Command("Выбор", 4, 1);
  
  private Command k = new Command("Отправить", 4, 1);
  
  private Display l;
  
  private int[] m;
  
  private TextField n;
  
  private TextField o;
  
  private String p = "";
  
  public String d;
  
  public int e;
  
  public int f = 0;
  
  public String getName() {
    return "Бесплатные SMS (wapinet)";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 39 || paramInt == 2) {
      a((Display)paramObject, "G:ROOT");
    } else if (paramInt == 37) {
      String str1 = "&";
      String str2 = "";
      str2 = str2 + "operator=" + this.a[this.c + 3] + str1;
      str2 = str2 + "phone=" + this.n.getString() + str1;
      str2 = str2 + "sms=" + a(this.o.getString());
      a(this.b + this.a[this.c + 2] + "/sms.php?", str2, "POST", 0, false);
      String str3;
      if ((str3 = a("<div class=\"red\">", "<div", 0)) == null)
        str3 = a("<p>", "<", 0); 
      if (str3 == null)
        str3 = "UnknownError: " + a("<body", "<a", 0); 
      Alert alert;
      (alert = new Alert("Info", str3, null, AlertType.INFO)).setTimeout(-2);
      this.l.setCurrent(alert, (Displayable)this.g);
    } 
    return null;
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.i)
      if (paramDisplayable == this.g) {
        request(1, null, new Integer(0));
      } else {
        a(this.l, "G:ROOT");
      }  
    if (paramCommand == List.SELECT_COMMAND || paramCommand == this.j) {
      this.c = this.m[this.g.getSelectedIndex()];
      if (this.a[this.c + 2].startsWith("G:")) {
        a(this.l, this.a[this.c + 2]);
      } else {
        a();
      } 
    } 
    if (paramCommand == this.k)
      request(30, null, null); 
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield d : Ljava/lang/String;
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield e : I
    //   10: aconst_null
    //   11: astore #6
    //   13: aconst_null
    //   14: astore #7
    //   16: aconst_null
    //   17: astore #8
    //   19: aload_1
    //   20: iconst_3
    //   21: iconst_0
    //   22: invokestatic open : (Ljava/lang/String;IZ)Ljavax/microedition/io/Connection;
    //   25: checkcast javax/microedition/io/HttpConnection
    //   28: dup
    //   29: astore #6
    //   31: aload_3
    //   32: invokeinterface setRequestMethod : (Ljava/lang/String;)V
    //   37: aload_2
    //   38: ldc 'utf-8'
    //   40: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   43: astore #9
    //   45: iload #5
    //   47: ifeq -> 64
    //   50: aload #6
    //   52: ldc 'Accept'
    //   54: ldc 'image/png,image/*;q=0.8,*/*;q=0.5'
    //   56: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   61: goto -> 75
    //   64: aload #6
    //   66: ldc 'Accept'
    //   68: ldc 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8,text/vnd.wap.wml;q=0.6'
    //   70: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   75: aload #6
    //   77: ldc 'User-Agent'
    //   79: ldc 'Mozilla/5.0 (Windows; U; Windows NT 5.1; ru; rv:1.9.0.10) Gecko/2009042316 Firefox/3.0.10'
    //   81: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   86: aload #6
    //   88: ldc 'Accept-Charset'
    //   90: ldc 'windows-1251,utf-8;q=0.7,*;q=0.7'
    //   92: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   97: aload #6
    //   99: ldc 'Accept-Language'
    //   101: ldc 'ru,en-us;q=0.7,en;q=0.3'
    //   103: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   108: aload #6
    //   110: ldc 'Content-Type'
    //   112: ldc 'application/x-www-form-urlencoded'
    //   114: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   119: aload #6
    //   121: ldc 'Cookie'
    //   123: ldc 'url=loc-id.ru'
    //   125: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   130: aload #9
    //   132: arraylength
    //   133: ifeq -> 166
    //   136: aload #6
    //   138: ldc 'Content-Length'
    //   140: new java/lang/StringBuffer
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: ldc ''
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   152: aload #9
    //   154: arraylength
    //   155: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   158: invokevirtual toString : ()Ljava/lang/String;
    //   161: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload #6
    //   168: invokeinterface openOutputStream : ()Ljava/io/OutputStream;
    //   173: dup
    //   174: astore #8
    //   176: aload #9
    //   178: invokevirtual write : ([B)V
    //   181: aload #8
    //   183: ifnull -> 191
    //   186: aload #8
    //   188: invokevirtual close : ()V
    //   191: goto -> 195
    //   194: pop
    //   195: aload #6
    //   197: invokeinterface openInputStream : ()Ljava/io/InputStream;
    //   202: astore #7
    //   204: aload_0
    //   205: aload #6
    //   207: invokeinterface getResponseCode : ()I
    //   212: putfield e : I
    //   215: aload #6
    //   217: ldc 'location'
    //   219: invokeinterface getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   224: pop
    //   225: aload_0
    //   226: getfield e : I
    //   229: sipush #200
    //   232: if_icmpeq -> 312
    //   235: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   238: new java/lang/StringBuffer
    //   241: dup
    //   242: invokespecial <init> : ()V
    //   245: ldc 'EndReq: '
    //   247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   250: aload_1
    //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   254: ldc ' ['
    //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   259: aload_0
    //   260: getfield e : I
    //   263: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   266: ldc ']'
    //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   271: invokevirtual toString : ()Ljava/lang/String;
    //   274: invokevirtual println : (Ljava/lang/String;)V
    //   277: aload #7
    //   279: ifnull -> 287
    //   282: aload #7
    //   284: invokevirtual close : ()V
    //   287: aload #8
    //   289: ifnull -> 297
    //   292: aload #8
    //   294: invokevirtual close : ()V
    //   297: aload #6
    //   299: ifnull -> 309
    //   302: aload #6
    //   304: invokeinterface close : ()V
    //   309: return
    //   310: pop
    //   311: return
    //   312: aload #6
    //   314: invokeinterface getType : ()Ljava/lang/String;
    //   319: pop
    //   320: aconst_null
    //   321: astore #10
    //   323: aload #6
    //   325: invokeinterface getLength : ()J
    //   330: l2i
    //   331: istore #11
    //   333: sipush #1024
    //   336: istore #13
    //   338: iload #11
    //   340: bipush #10
    //   342: if_icmple -> 351
    //   345: iload #11
    //   347: iconst_1
    //   348: iadd
    //   349: istore #13
    //   351: iload #13
    //   353: newarray byte
    //   355: astore #12
    //   357: iconst_0
    //   358: istore #14
    //   360: aload #7
    //   362: invokevirtual read : ()I
    //   365: dup
    //   366: istore #15
    //   368: iconst_m1
    //   369: if_icmpeq -> 394
    //   372: iload #14
    //   374: aload #12
    //   376: arraylength
    //   377: if_icmpge -> 394
    //   380: aload #12
    //   382: iload #14
    //   384: iinc #14, 1
    //   387: iload #15
    //   389: i2b
    //   390: bastore
    //   391: goto -> 360
    //   394: iload #14
    //   396: aload #12
    //   398: arraylength
    //   399: if_icmpne -> 449
    //   402: aload #12
    //   404: arraylength
    //   405: aload #12
    //   407: arraylength
    //   408: iadd
    //   409: newarray byte
    //   411: astore #16
    //   413: aload #12
    //   415: iconst_0
    //   416: aload #16
    //   418: iconst_0
    //   419: aload #12
    //   421: arraylength
    //   422: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   425: aload #16
    //   427: astore #12
    //   429: iload #15
    //   431: iconst_m1
    //   432: if_icmpeq -> 446
    //   435: aload #12
    //   437: iload #14
    //   439: iinc #14, 1
    //   442: iload #15
    //   444: i2b
    //   445: bastore
    //   446: goto -> 360
    //   449: iload #14
    //   451: newarray byte
    //   453: astore #16
    //   455: aload #12
    //   457: iconst_0
    //   458: aload #16
    //   460: iconst_0
    //   461: iload #14
    //   463: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   466: iload #4
    //   468: ifne -> 610
    //   471: aload_0
    //   472: new java/lang/String
    //   475: dup
    //   476: aload #16
    //   478: ldc 'utf-8'
    //   480: invokespecial <init> : ([BLjava/lang/String;)V
    //   483: putfield d : Ljava/lang/String;
    //   486: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   489: new java/lang/StringBuffer
    //   492: dup
    //   493: invokespecial <init> : ()V
    //   496: ldc '"'
    //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   501: aload_0
    //   502: getfield d : Ljava/lang/String;
    //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   508: ldc '"'
    //   510: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   513: invokevirtual toString : ()Ljava/lang/String;
    //   516: invokevirtual println : (Ljava/lang/String;)V
    //   519: goto -> 610
    //   522: dup
    //   523: astore #17
    //   525: invokevirtual printStackTrace : ()V
    //   528: aload_0
    //   529: iconst_m1
    //   530: putfield e : I
    //   533: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   536: new java/lang/StringBuffer
    //   539: dup
    //   540: invokespecial <init> : ()V
    //   543: ldc 'EndReq: '
    //   545: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   548: aload_1
    //   549: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   552: ldc ' ['
    //   554: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   557: aload_0
    //   558: getfield e : I
    //   561: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   564: ldc ']'
    //   566: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   569: invokevirtual toString : ()Ljava/lang/String;
    //   572: invokevirtual println : (Ljava/lang/String;)V
    //   575: aload #7
    //   577: ifnull -> 585
    //   580: aload #7
    //   582: invokevirtual close : ()V
    //   585: aload #8
    //   587: ifnull -> 595
    //   590: aload #8
    //   592: invokevirtual close : ()V
    //   595: aload #6
    //   597: ifnull -> 607
    //   600: aload #6
    //   602: invokeinterface close : ()V
    //   607: return
    //   608: pop
    //   609: return
    //   610: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   613: new java/lang/StringBuffer
    //   616: dup
    //   617: invokespecial <init> : ()V
    //   620: ldc 'EndReq: '
    //   622: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   625: aload_1
    //   626: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   629: ldc ' ['
    //   631: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   634: aload_0
    //   635: getfield e : I
    //   638: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   641: ldc ']'
    //   643: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   646: invokevirtual toString : ()Ljava/lang/String;
    //   649: invokevirtual println : (Ljava/lang/String;)V
    //   652: aload #7
    //   654: ifnull -> 662
    //   657: aload #7
    //   659: invokevirtual close : ()V
    //   662: aload #8
    //   664: ifnull -> 672
    //   667: aload #8
    //   669: invokevirtual close : ()V
    //   672: aload #6
    //   674: ifnull -> 684
    //   677: aload #6
    //   679: invokeinterface close : ()V
    //   684: return
    //   685: pop
    //   686: return
    //   687: dup
    //   688: astore #9
    //   690: invokevirtual printStackTrace : ()V
    //   693: aload_0
    //   694: bipush #-2
    //   696: putfield e : I
    //   699: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   702: new java/lang/StringBuffer
    //   705: dup
    //   706: invokespecial <init> : ()V
    //   709: ldc 'EndReq: '
    //   711: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   714: aload_1
    //   715: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   718: ldc ' ['
    //   720: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   723: aload_0
    //   724: getfield e : I
    //   727: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   730: ldc ']'
    //   732: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   735: invokevirtual toString : ()Ljava/lang/String;
    //   738: invokevirtual println : (Ljava/lang/String;)V
    //   741: aload #7
    //   743: ifnull -> 751
    //   746: aload #7
    //   748: invokevirtual close : ()V
    //   751: aload #8
    //   753: ifnull -> 761
    //   756: aload #8
    //   758: invokevirtual close : ()V
    //   761: aload #6
    //   763: ifnull -> 773
    //   766: aload #6
    //   768: invokeinterface close : ()V
    //   773: return
    //   774: pop
    //   775: return
    //   776: astore #19
    //   778: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   781: new java/lang/StringBuffer
    //   784: dup
    //   785: invokespecial <init> : ()V
    //   788: ldc 'EndReq: '
    //   790: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   793: aload_1
    //   794: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   797: ldc ' ['
    //   799: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   802: aload_0
    //   803: getfield e : I
    //   806: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   809: ldc ']'
    //   811: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   814: invokevirtual toString : ()Ljava/lang/String;
    //   817: invokevirtual println : (Ljava/lang/String;)V
    //   820: aload #7
    //   822: ifnull -> 830
    //   825: aload #7
    //   827: invokevirtual close : ()V
    //   830: aload #8
    //   832: ifnull -> 840
    //   835: aload #8
    //   837: invokevirtual close : ()V
    //   840: aload #6
    //   842: ifnull -> 852
    //   845: aload #6
    //   847: invokeinterface close : ()V
    //   852: goto -> 856
    //   855: pop
    //   856: aload #19
    //   858: athrow
    // Exception table:
    //   from	to	target	type
    //   19	235	687	java/lang/Exception
    //   19	235	776	finally
    //   181	191	194	java/lang/Throwable
    //   277	309	310	java/io/IOException
    //   312	533	687	java/lang/Exception
    //   312	533	776	finally
    //   471	519	522	java/lang/Exception
    //   575	607	608	java/io/IOException
    //   652	684	685	java/io/IOException
    //   687	699	776	finally
    //   741	773	774	java/io/IOException
    //   776	778	776	finally
    //   820	852	855	java/io/IOException
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
  
  private void a() {
    String str = this.a[this.c + 1];
    this.h = null;
    this.h = new Form(str);
    this.h.append(this.a[this.c + 1]);
    this.h.append((Item)(this.n = new TextField("Номер:", this.p, 20, 3)));
    this.h.append((Item)(this.o = new TextField("Сообщение (160):", "", 160, 0)));
    this.h.setCommandListener(this);
    this.h.addCommand(this.k);
    this.h.addCommand(this.i);
    this.l.setCurrent((Displayable)this.h);
  }
  
  private String a(String paramString1, String paramString2, int paramInt) {
    if (paramInt < 0)
      paramInt = 0; 
    int i;
    if ((i = this.d.indexOf(paramString1, paramInt)) >= 0)
      i += paramString1.length(); 
    if (i < 0)
      return null; 
    this.f = this.d.indexOf(paramString2, i);
    return (this.f < 0) ? null : this.d.substring(i, this.f);
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
  
  private synchronized void a(Display paramDisplay, String paramString) {
    this.l = paramDisplay;
    this.g = new List("Смс рассылка", 3);
    if (this.a == null)
      try {
        InputStream inputStream;
        byte[] arrayOfByte = new byte[(inputStream = this.g.getClass().getResourceAsStream("/Plg2SmsUrls.txt")).available()];
        inputStream.read(arrayOfByte);
        inputStream.close();
        this.a = a(new String(arrayOfByte, "utf-8"), "\n");
        for (byte b1 = 0; b1 < this.a.length; b1++) {
          int i;
          if ((i = this.a[b1].indexOf('\r')) >= 0)
            this.a[b1] = this.a[b1].substring(0, i); 
        } 
        this.b = this.a[1].trim();
        this.m = new int[this.a.length / 4 + 1];
      } catch (Exception exception) {
        System.out.println("NoResource");
      }  
    for (byte b = 2; b < this.a.length - 1; b += 4) {
      if (this.a[b].equals(paramString)) {
        this.m[this.g.size()] = b;
        this.g.append(this.a[b + 1].trim(), null);
      } 
    } 
    this.g.addCommand(this.j);
    this.g.addCommand(this.i);
    this.g.setCommandListener(this);
    paramDisplay.setCurrent((Displayable)this.g);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\Plg2Sms.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */