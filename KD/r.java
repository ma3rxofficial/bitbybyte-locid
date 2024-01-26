package KD;

import javax.microedition.lcdui.List;

public final class r extends List {
  private final String[] a = new String[] { "По названию", "По исполнителю", "По альбому", "По имени файла", "Перемешать", "Инвертировать" };
  
  public r() {
    super("Сортировать", 3);
    for (byte b = 0; b < this.a.length; b++)
      append(this.a[b], null); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\r.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */