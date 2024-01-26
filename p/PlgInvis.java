package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
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

public class PlgInvis extends PI implements CommandListener {
  public Display a;
  
  public boolean[] b = new boolean[] { false, false };
  
  public int c = 0;
  
  public TextField d;
  
  public Form e;
  
  public ChoiceGroup f;
  
  public ChoiceGroup g;
  
  private Command h = new Command("Проверить", 8, 1);
  
  private Command i = new Command("Сохран.", 8, 2);
  
  private Command j = new Command("Назад", 2, 0);
  
  public final String getName() {
    return "Проверка на инвиз";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(33) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      b();
      this.a = (Display)paramObject;
    } else if (paramInt == 2) {
      a();
    } else {
      if (paramInt == 16 || paramInt == 19) {
        Vector vector;
        (vector = new Vector()).addElement(this.h);
        return vector;
      } 
      if (paramInt == 17 && this.b[0]) {
        Vector vector;
        (vector = new Vector()).addElement(this.h);
        return vector;
      } 
      if (paramInt == 20 && this.b[1]) {
        Vector vector;
        (vector = new Vector()).addElement(this.h);
        return vector;
      } 
      if (paramInt == 18 || paramInt == 21) {
        if (paramObject == this.h && paramObject != null)
          request(30, new Object[] { paramArrayOfObject[(paramInt == 18) ? 4 : 0], new Boolean(true) }, null); 
      } else if (paramInt == 37) {
        a((String)paramArrayOfObject[0], ((Boolean)paramArrayOfObject[1]).booleanValue());
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.h) {
      if (this.d.getString().length() < 1) {
        this.a.setCurrent((Displayable)new Alert(null, "Введите номер!", null, AlertType.WARNING));
        return;
      } 
      request(30, new Object[] { new String(this.d.getString()), new Boolean(false) }, null);
      return;
    } 
    if (paramCommand == this.i)
      c(); 
    this.e.deleteAll();
    this.e = null;
    request(1, null, new Integer(0));
  }
  
  public final void a(String paramString, boolean paramBoolean) {
    boolean bool = false;
    if (Integer.parseInt(paramString) % 243 == 150 || Integer.parseInt(paramString) % 243 == 105)
      bool = true; 
    String str1 = "vN6VJ=1&";
    String str2 = "http://kanicq.ru/invisible/m/";
    if (this.c == 1 && !bool)
      str2 = str2 + "?method=2"; 
    str1 = str1 + "uin=" + paramString;
    a(str2, str1, paramString, paramBoolean);
  }
  
  public final void a() {
    this.e = new Form("Invis v0.1");
    this.d = new TextField("Номер", null, 12, 2);
    this.f = new ChoiceGroup("Настройки", 2, new String[] { "Кнопка в чате", "Кнопка в КЛ" }, null);
    this.g = new ChoiceGroup("Тип проверки", 1, new String[] { "Анонимный, для неконорых клиентов", "Неанонимный, для всех клиентов" }, null);
    this.f.setSelectedFlags(this.b);
    this.g.setSelectedIndex(1, (this.c == 1));
    this.e.append((Item)this.d);
    this.e.append((Item)this.g);
    this.e.append((Item)this.f);
    this.e.addCommand(this.h);
    this.e.addCommand(this.i);
    this.e.addCommand(this.j);
    this.e.setCommandListener(this);
    this.a.setCurrent((Displayable)this.e);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    HttpConnection httpConnection = null;
    InputStream inputStream = null;
    OutputStream outputStream = null;
    try {
      (httpConnection = (HttpConnection)Connector.open(paramString1, 3, false)).setRequestMethod("POST");
      byte[] arrayOfByte = paramString2.getBytes("utf-8");
      httpConnection.setRequestProperty("User-Agent", "Opera/9.25 (Windows NT 5.1; U; ru)");
      httpConnection.setRequestProperty("сharset", "utf-8");
      httpConnection.setRequestProperty("Referer", "http://kanicq.ru/invisible/m/");
      if (arrayOfByte.length != 0)
        httpConnection.setRequestProperty("Content-Length", "" + arrayOfByte.length); 
      httpConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      (outputStream = httpConnection.openOutputStream()).write(arrayOfByte);
      outputStream.close();
      try {
        if (outputStream != null)
          outputStream.close(); 
      } catch (Throwable throwable) {}
      inputStream = httpConnection.openInputStream();
      if (httpConnection.getResponseCode() != 200)
        try {
          return;
        } catch (IOException iOException) {
          return;
        }  
      StringBuffer stringBuffer = new StringBuffer();
      int i;
      while ((i = inputStream.read()) != -1)
        stringBuffer.append((char)i); 
      String str = a(stringBuffer.toString());
      inputStream.close();
      request(32, null, new int[] { (int)httpConnection.getLength(), paramString1.length() + 50 + arrayOfByte.length });
      if (paramBoolean) {
        request(38, new Object[] { { paramString3, "", paramString3 + " " + str }, , { 0, 65 }, , { 0L }, , b(str) }, null);
      } else {
        this.a.setCurrent((Displayable)new Alert(null, paramString3 + " " + str, null, AlertType.INFO));
      } 
    } catch (Exception exception) {
      try {
        return;
      } catch (IOException iOException) {
        return;
      } 
    } finally {
      try {
        if (httpConnection != null)
          httpConnection.close(); 
      } catch (IOException iOException) {}
    } 
  }
  
  public final String a(String paramString) {
    int i = paramString.indexOf("Result");
    return (paramString.indexOf("Error:", i) > -1) ? ", ошибка при проверки" : ((paramString.indexOf("Offline", i) > -1) ? " не в сети" : ((paramString.indexOf("Online", i) > -1) ? " в сети" : ((paramString.indexOf("Away", i) > -1) ? " отсутствует" : ((paramString.indexOf("Invisible", i) > -1) ? " невидим" : ((paramString.indexOf("Occupied", i) > -1) ? " занят" : ((paramString.indexOf("DND", i) > -1) ? " просит не беспокоить" : ((paramString.indexOf("N/A", i) > -1) ? " недоступен" : ((paramString.indexOf("Free for chat", i) > -1) ? " готов чатиться" : ", статус не определен"))))))));
  }
  
  private final void b() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      this.c = dataInputStream.readInt();
      this.b[0] = dataInputStream.readBoolean();
      this.b[1] = dataInputStream.readBoolean();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void c() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    this.c = this.g.getSelectedIndex();
    this.f.getSelectedFlags(this.b);
    try {
      dataOutputStream.writeInt(this.c);
      dataOutputStream.writeBoolean(this.b[0]);
      dataOutputStream.writeBoolean(this.b[1]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public final I b(String paramString) {
    byte b = 14;
    if (paramString.indexOf("не в сети") > -1) {
      b = 6;
    } else if (paramString.indexOf("в сети") > -1) {
      b = 7;
    } else if (paramString.indexOf("невидим") > -1) {
      b = 3;
    } else if (paramString.indexOf("отсутствует") > -1) {
      b = 0;
    } else if (paramString.indexOf("занят") > -1) {
      b = 5;
    } else if (paramString.indexOf("просит") > -1) {
      b = 2;
    } else if (paramString.indexOf("недоступен") > -1) {
      b = 4;
    } else if (paramString.indexOf("готов") > -1) {
      b = 1;
    } 
    return (I)request(14, new Object[] { request(13, null, new Integer(0)), new Integer(b) }null);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgInvis.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */