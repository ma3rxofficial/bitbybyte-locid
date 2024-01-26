import i.I;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;

public final class cr extends Exception {
  public boolean a;
  
  public boolean b;
  
  public boolean c;
  
  public int d;
  
  public static String a(short paramShort, int paramInt1, int paramInt2) {
    short s;
    String str = bb.a(s = paramShort);
    int i;
    return (s == -1 || str == null || ("nores_" + s).equals(str)) ? ("error_" + paramInt1 + "." + paramInt2) : (((i = str.indexOf("EXT")) != -1) ? (str.substring(0, i) + paramInt2 + str.substring(i + 3)) : ((paramInt2 > 0) ? (str + " ExtError:" + paramInt2) : str));
  }
  
  public cr(short paramShort, int paramInt1, int paramInt2) {
    super(a(paramShort, paramInt1, paramInt2));
    this.d = paramInt1;
    this.a = true;
    this.b = true;
    this.c = false;
  }
  
  public cr(short paramShort, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(a(paramShort, paramInt1, paramInt2));
    this.d = paramInt1;
    this.a = false;
    this.b = paramBoolean;
    this.c = false;
  }
  
  public cr(short paramShort, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    super(a(paramShort, paramInt1, paramInt2));
    this.d = paramInt1;
    this.a = false;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }
  
  public static synchronized Alert a(cr paramcr) {
    if (paramcr.a) {
      if (paramcr.c) {
        cd.i();
      } else {
        cd.h();
      } 
      bi.l();
      ef.a(dw.a(-1L));
      ef.a((I)null);
      if (ef.e())
        ef.d(); 
      Alert alert;
      (alert = new Alert(bb.a((short)223), paramcr.getMessage(), null, AlertType.ERROR)).setTimeout(-2);
      fb.a(alert);
      return alert;
    } 
    if (paramcr.b) {
      Alert alert;
      (alert = new Alert(bb.a((short)545), paramcr.getMessage(), null, AlertType.WARNING)).setTimeout(-2);
      ef.d();
      if (cd.f()) {
        bi.a(alert);
      } else {
        fb.a(alert);
      } 
      return alert;
    } 
    return null;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cr.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */