import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.SocketConnection;

public final class d extends InputStream implements Runnable {
  private int b;
  
  private int c;
  
  private SocketConnection a;
  
  private DataInputStream a;
  
  private DataOutputStream a;
  
  private byte[] a;
  
  private DataOutputStream b;
  
  private boolean a;
  
  private Vector a;
  
  private d a;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private boolean b;
  
  private final Object a;
  
  public int a;
  
  private boolean c;
  
  private a a = (a)new Object();
  
  private boolean d;
  
  public final void a(byte[] paramArrayOfbyte, String paramString, a parama, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_2
    //   1: getstatic v.y : Ljava/lang/String;
    //   4: invokevirtual equals : (Ljava/lang/Object;)Z
    //   7: ifne -> 13
    //   10: invokestatic a : ()V
    //   13: aload_0
    //   14: aload_3
    //   15: iload #4
    //   17: invokespecial a : (La;Z)V
    //   20: getstatic v.b : Ljava/lang/Object;
    //   23: dup
    //   24: astore #5
    //   26: monitorenter
    //   27: getstatic v.a : Ld;
    //   30: ifnonnull -> 73
    //   33: new d
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: putstatic v.a : Ld;
    //   43: new l
    //   46: dup
    //   47: bipush #18
    //   49: invokespecial <init> : (I)V
    //   52: putstatic v.a : Ll;
    //   55: getstatic af.b : Laf;
    //   58: getfield a : Ljava/util/Timer;
    //   61: getstatic v.a : Ll;
    //   64: ldc2_w 1000
    //   67: ldc2_w 1000
    //   70: invokevirtual schedule : (Ljava/util/TimerTask;JJ)V
    //   73: aload_0
    //   74: getstatic v.a : Ld;
    //   77: putfield a : Ld;
    //   80: aload #5
    //   82: monitorexit
    //   83: goto -> 92
    //   86: astore_2
    //   87: aload #5
    //   89: monitorexit
    //   90: aload_2
    //   91: athrow
    //   92: aload_0
    //   93: getfield a : Ld;
    //   96: dup
    //   97: astore #5
    //   99: monitorenter
    //   100: aload_0
    //   101: getfield a : Ld;
    //   104: aload_3
    //   105: iload #4
    //   107: invokespecial a : (La;Z)V
    //   110: aload_0
    //   111: getfield a : Ld;
    //   114: getfield a : Ljavax/microedition/io/SocketConnection;
    //   117: ifnonnull -> 360
    //   120: aload_0
    //   121: getfield a : Ld;
    //   124: aload_2
    //   125: astore_3
    //   126: dup
    //   127: astore_2
    //   128: new java/util/Vector
    //   131: dup
    //   132: iconst_3
    //   133: invokespecial <init> : (I)V
    //   136: putfield a : Ljava/util/Vector;
    //   139: aload_3
    //   140: putstatic v.y : Ljava/lang/String;
    //   143: aload_2
    //   144: aload_3
    //   145: iconst_3
    //   146: getstatic v.o : Z
    //   149: invokestatic open : (Ljava/lang/String;IZ)Ljavax/microedition/io/Connection;
    //   152: checkcast javax/microedition/io/SocketConnection
    //   155: putfield a : Ljavax/microedition/io/SocketConnection;
    //   158: aload_2
    //   159: getfield a : Ljavax/microedition/io/SocketConnection;
    //   162: iconst_1
    //   163: iconst_0
    //   164: invokeinterface setSocketOption : (BI)V
    //   169: aload_2
    //   170: aload_2
    //   171: getfield a : Ljavax/microedition/io/SocketConnection;
    //   174: invokeinterface openDataOutputStream : ()Ljava/io/DataOutputStream;
    //   179: putfield b : Ljava/io/DataOutputStream;
    //   182: aload_2
    //   183: getfield b : Ljava/io/DataOutputStream;
    //   186: iconst_0
    //   187: invokevirtual writeByte : (I)V
    //   190: aload_3
    //   191: invokevirtual length : ()I
    //   194: invokestatic d : (I)Z
    //   197: pop
    //   198: getstatic v.bH : Z
    //   201: ifeq -> 236
    //   204: aload_2
    //   205: getfield b : Ljava/io/DataOutputStream;
    //   208: iconst_0
    //   209: invokevirtual writeByte : (I)V
    //   212: aload_2
    //   213: aload_2
    //   214: getfield b : Ljava/io/DataOutputStream;
    //   217: putfield a : Ljava/io/DataOutputStream;
    //   220: aload_2
    //   221: aload_2
    //   222: getfield a : Ljavax/microedition/io/SocketConnection;
    //   225: invokeinterface openDataInputStream : ()Ljava/io/DataInputStream;
    //   230: putfield a : Ljava/io/DataInputStream;
    //   233: goto -> 342
    //   236: aload_2
    //   237: getfield b : Ljava/io/DataOutputStream;
    //   240: iconst_1
    //   241: invokevirtual writeByte : (I)V
    //   244: aload_2
    //   245: aload_2
    //   246: getfield b : Ljava/io/DataOutputStream;
    //   249: invokestatic a : (Ljava/io/DataOutputStream;)Ljava/io/DataOutputStream;
    //   252: putfield a : Ljava/io/DataOutputStream;
    //   255: new q
    //   258: dup
    //   259: aload_2
    //   260: getfield a : La;
    //   263: aload_2
    //   264: getfield a : Ljavax/microedition/io/SocketConnection;
    //   267: invokeinterface openDataInputStream : ()Ljava/io/DataInputStream;
    //   272: aload_2
    //   273: getfield c : Z
    //   276: aload_2
    //   277: getfield d : Z
    //   280: invokespecial <init> : (La;Ljava/io/InputStream;ZZ)V
    //   283: astore_3
    //   284: aload_2
    //   285: getfield b : Ljava/io/DataOutputStream;
    //   288: invokevirtual flush : ()V
    //   291: aload_3
    //   292: invokevirtual a : ()Z
    //   295: ifeq -> 330
    //   298: invokestatic e : ()V
    //   301: aload_2
    //   302: aload_2
    //   303: getfield b : Ljava/io/DataOutputStream;
    //   306: invokestatic a : (Ljava/io/DataOutputStream;)Ljava/io/DataOutputStream;
    //   309: putfield a : Ljava/io/DataOutputStream;
    //   312: aload_2
    //   313: getfield b : Ljava/io/DataOutputStream;
    //   316: invokevirtual flush : ()V
    //   319: aload_3
    //   320: invokevirtual a : ()Z
    //   323: ifeq -> 330
    //   326: getstatic v.a : Ljava/lang/RuntimeException;
    //   329: athrow
    //   330: aload_2
    //   331: new java/io/DataInputStream
    //   334: dup
    //   335: aload_3
    //   336: invokespecial <init> : (Ljava/io/InputStream;)V
    //   339: putfield a : Ljava/io/DataInputStream;
    //   342: aload_2
    //   343: invokestatic a : (Ljava/lang/Runnable;)Ljava/lang/Thread;
    //   346: pop
    //   347: goto -> 360
    //   350: athrow
    //   351: pop
    //   352: aload_2
    //   353: invokespecial b : ()V
    //   356: getstatic v.a : Ljava/lang/RuntimeException;
    //   359: athrow
    //   360: aload_0
    //   361: getfield b : I
    //   364: ifne -> 394
    //   367: aload_0
    //   368: sipush #1024
    //   371: newarray byte
    //   373: putfield a : [B
    //   376: aload_0
    //   377: aload_0
    //   378: getfield a : Ld;
    //   381: dup
    //   382: getfield c : I
    //   385: iconst_1
    //   386: iadd
    //   387: dup_x1
    //   388: putfield c : I
    //   391: putfield b : I
    //   394: aload_0
    //   395: getfield a : Ld;
    //   398: getfield a : Z
    //   401: ifeq -> 489
    //   404: new java/lang/StringBuffer
    //   407: dup
    //   408: iconst_0
    //   409: invokestatic b : (I)Ljava/lang/String;
    //   412: invokespecial <init> : (Ljava/lang/String;)V
    //   415: iconst_0
    //   416: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   419: getstatic v.s : Ljava/lang/String;
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   425: iconst_0
    //   426: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   429: invokevirtual toString : ()Ljava/lang/String;
    //   432: invokevirtual getBytes : ()[B
    //   435: astore_2
    //   436: aload_0
    //   437: getfield a : Ld;
    //   440: sipush #128
    //   443: iconst_1
    //   444: aload_2
    //   445: iconst_0
    //   446: aload_2
    //   447: arraylength
    //   448: invokespecial a : (II[BII)V
    //   451: getstatic a.a : Lh;
    //   454: invokevirtual size : ()I
    //   457: invokestatic d : (I)Z
    //   460: ifne -> 469
    //   463: invokestatic a : ()Z
    //   466: ifeq -> 489
    //   469: getstatic af.b : Laf;
    //   472: sipush #683
    //   475: invokestatic d : (I)Ljava/lang/String;
    //   478: invokevirtual c : (Ljava/lang/String;)V
    //   481: aload_0
    //   482: getfield a : La;
    //   485: iconst_1
    //   486: putfield b : Z
    //   489: aload_0
    //   490: getfield a : Ld;
    //   493: iconst_5
    //   494: aload_0
    //   495: getfield b : I
    //   498: aconst_null
    //   499: iconst_0
    //   500: iconst_0
    //   501: invokespecial a : (II[BII)V
    //   504: aload_1
    //   505: arraylength
    //   506: istore_2
    //   507: aload_0
    //   508: getfield a : La;
    //   511: ifnull -> 541
    //   514: aload_0
    //   515: getfield a : La;
    //   518: invokevirtual g : ()V
    //   521: aload_0
    //   522: getfield a : La;
    //   525: aconst_null
    //   526: aload_1
    //   527: iconst_0
    //   528: aload_1
    //   529: arraylength
    //   530: invokevirtual a : (Ljava/io/DataOutputStream;[BII)I
    //   533: istore_2
    //   534: aload_0
    //   535: getfield a : La;
    //   538: invokevirtual g : ()V
    //   541: iload_2
    //   542: istore_3
    //   543: iload_3
    //   544: ldc 65533
    //   546: if_icmple -> 576
    //   549: aload_0
    //   550: getfield a : Ld;
    //   553: bipush #10
    //   555: aload_0
    //   556: getfield b : I
    //   559: aload_1
    //   560: iload_2
    //   561: iload_3
    //   562: isub
    //   563: ldc 65533
    //   565: invokespecial a : (II[BII)V
    //   568: iload_3
    //   569: ldc 65533
    //   571: isub
    //   572: istore_3
    //   573: goto -> 543
    //   576: aload_0
    //   577: getfield a : Ld;
    //   580: bipush #11
    //   582: aload_0
    //   583: getfield b : I
    //   586: aload_1
    //   587: iload_2
    //   588: iload_3
    //   589: isub
    //   590: iload_3
    //   591: invokespecial a : (II[BII)V
    //   594: aload_0
    //   595: iconst_1
    //   596: putfield d : I
    //   599: aload_0
    //   600: getfield a : Ld;
    //   603: getfield a : Ljava/util/Vector;
    //   606: aload_0
    //   607: invokevirtual addElement : (Ljava/lang/Object;)V
    //   610: aload_0
    //   611: getfield a : Ld;
    //   614: iconst_0
    //   615: putfield a : Z
    //   618: aload #5
    //   620: monitorexit
    //   621: return
    //   622: astore_0
    //   623: aload #5
    //   625: monitorexit
    //   626: aload_0
    //   627: athrow
    // Exception table:
    //   from	to	target	type
    //   27	83	86	finally
    //   86	90	86	finally
    //   100	621	622	finally
    //   143	347	350	java/io/IOException
    //   143	347	351	java/lang/Throwable
    //   622	626	622	finally
  }
  
  public d() {
    this.a = true;
  }
  
  private void a(a parama, boolean paramBoolean) {
    this.a = parama;
    this.c = paramBoolean;
    this.d = true;
  }
  
  public final void close() {
    if (this.a != null)
      this.a.a(this.b, 7); 
  }
  
  private synchronized void a(int paramInt1, int paramInt2) {
    for (byte b = 0; b < this.a.size(); b++) {
      d d1;
      if ((d1 = this.a.elementAt(b)).b == paramInt1) {
        if (paramInt2 == 6 && d1.b) {
          d1.d = true;
          return;
        } 
        this.a.removeElement(d1);
        d1.d = true;
        try {
          a(paramInt2, paramInt1, (byte[])null, 0, 0);
          return;
        } catch (Exception exception) {
          return;
        } 
      } 
    } 
  }
  
  private void b() {
    try {
      synchronized (v.b) {
        if (v.a == this) {
          v.a = null;
          v.a = null;
        } 
      } 
    } catch (Exception exception) {}
    l l;
    (l = new l(20)).a.addElement(this.b);
    l.a.addElement(this.a);
    l.a.addElement(this.a);
    v.a(l);
    this.a = null;
    this.a = null;
    this.a = null;
    try {
      for (byte b = 0; b < this.a.size(); b++)
        ((d)this.a.elementAt(b)).d = true; 
      this.a.removeAllElements();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void a() {
    // Byte code:
    //   0: getstatic v.b : Ljava/lang/Object;
    //   3: dup
    //   4: astore_0
    //   5: monitorenter
    //   6: getstatic v.a : Ld;
    //   9: ifnull -> 18
    //   12: getstatic v.a : Ld;
    //   15: invokespecial b : ()V
    //   18: aconst_null
    //   19: putstatic v.a : Ld;
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   6	24	25	finally
    //   25	28	25	finally
  }
  
  public final void run() {
    try {
      while (v.a == this) {
        short s1;
        d d1;
        int i;
        short s3;
        byte b = this.a.readByte();
        short s2 = this.a.readShort();
        v.a.b = -1L;
        switch (b) {
          case 10:
            s1 = this.a.readShort();
            i = s2 - 2;
            if ((d1 = a(s1)) != null && d1.d == true) {
              while (d1.b && d1.d == true)
                v.a(d1.a, 1000); 
              int j;
              for (j = 0; j < i; j += this.a.read((byte[])d1.a, j, i - j));
              if (this.a != null && this.a.b != null && (v.T != 0 || v.V != null) && this.c)
                for (j = 0; j < i; j++)
                  this.a.b.write(d1.a[j]);  
              d1.f = 0;
              d1.e = i;
              d1.b = true;
              v.b(d1.a);
              break;
            } 
            v.a((InputStream)this.a, i);
            break;
          case 6:
          case 7:
            s3 = this.a.readShort();
            a(s3, d1);
            break;
          case 4:
            b();
            break;
          default:
            v.a((InputStream)this.a, s2);
            break;
        } 
        if (v.bH != 0 && (v.c(s2 + 3) || v.a()) && this.a != null) {
          af.b.c(v.d(683));
          this.a.b = true;
          return;
        } 
      } 
      return;
    } catch (Exception exception) {
      b();
      return;
    } 
  }
  
  public final int read() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Z
    //   4: ifne -> 30
    //   7: aload_0
    //   8: getfield d : I
    //   11: iconst_3
    //   12: if_icmpne -> 17
    //   15: iconst_m1
    //   16: ireturn
    //   17: aload_0
    //   18: getfield a : Ljava/lang/Object;
    //   21: sipush #1000
    //   24: invokestatic a : (Ljava/lang/Object;I)V
    //   27: goto -> 0
    //   30: aload_0
    //   31: getfield a : [B
    //   34: aload_0
    //   35: dup
    //   36: getfield f : I
    //   39: dup_x1
    //   40: iconst_1
    //   41: iadd
    //   42: putfield f : I
    //   45: baload
    //   46: istore_1
    //   47: aload_0
    //   48: getfield f : I
    //   51: aload_0
    //   52: getfield e : I
    //   55: if_icmplt -> 91
    //   58: aload_0
    //   59: iconst_0
    //   60: putfield b : Z
    //   63: aload_0
    //   64: getfield a : Ljava/lang/Object;
    //   67: invokestatic b : (Ljava/lang/Object;)V
    //   70: aload_0
    //   71: getfield d : I
    //   74: iconst_2
    //   75: if_icmpne -> 91
    //   78: aload_0
    //   79: getfield a : Ld;
    //   82: aload_0
    //   83: getfield b : I
    //   86: bipush #7
    //   88: invokespecial a : (II)V
    //   91: aload_0
    //   92: dup
    //   93: getfield a : I
    //   96: iconst_1
    //   97: iadd
    //   98: putfield a : I
    //   101: iload_1
    //   102: sipush #255
    //   105: iand
    //   106: ireturn
  }
  
  private synchronized void a(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, int paramInt3, int paramInt4) {
    if (this.a == null && (paramInt1 == 5 || paramInt1 == 1))
      v.a.b = System.currentTimeMillis() + 10000L; 
    this.a.writeByte(paramInt1);
    if (paramArrayOfbyte == null) {
      this.a.writeShort(2);
      this.a.writeShort(paramInt2);
      v.d(10);
    } else {
      this.a.writeShort(paramInt4 + 2);
      this.a.writeShort(paramInt2);
      if (this.a != null) {
        paramInt1 = paramArrayOfbyte.length;
        this.a.g();
        try {
          this.a.a((DataOutputStream)this.a, paramArrayOfbyte, paramInt3, paramArrayOfbyte.length);
        } catch (OutOfMemoryError outOfMemoryError) {
          a.a = (String[])new h();
          v.a = null;
          this.a.b();
          b();
          throw outOfMemoryError;
        } 
        this.a.g();
      } else {
        paramInt1 = paramInt4 - paramInt3;
        this.a.write(paramArrayOfbyte, paramInt3, paramInt4);
      } 
      v.d(paramInt1 + 10);
    } 
    if (v.bH == 0) {
      try {
        v.b(true);
        if (v.d(0) || v.a())
          this.a.b = true; 
      } catch (OutOfMemoryError outOfMemoryError) {
        a.a = (String[])new h();
        v.a = null;
        this.a.b();
        b();
        throw outOfMemoryError;
      } 
      v.d(a.a.size());
      if (v.d(0) || v.a()) {
        af.b.c(v.d(683));
        this.a.b = true;
        return;
      } 
    } else {
      this.a.flush();
    } 
  }
  
  private synchronized d a(int paramInt) {
    for (byte b = 0; b < this.a.size(); b++) {
      d d1;
      if ((d1 = this.a.elementAt(b)).d == 3) {
        this.a.removeElementAt(b);
        continue;
      } 
      if (d1.b == paramInt)
        return d1; 
    } 
    return null;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\d.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */