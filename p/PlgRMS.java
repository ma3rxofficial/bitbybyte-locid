package p;

import i.PI;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class PlgRMS extends PI implements CommandListener {
  public Display a;
  
  public Form b;
  
  public TextField c;
  
  public Command d = new Command("Удалить", 4, 1);
  
  public Command e = new Command("Назад", 2, 2);
  
  public final String getName() {
    return "Удаление RMS";
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
    this.b = new Form(null);
    this.c = new TextField("Имя плагина", null, 50, 0);
    this.b.append((Item)this.c);
    this.b.addCommand(this.e);
    this.b.addCommand(this.d);
    this.b.setCommandListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void a(String paramString) {
    try {
      RecordStore.deleteRecordStore("PLG_" + paramString);
      request(12, null, "v100 p50 v100");
      return;
    } catch (RecordStoreNotFoundException recordStoreNotFoundException) {
      return;
    } catch (RecordStoreException recordStoreException) {
      return;
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.d) {
      String str;
      if ((str = this.c.getString()).length() > 0)
        a(str.hashCode() + ""); 
      return;
    } 
    this.b.deleteAll();
    this.b = null;
    request(1, null, new Integer(0));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgRMS.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */