package p;

import java.util.Timer;
import java.util.TimerTask;

class PlgXStatus$Task extends TimerTask {
  private final PlgXStatus a;
  
  public PlgXStatus$Task(PlgXStatus paramPlgXStatus) {
    this.a = paramPlgXStatus;
    (new Timer()).schedule(this, 0L, (paramPlgXStatus.f * 1000));
  }
  
  public void run() {
    this.a.j += this.a.f;
    if (this.a.j > this.a.g) {
      PlgXStatus.a(this.a, this.a.h, this.a.d, this.a.e, true);
      cancel();
      return;
    } 
    String str = this.a.c;
    PlgXStatus plgXStatus;
    this.a.b = (plgXStatus = this.a).a(str);
    PlgXStatus.a(this.a, this.a.i, this.a.a, this.a.b, false);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgXStatus$Task.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */