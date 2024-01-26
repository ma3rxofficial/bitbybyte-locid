package mc;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class bf {
  private static final byte[] b = new byte[] { 
      -119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 
      0, 13, 73, 72, 68, 82, 0, 0, 0, 0, 
      0, 0, 0, 0, 8, 6, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 73, 68, 65, 
      84, 120, -100 };
  
  private static final byte[] c = new byte[] { 
      0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 
      96, -126 };
  
  private boolean d = false;
  
  private byte[] e = null;
  
  private byte[] f = null;
  
  private byte[] g = null;
  
  private byte[] h = null;
  
  private int i = 0;
  
  private int j = 0;
  
  private int k = 0;
  
  private int l = 0;
  
  private int m = 0;
  
  public int a = 0;
  
  private int n = 0;
  
  private long[] o = null;
  
  private InputStream p = null;
  
  private final int d() throws IOException {
    if (this.e != null && this.i < this.j)
      return this.e[this.i++] & 0xFF; 
    int i;
    if (this.p != null && (i = this.p.read()) >= 0)
      return i; 
    throw new IOException();
  }
  
  private final int e() throws IOException {
    int i = d();
    return d() << 8 | i;
  }
  
  private final void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (this.e != null && this.i + paramInt2 <= this.j) {
      System.arraycopy(this.e, this.i, paramArrayOfbyte, paramInt1, paramInt2);
      this.i += paramInt2;
      return;
    } 
    if (this.p != null) {
      int i;
      while ((i = this.p.read(paramArrayOfbyte, paramInt1, paramInt2)) >= 0) {
        if ((paramInt2 -= i) <= 0)
          return; 
        paramInt1 += i;
      } 
    } 
    throw new IOException();
  }
  
  private final void a(InputStream paramInputStream, byte[] paramArrayOfbyte, boolean paramBoolean) {
    byte[] arrayOfByte = new byte[6];
    this.p = paramInputStream;
    this.e = paramArrayOfbyte;
    this.d = paramBoolean;
    this.f = this.g = null;
    for (byte b = 0; b < 'Ā'; b++) {
      long l = b;
      for (byte b1 = 0; b1 < 8; b1++)
        l = ((l & 0x1L) != 0L) ? (0xEDB88320L ^ l >> 1L) : (l >> 1L); 
      this.o[b] = l;
    } 
    try {
      a(arrayOfByte, 0, arrayOfByte.length);
      String str;
      if (!(str = new String(arrayOfByte)).equals("GIF87a") && !str.equals("GIF89a")) {
        this.e = null;
        this.p = null;
        throw new IllegalArgumentException("Illegal data format.");
      } 
      this.l = e();
      this.m = e();
      int i = d();
      d();
      d();
      if ((i & 0x80) != 0) {
        a(this.h, 0, (1 << (i & 0x7) + 1) * 3);
      } else {
        for (byte b1 = 0; b1 < '̀'; b1 += 3) {
          this.h[b1 + 2] = (byte)b1;
          this.h[b1 + 1] = (byte)b1;
          this.h[b1] = (byte)b1;
        } 
      } 
      if (this.p == null) {
        this.k = this.i;
        return;
      } 
      if (this.p.markSupported())
        this.p.mark(2147483647); 
      return;
    } catch (IOException iOException) {
      this.e = null;
      this.p = null;
      return;
    } 
  }
  
  private bf(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.h = new byte[768];
    this.o = new long[256];
    this.j = (this.i = paramInt1) + paramInt2;
    a((InputStream)null, paramArrayOfbyte, paramBoolean);
  }
  
  private static bf a(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return new bf(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramBoolean);
  }
  
  public static bf a(byte[] paramArrayOfbyte) {
    return a(paramArrayOfbyte, false);
  }
  
  private static void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte[paramInt1] = (byte)(paramInt2 >> 24);
    paramArrayOfbyte[paramInt1 + 1] = (byte)(paramInt2 >> 16);
    paramArrayOfbyte[paramInt1 + 2] = (byte)(paramInt2 >> 8);
    paramArrayOfbyte[paramInt1 + 3] = (byte)paramInt2;
  }
  
  private static void c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte[paramInt1] = (byte)paramInt2;
    paramArrayOfbyte[paramInt1 + 1] = (byte)(paramInt2 >> 8);
  }
  
  private final void d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = 4294967295L;
    for (int i = paramInt1; i < paramInt2; i++)
      l = this.o[(int)((l ^ paramArrayOfbyte[i]) & 0xFFL)] ^ l >> 8L; 
    b(paramArrayOfbyte, paramInt2, (int)(l ^ 0xFFFFFFFFFFFFFFFFL));
  }
  
  private final Image a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 * paramInt1;
    int j = i;
    int k = ++j * paramInt3;
    int m = 32767 / j * j;
    int n;
    int i1;
    byte[] arrayOfByte = new byte[(n = b.length) + c.length + (i1 = k + (k + m - 1) / m * 5 + 6) + 2];
    System.arraycopy(b, 0, arrayOfByte, 0, n);
    b(arrayOfByte, 16, paramInt2);
    b(arrayOfByte, 20, paramInt3);
    arrayOfByte[25] = (byte)((paramInt1 <= 3) ? 2 : 6);
    d(arrayOfByte, 12, n - 14);
    b(arrayOfByte, n - 10, i1);
    long l1 = 1L;
    long l2 = 0L;
    byte b1 = 0;
    byte b2 = b1;
    while (true) {
      int i2;
      boolean bool;
      if (k > m) {
        i2 = m;
        bool = false;
      } else {
        i2 = k;
        bool = true;
      } 
      arrayOfByte[n++] = (byte)bool;
      c(arrayOfByte, n, i2);
      n += 2;
      c(arrayOfByte, n, i2 ^ 0xFFFFFFFF);
      n += 2;
      int i3 = i2;
      while (i3-- > 0) {
        arrayOfByte[n++] = b2 ? paramArrayOfbyte[b1 * i + b2 - 1] : 0;
        l2 += l1 += ((b2 ? paramArrayOfbyte[b1 * i + b2 - 1] : 0) & 0xFF);
        if (++b2 > i) {
          b2 = 0;
          if (++b1 >= paramInt3)
            break; 
        } 
      } 
      if ((k -= i2) <= 0) {
        b(arrayOfByte, n, (int)(l2 % 65521L << 16L | l1 % 65521L));
        n += 4;
        d(arrayOfByte, b.length - 6, n);
        System.arraycopy(c, 0, arrayOfByte, n + 4, c.length);
        return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
      } 
    } 
  }
  
  private Image a(int paramInt, boolean paramBoolean) {
    try {
      byte[] arrayOfByte = new byte[768];
      this.n = 8;
      int i = 0;
      if (this.d && !paramBoolean)
        throw new IllegalArgumentException("Invalid frame request."); 
      while (true) {
        byte[] arrayOfByte1;
        byte[] arrayOfByte2;
        short s;
        int j;
        int k;
        int m;
        int n;
        int i1;
        int i2;
        int i3;
        switch (d()) {
          case 59:
            throw new Exception();
          case 33:
            if (d() != 249) {
              int i4;
              while ((i4 = d()) > 0) {
                if (this.e != null)
                  continue; 
                this.p.skip(i4);
              } 
              if ((this.i += i4) < this.j)
                continue; 
              throw new Exception();
            } 
            d();
            this.n = d();
            this.a = e();
            i = d();
            d();
          case 44:
            j = e();
            k = e();
            m = e();
            n = e();
            i1 = d();
            arrayOfByte2 = this.h;
            if ((i1 & 0x80) != 0)
              a(arrayOfByte2 = arrayOfByte, 0, (1 << (i1 & 0x7) + 1) * 3); 
            s = (short)d();
            i2 = 0;
            arrayOfByte1 = null;
            while ((i3 = d()) > 0) {
              byte[] arrayOfByte3 = new byte[i2 + i3 + 4];
              if (arrayOfByte1 != null)
                System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, i2); 
              a(arrayOfByte1 = arrayOfByte3, i2, i3);
              i2 += i3;
            } 
            if (--paramInt < 0 || !this.d) {
              int i4;
              int i5;
              int i6;
              int i7;
              byte b = (byte)(((this.n & 0x1) == 0) ? 3 : 4);
              if (paramBoolean) {
                i4 = m;
                i5 = n;
                i6 = i7 = 0;
              } else {
                i4 = this.l;
                i5 = this.m;
                i6 = j;
                i7 = k;
              } 
              int i8;
              int i9;
              byte[] arrayOfByte3 = new byte[i8 = (i9 = i4 * b) * i5];
              if (paramBoolean || (this.n & 0xC) == 8 || this.f == null) {
                for (byte b1 = 0; b1 < i8; b1++)
                  arrayOfByte3[b1] = 0; 
              } else {
                System.arraycopy(((this.n & 0x8) != 0) ? this.f : this.g, 0, arrayOfByte3, 0, i8);
              } 
              if (a(arrayOfByte1, arrayOfByte3, i6 * b + i7 * i9, s, m, n, ((i1 & 0x40) != 0), i9, b, ((this.n & 0x1) != 0) ? i : -1, arrayOfByte2) == 0)
                throw new Exception(); 
              if (!this.d && this.f == null) {
                System.arraycopy(arrayOfByte3, 0, this.f = new byte[i8], 0, i8);
                this.g = new byte[i8];
              } 
              if (!this.d)
                System.arraycopy(arrayOfByte3, 0, this.g, 0, i8); 
              this.n = 8;
              if (paramInt < 0) {
                Image image = a(arrayOfByte3, b, i4, i5);
                System.gc();
                return image;
              } 
            } 
        } 
      } 
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final Image a() {
    return a(0, this.d);
  }
  
  private boolean a(boolean paramBoolean) {
    if (this.e == null) {
      if (this.p == null)
        return false; 
      try {
        this.p.reset();
      } catch (IOException iOException) {
        return false;
      } 
    } else {
      this.i = this.k;
    } 
    if (this.d = paramBoolean)
      this.f = this.g = null; 
    if (this.f != null)
      System.arraycopy(this.f, 0, this.g, 0, this.f.length); 
    return true;
  }
  
  public final boolean b() {
    return a(this.d);
  }
  
  public final void c() {
    if (this.p != null)
      try {
        this.p.close();
        return;
      } catch (IOException iOException) {} 
  }
  
  private static byte[] a(byte[] paramArrayOfbyte, int paramInt) {
    int i;
    byte[] arrayOfByte = new byte[(i = paramArrayOfbyte.length) + paramInt];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  private final byte[] b(byte[] paramArrayOfbyte) {
    return a(paramArrayOfbyte, 4096);
  }
  
  private static short[] a(short[] paramArrayOfshort, int paramInt) {
    int i;
    short[] arrayOfShort = new short[(i = paramArrayOfshort.length) + paramInt];
    System.arraycopy(paramArrayOfshort, 0, arrayOfShort, 0, i);
    return arrayOfShort;
  }
  
  private final int a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, short paramShort, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfbyte3) {
    int i = paramInt1;
    short s1 = (short)(paramShort + 1);
    short s2;
    short s3 = (short)((s2 = (short)(1 << paramShort)) + 1);
    short s4 = (short)(s2 + 2);
    short s5 = s4;
    int j = 0;
    byte b1 = j;
    byte b2 = b1;
    long l = 0L;
    int k = paramInt2 * paramInt3;
    short s = 0;
    int m;
    byte[] arrayOfByte1 = new byte[m = 4097];
    int n;
    byte[] arrayOfByte2 = new byte[n = 4096];
    short[] arrayOfShort = new short[4096];
    while (b2 < k) {
      short s7;
      int i1 = 0;
      short s6 = (short)(int)(((paramArrayOfbyte1[(int)(l / 8L) + 3] & 0xFF) << 24 | (paramArrayOfbyte1[(int)(l / 8L) + 2] & 0xFF) << 16 | (paramArrayOfbyte1[(int)(l / 8L) + 1] & 0xFF) << 8 | (paramArrayOfbyte1[(int)(l / 8L) + 0] & 0xFF) << 0) >> (int)(l & 0x7L) & ((1 << s1) - 1));
      l += s1;
      if (s6 == s3)
        break; 
      if (s6 == s2) {
        s1 = (short)(paramShort + 1);
        s5 = s4;
        s = s6;
        continue;
      } 
      if (s6 < s5) {
        s7 = s6;
      } else {
        i1++;
        s7 = s;
      } 
      while (s7 >= s4) {
        if (i1 >= m)
          m = (arrayOfByte1 = b(arrayOfByte1)).length; 
        arrayOfByte1[i1++] = arrayOfByte2[s7];
        s7 = arrayOfShort[s7];
      } 
      if (i1 >= m)
        m = (arrayOfByte1 = b(arrayOfByte1)).length; 
      arrayOfByte1[i1++] = (byte)s7;
      if (s != s2) {
        arrayOfShort[s5] = s;
        s5 = (short)(s5 + 1);
        arrayOfByte2[s5] = (byte)s7;
        if (s5 >= n) {
          n = (arrayOfByte2 = a(arrayOfByte2, 4096)).length;
          arrayOfShort = a(arrayOfShort, 4096);
        } 
        if (s5 >= 1 << s1 && s1 < 12)
          s1 = (short)(s1 + 1); 
      } 
      s = s6;
      if (b2 + i1 > k)
        i1 = k - b2; 
      for (int i2 = i1 - 1; i2 >= 0; i2--) {
        if (j == paramInt2) {
          if (paramBoolean) {
            if ((b1 & 0x7) == 0) {
              b1 += true;
              if (b1 >= paramInt3)
                b1 = 4; 
            } else if ((b1 & 0x3) == 0) {
              b1 += 8;
              if (b1 >= paramInt3)
                b1 = 2; 
            } else if ((b1 & 0x1) == 0) {
              b1 += 4;
              if (b1 >= paramInt3)
                b1 = 1; 
            } else {
              b1 += 2;
            } 
          } else {
            b1++;
          } 
          i = paramInt1 + b1 * paramInt4;
          j = 0;
        } 
        int i3;
        if ((i3 = arrayOfByte1[i2] & 0xFF) == paramInt6) {
          i += paramInt5;
        } else {
          paramArrayOfbyte2[i++] = paramArrayOfbyte3[i3 * 3 + 0];
          paramArrayOfbyte2[i++] = paramArrayOfbyte3[i3 * 3 + 1];
          paramArrayOfbyte2[i++] = paramArrayOfbyte3[i3 * 3 + 2];
          if (paramInt5 > 3)
            paramArrayOfbyte2[i++] = -1; 
        } 
        b2++;
        j++;
      } 
    } 
    return (int)l;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bf.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */