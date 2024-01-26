package KD;

public final class i {
  public ae a;
  
  public String[] b;
  
  public String[] c;
  
  public af d;
  
  public int[] e;
  
  public boolean f = true;
  
  public String[] g;
  
  public String[] h;
  
  public i(ae paramae) {
    if (paramae != null)
      this.a = paramae; 
  }
  
  public final void a() {
    this.b = this.a.j();
    this.c = this.a.k();
    this.d = new af();
    g();
  }
  
  public final void b() {
    this.d = null;
  }
  
  private void g() {
    if (this.d != null)
      this.d.a(this.b, this.c, false); 
    this.a.a("Чтение тегов...");
    if (this.a.k)
      this.d.c(); 
    h();
  }
  
  public final boolean a(String paramString) {
    boolean bool = false;
    int j;
    if (paramString != null && paramString.length() > 1 && (j = this.d.a(this.b, paramString)) == -1) {
      this.b = new String[1];
      this.b = af.a(this.b, this.b.length + 1);
      this.b[(this.b == null) ? 0 : (this.b.length - 1)] = paramString;
      bool = true;
    } 
    return bool;
  }
  
  public final boolean a(int paramInt, String paramString) {
    if (paramInt < 0)
      return false; 
    if (this.b != null && paramInt >= this.b.length)
      return false; 
    boolean bool = false;
    int j;
    if (paramString != null && paramString.length() > 1 && (j = this.d.a(this.b, paramString)) == -1) {
      this.b = new String[1];
      this.b[(this.b == null) ? 0 : paramInt] = paramString;
      bool = true;
    } 
    return bool;
  }
  
  public final boolean a(int paramInt) {
    if (this.b == null)
      return false; 
    boolean bool = false;
    if (paramInt >= 0 && paramInt < this.b.length) {
      this.b = this.d.b(this.b, paramInt);
      bool = true;
    } 
    return bool;
  }
  
  public final void b(String paramString) {
    int j;
    if ((j = this.d.a(paramString)) == -1)
      this.d.a(paramString, this.a.k); 
    this.f = true;
  }
  
  public final String[] c() {
    String[] arrayOfString = null;
    int[] arrayOfInt = null;
    if (this.d != null && (arrayOfString = this.d.a(true)).length > 0) {
      arrayOfInt = this.d.i;
      byte b1 = 0;
      byte b2 = 0;
      while (true) {
        if (((b1 ? 1 : 0) & ((b1 < arrayOfInt.length) ? 1 : 0)) != 0) {
          if (this.d.d[arrayOfInt[b1]]) {
            arrayOfString = this.d.b(arrayOfString, b2);
            arrayOfInt[b1] = -1;
            b2--;
          } 
          b2++;
          b1++;
          continue;
        } 
        b1 = 0;
        while (true) {
          if ((((b1 >= 0) ? 1 : 0) & ((b1 < arrayOfInt.length) ? 1 : 0)) != 0) {
            if (arrayOfInt[b1] < 0) {
              arrayOfInt = this.d.b(arrayOfInt, b1);
              b1--;
            } 
            b1++;
            if (arrayOfInt == null)
              break; 
            continue;
          } 
          break;
        } 
        break;
      } 
    } 
    this.e = arrayOfInt;
    return arrayOfString;
  }
  
  public final String[] d() {
    String[] arrayOfString = null;
    int[] arrayOfInt = null;
    if (this.d != null && (arrayOfString = this.d.a(true)).length > 0) {
      arrayOfInt = this.d.i;
      byte b1 = 0;
      byte b2 = 0;
      while (true) {
        if (((b1 ? 1 : 0) & ((b1 < arrayOfInt.length) ? 1 : 0)) != 0) {
          if (!this.d.d[arrayOfInt[b1]]) {
            arrayOfString = this.d.b(arrayOfString, b2);
            arrayOfInt[b1] = -1;
            b2--;
          } 
          b2++;
          b1++;
          continue;
        } 
        b1 = 0;
        while (true) {
          if ((((b1 >= 0) ? 1 : 0) & ((b1 < arrayOfInt.length) ? 1 : 0)) != 0) {
            if (arrayOfInt[b1] < 0) {
              arrayOfInt = this.d.b(arrayOfInt, b1);
              b1--;
            } 
            b1++;
            if (arrayOfInt == null)
              break; 
            continue;
          } 
          break;
        } 
        break;
      } 
    } 
    this.e = arrayOfInt;
    return arrayOfString;
  }
  
  public final String[] e() {
    h();
    return this.g;
  }
  
  public final String[] f() {
    h();
    return this.h;
  }
  
  private void h() {
    if (this.f) {
      this.g = null;
      this.h = null;
      this.g = this.d.a();
      this.h = this.d.b();
      this.f = false;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */