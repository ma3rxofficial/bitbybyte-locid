package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;

public final class ax extends Form implements CommandListener {
  public aw a;
  
  public Vector b;
  
  public ChoiceGroup c;
  
  public int d = 0;
  
  public ChoiceGroup e;
  
  public ChoiceGroup f;
  
  public ChoiceGroup g;
  
  public ax(aw paramaw) {
    super(bn.da);
    this.a = paramaw;
    try {
      b();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void b() throws Exception {
    setCommandListener(this);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
    this.b = this.a.e[this.a.f].f();
    if (this.b.size() == 1) {
      cb cb;
      if ((cb = this.b.elementAt(0)).d.length() != 0 && cb.d.compareTo("..") != 0 && cb.a != 0) {
        this.d = 0;
        try {
          m m;
          (m = new m()).a(cb.d, 1);
          long l1 = m.a();
          long l2 = m.r();
          append(bn.V + "\n");
          append(cx.c(cb.d) + "\n");
          append(bn.af + "\n");
          append(cx.a(l2) + "\n");
          append(bn.W + cx.a(l1, true) + "\n");
          this.c = new ChoiceGroup(null, 2);
          this.c.append(bn.X, null);
          this.c.append(bn.Y, null);
          this.c.append(bn.Z, null);
          if (m.k())
            this.c.setSelectedIndex(0, true); 
          if (m.l())
            this.c.setSelectedIndex(1, true); 
          if (m.m())
            this.c.setSelectedIndex(2, true); 
          append((Item)this.c);
          setCommandListener(this);
          m.d();
        } catch (Exception exception) {
          cx.a(bn.eq, exception.getMessage(), (Displayable)this.a);
        } 
      } else if (cb.a == 0 && cb.d.length() != 0 && cb.d.compareTo("..") != 0) {
        this.d = 1;
        try {
          m m;
          (m = new m()).a(cb.d, 1);
          long l = m.d(true);
          append(cb.d + "\n");
          append(bn.W + cx.a(l, true) + "\n");
          append(bn.af + "\n" + cx.a(m.r()) + "\n");
          m.d();
          this.c = new ChoiceGroup(bn.db, 1);
          this.c.append(bn.dc, null);
          this.c.append(bn.dd, null);
          this.c.append(bn.de, null);
          append((Item)this.c);
          c();
          this.c.setSelectedIndex(0, true);
        } catch (Exception exception) {
          cx.a(bn.eq, exception.getMessage(), (Displayable)this);
          return;
        } 
      } else {
        return;
      } 
    } else {
      this.d = 2;
      append(this.b.size() + bn.df);
      this.c = new ChoiceGroup(bn.db, 1);
      this.c.append(bn.dg, null);
      this.c.append(bn.dd, null);
      this.c.append(bn.de, null);
      append((Item)this.c);
      c();
      this.c.setSelectedIndex(2, true);
    } 
  }
  
  private void c() {
    this.e = new ChoiceGroup(bn.X, 1);
    this.e.append(bn.dh, null);
    this.e.append(bn.di, null);
    this.e.append(bn.dj, null);
    append((Item)this.e);
    this.f = new ChoiceGroup(bn.Y, 1);
    this.f.append(bn.dh, null);
    this.f.append(bn.di, null);
    this.f.append(bn.dj, null);
    append((Item)this.f);
    this.g = new ChoiceGroup(bn.Z, 1);
    this.g.append(bn.dh, null);
    this.g.append(bn.di, null);
    this.g.append(bn.dj, null);
    append((Item)this.g);
    this.e.setSelectedIndex(0, true);
    this.f.setSelectedIndex(0, true);
    this.g.setSelectedIndex(0, true);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    paramCommand.getCommandType();
    if (paramCommand.getCommandType() == 4) {
      ar ar;
      (ar = new ar(this)).start();
    } 
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
  }
  
  public final void a() {
    if (this.d == 0) {
      try {
        boolean bool1 = this.c.isSelected(0);
        boolean bool2 = this.c.isSelected(1);
        boolean bool3 = this.c.isSelected(2);
        cb cb = this.b.elementAt(0);
        m m;
        (m = new m()).a(cb.d);
        m.b(bool1);
        m.c(bool2);
        m.a(bool3);
        m.d();
      } catch (Exception exception) {
        cx.a(bn.eq, exception.getMessage(), (Displayable)this.a);
      } 
    } else {
      int m = this.c.getSelectedIndex();
      int i = this.e.getSelectedIndex();
      int j = this.f.getSelectedIndex();
      int k = this.g.getSelectedIndex();
      if (i != 0 || j != 0 || k != 0)
        if (this.d == 1 && m == 0) {
          try {
            cb cb = this.b.elementAt(0);
            m m1;
            (m1 = new m()).a(cb.d);
            if (i != 0)
              m1.b(!(i == 1)); 
            if (j != 0)
              m1.c(!(j == 1)); 
            if (k != 0)
              m1.a(!(k == 1)); 
            m1.d();
          } catch (Exception exception) {
            cx.a(bn.eq, exception.getMessage(), (Displayable)this.a);
          } 
        } else {
          this.b.removeAllElements();
          Vector vector = this.a.b(!(m == 1));
          this.a.y = true;
          this.a.x[0] = false;
          this.a.z = 13;
          for (byte b = 0; b < vector.size() && !this.a.x[0]; b++) {
            String str = vector.elementAt(b);
            boolean bool = true;
            if (str.endsWith("/"))
              bool = false; 
            if ((bool == true && m == 1) || m == 2 || (!bool && m == 0)) {
              aw.r.a(bn.da, aw.j.a(str, aw.r.c), 4);
              this.a.repaint();
              try {
                m m1;
                (m1 = new m()).a(str);
                if (i != 0)
                  m1.b(!(i == 1)); 
                if (j != 0)
                  m1.c(!(j == 1)); 
                if (k != 0)
                  m1.a(!(k == 1)); 
                m1.d();
              } catch (Exception exception) {
                cx.a(bn.eq, exception.getMessage(), (Displayable)this.a);
              } 
            } 
          } 
          this.a.y = false;
          this.a.z = 0;
        }  
    } 
    aw.a(this.a.e[this.a.f]);
    this.a.e[this.a.f].e();
    if (this.a.f == this.a.g) {
      aw.a(this.a.e[this.a.g]);
      this.a.e[this.a.g].e();
    } 
    this.a.e(-1);
    this.a.repaint();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ax.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */