package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public class PlgBackSnow extends PI implements CommandListener {
  private Form m;
  
  private Command n = new Command("Сохранить", 4, 1);
  
  public static final int[] a = new int[] { 1000, 1000, 250, 100, 70, 50, 30, 20 };
  
  public ChoiceGroup b = new ChoiceGroup("Опции:", 4, new String[] { "Выключить", "Медленно", "Средняя скорость", "Нормально", "Быстро", "Очень бысто", "Снегопад", "Метель" }, null);
  
  public ChoiceGroup c = new ChoiceGroup("Направление:", 4, new String[] { "Везде", "Снег", "Метель" }, null);
  
  public TextField d = new TextField("Снежинок", "10", 3, 2);
  
  private MyTimeout o = null;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s = 0;
  
  private int t;
  
  private int u;
  
  private int v = 10;
  
  private int w = -1;
  
  public Random e = new Random();
  
  public int f = 2111897;
  
  public Graphics g;
  
  public I[] h;
  
  public int[] i;
  
  public int[] j;
  
  public int[] k;
  
  public int[] l;
  
  public String getName() {
    return "Снежинки";
  }
  
  public final int a(int paramInt) {
    return this.e.nextInt(paramInt);
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    int[] arrayOfInt;
    switch (paramInt) {
      case 0:
        a(request(7, null, null));
        this.f = (int)(this.f + System.currentTimeMillis());
        return null;
      case 2:
        a((Display)paramObject);
        return null;
      case 30:
        if (this.t == 0 || this.v < 1)
          return null; 
        this.g = (Graphics)paramObject;
        this.s++;
        if (this.h == null) {
          Object object;
          if ((object = request(15, null, "/snow.png")) == null)
            return null; 
          this.h = new I[5];
          this.h[0] = (I)request(14, new Object[] { object, new Integer(0) }, null);
          this.h[1] = (I)request(14, new Object[] { object, new Integer(1) }, null);
          this.h[2] = (I)request(14, new Object[] { object, new Integer(2) }, null);
          this.h[3] = (I)request(14, new Object[] { object, new Integer(3) }, null);
          this.h[4] = (I)request(14, new Object[] { object, new Integer(4) }, null);
        } 
        arrayOfInt = (int[])paramArrayOfObject[0];
        this.p = (arrayOfInt[2] - arrayOfInt[0]) * 2;
        this.q = (arrayOfInt[3] - arrayOfInt[1]) * 2;
        this.r = arrayOfInt[1];
        a();
        if ((this.s & 0x3F) == 0)
          c(); 
        if (this.o != null)
          this.o.cancel(); 
        this.o = null;
        System.gc();
        this.o = new MyTimeout(this);
        return null;
    } 
    return null;
  }
  
  private void a() {
    if (this.i == null || this.w != this.v) {
      int i = this.v;
      this.w = this.v;
      this.i = new int[i];
      this.j = new int[i];
      this.k = new int[i];
      this.l = new int[i];
      b();
    } 
    byte b;
    for (b = 0; b < this.i.length; b++) {
      if (b == 0 && this.h[4] != null) {
        this.h[4].drawInCenter(this.g, this.i[b] / 2, this.j[b] / 2 + this.r);
      } else {
        this.h[b & 0x3].drawInCenter(this.g, this.i[b] / 2, this.j[b] / 2 + this.r);
      } 
    } 
    for (b = 0; b < this.i.length; b++) {
      this.i[b] = this.i[b] + this.k[b];
      if (this.i[b] < -45)
        this.i[b] = this.p + 30; 
      if (this.i[b] > this.p + 45)
        this.i[b] = -30; 
      this.j[b] = this.j[b] + this.l[b];
      if (this.j[b] < -45)
        this.j[b] = this.q + 30; 
      if (this.j[b] > this.q + 45)
        this.j[b] = -30; 
    } 
  }
  
  private void b() {
    for (byte b = 0; b < this.i.length; b++) {
      this.i[b] = a(this.p * 2);
      this.j[b] = a(this.q * 2);
    } 
    c();
  }
  
  private void c() {
    for (byte b = 0; b < this.i.length; b++) {
      if (this.u == 2) {
        this.l[b] = (a(10) + 1) * 2;
        this.k[b] = this.l[b] * 2 / 4;
        if (((b ^ b >> 1) & 0x1) == 0)
          this.k[b] = -this.k[b]; 
      } else if (this.u == 1) {
        this.l[b] = a(10) + 1;
        this.k[b] = this.l[b] * 2 / 4;
      } else {
        this.k[b] = a(10) - 5;
        this.l[b] = a(8);
      } 
      if (this.l[b] == this.k[b] && this.l[b] == 0)
        this.l[b] = 2; 
    } 
  }
  
  private void a(Object paramObject) {
    if (paramObject == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
    try {
      this.t = dataInputStream.readInt();
      this.v = dataInputStream.readInt();
      this.b.setSelectedIndex(this.t, true);
      this.u = dataInputStream.readInt();
      this.c.setSelectedIndex(this.u, true);
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private void d() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(this.t);
      dataOutputStream.writeInt(this.v);
      dataOutputStream.writeInt(this.u);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.n) {
      this.t = this.b.getSelectedIndex();
      this.v = Integer.parseInt(this.d.getString());
      this.u = this.c.getSelectedIndex();
      d();
      request(1, null, new Integer(0));
    } 
  }
  
  private synchronized void a(Display paramDisplay) {
    if (this.m == null) {
      this.m = new Form("Снежинки");
      this.m.addCommand(this.n);
      this.m.setCommandListener(this);
      this.m.append("С новым Г! вас!");
      this.m.append((Item)this.b);
      this.d.setString("" + this.v);
      this.m.append((Item)this.d);
      this.m.append((Item)this.c);
    } 
    paramDisplay.setCurrent((Displayable)this.m);
  }
  
  public static int a(PlgBackSnow paramPlgBackSnow) {
    return paramPlgBackSnow.t;
  }
  
  public class MyTimeout extends TimerTask {
    private final PlgBackSnow a;
    
    public MyTimeout(PlgBackSnow this$0) {
      this.a = this$0;
      int i = 0;
      i = PlgBackSnow.a[PlgBackSnow.a(this$0)];
      (new Timer()).schedule(this, i);
    }
    
    public void run() {
      cancel();
      this.a.request(10, null, null);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgBackSnow.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */