package KD;

import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;

public final class ah extends Form {
  public ah(String paramString, int paramInt) {
    super("Информация");
    append((Item)new StringItem("Альбом:\n", paramString + '\n'));
    append((Item)new StringItem("Кол-во дорожек:", " " + paramInt));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\ah.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */