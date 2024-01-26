package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;

public final class bs extends v {
  public Vector m;
  
  public bs(aw paramaw, Image paramImage, Vector paramVector) {
    this.a = paramaw;
    this.c = paramImage;
    this.m = paramVector;
    try {
      a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void b() {
    this.f = new cu(this, aw.h, aw.j);
    this.f.b = false;
    this.d = 2;
    this.e = 1;
    for (byte b = 0; b < this.m.size(); b++)
      this.f.a(b, this.m.elementAt(b)); 
    repaint();
  }
  
  public final void a(int paramInt, String paramString) {
    String str = cx.d(paramString);
    if (paramString.endsWith("/"))
      str = cx.e(paramString); 
    if (str.equals("/"))
      str = ""; 
    (this.a.e[this.a.f]).s = str;
    this.a.e[this.a.f].d();
    this.a.e[this.a.f].a(paramString);
    this.a.e[this.a.f].e();
    this.a.e(this.a.f);
    this.a.repaint();
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bs.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */