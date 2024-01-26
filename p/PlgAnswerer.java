package p;

import i.C;
import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import ui.ChGroupEx;
import ui.Config;
import ui.FormEx;
import ui.Strings;

public class PlgAnswerer extends PI implements CommandListener {
  public String[] a = Strings.explode("Добавить UIN|Удалить UIN|Добавить в словарь|Просмотр\\Изменение|Настройки|Назад|", '|');
  
  public FormEx b;
  
  public ChGroupEx c;
  
  public ChGroupEx d;
  
  public Display e;
  
  public TextField f;
  
  public TextField g;
  
  public TextField h;
  
  public Command i = new Command("В автоотв.", 8, 0);
  
  public Command j = new Command("Из автоотв.", 8, 0);
  
  public boolean[] k = new boolean[] { true, false, false, false, false };
  
  public int[] l = new int[] { 500, 1000, 0 };
  
  public int m = 0;
  
  public int n = 0;
  
  public Vector o = new Vector();
  
  public Vector p = new Vector();
  
  public final String getName() {
    return "Автоответчик";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(0)), new Integer(14) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      j();
      h();
      this.e = (Display)paramObject;
      Config.set((int[])request(16, null, null));
    } else if (paramInt == 2) {
      c();
    } else {
      if ((((paramInt == 16) ? 1 : 0) | ((paramInt == 19) ? 1 : 0)) != 0)
        return a(); 
      if (paramInt == 17) {
        if (this.k[3])
          return a((String)paramArrayOfObject[(paramInt == 18) ? 4 : 0]); 
      } else if (paramInt == 20) {
        if (this.k[4])
          return a((String)paramArrayOfObject[(paramInt == 18) ? 4 : 0]); 
      } else if (paramInt == 18 || paramInt == 21) {
        if (paramObject.equals(this.i)) {
          this.o.addElement((String)paramArrayOfObject[(paramInt == 18) ? 4 : 0]);
          i();
        } else if (paramObject.equals(this.j)) {
          this.o.removeElement(paramArrayOfObject[(paramInt == 18) ? 4 : 0]);
          i();
        } 
      } else if (paramInt == 23) {
        if (this.k[0]) {
          String str1 = (String)paramArrayOfObject[0];
          String str2 = (String)paramArrayOfObject[4];
          boolean bool = false;
          if (this.k[0]) {
            if (!b(str1) && this.k[1])
              return null; 
            switch (this.l[2]) {
              case 0:
                bool = true;
                break;
              case 1:
                if (this.o.contains(str1))
                  bool = true; 
                break;
            } 
            if (bool)
              a(str1, str2); 
          } 
        } 
      } else if (paramInt == 36) {
        request(8, (Object[])new String[] { (String)paramArrayOfObject[2], (String)paramArrayOfObject[3] }, null);
      } else if (paramInt == 39) {
        String str = ((C)paramObject).getUinString();
        if (!this.o.contains(str)) {
          this.o.addElement(str);
        } else {
          this.o.removeElement(str);
        } 
        i();
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.n == 0) {
      if (this.b.isRight(paramCommand)) {
        this.b = null;
        request(1, null, new Integer(0));
        return;
      } 
      switch (this.b.getCurrIndex()) {
        case 0:
          b();
          break;
        case 1:
          d();
          break;
        case 2:
          f();
          break;
        case 3:
          g();
          break;
        case 4:
          e();
          break;
      } 
      return;
    } 
    if (this.n == 1) {
      if (this.b.isRight(paramCommand)) {
        c();
        return;
      } 
      if (paramCommand == List.SELECT_COMMAND) {
        this.o.removeElementAt(this.b.getCurrIndex());
        this.b.remove(this.b.getCurrIndex());
        i();
        if (this.o.size() == 0) {
          c();
          return;
        } 
      } 
    } else {
      if (this.n == 5) {
        if (this.b.isLeft(paramCommand))
          this.o.addElement(this.h.getString()); 
        c();
        return;
      } 
      if (this.n == 4) {
        if (this.b.isLeft(paramCommand)) {
          this.l[0] = Integer.parseInt(this.f.getString());
          this.l[1] = Integer.parseInt(this.g.getString());
          this.l[2] = this.d.getSelectedIndex();
          this.c.getSelectedFlags(this.k);
          i();
        } 
        c();
        return;
      } 
      if (this.n == 2) {
        if (this.b.isLeft(paramCommand)) {
          String str1 = this.f.getString();
          String str2 = this.h.getString();
          if (str1.length() > 0 && str2.length() > 0) {
            this.p.addElement(new String[] { str1, str2 });
            i();
            request(12, null, "v100 p50 v100");
          } 
        } 
        c();
        return;
      } 
      if (this.n == 3) {
        if (paramCommand == List.SELECT_COMMAND) {
          int i = this.b.getCurrIndex();
          this.p.removeElementAt(i);
          this.b.remove(i);
          i();
          if (this.p.size() == 0)
            c(); 
          return;
        } 
        c();
      } 
    } 
  }
  
  private final void b() {
    this.n = 5;
    this.b = new FormEx(this.a[0], new Command("Добав.", 8, 0), new Command(this.a[5], 2, 0));
    this.h = new TextField("UIN", null, 12, 2);
    this.b.append((Item)this.h);
    this.b.setDisplay(this.e);
    this.b.setListener(this);
    this.e.setCurrent((Displayable)this.b);
  }
  
  private final void c() {
    this.n = 0;
    this.b = new FormEx("Answerer v0.55", null, new Command(this.a[5], 2, 0));
    for (byte b = 0; b < 5; b++)
      this.b.append(this.a[b], true); 
    this.b.setListener(this);
    this.e.setCurrent((Displayable)this.b);
  }
  
  private final void d() {
    this.b = new FormEx(this.a[1], null, new Command(this.a[5], 2, 0));
    this.n = 1;
    if (this.o.size() < 1) {
      this.b.append("Номеров нет", false);
    } else {
      for (byte b = 0; b < this.o.size(); b++)
        this.b.append(this.o.elementAt(b), true); 
    } 
    this.b.setListener(this);
    this.e.setCurrent((Displayable)this.b);
  }
  
  private final void e() {
    this.n = 4;
    this.b = new FormEx(this.a[4], new Command("Сохран.", 8, 0), new Command(this.a[5], 2, 0));
    this.f = new TextField("Скорость чтения", this.l[0] + "", 4, 2);
    this.g = new TextField("Скорость набора", this.l[1] + "", 4, 2);
    this.c = new ChGroupEx(null, 2, new String[] { "Включить плагин", "Только для КЛ", "Как \"зеркало\"", "Кнопка в чате", "Кнопка в КЛ" });
    this.d = new ChGroupEx("Отвечать", 1, new String[] { "Из КЛ", "Из списка" });
    this.d.setSelectedIndex(this.l[2], true);
    this.c.setSelectedFlags(this.k);
    this.b.append((Item)this.c);
    this.b.append((Item)this.d);
    this.b.append((Item)this.f);
    this.b.append((Item)this.g);
    this.b.setDisplay(this.e);
    this.b.setListener(this);
    this.e.setCurrent((Displayable)this.b);
  }
  
  private final void f() {
    this.n = 2;
    this.b = new FormEx(this.a[2], new Command("Сохран.", 8, 0), new Command(this.a[5], 2, 0));
    this.f = new TextField("Вопрос", null, 50, 0);
    this.h = new TextField("Ответ", null, 50, 0);
    this.b.append((Item)this.f);
    this.b.append((Item)this.h);
    this.b.setDisplay(this.e);
    this.b.setListener(this);
    this.e.setCurrent((Displayable)this.b);
  }
  
  private final void g() {
    this.n = 3;
    this.b = new FormEx(this.a[3], null, new Command(this.a[5], 2, 0));
    if (this.p.size() < 1) {
      this.b.append("Словарь пуст", false);
    } else {
      for (byte b = 0; b < this.p.size(); b++) {
        String[] arrayOfString = this.p.elementAt(b);
        this.b.append(arrayOfString[0] + ">" + arrayOfString[1], (this.m <= b));
      } 
      this.b.setDisplay(this.e);
    } 
    this.b.setListener(this);
    this.e.setCurrent((Displayable)this.b);
  }
  
  private final void h() {
    Object object;
    if ((object = request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
    try {
      int i = dataInputStream.readUnsignedByte();
      byte b;
      for (b = 0; b < i; b++)
        this.l[b] = dataInputStream.readInt(); 
      i = dataInputStream.readUnsignedByte();
      for (b = 0; b < i; b++)
        this.k[b] = dataInputStream.readBoolean(); 
      i = dataInputStream.readInt();
      for (b = 0; b < i; b++)
        this.o.addElement(new String(dataInputStream.readUTF())); 
      i = dataInputStream.readInt();
      for (b = 0; b < i; b++) {
        String str1 = dataInputStream.readUTF();
        String str2 = dataInputStream.readUTF();
        this.p.addElement(new String[] { str1, str2 });
      } 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void i() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(this.l.length);
      int i;
      for (i = 0; i < this.l.length; i++)
        dataOutputStream.writeInt(this.l[i]); 
      dataOutputStream.writeByte(this.k.length);
      for (i = 0; i < this.k.length; i++)
        dataOutputStream.writeBoolean(this.k[i]); 
      dataOutputStream.writeInt(this.o.size());
      for (i = 0; i < this.o.size(); i++)
        dataOutputStream.writeUTF(this.o.elementAt(i)); 
      dataOutputStream.writeInt(this.p.size());
      for (i = this.m; i < this.p.size(); i++) {
        String[] arrayOfString = this.p.elementAt(i);
        dataOutputStream.writeUTF(arrayOfString[0]);
        dataOutputStream.writeUTF(arrayOfString[1]);
      } 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  private final void j() {
    String str;
    if ((str = Strings.readUTF("/txt/dict.txt")) == null)
      return; 
    String[] arrayOfString = Strings.explode(str, '\n');
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!arrayOfString[b].trim().startsWith("//")) {
        int i = arrayOfString[b].indexOf(">");
        String str1 = arrayOfString[b].substring(0, i);
        String str2 = arrayOfString[b].substring(i + 1);
        this.p.addElement(new String[] { str1, str2 });
        this.m++;
      } 
    } 
  }
  
  public final Vector a(String paramString) {
    Vector vector = new Vector();
    if (this.o.contains(paramString)) {
      vector.addElement(this.j);
    } else {
      vector.addElement(this.i);
    } 
    return vector;
  }
  
  public final Vector a() {
    Vector vector;
    (vector = new Vector()).addElement(this.j);
    vector.addElement(this.i);
    return vector;
  }
  
  private final void a(String paramString1, String paramString2) {
    String str;
    if (!this.k[2]) {
      String[] arrayOfString;
      if ((arrayOfString = a(this.p, paramString2)).length == 0)
        return; 
      str = arrayOfString[(new Random()).nextInt(arrayOfString.length)];
    } else {
      str = paramString2;
    } 
    int i = (this.l[0] + this.l[1]) * str.length();
    request(31, new Object[] { new Long(i), new Long(0L), paramString1, str }, null);
  }
  
  private final boolean b(String paramString) {
    C c;
    return ((c = (C)request(2, null, paramString)) != null);
  }
  
  private final String[] a(Vector paramVector, String paramString) {
    Vector vector = new Vector();
    for (byte b = 0; b < paramVector.size(); b++) {
      String[] arrayOfString1 = paramVector.elementAt(b);
      if (Strings.lowerCase(paramString).indexOf(Strings.lowerCase(arrayOfString1[0])) > -1)
        vector.addElement(arrayOfString1[1]); 
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgAnswerer.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */