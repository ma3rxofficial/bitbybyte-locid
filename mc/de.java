package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;

public final class de extends Thread {
  private final v a;
  
  public de(v paramv) {
    this.a = paramv;
  }
  
  public final void run() {
    try {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent(this.a.l);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\de.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */