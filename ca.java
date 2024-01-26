import i.I;
import java.io.InputStream;

public final class ca extends df implements Runnable {
  private eb[] d;
  
  private Thread e;
  
  private long f;
  
  public final I a(int paramInt) {
    return (paramInt < a() && paramInt >= 0) ? this.d[paramInt] : null;
  }
  
  public final int a() {
    return (this.d != null) ? this.d.length : 0;
  }
  
  private static String b(String paramString, int paramInt) {
    return paramString + "/" + (paramInt + 1) + ".png";
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    try {
      InputStream inputStream;
      int i = (inputStream = getClass().getResourceAsStream(paramString + "/animate.bin")).read();
      this.d = new eb[i];
      df df1 = new df();
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      for (byte b = 0; b < i; b++) {
        j = inputStream.read();
        k = inputStream.read();
        df1.a(b(paramString, b), j);
        boolean bool;
        eb eb1 = (bool = (0 < df1.a()) ? true : false) ? new eb(df1.a(0), k) : null;
        for (byte b1 = 0; b1 < k; b1++) {
          m = inputStream.read();
          n = inputStream.read() * 100;
          if (bool)
            eb1.a(b1, df1.a(m), n); 
        } 
        this.d[b] = eb1;
        if (bool) {
          this.a = Math.max(this.a, eb1.getWidth());
          this.b = Math.max(this.b, eb1.getHeight());
        } 
      } 
    } catch (Exception exception) {}
    if (a() > 0) {
      this.e = new Thread(this);
      this.e.start();
    } 
  }
  
  public final void run() {
    this.f = System.currentTimeMillis();
    long l = 0L;
    Object object = null;
    while (true) {
      try {
        Thread.sleep(100L);
      } catch (Exception exception) {}
      l = System.currentTimeMillis();
      if (object = dw.m() instanceof bd) {
        boolean bool = false;
        for (byte b = 0; b < a(); b++) {
          if (this.d[b] != null)
            bool |= this.d[b].a(l - this.f); 
        } 
        if (bool)
          ((bd)object).k(); 
      } 
      this.f = l;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ca.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */