package KD;

import javax.microedition.lcdui.Displayable;

public final class ac implements Runnable {
  private final ae a;
  
  public ac(ae paramae) {
    this.a = paramae;
  }
  
  public final void run() {
    try {
      while (this.a.e.f)
        Thread.sleep(100L); 
      if (!this.a.h.k)
        this.a.h.a(); 
      this.a.h.setFullScreenMode(true);
      this.a.a.setCurrent((Displayable)this.a.h);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\ac.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */