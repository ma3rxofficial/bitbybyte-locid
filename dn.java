import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class dn extends ek implements Runnable {
  private HttpConnection e;
  
  private HttpConnection f;
  
  private InputStream g;
  
  private OutputStream h;
  
  private String i = "http://http.proxy.icq.com/hello";
  
  private int j = 0;
  
  private String k;
  
  private String l;
  
  private int m;
  
  private int n = 0;
  
  public final synchronized void a(String paramString, boolean paramBoolean) throws cr {
    try {
      this.n++;
      if (this.n == 1) {
        this.b = false;
        this.c = new Thread(this);
        this.c.start();
        if (em.f(257) != 5)
          this.c.setPriority(em.f(257)); 
        wait();
      } 
      String str = paramString.substring(0, paramString.indexOf(":"));
      int i = Integer.parseInt(paramString.substring(paramString.indexOf(":") + 1));
      byte[] arrayOfByte;
      dh.b(arrayOfByte = new byte[str.length() + 4], 0, str.length());
      System.arraycopy(dh.a(str), 0, arrayOfByte, 2, str.length());
      dh.b(arrayOfByte, 2 + str.length(), i);
      a(null, arrayOfByte, 3, this.n);
      if (this.n != 1) {
        eq eq = new eq();
        a(eq, null, 5, this.n - 1);
        a(null, new byte[0], 6, this.n - 1);
      } 
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new cr((short)615, 127, 0);
    } catch (InterruptedException interruptedException) {
      return;
    } 
  }
  
  public final synchronized void a() {
    this.b = true;
    try {
      this.g.close();
    } catch (Exception exception) {
    
    } finally {
      this.g = null;
    } 
    try {
      this.h.close();
    } catch (Exception exception) {
    
    } finally {
      this.h = null;
    } 
    try {
      this.e.close();
      this.f.close();
    } catch (Exception exception) {
    
    } finally {
      this.e = null;
      this.f = null;
    } 
    Thread.yield();
  }
  
  private void a(dd paramdd, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws cr {
    try {
      this.f = (HttpConnection)Connector.open("http://" + this.l + ":" + this.m + "/data?sid=" + this.k + "&seq=" + this.j, 3);
      this.f.setRequestProperty("User-Agent", em.d(104));
      this.f.setRequestProperty("x-wap-profile", em.d(105));
      this.f.setRequestProperty("Cache-Control", "no-store no-cache");
      this.f.setRequestProperty("Pragma", "no-cache");
      this.f.setRequestMethod("POST");
      this.h = this.f.openOutputStream();
    } catch (IOException iOException) {
      a();
    } 
    if (this.h == null)
      throw new cr((short)616, 128, 0, true); 
    synchronized (this.h) {
      try {
        if (paramArrayOfbyte == null) {
          paramArrayOfbyte = paramdd.a(d());
          Object object = null;
        } 
        byte[] arrayOfByte;
        dh.b(arrayOfByte = new byte[14 + paramArrayOfbyte.length], 0, paramArrayOfbyte.length + 12);
        dh.b(arrayOfByte, 2, 1091);
        dh.b(arrayOfByte, 4, paramInt1);
        dh.a(arrayOfByte, 6, 0L);
        dh.a(arrayOfByte, 10, paramInt2);
        System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 14, paramArrayOfbyte.length);
        this.h.write(arrayOfByte);
        if (this.f.getResponseCode() != 200) {
          a();
        } else {
          this.j++;
        } 
        try {
          this.h.close();
          this.f.close();
        } catch (Exception exception) {
        
        } finally {
          this.h = null;
          this.f = null;
        } 
        db.d(arrayOfByte.length + 40 + 190 + 14 + 170);
      } catch (IOException iOException) {
        a();
      } 
      return;
    } 
  }
  
  public final void a(dd paramdd) throws cr {
    a(paramdd, null, 5, this.n);
  }
  
  public final void run() {
    byte[] arrayOfByte1 = new byte[2];
    byte[] arrayOfByte2 = new byte[0];
    int i = 0;
    int j = 0;
    synchronized (this) {
      this.d = new Vector();
    } 
    try {
      while (!this.b) {
        this.e = (HttpConnection)Connector.open(this.i, 3);
        this.e.setRequestProperty("User-Agent", em.d(104));
        this.e.setRequestProperty("x-wap-profile", em.d(105));
        this.e.setRequestProperty("Cache-Control", "no-store no-cache");
        this.e.setRequestProperty("Pragma", "no-cache");
        this.e.setRequestMethod("GET");
        this.g = this.e.openInputStream();
        if (this.e.getResponseCode() != 200)
          throw new IOException(); 
        j = 0;
        do {
          int m = 0;
          int k;
          while ((k = this.g.read(arrayOfByte1, m, arrayOfByte1.length - m)) != -1) {
            m += k;
            j += k;
            if (m >= arrayOfByte1.length)
              break; 
          } 
          if (k == -1)
            break; 
          byte[] arrayOfByte = new byte[dh.c(arrayOfByte1, 0)];
          m = 0;
          while ((k = this.g.read(arrayOfByte, m, arrayOfByte.length - m)) != -1) {
            m += k;
            j += k;
            if (m >= arrayOfByte.length)
              break; 
          } 
          if (k == -1)
            break; 
          if (dh.c(arrayOfByte, 2) == 5) {
            int n = 12;
            while (n < arrayOfByte.length) {
              if (!i) {
                if (dh.a(arrayOfByte, n) != 42)
                  throw new cr((short)612, 124, 0); 
                arrayOfByte2 = new byte[dh.c(arrayOfByte, n + 4) + 6];
              } 
              if (arrayOfByte.length - n >= arrayOfByte2.length - i) {
                System.arraycopy(arrayOfByte, n, arrayOfByte2, i, arrayOfByte2.length - i);
                n += arrayOfByte2.length - i;
                i = arrayOfByte2.length;
              } else {
                System.arraycopy(arrayOfByte, n, arrayOfByte2, i, arrayOfByte.length - n);
                i += arrayOfByte.length - n;
                n += arrayOfByte.length - n;
              } 
              if (i == arrayOfByte2.length) {
                synchronized (this.d) {
                  this.d.addElement(arrayOfByte2);
                } 
                i = 0;
              } 
            } 
            synchronized (cd.h) {
              cd.h.notify();
            } 
          } else if (dh.c(arrayOfByte, 2) == 7) {
            if (dh.c(arrayOfByte, 10) == this.n)
              throw new cr((short)655, 221, 0); 
          } else if (dh.c(arrayOfByte, 2) == 2) {
            synchronized (this) {
              byte[] arrayOfByte3 = new byte[16];
              System.arraycopy(arrayOfByte, 10, arrayOfByte3, 0, 16);
              this.k = dh.c(arrayOfByte3);
              byte[] arrayOfByte4 = new byte[dh.c(arrayOfByte, 26)];
              System.arraycopy(arrayOfByte, 28, arrayOfByte4, 0, arrayOfByte4.length);
              this.l = dh.a(arrayOfByte4);
              this.m = dh.c(arrayOfByte, 28 + arrayOfByte4.length);
              this.i = "http://" + this.l + ":" + this.m + "/monitor?sid=" + this.k;
              notify();
            } 
          } 
        } while (j < this.e.getLength());
        db.b(j + 42 + 185 + 175);
        try {
          this.g.close();
          this.e.close();
        } catch (Exception exception) {
        
        } finally {
          this.g = null;
          this.e = null;
        } 
      } 
      return;
    } catch (NullPointerException nullPointerException) {
      if (!this.b)
        cr.a(new cr((short)613, 125, 3)); 
      return;
    } catch (cr cr) {
      cr.a(null);
      return;
    } catch (IOException iOException) {
      if (!this.b)
        cr.a(new cr((short)613, 125, 1)); 
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */