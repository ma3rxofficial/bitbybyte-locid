package KD;

public final class af implements Runnable {
  public int a = 0;
  
  public boolean[] b = null;
  
  public String[] c = null;
  
  public boolean[] d = null;
  
  public String[] e = null;
  
  public String[] f = null;
  
  public String[] g = null;
  
  public String[] h = null;
  
  public int[] i = null;
  
  public final void a(String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean) {
    if (paramArrayOfString1 == null)
      return; 
    if (paramArrayOfString1.length < 1)
      return; 
    ad ad = new ad();
    for (byte b = 0; b < paramArrayOfString1.length; b++) {
      ad.a(paramArrayOfString1[b], paramArrayOfString2);
      if (ad.b != null)
        for (byte b1 = 0; b1 < ad.b.length; b1++)
          a(ad.b[b1], paramBoolean);  
    } 
  }
  
  public final void a(String paramString, boolean paramBoolean) {
    int i = a(paramString);
    this.b = a(this.b, this.a + 1);
    this.b[this.a] = false;
    this.c = a(this.c, this.a + 1);
    this.c[this.a] = paramString;
    this.d = a(this.d, this.a + 1);
    this.d[this.a] = u.d(paramString);
    this.e = a(this.e, this.a + 1);
    this.e[this.a] = "";
    this.f = a(this.f, this.a + 1);
    this.f[this.a] = "";
    this.g = a(this.g, this.a + 1);
    this.g[this.a] = "";
    this.h = a(this.h, this.a + 1);
    this.h[this.a] = "";
    if (i != -1) {
      this.b[this.a] = this.b[i];
      this.c[this.a] = this.c[i];
      this.d[this.a] = this.d[i];
      this.e[this.a] = this.e[i];
      this.f[this.a] = this.f[i];
      this.g[this.a] = this.g[i];
      this.h[this.a] = this.h[i];
      if (((!this.b[this.a] ? 1 : 0) & paramBoolean) == 0) {
        this.a++;
        return;
      } 
    } 
    if (paramBoolean) {
      f f = new f();
      this.b[this.a] = f.a(paramString);
      if (this.b[this.a]) {
        this.d[this.a] = f.c;
        this.e[this.a] = f.d;
        this.f[this.a] = f.e;
        this.g[this.a] = f.f;
        this.h[this.a] = f.g;
      } 
      f.a();
    } 
    this.a++;
  }
  
  public final int a(String paramString) {
    return a(this.c, paramString);
  }
  
  public final String[] a() {
    if (this.a < 1)
      return null; 
    byte b1 = 0;
    String[] arrayOfString = null;
    String str = null;
    for (byte b2 = 0; b2 < this.a; b2++) {
      str = this.f[b2];
      if (a(arrayOfString, str) == -1)
        (arrayOfString = a(arrayOfString, ++b1))[b1 - 1] = str; 
    } 
    c c;
    (c = new c()).a(arrayOfString);
    for (byte b3 = 0; b3 < arrayOfString.length; b3++) {
      if (arrayOfString[b3].length() < 1) {
        if (b3 != 0) {
          str = arrayOfString[0];
          arrayOfString[0] = "Неизвестный исполнитель";
          arrayOfString[b3] = str;
          break;
        } 
        arrayOfString[0] = "Неизвестный исполнитель";
        break;
      } 
    } 
    System.gc();
    return arrayOfString;
  }
  
  public final String[] a(boolean paramBoolean) {
    String[] arrayOfString = new String[this.a];
    byte b;
    for (b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = (this.g[b].length() > 0) ? this.g[b] : u.b(this.c[b]); 
    this.i = null;
    if (paramBoolean) {
      c c = new c();
      this.i = c.a(arrayOfString);
    } else {
      this.i = new int[arrayOfString.length];
      for (b = 0; b < arrayOfString.length; b++)
        this.i[b] = b; 
    } 
    return arrayOfString;
  }
  
  public final String[] b() {
    if (this.a < 1)
      return null; 
    byte b1 = 0;
    String[] arrayOfString = null;
    String str = null;
    for (byte b2 = 0; b2 < this.a; b2++) {
      str = this.h[b2];
      if (a(arrayOfString, str) == -1)
        (arrayOfString = a(arrayOfString, ++b1))[b1 - 1] = str; 
    } 
    c c;
    (c = new c()).a(arrayOfString);
    for (byte b3 = 0; b3 < arrayOfString.length; b3++) {
      if (arrayOfString[b3].length() < 1) {
        if (b3 != 0) {
          str = arrayOfString[0];
          arrayOfString[0] = "Неизвестный альбом";
          arrayOfString[b3] = str;
          break;
        } 
        arrayOfString[0] = "Неизвестный альбом";
        break;
      } 
    } 
    System.gc();
    return arrayOfString;
  }
  
  public final String[] b(String paramString) {
    if (paramString == null)
      return null; 
    if (paramString == "Неизвестный исполнитель")
      paramString = ""; 
    int i;
    if ((i = a(this.f, paramString)) == -1)
      return null; 
    String[] arrayOfString;
    (arrayOfString = new String[1])[0] = this.h[i];
    String str = e(paramString);
    for (int j = i + 1; j < this.a; j++) {
      String str1;
      if (u.a(str1 = e(this.f[j]), str)) {
        String str2 = this.h[j];
        if (a(arrayOfString, str2) == -1)
          (arrayOfString = a(arrayOfString, arrayOfString.length + 1))[arrayOfString.length - 1] = str2; 
      } 
    } 
    c c;
    (c = new c()).a(arrayOfString);
    if (arrayOfString[0].length() < 1)
      arrayOfString[0] = "Неизвестный альбом"; 
    return arrayOfString = a(arrayOfString, "Все", 0);
  }
  
  public final int[] c(String paramString) {
    if (paramString == null)
      return null; 
    if (paramString == "Неизвестный исполнитель")
      paramString = ""; 
    int[] arrayOfInt = null;
    byte b1 = 0;
    String str = e(paramString);
    for (byte b2 = 0; b2 < this.a; b2++) {
      String str1;
      if (!this.d[b2] && u.a(str1 = e(this.f[b2]), str))
        (arrayOfInt = a(arrayOfInt, ++b1))[b1 - 1] = b2; 
    } 
    return arrayOfInt;
  }
  
  public final int[] a(String paramString1, String paramString2) {
    if (paramString1 == null)
      return null; 
    if (paramString2 == null)
      return null; 
    if (paramString1 == "Неизвестный исполнитель")
      paramString1 = ""; 
    if (paramString2 == "Неизвестный альбом")
      paramString2 = ""; 
    int[] arrayOfInt = null;
    byte b1 = 0;
    String str1 = e(paramString2);
    String str2 = e(paramString1);
    for (byte b2 = 0; b2 < this.a; b2++) {
      if (!this.d[b2] && this.f[b2].length() == str2.length()) {
        String str = e(this.f[b2]);
        if (this.h[b2].length() == str1.length()) {
          String str3 = e(this.h[b2]);
          if (u.a(str, str2) && u.a(str3, str1))
            (arrayOfInt = a(arrayOfInt, ++b1))[b1 - 1] = b2; 
        } 
      } 
    } 
    return arrayOfInt;
  }
  
  public final int[] d(String paramString) {
    if (paramString == null)
      return null; 
    int[] arrayOfInt = new int[0];
    if (paramString == "Неизвестный альбом")
      paramString = ""; 
    String str = e(paramString);
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.a; b2++) {
      if (!this.d[b2] && this.h[b2].length() == str.length()) {
        String str1 = e(this.h[b2]);
        if (u.a(str, str1))
          (arrayOfInt = a(arrayOfInt, ++b1))[b1 - 1] = b2; 
      } 
    } 
    return arrayOfInt;
  }
  
  public final String[] a(int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return null; 
    String[] arrayOfString = new String[paramArrayOfint.length];
    int i = 0;
    for (byte b = 0; b < arrayOfString.length; b++) {
      i = paramArrayOfint[b];
      arrayOfString[b] = (this.g[i].length() > 0) ? this.g[i] : u.b(this.c[i]);
    } 
    return arrayOfString;
  }
  
  public final void c() {
    if (this.c == null)
      return; 
    Thread thread;
    (thread = new Thread(this)).start();
    try {
      thread.join();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void run() {
    for (byte b = 0; b < this.a; b++) {
      if (!this.b[b]) {
        this.b[b] = true;
        f f;
        if ((f = new f()).a(this.c[b])) {
          this.d[b] = f.c;
          this.e[b] = f.d;
          this.f[b] = f.e;
          this.g[b] = f.f;
          this.h[b] = f.g;
        } 
        f.a();
      } 
    } 
  }
  
  public static String[] a(String[] paramArrayOfString, int paramInt) {
    if (paramInt < 1)
      return null; 
    String[] arrayOfString = null;
    if (paramArrayOfString != null) {
      if (paramArrayOfString.length == paramInt)
        return paramArrayOfString; 
      int i;
      if ((i = (arrayOfString = new String[paramInt]).length) > paramArrayOfString.length)
        i = paramArrayOfString.length; 
      for (byte b = 0; b < i; b++)
        arrayOfString[b] = paramArrayOfString[b]; 
    } else {
      arrayOfString = new String[paramInt];
    } 
    return arrayOfString;
  }
  
  private static boolean[] a(boolean[] paramArrayOfboolean, int paramInt) {
    if (paramInt < 1)
      return null; 
    boolean[] arrayOfBoolean = null;
    if (paramArrayOfboolean != null) {
      if (paramArrayOfboolean.length == paramInt)
        return paramArrayOfboolean; 
      int i;
      if ((i = (arrayOfBoolean = new boolean[paramInt]).length) > paramArrayOfboolean.length)
        i = paramArrayOfboolean.length; 
      for (byte b = 0; b < i; b++)
        arrayOfBoolean[b] = paramArrayOfboolean[b]; 
    } else {
      arrayOfBoolean = new boolean[paramInt];
    } 
    return arrayOfBoolean;
  }
  
  public static int[] a(int[] paramArrayOfint, int paramInt) {
    if (paramInt < 1)
      return null; 
    int[] arrayOfInt = null;
    if (paramArrayOfint != null) {
      if (paramArrayOfint.length == paramInt)
        return paramArrayOfint; 
      int i;
      if ((i = (arrayOfInt = new int[paramInt]).length) > paramArrayOfint.length)
        i = paramArrayOfint.length; 
      for (byte b = 0; b < i; b++)
        arrayOfInt[b] = paramArrayOfint[b]; 
    } else {
      arrayOfInt = new int[paramInt];
    } 
    return arrayOfInt;
  }
  
  public static long[] a(long[] paramArrayOflong, int paramInt) {
    if (paramInt < 1)
      return null; 
    long[] arrayOfLong = null;
    if (paramArrayOflong != null) {
      if (paramArrayOflong.length == paramInt)
        return paramArrayOflong; 
      int i;
      if ((i = (arrayOfLong = new long[paramInt]).length) > paramArrayOflong.length)
        i = paramArrayOflong.length; 
      for (byte b = 0; b < i; b++)
        arrayOfLong[b] = paramArrayOflong[b]; 
    } else {
      arrayOfLong = new long[paramInt];
    } 
    return arrayOfLong;
  }
  
  private String[] a(String[] paramArrayOfString, String paramString, int paramInt) {
    if (paramInt < 0)
      return null; 
    if ((((paramArrayOfString == null) ? 1 : 0) & ((paramInt > 0) ? 1 : 0)) != 0)
      return null; 
    if (paramInt > paramArrayOfString.length)
      return null; 
    String[] arrayOfString = null;
    int i = paramArrayOfString.length;
    arrayOfString = a(paramArrayOfString, ++i);
    for (int j = i - 1; j > paramInt; j--)
      arrayOfString[j] = arrayOfString[j - 1]; 
    arrayOfString[(paramArrayOfString == null) ? 0 : paramInt] = paramString;
    return arrayOfString;
  }
  
  public final String[] b(String[] paramArrayOfString, int paramInt) {
    if (paramArrayOfString == null)
      return null; 
    if (paramInt == paramArrayOfString.length - 1)
      return a(paramArrayOfString, paramArrayOfString.length - 1); 
    if (paramInt < 0)
      return paramArrayOfString; 
    if (paramInt > paramArrayOfString.length - 1)
      return paramArrayOfString; 
    String[] arrayOfString = new String[paramArrayOfString.length - 1];
    int i;
    for (i = 0; i < paramInt; i++)
      arrayOfString[i] = paramArrayOfString[i]; 
    for (i = paramInt + 1; i < paramArrayOfString.length; i++)
      arrayOfString[i - 1] = paramArrayOfString[i]; 
    return arrayOfString;
  }
  
  public final long[] b(long[] paramArrayOflong, int paramInt) {
    if (paramArrayOflong == null)
      return null; 
    if (paramInt == paramArrayOflong.length - 1)
      return a(paramArrayOflong, paramArrayOflong.length - 1); 
    if (paramInt < 0)
      return paramArrayOflong; 
    if (paramInt > paramArrayOflong.length - 1)
      return paramArrayOflong; 
    long[] arrayOfLong = new long[paramArrayOflong.length - 1];
    int i;
    for (i = 0; i < paramInt; i++)
      arrayOfLong[i] = paramArrayOflong[i]; 
    for (i = paramInt + 1; i < paramArrayOflong.length; i++)
      arrayOfLong[i - 1] = paramArrayOflong[i]; 
    return arrayOfLong;
  }
  
  public final int[] b(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint == null)
      return null; 
    if (paramInt == paramArrayOfint.length - 1)
      return a(paramArrayOfint, paramArrayOfint.length - 1); 
    if (paramInt < 0)
      return paramArrayOfint; 
    if (paramInt > paramArrayOfint.length - 1)
      return paramArrayOfint; 
    int[] arrayOfInt = new int[paramArrayOfint.length - 1];
    int i;
    for (i = 0; i < paramInt; i++)
      arrayOfInt[i] = paramArrayOfint[i]; 
    for (i = paramInt + 1; i < paramArrayOfint.length; i++)
      arrayOfInt[i - 1] = paramArrayOfint[i]; 
    return arrayOfInt;
  }
  
  private static String e(String paramString) {
    if (paramString == null)
      return null; 
    if (paramString == "")
      return ""; 
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c;
      if (((((c = paramString.charAt(b)) >= 'а') ? 1 : 0) & ((c <= 'я') ? 1 : 0)) != 0)
        c = (char)((short)c - 32); 
      stringBuffer.append(c);
    } 
    return stringBuffer.toString().toUpperCase();
  }
  
  public final int a(String[] paramArrayOfString, String paramString) {
    if (paramArrayOfString == null)
      return -1; 
    if (paramString == null)
      return -1; 
    byte b = -1;
    String str = e(paramString);
    for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
      if (str.length() == paramArrayOfString[b1].length() && u.a(str, e(paramArrayOfString[b1]))) {
        b = b1;
        break;
      } 
    } 
    return b;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\af.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */