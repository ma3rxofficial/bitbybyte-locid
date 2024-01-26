import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;

public final class da extends cb {
  private FileConnection c;
  
  public static String[] a(String paramString, boolean paramBoolean) throws cr {
    String[] arrayOfString = null;
    try {
      if (paramString.equals("/")) {
        Vector vector = new Vector();
        Enumeration enumeration = FileSystemRegistry.listRoots();
        while (enumeration.hasMoreElements())
          vector.addElement(enumeration.nextElement()); 
        arrayOfString = new String[vector.size()];
        vector.copyInto((Object[])arrayOfString);
      } else {
        FileConnection fileConnection;
        Enumeration enumeration = (fileConnection = (FileConnection)Connector.open("file://localhost" + paramString)).list();
        fileConnection.close();
        Vector vector;
        (vector = new Vector()).addElement("../");
        while (enumeration.hasMoreElements()) {
          String str = enumeration.nextElement();
          if ((paramBoolean & (!str.endsWith("/") ? 1 : 0)) != 0)
            continue; 
          vector.addElement(str);
        } 
        arrayOfString = new String[vector.size()];
        vector.copyInto((Object[])arrayOfString);
      } 
    } catch (Exception exception) {
      null.printStackTrace();
      throw new cr((short)648, 191, 0, true);
    } 
    return arrayOfString;
  }
  
  public static long a(String paramString) throws Exception {
    long l = 0L;
    FileConnection fileConnection;
    l = (fileConnection = (FileConnection)Connector.open("file://localhost/" + paramString)).totalSize();
    fileConnection.close();
    return l;
  }
  
  public final void b(String paramString) throws Exception {
    this.c = (FileConnection)Connector.open("file://" + paramString);
  }
  
  public final void a(String paramString, int paramInt) throws Exception {
    this.c = (FileConnection)Connector.open("file://" + paramString, paramInt);
  }
  
  public final OutputStream b() throws Exception {
    if (!this.c.exists()) {
      this.c.create();
    } else if ((this.c.exists() & ((this.b == null) ? 1 : 0)) != 0) {
      this.c.delete();
      this.c.create();
    } 
    return (this.b != null) ? this.b : this.c.openOutputStream();
  }
  
  public final InputStream c() throws Exception {
    return (this.a != null) ? this.a : this.c.openInputStream();
  }
  
  public final void d() {
    try {
      if (this.a != null)
        this.a.close(); 
      if (this.b != null)
        this.b.close(); 
      if (this.c != null)
        this.c.close(); 
      return;
    } catch (Exception exception) {
      null.printStackTrace();
      return;
    } 
  }
  
  public final long e() throws Exception {
    return (this.c != null) ? this.c.fileSize() : -1L;
  }
  
  public final long f() throws Exception {
    return (this.c != null) ? this.c.lastModified() : -1L;
  }
  
  public final String g() {
    return (this.c != null) ? this.c.getName() : null;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\da.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */