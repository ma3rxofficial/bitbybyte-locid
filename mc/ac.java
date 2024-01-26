package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;

public final class ac extends v {
  public boolean m;
  
  public dh n;
  
  public ac(dh paramdh, Image paramImage, boolean paramBoolean) {
    this.n = paramdh;
    this.b = paramdh;
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
    this.f = new cu(this, this.c, aw.j);
    this.d = 1;
    if (this.m) {
      this.f.a(1, bn.cm);
      this.f.a(3, bn.co);
      this.f.a(4, bn.cp);
      this.f.a(5, bn.cq);
    } 
    if (this.n.h != null && this.n.i == null)
      this.f.a(2, bn.cn); 
    if (this.n.e == null)
      this.f.a(6, bn.eH); 
    this.f.a(7, bn.eL);
    repaint();
  }
  
  public final void a(int paramInt, String paramString) {
    if (paramInt == 6) {
      if (this.n.e == null) {
        cx.a(bn.dC, bn.dD + (this.m ? bn.dE : ""), this.n);
        return;
      } 
    } else if (paramInt == 7) {
      this.n.c();
      if (this.n.k) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.n);
        return;
      } 
    } else {
      a((Displayable)this.n);
      if (paramInt == 1) {
        this.n.a(this.n.K, false);
        return;
      } 
      if (paramInt == 3) {
        this.n.a(1, false);
        return;
      } 
      if (paramInt == 4) {
        this.n.a(2, false);
        return;
      } 
      if (paramInt == 5) {
        this.n.a(3, false);
        return;
      } 
      if (paramInt == 2)
        this.n.b(); 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ac.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */