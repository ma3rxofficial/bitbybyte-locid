package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;

public class PlgBack2 extends PI implements CommandListener {
  private Form i;
  
  private Command j = new Command("Сохранить", 4, 1);
  
  public ChoiceGroup a = new ChoiceGroup("Опции:", 2, new String[] { "Включить ёлку", "Скорость", "Ускорение" }, null);
  
  private boolean[] k = new boolean[] { false, true, true };
  
  public int[] b = new int[150];
  
  public int[] c = new int[150];
  
  public int[] d = new int[150];
  
  private MyTimeout l = null;
  
  private int m;
  
  private int n;
  
  private int[] o = new int[10];
  
  private int p = 0;
  
  public int e = 2111897;
  
  public int f = 2111897;
  
  public Image g;
  
  public Graphics h;
  
  public String getName() {
    return "Ёлка";
  }
  
  public final int a(int paramInt) {
    this.e *= this.f;
    this.e += 87446371;
    this.f <<= 1;
    this.f += this.e;
    if (this.e < 0)
      this.e = -this.e; 
    return this.e % paramInt;
  }
  
  public final void a() {
    for (int i = this.b.length - 1; i >= 0; i--) {
      int j = this.b[i];
      int k = this.c[i];
      j += a(11) - 5;
      k += this.d[i];
      if (((i <= this.d.length / 2 && j >= 1 && j < this.m - 1) || k >= this.n - 1) && (k >= this.n - 2 || (a(j, k) & 0xFFFF00) != 0)) {
        this.h.setColor(15658734);
        this.h.fillRect(j, k, 1, 1);
        this.b[i] = a(this.m);
        this.d[i] = a(100) / 16 + 1;
        this.c[i] = 0;
      } else {
        this.b[i] = j;
        this.c[i] = k;
      } 
    } 
  }
  
  private int a(int paramInt1, int paramInt2) {
    try {
      this.g.getRGB(this.o, 0, 1, paramInt1, paramInt2, 1, 1);
      return this.o[0];
    } catch (Exception exception) {
      return -1;
    } 
  }
  
  public final void b() {
    int i;
    for (i = this.b.length - 1; i >= 0; i--) {
      this.b[i] = a(this.m);
      this.d[i] = a(100) / 16 + 1;
      this.c[i] = a(3);
    } 
    this.g = Image.createImage(this.m, this.n);
    this.h = this.g.getGraphics();
    for (i = 0; i < this.n; i++) {
      this.h.setColor(1 * (200 - i * 115 / this.n));
      this.h.drawLine(0, i, this.m, i);
    } 
    i = this.m / 2;
    this.h.setColor(7816260);
    this.h.fillRect(i - i / 20 - 1, this.n * 85 / 100, i / 10 + 1, this.n * 25 / 100);
    int j;
    for (j = 0; j < this.n * 3; j++) {
      this.h.setColor(256 * (120 - j * 50 / this.n));
      for (byte b1 = 0; b1 < 3; b1++) {
        int k = 10 + b1 * 23;
        int m;
        if ((m = 2 * (j + 4 - b1) / 7) <= this.n * 30 / 100 + 1) {
          this.h.drawLine(i, m + this.n * k / 100, this.m * 60 / 100 + j * (1 + b1) / 16, this.n * (k + 30) / 100);
          this.h.drawLine(i, m + this.n * k / 100, this.m * 40 / 100 - j * (1 + b1) / 16, this.n * (k + 30) / 100);
        } 
      } 
    } 
    j = this.n / 40 + 1;
    for (byte b = 0; b < 50; b++) {
      int k = a(this.n);
      int m = a(this.n / 2 + 1) - this.n / 4 + this.m / 2;
      if ((a(m, k) & 0xFF00FF) == 0) {
        this.h.setColor(a(16777216));
        int n = j + j * a(16) / 8;
        this.h.fillArc(m - j / 2, k + 1, j, n, 0, 360);
      } 
    } 
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    Graphics graphics;
    int[] arrayOfInt;
    int i;
    switch (paramInt) {
      case 0:
        a(request(7, null, null));
        this.e = (int)(this.e + System.currentTimeMillis());
        return null;
      case 2:
        a((Display)paramObject);
        return null;
      case 30:
        if (!this.k[0])
          return null; 
        graphics = (Graphics)paramObject;
        this.p++;
        arrayOfInt = (int[])paramArrayOfObject[0];
        this.m = arrayOfInt[2] - arrayOfInt[0];
        this.n = arrayOfInt[3] - arrayOfInt[1];
        if (this.g == null || (this.g.getHeight() != this.n && (this.p & 0x7FF) == 0))
          b(); 
        a();
        graphics.drawImage(this.g, arrayOfInt[0], arrayOfInt[1], 0);
        for (i = this.b.length - 1; i >= 0; i--) {
          graphics.setColor(15658751);
          graphics.fillRect(arrayOfInt[0] + this.b[i], arrayOfInt[1] + this.c[i], 1, 1);
        } 
        if (this.l != null)
          this.l.cancel(); 
        this.l = null;
        System.gc();
        this.l = new MyTimeout(this);
        return null;
    } 
    return null;
  }
  
  private void a(Object paramObject) {
    if (paramObject == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
    try {
      for (byte b = 0; b < 3; b++)
        this.k[b] = dataInputStream.readBoolean(); 
    } catch (IOException iOException) {}
    this.a.setSelectedFlags(this.k);
  }
  
  private void c() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeBoolean(this.k[0]);
      dataOutputStream.writeBoolean(this.k[1]);
      dataOutputStream.writeBoolean(this.k[2]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.j) {
      this.a.getSelectedFlags(this.k);
      c();
      request(1, null, new Integer(0));
    } 
  }
  
  private synchronized void a(Display paramDisplay) {
    if (this.i == null) {
      this.i = new Form("Ёлка");
      this.i.addCommand(this.j);
      this.i.setCommandListener(this);
      this.i.append("С новым Г! вас!");
      this.i.append((Item)this.a);
    } 
    paramDisplay.setCurrent((Displayable)this.i);
  }
  
  public static boolean[] a(PlgBack2 paramPlgBack2) {
    return paramPlgBack2.k;
  }
  
  public class MyTimeout extends TimerTask {
    private final PlgBack2 a;
    
    public MyTimeout(PlgBack2 this$0) {
      this.a = this$0;
      char c = 'ߐ';
      if (PlgBack2.a(this$0)[1])
        c = 'Ϩ'; 
      if (PlgBack2.a(this$0)[2])
        c = 'ú'; 
      if (PlgBack2.a(this$0)[1] && PlgBack2.a(this$0)[2])
        c = 'd'; 
      (new Timer()).schedule(this, c);
    }
    
    public void run() {
      cancel();
      this.a.request(10, null, null);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgBack2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */