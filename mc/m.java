package mc;

import MiniCommander;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.Connection;

public final class m {
  public static final byte a = MiniCommander.c;
  
  public Connection b = null;
  
  public final boolean a(String paramString) throws IOException {
    if (!paramString.startsWith("file://"))
      paramString = "file://" + paramString; 
    switch (a) {
      case 0:
        this.b = ce.a(paramString);
        break;
      case 1:
        this.b = cd.a(paramString);
        break;
      case 2:
        this.b = dg.a(paramString);
        break;
      case 3:
        this.b = cr.a(paramString);
        break;
    } 
    if (this.b == null)
      throw new IOException("Open error"); 
    return true;
  }
  
  public final boolean a(String paramString, int paramInt) throws IOException {
    if (!paramString.startsWith("file://"))
      paramString = "file://" + paramString; 
    switch (a) {
      case 0:
        this.b = ce.a(paramString, paramInt);
        break;
      case 1:
        this.b = cd.a(paramString, paramInt);
        break;
      case 2:
        this.b = dg.a(paramString, paramInt);
        break;
      case 3:
        this.b = cr.a(paramString, paramInt);
        break;
    } 
    if (this.b == null)
      throw new IOException("Open error"); 
    return true;
  }
  
  public final long a() throws IOException {
    switch (a) {
      case 0:
        return ce.a(this.b);
      case 1:
        return cd.a(this.b);
      case 2:
        return dg.a(this.b);
      case 3:
        return cr.a(this.b);
    } 
    throw new IOException("Unknown file connection");
  }
  
  public final DataInputStream b() throws IOException {
    switch (a) {
      case 0:
        return ce.b(this.b);
      case 1:
        return cd.b(this.b);
      case 2:
        return dg.b(this.b);
      case 3:
        return cr.b(this.b);
    } 
    throw new IOException("Unknown file connection");
  }
  
  public final DataOutputStream c() throws IOException {
    switch (a) {
      case 0:
        return ce.c(this.b);
      case 1:
        return cd.c(this.b);
      case 2:
        return dg.c(this.b);
      case 3:
        return cr.c(this.b);
    } 
    throw new IOException("Unknown file connection");
  }
  
  public final void d() {
    switch (a) {
      case 0:
        ce.d(this.b);
        break;
      case 1:
        cd.d(this.b);
        break;
      case 2:
        dg.d(this.b);
        break;
      case 3:
        cr.d(this.b);
        break;
    } 
    this.b = null;
  }
  
  public static String[] e() {
    switch (a) {
      case 0:
        return ce.a();
      case 1:
        return cd.a();
      case 2:
        return dg.a();
      case 3:
        return cr.a();
    } 
    return new String[0];
  }
  
  public final String[] a(String paramString, boolean paramBoolean) throws IOException {
    switch (a) {
      case 0:
        return ce.e(this.b);
      case 1:
        return cd.a(this.b, paramString, paramBoolean);
      case 2:
        return dg.a(this.b, paramString, paramBoolean);
      case 3:
        return cr.a(this.b, paramString, paramBoolean);
    } 
    throw new IOException("Unknown file connection");
  }
  
  public static void a(Vector paramVector, String paramString) {
    switch (a) {
      case 0:
        ce.a(paramVector, paramString);
        break;
    } 
  }
  
  public final boolean f() {
    switch (a) {
      case 0:
        return ce.f(this.b);
      case 1:
        return cd.e(this.b);
      case 2:
        return dg.e(this.b);
      case 3:
        return cr.e(this.b);
    } 
    return false;
  }
  
  public final InputStream g() throws IOException {
    switch (a) {
      case 0:
        return ce.g(this.b);
      case 1:
        return cd.f(this.b);
      case 2:
        return dg.f(this.b);
      case 3:
        return cr.f(this.b);
    } 
    return null;
  }
  
  public final void a(boolean paramBoolean) throws IOException {
    switch (a) {
      case 0:
        ce.a(this.b, paramBoolean);
        return;
      case 1:
        cd.a(this.b, paramBoolean);
        return;
      case 2:
        dg.a(this.b, paramBoolean);
        return;
      case 3:
        cr.a(this.b, paramBoolean);
        break;
    } 
  }
  
  public final void b(boolean paramBoolean) throws IOException {
    switch (a) {
      case 0:
        ce.b(this.b, paramBoolean);
        return;
      case 1:
        cd.b(this.b, paramBoolean);
        return;
      case 2:
        dg.b(this.b, paramBoolean);
        return;
      case 3:
        cr.b(this.b, paramBoolean);
        break;
    } 
  }
  
  public final void c(boolean paramBoolean) throws IOException {
    switch (a) {
      case 0:
        ce.c(this.b, paramBoolean);
        return;
      case 1:
        cd.c(this.b, paramBoolean);
        return;
      case 2:
        dg.c(this.b, paramBoolean);
        return;
      case 3:
        cr.c(this.b, paramBoolean);
        break;
    } 
  }
  
  public final long h() {
    switch (a) {
      case 0:
        return ce.h(this.b);
      case 1:
        return cd.g(this.b);
      case 2:
        return dg.g(this.b);
      case 3:
        return cr.g(this.b);
    } 
    return 0L;
  }
  
  public final long i() {
    switch (a) {
      case 0:
        return ce.i(this.b);
      case 1:
        return cd.h(this.b);
      case 2:
        return dg.h(this.b);
      case 3:
        return cr.h(this.b);
    } 
    return 0L;
  }
  
  public final long j() {
    switch (a) {
      case 0:
        return ce.j(this.b);
      case 1:
        return cd.i(this.b);
      case 2:
        return dg.i(this.b);
      case 3:
        return cr.i(this.b);
    } 
    return 0L;
  }
  
  public final boolean k() {
    switch (a) {
      case 0:
        return ce.k(this.b);
      case 1:
        return cd.j(this.b);
      case 2:
        return dg.j(this.b);
      case 3:
        return cr.j(this.b);
    } 
    return false;
  }
  
  public final boolean l() {
    switch (a) {
      case 0:
        return ce.l(this.b);
      case 1:
        return cd.k(this.b);
      case 2:
        return dg.k(this.b);
      case 3:
        return cr.k(this.b);
    } 
    return false;
  }
  
  public final boolean m() {
    switch (a) {
      case 0:
        return ce.m(this.b);
      case 1:
        return cd.l(this.b);
      case 2:
        return dg.l(this.b);
      case 3:
        return cr.l(this.b);
    } 
    return false;
  }
  
  public final boolean n() throws IOException {
    switch (a) {
      case 0:
        return ce.n(this.b);
      case 1:
        return cd.m(this.b);
      case 2:
        return dg.m(this.b);
      case 3:
        return cr.m(this.b);
    } 
    return false;
  }
  
  public final boolean b(String paramString) {
    return a(paramString, (String[])null);
  }
  
  public final boolean a(String paramString, String[] paramArrayOfString) {
    boolean bool = false;
    if (!cx.d(s()).toLowerCase().equals(cx.d(paramString).toLowerCase()) && !s().endsWith("/"))
      bool = true; 
    try {
      switch (a) {
        case 0:
          return ce.a(this.b, "file://" + paramString);
        case 1:
          if (bool == true)
            return false; 
          if (!s().endsWith("/")) {
            paramString = cx.c(paramString);
          } else {
            paramString = cx.j(paramString) + "/";
          } 
          return cd.a(this.b, paramString);
        case 2:
          if (bool == true)
            return false; 
          if (!s().endsWith("/")) {
            paramString = cx.c(paramString);
          } else {
            paramString = cx.j(paramString) + "/";
          } 
          return dg.a(this.b, paramString);
        case 3:
          if (bool == true)
            return false; 
          if (!s().endsWith("/")) {
            paramString = cx.c(paramString);
          } else {
            paramString = cx.j(paramString) + "/";
          } 
          return cr.a(this.b, paramString);
      } 
    } catch (Exception exception) {
      if (paramArrayOfString != null && paramArrayOfString.length > 0)
        paramArrayOfString[0] = exception.getMessage(); 
    } 
    return false;
  }
  
  public final boolean o() throws IOException {
    switch (a) {
      case 0:
        return ce.o(this.b);
      case 1:
        return cd.n(this.b);
      case 2:
        return dg.n(this.b);
      case 3:
        return cr.n(this.b);
    } 
    return false;
  }
  
  public static boolean a(String paramString, bk parambk, boolean[] paramArrayOfboolean) {
    switch (a) {
      case 0:
        return ce.a(paramString, parambk, paramArrayOfboolean);
      case 1:
        return cd.a(paramString, parambk, paramArrayOfboolean);
      case 2:
        return dg.a(paramString, parambk, paramArrayOfboolean);
      case 3:
        return cr.a(paramString, parambk, paramArrayOfboolean);
    } 
    return false;
  }
  
  public final boolean p() {
    switch (a) {
      case 0:
        return ce.p(this.b);
      case 1:
        return cd.o(this.b);
      case 2:
        return dg.o(this.b);
      case 3:
        return cr.o(this.b);
    } 
    return false;
  }
  
  public final void q() throws IOException {
    switch (a) {
      case 0:
        ce.b();
        return;
      case 1:
        cd.p(this.b);
        return;
      case 2:
        dg.p(this.b);
        return;
      case 3:
        cr.p(this.b);
        break;
    } 
  }
  
  public final long d(boolean paramBoolean) throws IOException {
    switch (a) {
      case 0:
        return ce.d(this.b, paramBoolean);
      case 1:
        return cd.d(this.b, paramBoolean);
      case 2:
        return dg.d(this.b, paramBoolean);
      case 3:
        return cr.d(this.b, paramBoolean);
    } 
    throw new IOException("Unknown file connection");
  }
  
  public final long r() {
    switch (a) {
      case 0:
        return ce.q(this.b);
      case 1:
        return cd.q(this.b);
      case 2:
        return dg.q(this.b);
      case 3:
        return cr.q(this.b);
    } 
    return -1L;
  }
  
  public final String s() {
    String str = null;
    switch (a) {
      case 0:
        str = ce.r(this.b);
        break;
      case 1:
        str = cd.r(this.b);
        break;
      case 2:
        str = dg.r(this.b);
        break;
      case 3:
        str = cr.r(this.b);
        break;
    } 
    if (str != null && str.startsWith("file://"))
      str = str.substring(7, str.length()); 
    return str;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\m.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */