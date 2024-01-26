package ui;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class Colors {
  public static void drawRect(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i = (paramInt1 & 0xFF0000) >> 16;
    int j = (paramInt1 & 0xFF00) >> 8;
    int k = paramInt1 & 0xFF;
    int m = (paramInt2 & 0xFF0000) >> 16;
    int n = (paramInt2 & 0xFF00) >> 8;
    int i1 = paramInt2 & 0xFF;
    int i2 = (paramInt6 - paramInt4) / 3;
    if (i2 < 0)
      i2 = -i2; 
    if (i2 < 8)
      i2 = 8; 
    paramInt6++;
    paramInt5++;
    int i3 = 0;
    int i4 = 0;
    for (byte b = 0; b < i2; b++) {
      i3 = b * (paramInt6 - paramInt4) / i2 + paramInt4;
      i4 = (b + 1) * (paramInt6 - paramInt4) / i2 + paramInt4;
      if (i3 != i4) {
        paramGraphics.setColor(b * (m - i) / (i2 - 1) + i, b * (n - j) / (i2 - 1) + j, b * (i1 - k) / (i2 - 1) + k);
        paramGraphics.fillRect(paramInt3, i3, paramInt5 - paramInt3, i4 - i3);
      } 
    } 
  }
  
  public static void drawGradient(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    int i = 0;
    int j = 0;
    for (byte b = 0; b < paramInt6; b++) {
      paramGraphics.setColor(transformColor(paramInt5, (paramInt8 - paramInt7) * b / (paramInt6 - 1) + paramInt7));
      i = paramInt2 + b * paramInt4 / paramInt6;
      j = paramInt2 + (b * paramInt4 + paramInt4) / paramInt6;
      paramGraphics.fillRect(paramInt1, i, paramInt3, j - i);
    } 
  }
  
  static Image getImage(String paramString) {
    return get("/ui/res/" + paramString);
  }
  
  static Image get(String paramString) {
    try {
      return Image.createImage(paramString);
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public static int transformColor(int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return paramInt1; 
    int i = (paramInt1 & 0xFF) + paramInt2;
    int j = (paramInt1 >> 8 & 0xFF) + paramInt2;
    int k = (paramInt1 >> 16 & 0xFF) + paramInt2;
    if (i < 0) {
      i = 0;
    } else if (i > 255) {
      i = 255;
    } 
    if (j < 0) {
      j = 0;
    } else if (j > 255) {
      j = 255;
    } 
    if (k < 0) {
      k = 0;
    } else if (k > 255) {
      k = 255;
    } 
    return i | j << 8 | k << 16;
  }
  
  public static int getInvColor(int paramInt) {
    int i = paramInt & 0xFF;
    int j = (paramInt & 0xFF00) >> 8;
    int k = (paramInt & 0xFF0000) >> 16;
    return (i + j + k > 381) ? 0 : 16777215;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar\\ui\Colors.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */