package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import ui.ChGroupEx;
import ui.Config;
import ui.FormEx;
import ui.Strings;

public class PlgAdvCaption extends PI implements CommandListener {
  public FormEx a;
  
  public TextField b;
  
  public String[] c = Strings.explode("%t|%d|%i|%o|%p|%w|%g|%s|%r|", '|');
  
  public String[] d = Strings.explode("время|дата|принятые сбщ.|отправленные сбщ.|профиль|день недели|принято слов|отправлено слов|прочитано статусов|", '|');
  
  public String e = "%t-%d-%i-%o%n%p-%w%n%g-%s-%r";
  
  public String[] f = Strings.explode("Воскресенье|Понедельник|Вторник|Среда|Четверг|Пятница|Суббота|", '|');
  
  public String[] g = Strings.explode("Вс|Пн|Вт|Ср|Чт|Пт|Сб|", '|');
  
  public ChGroupEx h;
  
  public boolean[] i = new boolean[] { false, false, false, false, false, false };
  
  public int[] j;
  
  public int k = Font.getFont(0, 1, 8).getHeight();
  
  public int l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public final String getName() {
    return "Расширенный заголовок";
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      c();
      this.j = (int[])request(16, null, null);
      Config.set(this.j);
    } else if (paramInt == 2) {
      this.a = new FormEx("AdvCaption v0.3", new Command("Сохран.", 4, 1), new Command("Назад", 2, 2));
      this.b = new TextField("Что показывать?", this.e, 100, 0);
      this.h = new ChGroupEx("Настройки", 2, new String[] { "В КЛ", "В чате", "В меню", "Сокращать день недели", "Год в дате", "По центру" });
      this.h.setSelectedFlags(this.i);
      this.a.append((Item)this.b);
      this.a.append((Item)this.h);
      this.a.append("Макросы:", false);
      for (byte b = 0; b < this.c.length; b++)
        this.a.append(this.c[b] + " - " + this.d[b], false); 
      this.a.append("%n -  перенос строки", false);
      this.a.setDisplay((Display)paramObject);
      this.a.setListener(this);
      ((Display)paramObject).setCurrent((Displayable)this.a);
    } else if (paramInt == 22) {
      this.m++;
      this.o += (Strings.explode(paramArrayOfObject[1].toString().trim(), ' ')).length + 1;
    } else if (paramInt == 23) {
      this.l++;
      this.n += (Strings.explode(paramArrayOfObject[4].toString().trim(), ' ')).length + 1;
    } else {
      if (paramInt == 24) {
        if (!this.i[0] && !this.i[1] && !this.i[2])
          return null; 
        int[] arrayOfInt;
        if ((arrayOfInt = (int[])paramArrayOfObject[0])[2] < 1 || arrayOfInt[2] > 3)
          return null; 
        if (!this.i[arrayOfInt[2] - 1])
          return null; 
        Vector vector;
        (vector = (Vector)new Vector()).addElement(new int[] { arrayOfInt[0], this.k * (a(this.e)).length, 0, 0 });
        return vector;
      } 
      if (paramInt == 25) {
        if (!this.i[0] && !this.i[1] && !this.i[2])
          return null; 
        Graphics graphics = (Graphics)paramArrayOfObject[0];
        int[] arrayOfInt = (int[])paramObject;
        boolean bool = this.i[5] ? (((Canvas)paramArrayOfObject[1]).getWidth() / 2) : true;
        String[] arrayOfString = a(this.e);
        graphics.setColor(this.j[14]);
        for (byte b = 0; b < arrayOfString.length; b++) {
          graphics.drawString(arrayOfString[b], bool, arrayOfInt[1], this.i[5] ? 17 : 20);
          arrayOfInt[1] = arrayOfInt[1] + this.k;
        } 
      } else if (paramInt == 29) {
        this.p++;
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.a.isLeft(paramCommand))
      d(); 
    request(1, null, new Integer(0));
    this.a = null;
  }
  
  private final String[] a(String paramString) {
    String[] arrayOfString = Strings.explode(a() + "|" + b() + "|" + "ВС: " + this.l + "|" + "ИС: " + this.m + "|" + e() + "|" + f() + "|" + "ПС: " + this.n + "|" + "ОС: " + this.o + "|" + "ЧС: " + this.p + "|", '|');
    for (byte b = 0; b < this.c.length; b++) {
      paramString = (String)request(41, (Object[])new String[] { paramString, this.c[b], arrayOfString[b] }, null);
    } 
    return (String[])request(40, (Object[])new String[] { paramString, "%n" }, null);
  }
  
  private final void c() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      this.e = dataInputStream.readUTF();
      int i = dataInputStream.readUnsignedByte();
      for (byte b = 0; b < i; b++)
        this.i[b] = dataInputStream.readBoolean(); 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void d() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    this.h.getSelectedFlags(this.i);
    this.e = this.b.getString();
    try {
      dataOutputStream.writeUTF(this.e);
      dataOutputStream.writeByte(this.i.length);
      for (byte b = 0; b < this.i.length; b++)
        dataOutputStream.writeBoolean(this.i[b]); 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  private final String e() {
    int i = 0;
    switch (i = (i = 3 - (((Boolean)request(17, new Object[] { new Integer(10) }, null)).booleanValue() ? 0 : 2)) - (((Boolean)request(17, new Object[] { new Integer(43) }, null)).booleanValue() ? 0 : 1)) {
      case 0:
        return "Обычный";
      case 1:
        return "Тихий";
      case 2:
        return "Эконом.";
      case 3:
        return "Тихий и эконом.";
    } 
    return null;
  }
  
  private final String f() {
    int i = Calendar.getInstance().get(7);
    return this.i[3] ? this.g[i] : this.f[i];
  }
  
  public final String a() {
    String str;
    return (str = (String)request(23, new Object[] { new Boolean(false), new Boolean(false) }, null)).substring(11, 16);
  }
  
  public final String b() {
    String str;
    return (str = (String)request(23, new Object[] { new Boolean(false), new Boolean(false) }, null)).substring(0, this.i[4] ? 10 : 5);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgAdvCaption.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */