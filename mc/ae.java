package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public final class ae extends List implements CommandListener {
  public aw a;
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  public ae(aw paramaw) {
    super(bn.cr, 3);
    this.a = paramaw;
    this.b = x.U;
    this.c = x.V;
    this.d = x.W;
    this.e = x.Z;
    this.f = x.aa;
    this.g = x.ab;
    this.h = x.ac;
    this.i = x.ad;
    this.j = x.ae;
    this.k = x.af;
    this.l = x.ag;
    this.m = x.ah;
    this.n = x.ai;
    this.o = x.aj;
    this.p = x.ak;
    this.q = x.al;
    this.r = x.am;
    this.s = x.an;
    this.t = x.ao;
    this.u = x.ap;
    this.v = x.aq;
    try {
      a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void a() throws Exception {
    setCommandListener(this);
    for (byte b = 0; b < bn.cw.length; b++) {
      append("", null);
      d(b);
    } 
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
    addCommand(new Command(bn.cs, 8, 1));
    addCommand(new Command(bn.ct, 8, 1));
    addCommand(new Command(bn.cu, 8, 1));
    addCommand(new Command(bn.cv, 8, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      x.U = this.b;
      x.V = this.c;
      x.W = this.d;
      x.Z = this.e;
      x.aa = this.f;
      x.ab = this.g;
      x.ac = this.h;
      x.ad = this.i;
      x.ae = this.j;
      x.af = this.k;
      x.ag = this.l;
      x.ah = this.m;
      x.ai = this.n;
      x.aj = this.o;
      x.ak = this.p;
      x.al = this.q;
      x.am = this.r;
      x.an = this.s;
      x.ao = this.t;
      x.ap = this.u;
      x.aq = this.v;
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getCommandType() == 4) {
      x.d();
      this.a.e[this.a.f].e();
      this.a.e[this.a.g].e();
      this.a.e(-1);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.cs)) {
      x.a((Displayable)this);
      return;
    } 
    if (paramCommand.getLabel().equals(bn.ct)) {
      x.b((Displayable)this);
      b();
      return;
    } 
    if (paramCommand.getLabel().equals(bn.cu)) {
      x.e();
      b();
      return;
    } 
    if (paramCommand.getLabel().equals(bn.cv)) {
      x.f();
      b();
      return;
    } 
    if (paramCommand.getCommandType() == 1 && size() > 0) {
      int i;
      int j = c(i = getSelectedIndex());
      ci ci = new ci(this, j);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ci);
    } 
  }
  
  private void b() {
    for (byte b = 0; b < bn.cw.length; b++)
      d(b); 
  }
  
  private static Image b(int paramInt) {
    int i;
    int j;
    Image image;
    Graphics graphics;
    (graphics = (image = Image.createImage((j = i = Font.getDefaultFont().getHeight()) + 1, i + 1)).getGraphics()).setColor(0);
    graphics.drawRect(1, 1, j - 1, i - 1);
    graphics.setColor(paramInt);
    graphics.fillRect(2, 2, j - 2, i - 2);
    return image;
  }
  
  private static int c(int paramInt) {
    int i = 0;
    switch (paramInt) {
      case 0:
        i = x.U;
        break;
      case 1:
        i = x.V;
        break;
      case 2:
        i = x.W;
        break;
      case 3:
        i = x.Z;
        break;
      case 4:
        i = x.aa;
        break;
      case 5:
        i = x.ab;
        break;
      case 6:
        i = x.ac;
        break;
      case 7:
        i = x.ad;
        break;
      case 8:
        i = x.ae;
        break;
      case 9:
        i = x.af;
        break;
      case 10:
        i = x.ag;
        break;
      case 11:
        i = x.ah;
        break;
      case 12:
        i = x.ai;
        break;
      case 13:
        i = x.aj;
        break;
      case 14:
        i = x.ak;
        break;
      case 15:
        i = x.al;
        break;
      case 16:
        i = x.am;
        break;
      case 17:
        i = x.an;
        break;
      case 18:
        i = x.ao;
        break;
      case 19:
        i = x.ap;
        break;
      case 20:
        i = x.aq;
        break;
    } 
    return i;
  }
  
  private void d(int paramInt) {
    set(paramInt, bn.cw[paramInt], b(c(paramInt)));
  }
  
  public final void a(int paramInt) {
    int i;
    switch (i = getSelectedIndex()) {
      case 0:
        x.U = paramInt;
        break;
      case 1:
        x.V = paramInt;
        break;
      case 2:
        x.W = paramInt;
        break;
      case 3:
        x.Z = paramInt;
        break;
      case 4:
        x.aa = paramInt;
        break;
      case 5:
        x.ab = paramInt;
        break;
      case 6:
        x.ac = paramInt;
        break;
      case 7:
        x.ad = paramInt;
        break;
      case 8:
        x.ae = paramInt;
        break;
      case 9:
        x.af = paramInt;
        break;
      case 10:
        x.ag = paramInt;
        break;
      case 11:
        x.ah = paramInt;
        break;
      case 12:
        x.ai = paramInt;
        break;
      case 13:
        x.aj = paramInt;
        break;
      case 14:
        x.ak = paramInt;
        break;
      case 15:
        x.al = paramInt;
        break;
      case 16:
        x.am = paramInt;
        break;
      case 17:
        x.an = paramInt;
        break;
      case 18:
        x.ao = paramInt;
        break;
      case 19:
        x.ap = paramInt;
        break;
      case 20:
        x.aq = paramInt;
        break;
    } 
    d(i);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ae.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */