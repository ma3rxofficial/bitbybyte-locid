package mc;

import MiniCommander;
import favax.microedition.lcdui.Canvas;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class cx {
  public static String[] a = new String[] { "SOFT1", "SOFT2" };
  
  public static boolean b = false;
  
  public static final int[] c = new int[] { 
      0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
      8, 4, 8 };
  
  public static void a(String paramString1, String paramString2, String paramString3, int paramInt) {
    a(paramString1, paramString2, paramString3, "", paramInt);
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt) {
    aw.I.e(-1);
    aw.r.a(paramString1, paramString2, paramString3, paramString4, paramInt);
    aw.I.repaint();
    aw.I.serviceRepaints();
  }
  
  public static String a(String paramString) {
    String str1 = null;
    String str2;
    if ((str2 = paramString.toLowerCase()).endsWith(".mid") || str2.endsWith(".kar") || str2.endsWith(".midi")) {
      str1 = "audio/midi";
    } else if (str2.endsWith(".imy")) {
      str1 = "audio/iMelody";
    } else if (str2.endsWith(".bas")) {
      str1 = "audio/bas";
    } else if (str2.endsWith(".wav") || str2.endsWith(".wave")) {
      str1 = "audio/wav";
    } else if (str2.endsWith(".amr")) {
      str1 = "audio/amr";
    } else if (str2.endsWith(".mp3")) {
      str1 = "audio/mpeg";
    } else if (str2.endsWith(".m4a")) {
      str1 = "audio/m4a";
    } else if (str2.endsWith(".aac")) {
      str1 = "audio/aac";
    } else if (str2.endsWith(".wma")) {
      str1 = "audio/x-ms-wma";
    } 
    return str1;
  }
  
  public static int a(Canvas paramCanvas) {
    return (x.p != 0) ? paramCanvas.getHeight() : paramCanvas.getWidth();
  }
  
  public static int b(Canvas paramCanvas) {
    return (x.p != 0) ? paramCanvas.getWidth() : paramCanvas.getHeight();
  }
  
  public static int a(int paramInt) {
    if (x.p == 1) {
      switch (paramInt) {
        case 6:
          paramInt = 5;
          break;
        case 1:
          paramInt = 2;
          break;
        case 2:
          paramInt = 6;
          break;
        case 5:
          paramInt = 1;
          break;
      } 
    } else if (x.p == 2) {
      switch (paramInt) {
        case 6:
          paramInt = 2;
          break;
        case 1:
          paramInt = 5;
          break;
        case 2:
          paramInt = 1;
          break;
        case 5:
          paramInt = 6;
          break;
      } 
    } 
    return paramInt;
  }
  
  public static int b(int paramInt) {
    if (x.p == 1) {
      switch (paramInt) {
        case 50:
          paramInt = 52;
          break;
        case 56:
          paramInt = 54;
          break;
        case 52:
          paramInt = 56;
          break;
        case 54:
          paramInt = 50;
          break;
      } 
    } else if (x.p == 2) {
      switch (paramInt) {
        case 50:
          paramInt = 54;
          break;
        case 56:
          paramInt = 52;
          break;
        case 52:
          paramInt = 50;
          break;
        case 54:
          paramInt = 56;
          break;
      } 
    } 
    return paramInt;
  }
  
  public static String a(Canvas paramCanvas, int paramInt) {
    if (aw.A || aw.C) {
      if (paramInt == -6)
        return "LEFT SOFTKEY"; 
      if (paramInt == -7)
        return "RIGHT SOFTKEY"; 
      if (paramInt == -11)
        return "BACK"; 
      if (paramInt == -10)
        return "SEND"; 
    } else {
      if (paramInt == -21)
        return "LEFT SOFTKEY"; 
      if (paramInt == -22)
        return "RIGHT SOFTKEY"; 
    } 
    if (paramInt == -30)
      return "SOFT2"; 
    if (paramInt == -31)
      return "BACK"; 
    try {
      return paramCanvas.getKeyName(paramInt);
    } catch (Exception exception) {
      return "";
    } catch (Error error) {
      return "";
    } 
  }
  
  public static String b(String paramString) {
    String str;
    return ((str = paramString.toUpperCase()).equals("SOFT1") || str.equals("SOFT 1") || str.equals("SOFT_1") || str.equals("SOFTKEY 1") || str.equals("LEFT SOFTKEY") || str.equals("SK2(LEFT)") || str.equals("ЛЕВАЯ КЛАВИША ВЫБОРА") || str.equals("ЛЕВАЯ КЛАВИША") || str.equals("LEFT SOFT")) ? a[0] : ((str.equals("SOFT2") || str.equals("SOFT 2") || str.equals("SOFT_2") || str.equals("SOFTKEY 4") || str.equals("RIGHT SOFTKEY") || str.equals("SK1(RIGHT)") || str.equals("ПРАВАЯ КЛАВИША ВЫБОРА") || str.equals("ПРАВАЯ КЛАВИША") || str.equals("RIGHT SOFT")) ? a[1] : (str.equals("START") ? "SEND" : str));
  }
  
  public static void a(String paramString1, String paramString2, Displayable paramDisplayable) {
    bl bl = new bl(paramString1, paramString2, paramDisplayable);
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bl);
  }
  
  public static void a(String paramString1, String paramString2, dh paramdh) {
    dh dh1;
    (dh1 = new dh(paramdh)).j = paramString1;
    dh1.G = paramString2;
    dh1.a();
  }
  
  public static void b(String paramString1, String paramString2, Displayable paramDisplayable) {
    dh dh;
    (dh = new dh(null, paramDisplayable)).j = paramString1;
    dh.G = paramString2;
    dh.a();
  }
  
  public static String c(String paramString) {
    int i;
    return ((i = paramString.lastIndexOf('/')) < 0) ? paramString : ((i == paramString.length() - 1) ? j(paramString) : paramString.substring(i + 1, paramString.length()));
  }
  
  public static String d(String paramString) {
    int i;
    return ((i = paramString.lastIndexOf('/')) <= 0) ? "" : paramString.substring(0, i + 1);
  }
  
  public static String e(String paramString) {
    int i;
    return (paramString == null) ? null : (((i = paramString.lastIndexOf('/')) <= 0) ? null : (((i = paramString.lastIndexOf('/', i - 1)) < 0) ? "" : paramString.substring(0, i + 1)));
  }
  
  public static boolean a(cb paramcb) {
    return (paramcb.d.compareTo("..") != 0);
  }
  
  public static boolean f(String paramString) {
    try {
      Class.forName(paramString);
      return true;
    } catch (Exception exception) {
    
    } catch (Error error) {}
    return false;
  }
  
  public static byte[] g(String paramString) throws Exception {
    return a(paramString, (int[])null);
  }
  
  private static byte[] a(String paramString, int[] paramArrayOfint) throws Exception {
    byte[] arrayOfByte = null;
    DataInputStream dataInputStream = null;
    m m = new m();
    try {
      m.a(paramString, 1);
      int i = (int)m.a();
      if (paramArrayOfint != null)
        paramArrayOfint[0] = i; 
      arrayOfByte = new byte[i];
      (dataInputStream = m.b()).readFully(arrayOfByte, 0, i);
      dataInputStream.close();
      m.d();
      return arrayOfByte;
    } catch (Exception exception) {
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } catch (Exception exception1) {}
      try {
        m.d();
      } catch (Exception exception1) {}
      throw exception;
    } catch (Error error) {
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } catch (Exception exception) {}
      try {
        m.d();
      } catch (Exception exception) {}
      throw error;
    } 
  }
  
  public static byte[] a(String paramString, int[] paramArrayOfint1, int[] paramArrayOfint2) throws Exception {
    byte[] arrayOfByte = null;
    try {
      if ((arrayOfByte = a(paramString, paramArrayOfint2)) == null)
        return null; 
      if (paramArrayOfint1 != null) {
        paramArrayOfint1[0] = 0;
        paramArrayOfint1[1] = 0;
        boolean bool = true;
        String str;
        if ((str = paramString.toLowerCase()).endsWith(".jpg") || str.endsWith(".jpeg"))
          bool = a(arrayOfByte, paramArrayOfint1, (Vector)null); 
        if (str.endsWith(".gif"))
          bool = a(arrayOfByte, paramArrayOfint1); 
        if (str.endsWith(".png"))
          bool = b(arrayOfByte, paramArrayOfint1); 
        if (!bool) {
          paramArrayOfint1[0] = 0;
          paramArrayOfint1[1] = 0;
        } 
      } 
    } catch (Exception exception2) {
      Exception exception1;
      throw exception1 = null;
    } catch (Error error2) {
      Error error1;
      throw error1 = null;
    } 
    return arrayOfByte;
  }
  
  public static byte[] a(dd paramdd, String paramString, int[] paramArrayOfint) throws Exception {
    byte[] arrayOfByte = null;
    try {
      int i;
      if ((i = paramdd.a(paramString, false)) == -1)
        throw new Exception("Entry not found"); 
      arrayOfByte = new byte[paramdd.b(i)];
      paramdd.e(i);
      paramdd.a(arrayOfByte, 0, arrayOfByte.length);
      paramdd.e();
      if (paramArrayOfint != null) {
        paramArrayOfint[0] = 0;
        paramArrayOfint[1] = 0;
        boolean bool = true;
        String str;
        if ((str = paramString.toLowerCase()).endsWith(".jpg") || str.endsWith(".jpeg"))
          bool = a(arrayOfByte, paramArrayOfint, (Vector)null); 
        if (str.endsWith(".gif"))
          bool = a(arrayOfByte, paramArrayOfint); 
        if (str.endsWith(".png"))
          bool = b(arrayOfByte, paramArrayOfint); 
        if (!bool) {
          paramArrayOfint[0] = 0;
          paramArrayOfint[1] = 0;
        } 
      } 
    } catch (Exception exception) {
      paramdd.e();
      throw exception;
    } catch (Error error) {
      paramdd.e();
      throw error;
    } 
    return arrayOfByte;
  }
  
  public static String h(String paramString) {
    String str = "";
    int i = paramString.lastIndexOf('/');
    int j = paramString.lastIndexOf('.');
    if (i < j)
      str = paramString.substring(j + 1, paramString.length()); 
    return str;
  }
  
  public static String i(String paramString) {
    int i = 0;
    int j = 0;
    return ((i = paramString.indexOf("/")) != -1 && (j = paramString.indexOf("/", i + 1)) != -1) ? paramString.substring(i, j + 1) : null;
  }
  
  public static String j(String paramString) {
    if (paramString == null)
      return null; 
    if (paramString.length() == 0)
      return null; 
    if (paramString.endsWith("/"))
      paramString = paramString.substring(0, paramString.length() - 1); 
    int i;
    if ((i = paramString.lastIndexOf('/')) < 0) {
      i = 0;
    } else {
      i++;
    } 
    return paramString = paramString.substring(i, paramString.length());
  }
  
  public static String a(Vector paramVector, int paramInt) {
    cb cb;
    return (cb = paramVector.elementAt(paramInt)).d;
  }
  
  public static long b(Vector paramVector, int paramInt) {
    cb cb;
    return (cb = paramVector.elementAt(paramInt)).f;
  }
  
  public static int a(Vector paramVector, String paramString) {
    for (byte b = 0; b < paramVector.size(); b++) {
      if (a(paramVector, b).equals(paramString))
        return b; 
    } 
    return -1;
  }
  
  public static String a(long paramLong) {
    Calendar calendar;
    (calendar = Calendar.getInstance()).setTime(new Date(paramLong));
    return a(calendar.get(1), 4) + "-" + a((calendar.get(2) + 1), 2) + "-" + a(calendar.get(5), 2) + " " + a(calendar.get(11), 2) + ":" + a(calendar.get(12), 2) + ":" + a(calendar.get(13), 2);
  }
  
  public static String a(long paramLong, int paramInt) {
    String str;
    int i;
    if ((i = (str = String.valueOf(paramLong)).length()) < paramInt)
      for (byte b = 0; b < paramInt - i; b++)
        str = "0" + str;  
    return str;
  }
  
  public static String b(long paramLong, int paramInt) {
    long l = paramLong & 0xFFFFFFFFFFFFFFFFL;
    String str = "";
    while (true) {
      if (l != 0L || paramInt > 0) {
        long l1;
        if ((l1 = l % 16L) > 9L) {
          str = (char)(int)(65L + l1 - 10L) + str;
        } else {
          str = (char)(int)(48L + l1) + str;
        } 
        l /= 16L;
        paramInt--;
        continue;
      } 
      return str;
    } 
  }
  
  public static boolean a(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    if (paramArrayOfbyte.length >= 10 && (paramArrayOfbyte[0] & 0xFF) == 71 && (paramArrayOfbyte[1] & 0xFF) == 73 && (paramArrayOfbyte[2] & 0xFF) == 70 && (paramArrayOfbyte[3] & 0xFF) == 56 && (paramArrayOfbyte[4] & 0xFF) == 55 && (paramArrayOfbyte[5] & 0xFF) == 97) {
      paramArrayOfint[0] = (paramArrayOfbyte[7] & 0xFF) << 8 | paramArrayOfbyte[6] & 0xFF;
      paramArrayOfint[1] = (paramArrayOfbyte[9] & 0xFF) << 8 | paramArrayOfbyte[8] & 0xFF;
      return true;
    } 
    return false;
  }
  
  public static boolean b(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    if (paramArrayOfbyte.length >= 24 && (paramArrayOfbyte[12] & 0xFF) == 73 && (paramArrayOfbyte[13] & 0xFF) == 72 && (paramArrayOfbyte[14] & 0xFF) == 68 && (paramArrayOfbyte[15] & 0xFF) == 82) {
      paramArrayOfint[0] = paramArrayOfbyte[19] & 0xFF | (paramArrayOfbyte[18] & 0xFF) << 8 | (paramArrayOfbyte[17] & 0xFF) << 16 | (paramArrayOfbyte[16] & 0xFF) << 24;
      paramArrayOfint[1] = paramArrayOfbyte[23] & 0xFF | (paramArrayOfbyte[22] & 0xFF) << 8 | (paramArrayOfbyte[21] & 0xFF) << 16 | (paramArrayOfbyte[20] & 0xFF) << 24;
      return true;
    } 
    return false;
  }
  
  public static boolean a(byte[] paramArrayOfbyte, int[] paramArrayOfint, Vector paramVector) {
    for (int i = 2; i < paramArrayOfbyte.length - 10; i += k) {
      if ((paramArrayOfbyte[i] & 0xFF) == 255) {
        i++;
        continue;
      } 
      int j = paramArrayOfbyte[i] & 0xFF;
      int k = (paramArrayOfbyte[++i] & 0xFF) << 8 | paramArrayOfbyte[i + 1] & 0xFF;
      if (j == 225 && paramVector != null && x.w) {
        byte[] arrayOfByte1 = new byte[k - 2];
        System.arraycopy(paramArrayOfbyte, i + 2, arrayOfByte1, 0, k - 2);
        byte[] arrayOfByte2;
        if ((arrayOfByte2 = a(arrayOfByte1)) != null)
          paramVector.addElement(arrayOfByte2); 
      } else if (j == 192 || j == 194) {
        paramArrayOfint[1] = (paramArrayOfbyte[i + 3] & 0xFF) << 8 | paramArrayOfbyte[i + 4] & 0xFF;
        paramArrayOfint[0] = (paramArrayOfbyte[i + 5] & 0xFF) << 8 | paramArrayOfbyte[i + 6] & 0xFF;
        return true;
      } 
    } 
    return false;
  }
  
  public static boolean a(bt parambt, int[] paramArrayOfint, Vector paramVector) {
    try {
      byte[] arrayOfByte = new byte[2];
      int i;
      if ((i = parambt.a(arrayOfByte, 0, 2)) != 2)
        throw new Exception(); 
      if ((arrayOfByte[0] & 0xFF) != 255 || (arrayOfByte[1] & 0xFF) != 216)
        throw new Exception(); 
      while (true) {
        arrayOfByte = new byte[4];
        parambt.a(arrayOfByte, 0, 4);
        if ((arrayOfByte[0] & 0xFF) != 255)
          throw new Exception(); 
        int j = arrayOfByte[1] & 0xFF;
        int k;
        if ((k = (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF) <= 2)
          throw new Exception(); 
        if (j == 225 && paramVector != null && x.w) {
          byte[] arrayOfByte1 = new byte[k - 2];
          parambt.a(arrayOfByte1, 0, k - 2);
          byte[] arrayOfByte2;
          if ((arrayOfByte2 = a(arrayOfByte1)) != null)
            paramVector.addElement(arrayOfByte2); 
          continue;
        } 
        if (j == 192 || j == 194) {
          arrayOfByte = new byte[5];
          parambt.a(arrayOfByte, 0, 5);
          paramArrayOfint[1] = (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[2] & 0xFF;
          paramArrayOfint[0] = (arrayOfByte[3] & 0xFF) << 8 | arrayOfByte[4] & 0xFF;
          return true;
        } 
        parambt.a((k - 2));
      } 
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private static byte[] a(byte[] paramArrayOfbyte) {
    try {
      byte[] arrayOfByte = null;
      if (paramArrayOfbyte[6] == 73 && paramArrayOfbyte[7] == 73) {
        b = false;
      } else if (paramArrayOfbyte[6] == 77 && paramArrayOfbyte[7] == 77) {
        b = true;
      } else {
        return null;
      } 
      int i;
      return (a(paramArrayOfbyte, 8) != 42) ? null : (((i = c(paramArrayOfbyte, 10)) < 8 || i > 16) ? null : (arrayOfByte = a(paramArrayOfbyte, 14, 6, paramArrayOfbyte.length - 6)));
    } catch (Exception exception) {
    
    } catch (Error error) {}
    return null;
  }
  
  private static byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int j = 0;
    int k = 0;
    int i = a(paramArrayOfbyte, paramInt1);
    if (paramInt1 + 2 + i * 12 > paramInt2 + paramInt3)
      return null; 
    for (byte b = 0; b < i; b++) {
      int i2;
      int i4 = paramInt1 + 2 + 12 * b;
      int m = a(paramArrayOfbyte, i4);
      int n = a(paramArrayOfbyte, i4 + 2);
      int i1 = c(paramArrayOfbyte, i4 + 4);
      if (n - 1 >= 12)
        return null; 
      int i3;
      if ((i3 = i1 * c[n]) > 4) {
        int i6;
        if ((i6 = c(paramArrayOfbyte, i4 + 8)) + i3 > paramInt3)
          return null; 
        i2 = paramInt2 + i6;
      } else {
        i2 = i4 + 8;
      } 
      switch (m) {
        case 513:
          j = c(paramArrayOfbyte, i2);
          break;
        case 514:
          k = c(paramArrayOfbyte, i2);
          break;
      } 
      int i5;
      if (paramInt1 + 2 + 12 * i + 4 <= paramInt2 + paramInt3 && (i5 = c(paramArrayOfbyte, paramInt1 + 2 + 12 * i)) != 0) {
        int i6;
        if ((i6 = paramInt2 + i5) < paramInt2 || i6 > paramInt2 + paramInt3)
          return null; 
        byte[] arrayOfByte;
        if ((arrayOfByte = a(paramArrayOfbyte, i6, paramInt2, paramInt3)) != null)
          return arrayOfByte; 
      } 
    } 
    if (k != 0 && j != 0 && k + j <= paramInt3) {
      byte[] arrayOfByte = new byte[k];
      System.arraycopy(paramArrayOfbyte, j + 6, arrayOfByte, 0, k);
      return arrayOfByte;
    } 
    return null;
  }
  
  private static int a(byte[] paramArrayOfbyte, int paramInt) {
    return b ? (paramArrayOfbyte[paramInt + 1] & 0xFF | (paramArrayOfbyte[paramInt] & 0xFF) << 8) : (paramArrayOfbyte[paramInt] & 0xFF | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 8);
  }
  
  private static int b(byte[] paramArrayOfbyte, int paramInt) {
    return b ? (paramArrayOfbyte[paramInt + 3] & 0xFF | (paramArrayOfbyte[paramInt + 2] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 16 | (paramArrayOfbyte[paramInt] & 0xFF) << 24) : (paramArrayOfbyte[paramInt] & 0xFF | (paramArrayOfbyte[paramInt + 1] & 0xFF) << 8 | (paramArrayOfbyte[paramInt + 2] & 0xFF) << 16 | (paramArrayOfbyte[paramInt + 3] & 0xFF) << 24);
  }
  
  private static int c(byte[] paramArrayOfbyte, int paramInt) {
    return b(paramArrayOfbyte, paramInt);
  }
  
  public static boolean a(bt parambt, int[] paramArrayOfint) {
    try {
      byte[] arrayOfByte = new byte[10];
      int i;
      return ((i = parambt.a(arrayOfByte, 0, 10)) != 10) ? false : a(arrayOfByte, paramArrayOfint);
    } catch (IOException iOException) {
      return false;
    } 
  }
  
  public static boolean b(bt parambt, int[] paramArrayOfint) {
    try {
      byte[] arrayOfByte = new byte[24];
      int i;
      return ((i = parambt.a(arrayOfByte, 0, 24)) != 24) ? false : b(arrayOfByte, paramArrayOfint);
    } catch (IOException iOException) {
      return false;
    } 
  }
  
  public static boolean a(String paramString1, String paramString2) {
    return b(paramString1.toLowerCase(), paramString2.toLowerCase());
  }
  
  private static boolean b(String paramString1, String paramString2) {
    byte b1 = 0;
    byte b2 = 0;
    while (true) {
      byte b;
      if (paramString1.length() == b1) {
        if (b2 == paramString2.length())
          return true; 
        for (byte b3 = b2; b3 < paramString2.length(); b3++) {
          if (paramString2.charAt(b3) != '*')
            return false; 
        } 
        return true;
      } 
      if (paramString2.length() == b2)
        return (paramString2.length() == 0) ? true : ((paramString2.charAt(b2 - 1) == '*')); 
      switch (paramString2.charAt(b2)) {
        case '?':
          b2++;
          b1++;
          continue;
        case '*':
          for (b = b1; b < paramString1.length(); b++) {
            if (b(paramString1.substring(b), paramString2.substring(b2 + 1)))
              return true; 
          } 
          return false;
      } 
      if (paramString1.charAt(b1) == paramString2.charAt(b2)) {
        b2++;
        b1++;
        continue;
      } 
      return false;
    } 
  }
  
  public static String a(long paramLong, boolean paramBoolean) {
    String str;
    if (paramLong >= 1073741824L) {
      int i = (str = String.valueOf(paramLong * 10L / 1073741824L)).length();
      str = str.substring(0, i - 1) + "," + str.substring(i - 1) + " " + bn.et;
    } else if (paramLong >= 1048576L) {
      int i = (str = String.valueOf(paramLong * 10L / 1048576L)).length();
      str = str.substring(0, i - 1) + "," + str.substring(i - 1) + " " + bn.es;
    } else if (paramLong < 1024L) {
      str = String.valueOf(paramLong) + " " + bn.ew;
    } else {
      int i = (str = String.valueOf(paramLong * 10L / 1024L)).length();
      str = str.substring(0, i - 1) + "," + str.substring(i - 1) + " " + bn.er;
    } 
    if (paramLong >= 1024L && paramBoolean)
      str = str + " (" + String.valueOf(paramLong) + " " + bn.ew + ")"; 
    return str;
  }
  
  public static String b(long paramLong, boolean paramBoolean) {
    String str1;
    String str2 = paramBoolean ? " " : "";
    if (paramLong >= 1073741824L) {
      int i = (str1 = String.valueOf(paramLong * 10L / 1073741824L)).length();
      str1 = str1.substring(0, i - 1) + "," + str1.substring(i - 1) + str2 + bn.eu;
    } else if (paramLong >= 1048576L) {
      int i = (str1 = String.valueOf(paramLong * 10L / 1048576L)).length();
      str1 = str1.substring(0, i - 1) + "," + str1.substring(i - 1) + str2 + "M";
    } else if (paramLong < 1024L) {
      str1 = String.valueOf(paramLong) + str2 + bn.ev;
    } else {
      int i = (str1 = String.valueOf(paramLong * 10L / 1024L)).length();
      str1 = str1.substring(0, i - 1) + "," + str1.substring(i - 1) + str2 + "K";
    } 
    return str1;
  }
  
  public static void a() {
    a(true);
  }
  
  public static void a(boolean paramBoolean) {
    aw aw;
    (aw = MiniCommander.b).e(-1);
    aw.repaint();
    if (paramBoolean)
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)aw); 
  }
  
  public static void b() {
    try {
      String str = "alert.mp3";
      if (x.R == 1)
        str = "alert.imy"; 
      InputStream inputStream;
      if ((inputStream = MiniCommander.a.getClass().getResourceAsStream(str)) == null)
        inputStream = MiniCommander.a.getClass().getResourceAsStream("/" + str); 
      if (inputStream == null)
        return; 
      Player player;
      (player = Manager.createPlayer(inputStream, a(str))).addPlayerListener(new mc/j(player));
      player.realize();
      player.realize();
      VolumeControl volumeControl;
      if ((volumeControl = (VolumeControl)player.getControl("VolumeControl")) != null) {
        volumeControl.setLevel((x.n < 30) ? 30 : x.n);
        player.prefetch();
      } 
      player.start();
      return;
    } catch (MediaException mediaException) {
      return;
    } catch (Exception exception) {
      return;
    } catch (Error error) {
      return;
    } 
  }
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString1.indexOf(paramString2);
    int j = 0;
    int k = paramString2.length();
    while (i != -1) {
      stringBuffer.append(paramString1.substring(j, i)).append(paramString3);
      j = i + k;
      i = paramString1.indexOf(paramString2, j);
    } 
    stringBuffer.append(paramString1.substring(j, paramString1.length()));
    return stringBuffer.toString();
  }
  
  public static class mc/j implements PlayerListener {
    public mc/j(Player param1Player) {}
    
    public final void playerUpdate(Player param1Player, String param1String, Object param1Object) {
      if (param1String.compareTo("endOfMedia") == 0 && param1Player != null)
        try {
          param1Player.close();
          return;
        } catch (Exception exception) {} 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\cx.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */