package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
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

public class PlgAutoAnswer extends PI implements CommandListener {
  private List g;
  
  private Form h;
  
  private Command i = new Command("Back", 2, 2);
  
  private Command j = new Command("Изменить", 4, 1);
  
  private Command k = new Command("Сохранить", 4, 1);
  
  private Command l = new Command("В список авто ответов", 8, 1);
  
  private Command m = new Command("Из авто списка", 8, 1);
  
  private Command n = new Command("Кнопка в КЛ", 8, 2);
  
  private Command o = new Command("Убрать Кнопка в КЛ", 8, 2);
  
  public Hashtable a = new Hashtable();
  
  public Vector b = new Vector();
  
  public Vector c = new Vector();
  
  public Vector d = new Vector();
  
  private String p;
  
  private ChoiceGroup q;
  
  private TextField r;
  
  private boolean[] s = new boolean[] { true };
  
  public Random e;
  
  public static String f;
  
  private Display t;
  
  private String[] u;
  
  public PlgAutoAnswer() {
    this.b.addElement(this.l);
    this.b.addElement(this.m);
    this.c.addElement(this.l);
    this.d.addElement(this.m);
    this.e = new Random();
  }
  
  private static String[] a(String paramString1, String paramString2) {
    if (paramString1.indexOf(paramString2) < 0)
      return new String[] { paramString1 }; 
    Vector vector = new Vector();
    int i = 0;
    int j;
    for (j = paramString1.indexOf(paramString2, 0); j >= 0; j = paramString1.indexOf(paramString2, i)) {
      vector.addElement(paramString1.substring(i, j));
      i = j + paramString2.length();
    } 
    if (i == paramString1.length()) {
      vector.addElement("");
    } else {
      vector.addElement(paramString1.substring(i, paramString1.length()));
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  public String getName() {
    return "Авто чат";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    Account account;
    switch (paramInt) {
      case 2:
        a((Display)paramObject);
        return null;
      case 0:
        this.t = (Display)paramObject;
        b(request(7, null, null));
        return null;
      case 16:
        return this.b;
      case 17:
        return (paramObject instanceof i.C) ? (this.a.containsKey(paramArrayOfObject[4]) ? this.d : this.c) : null;
      case 18:
        return (paramObject != this.l && paramObject != this.m) ? null : a((String)paramArrayOfObject[4], (String)paramArrayOfObject[5], paramObject);
      case 19:
        return this.b;
      case 20:
        return (this.s[0] && paramArrayOfObject[0] != null) ? (a(paramArrayOfObject[0]) ? this.d : this.c) : null;
      case 21:
        return a((String)paramArrayOfObject[0], (String)paramArrayOfObject[1], paramObject);
      case 23:
        if (a(paramArrayOfObject[0]) && (account = (Account)this.a.get(paramArrayOfObject[0])).c[0]);
        return null;
    } 
    return null;
  }
  
  private boolean a(Object paramObject) {
    return this.a.containsKey(paramObject);
  }
  
  private Object a(String paramString1, String paramString2, Object paramObject) {
    PlgAutoAnswer plgAutoAnswer = this;
    if (paramString1 != null)
      if (paramObject == this.l) {
        Account account = new Account(this, paramString1, paramString2);
        this.a.put(paramString1, account);
      } else if (paramObject == this.m) {
        this.a.remove(paramString1);
      } else {
        plgAutoAnswer = null;
      }  
    if (plgAutoAnswer != null)
      a(); 
    return plgAutoAnswer;
  }
  
  private void b(Object paramObject) {
    try {
      InputStream inputStream;
      byte[] arrayOfByte = new byte[(inputStream = (new Object()).getClass().getResourceAsStream("/achat.txt")).available()];
      inputStream.read(arrayOfByte);
      f = (String)request(28, null, arrayOfByte);
      inputStream.available();
      Object object = null;
    } catch (Exception exception) {
      f = "Привет!\nДа нормально дела, а у тебя?\nПонятно...\nКак учёба твоя?\n-\nДаже незнаю\nНадо подумать\nА ты что думаешь по этому поводу?\n;-)\n";
    } 
    if (paramObject != null && paramObject instanceof byte[]) {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
      try {
        int i = dataInputStream.readInt();
        int j;
        for (j = 0; j < i; j++) {
          Account account = new Account(this, dataInputStream);
          this.a.put(account.e[0], account);
        } 
        if (dataInputStream.available() > 0) {
          j = dataInputStream.readInt();
          for (byte b = 0; b < j; b++) {
            if (b < this.s.length) {
              this.s[b] = dataInputStream.readBoolean();
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
      dataOutputStream.writeBoolean(this.s[0]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramDisplayable == this.g) {
      if (paramCommand == this.i) {
        request(1, null, new Integer(0));
        this.g = null;
        this.u = null;
      } 
      if (paramCommand == this.m) {
        int i;
        if ((i = this.g.getSelectedIndex()) >= 0) {
          this.g.delete(i);
          a(this.u[i], (String)null, paramCommand);
          System.arraycopy(this.u, i + 1, this.u, i, this.u.length - i - 1);
        } 
        return;
      } 
      if (paramCommand == this.o) {
        this.s[0] = false;
        a();
        this.g.removeCommand(this.o);
        this.g.addCommand(this.n);
        return;
      } 
      if (paramCommand == this.n) {
        this.s[0] = true;
        a();
        this.g.addCommand(this.o);
        this.g.removeCommand(this.n);
        return;
      } 
      if (paramCommand == this.j || paramCommand == List.SELECT_COMMAND) {
        int i;
        if ((i = this.g.getSelectedIndex()) >= 0) {
          this.p = this.u[i];
          Account account = (Account)this.a.get(this.p);
          this.h = new Form("Изменить");
          this.h.append((Item)new StringItem("UIN:", this.p));
          this.h.append((Item)new StringItem("Name:", account.e[1]));
          this.h.addCommand(this.i);
          this.h.addCommand(this.k);
          this.q = new ChoiceGroup("Параметры:", 2);
          this.q.append("Вкл. авто ответ.", null);
          this.q.setSelectedIndex(0, account.c[0]);
          this.q.append("Авто ответ из списка фраз", null);
          this.q.setSelectedIndex(1, account.c[1]);
          this.q.append("+ по порядку", null);
          this.q.setSelectedIndex(2, account.c[2]);
          this.q.append("Обучаться по чату(в разработке)", null);
          this.q.setSelectedIndex(3, account.c[3]);
          String str;
          if ((str = account.e[2]) == null)
            str = ""; 
          this.r = new TextField("Авто ответы:", str, 2000, 0);
          this.h.append((Item)this.q);
          this.h.append((Item)this.r);
          this.h.setCommandListener(this);
          this.t.setCurrent((Displayable)this.h);
        } 
        return;
      } 
    } else if (paramDisplayable == this.h) {
      if (paramCommand == this.k) {
        Account account;
        if ((account = (Account)this.a.get(this.p)) != null) {
          boolean bool = false;
          account.c[0] = this.q.isSelected(0);
          account.c[1] = this.q.isSelected(1);
          account.c[3] = this.q.isSelected(2);
          account.e[2] = this.r.getString();
          a();
          this.q = null;
          this.r = null;
          this.h = null;
        } 
        this.t.setCurrent((Displayable)this.g);
      } 
      if (paramCommand == this.i) {
        this.q = null;
        this.r = null;
        this.h = null;
        this.t.setCurrent((Displayable)this.g);
      } 
    } 
  }
  
  private void a(Display paramDisplay) {
    this.g = new List("Контакты для натройки", 3);
    this.g.addCommand(this.j);
    this.g.addCommand(this.m);
    this.g.addCommand(this.i);
    if (this.s[0]) {
      this.g.addCommand(this.o);
    } else {
      this.g.addCommand(this.n);
    } 
    this.g.setCommandListener(this);
    this.u = new String[this.a.size()];
    byte b = 0;
    Enumeration enumeration = this.a.keys();
    while (enumeration.hasMoreElements()) {
      Account account = (Account)this.a.get(enumeration.nextElement());
      this.u[b] = account.e[0];
      this.g.append(account.e[1], null);
      b++;
    } 
    paramDisplay.setCurrent((Displayable)this.g);
    this.t = paramDisplay;
  }
  
  public static String[] a(PlgAutoAnswer paramPlgAutoAnswer, String paramString1, String paramString2) {
    return a(paramString1, paramString2);
  }
  
  class Account {
    public int a;
    
    public int b;
    
    public boolean[] c;
    
    public int[] d;
    
    public String[] e;
    
    public String[] f;
    
    private final PlgAutoAnswer g;
    
    public final String a() {
      int i;
      if (this.f == null) {
        this.a = this.b = 0;
        this.f = PlgAutoAnswer.a(this.g, this.e[2], "\n");
        if (this.f.length <= 1)
          this.f = PlgAutoAnswer.a(this.g, this.e[2], "=="); 
      } 
      if (!this.c[2]) {
        i = (this.g.e.nextInt() & 0xFFF) % this.f.length;
      } else {
        i = this.a++;
        if (this.b != 0 && this.a > this.b)
          i = (this.g.e.nextInt() & 0xFFF) % (this.f.length - this.b) + this.b; 
        if ("".equals(this.f[i]) && this.b != 0 && this.a > this.b)
          i = (this.g.e.nextInt() & 0xFFF) % (this.f.length - this.b) + this.b; 
        if ("".equals(this.f[i]) && this.b != 0 && this.a > this.b)
          i = (this.g.e.nextInt() & 0xFFF) % (this.f.length - this.b) + this.b; 
        if (this.a >= this.f.length)
          this.a = this.b; 
      } 
      String str;
      if ((str = this.f[i]).equals("-")) {
        i = this.b = this.a;
        str = this.f[i];
      } 
      return str;
    }
    
    public final void a(DataOutputStream param1DataOutputStream) throws IOException {
      param1DataOutputStream.writeShort(this.c.length);
      byte b;
      for (b = 0; b < this.c.length; b++)
        param1DataOutputStream.writeBoolean(this.c[b]); 
      param1DataOutputStream.writeShort(this.d.length);
      for (b = 0; b < this.d.length; b++)
        param1DataOutputStream.writeInt(this.d[b]); 
      param1DataOutputStream.writeShort(this.e.length);
      for (b = 0; b < this.e.length; b++) {
        if (this.e[b] == null) {
          param1DataOutputStream.writeUTF("");
        } else {
          param1DataOutputStream.writeUTF(this.e[b]);
        } 
      } 
      this.a = this.b = 0;
      this.f = null;
    }
    
    public Account(PlgAutoAnswer this$0, String param1String1, String param1String2) {
      this.g = this$0;
      this.a = 0;
      this.b = 0;
      this.c = new boolean[] { false, true, true, false };
      this.d = new int[2];
      this.e = new String[] { "", "", PlgAutoAnswer.f };
      for (byte b = 0; b < this.e.length; b++)
        this.e[b] = ""; 
      this.e[0] = param1String1;
      this.e[1] = param1String2;
      this.e[2] = PlgAutoAnswer.f;
    }
    
    public Account(PlgAutoAnswer this$0, DataInputStream param1DataInputStream) throws IOException {
      this.g = this$0;
      this.a = 0;
      this.b = 0;
      this.c = new boolean[] { false, true, true, false };
      this.d = new int[2];
      this.e = new String[] { "", "", PlgAutoAnswer.f };
      short s = param1DataInputStream.readShort();
      byte b;
      for (b = 0; b < s; b++) {
        if (b < this.c.length)
          this.c[b] = param1DataInputStream.readBoolean(); 
      } 
      s = param1DataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.d.length)
          this.d[b] = param1DataInputStream.readInt(); 
      } 
      for (b = 0; b < this.e.length; b++)
        this.e[b] = ""; 
      s = param1DataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.e.length)
          this.e[b] = param1DataInputStream.readUTF(); 
      } 
    }
  }
  
  public class MyTimeout extends TimerTask {
    public PlgAutoAnswer.Account a;
    
    public String b;
    
    private final PlgAutoAnswer c;
    
    public MyTimeout(PlgAutoAnswer this$0, PlgAutoAnswer.Account param1Account) {
      this.c = this$0;
      this.a = param1Account;
      this.b = param1Account.a();
      (new Timer()).schedule(this, ((this.b.length() / 5 + 1) * 1000));
    }
    
    public void run() {
      if (this.c.request(9, null, null) == null && this.a.c[0])
        this.c.request(8, (Object[])new String[] { this.a.e[0], this.b }, null); 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgAutoAnswer.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */