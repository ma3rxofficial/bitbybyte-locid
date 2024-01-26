import java.io.ByteArrayOutputStream;

public final class ei extends bg {
  private dm c;
  
  private bu d;
  
  private bu e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private short i;
  
  private long j = System.currentTimeMillis();
  
  public ei(er paramer, int paramInt) {
    super(false, true);
    this.g = paramInt;
    if (paramer instanceof dm) {
      this.c = (dm)paramer;
      this.d = null;
      return;
    } 
    this.c = null;
    this.d = (bu)paramer;
  }
  
  public ei(dm paramdm, bu parambu1, bu parambu2) {
    super(false, true);
    this.c = paramdm;
    this.d = parambu1;
    this.e = parambu2;
    this.g = 4;
  }
  
  public final void b() throws cr {
    bj bj;
    byte[] arrayOfByte = null;
    if (this.g != 3)
      g(); 
    switch (this.g) {
      case 3:
        if (this.c != null) {
          arrayOfByte = a(this.c, 0);
        } else {
          arrayOfByte = b(this.d);
        } 
        bj = new bj(19, 9, dh.a(), new byte[0], arrayOfByte);
        cd.i.a(bj);
        this.f = 1;
        return;
      case 1:
      case 5:
        if (this.c != null) {
          int i = this.c.getIntValue(65);
          this.d = bi.c(i);
          this.c.a(64, dh.b());
          bi.b(this.c);
          arrayOfByte = a(this.c, i);
          if (this.g == 5) {
            this.f = 17;
          } else {
            this.f = 18;
          } 
        } else {
          arrayOfByte = b(this.d);
          this.f = 11;
        } 
        bj = new bj(19, 8, dh.a(), new byte[0], arrayOfByte);
        cd.i.a(bj);
        return;
      case 2:
        if (this.c != null) {
          arrayOfByte = a(this.c, 0);
          this.f = 7;
        } else {
          arrayOfByte = b(this.d);
          this.f = 9;
        } 
        bj = new bj(19, 10, dh.a(), new byte[0], arrayOfByte);
        cd.i.a(bj);
        return;
      case 4:
        cd.i.a(new bj(19, 9, dh.a(), new byte[0], a(this.c, this.d.a)));
        this.f = 4;
        break;
    } 
  }
  
  private boolean b(dd paramdd) throws cr {
    boolean bool = false;
    bj bj;
    if (paramdd instanceof bj && (bj = (bj)paramdd).a == 19 && bj.b == 14) {
      bu bu1;
      int i;
      switch (i = dh.c(bj.a(), 0)) {
        case 2:
          this.h = 154;
          this.i = 631;
          break;
        case 3:
          this.h = 155;
          this.i = 632;
          break;
        case 10:
          this.h = 156;
          this.i = 633;
          break;
        case 12:
          this.h = 157;
          this.i = 634;
          break;
        case 13:
          this.h = 158;
          this.i = 635;
          break;
      } 
      if (this.h != 0) {
        this.f = -1;
        return true;
      } 
      switch (this.f) {
        case 9:
          i();
          this.f = 10;
          break;
        case 10:
          bi.b(this.d);
          this.f = 3;
          h();
          break;
        case 11:
          i();
          this.f = 12;
          break;
        case 12:
          bi.a(this.d);
        case 17:
          a(this.d);
        case 18:
          if (i == 0) {
            a(this.d);
            this.c.a(8, false);
            this.c.a(2, false);
          } 
          h();
          this.f = 3;
          break;
        case 1:
          if (this.g != 3)
            h(); 
          this.f = 3;
          break;
        case 4:
          cd.i.a(new bj(19, 10, dh.a(), new byte[0], a(this.c, this.d.a)));
          this.c.a(65, this.e.a);
          this.c.a(64, dh.b());
          this.f = 5;
          break;
        case 5:
          cd.i.a(new bj(19, 8, dh.a(), new byte[0], a(this.c, this.e.a)));
          this.f = 6;
          break;
        case 6:
          a(this.e);
          this.f = 14;
          break;
        case 14:
          h();
          this.f = 3;
          break;
        case 7:
          bu1 = bi.c(this.c.getIntValue(65));
          bi.a(this.c);
          a(bu1);
          this.f = 8;
          break;
        case 8:
          h();
          this.f = 3;
          break;
      } 
      bool = true;
      this.j = System.currentTimeMillis();
      if (this.c != null && this.g == 2 && this.c.getIntValue(65) == 0)
        this.f = 3; 
    } 
    return bool;
  }
  
  private static void g() throws cr {
    cd.i.a(new bj(19, 17, dh.a(), new byte[0], new byte[0]));
  }
  
  private static void h() throws cr {
    cd.i.a(new bj(19, 18, dh.a(), new byte[0], new byte[0]));
  }
  
  private static void i() throws cr {
    cd.i.a(new bj(19, 9, dh.a(), new byte[0], j()));
  }
  
  private static void a(bu parambu) throws cr {
    try {
      cd.i.a(new bj(19, 9, dh.a(), new byte[0], b(parambu)));
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final synchronized boolean a(dd paramdd) throws cr {
    boolean bool;
    if ((bool = b(paramdd)) && this.h != 0) {
      if (this.g != 4 && this.g != 3)
        h(); 
      this.j = System.currentTimeMillis();
    } 
    return bool;
  }
  
  public final boolean c() {
    return (this.f == 3);
  }
  
  public final void a(int paramInt) {
    switch (paramInt) {
      case 1:
        switch (this.g) {
          case 1:
          case 2:
          case 4:
            bi.a(true);
            break;
        } 
        bi.i();
        if (this.g != 2 && this.c != null) {
          bi.a(this.c, true, false);
          return;
        } 
        break;
      case 3:
        if (this.h != 0) {
          cr.a(new cr(this.i, this.h, 0, true));
          return;
        } 
        cr.a(new cr((short)631, 154, 3, true));
        break;
    } 
  }
  
  public final boolean d() {
    if (this.f == -1)
      return true; 
    if (this.j + 10000L < System.currentTimeMillis() || this.h != 0)
      this.f = -1; 
    return (this.f == -1);
  }
  
  private byte[] a(dm paramdm, int paramInt) {
    ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
    if (paramInt == 0)
      paramInt = paramdm.getIntValue(65); 
    dh.a(byteArrayOutputStream1, paramdm.getStringValue(0), true);
    dh.a(byteArrayOutputStream1, paramInt, true);
    dh.a(byteArrayOutputStream1, paramdm.getIntValue(64), true);
    dh.a(byteArrayOutputStream1, 0, true);
    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
    if (this.g != 2) {
      dh.a(byteArrayOutputStream2, 305, true);
      dh.a(byteArrayOutputStream2, paramdm.getStringValue(1), true);
    } 
    if (this.g == 5) {
      dh.a(byteArrayOutputStream2, 102, true);
      dh.a(byteArrayOutputStream2, 0, true);
    } 
    dh.a(byteArrayOutputStream1, byteArrayOutputStream2.size(), true);
    byteArrayOutputStream1.write(byteArrayOutputStream2.toByteArray(), 0, byteArrayOutputStream2.size());
    return byteArrayOutputStream1.toByteArray();
  }
  
  private static byte[] b(bu parambu) {
    ByteArrayOutputStream byteArrayOutputStream;
    dh.a(byteArrayOutputStream = new ByteArrayOutputStream(), parambu.h(), true);
    dh.a(byteArrayOutputStream, parambu.a, true);
    dh.a(byteArrayOutputStream, 0, true);
    dh.a(byteArrayOutputStream, 1, true);
    dm[] arrayOfDm;
    if ((arrayOfDm = bi.c(parambu)).length != 0) {
      dh.a(byteArrayOutputStream, arrayOfDm.length * 2 + 4, true);
      dh.a(byteArrayOutputStream, 200, true);
      dh.a(byteArrayOutputStream, arrayOfDm.length * 2, true);
      for (byte b = 0; b < arrayOfDm.length; b++)
        dh.a(byteArrayOutputStream, arrayOfDm[b].getIntValue(64), true); 
    } else {
      dh.a(byteArrayOutputStream, 0, true);
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  private static byte[] j() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    bu[] arrayOfBu = bi.h();
    dh.a(byteArrayOutputStream, "", true);
    dh.a(byteArrayOutputStream, 0, true);
    dh.a(byteArrayOutputStream, 0, true);
    dh.a(byteArrayOutputStream, 1, true);
    dh.a(byteArrayOutputStream, arrayOfBu.length * 2 + 4, true);
    dh.a(byteArrayOutputStream, 200, true);
    dh.a(byteArrayOutputStream, arrayOfBu.length * 2, true);
    for (byte b = 0; b < arrayOfBu.length; b++)
      dh.a(byteArrayOutputStream, (arrayOfBu[b]).a, true); 
    return byteArrayOutputStream.toByteArray();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ei.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */