package i;

import cf;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class I {
  public Image a;
  
  private int f = 0;
  
  private int g = 0;
  
  public int b = 0;
  
  public int c = 0;
  
  public Image d;
  
  public static cf e = new cf();
  
  public I(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a = paramImage;
    this.f = paramInt1;
    this.g = paramInt2;
    this.b = paramInt3;
    this.c = paramInt4;
    this.d = null;
  }
  
  public I(Image paramImage) {
    this.a = paramImage;
    this.f = 0;
    this.g = 0;
    this.b = paramImage.getWidth();
    this.c = paramImage.getHeight();
    this.d = paramImage;
  }
  
  public Image createImage() {
    return (this.d == null) ? (this.d = Image.createImage(this.a, this.f, this.g, this.b, this.c, 0)) : this.d;
  }
  
  public Image getImage() {
    return this.a;
  }
  
  public int getWidth() {
    return this.b;
  }
  
  public int getHeight() {
    return this.c;
  }
  
  public void drawImage(Graphics paramGraphics, int paramInt1, int paramInt2) {
    e.a(paramGraphics, paramInt1, paramInt2, this.b, this.c);
    if (this.a == null)
      return; 
    int i = paramInt2 - this.g;
    int j = paramInt1 - this.f;
    paramGraphics.drawImage(getImage(), j, i, 20);
    e.b(paramGraphics);
  }
  
  public void drawByLeft(Graphics paramGraphics, int paramInt1, int paramInt2) {
    drawImage(paramGraphics, paramInt1, paramInt2 - this.c / 2);
  }
  
  public void drawByRight(Graphics paramGraphics, int paramInt1, int paramInt2) {
    drawImage(paramGraphics, paramInt1 - this.b, paramInt2 - this.c / 2);
  }
  
  public void drawInCenter(Graphics paramGraphics, int paramInt1, int paramInt2) {
    drawImage(paramGraphics, paramInt1 - this.b / 2, paramInt2 - this.c / 2);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\i\I.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */