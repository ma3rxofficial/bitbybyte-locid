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
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class PlgIcons extends PI {
  private String[] c = new String[] { "", "", "", "", "", "", "", "", "" };
  
  private String[] d = new String[] { "/icons.png", "/micons.png", "/clicons.png", "/prlists.png", "/bday.png", "/happy.png", "/auth.png", "/pstatus.png", "/xstatus.png" };
  
  public Display a;
  
  public UI b;
  
  public final String getName() {
    return "Иконки из ФС";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(32) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      c();
      a();
      this.a = (Display)paramObject;
    } else if (paramInt == 2) {
      this.b = new UI(this);
      this.a.setCurrent((Displayable)this.b);
    } else if (paramInt == 40) {
      a(paramObject.toString());
      this.a.setCurrent((Displayable)this.b);
    } 
    return null;
  }
  
  private final void a() {
    for (byte b = 0; b < 9; b++) {
      if (this.c[b].length() > 0)
        a(this.c[b], true); 
    } 
  }
  
  public final void a(String paramString) {
    paramString = paramString.substring(0, paramString.lastIndexOf('/'));
    for (byte b = 0; b < this.d.length; b++)
      a(paramString + this.d[b], true); 
    d();
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
  
  private final void b() {
    for (byte b = 0; b < this.c.length; b++) {
      if (this.c[b].length() > 0) {
        a(this.d[b], false);
        this.c[b] = "";
      } 
    } 
    d();
  }
  
  private final int b(String paramString) {
    for (byte b = 0; b < this.d.length; b++) {
      if (paramString.endsWith(this.d[b]))
        return b + 700; 
    } 
    return -1;
  }
  
  private final void c() {
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
  
  private final void d() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(this.c.length);
      for (byte b = 0; b < this.c.length; b++)
        dataOutputStream.writeUTF(this.c[b]); 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public static final void a(PlgIcons paramPlgIcons) {
    paramPlgIcons.b();
  }
  
  class UI extends Canvas {
    public Font a;
    
    public int b;
    
    private final PlgIcons c;
    
    public UI(PlgIcons this$0) {
      this.c = this$0;
      this.a = Font.getFont(64, 0, 8);
      this.b = this.a.getHeight();
      setFullScreenMode(true);
    }
    
    public final void paint(Graphics param1Graphics) {
      param1Graphics.setColor(16777215);
      param1Graphics.setFont(this.a);
      param1Graphics.fillRect(0, 0, getWidth(), getHeight());
      boolean bool = false;
      param1Graphics.setColor(0);
      param1Graphics.drawString("Иконки из ФС v0.1", 2, 0, 20);
      param1Graphics.drawLine(0, this.b, getWidth(), this.b);
      param1Graphics.drawString("1 - выбрать папку", 2, this.b, 20);
      param1Graphics.drawString("2 - иконки по умолчанию", 2, this.b * 2, 20);
      param1Graphics.drawString("0 - выход", 2, getHeight() - this.b, 20);
    }
    
    public final void keyPressed(int param1Int) {
      if (param1Int == 49) {
        this.c.request(43, null, null);
        return;
      } 
      if (param1Int == 50) {
        PlgIcons.a(this.c);
        return;
      } 
      if (param1Int == 48) {
        this.c.request(1, null, new Integer(0));
        this.c.b = null;
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgIcons.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */