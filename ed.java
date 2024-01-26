import i.PI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VideoControl;
import javax.microedition.midlet.MIDlet;
import jimm.Jimm;

public final class ed implements CommandListener, br, Runnable {
  private int f;
  
  private bn g;
  
  private Form h;
  
  private InputStream i;
  
  private int j;
  
  private String k;
  
  private String l;
  
  public be a;
  
  private TextField m;
  
  private TextField n;
  
  private Alert o;
  
  public int b;
  
  private dm p;
  
  public PI c;
  
  private String q;
  
  private String r;
  
  private Command s = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 2);
  
  private Command t = new Command(bb.a((short)14), 4, 1);
  
  public boolean d = false;
  
  public static boolean e;
  
  public ed(int paramInt, dm paramdm) {
    this.b = paramInt;
    this.p = paramdm;
  }
  
  public ed(int paramInt, PI paramPI) {
    this.b = paramInt;
    this.p = null;
    this.c = paramPI;
  }
  
  public final void a(InputStream paramInputStream, int paramInt) {
    this.i = paramInputStream;
    this.j = paramInt;
  }
  
  public final void b() {
    if (em.h(54) && e) {
      this.a = new be(bb.a((short)259));
      this.a.a(dh.a(bb.a((short)256), "\\n", "\n"), bd.g(), 0, -1);
      this.a.x(-1);
      this.a.x(-1);
      this.a.a(dh.a(bb.a((short)257), "\\n", "\n"), bd.g(), 1, 20000);
      this.a.x(1);
      this.a.a(dh.a(bb.a((short)258), "\\n", "\n"), bd.g(), 1, 20001);
      this.a.x(2);
      this.a.w(20000);
      this.a.a(dw.q, bd.aa);
      this.a.a(this);
      this.a.b(Jimm.d);
      return;
    } 
    c();
  }
  
  private void c() {
    if (this.b == 2) {
      this.g = new bn(this);
      Display.getDisplay((MIDlet)Jimm.c).setCurrent((Displayable)this.g);
      this.g.a();
      return;
    } 
    if (this.b == 1)
      try {
        bl.a(this);
        bl.a(false);
        bl.a();
        bl.a(false);
        return;
      } catch (cr cr) {
        cr.a(null);
        return;
      }  
    if (this.b == 3)
      try {
        bl.a(this);
        bl.a(false);
        bl.a(true);
        bl.a();
        return;
      } catch (cr cr) {
        cr.a(null);
      }  
  }
  
  public final void run() {
    switch (this.f) {
      case 10001:
        try {
          d();
        } catch (cr cr) {
          this.l = cr.getMessage();
        } 
        this.f = 10002;
        Jimm.d.callSerially(this);
        return;
      case 10002:
        e();
        if (this.l != null) {
          this.o = new Alert(bb.a((short)223), this.l, null, AlertType.ERROR);
          this.o.setCommandListener(this);
          this.o.setTimeout(-2);
          Jimm.d.setCurrent((Displayable)this.o);
          return;
        } 
        this.p.p();
        break;
    } 
  }
  
  private void d() throws cr {
    this.l = null;
    String str1 = null;
    String str2 = null;
    switch (em.f(203)) {
      case 10:
        str1 = "filetransfer.jimm.org";
        str2 = "jimm";
        break;
      case 11:
        str1 = "files.jimm.net.ru:81";
        str2 = "aspro";
        break;
      case 9:
        str1 = "ft.fay.by:89";
        str2 = "fay";
        break;
      default:
        str1 = "ft.fay.by:89";
        str2 = "fay";
        break;
    } 
    String str3 = "http://" + str1 + "/__receive_file.php";
    String str4;
    if (((str4 = "78").length() & 0x1) == 1)
      str4 = "0" + str4; 
    if (str2.equals("fay")) {
      String str = em.c(-1);
      try {
        String str5 = "" + (Integer.parseInt(str) + 21436587);
        str5 = c(str5) + str5 + (this.p.n + 18273645);
        str5 = c(str5) + str5;
        str3 = str3 + "?rnd=" + str4 + str5;
        str3 = str3 + "&cli=loc";
      } catch (Exception exception) {}
    } 
    int i = 0;
    int j = 0;
    try {
      HttpConnection httpConnection;
      (httpConnection = (HttpConnection)Connector.open(str3, 3)).setRequestMethod("POST");
      String str = (str4 + "a9f843c9b8a736e53c40f598d434d283e4d9ff71").substring(0, 40);
      httpConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str);
      httpConnection.setRequestProperty("Keep-Alive", "300");
      httpConnection.setRequestProperty("Connection", "keep-alive");
      httpConnection.setRequestProperty("Proxy-Connection", "keep-alive");
      StringBuffer stringBuffer1;
      (stringBuffer1 = new StringBuffer()).append("--").append(str).append("\r\n");
      stringBuffer1.append("Content-Disposition: form-data; name=\"jimmfile\"; filename=\"").append(this.r).append("\"\r\n");
      stringBuffer1.append("Content-Type: application/octet-stream\r\n");
      stringBuffer1.append("Content-Transfer-Encoding: binary\r\n");
      stringBuffer1.append("\r\n");
      byte[] arrayOfByte1 = dh.a(stringBuffer1.toString(), true);
      StringBuffer stringBuffer2;
      (stringBuffer2 = new StringBuffer()).append("\r\n--").append(str).append("--\r\n");
      byte[] arrayOfByte2 = dh.a(stringBuffer2.toString(), true);
      httpConnection.setRequestProperty("Content-Length", "" + (this.j + arrayOfByte1.length + arrayOfByte2.length));
      OutputStream outputStream;
      (outputStream = httpConnection.openOutputStream()).write(arrayOfByte1);
      if (str2.equals("fay"))
        ef.j = true; 
      byte[] arrayOfByte3 = new byte[2048];
      i = this.j;
      while (true) {
        int k = this.i.read(arrayOfByte3);
        outputStream.write(arrayOfByte3, 0, k);
        i -= k;
        if (this.j != 0) {
          ef.b(j = 100 * (this.j - i) / this.j);
          ef.a(bb.a((short)260) + " " + j + "% " + str2);
        } 
        if (i <= 0) {
          ef.a(bb.a((short)260));
          db.d(this.j);
          outputStream.write(arrayOfByte2);
          outputStream.close();
          if ((k = httpConnection.getResponseCode()) != 200)
            throw new cr((short)651, 194, k); 
          InputStream inputStream = httpConnection.openInputStream();
          StringBuffer stringBuffer3 = new StringBuffer();
          int m;
          while ((m = inputStream.read()) != -1)
            stringBuffer3.append((char)(m & 0xFF)); 
          String str5;
          if ((str5 = stringBuffer3.toString()).indexOf("http://") == -1)
            throw new cr((short)652, 195, 0); 
          str5 = dh.a(dh.a(str5, "\r", ""), "\n", "");
          inputStream.close();
          httpConnection.close();
          StringBuffer stringBuffer4;
          (stringBuffer4 = new StringBuffer()).append("FileSize: ").append(this.j / 1024).append("KB").append("\n");
          stringBuffer4.append("Link: ").append(str5);
          if (this.k != null && !"".equals(this.k))
            stringBuffer4.append("\nComment: ").append(this.k); 
          if (this.r.lastIndexOf('.') != -1)
            stringBuffer4.append("\nFileType: ").append(this.r.substring(this.r.lastIndexOf('.') + 1)); 
          dw.b(stringBuffer4.toString(), this.p, (byte)2);
          return;
        } 
      } 
    } catch (IOException iOException) {
      throw new cr((short)653, 196, 101);
    } catch (Exception exception) {
      throw new cr((short)653, 196, 100);
    } 
  }
  
  private static String c(String paramString) {
    return (paramString.length() < 10) ? ("0" + paramString.length()) : ("" + paramString.length());
  }
  
  public final boolean a(String paramString) {
    try {
      if (this.c != null) {
        if (this.b == 1)
          this.c.activate(40, null, paramString); 
        if (this.b == 3)
          this.c.activate(41, null, paramString); 
        return true;
      } 
      InputStream inputStream = null;
      int i = 0;
      cb cb;
      (cb = cb.a()).b(paramString);
      inputStream = cb.c();
      if (this.p == null) {
        em.b(134, paramString);
        em.y.a();
        bd.a(inputStream, false);
        if (this.d)
          em.a(bd.n); 
        return true;
      } 
      i = (int)cb.e();
      a(inputStream, i);
      a(cb.g(), "");
      return true;
    } catch (Exception exception) {
      cr.a(new cr((short)648, 191, 1, true));
      return true;
    } 
  }
  
  public final void b(String paramString) {
    if (this.c != null) {
      if (this.b == 3)
        this.c.activate(41, null, paramString); 
      return;
    } 
  }
  
  public final void a() {
    if (this.p != null) {
      bi.i();
      return;
    } 
    if (this.c != null) {
      if (this.b == 1)
        this.c.activate(40, null, null); 
      if (this.b == 3)
        this.c.activate(41, null, null); 
      bl.a(false);
      return;
    } 
    em.y.a();
  }
  
  private void b(String paramString1, String paramString2) {
    this.g = null;
    this.k = paramString2;
    ef.b(0);
    ef.a(bb.a((short)286));
    ef.a(ef.c);
    ef.a(this);
    ef.a();
    dt dt = new dt(em.c(-1), this.p, 26, paramString1, paramString2, this.i, this.j);
    do do = new do(dt);
    try {
      cd.a(do);
      return;
    } catch (cr cr2) {
      cr cr1;
      cr.a(cr1 = null);
      if (cr1.a)
        return; 
      return;
    } 
  }
  
  public final void a(String paramString1, String paramString2) {
    this.h = new Form(bb.a((short)210));
    this.m = new TextField(bb.a((short)241), paramString1, 255, 0);
    this.n = dw.a(new TextField(bb.a((short)208), paramString2, 255, 0));
    this.h.append((Item)new StringItem(this.p.getUinString(), this.p.o));
    this.h.append((Item)this.m);
    this.h.append((Item)this.n);
    this.h.append((Item)new StringItem(bb.a((short)437) + ": ", String.valueOf(this.j / 1024) + " kb"));
    this.h.append((Item)new StringItem(bb.a((short)191) + ": ", db.a(((this.j / em.f(217) + 1) * em.f(215))) + " " + em.d(115)));
    this.h.addCommand(this.s);
    this.h.addCommand(this.t);
    this.h.setCommandListener(this);
    Jimm.d.setCurrent((Displayable)this.h);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (dw.a(this.a) && paramCommand == dw.q) {
      int i;
      switch (i = this.a.A()) {
        case 20000:
        case 20001:
          em.a(229, (i == 20001) ? 1 : 0);
          em.a(54, false);
          em.b(17);
          c();
          return;
      } 
      return;
    } 
    if (this.o != null && paramDisplayable == this.o) {
      this.p.p();
      return;
    } 
    if (paramCommand == this.t) {
      if (paramDisplayable == this.h) {
        String[] arrayOfString;
        switch (em.f(229)) {
          case 1:
            b(this.m.getString(), this.n.getString());
            return;
          case 0:
            ef.b(0);
            ef.a(bb.a((short)286));
            ef.b(ef.c);
            ef.a(this);
            ef.a();
            this.q = this.m.getString();
            this.k = this.n.getString();
            arrayOfString = dh.a(this.q, '/');
            this.r = (arrayOfString.length == 0) ? this.q : arrayOfString[arrayOfString.length - 1];
            this.f = 10001;
            (new Thread(this)).start();
            break;
        } 
        return;
      } 
    } else {
      if (paramCommand == this.s) {
        e();
        this.p.p();
        return;
      } 
      if (paramCommand == ef.c) {
        e();
        bi.i();
      } 
    } 
  }
  
  private void e() {
    this.g = null;
    this.i = null;
    this.k = null;
    this.h = null;
    this.m = null;
    dw.i();
  }
  
  public static bn a(ed paramed, bn parambn) {
    return paramed.g = parambn;
  }
  
  public class bn extends Canvas implements CommandListener {
    private Player a;
    
    private VideoControl b;
    
    private boolean c;
    
    private boolean d;
    
    private Image e;
    
    private byte[] f;
    
    private int g;
    
    private int h;
    
    private String i;
    
    private String j;
    
    private Command k;
    
    private Command l;
    
    private final ed m;
    
    public bn(ed this$0) {
      this.m = this$0;
      this.a = null;
      this.b = null;
      this.c = false;
      this.d = true;
      this.g = 0;
      this.h = 0;
      this.i = null;
      this.j = "jpeg";
      this.k = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 2);
      this.l = new Command(bb.a((short)14), 1, 1);
      addCommand(this.k);
      addCommand(this.l);
      setCommandListener(this);
    }
    
    private void b() {
      this.e = null;
      if (this.b != null) {
        this.b.setVisible(false);
        this.b = null;
      } 
      if (this.a != null) {
        try {
          if (this.a.getState() == 400)
            this.a.stop(); 
          this.a.deallocate();
          this.a.close();
        } catch (Exception exception) {}
        this.a = null;
      } 
      dw.i();
    }
    
    public final void paint(Graphics param1Graphics) {
      param1Graphics.setColor(-1);
      param1Graphics.fillRect(0, 0, getWidth(), getHeight());
      if (!this.d && this.e != null)
        param1Graphics.drawImage(this.e, getWidth() / 2, getHeight() / 2, 3); 
      param1Graphics.setColor(0);
      if (this.d) {
        param1Graphics.drawString(bb.a((short)499) + " " + (getWidth() - 2) + "x" + (getHeight() - 2), 1, 1, 20);
        return;
      } 
      param1Graphics.drawString(bb.a((short)419) + "? " + this.g + "x" + this.h, 1, 1, 20);
    }
    
    private static int a(String param1String1, String param1String2) {
      int i = 0;
      int j = 0;
      byte b = 0;
      if (param1String1 != null && param1String2 != null)
        while ((i = param1String1.indexOf(param1String2, j)) != -1) {
          j = i + param1String2.length();
          b++;
        }  
      return b;
    }
    
    public final synchronized void a() {
      b();
      if (!this.c)
        try {
          String str1 = "capture://image";
          try {
            this.a = Manager.createPlayer(str1);
          } catch (Exception exception) {
            str1 = "capture://video";
            this.a = Manager.createPlayer(str1);
          } 
          this.a.realize();
          int i = em.f(253);
          int j = em.f(252);
          this.i = null;
          int k = 0;
          int m = 0;
          String[] arrayOfString = dh.a(System.getProperty("video.snapshot.encodings"), ' ');
          String str2 = "";
          int n;
          for (n = 0; n < arrayOfString.length; n++) {
            String[] arrayOfString1 = dh.a(arrayOfString[n], '&');
            String str3 = null;
            String str4 = null;
            for (byte b = 0; b < arrayOfString1.length; b++) {
              String[] arrayOfString2;
              if ((arrayOfString2 = dh.a(arrayOfString1[b], '='))[0].equals("encoding")) {
                if (a(str2, arrayOfString2[1]) == 0) {
                  if (k == j) {
                    this.i = "encoding=" + arrayOfString2[1];
                    this.j = arrayOfString2[1];
                  } 
                  str2 = str2 + arrayOfString2[1];
                  k++;
                } 
              } else if (arrayOfString2[0].equals("width")) {
                str3 = arrayOfString2[1];
              } else if (arrayOfString2[0].equals("height")) {
                str4 = arrayOfString2[1];
              } 
            } 
            if (str3 != null && str4 != null) {
              if (m == i) {
                this.i += "&width=" + str3 + "&" + "height=" + str4;
                break;
              } 
              m++;
            } 
          } 
          this.b = (VideoControl)this.a.getControl("VideoControl");
          if (this.b != null) {
            this.b.initDisplayMode(1, this);
            n = getWidth();
            int i1 = getHeight();
            try {
              this.b.setDisplayLocation(2, 2);
              this.b.setDisplaySize(n - 4, i1 - 4);
            } catch (MediaException mediaException) {
              try {
                this.b.setDisplayFullScreen(true);
              } catch (MediaException mediaException1) {}
            } 
            this.b.setVisible(true);
            this.a.start();
            this.c = true;
            return;
          } 
          cr.a(new cr((short)642, 180, 0, true));
          return;
        } catch (IOException iOException) {
          b();
          cr.a(new cr((short)643, 181, 0, true));
          return;
        } catch (MediaException mediaException) {
          b();
          cr.a(new cr((short)643, 181, 1, true));
          return;
        } catch (SecurityException securityException) {
          b();
          cr.a(new cr((short)643, 181, 2, true));
        }  
    }
    
    private byte[] a(String param1String) {
      byte[] arrayOfByte;
      try {
        arrayOfByte = this.b.getSnapshot(param1String);
      } catch (Exception exception) {
        return null;
      } 
      return arrayOfByte;
    }
    
    private void c() {
      if (this.a != null) {
        this.f = a(this.i);
        if (this.f == null)
          this.f = a("JPEG"); 
        if (this.f == null)
          this.f = a(null); 
        if (this.f == null)
          cr.a(new cr((short)645, 183, 0, true)); 
        this.e = Image.createImage(this.f, 0, this.f.length);
        this.g = this.e.getWidth();
        this.h = this.e.getHeight();
        this.e = dh.a(this.e, getWidth(), getHeight());
        this.d = false;
        this.b.setVisible(false);
        repaint();
      } 
    }
    
    private synchronized void d() {
      if (this.c) {
        try {
          this.b.setVisible(false);
          this.a.stop();
        } catch (Exception exception) {
          b();
        } 
        this.c = false;
      } 
    }
    
    public final void commandAction(Command param1Command, Displayable param1Displayable) {
      if (param1Command == this.l) {
        if (!this.d) {
          d();
          b();
          this.m.a(new ByteArrayInputStream(this.f), this.f.length);
          this.m.a("cam_" + dh.b(false, true, dh.a(false)) + "_" + dh.a() + "." + this.j, "");
          return;
        } 
        c();
        return;
      } 
      if (param1Command == this.k) {
        if (!this.d) {
          this.d = true;
          this.c = false;
          a();
          return;
        } 
        d();
        b();
        if (this.m.c != null) {
          if (this.m.b == 1)
            this.m.c.activate(40, null, null); 
          if (this.m.b == 3)
            this.m.c.activate(41, null, null); 
          return;
        } 
        dw.d();
        ed.a(this.m, (bn)null);
      } 
    }
    
    public final void keyPressed(int param1Int) {
      if (getGameAction(param1Int) == 8) {
        if (!this.d) {
          d();
          b();
          this.m.a(new ByteArrayInputStream(this.f), this.f.length);
          this.m.a("cam_" + dh.b(false, true, dh.a(false)) + "_" + dh.a() + ".jpeg", "");
          return;
        } 
        c();
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ed.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */