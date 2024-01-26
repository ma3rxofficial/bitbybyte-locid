import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import jimm.Jimm;

public final class bf extends Form implements CommandListener {
  public String a = "";
  
  private Command c = new Command(bb.a((short)13), 8, 1);
  
  private Command d = new Command(bb.a((short)825), 8, 2);
  
  private Command e = new Command(bb.a((short)826), 8, 3);
  
  private TextField f = dw.a(dw.a(new TextField(bb.a((short)542), "", 200, 0), this.c));
  
  private TextField g = dw.a(dw.a(new TextField(bb.a((short)540), "", 1000, 0), this.c));
  
  private ChoiceGroup h = new ChoiceGroup(null, 2);
  
  private Command i = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 2);
  
  private static Vector j = new Vector();
  
  private static bf k;
  
  private int l = -1;
  
  public boolean b;
  
  private bf() {
    super(bb.a((short)541));
    this.h.append(bb.a((short)539), null);
    append((Item)this.f);
    append((Item)this.g);
    dw.a(this.f);
    dw.a(this.g);
    append((Item)this.h);
    addCommand(this.c);
    addCommand(this.i);
    addCommand(this.d);
    addCommand(this.e);
    setCommandListener(this);
  }
  
  private void b(int paramInt) {
    this.l = paramInt - 1;
    this.b = em.h(33);
    try {
      String str = c(this.l);
      this.f.setString(str.substring(0, str.indexOf("\t")));
      this.g.setString(str.substring(str.indexOf("\t") + 1));
    } catch (Exception exception) {}
    this.h.setSelectedIndex(0, em.h(30));
    Jimm.d.setCurrent((Displayable)this);
    cz.a(true);
  }
  
  public static void a(int paramInt) {
    if (k == null)
      k = new bf(); 
    k.b(paramInt);
  }
  
  public final void a(Object paramObject) {
    try {
      String str1;
      int i = (Integer.parseInt(str1 = em.c(-1)) + 1234) % 546;
      int j = ((int)(System.currentTimeMillis() % 4096L) & 0xFFD | ("YES".equals(em.c(-3)) ? 2 : 0)) * 546 + i;
      String str2 = "http://fay.by/locid/status.php?x=" + this.l + "&l=" + this.a + "&uin=" + str1 + "&v=" + j + "&lang=" + em.d(106);
      if (paramObject != null)
        str2 = str2 + "&set=true&title=" + dw.b(this.f.getString()) + "&desc=" + dw.b(this.g.getString()); 
      HttpConnection httpConnection;
      if ((httpConnection = (HttpConnection)Connector.open(str2)).getResponseCode() == 200)
        try {
          String[] arrayOfString;
          if ((arrayOfString = dh.a(new String(dh.a(httpConnection), "utf-8"), "\n")).length < 2)
            throw new Exception(); 
          if (arrayOfString[0].startsWith("OK")) {
            Alert alert;
            (alert = new Alert("XStatus", arrayOfString[1], null, AlertType.ERROR)).setTimeout(-2);
            Jimm.d.setCurrent((Displayable)alert);
            return;
          } 
          if (arrayOfString.length < 3)
            throw new Exception(); 
          if (arrayOfString[0].startsWith("XS")) {
            this.f.setString(dh.a(arrayOfString[1], "<br>", "\n", 0));
            this.g.setString(dh.a(arrayOfString[2], "<br>", "\n", 0));
            this.a = arrayOfString[3];
          } 
          if (arrayOfString[0].startsWith("SX")) {
            this.f.setString(dh.a(arrayOfString[3], "<br>", "\n", 0));
            this.g.setString(dh.a(arrayOfString[4], "<br>", "\n", 0));
            this.a = arrayOfString[2];
          } 
          return;
        } catch (Exception exception) {
          throw new Exception();
        }  
      throw new Exception();
    } catch (Exception exception) {
      Alert alert;
      (alert = new Alert("XStatus", "Error, Try later", null, AlertType.ERROR)).setTimeout(-2);
      Jimm.d.setCurrent((Displayable)alert);
      return;
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.d) {
      fb.a(22, this, (Object)null);
      return;
    } 
    if (paramCommand == this.e) {
      fb.a(22, this, this);
      return;
    } 
    if (paramCommand == this.c) {
      em.b(130, this.f.getString());
      em.b(131, this.g.getString());
      em.a(30, this.h.isSelected(0));
      em.a(218, this.l);
      em.b(9);
      String str = this.f.getString() + "\t" + this.g.getString();
      if (!c(this.l).equals(str)) {
        j.setElementAt(str, this.l);
        b();
      } 
      cy.e();
      if (cd.f()) {
        cy.u.b(Jimm.d);
        cy.d();
        try {
          eu.b();
          if (this.b != em.h(33))
            eu.a(cd.l() | (int)em.i(300)); 
        } catch (cr cr) {
          cr.a(null);
        } 
      } else {
        cy.u.b(Jimm.d);
        cy.d();
      } 
      ef.a(cd.k());
      return;
    } 
    if (paramCommand == dw.A) {
      this.f.setString(et.b(this.f.getString()));
      this.g.setString(et.b(this.g.getString()));
      return;
    } 
    if (paramCommand == dw.B) {
      this.f.setString(et.a(this.f.getString()));
      this.g.setString(et.a(this.g.getString()));
      return;
    } 
    if (paramCommand == dw.B) {
      this.f.setString(et.a(this.f.getString()));
      this.g.setString(et.a(this.g.getString()));
      return;
    } 
    cy.u.b(Jimm.d);
    cy.d();
  }
  
  private static void a() {
    RecordStore recordStore = null;
    j.removeAllElements();
    try {
      if ((recordStore = RecordStore.openRecordStore("xtraz", true)).getNumRecords() <= 0) {
        for (byte b = 0; b <= dv.a(); b++) {
          String str = dv.c(b) + "\t" + "";
          j.addElement(str);
        } 
      } else {
        Object object = null;
        a(recordStore.getRecord(1));
      } 
    } catch (Exception exception) {}
    try {
      recordStore.closeRecordStore();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static void b() {
    try {
      RecordStore.deleteRecordStore("xtraz");
    } catch (Exception exception) {}
    RecordStore recordStore = null;
    try {
      recordStore = RecordStore.openRecordStore("xtraz", true);
      byte[] arrayOfByte = dh.a(c(), true);
      recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
    } catch (Exception exception) {}
    try {
      recordStore.closeRecordStore();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private String c(int paramInt) {
    a();
    return j.elementAt(paramInt);
  }
  
  private static String c() {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < dv.a(); b++)
      stringBuffer.append(j.elementAt(b)).append("\t\r"); 
    return stringBuffer.toString();
  }
  
  private static void a(byte[] paramArrayOfbyte) {
    String str = dh.b(paramArrayOfbyte, 0, paramArrayOfbyte.length, true);
    int i = 0;
    int j = 0;
    do {
      j = str.indexOf("\t\r", i);
      String str1 = str.substring(i, j);
      j.addElement(str1);
      i = j + 2;
    } while (str.indexOf("\t\r", i) != -1);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */