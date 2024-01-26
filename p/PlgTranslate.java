package p;

import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextBox;

public class PlgTranslate extends PI implements CommandListener, Runnable {
  public TextBox a;
  
  private Form h;
  
  private Command i = new Command("Back", 2, 2);
  
  private Command j;
  
  private Command k;
  
  public String[] b = new String[] { 
      "Не показывать кнопку", "Англо-русский", "Русско-английский", "Немецко-русский", "Русско-немецкий", "Французско-русский", "Русско-французский", "Испанско-русский", "Русско-испанский", "Итальянско-русский", 
      "Англо-немецкий", "Немецко-английский", "Английско-французский", "Французско-английский", "Французско-немецкий", "Немецко-французский", "Англо-испанский", "Испанско-английский", "Французско-испанский", "Испанско-французский", 
      "Англо-португальский", "Португальско-английский", "Немецко-испанский", "Испанско-немецкий", "Итальянско-английский" };
  
  public String[] c = new String[] { 
      "nn", "er", "re", "gr", "rg", "fr", "rf", "sr", "rs", "ir", 
      "eg", "ge", "ef", "fe", "fg", "gf", "es", "se", "fs", "sf", 
      "ep", "pe", "gs", "sg", "ie" };
  
  private ChoiceGroup l = new ChoiceGroup("Направление 1", 4, this.b, null);
  
  private ChoiceGroup m = new ChoiceGroup("Направление 2", 4, this.b, null);
  
  public Vector d;
  
  public Vector e;
  
  public Vector f;
  
  public Vector g;
  
  private String n;
  
  public PlgTranslate() {
    this.l.setSelectedIndex(1, true);
    this.m.setSelectedIndex(2, true);
    this.d = new Vector();
    this.e = new Vector();
    this.f = new Vector();
    this.g = new Vector();
    this.n = "er";
  }
  
  public String getName() {
    return "Переводчик";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    switch (paramInt) {
      case 2:
        a((Display)paramObject);
        return null;
      case 0:
        a(request(7, null, null));
        return null;
      case 26:
        return this.d;
      case 27:
        return (this.l.getSelectedIndex() == 0) ? ((this.m.getSelectedIndex() == 0) ? null : this.g) : ((this.m.getSelectedIndex() == 0) ? this.f : this.e);
      case 28:
        if (paramObject == this.j) {
          this.n = this.c[this.l.getSelectedIndex()];
        } else if (paramObject == this.k) {
          this.n = this.c[this.m.getSelectedIndex()];
        } else {
          return null;
        } 
        this.a = (TextBox)paramArrayOfObject[0];
        (new Thread(this)).start();
        return null;
    } 
    return null;
  }
  
  private String a(String paramString) {
    paramString = (paramString = (paramString = paramString.replace(' ', '+')).replace('\n', '+')).replace('\t', '+');
    try {
      byte[] arrayOfByte1 = paramString.getBytes("utf-8");
      paramString = "";
      for (byte b = 0; b < arrayOfByte1.length; b++) {
        String str1 = (str1 = "00" + Integer.toHexString(arrayOfByte1[b] & 0xFF)).substring(str1.length() - 2);
        paramString = paramString + "%" + str1;
      } 
    } catch (UnsupportedEncodingException unsupportedEncodingException2) {
      UnsupportedEncodingException unsupportedEncodingException1;
      (unsupportedEncodingException1 = null).printStackTrace();
      return null;
    } 
    String str = "http://m.translate.ru/translator/result/?text=" + paramString + "&dirCode=" + this.n;
    StringBuffer stringBuffer = new StringBuffer();
    byte[] arrayOfByte = new byte[0];
    try {
      HttpConnection httpConnection;
      (httpConnection = (HttpConnection)Connector.open(str, 3, false)).setRequestMethod("GET");
      httpConnection.setRequestProperty("Connection", "close");
      OutputStream outputStream = null;
      (outputStream = httpConnection.openOutputStream()).write(arrayOfByte);
      outputStream.close();
      InputStream inputStream = httpConnection.openInputStream();
      int i;
      if ((i = httpConnection.getResponseCode()) != 200)
        return null; 
      httpConnection.getType();
      byte[] arrayOfByte1 = new byte[5000];
      httpConnection.getLength();
      byte b = 0;
      int j;
      while ((j = inputStream.read()) != -1 && b < '썐')
        arrayOfByte1[b++] = (byte)j; 
      byte[] arrayOfByte2 = new byte[b];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, b);
      String str1;
      int k;
      if ((k = (str1 = new String(arrayOfByte2, "utf-8")).indexOf("<br/><div class=\"tres\">") + 23) < 40)
        return null; 
      int m = str1.indexOf("</div", k) - 1;
      a(k, m, str1, stringBuffer);
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return exception1.getClass().toString();
    } 
    return stringBuffer.toString();
  }
  
  private static void a(int paramInt1, int paramInt2, String paramString, StringBuffer paramStringBuffer) {
    while (paramInt1 <= paramInt2) {
      if (paramString.charAt(paramInt1) != '&' || paramString.charAt(paramInt1 + 1) != '#') {
        paramStringBuffer.append(paramString.charAt(paramInt1++));
        continue;
      } 
      int i;
      if ((i = paramString.indexOf(';', paramInt1)) - paramInt1 > 8 || i == -1) {
        paramStringBuffer.append(paramString.charAt(paramInt1++));
        continue;
      } 
      try {
        char c = (char)Integer.parseInt(paramString.substring(paramInt1 + 2, i));
        paramStringBuffer.append(c);
        paramInt1 = i + 1;
      } catch (Exception exception) {
        paramStringBuffer.append(paramString.charAt(paramInt1++));
      } 
    } 
  }
  
  private void a(Object paramObject) {
    if (paramObject != null && paramObject instanceof byte[]) {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
      try {
        dataInputStream.readInt();
        boolean bool = false;
        this.l.setSelectedIndex(dataInputStream.readInt(), true);
        this.m.setSelectedIndex(dataInputStream.readInt(), true);
        b();
        return;
      } catch (IOException iOException) {
        b();
      } 
    } 
  }
  
  private void a() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(0);
      dataOutputStream.writeInt(this.l.getSelectedIndex());
      dataOutputStream.writeInt(this.m.getSelectedIndex());
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.i) {
      request(1, null, new Integer(0));
      b();
      a();
    } 
  }
  
  private void b() {
    this.j = new Command("Перевод " + this.c[this.l.getSelectedIndex()], 8, 4);
    this.k = new Command("Перевод " + this.c[this.m.getSelectedIndex()], 8, 4);
    this.d.addElement(this.j);
    this.d.addElement(this.k);
    this.e.removeAllElements();
    this.f.removeAllElements();
    this.g.removeAllElements();
    this.e.addElement(this.j);
    this.e.addElement(this.k);
    this.f.addElement(this.j);
    this.g.addElement(this.k);
  }
  
  private void a(Display paramDisplay) {
    if (this.h == null) {
      this.h = new Form("Transl");
      this.h.append("Каждый запрос примерно 3К трафика.");
      this.h.addCommand(this.i);
      this.h.append((Item)this.l);
      this.h.append((Item)this.m);
      this.h.setCommandListener(this);
    } 
    paramDisplay.setCurrent((Displayable)this.h);
  }
  
  public void run() {
    this.a.setString(this.a.getString() + "\n----\n" + a(this.a.getString()));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgTranslate.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */