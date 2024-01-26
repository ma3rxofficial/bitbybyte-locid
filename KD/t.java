package KD;

import javax.microedition.lcdui.Image;

public final class t {
  public int a = 0;
  
  public int b = 0;
  
  public short c = 0;
  
  public short d = 0;
  
  public short e = 0;
  
  public short f = 0;
  
  public short g = 0;
  
  public short h = 0;
  
  public short i = 0;
  
  public short j = 0;
  
  public short k = 0;
  
  public short l = 0;
  
  public short m = 0;
  
  public short n = 0;
  
  public short o = 0;
  
  public short p = 0;
  
  public t(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public final void a() {
    try {
      Image image1 = Image.createImage("/images/player/pl_Bkgnd.png");
      Image image2 = Image.createImage("/images/player/pl_BkBot.png");
      Image image3 = Image.createImage("/images/player/pl_BkTop.png");
      Image image4 = Image.createImage("/images/player/pl_BkLeft.png");
      Image image5 = Image.createImage("/images/player/pl_BkRight.png");
      Image image6 = Image.createImage("/images/player/pl_barcenter.png");
      Image image7 = Image.createImage("/images/player/pl_control.png");
      Image image8 = Image.createImage("/images/player/pl_sound.png");
      Image image9 = Image.createImage("/images/player/pl_title.png");
      Image image10 = Image.createImage("/images/player/pl_shuffle.png");
      Image image11 = Image.createImage("/images/player/pl_repeat.png");
      image1.getWidth();
      image1.getHeight();
      this.c = (short)image4.getWidth();
      image4.getHeight();
      this.d = (short)image5.getWidth();
      image5.getHeight();
      image2.getWidth();
      image2.getHeight();
      image3.getWidth();
      this.e = (short)image3.getHeight();
      image6.getWidth();
      this.f = (short)image6.getHeight();
      this.g = (short)(image8.getWidth() / 6);
      this.h = (short)image8.getHeight();
      this.i = (short)(image7.getWidth() / 4);
      this.j = (short)image7.getHeight();
      this.k = (short)image9.getWidth();
      this.l = (short)image9.getHeight();
      this.m = (short)(image10.getWidth() / 4);
      this.n = (short)image10.getHeight();
      this.o = (short)(image11.getWidth() / 4);
      this.p = (short)image11.getHeight();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final Image b() {
    Image image = Image.createImage(this.b, this.a);
    try {
      Image image1 = Image.createImage("/images/player/pl_Bkgnd.png");
      Image image2 = Image.createImage("/images/player/pl_BkBot.png");
      Image image3 = Image.createImage("/images/player/pl_BkTop.png");
      Image image4 = Image.createImage("/images/player/pl_BkLeft.png");
      Image image5 = Image.createImage("/images/player/pl_BkRight.png");
      Image image6 = Image.createImage("/images/player/pl_BkTopLeft.png");
      Image image7 = Image.createImage("/images/player/pl_BkTopRight.png");
      Image image8 = Image.createImage("/images/player/pl_BkBotLeft.png");
      Image image9 = Image.createImage("/images/player/pl_BkBotRight.png");
      int i = image1.getHeight();
      int j = image1.getWidth();
      int k = this.b / j;
      int m = this.a / i;
      byte b;
      for (b = 0; b <= k; b++) {
        for (byte b1 = 0; b1 <= m; b1++)
          image.getGraphics().drawImage(image1, b * j, b1 * i, 0); 
      } 
      j = image3.getWidth();
      k = this.b / j;
      for (b = 0; b <= k; b++)
        image.getGraphics().drawImage(image3, b * j, 0, 0); 
      j = image2.getWidth();
      i = image2.getHeight();
      k = this.b / j;
      for (b = 0; b <= k; b++)
        image.getGraphics().drawImage(image2, b * j, this.a - i, 0); 
      i = image4.getHeight();
      m = this.a / i;
      for (b = 0; b <= m; b++)
        image.getGraphics().drawImage(image4, 0, b * i, 0); 
      j = image5.getWidth();
      i = image5.getHeight();
      m = this.a / i;
      for (b = 0; b <= m; b++)
        image.getGraphics().drawImage(image5, this.b - j, b * i, 0); 
      image.getGraphics().drawImage(image6, 0, 0, 0);
      i = image8.getHeight();
      image.getGraphics().drawImage(image8, 0, this.a - i, 0);
      j = image7.getWidth();
      image.getGraphics().drawImage(image7, this.b - j, 0, 0);
      j = image9.getWidth();
      i = image9.getHeight();
      image.getGraphics().drawImage(image9, this.b - j, this.a - i, 0);
    } catch (Exception exception) {}
    System.gc();
    return image;
  }
  
  public final Image c() {
    Image image = b();
    try {
      Image image1 = Image.createImage("/images/player/pl_barleft.png");
      Image image2 = Image.createImage("/images/player/pl_barcenter.png");
      Image image3 = Image.createImage("/images/player/pl_barright.png");
      int i = image2.getHeight();
      int j = image2.getWidth();
      int k = this.b / j;
      for (byte b = 0; b <= k; b++)
        image.getGraphics().drawImage(image2, b * j, this.a - i, 0); 
      i = image1.getHeight();
      image.getGraphics().drawImage(image1, 0, this.a - i, 0);
      i = image3.getHeight();
      j = image3.getWidth();
      image.getGraphics().drawImage(image3, this.b - j, this.a - i, 0);
    } catch (Exception exception) {}
    return image;
  }
  
  public static Image d() {
    return u.a("/images/player/pl_title.png");
  }
  
  public static Image e() {
    return u.a("/images/player/pl_sound.png");
  }
  
  public static Image f() {
    return u.a("/images/player/pl_control.png");
  }
  
  public static Image g() {
    return u.a("/images/player/pl_shuffle.png");
  }
  
  public static Image h() {
    return u.a("/images/player/pl_repeat.png");
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\t.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */