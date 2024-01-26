package KD;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public final class ak extends List {
  public ak(String[] paramArrayOfString) {
    super("Список папок", 3);
    if (paramArrayOfString == null)
      return; 
    if (paramArrayOfString.length < 1)
      return; 
    Image image = u.a("/images/pm/pm_dir.png");
    for (byte b = 0; b < paramArrayOfString.length; b++)
      append(paramArrayOfString[b], image); 
  }
  
  public final void a(String paramString) {
    Image image = u.a("/images/pm/pm_dir.png");
    append(paramString, image);
  }
  
  public final void a(int paramInt, String paramString) {
    if ((((paramInt < 0) ? 1 : 0) | ((paramInt >= size()) ? 1 : 0)) != 0)
      return; 
    Image image = u.a("/images/pm/pm_dir.png");
    set(paramInt, paramString, image);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\ak.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */