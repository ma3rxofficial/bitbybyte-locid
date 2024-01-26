import java.util.Vector;

public final class z {
  public Vector a;
  
  public Vector b;
  
  public String a;
  
  public boolean a;
  
  public String b;
  
  public boolean b;
  
  public boolean c;
  
  public byte a;
  
  public boolean d;
  
  public int a;
  
  public String c;
  
  public Vector c;
  
  public boolean e;
  
  public String d;
  
  public boolean f;
  
  public int b = "";
  
  public r a = (r)"/";
  
  private String e;
  
  public static boolean g;
  
  public static z a;
  
  public static Object[] a;
  
  public static int c;
  
  public z(int paramInt1, int paramInt2) {
    this.a = -1;
    this.a = -1;
    this.c = new Vector(0);
    this.b = paramInt1;
    this.e = v.d(paramInt2);
  }
  
  public final String a() {
    String str;
    if (v.a((String)(str = v.b((String)this.a, '/') ? this.a.substring(1) : (String)this.a), '/'))
      str = str.substring(0, str.length() - 1); 
    return (str.length() == 0) ? this.e : str;
  }
  
  public final String b() {
    String str = "";
    if (this.a != null && this.a.length() > 2) {
      int i = this.a.lastIndexOf('/', this.a.length() - 2);
      str = this.a.substring(i + 1);
      if (i > 0) {
        this.a = (Object[])this.a.substring(0, i + 1);
      } else {
        this.a = (Object[])"/";
      } 
    } else {
      this.a = (Object[])"/";
    } 
    return str;
  }
  
  public final void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Z
    //   4: ifne -> 30
    //   7: aload_0
    //   8: iload_1
    //   9: invokevirtual a : (I)[Ljava/lang/Object;
    //   12: dup
    //   13: astore_1
    //   14: ifnull -> 30
    //   17: aload_0
    //   18: getfield c : Ljava/util/Vector;
    //   21: aload_1
    //   22: invokevirtual addElement : (Ljava/lang/Object;)V
    //   25: aload_0
    //   26: iconst_1
    //   27: putfield e : Z
    //   30: iconst_0
    //   31: istore_1
    //   32: iload_1
    //   33: aload_0
    //   34: getfield c : Ljava/util/Vector;
    //   37: invokevirtual size : ()I
    //   40: if_icmpge -> 170
    //   43: aload_0
    //   44: aload_0
    //   45: getfield c : Ljava/util/Vector;
    //   48: iload_1
    //   49: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   52: checkcast [Ljava/lang/Object;
    //   55: astore_3
    //   56: dup
    //   57: astore_2
    //   58: getfield a : Ljava/util/Vector;
    //   61: ifnull -> 68
    //   64: aload_3
    //   65: ifnonnull -> 71
    //   68: goto -> 164
    //   71: aload_2
    //   72: getfield a : Ljava/util/Vector;
    //   75: aload_3
    //   76: invokevirtual removeElement : (Ljava/lang/Object;)Z
    //   79: pop
    //   80: aload_2
    //   81: iconst_1
    //   82: putfield f : Z
    //   85: aload_3
    //   86: invokestatic a : ([Ljava/lang/Object;)B
    //   89: iconst_4
    //   90: if_icmpne -> 164
    //   93: aload_2
    //   94: getfield a : Ljava/lang/String;
    //   97: aload_3
    //   98: iconst_1
    //   99: aaload
    //   100: checkcast java/lang/String
    //   103: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   106: astore_3
    //   107: iconst_0
    //   108: istore #4
    //   110: iload #4
    //   112: aload_2
    //   113: getfield a : Ljava/util/Vector;
    //   116: invokevirtual size : ()I
    //   119: if_icmpge -> 164
    //   122: aload_2
    //   123: getfield a : Ljava/util/Vector;
    //   126: iload #4
    //   128: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   131: checkcast [Ljava/lang/Object;
    //   134: iconst_4
    //   135: aaload
    //   136: checkcast java/lang/String
    //   139: aload_3
    //   140: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   143: ifeq -> 158
    //   146: aload_2
    //   147: getfield a : Ljava/util/Vector;
    //   150: iload #4
    //   152: invokevirtual removeElementAt : (I)V
    //   155: iinc #4, -1
    //   158: iinc #4, 1
    //   161: goto -> 110
    //   164: iinc #1, 1
    //   167: goto -> 32
    //   170: aload_0
    //   171: invokevirtual a : ()V
    //   174: return
  }
  
  public final void a(Vector paramVector, Object[] paramArrayOfObject, int paramInt) {
    paramInt = a(paramInt);
    if (paramVector != null && paramInt != -1) {
      if (paramInt + 1 > paramVector.size())
        paramVector.setSize(paramInt + 1); 
      paramVector.setElementAt(paramArrayOfObject, paramInt);
      this.f = true;
    } 
  }
  
  public final int a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/Vector;
    //   4: ifnull -> 62
    //   7: iload_1
    //   8: iconst_m1
    //   9: if_icmpeq -> 62
    //   12: aload_0
    //   13: getfield a : Ljava/lang/String;
    //   16: ldc '/'
    //   18: invokevirtual equals : (Ljava/lang/Object;)Z
    //   21: ifeq -> 28
    //   24: iload_1
    //   25: goto -> 31
    //   28: iload_1
    //   29: iconst_1
    //   30: isub
    //   31: dup
    //   32: istore_1
    //   33: iflt -> 62
    //   36: iload_1
    //   37: aload_0
    //   38: getfield b : Ljava/util/Vector;
    //   41: invokevirtual size : ()I
    //   44: if_icmpge -> 62
    //   47: aload_0
    //   48: getfield b : Ljava/util/Vector;
    //   51: iload_1
    //   52: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   55: checkcast java/lang/Integer
    //   58: invokevirtual intValue : ()I
    //   61: ireturn
    //   62: iconst_m1
    //   63: ireturn
  }
  
  public final Object[] a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/Vector;
    //   4: ifnull -> 70
    //   7: aload_0
    //   8: getfield a : Ljava/util/Vector;
    //   11: ifnull -> 70
    //   14: iload_1
    //   15: iflt -> 70
    //   18: aload_0
    //   19: getfield a : Ljava/lang/String;
    //   22: ldc '/'
    //   24: invokevirtual equals : (Ljava/lang/Object;)Z
    //   27: ifeq -> 34
    //   30: iload_1
    //   31: goto -> 37
    //   34: iload_1
    //   35: iconst_1
    //   36: isub
    //   37: dup
    //   38: istore_1
    //   39: iconst_m1
    //   40: if_icmpne -> 45
    //   43: aconst_null
    //   44: areturn
    //   45: aload_0
    //   46: getfield a : Ljava/util/Vector;
    //   49: aload_0
    //   50: getfield b : Ljava/util/Vector;
    //   53: iload_1
    //   54: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   57: checkcast java/lang/Integer
    //   60: invokevirtual intValue : ()I
    //   63: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   66: checkcast [Ljava/lang/Object;
    //   69: areturn
    //   70: aconst_null
    //   71: areturn
  }
  
  public final void a(String paramString1, String paramString2) {
    if (this.a != null) {
      int i = this.a.size();
      Vector vector = new Vector(i);
      for (byte b = 0; b < i; b++) {
        String str;
        if ((str = (String)((Object[])this.a.elementAt(b))[4]).startsWith(paramString1))
          str = v.a(paramString2, str.substring(paramString1.length())); 
        Object[] arrayOfObject;
        (arrayOfObject = this.a.elementAt(b))[4] = str;
        vector.addElement(arrayOfObject);
      } 
      this.a = (Object[])vector;
      this.f = true;
    } 
  }
  
  private void b(String paramString1, String paramString2) {
    String[] arrayOfString1 = a(paramString1);
    String[] arrayOfString2 = a(paramString2);
    if (this.a != null) {
      int i = this.a.size();
      Vector vector = new Vector(i);
      for (byte b = 0; b < i; b++) {
        Object[] arrayOfObject;
        if ((arrayOfObject = this.a.elementAt(b))[1].equals(arrayOfString1[1]) && arrayOfObject[4].equals(arrayOfString1[0])) {
          arrayOfObject[1] = arrayOfString2[1];
          arrayOfObject[4] = arrayOfString2[0];
        } 
        vector.addElement(arrayOfObject);
      } 
      this.a = (Object[])vector;
      this.f = true;
    } 
  }
  
  public final void b(int paramInt) {
    if (this.a != null)
      for (byte b = 0; b < this.a.size(); b++) {
        if (a.a(this.a.elementAt(b)) == paramInt) {
          this.a.removeElementAt(b);
          this.f = true;
          b--;
        } 
      }  
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/util/Vector;
    //   4: ifnull -> 24
    //   7: aload_0
    //   8: getfield c : Ljava/util/Vector;
    //   11: invokevirtual removeAllElements : ()V
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield d : Ljava/lang/String;
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield e : Z
    //   24: return
  }
  
  public static boolean a(Vector paramVector, boolean paramBoolean) {
    boolean bool;
    paramBoolean = false;
    boolean bool1 = false;
    StringBuffer stringBuffer = new StringBuffer(0);
    for (byte b = 0; b < paramVector.size(); b++) {
      Object[] arrayOfObject = paramVector.elementAt(b);
      bool1 |= a(arrayOfObject);
      String str;
      if ((str = (String)arrayOfObject[4]) == null || str.length() == 0) {
        arrayOfObject[4] = "/";
        paramVector.setElementAt(arrayOfObject, b);
        paramBoolean = true;
      } 
      if (str.length() != 1) {
        String[] arrayOfString = v.a(str, 0, '/');
        stringBuffer.setLength(0);
        stringBuffer.ensureCapacity(str.length());
        for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
          stringBuffer.append(arrayOfString[b1]).append('/');
          String[] arrayOfString1;
          if (stringBuffer.length() != 1 && (arrayOfString1 = a(stringBuffer.toString()))[1].length() > 0 && !a(paramVector, arrayOfString1[1], arrayOfString1[0], -1)) {
            Object[] arrayOfObject1;
            (arrayOfObject1 = new Object[5])[0] = v.c(26210);
            arrayOfObject1[1] = arrayOfString1[1];
            arrayOfObject1[2] = null;
            arrayOfObject1[3] = new Byte((byte)4);
            arrayOfObject1[4] = arrayOfString1[0];
            paramVector.addElement(arrayOfObject1);
            bool = true;
          } 
        } 
      } 
    } 
    long l = System.currentTimeMillis() - v.a;
    g = (!bool1 || l > 345600000L || l <= 0L);
    return bool;
  }
  
  public static String[] a(String paramString) {
    String[] arrayOfString = new String[2];
    int i;
    if ((i = paramString.lastIndexOf('/', paramString.length() - (v.a(paramString, '/') ? 2 : 1))) == -1)
      i = paramString.length() - 1; 
    arrayOfString[0] = paramString.substring(0, i + 1);
    arrayOfString[1] = paramString.substring(i + 1);
    return arrayOfString;
  }
  
  public static boolean a(Vector paramVector, String paramString1, String paramString2, int paramInt) {
    int i = paramVector.size();
    while (--i >= 0) {
      Object[] arrayOfObject;
      if (i != paramInt && (a.a(arrayOfObject = paramVector.elementAt(i)) == 4 || a.a(arrayOfObject) == 6) && arrayOfObject[1].equals(paramString1) && arrayOfObject[4].equals(paramString2))
        return true; 
    } 
    return false;
  }
  
  public static Vector a(Vector paramVector, Object[] paramArrayOfObject, int paramInt) {
    Vector vector = new Vector();
    int i = paramVector.size();
    while (--i >= 0) {
      Object[] arrayOfObject;
      if (i != paramInt && a.a(arrayOfObject = paramVector.elementAt(i)) != 4 && a.a(arrayOfObject) != 6 && arrayOfObject[4].equals(paramArrayOfObject[4]) && (arrayOfObject[0].equals(paramArrayOfObject[0]) || arrayOfObject[1].equals(paramArrayOfObject[1])))
        vector.addElement(arrayOfObject); 
    } 
    return vector;
  }
  
  public final String a(String paramString1, String paramString2, boolean paramBoolean) {
    byte b = 1;
    String str = paramString1;
    StringBuffer stringBuffer = new StringBuffer(0);
    while (a((Vector)this.a, str, paramString2, -1)) {
      str = stringBuffer.append(v.h(paramString1)).append('[').append(b).append(']').append('/').toString();
      stringBuffer.setLength(0);
      b++;
    } 
    if (paramBoolean) {
      a(v.a(paramString2, paramString1), v.a(paramString2, str));
      b(v.a(paramString2, paramString1), v.a(paramString2, str));
    } 
    return str;
  }
  
  public final boolean a(int paramInt) {
    return (this == v.a && paramInt >= 0 && paramInt < this.a.size()) ? (!a(a(paramInt))) : true;
  }
  
  public static boolean a(Object[] paramArrayOfObject) {
    return (paramArrayOfObject != null && (a.a(paramArrayOfObject, 3) || a.a(paramArrayOfObject, 6) || a.a(paramArrayOfObject, 7)));
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\z.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */