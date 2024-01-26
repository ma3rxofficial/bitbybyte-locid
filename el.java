import java.io.ByteArrayOutputStream;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import jimm.Jimm;

public final class el extends Form implements CommandListener, Runnable {
  private TextField a = dw.a(new TextField(bb.a((short)348), null, 20, 0));
  
  private TextField b = dw.a(new TextField(bb.a((short)245), null, 20, 0));
  
  private TextField c = dw.a(new TextField(bb.a((short)316), null, 20, 0));
  
  private TextField d = dw.a(new TextField(bb.a((short)219), null, 50, 1));
  
  private TextField e = dw.a(new TextField(bb.a((short)125), null, 15, 0));
  
  private TextField f = dw.a(new TextField(bb.a((short)277), null, 70, 0));
  
  private TextField g = dw.a(new TextField(bb.a((short)356), null, 600, 0));
  
  private TextField h = dw.a(new TextField(bb.a((short)146), null, 50, 0));
  
  private ChoiceGroup i = new ChoiceGroup(bb.a((short)267), 4);
  
  private TextField j = dw.a(new TextField(bb.a((short)137), null, 30, 0));
  
  private TextField k = dw.a(new TextField(bb.a((short)380), null, 30, 0));
  
  private TextField l = dw.a(new TextField(bb.a((short)155), null, 30, 0));
  
  private TextField m = dw.a(new TextField(bb.a((short)156), null, 30, 0));
  
  private TextField n = dw.a(new TextField(bb.a((short)158), null, 30, 0));
  
  private TextField o = dw.a(new TextField(bb.a((short)157), null, 30, 0));
  
  private ChoiceGroup p = new ChoiceGroup(bb.a((short)288), 2);
  
  private static ChoiceGroup q;
  
  private static ChoiceGroup r;
  
  private static ChoiceGroup s;
  
  private static ChoiceGroup t;
  
  private TextField u;
  
  private TextField v;
  
  private TextField w;
  
  private TextField x;
  
  private TextField y = new TextField(bb.a((short)199), null, 16, 65536);
  
  private TextField z = new TextField(bb.a((short)345), null, 8, 65536);
  
  private TextField A = new TextField(bb.a((short)346), null, 8, 65536);
  
  private Command B = new Command(bb.a((short)11), 2, 0);
  
  private Command C = new cc(bb.a((short)13), 4, 1, 49);
  
  private Command D = new cc(bb.a((short)142), 4, 1, 50);
  
  private Displayable E;
  
  private static String[] F;
  
  private static el G;
  
  private el(Displayable paramDisplayable) {
    super(bb.a((short)218));
    this.E = paramDisplayable;
    q = new ChoiceGroup(null, 4);
    r = new ChoiceGroup(null, 4);
    s = new ChoiceGroup(null, 4);
    t = new ChoiceGroup(null, 4);
    this.u = dw.a(new TextField(null, null, 60, 0));
    this.v = dw.a(new TextField(null, null, 60, 0));
    this.w = dw.a(new TextField(null, null, 60, 0));
    this.x = dw.a(new TextField(null, null, 60, 0));
    this.i.append("---", null);
    this.i.append(bb.a((short)239), null);
    this.i.append(bb.a((short)328), null);
    append((Item)this.a);
    append((Item)this.b);
    append((Item)this.c);
    append((Item)this.i);
    append((Item)this.d);
    append((Item)this.e);
    append((Item)this.f);
    append((Item)this.g);
    append((Item)this.h);
    append((Item)this.j);
    append((Item)this.k);
    append((Item)this.l);
    append((Item)this.m);
    append((Item)this.n);
    append((Item)this.o);
    addCommand(this.C);
    addCommand(this.B);
    setCommandListener(this);
  }
  
  private el(boolean paramBoolean, Displayable paramDisplayable) {
    super(bb.a((short)143));
    this.E = paramDisplayable;
    append((Item)this.y);
    append((Item)this.z);
    append((Item)this.A);
    addCommand(this.D);
    addCommand(this.B);
    setCommandListener(this);
  }
  
  public static void a(String[] paramArrayOfString, Displayable paramDisplayable) {
    F = paramArrayOfString;
    G = new el(paramDisplayable);
    G.i.setSelectedIndex(dh.h(paramArrayOfString[11]), true);
    G.a.setString(paramArrayOfString[1]);
    G.d.setString(paramArrayOfString[3]);
    G.e.setString(paramArrayOfString[13]);
    G.b.setString(paramArrayOfString[38]);
    G.c.setString(paramArrayOfString[39]);
    G.f.setString(paramArrayOfString[12]);
    G.g.setString(paramArrayOfString[22]);
    G.h.setString(paramArrayOfString[4]);
    G.j.setString(paramArrayOfString[9]);
    G.k.setString(paramArrayOfString[6]);
    G.l.setString(paramArrayOfString[16]);
    G.m.setString(paramArrayOfString[19]);
    G.n.setString(paramArrayOfString[20]);
    G.o.setString(paramArrayOfString[21]);
    (new Thread(G)).start();
    Jimm.d.setCurrent((Displayable)G);
    cz.a(true);
  }
  
  public final void run() {
    for (byte b = 0; b < 51; b++) {
      q.append(du.d(b), null);
      r.append(du.d(b), null);
      s.append(du.d(b), null);
      t.append(du.d(b), null);
      try {
        Thread.sleep(1L);
      } catch (InterruptedException interruptedException) {}
    } 
    q.setSelectedIndex(du.b(du.d[0]), true);
    r.setSelectedIndex(du.b(du.d[1]), true);
    s.setSelectedIndex(du.b(du.d[2]), true);
    t.setSelectedIndex(du.b(du.d[3]), true);
    G.u.setString((F[44] != null) ? F[44].substring(1) : null);
    G.v.setString((F[45] != null) ? F[45].substring(1) : null);
    G.w.setString((F[46] != null) ? F[46].substring(1) : null);
    G.x.setString((F[47] != null) ? F[47].substring(1) : null);
    append((Item)this.p);
    append((Item)q);
    append((Item)this.u);
    append((Item)r);
    append((Item)this.v);
    append((Item)s);
    append((Item)this.w);
    append((Item)t);
    append((Item)this.x);
  }
  
  public static void a(Displayable paramDisplayable) {
    el el1;
    (el1 = new el(true, paramDisplayable)).y.setString(null);
    el1.z.setString(null);
    el1.A.setString(null);
    Jimm.d.setCurrent((Displayable)el1);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.B)
      Jimm.d.setCurrent(this.E); 
    if (paramCommand == this.C) {
      F[1] = this.a.getString();
      F[3] = this.d.getString();
      F[13] = this.e.getString();
      F[38] = this.b.getString();
      F[39] = this.c.getString();
      F[12] = this.f.getString();
      F[22] = this.g.getString();
      F[4] = this.h.getString();
      F[9] = this.j.getString();
      F[6] = this.k.getString();
      F[16] = this.l.getString();
      F[19] = this.m.getString();
      F[20] = this.n.getString();
      F[21] = this.o.getString();
      F[11] = dh.e(this.i.getSelectedIndex());
      F[44] = this.u.getString();
      F[45] = this.v.getString();
      F[46] = this.w.getString();
      F[47] = this.x.getString();
      du.d[0] = du.c(q.getSelectedIndex());
      du.d[1] = du.c(r.getSelectedIndex());
      du.d[2] = du.c(s.getSelectedIndex());
      du.d[3] = du.c(t.getSelectedIndex());
      ByteArrayOutputStream byteArrayOutputStream;
      dh.a(byteArrayOutputStream = new ByteArrayOutputStream(), 3130, false);
      dh.a(320, byteArrayOutputStream, F[38], false);
      cq cq = new cq(F);
      try {
        cd.a(cq);
      } catch (cr cr2) {
        cr cr1;
        cr.a(cr1 = null);
        if (cr1.a)
          return; 
      } 
      cd.a = (this.a.getString().length() > 0) ? this.a.getString() : bb.a((short)331);
      ef.a(bb.a((short)418), cq, false);
    } 
    if (paramCommand == this.D) {
      String str1 = this.y.getString();
      String str2 = this.z.getString();
      String str3 = this.A.getString();
      int i = str2.length();
      byte[] arrayOfByte1 = dh.a(str2);
      byte[] arrayOfByte2;
      dh.b(arrayOfByte2 = new byte[i + 4 + 1], 0, 11780);
      dh.a(arrayOfByte2, 2, i, false);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 4, arrayOfByte1.length);
      dh.a(arrayOfByte2, 4 + i, 0);
      if (i != 0 && str2.equals(str3) && str1.equals(em.c(-2))) {
        dg dg = new dg(2L, 0, em.c(-1), 2000, new byte[0], arrayOfByte2);
        try {
          cd.i.a(dg);
        } catch (cr cr2) {
          cr cr1;
          cr.a(cr1 = null);
          if (cr1.a)
            return; 
        } 
        int j = em.f(200);
        em.c(em.q[em.p * j + 1], str2);
        Jimm.d.setCurrent(this.E);
        return;
      } 
      Alert alert;
      (alert = new Alert("", bb.a((short)553), null, AlertType.ERROR)).setTimeout(15000);
      Jimm.d.setCurrent(alert, Jimm.d.getCurrent());
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\el.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */