import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class ci implements Runnable {
  private static ci a = new ci();
  
  private static Vector b = new Vector();
  
  private static Vector c = new Vector();
  
  private static Vector d = new Vector();
  
  private static long e;
  
  public static void a() {
    (new Thread(a)).start();
  }
  
  public final void run() {
    ew.e = dh.a(false, true);
    for (int i = bi.e() - 1; i >= 0; i--) {
      dm dm;
      (dm = bi.b(i)).a(196, b(dm.getUinString()));
      try {
        Thread.sleep(1L);
      } catch (InterruptedException interruptedException) {}
    } 
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2) {
    a(paramString);
    dm dm = bi.a(paramString);
    if (b.size() <= 0)
      b(); 
    if (dm != null && c(paramString) == -1 && paramInt1 != 0 && paramInt2 != 0 && !dm.getBooleanValue(8) && !dm.getBooleanValue(32)) {
      b.addElement(paramString);
      c.addElement(String.valueOf(paramInt1));
      d.addElement(String.valueOf(paramInt2));
      dm.a(196, b(paramString));
      c();
    } 
  }
  
  public static void a(String paramString) {
    int i;
    if ((i = c(paramString)) != -1) {
      b.removeElementAt(i);
      c.removeElementAt(i);
      d.removeElementAt(i);
      c();
    } 
  }
  
  public static int b(String paramString) {
    if (b.size() <= 0)
      b(); 
    int i;
    if ((i = b.indexOf(paramString)) == -1)
      return i; 
    int j = Integer.parseInt(c.elementAt(i));
    int k = Integer.parseInt(d.elementAt(i));
    int m;
    e = dh.a(m = dh.a(ew.e)[5], k, j, 0, 0, 0);
    if (e < ew.e)
      e = dh.a(m + 1, k, j, 0, 0, 0); 
    long l = ew.e;
    for (byte b = 0; b < 3; b++) {
      if (l == e)
        return b; 
      l += 86400L;
    } 
    return -1;
  }
  
  private static int c(String paramString) {
    return b.indexOf(paramString);
  }
  
  private static void b() {
    try {
      e();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static void c() {
    try {
      d();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static void d() throws IOException, RecordStoreException {
    RecordStore recordStore = RecordStore.openRecordStore("birthday", true);
    while (recordStore.getNumRecords() < 2)
      recordStore.addRecord(null, 0, 0); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    int i = c.size() * 3;
    byte b1 = 0;
    for (byte b2 = 0; i > b1; b2++) {
      dataOutputStream.writeByte(b1);
      dataOutputStream.writeInt(Integer.parseInt(b.elementAt(b2)));
      dataOutputStream.writeByte(++b1);
      dataOutputStream.writeInt(Integer.parseInt(c.elementAt(b2)));
      dataOutputStream.writeByte(++b1);
      dataOutputStream.writeInt(Integer.parseInt(d.elementAt(b2)));
      b1++;
    } 
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    recordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
    recordStore.closeRecordStore();
  }
  
  private static void e() throws IOException, RecordStoreException {
    RecordStore recordStore;
    byte[] arrayOfByte = (recordStore = RecordStore.openRecordStore("birthday", false)).getRecord(1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    while (dataInputStream.available() > 0) {
      dataInputStream.readUnsignedByte();
      b.addElement(String.valueOf(dataInputStream.readInt()));
      dataInputStream.readUnsignedByte();
      c.addElement(String.valueOf(dataInputStream.readInt()));
      dataInputStream.readUnsignedByte();
      d.addElement(String.valueOf(dataInputStream.readInt()));
    } 
    recordStore.closeRecordStore();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ci.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */