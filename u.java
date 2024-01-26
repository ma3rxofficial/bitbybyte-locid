import javax.microedition.sensor.Data;
import javax.microedition.sensor.DataListener;
import javax.microedition.sensor.SensorConnection;

final class u implements DataListener {
  private final j a;
  
  u(j paramj) {
    this.a = paramj;
  }
  
  public final synchronized void dataReceived(SensorConnection paramSensorConnection, Data[] paramArrayOfData, boolean paramBoolean) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_2
    //   5: iconst_0
    //   6: aaload
    //   7: invokeinterface getChannelInfo : ()Ljavax/microedition/sensor/ChannelInfo;
    //   12: invokeinterface getDataType : ()I
    //   17: istore #4
    //   19: iconst_2
    //   20: iload #4
    //   22: if_icmpne -> 43
    //   25: aload_2
    //   26: iconst_0
    //   27: aaload
    //   28: invokeinterface getIntValues : ()[I
    //   33: astore_1
    //   34: aload_2
    //   35: iconst_1
    //   36: aaload
    //   37: invokeinterface getIntValues : ()[I
    //   42: astore_3
    //   43: aload_1
    //   44: ifnull -> 51
    //   47: aload_3
    //   48: ifnonnull -> 52
    //   51: return
    //   52: aload_0
    //   53: getfield a : Lj;
    //   56: iconst_0
    //   57: putfield c : I
    //   60: aload_0
    //   61: getfield a : Lj;
    //   64: iconst_0
    //   65: putfield d : I
    //   68: iconst_0
    //   69: istore_2
    //   70: iload_2
    //   71: aload_1
    //   72: arraylength
    //   73: if_icmpge -> 120
    //   76: aload_0
    //   77: getfield a : Lj;
    //   80: aload_1
    //   81: iload_2
    //   82: iaload
    //   83: istore #4
    //   85: dup
    //   86: getfield c : I
    //   89: iload #4
    //   91: iadd
    //   92: putfield c : I
    //   95: aload_0
    //   96: getfield a : Lj;
    //   99: aload_3
    //   100: iload_2
    //   101: iaload
    //   102: istore #4
    //   104: dup
    //   105: getfield d : I
    //   108: iload #4
    //   110: iadd
    //   111: putfield d : I
    //   114: iinc #2, 1
    //   117: goto -> 70
    //   120: aload_0
    //   121: getfield a : Lj;
    //   124: aload_1
    //   125: arraylength
    //   126: istore #4
    //   128: dup
    //   129: getfield c : I
    //   132: iload #4
    //   134: idiv
    //   135: putfield c : I
    //   138: aload_0
    //   139: getfield a : Lj;
    //   142: aload_1
    //   143: arraylength
    //   144: istore #4
    //   146: dup
    //   147: getfield d : I
    //   150: iload #4
    //   152: idiv
    //   153: putfield d : I
    //   156: aload_0
    //   157: getfield a : Lj;
    //   160: getfield c : I
    //   163: ifge -> 188
    //   166: aload_0
    //   167: getfield a : Lj;
    //   170: getfield c : I
    //   173: bipush #100
    //   175: imul
    //   176: i2l
    //   177: getstatic v.o : J
    //   180: invokestatic abs : (J)J
    //   183: ldiv
    //   184: l2i
    //   185: goto -> 207
    //   188: aload_0
    //   189: getfield a : Lj;
    //   192: getfield c : I
    //   195: bipush #100
    //   197: imul
    //   198: i2l
    //   199: getstatic v.p : J
    //   202: invokestatic abs : (J)J
    //   205: ldiv
    //   206: l2i
    //   207: istore_2
    //   208: aload_0
    //   209: getfield a : Lj;
    //   212: getfield d : I
    //   215: ifge -> 240
    //   218: aload_0
    //   219: getfield a : Lj;
    //   222: getfield d : I
    //   225: bipush #100
    //   227: imul
    //   228: i2l
    //   229: getstatic v.o : J
    //   232: invokestatic abs : (J)J
    //   235: ldiv
    //   236: l2i
    //   237: goto -> 259
    //   240: aload_0
    //   241: getfield a : Lj;
    //   244: getfield d : I
    //   247: bipush #100
    //   249: imul
    //   250: i2l
    //   251: getstatic v.p : J
    //   254: invokestatic abs : (J)J
    //   257: ldiv
    //   258: l2i
    //   259: istore_1
    //   260: getstatic v.do : Z
    //   263: ifeq -> 272
    //   266: iload_2
    //   267: ineg
    //   268: istore_2
    //   269: iload_1
    //   270: ineg
    //   271: istore_1
    //   272: aload_0
    //   273: getfield a : Lj;
    //   276: getfield a : [I
    //   279: aload_0
    //   280: getfield a : Lj;
    //   283: getfield e : I
    //   286: iload_2
    //   287: iastore
    //   288: aload_0
    //   289: getfield a : Lj;
    //   292: getfield b : [I
    //   295: aload_0
    //   296: getfield a : Lj;
    //   299: getfield e : I
    //   302: iload_1
    //   303: iastore
    //   304: aload_0
    //   305: getfield a : Lj;
    //   308: aload_0
    //   309: getfield a : Lj;
    //   312: getfield e : I
    //   315: iconst_1
    //   316: iadd
    //   317: bipush #10
    //   319: irem
    //   320: putfield e : I
    //   323: aload_0
    //   324: getfield a : Lj;
    //   327: getfield e : I
    //   330: ifle -> 334
    //   333: return
    //   334: iconst_0
    //   335: istore_2
    //   336: iconst_0
    //   337: istore_1
    //   338: iconst_0
    //   339: istore_3
    //   340: iload_3
    //   341: bipush #10
    //   343: if_icmpge -> 376
    //   346: iload_2
    //   347: aload_0
    //   348: getfield a : Lj;
    //   351: getfield a : [I
    //   354: iload_3
    //   355: iaload
    //   356: iadd
    //   357: istore_2
    //   358: iload_1
    //   359: aload_0
    //   360: getfield a : Lj;
    //   363: getfield b : [I
    //   366: iload_3
    //   367: iaload
    //   368: iadd
    //   369: istore_1
    //   370: iinc #3, 1
    //   373: goto -> 340
    //   376: iload_2
    //   377: bipush #10
    //   379: idiv
    //   380: istore_2
    //   381: iload_1
    //   382: bipush #10
    //   384: idiv
    //   385: istore_1
    //   386: iload_2
    //   387: bipush #-100
    //   389: bipush #100
    //   391: invokestatic b : (III)I
    //   394: istore_2
    //   395: iload_1
    //   396: bipush #-100
    //   398: bipush #100
    //   400: invokestatic b : (III)I
    //   403: istore_1
    //   404: aload_0
    //   405: getfield a : Lj;
    //   408: getfield a : I
    //   411: iload_2
    //   412: if_icmpne -> 427
    //   415: aload_0
    //   416: getfield a : Lj;
    //   419: getfield b : I
    //   422: iload_1
    //   423: if_icmpne -> 427
    //   426: return
    //   427: aload_0
    //   428: getfield a : Lj;
    //   431: iload_2
    //   432: putfield a : I
    //   435: aload_0
    //   436: getfield a : Lj;
    //   439: iload_1
    //   440: putfield b : I
    //   443: iload_2
    //   444: bipush #90
    //   446: if_icmple -> 462
    //   449: aload_0
    //   450: getfield a : Lj;
    //   453: sipush #270
    //   456: putfield f : I
    //   459: goto -> 477
    //   462: iload_2
    //   463: bipush #-90
    //   465: if_icmpge -> 477
    //   468: aload_0
    //   469: getfield a : Lj;
    //   472: bipush #90
    //   474: putfield f : I
    //   477: iload_1
    //   478: bipush #90
    //   480: if_icmple -> 496
    //   483: aload_0
    //   484: getfield a : Lj;
    //   487: sipush #180
    //   490: putfield f : I
    //   493: goto -> 510
    //   496: iload_1
    //   497: bipush #-90
    //   499: if_icmpge -> 510
    //   502: aload_0
    //   503: getfield a : Lj;
    //   506: iconst_0
    //   507: putfield f : I
    //   510: aload_0
    //   511: getfield a : Lj;
    //   514: getfield f : I
    //   517: getstatic af.p : I
    //   520: if_icmpeq -> 536
    //   523: getstatic af.b : Laf;
    //   526: aload_0
    //   527: getfield a : Lj;
    //   530: getfield f : I
    //   533: invokevirtual a : (I)V
    //   536: getstatic af.b : Laf;
    //   539: invokevirtual repaint : ()V
    //   542: return
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar\\u.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */