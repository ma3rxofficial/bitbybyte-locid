package mc;

public final class db extends Thread {
  private final aw a;
  
  public db(aw paramaw) {
    this.a = paramaw;
  }
  
  public final void run() {
    try {
      this.a.l();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\db.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */