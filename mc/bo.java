package mc;

public final class bo extends Thread {
  private final ci a;
  
  public bo(ci paramci) {
    this.a = paramci;
  }
  
  public final void run() {
    try {
      ci.a(this.a.x, this.a.z);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bo.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */