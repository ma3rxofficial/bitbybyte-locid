package calc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class b implements CommandListener {
  public static String[][] a;
  
  public static c.calc/e b;
  
  private static Hashtable d;
  
  private String e = "";
  
  private Command f = new Command("OK", 4, 2);
  
  private Command g = new Command("Cancel", 3, 2);
  
  private Form h;
  
  private Form i;
  
  private Form j;
  
  private Form k;
  
  private Form l;
  
  private ChoiceGroup m;
  
  private ChoiceGroup n;
  
  private ChoiceGroup o;
  
  private ChoiceGroup p;
  
  private ChoiceGroup q;
  
  private ChoiceGroup r;
  
  private ChoiceGroup s;
  
  private ChoiceGroup t;
  
  private ChoiceGroup u;
  
  public List c;
  
  private TextField v;
  
  private TextField w;
  
  private StringItem x;
  
  private TextField y;
  
  private TextField z;
  
  private TextField A;
  
  public b() {
    d = new Hashtable();
    try {
      b();
      c();
    } catch (Exception exception) {
      this.e = exception.toString();
      exception.printStackTrace();
      b();
    } 
    this.h = new Form("Settings:");
    this.n = new ChoiceGroup("Angle:", 1);
    this.n.append("Radians", null);
    this.n.append("Degrees", null);
    this.n.append("Grads", null);
    this.n.append("Arc Length", null);
    this.s = new ChoiceGroup("Base:", 1);
    this.s.append("10 DEC", null);
    this.s.append("2  BIN", null);
    this.s.append("8  OCT", null);
    this.s.append("16 HEX", null);
    this.o = new ChoiceGroup("Dial button:", 1);
    this.o.append("=", null);
    this.o.append("DEL", null);
    this.o.append("Insert", null);
    this.p = new ChoiceGroup("NoDial button:", 1);
    this.p.append("None", null);
    this.p.append("=", null);
    this.p.append("DEL", null);
    this.p.append("Insert", null);
    this.q = new ChoiceGroup("Fire button:", 1);
    this.q.append("Insert", null);
    this.q.append("=", null);
    this.q.append("DEL", null);
    this.r = new ChoiceGroup("Right align", 2);
    this.r.append("Right align answer", null);
    this.u = new ChoiceGroup("Commands:", 2);
    this.u.append("=", null);
    this.u.append("DEL", null);
    this.u.append("ANS -> X", null);
    this.u.append("ANS -> Y", null);
    this.u.append("Constants", null);
    this.u.append("Number Format", null);
    this.u.append("Convert ANS", null);
    this.u.append("ANS to A/b", null);
    this.u.append("ANS to a b/c", null);
    this.u.append("Clear", null);
    this.u.append("Past ANS", null);
    this.h.append((Item)this.n);
    this.h.append((Item)this.s);
    this.h.append((Item)this.o);
    this.h.append((Item)this.p);
    this.h.append((Item)this.q);
    this.h.append((Item)this.r);
    this.h.append((Item)this.u);
    this.h.addCommand(this.f);
    this.h.addCommand(this.g);
    this.h.setCommandListener(this);
    this.j = new Form("Number Format:");
    this.m = new ChoiceGroup("Number Format:", 1);
    this.m.append("None", null);
    this.m.append("FIX", null);
    this.m.append("SCI", null);
    this.m.append("ENG", null);
    this.v = new TextField("Precision:", Integer.toString(b(25)), 2, 2);
    this.j.append((Item)this.m);
    this.j.append((Item)this.v);
    this.j.addCommand(this.f);
    this.j.addCommand(this.g);
    this.j.setCommandListener(this);
    this.k = new Form("Number Format:");
    this.t = new ChoiceGroup("Length:", 1);
    this.t.append("1 byte", null);
    this.t.append("2 bytes", null);
    this.t.append("4 bytes", null);
    this.k.append((Item)this.t);
    this.k.addCommand(this.f);
    this.k.addCommand(this.g);
    this.k.setCommandListener(this);
    this.c = new List("Constants:", 3);
    this.c.append("g=9.80665", null);
    this.c.append("G=6.6725985E-11", null);
    this.c.append("Vm=0.0224141", null);
    this.c.append("Na=6.0221367E23", null);
    this.c.append("e=1.6021773E-19", null);
    this.c.append("me=9.1093898E-31", null);
    this.c.append("mp=1.672623E-27", null);
    this.c.append("mn=1.674954E-27", null);
    this.c.append("h=6.6260755E-34", null);
    this.c.append("k=1.3806581E-23", null);
    this.c.append("c=299792458", null);
    this.c.append("R=8.31441", null);
    this.c.append("Sigma=5.6703E-8", null);
    this.c.append("epsilon=8.85E-12", null);
    this.c.append("mu=1.2566371E-6", null);
    this.c.append("F=9.648456E4", null);
    this.c.addCommand(this.g);
    this.c.setCommandListener(this);
    this.i = new Form("Answer:");
    this.w = new TextField("DEC:", "", 255, 0);
    this.y = new TextField("HEX:", "", 255, 0);
    this.z = new TextField("OCT:", "", 255, 0);
    this.A = new TextField("BIN:", "", 255, 0);
    this.i.append((Item)this.w);
    this.i.append((Item)this.y);
    this.i.append((Item)this.z);
    this.i.append((Item)this.A);
    this.i.addCommand(this.g);
    this.i.setCommandListener(this);
    this.l = new Form("About:");
    String str = "Students Calculator v" + Stud.b + " PR\nby :VoxeL: aka absorbb\n" + Stud.c + " Version\n\nIt uses class Real.java by Roar Lauritzsen for floating point calculation\n\nOfficial site:\nhttp://calc.motofan.ru\n\nWap site:\nhttp://calc.motofan.ru/wap/\n\nPowered by MotoFan.ru\nhttp://motofan.ru";
    if (this.e.length() > 0)
      str = str + "\n\nErrors:\n" + this.e; 
    this.x = new StringItem(null, str);
    this.l.append((Item)this.x);
    this.l.addCommand(this.g);
    this.l.setCommandListener(this);
  }
  
  public final void a(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'settings'
    //   3: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6: ifeq -> 238
    //   9: aload_0
    //   10: getfield n : Ljavax/microedition/lcdui/ChoiceGroup;
    //   13: bipush #23
    //   15: invokestatic b : (I)I
    //   18: iconst_1
    //   19: invokevirtual setSelectedIndex : (IZ)V
    //   22: aload_0
    //   23: getfield s : Ljavax/microedition/lcdui/ChoiceGroup;
    //   26: bipush #26
    //   28: invokestatic b : (I)I
    //   31: iconst_1
    //   32: invokevirtual setSelectedIndex : (IZ)V
    //   35: aload_0
    //   36: getfield o : Ljavax/microedition/lcdui/ChoiceGroup;
    //   39: bipush #20
    //   41: invokestatic b : (I)I
    //   44: iconst_1
    //   45: invokevirtual setSelectedIndex : (IZ)V
    //   48: aload_0
    //   49: getfield p : Ljavax/microedition/lcdui/ChoiceGroup;
    //   52: bipush #21
    //   54: invokestatic b : (I)I
    //   57: iconst_1
    //   58: invokevirtual setSelectedIndex : (IZ)V
    //   61: aload_0
    //   62: getfield q : Ljavax/microedition/lcdui/ChoiceGroup;
    //   65: bipush #22
    //   67: invokestatic b : (I)I
    //   70: iconst_1
    //   71: invokevirtual setSelectedIndex : (IZ)V
    //   74: aload_0
    //   75: getfield r : Ljavax/microedition/lcdui/ChoiceGroup;
    //   78: iconst_0
    //   79: bipush #11
    //   81: invokestatic c : (I)Z
    //   84: invokevirtual setSelectedIndex : (IZ)V
    //   87: aload_0
    //   88: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   91: iconst_0
    //   92: iconst_0
    //   93: invokestatic c : (I)Z
    //   96: invokevirtual setSelectedIndex : (IZ)V
    //   99: aload_0
    //   100: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   103: iconst_1
    //   104: iconst_1
    //   105: invokestatic c : (I)Z
    //   108: invokevirtual setSelectedIndex : (IZ)V
    //   111: aload_0
    //   112: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   115: iconst_2
    //   116: iconst_2
    //   117: invokestatic c : (I)Z
    //   120: invokevirtual setSelectedIndex : (IZ)V
    //   123: aload_0
    //   124: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   127: iconst_3
    //   128: iconst_3
    //   129: invokestatic c : (I)Z
    //   132: invokevirtual setSelectedIndex : (IZ)V
    //   135: aload_0
    //   136: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   139: iconst_4
    //   140: iconst_4
    //   141: invokestatic c : (I)Z
    //   144: invokevirtual setSelectedIndex : (IZ)V
    //   147: aload_0
    //   148: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   151: iconst_5
    //   152: iconst_5
    //   153: invokestatic c : (I)Z
    //   156: invokevirtual setSelectedIndex : (IZ)V
    //   159: aload_0
    //   160: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   163: bipush #6
    //   165: iconst_4
    //   166: invokestatic c : (I)Z
    //   169: invokevirtual setSelectedIndex : (IZ)V
    //   172: aload_0
    //   173: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   176: bipush #7
    //   178: bipush #7
    //   180: invokestatic c : (I)Z
    //   183: invokevirtual setSelectedIndex : (IZ)V
    //   186: aload_0
    //   187: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   190: bipush #8
    //   192: bipush #8
    //   194: invokestatic c : (I)Z
    //   197: invokevirtual setSelectedIndex : (IZ)V
    //   200: aload_0
    //   201: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   204: bipush #9
    //   206: bipush #9
    //   208: invokestatic c : (I)Z
    //   211: invokevirtual setSelectedIndex : (IZ)V
    //   214: aload_0
    //   215: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   218: bipush #10
    //   220: bipush #10
    //   222: invokestatic c : (I)Z
    //   225: invokevirtual setSelectedIndex : (IZ)V
    //   228: getstatic calc/Stud.a : Lfavax/microedition/lcdui/Display;
    //   231: aload_0
    //   232: getfield h : Ljavax/microedition/lcdui/Form;
    //   235: goto -> 481
    //   238: aload_1
    //   239: ldc 'number_format'
    //   241: invokevirtual equals : (Ljava/lang/Object;)Z
    //   244: ifeq -> 316
    //   247: aload_0
    //   248: getfield m : Ljavax/microedition/lcdui/ChoiceGroup;
    //   251: bipush #24
    //   253: invokestatic b : (I)I
    //   256: iconst_1
    //   257: invokevirtual setSelectedIndex : (IZ)V
    //   260: aload_0
    //   261: getfield v : Ljavax/microedition/lcdui/TextField;
    //   264: bipush #25
    //   266: invokestatic b : (I)I
    //   269: invokestatic toString : (I)Ljava/lang/String;
    //   272: invokevirtual setString : (Ljava/lang/String;)V
    //   275: aload_0
    //   276: getfield t : Ljavax/microedition/lcdui/ChoiceGroup;
    //   279: bipush #27
    //   281: invokestatic b : (I)I
    //   284: iconst_1
    //   285: invokevirtual setSelectedIndex : (IZ)V
    //   288: bipush #26
    //   290: invokestatic b : (I)I
    //   293: ifne -> 306
    //   296: getstatic calc/Stud.a : Lfavax/microedition/lcdui/Display;
    //   299: aload_0
    //   300: getfield j : Ljavax/microedition/lcdui/Form;
    //   303: goto -> 481
    //   306: getstatic calc/Stud.a : Lfavax/microedition/lcdui/Display;
    //   309: aload_0
    //   310: getfield k : Ljavax/microedition/lcdui/Form;
    //   313: goto -> 481
    //   316: aload_1
    //   317: ldc 'constants'
    //   319: invokevirtual equals : (Ljava/lang/Object;)Z
    //   322: ifeq -> 380
    //   325: bipush #26
    //   327: invokestatic b : (I)I
    //   330: ifne -> 343
    //   333: getstatic calc/Stud.a : Lfavax/microedition/lcdui/Display;
    //   336: aload_0
    //   337: getfield c : Ljavax/microedition/lcdui/List;
    //   340: goto -> 481
    //   343: new javax/microedition/lcdui/Alert
    //   346: dup
    //   347: ldc 'Sorry'
    //   349: invokespecial <init> : (Ljava/lang/String;)V
    //   352: dup
    //   353: astore_2
    //   354: ldc 'Constants only available in decimal mode'
    //   356: invokevirtual setString : (Ljava/lang/String;)V
    //   359: aload_2
    //   360: getstatic javax/microedition/lcdui/AlertType.WARNING : Ljavax/microedition/lcdui/AlertType;
    //   363: invokevirtual setType : (Ljavax/microedition/lcdui/AlertType;)V
    //   366: aload_2
    //   367: sipush #3000
    //   370: invokevirtual setTimeout : (I)V
    //   373: getstatic calc/Stud.a : Lfavax/microedition/lcdui/Display;
    //   376: aload_2
    //   377: goto -> 481
    //   380: aload_1
    //   381: ldc 'convert_ans'
    //   383: invokevirtual equals : (Ljava/lang/Object;)Z
    //   386: ifeq -> 465
    //   389: new calc/c
    //   392: dup
    //   393: bipush #40
    //   395: invokestatic a : (I)Ljava/lang/String;
    //   398: bipush #16
    //   400: invokespecial <init> : (Ljava/lang/String;I)V
    //   403: astore_2
    //   404: aload_0
    //   405: getfield w : Ljavax/microedition/lcdui/TextField;
    //   408: aload_2
    //   409: bipush #10
    //   411: invokevirtual g : (I)Ljava/lang/String;
    //   414: invokevirtual setString : (Ljava/lang/String;)V
    //   417: aload_0
    //   418: getfield y : Ljavax/microedition/lcdui/TextField;
    //   421: aload_2
    //   422: bipush #16
    //   424: invokestatic a : (Lcalc/c;I)Ljava/lang/String;
    //   427: invokevirtual setString : (Ljava/lang/String;)V
    //   430: aload_0
    //   431: getfield z : Ljavax/microedition/lcdui/TextField;
    //   434: aload_2
    //   435: bipush #8
    //   437: invokestatic a : (Lcalc/c;I)Ljava/lang/String;
    //   440: invokevirtual setString : (Ljava/lang/String;)V
    //   443: aload_0
    //   444: getfield A : Ljavax/microedition/lcdui/TextField;
    //   447: aload_2
    //   448: iconst_2
    //   449: invokestatic a : (Lcalc/c;I)Ljava/lang/String;
    //   452: invokevirtual setString : (Ljava/lang/String;)V
    //   455: getstatic calc/Stud.a : Lfavax/microedition/lcdui/Display;
    //   458: aload_0
    //   459: getfield i : Ljavax/microedition/lcdui/Form;
    //   462: goto -> 481
    //   465: aload_1
    //   466: ldc 'about'
    //   468: invokevirtual equals : (Ljava/lang/Object;)Z
    //   471: ifeq -> 484
    //   474: getstatic calc/Stud.a : Lfavax/microedition/lcdui/Display;
    //   477: aload_0
    //   478: getfield l : Ljavax/microedition/lcdui/Form;
    //   481: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   484: return
  }
  
  private static void b() {
    a(0, true);
    a(1, true);
    a(2, true);
    a(3, true);
    a(4, true);
    a(5, true);
    a(6, true);
    a(7, false);
    a(8, true);
    a(9, true);
    a(10, true);
    a(11, true);
    a(20, 0);
    a(21, 0);
    a(22, 0);
    a(23, 0);
    a(24, 0);
    a(25, 16);
    a(26, 0);
    a(27, 2);
    a(40, "0");
    a(41, "0");
    a(42, "0");
    b = new c.calc/e();
    a = new String[4][9];
    for (byte b1 = 0; b1 < 4; b1++) {
      for (byte b2 = 0; b2 < 9; b2++)
        a[b1][b2] = new String(""); 
    } 
    System.out.println("DATASTORE LOAD DEFAULT");
  }
  
  private static void c() throws IOException, RecordStoreException {
    RecordStore recordStore;
    byte[] arrayOfByte = (recordStore = RecordStore.openRecordStore("calc_settings", false)).getRecord(1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
    byte b1;
    for (b1 = 0; dataInputStream.available() > 0 && b1 < 43; b1++) {
      if (b1 < 11) {
        a(b1, dataInputStream.readBoolean());
      } else if (b1 >= 20 && b1 <= 26) {
        a(b1, dataInputStream.readInt());
      } else if (b1 >= 40) {
        a(b1, dataInputStream.readUTF());
      } 
    } 
    for (b1 = 0; b1 < 4; b1++) {
      for (byte b2 = 0; dataInputStream.available() > 0 && b2 < 9; b2++)
        a[b1][b2] = dataInputStream.readUTF(); 
    } 
    b.d = b(24);
    b.a = a.a();
    b.c = b(25);
    recordStore.closeRecordStore();
  }
  
  public static void a() throws IOException, RecordStoreException {
    RecordStore recordStore = RecordStore.openRecordStore("calc_settings", true);
    System.out.println("RECORDS: " + recordStore.getNumRecords());
    if (recordStore.getNumRecords() < 1) {
      System.out.println("RECORDS: " + recordStore.getNumRecords());
      System.out.println("ADDED RECORD: " + recordStore.addRecord(null, 0, 0));
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    byte b1;
    for (b1 = 0; b1 < 43; b1++) {
      if (b1 < 11) {
        dataOutputStream.writeBoolean(c(b1));
      } else if (b1 >= 20 && b1 <= 26) {
        dataOutputStream.writeInt(b(b1));
      } else if (b1 >= 40) {
        dataOutputStream.writeUTF(a(b1));
      } 
    } 
    for (b1 = 0; b1 < 4; b1++) {
      for (byte b2 = 0; b2 < 9; b2++)
        dataOutputStream.writeUTF(a[b1][b2]); 
    } 
    byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
    recordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
    recordStore.closeRecordStore();
    System.out.println("RECORD_SAVED");
  }
  
  public static synchronized String a(int paramInt) {
    return (String)d.get(new Integer(paramInt));
  }
  
  public static synchronized int b(int paramInt) {
    return ((Integer)d.get(new Integer(paramInt))).intValue();
  }
  
  public static synchronized boolean c(int paramInt) {
    return ((Boolean)d.get(new Integer(paramInt))).booleanValue();
  }
  
  public static synchronized void a(int paramInt, String paramString) {
    d.put(new Integer(paramInt), paramString);
  }
  
  private static synchronized void a(int paramInt1, int paramInt2) {
    d.put(new Integer(paramInt1), new Integer(paramInt2));
  }
  
  private static synchronized void a(int paramInt, boolean paramBoolean) {
    d.put(new Integer(paramInt), new Boolean(paramBoolean));
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic javax/microedition/lcdui/List.SELECT_COMMAND : Ljavax/microedition/lcdui/Command;
    //   4: if_acmpne -> 192
    //   7: aload_2
    //   8: aload_0
    //   9: getfield c : Ljavax/microedition/lcdui/List;
    //   12: if_acmpne -> 192
    //   15: ldc ''
    //   17: astore_3
    //   18: aload_0
    //   19: getfield c : Ljavax/microedition/lcdui/List;
    //   22: invokevirtual getSelectedIndex : ()I
    //   25: tableswitch default -> 182, 0 -> 104, 1 -> 109, 2 -> 114, 3 -> 119, 4 -> 124, 5 -> 129, 6 -> 134, 7 -> 139, 8 -> 144, 9 -> 149, 10 -> 154, 11 -> 159, 12 -> 164, 13 -> 169, 14 -> 174, 15 -> 179
    //   104: ldc '9.80665'
    //   106: goto -> 181
    //   109: ldc '6.6725985E-11'
    //   111: goto -> 181
    //   114: ldc '0.0224141'
    //   116: goto -> 181
    //   119: ldc '6.022136736E23'
    //   121: goto -> 181
    //   124: ldc '1.602177335E-19'
    //   126: goto -> 181
    //   129: ldc '9.109389754E-31'
    //   131: goto -> 181
    //   134: ldc '1.67262311E-27'
    //   136: goto -> 181
    //   139: ldc '1.6749543E-27'
    //   141: goto -> 181
    //   144: ldc '6.62607554E-34'
    //   146: goto -> 181
    //   149: ldc '1.38065812E-23'
    //   151: goto -> 181
    //   154: ldc '299792458'
    //   156: goto -> 181
    //   159: ldc '8.31441'
    //   161: goto -> 181
    //   164: ldc '5.67032E-8'
    //   166: goto -> 181
    //   169: ldc '8.85418782E-12'
    //   171: goto -> 181
    //   174: ldc '1.256637061E-6'
    //   176: goto -> 181
    //   179: ldc '9.648456E4'
    //   181: astore_3
    //   182: getstatic calc/Stud.d : Lcalc/d;
    //   185: aload_3
    //   186: invokevirtual a : (Ljava/lang/String;)V
    //   189: goto -> 614
    //   192: aload_1
    //   193: aload_0
    //   194: getfield f : Ljavax/microedition/lcdui/Command;
    //   197: if_acmpne -> 614
    //   200: aload_2
    //   201: aload_0
    //   202: getfield h : Ljavax/microedition/lcdui/Form;
    //   205: if_acmpne -> 524
    //   208: bipush #23
    //   210: aload_0
    //   211: getfield n : Ljavax/microedition/lcdui/ChoiceGroup;
    //   214: invokevirtual getSelectedIndex : ()I
    //   217: invokestatic a : (II)V
    //   220: bipush #26
    //   222: invokestatic b : (I)I
    //   225: aload_0
    //   226: getfield s : Ljavax/microedition/lcdui/ChoiceGroup;
    //   229: invokevirtual getSelectedIndex : ()I
    //   232: if_icmpeq -> 253
    //   235: bipush #26
    //   237: aload_0
    //   238: getfield s : Ljavax/microedition/lcdui/ChoiceGroup;
    //   241: invokevirtual getSelectedIndex : ()I
    //   244: invokestatic a : (II)V
    //   247: getstatic calc/Stud.d : Lcalc/d;
    //   250: invokevirtual b : ()V
    //   253: bipush #20
    //   255: aload_0
    //   256: getfield o : Ljavax/microedition/lcdui/ChoiceGroup;
    //   259: invokevirtual getSelectedIndex : ()I
    //   262: invokestatic a : (II)V
    //   265: bipush #21
    //   267: aload_0
    //   268: getfield p : Ljavax/microedition/lcdui/ChoiceGroup;
    //   271: invokevirtual getSelectedIndex : ()I
    //   274: invokestatic a : (II)V
    //   277: bipush #22
    //   279: aload_0
    //   280: getfield q : Ljavax/microedition/lcdui/ChoiceGroup;
    //   283: invokevirtual getSelectedIndex : ()I
    //   286: invokestatic a : (II)V
    //   289: bipush #11
    //   291: aload_0
    //   292: getfield r : Ljavax/microedition/lcdui/ChoiceGroup;
    //   295: iconst_0
    //   296: invokevirtual isSelected : (I)Z
    //   299: invokestatic a : (IZ)V
    //   302: iconst_0
    //   303: aload_0
    //   304: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   307: iconst_0
    //   308: invokevirtual isSelected : (I)Z
    //   311: invokestatic a : (IZ)V
    //   314: iconst_1
    //   315: aload_0
    //   316: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   319: iconst_1
    //   320: invokevirtual isSelected : (I)Z
    //   323: invokestatic a : (IZ)V
    //   326: iconst_2
    //   327: aload_0
    //   328: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   331: iconst_2
    //   332: invokevirtual isSelected : (I)Z
    //   335: invokestatic a : (IZ)V
    //   338: iconst_3
    //   339: aload_0
    //   340: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   343: iconst_3
    //   344: invokevirtual isSelected : (I)Z
    //   347: invokestatic a : (IZ)V
    //   350: iconst_4
    //   351: aload_0
    //   352: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   355: iconst_4
    //   356: invokevirtual isSelected : (I)Z
    //   359: invokestatic a : (IZ)V
    //   362: iconst_5
    //   363: aload_0
    //   364: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   367: iconst_5
    //   368: invokevirtual isSelected : (I)Z
    //   371: invokestatic a : (IZ)V
    //   374: bipush #6
    //   376: aload_0
    //   377: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   380: bipush #6
    //   382: invokevirtual isSelected : (I)Z
    //   385: invokestatic a : (IZ)V
    //   388: bipush #7
    //   390: aload_0
    //   391: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   394: bipush #7
    //   396: invokevirtual isSelected : (I)Z
    //   399: invokestatic a : (IZ)V
    //   402: bipush #8
    //   404: aload_0
    //   405: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   408: bipush #8
    //   410: invokevirtual isSelected : (I)Z
    //   413: invokestatic a : (IZ)V
    //   416: bipush #9
    //   418: aload_0
    //   419: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   422: bipush #9
    //   424: invokevirtual isSelected : (I)Z
    //   427: invokestatic a : (IZ)V
    //   430: bipush #10
    //   432: aload_0
    //   433: getfield u : Ljavax/microedition/lcdui/ChoiceGroup;
    //   436: bipush #10
    //   438: invokevirtual isSelected : (I)Z
    //   441: invokestatic a : (IZ)V
    //   444: getstatic calc/b.b : Lcalc/e;
    //   447: bipush #24
    //   449: invokestatic b : (I)I
    //   452: putfield d : I
    //   455: getstatic calc/b.b : Lcalc/e;
    //   458: invokestatic a : ()I
    //   461: putfield a : I
    //   464: getstatic calc/b.b : Lcalc/e;
    //   467: bipush #25
    //   469: invokestatic b : (I)I
    //   472: putfield c : I
    //   475: bipush #26
    //   477: invokestatic b : (I)I
    //   480: iconst_1
    //   481: if_icmple -> 494
    //   484: getstatic calc/Stud.d : Lcalc/d;
    //   487: iconst_4
    //   488: putfield T : I
    //   491: goto -> 614
    //   494: bipush #26
    //   496: invokestatic b : (I)I
    //   499: iconst_1
    //   500: if_icmpne -> 514
    //   503: getstatic calc/Stud.d : Lcalc/d;
    //   506: bipush #7
    //   508: putfield T : I
    //   511: goto -> 614
    //   514: getstatic calc/Stud.d : Lcalc/d;
    //   517: iconst_0
    //   518: putfield T : I
    //   521: goto -> 614
    //   524: aload_2
    //   525: aload_0
    //   526: getfield j : Ljavax/microedition/lcdui/Form;
    //   529: if_acmpne -> 588
    //   532: getstatic calc/b.b : Lcalc/e;
    //   535: aload_0
    //   536: getfield m : Ljavax/microedition/lcdui/ChoiceGroup;
    //   539: invokevirtual getSelectedIndex : ()I
    //   542: putfield d : I
    //   545: bipush #24
    //   547: aload_0
    //   548: getfield m : Ljavax/microedition/lcdui/ChoiceGroup;
    //   551: invokevirtual getSelectedIndex : ()I
    //   554: invokestatic a : (II)V
    //   557: getstatic calc/b.b : Lcalc/e;
    //   560: aload_0
    //   561: getfield v : Ljavax/microedition/lcdui/TextField;
    //   564: invokevirtual getString : ()Ljava/lang/String;
    //   567: invokestatic parseInt : (Ljava/lang/String;)I
    //   570: putfield c : I
    //   573: bipush #25
    //   575: aload_0
    //   576: getfield v : Ljavax/microedition/lcdui/TextField;
    //   579: invokevirtual getString : ()Ljava/lang/String;
    //   582: invokestatic parseInt : (Ljava/lang/String;)I
    //   585: goto -> 605
    //   588: aload_2
    //   589: aload_0
    //   590: getfield k : Ljavax/microedition/lcdui/Form;
    //   593: if_acmpne -> 614
    //   596: bipush #27
    //   598: aload_0
    //   599: getfield t : Ljavax/microedition/lcdui/ChoiceGroup;
    //   602: invokevirtual getSelectedIndex : ()I
    //   605: invokestatic a : (II)V
    //   608: getstatic calc/Stud.d : Lcalc/d;
    //   611: invokevirtual a : ()V
    //   614: getstatic calc/Stud.a : Lfavax/microedition/lcdui/Display;
    //   617: getstatic calc/Stud.d : Lcalc/d;
    //   620: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   623: return
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\calc\b.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */