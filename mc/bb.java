package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;

public final class bb extends v {
  public cu m = null;
  
  public bb(aw paramaw, Image paramImage) {
    this.a = paramaw;
    this.c = paramImage;
    try {
      a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void b() {
    cy cy1 = this.a.e[this.a.f];
    cy cy2 = this.a.e[this.a.g];
    this.f = new cu(this, aw.h, aw.j);
    if ((this.a.e[this.a.f]).o == 0) {
      cu cu2;
      (cu2 = this.f.a(1, bn.eG).a(aw.h)).a(2, bn.bK);
      cu2.a(3, bn.bY);
      cu2.a(4, bn.bL);
      cu2.a(5, bn.bM);
      cu2.a(21, bn.do);
      if (cx.f("com.motorola.extensions.ScalableJPGImage"))
        cu2.a(6, bn.bN); 
      cu2.a(22, bn.ca);
      String str;
      if (da.a(str = this.a.e[this.a.f].b())) {
        cu cu3;
        (cu3 = cu2.a(28, bn.ch).a(aw.h)).a(29, bn.ci);
        str = cx.c(str);
        str = "\"" + str.substring(0, str.length() - cx.h(str).length() - 1) + "/\"";
        cu3.a(30, str);
      } 
    } 
    this.m = this.f.a(14, bn.aQ).a(aw.h);
    this.m.a(15, bn.aR);
    this.m.a(16, bn.aS);
    this.m.a(17, bn.aT);
    this.m.a(18, bn.aU + (((this.a.e[this.a.f]).o == 2) ? "(Off)" : ""));
    this.m.a(19, bn.aV);
    (this.m.a(x.d[this.a.f])).d = true;
    if (cy1.o == 0 && (cy2.o == 0 || cy2.o == 1)) {
      cu cu2;
      (cu2 = this.f.a(23, bn.eQ).a(aw.h)).a(24, "FTP");
      cu2.a(25, "Bluetooth");
    } else if (cy1.o == 2 || cy1.o == 3) {
      cu cu2;
      (cu2 = this.f.a(23, bn.eQ).a(aw.h)).a(27, bn.eg);
    } 
    if (cy1.o == 0)
      this.f.a(7, bn.cQ); 
    this.f.a(8, bn.eH);
    cu cu1;
    (cu1 = this.f.a(9, bn.eJ).a(aw.h)).a(10, bn.eK);
    cu1.a(11, bn.cr);
    cu1.a(26, bn.dQ);
    this.f.a(12, bn.eI);
    this.f.a(13, bn.eL);
    if (this.a.w != null)
      this.f.a(20, bn.eP); 
    repaint();
  }
  
  public final void a(int paramInt, String paramString) {
    if (paramInt == 12) {
      String str = "Motorola";
      if (MiniCommander.c == 1) {
        str = "JSR-75";
      } else if (MiniCommander.c == 2) {
        str = "Siemens";
      } else if (MiniCommander.c == 3) {
        str = "Motorola(E1000)";
      } 
      System.gc();
      try {
        Thread.sleep(100L);
      } catch (Exception exception) {}
      cx.a("MiniCommander", "Version 4.2\nCopyright (c) Yuri Kudrin, 2006-2010.\nAll rights reserved.\n" + bn.eB + ": " + str + "\n" + bn.eD + ": " + cx.a(Runtime.getRuntime().totalMemory(), false) + "\n" + bn.eC + ": " + cx.a(Runtime.getRuntime().freeMemory(), false) + "\n" + "http://Kys.Su", (Displayable)this.a);
      return;
    } 
    if (paramInt == 8) {
      cx.b(bn.eH, bn.a, (Displayable)this.a);
      return;
    } 
    if (paramInt == 2) {
      if ((this.a.e[this.a.f]).s.length() > 0) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new aa(this.a));
        return;
      } 
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramInt == 3) {
      int i = this.a.e[this.a.f].f().size();
      if ((this.a.e[this.a.f]).s.length() > 0 && i > 0 && (this.a.e[this.a.f]).s.length() > 0) {
        Vector vector = this.a.e[this.a.f].f();
        String str = (this.a.e[this.a.f]).s;
        if (vector.size() == 1) {
          cb cb;
          if ((cb = vector.elementAt(0)).a == 0) {
            str = str + cb.d.substring(cx.e(cb.d).length(), cb.d.lastIndexOf('/')) + bn.eR;
          } else {
            str = cb.d + bn.eR;
          } 
        } else {
          str = str + str.substring(cx.e(str).length(), str.lastIndexOf('/')) + bn.eR;
        } 
        bj bj = new bj(this.a, str, 0);
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bj);
        return;
      } 
      cx.a(bn.eH, bn.bZ, (Displayable)this.a);
      return;
    } 
    if (paramInt == 7) {
      bc bc = new bc(this.a);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bc);
      return;
    } 
    if (paramInt == 10) {
      this.a.D.c();
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a.D);
      return;
    } 
    if (paramInt == 11) {
      ae ae = new ae(this.a);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ae);
      return;
    } 
    if (paramInt == 13) {
      x.a = (this.a.e[0]).s;
      x.b = (this.a.e[1]).s;
      x.y = this.a.e[0].b();
      x.z = this.a.e[1].b();
      x.A = this.a.f;
      this.a.D.a();
      MiniCommander.a();
      return;
    } 
    if (paramInt == 20) {
      this.a.w.A.c = true;
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a.w);
      return;
    } 
    if (paramInt == 21) {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new af(this.a));
      return;
    } 
    if (paramInt >= 15 && paramInt <= 19) {
      x.d[this.a.f] = paramInt - 15;
      aw.a(this.a.e[this.a.f]);
      this.a.e[this.a.f].e();
      this.a.e(this.a.f);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    a((Displayable)this.a);
    if (paramInt == 4) {
      try {
        m m1 = new m();
        m m2 = new m();
        cb cb;
        if ((cb = this.a.e[this.a.f].c()).a == 1 && !cb.d.equals("..")) {
          InputStream inputStream = getClass().getResourceAsStream("/img/e.gif");
          byte[] arrayOfByte1 = new byte[43];
          if (inputStream.read(arrayOfByte1) != 43)
            throw new Exception(bn.bP); 
          inputStream.close();
          String str = cb.d + ".gif";
          if (!m1.a(cb.d))
            throw new Exception(bn.bQ + " (" + cx.c(cb.d) + ")"); 
          if (!m1.k()) {
            m1.d();
            throw new Exception(bn.eE);
          } 
          if (!m2.a(str)) {
            m1.d();
            throw new Exception(bn.bQ);
          } 
          if (m2.p()) {
            m1.d();
            throw new Exception(cx.c(str) + bn.bR);
          } 
          if (!m2.n()) {
            m2.d();
            m1.d();
            throw new Exception(bn.bS + cx.c(str));
          } 
          inputStream = m1.g();
          DataOutputStream dataOutputStream;
          (dataOutputStream = m2.c()).write(arrayOfByte1);
          dataOutputStream.write(new byte[] { 88, 77, 70, 68 });
          byte[] arrayOfByte2 = new byte[4096];
          int i;
          while ((i = inputStream.read(arrayOfByte2)) != -1)
            dataOutputStream.write(arrayOfByte2, 0, i); 
          inputStream.close();
          dataOutputStream.close();
          m1.d();
          m2.d();
          this.a.e[this.a.f].d();
          this.a.e[this.a.f].a(str);
          this.a.e[this.a.f].e();
          if ((this.a.e[this.a.f]).s.equals((this.a.e[this.a.g]).s)) {
            String str1 = this.a.e[this.a.g].b();
            this.a.e[this.a.g].d();
            this.a.e[this.a.g].a(str1);
            this.a.e[this.a.g].e();
          } 
          this.a.e(-1);
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
        } else {
          throw new Exception(bn.bO);
        } 
      } catch (Exception exception) {
        cx.a(bn.eq, exception.getMessage(), (Displayable)this.a);
        return;
      } 
    } else if (paramInt == 5) {
      try {
        m m1 = new m();
        m m2 = new m();
        cb cb;
        if ((cb = this.a.e[this.a.f].c()).a == 1 && !cb.d.equals("..")) {
          if (!cb.d.toLowerCase().endsWith(".gif"))
            throw new Exception(cx.c(cb.d) + bn.bT); 
          String str = cb.d.substring(0, cb.d.length() - 4);
          if (!m1.a(cb.d))
            throw new Exception(bn.bQ + " (" + cx.c(cb.d) + ")"); 
          if (!m1.k()) {
            m1.d();
            throw new Exception(bn.eE);
          } 
          if (!m2.a(str)) {
            m1.d();
            throw new Exception(bn.bQ);
          } 
          if (m2.p()) {
            m1.d();
            throw new Exception(cx.c(str) + bn.bR);
          } 
          if (!m2.n()) {
            m2.d();
            m1.d();
            throw new Exception(bn.bS + cx.c(str));
          } 
          byte[] arrayOfByte = new byte[4096];
          InputStream inputStream = m1.g();
          DataOutputStream dataOutputStream = m2.c();
          int i;
          if ((i = inputStream.read(arrayOfByte, 0, 47)) != 47 || arrayOfByte[43] != 88 || arrayOfByte[44] != 77 || arrayOfByte[45] != 70 || arrayOfByte[46] != 68) {
            m2.d();
            m1.d();
            throw new Exception(cx.c(cb.d) + bn.bU);
          } 
          while ((i = inputStream.read(arrayOfByte)) != -1)
            dataOutputStream.write(arrayOfByte, 0, i); 
          inputStream.close();
          dataOutputStream.close();
          m1.d();
          m2.d();
          this.a.e[this.a.f].d();
          this.a.e[this.a.f].a(str);
          this.a.e[this.a.f].e();
          if ((this.a.e[this.a.f]).s.equals((this.a.e[this.a.g]).s)) {
            String str1 = this.a.e[this.a.g].b();
            this.a.e[this.a.g].d();
            this.a.e[this.a.g].a(str1);
            this.a.e[this.a.g].e();
          } 
          this.a.e(-1);
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
        } else {
          throw new Exception(bn.bO);
        } 
      } catch (Exception exception) {
        cx.a(bn.eq, exception.getMessage(), (Displayable)this.a);
        return;
      } 
    } else {
      if (paramInt == 6) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new n(this.a));
        return;
      } 
      if (paramInt == 22) {
        m m = new m();
        dd dd = new dd();
        DataOutputStream dataOutputStream = null;
        try {
          cb cb;
          if ((cb = this.a.e[this.a.f].c()).a == 1 && !cb.d.equals("..")) {
            if (!cb.d.toLowerCase().endsWith(".jar"))
              throw new Exception(cx.c(cb.d) + bn.cb); 
            String str1 = cb.d.substring(0, cb.d.length() - 4) + ".jad";
            m.a(str1);
            if (m.p())
              throw new Exception(cx.c(str1) + bn.bR); 
            if (!dd.a(cb.d))
              throw new Exception(bn.cc); 
            long l;
            if ((l = dd.a()) <= 0L)
              throw new Exception(bn.cd); 
            int i;
            if ((i = dd.a("META-INF/MANIFEST.MF", true)) == -1)
              throw new Exception("META-INF/MANIFEST.MF" + bn.cg); 
            int j;
            byte[] arrayOfByte = new byte[j = dd.b(i)];
            if (!dd.e(i))
              throw new Exception(bn.ce); 
            if (dd.a(arrayOfByte, 0, arrayOfByte.length) != arrayOfByte.length)
              throw new Exception(bn.cf); 
            String str2 = (str2 = new String(arrayOfByte)).trim();
            str2 = str2 + "\r\nMIDlet-Jar-URL: " + cx.c(cb.d) + "\r\nMIDlet-Jar-Size: " + String.valueOf(l) + "\r\n\r\n";
            m.n();
            (dataOutputStream = m.c()).write(str2.getBytes());
            dataOutputStream.close();
            m.d();
            dd.c();
            this.a.e[this.a.f].d();
            this.a.e[this.a.f].a(cb.d);
            this.a.e[this.a.f].e();
            if ((this.a.e[this.a.f]).s.equals((this.a.e[this.a.g]).s)) {
              String str = this.a.e[this.a.g].b();
              this.a.e[this.a.g].d();
              this.a.e[this.a.g].a(str);
              this.a.e[this.a.g].e();
            } 
            this.a.e(-1);
          } 
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
        } catch (Exception exception) {
          try {
            if (dataOutputStream != null)
              dataOutputStream.close(); 
          } catch (Exception exception1) {
          
          } catch (Error error) {}
          try {
            dd.c();
          } catch (Exception exception1) {
          
          } catch (Error error) {}
          try {
            m.d();
          } catch (Exception exception1) {
          
          } catch (Error error) {}
          cx.a(bn.eq, exception.getMessage(), (Displayable)this.a);
          return;
        } 
      } else {
        if (paramInt == 24) {
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new dm(this.a));
          return;
        } 
        if (paramInt == 25) {
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent(h.a(this.a));
          return;
        } 
        if (paramInt == 27) {
          cy cy;
          if ((cy = this.a.e[this.a.f]).o == 2) {
            try {
              cy.v.c();
            } catch (Exception exception) {}
            try {
              cy.v.a();
            } catch (Exception exception) {}
            cy.v = null;
          } else if (cy.o == 3) {
            cy.x.a();
            cy.x = null;
          } 
          cy.o = 0;
          cy.w = "";
          cy.y = "";
          cy.d();
          this.a.e(-1);
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
          return;
        } 
        if (paramInt == 26) {
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new da(this.a));
          return;
        } 
        if (paramInt == 29) {
          l l;
          (l = new l(this)).start();
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
          return;
        } 
        if (paramInt == 30) {
          s s;
          (s = new s(this)).start();
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
        } 
      } 
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bb.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */