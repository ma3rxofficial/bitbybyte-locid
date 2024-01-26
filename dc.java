import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.rms.RecordStore;
import jimm.Jimm;

public final class dc implements bx, CommandListener {
  private static Command a = new Command(bb.a((short)9), 4, 1);
  
  private static Command b = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 6);
  
  private static Command c = new Command(bb.a((short)93), 8, 3);
  
  private static Command d = new Command(bb.a((short)217), 8, 3);
  
  private static Command e = new Command(bb.a((short)212), 8, 4);
  
  private static Command f = new Command(bb.a((short)148), 8, 5);
  
  private static Command g = new Command(bb.a((short)13), 4, 1);
  
  private static Command h = new Command(bb.a((short)13), 4, 1);
  
  private static Command i = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 2);
  
  private static be j;
  
  private static dc k;
  
  private static TextBox l;
  
  private static Vector m = new Vector();
  
  private static Object n;
  
  private static TextBox o;
  
  private static int p;
  
  public dc() {
    d();
    k = this;
  }
  
  public static void a(TextBox paramTextBox, Object paramObject) {
    n = paramObject;
    o = paramTextBox;
    p = paramTextBox.getCaretPosition();
    j = new be(null);
    j.a_(bb.a((short)482));
    j.a(dw.p, bd.Z);
    j.a(b, bd.aa);
    j.a(c, bd.ab);
    if (m.size() > 0)
      g(); 
    j.c(8);
    c();
    j.u = true;
    j.a(k);
    j.p = k;
    j.b(Jimm.d);
  }
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {}
  
  public final void a(bd parambd) {}
  
  public final void b(bd parambd) {
    a();
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == b) {
      dw.b(n);
      j = null;
    } 
    if (paramCommand == a)
      a(); 
    if (paramCommand == c) {
      l = new TextBox(bb.a((short)347), null, 1000, 0);
      l.addCommand(g);
      l.addCommand(i);
      l.setCommandListener(k);
      Jimm.d.setCurrent((Displayable)l);
    } 
    if (paramCommand == d) {
      l = new TextBox(bb.a((short)217), f(), 1000, 0);
      l.addCommand(h);
      l.addCommand(i);
      l.setCommandListener(k);
      Jimm.d.setCurrent((Displayable)l);
    } 
    if (paramCommand == g) {
      String str;
      if ((str = l.getString()).length() > 0)
        m.addElement(str); 
      i();
      g();
    } 
    if (paramCommand == e) {
      m.removeElementAt(j.A());
      i();
      if (m.size() <= 0)
        h(); 
    } 
    if (paramCommand == h) {
      String str;
      if ((str = l.getString()).length() > 0) {
        m.setElementAt(str, j.A());
      } else {
        m.removeElementAt(j.A());
      } 
      i();
    } 
    if (paramCommand == i) {
      j.b(Jimm.d);
      l = null;
    } 
    if (paramCommand == f)
      dw.a(bb.a((short)112), bb.a((short)148) + "?", 1, k, 2); 
    if (dw.a(paramCommand, 2) == 3) {
      m.removeAllElements();
      e();
      dw.b(n);
    } 
    if (dw.a(paramCommand, 2) == 4)
      j.b(Jimm.d); 
  }
  
  private static void a() {
    String str = null;
    if (j.c() != 0)
      str = f(); 
    b();
    j = null;
    dw.b(n);
    if (str != null)
      o.insert(str, p); 
  }
  
  private static void b() {
    String str = m.elementAt(j.A());
    for (int i = j.A(); i >= 1; i--) {
      String str1 = m.elementAt(i - 1);
      m.setElementAt(str1, i);
    } 
    m.setElementAt(str, 0);
    e();
  }
  
  private static void c() {
    j.q();
    j.z();
    int i = m.size();
    for (byte b = 0; b < i; b++)
      j.a(m.elementAt(b), bd.g(), 0, b).x(b); 
    j.s();
  }
  
  private static void d() {
    RecordStore recordStore = null;
    m.removeAllElements();
    try {
      int i = (recordStore = RecordStore.openRecordStore("tmpl", false)).getNumRecords();
      for (byte b = 1; b <= i; b++) {
        byte[] arrayOfByte;
        String str = dh.b(arrayOfByte = recordStore.getRecord(b), 0, arrayOfByte.length, true);
        m.addElement(str);
      } 
    } catch (Exception exception) {}
    try {
      recordStore.closeRecordStore();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static void e() {
    try {
      RecordStore.deleteRecordStore("tmpl");
    } catch (Exception exception) {}
    if (m.size() == 0)
      return; 
    RecordStore recordStore = null;
    try {
      recordStore = RecordStore.openRecordStore("tmpl", true);
      int i = m.size();
      for (byte b = 0; b < i; b++) {
        byte[] arrayOfByte = dh.a(m.elementAt(b), true);
        recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
      } 
    } catch (Exception exception) {}
    try {
      recordStore.closeRecordStore();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static String f() {
    return m.elementAt(j.A());
  }
  
  private static void g() {
    h();
    j.a(a, bd.ab);
    j.a(d, bd.ab);
    j.a(e, bd.ab);
    j.a(f, bd.ab);
  }
  
  private static void h() {
    j.b(a);
    j.b(d);
    j.b(e);
    j.b(f);
  }
  
  private static void i() {
    e();
    c();
    j.b(Jimm.d);
    l = null;
  }
  
  public final void f(int paramInt) {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */