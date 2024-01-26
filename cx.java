import java.util.Vector;

public final class cx {
  public Object a = null;
  
  public Vector b = null;
  
  public boolean c = false;
  
  public int d = 0;
  
  public cx(Object paramObject) {
    this.a = paramObject;
  }
  
  public final void a() {
    if (this.b != null)
      this.b.removeAllElements(); 
  }
  
  public final int b() {
    return (this.b == null) ? 0 : this.b.size();
  }
  
  public final cx a(int paramInt) {
    return this.b.elementAt(paramInt);
  }
  
  public final cx a(cx paramcx) {
    if (this.b == null)
      this.b = new Vector(); 
    this.b.addElement(paramcx);
    return paramcx;
  }
  
  public final void a(cx paramcx, int paramInt) {
    if (this.b == null)
      this.b = new Vector(); 
    this.b.insertElementAt(paramcx, paramInt);
  }
  
  public final void b(int paramInt) {
    this.b.removeElementAt(paramInt);
  }
  
  public final int b(cx paramcx) {
    if (this.b == null)
      return -1; 
    int i = b();
    for (byte b = 0; b < i; b++) {
      if (a(b) == paramcx)
        return b; 
    } 
    return -1;
  }
  
  private static int a(Vector paramVector, cx paramcx, bo parambo) {
    int i;
    if ((i = paramVector.size()) == 0)
      return 0; 
    int j = 0;
    int k = i - 1;
    int m = parambo.a(paramcx, paramVector.elementAt(0));
    int n = parambo.a(paramcx, paramVector.elementAt(k));
    if (m < 0)
      return 0; 
    if (n > 0)
      return i; 
    while (true) {
      int i1 = (j + k) / 2;
      int i2;
      if (((i2 = parambo.a(paramcx, paramVector.elementAt(i1))) <= 0 && n >= 0) || (i2 >= 0 && n <= 0)) {
        j = i1;
        m = i2;
      } else {
        k = i1;
        n = i2;
      } 
      if (k - j <= 1)
        return (m < 0) ? j : k; 
    } 
  }
  
  public final void a(bo parambo) {
    Vector vector = new Vector();
    if (this.b == null)
      return; 
    int i = this.b.size();
    for (byte b = 0; b < i; b++) {
      cx cx1 = this.b.elementAt(b);
      vector.insertElementAt(cx1, a(vector, cx1, parambo));
    } 
    this.b = vector;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */