import java.util.Hashtable;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Displayable;
import jimm.Jimm;

public final class bs {
  public static Hashtable a = new Hashtable();
  
  public static Random b = new Random();
  
  private static Vector c = new Vector();
  
  private static Vector d = new Vector();
  
  private static Vector e = new Vector();
  
  public static void a(String paramString) {
    Object object;
    if ((object = a.get(paramString)) != null) {
      ((di)object).cancel();
      a.remove(paramString);
    } 
  }
  
  public final void a(dd paramdd) throws cr {
    if (paramdd instanceof eq) {
      Object object = null;
      if (((eq)paramdd).d() == 1) {
        cd.m = false;
        throw new cr((short)598, 110, 0);
      } 
      throw new cr((short)597, 100, 0);
    } 
    if (paramdd instanceof bj) {
      bj bj;
      int i = (bj = (bj)paramdd).a;
      int j = bj.b;
      if (i == 4 && j == 20 && em.f(209) > 0) {
        byte[] arrayOfByte;
        int k = dh.a(arrayOfByte = bj.a(), 10);
        String str = dh.d(arrayOfByte, 11, k);
        boolean bool = false;
        if (dh.c(arrayOfByte, 11 + k) == 2) {
          fb.a(str, true);
        } else {
          fb.a(str, false);
        } 
        a(str, bj, 1);
      } 
      if (i == 4 && j == 11) {
        byte[] arrayOfByte;
        int k = dh.a(arrayOfByte = bj.a(), 10);
        String str = dh.d(arrayOfByte, 11, k);
        long l = (dh.d(arrayOfByte, 0) << 32L) + dh.d(arrayOfByte, 4);
        cj.a(str, l, true);
        a(str, bj, 2);
        int m = 11 + k;
        m += 47;
        if (m < arrayOfByte.length) {
          int n = dh.a(arrayOfByte, m, false);
          dm dm = bi.a(str);
          if (n >= 1000 && n <= 1004 && dm.s) {
            int i2 = dh.a(arrayOfByte, 64 + k, false);
            if (!dm.getBooleanValue(16))
              cj.a(dm, dm.o); 
            cj.a(str, "", dh.b(arrayOfByte, 66 + k, i2, false), "", 0L, true, false, bi.b.a(dm.getImageIndex()), 0L, true);
            bi.r = false;
            if (!ef.e() && bi.a.i())
              dm.p(); 
            dm.s = false;
          } 
          int i1 = dh.a(arrayOfByte, m, false);
          m += 6;
          if (i1 == 26) {
            m += 3;
            int i2 = dh.a(arrayOfByte, m, false);
            m += 2;
            if (i2 != 79)
              throw new cr((short)776, 259, 1, false); 
            m += 18;
            long l1 = dh.b(arrayOfByte, m, false);
            m += 4;
            String str1 = dh.d(arrayOfByte, m, (int)l1);
            m = (int)(m + l1);
            m += 15;
            if (str1 != null && str1.compareTo("Script Plug-in: Remote Notification Arrive") == 0) {
              m += 8;
              int i3 = arrayOfByte.length - m;
              String str2 = dh.b(arrayOfByte, m, i3, true);
              try {
                cg.a(str, str2);
              } catch (Exception exception) {}
            } 
          } 
        } 
      } 
      if ((i == 3 && j == 11) || (i == 2 && j == 6)) {
        byte[] arrayOfByte1 = new byte[4];
        byte[] arrayOfByte2 = new byte[4];
        int k = 0;
        int m = -1;
        int n = 0;
        int i1 = 0;
        boolean bool1 = true;
        boolean bool2 = (i == 2 && j == 6) ? true : false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean bool3 = false;
        byte[] arrayOfByte3 = null;
        byte[] arrayOfByte4 = null;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        byte[] arrayOfByte5;
        int i9 = dh.a(arrayOfByte5 = bj.a(), 0);
        String str1 = dh.d(arrayOfByte5, 1, i9);
        byte[] arrayOfByte6 = null;
        a(str1, bj, 3);
        int i10 = bool2 ? -1 : 0;
        int i11 = -1;
        int i12 = -1;
        String str2 = "";
        int i13 = 1 + i9 + 2;
        int i14 = dh.c(arrayOfByte5, i13);
        i13 += 2;
        for (byte b = 0; b < i14; b++) {
          int i16 = dh.c(arrayOfByte5, i13);
          byte[] arrayOfByte = dh.e(arrayOfByte5, i13);
          if (i16 == 6) {
            i10 = (int)dh.d(arrayOfByte, 0);
          } else if (i16 == 13) {
            arrayOfByte3 = arrayOfByte;
          } else if (i16 == 25) {
            arrayOfByte4 = arrayOfByte;
          } else if (i16 == 10) {
            System.arraycopy(arrayOfByte, 0, arrayOfByte2, 0, 4);
          } else if (i16 == 12) {
            System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, 4);
            k = (int)dh.d(arrayOfByte, 4);
            m = dh.a(arrayOfByte, 8);
            n = dh.c(arrayOfByte, 9);
            i1 = (int)dh.d(arrayOfByte, 11);
            i2 = (int)dh.d(arrayOfByte, 23);
            i3 = (int)dh.d(arrayOfByte, 27);
            i4 = (int)dh.d(arrayOfByte, 31);
            bool1 = false;
          } else if (i16 == 3) {
            i7 = (int)dh.b(dh.b(arrayOfByte));
          } else if (i16 == 4) {
            i5 = (int)dh.b(arrayOfByte) / 256;
          } else if (i16 == 15) {
            i6 = (int)dh.b(arrayOfByte);
          } else if (i16 == 5) {
            i8 = (int)dh.b(arrayOfByte);
          } else if (i16 == 29) {
            int i17 = 0;
            int i18 = arrayOfByte.length;
            try {
              while (i17 < i18 - 1) {
                int i19 = dh.c(arrayOfByte, i17);
                i17 += 2;
                int i20 = dh.a(arrayOfByte, i17);
                int i21 = dh.a(arrayOfByte, ++i17);
                int i22 = i17;
                if (i21 > 0) {
                  int i23;
                  switch (i19) {
                    case 1:
                      if (i20 != 1)
                        break; 
                      arrayOfByte6 = new byte[16];
                      System.arraycopy(arrayOfByte, ++i22, arrayOfByte6, 0, (i21 < 17) ? i21 : 16);
                      break;
                    case 14:
                      if (i20 != 0)
                        break; 
                      i12 = Integer.parseInt(dh.d(arrayOfByte, i22 + 8, i21 - 7));
                      break;
                    case 2:
                      if (i20 != 4)
                        break; 
                      i23 = dh.c(arrayOfByte, ++i22);
                      i22 += 2;
                      str2 = dh.b(arrayOfByte, i22, i23, true);
                      break;
                  } 
                } 
                i17 += i21 + 1;
              } 
            } catch (Exception exception) {}
          } 
          i13 += 4 + arrayOfByte.length;
        } 
        dm dm;
        if ((dm = bi.a(str1)) != null) {
          i11 = dm.w.c();
          byte[] arrayOfByte = dh.a(arrayOfByte3, arrayOfByte4);
          dm.b(arrayOfByte);
          dm.x = i10 >> 16 & 0xFFFF;
          dm.a(arrayOfByte6);
          if (i12 != -1 && i12 < dv.a) {
            dm.w.O = i12;
            if (str2 != null && str2.length() > 1 && dm.getBooleanValue(16))
              cj.a(str1, "", str2, "", 0L, true, false, dv.b(i12), 0L, true); 
          } 
          dm.q();
        } 
        if (bool2) {
          String str;
          int i16 = dh.a(i10);
          if (dm != null) {
            str = dm.o + "\n" + dw.b(i16);
          } else {
            str = dw.b(i16);
          } 
          Alert alert;
          (alert = new Alert(str1, str, null, null)).setTimeout(Jimm.i ? -2 : 3000);
          Jimm.d.setCurrent((Displayable)alert);
        } 
        int i15;
        if ((i15 = dh.a(str1, i2, i3, i4, dh.a(arrayOfByte3, arrayOfByte4), n, bool1)) == 1) {
          i10 = i10 & 0xFFFF0117 | 0x20;
        } else if (i15 != 0) {
          i10 = i10 & 0xFFFF0FDF | i15 << 8 & 0xF000;
        } 
        fb.a(str1, i10, i11, arrayOfByte1, arrayOfByte2, k, m, n, i1, i7, i6, i5, i8, arrayOfByte6, null, null);
      } 
      if (i == 3 && j == 12) {
        byte[] arrayOfByte;
        int k = dh.a(arrayOfByte = bj.a(), 0);
        String str = dh.d(arrayOfByte, 1, k);
        a(str, bj, 4);
        fb.a(4, str);
        return;
      } 
      if (i == 4 && j == 12) {
        byte[] arrayOfByte;
        if ((arrayOfByte = bj.a()).length > 11) {
          long l = (dh.d(arrayOfByte, 0) << 32L) + dh.d(arrayOfByte, 4);
          int k = dh.a(arrayOfByte, 10);
          String str = dh.d(arrayOfByte, 11, k);
          a(str, bj, 5);
          cj.a(str, l, false);
        } 
        return;
      } 
      if (i == 4 && j == 7) {
        byte[] arrayOfByte2;
        int i2;
        byte[] arrayOfByte1 = bj.a();
        int k = 0;
        if (arrayOfByte1.length < 11)
          throw new cr((short)627, 150, 0, false); 
        long l1 = dh.b(arrayOfByte1, 0, false);
        long l2 = dh.b(arrayOfByte1, 4, false);
        int m = dh.c(arrayOfByte1, 8);
        int n = dh.a(arrayOfByte1, 10);
        if (arrayOfByte1.length < 11 + n + 4)
          throw new cr((short)627, 150, 1, false); 
        String str = dh.d(arrayOfByte1, 11, n);
        a(str, bj, 6);
        k = 11 + n;
        k += 2;
        int i1 = dh.c(arrayOfByte1, k);
        k += 2;
        for (byte b = 0; b < i1; b++) {
          byte[] arrayOfByte;
          if ((arrayOfByte = dh.e(arrayOfByte1, k)) == null)
            throw new cr((short)627, 150, 2, false); 
          k += 4 + arrayOfByte.length;
        } 
        do {
          if ((arrayOfByte2 = dh.e(arrayOfByte1, k)) == null)
            throw new cr((short)627, 150, 3, false); 
          i2 = dh.c(arrayOfByte1, k);
          k += 4 + arrayOfByte2.length;
        } while (i2 != 2 && i2 != 5);
        int i3 = 0;
        if (m == 1) {
          byte[] arrayOfByte = null;
          while (i3 < arrayOfByte2.length) {
            byte[] arrayOfByte3;
            if ((arrayOfByte3 = dh.e(arrayOfByte2, i3)) == null)
              throw new cr((short)628, 151, 0, false); 
            i2 = dh.c(arrayOfByte2, i3);
            i3 += 4 + arrayOfByte3.length;
            switch (i2) {
              case 1281:
                break;
              case 257:
                arrayOfByte = arrayOfByte3;
                break;
            } 
          } 
          if (arrayOfByte != null) {
            String str1;
            if (arrayOfByte.length < 4)
              throw new cr((short)628, 151, 2, false); 
            if (dh.c(arrayOfByte, 0) == 2) {
              str1 = dh.c(dh.e(arrayOfByte, 4, arrayOfByte.length - 4));
            } else {
              str1 = dh.c(dh.d(arrayOfByte, 4, arrayOfByte.length - 4));
            } 
            Object object = null;
            fb.a(new ce(str, em.c(-1), dh.a(false), str1, false));
            dm dm = bi.a(str);
            if (em.h(24) && dm != null)
              a(dm); 
          } 
          return;
        } 
        if (m == 2) {
          if (arrayOfByte2.length < 10)
            throw new cr((short)629, 152, 0, false); 
          boolean bool = false;
          if (dh.c(arrayOfByte2, 0) != 0)
            return; 
          i3 += 2;
          i3 += 8;
          if (arrayOfByte2.length < 26)
            throw new cr((short)629, 152, 1, false); 
          i3 += 16;
          int i4 = -1;
          byte[] arrayOfByte3 = new byte[4];
          byte[] arrayOfByte4 = new byte[4];
          while (true) {
            byte[] arrayOfByte;
            if ((arrayOfByte = dh.e(arrayOfByte2, i3)) == null)
              throw new cr((short)629, 152, 2, false); 
            switch (i2 = dh.c(arrayOfByte2, i3)) {
              case 3:
                System.arraycopy(arrayOfByte, 0, arrayOfByte3, 0, 4);
                break;
              case 4:
                System.arraycopy(arrayOfByte, 0, arrayOfByte4, 0, 4);
                break;
              case 5:
                dh.a(arrayOfByte);
                break;
              case 10:
                i4 = dh.c(arrayOfByte, 0);
                break;
            } 
            i3 += 4 + arrayOfByte.length;
            if (i2 == 10001) {
              int i5 = 0;
              if (arrayOfByte.length < 53)
                throw new cr((short)629, 152, 3, false); 
              int i6;
              if ((i6 = dh.a(arrayOfByte, 45, false)) != 1 && i6 != 4 && i6 != 26 && (i6 < 1000 || i6 > 1004))
                return; 
              int i7 = dh.a(arrayOfByte, 51, false);
              if ((i6 < 1000 || i6 > 1004) && arrayOfByte.length < 53 + i7 + 4 + 4)
                throw new cr((short)629, 152, 4, false); 
              byte[] arrayOfByte5 = new byte[i7];
              System.arraycopy(arrayOfByte, 53, arrayOfByte5, 0, i7);
              i5 = 53 + i7;
              if ((i6 == 1 || i6 == 4) && arrayOfByte5.length > 1) {
                bp bp;
                if (i6 == 1 || i6 == 4)
                  i5 += 8; 
                boolean bool1 = false;
                int i8;
                if (arrayOfByte.length >= i5 + 4 && (i8 = (int)dh.b(arrayOfByte, i5, false)) == 38 && dh.d(arrayOfByte, i5 + 4, i8).equals("{0946134E-4C7F-11D1-8222-444553540000}"))
                  bool1 = true; 
                if (i6 == 1) {
                  String str1;
                  if ((str1 = dh.c(dh.a(arrayOfByte5, bool1))).indexOf("rtf1") > 0)
                    str1 = dh.m(str1); 
                  ce ce = new ce(str, em.c(-1), dh.a(false), str1, false);
                } else {
                  String str1;
                  String str2;
                  byte b1 = -1;
                  for (byte b2 = 0; b2 < arrayOfByte5.length; b2++) {
                    if (arrayOfByte5[b2] == 254) {
                      b1 = b2;
                      break;
                    } 
                  } 
                  if (b1 != -1) {
                    str1 = dh.c(dh.b(arrayOfByte5, 0, b1, bool1));
                    str2 = dh.c(dh.b(arrayOfByte5, b1 + 1, arrayOfByte5.length - b1 - 1, bool1));
                  } else {
                    str1 = dh.c(dh.a(arrayOfByte5, bool1));
                    str2 = "";
                  } 
                  bp = new bp(str, em.c(-1), dh.a(false), str2, str1);
                } 
                fb.a(bp);
                dm dm = bi.a(str);
                if (em.h(24) && dm != null)
                  a(dm); 
                byte[] arrayOfByte6 = new byte[11 + n + 2 + 51 + 3];
                int i9 = 0;
                System.arraycopy(arrayOfByte1, 0, arrayOfByte6, 0, 10);
                dh.a(arrayOfByte6, 10, n);
                byte[] arrayOfByte7;
                System.arraycopy(arrayOfByte7 = dh.a(str), 0, arrayOfByte6, 11, arrayOfByte7.length);
                i9 = 11 + arrayOfByte7.length;
                dh.b(arrayOfByte6, i9, 3);
                i9 += 2;
                System.arraycopy(arrayOfByte, 0, arrayOfByte6, i9, 51);
                i9 += 51;
                dh.a(arrayOfByte6, i9, 1, false);
                i9 += 2;
                dh.a(arrayOfByte6, i9, 0);
                bj bj1 = new bj(4, 11, 0L, new byte[0], arrayOfByte6);
                cd.i.a(bj1);
                return;
              } 
              if (i6 == 26) {
                if (arrayOfByte.length < i5 + 2 + 18 + 4)
                  throw new cr((short)629, 152, 5, false); 
                int i8 = i5;
                i5 += 20;
                int i9 = (int)dh.b(arrayOfByte, i5, false);
                i5 += 4;
                if (arrayOfByte.length < i5 + i9 + 15 + 4 + 4)
                  throw new cr((short)629, 152, 6, false); 
                String str1 = dh.d(arrayOfByte, i5, i9);
                i5 += i9;
                i5 += 19;
                i7 = (int)dh.b(arrayOfByte, i5, false);
                i5 += 4;
                if (arrayOfByte.length < i5 + i7)
                  throw new cr((short)629, 152, 7, false); 
                String str2 = dh.c(dh.d(arrayOfByte, i5, i7));
                i5 += i7;
                if (str1.equals("File") && Jimm.c.m.isShown()) {
                  if (i4 == 2) {
                    String str3 = Integer.toString(dh.c(arrayOfByte, i5));
                    i5 += 2;
                    i5 += 2;
                    i7 = dh.a(arrayOfByte, i5, false);
                    i5 += 2;
                    if (arrayOfByte.length < i5 + i7)
                      throw new cr((short)629, 152, 8, false); 
                    dh.c(dh.d(arrayOfByte, i5, i7));
                    long l = 0L;
                    if (arrayOfByte2.length < 8)
                      throw new cr((short)629, 152, 9, false); 
                    if ((arrayOfByte = dh.e(arrayOfByte2, i3)) == null)
                      throw new cr((short)629, 152, 2, false); 
                    if (dh.c(arrayOfByte2, i3) == 4)
                      System.arraycopy(arrayOfByte, 0, arrayOfByte4, 0, 4); 
                    dm dm;
                    (dm = bi.a(str)).a(225, arrayOfByte4);
                    dm.a(226, arrayOfByte3);
                    dm.a(74, Integer.parseInt(str3));
                    cs cs = new cs(dm.u);
                    try {
                      cd.a(cs);
                    } catch (cr cr2) {
                      cr cr1;
                      cr.a(cr1 = null);
                      if (cr1.a)
                        return; 
                    } 
                    ef.a(bb.a((short)242), cs, true);
                    break;
                  } 
                } else {
                  if (str1.equals("Send Web Page Address (URL)")) {
                    String str3;
                    String str4;
                    int i10;
                    if ((i10 = str2.indexOf('þ')) != -1) {
                      str3 = str2.substring(0, i10);
                      str4 = str2.substring(i10 + 1);
                    } else {
                      str3 = str2;
                      str4 = "";
                    } 
                    Object object = null;
                    fb.a(new bp(str, em.c(-1), dh.a(false), str4, str3));
                    byte[] arrayOfByte6 = new byte[11 + n + 2 + 51 + 3 + 20 + 4 + i9 + 19 + 4 + i7];
                    System.arraycopy(arrayOfByte1, 0, arrayOfByte6, 0, 10);
                    dh.a(arrayOfByte6, 10, n);
                    byte[] arrayOfByte7;
                    System.arraycopy(arrayOfByte7 = dh.a(str), 0, arrayOfByte6, 11, arrayOfByte7.length);
                    int i11 = 11 + arrayOfByte7.length;
                    dh.b(arrayOfByte6, i11, 3);
                    i11 += 2;
                    System.arraycopy(arrayOfByte2, 0, arrayOfByte6, i11, 51);
                    i11 += 51;
                    dh.a(arrayOfByte6, i11, 1, false);
                    i11 += 2;
                    dh.a(arrayOfByte6, i11, 0);
                    System.arraycopy(arrayOfByte, i8, arrayOfByte6, ++i11, 24 + i9 + 19 + 4 + i7);
                    bj bj1 = new bj(4, 11, 0L, new byte[0], arrayOfByte6);
                    cd.i.a(bj1);
                    break;
                  } 
                  if (str1.equals("Script Plug-in: Remote Notification Arrive"))
                    try {
                      cg.a(str, str2, i6, l1, l2);
                      break;
                    } catch (Exception exception) {} 
                } 
                return;
              } 
              if (i6 >= 1000 && i6 <= 1004) {
                String str1 = "";
                byte b1 = 0;
                switch ((int)em.i(300)) {
                  case 1:
                    b1 = 116;
                    break;
                  case 4:
                    b1 = 118;
                    break;
                  case 2:
                    b1 = 117;
                    break;
                  case 16:
                    b1 = 119;
                    break;
                  case 12288:
                    b1 = 120;
                    break;
                  case 16384:
                    b1 = 121;
                    break;
                  case 20480:
                    b1 = 122;
                    break;
                  case 24576:
                    b1 = 123;
                    break;
                  case 8193:
                    b1 = 124;
                    break;
                } 
                if (b1 != 0)
                  str1 = dh.a(em.d(b1), "%TIME%", cd.n()); 
                Object[] arrayOfObject = { str, str1 };
                Object object = cp.a(31, arrayOfObject, (Object)null);
                str1 = (String)arrayOfObject[1];
                if (object != null && object instanceof Boolean)
                  str1 = ""; 
                if (object != null && object instanceof String[]) {
                  Object object1 = null;
                  str1 = ((String[])object)[0];
                } 
                byte[] arrayOfByte6;
                boolean bool1;
                if ((bool1 = ((arrayOfByte6 = dh.a(str1, false)).length < 1) ? true : false) && !em.h(68))
                  return; 
                if (em.h(60)) {
                  if (em.h(67)) {
                    cl.a(1, str, bb.a((short)79), bool1 ? "Blocked" : ("\"" + str1 + "\""));
                  } else {
                    cl.a(1, str, bb.a((short)79));
                  } 
                  bi.b(str, 5);
                } 
                if (bool1)
                  return; 
                byte[] arrayOfByte7 = new byte[11 + n + 2 + 51 + 2 + arrayOfByte6.length + 1];
                System.arraycopy(arrayOfByte1, 0, arrayOfByte7, 0, 10);
                dh.a(arrayOfByte7, 10, n);
                byte[] arrayOfByte8;
                System.arraycopy(arrayOfByte8 = dh.a(str), 0, arrayOfByte7, 11, arrayOfByte8.length);
                int i8 = 11 + arrayOfByte8.length;
                dh.b(arrayOfByte7, i8, 3);
                i8 += 2;
                System.arraycopy(arrayOfByte, 0, arrayOfByte7, i8, 51);
                dh.b(arrayOfByte7, i8 + 2, 2048);
                i8 += 51;
                dh.a(arrayOfByte7, i8, arrayOfByte6.length + 1, false);
                i8 += 2;
                System.arraycopy(arrayOfByte6, 0, arrayOfByte7, i8, arrayOfByte6.length);
                dh.a(arrayOfByte7, i8 + arrayOfByte6.length, 0);
                bj bj1 = new bj(4, 11, 0L, new byte[0], arrayOfByte7);
                cd.i.a(bj1);
              } 
              return;
            } 
          } 
        } else {
          if (m == 4) {
            if (arrayOfByte2.length < 8)
              throw new cr((short)630, 153, 0, false); 
            int i4;
            if ((i4 = dh.a(arrayOfByte2, 4, false)) != 1 && i4 != 4)
              return; 
            int i5 = dh.a(arrayOfByte2, 6, false);
            if (arrayOfByte2.length != 8 + i5)
              throw new cr((short)630, 153, 1, false); 
            String str1 = dh.c(dh.d(arrayOfByte2, 8, i5));
            if (i4 == 1) {
              Object object = null;
              fb.a(new ce(str, em.c(-1), dh.a(false), str1, false));
              return;
            } 
            if (i4 == 4) {
              String str2;
              String str3;
              int i6;
              if ((i6 = str1.indexOf('þ')) != -1) {
                str2 = str1.substring(0, i6);
                str3 = str1.substring(i6 + 1);
              } else {
                str2 = str1;
                str3 = "";
              } 
              Object object = null;
              fb.a(new bp(str, em.c(-1), dh.a(false), str3, str2));
            } 
          } 
          return;
        } 
      } else {
        bt bt;
        if (i == 19 && j == 28) {
          byte[] arrayOfByte;
          int k = dh.a(arrayOfByte = bj.a(), 0);
          String str = dh.d(arrayOfByte, 1, k);
          a(str, bj, 7);
          Object object = null;
          fb.a(new bt(1, str, false, null));
          return;
        } 
        if (i == 21 && j == 3) {
          byte[] arrayOfByte;
          int k = dh.a(arrayOfByte = bj.a(), 0, false);
          int m = dh.a(arrayOfByte, 2);
          if (k == 170 && m == 10) {
            Alert alert;
            (alert = new Alert("", bb.a((short)144), null, AlertType.INFO)).setTimeout(15000);
            Jimm.d.setCurrent(alert, Jimm.d.getCurrent());
            em.b(12);
          } 
          return;
        } 
        if (i == 19 && j == 10) {
          byte[] arrayOfByte;
          int k = dh.a(arrayOfByte = bj.a(), 1);
          if (dh.a(arrayOfByte, 2 + k) != 0) {
            String str1 = dh.d(arrayOfByte, 2, k);
            a(str1, bj, 8);
            int m = dh.a(arrayOfByte, 13 + k);
            String str2 = dh.b(arrayOfByte, 14 + k, m, true);
            bt = null;
            fb.a(new bt(6, str1, false, str2));
          } 
          return;
        } 
        if (i == 19 && j == 25) {
          int k = 0;
          byte[] arrayOfByte;
          int m = dh.a(arrayOfByte = bj.a(), 0);
          String str1 = dh.d(arrayOfByte, 1, m);
          a(str1, bj, 9);
          k = 1 + m;
          m = dh.c(arrayOfByte, k);
          k += 2;
          String str2 = dh.b(arrayOfByte, k, m, dh.f(arrayOfByte, k, m));
          bt = new bt(3, str1, false, str2);
        } else if (i == 19 && j == 27) {
          int k = 0;
          byte[] arrayOfByte;
          int m = dh.a(arrayOfByte = bj.a(), 0);
          String str = dh.d(arrayOfByte, 1, m);
          a(str, bj, 10);
          k = 1 + m;
          boolean bool = false;
          if (dh.a(arrayOfByte, k) == 1)
            bool = true; 
          k++;
          if (!bool) {
            m = dh.c(arrayOfByte, k);
            String str1 = dh.b(arrayOfByte, k + 2, m, dh.f(arrayOfByte, k + 2, m));
            if (m == 0) {
              bt = new bt(2, str, bool, null);
            } else {
              bt = new bt(2, str, bool, str1);
            } 
          } else {
            bt = new bt(2, str, bool, "");
          } 
        } else {
          return;
        } 
        fb.a(bt);
      } 
    } 
  }
  
  private void a(String paramString, bj parambj, int paramInt) {
    try {
      dm dm;
      if ((dm = bi.a(paramString)) == null) {
        if (!paramString.equals(em.c(-1))) {
          cl.a(1, paramString, bb.a((short)726));
          return;
        } 
      } else if (em.h(66) && dm.getIntValue(192) == -1 && !paramString.equals(em.c(-1)) && !a.containsKey(paramString)) {
        a.put(paramString, new di(paramString, parambj.a, parambj.b, paramInt, dm));
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static void a(dm paramdm) {
    if (paramdm.s() != 0 || paramdm.getBooleanValue(8) || em.f(238) == 2 || paramdm.q || (em.f(238) == 3 && paramdm.r() == 0))
      return; 
    long l = em.i(300);
    String str = new String();
    switch ((int)l) {
      case 1:
        str = em.d(116);
        break;
      case 2:
        str = em.d(117);
        break;
      case 4:
        str = em.d(118);
        break;
      case 16:
        str = em.d(119);
        break;
    } 
    if ((str = dh.a(str, "%TIME%", cd.n())).length() >= 1) {
      ce ce = new ce(paramdm.getStringValue(0), paramdm, 1, dh.a(false), bb.a((short)105) + "\n" + str);
      do do = new do(ce);
      try {
        cd.a(do);
      } catch (Exception exception) {}
    } 
    paramdm.q = true;
  }
  
  private static void a(dm paramdm, String paramString) {
    if (em.i(300) == 256L || em.i(300) == 512L || em.d(137).length() < 1)
      return; 
    ce ce = new ce(paramdm.getStringValue(0), paramdm, 1, dh.a(false), paramString);
    do do = new do(ce);
    try {
      cd.a(do);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static boolean b(String paramString) {
    for (byte b = 0; b < c.size(); b++) {
      if (c.elementAt(b).equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private static boolean c(String paramString) {
    for (byte b = 0; b < d.size(); b++) {
      if (d.elementAt(b).equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private static boolean a(String paramString1, String paramString2) {
    if (paramString1.length() != paramString2.length())
      return false; 
    if (paramString1 == paramString2)
      return true; 
    int i = paramString1.length();
    for (byte b = 0; b < i; b++) {
      if (et.a(paramString1.charAt(b)) != et.a(paramString2.charAt(b)))
        return false; 
    } 
    return true;
  }
  
  public static boolean a(ej paramej) {
    if (!em.h(36))
      return false; 
    String str1;
    dm dm = bi.a(str1 = paramej.g);
    if (null != dm || b(str1))
      return false; 
    if (!(paramej instanceof ce))
      return true; 
    int i = 0;
    int j = 0;
    if (!c(str1)) {
      d.addElement(str1);
      e.addElement(String.valueOf(0));
    } else {
      i = d.indexOf(str1);
      j = Integer.parseInt(e.elementAt(i));
      e.setElementAt(String.valueOf(++j), i);
    } 
    String str2 = ((ce)paramej).a;
    cl.a(0, str1, bb.a((short)106), str2);
    bi.b(str1, 5);
    if (paramej.f)
      return true; 
    if (a(str2, em.d(137)))
      c.addElement(str1); 
    if (j < 3 || b(str1))
      a(new dm(0, 0, str1, str1, true, false), em.d(b(str1) ? 136 : 135)); 
    return true;
  }
  
  public class di extends TimerTask {
    private String a;
    
    private dm b;
    
    private int c;
    
    private int d;
    
    private int e;
    
    public di(bs this$0, int param1Int1, int param1Int2, int param1Int3, dm param1dm) {
      this.a = (String)this$0;
      this.c = param1Int1;
      this.d = param1Int2;
      this.e = param1Int3;
      this.b = param1dm;
      (new Timer()).schedule(this, (45000 + bs.b.nextInt() % 15000));
    }
    
    public final void run() {
      try {
        if (bs.a.containsKey(this.a)) {
          bs.a.remove(this.a);
          if (this.b.getIntValue(192) == -1) {
            cl.a(1, this.a, bb.a((short)727) + " (type:" + this.e + " fam:" + this.c + " " + this.d + ")");
            return;
          } 
        } else {
          bs.a.remove(this.a);
        } 
        return;
      } catch (Exception exception) {
        return;
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */