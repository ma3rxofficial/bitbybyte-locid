package p;

import favax.microedition.midlet.MIDlet;
import i.PI;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class PlgKDPalyer extends PI {
  public static Displayable a = null;
  
  public MIDlet b;
  
  public MIDlet c;
  
  public static Display d;
  
  public String getName() {
    return "KDPlayer";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    Alert alert;
    switch (paramInt) {
      case 2:
        d = (Display)paramObject;
        a();
        return null;
      case 0:
        d = (Display)paramObject;
        return null;
      case 39:
        a();
        return null;
      case 1048576:
        a((Canvas)paramObject);
        return null;
      case 1048578:
        (alert = new Alert("#, * - Exit")).setTimeout(-2);
        request(1, null, new Integer(1));
        d.setCurrent((Displayable)alert);
        a = null;
        this.c = null;
        return null;
    } 
    return null;
  }
  
  private void a() {
    if (a != null) {
      MIDlet.freez(this);
      d.setCurrent(a);
      return;
    } 
    this.b = (MIDlet)request(11, null, null);
    this.c = (MIDlet)request(55, null, "KDPlayer");
    MIDlet.createMidlet(this.c, this.b, this);
    this.c.myStartApp();
  }
  
  public final void a(Canvas paramCanvas) {
    a = (Displayable)paramCanvas;
    if (this.c != null)
      MIDlet.unFreez(); 
    request(1, null, new Integer(1));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgKDPalyer.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */