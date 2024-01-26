package p;

import i.I;
import i.PI;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public class PlgListMaker extends PI implements CommandListener {
  public Display a;
  
  public Form b;
  
  public Command c = new Command("Создать", 4, 1);
  
  public Command d = new Command("Назад", 2, 2);
  
  public ChoiceGroup e;
  
  public TextField f;
  
  public TextField g;
  
  public final String getName() {
    return "Создание list.txt";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(7) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      this.a = (Display)paramObject;
    } else if (paramInt == 2) {
      b();
    } else if (paramInt == 37) {
      try {
        Object object = request(46, null, this.g.getString());
        OutputStream outputStream;
        if ((outputStream = (OutputStream)request(48, null, object)) == null) {
          this.a.setCurrent((Displayable)new Alert(null, "Stream is null", null, AlertType.WARNING));
          return null;
        } 
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b = 0; b < this.e.size(); b++) {
          if (this.e.isSelected(b))
            stringBuffer.append(this.e.getString(b)).append('\n'); 
        } 
        if (this.f.getString().length() > 0)
          stringBuffer.append("p.Plg").append(this.f.getString()).append(" 1\n"); 
        dataOutputStream.write(stringBuffer.toString().getBytes());
        dataOutputStream.close();
        outputStream.close();
        request(50, null, object);
      } catch (IOException iOException) {}
    } 
    return null;
  }
  
  private final void b() {
    this.b = new Form("ListMaker v0.1");
    this.e = new ChoiceGroup(null, 2, a(), null);
    this.f = new TextField("Добавить (имя класса)", null, 255, 0);
    this.g = new TextField("Путь для записи", "/e/other/", 255, 0);
    for (byte b = 0; b < this.e.size(); b++)
      this.e.setSelectedIndex(b, true); 
    this.b.addCommand(this.d);
    this.b.addCommand(this.c);
    this.b.append((Item)this.f);
    this.b.append((Item)this.e);
    this.b.append((Item)this.g);
    this.b.setCommandListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.c)
      request(30, null, null); 
    request(1, null, new Integer(0));
  }
  
  public final String[] a() {
    String str = null;
    try {
      InputStream inputStream;
      byte[] arrayOfByte = new byte[(inputStream = getClass().getResourceAsStream("/list.txt")).available()];
      inputStream.read(arrayOfByte);
      str = (str = (String)request(28, null, arrayOfByte)).substring(0, str.length() - 1);
    } catch (IOException iOException) {}
    return (String[])request(40, (Object[])new String[] { str, "\n" }, null);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgListMaker.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */