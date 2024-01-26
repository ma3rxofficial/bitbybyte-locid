package p;

import i.C;
import i.PI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;

public class PlgGame1 extends PI implements CommandListener {
  public boolean a = true;
  
  public Display b;
  
  public int c = 0;
  
  public int d = 8;
  
  public int e = 5;
  
  private Form l;
  
  private Command m = new Command("Поиск противника", 4, 1);
  
  private Command n = new Command("Сохранить", 4, 1);
  
  private Command o = new Command("Отмена", 2, 2);
  
  public ChoiceGroup f = new ChoiceGroup("Опции:", 2, new String[] { "Активировать игру", "В половину размера", "Опция 2" }, null);
  
  private boolean[] p = new boolean[] { false, false, false };
  
  public Font g = Font.getFont(0, 0, 8);
  
  private Vector q = new Vector();
  
  private Command r = new Command("Игра X-O", 8, 3);
  
  public int[] h;
  
  private int s = 0;
  
  private int t = 0;
  
  private String u = "0";
  
  private String v = "0";
  
  private String w = "";
  
  private String x = "";
  
  private byte[] y = new byte[this.d * this.e];
  
  public int i = 0;
  
  private int z;
  
  private int A = 0;
  
  private Random B = new Random();
  
  private String C = "";
  
  private boolean D = true;
  
  public String j = "";
  
  public Object[] k = new Object[] { "", { 1 } };
  
  public String getName() {
    return "Игра x-o";
  }
  
  public final byte a(int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[4];
    int i;
    if ((i = b(paramInt1, paramInt2)) == 0)
      return 0; 
    byte b;
    for (b = 1; b < 4 && b(paramInt1 + b, paramInt2) == i; b++)
      arrayOfInt[0] = arrayOfInt[0] + 1; 
    for (b = 1; b < 4 && b(paramInt1 - b, paramInt2) == i; b++)
      arrayOfInt[0] = arrayOfInt[0] + 1; 
    for (b = 1; b < 4 && b(paramInt1, paramInt2 + b) == i; b++)
      arrayOfInt[1] = arrayOfInt[1] + 1; 
    for (b = 1; b < 4 && b(paramInt1, paramInt2 - b) == i; b++)
      arrayOfInt[1] = arrayOfInt[1] + 1; 
    for (b = 1; b < 4 && b(paramInt1 + b, paramInt2 + b) == i; b++)
      arrayOfInt[2] = arrayOfInt[2] + 1; 
    for (b = 1; b < 4 && b(paramInt1 - b, paramInt2 - b) == i; b++)
      arrayOfInt[2] = arrayOfInt[2] + 1; 
    for (b = 1; b < 4 && b(paramInt1 + b, paramInt2 - b) == i; b++)
      arrayOfInt[3] = arrayOfInt[3] + 1; 
    for (b = 1; b < 4 && b(paramInt1 - b, paramInt2 + b) == i; b++)
      arrayOfInt[3] = arrayOfInt[3] + 1; 
    b = 0;
    if (arrayOfInt[0] >= 3) {
      byte b2;
      for (b2 = 1; b2 < 4 && b(paramInt1 + b2, paramInt2) == i; b2++)
        c(paramInt1 + b2, paramInt2); 
      for (b2 = 1; b2 < 4 && b(paramInt1 - b2, paramInt2) == i; b2++)
        c(paramInt1 - b2, paramInt2); 
      b = 1;
    } 
    if (arrayOfInt[1] >= 3) {
      byte b2;
      for (b2 = 1; b2 < 4 && b(paramInt1, paramInt2 + b2) == i; b2++)
        c(paramInt1, paramInt2 + b2); 
      for (b2 = 1; b2 < 4 && b(paramInt1, paramInt2 - b2) == i; b2++)
        c(paramInt1, paramInt2 - b2); 
      b = 1;
    } 
    if (arrayOfInt[2] >= 3) {
      byte b2;
      for (b2 = 1; b2 < 4 && b(paramInt1 + b2, paramInt2 + b2) == i; b2++)
        c(paramInt1 + b2, paramInt2 + b2); 
      for (b2 = 1; b2 < 4 && b(paramInt1 - b2, paramInt2 - b2) == i; b2++)
        c(paramInt1 - b2, paramInt2 - b2); 
      b = 1;
    } 
    if (arrayOfInt[3] >= 3) {
      byte b2;
      for (b2 = 1; b2 < 4 && b(paramInt1 + b2, paramInt2 - b2) == i; b2++)
        c(paramInt1 + b2, paramInt2 - b2); 
      for (b2 = 1; b2 < 4 && b(paramInt1 - b2, paramInt2 + b2) == i; b2++)
        c(paramInt1 - b2, paramInt2 + b2); 
      b = 1;
    } 
    if (b != 0) {
      c(paramInt1, paramInt2);
    } else {
      if (this.i == this.d * this.e + 1) {
        this.C = "Ничъя";
        this.D = true;
        return 0;
      } 
      return 0;
    } 
    byte b1;
    if ((b1 = (byte)b(paramInt1, paramInt2)) == 1) {
      this.C = "Вы Проиграли";
      this.D = true;
    } 
    if (b1 == 2) {
      this.D = true;
      this.C = "Вы победили";
    } 
    return b1;
  }
  
  private int b(int paramInt1, int paramInt2) {
    return (paramInt1 < 0) ? 3 : ((paramInt1 >= this.d) ? 3 : ((paramInt2 < 0) ? 3 : ((paramInt2 >= this.e) ? 3 : (this.y[paramInt1 + paramInt2 * this.d] & 0x3))));
  }
  
  private void c(int paramInt1, int paramInt2) {
    this.y[paramInt1 + paramInt2 * this.d] = (byte)(this.y[paramInt1 + paramInt2 * this.d] | 0x4);
  }
  
  public Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    int[] arrayOfInt1;
    Graphics graphics;
    String str1;
    int i;
    int[] arrayOfInt2;
    String str2;
    Vector vector;
    int j;
    int k;
    int m;
    Canvas canvas;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    switch (paramInt) {
      case 37:
        f();
        break;
      case 0:
        this.b = (Display)paramObject;
        a(request(7, null, null));
        this.h = new int[16];
        this.h[15] = 16776960;
        this.h[14] = 16711935;
        this.h = (int[])request(16, null, null);
        this.q.addElement(this.r);
        return null;
      case 2:
        a((Display)paramObject);
        return null;
      case 16:
        return this.q;
      case 17:
        return (this.p[0] && paramObject instanceof C) ? this.q : null;
      case 38:
        if ((arrayOfInt1 = (int[])paramObject)[3] == 1)
          if (arrayOfInt1[2] == 1000003 || arrayOfInt1[2] == 1000004 || arrayOfInt1[2] == 1000002) {
            request(34, null, null);
          } else if (arrayOfInt1[0] == 49) {
            a();
          } else if (arrayOfInt1[0] == 55) {
            this.p[1] = this.p[1] ^ true;
          } else if (arrayOfInt1[0] == 57) {
            e();
          } else if (arrayOfInt1[0] == 51) {
            c();
            this.D = true;
            if (this.d == 16) {
              this.d = 8;
              this.e = 5;
              this.A = b();
              this.c = 0;
            } else {
              this.d = 16;
              this.e = 10;
              this.A = b() | 0x1;
              this.c = 0;
            } 
            this.y = new byte[this.d * this.e];
          } else if (arrayOfInt1[2] == 1000001 || arrayOfInt1[0] == 48 || arrayOfInt1[0] == 42 || (arrayOfInt1[2] == 8 && this.a)) {
            this.a = !this.a;
          } else if (arrayOfInt1[2] == 8 && !this.a) {
            int i6 = a(this.c);
            if (!this.D) {
              if (this.i <= 0) {
                this.z = 1;
                if (this.i == -1) {
                  this.y = new byte[this.d * this.e];
                  this.A = b() + (this.A & 0x1);
                } 
                this.i = 1;
                this.v = this.u;
                this.w = this.x;
              } 
              this.i++;
              int i7;
              if ((this.i & 0x1) == this.z && (this.v.equals(this.u) || this.i > 0) && (i7 = this.c + i6 * this.d) >= 0) {
                this.y[i7] = 2;
                a(this.c, i6);
                a(this.v, "GXO:" + this.c + "," + this.A + "," + this.i, false);
              } 
            } else {
              this.a = true;
            } 
          } else if (arrayOfInt1[2] == 2) {
            this.c--;
            if (this.c < 0)
              this.c = 0; 
          } else if (arrayOfInt1[2] == 5) {
            this.c++;
            if (this.c >= this.d)
              this.c = this.d - 1; 
          } else {
            if (arrayOfInt1[2] == 1)
              return null; 
            if (arrayOfInt1[2] == 6)
              return null; 
            if (arrayOfInt1[0] == 35) {
              arrayOfInt1[0] = 8;
              arrayOfInt1[2] = 8;
              request(34, null, null);
              return null;
            } 
          }  
        request(10, null, null);
        return arrayOfInt1;
      case 18:
        if (paramObject != this.r)
          return null; 
        this.u = (String)paramArrayOfObject[4];
        this.x = (String)paramArrayOfObject[5];
        if (this.i >= 0)
          this.a = false; 
        request(33, null, null);
        request(10, null, null);
        return this;
      case 39:
        if (paramObject != null && paramObject instanceof C) {
          C c = (C)paramObject;
          this.u = c.getUinString();
          this.x = c.getText();
          if (this.i >= 0)
            this.a = false; 
          request(33, null, null);
          request(10, null, null);
        } 
        break;
      case 24:
        if (!this.p[0])
          return null; 
        if ((i = (arrayOfInt1 = (int[])paramArrayOfObject[0])[2]) < 100)
          return null; 
        if ((i %= 100) < 1 || i > 3)
          return null; 
        this.s = arrayOfInt1[0] - 1;
        this.t = arrayOfInt1[1];
        vector = new Vector();
        this.t -= this.g.getHeight() * 3 - 1;
        k = this.e * this.s / this.d;
        if (this.p[1]) {
          int i6;
          if ((i6 = this.e * this.s * 7 / 10 / this.d) < this.e * 5)
            i6 = this.e * 5; 
          if (i6 < k)
            k = i6; 
        } 
        if (this.t > k)
          this.t = k; 
        vector.addElement(new int[] { this.s + 10, this.t + 1, 0, 0 });
        return vector;
      case 25:
        if (!this.p[0])
          return null; 
        graphics = (Graphics)paramArrayOfObject[0];
        j = (arrayOfInt2 = (int[])paramObject)[0];
        k = arrayOfInt2[1];
        m = arrayOfInt2[2];
        canvas = (Canvas)paramArrayOfObject[1];
        graphics.setClip(0, 0, canvas.getWidth(), canvas.getHeight());
        if (this.a) {
          graphics.setColor(this.h[1]);
          int i6;
          for (i6 = 0; i6 <= this.d; i6 += this.d)
            graphics.drawLine(j + i6 * this.s / this.d, k, j + i6 * this.s / this.d, k + this.t); 
          for (i6 = 0; i6 <= this.e; i6 += this.e)
            graphics.drawLine(j, k + i6 * this.t / this.e, m, k + i6 * this.t / this.e); 
          graphics.setColor(this.h[2]);
          int i7 = 2;
          String str = " " + this.d + "x" + this.e;
          if (this.i > 0) {
            str = str + " ses:" + this.A;
            str = str + " step:" + this.i;
            if (!this.v.equals(this.u)) {
              graphics.drawString(" Вы играете с другим игроком", j + 2, k + 2, 20);
              i7 = 2 + graphics.getFont().getHeight() + 1;
              graphics.drawString(" " + this.w, j + 2, k + i7, 20);
              i7 += graphics.getFont().getHeight() + 1;
            } 
          } 
          if (this.D && this.C != null) {
            graphics.drawString(this.C, j + 2, k + i7, 20);
            i7 += graphics.getFont().getHeight() + 1;
          } else if (this.C != null) {
            graphics.drawString("Последняя:" + this.C, j + 2, k + i7, 20);
            i7 += graphics.getFont().getHeight() + 1;
          } 
          graphics.drawString(str, j + 2, k + i7, 20);
          i7 += graphics.getFont().getHeight() + 1;
          graphics.drawString(" 1 - новая игра", j + 2, k + i7, 20);
          i7 += graphics.getFont().getHeight() + 1;
          graphics.drawString(" 3 - размер, 0 - меню, 7 - больше", j + 2, k + i7, 20);
          i7 += graphics.getFont().getHeight() + 1;
          graphics.drawString(" 9 - поиск игрока", j + 2, k + i7, 20);
          break;
        } 
        graphics.setColor(this.h[1]);
        for (n = 0; n <= this.d; n++)
          graphics.drawLine(j + n * this.s / this.d, k, j + n * this.s / this.d, k + this.t); 
        for (n = 0; n <= this.e; n++)
          graphics.drawLine(j, k + n * this.t / this.e, m, k + n * this.t / this.e); 
        graphics.setColor(this.h[2]);
        for (n = 0; n < this.d; n++) {
          int i6 = n * this.s / this.d;
          int i7 = (n + 1) * this.s / this.d;
          int i8 = n;
          for (byte b = 0; b < this.e; b++) {
            int i9 = b * this.t / this.e;
            int i10 = (b + 1) * this.t / this.e;
            if (this.y[i8] > 3) {
              graphics.setColor(5177344);
              graphics.fillRect(j + i6 + 1, k + i9 + 1, i7 - i6 - 1, i10 - i9 - 1);
            } 
            byte b1;
            if ((b1 = (byte)(this.y[i8] & 0x3)) == 1) {
              graphics.setColor(this.h[6]);
              graphics.fillArc(j + i6 + 2, k + i9 + 2, i7 - i6 - 5, i10 - i9 - 5, 0, 360);
            } 
            if (b1 == 2) {
              graphics.setColor(this.h[7]);
              graphics.drawLine(j + i6 + 1, k + i9 + 1, j + i7 - 1, k + i10 - 1);
              graphics.drawLine(j + i7 - 1, k + i9 + 1, j + i6 + 1, k + i10 - 1);
            } 
            i8 += this.d;
          } 
        } 
        i1 = (n = this.c) * this.s / this.d;
        i2 = (n + 1) * this.s / this.d;
        i4 = 0 * this.t / this.e;
        i5 = 1 * this.t / this.e;
        graphics.setColor(this.h[1]);
        graphics.drawLine(j + (i1 + i2) / 2, k + i4 + 1, j + (i1 + i2) / 2, k + i5 - 1);
        graphics.drawLine(j + i2 - 1, k + i4 + 1, j + (i1 + i2) / 2, k + i5 - 1);
        graphics.drawLine(j + i1 + 1, k + i4 + 1, j + (i1 + i2) / 2, k + i5 - 1);
        i4 = (i3 = a(this.c)) * this.t / this.e;
        i5 = (i3 + 1) * this.t / this.e;
        if ((this.i & 0x1) == this.z || this.i <= 1) {
          graphics.setColor(this.h[0]);
          graphics.fillRect(j + i1 + 1, k + i4 + 1, i2 - i1 - 1, i5 - i4 - 1);
          graphics.setColor(this.h[7]);
          graphics.drawLine(j + i1 + 1, k + i4 + 2, j + i2 - 1, k + i5 - 1);
          graphics.drawLine(j + i2 - 1, k + i4 + 2, j + i1 + 1, k + i5 - 1);
          graphics.drawLine(j + i1 + 1, k + i4 + 1, j + i2 - 1, k + i5 - 2);
          graphics.drawLine(j + i2 - 1, k + i4 + 1, j + i1 + 1, k + i5 - 2);
        } 
        graphics.setColor(this.h[15]);
        if (this.D && this.C != null) {
          graphics.drawString(this.C, j + 2, k + 2, 20);
          break;
        } 
        if (!this.v.equals(this.u) && this.i > 0)
          graphics.drawString("Играете с " + this.w, j + 2, k + 2, 20); 
        break;
      case 23:
        if (this.p[0] && paramArrayOfObject[4] != null && (str1 = (String)paramArrayOfObject[4]).startsWith("GXO:")) {
          paramArrayOfObject[5] = new Integer(2);
          String str = (String)paramArrayOfObject[0];
          str1 = str1.substring(4);
          if (this.i <= 0) {
            this.z = 0;
            this.i = 1;
            this.v = this.u;
            this.w = this.x;
          } 
          if (!this.v.equals(str)) {
            a(str, "GXO> игрок играет с другим, с " + this.w, true);
          } else if ((this.i & 0x1) == this.z) {
            a(str, "GXO> игрок либо ещё не походил, либо не начал игру.", true);
          } else {
            String[] arrayOfString;
            k = Integer.parseInt((arrayOfString = a(a(str1, "\n")[0], ","))[0]);
            m = a(k);
            if (this.i == 1)
              this.A = Integer.parseInt(arrayOfString[1]); 
            if ((this.A & 0x1) == 1 && this.d == 8) {
              a(str, "GXO> игрок хочет играть на другом поле (" + this.d + "x" + this.e + ")", true);
            } else {
              Integer.parseInt(arrayOfString[2].trim());
              if (this.A != Integer.parseInt(arrayOfString[1])) {
                if (this.i == 1) {
                  a(str, "GXO> игрок хочет тоже первым", true);
                  this.i = -1;
                  this.y = new byte[this.d * this.e];
                } else {
                  a(str, "GXO> игрок ещё играет старую игру #" + this.A, true);
                } 
              } else {
                this.i++;
                this.y[k + m * this.d] = 1;
                a(k, m);
                request(10, null, null);
              } 
            } 
          } 
        } 
        return null;
      case 36:
        str1 = (String)paramArrayOfObject[2];
        str2 = (String)paramArrayOfObject[3];
        if (str1.length() >= 5)
          request(8, (Object[])new String[] { str1, str2, "yes" }, null); 
        return null;
    } 
    return null;
  }
  
  private void a() {
    c();
    this.y = new byte[this.d * this.e];
    this.i = 0;
    this.D = false;
    this.c = 0;
    this.A = b() + (this.A & 0x1);
    this.a = false;
    a(this.u, "GXO> готов играть " + this.d + "x" + this.e, false);
  }
  
  private int b() {
    return this.B.nextInt() % 90 + 10 & 0xFE;
  }
  
  private void c() {
    if (!this.D)
      this.C = "Прервали игру - сдались"; 
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean) {
    Object[] arrayOfObject = { new Long(paramBoolean ? 600L : 10L), new Long(0L), paramString1, paramString2 };
    request(31, arrayOfObject, null);
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
  
  private int a(int paramInt) {
    byte b;
    for (b = 0; b < this.e && (this.y[paramInt + b * this.d] & 0x3) == 0; b++);
    return b - 1;
  }
  
  private void a(Object paramObject) {
    if (paramObject == null)
      return; 
    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])paramObject));
    try {
      for (byte b = 0; b < 3; b++)
        this.p[b] = dataInputStream.readBoolean(); 
    } catch (IOException iOException) {}
    this.f.setSelectedFlags(this.p);
  }
  
  private void d() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeBoolean(this.p[0]);
      dataOutputStream.writeBoolean(this.p[1]);
      dataOutputStream.writeBoolean(this.p[2]);
    } catch (IOException iOException) {}
    request(6, null, byteArrayOutputStream.toByteArray());
    this.f.setSelectedIndex(0, this.p[0]);
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.o)
      request(1, null, new Integer(0)); 
    if (paramCommand == this.n || paramCommand == this.m) {
      this.f.getSelectedFlags(this.p);
      d();
      if (this.m == paramCommand) {
        e();
        return;
      } 
      request(1, null, new Integer(0));
    } 
  }
  
  private void e() {
    request(30, null, null);
  }
  
  private void f() {
    String str1 = "http://fayby.ru/locid/game1.php";
    String str2 = (String)request(17, new Object[] { new Integer(-1) }, null);
    String str3 = null;
    str1 = str1 + "?uin=" + str2;
    str1 = str1 + "&ver=1&game=1&x=" + this.d + "&y=" + this.e;
    str1 = str1 + "&last=" + this.j;
    try {
      HttpConnection httpConnection;
      if ((httpConnection = (HttpConnection)Connector.open(str1)).getResponseCode() != 200)
        throw new IOException(); 
      InputStream inputStream = httpConnection.openInputStream();
      int i;
      if ((i = (int)httpConnection.getLength()) == -1)
        i = 4096; 
      byte[] arrayOfByte = new byte[i];
      i = inputStream.read(arrayOfByte, 0, arrayOfByte.length);
      String[] arrayOfString;
      str3 = (arrayOfString = a(new String(arrayOfByte, 0, i, "utf-8"), "\n"))[0];
      String str;
      if ((str = arrayOfString[1]).length() > 3) {
        a(str);
        return;
      } 
    } catch (Exception exception) {
      str3 = "Ошибка обращения к серверу " + exception.getClass().getName();
    } 
    Alert alert;
    (alert = new Alert(str3)).setTimeout(-2);
    this.b.setCurrent((Displayable)alert);
  }
  
  private void a(String paramString) {
    this.j = "-" + paramString + this.j;
    if (this.j.length() > 100)
      this.j = (new StringBuffer(this.j.substring(0, 100))).toString(); 
    request(38, new Object[] { { paramString, "Game X&0", "Найден игрок через поисковый сервер, найти другого - повтороить поиск." }, , { 0, 194 }, , null, null }, null);
    b(paramString);
    a(paramString, "GXO> найден игрок для игры " + this.d + "x" + this.e, false);
    this.u = paramString;
    this.x = "Новый Игрок";
    request(33, null, null);
    request(10, null, null);
  }
  
  private void b(String paramString) {
    this.k[0] = paramString;
    request(37, this.k, null);
  }
  
  private synchronized void a(Display paramDisplay) {
    if (this.l == null) {
      this.l = new Form("Game");
      this.l.addCommand(this.n);
      this.l.addCommand(this.m);
      this.l.addCommand(this.o);
      this.l.setCommandListener(this);
      this.l.append((Item)this.f);
      this.l.append((Item)new StringItem("Правила:", "Крестики нолики только падающие, то есть знак можно поставить только на верх другого, закрыть надо 4-ре. Начать новую игру нажмите 1."));
      this.l.append((Item)new StringItem("Разработчик:", "FAy"));
      this.l.append((Item)new StringItem("Отдельное спасибо за тестирование:", "TIER"));
    } 
    paramDisplay.setCurrent((Displayable)this.l);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgGame1.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */