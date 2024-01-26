package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.MetaDataControl;
import javax.microedition.media.control.VolumeControl;
import ui.ChGroupEx;
import ui.Colors;
import ui.Config;
import ui.FormEx;
import ui.Strings;

public class PlgPlayer extends PI implements PlayerListener, CommandListener {
  public Player a;
  
  public PList b;
  
  public GUI c;
  
  public Display d;
  
  public FormEx e;
  
  public TextField f;
  
  public TextField g;
  
  public TextField h;
  
  public ChGroupEx i;
  
  public ChGroupEx j;
  
  public int k = 100;
  
  public int l = 0;
  
  public int m = 5;
  
  public int n = 0;
  
  public String o = "Сейчас слушаем: ";
  
  public String p = "%a - %T";
  
  public String[] q = new String[3];
  
  public boolean r = false;
  
  public boolean s = false;
  
  public Random t = new Random();
  
  public boolean u = false;
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(8)), new Integer(10) }null);
  }
  
  public final String getName() {
    return "Плеер";
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      this.d = (Display)paramObject;
      this.b = new PList(this);
      i();
      Config.set((int[])request(16, null, null));
      if (this.s && this.b.b() > 0) {
        int i = 0;
        if (this.r)
          i = this.t.nextInt(this.b.b()); 
        b(this.b.a(i));
      } 
    } else if (paramInt == 2) {
      this.u = true;
      c();
    } else if (paramInt == 40) {
      if (this.l == 0) {
        this.b.a((String)paramObject);
      } else {
        String str = (str = (String)paramObject).substring(0, str.lastIndexOf('/') + 1);
        a(str);
      } 
      if (this.b.b() == 1)
        b(this.b.d()); 
      j();
      c();
    } else if (paramInt == 39) {
      if (this.n == 0) {
        d();
      } else if (this.n == 1) {
        b(this.b.d());
      } else {
        c();
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.e.isLeft(paramCommand))
      if (this.l == 0 && this.b.b() > 0) {
        b(this.b.a(this.e.getCurrIndex()));
        this.b.a = this.e.getCurrIndex();
      } else {
        this.p = this.f.getString();
        this.o = this.g.getString();
        this.m = Integer.parseInt(this.h.getString());
        this.r = this.i.isSelected(0);
        this.s = this.i.isSelected(1);
        this.n = this.i.getSelectedIndex();
        j();
      }  
    c();
  }
  
  public final void a(String paramString) {
    try {
      FileConnection fileConnection;
      Enumeration enumeration = (fileConnection = (FileConnection)Connector.open("file://localhost" + paramString)).list();
      fileConnection.close();
      while (enumeration.hasMoreElements()) {
        String str;
        if (!(str = enumeration.nextElement()).endsWith(".mp3"))
          continue; 
        this.b.a(paramString + str);
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void a() {
    this.l = 1;
    this.e = new FormEx("Настройки", new Command("Сохран.", 8, 0), new Command("Назад", 2, 0));
    this.i = new ChGroupEx("Действие на кнопку", 2, new String[] { "Случайный порядок", "Играть при старте" });
    this.j = new ChGroupEx("Настройики", 1, new String[] { "Ирать/пауза", "След. трек", "Плагин" });
    this.g = new TextField("Заголовок статуса", this.o, 255, 0);
    this.f = new TextField("Текст статуса", this.p, 255, 0);
    this.h = new TextField("Перемотка (сек.)", this.m + "", 3, 2);
    this.i.setSelectedIndex(0, this.r);
    this.i.setSelectedIndex(1, this.s);
    this.j.setSelectedIndex(this.n, true);
    this.e.append((Item)this.g);
    this.e.append((Item)this.f);
    this.e.append((Item)this.j);
    this.e.append((Item)this.i);
    this.e.append((Item)this.h);
    this.e.append("Макросы (англ. буквами)", false);
    this.e.append("%a - исполнитель", false);
    this.e.append("%T - название", false);
    this.e.append("%A - альбом", false);
    this.e.append("%d - длительность", false);
    this.e.setDisplay(this.d);
    this.e.setListener(this);
    this.d.setCurrent((Displayable)this.e);
  }
  
  public final void b() {
    this.l = 0;
    this.e = new FormEx("Плейлист", new Command("Играть", 8, 0), new Command("Назад", 2, 0));
    if (this.b.b() > 0) {
      for (byte b = 0; b < this.b.b(); b++) {
        String str = this.b.a(b);
        this.e.append(str.substring(str.lastIndexOf('/') + 1), false);
      } 
    } else {
      this.e.append("Пустой плейлист", false);
    } 
    this.e.setListener(this);
    this.d.setCurrent((Displayable)this.e);
  }
  
  public final void c() {
    if (this.c == null)
      this.c = new GUI(this); 
    this.d.setCurrent((Displayable)this.c);
  }
  
  public final void b(String paramString) {
    try {
      if (this.a != null) {
        this.a.close();
        this.a = null;
      } 
      if (paramString == null)
        return; 
      this.a = Manager.createPlayer("file://" + paramString);
      this.a.realize();
      this.a.prefetch();
      this.a.addPlayerListener(this);
      g();
      h();
      this.a.start();
      a(this.k);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void d() {
    try {
      if (this.a == null) {
        b(this.b.a(this.b.a));
      } else if (this.a.getState() == 400) {
        this.a.deallocate();
      } else if (this.a.getState() == 200) {
        this.a.start();
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final String c(String paramString) {
    MetaDataControl metaDataControl;
    return ((metaDataControl = (MetaDataControl)this.a.getControl("MetaDataControl")) != null) ? metaDataControl.getKeyValue(paramString) : ("unk_" + paramString);
  }
  
  public final String e() {
    return (this.a != null) ? a(this.a.getDuration()) : "";
  }
  
  public final String f() {
    return (this.a != null) ? a(this.a.getMediaTime()) : "";
  }
  
  public final String a(long paramLong) {
    long l = paramLong / 1000000L;
    String str1 = b(l % 60L);
    String str2 = b(l / 60L);
    return str2 + ":" + str1;
  }
  
  public final String b(long paramLong) {
    return (paramLong > 9L) ? (paramLong + "") : ("0" + paramLong);
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (paramString.equals("endOfMedia"))
      b(this.b.d()); 
  }
  
  public final void a(int paramInt) {
    if (this.a != null)
      try {
        ((VolumeControl)this.a.getControl("VolumeControl")).setLevel(paramInt);
        return;
      } catch (Exception exception) {} 
  }
  
  public final void g() {
    this.q[0] = c("title");
    this.q[1] = c("author");
    this.q[2] = c("album");
  }
  
  public final String d(String paramString) {
    String[] arrayOfString1 = Strings.explode("%a|%T|%A%|%d|", '|');
    String[] arrayOfString2 = Strings.explode(this.q[1] + "|" + this.q[0] + "|" + this.q[2] + "|" + e() + "|", '|');
    for (byte b = 0; b < arrayOfString1.length; b++) {
      paramString = (String)request(41, (Object[])new String[] { paramString, arrayOfString1[b], arrayOfString2[b] }, null);
    } 
    return paramString;
  }
  
  public final void h() {
    request(18, new Object[] { new Integer(218), new Integer(10) }, null);
    request(18, new Object[] { new Integer(130), new String(this.o) }, null);
    request(18, new Object[] { new Integer(131), d(this.p) }, null);
    request(19, null, null);
    request(25, null, null);
  }
  
  private final void i() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      this.o = dataInputStream.readUTF();
      this.p = dataInputStream.readUTF();
      this.m = dataInputStream.readInt();
      this.n = dataInputStream.readInt();
      this.r = dataInputStream.readBoolean();
      this.s = dataInputStream.readBoolean();
      this.b.a(dataInputStream);
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void j() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeUTF(this.o);
      dataOutputStream.writeUTF(this.p);
      dataOutputStream.writeInt(this.m);
      dataOutputStream.writeInt(this.n);
      dataOutputStream.writeBoolean(this.r);
      dataOutputStream.writeBoolean(this.s);
      this.b.a(dataOutputStream);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  class Task extends TimerTask {
    private final PlgPlayer a;
    
    public Task(PlgPlayer this$0) {
      this.a = this$0;
      (new Timer()).schedule(this, 0L, 1000L);
    }
    
    public final void run() {
      if (!this.a.u)
        cancel(); 
      this.a.c.repaint();
    }
  }
  
  class PList {
    public int a;
    
    public Vector b;
    
    private final PlgPlayer c;
    
    public PList(PlgPlayer this$0) {
      this.c = this$0;
      this.a = 0;
      this.b = new Vector();
    }
    
    public final void a(String param1String) {
      this.b.addElement(param1String);
    }
    
    public final void a() {
      if (this.b.size() > 0)
        this.b.removeElementAt(this.a); 
    }
    
    public final int b() {
      return this.b.size();
    }
    
    public final String a(int param1Int) {
      return this.b.elementAt(param1Int);
    }
    
    public final String c() {
      if (b() == 0)
        return null; 
      if (!this.c.r) {
        this.a--;
        if (this.a < 0)
          this.a = b() - 1; 
      } else {
        this.a = this.c.t.nextInt(b());
      } 
      return this.b.elementAt(this.a);
    }
    
    public final String d() {
      if (b() == 0)
        return null; 
      if (!this.c.r) {
        this.a++;
        if (b() - 1 < this.a)
          this.a = 0; 
        return this.b.elementAt(this.a);
      } 
      this.a = this.c.t.nextInt(b());
      return this.b.elementAt(this.c.t.nextInt(b()));
    }
    
    public final void a(DataInputStream param1DataInputStream) {
      try {
        int i = param1DataInputStream.readInt();
        for (byte b = 0; b < i; b++)
          a(param1DataInputStream.readUTF()); 
        return;
      } catch (IOException iOException) {
        return;
      } 
    }
    
    public final void a(DataOutputStream param1DataOutputStream) {
      try {
        param1DataOutputStream.writeInt(b());
        for (byte b = 0; b < b(); b++)
          param1DataOutputStream.writeUTF(this.b.elementAt(b)); 
        return;
      } catch (IOException iOException) {
        return;
      } 
    }
  }
  
  class GUI extends Canvas {
    public Font a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int[] f;
    
    public Image g;
    
    public int h;
    
    public int i;
    
    private final PlgPlayer j;
    
    public GUI(PlgPlayer this$0) {
      this.j = this$0;
      this.a = Font.getFont(64, 0, 8);
      this.b = this.a.getHeight();
      this.c = 24;
      this.d = 46;
      this.e = this.b + 2;
      this.f = (int[])this.j.request(16, null, null);
      setFullScreenMode(true);
    }
    
    public final void paint(Graphics param1Graphics) {
      param1Graphics.setColor(this.f[0]);
      param1Graphics.fillRect(0, 0, getWidth(), getHeight());
      param1Graphics.setFont(this.a);
      this.h = this.e + 2;
      this.i = getHeight() - this.e - 2 - this.c * 4;
      try {
        this.g = Image.createImage("/res/skin.png");
        param1Graphics.drawImage(this.g, getWidth() / 2, getHeight() / 2, 3);
      } catch (IOException iOException) {}
      a(param1Graphics, (this.g == null));
      b(param1Graphics, (this.g == null));
      param1Graphics.setColor(this.f[1]);
      if (this.j.a != null) {
        param1Graphics.drawString(this.j.q[0], 2, this.h, 20);
        param1Graphics.drawString(this.j.q[1], 2, this.h + this.b, 20);
        param1Graphics.drawString(this.j.q[2], 2, this.h + this.b * 2, 20);
        param1Graphics.drawString(this.j.f(), 2, this.h + this.b * 3, 20);
        param1Graphics.drawString(this.j.e(), getWidth() - 2, this.h + this.b * 3, 24);
        param1Graphics.drawRect(2, this.h + this.b * 4, getWidth() - 4, this.b / 2);
        param1Graphics.setColor(this.f[4]);
        param1Graphics.fillRect(3, this.h + this.b * 4 + 1, (int)a(), this.b / 2 - 1);
      } 
      if (this.g == null) {
        this.h = (getWidth() - this.d * 3) / 2;
        byte b;
        for (b = 0; b < 3; b++)
          a(param1Graphics, this.h + this.d * b, this.i, this.d, this.c, "/res/" + (b + 1) + ".png", (char)(b + 49)); 
        for (b = 0; b < 3; b++)
          a(param1Graphics, this.h + this.d * b, this.i + this.c, this.d, this.c, "/res/" + (b + 4) + ".png", (char)(b + 52)); 
        for (b = 0; b < 3; b++)
          a(param1Graphics, this.h + this.d * b, this.i + this.c * 2, this.d, this.c, "/res/" + (b + 7) + ".png", (char)(b + 55)); 
        a(param1Graphics, this.h, this.i + this.c * 3, this.d, this.c, "/res/s.png", '*');
        a(param1Graphics, this.h + this.d, this.i + this.c * 3, this.d, this.c, "/res/0.png", '0');
        a(param1Graphics, this.h + this.d * 2, this.i + this.c * 3, this.d, this.c, "/res/d.png", '#');
      } 
    }
    
    public final void keyPressed(int param1Int) {
      if (param1Int == 42 || param1Int == 35) {
        this.j.l = (param1Int == 42) ? 0 : 1;
        this.j.request(43, null, null);
      } else if (param1Int == 55) {
        this.j.b();
      } else if (param1Int == 57) {
        this.j.b.a();
      } else if (param1Int == 54) {
        this.j.b(this.j.b.d());
      } else if (param1Int == 52) {
        this.j.b(this.j.b.c());
      } else if (param1Int == -7) {
        this.j.u = false;
        this.j.c = null;
        this.j.request(1, null, new Integer(0));
      } else if (param1Int == 56 || param1Int == 50) {
        this.j.k = (param1Int != 50) ? (this.j.k - 10) : (this.j.k + 10);
        if (this.j.k > 100) {
          this.j.k = 100;
        } else if (this.j.k < 0) {
          this.j.k = 0;
        } 
        this.j.a(this.j.k);
      } else if (param1Int == 48) {
        this.j.a();
      } else if (param1Int == 53) {
        this.j.d();
      } else if (param1Int == 49 || param1Int == 51) {
        try {
          if (this.j.a.getState() == 400) {
            int i = (param1Int == 49) ? (this.j.m - this.j.m * 2) : this.j.m;
            this.j.a.setMediaTime(this.j.a.getMediaTime() + (i * 1000000));
          } 
        } catch (Exception exception) {}
      } 
      repaint();
    }
    
    public final long a() {
      return getWidth() * this.j.a.getMediaTime() / this.j.a.getDuration();
    }
    
    public final void keyRepeated(int param1Int) {
      if (param1Int == 53) {
        try {
          this.j.a.stop();
          this.j.a.close();
          this.j.a = null;
        } catch (Exception exception) {}
      } else if (param1Int == 57) {
        this.j.b.b = new Vector();
        this.j.b.a = 0;
      } 
      repaint();
    }
    
    public final void a(Graphics param1Graphics, int param1Int1, int param1Int2, int param1Int3, int param1Int4, String param1String, char param1Char) {
      Colors.drawGradient(param1Graphics, param1Int1, param1Int2, param1Int3, param1Int4, this.f[8], 10, 64, -64);
      param1Graphics.setColor(this.f[23]);
      param1Graphics.drawRect(param1Int1, param1Int2, param1Int3, param1Int4);
      try {
        Image image = Image.createImage(param1String);
        param1Graphics.drawImage(image, param1Int1 + param1Int3 / 2, param1Int2 + param1Int4 / 2, 3);
      } catch (IOException iOException) {}
      param1Graphics.drawChar(param1Char, param1Int1 + 6, param1Int2, 17);
    }
    
    private final void a(Graphics param1Graphics, boolean param1Boolean) {
      if (param1Boolean)
        Colors.drawGradient(param1Graphics, 0, 0, getWidth(), this.e, this.f[4], 10, 64, -32); 
      param1Graphics.setColor(this.f[11]);
      StringBuffer stringBuffer;
      (stringBuffer = new StringBuffer()).append("Player v0.65");
      if (this.j.b.b() > 0)
        stringBuffer.append(" - ").append(this.j.b.a + 1).append('/').append(this.j.b.b()); 
      if (this.j.a != null)
        stringBuffer.append(" - ").append(this.j.k).append('%'); 
      param1Graphics.drawString(stringBuffer.toString(), 2, (this.e - this.b) / 2, 20);
    }
    
    private final void b(Graphics param1Graphics, boolean param1Boolean) {
      if (param1Boolean)
        Colors.drawGradient(param1Graphics, 0, getHeight() - this.e, getWidth(), this.e, this.f[4], 10, 64, -32); 
      param1Graphics.setColor(this.f[11]);
      param1Graphics.drawString("Назад", getWidth() - 2, getHeight() - (this.e + this.b) / 2, 24);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgPlayer.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */