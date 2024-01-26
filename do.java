public final class do extends bg {
  private ce d;
  
  private dt e;
  
  private int f = 65535;
  
  private int g = 0;
  
  private int h = 0;
  
  public static int c = 0;
  
  public do(ej paramej) {
    super(false, true);
    if (paramej instanceof ce) {
      this.d = (ce)paramej;
      this.e = null;
      this.g = (int)System.currentTimeMillis();
      this.h = h();
      return;
    } 
    if (paramej instanceof dt) {
      this.d = null;
      this.e = (dt)paramej;
    } 
  }
  
  public final long g() {
    return (this.g << 32L) + this.h;
  }
  
  private static synchronized int h() {
    return c++;
  }
  
  public final void b() throws cr {
    this.f--;
    i();
  }
  
  private void i() throws cr {
    dm dm;
    if (this.d != null) {
      dm = this.d.h;
    } else {
      dm = this.e.h;
    } 
    byte b = 1;
    boolean bool = dm.c(2);
    if (this.e != null && dm.getIntValue(192) != -1)
      b = 2; 
    if (this.d != null && this.d.e >= 1000 && this.d.e <= 1004)
      b = 2; 
    if (em.h(19) && em.h(20) && dm.c(1) && !dm.c(8388608) && !dm.c(8) && dm.getIntValue(76) != 9 && dm.getIntValue(76) != 10 && dm.getIntValue(192) != -1)
      b = 2; 
    if (b == 1) {
      byte[] arrayOfByte2;
      byte[] arrayOfByte1 = dh.a(dm.getStringValue(0));
      if (bool) {
        arrayOfByte2 = dh.b(dh.d(this.d.a));
      } else {
        Object object = null;
        arrayOfByte2 = dh.a(dh.d(this.d.a));
      } 
      byte[] arrayOfByte3 = new byte[11 + arrayOfByte1.length + 4 + (bool ? 6 : 5) + 4 + 4 + arrayOfByte2.length + 4];
      int i = 0;
      dh.a(arrayOfByte3, 0, this.g);
      dh.a(arrayOfByte3, 4, this.h);
      dh.b(arrayOfByte3, 8, 1);
      dh.a(arrayOfByte3, 10, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 11, arrayOfByte1.length);
      i = 10 + 1 + arrayOfByte1.length;
      dh.b(arrayOfByte3, i, 2);
      dh.b(arrayOfByte3, i + 2, (bool ? 6 : 5) + 4 + 4 + arrayOfByte2.length);
      i += 4;
      dh.b(arrayOfByte3, i, 1281);
      if (bool) {
        dh.b(arrayOfByte3, i + 2, 2);
        dh.b(arrayOfByte3, i + 4, 262);
        i += 6;
      } else {
        dh.b(arrayOfByte3, i + 2, 1);
        dh.a(arrayOfByte3, i + 4, 1);
        i += 5;
      } 
      dh.b(arrayOfByte3, i, 257);
      dh.b(arrayOfByte3, i + 2, 4 + arrayOfByte2.length);
      i += 4;
      if (bool) {
        dh.a(arrayOfByte3, i, 131072L);
      } else {
        dh.a(arrayOfByte3, i, 0L);
      } 
      i += 4;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, i, arrayOfByte2.length);
      i += arrayOfByte2.length;
      dh.b(arrayOfByte3, i, 6);
      dh.b(arrayOfByte3, i + 2, 0);
      bj bj = new bj(4, 6, 0L, new byte[0], arrayOfByte3);
      cd.i.a(bj);
    } else if (b == 2) {
      byte[] arrayOfByte2;
      byte[] arrayOfByte3;
      byte[] arrayOfByte1 = dh.a(dm.getStringValue(0));
      boolean bool1 = false;
      byte b1 = 38;
      if (this.e == null) {
        String str = dh.d(this.d.a);
        if (em.h(94) && !dm.c(1048576)) {
          bool1 = true;
          if (((arrayOfByte2 = dh.b(str, true)).length & 0x1) == 0) {
            byte[] arrayOfByte = new byte[arrayOfByte2.length + 1];
            System.arraycopy(arrayOfByte2, 0, arrayOfByte, 0, arrayOfByte2.length);
            arrayOfByte[arrayOfByte.length - 1] = 32;
            arrayOfByte2 = arrayOfByte;
          } 
          boolean bool2 = false;
          db.c((dh.a(str, true)).length - arrayOfByte2.length + 38);
          b1 = 0;
        } else {
          arrayOfByte2 = dh.a(str, true);
        } 
        arrayOfByte3 = new byte[0];
      } else {
        arrayOfByte2 = dh.a(this.e.b);
        arrayOfByte3 = dh.a(this.e.a);
      } 
      int i = 0;
      if (this.e == null) {
        i = 125 + b1 + arrayOfByte1.length + arrayOfByte2.length;
      } else {
        i = 192 + arrayOfByte1.length + arrayOfByte2.length + arrayOfByte3.length + 1;
      } 
      byte[] arrayOfByte4 = new byte[i];
      int j = 0;
      dh.a(arrayOfByte4, 0, this.g);
      dh.a(arrayOfByte4, 4, this.h);
      dh.b(arrayOfByte4, 8, 2);
      dh.a(arrayOfByte4, 10, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte4, 11, arrayOfByte1.length);
      j = 10 + 1 + arrayOfByte1.length;
      dh.b(arrayOfByte4, j, 5);
      j += 2;
      if (this.e == null) {
        dh.a(arrayOfByte4, j, 106 + b1 + arrayOfByte2.length, true);
      } else {
        dh.b(arrayOfByte4, j, 173 + arrayOfByte2.length + arrayOfByte3.length + 1);
      } 
      j += 2;
      dh.b(arrayOfByte4, j, 0);
      j += 2;
      dh.a(arrayOfByte4, j, this.g);
      j += 4;
      dh.a(arrayOfByte4, j, this.h);
      j += 4;
      System.arraycopy(dh.a, 0, arrayOfByte4, j, 16);
      j += 16;
      dh.a(arrayOfByte4, j, 655362L);
      j += 4;
      dh.b(arrayOfByte4, j, 1);
      j += 2;
      dh.a(arrayOfByte4, j, 983040L);
      j += 4;
      if (this.e != null) {
        dh.b(arrayOfByte4, j, 3);
        dh.b(arrayOfByte4, j + 2, 4);
        System.arraycopy(cd.i.c(), 0, arrayOfByte4, j + 4, 4);
        j += 8;
        dh.b(arrayOfByte4, j, 5);
        dh.b(arrayOfByte4, j + 2, 2);
        dh.b(arrayOfByte4, j + 4, cd.i.b());
        j += 6;
      } 
      dh.b(arrayOfByte4, j, 10001);
      j += 2;
      if (this.e == null) {
        dh.a(arrayOfByte4, j, 66 + b1 + arrayOfByte2.length, true);
      } else {
        dh.b(arrayOfByte4, j, 119 + arrayOfByte2.length + arrayOfByte3.length + 1);
      } 
      j += 2;
      dh.b(arrayOfByte4, j, 6912);
      j += 2;
      dh.b(arrayOfByte4, j, 2048);
      j += 2;
      dh.a(arrayOfByte4, j, 0L);
      j += 4;
      dh.a(arrayOfByte4, j, 0L);
      j += 4;
      dh.a(arrayOfByte4, j, 0L);
      j += 4;
      dh.a(arrayOfByte4, j, 0L);
      j += 4;
      dh.b(arrayOfByte4, j, 0);
      j += 2;
      dh.a(arrayOfByte4, j, 3);
      j++;
      if (this.e == null) {
        dh.a(arrayOfByte4, j, 0L);
      } else {
        dh.a(arrayOfByte4, j, 4L);
      } 
      j += 4;
      dh.a(arrayOfByte4, j, this.f, false);
      j += 2;
      dh.a(arrayOfByte4, j, 14, false);
      j += 2;
      dh.a(arrayOfByte4, j, this.f, false);
      j += 2;
      dh.a(arrayOfByte4, j, 0L);
      j += 4;
      dh.a(arrayOfByte4, j, 0L);
      j += 4;
      dh.a(arrayOfByte4, j, 0L);
      j += 4;
      if (this.e == null) {
        dh.a(arrayOfByte4, j, this.d.e, false);
      } else {
        dh.a(arrayOfByte4, j, this.e.e, false);
      } 
      j += 2;
      dh.a(arrayOfByte4, j, dh.b((int)em.i(300)), false);
      j += 2;
      dh.a(arrayOfByte4, j, 2, false);
      j += 2;
      if (this.e == null) {
        dh.a(arrayOfByte4, j, arrayOfByte2.length + 1, false);
        j += 2;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte4, j, arrayOfByte2.length);
        j += arrayOfByte2.length;
        dh.a(arrayOfByte4, j, 0);
        dh.a(arrayOfByte4, ++j, 0L);
        j += 4;
        dh.a(arrayOfByte4, j, -256L);
        j += 4;
        dh.a(arrayOfByte4, j, (b1 << 24));
        j += 4;
        if (!bool1) {
          System.arraycopy(dh.c, 0, arrayOfByte4, j, b1);
        } else {
          System.arraycopy(dh.d, 0, arrayOfByte4, j, b1);
        } 
        j += b1;
      } else {
        dh.a(arrayOfByte4, j, 1, false);
        j += 2;
        dh.a(arrayOfByte4, j, 0);
        dh.a(arrayOfByte4, ++j, 41, false);
        j += 2;
        dh.a(arrayOfByte4, j, -265481511L);
        j += 4;
        dh.a(arrayOfByte4, j, 814863121L);
        j += 4;
        dh.a(arrayOfByte4, j, -1915289584L);
        j += 4;
        dh.a(arrayOfByte4, j, 1258702382L);
        j += 4;
        dh.b(arrayOfByte4, j, 0);
        j += 2;
        dh.a(arrayOfByte4, j, 4L, false);
        j += 4;
        System.arraycopy(dh.a("File"), 0, arrayOfByte4, j, 4);
        j += 4;
        dh.a(arrayOfByte4, j, 256L);
        j += 4;
        dh.a(arrayOfByte4, j, 65536L);
        j += 4;
        dh.a(arrayOfByte4, j, 0L);
        j += 4;
        dh.b(arrayOfByte4, j, 0);
        j += 2;
        dh.a(arrayOfByte4, j, 0);
        dh.a(arrayOfByte4, ++j, (18 + arrayOfByte2.length + arrayOfByte3.length + 1), false);
        j += 4;
        dh.a(arrayOfByte4, j, arrayOfByte2.length, false);
        j += 4;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte4, j, arrayOfByte2.length);
        j += arrayOfByte2.length;
        dh.a(arrayOfByte4, j, -1937636830L);
        j += 4;
        dh.a(arrayOfByte4, j, arrayOfByte3.length + 1, false);
        j += 2;
        System.arraycopy(arrayOfByte3, 0, arrayOfByte4, j, arrayOfByte3.length);
        j += arrayOfByte3.length;
        dh.a(arrayOfByte4, j, 0);
        dh.a(arrayOfByte4, ++j, this.e.d, false);
        j += 4;
        dh.a(arrayOfByte4, j, 35970L, false);
        j += 4;
      } 
      dh.a(arrayOfByte4, j, 3, true);
      j += 2;
      dh.b(arrayOfByte4, j, 0);
      bj bj = new bj(4, 6, 0L, new byte[0], arrayOfByte4);
      cd.i.a(bj);
    } 
    this.f--;
  }
  
  public final boolean a(dd paramdd) throws cr {
    return false;
  }
  
  public final boolean c() {
    return true;
  }
  
  public final boolean d() {
    return false;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\do.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */