package KD;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;

public final class j extends Form {
  private final String[] b = new String[] { "Читать теги при загрузке", "Автостарт" };
  
  public ChoiceGroup a = new ChoiceGroup("Общие:", 2, this.b, null);
  
  public j() {
    super("Общие настройки");
    append((Item)this.a);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */