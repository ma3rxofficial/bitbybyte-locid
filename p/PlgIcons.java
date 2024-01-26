package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import ui.Config;
import ui.FormEx;
import ui.Strings;

public class PlgIcons extends PI implements CommandListener {
  private String[] c = new String[] { "", "", "", "", "", "", "", "", "" };
  
  private static String[] d = Strings.explode("/icons.png|/micons.png|/clicons.png|/prlists.png|/bday.png|/happy.png|/auth.png|/pstatus.png|/xstatus.png", '|');
  
  public Display a;
  
  public FormEx b;
  
  public final String getName() {
    return "Иконки из ФС";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(32) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      d();
      b();
      this.a = (Display)paramObject;
      Config.set((int[])request(16, null, null));
    } else if (paramInt == 2) {
      a();
    } else if (paramInt == 40) {
      a(paramObject.toString());
      this.a.setCurrent((Displayable)this.b);
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == List.SELECT_COMMAND) {
      if (this.b.getCurrIndex() == 0) {
        request(43, null, null);
        return;
      } 
      c();
      return;
    } 
    request(1, null, new Integer(0));
    this.b = null;
  }
  
  public final void a() {
    this.b = new FormEx("Icons v0.1", null, new Command("Назад", 2, 0));
    this.b.append("Выбрать иконки...", true);
    this.b.append("По умолчанию", true);
    this.b.setListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void b() {
    for (byte b = 0; b < 9; b++) {
      if (this.c[b].length() > 0)
        a(this.c[b], true); 
    } 
  }
  
  public final void a(String paramString) {
    paramString = paramString.substring(0, paramString.lastIndexOf('/'));
    for (byte b = 0; b < d.length; b++)
      a(paramString + d[b], true); 
    e();
  }
  
  private final void a(String paramString, boolean paramBoolean) {
    Image image = null;
    try {
      if (paramBoolean) {
        InputStream inputStream;
        if ((inputStream = ((StreamConnection)Connector.open("file://" + paramString)).openInputStream()) == null)
          return; 
        image = Image.createImage(inputStream);
      } else {
        image = Image.createImage(paramString);
      } 
    } catch (IOException iOException) {}
    int i;
    if (image != null && (i = b(paramString)) > -1) {
      request(18, new Object[] { new Integer(i), request(15, null, image) }null);
      request(50, null, null);
      this.c[i - 700] = paramString;
    } 
  }
  
  private final void c() {
    for (byte b = 0; b < this.c.length; b++) {
      if (this.c[b].length() > 0) {
        a(d[b], false);
        this.c[b] = "";
      } 
    } 
    e();
  }
  
  private final int b(String paramString) {
    for (byte b = 0; b < d.length; b++) {
      if (paramString.endsWith(d[b]))
        return b + 700; 
    } 
    return -1;
  }
  
  private final void d() {
    Object object;
    if ((object = request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
    try {
      int i = dataInputStream.readUnsignedByte();
      for (byte b = 0; b < i; b++)
        this.c[b] = dataInputStream.readUTF(); 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void e() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(this.c.length);
      for (byte b = 0; b < this.c.length; b++)
        dataOutputStream.writeUTF(this.c[b]); 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgIcons.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */