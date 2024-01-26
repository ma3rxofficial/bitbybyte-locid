import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import jimm.Jimm;

public final class ff {
  public cu a;
  
  private boolean b;
  
  private Vector c = new Vector();
  
  public ff(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, String paramString6, int paramInt2) {
    String[] arrayOfString;
    (arrayOfString = new String[51])[37] = paramString1;
    arrayOfString[1] = paramString2;
    arrayOfString[2] = paramString3;
    arrayOfString[3] = paramString4;
    arrayOfString[24] = paramString5;
    arrayOfString[25] = Integer.toString(paramInt1);
    arrayOfString[11] = paramString6;
    arrayOfString[10] = Integer.toString(paramInt2);
    this.c.addElement(arrayOfString);
  }
  
  public final String[] a(int paramInt) {
    return this.c.elementAt(paramInt);
  }
  
  public final int a() {
    return this.c.size();
  }
  
  public final cu b() {
    if (this.a == null)
      this.a = new cu(this); 
    return this.a;
  }
  
  public static boolean a(ff paramff) {
    return paramff.b;
  }
  
  public static Vector b(ff paramff) {
    return paramff.c;
  }
  
  public class cu implements CommandListener, bx {
    private Command b;
    
    private Command c;
    
    private Command d;
    
    private Command e;
    
    private Command f;
    
    private Command g;
    
    private Command h;
    
    private Command i;
    
    private Command j;
    
    private Form k;
    
    private be l;
    
    private List m;
    
    private TextField n;
    
    private TextField o;
    
    private TextField p;
    
    private TextField q;
    
    private TextField r;
    
    private TextField s;
    
    private TextField t;
    
    private ChoiceGroup u;
    
    private ChoiceGroup v;
    
    private ChoiceGroup w;
    
    public int a;
    
    private final ff x;
    
    public cu(ff this$0) {
      this.x = this$0;
      this.c = new cc(bb.a((short)497), 4, 1, 49);
      this.b = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 2);
      this.d = new Command(bb.a((short)96), 8, 1);
      this.j = new Command(bb.a((short)145), 8, 2);
      this.f = new Command(bb.a((short)18), 8, 3);
      this.e = new Command(bb.a((short)386), 8, 4);
      this.g = new Command(bb.a((short)421), 8, 6);
      this.h = new Command(bb.a((short)421), 8, 6);
      this.i = new cc(bb.a((short)284), 8, 7, 51);
      this.k = new Form(bb.a((short)16));
      String str1 = null;
      str1 = dw.e(dw.a(true));
      this.n = dw.a(new TextField(bb.a((short)493), str1, 32, 2));
      String str2 = "";
      if (str1.equals("")) {
        if ((str2 = dw.a(false)) == null)
          str2 = ""; 
        if (str2.length() > 15)
          str2 = ""; 
      } 
      this.o = dw.a(new TextField(bb.a((short)348), str2, 32, 0));
      this.p = dw.a(new TextField(bb.a((short)245), "", 32, 0));
      this.q = dw.a(new TextField(bb.a((short)316), "", 32, 0));
      this.r = dw.a(new TextField(bb.a((short)219), "", 32, 1));
      this.s = dw.a(new TextField(bb.a((short)146), "", 32, 0));
      this.t = dw.a(new TextField(bb.a((short)299), "", 32, 0));
      this.u = new ChoiceGroup(bb.a((short)101), 4, dh.a("---|13-17|18-22|23-29|30-39|40-49|50-59|> 60", '|'), null);
      this.v = new ChoiceGroup(bb.a((short)267), 4);
      this.v.append(bb.a((short)240), null);
      this.v.append(bb.a((short)239), null);
      this.v.append(bb.a((short)328), null);
      this.w = new ChoiceGroup("", 2);
      this.w.append(bb.a((short)365), null);
      this.k.append((Item)this.w);
      this.k.append((Item)this.n);
      this.k.append((Item)this.o);
      this.k.append((Item)this.p);
      this.k.append((Item)this.q);
      this.k.append((Item)this.s);
      this.k.append((Item)this.v);
      this.k.append((Item)this.r);
      this.k.append((Item)this.t);
      this.k.append((Item)this.u);
      this.k.setCommandListener(this);
      this.l = new be(null);
      this.l.p = this;
      if (ff.a(this$0)) {
        this.l.a(this.d, bd.Z);
      } else {
        this.l.a(dw.p, bd.Z);
        this.l.a(this.e, bd.ab);
        this.l.a(this.f, bd.ab);
        this.l.a(this.d, bd.ab);
        this.l.a(this.j, bd.ab);
        this.l.a(this.g, bd.ab);
        this.l.a(this.i, bd.ab);
      } 
      this.l.e(3);
    }
    
    public final void a(int param1Int) {
      Alert alert;
      switch (param1Int) {
        case 1:
          b(this.a);
          this.l.b(Jimm.d);
          return;
        case 2:
          this.k.addCommand(this.c);
          this.k.addCommand(this.b);
          this.k.addCommand(this.h);
          Jimm.d.setCurrent((Displayable)this.k);
          return;
        case 3:
          this.k.addCommand(this.c);
          this.k.addCommand(this.b);
          this.k.addCommand(this.h);
          (alert = new Alert(null, bb.a((short)352), null, null)).setTimeout(-2);
          Jimm.d.setCurrent(alert, (Displayable)this.k);
          break;
      } 
    }
    
    private void b(int param1Int) {
      this.l.z();
      if (this.x.a() > 0) {
        if (this.x.a() == 1) {
          this.l.b(this.f);
          this.l.b(this.e);
        } 
        this.l.q();
        dw.a(this.x.a(param1Int), this.l, false);
        this.l.a_(bb.a((short)417) + " " + Integer.toString(param1Int + 1) + "/" + Integer.toString(this.x.a()));
        this.l.s();
      } else {
        this.l.q();
        this.l.a_(bb.a((short)417) + " 0/0");
        this.l.a(bb.a((short)352) + ": ", 0, 1, -1);
        this.l.s();
      } 
      this.l.a(this.b, bd.aa);
      this.l.a(this);
    }
    
    private void a(boolean param1Boolean) {
      if (param1Boolean) {
        this.a = (this.a + 1) % this.x.a();
      } else if (this.a == 0) {
        this.a = this.x.a() - 1;
      } else {
        this.a = (this.a - 1) % this.x.a();
      } 
      a(1);
    }
    
    public final void a(bd param1bd, int param1Int1, int param1Int2) {
      if (param1Int2 == 1)
        switch (bd.d(param1Int1)) {
          case 2:
            a(false);
            return;
          case 5:
            a(true);
            break;
        }  
    }
    
    public final void f(int param1Int) {}
    
    public final void a(bd param1bd) {}
    
    public final void b(bd param1bd) {}
    
    public final void commandAction(Command param1Command, Displayable param1Displayable) {
      if (param1Command == this.b) {
        if (dw.a(this.l) && !ff.a(this.x)) {
          a(2);
          cz.a(true);
          return;
        } 
        if (param1Displayable == this.k) {
          this.k = null;
          cy.f();
          return;
        } 
        if (param1Displayable != this.m)
          this.k = null; 
        dw.d();
        return;
      } 
      if (param1Command == this.c) {
        this.a = 0;
        String[] arrayOfString;
        (arrayOfString = new String[10])[0] = this.n.getString();
        arrayOfString[1] = this.o.getString();
        arrayOfString[2] = this.p.getString();
        arrayOfString[3] = this.q.getString();
        arrayOfString[4] = this.r.getString();
        arrayOfString[5] = this.s.getString();
        arrayOfString[6] = this.t.getString();
        arrayOfString[7] = Integer.toString(this.v.getSelectedIndex());
        arrayOfString[8] = this.w.isSelected(0) ? "1" : "0";
        arrayOfString[9] = Integer.toString(this.u.getSelectedIndex());
        bz bz = new bz(this.x, arrayOfString);
        try {
          cd.a(bz);
        } catch (cr cr2) {
          cr cr1;
          cr.a(cr1 = null);
          if (cr1.a)
            return; 
        } 
        ff.b(this.x).removeAllElements();
        ef.a(bb.a((short)543), bz, true);
        return;
      } 
      if (param1Command == this.f) {
        a(true);
        return;
      } 
      if (param1Command == this.e) {
        a(false);
        return;
      } 
      bu[] arrayOfBu = bi.h();
      if (param1Command == this.d && dw.a(this.l)) {
        if (arrayOfBu.length == 0) {
          this.k = null;
          Alert alert;
          (alert = new Alert(bb.a((short)545), cr.a((short)638, 161, 0), null, AlertType.WARNING)).setTimeout(-2);
          bi.a(alert);
          return;
        } 
        this.m = new List(bb.a((short)548), 1);
        for (byte b = 0; b < arrayOfBu.length; b++)
          this.m.append(arrayOfBu[b].h(), null); 
        this.m.addCommand(this.b);
        this.m.addCommand(this.d);
        this.m.setCommandListener(this);
        dw.a(this.l);
        Jimm.d.setCurrent((Displayable)this.m);
        return;
      } 
      if (param1Command == this.d && param1Displayable == this.m) {
        this.k = null;
        String[] arrayOfString = this.x.a(this.a);
        dm dm;
        (dm = new dm(-1, (arrayOfBu[this.m.getSelectedIndex()]).a, arrayOfString[37], arrayOfString[1], false, false)).a(2, arrayOfString[24].equals("1"));
        dm.a(8, true);
        dm.a(192, -1);
        cd.a(dm);
        return;
      } 
      if (param1Command == this.g) {
        String[] arrayOfString;
        dm dm;
        (dm = bi.b((arrayOfString = this.x.a(this.a))[37])).a(1, arrayOfString[1]);
        dw.a(this.l);
        dw.a(dm, (String)null, true);
        return;
      } 
      if (param1Command == this.h) {
        String str = this.n.getString();
        try {
          Integer.parseInt(str);
          dm dm;
          if ((dm = bi.a(str)) == null)
            dm = bi.b(str); 
          dw.a(this.k);
          dw.a(dm, (String)null, true);
          return;
        } catch (Exception exception) {
          return;
        } 
      } 
      if (param1Command == this.i) {
        String[] arrayOfString;
        dw.a((arrayOfString = this.x.a(this.a))[37], arrayOfString[1], false);
        dw.a(this.l);
        return;
      } 
      if (param1Command == this.j) {
        Object object = null;
        dw.c(this.x.a(this.a)[37], false);
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ff.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */