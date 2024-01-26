import java.util.Vector;

public abstract class ek implements Runnable {
  public int a = 0;
  
  public volatile boolean b;
  
  public volatile Thread c;
  
  public Vector d;
  
  public final int d() {
    int i = this.a;
    this.a = ++this.a % 32768;
    return i;
  }
  
  public synchronized void a(String paramString, boolean paramBoolean) throws cr {}
  
  public synchronized void a() {}
  
  public final synchronized int e() {
    return (this.d == null) ? 0 : this.d.size();
  }
  
  public final dd f() throws cr {
    byte[] arrayOfByte;
    synchronized (this.d) {
      if (this.d.size() == 0)
        return null; 
      arrayOfByte = this.d.elementAt(0);
      this.d.removeElementAt(0);
    } 
    return dd.a(arrayOfByte);
  }
  
  public void a(dd paramdd) throws cr {}
  
  public int b() {
    return 0;
  }
  
  public byte[] c() {
    return new byte[4];
  }
  
  public void run() {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ek.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */