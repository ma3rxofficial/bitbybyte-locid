package mc;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Vector;

public final class dd {
  public String a;
  
  private m i = null;
  
  public boolean b = false;
  
  private Vector j = new Vector();
  
  private bt k = null;
  
  public mc/a c = null;
  
  public byte[] d = null;
  
  public m e = null;
  
  public DataOutputStream f = null;
  
  public long g;
  
  public int h = 0;
  
  private static void a(int paramInt, DataOutputStream paramDataOutputStream) throws IOException {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[4])[3] = (byte)(paramInt >> 24);
    arrayOfByte[2] = (byte)(paramInt >> 16);
    arrayOfByte[1] = (byte)(paramInt >> 8);
    arrayOfByte[0] = (byte)paramInt;
    paramDataOutputStream.write(arrayOfByte, 0, 4);
  }
  
  public final long a() {
    try {
      return this.i.a();
    } catch (Exception exception) {
      return 0L;
    } 
  }
  
  private static void b(int paramInt, DataOutputStream paramDataOutputStream) throws IOException {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[2])[1] = (byte)(paramInt >> 8);
    arrayOfByte[0] = (byte)paramInt;
    paramDataOutputStream.write(arrayOfByte, 0, 2);
  }
  
  private void h() {
    this.d = "**************************\r\n Created by MiniCommander\r\n      http://kys.su\r\n**************************".getBytes();
  }
  
  public dd() {
    h();
  }
  
  public final void b() {
    if (this.k != null)
      this.k.a(); 
    this.k = null;
  }
  
  public final void c() {
    try {
      if (this.c != null)
        this.c.close(); 
    } catch (Exception exception) {}
    try {
      if (this.k != null)
        this.k.a(); 
    } catch (Exception exception) {}
    try {
      if (this.i != null)
        this.i.d(); 
    } catch (Exception exception) {}
    for (byte b = 0; b < this.j.size(); b++)
      this.j.setElementAt(null, b); 
    this.j.removeAllElements();
    this.i = null;
    this.k = null;
    this.c = null;
    h();
  }
  
  public final int d() {
    return this.b ? this.j.size() : 0;
  }
  
  public final String a(int paramInt) {
    return (paramInt < 0 || paramInt >= d()) ? null : ((mc/cs)this.j.elementAt(paramInt)).a;
  }
  
  public final int b(int paramInt) {
    return (paramInt < 0 || paramInt >= d()) ? -1 : ((mc/cs)this.j.elementAt(paramInt)).c;
  }
  
  public final long c(int paramInt) {
    mc/cs mc/cs;
    return a((mc/cs = this.j.elementAt(paramInt)).i, mc/cs.h);
  }
  
  public final int a(String paramString, boolean paramBoolean) {
    if (paramString == null)
      return -1; 
    if (paramString.length() == 0)
      return -1; 
    if (paramBoolean) {
      paramString = paramString.toLowerCase();
      for (byte b = 0; b < this.j.size(); b++) {
        if (paramString.equals(((mc/cs)this.j.elementAt(b)).a.toLowerCase()))
          return b; 
      } 
    } else {
      for (byte b = 0; b < this.j.size(); b++) {
        if (paramString.equals(((mc/cs)this.j.elementAt(b)).a))
          return b; 
      } 
    } 
    return -1;
  }
  
  public final mc/cs d(int paramInt) {
    return (paramInt < 0 || paramInt >= d()) ? null : this.j.elementAt(paramInt);
  }
  
  public final boolean e(int paramInt) {
    if (this.c != null)
      return false; 
    try {
      mc/cs mc/cs = d(paramInt);
      if (this.k == null)
        this.k = new bt(this.i); 
      this.k.a(mc/cs.b);
      byte[] arrayOfByte = new byte[30];
      this.k.a(arrayOfByte, 0, 30);
      long l;
      if ((l = ((arrayOfByte[0] & 0xFF) + ((arrayOfByte[1] & 0xFF) << 8) + ((arrayOfByte[2] & 0xFF) << 16) + ((arrayOfByte[3] & 0xFF) << 24))) != 67324752L)
        throw new Exception("Invaild local file header"); 
      int i = (arrayOfByte[26] & 0xFF) + ((arrayOfByte[27] & 0xFF) << 8);
      int j = (arrayOfByte[28] & 0xFF) + ((arrayOfByte[29] & 0xFF) << 8);
      this.k.a((i + j));
      this.h = mc/cs.e;
      if (mc/cs.e != 0)
        this.c = new mc/a(this, this.k, mc/cs.d, mc/cs.c); 
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public final int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      return (this.h != 0) ? this.c.read(paramArrayOfbyte, paramInt1, paramInt2) : this.k.a(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (IOException iOException) {
      return 0;
    } 
  }
  
  public final void e() {
    try {
      if (this.c != null)
        this.c.close(); 
    } catch (Exception exception) {}
    this.c = null;
  }
  
  public final boolean a(String paramString) {
    c();
    this.a = paramString;
    i();
    return this.b;
  }
  
  public final int b(String paramString) {
    c();
    this.a = paramString;
    try {
      this.i = new m();
      this.i.a(this.a, 3);
      if (this.i.p()) {
        this.i.d();
        return 2;
      } 
      this.i.n();
      this.b = true;
      return 0;
    } catch (Exception exception) {
      try {
        if (this.i != null)
          this.i.d(); 
      } catch (Exception exception1) {}
      this.i = null;
      this.b = false;
      return -1;
    } 
  }
  
  private boolean i() {
    bt bt1 = null;
    byte[] arrayOfByte = null;
    try {
      this.i = new m();
      this.i.a(this.a, 1);
      bt1 = new bt(this.i);
      int i;
      if ((i = (int)this.i.a()) > 10240) {
        arrayOfByte = new byte[10240];
        bt1.a((i - 10240));
      } else {
        arrayOfByte = new byte[i];
      } 
      if (bt1.a(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length)
        throw new Exception("Read error"); 
      int j = 0;
      int k = 0;
      for (k = arrayOfByte.length - 4; k >= 0 && (j = (arrayOfByte[k] & 0xFF) + ((arrayOfByte[k + 1] & 0xFF) << 8) + ((arrayOfByte[k + 2] & 0xFF) << 16) + ((arrayOfByte[k + 3] & 0xFF) << 24)) != 101010256; k--);
      if (j != 101010256)
        throw new Exception("End of central dir record not found"); 
      k += 16;
      int n = (arrayOfByte[k] & 0xFF) + ((arrayOfByte[k + 1] & 0xFF) << 8) + ((arrayOfByte[k + 2] & 0xFF) << 16) + ((arrayOfByte[k + 3] & 0xFF) << 24);
      k += 4;
      int i1 = (arrayOfByte[k] & 0xFF) + ((arrayOfByte[k + 1] & 0xFF) << 8);
      k += 2;
      if (i1 == 0) {
        this.d = null;
      } else {
        try {
          if (i1 > arrayOfByte.length - k)
            i1 = arrayOfByte.length - k; 
          this.d = new byte[i1];
          System.arraycopy(arrayOfByte, k, this.d, 0, i1);
        } catch (Exception exception) {
          this.d = null;
        } catch (Error error) {
          this.d = null;
        } 
      } 
      bt1.a();
      System.gc();
      (bt1 = new bt(this.i)).a(n);
      byte[] arrayOfByte1 = new byte[46];
      int i2;
      while (bt1.a(arrayOfByte1, 0, 46) == 46 && (i2 = (arrayOfByte1[0] & 0xFF) + ((arrayOfByte1[1] & 0xFF) << 8) + ((arrayOfByte1[2] & 0xFF) << 16) + ((arrayOfByte1[3] & 0xFF) << 24)) == 33639248) {
        int i3 = (arrayOfByte1[4] & 0xFF) + ((arrayOfByte1[5] & 0xFF) << 8);
        int i4 = (arrayOfByte1[6] & 0xFF) + ((arrayOfByte1[7] & 0xFF) << 8);
        int i5 = (arrayOfByte1[8] & 0xFF) + ((arrayOfByte1[9] & 0xFF) << 8);
        int i6 = (arrayOfByte1[10] & 0xFF) + ((arrayOfByte1[11] & 0xFF) << 8);
        int i7 = (arrayOfByte1[12] & 0xFF) + ((arrayOfByte1[13] & 0xFF) << 8);
        int i8 = (arrayOfByte1[14] & 0xFF) + ((arrayOfByte1[15] & 0xFF) << 8);
        int i9 = (arrayOfByte1[16] & 0xFF) + ((arrayOfByte1[17] & 0xFF) << 8) + ((arrayOfByte1[18] & 0xFF) << 16) + ((arrayOfByte1[19] & 0xFF) << 24);
        int i10 = (arrayOfByte1[20] & 0xFF) + ((arrayOfByte1[21] & 0xFF) << 8) + ((arrayOfByte1[22] & 0xFF) << 16) + ((arrayOfByte1[23] & 0xFF) << 24);
        int i11 = (arrayOfByte1[24] & 0xFF) + ((arrayOfByte1[25] & 0xFF) << 8) + ((arrayOfByte1[26] & 0xFF) << 16) + ((arrayOfByte1[27] & 0xFF) << 24);
        int i12 = (arrayOfByte1[28] & 0xFF) + ((arrayOfByte1[29] & 0xFF) << 8);
        int i13 = (arrayOfByte1[30] & 0xFF) + ((arrayOfByte1[31] & 0xFF) << 8);
        int i14 = (arrayOfByte1[32] & 0xFF) + ((arrayOfByte1[33] & 0xFF) << 8);
        int i15 = (arrayOfByte1[38] & 0xFF) + ((arrayOfByte1[39] & 0xFF) << 8) + ((arrayOfByte1[40] & 0xFF) << 16) + ((arrayOfByte1[41] & 0xFF) << 24);
        int i16 = (arrayOfByte1[42] & 0xFF) + ((arrayOfByte1[43] & 0xFF) << 8) + ((arrayOfByte1[44] & 0xFF) << 16) + ((arrayOfByte1[45] & 0xFF) << 24);
        byte[] arrayOfByte2 = new byte[i12];
        bt1.a(arrayOfByte2, 0, i12);
        bt1.a((i13 + i14));
        String str;
        if (!(str = am.b(arrayOfByte2)).endsWith("/") && i15 != 1107230736 && i15 != 16)
          this.j.addElement(new mc/cs(str, i16, i11, i10, i6, i5, i9, i7, i8, i3, i4, false)); 
      } 
      this.b = true;
      bt1.a();
      bt1 = null;
      return true;
    } catch (Exception exception) {
      try {
        if (bt1 != null)
          bt1.a(); 
      } catch (Exception exception1) {}
      try {
        if (this.i != null)
          this.i.d(); 
      } catch (Exception exception1) {}
      this.i = null;
      this.b = false;
      return false;
    } 
  }
  
  public static String c(String paramString) {
    String str1 = cx.c(paramString);
    String str2 = cx.d(paramString);
    str1 = str1.replace('.', '_');
    return str2 + str1 + "_mc_tmp";
  }
  
  public final int f() {
    this.e = new m();
    try {
      this.e.a(c(this.a), 3);
      if (this.e.p()) {
        this.e.d();
        return 2;
      } 
      this.e.n();
      this.f = this.e.c();
      this.g = 0L;
      return 0;
    } catch (Exception exception) {
      System.out.println(exception.toString());
      if (this.f != null)
        try {
          this.f.close();
        } catch (Exception exception1) {
        
        } catch (Error error) {} 
      if (this.e != null)
        try {
          this.e.d();
        } catch (Exception exception1) {
        
        } catch (Error error) {} 
      this.f = null;
      this.e = null;
      return -1;
    } 
  }
  
  public final int a(aw paramaw) {
    b();
    byte b = 0;
    bt bt1 = null;
    try {
      bt1 = new bt(this.i);
      byte[] arrayOfByte1 = new byte[4096];
      byte[] arrayOfByte2 = new byte[30];
      for (byte b1 = 0; b1 < this.j.size(); b1++) {
        mc/cs mc/cs;
        if (!(mc/cs = this.j.elementAt(b1)).l && !mc/cs.m) {
          bt1.a(mc/cs.b);
          int i = mc/cs.d;
          mc/cs.b = (int)this.g;
          a(67324752, this.f);
          b(mc/cs.k, this.f);
          b(mc/cs.f, this.f);
          b(mc/cs.e, this.f);
          b(mc/cs.h, this.f);
          b(mc/cs.i, this.f);
          a(mc/cs.g, this.f);
          a(mc/cs.d, this.f);
          a(mc/cs.c, this.f);
          b(mc/cs.a.length(), this.f);
          b(0, this.f);
          this.f.write(am.c(mc/cs.a));
          this.g += (30 + mc/cs.a.length());
          bt1.a(arrayOfByte2, 0, 30);
          long l1;
          if ((l1 = ((arrayOfByte2[0] & 0xFF) + ((arrayOfByte2[1] & 0xFF) << 8) + ((arrayOfByte2[2] & 0xFF) << 16) + ((arrayOfByte2[3] & 0xFF) << 24))) != 67324752L) {
            b = 17;
            throw new Exception("Invaild local file header. local_file_header_signature=0x" + cx.b(l1, 8));
          } 
          int j = (arrayOfByte2[26] & 0xFF) + ((arrayOfByte2[27] & 0xFF) << 8);
          int k = (arrayOfByte2[28] & 0xFF) + ((arrayOfByte2[29] & 0xFF) << 8);
          bt1.a((j + k));
          long l2 = 0L;
          String str = (paramaw != null) ? aw.j.a(mc/cs.a, aw.r.c) : mc/cs.a;
          while (i > 0) {
            if (paramaw != null && paramaw.x[0]) {
              b = 5;
              throw new Exception();
            } 
            if (paramaw != null) {
              long l = System.currentTimeMillis();
              if (l2 < l) {
                l2 = l + 2000L;
                aw.r.a(bn.al + " (" + String.valueOf((mc/cs.d - i) * 100L / mc/cs.d) + "%)", str, 4);
                paramaw.repaint();
                paramaw.serviceRepaints();
              } 
            } 
            if (i > 4096) {
              if (arrayOfByte1.length != 4096)
                arrayOfByte1 = new byte[4096]; 
            } else {
              arrayOfByte1 = new byte[i];
            } 
            int n = bt1.a(arrayOfByte1, 0, arrayOfByte1.length);
            i -= n;
            this.f.write(arrayOfByte1, 0, n);
          } 
          this.g += mc/cs.d;
          if ((mc/cs.f & 0x8) == 8) {
            a(134695760, this.f);
            a(mc/cs.g, this.f);
            a(mc/cs.d, this.f);
            a(mc/cs.c, this.f);
            this.g += 16L;
          } 
        } 
      } 
      bt1.a();
      return 0;
    } catch (Exception exception) {
      System.out.println(exception.toString());
      if (bt1 != null)
        try {
          bt1.a();
        } catch (Exception exception1) {
        
        } catch (Error error) {} 
      if (this.f != null)
        try {
          this.f.close();
        } catch (Exception exception1) {
        
        } catch (Error error) {} 
      if (this.e != null)
        try {
          this.e.d();
        } catch (Exception exception1) {
        
        } catch (Error error) {} 
      try {
        this.e.a(c(this.a), 3);
        this.e.o();
        this.e.d();
      } catch (Exception exception1) {
      
      } catch (Error error) {}
      this.f = null;
      this.e = null;
      if (b == 5)
        a(this.a); 
      if (b == 0)
        b = -1; 
      return b;
    } 
  }
  
  public static long a(int paramInt1, int paramInt2) {
    try {
      int i = (paramInt1 >> 9) + 1980;
      int j = (paramInt1 >> 5 & 0xF) - 1;
      int k = paramInt1 & 0x1F;
      int n = paramInt2 >> 11;
      int i1 = paramInt2 >> 5 & 0x3F;
      int i2 = (paramInt2 & 0xF) << 1;
      Calendar calendar;
      (calendar = Calendar.getInstance(TimeZone.getDefault())).set(1, i);
      calendar.set(2, j);
      calendar.set(5, k);
      calendar.set(11, n);
      calendar.set(12, i1);
      calendar.set(13, i2);
      return calendar.getTime().getTime();
    } catch (Exception exception) {
      return 0L;
    } 
  }
  
  private static int a(long paramLong) {
    try {
      Calendar calendar;
      (calendar = Calendar.getInstance(TimeZone.getDefault())).setTime(new Date(paramLong));
      int i;
      if ((i = calendar.get(1)) < 1980) {
        i = 1980;
      } else if (i > 2107) {
        i = 2107;
      } 
      int j = calendar.get(2) + 1;
      int k = calendar.get(5);
      int n = calendar.get(11);
      int i1 = calendar.get(12);
      int i2 = calendar.get(13) >> 1;
      long l1 = (k | j << 5 | i - 1980 << 9);
      long l2 = (i2 | i1 << 5 | n << 11);
      return (int)(l1 << 16L | l2);
    } catch (Exception exception) {
      return 0;
    } 
  }
  
  public final int a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, Vector paramVector, String paramString1, String paramString2, aw paramaw, int paramInt, boolean paramBoolean) {
    b();
    byte b = 0;
    long l = 0L;
    InputStream inputStream = null;
    m m1 = null;
    e e = null;
    try {
      System.gc();
      e = new e(paramInt, true);
      dk dk = new dk();
      for (byte b1 = 0; b1 < paramVector.size(); b1++) {
        String str1 = paramVector.elementAt(b1);
        String str2 = paramString2 + str1.substring(paramString1.length(), str1.length());
        int i;
        if ((i = a(str2, true)) != -1) {
          if (!paramBoolean)
            continue; 
          (d(i)).l = true;
        } 
        aw.r.a(bn.am + " (0%)", str1, 4);
        paramaw.repaint();
        paramaw.serviceRepaints();
        (m1 = new m()).a(str1, 1);
        if (!m1.p()) {
          m1.d();
        } else {
          inputStream = m1.g();
          long l1;
          long l2;
          int j = (int)((l2 = a(l1 = m1.r())) & 0xFFFFL);
          int k = (int)(l2 >> 16L & 0xFFFFL);
          int n = 0;
          str2.length();
          int i1 = (int)this.g;
          byte[] arrayOfByte = am.c(str2);
          if (!str1.endsWith("/")) {
            a(67324752, this.f);
            b(10, this.f);
            b(8, this.f);
            b(8, this.f);
            b(j, this.f);
            b(k, this.f);
            this.f.write(paramArrayOfbyte3);
            b(str2.length(), this.f);
            b(0, this.f);
            this.f.write(arrayOfByte);
            int i4 = (int)m1.a();
            String str = aw.j.a(str2, aw.r.c);
            e.a();
            int i3 = i4;
            dk.a();
            while (i4 > 0) {
              if (paramaw.x[0]) {
                b = 5;
                throw new Exception();
              } 
              long l3 = System.currentTimeMillis();
              if (l < l3) {
                l = l3 + 2000L;
                aw.r.a(bn.am + " (" + String.valueOf((i3 - i4) * 100L / i3) + "%)", str, 4);
                paramaw.repaint();
                paramaw.serviceRepaints();
              } 
              int i5 = i4;
              if (i4 > 4096)
                i5 = 4096; 
              int i6;
              if ((i6 = inputStream.read(paramArrayOfbyte1, 0, i5)) == -1) {
                b = 1;
                throw new Exception();
              } 
              if (i6 > 0) {
                dk.a(paramArrayOfbyte1, 0, i5);
                e.a(paramArrayOfbyte1, 0, i5);
                while (!e.d()) {
                  if ((i = e.a(paramArrayOfbyte2)) > 0)
                    this.f.write(paramArrayOfbyte2, 0, i); 
                  n += i;
                } 
                if (i4 == i6) {
                  e.b();
                  while (!e.c()) {
                    if ((i = e.a(paramArrayOfbyte2)) > 0)
                      this.f.write(paramArrayOfbyte2, 0, i); 
                    n += i;
                  } 
                } 
              } 
              i4 -= i6;
            } 
            this.g += (30 + str2.length());
            this.g += n;
            int i2 = dk.b();
            a(134695760, this.f);
            a(i2, this.f);
            a(n, this.f);
            a(i3, this.f);
            this.g += 16L;
            this.j.addElement(new mc/cs(str2, i1, i3, n, 8, 8, i2, j, k, 20, 10, true));
          } 
          inputStream.close();
          m1.d();
        } 
        continue;
      } 
      e.a();
      System.gc();
      return 0;
    } catch (Exception exception) {
      System.out.println(exception.toString());
    } catch (Error error) {
      System.out.println(error.toString());
    } 
    System.gc();
    if (inputStream != null)
      try {
        inputStream.close();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    if (this.f != null)
      try {
        this.f.close();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    if (this.e != null)
      try {
        this.e.d();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    if (m1 != null)
      try {
        m1.d();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    try {
      this.e.a(c(this.a), 3);
      this.e.o();
      this.e.d();
    } catch (Exception exception) {
    
    } catch (Error error) {}
    this.f = null;
    this.e = null;
    if (b == 5)
      a(this.a); 
    if (b == 0)
      b = -1; 
    System.gc();
    return b;
  }
  
  public final int a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, dd paramdd, int[] paramArrayOfint, String paramString1, String paramString2, aw paramaw, boolean paramBoolean) {
    bt bt1;
    b();
    byte b = 0;
    long l = 0L;
    if (paramdd.k == null) {
      bt1 = new bt(paramdd.i);
    } else {
      bt1 = paramdd.k;
    } 
    try {
      System.gc();
      for (byte b1 = 0; b1 < paramArrayOfint.length; b1++) {
        mc/cs mc/cs;
        String str1 = (mc/cs = paramdd.d(paramArrayOfint[b1])).a;
        String str2 = paramString2 + str1.substring(paramString1.length(), str1.length());
        int i;
        if ((i = a(str2, true)) != -1) {
          if (!paramBoolean)
            continue; 
          (d(i)).l = true;
        } 
        aw.r.a(bn.am + " (0%)", str1, 4);
        paramaw.repaint();
        paramaw.serviceRepaints();
        int j = mc/cs.j;
        int k = mc/cs.k;
        int n = mc/cs.f;
        int i1 = mc/cs.e;
        int i2 = mc/cs.h;
        int i3 = mc/cs.i;
        int i4 = mc/cs.g;
        int i5 = mc/cs.d;
        int i6 = mc/cs.c;
        str2.length();
        int i7 = (int)this.g;
        byte[] arrayOfByte = am.c(str2);
        bt1.a(mc/cs.b + 30 + mc/cs.a.length() + 0);
        if (!str1.endsWith("/")) {
          a(67324752, this.f);
          b(k, this.f);
          b(n, this.f);
          b(i1, this.f);
          b(i2, this.f);
          b(i3, this.f);
          if ((n & 0x8) == 8) {
            this.f.write(paramArrayOfbyte3);
          } else {
            a(i4, this.f);
            a(i5, this.f);
            a(i6, this.f);
          } 
          b(str2.length(), this.f);
          b(0, this.f);
          this.f.write(arrayOfByte);
          int i8 = i5;
          String str = aw.j.a(str2, aw.r.c);
          while (i8 > 0) {
            if (paramaw.x[0]) {
              a(this.a);
              b = 5;
              throw new Exception();
            } 
            long l1 = System.currentTimeMillis();
            if (l < l1) {
              l = l1 + 2000L;
              aw.r.a(bn.am + " (" + String.valueOf((i6 - i8) * 100L / i6) + "%)", str, 4);
              paramaw.repaint();
              paramaw.serviceRepaints();
            } 
            if (i8 > 4096) {
              if (paramArrayOfbyte1.length != 4096)
                paramArrayOfbyte1 = new byte[4096]; 
            } else {
              paramArrayOfbyte1 = new byte[i8];
            } 
            int i9 = bt1.a(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
            i8 -= i9;
            this.f.write(paramArrayOfbyte1, 0, i9);
          } 
          this.g += (30 + str2.length());
          this.g += i5;
          if ((n & 0x8) == 8) {
            a(134695760, this.f);
            a(i4, this.f);
            a(i5, this.f);
            a(i6, this.f);
            this.g += 16L;
          } 
          this.j.addElement(new mc/cs(str2, i7, i6, i5, i1, n, i4, i2, i3, j, k, true));
        } 
        continue;
      } 
      if (paramdd.k == null && bt1 != null)
        try {
          bt1.a();
        } catch (Exception exception) {
        
        } catch (Error error) {} 
      System.gc();
      return 0;
    } catch (Exception exception) {
      System.out.println(exception.toString());
    } catch (Error error) {
      System.out.println(error.toString());
    } 
    System.gc();
    if (paramdd.k == null && bt1 != null)
      try {
        bt1.a();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    if (this.f != null)
      try {
        this.f.close();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    if (this.e != null)
      try {
        this.e.d();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    try {
      this.e.a(c(this.a), 3);
      this.e.o();
      this.e.d();
    } catch (Exception exception) {
    
    } catch (Error error) {}
    this.f = null;
    this.e = null;
    if (b == 5)
      a(this.a); 
    if (b == 0)
      b = -1; 
    System.gc();
    return b;
  }
  
  public final int a(byte[] paramArrayOfbyte, String paramString, aw paramaw, boolean paramBoolean) {
    b();
    byte[] arrayOfByte1 = new byte[4096];
    byte[] arrayOfByte2 = new byte[8192];
    byte[] arrayOfByte3 = new byte[12];
    byte b = 0;
    long l = 0L;
    e e = null;
    try {
      System.gc();
      e = new e(1, true);
      dk dk = new dk();
      for (byte b1 = 0; b1 < 1; b1++) {
        int i = a(paramString, false);
        String str = paramString;
        d(i);
        if ((i = a(str, true)) != -1) {
          if (!paramBoolean)
            continue; 
          (d(i)).l = true;
        } 
        if (paramaw != null) {
          aw.r.a(bn.am + " (0%)", paramString, 4);
          paramaw.repaint();
          paramaw.serviceRepaints();
        } 
        long l1;
        long l2;
        int j = (int)((l2 = a(l1 = System.currentTimeMillis())) & 0xFFFFL);
        int k = (int)(l2 >> 16L & 0xFFFFL);
        int n = 0;
        int i1 = 0;
        int i2 = 0;
        str.length();
        int i3 = (int)this.g;
        byte[] arrayOfByte = am.c(str);
        if (!paramString.endsWith("/")) {
          a(67324752, this.f);
          b(10, this.f);
          b(8, this.f);
          b(8, this.f);
          b(j, this.f);
          b(k, this.f);
          this.f.write(arrayOfByte3);
          b(str.length(), this.f);
          b(0, this.f);
          this.f.write(arrayOfByte);
          int i4 = paramArrayOfbyte.length;
          String str1 = (paramaw != null) ? aw.j.a(str, aw.r.c) : str;
          e.a();
          i2 = i4;
          dk.a();
          while (i4 > 0) {
            if (paramaw != null && paramaw.x[0]) {
              b = 5;
              throw new Exception();
            } 
            if (paramaw != null) {
              long l3 = System.currentTimeMillis();
              if (l < l3) {
                l = l3 + 2000L;
                aw.r.a(bn.am + " (" + String.valueOf((i2 - i4) * 100L / i2) + "%)", str1, 4);
                paramaw.repaint();
                paramaw.serviceRepaints();
              } 
            } 
            int i5 = i4;
            if (i4 > 4096)
              i5 = 4096; 
            int i6 = i5;
            System.arraycopy(paramArrayOfbyte, paramArrayOfbyte.length - i4, arrayOfByte1, 0, i5);
            if (i6 == -1) {
              b = 1;
              throw new Exception();
            } 
            if (i6 > 0) {
              dk.a(arrayOfByte1, 0, i5);
              e.a(arrayOfByte1, 0, i5);
              while (!e.d()) {
                if ((i = e.a(arrayOfByte2)) > 0)
                  this.f.write(arrayOfByte2, 0, i); 
                i1 += i;
              } 
              if (i4 == i6) {
                e.b();
                while (!e.c()) {
                  if ((i = e.a(arrayOfByte2)) > 0)
                    this.f.write(arrayOfByte2, 0, i); 
                  i1 += i;
                } 
              } 
            } 
            i4 -= i6;
          } 
          this.g += (30 + str.length());
          this.g += i1;
          n = dk.b();
          a(134695760, this.f);
          a(n, this.f);
          a(i1, this.f);
          a(i2, this.f);
          this.g += 16L;
          this.j.addElement(new mc/cs(str, i3, i2, i1, 8, 8, n, j, k, 20, 10, true));
        } 
        continue;
      } 
      e.a();
      System.gc();
      return 0;
    } catch (Exception exception) {
      System.out.println(exception.toString());
    } catch (Error error) {
      System.out.println(error.toString());
    } 
    System.gc();
    if (this.f != null)
      try {
        this.f.close();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    if (this.e != null)
      try {
        this.e.d();
      } catch (Exception exception) {
      
      } catch (Error error) {} 
    try {
      this.e.a(c(this.a), 3);
      this.e.o();
      this.e.d();
    } catch (Exception exception) {
    
    } catch (Error error) {}
    this.f = null;
    this.e = null;
    if (b == 5)
      a(this.a); 
    if (b == 0)
      b = -1; 
    System.gc();
    return b;
  }
  
  public final int g() {
    byte b = 0;
    try {
      byte b2 = 0;
      int i = 0;
      cx.a(bn.aq + "...", "", "", 0);
      for (byte b1 = 0; b1 < this.j.size(); b1++) {
        mc/cs mc/cs;
        if (!(mc/cs = this.j.elementAt(b1)).l) {
          a(33639248, this.f);
          b(mc/cs.j, this.f);
          b(mc/cs.k, this.f);
          b(mc/cs.f, this.f);
          b(mc/cs.e, this.f);
          b(mc/cs.h, this.f);
          b(mc/cs.i, this.f);
          a(mc/cs.g, this.f);
          a(mc/cs.d, this.f);
          a(mc/cs.c, this.f);
          b(mc/cs.a.length(), this.f);
          b(0, this.f);
          b(0, this.f);
          b(0, this.f);
          b(0, this.f);
          a(0, this.f);
          a(mc/cs.b, this.f);
          this.f.write(am.c(mc/cs.a));
          b2++;
          i += 46 + mc/cs.a.length();
        } 
      } 
      a(101010256, this.f);
      b(0, this.f);
      b(0, this.f);
      b(b2, this.f);
      b(b2, this.f);
      a(i, this.f);
      a((int)this.g, this.f);
      if (this.d == null || this.a.toLowerCase().endsWith(".jar")) {
        b(0, this.f);
      } else if (this.d.length == 0) {
        b(0, this.f);
      } else {
        b(this.d.length, this.f);
        this.f.write(this.d);
      } 
      this.f.close();
      this.e.d();
      this.f = null;
      this.e = null;
    } catch (Exception exception) {
      if (this.f != null)
        try {
          this.f.close();
        } catch (Exception exception1) {
        
        } catch (Error error) {} 
      if (this.e != null)
        try {
          this.e.d();
        } catch (Exception exception1) {
        
        } catch (Error error) {} 
      try {
        this.e.a(c(this.a), 3);
        this.e.o();
        this.e.d();
      } catch (Exception exception1) {
      
      } catch (Error error) {}
      this.f = null;
      this.e = null;
      b = -1;
    } 
    return b;
  }
  
  private class mc/a extends InputStream {
    private int a = 0;
    
    private int b = 0;
    
    private cn c = null;
    
    private bt d = null;
    
    private byte[] e = null;
    
    private int f = 0;
    
    private final void a() throws Exception {
      int i;
      if ((i = this.b - this.f) > 4096) {
        this.e = new byte[4096];
      } else {
        this.e = new byte[this.b - this.f];
      } 
      int j;
      if ((j = this.d.a(this.e, 0, this.e.length)) < 0)
        throw new Exception("Deflated stream ends early."); 
      this.f += j;
      this.c.b(this.e, 0, j);
    }
    
    public mc/a(dd this$0, bt param1bt, int param1Int1, int param1Int2) {
      this.d = param1bt;
      this.a = param1Int2;
      this.b = param1Int1;
      try {
        this.c = new cn(true);
        this.c.d();
        a();
        return;
      } catch (Exception exception) {
        this.c = null;
        return;
      } 
    }
    
    public final int read() throws IOException {
      byte[] arrayOfByte = new byte[1];
      read(arrayOfByte, 0, 1);
      return arrayOfByte[0] & 0xFF;
    }
    
    public final int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      if (param1Int2 == 0)
        return 0; 
      System.currentTimeMillis();
      int i = 0;
      while (true) {
        int j = 0;
        try {
          j = this.c.a(param1ArrayOfbyte, param1Int1, param1Int2);
        } catch (Exception exception) {}
        param1Int2 -= j;
        i += j;
        param1Int1 += j;
        if ((((param1Int2 == 0) ? 1 : 0) | this.c.a()) != 0)
          return i; 
        if ((this.c.b() | this.c.a()) != 0)
          return 0; 
        if (this.c.c())
          try {
            a();
          } catch (Exception exception) {} 
        if (!this.c.c() && j == 0)
          throw new IOException("Don't know what to do"); 
      } 
    }
    
    public final int available() throws IOException {
      return this.a - this.c.a;
    }
    
    public final void close() throws IOException {}
    
    public final synchronized void reset() throws IOException {
      throw new IOException();
    }
    
    public final synchronized void mark(int param1Int) {}
    
    public final boolean markSupported() {
      return false;
    }
    
    public final long skip(long param1Long) throws IOException {
      if (param1Long < 0L)
        throw new IllegalArgumentException(); 
      if (param1Long == 0L)
        return 0L; 
      int i;
      byte[] arrayOfByte = new byte[i = (int)Math.min(param1Long, 2048L)];
      long l = 0L;
      int j;
      while (param1Long > 0L && (j = read(arrayOfByte, 0, i)) > 0) {
        param1Long -= j;
        l += j;
        i = (int)Math.min(param1Long, 2048L);
      } 
      return l;
    }
  }
  
  public static final class mc/cs {
    public String a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public int g;
    
    public int h;
    
    public int i;
    
    public int j;
    
    public int k;
    
    public boolean l;
    
    public boolean m;
    
    public mc/cs(String param1String, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8, int param1Int9, int param1Int10, boolean param1Boolean) {
      this.a = new String(param1String);
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1Int4;
      this.f = param1Int5;
      this.g = param1Int6;
      this.h = param1Int7;
      this.i = param1Int8;
      this.j = param1Int9;
      this.k = param1Int10;
      this.l = false;
      this.m = param1Boolean;
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\dd.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */