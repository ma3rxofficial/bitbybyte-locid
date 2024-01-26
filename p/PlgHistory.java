package p;

import i.PI;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public class PlgHistory extends PI implements CommandListener, Runnable {
  public int a = 0;
  
  public int b = 4000;
  
  public String c;
  
  public Command d = new Command("Импорт", 4, 1);
  
  public Command e = new Command("Назад", 2, 2);
  
  public ChoiceGroup f;
  
  public TextField g;
  
  public TextField h;
  
  private Form i = new Form(null);
  
  private Display j;
  
  public final String getName() {
    return "Импорт истории";
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    switch (paramInt) {
      case 0:
        this.j = (Display)paramObject;
        return null;
      case 2:
      case 39:
        a();
        return null;
    } 
    return null;
  }
  
  public final void run() {
    long l = System.currentTimeMillis();
    int i = 0;
    try {
      for (byte b = 0;; b++) {
        String str = a(b * this.b - i, this.b + i);
        int j;
        if ((j = c(str, this.a)) == 0) {
          a(str, this.a);
          break;
        } 
        i = str.length() - j;
        str = str.substring(0, j);
        a(str, this.a);
      } 
    } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {}
    this.i.delete(0);
    this.i.append("Сохранено\n" + ((System.currentTimeMillis() - l) / 1000L) + "сек");
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException interruptedException) {}
    a();
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.e)
      request(1, null, new Integer(0)); 
    if (paramCommand == this.d) {
      this.a = this.f.getSelectedIndex();
      this.b = Integer.parseInt(this.h.getString());
      b();
      (new Thread(this)).start();
    } 
  }
  
  private final void a() {
    this.i = new Form(null);
    this.f = new ChoiceGroup("Тип истории", 1, new String[] { "LocID", "D[i]Chat" }, null);
    this.g = new TextField("Путь к файлу", this.c, 255, 0);
    this.h = new TextField("Кол-во символов", String.valueOf(this.b), 5, 0);
    this.i.append((Item)this.g);
    this.i.append((Item)this.h);
    this.i.append((Item)this.f);
    this.i.addCommand(this.e);
    this.i.addCommand(this.d);
    this.i.setCommandListener(this);
    this.j.setCurrent((Displayable)this.i);
  }
  
  private final void b() {
    this.i = new Form(null);
    this.i.append("Подождите");
    this.j.setCurrent((Displayable)this.i);
  }
  
  private final String a(int paramInt1, int paramInt2) {
    try {
      InputStream inputStream = getClass().getResourceAsStream("/hist.txt");
      byte[] arrayOfByte = new byte[paramInt2];
      inputStream.skip(paramInt1);
      inputStream.read(arrayOfByte);
      inputStream.close();
      StringBuffer stringBuffer = new StringBuffer();
      for (byte b = 0; b < arrayOfByte.length; b++) {
        int i;
        switch (i = arrayOfByte[b] & 0xFF) {
          case 168:
            stringBuffer.append('Ё');
            break;
          case 184:
            stringBuffer.append('ё');
            break;
          default:
            if (i > 191 && i < 256) {
              stringBuffer.append((char)(848 + i));
              break;
            } 
            stringBuffer.append((char)i);
            break;
        } 
      } 
      return stringBuffer.toString();
    } catch (IOException iOException) {
      return "";
    } 
  }
  
  private final void a(String paramString, int paramInt) throws StringIndexOutOfBoundsException {
    String str1 = (paramInt == 0) ? "------------------------------------>>>-" : "--->>>---";
    String str2 = (paramInt == 0) ? "------------------------------------<<<-" : "---<<<---";
    int i;
    if ((i = b(paramString, paramInt)) > 0) {
      paramString = paramString.substring(i).trim();
    } else {
      return;
    } 
    while (paramString.indexOf(str1) > -1 || paramString.indexOf(str2) > -1) {
      String str;
      d(paramString, paramInt);
      paramString = paramString.substring(str2.length());
      if ((i = b(paramString, paramInt)) > -1) {
        str = paramString.substring(0, i).trim();
      } else {
        str = paramString.trim();
      } 
      int j = str.indexOf("(");
      str.substring(0, j).trim();
      str.substring(j + 1, j + 12).trim();
      str.substring(j + 12, j + 20).trim();
      str.substring(j + 22).trim();
      if (i > -1)
        paramString = paramString.substring(i, paramString.length()); 
    } 
  }
  
  private final int b(String paramString, int paramInt) {
    String str1 = (paramInt == 0) ? "------------------------------------>>>-" : "--->>>---";
    String str2 = (paramInt == 0) ? "------------------------------------<<<-" : "---<<<---";
    int i = paramString.indexOf(str1);
    int j = paramString.indexOf(str2);
    return (i == -1 && j > 0) ? j : ((i > 0 && j == -1) ? i : ((i == -1 && j == -1) ? -1 : ((i > j) ? j : i)));
  }
  
  private final int c(String paramString, int paramInt) {
    String str1 = (paramInt == 0) ? "------------------------------------>>>-" : "--->>>---";
    String str2 = (paramInt == 0) ? "------------------------------------<<<-" : "---<<<---";
    int i = 0;
    int j = 0;
    String str3 = paramString;
    while (paramString.indexOf(str1) > -1) {
      int k;
      if ((k = paramString.indexOf(str1)) > -1) {
        i += k;
        paramString = paramString.substring(k + str1.length());
      } 
    } 
    paramString = str3;
    while (paramString.indexOf(str2) > -1) {
      int k = paramString.indexOf(str2);
      if (paramString.indexOf(str2) > -1) {
        j = j + k + str2.length();
        paramString = paramString.substring(k + str2.length());
      } 
    } 
    i = i - str1.length() - 1;
    j = j - str2.length() - 1;
    return (i == -1 && j == -1) ? -1 : ((i > j) ? i : j);
  }
  
  private final byte d(String paramString, int paramInt) {
    b(paramString, paramInt);
    String str1 = (paramInt == 0) ? "------------------------------------>>>-" : "--->>>---";
    String str2;
    return (str2 = paramString.substring(0, str1.length())).equals(str1) ? 0 : 1;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgHistory.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */