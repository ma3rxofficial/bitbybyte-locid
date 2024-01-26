package KD;

import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;

public final class o extends Form {
  private ChoiceGroup a;
  
  private ChoiceGroup b;
  
  public o(String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3) {
    super("Типы файлов");
    this.a = new ChoiceGroup("Аудио:", 2, paramArrayOfString1, null);
    this.b = new ChoiceGroup("Видео:", 2, paramArrayOfString2, null);
    append((Item)this.a);
    append((Item)this.b);
    if (paramArrayOfString1 != null)
      for (byte b = 0; b < paramArrayOfString1.length; b++) {
        for (byte b1 = 0; b1 < paramArrayOfString3.length; b1++) {
          if (u.a(paramArrayOfString1[b], paramArrayOfString3[b1])) {
            this.a.setSelectedIndex(b, true);
            break;
          } 
        } 
      }  
    if (paramArrayOfString2 != null)
      for (byte b = 0; b < paramArrayOfString2.length; b++) {
        for (byte b1 = 0; b1 < paramArrayOfString3.length; b1++) {
          if (u.a(paramArrayOfString2[b], paramArrayOfString3[b1])) {
            this.b.setSelectedIndex(b, true);
            break;
          } 
        } 
      }  
  }
  
  public final String[] a() {
    String str = "";
    int i = this.a.size();
    byte b;
    for (b = 0; b < i; b++) {
      if (this.a.isSelected(b))
        str = str + ag.a[b] + '|'; 
    } 
    i = this.b.size();
    for (b = 0; b < i; b++) {
      if (this.b.isSelected(b))
        str = str + ag.b[b] + '|'; 
    } 
    return u.c(str);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\o.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */