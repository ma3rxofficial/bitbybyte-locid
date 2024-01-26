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

public final class bj extends Form implements CommandListener {
  public TextField a;
  
  public TextField b = new TextField(bn.cU + " (0-9):", "9", 1, 2);
  
  public ChoiceGroup c = new ChoiceGroup(bn.cZ, 1);
  
  public aw d;
  
  public String e;
  
  public int f;
  
  public boolean g;
  
  public int h;
  
  public bj(aw paramaw, String paramString, int paramInt) {
    super(bn.cV);
    this.h = paramInt;
    this.d = paramaw;
    this.e = paramString;
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
    this.c.append(bn.cW, null);
    this.c.append(bn.cX, null);
    this.c.setSelectedIndex(0, true);
    this.a = new TextField(bn.cY, "", 255, 0x0 | ((this.h == 0) ? 0 : 131072));
    this.b.setString(String.valueOf(x.C));
    append((Item)this.a);
    if (this.h != 2)
      append((Item)this.b); 
    append((Item)this.c);
    this.a.setString(this.e);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.d);
      return;
    } 
    if (paramCommand.getCommandType() == 4)
      try {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.d);
        this.f = Integer.parseInt(this.b.getString());
        x.C = this.f;
        this.g = this.c.isSelected(0);
        this.e = this.a.getString();
        dj dj;
        (dj = new dj(this)).start();
        return;
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString(), (Displayable)this);
      }  
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bj.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */