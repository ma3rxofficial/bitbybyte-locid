import java.util.Vector;
import javax.microedition.lcdui.TextBox;

public final class r extends TextBox {
  public static String a = "";
  
  public static Vector a;
  
  private StringBuffer a;
  
  private int c;
  
  private int d;
  
  private int e = 1;
  
  private int f = 1;
  
  private int g;
  
  private int h;
  
  private static boolean a;
  
  private static int i;
  
  private static int j;
  
  public static int a;
  
  public ah a;
  
  public int b;
  
  public r(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, ah paramah) {
    super(paramString1, "", paramInt1, paramInt3);
    a = setMaxSize(paramInt1);
    this.d = paramInt2;
    this.a = paramah;
    if (a == null)
      a = (ah)new Vector(0); 
    a(v.i(paramString2));
  }
  
  public final String a() {
    r r1;
    (r1 = this).h();
    String str;
    if ((str = r1.a.toString()) == null || str.length() == 0 || getConstraints() != 3)
      return str; 
    StringBuffer stringBuffer = new StringBuffer(str);
    for (byte b = 0; b < length(); b++) {
      char c;
      if (!Character.isDigit(c = charAt(b)) && c != '(' && c != ')' && c != '-' && c != '+' && c != ' ') {
        deleteCharAt(b);
        continue;
      } 
    } 
    return new String(this);
  }
  
  public final void setString(String paramString) {
    a(paramString);
  }
  
  public final void a(String paramString) {
    this.a = (ah)new StringBuffer(paramString);
    i = this.a.length();
    i();
  }
  
  public final void a() {
    super.setString("");
  }
  
  public final String b() {
    return this.a.toString();
  }
  
  public final int a() {
    return this.e;
  }
  
  public final int b() {
    return this.f;
  }
  
  public final int setMaxSize(int paramInt) {
    try {
      return this.c = super.setMaxSize(paramInt);
    } catch (Exception exception) {
      return this.c = setMaxSize(paramInt >> 1);
    } 
  }
  
  public final int getMaxSize() {
    return this.c;
  }
  
  public static boolean a() {
    return a;
  }
  
  public final void b() {
    h();
    c();
    if (this.f == this.e)
      this.e++; 
    this.f++;
    i();
  }
  
  public final void c() {
    if (this.f != 1) {
      h();
      c();
      this.f--;
      i();
    } 
  }
  
  public final void a(int paramInt) {
    h();
    c();
    if (paramInt < 1)
      paramInt = 1; 
    if (paramInt > this.e)
      paramInt = this.e; 
    this.f = paramInt;
    i();
  }
  
  private int c() {
    if (this.d > 0)
      this.e = this.a.length() / this.d + 1; 
    return this.e;
  }
  
  private void h() {
    int i;
    int j = v.b((i = v.b(a(true), this.a.length())) + this.d, this.a.length());
    try {
      this.a.delete(i, j).insert(i, getString());
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void i() {
    int i;
    int j = v.b((i = v.b(a(true), this.a.length())) + this.d, this.a.length());
    super.setString("");
    try {
      super.setString(this.a.toString().substring(i, j));
    } catch (Exception exception) {
      super.setString("");
    } 
    i = this.a.length();
  }
  
  public final void d() {
    h();
    c();
    i();
  }
  
  public final void e() {
    f();
    if (i == d()) {
      this.g = getCaretPosition() + a(true);
      a = true;
      j = i;
      return;
    } 
    d();
  }
  
  private int d() {
    StringBuffer stringBuffer = new StringBuffer(this.a.toString());
    int i;
    int j = v.b((i = v.b(a(true), stringBuffer.length())) + this.d, stringBuffer.length());
    try {
      stringBuffer.delete(i, j).insert(i, getString());
    } catch (Exception exception) {}
    return stringBuffer.length();
  }
  
  public final void f() {
    this.g = 0;
    this.h = 0;
    a = false;
  }
  
  public final void a(boolean paramBoolean) {
    if (j == d()) {
      r r1;
      this.h = (r1 = this).getCaretPosition() + r1.a(true);
      a = false;
      String str;
      if ((str = a()) != null && str.length() > 0)
        a((String)(a = (ah)str.substring(v.a(v.b(this.g, this.h), 0), v.b(v.a(this.g, this.h), str.length()))), paramBoolean); 
    } else {
      d();
    } 
    f();
  }
  
  public static void a(String paramString, boolean paramBoolean) {
    if (paramBoolean && paramString != null && paramString.length() > 0) {
      if (a == null)
        a = (ah)new Vector(1); 
      a.addElement(paramString);
    } 
  }
  
  public final void b(boolean paramBoolean) {
    b((String)a, paramBoolean);
  }
  
  public final void b(String paramString, boolean paramBoolean) {
    int i = (paramBoolean ? getCaretPosition() : 0) + a(paramBoolean);
    h();
    if (i >= 0 && this.a.length() > 0 && i < this.a.length()) {
      this.a.insert(i, paramString);
    } else {
      this.a.append(paramString);
    } 
    c();
    i();
    f();
  }
  
  public static void g() {
    a = (ah)"";
  }
  
  private int a(boolean paramBoolean) {
    return (this.f - 1) * this.d + (paramBoolean ? 0 : size());
  }
  
  public final void c(boolean paramBoolean) {
    String[] arrayOfString = v.a("a\000b\000v\000g\000d\000e\000z\000i\000k\000l\000m\000n\000o\000p\000r\000s\000t\000u\000f\000c\000y\000'\000jo\000zh\000jj\000kh\000ch\000sh\000hh\000''\000eh\000ju\000ja\000", 33, false);
    String str = "абвгдезиклмнопрстуфцыьёжйхчшщъэюя";
    h();
    if (this.a == null || this.a.length() == 0)
      return; 
    if (paramBoolean) {
      for (int i = 0; i < this.a.length(); i++) {
        char c1;
        char c2;
        boolean bool = ((c1 = v.a(c2 = this.a.charAt(i))) != c2) ? true : false;
        int j;
        if ((j = str.indexOf(c1)) != -1) {
          this.a.deleteCharAt(i);
          String str1 = arrayOfString[j];
          this.a.insert(i, bool ? str1.toUpperCase() : str1);
          i += str1.length();
          continue;
        } 
      } 
    } else {
      StringBuffer stringBuffer = new StringBuffer(0);
      for (byte b = 0; b < this.a.length(); b++) {
        byte b1 = -1;
        char c = Character.MIN_VALUE;
        boolean bool = false;
        stringBuffer.setLength(0);
        stringBuffer.append(v.a(this.a.charAt(b)));
        if (b < this.a.length() - 1)
          stringBuffer.append(v.a(this.a.charAt(b + 1))); 
        for (byte b2 = 0; b2 < arrayOfString.length; b2++) {
          if (stringBuffer.toString().startsWith(arrayOfString[b2])) {
            b1 = b2;
            bool = (arrayOfString[b2].length() == 2) ? true : false;
            c = (v.a(c = this.a.charAt(b)) != c) ? '\001' : Character.MIN_VALUE;
          } 
        } 
        if (b1 != -1) {
          this.a.deleteCharAt(b);
          if (bool)
            this.a.deleteCharAt(b); 
          this.a.insert(b, (c != '\000') ? v.b(str.charAt(b1)) : str.charAt(b1));
        } 
      } 
    } 
    i();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\r.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */