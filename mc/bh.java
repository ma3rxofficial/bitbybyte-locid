package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public final class bh extends Form implements CommandListener {
  public aw a;
  
  public TextField b;
  
  public ChoiceGroup c = new ChoiceGroup(bn.cZ, 1);
  
  public boolean d;
  
  public bh(aw paramaw) {
    super(bn.en);
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
    this.b = new TextField(bn.ed, (this.a.e[this.a.g]).w, 200, 131072);
    append((Item)this.b);
    this.c.append(bn.cW, null);
    this.c.append(bn.bw, null);
    this.c.setSelectedIndex(0, true);
    append((Item)this.c);
    setCommandListener(this);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getCommandType() == 4)
      try {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
        this.d = this.c.isSelected(0);
        cl cl;
        (cl = new cl(this)).start();
        return;
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString(), (Displayable)this);
      }  
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bh.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */