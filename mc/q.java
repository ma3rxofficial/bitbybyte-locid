package mc;

public final class q {
  private static final int[] a = new int[] { 3, 3, 11 };
  
  private static final int[] b = new int[] { 2, 3, 7 };
  
  private byte[] c;
  
  private byte[] d;
  
  private ah e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private byte l;
  
  private int m;
  
  private static final int[] n = new int[] { 
      16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 
      11, 4, 12, 3, 13, 2, 14, 1, 15 };
  
  public final boolean a(br parambr) throws y {
    while (true) {
      int i;
      int j;
      switch (this.f) {
        case 0:
          this.g = parambr.a(5);
          if (this.g < 0)
            return false; 
          this.g += 257;
          parambr.b(5);
          this.f = 1;
        case 1:
          this.h = parambr.a(5);
          if (this.h < 0)
            return false; 
          this.h++;
          parambr.b(5);
          this.j = this.g + this.h;
          this.d = new byte[this.j];
          this.f = 2;
        case 2:
          this.i = parambr.a(4);
          if (this.i < 0)
            return false; 
          this.i += 4;
          parambr.b(4);
          this.c = new byte[19];
          this.m = 0;
          this.f = 3;
        case 3:
          while (this.m < this.i) {
            int k;
            if ((k = parambr.a(3)) < 0)
              return false; 
            parambr.b(3);
            this.c[n[this.m]] = (byte)k;
            this.m++;
          } 
          this.e = new ah(this.c);
          this.c = null;
          this.m = 0;
          this.f = 4;
        case 4:
          while (((i = this.e.a(parambr)) & 0xFFFFFFF0) == 0) {
            this.d[this.m++] = this.l = (byte)i;
            if (this.m == this.j)
              return true; 
          } 
          if (i < 0)
            return false; 
          if (i >= 17) {
            this.l = 0;
          } else if (this.m == 0) {
            throw new y();
          } 
          this.k = i - 16;
          this.f = 5;
        case 5:
          i = b[this.k];
          if ((j = parambr.a(i)) < 0)
            return false; 
          parambr.b(i);
          j += a[this.k];
          if (this.m + j > this.j)
            throw new y(); 
          while (j-- > 0)
            this.d[this.m++] = this.l; 
          if (this.m == this.j)
            return true; 
          this.f = 4;
      } 
    } 
  }
  
  public final ah a() throws y {
    byte[] arrayOfByte = new byte[this.g];
    System.arraycopy(this.d, 0, arrayOfByte, 0, this.g);
    return new ah(arrayOfByte);
  }
  
  public final ah b() throws y {
    byte[] arrayOfByte = new byte[this.h];
    System.arraycopy(this.d, this.g, arrayOfByte, 0, this.h);
    return new ah(arrayOfByte);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\q.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */