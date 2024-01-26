package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

public final class n extends Form implements CommandListener {
  public aw a;
  
  public n(aw paramaw) {
    super(bn.cj);
    this.a = paramaw;
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
    append(bn.ck);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getCommandType() == 4) {
      m m = new m();
      try {
        m.a("/a/mobile/audio/MyToneDB.db");
        m.o();
        m.d();
        m.a("/a/mobile/audio/TempToneDB.db");
        m.o();
        m.d();
      } catch (Exception exception) {
        try {
          m.d();
        } catch (Exception exception1) {}
      } 
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\n.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */