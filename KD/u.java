package KD;

import javax.microedition.lcdui.Image;

public final class u {
  public static Image a(String paramString) {
    Image image = null;
    try {
      image = Image.createImage(paramString);
    } catch (Exception exception) {}
    return image;
  }
  
  public static String b(String paramString) {
    if (paramString == null)
      return ""; 
    if (paramString.length() < 1)
      return ""; 
    int i = paramString.length();
    int j = paramString.length() - 1;
    while (true) {
      if ((((paramString.charAt(j) != '/') ? 1 : 0) & ((j > 0) ? 1 : 0)) != 0) {
        j--;
        continue;
      } 
      String str;
      j = (str = paramString.substring(j + 1, i)).length() - 1;
      while (true) {
        if ((((str.charAt(j) != '.') ? 1 : 0) & ((j > 0) ? 1 : 0)) != 0) {
          j--;
          continue;
        } 
        return str.substring(0, j);
      } 
      break;
    } 
  }
  
  public static String[] c(String paramString) {
    String[] arrayOfString = null;
    int i;
    if (paramString != null && (i = paramString.length()) > 0) {
      byte b1 = 0;
      int j;
      for (j = 0; j < i; j++) {
        if (paramString.charAt(j) == '|')
          b1++; 
      } 
      arrayOfString = new String[b1];
      j = 0;
      byte b2 = 0;
      for (byte b3 = 0; b3 < i; b3++) {
        if (paramString.charAt(b3) == '|') {
          arrayOfString[b2] = paramString.substring(j, b3);
          b2++;
          j = b3 + 1;
        } 
      } 
    } 
    return arrayOfString;
  }
  
  public static boolean a(String paramString1, String paramString2) {
    if (paramString1 == paramString2)
      return true; 
    if (paramString1.length() != paramString2.length())
      return false; 
    int i = paramString1.length();
    boolean bool = true;
    for (byte b = 0; b < i; b++) {
      if (paramString1.charAt(b) != paramString2.charAt(b)) {
        bool = false;
        break;
      } 
    } 
    return bool;
  }
  
  public static boolean d(String paramString) {
    if (paramString == null)
      return false; 
    boolean bool = false;
    String str = paramString.toLowerCase();
    for (byte b = 0; b < ag.b.length; b++) {
      if (str.endsWith(ag.b[b])) {
        bool = true;
        break;
      } 
    } 
    return bool;
  }
  
  public static String a(long paramLong) {
    String str = "00:00";
    if (paramLong > 0L) {
      str = "";
      long l1;
      long l2 = (l1 = paramLong / 1000000L) / 60L;
      long l3 = l1 % 60L;
      str = ((l2 < 10L) ? "0" : str) + l2;
      str = str + ":";
      str = ((l3 < 10L) ? "0" : str) + l3;
    } 
    return str;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\K\\u.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */