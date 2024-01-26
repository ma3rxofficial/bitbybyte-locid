package calc;

import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import favax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;

public class Stud extends MIDlet implements CommandListener {
  public static Display a;
  
  public static String b;
  
  public static String c;
  
  public static d d;
  
  public static Stud e;
  
  public static b f;
  
  public void pauseApp() {}
  
  public void startApp() throws MIDletStateChangeException {
    if (e == null)
      try {
        b = "1.5.0";
        c = "DEFAULT";
        e = this;
        f = new b();
        d = new d();
        a = Display.getDisplay(this);
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      }  
    a.setCurrent((Displayable)d);
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {}
  
  public void destroyApp(boolean paramBoolean) throws MIDletStateChangeException {
    try {
      b.a();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    notifyDestroyed();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\calc\Stud.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */