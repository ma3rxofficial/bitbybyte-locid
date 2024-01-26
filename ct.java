import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import jimm.Jimm;

public final class ct implements CommandListener {
  private Command a = new Command(bb.a((short)10), 1, 2);
  
  private Command b = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 1);
  
  private be c = new be(bb.a((short)489));
  
  private byte d = 1;
  
  private byte e = (byte)db.d();
  
  private int f;
  
  public ct() {
    this.c.e(3);
    this.c.c(8);
    this.c.a(this.a, bd.Z);
    this.c.a(this.b, bd.aa);
    this.c.a(this);
  }
  
  public final void a() {
    try {
      a(true);
    } catch (Throwable throwable) {}
    this.c.b(Jimm.d);
  }
  
  private void a(boolean paramBoolean) {
    if (db.d() - this.e >= this.d || db.e - this.f != 0 || paramBoolean) {
      int i = em.g(18);
      int j = em.g(16);
      int k = em.g(19);
      this.c.z();
      this.c.a(bb.a((short)426) + ":\n" + bb.a((short)377) + "\n", i, 1, -1).a(db.a(11) + "\n", k, 0, -1).a(db.a(12) + "\n", k, 0, -1).a(db.a(13) + "\n\n", k, 0, -1).a(bb.a((short)436) + " ", i, 1, -1).a(db.a(4) + "\n" + bb.a((short)377) + "\n", k, 1, -1).a(db.a(21) + "\n", k, 0, -1).a(db.a(22) + "\n", k, 0, -1).a(db.a(23) + "\n\n", k, 0, -1).a(bb.a((short)796) + " ", i, 1, -1).a(db.a(5) + "\n", k, 0, -1);
      this.e = (byte)db.d();
      this.c.a("\n" + bb.a((short)753), j, 1, -1);
      this.c.a("\n" + bb.a((short)426) + ":\n", i, 1, -1).a(db.f(10) + "\n", k, 0, -1).a(db.f(11) + "\n", k, 0, -1).a(db.f(12) + "\n\n", k, 0, -1).a(bb.a((short)436) + " ", i, 1, -1).a(db.a(4) + "\n", k, 1, -1).a(db.f(20) + "\n", k, 0, -1).a(db.f(21) + "\n", k, 0, -1).a(db.f(22) + "\n", k, 0, -1);
      this.f = db.e;
      this.c.a("\n" + bb.a((short)824) + ":\n", j, 1, -1);
      this.c.a(db.a(40) + "\n", k, 0, -1);
      this.c.e();
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.a) {
      db.e();
      a(true);
      return;
    } 
    if (paramCommand == this.b)
      dw.d(); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ct.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */