package calc;

public final class c {
  public long a;
  
  public int b;
  
  public byte c;
  
  public static boolean d = true;
  
  public static final c e = new c(0, 0, 0L);
  
  public static final c f = new c(0, 1073741824, 4611686018427387904L);
  
  public static final c g = new c(0, 1073741825, 4611686018427387904L);
  
  public static final c h = new c(0, 1073741825, 6917529027641081856L);
  
  public static final c i = new c(0, 1073741826, 5764607523034234880L);
  
  public static final c j = new c(0, 1073741827, 5764607523034234880L);
  
  public static final c k = new c(0, 1073741823, 4611686018427387904L);
  
  public static final c l = new c(0, 1073741822, 6148914691236517205L);
  
  public static final c m = new c(0, 1073741824, 6521908912666391106L);
  
  public static final c n = new c(0, 1073741823, 6521908912666391106L);
  
  public static final c o = new c(0, 1073741823, 7320595236998672907L);
  
  public static final c p = new c(0, 1073741826, 7244019458077122842L);
  
  public static final c q = new c(0, 1073741825, 7244019458077122842L);
  
  public static final c r = new c(0, 1073741824, 7244019458077122842L);
  
  public static final c s = new c(0, 1073741823, 7244019458077122842L);
  
  public static final c t = new c(0, 1073741822, 7244019458077122842L);
  
  public static final c u = new c(0, 1073741823, 6393154322601327830L);
  
  public static final c v = new c(0, 1073741822, 8011319160293570763L);
  
  public static final c w = new c(0, -2147483648, 4611686018427387904L);
  
  private static final byte[] x = new byte[] { 
      31, 22, 30, 21, 18, 10, 29, 2, 20, 17, 
      15, 13, 9, 6, 28, 1, 23, 19, 11, 3, 
      16, 14, 7, 24, 12, 4, 8, 25, 5, 26, 
      27, 0 };
  
  private static c y = new c();
  
  private static c z = new c();
  
  private static c A = new c();
  
  private static c B = new c();
  
  private static c C = new c();
  
  private static c D = new c();
  
  private static c E = new c();
  
  private static c F = new c();
  
  private static c G = new c();
  
  private static c H = new c();
  
  private static c I = new c();
  
  private static c J = new c();
  
  private static StringBuffer K = new StringBuffer(40);
  
  private static StringBuffer L = new StringBuffer(15);
  
  private static calc/e M = new calc/e();
  
  public c() {}
  
  public c(c paramc) {
    this.a = paramc.a;
    this.b = paramc.b;
    this.c = paramc.c;
  }
  
  public c(String paramString) {
    a(paramString, 10);
  }
  
  public c(String paramString, int paramInt) {
    a(paramString, paramInt);
  }
  
  private c(int paramInt1, int paramInt2, long paramLong) {
    a(paramInt1, paramInt2, paramLong);
  }
  
  public final void a(c paramc) {
    if (paramc == null) {
      z();
      return;
    } 
    this.c = paramc.c;
    this.b = paramc.b;
    this.a = paramc.a;
  }
  
  public final void a(int paramInt) {
    if (paramInt == 0) {
      z();
      return;
    } 
    this.c = 0;
    if (paramInt < 0) {
      this.c = 1;
      paramInt = -paramInt;
    } 
    int i = (i = (i = (i = (i = (i = paramInt) | i >> 1) | i >> 2) | i >> 4) | i >> 8) | i >> 16;
    i = x[i * 130329821 >>> 27] - 1;
    this.b = 1073741854 - i;
    this.a = paramInt << 32 + i;
  }
  
  public final void a(String paramString) {
    a(paramString, 10);
  }
  
  public final void a(String paramString, int paramInt) {
    if (paramString == null || paramString.length() == 0) {
      a(e);
      return;
    } 
    b(paramString, paramInt);
  }
  
  private void a(int paramInt1, int paramInt2, long paramLong) {
    this.c = (byte)paramInt1;
    this.b = paramInt2;
    this.a = paramLong;
  }
  
  private void z() {
    this.c = 0;
    this.a = 0L;
    this.b = 0;
  }
  
  private void h(int paramInt) {
    this.c = (byte)paramInt;
    this.a = 0L;
    this.b = 0;
  }
  
  private void i(int paramInt) {
    this.c = (byte)paramInt;
    this.a = 0L;
    this.b = Integer.MIN_VALUE;
  }
  
  private void A() {
    this.c = 0;
    this.a = 4611686018427387904L;
    this.b = Integer.MIN_VALUE;
  }
  
  private boolean B() {
    return (this.b < 0 && this.a != 0L);
  }
  
  public final void a() {
    this.c = 0;
  }
  
  public final void b() {
    if (this.b >= 0 || this.a == 0L)
      this.c = (byte)(this.c ^ 0x1); 
  }
  
  private void C() {
    if (this.b >= 0)
      if (this.a > 0L) {
        int i = 0;
        int j;
        if ((j = (int)(this.a >>> 32L)) == 0) {
          i = 32;
          j = (int)this.a;
        } 
        j = (j = (j = (j = (j |= j >> 1) | j >> 2) | j >> 4) | j >> 8) | j >> 16;
        i += x[j * 130329821 >>> 27] - 1;
        this.a <<= i;
        this.b -= i;
        if (this.b < 0) {
          h(this.c);
          return;
        } 
      } else if (this.a < 0L) {
        this.a = this.a + 1L >>> 1L;
        this.b++;
        if (this.a == 0L) {
          this.a = 4611686018427387904L;
          this.b++;
        } 
        if (this.b < 0) {
          i(this.c);
          return;
        } 
      } else {
        this.b = 0;
      }  
  }
  
  private long a(long paramLong) {
    if (this.b < 0)
      return 0L; 
    if (this.a == 0L && paramLong == 0L) {
      this.b = 0;
      return 0L;
    } 
    if (this.a < 0L) {
      paramLong = (this.a << 63L) + (paramLong >>> 1L);
      this.a >>>= 1L;
      this.b++;
      if (this.b < 0)
        i(this.c); 
      return paramLong;
    } 
    while (this.a >>> 47L == 0L) {
      this.a = (this.a << 16L) + ((int)(paramLong >> 48L) & 0xFFFF);
      paramLong <<= 16L;
      this.b -= 16;
    } 
    while (this.a >>> 59L == 0L) {
      this.a = (this.a << 4L) + ((int)(paramLong >> 60L) & 0xF);
      paramLong <<= 4L;
      this.b -= 4;
    } 
    while (this.a >>> 62L == 0L) {
      this.a = (this.a << 1L) + ((int)(paramLong >> 63L) & 0x1);
      paramLong <<= 1L;
      this.b--;
    } 
    if (this.b < 0) {
      h(this.c);
      return 0L;
    } 
    return paramLong;
  }
  
  private void b(long paramLong) {
    this.a += paramLong >> 63L & 0x1L;
    C();
  }
  
  private int n(c paramc) {
    if (this.b == 0 && this.a == 0L && paramc.b == 0 && paramc.a == 0L)
      return 0; 
    if (this.c != paramc.c)
      return paramc.c - this.c; 
    byte b = (this.c == 0) ? 1 : -1;
    return (this.b < 0 && this.a == 0L) ? b : ((paramc.b < 0 && paramc.a == 0L) ? -b : ((this.b != paramc.b) ? ((this.b < paramc.b) ? -b : b) : ((this.a != paramc.a) ? ((this.a < paramc.a) ? -b : b) : 0)));
  }
  
  private boolean o(c paramc) {
    return ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L) || (this.b < 0 && this.a == 0L && paramc.b < 0 && paramc.a == 0L && this.c == paramc.c));
  }
  
  public final boolean b(c paramc) {
    return o(paramc) ? false : ((n(paramc) == 0));
  }
  
  public final void b(int paramInt) {
    if (this.b < 0 || this.a == 0L)
      return; 
    this.b += paramInt;
    if (this.b < 0) {
      if (paramInt < 0) {
        h(this.c);
        return;
      } 
      i(this.c);
    } 
  }
  
  public final void c() {
    if (this.b < 0 || this.a == 0L)
      return; 
    if (this.b < 1073741824) {
      if (this.c == 0) {
        h(this.c);
        return;
      } 
      this.b = f.b;
      this.a = f.a;
      return;
    } 
    int i;
    if ((i = 1073741886 - this.b) <= 0)
      return; 
    if (this.c != 0)
      this.a += (1L << i) - 1L; 
    this.a &= (1L << i) - 1L ^ 0xFFFFFFFFFFFFFFFFL;
    if (this.c != 0)
      C(); 
  }
  
  public final void d() {
    if (this.b < 0 || this.a == 0L)
      return; 
    if (this.b < 1073741824) {
      h(this.c);
      return;
    } 
    int i;
    if ((i = 1073741886 - this.b) <= 0)
      return; 
    this.a &= (1L << i) - 1L ^ 0xFFFFFFFFFFFFFFFFL;
    C();
  }
  
  private void D() {
    if (this.b < 0 || this.a == 0L || this.b < 1073741824)
      return; 
    int i;
    if ((i = 1073741886 - this.b) <= 0) {
      h(this.c);
      return;
    } 
    this.a &= (1L << i) - 1L;
    C();
  }
  
  public final int e() {
    int i;
    return ((this.b == 0 && this.a == 0L) || (this.b < 0 && this.a != 0L)) ? 0 : ((this.b < 0 && this.a == 0L) ? ((this.c == 0) ? Integer.MAX_VALUE : -2147483647) : ((this.b < 1073741824) ? 0 : (((i = 1073741886 - this.b) < 32) ? ((this.c == 0) ? Integer.MAX_VALUE : -2147483647) : ((this.c == 0) ? (int)(this.a >>> i) : -((int)(this.a >>> i))))));
  }
  
  public final boolean f() {
    int i;
    return (this.b < 0 && this.a != 0L) ? false : (((this.b == 0 && this.a == 0L) || (this.b < 0 && this.a == 0L)) ? true : ((this.b < 1073741824) ? false : (((i = 1073741886 - this.b) <= 0) ? true : (((this.a & (1L << i) - 1L) == 0L)))));
  }
  
  private boolean E() {
    if (this.b < 0 || this.a == 0L || this.b < 1073741824 || this.b > 1073741886)
      return false; 
    int i = 1073741886 - this.b;
    return ((this.a >>> i & 0x1L) != 0L);
  }
  
  public final void c(c paramc) {
    byte b;
    int i;
    long l;
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    if ((this.b < 0 && this.a == 0L) || (paramc.b < 0 && paramc.a == 0L)) {
      if (this.b < 0 && this.a == 0L && paramc.b < 0 && paramc.a == 0L && this.c != paramc.c) {
        A();
        return;
      } 
      i(((this.b < 0 && this.a == 0L) ? this : paramc).c);
      return;
    } 
    if ((this.b == 0 && this.a == 0L) || (paramc.b == 0 && paramc.a == 0L)) {
      if (this.b == 0 && this.a == 0L) {
        this.a = paramc.a;
        this.b = paramc.b;
        this.c = paramc.c;
      } 
      if (this.b == 0 && this.a == 0L)
        this.c = 0; 
      return;
    } 
    if (this.b > paramc.b || (this.b == paramc.b && this.a >= paramc.a)) {
      b = paramc.c;
      i = paramc.b;
      l = paramc.a;
    } else {
      b = this.c;
      i = this.b;
      l = this.a;
      this.c = paramc.c;
      this.b = paramc.b;
      this.a = paramc.a;
    } 
    int j;
    if ((j = this.b - i) >= 64)
      return; 
    if (this.c == b) {
      this.a += l >>> j;
      if (this.a >= 0L && j > 0 && (l >>> j - 1 & 0x1L) != 0L)
        this.a++; 
      if (this.a < 0L) {
        this.a = this.a + 1L >>> 1L;
        this.b++;
        if (this.b < 0) {
          i(this.c);
          return;
        } 
      } 
    } else {
      if (j > 0) {
        this.a <<= 1L;
        this.b--;
        j--;
      } 
      l = -l;
      this.a += l >> j;
      if (this.a >= 0L && j > 0 && (l >>> j - 1 & 0x1L) != 0L)
        this.a++; 
      if (this.a < 0L) {
        this.a = this.a + 1L >>> 1L;
        this.b++;
      } else {
        if (d && this.a >= 0L && this.a <= 7L)
          this.a = 0L; 
        C();
      } 
    } 
    if (this.b == 0 && this.a == 0L)
      this.c = 0; 
  }
  
  private long a(long paramLong1, c paramc, long paramLong2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: ifge -> 16
    //   7: aload_0
    //   8: getfield a : J
    //   11: lconst_0
    //   12: lcmp
    //   13: ifne -> 32
    //   16: aload_3
    //   17: getfield b : I
    //   20: ifge -> 38
    //   23: aload_3
    //   24: getfield a : J
    //   27: lconst_0
    //   28: lcmp
    //   29: ifeq -> 38
    //   32: aload_0
    //   33: invokespecial A : ()V
    //   36: lconst_0
    //   37: lreturn
    //   38: aload_0
    //   39: getfield b : I
    //   42: ifge -> 54
    //   45: aload_0
    //   46: getfield a : J
    //   49: lconst_0
    //   50: lcmp
    //   51: ifeq -> 70
    //   54: aload_3
    //   55: getfield b : I
    //   58: ifge -> 150
    //   61: aload_3
    //   62: getfield a : J
    //   65: lconst_0
    //   66: lcmp
    //   67: ifne -> 150
    //   70: aload_0
    //   71: getfield b : I
    //   74: ifge -> 120
    //   77: aload_0
    //   78: getfield a : J
    //   81: lconst_0
    //   82: lcmp
    //   83: ifne -> 120
    //   86: aload_3
    //   87: getfield b : I
    //   90: ifge -> 120
    //   93: aload_3
    //   94: getfield a : J
    //   97: lconst_0
    //   98: lcmp
    //   99: ifne -> 120
    //   102: aload_0
    //   103: getfield c : B
    //   106: aload_3
    //   107: getfield c : B
    //   110: if_icmpeq -> 120
    //   113: aload_0
    //   114: invokespecial A : ()V
    //   117: goto -> 148
    //   120: aload_0
    //   121: aload_0
    //   122: getfield b : I
    //   125: ifge -> 141
    //   128: aload_0
    //   129: getfield a : J
    //   132: lconst_0
    //   133: lcmp
    //   134: ifne -> 141
    //   137: aload_0
    //   138: goto -> 142
    //   141: aload_3
    //   142: getfield c : B
    //   145: invokespecial i : (I)V
    //   148: lconst_0
    //   149: lreturn
    //   150: aload_0
    //   151: getfield b : I
    //   154: ifne -> 166
    //   157: aload_0
    //   158: getfield a : J
    //   161: lconst_0
    //   162: lcmp
    //   163: ifeq -> 182
    //   166: aload_3
    //   167: getfield b : I
    //   170: ifne -> 248
    //   173: aload_3
    //   174: getfield a : J
    //   177: lconst_0
    //   178: lcmp
    //   179: ifne -> 248
    //   182: aload_0
    //   183: getfield b : I
    //   186: ifne -> 225
    //   189: aload_0
    //   190: getfield a : J
    //   193: lconst_0
    //   194: lcmp
    //   195: ifne -> 225
    //   198: aload_0
    //   199: aload_3
    //   200: getfield a : J
    //   203: putfield a : J
    //   206: aload_0
    //   207: aload_3
    //   208: getfield b : I
    //   211: putfield b : I
    //   214: aload_0
    //   215: aload_3
    //   216: getfield c : B
    //   219: putfield c : B
    //   222: lload #4
    //   224: lstore_1
    //   225: aload_0
    //   226: getfield b : I
    //   229: ifne -> 246
    //   232: aload_0
    //   233: getfield a : J
    //   236: lconst_0
    //   237: lcmp
    //   238: ifne -> 246
    //   241: aload_0
    //   242: iconst_0
    //   243: putfield c : B
    //   246: lload_1
    //   247: lreturn
    //   248: aload_0
    //   249: getfield b : I
    //   252: aload_3
    //   253: getfield b : I
    //   256: if_icmpgt -> 316
    //   259: aload_0
    //   260: getfield b : I
    //   263: aload_3
    //   264: getfield b : I
    //   267: if_icmpne -> 282
    //   270: aload_0
    //   271: getfield a : J
    //   274: aload_3
    //   275: getfield a : J
    //   278: lcmp
    //   279: ifgt -> 316
    //   282: aload_0
    //   283: getfield b : I
    //   286: aload_3
    //   287: getfield b : I
    //   290: if_icmpne -> 341
    //   293: aload_0
    //   294: getfield a : J
    //   297: aload_3
    //   298: getfield a : J
    //   301: lcmp
    //   302: ifne -> 341
    //   305: lload_1
    //   306: iconst_1
    //   307: lushr
    //   308: lload #4
    //   310: iconst_1
    //   311: lushr
    //   312: lcmp
    //   313: iflt -> 341
    //   316: aload_3
    //   317: getfield c : B
    //   320: istore #6
    //   322: aload_3
    //   323: getfield b : I
    //   326: istore #7
    //   328: aload_3
    //   329: getfield a : J
    //   332: lstore #8
    //   334: lload #4
    //   336: lstore #10
    //   338: goto -> 389
    //   341: aload_0
    //   342: getfield c : B
    //   345: istore #6
    //   347: aload_0
    //   348: getfield b : I
    //   351: istore #7
    //   353: aload_0
    //   354: getfield a : J
    //   357: lstore #8
    //   359: lload_1
    //   360: lstore #10
    //   362: aload_0
    //   363: aload_3
    //   364: getfield c : B
    //   367: putfield c : B
    //   370: aload_0
    //   371: aload_3
    //   372: getfield b : I
    //   375: putfield b : I
    //   378: aload_0
    //   379: aload_3
    //   380: getfield a : J
    //   383: putfield a : J
    //   386: lload #4
    //   388: lstore_1
    //   389: aload_0
    //   390: getfield b : I
    //   393: iload #7
    //   395: isub
    //   396: dup
    //   397: istore #12
    //   399: bipush #127
    //   401: if_icmplt -> 406
    //   404: lload_1
    //   405: lreturn
    //   406: iload #12
    //   408: bipush #64
    //   410: if_icmplt -> 427
    //   413: lload #8
    //   415: iload #12
    //   417: bipush #64
    //   419: isub
    //   420: lushr
    //   421: lstore #10
    //   423: lconst_0
    //   424: goto -> 453
    //   427: iload #12
    //   429: ifle -> 455
    //   432: lload #10
    //   434: iload #12
    //   436: lushr
    //   437: lload #8
    //   439: bipush #64
    //   441: iload #12
    //   443: isub
    //   444: lshl
    //   445: ladd
    //   446: lstore #10
    //   448: lload #8
    //   450: iload #12
    //   452: lushr
    //   453: lstore #8
    //   455: lload_1
    //   456: iconst_1
    //   457: lushr
    //   458: lstore_1
    //   459: lload #10
    //   461: iconst_1
    //   462: lushr
    //   463: lstore #10
    //   465: aload_0
    //   466: getfield c : B
    //   469: iload #6
    //   471: if_icmpne -> 508
    //   474: lload_1
    //   475: lload #10
    //   477: ladd
    //   478: lstore_1
    //   479: aload_0
    //   480: dup
    //   481: getfield a : J
    //   484: lload_1
    //   485: bipush #63
    //   487: lshr
    //   488: lconst_1
    //   489: land
    //   490: ladd
    //   491: putfield a : J
    //   494: aload_0
    //   495: dup
    //   496: getfield a : J
    //   499: lload #8
    //   501: ladd
    //   502: putfield a : J
    //   505: goto -> 564
    //   508: lload_1
    //   509: lload #10
    //   511: lsub
    //   512: lstore_1
    //   513: aload_0
    //   514: dup
    //   515: getfield a : J
    //   518: lload_1
    //   519: bipush #63
    //   521: lshr
    //   522: lconst_1
    //   523: land
    //   524: lsub
    //   525: putfield a : J
    //   528: aload_0
    //   529: dup
    //   530: getfield a : J
    //   533: lload #8
    //   535: lsub
    //   536: putfield a : J
    //   539: aload_0
    //   540: getfield a : J
    //   543: lconst_0
    //   544: lcmp
    //   545: ifne -> 564
    //   548: lload_1
    //   549: lconst_0
    //   550: lcmp
    //   551: iflt -> 564
    //   554: lload_1
    //   555: ldc2_w 31
    //   558: lcmp
    //   559: ifgt -> 564
    //   562: lconst_0
    //   563: lstore_1
    //   564: lload_1
    //   565: iconst_1
    //   566: lshl
    //   567: lstore_1
    //   568: aload_0
    //   569: lload_1
    //   570: invokespecial a : (J)J
    //   573: lstore_1
    //   574: aload_0
    //   575: getfield b : I
    //   578: ifne -> 595
    //   581: aload_0
    //   582: getfield a : J
    //   585: lconst_0
    //   586: lcmp
    //   587: ifne -> 595
    //   590: aload_0
    //   591: iconst_0
    //   592: putfield c : B
    //   595: lload_1
    //   596: lreturn
  }
  
  public final void d(c paramc) {
    y.a = paramc.a;
    y.b = paramc.b;
    y.c = (byte)(paramc.c ^ 0x1);
    c(y);
  }
  
  public final void c(int paramInt) {
    if (this.b < 0 && this.a != 0L)
      return; 
    if (paramInt < 0) {
      this.c = (byte)(this.c ^ 0x1);
      paramInt = -paramInt;
    } 
    if ((this.b == 0 && this.a == 0L) || paramInt == 0) {
      if (this.b < 0 && this.a == 0L) {
        A();
        return;
      } 
      h(this.c);
      return;
    } 
    if (this.b < 0 && this.a == 0L)
      return; 
    int i = (i = (i = (i = (i = (i = paramInt) | i >> 1) | i >> 2) | i >> 4) | i >> 8) | i >> 16;
    i = x[i * 130329821 >>> 27];
    this.b += 31 - i;
    paramInt <<= i;
    if (this.b < 0) {
      i(this.c);
      return;
    } 
    long l1 = this.a & 0x7FFFFFFFL;
    long l2 = this.a >>> 31L;
    long l3 = paramInt & 0xFFFFFFFFL;
    this.a = l2 * l3;
    boolean bool = (this.a < 0L) ? false : true;
    this.a += l1 * l3 + bool >>> 31L;
    if (this.a < 0L) {
      this.a = this.a + 1L >>> 1L;
      this.b++;
      if (this.b < 0)
        i(this.c); 
    } 
  }
  
  public final void e(c paramc) {
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    this.c = (byte)(this.c ^ paramc.c);
    if ((this.b == 0 && this.a == 0L) || (paramc.b == 0 && paramc.a == 0L)) {
      if ((this.b < 0 && this.a == 0L) || (paramc.b < 0 && paramc.a == 0L)) {
        A();
        return;
      } 
      h(this.c);
      return;
    } 
    if ((this.b < 0 && this.a == 0L) || (paramc.b < 0 && paramc.a == 0L)) {
      i(this.c);
      return;
    } 
    long l1 = this.a & 0x7FFFFFFFL;
    long l2 = this.a >>> 31L;
    long l3 = paramc.a & 0x7FFFFFFFL;
    long l4 = paramc.a >>> 31L;
    this.a = l2 * l4;
    boolean bool = (this.a < 0L) ? false : true;
    this.a += l1 * l4 + l2 * l3 + (l1 * l3 >>> 31L) + bool >>> 31L;
    int i = paramc.b;
    this.b += i - 1073741824;
    if (this.b >= 0 || (this.b == -1 && i < 1073741824 && this.a < 0L)) {
      if (this.a < 0L) {
        this.a = this.a + 1L >>> 1L;
        this.b++;
        if (this.b < 0)
          i(this.c); 
      } 
      return;
    } 
    if (i < 1073741824) {
      h(this.c);
      return;
    } 
    i(this.c);
  }
  
  private long b(long paramLong1, c paramc, long paramLong2) {
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return 0L;
    } 
    this.c = (byte)(this.c ^ paramc.c);
    if ((this.b == 0 && this.a == 0L) || (paramc.b == 0 && paramc.a == 0L)) {
      if ((this.b < 0 && this.a == 0L) || (paramc.b < 0 && paramc.a == 0L)) {
        A();
      } else {
        h(this.c);
      } 
      return 0L;
    } 
    if ((this.b < 0 && this.a == 0L) || (paramc.b < 0 && paramc.a == 0L)) {
      i(this.c);
      return 0L;
    } 
    int i = paramc.b;
    this.b += i - 1073741824;
    if (this.b < 0) {
      if (i < 1073741824) {
        h(this.c);
      } else {
        i(this.c);
      } 
      return 0L;
    } 
    long l1 = 4294967295L;
    long l2 = paramLong1 & l1;
    long l3 = paramLong1 >>> 32L;
    long l4 = this.a & l1;
    long l5 = this.a >>> 32L;
    long l6 = paramLong2 & l1;
    long l7 = paramLong2 >>> 32L;
    long l8 = paramc.a & l1;
    long l9 = paramc.a >>> 32L;
    l2 = (l5 * l6 >>> 2L) + (l4 * l7 >>> 2L) + (l3 * l8 >>> 2L) + (l2 * l9 >>> 2L) + 1610612736L >>> 28L;
    l3 *= l9;
    l6 = l4 * l8;
    l7 *= l5;
    l3 = ((l2 += (l3 << 2L & l1) + (l6 << 2L & l1) + (l7 << 2L & l1)) >>> 32L) + (l3 >>> 30L) + (l6 >>> 30L) + (l7 >>> 30L);
    l2 &= l1;
    l4 *= l9;
    l8 *= l5;
    paramLong1 = ((l3 += (l4 << 2L & l1) + (l8 << 2L & l1)) << 32L) + l2;
    this.a = (l5 * l9 << 2L) + (l3 >>> 32L) + (l4 >>> 30L) + (l8 >>> 30L);
    return paramLong1 = a(paramLong1);
  }
  
  private void F() {
    if (this.b < 0 || this.a == 0L)
      return; 
    this.a += this.a + 2L >>> 2L;
    this.b += 3;
    if (this.a < 0L) {
      this.a = this.a + 1L >>> 1L;
      this.b++;
    } 
    if (this.b < 0)
      i(this.c); 
  }
  
  public final void g() {
    this.c = 0;
    if (this.b < 0 || this.a == 0L)
      return; 
    int i = this.b;
    this.b += this.b - 1073741824;
    if (this.b < 0) {
      if (i < 1073741824) {
        h(this.c);
        return;
      } 
      i(this.c);
      return;
    } 
    long l1 = this.a & 0x7FFFFFFFL;
    long l2 = this.a >>> 31L;
    this.a = l2 * l2;
    boolean bool = (this.a < 0L) ? false : true;
    this.a += (l1 * l2 << 1L) + (l1 * l1 >>> 31L) + bool >>> 31L;
    if (this.a < 0L) {
      this.a = this.a + 1L >>> 1L;
      this.b++;
      if (this.b < 0)
        i(this.c); 
    } 
  }
  
  public final void d(int paramInt) {
    if (this.b < 0 && this.a != 0L)
      return; 
    if (paramInt < 0) {
      this.c = (byte)(this.c ^ 0x1);
      paramInt = -paramInt;
    } 
    if (this.b < 0 && this.a == 0L)
      return; 
    if (this.b == 0 && this.a == 0L) {
      if (paramInt == 0)
        A(); 
      return;
    } 
    if (paramInt == 0) {
      i(this.c);
      return;
    } 
    long l1 = paramInt & 0xFFFFFFFFL;
    long l2 = this.a % l1;
    this.a /= l1;
    int i = 0;
    int j;
    if ((j = (int)(this.a >>> 32L)) == 0) {
      i = 32;
      j = (int)this.a;
    } 
    j = (j = (j = (j = (j |= j >> 1) | j >> 2) | j >> 4) | j >> 8) | j >> 16;
    i += x[j * 130329821 >>> 27] - 1;
    this.a <<= i;
    l2 <<= i;
    this.b -= i;
    l2 = (l2 + l1 / 2L) / l1;
    this.a += l2;
    if (this.b < 0)
      h(this.c); 
  }
  
  private static long a(long paramLong1, long paramLong2) {
    int i = (int)(70368744177664L / ((paramLong2 >>> 40L) + 1L));
    int j = (int)(paramLong1 >> 32L) >>> 8;
    paramLong1 <<= 20L;
    int k = (int)(j * i >>> 26L);
    paramLong1 -= k * paramLong2;
    long l = k;
    j = (int)(paramLong1 >> 32L) >>> 7;
    paramLong1 <<= 21L;
    k = (int)(j * i >>> 26L);
    paramLong1 -= k * paramLong2;
    l = (l << 21L) + k;
    j = (int)(paramLong1 >> 32L) >>> 7;
    paramLong1 <<= 21L;
    k = (int)(j * i >>> 26L);
    paramLong1 -= k * paramLong2;
    l = (l << 21L) + k;
    if (paramLong1 < 0L || paramLong1 >= paramLong2) {
      l++;
      paramLong1 -= paramLong2;
    } 
    if ((paramLong1 <<= 1L) < 0L || paramLong1 >= paramLong2)
      l++; 
    return l;
  }
  
  public final void f(c paramc) {
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    this.c = (byte)(this.c ^ paramc.c);
    if (this.b < 0 && this.a == 0L) {
      if (paramc.b < 0 && paramc.a == 0L)
        A(); 
      return;
    } 
    if (paramc.b < 0 && paramc.a == 0L) {
      h(this.c);
      return;
    } 
    if (this.b == 0 && this.a == 0L) {
      if (paramc.b == 0 && paramc.a == 0L)
        A(); 
      return;
    } 
    if (paramc.b == 0 && paramc.a == 0L) {
      i(this.c);
      return;
    } 
    this.b += 1073741824 - paramc.b;
    if (this.a < paramc.a) {
      this.a <<= 1L;
      this.b--;
    } 
    if (this.b < 0) {
      if (paramc.b >= 1073741824) {
        h(this.c);
        return;
      } 
      i(this.c);
      return;
    } 
    if (paramc.a == 4611686018427387904L)
      return; 
    this.a = a(this.a, paramc.a);
  }
  
  private void G() {
    if (this.b < 0 && this.a != 0L)
      return; 
    if (this.b < 0 && this.a == 0L) {
      h(this.c);
      return;
    } 
    if (this.b == 0 && this.a == 0L) {
      i(this.c);
      return;
    } 
    this.b = Integer.MIN_VALUE - this.b;
    if (this.a == 4611686018427387904L) {
      if (this.b < 0)
        i(this.c); 
      return;
    } 
    this.b--;
    this.a = a(Long.MIN_VALUE, this.a);
  }
  
  private long c(long paramLong) {
    if (this.b < 0 && this.a != 0L)
      return 0L; 
    if (this.b < 0 && this.a == 0L) {
      h(this.c);
      return 0L;
    } 
    if (this.b == 0 && this.a == 0L) {
      i(this.c);
      return 0L;
    } 
    byte b = this.c;
    this.c = 0;
    if (this.a == 4611686018427387904L && paramLong == 0L) {
      this.b = Integer.MIN_VALUE - this.b;
      if (this.b < 0)
        i(b); 
      return 0L;
    } 
    int i = 1073741824 - this.b;
    this.b = 1073741824;
    z.a = this.a;
    z.b = this.b;
    z.c = this.c;
    long l = paramLong;
    z.b();
    G();
    A.a = this.a;
    A.b = this.b;
    A.c = this.c;
    paramLong = b(0L, z, l);
    paramLong = a(paramLong, f, 0L);
    paramLong = b(paramLong, A, 0L);
    paramLong = a(paramLong, A, 0L);
    b(i);
    if (!B())
      this.c = b; 
    return paramLong;
  }
  
  public final void g(c paramc) {
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    if (this.b < 0 && this.a == 0L) {
      if (paramc.b < 0 && paramc.a == 0L)
        A(); 
      return;
    } 
    if (paramc.b < 0 && paramc.a == 0L) {
      h(this.c);
      return;
    } 
    if (this.b == 0 && this.a == 0L) {
      if (paramc.b == 0 && paramc.a == 0L)
        A(); 
      return;
    } 
    if (paramc.b == 0 && paramc.a == 0L) {
      i(this.c);
      return;
    } 
    y.a = paramc.a;
    y.b = paramc.b;
    y.c = paramc.c;
    long l = y.c(0L);
    l = b(0L, y, l);
    if ((y.c != 0 && (l < 0L || l > 31L)) || (y.c == 0 && l < 0L && l > -32L)) {
      this.a++;
      C();
    } 
    c();
  }
  
  private void a(c paramc, long paramLong) {
    y.a = paramc.a;
    y.b = paramc.b;
    y.c = paramc.c;
    long l = y.c(paramLong);
    l = y.b(l, this, 0L);
    if (y.b > 1073741886) {
      h(paramc.c);
      return;
    } 
    if ((y.c != 0 && (l < 0L || l > 31L)) || (y.c == 0 && l < 0L && l > -32L)) {
      y.a++;
      y.C();
    } 
    y.c();
    y.b();
    l = y.b(0L, paramc, paramLong);
    l = a(0L, y, l);
    b(l);
  }
  
  public final void h(c paramc) {
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    if (this.b < 0 && this.a == 0L) {
      A();
      return;
    } 
    if (this.b == 0 && this.a == 0L) {
      if (paramc.b == 0 && paramc.a == 0L) {
        A();
        return;
      } 
      this.c = paramc.c;
      return;
    } 
    if (paramc.b < 0 && paramc.a == 0L) {
      if (this.c != paramc.c)
        i(paramc.c); 
      return;
    } 
    if (paramc.b == 0 && paramc.a == 0L) {
      h(paramc.c);
      return;
    } 
    a(paramc, 0L);
  }
  
  public final void i(c paramc) {
    byte b;
    int i;
    long l;
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    if ((this.b == 0 && this.a == 0L) || (paramc.b == 0 && paramc.a == 0L)) {
      z();
      return;
    } 
    if ((this.b < 0 && this.a == 0L) || (paramc.b < 0 && paramc.a == 0L)) {
      if ((this.b >= 0 || this.a != 0L) && this.c != 0) {
        this.a = paramc.a;
        this.b = paramc.b;
        this.c = paramc.c;
        return;
      } 
      if ((paramc.b >= 0 || paramc.a != 0L) && paramc.c != 0)
        return; 
      if (this.b < 0 && this.a == 0L && paramc.b < 0 && paramc.a == 0L && this.c != 0 && paramc.c != 0)
        return; 
      z();
      return;
    } 
    if (this.b >= paramc.b) {
      b = paramc.c;
      i = paramc.b;
      l = paramc.a;
    } else {
      b = this.c;
      i = this.b;
      l = this.a;
      this.c = paramc.c;
      this.b = paramc.b;
      this.a = paramc.a;
    } 
    int j;
    if ((j = this.b - i) >= 64) {
      if (b == 0)
        h(this.c); 
      return;
    } 
    if (b != 0)
      l = -l; 
    if (this.c != 0)
      this.a = -this.a; 
    this.a &= l >> j;
    this.c = 0;
    if (this.a < 0L) {
      this.a = -this.a;
      this.c = 1;
    } 
    C();
  }
  
  public final void j(c paramc) {
    byte b;
    int i;
    long l;
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    if ((this.b == 0 && this.a == 0L) || (paramc.b == 0 && paramc.a == 0L)) {
      if (this.b == 0 && this.a == 0L) {
        this.a = paramc.a;
        this.b = paramc.b;
        this.c = paramc.c;
      } 
      return;
    } 
    if ((this.b < 0 && this.a == 0L) || (paramc.b < 0 && paramc.a == 0L)) {
      if ((this.b >= 0 || this.a != 0L) && this.c != 0)
        return; 
      if ((paramc.b >= 0 || paramc.a != 0L) && paramc.c != 0) {
        this.a = paramc.a;
        this.b = paramc.b;
        this.c = paramc.c;
        return;
      } 
      i(this.c | paramc.c);
      return;
    } 
    if ((this.c != 0 && this.b <= paramc.b) || (paramc.c == 0 && this.b >= paramc.b)) {
      b = paramc.c;
      i = paramc.b;
      l = paramc.a;
    } else {
      b = this.c;
      i = this.b;
      l = this.a;
      this.c = paramc.c;
      this.b = paramc.b;
      this.a = paramc.a;
    } 
    int j;
    if ((j = this.b - i) >= 64 || j <= -64)
      return; 
    if (b != 0)
      l = -l; 
    if (this.c != 0)
      this.a = -this.a; 
    this.a |= (j >= 0) ? (l >> j) : (l << -j);
    this.c = 0;
    if (this.a < 0L) {
      this.a = -this.a;
      this.c = 1;
    } 
    C();
  }
  
  public final void k(c paramc) {
    byte b;
    int i;
    long l;
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    if ((this.b == 0 && this.a == 0L) || (paramc.b == 0 && paramc.a == 0L)) {
      if (this.b == 0 && this.a == 0L) {
        this.a = paramc.a;
        this.b = paramc.b;
        this.c = paramc.c;
      } 
      return;
    } 
    if ((this.b < 0 && this.a == 0L) || (paramc.b < 0 && paramc.a == 0L)) {
      i(this.c ^ paramc.c);
      return;
    } 
    if (this.b >= paramc.b) {
      b = paramc.c;
      i = paramc.b;
      l = paramc.a;
    } else {
      b = this.c;
      i = this.b;
      l = this.a;
      this.c = paramc.c;
      this.b = paramc.b;
      this.a = paramc.a;
    } 
    int j;
    if ((j = this.b - i) >= 64)
      return; 
    if (b != 0)
      l = -l; 
    if (this.c != 0)
      this.a = -this.a; 
    this.a ^= l >> j;
    this.c = 0;
    if (this.a < 0L) {
      this.a = -this.a;
      this.c = 1;
    } 
    C();
  }
  
  public final void e(int paramInt) {
    y.a(paramInt);
    c(y);
  }
  
  public final void f(int paramInt) {
    y.a(paramInt);
    d(y);
  }
  
  private int j(int paramInt) {
    y.a(paramInt);
    return n(y);
  }
  
  private void H() {
    z.a = this.a;
    z.b = this.b;
    z.c = this.c;
    z.b();
    this.a = 5647513932722601984L - (this.a >>> 2L);
    boolean bool = ((this.b & 0x1) != 0) ? true : false;
    this.b = 1610612736 - (this.b >> 1);
    C();
    if (bool)
      e(n); 
    for (byte b = 0; b < 4; b++) {
      A.a = this.a;
      A.b = this.b;
      A.c = this.c;
      g();
      e(z);
      c(f);
      b(-1);
      e(A);
      c(A);
    } 
  }
  
  private void I() {
    if (this.b < 0 && this.a != 0L)
      return; 
    if (this.b == 0 && this.a == 0L) {
      i(0);
      return;
    } 
    if (this.c != 0) {
      A();
      return;
    } 
    if (this.b < 0 && this.a == 0L) {
      h(this.c);
      return;
    } 
    H();
  }
  
  public final void h() {
    if (this.b < 0 && this.a != 0L)
      return; 
    if (this.b == 0 && this.a == 0L) {
      this.c = 0;
      return;
    } 
    if (this.c != 0) {
      A();
      return;
    } 
    if (this.b < 0 && this.a == 0L)
      return; 
    B.a = this.a;
    B.b = this.b;
    B.c = this.c;
    B.H();
    e(B);
  }
  
  private void J() {
    z.a = this.a;
    z.b = this.b;
    z.c = this.c;
    z.b();
    this.a = 5845672316326903808L - (this.a >>> 2L);
    byte b1 = (this.b == 0) ? 2 : ((this.b - 1) % 3);
    this.b = 1073741824 - (this.b - 1073741824 - b1) / 3;
    C();
    if (b1 > 0) {
      e(o);
      if (b1 > 1)
        e(o); 
    } 
    for (byte b2 = 0; b2 < 4; b2++) {
      A.a = this.a;
      A.b = this.b;
      A.c = this.c;
      g();
      g();
      e(z);
      A.b(2);
      c(A);
      e(l);
    } 
  }
  
  private void K() {
    if (this.b < 0 || this.a == 0L)
      return; 
    byte b = this.c;
    this.c = 0;
    J();
    G();
    if (this.b >= 0 || this.a == 0L)
      this.c = b; 
  }
  
  public final void l(c paramc) {
    if (paramc.b < 0 && paramc.a != 0L) {
      A();
      return;
    } 
    if (paramc.n(h) == 0) {
      K();
      return;
    } 
    if (paramc.n(g) == 0) {
      h();
      return;
    } 
    boolean bool = false;
    if (this.c != 0 && paramc.f() && paramc.E()) {
      bool = true;
      a();
    } 
    G.a = paramc.a;
    G.b = paramc.b;
    G.c = paramc.c;
    G.G();
    m(G);
    if (bool)
      b(); 
  }
  
  private void d(long paramLong) {
    if (this.b < 0 && this.a != 0L)
      return; 
    if (this.b < 0 && this.a == 0L) {
      if (this.c != 0)
        h(0); 
      return;
    } 
    if (this.b == 0 && this.a == 0L) {
      this.a = f.a;
      this.b = f.b;
      this.c = f.c;
      return;
    } 
    C.a = this.a;
    C.b = this.b;
    C.c = this.c;
    if (C.c != 0 && paramLong != 0L) {
      C.a++;
      C.C();
    } 
    C.c();
    int i;
    if ((i = C.e()) >= 1073741824) {
      i(this.c);
      return;
    } 
    if (i < -1073741824) {
      h(this.c);
      return;
    } 
    C.b();
    paramLong = a(paramLong, C, 0L);
    C.a(0, 1073741823, 6393154322601327829L);
    paramLong = b(paramLong, C, -1949537693445031080L);
    b(paramLong);
    C.a = this.a;
    C.b = this.b;
    C.c = this.c;
    D.a = f.a;
    D.b = f.b;
    D.c = f.c;
    for (byte b = 18; b >= 2; b--) {
      D.c(b);
      c(D);
      e(C);
    } 
    f(D);
    c(f);
    this.b += i;
  }
  
  public final void i() {
    C.a(0, 1073741824, 6653256548922161245L);
    long l = b(0L, C, -2358760956788564156L);
    d(l);
  }
  
  public final void j() {
    C.a(0, 1073741825, 7659844674706589055L);
    long l = b(0L, C, 2636289682573880742L);
    d(l);
  }
  
  private void L() {
    C.a = this.a;
    C.b = this.b;
    C.c = this.c;
    C.c(f);
    d(f);
    f(C);
    C.a = this.a;
    C.b = this.b;
    C.c = this.c;
    D.a = this.a;
    D.b = this.b;
    D.c = this.c;
    D.g();
    this.a = f.a;
    this.b = f.b;
    this.c = f.c;
    E.a = f.a;
    E.b = f.b;
    E.c = f.c;
    for (byte b = 37; b >= 3; b -= 2) {
      e(D);
      c(b - 2);
      E.c(b);
      c(E);
    } 
    e(C);
    f(E);
    b(1);
  }
  
  public final void k() {
    if (this.b < 0 && this.a != 0L)
      return; 
    if (this.c != 0) {
      A();
      return;
    } 
    if (this.b == 0 && this.a == 0L) {
      i(1);
      return;
    } 
    if (this.b < 0 && this.a == 0L)
      return; 
    int i = this.b - 1073741824;
    this.b = 1073741824;
    L();
    C.a(i);
    C.e(u);
    c(C);
  }
  
  public final void l() {
    if (this.b < 0 && this.a != 0L)
      return; 
    if (this.c != 0) {
      A();
      return;
    } 
    if (this.b == 0 && this.a == 0L) {
      i(1);
      return;
    } 
    if (this.b < 0 && this.a == 0L)
      return; 
    int i = this.b - 1073741824;
    this.b = 1073741824;
    L();
    C.a(i);
    C.e(u);
    c(C);
    e(v);
  }
  
  private int M() {
    if (this.b < 0 || this.a == 0L)
      return 0; 
    G.a = this.a;
    G.b = this.b;
    G.c = this.c;
    int i = ((i = this.b - 1073741824) < 0) ? -((int)(-i * 1292913987L + 4294967295L >> 32L)) : (int)(i * 1292913987L >> 32L);
    this.a = j.a;
    this.b = j.b;
    this.c = j.c;
    k(i);
    H.a = this.a;
    H.b = this.b;
    H.c = this.c;
    H.F();
    if (H.n(G) <= 0) {
      i++;
      this.a = H.a;
      this.b = H.b;
      this.c = H.c;
    } 
    return i;
  }
  
  private void k(int paramInt) {
    boolean bool = false;
    if (paramInt < 0) {
      paramInt = -paramInt;
      bool = true;
    } 
    long l1 = 0L;
    long l2 = 0L;
    C.a = this.a;
    C.b = this.b;
    C.c = this.c;
    this.a = f.a;
    this.b = f.b;
    this.c = f.c;
    while (paramInt != 0) {
      if ((paramInt & 0x1) != 0)
        l1 = b(l1, C, l2); 
      l2 = C.b(l2, C, l2);
      paramInt >>>= 1;
    } 
    if (bool)
      l1 = c(l1); 
    b(l1);
  }
  
  public final void m(c paramc) {
    if (paramc.b == 0 && paramc.a == 0L) {
      this.a = f.a;
      this.b = f.b;
      this.c = f.c;
      return;
    } 
    if ((this.b < 0 && this.a != 0L) || (paramc.b < 0 && paramc.a != 0L)) {
      A();
      return;
    } 
    if (paramc.n(f) == 0)
      return; 
    if (paramc.b < 0 && paramc.a == 0L) {
      F.a = this.a;
      F.b = this.b;
      F.c = this.c;
      F.a();
      int i;
      if ((i = F.n(f)) > 0) {
        if (paramc.c == 0) {
          i(0);
          return;
        } 
        z();
        return;
      } 
      if (i < 0) {
        if (paramc.c != 0) {
          i(0);
          return;
        } 
        z();
        return;
      } 
      A();
      return;
    } 
    if (this.b == 0 && this.a == 0L) {
      if (this.c == 0) {
        if (paramc.c == 0) {
          z();
          return;
        } 
      } else {
        if (paramc.f() && paramc.E()) {
          if (paramc.c == 0) {
            h(1);
            return;
          } 
        } else if (paramc.c == 0) {
          z();
          return;
        } 
        i(0);
        return;
      } 
    } else {
      if (this.b < 0 && this.a == 0L) {
        if (this.c == 0) {
          if (paramc.c == 0) {
            i(0);
            return;
          } 
          z();
          return;
        } 
        if (paramc.f()) {
          if (paramc.E()) {
            if (paramc.c == 0) {
              i(1);
              return;
            } 
            h(1);
            return;
          } 
          if (paramc.c == 0) {
            i(0);
            return;
          } 
          z();
          return;
        } 
        A();
        return;
      } 
      if (paramc.f() && paramc.b <= 1073741854) {
        k(paramc.e());
        return;
      } 
      boolean bool = false;
      if (this.c != 0) {
        if (paramc.f()) {
          if (paramc.E())
            bool = true; 
        } else {
          A();
          return;
        } 
        this.c = 0;
      } 
      F.a = paramc.a;
      F.b = paramc.b;
      F.c = paramc.c;
      if (F.b <= 1073741854) {
        G.a = F.a;
        G.b = F.b;
        G.c = F.c;
        G.c();
        H.a = this.a;
        H.b = this.b;
        H.c = this.c;
        H.k(G.e());
        F.d(G);
      } else {
        H.a = f.a;
        H.b = f.b;
        H.c = f.c;
      } 
      int i = this.b - 1073741824;
      this.b = 1073741824;
      L();
      G.a(0, 1073741824, 6653256548922161245L);
      long l = b(0L, G, -2358760956788564156L);
      G.a(i);
      l = a(l, G, 0L);
      l = F.b(0L, this, l);
      F.d(l);
      this.a = F.a;
      this.b = F.b;
      this.c = F.c;
      e(H);
      if (this.b >= 0 || this.a == 0L)
        this.c = bool; 
      return;
    } 
  }
  
  private void N() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    G.a = this.a;
    G.b = this.b;
    G.c = this.c;
    G.g();
    G.b();
    this.a = f.a;
    this.b = f.b;
    this.c = f.c;
    H.a = f.a;
    H.b = f.b;
    H.c = f.c;
    for (byte b = 19; b >= 3; b -= 2) {
      e(G);
      H.c(b * (b - 1));
      c(H);
    } 
    e(F);
    f(H);
  }
  
  private void O() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    G.a = this.a;
    G.b = this.b;
    G.c = this.c;
    G.g();
    G.b();
    this.a = G.a;
    this.b = G.b;
    this.c = G.c;
    H.a = f.a;
    H.b = f.b;
    H.c = f.c;
    for (byte b = 18; b >= 4; b -= 2) {
      H.c(b * (b - 1));
      c(H);
      e(G);
    } 
    H.b(1);
    f(H);
    c(f);
  }
  
  public final void m() {
    if (this.b < 0 || this.a == 0L) {
      if (this.b != 0 || this.a != 0L)
        A(); 
      return;
    } 
    boolean bool = false;
    if (this.c != 0) {
      a();
      bool = true;
    } 
    if (n(p) > 0)
      a(p, 7089564414062235241L); 
    if (n(q) > 0) {
      d(p);
      b();
      bool = !bool ? true : false;
    } 
    if (n(r) > 0) {
      d(q);
      b();
    } 
    if (n(s) > 0) {
      d(r);
      b();
      O();
    } else {
      N();
    } 
    if (bool)
      b(); 
    if (this.b == 0 && this.a == 0L)
      a(); 
  }
  
  public final void n() {
    if (this.b == 0 && this.a == 0L) {
      this.a = f.a;
      this.b = f.b;
      this.c = f.c;
      return;
    } 
    if (this.c != 0)
      a(); 
    if (n(s) < 0) {
      O();
      return;
    } 
    c(r);
    m();
  }
  
  public final void o() {
    I.a = this.a;
    I.b = this.b;
    I.c = this.c;
    I.n();
    m();
    f(I);
  }
  
  public final void p() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    g();
    b();
    c(f);
    I();
    e(F);
    r();
  }
  
  public final void q() {
    boolean bool = (this.c != 0) ? true : false;
    a();
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    g();
    b();
    c(f);
    h();
    f(F);
    r();
    if (bool) {
      b();
      c(q);
    } 
  }
  
  private void P() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    G.a = this.a;
    G.b = this.b;
    G.c = this.c;
    G.g();
    G.b();
    this.a = f.a;
    this.b = f.b;
    this.c = f.c;
    H.a = f.a;
    H.b = f.b;
    H.c = f.c;
    for (byte b = 45; b >= 3; b -= 2) {
      e(G);
      c(b - 2);
      H.c(b);
      c(H);
    } 
    e(F);
    f(H);
  }
  
  public final void r() {
    if ((this.b == 0 && this.a == 0L) || (this.b < 0 && this.a != 0L))
      return; 
    if (this.b < 0 && this.a == 0L) {
      byte b1 = this.c;
      this.a = r.a;
      this.b = r.b;
      this.c = r.c;
      this.c = b1;
      return;
    } 
    byte b = this.c;
    this.c = 0;
    boolean bool1 = false;
    if (n(f) > 0) {
      bool1 = true;
      G();
    } 
    F.a = m.a;
    F.b = m.b;
    F.c = m.c;
    F.d(f);
    boolean bool2 = false;
    if (n(F) > 0) {
      bool2 = true;
      G.a = this.a;
      G.b = this.b;
      G.c = this.c;
      d(F);
      G.e(F);
      G.c(f);
      f(G);
    } 
    P();
    if (bool2)
      c(t); 
    if (bool1) {
      b();
      c(r);
    } 
    this.c = b;
  }
  
  public final void s() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    F.b();
    F.i();
    i();
    d(F);
    b(-1);
  }
  
  public final void t() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    F.b();
    F.i();
    i();
    c(F);
    b(-1);
  }
  
  public final void u() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    F.b();
    F.i();
    i();
    G.a = this.a;
    G.b = this.b;
    G.c = this.c;
    G.c(F);
    d(F);
    f(G);
  }
  
  public final void v() {
    if (this.b < 0 || this.a == 0L)
      return; 
    byte b = this.c;
    this.c = 0;
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    F.g();
    F.c(f);
    F.h();
    c(F);
    k();
    if (this.b >= 0 || this.a == 0L)
      this.c = b; 
  }
  
  public final void w() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    F.g();
    F.d(f);
    F.h();
    c(F);
    k();
  }
  
  public final void x() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    F.b();
    F.c(f);
    c(f);
    f(F);
    k();
    b(-1);
  }
  
  public final void y() {
    if (this.b < 0)
      return; 
    if (!f() || n(e) < 0 || j(200) > 0) {
      c(f);
      Q();
      return;
    } 
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    this.a = f.a;
    this.b = f.b;
    this.c = f.c;
    while (F.n(f) > 0) {
      e(F);
      F.d(f);
    } 
  }
  
  private void Q() {
    if (this.b < 0)
      return; 
    boolean bool1 = (this.c != 0) ? true : false;
    a();
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    G.a = f.a;
    G.b = f.b;
    G.c = f.c;
    boolean bool2 = false;
    while (j(20) < 0) {
      bool2 = true;
      G.e(this);
      c(f);
    } 
    H.a = this.a;
    H.b = this.b;
    H.c = this.c;
    I.a = this.a;
    I.b = this.b;
    I.c = this.c;
    I.g();
    k();
    J.a = H.a;
    J.b = H.b;
    J.c = H.c;
    J.d(k);
    e(J);
    d(H);
    J.a(0, 1073741823, 8475711970748322458L);
    c(J);
    J.a(12);
    J.e(H);
    J.G();
    c(J);
    H.e(I);
    J.a(360);
    J.e(H);
    J.G();
    d(J);
    H.e(I);
    J.a(1260);
    J.e(H);
    J.G();
    c(J);
    H.e(I);
    J.a(1680);
    J.e(H);
    J.G();
    d(J);
    H.e(I);
    J.a(1188);
    J.e(H);
    J.G();
    c(J);
    i();
    if (bool2)
      f(G); 
    if (bool1) {
      J.a = F.a;
      J.b = F.b;
      J.c = F.c;
      e(J);
      J.b(-1);
      J.D();
      J.e(p);
      J.m();
      e(J);
      G();
      e(q);
      b();
    } 
  }
  
  private static int a(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0) ? (paramInt1 / paramInt2) : -((-paramInt1 + paramInt2 - 1) / paramInt2);
  }
  
  private static int b(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0) ? (paramInt1 % paramInt2) : (paramInt1 + (-paramInt1 + paramInt2 - 1) / paramInt2 * paramInt2);
  }
  
  private static int a(char paramChar, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_3
    //   2: iload_0
    //   3: bipush #48
    //   5: if_icmplt -> 21
    //   8: iload_0
    //   9: bipush #57
    //   11: if_icmpgt -> 21
    //   14: iload_0
    //   15: bipush #48
    //   17: isub
    //   18: goto -> 40
    //   21: iload_0
    //   22: bipush #65
    //   24: if_icmplt -> 41
    //   27: iload_0
    //   28: bipush #70
    //   30: if_icmpgt -> 41
    //   33: iload_0
    //   34: bipush #65
    //   36: isub
    //   37: bipush #10
    //   39: iadd
    //   40: istore_3
    //   41: iload_3
    //   42: iload_1
    //   43: if_icmplt -> 48
    //   46: iconst_m1
    //   47: ireturn
    //   48: iload_2
    //   49: ifeq -> 58
    //   52: iload_3
    //   53: iload_1
    //   54: iconst_1
    //   55: isub
    //   56: ixor
    //   57: istore_3
    //   58: iload_3
    //   59: ireturn
  }
  
  private void l(int paramInt) {
    if (paramInt == 2) {
      b(1);
      return;
    } 
    if (paramInt == 8) {
      b(3);
      return;
    } 
    if (paramInt == 16) {
      b(4);
      return;
    } 
    F();
  }
  
  private void b(String paramString, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial z : ()V
    //   4: aload_1
    //   5: invokevirtual length : ()I
    //   8: istore_3
    //   9: iconst_0
    //   10: istore #4
    //   12: iconst_0
    //   13: istore #5
    //   15: iconst_0
    //   16: istore #6
    //   18: iload #4
    //   20: iload_3
    //   21: if_icmpge -> 41
    //   24: aload_1
    //   25: iload #4
    //   27: invokevirtual charAt : (I)C
    //   30: bipush #32
    //   32: if_icmpne -> 41
    //   35: iinc #4, 1
    //   38: goto -> 18
    //   41: iload #4
    //   43: iload_3
    //   44: if_icmpge -> 61
    //   47: aload_1
    //   48: iload #4
    //   50: invokevirtual charAt : (I)C
    //   53: bipush #45
    //   55: if_icmpne -> 61
    //   58: goto -> 101
    //   61: iload #4
    //   63: iload_3
    //   64: if_icmpge -> 81
    //   67: aload_1
    //   68: iload #4
    //   70: invokevirtual charAt : (I)C
    //   73: bipush #43
    //   75: if_icmpne -> 81
    //   78: goto -> 104
    //   81: iload #4
    //   83: iload_3
    //   84: if_icmpge -> 107
    //   87: aload_1
    //   88: iload #4
    //   90: invokevirtual charAt : (I)C
    //   93: bipush #47
    //   95: if_icmpne -> 107
    //   98: iconst_1
    //   99: istore #6
    //   101: iconst_1
    //   102: istore #5
    //   104: iinc #4, 1
    //   107: iload #4
    //   109: iload_3
    //   110: if_icmpge -> 145
    //   113: aload_1
    //   114: iload #4
    //   116: invokevirtual charAt : (I)C
    //   119: iload_2
    //   120: iload #6
    //   122: invokestatic a : (CIZ)I
    //   125: dup
    //   126: istore #7
    //   128: iflt -> 145
    //   131: aload_0
    //   132: iload_2
    //   133: invokespecial l : (I)V
    //   136: aload_0
    //   137: iload #7
    //   139: invokevirtual e : (I)V
    //   142: goto -> 104
    //   145: iload #4
    //   147: iload_3
    //   148: if_icmpge -> 282
    //   151: aload_1
    //   152: iload #4
    //   154: invokevirtual charAt : (I)C
    //   157: bipush #46
    //   159: if_icmpeq -> 173
    //   162: aload_1
    //   163: iload #4
    //   165: invokevirtual charAt : (I)C
    //   168: bipush #44
    //   170: if_icmpne -> 282
    //   173: iinc #4, 1
    //   176: getstatic calc/c.G : Lcalc/c;
    //   179: getstatic calc/c.f : Lcalc/c;
    //   182: getfield a : J
    //   185: putfield a : J
    //   188: getstatic calc/c.G : Lcalc/c;
    //   191: getstatic calc/c.f : Lcalc/c;
    //   194: getfield b : I
    //   197: putfield b : I
    //   200: getstatic calc/c.G : Lcalc/c;
    //   203: getstatic calc/c.f : Lcalc/c;
    //   206: getfield c : B
    //   209: putfield c : B
    //   212: iload #4
    //   214: iload_3
    //   215: if_icmpge -> 260
    //   218: aload_1
    //   219: iload #4
    //   221: invokevirtual charAt : (I)C
    //   224: iload_2
    //   225: iload #6
    //   227: invokestatic a : (CIZ)I
    //   230: dup
    //   231: istore #7
    //   233: iflt -> 260
    //   236: getstatic calc/c.G : Lcalc/c;
    //   239: iload_2
    //   240: invokespecial l : (I)V
    //   243: aload_0
    //   244: iload_2
    //   245: invokespecial l : (I)V
    //   248: aload_0
    //   249: iload #7
    //   251: invokevirtual e : (I)V
    //   254: iinc #4, 1
    //   257: goto -> 212
    //   260: iload #6
    //   262: ifeq -> 272
    //   265: aload_0
    //   266: getstatic calc/c.f : Lcalc/c;
    //   269: invokevirtual c : (Lcalc/c;)V
    //   272: aload_0
    //   273: getstatic calc/c.G : Lcalc/c;
    //   276: invokevirtual f : (Lcalc/c;)V
    //   279: goto -> 294
    //   282: iload #6
    //   284: ifeq -> 294
    //   287: aload_0
    //   288: getstatic calc/c.f : Lcalc/c;
    //   291: invokevirtual c : (Lcalc/c;)V
    //   294: iload #4
    //   296: iload_3
    //   297: if_icmpge -> 317
    //   300: aload_1
    //   301: iload #4
    //   303: invokevirtual charAt : (I)C
    //   306: bipush #32
    //   308: if_icmpne -> 317
    //   311: iinc #4, 1
    //   314: goto -> 294
    //   317: iload #4
    //   319: iload_3
    //   320: if_icmpge -> 644
    //   323: aload_1
    //   324: iload #4
    //   326: invokevirtual charAt : (I)C
    //   329: bipush #101
    //   331: if_icmpeq -> 345
    //   334: aload_1
    //   335: iload #4
    //   337: invokevirtual charAt : (I)C
    //   340: bipush #69
    //   342: if_icmpne -> 644
    //   345: iinc #4, 1
    //   348: iconst_0
    //   349: istore #8
    //   351: iconst_0
    //   352: istore #9
    //   354: iload #4
    //   356: iload_3
    //   357: if_icmpge -> 377
    //   360: aload_1
    //   361: iload #4
    //   363: invokevirtual charAt : (I)C
    //   366: bipush #45
    //   368: if_icmpne -> 377
    //   371: iconst_1
    //   372: istore #9
    //   374: goto -> 394
    //   377: iload #4
    //   379: iload_3
    //   380: if_icmpge -> 397
    //   383: aload_1
    //   384: iload #4
    //   386: invokevirtual charAt : (I)C
    //   389: bipush #43
    //   391: if_icmpne -> 397
    //   394: iinc #4, 1
    //   397: iload #4
    //   399: iload_3
    //   400: if_icmpge -> 455
    //   403: aload_1
    //   404: iload #4
    //   406: invokevirtual charAt : (I)C
    //   409: bipush #48
    //   411: if_icmplt -> 455
    //   414: aload_1
    //   415: iload #4
    //   417: invokevirtual charAt : (I)C
    //   420: bipush #57
    //   422: if_icmpgt -> 455
    //   425: iload #8
    //   427: ldc 400000000
    //   429: if_icmpge -> 449
    //   432: iload #8
    //   434: bipush #10
    //   436: imul
    //   437: aload_1
    //   438: iload #4
    //   440: invokevirtual charAt : (I)C
    //   443: bipush #48
    //   445: isub
    //   446: iadd
    //   447: istore #8
    //   449: iinc #4, 1
    //   452: goto -> 397
    //   455: iload #9
    //   457: ifeq -> 465
    //   460: iload #8
    //   462: ineg
    //   463: istore #8
    //   465: iload_2
    //   466: iconst_2
    //   467: if_icmpne -> 479
    //   470: aload_0
    //   471: iload #8
    //   473: invokevirtual b : (I)V
    //   476: goto -> 644
    //   479: iload_2
    //   480: bipush #8
    //   482: if_icmpne -> 496
    //   485: aload_0
    //   486: iload #8
    //   488: iconst_3
    //   489: imul
    //   490: invokevirtual b : (I)V
    //   493: goto -> 644
    //   496: iload_2
    //   497: bipush #16
    //   499: if_icmpne -> 513
    //   502: aload_0
    //   503: iload #8
    //   505: iconst_4
    //   506: imul
    //   507: invokevirtual b : (I)V
    //   510: goto -> 644
    //   513: aload_0
    //   514: getfield b : I
    //   517: ldc 300000000
    //   519: if_icmpgt -> 531
    //   522: aload_0
    //   523: getfield b : I
    //   526: ldc -300000000
    //   528: if_icmpge -> 593
    //   531: getstatic calc/c.F : Lcalc/c;
    //   534: getstatic calc/c.j : Lcalc/c;
    //   537: getfield a : J
    //   540: putfield a : J
    //   543: getstatic calc/c.F : Lcalc/c;
    //   546: getstatic calc/c.j : Lcalc/c;
    //   549: getfield b : I
    //   552: putfield b : I
    //   555: getstatic calc/c.F : Lcalc/c;
    //   558: getstatic calc/c.j : Lcalc/c;
    //   561: getfield c : B
    //   564: putfield c : B
    //   567: getstatic calc/c.F : Lcalc/c;
    //   570: iload #8
    //   572: iconst_2
    //   573: idiv
    //   574: invokespecial k : (I)V
    //   577: aload_0
    //   578: getstatic calc/c.F : Lcalc/c;
    //   581: invokevirtual e : (Lcalc/c;)V
    //   584: iload #8
    //   586: iload #8
    //   588: iconst_2
    //   589: idiv
    //   590: isub
    //   591: istore #8
    //   593: getstatic calc/c.F : Lcalc/c;
    //   596: getstatic calc/c.j : Lcalc/c;
    //   599: getfield a : J
    //   602: putfield a : J
    //   605: getstatic calc/c.F : Lcalc/c;
    //   608: getstatic calc/c.j : Lcalc/c;
    //   611: getfield b : I
    //   614: putfield b : I
    //   617: getstatic calc/c.F : Lcalc/c;
    //   620: getstatic calc/c.j : Lcalc/c;
    //   623: getfield c : B
    //   626: putfield c : B
    //   629: getstatic calc/c.F : Lcalc/c;
    //   632: iload #8
    //   634: invokespecial k : (I)V
    //   637: aload_0
    //   638: getstatic calc/c.F : Lcalc/c;
    //   641: invokevirtual e : (Lcalc/c;)V
    //   644: aload_0
    //   645: iload #5
    //   647: putfield c : B
    //   650: return
  }
  
  private void R() {
    if (this.a == 0L) {
      this.b = 0;
      return;
    } 
    byte b1 = 0;
    for (byte b2 = 0; b2 < 64; b2 += 4) {
      int i = (int)(this.a >>> b2 & 0xFL) + b1;
      b1 = 0;
      if (i >= 10) {
        i -= 10;
        b1 = 1;
      } 
      this.a &= 15L << b2 ^ 0xFFFFFFFFFFFFFFFFL;
      this.a += i << b2;
    } 
    if (b1 != 0) {
      if ((int)(this.a & 0xFL) >= 5)
        this.a += 16L; 
      this.a >>>= 4L;
      this.a += 1152921504606846976L;
      this.b++;
      if ((int)(this.a & 0xFL) >= 10)
        R(); 
    } 
    while (this.a >>> 60L == 0L) {
      this.a <<= 4L;
      this.b--;
    } 
  }
  
  private void S() {
    F.a = this.a;
    F.b = this.b;
    F.c = this.c;
    F.a();
    G.a = F.a;
    G.b = F.b;
    G.c = F.c;
    this.b = F.M();
    if (this.b > 300000000 || this.b < -300000000) {
      F.a = j.a;
      F.b = j.b;
      F.c = j.c;
      F.k(this.b / 2);
      G.f(F);
      F.a = j.a;
      F.b = j.b;
      F.c = j.c;
      F.k(this.b - this.b / 2);
    } 
    G.f(F);
    this.a = 0L;
    for (byte b = 60; b >= 0; b -= 4) {
      F.a = G.a;
      F.b = G.b;
      F.c = G.c;
      F.c();
      this.a += F.e() << b;
      G.d(F);
      G.F();
    } 
    if (G.n(i) >= 0)
      this.a++; 
    R();
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3) {
    if (this.a >= 0L)
      return false; 
    int i;
    if ((i = 64 - paramInt3 * paramInt2) <= 0)
      return false; 
    J.a = this.a;
    J.b = this.b;
    J.c = this.c;
    if (paramInt1 == 10) {
      J.a += 5L << i - 4;
      J.R();
    } else {
      J.a += 1L << i - 1;
    } 
    if (J.a >= 0L) {
      this.a = 1L << 64 - paramInt2;
      this.b++;
      return true;
    } 
    return false;
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3) {
    if (this.b == 0 && this.a == 0L)
      return; 
    int i;
    if ((i = 64 - paramInt3 * paramInt2) <= 0)
      return; 
    long l = this.a;
    if (paramInt1 == 10) {
      this.a += 5L << i - 4;
      R();
    } else {
      this.a += 1L << i - 1;
    } 
    if (l < 0L && this.a >= 0L) {
      this.a = 1L << 64 - paramInt2;
      this.b++;
    } 
  }
  
  private static String a(StringBuffer paramStringBuffer, calc/e paramcalc/e) {
    if (paramcalc/e.h == 1) {
      while (paramStringBuffer.length() < paramcalc/e.b)
        paramStringBuffer.append(' '); 
    } else if (paramcalc/e.h == 2) {
      while (paramStringBuffer.length() < paramcalc/e.b)
        paramStringBuffer.insert(0, ' '); 
    } else if (paramcalc/e.h == 3) {
      while (paramStringBuffer.length() < paramcalc/e.b) {
        paramStringBuffer.append(' ');
        if (paramStringBuffer.length() < paramcalc/e.b)
          paramStringBuffer.insert(0, ' '); 
      } 
    } 
    return paramStringBuffer.toString();
  }
  
  private String b(calc/e paramcalc/e) {
    byte b1;
    K.setLength(0);
    if (this.b < 0 && this.a != 0L) {
      K.append("nan");
      return a(K, paramcalc/e);
    } 
    if (this.b < 0 && this.a == 0L) {
      K.append((this.c != 0) ? "-inf" : "inf");
      return a(K, paramcalc/e);
    } 
    switch (paramcalc/e.a) {
      case 2:
        b1 = 1;
      case 8:
        b1 = 3;
      case 16:
        b1 = 4;
      default:
        b1 = 4;
        break;
    } 
    char c1 = '\003';
    if (paramcalc/e.g == '\000')
      c1 = 'Ϩ'; 
    byte b2 = 64;
    I.a = this.a;
    I.b = this.b;
    I.c = this.c;
    if (this.b == 0 && this.a == 0L) {
      I.b = 0;
      if (paramcalc/e.a != 10)
        I.c = 0; 
    } else if (paramcalc/e.a == 10) {
      I.S();
    } else {
      if (I.c != 0) {
        I.a = -I.a;
        if ((I.a >> 62L & 0x3L) == 3L) {
          I.a <<= 1L;
          I.b--;
          b2--;
        } 
      } 
      I.b -= 1073741823;
      int k = b1 - 1 - b(I.b, b1);
      I.b = a(I.b, b1);
      if (k == b1 - 1) {
        I.a <<= 1L;
        I.b--;
        b2--;
      } else if (k > 0) {
        I.a = I.a + (1L << k - 1) >>> k;
        if (I.c != 0)
          I.a |= Long.MIN_VALUE >> k - 1; 
      } 
    } 
    int i = (b2 + b1 - 1) / b1;
    int j = 0;
    while (true) {
      int k;
      int m = paramcalc/e.b - 1;
      byte b = 0;
      if (paramcalc/e.a != 10) {
        b = 1;
      } else if (I.c != 0) {
        m--;
      } 
      boolean bool = false;
      switch (paramcalc/e.d) {
        case 2:
          k = paramcalc/e.c + 1;
          bool = true;
          break;
        case 3:
          j = b(I.b, 3);
          k = paramcalc/e.c + 1 + j;
          bool = true;
          break;
        default:
          k = 1000;
          if (paramcalc/e.d == 1)
            k = paramcalc/e.c + 1; 
          if (I.b + 1 > m - (I.b + b) / c1 - b + (paramcalc/e.f ? 1 : 0) || I.b + 1 > i || -I.b >= m || -I.b >= k) {
            bool = true;
            break;
          } 
          j = I.b;
          k += I.b;
          if (I.b > 0)
            m -= (I.b + b) / c1; 
          if (paramcalc/e.f && I.b == m - b)
            m++; 
          break;
      } 
      if (b != 0 && j >= 0)
        m -= b; 
      L.setLength(0);
      if (bool) {
        L.append('e');
        L.append(I.b - j);
        m -= L.length();
      } 
      if (k > i)
        k = i; 
      if (k > m)
        k = m; 
      if (k > m + j)
        k = m + j; 
      if (k <= 0)
        k = 1; 
      if (!I.a(paramcalc/e.a, b1, k)) {
        I.b(paramcalc/e.a, b1, k);
        if (I.c != 0 && paramcalc/e.a == 10)
          K.append('-'); 
        m = j;
        b = (paramcalc/e.a == 10 || I.c == 0) ? 48 : "0123456789ABCDEF".charAt(paramcalc/e.a - 1);
        if (j < 0) {
          K.append(b);
          K.append(paramcalc/e.e);
          while (j < -1) {
            K.append(b);
            j++;
          } 
        } 
        while (k > 0) {
          K.append("0123456789ABCDEF".charAt((int)(I.a >>> 64 - b1)));
          I.a <<= b1;
          if (j > 0 && j % c1 == 0)
            K.append(paramcalc/e.g); 
          if (j == 0)
            K.append(paramcalc/e.e); 
          k--;
          j--;
        } 
        if (paramcalc/e.d == 0)
          while (K.charAt(K.length() - 1) == '0')
            K.setLength(K.length() - 1);  
        if (paramcalc/e.f && K.charAt(K.length() - 1) == paramcalc/e.e)
          K.setLength(K.length() - 1); 
        K.append(L);
        if (paramcalc/e.a != 10) {
          while (K.length() < paramcalc/e.b) {
            if (++m > 0 && m % c1 == 0)
              K.insert(0, paramcalc/e.g); 
            if (K.length() < paramcalc/e.b)
              K.insert(0, b); 
          } 
          if (K.charAt(0) == paramcalc/e.g)
            K.deleteCharAt(0); 
        } 
        return a(K, paramcalc/e);
      } 
    } 
  }
  
  public final String toString() {
    M.a = 10;
    return b(M);
  }
  
  public final String g(int paramInt) {
    M.a = paramInt;
    return b(M);
  }
  
  public final String a(calc/e paramcalc/e) {
    return b(paramcalc/e);
  }
  
  static {
    new c(0, 1073741830, 7205759403792793600L);
  }
  
  static {
    new c(0, 1073741820, 7378697629483820646L);
    new c(0, 1073741817, 5902958103587056517L);
  }
  
  static {
    new c(0, 1073741825, 6267931151224907085L);
  }
  
  static {
    new c(0, 1073741825, 5309399739799983627L);
    new c(0, 1073741824, 6653256548922161246L);
  }
  
  static {
    new c(0, 2147483647, Long.MAX_VALUE);
    new c(0, 0, 4611686018427387904L);
  }
  
  static {
    new c(0, -2147483648, 0L);
    new c(1, -2147483648, 0L);
    new c(1, 0, 0L);
    new c(1, 1073741824, 4611686018427387904L);
  }
  
  public static class calc/e {
    public int a = 10;
    
    public int b = 64;
    
    public int c = 16;
    
    public int d = 0;
    
    public char e = '.';
    
    public boolean f = true;
    
    public char g = Character.MIN_VALUE;
    
    public int h = 0;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\calc\c.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */