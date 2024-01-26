import java.io.DataInputStream;
import java.util.Date;

public final class du extends bg {
  private boolean e;
  
  public static boolean c = false;
  
  private boolean f = true;
  
  public static int[] d = new int[] { 0, 0, 0, 0 };
  
  private static int[] g = new int[51];
  
  private static String[] h = new String[51];
  
  private String[] i = new String[51];
  
  private Date j;
  
  private int k;
  
  private boolean l = false;
  
  private String m;
  
  private String n;
  
  private int o;
  
  private int p;
  
  public du(String paramString1, String paramString2) {
    super(false, true);
    this.m = paramString2;
    this.e = false;
    this.k = 0;
    this.i[0] = paramString1;
  }
  
  public final void b() throws cr {
    byte[] arrayOfByte;
    dh.a(arrayOfByte = new byte[6], 0, 1202, false);
    dh.a(arrayOfByte, 2, Long.parseLong(this.i[0]), false);
    dg dg = new dg(0L, em.c(-1), 2000, new byte[0], arrayOfByte);
    cd.i.a(dg);
    this.j = new Date();
  }
  
  public final synchronized boolean a(dd paramdd) throws cr {
    boolean bool = false;
    if (paramdd instanceof ex) {
      ex ex;
      if ((ex = (ex)paramdd).k != 2010)
        return false; 
      DataInputStream dataInputStream = dh.b(ex.a(), 0);
      try {
        String str1;
        int j;
        String str2;
        int k;
        byte b2;
        byte b3;
        int i = dh.a(dataInputStream, false);
        byte b1 = dataInputStream.readByte();
        switch (i) {
          case 200:
            this.i[1] = dh.a(dataInputStream);
            str1 = dh.a(dataInputStream);
            str2 = dh.a(dataInputStream);
            this.i[38] = str1;
            this.i[39] = str2;
            if (str1.length() != 0 || str2.length() != 0)
              this.i[2] = str1 + " " + str2; 
            this.i[3] = dh.a(dataInputStream);
            this.i[4] = dh.a(dataInputStream);
            this.i[5] = dh.a(dataInputStream);
            this.i[6] = dh.a(dataInputStream);
            this.i[7] = dh.a(dataInputStream);
            this.i[8] = dh.a(dataInputStream);
            this.i[9] = dh.a(dataInputStream);
            this.n = this.i[0];
            if (c && this.n.equals(em.c(-1))) {
              dh.a(dataInputStream);
              dh.a(dataInputStream, false);
              byte[] arrayOfByte = new byte[3];
              dataInputStream.readFully(arrayOfByte);
              em.a(31, !(dh.a(arrayOfByte, 2) == 0));
              em.a(32, (dh.a(arrayOfByte, 1) == 0));
              cd.n = true;
              this.e = true;
              if (this.i[1].length() > 0)
                cd.a = this.i[1]; 
              c = false;
            } 
            this.k++;
            bool = true;
            break;
          case 220:
            j = dh.a(dataInputStream, false);
            this.i[10] = (j != 0) ? Integer.toString(j) : new String();
            this.i[11] = dh.e(dataInputStream.readByte());
            this.i[12] = dh.a(dataInputStream);
            k = dh.a(dataInputStream, false);
            b2 = dataInputStream.readByte();
            b3 = dataInputStream.readByte();
            this.p = b2;
            this.o = b3;
            this.i[13] = (k != 0) ? (b3 + "." + b2 + "." + k) : new String();
            this.k++;
            bool = true;
            break;
          case 210:
            for (j = 14; j <= 18; j++)
              this.i[j] = dh.a(dataInputStream); 
            dh.a(dataInputStream);
            dh.a(dataInputStream, false);
            this.i[19] = dh.a(dataInputStream);
            this.i[20] = dh.a(dataInputStream);
            this.i[21] = dh.a(dataInputStream);
            this.k++;
            bool = true;
            break;
          case 230:
            this.i[22] = dh.a(dataInputStream);
            this.k++;
            bool = true;
            break;
          case 240:
            for (j = 0; j < 4; j++)
              d[j] = 0; 
            j = dataInputStream.readByte();
            for (b2 = 0; b2 < j; b2++) {
              int m = 40 + b2;
              int n = 44 + b2;
              k = dh.a(dataInputStream, false);
              if (this.n.equals(em.c(-1)))
                d[b2] = k; 
              this.i[m] = e(k);
              this.i[n] = "\n" + dh.a(dataInputStream);
            } 
            this.k++;
            bool = true;
            break;
          case 250:
            if (b1 != 10)
              this.l = true; 
            this.k++;
            bool = true;
            break;
        } 
      } catch (Exception exception) {
        null.printStackTrace();
      } 
      if (c() && !this.e && this.f) {
        fb.a(6, this.i);
        h();
        this.e = true;
        if (!this.l)
          ci.a(this.n, this.o, this.p); 
      } 
    } 
    return bool;
  }
  
  private static void a(String paramString, int paramInt1, int paramInt2) {
    h[paramInt1] = paramString;
    g[paramInt1] = paramInt2;
  }
  
  private static void g() {
    a("---", 0, 0);
    a(bb.a((short)26), 1, 137);
    a(bb.a((short)27), 2, 134);
    a(bb.a((short)28), 3, 135);
    a(bb.a((short)29), 4, 136);
    a(bb.a((short)30), 5, 109);
    a(bb.a((short)31), 6, 144);
    a(bb.a((short)32), 7, 101);
    a(bb.a((short)33), 8, 128);
    a(bb.a((short)34), 9, 147);
    a(bb.a((short)35), 10, 125);
    a(bb.a((short)36), 11, 146);
    a(bb.a((short)37), 12, 121);
    a(bb.a((short)38), 13, 131);
    a(bb.a((short)39), 14, 120);
    a(bb.a((short)40), 15, 115);
    a(bb.a((short)41), 16, 124);
    a(bb.a((short)42), 17, 116);
    a(bb.a((short)43), 18, 132);
    a(bb.a((short)44), 19, 114);
    a(bb.a((short)45), 20, 107);
    a(bb.a((short)46), 21, 149);
    a(bb.a((short)47), 22, 110);
    a(bb.a((short)48), 23, 100);
    a(bb.a((short)49), 24, 145);
    a(bb.a((short)50), 25, 112);
    a(bb.a((short)51), 26, 103);
    a(bb.a((short)52), 27, 104);
    a(bb.a((short)53), 28, 129);
    a(bb.a((short)54), 29, 142);
    a(bb.a((short)55), 30, 105);
    a(bb.a((short)56), 31, 108);
    a(bb.a((short)57), 32, 141);
    a(bb.a((short)58), 33, 143);
    a(bb.a((short)59), 34, 126);
    a(bb.a((short)60), 35, 113);
    a(bb.a((short)61), 36, 118);
    a(bb.a((short)62), 37, 123);
    a(bb.a((short)63), 38, 133);
    a(bb.a((short)64), 39, 130);
    a(bb.a((short)65), 40, 119);
    a(bb.a((short)66), 41, 127);
    a(bb.a((short)67), 42, 139);
    a(bb.a((short)68), 43, 117);
    a(bb.a((short)69), 44, 111);
    a(bb.a((short)70), 45, 150);
    a(bb.a((short)71), 46, 102);
    a(bb.a((short)72), 47, 148);
    a(bb.a((short)73), 48, 138);
    a(bb.a((short)74), 49, 106);
    a(bb.a((short)75), 50, 122);
  }
  
  private static String e(int paramInt) {
    for (byte b = 0; b < 51; b++) {
      if (g[b] == paramInt)
        return h[b]; 
    } 
    return null;
  }
  
  public static int b(int paramInt) {
    for (byte b = 0; b < 51; b++) {
      if (g[b] == paramInt)
        return b; 
    } 
    return 0;
  }
  
  public static int c(int paramInt) {
    return g[paramInt];
  }
  
  public static String d(int paramInt) {
    return h[paramInt];
  }
  
  private void h() {
    if (this.i[0].equals(this.m))
      bi.a(this.i[0]).a(this.i[1]); 
  }
  
  public final synchronized boolean c() {
    return (this.k >= 5 || this.l);
  }
  
  public final synchronized boolean d() {
    return (this.j.getTime() + 10000L < System.currentTimeMillis());
  }
  
  static {
    g();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\du.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */