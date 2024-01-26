import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import jimm.Jimm;

public final class db {
  private static int g;
  
  private static int h;
  
  private static int i;
  
  private static int j;
  
  public static int a;
  
  public static int b;
  
  public static int c;
  
  private static volatile int k;
  
  private static volatile int l;
  
  private static volatile int m;
  
  private static volatile int n;
  
  private static Date o;
  
  private static Date p;
  
  private static int q;
  
  private static int r;
  
  public static ct d;
  
  private static int s;
  
  private static long t;
  
  public static int e;
  
  private static long u;
  
  private static long v = 0L;
  
  public static int f = 0;
  
  public db() {
    l = 0;
    n = 0;
    m = 0;
    q = 0;
    p = new Date(1L);
    r = 0;
    o = new Date();
    e = 0;
    u = 0L;
    try {
      f();
    } catch (Exception exception) {
      o.setTime((new Date()).getTime());
      h = 0;
      j = 0;
      i = 0;
      b = 0;
      c = 0;
      s = 0;
      t = 0L;
    } 
    d = new ct();
    cp.a(27, "KEY:" + f(150) + "," + a(22) + "," + ((n + j) / 1024), (Object[])null, (PI)null);
  }
  
  private static void f() throws IOException, RecordStoreException {
    RecordStore recordStore;
    byte[] arrayOfByte = (recordStore = RecordStore.openRecordStore("traffic", false)).getRecord(2);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    DataInputStream dataInputStream;
    h = (dataInputStream = new DataInputStream(byteArrayInputStream)).readInt();
    i = dataInputStream.readInt();
    o.setTime(dataInputStream.readLong());
    p.setTime(dataInputStream.readLong());
    q = dataInputStream.readInt();
    if (dataInputStream.available() > 2) {
      s = dataInputStream.readInt();
      t = dataInputStream.readLong();
    } 
    if (dataInputStream.available() > 2)
      j = dataInputStream.readInt(); 
    recordStore.closeRecordStore();
  }
  
  public static void a() throws IOException, RecordStoreException {
    RecordStore recordStore = RecordStore.openRecordStore("traffic", true);
    while (recordStore.getNumRecords() < 4)
      recordStore.addRecord(null, 0, 0); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = null;
    (new DataOutputStream(byteArrayOutputStream)).writeUTF(Jimm.b);
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    recordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
    byteArrayOutputStream = new ByteArrayOutputStream();
    (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeInt(h + l);
    dataOutputStream.writeInt(i + m);
    dataOutputStream.writeLong(o.getTime());
    dataOutputStream.writeLong(p.getTime());
    dataOutputStream.writeInt(a(false));
    dataOutputStream.writeInt(s + e);
    dataOutputStream.writeLong(t + u);
    dataOutputStream.writeInt(j + n);
    arrayOfByte = byteArrayOutputStream.toByteArray();
    recordStore.setRecord(2, arrayOfByte, 0, arrayOfByte.length);
    recordStore.closeRecordStore();
  }
  
  public static String a(int paramInt) {
    Calendar calendar;
    (calendar = Calendar.getInstance()).setTime(o);
    int i = c();
    int j = b();
    g = i + j;
    a = c + b;
    switch (paramInt) {
      case 11:
        return m + " /" + l + " /" + k + " B";
      case 12:
        return (m / 1024) + " /" + (l / 1024) + " /" + (k / 1024) + " Kb";
      case 13:
        return a(a(true)) + " " + em.d(115);
      case 4:
        return dh.c(calendar.get(5)) + "." + dh.c(calendar.get(2) + 1) + "." + calendar.get(1);
      case 21:
        return i + " /" + j + " /" + g + " B";
      case 23:
        return a(a(false)) + " " + em.d(115);
      case 22:
        return (i / 1024) + " /" + (j / 1024) + " /" + (g / 1024) + " Kb";
      case 5:
        return c + " /" + b + " /" + a;
      case 40:
        return "Session:" + n + "/" + (n / 1024) + "KB\nAll:" + (n + j) + "/" + ((n + j) / 1024) + "Kb";
    } 
    return "";
  }
  
  public static String a(long paramLong) {
    String str1 = null;
    String str2 = null;
    try {
      if (paramLong != 0L) {
        str1 = Long.toString(paramLong / 100000L) + ".";
        for (str2 = Long.toString(paramLong % 100000L); str2.length() < 5; str2 = "0" + str2);
        while (str2.endsWith("0") && str2.length() > 2)
          str2 = str2.substring(0, str2.length() - 1); 
        return str1 + str2;
      } 
      return new String("0.00");
    } catch (Exception exception) {
      return new String("0.00");
    } 
  }
  
  private static boolean g() {
    Calendar calendar1 = Calendar.getInstance();
    Calendar calendar2 = Calendar.getInstance();
    calendar1.setTime(new Date());
    calendar2.setTime(p);
    return (calendar1.get(5) == calendar2.get(5) && calendar1.get(2) == calendar2.get(2) && calendar1.get(1) == calendar2.get(1));
  }
  
  private static int a(boolean paramBoolean) {
    int i;
    int j = em.f(215);
    int k = em.f(217);
    if (paramBoolean) {
      if (k != 0) {
        i = (k / k + 1) * j;
      } else {
        i = 0;
      } 
    } else if (k != 0) {
      i = (k / k + 1) * j + q;
    } else {
      i = q;
    } 
    if (!g() && k != 0 && r == 0) {
      r += em.f(216);
      p.setTime((new Date()).getTime());
    } 
    return i + r;
  }
  
  public static int b() {
    return h + l;
  }
  
  public static int c() {
    return i + m;
  }
  
  public static int d() {
    k = m + l;
    return k;
  }
  
  public static void b(int paramInt) {
    l += paramInt;
    h();
  }
  
  public static void c(int paramInt) {
    n += paramInt;
    h();
  }
  
  public static void d(int paramInt) {
    m += paramInt;
    h();
  }
  
  private static void h() {
    bi.e(d());
  }
  
  public static void e() {
    h = 0;
    j = 0;
    i = 0;
    q = 0;
    s = 0;
    t = 0L;
    n = 0;
    e = 0;
    u = 0L;
    o.setTime((new Date()).getTime());
    try {
      a();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void a(String paramString) {
    f = paramString.length();
    v = (new Date()).getTime();
  }
  
  public static void e(int paramInt) {
    if (v != 0L && (paramInt -= f) > 3) {
      e += paramInt;
      u += (new Date()).getTime() - v;
    } 
    v = 0L;
    f = 0;
  }
  
  public static String f(int paramInt) {
    String str;
    Calendar.getInstance().setTime(o);
    switch (paramInt) {
      case 10:
        return e + bb.a((short)754) + (u / 1000L) + bb.a((short)755);
      case 11:
        str = "0/0" + bb.a((short)757);
        if (u != 0L)
          str = b(e * 10L * 1000L / u) + bb.a((short)757); 
        return str;
      case 12:
        str = "0/0" + bb.a((short)758);
        if (u != 0L)
          str = b(e * 60L * 10L * 1000L / u) + bb.a((short)758); 
        return str;
      case 20:
        return (e + s) + bb.a((short)754) + ((u + t) / 1000L) + bb.a((short)755);
      case 21:
        str = "0/0" + bb.a((short)757);
        if (u + t != 0L)
          str = b((e + s) * 10L * 1000L / (u + t)) + bb.a((short)757); 
        return str;
      case 22:
      case 150:
        str = "0/0";
        if (u + t != 0L)
          str = b((e + s) * 60L * 10L * 1000L / (u + t)); 
        if (paramInt < 128)
          str = str + bb.a((short)758); 
        return str;
    } 
    return "";
  }
  
  private static String b(long paramLong) {
    String str1 = null;
    String str2 = null;
    try {
      if (paramLong != 0L) {
        str1 = Long.toString(paramLong / 10L) + ".";
        for (str2 = Long.toString(paramLong % 10L); str2.length() < 1; str2 = "0" + str2);
        while (str2.endsWith("0") && str2.length() > 2)
          str2 = str2.substring(0, str2.length() - 1); 
        return str1 + str2;
      } 
      return new String("0.00");
    } catch (Exception exception) {
      return new String("0.00");
    } 
  }
  
  public class ct implements CommandListener {
    private Command a = new Command(bb.a((short)10), 1, 2);
    
    private Command b = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 1);
    
    private be c = new be(bb.a((short)489));
    
    private byte d = 1;
    
    private byte e = (byte)db.d();
    
    private int f;
    
    public ct() {
      this.c.e(3);
      this.c.c(8);
      this.c.a(this.a, bd.Z);
      this.c.a(this.b, bd.aa);
      this.c.a(this);
    }
    
    public final void a() {
      try {
        a(true);
      } catch (Throwable throwable) {}
      this.c.b(Jimm.d);
    }
    
    private void a(boolean param1Boolean) {
      if (db.d() - this.e >= this.d || db.e - this.f != 0 || param1Boolean) {
        int i = em.g(18);
        int j = em.g(16);
        int k = em.g(19);
        this.c.z();
        this.c.a(bb.a((short)426) + ":\n" + bb.a((short)377) + "\n", i, 1, -1).a(db.a(11) + "\n", k, 0, -1).a(db.a(12) + "\n", k, 0, -1).a(db.a(13) + "\n\n", k, 0, -1).a(bb.a((short)436) + " ", i, 1, -1).a(db.a(4) + "\n" + bb.a((short)377) + "\n", k, 1, -1).a(db.a(21) + "\n", k, 0, -1).a(db.a(22) + "\n", k, 0, -1).a(db.a(23) + "\n\n", k, 0, -1).a(bb.a((short)796) + " ", i, 1, -1).a(db.a(5) + "\n", k, 0, -1);
        this.e = (byte)db.d();
        this.c.a("\n" + bb.a((short)753), j, 1, -1);
        this.c.a("\n" + bb.a((short)426) + ":\n", i, 1, -1).a(db.f(10) + "\n", k, 0, -1).a(db.f(11) + "\n", k, 0, -1).a(db.f(12) + "\n\n", k, 0, -1).a(bb.a((short)436) + " ", i, 1, -1).a(db.a(4) + "\n", k, 1, -1).a(db.f(20) + "\n", k, 0, -1).a(db.f(21) + "\n", k, 0, -1).a(db.f(22) + "\n", k, 0, -1);
        this.f = db.e;
        this.c.a("\n" + bb.a((short)824) + ":\n", j, 1, -1);
        this.c.a(db.a(40) + "\n", k, 0, -1);
        this.c.e();
      } 
    }
    
    public final void commandAction(Command param1Command, Displayable param1Displayable) {
      if (param1Command == this.a) {
        db.e();
        a(true);
        return;
      } 
      if (param1Command == this.b)
        dw.d(); 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\db.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */