import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class en implements Runnable {
  public int a = 0;
  
  private SocketConnection b;
  
  private InputStream c;
  
  private OutputStream d;
  
  private volatile boolean e;
  
  private volatile Thread f;
  
  private Vector g;
  
  private int f() {
    int i = this.a;
    this.a = ++this.a % 32768;
    return i;
  }
  
  public final synchronized void a(String paramString) throws cr {
    try {
      this.b = (SocketConnection)Connector.open("socket://" + paramString, 3);
      cl.a(0, "", "peer connect:", "" + paramString);
      this.c = this.b.openInputStream();
      this.d = this.b.openOutputStream();
      this.e = false;
      this.f = new Thread(this);
      if (em.f(257) != 5)
        this.f.setPriority(em.f(257)); 
      this.f.start();
      return;
    } catch (ConnectionNotFoundException connectionNotFoundException) {
      throw new cr((short)614, 126, 0, true, true);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new cr((short)615, 127, 0, true, true);
    } catch (IOException iOException) {
      throw new cr((short)613, 125, 0, true, true);
    } 
  }
  
  public final synchronized void a() {
    this.e = true;
    try {
      this.c.close();
    } catch (Exception exception) {
    
    } finally {
      this.c = null;
    } 
    try {
      this.d.close();
    } catch (Exception exception) {
    
    } finally {
      this.d = null;
    } 
    try {
      this.b.close();
    } catch (Exception exception) {
    
    } finally {
      this.b = null;
    } 
    Thread.yield();
  }
  
  public final synchronized int b() {
    return (this.g == null) ? 0 : this.g.size();
  }
  
  public final dd c() throws cr {
    byte[] arrayOfByte;
    synchronized (this.g) {
      if (this.g.size() == 0)
        return null; 
      arrayOfByte = this.g.elementAt(0);
      this.g.removeElementAt(0);
    } 
    return dd.a(arrayOfByte);
  }
  
  public final void a(dd paramdd) throws cr {
    if (this.d == null)
      throw new cr((short)616, 128, 0, true, true); 
    synchronized (this.d) {
      try {
        byte[] arrayOfByte = paramdd.a(f());
        this.d.write(arrayOfByte);
        this.d.flush();
        db.d(arrayOfByte.length + 51);
      } catch (IOException iOException) {
        a();
      } 
      return;
    } 
  }
  
  public final int d() {
    try {
      return this.b.getLocalPort();
    } catch (IOException iOException) {
      return 0;
    } 
  }
  
  public final byte[] e() {
    try {
      return dh.e(this.b.getLocalAddress());
    } catch (IOException iOException) {
      return new byte[4];
    } 
  }
  
  public final void run() {
    byte[] arrayOfByte = new byte[2];
    synchronized (this) {
      this.g = new Vector();
    } 
    try {
      while (!this.e) {
        int j = 0;
        if (em.f(201) == 1) {
          while (this.c.available() == 0)
            Thread.sleep(250L); 
          if (this.c == null)
            return; 
        } 
        int i;
        do {
        
        } while ((i = this.c.read(arrayOfByte, j, arrayOfByte.length - j)) != -1 && (j += i) < arrayOfByte.length);
        if (i == -1)
          return; 
        byte[] arrayOfByte1 = new byte[dh.a(arrayOfByte, 0, false)];
        j = 0;
        do {
        
        } while ((i = this.c.read(arrayOfByte1, j, arrayOfByte1.length - j)) != -1 && (j += i) < arrayOfByte1.length);
        if (i == -1)
          return; 
        db.b(j + 53);
        synchronized (this.g) {
          this.g.addElement(arrayOfByte1);
        } 
        synchronized (cd.h) {
          cd.h.notify();
        } 
      } 
      return;
    } catch (NullPointerException nullPointerException) {
      if (!this.e) {
        Object object = null;
        cr.a(new cr((short)613, 125, 3, true, true));
      } 
      return;
    } catch (InterruptedException interruptedException) {
      return;
    } catch (IOException iOException) {
      if (!this.e) {
        Object object = null;
        cr.a(new cr((short)613, 125, 1, true, true));
      } 
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\en.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */