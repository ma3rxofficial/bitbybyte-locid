import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class eh {
  public Vector a = new Vector();
  
  public int b = -1;
  
  public int c = -1;
  
  public char d;
  
  public final ee a(int paramInt) {
    return this.a.elementAt(paramInt);
  }
  
  public final void a(ee paramee) {
    this.a.addElement(paramee);
  }
  
  public final int b(int paramInt) {
    if (this.b == -1) {
      this.b = paramInt;
      for (int i = this.a.size() - 1; i >= 0; i--) {
        int j;
        if ((j = a(i).a(paramInt)) > this.b)
          this.b = j; 
      } 
    } 
    return this.b;
  }
  
  public final int c(int paramInt) {
    int i = 0;
    for (int j = this.a.size() - 1; j >= 0; j--)
      i += a(j).b(paramInt); 
    return i;
  }
  
  public final void d(int paramInt) {
    for (int i = this.a.size() - 1; i >= 0; i--)
      a(i).c(paramInt); 
  }
  
  public final void e(int paramInt) {
    for (int i = this.a.size() - 1; i >= 0; i--)
      a(i).d(paramInt); 
  }
  
  public final void a(int paramInt1, int paramInt2, Graphics paramGraphics, int paramInt3, bd parambd) {
    int i = this.a.size();
    int j = b(paramInt3);
    for (byte b = 0; b < i; b++) {
      ee ee = a(b);
      int k = paramInt2 + (j - ee.a(paramInt3)) / 2;
      if (ee.a != null) {
        ee.a.drawImage(paramGraphics, ++paramInt1, k);
      } else if (ee.b != null) {
        if (paramInt3 != 16 || fd.a == null) {
          dw.a(paramGraphics, parambd.b(ee.b()), ee.a(), ee.b, paramInt1, k, 20, 10);
        } else {
          fd.a.a(paramGraphics, paramInt1, k, ee.b, ee.a());
        } 
      } 
      paramInt1 += ee.b(paramInt3);
    } 
  }
  
  public final int a() {
    return this.a.size();
  }
  
  public final void a(StringBuffer paramStringBuffer) {
    for (byte b = 0; b < this.a.size(); b++)
      paramStringBuffer.append((a(b)).b); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\eh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */