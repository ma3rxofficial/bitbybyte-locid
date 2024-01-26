package i;

import bd;
import be;
import bi;
import cd;
import cj;
import dh;
import dm;
import dw;
import ea;
import em;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Random;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

public class PlgForum extends PI implements CommandListener {
  private Hashtable j;
  
  private Vector k;
  
  public String a = "";
  
  public String b = null;
  
  private Form l;
  
  private Form m;
  
  private List n;
  
  private Command o = new Command("Сохранить", 4, 1);
  
  private Command p = new Command("Обновить", 8, 3);
  
  private Command q = new Command("Назад", 2, 3);
  
  private Command r = new Command("BAN", 8, 10);
  
  private Command s = new Command("KIK", 8, 10);
  
  private Command t = new Command("Список", 8, 2);
  
  private Command u = new Command("Изменить", 8, 2);
  
  private Command v = new Command("Добавить", 8, 2);
  
  private Command w = new Command("Удалить", 8, 2);
  
  private Command x = new Command("Назад", 2, 3);
  
  private Command y = new Command("Отмена", 2, 3);
  
  private Command z = new Command("Сохранить", 4, 1);
  
  private Vector A = new Vector();
  
  private Vector B = new Vector();
  
  public ChoiceGroup c;
  
  public StringItem d;
  
  public String e = "";
  
  public TextField f;
  
  public TextField g;
  
  private boolean[] C = new boolean[] { true, false, false, false, false, false, true, false, true, true };
  
  private int D;
  
  private String E = "https://loc-id.ucoz.ru/forum/";
  
  private Display F;
  
  private TextField G;
  
  private TextField H;
  
  private TextField I;
  
  private TextField J;
  
  private ChoiceGroup K;
  
  private boolean L = true;
  
  private TextField M;
  
  public Random h = new Random();
  
  private boolean N = false;
  
  private String O;
  
  private String P;
  
  private String Q;
  
  public PlgForumI i;
  
  public PlgForum() {
    this.h.setSeed(System.currentTimeMillis());
    int i;
    if ((i = this.h.nextInt() % 9000) < 0)
      i = -i; 
    i += 1000;
    this.O = "" + i;
    if ((i = this.h.nextInt() ^ 0x1E303) < 0)
      i = -i; 
    if (i < 1073741824)
      i |= 0x40000000; 
    int j = 0;
    j = (i >> 8) * 17;
    i &= -256 + (j & 0xFF);
    this.P = "" + i;
    this.A.addElement(this.p);
    this.B.addElement(this.p);
    this.j = new Hashtable();
    this.k = new Vector();
  }
  
  public String getName() {
    return "Форум LocID";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    Object[] arrayOfObject;
    PlgForumI plgForumI;
    byte b;
    switch (paramInt) {
      case 0:
        a(request(7, null, null));
        this.F = (Display)paramObject;
        return null;
      case 2:
        this.F = (Display)paramObject;
        f();
        return null;
    } 
    if (!this.C[0])
      return null; 
    switch (paramInt) {
      case 19:
        return this.A;
      case 16:
        return this.B;
      case 20:
        if (paramObject instanceof C && this.j.containsKey(paramArrayOfObject[0])) {
          dm dm;
          if ((dm = bi.a((String)paramArrayOfObject[0])) != null)
            dm.a(192, 0); 
          return this.A;
        } 
        return null;
      case 17:
        return (paramObject instanceof C && this.j.containsKey(paramArrayOfObject[4])) ? this.B : null;
      case 21:
        if (paramObject != this.p)
          return null; 
        arrayOfObject = new Object[] { paramArrayOfObject[0], "" };
        request(30, arrayOfObject, paramObject);
        return this;
      case 18:
        if (paramObject == this.r || paramObject == this.s) {
          String str = dw.e((String)paramArrayOfObject[2]);
          if ("".equals(str))
            return null; 
          Object[] arrayOfObject1 = { paramArrayOfObject[4], ((paramObject == this.s) ? "!kik " : "!ban ") + str };
          request(30, arrayOfObject1, paramObject);
          return this;
        } 
        if (paramObject != this.p)
          return null; 
        arrayOfObject = new Object[] { paramArrayOfObject[4], "" };
        request(30, arrayOfObject, paramObject);
        return this;
      case 22:
        if (this.j.containsKey(paramArrayOfObject[0])) {
          if (paramArrayOfObject[1] != null)
            request(30, paramArrayOfObject, paramObject); 
          return new Boolean(false);
        } 
        return null;
      case 37:
        if ((plgForumI = b(paramArrayOfObject[0])) != null)
          if (this.C[5]) {
            plgForumI.a((String)paramArrayOfObject[1], false);
          } else {
            plgForumI.b((String)paramArrayOfObject[1], false);
          }  
        return null;
      case 36:
        paramArrayOfObject = (Object[])paramArrayOfObject[2];
        if ((plgForumI = b(paramArrayOfObject[0])) != null && (!plgForumI.b[4] || cd.f()))
          if (this.C[5]) {
            plgForumI.a((String)paramArrayOfObject[1], true);
          } else {
            plgForumI.b((String)paramArrayOfObject[1], true);
          }  
        return null;
      case 35:
        return this.k;
      case 4:
        b = 0;
        if (this.C[0])
          for (byte b1 = 0; b1 < this.k.size(); b1++) {
            String str = this.k.elementAt(b1);
            PlgForumI plgForumI1;
            if ((plgForumI1 = b(str)) != null && plgForumI1.b[2])
              plgForumI1.a((b++ * 30 + 5) * 1000); 
          }  
        return null;
      case 39:
        if (paramObject != null && paramObject instanceof C) {
          C c = (C)paramObject;
          if (this.j.containsKey(c.getUinString())) {
            Object[] arrayOfObject1 = { c.getUinString(), "" };
            request(30, arrayOfObject1, paramObject);
          } 
        } 
        return null;
      case 27:
        if (!this.C[6])
          return null; 
        if (paramArrayOfObject[1] == null || "".equals(paramArrayOfObject[1]) || this.a.equals(paramArrayOfObject[1]))
          if (paramArrayOfObject[2] != null && this.j.containsKey(paramArrayOfObject[2]) && paramArrayOfObject[3] != null && (paramArrayOfObject[4] == null || "".equals(paramArrayOfObject[4]))) {
            PlgForumI plgForumI1 = b(paramArrayOfObject[2]);
            String str;
            if ((str = ((String[])paramArrayOfObject[3])[0]) != null) {
              String str1 = d(str);
              if (this.a.equals(paramArrayOfObject[1]))
                paramArrayOfObject[1] = ""; 
              if (str1 != null && !"".equals(str1) && !"AutoREQ".equals(str1) && !str.startsWith(plgForumI1.d[1]) && !str.startsWith("Error") && !str.startsWith("Info")) {
                this.a = str1 + ", ";
                paramArrayOfObject[4] = this.a;
              } 
            } 
          } else if (this.a.equals(paramArrayOfObject[1])) {
            paramArrayOfObject[1] = "";
          }  
        return null;
    } 
    return null;
  }
  
  private static String d(String paramString) {
    int i = paramString.indexOf(" (");
    int j;
    if ((j = paramString.indexOf(" [")) >= 4 && j < i)
      i = j; 
    if ((j = paramString.indexOf(" {")) > 4 && j < i)
      i = j; 
    if ((j = paramString.indexOf(" <")) > 10 && j < i)
      i = j; 
    if ((j = paramString.indexOf("{A}")) > 4)
      i = j; 
    if ((j = paramString.indexOf("{M}")) > 4)
      i = j; 
    if ((j = paramString.indexOf("{C}")) > 4)
      i = j; 
    if ((j = paramString.indexOf("{U}")) > 4)
      i = j; 
    if (i >= 0)
      paramString = paramString.substring(0, i).trim(); 
    return paramString;
  }
  
  private void a(String paramString1, String paramString2) {
    String[] arrayOfString1 = dh.a(paramString1, " ");
    String[] arrayOfString2 = dh.a(paramString2, " ");
    for (byte b = 0; b < arrayOfString1.length; b++) {
      try {
        if (!arrayOfString1[b].equals("") && Long.parseLong(arrayOfString1[b]) != 0L) {
          PlgForumI plgForumI;
          (plgForumI = new PlgForumI(this)).d[0] = arrayOfString1[b];
          try {
            plgForumI.c[1] = Integer.parseInt(arrayOfString2[b]);
            a(plgForumI);
          } catch (Exception exception) {}
        } 
      } catch (NumberFormatException numberFormatException) {}
    } 
  }
  
  private synchronized void a(PlgForumI paramPlgForumI) {
    if (this.j.containsKey(paramPlgForumI.d[0]))
      for (int i = this.k.size() - 1; i >= 0; i--) {
        if (this.k.elementAt(i).equals(paramPlgForumI.d[0])) {
          this.j.put(paramPlgForumI.d[0], paramPlgForumI);
          this.k.setElementAt(paramPlgForumI.d[0], i);
          if (this.n != null)
            this.n.set(i, b(paramPlgForumI), null); 
          return;
        } 
      }  
    this.j.put(paramPlgForumI.d[0], paramPlgForumI);
    this.k.addElement(paramPlgForumI.d[0]);
    if (this.n != null)
      this.n.append(b(paramPlgForumI), null); 
  }
  
  private static String b(PlgForumI paramPlgForumI) {
    return paramPlgForumI.d[1].equals("") ? paramPlgForumI.d[0] : (paramPlgForumI.d[0] + " " + paramPlgForumI.d[1]);
  }
  
  private synchronized void a(int paramInt) {
    if (!this.j.containsKey(this.k.elementAt(paramInt)))
      return; 
    this.j.remove(this.k.elementAt(paramInt));
    this.k.removeElementAt(paramInt);
    if (this.n != null)
      this.n.delete(paramInt); 
  }
  
  private void a(PlgForumI paramPlgForumI, C paramC, String paramString1, String paramString2) {
    if (paramString1 == null)
      return; 
    if (paramString1.equals(""))
      return; 
    cj.a(paramC, paramString1, b(), "", 0L, paramString2, this.C[3]);
    if (em.h(17) && !paramPlgForumI.b[3])
      ea.a(paramC.getUinString(), paramString1, (byte)1, paramString2, b()); 
  }
  
  private static long b() {
    return dh.a(false);
  }
  
  private synchronized C a(PlgForumI paramPlgForumI, String paramString1, String paramString2, String paramString3, long paramLong, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, boolean paramBoolean3) {
    I i;
    String str = paramPlgForumI.d[0];
    if (paramLong == 0L)
      paramLong = b(); 
    paramPlgForumI.h = 70000 + paramPlgForumI.h % 1000;
    if (paramInt1 >= 0) {
      i = bi.b.a(paramInt1);
    } else {
      try {
        i = bi.a((paramInt1 = -paramInt1) / 1000).a(paramInt1 % 1000);
      } catch (Exception exception) {
        i = bi.b.a(paramInt1);
      } 
    } 
    paramPlgForumI.h = 71000 + paramPlgForumI.h % 1000;
    if (paramString1 == null)
      paramString1 = "[null]"; 
    if (paramString2 == null)
      paramString2 = "[null2]"; 
    if (paramString3 == null)
      paramString3 = "[null3]"; 
    paramPlgForumI.h = 76000 + paramPlgForumI.h % 1000;
    dm dm = bi.a(str);
    paramPlgForumI.h = 77000 + paramPlgForumI.h % 1000;
    if (dm != null && dm.o != null && !cj.c.containsKey(str))
      cj.a((C)dm, dm.o); 
    paramPlgForumI.h = 79000 + paramPlgForumI.h % 1000;
    if (dm != null) {
      if (this.b != null && this.b.length() > 2 && paramBoolean1 && paramString2.indexOf(this.b) >= 0) {
        cj.a(str, paramString1, paramString2, paramString3, paramLong, false, paramBoolean2, bi.b.a(21), paramInt2, false);
      } else {
        cj.a(str, paramString1, paramString2, paramString3, paramLong, paramBoolean1, paramBoolean2, i, paramInt2, false);
      } 
      paramPlgForumI.h = 81000 + paramPlgForumI.h % 1000;
      if (this.C[7]) {
        be be = cj.a(str);
        paramPlgForumI.h = 82000 + paramPlgForumI.h % 1000;
        if (be != null) {
          int j;
          for (j = ((bd)be).t; be.ae.size() > 500; j--)
            be.ae.removeElementAt(0); 
          be.p(j);
        } 
      } 
    } 
    paramPlgForumI.h = 72000 + paramPlgForumI.h % 1000;
    boolean bool = (em.h(17) && !paramPlgForumI.b[3] && paramBoolean3) ? true : false;
    paramPlgForumI.h = 75000 + paramPlgForumI.h % 1000;
    try {
      if (bool)
        ea.a(str, paramString2, (byte)0, paramString1, paramLong); 
    } catch (Exception exception) {}
    paramPlgForumI.g = null;
    return (C)dm;
  }
  
  private static String e(String paramString) {
    return dh.j(dh.k(paramString));
  }
  
  private static String f(String paramString) {
    return (new StringBuffer(paramString.length())).append(paramString).toString();
  }
  
  private static String g(String paramString) {
    if (paramString == null)
      return ""; 
    StringBuffer stringBuffer = new StringBuffer(paramString.length() * 6 + 4);
    try {
      if (paramString == null)
        return ""; 
      byte[] arrayOfByte = paramString.getBytes("utf-8");
      for (byte b = 0; b < arrayOfByte.length; b++) {
        String str;
        if ((str = Integer.toHexString(arrayOfByte[b] & 0xFF)).length() < 2) {
          stringBuffer.append("%0");
        } else {
          stringBuffer.append('%');
        } 
        stringBuffer.append(str);
      } 
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      null.printStackTrace();
      return null;
    } 
    return stringBuffer.toString();
  }
  
  private void a(Object paramObject) {
    try {
      int i;
      byte b2;
      String str1;
      byte b1;
      String str2;
      if (paramObject == null)
        throw new Exception(); 
      DataInputStream dataInputStream;
      switch ((dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject))).readUnsignedByte()) {
        case 0:
          i = dataInputStream.readUnsignedByte();
          for (b2 = 0; b2 < i; b2++)
            dataInputStream.readBoolean(); 
          this.e = dataInputStream.readUTF();
          c();
          str1 = dataInputStream.readUTF();
          dataInputStream.readInt();
          dataInputStream.readLong();
          dataInputStream.readUTF();
          dataInputStream.readUTF();
          dataInputStream.readInt();
          str2 = dataInputStream.readUTF();
          a(str1, str2);
          return;
        case 1:
          i = dataInputStream.readUnsignedByte();
          for (b1 = 0; b1 < i; b1++)
            this.C[b1] = dataInputStream.readBoolean(); 
          this.e = dataInputStream.readUTF();
          c();
          this.E = dataInputStream.readUTF();
          if (this.E.indexOf("jimmneon") >= 0)
            this.E = "https://loc-id.ucoz.ru/forum/"; 
          i = dataInputStream.readUnsignedByte();
          for (b1 = 0; b1 < i; b1++) {
            PlgForumI plgForumI = new PlgForumI(this, dataInputStream);
            a(plgForumI);
          } 
          try {
            this.O = dataInputStream.readUTF();
            this.P = dataInputStream.readUTF();
            return;
          } catch (Exception exception) {
            return;
          } 
      } 
      throw new Exception();
    } catch (Exception exception) {
      a(PlgForumI.a(new PlgForumI(this), "100", false, true, true, false, true, 5));
      a(PlgForumI.a(new PlgForumI(this), "103", false, false, false, false, false, 100));
      a(PlgForumI.a(new PlgForumI(this), "110", true, false, true, false, false, 100));
      a(PlgForumI.a(new PlgForumI(this), "112", true, false, true, false, false, 100));
      a(PlgForumI.a(new PlgForumI(this), "600", true, false, true, false, false, 100));
      return;
    } 
  }
  
  private void c() {
    this.b = d(this.e);
    ">" + this.b;
  }
  
  private synchronized void d() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(1);
      dataOutputStream.writeByte(this.C.length);
      for (byte b1 = 0; b1 < this.C.length; b1++)
        dataOutputStream.writeBoolean(this.C[b1]); 
      String str = this.e;
      b(dataOutputStream, str);
      b(dataOutputStream, this.E);
      dataOutputStream.writeByte(this.k.size());
      for (byte b2 = 0; b2 < this.k.size(); b2++) {
        Object object = this.k.elementAt(b2);
        b(object).a(dataOutputStream);
      } 
      b(dataOutputStream, this.O);
      b(dataOutputStream, this.P);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  private static void b(DataOutputStream paramDataOutputStream, String paramString) throws IOException {
    if (paramString == null)
      paramString = ""; 
    paramDataOutputStream.writeUTF(paramString);
  }
  
  private PlgForumI b(Object paramObject) {
    return (PlgForumI)this.j.get(paramObject);
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.q) {
      request(1, null, new Integer(0));
      return;
    } 
    if (paramCommand == this.o || paramCommand == this.t) {
      this.c.getSelectedFlags(this.C);
      this.e = h(this.g.getString());
      c();
      this.E = this.f.getString();
      this.O = this.M.getString();
      d();
      if (paramCommand == this.t) {
        e();
        return;
      } 
      request(1, null, new Integer(0));
      return;
    } 
    if (paramCommand == this.x) {
      f();
      return;
    } 
    if (paramCommand == this.v) {
      c(new PlgForumI(this));
      return;
    } 
    if (paramCommand == this.u || paramCommand == List.SELECT_COMMAND) {
      if (this.n.getSelectedIndex() != -1) {
        c(b(this.k.elementAt(this.n.getSelectedIndex())));
        return;
      } 
    } else {
      if (paramCommand == this.w) {
        if (this.n.getSelectedIndex() != -1)
          a(this.n.getSelectedIndex()); 
        d();
        return;
      } 
      if (paramCommand == this.z) {
        this.i.d[0] = this.G.getString();
        this.i.d[3] = this.J.getString();
        this.i.c[0] = Integer.parseInt(this.I.getString());
        this.i.c[3] = Integer.parseInt(this.H.getString());
        this.K.getSelectedFlags(this.i.b);
        a(this.i);
        d();
        e();
        this.m = null;
        return;
      } 
      if (paramCommand == this.y)
        e(); 
    } 
  }
  
  private static String h(String paramString) {
    StringBuffer stringBuffer = new StringBuffer(paramString.length());
    for (byte b = 0; b < paramString.length(); b++) {
      char c;
      if ((c = paramString.charAt(b)) < ' ')
        c = '@'; 
      stringBuffer.append(c);
    } 
    byte[] arrayOfByte;
    return dh.g(arrayOfByte = dh.b(stringBuffer.toString(), false), 0, arrayOfByte.length);
  }
  
  private void e() {
    if (this.n == null) {
      this.n = new List("Форумы", 3);
      for (byte b = 0; b < this.k.size(); b++) {
        PlgForumI plgForumI = b(this.k.elementAt(b));
        this.n.append(b(plgForumI), null);
      } 
      this.n.addCommand(this.u);
      this.n.addCommand(this.v);
      this.n.addCommand(this.x);
      this.n.addCommand(this.w);
      this.n.setCommandListener(this);
    } 
    this.F.setCurrent((Displayable)this.n);
  }
  
  private synchronized void f() {
    if (this.l == null) {
      this.l = new Form("Форум");
      this.l.addCommand(this.o);
      this.l.addCommand(this.q);
      this.l.addCommand(this.t);
      this.f = dw.a(new TextField("Url:", "", 200, 4));
      this.M = new TextField("Пароль:", "", 20, 0);
      this.g = dw.a(new TextField("Ник:", "", 30, 0));
      this.c = new ChoiceGroup("Опции:", 2, new String[] { "Активировать", "Логировать запросы", "Печатать сообщение до результата отпрвки", "Переходить в конец при написании", "Win1251", "Синхронное соединение", "При ответе писать 'ник,'", "Чистить чат", "Показывать х-статусы", "Отправлять х-статусы" }, null);
      this.l.setCommandListener(this);
      this.d = new StringItem("Трафик:", "" + (this.D / 1024) + "k");
      this.l.append((Item)this.c);
      this.l.append((Item)this.g);
      this.l.append((Item)this.f);
      this.l.append((Item)this.M);
      this.l.append((Item)this.d);
    } 
    this.c.setSelectedFlags(this.C);
    if (this.D < 11000) {
      this.d.setText("" + this.D + " bytes");
    } else {
      this.d.setText("" + (this.D / 1024) + " kb");
    } 
    this.g.setString(this.e);
    this.f.setString(this.E);
    this.M.setString(this.O);
    this.F.setCurrent((Displayable)this.l);
  }
  
  private synchronized void c(PlgForumI paramPlgForumI) {
    this.i = paramPlgForumI;
    this.m = new Form("Форум");
    this.m.addCommand(this.z);
    this.m.addCommand(this.y);
    this.G = new TextField("Id:", this.i.d[0], 200, 2);
    this.J = new TextField("Url:", "".equals(this.i.d[3]) ? this.E : this.i.d[3], 200, 0);
    this.H = new TextField("Считывать макс:", "" + this.i.c[3], 20, 2);
    this.I = new TextField("Авто, мин.:", "" + this.i.c[0], 20, 2);
    this.K = new ChoiceGroup("Опции:", 2, new String[] { "Включен", "Автообновление", "Обновление при старте", "Не хранить историю", "Активен только если есть соединение", "После перезапуска считивать историю занова" }, null);
    this.m.setCommandListener(this);
    this.m.append((Item)this.K);
    this.m.append((Item)new StringItem("Название:", this.i.d[1]));
    this.m.append((Item)this.G);
    this.m.append((Item)this.H);
    this.m.append((Item)this.I);
    this.m.append((Item)this.J);
    this.m.append(this.i.d[2]);
    this.K.setSelectedFlags(this.i.b);
    this.F.setCurrent((Displayable)this.m);
  }
  
  public static void a(DataOutputStream paramDataOutputStream, String paramString) throws IOException {
    b(paramDataOutputStream, paramString);
  }
  
  public static boolean[] a(PlgForum paramPlgForum) {
    return paramPlgForum.C;
  }
  
  public static C a(PlgForum paramPlgForum, PlgForumI paramPlgForumI, String paramString1, String paramString2, String paramString3, long paramLong, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, boolean paramBoolean3) {
    return paramPlgForum.a(paramPlgForumI, paramString1, paramString2, paramString3, paramLong, paramBoolean1, paramBoolean2, paramInt1, paramInt2, paramBoolean3);
  }
  
  public static String b(PlgForum paramPlgForum) {
    return paramPlgForum.O;
  }
  
  public static String a(String paramString) {
    return g(paramString);
  }
  
  public static void a(PlgForum paramPlgForum, PlgForumI paramPlgForumI, C paramC, String paramString1, String paramString2) {
    paramPlgForum.a(paramPlgForumI, paramC, paramString1, paramString2);
  }
  
  public static String c(PlgForum paramPlgForum) {
    return paramPlgForum.E;
  }
  
  public static String d(PlgForum paramPlgForum) {
    return paramPlgForum.P;
  }
  
  public static String e(PlgForum paramPlgForum) {
    return paramPlgForum.Q;
  }
  
  public static String a(PlgForum paramPlgForum, String paramString) {
    return paramPlgForum.Q = paramString;
  }
  
  public static boolean f(PlgForum paramPlgForum) {
    return paramPlgForum.L;
  }
  
  public static boolean a(PlgForum paramPlgForum, boolean paramBoolean) {
    return paramPlgForum.L = paramBoolean;
  }
  
  public static int a(PlgForum paramPlgForum, int paramInt) {
    return paramPlgForum.D += paramInt;
  }
  
  public static long a() {
    return b();
  }
  
  public static boolean g(PlgForum paramPlgForum) {
    return paramPlgForum.N;
  }
  
  public static boolean b(PlgForum paramPlgForum, boolean paramBoolean) {
    return paramPlgForum.N = paramBoolean;
  }
  
  public static Command h(PlgForum paramPlgForum) {
    return paramPlgForum.r;
  }
  
  public static Vector i(PlgForum paramPlgForum) {
    return paramPlgForum.B;
  }
  
  public static Command j(PlgForum paramPlgForum) {
    return paramPlgForum.s;
  }
  
  public static void k(PlgForum paramPlgForum) {
    paramPlgForum.d();
  }
  
  public static String b(String paramString) {
    return f(paramString);
  }
  
  public static String c(String paramString) {
    return e(paramString);
  }
  
  class PlgForumI {
    public boolean a;
    
    public boolean[] b;
    
    public int[] c;
    
    public String[] d;
    
    public boolean e;
    
    public Timer f;
    
    public String g;
    
    public int h;
    
    private final PlgForum i;
    
    public PlgForumI(PlgForum this$0) {
      this.i = this$0;
      this.a = true;
      this.b = new boolean[] { false, false, false, false, true, false };
      this.c = new int[] { 1, 0, 0, 50 };
      this.d = new String[] { "100", "", "", "" };
      this.e = false;
    }
    
    public PlgForumI(PlgForum this$0, DataInputStream param1DataInputStream) throws IOException {
      this.i = this$0;
      this.a = true;
      this.b = new boolean[] { false, false, false, false, true, false };
      this.c = new int[] { 1, 0, 0, 50 };
      this.d = new String[] { "100", "", "", "" };
      this.e = false;
      a(param1DataInputStream);
    }
    
    public final void a(DataInputStream param1DataInputStream) throws IOException {
      param1DataInputStream.readInt();
      short s = param1DataInputStream.readShort();
      byte b;
      for (b = 0; b < s; b++) {
        if (b < this.b.length)
          this.b[b] = param1DataInputStream.readBoolean(); 
      } 
      s = param1DataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.c.length)
          this.c[b] = param1DataInputStream.readInt(); 
      } 
      s = param1DataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < this.d.length)
          this.d[b] = param1DataInputStream.readUTF(); 
      } 
    }
    
    public final void a(DataOutputStream param1DataOutputStream) throws IOException {
      param1DataOutputStream.writeInt(0);
      param1DataOutputStream.writeShort(this.b.length);
      byte b;
      for (b = 0; b < this.b.length; b++)
        param1DataOutputStream.writeBoolean(this.b[b]); 
      param1DataOutputStream.writeShort(this.c.length);
      for (b = 0; b < this.c.length; b++)
        param1DataOutputStream.writeInt(this.c[b]); 
      param1DataOutputStream.writeShort(this.d.length);
      for (b = 0; b < this.d.length; b++)
        PlgForum.a(param1DataOutputStream, this.d[b]); 
    }
    
    public final void a(int param1Int) {
      Object[] arrayOfObject = { this.d[0], "" };
      arrayOfObject = new Object[] { new Long(param1Int), new Long(0L), arrayOfObject };
      a();
      this.h = 91;
      if (PlgForum.a(this.i)[1])
        b(PlgForum.a(this.i, this, "AutoREQ", "time: " + (param1Int / 60 / 1000) + "min", "", 0L, true, true, 16, 0, false)); 
      this.h = 90;
      this.f = (Timer)this.i.request(31, arrayOfObject, null);
      this.h = 92;
    }
    
    private void a() {
      if (this.f != null) {
        this.f.cancel();
        this.f = null;
      } 
    }
    
    private PlgForumI a(String param1String, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, boolean param1Boolean4, boolean param1Boolean5, int param1Int) {
      this.d[0] = param1String;
      this.c[0] = param1Int;
      this.b[0] = param1Boolean1;
      this.b[1] = param1Boolean2;
      this.b[2] = param1Boolean3;
      this.b[3] = param1Boolean4;
      this.b[4] = param1Boolean5;
      this.b[5] = !param1Boolean4;
      return this;
    }
    
    public final void a(String param1String, boolean param1Boolean) {
      b(param1String, param1Boolean);
    }
    
    public final void b(String param1String, boolean param1Boolean) {
      // Byte code:
      //   0: invokestatic currentThread : ()Ljava/lang/Thread;
      //   3: dup
      //   4: astore_3
      //   5: invokevirtual getPriority : ()I
      //   8: istore #4
      //   10: aload_3
      //   11: iconst_1
      //   12: invokevirtual setPriority : (I)V
      //   15: aload_0
      //   16: getfield d : [Ljava/lang/String;
      //   19: iconst_0
      //   20: aaload
      //   21: dup
      //   22: astore #6
      //   24: invokestatic b : (Ljava/lang/String;)Ldm;
      //   27: dup
      //   28: astore #5
      //   30: bipush #67
      //   32: invokeinterface getIntValue : (I)I
      //   37: istore #7
      //   39: iconst_0
      //   40: istore #8
      //   42: iconst_1
      //   43: istore #9
      //   45: aload_0
      //   46: getfield i : Li/PlgForum;
      //   49: invokestatic b : (Li/PlgForum;)Ljava/lang/String;
      //   52: astore #10
      //   54: aload_1
      //   55: ifnonnull -> 61
      //   58: ldc ''
      //   60: astore_1
      //   61: aconst_null
      //   62: astore #11
      //   64: aload_0
      //   65: iconst_m1
      //   66: putfield h : I
      //   69: aload_0
      //   70: invokespecial a : ()V
      //   73: aload_0
      //   74: iconst_0
      //   75: putfield h : I
      //   78: aconst_null
      //   79: astore #12
      //   81: aload_1
      //   82: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
      //   85: dup
      //   86: astore #11
      //   88: ifnonnull -> 95
      //   91: ldc ''
      //   93: astore #11
      //   95: ldc 'YES'
      //   97: bipush #-3
      //   99: invokestatic c : (I)Ljava/lang/String;
      //   102: invokevirtual equals : (Ljava/lang/Object;)Z
      //   105: ifne -> 115
      //   108: ldc ''
      //   110: astore #11
      //   112: iconst_0
      //   113: istore #9
      //   115: aload_0
      //   116: getfield i : Li/PlgForum;
      //   119: bipush #17
      //   121: iconst_1
      //   122: anewarray java/lang/Object
      //   125: dup
      //   126: iconst_0
      //   127: new java/lang/Integer
      //   130: dup
      //   131: iconst_m1
      //   132: invokespecial <init> : (I)V
      //   135: aastore
      //   136: aconst_null
      //   137: invokevirtual request : (I[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   140: checkcast java/lang/String
      //   143: astore #13
      //   145: ldc ''
      //   147: aload_0
      //   148: getfield i : Li/PlgForum;
      //   151: getfield e : Ljava/lang/String;
      //   154: invokevirtual equals : (Ljava/lang/Object;)Z
      //   157: ifeq -> 169
      //   160: aload_0
      //   161: getfield i : Li/PlgForum;
      //   164: aload #13
      //   166: putfield e : Ljava/lang/String;
      //   169: aload_0
      //   170: bipush #80
      //   172: putfield h : I
      //   175: aload_0
      //   176: getfield i : Li/PlgForum;
      //   179: invokestatic a : (Li/PlgForum;)[Z
      //   182: iconst_2
      //   183: baload
      //   184: ifeq -> 205
      //   187: aload_0
      //   188: getfield i : Li/PlgForum;
      //   191: aload_0
      //   192: aload #5
      //   194: aload_1
      //   195: aload_0
      //   196: getfield i : Li/PlgForum;
      //   199: getfield e : Ljava/lang/String;
      //   202: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Li/C;Ljava/lang/String;Ljava/lang/String;)V
      //   205: aload_0
      //   206: iconst_1
      //   207: putfield h : I
      //   210: iconst_0
      //   211: istore #14
      //   213: aload #13
      //   215: invokestatic parseInt : (Ljava/lang/String;)I
      //   218: istore #14
      //   220: goto -> 224
      //   223: pop
      //   224: invokestatic currentTimeMillis : ()J
      //   227: ldc2_w 31
      //   230: lrem
      //   231: l2i
      //   232: iconst_1
      //   233: iadd
      //   234: istore #15
      //   236: iload #14
      //   238: bipush #111
      //   240: irem
      //   241: istore #16
      //   243: bipush #15
      //   245: iload #16
      //   247: bipush #7
      //   249: imul
      //   250: bipush #13
      //   252: irem
      //   253: isub
      //   254: istore #17
      //   256: iload #14
      //   258: bipush #111
      //   260: idiv
      //   261: ldc 657586
      //   263: iload #17
      //   265: imul
      //   266: iadd
      //   267: istore #18
      //   269: invokestatic currentTimeMillis : ()J
      //   272: ldc2_w 40
      //   275: lrem
      //   276: l2i
      //   277: iconst_1
      //   278: iadd
      //   279: istore #19
      //   281: iload #14
      //   283: iload #15
      //   285: iadd
      //   286: iload #19
      //   288: iadd
      //   289: bipush #63
      //   291: irem
      //   292: istore #20
      //   294: iload #15
      //   296: bipush #31
      //   298: iload #20
      //   300: bipush #63
      //   302: iload #16
      //   304: bipush #111
      //   306: iload #19
      //   308: imul
      //   309: iadd
      //   310: imul
      //   311: iadd
      //   312: imul
      //   313: iadd
      //   314: istore #21
      //   316: aload_0
      //   317: iconst_2
      //   318: putfield h : I
      //   321: getstatic cj.c : Ljava/util/Hashtable;
      //   324: aload #6
      //   326: invokevirtual containsKey : (Ljava/lang/Object;)Z
      //   329: ifne -> 339
      //   332: aload #5
      //   334: aload #6
      //   336: invokestatic a : (Li/C;Ljava/lang/String;)V
      //   339: aload_0
      //   340: sipush #201
      //   343: putfield h : I
      //   346: invokestatic currentTimeMillis : ()J
      //   349: ldc2_w 123
      //   352: lrem
      //   353: l2i
      //   354: sipush #253
      //   357: iand
      //   358: istore #22
      //   360: iload #9
      //   362: ifeq -> 371
      //   365: iload #22
      //   367: iconst_2
      //   368: ior
      //   369: istore #22
      //   371: aload_0
      //   372: getfield c : [I
      //   375: iconst_1
      //   376: iaload
      //   377: istore #23
      //   379: aload_0
      //   380: getfield b : [Z
      //   383: iconst_5
      //   384: baload
      //   385: ifeq -> 398
      //   388: aload_0
      //   389: getfield a : Z
      //   392: ifeq -> 398
      //   395: iconst_0
      //   396: istore #23
      //   398: aload_0
      //   399: iconst_0
      //   400: putfield a : Z
      //   403: aload_0
      //   404: sipush #202
      //   407: putfield h : I
      //   410: aload_0
      //   411: getfield d : [Ljava/lang/String;
      //   414: iconst_3
      //   415: aaload
      //   416: astore #24
      //   418: ldc ''
      //   420: aload #24
      //   422: invokevirtual equals : (Ljava/lang/Object;)Z
      //   425: ifeq -> 437
      //   428: aload_0
      //   429: getfield i : Li/PlgForum;
      //   432: invokestatic c : (Li/PlgForum;)Ljava/lang/String;
      //   435: astore #24
      //   437: aload #24
      //   439: ldc 'http://'
      //   441: invokevirtual startsWith : (Ljava/lang/String;)Z
      //   444: ifne -> 469
      //   447: new java/lang/StringBuffer
      //   450: dup
      //   451: invokespecial <init> : ()V
      //   454: ldc 'http://'
      //   456: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   459: aload #24
      //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   464: invokevirtual toString : ()Ljava/lang/String;
      //   467: astore #24
      //   469: aload #24
      //   471: ldc '.php'
      //   473: invokevirtual endsWith : (Ljava/lang/String;)Z
      //   476: ifne -> 597
      //   479: aload #24
      //   481: ldc '/'
      //   483: invokevirtual endsWith : (Ljava/lang/String;)Z
      //   486: ifne -> 511
      //   489: new java/lang/StringBuffer
      //   492: dup
      //   493: invokespecial <init> : ()V
      //   496: aload #24
      //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   501: ldc '/'
      //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   506: invokevirtual toString : ()Ljava/lang/String;
      //   509: astore #24
      //   511: aload #24
      //   513: ldc 'fay.by/'
      //   515: invokevirtual endsWith : (Ljava/lang/String;)Z
      //   518: ifeq -> 543
      //   521: new java/lang/StringBuffer
      //   524: dup
      //   525: invokespecial <init> : ()V
      //   528: aload #24
      //   530: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   533: ldc 'locid/'
      //   535: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   538: invokevirtual toString : ()Ljava/lang/String;
      //   541: astore #24
      //   543: aload #24
      //   545: ldc 'fayby.ru/'
      //   547: invokevirtual endsWith : (Ljava/lang/String;)Z
      //   550: ifeq -> 575
      //   553: new java/lang/StringBuffer
      //   556: dup
      //   557: invokespecial <init> : ()V
      //   560: aload #24
      //   562: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   565: ldc 'locid/'
      //   567: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   570: invokevirtual toString : ()Ljava/lang/String;
      //   573: astore #24
      //   575: new java/lang/StringBuffer
      //   578: dup
      //   579: invokespecial <init> : ()V
      //   582: aload #24
      //   584: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   587: ldc 'forum/book.php'
      //   589: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   592: invokevirtual toString : ()Ljava/lang/String;
      //   595: astore #24
      //   597: new java/lang/StringBuffer
      //   600: dup
      //   601: invokespecial <init> : ()V
      //   604: aload #24
      //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   609: ldc '?theme='
      //   611: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   614: aload #6
      //   616: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   619: ldc '&name='
      //   621: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   624: aload_0
      //   625: getfield i : Li/PlgForum;
      //   628: getfield e : Ljava/lang/String;
      //   631: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
      //   634: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   637: ldc '&last='
      //   639: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   642: iload #23
      //   644: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   647: ldc '&msg='
      //   649: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   652: aload #11
      //   654: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   657: ldc '&count='
      //   659: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   662: aload_0
      //   663: getfield c : [I
      //   666: iconst_3
      //   667: iaload
      //   668: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   671: ldc '&cid='
      //   673: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   676: iload #18
      //   678: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   681: ldc '&pwd='
      //   683: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   686: iload #21
      //   688: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   691: ldc '&first='
      //   693: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   696: aload_0
      //   697: getfield c : [I
      //   700: iconst_2
      //   701: iaload
      //   702: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   705: ldc '&item='
      //   707: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   710: iload #22
      //   712: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   715: ldc '&gid='
      //   717: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   720: aload_0
      //   721: getfield i : Li/PlgForum;
      //   724: invokestatic d : (Li/PlgForum;)Ljava/lang/String;
      //   727: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   730: invokevirtual toString : ()Ljava/lang/String;
      //   733: astore #25
      //   735: aload_0
      //   736: sipush #203
      //   739: putfield h : I
      //   742: ldc 'IMEI'
      //   744: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
      //   747: dup
      //   748: astore #26
      //   750: ifnull -> 864
      //   753: aload #26
      //   755: invokevirtual trim : ()Ljava/lang/String;
      //   758: astore #26
      //   760: iconst_0
      //   761: istore #27
      //   763: iconst_0
      //   764: istore #28
      //   766: iload #28
      //   768: aload #26
      //   770: invokevirtual length : ()I
      //   773: if_icmpge -> 800
      //   776: iload #27
      //   778: iload #27
      //   780: bipush #7
      //   782: ishl
      //   783: ixor
      //   784: aload #26
      //   786: iload #28
      //   788: invokevirtual charAt : (I)C
      //   791: iadd
      //   792: istore #27
      //   794: iinc #28, 1
      //   797: goto -> 766
      //   800: iload #27
      //   802: ldc 65535
      //   804: iand
      //   805: istore #27
      //   807: new java/lang/StringBuffer
      //   810: dup
      //   811: invokespecial <init> : ()V
      //   814: aload #25
      //   816: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   819: ldc '&ci='
      //   821: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   824: iload #27
      //   826: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   829: invokevirtual toString : ()Ljava/lang/String;
      //   832: astore #25
      //   834: new java/lang/StringBuffer
      //   837: dup
      //   838: invokespecial <init> : ()V
      //   841: aload #25
      //   843: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   846: ldc '&imei='
      //   848: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   851: aload #26
      //   853: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
      //   856: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   859: invokevirtual toString : ()Ljava/lang/String;
      //   862: astore #25
      //   864: aload_0
      //   865: sipush #211
      //   868: putfield h : I
      //   871: aload_0
      //   872: getfield i : Li/PlgForum;
      //   875: invokestatic a : (Li/PlgForum;)[Z
      //   878: bipush #9
      //   880: baload
      //   881: ifne -> 906
      //   884: new java/lang/StringBuffer
      //   887: dup
      //   888: invokespecial <init> : ()V
      //   891: aload #25
      //   893: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   896: ldc '&ss=no'
      //   898: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   901: invokevirtual toString : ()Ljava/lang/String;
      //   904: astore #25
      //   906: new java/lang/StringBuffer
      //   909: dup
      //   910: invokespecial <init> : ()V
      //   913: aload #25
      //   915: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   918: ldc '&st='
      //   920: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   923: sipush #300
      //   926: invokestatic i : (I)J
      //   929: l2i
      //   930: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   933: ldc '&xst='
      //   935: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   938: sipush #218
      //   941: invokestatic f : (I)I
      //   944: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   947: invokevirtual toString : ()Ljava/lang/String;
      //   950: astore #25
      //   952: aload_0
      //   953: sipush #204
      //   956: putfield h : I
      //   959: aload #10
      //   961: ifnull -> 1001
      //   964: ldc ''
      //   966: aload #10
      //   968: invokevirtual equals : (Ljava/lang/Object;)Z
      //   971: ifne -> 1001
      //   974: new java/lang/StringBuffer
      //   977: dup
      //   978: invokespecial <init> : ()V
      //   981: aload #25
      //   983: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   986: ldc '&password='
      //   988: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   991: aload #10
      //   993: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   996: invokevirtual toString : ()Ljava/lang/String;
      //   999: astore #25
      //   1001: aload_0
      //   1002: sipush #205
      //   1005: putfield h : I
      //   1008: aload_0
      //   1009: getfield i : Li/PlgForum;
      //   1012: invokestatic e : (Li/PlgForum;)Ljava/lang/String;
      //   1015: ifnull -> 1062
      //   1018: new java/lang/StringBuffer
      //   1021: dup
      //   1022: invokespecial <init> : ()V
      //   1025: aload #25
      //   1027: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1030: ldc '&error='
      //   1032: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1035: aload_0
      //   1036: getfield i : Li/PlgForum;
      //   1039: invokestatic e : (Li/PlgForum;)Ljava/lang/String;
      //   1042: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
      //   1045: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1048: invokevirtual toString : ()Ljava/lang/String;
      //   1051: astore #25
      //   1053: aload_0
      //   1054: getfield i : Li/PlgForum;
      //   1057: aconst_null
      //   1058: invokestatic a : (Li/PlgForum;Ljava/lang/String;)Ljava/lang/String;
      //   1061: pop
      //   1062: aload_0
      //   1063: sipush #206
      //   1066: putfield h : I
      //   1069: new java/lang/StringBuffer
      //   1072: dup
      //   1073: invokespecial <init> : ()V
      //   1076: aload #25
      //   1078: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1081: ldc '&ver=78'
      //   1083: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1086: invokevirtual toString : ()Ljava/lang/String;
      //   1089: astore #25
      //   1091: aload_0
      //   1092: getfield i : Li/PlgForum;
      //   1095: invokestatic f : (Li/PlgForum;)Z
      //   1098: ifeq -> 1141
      //   1101: new java/lang/StringBuffer
      //   1104: dup
      //   1105: invokespecial <init> : ()V
      //   1108: aload #25
      //   1110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1113: ldc '&info='
      //   1115: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1118: invokestatic c : ()Ljava/lang/String;
      //   1121: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
      //   1124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1127: invokevirtual toString : ()Ljava/lang/String;
      //   1130: astore #25
      //   1132: aload_0
      //   1133: getfield i : Li/PlgForum;
      //   1136: iconst_0
      //   1137: invokestatic a : (Li/PlgForum;Z)Z
      //   1140: pop
      //   1141: aload_0
      //   1142: sipush #207
      //   1145: putfield h : I
      //   1148: aload_0
      //   1149: getfield i : Li/PlgForum;
      //   1152: invokestatic a : (Li/PlgForum;)[Z
      //   1155: iconst_4
      //   1156: baload
      //   1157: ifeq -> 1182
      //   1160: new java/lang/StringBuffer
      //   1163: dup
      //   1164: invokespecial <init> : ()V
      //   1167: aload #25
      //   1169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1172: ldc '&coding=win-1251'
      //   1174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1177: invokevirtual toString : ()Ljava/lang/String;
      //   1180: astore #25
      //   1182: aload_0
      //   1183: iconst_3
      //   1184: putfield h : I
      //   1187: new java/lang/StringBuffer
      //   1190: invokespecial <init> : ()V
      //   1193: aconst_null
      //   1194: astore #27
      //   1196: iconst_0
      //   1197: newarray byte
      //   1199: astore #28
      //   1201: aload_0
      //   1202: bipush #80
      //   1204: putfield h : I
      //   1207: aload_0
      //   1208: getfield i : Li/PlgForum;
      //   1211: invokestatic a : (Li/PlgForum;)[Z
      //   1214: iconst_1
      //   1215: baload
      //   1216: ifeq -> 1243
      //   1219: aload_0
      //   1220: getfield i : Li/PlgForum;
      //   1223: aload_0
      //   1224: ldc 'Req'
      //   1226: ldc '<req>'
      //   1228: ldc ''
      //   1230: lconst_0
      //   1231: iconst_1
      //   1232: iconst_1
      //   1233: bipush #16
      //   1235: iconst_0
      //   1236: iconst_0
      //   1237: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   1240: invokestatic b : (Li/C;)V
      //   1243: aload_0
      //   1244: iconst_4
      //   1245: putfield h : I
      //   1248: aload #25
      //   1250: iconst_3
      //   1251: iconst_0
      //   1252: invokestatic open : (Ljava/lang/String;IZ)Ljavax/microedition/io/Connection;
      //   1255: checkcast javax/microedition/io/HttpConnection
      //   1258: astore #12
      //   1260: aload_0
      //   1261: iconst_5
      //   1262: putfield h : I
      //   1265: aload #12
      //   1267: ldc 'GET'
      //   1269: invokeinterface setRequestMethod : (Ljava/lang/String;)V
      //   1274: aload #12
      //   1276: ldc 'Connection'
      //   1278: ldc 'close'
      //   1280: invokeinterface setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
      //   1285: aconst_null
      //   1286: astore #29
      //   1288: aload_0
      //   1289: bipush #6
      //   1291: putfield h : I
      //   1294: aload #12
      //   1296: invokeinterface openOutputStream : ()Ljava/io/OutputStream;
      //   1301: astore #29
      //   1303: aload_0
      //   1304: bipush #7
      //   1306: putfield h : I
      //   1309: aload #29
      //   1311: aload #28
      //   1313: invokevirtual write : ([B)V
      //   1316: aload #25
      //   1318: invokevirtual length : ()I
      //   1321: bipush #50
      //   1323: iadd
      //   1324: invokestatic d : (I)V
      //   1327: aload_0
      //   1328: getfield i : Li/PlgForum;
      //   1331: aload #25
      //   1333: invokevirtual length : ()I
      //   1336: bipush #50
      //   1338: iadd
      //   1339: invokestatic a : (Li/PlgForum;I)I
      //   1342: pop
      //   1343: aload_0
      //   1344: bipush #8
      //   1346: putfield h : I
      //   1349: aload #29
      //   1351: ifnull -> 1359
      //   1354: aload #29
      //   1356: invokevirtual close : ()V
      //   1359: goto -> 1363
      //   1362: pop
      //   1363: aload_0
      //   1364: bipush #9
      //   1366: putfield h : I
      //   1369: aload #12
      //   1371: invokeinterface openInputStream : ()Ljava/io/InputStream;
      //   1376: astore #30
      //   1378: aload_0
      //   1379: bipush #10
      //   1381: putfield h : I
      //   1384: aload #12
      //   1386: invokeinterface getResponseCode : ()I
      //   1391: dup
      //   1392: istore #31
      //   1394: sipush #200
      //   1397: if_icmpeq -> 1530
      //   1400: aload_0
      //   1401: bipush #77
      //   1403: putfield h : I
      //   1406: aload #5
      //   1408: invokestatic b : (Li/C;)V
      //   1411: aload_0
      //   1412: getfield i : Li/PlgForum;
      //   1415: aload_0
      //   1416: ldc 'Error'
      //   1418: new java/lang/StringBuffer
      //   1421: dup
      //   1422: invokespecial <init> : ()V
      //   1425: ldc 'No connection! Error:'
      //   1427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1430: iload #31
      //   1432: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   1435: invokevirtual toString : ()Ljava/lang/String;
      //   1438: ldc ''
      //   1440: invokestatic a : ()J
      //   1443: iconst_1
      //   1444: iconst_1
      //   1445: bipush #16
      //   1447: iconst_0
      //   1448: iconst_0
      //   1449: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   1452: pop
      //   1453: aload_1
      //   1454: ldc ''
      //   1456: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1459: ifne -> 1503
      //   1462: aload_0
      //   1463: getfield i : Li/PlgForum;
      //   1466: aload_0
      //   1467: ldc 'Error, No send:'
      //   1469: new java/lang/StringBuffer
      //   1472: dup
      //   1473: invokespecial <init> : ()V
      //   1476: ldc ''
      //   1478: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1481: aload_1
      //   1482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1485: invokevirtual toString : ()Ljava/lang/String;
      //   1488: ldc ''
      //   1490: invokestatic a : ()J
      //   1493: iconst_1
      //   1494: iconst_1
      //   1495: bipush #16
      //   1497: iconst_0
      //   1498: iconst_0
      //   1499: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   1502: pop
      //   1503: aload_0
      //   1504: iload_2
      //   1505: aload #11
      //   1507: invokevirtual length : ()I
      //   1510: pop
      //   1511: iload #7
      //   1513: iconst_0
      //   1514: invokespecial a : (ZII)V
      //   1517: aload_0
      //   1518: bipush #95
      //   1520: putfield h : I
      //   1523: aload_3
      //   1524: iload #4
      //   1526: invokevirtual setPriority : (I)V
      //   1529: return
      //   1530: aload #12
      //   1532: invokeinterface getType : ()Ljava/lang/String;
      //   1537: pop
      //   1538: aload #12
      //   1540: invokeinterface getLength : ()J
      //   1545: l2i
      //   1546: istore #33
      //   1548: aload_0
      //   1549: bipush #11
      //   1551: putfield h : I
      //   1554: sipush #1024
      //   1557: istore #35
      //   1559: iload #33
      //   1561: bipush #10
      //   1563: if_icmple -> 1572
      //   1566: iload #33
      //   1568: iconst_1
      //   1569: iadd
      //   1570: istore #35
      //   1572: iload #35
      //   1574: newarray byte
      //   1576: astore #34
      //   1578: iconst_0
      //   1579: istore #36
      //   1581: aload_0
      //   1582: bipush #12
      //   1584: putfield h : I
      //   1587: aload #30
      //   1589: invokevirtual read : ()I
      //   1592: dup
      //   1593: istore #37
      //   1595: iconst_m1
      //   1596: if_icmpeq -> 1627
      //   1599: iload #36
      //   1601: aload #34
      //   1603: arraylength
      //   1604: if_icmpge -> 1627
      //   1607: aload_0
      //   1608: bipush #13
      //   1610: putfield h : I
      //   1613: aload #34
      //   1615: iload #36
      //   1617: iinc #36, 1
      //   1620: iload #37
      //   1622: i2b
      //   1623: bastore
      //   1624: goto -> 1587
      //   1627: iload #36
      //   1629: aload #34
      //   1631: arraylength
      //   1632: if_icmpne -> 1700
      //   1635: aload_0
      //   1636: bipush #14
      //   1638: putfield h : I
      //   1641: aload #34
      //   1643: arraylength
      //   1644: aload #34
      //   1646: arraylength
      //   1647: iadd
      //   1648: newarray byte
      //   1650: astore #38
      //   1652: aload #34
      //   1654: iconst_0
      //   1655: aload #38
      //   1657: iconst_0
      //   1658: aload #34
      //   1660: arraylength
      //   1661: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
      //   1664: aload #38
      //   1666: astore #34
      //   1668: iload #37
      //   1670: iconst_m1
      //   1671: if_icmpeq -> 1685
      //   1674: aload #34
      //   1676: iload #36
      //   1678: iinc #36, 1
      //   1681: iload #37
      //   1683: i2b
      //   1684: bastore
      //   1685: aload_0
      //   1686: bipush #15
      //   1688: putfield h : I
      //   1691: aload_0
      //   1692: bipush #16
      //   1694: putfield h : I
      //   1697: goto -> 1587
      //   1700: aload_0
      //   1701: bipush #78
      //   1703: putfield h : I
      //   1706: aload #30
      //   1708: ifnull -> 1716
      //   1711: aload #30
      //   1713: invokevirtual close : ()V
      //   1716: aload #12
      //   1718: ifnull -> 1728
      //   1721: aload #12
      //   1723: invokeinterface close : ()V
      //   1728: aconst_null
      //   1729: astore #12
      //   1731: goto -> 1735
      //   1734: pop
      //   1735: iload #36
      //   1737: bipush #20
      //   1739: iadd
      //   1740: invokestatic b : (I)V
      //   1743: aload_0
      //   1744: getfield i : Li/PlgForum;
      //   1747: iload #36
      //   1749: bipush #20
      //   1751: iadd
      //   1752: invokestatic a : (Li/PlgForum;I)I
      //   1755: pop
      //   1756: iload #36
      //   1758: newarray byte
      //   1760: astore #38
      //   1762: aload #34
      //   1764: iconst_0
      //   1765: aload #38
      //   1767: iconst_0
      //   1768: iload #36
      //   1770: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
      //   1773: aload_0
      //   1774: bipush #17
      //   1776: putfield h : I
      //   1779: aconst_null
      //   1780: astore #39
      //   1782: aload_0
      //   1783: bipush #18
      //   1785: putfield h : I
      //   1788: aload #38
      //   1790: arraylength
      //   1791: iconst_3
      //   1792: if_icmple -> 1883
      //   1795: aload #38
      //   1797: iconst_0
      //   1798: baload
      //   1799: bipush #119
      //   1801: if_icmpne -> 1867
      //   1804: aload #38
      //   1806: iconst_1
      //   1807: baload
      //   1808: bipush #105
      //   1810: if_icmpne -> 1867
      //   1813: aload #38
      //   1815: iconst_2
      //   1816: baload
      //   1817: bipush #110
      //   1819: if_icmpne -> 1867
      //   1822: aload #38
      //   1824: iconst_0
      //   1825: aload #38
      //   1827: arraylength
      //   1828: invokestatic g : ([BII)Ljava/lang/String;
      //   1831: astore #39
      //   1833: getstatic java/lang/System.out : Ljava/io/PrintStream;
      //   1836: new java/lang/StringBuffer
      //   1839: dup
      //   1840: invokespecial <init> : ()V
      //   1843: ldc '"'
      //   1845: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1848: aload #39
      //   1850: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1853: ldc '"'
      //   1855: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   1858: invokevirtual toString : ()Ljava/lang/String;
      //   1861: invokevirtual println : (Ljava/lang/String;)V
      //   1864: goto -> 1896
      //   1867: new java/lang/String
      //   1870: dup
      //   1871: aload #38
      //   1873: ldc 'utf-8'
      //   1875: invokespecial <init> : ([BLjava/lang/String;)V
      //   1878: astore #39
      //   1880: goto -> 1896
      //   1883: new java/lang/String
      //   1886: dup
      //   1887: aload #38
      //   1889: ldc 'utf-8'
      //   1891: invokespecial <init> : ([BLjava/lang/String;)V
      //   1894: astore #39
      //   1896: aload_0
      //   1897: bipush #19
      //   1899: putfield h : I
      //   1902: goto -> 1972
      //   1905: pop
      //   1906: aload #5
      //   1908: invokestatic b : (Li/C;)V
      //   1911: aload_0
      //   1912: getfield i : Li/PlgForum;
      //   1915: aload_0
      //   1916: ldc 'Error'
      //   1918: ldc 'Encoding error!'
      //   1920: ldc ''
      //   1922: invokestatic a : ()J
      //   1925: iconst_1
      //   1926: iconst_1
      //   1927: bipush #16
      //   1929: iconst_0
      //   1930: iconst_0
      //   1931: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   1934: pop
      //   1935: aload_0
      //   1936: getfield i : Li/PlgForum;
      //   1939: invokestatic a : (Li/PlgForum;)[Z
      //   1942: iconst_2
      //   1943: baload
      //   1944: ifne -> 1965
      //   1947: aload_0
      //   1948: getfield i : Li/PlgForum;
      //   1951: aload_0
      //   1952: aload #5
      //   1954: aload_1
      //   1955: aload_0
      //   1956: getfield i : Li/PlgForum;
      //   1959: getfield e : Ljava/lang/String;
      //   1962: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Li/C;Ljava/lang/String;Ljava/lang/String;)V
      //   1965: aload_3
      //   1966: iload #4
      //   1968: invokevirtual setPriority : (I)V
      //   1971: return
      //   1972: aload_0
      //   1973: bipush #20
      //   1975: putfield h : I
      //   1978: aload #39
      //   1980: ldc '\\n'
      //   1982: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      //   1985: astore #40
      //   1987: iconst_0
      //   1988: istore #41
      //   1990: iload #41
      //   1992: aload #40
      //   1994: arraylength
      //   1995: if_icmpge -> 2043
      //   1998: getstatic java/lang/System.out : Ljava/io/PrintStream;
      //   2001: new java/lang/StringBuffer
      //   2004: dup
      //   2005: invokespecial <init> : ()V
      //   2008: ldc '['
      //   2010: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   2013: iload #41
      //   2015: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   2018: ldc ']='
      //   2020: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   2023: aload #40
      //   2025: iload #41
      //   2027: aaload
      //   2028: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   2031: invokevirtual toString : ()Ljava/lang/String;
      //   2034: invokevirtual println : (Ljava/lang/String;)V
      //   2037: iinc #41, 1
      //   2040: goto -> 1990
      //   2043: aload_0
      //   2044: bipush #21
      //   2046: putfield h : I
      //   2049: iconst_0
      //   2050: istore #41
      //   2052: iconst_0
      //   2053: istore #43
      //   2055: iload #43
      //   2057: aload #40
      //   2059: arraylength
      //   2060: if_icmpge -> 3010
      //   2063: aload_0
      //   2064: bipush #22
      //   2066: putfield h : I
      //   2069: aload #40
      //   2071: iload #43
      //   2073: iinc #43, 1
      //   2076: aaload
      //   2077: astore #39
      //   2079: aload_0
      //   2080: bipush #23
      //   2082: putfield h : I
      //   2085: aload #39
      //   2087: ldc '---mod---'
      //   2089: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2092: ifeq -> 2151
      //   2095: aload_0
      //   2096: getfield i : Li/PlgForum;
      //   2099: invokestatic g : (Li/PlgForum;)Z
      //   2102: ifne -> 2055
      //   2105: aload_0
      //   2106: getfield i : Li/PlgForum;
      //   2109: iconst_1
      //   2110: invokestatic b : (Li/PlgForum;Z)Z
      //   2113: pop
      //   2114: aload_0
      //   2115: getfield i : Li/PlgForum;
      //   2118: invokestatic i : (Li/PlgForum;)Ljava/util/Vector;
      //   2121: aload_0
      //   2122: getfield i : Li/PlgForum;
      //   2125: invokestatic h : (Li/PlgForum;)Ljavax/microedition/lcdui/Command;
      //   2128: invokevirtual addElement : (Ljava/lang/Object;)V
      //   2131: aload_0
      //   2132: getfield i : Li/PlgForum;
      //   2135: invokestatic i : (Li/PlgForum;)Ljava/util/Vector;
      //   2138: aload_0
      //   2139: getfield i : Li/PlgForum;
      //   2142: invokestatic j : (Li/PlgForum;)Ljavax/microedition/lcdui/Command;
      //   2145: invokevirtual addElement : (Ljava/lang/Object;)V
      //   2148: goto -> 2055
      //   2151: aload #39
      //   2153: ldc '---cmd---'
      //   2155: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2158: ifeq -> 2289
      //   2161: aload_0
      //   2162: bipush #124
      //   2164: putfield h : I
      //   2167: iinc #8, 1
      //   2170: aload #40
      //   2172: iload #43
      //   2174: iinc #43, 1
      //   2177: aaload
      //   2178: astore #44
      //   2180: aconst_null
      //   2181: astore #45
      //   2183: aload #44
      //   2185: ldc 'roomurl:'
      //   2187: invokevirtual startsWith : (Ljava/lang/String;)Z
      //   2190: ifeq -> 2246
      //   2193: aload_0
      //   2194: getfield d : [Ljava/lang/String;
      //   2197: iconst_3
      //   2198: aload #44
      //   2200: bipush #8
      //   2202: invokevirtual substring : (I)Ljava/lang/String;
      //   2205: aastore
      //   2206: new java/lang/StringBuffer
      //   2209: dup
      //   2210: invokespecial <init> : ()V
      //   2213: ldc 'Сменился URL для комнаты: '
      //   2215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   2218: aload_0
      //   2219: getfield d : [Ljava/lang/String;
      //   2222: iconst_3
      //   2223: aaload
      //   2224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   2227: invokevirtual toString : ()Ljava/lang/String;
      //   2230: astore #45
      //   2232: aload_0
      //   2233: getfield c : [I
      //   2236: iconst_2
      //   2237: iconst_m1
      //   2238: iastore
      //   2239: aload_0
      //   2240: getfield i : Li/PlgForum;
      //   2243: invokestatic k : (Li/PlgForum;)V
      //   2246: aload #45
      //   2248: ifnull -> 2280
      //   2251: aload #5
      //   2253: invokestatic b : (Li/C;)V
      //   2256: aload_0
      //   2257: getfield i : Li/PlgForum;
      //   2260: aload_0
      //   2261: ldc 'Info:'
      //   2263: aload #45
      //   2265: ldc ''
      //   2267: invokestatic a : ()J
      //   2270: iconst_1
      //   2271: iconst_1
      //   2272: bipush #17
      //   2274: iconst_0
      //   2275: iconst_1
      //   2276: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   2279: pop
      //   2280: aload_0
      //   2281: bipush #125
      //   2283: putfield h : I
      //   2286: goto -> 2055
      //   2289: aload #39
      //   2291: ldc '---info---'
      //   2293: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2296: ifeq -> 2352
      //   2299: aload_0
      //   2300: bipush #24
      //   2302: putfield h : I
      //   2305: iinc #8, 1
      //   2308: aload #5
      //   2310: invokestatic b : (Li/C;)V
      //   2313: aload_0
      //   2314: getfield i : Li/PlgForum;
      //   2317: aload_0
      //   2318: ldc 'Info:'
      //   2320: aload #40
      //   2322: iload #43
      //   2324: iinc #43, 1
      //   2327: aaload
      //   2328: ldc ''
      //   2330: invokestatic a : ()J
      //   2333: iconst_1
      //   2334: iconst_1
      //   2335: bipush #17
      //   2337: iconst_0
      //   2338: iconst_1
      //   2339: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   2342: pop
      //   2343: aload_0
      //   2344: bipush #25
      //   2346: putfield h : I
      //   2349: goto -> 2055
      //   2352: aload #39
      //   2354: ldc '---error---'
      //   2356: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2359: ifeq -> 2415
      //   2362: aload_0
      //   2363: bipush #26
      //   2365: putfield h : I
      //   2368: aload #5
      //   2370: invokestatic b : (Li/C;)V
      //   2373: aload_0
      //   2374: getfield i : Li/PlgForum;
      //   2377: aload_0
      //   2378: ldc 'Error:'
      //   2380: aload #40
      //   2382: iload #43
      //   2384: iinc #43, 1
      //   2387: aaload
      //   2388: ldc ''
      //   2390: invokestatic a : ()J
      //   2393: iconst_1
      //   2394: iconst_1
      //   2395: bipush #16
      //   2397: iconst_0
      //   2398: iconst_0
      //   2399: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   2402: pop
      //   2403: iconst_1
      //   2404: istore #41
      //   2406: aload_0
      //   2407: bipush #27
      //   2409: putfield h : I
      //   2412: goto -> 2055
      //   2415: aload #39
      //   2417: ldc '---start---'
      //   2419: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2422: ifeq -> 2832
      //   2425: aload_0
      //   2426: bipush #28
      //   2428: putfield h : I
      //   2431: aload #40
      //   2433: iload #43
      //   2435: iinc #43, 1
      //   2438: aaload
      //   2439: invokestatic parseInt : (Ljava/lang/String;)I
      //   2442: pop
      //   2443: aload_0
      //   2444: bipush #29
      //   2446: putfield h : I
      //   2449: aload #40
      //   2451: iload #43
      //   2453: iinc #43, 1
      //   2456: aaload
      //   2457: invokestatic parseLong : (Ljava/lang/String;)J
      //   2460: lstore #45
      //   2462: aload_0
      //   2463: bipush #30
      //   2465: putfield h : I
      //   2468: aload_0
      //   2469: bipush #31
      //   2471: putfield h : I
      //   2474: invokestatic a : ()J
      //   2477: lload #45
      //   2479: lsub
      //   2480: lstore #47
      //   2482: aload #40
      //   2484: iload #43
      //   2486: iinc #43, 1
      //   2489: aaload
      //   2490: invokestatic parseInt : (Ljava/lang/String;)I
      //   2493: istore #49
      //   2495: aload_0
      //   2496: bipush #32
      //   2498: putfield h : I
      //   2501: lconst_0
      //   2502: lstore #50
      //   2504: iload #8
      //   2506: iload #49
      //   2508: iadd
      //   2509: istore #8
      //   2511: iconst_0
      //   2512: istore #54
      //   2514: iload #54
      //   2516: iload #49
      //   2518: if_icmpge -> 2801
      //   2521: iconst_0
      //   2522: istore #55
      //   2524: aload_0
      //   2525: bipush #33
      //   2527: putfield h : I
      //   2530: aload #40
      //   2532: iload #43
      //   2534: iinc #43, 1
      //   2537: aaload
      //   2538: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   2541: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
      //   2544: dup
      //   2545: astore #56
      //   2547: ldc '---finish---'
      //   2549: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2552: ifeq -> 2558
      //   2555: goto -> 2801
      //   2558: aload_0
      //   2559: bipush #34
      //   2561: putfield h : I
      //   2564: aload #40
      //   2566: iload #43
      //   2568: iinc #43, 1
      //   2571: aaload
      //   2572: invokestatic parseLong : (Ljava/lang/String;)J
      //   2575: lstore #57
      //   2577: lload #50
      //   2579: lload #57
      //   2581: ladd
      //   2582: lstore #50
      //   2584: aload_0
      //   2585: bipush #36
      //   2587: putfield h : I
      //   2590: aload #40
      //   2592: iload #43
      //   2594: iinc #43, 1
      //   2597: aaload
      //   2598: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   2601: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
      //   2604: astore #59
      //   2606: aload_0
      //   2607: bipush #37
      //   2609: putfield h : I
      //   2612: aload #40
      //   2614: iload #43
      //   2616: iinc #43, 1
      //   2619: aaload
      //   2620: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   2623: astore #60
      //   2625: aload_0
      //   2626: getfield i : Li/PlgForum;
      //   2629: invokestatic a : (Li/PlgForum;)[Z
      //   2632: bipush #8
      //   2634: baload
      //   2635: ifeq -> 2669
      //   2638: aload #60
      //   2640: invokevirtual length : ()I
      //   2643: iconst_2
      //   2644: if_icmple -> 2669
      //   2647: aload #60
      //   2649: ldc ','
      //   2651: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      //   2654: astore #61
      //   2656: aload #61
      //   2658: iconst_0
      //   2659: aaload
      //   2660: invokestatic parseInt : (Ljava/lang/String;)I
      //   2663: istore #55
      //   2665: goto -> 2669
      //   2668: pop
      //   2669: aload_0
      //   2670: bipush #38
      //   2672: putfield h : I
      //   2675: lload #50
      //   2677: aload_0
      //   2678: getfield c : [I
      //   2681: iconst_1
      //   2682: iaload
      //   2683: i2l
      //   2684: lcmp
      //   2685: iflt -> 2778
      //   2688: lload #50
      //   2690: aload_0
      //   2691: getfield c : [I
      //   2694: iconst_1
      //   2695: iaload
      //   2696: i2l
      //   2697: lsub
      //   2698: ldc2_w 108000
      //   2701: lcmp
      //   2702: ifle -> 2709
      //   2705: iconst_1
      //   2706: goto -> 2710
      //   2709: iconst_0
      //   2710: istore #61
      //   2712: aload_0
      //   2713: getfield c : [I
      //   2716: iconst_1
      //   2717: lload #50
      //   2719: l2i
      //   2720: iastore
      //   2721: aload #5
      //   2723: invokestatic a : (Li/C;)V
      //   2726: iload #55
      //   2728: sipush #8038
      //   2731: if_icmpeq -> 2739
      //   2734: iload #55
      //   2736: ifne -> 2746
      //   2739: bipush #20
      //   2741: istore #55
      //   2743: goto -> 2751
      //   2746: iload #55
      //   2748: ineg
      //   2749: istore #55
      //   2751: aload_0
      //   2752: getfield i : Li/PlgForum;
      //   2755: aload_0
      //   2756: aload #56
      //   2758: aload #59
      //   2760: ldc ''
      //   2762: lload #50
      //   2764: lload #47
      //   2766: ladd
      //   2767: iconst_1
      //   2768: iload #61
      //   2770: iload #55
      //   2772: iconst_0
      //   2773: iconst_1
      //   2774: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   2777: pop
      //   2778: aload_0
      //   2779: bipush #39
      //   2781: putfield h : I
      //   2784: aload_0
      //   2785: ldc2_w 100
      //   2788: invokevirtual wait : (J)V
      //   2791: goto -> 2795
      //   2794: pop
      //   2795: iinc #54, 1
      //   2798: goto -> 2514
      //   2801: aload_0
      //   2802: getfield c : [I
      //   2805: iconst_1
      //   2806: lload #45
      //   2808: l2i
      //   2809: iastore
      //   2810: aload_0
      //   2811: bipush #40
      //   2813: putfield h : I
      //   2816: aload_0
      //   2817: getfield i : Li/PlgForum;
      //   2820: invokestatic k : (Li/PlgForum;)V
      //   2823: aload_0
      //   2824: bipush #41
      //   2826: putfield h : I
      //   2829: goto -> 2055
      //   2832: aload #39
      //   2834: ldc '---first---'
      //   2836: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2839: ifeq -> 2055
      //   2842: aload_0
      //   2843: bipush #42
      //   2845: putfield h : I
      //   2848: aload #40
      //   2850: iload #43
      //   2852: iinc #43, 1
      //   2855: aaload
      //   2856: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   2859: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
      //   2862: astore #44
      //   2864: aload_0
      //   2865: getfield d : [Ljava/lang/String;
      //   2868: iconst_1
      //   2869: aaload
      //   2870: ldc ''
      //   2872: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2875: ifeq -> 2886
      //   2878: aload_0
      //   2879: getfield d : [Ljava/lang/String;
      //   2882: iconst_1
      //   2883: aload #44
      //   2885: aastore
      //   2886: aload_0
      //   2887: bipush #43
      //   2889: putfield h : I
      //   2892: aload #40
      //   2894: iload #43
      //   2896: iinc #43, 1
      //   2899: aaload
      //   2900: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   2903: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
      //   2906: astore #44
      //   2908: aload_0
      //   2909: getfield d : [Ljava/lang/String;
      //   2912: iconst_2
      //   2913: aload #44
      //   2915: aastore
      //   2916: aload_0
      //   2917: bipush #44
      //   2919: putfield h : I
      //   2922: aload_0
      //   2923: getfield c : [I
      //   2926: iconst_2
      //   2927: aload #40
      //   2929: iload #43
      //   2931: iinc #43, 1
      //   2934: aaload
      //   2935: invokestatic parseInt : (Ljava/lang/String;)I
      //   2938: iastore
      //   2939: aload_0
      //   2940: bipush #45
      //   2942: putfield h : I
      //   2945: iinc #43, 1
      //   2948: aload #5
      //   2950: invokestatic b : (Li/C;)V
      //   2953: aload_0
      //   2954: getfield i : Li/PlgForum;
      //   2957: aload_0
      //   2958: aload_0
      //   2959: getfield d : [Ljava/lang/String;
      //   2962: iconst_1
      //   2963: aaload
      //   2964: aload_0
      //   2965: getfield d : [Ljava/lang/String;
      //   2968: iconst_2
      //   2969: aaload
      //   2970: ldc ''
      //   2972: lconst_0
      //   2973: iconst_1
      //   2974: iconst_1
      //   2975: bipush #17
      //   2977: iconst_0
      //   2978: iconst_0
      //   2979: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   2982: pop
      //   2983: aload_0
      //   2984: iconst_1
      //   2985: putfield e : Z
      //   2988: aload_0
      //   2989: bipush #46
      //   2991: putfield h : I
      //   2994: aload_0
      //   2995: getfield i : Li/PlgForum;
      //   2998: invokestatic k : (Li/PlgForum;)V
      //   3001: aload_0
      //   3002: bipush #47
      //   3004: putfield h : I
      //   3007: goto -> 2055
      //   3010: aload_0
      //   3011: getfield e : Z
      //   3014: ifne -> 3083
      //   3017: aload_0
      //   3018: bipush #48
      //   3020: putfield h : I
      //   3023: ldc ''
      //   3025: aload_0
      //   3026: getfield d : [Ljava/lang/String;
      //   3029: iconst_2
      //   3030: aaload
      //   3031: invokevirtual equals : (Ljava/lang/Object;)Z
      //   3034: ifne -> 3072
      //   3037: aload #5
      //   3039: invokestatic b : (Li/C;)V
      //   3042: aload_0
      //   3043: getfield i : Li/PlgForum;
      //   3046: aload_0
      //   3047: aload_0
      //   3048: getfield d : [Ljava/lang/String;
      //   3051: iconst_1
      //   3052: aaload
      //   3053: aload_0
      //   3054: getfield d : [Ljava/lang/String;
      //   3057: iconst_2
      //   3058: aaload
      //   3059: ldc ''
      //   3061: lconst_0
      //   3062: iconst_1
      //   3063: iconst_1
      //   3064: bipush #17
      //   3066: iconst_0
      //   3067: iconst_0
      //   3068: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   3071: pop
      //   3072: aload_0
      //   3073: iconst_1
      //   3074: putfield e : Z
      //   3077: aload_0
      //   3078: bipush #49
      //   3080: putfield h : I
      //   3083: iload #41
      //   3085: ifne -> 3118
      //   3088: aload_0
      //   3089: getfield i : Li/PlgForum;
      //   3092: invokestatic a : (Li/PlgForum;)[Z
      //   3095: iconst_2
      //   3096: baload
      //   3097: ifne -> 3118
      //   3100: aload_0
      //   3101: getfield i : Li/PlgForum;
      //   3104: aload_0
      //   3105: aload #5
      //   3107: aload_1
      //   3108: aload_0
      //   3109: getfield i : Li/PlgForum;
      //   3112: getfield e : Ljava/lang/String;
      //   3115: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Li/C;Ljava/lang/String;Ljava/lang/String;)V
      //   3118: aload_0
      //   3119: getfield i : Li/PlgForum;
      //   3122: bipush #10
      //   3124: aconst_null
      //   3125: aconst_null
      //   3126: invokevirtual request : (I[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   3129: pop
      //   3130: goto -> 3348
      //   3133: astore #13
      //   3135: aload_0
      //   3136: getfield h : I
      //   3139: iconst_2
      //   3140: if_icmpne -> 3165
      //   3143: aload_0
      //   3144: getfield i : Li/PlgForum;
      //   3147: aload_0
      //   3148: ldc 'Error'
      //   3150: ldc 'Введите имя ника в настройках плагина Forum.'
      //   3152: ldc ''
      //   3154: lconst_0
      //   3155: iconst_1
      //   3156: iconst_1
      //   3157: bipush #16
      //   3159: iconst_0
      //   3160: iconst_0
      //   3161: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   3164: pop
      //   3165: aload_0
      //   3166: getfield i : Li/PlgForum;
      //   3169: new java/lang/StringBuffer
      //   3172: dup
      //   3173: invokespecial <init> : ()V
      //   3176: ldc 'Unknown err1: ['
      //   3178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3181: aload_0
      //   3182: getfield h : I
      //   3185: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   3188: ldc ']'
      //   3190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3193: aload #13
      //   3195: invokevirtual getClass : ()Ljava/lang/Class;
      //   3198: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
      //   3201: ldc '{'
      //   3203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3206: aload_0
      //   3207: getfield g : Ljava/lang/String;
      //   3210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3213: ldc '}'
      //   3215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3218: invokevirtual toString : ()Ljava/lang/String;
      //   3221: invokestatic a : (Li/PlgForum;Ljava/lang/String;)Ljava/lang/String;
      //   3224: pop
      //   3225: aload #13
      //   3227: invokevirtual printStackTrace : ()V
      //   3230: aload #5
      //   3232: invokestatic b : (Li/C;)V
      //   3235: aload_0
      //   3236: getfield i : Li/PlgForum;
      //   3239: aload_0
      //   3240: ldc 'Error'
      //   3242: new java/lang/StringBuffer
      //   3245: dup
      //   3246: invokespecial <init> : ()V
      //   3249: ldc 'Unknown err1: ['
      //   3251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3254: aload_0
      //   3255: getfield h : I
      //   3258: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   3261: ldc ']'
      //   3263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3266: aload #13
      //   3268: invokevirtual getClass : ()Ljava/lang/Class;
      //   3271: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
      //   3274: invokevirtual toString : ()Ljava/lang/String;
      //   3277: ldc ''
      //   3279: lconst_0
      //   3280: iconst_1
      //   3281: iconst_1
      //   3282: bipush #16
      //   3284: iconst_0
      //   3285: iconst_0
      //   3286: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   3289: pop
      //   3290: aload_0
      //   3291: getfield i : Li/PlgForum;
      //   3294: invokestatic a : (Li/PlgForum;)[Z
      //   3297: iconst_2
      //   3298: baload
      //   3299: ifne -> 3320
      //   3302: aload_0
      //   3303: getfield i : Li/PlgForum;
      //   3306: aload_0
      //   3307: aload #5
      //   3309: aload_1
      //   3310: aload_0
      //   3311: getfield i : Li/PlgForum;
      //   3314: getfield e : Ljava/lang/String;
      //   3317: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Li/C;Ljava/lang/String;Ljava/lang/String;)V
      //   3320: aload_0
      //   3321: iload_2
      //   3322: iload #7
      //   3324: iload #8
      //   3326: invokespecial a : (ZII)V
      //   3329: aload #12
      //   3331: ifnull -> 3341
      //   3334: aload #12
      //   3336: invokeinterface close : ()V
      //   3341: aload_3
      //   3342: iload #4
      //   3344: invokevirtual setPriority : (I)V
      //   3347: return
      //   3348: aload_0
      //   3349: bipush #50
      //   3351: putfield h : I
      //   3354: aload_0
      //   3355: iload_2
      //   3356: aload #11
      //   3358: invokevirtual length : ()I
      //   3361: pop
      //   3362: iload #7
      //   3364: iload #8
      //   3366: invokespecial a : (ZII)V
      //   3369: aload_0
      //   3370: bipush #94
      //   3372: putfield h : I
      //   3375: aload_3
      //   3376: iload #4
      //   3378: invokevirtual setPriority : (I)V
      //   3381: return
      //   3382: astore #11
      //   3384: aload_0
      //   3385: getfield i : Li/PlgForum;
      //   3388: new java/lang/StringBuffer
      //   3391: dup
      //   3392: invokespecial <init> : ()V
      //   3395: ldc 'Unknown err2: ['
      //   3397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3400: aload_0
      //   3401: getfield h : I
      //   3404: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   3407: ldc ']'
      //   3409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3412: aload #11
      //   3414: invokevirtual getClass : ()Ljava/lang/Class;
      //   3417: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
      //   3420: ldc '{'
      //   3422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3425: aload_0
      //   3426: getfield g : Ljava/lang/String;
      //   3429: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3432: ldc '}'
      //   3434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3437: invokevirtual toString : ()Ljava/lang/String;
      //   3440: invokestatic a : (Li/PlgForum;Ljava/lang/String;)Ljava/lang/String;
      //   3443: pop
      //   3444: aload #11
      //   3446: invokevirtual printStackTrace : ()V
      //   3449: aload_0
      //   3450: getfield i : Li/PlgForum;
      //   3453: aload_0
      //   3454: ldc 'Error'
      //   3456: new java/lang/StringBuffer
      //   3459: dup
      //   3460: invokespecial <init> : ()V
      //   3463: ldc 'Unknown err2: ['
      //   3465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3468: aload_0
      //   3469: getfield h : I
      //   3472: invokevirtual append : (I)Ljava/lang/StringBuffer;
      //   3475: ldc ']'
      //   3477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   3480: aload #11
      //   3482: invokevirtual getClass : ()Ljava/lang/Class;
      //   3485: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
      //   3488: invokevirtual toString : ()Ljava/lang/String;
      //   3491: ldc ''
      //   3493: lconst_0
      //   3494: iconst_1
      //   3495: iconst_1
      //   3496: bipush #16
      //   3498: iconst_0
      //   3499: iconst_0
      //   3500: invokestatic a : (Li/PlgForum;Li/PlgForum$PlgForumI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZIIZ)Li/C;
      //   3503: invokestatic b : (Li/C;)V
      //   3506: aload_3
      //   3507: iload #4
      //   3509: invokevirtual setPriority : (I)V
      //   3512: return
      //   3513: astore #63
      //   3515: aload_3
      //   3516: iload #4
      //   3518: invokevirtual setPriority : (I)V
      //   3521: aload #63
      //   3523: athrow
      // Exception table:
      //   from	to	target	type
      //   15	1523	3513	finally
      //   54	1523	3382	java/lang/Exception
      //   81	1523	3133	java/lang/Exception
      //   213	220	223	java/lang/Exception
      //   1349	1359	1362	java/lang/Throwable
      //   1530	1965	3133	java/lang/Exception
      //   1530	1965	3382	java/lang/Exception
      //   1530	1965	3513	finally
      //   1706	1731	1734	java/lang/Throwable
      //   1782	1902	1905	java/lang/Exception
      //   1972	3130	3133	java/lang/Exception
      //   1972	3341	3382	java/lang/Exception
      //   1972	3341	3513	finally
      //   2656	2665	2668	java/lang/Exception
      //   2784	2791	2794	java/lang/Exception
      //   3348	3375	3382	java/lang/Exception
      //   3348	3375	3513	finally
      //   3382	3506	3513	finally
      //   3513	3515	3513	finally
    }
    
    private static void a(C param1C) {
      int i = param1C.getIntValue(67) + 1;
      ((dm)param1C).a(67, i);
    }
    
    private static void b(C param1C) {
      if (param1C != null)
        ((dm)param1C).a(69, param1C.getIntValue(69) + 1); 
    }
    
    private void a(boolean param1Boolean, int param1Int1, int param1Int2) {
      if (this.b[1] && this.b[0]) {
        if (this.c[0] < 0)
          this.c[0] = 1; 
        int i = this.c[0] * 60 * 1000;
        if (param1Boolean && param1Int2 == 0)
          i = this.c[0] * 5 * 60 * 1000; 
        if (param1Boolean && param1Int2 > 0 && param1Int1 == 0)
          i = this.c[0] * 3 * 60 * 1000; 
        if (i == 0)
          i = 60000; 
        a(i);
      } 
    }
    
    public static PlgForumI a(PlgForumI param1PlgForumI, String param1String, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, boolean param1Boolean4, boolean param1Boolean5, int param1Int) {
      return param1PlgForumI.a(param1String, param1Boolean1, param1Boolean2, param1Boolean3, param1Boolean4, param1Boolean5, param1Int);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\i\PlgForum.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */