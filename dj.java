import java.util.TimerTask;

public final class dj extends TimerTask {
  private final fc a;
  
  public dj(fc paramfc) {
    this.a = paramfc;
  }
  
  public final void run() {
    long l;
    if (!bd.a)
      return; 
    if (bd.b) {
      l = this.a.b;
    } else {
      l = this.a.b - System.currentTimeMillis();
    } 
    if (this.a.c || l > 0L || !fc.e)
      this.a.a(l); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */