import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDletStateChangeException;
import jimm.Jimm;

public final class dq extends Form implements CommandListener {
  private TextBox a = new TextBox("", "", 20, 65536);
  
  private Command b = new Command(bb.a((short)14), 4, 1);
  
  private Command c = new Command(bb.a((short)11), Jimm.j ? 3 : 2, 2);
  
  private Displayable d;
  
  private static dq e;
  
  private dq(Displayable paramDisplayable) {
    super(null);
    this.d = paramDisplayable;
    this.a.setTitle(bb.a((short)222));
    this.a.addCommand(this.b);
    this.a.addCommand(this.c);
    this.a.setCommandListener(this);
  }
  
  private void a() {
    if (em.d(133).length() > 0 && Jimm.s) {
      this.a.setString("");
      Jimm.d.setCurrent((Displayable)this.a);
      cz.a(true);
      return;
    } 
    if (cd.e()) {
      b();
      return;
    } 
    bi.i();
  }
  
  public static void a(Displayable paramDisplayable) {
    if (e == null)
      e = new dq(paramDisplayable); 
    e.a();
  }
  
  private static void b() {
    if (em.h(1)) {
      cd.l = em.f(204);
      bi.k();
      cd.b();
      return;
    } 
    cy.f();
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.b) {
      if (em.d(133).equals(this.a.getString())) {
        if (cd.e()) {
          b();
        } else {
          ef.d();
          ef.h = 0L;
        } 
        Jimm.s = false;
        return;
      } 
    } else {
      if (cd.e())
        try {
          Jimm.c.destroyApp(true);
          return;
        } catch (MIDletStateChangeException mIDletStateChangeException) {
          return;
        }  
      Jimm.d.setCurrent(this.d);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */