package mc;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.LocalDevice;
import javax.microedition.lcdui.Displayable;

public final class r extends Thread {
  private final bu a;
  
  public r(bu parambu) {
    this.a = parambu;
  }
  
  public final void run() {
    try {
      this.a.l = LocalDevice.getLocalDevice();
      this.a.l.setDiscoverable(10390323);
      this.a.m = this.a.l.getDiscoveryAgent();
      this.a.m.startInquiry(10390323, this.a.b);
      return;
    } catch (BluetoothStateException bluetoothStateException) {
      cx.a(bn.eq, bluetoothStateException.toString() + " : " + bluetoothStateException.getMessage(), (Displayable)this.a.b);
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\r.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */