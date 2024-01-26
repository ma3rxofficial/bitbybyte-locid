import com.nokia.mid.ui.DeviceControl;
import java.util.TimerTask;
import jimm.Jimm;

public final class cz {
  private static boolean a = true;
  
  private static int b = em.f(220) * 1000;
  
  private static TimerTask c;
  
  public static void a(boolean paramBoolean) {
    if (Jimm.l && em.h(5)) {
      if (paramBoolean) {
        a();
        return;
      } 
      b();
    } 
  }
  
  public static void a() {
    if (em.h(5)) {
      e();
      if (c != null) {
        c.cancel();
        c = null;
      } 
    } 
  }
  
  public static void b() {
    if (Jimm.l && em.h(5)) {
      a();
      c = new eg();
      Jimm.b().schedule(c, b);
    } 
  }
  
  public static void c() {
    if (a) {
      d();
      return;
    } 
    e();
  }
  
  public static void d() {
    if (em.h(5))
      DeviceControl.setLights(0, 0); 
    a = false;
  }
  
  private static void e() {
    if (em.h(5))
      DeviceControl.setLights(0, em.f(226)); 
    a = true;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */