package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.media.Player;

public final class mc/z extends TimerTask {
  public cq a;
  
  public Timer b;
  
  public boolean c;
  
  private final cq d;
  
  public mc/z(cq paramcq1, cq paramcq2, Player paramPlayer, boolean paramBoolean) {
    this.d = paramcq1;
    this.c = true;
    paramcq2.v = paramBoolean;
    this.a = paramcq2;
    this.b = new Timer();
  }
  
  public final void a(long paramLong1, long paramLong2) {
    this.b.scheduleAtFixedRate(this, paramLong1, paramLong2);
  }
  
  public final void a() {
    this.b.cancel();
  }
  
  public final void run() {
    if (this.c) {
      if (Display.getDisplay((MIDlet)MiniCommander.a).getCurrent() != this.a && !this.d.v && this.d.u == true) {
        this.d.v = true;
        this.d.a(this.d.v);
      } else if (Display.getDisplay((MIDlet)MiniCommander.a).getCurrent() == this.a && this.d.v == true) {
        this.d.v = false;
      } 
      this.a.repaint();
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\z.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */