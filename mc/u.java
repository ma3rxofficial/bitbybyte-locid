package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

public final class u extends List implements CommandListener {
  public ch a;
  
  public u(ch paramch) {
    super("", 3);
    this.a = paramch;
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
    append(bn.eH, null);
    append(bn.eL, null);
    addCommand(new Command(bn.eM, 2, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    String str = getString(getSelectedIndex());
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (str.equals(bn.eL)) {
      if (this.a.h != null)
        try {
          this.a.h.deallocate();
        } catch (Exception exception) {} 
      this.a.q = true;
      this.a.a.a(cx.a(this.a.d, this.a.b));
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a.a);
      return;
    } 
    if (str.equals(bn.eH)) {
      cx.b(bn.eH, bn.aB, (Displayable)this);
      return;
    } 
    if (str.equals(bn.aC)) {
      bx bx = new bx(this.a, null);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bx);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\m\\u.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */