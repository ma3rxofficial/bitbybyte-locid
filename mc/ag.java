package mc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.microedition.lcdui.Displayable;

public final class ag implements DiscoveryListener {
  public aw a;
  
  public byte[] b = new byte[4];
  
  public String c;
  
  public StreamConnection d = null;
  
  public InputStream e = null;
  
  public OutputStream f = null;
  
  public String g = "";
  
  public bu h;
  
  public bu.mc/aq i;
  
  private static final byte[] l = new byte[] { 
      -7, -20, 123, -60, -107, 60, 17, -46, -104, 78, 
      82, 84, 0, -36, -98, 9 };
  
  private static final byte[] m = new byte[] { 
      120, 45, 111, 98, 101, 120, 47, 102, 111, 108, 
      100, 101, 114, 45, 108, 105, 115, 116, 105, 110, 
      103, 0 };
  
  public int j;
  
  public boolean k = false;
  
  public ag(aw paramaw, bu.mc/aq parammc/aq, bu parambu) {
    this.a = paramaw;
    this.i = parammc/aq;
    this.h = parambu;
    try {
      this.j = 512;
      for (byte b = 0; b < x.Q; b++)
        this.j *= 2; 
      this.c = parammc/aq.b;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void a() {
    try {
      a(129, new byte[0]);
    } catch (Exception exception) {}
    try {
      if (this.f != null)
        this.f.close(); 
    } catch (Exception exception) {
    
    } catch (Error error) {}
    try {
      if (this.e != null)
        this.e.close(); 
    } catch (Exception exception) {
    
    } catch (Error error) {}
    try {
      if (this.d != null)
        this.d.close(); 
    } catch (Exception exception) {
    
    } catch (Error error) {}
    this.f = null;
    this.e = null;
    this.d = null;
  }
  
  public final int b() {
    if (this.i.d.length() == 0) {
      try {
        LocalDevice.getLocalDevice().getDiscoveryAgent().searchServices(null, new UUID[] { new UUID(4358L) }, this.i.a, this);
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString() + " : " + exception.getMessage(), (Displayable)this.a);
        return -1;
      } 
      try {
        while (!this.k)
          Thread.sleep(100L); 
      } catch (InterruptedException interruptedException) {}
      if (this.g.length() > 0) {
        this.i.d = new String(this.g);
        this.h.a();
        this.h = null;
      } 
    } else {
      this.g = this.i.d;
    } 
    try {
      this.d = (StreamConnection)Connector.open(this.g);
      this.e = this.d.openInputStream();
      this.f = this.d.openOutputStream();
      byte[] arrayOfByte;
      (arrayOfByte = new byte[23])[0] = 16;
      arrayOfByte[1] = 0;
      arrayOfByte[2] = (byte)(this.j >> 8 & 0xFF);
      arrayOfByte[3] = (byte)(this.j & 0xFF);
      arrayOfByte[4] = 70;
      arrayOfByte[5] = 0;
      arrayOfByte[6] = 19;
      System.arraycopy(l, 0, arrayOfByte, 7, 16);
      a(128, arrayOfByte);
      int i = (arrayOfByte = c())[0] & 0xFF;
      int j = (arrayOfByte[1] & 0xFF) * 256 + (arrayOfByte[2] & 0xFF);
      if (i == 160) {
        int k = (arrayOfByte[5] & 0xFF) * 256 + (arrayOfByte[6] & 0xFF);
        if (this.j > k)
          this.j = k; 
        for (byte b = 7; b < j; b++) {
          switch (arrayOfByte[b]) {
            case -53:
              System.arraycopy(arrayOfByte, b + 1, this.b, 0, 4);
              break;
            case 74:
              b += 18;
              break;
            default:
              break;
          } 
        } 
      } 
    } catch (IOException iOException) {
      try {
        if (this.f != null)
          this.f.close(); 
      } catch (Exception exception) {
      
      } catch (Error error) {}
      try {
        if (this.e != null)
          this.e.close(); 
      } catch (Exception exception) {
      
      } catch (Error error) {}
      try {
        if (this.d != null)
          this.d.close(); 
      } catch (Exception exception) {
      
      } catch (Error error) {}
      cx.a(bn.eq, iOException.toString() + " : " + iOException.getMessage(), (Displayable)this.a);
      return -1;
    } 
    return 0;
  }
  
  private void a(int paramInt, byte[] paramArrayOfbyte) throws IOException {
    int i = 8 + paramArrayOfbyte.length;
    boolean bool = false;
    if (paramInt == 128) {
      i -= 5;
      bool = true;
    } 
    byte[] arrayOfByte;
    (arrayOfByte = new byte[i])[0] = (byte)paramInt;
    arrayOfByte[1] = (byte)(i >> 8 & 0xFF);
    arrayOfByte[2] = (byte)(i & 0xFF);
    if (paramInt == 133) {
      bool = true;
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 3, 2);
      arrayOfByte[5] = -53;
      System.arraycopy(this.b, 0, arrayOfByte, 6, 4);
      System.arraycopy(paramArrayOfbyte, 2, arrayOfByte, 10, paramArrayOfbyte.length - 2);
    } else {
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, i - paramArrayOfbyte.length, paramArrayOfbyte.length);
    } 
    if (!bool) {
      arrayOfByte[3] = -53;
      System.arraycopy(this.b, 0, arrayOfByte, 4, 4);
    } 
    this.f.write(arrayOfByte, 0, i);
    this.f.flush();
  }
  
  private byte[] c() throws IOException {
    byte[] arrayOfByte1 = new byte[3];
    int i = 0;
    while (i < 3) {
      int k = this.e.read(arrayOfByte1, i, 3 - i);
      i += k;
      if (k == -1)
        return new byte[] { 0 }; 
    } 
    byte[] arrayOfByte2 = new byte[i = (arrayOfByte1[1] & 0xFF) * 256 + (arrayOfByte1[2] & 0xFF)];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 3);
    int j = 3;
    while (j < i) {
      int k = this.e.read(arrayOfByte2, j, i - j);
      j += k;
      if (k == -1)
        return new byte[] { 0 }; 
    } 
    return arrayOfByte2;
  }
  
  public final int a(Vector paramVector1, Vector paramVector2, String paramString) {
    int i = 0;
    try {
      byte[] arrayOfByte;
      (arrayOfByte = new byte[25])[0] = 66;
      arrayOfByte[1] = 0;
      arrayOfByte[2] = 25;
      System.arraycopy(m, 0, arrayOfByte, 3, 22);
      a(131, arrayOfByte);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      boolean bool = false;
      while (!bool) {
        byte[] arrayOfByte1;
        if ((i = (arrayOfByte1 = c())[0] & 0xFF) != 160 && i != 144) {
          bool = true;
          continue;
        } 
        int j = (arrayOfByte1[1] & 0xFF) * 256 + (arrayOfByte1[2] & 0xFF);
        for (int k = 3; k < j; k++) {
          int m;
          switch (arrayOfByte1[k]) {
            default:
              bool = true;
              i = 1;
              break;
            case 1:
            case 5:
            case 66:
            case 68:
              k += (arrayOfByte1[k + 1] & 0xFF) * 256 + (arrayOfByte1[k + 2] & 0xFF) - 1;
              break;
            case -64:
            case -61:
            case -60:
            case -53:
              k += 4;
              break;
            case 73:
              bool = true;
            case 72:
              if ((m = (arrayOfByte1[k + 1] & 0xFF) * 256 + (arrayOfByte1[k + 2] & 0xFF) - 3) > 0)
                byteArrayOutputStream.write(arrayOfByte1, k + 3, m); 
              break;
          } 
        } 
        if (!bool)
          a(131, new byte[0]); 
      } 
      if (i == 160 || i == 144) {
        String str1 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        String str2 = null;
        int j = 0;
        int k;
        while (j < str1.length() && (k = str1.indexOf("<", j)) != -1) {
          boolean bool1;
          int m = str1.indexOf(" ", k) + 1;
          int n;
          if ((n = str1.indexOf('>', k)) != -1 && (m == 0 || m > n))
            m = n; 
          if (m == 0 || n == 0)
            break; 
          String str;
          if ((str = str1.substring(k + 1, m)).equals("folder ")) {
            bool1 = false;
          } else if (str.equals("file ")) {
            bool1 = true;
          } else {
            if ((j = str1.indexOf(">", m) + 1) == 0)
              break; 
            continue;
          } 
          n = m;
          if ((k = str1.indexOf("name", m)) == -1 || (k = str1.indexOf("\"", k + 5) + 1) == 0 || (m = str1.indexOf("\"", k)) == -1)
            break; 
          str2 = paramString + str1.substring(k, m);
          long l1 = 0L;
          long l2 = 0L;
          if (bool1 == true) {
            if ((k = str1.indexOf("size", n)) == -1 || (k = str1.indexOf("\"", k + 5) + 1) == 0 || (m = str1.indexOf("\"", k)) == -1)
              break; 
            l1 = Long.parseLong(str1.substring(k, m));
            if ((k = str1.indexOf("modified", n)) != -1) {
              if ((k = str1.indexOf("\"", k + 9) + 1) == 0 || (m = str1.indexOf("\"", k)) == -1)
                break; 
              l2 = b(str1.substring(k, m));
            } 
          } 
          cb cb;
          (cb = new cb()).d = str2;
          cb.f = l1;
          cb.e = l2;
          j = m;
          if (!bool1) {
            cb.a = 0;
            paramVector1.addElement(cb);
            continue;
          } 
          cb.a = 1;
          paramVector2.addElement(cb);
        } 
      } else {
        i = -1;
      } 
    } catch (Exception exception) {}
    return i;
  }
  
  private static long b(String paramString) {
    long l = 0L;
    try {
      byte[] arrayOfByte;
      if (paramString.length() == 16 && (arrayOfByte = paramString.getBytes())[8] == 84 && arrayOfByte[15] == 90) {
        int i;
        for (i = 0; i < 16; i++)
          arrayOfByte[i] = (byte)(arrayOfByte[i] - 48); 
        i = arrayOfByte[0] * 1000 + arrayOfByte[1] * 100 + arrayOfByte[2] * 10 + arrayOfByte[3];
        int j = arrayOfByte[4] * 10 + arrayOfByte[5];
        int k = arrayOfByte[6] * 10 + arrayOfByte[7];
        int m = arrayOfByte[9] * 10 + arrayOfByte[10];
        int n = arrayOfByte[11] * 10 + arrayOfByte[12];
        int i1 = arrayOfByte[13] * 10 + arrayOfByte[14];
        Calendar calendar;
        (calendar = Calendar.getInstance(TimeZone.getDefault())).set(1, i);
        calendar.set(2, j);
        calendar.set(5, k);
        calendar.set(11, m);
        calendar.set(12, n);
        calendar.set(13, i1);
        l = calendar.getTime().getTime();
      } 
    } catch (Exception exception) {}
    return l;
  }
  
  public final int a(String paramString, OutputStream paramOutputStream, long paramLong) {
    int i = 0;
    long l1 = 0L;
    long l2 = 0L;
    try {
      byte[] arrayOfByte1;
      int j = (arrayOfByte1 = c(paramString)).length;
      byte[] arrayOfByte2;
      (arrayOfByte2 = new byte[3 + j])[0] = 1;
      arrayOfByte2[1] = (byte)(3 + j >> 8 & 0xFF);
      arrayOfByte2[2] = (byte)(3 + j & 0xFF);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 3, j);
      a(131, arrayOfByte2);
      boolean bool = false;
      while (!bool) {
        byte[] arrayOfByte;
        if ((i = (arrayOfByte = c())[0] & 0xFF) != 160 && i != 144) {
          bool = true;
          continue;
        } 
        int k = (arrayOfByte[1] & 0xFF) * 256 + (arrayOfByte[2] & 0xFF);
        for (int m = 3; m < k; m++) {
          int n;
          switch (arrayOfByte[m]) {
            default:
              bool = true;
              i = 1;
              break;
            case 1:
            case 5:
            case 66:
            case 68:
              m += (arrayOfByte[m + 1] & 0xFF) * 256 + (arrayOfByte[m + 2] & 0xFF) - 1;
              break;
            case -64:
            case -61:
            case -60:
            case -53:
              m += 4;
              break;
            case 73:
              bool = true;
            case 72:
              if ((n = (arrayOfByte[m + 1] & 0xFF) * 256 + (arrayOfByte[m + 2] & 0xFF) - 3) <= 0)
                break; 
              l1 += n;
              paramOutputStream.write(arrayOfByte, m + 3, n);
              if (this.a != null) {
                long l = System.currentTimeMillis();
                if (l2 < l && paramLong > 0L) {
                  l2 = l + 1000L;
                  cx.a(bn.ei + " (" + String.valueOf(l1 * 100L / paramLong) + "%)", paramString, "", 4);
                } 
              } 
              break;
          } 
        } 
        if (this.a.x[0]) {
          bool = true;
          i = 5;
          d();
        } 
        if (!bool)
          a(131, new byte[0]); 
      } 
    } catch (IOException iOException) {
      i = 18;
    } 
    return (i == 160 || i == 144) ? 0 : ((i == 5) ? i : -1);
  }
  
  public final int a(String paramString, InputStream paramInputStream, long paramLong) {
    long l1 = 0L;
    long l2 = paramLong;
    int i = 0;
    int j = 0;
    try {
      byte[] arrayOfByte1;
      int k = (arrayOfByte1 = c(paramString)).length;
      byte[] arrayOfByte2;
      (arrayOfByte2 = new byte[11 + k])[0] = 1;
      arrayOfByte2[1] = (byte)(3 + k >> 8 & 0xFF);
      arrayOfByte2[2] = (byte)(3 + k & 0xFF);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 3, k);
      arrayOfByte2[3 + k] = -61;
      arrayOfByte2[4 + k] = (byte)(int)(l2 >> 24L & 0xFFL);
      arrayOfByte2[5 + k] = (byte)(int)(l2 >> 16L & 0xFFL);
      arrayOfByte2[6 + k] = (byte)(int)(l2 >> 8L & 0xFFL);
      arrayOfByte2[7 + k] = (byte)(int)(l2 & 0xFFL);
      arrayOfByte2[8 + k] = 72;
      arrayOfByte2[9 + k] = 0;
      arrayOfByte2[10 + k] = 3;
      a(2, arrayOfByte2);
      boolean bool = false;
      while (!bool) {
        i = c()[0] & 0xFF;
        if (!this.a.x[0]) {
          if (i == 144) {
            int m;
            if (l2 > (this.j - 6)) {
              m = this.j - 6;
            } else {
              m = (int)l2;
            } 
            if (m + 3 != arrayOfByte2.length)
              arrayOfByte2 = new byte[m + 3]; 
            paramInputStream.read(arrayOfByte2, 3, m);
            arrayOfByte2[1] = (byte)(m + 3 >> 8 & 0xFF);
            arrayOfByte2[2] = (byte)(m + 3 & 0xFF);
            if (l2 < (this.j - 6)) {
              arrayOfByte2[0] = 73;
              a(130, arrayOfByte2);
            } else {
              arrayOfByte2[0] = 72;
              a(2, arrayOfByte2);
            } 
            l2 -= m;
            j += m;
            if (this.a != null) {
              long l = System.currentTimeMillis();
              if (l1 < l && paramLong > 0L) {
                l1 = l + 1000L;
                cx.a(bn.ek + " (" + String.valueOf((j * 100) / paramLong) + "%)", paramString, "", 4);
              } 
            } 
            continue;
          } 
          bool = true;
          continue;
        } 
        bool = true;
        i = 5;
        d();
      } 
    } catch (IOException iOException) {
      i = 18;
    } 
    return (i == 160 || i == 144) ? 0 : ((i == 5) ? i : -1);
  }
  
  public final int a(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    int i = 0;
    int j = 0;
    int k = 0;
    byte[] arrayOfByte = null;
    try {
      if (paramBoolean1)
        j = 1; 
      if (!paramBoolean2)
        j |= 0x2; 
      if (paramBoolean1)
        k = -3; 
      if (paramString.length() > 0 && !paramBoolean1)
        k = (arrayOfByte = c(paramString)).length; 
      byte[] arrayOfByte1;
      (arrayOfByte1 = new byte[5 + k])[0] = (byte)j;
      arrayOfByte1[1] = 0;
      if (!paramBoolean1) {
        arrayOfByte1[2] = 1;
        arrayOfByte1[3] = (byte)(3 + k >> 8 & 0xFF);
        arrayOfByte1[4] = (byte)(3 + k & 0xFF);
        if (k > 0)
          System.arraycopy(arrayOfByte, 0, arrayOfByte1, 5, arrayOfByte.length); 
      } 
      a(133, arrayOfByte1);
      byte[] arrayOfByte2;
      i = (arrayOfByte2 = c())[0] & 0xFF;
    } catch (IOException iOException) {}
    return i;
  }
  
  private int d() {
    int i = 0;
    try {
      a(255, new byte[0]);
      i = c()[0] & 0xFF;
    } catch (IOException iOException) {
      i = -1;
    } 
    return i;
  }
  
  private static byte[] c(String paramString) {
    byte[] arrayOfByte = new byte[paramString.length() * 2 + 2];
    try {
      for (byte b = 0; b < paramString.length(); b++) {
        byte[] arrayOfByte1;
        switch ((arrayOfByte1 = paramString.substring(b, b + 1).getBytes("UTF-8")).length) {
          case 1:
            arrayOfByte[2 * b + 1] = arrayOfByte1[0];
            break;
          case 2:
            arrayOfByte[2 * b] = (byte)((arrayOfByte1[0] & 0x1F) >> 2);
            arrayOfByte[2 * b + 1] = (byte)(arrayOfByte1[1] & 0x3F | arrayOfByte1[0] << 6);
            break;
          case 3:
            arrayOfByte[2 * b] = (byte)(arrayOfByte1[0] << 4 | (arrayOfByte1[1] & 0x3F) >> 2);
            arrayOfByte[2 * b + 1] = (byte)(arrayOfByte1[2] & 0x3F | arrayOfByte1[1] << 6);
            break;
        } 
      } 
    } catch (Exception exception) {}
    return arrayOfByte;
  }
  
  public final void deviceDiscovered(RemoteDevice paramRemoteDevice, DeviceClass paramDeviceClass) {}
  
  public final void inquiryCompleted(int paramInt) {
    this.k = true;
  }
  
  public final void serviceSearchCompleted(int paramInt1, int paramInt2) {
    this.k = true;
  }
  
  public final void servicesDiscovered(int paramInt, ServiceRecord[] paramArrayOfServiceRecord) {
    String str;
    int i = (str = paramArrayOfServiceRecord[0].getConnectionURL(0, false)).indexOf("://");
    str = "btspp" + ((i == -1) ? str : str.substring(i));
    this.g = str;
  }
  
  public final int a(String paramString) {
    int i = 0;
    try {
      byte[] arrayOfByte1;
      int j = (arrayOfByte1 = c(paramString)).length;
      byte[] arrayOfByte2;
      (arrayOfByte2 = new byte[3 + j])[0] = 1;
      arrayOfByte2[1] = (byte)(3 + j >> 8 & 0xFF);
      arrayOfByte2[2] = (byte)(3 + j & 0xFF);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 3, j);
      a(130, arrayOfByte2);
      i = c()[0] & 0xFF;
    } catch (IOException iOException) {}
    return (i == 160 || i == 144) ? 0 : 19;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ag.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */