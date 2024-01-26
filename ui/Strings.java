package ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class Strings {
  public static String lowerCase(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    paramString = paramString.toLowerCase();
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      if (c > 'Џ' && c < 'а') {
        stringBuffer.append((char)(c + 32));
      } else {
        stringBuffer.append(c);
      } 
    } 
    return stringBuffer.toString();
  }
  
  public static String[] explode(String paramString, char paramChar) {
    Vector vector = new Vector();
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      if (c == paramChar) {
        vector.addElement(stringBuffer.toString());
        stringBuffer.delete(0, stringBuffer.length());
      } else {
        stringBuffer.append(c);
      } 
    } 
    String[] arrayOfString = new String[vector.size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  public static byte[] getBytes(String paramString) {
    try {
      InputStream inputStream = "".getClass().getResourceAsStream(paramString);
      if (inputStream == null)
        return null; 
      byte[] arrayOfByte = new byte[inputStream.available()];
      inputStream.read(arrayOfByte);
      inputStream.close();
      return arrayOfByte;
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public static String readUTF(String paramString) {
    try {
      return new String(getBytes(paramString), "utf-8");
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static String readANSI(String paramString) {
    try {
      return new String(getBytes(paramString), "cp1251");
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar\\ui\Strings.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */