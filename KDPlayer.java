import KD.ae;
import favax.microedition.midlet.MIDlet;

public class KDPlayer extends MIDlet {
  private ae a = new ae(this);
  
  public KDPlayer() {
    this.a.a();
  }
  
  public void startApp() {
    this.a.b();
  }
  
  public void pauseApp() {}
  
  public void destroyApp(boolean paramBoolean) {
    this.a.c();
    this.a.d();
    this.a = null;
  }
  
  public void a() {
    destroyApp(true);
    notifyDestroyed();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KDPlayer.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */