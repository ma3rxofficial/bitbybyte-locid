package p;

import javax.microedition.lcdui.Font;

public class PlgFRStyles {
  public int a = 0;
  
  public int[] b;
  
  public int[] c;
  
  public int[] d;
  
  public int[] e;
  
  public int[] f;
  
  public int[] g;
  
  public int[] h;
  
  public int[] i;
  
  public int[] j;
  
  public int[] k;
  
  public int l;
  
  public int m;
  
  public int n;
  
  public Font o;
  
  public int p;
  
  public int q;
  
  public int r;
  
  public boolean s;
  
  public PlgFRStyles() {
    (new int[3])[0] = 0;
    (new int[3])[1] = 32;
    (new int[3])[2] = 64;
    this.b = new int[] { 0, 1, 2, 4 };
    this.c = new int[] { 8, 0, 16 };
    this.d = new int[32];
    this.e = new int[32];
    this.f = new int[32];
    this.g = new int[32];
    this.h = new int[32];
    this.i = new int[32];
    this.j = new int[32];
    this.k = new int[32];
    this.l = 0;
    this.m = 0;
    this.n = 0;
    this.r = -1;
    this.s = false;
    for (byte b = 0; b < 32; b++) {
      this.d[b] = b * 1193046;
      this.i[b] = this.d[b] ^ 0xFFFFFF;
      this.e[b] = this.c[(b + 1) % 3];
      this.g[b] = this.b[b / 3 % 4];
      this.h[b] = 5;
    } 
    this.j[1] = 3;
  }
  
  public PlgFRStyles(int paramInt) {
    (new int[3])[0] = 0;
    (new int[3])[1] = 32;
    (new int[3])[2] = 64;
    this.b = new int[] { 0, 1, 2, 4 };
    this.c = new int[] { 8, 0, 16 };
    this.d = new int[32];
    this.e = new int[32];
    this.f = new int[32];
    this.g = new int[32];
    this.h = new int[32];
    this.i = new int[32];
    this.j = new int[32];
    this.k = new int[32];
    this.l = 0;
    this.m = 0;
    this.n = 0;
    this.r = -1;
    this.s = false;
    a(paramInt);
  }
  
  public final void a(int paramInt) {
    int i;
    if ((i = paramInt + 1) >= this.c.length)
      i--; 
    this.f[0] = 64;
    switch (this.a) {
      case 0:
        this.d[0] = this.a;
        this.i[0] = this.d[0] ^ 0xFFFFFF;
        break;
      case 16777215:
        this.d[0] = this.a;
        this.i[0] = this.d[0] ^ 0xFFFFFF;
        break;
      case 1:
        this.d[0] = 0;
        this.i[0] = 8421504;
        break;
      case 2:
        this.d[0] = 0;
        this.i[0] = 11579568;
        break;
      default:
        this.d[0] = this.a;
        this.i[0] = this.d[0] ^ 0xFFFFFF;
        break;
    } 
    this.e[0] = this.c[paramInt];
    this.g[0] = 0;
    this.j[0] = 0;
    this.k[0] = 0;
    this.h[0] = 4;
    this.f[1] = 64;
    this.d[1] = this.d[0];
    this.i[1] = this.i[0];
    this.e[1] = this.c[i];
    this.g[1] = 1;
    this.j[1] = 0;
    this.k[1] = 4;
    this.h[1] = 0;
    this.f[2] = 64;
    this.d[2] = this.d[1];
    this.i[2] = this.i[1];
    this.e[2] = this.c[paramInt];
    this.g[2] = 1;
    this.j[2] = 0;
    this.k[2] = 2;
    this.h[2] = 0;
    this.f[3] = 64;
    this.d[3] = this.d[2];
    this.i[3] = this.i[2];
    this.e[3] = this.c[paramInt];
    this.g[3] = 0;
    this.j[3] = 0;
    this.k[3] = 2;
    this.h[3] = 0;
    this.f[4] = 32;
    this.d[4] = this.d[0];
    this.i[4] = this.i[0];
    this.e[4] = this.e[0];
    this.g[4] = this.g[0];
    this.j[4] = this.j[0];
    this.k[4] = this.k[0];
    this.h[4] = this.h[0];
    this.f[5] = this.f[0];
    this.d[5] = this.d[0] ^ 0xC0C0C0;
    this.i[5] = this.i[0];
    this.e[5] = this.e[0];
    this.g[5] = 2;
    this.j[5] = this.j[0];
    this.k[5] = this.k[0];
    this.h[5] = this.h[0];
    this.f[6] = this.f[0];
    this.d[6] = this.d[0];
    this.i[6] = this.i[0];
    this.e[6] = this.e[0];
    this.g[6] = 2;
    this.j[6] = this.j[0];
    this.k[6] = this.k[0];
    this.h[6] = this.h[0];
    this.f[7] = this.f[0];
    this.d[7] = this.d[0];
    this.i[7] = this.i[0];
    this.e[7] = this.e[0];
    this.g[7] = 4;
    this.j[7] = this.j[0];
    this.k[7] = this.k[0];
    this.h[7] = this.h[0];
    this.f[8] = this.f[0];
    this.d[8] = this.d[0];
    this.i[8] = this.i[0];
    this.e[8] = this.e[0];
    this.g[8] = 2;
    this.j[8] = this.j[0];
    this.k[8] = this.k[0];
    this.h[8] = 10;
    this.f[9] = this.f[0];
    this.d[9] = this.d[0];
    this.i[9] = this.i[0];
    this.e[9] = this.e[0];
    this.g[9] = this.g[0];
    this.h[9] = 0;
    this.j[9] = 0;
    this.k[9] = 0;
    this.f[10] = this.f[0];
    this.d[10] = 0;
    this.i[10] = this.i[0] ^ 0x404040;
    this.e[10] = this.e[0];
    this.g[10] = this.g[0];
    this.h[10] = 0;
    this.j[10] = 0;
    this.k[10] = 4;
    this.r = -1;
  }
  
  public static int b(int paramInt) {
    int i = paramInt & 0xFF;
    int j = paramInt >> 8 & 0xFF;
    int k = paramInt >> 16 & 0xFF;
    if (i >= 205) {
      j -= 100;
      k -= 100;
      if (j < 0)
        j = 0; 
      if (k < 0)
        k = 0; 
    } else {
      if (j > 205)
        j = 205; 
      if (k > 205)
        k = 205; 
    } 
    return i = (i = 255 + (j << 8)) + (k << 16);
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    if (paramInt == this.r && paramBoolean == this.s)
      return; 
    this.s = paramBoolean;
    this.r = paramInt;
    this.o = Font.getFont(this.f[paramInt], this.g[paramInt], this.e[paramInt]);
    this.q = this.d[paramInt];
    this.p = this.i[paramInt];
    this.m = this.k[paramInt];
    this.l = this.j[paramInt];
    this.n = this.h[paramInt];
    if (this.s)
      this.p = b(this.p); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgFRStyles.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */