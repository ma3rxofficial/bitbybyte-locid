import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public final class w extends i {
  public static boolean i = '\001';
  
  public static boolean j;
  
  public static boolean k = 1L;
  
  public static boolean l;
  
  public static boolean m;
  
  public static boolean n = '\001';
  
  public static boolean o;
  
  public static String h = "";
  
  private static String p = "";
  
  public static String i;
  
  public static String j = "";
  
  public static String k;
  
  public static long k;
  
  public static boolean p = false;
  
  public static boolean q;
  
  public static Vector a;
  
  public static Vector b;
  
  public static aa a;
  
  public static boolean r;
  
  public static boolean s;
  
  public static boolean t;
  
  public static boolean u;
  
  public static boolean v;
  
  public static long l;
  
  public static boolean w;
  
  public static boolean x;
  
  private static boolean D;
  
  public static boolean y;
  
  public static String l;
  
  public static boolean z;
  
  public static int c;
  
  public static boolean A;
  
  public static int d = 500;
  
  public static int e;
  
  public static String m = "90,500";
  
  public static String n = "FE01FD3F540457045704FF04540457045704FF0452045204540452045004";
  
  public static String o;
  
  public static int f;
  
  public static x a;
  
  public static boolean B;
  
  public static byte d = 3;
  
  public static boolean C;
  
  private static Object a = new Object();
  
  private static l b;
  
  private static Timer b;
  
  public static void h() {
    B = true;
    q = true;
    v.cM = false;
    p = "";
    String[] arrayOfString;
    if (v.c(v.O) && (arrayOfString = v.a((ag)null).b()) != null && arrayOfString.length > 0)
      v.O = arrayOfString[0]; 
    if (v.c(v.O)) {
      String str = "/";
      if (v.bd == 1 || v.bd == 5) {
        str = "a/";
      } else if (v.bd == 2) {
        str = "0:/";
      } else if (v.bd == 3) {
        if (v.G == '\001') {
          str = "c/";
        } else if (v.G == '\002') {
          str = "0:/";
        } else if (v.G != -1) {
          str = "c:/";
        } 
      } else if (v.bd == 4) {
        str = "RMS:/";
      } 
      v.O = str;
    } 
    v.v();
  }
  
  public static void a(String paramString1, String paramString2) {
    if (v.c(paramString1))
      paramString1 = v.O; 
    if (v.c(paramString2))
      paramString2 = s.e(ai.e((i != null) ? v.c(p) : j)); 
    j = v.a(paramString1, paramString2);
    af.b.b(17458);
  }
  
  public static void a(String paramString) {
    if (paramString != null)
      o = paramString; 
    af.b.b(17458);
  }
  
  public static String a(long paramLong1, long paramLong2, boolean paramBoolean) {
    StringBuffer stringBuffer = new StringBuffer(0);
    return (paramLong1 < paramLong2) ? ((v.bd != 4 && !paramBoolean && v.aE == 0) ? stringBuffer.append(v.d(278)).append('\n').append(v.d(279)).append(paramLong1).append('\n').append(v.d(280)).append(paramLong2).toString() : ((v.bd == 4 || v.aE != 0) ? stringBuffer.append(v.d(281)).append('\n').append(v.d(279)).append(paramLong1).append('\n').append(v.d(280)).append(paramLong2).toString() : stringBuffer.append(v.d(282)).append('\n').append(v.d(279)).append(paramLong1).append('\n').append(v.d(280)).append(paramLong2).append('\n').append(v.d(283)).toString())) : null;
  }
  
  public static String e() {
    return (((v)((af)af.b).a).c != null) ? (v.f(str = v.a(((v)((af)af.b).a).c.b(), false)) ? i : str) : null;
  }
  
  public static String b(String paramString) {
    String str = j;
    j = "";
    paramString = v.a(v.O, s.e(ai.e(paramString)));
    return v.c(str) ? paramString : str;
  }
  
  public static void a(String[] paramArrayOfString) {
    ((v)((af)af.b).a).aM = 0;
    af.b.b(false, (v)((af)af.b).a);
    if (paramArrayOfString == null || v.i(paramArrayOfString[0]).length() < 1 || "http://".equals(paramArrayOfString[0]))
      return; 
    h = p = paramArrayOfString[0];
    i = v.i(paramArrayOfString[1]);
    k = v.i(paramArrayOfString[2]);
    j = v.c(v.i(paramArrayOfString[3]));
    i = v.e(paramArrayOfString[4]);
    j = v.e(paramArrayOfString[5]);
    k = v.e(paramArrayOfString[6]);
    l = paramArrayOfString[7];
    z = v.e(paramArrayOfString[8]);
  }
  
  public static synchronized boolean a(String[] paramArrayOfString, boolean paramBoolean, short paramShort) {
    i i1 = new i(paramArrayOfString, paramBoolean);
    if (paramBoolean) {
      i1.a = true;
      i1.g = (paramShort == -1);
      a.addElement(i1);
      l();
      v.l = 1;
      long l1;
      if ((l1 = v.a(paramArrayOfString[9], -1L)) > v.a()) {
        i1.a(l1);
        o();
      } 
      if (c() > d)
        i1.c(); 
    } else {
      i1.a = 2;
    } 
    v.a(i1);
    return !i1.c();
  }
  
  public static synchronized void i() {
    if (v && b != null && !C)
      for (short s = 0; s < b.size() && c() + d() < d; s = (short)(s + 1)) {
        v.a(a, 100);
        if (b.elementAt(s) != null) {
          String[] arrayOfString = b.elementAt(s);
          b.removeElementAt(s);
          b.trimToSize();
          if (a(arrayOfString, true, s)) {
            s = (short)(s - 1);
          } else {
            break;
          } 
        } 
      }  
  }
  
  public static void j() {
    if (C)
      return; 
    for (short s = 0; s < a.size() && c() < d; s = (short)(s + 1)) {
      i i1;
      if ((i1 = a.elementAt(s)) != null && i1.c()) {
        i1.d();
        h = '\001';
        v.a(i1);
        return;
      } 
    } 
  }
  
  public static void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (a == null || ((aa)a).a == null || !v.a((v)((aa)a).a, paramBoolean1)) {
      a = null;
      ((aa)(a = new aa((v)((af)af.b).a))).a = false;
    } else {
      ((aa)a).a = (Thread)((af)af.b).a;
    } 
    ((aa)a).b = paramBoolean2;
  }
  
  public static void k() {
    ((v)((af)af.b).a).aM = 0;
    if (((aa)a).b != 0) {
      ((aa)a).a.d(false);
      return;
    } 
    ((af)af.b).a.d(17458);
  }
  
  protected static synchronized void a(int paramInt, boolean paramBoolean) {
    if (c == paramInt) {
      v.r();
      if (paramBoolean)
        return; 
      if (A)
        ((af)af.b).a.vibrate(d); 
      if (e != 0)
        x.b(); 
    } 
  }
  
  public static int c() {
    byte b = 0;
    if (a != null)
      synchronized (a) {
        int j = a.size();
        while (--j >= 0) {
          i i1;
          if ((i1 = (i)a.elementAt(j)) != null && (((i)i1).b() || i1.b == -1))
            b++; 
        } 
      }  
    return b;
  }
  
  public static int d() {
    byte b = 0;
    if (a != null)
      synchronized (a) {
        int j = a.size();
        while (--j >= 0) {
          i i1;
          if ((i1 = (i)a.elementAt(j)) != null && ((i)i1).c())
            b++; 
        } 
      }  
    return b;
  }
  
  public static void l() {
    if (a != null)
      synchronized (a) {
        short s = 0;
        for (byte b = 0; b < a.size(); b++) {
          i i1;
          if ((i1 = a.elementAt(b)) != null)
            i1.a = s = (short)(s + 1); 
        } 
        return;
      }  
  }
  
  public static void b(boolean paramBoolean) {
    if (a != null) {
      D = v;
      v = false;
      synchronized (a) {
        for (byte b = 0; b < a.size(); b++) {
          i i1;
          if ((i1 = a.elementAt(b)) != null)
            if (paramBoolean && i1.b()) {
              i1.c();
            } else {
              i1.b();
            }  
        } 
      } 
      C = true;
    } 
  }
  
  public static void m() {
    if (C) {
      C = false;
      v = D;
      D = false;
      j();
    } 
  }
  
  public static i a() {
    return (a != null && ((aa)a).b >= 0 && ((aa)a).b < a.size()) ? a.elementAt(((aa)a).b) : null;
  }
  
  public static String[] a(i parami) {
    if (parami != null) {
      String[] arrayOfString;
      (arrayOfString = new String[17])[0] = (String)parami.a;
      arrayOfString[1] = parami.b;
      arrayOfString[2] = parami.c;
      arrayOfString[3] = v.a(parami.f, parami.e);
      arrayOfString[4] = String.valueOf(parami.b);
      arrayOfString[5] = String.valueOf(parami.c);
      arrayOfString[6] = String.valueOf(parami.d);
      arrayOfString[7] = v.a(String.valueOf(parami.a), "-", (parami.b == -1L) ? "" : String.valueOf(parami.b));
      arrayOfString[8] = String.valueOf(parami.a);
      arrayOfString[9] = String.valueOf(parami.e);
      arrayOfString[10] = String.valueOf(parami.d);
      arrayOfString[11] = String.valueOf(parami.a);
      arrayOfString[12] = String.valueOf(parami.f);
      arrayOfString[13] = (parami.c != 0L) ? String.valueOf(parami.c) : "";
      arrayOfString[14] = String.valueOf((parami.g != 0L) ? parami.g : parami.h);
      arrayOfString[15] = (parami.f != 0L) ? String.valueOf(parami.f) : "";
      arrayOfString[16] = v.a("s:e:t ", String.valueOf(parami.b), ":", String.valueOf(parami.a), ":", parami.g);
      return arrayOfString;
    } 
    return null;
  }
  
  public static boolean a(int paramInt, boolean paramBoolean) {
    i i1 = null;
    if (paramInt == -1) {
      i1 = a();
    } else if (paramInt < a.size()) {
      i1 = a.elementAt(paramInt);
    } 
    if (i1 != null) {
      i1.b = 0;
      a.removeElement(i1);
      l();
      if (paramBoolean)
        i1.f(); 
      return true;
    } 
    return false;
  }
  
  public static void b(String[] paramArrayOfString) {
    if (b == null)
      b = (Timer)new Vector(1); 
    if (a((Vector)b, paramArrayOfString) == -1) {
      b.addElement(paramArrayOfString);
      af.b.a(400, v.a(v.d(0), " [", String.valueOf(b.size()), "]"), v.d(499));
    } 
    v.l = 1;
  }
  
  private static int a(Vector paramVector, String[] paramArrayOfString) {
    if (paramVector != null && !paramVector.isEmpty()) {
      int j = paramVector.size();
      while (--j >= 0) {
        String[] arrayOfString;
        if ((arrayOfString = paramVector.elementAt(j)) != null) {
          boolean bool = true;
          for (byte b = 0; b < arrayOfString.length; b++) {
            if (!v.i(arrayOfString[b]).equals(v.i(paramArrayOfString[b]))) {
              bool = false;
              break;
            } 
          } 
          if (bool)
            return j; 
        } 
      } 
    } 
    return -1;
  }
  
  public static void a(DataOutputStream paramDataOutputStream, i parami) {
    paramDataOutputStream.writeUTF(v.i((String)parami.a));
    paramDataOutputStream.writeUTF(v.i(parami.b));
    paramDataOutputStream.writeUTF(v.i(parami.c));
    paramDataOutputStream.writeUTF(v.i(parami.d));
    paramDataOutputStream.writeUTF(v.i(parami.e));
    paramDataOutputStream.writeUTF(v.i(parami.f));
    paramDataOutputStream.writeLong(parami.a);
    paramDataOutputStream.writeLong(parami.b);
    paramDataOutputStream.writeBoolean(parami.a);
    paramDataOutputStream.writeBoolean(parami.b);
    paramDataOutputStream.writeBoolean(parami.c);
    paramDataOutputStream.writeBoolean(parami.d);
    paramDataOutputStream.writeBoolean(parami.e);
    paramDataOutputStream.writeLong(parami.c);
    paramDataOutputStream.writeLong(parami.h);
    paramDataOutputStream.writeLong(parami.e);
    paramDataOutputStream.writeLong(parami.d);
    paramDataOutputStream.writeByte(parami.b);
    paramDataOutputStream.writeByte(parami.a);
    paramDataOutputStream.writeLong(parami.f);
    y |= (parami.f > 0L) ? 1 : 0;
    paramDataOutputStream.writeUTF("");
  }
  
  public static void a(DataOutputStream paramDataOutputStream, String[] paramArrayOfString) {
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[0]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[1]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[2]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[3]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[4]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[5]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[6]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[7]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[8]));
    paramDataOutputStream.writeUTF(v.i(paramArrayOfString[9]));
  }
  
  public static i a(DataInputStream paramDataInputStream, short paramShort) {
    i i1;
    (i1 = new i()).a = paramShort;
    i1.a = (Timer)paramDataInputStream.readUTF();
    i1.b = paramDataInputStream.readUTF();
    i1.c = paramDataInputStream.readUTF();
    i1.d = paramDataInputStream.readUTF();
    i1.e = paramDataInputStream.readUTF();
    i1.f = paramDataInputStream.readUTF();
    i1.a = paramDataInputStream.readLong();
    i1.b = paramDataInputStream.readLong();
    i1.a = paramDataInputStream.readBoolean();
    i1.b = paramDataInputStream.readBoolean();
    i1.c = paramDataInputStream.readBoolean();
    i1.d = paramDataInputStream.readBoolean();
    i1.e = paramDataInputStream.readBoolean();
    i1.c = paramDataInputStream.readLong();
    i1.h = paramDataInputStream.readLong();
    i1.e = paramDataInputStream.readLong();
    i1.d = paramDataInputStream.readLong();
    i1.b = paramDataInputStream.readByte();
    i1.a = paramDataInputStream.readByte();
    i1.f = paramDataInputStream.readLong();
    paramDataInputStream.readUTF();
    return i1;
  }
  
  public static String[] a(DataInputStream paramDataInputStream) {
    String[] arrayOfString;
    (arrayOfString = new String[10])[0] = paramDataInputStream.readUTF();
    arrayOfString[1] = paramDataInputStream.readUTF();
    arrayOfString[2] = paramDataInputStream.readUTF();
    arrayOfString[3] = paramDataInputStream.readUTF();
    arrayOfString[4] = paramDataInputStream.readUTF();
    arrayOfString[5] = paramDataInputStream.readUTF();
    arrayOfString[6] = paramDataInputStream.readUTF();
    arrayOfString[7] = paramDataInputStream.readUTF();
    arrayOfString[8] = paramDataInputStream.readUTF();
    arrayOfString[9] = paramDataInputStream.readUTF();
    return arrayOfString;
  }
  
  public static String f() {
    return (a != null) ? v.a(String.valueOf(c()), "/", String.valueOf(a.size())) : "";
  }
  
  public static void n() {
    if (v.l != 0)
      v.c((DataOutputStream)null); 
    B = false;
    a = null;
    a = null;
    b = null;
    h = "";
    p = "";
    i = "";
    j = "";
    k = "";
  }
  
  public static void o() {
    if (b == null)
      b = (Timer)new l(41); 
    if (b == null)
      (b = new Timer()).scheduleAtFixedRate((TimerTask)b, 0L, 60000L); 
  }
  
  public static void p() {
    v.a((TimerTask)b);
    b = null;
    try {
      if (b != null)
        b.cancel(); 
    } catch (Exception exception) {
    
    } finally {
      b = null;
    } 
    y = false;
    v.i = true;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\w.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */