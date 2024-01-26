import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

public final class k implements Runnable, CommandListener {
  private final Command a;
  
  private final Command b;
  
  private final Command c;
  
  private final Command d;
  
  private Vector a;
  
  private List a;
  
  public ai a;
  
  private int b = new Command(v.d(1), 2, 0);
  
  private int c = new Command(v.d(325), 1, 2);
  
  private int d = new Command(v.d(326), 1, 3);
  
  private boolean[] a;
  
  public int a;
  
  private short[] a;
  
  public static boolean a;
  
  public static Object a = new Object();
  
  private int e;
  
  private byte a;
  
  private Thread a = (Thread)new Command(v.d(18), 4, 1);
  
  public k(ai paramai) {
    this.a = (Thread)paramai;
  }
  
  private Vector a(char[] paramArrayOfchar) {
    if (paramArrayOfchar == null || paramArrayOfchar.length == 0)
      return null; 
    int i = paramArrayOfchar.length;
    Vector vector = new Vector(0);
    Object[] arrayOfObject = new Object[5];
    StringBuffer stringBuffer1 = new StringBuffer(0);
    StringBuffer stringBuffer2 = new StringBuffer(0);
    StringBuffer stringBuffer3 = new StringBuffer(0);
    StringBuffer stringBuffer4 = new StringBuffer(0);
    StringBuffer stringBuffer5 = new StringBuffer(0);
    arrayOfObject[0] = stringBuffer1.toString();
    arrayOfObject[1] = stringBuffer2.toString();
    arrayOfObject[2] = null;
    arrayOfObject[3] = new Byte((byte)0);
    arrayOfObject[4] = stringBuffer4.toString();
    byte b = 0;
    while (true) {
      char c;
      if ((c = paramArrayOfchar[b]) == '\n' && stringBuffer1.length() != 0 && stringBuffer2.length() != 0) {
        if (((String)arrayOfObject[4]).length() == 0)
          arrayOfObject[4] = "/"; 
        vector.addElement(arrayOfObject);
        stringBuffer2.setLength(0);
        stringBuffer1.setLength(0);
        stringBuffer3.setLength(0);
        stringBuffer4.setLength(0);
        (arrayOfObject = new Object[5])[0] = stringBuffer1.toString();
        arrayOfObject[1] = stringBuffer2.toString();
        arrayOfObject[2] = null;
        arrayOfObject[3] = new Byte((byte)0);
        arrayOfObject[4] = stringBuffer4.toString();
      } 
      if (c == '<')
        switch (paramArrayOfchar[b + 1]) {
          case 'A':
          case 'a':
            if (paramArrayOfchar[b + 2] == ' ' && paramArrayOfchar[b + 3] != '\n') {
              while (paramArrayOfchar[b] != '"' && paramArrayOfchar[b] != '\n')
                b++; 
              while (true) {
                if (paramArrayOfchar[++b] != '"' && paramArrayOfchar[b] != '\n') {
                  stringBuffer1.append(paramArrayOfchar[b]);
                  continue;
                } 
                break;
              } 
              String str = stringBuffer1.toString();
              arrayOfObject[0] = "op:bkmfolder".equals(str) ? v.c(26210) : str;
              while (paramArrayOfchar[b] != '>')
                b++; 
              while (true) {
                if (paramArrayOfchar[++b] != '<') {
                  stringBuffer2.append(paramArrayOfchar[b]);
                  continue;
                } 
                arrayOfObject[1] = stringBuffer2.toString();
                break;
              } 
            } 
            break;
          case 'I':
          case 'i':
            if (a(paramArrayOfchar, "mg", b + 2)) {
              while (!a(paramArrayOfchar, "src", b) && paramArrayOfchar[b + 3] != '\n')
                b++; 
              while (paramArrayOfchar[b] != '"' && paramArrayOfchar[b] != '\n')
                b++; 
              while (true) {
                if (paramArrayOfchar[++b] != '"' && paramArrayOfchar[b] != '\n') {
                  stringBuffer3.append(paramArrayOfchar[b]);
                  continue;
                } 
                break;
              } 
              String str;
              if ((str = stringBuffer3.toString()) != null && str.length() >= 5) {
                a(stringBuffer5.append(v.d(471)).append(str).toString());
                stringBuffer5.setLength(0);
                if (str.toLowerCase().startsWith("data:image/png;base64,")) {
                  try {
                    arrayOfObject[2] = v.a(str.substring(22).getBytes());
                  } catch (Throwable throwable) {}
                } else {
                  arrayOfObject[2] = a(stringBuffer5.append(this.a.a()).append(str).toString(), 2);
                } 
                stringBuffer5.setLength(0);
                a(v.d(328));
                break;
              } 
              arrayOfObject[2] = null;
            } 
            break;
          case 'P':
          case 'p':
            if (a(paramArrayOfchar, "ar", b + 2)) {
              for (b += 15; !a(paramArrayOfchar, "val", b) && paramArrayOfchar[b + 3] != '\n'; b++);
              for (b += 4; paramArrayOfchar[b] != '"' && paramArrayOfchar[b] != '\n'; b++);
              arrayOfObject[3] = new Byte((byte)v.a(String.valueOf(paramArrayOfchar[++b]), 0));
              if (paramArrayOfchar[b + 1] == ':') {
                while (paramArrayOfchar[++b] != '"' && paramArrayOfchar[++b] != '\n') {
                  stringBuffer4.append(paramArrayOfchar[b]);
                  b++;
                } 
                arrayOfObject[4] = stringBuffer4.toString();
              } else {
                arrayOfObject[4] = "/";
              } 
              if (z.a(arrayOfObject))
                arrayOfObject[3] = new Byte((byte)0); 
            } 
            break;
        }  
      if (++b >= i) {
        af.b.f();
        return vector;
      } 
    } 
  }
  
  private static boolean a(char[] paramArrayOfchar, String paramString, int paramInt) {
    return ((paramArrayOfchar[paramInt] == paramString.charAt(0) || paramArrayOfchar[paramInt] == v.b(paramString.charAt(0))) && (paramArrayOfchar[paramInt + 1] == paramString.charAt(1) || paramArrayOfchar[paramInt + 1] == v.b(paramString.charAt(1))));
  }
  
  private Vector a(Vector paramVector) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 11
    //   4: aload_1
    //   5: invokevirtual isEmpty : ()Z
    //   8: ifeq -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: aload_1
    //   14: invokevirtual size : ()I
    //   17: istore_3
    //   18: new java/util/Vector
    //   21: dup
    //   22: iconst_0
    //   23: invokespecial <init> : (I)V
    //   26: astore #4
    //   28: iload_3
    //   29: iconst_2
    //   30: iadd
    //   31: anewarray java/lang/StringBuffer
    //   34: dup
    //   35: astore #5
    //   37: iconst_0
    //   38: new java/lang/StringBuffer
    //   41: dup
    //   42: ldc '<!DOCTYPE NETSCAPE-Bookmark-file-1>\\n<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=UTF-8">\\n<!--This is generated file from Opera Mini mod v.3.12.\\nIt will be read and overwritten.\\nDo Not Edit! -->\\n<TITLE>Bookmarks</TITLE>\\n<H1>Bookmarks</H1>\\n<DL><P>\\n'
    //   44: invokespecial <init> : (Ljava/lang/String;)V
    //   47: aastore
    //   48: aload #5
    //   50: aload #5
    //   52: arraylength
    //   53: iconst_1
    //   54: isub
    //   55: new java/lang/StringBuffer
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: ldc '</DL><P>'
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   67: aastore
    //   68: iconst_0
    //   69: istore #11
    //   71: aload_0
    //   72: iload_3
    //   73: newarray short
    //   75: putfield a : [S
    //   78: iconst_0
    //   79: istore #10
    //   81: iload #10
    //   83: iload_3
    //   84: if_icmpge -> 442
    //   87: aload #5
    //   89: iload #10
    //   91: iconst_1
    //   92: iadd
    //   93: new java/lang/StringBuffer
    //   96: dup
    //   97: ldc '<DT><img src="'
    //   99: invokespecial <init> : (Ljava/lang/String;)V
    //   102: aastore
    //   103: aload_1
    //   104: iload #10
    //   106: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   109: checkcast [Ljava/lang/Object;
    //   112: dup
    //   113: astore_2
    //   114: invokestatic a : ([Ljava/lang/Object;)Z
    //   117: ifeq -> 148
    //   120: aload #4
    //   122: aconst_null
    //   123: invokevirtual addElement : (Ljava/lang/Object;)V
    //   126: aload_0
    //   127: getfield a : [S
    //   130: iload #10
    //   132: iconst_0
    //   133: sastore
    //   134: aload #5
    //   136: iload #10
    //   138: iconst_1
    //   139: iadd
    //   140: aaload
    //   141: iconst_0
    //   142: invokevirtual setLength : (I)V
    //   145: goto -> 436
    //   148: aload_2
    //   149: iconst_0
    //   150: aaload
    //   151: checkcast java/lang/String
    //   154: ldc '0/'
    //   156: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   159: ifne -> 176
    //   162: aload_2
    //   163: iconst_0
    //   164: aaload
    //   165: checkcast java/lang/String
    //   168: ldc '1/'
    //   170: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   173: ifeq -> 189
    //   176: aload_2
    //   177: iconst_0
    //   178: aaload
    //   179: checkcast java/lang/String
    //   182: iconst_2
    //   183: invokevirtual substring : (I)Ljava/lang/String;
    //   186: goto -> 195
    //   189: aload_2
    //   190: iconst_0
    //   191: aaload
    //   192: checkcast java/lang/String
    //   195: astore #7
    //   197: aload_2
    //   198: iconst_1
    //   199: aaload
    //   200: checkcast java/lang/String
    //   203: astore #6
    //   205: aload_2
    //   206: iconst_2
    //   207: aaload
    //   208: checkcast [B
    //   211: dup
    //   212: astore #8
    //   214: ifnull -> 223
    //   217: aload #8
    //   219: arraylength
    //   220: ifgt -> 226
    //   223: aconst_null
    //   224: astore #8
    //   226: aload_2
    //   227: iconst_3
    //   228: aaload
    //   229: checkcast java/lang/Byte
    //   232: dup
    //   233: astore #9
    //   235: invokevirtual byteValue : ()B
    //   238: iconst_4
    //   239: if_icmpne -> 246
    //   242: ldc 'op:bkmfolder'
    //   244: astore #7
    //   246: aload_2
    //   247: iconst_4
    //   248: aaload
    //   249: checkcast java/lang/String
    //   252: astore_2
    //   253: aload #4
    //   255: aload #8
    //   257: invokevirtual addElement : (Ljava/lang/Object;)V
    //   260: aload #9
    //   262: invokevirtual byteValue : ()B
    //   265: iconst_4
    //   266: if_icmpeq -> 361
    //   269: iinc #11, 1
    //   272: aload_0
    //   273: getfield a : I
    //   276: iconst_1
    //   277: if_icmpne -> 316
    //   280: aload #8
    //   282: ifnull -> 316
    //   285: aload #5
    //   287: iload #10
    //   289: iconst_1
    //   290: iadd
    //   291: aaload
    //   292: iload #11
    //   294: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   297: ldc '.png'
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   302: pop
    //   303: aload_0
    //   304: getfield a : [S
    //   307: iload #10
    //   309: iload #11
    //   311: i2s
    //   312: sastore
    //   313: goto -> 369
    //   316: aload_0
    //   317: getfield a : I
    //   320: iconst_2
    //   321: if_icmpne -> 369
    //   324: aload #8
    //   326: ifnull -> 369
    //   329: aload #5
    //   331: iload #10
    //   333: iconst_1
    //   334: iadd
    //   335: aaload
    //   336: ldc 'data:image/png;base64,'
    //   338: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   341: new java/lang/String
    //   344: dup
    //   345: aload #8
    //   347: iconst_0
    //   348: aload #8
    //   350: arraylength
    //   351: invokestatic a : ([BII)[B
    //   354: invokespecial <init> : ([B)V
    //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   360: pop
    //   361: aload_0
    //   362: getfield a : [S
    //   365: iload #10
    //   367: iconst_0
    //   368: sastore
    //   369: aload #5
    //   371: iload #10
    //   373: iconst_1
    //   374: iadd
    //   375: aaload
    //   376: bipush #34
    //   378: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   381: ldc ' alt="" width="12" height="12" /><A HREF="'
    //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   386: aload #7
    //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   391: ldc '">'
    //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   396: aload #6
    //   398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   401: ldc '</A>'
    //   403: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   406: ldc '<PARAM NAME="fav" VALUE="'
    //   408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   411: aload #9
    //   413: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   416: bipush #58
    //   418: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   421: aload_2
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   425: ldc '">'
    //   427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   430: bipush #10
    //   432: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   435: pop
    //   436: iinc #10, 1
    //   439: goto -> 81
    //   442: aload #4
    //   444: aload #5
    //   446: invokevirtual addElement : (Ljava/lang/Object;)V
    //   449: goto -> 453
    //   452: pop
    //   453: aload #4
    //   455: areturn
    // Exception table:
    //   from	to	target	type
    //   87	449	452	java/lang/Throwable
  }
  
  private void a(Vector paramVector) {
    v.C();
    a(v.a(v.d(327), v.d(328)));
    if ((paramVector = a(paramVector)) == null || paramVector.isEmpty() || this.a == null || this.a.length == 0) {
      af.b.f();
      this.a.a();
      return;
    } 
    int i = paramVector.size();
    a(v.d(329));
    StringBuffer stringBuffer = new StringBuffer(0);
    if (a(paramVector.elementAt(i - 1), stringBuffer.append(this.a.a()).append("bookmark").append(".htm").toString(), 1)) {
      if (this.a == true)
        for (byte b = 0; b < i - 1; b++) {
          Thread thread;
          if ((thread = this.a[b]) != null) {
            stringBuffer.setLength(0);
            a(stringBuffer.append(v.d(330)).append(Integer.toString(b + 1)).append('/').append(Integer.toString(i - 1)).toString());
            stringBuffer.setLength(0);
            a(paramVector.elementAt(b), stringBuffer.append(this.a.a()).append(thread).append(".png").toString(), 2);
          } 
        }  
      af.b.b(false, (v)((af)af.b).a);
      this.a.b();
      af.b.b(26189);
    } else {
      af.b.a(false, (v)((af)af.b).a);
      this.a.a();
    } 
    af.b.f();
  }
  
  private boolean a(Object paramObject, String paramString, int paramInt) {
    // Byte code:
    //   0: getstatic v.a : [Lag;
    //   3: getstatic af.b : Laf;
    //   6: getfield a : Lv;
    //   9: getfield c : B
    //   12: aaload
    //   13: aload_2
    //   14: invokeinterface a : (Ljava/lang/String;)V
    //   19: new java/lang/StringBuffer
    //   22: dup
    //   23: iconst_0
    //   24: invokespecial <init> : (I)V
    //   27: astore_0
    //   28: new java/lang/StringBuffer
    //   31: dup
    //   32: iconst_0
    //   33: invokespecial <init> : (I)V
    //   36: astore_2
    //   37: iload_3
    //   38: iconst_1
    //   39: if_icmpne -> 236
    //   42: aload_1
    //   43: checkcast [Ljava/lang/StringBuffer;
    //   46: dup
    //   47: astore_1
    //   48: arraylength
    //   49: istore_3
    //   50: new java/io/ByteArrayOutputStream
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: astore #4
    //   59: new java/io/DataOutputStream
    //   62: dup
    //   63: aload #4
    //   65: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   68: astore #5
    //   70: iconst_0
    //   71: istore #8
    //   73: iload #8
    //   75: iload_3
    //   76: if_icmpge -> 209
    //   79: aload_0
    //   80: iconst_0
    //   81: invokevirtual setLength : (I)V
    //   84: aload_2
    //   85: iconst_0
    //   86: invokevirtual setLength : (I)V
    //   89: aload_0
    //   90: sipush #329
    //   93: invokestatic d : (I)Ljava/lang/String;
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   99: iload #8
    //   101: ifeq -> 138
    //   104: iload #8
    //   106: iload_3
    //   107: iconst_1
    //   108: isub
    //   109: if_icmpeq -> 138
    //   112: aload_2
    //   113: iload #8
    //   115: invokestatic toString : (I)Ljava/lang/String;
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   121: bipush #47
    //   123: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   126: iload_3
    //   127: iconst_2
    //   128: isub
    //   129: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   132: invokevirtual toString : ()Ljava/lang/String;
    //   135: goto -> 140
    //   138: ldc ''
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   143: invokevirtual toString : ()Ljava/lang/String;
    //   146: invokestatic a : (Ljava/lang/String;)V
    //   149: aload_1
    //   150: iload #8
    //   152: aaload
    //   153: invokevirtual toString : ()Ljava/lang/String;
    //   156: invokevirtual toCharArray : ()[C
    //   159: dup
    //   160: astore #6
    //   162: iconst_0
    //   163: aload #6
    //   165: arraylength
    //   166: aconst_null
    //   167: iconst_0
    //   168: iconst_1
    //   169: invokestatic a : ([CII[BIZ)I
    //   172: newarray byte
    //   174: astore #7
    //   176: aload #6
    //   178: iconst_0
    //   179: aload #6
    //   181: arraylength
    //   182: aload #7
    //   184: iconst_0
    //   185: iconst_0
    //   186: invokestatic a : ([CII[BIZ)I
    //   189: pop
    //   190: aload #5
    //   192: aload #7
    //   194: invokevirtual write : ([B)V
    //   197: goto -> 203
    //   200: pop
    //   201: iconst_0
    //   202: ireturn
    //   203: iinc #8, 1
    //   206: goto -> 73
    //   209: getstatic v.a : [Lag;
    //   212: getstatic af.b : Laf;
    //   215: getfield a : Lv;
    //   218: getfield c : B
    //   221: aaload
    //   222: aload #4
    //   224: invokevirtual toByteArray : ()[B
    //   227: invokeinterface a : ([B)Z
    //   232: pop
    //   233: goto -> 270
    //   236: aload_1
    //   237: checkcast [B
    //   240: dup
    //   241: astore_1
    //   242: ifnull -> 270
    //   245: aload_1
    //   246: arraylength
    //   247: ifle -> 270
    //   250: getstatic v.a : [Lag;
    //   253: getstatic af.b : Laf;
    //   256: getfield a : Lv;
    //   259: getfield c : B
    //   262: aaload
    //   263: aload_1
    //   264: invokeinterface a : ([B)Z
    //   269: pop
    //   270: getstatic af.b : Laf;
    //   273: invokevirtual f : ()V
    //   276: iconst_1
    //   277: ireturn
    // Exception table:
    //   from	to	target	type
    //   190	197	200	java/io/IOException
  }
  
  public final void a() {
    this.a = (Thread)v.a(0, (a)((v)((af)af.b).a).c, false, 2147483647, (String)null, false, false, false);
    this.b = 0;
    if (this.a != null && !this.a.isEmpty()) {
      this.a = (Thread)new boolean[this.a.size()];
      this.d = this.a.size();
      c();
    } 
  }
  
  private void c() {
    this.d = this.a.size();
    this.c = v.b(this.b + 25, this.d);
    this.a = (Thread)new List("", 2);
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = this.b; i < this.c; i++) {
      Object[] arrayOfObject;
      String str2 = v.a((String)(arrayOfObject = this.a.elementAt(i))[0], false);
      String str1 = (String)arrayOfObject[1];
      stringBuffer.setLength(0);
      this.a.append(stringBuffer.append(str1).append(' ').append(str2).toString(), null);
      this.a.setSelectedIndex(i - this.b, this.a[i]);
    } 
    stringBuffer.setLength(0);
    this.a.setTitle(stringBuffer.append(this.b + 1).append('-').append(this.c).append('/').append(this.d).toString());
    this.a.addCommand((Command)this.a);
    this.a.addCommand(this.b);
    if (this.c != this.d)
      this.a.addCommand(this.c); 
    if (this.b != 0)
      this.a.addCommand(this.d); 
    this.a.setCommandListener(this);
    v.a((Displayable)this.a);
  }
  
  private void d() {
    for (int i = this.b; i < this.c; i++) {
      int j = i - this.b;
      this.a[i] = this.a.isSelected(j);
    } 
  }
  
  private static Object a(String paramString, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 12
    //   4: aload_0
    //   5: invokevirtual length : ()I
    //   8: iconst_4
    //   9: if_icmpge -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: getstatic v.a : [Lag;
    //   17: getstatic af.b : Laf;
    //   20: getfield a : Lv;
    //   23: getfield c : B
    //   26: aaload
    //   27: aload_0
    //   28: invokeinterface a : (Ljava/lang/String;)V
    //   33: getstatic v.a : [Lag;
    //   36: getstatic af.b : Laf;
    //   39: getfield a : Lv;
    //   42: getfield c : B
    //   45: aaload
    //   46: invokeinterface b : ()Z
    //   51: ifne -> 56
    //   54: aconst_null
    //   55: areturn
    //   56: getstatic v.a : [Lag;
    //   59: getstatic af.b : Laf;
    //   62: getfield a : Lv;
    //   65: getfield c : B
    //   68: aaload
    //   69: invokeinterface b : ()J
    //   74: l2i
    //   75: istore_0
    //   76: getstatic v.a : [Lag;
    //   79: getstatic af.b : Laf;
    //   82: getfield a : Lv;
    //   85: getfield c : B
    //   88: aaload
    //   89: invokeinterface a : ()[B
    //   94: astore_2
    //   95: iload_1
    //   96: iconst_1
    //   97: if_icmpne -> 115
    //   100: iload_0
    //   101: newarray char
    //   103: astore_0
    //   104: aload_2
    //   105: iconst_0
    //   106: aload_2
    //   107: arraylength
    //   108: aload_0
    //   109: invokestatic a : ([BII[C)I
    //   112: pop
    //   113: aload_0
    //   114: areturn
    //   115: aload_2
    //   116: areturn
  }
  
  private static void a(Vector paramVector, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 11
    //   4: aload_0
    //   5: invokevirtual isEmpty : ()Z
    //   8: ifeq -> 12
    //   11: return
    //   12: getstatic v.a : Lz;
    //   15: iconst_1
    //   16: putfield f : Z
    //   19: getstatic v.a : Lz;
    //   22: invokevirtual a : ()V
    //   25: new java/lang/StringBuffer
    //   28: dup
    //   29: iconst_0
    //   30: invokespecial <init> : (I)V
    //   33: astore_2
    //   34: iload_1
    //   35: ifne -> 44
    //   38: getstatic k.a : Z
    //   41: ifeq -> 164
    //   44: aload_0
    //   45: invokevirtual size : ()I
    //   48: istore_3
    //   49: iconst_0
    //   50: istore #4
    //   52: iload #4
    //   54: iload_3
    //   55: if_icmpge -> 161
    //   58: aload_0
    //   59: iload #4
    //   61: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   64: checkcast [Ljava/lang/Object;
    //   67: astore #5
    //   69: getstatic k.a : Z
    //   72: ifeq -> 144
    //   75: iload_1
    //   76: ifne -> 144
    //   79: aload_2
    //   80: iconst_0
    //   81: invokevirtual setLength : (I)V
    //   84: aload #5
    //   86: iconst_4
    //   87: aload_2
    //   88: getstatic v.a : Lz;
    //   91: getfield a : Ljava/lang/String;
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   97: aload #5
    //   99: iconst_4
    //   100: aaload
    //   101: checkcast java/lang/String
    //   104: ifnull -> 135
    //   107: aload #5
    //   109: iconst_4
    //   110: aaload
    //   111: checkcast java/lang/String
    //   114: invokevirtual length : ()I
    //   117: iconst_1
    //   118: if_icmple -> 135
    //   121: aload #5
    //   123: iconst_4
    //   124: aaload
    //   125: checkcast java/lang/String
    //   128: iconst_1
    //   129: invokevirtual substring : (I)Ljava/lang/String;
    //   132: goto -> 137
    //   135: ldc ''
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   140: invokevirtual toString : ()Ljava/lang/String;
    //   143: aastore
    //   144: getstatic v.a : Lz;
    //   147: getfield a : Ljava/util/Vector;
    //   150: aload #5
    //   152: invokevirtual addElement : (Ljava/lang/Object;)V
    //   155: iinc #4, 1
    //   158: goto -> 52
    //   161: goto -> 179
    //   164: getstatic v.a : Lz;
    //   167: aload_0
    //   168: putfield a : Ljava/util/Vector;
    //   171: getstatic v.a : Lz;
    //   174: ldc '/'
    //   176: putfield a : Ljava/lang/String;
    //   179: getstatic v.a : Lz;
    //   182: getfield a : Ljava/util/Vector;
    //   185: iconst_0
    //   186: invokestatic a : (Ljava/util/Vector;Z)Z
    //   189: pop
    //   190: iload_1
    //   191: ifne -> 200
    //   194: getstatic v.x : Z
    //   197: ifne -> 208
    //   200: getstatic af.b : Laf;
    //   203: bipush #97
    //   205: invokevirtual b : (I)V
    //   208: return
  }
  
  private static void a(String paramString) {
    af.b.a(false, (v)((af)af.b).a);
    a = (Thread)new Object();
    ((af)af.b).g = paramString;
    ((af)af.b).h = v.a(v.d(332), "...");
    v.a(new l(99));
    try {
      synchronized (a) {
        a.wait(200L);
      } 
    } catch (Exception exception) {}
    a = null;
  }
  
  public static void b() {
    try {
      synchronized (a) {
        a.notify();
        return;
      } 
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    Vector vector;
    if (paramCommand == this.a) {
      d();
      vector = new Vector(this.d);
      for (byte b = 0; b < this.d; b++) {
        if (this.a[b] != null) {
          Object[] arrayOfObject;
          (arrayOfObject = new Object[5])[0] = ((String[])this.a.elementAt(b))[0];
          arrayOfObject[1] = ((String[])this.a.elementAt(b))[1];
          arrayOfObject[2] = null;
          arrayOfObject[3] = new Byte((byte)0);
          arrayOfObject[4] = v.a.a;
          vector.addElement(arrayOfObject);
        } 
      } 
      this.a = null;
      v.a((Displayable)af.b);
      a(vector, true);
      return;
    } 
    if (vector == this.b) {
      v.a((Displayable)af.b);
      return;
    } 
    if (vector == this.c) {
      d();
      this.b += 25;
      c();
      return;
    } 
    if (vector == this.d) {
      d();
      this.b -= 25;
      c();
    } 
  }
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : I
    //   4: bipush #27
    //   6: if_icmpne -> 217
    //   9: getstatic v.a : Lz;
    //   12: getfield e : Z
    //   15: ifeq -> 198
    //   18: aload_0
    //   19: new java/util/Vector
    //   22: dup
    //   23: getstatic v.a : Lz;
    //   26: getfield a : Ljava/util/Vector;
    //   29: invokevirtual size : ()I
    //   32: invokespecial <init> : (I)V
    //   35: astore_1
    //   36: iconst_0
    //   37: istore_3
    //   38: iload_3
    //   39: getstatic v.a : Lz;
    //   42: getfield a : Ljava/util/Vector;
    //   45: invokevirtual size : ()I
    //   48: if_icmpge -> 191
    //   51: getstatic v.a : Lz;
    //   54: getfield a : Ljava/util/Vector;
    //   57: iload_3
    //   58: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   61: checkcast [Ljava/lang/Object;
    //   64: dup
    //   65: astore_2
    //   66: ifnull -> 185
    //   69: getstatic v.a : Lz;
    //   72: getfield c : Ljava/util/Vector;
    //   75: aload_2
    //   76: invokevirtual contains : (Ljava/lang/Object;)Z
    //   79: ifeq -> 185
    //   82: aload_1
    //   83: aload_2
    //   84: invokevirtual contains : (Ljava/lang/Object;)Z
    //   87: ifne -> 95
    //   90: aload_1
    //   91: aload_2
    //   92: invokevirtual addElement : (Ljava/lang/Object;)V
    //   95: aload_2
    //   96: invokestatic a : ([Ljava/lang/Object;)B
    //   99: iconst_4
    //   100: if_icmpne -> 185
    //   103: getstatic v.a : Lz;
    //   106: getfield a : Ljava/lang/String;
    //   109: aload_2
    //   110: iconst_1
    //   111: aaload
    //   112: checkcast java/lang/String
    //   115: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   118: astore #4
    //   120: iconst_0
    //   121: istore #5
    //   123: iload #5
    //   125: getstatic v.a : Lz;
    //   128: getfield a : Ljava/util/Vector;
    //   131: invokevirtual size : ()I
    //   134: if_icmpge -> 185
    //   137: getstatic v.a : Lz;
    //   140: getfield a : Ljava/util/Vector;
    //   143: iload #5
    //   145: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   148: checkcast [Ljava/lang/Object;
    //   151: dup
    //   152: astore_2
    //   153: iconst_4
    //   154: aaload
    //   155: checkcast java/lang/String
    //   158: aload #4
    //   160: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   163: ifeq -> 179
    //   166: aload_1
    //   167: aload_2
    //   168: invokevirtual contains : (Ljava/lang/Object;)Z
    //   171: ifne -> 179
    //   174: aload_1
    //   175: aload_2
    //   176: invokevirtual addElement : (Ljava/lang/Object;)V
    //   179: iinc #5, 1
    //   182: goto -> 123
    //   185: iinc #3, 1
    //   188: goto -> 38
    //   191: aload_1
    //   192: invokespecial a : (Ljava/util/Vector;)V
    //   195: goto -> 208
    //   198: aload_0
    //   199: getstatic v.a : Lz;
    //   202: getfield a : Ljava/util/Vector;
    //   205: invokespecial a : (Ljava/util/Vector;)V
    //   208: getstatic v.a : Lz;
    //   211: invokevirtual a : ()V
    //   214: goto -> 379
    //   217: aload_0
    //   218: getfield e : I
    //   221: bipush #28
    //   223: if_icmpne -> 379
    //   226: aload_0
    //   227: aload_0
    //   228: getfield a : Lai;
    //   231: getfield b : Ljava/lang/String;
    //   234: astore_2
    //   235: astore_1
    //   236: aload_2
    //   237: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   240: ldc '.htm'
    //   242: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   245: ifeq -> 379
    //   248: getstatic v.a : Lz;
    //   251: iconst_1
    //   252: putfield f : Z
    //   255: invokestatic C : ()V
    //   258: sipush #327
    //   261: invokestatic d : (I)Ljava/lang/String;
    //   264: sipush #331
    //   267: invokestatic d : (I)Ljava/lang/String;
    //   270: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   273: invokestatic a : (Ljava/lang/String;)V
    //   276: aload_1
    //   277: getfield a : Lai;
    //   280: invokevirtual a : ()Ljava/lang/String;
    //   283: aload_2
    //   284: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   287: iconst_1
    //   288: invokestatic a : (Ljava/lang/String;I)Ljava/lang/Object;
    //   291: checkcast [C
    //   294: dup
    //   295: astore #4
    //   297: ifnull -> 379
    //   300: sipush #328
    //   303: invokestatic d : (I)Ljava/lang/String;
    //   306: invokestatic a : (Ljava/lang/String;)V
    //   309: aload_1
    //   310: aload #4
    //   312: invokespecial a : ([C)Ljava/util/Vector;
    //   315: dup
    //   316: astore #5
    //   318: ifnonnull -> 331
    //   321: aload_1
    //   322: getfield a : Lai;
    //   325: invokevirtual a : ()V
    //   328: goto -> 379
    //   331: getstatic af.b : Laf;
    //   334: getfield a : Lv;
    //   337: aconst_null
    //   338: putfield a : Ljava/util/Hashtable;
    //   341: getstatic af.b : Laf;
    //   344: getfield a : Lv;
    //   347: aconst_null
    //   348: putfield a : [Ljava/lang/String;
    //   351: aload #5
    //   353: iconst_0
    //   354: invokestatic a : (Ljava/util/Vector;Z)V
    //   357: getstatic v.x : Z
    //   360: ifeq -> 373
    //   363: getstatic af.b : Laf;
    //   366: getfield a : Lv;
    //   369: iconst_0
    //   370: invokevirtual d : (Z)V
    //   373: getstatic af.b : Laf;
    //   376: invokevirtual f : ()V
    //   379: getstatic af.b : Laf;
    //   382: iconst_1
    //   383: getstatic af.b : Laf;
    //   386: getfield a : Lv;
    //   389: invokevirtual b : (ZLv;)V
    //   392: iconst_0
    //   393: putstatic k.a : Z
    //   396: goto -> 597
    //   399: pop
    //   400: getstatic af.b : Laf;
    //   403: sipush #284
    //   406: invokestatic d : (I)Ljava/lang/String;
    //   409: invokevirtual c : (Ljava/lang/String;)V
    //   412: getstatic af.b : Laf;
    //   415: iconst_1
    //   416: getstatic af.b : Laf;
    //   419: getfield a : Lv;
    //   422: invokevirtual b : (ZLv;)V
    //   425: iconst_0
    //   426: putstatic k.a : Z
    //   429: goto -> 597
    //   432: pop
    //   433: getstatic af.b : Laf;
    //   436: iconst_1
    //   437: getstatic af.b : Laf;
    //   440: getfield a : Lv;
    //   443: invokevirtual b : (ZLv;)V
    //   446: iconst_0
    //   447: putstatic k.a : Z
    //   450: goto -> 597
    //   453: pop
    //   454: invokestatic C : ()V
    //   457: aload_0
    //   458: dup
    //   459: getfield a : B
    //   462: iconst_1
    //   463: iadd
    //   464: i2b
    //   465: dup_x1
    //   466: putfield a : B
    //   469: iconst_3
    //   470: if_icmpge -> 504
    //   473: aload_0
    //   474: getfield e : I
    //   477: bipush #27
    //   479: if_icmpeq -> 497
    //   482: aload_0
    //   483: getfield e : I
    //   486: bipush #28
    //   488: if_icmpne -> 504
    //   491: getstatic k.a : Z
    //   494: ifne -> 504
    //   497: aload_0
    //   498: invokevirtual run : ()V
    //   501: goto -> 557
    //   504: getstatic af.b : Laf;
    //   507: getfield a : Lv;
    //   510: ifnull -> 539
    //   513: getstatic af.b : Laf;
    //   516: getfield a : Lv;
    //   519: getfield c : La;
    //   522: ifnull -> 539
    //   525: getstatic af.b : Laf;
    //   528: getfield a : Lv;
    //   531: getfield c : La;
    //   534: bipush #9
    //   536: invokevirtual a : (I)V
    //   539: getstatic af.b : Laf;
    //   542: iconst_1
    //   543: getstatic af.b : Laf;
    //   546: getfield a : Lv;
    //   549: invokevirtual b : (ZLv;)V
    //   552: iconst_0
    //   553: putstatic k.a : Z
    //   556: return
    //   557: getstatic af.b : Laf;
    //   560: iconst_1
    //   561: getstatic af.b : Laf;
    //   564: getfield a : Lv;
    //   567: invokevirtual b : (ZLv;)V
    //   570: iconst_0
    //   571: putstatic k.a : Z
    //   574: goto -> 597
    //   577: astore_0
    //   578: getstatic af.b : Laf;
    //   581: iconst_1
    //   582: getstatic af.b : Laf;
    //   585: getfield a : Lv;
    //   588: invokevirtual b : (ZLv;)V
    //   591: iconst_0
    //   592: putstatic k.a : Z
    //   595: aload_0
    //   596: athrow
    //   597: aload_0
    //   598: aconst_null
    //   599: putfield a : Ljava/lang/Thread;
    //   602: getstatic af.b : Laf;
    //   605: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   608: return
    // Exception table:
    //   from	to	target	type
    //   0	379	399	java/lang/SecurityException
    //   0	379	432	java/lang/Exception
    //   0	379	453	java/lang/OutOfMemoryError
    //   0	379	577	finally
    //   399	412	577	finally
    //   453	539	577	finally
  }
  
  public final void a(int paramInt) {
    if (this.a == null) {
      this.e = paramInt;
      this.a = v.a(this);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\k.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */