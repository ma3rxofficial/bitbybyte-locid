package p;

import i.I;
import i.PI;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public class PlgXStatus extends PI implements CommandListener {
  private ChoiceGroup k;
  
  private Command l = new Command("ОК", 8, 0);
  
  private Command m = new Command("Назад", 2, 0);
  
  private Form n;
  
  private TextField o;
  
  private TextField p;
  
  private TextField q;
  
  private TextField r;
  
  private static Object s;
  
  public String a;
  
  public String b;
  
  public String c;
  
  public String d;
  
  public String e;
  
  public int f = 10;
  
  public int g = 60;
  
  public int h = -1;
  
  public int i = -1;
  
  public int j = 0;
  
  private PlgXStatus$Task t;
  
  public PlgXStatus() {
    s = request(13, null, new Integer(8));
  }
  
  public String getName() {
    return "Cтатус-таймер";
  }
  
  public I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(26) }null);
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    String[] arrayOfString;
    byte b;
    switch (paramInt) {
      case 2:
        this.n = new Form("XStatus v0.1");
        this.o = new TextField("Заголовок", this.a, 255, 0);
        this.p = new TextField("Текст", this.c, 255, 0);
        this.q = new TextField("Обновление, cек.", this.f + "", 3, 2);
        this.r = new TextField("Время действия, мин.", (this.g / 60) + "", 3, 2);
        arrayOfString = (String[])request(26, null, null);
        this.k = new ChoiceGroup("Доп. статус", 4);
        for (b = 0; b < arrayOfString.length; b++) {
          byte b1 = b;
          PlgXStatus plgXStatus;
          this.k.append(arrayOfString[b], ((I)(plgXStatus = this).request(14, new Object[] { s, new Integer(b1) }, null)).createImage());
        } 
        this.n.append((Item)this.o);
        this.n.append((Item)this.p);
        this.n.append((Item)this.q);
        this.n.append((Item)this.r);
        this.n.append((Item)this.k);
        this.n.addCommand(this.m);
        this.n.addCommand(this.l);
        this.n.setCommandListener(this);
        ((Display)paramObject).setCurrent((Displayable)this.n);
        break;
    } 
    return null;
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.l) {
      this.a = this.o.getString();
      this.c = this.p.getString();
      this.f = Integer.parseInt(this.q.getString());
      this.g = Integer.parseInt(this.r.getString()) * 60;
      this.h = ((Integer)request(17, null, new Integer(218))).intValue();
      this.d = (String)request(17, null, new Integer(130));
      this.e = (String)request(17, null, new Integer(131));
      this.i = this.k.getSelectedIndex();
      if (this.t != null)
        this.t.cancel(); 
      this.b = a(this.c);
      a(this.i, this.a, this.b, true);
      this.t = new PlgXStatus$Task(this);
    } 
    this.n = null;
    this.o = null;
    this.p = null;
    this.q = null;
    this.r = null;
    this.k = null;
    request(1, null, new Integer(0));
  }
  
  private void a(int paramInt, String paramString1, String paramString2, boolean paramBoolean) {
    request(18, new Object[] { new Integer(218), new Integer(paramInt) }, null);
    request(18, new Object[] { new Integer(130), paramString1 }, null);
    request(18, new Object[] { new Integer(131), paramString2 }, null);
    request(19, null, null);
    if (paramBoolean)
      request(25, null, null); 
  }
  
  String a(String paramString) {
    (new String[3])[0] = paramString;
    (new String[3])[1] = "%p";
    int j = this.g;
    int i = this.j;
    String str = (String)request(41, (Object[])new String[] { null, null, (i * 100 / j) + "%" }, null);
    return str = (String)request(41, (Object[])new String[] { str, "%t", "" + (this.g - this.j) }, null);
  }
  
  static void a(PlgXStatus paramPlgXStatus, int paramInt, String paramString1, String paramString2, boolean paramBoolean) {
    paramPlgXStatus.a(paramInt, paramString1, paramString2, paramBoolean);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgXStatus.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */