package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;

public class PlgSample extends PI implements CommandListener {
  private Form d;
  
  private Command e = new Command("Сохранить", 4, 1);
  
  private Command f = new Command("Отмена", 2, 2);
  
  public ChoiceGroup a = new ChoiceGroup("Опции:", 2, new String[] { "Активировать", "Строка прогресса", "Диаграмма", "ms/F", "H/F" }, null);
  
  private boolean[] g = new boolean[] { false, true, false, false, false };
  
  public Font b = Font.getFont(0, 0, 8);
  
  private int h = 0;
  
  public int[] c;
  
  private int i;
  
  private int j;
  
  public String getName() {
    return "Диаграмма хипа";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    int[] arrayOfInt1;
    Graphics graphics;
    boolean bool1;
    int[] arrayOfInt2;
    int i;
    int j;
    Vector vector;
    boolean bool2;
    int k;
    Canvas canvas;
    switch (paramInt) {
      case 0:
        a(request(7, null, null));
        this.c = new int[16];
        this.c[15] = 16776960;
        this.c[14] = 16711935;
        this.c = (int[])request(16, null, null);
        return null;
      case 2:
        a((Display)paramObject);
        return null;
      case 24:
        if (!this.g[0])
          return null; 
        arrayOfInt1 = (int[])paramArrayOfObject[0];
        bool1 = false;
        i = 0;
        if ((j = arrayOfInt1[2]) < 1 || j > 3)
          return null; 
        vector = new Vector();
        if (this.g[2]) {
          vector.addElement(new int[] { this.b.getHeight() + this.b.stringWidth(" 9999/9999" + (this.g[3] ? " 111" : "") + (this.g[4] ? " 111" : "")) + 2, this.b.getHeight(), 0, 0 });
        } else if (this.g[1]) {
          vector.addElement(new int[] { 0, 0, 0, 0 });
        } 
        return vector;
      case 25:
        if (!this.g[0])
          return null; 
        graphics = (Graphics)paramArrayOfObject[0];
        i = (arrayOfInt2 = (int[])paramObject)[0];
        j = arrayOfInt2[1];
        bool2 = false;
        k = arrayOfInt2[3];
        canvas = (Canvas)paramArrayOfObject[1];
        graphics.setClip(0, 0, canvas.getWidth(), canvas.getHeight());
        if (this.g[1]) {
          int m = canvas.getWidth() / 3;
          graphics.setColor(16777215);
          graphics.fillRect(canvas.getWidth() - m - 1, 0, m + 1, 3);
          graphics.setColor(119);
          graphics.fillRect(canvas.getWidth() - m, 1, (int)(Runtime.getRuntime().freeMemory() * m / Runtime.getRuntime().totalMemory()) + 1, 2);
        } 
        if (this.g[2]) {
          int m = (int)(Runtime.getRuntime().freeMemory() * 359L / Runtime.getRuntime().totalMemory()) + 1;
          graphics.setColor(-2130706433);
          graphics.fillArc(i, j, k - j, k - j, 0, 360);
          graphics.setColor(65280);
          graphics.fillArc(i + 1, j + 1, k - j - 2, k - j - 2, 0, 360);
          if (this.h > m) {
            graphics.setColor(11184640);
            graphics.fillArc(i + 1, j + 1, k - j - 2, k - j - 2, 0, this.h);
          } 
          this.h = m;
          graphics.setColor(102);
          graphics.fillArc(i + 1, j + 1, k - j - 2, k - j - 2, 0, m);
          graphics.setColor(this.c[14]);
          int n = 0;
          if (this.g[3])
            try {
              n = ((Integer)request(17, null, new Integer(900))).intValue();
              n = (this.i + n) / 2;
              this.i = n;
            } catch (Exception exception) {
              n = -1;
            }  
          String str = "";
          if (this.g[4]) {
            int i1 = 0;
            try {
              i1 = -((Integer)request(17, null, new Integer(901))).intValue();
              if ((i1 = (this.j + i1) / 2) < 102400 && i1 > -102400)
                this.j = i1; 
            } catch (Exception exception) {
              i1 = -1;
            } 
            byte b = 1;
            if (i1 < 0) {
              b = -1;
              i1 = -i1;
            } 
            if (i1 < 10000) {
              i1 = i1 * 10 / 1024;
              str = "" + (i1 / 10) + "." + (i1 % 10);
            } else {
              str = "" + (i1 / 1024);
            } 
            if (b < 0)
              str = "-" + str; 
            str = " " + str;
          } 
          request(20, new Object[] { graphics, this.b, "" + (Runtime.getRuntime().freeMemory() / 1024L) + "/" + (Runtime.getRuntime().totalMemory() / 1024L) + (this.g[3] ? (" " + n) : "") + str }, new int[] { this.c[14], i + 2 + k - j, j, 20 });
        } 
        return null;
    } 
    return null;
  }
  
  private void a(Object paramObject) {
    if (paramObject == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
    try {
      for (byte b = 0; b < 5; b++)
        this.g[b] = dataInputStream.readBoolean(); 
    } catch (IOException iOException) {}
    this.a.setSelectedFlags(this.g);
  }
  
  private void a() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeBoolean(this.g[0]);
      dataOutputStream.writeBoolean(this.g[1]);
      dataOutputStream.writeBoolean(this.g[2]);
      dataOutputStream.writeBoolean(this.g[3]);
      dataOutputStream.writeBoolean(this.g[4]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
    this.a.setSelectedIndex(0, this.g[0]);
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.f)
      request(1, null, new Integer(0)); 
    if (paramCommand == this.e) {
      this.a.getSelectedFlags(this.g);
      a();
      request(1, null, new Integer(0));
    } 
  }
  
  private synchronized void a(Display paramDisplay) {
    if (this.d == null) {
      this.d = new Form("Hello");
      this.d.addCommand(this.e);
      this.d.addCommand(this.f);
      this.d.setCommandListener(this);
      this.d.append((Item)this.a);
    } 
    paramDisplay.setCurrent((Displayable)this.d);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgSample.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */