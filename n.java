import favax.microedition.lcdui.Canvas;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Player;
import javax.microedition.media.control.VideoControl;

public final class n extends Canvas {
  public byte[] a;
  
  public int a;
  
  public int b;
  
  VideoControl a;
  
  Player a;
  
  public static int c;
  
  public n(af paramaf, ah paramah) {
    af.a = (j)paramaf;
    ((v)paramaf.a).b = (boolean[])paramah;
    a();
    setFullScreenMode(!af.w);
    setCommandListener(paramaf);
  }
  
  public static void a() {
    Command command = af.f;
    Vector vector = new Vector();
    int i = 0;
    boolean bool = false;
    while (command != null) {
      String str1;
      String str2;
      int j;
      if ((j = command.indexOf(' ')) != -1) {
        str2 = command.substring(0, j);
        str1 = command.substring(j + 1);
      } else {
        str2 = str1;
        str1 = null;
      } 
      if (str2.toLowerCase().indexOf("jpg") != -1 || str2.toLowerCase().indexOf("jpeg") != -1) {
        String str;
        if ((str = a.b(str2, "width")) == null) {
          vector.addElement(str2);
          continue;
        } 
        bool = true;
        j = Integer.parseInt(str);
        vector.addElement(str2);
        boolean bool1;
        if ((bool1 = ((str = a.b(str2, "height")) == null) ? true : Integer.parseInt(str)) <= af.h && j <= af.h && (j = v.a(bool1, j)) > i) {
          i = j;
          af.i = (byte)(vector.size() - 1);
        } 
      } 
    } 
    if (v.aG == -1)
      v.aG = af.i; 
    if (!vector.isEmpty()) {
      if (!bool) {
        String[] arrayOfString = v.a("80;60;128;96;160;120;256;192;320;240;640;480;1280;960;1600;1200;2592;1944;", 18, ';');
        StringBuffer stringBuffer = new StringBuffer(0);
        for (byte b = 0; b < arrayOfString.length; b++) {
          stringBuffer.setLength(0);
          vector.addElement(stringBuffer.append("encoding=jpeg&width=").append(arrayOfString[b]).append("&height=").append(arrayOfString[++b]).toString());
        } 
      } 
      af.a = (j)new String[vector.size()];
      vector.copyInto((Object[])af.a);
      return;
    } 
    af.a = (j)new String[1];
  }
  
  public final void b() {
    if (this.a != null)
      this.a.setVisible(false); 
    if (this.a != null)
      this.a.close(); 
    this.a = null;
    this.a = null;
    if (af.x != 0) {
      ((af)af.a).a.setCurrent((Displayable)af.a);
      if (af.g == 'ফ' && this.a != null) {
        af.a.setFullScreenMode(af.w);
        af.a.setFullScreenMode(!af.w);
      } 
    } 
  }
  
  public static void c() {
    if (c != -1) {
      ((v)((af)af.a).a).aZ = c;
      af.p = c;
      af.a.y();
    } 
    c = -1;
  }
  
  public final void paint(Graphics paramGraphics) {
    af.a.paint(paramGraphics);
  }
  
  public final void feyPressed(int paramInt) {
    af.a.feyPressed(paramInt);
  }
  
  public final void feyReleased(int paramInt) {
    af.a.feyReleased(paramInt);
  }
  
  public final void keyRepeated(int paramInt) {
    af.a.keyRepeated(paramInt);
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2) {
    af.a.pointerPressed(paramInt1, paramInt2);
  }
  
  public final void pointerDragged(int paramInt1, int paramInt2) {
    af.a.pointerDragged(paramInt1, paramInt2);
  }
  
  public final void pointerReleased(int paramInt1, int paramInt2) {
    af.a.pointerReleased(paramInt1, paramInt2);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\n.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */