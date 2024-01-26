package p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class PlgFRBookReader2 extends Canvas implements CommandListener, Runnable {
  public boolean a = false;
  
  public String b = "";
  
  public int c = 0;
  
  public static int d = -1;
  
  public static PlgFRBookReader2 e;
  
  public boolean f = false;
  
  public int g = 1;
  
  public int h = 0;
  
  public String i = "";
  
  public Vector j = new Vector();
  
  public String k = "/";
  
  public static Command l = new Command("Back", 2, 2);
  
  public static Command m = new Command("FileList", 4, 2);
  
  public static Command n = new Command("LocidList", 4, 2);
  
  public static Command o = new Command("Help", 4, 2);
  
  public static Command p = new Command("Settings", 4, 1);
  
  public static Command q = new Command("SetColorMode", 4, 3);
  
  public static Command r = new Command("NormalMode", 4, 3);
  
  public PlgFRStyles s = new PlgFRStyles(this.g);
  
  public static PlgFRBook t;
  
  public Font u;
  
  private boolean v = true;
  
  private PlgFRIntegratedEnv w;
  
  private int x;
  
  private int y;
  
  private Timer z = new Timer();
  
  private TimerTask A;
  
  public PlgFRBookReader2(PlgFRIntegratedEnv paramPlgFRIntegratedEnv) {
    this.w = paramPlgFRIntegratedEnv;
    e = this;
    System.out.println("FR");
    addCommand(l);
    addCommand(m);
    addCommand(n);
    addCommand(o);
  }
  
  public final void a() {
    d = 0;
    d();
    if (this.i.equals(""))
      this.i = "/all.fr1"; 
    t = new PlgFRBook(this.i, 0, 0, getWidth(), getHeight() - 20, this.s);
    setCommandListener(this);
    this.u = Font.getDefaultFont();
    setFullScreenMode(this.f);
    t.a(0, 0, getWidth(), g(), this.c);
    this.s.a(this.g);
    t.a(this);
    b();
  }
  
  public final void b() {
    this.w.a();
  }
  
  private int g() {
    return getHeight() - (this.v ? (this.u.getHeight() - 1) : 0);
  }
  
  public final void c() {
    if (t != null)
      try {
        String str;
        RecordStore recordStore = RecordStore.openRecordStore(str = "FR", true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream;
        (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeInt(0);
        if (!t.a) {
          dataOutputStream.writeUTF(t.x);
        } else {
          dataOutputStream.writeUTF(t.x + "#" + t.aB + ":");
        } 
        dataOutputStream.writeBoolean(this.f);
        dataOutputStream.writeInt(this.g);
        dataOutputStream.writeInt(this.h);
        dataOutputStream.writeInt(this.c);
        dataOutputStream.writeBoolean(this.v);
        dataOutputStream.flush();
        byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
        if (recordStore.getNumRecords() > 0) {
          recordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
        } else {
          recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } 
        recordStore.closeRecordStore();
      } catch (RecordStoreException recordStoreException2) {
        RecordStoreException recordStoreException1;
        (recordStoreException1 = null).printStackTrace();
      } catch (IOException iOException2) {
        IOException iOException1;
        (iOException1 = null).printStackTrace();
      }  
    if (t != null)
      t.e(); 
  }
  
  public final void d() {
    try {
      String str;
      RecordStore recordStore;
      byte[] arrayOfByte = (recordStore = RecordStore.openRecordStore(str = "FR", true)).getRecord(1);
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      DataInputStream dataInputStream;
      (dataInputStream = new DataInputStream(byteArrayInputStream)).readInt();
      this.i = dataInputStream.readUTF();
      this.f = dataInputStream.readBoolean();
      this.g = dataInputStream.readInt();
      this.h = dataInputStream.readInt();
      this.c = dataInputStream.readInt();
      this.v = dataInputStream.readBoolean();
      recordStore.closeRecordStore();
      return;
    } catch (RecordStoreException recordStoreException2) {
      RecordStoreException recordStoreException1;
      (recordStoreException1 = null).printStackTrace();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public void paint(Graphics paramGraphics) {
    if (t != null) {
      t.a(paramGraphics);
      Calendar calendar;
      int i = (calendar = Calendar.getInstance()).get(11);
      int j = calendar.get(12);
      StringBuffer stringBuffer = new StringBuffer("" + (t.Z / 2000 + 1) + "/" + (t.v / 2000 + 1) + " " + this.b + " " + i + ":" + (j / 10) + (j % 10) + "  ");
      if (t.x.startsWith("file:///")) {
        stringBuffer.append(t.x.substring(7));
      } else if (t.x.startsWith("file://localhost/")) {
        stringBuffer.append(t.x.substring(16));
      } else if (t.x.startsWith("http://")) {
        stringBuffer.append(t.x.substring(7));
      } else {
        stringBuffer.append(t.x);
      } 
      if (!this.a)
        this.b = ""; 
      int k = 0;
      if (this.v) {
        paramGraphics.setColor(12303291);
        int m = this.u.getHeight();
        for (byte b = 0; b < m; b++) {
          int n = b * 30 / m;
          paramGraphics.setColor(10526880 + 65793 * n);
          if (b == m - 1)
            paramGraphics.setColor(15790320); 
          if (b == 0)
            paramGraphics.setColor(10066329); 
          paramGraphics.drawLine(0, getHeight() - b, getWidth(), getHeight() - b);
        } 
        paramGraphics.setColor(0);
        Object object = null;
      } 
      k = this.w.a(stringBuffer);
      if (this.v)
        paramGraphics.drawString(stringBuffer.toString(), 1 + k, getHeight() + 1, 36); 
    } 
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == l) {
      if (t != null)
        t.e(); 
      if (this.j.size() > 1) {
        this.j.removeElement(this.j.lastElement());
        if (t == null) {
          t = new PlgFRBook(this.j.lastElement(), 0, 0, getWidth(), getHeight() - 20, this.s);
        } else {
          t.c(this.j.lastElement());
        } 
        t.a(this);
      } else {
        c();
        h();
      } 
    } 
    if (paramCommand == o && t.aq >= 0) {
      t.c("/all.fr1");
      this.j.addElement("/all.fr1");
      t.a(this);
    } 
    if (paramCommand == n)
      PlgFR.b.request(43, null, null); 
    if (paramCommand == m) {
      this.k = "/";
      while (this.j.size() > 1)
        this.j.removeElement(this.j.lastElement()); 
      this.j.addElement(this.k);
      t.c(this.k);
      t.a(this);
    } 
  }
  
  public final void a(String paramString) {
    while (this.j.size() > 1)
      this.j.removeElement(this.j.lastElement()); 
    this.j.addElement(paramString);
    t.c(paramString);
    t.a(this);
  }
  
  private void h() {
    this.w.a(this);
  }
  
  public static void e() {
    if (e != null)
      e.f(); 
  }
  
  public final void f() {
    if (this.A != null)
      this.A.cancel(); 
    this.x = 0;
    this.A = null;
  }
  
  public void keyPressed(int paramInt) {
    a(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2) {
    f();
    switch (paramInt1) {
      case 49:
      case 50:
      case 51:
      case 52:
      case 54:
      case 55:
      case 56:
      case 57:
        break;
      default:
        return;
    } 
    this.x = paramInt1;
    this.y = paramInt2;
    PlgFRBookReader2 plgFRBookReader2 = this;
    this.A = new TimerTask(this, plgFRBookReader2) {
        private final Runnable a;
        
        public final void run() {
          (new Thread(this.a)).start();
        }
      };
    this.z.schedule(this.A, 500L, 111L);
  }
  
  public void run() {
    b(this.x);
    t.a(this);
  }
  
  public void keyReleased(int paramInt) {
    f();
  }
  
  public void keyRepeated(int paramInt) {}
  
  public final void a(int paramInt) {
    this.b = "";
    System.out.println("Key:" + paramInt);
    System.out.println("GAK:" + getGameAction(paramInt));
    if (this.a) {
      int i;
      switch (i = getGameAction(paramInt)) {
        case 1:
          this.c = (this.c + 1) % 3;
          i();
          this.b = "*^";
          paramInt = 0;
          break;
        case 6:
          this.v = !this.v;
          i();
          paramInt = 0;
          break;
      } 
      int j = 0;
      switch (paramInt) {
        case 57:
          j++;
        case 56:
          j++;
        case 55:
          j++;
        case 54:
          j++;
        case 53:
          j++;
        case 52:
          j++;
        case 51:
          j++;
        case 50:
          j++;
        case 49:
          this.b = "*" + ++j;
          j = t.v * j / 10;
          t.b();
          t.Z = j;
          break;
        case 42:
          this.f = !this.f;
          setFullScreenMode(this.f);
          i();
          this.b = "**";
          break;
        case 35:
          switch (this.s.a) {
            case 0:
              this.s.a = 16777215;
              break;
            case 16777215:
              this.s.a = 1;
              break;
            case 1:
              this.s.a = 2;
              break;
            case 2:
              this.s.a = 0;
              break;
            default:
              this.s.a = 0;
              break;
          } 
          this.h = this.s.a;
          this.s.a(this.g);
          c();
          this.b = "*#";
          break;
        case 48:
          this.g++;
          this.g %= 3;
          this.s.a(this.g);
          t.n();
          c();
          this.b = "*0";
          break;
      } 
      this.a = false;
      repaint();
    } else {
      int i;
      switch (i = getGameAction(paramInt)) {
        case 1:
          paramInt = 50;
          break;
        case 8:
          paramInt = 53;
          break;
        case 5:
          paramInt = 54;
          break;
        case 2:
          paramInt = 52;
          break;
        case 6:
          paramInt = 56;
          break;
      } 
      a(paramInt, i);
      b(paramInt);
    } 
    t.a(this);
  }
  
  private void b(int paramInt) {
    String str;
    int i;
    if (this.c != 0 && (i = (str = "123698741236987412369874").indexOf(paramInt)) > -1)
      if (this.c == 1) {
        paramInt = str.charAt(i + 6);
      } else {
        paramInt = str.charAt(i + 2);
      }  
    switch (paramInt) {
      case 49:
        t.b();
        return;
      case 55:
        t.b();
        t.Z = t.v - 10;
        t.p();
        return;
      case 50:
        t.k();
        return;
      case 42:
        this.a = true;
        this.b = "*";
        repaint();
        return;
      case 53:
        System.out.println("KeyFire");
        if (t.aq >= 0) {
          t.c(t.a());
          this.j.addElement(t.x);
          return;
        } 
        break;
      case 54:
      case 57:
        t.i();
        return;
      case 51:
      case 52:
        t.p();
        return;
      case 56:
        t.j();
        return;
      case 35:
        if (t != null && t.a) {
          t.e();
          if (this.j.size() > 1 && ((String)this.j.elementAt(this.j.size() - 2)).startsWith(t.x))
            this.j.removeElementAt(this.j.size() - 2); 
          t.c(t.x + "#" + (1 - t.aB) + ":");
          this.j.addElement(t.x);
          return;
        } 
        break;
      case 48:
        this.b = "0";
        c();
        h();
        break;
    } 
  }
  
  private void i() {
    t.a(0, 0, getWidth(), g(), this.c);
    c();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgFRBookReader2.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */