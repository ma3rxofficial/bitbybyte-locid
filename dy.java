import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import jimm.Jimm;

public final class dy implements bx, CommandListener {
  private static dy i;
  
  public static df a;
  
  private static final Vector j = new Vector();
  
  private static boolean k;
  
  public static int[] b;
  
  public static int[] c;
  
  public static String[] d;
  
  public static String[] e;
  
  public static String[] f;
  
  private static boolean[] l;
  
  public static String g;
  
  private static fa m;
  
  private static int n;
  
  private static Object o;
  
  private static TextBox p;
  
  public static int h;
  
  public dy() {
    k = false;
    i = this;
    Vector vector1 = new Vector();
    Vector vector2 = new Vector();
    InputStream inputStream;
    if ((inputStream = getClass().getResourceAsStream("/smiles.txt")) == null)
      return; 
    try {
      byte[] arrayOfByte = new byte[inputStream.available()];
      inputStream.read(arrayOfByte);
      de de = new de(arrayOfByte, null);
      StringBuffer stringBuffer = new StringBuffer();
      boolean bool = false;
      boolean bool1 = false;
      a(stringBuffer, de);
      int i = Integer.parseInt(stringBuffer.toString());
      while (true) {
        a(stringBuffer, de);
        Integer integer = Integer.valueOf(stringBuffer.toString());
        a(stringBuffer, de);
        String str = stringBuffer.toString();
        for (byte b = 0;; b++) {
          try {
            bool1 = a(stringBuffer, de);
          } catch (EOFException eOFException) {
            bool = true;
          } 
          String str1;
          if ((str1 = (new String(stringBuffer)).trim()).length() != 0)
            a(vector1, str1, integer); 
          if (!b)
            vector2.addElement(new Object[] { integer, str1, str }); 
          if (bool1 || bool)
            break; 
        } 
        if (bool) {
          inputStream.close();
          a = new ca();
          a.a("/smiles", i, i, -1);
          if (a.a() == 0) {
            a = new df();
            a.a("/smiles.png", i, i, -1);
          } 
          int j;
          b = new int[j = vector2.size()];
          d = new String[j];
          e = new String[j];
          byte b1;
          for (b1 = 0; b1 < j; b1++) {
            Object[] arrayOfObject = vector2.elementAt(b1);
            b[b1] = ((Integer)arrayOfObject[0]).intValue();
            d[b1] = (String)arrayOfObject[1];
            e[b1] = (String)arrayOfObject[2];
          } 
          f = new String[j = vector1.size()];
          c = new int[j];
          l = new boolean[j];
          for (b1 = 0; b1 < j; b1++) {
            Object[] arrayOfObject = vector1.elementAt(b1);
            f[b1] = (String)arrayOfObject[0];
            c[b1] = ((Integer)arrayOfObject[1]).intValue();
          } 
          k = true;
          return;
        } 
      } 
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static void a(Vector paramVector, String paramString, Integer paramInteger) {
    Object[] arrayOfObject = { paramString, paramInteger };
    int i = paramString.length();
    int j = paramVector.size();
    for (byte b = 0; b < j; b++) {
      if (((String)((Object[])paramVector.elementAt(b))[0]).length() <= i) {
        paramVector.insertElementAt(arrayOfObject, b);
        return;
      } 
    } 
    paramVector.addElement(arrayOfObject);
  }
  
  private static boolean a(StringBuffer paramStringBuffer, de paramde) throws IOException, EOFException {
    paramStringBuffer.setLength(0);
    char c;
    while ((c = paramde.a()) != ',' && c != '\n' && c != '\t') {
      if (c >= ' ')
        paramStringBuffer.append(c); 
    } 
    return (c == '\n');
  }
  
  private static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3) {
    if (!l[paramInt3])
      return; 
    int j = paramString2.length();
    int i;
    if ((i = paramString1.indexOf(paramString2, paramInt2)) == -1) {
      l[paramInt3] = false;
      return;
    } 
    j.addElement(new int[] { i, j, paramInt1 });
  }
  
  public static void a(be parambe, String paramString, int paramInt1, int paramInt2, int paramInt3) {
    boolean bool = false;
    if (!k || !em.h(38)) {
      parambe.a(paramString, paramInt2, paramInt1, paramInt3);
      return;
    } 
    int i;
    for (i = l.length - 1; i >= 0; i--)
      l[i] = true; 
    for (i = 0;; i = m + arrayOfInt[1]) {
      j.removeAllElements();
      int j = f.length;
      int k;
      for (k = 0; k < j; k++)
        a(paramString, f[k], c[k], i, k); 
      if (j.isEmpty()) {
        if ((j = paramString.length()) != i)
          parambe.a(paramString.substring(i, j), paramInt2, paramInt1, paramInt3, bool); 
        return;
      } 
      k = j.size();
      int m = 100000;
      int[] arrayOfInt = null;
      for (byte b = 0; b < k; b++) {
        int[] arrayOfInt1;
        if ((arrayOfInt1 = j.elementAt(b))[0] < m) {
          m = arrayOfInt1[0];
          arrayOfInt = arrayOfInt1;
        } 
      } 
      if (i != m)
        bool = parambe.a(paramString.substring(i, m), paramInt2, paramInt1, paramInt3, bool); 
      try {
        parambe.a(a.a(arrayOfInt[2]), paramString.substring(m, m + arrayOfInt[1]), paramInt3);
      } catch (Exception exception) {}
    } 
  }
  
  public static void a(TextBox paramTextBox, Object paramObject) {
    o = paramObject;
    n = paramTextBox.getCaretPosition();
    p = paramTextBox;
    if (em.h(91)) {
      m = new fa(0, h);
    } else {
      m = new fa(0, 0);
    } 
    m.u = true;
    m.a(dw.q, bd.Z);
    m.a(dw.f, bd.aa);
    m.a(i);
    m.b(Jimm.d);
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == dw.q) {
      a();
      return;
    } 
    if (paramCommand == dw.f) {
      dw.b(o);
      cz.a(true);
    } 
  }
  
  public final void a(bd parambd, int paramInt1, int paramInt2) {}
  
  public final void f(int paramInt) {}
  
  public final void a(bd parambd) {}
  
  public final void b(bd parambd) {
    a();
  }
  
  public static void a() {
    fa.af /= 4;
    if (fa.af == 0)
      fa.af = 1; 
    if (fa.af > 10)
      fa.af = 10; 
    while (fa.af > 0) {
      p.insert(" " + b() + " ", n);
      fa.af--;
    } 
    dw.b(o);
    if (em.f(259) == 2) {
      if (fa.z() < fa.A()) {
        h = 0;
      } else {
        h = fa.z();
      } 
      int i = fa.u(fa.z());
      int j = i;
      byte b = 0;
      int k = em.b[b];
      em.b[b] = j;
      while (b < em.b.length && (j = k) != i)
        b++; 
    } else {
      h = fa.z();
    } 
    m = null;
    dw.i();
    cz.a(true);
  }
  
  private static String b() {
    return g;
  }
  
  static class ep {}
  
  private class de {
    public String a = dh.a((byte[])dy.this, true);
    
    public int b = 0;
    
    private de(dy this$0) {
      this.b = 0;
    }
    
    public final char a() throws IOException {
      if (this.b >= this.a.length())
        throw new EOFException(); 
      return this.a.charAt(this.b++);
    }
    
    public de(byte[] param1ArrayOfbyte, dy.ep param1ep) {
      this(param1ArrayOfbyte);
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\dy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */