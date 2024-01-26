package KD;

public final class v {
  public ae a;
  
  public int b = 0;
  
  public int c = 0;
  
  private int[] d;
  
  private String[] e;
  
  private boolean f;
  
  public v(ae paramae) {
    this.a = paramae;
    this.f = true;
  }
  
  public final void a() {
    if (this.f) {
      this.d = this.a.d.b(0);
      this.e = this.a.c.d.a(this.d);
      this.c = this.a.d.c[0];
      this.f = false;
    } 
  }
  
  public final String[] b() {
    a();
    return this.e;
  }
  
  public final void a(String[] paramArrayOfString) {
    if (paramArrayOfString != null && paramArrayOfString.length > 0) {
      this.a.d.a(0, paramArrayOfString);
      this.f = true;
      a();
    } 
  }
  
  public final void a(int paramInt) {
    if ((((paramInt >= 0) ? 1 : 0) & ((paramInt < this.a.d.c[0]) ? 1 : 0)) != 0) {
      this.a.d.a(0, paramInt);
      this.f = true;
      a();
    } 
  }
  
  public final void a(int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return; 
    if (paramArrayOfint.length < 1)
      return; 
    try {
      this.b = 0;
      this.c = 0;
      this.a.d.c[0] = 0;
      this.a.d.d[0] = "";
      StringBuffer stringBuffer1 = new StringBuffer();
      StringBuffer stringBuffer2 = new StringBuffer();
      for (byte b = 0; b < paramArrayOfint.length; b++) {
        if (paramArrayOfint[b] >= 0) {
          stringBuffer1.append(this.a.c.d.c[paramArrayOfint[b]] + "*");
          stringBuffer2.append(paramArrayOfint[b] + "*");
          this.a.d.c[0] = this.a.d.c[0] + 1;
        } 
      } 
      this.a.d.e[0] = stringBuffer1.toString();
      this.a.d.d[0] = stringBuffer2.toString();
    } catch (Exception exception) {
      this.a.d.c[0] = 0;
      this.a.d.d[0] = "";
      this.a.d.e[0] = "";
      this.a.a("Ошибка", "Обнаружена ошибка #1 сообщите пожалуйста автору!", null, null, 3000);
    } 
    this.f = true;
    a();
  }
  
  public final void b(int paramInt) {
    if (this.c > 1) {
      this.b = this.a.d.a(0, paramInt, this.b);
      this.f = true;
    } 
  }
  
  public final String c(int paramInt) {
    if ((((paramInt >= 0) ? 1 : 0) & ((paramInt < this.a.d.c[0]) ? 1 : 0)) != 0) {
      a();
      int i;
      return (((((i = this.d[paramInt]) >= 0) ? 1 : 0) & ((i < this.a.c.d.a) ? 1 : 0)) != 0) ? this.a.c.d.c[i] : null;
    } 
    return null;
  }
  
  public final boolean d(int paramInt) {
    if ((((paramInt >= 0) ? 1 : 0) & ((paramInt < this.a.d.c[0]) ? 1 : 0)) != 0) {
      a();
      int i;
      return (((((i = this.d[paramInt]) >= 0) ? 1 : 0) & ((i < this.a.c.d.a) ? 1 : 0)) != 0) ? this.a.c.d.d[i] : false;
    } 
    return false;
  }
  
  public final void e(int paramInt) {
    if ((((paramInt >= 0) ? 1 : 0) & ((paramInt < this.a.d.c[0]) ? 1 : 0)) != 0)
      this.b = paramInt; 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */