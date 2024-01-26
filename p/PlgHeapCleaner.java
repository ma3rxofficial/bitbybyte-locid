package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import ui.ChGroupEx;
import ui.Colors;
import ui.Config;
import ui.FormEx;

public class PlgHeapCleaner extends PI implements CommandListener {
  public Font a = Font.getFont(0, 1, 8);
  
  public TextField b;
  
  public TextField c;
  
  public TextField d;
  
  public int e = 10027008;
  
  public int f = 16777215;
  
  public int g = 1118481;
  
  public FormEx h;
  
  public ChGroupEx i;
  
  public boolean[] j = new boolean[] { true, false, true };
  
  public final String getName() {
    return "Очистка хипа";
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      b();
      Config.set((int[])request(16, null, null));
    } else if (paramInt == 2) {
      a((Display)paramObject);
    } else {
      if (paramInt == 24) {
        if (!this.j[0])
          return null; 
        int[] arrayOfInt;
        if ((arrayOfInt = (int[])paramArrayOfObject[0])[2] < 1 || arrayOfInt[2] > 3)
          return null; 
        boolean bool = false;
        Vector vector;
        (vector = (Vector)new Vector()).addElement(new int[] { arrayOfInt[0], this.a.getHeight(), 0, 0 });
        return vector;
      } 
      if (paramInt == 25) {
        if (!this.j[0])
          return null; 
        Graphics graphics = (Graphics)paramArrayOfObject[0];
        Canvas canvas = (Canvas)paramArrayOfObject[1];
        int[] arrayOfInt = (int[])paramObject;
        int i = (int)(Runtime.getRuntime().freeMemory() / 1024L);
        int j = (int)(Runtime.getRuntime().totalMemory() / 1024L);
        Colors.drawGradient(graphics, 0, arrayOfInt[1], canvas.getWidth() + 1, this.a.getHeight(), this.f, 10, 32, -32);
        int k = canvas.getWidth() * i / j;
        Colors.drawGradient(graphics, 2, arrayOfInt[1] + 1, k - 2, this.a.getHeight() - 2, this.e, 10, 32, -32);
        graphics.setColor(this.g);
        if (this.j[1]) {
          StringBuffer stringBuffer;
          (stringBuffer = new StringBuffer()).append(i).append("KB-").append(j).append("KB");
          graphics.drawString(stringBuffer.toString(), arrayOfInt[0] + 1, arrayOfInt[1], 20);
        } 
      } else if (paramInt == 39) {
        if (this.j[2]) {
          System.gc();
        } else {
          a();
        } 
        request(10, null, null);
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.h.isLeft(paramCommand))
      c(); 
    request(1, null, new Integer(0));
    this.h = null;
    this.i = null;
  }
  
  public final void a(Display paramDisplay) {
    this.h = new FormEx("HeapCleaner v0.2", new Command("Сохран.", 4, 0), new Command("Назад", 2, 0));
    this.i = new ChGroupEx("Настройки", 2, new String[] { "Включить", "Показывать размер", "Станд. тип очистки" });
    this.b = new TextField("Цвет прогрессбара", Integer.toHexString(this.e), 6, 0);
    this.c = new TextField("Цвет фона", Integer.toHexString(this.f), 6, 0);
    this.d = new TextField("Цвет текста", Integer.toHexString(this.g), 6, 0);
    this.i.setSelectedFlags(this.j);
    this.h.append((Item)this.i);
    this.h.append((Item)this.b);
    this.h.append((Item)this.c);
    this.h.append((Item)this.d);
    this.h.setDisplay(paramDisplay);
    this.h.setListener(this);
    paramDisplay.setCurrent((Displayable)this.h);
  }
  
  private final void b() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      int i = dataInputStream.readUnsignedByte();
      for (byte b = 0; b < i; b++)
        this.j[b] = dataInputStream.readBoolean(); 
      this.e = dataInputStream.readInt();
      this.f = dataInputStream.readInt();
      this.g = dataInputStream.readInt();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void c() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    this.i.getSelectedFlags(this.j);
    this.e = Integer.parseInt(this.b.getString(), 16);
    this.f = Integer.parseInt(this.c.getString(), 16);
    this.g = Integer.parseInt(this.d.getString(), 16);
    try {
      dataOutputStream.writeByte(this.j.length);
      for (byte b = 0; b < this.j.length; b++)
        dataOutputStream.writeBoolean(this.j[b]); 
      dataOutputStream.writeInt(this.e);
      dataOutputStream.writeInt(this.f);
      dataOutputStream.writeInt(this.g);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public static final void a() {
    Runtime runtime = Runtime.getRuntime();
    Thread.currentThread().setPriority(10);
    System.gc();
    runtime.gc();
    Vector vector = new Vector();
    int i = 204800;
    try {
      while (i > 0) {
        vector.addElement(new byte[10240]);
        i -= 10240;
      } 
      vector.removeAllElements();
    } catch (Throwable throwable) {}
    System.gc();
    runtime.gc();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgHeapCleaner.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */