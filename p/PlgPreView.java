package p;

import i.PI;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class PlgPreView extends PI {
  private Command l = new Command("Предпросмотр", 8, 1);
  
  public String a;
  
  public String b;
  
  public String c;
  
  public Image d;
  
  public Vector e = new Vector();
  
  public int f;
  
  public int g;
  
  private boolean m;
  
  public String h;
  
  public byte[] i;
  
  public int j;
  
  public byte[] k;
  
  public String getName() {
    return "Предпросмотр передачи файлов";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    int[] arrayOfInt2;
    Graphics graphics;
    int[] arrayOfInt1;
    int i;
    int[] arrayOfInt3;
    Vector vector;
    int j;
    int k;
    Canvas canvas;
    switch (paramInt) {
      case 0:
        this.e.addElement(this.l);
        return null;
      case 2:
        ((Display)paramObject).setCurrent((Displayable)new Alert("При приёме файла должна появиться кнопка '" + this.l.getLabel() + "'"));
        return null;
      case 16:
        return this.e;
      case 17:
        return (paramObject instanceof i.C) ? b(paramArrayOfObject, 2) : null;
      case 18:
        return a(paramArrayOfObject, paramObject, 2);
      case 13:
        return this.e;
      case 14:
        return (paramObject instanceof i.C) ? b(paramArrayOfObject, 3) : null;
      case 15:
        return a(paramArrayOfObject, paramObject, 3);
      case 24:
        if (!this.m)
          return null; 
        if ((i = (arrayOfInt2 = (int[])paramArrayOfObject[0])[2]) < 100)
          return null; 
        i %= 100;
        this.g = arrayOfInt2[0] - 6;
        this.f = arrayOfInt2[1];
        if (i < 1 || i > 3)
          return null; 
        (vector = (Vector)new Vector()).addElement(new int[] { this.g + 20, 21, 0, 0 });
        return vector;
      case 25:
        if (!this.m)
          return null; 
        graphics = (Graphics)paramArrayOfObject[0];
        j = (arrayOfInt3 = (int[])paramObject)[0];
        k = arrayOfInt3[1];
        canvas = (Canvas)paramArrayOfObject[1];
        graphics.setClip(0, 0, canvas.getWidth(), canvas.getHeight());
        if (this.d == null) {
          String str = "" + this.b;
          if (this.k != null)
            str + " " + this.k.length; 
          graphics.drawString("" + this.b, j + 1, k + 1, 0);
        } 
        if (this.d != null) {
          graphics.drawImage(this.d, (this.g - this.d.getWidth()) / 2, 3, 0);
          graphics.drawString("" + this.c, (this.g - this.d.getWidth()) / 2 + 1, 3, 0);
        } 
        break;
      case 38:
        if ((arrayOfInt1 = (int[])paramObject)[3] == 1) {
          if (arrayOfInt1[2] == 1)
            return null; 
          if (arrayOfInt1[2] == 6)
            return null; 
          if (arrayOfInt1[0] == 35 || arrayOfInt1[2] == 1000004 || arrayOfInt1[2] == 1000003 || arrayOfInt1[2] == 1000002 || arrayOfInt1[2] == 1000001) {
            arrayOfInt1[0] = 99999;
            arrayOfInt1[2] = 99999;
            this.m = false;
            request(34, null, null);
            request(10, null, null);
            return null;
          } 
        } 
        request(10, null, null);
        return arrayOfInt1;
      case 37:
        this.i = null;
        this.b = "Loading..";
        a("http://ft.fay.by/prev2.php" + this.a + "&x=" + this.g + "&y=" + this.f + "&prev=loc", "", "GET", 1, true);
        if (this.j != 200)
          this.b = "Error " + this.j; 
        if (this.i != null) {
          this.b = "Ok ";
          this.c = "" + this.i.length;
          try {
            this.d = null;
            this.d = Image.createImage(this.i, 0, this.i.length);
          } catch (Exception exception) {
            this.b = "Error 99 " + exception.getClass().getName();
          } 
          this.i = null;
        } 
        break;
    } 
    return null;
  }
  
  private Object a(Object[] paramArrayOfObject, Object paramObject, int paramInt) {
    if (paramObject != this.l)
      return null; 
    String str;
    if ((str = a(paramArrayOfObject, paramInt)) == null)
      return null; 
    int i;
    int j;
    for (j = i = str.indexOf("http://ft.fay.by/get"); j < str.length() && str.charAt(j) > ' ' && str.charAt(j) < ''; j++);
    i = (str = str.substring(i, j)).indexOf("?id=");
    str = str.substring(i);
    this.b = "Loading.";
    this.m = true;
    request(33, null, null);
    if (!str.equals(this.a) || this.d == null) {
      this.a = str;
      request(30, null, null);
      this.d = null;
    } 
    this.a = str;
    request(10, null, null);
    return this;
  }
  
  private static String a(Object[] paramArrayOfObject, int paramInt) {
    return (paramArrayOfObject[paramInt] != null && paramArrayOfObject[paramInt] instanceof String) ? ((((String)paramArrayOfObject[paramInt]).indexOf("http://ft.fay.by/get") >= 0) ? (String)paramArrayOfObject[paramInt] : null) : null;
  }
  
  private Object b(Object[] paramArrayOfObject, int paramInt) {
    return (paramArrayOfObject[paramInt] != null && paramArrayOfObject[paramInt] instanceof String && ((String)paramArrayOfObject[paramInt]).indexOf("http://ft.fay.by/get") >= 0) ? this.e : null;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield h : Ljava/lang/String;
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield j : I
    //   10: aload_0
    //   11: aconst_null
    //   12: putfield i : [B
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
    //   84: ldc 'Mozilla/5.0 (Windows; U; Windows NT 5.1; ru; rv:1.9.0.10) Gecko/2009042316 Firefox/3.0.10'
    //   86: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload #6
    //   93: ldc 'Accept-Charset'
    //   95: ldc 'windows-1251,utf-8;q=0.7,*;q=0.7'
    //   97: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload #6
    //   104: ldc 'Accept-Language'
    //   106: ldc 'ru,en-us;q=0.7,en;q=0.3'
    //   108: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload #6
    //   115: ldc 'Content-Type'
    //   117: ldc 'application/x-www-form-urlencoded'
    //   119: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   124: aload #6
    //   126: ldc 'Cookie'
    //   128: ldc 'url=loc-id.ru'
    //   130: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   135: aload #9
    //   137: arraylength
    //   138: ifeq -> 171
    //   141: aload #6
    //   143: ldc 'Content-Length'
    //   145: new java/lang/StringBuffer
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: ldc ''
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   157: aload #9
    //   159: arraylength
    //   160: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   163: invokevirtual toString : ()Ljava/lang/String;
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
    //   217: putfield j : I
    //   220: aload #6
    //   222: ldc 'location'
    //   224: invokeinterface getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   229: pop
    //   230: aload_0
    //   231: getfield j : I
    //   234: sipush #200
    //   237: if_icmpeq -> 317
    //   240: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   243: new java/lang/StringBuffer
    //   246: dup
    //   247: invokespecial <init> : ()V
    //   250: ldc 'EndReq: '
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   255: aload_1
    //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   259: ldc ' ['
    //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   264: aload_0
    //   265: getfield j : I
    //   268: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   271: ldc ']'
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   276: invokevirtual toString : ()Ljava/lang/String;
    //   279: invokevirtual println : (Ljava/lang/String;)V
    //   282: aload #7
    //   284: ifnull -> 292
    //   287: aload #7
    //   289: invokevirtual close : ()V
    //   292: aload #8
    //   294: ifnull -> 302
    //   297: aload #8
    //   299: invokevirtual close : ()V
    //   302: aload #6
    //   304: ifnull -> 314
    //   307: aload #6
    //   309: invokeinterface close : ()V
    //   314: return
    //   315: pop
    //   316: return
    //   317: aload #6
    //   319: invokeinterface getType : ()Ljava/lang/String;
    //   324: pop
    //   325: aconst_null
    //   326: astore #10
    //   328: aload #6
    //   330: invokeinterface getLength : ()J
    //   335: l2i
    //   336: istore #11
    //   338: sipush #1024
    //   341: istore #12
    //   343: iload #11
    //   345: bipush #10
    //   347: if_icmple -> 356
    //   350: iload #11
    //   352: iconst_1
    //   353: iadd
    //   354: istore #12
    //   356: aload_0
    //   357: iload #12
    //   359: newarray byte
    //   361: putfield k : [B
    //   364: iconst_0
    //   365: istore #13
    //   367: aload #7
    //   369: invokevirtual read : ()I
    //   372: dup
    //   373: istore #14
    //   375: iconst_m1
    //   376: if_icmpeq -> 405
    //   379: iload #13
    //   381: aload_0
    //   382: getfield k : [B
    //   385: arraylength
    //   386: if_icmpge -> 405
    //   389: aload_0
    //   390: getfield k : [B
    //   393: iload #13
    //   395: iinc #13, 1
    //   398: iload #14
    //   400: i2b
    //   401: bastore
    //   402: goto -> 367
    //   405: iload #13
    //   407: aload_0
    //   408: getfield k : [B
    //   411: arraylength
    //   412: if_icmpne -> 483
    //   415: aload_0
    //   416: bipush #10
    //   418: aconst_null
    //   419: aconst_null
    //   420: invokevirtual request : (I[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   423: pop
    //   424: aload_0
    //   425: getfield k : [B
    //   428: arraylength
    //   429: aload_0
    //   430: getfield k : [B
    //   433: arraylength
    //   434: iadd
    //   435: newarray byte
    //   437: astore #15
    //   439: aload_0
    //   440: getfield k : [B
    //   443: iconst_0
    //   444: aload #15
    //   446: iconst_0
    //   447: aload_0
    //   448: getfield k : [B
    //   451: arraylength
    //   452: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   455: aload_0
    //   456: aload #15
    //   458: putfield k : [B
    //   461: iload #14
    //   463: iconst_m1
    //   464: if_icmpeq -> 480
    //   467: aload_0
    //   468: getfield k : [B
    //   471: iload #13
    //   473: iinc #13, 1
    //   476: iload #14
    //   478: i2b
    //   479: bastore
    //   480: goto -> 367
    //   483: iload #13
    //   485: newarray byte
    //   487: astore #15
    //   489: aload_0
    //   490: getfield k : [B
    //   493: iconst_0
    //   494: aload #15
    //   496: iconst_0
    //   497: iload #13
    //   499: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   502: aload_0
    //   503: aconst_null
    //   504: putfield k : [B
    //   507: iload #4
    //   509: ifne -> 651
    //   512: aload_0
    //   513: new java/lang/String
    //   516: dup
    //   517: aload #15
    //   519: ldc 'utf-8'
    //   521: invokespecial <init> : ([BLjava/lang/String;)V
    //   524: putfield h : Ljava/lang/String;
    //   527: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   530: new java/lang/StringBuffer
    //   533: dup
    //   534: invokespecial <init> : ()V
    //   537: ldc '"'
    //   539: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   542: aload_0
    //   543: getfield h : Ljava/lang/String;
    //   546: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   549: ldc '"'
    //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   554: invokevirtual toString : ()Ljava/lang/String;
    //   557: invokevirtual println : (Ljava/lang/String;)V
    //   560: goto -> 657
    //   563: dup
    //   564: astore #16
    //   566: invokevirtual printStackTrace : ()V
    //   569: aload_0
    //   570: iconst_m1
    //   571: putfield j : I
    //   574: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   577: new java/lang/StringBuffer
    //   580: dup
    //   581: invokespecial <init> : ()V
    //   584: ldc 'EndReq: '
    //   586: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   589: aload_1
    //   590: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   593: ldc ' ['
    //   595: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   598: aload_0
    //   599: getfield j : I
    //   602: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   605: ldc ']'
    //   607: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   610: invokevirtual toString : ()Ljava/lang/String;
    //   613: invokevirtual println : (Ljava/lang/String;)V
    //   616: aload #7
    //   618: ifnull -> 626
    //   621: aload #7
    //   623: invokevirtual close : ()V
    //   626: aload #8
    //   628: ifnull -> 636
    //   631: aload #8
    //   633: invokevirtual close : ()V
    //   636: aload #6
    //   638: ifnull -> 648
    //   641: aload #6
    //   643: invokeinterface close : ()V
    //   648: return
    //   649: pop
    //   650: return
    //   651: aload_0
    //   652: aload #15
    //   654: putfield i : [B
    //   657: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   660: new java/lang/StringBuffer
    //   663: dup
    //   664: invokespecial <init> : ()V
    //   667: ldc 'EndReq: '
    //   669: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   672: aload_1
    //   673: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   676: ldc ' ['
    //   678: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   681: aload_0
    //   682: getfield j : I
    //   685: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   688: ldc ']'
    //   690: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   693: invokevirtual toString : ()Ljava/lang/String;
    //   696: invokevirtual println : (Ljava/lang/String;)V
    //   699: aload #7
    //   701: ifnull -> 709
    //   704: aload #7
    //   706: invokevirtual close : ()V
    //   709: aload #8
    //   711: ifnull -> 719
    //   714: aload #8
    //   716: invokevirtual close : ()V
    //   719: aload #6
    //   721: ifnull -> 731
    //   724: aload #6
    //   726: invokeinterface close : ()V
    //   731: return
    //   732: pop
    //   733: return
    //   734: dup
    //   735: astore #9
    //   737: invokevirtual printStackTrace : ()V
    //   740: aload_0
    //   741: bipush #-2
    //   743: putfield j : I
    //   746: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   749: new java/lang/StringBuffer
    //   752: dup
    //   753: invokespecial <init> : ()V
    //   756: ldc 'EndReq: '
    //   758: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   761: aload_1
    //   762: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   765: ldc ' ['
    //   767: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   770: aload_0
    //   771: getfield j : I
    //   774: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   777: ldc ']'
    //   779: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   782: invokevirtual toString : ()Ljava/lang/String;
    //   785: invokevirtual println : (Ljava/lang/String;)V
    //   788: aload #7
    //   790: ifnull -> 798
    //   793: aload #7
    //   795: invokevirtual close : ()V
    //   798: aload #8
    //   800: ifnull -> 808
    //   803: aload #8
    //   805: invokevirtual close : ()V
    //   808: aload #6
    //   810: ifnull -> 820
    //   813: aload #6
    //   815: invokeinterface close : ()V
    //   820: return
    //   821: pop
    //   822: return
    //   823: astore #18
    //   825: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   828: new java/lang/StringBuffer
    //   831: dup
    //   832: invokespecial <init> : ()V
    //   835: ldc 'EndReq: '
    //   837: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   840: aload_1
    //   841: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   844: ldc ' ['
    //   846: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   849: aload_0
    //   850: getfield j : I
    //   853: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   856: ldc ']'
    //   858: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   861: invokevirtual toString : ()Ljava/lang/String;
    //   864: invokevirtual println : (Ljava/lang/String;)V
    //   867: aload #7
    //   869: ifnull -> 877
    //   872: aload #7
    //   874: invokevirtual close : ()V
    //   877: aload #8
    //   879: ifnull -> 887
    //   882: aload #8
    //   884: invokevirtual close : ()V
    //   887: aload #6
    //   889: ifnull -> 899
    //   892: aload #6
    //   894: invokeinterface close : ()V
    //   899: goto -> 903
    //   902: pop
    //   903: aload #18
    //   905: athrow
    // Exception table:
    //   from	to	target	type
    //   24	240	734	java/lang/Exception
    //   24	240	823	finally
    //   186	196	199	java/lang/Throwable
    //   282	314	315	java/io/IOException
    //   317	574	734	java/lang/Exception
    //   317	574	823	finally
    //   512	560	563	java/lang/Exception
    //   616	648	649	java/io/IOException
    //   651	657	734	java/lang/Exception
    //   651	657	823	finally
    //   699	731	732	java/io/IOException
    //   734	746	823	finally
    //   788	820	821	java/io/IOException
    //   823	825	823	finally
    //   867	899	902	java/io/IOException
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgPreView.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */