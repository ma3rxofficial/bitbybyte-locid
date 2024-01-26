package mc;

import com.motorola.extensions.ScalableJPGImage;
import javax.microedition.lcdui.Image;

public final class b {
  public static Image a(String paramString, dd paramdd, int paramInt1, int paramInt2, int[] paramArrayOfint, byte[] paramArrayOfbyte) throws Exception {
    Image image = null;
    ScalableJPGImage scalableJPGImage = null;
    int[] arrayOfInt = new int[2];
    byte[] arrayOfByte = null;
    try {
      if (paramArrayOfbyte != null) {
        arrayOfByte = paramArrayOfbyte;
      } else if (paramdd == null) {
        arrayOfByte = cx.a(paramString, arrayOfInt, paramArrayOfint);
      } else {
        arrayOfByte = cx.a(paramdd, paramString, arrayOfInt);
      } 
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];
      int k = i;
      int m = j;
      int n = paramInt1 * 10000 / i;
      int i1 = paramInt2 * 10000 / j;
      int i2 = (n < i1) ? n : i1;
      if ((x.u && i2 > 10000) || (x.t && i2 < 10000)) {
        k = i * i2 / 10000;
        m = j * i2 / 10000;
      } 
      if (k > aw.p || m > aw.q) {
        int i3 = aw.p * m / k;
        int i4 = aw.p;
        if (i3 > aw.q) {
          i4 = k * aw.q / m;
          i3 = aw.q;
        } 
        k = i4;
        m = i3;
      } 
      if ((scalableJPGImage = ScalableJPGImage.createImage(arrayOfByte, 0, arrayOfByte.length, k, m)) != null)
        image = scalableJPGImage.getImage(); 
    } catch (Exception exception) {
      System.gc();
      throw exception;
    } catch (Error error) {
      System.gc();
      throw error;
    } 
    System.gc();
    return image;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\b.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */