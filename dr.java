import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import jimm.Jimm;

public final class dr extends bd implements CommandListener, bx, Runnable, br {
  private static Command af = new Command(bb.a((short)18), 8, 2);
  
  private static Command ag = new Command(bb.a((short)386), 8, 3);
  
  private static Command ah = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 2);
  
  private static Command ai = new Command(bb.a((short)148, 1), 8, 8);
  
  private static Command aj = new Command(bb.a((short)573), 8, 5);
  
  private static Command ak = new Command(bb.a((short)586), 8, 6);
  
  private static Command al = new Command(bb.a((short)587), 8, 7);
  
  private static Command am = new cc(bb.a((short)268), 8, 4, 54);
  
  public static be ae;
  
  private static String an = new String();
  
  private static String ao = new String();
  
  private static Form ap;
  
  private static TextField aq;
  
  private static ChoiceGroup ar;
  
  private boolean as;
  
  private String at;
  
  private String au;
  
  private static be av;
  
  public final void f(int paramInt) {}
  
  public dr() {
    super(null);
    a(dw.p, bd.Z);
    a(ah, bd.aa);
    a(dw.q, bd.ab);
    a(dw.j, bd.ab);
    a(dw.m, bd.ab);
    a(dw.i, bd.ab);
    a(aj, bd.ab);
    a(ak, bd.ab);
    a(al, bd.ab);
    a(ai, bd.ab);
    a(this);
    this.p = this;
  }
  
  public final void a(bd parambd) {
    if (parambd == this) {
      bh bh;
      if ((bh = ea.b(an, this.t)) == null)
        return; 
      b(am);
      if (bh.f)
        a(am, bd.ab); 
      Object[] arrayOfObject = { bh.d, bh.c, bh.a, bh.b, (bh.e == 0) ? "in" : "out", an, ao };
      cp.a(14, arrayOfObject, (Object)null, this);
      a_((bd.v() > 133) ? (bh.d + " " + bh.c) : bh.c);
    } 
  }
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {
    int i;
    bh bh;
    switch (paramInt1) {
      case -8:
        dw.a((short)580, dw.R, this, 2);
        break;
      case 42:
        if ((i = this.t) == -1)
          return; 
        if ((bh = ea.b(an, i)) == null)
          return; 
        dw.a((bh.e == 0), bh.c, bh.d, bh.b, false);
        break;
    } 
    if (parambd == ae && paramInt2 == 1)
      switch (bd.d(paramInt1)) {
        case 2:
          t(-1);
          return;
        case 5:
          t(1);
          break;
      }  
  }
  
  public final void b(bd parambd) {
    if (parambd == this)
      B(); 
  }
  
  private void t(int paramInt) {
    a(paramInt, false, true);
    B();
  }
  
  private void c(String paramString) {
    this.at = paramString;
    try {
      bl.a(this);
      bl.a(true);
      bl.a();
      return;
    } catch (cr cr) {
      cr.a(null);
      return;
    } 
  }
  
  public final boolean a(String paramString) {
    return false;
  }
  
  public final void b(String paramString) {
    this.au = paramString;
    (new Thread(this)).start();
  }
  
  public final void a() {
    bi.i();
  }
  
  public final void run() {
    if (this.at == null) {
      a((dm[])null);
      return;
    } 
    a(new dm[] { bi.a(this.at) });
  }
  
  private void a(dm paramdm, OutputStream paramOutputStream, ByteArrayOutputStream paramByteArrayOutputStream) throws IOException {
    String str = paramdm.getStringValue(0);
    paramByteArrayOutputStream.reset();
    int i;
    if ((i = ea.a(str)) > 0) {
      String str1;
      ef.a(str1 = (paramdm.getStringValue(1).length() > 0) ? paramdm.getStringValue(1) : str);
      ef.b(0);
      StringBuffer stringBuffer = (new StringBuffer()).append("\r\n").append('\t').append(bb.a((short)589)).append(str1).append(" (").append(str).append(")\r\n").append('\t').append(bb.a((short)590)).append(dh.b(false, true)).append("\r\n\r\n");
      paramByteArrayOutputStream.write(dh.a(stringBuffer.toString(), !this.as));
      for (byte b = 0; b < i; b++) {
        bh bh;
        if ((bh = ea.a(str, b)) != null)
          paramByteArrayOutputStream.write(dh.a("\r\n" + ((bh.e == 0) ? ("------------------------------------<<<-\r\n " + str1) : ("------------------------------------>>>-\r\n " + cd.a)) + " (" + bh.c + "):\r\n", !this.as)); 
        String str2 = "";
        if (bh != null)
          str2 = bh.b.trim(); 
        StringBuffer stringBuffer1 = new StringBuffer(str2.length());
        int j = str2.length();
        for (byte b1 = 0; b1 < j; b1++)
          stringBuffer1 = stringBuffer1.append(str2.charAt(b1)); 
        stringBuffer1 = stringBuffer1.append('\r').append('\n');
        paramByteArrayOutputStream.write(dh.a(stringBuffer1.toString(), !this.as));
        paramByteArrayOutputStream.flush();
        if (paramByteArrayOutputStream.size() > 65536) {
          paramOutputStream.write(paramByteArrayOutputStream.toByteArray());
          paramByteArrayOutputStream.reset();
          paramOutputStream.flush();
        } 
        ef.b(100 * b / i);
      } 
      if (paramByteArrayOutputStream.size() > 0) {
        paramOutputStream.write(paramByteArrayOutputStream.toByteArray());
        paramByteArrayOutputStream.reset();
        paramOutputStream.flush();
      } 
    } 
  }
  
  private boolean a(dm paramdm, String paramString, ByteArrayOutputStream paramByteArrayOutputStream) {
    try {
      if (ea.a(paramdm.getStringValue(0)) > 0) {
        cb cb;
        OutputStream outputStream = (cb = d(paramString)).b();
        if (!this.as)
          outputStream.write(new byte[] { -17, -69, -65 }); 
        a(paramdm, outputStream, paramByteArrayOutputStream);
        cb.d();
      } 
      return false;
    } catch (Exception exception) {
      null.printStackTrace();
      cr.a(new cr((short)648, 191, 2, false));
      return true;
    } 
  }
  
  private void a(dm[] paramArrayOfdm) {
    this.as = em.h(14);
    ef.a(bb.a((short)591, 1));
    ef.b(0);
    Jimm.d.setCurrent((Displayable)Jimm.c.m);
    if (paramArrayOfdm == null)
      paramArrayOfdm = bi.f(); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(67000);
    for (byte b = 0; b < paramArrayOfdm.length; b++) {
      if (a(paramArrayOfdm[b], this.au + "locid_hist_" + paramArrayOfdm[b].getStringValue(0) + ".txt", byteArrayOutputStream)) {
        bi.i();
        cr.a(new cr((short)648, 191, 2, false));
        return;
      } 
    } 
    bi.i();
  }
  
  private static cb d(String paramString) {
    try {
      cb cb;
      (cb = cb.a()).b(paramString);
      return cb;
    } catch (Exception exception) {
      null.printStackTrace();
      cr.a(new cr((short)648, 191, 3, true));
      return null;
    } 
  }
  
  private void A() {
    bh bh = ea.b(an, this.t);
    Vector vector;
    if ((vector = dh.i(bh.b + "\n")) == null)
      return; 
    if (vector.size() == 1)
      try {
        Jimm.c.platformRequest(vector.elementAt(0));
        return;
      } catch (Exception exception) {
        return;
      }  
    av = dw.b(bb.a((short)268), false);
    av.a(dw.q, bd.Z);
    av.a(dw.f, bd.aa);
    av.a(this);
    for (byte b = 0; b < vector.size(); b++)
      av.a(vector.elementAt(b), bd.g(), 0, b).x(b); 
    dw.a(av);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == am)
      A(); 
    if (paramCommand == ak)
      c(an); 
    if (paramCommand == al)
      c(null); 
    if (paramCommand == dw.f) {
      if (dw.a(ae) || paramDisplayable == ap) {
        ae = null;
        dw.d();
        return;
      } 
      if (dw.a(av)) {
        av = null;
        dw.d();
        return;
      } 
    } else {
      if (paramCommand == ah) {
        ea.b();
        ae = null;
        ap = null;
        dw.i();
        bi.i();
        return;
      } 
      if (paramCommand == dw.q) {
        if (dw.a(av))
          try {
            Jimm.c.platformRequest(av.a(0, false));
            return;
          } catch (Exception exception) {
            return;
          }  
        B();
        return;
      } 
      if (paramCommand == ai) {
        dw.a((short)580, dw.R, this, 2);
        return;
      } 
      if (dw.e() == 2) {
        if (paramCommand == dw.d)
          switch (dw.l()) {
            case 0:
              ea.b(an);
              break;
            case 1:
              ea.c(an);
              break;
            case 2:
              ea.c(null);
              break;
          }  
        b(Jimm.d);
        k();
        return;
      } 
      if (paramCommand == dw.j || paramCommand == dw.m) {
        int i;
        if ((i = this.t) == -1)
          return; 
        bh bh1;
        if ((bh1 = ea.b(an, i)) == null)
          return; 
        dw.a((bh1.e == 0), bh1.c, bh1.d, bh1.b + "\n", (paramCommand == dw.m));
        return;
      } 
      if (paramCommand == af) {
        t(1);
        return;
      } 
      if (paramCommand == ag) {
        t(-1);
        return;
      } 
      if (paramCommand == dw.i) {
        if (ap == null) {
          ap = new Form(bb.a((short)244));
          aq = dw.a(new TextField(bb.a((short)570), "", 64, 0));
          ar = new ChoiceGroup(bb.a((short)366), 2);
          ar.append(bb.a((short)571), null);
          ar.append(bb.a((short)572), null);
          ar.setSelectedIndex(0, true);
          ap.addCommand(dw.d);
          ap.addCommand(dw.f);
          ap.append((Item)aq);
          ap.append((Item)ar);
          ap.setCommandListener(this);
        } 
        Jimm.d.setCurrent((Displayable)ap);
        return;
      } 
      if (paramCommand == dw.d) {
        ea.a(an, aq.getString(), ar.isSelected(1), ar.isSelected(0));
        return;
      } 
      if (paramCommand == aj) {
        RecordStore recordStore = ea.a();
        try {
          Alert alert;
          (alert = new Alert(bb.a((short)573), bb.a((short)574) + ": " + c() + "\n" + bb.a((short)576) + ": " + (recordStore.getSize() / 1024) + "\n" + bb.a((short)577) + ": " + (recordStore.getSizeAvailable() / 1024) + "\n", null, AlertType.INFO)).setTimeout(-2);
          Jimm.d.setCurrent((Displayable)alert);
          return;
        } catch (Exception exception) {
          return;
        } 
      } 
      bh bh = ea.b(an, this.t);
      Object[] arrayOfObject = { bh.d, bh.c, bh.a, bh.b, (bh.e == 0) ? "in" : "out", an, ao };
      cp.a(15, arrayOfObject, paramCommand);
    } 
  }
  
  private void B() {
    if (this.t >= c())
      return; 
    if (ae == null) {
      ae = new be(null);
      ae.e(3);
      ae.a(dw.p, bd.Z);
      ae.a(dw.f, bd.aa);
      ae.a(dw.j, bd.ab);
      ae.a(dw.m, bd.ab);
      ae.a(af, bd.ab);
      ae.a(ag, bd.ab);
      ae.a(this);
      ae.p = this;
    } 
    bh bh = ea.a(an, this.t);
    ae.z();
    ae.a(bh.c + ":", bd.g(), 1, -1);
    ae.x(-1);
    dy.a(ae, bh.b, 0, bd.g(), -1);
    ae.b(am);
    if (bh.f)
      ae.a(am, bd.ab); 
    ae.x(-1);
    ae.a_(bh.d);
    ae.b(Jimm.d);
    ae.e();
  }
  
  public static String z() {
    return an;
  }
  
  public static void a(String paramString1, String paramString2) {
    an = paramString1;
    ao = paramString2;
  }
  
  public final int c() {
    return ea.a(an);
  }
  
  public final void a(int paramInt1, ev paramev, int paramInt2) {
    bh bh;
    if ((bh = ea.b(an, paramInt1)) == null)
      return; 
    paramev.a = bh.a;
    paramev.l = (bh.e == 0) ? em.g(6) : em.g(7);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */