package ui;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GFont {
  public static GFont font = null;
  
  private int[] colors;
  
  private int[] deltaX;
  
  private int[] deltaY;
  
  private int[] charW;
  
  private Image[] fonts;
  
  private int size;
  
  private int fontHeight;
  
  public GFont(String paramString) {
    try {
      InputStream inputStream;
      (inputStream = getClass().getResourceAsStream(paramString)).read();
      this.size = inputStream.read();
      this.fontHeight = inputStream.read();
      this.deltaX = new int[this.size];
      this.deltaY = new int[this.size];
      this.charW = new int[this.size];
      for (byte b = 0; b < this.size; b++) {
        this.deltaX[b] = readChar(inputStream);
        this.deltaY[b] = readChar(inputStream);
        this.charW[b] = inputStream.read();
      } 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private int readChar(InputStream paramInputStream) throws IOException {
    return paramInputStream.read() << 8 | paramInputStream.read();
  }
  
  public final void setImage(String paramString) {
    Image image = null;
    try {
      image = Image.createImage(paramString);
    } catch (Exception exception) {}
    createColor(image);
  }
  
  public final int getWidth(char paramChar) {
    char c;
    if ((c = paramChar) > '\037' && c < '')
      c -= ' '; 
    if (c > 'Џ' && c < 'ѐ')
      c -= 'Ω'; 
    if (c == 'Ё')
      c -= 'Ρ'; 
    return (c < '\000' || c >= this.size || c == '\r' || c == '\n') ? 0 : this.charW[c];
  }
  
  public final int getStringWidth(String paramString) {
    int i = 0;
    for (byte b = 0; b < paramString.length(); b++)
      i += getWidth(paramString.charAt(b)); 
    return i;
  }
  
  public final int getHeight() {
    return this.fontHeight;
  }
  
  public final void drawString(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, int paramInt3) {
    int i = paramGraphics.getClipX();
    int j = paramGraphics.getClipY();
    int k = paramGraphics.getClipWidth();
    int m = paramGraphics.getClipHeight();
    int n = paramInt1;
    int i1 = getIndex(paramInt3);
    for (byte b = 0;; b++) {
      if (b < paramString.length()) {
        int i2;
        if ((i2 = paramString.charAt(b) - 1) + 1 != 13 && i2 + 1 != 10) {
          if ((i2 = ((i2 = (i2 != 1024) ? ((i2 != 1104) ? i2 : 183) : 167) <= 1024) ? i2 : (i2 - 848)) > 30 && i2 < 127)
            i2 -= 31; 
          if (i2 > 166 && i2 < 172)
            i2 -= 70; 
          if (i2 == 183)
            i2 -= 82; 
          if (i2 > 190)
            i2 -= 88; 
          if (i2 >= 0 && i2 < this.size) {
            int i3 = this.charW[i2];
            int i4 = this.deltaX[i2];
            int i5 = this.deltaY[i2];
            int i6 = n - i4;
            int i7 = paramInt2 - i5;
            if (n < i)
              if (n + i3 > i) {
                i3 -= i - n;
                n = i;
              } else {
                n += i3;
                b++;
              }  
            if (n + i3 > i + k) {
              if (n >= i + k)
                break; 
              i3 = i + k - n;
            } 
            paramGraphics.setClip(n, paramInt2, i3, this.fontHeight);
            paramGraphics.drawImage(this.fonts[i1], i6, i7, 20);
            n += i3;
          } 
        } 
      } else {
        break;
      } 
    } 
    paramGraphics.setClip(i, j, k, m);
  }
  
  private int getIndex(int paramInt) {
    for (byte b = 0; b < this.colors.length; b++) {
      if (paramInt == this.colors[b])
        return b; 
    } 
    return 0;
  }
  
  void createColor(Image paramImage) {
    this.colors = new int[] { Config.get(1), Config.get(11), Colors.getInvColor(Config.get(8)) };
    this.fonts = new Image[this.colors.length];
    int i = paramImage.getHeight();
    int j = paramImage.getWidth();
    int[] arrayOfInt = new int[i * j];
    for (int k = this.fonts.length - 1; k >= 0; k--) {
      paramImage.getRGB(arrayOfInt, 0, j, 0, 0, j, i);
      for (int m = j * i - 1; m >= 0; m--) {
        if (arrayOfInt[m] == -16777216) {
          arrayOfInt[m] = arrayOfInt[m] | this.colors[k];
        } else {
          arrayOfInt[m] = 16777215;
        } 
      } 
      this.fonts[k] = Image.createRGBImage(arrayOfInt, j, i, true);
    } 
    arrayOfInt = null;
    paramImage = null;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar\\ui\GFont.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */