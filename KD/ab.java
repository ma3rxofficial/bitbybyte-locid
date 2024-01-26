package KD;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public final class ab extends List {
  public ab() {
    super("KD Player v0.5.3", 3);
    String[] arrayOfString1 = { "Текущий", "Музыка", "Видео", "Дополнительно", "Плейлисты", "Настройки" };
    String[] arrayOfString2 = { "lib_now.png", "lib_music.png", "lib_video.png", "lib_other.png", "lib_pl.png", "lib_settings.png" };
    Image image = null;
    for (byte b = 0; b < arrayOfString1.length; b++) {
      image = u.a("/images/lib/" + arrayOfString2[b]);
      append(arrayOfString1[b], image);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\ab.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */