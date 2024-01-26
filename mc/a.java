package mc;

import java.io.IOException;
import java.io.InputStream;

public final class mc/a extends InputStream {
  private int a = 0;
  
  private int b = 0;
  
  private cn c = null;
  
  private bt d = null;
  
  private byte[] e = null;
  
  private int f = 0;
  
  private final void a() throws Exception {
    int i;
    if ((i = this.b - this.f) > 4096) {
      this.e = new byte[4096];
    } else {
      this.e = new byte[this.b - this.f];
    } 
    int j;
    if ((j = this.d.a(this.e, 0, this.e.length)) < 0)
      throw new Exception("Deflated stream ends early."); 
    this.f += j;
    this.c.b(this.e, 0, j);
  }
  
  public mc/a(dd paramdd, bt parambt, int paramInt1, int paramInt2) {
    this.d = parambt;
    this.a = paramInt2;
    this.b = paramInt1;
    try {
      this.c = new cn(true);
      this.c.d();
      a();
      return;
    } catch (Exception exception) {
      this.c = null;
      return;
    } 
  }
  
  public final int read() throws IOException {
    byte[] arrayOfByte = new byte[1];
    read(arrayOfByte, 0, 1);
    return arrayOfByte[0] & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (paramInt2 == 0)
      return 0; 
    System.currentTimeMillis();
    int i = 0;
    while (true) {
      int j = 0;
      try {
        j = this.c.a(paramArrayOfbyte, paramInt1, paramInt2);
      } catch (Exception exception) {}
      paramInt2 -= j;
      i += j;
      paramInt1 += j;
      if ((((paramInt2 == 0) ? 1 : 0) | this.c.a()) != 0)
        return i; 
      if ((this.c.b() | this.c.a()) != 0)
        return 0; 
      if (this.c.c())
        try {
          a();
        } catch (Exception exception) {} 
      if (!this.c.c() && j == 0)
        throw new IOException("Don't know what to do"); 
    } 
  }
  
  public final int available() throws IOException {
    return this.a - this.c.a;
  }
  
  public final void close() throws IOException {}
  
  public final synchronized void reset() throws IOException {
    throw new IOException();
  }
  
  public final synchronized void mark(int paramInt) {}
  
  public final boolean markSupported() {
    return false;
  }
  
  public final long skip(long paramLong) throws IOException {
    if (paramLong < 0L)
      throw new IllegalArgumentException(); 
    if (paramLong == 0L)
      return 0L; 
    int i;
    byte[] arrayOfByte = new byte[i = (int)Math.min(paramLong, 2048L)];
    long l = 0L;
    int j;
    while (paramLong > 0L && (j = read(arrayOfByte, 0, i)) > 0) {
      paramLong -= j;
      l += j;
      i = (int)Math.min(paramLong, 2048L);
    } 
    return l;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\a.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */