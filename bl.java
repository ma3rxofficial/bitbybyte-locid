import i.I;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import jimm.Jimm;

public final class bl implements CommandListener, bo, bx, Runnable {
  public static final Command a = new Command(bb.a((short)12), 2, 0);
  
  public static final Command b = new Command(bb.a((short)9), 4, 1);
  
  public static final Command c = new Command(bb.a((short)15), 4, 1);
  
  public static final Command d = new cc(bb.a((short)813), 8, 2, null, 48);
  
  private static boolean f;
  
  private static bl g;
  
  private static co h;
  
  private static br i;
  
  private static df j = df.a("/fs.png", true);
  
  private static String[] k;
  
  private static String l = "/";
  
  private int m = 0;
  
  private String n;
  
  public be e;
  
  public static cb a(Object paramObject, int paramInt) {
    try {
      if (paramObject instanceof String) {
        cb cb;
        (cb = cb.a()).a((String)paramObject, paramInt);
        return cb;
      } 
    } catch (Exception exception) {}
    return null;
  }
  
  public static Object a(Object paramObject) {
    try {
      if (paramObject instanceof cb)
        ((cb)paramObject).d(); 
    } catch (Exception exception) {}
    return null;
  }
  
  public static InputStream b(Object paramObject) {
    try {
      if (paramObject instanceof cb)
        return ((cb)paramObject).c(); 
      if (paramObject instanceof String)
        return a(paramObject, 1).c(); 
    } catch (Exception exception) {
      null.printStackTrace();
    } 
    return null;
  }
  
  public static OutputStream c(Object paramObject) {
    try {
      if (paramObject instanceof cb)
        return ((cb)paramObject).b(); 
      if (paramObject instanceof String)
        return a(paramObject, 3).b(); 
    } catch (Exception exception) {
      null.printStackTrace();
    } 
    return null;
  }
  
  public static byte[] d(Object paramObject) {
    try {
      InputStream inputStream = null;
      if (paramObject instanceof String)
        inputStream = b(paramObject); 
      if (paramObject instanceof InputStream)
        inputStream = (InputStream)paramObject; 
      byte[] arrayOfByte = new byte[inputStream.available()];
      inputStream.read(arrayOfByte);
      inputStream.close();
      return arrayOfByte;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public bl() {
    g = this;
    h = new co(null, false);
    h.af = this;
    h.p = this;
    h.a(j);
    h.c((j.b < 16) ? 8 : 0);
    h.t(-h.p() / 2);
    h.a(j.a(0));
    h.u = true;
    h.c(false);
    h.a(a, bd.aa);
    h.a(this);
  }
  
  private static void b() {
    h.q();
    k = new String[0];
    h.A();
    h.s();
  }
  
  private static int a(String paramString) {
    return paramString.equals("../") ? 0 : (paramString.endsWith("/") ? 10 : 20);
  }
  
  public final int a(cx paramcx1, cx paramcx2) {
    String str1 = (String)paramcx1.a;
    String str2 = (String)paramcx2.a;
    int i = a(str1);
    int j = a(str2);
    return (i == j) ? str1.toLowerCase().compareTo(str2.toLowerCase()) : ((i < j) ? -1 : 1);
  }
  
  private static void c() {
    h.q();
    h.A();
    for (byte b = 0; b < k.length; b++)
      h.a((cx)null, k[b]); 
    h.c((cx)null);
    h.s();
    b((String)(h.z()).a);
  }
  
  public static void a(boolean paramBoolean) {
    f = paramBoolean;
  }
  
  public static void a(br parambr) {
    i = parambr;
  }
  
  private static void a(cx paramcx) {
    String str;
    if ((str = (String)paramcx.a).equals("../")) {
      int i;
      l = ((i = l.lastIndexOf('/', l.length() - 2)) != -1) ? l.substring(0, i + 1) : "/";
      b();
      g.m = 1;
      (new Thread(g)).start();
      return;
    } 
    if (str.endsWith("/")) {
      l += str;
      b();
      g.m = 2;
      (new Thread(g)).start();
      return;
    } 
    i.a(l + str);
  }
  
  private static void b(String paramString) {
    h.b(c);
    h.b(b);
    h.b(dw.p);
    if (paramString.equals("../")) {
      int j = l.lastIndexOf('/', l.length() - 2);
      h.a(c, bd.Z);
      h.a_((j != -1) ? l.substring(0, j + 1) : "/");
      return;
    } 
    if ((paramString.endsWith("/") & l.equals("/")) != 0) {
      try {
        h.a_(paramString);
        if (i instanceof ed && ((ed)i).b == 3) {
          g.m = 6;
          g.n = paramString;
          (new Thread(g)).start();
        } 
      } catch (Exception exception) {}
      h.a(c, bd.Z);
      return;
    } 
    if ((paramString.endsWith("/") & (!l.equals("/") ? 1 : 0)) != 0) {
      if (f) {
        h.a(dw.p, bd.Z);
        h.a(b, bd.ab);
        h.a(c, bd.ab);
      } else {
        h.a(c, bd.Z);
      } 
      h.a_(l + paramString);
      return;
    } 
    h.a(dw.p, bd.Z);
    h.a(d, bd.ab);
    h.a(c, bd.ab);
    int i = paramString.lastIndexOf('.');
    StringBuffer stringBuffer = new StringBuffer();
    if (i != -1)
      stringBuffer = stringBuffer.append(paramString.substring(i + 1).toUpperCase()).append(" file"); 
    h.a_(stringBuffer.toString());
  }
  
  public final void a(cx paramcx, ev paramev, int paramInt) {
    String str = (String)paramcx.a;
    paramev.a = str;
    if (str.endsWith("/")) {
      paramev.b = j.a(0);
    } else if (j.a() <= 2) {
      paramev.b = j.a(0);
    } else {
      int i;
      switch (i = c(str)) {
        case 2:
        case 3:
        case 5:
        case 6:
        case 7:
          paramev.b = j.a(i);
          break;
        case 4:
          if (str.startsWith("Jimm")) {
            paramev.b = bi.e.a(7);
            break;
          } 
          if (str.startsWith("jimm")) {
            paramev.b = bi.e.a(7);
            break;
          } 
          if (str.startsWith("JIMM")) {
            paramev.b = bi.e.a(7);
            break;
          } 
          if (str.startsWith("LocID")) {
            paramev.b = bi.e.a(30);
            break;
          } 
          if (str.startsWith("Locid")) {
            paramev.b = bi.e.a(30);
            break;
          } 
          if (str.startsWith("locid")) {
            paramev.b = bi.e.a(30);
            break;
          } 
          if (str.startsWith("LOCID")) {
            paramev.b = bi.e.a(30);
            break;
          } 
          if (str.startsWith("dichat")) {
            paramev.b = bi.e.a(29);
            break;
          } 
          if (str.substring(1).startsWith("[i]chat")) {
            paramev.b = bi.e.a(29);
            break;
          } 
          if (str.startsWith("Bayan")) {
            paramev.b = bi.e.a(31);
            break;
          } 
          if (str.startsWith("bayan")) {
            paramev.b = bi.e.a(31);
            break;
          } 
          paramev.b = j.a(4);
          break;
      } 
      if (paramev.b == null)
        if (i == 7) {
          paramev.b = bi.d.a(16);
        } else {
          paramev.b = j.a(1);
        }  
    } 
    paramev.l = bd.g();
    paramev.k = em.f(240);
  }
  
  private static int c(String paramString) {
    String str = "data";
    byte b = 0;
    if (paramString.lastIndexOf('.') != -1)
      str = paramString.substring(paramString.lastIndexOf('.')); 
    if (".png.jpeg.jpg.gif.bmp.wbmp.JPG.JPEG.PNG.Jpeg.Jpg.Png.GIF.Gif".indexOf(str) >= 0) {
      b = 2;
    } else if (".3GP.3gp.mov.MOV.MVI.mvi.avi.AVI.swf.SWF.MP4.mp4.Mp4.MPEG.mpeg.MPG.mpg.3G2.3g2.3GP2.3gp2.".indexOf(str) >= 0) {
      b = 3;
    } else if (".jar.JAR.Jar.SIS.sis.Sis.exe.EXE.cab.CAB.jad.".indexOf(str) >= 0) {
      b = 4;
    } else if (".txt.TXT.TEXT.text.Text.Txt.sms.SMS.doc.DOC.RTF.Rtf.fr1.FR1.fr2.FR2.fb2.FB2.HTM.htm.Htm.html.HTML.lth.LTH".indexOf(str) >= 0) {
      b = 5;
    } else if (".mp3.mid.arm.wav.MP3.MID.ARM.WAV.iyu.IYU.arm.m4a.ac3.AC3.".indexOf(str) >= 0) {
      b = 7;
    } else if (".zip.ZIP.rar.RAR.Zip.thm".indexOf(str) >= 0) {
      b = 6;
    } 
    return b;
  }
  
  public final void a(bd parambd) {
    if (parambd == h)
      b((String)(h.z()).a); 
  }
  
  public final void b(bd parambd) {}
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {
    if (paramInt2 == 1 && paramInt1 == 48)
      commandAction(d, null); 
  }
  
  public static void a() throws cr {
    if (g == null);
    b();
    g.m = 0;
    (new Thread(g)).start();
  }
  
  public final void run() {
    if (this.m == 6)
      try {
        h.a_(bb.a((short)488) + ": " + (cb.a(this.n) >> 10L) + "Kb");
        bd.a_();
        return;
      } catch (Exception exception) {
        return;
      }  
    if (this.m == 4 && this.e != null) {
      dw.i();
      cb cb = cb.a();
      try {
        cb.b(l + this.n);
        int i = (int)cb.e();
        dw.a("" + i, bb.a((short)437), this.e);
        int j = c(this.n);
        long l;
        if ((l = cb.f()) != 0L) {
          Calendar calendar;
          (calendar = Calendar.getInstance()).setTime(new Date(l));
          long l1 = 0L;
          long l2 = em.f(223) * 3600L + dh.a(calendar);
          Object object = null;
          dw.a(dh.a(false, true, l2), bb.a((short)814), this.e);
        } 
        bd.a_();
        if (j == 2)
          try {
            if (i > 500000)
              throw new Exception(); 
            Image image;
            if ((image = Image.createImage(cb.c())) != null) {
              dw.a("" + image.getWidth() + "x" + image.getHeight() + (image.isMutable() ? " m" : ""), bb.a((short)815), this.e);
              I i1 = null;
              i1 = dm.a(new I(image), bd.v() - 10, bd.w() / 2);
              dw.i();
              this.e.a(i1, "image", -1);
              bd.a_();
            } 
          } catch (Throwable throwable) {
            byte b = 0;
            String str1 = "" + (i / 1024) + "Kb";
            String str2 = "data";
            if (this.n.lastIndexOf('.') != -1)
              str2 = this.n.substring(this.n.lastIndexOf('.')); 
            if (".jpeg.jpg.JPG.JPEG.Jpeg.Jpg".indexOf(str2) >= 0) {
              cb.d();
              (cb = cb.a()).b(l + this.n);
              InputStream inputStream = cb.c();
              byte[] arrayOfByte = new byte[40000];
              int k = inputStream.read(arrayOfByte);
              for (byte b1 = 1; b1 < k - 1; b1++) {
                if (-1 == arrayOfByte[b1] && -40 == arrayOfByte[b1 + 1]) {
                  b = b1;
                  break;
                } 
              } 
              if (b > 0)
                try {
                  Image image;
                  if ((image = Image.createImage(arrayOfByte, b, arrayOfByte.length - b)) != null) {
                    I i1 = null;
                    i1 = dm.a(new I(image), bd.v() - 10, bd.w() / 2);
                    this.e.a(i1, "image", -1);
                  } 
                } catch (Throwable throwable1) {
                  b = 0;
                }  
            } 
            if (b == 0)
              dw.a(str1, bb.a((short)816), this.e); 
            dw.i();
            bd.a_();
          }  
        if (j == 5)
          try {
            byte[] arrayOfByte = new byte[1024];
            int k;
            if ((k = cb.c().read(arrayOfByte)) > 0) {
              dw.a(dh.d(arrayOfByte, 0, k), "----\n", this.e);
              bd.a_();
            } 
          } catch (Exception exception) {} 
        cb.d();
        return;
      } catch (Exception exception) {
        cb.d();
        exception.printStackTrace();
        return;
      } 
    } 
    if (this.m == 3) {
      boolean bool = i.a(l + this.n);
      this.n = null;
      if (bool)
        return; 
    } 
    try {
      int i = g.m;
      k = cb.a(l, f);
      c();
      if (i == 0)
        h.b(Jimm.d); 
      return;
    } catch (cr cr) {
      cr.a(null);
      return;
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (dw.a(h)) {
      if (paramCommand == c) {
        a(h.z());
        return;
      } 
      if (paramCommand == d) {
        String str = (String)(h.z()).a;
        dw.a(h);
        this.e = dw.b(bb.a((short)812), true);
        dw.a(str, bb.a((short)241), this.e);
        dw.a(this.e);
        this.n = str;
        this.m = 4;
        (new Thread(this)).start();
        return;
      } 
      if (paramCommand == b) {
        String str;
        if ((str = (String)(h.z()).a).endsWith("/")) {
          i.b(l + str);
          return;
        } 
        this.n = str;
        this.m = 3;
        (new Thread(this)).start();
        return;
      } 
      if (paramCommand == a)
        i.a(); 
    } 
  }
  
  public final void f(int paramInt) {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */