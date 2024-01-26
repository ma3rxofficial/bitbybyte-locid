package mc;

import java.io.DataInputStream;
import java.util.Vector;

public final class bq {
  public String a = null;
  
  public Vector b = new Vector();
  
  public Vector c = new Vector();
  
  private void a() {
    byte b1 = 0;
    byte b2 = 0;
    char c = Character.MIN_VALUE;
    this.a = this.a.trim();
    this.a = this.a.replace('\t', ' ');
    this.a = this.a.replace('ÿ', ' ');
    while (b1 < this.a.length() && ((c = this.a.charAt(b1)) == '\r' || c == '\n'))
      b1++; 
    if (b1 >= this.a.length())
      return; 
    for (b2 = b1;; b2 = b1) {
      if (b1 < this.a.length() && (c = this.a.charAt(b1)) != '\r' && c != '\n') {
        b1++;
        continue;
      } 
      String str;
      if ((str = new String(this.a.substring(b2, b1).trim())).length() > 0)
        this.c.addElement(str); 
      if (b1 >= this.a.length())
        break; 
      while (b1 < this.a.length() && ((c = this.a.charAt(b1)) == '\r' || c == '\n'))
        b1++; 
      if (b1 >= this.a.length())
        break; 
    } 
    for (byte b3 = 0; b3 < this.c.size(); b3++) {
      Vector vector = new Vector();
      String str = this.c.elementAt(b3);
      b1 = b2 = 0;
      while (true) {
        if (b1 < str.length() && (c = str.charAt(b1)) != ' ' && c != '"') {
          b1++;
          continue;
        } 
        if (b1 > b2)
          vector.addElement(new String(str.substring(b2, b1))); 
        if (b1 >= str.length())
          break; 
        if (c == '"') {
          if (++b1 >= str.length())
            break; 
          b2 = b1;
          while (b1 < str.length() && (c = str.charAt(b1)) != '"')
            b1++; 
          vector.addElement(new String(str.substring(b2, b1)));
          if (++b1 >= str.length())
            break; 
        } 
        while (b1 < str.length() && (c = str.charAt(b1)) == ' ')
          b1++; 
        b2 = b1;
      } 
      if (vector.size() > 0) {
        String[] arrayOfString = new String[vector.size()];
        for (b1 = 0; b1 < vector.size(); b1++)
          arrayOfString[b1] = vector.elementAt(b1); 
        this.b.addElement(arrayOfString);
      } 
    } 
  }
  
  public final boolean a(String paramString) throws Exception {
    m m = new m();
    DataInputStream dataInputStream = null;
    try {
      m.a(paramString, 1);
      int i;
      if ((i = (int)m.a()) == 0)
        throw new Exception(); 
      dataInputStream = m.b();
      byte[] arrayOfByte = new byte[i];
      dataInputStream.readFully(arrayOfByte);
      this.a = new String(arrayOfByte, "UTF-8");
      dataInputStream.close();
      m.d();
      a();
      return true;
    } catch (Exception exception) {
      try {
        if (dataInputStream != null)
          dataInputStream.close(); 
      } catch (Exception exception1) {}
      try {
        m.d();
      } catch (Exception exception1) {}
      throw exception;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\bq.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */