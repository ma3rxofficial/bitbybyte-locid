import i.I;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class eb extends I {
  private I[] f;
  
  private int[] g;
  
  private int h = 0;
  
  private boolean i = false;
  
  private long j = 0L;
  
  public eb(I paramI, int paramInt) {
    super(paramI.getImage(), 0, 0, paramI.getWidth(), paramI.getHeight());
    this.f = new I[paramInt];
    this.g = new int[paramInt];
  }
  
  public final Image getImage() {
    return this.f[this.h].getImage();
  }
  
  public final void a(int paramInt1, I paramI, int paramInt2) {
    this.f[paramInt1] = paramI;
    this.g[paramInt1] = paramInt2;
  }
  
  public final void drawImage(Graphics paramGraphics, int paramInt1, int paramInt2) {
    this.f[this.h].drawImage(paramGraphics, paramInt1, paramInt2);
    this.i = true;
  }
  
  public final boolean a(long paramLong) {
    this.j -= paramLong;
    if (this.j <= 0L) {
      this.h = (this.h + 1) % this.f.length;
      this.j = this.g[this.h];
      boolean bool = this.i;
      this.i = false;
      return bool;
    } 
    return false;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\eb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */