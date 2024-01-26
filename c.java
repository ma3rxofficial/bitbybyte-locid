import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class c implements ag {
  private String a;
  
  private String b;
  
  private static Vector a;
  
  private int a = -1;
  
  public static void a() {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnull -> 16
    //   6: getstatic c.a : Ljava/util/Vector;
    //   9: invokevirtual removeAllElements : ()V
    //   12: aconst_null
    //   13: putstatic c.a : Ljava/util/Vector;
    //   16: return
  }
  
  public c() {
    if (a == null)
      f(); 
    this.a = "";
    this.b = "";
  }
  
  public final void a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield a : Ljava/lang/String;
    //   5: aload_0
    //   6: getfield a : Ljava/lang/String;
    //   9: ldc 'file:///'
    //   11: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   14: ifeq -> 30
    //   17: aload_0
    //   18: aload_0
    //   19: getfield a : Ljava/lang/String;
    //   22: bipush #8
    //   24: invokevirtual substring : (I)Ljava/lang/String;
    //   27: putfield a : Ljava/lang/String;
    //   30: aload_0
    //   31: aload_0
    //   32: getfield a : Ljava/lang/String;
    //   35: invokestatic g : (Ljava/lang/String;)Ljava/lang/String;
    //   38: iconst_5
    //   39: invokevirtual substring : (I)Ljava/lang/String;
    //   42: putfield b : Ljava/lang/String;
    //   45: return
  }
  
  public final String a() {
    return this.a;
  }
  
  public final void b() {}
  
  public final long a() {
    RecordStore recordStore;
    this = null;
    long l = -1L;
    try {
      l = (recordStore = RecordStore.openRecordStore("FatRms", false)).getSizeAvailable();
    } catch (RecordStoreException recordStoreException) {
    
    } finally {
      v.a(this);
    } 
    return l;
  }
  
  public final boolean a() {
    return a(new byte[0]);
  }
  
  public final boolean a(boolean paramBoolean) {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: aload_0
    //   10: getfield a : Ljava/lang/String;
    //   13: iconst_5
    //   14: invokevirtual substring : (I)Ljava/lang/String;
    //   17: astore_1
    //   18: aload_0
    //   19: invokespecial h : ()Z
    //   22: ifeq -> 151
    //   25: iconst_0
    //   26: istore_3
    //   27: iconst_0
    //   28: istore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: getstatic c.a : Ljava/util/Vector;
    //   36: iload_3
    //   37: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   40: checkcast [Ljava/lang/Object;
    //   43: iconst_1
    //   44: aaload
    //   45: checkcast java/lang/String
    //   48: dup
    //   49: astore_2
    //   50: aload_1
    //   51: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   54: ifeq -> 127
    //   57: aload_0
    //   58: aload_2
    //   59: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   62: dup
    //   63: astore_2
    //   64: ldc '-'
    //   66: invokevirtual equals : (Ljava/lang/Object;)Z
    //   69: ifne -> 127
    //   72: aload_2
    //   73: invokestatic a : (Ljava/lang/String;)Z
    //   76: istore #4
    //   78: aload_0
    //   79: getfield a : I
    //   82: iconst_m1
    //   83: if_icmpeq -> 118
    //   86: aload_0
    //   87: getfield a : I
    //   90: getstatic c.a : Ljava/util/Vector;
    //   93: invokevirtual size : ()I
    //   96: if_icmpge -> 118
    //   99: getstatic c.a : Ljava/util/Vector;
    //   102: aload_0
    //   103: getfield a : I
    //   106: invokevirtual removeElementAt : (I)V
    //   109: getstatic c.a : Ljava/util/Vector;
    //   112: invokevirtual trimToSize : ()V
    //   115: iinc #3, -1
    //   118: iconst_1
    //   119: istore #5
    //   121: iload #4
    //   123: iconst_1
    //   124: iand
    //   125: istore #4
    //   127: iinc #3, 1
    //   130: iload_3
    //   131: getstatic c.a : Ljava/util/Vector;
    //   134: invokevirtual size : ()I
    //   137: if_icmplt -> 33
    //   140: iload #5
    //   142: ifeq -> 148
    //   145: invokestatic g : ()V
    //   148: iload #4
    //   150: ireturn
    //   151: aload_0
    //   152: aload_1
    //   153: invokespecial d : (Ljava/lang/String;)Z
    //   156: ireturn
    //   157: pop
    //   158: iconst_0
    //   159: ireturn
    // Exception table:
    //   from	to	target	type
    //   18	156	157	java/lang/Throwable
  }
  
  public final boolean a(String paramString) {
    return d(paramString);
  }
  
  private boolean d(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   7: dup
    //   8: astore_1
    //   9: ldc '-'
    //   11: invokevirtual equals : (Ljava/lang/Object;)Z
    //   14: ifne -> 60
    //   17: aload_1
    //   18: invokestatic a : (Ljava/lang/String;)Z
    //   21: istore_2
    //   22: aload_0
    //   23: getfield a : I
    //   26: iconst_m1
    //   27: if_icmpeq -> 56
    //   30: aload_0
    //   31: getfield a : I
    //   34: getstatic c.a : Ljava/util/Vector;
    //   37: invokevirtual size : ()I
    //   40: if_icmpge -> 56
    //   43: getstatic c.a : Ljava/util/Vector;
    //   46: aload_0
    //   47: getfield a : I
    //   50: invokevirtual removeElementAt : (I)V
    //   53: invokestatic g : ()V
    //   56: iload_2
    //   57: iconst_1
    //   58: iand
    //   59: istore_2
    //   60: iload_2
    //   61: ireturn
  }
  
  public final long a(boolean paramBoolean) {
    long l = 0L;
    if (!b() || !h())
      return -1L; 
    try {
      String[] arrayOfString;
      int i = (arrayOfString = a()).length;
      while (--i >= 0) {
        String str = arrayOfString[i];
        a(v.a("RMS:/", this.b, str));
        if (str.charAt(str.length() - 1) != '/')
          l += b(); 
      } 
    } catch (Exception exception) {
      l = -1L;
    } 
    return l;
  }
  
  public final boolean b() {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: aconst_null
    //   10: astore_1
    //   11: iconst_0
    //   12: istore_2
    //   13: aload_0
    //   14: getfield a : Ljava/lang/String;
    //   17: iconst_5
    //   18: invokevirtual substring : (I)Ljava/lang/String;
    //   21: astore_3
    //   22: aload_0
    //   23: aload_3
    //   24: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   27: dup
    //   28: astore_0
    //   29: ldc '-'
    //   31: invokevirtual equals : (Ljava/lang/Object;)Z
    //   34: ifeq -> 39
    //   37: iconst_0
    //   38: ireturn
    //   39: aload_0
    //   40: iconst_0
    //   41: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   44: dup
    //   45: astore_1
    //   46: ifnull -> 53
    //   49: iconst_1
    //   50: goto -> 54
    //   53: iconst_0
    //   54: istore_2
    //   55: aload_1
    //   56: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   59: pop
    //   60: goto -> 80
    //   63: pop
    //   64: aload_1
    //   65: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   68: pop
    //   69: goto -> 80
    //   72: astore_0
    //   73: aload_1
    //   74: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   77: pop
    //   78: aload_0
    //   79: athrow
    //   80: iload_2
    //   81: ireturn
    // Exception table:
    //   from	to	target	type
    //   39	55	63	javax/microedition/rms/RecordStoreException
    //   39	55	72	finally
  }
  
  public final long b() {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: aconst_null
    //   10: astore_1
    //   11: aconst_null
    //   12: astore_2
    //   13: ldc2_w -1
    //   16: lstore_3
    //   17: aload_0
    //   18: getfield a : Ljava/lang/String;
    //   21: iconst_5
    //   22: invokevirtual substring : (I)Ljava/lang/String;
    //   25: astore #5
    //   27: aload_0
    //   28: aload #5
    //   30: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   33: dup
    //   34: astore_0
    //   35: ldc '-'
    //   37: invokevirtual equals : (Ljava/lang/Object;)Z
    //   40: ifeq -> 47
    //   43: ldc2_w -1
    //   46: lreturn
    //   47: aload_0
    //   48: iconst_0
    //   49: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   52: dup
    //   53: astore_1
    //   54: aconst_null
    //   55: aconst_null
    //   56: iconst_0
    //   57: invokevirtual enumerateRecords : (Ljavax/microedition/rms/RecordFilter;Ljavax/microedition/rms/RecordComparator;Z)Ljavax/microedition/rms/RecordEnumeration;
    //   60: dup
    //   61: astore_0
    //   62: invokeinterface hasNextElement : ()Z
    //   67: ifeq -> 106
    //   70: aload_0
    //   71: invokeinterface nextRecord : ()[B
    //   76: astore_0
    //   77: new java/io/ByteArrayInputStream
    //   80: dup
    //   81: aload_0
    //   82: invokespecial <init> : ([B)V
    //   85: astore_0
    //   86: new java/io/DataInputStream
    //   89: dup
    //   90: aload_0
    //   91: invokespecial <init> : (Ljava/io/InputStream;)V
    //   94: dup
    //   95: astore_2
    //   96: invokevirtual readUnsignedByte : ()I
    //   99: pop
    //   100: aload_2
    //   101: invokevirtual readInt : ()I
    //   104: i2l
    //   105: lstore_3
    //   106: aload_2
    //   107: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   110: pop
    //   111: aload_1
    //   112: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   115: pop
    //   116: goto -> 146
    //   119: pop
    //   120: aload_2
    //   121: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   124: pop
    //   125: aload_1
    //   126: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   129: pop
    //   130: goto -> 146
    //   133: astore_0
    //   134: aload_2
    //   135: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   138: pop
    //   139: aload_1
    //   140: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   143: pop
    //   144: aload_0
    //   145: athrow
    //   146: lload_3
    //   147: lreturn
    // Exception table:
    //   from	to	target	type
    //   47	106	119	java/lang/Exception
    //   47	106	133	finally
  }
  
  private boolean h() {
    return !ai.e(this.a);
  }
  
  public final boolean c() {
    return false;
  }
  
  public final boolean d() {
    return true;
  }
  
  public final boolean e() {
    return true;
  }
  
  public final long c() {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: aconst_null
    //   10: astore_1
    //   11: ldc2_w -1
    //   14: lstore_2
    //   15: aload_0
    //   16: getfield a : Ljava/lang/String;
    //   19: iconst_5
    //   20: invokevirtual substring : (I)Ljava/lang/String;
    //   23: astore #4
    //   25: aload_0
    //   26: aload #4
    //   28: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   31: dup
    //   32: astore_0
    //   33: ldc '-'
    //   35: invokevirtual equals : (Ljava/lang/Object;)Z
    //   38: ifeq -> 45
    //   41: ldc2_w -1
    //   44: lreturn
    //   45: aload_0
    //   46: iconst_0
    //   47: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   50: dup
    //   51: astore_1
    //   52: invokevirtual getLastModified : ()J
    //   55: lstore_2
    //   56: aload_1
    //   57: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   60: pop
    //   61: goto -> 81
    //   64: pop
    //   65: aload_1
    //   66: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   69: pop
    //   70: goto -> 81
    //   73: astore_0
    //   74: aload_1
    //   75: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   78: pop
    //   79: aload_0
    //   80: athrow
    //   81: lload_2
    //   82: lreturn
    // Exception table:
    //   from	to	target	type
    //   45	56	64	javax/microedition/rms/RecordStoreException
    //   45	56	73	finally
  }
  
  public final String[] a() {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: iconst_0
    //   10: istore_2
    //   11: getstatic c.a : Ljava/util/Vector;
    //   14: invokevirtual size : ()I
    //   17: dup
    //   18: istore_3
    //   19: anewarray java/lang/String
    //   22: astore_1
    //   23: iconst_0
    //   24: istore #6
    //   26: iload #6
    //   28: iload_3
    //   29: if_icmpge -> 192
    //   32: getstatic c.a : Ljava/util/Vector;
    //   35: iload #6
    //   37: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   40: checkcast [Ljava/lang/Object;
    //   43: iconst_1
    //   44: aaload
    //   45: checkcast java/lang/String
    //   48: dup
    //   49: astore #4
    //   51: invokestatic g : (Ljava/lang/String;)Ljava/lang/String;
    //   54: aload_0
    //   55: getfield b : Ljava/lang/String;
    //   58: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   61: ifeq -> 186
    //   64: aload #4
    //   66: aload_0
    //   67: getfield b : Ljava/lang/String;
    //   70: invokevirtual length : ()I
    //   73: invokevirtual substring : (I)Ljava/lang/String;
    //   76: dup
    //   77: astore #5
    //   79: bipush #47
    //   81: invokevirtual indexOf : (I)I
    //   84: dup
    //   85: istore #7
    //   87: iconst_m1
    //   88: if_icmpne -> 96
    //   91: aload #5
    //   93: goto -> 106
    //   96: aload #5
    //   98: iconst_0
    //   99: iload #7
    //   101: iconst_1
    //   102: iadd
    //   103: invokevirtual substring : (II)Ljava/lang/String;
    //   106: dup
    //   107: astore #4
    //   109: invokevirtual length : ()I
    //   112: ifle -> 186
    //   115: aload_1
    //   116: iload_2
    //   117: aload #4
    //   119: astore #8
    //   121: istore #7
    //   123: astore #5
    //   125: aload #8
    //   127: ifnull -> 137
    //   130: aload #5
    //   132: arraylength
    //   133: iconst_1
    //   134: if_icmpge -> 141
    //   137: iconst_0
    //   138: goto -> 175
    //   141: iinc #7, -1
    //   144: iload #7
    //   146: iflt -> 174
    //   149: aload #5
    //   151: iload #7
    //   153: aaload
    //   154: ifnull -> 141
    //   157: aload #8
    //   159: aload #5
    //   161: iload #7
    //   163: aaload
    //   164: invokevirtual equals : (Ljava/lang/Object;)Z
    //   167: ifeq -> 141
    //   170: iconst_1
    //   171: goto -> 175
    //   174: iconst_0
    //   175: ifne -> 186
    //   178: aload_1
    //   179: iload_2
    //   180: iinc #2, 1
    //   183: aload #4
    //   185: aastore
    //   186: iinc #6, 1
    //   189: goto -> 26
    //   192: iload_2
    //   193: anewarray java/lang/String
    //   196: astore #6
    //   198: aload_1
    //   199: iconst_0
    //   200: aload #6
    //   202: iconst_0
    //   203: iload_2
    //   204: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   207: aload #6
    //   209: areturn
  }
  
  public final String[] b() {
    String[] arrayOfString;
    (arrayOfString = new String[1])[0] = "RMS:/";
    return this;
  }
  
  public final boolean f() {
    String str1;
    Object[] arrayOfObject;
    if (a == null)
      f(); 
    RecordStore recordStore = null;
    String str2 = ai.g(this.a).substring(5);
    if (a(str2).equals("-")) {
      str1 = String.valueOf(System.currentTimeMillis());
      (arrayOfObject = new Object[2])[0] = this;
      arrayOfObject[1] = str2;
    } else {
      return true;
    } 
    try {
      if ((recordStore = RecordStore.openRecordStore(this, true)) == null)
        return false; 
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      (new DataOutputStream(this)).writeByte(70);
      recordStore.addRecord(toByteArray(), 0, size());
      boolean bool = true;
    } catch (Throwable throwable) {
    
    } finally {
      str1 = null;
      v.a(recordStore);
    } 
    return str1;
  }
  
  public final byte[] a() {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: aconst_null
    //   10: astore_1
    //   11: aconst_null
    //   12: astore_2
    //   13: aload_0
    //   14: getfield a : Ljava/lang/String;
    //   17: iconst_5
    //   18: invokevirtual substring : (I)Ljava/lang/String;
    //   21: astore_3
    //   22: aload_0
    //   23: aload_3
    //   24: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   27: dup
    //   28: astore_0
    //   29: ldc '-'
    //   31: invokevirtual equals : (Ljava/lang/Object;)Z
    //   34: ifeq -> 39
    //   37: aconst_null
    //   38: areturn
    //   39: aload_0
    //   40: iconst_0
    //   41: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   44: dup
    //   45: astore_1
    //   46: invokevirtual getSizeAvailable : ()I
    //   49: pop
    //   50: aload_1
    //   51: aconst_null
    //   52: aconst_null
    //   53: iconst_0
    //   54: invokevirtual enumerateRecords : (Ljavax/microedition/rms/RecordFilter;Ljavax/microedition/rms/RecordComparator;Z)Ljavax/microedition/rms/RecordEnumeration;
    //   57: dup
    //   58: astore_0
    //   59: invokeinterface hasNextElement : ()Z
    //   64: ifeq -> 135
    //   67: aload_0
    //   68: invokeinterface nextRecord : ()[B
    //   73: astore_0
    //   74: new java/io/ByteArrayInputStream
    //   77: dup
    //   78: aload_0
    //   79: invokespecial <init> : ([B)V
    //   82: astore_0
    //   83: new java/io/DataInputStream
    //   86: dup
    //   87: aload_0
    //   88: invokespecial <init> : (Ljava/io/InputStream;)V
    //   91: dup
    //   92: astore_0
    //   93: invokevirtual readUnsignedByte : ()I
    //   96: bipush #80
    //   98: if_icmpeq -> 108
    //   101: aload_1
    //   102: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   105: pop
    //   106: aconst_null
    //   107: areturn
    //   108: aload_0
    //   109: invokevirtual readInt : ()I
    //   112: dup
    //   113: istore_3
    //   114: newarray byte
    //   116: astore_2
    //   117: aload_0
    //   118: aload_2
    //   119: invokevirtual read : ([B)I
    //   122: iload_3
    //   123: if_icmpne -> 135
    //   126: aload_2
    //   127: astore_0
    //   128: aload_1
    //   129: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   132: pop
    //   133: aload_0
    //   134: areturn
    //   135: aload_1
    //   136: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   139: pop
    //   140: goto -> 160
    //   143: pop
    //   144: aload_1
    //   145: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   148: pop
    //   149: goto -> 160
    //   152: astore_0
    //   153: aload_1
    //   154: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   157: pop
    //   158: aload_0
    //   159: athrow
    //   160: aload_2
    //   161: areturn
    // Exception table:
    //   from	to	target	type
    //   39	101	143	java/lang/Throwable
    //   39	101	152	finally
    //   108	128	143	java/lang/Throwable
    //   108	128	152	finally
  }
  
  public final boolean a(byte[] paramArrayOfbyte) {
    return a(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public final boolean a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: aconst_null
    //   10: astore_2
    //   11: aconst_null
    //   12: astore #4
    //   14: iconst_0
    //   15: istore #5
    //   17: aload_0
    //   18: getfield a : Ljava/lang/String;
    //   21: iconst_5
    //   22: invokevirtual substring : (I)Ljava/lang/String;
    //   25: astore #6
    //   27: aload_0
    //   28: aload #6
    //   30: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   33: dup
    //   34: astore_0
    //   35: ldc '-'
    //   37: invokevirtual equals : (Ljava/lang/Object;)Z
    //   40: ifeq -> 69
    //   43: invokestatic currentTimeMillis : ()J
    //   46: invokestatic valueOf : (J)Ljava/lang/String;
    //   49: astore_0
    //   50: iconst_2
    //   51: anewarray java/lang/Object
    //   54: dup
    //   55: astore #4
    //   57: iconst_0
    //   58: aload_0
    //   59: aastore
    //   60: aload #4
    //   62: iconst_1
    //   63: aload #6
    //   65: aastore
    //   66: iconst_1
    //   67: istore #5
    //   69: iload #5
    //   71: ifne -> 79
    //   74: aload_0
    //   75: invokestatic a : (Ljava/lang/String;)Z
    //   78: pop
    //   79: aload_0
    //   80: iconst_1
    //   81: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   84: dup
    //   85: astore_2
    //   86: ifnonnull -> 96
    //   89: aload_2
    //   90: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   93: pop
    //   94: iconst_0
    //   95: ireturn
    //   96: new java/io/ByteArrayOutputStream
    //   99: dup
    //   100: invokespecial <init> : ()V
    //   103: astore_0
    //   104: new java/io/DataOutputStream
    //   107: dup
    //   108: aload_0
    //   109: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   112: dup
    //   113: astore #6
    //   115: bipush #80
    //   117: invokevirtual writeByte : (I)V
    //   120: aload #6
    //   122: iload_3
    //   123: invokevirtual writeInt : (I)V
    //   126: aload #6
    //   128: aload_1
    //   129: iconst_0
    //   130: iload_3
    //   131: invokevirtual write : ([BII)V
    //   134: aload #6
    //   136: invokevirtual flush : ()V
    //   139: aload_2
    //   140: aload_0
    //   141: invokevirtual toByteArray : ()[B
    //   144: iconst_0
    //   145: aload_0
    //   146: invokevirtual size : ()I
    //   149: invokevirtual addRecord : ([BII)I
    //   152: pop
    //   153: iload #5
    //   155: ifeq -> 164
    //   158: aload #4
    //   160: iconst_m1
    //   161: invokestatic a : ([Ljava/lang/Object;I)V
    //   164: iconst_1
    //   165: istore_0
    //   166: aload_2
    //   167: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   170: pop
    //   171: goto -> 193
    //   174: pop
    //   175: iconst_0
    //   176: istore_0
    //   177: aload_2
    //   178: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   181: pop
    //   182: goto -> 193
    //   185: astore_0
    //   186: aload_2
    //   187: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   190: pop
    //   191: aload_0
    //   192: athrow
    //   193: iload_0
    //   194: ireturn
    // Exception table:
    //   from	to	target	type
    //   79	89	174	java/lang/Throwable
    //   79	89	185	finally
    //   96	166	174	java/lang/Throwable
    //   96	166	185	finally
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final void b(boolean paramBoolean) {}
  
  public final void c(boolean paramBoolean) {}
  
  public final long d() {
    RecordStore recordStore;
    this = null;
    int i = -1;
    try {
      i = (recordStore = RecordStore.openRecordStore("FatRms", true)).getRecordSize(1);
    } catch (Throwable throwable) {
    
    } finally {
      v.a(this);
    } 
    return i;
  }
  
  public final boolean b(String paramString) {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: aload_0
    //   10: invokespecial h : ()Z
    //   13: ifeq -> 37
    //   16: getstatic c.a : Ljava/util/Vector;
    //   19: ifnonnull -> 25
    //   22: invokestatic f : ()V
    //   25: aload_0
    //   26: aload_0
    //   27: getfield b : Ljava/lang/String;
    //   30: aload_1
    //   31: iconst_1
    //   32: invokespecial a : (Ljava/lang/String;Ljava/lang/String;Z)V
    //   35: iconst_1
    //   36: ireturn
    //   37: aload_0
    //   38: getfield a : Ljava/lang/String;
    //   41: iconst_5
    //   42: invokevirtual substring : (I)Ljava/lang/String;
    //   45: astore_2
    //   46: aload_0
    //   47: aload_2
    //   48: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   51: dup
    //   52: astore_3
    //   53: ldc '-'
    //   55: invokevirtual equals : (Ljava/lang/Object;)Z
    //   58: ifne -> 91
    //   61: iconst_2
    //   62: anewarray java/lang/Object
    //   65: dup
    //   66: astore_2
    //   67: iconst_0
    //   68: aload_3
    //   69: aastore
    //   70: aload_2
    //   71: iconst_1
    //   72: aload_0
    //   73: getfield b : Ljava/lang/String;
    //   76: aload_1
    //   77: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   80: aastore
    //   81: aload_2
    //   82: aload_0
    //   83: getfield a : I
    //   86: invokestatic a : ([Ljava/lang/Object;I)V
    //   89: iconst_1
    //   90: ireturn
    //   91: iconst_0
    //   92: ireturn
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #4
    //   3: iconst_0
    //   4: istore #5
    //   6: iload_3
    //   7: ifeq -> 69
    //   10: aload_1
    //   11: dup
    //   12: astore #4
    //   14: ifnull -> 26
    //   17: aload #4
    //   19: invokevirtual length : ()I
    //   22: iconst_1
    //   23: if_icmpge -> 31
    //   26: ldc ''
    //   28: goto -> 57
    //   31: aload #4
    //   33: bipush #47
    //   35: aload #4
    //   37: invokevirtual length : ()I
    //   40: iconst_2
    //   41: isub
    //   42: invokevirtual lastIndexOf : (II)I
    //   45: istore #5
    //   47: aload #4
    //   49: iconst_0
    //   50: iload #5
    //   52: iconst_1
    //   53: iadd
    //   54: invokevirtual substring : (II)Ljava/lang/String;
    //   57: aload_2
    //   58: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   61: astore #4
    //   63: aload_1
    //   64: invokevirtual length : ()I
    //   67: istore #5
    //   69: new java/util/Vector
    //   72: dup
    //   73: iconst_0
    //   74: invokespecial <init> : (I)V
    //   77: astore #6
    //   79: new java/lang/StringBuffer
    //   82: dup
    //   83: iconst_0
    //   84: invokespecial <init> : (I)V
    //   87: astore #7
    //   89: getstatic c.a : Ljava/util/Vector;
    //   92: invokevirtual size : ()I
    //   95: istore #8
    //   97: iinc #8, -1
    //   100: iload #8
    //   102: iflt -> 223
    //   105: getstatic c.a : Ljava/util/Vector;
    //   108: iload #8
    //   110: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   113: checkcast [Ljava/lang/Object;
    //   116: iconst_1
    //   117: aaload
    //   118: checkcast java/lang/String
    //   121: astore #9
    //   123: aload_0
    //   124: aload #9
    //   126: invokespecial a : (Ljava/lang/String;)Ljava/lang/String;
    //   129: astore #10
    //   131: aload #9
    //   133: aload_1
    //   134: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   137: ifeq -> 196
    //   140: aload #7
    //   142: iconst_0
    //   143: invokevirtual setLength : (I)V
    //   146: iload_3
    //   147: ifeq -> 173
    //   150: aload #7
    //   152: aload #4
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   157: aload #9
    //   159: iload #5
    //   161: invokevirtual substring : (I)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   167: invokevirtual toString : ()Ljava/lang/String;
    //   170: goto -> 194
    //   173: aload #7
    //   175: aload_2
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   179: aload #9
    //   181: aload_1
    //   182: invokevirtual length : ()I
    //   185: invokevirtual substring : (I)Ljava/lang/String;
    //   188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   191: invokevirtual toString : ()Ljava/lang/String;
    //   194: astore #9
    //   196: iconst_2
    //   197: anewarray java/lang/Object
    //   200: dup
    //   201: astore #11
    //   203: iconst_0
    //   204: aload #10
    //   206: aastore
    //   207: aload #11
    //   209: iconst_1
    //   210: aload #9
    //   212: aastore
    //   213: aload #6
    //   215: aload #11
    //   217: invokevirtual addElement : (Ljava/lang/Object;)V
    //   220: goto -> 97
    //   223: aload #6
    //   225: iconst_0
    //   226: aload #6
    //   228: invokevirtual size : ()I
    //   231: invokestatic a : (Ljava/util/Vector;II)V
    //   234: aload #6
    //   236: putstatic c.a : Ljava/util/Vector;
    //   239: invokestatic g : ()V
    //   242: return
  }
  
  public final int a(String paramString1, String paramString2, boolean paramBoolean) {
    if (!paramBoolean)
      return 0; 
    if (a == null)
      f(); 
    a(paramString1.substring(5), paramString2.substring(5), false);
    return 1;
  }
  
  private static void a(Object[] paramArrayOfObject, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_m1
    //   2: if_icmpeq -> 12
    //   5: getstatic c.a : Ljava/util/Vector;
    //   8: iload_1
    //   9: invokevirtual removeElementAt : (I)V
    //   12: getstatic c.a : Ljava/util/Vector;
    //   15: aload_0
    //   16: invokevirtual addElement : (Ljava/lang/Object;)V
    //   19: getstatic c.a : Ljava/util/Vector;
    //   22: iconst_0
    //   23: getstatic c.a : Ljava/util/Vector;
    //   26: invokevirtual size : ()I
    //   29: invokestatic a : (Ljava/util/Vector;II)V
    //   32: invokestatic g : ()V
    //   35: return
  }
  
  public final InputStream a() {
    try {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a());
    } catch (Exception exception) {
      this = null;
    } 
    return (InputStream)this;
  }
  
  public final OutputStream a(long paramLong) {
    ByteArrayOutputStream byteArrayOutputStream;
    this = null;
    try {
      byteArrayOutputStream = new ByteArrayOutputStream();
    } catch (Throwable throwable) {}
    return this;
  }
  
  private static void f() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: new java/util/Vector
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: putstatic c.a : Ljava/util/Vector;
    //   12: ldc 'FatRms'
    //   14: iconst_0
    //   15: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   18: dup
    //   19: astore_0
    //   20: invokevirtual getSizeAvailable : ()I
    //   23: pop
    //   24: aload_0
    //   25: aconst_null
    //   26: aconst_null
    //   27: iconst_0
    //   28: invokevirtual enumerateRecords : (Ljavax/microedition/rms/RecordFilter;Ljavax/microedition/rms/RecordComparator;Z)Ljavax/microedition/rms/RecordEnumeration;
    //   31: dup
    //   32: astore_1
    //   33: invokeinterface hasNextElement : ()Z
    //   38: ifeq -> 127
    //   41: aload_1
    //   42: invokeinterface nextRecord : ()[B
    //   47: astore_1
    //   48: new java/io/ByteArrayInputStream
    //   51: dup
    //   52: aload_1
    //   53: invokespecial <init> : ([B)V
    //   56: astore_1
    //   57: new java/io/DataInputStream
    //   60: dup
    //   61: aload_1
    //   62: invokespecial <init> : (Ljava/io/InputStream;)V
    //   65: dup
    //   66: astore_1
    //   67: invokevirtual readUnsignedByte : ()I
    //   70: bipush #70
    //   72: if_icmpeq -> 81
    //   75: aload_0
    //   76: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   79: pop
    //   80: return
    //   81: aload_1
    //   82: invokevirtual readInt : ()I
    //   85: istore_2
    //   86: iconst_0
    //   87: istore #4
    //   89: iload #4
    //   91: iload_2
    //   92: if_icmpge -> 127
    //   95: iconst_2
    //   96: anewarray java/lang/String
    //   99: dup
    //   100: astore_3
    //   101: iconst_0
    //   102: aload_1
    //   103: invokevirtual readUTF : ()Ljava/lang/String;
    //   106: aastore
    //   107: aload_3
    //   108: iconst_1
    //   109: aload_1
    //   110: invokevirtual readUTF : ()Ljava/lang/String;
    //   113: aastore
    //   114: getstatic c.a : Ljava/util/Vector;
    //   117: aload_3
    //   118: invokevirtual addElement : (Ljava/lang/Object;)V
    //   121: iinc #4, 1
    //   124: goto -> 89
    //   127: aload_0
    //   128: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   131: pop
    //   132: return
    //   133: pop
    //   134: aload_0
    //   135: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   138: pop
    //   139: return
    //   140: astore_1
    //   141: aload_0
    //   142: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   145: pop
    //   146: aload_1
    //   147: athrow
    // Exception table:
    //   from	to	target	type
    //   12	75	133	java/lang/Throwable
    //   12	75	140	finally
    //   81	127	133	java/lang/Throwable
    //   81	127	140	finally
  }
  
  private static void g() {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnull -> 157
    //   6: aconst_null
    //   7: astore_0
    //   8: ldc 'FatRms'
    //   10: invokestatic a : (Ljava/lang/String;)Z
    //   13: pop
    //   14: ldc 'FatRms'
    //   16: iconst_1
    //   17: invokestatic openRecordStore : (Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   20: dup
    //   21: astore_0
    //   22: ifnonnull -> 31
    //   25: aload_0
    //   26: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   29: pop
    //   30: return
    //   31: new java/io/ByteArrayOutputStream
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore_1
    //   39: new java/io/DataOutputStream
    //   42: dup
    //   43: aload_1
    //   44: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   47: dup
    //   48: astore_2
    //   49: bipush #70
    //   51: invokevirtual writeByte : (I)V
    //   54: getstatic c.a : Ljava/util/Vector;
    //   57: invokevirtual size : ()I
    //   60: istore_3
    //   61: aload_2
    //   62: iload_3
    //   63: invokevirtual writeInt : (I)V
    //   66: iconst_0
    //   67: istore #5
    //   69: iload #5
    //   71: iload_3
    //   72: if_icmpge -> 122
    //   75: getstatic c.a : Ljava/util/Vector;
    //   78: iload #5
    //   80: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   83: checkcast [Ljava/lang/Object;
    //   86: astore #4
    //   88: aload_2
    //   89: aload #4
    //   91: iconst_0
    //   92: aaload
    //   93: checkcast java/lang/String
    //   96: invokestatic i : (Ljava/lang/String;)Ljava/lang/String;
    //   99: invokevirtual writeUTF : (Ljava/lang/String;)V
    //   102: aload_2
    //   103: aload #4
    //   105: iconst_1
    //   106: aaload
    //   107: checkcast java/lang/String
    //   110: invokestatic i : (Ljava/lang/String;)Ljava/lang/String;
    //   113: invokevirtual writeUTF : (Ljava/lang/String;)V
    //   116: iinc #5, 1
    //   119: goto -> 69
    //   122: aload_0
    //   123: aload_1
    //   124: invokevirtual toByteArray : ()[B
    //   127: iconst_0
    //   128: aload_1
    //   129: invokevirtual size : ()I
    //   132: invokevirtual addRecord : ([BII)I
    //   135: pop
    //   136: aload_0
    //   137: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   140: pop
    //   141: return
    //   142: pop
    //   143: aload_0
    //   144: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   147: pop
    //   148: return
    //   149: astore_1
    //   150: aload_0
    //   151: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   154: pop
    //   155: aload_1
    //   156: athrow
    //   157: return
    // Exception table:
    //   from	to	target	type
    //   14	25	142	java/lang/Throwable
    //   14	25	149	finally
    //   31	136	142	java/lang/Throwable
    //   31	136	149	finally
  }
  
  private String a(String paramString) {
    // Byte code:
    //   0: getstatic c.a : Ljava/util/Vector;
    //   3: ifnonnull -> 9
    //   6: invokestatic f : ()V
    //   9: aload_0
    //   10: iconst_m1
    //   11: putfield a : I
    //   14: getstatic c.a : Ljava/util/Vector;
    //   17: ifnull -> 70
    //   20: getstatic c.a : Ljava/util/Vector;
    //   23: invokevirtual size : ()I
    //   26: istore_2
    //   27: iinc #2, -1
    //   30: iload_2
    //   31: iflt -> 70
    //   34: getstatic c.a : Ljava/util/Vector;
    //   37: iload_2
    //   38: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   41: checkcast [Ljava/lang/Object;
    //   44: dup
    //   45: astore_3
    //   46: iconst_1
    //   47: aaload
    //   48: aload_1
    //   49: invokevirtual equals : (Ljava/lang/Object;)Z
    //   52: ifeq -> 67
    //   55: aload_0
    //   56: iload_2
    //   57: putfield a : I
    //   60: aload_3
    //   61: iconst_0
    //   62: aaload
    //   63: checkcast java/lang/String
    //   66: areturn
    //   67: goto -> 27
    //   70: ldc '-'
    //   72: areturn
  }
  
  public final Vector a(String paramString, Vector paramVector) {
    a(paramString);
    String[] arrayOfString = a();
    Vector vector = new Vector(this.length);
    for (byte b = 0; b < this.length; b++)
      vector.addElement(this[b]); 
    return vector;
  }
  
  public final boolean c(String paramString) {
    a(paramString);
    return true;
  }
  
  public final boolean g() {
    return b();
  }
  
  public final void c() {
    a(false);
  }
  
  public final void d() {
    a();
  }
  
  public final long e() {
    return b();
  }
  
  public final long f() {
    return a();
  }
  
  public final OutputStream b(long paramLong) {
    return new ByteArrayOutputStream();
  }
  
  public final void e() {}
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\c.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */