package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public class PlgBackClock extends PI implements CommandListener {
  private Form j;
  
  private Command k = new Command("Сохранить", 4, 1);
  
  public ChoiceGroup a = new ChoiceGroup("Опции:", 2, new String[] { "Часы на фоне", "Больше", "Жирный", "расст*2 между сегментами", "Центрировать по списку (при плагинах)", "Часы на сплеше" }, null);
  
  public TextField b;
  
  public Gauge c;
  
  public static int d = 0;
  
  public static int e = 0;
  
  public static int f = 10066431;
  
  public static int g = 10066431;
  
  public static int h = 3;
  
  public static int i = 10;
  
  private boolean[] l = new boolean[] { false, true, true, false, true, true };
  
  private TextField m;
  
  private Gauge n;
  
  private static int[] o = null;
  
  public String getName() {
    return "Фоновые часы";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    switch (paramInt) {
      case 0:
        a(request(7, null, null));
        return null;
      case 2:
        a((Display)paramObject);
        return null;
      case 32:
        if (!this.l[5])
          return null; 
        a(paramArrayOfObject, paramObject);
        return null;
      case 30:
        if (!this.l[0])
          return null; 
        a(paramArrayOfObject, paramObject);
        return null;
    } 
    return null;
  }
  
  private boolean a(Object[] paramArrayOfObject, Object paramObject) {
    int j;
    int k;
    int[] arrayOfInt = (int[])paramArrayOfObject[0];
    Graphics graphics = (Graphics)paramObject;
    String str = (String)request(23, new Object[] { new Boolean(true), new Boolean(false) }, null);
    int i = arrayOfInt[2] - arrayOfInt[0];
    if (this.l[1]) {
      j = (i - 6) / str.length();
    } else {
      j = i * 6 / 8 / str.length();
    } 
    if (!this.l[2]) {
      k = j / 6;
    } else {
      k = j / 4;
    } 
    int m = j - k;
    int n = (arrayOfInt[2] + arrayOfInt[0]) / 2 - str.length() * (m + m / 8) / 2;
    int i1 = (arrayOfInt[3] + arrayOfInt[1]) / 2 - m;
    try {
      if (this.l[4])
        i1 += arrayOfInt[6] / 2; 
    } catch (Exception exception) {}
    a(graphics, str, n, i1, m, k);
    return false;
  }
  
  private void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    d = f & 0xFFFFFF | h * 15 << 24;
    e = g & 0xFFFFFF | i * 15 << 24;
    for (byte b = 0; b < paramString.length(); b++)
      a(paramGraphics, paramString.charAt(b), paramInt1 + (paramInt3 + paramInt3 / 8) * b, paramInt2, paramInt3, paramInt4); 
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Graphics paramGraphics) {
    int i = paramInt4 - paramInt2;
    byte b = -1;
    int j = (paramInt2 + paramInt4) / 2;
    for (int k = paramInt2; k <= paramInt4; k++) {
      if (k == paramInt2 || k == paramInt4) {
        b(paramGraphics, paramInt1 + i, k, paramInt3 - i, true);
      } else {
        b(paramGraphics, paramInt1 + i, k, paramInt3 - i, false);
      } 
      if (k >= j)
        b = 1; 
      if (k == j && (this.l[3] || (i & 0x1) != 0))
        b = 0; 
      i += b;
    } 
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Graphics paramGraphics) {
    int i = paramInt3 - paramInt1;
    byte b = -1;
    int j = (paramInt1 + paramInt3) / 2;
    for (int k = paramInt1; k <= paramInt3; k++) {
      if (k == paramInt1 || k == paramInt3) {
        a(paramGraphics, k, paramInt2 + i, paramInt4 - i, true);
      } else {
        a(paramGraphics, k, paramInt2 + i, paramInt4 - i, false);
      } 
      if (k >= j)
        b = 1; 
      if (k == j && (this.l[3] || (i & 0x1) != 0))
        b = 0; 
      i += b;
    } 
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramInt3 - paramInt2;
    if (paramBoolean) {
      a(i, e);
      paramGraphics.drawRGB(o, 0, 1, paramInt1, paramInt2, 1, i, true);
      return;
    } 
    a(i, d);
    o[0] = e;
    o[i - 1] = e;
    paramGraphics.drawRGB(o, 0, 1, paramInt1, paramInt2, 1, i, true);
    o[0] = d;
    o[i - 1] = d;
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramInt3 - paramInt1;
    if (paramBoolean) {
      a(i, e);
      paramGraphics.drawRGB(o, 0, i, paramInt1, paramInt2, i, 1, true);
      return;
    } 
    a(i, d);
    o[0] = e;
    o[i - 1] = e;
    paramGraphics.drawRGB(o, 0, i, paramInt1, paramInt2, i, 1, true);
    o[0] = d;
    o[i - 1] = d;
  }
  
  private static void a(int paramInt1, int paramInt2) {
    paramInt1 += 2;
    if (o == null || o.length < paramInt1) {
      o = null;
      o = new int[paramInt1];
    } 
    if (o[0] != paramInt2)
      for (byte b = 0; b < o.length; b++)
        o[b] = paramInt2;  
  }
  
  public final void a(Graphics paramGraphics, char paramChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte b;
    if (paramChar == '1')
      paramInt1 -= paramInt4; 
    int i = paramInt4 / 2;
    int j = paramInt1;
    int k = paramInt1 + paramInt3;
    int m = paramInt2;
    int n;
    int i1 = (n = paramInt2 + paramInt3 - i) + paramInt4;
    int i2 = paramInt2 + paramInt3 + paramInt3;
    if (this.l[3]) {
      b = 2;
    } else {
      b = 1;
    } 
    if ("23567890".indexOf(paramChar) >= 0)
      a(j + b, m, k, m + paramInt4, paramGraphics); 
    if ("2345689".indexOf(paramChar) >= 0)
      a(j + b, n, k, n + paramInt4, paramGraphics); 
    if ("2356890".indexOf(paramChar) >= 0)
      a(j + b, i2 - paramInt4, k, i2, paramGraphics); 
    if ("456890".indexOf(paramChar) >= 0)
      b(j, m + b, j + paramInt4, i1, paramGraphics); 
    if ("12347890".indexOf(paramChar) >= 0)
      b(k - paramInt4, m + b, k, i1, paramGraphics); 
    if ("2680".indexOf(paramChar) >= 0)
      b(j, n + b, j + paramInt4, i2, paramGraphics); 
    if ("134567890".indexOf(paramChar) >= 0)
      b(k - paramInt4, n + b, k, i2, paramGraphics); 
    if (paramChar == ':') {
      b(paramInt1 + paramInt3 / 2 - i, paramInt2 + paramInt3 - 3 * paramInt4, paramInt1 + paramInt3 / 2 + i, paramInt2 + paramInt3, paramGraphics);
      b(paramInt1 + paramInt3 / 2 - i, paramInt2 + paramInt3, paramInt1 + paramInt3 / 2 + i, paramInt2 + paramInt3 + 3 * paramInt4, paramGraphics);
    } 
  }
  
  private void a(Object paramObject) {
    if (paramObject == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
    try {
      byte b;
      for (b = 0; b < 3; b++)
        this.l[b] = dataInputStream.readBoolean(); 
      f = dataInputStream.readInt();
      h = dataInputStream.readInt();
      g = dataInputStream.readInt();
      i = dataInputStream.readInt();
      for (b = 3; b < 6; b++)
        this.l[b] = dataInputStream.readBoolean(); 
    } catch (IOException iOException) {}
    this.a.setSelectedFlags(this.l);
  }
  
  private void a() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeBoolean(this.l[0]);
      dataOutputStream.writeBoolean(this.l[1]);
      dataOutputStream.writeBoolean(this.l[2]);
      dataOutputStream.writeInt(f);
      dataOutputStream.writeInt(h);
      dataOutputStream.writeInt(g);
      dataOutputStream.writeInt(i);
      dataOutputStream.writeBoolean(this.l[3]);
      dataOutputStream.writeBoolean(this.l[4]);
      dataOutputStream.writeBoolean(this.l[5]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.k) {
      this.a.getSelectedFlags(this.l);
      try {
        f = Integer.parseInt(this.b.getString(), 16);
        h = this.c.getValue();
        g = Integer.parseInt(this.m.getString(), 16);
        i = this.n.getValue();
      } catch (Exception exception) {}
      a();
      request(1, null, new Integer(0));
    } 
  }
  
  private synchronized void a(Display paramDisplay) {
    if (this.j == null) {
      this.j = new Form("Часы");
      this.j.addCommand(this.k);
      this.j.setCommandListener(this);
      this.b = new TextField("Цвет", "", 20, 0);
      this.c = new Gauge("Прозрачность", true, 17, h);
      this.m = new TextField("Цвет контура", "", 20, 0);
      this.n = new Gauge("Прозрачность контура", true, 17, i);
      this.j.append((Item)this.a);
      this.j.append((Item)this.b);
      this.j.append((Item)this.c);
      this.j.append((Item)this.m);
      this.j.append((Item)this.n);
    } 
    this.c.setValue(h);
    this.b.setString(Integer.toHexString(f));
    this.n.setValue(i);
    this.m.setString(Integer.toHexString(g));
    paramDisplay.setCurrent((Displayable)this.j);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgBackClock.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */