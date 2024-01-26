public final class s {
  private String e;
  
  public String a;
  
  public String b;
  
  private String f;
  
  public String c;
  
  public int a;
  
  public String d;
  
  private String g;
  
  private String h;
  
  private String i;
  
  public s(String paramString) {
    this(null, paramString);
  }
  
  public s(s params, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield a : I
    //   9: aconst_null
    //   10: astore_3
    //   11: iconst_0
    //   12: istore #4
    //   14: iconst_0
    //   15: istore #5
    //   17: aload_2
    //   18: invokevirtual length : ()I
    //   21: istore #6
    //   23: iload #6
    //   25: ifle -> 47
    //   28: aload_2
    //   29: iload #6
    //   31: iconst_1
    //   32: isub
    //   33: invokevirtual charAt : (I)C
    //   36: bipush #32
    //   38: if_icmpgt -> 47
    //   41: iinc #6, -1
    //   44: goto -> 23
    //   47: iconst_0
    //   48: istore #7
    //   50: iload #7
    //   52: iload #6
    //   54: if_icmpge -> 74
    //   57: aload_2
    //   58: iload #7
    //   60: invokevirtual charAt : (I)C
    //   63: bipush #32
    //   65: if_icmpgt -> 74
    //   68: iinc #7, 1
    //   71: goto -> 50
    //   74: iload #7
    //   76: aload_2
    //   77: invokevirtual length : ()I
    //   80: if_icmpge -> 97
    //   83: aload_2
    //   84: iload #7
    //   86: invokevirtual charAt : (I)C
    //   89: bipush #35
    //   91: if_icmpne -> 97
    //   94: iconst_1
    //   95: istore #4
    //   97: iload #7
    //   99: istore #8
    //   101: iload #4
    //   103: ifne -> 192
    //   106: iload #8
    //   108: iload #6
    //   110: if_icmpge -> 192
    //   113: aload_2
    //   114: iload #8
    //   116: invokevirtual charAt : (I)C
    //   119: dup
    //   120: istore #9
    //   122: bipush #47
    //   124: if_icmpeq -> 192
    //   127: iload #9
    //   129: bipush #58
    //   131: if_icmpne -> 186
    //   134: aload_2
    //   135: iload #7
    //   137: iload #8
    //   139: invokevirtual substring : (II)Ljava/lang/String;
    //   142: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   145: dup
    //   146: astore #4
    //   148: astore #9
    //   150: ldc 'http'
    //   152: aload #9
    //   154: invokevirtual equals : (Ljava/lang/Object;)Z
    //   157: ifne -> 174
    //   160: aload #4
    //   162: astore #9
    //   164: ldc 'ftp'
    //   166: aload #9
    //   168: invokevirtual equals : (Ljava/lang/Object;)Z
    //   171: ifeq -> 192
    //   174: aload #4
    //   176: astore_3
    //   177: iload #8
    //   179: iconst_1
    //   180: iadd
    //   181: istore #7
    //   183: goto -> 192
    //   186: iinc #8, 1
    //   189: goto -> 101
    //   192: aload_0
    //   193: aload_3
    //   194: putfield e : Ljava/lang/String;
    //   197: aload_1
    //   198: ifnull -> 308
    //   201: aload_3
    //   202: ifnull -> 216
    //   205: aload_3
    //   206: aload_1
    //   207: getfield e : Ljava/lang/String;
    //   210: invokevirtual equals : (Ljava/lang/Object;)Z
    //   213: ifeq -> 308
    //   216: aload_1
    //   217: getfield h : Ljava/lang/String;
    //   220: ifnull -> 237
    //   223: aload_1
    //   224: getfield h : Ljava/lang/String;
    //   227: bipush #47
    //   229: invokestatic b : (Ljava/lang/String;C)Z
    //   232: ifeq -> 237
    //   235: aconst_null
    //   236: astore_3
    //   237: aload_3
    //   238: ifnonnull -> 308
    //   241: aload_0
    //   242: aload_1
    //   243: getfield e : Ljava/lang/String;
    //   246: putfield e : Ljava/lang/String;
    //   249: aload_0
    //   250: aload_1
    //   251: getfield f : Ljava/lang/String;
    //   254: putfield f : Ljava/lang/String;
    //   257: aload_0
    //   258: aload_1
    //   259: getfield a : Ljava/lang/String;
    //   262: putfield a : Ljava/lang/String;
    //   265: aload_0
    //   266: aload_1
    //   267: getfield b : Ljava/lang/String;
    //   270: putfield b : Ljava/lang/String;
    //   273: aload_0
    //   274: aload_1
    //   275: getfield c : Ljava/lang/String;
    //   278: putfield c : Ljava/lang/String;
    //   281: aload_0
    //   282: aload_1
    //   283: getfield a : I
    //   286: putfield a : I
    //   289: aload_0
    //   290: aload_1
    //   291: getfield d : Ljava/lang/String;
    //   294: putfield d : Ljava/lang/String;
    //   297: aload_0
    //   298: aload_1
    //   299: getfield h : Ljava/lang/String;
    //   302: putfield h : Ljava/lang/String;
    //   305: iconst_1
    //   306: istore #5
    //   308: aload_2
    //   309: bipush #35
    //   311: iload #7
    //   313: invokevirtual indexOf : (II)I
    //   316: dup
    //   317: istore #8
    //   319: iflt -> 340
    //   322: aload_0
    //   323: aload_2
    //   324: iload #8
    //   326: iconst_1
    //   327: iadd
    //   328: iload #6
    //   330: invokevirtual substring : (II)Ljava/lang/String;
    //   333: putfield i : Ljava/lang/String;
    //   336: iload #8
    //   338: istore #6
    //   340: iload #5
    //   342: ifeq -> 375
    //   345: iload #7
    //   347: iload #6
    //   349: if_icmpne -> 375
    //   352: aload_0
    //   353: aload_1
    //   354: getfield g : Ljava/lang/String;
    //   357: putfield g : Ljava/lang/String;
    //   360: aload_0
    //   361: getfield i : Ljava/lang/String;
    //   364: ifnonnull -> 375
    //   367: aload_0
    //   368: aload_1
    //   369: getfield i : Ljava/lang/String;
    //   372: putfield i : Ljava/lang/String;
    //   375: aload_0
    //   376: aload_2
    //   377: iload #7
    //   379: iload #6
    //   381: invokestatic a : (Ls;Ljava/lang/String;II)V
    //   384: return
  }
  
  public static String a(String paramString) {
    if (paramString.startsWith("http://")) {
      paramString = paramString.substring(7);
    } else if (paramString.startsWith("https://")) {
      paramString = paramString.substring(8);
    } else if (paramString.startsWith("socket://")) {
      paramString = paramString.substring(9);
    } 
    if (paramString.startsWith("www."))
      paramString = paramString.substring(4); 
    return paramString;
  }
  
  public static String b(String paramString) {
    int i;
    if ((i = paramString.indexOf("://")) != -1)
      paramString = paramString.substring(i + 3); 
    return paramString;
  }
  
  public static String c(String paramString) {
    String str = "";
    int i;
    if (paramString != null && (i = (str = b(paramString)).indexOf("/")) != -1)
      str = str.substring(0, i); 
    return str;
  }
  
  public static String d(String paramString) {
    int i = paramString.indexOf("://");
    if ((paramString = paramString) != null && (i = paramString.indexOf("/", i + 3)) != -1)
      paramString = paramString.substring(0, i); 
    return paramString;
  }
  
  private static void a(s params, String paramString, int paramInt1, int paramInt2) {
    String str2 = params.f;
    int i = params.a;
    String str3 = params.b;
    String str4 = params.c;
    int j = params.a;
    String str6 = params.h;
    String str7 = params.g;
    String str8 = params.i;
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramInt1 < paramInt2) {
      int k;
      bool2 = ((k = paramString.indexOf('?')) == paramInt1) ? true : false;
      if (k != -1 && k < paramInt2) {
        str7 = paramString.substring(k + 1, paramInt2);
        if (paramInt2 > k)
          paramInt2 = k; 
        paramString = paramString.substring(0, k);
      } 
    } 
    if (paramInt1 <= paramInt2 - 2 && paramString.charAt(paramInt1) == '/' && paramString.charAt(paramInt1 + 1) == '/') {
      paramInt1 += 2;
      int k;
      if ((k = paramString.indexOf('/', paramInt1)) < 0 && (k = paramString.indexOf('?', paramInt1)) < 0)
        k = paramInt2; 
      str4 = str2 = paramString.substring(paramInt1, k);
      int m;
      if ((m = str2.indexOf('@')) != -1) {
        if ((paramInt1 = (object = str2.substring(0, m)).indexOf(':')) != -1) {
          str3 = object.substring(paramInt1 + 1, object.length());
          object = object.substring(0, paramInt1);
        } 
        str4 = str2.substring(m + 1);
      } else {
        object = null;
        str3 = null;
      } 
      if (str4 != null) {
        paramInt1 = str4.indexOf(':');
        j = -1;
        if (paramInt1 >= 0) {
          if (str4.length() > paramInt1 + 1)
            j = v.b(str4.substring(paramInt1 + 1), 0); 
          if (j != 0)
            str4 = str4.substring(0, paramInt1); 
        } 
      } else {
        str4 = "";
      } 
      if (j < -1)
        throw new IllegalArgumentException(); 
      paramInt1 = k;
      if (str2 != null && str2.length() > 0)
        str6 = ""; 
    } 
    if (str4 == null)
      str4 = ""; 
    if (paramInt1 < paramInt2) {
      if (paramString.charAt(paramInt1) == '/') {
        str6 = paramString.substring(paramInt1, paramInt2);
      } else if (str6 != null && str6.length() > 0) {
        bool1 = true;
        int k = str6.lastIndexOf('/');
        String str = "";
        if (k == -1 && str2 != null)
          str = "/"; 
        str6 = v.a(str6.substring(0, k + 1), str, paramString.substring(paramInt1, paramInt2));
      } else {
        str6 = v.a((str2 == null) ? "" : "/", paramString.substring(paramInt1, paramInt2));
      } 
    } else if (bool2 && str6 != null) {
      int k;
      if ((k = str6.lastIndexOf('/')) < 0)
        k = 0; 
      str6 = v.a(str6.substring(0, k), "/");
    } 
    if (str6 == null)
      str6 = ""; 
    if (bool1) {
      int k;
      while ((k = str6.indexOf("/./")) >= 0)
        str6 = v.a(str6.substring(0, k), str6.substring(k + 2)); 
      label108: while (true) {
        for (int n = 0; (n = str6.indexOf("/../", n)) > 0; n += 3) {
          if ((paramInt2 = str6.lastIndexOf('/', n - 1)) >= 0) {
            str6 = v.a(str6.substring(0, paramInt2), str6.substring(n + 3));
            continue label108;
          } 
        } 
        break;
      } 
      int m = str6.indexOf("/..");
      while (str6.endsWith("/..") && (paramInt2 = str6.lastIndexOf('/', m - 1)) >= 0)
        str6 = str6.substring(0, paramInt2 + 1); 
      if (str6.startsWith("./") && str6.length() > 2)
        str6 = str6.substring(2); 
      if (str6.endsWith("/."))
        str6 = str6.substring(0, str6.length() - 1); 
    } 
    if (str6.startsWith("/../"))
      str6 = str6.substring(3, str6.length()); 
    str6 = str8;
    String str5 = str7;
    str4 = str6;
    str3 = str3;
    Object object = object;
    str2 = str2;
    paramInt2 = j;
    String str1 = str4;
    paramString = params.e;
    (params = params).e = paramString;
    params.c = str1;
    params.f = str2;
    params.a = object;
    params.b = str3;
    params.h = str4;
    params.g = str5;
    params.d = (str5 != null) ? v.a(str4, "?", str5) : str4;
    params.i = str6;
    params.a = paramInt2;
  }
  
  public static final String a(s params, boolean paramBoolean) {
    StringBuffer stringBuffer = new StringBuffer();
    if (params.e != null) {
      stringBuffer.append(params.e);
      stringBuffer.append(':');
    } 
    if (params.f != null && params.f.length() > 0 && paramBoolean) {
      stringBuffer.append("//");
      stringBuffer.append(params.f);
    } else if (params.c != null && params.c.length() > 0 && !paramBoolean) {
      stringBuffer.append("//");
      stringBuffer.append(params.c);
      if (params.a > 0) {
        stringBuffer.append(':');
        stringBuffer.append(params.a);
      } 
    } 
    if (params.h != null)
      stringBuffer.append(params.h); 
    if (params.g != null) {
      stringBuffer.append('?');
      stringBuffer.append(params.g);
    } 
    if (params.i != null) {
      stringBuffer.append('#');
      stringBuffer.append(params.i);
    } 
    return stringBuffer.toString();
  }
  
  public static String e(String paramString) {
    int i;
    return ((i = paramString.indexOf('?')) != -1) ? paramString.substring(0, i) : paramString;
  }
  
  static boolean a(String paramString) {
    return (paramString != null && (paramString.startsWith("http://") || paramString.startsWith(v.a("http://", true, true))));
  }
  
  public static String f(String paramString) {
    int i = paramString.indexOf('/', a(paramString) ? 7 : 0);
    return v.g(paramString.substring(0, (i != -1) ? (i + 1) : paramString.length()));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\s.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */