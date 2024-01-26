package p;

import i.C;
import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
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

public class PlgConference extends PI implements CommandListener {
  public Display a;
  
  public FormEx b;
  
  public TextField c;
  
  public TextField d;
  
  public Hashtable e = new Hashtable();
  
  public String f;
  
  public String g;
  
  public ChGroupEx h;
  
  public C[] i;
  
  public int j = 0;
  
  public final String getName() {
    return "Конференция";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(1) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      e();
      this.a = (Display)paramObject;
      Config.set((int[])request(16, null, null));
    } else if (paramInt == 2) {
      a();
    } else if (paramInt == 23) {
      String str1 = (String)paramArrayOfObject[0];
      String str2;
      if ((str2 = (String)paramArrayOfObject[4]).startsWith("!")) {
        a(str2, str1);
        return new Boolean(false);
      } 
      if (this.e.containsKey(str1)) {
        b(str1, str2);
        return new Boolean(false);
      } 
    } 
    return null;
  }
  
  private final void a(String paramString1, String paramString2) {
    if (paramString1.startsWith("!д")) {
      int i = (paramString1 = paramString1.substring(3)).indexOf(".");
      String str1 = paramString1.substring(0, i);
      String str2 = paramString1.substring(i + 1);
      this.e.put(str1, str2);
    } else if (paramString1.startsWith("!у")) {
      this.e.remove(paramString1.substring(3));
    } else if (paramString1.startsWith("!в")) {
      this.e.remove(paramString2);
    } 
    f();
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.j == 0) {
      if (this.b.isRight(paramCommand)) {
        request(1, null, new Integer(0));
        this.b = null;
        return;
      } 
      if (paramCommand == List.SELECT_COMMAND) {
        switch (this.b.getCurrIndex()) {
          case 0:
            d();
            break;
          case 1:
            b();
            break;
          case 2:
            c();
            break;
        } 
        return;
      } 
    } else {
      if (this.j == 2) {
        if (paramCommand == List.SELECT_COMMAND) {
          int i = this.b.getCurrIndex();
          String str = (this.b.getItem(this.b.getCurrIndex())).text;
          this.e.remove(str);
          this.b.remove(i);
          f();
          if (this.e.size() == 0)
            a(); 
          return;
        } 
        a();
        return;
      } 
      if (this.j == 3) {
        if (this.b.isLeft(paramCommand)) {
          for (byte b = 0; b < this.h.size(); b++) {
            if (this.h.isSelected(b))
              this.e.put(this.i[b].getUinString(), this.i[b].getStringValue(1)); 
          } 
          f();
        } 
        a();
        return;
      } 
      if (this.j == 1) {
        if (this.b.isLeft(paramCommand)) {
          String str1 = this.c.getString();
          String str2 = this.d.getString();
          if (str1.length() > 0 && str2.length() > 0) {
            this.e.put(str1, str2);
            f();
          } 
        } 
        a();
      } 
    } 
  }
  
  private final void b(String paramString1, String paramString2) {
    String str = (String)this.e.get(paramString1);
    Enumeration enumeration = this.e.keys();
    while (enumeration.hasMoreElements()) {
      String str1;
      if (!(str1 = enumeration.nextElement()).equals(paramString1)) {
        this.f = str1;
        this.g = str + ": " + paramString2;
        request(8, (Object[])new String[] { this.f, this.g }, null);
      } 
    } 
  }
  
  private final void a() {
    this.j = 0;
    this.b = new FormEx("Conference v0.2", null, new Command("Назад", 2, 0));
    this.b.append("Добавить UIN", true);
    this.b.append("Добавить из КЛ", true);
    this.b.append("Удалить UIN", true);
    this.b.setListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void b() {
    this.j = 3;
    this.b = new FormEx("Добавить из КЛ", new Command("Добав.", 8, 0), new Command("Назад", 2, 0));
    this.h = new ChGroupEx(null, 2);
    this.i = (C[])request(3, null, null);
    for (byte b = 0; b < this.i.length; b++)
      this.h.append(this.i[b].getUinString(), null); 
    this.b.append((Item)this.h);
    this.b.setListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void c() {
    this.j = 2;
    this.b = new FormEx("Удалить UIN", null, new Command("Назад", 2, 0));
    if (this.e.isEmpty()) {
      this.b.append("Номеров нет", false);
    } else {
      Enumeration enumeration = this.e.keys();
      while (enumeration.hasMoreElements()) {
        String str = enumeration.nextElement();
        this.b.append(str + ", " + this.e.get(str), true);
      } 
    } 
    this.b.setListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void d() {
    this.j = 2;
    this.b = new FormEx("Добавить UIN", new Command("Добав.", 8, 0), new Command("Назад", 2, 0));
    this.c = new TextField("UIN", null, 255, 0);
    this.d = new TextField("Ник", null, 255, 0);
    this.b.append((Item)this.c);
    this.b.append((Item)this.d);
    this.b.setDisplay(this.a);
    this.b.setListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void e() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      int i = dataInputStream.readInt();
      for (byte b = 0; b < i; b++) {
        String str1 = dataInputStream.readUTF();
        String str2 = dataInputStream.readUTF();
        this.e.put(str1, str2);
      } 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void f() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(this.e.size());
      Enumeration enumeration = this.e.keys();
      while (enumeration.hasMoreElements()) {
        String str1 = enumeration.nextElement();
        String str2 = (String)this.e.get(str1);
        dataOutputStream.writeUTF(str1);
        dataOutputStream.writeUTF(str2);
      } 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgConference.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */