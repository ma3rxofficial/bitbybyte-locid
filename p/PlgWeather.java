package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
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
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

public class PlgWeather extends PI implements CommandListener, ItemStateListener {
  private Form n;
  
  private Command o = new Command("Сохранить", 4, 1);
  
  private Command p = new Command("Назад", 2, 2);
  
  public Timer a;
  
  public String[] b;
  
  public String c;
  
  public int d;
  
  private int q;
  
  public TextField e;
  
  public TextField f;
  
  public TextField g;
  
  public ChoiceGroup h;
  
  public ChoiceGroup i;
  
  public Font j;
  
  private int r;
  
  private boolean s;
  
  private String t;
  
  public boolean k;
  
  private Vector u;
  
  private int v;
  
  private int w;
  
  private boolean[] x;
  
  private int y;
  
  public int[] l;
  
  public Object m;
  
  private int z;
  
  private TextField A;
  
  public PlgWeather() {
    (new String[2])[0] = "474974";
    (new int[4])[0] = 2548907;
    (new int[4])[1] = 2547059;
    (new int[4])[2] = 4326972;
    (new int[4])[3] = 4247352;
    this.b = new String[] { null, "" + (new int[4])[(int)System.currentTimeMillis() & 0x3] };
    this.c = "Москва";
    this.d = 0;
    this.q = 240;
    this.j = Font.getFont(0, 0, 8);
    this.r = 0;
    this.s = true;
    this.t = "нет соединения";
    this.k = false;
    this.u = new Vector();
    this.v = 0;
    this.w = 0;
    this.x = new boolean[] { false, true, true, false };
    this.y = 0;
    this.z = 0;
  }
  
  private static String[] a(String paramString1, String paramString2) {
    if (paramString1.indexOf(paramString2) < 0)
      return new String[] { paramString1 }; 
    Vector vector = new Vector();
    int i = 0;
    int j;
    for (j = paramString1.indexOf(paramString2, 0); j >= 0; j = paramString1.indexOf(paramString2, i)) {
      vector.addElement(paramString1.substring(i, j));
      i = j + paramString2.length();
    } 
    if (i == paramString1.length()) {
      vector.addElement("");
    } else {
      vector.addElement(paramString1.substring(i, paramString1.length()));
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  public I getIcon() {
    if (this.m == null)
      this.m = request(15, null, "/w.png"); 
    if (this.m == null)
      return null; 
    try {
      Object object1;
      if (!(object1 = request(14, new Object[] { this.m, new Integer(2) }, null) instanceof I))
        return null; 
      Image image;
      int i = (image = ((I)object1).createImage()).getWidth();
      int j = image.getHeight();
      Object object2;
      if ((object1 = request(13, null, new Integer(1))) != null && object2 = request(14, new Object[] { object1, new Integer(1) }, null) instanceof I) {
        int k;
        if ((k = ((I)object2).getHeight()) > 2 && k < j)
          j = k; 
        int m;
        if ((m = ((I)object2).getWidth()) > 2 && m < i)
          i = m; 
      } 
      return (I)(object2 = new I(image, 0, 0, i, j));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public void itemStateChanged(Item paramItem) {
    if (paramItem == this.i)
      this.A.setString(this.b[this.i.getSelectedIndex()]); 
  }
  
  public String getName() {
    return "Погода гисметео.ru";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    boolean bool1;
    int[] arrayOfInt1;
    Graphics graphics;
    boolean bool2;
    int i;
    int[] arrayOfInt2;
    int j;
    int k;
    Vector vector;
    byte b;
    switch (paramInt) {
      case 2:
        a((Display)paramObject);
        return null;
      case 0:
        a(request(7, null, null));
        this.l = new int[16];
        this.l[15] = 16776960;
        this.l[14] = 16711935;
        this.l = (int[])request(16, null, null);
        return null;
      case 4:
        if (this.s)
          c(); 
        return null;
      case 23:
        if (!this.x[0])
          return null; 
        bool1 = false;
        if (paramArrayOfObject != null && this.b[this.z].equals(paramArrayOfObject[0])) {
          String str;
          if ((str = (String)paramArrayOfObject[4]).indexOf(this.c.substring(1)) >= 0) {
            if (str != null)
              bool1 = a(str); 
          } else if (this.z == 1 && str.startsWith("Для Вас зарезервирован другой номер этого Бота") && (str = (String)request(35, null, str)) != null && !"".equals(str)) {
            this.b[this.z] = str;
            b();
          } 
        } 
        bool2 = this.k;
        if (bool1) {
          this.k = false;
          return bool2 ? new Boolean(false) : null;
        } 
        return null;
      case 24:
        if (this.u.size() == 0 || !this.x[0])
          return null; 
        i = (arrayOfInt1 = (int[])paramArrayOfObject[0])[0];
        j = 0;
        if ((k = arrayOfInt1[2]) >= 1 && k <= 3) {
          if (!this.x[k])
            return null; 
        } else {
          return null;
        } 
        vector = new Vector();
        if (this.y == 0) {
          I i1;
          if ((i1 = a(0)) != null)
            this.y = i1.getHeight(); 
          if (i1 != null)
            i1.getWidth(); 
        } 
        this.v = a(this.j.getHeight() * 2, this.y);
        vector.addElement(new int[] { (this.d < 10) ? i : this.d, this.v, ++this.w, 0 });
        return vector;
      case 25:
        if (this.u.size() == 0 || !this.x[0])
          return null; 
        graphics = (Graphics)paramArrayOfObject[0];
        arrayOfInt2 = (int[])paramObject;
        graphics.setFont(this.j);
        j = arrayOfInt2[0];
        k = arrayOfInt2[1];
        vector = null;
        for (b = 0; b < this.u.size(); b++) {
          Marker marker;
          I i1 = (marker = this.u.elementAt(b)).b();
          int m = j;
          if (i1 != null) {
            i1.drawByLeft(graphics, j, k + this.v - i1.getWidth() / 2);
            j += i1.getWidth();
          } else {
            graphics.setColor(this.l[14]);
            String str = " " + marker.c() + " ";
            graphics.drawString(str, j, k, 20);
            j += graphics.getFont().stringWidth(str);
          } 
          String str1 = "" + marker.a + "/" + marker.b + "нудв".charAt(marker.e);
          String str2 = ((marker.d() > 0) ? "+" : "") + marker.d();
          int n = this.j.stringWidth(str1);
          int i2 = this.j.stringWidth(str2);
          if (i1 != null) {
            int i3 = i1.getWidth();
            if (n > i3)
              i3 = n; 
            if (i2 > i3)
              i3 = i2; 
            j = m + i3;
          } 
          graphics.setColor(this.l[4]);
          graphics.drawString(str2, j + 1, k + this.v + 1, 40);
          graphics.drawString(str2, j + 0, k + this.v + 1, 40);
          graphics.drawString(str2, j + 1, k + this.v + 0, 40);
          graphics.setColor(this.l[14]);
          graphics.drawString(str2, j, k + this.v, 40);
          graphics.setColor(this.l[4]);
          graphics.drawString(str1, j + 1, k + 1, 24);
          graphics.drawString(str1, j + 0, k + 1, 24);
          graphics.drawString(str1, j + 1, k + 0, 24);
          graphics.setColor(this.l[15]);
          graphics.drawString(str1, j, k, 24);
          j += 3;
          graphics.setColor(this.l[13]);
          graphics.drawLine(j - 2, k, j - 2, k + this.v);
        } 
        return null;
    } 
    return null;
  }
  
  private I a(int paramInt) {
    Object object;
    return ((object = request(14, new Object[] { this.m, new Integer(paramInt) }, null)) == null) ? null : (I)object;
  }
  
  private static int a(int paramInt1, int paramInt2) {
    return (paramInt1 > paramInt2) ? paramInt1 : paramInt2;
  }
  
  private boolean a(String paramString) {
    if (paramString == null)
      return false; 
    boolean bool = false;
    int i;
    if ((i = paramString.indexOf("Погода в")) >= 0) {
      try {
        while (i < paramString.length() && paramString.charAt(i) != '\n')
          i++; 
        int j = paramString.indexOf("Смотрите подробн");
        j -= 2;
        if (j <= 0)
          throw new Exception(); 
        String[] arrayOfString = a(paramString = paramString.substring(i + 1, j), "\n");
        for (i = 0; i < arrayOfString.length; i++) {
          try {
            Marker marker = new Marker(this);
            String[] arrayOfString1;
            String[] arrayOfString2 = a((arrayOfString1 = a(arrayOfString[i], ":"))[0], " ");
            String[] arrayOfString3 = a(arrayOfString1[1], ",");
            marker.e = "Ночь Утро День Вечер".indexOf(arrayOfString2[0]) / 5;
            marker.d = marker.e * 6;
            marker.a = Integer.parseInt(arrayOfString2[1]);
            marker.b = ",янв,фев,мар,апр,май,июн,июл,авг,сен,окт,ноя,дек,".indexOf("," + arrayOfString2[2].trim()) / 4 + 1;
            marker.c = 2009;
            int k = arrayOfString3.length - 1;
            marker.o = Integer.parseInt(a(arrayOfString3[k], " ")[1]);
            marker.n = marker.o;
            marker.j = Integer.parseInt(a(arrayOfString3[k - 2], " ")[1]);
            marker.k = marker.j;
            a(arrayOfString3[0], marker);
            if (arrayOfString3.length >= 2)
              arrayOfString3[1] = arrayOfString3[1] + arrayOfString3[2]; 
            a(marker, arrayOfString3[1]);
            String str = a(arrayOfString3[k - 3], " ")[1];
            a(marker, str, "..");
            a(marker);
          } catch (Exception exception) {}
        } 
        paramString = a();
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      } 
    } else if ((i = paramString.indexOf("~ Прогноз погоды")) >= 0) {
      paramString.indexOf("Прогноз на");
      String[] arrayOfString = a(paramString, "\n\n");
      for (i = 1; i < arrayOfString.length; i++) {
        if (arrayOfString[i].indexOf("Прогноз на") == 0) {
          String[] arrayOfString1 = a(arrayOfString[i], "\n");
          Marker marker = new Marker(this);
          String[] arrayOfString2 = a(arrayOfString1[0].trim(), " ");
          marker.e = "(ночь) (утро) (день) (вечер)".indexOf(arrayOfString2[arrayOfString2.length - 1]) / 7;
          marker.d = marker.e * 6;
          arrayOfString2 = a(arrayOfString2[arrayOfString2.length - 2].trim(), ".");
          marker.a = Integer.parseInt(arrayOfString2[0]);
          marker.b = Integer.parseInt(arrayOfString2[1]);
          marker.c = Integer.parseInt(arrayOfString2[2]);
          if ((arrayOfString2 = a((arrayOfString2 = a(arrayOfString1[4].trim(), ":"))[1].trim(), ",")).length > 1)
            arrayOfString2[0] = arrayOfString2[1]; 
          if ((arrayOfString2 = a(arrayOfString2[0].trim(), " "))[0].indexOf('-') >= 0) {
            arrayOfString2 = a(arrayOfString2[0].trim(), "-");
            marker.o = Integer.parseInt(arrayOfString2[1]);
            marker.n = Integer.parseInt(arrayOfString2[0]);
          } else {
            marker.o = Integer.parseInt(arrayOfString2[0]);
            marker.n = marker.o;
          } 
          if (marker.n > marker.o) {
            int j = marker.o;
            marker.o = marker.n;
            marker.n = j;
          } 
          if ((arrayOfString2 = a(arrayOfString1[2].trim(), " "))[2].indexOf('-') >= 0) {
            arrayOfString2 = a(arrayOfString2[2].trim(), "-");
            marker.j = Integer.parseInt(arrayOfString2[1]);
            marker.k = Integer.parseInt(arrayOfString2[0]);
          } else {
            marker.j = Integer.parseInt(arrayOfString2[2]);
            marker.k = marker.j;
          } 
          if (marker.k > marker.j) {
            int j = marker.j;
            marker.j = marker.k;
            marker.k = j;
          } 
          a((arrayOfString2 = a((arrayOfString2 = a(arrayOfString1[1].trim(), ":"))[1].trim(), ","))[0], marker);
          if (arrayOfString2.length > 2)
            arrayOfString2[1] = arrayOfString2[1] + arrayOfString2[2]; 
          a(marker, arrayOfString2[1]);
          arrayOfString2 = a((arrayOfString2 = a(arrayOfString1[3], ":"))[1].trim(), " ");
          if (arrayOfString.length == 2) {
            a(marker, arrayOfString2[0], "..");
          } else {
            a(marker, arrayOfString2[0] + "=" + arrayOfString2[2], "=");
          } 
          a(marker);
        } 
      } 
      paramString = a();
    } else {
      bool = true;
    } 
    this.t = paramString;
    if (this.n != null && this.n.size() > 1)
      this.n.set(0, (Item)new StringItem(this.c, this.t)); 
    return !bool;
  }
  
  private String a() {
    while (this.u.size() > 6)
      this.u.removeElementAt(0); 
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < this.u.size(); b++) {
      Marker marker = this.u.elementAt(b);
      stringBuffer.append(marker.a).append("/").append(marker.b).append(" ");
      stringBuffer.append(marker.d).append(":00\n");
      stringBuffer.append(marker.c()).append(" ");
      if (marker.p > 0)
        stringBuffer.append('+'); 
      stringBuffer.append(marker.p).append("..");
      if (marker.q > 0)
        stringBuffer.append('+'); 
      stringBuffer.append(marker.q).append(" C");
      stringBuffer.append("\n");
    } 
    return stringBuffer.toString();
  }
  
  private void a(Marker paramMarker) {
    if (paramMarker.a == 0)
      return; 
    for (byte b = 0; b < this.u.size(); b++) {
      Marker marker;
      if ((marker = this.u.elementAt(b)).c == paramMarker.c && marker.a == paramMarker.a && marker.d == paramMarker.d && marker.b == paramMarker.b) {
        this.u.setElementAt(paramMarker, b);
        paramMarker = null;
        break;
      } 
    } 
    if (paramMarker != null)
      this.u.addElement(paramMarker); 
  }
  
  private void a(Marker paramMarker, String paramString1, String paramString2) {
    if (paramString1.indexOf(paramString2) >= 0) {
      String[] arrayOfString = a(paramString1, paramString2);
      paramMarker.l = Integer.parseInt(b(arrayOfString[1]));
      paramMarker.m = Integer.parseInt(b(arrayOfString[0]));
    } else {
      paramMarker.l = Integer.parseInt(b(paramString1));
      paramMarker.m = paramMarker.l;
    } 
    if (paramMarker.m > paramMarker.l) {
      int i = paramMarker.l;
      paramMarker.l = paramMarker.m;
      paramMarker.m = i;
    } 
    paramMarker.q = paramMarker.l;
    paramMarker.p = paramMarker.m;
  }
  
  private static void a(String paramString, Marker paramMarker) {
    paramMarker.f = ",ясно,      ,малооблачно,облачно,   ,пасмурно,  ".indexOf("," + paramString.trim()) / 12;
  }
  
  private static void a(Marker paramMarker, String paramString) {
    paramMarker.g = 9;
    if (paramString.indexOf("дождь") >= 0)
      paramMarker.g = 4; 
    if (paramString.indexOf("ливень") >= 0)
      paramMarker.g = 5; 
    if (paramString.indexOf("сильный дождь") >= 0)
      paramMarker.g = 5; 
    if (paramString.indexOf("снег") >= 0)
      paramMarker.g = 6; 
    if (paramString.indexOf("снегопад") >= 0)
      paramMarker.g = 7; 
    if (paramString.indexOf("гроза") >= 0)
      paramMarker.g = 8; 
    if (paramString.indexOf("ясно") >= 0)
      paramMarker.g = 10; 
    if (paramString.indexOf("без осадков") >= 0)
      paramMarker.g = 10; 
    paramMarker.h = 1;
    if (paramString.indexOf("возможен дождь") > 0)
      paramMarker.h = 0; 
    if (paramString.indexOf("возможен снег") > 0)
      paramMarker.h = 0; 
    paramMarker.i = 1;
    if (paramString.indexOf("возможна гроза") > 0)
      paramMarker.i = 0; 
  }
  
  private static String b(String paramString) {
    return (paramString.length() > 0 && paramString.charAt(0) == '+') ? paramString.substring(1) : paramString;
  }
  
  private void a(Object paramObject) {
    if (paramObject != null && paramObject instanceof byte[]) {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
      try {
        dataInputStream.readInt();
        boolean bool = false;
        String str;
        if ((str = dataInputStream.readUTF()).indexOf('|') >= 0) {
          String[] arrayOfString = a(str, "|");
          this.b[0] = arrayOfString[0];
          this.b[1] = arrayOfString[1];
        } 
        this.c = dataInputStream.readUTF();
        this.q = dataInputStream.readInt();
        for (byte b = 0; b < 4; b++) {
          if (dataInputStream.available() > 0)
            this.x[b] = dataInputStream.readBoolean(); 
        } 
        if (dataInputStream.available() > 0)
          this.d = dataInputStream.readInt(); 
        if (dataInputStream.available() > 0)
          this.z = dataInputStream.readInt(); 
        return;
      } catch (IOException iOException) {}
    } 
  }
  
  private void b() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      if (this.q < 10)
        this.q = 10; 
      dataOutputStream.writeInt(1);
      dataOutputStream.writeUTF(this.b[0] + "|" + this.b[1]);
      dataOutputStream.writeUTF(this.c);
      dataOutputStream.writeInt(this.q);
      dataOutputStream.writeBoolean(this.x[0]);
      dataOutputStream.writeBoolean(this.x[1]);
      dataOutputStream.writeBoolean(this.x[2]);
      dataOutputStream.writeBoolean(this.x[3]);
      dataOutputStream.writeInt(this.d);
      dataOutputStream.writeInt(this.z);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
    c();
    this.h.setSelectedIndex(0, this.x[0]);
  }
  
  private void c() {}
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.p)
      request(1, null, new Integer(0)); 
    if (paramCommand == this.o) {
      this.c = this.f.getString();
      this.q = Integer.parseInt(this.g.getString(), 10);
      this.d = Integer.parseInt(this.e.getString(), 10);
      this.h.getSelectedFlags(this.x);
      this.z = this.i.getSelectedIndex();
      this.b[this.z] = this.A.getString();
      b();
      request(1, null, new Integer(0));
    } 
  }
  
  private synchronized void a(Display paramDisplay) {
    if (this.n == null) {
      this.n = new Form("Погода GisMeteo.ru");
      this.n.addCommand(this.o);
      this.n.addCommand(this.p);
      this.n.setCommandListener(this);
      this.n.setItemStateListener(this);
      this.n.append((Item)new StringItem(this.c, this.t));
      this.A = new TextField("UIN:", this.b[this.z], 20, 2);
      this.e = new TextField("Ширина окна, 0-полная:", "" + this.d, 20, 2);
      this.f = new TextField("Город по русски c большой буквы:", this.c, 20, 0);
      this.g = new TextField("Период обновления, мин.:", "" + this.q, 7, 2);
      this.h = new ChoiceGroup("Настройки:", 2, new String[] { "Включить", "Показ в контакт листе", "Показ в чате", "Показ в меню" }, null);
      this.i = new ChoiceGroup("Сервер:", 4, new String[] { "", "" }, null);
      this.n.append((Item)this.f);
      this.n.append((Item)this.g);
      this.n.append((Item)this.i);
      this.n.append((Item)this.A);
      this.n.append((Item)this.h);
      this.h.setSelectedIndex(0, this.x[0]);
      this.n.append((Item)this.e);
      this.n.append("Каждый запрос 0.5к трафика, возможно появление фантомного контакта " + this.b[this.z] + " это нормально.");
    } 
    this.f.setString(this.c);
    this.g.setString("" + this.q);
    this.e.setString("" + this.d);
    this.h.setSelectedFlags(this.x);
    this.i.set(0, "Gismeteo " + this.b[0], null);
    this.i.set(1, "I-Bot " + this.b[1], null);
    this.i.setSelectedIndex(this.z, true);
    this.A.setString(this.b[this.z]);
    paramDisplay.setCurrent((Displayable)this.n);
  }
  
  public static I a(PlgWeather paramPlgWeather, int paramInt) {
    return paramPlgWeather.a(paramInt);
  }
  
  public static int a(PlgWeather paramPlgWeather) {
    return paramPlgWeather.q;
  }
  
  public static int b(PlgWeather paramPlgWeather) {
    return paramPlgWeather.r++;
  }
  
  public static boolean[] c(PlgWeather paramPlgWeather) {
    return paramPlgWeather.x;
  }
  
  public static int d(PlgWeather paramPlgWeather) {
    return paramPlgWeather.z;
  }
  
  public static boolean a(PlgWeather paramPlgWeather, boolean paramBoolean) {
    return paramPlgWeather.s = paramBoolean;
  }
  
  public class MyTimeout extends TimerTask {
    private final PlgWeather a;
    
    public MyTimeout(PlgWeather this$0) {
      this.a = this$0;
      if (this$0.a != null)
        this$0.a.cancel(); 
      (this$0.a = new Timer()).scheduleAtFixedRate(this, 20000L, (PlgWeather.a(this$0) * 60 * 1000));
    }
    
    public void run() {
      PlgWeather.b(this.a);
      if (this.a.request(9, null, null) == null && PlgWeather.c(this.a)[0]) {
        String str = this.a.c;
        if (PlgWeather.d(this.a) == 1)
          str = "погода " + str; 
        this.a.request(8, (Object[])new String[] { this.a.b[PlgWeather.d(this.a)], str, "no" }, null);
        this.a.k = true;
        PlgWeather.a(this.a, false);
        return;
      } 
      PlgWeather.a(this.a, true);
    }
  }
  
  class Marker {
    public int a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public int g;
    
    public int h;
    
    public int i;
    
    public int j;
    
    public int k;
    
    public int l;
    
    public int m;
    
    public int n;
    
    public int o;
    
    public int p;
    
    public int q;
    
    private final PlgWeather r;
    
    public Marker(PlgWeather this$0) {
      this.r = this$0;
    }
    
    public final int a() {
      null = 0;
      switch (this.g) {
        case 10:
          (new int[4])[0] = 1;
          (new int[4])[1] = 2;
          (new int[4])[2] = 3;
          (new int[4])[3] = 4;
          return (new int[4])[this.f];
        case 4:
          return (this.h == 0) ? 5 : 6;
        case 5:
          return 7;
        case 6:
          return (this.h == 0) ? 8 : 9;
        case 7:
          return 10;
        case 8:
          return (this.h == 0) ? 11 : ((this.i == 0) ? 12 : 13);
      } 
      return 0;
    }
    
    public final I b() {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual a : ()I
      //   4: istore_1
      //   5: aload_0
      //   6: getfield d : I
      //   9: bipush #22
      //   11: if_icmpge -> 23
      //   14: aload_0
      //   15: getfield d : I
      //   18: bipush #6
      //   20: if_icmpge -> 90
      //   23: iload_1
      //   24: ifne -> 30
      //   27: goto -> 88
      //   30: iload_1
      //   31: iconst_1
      //   32: if_icmpne -> 41
      //   35: bipush #14
      //   37: istore_1
      //   38: goto -> 90
      //   41: iload_1
      //   42: iconst_5
      //   43: if_icmpge -> 52
      //   46: bipush #15
      //   48: istore_1
      //   49: goto -> 90
      //   52: iload_1
      //   53: bipush #8
      //   55: if_icmpge -> 64
      //   58: bipush #16
      //   60: istore_1
      //   61: goto -> 90
      //   64: iload_1
      //   65: bipush #11
      //   67: if_icmpge -> 76
      //   70: bipush #17
      //   72: istore_1
      //   73: goto -> 90
      //   76: iload_1
      //   77: bipush #14
      //   79: if_icmpge -> 88
      //   82: bipush #18
      //   84: istore_1
      //   85: goto -> 90
      //   88: iconst_0
      //   89: istore_1
      //   90: aload_0
      //   91: getfield r : Lp/PlgWeather;
      //   94: iload_1
      //   95: invokestatic a : (Lp/PlgWeather;I)Li/I;
      //   98: areturn
    }
    
    public final String c() {
      (new String[14])[0] = "нет данных";
      (new String[14])[1] = "ясно";
      (new String[14])[2] = "мало облачно";
      (new String[14])[3] = "облачно";
      (new String[14])[4] = "пасмурно";
      (new String[14])[5] = "временами дождь";
      (new String[14])[6] = "дождь";
      (new String[14])[7] = "ливень";
      (new String[14])[8] = "временами снег";
      (new String[14])[9] = "снег";
      (new String[14])[10] = "снегопад";
      (new String[14])[11] = "временами гроза";
      (new String[14])[12] = "гроза";
      (new String[14])[13] = "ливень гроза";
      return (new String[14])[a()];
    }
    
    public final int d() {
      return (this.q + this.p > 0) ? ((this.q + this.p + 1) / 2) : ((this.q + this.p - 1) / 2);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgWeather.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */