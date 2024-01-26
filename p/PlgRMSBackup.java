package p;

import i.PI;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

public class PlgRMSBackup extends PI implements CommandListener {
  public ChoiceGroup a;
  
  private boolean[] b;
  
  private String c = "/c:/other/locid.rms";
  
  private Display d;
  
  private Form e;
  
  private Command f;
  
  private Command g;
  
  private Command h;
  
  private Command i;
  
  private Command j;
  
  private TextField k;
  
  public String getName() {
    return "RMS сохранение by Medvedev";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    switch (paramInt) {
      case 0:
        this.d = (Display)paramObject;
        return null;
      case 2:
        this.d = (Display)paramObject;
      case 39:
        a(this.d);
        return null;
      case 37:
        this.c = this.k.getString();
        if (paramObject != null) {
          c();
        } else {
          b();
        } 
        return null;
      case 40:
        if (paramObject != null)
          this.k.setString((String)paramObject); 
        this.d.setCurrent((Displayable)this.e);
        return null;
    } 
    return null;
  }
  
  public final void a(Display paramDisplay) {
    this.f = new Command("Выход", 2, 0);
    this.g = new Command("Информация", 8, 0);
    this.h = new Command("Архивирование", 8, 0);
    this.i = new Command("Восстановление", 8, 0);
    this.j = new Command("Выбрать файл", 8, 0);
    this.d = paramDisplay;
    this.e = new Form("RMSBackup");
    this.e.addCommand(this.f);
    this.e.addCommand(this.j);
    this.e.addCommand(this.g);
    this.e.addCommand(this.h);
    this.e.addCommand(this.i);
    this.e.setCommandListener(this);
    this.k = new TextField("Архив:", this.c, 255, 0);
    this.e.append((Item)this.k);
    this.a = new ChoiceGroup("Опции", 2, new String[] { "Опции", "Историю", "КонтактЛист", "Аватар", "Plugins", "Остальное" }, null);
    for (byte b = 0; b < 6; b++)
      this.a.setSelectedIndex(b, true); 
    this.b = new boolean[6];
    this.e.append((Item)this.a);
    this.d.setCurrent((Displayable)this.e);
  }
  
  private boolean a(String paramString) {
    return paramString.startsWith("opt") ? (this.b[0]) : (paramString.startsWith("hist") ? (this.b[1]) : (paramString.startsWith("contactlist") ? (this.b[2]) : (paramString.startsWith("birthday") ? (this.b[2]) : (paramString.startsWith("av") ? (this.b[3]) : (paramString.startsWith("PLG") ? (this.b[4]) : (this.b[5]))))));
  }
  
  private void a() {
    request(1, null, new Integer(0));
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    this.a.getSelectedFlags(this.b);
    if (paramCommand == this.f) {
      a();
      return;
    } 
    if (paramCommand == this.h) {
      request(30, null, null);
      return;
    } 
    if (paramCommand == this.j) {
      request(43, null, null);
      return;
    } 
    if (paramCommand == this.i) {
      request(30, null, this);
      return;
    } 
    if (paramCommand == this.g) {
      Alert alert;
      (alert = new Alert("Информация")).setTimeout(-2);
      alert.setString("RMSBackuper\r\nMedvedev O.V.\r\nt. Severodvinsk, 2007\r\nУтилита для создания резервной копии данного приложения (RMS) в файловой системе телефона и восстанавления её от туда. Перед выполнением процедуры архивации/восстановления нужно выбрать файл архива. По умолчанию имя архива соответствует названию приложения с расширением rms. Архив находиться в папке /c:/other/ («Прочее»).\r\nPS: В архиве находитятся все ваши пароли, берегите их.\n После восстановления необходимо принудительно снять приложение.");
      this.d.setCurrent(alert, (Displayable)this.e);
    } 
  }
  
  private void b() {
    try {
      Object object;
      if ((object = request(46, null, this.k.getString())) == null)
        throw new Exception("Файл не найден"); 
      OutputStream outputStream;
      if ((outputStream = (OutputStream)request(48, null, object)) == null)
        throw new Exception("Невозможно открыть файл"); 
      DataOutputStream dataOutputStream1 = new DataOutputStream(outputStream);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(110000);
      DataOutputStream dataOutputStream2;
      (dataOutputStream2 = new DataOutputStream(byteArrayOutputStream)).writeInt(1380799232);
      String[] arrayOfString = RecordStore.listRecordStores();
      StringItem stringItem = new StringItem("", "");
      this.e.deleteAll();
      this.e.append((Item)stringItem);
      if (arrayOfString != null) {
        dataOutputStream2.writeInt(arrayOfString.length);
        for (byte b = 0; b < arrayOfString.length; b++) {
          if (a(arrayOfString[b])) {
            stringItem.setLabel(arrayOfString[b]);
            stringItem.setText("" + (b * 100 / arrayOfString.length) + "%");
            RecordStore recordStore = RecordStore.openRecordStore(arrayOfString[b], false);
            dataOutputStream2.writeUTF(recordStore.getName());
            int i = recordStore.getNextRecordID();
            dataOutputStream2.writeInt(i);
            for (byte b1 = 1; b1 < i; b1++) {
              try {
                byte[] arrayOfByte1 = new byte[recordStore.getRecordSize(b1)];
                recordStore.getRecord(b1, arrayOfByte1, 0);
                dataOutputStream2.writeInt(b1);
                dataOutputStream2.writeChar(43);
                dataOutputStream2.writeInt(arrayOfByte1.length);
                dataOutputStream2.write(arrayOfByte1);
              } catch (Exception exception) {
                dataOutputStream2.writeInt(b1);
                dataOutputStream2.writeChar(45);
              } 
            } 
            recordStore.closeRecordStore();
          } 
        } 
        if (byteArrayOutputStream.size() > 100000) {
          dataOutputStream2.flush();
          dataOutputStream1.write(byteArrayOutputStream.toByteArray());
          byteArrayOutputStream.reset();
        } 
      } else {
        dataOutputStream2.writeInt(0);
      } 
      dataOutputStream2.flush();
      byte[] arrayOfByte;
      if ((arrayOfByte = byteArrayOutputStream.toByteArray()).length != 0)
        dataOutputStream1.write(arrayOfByte); 
      dataOutputStream1.close();
      request(50, null, object);
      a();
      return;
    } catch (Exception exception) {
      Alert alert;
      (alert = new Alert("Исключение:")).setTimeout(-2);
      exception.printStackTrace();
      alert.setString(exception.getClass().getName() + " " + exception.getMessage());
      this.d.setCurrent(alert, (Displayable)this.e);
      return;
    } 
  }
  
  private void c() {
    try {
      Object object = request(45, null, this.k.getString());
      InputStream inputStream;
      if ((inputStream = (InputStream)request(47, null, object)) == null)
        throw new Exception("Невозможно прочитать файл"); 
      DataInputStream dataInputStream1 = new DataInputStream(inputStream);
      DataInputStream dataInputStream2;
      if ((dataInputStream2 = new DataInputStream(dataInputStream1)).readInt() == 1380799232) {
        StringItem stringItem = new StringItem("", "");
        this.e.deleteAll();
        this.e.append((Item)stringItem);
        int i = dataInputStream2.readInt();
        for (byte b = 0; b < i && dataInputStream2.available() > 0; b++) {
          String str = dataInputStream2.readUTF();
          stringItem.setLabel(str);
          stringItem.setText("" + (b * 100 / i) + "%");
          boolean bool = a(str);
          try {
            if (bool)
              RecordStore.deleteRecordStore(str); 
          } catch (Exception exception) {}
          RecordStore recordStore = null;
          if (bool)
            recordStore = RecordStore.openRecordStore(str, true); 
          int j = dataInputStream2.readInt();
          for (byte b1 = 1; b1 < j; b1++) {
            dataInputStream2.readInt();
            char c = dataInputStream2.readChar();
            int k = 0;
            if (bool)
              k = recordStore.addRecord(null, 0, 0); 
            if (c == '+') {
              int m;
              byte[] arrayOfByte = new byte[m = dataInputStream2.readInt()];
              dataInputStream2.read(arrayOfByte);
              if (bool)
                recordStore.setRecord(k, arrayOfByte, 0, arrayOfByte.length); 
            } 
          } 
          if (bool)
            recordStore.closeRecordStore(); 
        } 
      } 
      dataInputStream1.close();
      request(50, null, object);
      a();
      return;
    } catch (Exception exception) {
      Alert alert;
      (alert = new Alert("Исключение:")).setTimeout(-2);
      alert.setString(exception.getMessage() + " " + exception.getClass().getName());
      this.d.setCurrent(alert, (Displayable)this.e);
      exception.printStackTrace();
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgRMSBackup.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */