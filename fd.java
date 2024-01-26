import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fd {
  public static fd a = null;
  
  private int e = em.g(6);
  
  private int f = em.g(7);
  
  private int g = em.g(1);
  
  private int[] h;
  
  private int[] i;
  
  private int[] j;
  
  private int[] k;
  
  private Image[] l = new Image[4];
  
  private int m;
  
  private int n;
  
  public int b = 0;
  
  public int c = 0;
  
  public static boolean d = false;
  
  public static void a() {
    if (!d && a == null && (em.h(15) || em.f(239) == 2));
  }
  
  private fd(String paramString1, String paramString2) {
    try {
      d = true;
      InputStream inputStream = getClass().getResourceAsStream(paramString1);
      this.b = 0;
      this.c = 0;
      if (inputStream == null) {
        this.m = 0;
        Image image;
        int i = (image = Image.createImage(paramString2)).getWidth();
        int j = image.getHeight();
        int[] arrayOfInt1 = new int[i];
        this.n = j - 1;
        image.getRGB(arrayOfInt1, 0, 1, 0, 0, 1, j);
        int k = arrayOfInt1[j - 1];
        byte b3 = -1;
        byte b4 = -1;
        byte b5;
        for (b5 = 0; b5 < j; b5++) {
          if (arrayOfInt1[b5] != k)
            if (b3 == -1) {
              b3 = b5;
            } else {
              b4 = b5;
            }  
        } 
        if (b3 == -1) {
          this.b = 0;
        } else {
          this.b = b3;
        } 
        if (b4 == -1) {
          this.c = 0;
        } else {
          this.c = this.n - b4 - 1;
        } 
        image.getRGB(arrayOfInt1, 0, i, 0, j - 1, i, 1);
        this.m = 0;
        for (b5 = 0; b5 < i; b5++) {
          if (arrayOfInt1[b5] != k)
            this.m++; 
        } 
        this.m /= 2;
        int[] arrayOfInt2 = new int[this.m * 2];
        byte b6 = 0;
        byte b7;
        for (b7 = 0; b7 < i; b7++) {
          if (arrayOfInt1[b7] != k)
            arrayOfInt2[b6++] = b7; 
        } 
        this.h = new int[this.m];
        this.i = null;
        this.j = new int[this.m];
        this.k = new int[this.m];
        for (b7 = 0; b7 < this.m; b7++) {
          this.h[b7] = arrayOfInt2[b7 * 2];
          this.j[b7] = arrayOfInt2[b7 * 2 + 1] - this.h[b7] + 1;
          int m = i;
          if (b7 < this.m - 1)
            m = arrayOfInt2[b7 * 2 + 2]; 
          this.k[b7] = m - this.h[b7];
        } 
        a(image);
        a = this;
        return;
      } 
      inputStream.read();
      this.m = inputStream.read();
      this.n = inputStream.read();
      byte b1 = 3;
      if (inputStream.available() / this.m > 4)
        b1 = 5; 
      this.h = new int[this.m];
      this.i = new int[this.m];
      this.j = new int[this.m];
      for (byte b2 = 0; b2 < this.m; b2++) {
        this.h[b2] = inputStream.read();
        if (b1 == 5)
          this.h[b2] = (this.h[b2] << 8) + inputStream.read(); 
        this.i[b2] = inputStream.read();
        if (b1 == 5)
          this.i[b2] = (this.i[b2] << 8) + inputStream.read(); 
        this.j[b2] = inputStream.read() + 1;
      } 
      b(paramString2);
      a = this;
      return;
    } catch (Exception exception) {
      a = null;
      return;
    } 
  }
  
  private void b(String paramString) {
    try {
      this.l[0] = Image.createImage(paramString);
    } catch (IOException iOException) {}
    c();
  }
  
  private void a(Image paramImage) {
    this.l[0] = paramImage;
    c();
  }
  
  private int a(char paramChar) {
    char c;
    if ((c = paramChar) > '\037' && c < '')
      c -= ' '; 
    if (c > 'Џ' && c < 'ѐ')
      c -= 'Ω'; 
    if (c == 'Ё')
      c -= 'Ρ'; 
    return (c < '\000' || c >= this.m || c == '\r' || c == '\n') ? 0 : this.j[c];
  }
  
  public final int a(String paramString) {
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++)
      i += a(paramString.charAt(b)); 
    return i;
  }
  
  public final int b() {
    return this.n - this.b - this.c;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, int paramInt3) {
    paramInt2 -= this.b;
    int i = paramGraphics.getClipX();
    int j = paramGraphics.getClipY();
    int k = paramGraphics.getClipWidth();
    int m = paramGraphics.getClipHeight();
    int n = paramInt1;
    byte b1 = 1;
    if (paramInt3 == this.g) {
      b1 = 1;
    } else if (paramInt3 == this.f) {
      b1 = 2;
    } else if (paramInt3 == this.e) {
      b1 = 3;
    } 
    for (byte b2 = 0;; b2++) {
      if (b2 < paramString.length()) {
        int i1;
        if ((i1 = paramString.charAt(b2) - 1) + 1 != 13 && i1 + 1 != 10) {
          if ((i1 = ((i1 = (i1 != 1024) ? ((i1 != 1104) ? i1 : 183) : 167) <= 1024) ? i1 : (i1 - 848)) > 30 && i1 < 127)
            i1 -= 31; 
          if (i1 > 166 && i1 < 172)
            i1 -= 70; 
          if (i1 == 183)
            i1 -= 82; 
          if (i1 > 190)
            i1 -= 88; 
          if (i1 >= 0 && i1 < this.m) {
            int i2 = this.j[i1];
            if (this.k != null)
              i2 = this.k[i1]; 
            if (i1 > 0) {
              int i3 = this.h[i1];
              int i4 = 0;
              if (this.i != null)
                i4 = this.i[i1]; 
              int i5 = n - i3;
              int i6 = paramInt2 - i4;
              if (n < i)
                if (n + i2 > i) {
                  i2 -= i - n;
                  n = i;
                } else {
                  n += i2;
                  b2++;
                }  
              if (n + i2 > i + k) {
                if (n >= i + k)
                  break; 
                i2 = i + k - n;
              } 
              paramGraphics.setClip(n, paramInt2, i2, this.n);
              paramGraphics.drawImage(this.l[b1], i5, i6, 20);
            } 
            n += i2;
          } 
        } 
      } else {
        break;
      } 
    } 
    paramGraphics.setClip(i, j, k, m);
  }
  
  private void c() {
    this.f = em.g(7);
    this.e = em.g(7);
    this.g = em.g(1);
    int[] arrayOfInt1 = { 0, this.g, this.f, this.e };
    int i = this.l[0].getHeight();
    int j = this.l[0].getWidth();
    int[] arrayOfInt2 = new int[i * j];
    for (byte b = 1; b < arrayOfInt1.length; b++) {
      byte b1;
      byte b2;
      this.l[0].getRGB(arrayOfInt2, 0, j, 0, 0, j, i);
      int k;
      if (((k = arrayOfInt2[1]) & 0xFF000000) != -16777216) {
        if ((arrayOfInt2[arrayOfInt2.length - 1] & 0xFFFFFF) == 16711680 && (k & 0xFF000000) != -16777216) {
          b1 = 3;
        } else {
          b1 = 0;
        } 
      } else if ((k & 0xFFFFFF) == 0) {
        b1 = 1;
      } else {
        b1 = 2;
      } 
      switch (b1) {
        case 0:
          for (b2 = 0; b2 < j * i; b2++)
            arrayOfInt2[b2] = arrayOfInt2[b2] & 0xFF000000 | arrayOfInt1[b]; 
          break;
        case 1:
          for (b2 = 0; b2 < j * i; b2++)
            arrayOfInt2[b2] = (arrayOfInt2[b2] & 0xFF0000) << 8 | arrayOfInt1[b]; 
          break;
        case 2:
          for (b2 = 0; b2 < j * i; b2++)
            arrayOfInt2[b2] = (arrayOfInt2[b2] & 0xFF0000) << 8 ^ 0xFF000000 | arrayOfInt1[b]; 
          break;
        case 3:
          if (b > 1)
            for (b2 = 0; b2 < j * i; b2++)
              arrayOfInt2[b2] = arrayOfInt2[b2] ^ 0xFFFFFF;  
          break;
      } 
      this.l[b] = Image.createRGBImage(arrayOfInt2, j, i, true);
    } 
    System.gc();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\fd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */