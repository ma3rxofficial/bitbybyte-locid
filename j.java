import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.sensor.MeasurementRange;
import javax.microedition.sensor.SensorConnection;
import javax.microedition.sensor.SensorInfo;
import javax.microedition.sensor.SensorManager;

public final class j {
  int a;
  
  int b;
  
  int c = 0;
  
  int d = 0;
  
  int e = 0;
  
  int[] a;
  
  int[] b;
  
  public int f = 0;
  
  private boolean a;
  
  private SensorConnection a;
  
  private StringBuffer a = true;
  
  public j(boolean paramBoolean) {
    this.a = new StringBuffer();
    this.b = new int[10];
    this.a = (StringBuffer)new int[10];
    a(paramBoolean);
  }
  
  public final void a(boolean paramBoolean) {
    if (this.a == null) {
      if (v.o == 0L && v.p == 0L)
        paramBoolean = true; 
      SensorInfo[] arrayOfSensorInfo = SensorManager.findSensors(null, null);
      byte b = 0;
      int i = arrayOfSensorInfo.length;
      while (b < i) {
        try {
          SensorConnection sensorConnection;
          SensorInfo sensorInfo;
          if ((sensorInfo = (sensorConnection = (SensorConnection)Connector.open(arrayOfSensorInfo[b].getUrl())).getSensorInfo()).getUrl().indexOf("sensor:acceleration") > -1) {
            if (v.o == 0L && v.p == 0L) {
              MeasurementRange[] arrayOfMeasurementRange;
              v.o = (long)(arrayOfMeasurementRange = sensorInfo.getChannelInfos()[0].getMeasurementRanges())[0].getSmallestValue();
              v.p = (long)arrayOfMeasurementRange[0].getLargestValue();
            } 
            sensorConnection.setDataListener(new u(this), 1);
            this.a = (StringBuffer)sensorConnection;
            break;
          } 
          sensorConnection.close();
        } catch (IOException iOException) {}
        b++;
      } 
    } 
    if (paramBoolean) {
      ((af)af.b).J = true;
      af.b.repaint();
    } 
  }
  
  public final void a() {
    if (this.a != null)
      try {
        this.a.close();
        return;
      } catch (IOException iOException) {} 
  }
  
  public final void a(Graphics paramGraphics) {
    if (paramGraphics != null) {
      paramGraphics.setColor(16777215);
      paramGraphics.fillRect(0, 0, af.b(), af.c());
      paramGraphics.setColor(10066329);
      this.a.setLength(0);
      this.a.append("x=").append(this.a).append("%(").append(this.c).append(')').append(" y=").append(this.b).append("%(").append(this.d).append(')');
      paramGraphics.drawString(this.a.toString(), af.b() >> 1, af.c() >> 1, 33);
      paramGraphics.setColor(16711680);
      this.a.setLength(0);
      this.a.append(this.f).append('°');
      paramGraphics.setFont(Font.getFont(64, 1, 16));
      paramGraphics.drawString(this.a.toString(), af.b() >> 1, (paramGraphics.getFont().getHeight() << 1) + (af.c() >> 1), 33);
    } 
  }
  
  public final void b(Graphics paramGraphics) {
    if (paramGraphics != null) {
      paramGraphics.setFont(Font.getFont(64, 0, 8));
      paramGraphics.setColor(0);
      paramGraphics.drawString((this.a != null) ? "SetMIN" : "SetMAX", 0, af.b.getHeight() - 1, 36);
      paramGraphics.setFont(Font.getFont(64, v.do ? 1 : 0, 8));
      paramGraphics.drawString("Inverse", af.b.getWidth() >> 1, af.b.getHeight() - 1, 33);
      paramGraphics.setFont(Font.getFont(64, 0, 8));
      paramGraphics.drawString("OK", af.b.getWidth() - 1, af.b.getHeight() - 1, 40);
    } 
  }
  
  public final void a(int paramInt) {
    switch (paramInt) {
      case 8:
        v.do = !v.do;
        break;
      case -6:
        if (this.a != null) {
          v.o = this.c;
          this.a = false;
        } else {
          v.p = this.c;
          this.a = true;
        } 
        a((Graphics)null);
        break;
      case -7:
        af.b.a(this.f);
        ((af)af.b).J = false;
        v.f((DataOutputStream)null);
        b(null);
        break;
      case -5:
        a(8);
        break;
    } 
    af.b.repaint();
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\j.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */