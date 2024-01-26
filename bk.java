import i.I;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import jimm.Jimm;

public final class bk implements CommandListener {
  public Hashtable a;
  
  public int b = 0;
  
  public bc c = null;
  
  public String d = "";
  
  public final void a() {
    this.b++;
    if (this.a == null) {
      fb.a(23, this, "0");
      return;
    } 
    this.c = (bc)this.a.get("0");
    this.c.f = null;
    b(this.c);
    this.c.a.b(Jimm.d);
  }
  
  public final void a(String paramString) {
    try {
      String str1 = em.c(-1);
      String str2 = paramString;
      String str3 = paramString;
      byte[] arrayOfByte = null;
      InputStream inputStream;
      if (!paramString.startsWith("http://") && (inputStream = getClass().getResourceAsStream("/_" + paramString)) != null) {
        arrayOfByte = new byte[inputStream.available()];
        inputStream.read(arrayOfByte);
      } 
      if (arrayOfByte == null) {
        if ("0".equals(paramString)) {
          str3 = "http://fay.by/locid/help.php?uin=" + str1 + "&i=0&lang=" + em.d(106) + "&info=" + dw.b(dw.c());
        } else if (paramString.startsWith("http://")) {
          str3 = paramString;
        } else {
          str3 = "http://fay.by/locid/help.php?uin=" + str1 + "&i=" + dw.b(paramString);
        } 
        HttpConnection httpConnection;
        (httpConnection = (HttpConnection)Connector.open(str3)).setRequestMethod("GET");
        httpConnection.setRequestProperty("locid-browser", "ver=4501;plg=78");
        if (this.d != null)
          httpConnection.setRequestProperty("locid-cookies", this.d); 
        if (httpConnection.getResponseCode() == 200) {
          this.d = httpConnection.getHeaderField("locid-cookies");
          arrayOfByte = dh.a(httpConnection);
        } 
        httpConnection.close();
      } 
      if (arrayOfByte != null)
        try {
          String[] arrayOfString;
          if (arrayOfByte != null && arrayOfByte.length > 3 && arrayOfByte[0] == 117 && arrayOfByte[1] == 56) {
            arrayOfString = dh.a(new String(arrayOfByte, 2, arrayOfByte.length - 2, "utf-8"), "\n");
          } else {
            arrayOfString = dh.a(dh.g(arrayOfByte, 0, arrayOfByte.length), "\n");
          } 
          if (arrayOfString.length < 2)
            throw new Exception(); 
          if (arrayOfString[1].length() > 0 && arrayOfString[1].charAt(0) == '﻿')
            arrayOfString[1] = arrayOfString[1].substring(1); 
          if (arrayOfString[0].startsWith("OK")) {
            Alert alert;
            (alert = new Alert("Help", arrayOfString[1], null, AlertType.ERROR)).setTimeout(-2);
            Jimm.d.setCurrent((Displayable)alert);
            return;
          } 
          if (arrayOfString[0].startsWith("HP")) {
            bc bc1 = new bc(str3);
            byte b1 = 1;
            if (arrayOfString[1].equals("HP"))
              b1++; 
            String str = "Help";
            byte b2 = 3;
            if (arrayOfString[b1].startsWith("[cap:")) {
              String str4;
              str = (str4 = arrayOfString[b1]).substring(5, str4.indexOf("]"));
              if (str4.indexOf("[list]") > 1)
                b2 = 2; 
            } 
            be be;
            (be = bc1.a = new be(str)).e(b2);
            bc1.b = arrayOfString;
            bc1.c = new String[arrayOfString.length];
            bc1.d = new String[arrayOfString.length];
            be.a(this);
            be.a(dw.f, bd.aa);
            be.a(dw.q, bd.Z);
            a(bc1);
            if (this.a == null)
              this.a = new Hashtable(); 
            this.a.put(str2, bc1);
            if (this.c != null && !paramString.equals(this.c.e))
              bc1.f = this.c; 
            this.c = bc1;
            this.c.a.b(Jimm.d);
          } 
          return;
        } catch (Exception exception) {
          null.printStackTrace();
          throw new Exception();
        }  
      throw new Exception();
    } catch (Exception exception) {
      Alert alert;
      (alert = new Alert("Help", "Error, Try later [" + paramString + "]", null, AlertType.ERROR)).setTimeout(-2);
      Jimm.d.setCurrent((Displayable)alert);
      return;
    } 
  }
  
  private static String a(String paramString, bc parambc) {
    String str;
    if (!paramString.startsWith("http://") && paramString.startsWith(":")) {
      if (paramString.startsWith(":http://")) {
        str = paramString.substring(1);
      } else {
        str = b(parambc.e) + paramString.substring(1);
      } 
    } else {
      str = paramString;
    } 
    return str;
  }
  
  private static String b(String paramString) {
    return paramString.substring(0, paramString.lastIndexOf('/') + 1);
  }
  
  private void a(bc parambc) {
    parambc.g = this.b;
    String[] arrayOfString = parambc.b;
    be be = parambc.a;
    byte b1 = 1;
    if (arrayOfString[1].startsWith("[cap:"))
      b1 = 2; 
    int i = arrayOfString.length;
    if (arrayOfString[i - 1].length() < 2)
      i--; 
    for (byte b2 = b1; b2 < i; b2++) {
      int j;
      if ((j = arrayOfString[b2].length()) > 0 && arrayOfString[b2].charAt(j - 1) == '\r')
        arrayOfString[b2] = arrayOfString[b2].substring(0, j - 1); 
      String str = arrayOfString[b2];
      byte b = -1;
      if (str.indexOf("[url:") >= 0)
        b = b2; 
      if (str.indexOf("[set:") >= 0)
        b = b2; 
      int k = em.d[1];
      byte b3 = 0;
      int m;
      while ((m = str.indexOf('[')) >= 0) {
        int n;
        if ((n = str.indexOf(']', m)) > 0) {
          String str1;
          if ((str1 = str.substring(0, m)).length() > 0)
            be.a(str1, k, b3, b); 
          String str2;
          if ((str2 = str.substring(m + 1, n)).startsWith("i:")) {
            I i1;
            try {
              int i2;
              i1 = bi.a((i2 = Integer.parseInt(str2.substring(2))) / 1000).a(i2 % 1000);
            } catch (Exception exception) {
              i1 = bi.d.a(4);
            } 
            if (i1 != null)
              be.a(i1, "", b); 
          } else if (str2.startsWith("color:")) {
            try {
              if (str2.charAt(6) == '#') {
                k = em.d[Integer.parseInt(str2.substring(7), 10)];
              } else {
                k = Integer.parseInt(str2.substring(6), 16);
              } 
            } catch (Exception exception) {}
          } else if (str2.startsWith("url:")) {
            parambc.c[b2] = a(str2.substring(4), parambc);
          } else if (str2.startsWith("set:")) {
            parambc.d[b2] = str2.substring(4);
          } else if (str2.equals("b")) {
            b3 = 1;
          } else if (str2.equals("i")) {
            b3 = 2;
          } else if (str2.equals("u")) {
            b3 = 4;
          } else if (str2.equals("p")) {
            b3 = 0;
          } else if (str2.equals("br")) {
            be.x(b);
          } else if (str2.equals("os")) {
            be.a("[", k, b3, b);
          } else if (str2.equals("cs")) {
            be.a("]", k, b3, b);
          } else if (str2.startsWith("val")) {
            try {
              String str3 = str2.substring(5);
              if (str2.startsWith("valt:")) {
                be.a("" + em.h(Integer.parseInt(str3)), k, b3, b);
              } else if (str2.startsWith("valb:")) {
                be.a("[" + (em.h(Integer.parseInt(str3)) ? "x" : "_") + "]", k, b3, b);
              } else if (str2.startsWith("vals:")) {
                be.a(em.d(Integer.parseInt(str3)), k, b3, b);
              } else if (str2.startsWith("vali:")) {
                be.a("" + em.f(Integer.parseInt(str3)), k, b3, b);
              } else if (str2.startsWith("valc:")) {
                String[] arrayOfString1;
                boolean bool = (em.f(Integer.parseInt((arrayOfString1 = dh.a(str3, ":"))[0])) == Integer.parseInt(arrayOfString1[1])) ? true : false;
                be.a(bool ? "[v]" : "[_]", k, b3, b);
              } else if (str2.startsWith("valr:")) {
                String[] arrayOfString1;
                boolean bool = em.d(Integer.parseInt((arrayOfString1 = dh.a(str3, ":"))[0])).equals(arrayOfString1[1]);
                be.a(bool ? "[v]" : "[_]", k, b3, b);
              } 
            } catch (Exception exception) {}
          } else {
            be.a("[" + str2 + "]", k ^ 0x808080, b3, b);
          } 
          str = str.substring(n + 1);
        } 
      } 
      if (str.length() > 0)
        be.a(str, k, b3, b); 
      be.x(b);
    } 
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == dw.f)
      if (this.c.f == null) {
        cy.f();
      } else {
        this.c = this.c.f;
        this.c.a.b(Jimm.d);
      }  
    int i;
    if (paramCommand == dw.q && (i = this.c.a.A()) >= 0) {
      if (this.c.d[i] != null && !"".equals(this.c.d[i])) {
        String[] arrayOfString;
        if ((arrayOfString = dh.a(this.c.d[i], "\t")).length == 1)
          arrayOfString = dh.a(this.c.d[i], "|"); 
        em.a(arrayOfString, 0, arrayOfString.length);
        this.b++;
        b(this.c);
      } 
      if (this.c.c[i] != null)
        if (this.c.c[i].startsWith("CMD:")) {
          if (this.c.c[i].equals("CMD:exit")) {
            this.a.clear();
            this.a = null;
            cy.f();
            return;
          } 
        } else {
          if (this.c.c[i].startsWith("PR:"))
            try {
              Jimm.c.platformRequest(this.c.c[i].substring(3));
              return;
            } catch (ConnectionNotFoundException connectionNotFoundException) {
              null.printStackTrace();
              return;
            }  
          if (this.c.c[i].startsWith("OF:")) {
            int j;
            if ((j = Integer.parseInt(this.c.c[i].substring(3))) < 100)
              cy.b(j % 100); 
            return;
          } 
          if (this.c.c[i].length() > 2 && this.c.c[i].charAt(2) == ':')
            return; 
          if (this.a.containsKey(this.c.c[i]) && !this.c.c[i].equals(this.c.e)) {
            bc bc1 = (bc)this.a.get(this.c.c[i]);
            this.c = bc1;
            b(bc1);
            this.c.a.b(Jimm.d);
            return;
          } 
          fb.a(23, this, this.c.c[i]);
        }  
    } 
  }
  
  private void b(bc parambc) {
    if (parambc.g != this.b) {
      be be;
      int i = (be = parambc.a).t;
      parambc.a.z();
      a(parambc);
      try {
        be.p(i);
        return;
      } catch (Exception exception) {}
    } 
  }
  
  class bc {
    public be a;
    
    public String[] b;
    
    public String[] c;
    
    public String[] d;
    
    public String e;
    
    public bc f;
    
    public int g = 0;
    
    public bc(bk this$0) {
      this.e = (String)this$0;
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\bk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */