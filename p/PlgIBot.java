package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

public class PlgIBot extends PI implements CommandListener {
  private Form k;
  
  private Command l = new Command("Сохранить", 4, 1);
  
  private Command m = new Command("Назад", 2, 2);
  
  public Timer a;
  
  public String b = "4343592";
  
  public int c = 0;
  
  private int n = 360;
  
  public TextField d;
  
  public TextField e;
  
  public ChoiceGroup f;
  
  public TextField g;
  
  public Font h = Font.getFont(0, 0, 8);
  
  private int o = 0;
  
  private boolean p = true;
  
  private String q = "нет соединения";
  
  public boolean i = false;
  
  private int r = 0;
  
  private int s = 0;
  
  private boolean[] t = new boolean[] { false, true, true, false };
  
  public int[] j;
  
  private String u = "USD";
  
  private TextField v;
  
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
    return "I-Bot валюта";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    boolean bool;
    int[] arrayOfInt1;
    Graphics graphics;
    int i;
    int[] arrayOfInt2;
    int j;
    int k;
    Vector vector;
    switch (paramInt) {
      case 2:
        a((Display)paramObject);
        return null;
      case 0:
        a(request(7, null, null));
        this.j = new int[16];
        this.j[15] = 16776960;
        this.j[14] = 16711935;
        this.j = (int[])request(16, null, null);
        return null;
      case 4:
        if (this.p)
          b(); 
        return null;
      case 23:
        if (!this.t[0])
          return null; 
        if (paramArrayOfObject != null && this.b.equals(paramArrayOfObject[0])) {
          String str;
          if ((str = (String)paramArrayOfObject[4]).startsWith("Для Вас зарезервирован другой номер этого Бота")) {
            if ((str = (String)request(35, null, str)) != null && !"".equals(str)) {
              this.b = str;
              a();
            } 
          } else if (str != null) {
            a(str);
          } 
        } 
        bool = this.i;
        this.i = false;
        return bool ? new Boolean(false) : null;
      case 24:
        if (!this.t[0])
          return null; 
        i = (arrayOfInt1 = (int[])paramArrayOfObject[0])[0];
        j = 0;
        if ((k = arrayOfInt1[2]) >= 1 && k <= 3) {
          if (!this.t[k])
            return null; 
        } else {
          return null;
        } 
        vector = new Vector();
        this.r = this.h.getHeight();
        vector.addElement(new int[] { (this.c < 10) ? i : this.c, this.r, ++this.s, 0 });
        return vector;
      case 25:
        if (!this.t[0])
          return null; 
        graphics = (Graphics)paramArrayOfObject[0];
        arrayOfInt2 = (int[])paramObject;
        graphics.setFont(this.h);
        j = arrayOfInt2[0];
        k = arrayOfInt2[1];
        vector = null;
        graphics.setColor(this.j[4]);
        graphics.drawString(this.q, j + 1, k + this.r + 1, 36);
        graphics.setColor(this.j[14]);
        graphics.drawString(this.q, j + 0, k + this.r + 0, 36);
        return null;
    } 
    return null;
  }
  
  private void a(String paramString) {
    if (paramString == null)
      return; 
    if (paramString.indexOf("~ Курсы валют") < 0)
      return; 
    String str = "";
    String[] arrayOfString1 = a(paramString, "\n");
    String[] arrayOfString2 = a(this.u, ",");
    for (byte b = 0; b < arrayOfString2.length; b++) {
      for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
        String str1 = arrayOfString2[b];
        boolean bool = false;
        if (str1.indexOf('/') == 0) {
          str1 = str1.substring(1);
          bool = true;
        } 
        if (arrayOfString1[b1].indexOf(str1) >= 0) {
          String[] arrayOfString;
          String str2 = (arrayOfString = a(arrayOfString1[b1], " "))[arrayOfString.length - 2];
          str2 = a(str2, bool, arrayOfString[0]);
          str = str + str1 + "" + str2 + " ";
        } 
      } 
    } 
    this.q = str;
    if (this.k != null && this.k.size() > 1)
      this.k.set(0, (Item)new StringItem("", paramString)); 
  }
  
  private String a(String paramString1, boolean paramBoolean, String paramString2) {
    String[] arrayOfString;
    if ((arrayOfString = a(paramString1, ",")).length == 1) {
      arrayOfString[0] = arrayOfString[0] + "00000";
    } else {
      while (arrayOfString[1].length() < 5)
        arrayOfString[1] = arrayOfString[1] + "0"; 
      while (arrayOfString[1].length() > 5)
        arrayOfString[1] = arrayOfString[1].substring(1); 
      arrayOfString[0] = arrayOfString[0] + arrayOfString[1];
    } 
    long l1 = Long.parseLong(paramString2);
    long l2 = Long.parseLong(arrayOfString[0]);
    if (paramBoolean)
      l2 = 10000000000L * l1 / l2; 
    long l3 = l2 / 100000L;
    long l4;
    String str;
    for (str = Long.toString(l4 = l2 % 100000L); str.length() < 5; str = "0" + str);
    return str = "" + l3 + "." + str.substring(0, 2);
  }
  
  private void a(Object paramObject) {
    if (paramObject != null && paramObject instanceof byte[]) {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
      try {
        dataInputStream.readInt();
        boolean bool = false;
        this.b = dataInputStream.readUTF();
        this.u = dataInputStream.readUTF();
        this.n = dataInputStream.readInt();
        for (byte b = 0; b < 4; b++) {
          if (dataInputStream.available() > 0)
            this.t[b] = dataInputStream.readBoolean(); 
        } 
        if (dataInputStream.available() > 0)
          this.c = dataInputStream.readInt(); 
        return;
      } catch (IOException iOException) {}
    } 
  }
  
  private void a() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      if (this.n < 10)
        this.n = 10; 
      dataOutputStream.writeInt(1);
      dataOutputStream.writeUTF(this.b);
      dataOutputStream.writeUTF(this.u);
      dataOutputStream.writeInt(this.n);
      dataOutputStream.writeBoolean(this.t[0]);
      dataOutputStream.writeBoolean(this.t[1]);
      dataOutputStream.writeBoolean(this.t[2]);
      dataOutputStream.writeBoolean(this.t[3]);
      dataOutputStream.writeInt(this.c);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
    b();
    this.f.setSelectedIndex(0, this.t[0]);
  }
  
  private void b() {}
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.m)
      request(1, null, new Integer(0)); 
    if (paramCommand == this.l) {
      this.b = this.v.getString();
      this.u = this.g.getString().toUpperCase();
      this.n = Integer.parseInt(this.e.getString(), 10);
      this.c = Integer.parseInt(this.d.getString(), 10);
      this.f.getSelectedFlags(this.t);
      a();
      request(1, null, new Integer(0));
    } 
  }
  
  private synchronized void a(Display paramDisplay) {
    if (this.k == null) {
      this.k = new Form("Курсы валют");
      this.k.addCommand(this.l);
      this.k.addCommand(this.m);
      this.k.setCommandListener(this);
      this.v = new TextField("UIN:", this.b, 20, 2);
      this.d = new TextField("Ширина окна, 0-полная:", "" + this.c, 20, 2);
      this.e = new TextField("Период обновления, мин.:", "" + this.n, 7, 2);
      this.g = new TextField("Валюты через запятую, напр USD,EUR:", this.u, 100, 0);
      this.f = new ChoiceGroup("Настройки:", 2, new String[] { "Включить", "Показ в контакт листе", "Показ в чате", "Показ в меню" }, null);
      this.k.append(this.q);
      this.k.append((Item)this.v);
      this.k.append((Item)this.g);
      this.k.append((Item)this.e);
      this.k.append((Item)this.f);
      this.f.setSelectedIndex(0, this.t[0]);
      this.k.append((Item)this.d);
      this.k.append("Каждый запрос 0.5к трафика, возможно появление фантомного контакта " + this.b + " это нормально.");
    } 
    this.g.setString("" + this.u);
    this.e.setString("" + this.n);
    this.d.setString("" + this.c);
    this.v.setString(this.b);
    this.f.setSelectedFlags(this.t);
    paramDisplay.setCurrent((Displayable)this.k);
  }
  
  public static int a(PlgIBot paramPlgIBot) {
    return paramPlgIBot.n;
  }
  
  public static int b(PlgIBot paramPlgIBot) {
    return paramPlgIBot.o++;
  }
  
  public static boolean[] c(PlgIBot paramPlgIBot) {
    return paramPlgIBot.t;
  }
  
  public static boolean a(PlgIBot paramPlgIBot, boolean paramBoolean) {
    return paramPlgIBot.p = paramBoolean;
  }
  
  public class MyTimeout extends TimerTask {
    private final PlgIBot a;
    
    public MyTimeout(PlgIBot this$0) {
      this.a = this$0;
      if (this$0.a != null)
        this$0.a.cancel(); 
      (this$0.a = new Timer()).scheduleAtFixedRate(this, 100L, (PlgIBot.a(this$0) * 60 * 1000));
    }
    
    public void run() {
      PlgIBot.b(this.a);
      if (this.a.request(9, null, null) == null && PlgIBot.c(this.a)[0]) {
        String str = "valute";
        this.a.request(8, (Object[])new String[] { this.a.b, str, "no" }, null);
        this.a.i = true;
        PlgIBot.a(this.a, false);
        return;
      } 
      PlgIBot.a(this.a, true);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgIBot.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */