package KD;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public final class a extends List {
  public a() {
    super("Музыка", 3);
    String[] arrayOfString1 = { "Вся музыка", "Исполнители", "Альбомы" };
    String[] arrayOfString2 = { "lib_allmusic.png", "lib_artist.png", "lib_album.png" };
    Image image = null;
    for (byte b = 0; b < arrayOfString1.length; b++) {
      image = u.a("/images/lib/" + arrayOfString2[b]);
      append(arrayOfString1[b], image);
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */