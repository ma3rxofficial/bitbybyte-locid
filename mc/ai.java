package mc;

import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;

public final class ai extends v {
  public boolean m;
  
  public ai(aw paramaw, Image paramImage, boolean paramBoolean) {
    this.a = paramaw;
    this.c = paramImage;
    this.m = paramBoolean;
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
    this.d = 1;
    this.f.a(1, bn.bx);
    this.f.a(2, bn.by);
    this.f.a(3, bn.bz);
    repaint();
  }
  
  public final void a(int paramInt, String paramString) {
    a((Displayable)this.a);
    if (this.m) {
      this.a.b(paramInt);
      return;
    } 
    this.a.c(paramInt);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ai.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */