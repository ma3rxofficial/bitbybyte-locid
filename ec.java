import java.util.Timer;
import java.util.TimerTask;

public final class ec extends TimerTask {
  public Object[] a;
  
  public Object b;
  
  public int c;
  
  public ec(int paramInt1, Object[] paramArrayOfObject, Object paramObject, int paramInt2) {
    this.c = paramInt1;
    this.a = paramArrayOfObject;
    this.b = paramObject;
    (new Timer()).schedule(this, paramInt2);
  }
  
  public final void run() {
    if (this.c != 4 || cd.f())
      cp.a(this.c, this.a, this.b); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ec.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */