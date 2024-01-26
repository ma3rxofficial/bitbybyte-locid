import i.PI;
import java.util.Timer;
import java.util.TimerTask;

public final class dx extends TimerTask {
  public PI a;
  
  public Object[] b;
  
  public Object c;
  
  public Timer d;
  
  public dx(PI paramPI, Object[] paramArrayOfObject, Object paramObject) {
    this.a = paramPI;
    this.b = paramArrayOfObject;
    this.c = paramObject;
    long l1 = 0L;
    long l2 = 0L;
    if (paramArrayOfObject instanceof Object[]) {
      Object[] arrayOfObject;
      if ((arrayOfObject = paramArrayOfObject)[0] instanceof Long)
        l1 = ((Long)arrayOfObject[0]).longValue(); 
      if (arrayOfObject.length > 1 && arrayOfObject[1] != null && arrayOfObject[1] instanceof Long)
        l2 = ((Long)arrayOfObject[1]).longValue(); 
    } 
    if (l2 > 0L) {
      (this.d = new Timer()).scheduleAtFixedRate(this, l1, l2);
      return;
    } 
    if (l1 > 0L)
      (this.d = new Timer()).schedule(this, l1); 
  }
  
  public final void run() {
    this.a.activate(36, this.b, this.c);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */