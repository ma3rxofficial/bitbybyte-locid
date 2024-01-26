import java.util.TimerTask;

public final class dl extends TimerTask {
  private final fc a;
  
  public dl(fc paramfc) {
    this.a = paramfc;
  }
  
  public final void run() {
    fc.a(this.a).callSerially(this.a);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */