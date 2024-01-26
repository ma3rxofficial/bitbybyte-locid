package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.lcdui.game.Sprite;

public final class dh extends dl implements CommandListener {
  public am a = aw.j;
  
  public boolean b = false;
  
  public aw c;
  
  public Displayable d;
  
  public dh e;
  
  public Image f = null;
  
  public Graphics g = null;
  
  public String h = null;
  
  public dd i = null;
  
  public String j = null;
  
  public boolean k = false;
  
  public byte l = 0;
  
  public boolean m = false;
  
  public TextBox n = null;
  
  public boolean o = false;
  
  public boolean p = false;
  
  public Form q = null;
  
  public TextField r = null;
  
  public TextField s = null;
  
  public static String t = "";
  
  public static String u = "";
  
  public static boolean v = false;
  
  public static boolean w = false;
  
  public int x = -1;
  
  public ChoiceGroup y = null;
  
  public int z;
  
  public int A;
  
  public int B;
  
  public int C;
  
  public int D;
  
  public int E;
  
  public int F;
  
  public String G = null;
  
  public int H = 0;
  
  public String[] I;
  
  public int[] J;
  
  public int K = 1;
  
  public int L = 0;
  
  public av M = null;
  
  public int N = 0;
  
  public Thread O = null;
  
  public cv P = null;
  
  public String Q = null;
  
  public int R;
  
  public Form S = null;
  
  public TextField T = null;
  
  public dh(dh paramdh) {
    this.e = paramdh;
    this.d = (Displayable)paramdh;
    d();
  }
  
  public dh(aw paramaw, Displayable paramDisplayable) {
    this.c = paramaw;
    if (paramDisplayable == null) {
      this.d = (Displayable)paramaw;
    } else {
      this.d = paramDisplayable;
    } 
    d();
  }
  
  private void d() {
    setFullScreenMode(true);
    setCommandListener(this);
  }
  
  private void e() throws Exception {
    if (this.h != null) {
      byte[] arrayOfByte = null;
      if (this.i == null) {
        arrayOfByte = cx.g(this.h);
      } else {
        int i;
        if ((i = this.i.a(this.h, false)) == -1)
          throw new Exception("Entry not found"); 
        arrayOfByte = new byte[this.i.b(i)];
        this.i.e(i);
        this.i.a(arrayOfByte, 0, arrayOfByte.length);
        this.i.e();
        this.i.b();
      } 
      if (x.r != 0 && arrayOfByte.length > x.r * 1024)
        throw new Exception(bn.eF); 
      if (this.K == 2) {
        this.G = am.a(arrayOfByte);
        return;
      } 
      if (this.K == 3) {
        this.G = am.b(arrayOfByte);
        return;
      } 
      this.G = new String(arrayOfByte, "UTF-8");
    } 
  }
  
  public final void a() {
    try {
      e();
      try {
        this.a.b();
        this.a.a(x.ao);
      } catch (Exception exception) {
        this.a.c();
      } catch (Error error) {
        this.a.c();
      } 
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
      return;
    } catch (Exception exception) {
      cx.a(false);
      cx.a(bn.eq, exception.toString() + " : " + bn.t + this.h, this.d);
      return;
    } catch (Error error) {
      cx.a(false);
      cx.a(bn.eq, error.toString() + " : " + bn.t + this.h, this.d);
      return;
    } 
  }
  
  public final void paint(Graphics paramGraphics) {
    if (!this.b) {
      this.b = true;
      this.z = cx.a(this);
      this.A = cx.b(this);
      if (x.N)
        this.A -= aw.l.getHeight(); 
      this.f = aw.h;
      this.g = this.f.getGraphics();
      this.C = this.a.a;
      this.D = this.C;
      this.B = (this.A - this.D) / this.C;
      this.E = this.z - 5;
      this.F = this.B * this.C;
      this.I = new String[this.B];
      this.J = new int[this.B];
      j();
    } 
    if (x.p == 0) {
      paramGraphics.drawImage(this.f, 0, 0, 20);
      return;
    } 
    if (x.p == 1) {
      Sprite sprite1;
      (sprite1 = new Sprite(this.f)).setPosition(getWidth() - 1, 0);
      sprite1.setTransform(5);
      sprite1.paint(paramGraphics);
      return;
    } 
    Sprite sprite;
    (sprite = new Sprite(this.f)).setPosition(0, getHeight() - 1);
    sprite.setTransform(6);
    sprite.paint(paramGraphics);
  }
  
  public final void feyReleased(int paramInt) {
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    String str;
    if ((str = cx.b(cx.a(this, paramInt))).equals("BACK")) {
      if (this.L == 0) {
        c();
        return;
      } 
      this.L = 0;
      j();
      repaint();
      return;
    } 
    if (paramInt == 53 && this.L == 0) {
      if (this.o) {
        m();
        return;
      } 
    } else if ((paramInt == 52 || i == 8) && this.L == 0) {
      if (this.o) {
        l();
        return;
      } 
    } else {
      if (paramInt == 55 && this.L == 0) {
        if (this.q == null) {
          this.q = new Form(bn.dF);
          this.r = new TextField(bn.dG, t, 256, 0);
          this.q.append((Item)this.r);
          this.y = new ChoiceGroup(null, 2);
          this.y.append(bn.dI, null);
          this.y.append(bn.dK, null);
          this.q.append((Item)this.y);
          this.s = new TextField(bn.dL, u, 256, 0);
          this.q.append((Item)this.s);
          this.q.addCommand(new Command(bn.eO, 4, 1));
          this.q.addCommand(new Command(bn.eN, 2, 1));
        } 
        this.p = true;
        this.q.setCommandListener(this);
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.q);
        return;
      } 
      this.N = 0;
      if (this.P != null)
        this.P.a = true; 
      this.O = null;
      System.gc();
    } 
  }
  
  public final void a(cv paramcv) {
    try {
      boolean bool = false;
      byte b = 0;
      while (this.N != 0) {
        if (!paramcv.a) {
          if (this.N == 2) {
            this.x = -1;
            h();
          } else if (this.N == 5) {
            this.x = -1;
            i();
          } else if (this.N == 1) {
            this.x = -1;
            a(true);
          } else if (this.N == 6) {
            this.x = -1;
            b(true);
          } else if (this.N == 56) {
            if (t.length() > 0) {
              if (!n())
                return; 
            } else {
              break;
            } 
          } 
          repaint();
          if (bool) {
            Thread.sleep(((b++ < 10) ? x.l : ((b++ < 30) ? (x.l / 2) : ((b++ < 50) ? (x.l / 4) : 1L))));
            continue;
          } 
          Thread.sleep(x.k);
          bool = true;
          continue;
        } 
        return;
      } 
      return;
    } catch (Exception exception) {}
  }
  
  private void a(int paramInt) {
    this.N = paramInt;
    this.P = new cv();
    this.O = new aj(this);
    this.O.start();
    Thread.yield();
  }
  
  private void f() {
    this.M = new av(this.g, this.a);
    this.M.a(bn.dB, bn.dn, bn.an, 0);
    this.L = 1;
    repaint();
  }
  
  public final void feyPressed(int paramInt) {
    this.N = 0;
    if (this.P != null)
      this.P.a = true; 
    this.O = null;
    System.gc();
    int i = -1;
    try {
      i = getGameAction(paramInt);
    } catch (Exception exception) {}
    i = cx.a(i);
    paramInt = cx.b(paramInt);
    String str = cx.b(cx.a(this, paramInt));
    if (this.L == 0) {
      if (str.equals("SOFT1")) {
        c();
        return;
      } 
      if (str.equals("SOFT2") || str.equals("SOFT3")) {
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new ac(this, this.f, this.o));
        return;
      } 
      if (paramInt == 48)
        return; 
      if (paramInt == 49) {
        if (this.e == null) {
          cx.a(bn.dC, bn.dD + (this.o ? bn.dE : ""), this);
          return;
        } 
      } else if (paramInt == 57) {
        this.x = -1;
        int j = this.H;
        this.H = this.G.length();
        h();
        if (this.H < j) {
          this.H = j;
        } else {
          j();
          repaint();
          return;
        } 
      } else if (paramInt == 51) {
        this.x = -1;
        if (this.H > 0) {
          this.H = 0;
          j();
          repaint();
          return;
        } 
      } else if (paramInt != 54) {
        if (paramInt == 50)
          return; 
        if (paramInt == 52)
          return; 
        if (paramInt == 56) {
          a(paramInt);
          return;
        } 
        if (paramInt == 53)
          return; 
        if (paramInt == 55)
          return; 
        if (i == 2 || i == 5 || i == 1 || i == 6) {
          a(i);
          return;
        } 
      } 
    } else if (this.L == 1) {
      if (str.equals("SOFT1")) {
        this.L = 0;
        j();
        repaint();
        a(this.K, true);
        return;
      } 
      if (str.equals("SOFT2") || str.equals("SOFT3")) {
        cx.a();
        return;
      } 
      if (paramInt == 48) {
        this.L = 0;
        j();
        repaint();
        return;
      } 
    } else {
      if ((this.L == 2 || this.L == 3) && !str.equals("BACK")) {
        this.L = 0;
        j();
        repaint();
        return;
      } 
      if (this.L == 4) {
        if (paramInt == 48) {
          this.L = 0;
          j();
          repaint();
          return;
        } 
        if (paramInt == 49) {
          g();
          n();
          return;
        } 
        if (paramInt == 50) {
          byte b = 1;
          g();
          while (true) {
            int j;
            if (v) {
              j = this.G.indexOf(t, (this.x >= 0) ? (this.x + 1) : this.H);
            } else {
              j = this.G.toLowerCase().indexOf(t, (this.x >= 0) ? (this.x + 1) : this.H);
            } 
            if (j >= 0) {
              b++;
              this.x = j;
              this.G = this.G.substring(0, this.x) + u + this.G.substring(this.x + t.length(), this.G.length());
              continue;
            } 
            j();
            this.M = new av(this.g, this.a);
            this.M.a(bn.dM + b, 0);
            this.L = 3;
            repaint();
            return;
          } 
        } 
        if (paramInt == 51)
          n(); 
      } 
    } 
  }
  
  private void g() {
    this.G = this.G.substring(0, this.x) + u + this.G.substring(this.x + t.length(), this.G.length());
    j();
    repaint();
    this.k = true;
  }
  
  private void h() {
    if (this.H == 0)
      return; 
    for (byte b = 0; b < this.B; b++)
      a(false); 
    j();
  }
  
  private void i() {
    for (byte b = 0; b < this.B; b++)
      b(false); 
    j();
  }
  
  private void a(boolean paramBoolean) {
    int i = this.H;
    if (this.H == 0)
      return; 
    int j = this.H;
    boolean bool = false;
    while (j > 0) {
      char c;
      if ((c = this.G.charAt(--j)) == '\n') {
        if (--j > 0 && (c = this.G.charAt(j)) == '\r')
          j--; 
      } else if (c == '\r' && --j > 0 && (c = this.G.charAt(j)) == '\n') {
        j--;
      } 
      while (j > 0) {
        if ((c = this.G.charAt(j)) == '\r' || c == '\n') {
          j++;
          bool = true;
          break;
        } 
        j--;
      } 
      if (bool)
        break; 
    } 
    Vector vector;
    if ((vector = b(j, this.H)).size() > 0) {
      mc/ak mc/ak;
      j = (mc/ak = (mc/ak)vector.elementAt(vector.size() - 1)).b;
    } 
    this.H = j;
    if (paramBoolean && i != this.H) {
      boolean bool1 = true;
      try {
        k();
        bool1 = false;
      } catch (Exception exception) {
      
      } catch (Error error) {}
      if (bool1)
        j(); 
    } 
  }
  
  private void b(boolean paramBoolean) {
    int i = this.H;
    int[] arrayOfInt1 = new int[4];
    int j = this.H;
    int k = 0;
    int[] arrayOfInt2 = new int[1];
    int m = this.G.length();
    while (0 < this.B && j < m) {
      char c;
      if ((c = this.G.charAt(j)) == '\r') {
        if (++j < m && (c = this.G.charAt(j)) == '\n')
          j++; 
        break;
      } 
      if (c == '\n') {
        if (++j < m && (c = this.G.charAt(j)) == '\r')
          j++; 
        break;
      } 
      String str = a(j, arrayOfInt1);
      if (arrayOfInt1[0] > this.E - k && k > 0)
        break; 
      k += this.a.a(this.g, str, k, this.D + 0 * this.C, this.E - k, x.ao, arrayOfInt2);
      if (arrayOfInt2[0] < str.length()) {
        j += arrayOfInt2[0];
        break;
      } 
      j += arrayOfInt2[0];
    } 
    this.H = j;
    if (paramBoolean && i != this.H) {
      boolean bool = true;
      try {
        k();
        bool = false;
      } catch (Exception exception) {
      
      } catch (Error error) {}
      if (bool)
        j(); 
    } 
  }
  
  private int b(int paramInt) {
    for (byte b1 = 0; b1 < this.B; b1++) {
      this.I[b1] = "";
      this.J[b1] = -1;
    } 
    int[] arrayOfInt1 = new int[4];
    byte b2 = 0;
    int i = 0;
    int[] arrayOfInt2 = new int[1];
    int j = this.G.length();
    this.J[0] = paramInt;
    while (b2 < this.B && paramInt < j) {
      char c;
      if ((c = this.G.charAt(paramInt)) == '\r') {
        if (++paramInt < j && (c = this.G.charAt(paramInt)) == '\n')
          paramInt++; 
        b2++;
        i = 0;
        continue;
      } 
      if (c == '\n') {
        if (++paramInt < j && (c = this.G.charAt(paramInt)) == '\r')
          paramInt++; 
        b2++;
        i = 0;
        continue;
      } 
      if (this.J[b2] == -1)
        this.J[b2] = paramInt; 
      String str = a(paramInt, arrayOfInt1);
      if (arrayOfInt1[0] > this.E - i && i > 0) {
        b2++;
        i = 0;
        continue;
      } 
      i += this.a.a(str, this.E - i, arrayOfInt2);
      this.I[b2] = this.I[b2] + str.substring(0, arrayOfInt2[0]);
      if (arrayOfInt2[0] < str.length()) {
        paramInt += arrayOfInt2[0];
        b2++;
        i = 0;
        continue;
      } 
      paramInt += arrayOfInt2[0];
    } 
    return paramInt;
  }
  
  private Vector b(int paramInt1, int paramInt2) {
    Vector vector = new Vector();
    for (byte b1 = 0; b1 < this.B; b1++) {
      this.I[b1] = "";
      this.J[b1] = -1;
    } 
    int[] arrayOfInt1 = new int[4];
    byte b2 = 0;
    int i = 0;
    int[] arrayOfInt2 = new int[1];
    mc/ak mc/ak;
    (mc/ak = new mc/ak(this)).b = paramInt1;
    byte b3 = 0;
    int j = this.G.length();
    while (true) {
      if (paramInt1 >= j || (paramInt2 >= 0 && paramInt1 >= paramInt2)) {
        b2++;
      } else {
        char c;
        if ((c = this.G.charAt(paramInt1)) == '\r') {
          if (++paramInt1 < j && (c = this.G.charAt(paramInt1)) == '\n')
            paramInt1++; 
          b2++;
          i = 0;
          continue;
        } 
        if (c == '\n') {
          if (++paramInt1 < j && (c = this.G.charAt(paramInt1)) == '\r')
            paramInt1++; 
          b2++;
          i = 0;
          continue;
        } 
        String str = a(paramInt1, arrayOfInt1);
        if (arrayOfInt1[0] > this.E - i && i > 0) {
          b2++;
          i = 0;
          continue;
        } 
        if (b3 != b2) {
          b3 = b2;
          vector.addElement(mc/ak);
          (mc/ak = new mc/ak(this)).b = paramInt1;
        } 
        i += this.a.a(str, this.E - i, arrayOfInt2);
        mc/ak.a += str.substring(0, arrayOfInt2[0]);
        if (arrayOfInt2[0] < str.length()) {
          paramInt1 += arrayOfInt2[0];
          b2++;
          i = 0;
          continue;
        } 
        paramInt1 += arrayOfInt2[0];
        continue;
      } 
      if (b3 != b2)
        vector.addElement(mc/ak); 
      return vector;
    } 
  }
  
  private void j() {
    k();
  }
  
  private void k() {
    if (!this.b || this.G == null)
      return; 
    b(this.H);
    String str1 = bn.bx;
    if (this.K == 2) {
      str1 = bn.by;
    } else if (this.K == 3) {
      str1 = bn.bz;
    } 
    String str2;
    if (!(str2 = (this.j != null) ? this.j : (cx.c(this.h) + (this.k ? " *" : "") + " " + str1)).equals(this.Q)) {
      this.g.setColor(x.ap);
      this.g.fillRect(0, 0, this.z, this.a.a);
      this.a.b(this.g, str2, 0, 0, this.z - 5, x.aq, null);
      this.Q = str2;
    } 
    this.g.setColor(x.an);
    this.g.fillRect(0, this.a.a, this.z, this.A - this.a.a);
    int i;
    for (i = 0; i < this.B; i++) {
      this.a.a(this.g, this.I[i], 0, this.D + i * this.C, 0, x.ao, null);
      if (i == 0 && this.x >= 0) {
        String str = this.G.substring(this.x, this.x + t.length());
        int j = this.a.d(this.G.substring(this.H, this.x));
        this.g.setColor(x.ap);
        this.g.fillRect(j, this.D, this.a.e(str), this.C);
        this.a.b(this.g, str, j, this.D, this.E - j, x.aq, null);
      } 
    } 
    this.g.setColor(12303291);
    i = this.G.length();
    this.g.fillRect(this.z - 3, this.D, 3, (this.A - this.D) * this.H / ((i == 0) ? 1 : i));
    this.g.setColor(3158064);
    this.g.fillRect(this.z - 3, this.D + (this.A - this.D) * this.H / ((i == 0) ? 1 : i), 3, this.A);
  }
  
  private String a(int paramInt, int[] paramArrayOfint) {
    paramArrayOfint[0] = 0;
    paramArrayOfint[1] = 0;
    paramArrayOfint[2] = 0;
    paramArrayOfint[3] = 0;
    int i;
    char c;
    for (i = paramInt; i < this.G.length() && (c = this.G.charAt(i)) != ' ' && c != '\r' && c != '\n'; i++)
      paramArrayOfint[0] = paramArrayOfint[0] + this.a.b(c); 
    paramArrayOfint[1] = i - paramInt;
    byte b = 0;
    while (i < this.G.length() && this.G.charAt(i) == ' ') {
      b++;
      i++;
    } 
    paramArrayOfint[2] = b * this.a.b(32);
    paramArrayOfint[3] = b;
    return this.G.substring(paramInt, i);
  }
  
  private void l() {
    try {
      this.R = b(this.H);
      if (this.R - this.H > x.s)
        this.R = this.H + x.s; 
      String str = this.G.substring(this.H, this.R);
      this.n = new TextBox(cx.c(this.h), str, x.s, 0);
      this.n.setCommandListener(this);
      this.n.addCommand(new Command(bn.eO, 4, 1));
      this.n.addCommand(new Command(bn.eN, 2, 1));
      this.n.addCommand(new Command(bn.dP, 8, 1));
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.n);
      this.l = 1;
      return;
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString(), (Displayable)this);
      return;
    } 
  }
  
  private void m() {
    try {
      this.R = this.G.length();
      String str = this.G.substring(this.H, this.R);
      this.n = new TextBox(cx.c(this.h), str, str.length() + 128, 0);
      this.n.setCommandListener(this);
      this.n.addCommand(new Command(bn.eO, 4, 1));
      this.n.addCommand(new Command(bn.eN, 2, 1));
      this.n.addCommand(new Command(bn.dP, 8, 1));
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.n);
      this.l = 1;
      return;
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString(), (Displayable)this);
      return;
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.l > 0) {
      if (paramCommand.getCommandType() == 4) {
        this.x = -1;
        if (this.l == 1) {
          this.G = this.G.substring(0, this.H) + this.n.getString() + this.G.substring(this.R, this.G.length());
        } else {
          this.G = this.n.getString();
        } 
        if (this.H > this.G.length())
          this.H = this.G.length(); 
        this.n = null;
        this.k = true;
        j();
        repaint();
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
      } else if (paramCommand.getCommandType() == 2) {
        this.n = null;
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
      } else if (paramCommand.getLabel() == bn.dP) {
        this.n.setString("");
        return;
      } 
      this.l = 0;
      return;
    } 
    if (this.m) {
      if (paramCommand.getCommandType() == 4) {
        String str;
        if ((str = this.T.getString().trim()).length() == 0) {
          cx.a(bn.eq, bn.bX, (Displayable)this.S);
          return;
        } 
        this.h = str;
        a(this.K, false);
        return;
      } 
      this.S = null;
      this.T = null;
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
      return;
    } 
    if (this.p) {
      if (paramCommand.getCommandType() == 4 && this.r.getString().length() > 0) {
        n();
      } else if (paramCommand.getCommandType() == 2) {
        this.r.setString(t);
        this.s.setString(u);
      } 
      this.p = false;
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
    } 
  }
  
  private boolean n() {
    try {
      int i;
      String str = (this.r != null) ? this.r.getString() : t;
      u = (this.s != null) ? this.s.getString() : u;
      t = str;
      v = (this.y != null) ? this.y.isSelected(0) : v;
      w = (this.y != null) ? this.y.isSelected(1) : w;
      if (!v)
        str = str.toLowerCase(); 
      if (v) {
        i = this.G.indexOf(str, (this.x >= 0) ? (this.x + 1) : this.H);
      } else {
        i = this.G.toLowerCase().indexOf(str, (this.x >= 0) ? (this.x + 1) : this.H);
      } 
      if (i >= 0) {
        this.H = i;
        char c;
        if (i > 0 && (c = this.G.charAt(i - 1)) != '\r' && c != '\n') {
          a(false);
          b(this.H);
          if (i == this.J[1])
            b(false); 
        } 
        this.x = i;
        j();
        repaint();
        if (!w)
          return true; 
        this.M = new av(this.g, this.a);
        this.M.a(bn.dN, bn.dO, 0);
        this.L = 4;
        return false;
      } 
      this.M = new av(this.g, this.a);
      this.M.a("\"" + t + "\"", bn.dH, 0);
      this.L = 3;
      repaint();
    } catch (Exception exception) {
      cx.a(bn.eq, exception.toString(), (Displayable)this);
    } catch (Error error) {
      cx.a(bn.eq, error.toString(), (Displayable)this);
    } 
    return false;
  }
  
  public final void b() {
    this.m = true;
    this.S = new Form(bn.cn);
    this.T = new TextField(null, this.h, 256, 0);
    this.S.append((Item)this.T);
    this.S.setCommandListener(this);
    this.S.addCommand(new Command(bn.eO, 4, 1));
    this.S.addCommand(new Command(bn.eN, 2, 1));
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.S);
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    if (this.i != null) {
      b(paramInt, paramBoolean);
      return;
    } 
    m m = null;
    DataOutputStream dataOutputStream = null;
    try {
      byte[] arrayOfByte = null;
      if (paramInt == 2) {
        arrayOfByte = am.b(this.G);
      } else if (paramInt == 3) {
        arrayOfByte = am.c(this.G);
      } else {
        arrayOfByte = this.G.getBytes("UTF-8");
      } 
      boolean bool = false;
      (m = new m()).a(this.h);
      if (m.p()) {
        m.o();
        m.d();
        m.a(this.h);
      } else {
        bool = true;
      } 
      m.n();
      m.b(true);
      m.c(true);
      m.a(false);
      (dataOutputStream = m.c()).write(arrayOfByte, 0, arrayOfByte.length);
      dataOutputStream.close();
      m.d();
      if (bool || this.S != null) {
        this.c.e[this.c.f].d();
        this.c.e[this.c.f].a(this.h);
        this.c.e[this.c.f].e();
        if ((this.c.e[this.c.f]).s.equals((this.c.e[this.c.f]).s)) {
          this.h = this.c.e[this.c.g].b();
          this.c.e[this.c.g].d();
          this.c.e[this.c.g].a(this.h);
          this.c.e[this.c.g].e();
        } 
      } 
      this.S = null;
      this.T = null;
      this.k = false;
      this.Q = null;
      this.K = paramInt;
      if (paramBoolean) {
        this.a.c();
        cx.a();
      } else {
        j();
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
        return;
      } 
    } catch (Exception exception) {
      try {
        if (dataOutputStream != null)
          dataOutputStream.close(); 
      } catch (Exception exception1) {}
      try {
        if (m != null)
          m.d(); 
      } catch (Exception exception1) {}
      cx.a(bn.eq, exception.getMessage(), (this.S != null) ? (Displayable)this.S : (Displayable)this);
    } 
  }
  
  private void b(int paramInt, boolean paramBoolean) {
    try {
      byte[] arrayOfByte = null;
      if (paramInt == 2) {
        arrayOfByte = am.b(this.G);
      } else if (paramInt == 3) {
        arrayOfByte = am.c(this.G);
      } else {
        arrayOfByte = this.G.getBytes("UTF-8");
      } 
      this.M = new av(this.g, this.a);
      this.M.a(bn.dJ, "", 0);
      this.L = 3;
      repaint();
      serviceRepaints();
      int i;
      if ((i = this.i.f()) == 0 && (i = this.i.a(arrayOfByte, this.h, null, true)) == 0 && (i = this.i.a((aw)null)) == 0 && (i = this.i.g()) == 0) {
        this.i.c();
        this.c.a(dd.c(this.i.a), this.i.a, true, false);
        this.i.a(this.i.a);
      } 
      if (i != 0) {
        this.i.c();
        this.i.a(this.i.a);
      } 
      this.k = false;
      this.Q = null;
      this.K = paramInt;
      if (paramBoolean) {
        this.a.c();
        cx.a();
      } else {
        j();
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this);
        return;
      } 
    } catch (Exception exception) {
      cx.a(bn.eq, exception.getMessage(), (this.S != null) ? (Displayable)this.S : (Displayable)this);
    } 
  }
  
  public final void c() {
    if (!this.k) {
      if (this.c != null) {
        this.a.c();
        cx.a();
        return;
      } 
      if (this.e != null) {
        this.e.Q = null;
        this.e.j();
      } else {
        this.a.c();
        cx.a(false);
      } 
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent(this.d);
      return;
    } 
    f();
  }
  
  public final void pointerPressed(int paramInt1, int paramInt2) {
    if (!x.N)
      return; 
    if (a(paramInt1, paramInt2))
      return; 
    if (paramInt2 >= this.D) {
      if ((paramInt2 -= this.D) < this.F / 2) {
        a(1);
        return;
      } 
      a(6);
    } 
  }
  
  public final void pointerReleased(int paramInt1, int paramInt2) {
    if (!x.N)
      return; 
    feyReleased(0);
  }
  
  class mc/ak {
    public String a = new String();
    
    public int b = 0;
    
    public mc/ak(dh this$0) {}
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\dh.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */