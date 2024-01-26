package mc;

public final class ct extends Thread {
  private final aw a;
  
  public ct(aw paramaw) {
    this.a = paramaw;
  }
  
  public final void run() {
    try {
      this.a.m();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ct.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */