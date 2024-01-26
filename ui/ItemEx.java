package ui;

import javax.microedition.lcdui.Image;

public class ItemEx {
  public String text;
  
  public Object parent;
  
  public int index;
  
  public Image icon;
  
  public ItemEx(String paramString, boolean paramBoolean) {
    this(null, null, paramString, paramBoolean ? -2 : -1);
  }
  
  public ItemEx(String paramString) {
    this(null, null, paramString, -1);
  }
  
  public ItemEx(Object paramObject, Image paramImage, String paramString, int paramInt) {
    this.parent = paramObject;
    this.icon = paramImage;
    this.text = paramString;
    this.index = paramInt;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar\\ui\ItemEx.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */