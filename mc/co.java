package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

public final class co extends List implements CommandListener {
  public ca a;
  
  public co(ca paramca) {
    super("", 3);
    this.a = paramca;
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
    append(bn.eL, null);
    append(bn.eH, null);
    addCommand(new Command(bn.eM, 2, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    String str = getString(getSelectedIndex());
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (str.equals(bn.eL)) {
      this.a.a();
      this.a = null;
      cx.a();
      return;
    } 
    if (str.equals(bn.eH))
      cx.b(bn.eH, bn.av, (Displayable)this.a); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\co.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */