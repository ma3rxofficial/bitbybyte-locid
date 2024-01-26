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
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class bu extends List implements CommandListener, DiscoveryListener {
  public aw a;
  
  public bu b;
  
  public Command c;
  
  public Command d;
  
  public Command e;
  
  public Command f;
  
  public static mc/aq g;
  
  public boolean h = false;
  
  public Vector i = new Vector();
  
  public Vector j = new Vector();
  
  public String k = "";
  
  public LocalDevice l;
  
  public DiscoveryAgent m;
  
  public Form n = null;
  
  public Gauge o = null;
  
  public boolean p = false;
  
  public bu(aw paramaw) {
    super("Bluetooth", 3);
    this.a = paramaw;
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
    this.b = this;
    f();
    setCommandListener(this);
    c();
  }
  
  private void c() {
    addCommand(this.c = new Command(bn.eL, 2, 1));
    addCommand(this.d = new Command(bn.eo, 8, 1));
    addCommand(this.e = new Command(bn.dT, 8, 1));
    addCommand(this.f = new Command(bn.dW, 8, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    this.k = "";
    if (this.p) {
      if (paramCommand.getCommandType() == 2) {
        this.m.cancelInquiry(this);
        return;
      } 
    } else {
      if (paramCommand.getCommandType() == 2) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
        return;
      } 
      if (paramCommand.getLabel().equals(bn.eo)) {
        removeCommand(this.c);
        removeCommand(this.d);
        removeCommand(this.e);
        removeCommand(this.f);
        e();
        c();
        return;
      } 
      if (paramCommand.getLabel().equals(bn.dW)) {
        int j;
        if ((j = getSelectedIndex()) != -1) {
          delete(j);
          this.i.removeElementAt(j);
          a();
        } 
        return;
      } 
      int i;
      if ((paramCommand.getLabel().equals(bn.dT) || paramCommand.getCommandType() == 1) && size() > 0 && (i = getSelectedIndex()) != -1) {
        g = this.i.elementAt(i);
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
        cj cj;
        (cj = new cj(this)).start();
        Thread.yield();
      } 
    } 
  }
  
  public final void deviceDiscovered(RemoteDevice paramRemoteDevice, DeviceClass paramDeviceClass) {
    this.j.addElement(paramRemoteDevice);
  }
  
  public final void inquiryCompleted(int paramInt) {
    this.h = true;
  }
  
  public final void serviceSearchCompleted(int paramInt1, int paramInt2) {
    this.h = true;
  }
  
  public final void servicesDiscovered(int paramInt, ServiceRecord[] paramArrayOfServiceRecord) {}
  
  private void a(String paramString) {
    this.k += paramString + "\r\n";
  }
  
  private void d() {
    by by;
    (by = new by(this)).start();
    Thread.yield();
  }
  
  private void e() {
    deleteAll();
    this.k = "";
    append(bn.ep, null);
    try {
      this.h = false;
      this.j = new Vector();
      this.n = new Form("Bluetooth");
      this.o = new Gauge(bn.ep, false, 100, 0);
      this.n.append((Item)this.o);
      this.n.addCommand(new Command(bn.eN, 2, 1));
      this.n.setCommandListener(this);
      this.p = true;
      d();
      r r;
      (r = new r(this)).start();
      Thread.yield();
      byte b = 0;
      try {
        while (!this.h) {
          this.o.setValue(b);
          if (++b > 100)
            b = 0; 
          Thread.sleep(150L);
        } 
      } catch (InterruptedException interruptedException) {}
      this.l.setDiscoverable(0);
      deleteAll();
      for (b = 0; b < this.j.size(); b++) {
        RemoteDevice remoteDevice = this.j.elementAt(b);
        String str1 = "";
        String str2 = "";
        try {
          str1 = remoteDevice.getFriendlyName(true);
        } catch (IOException iOException) {
          a("Exception 2: " + iOException.toString() + " : " + iOException.getMessage());
        } 
        try {
          str2 = remoteDevice.getBluetoothAddress();
        } catch (Exception exception) {
          a("Exception 3: " + exception.toString() + " : " + exception.getMessage());
        } 
        if (str1.length() == 0)
          str1 = "btspp://" + str2; 
        boolean bool = true;
        for (byte b1 = 0; b1 < this.i.size(); b1++) {
          if (((mc/aq)this.i.elementAt(b1)).c.equals(str2)) {
            bool = false;
            break;
          } 
        } 
        if (bool) {
          mc/aq mc/aq1;
          (mc/aq1 = new mc/aq(this)).a = remoteDevice;
          mc/aq1.b = str1;
          mc/aq1.c = str2;
          this.i.addElement(mc/aq1);
        } 
      } 
      this.p = false;
      d();
      this.n = null;
      for (b = 0; b < this.i.size(); b++)
        append(((mc/aq)this.i.elementAt(b)).b, null); 
    } catch (Exception exception) {
      a("Exception 4: " + exception.getMessage());
    } 
    if (this.k.length() > 0)
      cx.a("Log", this.k, (Displayable)this); 
  }
  
  private boolean f() {
    this.i.removeAllElements();
    deleteAll();
    try {
      Object object = null;
      RecordStore recordStore;
      RecordEnumeration recordEnumeration;
      if ((recordEnumeration = (recordStore = RecordStore.openRecordStore("MiniCommanderBTList", true)).enumerateRecords(null, null, false)).hasNextElement()) {
        byte[] arrayOfByte = recordEnumeration.nextRecord();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
          try {
            while (true) {
              mc/aq mc/aq1;
              (mc/aq1 = new mc/aq(this)).b = dataInputStream.readUTF();
              mc/aq1.c = dataInputStream.readUTF();
              mc/aq1.d = dataInputStream.readUTF();
              this.i.addElement(mc/aq1);
              append(mc/aq1.b, null);
            } 
          } catch (Exception exception) {
            dataInputStream.close();
            byteArrayInputStream.close();
          } 
        } catch (Exception exception) {}
      } 
      recordStore.closeRecordStore();
    } catch (Exception exception) {
      try {
        RecordStore.deleteRecordStore("MiniCommanderBTList");
      } catch (Exception exception1) {}
      return false;
    } 
    return true;
  }
  
  public final boolean a() {
    try {
      RecordStore.deleteRecordStore("MiniCommanderBTList");
    } catch (RecordStoreException recordStoreException) {}
    try {
      RecordStore recordStore = RecordStore.openRecordStore("MiniCommanderBTList", true);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
      try {
        for (byte b = 0; b < this.i.size(); b++) {
          mc/aq mc/aq1;
          if ((mc/aq1 = this.i.elementAt(b)).d.length() != 0) {
            dataOutputStream.writeUTF(mc/aq1.b);
            dataOutputStream.writeUTF(mc/aq1.c);
            dataOutputStream.writeUTF(mc/aq1.d);
          } 
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
  
  class mc/aq {
    public RemoteDevice a = null;
    
    public String b = "";
    
    public String c = "";
    
    public String d = "";
    
    public mc/aq(bu this$0) {}
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bu.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */