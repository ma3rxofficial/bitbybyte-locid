package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class ab extends ca {
  public aw a = null;
  
  public bf b = null;
  
  public Image c = null;
  
  public int d = 0;
  
  public int e = 0;
  
  public Vector f;
  
  public boolean g = false;
  
  public boolean h = false;
  
  public int[] i = new int[2];
  
  public byte[] j = null;
  
  public boolean k = false;
  
  public int l = 0;
  
  public int m = 0;
  
  public int n = 0;
  
  public int o = 0;
  
  public int p = 0;
  
  public int q;
  
  public static int r = 0;
  
  public static int s = 16777215;
  
  public dd t = null;
  
  public boolean u = false;
  
  public boolean v = false;
  
  public static int w = 0;
  
  public Thread x = null;
  
  public cv y = null;
  
  public int z = 0;
  
  public int A = 0;
  
  public ab(aw paramaw, Vector paramVector, int paramInt) {
    this.f = paramVector;
    this.d = paramInt;
    this.a = paramaw;
    if ((paramaw.e[paramaw.f]).o == 1)
      this.t = (paramaw.e[paramaw.f]).u; 
    try {
      d();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void c() {
    this.q = cx.b(this);
    if (x.N)
      this.q -= aw.l.getHeight() + 2; 
    this.g = true;
    int i = cx.a(this);
    int j = this.q;
    this.o = i / 2;
    this.p = j / 2;
  }
  
  public final void a() {
    e();
    this.c = null;
    this.j = null;
    this.b = null;
    System.gc();
  }
  
  private void d() throws Exception {
    setFullScreenMode(true);
  }
  
  public final void paint(Graphics paramGraphics) {
    Image image;
    Graphics graphics = (image = aw.h).getGraphics();
    if (!this.g) {
      paramGraphics.setColor(r);
      paramGraphics.fillRect(0, 0, getWidth(), getHeight());
      c();
      graphics.setColor(r);
      graphics.fillRect(0, 0, cx.a(this), this.q);
    } 
    if (this.c == null)
      a(this.d); 
    graphics.setColor(r);
    graphics.fillRect(0, 0, cx.a(this), this.q);
    try {
      int i;
      int j;
      byte b = 0;
      if (!this.h)
        if (this.l == 1) {
          b = 5;
        } else if (this.l == 2) {
          b = 3;
        } else if (this.l == 3) {
          b = 6;
        }  
      int k = this.c.getWidth();
      int m = this.c.getHeight();
      if ((this.l == 1 || this.l == 3) && !this.h) {
        i = this.o - m / 2 - this.m;
        j = this.p - k / 2 - this.n;
      } else {
        i = this.o - this.c.getWidth() / 2 - this.m;
        j = this.p - this.c.getHeight() / 2 - this.n;
      } 
      graphics.drawRegion(this.c, 0, 0, k, m, b, i, j, 20);
      if (!this.h) {
        if (x.j > 0) {
          String str = cx.c(cx.a(this.f, this.d));
          aw.j.a(graphics, str, 1, 0, 0, r);
          aw.j.a(graphics, str, 0, 1, 0, r);
          aw.j.a(graphics, str, 2, 1, 0, r);
          aw.j.a(graphics, str, 1, 2, 0, r);
          aw.j.a(graphics, str, 1, 1, 0, s);
        } 
        if (x.j > 1) {
          String str = cx.a(this.e, false);
          if (this.i[0] > 0 && this.i[1] > 0)
            str = str + " " + this.i[0] + "x" + this.i[1]; 
          aw.j.a(graphics, str, 1, 2 + aw.j.a, 0, r);
          aw.j.a(graphics, str, 0, 3 + aw.j.a, 0, r);
          aw.j.a(graphics, str, 2, 3 + aw.j.a, 0, r);
          aw.j.a(graphics, str, 1, 4 + aw.j.a, 0, r);
          aw.j.a(graphics, str, 1, 3 + aw.j.a, 0, s);
        } 
      } 
    } catch (Exception exception) {
      a(bn.at, exception.getMessage(), s, 16711680);
      graphics.drawImage(this.c, 0, 0, 20);
    } catch (Error error) {
      a(bn.at, error.getMessage(), s, 16711680);
      graphics.drawImage(this.c, 0, 0, 20);
    } 
    if (((cb)this.f.elementAt(this.d)).b && this.a.u != null)
      graphics.drawImage(this.a.u, cx.a(this) - this.a.u.getWidth(), 0, 20); 
    if (this.k == true && this.a.v != null) {
      int i = cx.a(this) - this.a.v.getWidth();
      if (((cb)this.f.elementAt(this.d)).b && this.a.u != null)
        i -= this.a.u.getWidth(); 
      graphics.drawImage(this.a.v, i, 0, 20);
    } 
    a(graphics);
    if (x.p == 0) {
      paramGraphics.drawImage(image, 0, 0, 20);
    } else if (x.p == 1) {
      Sprite sprite;
      (sprite = new Sprite(image)).setPosition(getWidth() - 1, 0);
      sprite.setTransform(5);
      sprite.paint(paramGraphics);
    } else {
      Sprite sprite;
      (sprite = new Sprite(image)).setPosition(0, getHeight() - 1);
      sprite.setTransform(6);
      sprite.paint(paramGraphics);
    } 
    System.gc();
  }
  
  private void a(String paramString1, String paramString2, int paramInt1, int paramInt2) {
    this.c = Image.createImage(cx.a(this), this.q);
    Graphics graphics;
    (graphics = this.c.getGraphics()).setColor(r);
    graphics.fillRect(0, 0, cx.a(this), this.q);
    aw.j.a(graphics, cx.c(((cb)this.f.elementAt(this.d)).d), 0, 0, 0, paramInt1);
    if (paramString1 != null)
      aw.j.a(graphics, paramString1, 0, aw.j.a, 0, paramInt2); 
    if (paramString2 != null)
      aw.j.a(graphics, paramString2, 0, aw.j.a * 2, 0, paramInt2); 
    this.h = true;
  }
  
  private void e() {
    while (this.v) {
      this.u = true;
      try {
        Thread.sleep(100L);
      } catch (Exception exception) {
        break;
      } 
    } 
  }
  
  public final void b() {
    this.v = true;
    long l1 = 0L;
    long l2 = 0L;
    l1 = (this.b.a * 10);
    while (!this.u) {
      Image image;
      while (l1 > 0L && !this.u) {
        if (l1 > 100L) {
          l2 = 100L;
        } else {
          l2 = l1;
        } 
        l1 -= l2;
        try {
          Thread.sleep(l2);
        } catch (Exception exception) {
          break;
        } catch (Error error) {
          break;
        } 
      } 
      try {
        long l3 = System.currentTimeMillis();
        image = this.b.a();
        l1 = (this.b.a * 10);
        long l4 = System.currentTimeMillis();
        if (l1 > 0L && (l1 -= l4 - l3) <= 0L)
          l1 = 0L; 
      } catch (Exception exception) {
        break;
      } catch (Error error) {
        break;
      } 
      if (image != null) {
        this.c = image;
        f();
      } else {
        if (!this.b.b())
          break; 
        continue;
      } 
      repaint();
    } 
    try {
      this.b.c();
    } catch (Exception exception) {
    
    } catch (Error error) {}
    this.b = null;
    this.v = false;
    this.u = false;
  }
  
  private void a(int paramInt) {
    a(paramInt, x.v);
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    e();
    this.j = null;
    DataInputStream dataInputStream = null;
    this.h = false;
    this.m = 0;
    this.n = 0;
    m m = null;
    this.i[0] = 0;
    this.i[1] = 0;
    boolean bool = cx.f("com.motorola.extensions.ScalableJPGImage");
    try {
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
      cb cb = this.f.elementAt(paramInt);
      if (this.t != null) {
        int i;
        if ((i = (this.a.e[this.a.f]).u.a(cb.d, false)) == -1)
          throw new Exception("Entry not found"); 
        a(bn.b, "", s, s);
        repaint();
        serviceRepaints();
        this.h = false;
      } 
      this.c = null;
      System.gc();
      String str = cb.d.toLowerCase();
      boolean bool1 = paramBoolean;
      if (bool && !x.w && (str.endsWith(".jpg") || str.endsWith(".jpeg"))) {
        int[] arrayOfInt = new int[1];
        this.c = b.a(cb.d, this.t, cx.a(this), this.q, arrayOfInt, null);
        if (this.c == null)
          throw new Exception(); 
        this.k = false;
        this.e = arrayOfInt[0];
      } else if (!str.endsWith(".gif") || !paramBoolean) {
        Vector vector = new Vector();
        m = new m();
        if (this.t != null) {
          int i;
          if ((i = (this.a.e[this.a.f]).u.a(cb.d, false)) == -1)
            throw new Exception("Entry not found"); 
          this.j = new byte[this.t.b(i)];
          this.t.e(i);
          this.t.a(this.j, 0, this.j.length);
          this.t.e();
          if (str.endsWith(".jpg") || str.endsWith(".jpeg"))
            cx.a(this.j, this.i, vector); 
          if (str.endsWith(".gif"))
            cx.a(this.j, this.i); 
          if (str.endsWith(".png"))
            cx.b(this.j, this.i); 
          this.e = this.j.length;
        } else {
          m.a(cb.d, 1);
          this.e = (int)m.a();
          bt bt = new bt(m);
          if (str.endsWith(".jpg") || str.endsWith(".jpeg"))
            cx.a(bt, this.i, vector); 
          if (str.endsWith(".gif"))
            cx.a(bt, this.i); 
          if (str.endsWith(".png"))
            cx.b(bt, this.i); 
          bt.a();
        } 
        boolean bool2 = false;
        if (x.w && vector.size() > 0 && (str.endsWith(".jpg") || str.endsWith(".jpeg"))) {
          ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(vector.elementAt(0));
          try {
            this.c = Image.createImage(byteArrayInputStream);
          } catch (Exception exception) {
          
          } catch (Error error) {}
          if (this.c == null) {
            byte[] arrayOfByte = vector.elementAt(0);
            try {
              this.c = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
            } catch (Exception exception) {
            
            } catch (Error error) {}
          } 
          vector.setElementAt(null, 0);
          vector.removeAllElements();
          System.gc();
          if (this.c != null) {
            if (this.i[0] == 0 && this.i[1] == 0) {
              this.i[0] = this.c.getWidth();
              this.i[1] = this.c.getHeight();
            } 
            bool2 = true;
          } 
        } 
        if (!bool2 && bool && (str.endsWith(".jpg") || str.endsWith(".jpeg"))) {
          int[] arrayOfInt = new int[1];
          this.c = b.a(cb.d, this.t, cx.a(this), this.q, arrayOfInt, this.j);
          if (this.c != null) {
            this.k = false;
            this.e = arrayOfInt[0];
            this.j = null;
            System.gc();
            return;
          } 
        } 
        if (!bool2) {
          if (this.j == null) {
            dataInputStream = m.b();
            try {
              this.c = Image.createImage(dataInputStream);
            } catch (Exception exception) {
            
            } catch (Error error) {}
          } else {
            try {
              this.c = Image.createImage(this.j, 0, this.j.length);
            } catch (Exception exception) {
            
            } catch (Error error) {}
          } 
          if (this.c == null && this.j == null) {
            dataInputStream.close();
            dataInputStream = m.b();
            byte[] arrayOfByte = new byte[(int)m.a()];
            dataInputStream.readFully(arrayOfByte);
            this.c = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
          } 
          if (str.endsWith(".bmp") || str.endsWith(".wbmp")) {
            this.i[0] = this.c.getWidth();
            this.i[1] = this.c.getHeight();
          } 
          if (this.t == null)
            dataInputStream.close(); 
          System.gc();
        } 
        if (this.t == null)
          m.d(); 
        dataInputStream = null;
        m = null;
        if (this.c != null)
          f(); 
        bool1 = false;
      } else if (aw.B && paramBoolean && this.t == null) {
        k k;
        if ((k = new k(this.a, this, cb.d)).b()) {
          Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)k);
          bool1 = false;
        } else {
          System.gc();
        } 
      } 
      if (bool1) {
        try {
          (m = new m()).a(cb.d, 1);
          this.e = (int)m.a();
          dataInputStream = m.b();
          this.j = new byte[this.e];
          dataInputStream.read(this.j);
          dataInputStream.close();
          m.d();
          this.b = bf.a(this.j);
          this.j = null;
          if (this.b != null) {
            this.c = this.b.a();
            f();
            an an;
            (an = new an(this)).start();
            return;
          } 
          this.b = null;
        } catch (Exception exception) {
        
        } catch (Error error) {}
        try {
          if (dataInputStream != null)
            dataInputStream.close(); 
        } catch (Exception exception) {}
        try {
          if (m != null)
            m.d(); 
        } catch (Exception exception) {}
        a();
        this.k = true;
        a(paramInt, false);
        return;
      } 
      this.j = null;
      System.gc();
      return;
    } catch (Exception exception) {
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } catch (Exception exception1) {}
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception1) {}
      this.j = null;
      System.gc();
      a(bn.au, exception.toString(), s, 16711680);
      return;
    } catch (Error error) {
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } catch (Exception exception) {}
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception) {}
      this.j = null;
      System.gc();
      a(bn.au, error.toString(), s, 16711680);
      return;
    } 
  }
  
  private boolean f() {
    int[] arrayOfInt = null;
    if (this.c != null) {
      int i = this.c.getWidth();
      int j = this.c.getHeight();
      int k = i;
      int m = j;
      if (this.l == 1 || this.l == 3) {
        int i3 = k;
        k = m;
        m = i3;
      } 
      int n = cx.a(this) * 10000 / k;
      int i1 = this.q * 10000 / m;
      int i2 = (n < i1) ? n : i1;
      if ((x.u && i2 > 10000) || (x.t && i2 < 10000)) {
        int i3 = i * i2 / 10000;
        int i4 = j * i2 / 10000;
        int[] arrayOfInt1 = new int[2];
        try {
          if (i3 < i || i4 < j) {
            arrayOfInt = new int[i * j];
          } else {
            arrayOfInt = new int[i3 * i4];
          } 
          this.c.getRGB(arrayOfInt, 0, i, 0, 0, i, j);
          this.c = null;
          System.gc();
          int i5;
          if ((i5 = a(arrayOfInt, i, j, i2, arrayOfInt1)) == 0 || i5 == 1)
            this.c = Image.createRGBImage(arrayOfInt, arrayOfInt1[0], arrayOfInt1[1], false); 
        } catch (OutOfMemoryError outOfMemoryError) {
          try {
            arrayOfInt = new int[i3 * i4];
            int i5;
            if ((i5 = a(this.c, arrayOfInt, i, j, i2, arrayOfInt1)) == 0 || i5 == 1)
              this.c = Image.createRGBImage(arrayOfInt, arrayOfInt1[0], arrayOfInt1[1], false); 
            if (i5 == 2)
              this.k = true; 
            System.gc();
          } catch (OutOfMemoryError outOfMemoryError1) {
            this.k = true;
          } 
        } catch (Error error) {
          this.k = true;
        } 
        System.gc();
        return true;
      } 
    } 
    return false;
  }
  
  public final void feyReleased(int paramInt) {
    String str;
    if ((str = cx.b(cx.a(this, paramInt))).equals("BACK")) {
      e();
      this.a.a(cx.a(this.f, this.d));
      a();
      cx.a();
      return;
    } 
    w = 0;
    if (this.y != null)
      this.y.a = true; 
    this.x = null;
    System.gc();
  }
  
  public final void a(cv paramcv) {
    try {
      boolean bool = false;
      int i = 0;
      int j = 0;
      while (true) {
        if (this.c != null) {
          i = this.c.getWidth();
          j = this.c.getHeight();
          if (this.l == 1 || this.l == 3) {
            int k = i;
            i = j;
            j = k;
          } 
        } 
        if (w != 0) {
          if (paramcv.a)
            break; 
          if (w == 52) {
            if (i > cx.a(this)) {
              this.m -= cx.a(this) / 4;
              if (this.o - i / 2 - this.m > 0)
                this.m = this.o - i / 2; 
              repaint();
            } 
          } else if (w == 54) {
            if (i > cx.a(this)) {
              this.m += cx.a(this) / 4;
              if (this.o - i / 2 - this.m + i < cx.a(this))
                this.m = this.o - i / 2 + i - cx.a(this); 
              repaint();
            } 
          } else if (w == 50) {
            if (j > this.q) {
              this.n -= this.q / 4;
              if (this.p - j / 2 - this.n > 0)
                this.n = this.p - j / 2; 
              repaint();
            } 
          } else if (w == 56 && j > this.q) {
            this.n += this.q / 4;
            if (this.p - j / 2 - this.n + j < this.q)
              this.n = this.p - j / 2 + j - this.q; 
            repaint();
          } 
          if (bool) {
            Thread.sleep(x.l);
            continue;
          } 
          Thread.sleep(x.k);
          bool = true;
          continue;
        } 
        return;
      } 
    } catch (Exception exception) {}
  }
  
  private void b(int paramInt) {
    w = paramInt;
    this.y = new cv();
    this.x = new df(this);
    this.x.start();
    Thread.yield();
  }
  
  public final void feyPressed(int paramInt) {
    w = 0;
    if (this.y != null)
      this.y.a = true; 
    this.x = null;
    System.gc();
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    i = cx.a(i);
    paramInt = cx.b(paramInt);
    String str;
    if ((str = cx.b(cx.a(this, paramInt))).equals("SOFT1")) {
      e();
      this.a.a(cx.a(this.f, this.d));
      a();
      cx.a();
      return;
    } 
    if (str.equals("SOFT2") || str.equals("SOFT3")) {
      co co = new co(this);
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)co);
      return;
    } 
    if (paramInt == 48) {
      cb cb;
      (cb = this.f.elementAt(this.d)).b = !cb.b;
      repaint();
      return;
    } 
    if (paramInt == 49) {
      x.j++;
      if (x.j > 2)
        x.j = 0; 
      repaint();
      return;
    } 
    if (paramInt == 57) {
      x.u ^= 0x1;
      a(this.d);
      repaint();
      return;
    } 
    if (paramInt == 51) {
      x.t ^= 0x1;
      a(this.d);
      repaint();
      return;
    } 
    if (paramInt == 52 || paramInt == 54 || paramInt == 50 || paramInt == 56) {
      b(paramInt);
      return;
    } 
    if (paramInt == 53) {
      this.m = 0;
      this.n = 0;
      repaint();
      return;
    } 
    if (paramInt == 55) {
      x.w ^= 0x1;
      String str1;
      if ((str1 = cx.a(this.f, this.d).toLowerCase()).endsWith(".jpg") || str1.endsWith(".jpeg")) {
        a(this.d);
        repaint();
      } 
      return;
    } 
    if (i == 6) {
      this.d++;
      if (this.d >= this.f.size())
        this.d = 0; 
      a(this.d);
      repaint();
      return;
    } 
    if (i == 1) {
      this.d--;
      if (this.d < 0)
        this.d = this.f.size() - 1; 
      a(this.d);
      repaint();
      return;
    } 
    if (i == 5) {
      this.l++;
      if (this.l == 4)
        this.l = 0; 
      if (x.u || x.t)
        a(this.d); 
      repaint();
      return;
    } 
    if (i == 2) {
      this.l--;
      if (this.l < 0)
        this.l = 3; 
      if (x.u || x.t)
        a(this.d); 
      repaint();
      return;
    } 
    if (paramInt == 42) {
      int j = r;
      r = s;
      s = j;
      repaint();
    } 
  }
  
  private static int a(int[] paramArrayOfint1, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint2) {
    int i = paramInt1;
    int j = paramInt2;
    int k = i * paramInt3 / 10000;
    int m = j * paramInt3 / 10000;
    paramArrayOfint2[0] = k;
    paramArrayOfint2[1] = m;
    int n = 0;
    int i1 = 0;
    try {
      if (k == i)
        return 1; 
      if (k < i) {
        for (i1 = 0; i1 < m; i1++) {
          for (n = 0; n < k; n++)
            paramArrayOfint1[n + i1 * k] = paramArrayOfint1[n * 10000 / paramInt3 + i1 * 10000 / paramInt3 * i]; 
        } 
      } else {
        for (i1 = m - 1; i1 >= 0; i1--) {
          for (n = k - 1; n >= 0; n--)
            paramArrayOfint1[n + i1 * k] = paramArrayOfint1[n * 10000 / paramInt3 + i1 * 10000 / paramInt3 * i]; 
        } 
      } 
      return 0;
    } catch (Exception exception) {
    
    } catch (Error error) {}
    return 2;
  }
  
  private static int a(Image paramImage, int[] paramArrayOfint1, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint2) {
    int i = paramInt1;
    int j = paramInt2;
    int k = i * paramInt3 / 10000;
    int m = j * paramInt3 / 10000;
    paramArrayOfint2[0] = k;
    paramArrayOfint2[1] = m;
    byte b1 = 0;
    byte b2 = 0;
    int[] arrayOfInt = new int[1];
    try {
      if (k == i)
        return 1; 
      for (b2 = 0; b2 < m; b2++) {
        for (b1 = 0; b1 < k; b1++) {
          paramImage.getRGB(arrayOfInt, 0, 1, b1 * 10000 / paramInt3, b2 * 10000 / paramInt3, 1, 1);
          paramArrayOfint1[b1 + b2 * k] = arrayOfInt[0];
        } 
      } 
      return 0;
    } catch (Exception exception) {
    
    } catch (Error error) {}
    return 2;
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2) {
    if (!x.N)
      return; 
    if (a(paramInt1, paramInt2))
      return; 
    this.z = paramInt1;
    this.A = paramInt2;
  }
  
  public final void pointerReleased(int paramInt1, int paramInt2) {
    if (!x.N)
      return; 
    feyReleased(0);
  }
  
  public final void pointerDragged(int paramInt1, int paramInt2) {
    if (!x.N)
      return; 
    int i = -this.z + paramInt1;
    int j = -this.A + paramInt2;
    this.z = paramInt1;
    this.A = paramInt2;
    int k = this.c.getWidth();
    int m = this.c.getHeight();
    if (this.l == 1 || this.l == 3) {
      int n = k;
      k = m;
      m = n;
    } 
    if (k > cx.a(this)) {
      this.m -= i;
      if (this.o - k / 2 - this.m > 0)
        this.m = this.o - k / 2; 
      if (this.o - k / 2 - this.m + k < cx.a(this))
        this.m = this.o - k / 2 + k - cx.a(this); 
    } 
    if (m > this.q) {
      this.n -= j;
      if (this.p - m / 2 - this.n > 0)
        this.n = this.p - m / 2; 
      if (this.p - m / 2 - this.n + m < this.q)
        this.n = this.p - m / 2 + m - this.q; 
    } 
    repaint();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\ab.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */