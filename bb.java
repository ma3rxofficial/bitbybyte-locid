import java.io.DataInputStream;
import java.io.InputStream;

public final class bb {
  public static String[] a;
  
  public static bb b = new bb();
  
  private static String c = a[0];
  
  private static String[] d;
  
  private static int e = 0;
  
  public static void a(String paramString) {
    if (c.equals(paramString))
      return; 
    for (byte b = 0; b < a.length; b++) {
      if (a[b].equals(paramString)) {
        c = new String(paramString);
        a();
        return;
      } 
    } 
  }
  
  private static void a() {
    try {
      InputStream inputStream;
      byte[] arrayOfByte = new byte[(inputStream = b.getClass().getResourceAsStream("/" + c + ".lng")).available()];
      inputStream.read(arrayOfByte);
      String str;
      if ((str = dh.c(arrayOfByte, 0, arrayOfByte.length)).substring(0, 200).indexOf('\r') >= 0) {
        if (str.substring(0, 200).indexOf("\r\n") >= 0)
          str = dh.a(str, "\r\n", "\n"); 
        if (str.substring(0, 200).indexOf("\r") >= 0)
          str = dh.a(str, "\r", "\n"); 
      } 
      d = dh.b(str, '\n');
      e = d.length;
      inputStream.close();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static synchronized String a(short paramShort) {
    try {
      if (d == null) {
        a();
        if (d == null)
          return "nores_" + (paramShort + 2); 
      } 
      return (paramShort < 1 || paramShort > e) ? ("nores_" + (paramShort + 2)) : d[paramShort + 1];
    } catch (Exception exception) {
      return "nores_" + (paramShort + 2);
    } 
  }
  
  public static synchronized String a(short paramShort, int paramInt) {
    String str = a(paramShort);
    if ((paramInt & 0x1) != 0)
      str = str + "..."; 
    return str;
  }
  
  static {
    try {
      InputStream inputStream = b.getClass().getResourceAsStream("/langlist.lng");
      DataInputStream dataInputStream;
      short s;
      a = new String[s = (dataInputStream = new DataInputStream(inputStream)).readShort()];
      for (byte b = 0; b < s; b++)
        a[b] = dataInputStream.readUTF(); 
      inputStream.close();
    } catch (Exception exception) {
      System.out.println("NoResource");
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */