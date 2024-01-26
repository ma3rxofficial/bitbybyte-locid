import java.util.Timer;
import java.util.TimerTask;
import jimm.Jimm;

public final class bq extends TimerTask {
  private final ef a;
  
  public bq(ef paramef, int paramInt) {
    this.a = paramef;
    if (paramInt > 0)
      (new Timer()).schedule(this, paramInt); 
  }
  
  public final void run() {
    if (Jimm.d.getCurrent() != ef.b || this.a.q != 0)
      return; 
    this.a.g();
    this.a.repaint();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */