package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cy {
  public int a = 0;
  
  public int b = 0;
  
  public int c = 0;
  
  public int d = 0;
  
  public int e = 0;
  
  public int f = 0;
  
  public int g = 0;
  
  public int h = 0;
  
  public int i = 0;
  
  public int j = 0;
  
  public int k = 0;
  
  public am l = null;
  
  public boolean m = false;
  
  public boolean n = false;
  
  public byte o = 0;
  
  public boolean p = true;
  
  public String q = null;
  
  public int r;
  
  public String s = "";
  
  public String t = "";
  
  public dd u = null;
  
  public cz v = null;
  
  public String w = "";
  
  public ag x = null;
  
  public String y = "";
  
  public String z = "";
  
  public aw A = null;
  
  public Timer B = new Timer();
  
  public mc/at C;
  
  public Image D;
  
  private Graphics H = null;
  
  public Vector E = new Vector();
  
  public long F = 0L;
  
  public int G = -1;
  
  public cy(aw paramaw, int paramInt) {
    this.A = paramaw;
    this.r = paramInt;
    this.C = new mc/at(this, this);
    this.B.scheduleAtFixedRate(this.C, 1L, x.T);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = 5;
    this.g = this.c - this.e * 2;
    if (x.G) {
      this.f = this.l.a + 1;
    } else {
      this.f = 5;
    } 
    this.h = this.d - this.f;
    if (x.H) {
      this.h -= this.l.a + 1;
    } else {
      this.h -= 5;
    } 
    this.D = null;
    this.D = Image.createImage(paramInt1, paramInt2);
    this.H = null;
    this.H = this.D.getGraphics();
    this.i = this.h / this.l.a;
    System.gc();
  }
  
  private void o() {
    for (byte b = 0; b < this.E.size(); b++)
      this.E.setElementAt(null, b); 
    this.E.removeAllElements();
    this.k = 0;
    this.j = 0;
    System.gc();
  }
  
  private boolean p() {
    this.u = new dd();
    try {
      if (this.m) {
        this.n = true;
        e();
        this.A.e(-1);
        this.A.repaint();
        this.A.serviceRepaints();
        this.n = false;
      } 
      if (this.u.a(b())) {
        this.o = 1;
        this.t = "";
        q();
        e();
        return true;
      } 
    } catch (Exception exception) {}
    this.u = null;
    return false;
  }
  
  private String b(String paramString) {
    int i;
    return ((i = paramString.indexOf('/', this.t.length())) < 0) ? null : paramString.substring(0, i + 1);
  }
  
  public final boolean a(o paramo) {
    try {
      aw.r.a(bn.eh, paramo.b, 0);
      this.A.repaint();
      this.v = new cz(paramo.b, paramo.c, paramo.d, paramo.e);
      this.w = paramo.f;
      this.o = 2;
      q();
      e();
      return true;
    } catch (Exception exception) {
      cx.a(bn.eq, exception.getMessage(), (Displayable)this.A);
      this.o = 0;
      this.v = null;
      this.A.e(-1);
      return false;
    } 
  }
  
  public final boolean a(ag paramag) {
    try {
      aw.r.a(bn.eh, paramag.c, 0);
      this.A.repaint();
      if (paramag.b() == 0) {
        this.x = paramag;
        this.y = "";
        this.z = "";
        this.o = 3;
        q();
        e();
        return true;
      } 
    } catch (Exception exception) {
      cx.a(bn.eq, exception.getMessage(), (Displayable)this.A);
    } 
    this.o = 0;
    this.A.e(-1);
    return false;
  }
  
  private synchronized void q() {
    Vector vector = new Vector();
    if (this.o == 3) {
      o();
      cb cb = null;
      (cb = new cb()).a = 1;
      cb.d = "..";
      this.E.addElement(cb);
      try {
        if (this.y.length() > 0) {
          if (!this.y.startsWith("/"))
            this.y = "/" + this.y; 
          if (!this.y.endsWith("/"))
            this.y += "/"; 
        } 
        if (this.y.length() < this.z.length()) {
          if (this.x.a("", true, false) != 160);
        } else if (this.y.length() > this.z.length()) {
          this.x.a(cx.j(this.y), false, false);
        } 
        this.z = this.y;
        int i;
        if ((i = this.x.a(this.E, vector, this.y)) != 160 && i != 144) {
          this.x.a();
          this.x = null;
          this.o = 0;
          d();
          this.A.e(-1);
          this.A.z = 5;
          aw.s.a(bn.ar, this.l.a(this.y, aw.s.c), 0);
          this.A.repaint();
          this.y = "";
          return;
        } 
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString() + " : " + exception.getMessage(), (Displayable)this.A);
      } 
    } else if (this.o == 2) {
      o();
      cb cb = null;
      (cb = new cb()).a = 1;
      cb.d = "..";
      this.E.addElement(cb);
      try {
        if (this.w.length() > 0) {
          if (!this.w.startsWith("/"))
            this.w = "/" + this.w; 
          if (!this.w.endsWith("/"))
            this.w += "/"; 
        } 
        try {
          this.v.a((this.w.length() != 0) ? this.w : "/");
        } catch (cp cp) {
          this.w = "";
        } 
        try {
          this.w = this.v.b();
          if (!this.w.endsWith("/"))
            this.w += "/"; 
          if (this.w.equals("/"))
            this.w = ""; 
        } catch (cp cp) {
          this.w = "";
        } 
        this.v.a(this.E, vector, this.w);
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString() + " : " + exception.getMessage() + "\"" + this.w + "\"", (Displayable)this.A);
      } 
    } else if (this.o == 1) {
      o();
      cb cb = null;
      (cb = new cb()).a = 1;
      cb.d = "..";
      this.E.addElement(cb);
      for (byte b1 = 0; b1 < this.u.d(); b1++) {
        dd.mc/cs mc/cs;
        String str1;
        String str2 = cx.d(str1 = (mc/cs = this.u.d(b1)).a);
        String str3;
        String str4 = cx.e(str3 = b(str1));
        if (str3 != null && str4 != null && this.t.equals(str4)) {
          boolean bool = true;
          for (byte b2 = 0; b2 < this.E.size(); b2++) {
            if (((cb)this.E.elementAt(b2)).d.equals(str3)) {
              bool = false;
              break;
            } 
          } 
          if (bool) {
            (cb = new cb()).a = 0;
            cb.d = str3;
            this.E.addElement(cb);
          } 
        } 
        if (str2.equals(this.t)) {
          (cb = new cb()).a = 1;
          cb.d = str1;
          cb.e = dd.a(mc/cs.i, mc/cs.h);
          cb.f = mc/cs.c;
          vector.addElement(cb);
        } 
      } 
    } else if (this.o == 0) {
      m m = null;
      try {
        o();
        cb cb = null;
        String[] arrayOfString = null;
        if (this.s.length() == 0) {
          arrayOfString = m.e();
        } else {
          (m = new m()).a(this.s, 1);
          if (!m.p()) {
            m.d();
            this.s = "";
            q();
            return;
          } 
          arrayOfString = m.a(this.s, !(x.o == 0));
          m.d();
          m = null;
        } 
        if (this.s.length() != 0) {
          (cb = new cb()).a = 1;
          cb.d = "..";
          this.E.addElement(cb);
        } 
        for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
          String str = arrayOfString[b1];
          cb = new cb();
          if (str.endsWith("/")) {
            cb.a = 0;
          } else {
            cb.a = 1;
          } 
          cb.d = arrayOfString[b1];
          if (x.d[this.r] == 3 || x.d[this.r] == 4 || x.H) {
            try {
              (m = new m()).a(arrayOfString[b1], 1);
              cb.e = m.r();
              if (cb.a == 1)
                cb.f = m.a(); 
              m.d();
            } catch (Exception exception) {
              try {
                if (m != null)
                  m.d(); 
              } catch (Exception exception1) {}
            } 
            m = null;
          } 
          if (cb.a == 0) {
            this.E.addElement(cb);
          } else {
            vector.addElement(cb);
          } 
        } 
        if (x.o != 0)
          m.a(this.E, this.s); 
        this.p = false;
      } catch (Exception exception) {
        try {
          if (m != null)
            m.d(); 
        } catch (Exception exception1) {}
        if (this.p) {
          this.q = exception.toString();
          return;
        } 
        this.s = cx.e(this.s);
        if (this.s.compareTo("/") == 0)
          this.s = ""; 
        d();
        cx.a(bn.eq, exception.getMessage(), (Displayable)this.A);
        return;
      } 
    } 
    if (x.d[this.r] == 1) {
      a(this.E, 1, this.E.size() - 1);
      a(vector, 0, vector.size() - 1);
    } else if (x.d[this.r] == 2) {
      b(this.E, 1, this.E.size() - 1);
      b(vector, 0, vector.size() - 1);
    } else if (x.d[this.r] == 3) {
      c(this.E, 1, this.E.size() - 1);
      c(vector, 0, vector.size() - 1);
    } else if (x.d[this.r] == 4) {
      a(this.E, 1, this.E.size() - 1);
      d(vector, 0, vector.size() - 1);
    } 
    for (byte b = 0; b < vector.size(); b++)
      this.E.addElement(vector.elementAt(b)); 
  }
  
  private void a(Vector paramVector, int paramInt1, int paramInt2) {
    if (paramInt2 < paramInt1)
      return; 
    cb cb = null;
    int i = paramInt1;
    int j = paramInt2;
    String str = cx.a(paramVector, (i + j) / 2).toLowerCase();
    while (true) {
      while (cx.a(paramVector, i).toLowerCase().compareTo(str) < 0)
        i++; 
      while (cx.a(paramVector, j).toLowerCase().compareTo(str) > 0)
        j--; 
      if (i <= j) {
        cb = paramVector.elementAt(i);
        paramVector.setElementAt(paramVector.elementAt(j), i);
        paramVector.setElementAt(cb, j);
        i++;
        j--;
      } 
      if (i > j) {
        if (j > paramInt1)
          a(paramVector, paramInt1, j); 
        if (i < paramInt2)
          a(paramVector, i, paramInt2); 
        return;
      } 
    } 
  }
  
  private static String c(String paramString) {
    String str;
    if ((str = cx.c(paramString)).length() > 0) {
      int i;
      if ((i = str.lastIndexOf('.')) == -1) {
        str = " ." + str;
      } else {
        String str1 = str.substring(i + 1, str.length());
        String str2 = str.substring(0, i);
        str = str1 + "." + str2;
      } 
    } 
    return str;
  }
  
  private void b(Vector paramVector, int paramInt1, int paramInt2) {
    if (paramInt2 < paramInt1)
      return; 
    cb cb = null;
    int i = paramInt1;
    int j = paramInt2;
    String str = c(cx.a(paramVector, (i + j) / 2)).toLowerCase();
    while (true) {
      while (c(cx.a(paramVector, i)).toLowerCase().compareTo(str) < 0)
        i++; 
      while (c(cx.a(paramVector, j)).toLowerCase().compareTo(str) > 0)
        j--; 
      if (i <= j) {
        cb = paramVector.elementAt(i);
        paramVector.setElementAt(paramVector.elementAt(j), i);
        paramVector.setElementAt(cb, j);
        i++;
        j--;
      } 
      if (i > j) {
        if (j > paramInt1)
          b(paramVector, paramInt1, j); 
        if (i < paramInt2)
          b(paramVector, i, paramInt2); 
        return;
      } 
    } 
  }
  
  private void c(Vector paramVector, int paramInt1, int paramInt2) {
    if (paramInt2 < paramInt1)
      return; 
    cb cb = null;
    int i = paramInt1;
    int j = paramInt2;
    long l = ((cb)paramVector.elementAt((i + j) / 2)).e;
    while (true) {
      while (((cb)paramVector.elementAt(i)).e > l)
        i++; 
      while (((cb)paramVector.elementAt(j)).e < l)
        j--; 
      if (i <= j) {
        cb = paramVector.elementAt(i);
        paramVector.setElementAt(paramVector.elementAt(j), i);
        paramVector.setElementAt(cb, j);
        i++;
        j--;
      } 
      if (i > j) {
        if (j > paramInt1)
          c(paramVector, paramInt1, j); 
        if (i < paramInt2)
          c(paramVector, i, paramInt2); 
        return;
      } 
    } 
  }
  
  private void d(Vector paramVector, int paramInt1, int paramInt2) {
    if (paramInt2 < paramInt1)
      return; 
    cb cb = null;
    int i = paramInt1;
    int j = paramInt2;
    long l = ((cb)paramVector.elementAt((i + j) / 2)).f;
    while (true) {
      while (((cb)paramVector.elementAt(i)).f > l)
        i++; 
      while (((cb)paramVector.elementAt(j)).f < l)
        j--; 
      if (i <= j) {
        cb = paramVector.elementAt(i);
        paramVector.setElementAt(paramVector.elementAt(j), i);
        paramVector.setElementAt(cb, j);
        i++;
        j--;
      } 
      if (i > j) {
        if (j > paramInt1)
          d(paramVector, paramInt1, j); 
        if (i < paramInt2)
          d(paramVector, i, paramInt2); 
        return;
      } 
    } 
  }
  
  public final void a() {
    int i = 0;
    String str2 = null;
    if (this.E.size() == 0)
      return; 
    cb cb = this.E.elementAt(this.k);
    String str3 = "";
    String str1;
    if ((str1 = cb.d.toLowerCase()).compareTo("..") != 0) {
      if (cb.a != 0) {
        if (this.o == 0) {
          if (str1.endsWith(".jpg") || str1.endsWith(".jpeg") || str1.endsWith(".gif") || str1.endsWith(".png") || str1.endsWith(".bmp") || str1.endsWith(".wbmp")) {
            Vector vector = new Vector(0);
            int j = 0;
            for (i = 0; i < this.E.size(); i++) {
              String str;
              cb cb1;
              if ((str = (cb1 = this.E.elementAt(i)).d.toLowerCase()).endsWith(".jpg") || str.endsWith(".jpeg") || str.endsWith(".gif") || str.endsWith(".png") || str.endsWith(".bmp") || str.endsWith(".wbmp")) {
                vector.addElement(cb1);
                if (cb.d.compareTo(cb1.d) == 0)
                  j = vector.size() - 1; 
              } 
            } 
            ab ab = new ab(this.A, vector, j);
            Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ab);
            return;
          } 
          if (str1.endsWith(".mp3") || str1.endsWith(".aac") || str1.endsWith(".wma") || str1.endsWith(".mid") || str1.endsWith(".midi") || str1.endsWith(".amr") || str1.endsWith(".imy") || str1.endsWith(".bas") || str1.endsWith(".m4a") || str1.endsWith(".wav") || str1.endsWith(".wave")) {
            Vector vector = new Vector(0);
            int j = 0;
            for (i = 0; i < this.E.size(); i++) {
              String str;
              cb cb1;
              if ((str = (cb1 = this.E.elementAt(i)).d.toLowerCase()).endsWith(".mp3") || str.endsWith(".aac") || str.endsWith(".wma") || str.endsWith(".mid") || str.endsWith(".midi") || str.endsWith(".amr") || str.endsWith(".imy") || str.endsWith(".bas") || str.endsWith(".m4a") || str.endsWith(".wav") || str.endsWith(".wave")) {
                vector.addElement(cb1);
                if (cb.d.compareTo(cb1.d) == 0)
                  j = vector.size() - 1; 
              } 
            } 
            if (this.A.w != null) {
              this.A.w.a();
              this.A.w = null;
            } 
            this.A.w = new cq(this.A, vector, j);
            Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.A.w);
            return;
          } 
          if (da.c(str1)) {
            Vector vector = new Vector(0);
            int j = 0;
            for (i = 0; i < this.E.size(); i++) {
              String str;
              cb cb1;
              if (da.c(str = (cb1 = this.E.elementAt(i)).d)) {
                vector.addElement(cb1);
                if (cb.d.compareTo(cb1.d) == 0)
                  j = vector.size() - 1; 
              } 
            } 
            ch ch = new ch(this.A, vector, j);
            Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ch);
            return;
          } 
          if (da.b(str1)) {
            this.A.a(false);
            return;
          } 
          if (da.a(str1)) {
            if ((this.A.e[this.A.g]).o == 1 && (this.A.e[this.A.g]).u.a.equals(b())) {
              this.A.z = 5;
              aw.s.a(bn.G, 0);
              this.A.repaint();
              return;
            } 
            if (!p()) {
              this.A.z = 5;
              aw.s.a(bn.bQ, 0);
              this.A.repaint();
            } 
            return;
          } 
          if (str1.endsWith(".bat")) {
            bk bk = new bk(this.A, cb.d);
            Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)bk);
            return;
          } 
          return;
        } 
        if (this.o == 1) {
          if (str1.endsWith(".jpg") || str1.endsWith(".jpeg") || str1.endsWith(".gif") || str1.endsWith(".png") || str1.endsWith(".bmp") || str1.endsWith(".wbmp")) {
            Vector vector = new Vector(0);
            int j = 0;
            for (i = 0; i < this.E.size(); i++) {
              String str;
              cb cb1;
              if ((str = (cb1 = this.E.elementAt(i)).d.toLowerCase()).endsWith(".jpg") || str.endsWith(".jpeg") || str.endsWith(".gif") || str.endsWith(".png") || str.endsWith(".bmp") || str.endsWith(".wbmp")) {
                vector.addElement(cb1);
                if (cb.d.compareTo(cb1.d) == 0)
                  j = vector.size() - 1; 
              } 
            } 
            ab ab = new ab(this.A, vector, j);
            Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ab);
            return;
          } 
          if (da.c(str1)) {
            Vector vector = new Vector(0);
            int j = 0;
            for (i = 0; i < this.E.size(); i++) {
              String str;
              cb cb1;
              if (da.c(str = (cb1 = this.E.elementAt(i)).d)) {
                vector.addElement(cb1);
                if (cb.d.compareTo(cb1.d) == 0)
                  j = vector.size() - 1; 
              } 
            } 
            ch ch = new ch(this.A, vector, j);
            Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)ch);
            return;
          } 
          if (da.b(str1)) {
            this.A.a(false);
            return;
          } 
          return;
        } 
        return;
      } 
      if (this.o == 0) {
        str3 = this.s;
        this.s = cb.d;
      } else if (this.o == 1) {
        str3 = this.t;
        this.t = cb.d;
      } else if (this.o == 2) {
        str3 = this.w;
        this.w = cb.d;
      } else if (this.o == 3) {
        str3 = this.y;
        this.z = this.y;
        this.y = cb.d + "/";
      } 
    } else if (this.o == 0) {
      str3 = this.s;
      for (i = this.s.length() - 2; i >= 0; i--) {
        if (this.s.charAt(i) == '/') {
          this.s = this.s.substring(0, i + 1);
          break;
        } 
      } 
      if (this.s.compareTo("/") == 0)
        this.s = ""; 
    } else if (this.o == 1) {
      str3 = this.t;
      String str;
      if ((str = cx.e(this.t)) == null) {
        str2 = this.u.a;
        this.u.c();
        this.u = null;
        this.o = 0;
        this.t = "";
      } else {
        this.t = str;
      } 
    } else if (this.o == 2) {
      str3 = this.w;
      this.z = this.w;
      String str;
      if ((str = cx.e(this.w)) == null) {
        try {
          this.v.c();
        } catch (Exception exception) {}
        try {
          this.v.a();
        } catch (Exception exception) {}
        this.v = null;
        this.o = 0;
        this.w = "";
      } else {
        this.w = str;
      } 
      if (this.w.equals("/"))
        this.w = ""; 
    } else if (this.o == 3) {
      str3 = this.y;
      String str;
      if ((str = cx.e(this.y)) == null) {
        this.x.a();
        this.x = null;
        this.o = 0;
        this.y = "";
        this.z = "";
      } else {
        this.z = this.y;
        this.y = str;
      } 
      if (this.y.equals("/"))
        this.y = ""; 
    } 
    if (this.m) {
      String str = null;
      if (this.o == 0) {
        str = this.s;
        this.s = str3;
      } 
      if (this.o == 1) {
        str = this.t;
        this.t = str3;
      } 
      if (this.o == 2) {
        str = this.w;
        this.w = str3;
      } 
      if (this.o == 3) {
        str = this.y;
        this.y = str3;
      } 
      this.n = true;
      e();
      this.A.e(-1);
      this.A.repaint();
      this.A.serviceRepaints();
      this.n = false;
      if (this.o == 0)
        this.s = str; 
      if (this.o == 1)
        this.t = str; 
      if (this.o == 2)
        this.w = str; 
      if (this.o == 3)
        this.y = str; 
    } 
    q();
    if (this.o == 0) {
      if (str2 == null) {
        if (str3.length() != 0)
          a(str3); 
      } else {
        a(str2);
      } 
    } else if (this.o == 1) {
      if (str3.length() != 0)
        a(str3); 
    } else if (this.o == 2) {
      if (str3.length() != 0) {
        if (this.w.length() == 0)
          str3 = str3.substring(1, str3.length()); 
        a(str3);
      } 
    } else if (this.o == 3 && str3.length() != 0) {
      if (this.y.length() == 0) {
        str3 = str3.substring(1, str3.length() - 1);
      } else {
        str3 = str3.substring(0, str3.length() - 1);
      } 
      a(str3);
    } 
    e();
  }
  
  public final int a(String paramString) {
    return a(paramString, 0);
  }
  
  private int a(String paramString, int paramInt) {
    int i = this.E.size();
    if (paramInt >= i)
      return -1; 
    for (byte b = 0; b < i; b++) {
      if (cx.a(this.E, b).equals(paramString)) {
        this.k = b;
        if (this.k < this.j || this.k > this.j + this.i - 1) {
          this.j = this.k - this.i + 1;
          if (this.j < 0)
            this.j = 0; 
        } 
        if (i - this.j < this.i) {
          this.j = this.k - this.i + 1;
          if (this.j < 0)
            this.j = 0; 
        } 
        return this.k;
      } 
    } 
    return -1;
  }
  
  public final String b() {
    cb cb;
    return ((cb = c()) == null) ? "" : cb.d;
  }
  
  public final cb c() {
    return (this.E.size() != 0) ? this.E.elementAt(this.k) : null;
  }
  
  public final synchronized void d() {
    q();
    e();
  }
  
  private void r() {
    if (!this.m || this.E.size() == 0)
      return; 
    int i = this.k - this.j;
    this.H.setColor(x.ag);
    if (this.n) {
      for (int j = this.f + i * this.l.a; j < this.f + i * this.l.a + this.l.a; j++) {
        for (int k = this.e + (j & 0x1); k < this.e + this.g; k += 2)
          this.H.fillRect(k, j, 1, 1); 
      } 
      return;
    } 
    this.H.fillRect(this.e + 0, this.f + i * this.l.a, this.g - 0, this.l.a);
  }
  
  public final void e() {
    this.H.setColor(x.V);
    this.H.fillRect(0, 0, this.c, this.d);
    s();
    r();
    cb cb = null;
    int j = 0;
    String str = "";
    int m = this.g - (x.M ? 1 : 0);
    int k;
    for (int i = this.j; i < this.E.size() && (k = i - this.j) < this.i; i++) {
      int n;
      if ((cb = this.E.elementAt(i)).d.compareTo("..") == 0) {
        str = cb.d;
        if (this.o == 1) {
          str = "..<" + cx.c(this.u.a) + ">";
        } else if (this.o == 2) {
          str = "..<" + this.v.a + ">";
        } else if (this.o == 3) {
          str = "..<" + this.x.c + ">";
        } 
      } else if (this.o == 0) {
        if (cb.a == 0 && this.s.length() != 0) {
          str = cb.d.substring(this.s.length(), cb.d.length() - 1);
        } else {
          str = cb.d.substring(this.s.length(), cb.d.length());
        } 
      } else if (this.o == 1) {
        if (cb.a == 0) {
          str = cb.d.substring(this.t.length(), cb.d.length() - 1);
        } else {
          str = cb.d.substring(this.t.length(), cb.d.length());
        } 
      } else if (this.o == 2) {
        if (cb.a == 0) {
          str = cb.d.substring(this.w.length(), cb.d.length() - 1);
        } else {
          str = cb.d.substring(this.w.length(), cb.d.length());
        } 
      } else if (this.o == 3) {
        if (cb.a == 0);
        str = cb.d.substring(this.y.length(), cb.d.length());
      } 
      if (cb.b) {
        n = x.af;
      } else if (cb.a == 0) {
        n = x.W;
      } else {
        n = d(str);
      } 
      if (this.n && str.endsWith("/"))
        str = str.substring(0, str.length() - 1); 
      this.l.a(this.H, str, this.e + 0, this.f + j, m, n);
      if (x.M && cb.a == 0)
        this.l.a(this.H, str, this.e + 0 + 1, this.f + j, m, n); 
      j += this.l.a;
    } 
    a(false);
  }
  
  public final void a(int paramInt) {
    b(paramInt, 0);
  }
  
  private void a(boolean paramBoolean) {
    int i = this.h;
    int j = this.c - 4;
    int k = this.f;
    if (paramBoolean) {
      this.H.setColor(x.V);
      this.H.fillRect(j, this.f, 4, i);
      this.H.setColor(x.U);
      this.H.drawRect(j + 1, this.f, 0, i);
      this.H.drawRect(j + 3, this.f, 0, i);
    } 
    this.H.setColor(x.U);
    if (this.E.size() > 1)
      k += (i - 8) * this.k / (this.E.size() - 1); 
    this.H.fillRect(j, k, 4, 8);
    t();
  }
  
  private void s() {
    this.H.setColor(x.U);
    int i = 2;
    int j = this.c - 2;
    int k = this.d - 2;
    if (x.G) {
      i = this.l.a / 2;
      k = k - this.l.a / 2 + 2;
    } 
    if (x.H)
      k -= this.l.a / 2 - 3; 
    this.H.drawRect(1, i - 1, j, k - 1);
    this.H.drawRect(3, i + 1, j - 4, k - 5);
    if (x.G) {
      String str = "/";
      if (this.o == 0) {
        if (this.s.length() > 0)
          str = this.l.a(this.s, this.g); 
      } else if (this.o == 1) {
        if (this.t.length() > 0)
          str = this.l.a(this.t, this.g); 
      } else if (this.o == 2) {
        if (this.w.length() > 0)
          str = this.l.a(this.w, this.g); 
      } else if (this.o == 3 && this.y.length() > 0) {
        str = this.l.a(this.y, this.g);
      } 
      j = this.l.e(str);
      this.H.setColor(x.ag);
      this.H.fillRect((this.c - j) / 2, 0, j, this.l.a);
      this.l.a(this.H, str, (this.c - j) / 2, 0, j, x.am);
    } 
  }
  
  private void t() {
    if (!x.H)
      return; 
    cb cb = c();
    Vector vector = f();
    String str = null;
    if (vector.size() <= 1) {
      if (vector.size() == 1 && ((cb)vector.elementAt(0)).b == true)
        cb = vector.elementAt(0); 
      if ((cb.a == 1 && !cb.d.equals("..")) || (vector.size() == 1 && cb.b == true)) {
        str = cx.b(cb.f, true);
      } else if (cb.a == 0) {
        str = "<" + bn.ag + ">";
      } else {
        str = "<" + bn.ap + ">";
      } 
    } else {
      long l = 0L;
      for (byte b = 0; b < vector.size(); b++)
        l += ((cb)vector.elementAt(b)).f; 
      str = cx.b(l, true);
    } 
    int i = this.l.e(str);
    this.H.setColor(x.V);
    this.H.fillRect(this.e, this.d - this.l.a, this.g, this.l.a);
    this.H.setColor(x.U);
    this.H.drawRect(this.e, this.d - this.l.a / 2 - 1, this.g, 0);
    this.H.drawRect(this.e, this.d - this.l.a / 2 + 1, this.g, 0);
    this.H.setColor(x.V);
    this.H.fillRect((this.c - i) / 2, this.d - this.l.a, i, this.l.a);
    int j = x.ae;
    if (vector.size() > 1 || (vector.size() == 1 && ((cb)vector.elementAt(0)).b == true))
      j = x.af; 
    this.l.a(this.H, str, (this.c - i) / 2, this.d - this.l.a, i, j);
  }
  
  public final Vector f() {
    Vector vector = new Vector();
    cb cb = null;
    for (byte b = 0; b < this.E.size(); b++) {
      if ((cb = this.E.elementAt(b)).b && cb.d.compareTo("..") != 0)
        vector.addElement(cb); 
    } 
    if (vector.size() == 0 && this.E.size() != 0 && cx.a(cb = this.E.elementAt(this.k)))
      vector.addElement(cb); 
    return vector;
  }
  
  public final void g() {
    if (this.E.size() == 0)
      return; 
    cb cb;
    if (cx.a(cb = this.E.elementAt(this.k)))
      cb.b = !cb.b; 
    i();
  }
  
  public final void h() {
    int i = this.j;
    int j = this.k;
    if (this.k != 0) {
      this.k--;
      if (this.j > this.k)
        this.j = this.k; 
    } else if (x.q == 1 && this.E.size() > 0) {
      this.k = this.E.size() - 1;
      this.j = this.k - this.i + 1;
      if (this.j < 0)
        this.j = 0; 
      e();
      return;
    } 
    if (j == this.k)
      return; 
    if (this.j == i) {
      a(j);
      a(this.k);
    } else {
      Image image = Image.createImage(this.D, this.e, this.f + this.l.a, this.g, this.l.a * (this.i - 2), 0);
      this.H.drawImage(image, this.e, this.f + this.l.a * 2, 20);
      a(j);
      a(this.k);
    } 
    a(true);
  }
  
  public final void i() {
    int i = this.j;
    int j = this.k;
    if (this.E.size() == 0 || this.E.size() == 1 || this.k == this.E.size() - 1) {
      if (x.q == 1) {
        this.k = 0;
        this.j = 0;
        e();
        return;
      } 
    } else {
      this.k++;
      if ((this.k - this.j) * this.l.a + this.l.a > this.h)
        this.j++; 
    } 
    if (this.j == i) {
      a(j);
      a(this.k);
    } else {
      Image image = Image.createImage(this.D, this.e, this.f + this.l.a, this.g, this.l.a * (this.i - 2), 0);
      this.H.drawImage(image, this.e, this.f, 20);
      a(j);
      a(this.k);
    } 
    a(true);
  }
  
  public final void j() {
    if (this.k == this.j) {
      this.j -= this.i;
      if (this.j < 0)
        this.j = 0; 
    } 
    this.k = this.j;
    e();
  }
  
  public final void k() {
    if (this.k == this.j + this.i - 1) {
      this.j += this.i;
      if (this.j + this.i > this.E.size() - 1)
        this.j = this.E.size() - this.i; 
    } 
    this.k = this.j + this.i - 1;
    if (this.k > this.E.size() - 1)
      this.k = this.E.size() - 1; 
    e();
  }
  
  private void u() {
    cb cb = null;
    for (byte b = 0; b < this.E.size(); b++) {
      if (cx.a(cb = this.E.elementAt(b)))
        cb.b = true; 
    } 
    e();
  }
  
  public final void l() {
    cb cb = null;
    Vector vector = new Vector();
    byte b;
    for (b = 0; b < this.E.size(); b++) {
      if ((cb = this.E.elementAt(b)).a != 0 && cb.d.compareTo("..") != 0 && cb.b) {
        boolean bool = true;
        String str = cx.h(cb.d).toLowerCase();
        for (byte b1 = 0; b1 < vector.size(); b1++) {
          if (str.equals(vector.elementAt(b1))) {
            bool = false;
            break;
          } 
        } 
        if (bool)
          vector.addElement(str); 
      } 
    } 
    if (vector.size() == 0) {
      u();
    } else {
      for (b = 0; b < this.E.size(); b++) {
        if (cx.a(cb = this.E.elementAt(b))) {
          boolean bool = false;
          String str = cx.h(cb.d).toLowerCase();
          for (byte b1 = 0; b1 < vector.size(); b1++) {
            if (str.equals(vector.elementAt(b1))) {
              bool = true;
              break;
            } 
          } 
          if (bool)
            cb.b = true; 
        } 
      } 
    } 
    e();
  }
  
  public final void m() {
    for (byte b = 0; b < this.E.size(); b++)
      ((cb)this.E.elementAt(b)).b = false; 
    e();
  }
  
  public final String n() {
    String str = null;
    if (this.s.length() == 0) {
      str = ((cb)this.E.elementAt(this.k)).d;
    } else {
      str = cx.i(this.s);
    } 
    return str;
  }
  
  public final boolean b(int paramInt1, int paramInt2) {
    if (paramInt1 < this.j || paramInt1 >= this.j + this.i)
      return false; 
    int i = this.l.a * (paramInt1 - this.j);
    int j = this.g - (x.M ? 1 : 0);
    boolean bool = false;
    int[] arrayOfInt = { 0 };
    if (paramInt1 == this.k) {
      r();
    } else {
      this.H.setColor(x.V);
      this.H.fillRect(this.e, this.f + i, this.g, this.l.a);
    } 
    cb cb = null;
    String str = "";
    if ((cb = this.E.elementAt(paramInt1)).d.compareTo("..") == 0) {
      str = cb.d;
      if (this.o == 1) {
        str = "..<" + cx.c(this.u.a) + ">";
      } else if (this.o == 2) {
        str = "..<" + this.v.a + ">";
      } else if (this.o == 3) {
        str = "..<" + this.x.c + ">";
      } 
    } else if (this.o == 0) {
      if (cb.a == 0 && this.s.length() != 0) {
        str = cb.d.substring(this.s.length(), cb.d.length() - 1);
      } else {
        str = cb.d.substring(this.s.length(), cb.d.length());
      } 
    } else if (this.o == 1) {
      if (cb.a == 0) {
        str = cb.d.substring(this.t.length(), cb.d.length() - 1);
      } else {
        str = cb.d.substring(this.t.length(), cb.d.length());
      } 
    } else if (this.o == 2) {
      if (cb.a == 0) {
        str = cb.d.substring(this.w.length(), cb.d.length() - 1);
      } else {
        str = cb.d.substring(this.w.length(), cb.d.length());
      } 
    } else if (this.o == 3) {
      if (cb.a == 0);
      str = cb.d.substring(this.y.length(), cb.d.length());
    } 
    if (paramInt2 >= str.length()) {
      str = "";
    } else {
      str = str.substring(paramInt2);
    } 
    if (cb.b) {
      this.l.b(this.H, str, this.e, this.f + i, this.g, x.af, arrayOfInt);
      if (x.M && cb.a == 0)
        this.l.a(this.H, str, this.e + 1, this.f + i, j, x.af); 
    } else if (cb.a == 0) {
      this.l.b(this.H, str, this.e, this.f + i, this.g, x.W, arrayOfInt);
      if (x.M)
        this.l.a(this.H, str, this.e + 1, this.f + i, j, x.W); 
    } else {
      this.l.b(this.H, str, this.e, this.f + i, this.g, d(str), arrayOfInt);
    } 
    if (str.length() == arrayOfInt[0])
      bool = true; 
    return bool;
  }
  
  private static int d(String paramString) {
    return (paramString = paramString.toLowerCase()).endsWith(".bat") ? x.ad : ((paramString.endsWith(".jpg") || paramString.endsWith(".jpeg") || paramString.endsWith(".gif") || paramString.endsWith(".png") || paramString.endsWith(".bmp") || paramString.endsWith(".wbmp")) ? x.aa : ((paramString.endsWith(".mp3") || paramString.endsWith(".aac") || paramString.endsWith(".wma") || paramString.endsWith(".mid") || paramString.endsWith(".midi") || paramString.endsWith(".amr") || paramString.endsWith(".imy") || paramString.endsWith(".bas") || paramString.endsWith(".m4a") || paramString.endsWith(".wav") || paramString.endsWith(".wave")) ? x.ac : (da.c(paramString) ? x.ab : (da.a(paramString) ? x.Z : x.ae))));
  }
  
  public final boolean a(int paramInt1, int paramInt2, boolean paramBoolean) {
    paramInt1 -= this.a;
    paramInt2 -= this.b;
    long l;
    boolean bool = ((l = System.currentTimeMillis()) - this.F <= 1000L && !paramBoolean) ? true : false;
    this.F = l;
    if (paramInt1 >= this.e && paramInt1 < this.e + this.g - 10 && paramInt2 >= this.f && paramInt2 < this.e + this.h) {
      int i = (paramInt2 - this.f) / this.l.a;
      this.k = this.j + i;
      if (this.k > this.E.size() - 1) {
        this.k = this.E.size() - 1;
      } else {
        boolean bool1 = (this.k == this.G && bool) ? true : false;
        this.G = this.k;
        if (bool1) {
          a();
          this.G = -1;
          return false;
        } 
      } 
      e();
    } else if (paramInt1 >= this.e + this.g - 10 && paramInt2 >= this.f && paramInt2 < this.f + this.h) {
      if ((paramInt2 = (paramInt2 -= this.f) * this.E.size() / this.h) < this.j) {
        this.j = paramInt2;
      } else if (this.j + this.i - 1 < this.j + paramInt2) {
        this.j = paramInt2 - this.i + 1;
      } 
      this.k = paramInt2;
      e();
    } else if (!paramBoolean) {
      if (paramInt1 >= this.e + this.g && paramInt2 >= 0 && paramInt2 < this.f) {
        this.A.a(2);
      } else if (paramInt1 >= this.e + this.g && paramInt2 >= this.f + this.h) {
        this.A.a(5);
      } else if (paramInt1 >= this.e && paramInt1 < this.e + this.g && paramInt2 < this.f) {
        this.A.a(1);
      } else if (paramInt1 >= this.e && paramInt1 < this.e + this.g && paramInt2 >= this.f + this.h) {
        this.A.a(6);
      } 
      return true;
    } 
    return false;
  }
  
  class mc/at extends TimerTask {
    public String a;
    
    public cy b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    private final cy f;
    
    public mc/at(cy this$0, cy param1cy1) {
      this.f = this$0;
      this.a = "";
      this.c = 0;
      this.d = 0;
      this.e = -1;
      this.b = param1cy1;
    }
    
    public final void run() {
      if (Display.getDisplay((MIDlet)MiniCommander.a).getCurrent() != this.b.A || this.b.A.y || !this.b.m)
        return; 
      cb cb;
      if ((cb = this.b.c()) != null && !cb.d.equals("..") && this.b.A.z == 0) {
        if (!this.a.equals(cb.d)) {
          this.a = cb.d;
          this.c = 0;
          this.d = 0;
          this.e = -1;
          return;
        } 
        this.c++;
        if (this.c > 5) {
          if (this.c == 6) {
            this.d = 0;
          } else {
            this.d++;
          } 
          String str;
          if ((str = cx.c(this.a)).endsWith("/"))
            str = str.substring(0, str.length() - 2); 
          if (this.b.l.d(str) > this.f.g) {
            if (this.f.b(this.b.k, this.d)) {
              this.d = 0;
              this.c = -5;
              this.e = 5;
            } 
            this.b.A.e(this.b.A.f);
            this.b.A.repaint();
            return;
          } 
        } 
        if (this.e >= 0) {
          this.e--;
          if (this.e == 0) {
            this.f.a(this.b.k);
            this.b.A.e(this.b.A.f);
            this.b.A.repaint();
          } 
        } 
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\cy.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */