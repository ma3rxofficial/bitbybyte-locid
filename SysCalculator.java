import SysCalc.a;
import favax.microedition.lcdui.Canvas;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Displayable;

public class SysCalculator extends MIDlet {
  public Canvas a = (Canvas)new a();
  
  public void startApp() {
    Display display = Display.getDisplay(this);
    display.setCurrent((Displayable)this.a);
    this.a.repaint();
  }
  
  public void pauseApp() {}
  
  public void destroyApp(boolean paramBoolean) {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\SysCalculator.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */