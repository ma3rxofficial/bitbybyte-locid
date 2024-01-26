import i.PI;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class cw implements Runnable {
  public PI a;
  
  public Object b;
  
  public cw(PI paramPI, Object paramObject) {
    this.a = paramPI;
    this.b = paramObject;
  }
  
  public final void run() {
    if (this.b instanceof byte[]) {
      byte[] arrayOfByte = (byte[])this.b;
      try {
        String str;
        if (this.a == null) {
          str = "PLG_" + cp.a();
        } else {
          String str1;
          if (!(str1 = this.a.getName()).equals("CellId"))
            str1 = "" + str1.hashCode(); 
          str = "PLG_" + str1;
        } 
        RecordStore recordStore;
        if ((recordStore = RecordStore.openRecordStore(str, true)).getNumRecords() > 0) {
          recordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
        } else {
          recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } 
        recordStore.closeRecordStore();
        return;
      } catch (RecordStoreException recordStoreException) {}
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */