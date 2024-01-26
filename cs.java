import java.util.Date;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import jimm.Jimm;

public final class cs extends bg {
  private int c;
  
  private dt d;
  
  private int e;
  
  private long f;
  
  private boolean g;
  
  public cs(dt paramdt) {
    super(true, true);
    this.d = paramdt;
    this.e = 0;
    this.f = 0L;
    this.g = false;
  }
  
  public final void b() throws cr {
    this.a.getClass();
    cd.k = new cd.en();
    cd.k.a(dh.d(this.d.h.b(225)) + ":" + this.d.h.getIntValue(74));
    byte[] arrayOfByte;
    dh.a(arrayOfByte = new byte[48], 0, 255);
    dh.a(arrayOfByte, 1, 8L, false);
    dh.b(arrayOfByte, 3, 11008);
    dh.a(arrayOfByte, 5, Long.parseLong(this.d.a()), false);
    dh.b(arrayOfByte, 9, 0);
    dh.a(arrayOfByte, 11, cd.k.d(), false);
    dh.a(arrayOfByte, 15, Long.parseLong(em.c(-1)), false);
    System.arraycopy(arrayOfByte, 19, cd.k.e(), 0, 4);
    dh.a(arrayOfByte, 23, -1442971648L);
    dh.a(arrayOfByte, 27, 4);
    dh.a(arrayOfByte, 28, cd.k.d(), false);
    dh.a(arrayOfByte, 32, this.d.h.getIntValue(193), false);
    dh.a(arrayOfByte, 36, 1342177280L);
    dh.a(arrayOfByte, 40, 50331648L);
    dh.a(arrayOfByte, 44, 0L);
    ck ck = new ck(arrayOfByte);
    cd.k.a(ck);
  }
  
  public final boolean a(dd paramdd) throws cr {
    boolean bool = false;
    if (paramdd instanceof ck) {
      byte[] arrayOfByte;
      if ((arrayOfByte = ((ck)paramdd).a).length >= 4 && dh.d(arrayOfByte, 0) == 16777216L) {
        dh.a(arrayOfByte = new byte[4], 0, 16777216L);
        ck ck1 = new ck(arrayOfByte);
        cd.k.a(ck1);
        arrayOfByte = new byte[19 + em.c(-1).length() + 1];
        int i = 0;
        dh.a(arrayOfByte, 0, 0);
        dh.a(arrayOfByte, 1, 0L);
        dh.a(arrayOfByte, 5, 1L, false);
        dh.a(arrayOfByte, 9, this.d.d, false);
        dh.a(arrayOfByte, 13, 64L, false);
        dh.a(arrayOfByte, 17, em.c(-1).length() + 1);
        dh.a(arrayOfByte, 18, 0);
        byte[] arrayOfByte1;
        System.arraycopy(arrayOfByte1 = dh.a(em.c(-1)), 0, arrayOfByte, 19, arrayOfByte1.length);
        i = 19 + arrayOfByte1.length;
        dh.a(arrayOfByte, i, 0);
        ck ck2 = new ck(arrayOfByte);
        cd.k.a(ck2);
        this.c = 1;
        bool = true;
      } else if (this.c == 1 && dh.a(arrayOfByte, 0) == 1) {
        arrayOfByte = new byte[16 + this.d.a.length() + 1 + 3];
        int i = 0;
        dh.a(arrayOfByte, 0, 2);
        dh.a(arrayOfByte, 1, 0);
        dh.a(arrayOfByte, 2, this.d.a.length() + 1);
        dh.a(arrayOfByte, 3, 0);
        byte[] arrayOfByte1;
        System.arraycopy(arrayOfByte1 = dh.a(this.d.a), 0, arrayOfByte, 4, arrayOfByte1.length);
        i = 4 + arrayOfByte1.length;
        dh.a(arrayOfByte, i, 0);
        dh.b(arrayOfByte, ++i, 256);
        dh.a(arrayOfByte, i + 2, 0);
        i += 3;
        dh.a(arrayOfByte, i, this.d.d, false);
        i += 4;
        dh.a(arrayOfByte, i, 0L);
        i += 4;
        dh.a(arrayOfByte, i, 100L, false);
        ck ck = new ck(arrayOfByte);
        cd.k.a(ck);
        this.c = 2;
        bool = true;
      } else if (this.c == 2 && dh.a(arrayOfByte, 0) == 3 && dh.a(arrayOfByte, 13) == 1) {
        Date date = new Date();
        this.f = date.getTime();
        while (this.d.a(this.e) && !this.g) {
          ck ck = new ck(this.d.b(this.e));
          cd.k.a(ck);
          this.e++;
        } 
        date = new Date();
        this.f = date.getTime() - this.f;
        try {
          Thread.sleep(5000L);
        } catch (Exception exception) {}
        cd.k.a();
        Thread.yield();
        cd.k = null;
        this.d.h.u = null;
        bool = true;
        if (!this.g)
          this.c = 3; 
      } 
    } 
    return bool;
  }
  
  public final int e() {
    boolean bool;
    try {
      bool = this.e * 100 / (this.d.d >>> 11);
    } catch (Exception exception) {
      bool = false;
    } 
    return bool;
  }
  
  private String g() {
    return (this.f != 0L) ? (String.valueOf(this.d.d / this.f) + "." + String.valueOf(this.d.d % this.f / this.f / 10L)) : "0.0";
  }
  
  public final boolean c() {
    return (this.c == 3);
  }
  
  public final boolean d() {
    return (this.c == -1 || this.g);
  }
  
  public final void a(int paramInt) {
    Alert alert1;
    Alert alert2;
    switch (paramInt) {
      case 2:
        this.g = true;
        bi.i();
        return;
      case 3:
        alert1 = new Alert(bb.a((short)242), bb.a((short)242) + " " + bb.a((short)547) + " " + bb.a((short)350) + " " + bb.a((short)480) + "!", null, AlertType.WARNING);
        bi.a().a(Jimm.d, alert1);
        return;
      case 1:
        (alert2 = new Alert(bb.a((short)242), bb.a((short)242) + " " + bb.a((short)547) + " " + bb.a((short)480) + ".\n" + bb.a((short)450) + ": " + g() + " " + bb.a((short)292), null, AlertType.INFO)).setTimeout(2000);
        bi.a(alert2);
        break;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */