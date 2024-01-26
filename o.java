import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Image;

public final class o {
  private static int[] a = null;
  
  private static int[] a(Image paramImage) {
    int i = paramImage.getWidth();
    int j = paramImage.getHeight();
    int[] arrayOfInt = new int[i * j];
    paramImage.getRGB(arrayOfInt, 0, i, 0, 0, i, j);
    return arrayOfInt;
  }
  
  public static byte[] a(int paramInt1, int paramInt2, Image paramImage) {
    byte[] arrayOfByte3 = { -119, 80, 78, 71, 13, 10, 26, 10 };
    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(13);
    DataOutputStream dataOutputStream;
    (dataOutputStream = new DataOutputStream(byteArrayOutputStream2)).writeInt(paramInt1);
    dataOutputStream.writeInt(paramInt2);
    dataOutputStream.writeByte(8);
    dataOutputStream.writeByte(6);
    dataOutputStream.writeByte(0);
    dataOutputStream.writeByte(0);
    dataOutputStream.writeByte(0);
    byte[] arrayOfByte4 = a("IHDR", byteArrayOutputStream2.toByteArray());
    int[] arrayOfInt = a(paramImage);
    byte[] arrayOfByte1 = ca(c(paramInt1, paramInt2, arrayOfInt));
    byte[] arrayOfByte2 = a("IDAT", arrayOfByte1);
    arrayOfByte1 = a("IEND", new byte[0]);
    a = null;
    System.gc();
    ByteArrayOutputStream byteArrayOutputStream1;
    (byteArrayOutputStream1 = new ByteArrayOutputStream(arrayOfByte3.length + arrayOfByte4.length + arrayOfByte2.length + arrayOfByte1.length)).write(arrayOfByte3);
    byteArrayOutputStream1.write(arrayOfByte4);
    byteArrayOutputStream1.write(arrayOfByte2);
    byteArrayOutputStream1.write(arrayOfByte1);
    arrayOfByte2 = byteArrayOutputStream1.toByteArray();
    System.gc();
    return arrayOfByte2;
  }
  
  private static byte[] c(int paramInt1, int paramInt2, int[] paramArrayOfint) {
    byte b1 = 0;
    byte b2 = 0;
    byte[] arrayOfByte = new byte[4 * paramInt1 * paramInt2 + paramInt2];
    for (byte b3 = 0; b3 < paramInt2; b3++) {
      arrayOfByte[b2++] = 0;
      for (byte b = 0; b < paramInt1; b++) {
        arrayOfByte[b2++] = (byte)(paramArrayOfint[b1] >> 16);
        arrayOfByte[b2++] = (byte)(paramArrayOfint[b1] >> 8);
        arrayOfByte[b2++] = (byte)paramArrayOfint[b1];
        arrayOfByte[b2++] = paramArrayOfint[b1++] >> 24;
      } 
    } 
    return arrayOfByte;
  }
  
  private static byte[] ca(byte[] paramArrayOfbyte) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfbyte.length + 6 + paramArrayOfbyte.length / 32000 * 5);
    DataOutputStream dataOutputStream;
    (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeByte(8);
    dataOutputStream.writeByte(29);
    byte b;
    for (b = 0; paramArrayOfbyte.length - b > 32000; b += 32000)
      a(dataOutputStream, false, paramArrayOfbyte, b, '紀'); 
    a(dataOutputStream, true, paramArrayOfbyte, b, (char)(paramArrayOfbyte.length - b));
    dataOutputStream.writeInt(a(paramArrayOfbyte));
    paramArrayOfbyte = byteArrayOutputStream.toByteArray();
    System.gc();
    return paramArrayOfbyte;
  }
  
  private static byte[] a(String paramString, byte[] paramArrayOfbyte) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfbyte.length + 12);
    DataOutputStream dataOutputStream;
    (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeInt(paramArrayOfbyte.length);
    byte[] arrayOfByte = new byte[4];
    int i;
    for (i = 0; i < 4; i++)
      arrayOfByte[i] = (byte)paramString.charAt(i); 
    dataOutputStream.write(arrayOfByte);
    dataOutputStream.write(paramArrayOfbyte);
    i = a(a(-1, arrayOfByte), paramArrayOfbyte);
    dataOutputStream.writeInt(i ^ 0xFFFFFFFF);
    paramArrayOfbyte = byteArrayOutputStream.toByteArray();
    System.gc();
    return paramArrayOfbyte;
  }
  
  private static int a(int paramInt, byte[] paramArrayOfbyte) {
    if (a == null) {
      a = new int[256];
      for (byte b1 = 0; b1 < 'Ā'; b1++) {
        int i = b1;
        for (byte b2 = 0; b2 < 8; b2++)
          i = ((i & 0x1) > 0) ? (0xEDB88320 ^ i >>> 1) : (i >>> 1); 
        a[b1] = i;
      } 
    } 
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      paramInt = a[(paramInt ^ paramArrayOfbyte[b]) & 0xFF] ^ paramInt >>> 8; 
    return paramInt;
  }
  
  private static void a(DataOutputStream paramDataOutputStream, boolean paramBoolean, byte[] paramArrayOfbyte, int paramInt, char paramChar) {
    paramDataOutputStream.writeByte((byte)(paramBoolean ? 1 : 0));
    paramDataOutputStream.writeByte((byte)paramChar);
    paramDataOutputStream.writeByte((byte)(paramChar >> 8));
    paramDataOutputStream.writeByte((byte)(paramChar ^ 0xFFFFFFFF));
    paramDataOutputStream.writeByte((byte)((paramChar ^ 0xFFFFFFFF) >> 8));
    paramDataOutputStream.write(paramArrayOfbyte, paramInt, paramChar);
  }
  
  private static int a(byte[] paramArrayOfbyte) {
    int i = 1;
    int j = 0;
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      byte b1 = (paramArrayOfbyte[b] >= 0) ? paramArrayOfbyte[b] : (paramArrayOfbyte[b] + 256);
      i = (i + b1) % 65521;
      j = (j + i) % 65521;
    } 
    return (j << 16) + i;
  }
  
  public static byte[] b(int paramInt1, int paramInt2, Image paramImage) {
    int i = (4 - paramInt1 % 4) % 4;
    int j = 54 + paramInt2 * (i + paramInt1 * 3);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(j);
    DataOutputStream dataOutputStream;
    (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeByte(66);
    dataOutputStream.writeByte(77);
    dataOutputStream.writeInt(a(j));
    dataOutputStream.writeInt(0);
    dataOutputStream.writeInt(a(54));
    dataOutputStream.writeInt(a(40));
    dataOutputStream.writeInt(a(paramInt1));
    dataOutputStream.writeInt(a(paramInt2));
    dataOutputStream.writeShort(a((short)1));
    dataOutputStream.writeShort(a((short)24));
    dataOutputStream.writeInt(0);
    dataOutputStream.writeInt(0);
    dataOutputStream.writeInt(0);
    dataOutputStream.writeInt(0);
    dataOutputStream.writeInt(0);
    dataOutputStream.writeInt(0);
    int[] arrayOfInt = a(paramImage);
    while (--paramInt2 >= 0) {
      byte b;
      for (b = 0; b < paramInt1; b++) {
        int k = arrayOfInt[b + paramInt1 * paramInt2];
        dataOutputStream.writeByte(k & 0xFF);
        dataOutputStream.writeByte(k >>> 8 & 0xFF);
        dataOutputStream.writeByte(k >>> 16 & 0xFF);
      } 
      for (b = 0; b < i; b++)
        dataOutputStream.writeByte(0); 
      paramInt2--;
    } 
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    byteArrayOutputStream.close();
    if (arrayOfByte.length != j)
      throw new RuntimeException("bad math"); 
    return arrayOfByte;
  }
  
  private static int a(int paramInt) {
    int i = paramInt & 0xFF;
    int j = paramInt >> 8 & 0xFF;
    int k = paramInt >> 16 & 0xFF;
    paramInt >>>= 24;
    return i << 24 | j << 16 | k << 8 | paramInt;
  }
  
  private static short a(short paramShort) {
    int j = paramShort & 0xFF;
    int i = paramShort >> 8 & 0xFF;
    return (short)(j << 8 | i);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\o.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */