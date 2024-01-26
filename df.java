import i.I;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;

public class df {
  private I[] d;
  
  public int a = 0;
  
  public int b = 0;
  
  public static int c = -1;
  
  public I a(int paramInt) {
    return (paramInt < a() && paramInt >= 0) ? this.d[paramInt] : null;
  }
  
  public int a() {
    return (this.d != null) ? this.d.length : 0;
  }
  
  public final void a(String paramString, int paramInt) throws IOException {
    Image image;
    int i = (image = Image.createImage(paramString)).getHeight();
    int j = image.getWidth();
    this.a = j / paramInt;
    this.b = i;
    Vector vector = new Vector();
    int k;
    for (k = 0; k < i; k += this.b) {
      int m;
      for (m = 0; m < j; m += this.a) {
        I i1 = new I(image, m, k, this.a, this.b);
        vector.addElement(i1);
      } 
    } 
    this.d = new I[vector.size()];
    vector.copyInto((Object[])this.d);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    Image image = Image.createImage(paramString);
    if (paramInt3 > 1) {
      image = dh.a(image, 20000, paramInt3, true);
    } else if (paramInt3 < -1) {
      image = dh.a(image, 20000, -image.getHeight() * paramInt3 / 12, true);
    } 
    a(image, paramInt1, paramInt2);
  }
  
  public final void a(Image paramImage, int paramInt1, int paramInt2) throws IOException {
    int i = paramImage.getHeight();
    int j = paramImage.getWidth();
    if (paramInt1 == -1)
      paramInt1 = Math.min(i, j); 
    if (paramInt2 == -1)
      paramInt2 = i; 
    this.a = paramInt1;
    this.b = paramInt2;
    Vector vector = new Vector();
    int k;
    for (k = 0; k < i; k += paramInt2) {
      int m;
      for (m = 0; m < j; m += paramInt1) {
        I i1 = new I(paramImage, m, k, paramInt1, paramInt2);
        vector.addElement(i1);
      } 
    } 
    this.d = new I[vector.size()];
    vector.copyInto((Object[])this.d);
  }
  
  public static df a(String paramString) {
    return a(paramString, false);
  }
  
  public static void b() {
    try {
      c = 0;
      RecordStore recordStore;
      c = (recordStore = RecordStore.openRecordStore("resizeIcon", false)).getRecord(1)[0];
      recordStore.closeRecordStore();
      return;
    } catch (RecordStoreFullException recordStoreFullException) {
      return;
    } catch (RecordStoreException recordStoreException) {
      return;
    } 
  }
  
  public static void c() {
    if (c != em.f(255))
      try {
        c = em.f(255);
        RecordStore recordStore = RecordStore.openRecordStore("resizeIcon", true);
        byte[] arrayOfByte = { (byte)c };
        while (recordStore.getNumRecords() < 3)
          recordStore.addRecord(arrayOfByte, 0, 1); 
        recordStore.setRecord(1, arrayOfByte, 0, 1);
        recordStore.closeRecordStore();
        return;
      } catch (RecordStoreFullException recordStoreFullException) {
        return;
      } catch (RecordStoreException recordStoreException) {} 
  }
  
  public static df a(String paramString, boolean paramBoolean) {
    if (paramBoolean && c == -1)
      b(); 
    df df1 = new df();
    try {
      df1.a(paramString, -1, -1, paramBoolean ? c : -1);
    } catch (Exception exception) {}
    return df1;
  }
  
  public static df a(Image paramImage) {
    df df1 = new df();
    try {
      df1.a(paramImage, -1, -1);
    } catch (Exception exception) {}
    return df1;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\df.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */