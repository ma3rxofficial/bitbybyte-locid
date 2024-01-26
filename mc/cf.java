package mc;

import java.io.IOException;

public final class cf {
  public int a;
  
  public String b;
  
  public cf(String paramString) throws IOException {
    StringBuffer stringBuffer = new StringBuffer();
    byte b1 = 0;
    byte b2;
    for (b2 = 0; b1 < 4 && b2 < paramString.length(); b2++) {
      char c;
      if ((c = paramString.charAt(b2)) != ',') {
        stringBuffer.append(c);
      } else {
        if (b1 < 3)
          stringBuffer.append('.'); 
        b1++;
      } 
    } 
    if (b2 >= paramString.length())
      throw new IOException("FtpMe reveived badly formatted answer to PASV command"); 
    this.b = stringBuffer.toString();
    b1 = 0;
    int i = 0;
    int j = 0;
    while (b1 < 2 && b2 < paramString.length()) {
      char c;
      if ((c = paramString.charAt(b2)) != ',') {
        if (b1 == 0) {
          i = i * 10 + c - 48;
        } else {
          j = j * 10 + c - 48;
        } 
      } else {
        b1++;
      } 
      b2++;
    } 
    if (b1 != 1)
      throw new IOException("FtpMe reveived badly formatted answer to PASV command"); 
    this.a = i * 256 + j;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\cf.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */