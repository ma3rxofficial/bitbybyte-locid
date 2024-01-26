package p;

import i.C;
import i.I;
import i.PI;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import ui.Config;
import ui.FormEx;
import ui.Strings;

public class PlgCliStats extends PI implements CommandListener {
  public static FormEx a;
  
  public static int b;
  
  public static String[] c = Strings.explode("Unknown|QIP|Miranda|&RQ|R&Q|Trillian|SIM|Kopete|Jimm|StICQ|Agile Messenger|Libicq2000|VmICQ|QIP PDA (Symbian)|QIP PDA (Windows)|QIP Infium|ICQ v6|ICQ Lite|ICQ Lite v4|ICQ Lite v5|ICQ 2003b|ICQ2GO!|mChat|Mac ICQ|Pidgin (Gaim)|GnomeICU|LICQ|MIP|Yapp|Sm@peR|D[i]Chat|LocID|Bayan|SmartICQ|ICQ for PPC|mICQ|WebICQ|StrICQ|YSM|vICQ|Alicq|CenterICQ|Libicq2000 from Jabber|SPAM|AOL AIM|Slick|IM2|NatICQ", '|');
  
  public final String getName() {
    return "Статистика клиентов";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(9) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      Config.set((int[])request(16, null, null));
    } else if (paramInt == 2 || paramInt == 39) {
      a((Display)paramObject);
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    request(1, null, new Integer(0));
  }
  
  public final void a(Display paramDisplay) {
    a = new FormEx("CliStats v0.3", null, new Command("Назад", 2, 0));
    if (request(9, null, null) == null) {
      int[] arrayOfInt = a();
      for (byte b = 0; b < arrayOfInt.length; b++) {
        if (arrayOfInt[b] != 0)
          a.append(c[b] + " - " + a(arrayOfInt[b]) + " (" + arrayOfInt[b] + ")", false); 
      } 
    } else {
      a.append("Вы не подключены!", false);
    } 
    a.setListener(this);
    paramDisplay.setCurrent((Displayable)a);
  }
  
  public final int[] a() {
    int[] arrayOfInt = new int[c.length];
    C[] arrayOfC = (C[])request(3, null, null);
    b = 0;
    for (byte b = 0; b < arrayOfC.length; b++) {
      if (arrayOfC[b].getIntValue(192) != -1 && arrayOfC[b].getUinString().length() > 3) {
        arrayOfInt[arrayOfC[b].getIntValue(76)] = arrayOfInt[arrayOfC[b].getIntValue(76)] + 1;
        b++;
      } 
    } 
    return arrayOfInt;
  }
  
  public final String a(int paramInt) {
    return (100 * paramInt / b) + "%";
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgCliStats.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */