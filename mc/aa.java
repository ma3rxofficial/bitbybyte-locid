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

public final class aa extends Form implements CommandListener {
  public aw a;
  
  public TextField b;
  
  public aa(aw paramaw) {
    super(bn.bK);
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
    if ((this.a.e[this.a.z]).s.length() == 0)
      cx.a(bn.eq, bn.bV, (Displayable)this.a); 
    this.b = new TextField(bn.bW, "", 255, 0);
    append((Item)this.b);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
    setCommandListener(this);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.eO)) {
      String str = this.b.getString().trim();
      try {
        if (str.length() == 0)
          throw new Exception(bn.bX); 
        try {
          str = (this.a.e[this.a.f]).s + str;
          bg bg = new bg(this.a, str, 1);
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bg);
        } catch (Exception exception) {
          cx.a(bn.eq, exception.getMessage(), (Displayable)this);
          return;
        } 
      } catch (Exception exception) {
        cx.a(bn.eq, exception.getMessage(), Display.getDisplay((MIDlet)MiniCommander.a).getCurrent());
      } 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\aa.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */