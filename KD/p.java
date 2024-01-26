package KD;

import favax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;

public final class p extends Form implements Runnable {
  private String a;
  
  private Display b;
  
  public p(String paramString, Display paramDisplay) {
    super("Информация");
    this.a = paramString;
    this.b = paramDisplay;
    Thread thread;
    (thread = new Thread(this)).start();
  }
  
  public final void run() {
    if (this.a != null && this.a.length() > 0) {
      append((Item)new StringItem("Местоположение:\n", this.a + '\n'));
      f f;
      (f = new f()).a(this.a);
      if (f.f != null && f.f.length() > 0)
        append((Item)new StringItem("Название дорожки:\n", f.f + '\n')); 
      if (f.e != null && f.e.length() > 0)
        append((Item)new StringItem("Исполнитель:\n", f.e + '\n')); 
      if (f.g != null && f.g.length() > 0)
        append((Item)new StringItem("Альбом:\n", f.g + '\n')); 
      if (f.i > 0L)
        append((Item)new StringItem("Длина: ", u.a(f.i) + '\n')); 
      if (f.h != null && f.h.length() > 0)
        append((Item)new StringItem("Размер видео:\n", f.h + '\n')); 
      if (f.d != null && f.d.length() > 0)
        append((Item)new StringItem("Тип данных:\n", f.d + '\n')); 
    } 
    if (size() < 1)
      append("Недоступно..."); 
    this.b.setCurrent((Displayable)this);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */