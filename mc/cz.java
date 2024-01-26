package mc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class cz {
  private SocketConnection b;
  
  private d c;
  
  private OutputStream d;
  
  private String e;
  
  private int f;
  
  public String a;
  
  private cz(String paramString, int paramInt) throws IOException, cp {
    this.b = (SocketConnection)Connector.open("socket://" + paramString + ":" + paramInt);
    this.c = new d(this.b.openInputStream());
    this.d = this.b.openOutputStream();
    this.a = paramString;
    f();
    if (this.f == 120) {
      a(220);
      return;
    } 
    if (this.f != 220)
      throw new cp(this.e); 
  }
  
  public cz(String paramString1, int paramInt, String paramString2, String paramString3) throws IOException, cp {
    this(paramString1, paramInt);
    h(paramString2);
    g(paramString3);
  }
  
  public final void a() {
    try {
      this.c.a();
      this.d.close();
      this.b.close();
      return;
    } catch (Exception exception) {
      return;
    } finally {
      this.c = null;
      this.d = null;
      this.b = null;
    } 
  }
  
  public final void a(String paramString) throws IOException, cp {
    i("CWD " + paramString);
    a(250);
  }
  
  public final void b(String paramString) throws IOException, cp {
    i("DELE " + paramString);
    a(250);
  }
  
  private Enumeration d() throws IOException, cp {
    cf cf = e();
    i("LIST");
    SocketConnection socketConnection = (SocketConnection)Connector.open("socket://" + cf.b + ":" + cf.a);
    a(150);
    Vector vector = new Vector();
    d d1 = new d(socketConnection.openInputStream());
    String str;
    while (!(str = d1.b()).equals(""))
      vector.addElement(str); 
    try {
      d1.a();
    } catch (IOException iOException) {}
    try {
      socketConnection.close();
    } catch (IOException iOException) {}
    a(226);
    return vector.elements();
  }
  
  public final void a(Vector paramVector1, Vector paramVector2, String paramString) throws IOException, cp {
    Enumeration enumeration = d();
    while (enumeration.hasMoreElements()) {
      cb cb;
      if ((cb = a(enumeration.nextElement(), paramString)) != null) {
        if (cb.a == 0) {
          paramVector1.addElement(cb);
          continue;
        } 
        paramVector2.addElement(cb);
      } 
    } 
  }
  
  public final void a(Vector paramVector, String paramString) throws IOException, cp {
    Vector vector = new Vector();
    a(paramVector, vector, paramString);
    for (byte b = 0; b < vector.size(); b++)
      paramVector.addElement(vector.elementAt(b)); 
  }
  
  private static cb a(String paramString1, String paramString2) {
    byte b1 = 0;
    int i = 0;
    int j = paramString1.length();
    byte b2 = 0;
    for (byte b3 = 1; b3 < j; b3++) {
      if (paramString1.charAt(b3) == ' ' && paramString1.charAt(b3 - 1) != ' ')
        b2++; 
      if (b2 == 8) {
        i = b3;
        break;
      } 
    } 
    if (paramString1.charAt(0) == 'd') {
      b1 = 0;
    } else if (paramString1.charAt(0) == 'l') {
      b1 = 1;
    } else if (paramString1.charAt(0) == '-' || paramString1.charAt(0) == 's') {
      b1 = 2;
    } else {
      return null;
    } 
    String str2 = paramString1.substring(paramString1.length() - j - i - 1, paramString1.length());
    String str1;
    i = (str1 = (str1 = paramString1.substring(0, i)).substring(0, str1.length() - 13)).lastIndexOf(' ');
    String str3 = str1.substring(i + 1, str1.length());
    if (str2.equals(".") || str2.equals(".."))
      return null; 
    if (b1 == 1)
      return null; 
    cb cb = new cb();
    if (b1 == 0) {
      str2 = str2 + "/";
      cb.a = 0;
    } else {
      cb.a = 1;
    } 
    cb.d = paramString2 + str2;
    try {
      cb.f = Integer.parseInt(str3);
    } catch (NumberFormatException numberFormatException) {}
    return cb;
  }
  
  public final void c(String paramString) throws IOException, cp {
    if (paramString.endsWith("/"))
      paramString = paramString.substring(0, paramString.length() - 1); 
    i("MKD " + paramString);
    a(250);
  }
  
  private void g(String paramString) throws IOException, cp {
    i("PASS " + paramString);
    a(230);
  }
  
  private cf e() throws IOException, cp {
    cf cf = null;
    i("PASV");
    a(227);
    int i = this.e.indexOf('(');
    int j;
    if ((j = this.e.indexOf(')', i + 1)) > 0) {
      String str = this.e.substring(i + 1, j);
      cf = new cf(str);
    } else {
      throw new cp("Badly formatted answer received after PASV");
    } 
    return cf;
  }
  
  public final String b() throws IOException, cp {
    i("PWD");
    a(257);
    String str = null;
    int i = this.e.indexOf('"');
    int j;
    if ((j = this.e.indexOf('"', i + 1)) > 0)
      str = this.e.substring(i + 1, j); 
    return str;
  }
  
  public final void c() throws IOException, cp {
    i("QUIT");
  }
  
  public final void a(OutputStream paramOutputStream, String paramString, long paramLong, aw paramaw) throws IOException, cp {
    cf cf = e();
    i("RETR " + paramString);
    SocketConnection socketConnection = (SocketConnection)Connector.open("socket://" + cf.b + ":" + cf.a);
    a(150);
    InputStream inputStream = socketConnection.openInputStream();
    byte[] arrayOfByte = new byte[128];
    int i = 0;
    int j = 0;
    long l = 0L;
    while ((i = inputStream.read(arrayOfByte)) != -1 && !paramaw.x[0]) {
      j += i;
      paramOutputStream.write(arrayOfByte, 0, i);
      if (paramaw != null) {
        long l1 = System.currentTimeMillis();
        if (l < l1 && paramLong > 0L) {
          l = l1 + 1000L;
          cx.a(bn.ei + " (" + String.valueOf((j * 100) / paramLong) + "%)", paramString, "", 4);
        } 
      } 
    } 
    inputStream.close();
    socketConnection.close();
    a(226);
  }
  
  public final void d(String paramString) throws IOException, cp {
    i("RMD " + paramString);
    a(250);
  }
  
  public final void e(String paramString) throws IOException, cp {
    i("RNFR " + paramString);
    a(350);
  }
  
  public final void f(String paramString) throws IOException, cp {
    i("RNTO " + paramString);
    a(250);
  }
  
  public final void a(InputStream paramInputStream, String paramString, long paramLong, aw paramaw) throws IOException, cp {
    cf cf = e();
    i("STOR " + paramString);
    SocketConnection socketConnection = (SocketConnection)Connector.open("socket://" + cf.b + ":" + cf.a);
    a(150);
    OutputStream outputStream = socketConnection.openOutputStream();
    byte[] arrayOfByte = new byte[128];
    int i = 0;
    int j = 0;
    long l = 0L;
    while ((i = paramInputStream.read(arrayOfByte)) != -1 && !paramaw.x[0]) {
      j += i;
      outputStream.write(arrayOfByte, 0, i);
      if (paramaw != null) {
        long l1 = System.currentTimeMillis();
        if (l < l1 && paramLong > 0L) {
          l = l1 + 1000L;
          cx.a(bn.ek + " (" + String.valueOf((j * 100) / paramLong) + "%)", paramString, "", 4);
        } 
      } 
    } 
    outputStream.close();
    socketConnection.close();
    a(226);
  }
  
  public final void a(char paramChar) throws IOException, cp {
    a(paramChar, 8);
  }
  
  private void a(char paramChar, int paramInt) throws IOException, cp {
    if (paramChar == 'L') {
      i("TYPE " + paramChar + " " + String.valueOf(paramInt));
    } else {
      i("TYPE " + paramChar);
    } 
    a(200);
  }
  
  private void h(String paramString) throws IOException, cp {
    i("USER " + paramString);
    a(331);
  }
  
  private void i(String paramString) throws IOException, cp {
    if (this.b == null)
      throw new cp("FtpMe is not connected."); 
    try {
      this.d.write((paramString + "\r\n").getBytes());
      this.d.flush();
      return;
    } catch (IOException iOException) {
      this.c = null;
      this.d = null;
      this.b = null;
      throw iOException;
    } 
  }
  
  private int f() throws cp, IOException {
    StringBuffer stringBuffer;
    String str1;
    (stringBuffer = new StringBuffer()).append((str1 = this.c.b()) + "\n");
    String str2 = str1.substring(0, 3);
    char c = str1.charAt(3);
    try {
      this.f = Integer.parseInt(str2);
    } catch (NumberFormatException numberFormatException) {
      throw new cp("FtpMe: Bad response code");
    } 
    if (c == '-') {
      do {
        stringBuffer.append((str1 = this.c.b()) + "\n");
      } while (str1.length() == 0 || !str1.substring(0, 4).equals(str2 + " "));
    } else if (c != ' ') {
      throw new cp("FtpMe: Malformed multi-line response");
    } 
    this.e = stringBuffer.toString();
    return this.f;
  }
  
  private void a(int paramInt) throws IOException, cp {
    if (f() / 100 * 100 != paramInt / 100 * 100)
      throw new cp(this.e); 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\cz.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */