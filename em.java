import i.I;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import jimm.Jimm;

public final class em {
  public static final byte[] a = new byte[] { 
      0, 6, 8, 10, 12, 14, 16, 20, 24, 32, 
      48, 64, -2, -3, -4, -6, -8, -9, -15, -18, 
      -24, -30, -36 };
  
  public static int[] b = new int[] { 
      0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
      10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 
      20 };
  
  public static int[] c = new int[] { 
      1576976, 10079487, 52479, 16751052, 3355443, 16777215, 52428, 3368703, 6737151, 819, 
      16711680, 10079487, 10079487, 0, 16777215, 52428, 16711680, 16751001, 65280, 10092441, 
      153, 6710937, 26265, 0 };
  
  public static int[] d = new int[c.length];
  
  public static short[] e = new short[] { 
      160, 161, 162, 163, 164, 127, 165, 166, 167, 168, 
      169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 
      179, 180, 181, 182 };
  
  public static int[] f = new int[] { 
      2001, 1000, 1000, 1000, 2011, 1000, 1000, 1000, 2001, 2012, 
      1000, 1004, 1004, 2014, 1013, 1013, 1000, 1000, 1000, 1000, 
      1000, 1000, 1000, 1000 };
  
  public static Image g;
  
  public static I[] h;
  
  public static Font i;
  
  public static int j;
  
  public static int k;
  
  public static final String[] l = new String[] { "ixhb-nvca", "i-", "i-hbxnvca", "ixhbnvca-", "ixhb-nva", "cx-hbnva", "-hbnvaxi", "ihb-nvxa", "ixhb-nvtca" };
  
  public static final String[] m = new String[] { 
      "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
      "*", "#" };
  
  public static final int[] n = new int[] { 
      48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
      42, 35 };
  
  public static final int o = m.length;
  
  public static int p = 4;
  
  public static int[] q = new int[] { 
      0, 1, 2, 0, 4, 5, 6, 0, 8, 9, 
      10, 0, 12, 13, 14, 0, 16, 17, 15, 0 };
  
  public static final String r = new String();
  
  public static String[] s = new String[20];
  
  public static String[] t = new String[] { 
      r, "kicq.ru", "5190", "120", "unknown", "unknown", bb.a[0], "message.wav", "online.wav", "offline.wav", 
      "typing.wav", "system.wav", r, r, "500", "$", r, r, r, r, 
      r, r, r, r, r, r, r, r, r, r, 
      r, r, "0.1.1", r, "/back.png", r, r, r, r, "1080", 
      "1", r, r, "", "", "http://locid.phpedited.com/", "100", "Standart", "" };
  
  public static boolean[] u = new boolean[] { 
      true, false, false, false, false, false, false, false, false, true, 
      false, true, true, false, false, false, false, true, false, true, 
      true, false, true, false, false, false, false, false, false, false, 
      false, false, true, false, true, false, false, false, true, false, 
      true, true, false, false, true, false, false, false, true, false, 
      true, false, false, true, true, false, false, true, true, true, 
      true, true, true, true, false, true, false, false, true, false, 
      true, false, false, false, false, false, false, false, false, false, 
      true, true, false, true, true, false, false, false, false, true, 
      true, true, Jimm.i, false, true, false, true, true };
  
  public static int[] v = new int[] { 
      0, 1, 0, 0, 10, 3, 0, 0, 0, 1, 
      100, 1, 30, 25, 25, 0, 0, 1024, 38, 9, 
      15, 0, 0, 0, 0, 128, 70, -1, -1, 0, 
      14, 10, 2, 11, 3, 7, 0, 15, 4, 1, 
      0, 0, 0, 128, 0, 0, 300, 1, 0, 64, 
      255, 3, 0, 0, 0, 0, 0, 5, 1, 1, 
      5, 2, 14, 1 };
  
  public static long[] w = new long[] { 0L };
  
  private static byte[][] z = new byte[0][];
  
  public static int[][] x = new int[][] { d, cd.f, b };
  
  public static bv y;
  
  public em() {
    System.arraycopy(c, 0, d, 0, d.length);
    Jimm.f = this;
    try {
      f();
      g();
      h();
    } catch (Exception exception) {
      f();
      g();
    } 
    bb.a(d(106));
  }
  
  public static void a() {
    bv.d();
    int i;
    if ((i = f(256)) != 0)
      dw.t = new Command(bb.a((short)17), i % 1000, i / 1000); 
    if (h(47)) {
      a(47, false);
      g();
    } 
  }
  
  private static void f() {
    a(2, Jimm.k);
    a(5, true);
    a(14, (bb.a[0].equals("RU") || bb.a[0].equals("CZ")));
    a(94, bb.a[0].equals("RU"));
    a(15, true);
    a(47, false);
    a(227, Jimm.k ? 20 : 0);
    a(228, Jimm.i ? 12 : 0);
    a("online.", 108);
    a("offline.", 109);
    a("message.", 107);
    a("typing.", 110);
    a("system.", 111);
    a(85, false);
  }
  
  public static void b() {
    Graphics graphics;
    (graphics = g.getGraphics()).setFont(i);
    for (byte b = 0; b < d.length; b++) {
      int i;
      boolean bool = ((i = f[b]) >= 2000) ? true : false;
      i %= 1000;
      if (bool) {
        graphics.setColor(d[b]);
      } else {
        graphics.setColor(d[i]);
      } 
      graphics.fillRect(b * j, 0, j, k);
      byte b1 = bool ? 66 : 84;
      if (!bool) {
        graphics.setColor(d[b]);
      } else {
        graphics.setColor(d[i]);
      } 
      graphics.drawChar(b1, b * j + (j - i.charWidth(b1)) / 2, (k - i.getHeight()) / 2, 20);
    } 
  }
  
  private static void g() {
    b(116, bb.a((short)455));
    b(117, bb.a((short)456));
    b(118, bb.a((short)457));
    b(119, bb.a((short)458));
    b(120, bb.a((short)459));
    b(121, bb.a((short)460));
    b(122, bb.a((short)461));
    b(123, bb.a((short)462));
    b(124, bb.a((short)463));
  }
  
  private static void h() throws IOException, RecordStoreException {
    try {
      RecordStore recordStore;
      byte[] arrayOfByte = (recordStore = RecordStore.openRecordStore("optlocid", false)).getRecord(1);
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      DataInputStream dataInputStream = null;
      arrayOfByte = recordStore.getRecord(2);
      byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      short s = (dataInputStream = new DataInputStream(byteArrayInputStream)).readShort();
      byte b;
      for (b = 0; b < s; b++) {
        if (u.length > b) {
          u[b] = dataInputStream.readBoolean();
        } else {
          dataInputStream.readBoolean();
        } 
      } 
      s = dataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (v.length > b) {
          v[b] = dataInputStream.readInt();
        } else {
          dataInputStream.readInt();
        } 
      } 
      s = dataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (t.length > b) {
          t[b] = dataInputStream.readUTF();
        } else {
          dataInputStream.readUTF();
        } 
      } 
      s = dataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (w.length > b) {
          w[b] = dataInputStream.readLong();
        } else {
          dataInputStream.readLong();
        } 
      } 
      int i = dataInputStream.readUnsignedShort();
      for (b = 0; b < i; b++) {
        byte[] arrayOfByte1 = new byte[dataInputStream.readShort()];
        dataInputStream.readFully(arrayOfByte1);
        String str = dh.b(arrayOfByte1 = dh.f(arrayOfByte1, 1), 0, arrayOfByte1.length, true);
        if (s.length > b)
          s[b] = str; 
      } 
      i = dataInputStream.readUnsignedShort();
      for (b = 0; b < i; b++) {
        byte[] arrayOfByte1 = new byte[dataInputStream.readShort()];
        dataInputStream.readFully(arrayOfByte1);
        if (z.length > b)
          z[b] = arrayOfByte1; 
      } 
      i = dataInputStream.readUnsignedShort();
      for (b = 0; b < i; b++) {
        short s1 = dataInputStream.readShort();
        for (byte b1 = 0; b1 < s1; b1++) {
          if (b1 < (x[b]).length)
            x[b][b1] = dataInputStream.readInt(); 
        } 
      } 
      recordStore.closeRecordStore();
      c();
    } catch (Exception exception) {}
    try {
      InputStream inputStream;
      byte[] arrayOfByte = new byte[(inputStream = "".getClass().getResourceAsStream("/session.txt")).available()];
      inputStream.read(arrayOfByte);
      inputStream.close();
      String str = dh.a(arrayOfByte, true);
      if (!d(144).equals(str)) {
        b(144, str);
        arrayOfByte = new byte[(inputStream = str.getClass().getResourceAsStream("/options.txt")).available()];
        inputStream.read(arrayOfByte);
        inputStream.close();
        a(dh.a(arrayOfByte, true));
        b(1);
      } 
    } catch (Exception exception) {}
    c();
  }
  
  public static void c() {
    bd.a = h(88);
    bd.b = h(90);
    bd.i = f(260) * 40 + 10;
    bd.k = f(261) * 20 + 30;
    int i;
    if ((i = (20 - f(262)) * 10 + 10) < 10)
      i = 20; 
    bd.j = i;
    bd.V = f(263) - 1;
  }
  
  public static void a(String paramString) {
    String[] arrayOfString;
    a(arrayOfString = dh.b(paramString, '\n'), 0, arrayOfString.length);
  }
  
  public static void a(String[] paramArrayOfString, int paramInt1, int paramInt2) {
    String str = null;
    for (int i = paramInt1; i < paramInt2; i++) {
      int j = (str = paramArrayOfString[i]).indexOf('=');
      int k;
      if ((k = str.indexOf('.')) >= 0 && k < j)
        j = 0; 
      if (j > 0) {
        String str1 = str.substring(0, j).trim();
        String str2 = str.substring(j + 1);
        try {
          int m;
          if ((m = Integer.parseInt(str1)) < 100) {
            if ("!".equals(str2)) {
              a(m, !h(m));
            } else {
              a(m, "true".equals(str2.toLowerCase()));
            } 
          } else if (m < 200) {
            if ((str2 = (new StringBuffer(str2)).toString()).startsWith("+=")) {
              b(m, d(m) + str2);
            } else {
              b(m, str2);
            } 
          } else if (m < 300) {
            a(m, Integer.parseInt(str2.trim()));
          } else if (m < 400) {
            a(m, Long.parseLong(str2.trim()));
          } else if (m < 500) {
            str2 = (new StringBuffer(str2)).toString();
            c(m, str2);
          } else if (m < 600) {
            z[m - 500] = dh.b(str2.trim(), ' ', 16);
          } else if (m < 700) {
            int[] arrayOfInt = dh.c(str2.trim(), ' ', 16);
            for (byte b = 0; b < arrayOfInt.length; b++) {
              if (b < (x[m - 600]).length)
                x[m - 600][b] = arrayOfInt[b]; 
            } 
          } else if (m > 950 && m <= 999) {
            cp.b[m - 950] = "true".equals(str2.toLowerCase());
          } else if (m > 907 && cy.y != null) {
            if (str2.startsWith("+=") && cy.y.d != null) {
              cy.y.d += str2.substring(2);
            } else {
              cy.y.d = str2;
            } 
          } 
        } catch (Exception exception) {}
      } 
    } 
  }
  
  private static void i() throws IOException, RecordStoreException {
    df.c();
    RecordStore recordStore = RecordStore.openRecordStore("optlocid", true);
    while (recordStore.getNumRecords() < 3)
      recordStore.addRecord(null, 0, 0); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = null;
    (new DataOutputStream(byteArrayOutputStream)).writeUTF(Jimm.b);
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    recordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
    byteArrayOutputStream = new ByteArrayOutputStream();
    (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeShort(u.length);
    byte b;
    for (b = 0; b < u.length; b++)
      dataOutputStream.writeBoolean(u[b]); 
    dataOutputStream.writeShort(v.length);
    for (b = 0; b < v.length; b++)
      dataOutputStream.writeInt(v[b]); 
    dataOutputStream.writeShort(t.length);
    for (b = 0; b < t.length; b++) {
      if (t[b] == null) {
        dataOutputStream.writeUTF(r);
      } else {
        dataOutputStream.writeUTF(t[b]);
      } 
    } 
    dataOutputStream.writeShort(w.length);
    for (b = 0; b < w.length; b++)
      dataOutputStream.writeLong(w[b]); 
    dataOutputStream.writeShort(s.length);
    for (b = 0; b < s.length; b++) {
      String str;
      if ((str = s[b]) == null)
        str = r; 
      byte[] arrayOfByte1 = dh.f(dh.a(str, true), 1);
      dataOutputStream.writeShort(arrayOfByte1.length);
      dataOutputStream.write(arrayOfByte1);
    } 
    dataOutputStream.writeShort(z.length);
    for (b = 0; b < z.length; b++) {
      if (z[b] == null) {
        dataOutputStream.writeShort(0);
      } else {
        dataOutputStream.writeShort((z[b]).length);
        dataOutputStream.write(z[b]);
      } 
    } 
    dataOutputStream.writeShort(x.length);
    for (b = 0; b < x.length; b++) {
      int i = 0;
      if (x[b] != null)
        i = (x[b]).length; 
      dataOutputStream.writeShort(i);
      for (byte b1 = 0; b1 < i; b1++)
        dataOutputStream.writeInt(x[b][b1]); 
    } 
    arrayOfByte = byteArrayOutputStream.toByteArray();
    recordStore.setRecord(2, arrayOfByte, 0, arrayOfByte.length);
    recordStore.closeRecordStore();
  }
  
  public static synchronized void a(int paramInt) {
    try {
      i();
      return;
    } catch (Exception exception) {
      cl.a(0, null, "" + exception.getClass(), "(" + paramInt + ")-" + exception.getMessage());
      cr.a(new cr((short)641, 172, paramInt, true));
      return;
    } 
  }
  
  public static void b(int paramInt) {
    fb.b(17, new Integer(paramInt));
  }
  
  public static synchronized String c(int paramInt) {
    int i;
    switch (paramInt) {
      case -3:
      case -2:
      case -1:
        i = f(200) * 4;
        return j(q[i - paramInt - 1]);
    } 
    return (s[paramInt] == null) ? r : s[paramInt];
  }
  
  public static synchronized void a(int paramInt, String paramString) {
    int i;
    switch (paramInt) {
      case -3:
      case -2:
      case -1:
        i = f(200) * 4;
        c(q[i - paramInt - 1], paramString);
        break;
    } 
  }
  
  public static synchronized String d(int paramInt) {
    return t[paramInt - 100];
  }
  
  public static synchronized Object e(int paramInt) {
    if (paramInt < 0)
      return (paramInt != -2) ? c(paramInt) : null; 
    if (paramInt < 100)
      return new Boolean(u[paramInt]); 
    if (paramInt < 200)
      return t[paramInt - 100]; 
    if (paramInt < 300)
      return new Integer(v[paramInt - 200]); 
    if (paramInt < 400)
      return new Long(w[paramInt - 300]); 
    if (paramInt < 500)
      return (paramInt == 400) ? j(0) : ""; 
    if (paramInt < 600)
      return z[paramInt - 500]; 
    if (paramInt < 700)
      return x[paramInt - 600]; 
    if (paramInt < 800) {
      switch (paramInt - 700) {
        case 0:
          return bi.b;
        case 1:
          return bi.d;
        case 2:
          return bi.e;
        case 3:
          return bi.f;
        case 4:
          return bi.g;
        case 5:
          return bi.h;
        case 6:
          return bi.i;
        case 7:
          return bi.j;
        case 8:
          return dv.N;
        case 9:
          return bi.l;
        case 99:
          return bi.k;
      } 
    } else if (paramInt < 1000) {
      switch (paramInt) {
        case 900:
          return new Integer(bd.c);
        case 901:
          return new Integer(bd.d);
        case 902:
          return new Integer(bd.f / bd.g);
        case 903:
          return new Integer(bd.e / bd.g);
        case 904:
          return new Integer(db.b());
        case 905:
          return new Integer(db.c());
        case 906:
          return new Integer(db.d());
        case 907:
          return (cy.y != null) ? cy.y.d : null;
        case 952:
        case 953:
          return new Boolean(cp.b[paramInt - 950]);
      } 
    } 
    return null;
  }
  
  public static synchronized int f(int paramInt) {
    return v[paramInt - 200];
  }
  
  public static synchronized int g(int paramInt) {
    return d[paramInt];
  }
  
  public static synchronized boolean h(int paramInt) {
    return u[paramInt];
  }
  
  public static synchronized long i(int paramInt) {
    return w[paramInt - 300];
  }
  
  public static synchronized void b(int paramInt, String paramString) {
    t[paramInt - 100] = paramString;
  }
  
  public static synchronized void a(int paramInt1, int paramInt2) {
    v[paramInt1 - 200] = paramInt2;
  }
  
  public static synchronized void a(int paramInt, boolean paramBoolean) {
    u[paramInt] = paramBoolean;
  }
  
  public static synchronized void a(int paramInt, long paramLong) {
    w[paramInt - 300] = paramLong;
  }
  
  public static void b(int paramInt1, int paramInt2) {
    d[paramInt1] = paramInt2;
  }
  
  public static void c(int paramInt, String paramString) {
    s[paramInt % 100] = paramString;
  }
  
  public static String j(int paramInt) {
    return s[paramInt % 100];
  }
  
  public static boolean a(int paramInt, Object paramObject) {
    if (paramInt < 100) {
      a(paramInt, ((Boolean)paramObject).booleanValue());
    } else if (paramInt < 200) {
      b(paramInt, (String)paramObject);
    } else if (paramInt < 300) {
      a(paramInt, ((Integer)paramObject).intValue());
    } else if (paramInt < 400) {
      a(paramInt, ((Long)paramObject).longValue());
    } else if (paramInt < 500) {
      c(paramInt, (String)paramObject);
    } else if (paramInt < 600) {
      z[paramInt - 500] = (byte[])paramObject;
    } else if (paramInt < 700) {
      x[paramInt - 600] = (int[])paramObject;
    } else if (paramInt < 800) {
      switch (paramInt - 700) {
        case 0:
          bi.b = (df)paramObject;
          break;
        case 1:
          bi.d = (df)paramObject;
          break;
        case 2:
          bi.e = (df)paramObject;
          break;
        case 3:
          bi.f = (df)paramObject;
          break;
        case 4:
          bi.g = (df)paramObject;
          break;
        case 5:
          bi.h = (df)paramObject;
          break;
        case 6:
          bi.i = (df)paramObject;
          break;
        case 7:
          bi.j = (df)paramObject;
          break;
        case 8:
          dv.N = (df)paramObject;
          break;
        case 9:
          bi.l = (df)paramObject;
          break;
        case 99:
          bi.k = (df)paramObject;
          break;
      } 
    } else if (paramInt == 952 || paramInt == 953) {
      cp.b[paramInt - 950] = ((Boolean)paramObject).booleanValue();
    } else {
      return false;
    } 
    return true;
  }
  
  public static void d() {
    y = new bv();
    y.c();
  }
  
  private static void a(String paramString, int paramInt) {
    if (bi.c(d(paramInt)))
      return; 
    String[] arrayOfString = dh.a("wav|mp3", '|');
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str;
      if (bi.c(str = paramString + arrayOfString[b])) {
        b(paramInt, str);
        return;
      } 
    } 
  }
  
  public static void a(Image paramImage) {
    if (paramImage != null) {
      int i;
      int[] arrayOfInt = new int[(i = paramImage.getWidth()) + 10];
      paramImage.getRGB(arrayOfInt, 1, i, 0, paramImage.getHeight() - 1, i - 1, 1);
      b(4, arrayOfInt[1]);
      b(0, arrayOfInt[3]);
      b(9, arrayOfInt[7]);
      b(8, arrayOfInt[4]);
      b(1, arrayOfInt[2]);
      b(2, arrayOfInt[8]);
      b(3, arrayOfInt[12]);
      b(6, arrayOfInt[11]);
      b(7, arrayOfInt[18]);
      b(5, arrayOfInt[19]);
    } 
  }
  
  public static int e() {
    return (Jimm.d.numAlphaLevels() > 1) ? f(249) : 255;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\em.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */