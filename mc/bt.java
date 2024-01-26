package mc;

import java.io.IOException;
import java.io.InputStream;

public final class bt {
  private InputStream b;
  
  private m c;
  
  public int a;
  
  public final long a(long paramLong) throws IOException {
    if (paramLong < 0L)
      throw new IllegalArgumentException(); 
    if (paramLong == 0L)
      return 0L; 
    long l1 = paramLong;
    long l2 = 0L;
    if (m.a == 1) {
      l2 = this.b.skip(paramLong);
      this.a = (int)(this.a + l2);
      if (l2 < paramLong)
        l2 += a(paramLong - (int)l2); 
      return l2;
    } 
    byte[] arrayOfByte = null;
    if (paramLong >= 20480L)
      arrayOfByte = new byte[20480]; 
    while (paramLong > 0L) {
      if (paramLong < 20480L)
        arrayOfByte = new byte[(int)paramLong]; 
      l2 = this.b.read(arrayOfByte, 0, arrayOfByte.length);
      paramLong -= l2;
    } 
    this.a = (int)(this.a + l1);
    return l1 - paramLong;
  }
  
  public final int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    byte[] arrayOfByte = new byte[paramInt2];
    int i = this.b.read(arrayOfByte, 0, paramInt2);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt1, paramInt2);
    this.a += i;
    return i;
  }
  
  public bt(m paramm) {
    try {
      if (this.b == null)
        this.b = paramm.g(); 
    } catch (IOException iOException) {}
    this.b = this.b;
    this.c = paramm;
    this.a = 0;
  }
  
  public final void a() {
    try {
      if (this.b != null)
        this.b.close(); 
    } catch (IOException iOException) {}
    this.b = null;
  }
  
  public final long a(int paramInt) throws IOException {
    long l1 = 0L;
    long l2 = 0L;
    if (paramInt == this.a)
      return 0L; 
    if (m.a == 1) {
      if (paramInt < this.a) {
        this.b.close();
        this.b = this.c.g();
        this.a = 0;
      } 
      l2 = this.b.skip((paramInt - this.a));
      int k = this.a;
      this.a = (int)(this.a + l2);
      if (this.a != k && this.a != paramInt)
        a(paramInt); 
      return l2;
    } 
    boolean bool = false;
    byte[] arrayOfByte = new byte[20480];
    int i = 0;
    int j = 0;
    if (paramInt > this.a) {
      while ((i = paramInt - this.a) > 0) {
        if (i > 20480) {
          j = 20480;
        } else {
          j = i;
        } 
        if (j < 20480)
          arrayOfByte = new byte[j]; 
        l1 = this.b.read(arrayOfByte, 0, j);
        this.a = (int)(this.a + l1);
        l2 += l1;
      } 
    } else {
      this.b.close();
      this.b = this.c.g();
      this.a = 0;
      while ((i = paramInt - this.a) > 0) {
        if (i > 20480) {
          j = 20480;
        } else {
          j = i;
        } 
        if (j < 20480)
          arrayOfByte = new byte[j]; 
        l1 = this.b.read(arrayOfByte, 0, j);
        this.a = (int)(this.a + l1);
        l2 += l1;
      } 
    } 
    return l2;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bt.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */