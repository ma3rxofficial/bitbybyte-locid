import java.io.InputStream;
import java.util.Vector;

public final class et {
  private final String a;
  
  private final String[] b;
  
  private final String[] c;
  
  private int d;
  
  private static et[] e;
  
  private static String c(String paramString) {
    String str = "";
    try {
      InputStream inputStream;
      byte[] arrayOfByte = new byte[(inputStream = "".getClass().getResourceAsStream(paramString)).available()];
      inputStream.read(arrayOfByte);
      str = dh.b(arrayOfByte, 0, arrayOfByte.length, dh.f(arrayOfByte, 0, arrayOfByte.length));
      inputStream.close();
    } catch (Exception exception) {}
    return str;
  }
  
  private static String d(String paramString) {
    if (paramString.indexOf('\r') < 0)
      return paramString; 
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c;
      if ((c = paramString.charAt(b)) != '\000' && c != '\r')
        stringBuffer.append(c); 
    } 
    return stringBuffer.toString();
  }
  
  private static String e(String paramString) {
    char[] arrayOfChar = paramString.toCharArray();
    for (int i = paramString.length() - 1; i >= 0; i--)
      arrayOfChar[i] = a(arrayOfChar[i]); 
    String str;
    return (str = new String(arrayOfChar)).equals(paramString) ? paramString : str;
  }
  
  private static String f(String paramString) {
    char[] arrayOfChar = paramString.toCharArray();
    for (int i = paramString.length() - 1; i >= 0; i--)
      arrayOfChar[i] = b(arrayOfChar[i]); 
    String str;
    return (str = new String(arrayOfChar)).equals(paramString) ? paramString : str;
  }
  
  public static char a(char paramChar) {
    return (((paramChar = Character.toLowerCase(paramChar)) >= 'A' && paramChar <= 'Z') || (paramChar >= 'À' && paramChar <= 'Ö') || (paramChar >= 'Ø' && paramChar <= 'Þ') || (paramChar >= 'Ѐ' && paramChar <= 'Я')) ? ((paramChar <= 'Z' || (paramChar >= 'А' && paramChar <= 'Я')) ? (char)(paramChar + 32) : ((paramChar < 'А') ? (char)(paramChar + 80) : (char)(paramChar + 32))) : paramChar;
  }
  
  private static char b(char paramChar) {
    return (((paramChar = Character.toUpperCase(paramChar)) >= 'a' && paramChar <= 'z') || (paramChar >= 'ß' && paramChar <= 'ö') || (paramChar >= 'ø' && paramChar <= 'ÿ') || (paramChar >= 'а' && paramChar <= 'џ')) ? ((paramChar <= 'z' || (paramChar >= 'а' && paramChar <= 'я')) ? (char)(paramChar - 32) : ((paramChar > 'Я') ? (char)(paramChar - 80) : (char)(paramChar - 32))) : paramChar;
  }
  
  private String g(String paramString) {
    String str = e(paramString);
    for (int i = this.b.length - 1; i >= 0; i--) {
      if (this.b[i].equals(paramString))
        return this.c[i]; 
      if (this.b[i].equals(str))
        return f(this.c[i]); 
    } 
    return null;
  }
  
  private String h(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < paramString.length(); i += str.length()) {
      String str = "";
      for (int j = Math.min(i + this.d, paramString.length()); j > i; j--) {
        str = paramString.substring(i, j);
        String str1;
        if ((str1 = g(str)) != null) {
          stringBuffer.append(str1);
          break;
        } 
        if (str.length() == 1) {
          stringBuffer.append(str);
          break;
        } 
      } 
    } 
    return stringBuffer.toString();
  }
  
  private static String[] a(Vector paramVector) {
    String[] arrayOfString = new String[paramVector.size()];
    paramVector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  private et(String paramString, Vector paramVector1, Vector paramVector2) {
    this.a = paramString;
    this.b = a(paramVector1);
    this.c = a(paramVector2);
    this.d = 0;
    for (byte b = 0; b < this.b.length; b++)
      this.d = Math.max(this.d, this.b[b].length()); 
  }
  
  private static void a(String paramString, Vector paramVector) {
    byte b1 = 0;
    int i = 0;
    String str = null;
    Vector vector1 = new Vector();
    Vector vector2 = new Vector();
    for (byte b2 = 0; b2 < paramString.length(); b2++) {
      char c = paramString.charAt(b2);
      switch (b1) {
        case false:
          if (c == '[') {
            if (str != null) {
              paramVector.addElement(new et(str, vector1, vector2));
              vector1.removeAllElements();
              vector2.removeAllElements();
              str = null;
            } 
            i = b2 + 1;
            b1 = 1;
            break;
          } 
          if (c == '#' || c == ';') {
            b1 = 6;
            break;
          } 
          if (c == '\n' || c == '\r' || c == ' ' || c == '\t')
            break; 
          i = b2;
          b1 = 2;
          break;
        case true:
          if (c == ']') {
            if ((str = paramString.substring(i, b2).trim()).length() == 0)
              str = null; 
            i = b2 + 1;
            b1 = 0;
          } 
          break;
        case true:
          if (c == '=') {
            vector1.addElement(paramString.substring(i, b2).trim());
            i = b2 + 1;
            b1 = 3;
          } 
          break;
        case true:
          if (c == '\n' || c == '#' || c == ';') {
            vector2.addElement(paramString.substring(i, b2).trim());
            i = b2;
            b1 = 0;
          } 
          break;
        case true:
          if (c == '\n')
            b1 = 0; 
          break;
      } 
    } 
    if (str != null)
      paramVector.addElement(new et(str, vector1, vector2)); 
  }
  
  private static void a() {
    Vector vector = new Vector();
    try {
      String str = c("/replaces.txt");
      a(d(str.trim() + '\n'), vector);
    } catch (Exception exception) {}
    e = new et[vector.size()];
    vector.copyInto((Object[])e);
  }
  
  private static String a(String paramString1, String paramString2) {
    for (byte b = 0; b < e.length; b++) {
      if (paramString1.equals((e[b]).a))
        return e[b].h(paramString2); 
    } 
    return paramString2;
  }
  
  public static String a(String paramString) {
    return a("detransliterate", paramString);
  }
  
  public static String b(String paramString) {
    return a("transliterate", paramString);
  }
  
  static {
    a();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\et.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */