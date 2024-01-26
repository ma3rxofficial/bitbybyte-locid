package KD;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public final class x extends List {
  public x() {
    super("Дополнительно", 3);
    String[] arrayOfString1 = { "Загрузка", "Справка", "О программе" };
    String[] arrayOfString2 = { "lib_download.png", "lib_help.png", "lib_about.png" };
    Image image = null;
    for (byte b = 0; b < arrayOfString1.length; b++) {
      image = u.a("/images/lib/" + arrayOfString2[b]);
      append(arrayOfString1[b], image);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\x.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */