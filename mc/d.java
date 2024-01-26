package mc;

import java.io.IOException;
import java.io.InputStream;

public final class d {
  public InputStream a;
  
  private char b;
  
  private boolean c = false;
  
  public d(InputStream paramInputStream) {
    this.a = paramInputStream;
  }
  
  public final void a() throws IOException {
    this.a.close();
  }
  
  private int c() {
    try {
      return this.a.read();
    } catch (IOException iOException) {
      return -1;
    } 
  }
  
  public final String b() throws IOException {
    StringBuffer stringBuffer = new StringBuffer();
    if (this.c) {
      stringBuffer.append(this.b);
      this.c = false;
    } 
    int i;
    while ((i = c()) != 10 && i != 13 && i != -1)
      stringBuffer.append((char)i); 
    if (i == 13 && (i = c()) != 10 && i != -1)
      this.c = true; 
    return stringBuffer.toString();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\d.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */