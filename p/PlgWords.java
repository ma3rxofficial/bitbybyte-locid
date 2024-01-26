package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import ui.Config;
import ui.FormEx;
import ui.Strings;

public class PlgWords extends PI implements CommandListener {
  private FormEx a;
  
  private String b;
  
  private String[] c = new String[] { "кошка", "*****", "Домашнее животное, кушает мышек" };
  
  private TextField d;
  
  private TextField e;
  
  private TextField f;
  
  private Command g = new Command("Игра \"Виселица\"", 8, 2);
  
  private int h = 5;
  
  private int i = 5;
  
  public final String getName() {
    return "Игра \"Виселица\"";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(8)), new Integer(15) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      a();
      Config.set((int[])request(16, null, null));
    } else if (paramInt == 2) {
      this.a = new FormEx("Words v0.12", new Command("Сохран.", 4, 0), new Command("Назад", 2, 0));
      this.d = new TextField("Слово", this.c[0], 15, 0);
      this.e = new TextField("Число ходов", this.i + "", 2, 2);
      this.f = new TextField("Описание слова", this.c[2], 255, 0);
      this.a.append((Item)this.d);
      this.a.append((Item)this.f);
      this.a.append((Item)this.e);
      this.a.setDisplay((Display)paramObject);
      this.a.setListener(this);
      ((Display)paramObject).setCurrent((Displayable)this.a);
    } else {
      if (paramInt == 16 || paramInt == 17) {
        Vector vector;
        (vector = new Vector()).addElement(this.g);
        return vector;
      } 
      if (paramInt == 18) {
        if (paramObject != this.g)
          return null; 
        if (this.b != null)
          c(); 
        this.b = (String)paramArrayOfObject[4];
        StringBuffer stringBuffer;
        (stringBuffer = new StringBuffer()).append("Вас пригласили играть в игру \"Виселица\"\n");
        if (this.c[2].length() > 0)
          stringBuffer.append(this.c[2]).append(" (" + this.c[1].length() + " букв)" + "\n"); 
        stringBuffer.append(this.c[1]).append(this.h + " попыток");
        request(8, (Object[])new String[] { (String)paramArrayOfObject[4], stringBuffer.toString() }, null);
      } else if (paramInt == 23 && this.b.equals(paramArrayOfObject[0])) {
        if (this.h > 1) {
          String str;
          if ((str = Strings.lowerCase((String)paramArrayOfObject[4])).equals(Strings.lowerCase(this.c[0]))) {
            request(8, (Object[])new String[] { (String)paramArrayOfObject[0], "Вы угадали!" }, null);
            c();
          } else {
            char c = (str = Strings.lowerCase(str)).charAt(0);
            this.c[1] = a(this.c[0], this.c[1], c);
            if (this.c[1].equals(Strings.lowerCase(this.c[0]))) {
              request(8, (Object[])new String[] { (String)paramArrayOfObject[0], "Вы угадали!" }, null);
              c();
            } else {
              request(8, (Object[])new String[] { (String)paramArrayOfObject[0], this.c[1] + ", " + this.h + " попыток" }, null);
            } 
          } 
        } else {
          request(8, (Object[])new String[] { (String)paramArrayOfObject[0], "У вас закончились попытки!" }, null);
          c();
        } 
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.a.isLeft(paramCommand))
      b(); 
    request(1, null, new Integer(0));
    this.a = null;
  }
  
  private final void a() {
    Object object;
    if ((object = request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
    try {
      this.h = dataInputStream.readInt();
      dataInputStream.readUnsignedByte();
      for (byte b = 0; b < this.c.length; b++)
        this.c[b] = dataInputStream.readUTF(); 
    } catch (IOException iOException) {}
    this.i = this.h;
    this.c[1] = a(this.c[0]);
  }
  
  private final void b() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    this.c[0] = this.d.getString();
    this.c[1] = a(this.c[0]);
    this.c[2] = this.f.getString();
    this.h = Integer.parseInt(this.e.getString());
    try {
      dataOutputStream.writeInt(this.h);
      dataOutputStream.writeByte(this.c.length);
      for (byte b = 0; b < this.c.length; b++)
        dataOutputStream.writeUTF(this.c[b]); 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  private final void c() {
    this.b = null;
    this.c[1] = a(this.c[0]);
    this.h = this.i;
  }
  
  private final String a(String paramString1, String paramString2, char paramChar) {
    paramString1 = Strings.lowerCase(paramString1);
    if (paramString2.length() < 1)
      paramString2 = a(paramString1); 
    if (paramString1.indexOf(paramChar) > -1) {
      while (paramString1.indexOf(paramChar) > -1) {
        int i = paramString1.indexOf(paramChar);
        paramString2 = a(paramString2, paramChar, i);
        paramString1 = a(paramString1, '*', i);
      } 
    } else {
      this.h--;
    } 
    return paramString2;
  }
  
  private final String a(String paramString, char paramChar, int paramInt) {
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer()).append(paramString.substring(0, paramInt)).append(paramChar).append(paramString.substring(paramInt + 1));
    return stringBuffer.toString();
  }
  
  private final String a(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramString.length(); b++)
      stringBuffer.append("*"); 
    return stringBuffer.toString();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgWords.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */