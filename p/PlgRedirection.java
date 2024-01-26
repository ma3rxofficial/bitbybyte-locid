package p;

import i.I;
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
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;

public class PlgRedirection extends PI implements CommandListener {
  public Hashtable a = new Hashtable();
  
  public Form b;
  
  public TextField c;
  
  public TextField d;
  
  public List e;
  
  public List f;
  
  public Display g;
  
  public ChoiceGroup h;
  
  public Command i = new Command("Добав.", 4, 1);
  
  public Command j = new Command("Назад", 2, 2);
  
  public Command k = new Command("Сохран.", 4, 1);
  
  public boolean[] l = new boolean[] { true };
  
  public final String getName() {
    return "Переадресация";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(0)), new Integer(14) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      e();
      this.g = (Display)paramObject;
    } else if (paramInt == 2) {
      a();
    } else if (paramInt == 23) {
      if (this.l[0]) {
        String str = (String)paramArrayOfObject[4];
        if (this.a.containsKey("all")) {
          request(8, (Object[])new String[] { (String)this.a.get("all"), str }, null);
        } else if (this.a.containsKey(paramArrayOfObject[0])) {
          request(8, (Object[])new String[] { (String)this.a.get(paramArrayOfObject[0]), str }, null);
        } 
      } 
    } else if (paramInt == 39) {
      this.l[0] = !this.l[0];
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramDisplayable == this.e) {
      if (paramCommand == this.j) {
        if (this.f != null) {
          this.f.deleteAll();
          this.f = null;
        } 
        this.e.deleteAll();
        this.e = null;
        request(1, null, new Integer(0));
        return;
      } 
      switch (this.e.getSelectedIndex()) {
        case 0:
          b();
          break;
        case 1:
          c();
          break;
        case 2:
          d();
          break;
      } 
      return;
    } 
    if (paramDisplayable == this.b) {
      if (paramCommand == this.i) {
        String str1 = this.c.getString();
        String str2 = this.d.getString();
        if (str1.length() == 0)
          str1 = "all"; 
        this.a.put(str1, str2);
        if (this.f != null)
          this.f.append(str1 + ">>" + str2, null); 
        f();
      } else if (paramCommand == this.k) {
        this.l[0] = this.h.isSelected(0);
        f();
      } 
      this.b.deleteAll();
      this.b = null;
      a();
      return;
    } 
    if (paramDisplayable == this.f) {
      if (paramCommand == List.SELECT_COMMAND) {
        int i = this.f.getSelectedIndex();
        String str = this.f.getString(i);
        this.a.remove(str.substring(0, str.indexOf(">>")));
        this.f.delete(i);
        f();
        if (this.a.isEmpty())
          a(); 
        return;
      } 
      a();
    } 
  }
  
  private final void a() {
    if (this.e == null) {
      this.e = new List("Redirection v0.11", 3, new String[] { "Добавить", "Удалить", "Настройки" }, null);
      this.e.addCommand(this.j);
    } 
    this.e.setCommandListener(this);
    this.g.setCurrent((Displayable)this.e);
  }
  
  private final void b() {
    this.b = new Form(null);
    this.c = new TextField("1-ый номер", null, 12, 2);
    this.d = new TextField("2-ой номер", null, 12, 2);
    this.b.append((Item)this.c);
    this.b.append((Item)this.d);
    this.b.addCommand(this.j);
    this.b.addCommand(this.i);
    this.b.setCommandListener(this);
    this.g.setCurrent((Displayable)this.b);
  }
  
  private final void c() {
    if (this.a.isEmpty()) {
      this.g.setCurrent((Displayable)new Alert(null, "Номеров нет", null, AlertType.WARNING));
      return;
    } 
    if (this.f == null) {
      this.f = new List(null, 3);
      this.f.addCommand(this.j);
      Enumeration enumeration = this.a.keys();
      while (enumeration.hasMoreElements()) {
        String str = enumeration.nextElement();
        str = str + ">>" + (String)this.a.get(str);
        this.f.append(str, null);
      } 
    } 
    this.f.setCommandListener(this);
    this.g.setCurrent((Displayable)this.f);
  }
  
  private final void d() {
    this.b = new Form(null);
    this.h = new ChoiceGroup(null, 2, new String[] { "Включить плагин" }, null);
    this.h.setSelectedIndex(0, this.l[0]);
    this.b.append((Item)this.h);
    this.b.addCommand(this.j);
    this.b.addCommand(this.k);
    this.b.setCommandListener(this);
    this.g.setCurrent((Displayable)this.b);
  }
  
  private final void e() {
    Object object;
    if ((object = request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
    try {
      int i = dataInputStream.readUnsignedByte();
      byte b;
      for (b = 0; b < i; b++)
        this.l[b] = dataInputStream.readBoolean(); 
      i = dataInputStream.readInt();
      for (b = 0; b < i; b++) {
        String str1 = dataInputStream.readUTF();
        String str2 = dataInputStream.readUTF();
        this.a.put(str1, str2);
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
      dataOutputStream.writeByte(this.l.length);
      for (byte b = 0; b < this.l.length; b++)
        dataOutputStream.writeBoolean(this.l[b]); 
      dataOutputStream.writeInt(this.a.size());
      Enumeration enumeration = this.a.keys();
      while (enumeration.hasMoreElements()) {
        String str = enumeration.nextElement();
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeUTF((String)this.a.get(str));
      } 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgRedirection.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */