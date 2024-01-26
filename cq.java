import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.Date;

public final class cq extends bg {
  private String[] c = new String[51];
  
  private Date d;
  
  private int e;
  
  private int f;
  
  public cq(String[] paramArrayOfString) {
    super(false, true);
    this.c = paramArrayOfString;
  }
  
  public final synchronized void b() throws cr {
    ByteArrayOutputStream byteArrayOutputStream;
    dh.a(byteArrayOutputStream = new ByteArrayOutputStream(), 3130, false);
    dh.a(340, byteArrayOutputStream, this.c[1], false);
    dh.a(320, byteArrayOutputStream, this.c[38], false);
    dh.a(330, byteArrayOutputStream, this.c[39], false);
    dh.a(531, byteArrayOutputStream, this.c[12], false);
    dh.a(600, byteArrayOutputStream, this.c[22], false);
    dh.a(400, byteArrayOutputStream, this.c[4], false);
    dh.a(490, byteArrayOutputStream, du.d[0], this.c[44]);
    dh.a(490, byteArrayOutputStream, du.d[1], this.c[45]);
    dh.a(490, byteArrayOutputStream, du.d[2], this.c[46]);
    dh.a(490, byteArrayOutputStream, du.d[3], this.c[47]);
    String str1;
    if ((str1 = this.c[3]) != null && str1.length() != 0)
      dh.a(350, byteArrayOutputStream, this.c[3], false); 
    String str2;
    String[] arrayOfString;
    if ((str2 = this.c[13]) != null && (arrayOfString = dh.a(str2, '.')).length == 3) {
      dh.a(byteArrayOutputStream, 570, false);
      dh.a(byteArrayOutputStream, 6, false);
      dh.a(byteArrayOutputStream, Integer.parseInt(arrayOfString[2]), false);
      dh.a(byteArrayOutputStream, Integer.parseInt(arrayOfString[1]), false);
      dh.a(byteArrayOutputStream, Integer.parseInt(arrayOfString[0]), false);
    } 
    dh.a(byteArrayOutputStream, 380, false);
    dh.a(byteArrayOutputStream, 1, false);
    dh.a(byteArrayOutputStream, dh.h(this.c[11]));
    dh.a(650, byteArrayOutputStream, this.c[9], false);
    dh.a(630, byteArrayOutputStream, this.c[6], false);
    dh.a(710, byteArrayOutputStream, this.c[16], false);
    dh.a(430, byteArrayOutputStream, this.c[19], false);
    dh.a(440, byteArrayOutputStream, this.c[20], false);
    dh.a(450, byteArrayOutputStream, this.c[21], false);
    dg dg = new dg(0L, em.c(-1), 2000, new byte[0], byteArrayOutputStream.toByteArray());
    cd.i.a(dg);
    this.d = new Date();
  }
  
  public final synchronized boolean a(dd paramdd) throws cr {
    boolean bool = false;
    if (paramdd instanceof ex) {
      ex ex;
      if ((ex = (ex)paramdd).k != 2010)
        return false; 
      DataInputStream dataInputStream = dh.b(ex.a(), 0);
      try {
        switch (dh.a(dataInputStream, false)) {
          case 3135:
            if (dataInputStream.readByte() != 10) {
              this.f++;
              break;
            } 
            bool = true;
            this.e++;
            break;
        } 
      } catch (Exception exception) {}
    } 
    return bool;
  }
  
  public final synchronized boolean c() {
    return (this.e >= 1);
  }
  
  public final synchronized boolean d() {
    return (this.d.getTime() + 5000L < System.currentTimeMillis() || this.f > 0);
  }
  
  public final int e() {
    return (this.e > 0) ? 100 : 0;
  }
  
  public final void a(int paramInt) {
    switch (paramInt) {
      case 1:
        bi.i();
        cd.n = true;
        break;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */