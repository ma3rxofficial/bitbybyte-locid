package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

public final class by extends Thread {
  private final bu a;
  
  public by(bu parambu) {
    this.a = parambu;
  }
  
  public final void run() {
    Form form;
    bu bu1 = this.a.b;
    if (this.a.p)
      form = this.a.n; 
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)form);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\by.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */