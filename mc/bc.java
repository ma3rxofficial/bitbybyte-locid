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
import javax.microedition.lcdui.List;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class bc extends List implements CommandListener {
  public aw a;
  
  public bc(aw paramaw) {
    super(bn.cQ, 3);
    this.a = paramaw;
    try {
      a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void a() throws Exception {
    b();
    setCommandListener(this);
    addCommand(new Command(bn.eM, 2, 1));
    addCommand(new Command(bn.cT, 8, 1));
    addCommand(new Command(bn.cR, 8, 1));
    addCommand(new Command(bn.cS, 8, 1));
    if (size() > 0)
      setSelectedIndex(0, true); 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.cR)) {
      String str;
      if ((str = (this.a.e[this.a.f]).s).length() == 0)
        str = "/"; 
      if (str != ".." && str.endsWith("/")) {
        int i = 0;
        for (byte b = 0; b < size(); b++) {
          String str1;
          if ((str1 = getString(b)).equals(str))
            return; 
          if (str.compareTo(str1) > 0)
            i = b + 1; 
        } 
        insert(i, str, null);
        c();
      } 
      return;
    } 
    if (paramCommand.getLabel().equals(bn.cS)) {
      if (size() > 0) {
        delete(getSelectedIndex());
        c();
        return;
      } 
    } else if ((paramCommand.getLabel().equals(bn.cT) || paramCommand.getCommandType() == 1) && size() > 0) {
      String str;
      if ((str = getString(getSelectedIndex())).equals("/"))
        str = ""; 
      (this.a.e[this.a.f]).s = str;
      this.a.e[this.a.f].d();
      this.a.e(this.a.f);
      this.a.repaint();
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
    } 
  }
  
  private void a(Vector paramVector, int paramInt1, int paramInt2) {
    if (paramInt2 < paramInt1)
      return; 
    String str2 = null;
    int i = paramInt1;
    int j = paramInt2;
    String str1 = ((String)paramVector.elementAt((i + j) / 2)).toLowerCase();
    while (true) {
      while (((String)paramVector.elementAt(i)).toLowerCase().compareTo(str1) < 0)
        i++; 
      while (((String)paramVector.elementAt(j)).toLowerCase().compareTo(str1) > 0)
        j--; 
      if (i <= j) {
        str2 = paramVector.elementAt(i);
        paramVector.setElementAt(paramVector.elementAt(j), i);
        paramVector.setElementAt(str2, j);
        i++;
        j--;
      } 
      if (i > j) {
        if (j > paramInt1)
          a(paramVector, paramInt1, j); 
        if (i < paramInt2)
          a(paramVector, i, paramInt2); 
        return;
      } 
    } 
  }
  
  private boolean b() {
    try {
      String str = null;
      RecordStore recordStore;
      RecordEnumeration recordEnumeration;
      if ((recordEnumeration = (recordStore = RecordStore.openRecordStore("MiniCommanderBookmarks", true)).enumerateRecords(null, null, false)).hasNextElement()) {
        byte[] arrayOfByte = recordEnumeration.nextRecord();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
          Vector vector = new Vector();
          try {
            while (true) {
              str = dataInputStream.readUTF();
              vector.addElement(str);
            } 
          } catch (Exception exception) {
            a(vector, 0, vector.size() - 1);
            for (byte b = 0; b < vector.size(); b++)
              append(vector.elementAt(b), null); 
            dataInputStream.close();
            byteArrayInputStream.close();
          } 
        } catch (Exception exception) {}
      } 
      recordStore.closeRecordStore();
    } catch (Exception exception) {
      try {
        RecordStore.deleteRecordStore("MiniCommanderBookmarks");
      } catch (Exception exception1) {}
      return false;
    } 
    return true;
  }
  
  private boolean c() {
    try {
      RecordStore.deleteRecordStore("MiniCommanderBookmarks");
    } catch (RecordStoreException recordStoreException) {}
    try {
      RecordStore recordStore = RecordStore.openRecordStore("MiniCommanderBookmarks", true);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      try {
        for (byte b = 0; b < size(); b++) {
          String str;
          if ((str = getString(b)).length() > 0)
            dataOutputStream.writeUTF(str); 
        } 
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
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bc.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */