package favax.microedition.lcdui;

import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Canvas;

public abstract class Canvas extends Canvas {
  public int a = 0;
  
  public int[] b = new int[2];
  
  public Object[] c = new Object[] { this.b };
  
  public void keyPressed(int paramInt) {
    if (MIDlet.b != null) {
      this.b[0] = paramInt;
      this.b[1] = 0;
      MIDlet.b.activate(1048577, this.c, this);
      paramInt = this.b[0];
    } 
    System.out.println("KDown:" + paramInt);
    if (paramInt == 42 && this.a == 35) {
      System.out.println("Hibernate");
      if (MIDlet.b != null)
        MIDlet.b.activate(1048576, null, this); 
      paramInt = 35;
    } 
    this.a = paramInt;
    feyPressed(paramInt);
  }
  
  public void feyPressed(int paramInt) {}
  
  public void keyRepeated(int paramInt) {
    System.out.println("KRep:" + paramInt);
    feyRepeated(paramInt);
  }
  
  public void feyRepeated(int paramInt) {}
  
  public void keyReleased(int paramInt) {
    if (MIDlet.b != null) {
      this.b[0] = paramInt;
      this.b[1] = 1;
      MIDlet.b.activate(1048577, this.c, this);
      paramInt = this.b[0];
    } 
    System.out.println("KUp:" + paramInt);
    feyReleased(paramInt);
  }
  
  public void feyReleased(int paramInt) {}
  
  public void pointerPressed(int paramInt1, int paramInt2) {}
  
  public void pointerReleased(int paramInt1, int paramInt2) {}
  
  public void pointerDragged(int paramInt1, int paramInt2) {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\favax\microedition\lcdui\Canvas.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */