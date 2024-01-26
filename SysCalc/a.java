package SysCalc;

import favax.microedition.lcdui.Canvas;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class a extends Canvas {
  private int a = getWidth();
  
  private int b = getHeight();
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private String j = "0";
  
  private String k = "* для '.'   # для \"=\"";
  
  private int l;
  
  private double m;
  
  private double n;
  
  private String o;
  
  private String p = "0";
  
  private boolean q = false;
  
  private boolean r = false;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private boolean u = true;
  
  private Vector v;
  
  public a() {
    if (Math.min(this.a, this.b) >= 110 && Math.min(this.a, this.b) < 128) {
      a(110, 10);
    } else if (Math.min(this.a, this.b) >= 128 && Math.min(this.a, this.b) < 176) {
      a(128, 12);
    } else if (Math.min(this.a, this.b) >= 176 && Math.min(this.a, this.b) < 240) {
      a(176, 20);
    } else {
      a(240, 20);
    } 
    this.v = new Vector();
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.l = paramInt2;
    this.d = (this.a - paramInt1) / 2;
    this.e = (this.b - paramInt1) / 2;
    this.c = paramInt1 % 9 / 2;
    this.f = paramInt1 / 9;
    this.g = paramInt1 / 9;
    this.h = 0;
    this.i = 2 * this.g;
  }
  
  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(0);
    paramGraphics.fillRect(0, 0, this.a, this.b);
    try {
      if (this.a < 110 || this.b < 110) {
        paramGraphics.setColor(16777215);
        paramGraphics.fillRect(0, 0, this.a, this.b);
        paramGraphics.setColor(0);
        paramGraphics.drawString("Не Поддерживается", this.a / 2, this.b / 2 - 10, 33);
        paramGraphics.drawString("Req Res: 110X110", this.a / 2, this.b / 2, 33);
        paramGraphics.drawString("Доступно:" + this.a + "X" + this.b, this.a / 2, this.b / 2 + 10, 33);
      } else if (this.u) {
        a(paramGraphics);
      } else {
        b(paramGraphics);
      } 
    } catch (Exception exception) {
      System.out.println("Нет файла:" + exception);
    } 
  }
  
  public void a(Graphics paramGraphics) {
    try {
      if (Math.min(this.a, this.b) >= 110 && Math.min(this.a, this.b) < 128) {
        paramGraphics.drawImage(Image.createImage("/help110.png"), this.a / 2, this.b / 2, 3);
      } else if (Math.min(this.a, this.b) >= 128 && Math.min(this.a, this.b) < 176) {
        paramGraphics.drawImage(Image.createImage("/help128.png"), this.a / 2, this.b / 2, 3);
      } else if (Math.min(this.a, this.b) >= 176 && Math.min(this.a, this.b) < 240) {
        paramGraphics.drawImage(Image.createImage("/help176.png"), this.a / 2, this.b / 2, 3);
      } else {
        paramGraphics.drawImage(Image.createImage("/help240.png"), this.a / 2, this.b / 2, 3);
      } 
    } catch (Exception exception) {}
  }
  
  public void b(Graphics paramGraphics) {
    if (Math.min(this.a, this.b) >= 110 && Math.min(this.a, this.b) < 128) {
      try {
        paramGraphics.drawImage(Image.createImage("/bg110.png"), this.a / 2, this.b / 2, 3);
      } catch (Exception exception) {
        System.out.println("Нет файла:" + exception);
      } 
      paramGraphics.setColor(16777215);
      paramGraphics.drawString(this.j, this.a - this.d - 2, this.f + this.c, 40);
      paramGraphics.drawString(this.k, this.d + 2, this.e + this.f + this.c - 2, 0);
      if (this.s) {
        paramGraphics.setColor(16755336);
        paramGraphics.fillRect(this.d + 3, this.e + 3, 3, 4);
      } 
      if (this.t) {
        paramGraphics.setColor(16711850);
        paramGraphics.fillRect(this.d + 3, this.e + 8, 3, 4);
      } 
      if (!this.p.equals("0")) {
        paramGraphics.setColor(65280);
        paramGraphics.fillRect(this.d + 7, this.e + 3, 3, 9);
      } 
      paramGraphics.setColor(16711680);
      paramGraphics.drawRect(this.h + this.c + this.d, this.i + this.c - 1 + this.e, this.f, this.g);
      paramGraphics.drawRect(this.h + this.c + 1 + this.d, this.i + this.c + this.e, this.f - 2, this.g - 2);
    } else if (Math.min(this.a, this.b) >= 128 && Math.min(this.a, this.b) < 176) {
      try {
        paramGraphics.drawImage(Image.createImage("/bg128.png"), this.a / 2, this.b / 2, 3);
      } catch (Exception exception) {
        System.out.println("Нет файла:" + exception);
      } 
      paramGraphics.setColor(16777215);
      paramGraphics.drawString(this.j, this.a - this.d - 3, this.f + this.c + 1 + this.e, 40);
      paramGraphics.drawString(this.k, 6 + this.d, this.f + this.c - 1 + this.e, 0);
      if (this.s) {
        paramGraphics.setColor(16755336);
        paramGraphics.fillRect(this.d + 3, 4 + this.e, 4, 4);
      } 
      if (this.t) {
        paramGraphics.setColor(16711850);
        paramGraphics.fillRect(this.d + 3, 9 + this.e, 4, 4);
      } 
      if (!this.p.equals("0")) {
        paramGraphics.setColor(65280);
        paramGraphics.fillRect(this.d + 8, 4 + this.e, 4, 9);
      } 
      paramGraphics.setColor(16711680);
      paramGraphics.drawRect(this.h + this.c + this.d, this.i + this.c - 1 + this.e, this.f, this.g);
      paramGraphics.drawRect(this.h + this.c + 1 + this.d, this.i + this.c + this.e, this.f - 2, this.g - 2);
    } else if (Math.min(this.a, this.b) >= 176 && Math.min(this.a, this.b) < 240) {
      try {
        paramGraphics.drawImage(Image.createImage("/bg176.png"), this.a / 2, this.b / 2, 3);
      } catch (Exception exception) {
        System.out.println("Нет файла:" + exception);
      } 
      paramGraphics.setColor(16777215);
      paramGraphics.drawString(this.j, this.a - 7 - this.d, this.f + this.c + this.e, 40);
      paramGraphics.drawString(this.k, 7 + this.d, this.f + this.c + this.e, 0);
      if (this.s) {
        paramGraphics.setColor(16755336);
        paramGraphics.fillRect(this.d + 5, this.e + 5, 4, 6);
      } 
      if (this.t) {
        paramGraphics.setColor(16711850);
        paramGraphics.fillRect(this.d + 5, this.e + 12, 4, 6);
      } 
      if (!this.p.equals("0")) {
        paramGraphics.setColor(65280);
        paramGraphics.fillRect(this.d + 10, this.e + 5, 4, 13);
      } 
      paramGraphics.setColor(16711680);
      paramGraphics.drawRect(this.h + this.c + this.d, this.i + this.c - 1 + this.e, this.f, this.g);
      paramGraphics.drawRect(this.h + this.c + 1 + this.d, this.i + this.c + this.e, this.f - 2, this.g - 2);
    } else {
      try {
        paramGraphics.drawImage(Image.createImage("/bg240.png"), this.a / 2, this.b / 2, 3);
      } catch (Exception exception) {
        System.out.println("Нет файла:" + exception);
      } 
      paramGraphics.setColor(16777215);
      paramGraphics.drawString(this.j, this.a - 7 - this.d, this.g + this.c + 1 + this.e, 40);
      paramGraphics.drawString(this.k, 7 + this.d, this.g + this.c + 2 + this.e, 0);
      if (this.s) {
        paramGraphics.setColor(16755336);
        paramGraphics.fillRect(7 + this.d, 20 + this.e, 6, 8);
      } 
      if (this.t) {
        paramGraphics.setColor(16711850);
        paramGraphics.fillRect(7 + this.d, 30 + this.e, 6, 8);
      } 
      if (!this.p.equals("0")) {
        paramGraphics.setColor(65280);
        paramGraphics.fillRect(15 + this.d, 20 + this.e, 6, 18);
      } 
      paramGraphics.setColor(16711680);
      paramGraphics.drawRect(this.h + this.c + this.d - 2, this.i + this.c + 1 + this.e, this.f, this.g);
      paramGraphics.drawRect(this.h + this.c - 1 + this.d, this.i + this.c + 2 + this.e, this.f - 2, this.g - 2);
    } 
  }
  
  public void a() {
    this.n = Double.parseDouble(this.j);
    if (this.o.equals("02")) {
      this.m += this.n;
      this.j = "" + this.m;
      this.j = d(this.j);
    } else if (this.o.equals("12")) {
      this.m -= this.n;
      this.j = "" + this.m;
      this.j = d(this.j);
    } else if (this.o.equals("22")) {
      this.m *= this.n;
      this.j = "" + this.m;
      this.j = d(this.j);
    } else if (this.o.equals("32")) {
      this.m /= this.n;
      this.j = "" + this.m;
      this.j = d(this.j);
    } else if (this.o.equals("42")) {
      this.m = this.m * 100.0D / this.n;
      this.j = "" + this.m;
      this.j = d(this.j);
    } else if (this.o.equals("13")) {
      try {
        this.j = "" + a(this.m, (int)this.n);
        this.j = d(this.j);
      } catch (Exception exception) {
        this.j = "Только целые числа!";
      } 
    } else if (this.o.equals("65")) {
      this.j = c((int)this.m, (int)this.n);
      this.j = d(this.j);
    } else if (this.o.equals("75")) {
      this.j = d((int)this.m, (int)this.n);
      this.j = d(this.j);
    } else if (this.o.equals("35")) {
      this.j = "" + (this.m % this.n);
      this.j = d(this.j);
    } else if (this.o.equals("25")) {
      this.j = "" + b(this.m, (int)this.n);
      this.j = d(this.j);
    } 
    b();
  }
  
  public void b() {
    this.m = 0.0D;
    this.n = 0.0D;
    this.q = false;
    this.r = false;
    this.s = false;
    this.t = false;
  }
  
  public double a(int paramInt) {
    double d = paramInt;
    if (d < 1.0D) {
      this.k = "+ve только целые числа";
      return 0.0D;
    } 
    return (paramInt == 1) ? d : (d * a(paramInt - 1));
  }
  
  public int b(int paramInt1, int paramInt2) {
    int i = 0;
    if (paramInt2 != 0) {
      i = 1;
      for (int j = paramInt2; j > 0; j--)
        i *= paramInt1; 
    } 
    return i;
  }
  
  public double a(double paramDouble, int paramInt) {
    double d = 1.0D;
    if (paramInt != 0)
      for (int i = paramInt; i > 0; i--)
        d *= paramDouble;  
    return d;
  }
  
  public double a(String paramString) {
    double d = Double.parseDouble(paramString);
    int i = Integer.parseInt(paramString.substring(paramString.length() - 2, paramString.length()));
    int j = 0;
    if (paramString.indexOf("E") != -1) {
      paramString = paramString.substring(0, paramString.indexOf("E"));
      d = Double.parseDouble(paramString);
      paramString = String.valueOf(d);
      j = paramString.indexOf(".");
      if (i + j < 10);
    } 
    return d;
  }
  
  public double c() {
    double d = 1.0D;
    boolean bool = true;
    byte b;
    for (b = 0; b < this.v.size(); b++)
      d *= Double.parseDouble(String.valueOf(this.v.elementAt(b))); 
    while (bool) {
      for (b = 0; b < this.v.size(); b++) {
        if (d % Double.parseDouble(String.valueOf(this.v.elementAt(b))) != 0.0D) {
          d *= 2.0D;
          bool = false;
          break;
        } 
        d /= 2.0D;
      } 
    } 
    return d;
  }
  
  public String b(double paramDouble, int paramInt) {
    String str = String.valueOf(paramDouble);
    if (paramInt < 9) {
      str = str + "0000000";
      str = str.substring(0, str.indexOf(".") + paramInt + 1);
    } 
    return str;
  }
  
  public double b(String paramString) {
    return c(paramString) * 2.302585093D;
  }
  
  public String c(int paramInt1, int paramInt2) {
    if (paramInt1 >= paramInt2)
      return "" + (a(paramInt1) / a(paramInt2) * a(paramInt1 - paramInt2)); 
    this.k = "n1 должен быть >= n2";
    return "Ошибка";
  }
  
  public String d(int paramInt1, int paramInt2) {
    if (paramInt1 >= paramInt2)
      return "" + (a(paramInt1) / a(paramInt1 - paramInt2)); 
    this.k = "n1 должен быть >= n2";
    return "Ошибка";
  }
  
  public String b(int paramInt) {
    if (paramInt < 1) {
      this.k = "+ve только целые числа";
      return "" + paramInt;
    } 
    if (paramInt > 65535) {
      this.k = "0 < N < 65535";
      return "" + paramInt;
    } 
    return (paramInt == 1 || paramInt == 0) ? ("" + paramInt) : (b(paramInt / 2) + "" + (paramInt % 2));
  }
  
  public String c(int paramInt) {
    if (paramInt < 0) {
      this.k = "+ve только целые числа";
      return "" + paramInt;
    } 
    return (paramInt < 8) ? ("" + paramInt) : (c(paramInt / 8) + "" + (paramInt % 8));
  }
  
  public String d(int paramInt) {
    if (paramInt < 0) {
      this.k = "+ve только целые числа";
      return "" + paramInt;
    } 
    return (paramInt < 16) ? ("" + e(paramInt)) : (d(paramInt / 16) + "" + e(paramInt % 16));
  }
  
  public String e(int paramInt) {
    return (paramInt < 10) ? ("" + paramInt) : ((paramInt == 10) ? "A" : ((paramInt == 11) ? "B" : ((paramInt == 12) ? "C" : ((paramInt == 13) ? "D" : ((paramInt == 14) ? "E" : "F")))));
  }
  
  public double a(double paramDouble) {
    double d = 1.0D + paramDouble;
    for (byte b = 2; b < 50; b++)
      d += a(paramDouble, b) / a(b); 
    return d;
  }
  
  public double b(double paramDouble) {
    paramDouble *= 2.302585092994046D;
    return a(paramDouble);
  }
  
  public double c(String paramString) {
    double d1 = 0.0D;
    try {
      if (paramString.indexOf("E") > -1) {
        d1 = Double.parseDouble(paramString.substring(paramString.indexOf("E") + 1, paramString.length()));
        paramString = paramString.substring(0, paramString.indexOf("E"));
      } 
    } catch (Exception exception) {
      System.out.println("Exp: " + paramString.substring(paramString.indexOf("E"), paramString.length()));
    } 
    System.out.println("exp " + d1);
    double d2 = Double.parseDouble(paramString);
    paramString = String.valueOf(d2);
    int i = paramString.indexOf(".");
    if (d2 >= 1.0D) {
      d2 /= b(10, i);
      System.out.println("no. after div: " + d2);
      d1 += c(d2);
      d1 += i;
    } else {
      paramString = paramString.substring(i + 1, paramString.length());
      System.out.println(paramString);
      for (byte b = 0; b < paramString.length(); b++) {
        if (paramString.charAt(b) != '0') {
          i = b;
          break;
        } 
      } 
      d2 *= b(10, i);
      System.out.println("no. after *: " + d2);
      d1 += c(d2);
      d1 -= i;
    } 
    return d1;
  }
  
  public double d() {
    double d = 0.0D;
    System.out.println("data size is: " + this.v.size());
    byte b;
    for (b = 0; b < this.v.size(); b++)
      d += Double.parseDouble(String.valueOf(this.v.elementAt(b))); 
    return d / b;
  }
  
  public double e() {
    double d = Double.parseDouble(String.valueOf(this.v.elementAt(0)));
    for (byte b = 0; b < this.v.size(); b++) {
      if (d > Double.parseDouble(String.valueOf(this.v.elementAt(b))))
        d = Double.parseDouble(String.valueOf(this.v.elementAt(b))); 
    } 
    return d;
  }
  
  public double f() {
    double d = Double.parseDouble(String.valueOf(this.v.elementAt(0)));
    for (byte b = 0; b < this.v.size(); b++) {
      if (d < Double.parseDouble(String.valueOf(this.v.elementAt(b))))
        d = Double.parseDouble(String.valueOf(this.v.elementAt(b))); 
    } 
    return d;
  }
  
  public String f(int paramInt) {
    boolean bool = true;
    byte b;
    for (b = 2; b < paramInt; b++) {
      if (paramInt % b == 0) {
        bool = false;
        break;
      } 
    } 
    return bool ? "Prime" : ("Not Prime (" + (paramInt / b) + "X" + b + ")");
  }
  
  public String g() {
    double d1 = 0.0D;
    double d2 = Double.parseDouble(String.valueOf(this.v.elementAt(0)));
    double d3 = Double.parseDouble(String.valueOf(this.v.elementAt(1)));
    double d4 = Double.parseDouble(String.valueOf(this.v.elementAt(2)));
    d1 = (d2 + d3 + d4) / 2.0D;
    return "" + Math.sqrt(d1 * (d1 - d2) * (d1 - d3) * (d1 - d4));
  }
  
  public String h() {
    double d = 0.0D;
    for (byte b = 0; b < 3; b++)
      d += Double.parseDouble(String.valueOf(this.v.elementAt(0))); 
    return "" + d;
  }
  
  public double c(double paramDouble) {
    double d1 = 0.0D;
    double d2 = 2.302585092994046D;
    if (paramDouble != 1.0D) {
      paramDouble--;
      for (byte b = 1; b <= 90; b++) {
        if (b % 2 == 1) {
          d1 += a(paramDouble, b) / b;
        } else {
          d1 -= a(paramDouble, b) / b;
        } 
      } 
      d1 /= d2;
    } 
    return d1;
  }
  
  public String i() {
    return (this.h / this.f == 0 && this.i / this.g == 3) ? "Изменить Знак" : ((this.h / this.f == 5 && this.i / this.g == 2) ? "Квадратный Корень" : ((this.h / this.f == 6 && this.i / this.g == 2) ? "Возвести в Квадрат" : ((this.h / this.f == 7 && this.i / this.g == 2) ? "Обратная дробь" : ((this.h / this.f == 8 && this.i / this.g == 2) ? "Факториал" : ((this.h / this.f == 2 && this.i / this.g == 3) ? (!this.s ? "Логарифм" : "Число по Логарифму") : ((this.h / this.f == 3 && this.i / this.g == 3) ? (!this.s ? "Натуральный Логарифм" : "Число по нат. Логарифму") : ((this.h / this.f == 4 && this.i / this.g == 3) ? (!this.s ? (this.t ? "Гиперб. Синус" : "Синус") : (this.t ? "Гиперб. АркСинус" : "АркСинус")) : ((this.h / this.f == 5 && this.i / this.g == 3) ? (!this.s ? (this.t ? "Гиперб. Косинус" : "АркКосинус") : (this.t ? "Гиперб. АркКосинус" : "АркКосинус")) : ((this.h / this.f == 6 && this.i / this.g == 3) ? (!this.s ? (this.t ? "Гиперб. Тангенс" : "Тангенс") : (this.t ? "Гиперб. АркТангенс" : "АркТангенс")) : ((this.h / this.f == 0 && this.i / this.g == 4) ? "Сложить с Памятью" : ((this.h / this.f == 0 && this.i / this.g == 5) ? "Сохранить в Память" : ((this.h / this.f == 0 && this.i / this.g == 6) ? "Извлечь из Памяти" : ((this.h / this.f == 0 && this.i / this.g == 7) ? "Очистить Память" : ((this.h / this.f == 7 && this.i / this.g == 3) ? "Сумма (от 0 до n)" : ((this.h / this.f == 1 && this.i / this.g == 4) ? "Значение \"е\"" : ((this.h / this.f == 2 && this.i / this.g == 4) ? "Значение \"Pi\"" : ((this.h / this.f == 8 && this.i / this.g == 3) ? "Обратная Функция" : ((this.h / this.f == 8 && this.i / this.g == 4) ? "Гиперболическая Функция" : ((this.h / this.f == 7 && this.i / this.g == 4) ? "Удалить последн. символ" : ((this.h / this.f == 6 && this.i / this.g == 4) ? "Sc./Com. notation" : ((this.h / this.f == 5 && this.i / this.g == 4) ? "Floor function" : ((this.h / this.f == 4 && this.i / this.g == 4) ? "Ceil Function" : ((this.h / this.f == 3 && this.i / this.g == 4) ? "To enter Exponent" : ((this.h / this.f == 8 && this.i / this.g == 5) ? "Шестнадцатиричная Система" : ((this.h / this.f == 8 && this.i / this.g == 6) ? "Восьмеричная Система" : ((this.h / this.f == 8 && this.i / this.g == 7) ? "Двоичная Система" : ((this.h / this.f == 1 && this.i / this.g == 7) ? "Очистить Все" : ((this.h / this.f == 2 && this.i / this.g == 7) ? "Очистить Текущее" : ((this.h / this.f == 0 && this.i / this.g == 2) ? "Сложить" : ((this.h / this.f == 1 && this.i / this.g == 2) ? "Вычесть" : ((this.h / this.f == 2 && this.i / this.g == 2) ? "Умножить" : ((this.h / this.f == 3 && this.i / this.g == 2) ? "Делить" : ((this.h / this.f == 4 && this.i / this.g == 2) ? "Процент" : ((this.h / this.f == 1 && this.i / this.g == 3) ? "x в степени y" : ((this.h / this.f == 1 && this.i / this.g == 5) ? "Выделить Целую Часть" : ((this.h / this.f == 2 && this.i / this.g == 5) ? "Rounds off to given dec place" : ((this.h / this.f == 3 && this.i / this.g == 5) ? "Модуль Числа" : ((this.h / this.f == 4 && this.i / this.g == 5) ? "Gives GCD" : ((this.h / this.f == 5 && this.i / this.g == 5) ? "Gives LCM" : ((this.h / this.f == 6 && this.i / this.g == 5) ? "Gives all Combination" : ((this.h / this.f == 7 && this.i / this.g == 5) ? "Gives all Permutation" : ((this.h / this.f == 7 && this.i / this.g == 6) ? "Ввести Диапазон Данных" : ((this.h / this.f == 6 && this.i / this.g == 6) ? (this.s ? "Очистить Диапазон Данных" : "Элементы в Диапазоне Данных") : ((this.h / this.f == 5 && this.i / this.g == 6) ? "Среднее Значение" : ((this.h / this.f == 4 && this.i / this.g == 6) ? (this.s ? "Минимальное Значение" : "Максимальное Значение") : ((this.h / this.f == 3 && this.i / this.g == 6) ? "Преобраз. Мили в Км." : ((this.h / this.f == 6 && this.i / this.g == 7) ? (this.s ? "Длина Окружности" : "Площадь Круга") : (((((this.h / this.f == 5) ? 1 : 0) & ((this.i / this.g == 7) ? 1 : 0)) != 0) ? (this.s ? "Периметр Треугольника" : "Площадь Треугольника") : ((this.h / this.f == 4 && this.i / this.g == 7) ? "Преобразование F` в C`" : ((this.h / this.f == 3 && this.i / this.g == 7) ? "Преобразование C` в F`" : ((this.h / this.f == 7 && this.i / this.g == 7) ? "Вызов Помощи" : ((this.h / this.f == 2 && this.i / this.g == 6) ? "Преобраз. Км. в Мили" : ((this.h / this.f == 1 && this.i / this.g == 6) ? "Tells if n is prime" : "Undefined")))))))))))))))))))))))))))))))))))))))))))))))))))));
  }
  
  public String d(String paramString) {
    this.s = false;
    this.t = false;
    String str = paramString;
    boolean bool = false;
    paramString = paramString.substring(paramString.indexOf(".") + 1, paramString.length());
    for (byte b = 0; b < paramString.length(); b++) {
      if (paramString.charAt(b) != '0') {
        bool = true;
        break;
      } 
    } 
    return bool ? e(str) : str.substring(0, str.indexOf("."));
  }
  
  public String e(String paramString) {
    if (paramString.indexOf("E") == -1)
      return paramString.substring(0, this.l); 
    String str = paramString;
    paramString = paramString.substring(paramString.indexOf("E"), paramString.length());
    return str.substring(0, this.l - paramString.length()) + paramString;
  }
  
  public void feyPressed(int paramInt) {
    if (this.u) {
      this.u = false;
      repaint();
    } else {
      g(paramInt);
    } 
  }
  
  public void g(int paramInt) {
    if (paramInt > 0) {
      if (paramInt > 47) {
        if (this.j.length() < this.l) {
          if (this.j == "0")
            this.j = ""; 
          this.j += String.valueOf(getKeyName(paramInt));
        } 
      } else if (paramInt == 42) {
        if (!this.q) {
          this.q = true;
          this.j += ".";
        } 
      } else if (paramInt == 35 && this.r) {
        a();
      } 
    } else if (paramInt == -7) {
      if (this.r)
        a(); 
    } else if (paramInt == -8) {
      this.j = "0";
      this.k = "* для '.'   # для \"=\"";
      this.m = 0.0D;
      this.n = 0.0D;
      this.q = false;
      this.s = false;
      this.t = false;
    } else if (paramInt == -6 || paramInt == -5) {
      if (this.h / this.f == 0 && this.i / this.g == 3) {
        if (this.j.startsWith("-")) {
          this.j = this.j.substring(1, this.j.length());
        } else {
          this.j = "-" + this.j;
        } 
      } else if (this.h / this.f == 5 && this.i / this.g == 2) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + Math.sqrt(this.m);
        this.j = d(this.j);
      } else if (this.h / this.f == 6 && this.i / this.g == 2) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + (this.m * this.m);
        this.j = d(this.j);
      } else if (this.h / this.f == 7 && this.i / this.g == 2) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + (1.0D / this.m);
        this.j = d(this.j);
      } else if (this.h / this.f == 8 && this.i / this.g == 2) {
        try {
          this.j = "" + a(Integer.parseInt(this.j));
          this.j = d(this.j);
        } catch (Exception exception) {
          this.j = "Только Целые Числа";
        } 
      } else if (this.h / this.f == 2 && this.i / this.g == 3) {
        this.m = Double.parseDouble(this.j);
        if (!this.s) {
          this.j = "" + c(this.j);
        } else {
          this.j = "" + b(this.m);
        } 
        this.j = d(this.j);
      } else if (this.h / this.f == 3 && this.i / this.g == 3) {
        this.m = Double.parseDouble(this.j);
        if (!this.s) {
          if (this.m == Math.E) {
            this.j = "1";
          } else {
            this.j = "" + (c(this.j) * 2.302585092994046D);
            this.j = d(this.j);
          } 
        } else {
          this.j = "" + a(this.m);
          this.j = d(this.j);
        } 
      } else if (this.h / this.f == 4 && this.i / this.g == 3) {
        this.m = Double.parseDouble(this.j);
        if (this.s) {
          if (this.t);
        } else if (this.t) {
          this.j = String.valueOf(0.5D * (a(this.m) - 1.0D / a(this.m)));
        } else {
          this.m %= 360.0D;
          this.j = "" + Math.sin(Math.toRadians(this.m));
        } 
        this.j = d(this.j);
      } else if (this.h / this.f == 5 && this.i / this.g == 3) {
        this.m = Double.parseDouble(this.j);
        if (this.s) {
          if (this.t);
        } else if (this.t) {
          this.j = String.valueOf(0.5D * (a(this.m) + 1.0D / a(this.m)));
        } else {
          this.m %= 360.0D;
          this.j = "" + Math.cos(Math.toRadians(this.m));
        } 
        this.j = d(this.j);
      } else if (this.h / this.f == 6 && this.i / this.g == 3) {
        this.m = Double.parseDouble(this.j);
        if (this.s) {
          if (this.t);
        } else if (this.t) {
          this.j = "" + ((a(2.0D * this.m) - 1.0D) / (a(2.0D * this.m) + 1.0D));
        } else {
          this.m %= 360.0D;
          this.j = "" + Math.tan(Math.toRadians(this.m));
        } 
        this.j = d(this.j);
      } else if (this.h / this.f == 0 && this.i / this.g == 4) {
        this.m = Double.parseDouble(this.j);
        this.m = Double.parseDouble(this.p) + this.m;
        this.p = "" + this.m;
        this.p = d(this.p);
      } else if (this.h / this.f == 0 && this.i / this.g == 5) {
        this.m = Double.parseDouble(this.j);
        this.p = "" + this.m;
        this.p = d(this.p);
      } else if (this.h / this.f == 0 && this.i / this.g == 6) {
        this.j = this.p;
      } else if (this.h / this.f == 0 && this.i / this.g == 7) {
        this.p = "0";
      } else if (this.h / this.f == 7 && this.i / this.g == 3) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + ((int)this.m * ((int)this.m + 1) / 2);
        this.j = d(this.j);
      } else if (this.h / this.f == 1 && this.i / this.g == 4) {
        this.j = "2.718281828459045";
      } else if (this.h / this.f == 2 && this.i / this.g == 4) {
        this.j = "3.141592653589793";
      } else if (this.h / this.f == 8 && this.i / this.g == 3) {
        this.s = !this.s;
      } else if (this.h / this.f == 8 && this.i / this.g == 4) {
        this.t = !this.t;
      } else if (this.h / this.f == 7 && this.i / this.g == 4) {
        if (this.j.length() > 1) {
          this.j = this.j.substring(0, this.j.length() - 1);
        } else {
          this.j = "0";
        } 
      } else if (this.h / this.f == 6 && this.i / this.g == 4) {
        this.j = "Думаю!.....F-E";
      } else if (this.h / this.f == 5 && this.i / this.g == 4) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + Math.floor(this.m);
        this.j = d(this.j);
      } else if (this.h / this.f == 4 && this.i / this.g == 4) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + Math.ceil(this.m);
        this.j = d(this.j);
      } else if (this.h / this.f == 3 && this.i / this.g == 4) {
        this.j = "Думаю!.....Exp";
      } else if (this.h / this.f == 8 && this.i / this.g == 5) {
        try {
          this.j = "" + d(Integer.parseInt(this.j));
        } catch (Exception exception) {}
      } else if (this.h / this.f == 8 && this.i / this.g == 6) {
        try {
          this.j = "" + c(Integer.parseInt(this.j));
        } catch (Exception exception) {}
      } else if (this.h / this.f == 8 && this.i / this.g == 7) {
        try {
          this.j = "" + b(Integer.parseInt(this.j));
        } catch (Exception exception) {}
      } else if (this.h / this.f == 1 && this.i / this.g == 7) {
        this.j = "Res: " + this.a + " X " + this.b;
      } else if (this.h / this.f == 2 && this.i / this.g == 7) {
        this.j = "Думаю!.....C";
      } else if (this.h / this.f == 3 && this.i / this.g == 7) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + (this.m * 9.0D / 5.0D + 32.0D);
        this.j = d(this.j);
      } else if (this.h / this.f == 4 && this.i / this.g == 7) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + ((this.m - 32.0D) * 5.0D / 9.0D);
        this.j = d(this.j);
      } else if (this.h / this.f == 6 && this.i / this.g == 7) {
        this.m = Double.parseDouble(this.j);
        if (this.s) {
          this.j = "" + (6.283185307179586D * this.m);
        } else {
          this.j = "" + (Math.PI * this.m * this.m);
        } 
        this.j = d(this.j);
      } else if (this.h / this.f == 7 && this.i / this.g == 7) {
        this.u = true;
      } else if (this.h / this.f == 2 && this.i / this.g == 6) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + (this.m * 0.621371192D);
        this.j = d(this.j);
      } else if (this.h / this.f == 3 && this.i / this.g == 6) {
        this.m = Double.parseDouble(this.j);
        this.j = "" + (this.m * 1.609344D);
        this.j = d(this.j);
      } else if (this.h / this.f == 1 && this.i / this.g == 5) {
        this.j = this.j.substring(0, this.j.indexOf("."));
      } else if (this.h / this.f == 7 && this.i / this.g == 6) {
        this.v.addElement(this.j);
        this.j = "0";
        this.q = false;
      } else if (this.h / this.f == 5 && this.i / this.g == 6) {
        try {
          this.j = "" + d();
          this.j = d(this.j);
        } catch (Exception exception) {
          System.out.println(exception);
        } 
      } else if (this.h / this.f == 6 && this.i / this.g == 6) {
        try {
          if (this.s) {
            this.v.removeAllElements();
          } else {
            this.j = "" + this.v.size();
          } 
          this.j = d(this.j);
        } catch (Exception exception) {
          System.out.println(exception);
        } 
      } else if (this.h / this.f == 4 && this.i / this.g == 6) {
        try {
          if (this.s) {
            this.j = "" + e();
          } else {
            this.j = "" + f();
          } 
          this.j = d(this.j);
        } catch (Exception exception) {
          System.out.println(exception);
        } 
      } else if (this.h / this.f == 1 && this.i / this.g == 6) {
        try {
          this.j = "" + f(Math.abs(Integer.parseInt(this.j)));
        } catch (Exception exception) {
          System.out.println(exception);
        } 
      } else if (this.h / this.f == 5 && this.i / this.g == 7) {
        try {
          if (this.s) {
            this.j = "" + h();
          } else {
            this.j = "" + g();
          } 
        } catch (Exception exception) {
          System.out.println(exception);
        } 
        this.j = d(this.j);
      } else if (this.h / this.f == 5 && this.i / this.g == 5) {
        try {
          System.out.println("finding lcm");
          this.j = "" + c();
          this.j = d(this.j);
        } catch (Exception exception) {
          System.out.println(exception);
        } 
      } else if (this.h / this.f == 4 && this.i / this.g == 5) {
        this.j = "Думаю!.....GCD";
      } else {
        this.m = Double.parseDouble(this.j);
        this.o = (this.h / this.f) + "" + (this.i / this.g);
        this.j = "0";
        this.r = true;
        this.q = false;
      } 
    } else {
      int i = getGameAction(paramInt);
      if (i == 5 && this.h < 8 * this.f) {
        this.h += this.f;
      } else if (i == 2 && this.h > 0) {
        this.h -= this.f;
      } else if (i == 1 && this.i > 2 * this.g) {
        this.i -= this.g;
      } else if (i == 6 && this.i < 7 * this.g) {
        this.i += this.g;
      } 
      this.k = i();
    } 
    repaint();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\SysCalc\a.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */