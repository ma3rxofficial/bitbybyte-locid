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

public class PlgPers extends PI implements CommandListener {
  private List d;
  
  private Form e;
  
  private Command f = new Command("Back", 2, 2);
  
  private Command g = new Command("Изменить", 4, 1);
  
  private Command h = new Command("Сохранить", 4, 1);
  
  private Command i = new Command("Перс. настройки", 8, 1);
  
  private Command j = new Command("Удалить настроки", 8, 1);
  
  private Command k = new Command("Кнопка в КЛ", 8, 2);
  
  private Command l = new Command("Убрать Кнопка в КЛ", 8, 2);
  
  public Hashtable a = new Hashtable();
  
  public Vector b = new Vector();
  
  private String m;
  
  private ChoiceGroup n;
  
  private TextField o;
  
  private TextField p;
  
  private TextField q;
  
  private static final Boolean r = new Boolean(true);
  
  private static final Boolean s = new Boolean(false);
  
  private TextField t;
  
  private static final Integer u = new Integer(1);
  
  private static final Integer v = new Integer(-1);
  
  private boolean[] w = new boolean[] { true };
  
  private Display x;
  
  private String[] y;
  
  public String c;
  
  public PlgPers() {
    this.b.addElement(this.i);
    this.c = null;
  }
  
  public String getName() {
    return "Персональные настройки";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    switch (paramInt) {
      case 2:
        a((Display)paramObject, null);
        return null;
      case 0:
        this.x = (Display)paramObject;
        b(request(7, null, null));
        return null;
      case 16:
        return this.b;
      case 17:
        return (paramObject instanceof i.C) ? this.b : null;
      case 18:
        return (paramObject != this.i) ? null : a((String)paramArrayOfObject[4], (String)paramArrayOfObject[5], paramObject);
      case 19:
        return this.b;
      case 20:
        return (this.w[0] && paramArrayOfObject[0] != null) ? this.b : null;
      case 21:
        return a((String)paramArrayOfObject[0], (String)paramArrayOfObject[1], paramObject);
      case 12:
        return a(paramArrayOfObject[0], 0, false) ? s : (a(paramArrayOfObject[0], 1, false) ? r : null);
      case 29:
        if (a(paramArrayOfObject[0], 5, false))
          return s; 
        if (a(paramArrayOfObject[0], 6, false)) {
          PAccount pAccount = (PAccount)this.a.get(paramArrayOfObject[0]);
          paramArrayOfObject[1] = pAccount.c[3];
          paramArrayOfObject[2] = pAccount.c[4];
        } 
        return null;
      case 31:
        if (a(paramArrayOfObject[0], 9, false))
          return s; 
        if (a(paramArrayOfObject[0], 10, false)) {
          PAccount pAccount = (PAccount)this.a.get(paramArrayOfObject[0]);
          paramArrayOfObject[1] = pAccount.c[5];
        } 
        return null;
      case 8:
        if (a(paramArrayOfObject[0])) {
          PAccount pAccount = (PAccount)this.a.get(paramArrayOfObject[0]);
          boolean bool1 = (((Integer)paramArrayOfObject[4]).intValue() == 1) ? true : false;
          boolean bool2 = bool1;
          boolean bool3 = (!pAccount.c[2].equals("") && pAccount.a[4]) ? true : false;
          if (pAccount.a[2])
            bool2 = true; 
          if (pAccount.a[3])
            bool2 = false; 
          if (!bool2)
            return s; 
          if (bool3) {
            request(12, null, pAccount.c[2]);
            return s;
          } 
          return bool1 ? null : "500";
        } 
        return null;
      case 9:
        return null;
      case 23:
        if (a(paramArrayOfObject[0], 11, false)) {
          paramArrayOfObject[5] = u;
        } else if (a(paramArrayOfObject[0], 12, false)) {
          paramArrayOfObject[5] = v;
        } 
        return null;
      case 22:
        if (a(paramArrayOfObject[0], 11, false)) {
          paramArrayOfObject[3] = u;
        } else if (a(paramArrayOfObject[0], 12, false)) {
          paramArrayOfObject[3] = v;
        } 
        return null;
    } 
    return null;
  }
  
  private boolean a(Object paramObject, int paramInt, boolean paramBoolean) {
    return a(paramObject) ? (pAccount = (PAccount)this.a.get(paramObject)).a[paramInt] : paramBoolean;
  }
  
  private boolean a(Object paramObject) {
    return this.a.containsKey(paramObject);
  }
  
  private Object a(String paramString1, String paramString2, Object paramObject) {
    PlgPers plgPers = this;
    if (paramString1 != null)
      if (paramObject == this.i) {
        if (this.a.containsKey(paramString1)) {
          this.a.get(paramString1);
          Object object = null;
        } else {
          PAccount pAccount = new PAccount(this, paramString1, paramString2);
          this.a.put(paramString1, pAccount);
        } 
        a(this.x, paramString1);
      } else if (paramObject == this.j) {
        this.a.remove(paramString1);
      } else {
        plgPers = null;
      }  
    if (plgPers != null)
      a(); 
    return plgPers;
  }
  
  private void b(Object paramObject) {
    if (paramObject != null && paramObject instanceof byte[]) {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
      try {
        int i = dataInputStream.readInt();
        int j;
        for (j = 0; j < i; j++) {
          PAccount pAccount = new PAccount(this, dataInputStream);
          this.a.put(pAccount.c[0], pAccount);
        } 
        if (dataInputStream.available() > 0) {
          j = dataInputStream.readInt();
          for (byte b = 0; b < j; b++) {
            if (b < this.w.length) {
              this.w[b] = dataInputStream.readBoolean();
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
        PAccount pAccount;
        (pAccount = (PAccount)this.a.get(str)).a(dataOutputStream);
      } 
      dataOutputStream.writeInt(1);
      dataOutputStream.writeBoolean(this.w[0]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramDisplayable == this.d) {
      if (paramCommand == this.f) {
        if (this.c == null) {
          request(1, null, new Integer(0));
        } else {
          request(1, null, new Integer(1));
        } 
        this.d = null;
        this.y = null;
      } 
      if (paramCommand == this.j) {
        int i;
        if ((i = this.d.getSelectedIndex()) >= 0) {
          this.d.delete(i);
          a(this.y[i], (String)null, paramCommand);
          System.arraycopy(this.y, i + 1, this.y, i, this.y.length - i - 1);
        } 
        return;
      } 
      if (paramCommand == this.l) {
        this.w[0] = false;
        a();
        this.d.removeCommand(this.l);
        this.d.addCommand(this.k);
        return;
      } 
      if (paramCommand == this.k) {
        this.w[0] = true;
        a();
        this.d.addCommand(this.l);
        this.d.removeCommand(this.k);
        return;
      } 
      if (paramCommand == this.g || paramCommand == List.SELECT_COMMAND) {
        int i;
        if ((i = this.d.getSelectedIndex()) >= 0) {
          this.m = this.y[i];
          PAccount pAccount = (PAccount)this.a.get(this.m);
          this.e = new Form("Изменить");
          this.e.append((Item)new StringItem("UIN:", this.m));
          this.e.append((Item)new StringItem("Name:", pAccount.c[1]));
          this.e.addCommand(this.f);
          this.e.addCommand(this.h);
          this.n = new ChoiceGroup("Параметры:", 2);
          this.n.append("Вкл. звук всегда", null);
          this.n.setSelectedIndex(0, pAccount.a[0]);
          this.n.append("ВЫкл. звук", null);
          this.n.setSelectedIndex(1, pAccount.a[1]);
          this.n.append("Вкл. вибру всегда", null);
          this.n.setSelectedIndex(2, pAccount.a[2]);
          this.n.append("Перс. вибра(заполнить ниже)", null);
          this.n.setSelectedIndex(3, pAccount.a[4]);
          this.n.append("ВЫкл. вибру", null);
          this.n.setSelectedIndex(4, pAccount.a[3]);
          this.n.append("Запретить чтение статуса", null);
          this.n.setSelectedIndex(5, pAccount.a[9]);
          this.n.append("Персональный статус(заполнить ниже)", null);
          this.n.setSelectedIndex(6, pAccount.a[10]);
          this.n.append("Запретить чтение xTraz", null);
          this.n.setSelectedIndex(7, pAccount.a[5]);
          this.n.append("Персональный xTraz(заполнить ниже)", null);
          this.n.setSelectedIndex(8, pAccount.a[6]);
          this.n.append("Хранить историю", null);
          this.n.setSelectedIndex(9, pAccount.a[11]);
          this.n.append("Не хранить историю", null);
          this.n.setSelectedIndex(10, pAccount.a[12]);
          String str;
          if ((str = pAccount.c[2]) == null)
            str = ""; 
          this.q = new TextField("Вибра:", str, 100, 0);
          if ((str = pAccount.c[5]) == null)
            str = ""; 
          this.t = new TextField("Статус:", str, 100, 0);
          if ((str = pAccount.c[3]) == null)
            str = ""; 
          this.o = new TextField("Заголовок экстраз:", str, 100, 0);
          if ((str = pAccount.c[4]) == null)
            str = ""; 
          this.p = new TextField("Текст экстраз:", str, 100, 0);
          this.e.append((Item)this.n);
          this.e.append((Item)this.q);
          this.e.append((Item)this.t);
          this.e.append((Item)this.o);
          this.e.append((Item)this.p);
          this.e.setCommandListener(this);
          this.x.setCurrent((Displayable)this.e);
        } 
        return;
      } 
    } else if (paramDisplayable == this.e) {
      if (paramCommand == this.h) {
        PAccount pAccount;
        if ((pAccount = (PAccount)this.a.get(this.m)) != null) {
          boolean bool = false;
          pAccount.a[0] = this.n.isSelected(0);
          pAccount.a[1] = this.n.isSelected(1);
          pAccount.a[2] = this.n.isSelected(2);
          pAccount.a[4] = this.n.isSelected(3);
          pAccount.a[3] = this.n.isSelected(4);
          pAccount.a[9] = this.n.isSelected(5);
          pAccount.a[10] = this.n.isSelected(6);
          pAccount.a[5] = this.n.isSelected(7);
          pAccount.a[6] = this.n.isSelected(8);
          pAccount.a[11] = this.n.isSelected(9);
          pAccount.a[12] = this.n.isSelected(10);
          pAccount.c[2] = this.q.getString();
          pAccount.c[3] = this.o.getString();
          pAccount.c[4] = this.p.getString();
          pAccount.c[5] = this.t.getString();
          a();
          this.n = null;
          this.q = null;
          this.p = null;
          this.o = null;
          this.e = null;
        } 
        this.x.setCurrent((Displayable)this.d);
      } 
      if (paramCommand == this.f) {
        this.n = null;
        this.q = null;
        this.p = null;
        this.o = null;
        this.e = null;
        this.x.setCurrent((Displayable)this.d);
      } 
    } 
  }
  
  private void a(Display paramDisplay, String paramString) {
    this.c = paramString;
    this.d = new List("Контакты для настройки", 3);
    this.d.addCommand(this.g);
    this.d.addCommand(this.j);
    this.d.addCommand(this.f);
    if (this.w[0]) {
      this.d.addCommand(this.l);
    } else {
      this.d.addCommand(this.k);
    } 
    this.d.setCommandListener(this);
    this.y = new String[this.a.size()];
    byte b = 0;
    byte b1 = -1;
    Enumeration enumeration = this.a.keys();
    while (enumeration.hasMoreElements()) {
      PAccount pAccount = (PAccount)this.a.get(enumeration.nextElement());
      this.y[b] = pAccount.c[0];
      if (paramString != null && pAccount.c[0].equals(paramString))
        b1 = b; 
      this.d.append(pAccount.c[1], null);
      b++;
    } 
    if (b1 != -1)
      this.d.setSelectedIndex(b1, true); 
    paramDisplay.setCurrent((Displayable)this.d);
    this.x = paramDisplay;
  }
  
  class PAccount {
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
    
    public PAccount(PlgPers this$0, String param1String1, String param1String2) {
      for (byte b = 0; b < this.c.length; b++)
        this.c[b] = ""; 
      this.c[0] = param1String1;
      this.c[1] = param1String2;
    }
    
    public PAccount(PlgPers this$0, DataInputStream param1DataInputStream) throws IOException {
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


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgPers.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */