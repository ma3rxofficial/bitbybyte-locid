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

public final class dm extends List implements CommandListener {
  public aw a;
  
  public Vector b = new Vector();
  
  public o c = null;
  
  public dm(aw paramaw) {
    super("FTP", 3);
    this.a = paramaw;
    try {
      c();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void c() throws Exception {
    setCommandListener(this);
    d();
    a();
    addCommand(new Command(bn.eL, 2, 1));
    addCommand(new Command(bn.dT, 8, 1));
    addCommand(new Command(bn.dU, 8, 1));
    addCommand(new Command(bn.dV, 8, 1));
    addCommand(new Command(bn.dW, 8, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    int i;
    if ((i = getSelectedIndex()) >= 0)
      this.c = this.b.elementAt(i); 
    if (paramCommand.getCommandType() == 2) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.dU)) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new al(this, null, 0));
      return;
    } 
    if (paramCommand.getLabel().equals(bn.dV)) {
      if (i >= 0) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new al(this, this.c, 1));
        return;
      } 
    } else if (paramCommand.getLabel().equals(bn.dW)) {
      if (i >= 0) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new al(this, this.c, 2));
        return;
      } 
    } else if ((paramCommand.getLabel().equals(bn.dT) || paramCommand.getCommandType() == 1) && size() > 0) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      bd bd;
      (bd = new bd(this)).start();
      Thread.yield();
    } 
  }
  
  public final void a() {
    deleteAll();
    for (byte b = 0; b < this.b.size(); b++)
      append(((o)this.b.elementAt(b)).a, null); 
  }
  
  private boolean d() {
    this.b.removeAllElements();
    try {
      String str = new String();
      RecordStore recordStore;
      RecordEnumeration recordEnumeration;
      if ((recordEnumeration = (recordStore = RecordStore.openRecordStore("MiniCommanderFTPList", true)).enumerateRecords(null, null, false)).hasNextElement()) {
        byte[] arrayOfByte = recordEnumeration.nextRecord();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
          while (true) {
            try {
              o o1;
              (o1 = new o()).a = dataInputStream.readUTF();
              o1.b = dataInputStream.readUTF();
              o1.c = dataInputStream.readInt();
              o1.d = dataInputStream.readUTF();
              int i;
              byte[] arrayOfByte1 = new byte[i = dataInputStream.readInt()];
              for (byte b = 0; b < i; b++)
                arrayOfByte1[b] = (byte)(dataInputStream.readByte() ^ 0x75); 
              o1.e = new String(arrayOfByte1, "UTF-8");
              o1.f = dataInputStream.readUTF();
              o1.g = dataInputStream.readBoolean();
              this.b.addElement(o1);
            } catch (Exception exception) {}
            append(str, null);
          } 
        } catch (Exception exception) {}
      } 
      recordStore.closeRecordStore();
    } catch (Exception exception) {
      try {
        RecordStore.deleteRecordStore("MiniCommanderFTPList");
      } catch (Exception exception1) {}
      return false;
    } 
    return true;
  }
  
  public final boolean b() {
    try {
      RecordStore.deleteRecordStore("MiniCommanderFTPList");
    } catch (RecordStoreException recordStoreException) {}
    try {
      RecordStore recordStore = RecordStore.openRecordStore("MiniCommanderFTPList", true);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      try {
        for (byte b = 0; b < this.b.size(); b++) {
          o o1 = this.b.elementAt(b);
          dataOutputStream.writeUTF(o1.a);
          dataOutputStream.writeUTF(o1.b);
          dataOutputStream.writeInt(o1.c);
          dataOutputStream.writeUTF(o1.d);
          byte[] arrayOfByte1 = o1.e.getBytes("UTF-8");
          dataOutputStream.writeInt(arrayOfByte1.length);
          for (byte b1 = 0; b1 < arrayOfByte1.length; b1++)
            dataOutputStream.writeByte(arrayOfByte1[b1] ^ 0x75); 
          dataOutputStream.writeUTF(o1.f);
          dataOutputStream.writeBoolean(o1.g);
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


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\dm.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */