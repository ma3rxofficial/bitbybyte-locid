package KD;

import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;

public final class ai extends Form {
  public ai() {
    super("О программе...");
    Runtime runtime;
    (runtime = Runtime.getRuntime()).gc();
    long l1 = runtime.totalMemory();
    long l2 = runtime.freeMemory();
    append((Item)new StringItem("KD Player\n", "от 19.04.2007\n"));
    append((Item)new StringItem("Версия: ", "0.5.3 \n"));
    append((Item)new StringItem("Автор:\n", "© Knyzhov Dmitry, 2004-2007\n"));
    append((Item)new StringItem("E-mail:\n", "kdplayer@yandex.ru\n"));
    append((Item)new StringItem("Поддержите меня:\n", "R121026539105\nZ258603210623\n"));
    append((Item)new StringItem("Память устройства: \n", "Всего: " + l1 + " байт \n" + "Свободно: " + l2 + " байт"));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\ai.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */