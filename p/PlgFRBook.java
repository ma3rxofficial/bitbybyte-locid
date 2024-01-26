package p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public class PlgFRBook implements Runnable {
  public boolean a = false;
  
  public byte b;
  
  public byte c;
  
  public byte d;
  
  public byte e;
  
  public Image f;
  
  public Image g;
  
  public Image h;
  
  public Graphics i;
  
  public Graphics j;
  
  public int k;
  
  public int l;
  
  public int m = 16384;
  
  public int n = 0;
  
  public int o = 0;
  
  public int p;
  
  public int q;
  
  public byte[] r = new byte[] { 0 };
  
  public byte[] s = new byte[] { 0 };
  
  public int t = 268435455;
  
  public int u = 268435455;
  
  public int v = 268435455;
  
  public InputStream w;
  
  public String x;
  
  public InputStream y;
  
  public int z = 0;
  
  public int A = 0;
  
  public boolean B;
  
  public byte[] C = new byte[256];
  
  public byte D = 0;
  
  public boolean E = false;
  
  public Vector F = new Vector();
  
  public short G;
  
  public String H;
  
  public int I;
  
  public int J;
  
  public boolean K;
  
  public String L;
  
  public Image M;
  
  public String N;
  
  public Image O;
  
  public boolean P;
  
  public int Q;
  
  public int R;
  
  public int S;
  
  public PlgFRStyles T;
  
  public int U;
  
  public StringBuffer V;
  
  public int W;
  
  public int X;
  
  public boolean Y = false;
  
  public int Z = 0;
  
  public int aa = 0;
  
  public boolean ab = true;
  
  public int ac = 0;
  
  public int ad = 0;
  
  public int ae = 0;
  
  public int af = 0;
  
  public int ag = 0;
  
  public boolean ah = false;
  
  public int ai = 0;
  
  public int aj = 0;
  
  public boolean ak = false;
  
  public boolean al = false;
  
  public boolean am;
  
  public boolean an;
  
  public boolean ao;
  
  public int ap;
  
  public int aq = -1;
  
  private int aL = 0;
  
  public int ar = 0;
  
  public int as = 0;
  
  public int at;
  
  public int au;
  
  public int av;
  
  public int aw;
  
  public static final char[] ax = new char[] { 
      ' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')', 
      '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', 
      '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', 
      '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 
      'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 
      'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', 
      '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 
      'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 
      'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 
      'z', '{', '|', '}', '~', '', 'Ђ', 'Ѓ', '‚', 'ѓ', 
      '„', '…', '†', '‡', '€', '‰', 'Љ', '‹', 'Њ', 'Ќ', 
      'Ћ', 'Џ', 'ђ', '‘', '’', '“', '”', '•', '-', '-', 
      '?', '™', 'љ', '›', 'њ', 'ќ', 'ћ', 'џ', ' ', 'Ў', 
      'ў', 'Ј', '¤', 'Ґ', '¦', '§', 'Ё', '©', 'Є', '«', 
      '¬', '-', '®', 'Ї', '°', '±', 'І', 'і', 'ґ', 'µ', 
      '¶', '•', 'ё', '№', 'є', '»', 'ј', 'Ѕ', 'ѕ', 'ї', 
      'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'Й', 
      'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 
      'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 
      'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 
      'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 
      'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 
      'ь', 'э', 'ю', 'я' };
  
  public int[] ay;
  
  public int[] az;
  
  public int[] aA;
  
  public int aB;
  
  public byte[] aC = new byte[] { 7, 1, 5, 8 };
  
  public int aD;
  
  public int aE = 0;
  
  public int aF;
  
  public boolean aG = false;
  
  public Canvas aH;
  
  public boolean aI = false;
  
  public boolean aJ = false;
  
  public boolean aK = false;
  
  public static String a(String paramString) {
    while ((paramString = paramString.substring(0, paramString.length() - 1)).length() > 0 && paramString.charAt(paramString.length() - 1) != '/');
    return paramString;
  }
  
  public final String a() {
    int i;
    if ((i = this.aq) == -1)
      return ""; 
    if (this.ae == 0)
      return ""; 
    i += 2;
    short s = b(i++);
    StringBuffer stringBuffer = new StringBuffer();
    while (s > 31) {
      stringBuffer.append(a(s));
      s = b(i++);
    } 
    return stringBuffer.toString();
  }
  
  public static char a(short paramShort) {
    return (paramShort < 32) ? (char)paramShort : ax[paramShort - 32];
  }
  
  public static byte[] b(String paramString) {
    byte[] arrayOfByte = new byte[paramString.length()];
    for (byte b = 0; b < paramString.length(); b++)
      arrayOfByte[b] = (byte)a(paramString.charAt(b)); 
    return arrayOfByte;
  }
  
  public static short a(char paramChar) {
    return (paramChar == ' ') ? 32 : ((paramChar == '!') ? 33 : ((paramChar == '"') ? 34 : ((paramChar == '#') ? 35 : ((paramChar == '$') ? 36 : ((paramChar == '%') ? 37 : ((paramChar == '&') ? 38 : ((paramChar == '\'') ? 39 : ((paramChar == '(') ? 40 : ((paramChar == ')') ? 41 : ((paramChar == '*') ? 42 : ((paramChar == '+') ? 43 : ((paramChar == ',') ? 44 : ((paramChar == '-') ? 45 : ((paramChar == '.') ? 46 : ((paramChar == '/') ? 47 : ((paramChar == '0') ? 48 : ((paramChar == '1') ? 49 : ((paramChar == '2') ? 50 : ((paramChar == '3') ? 51 : ((paramChar == '4') ? 52 : ((paramChar == '5') ? 53 : ((paramChar == '6') ? 54 : ((paramChar == '7') ? 55 : ((paramChar == '8') ? 56 : ((paramChar == '9') ? 57 : ((paramChar == ':') ? 58 : ((paramChar == ';') ? 59 : ((paramChar == '<') ? 60 : ((paramChar == '=') ? 61 : ((paramChar == '>') ? 62 : ((paramChar == '?') ? 63 : ((paramChar == '@') ? 64 : ((paramChar == 'A') ? 65 : ((paramChar == 'B') ? 66 : ((paramChar == 'C') ? 67 : ((paramChar == 'D') ? 68 : ((paramChar == 'E') ? 69 : ((paramChar == 'F') ? 70 : ((paramChar == 'G') ? 71 : ((paramChar == 'H') ? 72 : ((paramChar == 'I') ? 73 : ((paramChar == 'J') ? 74 : ((paramChar == 'K') ? 75 : ((paramChar == 'L') ? 76 : ((paramChar == 'M') ? 77 : ((paramChar == 'N') ? 78 : ((paramChar == 'O') ? 79 : ((paramChar == 'P') ? 80 : ((paramChar == 'Q') ? 81 : ((paramChar == 'R') ? 82 : ((paramChar == 'S') ? 83 : ((paramChar == 'T') ? 84 : ((paramChar == 'U') ? 85 : ((paramChar == 'V') ? 86 : ((paramChar == 'W') ? 87 : ((paramChar == 'X') ? 88 : ((paramChar == 'Y') ? 89 : ((paramChar == 'Z') ? 90 : ((paramChar == '[') ? 91 : ((paramChar == '\\') ? 92 : ((paramChar == ']') ? 93 : ((paramChar == '^') ? 94 : ((paramChar == '_') ? 95 : ((paramChar == '`') ? 96 : ((paramChar == 'a') ? 97 : ((paramChar == 'b') ? 98 : ((paramChar == 'c') ? 99 : ((paramChar == 'd') ? 100 : ((paramChar == 'e') ? 101 : ((paramChar == 'f') ? 102 : ((paramChar == 'g') ? 103 : ((paramChar == 'h') ? 104 : ((paramChar == 'i') ? 105 : ((paramChar == 'j') ? 106 : ((paramChar == 'k') ? 107 : ((paramChar == 'l') ? 108 : ((paramChar == 'm') ? 109 : ((paramChar == 'n') ? 110 : ((paramChar == 'o') ? 111 : ((paramChar == 'p') ? 112 : ((paramChar == 'q') ? 113 : ((paramChar == 'r') ? 114 : ((paramChar == 's') ? 115 : ((paramChar == 't') ? 116 : ((paramChar == 'u') ? 117 : ((paramChar == 'v') ? 118 : ((paramChar == 'w') ? 119 : ((paramChar == 'x') ? 120 : ((paramChar == 'y') ? 121 : ((paramChar == 'z') ? 122 : ((paramChar == '{') ? 123 : ((paramChar == '|') ? 124 : ((paramChar == '}') ? 125 : ((paramChar == '~') ? 126 : ((paramChar == '') ? 127 : ((paramChar == 'Ђ') ? 128 : ((paramChar == 'Ѓ') ? 129 : ((paramChar == '‚') ? 130 : ((paramChar == 'ѓ') ? 131 : ((paramChar == '„') ? 132 : ((paramChar == '…') ? 133 : ((paramChar == '†') ? 134 : ((paramChar == '‡') ? 135 : ((paramChar == '€') ? 136 : ((paramChar == '‰') ? 137 : ((paramChar == 'Љ') ? 138 : ((paramChar == '‹') ? 139 : ((paramChar == 'Њ') ? 140 : ((paramChar == 'Ќ') ? 141 : ((paramChar == 'Ћ') ? 142 : ((paramChar == 'Џ') ? 143 : ((paramChar == 'ђ') ? 144 : ((paramChar == '‘') ? 145 : ((paramChar == '’') ? 146 : ((paramChar == '“') ? 147 : ((paramChar == '”') ? 148 : ((paramChar == '•') ? 149 : ((paramChar == '–') ? 150 : ((paramChar == '—') ? 151 : ((paramChar == '?') ? 152 : ((paramChar == '™') ? 153 : ((paramChar == 'љ') ? 154 : ((paramChar == '›') ? 155 : ((paramChar == 'њ') ? 156 : ((paramChar == 'ќ') ? 157 : ((paramChar == 'ћ') ? 158 : ((paramChar == 'џ') ? 159 : ((paramChar == ' ') ? 160 : ((paramChar == 'Ў') ? 161 : ((paramChar == 'ў') ? 162 : ((paramChar == 'Ј') ? 163 : ((paramChar == '¤') ? 164 : ((paramChar == 'Ґ') ? 165 : ((paramChar == '¦') ? 166 : ((paramChar == '§') ? 167 : ((paramChar == 'Ё') ? 168 : ((paramChar == '©') ? 169 : ((paramChar == 'Є') ? 170 : ((paramChar == '«') ? 171 : ((paramChar == '¬') ? 172 : ((paramChar == '­') ? 173 : ((paramChar == '®') ? 174 : ((paramChar == 'Ї') ? 175 : ((paramChar == '°') ? 176 : ((paramChar == '±') ? 177 : ((paramChar == 'І') ? 178 : ((paramChar == 'і') ? 179 : ((paramChar == 'ґ') ? 180 : ((paramChar == 'µ') ? 181 : ((paramChar == '¶') ? 182 : ((paramChar == '•') ? 183 : ((paramChar == 'ё') ? 184 : ((paramChar == '№') ? 185 : ((paramChar == 'є') ? 186 : ((paramChar == '»') ? 187 : ((paramChar == 'ј') ? 188 : ((paramChar == 'Ѕ') ? 189 : ((paramChar == 'ѕ') ? 190 : ((paramChar == 'ї') ? 191 : ((paramChar == 'А') ? 192 : ((paramChar == 'Б') ? 193 : ((paramChar == 'В') ? 194 : ((paramChar == 'Г') ? 195 : ((paramChar == 'Д') ? 196 : ((paramChar == 'Е') ? 197 : ((paramChar == 'Ж') ? 198 : ((paramChar == 'З') ? 199 : ((paramChar == 'И') ? 200 : ((paramChar == 'Й') ? 201 : ((paramChar == 'К') ? 202 : ((paramChar == 'Л') ? 203 : ((paramChar == 'М') ? 204 : ((paramChar == 'Н') ? 205 : ((paramChar == 'О') ? 206 : ((paramChar == 'П') ? 207 : ((paramChar == 'Р') ? 208 : ((paramChar == 'С') ? 209 : ((paramChar == 'Т') ? 210 : ((paramChar == 'У') ? 211 : ((paramChar == 'Ф') ? 212 : ((paramChar == 'Х') ? 213 : ((paramChar == 'Ц') ? 214 : ((paramChar == 'Ч') ? 215 : ((paramChar == 'Ш') ? 216 : ((paramChar == 'Щ') ? 217 : ((paramChar == 'Ъ') ? 218 : ((paramChar == 'Ы') ? 219 : ((paramChar == 'Ь') ? 220 : ((paramChar == 'Э') ? 221 : ((paramChar == 'Ю') ? 222 : ((paramChar == 'Я') ? 223 : ((paramChar == 'а') ? 224 : ((paramChar == 'б') ? 225 : ((paramChar == 'в') ? 226 : ((paramChar == 'г') ? 227 : ((paramChar == 'д') ? 228 : ((paramChar == 'е') ? 229 : ((paramChar == 'ж') ? 230 : ((paramChar == 'з') ? 231 : ((paramChar == 'и') ? 232 : ((paramChar == 'й') ? 233 : ((paramChar == 'к') ? 234 : ((paramChar == 'л') ? 235 : ((paramChar == 'м') ? 236 : ((paramChar == 'н') ? 237 : ((paramChar == 'о') ? 238 : ((paramChar == 'п') ? 239 : ((paramChar == 'р') ? 240 : ((paramChar == 'с') ? 241 : ((paramChar == 'т') ? 242 : ((paramChar == 'у') ? 243 : ((paramChar == 'ф') ? 244 : ((paramChar == 'х') ? 245 : ((paramChar == 'ц') ? 246 : ((paramChar == 'ч') ? 247 : ((paramChar == 'ш') ? 248 : ((paramChar == 'щ') ? 249 : ((paramChar == 'ъ') ? 250 : ((paramChar == 'ы') ? 251 : ((paramChar == 'ь') ? 252 : ((paramChar == 'э') ? 253 : ((paramChar == 'ю') ? 254 : ((paramChar == 'я') ? 255 : (short)paramChar)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.aL = paramInt5;
    if (this.aL == 0) {
      this.at = paramInt1;
      this.av = paramInt3;
      this.au = paramInt2;
      this.aw = paramInt4;
    } else {
      this.at = paramInt1;
      this.au = paramInt2;
      this.av = paramInt4 - paramInt2 + paramInt1;
      this.aw = paramInt3 - paramInt1 + paramInt2;
    } 
    this.k = this.av - this.at;
    this.l = this.aw - this.au;
    this.g = Image.createImage(this.k, this.l);
    this.h = Image.createImage(this.k, 1);
    this.i = this.g.getGraphics();
    this.j = this.h.getGraphics();
  }
  
  public final int a(int paramInt) {
    return ((b(paramInt + 0) * 256 + b(paramInt + 1)) * 256 + b(paramInt + 2)) * 256 + b(paramInt + 3);
  }
  
  public PlgFRBook(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, PlgFRStyles paramPlgFRStyles) {
    this.E = d("com.siemens.mp.io.file.FileSystemRegistry");
    this.T = paramPlgFRStyles;
    a(paramInt1, paramInt2, paramInt3, paramInt4, 0);
    c(paramString);
  }
  
  public final void c(String paramString) {
    int k;
    e();
    String str1 = a(paramString + "/");
    String str2 = "";
    if (paramString.length() >= str1.length())
      str2 = paramString.substring(str1.length()); 
    String str3 = "-1";
    String str4 = "0";
    str4 = str2.substring(i + 1);
    str2 = str2.substring(0, i);
    int i;
    if ((i = str2.indexOf("#")) >= 0 && (i = str4.indexOf(":")) >= 0) {
      str4 = (str3 = str4).substring(i + 1);
      if (i == 0) {
        str3 = "-1";
      } else {
        str3 = str3.substring(0, i);
      } 
    } 
    int j = Integer.parseInt(str3);
    if (str4.equals("")) {
      k = -1;
    } else {
      k = Integer.parseInt(str4);
    } 
    this.aB = -1;
    if ((str1 + str2).equals("") || (str1 + str2).equals(this.x)) {
      if (this.a && j >= 0) {
        this.aB = j;
        n();
        this.t += this.n;
        this.u += this.n;
        this.n = this.ay[this.aB];
        this.t -= this.n;
        this.u -= this.n;
        this.v = this.az[this.aB];
      } 
      this.Z = 0;
      if (k >= 0) {
        this.Z = k;
      } else {
        this.aJ = true;
      } 
      this.ab = false;
      this.aI = true;
      return;
    } 
    this.x = str1 + str2;
    c();
    if (j >= 0)
      this.aB = j; 
    if (k <= 0) {
      this.Z = 0;
    } else {
      this.Z = k;
    } 
    this.ab = false;
    if (k <= 0) {
      this.aJ = true;
    } else {
      this.aI = true;
    } 
    this.aK = true;
  }
  
  public final void b() {
    this.A = 0;
    this.Z = 0;
    this.ab = true;
    this.aa = 0;
    this.ac = 0;
    this.ad = 0;
    this.ae = 0;
    this.an = false;
    n();
  }
  
  public final void c() {
    b();
    this.r = null;
    this.p = 0;
    this.s = null;
    this.q = 0;
    this.m = 16384;
    this.n = 0;
    this.o = 0;
    this.t = 268435455;
    this.u = 268435455;
    this.v = 268435455;
    this.w = null;
    this.y = null;
    this.z = 0;
    a(this.aa, false);
    this.L = "no";
    this.M = null;
    this.N = "no";
    this.O = null;
    for (short s = 0; s < 256; s = (short)(s + 1)) {
      String str = "" + a(s);
      this.C[s] = (s == 10) ? 20 : ((s == 13) ? 23 : ((s == 32) ? 5 : (("ёуеыаоэяиюЁУЕЫАОЭЯИЮeyuioaEYUIOA".indexOf(str) >= 0) ? 1 : (("ўЎйцукенгшщзхфывапролджэячсмитбюЙЦУКЕНГШЩЗХФЫВАПРОЛДЖЭЯЧСМИТБЮqwertyuiopasdfghjklzxcvbnm'`QWERTYUIOPASDFGHJKLZXCVBNM".indexOf(str) >= 0) ? 2 : (("ЬьЪъ~1234567890$#№@\"'-([{*<>=_ch_Ch_sch_Sch_Ja_ja_Ya_ya_zh_Zh_ss_Ss_Jo_jo_Yu_yu_Ju_ju".indexOf(str) >= 0) ? 3 : ((")]},;!:.?/\\|$".indexOf(str) >= 0) ? 4 : 19))))));
    } 
  }
  
  public final void d() {
    if (this.x == null)
      return; 
    try {
      String str;
      RecordStore recordStore;
      byte[] arrayOfByte = (recordStore = RecordStore.openRecordStore(str = "" + this.x.hashCode() + this.aB, true)).getRecord(1);
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
      n();
      int i = dataInputStream.readInt();
      for (byte b = 0; b < i; b++) {
        int[] arrayOfInt;
        (arrayOfInt = new int[6])[0] = dataInputStream.readInt();
        arrayOfInt[1] = dataInputStream.readInt();
        arrayOfInt[2] = dataInputStream.readInt();
        arrayOfInt[3] = dataInputStream.readInt();
        arrayOfInt[4] = dataInputStream.readInt();
        arrayOfInt[5] = dataInputStream.readInt();
        this.F.addElement(arrayOfInt);
      } 
      if (this.F.size() > 0) {
        int[] arrayOfInt = this.F.lastElement();
        this.Z = arrayOfInt[0];
        this.ab = ((arrayOfInt[1] & 0x1) != 0);
        this.an = ((arrayOfInt[1] & 0x2) != 0);
        this.aa = arrayOfInt[2];
        this.ac = arrayOfInt[3];
        if (arrayOfInt.length > 4)
          this.ad = arrayOfInt[4]; 
        if (arrayOfInt.length > 5)
          this.ae = arrayOfInt[5]; 
        this.F.removeElement(this.F.lastElement());
      } 
      recordStore.closeRecordStore();
      return;
    } catch (RecordStoreException recordStoreException2) {
      RecordStoreException recordStoreException1;
      (recordStoreException1 = null).printStackTrace();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public final void e() {
    if (this.x == null || this.x.equals(""))
      return; 
    try {
      String str;
      RecordStore recordStore = RecordStore.openRecordStore(str = "" + this.x.hashCode() + this.aB, true);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream;
      (dataOutputStream = new DataOutputStream(byteArrayOutputStream)).writeInt(this.F.size());
      for (byte b = 0; b < this.F.size(); b++) {
        int[] arrayOfInt = this.F.elementAt(b);
        for (byte b1 = 0; b1 < arrayOfInt.length; b1++)
          dataOutputStream.writeInt(arrayOfInt[b1]); 
      } 
      dataOutputStream.flush();
      byte[] arrayOfByte = byteArrayOutputStream.toByteArray();
      if (recordStore.getNumRecords() > 0) {
        recordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
      } else {
        recordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
      } 
      recordStore.closeRecordStore();
      return;
    } catch (RecordStoreException recordStoreException2) {
      RecordStoreException recordStoreException1;
      (recordStoreException1 = null).printStackTrace();
      return;
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
      return;
    } 
  }
  
  public static final boolean d(String paramString) {
    try {
      Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      return false;
    } 
    return true;
  }
  
  public static String[] a(String paramString, boolean paramBoolean) throws Exception {
    String[] arrayOfString = null;
    try {
      if (paramString.equals("/")) {
        Vector vector = new Vector();
        Enumeration enumeration = FileSystemRegistry.listRoots();
        while (enumeration.hasMoreElements())
          vector.addElement(enumeration.nextElement()); 
        arrayOfString = new String[vector.size()];
        vector.copyInto((Object[])arrayOfString);
      } else {
        PlgFRBookReader2.e();
        FileConnection fileConnection = (FileConnection)Connector.open(paramString);
        PlgFRBookReader2.e();
        Enumeration enumeration = fileConnection.list();
        PlgFRBookReader2.e();
        fileConnection.close();
        PlgFRBookReader2.e();
        Vector vector;
        (vector = new Vector()).addElement("../");
        while (enumeration.hasMoreElements()) {
          String str = enumeration.nextElement();
          if ((paramBoolean & (!str.endsWith("/") ? 1 : 0)) != 0)
            continue; 
          vector.addElement(str);
        } 
        arrayOfString = new String[vector.size()];
        vector.copyInto((Object[])arrayOfString);
      } 
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
      throw new Exception("Ошибка фс");
    } 
    return arrayOfString;
  }
  
  public final InputStream f() {
    this.aD = -1;
    ByteArrayInputStream byteArrayInputStream = null;
    if ((this.x.endsWith("/") && this.x.startsWith("file://")) || this.x.equals("/")) {
      String[] arrayOfString = null;
      try {
        String str;
        if ((str = this.x).endsWith("../"))
          str = a(str = a(str)); 
        arrayOfString = a(str, false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] arrayOfByte1 = { 7, 1, 2, 8 };
        dataOutputStream.write(arrayOfByte1);
        if (str.equals("file:///") || str.equals("file://localhost/"))
          str = "/"; 
        dataOutputStream.write(b(str));
        byte[] arrayOfByte2 = { 13, 13 };
        dataOutputStream.write(arrayOfByte2);
        byte[] arrayOfByte3 = { 7, 1, 10, 8, 7, 3 };
        byte[] arrayOfByte4 = { 
            0, 8, 7, 2, Byte.MIN_VALUE, 48, 48, 102, 115, 46, 
            112, 110, 103, 0, 0, 0, 0, 0, 0, 12, 
            0, 12, 8 };
        byte[] arrayOfByte5 = { 13, 7, 4, 8 };
        if (!str.startsWith("file://"))
          if (this.E) {
            str = "file://" + str;
          } else {
            str = "file://localhost" + str;
          }  
        for (byte b = 0; b < arrayOfString.length; b++) {
          dataOutputStream.write(arrayOfByte3);
          if (arrayOfString[b].equals("../")) {
            dataOutputStream.write(b(a(str)));
          } else {
            dataOutputStream.write(b(str + arrayOfString[b]));
          } 
          byte b1 = 2;
          if ((((arrayOfString[b].length() > 1) ? 1 : 0) & ((arrayOfString[b].charAt(arrayOfString[b].length() - 1) == '/') ? 1 : 0)) != 0)
            b1 = 0; 
          String str1;
          if (arrayOfString[b].length() > 4 && ((str1 = arrayOfString[b].substring(arrayOfString[b].length() - 4)).equals(".txt") || str1.equals(".fr1")))
            b1 = 1; 
          arrayOfByte4[15] = (byte)(12 * b1);
          dataOutputStream.write(arrayOfByte4);
          dataOutputStream.write(b(arrayOfString[b]));
          dataOutputStream.write(arrayOfByte5);
        } 
        dataOutputStream.flush();
        byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        if (this.ae == 0)
          this.ae = 1; 
        this.aD = byteArrayInputStream.available();
      } catch (Exception exception) {
        String str;
        byte[] arrayOfByte = b(str = "Dir not found(open): '" + this.x + "'\n");
        byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        this.aD = arrayOfByte.length;
      } 
    } else if (this.x.startsWith("file:")) {
      try {
        this.m = 131072;
        String str = this.x;
        if (this.E && str.startsWith("file://localhost/"))
          str = "file://" + this.x.substring(17); 
        PlgFRBookReader2.e();
        FileConnection fileConnection = (FileConnection)Connector.open(str);
        PlgFRBookReader2.e();
        InputStream inputStream = fileConnection.openInputStream();
        PlgFRBookReader2.e();
        this.aD = (int)fileConnection.fileSize();
        PlgFRBookReader2.e();
      } catch (IOException iOException) {
        String str;
        byte[] arrayOfByte = b(str = "File not found(open): '" + this.x + "'\n");
        byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        this.aD = arrayOfByte.length;
      } 
    } else if (this.x.startsWith("http:")) {
      try {
        PlgFRBookReader2.e();
        HttpConnection httpConnection = (HttpConnection)Connector.open(this.x);
        PlgFRBookReader2.e();
        this.m = 25600;
        PlgFRBookReader2.e();
        InputStream inputStream = httpConnection.openInputStream();
        PlgFRBookReader2.e();
        this.aD = inputStream.available();
        PlgFRBookReader2.e();
      } catch (IOException iOException) {
        String str;
        byte[] arrayOfByte = b(str = "URL not found(open): '" + this.x + "'\n");
        byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
        this.aD = arrayOfByte.length;
      } 
    } else {
      try {
        InputStream inputStream = getClass().getResourceAsStream(this.x);
        this.aD = inputStream.available();
      } catch (Exception exception) {
        byteArrayInputStream = null;
        this.aD = 0;
      } 
    } 
    if (byteArrayInputStream == null) {
      String str;
      byte[] arrayOfByte = b(str = "Stream not found(open): '" + this.x + "'\n");
      byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      this.aD = arrayOfByte.length;
    } 
    return byteArrayInputStream;
  }
  
  public final short b(int paramInt) {
    if (paramInt >= this.v) {
      int i = this.v + this.aC.length;
      short s;
      return (paramInt < i) ? (short)this.aC[paramInt - this.v] : (((s = (short)"* <EOF>***".charAt((paramInt - i) % 9)) == 42) ? 13 : s);
    } 
    if (paramInt >= this.t && paramInt < this.t + this.p)
      return (short)((short)this.r[paramInt - this.t] & 0xFF); 
    if (paramInt >= this.u && paramInt < this.u + this.q) {
      byte[] arrayOfByte = this.r;
      int i = this.t;
      int j = this.p;
      this.r = this.s;
      this.t = this.u;
      this.p = this.q;
      this.s = arrayOfByte;
      this.u = i;
      this.q = j;
      return (short)((short)this.r[paramInt - this.t] & 0xFF);
    } 
    if (paramInt < 0)
      return 0; 
    try {
      if (this.w == null || paramInt + this.n < this.o) {
        if (this.w == null) {
          this.w = f();
          this.w.mark(0);
          this.aE = this.aD;
        } else {
          try {
            this.w.reset();
            this.aD = this.aE;
          } catch (IOException iOException) {
            this.w = f();
          } 
        } 
        this.o = 0;
        if (this.v == 268435455)
          this.v = this.aD; 
        if (this.w == null)
          System.out.println("FileNotOpen"); 
        if (this.n != 0) {
          this.w.skip(this.n);
          this.o += this.n;
        } 
      } 
      if (this.w != null) {
        int i = this.o - this.n;
        int j;
        if ((j = paramInt - this.m / 2) < 0)
          j = 0; 
        if (j < i && paramInt >= i)
          j = i; 
        if (j > i) {
          this.w.skip((j - i));
          this.o += j - i;
        } 
        this.s = null;
        this.q = this.m;
        if (this.q + j > this.v)
          this.q = this.v - j; 
        this.s = new byte[this.q];
        this.u = this.o - this.n;
        int k = this.w.read(this.s, 0, this.q);
        this.q = k;
        this.o += k;
        return (short)(this.s[paramInt - this.u] & 0xFF);
      } 
    } catch (NumberFormatException numberFormatException2) {
      NumberFormatException numberFormatException1;
      (numberFormatException1 = null).printStackTrace();
    } catch (IOException iOException2) {
      IOException iOException1;
      (iOException1 = null).printStackTrace();
    } catch (NullPointerException nullPointerException2) {
      NullPointerException nullPointerException1;
      (nullPointerException1 = null).printStackTrace();
    } catch (Exception exception2) {
      Exception exception1;
      (exception1 = null).printStackTrace();
    } 
    return 64;
  }
  
  public final int g() {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield A : I
    //   5: putfield aF : I
    //   8: aload_0
    //   9: aload_0
    //   10: aload_0
    //   11: getfield A : I
    //   14: invokevirtual b : (I)S
    //   17: putfield G : S
    //   20: aload_0
    //   21: getfield G : S
    //   24: ifne -> 49
    //   27: aload_0
    //   28: aload_0
    //   29: aload_0
    //   30: dup
    //   31: getfield A : I
    //   34: iconst_1
    //   35: iadd
    //   36: dup_x1
    //   37: putfield A : I
    //   40: invokevirtual b : (I)S
    //   43: putfield G : S
    //   46: goto -> 20
    //   49: aload_0
    //   50: dup
    //   51: getfield A : I
    //   54: iconst_1
    //   55: iadd
    //   56: putfield A : I
    //   59: aload_0
    //   60: iconst_0
    //   61: putfield K : Z
    //   64: aload_0
    //   65: getfield G : S
    //   68: bipush #9
    //   70: if_icmpne -> 79
    //   73: aload_0
    //   74: bipush #32
    //   76: putfield G : S
    //   79: aload_0
    //   80: getfield G : S
    //   83: bipush #7
    //   85: if_icmpne -> 2111
    //   88: aload_0
    //   89: ldc ''
    //   91: putfield H : Ljava/lang/String;
    //   94: aload_0
    //   95: iconst_0
    //   96: putfield I : I
    //   99: aload_0
    //   100: aload_0
    //   101: getfield T : Lp/PlgFRStyles;
    //   104: getfield o : Ljavax/microedition/lcdui/Font;
    //   107: invokevirtual getHeight : ()I
    //   110: aload_0
    //   111: getfield al : Z
    //   114: ifeq -> 127
    //   117: aload_0
    //   118: getfield T : Lp/PlgFRStyles;
    //   121: getfield l : I
    //   124: goto -> 128
    //   127: iconst_0
    //   128: iadd
    //   129: putfield J : I
    //   132: aload_0
    //   133: aload_0
    //   134: aload_0
    //   135: getfield A : I
    //   138: invokevirtual b : (I)S
    //   141: putfield G : S
    //   144: aload_0
    //   145: dup
    //   146: getfield A : I
    //   149: iconst_1
    //   150: iadd
    //   151: putfield A : I
    //   154: aload_0
    //   155: getfield G : S
    //   158: bipush #8
    //   160: if_icmpeq -> 2124
    //   163: aload_0
    //   164: getfield G : S
    //   167: tableswitch default -> 2076, 1 -> 196, 2 -> 358, 3 -> 227, 4 -> 344
    //   196: aload_0
    //   197: aload_0
    //   198: aload_0
    //   199: getfield A : I
    //   202: invokevirtual b : (I)S
    //   205: putfield U : I
    //   208: aload_0
    //   209: dup
    //   210: getfield A : I
    //   213: iconst_1
    //   214: iadd
    //   215: putfield A : I
    //   218: aload_0
    //   219: bipush #21
    //   221: putfield D : B
    //   224: goto -> 2086
    //   227: aload_0
    //   228: aload_0
    //   229: dup
    //   230: getfield A : I
    //   233: dup_x1
    //   234: iconst_1
    //   235: iadd
    //   236: putfield A : I
    //   239: invokevirtual b : (I)S
    //   242: istore_1
    //   243: new java/lang/StringBuffer
    //   246: dup
    //   247: invokespecial <init> : ()V
    //   250: astore_2
    //   251: iload_1
    //   252: bipush #31
    //   254: if_icmple -> 285
    //   257: aload_2
    //   258: iload_1
    //   259: invokestatic a : (S)C
    //   262: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   265: pop
    //   266: aload_0
    //   267: aload_0
    //   268: dup
    //   269: getfield A : I
    //   272: dup_x1
    //   273: iconst_1
    //   274: iadd
    //   275: putfield A : I
    //   278: invokevirtual b : (I)S
    //   281: istore_1
    //   282: goto -> 251
    //   285: aload_0
    //   286: getfield B : Z
    //   289: ifeq -> 335
    //   292: aload_0
    //   293: dup
    //   294: getfield ap : I
    //   297: iconst_1
    //   298: iadd
    //   299: putfield ap : I
    //   302: aload_0
    //   303: iconst_1
    //   304: putfield am : Z
    //   307: aload_0
    //   308: getfield ap : I
    //   311: aload_0
    //   312: getfield ae : I
    //   315: if_icmpne -> 326
    //   318: aload_0
    //   319: aload_0
    //   320: getfield aF : I
    //   323: putfield aq : I
    //   326: aload_0
    //   327: bipush #22
    //   329: putfield D : B
    //   332: goto -> 2086
    //   335: aload_0
    //   336: bipush #20
    //   338: putfield D : B
    //   341: goto -> 2086
    //   344: aload_0
    //   345: iconst_0
    //   346: putfield am : Z
    //   349: aload_0
    //   350: bipush #22
    //   352: putfield D : B
    //   355: goto -> 2086
    //   358: aload_0
    //   359: aload_0
    //   360: getfield A : I
    //   363: invokevirtual b : (I)S
    //   366: dup
    //   367: istore_1
    //   368: sipush #128
    //   371: if_icmplt -> 378
    //   374: iconst_1
    //   375: goto -> 379
    //   378: iconst_0
    //   379: istore_2
    //   380: iload_1
    //   381: bipush #127
    //   383: iand
    //   384: i2s
    //   385: istore_1
    //   386: aload_0
    //   387: dup
    //   388: getfield A : I
    //   391: iconst_1
    //   392: iadd
    //   393: putfield A : I
    //   396: aload_0
    //   397: getfield L : Ljava/lang/String;
    //   400: astore_3
    //   401: iconst_m1
    //   402: istore #4
    //   404: iload_1
    //   405: ifne -> 484
    //   408: aload_0
    //   409: aload_0
    //   410: dup
    //   411: getfield A : I
    //   414: dup_x1
    //   415: iconst_1
    //   416: iadd
    //   417: putfield A : I
    //   420: invokevirtual b : (I)S
    //   423: istore #5
    //   425: new java/lang/StringBuffer
    //   428: dup
    //   429: invokespecial <init> : ()V
    //   432: astore #6
    //   434: iload #5
    //   436: bipush #31
    //   438: if_icmple -> 472
    //   441: aload #6
    //   443: iload #5
    //   445: invokestatic a : (S)C
    //   448: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   451: pop
    //   452: aload_0
    //   453: aload_0
    //   454: dup
    //   455: getfield A : I
    //   458: dup_x1
    //   459: iconst_1
    //   460: iadd
    //   461: putfield A : I
    //   464: invokevirtual b : (I)S
    //   467: istore #5
    //   469: goto -> 434
    //   472: aload_0
    //   473: aload #6
    //   475: invokevirtual toString : ()Ljava/lang/String;
    //   478: putfield L : Ljava/lang/String;
    //   481: goto -> 647
    //   484: aload_0
    //   485: getfield a : Z
    //   488: ifeq -> 529
    //   491: ldc_w '0123456789abcdefghijklmnopqrstuvwzyz_'
    //   494: dup
    //   495: astore #5
    //   497: aload_0
    //   498: aload_0
    //   499: getfield A : I
    //   502: invokevirtual b : (I)S
    //   505: invokevirtual indexOf : (I)I
    //   508: bipush #36
    //   510: imul
    //   511: aload #5
    //   513: aload_0
    //   514: aload_0
    //   515: getfield A : I
    //   518: iconst_1
    //   519: iadd
    //   520: invokevirtual b : (I)S
    //   523: invokevirtual indexOf : (I)I
    //   526: iadd
    //   527: istore #4
    //   529: aload_0
    //   530: new java/lang/StringBuffer
    //   533: dup
    //   534: invokespecial <init> : ()V
    //   537: aload_0
    //   538: aload_0
    //   539: getfield A : I
    //   542: invokevirtual b : (I)S
    //   545: invokestatic a : (S)C
    //   548: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   551: aload_0
    //   552: aload_0
    //   553: getfield A : I
    //   556: iconst_1
    //   557: iadd
    //   558: invokevirtual b : (I)S
    //   561: invokestatic a : (S)C
    //   564: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   567: invokevirtual toString : ()Ljava/lang/String;
    //   570: putfield L : Ljava/lang/String;
    //   573: aload_0
    //   574: dup
    //   575: getfield A : I
    //   578: iconst_2
    //   579: iadd
    //   580: putfield A : I
    //   583: iload_1
    //   584: iconst_1
    //   585: if_icmpne -> 615
    //   588: new java/lang/StringBuffer
    //   591: dup
    //   592: invokespecial <init> : ()V
    //   595: aload_0
    //   596: dup_x1
    //   597: getfield L : Ljava/lang/String;
    //   600: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   603: ldc_w '.png'
    //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   609: invokevirtual toString : ()Ljava/lang/String;
    //   612: putfield L : Ljava/lang/String;
    //   615: iload_1
    //   616: iconst_2
    //   617: if_icmpne -> 647
    //   620: new java/lang/StringBuffer
    //   623: dup
    //   624: invokespecial <init> : ()V
    //   627: aload_0
    //   628: dup_x1
    //   629: getfield L : Ljava/lang/String;
    //   632: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   635: ldc_w '.jpg'
    //   638: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   641: invokevirtual toString : ()Ljava/lang/String;
    //   644: putfield L : Ljava/lang/String;
    //   647: aload_0
    //   648: bipush #18
    //   650: putfield D : B
    //   653: iconst_0
    //   654: istore #5
    //   656: iconst_0
    //   657: istore #6
    //   659: iconst_0
    //   660: istore #7
    //   662: iconst_0
    //   663: istore #8
    //   665: iload_2
    //   666: ifeq -> 825
    //   669: aload_0
    //   670: aload_0
    //   671: dup
    //   672: getfield A : I
    //   675: dup_x1
    //   676: iconst_1
    //   677: iadd
    //   678: putfield A : I
    //   681: invokevirtual b : (I)S
    //   684: bipush #8
    //   686: ishl
    //   687: dup
    //   688: istore #5
    //   690: aload_0
    //   691: aload_0
    //   692: dup
    //   693: getfield A : I
    //   696: dup_x1
    //   697: iconst_1
    //   698: iadd
    //   699: putfield A : I
    //   702: invokevirtual b : (I)S
    //   705: iadd
    //   706: istore #5
    //   708: aload_0
    //   709: aload_0
    //   710: dup
    //   711: getfield A : I
    //   714: dup_x1
    //   715: iconst_1
    //   716: iadd
    //   717: putfield A : I
    //   720: invokevirtual b : (I)S
    //   723: bipush #8
    //   725: ishl
    //   726: dup
    //   727: istore #6
    //   729: aload_0
    //   730: aload_0
    //   731: dup
    //   732: getfield A : I
    //   735: dup_x1
    //   736: iconst_1
    //   737: iadd
    //   738: putfield A : I
    //   741: invokevirtual b : (I)S
    //   744: iadd
    //   745: istore #6
    //   747: aload_0
    //   748: aload_0
    //   749: dup
    //   750: getfield A : I
    //   753: dup_x1
    //   754: iconst_1
    //   755: iadd
    //   756: putfield A : I
    //   759: invokevirtual b : (I)S
    //   762: bipush #8
    //   764: ishl
    //   765: dup
    //   766: istore #8
    //   768: aload_0
    //   769: aload_0
    //   770: dup
    //   771: getfield A : I
    //   774: dup_x1
    //   775: iconst_1
    //   776: iadd
    //   777: putfield A : I
    //   780: invokevirtual b : (I)S
    //   783: iadd
    //   784: istore #8
    //   786: aload_0
    //   787: aload_0
    //   788: dup
    //   789: getfield A : I
    //   792: dup_x1
    //   793: iconst_1
    //   794: iadd
    //   795: putfield A : I
    //   798: invokevirtual b : (I)S
    //   801: bipush #8
    //   803: ishl
    //   804: dup
    //   805: istore #7
    //   807: aload_0
    //   808: aload_0
    //   809: dup
    //   810: getfield A : I
    //   813: dup_x1
    //   814: iconst_1
    //   815: iadd
    //   816: putfield A : I
    //   819: invokevirtual b : (I)S
    //   822: iadd
    //   823: istore #7
    //   825: aload_0
    //   826: getfield L : Ljava/lang/String;
    //   829: aload_3
    //   830: invokevirtual equals : (Ljava/lang/Object;)Z
    //   833: ifne -> 1269
    //   836: aload_0
    //   837: getfield L : Ljava/lang/String;
    //   840: aload_0
    //   841: getfield N : Ljava/lang/String;
    //   844: invokevirtual equals : (Ljava/lang/Object;)Z
    //   847: ifeq -> 878
    //   850: aload_0
    //   851: getfield M : Ljavax/microedition/lcdui/Image;
    //   854: astore #9
    //   856: aload_0
    //   857: aload_0
    //   858: getfield O : Ljavax/microedition/lcdui/Image;
    //   861: putfield M : Ljavax/microedition/lcdui/Image;
    //   864: aload_0
    //   865: aload #9
    //   867: putfield O : Ljavax/microedition/lcdui/Image;
    //   870: aload_0
    //   871: aload_3
    //   872: putfield N : Ljava/lang/String;
    //   875: goto -> 1269
    //   878: aload_0
    //   879: aload_3
    //   880: putfield N : Ljava/lang/String;
    //   883: aload_0
    //   884: aload_0
    //   885: getfield M : Ljavax/microedition/lcdui/Image;
    //   888: putfield O : Ljavax/microedition/lcdui/Image;
    //   891: aload_0
    //   892: getfield a : Z
    //   895: ifeq -> 1234
    //   898: iload #4
    //   900: iconst_m1
    //   901: if_icmpeq -> 1234
    //   904: iload #4
    //   906: aload_0
    //   907: getfield ay : [I
    //   910: arraylength
    //   911: if_icmpge -> 1234
    //   914: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   917: ldc_w 'ConteinerImage!'
    //   920: invokevirtual println : (Ljava/lang/String;)V
    //   923: aload_0
    //   924: getfield y : Ljava/io/InputStream;
    //   927: ifnull -> 951
    //   930: aload_0
    //   931: getfield y : Ljava/io/InputStream;
    //   934: ifnull -> 1024
    //   937: aload_0
    //   938: getfield z : I
    //   941: aload_0
    //   942: getfield ay : [I
    //   945: iload #4
    //   947: iaload
    //   948: if_icmple -> 1024
    //   951: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   954: ldc_w 'ConteinerImage:ois{'
    //   957: invokevirtual println : (Ljava/lang/String;)V
    //   960: aload_0
    //   961: getfield y : Ljava/io/InputStream;
    //   964: ifnonnull -> 991
    //   967: aload_0
    //   968: aload_0
    //   969: invokevirtual f : ()Ljava/io/InputStream;
    //   972: putfield y : Ljava/io/InputStream;
    //   975: aload_0
    //   976: iconst_0
    //   977: putfield z : I
    //   980: aload_0
    //   981: getfield y : Ljava/io/InputStream;
    //   984: iconst_0
    //   985: invokevirtual mark : (I)V
    //   988: goto -> 1015
    //   991: aload_0
    //   992: getfield y : Ljava/io/InputStream;
    //   995: invokevirtual reset : ()V
    //   998: goto -> 1015
    //   1001: pop
    //   1002: aload_0
    //   1003: aload_0
    //   1004: invokevirtual f : ()Ljava/io/InputStream;
    //   1007: putfield y : Ljava/io/InputStream;
    //   1010: aload_0
    //   1011: iconst_0
    //   1012: putfield z : I
    //   1015: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1018: ldc_w 'ConteinerImage:ois}'
    //   1021: invokevirtual println : (Ljava/lang/String;)V
    //   1024: aload_0
    //   1025: getfield z : I
    //   1028: aload_0
    //   1029: getfield ay : [I
    //   1032: iload #4
    //   1034: iaload
    //   1035: if_icmpge -> 1070
    //   1038: aload_0
    //   1039: getfield y : Ljava/io/InputStream;
    //   1042: aload_0
    //   1043: getfield ay : [I
    //   1046: iload #4
    //   1048: iaload
    //   1049: aload_0
    //   1050: getfield z : I
    //   1053: isub
    //   1054: i2l
    //   1055: invokevirtual skip : (J)J
    //   1058: pop2
    //   1059: aload_0
    //   1060: aload_0
    //   1061: getfield ay : [I
    //   1064: iload #4
    //   1066: iaload
    //   1067: putfield z : I
    //   1070: aload_0
    //   1071: getfield az : [I
    //   1074: iload #4
    //   1076: iaload
    //   1077: newarray byte
    //   1079: astore #9
    //   1081: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1084: new java/lang/StringBuffer
    //   1087: dup
    //   1088: invokespecial <init> : ()V
    //   1091: ldc_w 'ConteinerImage:ofs='
    //   1094: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1097: aload_0
    //   1098: getfield z : I
    //   1101: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1104: ldc ' '
    //   1106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1109: invokevirtual toString : ()Ljava/lang/String;
    //   1112: invokevirtual println : (Ljava/lang/String;)V
    //   1115: aload_0
    //   1116: dup
    //   1117: getfield z : I
    //   1120: aload_0
    //   1121: getfield y : Ljava/io/InputStream;
    //   1124: aload #9
    //   1126: invokevirtual read : ([B)I
    //   1129: iadd
    //   1130: putfield z : I
    //   1133: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1136: new java/lang/StringBuffer
    //   1139: dup
    //   1140: invokespecial <init> : ()V
    //   1143: ldc_w 'ConteinerImage:newofs='
    //   1146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1149: aload_0
    //   1150: getfield z : I
    //   1153: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1156: ldc_w '('
    //   1159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1162: aload_0
    //   1163: getfield az : [I
    //   1166: iload #4
    //   1168: iaload
    //   1169: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1172: ldc_w ')'
    //   1175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1178: ldc '  -size-'
    //   1180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1183: aload_0
    //   1184: getfield z : I
    //   1187: aload_0
    //   1188: getfield az : [I
    //   1191: iload #4
    //   1193: iaload
    //   1194: isub
    //   1195: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1198: invokevirtual toString : ()Ljava/lang/String;
    //   1201: invokevirtual println : (Ljava/lang/String;)V
    //   1204: aload_0
    //   1205: aconst_null
    //   1206: putfield M : Ljavax/microedition/lcdui/Image;
    //   1209: aload_0
    //   1210: aload #9
    //   1212: iconst_0
    //   1213: aload #9
    //   1215: arraylength
    //   1216: invokestatic createImage : ([BII)Ljavax/microedition/lcdui/Image;
    //   1219: putfield M : Ljavax/microedition/lcdui/Image;
    //   1222: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1225: ldc_w 'ConteinerImage:ofs=created'
    //   1228: invokevirtual println : (Ljava/lang/String;)V
    //   1231: goto -> 1269
    //   1234: aload_0
    //   1235: aconst_null
    //   1236: putfield M : Ljavax/microedition/lcdui/Image;
    //   1239: aload_0
    //   1240: new java/lang/StringBuffer
    //   1243: dup
    //   1244: invokespecial <init> : ()V
    //   1247: ldc_w '/'
    //   1250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1253: aload_0
    //   1254: getfield L : Ljava/lang/String;
    //   1257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1260: invokevirtual toString : ()Ljava/lang/String;
    //   1263: invokestatic createImage : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   1266: putfield M : Ljavax/microedition/lcdui/Image;
    //   1269: iload_2
    //   1270: ifeq -> 1436
    //   1273: new java/lang/StringBuffer
    //   1276: dup
    //   1277: invokespecial <init> : ()V
    //   1280: aload_0
    //   1281: getfield L : Ljava/lang/String;
    //   1284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1287: ldc_w ','
    //   1290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1293: iload #5
    //   1295: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1298: ldc_w ','
    //   1301: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1304: iload #6
    //   1306: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1309: ldc_w ','
    //   1312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1315: iload #8
    //   1317: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1320: ldc_w ','
    //   1323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1326: iload #7
    //   1328: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   1331: invokevirtual toString : ()Ljava/lang/String;
    //   1334: dup
    //   1335: astore #9
    //   1337: aload_0
    //   1338: getfield N : Ljava/lang/String;
    //   1341: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1344: ifne -> 1396
    //   1347: iload #8
    //   1349: iload #7
    //   1351: imul
    //   1352: newarray int
    //   1354: astore #10
    //   1356: aload_0
    //   1357: getfield M : Ljavax/microedition/lcdui/Image;
    //   1360: aload #10
    //   1362: iconst_0
    //   1363: iload #8
    //   1365: iload #5
    //   1367: iload #6
    //   1369: iload #8
    //   1371: iload #7
    //   1373: invokevirtual getRGB : ([IIIIIII)V
    //   1376: aload_0
    //   1377: aload #10
    //   1379: iload #8
    //   1381: iload #7
    //   1383: iconst_0
    //   1384: invokestatic createRGBImage : ([IIIZ)Ljavax/microedition/lcdui/Image;
    //   1387: putfield O : Ljavax/microedition/lcdui/Image;
    //   1390: aload_0
    //   1391: aload #9
    //   1393: putfield N : Ljava/lang/String;
    //   1396: aload_0
    //   1397: getfield M : Ljavax/microedition/lcdui/Image;
    //   1400: astore #10
    //   1402: aload_0
    //   1403: getfield L : Ljava/lang/String;
    //   1406: astore #11
    //   1408: aload_0
    //   1409: aload_0
    //   1410: getfield O : Ljavax/microedition/lcdui/Image;
    //   1413: putfield M : Ljavax/microedition/lcdui/Image;
    //   1416: aload_0
    //   1417: aload #10
    //   1419: putfield O : Ljavax/microedition/lcdui/Image;
    //   1422: aload_0
    //   1423: aload_0
    //   1424: getfield N : Ljava/lang/String;
    //   1427: putfield L : Ljava/lang/String;
    //   1430: aload_0
    //   1431: aload #11
    //   1433: putfield N : Ljava/lang/String;
    //   1436: aload_0
    //   1437: getfield T : Lp/PlgFRStyles;
    //   1440: getfield o : Ljavax/microedition/lcdui/Font;
    //   1443: invokevirtual getHeight : ()I
    //   1446: iconst_2
    //   1447: imul
    //   1448: istore #9
    //   1450: aload_0
    //   1451: getfield M : Ljavax/microedition/lcdui/Image;
    //   1454: invokevirtual getWidth : ()I
    //   1457: aload_0
    //   1458: getfield k : I
    //   1461: if_icmpgt -> 1481
    //   1464: aload_0
    //   1465: getfield M : Ljavax/microedition/lcdui/Image;
    //   1468: invokevirtual getHeight : ()I
    //   1471: aload_0
    //   1472: getfield l : I
    //   1475: iload #9
    //   1477: isub
    //   1478: if_icmplt -> 1948
    //   1481: aload_0
    //   1482: getfield k : I
    //   1485: istore #10
    //   1487: aload_0
    //   1488: getfield M : Ljavax/microedition/lcdui/Image;
    //   1491: invokevirtual getWidth : ()I
    //   1494: istore #11
    //   1496: aload_0
    //   1497: getfield M : Ljavax/microedition/lcdui/Image;
    //   1500: invokevirtual getHeight : ()I
    //   1503: iload #10
    //   1505: imul
    //   1506: iload #11
    //   1508: idiv
    //   1509: dup
    //   1510: istore #12
    //   1512: aload_0
    //   1513: getfield l : I
    //   1516: iload #9
    //   1518: isub
    //   1519: if_icmplt -> 1557
    //   1522: iload #11
    //   1524: aload_0
    //   1525: getfield l : I
    //   1528: iload #9
    //   1530: isub
    //   1531: imul
    //   1532: aload_0
    //   1533: getfield M : Ljavax/microedition/lcdui/Image;
    //   1536: invokevirtual getHeight : ()I
    //   1539: idiv
    //   1540: istore #10
    //   1542: aload_0
    //   1543: getfield M : Ljavax/microedition/lcdui/Image;
    //   1546: invokevirtual getHeight : ()I
    //   1549: iload #10
    //   1551: imul
    //   1552: iload #11
    //   1554: idiv
    //   1555: istore #12
    //   1557: iload #10
    //   1559: iload #12
    //   1561: imul
    //   1562: newarray int
    //   1564: astore #13
    //   1566: aload_0
    //   1567: getfield M : Ljavax/microedition/lcdui/Image;
    //   1570: invokevirtual getWidth : ()I
    //   1573: newarray int
    //   1575: astore #14
    //   1577: iconst_0
    //   1578: istore #15
    //   1580: iconst_0
    //   1581: istore #16
    //   1583: iload #16
    //   1585: iload #12
    //   1587: if_icmpge -> 1934
    //   1590: iload #16
    //   1592: iload #11
    //   1594: imul
    //   1595: iload #10
    //   1597: idiv
    //   1598: dup
    //   1599: istore #17
    //   1601: aload_0
    //   1602: getfield M : Ljavax/microedition/lcdui/Image;
    //   1605: invokevirtual getHeight : ()I
    //   1608: if_icmpgt -> 1634
    //   1611: aload_0
    //   1612: getfield M : Ljavax/microedition/lcdui/Image;
    //   1615: aload #14
    //   1617: iconst_0
    //   1618: aload_0
    //   1619: getfield M : Ljavax/microedition/lcdui/Image;
    //   1622: invokevirtual getWidth : ()I
    //   1625: iconst_0
    //   1626: iload #17
    //   1628: iload #11
    //   1630: iconst_1
    //   1631: invokevirtual getRGB : ([IIIIIII)V
    //   1634: iconst_0
    //   1635: istore #18
    //   1637: iload #18
    //   1639: iload #10
    //   1641: if_icmpge -> 1928
    //   1644: iload #18
    //   1646: iload #11
    //   1648: imul
    //   1649: iload #10
    //   1651: idiv
    //   1652: dup
    //   1653: istore #17
    //   1655: iload #11
    //   1657: if_icmplt -> 1672
    //   1660: aload_0
    //   1661: getfield T : Lp/PlgFRStyles;
    //   1664: getfield p : I
    //   1667: istore #17
    //   1669: goto -> 1912
    //   1672: iload #17
    //   1674: istore #19
    //   1676: aload #14
    //   1678: iload #19
    //   1680: iaload
    //   1681: dup
    //   1682: istore #20
    //   1684: sipush #255
    //   1687: iand
    //   1688: istore #21
    //   1690: iload #20
    //   1692: bipush #8
    //   1694: ishr
    //   1695: sipush #255
    //   1698: iand
    //   1699: istore #22
    //   1701: iload #20
    //   1703: bipush #16
    //   1705: ishr
    //   1706: sipush #255
    //   1709: iand
    //   1710: istore #23
    //   1712: iload #21
    //   1714: iconst_1
    //   1715: ishl
    //   1716: istore #24
    //   1718: iload #22
    //   1720: iconst_1
    //   1721: ishl
    //   1722: istore #25
    //   1724: iload #23
    //   1726: iconst_1
    //   1727: ishl
    //   1728: istore #26
    //   1730: iload #19
    //   1732: iconst_1
    //   1733: iadd
    //   1734: iload #11
    //   1736: if_icmplt -> 1763
    //   1739: iload #24
    //   1741: iload #21
    //   1743: iadd
    //   1744: istore #24
    //   1746: iload #25
    //   1748: iload #22
    //   1750: iadd
    //   1751: istore #25
    //   1753: iload #26
    //   1755: iload #23
    //   1757: iadd
    //   1758: istore #26
    //   1760: goto -> 1811
    //   1763: aload #14
    //   1765: iload #19
    //   1767: iconst_1
    //   1768: iadd
    //   1769: iaload
    //   1770: istore #20
    //   1772: iload #24
    //   1774: iload #20
    //   1776: sipush #255
    //   1779: iand
    //   1780: iadd
    //   1781: istore #24
    //   1783: iload #25
    //   1785: iload #20
    //   1787: bipush #8
    //   1789: ishr
    //   1790: sipush #255
    //   1793: iand
    //   1794: iadd
    //   1795: istore #25
    //   1797: iload #26
    //   1799: iload #20
    //   1801: bipush #16
    //   1803: ishr
    //   1804: sipush #255
    //   1807: iand
    //   1808: iadd
    //   1809: istore #26
    //   1811: iload #19
    //   1813: iconst_1
    //   1814: isub
    //   1815: ifge -> 1842
    //   1818: iload #24
    //   1820: iload #21
    //   1822: iadd
    //   1823: istore #24
    //   1825: iload #25
    //   1827: iload #22
    //   1829: iadd
    //   1830: istore #25
    //   1832: iload #26
    //   1834: iload #23
    //   1836: iadd
    //   1837: istore #26
    //   1839: goto -> 1890
    //   1842: aload #14
    //   1844: iload #19
    //   1846: iconst_1
    //   1847: iadd
    //   1848: iaload
    //   1849: istore #20
    //   1851: iload #24
    //   1853: iload #20
    //   1855: sipush #255
    //   1858: iand
    //   1859: iadd
    //   1860: istore #24
    //   1862: iload #25
    //   1864: iload #20
    //   1866: bipush #8
    //   1868: ishr
    //   1869: sipush #255
    //   1872: iand
    //   1873: iadd
    //   1874: istore #25
    //   1876: iload #26
    //   1878: iload #20
    //   1880: bipush #16
    //   1882: ishr
    //   1883: sipush #255
    //   1886: iand
    //   1887: iadd
    //   1888: istore #26
    //   1890: iload #24
    //   1892: iconst_2
    //   1893: ishr
    //   1894: iload #25
    //   1896: iconst_2
    //   1897: ishr
    //   1898: bipush #8
    //   1900: ishl
    //   1901: iadd
    //   1902: iload #26
    //   1904: iconst_2
    //   1905: ishr
    //   1906: bipush #16
    //   1908: ishl
    //   1909: iadd
    //   1910: istore #17
    //   1912: aload #13
    //   1914: iload #15
    //   1916: iload #17
    //   1918: iastore
    //   1919: iinc #15, 1
    //   1922: iinc #18, 1
    //   1925: goto -> 1637
    //   1928: iinc #16, 1
    //   1931: goto -> 1583
    //   1934: aload_0
    //   1935: aload #13
    //   1937: iload #10
    //   1939: iload #12
    //   1941: iconst_0
    //   1942: invokestatic createRGBImage : ([IIIZ)Ljavax/microedition/lcdui/Image;
    //   1945: putfield M : Ljavax/microedition/lcdui/Image;
    //   1948: aload_0
    //   1949: iconst_1
    //   1950: putfield K : Z
    //   1953: aload_0
    //   1954: ldc ''
    //   1956: putfield H : Ljava/lang/String;
    //   1959: aload_0
    //   1960: aload_0
    //   1961: getfield M : Ljavax/microedition/lcdui/Image;
    //   1964: invokevirtual getWidth : ()I
    //   1967: putfield I : I
    //   1970: aload_0
    //   1971: aload_0
    //   1972: getfield M : Ljavax/microedition/lcdui/Image;
    //   1975: invokevirtual getHeight : ()I
    //   1978: aload_0
    //   1979: getfield al : Z
    //   1982: ifeq -> 1995
    //   1985: aload_0
    //   1986: getfield T : Lp/PlgFRStyles;
    //   1989: getfield l : I
    //   1992: goto -> 1996
    //   1995: iconst_0
    //   1996: iadd
    //   1997: putfield J : I
    //   2000: goto -> 2086
    //   2003: pop
    //   2004: aload_0
    //   2005: bipush #58
    //   2007: putfield G : S
    //   2010: aload_0
    //   2011: iconst_4
    //   2012: putfield D : B
    //   2015: aload_0
    //   2016: ldc_w '[image]'
    //   2019: putfield H : Ljava/lang/String;
    //   2022: aload_0
    //   2023: aload_0
    //   2024: getfield T : Lp/PlgFRStyles;
    //   2027: getfield o : Ljavax/microedition/lcdui/Font;
    //   2030: aload_0
    //   2031: getfield H : Ljava/lang/String;
    //   2034: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   2037: putfield I : I
    //   2040: aload_0
    //   2041: aload_0
    //   2042: getfield T : Lp/PlgFRStyles;
    //   2045: getfield o : Ljavax/microedition/lcdui/Font;
    //   2048: invokevirtual getHeight : ()I
    //   2051: aload_0
    //   2052: getfield al : Z
    //   2055: ifeq -> 2068
    //   2058: aload_0
    //   2059: getfield T : Lp/PlgFRStyles;
    //   2062: getfield l : I
    //   2065: goto -> 2069
    //   2068: iconst_0
    //   2069: iadd
    //   2070: putfield J : I
    //   2073: goto -> 2086
    //   2076: aload_0
    //   2077: dup
    //   2078: getfield A : I
    //   2081: iconst_1
    //   2082: iadd
    //   2083: putfield A : I
    //   2086: aload_0
    //   2087: aload_0
    //   2088: aload_0
    //   2089: getfield A : I
    //   2092: invokevirtual b : (I)S
    //   2095: putfield G : S
    //   2098: aload_0
    //   2099: dup
    //   2100: getfield A : I
    //   2103: iconst_1
    //   2104: iadd
    //   2105: putfield A : I
    //   2108: goto -> 154
    //   2111: aload_0
    //   2112: aload_0
    //   2113: getfield C : [B
    //   2116: aload_0
    //   2117: getfield G : S
    //   2120: baload
    //   2121: putfield D : B
    //   2124: aload_0
    //   2125: aload_0
    //   2126: getfield D : B
    //   2129: bipush #23
    //   2131: if_icmpne -> 2138
    //   2134: iconst_1
    //   2135: goto -> 2139
    //   2138: iconst_0
    //   2139: putfield ak : Z
    //   2142: aload_0
    //   2143: aload_0
    //   2144: getfield D : B
    //   2147: bipush #20
    //   2149: if_icmpge -> 2156
    //   2152: iconst_1
    //   2153: goto -> 2157
    //   2156: iconst_0
    //   2157: putfield Y : Z
    //   2160: aload_0
    //   2161: getfield Y : Z
    //   2164: ifeq -> 2259
    //   2167: aload_0
    //   2168: getfield D : B
    //   2171: bipush #18
    //   2173: if_icmpeq -> 2303
    //   2176: aload_0
    //   2177: new java/lang/StringBuffer
    //   2180: dup
    //   2181: invokespecial <init> : ()V
    //   2184: ldc ''
    //   2186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   2189: aload_0
    //   2190: getfield G : S
    //   2193: invokestatic a : (S)C
    //   2196: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   2199: invokevirtual toString : ()Ljava/lang/String;
    //   2202: putfield H : Ljava/lang/String;
    //   2205: aload_0
    //   2206: aload_0
    //   2207: getfield T : Lp/PlgFRStyles;
    //   2210: getfield o : Ljavax/microedition/lcdui/Font;
    //   2213: aload_0
    //   2214: getfield H : Ljava/lang/String;
    //   2217: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   2220: putfield I : I
    //   2223: aload_0
    //   2224: aload_0
    //   2225: getfield T : Lp/PlgFRStyles;
    //   2228: getfield o : Ljavax/microedition/lcdui/Font;
    //   2231: invokevirtual getHeight : ()I
    //   2234: aload_0
    //   2235: getfield al : Z
    //   2238: ifeq -> 2251
    //   2241: aload_0
    //   2242: getfield T : Lp/PlgFRStyles;
    //   2245: getfield l : I
    //   2248: goto -> 2252
    //   2251: iconst_0
    //   2252: iadd
    //   2253: putfield J : I
    //   2256: goto -> 2303
    //   2259: aload_0
    //   2260: ldc ''
    //   2262: putfield H : Ljava/lang/String;
    //   2265: aload_0
    //   2266: iconst_0
    //   2267: putfield I : I
    //   2270: aload_0
    //   2271: aload_0
    //   2272: getfield T : Lp/PlgFRStyles;
    //   2275: getfield o : Ljavax/microedition/lcdui/Font;
    //   2278: invokevirtual getHeight : ()I
    //   2281: aload_0
    //   2282: getfield al : Z
    //   2285: ifeq -> 2298
    //   2288: aload_0
    //   2289: getfield T : Lp/PlgFRStyles;
    //   2292: getfield l : I
    //   2295: goto -> 2299
    //   2298: iconst_0
    //   2299: iadd
    //   2300: putfield J : I
    //   2303: aload_0
    //   2304: iconst_0
    //   2305: putfield P : Z
    //   2308: aload_0
    //   2309: aload_0
    //   2310: getfield c : B
    //   2313: putfield b : B
    //   2316: aload_0
    //   2317: aload_0
    //   2318: getfield d : B
    //   2321: putfield c : B
    //   2324: aload_0
    //   2325: aload_0
    //   2326: getfield D : B
    //   2329: putfield d : B
    //   2332: aload_0
    //   2333: getfield b : B
    //   2336: iconst_1
    //   2337: if_icmpne -> 2425
    //   2340: aload_0
    //   2341: getfield c : B
    //   2344: iconst_2
    //   2345: if_icmpne -> 2425
    //   2348: aload_0
    //   2349: getfield d : B
    //   2352: iconst_2
    //   2353: if_icmpne -> 2425
    //   2356: aload_0
    //   2357: aload_0
    //   2358: getfield C : [B
    //   2361: aload_0
    //   2362: aload_0
    //   2363: getfield A : I
    //   2366: invokevirtual b : (I)S
    //   2369: baload
    //   2370: putfield e : B
    //   2373: aload_0
    //   2374: getfield e : B
    //   2377: iconst_1
    //   2378: if_icmpne -> 2386
    //   2381: aload_0
    //   2382: iconst_1
    //   2383: goto -> 2512
    //   2386: aload_0
    //   2387: getfield e : B
    //   2390: iconst_2
    //   2391: if_icmpne -> 2515
    //   2394: aload_0
    //   2395: aload_0
    //   2396: getfield C : [B
    //   2399: aload_0
    //   2400: aload_0
    //   2401: getfield A : I
    //   2404: iconst_1
    //   2405: iadd
    //   2406: invokevirtual b : (I)S
    //   2409: baload
    //   2410: iconst_2
    //   2411: if_icmpgt -> 2418
    //   2414: iconst_1
    //   2415: goto -> 2419
    //   2418: iconst_0
    //   2419: putfield P : Z
    //   2422: goto -> 2515
    //   2425: aload_0
    //   2426: getfield c : B
    //   2429: iconst_1
    //   2430: if_icmpne -> 2515
    //   2433: aload_0
    //   2434: getfield b : B
    //   2437: iconst_2
    //   2438: if_icmpne -> 2515
    //   2441: aload_0
    //   2442: aload_0
    //   2443: getfield C : [B
    //   2446: aload_0
    //   2447: aload_0
    //   2448: getfield A : I
    //   2451: invokevirtual b : (I)S
    //   2454: baload
    //   2455: putfield e : B
    //   2458: aload_0
    //   2459: aload_0
    //   2460: getfield d : B
    //   2463: iconst_1
    //   2464: if_icmpne -> 2475
    //   2467: aload_0
    //   2468: getfield e : B
    //   2471: iconst_2
    //   2472: if_icmpeq -> 2507
    //   2475: aload_0
    //   2476: getfield e : B
    //   2479: iconst_1
    //   2480: if_icmpne -> 2491
    //   2483: aload_0
    //   2484: getfield d : B
    //   2487: iconst_2
    //   2488: if_icmpeq -> 2507
    //   2491: aload_0
    //   2492: getfield d : B
    //   2495: iconst_1
    //   2496: if_icmpne -> 2511
    //   2499: aload_0
    //   2500: getfield e : B
    //   2503: iconst_1
    //   2504: if_icmpne -> 2511
    //   2507: iconst_1
    //   2508: goto -> 2512
    //   2511: iconst_0
    //   2512: putfield P : Z
    //   2515: aload_0
    //   2516: getfield A : I
    //   2519: ireturn
    // Exception table:
    //   from	to	target	type
    //   825	2000	2003	java/io/IOException
    //   991	998	1001	java/io/IOException
  }
  
  public static int c(int paramInt) {
    int i = paramInt & 0xFF;
    int j = paramInt >> 8 & 0xFF;
    int k = paramInt >> 16 & 0xFF;
    i = (i + 128 + 128) / 3;
    j = (j + 128 + 128) / 3;
    k = (k + 128 + 128) / 3;
    return i = (i += j << 8) + (k << 16);
  }
  
  public final synchronized void a(Canvas paramCanvas) {
    this.aH = paramCanvas;
    (new Thread(this)).start();
  }
  
  public final synchronized void h() {
    this.A = this.Z;
    if (this.A == 0)
      this.aa = 0; 
    this.al = this.ab;
    this.am = this.an;
    this.ap = this.an ? 1 : 0;
    a(this.aa, (this.am && this.ap == this.ae));
    l();
    this.ai = this.ac;
    this.ah = this.ab;
    this.af = this.Z;
    this.ag = this.aa;
    this.aj = this.ad;
    this.ao = this.an;
    this.aq = this.ad;
    this.B = true;
    this.ar = 0;
    this.as = 0;
    int i = -this.ac;
    this.X = 0;
    this.V = new StringBuffer();
    this.W = 0;
    int j = 0;
    this.i.setColor(this.T.p);
    this.i.fillRect(0, 0, this.k, this.l);
    while (i < this.l) {
      boolean bool1 = false;
      int k = 1;
      this.d = 19;
      boolean bool2 = true;
      int m = this.T.m;
      int n = this.A;
      this.R = -1;
      while (k < this.k) {
        g();
        if (m < this.T.m)
          m = this.T.m; 
        byte b = this.al ? this.T.n : 0;
        int i1 = k + this.W + b;
        boolean bool3 = false;
        boolean bool4 = false;
        boolean bool5 = false;
        if (this.Y) {
          if (i1 + this.I > this.k) {
            if (this.R > 0) {
              bool3 = false;
              bool4 = true;
              bool5 = true;
              this.V.delete(this.S, this.V.length());
              this.V.append('-');
              this.W = this.T.o.stringWidth(this.V.toString());
              this.A = this.R;
            } else if (bool2 && this.W == 0) {
              bool3 = true;
              bool4 = true;
              bool5 = true;
            } else {
              bool3 = false;
              bool5 = true;
              bool4 = bool2;
              if (bool2) {
                this.A = this.aF;
              } else {
                if (this.W == 0)
                  n = this.aF; 
                this.A = n;
                this.V = new StringBuffer();
                this.R = -1;
                this.W = 0;
              } 
            } 
          } else {
            bool3 = true;
            if (this.D == 4)
              bool4 = true; 
            if (this.D == 18)
              bool4 = true; 
            if (this.D == 5)
              if (bool2 && this.W == 0) {
                bool3 = false;
                bool4 = false;
                if (this.J > this.X)
                  this.X = this.J; 
              } else {
                bool4 = true;
              }  
          } 
        } else {
          bool4 = true;
          if (this.ak)
            bool5 = true; 
        } 
        if (bool3) {
          if (this.J > this.X)
            this.X = this.J; 
          if (this.W == 0)
            n = this.aF; 
          if (this.P && i1 + this.Q < this.k) {
            this.R = this.aF;
            this.S = this.V.length();
          } 
          this.V.append(this.H);
          this.W += this.I;
        } 
        if (bool4) {
          if (bool2 && this.al)
            k += this.T.n; 
          this.i.setColor(this.T.p);
          this.j.setColor(this.T.p);
          if (this.X > j) {
            if (i < 0 && i + this.X > 0) {
              this.A = this.Z;
              this.V = new StringBuffer();
              this.W = 0;
              this.al = this.ab;
              this.am = this.an;
              this.ap = this.an ? 1 : 0;
              a(this.aa, (this.am && this.ap == this.ae));
              this.aq = this.ad;
              bool1 = true;
              j = this.X;
              break;
            } 
            if (j != 0 && i >= 0 && j > 0 && k > 0 && i + j < this.l)
              this.i.copyArea(0, i, k, j, 0, i + this.X - j, 20); 
            if (k != 0)
              if (bool2) {
                this.i.fillRect(0, i, k, this.X);
                this.j.fillRect(0, 0, k, 1);
              } else {
                for (byte b1 = 0; b1 < this.X - j; b1++)
                  this.i.drawImage(this.h, 0, b1 + i, 20); 
              }  
            j = this.X;
          } else if (k != 0 && bool2) {
            this.i.fillRect(0, i, k + 1, this.X);
            this.j.fillRect(0, 0, k + 1, 1);
          } 
          this.i.fillRect(k, i, this.W + 1, j);
          this.j.fillRect(k, 0, this.W + 1, 1);
          this.i.setFont(this.T.o);
          this.i.setColor(this.T.q);
          this.i.drawString(this.V.toString(), k, i + j, 36);
          if (this.K)
            this.i.drawImage(this.M, k + this.W - this.I, i + j, 36); 
          k += this.W;
          if ((bool2 = (this.W == 0 && bool2) ? true : false) && this.al)
            k -= this.T.n; 
          this.W = 0;
          this.X = 0;
          this.V = new StringBuffer();
          this.R = -1;
        } 
        if (bool5) {
          if (j == 0)
            j = this.X; 
          this.i.setColor(this.T.p);
          if (this.ak) {
            for (byte b1 = 0; b1 < m; b1++)
              this.i.drawImage(this.h, 0, b1 + i + j, 20); 
            j += m;
          } 
          if (bool2) {
            this.i.fillRect(0, i, this.k, j + m);
          } else {
            this.i.fillRect(k, i, this.k - k + 1, j + m);
          } 
          this.i.setColor(c(this.T.q));
          k = this.k + 1;
          this.al = this.ak;
        } 
        if (this.D == 21)
          a(this.U, this.T.s); 
        if (this.D == 22) {
          a(this.U, (this.am && this.ap == this.ae));
          if (this.am && this.ap == this.ae) {
            this.ar = i;
            continue;
          } 
          if (this.ap == this.ae)
            this.as = i; 
        } 
      } 
      if (!bool1) {
        if (i >= 0 && i + j <= this.l && j != 0) {
          this.af = this.A;
          this.ag = this.T.r;
          this.ah = this.al;
          this.ao = this.am;
          this.aj = 1;
          if (this.A != this.Z)
            this.ai = 0; 
        } 
        i += j;
        this.B = (i + j <= this.l);
        j = 0;
      } 
    } 
    if (this.af == this.Z && this.ai == this.ac)
      this.ai += this.l; 
  }
  
  public final synchronized void a(Graphics paramGraphics) {
    System.out.println("print");
    if (this.aG) {
      this.aG = false;
      paramGraphics.drawImage(this.f, this.at, this.au, 20);
    } 
  }
  
  public final void a(int paramInt, boolean paramBoolean) {
    if (paramInt != this.T.r || paramBoolean != this.T.s) {
      this.T.a(paramInt, paramBoolean);
      this.Q = this.T.o.charWidth('-');
    } 
  }
  
  public final boolean i() {
    if (this.af < this.v) {
      this.Z = this.af;
      this.ab = this.ah;
      this.aa = this.ag;
      this.ac = this.ai;
      this.an = this.ao;
      this.ad = this.aj;
      this.ae = 0;
      return true;
    } 
    return false;
  }
  
  public final void j() {
    if (this.ap == 0) {
      int i = this.ae;
      if (i()) {
        this.ae = 1;
      } else {
        this.ae = i;
        return;
      } 
    } else if (this.ae >= this.ap) {
      int i = this.ae;
      if (i()) {
        this.ae = 1;
      } else {
        this.ae = i;
        return;
      } 
    } else {
      this.ae++;
    } 
  }
  
  public final void k() {
    if (this.ap == 0) {
      p();
      if (this.ae == 0) {
        this.ae = 1;
        return;
      } 
    } else {
      if (this.ae > 1 && this.ap > 0) {
        this.ae--;
        return;
      } 
      p();
      if (this.ae == 0)
        this.ae = 1; 
    } 
  }
  
  public final void l() {
    int[] arrayOfInt1;
    if (this.F.size() > 0 && (arrayOfInt1 = this.F.lastElement()) != null && arrayOfInt1[0] == this.Z && arrayOfInt1[3] == this.ac) {
      arrayOfInt1[5] = this.ae;
      return;
    } 
    int[] arrayOfInt2;
    (arrayOfInt2 = new int[6])[0] = this.Z;
    arrayOfInt2[1] = (((this.ab & true) != 0) ? 1 : 0) + (((this.an & true) != 0) ? 2 : 0);
    arrayOfInt2[2] = this.aa;
    arrayOfInt2[3] = this.ac;
    arrayOfInt2[4] = this.ad;
    arrayOfInt2[5] = this.ae;
    this.F.addElement(arrayOfInt2);
    if (this.F.size() > 50)
      this.F.removeElementAt(0); 
  }
  
  public final void m() {
    int i;
    int j;
    if ((j = (i = this.A) - 6000) < 0)
      j = 0; 
    this.am = false;
    boolean bool = false;
    short s = b(i + 1);
    short s1 = 0;
    this.aa = 0;
    while (i >= j) {
      s1 = s;
      if ((s = b(i)) == 7) {
        if (s1 == 1) {
          this.aa = b(i + 2);
          return;
        } 
        if (s1 == 3) {
          if (!bool) {
            this.am = true;
            this.ad = i;
          } 
        } else if (s1 == 4) {
          bool = true;
        } 
      } 
      i--;
    } 
  }
  
  public final void n() {
    while (this.F.size() > 0)
      this.F.removeElementAt(0); 
  }
  
  public final void o() {
    int i = this.Z;
    System.out.println("ST:" + i);
    System.out.println("ST:" + this.af);
    int j;
    if ((j = i - 6000) < 0)
      j = 0; 
    byte b = 0;
    boolean bool = false;
    int k;
    if ((k = (this.af - this.Z) / 2) < 0)
      k = 100; 
    while (i >= j) {
      short s;
      if ((s = b(i)) == 8)
        bool = true; 
      if (s == 7)
        bool = false; 
      byte b1 = this.C[s & 0xFF];
      if (b >= k && !bool && b1 > 3) {
        this.A = i;
        this.Z = i;
        this.ac = 0;
        this.ab = false;
        m();
        n();
        return;
      } 
      i--;
      b++;
    } 
    this.Z -= k;
    if (this.Z < 0)
      this.Z = 0; 
    this.ac = 0;
    this.ab = false;
    m();
    n();
  }
  
  public final void p() {
    this.ae = 0;
    System.out.println("PP:" + this.Z);
    if (this.F.size() == 0) {
      o();
      System.out.println("PPF:" + this.Z);
      return;
    } 
    this.F.removeElement(this.F.lastElement());
    if (this.F.size() == 0) {
      o();
      System.out.println("PPF2:" + this.Z);
      return;
    } 
    int[] arrayOfInt = this.F.lastElement();
    this.Z = arrayOfInt[0];
    this.ab = ((arrayOfInt[1] & 0x1) != 0);
    this.an = ((arrayOfInt[1] & 0x2) != 0);
    this.aa = arrayOfInt[2];
    this.ac = arrayOfInt[3];
    this.ad = arrayOfInt[4];
    this.ae = arrayOfInt[5];
    this.F.removeElement(this.F.lastElement());
  }
  
  public void run() {
    System.out.println("run " + this.aK + " " + this.x);
    synchronized (this.x) {
      if (this.aI) {
        m();
        this.aI = false;
      } 
      if (this.aK) {
        this.a = false;
        if (b(0) == 70 && b(1) == 82 && b(2) == 1 && b(3) < 3) {
          this.a = true;
          int i = a(4);
          System.out.println("Container:" + i);
          byte b1 = 8;
          this.ay = new int[i];
          this.az = new int[i];
          this.aA = new int[i];
          for (byte b2 = 0; b2 < i; b2++) {
            this.ay[b2] = a(b1);
            b1 += 4;
            this.az[b2] = a(b1);
            b1 += 4;
            this.aA[b2] = a(b1);
            b1 += 4;
            b1 += 4;
            if (this.aA[b2] == 0 && this.aB == -1)
              this.aB = b2; 
          } 
          this.n = this.ay[this.aB];
          this.t -= this.n;
          this.v = this.az[this.aB];
          System.out.println("Container._mainFile = " + this.aB);
          System.out.println("Container.start = " + this.n);
          System.out.println("Container.size = " + this.v);
        } else {
          this.ay = null;
          this.az = null;
          this.aA = null;
        } 
        this.aK = false;
      } 
      if (this.aJ)
        d(); 
      this.aJ = false;
      System.out.println("###########shrno:" + this.ae);
      try {
        h();
      } catch (Exception exception2) {
        Exception exception1;
        (exception1 = null).printStackTrace();
      } 
      System.out.println(this.ae);
    } 
    if (this.aL == 0);
    switch (this.aL) {
      case 1:
        this.f = Image.createImage(this.g, 0, 0, this.av - this.at, this.aw - this.au, 5);
        break;
      case 2:
        this.f = Image.createImage(this.g, 0, 0, this.av - this.at, this.aw - this.au, 6);
        break;
      default:
        this.f = this.g;
        break;
    } 
    this.aG = true;
    this.aH.repaint();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\p\PlgFRBook.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */