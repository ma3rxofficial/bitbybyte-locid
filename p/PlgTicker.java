package p;

import i.C;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import ui.ChGroupEx;
import ui.Config;
import ui.FormEx;

public class PlgTicker extends PI implements CommandListener {
  public String a;
  
  public String b;
  
  public int[] c;
  
  public int d = 200;
  
  public boolean e = true;
  
  public FormEx f;
  
  public ChGroupEx g;
  
  public TextField h;
  
  public final String getName() {
    return "Бегущая строка";
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      a();
      this.c = (int[])request(16, null, null);
      Config.set(this.c);
    } else if (paramInt == 2) {
      a((Display)paramObject);
    } else if (paramInt == 23) {
      this.a = (String)paramArrayOfObject[1] + ": " + a(((String)paramArrayOfObject[4]).trim());
      this.b = (String)paramArrayOfObject[0];
    } else {
      if (paramInt == 24) {
        if (this.a == null)
          return null; 
        int[] arrayOfInt;
        if ((arrayOfInt = (int[])paramArrayOfObject[0])[2] == 2) {
          if (paramObject instanceof C && this.b.equals(((C)paramObject).getUinString()))
            this.a = null; 
          return null;
        } 
        Vector vector = new Vector();
        Font font = Font.getFont(0, 1, 8);
        vector.addElement(new int[] { arrayOfInt[0], font.getHeight(), 0, 0 });
        return vector;
      } 
      if (paramInt == 25) {
        if (this.a == null)
          return null; 
        Graphics graphics = (Graphics)paramArrayOfObject[0];
        int[] arrayOfInt = (int[])paramObject;
        graphics.setColor(this.c[14]);
        graphics.drawString(this.a, 0, arrayOfInt[1], 20);
      } else if (paramInt == 39 && this.a != null) {
        this.a = null;
        request(10, null, null);
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.f.isLeft(paramCommand))
      b(); 
    request(1, null, new Integer(0));
    this.f = null;
    this.g = null;
    this.h = null;
  }
  
  private final void a(Display paramDisplay) {
    this.f = new FormEx("Ticker v0.2", new Command("Сохран.", 4, 0), new Command("Назад", 2, 0));
    this.h = new TextField("Скорость прокрутки", this.d + "", 4, 2);
    this.g = new ChGroupEx("После прокрутки", 1, new String[] { "Убрать", "Прокрутить заново" });
    this.g.setSelectedIndex(1, this.e);
    this.f.append((Item)this.h);
    this.f.append((Item)this.g);
    this.f.setDisplay(paramDisplay);
    this.f.setListener(this);
    paramDisplay.setCurrent((Displayable)this.f);
  }
  
  private final String a(String paramString) {
    return paramString.replace('\n', ' ');
  }
  
  private final void a() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      this.d = dataInputStream.readInt();
      this.e = dataInputStream.readBoolean();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void b() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    this.d = Integer.parseInt(this.h.getString());
    this.e = this.g.isSelected(1);
    try {
      dataOutputStream.writeInt(this.d);
      dataOutputStream.writeBoolean(this.e);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public class Title extends TimerTask {
    public String a;
    
    private final PlgTicker b;
    
    public Title(PlgTicker this$0) {
      this.b = this$0;
      this.a = this$0.a;
      (new Timer()).schedule(this, 1500L, this$0.d);
    }
    
    public final void run() {
      if (this.b.a.length() > 0) {
        this.b.a = this.b.a.substring(1, this.b.a.length());
      } else if (this.b.e) {
        this.b.a = this.a;
      } else {
        this.b.a = null;
        cancel();
      } 
      this.b.request(10, null, null);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgTicker.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */