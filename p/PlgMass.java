package p;

import i.C;
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
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextBox;

public class PlgMass extends PI implements CommandListener {
  private Form d;
  
  private Command e = new Command("Назад", 2, 2);
  
  private Command f = new Command("Включить", 8, 1);
  
  private Command g = new Command("Выключить", 8, 2);
  
  private Command h = new Command("Массовая рассылка", 8, 4);
  
  private Command i = new Command("Назад", 2, 2);
  
  private Command j = new Command("Выбрать", 4, 1);
  
  public Vector a = new Vector();
  
  public Object[] b;
  
  public int c;
  
  private Display k;
  
  private TextBox l;
  
  private List m;
  
  private boolean n;
  
  private List o;
  
  public PlgMass() {
    this.a.addElement(this.h);
    this.n = true;
  }
  
  public String getName() {
    return "Массовая рассылка";
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    switch (paramInt) {
      case 2:
        a((Display)paramObject);
        return null;
      case 0:
        this.k = (Display)paramObject;
        a(request(7, null, null));
        return null;
      case 26:
        return this.a;
      case 27:
        return this.n ? this.a : null;
      case 28:
        if (paramObject != this.h)
          return null; 
        this.l = (TextBox)paramArrayOfObject[0];
        if (paramObject == this.h) {
          if (this.m == null) {
            this.m = new List("Массовая рассылка", 3, new String[] { "Выбрать", "Всем кроме временных", "Онлайн", "С непрочитанными", "С чатом" }, null);
            this.m.setCommandListener(this);
            this.m.addCommand(this.i);
            this.m.addCommand(this.j);
          } 
          this.k.setCurrent((Displayable)this.m);
        } 
        return null;
    } 
    return null;
  }
  
  private void b() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeInt(2);
      dataOutputStream.writeBoolean(this.n);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
  }
  
  private int a(Vector paramVector, C paramC) {
    int i;
    if ((i = paramVector.size()) == 0)
      return 0; 
    int j = 0;
    int k = i - 1;
    int m = a(paramC, paramVector.elementAt(0));
    int n = a(paramC, paramVector.elementAt(k));
    if (m < 0)
      return 0; 
    if (n > 0)
      return i; 
    while (true) {
      int i1 = (j + k) / 2;
      int i2;
      if (((i2 = a(paramC, paramVector.elementAt(i1))) <= 0 && n >= 0) || (i2 >= 0 && n <= 0)) {
        j = i1;
        m = i2;
      } else {
        k = i1;
        n = i2;
      } 
      if (k - j <= 1)
        return (m < 0) ? j : k; 
    } 
  }
  
  private int a(C paramC1, C paramC2) {
    int i = paramC1.getSortWeight(this.c);
    int j = paramC2.getSortWeight(this.c);
    if (i < j)
      return -1; 
    if (i > j)
      return 1; 
    String str1 = paramC1.getText();
    String str2 = paramC2.getText();
    return str1.compareTo(str2);
  }
  
  public final void a() {
    Vector vector = new Vector();
    if (this.b == null)
      return; 
    int i = this.b.length;
    for (byte b = 0; b < i; b++) {
      C c = (C)this.b[b];
      vector.insertElementAt(c, a(vector, c));
    } 
    vector.copyInto(this.b);
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramDisplayable != null && paramDisplayable == this.o) {
      if (paramCommand == this.e) {
        this.k.setCurrent((Displayable)this.m);
        this.b = null;
        this.o = null;
      } 
      if (paramCommand == this.j) {
        if (request(9, null, null) == null)
          for (byte b = 0; b < this.o.size(); b++) {
            if (this.o.isSelected(b)) {
              C c = (C)this.b[b];
              request(8, (Object[])new String[] { c.getUinString(), this.l.getString() }, null);
            } 
          }  
        this.b = null;
        this.o.deleteAll();
        this.o = null;
        this.m = null;
        request(1, null, new Integer(1));
      } 
      return;
    } 
    if (paramCommand == this.e) {
      request(1, null, new Integer(0));
      b();
    } 
    if (paramCommand == this.i) {
      this.k.setCurrent((Displayable)this.l);
      this.l = null;
    } 
    if (paramCommand == List.SELECT_COMMAND || paramCommand == this.j)
      a(this.m.getSelectedIndex()); 
    if (paramCommand == this.f) {
      this.n = true;
      if (this.m != null) {
        this.d.removeCommand(this.f);
        this.d.addCommand(this.g);
      } 
      b();
    } 
    if (paramCommand == this.g) {
      this.n = false;
      if (this.m != null) {
        this.d.removeCommand(this.g);
        this.d.addCommand(this.f);
      } 
      b();
    } 
  }
  
  private void a(int paramInt) {
    this.o = new List("Выберите контакт", 2);
    this.b = (Object[])request(3, null, null);
    Object object = request(13, null, new Integer(0));
    this.c = ((Integer)request(17, new Object[] { new Integer(205) }, null)).intValue();
    a();
    Image[] arrayOfImage = new Image[30];
    for (byte b = 0; b < this.b.length; b++) {
      C c;
      String str = (c = (C)this.b[b]).getText();
      Image image = null;
      int i = c.getImageIndex();
      try {
        if (arrayOfImage[i] == null) {
          I i1;
          image = (i1 = (I)request(14, new Object[] { object, new Integer(i) }, null)).createImage();
          arrayOfImage[i] = image;
        } else {
          image = arrayOfImage[i];
        } 
      } catch (Exception exception) {}
      this.o.append(str, image);
      boolean bool = false;
      switch (paramInt) {
        case 0:
          bool = false;
          break;
        case 1:
          bool = (!c.getBooleanValue(8) && !c.getBooleanValue(32));
          break;
        case 2:
          bool = (i != 6);
          break;
        case 3:
          bool = (c.getIntValue(67) > 0);
          break;
        case 4:
          bool = c.getBooleanValue(16);
          break;
      } 
      this.o.setSelectedIndex(b, bool);
    } 
    this.o.addCommand(this.j);
    this.o.addCommand(this.e);
    this.o.setCommandListener(this);
    this.k.setCurrent((Displayable)this.o);
  }
  
  private void a(Object paramObject) {
    if (paramObject != null && paramObject instanceof byte[]) {
      DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
      try {
        dataInputStream.readInt();
        boolean bool = false;
        this.n = dataInputStream.readBoolean();
        return;
      } catch (IOException iOException) {}
    } 
  }
  
  private void a(Display paramDisplay) {
    if (this.d == null) {
      this.d = new Form("Массовая рассылка");
      this.d.append("Расслка сразу нескольким контактам.");
      this.d.addCommand(this.e);
      this.d.setCommandListener(this);
    } 
    if (this.n) {
      this.d.removeCommand(this.f);
      this.d.addCommand(this.g);
    } else {
      this.d.removeCommand(this.g);
      this.d.addCommand(this.f);
    } 
    paramDisplay.setCurrent((Displayable)this.d);
    this.k = paramDisplay;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgMass.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */