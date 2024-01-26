import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Font;

public final class f extends Command {
  public int a;
  
  public boolean a;
  
  public f(String paramString, int paramInt1, int paramInt2) {
    super(paramString, paramInt1, paramInt2);
    this.a = v.a((Font)v.b, paramString, true) + 4;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    int k;
    int i = af.c() - ((af)af.b).d;
    int j = 0;
    if (((af)af.b).a == null || this == af.a[17])
      return false; 
    boolean bool = this.a;
    if (af.b.a())
      k = v.a(af.b() >> 2, bool); 
    if (this == ((af)af.b).a)
      j = af.b() - k; 
    return (paramInt1 > j && paramInt1 < j + k && paramInt2 > i && paramInt2 < i + ((af)af.b).d);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\f.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */