import com.siemens.mp.io.file.FileConnection;
import com.siemens.mp.io.file.FileSystemRegistry;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.Connector;

public final class ac implements ag {
  private FileConnection a;
  
  private String a = "";
  
  private FileConnection b;
  
  public final void a(String paramString) {
    this.a = paramString;
  }
  
  public final String a() {
    return this.a;
  }
  
  public final void b() {
    try {
      this.a.close();
    } catch (Throwable throwable) {}
    this.a = null;
  }
  
  private void a(int paramInt) {
    b();
    try {
      this.a = (String)Connector.open(v.a("file:///", this.a), paramInt);
      return;
    } catch (Throwable throwable) {
      this.a = null;
      return;
    } 
  }
  
  public final long a() {
    long l = -1L;
    a(1);
    if (this.a != null) {
      l = this.a.availableSize();
      b();
    } 
    return l;
  }
  
  public final boolean d() {
    boolean bool = false;
    a(1);
    if (this.a != null) {
      bool = this.a.canRead();
      b();
    } 
    return bool;
  }
  
  public final boolean e() {
    boolean bool = false;
    a(1);
    if (this.a != null) {
      bool = this.a.canWrite();
      b();
    } 
    return bool;
  }
  
  public final boolean a() {
    a(2);
    boolean bool = false;
    try {
      this.a.create();
      bool = true;
    } catch (Throwable throwable) {}
    b();
    return bool;
  }
  
  public final boolean a(boolean paramBoolean) {
    try {
      if (!ai.e(this.a)) {
        paramBoolean = d(this.a);
        return paramBoolean;
      } 
      if (paramBoolean) {
        ai.a.a(v.d(15), this.a);
        if (ai.b)
          return false; 
      } 
      if (ai.b)
        return false; 
      a(2);
      this.a.delete();
      return true;
    } catch (Throwable throwable) {
    
    } finally {
      b();
    } 
    return false;
  }
  
  private boolean d(String paramString) {
    try {
      ai.a.a(v.d(15), paramString);
      if (ai.b)
        return false; 
      FileConnection fileConnection;
      String[] arrayOfString = ai.a((fileConnection = (FileConnection)Connector.open(v.a("file:///", paramString))).list("*", true), paramString);
      fileConnection.close();
      for (byte b = 0; b < arrayOfString.length; b++) {
        ai.a.a(v.d(15), arrayOfString[b]);
        if (ai.b)
          return false; 
        FileConnection fileConnection1 = (FileConnection)Connector.open(v.a("file:///", arrayOfString[b]));
        if (!ai.e(v.a("file:///", arrayOfString[b]))) {
          fileConnection1.close();
          if (!d(arrayOfString[b]))
            return false; 
        } else {
          fileConnection1.delete();
          fileConnection1.close();
        } 
      } 
      ai.a.a(v.d(15), paramString);
      if (ai.b)
        return false; 
      a(paramString);
    } catch (Exception exception) {
      return false;
    } 
    return true;
  }
  
  public final long a(boolean paramBoolean) {
    long l = -1L;
    a(1);
    try {
      l = this.a.directorySize(true);
    } catch (Throwable throwable) {}
    b();
    return l;
  }
  
  public final boolean b() {
    boolean bool = false;
    a(1);
    try {
      bool = this.a.exists();
    } catch (Throwable throwable) {}
    b();
    return bool;
  }
  
  public final long b() {
    long l = -1L;
    a(1);
    try {
      l = this.a.fileSize();
    } catch (Throwable throwable) {}
    b();
    return l;
  }
  
  public final boolean c() {
    boolean bool = false;
    a(1);
    if (this.a != null) {
      bool = this.a.isHidden();
      b();
    } 
    return bool;
  }
  
  public final long c() {
    long l = -1L;
    a(1);
    if (this.a != null) {
      l = this.a.lastModified();
      b();
    } 
    return l;
  }
  
  public final String[] a() {
    String[] arrayOfString;
    a(1);
    try {
      arrayOfString = ai.a(this.a.list("*", v.cI), "");
    } catch (Throwable throwable) {
      arrayOfString = new String[0];
    } 
    b();
    return arrayOfString;
  }
  
  public final String[] b() {
    return ai.a(FileSystemRegistry.listRoots(), "");
  }
  
  public final boolean f() {
    boolean bool = false;
    a(2);
    try {
      this.a.mkdir();
      bool = true;
    } catch (Throwable throwable) {}
    b();
    return bool;
  }
  
  public final byte[] a() {
    byte[] arrayOfByte;
    try {
      a(1);
      long l = this.a.fileSize();
      InputStream inputStream = this.a.openInputStream();
      arrayOfByte = new byte[(int)l];
      if (l != inputStream.read(arrayOfByte))
        arrayOfByte = null; 
      inputStream.close();
    } catch (Throwable throwable) {
      arrayOfByte = null;
    } 
    b();
    return arrayOfByte;
  }
  
  public final boolean a(byte[] paramArrayOfbyte) {
    return a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public final boolean a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt1 = 0;
    a(3);
    try {
      if (this.a.exists())
        this.a.delete(); 
      this.a.create();
      OutputStream outputStream;
      (outputStream = this.a.openOutputStream()).write(paramArrayOfbyte, 0, paramInt2);
      outputStream.flush();
      outputStream.close();
      paramInt1 = 1;
    } catch (Throwable throwable) {}
    b();
    return paramInt1;
  }
  
  public final boolean b(String paramString) {
    boolean bool = false;
    a(2);
    try {
      this.a.rename(paramString);
      bool = true;
    } catch (Throwable throwable) {}
    b();
    return bool;
  }
  
  public final void a(boolean paramBoolean) {
    a(2);
    try {
      this.a.setHidden(paramBoolean);
    } catch (Throwable throwable) {}
    b();
  }
  
  public final void b(boolean paramBoolean) {}
  
  public final void c(boolean paramBoolean) {
    a(2);
    try {
      this.a.setWritable(paramBoolean);
    } catch (Throwable throwable) {}
    b();
  }
  
  public final long d() {
    long l = -1L;
    a(1);
    if (this.a != null) {
      l = this.a.totalSize();
      b();
    } 
    return l;
  }
  
  public final int a(String paramString1, String paramString2, boolean paramBoolean) {
    byte b;
    boolean bool;
    FileConnection fileConnection = null;
    try {
      ai.a.a(v.d(paramBoolean ? 201 : 190), paramString1);
      if (ai.b)
        return 3; 
      FileConnection fileConnection1;
      if (!(fileConnection1 = (FileConnection)Connector.open(v.a("file:///", paramString1), 1)).exists())
        throw new Exception(); 
      if (!ai.e(paramString1)) {
        if ((fileConnection = (FileConnection)Connector.open(v.a("file:///", paramString2))).exists() && ai.e(paramString2)) {
          int i;
          if ((i = ai.a(paramString1, fileConnection1.fileSize(), paramString2, fileConnection.fileSize())) == 1) {
            fileConnection.delete();
          } else {
            a(fileConnection);
            a(fileConnection1);
            return i;
          } 
        } 
        if (!fileConnection.exists())
          try {
            fileConnection.mkdir();
          } catch (IOException iOException) {} 
        a(fileConnection);
        a(fileConnection1);
        bool = false;
        try {
          FileConnection fileConnection2;
          String[] arrayOfString = ai.a((fileConnection2 = (FileConnection)Connector.open(v.a("file:///", paramString1), 1)).list("*", true), "");
          fileConnection2.close();
          bool = true;
          for (b = 0; b < arrayOfString.length && (bool == true || bool == 2) && !ai.b; b++) {
            bool = a(v.a(paramString1, arrayOfString[b]), v.a(paramString2, arrayOfString[b]), paramBoolean);
            if (paramBoolean && bool == true)
              a(v.a(paramString1, arrayOfString[b])); 
          } 
        } catch (Exception exception) {}
        if (paramBoolean)
          a(paramString1); 
        return bool;
      } 
    } catch (Exception exception) {
      return 0;
    } 
    try {
      if ((fileConnection = (FileConnection)Connector.open(v.a("file:///", paramString2))).exists() && ai.e(paramString2)) {
        int i;
        if ((i = ai.a(paramString1, b.fileSize(), paramString2, fileConnection.fileSize())) == 1) {
          fileConnection.truncate(0L);
        } else {
          return i;
        } 
      } else {
        fileConnection.create();
      } 
      InputStream inputStream = b.openInputStream();
      OutputStream outputStream = fileConnection.openOutputStream();
      l.a(inputStream, outputStream, (int)b.fileSize(), null);
      outputStream.close();
      inputStream.close();
      bool = true;
    } catch (Exception exception) {
      bool = false;
    } finally {
      this = null;
      a(fileConnection);
      a(b);
    } 
    return bool;
  }
  
  public final boolean a(String paramString) {
    FileConnection fileConnection;
    this = null;
    try {
      (fileConnection = (FileConnection)Connector.open(v.a("file:///", paramString))).delete();
      return true;
    } catch (Exception exception) {
      return false;
    } finally {
      a(this);
    } 
  }
  
  public final InputStream a() {
    a(1);
    try {
      return this.a.openInputStream();
    } catch (Throwable throwable) {
      return null;
    } 
  }
  
  public final OutputStream a(long paramLong) {
    try {
      a(3);
      OutputStream outputStream = this.a.openOutputStream(paramLong);
    } catch (Exception exception) {
      this = null;
    } 
    return (OutputStream)this;
  }
  
  private static void a(FileConnection paramFileConnection) {
    try {
      paramFileConnection.close();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final Vector a(String paramString, Vector paramVector) {
    try {
      FileConnection fileConnection;
      String[] arrayOfString = ai.a((fileConnection = (FileConnection)Connector.open(v.a("file:///", paramString), 1)).list(), paramString);
      fileConnection.close();
      if (paramVector == null)
        paramVector = new Vector(arrayOfString.length); 
      for (byte b = 0; b < arrayOfString.length; b++) {
        FileConnection fileConnection1 = (FileConnection)Connector.open(v.a("file:///", arrayOfString[b]), 1);
        if (!ai.e(v.a("file:///", arrayOfString[b]))) {
          fileConnection1.close();
          a(arrayOfString[b], paramVector);
        } else {
          fileConnection1.close();
          paramVector.addElement(arrayOfString[b]);
        } 
      } 
    } catch (Exception exception) {}
    return paramVector;
  }
  
  public final boolean c(String paramString) {
    return ((this.b = (FileConnection)Connector.open(paramString)) != null);
  }
  
  public final boolean g() {
    return this.b.exists();
  }
  
  public final void c() {
    this.b.delete();
  }
  
  public final void d() {
    this.b.create();
  }
  
  public final long e() {
    return this.b.fileSize();
  }
  
  public final long f() {
    return this.b.availableSize();
  }
  
  public final OutputStream b(long paramLong) {
    return this.b.openOutputStream(paramLong);
  }
  
  public final void e() {
    this.b.close();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ac.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */