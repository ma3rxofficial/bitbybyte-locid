package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

public class PlgMessage extends PI implements CommandListener {
  private List e;
  
  private Form f;
  
  private Command g = new Command("Back", 2, 2);
  
  private Command h = new Command("Изменить", 4, 1);
  
  private Command i = new Command("Сохранить", 4, 1);
  
  private Command j = new Command("В белый список", 8, 1);
  
  private Command k = new Command("Из белого списка", 8, 1);
  
  private Command l = new Command("Кнопка в КЛ", 8, 2);
  
  private Command m = new Command("Убрать Кнопка в КЛ", 8, 2);
  
  public Hashtable a = new Hashtable();
  
  public Vector b = new Vector();
  
  public Vector c = new Vector();
  
  public Vector d = new Vector();
  
  private String n;
  
  private ChoiceGroup o;
  
  private TextField p;
  
  private TextField q;
  
  private TextField r;
  
  private static final Boolean s = new Boolean(true);
  
  private static final Boolean t = new Boolean(false);
  
  private TextField u;
  
  private static final Integer v = new Integer(1);
  
  private static final Integer w = new Integer(-1);
  
  private boolean[] x = new boolean[] { true };
  
  private Display y;
  
  private String[] z;
  
  public PlgMessage() {
    this.b.addElement(this.j);
    this.b.addElement(this.k);
    this.c.addElement(this.j);
    this.d.addElement(this.k);
  }
  
  public String getName() {
    return "Персональные настройки";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    switch (paramInt) {
      case 2:
        a((Display)paramObject);
        return null;
      case 0:
        this.y = (Display)paramObject;
        b(request(7, null, null));
        return null;
      case 16:
        return this.b;
      case 17:
        return (paramObject instanceof i.C) ? (this.a.containsKey(paramArrayOfObject[4]) ? this.d : this.c) : null;
      case 18:
        return (paramObject != this.j && paramObject != this.k) ? null : a((String)paramArrayOfObject[4], (String)paramArrayOfObject[5], paramObject);
      case 19:
        return this.b;
      case 20:
        return (this.x[0] && paramArrayOfObject[0] != null) ? (a(paramArrayOfObject[0]) ? this.d : this.c) : null;
      case 21:
        return a((String)paramArrayOfObject[0], (String)paramArrayOfObject[1], paramObject);
      case 12:
        return a(paramArrayOfObject[0], 0, false) ? t : (a(paramArrayOfObject[0], 1, false) ? s : null);
      case 29:
        if (a(paramArrayOfObject[0], 5, false))
          return t; 
        if (a(paramArrayOfObject[0], 6, false)) {
          Account account = (Account)this.a.get(paramArrayOfObject[0]);
          paramArrayOfObject[1] = account.c[3];
          paramArrayOfObject[2] = account.c[4];
        } 
        return null;
      case 31:
        if (a(paramArrayOfObject[0], 9, false))
          return t; 
        if (a(paramArrayOfObject[0], 10, false)) {
          Account account = (Account)this.a.get(paramArrayOfObject[0]);
          paramArrayOfObject[1] = account.c[5];
        } 
        return null;
      case 8:
        if (a(paramArrayOfObject[0])) {
          Account account = (Account)this.a.get(paramArrayOfObject[0]);
          boolean bool1 = (((Integer)paramArrayOfObject[4]).intValue() == 1) ? true : false;
          boolean bool2 = bool1;
          boolean bool3 = (!account.c[2].equals("") && account.a[4]) ? true : false;
          if (account.a[2])
            bool2 = true; 
          if (account.a[3])
            bool2 = false; 
          if (!bool2)
            return t; 
          if (bool3) {
            request(12, null, account.c[2]);
            return t;
          } 
          return bool1 ? null : "500";
        } 
        return null;
      case 9:
        return null;
      case 23:
        if (a(paramArrayOfObject[0], 11, false)) {
          paramArrayOfObject[5] = v;
        } else if (a(paramArrayOfObject[0], 12, false)) {
          paramArrayOfObject[5] = w;
        } 
        return null;
      case 22:
        if (a(paramArrayOfObject[0], 11, false)) {
          paramArrayOfObject[3] = v;
        } else if (a(paramArrayOfObject[0], 12, false)) {
          paramArrayOfObject[3] = w;
        } 
        return null;
    } 
    return null;
  }
  
  private boolean a(Object paramObject, int paramInt, boolean paramBoolean) {
    return a(paramObject) ? (account = (Account)this.a.get(paramObject)).a[paramInt] : paramBoolean;
  }
  
  private boolean a(Object paramObject) {
    return this.a.containsKey(paramObject);
  }
  
  private Object a(String paramString1, String paramString2, Object paramObject) {
    PlgMessage plgMessage = this;
    if (paramString1 != null)
      if (paramObject == this.j) {
        Account account = new Account(this, paramString1, paramString2);
        this.a.put(paramString1, account);
      } else if (paramObject == this.k) {
        this.a.remove(paramString1);
      } else {
        plgMessage = null;
      }  
    if (plgMessage != null)
      a(); 
    return plgMessage;
  }
  
  private void b(Object paramObject) {
    if (paramObject != null && paramObject instanceof byte[]) {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
      try {
        int i = dataInputStream.readInt();
        int j;
        for (j = 0; j < i; j++) {
          Account account = new Account(this, dataInputStream);
          this.a.put(account.c[0], account);
        } 
        if (dataInputStream.available() > 0) {
          j = dataInputStream.readInt();
          for (byte b = 0; b < j; b++) {
            if (b < this.x.length) {
              this.x[b] = dataInputStream.readBoolean();
            } else {
              dataInputStream.readBoolean();
            } 
          } 
        } 
        return;
      } catch (IOException iOException) {}
    } 
  }
  
  private void a() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(this.a.size());
      String str = null;
      Enumeration enumeration = this.a.keys();
      while (enumeration.hasMoreElements()) {
        str = enumeration.nextElement();
        Account account;
        (account = (Account)this.a.get(str)).a(dataOutputStream);
      } 
      dataOutputStream.writeInt(1);
      dataOutputStream.writeBoolean(this.x[0]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramDisplayable == this.e) {
      if (paramCommand == this.g) {
        request(1, null, new Integer(0));
        this.e = null;
        this.z = null;
      } 
      if (paramCommand == this.k) {
        int i;
        if ((i = this.e.getSelectedIndex()) >= 0) {
          this.e.delete(i);
          a(this.z[i], (String)null, paramCommand);
          System.arraycopy(this.z, i + 1, this.z, i, this.z.length - i - 1);
        } 
        return;
      } 
      if (paramCommand == this.m) {
        this.x[0] = false;
        a();
        this.e.removeCommand(this.m);
        this.e.addCommand(this.l);
        return;
      } 
      if (paramCommand == this.l) {
        this.x[0] = true;
        a();
        this.e.addCommand(this.m);
        this.e.removeCommand(this.l);
        return;
      } 
      if (paramCommand == this.h || paramCommand == List.SELECT_COMMAND) {
        int i;
        if ((i = this.e.getSelectedIndex()) >= 0) {
          this.n = this.z[i];
          Account account = (Account)this.a.get(this.n);
          this.f = new Form("Изменить");
          this.f.append((Item)new StringItem("UIN:", this.n));
          this.f.append((Item)new StringItem("Name:", account.c[1]));
          this.f.addCommand(this.g);
          this.f.addCommand(this.i);
          this.o = new ChoiceGroup("Параметры:", 2);
          this.o.append("Вкл. звук всегда", null);
          this.o.setSelectedIndex(0, account.a[0]);
          this.o.append("ВЫкл. звук", null);
          this.o.setSelectedIndex(1, account.a[1]);
          this.o.append("Вкл. вибру всегда", null);
          this.o.setSelectedIndex(2, account.a[2]);
          this.o.append("Перс. вибра(заполнить ниже)", null);
          this.o.setSelectedIndex(3, account.a[4]);
          this.o.append("ВЫкл. вибру", null);
          this.o.setSelectedIndex(4, account.a[3]);
          this.o.append("Запретить чтение статуса", null);
          this.o.setSelectedIndex(5, account.a[9]);
          this.o.append("Персональный статус(заполнить ниже)", null);
          this.o.setSelectedIndex(6, account.a[10]);
          this.o.append("Запретить чтение xTraz", null);
          this.o.setSelectedIndex(7, account.a[5]);
          this.o.append("Персональный xTraz(заполнить ниже)", null);
          this.o.setSelectedIndex(8, account.a[6]);
          this.o.append("Хранить историю", null);
          this.o.setSelectedIndex(9, account.a[11]);
          this.o.append("Не хранить историю", null);
          this.o.setSelectedIndex(10, account.a[12]);
          String str;
          if ((str = account.c[2]) == null)
            str = ""; 
          this.r = new TextField("Вибра:", str, 100, 0);
          if ((str = account.c[5]) == null)
            str = ""; 
          this.u = new TextField("Статус:", str, 100, 0);
          if ((str = account.c[3]) == null)
            str = ""; 
          this.p = new TextField("Заголовок экстраз:", str, 100, 0);
          if ((str = account.c[4]) == null)
            str = ""; 
          this.q = new TextField("Текст экстраз:", str, 100, 0);
          this.f.append((Item)this.o);
          this.f.append((Item)this.r);
          this.f.append((Item)this.u);
          this.f.append((Item)this.p);
          this.f.append((Item)this.q);
          this.f.setCommandListener(this);
          this.y.setCurrent((Displayable)this.f);
        } 
        return;
      } 
    } else if (paramDisplayable == this.f) {
      if (paramCommand == this.i) {
        Account account;
        if ((account = (Account)this.a.get(this.n)) != null) {
          boolean bool = false;
          account.a[0] = this.o.isSelected(0);
          account.a[1] = this.o.isSelected(1);
          account.a[2] = this.o.isSelected(2);
          account.a[4] = this.o.isSelected(3);
          account.a[3] = this.o.isSelected(4);
          account.a[9] = this.o.isSelected(5);
          account.a[10] = this.o.isSelected(6);
          account.a[5] = this.o.isSelected(7);
          account.a[6] = this.o.isSelected(8);
          account.a[11] = this.o.isSelected(9);
          account.a[12] = this.o.isSelected(10);
          account.c[2] = this.r.getString();
          account.c[3] = this.p.getString();
          account.c[4] = this.q.getString();
          account.c[5] = this.u.getString();
          a();
          this.o = null;
          this.r = null;
          this.q = null;
          this.p = null;
          this.f = null;
        } 
        this.y.setCurrent((Displayable)this.e);
      } 
      if (paramCommand == this.g) {
        this.o = null;
        this.r = null;
        this.q = null;
        this.p = null;
        this.f = null;
        this.y.setCurrent((Displayable)this.e);
      } 
    } 
  }
  
  private void a(Display paramDisplay) {
    this.e = new List("Контакты для настройки", 3);
    this.e.addCommand(this.h);
    this.e.addCommand(this.k);
    this.e.addCommand(this.g);
    if (this.x[0]) {
      this.e.addCommand(this.m);
    } else {
      this.e.addCommand(this.l);
    } 
    this.e.setCommandListener(this);
    this.z = new String[this.a.size()];
    byte b = 0;
    Enumeration enumeration = this.a.keys();
    while (enumeration.hasMoreElements()) {
      Account account = (Account)this.a.get(enumeration.nextElement());
      this.z[b] = account.c[0];
      this.e.append(account.c[1], null);
      b++;
    } 
    paramDisplay.setCurrent((Displayable)this.e);
    this.y = paramDisplay;
  }
  
  class Account {
    public boolean[] a = new boolean[15];
    
    public int[] b = new int[2];
    
    public String[] c = new String[7];
    
    public final void a(DataOutputStream param1DataOutputStream) throws IOException {
      param1DataOutputStream.writeShort(this.a.length);
      byte b;
      for (b = 0; b < this.a.length; b++)
        param1DataOutputStream.writeBoolean(this.a[b]); 
      param1DataOutputStream.writeShort(this.b.length);
      for (b = 0; b < this.b.length; b++)
        param1DataOutputStream.writeInt(this.b[b]); 
      param1DataOutputStream.writeShort(this.c.length);
      for (b = 0; b < this.c.length; b++) {
        if (this.c[b] == null) {
          param1DataOutputStream.writeUTF("");
        } else {
          param1DataOutputStream.writeUTF(this.c[b]);
        } 
      } 
    }
    
    public Account(PlgMessage this$0, String param1String1, String param1String2) {
      for (byte b = 0; b < this.c.length; b++)
        this.c[b] = ""; 
      this.c[0] = param1String1;
      this.c[1] = param1String2;
    }
    
    public Account(PlgMessage this$0, DataInputStream param1DataInputStream) throws IOException {
      short s = param1DataInputStream.readShort();
      byte b;
      for (b = 0; b < s; b++) {
        if (b < this.a.length)
          this.a[b] = param1DataInputStream.readBoolean(); 
      } 
      s = param1DataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.b.length)
          this.b[b] = param1DataInputStream.readInt(); 
      } 
      for (b = 0; b < this.c.length; b++)
        this.c[b] = ""; 
      s = param1DataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.c.length)
          this.c[b] = param1DataInputStream.readUTF(); 
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgMessage.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */