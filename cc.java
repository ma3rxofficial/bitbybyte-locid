import i.I;
import javax.microedition.lcdui.Command;

public final class cc extends Command {
  public I a;
  
  public int b;
  
  public cc(String paramString, int paramInt1, int paramInt2) {
    super(paramString, paramInt1, paramInt2);
  }
  
  public cc(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    super(paramString, paramInt1, paramInt2);
    this.b = paramInt3;
  }
  
  public cc(String paramString, int paramInt1, int paramInt2, I paramI, int paramInt3) {
    super(paramString, paramInt1, paramInt2);
    this.a = paramI;
    this.b = paramInt3;
  }
  
  public cc(String paramString, int paramInt1, int paramInt2, I paramI) {
    super(paramString, paramInt1, paramInt2);
    this.a = paramI;
  }
  
  public final int a() {
    return (this.a == null) ? 0 : this.a.getWidth();
  }
  
  public final int b() {
    return (this.a == null) ? 0 : this.a.getHeight();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */