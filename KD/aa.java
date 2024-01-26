package KD;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public final class aa extends List implements CommandListener {
  public ae a;
  
  private Image b = u.a("/images/lib/lib_allvideo.png");
  
  private Image c = u.a("/images/lib/lib_music.png");
  
  private p d;
  
  private Command e;
  
  private r f;
  
  private Command g;
  
  private Command h;
  
  private Command i;
  
  private Command j;
  
  private Command k;
  
  private Command l;
  
  private Command m;
  
  private Command n;
  
  private Command o;
  
  private int p = 0;
  
  public aa(ae paramae) {
    super("Текущий", 3);
    this.a = paramae;
    this.i = new Command("Воспр.", 4, 0);
    this.j = new Command("Информация", 4, 1);
    this.k = new Command("Добавить файлы", 4, 2);
    this.l = new Command("Удалить", 4, 3);
    this.m = new Command("Сортировать", 4, 4);
    this.n = new Command("Назад", 2, 1);
    this.o = new Command("", 4, 0);
    setSelectCommand(this.i);
    addCommand(this.j);
    addCommand(this.k);
    addCommand(this.l);
    addCommand(this.m);
    addCommand(this.n);
    setCommandListener(this);
    this.f = new r();
    this.g = new Command("Выбрать", 4, 0);
    this.h = new Command("Отмена", 2, 1);
    this.f.setSelectCommand(this.g);
    this.f.addCommand(this.h);
    this.f.setCommandListener(this);
  }
  
  public final void a(int paramInt) {
    if (size() > 0)
      deleteAll(); 
    String[] arrayOfString;
    if ((arrayOfString = this.a.f.b()) != null) {
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (this.a.f.d(b)) {
          append((b + 1) + ". " + arrayOfString[b], this.b);
        } else {
          append((b + 1) + ". " + arrayOfString[b], this.c);
        } 
      } 
      if (paramInt >= arrayOfString.length)
        paramInt = arrayOfString.length - 1; 
      if ((((paramInt >= 0) ? 1 : 0) & ((paramInt < arrayOfString.length) ? 1 : 0)) != 0)
        setSelectedIndex(paramInt, true); 
    } 
    this.a.a.setCurrent((Displayable)this);
  }
  
  private void a() {
    this.a.g();
    deleteAll();
  }
  
  private void b(int paramInt) {
    String str;
    if (paramInt >= 0 && (str = this.a.f.c(paramInt)) != null) {
      this.d = new p(str, this.a.a);
      this.e = new Command("Назад", 2, 0);
      this.d.addCommand(this.e);
      this.d.setCommandListener(this);
    } 
  }
  
  private void b() {
    this.a.a.setCurrent((Displayable)this);
    this.d.deleteAll();
    this.e = null;
    this.d = null;
  }
  
  private void c() {
    if (this.a.f.c > 1) {
      this.f.setSelectedIndex(0, true);
      this.a.a.setCurrent((Displayable)this.f);
    } 
  }
  
  private void d() {
    this.a.a.setCurrent((Displayable)this);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    int i = getSelectedIndex();
    if (paramCommand == this.i) {
      if ((((i >= 0) ? 1 : 0) & ((i < this.a.f.c) ? 1 : 0)) != 0) {
        this.a.e();
        this.a.e.a(i, true);
      } else {
        return;
      } 
    } else {
      if (paramCommand == this.j) {
        b(i);
        return;
      } 
      if (paramCommand == this.e) {
        b();
        return;
      } 
      if (paramCommand == this.k) {
        this.p = i;
        this.a.j.a(this.o, this, this.a.k());
        return;
      } 
      if (paramCommand == this.o) {
        if (this.a.j.n != null) {
          if (this.a.j.n.length > 0) {
            this.a.e();
            this.a.e.a(this.a.j.n);
            a(this.a.f.c - 1);
            return;
          } 
          a(this.p);
          return;
        } 
        a(this.p);
        return;
      } 
      if (paramCommand == this.l) {
        if ((((i >= 0) ? 1 : 0) & ((i < this.a.f.c) ? 1 : 0)) != 0) {
          this.a.e();
          this.a.f.a(i);
          a(i);
          return;
        } 
      } else {
        if (paramCommand == this.m) {
          c();
          return;
        } 
        if (paramCommand == this.g) {
          int j;
          if ((j = this.f.getSelectedIndex()) >= 0) {
            this.a.e();
            this.a.f.b(j + 1);
            a(this.a.f.b);
          } 
          return;
        } 
        if (paramCommand == this.h) {
          d();
          return;
        } 
        if (paramCommand == this.n) {
          a();
          return;
        } 
      } 
      return;
    } 
    a();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\aa.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */