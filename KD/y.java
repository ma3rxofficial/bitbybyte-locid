package KD;

import java.util.Random;

public final class y {
  public String[] a;
  
  public long[] b;
  
  public int[] c;
  
  public String[] d;
  
  public String[] e;
  
  private i f;
  
  public y(i parami) {
    this.f = (parami != null) ? parami : new i(null);
  }
  
  public final String[] a() {
    if (this.a == null)
      return null; 
    String[] arrayOfString = new String[this.a.length - 1];
    for (byte b = 1; b < this.a.length; b++)
      arrayOfString[b - 1] = this.a[b]; 
    return arrayOfString;
  }
  
  public final int b() {
    return (this.a != null) ? (this.a.length - 1) : 0;
  }
  
  public final byte a(String paramString) {
    if (paramString == null)
      return 1; 
    if (this.a != null && paramString.length() < 1)
      return 2; 
    int j;
    if ((j = this.f.d.a(this.a, paramString)) != -1)
      return 3; 
    int k = 0;
    if (this.a != null)
      k = this.a.length; 
    this.a = af.a(this.a, k + 1);
    this.a[k] = paramString;
    this.b = af.a(this.b, k + 1);
    this.b[k] = System.currentTimeMillis();
    this.c = af.a(this.c, k + 1);
    this.c[k] = 0;
    this.d = af.a(this.d, k + 1);
    this.d[k] = "";
    this.e = af.a(this.e, k + 1);
    this.e[k] = "";
    return 0;
  }
  
  public final byte a(int paramInt, String paramString) {
    if (paramString == null)
      return 1; 
    if (paramString.length() < 1)
      return 2; 
    if ((((paramInt < 0) ? 1 : 0) | ((paramInt >= this.a.length) ? 1 : 0)) != 0)
      return 2; 
    int j;
    if ((j = this.f.d.a(this.a, paramString)) != -1)
      return 3; 
    this.a[paramInt] = paramString;
    return 0;
  }
  
  public final byte a(int paramInt) {
    if ((((paramInt < 1) ? 1 : 0) | ((paramInt >= this.a.length) ? 1 : 0)) != 0)
      return 1; 
    this.a = this.f.d.b(this.a, paramInt);
    this.b = this.f.d.b(this.b, paramInt);
    this.c = this.f.d.b(this.c, paramInt);
    this.d = this.f.d.b(this.d, paramInt);
    this.e = this.f.d.b(this.e, paramInt);
    return 0;
  }
  
  public final void a(int paramInt, String[] paramArrayOfString) {
    if (this.a == null)
      return; 
    if ((((paramInt < 0) ? 1 : 0) | ((paramInt >= this.a.length) ? 1 : 0)) != 0)
      return; 
    if (paramArrayOfString == null)
      return; 
    int j;
    if ((j = paramArrayOfString.length) < 1)
      return; 
    this.c[paramInt] = this.c[paramInt] + j;
    StringBuffer stringBuffer1 = new StringBuffer();
    StringBuffer stringBuffer2 = new StringBuffer();
    stringBuffer1.append(this.d[paramInt]);
    stringBuffer2.append(this.e[paramInt]);
    for (byte b = 0; b < j; b++) {
      String str = paramArrayOfString[b];
      int k;
      if ((k = this.f.d.a(str)) != -1) {
        stringBuffer1.append(k + "*");
      } else {
        this.f.b(str);
        stringBuffer1.append((this.f.d.a - 1) + "*");
      } 
      stringBuffer2.append(str + "*");
    } 
    this.d[paramInt] = stringBuffer1.toString();
    this.e[paramInt] = stringBuffer2.toString();
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (this.a == null)
      return; 
    if ((((paramInt1 < 0) ? 1 : 0) | ((paramInt1 >= this.a.length) ? 1 : 0)) != 0)
      return; 
    if ((((paramInt2 < 0) ? 1 : 0) | ((paramInt2 >= this.c[paramInt1]) ? 1 : 0)) != 0)
      return; 
    String str1 = this.e[paramInt1];
    String str2 = this.d[paramInt1];
    str1 = c(str1, paramInt2);
    str2 = c(str2, paramInt2);
    this.e[paramInt1] = str1;
    this.d[paramInt1] = str2;
    this.c[paramInt1] = this.c[paramInt1] - 1;
  }
  
  public final int a(int paramInt1, int paramInt2, int paramInt3) {
    if (this.a == null)
      return paramInt3; 
    if ((((paramInt1 < 0) ? 1 : 0) | ((paramInt1 >= this.a.length) ? 1 : 0)) != 0)
      return paramInt3; 
    int j;
    if ((j = paramInt3) < 0)
      j = 0; 
    int[] arrayOfInt = a(this.d[paramInt1], this.c[paramInt1]);
    String[] arrayOfString = b(this.e[paramInt1], this.c[paramInt1]);
    int k = arrayOfInt.length;
    if (paramInt2 == 6) {
      j = k - paramInt3 - 1;
      b(arrayOfInt);
      b(arrayOfString);
    } else if (paramInt2 == 5) {
      Random random = new Random();
      int m = 0;
      for (byte b = 0; b < k; b++) {
        if ((m = random.nextInt() % k) < 0)
          m *= -1; 
        int n = arrayOfInt[b];
        arrayOfInt[b] = arrayOfInt[m];
        arrayOfInt[m] = n;
        String str = arrayOfString[b];
        arrayOfString[b] = arrayOfString[m];
        arrayOfString[m] = str;
        if (m == j) {
        
        } else {
          continue;
        } 
        j = (b == j) ? m : b;
        continue;
      } 
    } else {
      String[] arrayOfString1 = new String[k];
      if (paramInt2 == 4) {
        for (byte b1 = 0; b1 < k; b1++)
          arrayOfString1[b1] = u.b(arrayOfString[b1]); 
      } else if (paramInt2 == 3) {
        for (byte b1 = 0; b1 < k; b1++)
          arrayOfString1[b1] = this.f.d.h[arrayOfInt[b1]]; 
      } else if (paramInt2 == 2) {
        for (byte b1 = 0; b1 < k; b1++)
          arrayOfString1[b1] = this.f.d.f[arrayOfInt[b1]]; 
      } else if (paramInt2 == 1) {
        arrayOfString1 = this.f.d.a(arrayOfInt);
      } 
      c c;
      int[] arrayOfInt1 = (c = new c()).a(arrayOfString1);
      int[] arrayOfInt2 = new int[k];
      String[] arrayOfString2 = new String[k];
      int m = j;
      for (byte b = 0; b < k; b++) {
        arrayOfInt2[b] = arrayOfInt[arrayOfInt1[b]];
        arrayOfString2[b] = arrayOfString[arrayOfInt1[b]];
        if (arrayOfInt1[b] == j)
          m = b; 
      } 
      j = m;
      arrayOfInt = arrayOfInt2;
      arrayOfString = arrayOfString2;
    } 
    this.d[paramInt1] = a(arrayOfInt);
    this.e[paramInt1] = a(arrayOfString);
    if (j < 0)
      j = 0; 
    return j;
  }
  
  public final void c() {
    if (this.a == null)
      return; 
    this.d = null;
    this.d = af.a(this.d, this.a.length);
    int j;
    for (j = 0; j < this.d.length; j++)
      this.d[j] = ""; 
    j = this.a.length;
    int k = 0;
    String[] arrayOfString = null;
    for (byte b = 0; b < j; b++) {
      if ((arrayOfString = b(this.e[b], this.c[b])) != null) {
        k = arrayOfString.length;
        StringBuffer stringBuffer;
        (stringBuffer = new StringBuffer()).append(this.d[b]);
        for (byte b1 = 0; b1 < k; b1++) {
          String str = arrayOfString[b1];
          int m;
          if ((m = this.f.d.a(str)) != -1) {
            stringBuffer.append(m + "*");
          } else {
            this.f.b(str);
            stringBuffer.append((this.f.d.a - 1) + "*");
          } 
        } 
        this.d[b] = stringBuffer.toString();
      } 
    } 
  }
  
  public final int[] b(int paramInt) {
    int[] arrayOfInt = null;
    if (this.a == null)
      return null; 
    if ((((paramInt < 0) ? 1 : 0) | ((paramInt >= this.a.length) ? 1 : 0)) != 0)
      return null; 
    int j = this.c[paramInt];
    return arrayOfInt = a(this.d[paramInt], j);
  }
  
  private static int[] a(String paramString, int paramInt) {
    if ((((paramString == null) ? 1 : 0) | ((paramInt < 1) ? 1 : 0)) != 0)
      return null; 
    int[] arrayOfInt = new int[paramInt];
    String str = null;
    byte b1 = 0;
    int j = 0;
    for (byte b2 = 0; b2 < paramString.length(); b2++) {
      if (paramString.charAt(b2) == '*') {
        str = paramString.substring(j, b2);
        arrayOfInt[b1] = Integer.valueOf(str).intValue();
        b1++;
        j = b2 + 1;
        if (b1 > paramInt)
          break; 
      } 
    } 
    return arrayOfInt;
  }
  
  private static String a(int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return ""; 
    StringBuffer stringBuffer = new StringBuffer();
    int j;
    if ((j = paramArrayOfint.length) < 1)
      return ""; 
    for (byte b = 0; b < j; b++)
      stringBuffer.append(Integer.toString(paramArrayOfint[b]) + '*'); 
    return stringBuffer.toString();
  }
  
  private static String[] b(String paramString, int paramInt) {
    if ((((paramString == null) ? 1 : 0) | ((paramInt < 1) ? 1 : 0)) != 0)
      return null; 
    String[] arrayOfString = new String[paramInt];
    String str = null;
    byte b1 = 0;
    int j = 0;
    for (byte b2 = 0; b2 < paramString.length(); b2++) {
      if (paramString.charAt(b2) == '*') {
        str = paramString.substring(j, b2);
        arrayOfString[b1] = str;
        b1++;
        j = b2 + 1;
        if (b1 > paramInt)
          break; 
      } 
    } 
    return arrayOfString;
  }
  
  private static String a(String[] paramArrayOfString) {
    String str = "";
    if (paramArrayOfString == null)
      return str; 
    int j;
    if ((j = paramArrayOfString.length) < 1)
      return str; 
    for (byte b = 0; b < j; b++)
      str = str + paramArrayOfString[b] + '*'; 
    return str;
  }
  
  private static String c(String paramString, int paramInt) {
    String str = paramString;
    int j = paramString.length();
    int k = 0;
    int m = 0;
    for (byte b = 0; b < j; b++) {
      if (paramString.charAt(b) == '*') {
        if (k == paramInt) {
          String str1 = paramString.substring(0, m);
          String str2 = paramString.substring(b + 1, j);
          str = str1 + str2;
          break;
        } 
        k++;
        m = b + 1;
      } 
    } 
    return str;
  }
  
  private static void b(int[] paramArrayOfint) {
    byte b = 0;
    for (int j = paramArrayOfint.length - 1; b < j; j--) {
      int k = paramArrayOfint[b];
      paramArrayOfint[b] = paramArrayOfint[j];
      paramArrayOfint[j] = k;
      b++;
    } 
  }
  
  private static void b(String[] paramArrayOfString) {
    byte b = 0;
    for (int j = paramArrayOfString.length - 1; b < j; j--) {
      String str = paramArrayOfString[b];
      paramArrayOfString[b] = paramArrayOfString[j];
      paramArrayOfString[j] = str;
      b++;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\y.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */