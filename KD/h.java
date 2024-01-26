package KD;

import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;

public final class h extends Form {
  public h(String paramString, String[] paramArrayOfString, int paramInt) {
    super("Информация");
    append((Item)new StringItem("Исполнитель:\n", paramString + '\n'));
    if (paramArrayOfString != null && paramArrayOfString.length > 0) {
      StringBuffer stringBuffer = new StringBuffer();
      for (byte b = 0; b < paramArrayOfString.length; b++)
        stringBuffer.append(paramArrayOfString[b] + "\n"); 
      append((Item)new StringItem("Альбомы:\n", stringBuffer.toString()));
    } 
    append((Item)new StringItem("Кол-во дорожек:", " " + paramInt));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */