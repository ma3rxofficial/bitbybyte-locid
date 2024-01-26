import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class fg extends ek implements Runnable {
  private final byte[] e = new byte[] { 5, 2, 0, 2 };
  
  private SocketConnection f;
  
  private InputStream g;
  
  private OutputStream h;
  
  private boolean i = false;
  
  private int j;
  
  private synchronized String a(String paramString1, String paramString2) {
    if (dh.f(paramString1))
      return paramString1; 
    try {
      SocketConnection socketConnection = (SocketConnection)Connector.open("socket://" + paramString1 + ":" + paramString2, 3);
      cl.a(0, "", "connect to host:", "" + paramString1 + ":" + paramString2);
      String str = socketConnection.getAddress();
      try {
        socketConnection.close();
      } catch (Exception exception) {
      
      } finally {}
      return str;
    } catch (Exception exception) {
      return "0.0.0.0";
    } 
  }
  
  private byte[] a(byte paramByte, String paramString1, String paramString2) {
    byte[] arrayOfByte1;
    byte b;
    if (paramByte == 5) {
      b = 7 + paramString1.length();
      arrayOfByte1 = dh.a(paramString1);
    } else {
      b = 9;
      Object object = null;
      arrayOfByte1 = dh.e(a(paramString1, paramString2));
    } 
    byte[] arrayOfByte2;
    (arrayOfByte2 = new byte[b])[0] = paramByte;
    arrayOfByte2[1] = 1;
    if (paramByte == 5) {
      arrayOfByte2[2] = 0;
      arrayOfByte2[3] = 3;
      dh.a(arrayOfByte2, 4, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 5, arrayOfByte1.length);
      dh.b(arrayOfByte2, 5 + arrayOfByte1.length, Integer.parseInt(paramString2));
    } else {
      dh.b(arrayOfByte2, 2, Integer.parseInt(paramString2));
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 4, arrayOfByte1.length);
      arrayOfByte2[8] = 0;
    } 
    return arrayOfByte2;
  }
  
  private static byte[] b(String paramString1, String paramString2) {
    byte[] arrayOfByte1;
    dh.a(arrayOfByte1 = new byte[3 + paramString1.length() + paramString2.length()], 0, 1);
    dh.a(arrayOfByte1, 1, paramString1.length());
    dh.a(arrayOfByte1, paramString1.length() + 2, paramString2.length());
    byte[] arrayOfByte2 = dh.a(paramString1);
    byte[] arrayOfByte3 = dh.a(paramString2);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 2, arrayOfByte2.length);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte1, arrayOfByte2.length + 3, arrayOfByte3.length);
    return arrayOfByte1;
  }
  
  public final synchronized void a(String paramString, boolean paramBoolean) throws cr {
    int i = em.f(221);
    this.i = false;
    String str1 = "";
    String str2 = "";
    if (i != 0) {
      byte b1 = 0;
      for (byte b2 = 0; b2 < paramString.length(); b2++) {
        if (paramString.charAt(b2) == ':') {
          b1 = b2;
          break;
        } 
      } 
      str1 = paramString.substring(0, b1);
      str2 = paramString.substring(b1 + 1);
    } 
    try {
      switch (i) {
        case 0:
          b((byte)4, str1, str2);
          break;
        case 1:
          b((byte)5, str1, str2);
          break;
        case 2:
          try {
            b((byte)5, str1, str2);
          } catch (Exception exception) {}
          if (!this.i) {
            g();
            try {
              Thread.sleep(2000L);
            } catch (InterruptedException interruptedException) {}
            b((byte)4, str1, str2);
          } 
          break;
      } 
      this.b = false;
      this.c = new Thread(this);
      if (em.f(257) != 5)
        this.c.setPriority(em.f(257)); 
      this.c.start();
      (new Random(System.currentTimeMillis())).nextInt();
      this.a = cd.a(paramBoolean);
      this.j = 2;
      return;
    } catch (cr cr) {
      throw null;
    } 
  }
  
  private synchronized void b(byte paramByte, String paramString1, String paramString2) throws cr {
    String str1 = em.d(138);
    String str2 = em.d(139);
    String str3 = em.d(141);
    String str4 = em.d(142);
    byte b = 0;
    int i = 0;
    int j = 0;
    try {
      this.f = (SocketConnection)Connector.open("socket://" + str1 + ":" + str2, 3);
      cl.a(0, "", "connect to proxy:", "" + str1 + ":" + str2);
      this.g = this.f.openInputStream();
      this.h = this.f.openOutputStream();
      if (paramByte == 5) {
        this.h.write(this.e);
        this.h.flush();
        while (this.g.available() == 0 && b < 50) {
          try {
            b++;
            Thread.sleep(100L);
          } catch (InterruptedException interruptedException) {}
        } 
        if (this.g.available() == 0)
          throw new cr((short)606, 118, 226); 
        i = this.g.read();
        j = this.g.read();
        if (i == 5 && j == 2) {
          this.h.write(b(str3, str4));
          this.h.flush();
          while (this.g.available() == 0 && b < 50) {
            try {
              b++;
              Thread.sleep(100L);
            } catch (InterruptedException interruptedException) {}
          } 
          if (this.g.available() == 0)
            throw new cr((short)606, 118, 227); 
          this.g.read();
          if ((j = this.g.read()) != 0)
            throw new cr((short)657, 227, j); 
        } else if (i != 5 || j != 0) {
          throw new cr((short)656, 226, 0);
        } 
      } 
      this.h.write(a(paramByte, paramString1, paramString2));
      this.h.flush();
      while (this.g.available() == 0 && b < 50) {
        try {
          b++;
          Thread.sleep(100L);
        } catch (InterruptedException interruptedException) {}
      } 
      if (this.g.available() == 0)
        throw new cr((short)606, 118, 226); 
      i = this.g.read();
      j = this.g.read();
      if (i == 5) {
        byte[] arrayOfByte;
        switch (j) {
          case 0:
            this.g.read();
            if (this.g.read() == 1) {
              byte[] arrayOfByte1 = new byte[6];
              this.g.read(arrayOfByte1);
              break;
            } 
            arrayOfByte = new byte[this.g.read() + 2];
            this.g.read(arrayOfByte);
            break;
          default:
            throw new cr((short)656, 226, j);
        } 
      } else {
        byte[] arrayOfByte;
        switch (j) {
          case 90:
            arrayOfByte = new byte[6];
            this.g.read(arrayOfByte);
            break;
          default:
            throw new cr((short)656, 226, j);
        } 
      } 
      this.i = true;
      return;
    } catch (ConnectionNotFoundException connectionNotFoundException) {
      throw new cr((short)609, 121, 226);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new cr((short)610, 122, 226);
    } catch (IOException iOException) {
      throw new cr((short)608, 120, 226);
    } 
  }
  
  public final synchronized void a() {
    this.b = true;
    g();
    Thread.yield();
  }
  
  private synchronized void g() {
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
      this.f.close();
      return;
    } catch (Exception exception) {
      return;
    } finally {
      this.f = null;
    } 
  }
  
  public final void a(dd paramdd) throws cr {
    cr cr;
    if (this.h == null && !cd.a(cr = new cr((short)611, 123, 0)))
      throw cr; 
    synchronized (this.h) {
      if (paramdd instanceof dg)
        ((dg)paramdd).i = this.j++; 
      try {
        byte[] arrayOfByte = paramdd.a(d());
        this.h.write(arrayOfByte);
        this.h.flush();
        db.d(arrayOfByte.length + 51);
      } catch (IOException iOException) {
        a();
      } 
      return;
    } 
  }
  
  public final int b() {
    try {
      return this.f.getLocalPort();
    } catch (IOException iOException) {
      return 0;
    } 
  }
  
  public final byte[] c() {
    try {
      return dh.e(this.f.getLocalAddress());
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
          while (this.g.available() == 0)
            Thread.sleep(250L); 
          if (this.g == null)
            return; 
        } 
        int i;
        do {
        
        } while ((i = this.g.read(arrayOfByte, j, arrayOfByte.length - j)) != -1 && (j += i) < arrayOfByte.length);
        if (i == -1)
          return; 
        if (dh.a(arrayOfByte, 0) != 42)
          throw new cr((short)612, 124, 0); 
        byte[] arrayOfByte1 = new byte[dh.c(arrayOfByte, 4)];
        j = 0;
        do {
        
        } while ((i = this.g.read(arrayOfByte1, j, arrayOfByte1.length - j)) != -1 && (j += i) < arrayOfByte1.length);
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
      cr.a(null);
      return;
    } catch (IOException iOException) {
      if (!this.b) {
        Object object = null;
        cr.a(new cr((short)608, 120, 1));
      } 
      this.b = false;
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\fg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */