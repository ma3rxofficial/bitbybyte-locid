import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.Screen;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
import jimm.Jimm;

public final class cp implements CommandListener, ItemStateListener {
  public String[] a = new String[] { 
      "RU:Билайн 17р", "4445", "RU:МТС 17р", "4445", "RU:Мегафон 17р", "3833", "RU:Теле2,МОТИВ,.. 17р (3833)", "3833", "RU:UTEL,.. 17р (4445)", "4445", 
      "Украина 8гр.", "7054", "Белоруссия 6900 BYR.", "9993", "Казахстан 0.99 ye.", "4446" };
  
  private Display m;
  
  public static boolean[] b = new boolean[] { true, true, true, false };
  
  private static int[] n = new int[] { 0, 0, 0, 0 };
  
  private static String[] o = new String[] { "" };
  
  public static String c = "" + (((361 + n[1]) * 2 * 2 * 2 * 3 - 1) * 5000 + 171) + '0';
  
  private Form p = null;
  
  private Form q = null;
  
  public static ChoiceGroup d;
  
  private ChoiceGroup r;
  
  private ChoiceGroup s;
  
  private TextField t;
  
  private ChoiceGroup u;
  
  public static String e = "";
  
  public static PI f = null;
  
  private int v = 0;
  
  public static cp g;
  
  private static int w;
  
  private static int[] x;
  
  private static Vector y = new Vector();
  
  private static Vector z = new Vector();
  
  public static int h = 0;
  
  public static PI[] i;
  
  public static String[] j;
  
  public static boolean k = false;
  
  private be A;
  
  public static cf l = new cf();
  
  public static String a() {
    return "plgEnj";
  }
  
  private static Object a(Object[] paramArrayOfObject) {
    String str;
    dm dm;
    if ((dm = bi.a(str = (String)paramArrayOfObject[0])) == null)
      dm = new dm(0, 0, str, str, true, false); 
    if (paramArrayOfObject.length == 2) {
      dw.a((String)paramArrayOfObject[1], dm, (byte)2);
    } else if (paramArrayOfObject.length > 2) {
      byte b = 2;
      if ("no".equals(paramArrayOfObject[2]))
        b = 0; 
      if ("yes".equals(paramArrayOfObject[2]))
        b = 1; 
      dw.a((String)paramArrayOfObject[1], dm, b);
    } 
    return null;
  }
  
  public final void itemStateChanged(Item paramItem) {}
  
  public static void a(String paramString1, String paramString2, String paramString3) {
    try {
      String str = "http://fay.by/locid/support.php?s=";
      HttpConnection httpConnection;
      if ((httpConnection = (HttpConnection)Connector.open(str + dw.b(paramString2))).getResponseCode() == 200)
        try {
          InputStream inputStream = httpConnection.openInputStream();
          byte[] arrayOfByte = new byte[100];
          int i = inputStream.read(arrayOfByte);
          String[] arrayOfString;
          if ((arrayOfString = dh.a(new String(arrayOfByte, 0, i), "|"))[0].length() < 4)
            throw new Exception(); 
          MessageConnection messageConnection;
          TextMessage textMessage;
          (textMessage = (TextMessage)(messageConnection = (MessageConnection)Connector.open("sms://" + paramString1)).newMessage("text")).setPayloadText(arrayOfString[0].trim() + " " + paramString3);
          messageConnection.send((Message)textMessage);
          messageConnection.close();
          String str1 = "Ваше сообщение принято!";
          if (d != null && d.getSelectedIndex() != 0 && d.getSelectedIndex() != 3)
            str1 = str1 + " Служба поддержки ответит в ближайшее время."; 
          Alert alert;
          (alert = new Alert("InfoSupport", str1, null, AlertType.INFO)).setTimeout(-2);
          g.a(alert);
          return;
        } catch (Exception exception) {
          throw new Exception();
        }  
      throw new Exception();
    } catch (Exception exception) {
      Alert alert;
      (alert = new Alert("InfoSupport", "Сообщение не удалось отправить, проверьте настройки, либо напишите на нам нашем сайте.", null, AlertType.ERROR)).setTimeout(-2);
      g.a(alert);
      return;
    } 
  }
  
  private static Class a(String paramString) throws Exception {
    try {
      return Class.forName(paramString);
    } catch (Throwable throwable) {
      throw new Exception();
    } 
  }
  
  public cp(Display paramDisplay) {
    g = this;
    this.m = paramDisplay;
    a(a((PI)null));
    Jimm.g = (n[2] != 0);
    byte b1 = 0;
    ef.a(bb.a((short)739));
    ef.b(60);
    if (b[0])
      for (byte b = 0; b < y.size(); b++) {
        ef.a(bb.a((short)739) + " " + b);
        ef.b(60 + b * 5 / y.size());
        PI pI = null;
        try {
          pI = a(y.elementAt(b)).newInstance();
        } catch (Exception exception) {
        
        } catch (Throwable throwable) {}
        y.setElementAt(pI, b);
        if (pI != null)
          b1++; 
      }  
    w = b1;
    i = new PI[w];
    j = new String[w];
    x = new int[w];
    b1 = 0;
    byte b2;
    for (b2 = 0; b2 < y.size(); b2++) {
      PI pI;
      if ((pI = (PI)y.elementAt(b2)) != null && pI instanceof PI) {
        PI pI1 = pI;
        i[b1] = pI1;
        x[b1] = ((Integer)z.elementAt(b2)).intValue();
        b1++;
      } 
    } 
    y = null;
    z = null;
    this.A = new be(bb.a((short)674));
    this.A.a(dw.f, bd.aa);
    this.A.a(dw.q, bd.Z);
    this.A.a(this);
    this.A.z();
    this.A.e(3);
    this.A.u = true;
    for (b2 = 0; b2 < i.length; b2++) {
      I i1;
      if ((i1 = i[b2].getIcon()) == null)
        i1 = bi.c.a(0); 
      dw.a(this.A, j[b2] = i[b2].getName(), i1, b2);
    } 
    I i;
    if ((i = bi.c.a(1)) == null)
      i = bi.c.a(0); 
    dw.a(this.A, bb.a((short)680), i, i.length, 53);
    dw.a(this.A, bb.a((short)839), i, i.length + 1, 48);
    a(0, new Object[] { paramDisplay, new Integer(78) }, paramDisplay);
    dh.C[5] = 78;
    dh.C[4] = 0;
    dh.B[15] = 78;
    dh.B[14] = 0;
    String str = "|" + dw.a();
    boolean bool = false;
    String[] arrayOfString = { 
        "Unknown", "Nokia", "SonyEricsson", "Siemens", "Samsung", "Motorola", "Jbed", "Fly", "HP", "LG", 
        "Benq", "X", "Sun" };
    for (byte b3 = 0; b3 < arrayOfString.length; b3++) {
      if (str.indexOf("|" + arrayOfString[b3]) > 0) {
        dh.B[13] = (byte)b3;
        dh.C[6] = (byte)b3;
        break;
      } 
    } 
    k = true;
  }
  
  private void a(Alert paramAlert) {
    this.A.u(em.d[1]);
    this.A.v(em.v[40]);
    if (paramAlert == null) {
      this.A.b(Jimm.d);
      return;
    } 
    this.A.a(Jimm.d, paramAlert);
  }
  
  public final void b() {
    a((Alert)null);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == dw.d) {
      d();
      b();
      return;
    } 
    if (paramCommand == dw.f) {
      if ((paramDisplayable == this.p || paramDisplayable == this.q) && paramDisplayable != null) {
        b();
        return;
      } 
      cy.f();
      return;
    } 
    if (paramCommand == dw.q) {
      int i;
      if ((i = this.A.A()) == i.length) {
        e();
        return;
      } 
      if (i == i.length + 1) {
        f();
        return;
      } 
      if (i >= 0) {
        h = 0;
        try {
          i[i].activate(2, null, Jimm.d);
          return;
        } catch (Exception exception) {
          return;
        } 
      } 
      return;
    } 
    if (paramCommand == dw.n) {
      Alert alert;
      (alert = new Alert("info", "Fay Plugins Core", null, AlertType.INFO)).setTimeout(-2);
      Jimm.d.setCurrent((Displayable)alert);
      return;
    } 
    if (paramCommand == dw.t) {
      d();
      n[3] = this.s.getSelectedIndex();
      String str;
      if ((str = this.t.getString()).startsWith("SUP:")) {
        Jimm.g = true;
        n[2] = 1;
        g();
      } else {
        d.getSelectedIndex();
        b(str);
        Alert alert;
        (alert = new Alert("InfoSupport", "Wait", null, AlertType.INFO)).setTimeout(-2);
        g.a(alert);
        return;
      } 
      this.t.setString("");
      b();
    } 
  }
  
  private void b(String paramString) {
    String str1 = em.c(-1);
    if ("".equals(str1))
      str1 = "0"; 
    Random random;
    (random = new Random()).setSeed(System.currentTimeMillis());
    int i = 0;
    i = (random.nextInt() | 0x800000) & 0xFFFFFF;
    String str2 = this.a[n[3] * 2 + 1];
    String str3 = "#";
    if (this.r != null) {
      int j;
      if ((j = this.r.getSelectedIndex()) < this.v) {
        str3 = "" + j;
      } else {
        str3 = i[j - this.v].getClass().getName();
      } 
    } 
    if (d != null) {
      str3 = "" + d.getSelectedIndex() + " " + str3;
    } else {
      str3 = "# " + str3;
    } 
    String str4;
    String str5;
    (str5 = et.b(str4 = str1 + " " + Integer.toHexString(i) + " " + str3 + " " + paramString)).replace('\n', ' ');
    str5.replace('\r', ' ');
    str5.replace('\t', ' ');
    if (str5.length() > 120)
      str5 = str5.substring(0, 120); 
    System.out.println("Addres: " + str2);
    System.out.println("BodyS: " + str5);
    System.out.println("BodyH: " + str4);
    g();
    fb.a(21, new Object[] { str2, str4, str5 });
  }
  
  private void d() {
    if (this.u != null) {
      boolean[] arrayOfBoolean = new boolean[this.u.size()];
      this.u.getSelectedFlags(arrayOfBoolean);
      if (b[0] != arrayOfBoolean[0] || b[1] != arrayOfBoolean[1] || b[2] != arrayOfBoolean[2] || b[3] != arrayOfBoolean[3]) {
        b[0] = arrayOfBoolean[0];
        b[1] = arrayOfBoolean[1];
        b[2] = arrayOfBoolean[2];
        b[3] = arrayOfBoolean[3];
        g();
      } 
    } 
  }
  
  private void e() {
    if (this.p == null) {
      this.p = new Form(bb.a((short)680));
      this.p.setCommandListener(this);
      this.p.addCommand(dw.d);
      this.p.addCommand(dw.f);
      this.u = new ChoiceGroup(bb.a((short)688), 2, new String[] { bb.a((short)689), bb.a((short)700), bb.a((short)703), bb.a((short)827) }, null);
      this.p.append((Item)this.u);
      this.p.append(bb.a((short)701) + 'N' + bb.a((short)702) + "410454751" + "," + c);
    } 
    this.u.setSelectedIndex(0, b[0]);
    this.u.setSelectedIndex(1, b[1]);
    this.u.setSelectedIndex(2, b[2]);
    this.u.setSelectedIndex(3, b[3]);
    Jimm.d.setCurrent((Displayable)this.p);
  }
  
  private void f() {
    if (this.q == null) {
      this.q = new Form(bb.a((short)839));
      this.q.setCommandListener(this);
      this.q.addCommand(dw.f);
      this.q.addCommand(dw.t);
      d = new ChoiceGroup(bb.a((short)681), 4, new String[] { bb.a((short)683), bb.a((short)682), bb.a((short)684), bb.a((short)685), bb.a((short)686) }, null);
      this.r = new ChoiceGroup("Выберите плагин:", 4);
      this.r.append("LocID (вопросы не! по плагинам)", null);
      this.r.append("Сайт fay.by", null);
      this.r.append("Сайт loc-id.ru", null);
      this.r.append("FAy", null);
      this.r.append("Shol", null);
      this.r.append("Esprit", null);
      this.r.append("MyIE", null);
      this.v = this.r.size();
      byte b;
      for (b = 0; b < i.length; b++)
        this.r.append(j[b], null); 
      this.t = dw.a(new TextField(bb.a((short)687), "", 500, 0));
      this.q.append("SMS-Служба технической поддержки, здеь вы можете высказать предложения напрямую разработчикам, а не через модераторов на сайте.");
      this.s = new ChoiceGroup("Ваш оператор:", 4);
      for (b = 0; b < this.a.length; b += 2)
        this.s.append(this.a[b], null); 
      this.q.append((Item)d);
      this.q.append((Item)this.r);
      this.q.append((Item)this.s);
      this.q.append((Item)this.t);
    } 
    Jimm.d.setCurrent((Displayable)this.q);
    this.s.setSelectedIndex(n[3], true);
    int i = 0;
    try {
      int j = Integer.parseInt(dw.c("MCC"));
      i = Integer.parseInt(dw.c("MNC"));
      if (j == 401) {
        this.s.setSelectedIndex(7, true);
        return;
      } 
      if (j == 257) {
        this.s.setSelectedIndex(6, true);
        return;
      } 
      if (j == 255) {
        this.s.setSelectedIndex(5, true);
        return;
      } 
      if (j == 250) {
        switch (i) {
          case 1:
            this.s.setSelectedIndex(1, true);
            return;
          case 2:
            this.s.setSelectedIndex(2, true);
            return;
          case 28:
            this.s.setSelectedIndex(0, true);
            return;
          case 99:
            this.s.setSelectedIndex(0, true);
            return;
          case 20:
            this.s.setSelectedIndex(3, true);
            return;
          case 39:
            this.s.setSelectedIndex(4, true);
            return;
          case 35:
            this.s.setSelectedIndex(3, true);
            return;
        } 
        this.s.setSelectedIndex(n[3], true);
        return;
      } 
      this.s.setSelectedIndex(n[3], true);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final Object a(int paramInt1, Object[] paramArrayOfObject, Object paramObject, int paramInt2) {
    return null;
  }
  
  public static Object a(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (dw.L)
      return null; 
    if (!k && 0 != paramInt)
      return null; 
    if (i == null)
      return null; 
    Object object = null;
    Vector vector = null;
    int i = paramInt & 0xFF;
    int j;
    if ((j = paramInt >> 8) == 0)
      j = 1; 
    int k = 0;
    if (24 == paramInt)
      k = ((int[])paramArrayOfObject[0])[2]; 
    for (byte b = 0; b < i.length; b++) {
      if ((x[b] & j) != 0) {
        if (0 == paramInt) {
          ef.a(bb.a((short)740) + " " + b);
          ef.b(65 + b * 12 / i.length);
        } 
        try {
          if (k >= 1000 && 24 == paramInt)
            if (i[b] == f) {
              ((int[])paramArrayOfObject[0])[2] = k;
            } else {
              ((int[])paramArrayOfObject[0])[2] = k % 1000;
            }  
          object = i[b].activate(i, paramArrayOfObject, paramObject);
        } catch (Exception exception) {
          null.printStackTrace();
        } 
        if (object != null)
          if (object instanceof Vector) {
            Vector vector1 = (Vector)object;
            if (vector == null)
              vector = new Vector(); 
            for (byte b1 = 0; b1 < vector1.size(); b1++) {
              try {
                if (paramInt == 24)
                  ((int[])vector1.elementAt(b1))[3] = b; 
                vector.addElement(vector1.elementAt(b1));
              } catch (Exception exception) {}
            } 
          } else {
            return object;
          }  
      } 
    } 
    return (vector != null) ? vector : object;
  }
  
  public static String c() {
    String str = dw.a("" + n[0]);
    str = str + e;
    if (bd.g > 0)
      str = str + "|FPS:" + (bd.f / bd.g); 
    return str + "|SRV:" + em.d(101);
  }
  
  public static Object a(Graphics paramGraphics, int[][] paramArrayOfint, int paramInt, Object paramObject) {
    if (!k)
      return null; 
    if (i == null && paramInt == 0)
      return null; 
    l.a(paramGraphics);
    for (byte b = 0; b < i.length; b++) {
      for (byte b1 = 0; b1 < paramInt; b1++) {
        if (paramArrayOfint[b1][6] == b)
          try {
            paramGraphics.setClip(paramArrayOfint[b1][0], paramArrayOfint[b1][1], paramArrayOfint[b1][2] - paramArrayOfint[b1][0], paramArrayOfint[b1][3] - paramArrayOfint[b1][1]);
            i[b].activate(25, new Object[] { paramGraphics, paramObject }, paramArrayOfint[b1]);
          } catch (Exception exception) {
            dw.a(paramGraphics, null, 16733491, "Err:" + i[b].getName(), paramArrayOfint[b1][0], paramArrayOfint[b1][1], 20, 9);
            exception.printStackTrace();
          }  
      } 
    } 
    l.a();
    dw.h();
    return null;
  }
  
  public static boolean a(int paramInt, Object[] paramArrayOfObject, Object paramObject1, Object paramObject2) {
    try {
      bd bd = null;
      Screen screen = null;
      if (paramObject2 instanceof bd)
        bd = (bd)paramObject2; 
      if (paramObject2 instanceof Screen)
        screen = (Screen)paramObject2; 
      Object object = a(paramInt - 1, paramArrayOfObject, paramObject1);
      boolean bool = false;
      if (object != null && object instanceof Vector) {
        Vector vector = (Vector)object;
        for (byte b = 0; b < vector.size(); b++) {
          if (screen != null) {
            screen.removeCommand(vector.elementAt(b));
          } else {
            bd.b(vector.elementAt(b));
          } 
        } 
      } 
      if ((object = a(paramInt, paramArrayOfObject, paramObject1)) != null && object instanceof Vector) {
        Vector vector = (Vector)object;
        for (byte b = 0; b < vector.size(); b++) {
          if (screen != null) {
            screen.addCommand(vector.elementAt(b));
          } else if (bd == bi.a && em.h(72)) {
            bd.a(vector.elementAt(b), bd.ac);
          } else {
            bd.a(vector.elementAt(b), bd.ab);
          } 
          bool = true;
        } 
      } 
      return bool;
    } catch (Throwable throwable) {
      return false;
    } 
  }
  
  private static Object a(PI paramPI, Object paramObject) {
    return g.b(paramPI, paramObject);
  }
  
  private Object b(PI paramPI, Object paramObject) {
    (new Thread(new cw(paramPI, paramObject))).start();
    return null;
  }
  
  private static byte[] a(PI paramPI) {
    try {
      String str;
      if (paramPI == null) {
        str = "PLG_" + a();
      } else {
        String str1;
        if (!(str1 = paramPI.getName()).equals("CellId"))
          str1 = "" + str1.hashCode(); 
        str = "PLG_" + str1;
      } 
      RecordStore recordStore;
      byte[] arrayOfByte = (recordStore = RecordStore.openRecordStore(str, false)).getRecord(1);
      recordStore.closeRecordStore();
      return arrayOfByte;
    } catch (RecordStoreException recordStoreException) {
      return null;
    } 
  }
  
  public static Object a(int paramInt, Object paramObject, Object[] paramArrayOfObject, PI paramPI) {
    int j;
    Displayable displayable;
    boolean bool;
    int[] arrayOfInt1;
    dm dm2;
    String[] arrayOfString;
    int i;
    ByteArrayOutputStream byteArrayOutputStream;
    DataInputStream dataInputStream;
    dm dm1;
    int[] arrayOfInt2;
    DataOutputStream dataOutputStream;
    long l;
    I i1;
    String str;
    if (dw.L)
      return null; 
    switch (paramInt) {
      case 40:
        return dh.a((String)paramArrayOfObject[0], (String)paramArrayOfObject[1]);
      case 41:
        return dh.a((String)paramArrayOfObject[0], (String)paramArrayOfObject[1], (String)paramArrayOfObject[2], 0);
      case 1:
        if ((j = ((Integer)paramObject).intValue()) > 100) {
          cy.b(j - 100);
        } else {
          switch (j) {
            case 1:
              bi.i();
              return null;
            case 0:
              g.b();
              return null;
          } 
          cy.f();
        } 
        return null;
      case 2:
        return bi.a((String)paramObject);
      case 3:
        return (paramObject == null) ? bi.f() : bi.g();
      case 4:
        return bi.h();
      case 5:
        return bi.c((bu)paramObject);
      case 6:
        return a(paramPI, paramObject);
      case 7:
        return a(paramPI);
      case 8:
        return a(paramArrayOfObject);
      case 9:
        return cd.f() ? null : new Boolean(false);
      case 10:
        if (displayable = g.m.getCurrent() instanceof Canvas) {
          if (displayable == bd.m) {
            bd.a_();
          } else {
            ((Canvas)displayable).repaint();
          } 
          return null;
        } 
        return null;
      case 11:
        return Jimm.c;
      case 12:
        Jimm.a((String)paramObject);
        return null;
      case 15:
        return (paramObject instanceof String) ? df.a((String)paramObject) : ((paramObject instanceof Image) ? df.a((Image)paramObject) : null);
      case 13:
        bool = false;
        return bi.a(((Integer)paramObject).intValue());
      case 14:
        return (paramArrayOfObject[0] == null) ? null : ((df)paramArrayOfObject[0]).a(((Integer)paramArrayOfObject[1]).intValue());
      case 16:
        return em.d;
      case 17:
        return (paramObject instanceof Integer) ? em.e(((Integer)paramObject).intValue()) : em.e(((Integer)paramArrayOfObject[0]).intValue());
      case 18:
        return em.a(((Integer)paramArrayOfObject[0]).intValue(), paramArrayOfObject[1]) ? null : new Boolean(false);
      case 19:
        em.b(16);
        return null;
      case 20:
        arrayOfInt1 = (int[])paramObject;
        dw.a((Graphics)paramArrayOfObject[0], (Font)paramArrayOfObject[1], arrayOfInt1[0], (String)paramArrayOfObject[2], arrayOfInt1[1], arrayOfInt1[2], arrayOfInt1[3], 9);
        return null;
      case 21:
        dw.a((String)paramObject, false);
        return null;
      case 22:
        paramArrayOfObject[0] = dw.a(false);
        paramArrayOfObject[1] = dw.a(true);
        return null;
      case 23:
        return dh.b(((Boolean)paramArrayOfObject[0]).booleanValue(), ((Boolean)paramArrayOfObject[1]).booleanValue());
      case 24:
        try {
          eu.b();
          if (paramObject != null) {
            eu.a(((Integer)paramObject).intValue());
          } else {
            eu.a(cd.l() | (int)em.i(300));
          } 
        } catch (cr cr) {}
        return null;
      case 25:
        try {
          eu.b();
        } catch (cr cr) {}
        return null;
      case 26:
        return dv.e();
      case 27:
        e += "|" + paramObject;
        return null;
      case 28:
        return dh.a((byte[])paramObject, true);
      case 29:
        return dh.a((byte[])paramObject, false);
      case 30:
        return new ez(paramPI, paramArrayOfObject, paramObject);
      case 31:
        return (new dx(paramPI, paramArrayOfObject, paramObject)).d;
      case 32:
        db.b(((int[])paramObject)[0]);
        db.d(((int[])paramObject)[1]);
        return null;
      case 33:
        f = paramPI;
        return null;
      case 34:
        f = null;
        return null;
      case 35:
        return dw.e((String)paramObject);
      case 36:
        return new Long(dh.a(false));
      case 37:
        if ((dm2 = bi.a((String)paramArrayOfObject[0])) == null)
          return null; 
        if ((arrayOfInt2 = (int[])paramArrayOfObject[1]).length > 0)
          dm2.a(67, dm2.getIntValue(67) + arrayOfInt2[0]); 
        if (arrayOfInt2.length > 1)
          dm2.a(69, dm2.getIntValue(69) + arrayOfInt2[1]); 
        return null;
      case 38:
        arrayOfString = (String[])paramArrayOfObject[0];
        arrayOfInt2 = (int[])paramArrayOfObject[1];
        l = -1L;
        if (paramArrayOfObject.length > 2 && paramArrayOfObject[2] != null)
          l = ((long[])paramArrayOfObject[2])[0]; 
        i1 = null;
        if (paramArrayOfObject.length > 3)
          i1 = (I)paramArrayOfObject[3]; 
        str = null;
        if (arrayOfString.length > 3)
          str = arrayOfString[3]; 
        return a(arrayOfString[0], arrayOfString[1], arrayOfString[2], str, l, i1, arrayOfInt2[0], arrayOfInt2[1]);
      case 39:
        i = 500;
        if (paramArrayOfObject != null)
          i = ((int[])paramArrayOfObject[0])[0]; 
        a((String)paramObject, i);
        return null;
      case 42:
        return dh.j(dh.k((String)paramObject));
      case 43:
        (new ed(1, paramPI)).b();
        return null;
      case 44:
        (new ed(3, paramPI)).b();
        return null;
      case 51:
        em.a((String)paramObject);
        return null;
      case 45:
        return bl.a(paramObject, 1);
      case 46:
        return bl.a(paramObject, 3);
      case 50:
        return bl.a(paramObject);
      case 47:
        return bl.b(paramObject);
      case 48:
        return bl.c(paramObject);
      case 49:
        return bl.d(paramObject);
      case 53:
        byteArrayOutputStream = new ByteArrayOutputStream();
        dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
          dataOutputStream.writeByte(0);
          dataOutputStream.writeInt(paramArrayOfObject.length);
          for (byte b = 0; b < paramArrayOfObject.length; b++) {
            if (paramArrayOfObject[b] instanceof String[]) {
              String[] arrayOfString1 = (String[])paramArrayOfObject[b];
              dataOutputStream.writeInt(arrayOfString1.length);
              for (byte b1 = 0; b1 < arrayOfString1.length; b1++)
                dataOutputStream.writeUTF(arrayOfString1[b1]); 
            } 
            if (paramArrayOfObject[b] instanceof int[]) {
              int[] arrayOfInt = (int[])paramArrayOfObject[b];
              dataOutputStream.writeInt(arrayOfInt.length);
              for (byte b1 = 0; b1 < arrayOfInt.length; b1++)
                dataOutputStream.writeInt(arrayOfInt[b1]); 
            } 
            if (paramArrayOfObject[b] instanceof boolean[]) {
              boolean[] arrayOfBoolean = (boolean[])paramArrayOfObject[b];
              dataOutputStream.writeInt(arrayOfBoolean.length);
              for (byte b1 = 0; b1 < arrayOfBoolean.length; b1++)
                dataOutputStream.writeBoolean(arrayOfBoolean[b1]); 
            } 
            if (paramArrayOfObject[b] instanceof long[]) {
              long[] arrayOfLong = (long[])paramArrayOfObject[b];
              dataOutputStream.writeInt(arrayOfLong.length);
              for (byte b1 = 0; b1 < arrayOfLong.length; b1++)
                dataOutputStream.writeLong(arrayOfLong[b1]); 
            } 
            if (paramArrayOfObject[b] instanceof byte[][]) {
              byte[][] arrayOfByte = (byte[][])paramArrayOfObject[b];
              dataOutputStream.writeInt(arrayOfByte.length);
              for (byte b1 = 0; b1 < arrayOfByte.length; b1++) {
                dataOutputStream.writeInt((arrayOfByte[b1]).length);
                dataOutputStream.write(arrayOfByte[b1]);
              } 
            } 
          } 
        } catch (IOException iOException) {
          return null;
        } 
        return byteArrayOutputStream.toByteArray();
      case 54:
        dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
        try {
          dataInputStream.readByte();
          int k = dataInputStream.readInt();
          for (byte b = 0; b < k; b++) {
            if (b < paramArrayOfObject.length) {
              int m = dataInputStream.readInt();
              if (paramArrayOfObject[b] instanceof String[]) {
                String[] arrayOfString1 = (String[])paramArrayOfObject[b];
                for (byte b1 = 0; b1 < m; b1++) {
                  if (b1 < arrayOfString1.length)
                    arrayOfString1[b1] = dataInputStream.readUTF(); 
                } 
              } 
              if (paramArrayOfObject[b] instanceof int[]) {
                int[] arrayOfInt = (int[])paramArrayOfObject[b];
                for (byte b1 = 0; b1 < m; b1++) {
                  if (b1 < arrayOfInt.length)
                    arrayOfInt[b1] = dataInputStream.readInt(); 
                } 
              } 
              if (paramArrayOfObject[b] instanceof boolean[]) {
                boolean[] arrayOfBoolean = (boolean[])paramArrayOfObject[b];
                for (byte b1 = 0; b1 < m; b1++) {
                  if (b1 < arrayOfBoolean.length)
                    arrayOfBoolean[b1] = dataInputStream.readBoolean(); 
                } 
              } 
              if (paramArrayOfObject[b] instanceof long[]) {
                long[] arrayOfLong = (long[])paramArrayOfObject[b];
                for (byte b1 = 0; b1 < m; b1++) {
                  if (b1 < arrayOfLong.length)
                    arrayOfLong[b1] = dataInputStream.readLong(); 
                } 
              } 
              if (paramArrayOfObject[b] instanceof byte[][]) {
                byte[][] arrayOfByte = (byte[][])paramArrayOfObject[b];
                for (byte b1 = 0; b1 < m; b1++) {
                  if (b1 < arrayOfByte.length) {
                    int n = dataInputStream.readInt();
                    arrayOfByte[b1] = new byte[n];
                    dataInputStream.read(arrayOfByte[b1]);
                  } 
                } 
              } 
            } 
          } 
        } catch (IOException iOException) {
          return null;
        } 
        return null;
      case 52:
        if ((dm1 = bi.a((String)paramObject)) == null)
          dm1 = bi.b((String)paramObject); 
        if (dm1 != null)
          cj.b(dm1); 
        return null;
      case 55:
        try {
          return a((String)paramObject).newInstance();
        } catch (Exception exception) {
        
        } catch (Throwable throwable) {}
        break;
    } 
    return (paramInt >= 200 && paramInt <= 220) ? a(paramInt, paramArrayOfObject, paramObject) : null;
  }
  
  private static synchronized void a(String paramString, int paramInt) {
    be be1;
    if ((be1 = cj.a(paramString)) != null) {
      if (paramInt == -1) {
        be1.z();
        return;
      } 
      int i;
      for (i = be1.t; be1.ae.size() > paramInt; i--)
        be1.ae.removeElementAt(0); 
      be1.p(i);
    } 
  }
  
  private static synchronized Object a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, I paramI, int paramInt1, int paramInt2) {
    try {
      if (paramLong == 0L)
        paramLong = dh.a(false); 
      if (paramString2 == null)
        paramString2 = "[null]"; 
      if (paramString3 == null)
        paramString3 = "[null2]"; 
      if (paramString4 == null)
        paramString4 = ""; 
      boolean bool1 = ((paramInt2 & 0x20) != 0) ? true : false;
      boolean bool2 = ((paramInt2 & 0x40) != 0) ? true : false;
      dm dm;
      if ((dm = bi.a(paramString1)) == null)
        dm = bi.b(paramString1); 
      if ((paramInt2 & 0x10) == 0 && dm != null && dm.o != null && !cj.c.containsKey(paramString1))
        cj.a(dm, dm.o); 
      if ((paramInt2 & 0x10) == 0 && dm != null)
        cj.a(paramString1, paramString2, paramString3, paramString4, paramLong, bool2, bool1, paramI, paramInt1, false); 
      if (dm != null && (paramInt2 & 0x80) != 0)
        cj.b(dm); 
      boolean bool = true;
      if ((paramInt2 &= 0xF) == 0) {
        bool = em.h(17);
      } else if (paramInt2 == 1) {
        bool = true;
      } else if (paramInt2 == 2) {
        bool = false;
      } 
      try {
        if (bool)
          ea.a(paramString1, paramString3, (byte)0, paramString2, paramLong); 
      } catch (Exception exception) {
        return "" + exception.getClass().getName();
      } 
      return null;
    } catch (Exception exception) {
      return "" + exception.getClass().getName();
    } 
  }
  
  private static void a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfbyte));
    try {
      short s = dataInputStream.readShort();
      byte b;
      for (b = 0; b < s; b++) {
        if (b < b.length)
          b[b] = dataInputStream.readBoolean(); 
      } 
      s = dataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < n.length)
          n[b] = dataInputStream.readInt(); 
      } 
      s = dataInputStream.readShort();
      for (b = 0; b < s; b++) {
        if (b < o.length)
          o[b] = dataInputStream.readUTF(); 
      } 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private static void g() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeShort(b.length);
      byte b;
      for (b = 0; b < b.length; b++)
        dataOutputStream.writeBoolean(b[b]); 
      dataOutputStream.writeShort(n.length);
      for (b = 0; b < n.length; b++)
        dataOutputStream.writeInt(n[b]); 
      dataOutputStream.writeShort(o.length);
      for (b = 0; b < o.length; b++)
        dataOutputStream.writeUTF(o[b]); 
      a((PI)null, byteArrayOutputStream.toByteArray());
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  static {
    try {
      InputStream inputStream;
      if ((inputStream = "".getClass().getResourceAsStream("/list.txt")) == null)
        throw new IOException(); 
      StringBuffer stringBuffer = new StringBuffer();
      while (inputStream.available() > 0) {
        char c;
        if (((c = (char)inputStream.read()) >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '.') {
          stringBuffer.append(c);
          continue;
        } 
        String str = stringBuffer.toString();
        if (!"".equals(str)) {
          if (y.size() == z.size()) {
            y.addElement(str);
          } else {
            z.addElement(new Integer(Integer.parseInt(str, 2)));
          } 
          stringBuffer = new StringBuffer();
        } 
      } 
      inputStream.close();
    } catch (Exception exception) {
      System.out.println("NoResourcePlugins");
      w = 0;
      y.removeAllElements();
    } 
  }
  
  class ec extends TimerTask {
    public Object[] a;
    
    public Object b;
    
    public int c;
    
    public ec(cp this$0, Object[] param1ArrayOfObject, Object param1Object, int param1Int1) {
      this.c = this$0;
      this.a = param1ArrayOfObject;
      this.b = param1Object;
      (new Timer()).schedule(this, param1Int1);
    }
    
    public final void run() {
      if (this.c != 4 || cd.f())
        cp.a(this.c, this.a, this.b); 
    }
  }
  
  class cw implements Runnable {
    public PI a;
    
    public Object b;
    
    public cw(cp this$0, Object param1Object) {
      this.a = (PI)this$0;
      this.b = param1Object;
    }
    
    public final void run() {
      if (this.b instanceof byte[]) {
        byte[] arrayOfByte = (byte[])this.b;
        try {
          String str;
          if (this.a == null) {
            str = "PLG_" + cp.a();
          } else {
            String str1;
            if (!(str1 = this.a.getName()).equals("CellId"))
              str1 = "" + str1.hashCode(); 
            str = "PLG_" + str1;
          } 
          RecordStore recordStore;
          if ((recordStore = RecordStore.openRecordStore(str, true)).getNumRecords() > 0) {
            recordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
          } else {
            recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
          } 
          recordStore.closeRecordStore();
          return;
        } catch (RecordStoreException recordStoreException) {}
      } 
    }
  }
  
  public static class dx extends TimerTask {
    public PI a;
    
    public Object[] b;
    
    public Object c;
    
    public Timer d;
    
    public dx(PI param1PI, Object[] param1ArrayOfObject, Object param1Object) {
      this.a = param1PI;
      this.b = param1ArrayOfObject;
      this.c = param1Object;
      long l1 = 0L;
      long l2 = 0L;
      if (param1ArrayOfObject instanceof Object[]) {
        Object[] arrayOfObject;
        if ((arrayOfObject = param1ArrayOfObject)[0] instanceof Long)
          l1 = ((Long)arrayOfObject[0]).longValue(); 
        if (arrayOfObject.length > 1 && arrayOfObject[1] != null && arrayOfObject[1] instanceof Long)
          l2 = ((Long)arrayOfObject[1]).longValue(); 
      } 
      if (l2 > 0L) {
        (this.d = new Timer()).scheduleAtFixedRate(this, l1, l2);
        return;
      } 
      if (l1 > 0L)
        (this.d = new Timer()).schedule(this, l1); 
    }
    
    public final void run() {
      this.a.activate(36, this.b, this.c);
    }
  }
  
  public static class ez implements Runnable {
    public PI a;
    
    public Object[] b;
    
    public Object c;
    
    public ez(PI param1PI, Object[] param1ArrayOfObject, Object param1Object) {
      this.a = param1PI;
      this.b = param1ArrayOfObject;
      this.c = param1Object;
      (new Thread(this)).start();
    }
    
    public final void run() {
      this.a.activate(37, this.b, this.c);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\cp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */