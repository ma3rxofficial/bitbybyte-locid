package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.util.TimerTask;

public final class mc/at extends TimerTask {
  public String a;
  
  public cy b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  private final cy f;
  
  public mc/at(cy paramcy1, cy paramcy2) {
    this.f = paramcy1;
    this.a = "";
    this.c = 0;
    this.d = 0;
    this.e = -1;
    this.b = paramcy2;
  }
  
  public final void run() {
    if (Display.getDisplay((MIDlet)MiniCommander.a).getCurrent() != this.b.A || this.b.A.y || !this.b.m)
      return; 
    cb cb;
    if ((cb = this.b.c()) != null && !cb.d.equals("..") && this.b.A.z == 0) {
      if (!this.a.equals(cb.d)) {
        this.a = cb.d;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        return;
      } 
      this.c++;
      if (this.c > 5) {
        if (this.c == 6) {
          this.d = 0;
        } else {
          this.d++;
        } 
        String str;
        if ((str = cx.c(this.a)).endsWith("/"))
          str = str.substring(0, str.length() - 2); 
        if (this.b.l.d(str) > this.f.g) {
          if (this.f.b(this.b.k, this.d)) {
            this.d = 0;
            this.c = -5;
            this.e = 5;
          } 
          this.b.A.e(this.b.A.f);
          this.b.A.repaint();
          return;
        } 
      } 
      if (this.e >= 0) {
        this.e--;
        if (this.e == 0) {
          this.f.a(this.b.k);
          this.b.A.e(this.b.A.f);
          this.b.A.repaint();
        } 
      } 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\at.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */