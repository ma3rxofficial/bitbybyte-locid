import java.io.ByteArrayOutputStream;

public final class bz extends bg {
  private int c;
  
  private String[] d;
  
  private ff e;
  
  private long f = System.currentTimeMillis();
  
  private final int[] g = new int[] { 
      0, 99, 13, 17, 18, 22, 23, 29, 30, 39, 
      40, 49, 50, 59, 60, 99 };
  
  public bz(ff paramff, String[] paramArrayOfString) {
    super(false, true);
    this.d = paramArrayOfString;
    this.e = paramff;
  }
  
  public final void b() throws cr {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int i;
    for (i = this.d.length - 1; i >= 0; i--) {
      if (this.d[i] == null)
        this.d[i] = em.r; 
    } 
    dh.a(byteArrayOutputStream, 24325, true);
    if (this.d[0].length() != 0) {
      dh.a(byteArrayOutputStream, 13825, true);
      dh.a(byteArrayOutputStream, 4, false);
      dh.b(byteArrayOutputStream, Integer.parseInt(this.d[0]), false);
    } 
    if (this.d[1].length() != 0)
      dh.a(21505, byteArrayOutputStream, this.d[1]); 
    if (this.d[2].length() != 0)
      dh.a(16385, byteArrayOutputStream, this.d[2]); 
    if (this.d[3].length() != 0)
      dh.a(18945, byteArrayOutputStream, this.d[3]); 
    if (this.d[4].length() != 0)
      dh.a(24065, byteArrayOutputStream, this.d[4]); 
    if (this.d[5].length() != 0)
      dh.a(36865, byteArrayOutputStream, this.d[5]); 
    if (this.d[6].length() != 0)
      dh.a(9730, byteArrayOutputStream, this.d[6]); 
    if ((i = dh.a(this.d[9], 0)) != 0) {
      dh.a(byteArrayOutputStream, 26625, true);
      dh.a(byteArrayOutputStream, 4, false);
      dh.a(byteArrayOutputStream, this.g[2 * i], false);
      dh.a(byteArrayOutputStream, this.g[2 * i + 1], false);
    } 
    int j;
    if ((j = dh.a(this.d[7], 0)) != 0) {
      dh.a(byteArrayOutputStream, 31745, true);
      dh.a(byteArrayOutputStream, 1, false);
      dh.a(byteArrayOutputStream, j);
    } 
    dh.a(byteArrayOutputStream, 12290, true);
    dh.a(byteArrayOutputStream, 1, false);
    dh.a(byteArrayOutputStream, this.d[8].equals("1") ? 1 : 0);
    dg dg = new dg(2L, 2, em.c(-1), 2000, new byte[0], byteArrayOutputStream.toByteArray());
    cd.i.a(dg);
    this.c = 1;
  }
  
  public final synchronized boolean a(dd paramdd) throws cr {
    if ((this.c == 1 || this.c == 4) && paramdd instanceof ex) {
      ex ex = (ex)paramdd;
      int i = 0;
      byte[] arrayOfByte;
      if (dh.c(arrayOfByte = ex.a(), 0) == 41985)
        this.c = 4; 
      if (dh.c(arrayOfByte, 0) == 44545)
        this.c = 5; 
      i += true;
      if (dh.a(arrayOfByte, 2) == 10) {
        i += true;
        long l = dh.b(arrayOfByte, 5, false);
        i += true;
        String[] arrayOfString = new String[4];
        for (byte b = 0; b < 4; b++) {
          arrayOfString[b] = dh.d(arrayOfByte, i + 2, dh.a(arrayOfByte, i, false));
          i += 2 + dh.a(arrayOfByte, i, false);
        } 
        String str1 = (dh.a(arrayOfByte, i) == 0) ? "1" : "0";
        int j = dh.a(arrayOfByte, ++i, false);
        i += 2;
        String str2 = dh.e(dh.a(arrayOfByte, i));
        int k = dh.a(arrayOfByte, ++i, false);
        this.e.a(String.valueOf(l), arrayOfString[0], arrayOfString[1] + " " + arrayOfString[2], arrayOfString[3], str1, j, str2, k);
        if (this.c == 5)
          this.c = 6; 
      } else {
        this.c = -1;
      } 
    } 
    this.f = System.currentTimeMillis();
    return false;
  }
  
  public final void a(int paramInt) {
    switch (paramInt) {
      case 1:
        this.e.b().a(1);
        return;
      case 3:
        if (this.c == 4) {
          cr.a(new cr((short)636, 159, 0, true));
          return;
        } 
        this.e.b().a(3);
        return;
      case 2:
        this.e.b().a(2);
        this.c = 7;
        break;
    } 
  }
  
  public final boolean c() {
    return (this.c == 6 || this.c == 7);
  }
  
  public final synchronized boolean d() {
    return (this.c == -1 || this.f + 60000L < System.currentTimeMillis());
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */