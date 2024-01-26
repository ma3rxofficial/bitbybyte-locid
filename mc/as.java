package mc;

public final class mc/as {
  public short[] a;
  
  public short[] b;
  
  public byte[] c;
  
  public int[] d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  private final ck h;
  
  public mc/as(ck paramck, int paramInt1, int paramInt2, int paramInt3) {
    this.h = paramck;
    this.e = paramInt2;
    this.g = paramInt3;
    this.a = new short[paramInt1];
    this.d = new int[paramInt3];
  }
  
  public final void a() {
    for (byte b = 0; b < this.a.length; b++)
      this.a[b] = 0; 
    this.b = null;
    this.c = null;
  }
  
  public final void a(int paramInt) {
    this.h.a.a(this.b[paramInt] & 0xFFFF, this.c[paramInt]);
  }
  
  public final void a(short[] paramArrayOfshort, byte[] paramArrayOfbyte) {
    this.b = paramArrayOfshort;
    this.c = paramArrayOfbyte;
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
  
  private void a(int[] paramArrayOfint) {
    this.c = new byte[this.a.length];
    int i;
    int j = ((i = paramArrayOfint.length / 2) + 1) / 2;
    int k = 0;
    for (byte b = 0; b < this.g; b++)
      this.d[b] = 0; 
    int[] arrayOfInt;
    (arrayOfInt = new int[i])[i - 1] = 0;
    int m;
    for (m = i - 1; m >= 0; m--) {
      if (paramArrayOfint[2 * m + 1] != -1) {
        int n;
        if ((n = arrayOfInt[m] + 1) > this.g) {
          n = this.g;
          k++;
        } 
        arrayOfInt[paramArrayOfint[2 * m + 1]] = n;
        arrayOfInt[paramArrayOfint[2 * m]] = n;
      } else {
        int n = arrayOfInt[m];
        this.d[n - 1] = this.d[n - 1] + 1;
        this.c[paramArrayOfint[2 * m]] = (byte)arrayOfInt[m];
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
            int i3 = 2 * paramArrayOfint[n++];
            if (paramArrayOfint[i3 + 1] == -1) {
              this.c[paramArrayOfint[i3]] = (byte)i1;
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
  
  public final void a(mc/as parammc/as) {
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
          parammc/as.a[b4] = (short)(parammc/as.a[b4] + 1);
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
        parammc/as.a[b] = (short)(parammc/as.a[b] + b3);
        continue;
      } 
      if (b != 0) {
        parammc/as.a[16] = (short)(parammc/as.a[16] + 1);
        continue;
      } 
      if (b3 <= 10) {
        parammc/as.a[17] = (short)(parammc/as.a[17] + 1);
        continue;
      } 
      parammc/as.a[18] = (short)(parammc/as.a[18] + 1);
    } 
  }
  
  public final void b(mc/as parammc/as) {
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
          parammc/as.a(b3);
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
          parammc/as.a(b); 
        continue;
      } 
      if (b != 0) {
        parammc/as.a(16);
        this.h.a.a(i - 3, 2);
        continue;
      } 
      if (i <= 10) {
        parammc/as.a(17);
        this.h.a.a(i - 3, 3);
        continue;
      } 
      parammc/as.a(18);
      this.h.a.a(i - 11, 7);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\as.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */