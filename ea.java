import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.rms.RecordStore;
import jimm.Jimm;

public final class ea {
  private static RecordStore a;
  
  private static dr b;
  
  private static String c = new String();
  
  private static Hashtable d;
  
  public ea() {
    try {
      RecordStore.deleteRecordStore("history");
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static synchronized void a(String paramString1, String paramString2, byte paramByte, String paramString3, long paramLong) {
    fb.a(19, (Object[])new String[] { paramString1, paramString2, (paramByte == 0) ? null : paramString1, paramString3, dh.a(false, true, paramLong) });
  }
  
  public static synchronized void a(String paramString1, String paramString2, byte paramByte, String paramString3, String paramString4) {
    boolean bool = false;
    RecordStore recordStore = null;
    if (b != null)
      if (b.c() == 0) {
        bool = true;
      } else if (b.t == b.c() - 1) {
        bool = true;
      }  
    boolean bool1 = c.equals(paramString1);
    try {
      DataOutputStream dataOutputStream;
      byte[] arrayOfByte3;
      recordStore = bool1 ? a : RecordStore.openRecordStore(d(paramString1), true);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      int j;
      switch (j = em.f(258)) {
        case 0:
          (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeUTF(paramString3);
          dataOutputStream.writeUTF(paramString2);
          dataOutputStream.writeUTF(paramString4);
          break;
        case 1:
        case 2:
          if ((arrayOfByte3 = dh.a(paramString3, true, (j == 2))).length < 128) {
            byteArrayOutputStream.write(arrayOfByte3.length);
          } else {
            byteArrayOutputStream.write((arrayOfByte3.length & 0x7F) + 128);
            byteArrayOutputStream.write(arrayOfByte3.length >> 7);
          } 
          byteArrayOutputStream.write(arrayOfByte3);
          if ((arrayOfByte3 = dh.a(paramString2, true, (j == 2))).length < 128) {
            byteArrayOutputStream.write(arrayOfByte3.length);
          } else {
            byteArrayOutputStream.write((arrayOfByte3.length & 0x7F) + 128);
            byteArrayOutputStream.write(arrayOfByte3.length >> 7);
          } 
          byteArrayOutputStream.write(arrayOfByte3);
          if ((arrayOfByte3 = dh.a(paramString4, true, (j == 2))).length < 128) {
            byteArrayOutputStream.write(arrayOfByte3.length);
          } else {
            byteArrayOutputStream.write((arrayOfByte3.length & 0x7F) + 128);
            byteArrayOutputStream.write(arrayOfByte3.length >> 7);
          } 
          byteArrayOutputStream.write(arrayOfByte3);
          break;
      } 
      byte[] arrayOfByte1;
      byte[] arrayOfByte2;
      int i;
      dh.a(arrayOfByte1 = new byte[(i = (arrayOfByte2 = byteArrayOutputStream.toByteArray()).length) + 1], 0, recordStore.getNextRecordID());
      arrayOfByte1[0] = (byte)(paramByte + (j << 1));
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 1, i);
      recordStore.addRecord(arrayOfByte1, 0, arrayOfByte1.length);
      if (!bool1 && recordStore != null)
        recordStore.closeRecordStore(); 
    } catch (Exception exception) {}
    if (b != null && dr.z().equals(paramString1)) {
      b.e();
      if (bool)
        b.p(b.c() - 1); 
    } 
  }
  
  public static RecordStore a() {
    return a;
  }
  
  private static String d(String paramString) {
    return "hist" + paramString;
  }
  
  private static void e(String paramString) {
    if (c.equals(paramString))
      return; 
    try {
      if (a != null) {
        a.closeRecordStore();
        a = null;
        dw.i();
      } 
      a = RecordStore.openRecordStore(d(paramString), true);
    } catch (Exception exception) {
      a = null;
      return;
    } 
    c = paramString;
    if (d == null)
      d = new Hashtable(); 
  }
  
  public static int a(String paramString) {
    boolean bool;
    e(paramString);
    try {
      bool = a.getNumRecords();
    } catch (Exception exception) {
      bool = false;
    } 
    return bool;
  }
  
  public static synchronized bh a(String paramString, int paramInt) {
    e(paramString);
    bh bh = new bh();
    try {
      ByteArrayInputStream byteArrayInputStream;
      int j;
      DataInputStream dataInputStream;
      int k;
      byte[] arrayOfByte = a.getRecord(paramInt + 1);
      bh.e = (byte)(arrayOfByte[0] & 0x1);
      int i;
      switch (i = arrayOfByte[0] >> 1) {
        case 0:
          byteArrayInputStream = new ByteArrayInputStream(arrayOfByte, 1, arrayOfByte.length - 1);
          dataInputStream = new DataInputStream(byteArrayInputStream);
          bh.d = dataInputStream.readUTF();
          bh.b = dataInputStream.readUTF();
          bh.c = dataInputStream.readUTF();
          break;
        case 1:
        case 2:
          j = 1;
          j++;
          if (((k = arrayOfByte[1] & 0xFF) & 0x80) != 0) {
            j++;
            k = (k & 0x7F) + (arrayOfByte[2] << 7);
          } 
          bh.d = dh.c(arrayOfByte, j, k, (i == 2));
          j += k;
          if (((k = arrayOfByte[j++] & 0xFF) & 0x80) != 0)
            k = (k & 0x7F) + (arrayOfByte[j++] << 7); 
          bh.b = dh.c(arrayOfByte, j, k, (i == 2));
          j += k;
          if (((k = arrayOfByte[j++] & 0xFF) & 0x80) != 0)
            k = (k & 0x7F) + (arrayOfByte[j++] << 7); 
          bh.c = dh.c(arrayOfByte, j, k, (i == 2));
          break;
      } 
      if (dh.i(bh.b) != null) {
        bh.f = true;
      } else {
        bh.f = false;
      } 
    } catch (Exception exception) {
      bh.b = bh.c = bh.d = "error";
      bh.f = false;
      return null;
    } 
    return bh;
  }
  
  public static bh b(String paramString, int paramInt) {
    bh bh;
    if ((bh = (bh)d.get(new Integer(paramInt))) != null)
      return bh; 
    if ((bh = a(paramString, paramInt)) == null)
      return null; 
    if (bh.b.length() > 20) {
      bh.a = bh.b.substring(0, 20) + "...";
    } else {
      bh.a = bh.b;
    } 
    bh.a = bh.a.replace('\n', ' ');
    bh.a = bh.a.replace('\r', ' ');
    d.put(new Integer(paramInt), bh);
    return bh;
  }
  
  public static void a(String paramString1, String paramString2) {
    if (b == null) {
      String str = bb.a((short)578);
      b = new dr();
      b.a_(str);
    } 
    dr.a(paramString1, paramString2);
    b.q();
    if (b.c() != 0)
      b.p(b.c() - 1); 
    b.s();
    dw.a(b);
    b.b(Jimm.d);
  }
  
  public static synchronized void b(String paramString) {
    try {
      e(paramString);
      a.closeRecordStore();
      a = null;
      dw.i();
      RecordStore.deleteRecordStore(d(paramString));
      if (d != null)
        d.clear(); 
      c = new String();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void b() {
    if (d != null) {
      d.clear();
      d = null;
    } 
    b = null;
    c = new String();
  }
  
  private static synchronized boolean b(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    if ((i = b.t) < 0 || i >= b.c())
      return false; 
    if (!paramBoolean1)
      paramString2 = paramString2.toLowerCase(); 
    int j = a(paramString1);
    while (i >= 0 && i < j) {
      bh bh = a(paramString1, i);
      if ((paramBoolean1 ? bh.b : bh.b.toLowerCase()).indexOf(paramString2) != -1) {
        b.p(i);
        b.b(Jimm.d);
        return true;
      } 
      if (paramBoolean2) {
        i--;
        continue;
      } 
      i++;
    } 
    return false;
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2) {
    if (b == null)
      return; 
    if (b(paramString1, paramString2, paramBoolean1, paramBoolean2) == true)
      return; 
    Alert alert;
    (alert = new Alert(bb.a((short)244), paramString2 + "\n" + bb.a((short)579), null, AlertType.INFO)).setTimeout(-2);
    b.a(Jimm.d, alert);
  }
  
  public static synchronized void c(String paramString) {
    String str = (paramString == null) ? null : d(paramString);
    try {
      if (a != null) {
        a.closeRecordStore();
        a = null;
        dw.i();
        c = new String();
      } 
      String[] arrayOfString = RecordStore.listRecordStores();
      for (byte b = 0; b < arrayOfString.length; b++) {
        String str1;
        if ((str1 = arrayOfString[b]).indexOf("hist") != -1 && (str == null || !str.equals(str1)))
          RecordStore.deleteRecordStore(str1); 
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ea.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */