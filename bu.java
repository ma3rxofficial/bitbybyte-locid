import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class bu implements ds {
  public int a;
  
  private String b;
  
  private int c;
  
  private int d;
  
  private dv e = new dv();
  
  public bu(int paramInt, String paramString) {
    this.a = paramInt;
    this.b = new String(paramString);
    this.c = this.d = 0;
  }
  
  public bu() {}
  
  public bu(String paramString) {
    this.a = dh.b();
    this.b = new String(paramString);
    this.c = this.d = 0;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final void b(int paramInt1, int paramInt2) {
    this.c += paramInt1;
    this.d += paramInt2;
  }
  
  public final int getImageIndex() {
    return 22;
  }
  
  public final synchronized dv a() {
    return this.e;
  }
  
  public final String getText() {
    String str;
    if (this.c != 0 && !em.h(7)) {
      str = this.b + " (" + Integer.toString(this.c) + "/" + Integer.toString(this.d) + ")";
    } else {
      str = this.b;
    } 
    return str;
  }
  
  public final int getTextColor() {
    return em.g(1);
  }
  
  public final int b() {
    return -1;
  }
  
  public final int c() {
    return -1;
  }
  
  public final int d() {
    return -1;
  }
  
  public final int e() {
    return -1;
  }
  
  public final int f() {
    return -1;
  }
  
  public final int g() {
    return -1;
  }
  
  public final String h() {
    return new String(this.b);
  }
  
  public final void a(String paramString) {
    this.b = new String(paramString);
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof bu))
      return false; 
    bu bu1 = (bu)paramObject;
    return (this.a == bu1.a);
  }
  
  public final int getFontStyle() {
    return em.f(240);
  }
  
  public final void a(DataOutputStream paramDataOutputStream) throws IOException {
    paramDataOutputStream.writeByte(1);
    paramDataOutputStream.writeInt(this.a);
    paramDataOutputStream.writeUTF(this.b);
  }
  
  public final void a(DataInputStream paramDataInputStream) throws IOException {
    this.a = paramDataInputStream.readInt();
    this.b = paramDataInputStream.readUTF();
  }
  
  public final String i() {
    return this.b;
  }
  
  public final int getSortWeight(int paramInt) {
    return 0;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */