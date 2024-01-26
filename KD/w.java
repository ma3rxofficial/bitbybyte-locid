package KD;

import java.util.Calendar;
import java.util.Date;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;

public final class w extends Form {
  private final String[] a = new String[] { 
      "января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", 
      "ноября", "декабря" };
  
  public w(String paramString, long paramLong, int paramInt) {
    super("Информация");
    append((Item)new StringItem("Имя плейлиста:\n", paramString + '\n'));
    append((Item)new StringItem("Дата создания:\n", a(paramLong) + '\n'));
    append((Item)new StringItem("Кол-во дорожек: ", Integer.toString(paramInt)));
  }
  
  private String a(long paramLong) {
    Calendar calendar = Calendar.getInstance();
    StringBuffer stringBuffer = new StringBuffer();
    calendar.setTime(new Date(paramLong));
    stringBuffer.append(calendar.get(5));
    stringBuffer.append(" ");
    stringBuffer.append(this.a[calendar.get(2)]);
    stringBuffer.append(" ");
    stringBuffer.append(calendar.get(1));
    stringBuffer.append(" г., ");
    int i;
    if ((i = calendar.get(11)) < 10)
      stringBuffer.append("0"); 
    stringBuffer.append(i);
    stringBuffer.append(':');
    if ((i = calendar.get(12)) < 10)
      stringBuffer.append("0"); 
    stringBuffer.append(i);
    stringBuffer.append(':');
    if ((i = calendar.get(13)) < 10)
      stringBuffer.append("0"); 
    stringBuffer.append(i);
    return stringBuffer.toString();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\w.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */