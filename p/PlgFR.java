package p;

import i.PI;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

public class PlgFR extends PI implements PlgFRIntegratedEnv {
  private Display c;
  
  public PlgFRBookReader2 a;
  
  private int d = 0;
  
  public static PlgFR b;
  
  public String getName() {
    return "FAyliReader";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    PlgFR plgFR;
    switch (paramInt) {
      case 0:
        b = this;
        this.c = (Display)paramObject;
        return null;
      case 2:
        this.c = (Display)paramObject;
      case 39:
        this.d = 0;
        plgFR = this;
        this.a = new PlgFRBookReader2(plgFR);
        plgFR.b();
        return null;
      case 11:
        this.d = ((Integer)paramArrayOfObject[1]).intValue();
        return null;
      case 40:
        if (paramObject == null) {
          this.a.b();
          break;
        } 
        this.a.a("file://" + (String)paramObject);
        this.a.b();
        break;
    } 
    return null;
  }
  
  public final void a() {
    this.c.setCurrent((Displayable)PlgFRBookReader2.e);
  }
  
  public final int a(StringBuffer paramStringBuffer) {
    paramStringBuffer.append("#").append(this.d);
    return 0;
  }
  
  public final void a(PlgFRBookReader2 paramPlgFRBookReader2) {
    paramPlgFRBookReader2.c();
    request(1, null, new Integer(0));
  }
  
  public final void b() {
    PlgFRBookReader2.e.a();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgFR.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */