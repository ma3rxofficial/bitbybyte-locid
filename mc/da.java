package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class da extends Form implements CommandListener {
  public TextField a;
  
  public TextField b;
  
  public TextField c;
  
  public aw d;
  
  public static String e = "zip jar nth";
  
  public static String[] f;
  
  public static String g = "txt php htm html xml css js";
  
  public static String[] h;
  
  public static String i = "3gp mp4";
  
  public static String[] j;
  
  public da(aw paramaw) {
    super(bn.dQ);
    this.d = paramaw;
    d();
    try {
      b();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void b() throws Exception {
    append((Item)(this.a = new TextField("ZIP", e, 200, 0)));
    append((Item)(this.b = new TextField(bn.dR, g, 200, 0)));
    append((Item)(this.c = new TextField(bn.dS, i, 200, 0)));
    setCommandListener(this);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2)
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.d); 
    if (paramCommand.getCommandType() == 4) {
      e = this.a.getString().toLowerCase();
      g = this.b.getString().toLowerCase();
      i = this.c.getString().toLowerCase();
      c();
      d();
      this.d.e[0].e();
      this.d.e[1].e();
      this.d.e(-1);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.d);
    } 
  }
  
  public static boolean a() {
    try {
      RecordStore recordStore;
      RecordEnumeration recordEnumeration;
      if ((recordEnumeration = (recordStore = RecordStore.openRecordStore("MiniCommanderFileTypes", true)).enumerateRecords(null, null, false)).hasNextElement()) {
        byte[] arrayOfByte = recordEnumeration.nextRecord();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
          e = dataInputStream.readUTF();
          g = dataInputStream.readUTF();
          i = dataInputStream.readUTF();
          dataInputStream.close();
          byteArrayInputStream.close();
        } catch (Exception exception) {}
      } 
      recordStore.closeRecordStore();
    } catch (Exception exception) {
      try {
        RecordStore.deleteRecordStore("MiniCommanderFileTypes");
      } catch (Exception exception1) {}
      return false;
    } 
    d();
    return true;
  }
  
  private static boolean c() {
    try {
      RecordStore.deleteRecordStore("MiniCommanderFileTypes");
    } catch (RecordStoreException recordStoreException) {}
    try {
      RecordStore recordStore = RecordStore.openRecordStore("MiniCommanderFileTypes", true);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      try {
        dataOutputStream.writeUTF(e);
        dataOutputStream.writeUTF(g);
        dataOutputStream.writeUTF(i);
        dataOutputStream.close();
        byteArrayOutputStream.close();
      } catch (IOException iOException) {}
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
      recordStore.closeRecordStore();
    } catch (RecordStoreException recordStoreException) {
      return false;
    } 
    return true;
  }
  
  private static boolean a(String[] paramArrayOfString, String paramString) {
    String str = cx.h(paramString).toLowerCase();
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (paramArrayOfString[b].equals(str))
        return true; 
    } 
    return false;
  }
  
  public static boolean a(String paramString) {
    return a(f, paramString);
  }
  
  public static boolean b(String paramString) {
    return a(h, paramString);
  }
  
  public static boolean c(String paramString) {
    return a(j, paramString);
  }
  
  private static void d() {
    f = d(e);
    h = d(g);
    j = d(i);
  }
  
  private static String[] d(String paramString) {
    Vector vector = new Vector();
    byte b = 0;
    while (b < paramString.length()) {
      while (b < paramString.length() && paramString.charAt(b) == ' ')
        b++; 
      if (b == paramString.length())
        break; 
      byte b1 = b;
      while (b < paramString.length() && paramString.charAt(b) != ' ')
        b++; 
      String str;
      if ((str = paramString.substring(b1, b)).length() > 0)
        vector.addElement(str); 
    } 
    String[] arrayOfString = new String[vector.size()];
    for (b = 0; b < vector.size(); b++)
      arrayOfString[b] = vector.elementAt(b); 
    return arrayOfString;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\da.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */