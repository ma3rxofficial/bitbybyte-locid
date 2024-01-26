package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import ui.Config;
import ui.FormEx;
import ui.Strings;

public class PlgCalendar extends PI implements CommandListener {
  public static String[] a = Strings.explode("П|В|С|Ч|П|С|В|", '|');
  
  public static String[] b = Strings.explode("Расчет з\\п|Праздники|Все праздники|Настройки|", '|');
  
  public String[] c;
  
  public int[] d;
  
  public int[] e;
  
  public int f;
  
  public int g;
  
  public int h = 0;
  
  public int i = Font.getFont(0, 1, 8).getHeight();
  
  public int j = Font.getFont(0, 1, 8).stringWidth("000");
  
  public FormEx k;
  
  public TextField l;
  
  public TextField m;
  
  public TextField n;
  
  public Display o;
  
  public Vector p = new Vector();
  
  public int[] q = new int[] { 0, 0 };
  
  public String r = " руб.";
  
  public boolean s = false;
  
  public int t = 0;
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(26) }null);
  }
  
  public final String getName() {
    return "Календарь";
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      f();
      this.c = l();
      m();
      n();
      this.e = (int[])request(16, null, null);
      Config.set(this.e);
      this.o = (Display)paramObject;
    } else if (paramInt == 2) {
      a();
    } else {
      if (paramInt == 24) {
        if (!this.s)
          return null; 
        int[] arrayOfInt;
        if ((arrayOfInt = (int[])paramArrayOfObject[0])[2] < 1 || arrayOfInt[2] > 3)
          return null; 
        Vector vector;
        (vector = (Vector)new Vector()).addElement(new int[] { arrayOfInt[0], this.i * (j() + 1), 0, 0 });
        return vector;
      } 
      if (paramInt == 25) {
        if (!this.s)
          return null; 
        Graphics graphics = (Graphics)paramArrayOfObject[0];
        int[] arrayOfInt = (int[])paramObject;
        a(graphics, arrayOfInt);
      } else if (paramInt == 39) {
        this.s = !this.s;
        request(10, null, null);
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.h == 0) {
      if (paramCommand == List.SELECT_COMMAND) {
        switch (this.k.getCurrIndex()) {
          case 0:
            e();
            break;
          case 1:
            c();
            break;
          case 2:
            d();
            break;
          case 3:
            b();
            break;
        } 
        return;
      } 
      request(1, null, new Integer(0));
      return;
    } 
    if (this.k.isLeft(paramCommand)) {
      if (this.h == 1) {
        this.q[0] = Integer.parseInt(this.l.getString());
        this.q[1] = Integer.parseInt(this.m.getString());
        this.r = this.n.getString();
        o();
        return;
      } 
      if (this.l.getString().length() > 0 && this.m.getString().length() > 0) {
        this.p.addElement(new String[] { this.l.getString(), this.m.getString() });
        o();
      } 
      a();
      return;
    } 
    if (paramCommand == List.SELECT_COMMAND) {
      int i = this.k.getCurrIndex();
      this.p.removeElementAt(i - 4);
      this.k.remove(i);
      return;
    } 
    a();
  }
  
  public final void a() {
    this.h = 0;
    this.k = new FormEx("Calendar v0.3", null, new Command("Назад", 2, 0));
    for (byte b = 0; b < b.length; b++)
      this.k.append(b[b], true); 
    this.k.setListener(this);
    this.o.setCurrent((Displayable)this.k);
  }
  
  public final void b() {
    this.h = 1;
    this.k = new FormEx(b[2], new Command("Сохран.", 2, 0), new Command("Назад", 2, 0));
    this.l = new TextField("З\\п за час", this.q[0] + "", 6, 2);
    this.m = new TextField("Отработ. часы", this.q[1] + "", 3, 2);
    this.n = new TextField("Валюта", this.r, 10, 0);
    this.k.append((Item)this.l);
    this.k.append((Item)this.m);
    this.k.append((Item)this.n);
    this.k.setDisplay(this.o);
    this.k.setListener(this);
    this.o.setCurrent((Displayable)this.k);
  }
  
  public final void c() {
    this.h = 2;
    this.k = new FormEx(b[1], null, new Command("Назад", 2, 0));
    String[] arrayOfString;
    if ((arrayOfString = k()).length == 0) {
      this.k.append("Сегодня ничего нет", false);
    } else {
      for (byte b = 0; b < arrayOfString.length; b++)
        this.k.append(arrayOfString[b], false); 
    } 
    this.k.setListener(this);
    this.o.setCurrent((Displayable)this.k);
  }
  
  public final void d() {
    this.h = 2;
    this.k = new FormEx(b[1], new Command("Добав.", 8, 0), new Command("Назад", 2, 0));
    this.l = new TextField("Дата", null, 5, 0);
    this.m = new TextField("Описание", null, 255, 0);
    this.k.append((Item)this.l);
    this.k.append((Item)this.m);
    if (this.p.size() == 0) {
      this.k.append("Файла нет", false);
    } else {
      for (byte b = 0; b < this.p.size(); b++) {
        String[] arrayOfString = this.p.elementAt(b);
        this.k.append(arrayOfString[0] + " - " + arrayOfString[1], (this.t <= b));
      } 
    } 
    this.k.setDisplay(this.o);
    this.k.setListener(this);
    this.o.setCurrent((Displayable)this.k);
  }
  
  public final void a(Graphics paramGraphics, int[] paramArrayOfint) {
    int i = 0;
    int j = paramArrayOfint[1] + this.i;
    int k = (j() + 1) * this.i;
    if (this.d[0] != 1) {
      i = 2 + (this.d[0] - 2) * this.j;
    } else {
      i = 2 + this.j * 6;
    } 
    paramGraphics.setColor(this.e[14]);
    paramGraphics.drawLine(0, j, this.j * 7 - 1, j);
    byte b;
    for (b = 0; b < 7; b++) {
      paramGraphics.drawString(a[b], b * this.j + 2, paramArrayOfint[1], 20);
      paramGraphics.drawLine((b + 1) * this.j - 1, paramArrayOfint[1], (b + 1) * this.j - 1, paramArrayOfint[1] + k);
    } 
    if (this.d[0] == 6 || this.d[0] == 1) {
      paramGraphics.setColor(this.e[15]);
    } else {
      paramGraphics.setColor(this.e[14]);
    } 
    for (b = 0; b < this.d.length; b++) {
      if (this.d[b] == 7) {
        paramGraphics.setColor(this.e[15]);
      } else if (this.d[b] == 2) {
        paramGraphics.setColor(this.e[14]);
      } 
      paramGraphics.drawString((b + 1) + "", i, j, 20);
      if (b + 1 == this.g)
        paramGraphics.drawRect(i - 4, j - 1, this.j + 2, this.i + 2); 
      if (this.d[b] == 1) {
        i = 2;
        j += this.i;
        paramGraphics.setColor(this.e[14]);
        paramGraphics.drawLine(0, j, this.j * 7 - 1, j);
      } else {
        i += this.j;
      } 
    } 
  }
  
  public final void e() {
    this.h = 1;
    this.k = new FormEx(b[0], null, new Command("Назад", 2, 0));
    int i = g();
    if (this.q[1] != 0)
      i = this.q[1]; 
    this.k.append("Ваша з\\п: " + (i * this.q[0]) + this.r, false);
    this.k.setListener(this);
    this.o.setCurrent((Displayable)this.k);
  }
  
  public final void f() {
    Calendar calendar = Calendar.getInstance();
    this.g = calendar.get(5);
    this.f = calendar.get(2);
    calendar.setTime(new Date(System.currentTimeMillis() - (this.g - 1) * 86400000L));
    byte b = 1;
    int[] arrayOfInt = new int[31];
    while (this.f == calendar.get(2)) {
      arrayOfInt[b - 1] = calendar.get(7);
      calendar.setTime(new Date(calendar.getTime().getTime() + 86400000L));
      b++;
    } 
    this.d = new int[b - 1];
    System.arraycopy(arrayOfInt, 0, this.d, 0, b - 1);
  }
  
  public final int g() {
    int i = i();
    int j;
    return (j = h() - i) * 8 + i * 7;
  }
  
  public final int h() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.d.length; b2++) {
      if (this.d[b2] != 7 && this.d[b2] != 1 && !a(b2 + 1, this.f + 1))
        b1++; 
    } 
    return b1;
  }
  
  public final int i() {
    byte b1 = 0;
    int i = this.d.length - 1;
    for (byte b2 = 0; b2 < i - 1; b2++) {
      if ((!a(b2 + 1, this.f + 1) || !a(b2 + 2, this.f + 1)) && a(b2 + 2, this.f + 1))
        b1++; 
    } 
    return b1;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (this.c == null)
      return false; 
    String str = a(paramInt1) + "." + a(paramInt2);
    for (byte b = 0; b < this.c.length; b++) {
      if (this.c[b].trim().equals(str))
        return true; 
    } 
    return false;
  }
  
  public final int j() {
    byte b1 = 1;
    for (byte b2 = 0; b2 < this.d.length; b2++) {
      if (this.d[b2] == 1)
        b1++; 
    } 
    return b1;
  }
  
  public final String[] k() {
    String str = a(this.g) + "." + a(this.f + 1);
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < this.p.size(); b++) {
      String[] arrayOfString;
      if ((arrayOfString = this.p.elementAt(b))[0].equals(str))
        stringBuffer.append(arrayOfString[1]).append('|'); 
    } 
    return Strings.explode(stringBuffer.toString(), '|');
  }
  
  public final String[] l() {
    String str;
    return ((str = Strings.readANSI("/txt/nw_days.txt")) == null) ? null : Strings.explode(str, '\n');
  }
  
  private final void m() {
    String str;
    if ((str = Strings.readANSI("/txt/h_days.txt")) == null)
      return; 
    String[] arrayOfString = Strings.explode(str, '\n');
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!arrayOfString[b].trim().startsWith("//")) {
        int i = arrayOfString[b].indexOf("-");
        String str1 = arrayOfString[b].substring(0, i);
        String str2 = arrayOfString[b].substring(i + 1);
        this.p.addElement(new String[] { str1, str2 });
        this.t++;
      } 
    } 
  }
  
  public final String a(int paramInt) {
    return (paramInt > 9) ? (paramInt + "") : ("0" + paramInt);
  }
  
  private final void n() {
    Object object;
    if ((object = request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
    try {
      this.q[0] = dataInputStream.readInt();
      this.q[1] = dataInputStream.readInt();
      this.r = dataInputStream.readUTF();
      int i = dataInputStream.readInt();
      for (byte b = 0; b < i; b++) {
        this.p.addElement(new String[] { dataInputStream.readUTF(), dataInputStream.readUTF() });
      } 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void o() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(this.q[0]);
      dataOutputStream.writeInt(this.q[1]);
      dataOutputStream.writeUTF(this.r);
      dataOutputStream.writeInt(this.p.size() - this.t);
      for (int i = this.t; i < this.p.size(); i++) {
        String[] arrayOfString = this.p.elementAt(i);
        dataOutputStream.writeUTF(arrayOfString[0]);
        dataOutputStream.writeUTF(arrayOfString[1]);
      } 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgCalendar.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */