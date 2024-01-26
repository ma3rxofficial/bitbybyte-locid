package mc;

public final class bw extends Thread {
  private final aw a;
  
  public bw(aw paramaw) {
    this.a = paramaw;
  }
  
  public final void run() {
    try {
      this.a.i();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bw.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */