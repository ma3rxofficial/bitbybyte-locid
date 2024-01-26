import i.I;
import javax.microedition.lcdui.Font;

public final class ee {
  public I a;
  
  public String b;
  
  private int c = 0;
  
  private int d = 0;
  
  public final int a(int paramInt) {
    if (this.a != null)
      return this.a.getHeight(); 
    if (this.b == null)
      return 0; 
    if ((this.d & 0xFFFF) == 0)
      if (paramInt != 16 || fd.a == null) {
        Font font = Font.getFont(0, this.c >> 24 & 0xFF, paramInt);
        this.d = this.d & 0xFFFF0000 | font.getHeight();
      } else {
        return fd.a.b();
      }  
    return this.d & 0xFFFF;
  }
  
  public final int b(int paramInt) {
    if (this.a != null)
      return this.a.getWidth() + 1; 
    if (this.b == null)
      return 0; 
    if ((this.d & 0xFFFF0000) == 0) {
      Font font = Font.getFont(0, this.c >> 24 & 0xFF, paramInt);
      this.d = this.d & 0xFFFF | font.stringWidth(this.b) << 16;
    } 
    return (this.d & 0xFFFF0000) >> 16;
  }
  
  public final int a() {
    return this.c & 0xFFFFFF;
  }
  
  public final void c(int paramInt) {
    this.c = this.c & 0xFF000000 | paramInt & 0xFFFFFF;
  }
  
  public final int b() {
    return (this.c & 0xFF000000) >> 24;
  }
  
  public final void d(int paramInt) {
    this.c = this.c & 0xFFFFFF | (paramInt & 0xFF) << 24;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ee.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */