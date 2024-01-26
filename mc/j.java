package mc;

import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public final class mc/j implements PlayerListener {
  public mc/j(Player paramPlayer) {}
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (paramString.compareTo("endOfMedia") == 0 && paramPlayer != null)
      try {
        paramPlayer.close();
        return;
      } catch (Exception exception) {} 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\mc\j.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */