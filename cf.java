import javax.microedition.lcdui.Graphics;

public final class cf {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public Graphics e;
  
  public final void a(Graphics paramGraphics) {
    this.e = paramGraphics;
    this.a = paramGraphics.getClipX();
    this.b = paramGraphics.getClipY();
    this.c = paramGraphics.getClipWidth();
    this.d = paramGraphics.getClipHeight();
  }
  
  public final void b(Graphics paramGraphics) {
    paramGraphics.setClip(this.a, this.b, this.c, this.d);
  }
  
  public final void a() {
    b(this.e);
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramGraphics);
    if (paramInt4 + paramInt2 > this.d + this.b) {
      int i;
      if ((i = this.b + this.d - paramInt2) < 0)
        i = 0; 
      paramGraphics.setClip(paramInt1, paramInt2, paramInt3, i);
      return;
    } 
    paramGraphics.setClip(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */