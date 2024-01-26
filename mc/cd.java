package mc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;

public final class cd {
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
    try {
      ((FileConnection)paramConnection).close();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  public static String[] a() {
    return a(FileSystemRegistry.listRoots(), "");
  }
  
  public static String[] a(Connection paramConnection, String paramString, boolean paramBoolean) throws IOException {
    return a(((FileConnection)paramConnection).list("*", paramBoolean), paramString);
  }
  
  public static boolean e(Connection paramConnection) {
    return ((FileConnection)paramConnection).isDirectory();
  }
  
  public static InputStream f(Connection paramConnection) throws IOException {
    return ((FileConnection)paramConnection).openInputStream();
  }
  
  public static void a(Connection paramConnection, boolean paramBoolean) throws IOException {
    ((FileConnection)paramConnection).setHidden(paramBoolean);
  }
  
  public static void b(Connection paramConnection, boolean paramBoolean) throws IOException {
    ((FileConnection)paramConnection).setReadable(paramBoolean);
  }
  
  public static void c(Connection paramConnection, boolean paramBoolean) throws IOException {
    ((FileConnection)paramConnection).setWritable(paramBoolean);
  }
  
  public static long g(Connection paramConnection) {
    return ((FileConnection)paramConnection).totalSize();
  }
  
  public static long h(Connection paramConnection) {
    return ((FileConnection)paramConnection).usedSize();
  }
  
  public static long i(Connection paramConnection) {
    return ((FileConnection)paramConnection).availableSize();
  }
  
  public static boolean j(Connection paramConnection) {
    return ((FileConnection)paramConnection).canRead();
  }
  
  public static boolean k(Connection paramConnection) {
    return ((FileConnection)paramConnection).canWrite();
  }
  
  public static boolean l(Connection paramConnection) {
    return ((FileConnection)paramConnection).isHidden();
  }
  
  public static boolean m(Connection paramConnection) throws IOException {
    ((FileConnection)paramConnection).create();
    return true;
  }
  
  public static boolean a(Connection paramConnection, String paramString) throws IOException {
    try {
      ((FileConnection)paramConnection).rename(paramString);
    } catch (IOException iOException) {
      ((FileConnection)paramConnection).rename(paramString + String.valueOf(System.currentTimeMillis()));
      ((FileConnection)paramConnection).rename(paramString);
    } 
    return true;
  }
  
  public static boolean n(Connection paramConnection) throws IOException {
    ((FileConnection)paramConnection).delete();
    return true;
  }
  
  public static boolean a(String paramString, bk parambk, boolean[] paramArrayOfboolean) {
    FileConnection fileConnection = null;
    try {
      String[] arrayOfString = a((fileConnection = (FileConnection)Connector.open("file://" + paramString)).list("*", true), paramString);
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
      if (parambk == null) {
        cx.a(bn.v, aw.j.a(paramString, aw.r.c), "", 0);
      } else {
        parambk.a(paramString, 16777215);
      } 
      if (!paramArrayOfboolean[0]) {
        (fileConnection = (FileConnection)Connector.open("file://" + paramString)).delete();
        fileConnection.close();
      } 
    } catch (Exception exception) {
      if (parambk != null)
        parambk.a(exception.toString(), 16744576); 
      try {
        if (fileConnection != null)
          fileConnection.close(); 
      } catch (Exception exception1) {
      
      } catch (Error error) {}
      return false;
    } catch (Error error) {
      if (parambk != null)
        parambk.a(error.toString(), 16744576); 
      try {
        if (fileConnection != null)
          fileConnection.close(); 
      } catch (Exception exception) {
      
      } catch (Error error1) {}
      return false;
    } 
    return true;
  }
  
  public static boolean o(Connection paramConnection) {
    return ((FileConnection)paramConnection).exists();
  }
  
  public static void p(Connection paramConnection) throws IOException {
    ((FileConnection)paramConnection).mkdir();
  }
  
  private static String[] a(Enumeration paramEnumeration, String paramString) {
    Vector vector = new Vector();
    while (paramEnumeration.hasMoreElements())
      vector.addElement(paramEnumeration.nextElement()); 
    String[] arrayOfString = new String[vector.size()];
    for (byte b = 0; b < vector.size(); b++)
      arrayOfString[b] = ((paramString.length() == 0) ? "/" : paramString) + vector.elementAt(b); 
    return arrayOfString;
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


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\cd.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */