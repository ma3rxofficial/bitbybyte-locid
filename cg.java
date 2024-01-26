import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class cg {
  public static void a(String paramString1, String paramString2) throws Exception {
    int i;
    if ((i = paramString2.indexOf("<NR><RES>")) < 0)
      throw new Exception("cp #2"); 
    int j;
    if ((j = paramString2.indexOf("</RES></NR>")) < 0)
      throw new Exception("cp #3"); 
    String str1;
    if ((str1 = dh.j(paramString2.substring(i + 9, j))).indexOf("<val srv_id='") < 0)
      throw new Exception("cp #6"); 
    int k;
    if ((k = str1.indexOf("<title>")) < 0)
      throw new Exception("cp #9"); 
    int m;
    if ((m = str1.indexOf("/title>")) < 0)
      throw new Exception("cp #10"); 
    String str2 = str1.substring(k + 7, m - 1);
    int n;
    if ((n = str1.indexOf("<desc>")) < 0)
      throw new Exception("cp #11"); 
    int i1;
    if ((i1 = str1.indexOf("</desc>")) < 0)
      throw new Exception("cp #12"); 
    String str3 = str1.substring(n + 6, i1);
    dm dm;
    if ((dm = bi.a(paramString1)) != null && (str2.length() >= 1 || str3.length() >= 1)) {
      if (!dm.getBooleanValue(16))
        cj.a(dm, dm.o); 
      cj.a(paramString1, str2, str3, "", 0L, true, false, dv.b(dm.w.c()), 0L, true);
      if (em.h(79))
        ea.a(paramString1, "xTraz: " + str2 + str3, (byte)0, paramString1, dh.a(false)); 
      bi.r = false;
      if (dm.r && !ef.e() && bi.a.i())
        dm.p(); 
      dm.r = false;
    } 
  }
  
  public static void a(String paramString1, String paramString2, int paramInt, long paramLong1, long paramLong2) throws Exception {
    dm dm = bi.a(paramString1);
    String str1 = em.d(130);
    String str2 = em.d(131);
    boolean bool = (dm == null || dm.s() != 0 || !em.h(30) || dm.getBooleanValue(8) || eu.c() == dv.a || em.f(238) == 2 || (em.f(238) == 3 && dm.r() == 0));
    Object[] arrayOfObject = { paramString1, str1, str2, dm, new Boolean(bool), new Integer(eu.c()), new Integer(em.f(238)), new Boolean(em.h(30)) };
    Object object = cp.a(29, arrayOfObject, (Object)null);
    str1 = (String)arrayOfObject[1];
    str2 = (String)arrayOfObject[2];
    if (object != null && object instanceof Boolean)
      bool = true; 
    if (object != null && object instanceof String[]) {
      String[] arrayOfString;
      str1 = (arrayOfString = (String[])object)[0];
      str2 = arrayOfString[1];
      if (arrayOfString.length > 2)
        bool = "show".equals(arrayOfString[2]); 
    } 
    if (bool && !em.h(68))
      return; 
    if (em.h(60)) {
      if (em.h(67)) {
        cl.a(1, paramString1, bb.a((short)80), bool ? "Blocked" : ("\"" + str1 + " " + str2 + "\""));
      } else {
        cl.a(1, paramString1, bb.a((short)80));
      } 
      bi.b(paramString1, 5);
    } 
    if (bool)
      return; 
    boolean bool1 = false;
    int i;
    if ((i = paramString2.indexOf("<QUERY>")) < 0)
      throw new Exception("cp #2"); 
    int j;
    if ((j = paramString2.indexOf("</QUERY>")) < 0)
      throw new Exception("cp #3"); 
    int k;
    if ((k = paramString2.indexOf("<NOTIFY>")) < 0)
      throw new Exception("cp #4"); 
    int m;
    if ((m = paramString2.indexOf("</NOTIFY>")) < 0)
      throw new Exception("cp #5"); 
    String str3;
    int n;
    if ((n = (str3 = dh.j(paramString2.substring(i + 7, j))).indexOf("<PluginID>")) < 0)
      throw new Exception("cp #6"); 
    int i1;
    if ((i1 = str3.indexOf("</PluginID>")) < 0)
      throw new Exception("cp #7"); 
    if (str3.substring(n + 10, i1).toLowerCase().compareTo("srvmng") != 0)
      throw new Exception("cp #8"); 
    String str4;
    if ((str4 = dh.j(paramString2.substring(k + 8, m))).indexOf("AwayStat") < 0)
      throw new Exception("cp #9"); 
    int i2;
    if ((i2 = str4.indexOf("<senderId>")) < 0)
      throw new Exception(""); 
    int i3;
    if ((i3 = str4.indexOf("</senderId>")) < 0)
      throw new Exception(""); 
    if (str4.substring(i2 + 10, i3).compareTo(paramString1) != 0)
      throw new Exception("incorrect uin"); 
    a(paramString1, str1, str2, paramInt, paramLong1, paramLong2);
  }
  
  private static void a(String paramString1, String paramString2, String paramString3, int paramInt, long paramLong1, long paramLong2) throws cr {
    String str = "<NR><RES>" + dh.l("<ret event='OnRemoteNotification'><srv><id>cAwaySrv</id><val srv_id='cAwaySrv'><Root><CASXtraSetAwayMessage></CASXtraSetAwayMessage><uin>" + em.c(-1) + "</uin><index>1</index><title>" + paramString2 + "</title><desc>" + paramString3 + "</desc></Root></val></srv></ret>") + "</RES></NR>";
    byte[] arrayOfByte = a(paramString1, paramInt, paramLong1, paramLong2, str);
    bj bj = new bj(4, 11, 0L, new byte[0], arrayOfByte);
    cd.i.a(bj);
  }
  
  public static void a(String paramString, int paramInt) throws cr {
    String str = "<N><QUERY>" + dh.l("<Q><PluginID>srvMng</PluginID></Q>") + "</QUERY><NOTIFY>" + dh.l("<srv><id>cAwaySrv</id><req><id>AwayStat</id><trans>") + paramInt + dh.l("</trans><senderId>" + em.c(-1) + "</senderId></req></srv>") + "</NOTIFY></N>";
    byte[] arrayOfByte = b(paramString, dh.a(), System.currentTimeMillis(), 0L, str);
    bj bj = new bj(4, 6, 0L, new byte[0], arrayOfByte);
    cd.i.a(bj);
  }
  
  private static byte[] a(String paramString1, int paramInt, long paramLong1, long paramLong2, String paramString2) {
    byte[] arrayOfByte1 = null;
    int i = 0;
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      (new DataOutputStream(byteArrayOutputStream)).writeUTF(paramString2);
      i = (arrayOfByte1 = byteArrayOutputStream.toByteArray()).length - 2;
    } catch (Exception exception) {}
    int j = 0;
    byte[] arrayOfByte2;
    j = a(arrayOfByte2 = new byte[paramString1.length() + 64 + 84 + 8 + i], 0, paramString1, paramLong1, paramLong2, paramInt, (byte)26, (byte)0);
    j = a(arrayOfByte2, j);
    j = b(arrayOfByte2, j);
    dh.a(arrayOfByte2, j, i + 4, false);
    j += 4;
    dh.a(arrayOfByte2, j, i, false);
    j += 4;
    if (i > 0)
      System.arraycopy(arrayOfByte1, 2, arrayOfByte2, j, i); 
    return arrayOfByte2;
  }
  
  private static byte[] b(String paramString1, int paramInt, long paramLong1, long paramLong2, String paramString2) {
    int i = 0;
    int j = 92 + paramString2.length();
    byte[] arrayOfByte;
    dh.a(arrayOfByte = new byte[11 + paramString1.length() + 95 + j + 4], 0, paramLong1, false);
    dh.a(arrayOfByte, 4, paramLong2, false);
    dh.b(arrayOfByte, 8, 2);
    dh.a(arrayOfByte, 10, paramString1.length());
    System.arraycopy(dh.a(paramString1), 0, arrayOfByte, 11, paramString1.length());
    i = 11 + paramString1.length();
    i = a(arrayOfByte, i, 55 + j, paramLong1, paramLong2, 1);
    i = a(arrayOfByte, i, paramInt, 0, 256, j);
    i = a(arrayOfByte, i);
    i = b(arrayOfByte, i);
    dh.a(arrayOfByte, i, paramString2.length() + 4, false);
    i += 4;
    dh.a(arrayOfByte, i, paramString2.length(), false);
    i += 4;
    System.arraycopy(dh.a(paramString2), 0, arrayOfByte, i, paramString2.length());
    i += paramString2.length();
    dh.a(arrayOfByte, i, 196608L);
    return arrayOfByte;
  }
  
  private static int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3) {
    dh.b(paramArrayOfbyte, paramInt1, 5);
    paramInt1 += 2;
    dh.b(paramArrayOfbyte, paramInt1, 36 + paramInt2);
    paramInt1 += 2;
    dh.b(paramArrayOfbyte, paramInt1, 0);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, paramLong1, false);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, paramLong2, false);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, 155587401L);
    dh.a(paramArrayOfbyte, paramInt1 + 4, 1283396049L);
    dh.a(paramArrayOfbyte, paramInt1 + 8, -2111683515L);
    dh.a(paramArrayOfbyte, paramInt1 + 12, 1398013952L);
    paramInt1 += 16;
    dh.a(paramArrayOfbyte, paramInt1, 655362L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, paramInt3);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, 983040L);
    paramInt1 += 4;
    return paramInt1;
  }
  
  private static int a(byte[] paramArrayOfbyte, int paramInt1, String paramString, long paramLong1, long paramLong2, int paramInt2, byte paramByte1, byte paramByte2) {
    dh.a(paramArrayOfbyte, paramInt1, paramLong1, false);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, paramLong2, false);
    paramInt1 += 4;
    dh.b(paramArrayOfbyte, paramInt1, 2);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, paramString.length());
    System.arraycopy(dh.a(paramString), 0, paramArrayOfbyte, ++paramInt1, paramString.length());
    paramInt1 += paramString.length();
    dh.b(paramArrayOfbyte, paramInt1, 3);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, 27, false);
    paramInt1 += 2;
    dh.b(paramArrayOfbyte, paramInt1, 8);
    dh.a(paramArrayOfbyte, ++paramInt1, 0L);
    dh.a(paramArrayOfbyte, paramInt1 + 4, 0L);
    dh.a(paramArrayOfbyte, paramInt1 + 8, 0L);
    dh.a(paramArrayOfbyte, paramInt1 + 12, 0L);
    paramInt1 += 16;
    dh.a(paramArrayOfbyte, paramInt1, 3L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, 4L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, paramInt2, false);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, 14, false);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, paramInt2, false);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, 0L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, 0L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, 0L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, paramByte1);
    dh.a(paramArrayOfbyte, ++paramInt1, paramByte2);
    dh.a(paramArrayOfbyte, ++paramInt1, 0, false);
    paramInt1 += 2;
    dh.b(paramArrayOfbyte, paramInt1, 0);
    paramInt1 += 2;
    return paramInt1;
  }
  
  private static int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    dh.b(paramArrayOfbyte, paramInt1, 10001);
    paramInt1 += 2;
    dh.b(paramArrayOfbyte, paramInt1, 51 + paramInt5);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, 27, false);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, 8);
    dh.a(paramArrayOfbyte, ++paramInt1, 0L);
    dh.a(paramArrayOfbyte, paramInt1 + 4, 0L);
    dh.a(paramArrayOfbyte, paramInt1 + 8, 0L);
    dh.a(paramArrayOfbyte, paramInt1 + 12, 0L);
    paramInt1 += 16;
    dh.a(paramArrayOfbyte, paramInt1, 3L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, 0L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, paramInt2, false);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, 14, false);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, paramInt2, false);
    paramInt1 += 2;
    dh.a(paramArrayOfbyte, paramInt1, 0L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, 0L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, 0L);
    paramInt1 += 4;
    dh.a(paramArrayOfbyte, paramInt1, 26);
    dh.a(paramArrayOfbyte, ++paramInt1, 0);
    dh.a(paramArrayOfbyte, ++paramInt1, paramInt3, false);
    paramInt1 += 2;
    dh.b(paramArrayOfbyte, paramInt1, paramInt4);
    paramInt1 += 2;
    return paramInt1;
  }
  
  private static int a(byte[] paramArrayOfbyte, int paramInt) {
    dh.a(paramArrayOfbyte, paramInt, 1, false);
    paramInt += 2;
    dh.a(paramArrayOfbyte, paramInt, 0);
    return ++paramInt;
  }
  
  private static int b(byte[] paramArrayOfbyte, int paramInt) {
    dh.a(paramArrayOfbyte, paramInt, 79, false);
    paramInt += 2;
    dh.a(paramArrayOfbyte, paramInt, 996193263L);
    dh.a(paramArrayOfbyte, paramInt + 4, -668308411L);
    dh.a(paramArrayOfbyte, paramInt + 8, -1528783782L);
    dh.a(paramArrayOfbyte, paramInt + 12, 1583868005L);
    paramInt += 16;
    dh.a(paramArrayOfbyte, paramInt, 8, false);
    paramInt += 2;
    dh.a(paramArrayOfbyte, paramInt, 42L, false);
    paramInt += 4;
    System.arraycopy(dh.a("Script Plug-in: Remote Notification Arrive"), 0, paramArrayOfbyte, paramInt, 42);
    paramInt += 42;
    dh.a(paramArrayOfbyte, paramInt, 256L);
    paramInt += 4;
    dh.a(paramArrayOfbyte, paramInt, 0L);
    paramInt += 4;
    dh.a(paramArrayOfbyte, paramInt, 0L);
    paramInt += 4;
    dh.b(paramArrayOfbyte, paramInt, 0);
    paramInt += 2;
    dh.a(paramArrayOfbyte, paramInt, 0);
    return ++paramInt;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */