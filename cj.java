import i.C;
import i.I;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Command;

public final class cj {
  public static final Command a = new cc(bb.a((short)211), 8, 1, 49);
  
  public static final Command b = new cc(bb.a((short)211), 8, 10, bi.b.a(7), 49);
  
  public static Hashtable c = new Hashtable();
  
  private static int e = 1;
  
  private static I f = null;
  
  public static eo d;
  
  public static synchronized void a(dm paramdm, ej paramej, boolean paramBoolean) {
    String str = paramdm.getUinString();
    if (!c.containsKey(str))
      a(paramdm, paramdm.o); 
    eo eo1 = (eo)c.get(str);
    boolean bool1 = paramej.f;
    boolean bool2 = em.h(19);
    boolean bool3 = eo1.a();
    if (paramej instanceof ce) {
      ce ce = (ce)paramej;
      f = bool2 ? bi.b.a(14) : null;
      if (!bool3)
        paramdm.f(1); 
      a(str, paramdm.o, ce.a, "", ce.i, true, bool1, f, 0L, true);
      if (paramBoolean)
        ea.a(str, ce.a, (byte)0, paramdm.o, ce.i); 
      if (!bool1) {
        dw.a(str, paramdm.o, ce.a);
        dw.a(dw.m(), paramdm, ce.a);
      } 
      db.b++;
    } else if (paramej instanceof bp) {
      bp bp = (bp)paramej;
      f = bool2 ? bi.b.a(14) : null;
      if (!eo1.a())
        paramdm.f(2); 
      if (!em.h(87))
        a(str, paramdm.o, bp.b, bp.a, bp.i, false, bool1, f, 0L, true); 
    } else if (paramej instanceof bt) {
      String str1 = "";
      bt bt = (bt)paramej;
      if (!bool3)
        paramdm.f(3); 
      if (bt.a == 1) {
        f = bool2 ? bi.b.a(17) : null;
        str1 = bb.a((short)555) + bt.g;
      } else if (bt.a == 6) {
        f = bool2 ? bi.b.a(17) : null;
        str1 = bb.a((short)769) + bt.c + bb.a((short)770);
      } else if (bt.a == 3) {
        paramdm.f(4);
        f = bool2 ? bi.b.a(16) : null;
        str1 = bt.g + bb.a((short)546) + bt.c;
      } else if (bt.a == 2) {
        if (bt.b) {
          paramdm.a(2, false);
          f = bool2 ? bi.b.a(17) : null;
          str1 = bb.a((short)270) + bt.g;
        } else if (bt.c != null) {
          f = bool2 ? bi.b.a(16) : null;
          str1 = bb.a((short)207) + bt.g + ". " + bb.a((short)397) + ": " + bt.c;
        } else {
          f = bool2 ? bi.b.a(16) : null;
          str1 = bb.a((short)207) + bt.g + ". " + bb.a((short)355);
        } 
      } 
      a(str, bb.a((short)481), str1, "", bt.i, false, bool1, f, 0L, true);
      cl.a(0, str, str1);
      bi.b(str, 5);
    } 
    eo1.c();
    eo1.d();
  }
  
  public static synchronized void a(String paramString, long paramLong, boolean paramBoolean) {
    if (c.containsKey(paramString)) {
      byte b;
      if ((b = paramBoolean ? 21 : 20) >= bi.b.a())
        return; 
      I i = bi.b.a(b);
      boolean bool = (paramBoolean || !em.h(20)) ? true : false;
      ((eo)c.get(paramString)).a(paramLong, i, bool);
    } 
  }
  
  public static synchronized void a(C paramC, String paramString1, long paramLong1, String paramString2, long paramLong2, String paramString3, boolean paramBoolean) {
    String str = paramC.getUinString();
    if (!c.containsKey(str))
      a(paramC, paramString2); 
    f = em.h(19) ? bi.b.a(14) : null;
    if (paramString3 == null)
      paramString3 = cd.a; 
    a(str, paramString3, paramString1, "", paramLong1, false, false, f, paramLong2, paramBoolean);
    db.c++;
  }
  
  public static synchronized void a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, boolean paramBoolean1, boolean paramBoolean2, I paramI, long paramLong2, boolean paramBoolean3) {
    eo eo1;
    if (c != null && (eo1 = (eo)c.get(paramString1)) != null)
      eo1.a(paramString2, paramString3, paramString4, paramLong1, paramBoolean1, paramBoolean2, paramI, paramLong2, paramBoolean3); 
  }
  
  public static synchronized be a(String paramString) {
    eo eo1;
    return (c != null && (eo1 = (eo)c.get(paramString)) != null) ? eo1.a : null;
  }
  
  private static ey j(String paramString) {
    eo eo1;
    int i;
    return ((i = (eo1 = d(paramString)).a.A()) == -1) ? null : eo1.d.elementAt(i);
  }
  
  public static String b(String paramString) {
    return (d(paramString)).a.a(j(paramString).b(), false);
  }
  
  public static String[] c(String paramString) {
    try {
      int i = j(paramString).b();
      String str = (d(paramString)).a.a(0, false);
      return new String[] { str.substring(0, i), str.substring(i) };
    } catch (Exception exception) {
      return new String[2];
    } 
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean) {
    eo eo1;
    int i;
    if ((i = (eo1 = d(paramString1)).a.A()) == -1)
      return; 
    ey ey = eo1.d.elementAt(i);
    if (paramString1.length() < 6) {
      String[] arrayOfString = c(paramString1);
      dw.a(ey.a(), "", arrayOfString[0], arrayOfString[1], paramBoolean);
      return;
    } 
    dw.a(ey.a(), dh.a(true, true, ey.a), ey.a() ? paramString2 : cd.a, b(paramString1), paramBoolean);
  }
  
  public static eo d(String paramString) {
    return c.containsKey(paramString) ? (eo)c.get(paramString) : null;
  }
  
  public static void e(String paramString) {
    dm dm = bi.a(paramString);
    c.remove(paramString);
    dm.a(16, false);
    dm.a(67, 0);
    dm.a(68, 0);
    dm.a(69, 0);
    dm.a(70, 0);
  }
  
  public static void a(String paramString, int paramInt) {
    Enumeration enumeration;
    switch (paramInt) {
      case 1:
        e(paramString);
        return;
      case 2:
      case 3:
        enumeration = c.keys();
        while (enumeration.hasMoreElements()) {
          String str = enumeration.nextElement();
          if (paramInt == 2 && str.equals(paramString))
            continue; 
          e(str);
        } 
        break;
    } 
  }
  
  public static boolean f(String paramString) {
    return c.containsKey(paramString) ? ((eo)c.get(paramString)).a() : false;
  }
  
  public static boolean g(String paramString) {
    return c.containsKey(paramString);
  }
  
  public static void a(C paramC, String paramString) {
    dm dm = (dm)paramC;
    eo eo1 = new eo(paramString, dm);
    String str = dm.getUinString();
    c.put(str, eo1);
    h(str);
    dm.a(16, true);
    a(dm);
    dm.q();
  }
  
  public static void a(dm paramdm) {
    String str1 = paramdm.o;
    String str2 = paramdm.getUinString();
    if (em.h(18)) {
      int i;
      if ((i = ea.a(str2)) == 0)
        return; 
      if (!g(str2))
        a(paramdm, str1); 
      eo eo1;
      if ((eo1 = (eo)c.get(str2)).a.c() != 0)
        return; 
      byte b = (i > 5) ? 5 : i;
      for (int j = i - b; j < i; j++) {
        bh bh = ea.a(str2, j);
        eo1.a.a("[" + bh.d + " " + bh.c + "]", eo.a((bh.e == 0)), 0, -1);
        eo1.a.x(-1);
        dy.a(eo1.a, bh.b, 0, 8421504, -1);
        eo1.a.x(-1);
      } 
    } 
  }
  
  public static void a(String paramString1, String paramString2) {
    eo eo1;
    if ((eo1 = (eo)c.get(paramString1)) == null)
      return; 
    eo1.b = paramString2;
    h(paramString1);
  }
  
  public static void h(String paramString) {
    i(paramString);
    eo eo1 = (eo)c.get(paramString);
    String str = eo1.b + " (" + e + "/" + c.size() + ")";
    eo1.a.a_(str);
  }
  
  public static void i(String paramString) {
    if (paramString == null)
      return; 
    Enumeration enumeration = c.elements();
    Object object = c.get(paramString);
    e = 1;
    while (enumeration.hasMoreElements()) {
      if (enumeration.nextElement() == object)
        return; 
      e++;
    } 
  }
  
  public static boolean b(dm paramdm) {
    if (paramdm == null)
      return false; 
    eo eo1;
    if ((eo1 = d(paramdm.getUinString())) != null) {
      eo1.a(paramdm);
      eo1.f();
    } 
    return (eo1 != null);
  }
  
  public static void c(dm paramdm) {
    if (paramdm == null)
      return; 
    eo eo1;
    if ((eo1 = d(paramdm.getUinString())) != null)
      eo1.b(); 
  }
  
  public static bd a() {
    return (d == null) ? null : d.a;
  }
  
  public static dm b() {
    return (d == null) ? null : d.c;
  }
  
  static {
    fd.a();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */