package p;

import i.C;
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
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextBox;

public class PlgColors extends PI implements CommandListener {
  private List g;
  
  private Command h = new Command("Назад", 2, 2);
  
  private Command i = new Command("Назад", 2, 2);
  
  private Command j = new Command("Применить цветовую схему", 8, 9);
  
  private Command k = new Command("В буфер", 8, 3);
  
  private Command l = new Command("Выбор", 4, 1);
  
  private Display m;
  
  private TextBox n;
  
  public String a = "";
  
  public boolean b;
  
  private Command o = new Command("Сохранить", 4, 1);
  
  public C c = null;
  
  public C d = null;
  
  public int e = 0;
  
  public Vector f = new Vector();
  
  public PlgColors() {
    this.f.addElement(this.j);
  }
  
  public String getName() {
    return "Мастер цветовой схемы";
  }
  
  public I getIcon() {
    Object object = request(13, null, new Integer(1));
    I i = null;
    if (object != null)
      i = (I)request(14, new Object[] { object, new Integer(32) }, null); 
    return i;
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    switch (paramInt) {
      case 0:
        this.m = (Display)paramObject;
        a(request(7, null, null));
        this.e = ((Integer)paramArrayOfObject[1]).intValue();
        return null;
      case 2:
        c();
        return null;
      case 39:
        if (paramObject instanceof C)
          this.c = (C)paramObject; 
        c();
        return null;
      case 16:
        return this.f;
      case 13:
        return this.f;
      case 15:
        if (paramObject == this.j)
          b(paramArrayOfObject, 3); 
        return null;
      case 14:
        return a(paramArrayOfObject, 3);
      case 18:
        if (paramObject == this.j)
          b(paramArrayOfObject, 2); 
        return null;
      case 17:
        if (paramObject instanceof C)
          this.c = (C)paramObject; 
        return a(paramArrayOfObject, 2);
      case 20:
        if (paramObject instanceof C)
          this.c = (C)paramObject; 
        return null;
      case 41:
        this.m.setCurrent((Displayable)this.g);
        this.b = true;
        request(30, paramArrayOfObject, paramObject);
        return null;
      case 40:
        this.m.setCurrent((Displayable)this.g);
        this.b = false;
        request(30, paramArrayOfObject, paramObject);
        return null;
      case 37:
        if (paramObject == null)
          return null; 
        try {
          if (!this.b) {
            InputStream inputStream = (InputStream)request(47, null, paramObject);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i;
            while ((i = inputStream.read()) != -1)
              byteArrayOutputStream.write(i); 
            inputStream.close();
            String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            a(str, (int[])request(16, null, null));
            break;
          } 
          OutputStream outputStream;
          (outputStream = (OutputStream)request(48, null, (String)paramObject + this.a)).write(b().getBytes("utf-8"));
          outputStream.close();
          Alert alert = new Alert("Info", "Сохранено в " + this.a, null, AlertType.INFO);
          this.m.setCurrent((Displayable)alert);
        } catch (IOException iOException) {}
        break;
    } 
    return null;
  }
  
  private Object a(Object[] paramArrayOfObject, int paramInt) {
    String str;
    return (paramArrayOfObject != null && paramArrayOfObject[paramInt] != null && (str = (String)paramArrayOfObject[paramInt]).length() > 1 && str.charAt(0) == '-' && str.startsWith("---theme")) ? this.f : null;
  }
  
  private void b(Object[] paramArrayOfObject, int paramInt) {
    String str;
    if (paramArrayOfObject != null && paramArrayOfObject[paramInt] != null && (str = (String)paramArrayOfObject[paramInt]).length() > 1 && str.charAt(0) == '-' && str.startsWith("---theme")) {
      request(51, null, str);
      request(10, null, null);
    } 
  }
  
  private static void a(Object paramObject) {
    if (paramObject == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
    try {
      dataInputStream.readInt();
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private void a() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(0);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.h) {
      request(1, null, new Integer(0));
      this.g = null;
    } 
    if (paramCommand == this.o) {
      this.a = this.n.getString();
      request(44, null, null);
    } 
    if (paramCommand == this.i) {
      c();
      this.n = null;
    } 
    if (paramCommand == this.j)
      a(this.n.getString(), (int[])request(16, null, null)); 
    if (paramCommand == this.k)
      request(21, null, this.n.getString()); 
    if (paramCommand == List.SELECT_COMMAND || paramCommand == this.l) {
      Alert alert;
      String[] arrayOfString;
      String str;
      a();
      int[] arrayOfInt = (int[])request(16, null, null);
      switch (this.g.getSelectedIndex()) {
        case 0:
          request(21, null, b());
          alert = new Alert("Инфо", "Цвета сохранены в буфер", null, AlertType.INFO);
          this.m.setCurrent((Displayable)alert);
          return;
        case 1:
          arrayOfString = new String[2];
          request(22, (Object[])arrayOfString, null);
          a(arrayOfString[0], arrayOfInt);
          return;
        case 2:
          this.n = new TextBox("Цветовая палитра", a(arrayOfInt, ' '), arrayOfInt.length * 12, 0);
          this.n.addCommand(this.i);
          this.n.addCommand(this.j);
          this.n.addCommand(this.k);
          this.n.setCommandListener(this);
          this.m.setCurrent((Displayable)this.n);
          return;
        case 5:
          if ((str = this.d.getUinString()).length() >= 5)
            request(8, (Object[])new String[] { str, b(), "yes" }, null); 
          request(52, null, str);
          return;
        case 3:
          request(43, null, null);
        case 4:
          this.a = request(17, new Object[] { new Integer(147) }, null).toString();
          this.n = new TextBox("Имя файла", this.a + ".lth", 100, 0);
          this.n.addCommand(this.i);
          this.n.addCommand(this.o);
          this.n.setCommandListener(this);
          this.m.setCurrent((Displayable)this.n);
          break;
      } 
    } 
  }
  
  private void a(String paramString, int[] paramArrayOfint) {
    request(17, new Object[] { new Integer(147), "Custom" }, null);
    if (paramString.startsWith("---theme")) {
      if (this.e >= 70) {
        request(51, null, paramString);
      } else {
        int i;
        if ((i = paramString.indexOf("600=")) > 0) {
          int j = paramString.indexOf('\n', i);
          paramString = paramString.substring(i + 4, j);
          b(paramString, paramArrayOfint);
        } 
      } 
    } else {
      b(paramString, paramArrayOfint);
    } 
    request(19, null, null);
    Alert alert = new Alert("Инфо", "Палитра применена", null, AlertType.INFO);
    this.m.setCurrent((Displayable)alert);
  }
  
  private static String a(int[] paramArrayOfint, char paramChar) {
    StringBuffer stringBuffer = new StringBuffer(paramArrayOfint.length * 7 + 10);
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      int i;
      String str = Integer.toHexString(i = paramArrayOfint[b] & 0xFFFFFF | 0x1000000).substring(1);
      stringBuffer.append(str).append(paramChar);
    } 
    return stringBuffer.toString().toUpperCase();
  }
  
  private String b() {
    int[] arrayOfInt = (int[])request(16, null, null);
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer(arrayOfInt.length * 7 + 10)).append("---theme\n");
    a(stringBuffer, 147);
    stringBuffer.append("600=");
    stringBuffer.append(a(arrayOfInt, ' '));
    stringBuffer.append('\n');
    a(stringBuffer, 254);
    a(stringBuffer, 82);
    a(stringBuffer, 240);
    a(stringBuffer, 244);
    stringBuffer.append("---end\n");
    return stringBuffer.toString();
  }
  
  private void a(StringBuffer paramStringBuffer, int paramInt) {
    paramStringBuffer.append("" + paramInt);
    paramStringBuffer.append("=");
    paramStringBuffer.append(request(17, new Object[] { new Integer(paramInt) }, null).toString());
    paramStringBuffer.append('\n');
  }
  
  private static String[] a(String paramString1, String paramString2) {
    if (paramString1.indexOf(paramString2) < 0)
      return new String[] { paramString1 }; 
    Vector vector = new Vector();
    int i = 0;
    int j;
    for (j = paramString1.indexOf(paramString2, 0); j >= 0; j = paramString1.indexOf(paramString2, i)) {
      vector.addElement(paramString1.substring(i, j));
      i = j + paramString2.length();
    } 
    if (i == paramString1.length()) {
      vector.addElement("");
    } else {
      vector.addElement(paramString1.substring(i, paramString1.length()));
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  private void b(String paramString, int[] paramArrayOfint) {
    if (paramString == null)
      return; 
    String[] arrayOfString = a(paramString = (paramString = (paramString = (paramString = (paramString = paramString.toUpperCase()).replace('\n', ' ')).replace('\t', ' ')).replace(',', ' ')).replace(';', ' '), " ");
    byte b1 = 0;
    for (byte b2 = 0; b2 < arrayOfString.length; b2++) {
      paramString = arrayOfString[b2];
      try {
        if (paramString.startsWith("0X"))
          paramString = paramString.substring(2); 
        if (!paramString.equals("")) {
          b1++;
          if (!paramString.equals("#") && !paramString.equals("-") && !paramString.equals("NONE") && !paramString.equals("NULL")) {
            int i = Integer.parseInt(paramString, 16);
            if (b1 - b2 < paramArrayOfint.length)
              paramArrayOfint[b1 - 1] = i; 
          } 
        } 
      } catch (Exception exception) {
        b1++;
      } 
    } 
  }
  
  private synchronized void c() {
    if (this.g == null) {
      this.g = new List("Мастер цветов", 3, new String[] { "Цвета в буфер", "Применить из буфера", "Редактировать", "Загрузить из файла", "Сохранить в файл" }, null);
      this.g.addCommand(this.l);
      this.g.addCommand(this.h);
      this.g.setCommandListener(this);
    } 
    if (this.c != null) {
      this.d = this.c;
      if (this.g.size() == 5)
        this.g.append("", null); 
      Object object = request(13, null, new Integer(0));
      I i = null;
      if (object != null)
        i = (I)request(14, new Object[] { object, new Integer(7) }, null); 
      Image image = null;
      if (i != null)
        image = i.createImage(); 
      this.g.set(5, "Посл. " + this.d.getText() + " [" + this.d.getUinString() + "]", image);
    } 
    this.m.setCurrent((Displayable)this.g);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgColors.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */