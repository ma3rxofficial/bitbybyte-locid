package KD;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public final class q extends List {
  private final String[] a = new String[] { "Общие настройки", "Типы файлов", "Папки для сканирования" };
  
  private final String[] b = new String[] { "/images/lib/lib_settings.png", "/images/lib/lib_settings.png", "/images/lib/lib_settings.png" };
  
  public q() {
    super("Настройки", 3);
    for (byte b = 0; b < this.a.length; b++) {
      try {
        append(this.a[b], Image.createImage(this.b[b]));
      } catch (Exception exception) {}
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\q.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */