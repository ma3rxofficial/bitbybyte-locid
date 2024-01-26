package jimm;

import bb;
import bd;
import bi;
import cb;
import cd;
import ci;
import cz;
import db;
import dh;
import dq;
import dw;
import ef;
import em;
import fb;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class Jimm extends MIDlet {
  public static String a = "Jimm-Version";
  
  public static String b;
  
  public static Jimm c;
  
  public static Display d;
  
  public cd e;
  
  public static em f;
  
  public static boolean g = false;
  
  public static boolean h;
  
  public static boolean i;
  
  public static boolean j;
  
  public static boolean k;
  
  public static boolean l;
  
  private static Timer t = new Timer();
  
  public ef m;
  
  public cb n;
  
  public InputStream o;
  
  public static final String p = System.getProperty("microedition.platform");
  
  public static final String q = System.getProperty("microedition.profiles");
  
  public static boolean r = false;
  
  public static boolean s = true;
  
  public void startApp() throws MIDletStateChangeException {
    fb.a((MIDlet)this);
    if (c != null) {
      if (i)
        d(); 
      return;
    } 
    c = this;
    b = a();
    if (b == null)
      b = "0.1.1"; 
    if (f == null);
    em.a();
    this.m = new ef(bb.a((short)324));
    Display.getDisplay((MIDlet)this).setCurrent((Displayable)this.m);
    cz.b();
    d = Display.getDisplay((MIDlet)this);
    ef.a(bb.a((short)733));
    ef.b(10);
    ef.i();
    if (em.h(35)) {
      try {
        this.n = cb.a();
        this.n.b(em.d(134));
        this.o = this.n.c();
      } catch (IOException iOException) {
      
      } catch (Exception exception) {}
      bd.a(this.o, false);
    } 
    e();
    ef.a(bb.a((short)734));
    ef.b(20);
    this.e = new cd();
    ef.a(dw.a(cd.j()));
    ef.a(cd.k());
    ef.a(bb.a((short)735));
    ef.b(30);
    ef.a(bb.a((short)736));
    ef.b(40);
    ef.a(bb.a((short)737));
    ef.b(50);
    ef.a(bb.a((short)738));
    ef.b(55);
    bi.k();
    ef.a(bb.a((short)741));
    ef.b(60);
    ef.a(bb.a((short)739));
    ef.a(bb.a((short)740));
    ef.b(75);
    ef.a(bb.a((short)742));
    ef.b(80);
    ef.a(bb.a((short)743));
    ef.b(90);
    ef.a(bb.a((short)744));
    ef.b(100);
    bi.n();
    ci.a();
    bd.a(d);
    dq.a(d.getCurrent());
  }
  
  private static void e() {
    ef.k = false;
    a = ef.u.substring(0, 11) + "UR" + "L";
    String str1;
    if ((str1 = a()) == null) {
      ef.k = true;
      return;
    } 
    ef.l = "" + str1;
    String str2 = "";
    for (byte b = 0; b < str1.length(); b++) {
      if (str1.charAt(b) >= '0' && str1.charAt(b) <= '9')
        str2 = str2 + str1.charAt(b); 
    } 
    if (str2.length() <= 1)
      return; 
    ef.k = true;
    try {
      if (str2.length() != 7 && str2.length() != 8)
        return; 
      ef.k = (Long.parseLong(str2) % 13L != 7L);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static String a() {
    InputStream inputStream;
    if ((inputStream = c.getClass().getResourceAsStream("/META-INF/manifest.mf")) == null)
      return c.getAppProperty(a); 
    try {
      byte[] arrayOfByte = new byte[inputStream.available()];
      inputStream.read(arrayOfByte);
      inputStream.close();
      String[] arrayOfString = dh.a(dh.a(arrayOfByte).replace('\r', '\n'), '\n');
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b].startsWith(a)) {
          if ((arrayOfString = dh.a(arrayOfString[b], ':')).length > 2)
            for (byte b1 = 2; b1 < arrayOfString.length; b1++)
              arrayOfString[1] = arrayOfString[1] + ":" + arrayOfString[b1];  
          return arrayOfString[1].trim();
        } 
      } 
    } catch (IOException iOException) {}
    return c.getAppProperty(a);
  }
  
  public void pauseApp() {}
  
  public void destroyApp(boolean paramBoolean) throws MIDletStateChangeException {
    cd.d();
    try {
      db.a();
    } catch (Exception exception) {}
    d.setCurrent(null);
    notifyDestroyed();
  }
  
  public static Timer b() {
    return t;
  }
  
  public static void c() {
    try {
      t.cancel();
    } catch (IllegalStateException illegalStateException) {}
    t = new Timer();
  }
  
  public static void d() {
    if (ef.e()) {
      ef.a();
      return;
    } 
    dq.a(d.getCurrent());
  }
  
  public static void a(boolean paramBoolean) {
    if (paramBoolean) {
      d.setCurrent(null);
      return;
    } 
    Displayable displayable;
    if ((displayable = d.getCurrent()) == null || !displayable.isShown())
      d(); 
  }
  
  public static void a(String paramString) {
    if (c != null)
      c.b(paramString); 
  }
  
  private void b(String paramString) {}
  
  static {
    if (p != null) {
      String str;
      h = ((str = p.toLowerCase()).toLowerCase().indexOf("fly") != -1);
      i = (str.toLowerCase().indexOf("ericsson") != -1);
      j = (str.indexOf("m600") != -1 || str.indexOf("p800") != -1 || str.indexOf("p900") != -1 || str.indexOf("p910") != -1 || str.indexOf("w950") != -1 || str.indexOf("p990") != -1 || str.indexOf("g900") != -1 || str.indexOf("p1i") != -1);
      try {
        Float.parseFloat(System.getProperty("com.sonyericsson.java.platform").substring(3));
      } catch (Throwable throwable) {}
      k = (str.toLowerCase().indexOf("nokia") != -1);
    } 
    l = k;
  }
  
  class Jimm {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\jimm\Jimm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */