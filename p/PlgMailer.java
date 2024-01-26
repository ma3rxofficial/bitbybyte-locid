package p;

import borisplus.j2me.mail.MailException;
import borisplus.j2me.mail.Message;
import borisplus.j2me.mail.Smtp;
import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import ui.Config;
import ui.FormEx;

public class PlgMailer extends PI implements CommandListener {
  public Display a;
  
  public FormEx b;
  
  public TextField c;
  
  public TextField d;
  
  public TextField e;
  
  public TextField f;
  
  public TextField g;
  
  public TextField h;
  
  public String[] i = new String[] { "", "", "smtp.rambler.ru:25" };
  
  public int j = 0;
  
  public final String getName() {
    return "Отправка e-mail";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(8)), new Integer(20) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      e();
      this.a = (Display)paramObject;
      Config.set((int[])request(16, null, null));
    } else if (paramInt == 2) {
      a();
    } else if (paramInt == 37) {
      b();
    } 
    return null;
  }
  
  public final void a() {
    this.j = 0;
    this.b = new FormEx("Mailer v0.1", null, new Command("Назад", 2, 0));
    this.b.append("Написать письмо", true);
    this.b.append("Настройки", true);
    this.b.setDisplay(this.a);
    this.b.setListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void c() {
    this.j = 1;
    this.b = new FormEx("Написать письмо", new Command("Отправ.", 4, 1), new Command("Назад", 2, 0));
    this.e = new TextField("Кому", null, 255, 1);
    this.c = new TextField("Тема", null, 255, 0);
    this.d = new TextField("Сообщение", null, 255, 0);
    this.b.append((Item)this.e);
    this.b.append((Item)this.c);
    this.b.append((Item)this.d);
    this.b.setDisplay(this.a);
    this.b.setListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  private final void d() {
    this.j = 2;
    this.b = new FormEx("Настройки", new Command("Сохран.", 4, 1), new Command("Назад", 2, 0));
    this.g = new TextField("Логин", this.i[0], 255, 1);
    this.h = new TextField("Пароль", this.i[1], 255, 65536);
    this.f = new TextField("Адрес SMTP", this.i[2], 255, 0);
    this.b.append((Item)this.g);
    this.b.append((Item)this.h);
    this.b.append((Item)this.f);
    this.b.setDisplay(this.a);
    this.b.setListener(this);
    this.a.setCurrent((Displayable)this.b);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.j == 0) {
      if (paramCommand == List.SELECT_COMMAND) {
        switch (this.b.getCurrIndex()) {
          case 0:
            c();
            break;
          case 1:
            d();
            break;
        } 
        return;
      } 
      request(1, null, new Integer(0));
      this.b = null;
      return;
    } 
    if (this.j == 1) {
      if (this.b.isLeft(paramCommand)) {
        request(30, null, null);
        return;
      } 
      a();
      return;
    } 
    if (this.j == 2) {
      if (this.b.isLeft(paramCommand))
        f(); 
      a();
    } 
  }
  
  private final void e() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      this.i[0] = dataInputStream.readUTF();
      this.i[1] = b(dataInputStream.readUTF());
      this.i[2] = dataInputStream.readUTF();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void f() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    this.i[0] = this.g.getString();
    this.i[1] = this.h.getString();
    this.i[2] = this.f.getString();
    try {
      dataOutputStream.writeUTF(this.i[0]);
      dataOutputStream.writeUTF(c(this.i[1]));
      dataOutputStream.writeUTF(this.i[2]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public final void b() {
    Message message;
    (message = new Message()).addAddress(this.e.getString());
    message.setSubject(this.c.getString());
    message.setBody(this.d.getString());
    message.setContentType("text/html");
    String[] arrayOfString = a(this.i[2]);
    Smtp smtp = new Smtp(arrayOfString[0], arrayOfString[1], this.i[0], this.i[1]);
    try {
      smtp.connect();
      smtp.authenticate();
      smtp.send(message);
      smtp.deauthenticate();
      smtp.disconnect();
      a();
      return;
    } catch (MailException mailException) {
      return;
    } 
  }
  
  public final String[] a(String paramString) {
    int i = paramString.indexOf(":");
    return new String[] { paramString.substring(0, i), paramString.substring(++i) };
  }
  
  public final String b(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      stringBuffer.append((char)(c - 5));
    } 
    return stringBuffer.toString();
  }
  
  public final String c(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      stringBuffer.append((char)(c + 5));
    } 
    return stringBuffer.toString();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgMailer.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */