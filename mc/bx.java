package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.media.Player;

public final class bx extends Form implements CommandListener {
  public ch a = null;
  
  public cq b = null;
  
  public TextField c = new TextField(bn.aD, "0", 3, 5);
  
  public TextField d = new TextField(bn.aE, "0", 2, 5);
  
  public TextField e = new TextField(bn.aF, "0", 2, 5);
  
  public Player f = null;
  
  public bx(ch paramch, cq paramcq) {
    super(bn.aC);
    this.a = paramch;
    this.b = paramcq;
    try {
      a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void a() throws Exception {
    setCommandListener(this);
    this.f = (this.a != null) ? this.a.h : this.b.h;
    long l;
    if (this.f != null && this.f.getState() == 400 && (l = this.f.getMediaTime() / 1000000L) != -1L) {
      long l1 = l / 60L / 60L;
      long l2 = l / 60L % 60L;
      long l3 = l % 60L;
      this.c.setString(String.valueOf(l1));
      this.d.setString(String.valueOf(l2));
      this.e.setString(String.valueOf(l3));
      l1 = (l = this.f.getDuration() / 1000000L) / 60L / 60L;
      l2 = l / 60L % 60L;
      l3 = l % 60L;
      append(bn.aG + cx.a(l1, 1) + ":" + cx.a(l2, 2) + ":" + cx.a(l3, 2) + "\n");
    } 
    append((Item)this.c);
    append((Item)this.d);
    append((Item)this.e);
    addCommand(new Command(bn.aC, 1, 1));
    addCommand(new Command(bn.eM, 2, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    cq cq1;
    if (this.a != null) {
      ch ch1 = this.a;
    } else {
      cq1 = this.b;
    } 
    if (paramCommand.getCommandType() != 2)
      if (paramCommand.getLabel().equals(bn.aC)) {
        long l1 = Integer.parseInt(this.c.getString());
        long l2 = Integer.parseInt(this.d.getString());
        long l3 = Integer.parseInt(this.e.getString());
        if (this.a != null) {
          if (this.a.h != null && this.a.h.getState() == 400)
            this.a.a(((l1 * 60L + l2) * 60L + l3) * 1000000L); 
        } else if (this.b.h != null && this.b.h.getState() == 400) {
          this.b.a(((l1 * 60L + l2) * 60L + l3) * 1000000L);
        } 
      } else {
        return;
      }  
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)cq1);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bx.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */