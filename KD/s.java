package KD;

import java.util.Enumeration;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.Spacer;

public final class s implements Runnable, CommandListener {
  public ae a;
  
  public byte b = 0;
  
  private Image q;
  
  private Image r;
  
  private Image s;
  
  private Image t;
  
  public Form c;
  
  public List d;
  
  private Command u;
  
  private Command v;
  
  private Command w;
  
  private Command x;
  
  private Command y;
  
  private Command z;
  
  private Command A;
  
  private Command B;
  
  private Command C;
  
  public String e = "/";
  
  public String f = "/";
  
  public boolean g = false;
  
  public String[] h;
  
  public String[] i = null;
  
  public String[] j = null;
  
  public Alert k;
  
  public int l = 0;
  
  public String m = "";
  
  public String[] n = null;
  
  public Command o = null;
  
  public CommandListener p = null;
  
  public s(ae paramae) {
    this.a = paramae;
    this.c = new Form("Подождите...");
    try {
      Image image = Image.createImage("/images/pm/pm_wait.png");
      ImageItem imageItem = new ImageItem("", image, 3, "Подождите...");
      Spacer spacer = new Spacer(this.c.getWidth(), (this.c.getHeight() - image.getHeight()) / 2);
      this.c.append((Item)spacer);
      this.c.append((Item)imageItem);
    } catch (Exception exception) {}
    this.u = new Command("Назад", 2, 1);
    this.v = new Command("Открыть", 4, 0);
    this.w = new Command("Добавить", 4, 0);
    this.z = new Command("Готово", 4, 1);
    this.x = new Command("Добавить все", 4, 2);
    this.y = new Command("Перейти в начало", 4, 3);
    this.A = new Command("Отмена", 4, 4);
    this.C = new Command("Выбрать", 4, 1);
    this.B = new Command("Выбрать текущую", 4, 2);
    try {
      this.q = Image.createImage("/images/pm/pm_root.png");
      this.r = Image.createImage("/images/pm/pm_dir.png");
      this.s = Image.createImage("/images/lib/lib_music.png");
      this.t = Image.createImage("/images/lib/lib_allvideo.png");
    } catch (Exception exception) {}
    this.k = new Alert("Добавление...", "Добавлено", null, null);
    this.k.setTimeout(500);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield v : Ljavax/microedition/lcdui/Command;
    //   5: if_acmpne -> 70
    //   8: aload_0
    //   9: getfield d : Ljavax/microedition/lcdui/List;
    //   12: invokevirtual getSelectedIndex : ()I
    //   15: dup
    //   16: istore_3
    //   17: iflt -> 69
    //   20: aload_0
    //   21: getfield d : Ljavax/microedition/lcdui/List;
    //   24: iload_3
    //   25: invokevirtual getString : (I)Ljava/lang/String;
    //   28: dup
    //   29: astore #4
    //   31: ldc '/'
    //   33: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   36: ifeq -> 69
    //   39: new java/lang/StringBuffer
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: aload_0
    //   47: dup_x1
    //   48: getfield e : Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   54: aload #4
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: putfield e : Ljava/lang/String;
    //   65: aload_0
    //   66: invokespecial c : ()V
    //   69: return
    //   70: aload_1
    //   71: aload_0
    //   72: getfield u : Ljavax/microedition/lcdui/Command;
    //   75: if_acmpne -> 194
    //   78: aload_0
    //   79: invokespecial a : ()V
    //   82: aload_0
    //   83: getfield e : Ljava/lang/String;
    //   86: aload_0
    //   87: getfield f : Ljava/lang/String;
    //   90: if_acmpne -> 97
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: aload_0
    //   99: getfield b : B
    //   102: ifne -> 109
    //   105: iconst_1
    //   106: goto -> 110
    //   109: iconst_0
    //   110: iand
    //   111: ifeq -> 164
    //   114: aload_0
    //   115: getfield a : LKD/ae;
    //   118: getfield i : LKD/d;
    //   121: aload_0
    //   122: getfield a : LKD/ae;
    //   125: getfield i : LKD/d;
    //   128: invokevirtual getClass : ()Ljava/lang/Class;
    //   131: pop
    //   132: iconst_3
    //   133: putfield b : I
    //   136: aload_0
    //   137: getfield a : LKD/ae;
    //   140: getfield i : LKD/d;
    //   143: invokevirtual a : ()V
    //   146: aload_0
    //   147: getfield a : LKD/ae;
    //   150: getfield i : LKD/d;
    //   153: getfield j : LKD/x;
    //   156: iconst_0
    //   157: iconst_1
    //   158: invokevirtual setSelectedIndex : (IZ)V
    //   161: goto -> 894
    //   164: aload_0
    //   165: getfield e : Ljava/lang/String;
    //   168: invokevirtual length : ()I
    //   171: aload_0
    //   172: getfield f : Ljava/lang/String;
    //   175: invokevirtual length : ()I
    //   178: if_icmpeq -> 906
    //   181: aload_0
    //   182: aload_0
    //   183: getfield f : Ljava/lang/String;
    //   186: putfield e : Ljava/lang/String;
    //   189: aload_0
    //   190: invokespecial c : ()V
    //   193: return
    //   194: aload_1
    //   195: aload_0
    //   196: getfield w : Ljavax/microedition/lcdui/Command;
    //   199: if_acmpne -> 329
    //   202: aload_0
    //   203: getfield d : Ljavax/microedition/lcdui/List;
    //   206: invokevirtual getSelectedIndex : ()I
    //   209: dup
    //   210: istore_3
    //   211: iflt -> 328
    //   214: aload_0
    //   215: getfield d : Ljavax/microedition/lcdui/List;
    //   218: iload_3
    //   219: invokevirtual getString : (I)Ljava/lang/String;
    //   222: dup
    //   223: astore #4
    //   225: ldc '/'
    //   227: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   230: ifeq -> 266
    //   233: new java/lang/StringBuffer
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: aload_0
    //   241: dup_x1
    //   242: getfield e : Ljava/lang/String;
    //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   248: aload #4
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: putfield e : Ljava/lang/String;
    //   259: aload_0
    //   260: invokespecial c : ()V
    //   263: goto -> 906
    //   266: new java/lang/StringBuffer
    //   269: dup
    //   270: invokespecial <init> : ()V
    //   273: aload_0
    //   274: dup_x1
    //   275: getfield m : Ljava/lang/String;
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   281: aload_0
    //   282: getfield e : Ljava/lang/String;
    //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   288: aload #4
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   293: bipush #42
    //   295: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   298: invokevirtual toString : ()Ljava/lang/String;
    //   301: putfield m : Ljava/lang/String;
    //   304: aload_0
    //   305: dup
    //   306: getfield l : I
    //   309: iconst_1
    //   310: iadd
    //   311: putfield l : I
    //   314: aload_0
    //   315: getfield a : LKD/ae;
    //   318: getfield a : Lfavax/microedition/lcdui/Display;
    //   321: aload_0
    //   322: getfield k : Ljavax/microedition/lcdui/Alert;
    //   325: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   328: return
    //   329: aload_1
    //   330: aload_0
    //   331: getfield x : Ljavax/microedition/lcdui/Command;
    //   334: if_acmpne -> 515
    //   337: iconst_1
    //   338: istore_3
    //   339: aload_0
    //   340: getfield i : [Ljava/lang/String;
    //   343: ifnull -> 476
    //   346: aload_0
    //   347: getfield i : [Ljava/lang/String;
    //   350: arraylength
    //   351: ifle -> 476
    //   354: aload_0
    //   355: getfield a : LKD/ae;
    //   358: getfield a : Lfavax/microedition/lcdui/Display;
    //   361: aload_0
    //   362: getfield a : LKD/ae;
    //   365: getfield j : LKD/s;
    //   368: getfield c : Ljavax/microedition/lcdui/Form;
    //   371: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   374: iconst_0
    //   375: istore_3
    //   376: iconst_0
    //   377: istore #4
    //   379: iload #4
    //   381: aload_0
    //   382: getfield i : [Ljava/lang/String;
    //   385: arraylength
    //   386: if_icmpge -> 448
    //   389: new java/lang/StringBuffer
    //   392: dup
    //   393: invokespecial <init> : ()V
    //   396: aload_0
    //   397: dup_x1
    //   398: getfield m : Ljava/lang/String;
    //   401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   404: aload_0
    //   405: getfield e : Ljava/lang/String;
    //   408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   411: aload_0
    //   412: getfield i : [Ljava/lang/String;
    //   415: iload #4
    //   417: aaload
    //   418: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   421: bipush #42
    //   423: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   426: invokevirtual toString : ()Ljava/lang/String;
    //   429: putfield m : Ljava/lang/String;
    //   432: aload_0
    //   433: dup
    //   434: getfield l : I
    //   437: iconst_1
    //   438: iadd
    //   439: putfield l : I
    //   442: iinc #4, 1
    //   445: goto -> 379
    //   448: aload_0
    //   449: getfield a : LKD/ae;
    //   452: getfield a : Lfavax/microedition/lcdui/Display;
    //   455: aload_0
    //   456: getfield d : Ljavax/microedition/lcdui/List;
    //   459: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   462: aload_0
    //   463: getfield a : LKD/ae;
    //   466: getfield a : Lfavax/microedition/lcdui/Display;
    //   469: aload_0
    //   470: getfield k : Ljavax/microedition/lcdui/Alert;
    //   473: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   476: iload_3
    //   477: ifeq -> 514
    //   480: new javax/microedition/lcdui/Alert
    //   483: dup
    //   484: ldc 'Добавление'
    //   486: ldc 'Нет файлов для добавления'
    //   488: aconst_null
    //   489: aconst_null
    //   490: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljavax/microedition/lcdui/Image;Ljavax/microedition/lcdui/AlertType;)V
    //   493: dup
    //   494: astore #4
    //   496: sipush #1000
    //   499: invokevirtual setTimeout : (I)V
    //   502: aload_0
    //   503: getfield a : LKD/ae;
    //   506: getfield a : Lfavax/microedition/lcdui/Display;
    //   509: aload #4
    //   511: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   514: return
    //   515: aload_1
    //   516: aload_0
    //   517: getfield y : Ljavax/microedition/lcdui/Command;
    //   520: if_acmpne -> 556
    //   523: aload_0
    //   524: getfield e : Ljava/lang/String;
    //   527: ldc '/'
    //   529: if_acmpne -> 533
    //   532: return
    //   533: aload_0
    //   534: invokespecial b : ()Ljava/lang/String;
    //   537: astore_3
    //   538: aload_0
    //   539: getfield e : Ljava/lang/String;
    //   542: aload_3
    //   543: if_acmpeq -> 555
    //   546: aload_0
    //   547: aload_3
    //   548: putfield e : Ljava/lang/String;
    //   551: aload_0
    //   552: invokespecial c : ()V
    //   555: return
    //   556: aload_1
    //   557: aload_0
    //   558: getfield A : Ljavax/microedition/lcdui/Command;
    //   561: if_acmpne -> 604
    //   564: aload_0
    //   565: getfield p : Ljavax/microedition/lcdui/CommandListener;
    //   568: ifnull -> 906
    //   571: aload_0
    //   572: ldc ''
    //   574: putfield m : Ljava/lang/String;
    //   577: aload_0
    //   578: iconst_0
    //   579: putfield l : I
    //   582: aload_0
    //   583: aconst_null
    //   584: putfield n : [Ljava/lang/String;
    //   587: aload_0
    //   588: getfield p : Ljavax/microedition/lcdui/CommandListener;
    //   591: aload_0
    //   592: getfield o : Ljavax/microedition/lcdui/Command;
    //   595: aconst_null
    //   596: invokeinterface commandAction : (Ljavax/microedition/lcdui/Command;Ljavax/microedition/lcdui/Displayable;)V
    //   601: goto -> 894
    //   604: aload_1
    //   605: aload_0
    //   606: getfield z : Ljavax/microedition/lcdui/Command;
    //   609: if_acmpne -> 663
    //   612: aload_0
    //   613: getfield p : Ljavax/microedition/lcdui/CommandListener;
    //   616: ifnull -> 906
    //   619: aload_0
    //   620: aload_0
    //   621: getfield m : Ljava/lang/String;
    //   624: aload_0
    //   625: getfield l : I
    //   628: invokestatic a : (Ljava/lang/String;I)[Ljava/lang/String;
    //   631: putfield n : [Ljava/lang/String;
    //   634: aload_0
    //   635: ldc ''
    //   637: putfield m : Ljava/lang/String;
    //   640: aload_0
    //   641: iconst_0
    //   642: putfield l : I
    //   645: new java/lang/Thread
    //   648: dup
    //   649: new KD/l
    //   652: dup
    //   653: aload_0
    //   654: invokespecial <init> : (LKD/s;)V
    //   657: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   660: goto -> 891
    //   663: aload_1
    //   664: aload_0
    //   665: getfield C : Ljavax/microedition/lcdui/Command;
    //   668: if_acmpne -> 806
    //   671: aload_0
    //   672: getfield d : Ljavax/microedition/lcdui/List;
    //   675: invokevirtual getSelectedIndex : ()I
    //   678: dup
    //   679: istore_3
    //   680: ifge -> 720
    //   683: new javax/microedition/lcdui/Alert
    //   686: dup
    //   687: ldc 'Открытие...'
    //   689: ldc 'Папка не выбрана!'
    //   691: aconst_null
    //   692: aconst_null
    //   693: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljavax/microedition/lcdui/Image;Ljavax/microedition/lcdui/AlertType;)V
    //   696: dup
    //   697: astore #4
    //   699: sipush #2000
    //   702: invokevirtual setTimeout : (I)V
    //   705: aload_0
    //   706: getfield a : LKD/ae;
    //   709: getfield a : Lfavax/microedition/lcdui/Display;
    //   712: aload #4
    //   714: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   717: goto -> 906
    //   720: aload_0
    //   721: getfield d : Ljavax/microedition/lcdui/List;
    //   724: iload_3
    //   725: invokevirtual getString : (I)Ljava/lang/String;
    //   728: dup
    //   729: astore #4
    //   731: ldc '/'
    //   733: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   736: ifeq -> 805
    //   739: aload_0
    //   740: iconst_1
    //   741: anewarray java/lang/String
    //   744: putfield n : [Ljava/lang/String;
    //   747: aload_0
    //   748: getfield n : [Ljava/lang/String;
    //   751: iconst_0
    //   752: new java/lang/StringBuffer
    //   755: dup
    //   756: invokespecial <init> : ()V
    //   759: aload_0
    //   760: getfield e : Ljava/lang/String;
    //   763: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   766: aload #4
    //   768: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   771: invokevirtual toString : ()Ljava/lang/String;
    //   774: aastore
    //   775: new java/lang/Thread
    //   778: dup
    //   779: new KD/n
    //   782: dup
    //   783: aload_0
    //   784: invokespecial <init> : (LKD/s;)V
    //   787: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   790: invokevirtual start : ()V
    //   793: aload_0
    //   794: getfield d : Ljavax/microedition/lcdui/List;
    //   797: invokevirtual deleteAll : ()V
    //   800: aload_0
    //   801: aconst_null
    //   802: putfield d : Ljavax/microedition/lcdui/List;
    //   805: return
    //   806: aload_1
    //   807: aload_0
    //   808: getfield B : Ljavax/microedition/lcdui/Command;
    //   811: if_acmpne -> 906
    //   814: aload_0
    //   815: getfield e : Ljava/lang/String;
    //   818: invokevirtual length : ()I
    //   821: iconst_2
    //   822: if_icmpge -> 858
    //   825: new javax/microedition/lcdui/Alert
    //   828: dup
    //   829: ldc 'Открытие...'
    //   831: ldc 'Действие невозможно!'
    //   833: aconst_null
    //   834: aconst_null
    //   835: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljavax/microedition/lcdui/Image;Ljavax/microedition/lcdui/AlertType;)V
    //   838: dup
    //   839: astore_3
    //   840: sipush #2000
    //   843: invokevirtual setTimeout : (I)V
    //   846: aload_0
    //   847: getfield a : LKD/ae;
    //   850: getfield a : Lfavax/microedition/lcdui/Display;
    //   853: aload_3
    //   854: invokevirtual setCurrent : (Ljavax/microedition/lcdui/Displayable;)V
    //   857: return
    //   858: aload_0
    //   859: iconst_1
    //   860: anewarray java/lang/String
    //   863: putfield n : [Ljava/lang/String;
    //   866: aload_0
    //   867: getfield n : [Ljava/lang/String;
    //   870: iconst_0
    //   871: aload_0
    //   872: getfield e : Ljava/lang/String;
    //   875: aastore
    //   876: new java/lang/Thread
    //   879: dup
    //   880: new KD/k
    //   883: dup
    //   884: aload_0
    //   885: invokespecial <init> : (LKD/s;)V
    //   888: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   891: invokevirtual start : ()V
    //   894: aload_0
    //   895: getfield d : Ljavax/microedition/lcdui/List;
    //   898: invokevirtual deleteAll : ()V
    //   901: aload_0
    //   902: aconst_null
    //   903: putfield d : Ljavax/microedition/lcdui/List;
    //   906: return
  }
  
  public final void run() {
    this.a.a.setCurrent((Displayable)this.c);
    this.d.deleteAll();
    this.i = null;
    this.j = null;
    try {
      Enumeration enumeration = null;
      int i = this.e.length();
      byte b1 = 0;
      byte b2 = 0;
      String str1 = "";
      String str2 = "";
      if (i < 2) {
        enumeration = FileSystemRegistry.listRoots();
      } else {
        FileConnection fileConnection;
        enumeration = (fileConnection = (FileConnection)Connector.open("file://" + this.e, 1)).list("*", true);
        fileConnection.close();
      } 
      if (enumeration != null) {
        while (enumeration.hasMoreElements()) {
          String str;
          if ((str = enumeration.nextElement()).endsWith("/")) {
            str1 = str1 + str + '*';
            b1++;
            continue;
          } 
          if (!this.g && a(str, this.h)) {
            str2 = str2 + str + '*';
            b2++;
          } 
        } 
        this.j = a(str1, b1);
        c c;
        (c = new c()).a(this.j);
        byte b;
        for (b = 0; b < this.j.length; b++) {
          if (i < 2) {
            this.d.append(this.j[b], this.q);
          } else {
            this.d.append(this.j[b], this.r);
          } 
        } 
        this.i = a(str2, b2);
        c.a(this.i);
        for (b = 0; b < this.i.length; b++) {
          if (!u.d(this.i[b])) {
            this.d.append(this.i[b], this.s);
          } else {
            this.d.append(this.i[b], this.t);
          } 
        } 
      } 
    } catch (Exception exception) {}
    this.a.a.setCurrent((Displayable)this.d);
  }
  
  public final void a(Command paramCommand, CommandListener paramCommandListener, String[] paramArrayOfString) {
    if ((((paramCommand == null) ? 1 : 0) | ((paramCommandListener == null) ? 1 : 0)) != 0)
      return; 
    this.b = 1;
    this.h = paramArrayOfString;
    this.l = 0;
    this.m = "";
    this.n = null;
    this.o = paramCommand;
    this.p = paramCommandListener;
    this.e = "/";
    this.g = false;
    if (this.d != null)
      this.d = null; 
    this.d = new List("Добавлени файлов", 3);
    this.d.setSelectCommand(this.w);
    this.d.setCommandListener(this);
    this.d.addCommand(this.z);
    this.d.addCommand(this.x);
    this.d.addCommand(this.y);
    this.d.addCommand(this.A);
    this.d.addCommand(this.u);
    c();
  }
  
  public final void a(Command paramCommand, CommandListener paramCommandListener, String paramString) {
    if ((((paramCommand == null) ? 1 : 0) | ((paramCommandListener == null) ? 1 : 0)) != 0)
      return; 
    this.b = 2;
    this.h = null;
    this.l = 0;
    this.m = "";
    this.n = null;
    this.o = paramCommand;
    this.p = paramCommandListener;
    this.e = (paramString == null) ? "/" : paramString;
    this.g = true;
    if (this.d != null)
      this.d = null; 
    this.d = new List("Выбор папки", 3);
    this.d.setCommandListener(this);
    this.d.setSelectCommand(this.v);
    this.d.addCommand(this.u);
    this.d.addCommand(this.C);
    this.d.addCommand(this.B);
    this.d.addCommand(this.y);
    this.d.addCommand(this.A);
    c();
  }
  
  private void a() {
    int i = 0;
    for (int j = this.e.length() - 2; j >= 0; j--) {
      if (this.e.charAt(j) == '/') {
        i = j;
        break;
      } 
    } 
    this.f = this.e.substring(0, i + 1);
  }
  
  private String b() {
    String str = "";
    byte b = 0;
    for (byte b1 = 0; b1 < this.e.length(); b1++) {
      str = str + this.e.charAt(b1);
      if (this.e.charAt(b1) == '/')
        b = (byte)(b + 1); 
      if (b > 1)
        break; 
    } 
    return str;
  }
  
  private void c() {
    Thread thread;
    (thread = new Thread(this)).start();
  }
  
  private static String[] a(String paramString, int paramInt) {
    String[] arrayOfString = new String[paramInt];
    String str = null;
    byte b1 = 0;
    int i = 0;
    for (byte b2 = 0; b2 < paramString.length(); b2++) {
      if (paramString.charAt(b2) == '*') {
        str = paramString.substring(i, b2);
        arrayOfString[b1] = str;
        b1++;
        i = b2 + 1;
      } 
    } 
    return arrayOfString;
  }
  
  private static boolean a(String paramString, String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      return true; 
    if (paramArrayOfString.length < 1)
      return true; 
    boolean bool = false;
    String str = paramString.toLowerCase();
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (str.endsWith(paramArrayOfString[b])) {
        bool = true;
        break;
      } 
    } 
    return bool;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */