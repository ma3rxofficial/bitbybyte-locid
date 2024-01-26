package mc;

import javax.microedition.lcdui.Graphics;

public final class av {
  private am d = null;
  
  private Graphics e = null;
  
  public int a = 13684944;
  
  public int b = 0;
  
  public int c = 0;
  
  public av(Graphics paramGraphics, am paramam) {
    this.e = paramGraphics;
    this.d = paramam;
    this.c = paramGraphics.getClipWidth() - 10;
  }
  
  public final void a(String paramString, int paramInt) {
    a(paramString, "", "", "", paramInt);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt) {
    a(paramString1, paramString2, "", "", paramInt);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt) {
    a(paramString1, paramString2, paramString3, "", paramInt);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt) {
    byte b = 0;
    if (paramString4.length() != 0) {
      b = 4;
    } else if (paramString3.length() != 0) {
      b = 3;
    } else if (paramString2.length() != 0) {
      b = 2;
    } else {
      b = 1;
    } 
    int i = this.d.d(paramString1);
    int j = this.d.d(paramString2);
    int k = this.d.d(paramString3);
    int m = this.d.d(paramString4);
    int n = 0;
    int i1 = this.e.getClipHeight() / 2 - b * this.d.a / 2;
    if (paramInt != 0)
      i1 -= this.d.a / 2; 
    int i2 = i1;
    if (b > 1)
      i2 = i1 + this.d.a; 
    int i3 = i2;
    if (b > 2)
      i3 = i2 + this.d.a; 
    int i4 = i3;
    if (b > 3)
      i4 = i3 + this.d.a; 
    int i5 = i4 + this.d.a;
    if (paramInt != 0)
      b++; 
    int i6 = this.e.getClipWidth() / 2 - i / 2;
    int i7 = this.e.getClipWidth() / 2 - j / 2;
    int i8 = this.e.getClipWidth() / 2 - k / 2;
    int i9 = this.e.getClipWidth() / 2 - m / 2;
    a(b * this.d.a);
    this.d.a(this.e, paramString1, i6, i1, 0, this.b);
    if (paramString2.length() != 0)
      this.d.a(this.e, paramString2, i7, i2, 0, this.b); 
    if (paramString3.length() != 0)
      this.d.a(this.e, paramString3, i8, i3, 0, this.b); 
    if (paramString4.length() != 0)
      this.d.a(this.e, paramString4, i9, i4, 0, this.b); 
    String str = "";
    switch (paramInt) {
      case 1:
        str = bn.dk;
        break;
      case 2:
        str = bn.dl;
        break;
      case 3:
        str = bn.dm;
        break;
      case 4:
        str = bn.an;
        break;
      case 5:
        str = bn.ao;
        break;
    } 
    if (paramInt != 0) {
      n = this.d.d(str);
      int i10 = this.e.getClipWidth() / 2 - n / 2;
      this.d.a(this.e, str, i10, i5, 0, this.b);
    } 
  }
  
  private void a(int paramInt) {
    this.e.setColor(this.a);
    this.e.fillRect(0, this.e.getClipHeight() / 2 - paramInt / 2 - this.d.a / 2, this.e.getClipWidth(), paramInt + this.d.a);
    this.e.setColor(this.b);
    this.e.drawRect(1, this.e.getClipHeight() / 2 - paramInt / 2 - this.d.a / 2 + 1, this.e.getClipWidth() - 2, paramInt + this.d.a - 3);
    this.e.drawRect(3, this.e.getClipHeight() / 2 - paramInt / 2 - this.d.a / 2 + 3, this.e.getClipWidth() - 6, paramInt + this.d.a - 7);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\av.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */