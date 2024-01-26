package favax.microedition.lcdui;

import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.midlet.MIDlet;

public class Display {
  public static javax.microedition.lcdui.Display a;
  
  public static javax.microedition.lcdui.Display getDisplay(MIDlet paramMIDlet) {
    System.out.println("My Display");
    return a = javax.microedition.lcdui.Display.getDisplay(paramMIDlet);
  }
  
  public static Display getDisplay(MIDlet paramMIDlet) {
    Display display = new Display();
    getDisplay(MIDlet.a);
    return display;
  }
  
  public int getColor(int paramInt) {
    return a.getColor(paramInt);
  }
  
  public int getBorderStyle(boolean paramBoolean) {
    return a.getBorderStyle(paramBoolean);
  }
  
  public boolean isColor() {
    return a.isColor();
  }
  
  public int numColors() {
    return a.numColors();
  }
  
  public int numAlphaLevels() {
    return a.numAlphaLevels();
  }
  
  public Displayable getCurrent() {
    return a.getCurrent();
  }
  
  public void setCurrent(Displayable paramDisplayable) {
    MIDlet.b.activate(1048579, null, paramDisplayable);
    a.setCurrent(paramDisplayable);
  }
  
  public void setCurrent(Alert paramAlert, Displayable paramDisplayable) {
    a.setCurrent(paramAlert, paramDisplayable);
  }
  
  public void setCurrentItem(Item paramItem) {
    a.setCurrentItem(paramItem);
  }
  
  public void callSerially(Runnable paramRunnable) {
    a.callSerially(paramRunnable);
  }
  
  public boolean flashBacklight(int paramInt) {
    return a.flashBacklight(paramInt);
  }
  
  public boolean vibrate(int paramInt) {
    return a.vibrate(paramInt);
  }
  
  public int getBestImageWidth(int paramInt) {
    return getBestImageWidth(paramInt);
  }
  
  public int getBestImageHeight(int paramInt) {
    return getBestImageHeight(paramInt);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\favax\microedition\lcdui\Display.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */