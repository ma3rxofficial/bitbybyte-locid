import i.PI;

public final class ez implements Runnable {
  public PI a;
  
  public Object[] b;
  
  public Object c;
  
  public ez(PI paramPI, Object[] paramArrayOfObject, Object paramObject) {
    this.a = paramPI;
    this.b = paramArrayOfObject;
    this.c = paramObject;
    (new Thread(this)).start();
  }
  
  public final void run() {
    this.a.activate(37, this.b, this.c);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ez.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */