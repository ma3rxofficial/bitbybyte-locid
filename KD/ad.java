package KD;

import java.util.Enumeration;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;

public final class ad implements Runnable {
  public String[] a;
  
  public String[] b;
  
  private String c;
  
  private String[] d;
  
  public final void a(String paramString, String[] paramArrayOfString) {
    this.c = null;
    this.d = null;
    this.c = paramString;
    this.d = paramArrayOfString;
    Thread thread;
    (thread = new Thread(this)).start();
    try {
      thread.join();
    } catch (Exception exception) {}
    this.c = null;
    this.d = null;
    System.gc();
  }
  
  public final void run() {
    this.b = null;
    this.a = null;
    byte b1 = 0;
    byte b2 = 0;
    String str1 = "";
    String str2 = "";
    try {
      FileConnection fileConnection;
      if ((fileConnection = (FileConnection)Connector.open("file://" + this.c, 1)) != null && (fileConnection.isDirectory() & fileConnection.exists()) != 0) {
        Enumeration enumeration = fileConnection.list("*", true);
        fileConnection.close();
        while (enumeration.hasMoreElements()) {
          String str;
          if ((str = enumeration.nextElement()).endsWith("/")) {
            b2++;
            str2 = str2 + str + '*';
            continue;
          } 
          if (b(str, this.d)) {
            b1++;
            str1 = str1 + str + '*';
          } 
        } 
      } 
    } catch (Exception exception) {
      this.a = null;
      this.b = null;
      b1 = 0;
      b2 = 0;
    } 
    if (b1 >= 1) {
      this.b = new String[b1];
      byte b3 = 0;
      int i = 0;
      for (byte b4 = 0; b4 < str1.length(); b4++) {
        if (str1.charAt(b4) == '*') {
          String str = this.c + str1.substring(i, b4);
          this.b[b3] = str;
          b3++;
          i = b4 + 1;
        } 
      } 
    } 
    if (b2 >= 1) {
      this.a = new String[b2];
      byte b3 = 0;
      int i = 0;
      for (byte b4 = 0; b4 < str2.length(); b4++) {
        if (str2.charAt(b4) == '*') {
          String str = this.c + str2.substring(i, b4);
          this.a[b3] = str;
          b3++;
          i = b4 + 1;
        } 
      } 
    } 
  }
  
  private static boolean b(String paramString, String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return true; 
    boolean bool = false;
    String str = paramString.toLowerCase();
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (str.endsWith(paramArrayOfString[b])) {
        bool = true;
        break;
      } 
    } 
    return bool;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\ad.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */