package KD;

import javax.microedition.rms.RecordStore;

public final class ag {
  public static final String[] a = new String[] { ".mp3", ".aac", ".wma", ".wav", ".amr", ".m4a", ".mid", ".midi", ".awb", ".au" };
  
  public static final String[] b = new String[] { ".3gp", ".mp4", ".m4v", ".wmv", ".mpg" };
  
  public final String[] c = new String[] { ".wav", ".mp3", ".aac", ".amr", ".wma", ".mid", ".3gp", ".mp4" };
  
  private RecordStore i;
  
  public boolean d;
  
  public boolean e;
  
  public int f;
  
  public long g;
  
  public byte h;
  
  public final void a() {
    try {
      this.i = RecordStore.openRecordStore("KD_PL_RMS", true);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void b() {
    if (this.i != null)
      try {
        this.i.closeRecordStore();
        return;
      } catch (Exception exception) {} 
  }
  
  private boolean i() {
    boolean bool = false;
    try {
      byte[] arrayOfByte;
      if (this.i.getNumRecords() == 10 && (arrayOfByte = this.i.getRecord(1)) != null && arrayOfByte.length > 0 && arrayOfByte[0] == 1)
        bool = true; 
    } catch (Exception exception) {}
    return bool;
  }
  
  public final byte c() {
    byte b = 0;
    if (i())
      try {
        byte[] arrayOfByte;
        if ((arrayOfByte = this.i.getRecord(2)) != null && arrayOfByte.length > 0)
          b = arrayOfByte[0]; 
      } catch (Exception exception) {} 
    return b;
  }
  
  public final String[] d() {
    String[] arrayOfString = null;
    if (i()) {
      try {
        byte[] arrayOfByte;
        if ((arrayOfByte = this.i.getRecord(3)) != null && arrayOfByte.length > 0)
          arrayOfString = u.c(a(arrayOfByte)); 
      } catch (Exception exception) {}
    } else {
      try {
        String str;
        if ((str = System.getProperty("fileconn.dir.music")) != null && str.length() > 0)
          (arrayOfString = new String[1])[0] = str.substring(7, str.length()); 
      } catch (Exception exception) {}
    } 
    return arrayOfString;
  }
  
  public final String[] e() {
    String[] arrayOfString = null;
    if (i()) {
      try {
        byte[] arrayOfByte;
        if ((arrayOfByte = this.i.getRecord(4)) != null && arrayOfByte.length > 0)
          arrayOfString = u.c(new String(arrayOfByte)); 
      } catch (Exception exception) {}
    } else {
      arrayOfString = this.c;
    } 
    return arrayOfString;
  }
  
  public final void f() {
    this.d = false;
    this.e = false;
    this.f = 0;
    this.g = 1L;
    this.h = 5;
    if (i())
      try {
        byte[] arrayOfByte;
        if ((arrayOfByte = this.i.getRecord(5)) != null && arrayOfByte.length == 15) {
          this.d = b(arrayOfByte[0]);
          this.e = b(arrayOfByte[1]);
          byte[] arrayOfByte1 = new byte[4];
          byte b;
          for (b = 0; b < 4; b++)
            arrayOfByte1[b] = arrayOfByte[b + 2]; 
          this.f = c(arrayOfByte1);
          arrayOfByte1 = new byte[8];
          for (b = 0; b < 8; b++)
            arrayOfByte1[b] = arrayOfByte[b + 6]; 
          this.g = d(arrayOfByte1);
          this.h = arrayOfByte[14];
        } 
        return;
      } catch (Exception exception) {} 
  }
  
  public final void a(y paramy) {
    if (paramy != null && i())
      try {
        byte[] arrayOfByte;
        if ((arrayOfByte = this.i.getRecord(6)) != null)
          paramy.a = u.c(a(arrayOfByte)); 
        if ((arrayOfByte = this.i.getRecord(7)) != null)
          paramy.b = f(arrayOfByte); 
        if ((arrayOfByte = this.i.getRecord(8)) != null)
          paramy.c = e(arrayOfByte); 
        if ((arrayOfByte = this.i.getRecord(9)) != null)
          paramy.e = u.c(a(arrayOfByte)); 
        return;
      } catch (Exception exception) {
        paramy.a = null;
        paramy.b = null;
        paramy.c = null;
        paramy.e = null;
      }  
  }
  
  public final void g() {
    this.d = true;
    this.e = false;
    if (i())
      try {
        byte[] arrayOfByte;
        if ((arrayOfByte = this.i.getRecord(10)) != null && arrayOfByte.length == 2) {
          this.d = b(arrayOfByte[0]);
          this.e = b(arrayOfByte[1]);
        } 
        return;
      } catch (Exception exception) {} 
  }
  
  public final void h() {
    if (this.i != null)
      try {
        byte[] arrayOfByte;
        (arrayOfByte = new byte[1])[0] = 1;
        if (this.i.getNumRecords() < 1)
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length); 
        return;
      } catch (Exception exception) {} 
  }
  
  public final void a(byte paramByte) {
    if (this.i != null)
      try {
        byte[] arrayOfByte;
        (arrayOfByte = new byte[1])[0] = paramByte;
        if (this.i.getNumRecords() < 2) {
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.i.setRecord(2, arrayOfByte, 0, arrayOfByte.length);
          return;
        } 
      } catch (Exception exception) {} 
  }
  
  public final void a(String[] paramArrayOfString) {
    if (this.i != null) {
      byte[] arrayOfByte = a(c(paramArrayOfString));
      try {
        if (this.i.getNumRecords() < 3) {
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.i.setRecord(3, arrayOfByte, 0, arrayOfByte.length);
          return;
        } 
      } catch (Exception exception) {}
    } 
  }
  
  public final void b(String[] paramArrayOfString) {
    if (paramArrayOfString != null && this.i != null) {
      String str;
      byte[] arrayOfByte = (str = c(paramArrayOfString)).getBytes();
      try {
        if (this.i.getNumRecords() < 4) {
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.i.setRecord(4, arrayOfByte, 0, arrayOfByte.length);
          return;
        } 
      } catch (Exception exception) {}
    } 
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt, long paramLong, byte paramByte) {
    if (this.i != null) {
      byte[] arrayOfByte1;
      (arrayOfByte1 = new byte[15])[0] = a(paramBoolean1);
      arrayOfByte1[1] = a(paramBoolean2);
      byte[] arrayOfByte2 = a(paramInt);
      byte b;
      for (b = 0; b < arrayOfByte2.length; b++)
        arrayOfByte1[b + 2] = arrayOfByte2[b]; 
      arrayOfByte2 = a(paramLong);
      for (b = 0; b < arrayOfByte2.length; b++)
        arrayOfByte1[b + 6] = arrayOfByte2[b]; 
      arrayOfByte1[14] = paramByte;
      try {
        if (this.i.getNumRecords() < 5) {
          this.i.addRecord(arrayOfByte1, 0, arrayOfByte1.length);
        } else {
          this.i.setRecord(5, arrayOfByte1, 0, arrayOfByte1.length);
          return;
        } 
      } catch (Exception exception) {}
    } 
  }
  
  public final void b(y paramy) {
    if (paramy != null && this.i != null)
      try {
        byte[] arrayOfByte = a(c(paramy.a));
        if (this.i.getNumRecords() < 6) {
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.i.setRecord(6, arrayOfByte, 0, arrayOfByte.length);
        } 
        arrayOfByte = a(paramy.b);
        if (this.i.getNumRecords() < 7) {
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.i.setRecord(7, arrayOfByte, 0, arrayOfByte.length);
        } 
        arrayOfByte = a(paramy.c);
        if (this.i.getNumRecords() < 8) {
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.i.setRecord(8, arrayOfByte, 0, arrayOfByte.length);
        } 
        arrayOfByte = a(c(paramy.e));
        if (this.i.getNumRecords() < 9) {
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.i.setRecord(9, arrayOfByte, 0, arrayOfByte.length);
          return;
        } 
      } catch (Exception exception) {} 
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.i != null) {
      byte[] arrayOfByte;
      (arrayOfByte = new byte[2])[0] = a(paramBoolean1);
      arrayOfByte[1] = a(paramBoolean2);
      try {
        if (this.i.getNumRecords() < 10) {
          this.i.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.i.setRecord(10, arrayOfByte, 0, arrayOfByte.length);
          return;
        } 
      } catch (Exception exception) {}
    } 
  }
  
  private static String c(String[] paramArrayOfString) {
    StringBuffer stringBuffer = new StringBuffer();
    if (paramArrayOfString != null)
      for (byte b = 0; b < paramArrayOfString.length; b++)
        stringBuffer.append(paramArrayOfString[b] + '|');  
    return stringBuffer.toString();
  }
  
  private String a(byte[] paramArrayOfbyte) {
    StringBuffer stringBuffer = new StringBuffer();
    int i;
    if (paramArrayOfbyte != null && (i = paramArrayOfbyte.length) > 1) {
      byte[] arrayOfByte = new byte[2];
      byte b = 0;
      while (b < i - 1) {
        arrayOfByte[0] = paramArrayOfbyte[b];
        arrayOfByte[1] = paramArrayOfbyte[++b];
        b++;
        stringBuffer.append(b(arrayOfByte));
      } 
    } 
    return stringBuffer.toString();
  }
  
  private static boolean b(byte paramByte) {
    return (paramByte == 1);
  }
  
  private static char b(byte[] paramArrayOfbyte) {
    char c = Character.MIN_VALUE;
    if (paramArrayOfbyte != null && paramArrayOfbyte.length > 1)
      c = (char)(paramArrayOfbyte[0] << 8 | paramArrayOfbyte[1] & 0xFF); 
    return c;
  }
  
  private static int c(byte[] paramArrayOfbyte) {
    int i = 0;
    return i = (paramArrayOfbyte[0] & 0xFF) << 24 | (paramArrayOfbyte[1] & 0xFF) << 16 | (paramArrayOfbyte[2] & 0xFF) << 8 | paramArrayOfbyte[3] & 0xFF;
  }
  
  private static long d(byte[] paramArrayOfbyte) {
    long l = 0L;
    return l = (paramArrayOfbyte[0] & 0xFF) << 56L | (paramArrayOfbyte[1] & 0xFF) << 48L | (paramArrayOfbyte[2] & 0xFF) << 40L | (paramArrayOfbyte[3] & 0xFF) << 32L | (paramArrayOfbyte[4] & 0xFF) << 24L | (paramArrayOfbyte[5] & 0xFF) << 16L | (paramArrayOfbyte[6] & 0xFF) << 8L | (paramArrayOfbyte[7] & 0xFF);
  }
  
  private int[] e(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = new int[0];
    if (paramArrayOfbyte == null)
      return arrayOfInt; 
    if (paramArrayOfbyte.length < 4)
      return arrayOfInt; 
    int i = paramArrayOfbyte.length / 4;
    byte b1 = 0;
    arrayOfInt = new int[i];
    byte[] arrayOfByte = new byte[4];
    for (byte b2 = 0; b2 < i; b2++) {
      for (byte b = 0; b < 4; b++) {
        arrayOfByte[b] = paramArrayOfbyte[b1];
        b1++;
      } 
      arrayOfInt[b2] = c(arrayOfByte);
    } 
    return arrayOfInt;
  }
  
  private long[] f(byte[] paramArrayOfbyte) {
    long[] arrayOfLong = new long[0];
    if (paramArrayOfbyte == null)
      return arrayOfLong; 
    if (paramArrayOfbyte.length < 8)
      return arrayOfLong; 
    int i = paramArrayOfbyte.length / 8;
    byte b1 = 0;
    arrayOfLong = new long[i];
    byte[] arrayOfByte = new byte[8];
    for (byte b2 = 0; b2 < i; b2++) {
      for (byte b = 0; b < 8; b++) {
        arrayOfByte[b] = paramArrayOfbyte[b1];
        b1++;
      } 
      arrayOfLong[b2] = d(arrayOfByte);
    } 
    return arrayOfLong;
  }
  
  private byte[] a(int[] paramArrayOfint) {
    byte[] arrayOfByte = new byte[0];
    int i;
    if (paramArrayOfint != null && (i = paramArrayOfint.length) > 0) {
      arrayOfByte = new byte[i * 4];
      byte b1 = 0;
      for (byte b2 = 0; b2 < i; b2++) {
        byte[] arrayOfByte1 = a(paramArrayOfint[b2]);
        for (byte b = 0; b < 4; b++) {
          arrayOfByte[b1] = arrayOfByte1[b];
          b1++;
        } 
      } 
    } 
    return arrayOfByte;
  }
  
  private byte[] a(long[] paramArrayOflong) {
    byte[] arrayOfByte = new byte[0];
    int i;
    if (paramArrayOflong != null && (i = paramArrayOflong.length) > 0) {
      arrayOfByte = new byte[i * 8];
      for (byte b = 0; b < i; b++) {
        byte[] arrayOfByte1 = a(paramArrayOflong[b]);
        for (byte b1 = 0; b1 < 8; b1++)
          arrayOfByte[b * 8 + b1] = arrayOfByte1[b1]; 
      } 
    } 
    return arrayOfByte;
  }
  
  private byte[] a(String paramString) {
    byte[] arrayOfByte = new byte[0];
    int i;
    if (paramString != null && (i = paramString.length()) > 0) {
      arrayOfByte = new byte[i * 2];
      for (byte b = 0; b < i; b++) {
        byte[] arrayOfByte1 = a(paramString.charAt(b));
        arrayOfByte[b * 2] = arrayOfByte1[0];
        arrayOfByte[b * 2 + 1] = arrayOfByte1[1];
      } 
    } 
    return arrayOfByte;
  }
  
  private static byte a(boolean paramBoolean) {
    return paramBoolean ? 1 : 0;
  }
  
  private static byte[] a(char paramChar) {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[2])[0] = (byte)(0xFF & paramChar >> 8);
    arrayOfByte[1] = (byte)(0xFF & paramChar);
    return arrayOfByte;
  }
  
  private static byte[] a(int paramInt) {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[4])[0] = (byte)(0xFF & paramInt >> 24);
    arrayOfByte[1] = (byte)(0xFF & paramInt >> 16);
    arrayOfByte[2] = (byte)(0xFF & paramInt >> 8);
    arrayOfByte[3] = (byte)(0xFF & paramInt);
    return arrayOfByte;
  }
  
  private static byte[] a(long paramLong) {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[8])[0] = (byte)(int)(0xFFL & paramLong >> 56L);
    arrayOfByte[1] = (byte)(int)(0xFFL & paramLong >> 48L);
    arrayOfByte[2] = (byte)(int)(0xFFL & paramLong >> 40L);
    arrayOfByte[3] = (byte)(int)(0xFFL & paramLong >> 32L);
    arrayOfByte[4] = (byte)(int)(0xFFL & paramLong >> 24L);
    arrayOfByte[5] = (byte)(int)(0xFFL & paramLong >> 16L);
    arrayOfByte[6] = (byte)(int)(0xFFL & paramLong >> 8L);
    arrayOfByte[7] = (byte)(int)(0xFFL & paramLong);
    return arrayOfByte;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\ag.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */