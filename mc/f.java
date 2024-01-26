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

public final class f extends Form implements CommandListener {
  public TextField a = new TextField(bn.bA, null, 8, 65536);
  
  public aw b;
  
  public int c = 0;
  
  public f(aw paramaw) {
    super("MiniCommander");
    this.b = paramaw;
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
    append((Item)this.a);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      MiniCommander.a();
      return;
    } 
    if (paramCommand.getCommandType() == 4) {
      String str;
      if ((str = this.a.getString()).equals(x.I)) {
        this.b.repaint();
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.b);
        return;
      } 
      this.c++;
      if (this.c == 3) {
        MiniCommander.a();
        return;
      } 
      cx.a("MiniCommander", bn.dA, (Displayable)this);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\f.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */