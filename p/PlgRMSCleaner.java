package p;

import i.I;
import i.PI;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

public class PlgRMSCleaner extends PI implements CommandListener {
  public Display a;
  
  public Form b;
  
  public TextField c;
  
  public Command d = new Command("Удалить", 4, 1);
  
  public Command e = new Command("Назад", 2, 2);
  
  public final String getName() {
    return "Удаление RMS";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(6) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      this.a = (Display)paramObject;
    } else if (paramInt == 2) {
      a();
    } 
    return null;
  }
  
  private final void a() {
    this.b = new Form("RMSCleaner v0.1");
    this.c = new TextField("Имя плагина", null, 255, 0);
    this.b.addCommand(this.e);
    this.b.addCommand(this.d);
    this.b.append((Item)this.c);
    this.b.setCommandListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void a(String paramString) {
    try {
      RecordStore.deleteRecordStore("PLG_" + paramString.hashCode());
      request(12, null, "v100 p50 v100");
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.d && this.c.getString().length() > 0) {
      a(this.c.getString());
      return;
    } 
    this.b.deleteAll();
    this.b = null;
    request(1, null, new Integer(0));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgRMSCleaner.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */