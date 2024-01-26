import javax.microedition.io.Connector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
import jimm.Jimm;

public final class bw implements CommandListener {
  private TextBox a;
  
  private TextBox b;
  
  private static Command c = new Command(bb.a((short)12), 2, 1);
  
  private static Command d = new Command(bb.a((short)420), 8, 3);
  
  private static Command e = new Command(bb.a((short)327), 8, 2);
  
  private static Command f = new Command(bb.a((short)17), 8, 1);
  
  private static bw g;
  
  public static void a() {
    if (g == null)
      g = new bw(); 
    g.b();
  }
  
  private void b() {
    this.b = dw.a(new TextBox(bb.a((short)381), "", 30, 3));
    this.b.addCommand(d);
    this.b.addCommand(e);
    this.b.addCommand(c);
    this.b.setCommandListener(this);
    Jimm.d.setCurrent((Displayable)this.b);
  }
  
  private void c() {
    String str = this.b.getString();
    this.a = dw.a(new TextBox("SMS " + str, "", 500, 0));
    this.a.addCommand(f);
    this.a.addCommand(c);
    this.a.setCommandListener(this);
    Jimm.d.setCurrent((Displayable)this.a);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == e) {
      d();
      return;
    } 
    if (paramCommand == d) {
      if (this.b.getString().length() > 0) {
        c();
        return;
      } 
    } else {
      if (paramCommand == f) {
        e();
        return;
      } 
      if (paramCommand == c)
        cy.f(); 
    } 
  }
  
  private void d() {
    String str;
    if ((str = this.b.getString()).length() > 0)
      try {
        Jimm.c.platformRequest("tel:" + str);
        return;
      } catch (Exception exception) {} 
  }
  
  private void e() {
    String str1 = this.a.getString();
    String str2 = this.b.getString();
    if (str1.length() > 0 && str2.length() > 0)
      try {
        MessageConnection messageConnection;
        TextMessage textMessage;
        (textMessage = (TextMessage)(messageConnection = (MessageConnection)Connector.open("sms://" + str2)).newMessage("text")).setPayloadText(str1);
        messageConnection.send((Message)textMessage);
        messageConnection.close();
      } catch (Exception exception) {} 
    cy.f();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */