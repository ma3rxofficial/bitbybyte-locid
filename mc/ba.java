package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

public final class ba extends List implements CommandListener {
  public cq a;
  
  public ba(cq paramcq) {
    super("", 3);
    this.a = paramcq;
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
    setCommandListener(this);
    if (this.a.h != null && this.a.h.getState() == 400)
      append(bn.aC, null); 
    append(bn.eL, null);
    append(bn.eH, null);
    append(bn.az, null);
    addCommand(new Command(bn.eM, 2, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    String str = getString(getSelectedIndex());
    if (paramCommand.getCommandType() == 2) {
      this.a.A.c = true;
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (str.equals(bn.eL)) {
      this.a.b.a(cx.a(this.a.f, this.a.d));
      this.a.a();
      this.a.b.w = null;
      cx.a();
      return;
    } 
    if (str.equals(bn.eH)) {
      cx.b(bn.eH, bn.aw, (Displayable)this);
      return;
    } 
    if (str.equals(bn.az)) {
      this.a.A.c = false;
      cx.a();
      return;
    } 
    if (str.equals(bn.aC)) {
      bx bx = new bx(null, this.a);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bx);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ba.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */