import java.io.EOFException;
import java.io.IOException;

public final class de {
  public String a;
  
  public int b = 0;
  
  private de(byte[] paramArrayOfbyte) {
    this.a = dh.a(paramArrayOfbyte, true);
    this.b = 0;
  }
  
  public final char a() throws IOException {
    if (this.b >= this.a.length())
      throw new EOFException(); 
    return this.a.charAt(this.b++);
  }
  
  public de(dy paramdy, byte[] paramArrayOfbyte, dy.ep paramep) {
    this(paramArrayOfbyte);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\de.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */