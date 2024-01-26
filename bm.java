import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class bm extends ek implements Runnable {
  private SocketConnection e;
  
  private InputStream f;
  
  private OutputStream g;
  
  private int h;
  
  public final synchronized void a(String paramString, boolean paramBoolean) throws cr {
    try {
      this.e = (SocketConnection)Connector.open("socket://" + paramString, 3);
      cl.a(0, "", "connect to host:", "" + paramString);
      this.f = this.e.openInputStream();
      this.g = this.e.openOutputStream();
      this.b = false;
      this.c = new Thread(this);
      this.c.start();
      this.a = cd.a(paramBoolean);
      this.h = 2;
      return;
    } catch (ConnectionNotFoundException connectionNotFoundException) {
      cl.a(0, "", "connection failed to host:", "" + paramString);
      throw new cr((short)609, 121, 0);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new cr((short)610, 122, 0);
    } catch (IOException iOException) {
      throw new cr((short)608, 120, 20);
    } 
  }
  
  public final synchronized void a() {
    this.b = true;
    try {
      this.f.close();
    } catch (Exception exception) {
    
    } finally {
      this.f = null;
    } 
    try {
      this.g.close();
    } catch (Exception exception) {
    
    } finally {
      this.g = null;
    } 
    try {
      this.e.close();
    } catch (Exception exception) {
    
    } finally {
      this.e = null;
    } 
    Thread.yield();
  }
  
  public final void a(dd paramdd) throws cr {
    if (this.g == null) {
      cr cr = new cr((short)611, 123, 0);
      if (this == cd.i && !cd.a(cr))
        throw cr; 
    } 
    synchronized (this.g) {
      if (paramdd instanceof dg)
        ((dg)paramdd).i = this.h++; 
      try {
        byte[] arrayOfByte = paramdd.a(d());
        this.g.write(arrayOfByte);
        this.g.flush();
        db.d(arrayOfByte.length + 51);
      } catch (IOException iOException) {
        a();
        cr cr = new cr((short)608, 120, 3);
        if (this == cd.i && !cd.a(cr))
          throw cr; 
      } 
      return;
    } 
  }
  
  public final int b() {
    try {
      return this.e.getLocalPort();
    } catch (IOException iOException) {
      return 0;
    } 
  }
  
  public final byte[] c() {
    try {
      return dh.e(this.e.getLocalAddress());
    } catch (IOException iOException) {
      return new byte[4];
    } 
  }
  
  public final void run() {
    byte[] arrayOfByte = new byte[6];
    synchronized (this) {
      this.d = new Vector();
    } 
    try {
      while (!this.b) {
        int j = 0;
        if (em.f(201) == 1) {
          while (this.f.available() == 0)
            Thread.sleep(250L); 
          if (this.f == null)
            return; 
        } 
        int i;
        do {
        
        } while ((i = this.f.read(arrayOfByte, j, arrayOfByte.length - j)) != -1 && (j += i) < arrayOfByte.length);
        if (i == -1)
          return; 
        if (dh.a(arrayOfByte, 0) != 42)
          throw new cr((short)612, 124, 0); 
        byte[] arrayOfByte1 = new byte[dh.c(arrayOfByte, 4)];
        j = 0;
        do {
        
        } while ((i = this.f.read(arrayOfByte1, j, arrayOfByte1.length - j)) != -1 && (j += i) < arrayOfByte1.length);
        if (i == -1)
          return; 
        byte[] arrayOfByte2 = new byte[arrayOfByte.length + arrayOfByte1.length];
        System.arraycopy(arrayOfByte, 0, arrayOfByte2, 0, arrayOfByte.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, arrayOfByte.length, arrayOfByte1.length);
        db.b(j + 57);
        synchronized (this.d) {
          this.d.addElement(arrayOfByte2);
        } 
        synchronized (cd.h) {
          cd.h.notify();
        } 
      } 
      return;
    } catch (NullPointerException nullPointerException) {
      if (!this.b) {
        Object object = null;
        cr.a(new cr((short)608, 120, 3));
      } 
      this.b = false;
      return;
    } catch (InterruptedException interruptedException) {
      return;
    } catch (cr cr) {
      if (this == cd.i && !cd.a(cr))
        cr.a(cr); 
      return;
    } catch (IOException iOException) {
      if (!this.b) {
        cr cr = new cr((short)608, 120, 1);
        if (this == cd.i && !cd.a(cr))
          cr.a(cr); 
      } 
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */