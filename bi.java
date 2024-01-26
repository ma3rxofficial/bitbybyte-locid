import i.C;
import i.I;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;
import jimm.Jimm;

public final class bi implements CommandListener, bo, bx, PlayerListener {
  private static boolean s = false;
  
  private static String t;
  
  private static bi u;
  
  private static Command v;
  
  private static int w = -1;
  
  private static int x = 0;
  
  private static boolean y;
  
  private static Vector z;
  
  private static Vector A;
  
  private static boolean B = false;
  
  private static boolean C;
  
  private static Hashtable D = new Hashtable();
  
  public static co a;
  
  public static df b;
  
  public static df c;
  
  public static df d;
  
  public static df e;
  
  public static df f;
  
  public static df g;
  
  public static df h;
  
  public static df i;
  
  public static df j;
  
  public static df k;
  
  public static df l;
  
  private static int E;
  
  private static int F;
  
  public static dm[] m;
  
  public static bu[] n;
  
  public static String o;
  
  public static dm p;
  
  private static int G;
  
  private static Player H;
  
  public static dm q;
  
  public static boolean r;
  
  public static df a(int paramInt) {
    switch (paramInt) {
      case 0:
        return b;
      case 1:
        return d;
      case 2:
        return e;
      case 3:
        return f;
      case 4:
        return g;
      case 5:
        return h;
      case 6:
        return i;
      case 7:
        return j;
      case 8:
        return dv.d();
      case 9:
        return l;
      case 99:
        return k;
    } 
    return null;
  }
  
  private static void v() {
    b = df.a("/icons.png", true);
    c = df.a("/plugins.png", true);
    d = df.a("/micons.png", true);
    e = df.a("/clicons.png", true);
    f = df.a("/prlists.png");
    g = df.a("/bday.png", true);
    h = df.a("/happy.png", true);
    i = df.a("/auth.png");
    j = df.a("/pstatus.png", true);
    k = df.a("/new.png", true);
    l = df.a("/vibrate.png", true);
  }
  
  public bi() {
    u = this;
    try {
      x();
    } catch (Exception exception) {
      y = false;
      o = null;
      z = new Vector();
      A = new Vector();
      n = null;
    } 
    dm.a = 0;
    n();
    a = new co(null, false);
    a.a(true);
    a.af = this;
    a.p = this;
    a.a(b);
    a.t(0);
    a.z = em.f(236) + 1;
    e(db.d());
    if (!em.h(72)) {
      a.a(v, bd.aa);
      a.a(dw.q, bd.Z);
    } 
    a.a(this);
  }
  
  private static void w() {
    ((cc)cy.g).a = cy.a();
    a.y();
    a.a(dw.p, bd.Z);
    a.a(dw.q, bd.aa);
    if (cd.f()) {
      a.a(cy.f, bd.ab);
      a.a(cy.c, bd.ab);
      a.a(cj.b, bd.ab);
    } else {
      a.a(cy.b, bd.ab);
    } 
    a.a(cy.g, bd.ab);
    a.a(cy.l, bd.ab);
    if (!Jimm.i && !Jimm.j)
      a.a(cy.n, bd.ab); 
    a.a(em.h(43) ? cy.j : cy.i, bd.ab);
    a.a(cy.d, bd.ab);
    a.a(cy.p, bd.ab);
    if (cd.f()) {
      a.a(cy.o, bd.ab);
      a.a(cy.h, bd.ab);
    } 
    a.a(cy.e, bd.ab);
    a.a(cy.k, bd.ab);
    if (Jimm.i)
      a.a(cy.m, bd.ab); 
    if (cd.e())
      a.a(cy.r, bd.ab); 
    a.a(cy.q, bd.ab);
  }
  
  public final int a(cx paramcx1, cx paramcx2) {
    int i;
    int j;
    Object object1 = paramcx1.a;
    Object object2 = paramcx2.a;
    er er1 = (er)object1;
    er er2 = (er)object2;
    boolean bool = false;
    switch (F) {
      case 0:
      
      case 1:
      case 2:
      case 3:
        i = er1.getSortWeight(F);
        j = er2.getSortWeight(F);
        bool = (i == j) ? er1.i().compareTo(er2.i()) : ((i < j) ? true : true);
        break;
    } 
    return bool;
  }
  
  public static bd a() {
    return a;
  }
  
  public static df b() {
    return b;
  }
  
  public static int c() {
    return w;
  }
  
  public static int d() {
    return x;
  }
  
  public static int e() {
    return z.size();
  }
  
  public static dm b(int paramInt) {
    return z.elementAt(paramInt);
  }
  
  public static synchronized dm[] f() {
    if (o != null && m != null && m.length == z.size())
      return m; 
    dm[] arrayOfDm = new dm[z.size()];
    z.copyInto((Object[])arrayOfDm);
    return m = arrayOfDm;
  }
  
  public static synchronized er[] g() {
    Vector vector;
    dm[] arrayOfDm = new dm[(vector = a.ae.b).size()];
    for (byte b = 0; b < vector.size(); b++) {
      dm dm1;
      if (dm1 = (dm)vector.elementAt(b) instanceof dm) {
        arrayOfDm[b] = dm1;
      } else if (dm1 instanceof bu) {
        arrayOfDm[b] = dm1;
      } 
    } 
    return (er[])arrayOfDm;
  }
  
  public static synchronized bu[] h() {
    if (o != null && n != null && n.length == A.size())
      return n; 
    bu[] arrayOfBu = new bu[A.size()];
    A.copyInto((Object[])arrayOfBu);
    return n = arrayOfBu;
  }
  
  public static void a(Alert paramAlert) {
    if (em.h(72))
      w(); 
    a.a(Jimm.d, paramAlert);
    t();
  }
  
  public static void i() {
    a.y();
    if (em.h(72)) {
      a.a(dw.p, bd.Z);
      a.a(dw.q, bd.aa);
    } else {
      a.a(v, bd.aa);
      a.a(dw.q, bd.Z);
    } 
    if (em.h(22))
      dw.i(); 
    a.a(b.a(dw.a(cd.j())));
    a.b(cd.k());
    a.c(cy.c());
    a.d(h.a(em.h(33) ? 0 : -1));
    a.e(cy.b(em.h(43)));
    a.f(cy.a(em.f(211)));
    a.c(em.f(239) * 8);
    if (em.h(72))
      w(); 
    e(db.d());
    a.q();
    z();
    y();
    a.s();
    a.u = true;
    dw.a(a);
    a.b(Jimm.d);
    if (s) {
      s = false;
      b(t, 1);
      if (Jimm.l)
        cz.a(); 
    } 
  }
  
  public static void a(boolean paramBoolean) {
    if (paramBoolean)
      B = false; 
  }
  
  private static void x() throws Exception, IOException, RecordStoreException {
    o = null;
    z = new Vector();
    A = new Vector();
    dm.a = 0;
    n = null;
    m = null;
    String[] arrayOfString = RecordStore.listRecordStores();
    boolean bool = false;
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].equals("contactlist")) {
        bool = true;
        break;
      } 
    } 
    if (!bool)
      throw new Exception(); 
    RecordStore recordStore = RecordStore.openRecordStore("contactlist", false);
    try {
      byte[] arrayOfByte = recordStore.getRecord(1);
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      DataInputStream dataInputStream = null;
      if (!(new DataInputStream(byteArrayInputStream)).readUTF().equals(Jimm.b))
        throw new IOException(); 
      arrayOfByte = recordStore.getRecord(2);
      byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      w = (dataInputStream = new DataInputStream(byteArrayInputStream)).readInt();
      x = dataInputStream.readUnsignedShort();
      byte b1 = 3;
      o = null;
      n = null;
      m = null;
      while (b1 <= recordStore.getNumRecords()) {
        arrayOfByte = recordStore.getRecord(b1++);
        byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        dataInputStream = new DataInputStream(byteArrayInputStream);
        while (dataInputStream.available() > 0) {
          byte b2;
          if ((b2 = dataInputStream.readByte()) == 0) {
            dm dm1;
            (dm1 = new dm()).a(dataInputStream, 0);
            z.addElement(dm1);
            continue;
          } 
          if (b2 == 1) {
            bu bu1;
            (bu1 = new bu()).a(dataInputStream);
            A.addElement(bu1);
            continue;
          } 
          if (b2 == 2) {
            dm dm1;
            (dm1 = new dm()).a(dataInputStream, 1);
            z.addElement(dm1);
          } 
        } 
      } 
      return;
    } finally {
      recordStore.closeRecordStore();
    } 
  }
  
  public static void j() throws IOException, RecordStoreException {
    try {
      RecordStore.deleteRecordStore("contactlist");
    } catch (RecordStoreNotFoundException recordStoreNotFoundException) {}
    RecordStore recordStore = RecordStore.openRecordStore("contactlist", true);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream;
    (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeUTF(Jimm.b);
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
    byteArrayOutputStream.reset();
    dataOutputStream.writeInt(w);
    dataOutputStream.writeShort((short)x);
    arrayOfByte = byteArrayOutputStream.toByteArray();
    recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
    byteArrayOutputStream.reset();
    int i;
    int j = (i = z.size()) + A.size();
    for (byte b = 0; b < j; b++) {
      if (b < i) {
        b(b).a(dataOutputStream);
      } else {
        ((bu)A.elementAt(b - i)).a(dataOutputStream);
      } 
      if (byteArrayOutputStream.size() >= 4000 || b == j - 1) {
        arrayOfByte = byteArrayOutputStream.toByteArray();
        recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
        byteArrayOutputStream.reset();
      } 
    } 
    recordStore.closeRecordStore();
  }
  
  public static void k() {
    B = false;
    y = true;
    C = true;
    a.A();
    l();
  }
  
  public static void l() {
    E = 0;
    int i;
    for (i = z.size() - 1; i >= 0; i--)
      b(i).o(); 
    for (i = A.size() - 1; i >= 0; i--)
      ((bu)A.elementAt(i)).a(0, 0); 
    B = false;
  }
  
  public static void m() {
    long l = em.i(300);
    for (int i = z.size() - 1; i >= 0; i--) {
      dm dm1 = b(i);
      if (l == 4L || l == 16L || l == 2L || l == 1L) {
        dm1.q = false;
      } else {
        dm1.q = true;
      } 
    } 
  }
  
  public static synchronized void a(int paramInt1, int paramInt2, er[] paramArrayOfer) {
    Hashtable hashtable = new Hashtable();
    int i;
    for (i = 0; i < z.size(); i++) {
      dm dm1;
      if ((dm1 = z.elementAt(i)).i != null)
        hashtable.put(dm1.getUinString(), dm1); 
    } 
    o = null;
    if (y) {
      dm.a = 0;
      z = new Vector();
      A.removeAllElements();
      n = null;
      y = false;
      x = 0;
    } 
    for (i = 0; i < paramArrayOfer.length; i++) {
      if (paramArrayOfer[i] instanceof dm) {
        dm dm1;
        String str = (dm1 = (dm)paramArrayOfer[i]).getUinString();
        if (hashtable.containsKey(str)) {
          dm dm2 = (dm)hashtable.get(str);
          dm1.i = dm2.i;
          dm1.l = dm2.l;
          hashtable.remove(str);
        } 
        z.addElement(dm1);
      } else if (paramArrayOfer[i] instanceof bu) {
        A.addElement(paramArrayOfer[i]);
      } 
    } 
    x += paramInt2;
    w = paramInt1;
    o();
    B = false;
    for (i = e() - 1; i >= 0; i--) {
      dm dm1;
      (dm1 = b(i)).a(16, cj.g(dm1.getStringValue(0)));
    } 
    n();
  }
  
  public static void n() {
    Object object;
    if ((object = cp.a(35, (Object[])null, (Object)null)) != null && object instanceof Vector) {
      Vector vector = (Vector)object;
      for (byte b = 0; b < vector.size(); b++) {
        String str1 = (String)vector.elementAt(b);
        String str2 = null;
        if (str1 instanceof String)
          str2 = str1; 
        if (str1 instanceof C)
          str2 = ((C)str1).getUinString(); 
        if (str2 != null) {
          dm dm1;
          if ((dm1 = a(str2)) == null)
            if (str1 instanceof C) {
              C c;
              if ((c = (C)str1) != null)
                z.addElement(c); 
            } else {
              dm1 = b(str2);
            }  
          if (dm1 != null)
            dm1.a(192, 0); 
        } 
      } 
    } 
  }
  
  public static void o() {
    fb.a(16);
  }
  
  public static synchronized void p() {
    try {
      j();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static synchronized void y() {
    F = em.f(205);
    if (em.h(16)) {
      a.c((cx)null);
      for (byte b = 0; b < A.size(); b++) {
        bu bu1 = A.elementAt(b);
        cx cx = (cx)D.get(new Integer(bu1.a));
        a.c(cx);
        a(cx, bu1);
      } 
      return;
    } 
    a.c((cx)null);
  }
  
  private static synchronized void z() {
    boolean bool1 = em.h(16);
    boolean bool2 = em.h(7);
    int j = z.size();
    int i = A.size();
    if (B || (j == 0 && i == 0))
      return; 
    a.A();
    a.c(bool1);
    D.clear();
    if (bool1)
      for (byte b1 = 0; b1 < i; b1++) {
        bu bu1 = A.elementAt(b1);
        cx cx = a.a((cx)null, bu1);
        D.put(new Integer(bu1.a), cx);
      }  
    for (byte b = 0; b < j; b++) {
      dm dm1 = b(b);
      if (!bool2 || dm1.k() || dm1.getIntValue(192) != -1)
        if (bool1) {
          cx cx = (cx)D.get(new Integer(dm1.getIntValue(65)));
          a.a(cx, dm1);
        } else {
          a.a((cx)null, dm1);
        }  
    } 
    B = true;
  }
  
  public static bu c(int paramInt) {
    for (int i = A.size() - 1; i >= 0; i--) {
      bu bu1;
      if ((bu1 = A.elementAt(i)).a == paramInt)
        return bu1; 
    } 
    return null;
  }
  
  public static dm a(String paramString) {
    int i;
    if (paramString == null)
      return null; 
    if (paramString.equals(o))
      return p; 
    try {
      i = Integer.parseInt(paramString);
    } catch (Exception exception) {
      return null;
    } 
    for (int j = z.size() - 1; j >= 0; j--) {
      dm dm1;
      if ((dm1 = b(j)).n == i) {
        o = paramString;
        p = dm1;
        return dm1;
      } 
    } 
    return null;
  }
  
  public static dm[] d(int paramInt) {
    Vector vector = new Vector();
    for (byte b = 0; b < z.size(); b++) {
      dm dm1;
      if ((dm1 = b(b)).getIntValue(65) == paramInt)
        vector.addElement(dm1); 
    } 
    dm[] arrayOfDm = new dm[vector.size()];
    vector.copyInto((Object[])arrayOfDm);
    return arrayOfDm;
  }
  
  private static void a(cx paramcx, bu parambu) {
    if (parambu == null || paramcx == null)
      return; 
    byte b1 = 0;
    int i = paramcx.b();
    for (byte b2 = 0; b2 < i; b2++) {
      if ((paramcx.a(b2)).a instanceof dm && ((dm)(paramcx.a(b2)).a).getIntValue(192) != -1)
        b1++; 
    } 
    parambu.a(b1, i);
  }
  
  public static void a(dm paramdm, boolean paramBoolean1, boolean paramBoolean2) {
    if (!B)
      return; 
    boolean bool1 = false;
    boolean bool3 = false;
    int i = 0;
    int j = 0;
    cx cx1 = null;
    int n = paramdm.getIntValue(192);
    String str = paramdm.getStringValue(0);
    int m = paramdm.getIntValue(65);
    boolean bool = em.h(7);
    cx cx2;
    if ((cx2 = (cx)D.get(new Integer(m))) == null)
      cx2 = a.ae; 
    int k = cx2.b();
    byte b = 0;
    while (b < k) {
      Object object;
      if (!(object = (cx1 = cx2.a(b)).a instanceof dm) || !((dm)object).getStringValue(0).equals(str)) {
        b++;
        continue;
      } 
      bool1 = true;
    } 
    boolean bool2 = (z.indexOf(paramdm) != -1) ? true : false;
    a.q();
    i = (bool2 && !bool1) ? 1 : 0;
    if (bool && !bool1)
      i |= ((n != -1) ? 1 : 0) | paramdm.k(); 
    j = (!bool2 && bool1) ? 1 : 0;
    if (bool && bool1)
      j |= (n == -1 && !paramdm.k()) ? 1 : 0; 
    if (i != 0 && !bool1) {
      cx1 = a.a(cx2, paramdm);
    } else if (j != 0) {
      a.b(cx1);
      bool3 = true;
    } 
    if (paramBoolean2 && !bool3) {
      boolean bool4 = (a.z() == cx1) ? true : false;
      boolean bool5 = false;
      a.a(cx2, co.a(cx2, cx1));
      int i1 = cx2.b();
      F = em.f(205);
      for (byte b1 = 0; b1 < i1; b1++) {
        cx cx;
        if ((cx = cx2.a(b1)).a instanceof dm && u.a(cx1, cx) < 0) {
          a.a(cx2, cx1, b1);
          bool5 = true;
          break;
        } 
      } 
      if (!bool5)
        a.a(cx2, cx1, i1); 
      if (bool4)
        a.a(cx1); 
    } 
    if (paramBoolean1)
      a.a(cx1); 
    a.s();
    paramdm.q();
  }
  
  public static synchronized void a(String paramString, int paramInt1, int paramInt2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, I paramI) {
    dm dm1 = a(paramString);
    int i = dh.a(paramInt1);
    if (dm1 == null) {
      G = i;
      return;
    } 
    long l = dm1.getIntValue(192);
    int j = dm1.w.c();
    boolean bool1 = (l != i) ? true : false;
    boolean bool2 = (paramInt2 != j) ? true : false;
    boolean bool3 = (l != -1L) ? true : false;
    boolean bool4 = (i != -1) ? true : false;
    if (paramArrayOfbyte3 != null)
      dm1.a(paramArrayOfbyte3, paramI, paramArrayOfbyte4); 
    if (!bool4) {
      if (bool3) {
        dm1.a(3, dh.b(false, false));
        dm1.a(75, 0);
        dm1.b(new byte[0]);
        b(paramString, 4);
        if (em.h(63))
          cl.a(2, paramString, bb.a((short)719)); 
        dm1.n();
        dm1.b(false);
      } else if (!C) {
        if (System.currentTimeMillis() - dm1.t < 40000L) {
          cl.a(1, paramString, bb.a((short)78));
        } else {
          dm1.t = System.currentTimeMillis();
        } 
      } 
      dm1.x = 0;
      dm1.a(false);
    } else {
      bs.a(paramString);
      if (!bool3 && !C) {
        b(paramString, 2);
        if (em.h(62))
          cl.a(2, paramString, bb.a((short)718)); 
        dm1.n();
        dm1.b(true);
      } 
    } 
    a(dm1, bool3, bool4, 0);
    dm1.a(192, i);
    if (B && bool1)
      dw.a(dw.m(), dm1, i); 
    if (bool2 && j != -1)
      dm1.p = true; 
    if (paramInt4 != -1 && bool4) {
      dm1.a(225, paramArrayOfbyte1);
      dm1.a(226, paramArrayOfbyte2);
      dm1.a(74, paramInt3);
      dm1.a(72, paramInt4);
      dm1.a(73, paramInt5);
      dm1.a(193, paramInt6);
    } 
    dm1.a(194, paramInt7);
    if (bool4)
      dm1.a(191, paramInt10); 
    dm1.a(195, paramInt8);
    dm1.a(71, paramInt9);
    if (bool1 || bool2)
      a(dm1, false, true); 
    if (a.i()) {
      String str = null;
      if (bool1)
        str = dw.b(i); 
      if (str != null)
        dw.a(dw.m(), dm1.o + ": " + str, 4); 
    } 
  }
  
  public static synchronized void a(String paramString, int paramInt) {
    a(paramString, paramInt, -1, null, null, 0, 0, -1, 0, -1, -1, -1, -1, null, null, null);
  }
  
  private static void a(dm paramdm, boolean paramBoolean1, boolean paramBoolean2, int paramInt) {
    int i = 0;
    bu bu1 = c(paramdm.getIntValue(65));
    if (paramBoolean1 && !paramBoolean2) {
      E--;
      if (bu1 != null)
        bu1.b(-1, 0); 
      i = 1;
    } 
    if (!paramBoolean1 && paramBoolean2) {
      E++;
      if (bu1 != null)
        bu1.b(1, 0); 
      i = 1;
    } 
    if (bu1 != null) {
      bu1.b(0, paramInt);
      i |= (paramInt != 0) ? 1 : 0;
    } 
    if (i != 0)
      fb.a(); 
  }
  
  public static void e(int paramInt) {
    String str = E + "/" + z.size();
    if (!em.h(9))
      str = str + "-" + dh.b(true, false); 
    if (paramInt != 0)
      str = str + "-" + (paramInt / 1024) + "K"; 
    if (em.h(51))
      str = str + "-" + (Runtime.getRuntime().freeMemory() / 1024L) + "K"; 
    a.a_(str);
  }
  
  public static synchronized void a(dm paramdm) {
    z.removeElement(paramdm);
    o = null;
    a(paramdm, false, false);
    a(paramdm, (paramdm.getIntValue(192) != -1), false, -1);
    o();
  }
  
  public static synchronized void b(dm paramdm) {
    if (!paramdm.getBooleanValue(1)) {
      dm dm1;
      if ((dm1 = a(paramdm.getStringValue(0))) != null) {
        a(dm1);
        G = dm1.getIntValue(192);
      } 
      z.addElement(paramdm);
      o = null;
      paramdm.a(1, true);
      paramdm.a(16, cj.g(paramdm.getStringValue(0)));
      if (G != 268435456) {
        paramdm.a(192, G);
        G = 268435456;
      } 
      a(paramdm, true, true);
      a(paramdm, false, (paramdm.getIntValue(192) != -1), 1);
      o();
    } 
  }
  
  public static synchronized void a(bu parambu) {
    A.addElement(parambu);
    n = null;
    if (!em.h(16))
      return; 
    cx cx = a.a((cx)null, parambu);
    D.put(new Integer(parambu.a), cx);
    o();
  }
  
  public static synchronized void b(bu parambu) {
    for (int i = z.size() - 1; i >= 0; i--) {
      dm dm1;
      if ((dm1 = b(i)).getIntValue(65) == parambu.a) {
        if (dm1.getIntValue(192) != -1)
          E--; 
        z.removeElementAt(i);
        o = null;
      } 
    } 
    Integer integer = new Integer(parambu.a);
    if (em.h(16)) {
      cx cx = (cx)D.get(integer);
      a.a(a.ae, co.a(a.ae, cx));
      D.remove(integer);
    } 
    A.removeElement(parambu);
    n = null;
    o();
  }
  
  public static synchronized dm b(String paramString) {
    dm dm1;
    if ((dm1 = a(paramString)) != null)
      return dm1; 
    try {
      dm1 = new dm(0, 0, paramString, paramString, false, true);
    } catch (Exception exception) {
      return null;
    } 
    z.addElement(dm1);
    o = null;
    dm1.a(8, true);
    return dm1;
  }
  
  public static synchronized void a(ej paramej, boolean paramBoolean1, boolean paramBoolean2) {
    String str;
    dm dm1;
    if ((dm1 = a(str = paramej.g)) == null)
      dm1 = b(str); 
    cj.a(dm1, paramej, paramBoolean2);
    ef.f();
    cp.a(11, new Object[] { str, new Integer(cp.h) }, (Object)null);
    if (!B) {
      s |= 0x1;
      t = str;
    } else if (paramBoolean1) {
      b(str, 1);
    } 
    dm1.a(16, true);
    boolean bool = (F != 3 || System.currentTimeMillis() - bd.G > 500L) ? true : false;
    a(dm1, bool, true);
  }
  
  public static boolean c(String paramString) {
    d(paramString);
    boolean bool = (H != null) ? true : false;
    A();
    return bool;
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (paramString.equals("endOfMedia"))
      paramPlayer.close(); 
  }
  
  private static Player d(String paramString) {
    A();
    try {
      String str2;
      String str1 = "wav";
      int i;
      if ((i = paramString.lastIndexOf('.')) != -1)
        str1 = paramString.substring(i + 1).toLowerCase(); 
      if (str1.equals("mp3")) {
        str2 = "audio/mpeg";
      } else if (str1.equals("mid") || str1.equals("midi")) {
        str2 = "audio/midi";
      } else if (str1.equals("amr")) {
        str2 = "audio/amr";
      } else {
        str2 = "audio/X-wav";
      } 
      Class clazz;
      InputStream inputStream;
      if ((inputStream = (clazz = (new Object()).getClass()).getResourceAsStream(paramString)) == null)
        inputStream = clazz.getResourceAsStream("/" + paramString); 
      if (inputStream != null) {
        H = Manager.createPlayer(inputStream, str2);
        H.addPlayerListener(u);
      } 
    } catch (Exception exception) {
      H = null;
    } 
    return H;
  }
  
  private static void A() {
    if (H != null) {
      try {
        if (H.getState() == 400)
          H.stop(); 
        H.close();
      } catch (Exception exception) {}
      H = null;
    } 
  }
  
  private static void g(int paramInt) {
    try {
      H.realize();
      VolumeControl volumeControl;
      if ((volumeControl = (VolumeControl)H.getControl("VolumeControl")) != null)
        volumeControl.setLevel(paramInt); 
      H.prefetch();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static synchronized void b(String paramString, boolean paramBoolean) {
    if (paramBoolean)
      b(paramString, 3); 
    if (cj.f(paramString)) {
      cj.d(paramString).e();
      return;
    } 
    a.e();
  }
  
  public static synchronized void q() {
    a.e();
  }
  
  public static void r() {
    cn cn = new cn();
    Jimm.b().schedule(cn, 7000L);
    du.c = true;
    du du = new du(em.c(-1), "");
    try {
      cd.a(du);
    } catch (cr cr) {}
    try {
      Jimm.r = (System.getProperty("video.snapshot.encodings") != null);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static synchronized void a(String paramString, boolean paramBoolean) {
    dm dm1;
    if ((dm1 = a(paramString)) == null && !em.h(36))
      dm1 = b(paramString); 
    if (dm1 == null)
      return; 
    if (!dm1.c(1073741824))
      dm1.d(1073741824); 
    dm1.a(paramBoolean);
    b(paramString, paramBoolean);
  }
  
  public static void b(String paramString, int paramInt) {
    synchronized (u) {
      if (!B)
        return; 
      int i = 0;
      switch (paramInt) {
        case 1:
          i = em.f(206);
          break;
        case 2:
          i = em.f(207);
          break;
        case 4:
          i = em.f(208);
          break;
        case 3:
          i = em.f(209) - 1;
          break;
        case 5:
          i = em.f(245);
          break;
      } 
      int j;
      if ((j = em.f(211)) == 2)
        j = ef.e() ? 1 : 0; 
      if (paramInt == 1 || paramInt == 5) {
        String str1;
        if (paramInt == 1) {
          str1 = em.d(114);
        } else {
          str1 = em.d(146);
        } 
        Object[] arrayOfObject1 = { paramString, new Integer(i), new Integer(paramInt), new Integer(500), new Integer(j) };
        Object object1;
        if ((object1 = cp.a(8, arrayOfObject1, str1)) != null && object1 instanceof Integer) {
          str1 = "" + ((Integer)object1).intValue();
          j = 1;
        } 
        if (object1 != null && object1 instanceof String) {
          str1 = (String)object1;
          j = 1;
        } 
        if (object1 != null && object1 instanceof Boolean)
          j = ((Boolean)object1).booleanValue() ? 1 : 0; 
        if ((object1 == null || object1 instanceof Integer || object1 instanceof String) && j > 0 && !str1.equals("") && !str1.equals("0"))
          Jimm.a(str1); 
      } 
      boolean bool = em.h(43);
      Object object;
      if ((object = cp.a(12, new Object[] { paramString, new Integer(i), new Integer(paramInt), new Boolean(bool) }, (Object)null)) != null && object instanceof Boolean)
        bool = ((Boolean)object).booleanValue(); 
      if (bool)
        return; 
      int k = em.f(210);
      String str = em.d(110);
      Object[] arrayOfObject = { paramString, new Integer(i), new Integer(paramInt), new Integer(k), new Integer(j) };
      if ((object = cp.a(9, arrayOfObject, (Object)null)) != null) {
        if (object instanceof Integer)
          k = ((Integer)object).intValue(); 
        if (object = cp.a(10, arrayOfObject, (Object)null) instanceof String)
          str = (String)object; 
        object = null;
      } 
      if (object == null && k != 0)
        switch (i) {
          case 1:
            try {
              switch (paramInt) {
                case 1:
                  Manager.playTone(60, 500, em.f(210));
                  break;
                case 2:
                  Manager.playTone(65, 500, em.f(210));
                  break;
                case 4:
                  Manager.playTone(66, 500, em.f(210));
                  break;
                case 3:
                  Manager.playTone(67, 500, em.f(210));
                  break;
                case 5:
                  Manager.playTone(68, 500, em.f(210));
                  break;
              } 
            } catch (Exception exception) {}
            break;
          case 2:
            try {
              if (paramInt == 1) {
                H = d(em.d(107));
                if (H == null)
                  return; 
                g(k);
              } else if (paramInt == 2) {
                H = d(em.d(108));
                if (H == null)
                  return; 
                g(k);
              } else if (paramInt == 4) {
                H = d(em.d(109));
                if (H == null)
                  return; 
                g(k);
              } else if (paramInt == 5) {
                H = d(em.d(111));
                if (H == null)
                  return; 
                g(k);
              } else {
                H = d(str);
                if (H == null)
                  return; 
                g(k);
              } 
              H.start();
            } catch (Exception exception) {}
            break;
        }  
      return;
    } 
  }
  
  public static boolean b(boolean paramBoolean) {
    boolean bool = !em.h(43) ? true : false;
    em.a(43, bool);
    if (em.h(46))
      em.a(211, bool ? 1 : 0); 
    em.b(3);
    if (paramBoolean)
      i(); 
    return bool;
  }
  
  public static void s() {
    em.a(211, (em.f(211) == 0) ? 1 : 0);
  }
  
  public final void a(cx paramcx, ev paramev, int paramInt) {
    er er = (er)paramcx.a;
    paramev.b = b.a(er.getImageIndex());
    paramev.c = er.a().b();
    paramev.d = h.a(er.d());
    paramev.e = g.a(er.c());
    paramev.a = er.getText();
    paramev.f = i.a(er.e());
    paramev.g = f.a(er.g());
    paramev.h = f.a(er.f());
    int i;
    if ((i = er.b()) == -100) {
      if (k != null)
        paramev.i = k.a(0); 
      if (paramev.i == null) {
        paramev.i = e.a(30);
        paramev.o = true;
      } 
    } else {
      paramev.i = e.a(i);
    } 
    paramev.j = null;
    if (em.h(69) && paramcx.a instanceof dm) {
      int j;
      if ((j = paramInt) <= 5)
        try {
          j = paramev.b.getHeight();
        } catch (Exception exception) {
          j = 16;
        }  
      paramev.j = ((dm)er).a(j);
    } 
    paramev.l = er.getTextColor();
    paramev.k = er.getFontStyle();
    if (er instanceof dm) {
      dm dm1 = (dm)er;
      paramev.n = dm1.l();
    } 
  }
  
  public final void a(bd parambd) {
    t();
    if (em.h(73))
      Jimm.d.vibrate(30); 
  }
  
  public static void t() {
    cx cx;
    if ((cx = a.z()) == null)
      return; 
    er er;
    if (er = (er)cx.a instanceof bu) {
      bu bu1 = (bu)er;
      Object[] arrayOfObject = { null, bu1.getText(), "" + bu1.a };
      if (cp.a(20, arrayOfObject, bu1, a)) {
        if (em.h(72)) {
          a.a(dw.q, bd.ac);
          return;
        } 
        a.a(dw.q, bd.ab);
        return;
      } 
      a.b(dw.q);
      if (em.h(72)) {
        a.a(dw.q, bd.aa);
        return;
      } 
      a.a(dw.q, bd.Z);
      return;
    } 
    if (er instanceof dm) {
      dm dm1 = (dm)er;
      Object[] arrayOfObject = { dm1.getUinString(), dm1.o };
      if (cp.a(20, arrayOfObject, dm1, a)) {
        if (em.h(72)) {
          a.a(dw.q, bd.ac);
          return;
        } 
        a.a(dw.q, bd.ab);
        return;
      } 
      a.b(dw.q);
      if (em.h(72)) {
        a.a(dw.q, bd.aa);
        return;
      } 
      a.a(dw.q, bd.Z);
    } 
  }
  
  public final void b(bd parambd) {}
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {
    if (a == null)
      return; 
    cx cx;
    dm dm1;
    if (dw.a(dm1 = ((cx = a.z()) != null && cx.a instanceof dm) ? (dm)cx.a : null, paramInt1, paramInt2))
      return; 
    switch (paramInt1) {
      case -8:
        if (dm1 != null)
          dw.W = dw.a(dm1, bb.a((short)400), bb.a((short)400) + " " + dm1.o + "?", 2); 
        return;
      case -26:
        if (em.h(34))
          cl.a(); 
        return;
    } 
    dw.b(dm1, paramInt1, paramInt2);
  }
  
  public static synchronized String c(boolean paramBoolean) {
    int i;
    if ((i = z.indexOf(q)) == -1)
      return null; 
    byte b = paramBoolean ? 1 : -1;
    int j = z.size();
    for (int k = i + b;; k += b) {
      if (k < 0)
        k = j - 1; 
      if (k >= j)
        k = 0; 
      if (k == i)
        return null; 
      dm dm1;
      if ((dm1 = b(k)).getBooleanValue(16)) {
        dw.T = null;
        r = false;
        q = dm1;
        dm1.p();
        return dm1.getStringValue(0);
      } 
    } 
  }
  
  public static int u() {
    int i = z.size();
    int j = 0;
    for (byte b = 0; b < i; b++)
      j += b(b).l(); 
    return j;
  }
  
  public static dm[] c(bu parambu) {
    Vector vector = new Vector();
    int i = parambu.a;
    int j = e();
    for (byte b = 0; b < j; b++) {
      dm dm1;
      if ((dm1 = b(b)).getIntValue(65) == i)
        vector.addElement(dm1); 
    } 
    dm[] arrayOfDm = new dm[vector.size()];
    vector.copyInto((Object[])arrayOfDm);
    return arrayOfDm;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == v) {
      cy.f();
      return;
    } 
    if (paramCommand == dw.q) {
      B();
      return;
    } 
    if (paramCommand == cy.b) {
      cd.l = em.f(204);
      k();
      cd.b();
      return;
    } 
    if (paramCommand == cj.b) {
      cx cx1;
      if ((cx1 = a.z()) == null)
        return; 
      er er1;
      if (er1 = (er)cx1.a instanceof dm)
        dw.a((dm)er1); 
      return;
    } 
    if (paramCommand == cy.c) {
      cd.d();
      Thread.yield();
      i();
      return;
    } 
    if (paramCommand == cy.d) {
      if (!dw.L) {
        em.d();
        return;
      } 
      dw.f();
      return;
    } 
    if (paramCommand == cy.e) {
      db.d.a();
      return;
    } 
    if (paramCommand == cy.f) {
      ef.c();
      return;
    } 
    if (paramCommand == cy.g) {
      cy.l();
      return;
    } 
    if (paramCommand == cy.h) {
      cy.m();
      return;
    } 
    if (paramCommand == cy.j || paramCommand == cy.i) {
      b(false);
      i();
      return;
    } 
    if (paramCommand == cy.k) {
      dw.f();
      return;
    } 
    if (paramCommand == cy.l) {
      cp.g.b();
      return;
    } 
    if (paramCommand == cy.m) {
      Jimm.a(true);
      return;
    } 
    if (paramCommand == cy.n) {
      bw.a();
      return;
    } 
    if (paramCommand == cy.o) {
      dw.a(em.c(-1), "", true);
      return;
    } 
    if (paramCommand == cy.p) {
      cl.a();
      return;
    } 
    if (paramCommand == cy.r) {
      cy.a(false);
      return;
    } 
    if (paramCommand == cy.q) {
      cy.h();
      return;
    } 
    cx cx;
    if ((cx = a.z()) == null)
      return; 
    er er;
    if (er = (er)cx.a instanceof bu) {
      bu bu1 = (bu)er;
      Object[] arrayOfObject = { null, bu1.getText(), "" + bu1.a };
      if (cp.a(21, arrayOfObject, paramCommand) != null)
        t(); 
      return;
    } 
    if (er instanceof dm) {
      dm dm1 = (dm)er;
      Object[] arrayOfObject = { dm1.getUinString(), dm1.o };
      if (cp.a(21, arrayOfObject, paramCommand) != null)
        t(); 
    } 
  }
  
  private static void B() {
    cx cx;
    if ((cx = a.z()) == null)
      return; 
    er er;
    if (er = (er)cx.a instanceof dm) {
      q = (dm)er;
      q.p();
    } 
    if (er instanceof bu)
      a.a(cx, !cx.c); 
  }
  
  public static boolean d(boolean paramBoolean) {
    boolean bool = !em.h(33) ? true : false;
    em.a(33, bool);
    em.b(4);
    try {
      eu.b();
      eu.a(cd.l() | (int)em.i(300));
    } catch (cr cr) {
      cr.a(null);
    } 
    if (paramBoolean)
      i(); 
    return bool;
  }
  
  public static void a(String paramString, I paramI, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    dm dm1;
    if ((dm1 = a(paramString)) == null)
      return; 
    dm1.a(paramArrayOfbyte1, paramI, paramArrayOfbyte2);
    by.a(paramString);
  }
  
  public final void f(int paramInt) {}
  
  public static boolean e(boolean paramBoolean) {
    return C = paramBoolean;
  }
  
  static {
    v = new Command(bb.a((short)332), Jimm.j ? 3 : 2, 3);
    v();
    m = null;
    n = null;
    G = 268435456;
    q = null;
    r = false;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */