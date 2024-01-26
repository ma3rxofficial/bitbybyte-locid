package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

public class PlgCellID extends PI implements CommandListener {
  public List a = new List("CellID", 3, new String[] { "Где я?", "Все соты.", "Места", "Трек", "Настройки" }, null);
  
  public Form b;
  
  public List c;
  
  public List d;
  
  public List e;
  
  public Form f;
  
  public Form g;
  
  private Command q = new Command("Ok", 4, 1);
  
  private Command r = new Command("Назад", 2, 10);
  
  private Command s = new Command("Добавить", 8, 2);
  
  private Command t = new Command("Редактировать", 8, 2);
  
  private Command u = new Command("Установить", 4, 2);
  
  private Command v = new Command("Удалить", 8, 2);
  
  private TextField w;
  
  private TextField x;
  
  private TextField y;
  
  private ChoiceGroup z;
  
  public Font h = Font.getFont(0, 0, 8);
  
  private Display A;
  
  public Vector i = new Vector();
  
  private Hashtable B = new Hashtable();
  
  private boolean[] C = new boolean[] { false, false, false, false, false, false, true, false, false };
  
  private int[] D = new int[] { 1, -1 };
  
  private String[] E = new String[] { "", "", "", "{name} {lacH}-{cellH}", "none" };
  
  private TextField F;
  
  private TextField G;
  
  private TextField H;
  
  private TextField I;
  
  private TextField J;
  
  public Group j;
  
  public int k = -1;
  
  public CellID l;
  
  private final Vector K = new Vector();
  
  private Hashtable L = new Hashtable();
  
  private final Vector M = new Vector();
  
  private final Vector N = new Vector();
  
  private int O = 30;
  
  private boolean P = false;
  
  private boolean Q = false;
  
  private String R = "";
  
  private ChoiceGroup S;
  
  private CellID T = null;
  
  private boolean U = false;
  
  private Displayable V;
  
  private ChoiceGroup W;
  
  private Group X;
  
  public String[] m;
  
  public Object n;
  
  public Hashtable o = new Hashtable();
  
  public String p;
  
  public final Group a(short paramShort) {
    return (paramShort == 0) ? null : (Group)this.B.get(new Integer(paramShort));
  }
  
  public String getName() {
    return "CellId";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    Group group2;
    int[] arrayOfInt1;
    Graphics graphics;
    Group group1;
    int[] arrayOfInt3;
    int i;
    int[] arrayOfInt2;
    boolean bool;
    int j;
    int k;
    Vector vector;
    switch (paramInt) {
      case 34:
        if (this.C[7] && this.T != null && (group2 = d()) != null && (arrayOfInt3 = (int[])paramArrayOfObject[0])[0] != -1 && group2.d != -1)
          arrayOfInt3[0] = group2.d; 
        return null;
      case 2:
        this.A = (Display)paramObject;
        if (!this.Q) {
          Alert alert;
          (alert = new Alert("Ошибка", "Ваш телефон не поддерживает определение местоположения по соте CellID! Совместимие модели - моторола почти все, сони ериксон год выпуска ~>=2007 но тоде не все", null, AlertType.INFO)).setTimeout(-2);
          this.A.setCurrent((Displayable)alert);
        } else {
          j();
        } 
        return null;
      case 0:
        this.A = (Display)paramObject;
        this.Q = (b("CellId") != null);
        if (this.Q) {
          a(request(7, null, null));
          l();
          String str = "CID:" + b("MCC") + "," + b("MNC") + "," + b("LAC") + "," + b("CellId");
          request(27, null, str);
        } else {
          String str = "CID:No";
          request(27, null, str);
        } 
        return null;
      case 24:
        if (!this.C[0])
          return null; 
        i = (arrayOfInt1 = (int[])paramArrayOfObject[0])[0];
        j = 0;
        if ((k = arrayOfInt1[2]) < 1 || k > 3)
          return null; 
        if (!this.C[k])
          return null; 
        (vector = (Vector)new Vector()).addElement(new int[] { (this.D[1] < 10) ? i : this.D[1], this.h.getHeight(), 0, 0 });
        return vector;
      case 25:
        graphics = (Graphics)paramArrayOfObject[0];
        j = (arrayOfInt2 = (int[])paramObject)[0];
        k = arrayOfInt2[1];
        graphics.setColor(16777215);
        if (this.R != null)
          graphics.drawString(this.R, j, (k + arrayOfInt2[3] - this.h.getHeight()) / 2, 20); 
        return null;
      case 29:
        graphics = null;
        bool = (paramArrayOfObject[1] != null && paramArrayOfObject[2] != null && (((String)paramArrayOfObject[1]).indexOf("{on}") >= 0 || ((String)paramArrayOfObject[2]).indexOf("{on}") >= 0)) ? true : false;
        if (!this.C[5] || bool) {
          if (bool) {
            group1 = d();
            a(paramArrayOfObject, group1);
          } 
          return null;
        } 
        try {
          if (this.T != null && (group1 = d()) != null) {
            if (!group1.c[0])
              return null; 
            if (group1.b != null && !"".equals(group1.b[1])) {
              String str = a(group1.b[1], paramArrayOfObject[1], paramArrayOfObject[2], null, group1, this.T);
              paramArrayOfObject[2] = a(group1.b[2], paramArrayOfObject[1], paramArrayOfObject[2], null, group1, this.T);
              paramArrayOfObject[1] = str;
              return null;
            } 
          } 
        } catch (Exception exception) {}
        if (this.E[0] != null && !"".equals(this.E[0])) {
          String str = a(this.E[0], paramArrayOfObject[1], paramArrayOfObject[2], null, group1, this.T);
          paramArrayOfObject[2] = a(this.E[1], paramArrayOfObject[1], paramArrayOfObject[2], null, group1, this.T);
          paramArrayOfObject[1] = str;
        } else {
          a(paramArrayOfObject, group1);
        } 
        return null;
      case 12:
        return !this.C[0] ? null : (((group1 = d()) == null) ? null : (group1.c[1] ? new Boolean(true) : (group1.c[2] ? new Boolean(false) : null)));
      case 8:
        return !this.C[0] ? null : (((group1 = d()) == null) ? null : (group1.c[3] ? paramObject : null));
      case 9:
        return null;
      case 201:
        return a();
    } 
    return null;
  }
  
  public final String a() {
    String str;
    Group group;
    if ((group = d()) != null) {
      str = group.b[0];
    } else {
      str = "none ";
      if (this.T != null)
        str = str + CellID.a(this.T); 
    } 
    return str;
  }
  
  private void a(Object[] paramArrayOfObject, Group paramGroup) {
    String str = a((String)paramArrayOfObject[1], paramArrayOfObject[1], paramArrayOfObject[2], null, paramGroup, this.T);
    paramArrayOfObject[2] = a((String)paramArrayOfObject[2], paramArrayOfObject[1], paramArrayOfObject[2], null, paramGroup, this.T);
    paramArrayOfObject[1] = str;
  }
  
  public final String a(String paramString, Object paramObject1, Object paramObject2, Object paramObject3, Group paramGroup, CellID paramCellID) {
    if (paramObject1 != null)
      paramString = a(paramString, "{xcap}", (String)paramObject1); 
    if (paramObject2 != null)
      paramString = a(paramString, "{xtext}", (String)paramObject2); 
    if (paramObject3 != null)
      paramString = a(paramString, "{st}", (String)paramObject3); 
    if (paramGroup != null && paramGroup.b != null && paramGroup.b[0] != null)
      paramString = a(paramString, "{name}", paramGroup.b[0]); 
    paramString = a(paramString = a(paramString, "{name}", this.E[4]), "{on}", "");
    if (paramCellID != null) {
      paramString = a(paramString, "{cell}", paramCellID.e);
      paramString = a(paramString, "{lac}", paramCellID.d);
      paramString = a(paramString, "{mnc}", paramCellID.c);
      paramString = a(paramString, "{mcc}", paramCellID.b);
      paramString = b(paramString, "{cellH}", paramCellID.e);
      paramString = b(paramString, "{lacH}", paramCellID.d);
      paramString = b(paramString, "{mncH}", paramCellID.c);
      paramString = b(paramString, "{mccH}", paramCellID.b);
    } 
    return paramString;
  }
  
  private String a(String paramString1, String paramString2, int paramInt) {
    return (paramString1.indexOf(paramString2) >= 0) ? a(paramString1, paramString2, "" + paramInt) : paramString1;
  }
  
  private String b(String paramString1, String paramString2, int paramInt) {
    return (paramString1.indexOf(paramString2) >= 0) ? a(paramString1, paramString2, Integer.toHexString(paramInt)) : paramString1;
  }
  
  private static String a(String paramString1, String paramString2, String paramString3) {
    while (paramString1.indexOf(paramString2) >= 0) {
      int i = paramString1.indexOf(paramString2);
      paramString1 = paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length());
    } 
    return paramString1;
  }
  
  private Group d() {
    Group group;
    return (this.T == null) ? null : (group = a(this.T.f));
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramDisplayable == this.a) {
      if (paramCommand == this.r) {
        this.U = true;
        m();
        request(1, null, new Integer(0));
        return;
      } 
      if (paramCommand == this.q || paramCommand == List.SELECT_COMMAND) {
        switch (this.a.getSelectedIndex()) {
          case 0:
            e();
            return;
          case 1:
            g();
            return;
          case 2:
            a(false);
            return;
          case 3:
            i();
            return;
          case 4:
            f();
            break;
        } 
        return;
      } 
    } else if (paramDisplayable == this.c) {
      int i = this.c.getSelectedIndex();
      if (paramCommand == this.s || (paramCommand == List.SELECT_COMMAND && this.c.size() == 0)) {
        a((Group)null, -1);
        return;
      } 
      if (paramCommand == this.r) {
        if (this.P) {
          this.A.setCurrent(this.V);
          return;
        } 
        this.A.setCurrent((Displayable)this.a);
        return;
      } 
      if (i < 0)
        return; 
      Group group = this.i.elementAt(i);
      if (paramCommand == this.u || (paramCommand == List.SELECT_COMMAND && this.P)) {
        this.l.f = (short)group.a;
        a(group);
        this.A.setCurrent(this.V);
      } else if (paramCommand == List.SELECT_COMMAND || paramCommand == this.t) {
        a(group, i);
      } else {
        if (paramCommand == this.v) {
          this.B.remove(new Integer(((Group)this.i.elementAt(i)).a));
          this.i.removeElementAt(i);
          this.c.delete(i);
        } 
        return;
      } 
    } else if (paramDisplayable == this.f) {
      if (paramCommand == this.r) {
        this.A.setCurrent((Displayable)this.c);
        this.f = null;
        return;
      } 
      if (paramCommand == this.q) {
        this.j.b[0] = this.w.getString();
        this.j.b[1] = this.x.getString();
        this.j.b[2] = this.y.getString();
        this.j.d = this.W.getSelectedIndex() - 1;
        this.z.getSelectedFlags(this.j.c);
        if (this.k < 0) {
          this.k = 0;
          this.c.insert(0, this.j.b[0], null);
          this.c.setSelectedIndex(0, true);
          this.i.insertElementAt(this.j, 0);
          this.D[0] = this.D[0] + 1;
          this.j.a = this.D[0];
          this.B.put(new Integer(this.j.a), this.j);
        } else {
          this.c.set(this.k, this.j.b[0], null);
        } 
        a(this.j);
        this.f.deleteAll();
        this.f = null;
        this.A.setCurrent((Displayable)this.c);
        this.U = true;
        d(this.T);
        return;
      } 
    } else if (paramDisplayable == this.d) {
      if (paramCommand == this.r) {
        this.A.setCurrent((Displayable)this.a);
        return;
      } 
      if (paramCommand == this.u || paramCommand == List.SELECT_COMMAND)
        synchronized (this.d) {
          int i;
          if ((i = this.d.getSelectedIndex()) < 0)
            return; 
          this.l = this.K.elementAt(i);
          String str;
          if (!(str = this.d.getString(i)).equals(b(i)))
            return; 
          a(true);
        }  
    } else if (paramDisplayable == this.e) {
      if (paramCommand == this.r) {
        this.A.setCurrent((Displayable)this.a);
        return;
      } 
      if (paramCommand == this.u || paramCommand == List.SELECT_COMMAND)
        synchronized (this.M) {
          int i;
          if ((i = this.e.getSelectedIndex()) < 0)
            return; 
          this.l = this.M.elementAt(i);
          String str;
          if (!(str = this.e.getString(i)).equals(c(i)))
            return; 
          a(true);
        }  
    } else if (paramDisplayable == this.b) {
      if (paramCommand == this.r) {
        this.b = null;
        this.A.setCurrent((Displayable)this.a);
        return;
      } 
      if (paramCommand == this.q) {
        if (this.S.isSelected(7) != this.C[7])
          request(24, null, null); 
        this.S.getSelectedFlags(this.C);
        this.E[0] = this.G.getString();
        this.E[1] = this.H.getString();
        this.E[3] = this.I.getString();
        this.E[4] = this.J.getString();
        this.D[1] = Integer.parseInt(this.F.getString());
        this.b = null;
        this.A.setCurrent((Displayable)this.a);
        return;
      } 
    } else if (paramDisplayable == this.g) {
      this.g = null;
      this.A.setCurrent((Displayable)this.a);
      return;
    } 
  }
  
  private void e() {
    this.g = new Form("Тут");
    String str = "Нет данных";
    if (this.T != null)
      str = this.T.a(); 
    this.g.append((Item)new StringItem("Сота:", str));
    this.g.append((Item)new StringItem("\nМесто:", this.R));
    this.g.addCommand(this.q);
    this.g.addCommand(this.r);
    this.g.setCommandListener(this);
    this.A.setCurrent((Displayable)this.g);
  }
  
  private void f() {
    this.b = new Form("Settings");
    this.S = new ChoiceGroup("Options:", 2, new String[] { "Включить", "В контакт лист", "В чате", "В меню", "Менять статус", "Менять хсататус", "В трек все ячейки", "Менять картинку хстатуса (++расход)", "Высылать хстатусы даже при одинаковой картинке (+++расход)" }, null);
    this.S.setSelectedFlags(this.C);
    this.F = new TextField("Ширина статуса", "" + this.D[1], 4, 2);
    this.G = new TextField("Заголовок в экстрас если ненайдено мето:", "" + this.E[0], 90, 0);
    this.H = new TextField("Текст в экстрас если ненайдено мето:", "" + this.E[1], 360, 0);
    this.I = new TextField("Шаблон на экран:", "" + this.E[3], 40, 0);
    this.J = new TextField("Название при отуствии места:", "" + this.E[4], 360, 0);
    this.b.append((Item)this.S);
    this.b.append((Item)this.F);
    this.b.append((Item)this.I);
    this.b.append((Item)this.J);
    this.b.append((Item)this.G);
    this.b.append((Item)this.H);
    this.b.append("Более подробно как позльзоваться программой можно узнать на http://fay.by, список сод можно узнать на сайте netmonitor.ru, скоро плнируется автоматическая загрузка названий сот.");
    this.b.addCommand(this.q);
    this.b.addCommand(this.r);
    this.b.setCommandListener(this);
    this.A.setCurrent((Displayable)this.b);
  }
  
  private void g() {
    h();
    this.d.addCommand(this.u);
    this.d.addCommand(this.r);
    this.d.setCommandListener(this);
    this.A.setCurrent((Displayable)this.d);
  }
  
  private void h() {
    if (this.d != null)
      return; 
    synchronized (this.K) {
      this.d = new List("Соты", 3);
      for (byte b = 0; b < this.K.size(); b++)
        this.d.append(b(b), null); 
      return;
    } 
  }
  
  private String b(int paramInt) {
    return a(this.K.elementAt(paramInt), (String)null, false);
  }
  
  private void i() {
    if (this.e == null)
      synchronized (this.M) {
        this.e = new List("Трек", 3);
        for (byte b = 0; b < this.M.size(); b++)
          this.e.append(c(b), null); 
      }  
    this.e.addCommand(this.u);
    this.e.addCommand(this.r);
    this.e.setCommandListener(this);
    this.A.setCurrent((Displayable)this.e);
  }
  
  private String c(int paramInt) {
    CellID cellID = this.M.elementAt(paramInt);
    String str2 = this.N.elementAt(paramInt);
    String str1;
    return str1 = a(cellID, str2, true);
  }
  
  private static String a(CellID paramCellID, String paramString, boolean paramBoolean) {
    return paramBoolean ? (paramString + " " + CellID.b(paramCellID) + " " + CellID.a(paramCellID)) : (CellID.a(paramCellID) + " " + CellID.b(paramCellID));
  }
  
  private void a(Group paramGroup, int paramInt) {
    if (paramGroup == null)
      paramGroup = new Group(this, 0, "Места"); 
    if (this.m == null) {
      this.m = (String[])request(26, null, null);
      this.n = request(13, null, new Integer(8));
    } 
    this.j = paramGroup;
    this.k = paramInt;
    this.w = new TextField("Название:", paramGroup.b[0], 30, 0);
    this.x = new TextField("Заголовок экстраз:", paramGroup.b[1], 90, 0);
    this.y = new TextField("Текст экстраз:", paramGroup.b[2], 360, 0);
    this.z = new ChoiceGroup("Настройки", 2, new String[] { "Разрешить экстраз", "Тишина в этом месте", "Громко в этом месте", "Вибра обязателна в этом месте" }, null);
    this.z.setSelectedFlags(paramGroup.c);
    this.W = new ChoiceGroup("Стстус", 4);
    int i = paramGroup.d + 1;
    I i1 = d(this.m.length);
    this.W.append("не менять", i1.createImage());
    for (byte b = 0; b < this.m.length; b++)
      this.W.append(this.m[b], d(b).createImage()); 
    this.W.setSelectedIndex(i, true);
    this.f = new Form(((paramInt < 0) ? "Добавить" : "Редактировать") + " Место", new Item[] { (Item)this.w, (Item)this.x, (Item)this.y, (Item)this.z, (Item)this.W });
    this.f.append((Item)new StringItem("В текстах можно делать подстановки", "{xcap}\n{xtext}\n{st}\n{name}\n{cell}{cellH}\n{lac}{lacH}\n{mnc}{mncH}\n{mcc}{mccH}\n{on}"));
    this.f.addCommand(this.q);
    this.f.addCommand(this.r);
    this.f.setCommandListener(this);
    this.A.setCurrent((Displayable)this.f);
  }
  
  private I d(int paramInt) {
    Object object;
    return ((object = request(14, new Object[] { this.n, new Integer(paramInt) }, null)) == null) ? null : (I)object;
  }
  
  private void j() {
    this.a.addCommand(this.q);
    this.a.addCommand(this.r);
    this.a.setCommandListener(this);
    this.A.setCurrent((Displayable)this.a);
  }
  
  private void a(boolean paramBoolean) {
    this.P = paramBoolean;
    if (this.c == null) {
      this.c = new List("Места", 3);
      for (byte b = 0; b < this.i.size(); b++) {
        Group group = this.i.elementAt(b);
        this.c.append(group.a(), null);
      } 
    } 
    this.c.addCommand(this.s);
    this.c.addCommand(this.v);
    this.c.addCommand(this.t);
    this.c.addCommand(this.r);
    if (paramBoolean) {
      this.c.addCommand(this.u);
    } else {
      this.c.removeCommand(this.u);
    } 
    this.c.setCommandListener(this);
    this.V = this.A.getCurrent();
    this.A.setCurrent((Displayable)this.c);
  }
  
  public static String a(int paramInt) {
    return (paramInt < 10) ? ("0" + paramInt) : ("" + paramInt);
  }
  
  public static String b() {
    Calendar calendar = Calendar.getInstance();
    String str;
    return str = a(calendar.get(11)) + ":" + a(calendar.get(12)) + ":" + a(calendar.get(13)) + " ";
  }
  
  private String a(String paramString) {
    String str = null;
    try {
      if ((str = c(paramString)) == null && (str = c(paramString.toLowerCase())) == null)
        str = c(paramString.toUpperCase()); 
    } catch (Throwable throwable) {
      str = null;
    } 
    return str;
  }
  
  private String b(String paramString) {
    if (this.o.containsKey(paramString))
      return d((String)this.o.get(paramString)); 
    this.p = "";
    String str;
    if ((str = a(paramString)) == null)
      str = a("com.nokia.mid." + paramString); 
    if (str == null)
      str = a("phone." + paramString); 
    if (str == null)
      str = a("com.nokia." + paramString); 
    if (str == null)
      str = a("com.nokia.net." + paramString); 
    if (str == null)
      str = a("com.siemens." + paramString); 
    if (str == null)
      str = a("com.siemens.net." + paramString); 
    if (str == null)
      str = a("com.sonyericsson." + paramString); 
    if (str == null)
      str = a("com.sonyericsson.net." + paramString); 
    if (str == null)
      str = a("com.samsung." + paramString); 
    if (str == null)
      str = a("com.motorola." + paramString); 
    if (str == null)
      str = a("com.motorola.net." + paramString); 
    if (str == null)
      str = a("com.sagem." + paramString); 
    if (str == null)
      str = a("device." + paramString); 
    if (str == null)
      str = a("microedition." + paramString); 
    if (str == null) {
      this.o.put(paramString, paramString);
    } else {
      this.o.put(paramString, this.p);
    } 
    return str;
  }
  
  private String c(String paramString) {
    try {
      String str;
      if ((str = System.getProperty(paramString)) != null)
        this.p = paramString; 
      return str;
    } catch (Throwable throwable) {
      return null;
    } 
  }
  
  private static String d(String paramString) {
    if (paramString == null)
      return null; 
    try {
      return System.getProperty(paramString);
    } catch (Throwable throwable) {
      return null;
    } 
  }
  
  public final CellID c() {
    if (!this.Q)
      return null; 
    CellID cellID = new CellID(this);
    try {
      cellID.e = (short)Integer.parseInt(b("CellId"), 16);
      cellID.d = (short)Integer.parseInt(b("LAC"), 16);
      cellID.c = (byte)Integer.parseInt(b("MNC"), 16);
      cellID.b = (short)Integer.parseInt(b("MCC"), 10);
    } catch (Exception exception) {}
    return cellID;
  }
  
  private void k() {
    this.K.removeAllElements();
    this.L.clear();
    if (this.d != null)
      this.d.deleteAll(); 
  }
  
  private void a(CellID paramCellID, boolean paramBoolean) {
    synchronized (this.K) {
      if (paramBoolean) {
        this.K.insertElementAt(paramCellID, 0);
        if (this.d != null)
          this.d.append(b(0), null); 
      } else {
        this.K.addElement(paramCellID);
        if (this.d != null)
          this.d.append(b(this.K.size() - 1), null); 
      } 
      this.L.put(paramCellID, paramCellID);
      return;
    } 
  }
  
  private void a(CellID paramCellID) {
    synchronized (this.K) {
      int i;
      if ((i = this.K.indexOf(paramCellID)) == -1)
        return; 
      this.K.removeElementAt(i);
      if (this.d != null)
        this.d.delete(i); 
      this.L.remove(paramCellID);
      return;
    } 
  }
  
  private void l() {}
  
  private void a(Object paramObject) {
    if (paramObject == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
    try {
      short s = dataInputStream.readShort();
      byte b;
      for (b = 0; b < s; b++) {
        if (b < this.C.length)
          this.C[b] = dataInputStream.readBoolean(); 
      } 
      s = dataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.D.length)
          this.D[b] = dataInputStream.readInt(); 
      } 
      s = dataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.E.length)
          this.E[b] = dataInputStream.readUTF(); 
      } 
      s = dataInputStream.readShort();
      this.i.removeAllElements();
      this.B.clear();
      for (b = 0; b < s; b++) {
        Group group = new Group(this, dataInputStream);
        this.i.addElement(group);
        this.B.put(new Integer(group.a), group);
      } 
      synchronized (this.K) {
        s = dataInputStream.readShort();
        k();
        for (byte b1 = 0; b1 < s; b1++) {
          CellID cellID = new CellID(this, dataInputStream);
          a(cellID, false);
        } 
      } 
    } catch (IOException iOException) {}
  }
  
  private void m() {
    if (!this.U)
      return; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeShort(this.C.length);
      byte b1;
      for (b1 = 0; b1 < this.C.length; b1++)
        dataOutputStream.writeBoolean(this.C[b1]); 
      dataOutputStream.writeShort(this.D.length);
      for (b1 = 0; b1 < this.D.length; b1++)
        dataOutputStream.writeInt(this.D[b1]); 
      dataOutputStream.writeShort(this.E.length);
      for (b1 = 0; b1 < this.E.length; b1++)
        dataOutputStream.writeUTF(this.E[b1]); 
      dataOutputStream.writeShort(this.i.size());
      for (b1 = 0; b1 < this.i.size(); b1++)
        ((Group)this.i.elementAt(b1)).a(dataOutputStream); 
      b1 = 0;
      byte b2 = 0;
      synchronized (this.K) {
        while (b1 < this.K.size()) {
          CellID cellID;
          if ((cellID = this.K.elementAt(b1)).f <= 0) {
            if (b2 > 10) {
              a(cellID);
              continue;
            } 
            b1++;
            b2++;
            continue;
          } 
          b1++;
        } 
        dataOutputStream.writeShort(this.K.size());
        for (byte b = 0; b < this.K.size(); b++)
          ((CellID)this.K.elementAt(b)).a(dataOutputStream); 
      } 
      this.U = false;
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  private void b(CellID paramCellID) {
    if (paramCellID == null) {
      this.R = "Not Connected";
      c(paramCellID);
      while (this.M.size() > this.O)
        n(); 
      return;
    } 
    if ((this.T == null || paramCellID.f < 1 || this.C[6] || paramCellID.f != this.T.f) && this.C[1]) {
      c(paramCellID);
      while (this.M.size() > this.O)
        n(); 
    } 
    this.T = paramCellID;
    d(paramCellID);
  }
  
  private void n() {
    synchronized (this.M) {
      this.M.removeElement(this.M.lastElement());
      this.N.removeElement(this.N.lastElement());
      if (this.e != null)
        this.e.delete(this.e.size() - 1); 
      return;
    } 
  }
  
  private void c(CellID paramCellID) {
    synchronized (this.M) {
      this.M.insertElementAt(paramCellID, 0);
      this.N.insertElementAt(b(), 0);
      if (this.e != null)
        this.e.insert(0, c(0), null); 
      return;
    } 
  }
  
  private void a(Group paramGroup) {
    synchronized (this.K) {
      for (byte b = 0; b < this.K.size(); b++) {
        CellID cellID;
        if ((cellID = this.K.elementAt(b)).f == paramGroup.a && this.d != null)
          this.d.set(b, b(b), null); 
      } 
    } 
    synchronized (this.M) {
      for (byte b = 0; b < this.M.size(); b++) {
        CellID cellID;
        if ((cellID = this.M.elementAt(b)).f == paramGroup.a && this.e != null)
          this.e.set(b, c(b), null); 
      } 
      return;
    } 
  }
  
  private void d(CellID paramCellID) {
    if (paramCellID == null)
      return; 
    Group group = a(paramCellID.f);
    this.R = a(this.E[3], null, null, null, group, paramCellID);
    if (this.C[7]) {
      boolean bool = false;
      if (this.X == null && group != null) {
        bool = true;
      } else if (this.X != null && group == null) {
        bool = true;
      } else if (this.X != null) {
        if (this.X.d != group.d) {
          bool = true;
        } else if (this.X != group && this.C[8]) {
          bool = true;
        } 
      } 
      if (bool)
        request(24, null, null); 
      this.X = group;
    } 
    request(10, null, null);
  }
  
  public static Vector a(PlgCellID paramPlgCellID) {
    return paramPlgCellID.K;
  }
  
  public static Hashtable b(PlgCellID paramPlgCellID) {
    return paramPlgCellID.L;
  }
  
  public static boolean[] c(PlgCellID paramPlgCellID) {
    return paramPlgCellID.C;
  }
  
  public static void a(PlgCellID paramPlgCellID, CellID paramCellID, boolean paramBoolean) {
    paramPlgCellID.a(paramCellID, paramBoolean);
  }
  
  public static void a(PlgCellID paramPlgCellID, CellID paramCellID) {
    paramPlgCellID.b(paramCellID);
  }
  
  public class MyTimeout extends TimerTask {
    private PlgCellID.CellID a;
    
    private int b;
    
    private final PlgCellID c;
    
    public MyTimeout(PlgCellID this$0) {
      this.c = this$0;
      this.b = 0;
      (new Timer()).scheduleAtFixedRate(this, 0L, 5000L);
    }
    
    public void run() {
      this.b++;
      PlgCellID.CellID cellID;
      if ((cellID = this.c.c()) == null) {
        cancel();
        return;
      } 
      if (this.a == null || !cellID.equals(this.a) || PlgCellID.a(this.c).size() == 0) {
        this.a = cellID;
        if (!PlgCellID.b(this.c).containsKey(cellID)) {
          if (PlgCellID.c(this.c)[1])
            PlgCellID.a(this.c, cellID, true); 
        } else {
          cellID = (PlgCellID.CellID)PlgCellID.b(this.c).get(cellID);
        } 
        PlgCellID.a(this.c, cellID);
      } 
    }
  }
  
  class Group {
    public int a;
    
    public String[] b = new String[] { "", "{name}", "", "", "-1" };
    
    public boolean[] c = new boolean[5];
    
    public int d = -1;
    
    public int hashCode() {
      return this.a;
    }
    
    public Group(PlgCellID this$0, int param1Int, String param1String) {
      this.a = param1Int;
      this.b[0] = param1String;
    }
    
    public Group(PlgCellID this$0, DataInputStream param1DataInputStream) throws IOException {
      this.a = param1DataInputStream.readInt();
      short s = param1DataInputStream.readShort();
      byte b;
      for (b = 0; b < s; b++) {
        if (b < this.c.length)
          this.c[b] = param1DataInputStream.readBoolean(); 
      } 
      s = param1DataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.b.length)
          this.b[b] = param1DataInputStream.readUTF(); 
      } 
      this.d = Integer.parseInt(this.b[4]);
    }
    
    public final void a(DataOutputStream param1DataOutputStream) throws IOException {
      param1DataOutputStream.writeInt(this.a);
      param1DataOutputStream.writeShort(this.c.length);
      byte b;
      for (b = 0; b < this.c.length; b++)
        param1DataOutputStream.writeBoolean(this.c[b]); 
      this.b[4] = Integer.toString(this.d);
      param1DataOutputStream.writeShort(this.b.length);
      for (b = 0; b < this.b.length; b++)
        param1DataOutputStream.writeUTF(this.b[b]); 
    }
    
    public final String a() {
      return "".equals(this.b[0]) ? "none" : this.b[0];
    }
  }
  
  class CellID {
    public int a;
    
    public short b;
    
    public byte c;
    
    public short d;
    
    public short e;
    
    public short f;
    
    private final PlgCellID g;
    
    public int hashCode() {
      return this.d << 16 + this.e;
    }
    
    public CellID(PlgCellID this$0, DataInputStream param1DataInputStream) throws IOException {
      this.g = this$0;
      this.a = param1DataInputStream.readInt();
      this.b = param1DataInputStream.readShort();
      this.c = param1DataInputStream.readByte();
      this.d = param1DataInputStream.readShort();
      this.e = param1DataInputStream.readShort();
      this.f = param1DataInputStream.readShort();
    }
    
    public CellID(PlgCellID this$0) {
      this.g = this$0;
    }
    
    public final String a() {
      return (this.f > 0) ? b() : c();
    }
    
    private String b() {
      PlgCellID.Group group;
      return ((group = this.g.a(this.f)) != null) ? group.a() : null;
    }
    
    private String c() {
      return Integer.toString(this.d, 16) + " " + Integer.toString(this.e, 16);
    }
    
    public final void a(DataOutputStream param1DataOutputStream) throws IOException {
      param1DataOutputStream.writeInt(this.a);
      param1DataOutputStream.writeShort(this.b);
      param1DataOutputStream.writeByte(this.c);
      param1DataOutputStream.writeShort(this.d);
      param1DataOutputStream.writeShort(this.e);
      param1DataOutputStream.writeShort(this.f);
    }
    
    public boolean equals(Object param1Object) {
      CellID cellID;
      return ((cellID = (CellID)param1Object).e == this.e);
    }
    
    public static String a(CellID param1CellID) {
      return param1CellID.c();
    }
    
    public static String b(CellID param1CellID) {
      return param1CellID.b();
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgCellID.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */