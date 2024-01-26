public final class es implements bx {
  private final bv a;
  
  public es(bv parambv) {
    this.a = parambv;
  }
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {
    if (paramInt2 == 1) {
      if (paramInt1 == 42) {
        this.a.c = this.a.c + 1 & 0x7;
        a(parambd);
        bd.a_();
      } 
      if (paramInt1 == 35) {
        this.a.e = (this.a.e + 1) % 6;
        a(parambd);
        bd.a_();
      } 
      if (paramInt1 == 48) {
        if (this.a.c == 0) {
          this.a.c = 7;
        } else {
          this.a.c = 0;
        } 
        this.a.e = 0;
        a(parambd);
        bd.a_();
      } 
    } 
  }
  
  public final void f(int paramInt) {}
  
  public final void a(bd parambd) {
    if (dw.a(bv.a(this.a))) {
      System.arraycopy(this.a.g, 0, em.d, 0, em.d.length);
      System.arraycopy(this.a.i, 0, em.u, 0, em.u.length);
      System.arraycopy(this.a.h, 0, em.v, 0, em.v.length);
      em.t[47] = "Standart";
      int i;
      if ((i = bv.a(this.a).A()) != 0)
        if (i == -100 || i == -101) {
          System.arraycopy(em.c, 0, em.d, 0, em.c.length);
          boolean bool = (i == -101) ? true : false;
          em.v[54] = 0;
          em.u[82] = bool;
          em.v[44] = bool ? 1 : 0;
          em.t[47] = "LocID Theme";
          em.v[40] = bool ? 1 : 0;
        } else if (i > 0) {
          int[] arrayOfInt = this.a.b.elementAt(i - 1);
          em.a(this.a.f, arrayOfInt[0], arrayOfInt[1]);
        }  
      if (this.a.c > 0 || this.a.e > 0) {
        this.a.d = true;
        for (byte b = 0; b < em.d.length; b++) {
          if (b != 23 || em.d[b] != 0) {
            if ((this.a.c & 0x1) != 0)
              em.d[b] = em.d[b] ^ 0xFF; 
            if ((this.a.c & 0x2) != 0)
              em.d[b] = em.d[b] ^ 0xFF00; 
            if ((this.a.c & 0x4) != 0)
              em.d[b] = em.d[b] ^ 0xFF0000; 
            if (this.a.e > 0) {
              int j = (em.d[b] & 0xFF0000) >> 16;
              int k = (em.d[b] & 0xFF00) >> 8;
              int m = em.d[b] & 0xFF;
              switch (this.a.e) {
                case 1:
                  em.d[b] = (k << 16) + (j << 8) + m;
                  break;
                case 2:
                  em.d[b] = (j << 16) + (m << 8) + k;
                  break;
                case 3:
                  em.d[b] = (m << 16) + (j << 8) + k;
                  break;
                case 4:
                  em.d[b] = (k << 16) + (m << 8) + j;
                  break;
                case 5:
                  em.d[b] = (m << 16) + (k << 8) + j;
                  break;
              } 
            } 
          } 
        } 
      } 
      if (this.a.d) {
        byte b1 = ((this.a.c & 0x4) != 0) ? 82 : 114;
        byte b2 = ((this.a.c & 0x2) != 0) ? 71 : 103;
        byte b3 = ((this.a.c & 0x1) != 0) ? 66 : 98;
        String str = "" + b1 + b2 + b3;
        switch (this.a.e) {
          case 1:
            str = "" + b2 + b1 + b3;
            break;
          case 2:
            str = "" + b1 + b3 + b2;
            break;
          case 3:
            str = "" + b3 + b1 + b2;
            break;
          case 4:
            str = "" + b2 + b3 + b1;
            break;
          case 5:
            str = "" + b3 + b2 + b1;
            break;
        } 
        bv.a(this.a).a_(str);
        em.t[47] = em.t[47] + " [" + str + "]";
      } 
      bv.a(this.a).u(em.d[1]);
      bv.a(this.a).v(em.v[40]);
    } 
  }
  
  public final void b(bd parambd) {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\es.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */