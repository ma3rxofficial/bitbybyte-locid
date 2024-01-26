import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VideoControl;
import jimm.Jimm;

public final class bn extends Canvas implements CommandListener {
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
  
  public bn(ed paramed) {
    this.m = paramed;
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
  
  public final void paint(Graphics paramGraphics) {
    paramGraphics.setColor(-1);
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    if (!this.d && this.e != null)
      paramGraphics.drawImage(this.e, getWidth() / 2, getHeight() / 2, 3); 
    paramGraphics.setColor(0);
    if (this.d) {
      paramGraphics.drawString(bb.a((short)499) + " " + (getWidth() - 2) + "x" + (getHeight() - 2), 1, 1, 20);
      return;
    } 
    paramGraphics.drawString(bb.a((short)419) + "? " + this.g + "x" + this.h, 1, 1, 20);
  }
  
  private static int a(String paramString1, String paramString2) {
    int i = 0;
    int j = 0;
    byte b = 0;
    if (paramString1 != null && paramString2 != null)
      while ((i = paramString1.indexOf(paramString2, j)) != -1) {
        j = i + paramString2.length();
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
  
  private byte[] a(String paramString) {
    byte[] arrayOfByte;
    try {
      arrayOfByte = this.b.getSnapshot(paramString);
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
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.l) {
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
    if (paramCommand == this.k) {
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
  
  public final void keyPressed(int paramInt) {
    if (getGameAction(paramInt) == 8) {
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


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */