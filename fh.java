import java.util.TimerTask;

public final class fh extends TimerTask {
  private final dm a;
  
  public fh(dm paramdm) {
    this.a = paramdm;
  }
  
  public final void run() {
    dm.a(this.a);
    if (dm.b(this.a)) {
      dm.a(this.a, !dm.c(this.a));
    } else {
      dm.b(this.a, !dm.d(this.a));
    } 
    if (dm.e(this.a) > dm.f(this.a)) {
      dm.g(this.a).cancel();
      dm.a(this.a, false);
      dm.b(this.a, false);
      if (!dm.b(this.a))
        dm.h(this.a); 
    } 
    if (System.currentTimeMillis() - bd.h > 250L)
      bi.q(); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\fh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */