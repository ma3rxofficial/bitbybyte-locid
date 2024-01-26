package KD;

import javax.microedition.lcdui.Image;

public final class e {
  public Image a;
  
  public int b = 0;
  
  public int c = 0;
  
  public int d = 1;
  
  public int e = 1;
  
  private Image f;
  
  private Image g;
  
  private Image h;
  
  private Image i;
  
  public e(int paramInt) {
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    Image image4 = null;
    try {
      this.g = Image.createImage("/images/player/pl_sposl.png");
      this.i = Image.createImage("/images/player/pl_sposr.png");
      image1 = Image.createImage("/images/player/pl_posl.png");
      image2 = Image.createImage("/images/player/pl_posr.png");
      image3 = Image.createImage("/images/player/pl_posc.png");
      image4 = Image.createImage("/images/player/pl_sposc.png");
    } catch (Exception exception) {}
    this.d = paramInt;
    this.e = image4.getHeight();
    this.a = Image.createImage(this.d, this.e);
    this.f = a(image3);
    this.f.getGraphics().drawImage(image1, 0, 0, 0);
    this.f.getGraphics().drawImage(image2, this.d - image2.getWidth(), 0, 0);
    this.c = this.i.getWidth();
    this.d -= this.c;
    this.h = a(image4);
    a();
  }
  
  private void a(int paramInt) {
    if (this.b != paramInt) {
      this.b = paramInt;
      a();
    } 
  }
  
  public final void a(long paramLong1, long paramLong2) {
    a(((((paramLong1 == 0L) ? 1 : 0) | ((paramLong2 == 0L) ? 1 : 0)) != 0) ? 0 : (int)(paramLong1 * this.d / paramLong2));
  }
  
  private void a() {
    this.a.getGraphics().drawImage(this.f, 0, 0, 0);
    this.b += this.c;
    if (this.b < 0)
      this.b = 0; 
    if (this.b - this.c > this.d)
      this.b -= this.c; 
    if (this.b > 0) {
      this.a.getGraphics().drawImage(this.h, this.b - this.d - this.c, 0, 0);
      if (this.b >= this.g.getWidth())
        this.a.getGraphics().drawImage(this.g, 0, 0, 0); 
      this.a.getGraphics().drawImage(this.i, this.b - this.c, 0, 0);
    } 
  }
  
  private Image a(Image paramImage) {
    Image image = Image.createImage(this.d, paramImage.getHeight());
    int i = paramImage.getWidth();
    int j = this.d / i;
    for (byte b = 0; b <= j; b++)
      image.getGraphics().drawImage(paramImage, b * i, 0, 0); 
    return image;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */