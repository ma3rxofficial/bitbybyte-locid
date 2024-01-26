package KD;

public final class c {
  private static String a(String paramString) {
    if (paramString == null)
      return null; 
    if (paramString == "")
      return ""; 
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c1;
      if (((((c1 = paramString.charAt(b)) >= 'а') ? 1 : 0) & ((c1 <= 'я') ? 1 : 0)) != 0)
        c1 = (char)((short)c1 - 32); 
      stringBuffer.append(c1);
    } 
    return stringBuffer.toString().toUpperCase();
  }
  
  private String[] b(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return null; 
    String[] arrayOfString = new String[paramArrayOfString.length];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = a(paramArrayOfString[b]); 
    return arrayOfString;
  }
  
  public final int[] a(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return null; 
    int[] arrayOfInt = a(paramArrayOfString.length);
    String[] arrayOfString1 = paramArrayOfString;
    String[] arrayOfString2 = b(paramArrayOfString);
    int i = paramArrayOfString.length;
    for (byte b = 0; b < i; b++) {
      int j = b;
      String str;
      if ((str = arrayOfString2[b]).length() != 0) {
        for (int k = b + 1; k < i; k++) {
          String str1;
          if ((str1 = arrayOfString2[k]).length() == 0) {
            j = k;
            break;
          } 
          if (str.charAt(0) > str1.charAt(0)) {
            j = k;
            str = arrayOfString2[k];
          } 
        } 
      } else {
        j = b;
      } 
      a(arrayOfString1, b, j);
      a(arrayOfInt, b, j);
      if (b > 0) {
        j = b;
        str = a(arrayOfString1[j]);
        String str1 = a(arrayOfString1[j - 1]);
        while ((a(str, str1) & ((--j >= 0) ? 1 : 0)) != 0) {
          a(arrayOfString1, j, j + 1);
          a(arrayOfInt, j, j + 1);
          if (j > 0) {
            str = a(arrayOfString1[j]);
            str1 = a(arrayOfString1[j - 1]);
          } 
          j--;
        } 
      } 
    } 
    return arrayOfInt;
  }
  
  private static int a(int paramInt1, int paramInt2) {
    return (paramInt1 > paramInt2) ? paramInt2 : paramInt1;
  }
  
  private static int[] a(int paramInt) {
    int[] arrayOfInt = new int[paramInt];
    for (byte b = 0; b < paramInt; b++)
      arrayOfInt[b] = b; 
    return arrayOfInt;
  }
  
  private static void a(String[] paramArrayOfString, int paramInt1, int paramInt2) {
    String str = paramArrayOfString[paramInt2];
    paramArrayOfString[paramInt2] = paramArrayOfString[paramInt1];
    paramArrayOfString[paramInt1] = str;
  }
  
  private static void a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int i = paramArrayOfint[paramInt2];
    paramArrayOfint[paramInt2] = paramArrayOfint[paramInt1];
    paramArrayOfint[paramInt1] = i;
  }
  
  private boolean a(String paramString1, String paramString2) {
    int i = paramString1.length();
    int j = paramString2.length();
    int k = a(i, j);
    for (byte b = 0; b < k; b++) {
      if (paramString1.charAt(b) > paramString2.charAt(b))
        return false; 
      if (paramString1.charAt(b) < paramString2.charAt(b))
        return true; 
    } 
    return (i < j);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */