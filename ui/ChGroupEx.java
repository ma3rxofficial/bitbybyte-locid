package ui;

import javax.microedition.lcdui.ChoiceGroup;

public class ChGroupEx extends ChoiceGroup {
  public int type;
  
  public ChGroupEx(String paramString, int paramInt) {
    super(paramString, paramInt);
    this.type = paramInt;
  }
  
  public ChGroupEx(String paramString, int paramInt, String[] paramArrayOfString) {
    super(paramString, paramInt, paramArrayOfString, null);
    this.type = paramInt;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar\\ui\ChGroupEx.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */