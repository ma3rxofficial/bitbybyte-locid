import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.Screen;

public final class t extends List {
  public Vector a;
  
  public String a;
  
  public r a;
  
  public boolean a;
  
  private int a;
  
  private boolean b;
  
  private boolean c;
  
  private CommandListener a;
  
  private static int b = 32;
  
  private t(int paramInt, Vector paramVector, r paramr, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, CommandListener paramCommandListener) {
    super(v.d(paramInt), 3);
    this.a = paramInt;
    this.a = (CommandListener)paramVector;
    this.a = (CommandListener)paramr;
    this.a = (CommandListener)paramString;
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = paramBoolean3;
    this.a = paramCommandListener;
  }
  
  public static List a(int paramInt1, Vector paramVector, r paramr, String paramString, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, CommandListener paramCommandListener) {
    t t1 = new t(paramInt1, paramVector, paramr, paramString, paramBoolean1, paramBoolean2, paramBoolean3, paramCommandListener);
    if (paramVector != null) {
      for (byte b = 0; b < paramVector.size(); b++) {
        paramString = paramVector.elementAt(b);
        if (paramBoolean3 && paramString.length() > b) {
          paramString = v.a(paramString.substring(0, b), "...");
        } else if (!paramBoolean3) {
          paramString = v.a(paramString, b);
        } 
        t1.append(paramString, null);
      } 
      if (!paramBoolean2 && !paramVector.isEmpty()) {
        t1.addCommand((Command)af.a[31]);
        t1.setSelectCommand((Command)af.a[31]);
      } 
      if (paramBoolean2) {
        t1.addCommand((Command)af.a[33]);
        if (!paramVector.isEmpty())
          t1.addCommand((Command)af.a[34]); 
      } 
      if (!paramVector.isEmpty())
        t1.addCommand((Command)af.a[35]); 
    } 
    t1.addCommand((Command)af.a[32]);
    v.a((Screen)t1);
    if (paramInt2 > 0 && paramInt2 < t1.size())
      t1.setSelectedIndex(paramInt2, true); 
    t1.setCommandListener(paramCommandListener);
    v.a((Displayable)t1);
    return t1;
  }
  
  public static List a(t paramt, int paramInt) {
    return a(paramt.a, (Vector)paramt.a, (r)paramt.a, (String)paramt.a, paramt.a, paramInt, paramt.b, paramt.c, paramt.a);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\t.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */