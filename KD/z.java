package KD;

import javax.microedition.lcdui.List;

public final class z extends List {
  public z() {
    super("Плейлисты", 3);
    append("Новый плейлист", u.a("/images/lib/lib_newpl.png"));
  }
  
  public final void a(String paramString) {
    append(paramString, u.a("/images/lib/lib_pl.png"));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\z.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */