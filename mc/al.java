package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public final class al extends Form implements CommandListener {
  public dm a;
  
  public o b;
  
  public TextField c;
  
  public TextField d;
  
  public TextField e;
  
  public TextField f;
  
  public TextField g;
  
  public TextField h;
  
  public int i = 0;
  
  public al(dm paramdm, o paramo, int paramInt) {
    super(bn.dX);
    this.a = paramdm;
    this.b = paramo;
    this.i = paramInt;
    try {
      a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void a() throws Exception {
    if (this.b == null)
      this.b = new o(); 
    boolean bool = (this.i == 2) ? true : false;
    this.c = new TextField(bn.dY, this.b.a, 100, false | bool);
    this.d = new TextField(bn.dZ, this.b.b, 100, false | bool);
    this.e = new TextField(bn.ea, String.valueOf(this.b.c), 5, 0x5 | bool);
    this.g = new TextField(bn.eb, this.b.d, 100, false | bool);
    this.h = new TextField(bn.ec, this.b.e, 100, 0x10000 | bool);
    this.f = new TextField(bn.ed, this.b.f, 256, false | bool);
    append((Item)this.c);
    append((Item)this.d);
    append((Item)this.e);
    append((Item)this.g);
    append((Item)this.h);
    append((Item)this.f);
    setCommandListener(this);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command((this.i == 2) ? bn.dW : bn.eO, 4, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getCommandType() == 4) {
      if (this.i == 2) {
        int i = this.a.getSelectedIndex();
        this.a.b.removeElementAt(i);
      } else {
        this.b.a = this.c.getString();
        this.b.b = this.d.getString();
        this.b.c = Integer.parseInt(this.e.getString());
        this.b.f = this.f.getString();
        this.b.d = this.g.getString();
        this.b.e = this.h.getString();
        if (this.b.a.length() == 0) {
          cx.a(bn.eq, bn.ee, (Displayable)this);
          return;
        } 
        if (this.b.b.length() == 0) {
          cx.a(bn.eq, bn.ef, (Displayable)this);
          return;
        } 
        if (this.b.f.length() > 0 && !this.b.f.endsWith("/"))
          this.b.f += "/"; 
        if (this.i == 0)
          this.a.b.addElement(this.b); 
      } 
      this.a.b();
      this.a.a();
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\al.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */