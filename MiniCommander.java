import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import mc.aw;
import mc.bn;
import mc.cx;

public class MiniCommander extends MIDlet implements CommandListener {
  public static MiniCommander a;
  
  public static aw b = null;
  
  private static bn e = new bn();
  
  public static byte c = -1;
  
  public Displayable d = null;
  
  public MiniCommander() {
    a = this;
    bn.a(0);
    if (cx.f("javax.microedition.io.file.FileConnection")) {
      c = 1;
      return;
    } 
    if (cx.f("com.motorola.io.FileConnection")) {
      c = 0;
      return;
    } 
    if (cx.f("com.siemens.mp.io.file.FileConnection")) {
      c = 2;
      return;
    } 
    if (cx.f("com.motorola.io.file.FileConnection"))
      c = 3; 
  }
  
  public void startApp() {
    if (c == -1) {
      Alert alert;
      (alert = new Alert("Error (Ошибка)", "The file system of your phone is not compatible with MiniCommander.\n(Файловая система Вашего телефона не совместима с MiniCommander.)", null, AlertType.ERROR)).setTimeout(-2);
      Display.getDisplay(this).setCurrent((Displayable)alert);
      alert.setCommandListener(this);
      return;
    } 
    if (this.d == null) {
      b = new aw(e);
      Display.getDisplay(this).setCurrent((Displayable)b);
      return;
    } 
    Display.getDisplay(this).setCurrent(this.d);
  }
  
  public void pauseApp() {
    this.d = Display.getDisplay(this).getCurrent();
  }
  
  public void destroyApp(boolean paramBoolean) {}
  
  public static void a() {
    a.destroyApp(true);
    a.notifyDestroyed();
    a = null;
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    a();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\MiniCommander.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */