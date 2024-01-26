import i.I;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.SocketConnection;
import jimm.Jimm;

public final class cd implements Runnable {
  private static cd p;
  
  public static String a = bb.a((short)331);
  
  public static final byte[] b = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
  
  private static boolean q = false;
  
  private static Vector r = new Vector();
  
  public static volatile Thread c;
  
  public static String d;
  
  private static int[] s = new int[] { 
      5695, 23595, 23620, 23049, 10374, 9363, 23620, 23049, 2853, 17372, 
      1255, 1796, 1657, 13606, 1930, 23918, 31234, 30120, 7146, 21314, 
      12492, 8852, 22167, 9722, 13059, 1930, 4037, 9686, 9966, 30064, 
      32563, 20116, 1993, 29497, 17064 };
  
  public static final int[][] e = new int[][] { { 13528, 5834 }, { 17056, 14543 }, { 15769, 14130 }, { 10595, 17826 }, { 2356, 13038 }, { 11547, 5030 }, { 31222, 16937 }, { 15194, 5030 }, { 19136, 23476 }, { 962, 28110 } };
  
  public static final int[] f = new int[] { 5835, 13529, 14544, 17057 };
  
  private static int[] t = new int[] { 
      7146, 12492, 22167, 15398, 1930, 9686, 30064, 20116, 29497, 5695, 
      23620, 10374, 23620, 2853, 1255, 1657, 1930, 31234 };
  
  public static final int[] g = new int[] { 
      21314, 8852, 9722, 13059, 4037, 9966, 32563, 1993, 17064, 23595, 
      23049, 9363, 23049, 17372, 1796, 13606, 23918, 30120 };
  
  private static int u = 1234;
  
  private static long v;
  
  public static Object h = new Object();
  
  public static ek i;
  
  public static ek j;
  
  public static en k;
  
  private static Vector w;
  
  private static bs x;
  
  private static ew y;
  
  public static int l;
  
  public static volatile boolean m = false;
  
  public static boolean n;
  
  public int o = 0;
  
  public cd() {
    p = this;
  }
  
  public static int a(boolean paramBoolean) {
    int i;
    int[] arrayOfInt;
    int j;
    if (paramBoolean)
      u = (new Random(System.currentTimeMillis())).nextInt(); 
    null = 0;
    switch (em.f(247)) {
      case 1:
        i = Math.abs(u) % 10;
        return e[i][paramBoolean ? 0 : 1] + 1;
      case 2:
        i = Math.abs(u) % 10;
        return e[i][paramBoolean ? 1 : 0] + 1;
      case 3:
        i = Math.abs(u) % t.length;
        return paramBoolean ? t[i] : g[i];
      case 4:
        i = Math.abs(u) % t.length;
        return paramBoolean ? g[i] : t[i];
      case 5:
        i = Math.abs(u + (paramBoolean ? 0 : 1)) % s.length;
        return s[i];
      case 6:
        i = Math.abs(u + (paramBoolean ? 0 : 1)) % s.length;
        return s[i] + 1;
      case 7:
        arrayOfInt = em.x[1];
        j = 0;
        j = Math.abs(u) % arrayOfInt.length & 0xFFFFFE;
        return paramBoolean ? arrayOfInt[j] : arrayOfInt[j + 1];
    } 
    return u % 32768;
  }
  
  public static cd a() {
    return p;
  }
  
  public static void a(bg parambg) throws cr {
    parambg.a = p;
    if (!parambg.a())
      throw new cr((short)626, 140, 0); 
    synchronized (p) {
      r.addElement(parambg);
    } 
    int i = em.f(257);
    if (parambg instanceof dk) {
      c = new Thread(p);
      if (i != 5)
        c.setPriority(i); 
      c.start();
    } else {
      long l = System.currentTimeMillis() - 120000L;
      if (i.d != null && i.d.size() > 5 && l > v) {
        c = new Thread(p);
        if (i != 5)
          c.setPriority(i); 
        c.start();
      } 
    } 
    synchronized (h) {
      h.notify();
      return;
    } 
  }
  
  private static void a(String paramString) {
    byte[] arrayOfByte;
    dh.a(arrayOfByte = new byte[1 + paramString.length()], 0, paramString.length());
    System.arraycopy(paramString.getBytes(), 0, arrayOfByte, 1, paramString.length());
    try {
      i.a(new bj(3, 5, 0L, new byte[0], arrayOfByte));
      return;
    } catch (cr cr) {
      cr.a(null);
      return;
    } 
  }
  
  public static synchronized void a(dm paramdm) {
    ei ei = new ei((er)paramdm, 1);
    try {
      a(ei);
    } catch (cr cr2) {
      cr cr1;
      cr.a(cr1 = null);
      if (cr1.a)
        return; 
    } 
    ef.a(bb.a((short)543), ei, false);
  }
  
  private static String o() {
    return dh.a(dh.a(em.d(101).replace('\n', ' '), ' ')[0], "\r", "");
  }
  
  private static void p() {
    String str;
    byte b1 = ((str = em.d(101)).indexOf(' ') < 0) ? 10 : 32;
    String[] arrayOfString;
    if ((arrayOfString = dh.a(str, b1)).length < 2)
      return; 
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b2 = 1; b2 < arrayOfString.length; b2++) {
      stringBuffer.append(arrayOfString[b2]);
      stringBuffer.append(b1);
    } 
    stringBuffer.append(arrayOfString[0]);
    em.b(101, stringBuffer.toString());
  }
  
  public static synchronized void b() {
    m = true;
    n = false;
    if (dw.H == null)
      dw.b(2000); 
    if (em.h(2)) {
      Object object = null;
      try {
        Object object1 = null;
        ((ContentConnection)Connector.open("http://jimm.im/fake")).openDataInputStream();
      } catch (Exception exception) {}
    } 
    dk dk = new dk(em.c(-1), em.c(-2), o(), em.d(102));
    try {
      a(dk);
    } catch (cr cr2) {
      cr cr1;
      if (!a(cr1 = null))
        cr.a(cr1); 
    } 
    ef.a(dw.a(em.i(300)));
    ef.a(dv.b(eu.c()));
    ef.a(o(), dk, true);
    d = dh.b(true, false);
  }
  
  public static synchronized void c() {
    if (j == null)
      return; 
    j.a();
    j = null;
  }
  
  public static synchronized void d() {
    m = false;
    c();
    if (i != null)
      i.a(); 
    h();
    i();
    try {
      db.a();
    } catch (Exception exception) {}
    fb.b();
  }
  
  public static synchronized boolean b(dm paramdm) {
    if (paramdm.getBooleanValue(8)) {
      a(paramdm.getStringValue(0));
      bi.a(paramdm);
      bi.i();
    } else {
      ei ei = new ei((er)paramdm, 2);
      try {
        a(ei);
      } catch (cr cr2) {
        cr cr1;
        cr.a(cr1 = null);
        if (cr1.a)
          return false; 
      } 
      ef.a(bb.a((short)543), ei, false);
    } 
    return true;
  }
  
  public final synchronized void a(String paramString, boolean paramBoolean) throws cr {
    if (!em.h(10)) {
      byte[] arrayOfByte1 = dh.a(paramString);
      int i = b.length + 1 + arrayOfByte1.length + 2;
      int j = 0;
      byte[] arrayOfByte2 = new byte[i];
      System.arraycopy(b, 0, arrayOfByte2, 0, b.length);
      j = 0 + b.length;
      dh.a(arrayOfByte2, j, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, ++j, arrayOfByte1.length);
      j += arrayOfByte1.length;
      dh.b(arrayOfByte2, j, paramBoolean ? 2 : 0);
      bj bj = new bj(4, 20, 0L, new byte[0], arrayOfByte2);
      i.a(bj);
    } 
  }
  
  public static synchronized boolean e() {
    return !q;
  }
  
  public static synchronized boolean f() {
    return q;
  }
  
  public static synchronized void g() {
    l = em.f(204);
    q = true;
    em.a(-3, "YES");
  }
  
  public static synchronized void h() {
    c = null;
    synchronized (h) {
      h.notify();
    } 
    q = false;
    Jimm.c();
    if (w != null)
      w.removeAllElements(); 
    if (r != null)
      r.removeAllElements(); 
  }
  
  public static synchronized void i() {
    k = null;
  }
  
  public final void run() {
    Thread thread = Thread.currentThread();
    bg bg = null;
    if (em.f(202) == 0) {
      i = new bm();
    } else if (em.f(202) == 1) {
      i = new dn();
    } else if (em.f(202) == 2) {
      i = new fg();
    } 
    w = new Vector();
    x = new bs();
    y = new ew(100);
    long l = (Integer.parseInt(em.d(103)) * 1000);
    Jimm.b().schedule(y, l, l);
    try {
      while (c == thread) {
        byte b;
        synchronized (this) {
          if (r.size() <= 0 || (w.size() == 1 && ((bg)w.elementAt(0)).b)) {
            bg = null;
          } else {
            if (r != null && r.size() != 0)
              bg = r.elementAt(0); 
            if ((w.size() > 0 && bg.b) || !bg.a()) {
              bg = null;
            } else if (r != null && r.size() != 0) {
              r.removeElementAt(0);
            } 
          } 
        } 
        if (bg == null && i.e() == 0) {
          try {
            synchronized (h) {
              h.wait();
            } 
          } catch (InterruptedException interruptedException) {}
        } else if (bg != null) {
          try {
            bg.b();
            w.addElement(bg);
          } catch (cr cr2) {
            cr cr1;
            if (!a(cr1 = null))
              cr.a(cr1); 
            if (cr1.a)
              throw cr1; 
          } 
        } 
        boolean bool1 = (k != null && k.b() > 0) ? true : false;
        boolean bool2 = (j != null && j.e() > 0) ? true : false;
        while (true) {
          if (i.e() > 0 || bool1 || bool2) {
            dd dd = null;
            try {
              if (i.e() > 0) {
                dd = i.f();
                v = System.currentTimeMillis();
              } else if (bool1) {
                dd = k.c();
              } else if (bool2) {
                dd = j.f();
              } 
            } catch (cr cr) {
              boolean bool3 = false;
              if ((0x1 & (!bool2 ? 1 : 0) & (!bool1 ? 1 : 0)) != 0) {
                if (!a(cr))
                  cr.a(cr); 
                if (cr.a)
                  throw cr; 
              } 
            } 
            boolean bool = false;
            for (byte b1 = 0; b1 < w.size(); b1++) {
              try {
                if (((bg)w.elementAt(b1)).a(dd)) {
                  bool = true;
                  break;
                } 
              } catch (cr cr2) {
                cr cr1;
                if (!a(cr1 = null))
                  cr.a(cr1); 
                if (cr1.a)
                  throw cr1; 
              } 
            } 
            if (!bool)
              try {
                x.a(dd);
              } catch (cr cr2) {
                cr cr1;
                if (!a(cr1 = null))
                  cr.a(cr1); 
                if (cr1.a)
                  throw cr1; 
              }  
            bool1 = (k != null && k.b() > 0) ? true : false;
            bool2 = (j != null && j.e() > 0) ? true : false;
            continue;
          } 
          b = 0;
          break;
        } 
        while (b < w.size()) {
          if (((bg)w.elementAt(b)).c() || ((bg)w.elementAt(b)).d())
            w.removeElementAt(b--); 
          b++;
        } 
      } 
    } catch (NullPointerException nullPointerException) {
    
    } catch (cr cr) {}
    if (!em.h(3)) {
      i.a();
      h();
      fb.b();
    } 
  }
  
  private static boolean b(int paramInt) {
    switch (paramInt) {
      case 110:
      case 111:
      case 112:
      case 117:
      case 122:
      case 127:
        return false;
    } 
    return true;
  }
  
  public static synchronized boolean a(cr paramcr) {
    int i = paramcr.d;
    if (l-- > 0 && em.h(3) && paramcr.a && m && b(i)) {
      d();
      bi.k();
      try {
        Thread.sleep(3000L);
      } catch (InterruptedException interruptedException) {}
      p();
      b();
      return true;
    } 
    return false;
  }
  
  public static int j() {
    return f() ? (int)em.i(300) : -1;
  }
  
  public static I k() {
    return f() ? dv.b(eu.c()) : null;
  }
  
  public static int l() {
    int i = 0;
    if (em.h(31)) {
      i = 0x0 | 0x10010000;
    } else {
      i = 0x0 | 0x10000000;
    } 
    if (em.h(33))
      i |= 0x10080000; 
    return i;
  }
  
  public static void m() {
    if (n) {
      boolean bool1 = em.h(31);
      boolean bool2 = em.h(32);
      byte[] arrayOfByte;
      dh.b(arrayOfByte = new byte[12], 0, 14860);
      dh.b(arrayOfByte, 2, 3075);
      dh.b(arrayOfByte, 4, 256);
      dh.a(arrayOfByte, 6, bool1 ? 1 : 0);
      dh.b(arrayOfByte, 7, 63490);
      dh.b(arrayOfByte, 9, 256);
      dh.a(arrayOfByte, 11, bool2 ? 0 : 1);
      dg dg = new dg(2L, 0, em.c(-1), 2000, new byte[0], arrayOfByte);
      try {
        i.a(dg);
        return;
      } catch (cr cr2) {
        cr cr1;
        cr.a(cr1 = null);
        if (cr1.a)
          return; 
      } 
    } 
  }
  
  public static void a(int paramInt) throws cr {
    em.a(300, paramInt);
    em.b(10);
    if (f()) {
      if (cy.c() == null) {
        byte b = 4;
        if (paramInt == 512)
          b = 2; 
        if (paramInt == 256)
          b = 3; 
        a(b);
      } 
      eu.a(l() | paramInt);
    } 
    bi.m();
    d = dh.b(true, false);
  }
  
  public static String n() {
    return d;
  }
  
  public static void a(byte paramByte) {
    if (f())
      try {
        eu.a(paramByte);
      } catch (cr cr) {
        cr.a(null);
      }  
    em.a(238, paramByte);
    em.b(11);
  }
  
  public class en implements Runnable {
    public int a = 0;
    
    private SocketConnection b;
    
    private InputStream c;
    
    private OutputStream d;
    
    private volatile boolean e;
    
    private volatile Thread f;
    
    private Vector g;
    
    private int f() {
      int i = this.a;
      this.a = ++this.a % 32768;
      return i;
    }
    
    public final synchronized void a(String param1String) throws cr {
      try {
        this.b = (SocketConnection)Connector.open("socket://" + param1String, 3);
        cl.a(0, "", "peer connect:", "" + param1String);
        this.c = this.b.openInputStream();
        this.d = this.b.openOutputStream();
        this.e = false;
        this.f = new Thread(this);
        if (em.f(257) != 5)
          this.f.setPriority(em.f(257)); 
        this.f.start();
        return;
      } catch (ConnectionNotFoundException connectionNotFoundException) {
        throw new cr((short)614, 126, 0, true, true);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new cr((short)615, 127, 0, true, true);
      } catch (IOException iOException) {
        throw new cr((short)613, 125, 0, true, true);
      } 
    }
    
    public final synchronized void a() {
      this.e = true;
      try {
        this.c.close();
      } catch (Exception exception) {
      
      } finally {
        this.c = null;
      } 
      try {
        this.d.close();
      } catch (Exception exception) {
      
      } finally {
        this.d = null;
      } 
      try {
        this.b.close();
      } catch (Exception exception) {
      
      } finally {
        this.b = null;
      } 
      Thread.yield();
    }
    
    public final synchronized int b() {
      return (this.g == null) ? 0 : this.g.size();
    }
    
    public final dd c() throws cr {
      byte[] arrayOfByte;
      synchronized (this.g) {
        if (this.g.size() == 0)
          return null; 
        arrayOfByte = this.g.elementAt(0);
        this.g.removeElementAt(0);
      } 
      return dd.a(arrayOfByte);
    }
    
    public final void a(dd param1dd) throws cr {
      if (this.d == null)
        throw new cr((short)616, 128, 0, true, true); 
      synchronized (this.d) {
        try {
          byte[] arrayOfByte = param1dd.a(f());
          this.d.write(arrayOfByte);
          this.d.flush();
          db.d(arrayOfByte.length + 51);
        } catch (IOException iOException) {
          a();
        } 
        return;
      } 
    }
    
    public final int d() {
      try {
        return this.b.getLocalPort();
      } catch (IOException iOException) {
        return 0;
      } 
    }
    
    public final byte[] e() {
      try {
        return dh.e(this.b.getLocalAddress());
      } catch (IOException iOException) {
        return new byte[4];
      } 
    }
    
    public final void run() {
      byte[] arrayOfByte = new byte[2];
      synchronized (this) {
        this.g = new Vector();
      } 
      try {
        while (!this.e) {
          int j = 0;
          if (em.f(201) == 1) {
            while (this.c.available() == 0)
              Thread.sleep(250L); 
            if (this.c == null)
              return; 
          } 
          int i;
          do {
          
          } while ((i = this.c.read(arrayOfByte, j, arrayOfByte.length - j)) != -1 && (j += i) < arrayOfByte.length);
          if (i == -1)
            return; 
          byte[] arrayOfByte1 = new byte[dh.a(arrayOfByte, 0, false)];
          j = 0;
          do {
          
          } while ((i = this.c.read(arrayOfByte1, j, arrayOfByte1.length - j)) != -1 && (j += i) < arrayOfByte1.length);
          if (i == -1)
            return; 
          db.b(j + 53);
          synchronized (this.g) {
            this.g.addElement(arrayOfByte1);
          } 
          synchronized (cd.h) {
            cd.h.notify();
          } 
        } 
        return;
      } catch (NullPointerException nullPointerException) {
        if (!this.e) {
          Object object = null;
          cr.a(new cr((short)613, 125, 3, true, true));
        } 
        return;
      } catch (InterruptedException interruptedException) {
        return;
      } catch (IOException iOException) {
        if (!this.e) {
          Object object = null;
          cr.a(new cr((short)613, 125, 1, true, true));
        } 
        return;
      } 
    }
  }
  
  public class fg extends ek implements Runnable {
    private final byte[] e = new byte[] { 5, 2, 0, 2 };
    
    private SocketConnection f;
    
    private InputStream g;
    
    private OutputStream h;
    
    private boolean i = false;
    
    private int j;
    
    private synchronized String a(String param1String1, String param1String2) {
      if (dh.f(param1String1))
        return param1String1; 
      try {
        SocketConnection socketConnection = (SocketConnection)Connector.open("socket://" + param1String1 + ":" + param1String2, 3);
        cl.a(0, "", "connect to host:", "" + param1String1 + ":" + param1String2);
        String str = socketConnection.getAddress();
        try {
          socketConnection.close();
        } catch (Exception exception) {
        
        } finally {}
        return str;
      } catch (Exception exception) {
        return "0.0.0.0";
      } 
    }
    
    private byte[] a(byte param1Byte, String param1String1, String param1String2) {
      byte[] arrayOfByte1;
      byte b;
      if (param1Byte == 5) {
        b = 7 + param1String1.length();
        arrayOfByte1 = dh.a(param1String1);
      } else {
        b = 9;
        Object object = null;
        arrayOfByte1 = dh.e(a(param1String1, param1String2));
      } 
      byte[] arrayOfByte2;
      (arrayOfByte2 = new byte[b])[0] = param1Byte;
      arrayOfByte2[1] = 1;
      if (param1Byte == 5) {
        arrayOfByte2[2] = 0;
        arrayOfByte2[3] = 3;
        dh.a(arrayOfByte2, 4, arrayOfByte1.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 5, arrayOfByte1.length);
        dh.b(arrayOfByte2, 5 + arrayOfByte1.length, Integer.parseInt(param1String2));
      } else {
        dh.b(arrayOfByte2, 2, Integer.parseInt(param1String2));
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 4, arrayOfByte1.length);
        arrayOfByte2[8] = 0;
      } 
      return arrayOfByte2;
    }
    
    private static byte[] b(String param1String1, String param1String2) {
      byte[] arrayOfByte1;
      dh.a(arrayOfByte1 = new byte[3 + param1String1.length() + param1String2.length()], 0, 1);
      dh.a(arrayOfByte1, 1, param1String1.length());
      dh.a(arrayOfByte1, param1String1.length() + 2, param1String2.length());
      byte[] arrayOfByte2 = dh.a(param1String1);
      byte[] arrayOfByte3 = dh.a(param1String2);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 2, arrayOfByte2.length);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte1, arrayOfByte2.length + 3, arrayOfByte3.length);
      return arrayOfByte1;
    }
    
    public final synchronized void a(String param1String, boolean param1Boolean) throws cr {
      int i = em.f(221);
      this.i = false;
      String str1 = "";
      String str2 = "";
      if (i != 0) {
        byte b1 = 0;
        for (byte b2 = 0; b2 < param1String.length(); b2++) {
          if (param1String.charAt(b2) == ':') {
            b1 = b2;
            break;
          } 
        } 
        str1 = param1String.substring(0, b1);
        str2 = param1String.substring(b1 + 1);
      } 
      try {
        switch (i) {
          case 0:
            b((byte)4, str1, str2);
            break;
          case 1:
            b((byte)5, str1, str2);
            break;
          case 2:
            try {
              b((byte)5, str1, str2);
            } catch (Exception exception) {}
            if (!this.i) {
              g();
              try {
                Thread.sleep(2000L);
              } catch (InterruptedException interruptedException) {}
              b((byte)4, str1, str2);
            } 
            break;
        } 
        this.b = false;
        this.c = new Thread(this);
        if (em.f(257) != 5)
          this.c.setPriority(em.f(257)); 
        this.c.start();
        (new Random(System.currentTimeMillis())).nextInt();
        this.a = cd.a(param1Boolean);
        this.j = 2;
        return;
      } catch (cr cr) {
        throw null;
      } 
    }
    
    private synchronized void b(byte param1Byte, String param1String1, String param1String2) throws cr {
      String str1 = em.d(138);
      String str2 = em.d(139);
      String str3 = em.d(141);
      String str4 = em.d(142);
      byte b = 0;
      int i = 0;
      int j = 0;
      try {
        this.f = (SocketConnection)Connector.open("socket://" + str1 + ":" + str2, 3);
        cl.a(0, "", "connect to proxy:", "" + str1 + ":" + str2);
        this.g = this.f.openInputStream();
        this.h = this.f.openOutputStream();
        if (param1Byte == 5) {
          this.h.write(this.e);
          this.h.flush();
          while (this.g.available() == 0 && b < 50) {
            try {
              b++;
              Thread.sleep(100L);
            } catch (InterruptedException interruptedException) {}
          } 
          if (this.g.available() == 0)
            throw new cr((short)606, 118, 226); 
          i = this.g.read();
          j = this.g.read();
          if (i == 5 && j == 2) {
            this.h.write(b(str3, str4));
            this.h.flush();
            while (this.g.available() == 0 && b < 50) {
              try {
                b++;
                Thread.sleep(100L);
              } catch (InterruptedException interruptedException) {}
            } 
            if (this.g.available() == 0)
              throw new cr((short)606, 118, 227); 
            this.g.read();
            if ((j = this.g.read()) != 0)
              throw new cr((short)657, 227, j); 
          } else if (i != 5 || j != 0) {
            throw new cr((short)656, 226, 0);
          } 
        } 
        this.h.write(a(param1Byte, param1String1, param1String2));
        this.h.flush();
        while (this.g.available() == 0 && b < 50) {
          try {
            b++;
            Thread.sleep(100L);
          } catch (InterruptedException interruptedException) {}
        } 
        if (this.g.available() == 0)
          throw new cr((short)606, 118, 226); 
        i = this.g.read();
        j = this.g.read();
        if (i == 5) {
          byte[] arrayOfByte;
          switch (j) {
            case 0:
              this.g.read();
              if (this.g.read() == 1) {
                byte[] arrayOfByte1 = new byte[6];
                this.g.read(arrayOfByte1);
                break;
              } 
              arrayOfByte = new byte[this.g.read() + 2];
              this.g.read(arrayOfByte);
              break;
            default:
              throw new cr((short)656, 226, j);
          } 
        } else {
          byte[] arrayOfByte;
          switch (j) {
            case 90:
              arrayOfByte = new byte[6];
              this.g.read(arrayOfByte);
              break;
            default:
              throw new cr((short)656, 226, j);
          } 
        } 
        this.i = true;
        return;
      } catch (ConnectionNotFoundException connectionNotFoundException) {
        throw new cr((short)609, 121, 226);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new cr((short)610, 122, 226);
      } catch (IOException iOException) {
        throw new cr((short)608, 120, 226);
      } 
    }
    
    public final synchronized void a() {
      this.b = true;
      g();
      Thread.yield();
    }
    
    private synchronized void g() {
      try {
        this.g.close();
      } catch (Exception exception) {
      
      } finally {
        this.g = null;
      } 
      try {
        this.h.close();
      } catch (Exception exception) {
      
      } finally {
        this.h = null;
      } 
      try {
        this.f.close();
        return;
      } catch (Exception exception) {
        return;
      } finally {
        this.f = null;
      } 
    }
    
    public final void a(dd param1dd) throws cr {
      cr cr;
      if (this.h == null && !cd.a(cr = new cr((short)611, 123, 0)))
        throw cr; 
      synchronized (this.h) {
        if (param1dd instanceof dg)
          ((dg)param1dd).i = this.j++; 
        try {
          byte[] arrayOfByte = param1dd.a(d());
          this.h.write(arrayOfByte);
          this.h.flush();
          db.d(arrayOfByte.length + 51);
        } catch (IOException iOException) {
          a();
        } 
        return;
      } 
    }
    
    public final int b() {
      try {
        return this.f.getLocalPort();
      } catch (IOException iOException) {
        return 0;
      } 
    }
    
    public final byte[] c() {
      try {
        return dh.e(this.f.getLocalAddress());
      } catch (IOException iOException) {
        return new byte[4];
      } 
    }
    
    public final void run() {
      byte[] arrayOfByte = new byte[6];
      synchronized (this) {
        this.d = new Vector();
      } 
      try {
        while (!this.b) {
          int j = 0;
          if (em.f(201) == 1) {
            while (this.g.available() == 0)
              Thread.sleep(250L); 
            if (this.g == null)
              return; 
          } 
          int i;
          do {
          
          } while ((i = this.g.read(arrayOfByte, j, arrayOfByte.length - j)) != -1 && (j += i) < arrayOfByte.length);
          if (i == -1)
            return; 
          if (dh.a(arrayOfByte, 0) != 42)
            throw new cr((short)612, 124, 0); 
          byte[] arrayOfByte1 = new byte[dh.c(arrayOfByte, 4)];
          j = 0;
          do {
          
          } while ((i = this.g.read(arrayOfByte1, j, arrayOfByte1.length - j)) != -1 && (j += i) < arrayOfByte1.length);
          if (i == -1)
            return; 
          byte[] arrayOfByte2 = new byte[arrayOfByte.length + arrayOfByte1.length];
          System.arraycopy(arrayOfByte, 0, arrayOfByte2, 0, arrayOfByte.length);
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, arrayOfByte.length, arrayOfByte1.length);
          db.b(j + 57);
          synchronized (this.d) {
            this.d.addElement(arrayOfByte2);
          } 
          synchronized (cd.h) {
            cd.h.notify();
          } 
        } 
        return;
      } catch (NullPointerException nullPointerException) {
        if (!this.b) {
          Object object = null;
          cr.a(new cr((short)608, 120, 3));
        } 
        this.b = false;
        return;
      } catch (InterruptedException interruptedException) {
        return;
      } catch (cr cr) {
        cr.a(null);
        return;
      } catch (IOException iOException) {
        if (!this.b) {
          Object object = null;
          cr.a(new cr((short)608, 120, 1));
        } 
        this.b = false;
        return;
      } 
    }
  }
  
  public class dn extends ek implements Runnable {
    private HttpConnection e;
    
    private HttpConnection f;
    
    private InputStream g;
    
    private OutputStream h;
    
    private String i = "http://http.proxy.icq.com/hello";
    
    private int j = 0;
    
    private String k;
    
    private String l;
    
    private int m;
    
    private int n = 0;
    
    public final synchronized void a(String param1String, boolean param1Boolean) throws cr {
      try {
        this.n++;
        if (this.n == 1) {
          this.b = false;
          this.c = new Thread(this);
          this.c.start();
          if (em.f(257) != 5)
            this.c.setPriority(em.f(257)); 
          wait();
        } 
        String str = param1String.substring(0, param1String.indexOf(":"));
        int i = Integer.parseInt(param1String.substring(param1String.indexOf(":") + 1));
        byte[] arrayOfByte;
        dh.b(arrayOfByte = new byte[str.length() + 4], 0, str.length());
        System.arraycopy(dh.a(str), 0, arrayOfByte, 2, str.length());
        dh.b(arrayOfByte, 2 + str.length(), i);
        a(null, arrayOfByte, 3, this.n);
        if (this.n != 1) {
          eq eq = new eq();
          a(eq, null, 5, this.n - 1);
          a(null, new byte[0], 6, this.n - 1);
        } 
        return;
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new cr((short)615, 127, 0);
      } catch (InterruptedException interruptedException) {
        return;
      } 
    }
    
    public final synchronized void a() {
      this.b = true;
      try {
        this.g.close();
      } catch (Exception exception) {
      
      } finally {
        this.g = null;
      } 
      try {
        this.h.close();
      } catch (Exception exception) {
      
      } finally {
        this.h = null;
      } 
      try {
        this.e.close();
        this.f.close();
      } catch (Exception exception) {
      
      } finally {
        this.e = null;
        this.f = null;
      } 
      Thread.yield();
    }
    
    private void a(dd param1dd, byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws cr {
      try {
        this.f = (HttpConnection)Connector.open("http://" + this.l + ":" + this.m + "/data?sid=" + this.k + "&seq=" + this.j, 3);
        this.f.setRequestProperty("User-Agent", em.d(104));
        this.f.setRequestProperty("x-wap-profile", em.d(105));
        this.f.setRequestProperty("Cache-Control", "no-store no-cache");
        this.f.setRequestProperty("Pragma", "no-cache");
        this.f.setRequestMethod("POST");
        this.h = this.f.openOutputStream();
      } catch (IOException iOException) {
        a();
      } 
      if (this.h == null)
        throw new cr((short)616, 128, 0, true); 
      synchronized (this.h) {
        try {
          if (param1ArrayOfbyte == null) {
            param1ArrayOfbyte = param1dd.a(d());
            Object object = null;
          } 
          byte[] arrayOfByte;
          dh.b(arrayOfByte = new byte[14 + param1ArrayOfbyte.length], 0, param1ArrayOfbyte.length + 12);
          dh.b(arrayOfByte, 2, 1091);
          dh.b(arrayOfByte, 4, param1Int1);
          dh.a(arrayOfByte, 6, 0L);
          dh.a(arrayOfByte, 10, param1Int2);
          System.arraycopy(param1ArrayOfbyte, 0, arrayOfByte, 14, param1ArrayOfbyte.length);
          this.h.write(arrayOfByte);
          if (this.f.getResponseCode() != 200) {
            a();
          } else {
            this.j++;
          } 
          try {
            this.h.close();
            this.f.close();
          } catch (Exception exception) {
          
          } finally {
            this.h = null;
            this.f = null;
          } 
          db.d(arrayOfByte.length + 40 + 190 + 14 + 170);
        } catch (IOException iOException) {
          a();
        } 
        return;
      } 
    }
    
    public final void a(dd param1dd) throws cr {
      a(param1dd, null, 5, this.n);
    }
    
    public final void run() {
      byte[] arrayOfByte1 = new byte[2];
      byte[] arrayOfByte2 = new byte[0];
      int i = 0;
      int j = 0;
      synchronized (this) {
        this.d = new Vector();
      } 
      try {
        while (!this.b) {
          this.e = (HttpConnection)Connector.open(this.i, 3);
          this.e.setRequestProperty("User-Agent", em.d(104));
          this.e.setRequestProperty("x-wap-profile", em.d(105));
          this.e.setRequestProperty("Cache-Control", "no-store no-cache");
          this.e.setRequestProperty("Pragma", "no-cache");
          this.e.setRequestMethod("GET");
          this.g = this.e.openInputStream();
          if (this.e.getResponseCode() != 200)
            throw new IOException(); 
          j = 0;
          do {
            int m = 0;
            int k;
            while ((k = this.g.read(arrayOfByte1, m, arrayOfByte1.length - m)) != -1) {
              m += k;
              j += k;
              if (m >= arrayOfByte1.length)
                break; 
            } 
            if (k == -1)
              break; 
            byte[] arrayOfByte = new byte[dh.c(arrayOfByte1, 0)];
            m = 0;
            while ((k = this.g.read(arrayOfByte, m, arrayOfByte.length - m)) != -1) {
              m += k;
              j += k;
              if (m >= arrayOfByte.length)
                break; 
            } 
            if (k == -1)
              break; 
            if (dh.c(arrayOfByte, 2) == 5) {
              int n = 12;
              while (n < arrayOfByte.length) {
                if (!i) {
                  if (dh.a(arrayOfByte, n) != 42)
                    throw new cr((short)612, 124, 0); 
                  arrayOfByte2 = new byte[dh.c(arrayOfByte, n + 4) + 6];
                } 
                if (arrayOfByte.length - n >= arrayOfByte2.length - i) {
                  System.arraycopy(arrayOfByte, n, arrayOfByte2, i, arrayOfByte2.length - i);
                  n += arrayOfByte2.length - i;
                  i = arrayOfByte2.length;
                } else {
                  System.arraycopy(arrayOfByte, n, arrayOfByte2, i, arrayOfByte.length - n);
                  i += arrayOfByte.length - n;
                  n += arrayOfByte.length - n;
                } 
                if (i == arrayOfByte2.length) {
                  synchronized (this.d) {
                    this.d.addElement(arrayOfByte2);
                  } 
                  i = 0;
                } 
              } 
              synchronized (cd.h) {
                cd.h.notify();
              } 
            } else if (dh.c(arrayOfByte, 2) == 7) {
              if (dh.c(arrayOfByte, 10) == this.n)
                throw new cr((short)655, 221, 0); 
            } else if (dh.c(arrayOfByte, 2) == 2) {
              synchronized (this) {
                byte[] arrayOfByte3 = new byte[16];
                System.arraycopy(arrayOfByte, 10, arrayOfByte3, 0, 16);
                this.k = dh.c(arrayOfByte3);
                byte[] arrayOfByte4 = new byte[dh.c(arrayOfByte, 26)];
                System.arraycopy(arrayOfByte, 28, arrayOfByte4, 0, arrayOfByte4.length);
                this.l = dh.a(arrayOfByte4);
                this.m = dh.c(arrayOfByte, 28 + arrayOfByte4.length);
                this.i = "http://" + this.l + ":" + this.m + "/monitor?sid=" + this.k;
                notify();
              } 
            } 
          } while (j < this.e.getLength());
          db.b(j + 42 + 185 + 175);
          try {
            this.g.close();
            this.e.close();
          } catch (Exception exception) {
          
          } finally {
            this.g = null;
            this.e = null;
          } 
        } 
        return;
      } catch (NullPointerException nullPointerException) {
        if (!this.b)
          cr.a(new cr((short)613, 125, 3)); 
        return;
      } catch (cr cr) {
        cr.a(null);
        return;
      } catch (IOException iOException) {
        if (!this.b)
          cr.a(new cr((short)613, 125, 1)); 
        return;
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */