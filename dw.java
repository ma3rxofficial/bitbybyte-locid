import i.I;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.lcdui.Ticker;
import jimm.Jimm;

public final class dw implements CommandListener, ItemCommandListener {
  private static String X = null;
  
  public static int a = 0;
  
  public static int b = 0;
  
  public static Object c;
  
  private static be Y;
  
  private static String Z;
  
  public static final Command d = new Command(bb.a((short)14), 4, 1);
  
  public static Command e = new Command(bb.a((short)11), Jimm.j ? 3 : 2, 14);
  
  public static final Command f = new Command(bb.a((short)12), Jimm.j ? 3 : 2, 2);
  
  public static final Command g = new Command(bb.a((short)554), 4, 1);
  
  public static final Command h = new Command(bb.a((short)349), 3, 2);
  
  public static final Command i = new cc(bb.a((short)244), 8, 1, 51);
  
  public static final Command j = new cc(bb.a((short)188), 8, 4, 52);
  
  public static final Command k = new cc(bb.a((short)189), 8, 5, 48);
  
  public static final Command l = new cc(bb.a((short)189), 8, 5, 48);
  
  public static final Command m = new cc(bb.a((short)679), 8, 6, 55);
  
  public static final Command n = new Command(bb.a((short)217), 8, 1);
  
  public static final Command o = new Command(bb.a((short)143), 8, 2);
  
  public static final Command p = new Command(bb.a((short)332), 8, 1);
  
  public static final Command q = new cc(bb.a((short)9), 4, 1, 49);
  
  public static final Command r = new cc(bb.a((short)763), 8, 2, 49);
  
  public static final Command s = new cc(bb.a((short)285), 8, 1, 50);
  
  public static Command t = new Command(bb.a((short)17), 4, 1);
  
  public static final Command u = new cc(bb.a((short)395), 8, 4);
  
  public static final Command v = new cc(bb.a((short)379), 8, 4, 57);
  
  public static final Command w = new cc(bb.a((short)379), 8, 4, 57);
  
  public static final Command x = new Command(bb.a((short)287), 8, 3);
  
  public static final Command y = new Command(bb.a((short)482), 8, 4);
  
  public static final Command z = new cc(bb.a((short)268), 8, 7, 54);
  
  public static final Command A = new Command(bb.a((short)83), 8, 8);
  
  public static final Command B = new Command(bb.a((short)82), 8, 9);
  
  public static final Command C = new Command(bb.a((short)18), 8, 10);
  
  public static final Command D = new Command(bb.a((short)386), 8, 11);
  
  public static final Command E = new Command(bb.a((short)148), 8, 12);
  
  public static final Command F = new cc(bb.a((short)84), 8, 5, 49);
  
  public static final Command G = new cc(bb.a((short)85), 8, 6, 50);
  
  private static CommandListener aa;
  
  private static Hashtable ab = new Hashtable();
  
  private static dw ac;
  
  private static int[] ad;
  
  private static Form ae;
  
  private static int af = -1;
  
  private static be ag;
  
  public static String H;
  
  public static int I;
  
  public static int J;
  
  public static String K = "";
  
  public static boolean L = false;
  
  private static String ah;
  
  private static String ai;
  
  public static Graphics M;
  
  public static Font N;
  
  public static Runtime O;
  
  public static Hashtable P = new Hashtable();
  
  public static String Q;
  
  private static long aj = -1L;
  
  private static int ak;
  
  private static short al = -1;
  
  private static be am = null;
  
  private static String[] an;
  
  public static short[] R = new short[] { 197, 102, 103 };
  
  private static be ao;
  
  private static int ap;
  
  private static final long[] aq = new long[] { 
      1L, 32L, 2L, 256L, 4L, 16L, -1L, 0L, 12288L, 16384L, 
      20480L, 24576L, 8193L, 512L };
  
  public static final int[] S = new int[] { 
      0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
      10, 11, 12, 13 };
  
  private static final short[] ar = new short[] { 
      464, 465, 466, 467, 469, 470, 471, 472, 473, 474, 
      475, 476, 477, 468 };
  
  private static TextBox as;
  
  private Vector at = new Vector();
  
  private int au = 0;
  
  private static int av;
  
  private String aw;
  
  public static dm T;
  
  private static int ax;
  
  public static final Integer U = new Integer(0);
  
  private static be ay;
  
  private static Object az;
  
  private static int aA;
  
  private static TextBox aB;
  
  private static dm aC;
  
  private static be aD;
  
  public static dm V;
  
  public static be W;
  
  private static be aE;
  
  private static TextBox aF;
  
  private static be aG;
  
  private static ew aH;
  
  public static boolean a(int paramInt) {
    return ((paramInt & 0xFFFF) > 4501 || (paramInt >> 16 & 0x7FFF) > 78);
  }
  
  public static TextField a(TextField paramTextField) {
    paramTextField.addCommand(A);
    paramTextField.addCommand(B);
    paramTextField.addCommand(l);
    paramTextField.addCommand(w);
    paramTextField.setItemCommandListener(ac);
    return paramTextField;
  }
  
  public static TextField a(TextField paramTextField, Command paramCommand) {
    if (paramCommand != null && Jimm.k)
      paramTextField.addCommand(paramCommand); 
    return paramTextField;
  }
  
  private static boolean f(String paramString) {
    try {
      try {
        Class.forName(paramString);
      } catch (ClassNotFoundException classNotFoundException) {
        return false;
      } 
    } catch (Throwable throwable) {
      return false;
    } 
    return true;
  }
  
  public static String a() {
    String str = System.getProperty("microedition.platform");
    str = str + "|" + System.getProperty("device.manufacturer");
    str = str + "|" + System.getProperty("device.model");
    if (f("com.siemens.mp.lcdui.Image")) {
      str = "Siemens|" + str;
    } else if (f("com.motorola.phonebook.PhoneBookRecord") || f("com.motorola.Dialer") || f("com.motorola.phone.Dialer") || f("com.motorola.graphics.j3d.Light") || f("com.motorola.lwt.ComponentScreen") || f("com.motorola.game.GameScreen") || f("com.motorola.funlight.FunLight") || f("com.motorola.multimedia.Lighting") || f("com.motorola.io.ConnectorEvent") || f("com.motorola.extensions.ScalableJPGImage")) {
      str = "Motorola|" + str;
    } else if (f("com.samsung.util.AudioClip") || f("com.samsung.util.LCDLight") || f("com.samsung.util.SM") || f("com.samsung.util.SMS") || f("com.samsung.util.Vibration")) {
      str = "Samsung|" + str;
    } else {
      str = "Other|" + str;
    } 
    return str;
  }
  
  public static String b() {
    if (X != null)
      return X; 
    try {
      String[] arrayOfString = dh.a(a(), '|');
      if ("j2me".equals(arrayOfString[1])) {
        if ("null".equals(arrayOfString[2])) {
          X = arrayOfString[0];
        } else {
          X = arrayOfString[2] + " " + arrayOfString[3];
        } 
      } else {
        X = arrayOfString[1];
      } 
    } catch (Exception exception) {
      X = "Other";
    } 
    g("NOKIA");
    a("SONYERICSSON", "SE");
    g("SONY");
    g("SAMSUNG");
    g("SIEMENS");
    g("MOTOROLA");
    g("PANASONIC");
    return X;
  }
  
  private static void a(String paramString1, String paramString2) {
    if (X.toUpperCase().startsWith(paramString1)) {
      X = paramString2 + " " + X.substring(paramString1.length());
      dh.a(X, "  ", " ");
    } 
  }
  
  private static void g(String paramString) {
    a(paramString, paramString.substring(0, 2));
  }
  
  public static String c() {
    return cp.c();
  }
  
  public static String a(String paramString) {
    String str = "D";
    str = str + ":78";
    str = "L" + str;
    str = str + ":" + paramString;
    str = str + ":";
    str = str + a();
    str = str + "|" + (Runtime.getRuntime().freeMemory() / 1024L) + "/" + (Runtime.getRuntime().totalMemory() / 1024L);
    str = str + "|" + a + "x" + b;
    str = str + "|MIDP2";
    str = str + "|31.12.2009";
    return str + "|0x" + Integer.toHexString(4501);
  }
  
  public final void commandAction(Command paramCommand, Item paramItem) {
    if (paramItem instanceof TextField) {
      if (paramCommand == w) {
        ((TextField)paramItem).setString("" + ((TextField)paramItem).getString() + a(false));
        return;
      } 
      if (paramCommand == l) {
        a(((TextField)paramItem).getString(), false);
        return;
      } 
      if (paramCommand == B) {
        ((TextField)paramItem).setString(et.a(((TextField)paramItem).getString()));
        return;
      } 
      if (paramCommand == A)
        ((TextField)paramItem).setString(et.b(((TextField)paramItem).getString())); 
    } 
  }
  
  public static TextBox a(TextBox paramTextBox) {
    paramTextBox.addCommand(A);
    paramTextBox.addCommand(B);
    paramTextBox.addCommand(l);
    paramTextBox.addCommand(w);
    return paramTextBox;
  }
  
  private static boolean a(Command paramCommand, TextBox paramTextBox) {
    if (paramCommand == w) {
      int i = as.getCaretPosition();
      paramTextBox.insert(a((paramCommand == u)), i);
    } else if (paramCommand == l) {
      a(paramTextBox.getString(), false);
    } else if (paramCommand == B) {
      paramTextBox.setString(et.a(paramTextBox.getString()));
    } else if (paramCommand == A) {
      paramTextBox.setString(et.b(paramTextBox.getString()));
    } else {
      return false;
    } 
    return true;
  }
  
  public static void a(Object paramObject) {
    c = paramObject;
  }
  
  public static void d() {
    if (em.h(22))
      i(); 
    b(c);
    cz.a(false);
  }
  
  public static void b(Object paramObject) {
    if (paramObject instanceof bd) {
      ((bd)paramObject).b(Jimm.d);
      return;
    } 
    if (paramObject instanceof Displayable) {
      Jimm.d.setCurrent((Displayable)paramObject);
      return;
    } 
    cy.f();
  }
  
  public dw() {
    ac = this;
  }
  
  private static int a(Command paramCommand) {
    Object object;
    return ((object = ab.get(paramCommand)) == null) ? -1 : ((Integer)object).intValue();
  }
  
  private static void o() {
    ae = null;
    ag = null;
    i();
  }
  
  private static boolean b(dm paramdm) {
    return cj.b(paramdm);
  }
  
  private static void a(int paramInt, dm paramdm) {
    dp dp = new dp(paramInt, paramdm);
    try {
      cd.a(dp);
      return;
    } catch (cr cr) {
      cr.a(null);
      return;
    } 
  }
  
  private static boolean p() {
    return (em.f(209) > 0 && (T.m & 0x40000000) != 0 && em.f(238) != 2 && (em.f(238) != 3 || T.r() != 0));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof javax/microedition/lcdui/TextBox
    //   4: ifeq -> 19
    //   7: aload_1
    //   8: aload_2
    //   9: checkcast javax/microedition/lcdui/TextBox
    //   12: invokestatic a : (Ljavax/microedition/lcdui/Command;Ljavax/microedition/lcdui/TextBox;)Z
    //   15: ifeq -> 19
    //   18: return
    //   19: getstatic dw.aG : Lbe;
    //   22: invokestatic a : (Lbd;)Z
    //   25: ifeq -> 75
    //   28: aload_1
    //   29: getstatic dw.q : Ljavax/microedition/lcdui/Command;
    //   32: if_acmpne -> 65
    //   35: iconst_0
    //   36: istore_3
    //   37: iconst_0
    //   38: istore #4
    //   40: getstatic dw.aG : Lbe;
    //   43: invokevirtual A : ()I
    //   46: iconst_0
    //   47: istore #5
    //   49: getstatic dw.V : Ldm;
    //   52: invokestatic a : (ILdm;)V
    //   55: aconst_null
    //   56: putstatic dw.aG : Lbe;
    //   59: invokestatic i : ()V
    //   62: goto -> 484
    //   65: aconst_null
    //   66: putstatic dw.aG : Lbe;
    //   69: invokestatic i : ()V
    //   72: goto -> 484
    //   75: getstatic dw.W : Lbe;
    //   78: invokestatic a : (Lbd;)Z
    //   81: ifeq -> 107
    //   84: aload_1
    //   85: getstatic dw.d : Ljavax/microedition/lcdui/Command;
    //   88: if_acmpne -> 97
    //   91: invokestatic w : ()V
    //   94: goto -> 484
    //   97: invokestatic d : ()V
    //   100: aconst_null
    //   101: putstatic dw.W : Lbe;
    //   104: goto -> 484
    //   107: getstatic dw.aF : Ljavax/microedition/lcdui/TextBox;
    //   110: ifnull -> 143
    //   113: aload_2
    //   114: getstatic dw.aF : Ljavax/microedition/lcdui/TextBox;
    //   117: if_acmpne -> 143
    //   120: aload_1
    //   121: getstatic dw.d : Ljavax/microedition/lcdui/Command;
    //   124: if_acmpne -> 133
    //   127: invokestatic y : ()V
    //   130: goto -> 484
    //   133: invokestatic d : ()V
    //   136: aconst_null
    //   137: putstatic dw.aF : Ljavax/microedition/lcdui/TextBox;
    //   140: goto -> 484
    //   143: getstatic dw.aE : Lbe;
    //   146: invokestatic a : (Lbd;)Z
    //   149: ifeq -> 175
    //   152: aload_1
    //   153: getstatic dw.d : Ljavax/microedition/lcdui/Command;
    //   156: if_acmpne -> 165
    //   159: invokestatic x : ()V
    //   162: goto -> 484
    //   165: invokestatic d : ()V
    //   168: aconst_null
    //   169: putstatic dw.aE : Lbe;
    //   172: goto -> 484
    //   175: getstatic dw.aD : Lbe;
    //   178: invokestatic a : (Lbd;)Z
    //   181: ifeq -> 220
    //   184: aload_1
    //   185: getstatic dw.q : Ljavax/microedition/lcdui/Command;
    //   188: if_acmpne -> 203
    //   191: getstatic dw.aD : Lbe;
    //   194: invokevirtual A : ()I
    //   197: invokestatic d : (I)V
    //   200: goto -> 484
    //   203: invokestatic t : ()V
    //   206: invokestatic d : ()V
    //   209: aconst_null
    //   210: putstatic dw.aD : Lbe;
    //   213: aconst_null
    //   214: putstatic dw.V : Ldm;
    //   217: goto -> 484
    //   220: getstatic dw.aB : Ljavax/microedition/lcdui/TextBox;
    //   223: ifnull -> 484
    //   226: aload_2
    //   227: getstatic dw.aB : Ljavax/microedition/lcdui/TextBox;
    //   230: if_acmpne -> 484
    //   233: aload_1
    //   234: getstatic dw.t : Ljavax/microedition/lcdui/Command;
    //   237: if_acmpne -> 463
    //   240: aconst_null
    //   241: astore_3
    //   242: getstatic dw.aB : Ljavax/microedition/lcdui/TextBox;
    //   245: invokevirtual getString : ()Ljava/lang/String;
    //   248: dup
    //   249: astore #4
    //   251: ifnull -> 263
    //   254: aload #4
    //   256: invokevirtual length : ()I
    //   259: iconst_1
    //   260: if_icmpge -> 269
    //   263: ldc_w ''
    //   266: goto -> 271
    //   269: aload #4
    //   271: astore #5
    //   273: getstatic dw.aA : I
    //   276: lookupswitch default -> 343, 10001 -> 304, 10002 -> 325
    //   304: new bt
    //   307: dup
    //   308: iconst_4
    //   309: getstatic dw.aC : Ldm;
    //   312: invokevirtual getUinString : ()Ljava/lang/String;
    //   315: iconst_0
    //   316: aload #5
    //   318: invokespecial <init> : (ILjava/lang/String;ZLjava/lang/String;)V
    //   321: astore_3
    //   322: goto -> 343
    //   325: new bt
    //   328: dup
    //   329: iconst_5
    //   330: getstatic dw.aC : Ldm;
    //   333: invokevirtual getUinString : ()Ljava/lang/String;
    //   336: iconst_0
    //   337: aload #5
    //   339: invokespecial <init> : (ILjava/lang/String;ZLjava/lang/String;)V
    //   342: astore_3
    //   343: new cv
    //   346: dup
    //   347: aload_3
    //   348: invokespecial <init> : (Lbt;)V
    //   351: astore #6
    //   353: new ei
    //   356: dup
    //   357: getstatic dw.aC : Ldm;
    //   360: iconst_5
    //   361: invokespecial <init> : (Ler;I)V
    //   364: astore #7
    //   366: aload #6
    //   368: invokestatic a : (Lbg;)V
    //   371: getstatic dw.aC : Ldm;
    //   374: bipush #8
    //   376: invokevirtual getBooleanValue : (I)Z
    //   379: ifeq -> 387
    //   382: aload #7
    //   384: invokestatic a : (Lbg;)V
    //   387: goto -> 406
    //   390: dup
    //   391: astore #8
    //   393: invokestatic a : (Lcr;)Ljavax/microedition/lcdui/Alert;
    //   396: pop
    //   397: aload #8
    //   399: getfield a : Z
    //   402: ifeq -> 406
    //   405: return
    //   406: getstatic dw.aA : I
    //   409: lookupswitch default -> 463, 10001 -> 436, 10002 -> 454
    //   436: getstatic dw.aC : Ldm;
    //   439: bipush #70
    //   441: iconst_0
    //   442: invokevirtual a : (II)V
    //   445: getstatic dw.aC : Ldm;
    //   448: invokestatic c : (Ldm;)V
    //   451: goto -> 463
    //   454: getstatic dw.aC : Ldm;
    //   457: bipush #8
    //   459: iconst_0
    //   460: invokevirtual a : (IZ)V
    //   463: getstatic dw.aC : Ldm;
    //   466: invokestatic b : (Ldm;)Z
    //   469: ifne -> 475
    //   472: invokestatic i : ()V
    //   475: aconst_null
    //   476: putstatic dw.aB : Ljavax/microedition/lcdui/TextBox;
    //   479: aconst_null
    //   480: putstatic dw.aC : Ldm;
    //   483: return
    //   484: getstatic dw.ay : Lbe;
    //   487: invokestatic a : (Lbd;)Z
    //   490: ifeq -> 534
    //   493: aload_1
    //   494: getstatic dw.q : Ljavax/microedition/lcdui/Command;
    //   497: if_acmpne -> 519
    //   500: getstatic jimm/Jimm.c : Ljimm/Jimm;
    //   503: getstatic dw.ay : Lbe;
    //   506: iconst_0
    //   507: iconst_0
    //   508: invokevirtual a : (IZ)Ljava/lang/String;
    //   511: invokevirtual platformRequest : (Ljava/lang/String;)Z
    //   514: pop
    //   515: goto -> 519
    //   518: pop
    //   519: getstatic dw.az : Ljava/lang/Object;
    //   522: invokestatic b : (Ljava/lang/Object;)V
    //   525: aconst_null
    //   526: putstatic dw.ay : Lbe;
    //   529: aconst_null
    //   530: putstatic dw.az : Ljava/lang/Object;
    //   533: return
    //   534: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   537: ifnull -> 894
    //   540: aload_2
    //   541: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   544: if_acmpne -> 894
    //   547: bipush #10
    //   549: invokestatic h : (I)Z
    //   552: ifne -> 595
    //   555: aload_1
    //   556: getstatic dw.e : Ljavax/microedition/lcdui/Command;
    //   559: if_acmpeq -> 569
    //   562: aload_1
    //   563: getstatic dw.t : Ljavax/microedition/lcdui/Command;
    //   566: if_acmpne -> 595
    //   569: invokestatic p : ()Z
    //   572: ifeq -> 595
    //   575: getstatic jimm/Jimm.c : Ljimm/Jimm;
    //   578: getfield e : Lcd;
    //   581: getstatic dw.T : Ldm;
    //   584: invokevirtual getUinString : ()Ljava/lang/String;
    //   587: iconst_0
    //   588: invokevirtual a : (Ljava/lang/String;Z)V
    //   591: goto -> 595
    //   594: pop
    //   595: aload_1
    //   596: getstatic dw.e : Ljavax/microedition/lcdui/Command;
    //   599: if_acmpne -> 606
    //   602: invokestatic d : ()V
    //   605: return
    //   606: aload_1
    //   607: getstatic dw.t : Ljavax/microedition/lcdui/Command;
    //   610: if_acmpne -> 699
    //   613: getstatic dw.ax : I
    //   616: lookupswitch default -> 698, 200001 -> 636
    //   636: aload_0
    //   637: invokespecial u : ()Ljava/lang/String;
    //   640: dup
    //   641: astore #4
    //   643: invokevirtual length : ()I
    //   646: ifeq -> 695
    //   649: aload #4
    //   651: ifnull -> 662
    //   654: aload #4
    //   656: invokevirtual length : ()I
    //   659: invokestatic e : (I)V
    //   662: aload #4
    //   664: getstatic dw.T : Ldm;
    //   667: iconst_2
    //   668: invokestatic b : (Ljava/lang/String;Ldm;B)V
    //   671: aload_0
    //   672: aconst_null
    //   673: invokespecial l : (Ljava/lang/String;)V
    //   676: getstatic jimm/Jimm.i : Z
    //   679: ifeq -> 686
    //   682: aconst_null
    //   683: putstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   686: getstatic dw.T : Ldm;
    //   689: invokestatic b : (Ldm;)Z
    //   692: ifne -> 698
    //   695: invokestatic d : ()V
    //   698: return
    //   699: aload_1
    //   700: getstatic dw.x : Ljavax/microedition/lcdui/Command;
    //   703: if_acmpne -> 716
    //   706: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   709: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   712: invokestatic a : (Ljavax/microedition/lcdui/TextBox;Ljava/lang/Object;)V
    //   715: return
    //   716: aload_1
    //   717: getstatic dw.y : Ljavax/microedition/lcdui/Command;
    //   720: if_acmpne -> 733
    //   723: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   726: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   729: invokestatic a : (Ljavax/microedition/lcdui/TextBox;Ljava/lang/Object;)V
    //   732: return
    //   733: aload_1
    //   734: getstatic dw.E : Ljavax/microedition/lcdui/Command;
    //   737: if_acmpne -> 746
    //   740: aload_0
    //   741: aconst_null
    //   742: invokespecial l : (Ljava/lang/String;)V
    //   745: return
    //   746: aload_1
    //   747: getstatic dw.u : Ljavax/microedition/lcdui/Command;
    //   750: if_acmpeq -> 760
    //   753: aload_1
    //   754: getstatic dw.v : Ljavax/microedition/lcdui/Command;
    //   757: if_acmpne -> 790
    //   760: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   763: invokevirtual getCaretPosition : ()I
    //   766: istore #4
    //   768: aload_0
    //   769: aload_1
    //   770: getstatic dw.u : Ljavax/microedition/lcdui/Command;
    //   773: if_acmpne -> 780
    //   776: iconst_1
    //   777: goto -> 781
    //   780: iconst_0
    //   781: invokestatic a : (Z)Ljava/lang/String;
    //   784: iload #4
    //   786: invokespecial a : (Ljava/lang/String;I)V
    //   789: return
    //   790: aload_1
    //   791: getstatic dw.B : Ljavax/microedition/lcdui/Command;
    //   794: if_acmpne -> 813
    //   797: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   800: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   803: invokevirtual getString : ()Ljava/lang/String;
    //   806: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   809: invokevirtual setString : (Ljava/lang/String;)V
    //   812: return
    //   813: aload_1
    //   814: getstatic dw.A : Ljavax/microedition/lcdui/Command;
    //   817: if_acmpne -> 836
    //   820: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   823: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   826: invokevirtual getString : ()Ljava/lang/String;
    //   829: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
    //   832: invokevirtual setString : (Ljava/lang/String;)V
    //   835: return
    //   836: aload_1
    //   837: getstatic dw.C : Ljavax/microedition/lcdui/Command;
    //   840: if_acmpne -> 854
    //   843: aload_0
    //   844: aload_0
    //   845: getfield au : I
    //   848: iconst_1
    //   849: iadd
    //   850: invokespecial c : (I)V
    //   853: return
    //   854: aload_1
    //   855: getstatic dw.D : Ljavax/microedition/lcdui/Command;
    //   858: if_acmpne -> 872
    //   861: aload_0
    //   862: aload_0
    //   863: getfield au : I
    //   866: iconst_1
    //   867: isub
    //   868: invokespecial c : (I)V
    //   871: return
    //   872: iconst_1
    //   873: anewarray java/lang/Object
    //   876: dup
    //   877: iconst_0
    //   878: getstatic dw.as : Ljavax/microedition/lcdui/TextBox;
    //   881: aastore
    //   882: astore #4
    //   884: bipush #28
    //   886: aload #4
    //   888: aload_1
    //   889: invokestatic a : (I[Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   892: pop
    //   893: return
    //   894: getstatic dw.ag : Lbe;
    //   897: invokestatic a : (Lbd;)Z
    //   900: ifeq -> 961
    //   903: aload_1
    //   904: getstatic dw.f : Ljavax/microedition/lcdui/Command;
    //   907: if_acmpne -> 918
    //   910: invokestatic f : ()V
    //   913: aconst_null
    //   914: putstatic dw.ag : Lbe;
    //   917: return
    //   918: aload_1
    //   919: getstatic dw.F : Ljavax/microedition/lcdui/Command;
    //   922: if_acmpne -> 941
    //   925: getstatic jimm/Jimm.c : Ljimm/Jimm;
    //   928: sipush #145
    //   931: invokestatic d : (I)Ljava/lang/String;
    //   934: invokevirtual platformRequest : (Ljava/lang/String;)Z
    //   937: pop
    //   938: return
    //   939: pop
    //   940: return
    //   941: aload_1
    //   942: getstatic dw.G : Ljavax/microedition/lcdui/Command;
    //   945: if_acmpne -> 1368
    //   948: getstatic jimm/Jimm.c : Ljimm/Jimm;
    //   951: ldc_w 'http://wapland.org/forum'
    //   954: invokevirtual platformRequest : (Ljava/lang/String;)Z
    //   957: pop
    //   958: return
    //   959: pop
    //   960: return
    //   961: getstatic dw.am : Lbe;
    //   964: invokestatic a : (Lbd;)Z
    //   967: ifeq -> 1203
    //   970: aload_1
    //   971: getstatic dw.e : Ljavax/microedition/lcdui/Command;
    //   974: if_acmpeq -> 984
    //   977: aload_1
    //   978: getstatic dw.f : Ljavax/microedition/lcdui/Command;
    //   981: if_acmpne -> 987
    //   984: invokestatic d : ()V
    //   987: aload_1
    //   988: getstatic dw.n : Ljavax/microedition/lcdui/Command;
    //   991: if_acmpne -> 1006
    //   994: getstatic dw.an : [Ljava/lang/String;
    //   997: getstatic jimm/Jimm.d : Ljavax/microedition/lcdui/Display;
    //   1000: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   1003: invokestatic a : ([Ljava/lang/String;Ljavax/microedition/lcdui/Displayable;)V
    //   1006: aload_1
    //   1007: getstatic dw.o : Ljavax/microedition/lcdui/Command;
    //   1010: if_acmpne -> 1023
    //   1013: getstatic jimm/Jimm.d : Ljavax/microedition/lcdui/Display;
    //   1016: invokevirtual getCurrent : ()Ljavax/microedition/lcdui/Displayable;
    //   1019: invokestatic a : (Ljavax/microedition/lcdui/Displayable;)V
    //   1022: return
    //   1023: aload_1
    //   1024: getstatic dw.j : Ljavax/microedition/lcdui/Command;
    //   1027: if_acmpeq -> 1044
    //   1030: aload_1
    //   1031: getstatic dw.k : Ljavax/microedition/lcdui/Command;
    //   1034: if_acmpeq -> 1044
    //   1037: aload_1
    //   1038: getstatic dw.m : Ljavax/microedition/lcdui/Command;
    //   1041: if_acmpne -> 1113
    //   1044: new java/lang/StringBuffer
    //   1047: dup
    //   1048: invokespecial <init> : ()V
    //   1051: ldc_w '['
    //   1054: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1057: getstatic dw.am : Lbe;
    //   1060: invokestatic c : (Ljava/lang/Object;)Ljava/lang/String;
    //   1063: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1066: ldc_w ']\\n'
    //   1069: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1072: getstatic dw.am : Lbe;
    //   1075: iconst_0
    //   1076: aload_1
    //   1077: getstatic dw.k : Ljavax/microedition/lcdui/Command;
    //   1080: if_acmpne -> 1087
    //   1083: iconst_1
    //   1084: goto -> 1088
    //   1087: iconst_0
    //   1088: invokevirtual a : (IZ)Ljava/lang/String;
    //   1091: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1094: invokevirtual toString : ()Ljava/lang/String;
    //   1097: aload_1
    //   1098: getstatic dw.m : Ljavax/microedition/lcdui/Command;
    //   1101: if_acmpne -> 1108
    //   1104: iconst_1
    //   1105: goto -> 1109
    //   1108: iconst_0
    //   1109: invokestatic a : (Ljava/lang/String;Z)V
    //   1112: return
    //   1113: aload_1
    //   1114: getstatic dw.r : Ljavax/microedition/lcdui/Command;
    //   1117: if_acmpne -> 1148
    //   1120: bipush #69
    //   1122: invokestatic h : (I)Z
    //   1125: ifeq -> 1368
    //   1128: getstatic dw.an : [Ljava/lang/String;
    //   1131: iconst_0
    //   1132: aaload
    //   1133: aconst_null
    //   1134: invokestatic a : (Ljava/lang/String;Ldm;)Z
    //   1137: pop
    //   1138: getstatic dw.am : Lbe;
    //   1141: getstatic dw.r : Ljavax/microedition/lcdui/Command;
    //   1144: invokevirtual b : (Ljavax/microedition/lcdui/Command;)V
    //   1147: return
    //   1148: aload_1
    //   1149: getstatic dw.s : Ljavax/microedition/lcdui/Command;
    //   1152: if_acmpne -> 1368
    //   1155: getstatic dw.an : [Ljava/lang/String;
    //   1158: iconst_0
    //   1159: aaload
    //   1160: aconst_null
    //   1161: astore_3
    //   1162: invokestatic a : (Ljava/lang/String;)Ldm;
    //   1165: astore #4
    //   1167: getstatic dw.an : [Ljava/lang/String;
    //   1170: iconst_1
    //   1171: aaload
    //   1172: astore #5
    //   1174: aload #4
    //   1176: ifnull -> 1202
    //   1179: aload #5
    //   1181: ifnull -> 1202
    //   1184: ldc_w ''
    //   1187: aload #5
    //   1189: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1192: ifne -> 1202
    //   1195: aload #4
    //   1197: aload #5
    //   1199: invokevirtual a : (Ljava/lang/String;)V
    //   1202: return
    //   1203: getstatic dw.ao : Lbe;
    //   1206: invokestatic a : (Lbd;)Z
    //   1209: ifeq -> 1337
    //   1212: getstatic dw.ao : Lbe;
    //   1215: invokevirtual A : ()I
    //   1218: putstatic dw.ap : I
    //   1221: aload_1
    //   1222: getstatic dw.e : Ljavax/microedition/lcdui/Command;
    //   1225: if_acmpne -> 1235
    //   1228: invokestatic d : ()V
    //   1231: invokestatic q : ()V
    //   1234: return
    //   1235: aload_1
    //   1236: getstatic dw.d : Ljavax/microedition/lcdui/Command;
    //   1239: if_acmpne -> 1368
    //   1242: getstatic dw.af : I
    //   1245: iconst_5
    //   1246: if_icmpne -> 1323
    //   1249: getstatic dw.V : Ldm;
    //   1252: bipush #65
    //   1254: invokevirtual getIntValue : (I)I
    //   1257: istore_3
    //   1258: getstatic dw.ad : [I
    //   1261: invokestatic l : ()I
    //   1264: iaload
    //   1265: istore #4
    //   1267: iload_3
    //   1268: invokestatic c : (I)Lbu;
    //   1271: astore #5
    //   1273: iload #4
    //   1275: invokestatic c : (I)Lbu;
    //   1278: astore #6
    //   1280: new ei
    //   1283: dup
    //   1284: getstatic dw.V : Ldm;
    //   1287: aload #5
    //   1289: aload #6
    //   1291: invokespecial <init> : (Ldm;Lbu;Lbu;)V
    //   1294: astore #7
    //   1296: aload #7
    //   1298: invokestatic a : (Lbg;)V
    //   1301: sipush #543
    //   1304: invokestatic a : (S)Ljava/lang/String;
    //   1307: aload #7
    //   1309: iconst_0
    //   1310: invokestatic a : (Ljava/lang/String;Lbg;Z)V
    //   1313: goto -> 1333
    //   1316: invokestatic a : (Lcr;)Ljavax/microedition/lcdui/Alert;
    //   1319: pop
    //   1320: goto -> 1333
    //   1323: getstatic dw.aa : Ljavax/microedition/lcdui/CommandListener;
    //   1326: aload_1
    //   1327: aload_2
    //   1328: invokeinterface commandAction : (Ljavax/microedition/lcdui/Command;Ljavax/microedition/lcdui/Displayable;)V
    //   1333: invokestatic q : ()V
    //   1336: return
    //   1337: getstatic dw.ae : Ljavax/microedition/lcdui/Form;
    //   1340: ifnull -> 1368
    //   1343: aload_2
    //   1344: getstatic dw.ae : Ljavax/microedition/lcdui/Form;
    //   1347: if_acmpne -> 1368
    //   1350: getstatic dw.aa : Ljavax/microedition/lcdui/CommandListener;
    //   1353: aload_1
    //   1354: aload_2
    //   1355: invokeinterface commandAction : (Ljavax/microedition/lcdui/Command;Ljavax/microedition/lcdui/Displayable;)V
    //   1360: aconst_null
    //   1361: putstatic dw.ae : Ljavax/microedition/lcdui/Form;
    //   1364: iconst_m1
    //   1365: putstatic dw.af : I
    //   1368: return
    // Exception table:
    //   from	to	target	type
    //   366	387	390	cr
    //   500	515	518	java/lang/Exception
    //   575	591	594	cr
    //   925	938	939	java/lang/Exception
    //   948	958	959	java/lang/Exception
    //   1296	1313	1316	cr
  }
  
  private static void q() {
    ao = null;
    aa = null;
    af = -1;
  }
  
  public static void a(Object paramObject, String paramString1, String paramString2) {
    if (paramObject instanceof bd) {
      Object object = null;
      ((bd)paramObject).a_(paramString1);
      return;
    } 
    if (paramObject instanceof Displayable) {
      boolean bool = true;
      if (paramObject instanceof TextBox)
        try {
          TextBox textBox = (TextBox)paramObject;
          if (em.h(58) && textBox.getTitle() == null) {
            if (textBox.getTicker() == null) {
              textBox.setTicker(new Ticker(paramString2));
            } else if (paramString2 != null && !paramString2.equals(textBox.getTicker().getString())) {
              textBox.getTicker().setString(paramString2);
            } 
            bool = false;
          } 
        } catch (Exception exception) {} 
      if (bool)
        ((Displayable)paramObject).setTitle(paramString1); 
    } 
  }
  
  public static String c(Object paramObject) {
    if (paramObject == null)
      return null; 
    String str = null;
    if (paramObject instanceof bd) {
      str = ((bd)paramObject).q;
    } else if (paramObject instanceof Displayable) {
      str = ((Displayable)paramObject).getTitle();
    } 
    return str;
  }
  
  public static int e() {
    return (ae != null && ae.isShown()) ? af : (a(Y) ? af : (a(ao) ? af : -1));
  }
  
  public static int a(Command paramCommand, int paramInt) {
    return (af == paramInt) ? a(paramCommand) : -1;
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, CommandListener paramCommandListener, int paramInt2) {
    o();
    af = paramInt2;
    ae = new Form(paramString1);
    ae.append(paramString2);
    switch (paramInt1) {
      case 1:
        ae.addCommand(g);
        ae.addCommand(h);
        break;
      case 2:
        ae.addCommand(d);
        ae.addCommand(e);
        break;
    } 
    aa = paramCommandListener;
    ae.setCommandListener(ac);
    Jimm.d.setCurrent((Displayable)ae);
  }
  
  public static be a(dm paramdm, String paramString1, String paramString2, int paramInt) {
    Y = new be(paramString1);
    Y.e(3);
    Y.c(em.f(239) * 8);
    Y.a(paramString2, bd.g(), em.f(240), -1);
    switch (paramInt) {
      case 1:
        Y.a(g, bd.Z);
        Y.a(h, bd.aa);
        break;
      case 2:
        Y.a(d, bd.Z);
        Y.a(e, bd.aa);
        break;
    } 
    V = paramdm;
    Y.a(ac);
    Y.b(Jimm.d);
    return Y;
  }
  
  public static void f() {
    i();
    long l = Runtime.getRuntime().freeMemory() / 1024L;
    if (ag == null)
      ag = new be(null); 
    ag.q();
    ag.z();
    ag.e(3);
    ag.c(8);
    ag.a_(bb.a((short)89));
    String str1 = ", ";
    Z = dh.a((int)eu.a(), true);
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer()).append(" ");
    stringBuffer.append(dh.a(bb.a((short)90), "\\n", "\n"));
    stringBuffer.append(Z);
    stringBuffer.append(dh.a(bb.a((short)91), "\\n", "\n"));
    stringBuffer.append("\n");
    stringBuffer.append(dh.a(bb.a((short)337), "\\n", "\n"));
    stringBuffer.append(": \n");
    stringBuffer.append(Jimm.p);
    if (Jimm.q != null)
      stringBuffer.append(str1).append(Jimm.q); 
    String str2;
    if ((str2 = System.getProperty("microedition.locale")) != null)
      stringBuffer.append(str1).append(str2); 
    stringBuffer.append("\n\n").append(dh.a(bb.a((short)255), "\\n", "\n")).append(": ").append(l).append("kb\n").append(bb.a((short)488)).append(": ").append(Runtime.getRuntime().totalMemory() / 1024L).append("kb\n\n").append(bb.a((short)317)).append(": ");
    if (H == null)
      stringBuffer.append("...\n"); 
    try {
      if (ef.k)
        ag.x(-1).a(ef.a, em.g(16), 0, -1).x(-1); 
      ag.x(-1).a(stringBuffer.toString(), em.g(1), 0, -1);
      if (H != null)
        k(); 
      ag.a(p, bd.Z);
      ag.a(f, bd.aa);
      ag.a(F, bd.ab);
      ag.a(G, bd.ab);
      ag.a(ac);
    } catch (Exception exception) {}
    ag.s();
    ag.b(Jimm.d);
    if (H == null)
      b(100); 
  }
  
  public static void b(int paramInt) {}
  
  private static String b(String paramString1, String paramString2) {
    StringBuffer stringBuffer = new StringBuffer(paramString1.length() + 20);
    int i = paramString1.length();
    boolean bool = true;
    for (byte b = 0; b < i; b++) {
      char c = paramString1.charAt(b);
      if (bool)
        stringBuffer.append(paramString2); 
      stringBuffer.append(c);
      bool = (c == '\n') ? true : false;
    } 
    return stringBuffer.toString();
  }
  
  public static boolean g() {
    return (ah == null);
  }
  
  public static String a(boolean paramBoolean) {
    return !paramBoolean ? ah : ai;
  }
  
  private static String b(String paramString1, String paramString2, boolean paramBoolean) {
    StringBuffer stringBuffer = new StringBuffer();
    String str = bb.a(paramBoolean ? 556 : 557);
    if (paramString2 != null) {
      stringBuffer.append(str);
      stringBuffer.append('[').append(paramString2.trim()).append(']').append('\n');
    } 
    if (paramString1 != null)
      stringBuffer.append(b(paramString1, str)); 
    return stringBuffer.toString();
  }
  
  public static void a(String paramString, boolean paramBoolean) {
    if (paramBoolean && ah != null) {
      ah += paramString;
    } else {
      ah = paramString;
    } 
    ai = b(paramString, (String)null, true);
    if (paramBoolean && ai != null) {
      ai += b(paramString, (String)null, true);
      return;
    } 
    ai = b(paramString, (String)null, true);
  }
  
  public static void a(boolean paramBoolean1, String paramString1, String paramString2, String paramString3, boolean paramBoolean2) {
    if (paramBoolean2 && ah != null) {
      ah += paramString3;
    } else {
      ah = paramString3;
    } 
    String str = null;
    if (paramString1 != null && paramString1 != "***error***") {
      str = paramString2 + ' ' + paramString1;
    } else {
      str = paramString2;
    } 
    if (paramBoolean2 && ai != null) {
      ai += b(paramString3, str, paramBoolean1);
      return;
    } 
    ai = b(paramString3, str, paramBoolean1);
  }
  
  public static void a(Graphics paramGraphics, Font paramFont, int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokevirtual setColor : (I)V
    //   5: aload_0
    //   6: getstatic dw.M : Ljavax/microedition/lcdui/Graphics;
    //   9: if_acmpne -> 19
    //   12: aload_1
    //   13: getstatic dw.N : Ljavax/microedition/lcdui/Font;
    //   16: if_acmpeq -> 36
    //   19: aload_1
    //   20: ifnull -> 36
    //   23: aload_0
    //   24: putstatic dw.M : Ljavax/microedition/lcdui/Graphics;
    //   27: aload_1
    //   28: putstatic dw.N : Ljavax/microedition/lcdui/Font;
    //   31: aload_0
    //   32: aload_1
    //   33: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   36: sipush #244
    //   39: invokestatic f : (I)I
    //   42: istore #8
    //   44: iload #7
    //   46: bipush #11
    //   48: if_icmpne -> 54
    //   51: iconst_0
    //   52: istore #8
    //   54: iload #8
    //   56: tableswitch default -> 433, 0 -> 433, 1 -> 84, 2 -> 210
    //   84: iload_2
    //   85: ldc_w 8421504
    //   88: iand
    //   89: ifeq -> 96
    //   92: iconst_1
    //   93: goto -> 97
    //   96: iconst_0
    //   97: istore #9
    //   99: iload_2
    //   100: ldc_w 4210752
    //   103: iand
    //   104: ifeq -> 111
    //   107: iconst_1
    //   108: goto -> 112
    //   111: iconst_0
    //   112: istore #10
    //   114: iload #9
    //   116: ifeq -> 137
    //   119: iload #10
    //   121: ifeq -> 127
    //   124: goto -> 150
    //   127: aload_0
    //   128: ldc_w 4210752
    //   131: invokevirtual setColor : (I)V
    //   134: goto -> 157
    //   137: iload #10
    //   139: ifeq -> 150
    //   142: aload_0
    //   143: iconst_0
    //   144: invokevirtual setColor : (I)V
    //   147: goto -> 157
    //   150: aload_0
    //   151: ldc_w 8421504
    //   154: invokevirtual setColor : (I)V
    //   157: aload_0
    //   158: aload_3
    //   159: iload #4
    //   161: iconst_1
    //   162: iadd
    //   163: iload #5
    //   165: iconst_1
    //   166: iadd
    //   167: iload #6
    //   169: invokevirtual drawString : (Ljava/lang/String;III)V
    //   172: aload_0
    //   173: aload_3
    //   174: iload #4
    //   176: iconst_1
    //   177: iadd
    //   178: iload #5
    //   180: iconst_0
    //   181: iadd
    //   182: iload #6
    //   184: invokevirtual drawString : (Ljava/lang/String;III)V
    //   187: aload_0
    //   188: aload_3
    //   189: iload #4
    //   191: iconst_0
    //   192: iadd
    //   193: iload #5
    //   195: iconst_1
    //   196: iadd
    //   197: iload #6
    //   199: invokevirtual drawString : (Ljava/lang/String;III)V
    //   202: aload_0
    //   203: iload_2
    //   204: invokevirtual setColor : (I)V
    //   207: goto -> 433
    //   210: iload_2
    //   211: bipush #16
    //   213: ishr
    //   214: sipush #255
    //   217: iand
    //   218: istore #9
    //   220: iload_2
    //   221: bipush #8
    //   223: ishr
    //   224: sipush #255
    //   227: iand
    //   228: istore #10
    //   230: iload_2
    //   231: iconst_0
    //   232: ishr
    //   233: sipush #255
    //   236: iand
    //   237: istore #11
    //   239: iload #9
    //   241: iload #9
    //   243: iadd
    //   244: sipush #255
    //   247: iadd
    //   248: iconst_3
    //   249: idiv
    //   250: istore #12
    //   252: iload #10
    //   254: iload #10
    //   256: iadd
    //   257: sipush #255
    //   260: iadd
    //   261: iconst_3
    //   262: idiv
    //   263: istore #13
    //   265: iload #11
    //   267: iload #11
    //   269: iadd
    //   270: sipush #255
    //   273: iadd
    //   274: iconst_3
    //   275: idiv
    //   276: istore #14
    //   278: iload #9
    //   280: iload #9
    //   282: iadd
    //   283: iconst_3
    //   284: idiv
    //   285: istore #15
    //   287: iload #10
    //   289: iload #10
    //   291: iadd
    //   292: iconst_3
    //   293: idiv
    //   294: istore #16
    //   296: iload #11
    //   298: iload #11
    //   300: iadd
    //   301: iconst_3
    //   302: idiv
    //   303: istore #17
    //   305: iload #12
    //   307: bipush #8
    //   309: ishl
    //   310: iload #13
    //   312: iadd
    //   313: bipush #8
    //   315: ishl
    //   316: iload #14
    //   318: iadd
    //   319: istore #18
    //   321: iload #15
    //   323: bipush #8
    //   325: ishl
    //   326: iload #16
    //   328: iadd
    //   329: bipush #8
    //   331: ishl
    //   332: iload #17
    //   334: iadd
    //   335: istore #19
    //   337: iload #15
    //   339: iload #17
    //   341: iadd
    //   342: iload #16
    //   344: iadd
    //   345: sipush #128
    //   348: if_icmpge -> 356
    //   351: ldc_w 8421504
    //   354: istore #19
    //   356: aload_0
    //   357: iload #18
    //   359: invokevirtual setColor : (I)V
    //   362: aload_0
    //   363: aload_3
    //   364: iload #4
    //   366: iconst_1
    //   367: isub
    //   368: iload #5
    //   370: iconst_0
    //   371: isub
    //   372: iload #6
    //   374: invokevirtual drawString : (Ljava/lang/String;III)V
    //   377: aload_0
    //   378: aload_3
    //   379: iload #4
    //   381: iconst_0
    //   382: isub
    //   383: iload #5
    //   385: iconst_1
    //   386: isub
    //   387: iload #6
    //   389: invokevirtual drawString : (Ljava/lang/String;III)V
    //   392: aload_0
    //   393: iload #19
    //   395: invokevirtual setColor : (I)V
    //   398: aload_0
    //   399: aload_3
    //   400: iload #4
    //   402: iconst_1
    //   403: iadd
    //   404: iload #5
    //   406: iconst_0
    //   407: iadd
    //   408: iload #6
    //   410: invokevirtual drawString : (Ljava/lang/String;III)V
    //   413: aload_0
    //   414: aload_3
    //   415: iload #4
    //   417: iconst_0
    //   418: iadd
    //   419: iload #5
    //   421: iconst_1
    //   422: iadd
    //   423: iload #6
    //   425: invokevirtual drawString : (Ljava/lang/String;III)V
    //   428: aload_0
    //   429: iload_2
    //   430: invokevirtual setColor : (I)V
    //   433: aload_0
    //   434: aload_3
    //   435: iload #4
    //   437: iload #5
    //   439: iload #6
    //   441: invokevirtual drawString : (Ljava/lang/String;III)V
    //   444: return
  }
  
  public static void h() {
    M = null;
  }
  
  public static void i() {
    fb.a(18);
  }
  
  public static void j() {
    Thread.currentThread().setPriority(10);
    System.gc();
    if (O == null)
      O = Runtime.getRuntime(); 
    if (O != null)
      O.gc(); 
    if (em.h(74) && Runtime.getRuntime().freeMemory() < 200000L) {
      Vector vector = new Vector();
      int i = 204800;
      try {
        while (i > 0) {
          vector.addElement(new byte[10240]);
          i -= 10240;
        } 
        vector.removeAllElements();
      } catch (Throwable throwable) {}
      System.gc();
      if (O != null)
        O.gc(); 
    } 
  }
  
  public static String b(String paramString) {
    if (paramString == null)
      return ""; 
    StringBuffer stringBuffer = new StringBuffer(paramString.length() * 6 + 4);
    try {
      if (paramString == null)
        return ""; 
      byte[] arrayOfByte = paramString.getBytes("utf-8");
      for (byte b = 0; b < arrayOfByte.length; b++) {
        if ((arrayOfByte[b] >= 97 && arrayOfByte[b] <= 122) || (arrayOfByte[b] >= 65 && arrayOfByte[b] <= 90) || (arrayOfByte[b] >= 48 && arrayOfByte[b] <= 57)) {
          stringBuffer.append((char)arrayOfByte[b]);
        } else {
          String str;
          if ((str = Integer.toHexString(arrayOfByte[b] & 0xFF)).length() < 2) {
            stringBuffer.append("%0");
          } else {
            stringBuffer.append('%');
          } 
          stringBuffer.append(str);
        } 
      } 
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      null.printStackTrace();
      return null;
    } 
    return stringBuffer.toString();
  }
  
  public static void k() {
    ag.a(H, bd.g(), 0, -1);
    ag.x(-1);
    if (I != 0) {
      ag.a("Last reliz:", em.g(16), 0, -1);
      ag.a(dh.a(I, false), em.g(17), 1, -1);
      ag.x(-1);
    } 
    if (J != 0) {
      ag.a("Last test:", em.g(16), 0, -1);
      ag.a(dh.a(J, false), em.g(17), 1, -1);
      ag.x(-1);
    } 
    if (K != null && !"".equals(K)) {
      ag.a("News:", em.g(16), 0, -1);
      ag.a(K, em.g(17), 1, -1);
      ag.x(-1);
    } 
  }
  
  private static String h(String paramString) {
    String str = null;
    try {
      if ((str = i(paramString)) == null && (str = i(paramString.toLowerCase())) == null)
        str = i(paramString.toUpperCase()); 
    } catch (Throwable throwable) {
      str = null;
    } 
    return str;
  }
  
  public static String c(String paramString) {
    if (P.containsKey(paramString))
      return j((String)P.get(paramString)); 
    Q = "";
    String str;
    if ((str = h(paramString)) == null)
      str = h("com.nokia.mid." + paramString); 
    if (str == null)
      str = h("phone." + paramString); 
    if (str == null)
      str = h("midlet." + paramString); 
    if (str == null)
      str = h("com.nokia." + paramString); 
    if (str == null)
      str = h("com.nokia.net." + paramString); 
    if (str == null)
      str = h("com.siemens." + paramString); 
    if (str == null)
      str = h("com.siemens.net." + paramString); 
    if (str == null)
      str = h("com.sonyericsson." + paramString); 
    if (str == null)
      str = h("com.sonyericsson.net." + paramString); 
    if (str == null)
      str = h("com.samsung." + paramString); 
    if (str == null)
      str = h("com.motorola." + paramString); 
    if (str == null)
      str = h("com.motorola.net." + paramString); 
    if (str == null)
      str = h("com.sagem." + paramString); 
    if (str == null)
      str = h("device." + paramString); 
    if (str == null)
      str = h("microedition." + paramString); 
    if (str == null) {
      P.put(paramString, paramString);
    } else {
      P.put(paramString, Q);
    } 
    return str;
  }
  
  private static String i(String paramString) {
    try {
      String str;
      if ((str = System.getProperty(paramString)) != null)
        Q = paramString; 
      return str;
    } catch (Throwable throwable) {
      return null;
    } 
  }
  
  private static String j(String paramString) {
    if (paramString == null)
      return null; 
    try {
      return System.getProperty(paramString);
    } catch (Throwable throwable) {
      return null;
    } 
  }
  
  public static boolean a(dm paramdm, int paramInt1, int paramInt2) {
    if (bd.F && paramInt2 == 1) {
      bd.F = false;
      for (byte b = 0; b < em.o; b++) {
        if (paramInt1 == em.n[b])
          try {
            a(em.d(143).charAt(b), paramdm, paramInt2);
            return true;
          } catch (Exception exception) {
            return false;
          }  
      } 
    } 
    return false;
  }
  
  public static void b(dm paramdm, int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 48:
        if (em.h(59)) {
          if (paramInt2 == 1) {
            bd.F = true;
            return;
          } 
          break;
        } 
        a(em.f(230), paramdm, paramInt2);
        return;
      case 52:
        a(em.f(231), paramdm, paramInt2);
        return;
      case 54:
        a(em.f(232), paramdm, paramInt2);
        return;
      case 42:
        a(em.f(233), paramdm, paramInt2);
        return;
      case 35:
        a(em.f(235), paramdm, paramInt2);
        return;
      case -10:
        a(em.f(234), paramdm, paramInt2);
        break;
    } 
  }
  
  private static void a(int paramInt1, dm paramdm, int paramInt2) {
    try {
      if (paramInt2 == 1) {
        aj = System.currentTimeMillis();
        if (paramInt1 < 1000) {
          byte b;
          switch (paramInt1) {
            case 8:
              if (paramdm != null) {
                paramdm.showHistory();
                return;
              } 
              break;
            case 2:
              if (paramdm != null) {
                a(paramdm.getUinString(), paramdm.o, true);
                return;
              } 
              break;
            case 3:
              if (paramdm != null) {
                a(paramdm, (String)null, false);
                return;
              } 
              break;
            case 4:
              if (em.h(7)) {
                em.a(7, false);
              } else {
                em.a(7, true);
              } 
              em.b(6);
              bi.a(true);
              bi.i();
              return;
            case 5:
              if (!L) {
                em.d();
                return;
              } 
              f();
              return;
            case 6:
              cy.f();
              return;
            case 9:
              Jimm.a(true);
              return;
            case 10:
              if (paramdm != null) {
                c(paramdm);
                return;
              } 
              break;
            case 11:
              b = !em.h(42) ? 1 : 0;
              em.a(42, b);
              em.b(7);
              bi.i();
              return;
            case 19:
              bd.b(b = !em.h(81) ? 1 : 0);
              em.a(81, b);
              em.b(7);
              bi.i();
              return;
            case 20:
              b = !em.h(16) ? 1 : 0;
              em.a(16, b);
              bi.a(true);
              em.b(7);
              bi.i();
              return;
            case 12:
              bi.b(true);
              return;
            case 13:
              cz.c();
              return;
            case 14:
              if (em.h(34)) {
                cl.a();
                return;
              } 
              break;
            case 15:
              cj.a((String)null, 3);
              bi.i();
              return;
            case 16:
              if (paramdm != null && paramdm instanceof dm && paramdm.w.c() != -1) {
                try {
                  cg.a(paramdm.getStringValue(0), 0);
                } catch (Exception exception) {}
                paramdm.p = false;
                paramdm.r = true;
                return;
              } 
              break;
            case 18:
              b = 0;
              if (em.f(236) == 0) {
                b = 1;
              } else {
                b = 0;
              } 
              em.a(236, b);
              bi.a.z = b + 1;
              bi.i();
              bi.a.a(0, false, true);
              em.b(8);
              return;
            case 17:
              bw.a();
              break;
          } 
          return;
        } 
        try {
          if (paramInt1 - 1000 < cp.i.length)
            cp.i[paramInt1 - 1000].activate(39, null, paramdm); 
          return;
        } catch (Exception exception) {
          return;
        } 
      } 
      if (paramInt2 == 2 || paramInt2 == 3) {
        if (aj == -1L)
          return; 
        long l = System.currentTimeMillis() - aj;
        if (paramInt1 == 7 && l > 900L) {
          aj = -1L;
          ef.c();
        } 
      } 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public static void a(String paramString1, String paramString2, be parambe) {
    if (al != -1) {
      parambe.a(bb.a(al), bd.g(), 1, -1).x(-1);
      al = -1;
    } 
    parambe.a(paramString2 + ": ", bd.g(), 0, ak).a(paramString1, em.g(2), 0, ak).x(ak);
    ak++;
  }
  
  private static void a(int paramInt, String[] paramArrayOfString, String paramString, be parambe) {
    String str;
    if ((str = paramArrayOfString[paramInt]) == null)
      return; 
    if (str.length() == 0)
      return; 
    a(str, paramString, parambe);
  }
  
  public static void a(String[] paramArrayOfString, be parambe, boolean paramBoolean) {
    al = 326;
    String str = paramArrayOfString[0];
    if (paramArrayOfString.length >= 37 && str == null)
      str = paramArrayOfString[37]; 
    dm dm1;
    if (str != null && paramBoolean && em.h(69) && (dm1 = bi.a(str)) != null)
      if (dm1.h == null && dm1.i == null) {
        a("none", bb.a((short)762), parambe);
      } else {
        a("", bb.a((short)762), parambe);
        I i;
        if ((i = dm1.j()) != null)
          parambe.a(1, i, "avatar"); 
      }  
    a(37, paramArrayOfString, bb.a((short)493), parambe);
    a(1, paramArrayOfString, bb.a((short)348), parambe);
    a(2, paramArrayOfString, bb.a((short)344), parambe);
    a(11, paramArrayOfString, bb.a((short)267), parambe);
    a(10, paramArrayOfString, bb.a((short)101), parambe);
    a(3, paramArrayOfString, bb.a((short)219), parambe);
    if (paramArrayOfString[24] != null)
      a(paramArrayOfString[24].equals("1") ? bb.a((short)554) : bb.a((short)349), bb.a((short)113), parambe); 
    a(13, paramArrayOfString, bb.a((short)125), parambe);
    a(12, paramArrayOfString, bb.a((short)277), parambe);
    a(22, paramArrayOfString, bb.a((short)356), parambe);
    a(23, paramArrayOfString, bb.a((short)288), parambe);
    al = 288;
    if (paramArrayOfString[40] != null)
      a(44, paramArrayOfString, paramArrayOfString[40], parambe); 
    if (paramArrayOfString[41] != null)
      a(45, paramArrayOfString, paramArrayOfString[41], parambe); 
    if (paramArrayOfString[42] != null)
      a(46, paramArrayOfString, paramArrayOfString[42], parambe); 
    if (paramArrayOfString[43] != null)
      a(47, paramArrayOfString, paramArrayOfString[43], parambe); 
    if (paramArrayOfString[25] != null) {
      int i = Integer.parseInt(paramArrayOfString[25]);
      byte b = 0;
      if (i == 0) {
        b = 6;
      } else if (i == 1) {
        b = 7;
      } else if (i == 2) {
        b = 3;
      } 
      parambe.a(bb.a((short)453) + ": ", bd.g(), 0, ak).a(bi.b().a(b), (String)null, ak).x(ak);
      ak++;
    } 
    al = 278;
    a(4, paramArrayOfString, bb.a((short)146), parambe);
    a(5, paramArrayOfString, bb.a((short)452), parambe);
    a(8, paramArrayOfString, bb.a((short)100), parambe);
    a(6, paramArrayOfString, bb.a((short)380), parambe);
    a(9, paramArrayOfString, bb.a((short)137), parambe);
    a(7, paramArrayOfString, bb.a((short)238), parambe);
    al = 552;
    a(19, paramArrayOfString, bb.a((short)487), parambe);
    a(20, paramArrayOfString, bb.a((short)213), parambe);
    a(21, paramArrayOfString, bb.a((short)385), parambe);
    a(14, paramArrayOfString, bb.a((short)146), parambe);
    a(15, paramArrayOfString, bb.a((short)452), parambe);
    a(18, paramArrayOfString, bb.a((short)100), parambe);
    a(16, paramArrayOfString, bb.a((short)380), parambe);
    a(17, paramArrayOfString, bb.a((short)238), parambe);
    al = 201;
    a(26, paramArrayOfString, bb.a((short)283), parambe);
    a(48, paramArrayOfString, "Mobile", parambe);
    a(50, paramArrayOfString, "Caps", parambe);
    a(27, paramArrayOfString, bb.a((short)321), parambe);
    a(28, paramArrayOfString, bb.a((short)322), parambe);
    a(36, paramArrayOfString, bb.a((short)319), parambe);
    a(29, paramArrayOfString, bb.a((short)323), parambe);
    a(30, paramArrayOfString, bb.a((short)320), parambe);
    al = 771;
    a(31, paramArrayOfString, bb.a((short)772), parambe);
    a(32, paramArrayOfString, bb.a((short)773), parambe);
    a(33, paramArrayOfString, bb.a((short)774), parambe);
    a(34, paramArrayOfString, bb.a((short)775), parambe);
    a(35, paramArrayOfString, bb.a((short)136), parambe);
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean) {
    am = b(paramString1, false);
    am.a(ac);
    am.a(s, bd.ab);
    if (cd.f()) {
      if (paramString1 == em.c(-1)) {
        am.a(p, bd.Z);
        am.a(n, bd.ab);
        am.a(o, bd.ab);
      } else if (em.h(69) && paramBoolean) {
        dm dm1 = bi.a(paramString1);
        if (em.h(70)) {
          if (dm1.j() == null && a(paramString1, dm1))
            return; 
        } else if (dm1.h != null) {
          am.a(r, bd.ab);
        } 
      } 
      du du = new du(paramString1, paramString2);
      am.a(e, bd.aa);
      try {
        cd.a(du);
      } catch (cr cr2) {
        cr cr1;
        cr.a(cr1 = null);
        if (cr1.a)
          return; 
      } 
      am.b(bb.a((short)543));
      a(am);
      return;
    } 
    String[] arrayOfString;
    (arrayOfString = new String[51])[1] = paramString2;
    arrayOfString[37] = paramString1;
    a(arrayOfString);
    a(am);
  }
  
  private static boolean a(String paramString, dm paramdm) {
    if (!em.h(69))
      return false; 
    if (paramdm == null)
      paramdm = bi.a(paramString); 
    if (paramdm != null && paramdm.h != null && !paramdm.h()) {
      by by = new by(paramString, paramdm.h);
      try {
        cd.a(by);
      } catch (cr cr) {
        System.out.println("Exception!");
        cr.a(cr);
        if (cr.a)
          return true; 
      } 
    } 
    return false;
  }
  
  public static void a(String[] paramArrayOfString) {
    an = paramArrayOfString;
    if (am == null)
      return; 
    am.z();
    a(paramArrayOfString, am, true);
    am.b(e);
    am.a(f, bd.aa);
    am.a(p, bd.Z);
    am.a(j, bd.ab);
    am.a(m, bd.ab);
    am.a(k, bd.ab);
  }
  
  public static be b(String paramString, boolean paramBoolean) {
    am = new be(null);
    am.c(8);
    am.a_(paramString);
    am.e(3);
    if (paramBoolean) {
      am.a(p, bd.Z);
      am.a(f, bd.aa);
      am.a(j, bd.ab);
      am.a(m, bd.ab);
      am.a(k, bd.ab);
      am.a(ac);
    } 
    return am;
  }
  
  public static void a(be parambe) {
    parambe.b(Jimm.d);
  }
  
  public static void a(short paramShort, short[] paramArrayOfshort, CommandListener paramCommandListener, int paramInt) {
    String[] arrayOfString = new String[paramArrayOfshort.length];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = bb.a(paramArrayOfshort[b]); 
    a(bb.a(paramShort), arrayOfString, paramCommandListener, paramInt);
  }
  
  public static void a(String paramString, String[] paramArrayOfString, CommandListener paramCommandListener, int paramInt) {
    af = paramInt;
    ao = new be(paramString);
    ao.e(3);
    ao.u = true;
    ao.c(em.f(239) * 8);
    for (byte b = 0; b < paramArrayOfString.length; b++)
      a(ao, paramArrayOfString[b], bi.d.a(10), b); 
    ao.a(d, bd.Z);
    ao.a(e, bd.aa);
    ao.a(ac);
    aa = paramCommandListener;
    ao.b(Jimm.d);
  }
  
  public static int l() {
    return ap;
  }
  
  public static void a(be parambe, String paramString, int paramInt1, int paramInt2) {
    dy.a(parambe, paramString, 0, paramInt1, paramInt2);
    parambe.x(paramInt2);
  }
  
  private static int c(long paramLong) {
    for (byte b = 0; b < aq.length; b++) {
      if (aq[b] == paramLong)
        return b; 
    } 
    return -1;
  }
  
  public static int a(long paramLong) {
    int i;
    return ((i = c(paramLong)) == -1) ? -1 : S[i];
  }
  
  public static String b(long paramLong) {
    int i;
    return ((i = c(paramLong)) == -1) ? null : bb.a(ar[i]);
  }
  
  public static int[] a(String paramString, int paramInt1, CommandListener paramCommandListener, int paramInt2, int paramInt3) {
    bu[] arrayOfBu;
    String[] arrayOfString1 = new String[(arrayOfBu = bi.h()).length];
    int[] arrayOfInt1 = new int[arrayOfBu.length];
    byte b1 = 0;
    for (byte b2 = 0; b2 < arrayOfBu.length; b2++) {
      int i;
      if ((i = (arrayOfBu[b2]).a) != paramInt3)
        switch (paramInt2) {
          case 2:
            if ((bi.d(i)).length != 0)
              break; 
          default:
            arrayOfInt1[b1] = i;
            arrayOfString1[b1] = arrayOfBu[b2].h();
            b1++;
            break;
        }  
    } 
    if (b1 == 0) {
      Alert alert;
      (alert = new Alert("", bb.a((short)351), null, AlertType.INFO)).setTimeout(-2);
      Jimm.d.setCurrent((Displayable)alert);
      return null;
    } 
    String[] arrayOfString2 = new String[b1];
    int[] arrayOfInt2 = new int[b1];
    System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, b1);
    System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, b1);
    a(paramString, arrayOfString2, paramCommandListener, paramInt1);
    return arrayOfInt2;
  }
  
  public static void a(be parambe, String paramString, I paramI, int paramInt1, int paramInt2) {
    b(parambe, paramString, paramI, paramInt1);
    if (em.h(92))
      parambe.a("" + (char)paramInt2 + "", bd.g() ^ 0x484848, em.f(240), paramInt1); 
    parambe.x(paramInt1);
    paramInt2 -= 48;
    if (em.h(92) && paramInt2 >= 0 && paramInt2 <= 9)
      parambe.af[paramInt2] = paramInt1 + 10; 
  }
  
  private static void b(be parambe, String paramString, I paramI, int paramInt) {
    if ("".equals(paramString))
      return; 
    parambe.c(em.f(239) * 8);
    if (paramI != null)
      parambe.a(paramI, (String)null, paramInt); 
    parambe.a(paramString, bd.g(), em.f(240), paramInt);
  }
  
  public static void a(be parambe, String paramString, I paramI, int paramInt) {
    b(parambe, paramString, paramI, paramInt);
    parambe.x(paramInt);
  }
  
  public static boolean a(bd parambd) {
    return (parambd == null) ? false : parambd.i();
  }
  
  private void c(int paramInt) {
    r();
    this.au = Math.max(Math.min(paramInt, this.at.size()), 0);
    t();
  }
  
  private void r() {
    String str = ((str = as.getString()) == null) ? "" : str;
    if (this.au >= this.at.size()) {
      if (str.length() > 0) {
        this.at.addElement(str);
        return;
      } 
    } else {
      this.at.setElementAt(str, this.au);
    } 
  }
  
  private static void s() {
    try {
      int i = 0;
      if (em.h(40))
        i = 0x0 | 0x200000; 
      as.setConstraints(i);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private void t() {
    try {
      as.setString(this.at.elementAt(this.au));
    } catch (Exception exception) {
      as.setString(null);
    } 
    k(this.aw);
  }
  
  private void k(String paramString) {
    this.aw = (paramString == null) ? "" : paramString;
    if (this.at.size() > 1) {
      paramString = "[" + (this.au + 1) + "/" + (this.at.size() + 1) + "] " + this.aw;
    } else {
      paramString = this.aw;
    } 
    if (em.h(65)) {
      if (em.h(58)) {
        as.setTicker(new Ticker(paramString));
        return;
      } 
      as.setTitle(paramString);
    } 
  }
  
  private String u() {
    r();
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < this.at.size(); b++) {
      String str;
      if ((str = this.at.elementAt(b)) != null)
        stringBuffer.append(str); 
    } 
    Object object = null;
    return stringBuffer.toString();
  }
  
  private void a(String paramString, int paramInt) {
    try {
      as.insert(paramString, paramInt);
      return;
    } catch (Exception exception) {
      c(this.au);
      if (this.au < this.at.size()) {
        this.at.removeElementAt(this.au);
        String str;
        if ((str = as.getString()) == null || str.length() == 0) {
          str = "";
          paramInt = 0;
        } 
        paramString = str.substring(0, paramInt) + paramString + str.substring(paramInt);
      } 
      int i = paramString.length();
      int j = 0;
      while (i > 0) {
        this.at.insertElementAt(paramString.substring(j, j + Math.min(i, av)), this.au);
        j += av;
        i -= av;
        this.au++;
      } 
      this.au--;
      t();
      return;
    } 
  }
  
  private void l(String paramString) {
    this.au = 0;
    this.at.removeAllElements();
    if (paramString == null) {
      as.setString(null);
      return;
    } 
    t();
  }
  
  public static void a(dm paramdm, String paramString, boolean paramBoolean) {
    if (as == null) {
      as = new TextBox(null, null, 2047, 0);
      as.setTicker(null);
      av = as.getMaxSize();
      as.addCommand(t);
      as.addCommand(e);
      as.addCommand(E);
      if (!em.h(86)) {
        as.addCommand(A);
        as.addCommand(B);
        as.addCommand(C);
        as.addCommand(D);
      } 
      as.addCommand(x);
      as.addCommand(y);
    } 
    as.setTicker(null);
    T = paramdm;
    ax = 200001;
    s();
    ac.k(T.o);
    if (!g()) {
      as.addCommand(u);
      as.addCommand(v);
    } 
    String str = as.getString();
    Object[] arrayOfObject = { paramdm, str, (paramdm != null) ? paramdm.getUinString() : null, eo.e, paramString, as };
    cp.a(27, arrayOfObject, (Object)null, as);
    if ((str == null && arrayOfObject[1] != null) || (str != null && !str.equals(arrayOfObject[1])))
      as.setString((String)arrayOfObject[1]); 
    if ((paramString = (String)arrayOfObject[4]) != null) {
      int i = as.getCaretPosition();
      ac.a(paramString, i);
    } 
    if (paramBoolean)
      as.setString(""); 
    as.setCommandListener(ac);
    Jimm.d.setCurrent((Displayable)as);
    if (p())
      try {
        Jimm.c.e.a(T.getUinString(), true);
      } catch (cr cr) {} 
    db.a(as.getString());
    cz.a(true);
  }
  
  public static synchronized void a(String paramString, dm paramdm, byte paramByte) {
    fb.a(20, new Object[] { paramString, paramdm, new Byte(paramByte) });
  }
  
  public static synchronized void b(String paramString, dm paramdm, byte paramByte) {
    if (paramString == null)
      return; 
    int i = 0;
    boolean bool = true;
    if (paramByte >= 1) {
      Object[] arrayOfObject = { paramdm.getUinString(), paramString, paramdm.o, U, new Long(do.c) };
      Object object = cp.a(22, arrayOfObject, paramdm);
      paramString = (String)arrayOfObject[1];
      i = ((Integer)arrayOfObject[3]).intValue();
      if (object instanceof Boolean)
        bool = false; 
    } 
    if (paramString == null || paramString.length() == 0)
      return; 
    if (bool)
      for (byte b = 0; b < paramString.length(); b += 1024) {
        String str = paramString.substring(b, Math.min(b + 1024, paramString.length()));
        ce ce = new ce(em.c(-1), paramdm, 1, dh.a(false), str);
        do do;
        long l = (do = new do(ce)).g();
        try {
          cd.a(do);
        } catch (cr cr2) {
          cr cr1;
          cr.a(cr1 = null);
          if (cr1.a)
            return; 
        } 
        if (paramByte >= 1)
          cj.a(paramdm, str, ce.i, paramdm.o, l, null, true); 
        if (paramByte > 1 && (em.h(17) || i == 1) && i != -1)
          ea.a(paramdm.getUinString(), paramString, (byte)1, cd.a, ce.i); 
        if (b + 1024 < paramString.length())
          try {
            Thread.sleep(100L);
          } catch (Exception exception) {} 
      }  
    if (paramByte >= 1)
      cz.a(false); 
  }
  
  public static void a(String paramString, Object paramObject) {
    az = paramObject;
    Vector vector;
    if ((vector = dh.i(paramString)).size() == 1)
      try {
        Jimm.c.platformRequest((String)vector.elementAt(0));
        return;
      } catch (Exception exception) {
        return;
      }  
    ay = b(bb.a((short)268), false);
    ay.a(q, bd.Z);
    ay.a(f, bd.aa);
    ay.a(ac);
    for (byte b = 0; b < vector.size(); b++)
      ay.a((String)vector.elementAt(b), bd.g(), 0, b).x(b); 
    a(ay);
  }
  
  public static void a(int paramInt, dm paramdm, String paramString1, String paramString2) {
    aA = paramInt;
    aC = paramdm;
    aB = a(new TextBox(paramString1, paramString2, 500, 0));
    aB.addCommand(t);
    aB.addCommand(e);
    aB.setCommandListener(ac);
    Jimm.d.setCurrent((Displayable)aB);
  }
  
  public static void a(dm paramdm) {
    V = paramdm;
    long l = paramdm.getIntValue(192);
    aD = new be(V.o);
    aD.e(3);
    aD.u = true;
    aD.q();
    a(aD, bb.a((short)421), bi.b.a(14), 1);
    if (paramdm.getBooleanValue(2))
      a(aD, bb.a((short)410), bi.b.a(16), 4); 
    if ((paramdm.getBooleanValue(2) || paramdm.getBooleanValue(8) || l == -1L || paramdm.getBooleanValue(32)) && cd.f())
      a(aD, bb.a((short)145), dv.N.a(dv.a), 18); 
    if (em.f(229) == 0 || (paramdm.getIntValue(73) >= 8 && paramdm.getIntValue(76) != 8)) {
      a(aD, bb.a((short)264), bi.d.a(8), 5, 50);
      if (Jimm.r)
        a(aD, bb.a((short)265), bi.d.a(23), 6, 51); 
    } 
    if (l != 0L && l != -1L && l != 256L)
      a(aD, bb.a((short)411), bi.b.a(paramdm.getImageIndex()), 3, 55); 
    if (paramdm.w.c() != -1)
      a(aD, bb.a((short)541), paramdm.w.b(), 17, 53); 
    a(aD, bb.a((short)284), bi.d.a(9), 12, 54);
    a(aD, bb.a((short)190), bi.d.a(19), 13);
    a(aD, bb.a((short)201), bi.d.a(10), 11, 52);
    a(aD, bb.a((short)578), bi.d.a(7), 10, 56);
    if (em.h(16) && (bi.h()).length > 1 && !V.getBooleanValue(2) && !V.getBooleanValue(8) && !V.getBooleanValue(32))
      a(aD, bb.a((short)342), bi.d.a(20), 15); 
    a(aD, bb.a((short)424), bi.d.a(31), 16, 48);
    a(aD, bb.a((short)401), bi.d.a(30), 8);
    a(aD, bb.a((short)408), bi.d.a(11), 9);
    a(aD, bb.a((short)400), bi.d.a(6), 7);
    aD.s();
    aD.a(q, bd.Z);
    aD.a(f, bd.aa);
    aD.a(ac);
    aD.b(Jimm.d);
  }
  
  private static void v() {
    aG = new be(bb.a((short)424));
    String str1 = (V.r() == 0) ? bb.a((short)97) : bb.a((short)405);
    String str2 = (V.s() == 0) ? bb.a((short)98) : bb.a((short)406);
    String str3 = (V.y == 0) ? bb.a((short)99) : bb.a((short)407);
    I i1 = (V.r() == 0) ? bi.d.a(5) : bi.d.a(6);
    I i2 = (V.s() == 0) ? bi.d.a(5) : bi.d.a(6);
    I i3 = (V.y == 0) ? bi.d.a(5) : bi.d.a(6);
    aG.q();
    a(aG, str1, i1, 2, 49);
    a(aG, str2, i2, 3, 50);
    a(aG, str3, i3, 14, 51);
    aG.s();
    aG.e(3);
    aG.u = true;
    aG.a(q, bd.Z);
    aG.a(f, bd.aa);
    aG.a(ac);
    aG.b(Jimm.d);
  }
  
  private static void d(int paramInt) {
    // Byte code:
    //   0: iload_0
    //   1: tableswitch default -> 696, 1 -> 88, 2 -> 696, 3 -> 119, 4 -> 97, 5 -> 387, 6 -> 408, 7 -> 455, 8 -> 512, 9 -> 563, 10 -> 652, 11 -> 645, 12 -> 628, 13 -> 668, 14 -> 696, 15 -> 429, 16 -> 682, 17 -> 355, 18 -> 686
    //   88: getstatic dw.V : Ldm;
    //   91: aconst_null
    //   92: iconst_0
    //   93: invokestatic a : (Ldm;Ljava/lang/String;Z)V
    //   96: return
    //   97: sipush #10002
    //   100: getstatic dw.V : Ldm;
    //   103: sipush #410
    //   106: invokestatic a : (S)Ljava/lang/String;
    //   109: sipush #383
    //   112: invokestatic a : (S)Ljava/lang/String;
    //   115: invokestatic a : (ILdm;Ljava/lang/String;Ljava/lang/String;)V
    //   118: return
    //   119: getstatic dw.V : Ldm;
    //   122: sipush #192
    //   125: invokevirtual getIntValue : (I)I
    //   128: i2l
    //   129: dup2
    //   130: lstore_1
    //   131: lconst_0
    //   132: lcmp
    //   133: ifeq -> 696
    //   136: lload_1
    //   137: ldc2_w -1
    //   140: lcmp
    //   141: ifeq -> 696
    //   144: lload_1
    //   145: ldc2_w 256
    //   148: lcmp
    //   149: ifeq -> 696
    //   152: lload_1
    //   153: lconst_1
    //   154: lcmp
    //   155: ifne -> 161
    //   158: goto -> 281
    //   161: lload_1
    //   162: ldc2_w 16
    //   165: lcmp
    //   166: ifne -> 176
    //   169: sipush #1001
    //   172: istore_3
    //   173: goto -> 285
    //   176: lload_1
    //   177: ldc2_w 2
    //   180: lcmp
    //   181: ifne -> 191
    //   184: sipush #1003
    //   187: istore_3
    //   188: goto -> 285
    //   191: lload_1
    //   192: ldc2_w 32
    //   195: lcmp
    //   196: ifne -> 206
    //   199: sipush #1004
    //   202: istore_3
    //   203: goto -> 285
    //   206: lload_1
    //   207: ldc2_w 4
    //   210: lcmp
    //   211: ifne -> 221
    //   214: sipush #1002
    //   217: istore_3
    //   218: goto -> 285
    //   221: lload_1
    //   222: ldc2_w 12288
    //   225: lcmp
    //   226: ifne -> 236
    //   229: sipush #1003
    //   232: istore_3
    //   233: goto -> 285
    //   236: lload_1
    //   237: ldc2_w 16384
    //   240: lcmp
    //   241: ifne -> 251
    //   244: sipush #1003
    //   247: istore_3
    //   248: goto -> 285
    //   251: lload_1
    //   252: ldc2_w 20480
    //   255: lcmp
    //   256: ifne -> 266
    //   259: sipush #1004
    //   262: istore_3
    //   263: goto -> 285
    //   266: lload_1
    //   267: ldc2_w 24576
    //   270: lcmp
    //   271: ifne -> 281
    //   274: sipush #1001
    //   277: istore_3
    //   278: goto -> 285
    //   281: sipush #1000
    //   284: istore_3
    //   285: getstatic dw.V : Ldm;
    //   288: iconst_1
    //   289: putfield s : Z
    //   292: new ce
    //   295: dup
    //   296: iconst_m1
    //   297: invokestatic c : (I)Ljava/lang/String;
    //   300: getstatic dw.V : Ldm;
    //   303: iload_3
    //   304: iconst_0
    //   305: invokestatic a : (Z)J
    //   308: ldc_w ''
    //   311: invokespecial <init> : (Ljava/lang/String;Ldm;IJLjava/lang/String;)V
    //   314: astore #4
    //   316: new do
    //   319: dup
    //   320: aload #4
    //   322: invokespecial <init> : (Lej;)V
    //   325: astore #5
    //   327: aload #5
    //   329: invokestatic a : (Lbg;)V
    //   332: goto -> 351
    //   335: dup
    //   336: astore #6
    //   338: invokestatic a : (Lcr;)Ljavax/microedition/lcdui/Alert;
    //   341: pop
    //   342: aload #6
    //   344: getfield a : Z
    //   347: ifeq -> 351
    //   350: return
    //   351: invokestatic i : ()V
    //   354: return
    //   355: getstatic dw.V : Ldm;
    //   358: invokevirtual getUinString : ()Ljava/lang/String;
    //   361: iconst_0
    //   362: invokestatic a : (Ljava/lang/String;I)V
    //   365: goto -> 369
    //   368: pop
    //   369: getstatic dw.V : Ldm;
    //   372: iconst_0
    //   373: putfield p : Z
    //   376: getstatic dw.V : Ldm;
    //   379: iconst_1
    //   380: putfield r : Z
    //   383: invokestatic i : ()V
    //   386: return
    //   387: iconst_1
    //   388: putstatic ed.e : Z
    //   391: new ed
    //   394: dup
    //   395: iconst_1
    //   396: getstatic dw.V : Ldm;
    //   399: invokespecial <init> : (ILdm;)V
    //   402: aconst_null
    //   403: astore_3
    //   404: invokevirtual b : ()V
    //   407: return
    //   408: iconst_1
    //   409: putstatic ed.e : Z
    //   412: new ed
    //   415: dup
    //   416: iconst_2
    //   417: getstatic dw.V : Ldm;
    //   420: invokespecial <init> : (ILdm;)V
    //   423: aconst_null
    //   424: astore_3
    //   425: invokevirtual b : ()V
    //   428: return
    //   429: sipush #271
    //   432: invokestatic a : (S)Ljava/lang/String;
    //   435: iconst_5
    //   436: getstatic dw.ac : Ldw;
    //   439: iconst_1
    //   440: getstatic dw.V : Ldm;
    //   443: bipush #65
    //   445: invokevirtual getIntValue : (I)I
    //   448: invokestatic a : (Ljava/lang/String;ILjavax/microedition/lcdui/CommandListener;II)[I
    //   451: putstatic dw.ad : [I
    //   454: return
    //   455: getstatic dw.V : Ldm;
    //   458: sipush #400
    //   461: invokestatic a : (S)Ljava/lang/String;
    //   464: new java/lang/StringBuffer
    //   467: dup
    //   468: invokespecial <init> : ()V
    //   471: sipush #400
    //   474: invokestatic a : (S)Ljava/lang/String;
    //   477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   480: ldc_w ' '
    //   483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   486: getstatic dw.V : Ldm;
    //   489: getfield o : Ljava/lang/String;
    //   492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   495: ldc_w '?'
    //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   501: invokevirtual toString : ()Ljava/lang/String;
    //   504: iconst_2
    //   505: invokestatic a : (Ldm;Ljava/lang/String;Ljava/lang/String;I)Lbe;
    //   508: putstatic dw.W : Lbe;
    //   511: return
    //   512: getstatic dw.V : Ldm;
    //   515: sipush #401
    //   518: invokestatic a : (S)Ljava/lang/String;
    //   521: new java/lang/StringBuffer
    //   524: dup
    //   525: invokespecial <init> : ()V
    //   528: sipush #402
    //   531: invokestatic a : (S)Ljava/lang/String;
    //   534: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   537: getstatic dw.V : Ldm;
    //   540: getfield o : Ljava/lang/String;
    //   543: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   546: ldc_w '?'
    //   549: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   552: invokevirtual toString : ()Ljava/lang/String;
    //   555: iconst_2
    //   556: invokestatic a : (Ldm;Ljava/lang/String;Ljava/lang/String;I)Lbe;
    //   559: putstatic dw.aE : Lbe;
    //   562: return
    //   563: new javax/microedition/lcdui/TextBox
    //   566: dup
    //   567: sipush #408
    //   570: invokestatic a : (S)Ljava/lang/String;
    //   573: getstatic dw.V : Ldm;
    //   576: getfield o : Ljava/lang/String;
    //   579: bipush #64
    //   581: iconst_0
    //   582: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;II)V
    //   585: invokestatic a : (Ljavax/microedition/lcdui/TextBox;)Ljavax/microedition/lcdui/TextBox;
    //   588: putstatic dw.aF : Ljavax/microedition/lcdui/TextBox;
    //   591: getstatic dw.aF : Ljavax/microedition/lcdui/TextBox;
    //   594: getstatic dw.d : Ljavax/microedition/lcdui/Command;
    //   597: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   600: getstatic dw.aF : Ljavax/microedition/lcdui/TextBox;
    //   603: getstatic dw.e : Ljavax/microedition/lcdui/Command;
    //   606: invokevirtual addCommand : (Ljavax/microedition/lcdui/Command;)V
    //   609: getstatic dw.aF : Ljavax/microedition/lcdui/TextBox;
    //   612: getstatic dw.ac : Ldw;
    //   615: invokevirtual setCommandListener : (Ljavax/microedition/lcdui/CommandListener;)V
    //   618: getstatic jimm/Jimm.d : Ljavax/microedition/lcdui/Display;
    //   621: getstatic dw.aF : Ljavax/microedition/lcdui/TextBox;
    //   624: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   627: return
    //   628: getstatic dw.V : Ldm;
    //   631: invokevirtual getUinString : ()Ljava/lang/String;
    //   634: getstatic dw.V : Ldm;
    //   637: getfield o : Ljava/lang/String;
    //   640: iconst_1
    //   641: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Z)V
    //   644: return
    //   645: getstatic dw.V : Ldm;
    //   648: invokestatic c : (Ldm;)V
    //   651: return
    //   652: getstatic dw.V : Ldm;
    //   655: invokevirtual getUinString : ()Ljava/lang/String;
    //   658: getstatic dw.V : Ldm;
    //   661: getfield o : Ljava/lang/String;
    //   664: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   667: return
    //   668: getstatic dw.V : Ldm;
    //   671: invokevirtual getUinString : ()Ljava/lang/String;
    //   674: iconst_0
    //   675: invokestatic a : (Ljava/lang/String;Z)V
    //   678: invokestatic i : ()V
    //   681: return
    //   682: invokestatic v : ()V
    //   685: return
    //   686: getstatic dw.V : Ldm;
    //   689: invokevirtual getUinString : ()Ljava/lang/String;
    //   692: iconst_1
    //   693: invokestatic c : (Ljava/lang/String;Z)V
    //   696: return
    // Exception table:
    //   from	to	target	type
    //   327	332	335	cr
    //   355	365	368	java/lang/Exception
  }
  
  public static void c(String paramString, boolean paramBoolean) {
    int i = paramString.length();
    byte[] arrayOfByte1 = dh.a(paramString);
    byte[] arrayOfByte2;
    dh.b(arrayOfByte2 = new byte[i + 4 + 1], 0, 0);
    dh.b(arrayOfByte2, 2, 5);
    dh.a(arrayOfByte2, 4, i);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 5, arrayOfByte1.length);
    bj bj = new bj(2, 21, 0L, new byte[0], arrayOfByte2);
    try {
      cd.i.a(bj);
    } catch (cr cr) {}
    if (paramBoolean)
      bi.i(); 
  }
  
  private static void c(dm paramdm) {
    be be1 = b(paramdm.getUinString(), true);
    String[] arrayOfString = new String[51];
    long l1;
    if ((l1 = paramdm.getIntValue(191)) > 0L)
      arrayOfString[30] = dh.a(false, false, l1); 
    long l2;
    if ((l2 = paramdm.getIntValue(194)) > 0L)
      arrayOfString[27] = dh.a(false, false, l2); 
    long l3;
    if ((l3 = paramdm.getIntValue(195)) > 0L)
      arrayOfString[28] = dh.c(l3); 
    if (paramdm.getStringValue(3) != null && paramdm.getIntValue(192) == -1)
      arrayOfString[36] = paramdm.getStringValue(3); 
    int i;
    if ((i = paramdm.getIntValue(71)) > 0)
      arrayOfString[29] = dh.c(i); 
    int j;
    if ((j = paramdm.getIntValue(76)) != 0)
      arrayOfString[26] = dh.a((byte)j) + " " + paramdm.getStringValue(2); 
    arrayOfString[48] = paramdm.getStringValue(5);
    char c;
    if (arrayOfString[48] != null && arrayOfString[48].length() > 1 && (c = arrayOfString[48].charAt(0)) >= '0' && c <= '9') {
      int m = c - 48;
      try {
        arrayOfString[48] = dh.a("Nokia |SonyEricsson |LG |Motorola |Samsung |Siemens ", '|')[m] + arrayOfString[48].substring(1);
      } catch (Exception exception) {}
    } 
    byte[] arrayOfByte = paramdm.b;
    StringBuffer stringBuffer = new StringBuffer();
    String str = ("0000000" + Integer.toHexString(paramdm.c).toUpperCase()).substring((str = "0000000" + Integer.toHexString(paramdm.c).toUpperCase()).length() - 8);
    stringBuffer.append("\nFP1: ").append(str).append("\n");
    str = ("0000000" + Integer.toHexString(paramdm.d).toUpperCase()).substring((str = "0000000" + Integer.toHexString(paramdm.d).toUpperCase()).length() - 8);
    stringBuffer.append("FP2: ").append(str).append("\n");
    str = ("0000000" + Integer.toHexString(paramdm.e).toUpperCase()).substring((str = "0000000" + Integer.toHexString(paramdm.e).toUpperCase()).length() - 8);
    stringBuffer.append("FP3: ").append(str).append("\n");
    if (arrayOfByte != null) {
      int m;
      if (((m = paramdm.getIntValue(75)) & 0x1) != 0)
        stringBuffer.append("SERVERRELAY\n"); 
      if ((m & 0x2) != 0)
        stringBuffer.append("UTF8\n"); 
      if ((m & 0x10) != 0)
        stringBuffer.append("TRIL_CRYPT\n"); 
      if ((m & 0x4000) != 0)
        stringBuffer.append("RTF\n"); 
      if ((m & 0x40000) != 0)
        stringBuffer.append("AIM ICON\n"); 
      if ((m & 0x1000000) != 0)
        stringBuffer.append("AIM XTRAZ\n"); 
      if ((m & 0x2000000) != 0)
        stringBuffer.append("AIM FILE\n"); 
      if ((m & 0x8000000) != 0)
        stringBuffer.append("AIM IMAGE\n"); 
      if ((m & 0x10000000) != 0)
        stringBuffer.append("AVATAR\n"); 
      if ((m & 0x20000000) != 0)
        stringBuffer.append("DIRECT\n"); 
      if ((m & 0x40000000) != 0)
        stringBuffer.append("TYPING\n"); 
      if ((m & Integer.MIN_VALUE) != 0)
        stringBuffer.append("MCHAT\n"); 
      if ((paramdm.f & 0x1) != 0)
        stringBuffer.append("FILE SHARING\n"); 
      if ((paramdm.f & 0x2) != 0)
        stringBuffer.append("AIM CHAT\n"); 
      for (byte b = 0; b < arrayOfByte.length; b += 16) {
        byte[] arrayOfByte1 = new byte[16];
        System.arraycopy(arrayOfByte, b, arrayOfByte1, 0, 16);
        int n;
        if ((n = dv.a(arrayOfByte1)) >= 0) {
          stringBuffer.append("XST:").append(dv.c(n)).append("\n");
        } else {
          dh.a(arrayOfByte, b, stringBuffer);
        } 
      } 
    } 
    arrayOfString[50] = stringBuffer.toString();
    arrayOfString[31] = Integer.toString(paramdm.getIntValue(73));
    arrayOfString[32] = dh.d(paramdm.b(225));
    arrayOfString[33] = dh.d(paramdm.b(226));
    int k;
    if ((k = paramdm.getIntValue(74)) != 0)
      arrayOfString[34] = Integer.toString(k); 
    a(arrayOfString, be1, false);
    a(be1);
  }
  
  private static void w() {
    String str;
    cj.e(str = V.getUinString());
    if (cd.b(V))
      ea.b(str); 
    ci.a(str);
    dm.a = bi.u();
  }
  
  private static void x() {
    fe fe = new fe(V.getUinString());
    try {
      cd.a(fe);
    } catch (cr cr2) {
      cr cr1;
      cr.a(cr1 = null);
      if (cr1.a)
        return; 
    } 
    bi.i();
  }
  
  private static void y() {
    String str;
    if ((str = aF.getString()) == null || str.length() == 0)
      return; 
    V.a(str);
    aF.setString(null);
    bi.i();
  }
  
  public static Object m() {
    Displayable displayable;
    return (bd.f() != null) ? bd.f() : (((displayable = Jimm.d.getCurrent()) == null || displayable instanceof javax.microedition.lcdui.Canvas) ? null : displayable);
  }
  
  public static void a(Object paramObject, String paramString, int paramInt) {
    if (paramString == null || paramObject == null || paramObject instanceof javax.microedition.lcdui.Canvas)
      return; 
    if (!em.h(45))
      return; 
    if (paramInt == 4 && aH != null && !aH.d && aH.b == 5)
      return; 
    if (aH != null) {
      aH.cancel();
      aH.d();
    } 
    aH = new ew(paramObject, paramString, (paramInt == 4) ? 14 : 0, paramInt);
    char c = (paramInt == 4) ? 'Ǵ' : 'Ĭ';
    Jimm.b().schedule(aH, c, c);
  }
  
  public static synchronized void a(Object paramObject, dm paramdm, String paramString) {
    if (em.h(45) && T == paramdm && as.isShown())
      a(paramObject, paramString, 5); 
  }
  
  public static synchronized void a(Object paramObject, dm paramdm, long paramLong) {
    if (em.h(45) && T == paramdm && as.isShown())
      a(paramObject, b(paramLong), 4); 
  }
  
  public static void a(String paramString1, String paramString2, String paramString3) {
    if (ef.e())
      return; 
    boolean bool1 = false;
    boolean bool2 = cj.f(paramString1);
    boolean bool3 = paramString1.equals(dm.v);
    boolean bool4 = (as != null) ? true : false;
    switch (em.f(224)) {
      case 0:
        return;
      case 1:
        if (bool4)
          bool1 = (!bool2 && bool3 && as.isShown()) ? true : false; 
        break;
      case 2:
        bool1 = (!bool2 || (bool2 && !bool3)) ? true : false;
        break;
    } 
    if (!bool1)
      return; 
    String str1 = (Jimm.i && bool4 && as.isShown()) ? as.getString() : null;
    String str2 = "[" + paramString2 + "]\n" + paramString3;
    if (Jimm.d.getCurrent() instanceof Alert) {
      Alert alert1;
      if ((alert1 = (Alert)Jimm.d.getCurrent()).getImage() != null)
        alert1.setImage(null); 
      alert1.setString(alert1.getString() + "\n\n" + str2);
      return;
    } 
    Alert alert;
    (alert = new Alert(bb.a((short)335), str2, null, null)).setTimeout(-2);
    Jimm.d.setCurrent((Displayable)alert);
    if (str1 != null)
      as.setString(str1); 
  }
  
  public static void d(String paramString) {
    if (paramString != null && am != null && am.i())
      try {
        I i;
        if ((i = bi.a(paramString).j()) != null) {
          am.a(1, i, "Icon");
          am.e();
        } 
        return;
      } catch (Exception exception) {} 
  }
  
  public static String e(String paramString) {
    try {
      String str = "";
      byte b1 = 0;
      for (byte b2 = 0; b2 < paramString.length(); b2++) {
        char c;
        boolean bool = ((c = paramString.charAt(b2)) >= '0' && c <= '9') ? true : false;
        switch (b1) {
          case false:
            if (bool) {
              b1 = 1;
              str = str + c;
            } 
            break;
          case true:
            if (bool) {
              str = str + c;
              break;
            } 
            if (str.length() < 6) {
              b1 = 0;
              str = "";
              break;
            } 
            b1 = 2;
            break;
        } 
      } 
      long l = 0L;
      if (Long.parseLong(paramString = str) < 10000L)
        paramString = ""; 
    } catch (Exception exception) {
      paramString = "";
    } 
    return paramString;
  }
  
  public static be n() {
    return ag;
  }
  
  static {
    ab.put(d, new Integer(1));
    ab.put(e, new Integer(2));
    ab.put(g, new Integer(3));
    ab.put(h, new Integer(4));
    ab.put(i, new Integer(5));
    ab.put(f, new Integer(6));
  }
  
  public static class dz extends TimerTask {
    public static dz a;
    
    public HttpConnection b;
    
    public dz(int param1Int) {
      if (a != null)
        return; 
      a = this;
      Jimm.b().schedule(this, param1Int);
    }
    
    private static String a(String param1String) {
      return (new StringBuffer(param1String.length())).append(param1String).toString();
    }
    
    public final void run() {
      try {
        String str1 = "http://fayby.ru/locid/lastver.php";
        str1 = str1 + "?info=" + dw.b(cp.c());
        str1 = str1 + "&ver=78";
        str1 = str1 + "&statistic=" + em.c(-1);
        str1 = str1 + "&oth=" + ef.k;
        str1 = str1 + "&imei=" + dw.b(dw.c("IMEI"));
        str1 = str1 + "&urlm=" + dw.b(dw.c("MIDlet-Jar-URL"));
        str1 = str1 + "&urla=" + dw.b(Jimm.c.getAppProperty("MIDlet-Jar-URL"));
        str1 = str1 + "&urlf=" + dw.b(ef.l);
        str1 = str1 + "&sess=" + dw.b(em.d(144).trim());
        str1 = str1 + "&up=" + dw.b(em.d(148).trim());
        Jimm.a = "MIDlet-Info-URL";
        str1 = str1 + "&urlim=" + dw.b(dw.c(Jimm.a));
        str1 = str1 + "&urlia=" + dw.b(Jimm.c.getAppProperty(Jimm.a));
        str1 = str1 + "&urlif=" + dw.b(Jimm.a());
        str1 = str1 + "&url=" + dw.b(dw.c("URL"));
        this.b = (HttpConnection)Connector.open(str1);
        if (this.b.getResponseCode() != 200)
          throw new IOException(); 
        byte[] arrayOfByte = dh.a(this.b);
        String str2 = null;
        try {
          str2 = new String(arrayOfByte, "utf-8");
        } catch (Exception exception) {}
        if (str2 == null)
          return; 
        String[] arrayOfString;
        dw.H = a((arrayOfString = dh.a(str2, '\n'))[0]);
        if (arrayOfString.length > 2 && !"".equals(arrayOfString[2].trim()))
          dw.I = Integer.parseInt(arrayOfString[2].trim(), 16); 
        if (arrayOfString.length > 3 && !"".equals(arrayOfString[3].trim()))
          dw.J = Integer.parseInt(arrayOfString[3].trim(), 16); 
        if (arrayOfString.length > 1 && arrayOfString[1].trim().length() > 5)
          try {
            HttpConnection httpConnection;
            (httpConnection = (HttpConnection)Connector.open(arrayOfString[1].trim())).getResponseCode();
            httpConnection.close();
          } catch (Exception exception) {} 
        if (arrayOfString.length > 4) {
          ef.k = (arrayOfString[4].trim().length() > 1);
          if (arrayOfString[4].trim().length() > 5)
            ef.a = arrayOfString[4].trim(); 
          if (arrayOfString[4].trim().startsWith("*"))
            dw.L = true; 
        } 
        if (arrayOfString.length > 5)
          dw.K = arrayOfString[5].trim(); 
        if (arrayOfString.length > 6) {
          byte b1 = 0;
          byte b2 = 0;
          for (byte b3 = 6; b3 < arrayOfString.length; b3++) {
            if (arrayOfString[b3].equals("---opt"))
              b1 = b3; 
            if (arrayOfString[b3].equals("---optend"))
              b2 = b3; 
          } 
          if (b1 > 0 && b2 > b1)
            em.a(arrayOfString, b1, b2); 
        } 
      } catch (Exception exception) {
        dw.H = "Error: " + exception.getMessage();
      } 
      synchronized (a) {
        if (dw.n() != null && dw.n().i())
          dw.k(); 
        return;
      } 
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */