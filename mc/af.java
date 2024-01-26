package mc;

import MiniCommander;
import favax.microedition.lcdui.Display;
import favax.microedition.midlet.MIDlet;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public final class af extends Form implements CommandListener {
  public aw a;
  
  public TextField b = new TextField(bn.dp, x.F, 255, 0);
  
  public ChoiceGroup c = new ChoiceGroup(bn.dq, 1);
  
  public String d;
  
  public af(aw paramaw) {
    super(bn.do);
    this.a = paramaw;
    try {
      a();
      return;
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      return;
    } 
  }
  
  private void a() throws Exception {
    setCommandListener(this);
    this.c.append(bn.dr, null);
    this.c.append(bn.ds, null);
    this.c.append(bn.dt, null);
    this.c.append(bn.du, null);
    this.c.setSelectedIndex(x.E, true);
    append((Item)this.b);
    append((Item)this.c);
    addCommand(new Command(bn.eN, 2, 1));
    addCommand(new Command(bn.eO, 4, 1));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getCommandType() == 2) {
      this.a.e(-1);
      this.a.repaint();
      Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
      return;
    } 
    if (paramCommand.getCommandType() == 4)
      try {
        this.d = this.b.getString();
        this.d = this.d.trim();
        if (this.d.length() == 0)
          throw new Exception(bn.dv); 
        x.E = this.c.getSelectedIndex();
        x.F = this.d;
        Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)this.a);
        ao ao;
        (ao = new ao(this)).setPriority(1);
        ao.start();
        return;
      } catch (Exception exception) {
        cx.a(bn.eq, exception.toString(), (Displayable)this);
      }  
  }
  
  private void a(String paramString) {
    this.a.y = true;
    this.a.x[0] = false;
    this.a.z = 14;
    cx.a(bn.dw, "", "", 4);
    try {
      Thread.sleep(50L);
    } catch (InterruptedException interruptedException) {}
    String str = (this.a.e[this.a.f]).s;
    Vector vector = new Vector();
    if (x.E == 0) {
      str = "";
    } else if (x.E == 1 && str.length() > 0) {
      str = this.a.e[this.a.f].n();
    } 
    a(str, paramString.equals("*.*") ? "*" : paramString, vector);
    this.a.y = false;
    this.a.z = 0;
    if (vector.size() == 0) {
      cx.a((String)null, bn.dx, (Displayable)this);
      return;
    } 
    this.a.e(-1);
    this.a.repaint();
    Display.getDisplay((MIDlet)MiniCommander.a).setCurrent((Displayable)new bs(this.a, aw.h, vector));
  }
  
  private void a(String paramString1, String paramString2, Vector paramVector) {
    int i = paramVector.size();
    try {
      String[] arrayOfString;
      if (paramString1.length() == 0) {
        arrayOfString = m.e();
      } else {
        m m;
        (m = new m()).a(paramString1, 1);
        arrayOfString = m.a(paramString1, true);
      } 
      byte b = 0;
      while (b < arrayOfString.length) {
        if (!this.a.x[0]) {
          String str2;
          String str1;
          if ((str1 = arrayOfString[b]).endsWith("/")) {
            str2 = str1.substring(cx.e(str1).length(), str1.length() - 1);
          } else {
            str2 = cx.c(str1);
          } 
          if (cx.a(str2, paramString2))
            paramVector.addElement(str1); 
          if (str1.endsWith("/") && x.E != 3)
            a(str1, paramString2, paramVector); 
          if (i != paramVector.size()) {
            cx.a(bn.dw, bn.dy + String.valueOf(paramVector.size()) + bn.dz, "", 4);
            i = paramVector.size();
          } 
          b++;
          continue;
        } 
        return;
      } 
      return;
    } catch (Exception exception) {}
  }
  
  public static void a(af paramaf, String paramString) {
    paramaf.a(paramString);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\af.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */