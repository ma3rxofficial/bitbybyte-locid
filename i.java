import java.io.InputStream;
import java.io.OutputStream;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.HttpConnection;

public class i implements Runnable {
  private String[] a;
  
  protected String a;
  
  protected String b;
  
  protected String c;
  
  protected String d;
  
  protected String e;
  
  protected String f;
  
  protected long a;
  
  private long k;
  
  protected long b;
  
  protected boolean a;
  
  protected boolean b;
  
  protected boolean c;
  
  protected boolean d;
  
  protected boolean e;
  
  protected long c;
  
  protected long d;
  
  private long l;
  
  protected long e;
  
  private long m;
  
  protected byte a;
  
  protected byte b;
  
  protected short a;
  
  protected boolean f;
  
  protected long f;
  
  byte c;
  
  private ag a;
  
  protected long g;
  
  protected long h;
  
  public long i;
  
  public long j;
  
  private int c;
  
  private int d;
  
  protected String g;
  
  protected int a;
  
  private HttpConnection a;
  
  int b;
  
  private StringBuffer a;
  
  public boolean g;
  
  private boolean i;
  
  public static i a;
  
  public static boolean h;
  
  private int e;
  
  public static l a;
  
  public static Timer a;
  
  public i() {}
  
  public i(String[] paramArrayOfString, boolean paramBoolean) {
    this.e = paramBoolean;
    this.a = (Timer)paramArrayOfString;
    this.a = false;
    this.b = -1;
    (this = this).a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.a = 0L;
    this.b = -1L;
    this.a = false;
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.c = 0;
    this.c = 0L;
    this.d = 0L;
    this.e = 0L;
    this.m = 0L;
    this.b = -1;
    this.a = null;
    this.g = 0L;
    this.i = -1L;
    this.f = -1L;
  }
  
  private void b(boolean paramBoolean) {
    v.cM = true;
    if (this.a == null)
      return; 
    this.a = this.a[0];
    this.b = this.a[1];
    this.c = this.a[2];
    this.d = ai.e(v.c(v.i((String)this.a[3])));
    this.f = ai.f((String)this.a[3]);
    this.b = v.e((String)this.a[4]);
    this.c = v.e((String)this.a[5]);
    this.d = v.e((String)this.a[6]);
    if (this.b != 0 && this.c == 0)
      this.d = s.e(ai.e((String)this.a)); 
    this.d = ai.h(this.d);
    this.e = a(this);
    this.e = v.c(this.e);
    if (this.e == null) {
      this.e = 0;
      this.a = null;
      return;
    } 
    Timer timer;
    int j;
    if (!paramBoolean && (timer = this.a[7]) != null && timer.length() > 2 && (j = timer.indexOf('-')) > 0) {
      this.a = v.a(timer.substring(0, j), 0);
      if (this.a < 0L)
        this.a = 0L; 
      if (j < timer.length())
        this.b = v.a(timer.substring(j + 1), -1); 
      if (this.b < this.a)
        this.b = -1L; 
      this.a = v.e((String)this.a[8]);
    } 
  }
  
  public final boolean a() {
    if (w.C) {
      b();
      return false;
    } 
    return b();
  }
  
  public final boolean b() {
    return (!w.C && this.b == this.a && this.a != null);
  }
  
  public final void a() {
    if (this.c == 0L && b()) {
      b();
      return;
    } 
    if (this.c == 0L && d())
      this.b = 0; 
    a(true);
  }
  
  public final void b() {
    if (this.c == 0L && b()) {
      this.c = v.a();
      this.c = 1;
      v.l = 1;
    } 
    this.b = 0;
  }
  
  public final void c() {
    this.c = v.a();
    this.f = 1L;
    this.c = 1;
    this.b = 5;
    this.b = 0;
  }
  
  public final void d() {
    this.c = 0L;
    this.f = 0L;
    this.b = 0;
  }
  
  public final boolean c() {
    return (this.c != 0L && this.f != 0L && this.b == 5);
  }
  
  public final void a(boolean paramBoolean) {
    if (this.c != 0L || d() || h()) {
      this.c = 0L;
      this.f = -1L;
      this.c = paramBoolean;
      this.i = true;
      this.a = true;
      v.a(this);
    } 
  }
  
  public final void a(long paramLong) {
    this.f = paramLong;
    this.c = v.a();
  }
  
  public final void e() {
    if (!b()) {
      this.c = 0;
      this.g = this.c = 0L;
      (this.c = 0L).h = this;
      f();
      d();
      this.a = true;
      v.a(this);
    } 
  }
  
  public final void run() {
    this.g = "";
    try {
      if (v.a() || v.b(0)) {
        af.b.c(v.d(683));
        throw new SecurityException(v.d(683));
      } 
      if (this.a == 2) {
        a = null;
        b(true);
        w.a(false, false);
        ((v)((aa)w.a).a).aM = 1;
        ((aa)w.a).a.a(v.c(17462), false, false, (String)null, "", (byte[])null);
        af.b.a(true, (v)((aa)w.a).a);
        a = (Timer)this;
        i i1;
        (i1 = this).b = 2;
        i1.c(false);
        i1.b = 0;
      } else {
        w.a(false, false);
        af.b.b(false, (v)((aa)w.a).a);
        if (!this.i)
          b(false); 
        if (this.e != 0) {
          w.l();
          v.cM = true;
          if (v.cN && ((v)((aa)w.a).a).c != null && (v.a(((v)((aa)w.a).a).c.b()) == 17457 || v.a(((v)((aa)w.a).a).c.b()) == 17458)) {
            ((aa)w.a).a.d(false);
          } else if (!h) {
            if (this.g) {
              this.g = false;
              ((aa)w.a).b = w.a.size() - 1;
            } 
            w.a.c();
            w.a.a();
          } 
          if (!h && w.v)
            h = true; 
          if (c())
            return; 
          i i1;
          (i1 = this).b = 1;
          i1.c(true);
          i1.b = 0;
        } 
      } 
    } catch (Throwable throwable) {
      a(throwable.toString());
    } 
    this.i = false;
    af.b.b(true, (v)((aa)w.a).a);
    a = null;
    if (this.a == 2 && (d() || v.d(this.g))) {
      af.b.c(v.a("ec=", String.valueOf(this.a), "\n", this.g));
    } else if (this.a != 2 && v.cT) {
      a(this.a.toString().replace(false, '\n'));
    } 
    if (this.b == 7 && v.cQ && this.c < v.bl) {
      c();
      this.i = true;
    } 
    if (this.b == 4 && v.cR && this.d < v.bl) {
      c();
      this.i = true;
    } 
    if (!w.C) {
      w.j();
      w.i();
    } 
    if (!g() && (d() || e()))
      w.a(1, (this.a != true)); 
    if (!g() && (d() || e()) && ((w.v && w.b.isEmpty()) || !w.v) && w.c() == 0)
      w.a(2, (this.a != true)); 
    if (w.b.isEmpty())
      w.v = false; 
    af.b.l();
    if (!(v.cM = (w.c() != 0))) {
      af.b.a((v)((aa)w.a).a);
      w.a.b();
      ((v)((aa)w.a).a).aM = 0;
    } 
  }
  
  public final boolean d() {
    return (this.b == 4 || this.b == 7 || this.b == 1 || this.b == 8 || (v.d(this.g) && this.e != 0 && this.a < 34));
  }
  
  public final boolean e() {
    return (a(this.b) && this.e != 0 && this.a >= 34);
  }
  
  private static boolean a(int paramInt) {
    return (paramInt == 2 || (paramInt >= 9 && paramInt <= 13));
  }
  
  public final boolean f() {
    return ((this.b == 5 && this.e != 0) || h());
  }
  
  private boolean h() {
    return (!b() && this.b == 0);
  }
  
  public final boolean g() {
    return (this.f > 0L && this.c > 0L);
  }
  
  private void c(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic a : ()Z
    //   3: ifeq -> 30
    //   6: getstatic af.b : Laf;
    //   9: sipush #683
    //   12: invokestatic d : (I)Ljava/lang/String;
    //   15: invokevirtual c : (Ljava/lang/String;)V
    //   18: aload_0
    //   19: sipush #683
    //   22: invokestatic d : (I)Ljava/lang/String;
    //   25: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   28: pop
    //   29: return
    //   30: aload_0
    //   31: getfield a : Ljava/lang/String;
    //   34: astore_2
    //   35: aload_0
    //   36: getfield b : Ljava/lang/String;
    //   39: astore_3
    //   40: aconst_null
    //   41: astore #4
    //   43: aconst_null
    //   44: astore #5
    //   46: aload_0
    //   47: invokestatic currentTimeMillis : ()J
    //   50: putfield g : J
    //   53: aload_0
    //   54: lconst_0
    //   55: putfield m : J
    //   58: aload_0
    //   59: iconst_0
    //   60: putfield b : B
    //   63: aload_0
    //   64: ldc ''
    //   66: putfield g : Ljava/lang/String;
    //   69: aconst_null
    //   70: astore #6
    //   72: aconst_null
    //   73: astore #7
    //   75: iconst_0
    //   76: istore #8
    //   78: aconst_null
    //   79: astore #9
    //   81: aload_0
    //   82: getfield a : Ljava/lang/StringBuffer;
    //   85: ifnonnull -> 103
    //   88: aload_0
    //   89: new java/lang/StringBuffer
    //   92: dup
    //   93: iconst_0
    //   94: invokespecial <init> : (I)V
    //   97: putfield a : Ljava/lang/StringBuffer;
    //   100: goto -> 111
    //   103: aload_0
    //   104: getfield a : Ljava/lang/StringBuffer;
    //   107: iconst_0
    //   108: invokevirtual setLength : (I)V
    //   111: aload_0
    //   112: iconst_0
    //   113: putfield a : I
    //   116: iload_1
    //   117: ifeq -> 146
    //   120: aload_0
    //   121: getfield a : Lag;
    //   124: ifnonnull -> 138
    //   127: aload_0
    //   128: aconst_null
    //   129: invokestatic a : (Lag;)Lag;
    //   132: putfield a : Lag;
    //   135: goto -> 146
    //   138: aload_0
    //   139: getfield a : Lag;
    //   142: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   145: pop
    //   146: lconst_0
    //   147: lstore #10
    //   149: iload_1
    //   150: ifeq -> 233
    //   153: getstatic v.bd : I
    //   156: iconst_2
    //   157: if_icmpeq -> 167
    //   160: getstatic v.bd : I
    //   163: iconst_3
    //   164: if_icmpne -> 233
    //   167: aload_0
    //   168: getfield c : Z
    //   171: ifne -> 185
    //   174: aload_0
    //   175: getfield b : J
    //   178: ldc2_w -1
    //   181: lcmp
    //   182: ifeq -> 233
    //   185: aload_0
    //   186: getfield a : Lag;
    //   189: ldc 'file:///'
    //   191: aload_0
    //   192: getfield f : Ljava/lang/String;
    //   195: aload_0
    //   196: getfield e : Ljava/lang/String;
    //   199: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   202: invokeinterface c : (Ljava/lang/String;)Z
    //   207: pop
    //   208: aload_0
    //   209: getfield a : Lag;
    //   212: invokeinterface e : ()J
    //   217: lstore #10
    //   219: goto -> 223
    //   222: pop
    //   223: lload #10
    //   225: lconst_0
    //   226: lcmp
    //   227: ifge -> 233
    //   230: lconst_0
    //   231: lstore #10
    //   233: aload_0
    //   234: aload_0
    //   235: getfield a : J
    //   238: putfield k : J
    //   241: aload_0
    //   242: getfield b : J
    //   245: ldc2_w -1
    //   248: lcmp
    //   249: ifne -> 284
    //   252: aload_0
    //   253: getfield c : Z
    //   256: ifeq -> 284
    //   259: getstatic v.bd : I
    //   262: iconst_2
    //   263: if_icmpeq -> 273
    //   266: getstatic v.bd : I
    //   269: iconst_3
    //   270: if_icmpne -> 284
    //   273: aload_0
    //   274: aload_0
    //   275: lload #10
    //   277: dup2_x1
    //   278: putfield k : J
    //   281: putfield e : J
    //   284: aconst_null
    //   285: astore #12
    //   287: aload_0
    //   288: getfield f : J
    //   291: lconst_0
    //   292: lcmp
    //   293: ifle -> 304
    //   296: aload_0
    //   297: iconst_0
    //   298: putfield b : I
    //   301: goto -> 328
    //   304: getstatic v.bv : I
    //   307: bipush #10
    //   309: ishl
    //   310: newarray byte
    //   312: astore #12
    //   314: goto -> 328
    //   317: pop
    //   318: invokestatic C : ()V
    //   321: sipush #8192
    //   324: newarray byte
    //   326: astore #12
    //   328: aload_0
    //   329: ldc2_w -1
    //   332: putfield d : J
    //   335: aload_0
    //   336: getfield a : Ljavax/microedition/io/HttpConnection;
    //   339: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   342: pop
    //   343: aload_0
    //   344: iconst_1
    //   345: putfield a : I
    //   348: aload_0
    //   349: invokevirtual a : ()Z
    //   352: ifeq -> 2427
    //   355: aload_0
    //   356: iconst_2
    //   357: putfield a : I
    //   360: aload_0
    //   361: invokestatic a : (Li;)Z
    //   364: ifeq -> 404
    //   367: aload_0
    //   368: aload_2
    //   369: aload_3
    //   370: aload_0
    //   371: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Li;)Ljavax/microedition/io/HttpConnection;
    //   374: dup_x1
    //   375: putfield a : Ljavax/microedition/io/HttpConnection;
    //   378: ifnonnull -> 404
    //   381: aload_0
    //   382: invokevirtual a : ()Z
    //   385: ifeq -> 396
    //   388: new java/io/IOException
    //   391: dup
    //   392: invokespecial <init> : ()V
    //   395: athrow
    //   396: aload_0
    //   397: iconst_0
    //   398: putfield b : I
    //   401: goto -> 2427
    //   404: aload_0
    //   405: iconst_3
    //   406: putfield a : I
    //   409: iload_1
    //   410: ifne -> 430
    //   413: getstatic v.cC : Z
    //   416: ifeq -> 430
    //   419: aload_0
    //   420: getfield a : Ljavax/microedition/io/HttpConnection;
    //   423: ldc 'HEAD'
    //   425: invokeinterface setRequestMethod : (Ljava/lang/String;)V
    //   430: getstatic v.dh : Z
    //   433: ifeq -> 544
    //   436: aload_0
    //   437: getfield b : J
    //   440: ldc2_w -1
    //   443: lcmp
    //   444: ifne -> 459
    //   447: aload_0
    //   448: getfield k : J
    //   451: getstatic v.bw : I
    //   454: i2l
    //   455: ladd
    //   456: goto -> 485
    //   459: aload_0
    //   460: getfield k : J
    //   463: getstatic v.bw : I
    //   466: i2l
    //   467: ladd
    //   468: aload_0
    //   469: getfield k : J
    //   472: aload_0
    //   473: getfield b : J
    //   476: aload_0
    //   477: getfield k : J
    //   480: lsub
    //   481: ladd
    //   482: invokestatic b : (JJ)J
    //   485: lstore #13
    //   487: aload_0
    //   488: getfield d : J
    //   491: lconst_0
    //   492: lcmp
    //   493: ifle -> 519
    //   496: lload #13
    //   498: lconst_0
    //   499: lcmp
    //   500: ifle -> 519
    //   503: aload_0
    //   504: getfield k : J
    //   507: aload_0
    //   508: getfield d : J
    //   511: ladd
    //   512: lload #13
    //   514: invokestatic b : (JJ)J
    //   517: lstore #13
    //   519: aload_0
    //   520: getfield l : J
    //   523: lconst_0
    //   524: lcmp
    //   525: ifle -> 550
    //   528: aload_0
    //   529: getfield l : J
    //   532: lconst_1
    //   533: lsub
    //   534: lload #13
    //   536: invokestatic b : (JJ)J
    //   539: lstore #13
    //   541: goto -> 550
    //   544: aload_0
    //   545: getfield b : J
    //   548: lstore #13
    //   550: aload_0
    //   551: getfield a : Ljavax/microedition/io/HttpConnection;
    //   554: ldc 'Range'
    //   556: ldc 'bytes='
    //   558: aload_0
    //   559: getfield k : J
    //   562: invokestatic valueOf : (J)Ljava/lang/String;
    //   565: ldc '-'
    //   567: iload_1
    //   568: ifeq -> 586
    //   571: lload #13
    //   573: lconst_0
    //   574: lcmp
    //   575: ifle -> 586
    //   578: lload #13
    //   580: invokestatic valueOf : (J)Ljava/lang/String;
    //   583: goto -> 588
    //   586: ldc ''
    //   588: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   591: aload_0
    //   592: getfield a : Ljava/lang/StringBuffer;
    //   595: invokestatic a : (Ljavax/microedition/io/HttpConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuffer;)V
    //   598: bipush #30
    //   600: invokestatic b : (I)Z
    //   603: pop
    //   604: aload #6
    //   606: invokestatic d : (Ljava/lang/String;)Z
    //   609: ifeq -> 642
    //   612: aload_0
    //   613: getfield a : Ljavax/microedition/io/HttpConnection;
    //   616: ldc 'Cookie'
    //   618: aload #6
    //   620: aload_0
    //   621: getfield a : Ljava/lang/StringBuffer;
    //   624: invokestatic a : (Ljavax/microedition/io/HttpConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuffer;)V
    //   627: bipush #7
    //   629: aload #6
    //   631: invokevirtual length : ()I
    //   634: iadd
    //   635: invokestatic b : (I)Z
    //   638: pop
    //   639: goto -> 683
    //   642: aload_0
    //   643: getfield c : Ljava/lang/String;
    //   646: invokestatic d : (Ljava/lang/String;)Z
    //   649: ifeq -> 683
    //   652: aload_0
    //   653: getfield a : Ljavax/microedition/io/HttpConnection;
    //   656: ldc 'Cookie'
    //   658: aload_0
    //   659: getfield c : Ljava/lang/String;
    //   662: aload_0
    //   663: getfield a : Ljava/lang/StringBuffer;
    //   666: invokestatic a : (Ljavax/microedition/io/HttpConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuffer;)V
    //   669: bipush #7
    //   671: aload_0
    //   672: getfield c : Ljava/lang/String;
    //   675: invokevirtual length : ()I
    //   678: iadd
    //   679: invokestatic b : (I)Z
    //   682: pop
    //   683: aload_0
    //   684: iconst_4
    //   685: putfield a : I
    //   688: aload_0
    //   689: getfield a : Ljavax/microedition/io/HttpConnection;
    //   692: invokeinterface getResponseCode : ()I
    //   697: istore #8
    //   699: aload_0
    //   700: getfield a : Ljavax/microedition/io/HttpConnection;
    //   703: invokeinterface getResponseMessage : ()Ljava/lang/String;
    //   708: astore #9
    //   710: goto -> 746
    //   713: astore #15
    //   715: aload_0
    //   716: sipush #584
    //   719: invokestatic d : (I)Ljava/lang/String;
    //   722: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   725: pop
    //   726: aload_0
    //   727: aload #15
    //   729: invokevirtual toString : ()Ljava/lang/String;
    //   732: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   735: pop
    //   736: new java/lang/Exception
    //   739: dup
    //   740: ldc ''
    //   742: invokespecial <init> : (Ljava/lang/String;)V
    //   745: athrow
    //   746: aload_0
    //   747: iconst_5
    //   748: putfield a : I
    //   751: aload_0
    //   752: getfield a : Ljava/lang/StringBuffer;
    //   755: ldc ' << '
    //   757: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   760: pop
    //   761: iconst_0
    //   762: istore #18
    //   764: aload_0
    //   765: getfield a : Ljavax/microedition/io/HttpConnection;
    //   768: iload #18
    //   770: invokeinterface getHeaderFieldKey : (I)Ljava/lang/String;
    //   775: dup
    //   776: astore #16
    //   778: ifnull -> 828
    //   781: aload_0
    //   782: getfield a : Ljavax/microedition/io/HttpConnection;
    //   785: iload #18
    //   787: invokeinterface getHeaderField : (I)Ljava/lang/String;
    //   792: dup
    //   793: astore #15
    //   795: ifnull -> 828
    //   798: aload_0
    //   799: getfield a : Ljava/lang/StringBuffer;
    //   802: aload #16
    //   804: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   807: bipush #58
    //   809: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   812: aload #15
    //   814: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   817: iconst_0
    //   818: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   821: pop
    //   822: iinc #18, 1
    //   825: goto -> 764
    //   828: aload_0
    //   829: getfield a : Ljava/lang/StringBuffer;
    //   832: invokevirtual length : ()I
    //   835: invokestatic a : (I)Z
    //   838: putstatic w.C : Z
    //   841: goto -> 845
    //   844: pop
    //   845: iload_1
    //   846: ifeq -> 863
    //   849: getstatic v.cT : Z
    //   852: ifne -> 863
    //   855: aload_0
    //   856: getfield a : Ljava/lang/StringBuffer;
    //   859: iconst_0
    //   860: invokevirtual setLength : (I)V
    //   863: aload_0
    //   864: aload_0
    //   865: getfield a : Ljavax/microedition/io/HttpConnection;
    //   868: invokestatic a : (Ljavax/microedition/io/HttpConnection;)J
    //   871: dup2
    //   872: lstore #15
    //   874: ldc2_w -1
    //   877: lcmp
    //   878: ifeq -> 885
    //   881: iconst_2
    //   882: goto -> 886
    //   885: iconst_1
    //   886: putfield c : B
    //   889: iload_1
    //   890: ifeq -> 928
    //   893: aload_0
    //   894: getfield c : B
    //   897: iconst_1
    //   898: if_icmpne -> 928
    //   901: aload_0
    //   902: getfield c : Z
    //   905: ifeq -> 913
    //   908: aload_0
    //   909: iconst_1
    //   910: putfield d : Z
    //   913: aload_0
    //   914: iconst_0
    //   915: putfield c : Z
    //   918: aload_0
    //   919: aload_0
    //   920: lconst_0
    //   921: dup2_x1
    //   922: putfield k : J
    //   925: putfield e : J
    //   928: lload #15
    //   930: lconst_0
    //   931: lcmp
    //   932: ifgt -> 968
    //   935: aload_0
    //   936: getfield a : Ljavax/microedition/io/HttpConnection;
    //   939: ldc 'Content-Length'
    //   941: invokeinterface getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   946: ldc2_w -1
    //   949: invokestatic a : (Ljava/lang/String;J)J
    //   952: dup2
    //   953: lstore #15
    //   955: ldc2_w -1
    //   958: lcmp
    //   959: ifne -> 983
    //   962: lconst_0
    //   963: lstore #15
    //   965: goto -> 983
    //   968: aload_0
    //   969: getfield l : J
    //   972: lconst_0
    //   973: lcmp
    //   974: ifgt -> 983
    //   977: aload_0
    //   978: lload #15
    //   980: putfield l : J
    //   983: lload #15
    //   985: lconst_0
    //   986: lcmp
    //   987: ifle -> 996
    //   990: aload_0
    //   991: lload #15
    //   993: putfield d : J
    //   996: aload_0
    //   997: bipush #6
    //   999: putfield a : I
    //   1002: aload_0
    //   1003: getfield a : Ljavax/microedition/io/HttpConnection;
    //   1006: ldc 'Set-Cookie'
    //   1008: invokeinterface getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   1013: astore #6
    //   1015: aload_0
    //   1016: bipush #7
    //   1018: putfield a : I
    //   1021: iload #8
    //   1023: sipush #300
    //   1026: if_icmplt -> 1199
    //   1029: iload #8
    //   1031: sipush #307
    //   1034: if_icmpgt -> 1199
    //   1037: aload_0
    //   1038: bipush #8
    //   1040: putfield a : I
    //   1043: aload_2
    //   1044: astore_3
    //   1045: aload_0
    //   1046: getfield a : Ljavax/microedition/io/HttpConnection;
    //   1049: ldc 'Location'
    //   1051: invokeinterface getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   1056: astore #17
    //   1058: aload_0
    //   1059: bipush #9
    //   1061: putfield a : I
    //   1064: aload_2
    //   1065: aload #17
    //   1067: astore #14
    //   1069: astore #13
    //   1071: aload #14
    //   1073: invokestatic c : (Ljava/lang/String;)Z
    //   1076: ifeq -> 1084
    //   1079: aload #13
    //   1081: goto -> 1122
    //   1084: aload #14
    //   1086: invokevirtual trim : ()Ljava/lang/String;
    //   1089: invokestatic a : (Ljava/lang/String;)Z
    //   1092: ifeq -> 1100
    //   1095: aload #14
    //   1097: goto -> 1122
    //   1100: new s
    //   1103: dup
    //   1104: new s
    //   1107: dup
    //   1108: aload #13
    //   1110: invokespecial <init> : (Ljava/lang/String;)V
    //   1113: aload #14
    //   1115: invokespecial <init> : (Ls;Ljava/lang/String;)V
    //   1118: iconst_1
    //   1119: invokestatic a : (Ls;Z)Ljava/lang/String;
    //   1122: dup
    //   1123: astore #17
    //   1125: ifnull -> 1199
    //   1128: aload_0
    //   1129: bipush #10
    //   1131: putfield a : I
    //   1134: aload #17
    //   1136: aload_2
    //   1137: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1140: ifeq -> 1151
    //   1143: aload_0
    //   1144: iconst_3
    //   1145: putfield b : B
    //   1148: goto -> 2427
    //   1151: aload #17
    //   1153: astore_2
    //   1154: iload_1
    //   1155: ifeq -> 1190
    //   1158: aload_0
    //   1159: getfield b : Z
    //   1162: ifeq -> 1190
    //   1165: aload_0
    //   1166: getfield c : Z
    //   1169: ifne -> 1190
    //   1172: aload_0
    //   1173: bipush #11
    //   1175: putfield a : I
    //   1178: aload_0
    //   1179: aload #17
    //   1181: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1184: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1187: putfield e : Ljava/lang/String;
    //   1190: aload_0
    //   1191: bipush #12
    //   1193: putfield a : I
    //   1196: goto -> 2413
    //   1199: aload_0
    //   1200: bipush #13
    //   1202: putfield a : I
    //   1205: aload_0
    //   1206: invokevirtual a : ()Z
    //   1209: ifeq -> 2427
    //   1212: aload_0
    //   1213: bipush #14
    //   1215: putfield a : I
    //   1218: iload #8
    //   1220: sipush #200
    //   1223: if_icmpeq -> 1234
    //   1226: iload #8
    //   1228: sipush #206
    //   1231: if_icmpne -> 2365
    //   1234: iload_1
    //   1235: ifeq -> 1264
    //   1238: aload_0
    //   1239: getfield c : Z
    //   1242: ifeq -> 1264
    //   1245: aload_0
    //   1246: getfield c : B
    //   1249: iconst_1
    //   1250: if_icmpne -> 1264
    //   1253: aload_0
    //   1254: sipush #290
    //   1257: invokestatic d : (I)Ljava/lang/String;
    //   1260: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   1263: pop
    //   1264: aload_0
    //   1265: bipush #15
    //   1267: putfield a : I
    //   1270: aload_0
    //   1271: getfield a : Ljavax/microedition/io/HttpConnection;
    //   1274: ldc 'Content-Disposition'
    //   1276: invokeinterface getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   1281: dup
    //   1282: astore #7
    //   1284: ifnull -> 1667
    //   1287: aload_0
    //   1288: bipush #16
    //   1290: putfield a : I
    //   1293: aload #7
    //   1295: aload_0
    //   1296: getfield a : Ljavax/microedition/io/HttpConnection;
    //   1299: invokeinterface getType : ()Ljava/lang/String;
    //   1304: astore #14
    //   1306: astore #13
    //   1308: ldc ''
    //   1310: astore #7
    //   1312: aload #13
    //   1314: invokestatic d : (Ljava/lang/String;)Z
    //   1317: ifeq -> 1593
    //   1320: aload #13
    //   1322: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1325: astore #15
    //   1327: iconst_0
    //   1328: istore #16
    //   1330: aload #15
    //   1332: ldc 'inline'
    //   1334: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1337: iconst_m1
    //   1338: if_icmpne -> 1352
    //   1341: aload #15
    //   1343: ldc 'attachment'
    //   1345: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1348: iconst_m1
    //   1349: if_icmpeq -> 1418
    //   1352: aload #15
    //   1354: ldc 'filename='
    //   1356: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1359: dup
    //   1360: istore #17
    //   1362: iconst_m1
    //   1363: if_icmpeq -> 1418
    //   1366: aload #13
    //   1368: iload #17
    //   1370: bipush #9
    //   1372: iadd
    //   1373: invokevirtual substring : (I)Ljava/lang/String;
    //   1376: dup
    //   1377: astore #7
    //   1379: bipush #34
    //   1381: invokestatic b : (Ljava/lang/String;C)Z
    //   1384: ifeq -> 1523
    //   1387: aload #7
    //   1389: bipush #34
    //   1391: iconst_1
    //   1392: invokevirtual indexOf : (II)I
    //   1395: dup
    //   1396: istore #17
    //   1398: iconst_m1
    //   1399: if_icmpeq -> 1523
    //   1402: aload #7
    //   1404: iconst_1
    //   1405: iload #17
    //   1407: invokevirtual substring : (II)Ljava/lang/String;
    //   1410: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1413: astore #7
    //   1415: goto -> 1523
    //   1418: aload #15
    //   1420: ldc 'inline'
    //   1422: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1425: iconst_m1
    //   1426: if_icmpeq -> 1516
    //   1429: aload #15
    //   1431: ldc 'filename*='
    //   1433: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1436: dup
    //   1437: istore #17
    //   1439: iconst_m1
    //   1440: if_icmpeq -> 1516
    //   1443: aload #13
    //   1445: iload #17
    //   1447: bipush #10
    //   1449: iadd
    //   1450: invokevirtual substring : (I)Ljava/lang/String;
    //   1453: dup
    //   1454: astore #7
    //   1456: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1459: ldc 'utf-8'
    //   1461: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1464: istore #16
    //   1466: aload #7
    //   1468: ldc ''''
    //   1470: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1473: iconst_2
    //   1474: iadd
    //   1475: dup
    //   1476: istore #13
    //   1478: iconst_1
    //   1479: if_icmpne -> 1498
    //   1482: iload #16
    //   1484: ifeq -> 1495
    //   1487: ldc 'utf-8'
    //   1489: invokevirtual length : ()I
    //   1492: goto -> 1496
    //   1495: iconst_0
    //   1496: istore #13
    //   1498: aload #7
    //   1500: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   1503: iload #13
    //   1505: invokevirtual substring : (I)Ljava/lang/String;
    //   1508: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1511: astore #7
    //   1513: goto -> 1523
    //   1516: aload #7
    //   1518: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1521: astore #7
    //   1523: iload #16
    //   1525: ifeq -> 1533
    //   1528: aload #7
    //   1530: goto -> 1538
    //   1533: aload #7
    //   1535: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   1538: astore #13
    //   1540: iload #16
    //   1542: ifne -> 1589
    //   1545: aload #14
    //   1547: invokestatic d : (Ljava/lang/String;)Z
    //   1550: ifeq -> 1567
    //   1553: aload #14
    //   1555: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1558: ldc 'windows-1251'
    //   1560: invokevirtual indexOf : (Ljava/lang/String;)I
    //   1563: iconst_m1
    //   1564: if_icmpne -> 1582
    //   1567: aload #13
    //   1569: invokevirtual length : ()I
    //   1572: aload #7
    //   1574: invokevirtual length : ()I
    //   1577: iconst_1
    //   1578: ishr
    //   1579: if_icmpge -> 1589
    //   1582: aload #7
    //   1584: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   1587: astore #13
    //   1589: aload #13
    //   1591: astore #7
    //   1593: aload_0
    //   1594: bipush #17
    //   1596: putfield a : I
    //   1599: aload #7
    //   1601: ifnull -> 1667
    //   1604: aload_0
    //   1605: getfield d : Ljava/lang/String;
    //   1608: ifnull -> 1667
    //   1611: aload_0
    //   1612: getfield d : Ljava/lang/String;
    //   1615: aload #7
    //   1617: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1620: ifne -> 1667
    //   1623: aload_0
    //   1624: bipush #18
    //   1626: putfield a : I
    //   1629: iload_1
    //   1630: ifeq -> 1653
    //   1633: aload_0
    //   1634: getfield b : Z
    //   1637: ifeq -> 1653
    //   1640: aload_0
    //   1641: getfield c : Z
    //   1644: ifne -> 1653
    //   1647: aload_0
    //   1648: aload #7
    //   1650: putfield e : Ljava/lang/String;
    //   1653: aload_0
    //   1654: bipush #19
    //   1656: putfield a : I
    //   1659: aload_0
    //   1660: getfield b : B
    //   1663: iconst_3
    //   1664: if_icmpeq -> 2427
    //   1667: aload_0
    //   1668: bipush #20
    //   1670: putfield a : I
    //   1673: lconst_0
    //   1674: lstore #17
    //   1676: iload_1
    //   1677: ifeq -> 2212
    //   1680: aload #5
    //   1682: ifnonnull -> 1958
    //   1685: aload_0
    //   1686: getfield e : Ljava/lang/String;
    //   1689: invokestatic c : (Ljava/lang/String;)Z
    //   1692: ifeq -> 1703
    //   1695: aload_0
    //   1696: aload_0
    //   1697: invokestatic a : (Li;)Ljava/lang/String;
    //   1700: putfield e : Ljava/lang/String;
    //   1703: aload_0
    //   1704: bipush #21
    //   1706: putfield a : I
    //   1709: aload_0
    //   1710: aload_0
    //   1711: getfield e : Ljava/lang/String;
    //   1714: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   1717: putfield e : Ljava/lang/String;
    //   1720: aload_0
    //   1721: aload_0
    //   1722: getfield e : Ljava/lang/String;
    //   1725: iconst_1
    //   1726: iconst_2
    //   1727: invokestatic a : (Li;Ljava/lang/String;ZI)Ljava/lang/String;
    //   1730: dup
    //   1731: astore #19
    //   1733: invokestatic d : (Ljava/lang/String;)Z
    //   1736: ifeq -> 1745
    //   1739: aload_0
    //   1740: aload #19
    //   1742: putfield e : Ljava/lang/String;
    //   1745: aload_0
    //   1746: bipush #22
    //   1748: putfield a : I
    //   1751: iload #8
    //   1753: sipush #206
    //   1756: if_icmpne -> 1914
    //   1759: aload_0
    //   1760: bipush #23
    //   1762: putfield a : I
    //   1765: aload_0
    //   1766: getfield b : J
    //   1769: ldc2_w -1
    //   1772: lcmp
    //   1773: ifeq -> 1871
    //   1776: aload_0
    //   1777: getfield k : J
    //   1780: lload #10
    //   1782: lcmp
    //   1783: ifle -> 1871
    //   1786: aload_0
    //   1787: bipush #24
    //   1789: putfield a : I
    //   1792: aload_0
    //   1793: getfield a : Z
    //   1796: ifeq -> 1871
    //   1799: getstatic v.bd : I
    //   1802: iconst_2
    //   1803: if_icmpeq -> 1813
    //   1806: getstatic v.bd : I
    //   1809: iconst_3
    //   1810: if_icmpne -> 1871
    //   1813: aload_0
    //   1814: bipush #25
    //   1816: putfield a : I
    //   1819: aload_0
    //   1820: getfield a : Lag;
    //   1823: lconst_0
    //   1824: invokeinterface b : (J)Ljava/io/OutputStream;
    //   1829: astore #5
    //   1831: iconst_0
    //   1832: istore #20
    //   1834: iload #20
    //   1836: i2l
    //   1837: aload_0
    //   1838: getfield k : J
    //   1841: lload #10
    //   1843: lsub
    //   1844: lcmp
    //   1845: ifge -> 1860
    //   1848: aload #5
    //   1850: iconst_0
    //   1851: invokevirtual write : (I)V
    //   1854: iinc #20, 1
    //   1857: goto -> 1834
    //   1860: aload #5
    //   1862: invokevirtual flush : ()V
    //   1865: aload #5
    //   1867: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   1870: pop
    //   1871: aload_0
    //   1872: bipush #26
    //   1874: putfield a : I
    //   1877: aload_0
    //   1878: getfield a : Lag;
    //   1881: aload_0
    //   1882: getfield k : J
    //   1885: invokeinterface b : (J)Ljava/io/OutputStream;
    //   1890: astore #5
    //   1892: aload_0
    //   1893: getfield d : J
    //   1896: lconst_0
    //   1897: lcmp
    //   1898: ifgt -> 1958
    //   1901: aload_0
    //   1902: getfield a : Ljavax/microedition/io/HttpConnection;
    //   1905: invokeinterface getLength : ()J
    //   1910: pop2
    //   1911: goto -> 1958
    //   1914: iload #8
    //   1916: sipush #200
    //   1919: if_icmpne -> 1958
    //   1922: aload_0
    //   1923: bipush #27
    //   1925: putfield a : I
    //   1928: aload_0
    //   1929: getfield a : Lag;
    //   1932: lconst_0
    //   1933: invokeinterface b : (J)Ljava/io/OutputStream;
    //   1938: astore #5
    //   1940: aload_0
    //   1941: lconst_0
    //   1942: putfield k : J
    //   1945: aload_0
    //   1946: aload_0
    //   1947: getfield a : Ljavax/microedition/io/HttpConnection;
    //   1950: invokeinterface getLength : ()J
    //   1955: putfield d : J
    //   1958: aload_0
    //   1959: bipush #28
    //   1961: putfield a : I
    //   1964: aload_0
    //   1965: invokevirtual a : ()Z
    //   1968: ifeq -> 2427
    //   1971: aload_0
    //   1972: bipush #29
    //   1974: putfield a : I
    //   1977: ldc2_w -1
    //   1980: lstore #19
    //   1982: getstatic v.bd : I
    //   1985: iconst_4
    //   1986: if_icmpne -> 2023
    //   1989: invokestatic C : ()V
    //   1992: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   1995: invokevirtual freeMemory : ()J
    //   1998: ldc2_w 15000
    //   2001: lsub
    //   2002: aload_0
    //   2003: getfield a : Lag;
    //   2006: invokeinterface f : ()J
    //   2011: ldc2_w 1024
    //   2014: lsub
    //   2015: invokestatic b : (JJ)J
    //   2018: lstore #19
    //   2020: goto -> 2044
    //   2023: getstatic v.cO : Z
    //   2026: ifeq -> 2044
    //   2029: aload_0
    //   2030: getfield a : Lag;
    //   2033: invokeinterface f : ()J
    //   2038: ldc2_w 1024
    //   2041: lsub
    //   2042: lstore #19
    //   2044: getstatic v.cO : Z
    //   2047: ifeq -> 2123
    //   2050: lload #19
    //   2052: aload_0
    //   2053: getfield d : J
    //   2056: getstatic v.bd : I
    //   2059: iconst_4
    //   2060: if_icmpeq -> 2075
    //   2063: aload_0
    //   2064: getfield c : B
    //   2067: iconst_2
    //   2068: if_icmpne -> 2075
    //   2071: iconst_1
    //   2072: goto -> 2076
    //   2075: iconst_0
    //   2076: invokestatic a : (JJZ)Ljava/lang/String;
    //   2079: dup
    //   2080: astore #13
    //   2082: ifnull -> 2123
    //   2085: getstatic af.b : Laf;
    //   2088: aload #13
    //   2090: iconst_0
    //   2091: invokevirtual a : (Ljava/lang/String;Z)I
    //   2094: iconst_1
    //   2095: if_icmpeq -> 2123
    //   2098: aload_0
    //   2099: sipush #582
    //   2102: invokestatic d : (I)Ljava/lang/String;
    //   2105: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   2108: pop
    //   2109: aload_0
    //   2110: iconst_0
    //   2111: putfield b : I
    //   2114: aload_0
    //   2115: bipush #8
    //   2117: putfield b : B
    //   2120: goto -> 2427
    //   2123: aload_0
    //   2124: bipush #30
    //   2126: putfield a : I
    //   2129: new q
    //   2132: dup
    //   2133: aconst_null
    //   2134: aload_0
    //   2135: getfield a : Ljavax/microedition/io/HttpConnection;
    //   2138: invokeinterface openInputStream : ()Ljava/io/InputStream;
    //   2143: iconst_0
    //   2144: iconst_0
    //   2145: invokespecial <init> : (La;Ljava/io/InputStream;ZZ)V
    //   2148: astore #4
    //   2150: aload_0
    //   2151: bipush #31
    //   2153: putfield a : I
    //   2156: aload_0
    //   2157: aload #4
    //   2159: aload #5
    //   2161: aload_0
    //   2162: aload #12
    //   2164: invokespecial a : (Ljava/io/InputStream;Ljava/io/OutputStream;Li;[B)J
    //   2167: lstore #17
    //   2169: aload_0
    //   2170: bipush #32
    //   2172: putfield a : I
    //   2175: getstatic v.bd : I
    //   2178: iconst_4
    //   2179: if_icmpne -> 2200
    //   2182: aload_0
    //   2183: getfield a : Lag;
    //   2186: aload #5
    //   2188: checkcast java/io/ByteArrayOutputStream
    //   2191: invokevirtual toByteArray : ()[B
    //   2194: invokeinterface a : ([B)Z
    //   2199: pop
    //   2200: aload_0
    //   2201: bipush #33
    //   2203: putfield a : I
    //   2206: aload #4
    //   2208: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2211: pop
    //   2212: aload_0
    //   2213: bipush #34
    //   2215: putfield a : I
    //   2218: aload_0
    //   2219: getfield b : B
    //   2222: bipush #7
    //   2224: if_icmpeq -> 2362
    //   2227: aload_0
    //   2228: getfield b : B
    //   2231: iconst_1
    //   2232: if_icmpeq -> 2362
    //   2235: aload_0
    //   2236: getfield b : B
    //   2239: bipush #8
    //   2241: if_icmpeq -> 2362
    //   2244: iload #8
    //   2246: sipush #200
    //   2249: if_icmpne -> 2278
    //   2252: aload_0
    //   2253: bipush #9
    //   2255: putfield b : B
    //   2258: aload_0
    //   2259: getfield d : J
    //   2262: lconst_0
    //   2263: lcmp
    //   2264: ifgt -> 2427
    //   2267: aload_0
    //   2268: aload_0
    //   2269: getfield a : J
    //   2272: putfield d : J
    //   2275: goto -> 2427
    //   2278: aload_0
    //   2279: getfield k : J
    //   2282: lconst_0
    //   2283: lcmp
    //   2284: ifle -> 2299
    //   2287: aload_0
    //   2288: getfield k : J
    //   2291: aload_0
    //   2292: getfield d : J
    //   2295: lcmp
    //   2296: ifge -> 2310
    //   2299: iload_1
    //   2300: ifeq -> 2319
    //   2303: lload #17
    //   2305: lconst_0
    //   2306: lcmp
    //   2307: ifne -> 2319
    //   2310: aload_0
    //   2311: bipush #10
    //   2313: putfield b : B
    //   2316: goto -> 2427
    //   2319: aload_0
    //   2320: getfield b : J
    //   2323: lconst_0
    //   2324: lcmp
    //   2325: ifle -> 2349
    //   2328: aload_0
    //   2329: getfield k : J
    //   2332: aload_0
    //   2333: getfield b : J
    //   2336: lcmp
    //   2337: iflt -> 2349
    //   2340: aload_0
    //   2341: bipush #13
    //   2343: putfield b : B
    //   2346: goto -> 2427
    //   2349: iload_1
    //   2350: ifne -> 2362
    //   2353: aload_0
    //   2354: bipush #6
    //   2356: putfield b : B
    //   2359: goto -> 2427
    //   2362: goto -> 2413
    //   2365: aload_0
    //   2366: bipush #35
    //   2368: putfield a : I
    //   2371: iload #8
    //   2373: sipush #416
    //   2376: if_icmpne -> 2388
    //   2379: aload_0
    //   2380: bipush #11
    //   2382: putfield b : B
    //   2385: goto -> 2427
    //   2388: aload_0
    //   2389: iconst_3
    //   2390: putfield b : B
    //   2393: aload_0
    //   2394: iload #8
    //   2396: invokestatic valueOf : (I)Ljava/lang/String;
    //   2399: ldc ':'
    //   2401: aload #9
    //   2403: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2406: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   2409: pop
    //   2410: goto -> 2427
    //   2413: aload_0
    //   2414: invokevirtual a : ()Z
    //   2417: ifeq -> 2427
    //   2420: getstatic v.bd : I
    //   2423: iconst_4
    //   2424: if_icmpne -> 335
    //   2427: iload_1
    //   2428: ifne -> 2763
    //   2431: aload_0
    //   2432: getfield a : Ljava/lang/StringBuffer;
    //   2435: invokevirtual toString : ()Ljava/lang/String;
    //   2438: astore #13
    //   2440: aload_0
    //   2441: getfield a : Ljava/lang/StringBuffer;
    //   2444: iconst_0
    //   2445: invokevirtual setLength : (I)V
    //   2448: aload_0
    //   2449: getfield a : Ljava/lang/StringBuffer;
    //   2452: sipush #297
    //   2455: invokestatic d : (I)Ljava/lang/String;
    //   2458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2461: iconst_0
    //   2462: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2465: aload_2
    //   2466: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2469: iconst_0
    //   2470: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2473: pop
    //   2474: aload #7
    //   2476: invokestatic d : (Ljava/lang/String;)Z
    //   2479: ifeq -> 2509
    //   2482: aload_0
    //   2483: getfield a : Ljava/lang/StringBuffer;
    //   2486: sipush #392
    //   2489: invokestatic d : (I)Ljava/lang/String;
    //   2492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2495: iconst_0
    //   2496: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2499: aload #7
    //   2501: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2504: iconst_0
    //   2505: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2508: pop
    //   2509: aload_0
    //   2510: getfield a : Ljava/lang/StringBuffer;
    //   2513: sipush #298
    //   2516: invokestatic d : (I)Ljava/lang/String;
    //   2519: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2522: iconst_0
    //   2523: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2526: aload_0
    //   2527: getfield a : Ljavax/microedition/io/HttpConnection;
    //   2530: invokeinterface getDate : ()J
    //   2535: iconst_1
    //   2536: invokestatic a : (JZ)Ljava/lang/String;
    //   2539: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2542: iconst_0
    //   2543: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2546: sipush #299
    //   2549: invokestatic d : (I)Ljava/lang/String;
    //   2552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2555: iconst_0
    //   2556: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2559: aload_0
    //   2560: getfield a : Ljavax/microedition/io/HttpConnection;
    //   2563: invokeinterface getLastModified : ()J
    //   2568: iconst_1
    //   2569: invokestatic a : (JZ)Ljava/lang/String;
    //   2572: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2575: iconst_0
    //   2576: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2579: sipush #300
    //   2582: invokestatic d : (I)Ljava/lang/String;
    //   2585: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2588: iconst_0
    //   2589: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2592: aload #9
    //   2594: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2597: iconst_0
    //   2598: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2601: sipush #301
    //   2604: invokestatic d : (I)Ljava/lang/String;
    //   2607: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2610: iconst_0
    //   2611: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2614: iload #8
    //   2616: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   2619: iconst_0
    //   2620: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2623: sipush #302
    //   2626: invokestatic d : (I)Ljava/lang/String;
    //   2629: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2632: iconst_0
    //   2633: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2636: aload_0
    //   2637: getfield d : J
    //   2640: invokevirtual append : (J)Ljava/lang/StringBuffer;
    //   2643: iconst_0
    //   2644: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2647: sipush #303
    //   2650: invokestatic d : (I)Ljava/lang/String;
    //   2653: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2656: iconst_0
    //   2657: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2660: aload_0
    //   2661: getfield c : B
    //   2664: iconst_2
    //   2665: if_icmpne -> 2676
    //   2668: bipush #11
    //   2670: invokestatic d : (I)Ljava/lang/String;
    //   2673: goto -> 2681
    //   2676: bipush #12
    //   2678: invokestatic d : (I)Ljava/lang/String;
    //   2681: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2684: iconst_0
    //   2685: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2688: iconst_1
    //   2689: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2692: iconst_0
    //   2693: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2696: pop
    //   2697: aload_0
    //   2698: getfield a : Ljava/lang/StringBuffer;
    //   2701: aload #13
    //   2703: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2706: pop
    //   2707: aload_0
    //   2708: getfield b : Z
    //   2711: ifeq -> 2763
    //   2714: aload_0
    //   2715: getfield a : Ljava/lang/StringBuffer;
    //   2718: iconst_0
    //   2719: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2722: iconst_2
    //   2723: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2726: getstatic v.O : Ljava/lang/String;
    //   2729: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2732: aload #7
    //   2734: invokestatic d : (Ljava/lang/String;)Z
    //   2737: ifeq -> 2745
    //   2740: aload #7
    //   2742: goto -> 2755
    //   2745: aload_2
    //   2746: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
    //   2749: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   2752: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   2755: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2758: iconst_0
    //   2759: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2762: pop
    //   2763: aload_0
    //   2764: ldc2_w -1
    //   2767: putfield i : J
    //   2770: aload_0
    //   2771: getfield g : J
    //   2774: lconst_0
    //   2775: lcmp
    //   2776: ifle -> 2796
    //   2779: aload_0
    //   2780: dup
    //   2781: getfield h : J
    //   2784: invokestatic currentTimeMillis : ()J
    //   2787: aload_0
    //   2788: getfield g : J
    //   2791: lsub
    //   2792: ladd
    //   2793: putfield h : J
    //   2796: aload_0
    //   2797: lconst_0
    //   2798: putfield g : J
    //   2801: aload #5
    //   2803: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2806: pop
    //   2807: aload_0
    //   2808: getfield a : Lag;
    //   2811: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2814: pop
    //   2815: aload_0
    //   2816: aconst_null
    //   2817: putfield a : Lag;
    //   2820: aload #4
    //   2822: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2825: pop
    //   2826: aload_0
    //   2827: getfield a : Ljavax/microedition/io/HttpConnection;
    //   2830: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2833: pop
    //   2834: aload_0
    //   2835: aconst_null
    //   2836: putfield a : Ljavax/microedition/io/HttpConnection;
    //   2839: goto -> 3040
    //   2842: astore #10
    //   2844: iload_1
    //   2845: ifne -> 2872
    //   2848: aload_0
    //   2849: getfield a : Ljava/lang/StringBuffer;
    //   2852: iconst_0
    //   2853: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2856: iconst_0
    //   2857: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2860: aload #10
    //   2862: invokevirtual toString : ()Ljava/lang/String;
    //   2865: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2868: pop
    //   2869: goto -> 2882
    //   2872: aload_0
    //   2873: aload #10
    //   2875: invokevirtual toString : ()Ljava/lang/String;
    //   2878: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   2881: pop
    //   2882: aload_0
    //   2883: ldc2_w -1
    //   2886: putfield i : J
    //   2889: aload_0
    //   2890: getfield g : J
    //   2893: lconst_0
    //   2894: lcmp
    //   2895: ifle -> 2915
    //   2898: aload_0
    //   2899: dup
    //   2900: getfield h : J
    //   2903: invokestatic currentTimeMillis : ()J
    //   2906: aload_0
    //   2907: getfield g : J
    //   2910: lsub
    //   2911: ladd
    //   2912: putfield h : J
    //   2915: aload_0
    //   2916: lconst_0
    //   2917: putfield g : J
    //   2920: aload #5
    //   2922: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2925: pop
    //   2926: aload_0
    //   2927: getfield a : Lag;
    //   2930: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2933: pop
    //   2934: aload_0
    //   2935: aconst_null
    //   2936: putfield a : Lag;
    //   2939: aload #4
    //   2941: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2944: pop
    //   2945: aload_0
    //   2946: getfield a : Ljavax/microedition/io/HttpConnection;
    //   2949: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   2952: pop
    //   2953: aload_0
    //   2954: aconst_null
    //   2955: putfield a : Ljavax/microedition/io/HttpConnection;
    //   2958: goto -> 3040
    //   2961: astore_1
    //   2962: aload_0
    //   2963: ldc2_w -1
    //   2966: putfield i : J
    //   2969: aload_0
    //   2970: getfield g : J
    //   2973: lconst_0
    //   2974: lcmp
    //   2975: ifle -> 2995
    //   2978: aload_0
    //   2979: dup
    //   2980: getfield h : J
    //   2983: invokestatic currentTimeMillis : ()J
    //   2986: aload_0
    //   2987: getfield g : J
    //   2990: lsub
    //   2991: ladd
    //   2992: putfield h : J
    //   2995: aload_0
    //   2996: lconst_0
    //   2997: putfield g : J
    //   3000: aload #5
    //   3002: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   3005: pop
    //   3006: aload_0
    //   3007: getfield a : Lag;
    //   3010: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   3013: pop
    //   3014: aload_0
    //   3015: aconst_null
    //   3016: putfield a : Lag;
    //   3019: aload #4
    //   3021: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   3024: pop
    //   3025: aload_0
    //   3026: getfield a : Ljavax/microedition/io/HttpConnection;
    //   3029: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   3032: pop
    //   3033: aload_0
    //   3034: aconst_null
    //   3035: putfield a : Ljavax/microedition/io/HttpConnection;
    //   3038: aload_1
    //   3039: athrow
    //   3040: iload_1
    //   3041: ifeq -> 3187
    //   3044: aload_0
    //   3045: getfield b : B
    //   3048: bipush #7
    //   3050: if_icmpeq -> 3234
    //   3053: aload_0
    //   3054: getfield b : B
    //   3057: iconst_1
    //   3058: if_icmpeq -> 3234
    //   3061: aload_0
    //   3062: getfield b : B
    //   3065: bipush #8
    //   3067: if_icmpeq -> 3234
    //   3070: aload_0
    //   3071: getfield c : J
    //   3074: lconst_0
    //   3075: lcmp
    //   3076: ifgt -> 3088
    //   3079: aload_0
    //   3080: getfield f : J
    //   3083: lconst_0
    //   3084: lcmp
    //   3085: ifle -> 3096
    //   3088: aload_0
    //   3089: iconst_5
    //   3090: putfield b : B
    //   3093: goto -> 3234
    //   3096: aload_0
    //   3097: getfield k : J
    //   3100: aload_0
    //   3101: getfield d : J
    //   3104: lcmp
    //   3105: iflt -> 3126
    //   3108: aload_0
    //   3109: getfield k : J
    //   3112: lconst_0
    //   3113: lcmp
    //   3114: ifeq -> 3126
    //   3117: aload_0
    //   3118: bipush #12
    //   3120: putfield b : B
    //   3123: goto -> 3234
    //   3126: aload_0
    //   3127: getfield b : B
    //   3130: iconst_3
    //   3131: if_icmpeq -> 3159
    //   3134: aload_0
    //   3135: invokevirtual a : ()Z
    //   3138: ifne -> 3159
    //   3141: aload_0
    //   3142: getfield g : Ljava/lang/String;
    //   3145: invokestatic c : (Ljava/lang/String;)Z
    //   3148: ifeq -> 3159
    //   3151: aload_0
    //   3152: iconst_1
    //   3153: putfield b : B
    //   3156: goto -> 3234
    //   3159: aload_0
    //   3160: getfield g : Ljava/lang/String;
    //   3163: invokestatic d : (Ljava/lang/String;)Z
    //   3166: ifeq -> 3234
    //   3169: aload_0
    //   3170: dup
    //   3171: getfield d : I
    //   3174: iconst_1
    //   3175: iadd
    //   3176: putfield d : I
    //   3179: aload_0
    //   3180: iconst_4
    //   3181: putfield b : B
    //   3184: goto -> 3234
    //   3187: getstatic af.b : Laf;
    //   3190: iconst_0
    //   3191: getstatic w.a : Laa;
    //   3194: getfield a : Lv;
    //   3197: invokevirtual b : (ZLv;)V
    //   3200: aload_0
    //   3201: invokevirtual b : ()Z
    //   3204: ifeq -> 3233
    //   3207: getstatic w.a : Laa;
    //   3210: getfield a : Lv;
    //   3213: sipush #17462
    //   3216: invokestatic c : (I)Ljava/lang/String;
    //   3219: iconst_0
    //   3220: iconst_0
    //   3221: aconst_null
    //   3222: aload_0
    //   3223: getfield a : Ljava/lang/StringBuffer;
    //   3226: invokevirtual toString : ()Ljava/lang/String;
    //   3229: aconst_null
    //   3230: invokevirtual a : (Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;[B)V
    //   3233: return
    //   3234: getstatic w.a : Ljava/util/Vector;
    //   3237: dup
    //   3238: astore #10
    //   3240: monitorenter
    //   3241: getstatic v.cP : Z
    //   3244: ifeq -> 3265
    //   3247: aload_0
    //   3248: getfield b : B
    //   3251: invokestatic a : (I)Z
    //   3254: ifeq -> 3265
    //   3257: getstatic w.a : Ljava/util/Vector;
    //   3260: aload_0
    //   3261: invokevirtual removeElement : (Ljava/lang/Object;)Z
    //   3264: pop
    //   3265: aload #10
    //   3267: monitorexit
    //   3268: goto -> 3277
    //   3271: astore_0
    //   3272: aload #10
    //   3274: monitorexit
    //   3275: aload_0
    //   3276: athrow
    //   3277: invokestatic l : ()V
    //   3280: iload_1
    //   3281: ifeq -> 3288
    //   3284: iconst_1
    //   3285: putstatic v.l : Z
    //   3288: return
    // Exception table:
    //   from	to	target	type
    //   111	2763	2842	java/lang/Exception
    //   111	2763	2961	finally
    //   185	219	222	java/lang/Exception
    //   304	314	317	java/lang/OutOfMemoryError
    //   688	710	713	java/lang/Throwable
    //   751	841	844	java/lang/Exception
    //   2842	2882	2961	finally
    //   3241	3268	3271	finally
    //   3271	3275	3271	finally
  }
  
  private static void a(HttpConnection paramHttpConnection, String paramString1, String paramString2, StringBuffer paramStringBuffer) {
    if (paramHttpConnection != null)
      paramHttpConnection.setRequestProperty(paramString1, paramString2); 
    if (paramStringBuffer != null)
      paramStringBuffer.append(paramString1).append(':').append(paramString2).append(false); 
  }
  
  public final void f() {
    if (this.a == null) {
      this.a = (Timer)v.a((ag)null);
    } else {
      v.a(this.a);
    } 
    try {
      this.a.c(v.a("file:///", this.f, this.e));
    } catch (Exception exception) {}
    a((ag)this.a);
    v.a(this.a);
    this.e = 0L;
    this.d = 0L;
  }
  
  private static void a(ag paramag) {
    try {
      paramag.c();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final long a() {
    return this.d;
  }
  
  public final long b() {
    return this.e;
  }
  
  public final String a() {
    return v.a(String.valueOf((this.d > 0L) ? (this.e * 100L / this.d) : 0L), "% ", v.a(this.e), "/", v.a(this.d));
  }
  
  public final String b() {
    return this.e;
  }
  
  public final String c() {
    return v.a(v.d(316), v.c((this.g == 0L) ? this.h : (System.currentTimeMillis() - this.g + this.h)));
  }
  
  public final String d() {
    if (this.e != 0) {
      l1 = (this.d - this.e) / this.e;
    } else {
      l1 = this.d - this.e;
    } 
    long l1 = v.a(1000L * l1);
    return v.a(v.d(313), v.c(v.a(l1)));
  }
  
  public final int a() {
    this.e = 0;
    long l1;
    if (this.g != 0L && (l1 = System.currentTimeMillis() - this.g) != 0L)
      this.e = (int)(1000L * this.m / l1); 
    return this.e;
  }
  
  public final int b() {
    return (int)((this.i <= 0L) ? 0L : (this.i - this.j));
  }
  
  private static long a(HttpConnection paramHttpConnection) {
    long l1 = -1L;
    if (paramHttpConnection != null)
      try {
        if ((l1 = a(paramHttpConnection.getHeaderField("Content-Range"))) == -1L)
          l1 = a(paramHttpConnection.getHeaderField("Accept-Ranges")); 
      } catch (Exception exception) {} 
    return l1;
  }
  
  private static long a(String paramString) {
    long l1 = -1L;
    if (paramString != null) {
      int j;
      if ((j = paramString.indexOf("/")) != -1 && j != paramString.length() - 1) {
        l1 = Long.parseLong(paramString.substring(j + 1, paramString.length()));
      } else if (paramString.toLowerCase().equals("bytes")) {
        l1 = 0L;
      } 
    } 
    return l1;
  }
  
  private static String a(i parami) {
    String str;
    int j;
    if (v.c(j = parami.d))
      str = v.a(ai.h(s.c((String)parami.a)), "_", ai.h(v.a(v.a(), true)).replace(' ', '_'), ".ext"); 
    return str;
  }
  
  private static synchronized String a(i parami, String paramString, boolean paramBoolean, int paramInt) {
    try {
      parami.a.c(v.a("file:///", parami.f, paramString));
      boolean bool = parami.a.g();
      if (parami.c == 0 && parami.b == -1L && bool && parami.d != 0) {
        String str1 = ai.d(ai.e(paramString));
        String str2 = paramString.substring(0, paramString.length() - str1.length());
        byte b = 1;
        StringBuffer stringBuffer = new StringBuffer(0);
        do {
          v.a(parami.a);
          stringBuffer.setLength(0);
          paramString = stringBuffer.append(str2).append('(').append(b).append(')').append(str1).toString();
          stringBuffer.setLength(0);
          if (!parami.a.c(stringBuffer.append("file:///").append(parami.f).append(paramString).toString()))
            throw new Exception(v.d(287)); 
          ++b;
        } while (bool = parami.a.g());
      } else if (parami.c == 0 && parami.b == -1L && bool) {
        if (af.b.a(v.d(277), false) == 1) {
          a((ag)parami.a);
          bool = false;
        } else {
          parami.a(v.d(582));
          parami.b = 0;
          parami.b = 8;
          return null;
        } 
      } 
      if (paramBoolean && !bool)
        parami.a.d(); 
    } catch (Exception exception) {
      v.a(parami.a);
      parami.a(exception.toString());
      if (paramInt > 0)
        a(parami, paramString, paramBoolean, paramInt - 1); 
    } 
    return paramString;
  }
  
  private long a(InputStream paramInputStream, OutputStream paramOutputStream, i parami, byte[] paramArrayOfbyte) {
    long l1 = 0L;
    try {
      int j;
      while (a(this) && parami.a() && (j = paramInputStream.read(paramArrayOfbyte)) != -1) {
        boolean bool = v.a(j);
        paramOutputStream.write(paramArrayOfbyte, 0, j);
        if (v.dg)
          paramOutputStream.flush(); 
        parami.k += j;
        parami.m += j;
        parami.e += j;
        l1 += j;
        if (bool) {
          af.b.c(v.d(683));
          parami.a(v.d(683));
          w.C = true;
        } 
      } 
    } catch (Exception exception) {
      parami.a(exception.toString());
    } 
    return l1;
  }
  
  private static HttpConnection a(String paramString1, String paramString2, i parami) {
    HttpConnection httpConnection = null;
    s s = new s(paramString1);
    for (byte b = 0; b < ((v.ar != 0) ? 2 : 1) && parami.a(); b++) {
      try {
        a((HttpConnection)null, "\000>>\000GET", s.a(s, false), (StringBuffer)parami.a);
        if ((httpConnection = a.a(s.a(s, false), v.a)) != null) {
          if (w.m != null) {
            if (v.c(v.r)) {
              v.r = "Opera/8.01 (J2ME/MIDP; Opera Mini/3.1.10423/1724; ru; U; ssr)";
              v.i = true;
            } 
            long l1 = v.r;
          } else {
            str = null;
          } 
          if (v.d(str) && !v.di) {
            a(httpConnection, "User-Agent", str, (StringBuffer)parami.a);
            w.C = v.b(11 + str.length());
          } 
          if (v.d(paramString2)) {
            a(httpConnection, "Referer", paramString2, (StringBuffer)parami.a);
            w.C = v.b(8 + paramString2.length());
          } 
          a(httpConnection, "Accept", "*/*", (StringBuffer)parami.a);
          w.C = v.b(10);
          String str;
          if (v.d(s.a) && v.d(s.b) && (str = v.a(s.a, ":", s.b)).length() > 1) {
            str = new String(v.a(str.getBytes(), 0, str.length()));
            a(httpConnection, "Authorization", v.a("Basic ", str), (StringBuffer)parami.a);
            w.C = v.b(19 + str.length());
          } 
          break;
        } 
      } catch (ConnectionNotFoundException connectionNotFoundException) {
        parami.a(connectionNotFoundException.toString());
        parami.a(v.d(v.d(687)));
      } catch (SecurityException securityException) {
        parami.a(v.d(39));
      } catch (IllegalArgumentException illegalArgumentException) {
        parami.a(v.d(580));
        parami.a(illegalArgumentException.toString());
      } catch (Exception exception) {
        parami.a(exception.toString());
        parami.a(v.d(286));
      } 
    } 
    return httpConnection;
  }
  
  private static synchronized boolean a(i parami) {
    parami.i = 0L;
    if (v.a() || v.b(0)) {
      w.C = true;
      parami.a(v.d(683));
      return false;
    } 
    if (a == null)
      ((l)(a = (Timer)new l(32))).b = true; 
    parami.j = parami.i = System.currentTimeMillis();
    if (a == null)
      (a = new Timer()).scheduleAtFixedRate((TimerTask)a, 0L, 1000L); 
    return true;
  }
  
  public final void g() {
    this.b = 0;
    this.c++;
    this.b = 7;
    (this = this).i = -1L;
    l l1;
    (l1 = new l(20)).a.addElement(this.a);
    v.a(l1);
    this.a = null;
    v.a(this.a);
    v.C();
  }
  
  public final String a(String paramString) {
    return this.g = v.a(this.g, "\n", paramString);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\i.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */