package ui;

public class Config {
  public static int[] color;
  
  public static final int BACK = 0;
  
  public static final int TEXT = 1;
  
  public static final int CAPTION = 4;
  
  public static final int CURSOR = 8;
  
  public static final int CAP_TEXT = 11;
  
  public static final int CURSOR_B = 23;
  
  public static void set(int[] paramArrayOfint) {
    color = paramArrayOfint;
  }
  
  public static int get(int paramInt) {
    return color[paramInt];
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar\\ui\Config.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */