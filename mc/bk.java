package mc;

import MiniCommander;
import favax.microedition.lcdui.Canvas;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class bk extends Canvas implements CommandListener {
  public aw a;
  
  public boolean b = false;
  
  public String c;
  
  public w d;
  
  public bq e;
  
  public boolean f = true;
  
  public Thread g = null;
  
  public String h;
  
  public boolean i = false;
  
  public boolean j = false;
  
  public int k = 0;
  
  public boolean l = false;
  
  public int m = 0;
  
  public Image n = null;
  
  public Graphics o = null;
  
  public bk(aw paramaw, String paramString) {
    this.a = paramaw;
    this.c = paramString;
    try {
      b();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void b() throws Exception {
    setCommandListener(this);
    setFullScreenMode(true);
  }
  
  public final void a() {
    this.h = cx.d(this.c);
    this.e = new bq();
    try {
      a(bn.cB + cx.c(this.c), 16777215);
      this.e.a(this.c);
      a(bn.cC, 16777215);
      for (int i = 0; i < this.e.c.size(); i++) {
        String[] arrayOfString;
        String str;
        if ((str = (arrayOfString = this.e.b.elementAt(i))[0].toLowerCase()).startsWith("@")) {
          str = str.substring(1, str.length());
        } else if (this.f) {
          a(this.h + ">" + (String)this.e.c.elementAt(i), 16777215);
        } 
        if (!str.startsWith(":") || str.length() < 2)
          if (str.equals("goto")) {
            if (arrayOfString.length >= 2) {
              byte b;
              for (b = 0; b < this.e.c.size(); b++) {
                String[] arrayOfString1 = this.e.b.elementAt(b);
                String str1 = arrayOfString[1].toLowerCase();
                String str2;
                if ((str2 = arrayOfString1[0].toLowerCase()).startsWith("@"))
                  str2 = str2.substring(1, str2.length()); 
                if (str2.startsWith(":") && str2.substring(1, str2.length()).toLowerCase().equals(str1))
                  break; 
              } 
              if (b < this.e.c.size()) {
                i = b;
              } else {
                a(bn.cx, 16744576);
              } 
            } else {
              a(bn.cy, 16744576);
            } 
          } else if (str.equals("echo")) {
            if (arrayOfString.length >= 2) {
              String str1;
              if ((str1 = arrayOfString[1].toLowerCase()).equals("on")) {
                this.f = true;
              } else if (str1.equals("off")) {
                this.f = false;
              } else {
                str1 = (str1 = this.e.c.elementAt(i)).substring(str1.toLowerCase().indexOf("echo") + 4, str1.length()).trim();
                a(str1, 16777215);
              } 
            } else {
              a(bn.cy, 16744576);
            } 
          } else if (str.equals("cd") || str.equals("chdir")) {
            a(arrayOfString);
          } else if (str.equals("if")) {
            int j;
            if ((j = e(arrayOfString)) != -1)
              i = j; 
          } else if (str.equals("dir")) {
            b(arrayOfString);
          } else if (str.equals("cls")) {
            e();
          } else if (str.equals("pause")) {
            d(arrayOfString);
          } else if (str.equals("setpause")) {
            c(arrayOfString);
          } else if (str.equals("md") || str.equals("mkdir")) {
            f(arrayOfString);
          } else if (str.equals("rd") || str.equals("rmdir")) {
            g(arrayOfString);
          } else if (str.equals("copy")) {
            l(arrayOfString);
          } else if (str.equals("move")) {
            m(arrayOfString);
          } else if (str.equals("ren") || str.equals("rename")) {
            j(arrayOfString);
          } else if (str.equals("del") || str.equals("erase")) {
            h(arrayOfString);
          } else if (str.equals("attrib")) {
            i(arrayOfString);
          } else if (str.equals("exit")) {
            this.j = true;
          } else if (str.equals("waitkey")) {
            int j;
            if ((j = k(arrayOfString)) != -1)
              i = j; 
          } else if (!str.equals("rem")) {
            a(bn.cz, 16744576);
          }  
        if (this.j)
          break; 
      } 
    } catch (Exception exception) {
      a(exception.getMessage(), 16744576);
    } 
    a(bn.cA, 16777088);
    this.i = true;
  }
  
  private void c() {
    this.g = new cm(this);
    this.g.start();
  }
  
  private int d() {
    this.l = true;
    try {
      while (this.l)
        Thread.sleep(50L); 
    } catch (InterruptedException interruptedException) {}
    return this.m;
  }
  
  public final void feyPressed(int paramInt) {
    if (this.l) {
      this.m = paramInt;
      this.l = false;
      return;
    } 
    if (this.i) {
      cy[] arrayOfCy = this.a.e;
      int i = this.a.f;
      int j = this.a.g;
      String str = arrayOfCy[i].b();
      arrayOfCy[i].d();
      arrayOfCy[i].a(str);
      str = arrayOfCy[j].b();
      arrayOfCy[j].d();
      arrayOfCy[j].a(str);
      arrayOfCy[i].e();
      arrayOfCy[j].e();
      this.a.e(-1);
      this.a.repaint();
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramInt == 48) {
      a(bn.cP, 16777215);
      this.j = true;
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    if (this.n == null) {
      this.n = Image.createImage(cx.a(this), cx.b(this));
      this.o = this.n.getGraphics();
    } 
    if (!this.b) {
      this.d = new w(cx.a(this), cx.b(this), aw.j);
      this.b = true;
      c();
      return;
    } 
    this.o.drawImage(this.d.a, 0, 0, 0);
    if (x.p == 0) {
      paramGraphics.drawImage(this.n, 0, 0, 20);
      return;
    } 
    if (x.p == 1) {
      Sprite sprite1;
      (sprite1 = new Sprite(this.n)).setPosition(getWidth() - 1, 0);
      sprite1.setTransform(5);
      sprite1.paint(paramGraphics);
      return;
    } 
    Sprite sprite;
    (sprite = new Sprite(this.n)).setPosition(0, getHeight() - 1);
    sprite.setTransform(6);
    sprite.paint(paramGraphics);
  }
  
  public final void a(String paramString, int paramInt) {
    if (paramString == null)
      paramString = ""; 
    this.d.a(paramString, paramInt);
    repaint();
    serviceRepaints();
    if (this.k > 0)
      try {
        Thread.sleep(this.k);
        return;
      } catch (InterruptedException interruptedException) {} 
  }
  
  private void a(String[] paramArrayOfString) {
    if (paramArrayOfString.length >= 2) {
      String str = paramArrayOfString[1];
      m m = new m();
      try {
        if (!str.startsWith("/"))
          str = this.h + str; 
        if (!str.endsWith("/"))
          str = str + "/"; 
        m.a(str);
        if (m.p()) {
          this.h = str;
        } else {
          a(bn.cD, 16744576);
        } 
        m.d();
      } catch (Exception exception) {
        try {
          m.d();
        } catch (Exception exception1) {}
        a(bn.cE + exception.getMessage(), 16744576);
        return;
      } 
    } else {
      a(this.h, 16777215);
    } 
  }
  
  private void b(String[] paramArrayOfString) {
    String str;
    if (paramArrayOfString.length >= 2) {
      if (!(str = paramArrayOfString[1]).startsWith("/"))
        str = this.h + str; 
    } else {
      str = this.h;
    } 
    String[] arrayOfString = a(str, true, false);
    for (byte b = 0; b < arrayOfString.length; b++) {
      cx.c(arrayOfString[b]);
      a(arrayOfString[b], 16777215);
      if (this.j)
        return; 
    } 
  }
  
  private void e() {
    this.d.a();
  }
  
  private void c(String[] paramArrayOfString) {
    if (paramArrayOfString.length >= 2)
      try {
        this.k = Integer.parseInt(paramArrayOfString[1]);
        return;
      } catch (NumberFormatException numberFormatException) {
        a(bn.cy, 16744576);
        return;
      }  
    a(bn.cF + String.valueOf(this.k), 16777215);
  }
  
  private void d(String[] paramArrayOfString) {
    int i = 0;
    if (paramArrayOfString.length != 1) {
      try {
        if (paramArrayOfString.length != 2)
          throw new IllegalArgumentException(); 
        i = Integer.parseInt(paramArrayOfString[1]);
        try {
          Thread.sleep(i);
        } catch (InterruptedException interruptedException) {
          return;
        } 
      } catch (Exception exception) {
        a(bn.cy, 16744576);
        return;
      } 
    } else {
      a(bn.cG, 16777088);
      d();
    } 
  }
  
  private int e(String[] paramArrayOfString) {
    byte b = -1;
    m m = null;
    try {
      if (paramArrayOfString.length < 5)
        throw new IllegalArgumentException(); 
      boolean bool = false;
      boolean bool1 = false;
      byte b1 = 0;
      if (paramArrayOfString[1].toLowerCase().equals("exist")) {
        b1 = 2;
        bool = true;
      } else if (paramArrayOfString[1].toLowerCase().equals("not") && paramArrayOfString[2].toLowerCase().equals("exist")) {
        b1 = 3;
      } else {
        throw new IllegalArgumentException();
      } 
      if ((paramArrayOfString.length < 6 && b1 == 3) || !paramArrayOfString[b1 + 1].toLowerCase().equals("goto"))
        throw new IllegalArgumentException(); 
      String str;
      if (!(str = paramArrayOfString[b1]).startsWith("/"))
        str = this.h + str; 
      (m = new m()).a(str);
      bool1 = m.p();
      m.d();
      if (!bool)
        bool1 = !bool1; 
      if (bool1) {
        byte b2;
        for (b2 = 0; b2 < this.e.c.size(); b2++) {
          String[] arrayOfString = this.e.b.elementAt(b2);
          String str1 = paramArrayOfString[b1 + 2].toLowerCase();
          String str2;
          if ((str2 = arrayOfString[0].toLowerCase()).startsWith("@"))
            str2 = str2.substring(1, str2.length()); 
          if (str2.startsWith(":") && str2.substring(1, str2.length()).toLowerCase().equals(str1))
            break; 
        } 
        if (b2 < this.e.c.size()) {
          b = b2;
        } else {
          a(bn.cx, 16744576);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      a(bn.cy, 16744576);
    } catch (IOException iOException) {
      a(iOException.getMessage(), 16744576);
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception) {}
    } 
    return b;
  }
  
  private void f(String[] paramArrayOfString) {
    m m = null;
    try {
      String str;
      if (!(str = paramArrayOfString[1]).startsWith("/"))
        str = this.h + str; 
      if (!str.endsWith("/"))
        str = str + "/"; 
      if (paramArrayOfString.length != 2)
        throw new IllegalArgumentException(); 
      (m = new m()).a(str);
      if (m.p()) {
        a(bn.cH, 16744576);
        m.d();
        return;
      } 
      m.q();
      m.d();
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      a(bn.cy, 16744576);
      return;
    } catch (IOException iOException) {
      a(iOException.getMessage(), 16744576);
      try {
        if (m != null)
          m.d(); 
        return;
      } catch (Exception exception) {
        return;
      } 
    } 
  }
  
  private boolean a(String paramString) {
    m m = null;
    try {
      (m = new m()).a(paramString);
      if (!m.p()) {
        a(bn.cI, 16744576);
        m.d();
        return false;
      } 
      boolean[] arrayOfBoolean;
      (arrayOfBoolean = new boolean[1])[0] = false;
      m.a(paramString, this, arrayOfBoolean);
      m.d();
      return true;
    } catch (IOException iOException) {
      a(iOException.getMessage(), 16744576);
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception) {}
      return false;
    } 
  }
  
  private void g(String[] paramArrayOfString) {
    try {
      String str;
      if (!(str = paramArrayOfString[1]).startsWith("/"))
        str = this.h + str; 
      if (!str.endsWith("/"))
        str = str + "/"; 
      if (paramArrayOfString.length != 2)
        throw new IllegalArgumentException(); 
      a(str);
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      a(bn.cy, 16744576);
      return;
    } 
  }
  
  private static String[] a(String[] paramArrayOfString, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    String[] arrayOfString = null;
    Vector vector = new Vector();
    if (paramString.equals("*.*"))
      paramString = "*"; 
    byte b;
    for (b = 0; b < paramArrayOfString.length; b++) {
      String str;
      boolean bool = (str = paramArrayOfString[b]).endsWith("/");
      if (paramBoolean2 || paramBoolean1 || !bool) {
        if (bool) {
          str = cx.j(str);
        } else {
          str = cx.c(str);
        } 
        if (cx.a(str, paramString) || (bool && paramBoolean2))
          vector.addElement(paramArrayOfString[b]); 
      } 
    } 
    arrayOfString = new String[vector.size()];
    for (b = 0; b < vector.size(); b++)
      arrayOfString[b] = vector.elementAt(b); 
    return arrayOfString;
  }
  
  private String[] a(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    String str = cx.c(paramString);
    if (paramString.endsWith("/")) {
      str = "*.*";
    } else {
      paramString = cx.d(paramString);
    } 
    String[] arrayOfString1 = new String[0];
    String[] arrayOfString2 = null;
    m m = null;
    try {
      (m = new m()).a(paramString);
      arrayOfString2 = m.a(paramString, true);
      m.d();
      arrayOfString1 = a(arrayOfString2, str, paramBoolean1, paramBoolean2);
    } catch (Exception exception) {
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception1) {
      
      } catch (Error error) {}
    } catch (Error error) {
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception) {
      
      } catch (Error error1) {}
    } 
    return arrayOfString1;
  }
  
  private void h(String[] paramArrayOfString) {
    m m = null;
    try {
      if (paramArrayOfString.length < 2)
        throw new IllegalArgumentException(); 
      String str1 = paramArrayOfString[1];
      boolean bool1 = false;
      boolean bool2 = false;
      if (paramArrayOfString.length == 3 || paramArrayOfString.length == 4) {
        str1 = paramArrayOfString[paramArrayOfString.length - 1];
        for (byte b1 = 1; b1 < paramArrayOfString.length - 1; b1++) {
          if (paramArrayOfString[b1].toLowerCase().equals("/f")) {
            bool1 = true;
          } else if (paramArrayOfString[b1].toLowerCase().equals("/s")) {
            bool2 = true;
          } else {
            throw new IllegalArgumentException();
          } 
        } 
      } else if (paramArrayOfString.length != 2 || str1.endsWith("/")) {
        throw new IllegalArgumentException();
      } 
      if (!str1.startsWith("/"))
        str1 = this.h + str1; 
      String[] arrayOfString = a(str1, bool1, bool2);
      String str2 = cx.c(str1);
      if (str1.endsWith("/")) {
        str2 = "*.*";
      } else {
        cx.d(str1);
      } 
      byte b = 0;
      while (b < arrayOfString.length) {
        if (!this.j) {
          if ((str1 = arrayOfString[b]).endsWith("/")) {
            if (bool2) {
              Vector vector = new Vector();
              aw.a(str1, vector, false);
              for (byte b1 = 0; b1 < vector.size() && !this.j; b1++) {
                if (cx.a(cx.c(vector.elementAt(b1)), str2)) {
                  a(vector.elementAt(b1), 16777215);
                  try {
                    (m = new m()).a(vector.elementAt(b1));
                    m.o();
                    m.d();
                  } catch (IOException iOException) {
                    a(bn.cJ + str1, 16744576);
                    try {
                      m.d();
                    } catch (Exception exception) {}
                  } 
                } 
              } 
            } else {
              a(str1);
            } 
          } else {
            a(str1, 16777215);
            try {
              (m = new m()).a(str1);
              m.o();
              m.d();
            } catch (IOException iOException) {
              a(bn.cJ + str1, 16744576);
              try {
                m.d();
              } catch (Exception exception) {}
            } 
            m = null;
          } 
          b++;
          continue;
        } 
        return;
      } 
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      a(bn.cy, 16744576);
    } 
  }
  
  private void i(String[] paramArrayOfString) {
    m m = null;
    try {
      boolean bool = false;
      byte b1 = -1;
      byte b2 = -1;
      byte b3 = -1;
      byte b = 0;
      if (paramArrayOfString.length < 2)
        throw new IllegalArgumentException(); 
      String str = paramArrayOfString[paramArrayOfString.length - 1];
      for (b = 1; b < paramArrayOfString.length - 1; b++) {
        String str1;
        if (!(str1 = paramArrayOfString[b].toLowerCase()).endsWith("/ff"))
          if (str1.endsWith("+r")) {
            b1 = 1;
          } else if (str1.endsWith("-r")) {
            b1 = 0;
          } else if (str1.endsWith("+w")) {
            b2 = 1;
          } else if (str1.endsWith("-w")) {
            b2 = 0;
          } else if (str1.endsWith("+h")) {
            b3 = 1;
          } else if (str1.endsWith("-h")) {
            b3 = 0;
          } else {
            throw new IllegalArgumentException();
          }  
      } 
      if (str.endsWith("/"))
        throw new IllegalArgumentException(); 
      if (!str.startsWith("/"))
        str = this.h + str; 
      String[] arrayOfString = a(str, false, false);
      if (b1 == -1 && b2 == -1 && b3 == -1)
        bool = true; 
      b = 0;
      while (b < arrayOfString.length) {
        if (!this.j) {
          str = arrayOfString[b];
          try {
            (m = new m()).a(str);
            boolean bool1 = m.k();
            boolean bool2 = m.l();
            boolean bool3 = m.m();
            if (bool) {
              a((bool1 ? "R" : " ") + (bool2 ? "W" : " ") + (bool3 ? "H " : "  ") + str, 16777215);
            } else {
              a(str, 16777215);
              if (b3 != -1)
                m.a((b3 == 1)); 
              if (b1 != -1)
                m.b((b1 == 1)); 
              if (b2 != -1)
                m.c((b2 == 1)); 
            } 
            m.d();
          } catch (IOException iOException) {
            a(bn.cJ + str, 16744576);
            try {
              m.d();
            } catch (Exception exception) {}
          } 
          m = null;
          b++;
          continue;
        } 
        return;
      } 
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      a(bn.cy, 16744576);
    } 
  }
  
  private void j(String[] paramArrayOfString) {
    m m = null;
    try {
      boolean bool = false;
      if (paramArrayOfString.length != 3)
        throw new IllegalArgumentException(); 
      String str1 = paramArrayOfString[1];
      String str2;
      if ((str2 = paramArrayOfString[2]).startsWith("/"))
        throw new IllegalArgumentException(); 
      if (!str1.startsWith("/"))
        str1 = this.h + str1; 
      if (!str2.startsWith("/"))
        str2 = this.h + str2; 
      if (str1.endsWith("/") && !str2.endsWith("/"))
        str2 = str2 + "/"; 
      String[] arrayOfString = new String[1];
      (m = new m()).a(str1);
      if (!m.p())
        throw new IOException(bn.cK); 
      if (m.s().endsWith("/") && !str2.endsWith("/"))
        str2 = str2 + "/"; 
      if (!m.a(str2, arrayOfString))
        throw new IOException(arrayOfString[0]); 
      m.d();
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      a(bn.cy, 16744576);
      return;
    } catch (IOException iOException) {
      a(iOException.getMessage(), 16744576);
      try {
        if (m != null)
          m.d(); 
        return;
      } catch (Exception exception) {
        return;
      } 
    } 
  }
  
  private int k(String[] paramArrayOfString) {
    try {
      if (paramArrayOfString.length < 2)
        throw new IllegalArgumentException(); 
      Vector vector = new Vector();
      Vector vector1 = new Vector();
      String str = null;
      int i = -1;
      int j;
      for (j = 1; j < paramArrayOfString.length; j++) {
        if ((str = paramArrayOfString[j]).toLowerCase().equals("goto")) {
          i = j;
          break;
        } 
        try {
          if (str.length() != 1)
            throw new IllegalArgumentException(); 
          vector.addElement(new Integer(Integer.parseInt(str)));
        } catch (NumberFormatException numberFormatException) {
          break;
        } 
      } 
      if (i == -1)
        throw new IllegalArgumentException(); 
      for (j = i + 1; j < paramArrayOfString.length; j++)
        vector1.addElement(paramArrayOfString[j]); 
      if (vector1.size() != vector.size())
        throw new IllegalArgumentException(); 
      while (true) {
        int k;
        if ((k = d()) >= 48 && k <= 57) {
          k -= 48;
          for (j = 0; j < vector.size(); j++) {
            if (((Integer)vector.elementAt(j)).intValue() == k) {
              String str1 = vector1.elementAt(j);
              byte b = 0;
              byte b1 = -1;
              while (b < this.e.c.size()) {
                String[] arrayOfString;
                String str2;
                if ((str2 = (arrayOfString = this.e.b.elementAt(b))[0].toLowerCase()).startsWith("@"))
                  str2 = str2.substring(1, str2.length()); 
                if (str2.startsWith(":") && str2.substring(1, str2.length()).toLowerCase().equals(str1))
                  break; 
                b++;
              } 
              if (b < this.e.c.size()) {
                b1 = b;
              } else {
                a(bn.cx, 16744576);
              } 
              return b1;
            } 
          } 
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      a(bn.cy, 16744576);
      return -1;
    } 
  }
  
  private int a(String paramString1, String paramString2) {
    try {
      boolean bool = false;
      DataInputStream dataInputStream = null;
      DataOutputStream dataOutputStream = null;
      m m1;
      (m1 = new m()).a(paramString1);
      if (!m1.k())
        return 3; 
      m m2;
      (m2 = new m()).a(paramString2);
      if (m2.p()) {
        m2.d();
        m1.d();
        return 2;
      } 
      if (x.K && m2.j() < m1.a()) {
        m2.d();
        m1.d();
        return 4;
      } 
      m2.n();
      m2.b(true);
      m2.c(true);
      m2.a(false);
      dataInputStream = m1.b();
      dataOutputStream = m2.c();
      long l1 = m1.a();
      long l2 = l1;
      int i = 0;
      byte[] arrayOfByte;
      long l3 = (arrayOfByte = new byte[16384]).length;
      while (l2 != 0L) {
        if (l2 > l3) {
          i = (int)l3;
        } else {
          i = (int)l2;
        } 
        i = dataInputStream.read(arrayOfByte, 0, i);
        dataOutputStream.write(arrayOfByte, 0, i);
        l2 -= i;
      } 
      dataInputStream.close();
      dataOutputStream.close();
      m1.d();
      m2.d();
    } catch (Exception exception) {
      a(exception.getMessage(), 16744576);
      return 1;
    } catch (Error error) {
      a(error.getMessage(), 16744576);
      return 1;
    } 
    return 0;
  }
  
  private int b(String paramString1, String paramString2) {
    try {
      if (paramString1.equals(paramString2))
        return 0; 
      m m;
      (m = new m()).a(paramString2);
      if (m.p()) {
        m.d();
        return 2;
      } 
      m.d();
      m.a(paramString1);
      if (!m.k()) {
        m.d();
        return 3;
      } 
      boolean bool = m.b(paramString2);
      m.d();
      if (!bool) {
        int i;
        if ((i = a(paramString1, paramString2)) != 0)
          return i; 
        m.a(paramString1);
        m.o();
        m.d();
      } 
    } catch (Exception exception) {
      a(exception.getMessage(), 16744576);
      return 1;
    } catch (Error error) {
      a(error.getMessage(), 16744576);
      return 1;
    } 
    return 0;
  }
  
  private void a(int paramInt) {
    if (paramInt == 0)
      return; 
    if (paramInt == 1) {
      a(bn.eq, 16744576);
      return;
    } 
    if (paramInt == 3) {
      a(bn.eE, 16744576);
      return;
    } 
    if (paramInt == 4) {
      a(bn.cL, 16744576);
      return;
    } 
    if (paramInt == 2)
      a(bn.cM, 16744576); 
  }
  
  private void a(String[] paramArrayOfString, boolean paramBoolean) {
    m m = null;
    try {
      if (paramArrayOfString.length != 3)
        throw new IllegalArgumentException(); 
      String str1 = paramArrayOfString[1];
      String str2 = paramArrayOfString[2];
      if (!str1.startsWith("/"))
        str1 = this.h + str1; 
      if (str1.endsWith("/"))
        throw new IllegalArgumentException(); 
      if (!str2.startsWith("/"))
        str2 = this.h + str2; 
      if (!str2.endsWith("/"))
        str2 = str2 + "/"; 
      String[] arrayOfString = a(str1, false, false);
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      byte b = 0;
      while (b < arrayOfString.length) {
        if (!this.j) {
          String str3 = arrayOfString[b];
          String str4 = str2 + cx.c(str3);
          a(cx.c(str3), 16777215);
          if (str3.equals(str4)) {
            a(bn.cN, 16744576);
          } else {
            int i;
            if (paramBoolean) {
              i = a(str3, str4);
            } else {
              i = b(str3, str4);
            } 
            if (i != 0 && (i != 2 || !bool1))
              a(i); 
            if (i == 2) {
              bool3 = false;
              if (!bool2) {
                if (!bool1) {
                  int j;
                  a(bn.cO, 16777088);
                  do {
                    j = d();
                    j -= 48;
                  } while ((j < 1 || j > 4) && j != 0);
                  if (j == 0)
                    return; 
                  if (j == 2)
                    bool1 = true; 
                  if (j == 1)
                    bool3 = true; 
                  if (j == 3)
                    bool3 = false; 
                  if (j == 4)
                    bool2 = true; 
                } 
                if (bool1 || bool3)
                  try {
                    (m = new m()).a(str4);
                    m.o();
                    m.d();
                    if (paramBoolean) {
                      i = a(str3, str4);
                    } else {
                      i = b(str3, str4);
                    } 
                    if (i != 0)
                      a(i); 
                  } catch (IOException iOException) {
                    a(iOException.getMessage(), 16744576);
                    try {
                      if (m != null)
                        m.d(); 
                    } catch (Exception exception) {}
                  }  
              } 
            } 
          } 
          b++;
          continue;
        } 
        return;
      } 
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      a(bn.cy, 16744576);
    } 
  }
  
  private void l(String[] paramArrayOfString) {
    a(paramArrayOfString, true);
  }
  
  private void m(String[] paramArrayOfString) {
    a(paramArrayOfString, false);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bk.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */