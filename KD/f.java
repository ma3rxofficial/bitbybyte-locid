package KD;

import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.MetaDataControl;
import javax.microedition.media.control.VideoControl;

public final class f implements Runnable {
  public String a;
  
  public String b;
  
  public boolean c;
  
  public String d;
  
  public String e;
  
  public String f;
  
  public String g;
  
  public String h;
  
  public long i;
  
  public final boolean a(String paramString) {
    if (paramString == null)
      return false; 
    if (paramString.length() < 1)
      return false; 
    boolean bool = false;
    a();
    this.b = paramString;
    Thread thread;
    (thread = new Thread(this)).start();
    try {
      thread.join();
    } catch (Exception exception) {}
    this.b = paramString;
    if (!(bool = (this.a == null) ? true : false))
      a(); 
    return bool;
  }
  
  public final void a(Player paramPlayer) {
    a();
    try {
      this.d = paramPlayer.getContentType();
      this.i = paramPlayer.getDuration();
      MetaDataControl metaDataControl;
      if ((metaDataControl = (MetaDataControl)paramPlayer.getControl("MetaDataControl")) != null) {
        String str = null;
        str = metaDataControl.getKeyValue("author");
        this.e = str;
        this.e = (this.e != null) ? this.e.trim() : "";
        str = metaDataControl.getKeyValue("title");
        this.f = str;
        this.f = (this.f != null) ? this.f.trim() : "";
        str = metaDataControl.getKeyValue("album");
        this.g = str;
        this.g = (this.g != null) ? this.g.trim() : "";
      } 
      this.e = b(this.e);
      this.f = b(this.f);
      this.g = b(this.g);
      VideoControl videoControl = (VideoControl)paramPlayer.getControl("VideoControl");
      this.c = (videoControl != null);
      this.h = videoControl.getSourceWidth() + "x" + videoControl.getSourceHeight();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void a() {
    this.a = "";
    this.b = "";
    this.c = false;
    this.d = "";
    this.e = "";
    this.f = "";
    this.g = "";
    this.h = "";
    this.i = 0L;
  }
  
  public final void run() {
    try {
      Player player;
      if ((player = Manager.createPlayer("file://" + this.b)) != null) {
        player.realize();
        player.prefetch();
        a(player);
        player.deallocate();
        player.close();
        this.a = null;
      } 
      return;
    } catch (Exception exception) {
      this.a = exception.getMessage();
      return;
    } 
  }
  
  private static String b(String paramString) {
    if (paramString == null)
      return paramString; 
    String str = "";
    char c = Character.MIN_VALUE;
    for (byte b = 0; b < paramString.length(); b++) {
      if (((((c = paramString.charAt(b)) >= 'À') ? 1 : 0) & ((c <= 'ÿ') ? 1 : 0)) != 0)
        c += '͐'; 
      if (c == '¨')
        c = 'Ё'; 
      if (c == '¸')
        c = 'ё'; 
      if (c != '\000')
        str = str + (char)c; 
    } 
    return str;
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\KD\f.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */