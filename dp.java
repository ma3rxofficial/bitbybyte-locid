import java.io.ByteArrayOutputStream;
import java.util.Date;

public final class dp extends bg {
  private int c;
  
  private int d;
  
  private dm e;
  
  private Date f;
  
  private int g;
  
  private int h = 0;
  
  public dp(int paramInt, dm paramdm) {
    super(false, true);
    this.d = paramInt;
    this.e = paramdm;
  }
  
  public final synchronized void b() throws cr {
    this.g = 0;
    switch (this.d) {
      case 2:
        this.g = this.e.r();
        break;
      case 3:
        this.g = this.e.s();
        break;
      case 14:
        this.g = this.e.y;
        break;
    } 
    if (this.g == 0) {
      this.g = dh.b();
      this.c = 0;
    } else {
      this.c = 1;
    } 
    ByteArrayOutputStream byteArrayOutputStream;
    dh.a(byteArrayOutputStream = new ByteArrayOutputStream(), Integer.toString(this.e.n), true);
    dh.a(byteArrayOutputStream, 0, true);
    dh.a(byteArrayOutputStream, this.g, true);
    dh.a(byteArrayOutputStream, this.d, true);
    dh.a(byteArrayOutputStream, 0, false);
    bj bj = null;
    switch (this.c) {
      case 0:
        bj = new bj(19, 8, 0L, new byte[0], byteArrayOutputStream.toByteArray());
        break;
      case 1:
        bj = new bj(19, 10, 0L, new byte[0], byteArrayOutputStream.toByteArray());
        this.g = 0;
        break;
    } 
    cd.i.a(bj);
    this.f = new Date();
  }
  
  public final synchronized boolean a(dd paramdd) throws cr {
    if (paramdd instanceof bj) {
      bj bj;
      if ((bj = (bj)paramdd).a != 19 || bj.b != 14)
        return false; 
      if (dh.a(bj.a(), 0, false) == 0) {
        switch (this.d) {
          case 2:
            this.e.g(this.g);
            break;
          case 3:
            this.e.h(this.g);
            break;
          case 14:
            this.e.y = this.g;
            break;
        } 
        bi.a(this.e, false, false);
      } 
      this.h++;
      return true;
    } 
    return false;
  }
  
  public final synchronized boolean c() {
    return (this.h >= 1);
  }
  
  public final synchronized boolean d() {
    return (this.f.getTime() + 3000L < System.currentTimeMillis());
  }
  
  public final int e() {
    return this.h * 100 / 1;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */