package KD;

import java.util.Random;
import javax.microedition.lcdui.Displayable;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VideoControl;
import javax.microedition.media.control.VolumeControl;

public final class b implements Runnable, PlayerListener {
  public ae a;
  
  public Player b;
  
  public VolumeControl c;
  
  public VideoControl d;
  
  public boolean e = false;
  
  public boolean f = false;
  
  private String u = "";
  
  private boolean v = false;
  
  public boolean g = false;
  
  public boolean h = true;
  
  public long i = 1L;
  
  public boolean j = false;
  
  public int k = 0;
  
  public int[] l = null;
  
  public byte m = 5;
  
  private byte[] w = new byte[] { 1, 20, 40, 60, 80, 100 };
  
  private boolean x = false;
  
  private boolean y = false;
  
  private boolean z = false;
  
  private long A = 1L;
  
  private long B = 1000000L;
  
  public long n = 0L;
  
  public long o = 0L;
  
  public String p = "";
  
  public String q = "";
  
  public String r = "";
  
  public String s = "";
  
  public String t = "";
  
  public b(ae paramae) {
    this.a = paramae;
  }
  
  public final void run() {
    this.f = true;
    String str = a(this.u);
    this.f = false;
    if (this.e) {
      this.a.a.setCurrent((Displayable)this.a.h);
      try {
        Thread.sleep(300L);
      } catch (Exception exception) {}
    } 
    if (str != null)
      this.a.a("Открытие...", str, null, null, 2000); 
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (paramString == "endOfMedia")
      a(true); 
  }
  
  private void l() {
    byte b1 = this.w[this.m];
    if (this.c != null)
      this.c.setLevel(b1); 
  }
  
  private void m() {
    if (this.b == null)
      return; 
    f f;
    (f = new f()).a(this.b);
    this.n = this.b.getDuration();
    this.o = 1L;
    this.r = f.e;
    this.s = f.f;
    this.t = f.g;
  }
  
  private boolean n() {
    boolean bool = false;
    if (this.b != null)
      bool = (this.b.getState() == 300) ? true : false; 
    return bool;
  }
  
  public final boolean a() {
    boolean bool = false;
    if (this.b != null)
      bool = (this.b.getState() == 400) ? true : false; 
    return bool;
  }
  
  private String a(String paramString) {
    if (paramString == null)
      return "Невозможно открыть файл!"; 
    if (paramString.length() < 1)
      return "Невозможно открыть файл!"; 
    String str1 = null;
    b();
    String str2 = "file://" + paramString;
    try {
      this.b = Manager.createPlayer(str2);
      this.b.addPlayerListener(this);
      this.b.realize();
      this.b.prefetch();
      o();
      p();
      l();
      m();
      this.p = paramString;
      this.q = u.b(paramString);
      if ((((this.i > 1L) ? 1 : 0) & ((this.i < this.n) ? 1 : 0)) != 0 && this.i <= this.n)
        this.b.setMediaTime(this.i); 
      this.i = 0L;
      if ((this.v & (!a() ? 1 : 0)) != 0)
        c(); 
    } catch (Exception exception) {
      str1 = "Невозможно открыть файл!\n" + paramString + '\n' + exception.getMessage() + '!';
      b();
    } 
    return str1;
  }
  
  public final void b() {
    if (this.b != null)
      try {
        if (this.d != null)
          this.d.setVisible(false); 
        if (a())
          this.b.stop(); 
        if (n())
          this.b.deallocate(); 
        this.b.close();
        this.b = null;
        this.d = null;
        this.c = null;
        this.p = "";
        this.q = "";
        this.r = "";
        this.s = "";
        this.t = "";
        this.o = 0L;
        this.n = 0L;
        return;
      } catch (Exception exception) {} 
  }
  
  private void o() {
    this.c = null;
    if (this.b != null)
      this.c = (VolumeControl)this.b.getControl("VolumeControl"); 
  }
  
  private void p() {
    this.d = null;
    if (this.b != null)
      this.d = (VideoControl)this.b.getControl("VideoControl"); 
    if (this.d != null)
      try {
        this.d.initDisplayMode(1, this.a.h);
        try {
          this.d.setDisplayLocation(0, 0);
          this.d.setDisplayFullScreen(true);
        } catch (Exception exception) {}
        this.d.setVisible(true);
        return;
      } catch (Exception exception) {
        this.a.a("Видео...", "Невозможно вывести видео на дисплей", null, null, 2000);
      }  
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    if (paramInt < 0)
      return; 
    this.e = false;
    if (paramInt < this.a.f.c) {
      this.f = true;
      this.u = this.a.f.c(paramInt);
      if (this.a.f.d(paramInt) && this.a.h.isShown()) {
        this.a.e();
        this.e = true;
      } 
      this.v = paramBoolean;
      this.a.f.e(paramInt);
      a(paramInt);
      Thread thread;
      (thread = new Thread(this)).start();
    } 
  }
  
  public final void c() {
    if (n())
      try {
        if (this.b.getDuration() - this.b.getMediaTime() < 500000L)
          try {
            this.b.setMediaTime(this.b.getDuration() - 500000L);
          } catch (Exception exception) {} 
        this.b.start();
        return;
      } catch (Exception exception) {
        this.a.a("Воспроизведение", "Воспроизведение невозможно: " + exception.getMessage(), null, null, 2000);
        return;
      }  
    if (this.a.f.c > 0)
      if ((((this.a.f.b >= 0) ? 1 : 0) & ((this.a.f.b < this.a.f.c) ? 1 : 0)) != 0)
        a(this.a.f.b, true);  
  }
  
  public final void d() {
    if (a())
      try {
        this.b.stop();
        return;
      } catch (Exception exception) {} 
  }
  
  public final void e() {
    if ((n() | a()) != 0)
      try {
        this.b.setMediaTime(1L);
        this.b.stop();
        return;
      } catch (Exception exception) {} 
  }
  
  public final void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : LKD/ae;
    //   4: getfield f : LKD/v;
    //   7: getfield b : I
    //   10: istore_2
    //   11: aload_0
    //   12: getfield g : Z
    //   15: ifne -> 113
    //   18: iinc #2, 1
    //   21: iload_2
    //   22: aload_0
    //   23: getfield a : LKD/ae;
    //   26: getfield f : LKD/v;
    //   29: getfield c : I
    //   32: if_icmplt -> 39
    //   35: iconst_1
    //   36: goto -> 40
    //   39: iconst_0
    //   40: aload_0
    //   41: getfield h : Z
    //   44: iand
    //   45: ifeq -> 50
    //   48: iconst_0
    //   49: istore_2
    //   50: iload_2
    //   51: aload_0
    //   52: getfield a : LKD/ae;
    //   55: getfield f : LKD/v;
    //   58: getfield c : I
    //   61: if_icmplt -> 68
    //   64: iconst_1
    //   65: goto -> 69
    //   68: iconst_0
    //   69: iload_1
    //   70: ifne -> 77
    //   73: iconst_1
    //   74: goto -> 78
    //   77: iconst_0
    //   78: iand
    //   79: ifeq -> 84
    //   82: iconst_0
    //   83: istore_2
    //   84: iload_2
    //   85: aload_0
    //   86: getfield a : LKD/ae;
    //   89: getfield f : LKD/v;
    //   92: getfield c : I
    //   95: if_icmpge -> 237
    //   98: aload_0
    //   99: aload_0
    //   100: invokevirtual a : ()Z
    //   103: iload_1
    //   104: ior
    //   105: putfield j : Z
    //   108: aload_0
    //   109: iload_2
    //   110: goto -> 230
    //   113: aload_0
    //   114: getfield g : Z
    //   117: ifeq -> 237
    //   120: aload_0
    //   121: getfield k : I
    //   124: istore_2
    //   125: iinc #2, 1
    //   128: iload_2
    //   129: aload_0
    //   130: getfield l : [I
    //   133: arraylength
    //   134: if_icmplt -> 141
    //   137: iconst_1
    //   138: goto -> 142
    //   141: iconst_0
    //   142: aload_0
    //   143: getfield h : Z
    //   146: iand
    //   147: ifeq -> 152
    //   150: iconst_0
    //   151: istore_2
    //   152: iload_2
    //   153: aload_0
    //   154: getfield l : [I
    //   157: arraylength
    //   158: if_icmplt -> 165
    //   161: iconst_1
    //   162: goto -> 166
    //   165: iconst_0
    //   166: iload_1
    //   167: ifne -> 174
    //   170: iconst_1
    //   171: goto -> 175
    //   174: iconst_0
    //   175: iand
    //   176: ifeq -> 181
    //   179: iconst_0
    //   180: istore_2
    //   181: iload_2
    //   182: aload_0
    //   183: getfield l : [I
    //   186: arraylength
    //   187: if_icmpge -> 194
    //   190: iconst_1
    //   191: goto -> 195
    //   194: iconst_0
    //   195: iload_2
    //   196: iflt -> 203
    //   199: iconst_1
    //   200: goto -> 204
    //   203: iconst_0
    //   204: iand
    //   205: ifeq -> 237
    //   208: aload_0
    //   209: aload_0
    //   210: invokevirtual a : ()Z
    //   213: iload_1
    //   214: ior
    //   215: putfield j : Z
    //   218: aload_0
    //   219: iload_2
    //   220: putfield k : I
    //   223: aload_0
    //   224: aload_0
    //   225: getfield l : [I
    //   228: iload_2
    //   229: iaload
    //   230: aload_0
    //   231: getfield j : Z
    //   234: invokevirtual a : (IZ)V
    //   237: return
  }
  
  public final void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : LKD/ae;
    //   4: getfield f : LKD/v;
    //   7: getfield b : I
    //   10: istore_1
    //   11: aload_0
    //   12: getfield g : Z
    //   15: ifne -> 65
    //   18: iinc #1, -1
    //   21: iload_1
    //   22: ifge -> 38
    //   25: aload_0
    //   26: getfield a : LKD/ae;
    //   29: getfield f : LKD/v;
    //   32: getfield c : I
    //   35: iconst_1
    //   36: isub
    //   37: istore_1
    //   38: iload_1
    //   39: aload_0
    //   40: getfield a : LKD/ae;
    //   43: getfield f : LKD/v;
    //   46: getfield c : I
    //   49: if_icmpge -> 146
    //   52: aload_0
    //   53: aload_0
    //   54: invokevirtual a : ()Z
    //   57: putfield j : Z
    //   60: aload_0
    //   61: iload_1
    //   62: goto -> 139
    //   65: aload_0
    //   66: getfield g : Z
    //   69: ifeq -> 146
    //   72: aload_0
    //   73: getfield k : I
    //   76: istore_1
    //   77: iinc #1, -1
    //   80: iload_1
    //   81: ifge -> 92
    //   84: aload_0
    //   85: getfield l : [I
    //   88: arraylength
    //   89: iconst_1
    //   90: isub
    //   91: istore_1
    //   92: iload_1
    //   93: aload_0
    //   94: getfield l : [I
    //   97: arraylength
    //   98: if_icmpge -> 105
    //   101: iconst_1
    //   102: goto -> 106
    //   105: iconst_0
    //   106: iload_1
    //   107: iflt -> 114
    //   110: iconst_1
    //   111: goto -> 115
    //   114: iconst_0
    //   115: iand
    //   116: ifeq -> 146
    //   119: aload_0
    //   120: aload_0
    //   121: invokevirtual a : ()Z
    //   124: putfield j : Z
    //   127: aload_0
    //   128: iload_1
    //   129: putfield k : I
    //   132: aload_0
    //   133: aload_0
    //   134: getfield l : [I
    //   137: iload_1
    //   138: iaload
    //   139: aload_0
    //   140: getfield j : Z
    //   143: invokevirtual a : (IZ)V
    //   146: return
  }
  
  public final void g() {
    if (this.m < 5) {
      this.m = (byte)(this.m + 1);
      l();
    } 
  }
  
  public final void h() {
    if (this.m > 0) {
      this.m = (byte)(this.m - 1);
      l();
    } 
  }
  
  public final void b(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_0
    //   10: putfield x : Z
    //   13: aload_0
    //   14: iload_1
    //   15: putfield y : Z
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield z : Z
    //   23: aload_0
    //   24: ldc2_w 1000000
    //   27: putfield B : J
    //   30: aload_0
    //   31: getfield b : Ljavax/microedition/media/Player;
    //   34: ifnull -> 115
    //   37: aload_0
    //   38: invokevirtual a : ()Z
    //   41: ifeq -> 85
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield x : Z
    //   49: aload_0
    //   50: aload_0
    //   51: getfield b : Ljavax/microedition/media/Player;
    //   54: invokeinterface getMediaTime : ()J
    //   59: putfield A : J
    //   62: aload_0
    //   63: getfield b : Ljavax/microedition/media/Player;
    //   66: invokeinterface stop : ()V
    //   71: goto -> 80
    //   74: pop
    //   75: aload_0
    //   76: iconst_0
    //   77: putfield x : Z
    //   80: aload_0
    //   81: iconst_1
    //   82: goto -> 112
    //   85: aload_0
    //   86: invokespecial n : ()Z
    //   89: ifeq -> 115
    //   92: aload_0
    //   93: aload_0
    //   94: getfield b : Ljavax/microedition/media/Player;
    //   97: invokeinterface getMediaTime : ()J
    //   102: putfield A : J
    //   105: aload_0
    //   106: iconst_1
    //   107: putfield x : Z
    //   110: aload_0
    //   111: iconst_0
    //   112: putfield z : Z
    //   115: return
    // Exception table:
    //   from	to	target	type
    //   49	71	74	java/lang/Exception
  }
  
  public final void i() {
    if (this.x) {
      this.A = this.y ? (this.A + this.B) : (this.A - this.B);
      this.B += 100000L;
      if (this.B > 20000000L)
        this.B = 20000000L; 
      if (this.A < 1L)
        this.A = 1L; 
      if (this.A > this.n)
        this.A = this.n - 1L; 
    } 
  }
  
  public final void j() {
    if (this.x)
      try {
        this.b.setMediaTime(this.A);
        boolean bool = a();
        if ((this.z & (!bool ? 1 : 0)) != 0) {
          this.b.start();
        } else if (((!this.z ? 1 : 0) & bool) != 0) {
          this.b.stop();
        } 
      } catch (Exception exception) {} 
    this.B = 1000000L;
    this.A = 1L;
    this.x = false;
    this.z = false;
  }
  
  public final void c(boolean paramBoolean) {
    this.g = paramBoolean;
    if (this.g) {
      r();
      return;
    } 
    this.l = null;
    this.k = 0;
  }
  
  public final void a(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return; 
    if (paramArrayOfString.length < 1)
      return; 
    this.a.f.a(paramArrayOfString);
    if (this.g) {
      Random random = new Random();
      for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
        this.l = af.a(this.l, this.l.length + 1);
        int i;
        if ((i = random.nextInt() % this.l.length) < 0)
          i *= -1; 
        if (this.l.length > 0)
          this.l[this.l.length - 1] = this.l[i]; 
        this.l[i] = this.l.length - 1;
      } 
    } 
  }
  
  public final void a(int[] paramArrayOfint) {
    if (paramArrayOfint != null && paramArrayOfint.length > 0) {
      b();
      this.a.f.a(paramArrayOfint);
      this.k = 0;
      this.l = null;
      if (this.g)
        r(); 
    } 
  }
  
  private void q() {
    if (this.x) {
      this.o = this.A;
      return;
    } 
    if ((a() | n()) != 0)
      try {
        this.o = this.b.getMediaTime();
        if (this.o == -1L)
          this.o = 0L; 
        return;
      } catch (Exception exception) {
        return;
      }  
    this.o = 0L;
  }
  
  public final String k() {
    q();
    return u.a(this.o);
  }
  
  private void r() {
    int i = this.a.f.c;
    this.l = null;
    this.l = new int[i];
    if (i > 0) {
      Random random = new Random();
      int j = 0;
      int k = 0;
      byte b1;
      for (b1 = 0; b1 < i; b1++)
        this.l[b1] = b1; 
      for (b1 = 0; b1 < i; b1++) {
        if ((j = random.nextInt() % i) < 0)
          j *= -1; 
        k = this.l[b1];
        this.l[b1] = this.l[j];
        this.l[j] = k;
      } 
      for (b1 = 0; b1 < i; b1++) {
        if (this.l[b1] == this.a.f.b) {
          k = this.l[0];
          this.l[0] = this.a.f.b;
          this.l[b1] = k;
          break;
        } 
      } 
      this.k = 0;
    } 
  }
  
  private void a(int paramInt) {
    if (this.g)
      for (byte b1 = 0; b1 < this.l.length; b1++) {
        if (this.l[b1] == paramInt) {
          int i = this.l[this.k];
          this.l[this.k] = paramInt;
          this.l[b1] = i;
          return;
        } 
      }  
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */