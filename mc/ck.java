package mc;

public final class ck {
  private static final int[] b = new int[] { 
      16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 
      11, 4, 12, 3, 13, 2, 14, 1, 15 };
  
  public p a;
  
  private mc/as c;
  
  private mc/as d;
  
  private mc/as e;
  
  private short[] f;
  
  private byte[] g;
  
  private int h;
  
  private int i;
  
  private static short[] j = new short[286];
  
  private static byte[] k = new byte[286];
  
  private static short[] l = new short[30];
  
  private static byte[] m = new byte[30];
  
  public static short a(int paramInt) {
    return (short)("��\b\004\f\002\n\006\016\001\t\005\r\003\013\007\017".charAt(paramInt & 0xF) << 12 | "��\b\004\f\002\n\006\016\001\t\005\r\003\013\007\017".charAt(paramInt >> 4 & 0xF) << 8 | "��\b\004\f\002\n\006\016\001\t\005\r\003\013\007\017".charAt(paramInt >> 8 & 0xF) << 4 | "��\b\004\f\002\n\006\016\001\t\005\r\003\013\007\017".charAt(paramInt >> 12));
  }
  
  public ck(p paramp) {
    this.a = paramp;
    this.c = new mc/as(this, 286, 257, 15);
    this.d = new mc/as(this, 30, 1, 15);
    this.e = new mc/as(this, 19, 4, 7);
    this.f = new short[16384];
    this.g = new byte[16384];
  }
  
  public final void a() {
    this.h = 0;
    this.i = 0;
    this.c.a();
    this.d.a();
    this.e.a();
  }
  
  private static int c(int paramInt) {
    if (paramInt == 255)
      return 285; 
    char c = 'ā';
    while (paramInt >= 8) {
      c += '\004';
      paramInt >>= 1;
    } 
    return c + paramInt;
  }
  
  private static int d(int paramInt) {
    byte b = 0;
    while (paramInt >= 4) {
      b += true;
      paramInt >>= 1;
    } 
    return b + paramInt;
  }
  
  private void e(int paramInt) {
    this.e.b();
    this.c.b();
    this.d.b();
    this.a.a(this.c.f - 257, 5);
    this.a.a(this.d.f - 1, 5);
    this.a.a(paramInt - 4, 4);
    for (byte b = 0; b < paramInt; b++)
      this.a.a(this.e.c[b[b]], 3); 
    this.c.b(this.e);
    this.d.b(this.e);
  }
  
  private void c() {
    for (byte b = 0; b < this.h; b++) {
      int i = this.g[b] & 0xFF;
      short s;
      int j = (s = this.f[b]) - 1;
      if ((s = this.f[b]) != 0) {
        int k = c(i);
        this.c.a(k);
        int m;
        if ((m = (k - 261) / 4) > 0 && m <= 5)
          this.a.a(i & (1 << m) - 1, m); 
        int n = d(j);
        this.d.a(n);
        if ((m = n / 2 - 1) > 0)
          this.a.a(j & (1 << m) - 1, m); 
      } else {
        this.c.a(i);
      } 
    } 
    this.c.a(256);
  }
  
  public final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.a.a(0 + (paramBoolean ? 1 : 0), 3);
    this.a.b();
    this.a.a(paramInt2);
    this.a.a(paramInt2 ^ 0xFFFFFFFF);
    this.a.a(paramArrayOfbyte, paramInt1, paramInt2);
    a();
  }
  
  public final void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.c.a[256] = (short)(this.c.a[256] + 1);
    this.c.c();
    this.d.c();
    this.c.a(this.e);
    this.d.a(this.e);
    this.e.c();
    int i = 4;
    int j;
    for (j = 18; j > i; j--) {
      if (this.e.c[b[j]] > 0)
        i = j + 1; 
    } 
    j = 14 + i * 3 + this.e.d() + this.c.d() + this.d.d() + this.i;
    int k = this.i;
    byte b;
    for (b = 0; b < 'Ğ'; b++)
      k += this.c.a[b] * k[b]; 
    for (b = 0; b < 30; b++)
      k += this.d.a[b] * m[b]; 
    if (j >= k)
      j = k; 
    if (paramInt1 >= 0 && paramInt2 + 4 < j >> 3) {
      a(paramArrayOfbyte, paramInt1, paramInt2, paramBoolean);
      return;
    } 
    if (j == k) {
      this.a.a(2 + (paramBoolean ? 1 : 0), 3);
      this.c.a(j, k);
      this.d.a(l, m);
      c();
      a();
      return;
    } 
    this.a.a(4 + (paramBoolean ? 1 : 0), 3);
    e(i);
    c();
    a();
  }
  
  public final boolean b() {
    return (this.h == 16384);
  }
  
  public final boolean b(int paramInt) {
    this.f[this.h] = 0;
    this.g[this.h++] = (byte)paramInt;
    this.c.a[paramInt] = (short)(this.c.a[paramInt] + 1);
    return (this.h == 16384);
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    this.f[this.h] = (short)paramInt1;
    this.g[this.h++] = (byte)(paramInt2 - 3);
    int i = c(paramInt2 - 3);
    this.c.a[i] = (short)(this.c.a[i] + 1);
    if (i >= 265 && i < 285)
      this.i += (i - 261) / 4; 
    int j = d(paramInt1 - 1);
    this.d.a[j] = (short)(this.d.a[j] + 1);
    if (j >= 4)
      this.i += j / 2 - 1; 
    return (this.h == 16384);
  }
  
  static {
    for (b = 0; b < 30; b++) {
      l[b] = a(b << 11);
      m[b] = 5;
    } 
  }
  
  static {
    byte b = 0;
    while (b < '') {
      j[b] = a(48 + b << 8);
      k[b++] = 8;
    } 
    while (b < 'Ā') {
      j[b] = a(256 + b << 7);
      k[b++] = 9;
    } 
    while (b < 'Ę') {
      j[b] = a(-256 + b << 9);
      k[b++] = 7;
    } 
    while (b < 'Ğ') {
      j[b] = a(-88 + b << 8);
      k[b++] = 8;
    } 
  }
  
  class mc/as {
    public short[] a;
    
    public short[] b;
    
    public byte[] c;
    
    public int[] d;
    
    public int e;
    
    public int f;
    
    public int g;
    
    private final ck h;
    
    public mc/as(ck this$0, int param1Int1, int param1Int2, int param1Int3) {
      this.h = this$0;
      this.e = param1Int2;
      this.g = param1Int3;
      this.a = new short[param1Int1];
      this.d = new int[param1Int3];
    }
    
    public final void a() {
      for (byte b = 0; b < this.a.length; b++)
        this.a[b] = 0; 
      this.b = null;
      this.c = null;
    }
    
    public final void a(int param1Int) {
      this.h.a.a(this.b[param1Int] & 0xFFFF, this.c[param1Int]);
    }
    
    public final void a(short[] param1ArrayOfshort, byte[] param1ArrayOfbyte) {
      this.b = param1ArrayOfshort;
      this.c = param1ArrayOfbyte;
    }
    
    public final void b() {
      int[] arrayOfInt = new int[this.g];
      int i = 0;
      this.b = new short[this.a.length];
      byte b;
      for (b = 0; b < this.g; b++) {
        arrayOfInt[b] = i;
        i += this.d[b] << 15 - b;
      } 
      for (b = 0; b < this.f; b++) {
        byte b1;
        if ((b1 = this.c[b]) > 0) {
          this.b[b] = ck.a(arrayOfInt[b1 - 1]);
          arrayOfInt[b1 - 1] = arrayOfInt[b1 - 1] + (1 << 16 - b1);
        } 
      } 
    }
    
    private void a(int[] param1ArrayOfint) {
      this.c = new byte[this.a.length];
      int i;
      int j = ((i = param1ArrayOfint.length / 2) + 1) / 2;
      int k = 0;
      for (byte b = 0; b < this.g; b++)
        this.d[b] = 0; 
      int[] arrayOfInt;
      (arrayOfInt = new int[i])[i - 1] = 0;
      int m;
      for (m = i - 1; m >= 0; m--) {
        if (param1ArrayOfint[2 * m + 1] != -1) {
          int n;
          if ((n = arrayOfInt[m] + 1) > this.g) {
            n = this.g;
            k++;
          } 
          arrayOfInt[param1ArrayOfint[2 * m + 1]] = n;
          arrayOfInt[param1ArrayOfint[2 * m]] = n;
        } else {
          int n = arrayOfInt[m];
          this.d[n - 1] = this.d[n - 1] + 1;
          this.c[param1ArrayOfint[2 * m]] = (byte)arrayOfInt[m];
        } 
      } 
      if (k == 0)
        return; 
      m = this.g - 1;
      while (true) {
        if (this.d[--m] == 0)
          continue; 
        do {
          this.d[m] = this.d[m] - 1;
          this.d[++m] = this.d[++m] + 1;
        } while ((k -= 1 << this.g - 1 - m) > 0 && m < this.g - 1);
        if (k <= 0) {
          this.d[this.g - 1] = this.d[this.g - 1] + k;
          this.d[this.g - 2] = this.d[this.g - 2] - k;
          int n = 2 * j;
          for (int i1 = this.g; i1 != 0; i1--) {
            int i2 = this.d[i1 - 1];
            while (i2 > 0) {
              int i3 = 2 * param1ArrayOfint[n++];
              if (param1ArrayOfint[i3 + 1] == -1) {
                this.c[param1ArrayOfint[i3]] = (byte)i1;
                i2--;
              } 
            } 
          } 
          return;
        } 
      } 
    }
    
    public final void c() {
      int i;
      int[] arrayOfInt1 = new int[i = this.a.length];
      byte b1 = 0;
      byte b2 = 0;
      byte b3;
      for (b3 = 0; b3 < i; b3++) {
        short s;
        if ((s = this.a[b3]) != 0) {
          int k;
          int m;
          for (k = b1++; k > 0 && this.a[arrayOfInt1[m = (k - 1) / 2]] > s; k = m)
            arrayOfInt1[k] = arrayOfInt1[m]; 
          arrayOfInt1[k] = b3;
          b2 = b3;
        } 
      } 
      while (b1 < 2) {
        b3 = (b2 < 2) ? ++b2 : 0;
        arrayOfInt1[b1++] = b3;
      } 
      this.f = Math.max(b2 + 1, this.e);
      b3 = b1;
      int[] arrayOfInt2 = new int[4 * b1 - 2];
      int[] arrayOfInt3 = new int[2 * b1 - 1];
      byte b4 = b3;
      int j;
      for (j = 0; j < b1; j++) {
        int k = arrayOfInt1[j];
        arrayOfInt2[2 * j] = k;
        arrayOfInt2[2 * j + 1] = -1;
        arrayOfInt3[j] = this.a[k] << 8;
        arrayOfInt1[j] = j;
      } 
      while (true) {
        j = arrayOfInt1[0];
        int k = arrayOfInt1[--b1];
        int m = 0;
        int n;
        for (n = 1; n < b1; n = n * 2 + 1) {
          if (n + 1 < b1 && arrayOfInt3[arrayOfInt1[n]] > arrayOfInt3[arrayOfInt1[n + 1]])
            n++; 
          arrayOfInt1[m] = arrayOfInt1[n];
          m = n;
        } 
        int i1 = arrayOfInt3[k];
        while ((n = m) > 0 && arrayOfInt3[arrayOfInt1[m = (n - 1) / 2]] > i1)
          arrayOfInt1[n] = arrayOfInt1[m]; 
        arrayOfInt1[n] = k;
        int i2 = arrayOfInt1[0];
        k = b4++;
        arrayOfInt2[2 * k] = j;
        arrayOfInt2[2 * k + 1] = i2;
        int i3 = Math.min(arrayOfInt3[j] & 0xFF, arrayOfInt3[i2] & 0xFF);
        arrayOfInt3[k] = i1 = arrayOfInt3[j] + arrayOfInt3[i2] - i3 + 1;
        m = 0;
        for (n = 1; n < b1; n = (m = n) * 2 + 1) {
          if (n + 1 < b1 && arrayOfInt3[arrayOfInt1[n]] > arrayOfInt3[arrayOfInt1[n + 1]])
            n++; 
          arrayOfInt1[m] = arrayOfInt1[n];
        } 
        while ((n = m) > 0 && arrayOfInt3[arrayOfInt1[m = (n - 1) / 2]] > i1)
          arrayOfInt1[n] = arrayOfInt1[m]; 
        arrayOfInt1[n] = k;
        if (b1 <= 1) {
          if (arrayOfInt1[0] != arrayOfInt2.length / 2 - 1)
            throw new RuntimeException("Weird!"); 
          a(arrayOfInt2);
          return;
        } 
      } 
    }
    
    public final int d() {
      int i = 0;
      for (byte b = 0; b < this.a.length; b++)
        i += this.a[b] * this.c[b]; 
      return i;
    }
    
    public final void a(mc/as param1mc/as) {
      byte b = -1;
      byte b1 = 0;
      while (b1 < this.f) {
        byte b2;
        byte b3 = 1;
        byte b4;
        if ((b4 = this.c[b1]) == 0) {
          b2 = 138;
        } else {
          b2 = 6;
          if (b != b4) {
            param1mc/as.a[b4] = (short)(param1mc/as.a[b4] + 1);
            b3 = 0;
          } 
        } 
        b = b4;
        while (++b1 < this.f && b == this.c[b1]) {
          b1++;
          if (++b3 >= b2)
            break; 
        } 
        if (b3 < 3) {
          param1mc/as.a[b] = (short)(param1mc/as.a[b] + b3);
          continue;
        } 
        if (b != 0) {
          param1mc/as.a[16] = (short)(param1mc/as.a[16] + 1);
          continue;
        } 
        if (b3 <= 10) {
          param1mc/as.a[17] = (short)(param1mc/as.a[17] + 1);
          continue;
        } 
        param1mc/as.a[18] = (short)(param1mc/as.a[18] + 1);
      } 
    }
    
    public final void b(mc/as param1mc/as) {
      byte b = -1;
      byte b1 = 0;
      while (b1 < this.f) {
        byte b2;
        int i = 1;
        byte b3;
        if ((b3 = this.c[b1]) == 0) {
          b2 = 138;
        } else {
          b2 = 6;
          if (b != b3) {
            param1mc/as.a(b3);
            i = 0;
          } 
        } 
        b = b3;
        while (++b1 < this.f && b == this.c[b1]) {
          b1++;
          if (++i >= b2)
            break; 
        } 
        if (i < 3) {
          while (i-- > 0)
            param1mc/as.a(b); 
          continue;
        } 
        if (b != 0) {
          param1mc/as.a(16);
          this.h.a.a(i - 3, 2);
          continue;
        } 
        if (i <= 10) {
          param1mc/as.a(17);
          this.h.a.a(i - 3, 3);
          continue;
        } 
        param1mc/as.a(18);
        this.h.a.a(i - 11, 7);
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ck.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */