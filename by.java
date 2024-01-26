import i.I;
import java.util.Date;
import javax.microedition.lcdui.Image;

public final class by extends bg {
  public int c = 30000;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private byte[] g;
  
  private byte[] h;
  
  private int i;
  
  private Date j = new Date();
  
  private boolean k;
  
  public by(String paramString, byte[] paramArrayOfbyte) {
    super(false, true);
    this.f = paramString;
    this.g = paramArrayOfbyte;
  }
  
  public final void b() throws cr {
    if (cd.j != null && !cd.j.b) {
      g();
      this.i = 4;
      this.j = new Date();
      return;
    } 
    try {
      byte[] arrayOfByte;
      dh.b(arrayOfByte = new byte[2], 0, 16);
      bj bj = new bj(1, 4, 65540L, new byte[0], arrayOfByte);
      cd.i.a(bj);
      this.i = 0;
    } catch (cr cr) {
      this.i = -1;
      throw new cr((short)597, 100, 50, true);
    } 
    this.j = new Date();
  }
  
  private void g() throws cr {
    byte[] arrayOfByte1;
    int i = (arrayOfByte1 = dh.a(this.f)).length;
    byte[] arrayOfByte2;
    dh.a(arrayOfByte2 = new byte[1 + i + 1 + 2 + 1 + 1 + 16], 0, i);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, i);
    dh.a(arrayOfByte2, 1 + i, 1);
    dh.b(arrayOfByte2, 2 + i, 1);
    dh.a(arrayOfByte2, 4 + i, 1);
    dh.a(arrayOfByte2, 5 + i, 16);
    System.arraycopy(this.g, 0, arrayOfByte2, 6 + i, 16);
    bj bj = new bj(16, 6, 6L, new byte[0], arrayOfByte2);
    try {
      cd.j.a(bj);
      return;
    } catch (cr cr) {
      this.i = -1;
      throw new cr((short)597, 100, 53, true);
    } 
  }
  
  public final boolean a(dd paramdd) throws cr {
    this.k = true;
    try {
      bj bj;
      boolean bool = false;
      switch (this.i) {
        case 0:
          if (paramdd instanceof bj && (bj = (bj)paramdd).a == 1 && bj.b == 5) {
            byte[] arrayOfByte = bj.a();
            int i = 0;
            for (byte b = 0; b < 3; b++) {
              int j = dh.c(arrayOfByte, i);
              byte[] arrayOfByte1 = dh.e(arrayOfByte, i);
              switch (j) {
                case 5:
                  this.d = dh.a(arrayOfByte1);
                  this.e = "5190";
                  break;
                case 6:
                  this.h = arrayOfByte1;
                  break;
              } 
              i += 4 + arrayOfByte1.length;
            } 
            if (this.h.length == 0) {
              this.i = -1;
              throw new cr((short)605, 117, 0, true);
            } 
            try {
              cd.j = new bm();
              cd.j.a(this.d + ":" + this.e, true);
            } catch (cr cr) {
              cd.j = null;
              this.i = -1;
              break;
            } catch (Exception exception) {
              cd.j = null;
              this.i = -1;
              break;
            } 
            this.i = 1;
            bool = true;
          } 
          break;
        case 1:
          if (paramdd instanceof cm) {
            bj = null;
            if (((cm)paramdd).a() == 1) {
              cm cm = new cm(this.h);
              cd.j.a(cm);
            } 
            this.i = 2;
            bool = true;
          } 
          break;
        case 2:
          if (paramdd instanceof bj) {
            bj = null;
            bj bj1 = new bj(1, 2, 0L, new byte[0], dk.d);
            cd.j.a(bj1);
            g();
            this.i = 4;
            bool = true;
          } 
          break;
        case 4:
          if (paramdd instanceof bj && (bj = (bj)paramdd).a == 16 && bj.b == 7) {
            byte[] arrayOfByte1 = bj.a();
            int i = 0;
            int j = dh.a(arrayOfByte1, 0);
            String str = dh.d(arrayOfByte1, 1, j);
            i = 1 + j;
            i += 41;
            int k = dh.c(arrayOfByte1, i);
            i += 2;
            byte[] arrayOfByte2 = new byte[k];
            System.arraycopy(arrayOfByte1, i, arrayOfByte2, 0, k);
            Image image = null;
            try {
              image = Image.createImage(arrayOfByte2, 0, arrayOfByte2.length);
            } catch (Throwable throwable) {}
            if (image != null)
              fb.a(str, new I(image), this.g, arrayOfByte2); 
            this.i = 5;
            bool = true;
          } 
          break;
      } 
      if (bool)
        this.j = new Date(); 
      this.k = false;
      return bool;
    } catch (cr cr) {
      this.j = new Date();
      this.k = false;
      this.i = -1;
      throw cr;
    } 
  }
  
  public final boolean c() {
    return (this.i == 5);
  }
  
  public final boolean d() {
    if (this.i != -1 && !this.k && this.j.getTime() + this.c < System.currentTimeMillis())
      this.i = -1; 
    return (this.i == -1);
  }
  
  public final int e() {
    return (this.i > 0) ? (100 * this.i / 5) : 0;
  }
  
  public final void a(int paramInt) {
    switch (paramInt) {
      case 1:
        return;
      case 2:
      case 3:
        cd.c();
        break;
    } 
  }
  
  public static void a(String paramString) {
    dw.d(paramString);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\by.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */