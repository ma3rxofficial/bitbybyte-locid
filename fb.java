import i.I;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import jimm.Jimm;

public final class fb implements Runnable {
  private int c;
  
  private Object[] d;
  
  private static MIDlet e;
  
  public static Object[] a = new Object[6];
  
  public static Integer b = new Integer(0);
  
  private fb(int paramInt, Object[] paramArrayOfObject) {
    this.c = paramInt;
    this.d = paramArrayOfObject;
  }
  
  public final void run() {
    if (this.c < 8) {
      switch (this.c) {
        case 1:
          bi.a((ej)this.d[0], a(this.d, 1), a(this.d, 2));
          return;
        case 4:
          bi.a((String)this.d[0], -1);
          return;
        case 5:
          bi.a((String)this.d[0], b(this.d, 1), b(this.d, 2), (byte[])this.d[3], (byte[])this.d[4], b(this.d, 5), b(this.d, 6), b(this.d, 7), b(this.d, 8), b(this.d, 9), b(this.d, 10), b(this.d, 11), b(this.d, 12), (byte[])this.d[13], (byte[])this.d[14], (I)this.d[15]);
          return;
        case 6:
          dw.a((String[])this.d[0]);
          return;
        case 7:
          bi.e(db.d());
          break;
      } 
      return;
    } 
    if (this.c < 14) {
      switch (this.c) {
        case 8:
          bi.b((dm)this.d[0]);
          return;
        case 9:
          bi.a((String)this.d[0], a(this.d, 1));
          return;
        case 10:
          bi.l();
          return;
        case 11:
          dw.d();
          return;
        case 13:
          cy.a((Alert)this.d[0]);
          break;
      } 
      return;
    } 
    switch (this.c) {
      case 16:
        bi.p();
        return;
      case 19:
        Thread.currentThread().setPriority(1);
        ea.a((String)this.d[0], (String)this.d[1], (this.d[2] == null) ? 0 : 1, (String)this.d[3], (String)this.d[4]);
        return;
      case 18:
        dw.j();
        return;
      case 15:
        bi.a((String)this.d[0], (I)this.d[1], (byte[])this.d[2], (byte[])this.d[3]);
        return;
      case 17:
        em.a(b(this.d, 0));
        return;
      case 20:
        dw.b((String)this.d[0], (dm)this.d[1], ((Byte)this.d[2]).byteValue());
        return;
      case 21:
        cp.a((String)this.d[0], (String)this.d[1], (String)this.d[2]);
        return;
      case 22:
        ((bf)this.d[0]).a(this.d[1]);
        return;
      case 23:
        ((bk)this.d[0]).a((String)this.d[1]);
        break;
    } 
  }
  
  public static void a(MIDlet paramMIDlet) {
    e = paramMIDlet;
  }
  
  private static synchronized void b(int paramInt, Object[] paramArrayOfObject) {
    if (em.u[95]) {
      Display.getDisplay(e).callSerially(new fb(paramInt, paramArrayOfObject));
      return;
    } 
    a(paramInt, paramArrayOfObject);
  }
  
  public static synchronized void a(int paramInt, Object[] paramArrayOfObject) {
    (new Thread(new fb(paramInt, paramArrayOfObject))).start();
  }
  
  public static void a(int paramInt, Object paramObject) {
    b(paramInt, new Object[] { paramObject });
  }
  
  public static void b(int paramInt, Object paramObject) {
    a(paramInt, new Object[] { paramObject });
  }
  
  private static void b(int paramInt) {
    b(paramInt, (Object[])null);
  }
  
  public static void a(int paramInt) {
    a(paramInt, (Object[])null);
  }
  
  public static void a(int paramInt, Object paramObject1, Object paramObject2) {
    a(paramInt, new Object[] { paramObject1, paramObject2 });
  }
  
  public static void a() {
    b(7);
  }
  
  public static void a(ej paramej) {
    int i = 0;
    dm dm = bi.a(paramej.g);
    a[0] = paramej.g;
    a[1] = paramej.g;
    a[2] = paramej.a();
    a[3] = new Integer(paramej.e);
    a[4] = null;
    a[5] = b;
    if (dm != null)
      a[1] = dm.o; 
    if (paramej instanceof ce) {
      ce ce = (ce)paramej;
      a[4] = ce.a;
    } 
    Object object = cp.a(23, a, paramej);
    if (paramej instanceof ce) {
      ce ce = (ce)paramej;
      if (a[4] != ce.a)
        ce.a = (String)a[4]; 
    } 
    i = ((Integer)a[5]).intValue();
    if (object == null && !bs.a(paramej)) {
      boolean bool2 = em.h(17);
      if (i != 0)
        bool2 = (i == 1); 
      boolean bool1 = Jimm.i;
      if (em.h(44))
        Jimm.a(false); 
      b(1, new Object[] { paramej, new Boolean(!bool1), new Boolean(bool2) });
      if (bool1)
        bi.b(paramej.g, 1); 
      cz.b();
    } 
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, I paramI) {
    Object[] arrayOfObject;
    (arrayOfObject = new Object[16])[0] = paramString;
    a(arrayOfObject, 1, paramInt1);
    a(arrayOfObject, 2, paramInt2);
    arrayOfObject[3] = paramArrayOfbyte1;
    arrayOfObject[4] = paramArrayOfbyte2;
    a(arrayOfObject, 5, paramInt3);
    a(arrayOfObject, 6, paramInt4);
    a(arrayOfObject, 7, paramInt5);
    a(arrayOfObject, 8, paramInt6);
    a(arrayOfObject, 9, paramInt7);
    a(arrayOfObject, 10, paramInt8);
    a(arrayOfObject, 11, paramInt9);
    a(arrayOfObject, 12, paramInt10);
    arrayOfObject[13] = paramArrayOfbyte3;
    arrayOfObject[14] = paramArrayOfbyte4;
    arrayOfObject[15] = paramI;
    b(5, arrayOfObject);
  }
  
  public static void a(String paramString, boolean paramBoolean) {
    Object[] arrayOfObject;
    (arrayOfObject = new Object[2])[0] = paramString;
    a(arrayOfObject, 1, paramBoolean);
    b(9, arrayOfObject);
  }
  
  public static void b() {
    b(10);
  }
  
  public static void c() {
    b(11);
  }
  
  public static void a(Alert paramAlert) {
    a(13, paramAlert);
  }
  
  private static void a(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean) {
    paramArrayOfObject[paramInt] = new Boolean(paramBoolean);
  }
  
  private static boolean a(Object[] paramArrayOfObject, int paramInt) {
    return (paramArrayOfObject[paramInt] == null) ? false : ((Boolean)paramArrayOfObject[paramInt]).booleanValue();
  }
  
  private static void a(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    paramArrayOfObject[paramInt1] = new Integer(paramInt2);
  }
  
  private static int b(Object[] paramArrayOfObject, int paramInt) {
    return (paramArrayOfObject[paramInt] == null) ? 0 : ((Integer)paramArrayOfObject[paramInt]).intValue();
  }
  
  public static void a(String paramString, I paramI, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    Object[] arrayOfObject;
    (arrayOfObject = new Object[4])[0] = paramString;
    arrayOfObject[1] = paramI;
    arrayOfObject[2] = paramArrayOfbyte1;
    arrayOfObject[3] = paramArrayOfbyte2;
    b(15, arrayOfObject);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\fb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */