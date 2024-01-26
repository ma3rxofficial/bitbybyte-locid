import java.util.Timer;
import java.util.TimerTask;

public final class di extends TimerTask {
  private String a;
  
  private dm b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  public di(String paramString, int paramInt1, int paramInt2, int paramInt3, dm paramdm) {
    this.a = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.b = paramdm;
    (new Timer()).schedule(this, (45000 + bs.b.nextInt() % 15000));
  }
  
  public final void run() {
    try {
      if (bs.a.containsKey(this.a)) {
        bs.a.remove(this.a);
        if (this.b.getIntValue(192) == -1) {
          cl.a(1, this.a, bb.a((short)727) + " (type:" + this.e + " fam:" + this.c + " " + this.d + ")");
          return;
        } 
      } else {
        bs.a.remove(this.a);
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\di.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */