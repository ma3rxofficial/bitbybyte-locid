package favax.microedition.midlet;

import i.PI;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.midlet.MIDletStateChangeException;

public abstract class MIDlet {
  public static javax.microedition.midlet.MIDlet a;
  
  public static PI b;
  
  public abstract void startApp() throws MIDletStateChangeException;
  
  public abstract void pauseApp();
  
  public abstract void destroyApp(boolean paramBoolean) throws MIDletStateChangeException;
  
  public final void notifyDestroyed() {
    b.activate(1048578, null, this);
  }
  
  public final void notifyPaused() {
    a.notifyPaused();
  }
  
  public final String getAppProperty(String paramString) {
    return a.getAppProperty(paramString);
  }
  
  public final void resumeRequest() {
    a.resumeRequest();
  }
  
  public final boolean platformRequest(String paramString) throws ConnectionNotFoundException {
    return a.platformRequest(paramString);
  }
  
  public final int checkPermission(String paramString) {
    return a.checkPermission(paramString);
  }
  
  public static MIDlet createMidlet(String paramString, javax.microedition.midlet.MIDlet paramMIDlet, PI paramPI) {
    MIDlet mIDlet = null;
    try {
      Object object = null;
      mIDlet = (MIDlet)Class.forName(paramString).newInstance();
      a = paramMIDlet;
      b = paramPI;
    } catch (Throwable throwable) {
      null.printStackTrace();
    } 
    return mIDlet;
  }
  
  public static MIDlet createMidlet(MIDlet paramMIDlet, javax.microedition.midlet.MIDlet paramMIDlet1, PI paramPI) {
    MIDlet mIDlet = null;
    try {
      mIDlet = paramMIDlet;
      a = paramMIDlet1;
      b = paramPI;
    } catch (Throwable throwable) {
      null.printStackTrace();
    } 
    return mIDlet;
  }
  
  public static void freez(PI paramPI) {
    b = paramPI;
  }
  
  public static void unFreez() {
    b = null;
  }
  
  public void myStartApp() {
    try {
      startApp();
      return;
    } catch (MIDletStateChangeException mIDletStateChangeException) {
      null.printStackTrace();
      return;
    } 
  }
  
  public void myPauseApp() {
    myPauseApp();
  }
  
  public void myDestroyApp(boolean paramBoolean) {
    try {
      destroyApp(paramBoolean);
      return;
    } catch (MIDletStateChangeException mIDletStateChangeException) {
      null.printStackTrace();
      return;
    } 
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\favax\microedition\midlet\MIDlet.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */