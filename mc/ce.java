package mc;

import com.motorola.io.FileConnection;
import com.motorola.io.FileSystemRegistry;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;

public final class ce {
  public static final String[] a = new String[] { 
      "/a/mobile/certs/", "/a/mobile/certs/root/", "/a/mobile/certs/root/x509/", "/a/mobile/certs/root/x509/kjava/", "/a/mobile/certs/root/x509/ssl/", "/a/mobile/mms/", "/a/mobile/mms/mmstemplate/", "/a/mobile/mib/", "/a/mobile/mib/pcf/", "/a/mobile/mib/cache/", 
      "/a/mobile/mib/cookies/", "/a/mobile/mib/offline/", "/a/mobile/mib/gen/", "/a/mobile/audio/vavr/", "/a/mobile/wvim/", "/a/mobile/kjava/", "/a/mobile/settings/", "/a/mobile/system/", "/a/mobile/mixedmedia/", "/a/mobile/licenses/", 
      "/a/mobile/partial/", "/a/mobile/email/", "/a/mobile/ringtone/", "/a/mobile/skins/" };
  
  public static Connection a(String paramString) throws IOException {
    return Connector.open(paramString);
  }
  
  public static Connection a(String paramString, int paramInt) throws IOException {
    return Connector.open(paramString, paramInt);
  }
  
  public static long a(Connection paramConnection) throws IOException {
    return ((FileConnection)paramConnection).fileSize();
  }
  
  public static DataInputStream b(Connection paramConnection) throws IOException {
    return ((FileConnection)paramConnection).openDataInputStream();
  }
  
  public static DataOutputStream c(Connection paramConnection) throws IOException {
    return ((FileConnection)paramConnection).openDataOutputStream();
  }
  
  public static void d(Connection paramConnection) {
    ((FileConnection)paramConnection).close();
  }
  
  public static String[] a() {
    return FileSystemRegistry.listRoots();
  }
  
  public static String[] e(Connection paramConnection) throws IOException {
    return ((FileConnection)paramConnection).list();
  }
  
  public static void a(Vector paramVector, String paramString) {
    for (byte b = 0; b < a.length; b++) {
      int i;
      if ((i = a[b].lastIndexOf('/', a[b].length() - 2)) != -1) {
        String str = a[b].substring(0, i + 1);
        if (paramString.equals(str)) {
          boolean bool = false;
          for (i = 0; i < paramVector.size(); i++) {
            if (a[b].equals(((cb)paramVector.elementAt(i)).d)) {
              bool = true;
              break;
            } 
          } 
          if (!bool) {
            cb cb;
            (cb = new cb()).d = a[b];
            cb.a = 0;
            paramVector.addElement(cb);
          } 
        } 
      } 
    } 
  }
  
  public static boolean f(Connection paramConnection) {
    return ((FileConnection)paramConnection).isDirectory();
  }
  
  public static InputStream g(Connection paramConnection) throws IOException {
    return ((FileConnection)paramConnection).openInputStream();
  }
  
  public static void a(Connection paramConnection, boolean paramBoolean) throws IOException {
    ((FileConnection)paramConnection).setHidden(paramBoolean);
  }
  
  public static void b(Connection paramConnection, boolean paramBoolean) throws IOException {
    ((FileConnection)paramConnection).setReadable(paramBoolean);
  }
  
  public static void c(Connection paramConnection, boolean paramBoolean) throws IOException {
    ((FileConnection)paramConnection).setWriteable(paramBoolean);
  }
  
  public static long h(Connection paramConnection) {
    return ((FileConnection)paramConnection).totalSize();
  }
  
  public static long i(Connection paramConnection) {
    return ((FileConnection)paramConnection).usedSize();
  }
  
  public static long j(Connection paramConnection) {
    return ((FileConnection)paramConnection).availableSize();
  }
  
  public static boolean k(Connection paramConnection) {
    return ((FileConnection)paramConnection).canRead();
  }
  
  public static boolean l(Connection paramConnection) {
    return ((FileConnection)paramConnection).canWrite();
  }
  
  public static boolean m(Connection paramConnection) {
    return ((FileConnection)paramConnection).isHidden();
  }
  
  public static boolean n(Connection paramConnection) throws IOException {
    return ((FileConnection)paramConnection).create();
  }
  
  public static boolean a(Connection paramConnection, String paramString) throws IOException {
    return ((FileConnection)paramConnection).rename(paramString);
  }
  
  public static boolean o(Connection paramConnection) throws IOException {
    return ((FileConnection)paramConnection).delete();
  }
  
  public static boolean a(String paramString, bk parambk, boolean[] paramArrayOfboolean) {
    FileConnection fileConnection = null;
    try {
      String[] arrayOfString = (fileConnection = (FileConnection)Connector.open("file://" + paramString)).list();
      fileConnection.close();
      for (byte b = 0; b < arrayOfString.length && !paramArrayOfboolean[0]; b++) {
        if ((fileConnection = (FileConnection)Connector.open("file://" + arrayOfString[b])).isDirectory()) {
          fileConnection.close();
          if (!a(arrayOfString[b], parambk, paramArrayOfboolean))
            return false; 
        } else {
          if (parambk == null) {
            cx.a(bn.v, aw.j.a(arrayOfString[b], aw.r.c), "", 4);
          } else {
            parambk.a(arrayOfString[b], 16777215);
          } 
          fileConnection.delete();
          fileConnection.close();
        } 
      } 
    } catch (Exception exception) {
      if (parambk != null)
        parambk.a(exception.toString(), 16744576); 
      try {
        if (fileConnection != null)
          fileConnection.close(); 
      } catch (Exception exception1) {}
      return false;
    } catch (Error error) {
      if (parambk != null)
        parambk.a(error.toString(), 16744576); 
      try {
        if (fileConnection != null)
          fileConnection.close(); 
      } catch (Exception exception) {}
      return false;
    } 
    return true;
  }
  
  public static boolean p(Connection paramConnection) {
    return ((FileConnection)paramConnection).exists();
  }
  
  public static void b() throws IOException {
    throw new IOException("MKDIR not available");
  }
  
  public static long d(Connection paramConnection, boolean paramBoolean) throws IOException {
    return ((FileConnection)paramConnection).directorySize(paramBoolean);
  }
  
  public static long q(Connection paramConnection) {
    return ((FileConnection)paramConnection).lastModified();
  }
  
  public static String r(Connection paramConnection) {
    return ((FileConnection)paramConnection).getURL();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ce.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */