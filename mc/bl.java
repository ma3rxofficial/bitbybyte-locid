package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

public final class bl extends Form implements CommandListener {
  public Displayable a;
  
  public bl(String paramString1, String paramString2, Displayable paramDisplayable) {
    super(paramString1);
    this.a = paramDisplayable;
    try {
      setCommandListener(this);
      addCommand(new Command(bn.eO, 2, 1));
      append(paramString2);
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2)
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent(this.a); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bl.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */