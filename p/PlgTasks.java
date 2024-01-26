package p;

import i.I;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import ui.ChGroupEx;
import ui.Config;
import ui.FormEx;
import ui.Strings;

public class PlgTasks extends PI implements CommandListener {
  public Vector a = new Vector();
  
  public Display b;
  
  public FormEx c;
  
  public ChGroupEx d;
  
  public ChGroupEx e;
  
  public boolean[] f = new boolean[] { true };
  
  public String[] g = new String[] { "v100 p50 v100" };
  
  public String[] h = Strings.explode("Подключиться|Отключиться|Блокировка|Выход|Включить звук|Выключить звук|Проиграть звук|", '|');
  
  public TextField i;
  
  public TextField j;
  
  public TextField k;
  
  public int l = 0;
  
  public final String getName() {
    return "Менеджер заданий";
  }
  
  public final I getIcon() {
    return (I)request(14, new Object[] { request(13, null, new Integer(1)), new Integer(26) }null);
  }
  
  public final Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    if (paramInt == 0) {
      h();
      this.b = (Display)paramObject;
      Config.set((int[])request(16, null, null));
      request(31, new Object[] { new Long(0L), new Long(60000L) }, null);
    } else if (paramInt == 2) {
      d();
    } else {
      int i;
      if (paramInt == 36 && (i = a(c())) > -1) {
        Task task = this.a.elementAt(i);
        a(task);
        if (task.d) {
          this.a.removeElementAt(i);
          i();
        } 
      } 
    } 
    return null;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (this.l == 0) {
      if (paramCommand == List.SELECT_COMMAND) {
        switch (this.c.getCurrIndex()) {
          case 0:
            e();
            break;
          case 1:
            f();
            break;
          case 2:
            a();
            break;
          case 3:
            g();
            break;
        } 
        return;
      } 
      request(1, null, new Integer(0));
      this.c = null;
      return;
    } 
    if (this.l == 1) {
      if (paramCommand == List.SELECT_COMMAND) {
        this.a.removeElementAt(this.c.getCurrIndex());
        this.c.remove(this.c.getCurrIndex());
        i();
        if (this.a.size() == 0) {
          d();
          return;
        } 
      } else {
        d();
        return;
      } 
    } else {
      if (this.l == 2 || this.l == 3) {
        if (this.c.isLeft(paramCommand)) {
          String[] arrayOfString = { "", "", "" };
          int i = this.d.getSelectedIndex();
          if (this.d.size() > 7) {
            arrayOfString = new String[] { this.d.getSelectedIndex() + "", this.j.getString(), this.k.getString() };
            i = 7;
          } 
          Task task = new Task(this, i, this.i.getString(), this.e.isSelected(1), arrayOfString);
          this.a.addElement(task);
          i();
        } 
        d();
        return;
      } 
      if (this.l == 4) {
        if (this.c.isLeft(paramCommand))
          i(); 
        d();
      } 
    } 
  }
  
  private final void d() {
    this.l = 0;
    this.c = new FormEx("Tasks v0.4", null, new Command("Назад", 2, 0));
    this.c.append("Просмотреть", true);
    this.c.append("Добавить", true);
    this.c.append("Cмена доп. статуса", true);
    this.c.append("Настройки", true);
    this.c.setListener(this);
    this.b.setCurrent((Displayable)this.c);
  }
  
  private final void e() {
    this.l = 1;
    this.c = new FormEx("Просмотреть", null, new Command("Назад", 2, 0));
    if (this.a.size() == 0) {
      this.c.append("Заданий нет", false);
    } else {
      for (byte b = 0; b < this.a.size(); b++) {
        Task task = this.a.elementAt(b);
        StringBuffer stringBuffer;
        (stringBuffer = new StringBuffer()).append(task.b).append(": ").append(task.a());
        if (task.d)
          stringBuffer.append(" (x)"); 
        this.c.append(stringBuffer.toString(), true);
      } 
    } 
    this.c.setListener(this);
    this.b.setCurrent((Displayable)this.c);
  }
  
  public final void a() {
    this.l = 3;
    this.c = new FormEx("Смена доп. статуса", new Command("Добав.", 8, 0), new Command("Назад", 2, 0));
    String[] arrayOfString = (String[])request(26, null, null);
    this.d = new ChGroupEx("Доп. статус", 1, arrayOfString);
    b();
    this.c.append((Item)this.d);
    this.c.append((Item)this.j);
    this.c.append((Item)this.k);
    this.c.append((Item)this.i);
    this.c.append((Item)this.e);
    this.c.setDisplay(this.b);
    this.c.setListener(this);
    this.b.setCurrent((Displayable)this.c);
  }
  
  private final void f() {
    this.l = 2;
    this.c = new FormEx("Добавить", new Command("Добав.", 8, 0), new Command("Назад", 2, 0));
    b();
    this.c.append((Item)this.d);
    this.c.append((Item)this.e);
    this.c.append((Item)this.i);
    this.c.setDisplay(this.b);
    this.c.setListener(this);
    this.b.setCurrent((Displayable)this.c);
  }
  
  private final void g() {
    this.l = 4;
    this.c = new FormEx("Настройки", new Command("Сохран.", 4, 0), new Command("Назад", 2, 0));
    this.d = new ChGroupEx(null, 2, new String[] { "Оповещение" });
    this.i = new TextField("Мелодия вибры", this.g[0], 15, 0);
    this.d.setSelectedIndex(0, this.f[0]);
    this.c.append((Item)this.d);
    this.c.append((Item)this.i);
    this.c.setDisplay(this.b);
    this.c.setListener(this);
    this.b.setCurrent((Displayable)this.c);
  }
  
  public final void b() {
    if (this.l == 2) {
      this.d = new ChGroupEx("Задания", 1, this.h);
    } else {
      this.j = new TextField("Заголовок", null, 50, 0);
      this.k = new TextField("Текст", null, 50, 0);
    } 
    this.i = new TextField("Время", c(), 5, 0);
    this.e = new ChGroupEx("После выполнения", 1, new String[] { "Оставить", "Удалять" });
  }
  
  private final int a(String paramString) {
    for (byte b = 0; b < this.a.size(); b++) {
      Task task;
      if ((task = this.a.elementAt(b)).b.equals(paramString))
        return b; 
    } 
    return -1;
  }
  
  public final void a(Task paramTask) {
    String[] arrayOfString;
    int i = paramTask.a;
    boolean bool = ((Boolean)request(17, new Object[] { new Integer(43) }, null)).booleanValue();
    boolean bool1 = (request(9, null, null) == null) ? true : false;
    switch (i) {
      case 0:
        if (!bool1)
          request(1, null, new Integer(101)); 
        break;
      case 1:
        if (bool1)
          request(1, null, new Integer(102)); 
        break;
      case 5:
        if (!bool)
          request(1, null, new Integer(115)); 
        break;
      case 4:
        if (bool)
          request(1, null, new Integer(115)); 
        break;
      case 2:
        request(1, null, new Integer(106));
        break;
      case 3:
        request(1, null, new Integer(121));
        break;
      case 6:
        if (bool)
          return; 
        try {
          Player player;
          (player = Manager.createPlayer(getClass().getResourceAsStream("/alarm.mp3"), "audio/mpeg")).realize();
          player.prefetch();
          ((VolumeControl)player.getControl("VolumeControl")).setLevel(100);
          player.start();
        } catch (Exception exception) {}
        break;
      case 7:
        arrayOfString = paramTask.c;
        request(18, new Object[] { new Integer(218), new Integer(Integer.parseInt(arrayOfString[0])) }, null);
        request(18, new Object[] { new Integer(130), new String(arrayOfString[1]) }, null);
        request(18, new Object[] { new Integer(131), new String(arrayOfString[2]) }, null);
        request(19, null, null);
        request(25, null, null);
        break;
    } 
    if (this.f[0] && this.g[0].length() > 0)
      request(12, null, this.g[0]); 
  }
  
  private final void h() {
    byte[] arrayOfByte;
    if ((arrayOfByte = (byte[])request(7, null, null)) == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
    try {
      int i = dataInputStream.readUnsignedByte();
      byte b;
      for (b = 0; b < i; b++)
        this.f[b] = dataInputStream.readBoolean(); 
      i = dataInputStream.readUnsignedByte();
      for (b = 0; b < i; b++)
        this.g[b] = dataInputStream.readUTF(); 
      i = dataInputStream.readInt();
      for (b = 0; b < i; b++)
        this.a.addElement(new Task(this, dataInputStream)); 
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
  
  private final void i() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeByte(this.f.length);
      byte b;
      for (b = 0; b < this.f.length; b++)
        dataOutputStream.writeBoolean(this.f[b]); 
      dataOutputStream.writeByte(this.g.length);
      for (b = 0; b < this.f.length; b++)
        dataOutputStream.writeUTF(this.g[b]); 
      dataOutputStream.writeInt(this.a.size());
      for (b = 0; b < this.a.size(); b++) {
        Task task;
        (task = this.a.elementAt(b)).a(dataOutputStream);
      } 
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  public final String c() {
    String str;
    return (str = (String)request(23, new Object[] { new Boolean(false), new Boolean(false) }, null)).substring(11, 16);
  }
  
  class Task {
    public int a;
    
    public String b;
    
    public String[] c;
    
    public boolean d;
    
    private final PlgTasks e;
    
    public Task(PlgTasks this$0, DataInputStream param1DataInputStream) throws IOException {
      this.e = this$0;
      this.a = param1DataInputStream.readInt();
      this.b = param1DataInputStream.readUTF();
      this.d = param1DataInputStream.readBoolean();
      this.c = new String[] { param1DataInputStream.readUTF(), param1DataInputStream.readUTF(), param1DataInputStream.readUTF() };
    }
    
    public Task(PlgTasks this$0, int param1Int, String param1String, boolean param1Boolean, String[] param1ArrayOfString) {
      this.e = this$0;
      this.a = param1Int;
      this.b = param1String;
      this.d = param1Boolean;
      this.c = param1ArrayOfString;
    }
    
    public final String a() {
      return (this.a != 7) ? this.e.h[this.a] : "Сменить х-статус";
    }
    
    public final void a(DataOutputStream param1DataOutputStream) throws IOException {
      param1DataOutputStream.writeInt(this.a);
      param1DataOutputStream.writeUTF(this.b);
      param1DataOutputStream.writeBoolean(this.d);
      param1DataOutputStream.writeUTF(this.c[0]);
      param1DataOutputStream.writeUTF(this.c[1]);
      param1DataOutputStream.writeUTF(this.c[2]);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgTasks.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */