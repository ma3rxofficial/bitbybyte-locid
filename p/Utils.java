package p;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class Utils {
  static String lowerCase(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    paramString = paramString.toLowerCase();
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      if (c > 'Џ' && c < 'а') {
        stringBuffer.append((char)(c + 32));
      } else {
        stringBuffer.append(c);
      } 
    } 
    return stringBuffer.toString();
  }
  
  static String[] explode(String paramString, char paramChar) {
    Vector vector = new Vector();
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      if (c == paramChar) {
        vector.addElement(stringBuffer.toString());
        stringBuffer.delete(0, stringBuffer.length());
      } else {
        stringBuffer.append(c);
      } 
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  static void drawGradient(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    int i = 0;
    int j = 0;
    for (byte b = 0; b < paramInt6; b++) {
      paramGraphics.setColor(transformColorLight(paramInt5, (paramInt8 - paramInt7) * b / (paramInt6 - 1) + paramInt7));
      i = paramInt2 + b * paramInt4 / paramInt6;
      j = paramInt2 + (b * paramInt4 + paramInt4) / paramInt6;
      paramGraphics.fillRect(paramInt1, i, paramInt3, j - i);
    } 
  }
  
  static int transformColorLight(int paramInt1, int paramInt2) {
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
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\Utils.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */