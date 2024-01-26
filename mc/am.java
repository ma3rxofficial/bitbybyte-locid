package mc;

import MiniCommander;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class am {
  private byte[][] j = (byte[][])null;
  
  private byte[][] k = (byte[][])null;
  
  private byte[] l = null;
  
  public int a = 0;
  
  public boolean b = false;
  
  public Font c = null;
  
  public String d = null;
  
  public Image e = null;
  
  public byte[] f = null;
  
  private char[] m = new char[256];
  
  public Vector g = new Vector();
  
  public int h = -1;
  
  public int[] i = null;
  
  public am() {
    this.j = new byte[256][];
    this.k = new byte[256][];
    this.l = new byte[256];
  }
  
  private void d() {
    this.c = null;
    this.a = 0;
    byte b;
    for (b = 0; b < this.j.length; b++) {
      this.j[b] = null;
      this.k[b] = null;
      this.l[b] = 0;
      this.m[b] = Character.MIN_VALUE;
    } 
    for (b = 0; b < this.g.size(); b++) {
      mc/cc mc/cc;
      (mc/cc = this.g.elementAt(b)).a = null;
      this.g.setElementAt(null, b);
    } 
    this.g.removeAllElements();
    this.e = null;
    this.f = null;
    this.d = null;
    System.gc();
  }
  
  public final boolean a() {
    d();
    this.c = Font.getDefaultFont();
    this.a = this.c.getHeight();
    this.b = true;
    return true;
  }
  
  public final boolean a(String paramString) {
    if (paramString == null)
      return a(); 
    d();
    this.d = paramString;
    this.b = false;
    Image image = null;
    byte b1 = 0;
    int[] arrayOfInt = new int[1];
    byte b2 = 0;
    int i = 0;
    int j = 0;
    try {
      j = (image = Image.createImage(paramString)).getHeight() - 1;
      byte[] arrayOfByte1 = new byte[30 * j];
      byte[] arrayOfByte2 = new byte[30 * j];
      byte b = 0;
      for (b1 = 32; b1 < 'Ā'; b1++) {
        byte b4 = b;
        while (b < image.getWidth()) {
          image.getRGB(arrayOfInt, 0, 1, b, j, 1, 1);
          b++;
          if (arrayOfInt[0] != 0) {
            i = b - b4;
            break;
          } 
        } 
        b2 = 0;
        for (byte b3 = 0; b3 < i; b3++) {
          for (byte b5 = 0; b5 < j; b5++) {
            image.getRGB(arrayOfInt, 0, 1, b3 + b4, b5, 1, 1);
            if (arrayOfInt[0] != 0) {
              arrayOfByte1[b2] = (byte)b3;
              arrayOfByte2[b2] = (byte)b5;
              b2++;
            } 
          } 
        } 
        this.j[b1] = new byte[b2];
        this.k[b1] = new byte[b2];
        System.arraycopy(arrayOfByte1, 0, this.j[b1], 0, b2);
        System.arraycopy(arrayOfByte2, 0, this.k[b1], 0, b2);
        this.m[b1] = (char)b4;
        this.l[b1] = (byte)i;
      } 
      this.a = j;
    } catch (Exception exception) {
      System.out.println("Exception: " + exception.getMessage());
      MiniCommander.a();
    } 
    return true;
  }
  
  private void e() {
    if (this.i != null)
      return; 
    this.i = new int[256];
    for (byte b = 0; b < 'Ā'; b++) {
      int i = b;
      for (byte b1 = 0; b1 < 8; b1++) {
        if ((i & 0x1) == 1) {
          i = 0xEDB88320 ^ i >>> 1;
        } else {
          i >>>= 1;
        } 
      } 
      this.i[b] = i;
    } 
  }
  
  private int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i;
    for (i = -1; paramInt2-- > 0; i = this.i[(i ^ j) & 0xFF] ^ i >>> 8)
      int j = paramArrayOfbyte[paramInt1++] & 0xFF; 
    return i ^ 0xFFFFFFFF;
  }
  
  public final void a(int paramInt) throws Exception {
    if (this.f == null)
      return; 
    int i = this.g.size();
    for (byte b = 0; b < i; b++) {
      mc/cc mc/cc;
      if ((mc/cc = this.g.elementAt(b)).b == paramInt)
        return; 
    } 
    this.f[96] = 0;
    this.f[97] = (byte)((paramInt & 0xFF0000) >> 16);
    this.f[98] = (byte)((paramInt & 0xFF00) >> 8);
    this.f[99] = (byte)(paramInt & 0xFF);
    long l = a(this.f, 90, 10);
    this.f[100] = (byte)(int)((l & 0xFF000000L) >> 24L);
    this.f[101] = (byte)(int)((l & 0xFF0000L) >> 16L);
    this.f[102] = (byte)(int)((l & 0xFF00L) >> 8L);
    this.f[103] = (byte)(int)(l & 0xFFL);
    ByteArrayInputStream byteArrayInputStream;
    Image image = Image.createImage(byteArrayInputStream = new ByteArrayInputStream(this.f));
    this.g.addElement(new mc/cc(this, image, paramInt));
  }
  
  private void c(int paramInt) throws Exception {
    if (this.f == null)
      return; 
    if (this.h == paramInt)
      return; 
    int i = this.g.size();
    for (byte b = 0; b < i; b++) {
      mc/cc mc/cc;
      if ((mc/cc = this.g.elementAt(b)).b == paramInt) {
        this.h = paramInt;
        this.e = mc/cc.a;
        return;
      } 
    } 
    a(paramInt);
    c(paramInt);
  }
  
  public final void b() {
    if (this.d == null || this.f != null)
      return; 
    try {
      e();
      InputStream inputStream = getClass().getResourceAsStream(this.d);
      this.f = new byte[inputStream.available()];
      inputStream.read(this.f);
      inputStream.close();
      this.e = null;
      return;
    } catch (Exception exception) {
      System.out.println("Exception: " + exception.getMessage());
    } catch (Error error) {
      System.out.println("Error: " + error.getMessage());
    } 
    c();
  }
  
  public final void c() {
    for (byte b = 0; b < this.g.size(); b++) {
      mc/cc mc/cc;
      (mc/cc = this.g.elementAt(b)).a = null;
      this.g.setElementAt(null, b);
    } 
    this.g.removeAllElements();
    this.e = null;
    this.f = null;
    System.gc();
    this.h = -1;
  }
  
  public final int a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    int i = 0;
    d(paramString);
    int j = 0;
    int[] arrayOfInt = f(paramString);
    int k = paramString.length();
    if (this.b || this.f == null)
      return b(paramGraphics, paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint); 
    try {
      c(paramInt4);
    } catch (Exception exception) {
      return b(paramGraphics, paramString, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
    } 
    byte b;
    for (b = 0; b < k; b++) {
      if ((j = arrayOfInt[b]) > 32 && j < 256) {
        if (paramInt3 != 0 && i + this.l[j] > paramInt3)
          break; 
        paramGraphics.drawRegion(this.e, this.m[j], 0, this.l[j], this.a, 0, paramInt1 + i, paramInt2, 20);
        i += this.l[j];
      } else {
        if (paramInt3 != 0 && i + this.l[32] > paramInt3)
          break; 
        i += this.l[32];
      } 
    } 
    if (paramArrayOfint != null)
      paramArrayOfint[0] = b; 
    return i;
  }
  
  private static int[] f(String paramString) {
    int[] arrayOfInt;
    int i = (arrayOfInt = new int[paramString.length()]).length;
    for (byte b = 0; b < i; b++) {
      int j;
      if ((j = paramString.charAt(b)) == 'ё') {
        j = 184;
      } else if (j == 1025) {
        j = 168;
      } else if (j >= 1040 && j <= 1103) {
        j = j - 1040 + 192;
      } 
      if (j > 255)
        j = 32; 
      arrayOfInt[b] = j;
    } 
    return arrayOfInt;
  }
  
  public static byte[] b(String paramString) {
    byte[] arrayOfByte;
    int i = (arrayOfByte = new byte[paramString.length()]).length;
    for (byte b = 0; b < i; b++) {
      int j;
      if ((j = paramString.charAt(b)) == 'ё') {
        j = 184;
      } else if (j == 1025) {
        j = 168;
      } else if (j >= 1040 && j <= 1103) {
        j = j - 1040 + 192;
      } 
      if (j > 255)
        j = 32; 
      arrayOfByte[b] = (byte)j;
    } 
    return arrayOfByte;
  }
  
  public static String a(byte[] paramArrayOfbyte) {
    StringBuffer stringBuffer = new StringBuffer(paramArrayOfbyte.length);
    int i = paramArrayOfbyte.length;
    for (byte b = 0; b < i; b++) {
      int j;
      if ((j = paramArrayOfbyte[b]) == -88) {
        j = 1025;
      } else if (j == -72) {
        j = 1105;
      } else if (j > -72 && j < 0) {
        j = 1104 + j;
      } else {
        j &= 0xFF;
      } 
      stringBuffer.append((char)j);
    } 
    return new String(stringBuffer);
  }
  
  public static String b(byte[] paramArrayOfbyte) {
    StringBuffer stringBuffer = new StringBuffer(paramArrayOfbyte.length);
    int i = paramArrayOfbyte.length;
    for (byte b = 0; b < i; b++) {
      int j;
      if ((j = paramArrayOfbyte[b] & 0xFF) == 240) {
        j = 1025;
      } else if (j == 241) {
        j = 1105;
      } else if ((j >= 128 && j <= 159) || (j >= 160 && j <= 175)) {
        j = 1040 + j - 128;
      } else if (j >= 224 && j <= 239) {
        j = 1088 + j - 224;
      } 
      stringBuffer.append((char)j);
    } 
    return new String(stringBuffer);
  }
  
  public static byte[] c(String paramString) {
    byte[] arrayOfByte;
    int i = (arrayOfByte = new byte[paramString.length()]).length;
    for (byte b = 0; b < i; b++) {
      int j;
      if ((j = paramString.charAt(b)) == 'ё') {
        j = 241;
      } else if (j == 1025) {
        j = 240;
      } else if ((j >= 1040 && j <= 1071) || (j >= 1072 && j <= 1087)) {
        j = j - 1040 + 128;
      } 
      if (j >= 1088 && j <= 1103)
        j = j - 1088 + 224; 
      if (j > 255)
        j = 32; 
      arrayOfByte[b] = (byte)j;
    } 
    return arrayOfByte;
  }
  
  public final int d(String paramString) {
    return a(paramString, 0, (int[])null);
  }
  
  public final int e(String paramString) {
    return a(paramString, 0, (int[])null);
  }
  
  public final int a(String paramString, int paramInt, int[] paramArrayOfint) {
    int i = 0;
    int[] arrayOfInt = f(paramString);
    int j = paramString.length();
    if (this.b) {
      byte b;
      for (b = 0; b < j; b++) {
        int k = this.c.charWidth(paramString.charAt(b));
        if (paramInt != 0 && i + k > paramInt)
          break; 
        i += k;
      } 
      if (paramArrayOfint != null)
        paramArrayOfint[0] = b; 
    } else {
      byte b;
      for (b = 0; b < j; b++) {
        int k;
        if ((k = arrayOfInt[b]) > 32 && k < 256) {
          if (paramInt != 0 && i + this.l[k] > paramInt)
            break; 
          i += this.l[k];
        } else {
          if (paramInt != 0 && i + this.l[32] > paramInt)
            break; 
          i += this.l[32];
        } 
      } 
      if (paramArrayOfint != null)
        paramArrayOfint[0] = b; 
    } 
    return i;
  }
  
  public final int b(int paramInt) {
    if (this.b)
      return this.c.charWidth((char)paramInt); 
    if (paramInt == 1105) {
      paramInt = 184;
    } else if (paramInt == 1025) {
      paramInt = 168;
    } else if (paramInt >= 1040) {
      paramInt = paramInt - 1040 + 192;
    } 
    if (paramInt > 255 || paramInt < 32)
      paramInt = 32; 
    return this.l[paramInt];
  }
  
  public final String a(String paramString, int paramInt) {
    String str1;
    if (paramString == null)
      return ""; 
    if (paramString.length() == 0)
      return ""; 
    if (paramString.charAt(0) != '/') {
      str1 = "";
    } else if ((str1 = cx.i(paramString)) == null) {
      str1 = "";
    } 
    if (str1.length() >= paramString.length())
      str1 = ""; 
    String str2 = paramString.substring(str1.length());
    if (d(paramString) > paramInt)
      for (str2 = str2.substring(3);; str2 = str2.substring(1)) {
        paramString = str1 + "..." + str2;
        if (d(paramString) <= paramInt || str2.length() == 0)
          break; 
      }  
    return paramString;
  }
  
  public final int a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return b(paramGraphics, paramString, paramInt1, paramInt2, paramInt3, paramInt4, null);
  }
  
  public final int b(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    int i = 0;
    int j = d(paramString);
    int k = 0;
    int m = paramString.length();
    int[] arrayOfInt = f(paramString);
    if (this.b) {
      byte b;
      for (b = 0; b < m; b++) {
        k = paramString.charAt(b);
        int n = this.c.charWidth((char)k);
        if (paramInt3 != 0 && i + n > paramInt3)
          break; 
        i += n;
      } 
      if (paramArrayOfint != null)
        paramArrayOfint[0] = b; 
      if (MiniCommander.c == 2) {
        if (paramInt1 < 0)
          paramInt1 = 0; 
        if (paramInt2 < 0)
          paramInt2 = 0; 
      } 
      paramGraphics.setColor(paramInt4);
      paramGraphics.drawSubstring(paramString, 0, b, paramInt1, paramInt2, 20);
    } else {
      int[] arrayOfInt1 = new int[j * this.a];
      paramInt4 |= 0xFF000000;
      byte b;
      for (b = 0; b < m; b++) {
        if ((k = arrayOfInt[b]) > 32 && k < 256) {
          if (paramInt3 != 0 && i + this.l[k] > paramInt3)
            break; 
          int n = (this.j[k]).length;
          for (byte b1 = 0; b1 < n; b1++)
            arrayOfInt1[i + this.j[k][b1] + this.k[k][b1] * j] = paramInt4; 
          i += this.l[k];
        } else {
          if (paramInt3 != 0 && i + this.l[32] > paramInt3)
            break; 
          i += this.l[32];
        } 
      } 
      if (paramArrayOfint != null)
        paramArrayOfint[0] = b; 
      if (MiniCommander.c == 2) {
        if (paramInt1 < 0)
          paramInt1 = 0; 
        if (paramInt2 < 0)
          paramInt2 = 0; 
      } 
      paramGraphics.drawRGB(arrayOfInt1, 0, j, paramInt1, paramInt2, i, this.a, true);
    } 
    return i;
  }
  
  class mc/cc {
    public Image a;
    
    public int b;
    
    public mc/cc(am this$0, Image param1Image, int param1Int) {
      this.a = param1Image;
      this.b = param1Int;
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\am.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */