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
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import ui.ChGroupEx;
import ui.Config;
import ui.FormEx;

public class PlgNotes extends PI implements CommandListener {
  public FormEx a;
  
  public Command b = new Command("Назад", 2, 2);
  
  public Command c = new Command("Сохран.", 8, 3);
  
  public Command d = new Command("В заметки", 8, 6);
  
  public ChGroupEx e;
  
  public boolean[] f = new boolean[] { true, false };
  
  public Display g;
  
  public TextBox h;
  
  public TextField i;
  
  public Vector j = new Vector();
  
  public int k = 0;
  
  public final String getName() {
    return "Заметки";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(11) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      c();
      this.g = (Display)paramObject;
      Config.set((int[])request(16, null, null));
    } else if (paramInt == 2) {
      a();
    } else {
      if (paramInt == 16 || paramInt == 17) {
        Vector vector;
        (vector = new Vector()).addElement(this.d);
        return vector;
      } 
      if (paramInt == 18) {
        if (paramObject == this.d) {
          this.j.addElement(a(this.f[0], this.f[1]) + ((String)paramArrayOfObject[2]).trim());
          d();
        } 
        return null;
      } 
      if (paramInt == 39)
        a(); 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.k == 2) {
      if (paramCommand == List.SELECT_COMMAND) {
        this.k = 5;
        this.h = new TextBox(null, this.j.elementAt(this.a.getCurrIndex()), 255, 0);
        this.h.addCommand(this.c);
        this.h.addCommand(this.b);
        this.h.setCommandListener(this);
        this.g.setCurrent((Displayable)this.h);
        return;
      } 
      a();
      return;
    } 
    if (this.k == 3) {
      if (paramCommand == List.SELECT_COMMAND) {
        this.j.removeElementAt(this.a.getCurrIndex());
        this.a.remove(this.a.getCurrIndex());
        d();
        if (this.j.size() == 0) {
          a();
          return;
        } 
      } else {
        a();
        return;
      } 
    } else {
      if (this.k == 1) {
        if (this.a.isLeft(paramCommand) && this.i.getString().length() > 0) {
          this.j.addElement(a(this.f[0], this.f[1]) + this.i.getString());
          d();
        } 
        a();
        return;
      } 
      if (this.k == 0) {
        if (paramCommand == List.SELECT_COMMAND) {
          switch (this.a.getCurrIndex()) {
            case 0:
              b(1);
              break;
            case 1:
              a(2);
              break;
            case 2:
              a(3);
              break;
            case 3:
              b();
              break;
          } 
          return;
        } 
        request(1, null, new Integer(0));
        this.a = null;
        return;
      } 
      if (this.k == 5) {
        if (paramCommand == this.c && this.h.getString().length() > 0) {
          this.j.setElementAt(this.h.getString(), this.a.getCurrIndex());
          d();
          a(2);
          return;
        } 
        a();
        return;
      } 
      if (this.k == 4) {
        if (this.a.isLeft(paramCommand)) {
          this.e.getSelectedFlags(this.f);
          d();
        } 
        a();
      } 
    } 
  }
  
  private final void a() {
    this.k = 0;
    this.a = new FormEx("Notes v0.15", null, new Command("Назад", 2, 0));
    this.a.append("Добавить", true);
    this.a.append("Изменить", true);
    this.a.append("Удалить", true);
    this.a.append("Настройки", true);
    this.a.setListener(this);
    this.g.setCurrent((Displayable)this.a);
  }
  
  private final void a(int paramInt) {
    this.k = paramInt;
    this.a = new FormEx((paramInt == 2) ? "Изменить" : "Удалить", null, new Command("Назад", 2, 0));
    if (this.j.size() == 0) {
      this.a.append("Заметок нет", false);
    } else {
      for (byte b = 0; b < this.j.size(); b++)
        this.a.append(this.j.elementAt(b), true); 
    } 
    this.a.setDisplay(this.g);
    this.a.setListener(this);
    this.g.setCurrent((Displayable)this.a);
  }
  
  private final void b() {
    this.k = 4;
    this.a = new FormEx("Настройки", new Command("Сохран.", 8, 0), new Command("Назад", 2, 0));
    this.e = new ChGroupEx("Настройки", 2, new String[] { "Добавлять время", "Добавлять дату" });
    this.e.setSelectedFlags(this.f);
    this.a.append((Item)this.e);
    this.a.setListener(this);
    this.g.setCurrent((Displayable)this.a);
  }
  
  private final void b(int paramInt) {
    this.k = 1;
    this.a = new FormEx("Настройки", new Command("Добав.", 8, 0), new Command("Назад", 2, 0));
    this.i = new TextField("Что добавить?", null, 255, 0);
    this.a.append((Item)this.i);
    this.a.setDisplay(this.g);
    this.a.setListener(this);
    this.g.setCurrent((Displayable)this.a);
  }
  
  private final void c() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    this.j.removeAllElements();
    try {
      int i = dataInputStream.readUnsignedByte();
      byte b;
      for (b = 0; b < i; b++)
        this.f[b] = dataInputStream.readBoolean(); 
      i = dataInputStream.readInt();
      for (b = 0; b < i; b++)
        this.j.addElement(dataInputStream.readUTF()); 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void d() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(this.f.length);
      byte b;
      for (b = 0; b < this.f.length; b++)
        dataOutputStream.writeBoolean(this.f[b]); 
      dataOutputStream.writeInt(this.j.size());
      for (b = 0; b < this.j.size(); b++)
        dataOutputStream.writeUTF(this.j.elementAt(b)); 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  private final String a(boolean paramBoolean1, boolean paramBoolean2) {
    if (!paramBoolean1 && !paramBoolean2)
      return ""; 
    String str = (String)request(23, new Object[] { new Boolean(false), new Boolean(false) }, null);
    StringBuffer stringBuffer = new StringBuffer();
    if (paramBoolean1) {
      stringBuffer.append(str.substring(11, 16));
      if (!paramBoolean2) {
        stringBuffer.append(": ");
      } else {
        stringBuffer.append(", ");
      } 
    } 
    if (paramBoolean2)
      stringBuffer.append(str.substring(0, 5)).append(": "); 
    return stringBuffer.toString();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgNotes.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */