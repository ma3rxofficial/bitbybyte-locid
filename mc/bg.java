package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

public final class bg extends TextBox implements CommandListener {
  public aw a;
  
  public String b;
  
  public int c;
  
  public bg(aw paramaw, String paramString, int paramInt) {
    super(bn.cl, "", x.s, 0);
    this.a = paramaw;
    this.b = paramString;
    this.c = paramInt;
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
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.cm, 8, 1));
    addCommand(new Command(bn.co, 8, 1));
    addCommand(new Command(bn.cp, 8, 1));
    addCommand(new Command(bn.cq, 8, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.cm)) {
      a(this.c);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.co)) {
      a(1);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.cp)) {
      a(2);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.cq))
      a(3); 
  }
  
  private void a(int paramInt) {
    m m = null;
    DataOutputStream dataOutputStream = null;
    try {
      boolean bool = false;
      (m = new m()).a(this.b);
      if (m.p()) {
        m.o();
        m.d();
        m.a(this.b);
      } else {
        bool = true;
      } 
      m.n();
      dataOutputStream = m.c();
      byte[] arrayOfByte = null;
      if (paramInt == 2) {
        arrayOfByte = am.b(getString());
      } else if (paramInt == 3) {
        arrayOfByte = am.c(getString());
      } else {
        arrayOfByte = getString().getBytes("UTF-8");
      } 
      dataOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
      dataOutputStream.close();
      m.d();
      if (bool) {
        this.a.e[this.a.f].d();
        this.a.e[this.a.f].a(this.b);
        this.a.e[this.a.f].e();
        if ((this.a.e[this.a.f]).s.equals((this.a.e[this.a.f]).s)) {
          this.b = this.a.e[this.a.g].b();
          this.a.e[this.a.g].d();
          this.a.e[this.a.g].a(this.b);
          this.a.e[this.a.g].e();
        } 
        this.a.e(-1);
      } 
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } catch (Exception exception) {
      try {
        if (dataOutputStream != null)
          dataOutputStream.close(); 
      } catch (Exception exception1) {}
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception1) {}
      cx.a(bn.eq, exception.getMessage(), (Displayable)this);
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bg.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */