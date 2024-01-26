package KD;

import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;

public final class am extends Form {
  public am() {
    super("Справка");
    an an = new an();
    an.getClass();
    an.getClass();
    append((Item)new StringItem("Управление проигрывателем:\n", "[Джостик/5]-воспроизведение/пауза\n[Влево/4]-предыдущая дорожка (перемотка назад при удерживании)\n[Вправо/6]-следующая дорожка (перемотка вперед при удерживании)\n[Вверх/2]-увелечение громкости\n[Вниз/8]-уменьшение громкости\n[1]-текущий плейлист\n[3]-выход из проигрывателя\n[7]-вкл/выкл Перемешивание\n[9]-вкл/выкл Повтор\n[0]-главное меню\n[*]-фоновый режим\n[#]-вкл/выкл блокировку клавиатуры (при удерживании)\n"));
    an.getClass();
    append(" \n");
    an.getClass();
    an.getClass();
    append((Item)new StringItem("Обновления:\n", "Новую версию плеера Вы всегда сможете скачать с сайта: http://www.easter-eggs.by.ru\n"));
    an.getClass();
    append(" \n");
    an.getClass();
    an.getClass();
    append((Item)new StringItem("Нашли ошибку?\n", "О всех найденых ошибках пожалуйста напишите на kdplayer@yandex.ru указав в теме письма модель вашего телефона."));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\am.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */