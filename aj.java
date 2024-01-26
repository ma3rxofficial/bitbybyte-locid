public final class aj implements Runnable {
  private String a;
  
  private af a;
  
  private boolean a = null;
  
  private String b = null;
  
  public aj(af paramaf, String paramString1, String paramString2, boolean paramBoolean) {
    this.a = null;
    this.a = false;
    this.a = paramaf;
    this.a = true;
    StringBuffer stringBuffer = new StringBuffer();
    if (paramString1 != null)
      for (paramBoolean = false; paramBoolean < paramString1.length(); paramBoolean++) {
        if (Character.isDigit(paramString1.charAt(paramBoolean)) || (paramString1.charAt(paramBoolean) == '+' && !paramBoolean))
          stringBuffer.append(paramString1.charAt(paramBoolean)); 
      }  
    paramString1 = stringBuffer.toString();
    this.a = v.a("sms://", paramString1);
    this.b = paramString2;
  }
  
  public final void run() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield a : Ljava/lang/String;
    //   6: invokestatic open : (Ljava/lang/String;)Ljavax/microedition/io/Connection;
    //   9: checkcast javax/wireless/messaging/MessageConnection
    //   12: dup
    //   13: astore_1
    //   14: ldc 'text'
    //   16: invokeinterface newMessage : (Ljava/lang/String;)Ljavax/wireless/messaging/Message;
    //   21: checkcast javax/wireless/messaging/TextMessage
    //   24: dup
    //   25: astore_2
    //   26: aload_0
    //   27: getfield b : Ljava/lang/String;
    //   30: invokeinterface setPayloadText : (Ljava/lang/String;)V
    //   35: aload_1
    //   36: aload_2
    //   37: invokeinterface send : (Ljavax/wireless/messaging/Message;)V
    //   42: aload_0
    //   43: getfield a : Laf;
    //   46: iconst_m1
    //   47: aload_0
    //   48: getfield a : Z
    //   51: ifeq -> 62
    //   54: bipush #71
    //   56: invokestatic d : (I)Ljava/lang/String;
    //   59: goto -> 67
    //   62: bipush #106
    //   64: invokestatic d : (I)Ljava/lang/String;
    //   67: ldc 'SMS'
    //   69: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   72: aload_1
    //   73: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   76: pop
    //   77: return
    //   78: pop
    //   79: aload_0
    //   80: getfield a : Laf;
    //   83: iconst_m1
    //   84: bipush #72
    //   86: invokestatic d : (I)Ljava/lang/String;
    //   89: ldc 'SMS'
    //   91: invokevirtual a : (ILjava/lang/String;Ljava/lang/String;)V
    //   94: aload_1
    //   95: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   98: pop
    //   99: return
    //   100: astore_0
    //   101: aload_1
    //   102: invokestatic a : (Ljava/lang/Object;)Ljava/lang/String;
    //   105: pop
    //   106: aload_0
    //   107: athrow
    // Exception table:
    //   from	to	target	type
    //   2	72	78	java/lang/Throwable
    //   2	72	100	finally
    //   78	94	100	finally
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\aj.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */