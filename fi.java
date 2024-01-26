import java.util.Timer;
import java.util.TimerTask;
import jimm.Jimm;

public final class fi extends TimerTask {
  public String a;
  
  private final Jimm b;
  
  public fi(Jimm paramJimm, String paramString) {
    this.b = paramJimm;
    if (paramString == null)
      return; 
    if (paramString.length() < 1)
      return; 
    byte b = 0;
    int i = 0;
    boolean bool1 = true;
    boolean bool2 = false;
    while (b <= paramString.length()) {
      char c;
      if (b >= paramString.length()) {
        c = 'e';
      } else {
        c = paramString.charAt(b);
      } 
      if (c == '*' || c == '.') {
        i = 200;
        bool1 = true;
        bool2 = true;
        b++;
      } 
      if (c == '#') {
        i = 200;
        bool1 = false;
        bool2 = true;
        b++;
      } 
      if (c == '-') {
        i = 800;
        bool1 = true;
        bool2 = true;
        b++;
      } 
      if (c >= '0' && c <= '9') {
        i = i * 10 + c - 48;
        bool2 = true;
      } else {
        if (bool2) {
          this.a = paramString.substring(b);
          if (bool1 && Jimm.d != null)
            Jimm.d.vibrate(i); 
          if (this.a.length() > 1)
            (new Timer()).schedule(this, i); 
          return;
        } 
        if (c == 'p')
          bool1 = false; 
        if (c == 'v')
          bool1 = true; 
      } 
      b++;
    } 
  }
  
  public final void run() {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\fi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */