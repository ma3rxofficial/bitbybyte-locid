import java.util.Random;
import java.util.Vector;

public final class eu {
  private static ch f;
  
  private static final ch g = new ch(dh.b("09,46,00,00,4c,7f,11,d1,82,22,44,45,53,54,00,00", ',', 16));
  
  private static final ch h = new ch(dh.b("d3,d4,53,19,8b,32,40,3b,ac,c7,d1,a9,e2,b5,81,3e", ',', 16));
  
  private static final ch i = new ch(dh.b("b9,97,08,b5,3a,92,42,02,b0,69,f1,e7,57,bb,2e,17", ',', 16));
  
  private static final ch j = new ch(dh.b("67,36,15,15,61,2d,4c,07,8f,3d,bd,e6,40,8e,a0,41", ',', 16));
  
  private static final ch k = new ch(dh.b("b2,ec,8f,16,7c,6f,45,1b,bd,79,dc,58,49,78,88,b9", ',', 16));
  
  private static final ch l = new ch(dh.b("17,8c,2d,9b,da,a5,45,bb,8d,db,f3,bd,bd,53,a1,0a", ',', 16));
  
  private static final ch m = new ch(dh.b("09,46,01,04,4c,7f,11,d1,82,22,44,45,53,54,00,00", ',', 16));
  
  private static final ch n = new ch(dh.b("09,46,01,01,4c,7f,11,d1,82,22,44,45,53,54,00,00", ',', 16));
  
  public static final byte[] a = dh.a("*mi:", ',', 16);
  
  public static final byte[] b = dh.a("*DiChatFakeUTF8", ',', 16);
  
  public static final ch c = new ch(b);
  
  public static int[] d = new int[1];
  
  public static byte[] e = dh.b("00,06,00,04,11,00,00,00,00,0C,00,25,C0,A8,00,01,00,00,AB,CD,00,00,08,00,00,00,00,00,00,00,50,00,00,00,03,FF,FF,FF,FE,00,01,00,00,FF,FF,FF,FE,00,00", ',', 16);
  
  private static void a(ch[] paramArrayOfch) throws cr {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[paramArrayOfch.length * 16 + 4])[0] = 0;
    arrayOfByte[1] = 5;
    arrayOfByte[2] = (byte)(paramArrayOfch.length * 16 / 256);
    arrayOfByte[3] = (byte)(paramArrayOfch.length * 16 % 256);
    for (byte b = 0; b < paramArrayOfch.length; b++)
      System.arraycopy((paramArrayOfch[b]).a, 0, arrayOfByte, b * 16 + 4, 16); 
    if (cd.i != null)
      cd.i.a(new bj(2, 4, 0L, new byte[0], arrayOfByte)); 
  }
  
  private static void a(Vector paramVector) {
    char c;
    byte[] arrayOfByte1 = dh.v;
    ch ch1 = null;
    String str;
    byte[] arrayOfByte2 = dh.a(str = em.d(132));
    try {
      if (str.indexOf(',') >= 0 || str.indexOf('*') >= 0) {
        arrayOfByte1 = new byte[16];
        String[] arrayOfString = null;
        if ((arrayOfString = dh.a(dh.a(str, '|')[0], '$'))[0].length() > 0) {
          System.arraycopy(arrayOfByte2 = dh.b(arrayOfString[0], ',', 16), 0, arrayOfByte1, 0, (arrayOfByte2.length <= 16) ? arrayOfByte2.length : 16);
          f = new ch(arrayOfByte1);
        } 
        if (arrayOfString.length > 1)
          ch1 = new ch(dh.a(arrayOfString[1], ',', 16)); 
      } else {
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 5, (arrayOfByte2.length <= 11) ? arrayOfByte2.length : 11);
        f = new ch(arrayOfByte1);
      } 
    } catch (Exception exception) {}
    int i;
    switch (i = em.f(212)) {
      case 7:
        paramVector.addElement(f);
        break;
      case 1:
        paramVector.addElement(new ch(dh.e));
        paramVector.addElement(new ch(dh.w));
        break;
      case 0:
        paramVector.addElement(new ch(dh.k));
        paramVector.addElement(h);
        paramVector.addElement(new ch(dh.w));
        break;
      case 12:
        paramVector.addElement(new ch(dh.m));
        break;
      case 13:
        paramVector.addElement(new ch(dh.l));
        break;
      case 14:
        paramVector.addElement(new ch(dh.n));
        paramVector.addElement(new ch(dh.w));
        break;
      case 18:
        paramVector.addElement(new ch(dh.q));
        paramVector.addElement(new ch(dh.w));
        paramVector.addElement(k);
        paramVector.addElement(i);
        paramVector.addElement(new ch(dh.s));
        paramVector.addElement(j);
        break;
      case 15:
        paramVector.addElement(j);
        paramVector.addElement(new ch(dh.q));
        paramVector.addElement(new ch(dh.w));
        paramVector.addElement(k);
        paramVector.addElement(new ch(dh.r));
        paramVector.addElement(l);
        paramVector.addElement(m);
        paramVector.addElement(n);
        break;
      case 11:
        paramVector.addElement(new ch(dh.o));
        break;
      case 21:
        paramVector.addElement(new ch(dh.y));
        break;
      case 2:
        paramVector.addElement(new ch(dh.j));
        paramVector.addElement(new ch(dh.w));
        break;
      case 3:
        paramVector.addElement(new ch(dh.s));
        break;
      case 6:
        paramVector.addElement(new ch(dh.i));
        break;
      case 22:
        paramVector.addElement(new ch(dh.p));
        break;
      case 25:
        paramVector.addElement(new ch(dh.h));
        break;
      case 4:
        paramVector.addElement(new ch(dh.f));
        paramVector.addElement(new ch(dh.g));
        break;
      case 29:
        paramVector.addElement(new ch(dh.z));
        try {
          c = Integer.parseInt(em.d(132), 16);
        } catch (Exception exception) {
          c = '';
        } 
        if (c >= 'y')
          paramVector.addElement(c); 
        if (ch1 != null && c >= 'y')
          paramVector.addElement(ch1); 
        break;
      case 28:
        paramVector.addElement(new ch(dh.A));
        break;
      case 30:
        paramVector.addElement(new ch(dh.B));
        break;
      case 31:
        paramVector.addElement(new ch(dh.D));
        break;
    } 
    if (ch1 != null && i != 29)
      paramVector.addElement(ch1); 
    byte[] arrayOfByte3 = a(dh.C, 0, 16, (byte)(new Random()).nextInt());
    if (i != 15 && i != 30)
      paramVector.addElement(new ch(arrayOfByte3)); 
    if (em.h(96)) {
      arrayOfByte3 = dh.a("*mi:" + dw.b(), ',', 16);
      paramVector.addElement(new ch(arrayOfByte3));
    } 
  }
  
  public static byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, byte paramByte) {
    byte[] arrayOfByte = new byte[16];
    for (byte b = 0; b < paramInt2; b++)
      arrayOfByte[b] = (byte)(paramArrayOfbyte[paramInt1 + b] ^ (b + paramByte) * 456 + b); 
    arrayOfByte[15] = paramByte;
    return arrayOfByte;
  }
  
  private static void d() {
    int i = em.f(212);
    long l1 = -2L;
    long l2 = 65536L;
    long l3 = -2L;
    int j = 8;
    try {
      switch (i) {
        case 7:
          l1 = -2L;
          l2 = 672145424L;
          l3 = -2L;
          j = em.f(219);
          break;
        case 1:
          l1 = -1L;
          l2 = 198663L;
          l3 = -1L;
          j = 8;
          break;
        case 0:
          try {
            l1 = (l1 = Integer.parseInt(em.d(132))) % 10L + (l1 / 10L % 10L << 8L) + (l1 / 100L % 10L << 16L) + (l1 / 1000L % 10L << 24L);
          } catch (Exception exception) {
            l1 = 134220034L;
          } 
          l2 = 14L;
          l3 = 15L;
          j = 11;
          break;
        case 12:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 11;
          break;
        case 13:
        case 31:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 11;
          break;
        case 14:
          try {
            l1 = Integer.parseInt(em.d(132));
          } catch (Exception exception) {
            l1 = 9026L;
          } 
          l2 = 0L;
          l3 = 0L;
          j = 11;
          break;
        case 18:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 9;
          break;
        case 15:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 9;
          break;
        case 8:
          l1 = 1000922031L;
          l2 = 1005278067L;
          l3 = 1005277794L;
          j = 2;
          break;
        case 11:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 0;
          break;
        case 21:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 0;
          break;
        case 2:
          l1 = -129L;
          l2 = 591880L;
          l3 = 0L;
          j = 7;
          break;
        case 3:
          l1 = -2458L;
          l2 = 1104L;
          l3 = 0L;
          j = 9;
          break;
        case 6:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 8;
          break;
        case 22:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 7;
          break;
        case 26:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 8;
          break;
        case 5:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 8;
          break;
        case 28:
          l1 = 0L;
          l2 = 0L;
          l3 = 0L;
          j = 11;
          break;
        case 29:
          l1 = 1717986918L;
          try {
            l2 = Integer.parseInt(em.d(132), 16);
          } catch (Exception exception) {
            l2 = 128L;
          } 
          l2 = 117L;
          l3 = 1717986918L;
          j = 9;
          break;
        case 30:
          l1 = 1209341475L;
          l2 = a();
          l3 = 1209341475L;
          j = 9;
          break;
      } 
    } catch (Exception exception) {}
    String str;
    if ((str = em.d(132)).indexOf(',') >= 0 || str.indexOf('*') >= 0) {
      String[] arrayOfString;
      if ((arrayOfString = dh.a(str, '|')).length > 1)
        try {
          l1 = (int)Long.parseLong(arrayOfString[1], 16);
        } catch (NumberFormatException numberFormatException) {} 
      if (arrayOfString.length > 2)
        try {
          l2 = (int)Long.parseLong(arrayOfString[2], 16);
        } catch (NumberFormatException numberFormatException) {} 
      if (arrayOfString.length > 3)
        try {
          l3 = (int)Long.parseLong(arrayOfString[3], 16);
        } catch (NumberFormatException numberFormatException) {} 
      if (arrayOfString.length > 4)
        try {
          j = (int)Long.parseLong(arrayOfString[4], 10);
        } catch (NumberFormatException numberFormatException) {} 
    } 
    dh.a(e, 21, j, true);
    dh.a(e, 35, l1, true);
    dh.a(e, 39, l2, true);
    dh.a(e, 43, l3, true);
  }
  
  public static long a() {
    return 4501L + 5111808L;
  }
  
  public static void b() throws cr {
    ch[] arrayOfCh1 = { new ch(dh.u), g };
    Vector vector;
    a(vector = new Vector());
    if (em.h(20) || em.h(30))
      vector.addElement(new ch(dh.a)); 
    vector.addElement(new ch(dh.b));
    vector.addElement(new ch(dh.w));
    vector.addElement(new ch(dh.t));
    if (em.f(209) > 0)
      vector.addElement(new ch(dh.x)); 
    ch ch1;
    if ((ch1 = dv.a(c())) != null && cy.b() != null) {
      vector.addElement(ch1);
      if (em.h(30))
        vector.addElement(new ch(dh.s)); 
    } 
    ch[] arrayOfCh2 = new ch[vector.size() + arrayOfCh1.length];
    vector.copyInto((Object[])arrayOfCh2);
    System.arraycopy(arrayOfCh1, 0, arrayOfCh2, vector.size(), arrayOfCh1.length);
    a(arrayOfCh2);
  }
  
  public static int c() {
    d[0] = em.f(218);
    cp.a(34, new Object[] { d }, (Object)null);
    return d[0];
  }
  
  public static void a(int paramInt) throws cr {
    dh.C[7] = (byte)(paramInt >> 8);
    if ((paramInt & 0xFF) == 32)
      dh.C[7] = 1; 
    if ((paramInt & 0xFEFF) == 16)
      paramInt |= 0x1; 
    if ((paramInt & 0xFEFF) == 4)
      paramInt |= 0x1; 
    if ((paramInt & 0xFEFF) == 2)
      paramInt |= 0x1; 
    d[0] = paramInt;
    cp.a(33, new Object[] { d }, (Object)null);
    paramInt = d[0];
    if (cd.i != null) {
      if (dh.C[7] != 0)
        b(); 
      d();
      dh.a(e, 4, paramInt);
      cd.i.a(new bj(1, 30, 0L, new byte[0], e));
    } 
  }
  
  public static void a(byte paramByte) throws cr {
    int i = (cd.a()).o;
    byte b = 9;
    if (i == 0) {
      i = dh.b();
      b = 8;
      (cd.a()).o = i;
    } 
    byte[] arrayOfByte;
    dh.b(arrayOfByte = new byte[15], 0, 0);
    dh.b(arrayOfByte, 2, 0);
    dh.b(arrayOfByte, 4, i);
    dh.b(arrayOfByte, 6, 4);
    dh.b(arrayOfByte, 8, 5);
    dh.b(arrayOfByte, 10, 202);
    dh.b(arrayOfByte, 12, 1);
    dh.a(arrayOfByte, 14, paramByte);
    cd.i.a(new bj(19, b, 0L, new byte[0], arrayOfByte));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\eu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */