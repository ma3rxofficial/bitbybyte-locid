package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;

public class PlgConf extends PI implements CommandListener {
  public Display a;
  
  public List b;
  
  public List c;
  
  public Form d;
  
  public TextField e;
  
  public TextField f;
  
  public Hashtable g = new Hashtable();
  
  public Command h = new Command("Добав.", 4, 1);
  
  public Command i = new Command("Назад", 2, 2);
  
  public String j;
  
  public String k;
  
  public final String getName() {
    return "Конференция";
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      d();
      this.a = (Display)paramObject;
    } else if (paramInt == 2) {
      a();
    } else if (paramInt == 23) {
      String str1 = (String)paramArrayOfObject[0];
      String str2;
      if ((str2 = (String)paramArrayOfObject[4]).startsWith("!")) {
        a(str2, str1);
        return new Boolean(false);
      } 
      if (this.g.containsKey(str1)) {
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
      this.g.put(str1, str2);
    } else if (paramString1.startsWith("!у")) {
      this.g.remove(paramString1.substring(3));
    } else if (paramString1.startsWith("!в")) {
      this.g.remove(paramString2);
    } 
    e();
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramDisplayable == this.b) {
      if (paramCommand == this.i) {
        if (this.c != null) {
          this.c.deleteAll();
          this.c = null;
        } 
        this.b.deleteAll();
        this.b = null;
        request(1, null, new Integer(0));
        return;
      } 
      switch (this.b.getSelectedIndex()) {
        case 0:
          c();
          break;
        case 1:
          if (this.g.isEmpty()) {
            Alert alert;
            (alert = new Alert(null, "Номеров нет", null, AlertType.WARNING)).setTimeout(-2);
            this.a.setCurrent((Displayable)alert);
            break;
          } 
          b();
          break;
      } 
      return;
    } 
    if (paramDisplayable == this.c) {
      if (paramCommand == List.SELECT_COMMAND) {
        int i = this.c.getSelectedIndex();
        String str = this.c.getString(i);
        this.g.remove(str);
        this.c.delete(i);
        e();
        if (this.g.size() < 0)
          a(); 
        return;
      } 
      a();
      return;
    } 
    if (paramDisplayable == this.d) {
      if (paramCommand == this.h) {
        String str1 = this.e.getString();
        String str2 = this.f.getString();
        if (str1.length() > 0 && str2.length() > 0) {
          this.g.put(str1, str2);
          if (this.c != null)
            this.c.append(str1, null); 
          e();
        } 
      } 
      a();
    } 
  }
  
  private final void b(String paramString1, String paramString2) {
    String str = (String)this.g.get(paramString1);
    Enumeration enumeration = this.g.keys();
    while (enumeration.hasMoreElements()) {
      String str1;
      if (!(str1 = enumeration.nextElement()).equals(paramString1)) {
        this.j = str1;
        this.k = str + ": " + paramString2;
        request(8, (Object[])new String[] { this.j, this.k }, null);
      } 
    } 
  }
  
  private final void a() {
    if (this.b == null) {
      this.b = new List(null, 3, new String[] { "Добавить номер", "Удалить номер" }, null);
      this.b.addCommand(this.i);
    } 
    this.b.setCommandListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void b() {
    if (this.c == null) {
      this.c = new List(null, 3);
      Enumeration enumeration = this.g.keys();
      while (enumeration.hasMoreElements())
        this.c.append(enumeration.nextElement(), null); 
      this.c.addCommand(this.i);
    } 
    this.c.setCommandListener(this);
    this.a.setCurrent((Displayable)this.c);
  }
  
  private final void c() {
    this.d = new Form(null);
    this.e = new TextField("Номер", null, 12, 2);
    this.f = new TextField("Ник", null, 50, 0);
    this.d.addCommand(this.h);
    this.d.addCommand(this.i);
    this.d.append((Item)this.e);
    this.d.append((Item)this.f);
    this.d.setCommandListener(this);
    this.a.setCurrent((Displayable)this.d);
  }
  
  private final void d() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      int i = dataInputStream.readInt();
      for (byte b = 0; b < i; b++) {
        String str1 = dataInputStream.readUTF();
        String str2 = dataInputStream.readUTF();
        this.g.put(str1, str2);
      } 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void e() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(this.g.size());
      Enumeration enumeration = this.g.keys();
      while (enumeration.hasMoreElements()) {
        String str1 = enumeration.nextElement();
        String str2 = (String)this.g.get(str1);
        dataOutputStream.writeUTF(str1);
        dataOutputStream.writeUTF(str2);
      } 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgConf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */