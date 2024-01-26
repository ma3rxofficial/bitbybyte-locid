import i.C;
import i.I;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.TimerTask;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import jimm.Jimm;

public final class dm implements C {
  public static int a = 0;
  
  public byte[] b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public static Hashtable g;
  
  public byte[] h;
  
  public byte[] i;
  
  public I j;
  
  public int k;
  
  public I l;
  
  private static Object z = new Object();
  
  private boolean A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  public int m;
  
  private int G;
  
  private int H;
  
  private int I;
  
  private int J;
  
  private int K;
  
  public int n;
  
  private int L;
  
  private int M;
  
  private int N;
  
  private int O;
  
  private int P;
  
  private String Q;
  
  private String R;
  
  private String S;
  
  private String T;
  
  public String o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public boolean s;
  
  public long t = 0L;
  
  public dt u;
  
  public static String v = new String();
  
  private boolean U = false;
  
  private boolean V;
  
  private boolean W;
  
  private boolean X;
  
  private boolean Y;
  
  private int Z;
  
  private int aa;
  
  private TimerTask ab;
  
  public dv w = new dv();
  
  public int x;
  
  public volatile int y;
  
  private volatile int ac;
  
  public final boolean h() {
    if (this.i == this.h)
      return true; 
    if (this.i == null)
      return false; 
    if (this.h == null)
      return false; 
    for (byte b = 0; b < 16; b++) {
      if (this.i[b] != this.h[b])
        return false; 
    } 
    this.i = this.h;
    return true;
  }
  
  private static String c(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return null; 
    StringBuffer stringBuffer = new StringBuffer(paramArrayOfbyte.length * 2);
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      stringBuffer.append(Integer.toHexString(paramArrayOfbyte[b] >> 4 & 0xF));
      stringBuffer.append(Integer.toHexString(paramArrayOfbyte[b] & 0xF));
    } 
    return stringBuffer.toString();
  }
  
  public final I j() {
    if (!em.h(69))
      return null; 
    if (this.l != null)
      return this.l; 
    if (this.A)
      return null; 
    if (g == null) {
      g = new Hashtable();
      String[] arrayOfString = RecordStore.listRecordStores();
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b].startsWith("av"))
          g.put(arrayOfString[b], z); 
      } 
    } 
    String str = null;
    if (this.h != null) {
      str = d(this.h);
      if (!g.containsKey(str))
        str = null; 
    } 
    if (this.i != null && str == null) {
      str = d(this.i);
      if (!g.containsKey(str))
        str = null; 
    } 
    if (str != null) {
      Object object;
      if ((object = g.get(str)) != z)
        return (I)object; 
      try {
        RecordStore recordStore;
        byte[] arrayOfByte = (recordStore = RecordStore.openRecordStore(str, false)).getRecord(1);
        recordStore.closeRecordStore();
        Image image = null;
        try {
          image = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
        } catch (Throwable throwable) {}
        if (image != null) {
          this.l = new I(image);
          g.remove(str);
          g.put(str, this.l);
          this.A = false;
          I i = this.l;
          if (em.h(71))
            this.l = null; 
          return i;
        } 
      } catch (RecordStoreException recordStoreException) {}
    } 
    this.A = true;
    return null;
  }
  
  public final synchronized void a(byte[] paramArrayOfbyte) {
    if (this.h == null)
      this.A = false; 
    this.h = paramArrayOfbyte;
  }
  
  public final void a(byte[] paramArrayOfbyte1, I paramI, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte2 != null && !h()) {
      String str = d(paramArrayOfbyte1);
      try {
        RecordStore recordStore;
        if ((recordStore = RecordStore.openRecordStore(str, true)).getNumRecords() > 0) {
          recordStore.setRecord(1, paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
        } else {
          recordStore.addRecord(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
        } 
        recordStore.closeRecordStore();
        this.i = paramArrayOfbyte1;
        bi.o();
      } catch (Exception exception) {}
      this.l = paramI;
      g.put(str, this.l);
      this.k = 0;
    } 
  }
  
  private static String d(byte[] paramArrayOfbyte) {
    String str;
    if ((str = "av" + c(paramArrayOfbyte)).length() > 30)
      str = str.substring(0, 30); 
    return str;
  }
  
  public final I a(int paramInt) {
    if (!em.h(69))
      return null; 
    if (paramInt == this.k)
      return this.j; 
    this.k = paramInt;
    this.j = j();
    I i = null;
    if ((i = a(this.j, paramInt, paramInt)) != null) {
      this.j = i;
      return this.j;
    } 
    return this.j;
  }
  
  public static I a(I paramI, int paramInt1, int paramInt2) {
    try {
      if (paramI == null)
        return null; 
      int i = paramI.getWidth();
      if (paramI.getHeight() <= paramInt2 && i <= paramInt1)
        return paramI; 
      Image image = dh.a(paramI.createImage(), paramInt1, paramInt2, false);
      return new I(image);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final synchronized void a(int paramInt, String paramString) {
    switch (paramInt) {
      case 0:
        this.n = Integer.parseInt(paramString);
        return;
      case 1:
        this.o = paramString;
        this.S = null;
        return;
      case 2:
        this.Q = paramString;
        return;
      case 3:
        this.R = paramString;
        return;
      case 5:
        this.T = paramString;
        return;
    } 
  }
  
  public final synchronized String getStringValue(int paramInt) {
    switch (paramInt) {
      case 0:
        return Integer.toString(this.n);
      case 1:
        return this.o;
      case 2:
        return this.Q;
      case 3:
        return this.R;
      case 5:
        return this.T;
    } 
    return null;
  }
  
  public final String i() {
    return t();
  }
  
  public final int getSortWeight(int paramInt) {
    int i = getIntValue(192);
    if (e(1))
      return 1; 
    switch (paramInt) {
      case 1:
        if (i == 32)
          return 2; 
        if (i == 0 || i == 20480 || i == 24576 || i == 256)
          return 3; 
        if (i == 12288)
          return 4; 
        if (i == 16384)
          return 5; 
        if (i == 16)
          return 6; 
        if (i == 2)
          return 7; 
        if (i == 8193)
          return 8; 
        if (i == 1)
          return 9; 
        if (i == 4)
          return 10; 
        break;
      case 2:
        if (i != -1)
          return 5; 
        break;
      case 3:
        if (getBooleanValue(16))
          return (i != -1) ? 4 : 6; 
        if (i != -1)
          return 5; 
        break;
    } 
    return ((getBooleanValue(8) || getBooleanValue(32)) && i == -1) ? 20 : 15;
  }
  
  public final synchronized void a(int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 64:
        this.B = this.B & 0xFFFF | paramInt2 << 16;
        return;
      case 65:
        this.B = this.B & 0xFFFF0000 | paramInt2;
        return;
      case 67:
        a += paramInt2 - this.F;
        this.F = paramInt2;
        return;
      case 68:
        a += paramInt2 - ((this.E & 0xFF0000) >> 16 & 0xFF);
        this.E = this.E & 0xFF00FFFF | paramInt2 << 16;
        return;
      case 69:
        a += paramInt2 - ((this.E & 0xFF00) >> 8 & 0xFF);
        this.E = this.E & 0xFFFF00FF | paramInt2 << 8;
        return;
      case 70:
        a += paramInt2 - (this.E & 0xFF);
        this.E = this.E & 0xFFFFFF00 | paramInt2;
        return;
      case 71:
        this.C = paramInt2;
        return;
      case 75:
        this.m = paramInt2;
        return;
      case 192:
        this.O = paramInt2;
        return;
      case 72:
        this.G = this.G & 0xFF | (paramInt2 & 0xFF) << 8;
        return;
      case 73:
        this.H = this.H & 0xFFFF0000 | paramInt2 & 0xFFFF;
        return;
      case 74:
        this.H = this.H & 0xFFFF | (paramInt2 & 0xFFFF) << 16;
        return;
      case 76:
        this.G = this.G & 0xFF00 | paramInt2 & 0xFF;
        return;
      case 193:
        this.K = paramInt2;
        return;
      case 195:
        this.L = paramInt2;
        return;
      case 194:
        this.N = paramInt2;
        return;
      case 191:
        this.M = paramInt2;
        return;
      case 196:
        this.P = paramInt2;
        return;
    } 
  }
  
  public final synchronized int getIntValue(int paramInt) {
    switch (paramInt) {
      case 64:
        return (this.B & 0xFFFF0000) >> 16 & 0xFFFF;
      case 65:
        return this.B & 0xFFFF;
      case 67:
        return this.F;
      case 68:
        return (this.E & 0xFF0000) >> 16 & 0xFF;
      case 69:
        return (this.E & 0xFF00) >> 8 & 0xFF;
      case 70:
        return this.E & 0xFF;
      case 71:
        return this.C;
      case 75:
        return this.m;
      case 192:
        return this.O;
      case 72:
        return (this.G & 0xFF00) >> 8 & 0xFF;
      case 73:
        return this.H & 0xFFFF;
      case 74:
        return (this.H & 0xFFFF0000) >> 16 & 0xFFFF;
      case 76:
        return this.G & 0xFF;
      case 193:
        return this.K;
      case 195:
        return this.L;
      case 194:
        return this.N;
      case 191:
        return this.M;
      case 196:
        return this.P;
    } 
    return 0;
  }
  
  public final synchronized void a(int paramInt, boolean paramBoolean) {
    this.D = this.D & (paramInt ^ 0xFFFFFFFF) | (paramBoolean ? paramInt : 0);
  }
  
  public final synchronized boolean getBooleanValue(int paramInt) {
    return ((this.D & paramInt) != 0);
  }
  
  private static byte[] i(int paramInt) {
    return (paramInt == 0) ? null : new byte[] { (byte)(paramInt & 0xFF), (byte)((paramInt & 0xFF00) >> 8), (byte)((paramInt & 0xFF0000) >> 16), (byte)((paramInt & 0xFF000000) >> 24) };
  }
  
  private static int e(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null || paramArrayOfbyte.length < 4) ? 0 : (paramArrayOfbyte[0] & 0xFF | (paramArrayOfbyte[1] & 0xFF) << 8 | (paramArrayOfbyte[2] & 0xFF) << 16 | (paramArrayOfbyte[3] & 0xFF) << 24);
  }
  
  public final synchronized void a(int paramInt, byte[] paramArrayOfbyte) {
    switch (paramInt) {
      case 225:
        this.I = e(paramArrayOfbyte);
        return;
      case 226:
        this.J = e(paramArrayOfbyte);
        return;
      case 227:
        this.h = paramArrayOfbyte;
        return;
      case 228:
        this.i = paramArrayOfbyte;
        break;
    } 
  }
  
  public final synchronized byte[] b(int paramInt) {
    switch (paramInt) {
      case 225:
        return i(this.I);
      case 226:
        return i(this.J);
      case 227:
        return this.h;
      case 228:
        return this.i;
    } 
    return null;
  }
  
  public final void a(DataOutputStream paramDataOutputStream) throws IOException {
    paramDataOutputStream.writeByte(2);
    paramDataOutputStream.writeInt(this.B);
    paramDataOutputStream.writeByte(this.D & 0xA);
    paramDataOutputStream.writeInt(this.n);
    paramDataOutputStream.writeUTF(this.o);
    paramDataOutputStream.writeInt(r());
    paramDataOutputStream.writeInt(s());
    paramDataOutputStream.writeInt(this.y);
    paramDataOutputStream.writeByte(1);
    if (this.i != null) {
      paramDataOutputStream.writeByte(16);
      paramDataOutputStream.write(this.i);
      return;
    } 
    paramDataOutputStream.writeByte(0);
  }
  
  public final void a(DataInputStream paramDataInputStream, int paramInt) throws IOException {
    this.B = paramDataInputStream.readInt();
    this.D = paramDataInputStream.readByte();
    this.n = paramDataInputStream.readInt();
    this.o = paramDataInputStream.readUTF();
    g(paramDataInputStream.readInt());
    h(paramDataInputStream.readInt());
    this.y = paramDataInputStream.readInt();
    if (paramInt == 1 && paramDataInputStream.readUnsignedByte() > 0) {
      int i;
      if ((i = paramDataInputStream.readUnsignedByte()) == 0) {
        this.i = null;
        return;
      } 
      this.i = new byte[i];
      paramDataInputStream.readFully(this.i);
    } 
  }
  
  private void a(int paramInt1, int paramInt2, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramInt1 == -1) {
      a(64, dh.b());
    } else {
      a(64, paramInt1);
    } 
    a(65, paramInt2);
    a(0, paramString1);
    a(1, paramString2);
    a(2, paramBoolean1);
    a(8, false);
    a(16, false);
    a(32, false);
    a(1, paramBoolean2);
    a(192, -1);
    a(75, 0);
    a(67, 0);
    a(68, 0);
    a(69, 0);
    a(70, 0);
    a(225, new byte[4]);
    a(226, new byte[4]);
    a(74, 0);
    a(72, 0);
    a(73, 0);
    a(193, 0);
    a(194, -1);
    a(191, -1);
    this.L = -1;
    a(71, -1);
    a(76, 0);
    a(2, "");
    a(3, "");
    a(196, ci.b(paramString1));
  }
  
  public dm(int paramInt1, int paramInt2, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2) {
    a(paramInt1, paramInt2, paramString1, paramString2, paramBoolean1, paramBoolean2);
  }
  
  public dm() {}
  
  public final boolean c(int paramInt) {
    return ((paramInt & this.m) != 0);
  }
  
  public final void d(int paramInt) {
    this.m |= paramInt;
  }
  
  private String t() {
    if (this.S == null) {
      this.S = this.o.toLowerCase();
      if (this.S.equals(this.o))
        this.S = this.o; 
    } 
    return this.S;
  }
  
  public final int getTextColor() {
    return ((em.h(12) && this.V) || this.W) ? em.g(5) : (getBooleanValue(32) ? em.g(10) : (getBooleanValue(8) ? em.g(3) : (getBooleanValue(16) ? em.g(2) : em.g(1))));
  }
  
  public final int getFontStyle() {
    return (getBooleanValue(16) || this.W || (em.h(12) && this.V)) ? 1 : em.f(240);
  }
  
  public final String getUinString() {
    return Integer.toString(this.n);
  }
  
  public final int getImageIndex() {
    int i = 0;
    if (this.U)
      return 18; 
    if (this.V && em.h(11))
      return 19; 
    if (e(1)) {
      i = 14;
    } else if (e(2)) {
      i = 15;
    } else if (e(4)) {
      i = 16;
    } else if (e(3)) {
      i = 17;
    } else {
      i = dw.a(getIntValue(192));
    } 
    return i;
  }
  
  public final String getText() {
    return this.o;
  }
  
  public final boolean k() {
    return ((getBooleanValue(32) || getBooleanValue(8)) && cp.c.equals(getUinString())) ? false : (em.h(8) ? ((getIntValue(67) > 0 || getIntValue(68) > 0 || getIntValue(69) > 0 || getIntValue(70) > 0 || getBooleanValue(8) || getBooleanValue(32) || this.X)) : ((getBooleanValue(16) || getBooleanValue(8) || getBooleanValue(32) || this.X)));
  }
  
  public final int l() {
    return getIntValue(67) + getIntValue(68) + getIntValue(69) + getIntValue(70);
  }
  
  public final synchronized boolean e(int paramInt) {
    switch (paramInt) {
      case 1:
        return (getIntValue(67) > 0);
      case 2:
        return (getIntValue(68) > 0);
      case 3:
        return (getIntValue(69) > 0);
      case 4:
        return (getIntValue(70) > 0);
    } 
    return (getIntValue(67) > 0);
  }
  
  public final synchronized void f(int paramInt) {
    switch (paramInt) {
      case 1:
        a(67, getIntValue(67) + 1);
        return;
      case 2:
        a(68, getIntValue(68) + 1);
        return;
      case 3:
        a(69, getIntValue(69) + 1);
        return;
      case 4:
        a(70, getIntValue(70) + 1);
        break;
    } 
  }
  
  public final synchronized void m() {
    a(67, 0);
    a(68, 0);
    a(69, 0);
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof dm))
      return false; 
    dm dm1 = (dm)paramObject;
    return (getStringValue(0).equals(dm1.getStringValue(0)) && getBooleanValue(8) == dm1.getBooleanValue(8));
  }
  
  public final void showHistory() {
    ea.a(getStringValue(0), this.o);
  }
  
  public final void a(boolean paramBoolean) {
    this.U = paramBoolean;
    q();
  }
  
  public final void n() {
    this.Z = 0;
    this.V = false;
    this.W = false;
    this.X = true;
  }
  
  private void u() {
    this.X = false;
    bi.a(this, false, true);
  }
  
  public final void b(boolean paramBoolean) {
    this.Y = paramBoolean;
    if (this.Y) {
      if (!em.h(12) && !em.h(11))
        return; 
      this.W = false;
      this.aa = em.f(213) * 2 + 1;
    } else {
      if (!em.h(13)) {
        this.X = false;
        return;
      } 
      this.V = false;
      this.aa = em.f(214) * 2 + 1;
    } 
    if (this.ab != null)
      this.ab.cancel(); 
    this.ab = new fh(this);
    Jimm.b().schedule(this.ab, 500L, 500L);
  }
  
  public final void o() {
    this.U = false;
    a(192, -1);
  }
  
  public final synchronized int c() {
    return (getIntValue(196) != -1) ? 0 : -1;
  }
  
  public final synchronized int d() {
    return ((this.x & 0x8) != 0) ? 0 : -1;
  }
  
  public final synchronized int e() {
    return getBooleanValue(2) ? 0 : -1;
  }
  
  public final synchronized int b() {
    int i;
    return ((i = getIntValue(76)) == 31 && getBooleanValue(64)) ? -100 : (i - 1);
  }
  
  public final synchronized int f() {
    return (r() != 0) ? 1 : ((s() != 0) ? 0 : -1);
  }
  
  public final synchronized int g() {
    return (this.y == 0) ? -1 : 2;
  }
  
  public final void a(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return; 
    this.o = paramString;
    this.S = null;
    try {
      bi.j();
      if (!getBooleanValue(8)) {
        Object object = null;
        cd.a(new ei((er)this, 3));
      } 
    } catch (cr cr) {
      if (null.a)
        return; 
    } catch (Exception exception) {}
    bi.a(this, true, true);
    cj.a(getStringValue(0), this.o);
  }
  
  public final void p() {
    v = getUinString();
    if (!bi.r)
      cj.a(this); 
    if (getBooleanValue(16) && !bi.r) {
      eo eo = cj.d(v);
      cj.h(v);
      eo.a(this);
      eo.f();
      if (em.h(25) && this.p && getIntValue(76) != 16) {
        try {
          cg.a(v, 0);
        } catch (Exception exception) {}
        this.p = false;
      } 
      q();
      return;
    } 
    dw.a(this);
  }
  
  public final void q() {
    boolean bool = this.U ? true : dw.a(getIntValue(192));
    if (ef.e()) {
      ef.a(bool);
      ef.a(this.w.b());
      ef.a(getStringValue(1));
      ef.b();
      ef.h();
      return;
    } 
    eo eo;
    if ((eo = cj.d(getStringValue(0))) != null) {
      eo.a(bi.b.a(bool));
      eo.b(this.w.b());
      eo.c(bi.h.a(d()));
    } 
  }
  
  public final synchronized void b(byte[] paramArrayOfbyte) {
    this.w.b(paramArrayOfbyte);
  }
  
  public final synchronized dv a() {
    return this.w;
  }
  
  public final int r() {
    return (this.ac & 0xFFFF0000) >> 16 & 0xFFFF;
  }
  
  public final void g(int paramInt) {
    this.ac = this.ac & 0xFFFF | paramInt << 16;
  }
  
  public final int s() {
    return this.ac & 0xFFFF;
  }
  
  public final void h(int paramInt) {
    this.ac = this.ac & 0xFFFF0000 | paramInt;
  }
  
  public static int a(dm paramdm) {
    return paramdm.Z++;
  }
  
  public static boolean b(dm paramdm) {
    return paramdm.Y;
  }
  
  public static boolean a(dm paramdm, boolean paramBoolean) {
    return paramdm.V = paramBoolean;
  }
  
  public static boolean c(dm paramdm) {
    return paramdm.V;
  }
  
  public static boolean b(dm paramdm, boolean paramBoolean) {
    return paramdm.W = paramBoolean;
  }
  
  public static boolean d(dm paramdm) {
    return paramdm.W;
  }
  
  public static int e(dm paramdm) {
    return paramdm.Z;
  }
  
  public static int f(dm paramdm) {
    return paramdm.aa;
  }
  
  public static TimerTask g(dm paramdm) {
    return paramdm.ab;
  }
  
  public static void h(dm paramdm) {
    paramdm.u();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */