package ui;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;

public class FormEx extends Canvas implements CommandListener {
  private String cap;
  
  private Command cLeft;
  
  private Command cRight;
  
  private CommandListener cl;
  
  private Display display;
  
  static int fH = GFont.font.getHeight();
  
  static int iH = Math.max(fH, 16);
  
  static int cH = fH + 2;
  
  static int sW = 4;
  
  private Vector vItems = new Vector();
  
  int curItem = 0;
  
  int topItem = 0;
  
  int visItems;
  
  int topY;
  
  TimerTask task;
  
  private Command c_sv = new Command("Сохран.", 4, 1);
  
  private Command c_bk = new Command("Назад", 2, 2);
  
  public FormEx(String paramString, Command paramCommand1, Command paramCommand2) {
    this.cap = paramString;
    this.cLeft = paramCommand1;
    this.cRight = paramCommand2;
    setFullScreenMode(true);
    this.visItems = getHeightInt() / iH;
    this.topY = (getHeightInt() - this.visItems * iH) / 2;
  }
  
  public ItemEx getItem(int paramInt) {
    return this.vItems.elementAt(paramInt);
  }
  
  public int getCurrIndex() {
    return this.curItem;
  }
  
  private int getHeightInt() {
    return getHeight() - cH * 2;
  }
  
  private int getWidthInt() {
    return getWidth() - sW;
  }
  
  public int size() {
    return this.vItems.size();
  }
  
  public void remove(int paramInt) {
    ItemEx itemEx = getItem(paramInt);
    if (itemEx.parent == null) {
      this.vItems.removeElementAt(paramInt);
      if (paramInt == this.curItem) {
        this.curItem--;
        repaint();
      } 
    } 
  }
  
  public void append(String paramString, boolean paramBoolean) {
    this.vItems.addElement(new ItemEx(paramString, paramBoolean));
  }
  
  public void append(Item paramItem) {
    if (paramItem.getLabel() != null)
      append(getString(paramItem.getLabel()), false); 
    if (paramItem instanceof ChGroupEx) {
      ChGroupEx chGroupEx = (ChGroupEx)paramItem;
      byte b1 = 0;
      if (chGroupEx.type == 2)
        b1 += true; 
      for (byte b2 = 0; b2 < chGroupEx.size(); b2++)
        this.vItems.addElement(new ItemEx(chGroupEx, Colors.getImage((chGroupEx.isSelected(b2) ? b1 : (b1 + 1)) + ".png"), getString(chGroupEx.getString(b2)), b2)); 
    } else if (paramItem instanceof TextField) {
      this.vItems.addElement(new ItemEx(paramItem, Colors.get("/ui/res/4.png"), getString(paramItem), -1));
    } else if (paramItem instanceof Gauge) {
      this.vItems.addElement(new ItemEx(paramItem, null, null, -1));
    } 
  }
  
  public void setListener(CommandListener paramCommandListener) {
    this.cl = paramCommandListener;
  }
  
  public void setDisplay(Display paramDisplay) {
    this.display = paramDisplay;
  }
  
  public boolean isLeft(Command paramCommand) {
    return paramCommand.equals(this.cLeft);
  }
  
  public boolean isRight(Command paramCommand) {
    return paramCommand.equals(this.cRight);
  }
  
  public String getString(Object paramObject) {
    String str;
    if (paramObject instanceof TextField) {
      TextField textField = (TextField)paramObject;
      if (textField.getConstraints() == 65536) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b = 0; b < textField.getString().length(); b++)
          stringBuffer.append('*'); 
        str = stringBuffer.toString();
      } else if (textField.getString().length() > 0) {
        str = textField.getString();
      } else {
        str = "...";
      } 
    } else {
      str = (String)paramObject;
    } 
    return getShort(str);
  }
  
  private String getShort(String paramString) {
    if (GFont.font.getStringWidth(paramString) < getWidthInt() - 8)
      return paramString; 
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramString.length(); b++) {
      if (GFont.font.getStringWidth(stringBuffer.toString()) < getWidthInt() - 38) {
        stringBuffer.append(paramString.charAt(b));
      } else {
        stringBuffer.append("...");
        break;
      } 
    } 
    return stringBuffer.toString();
  }
  
  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(Config.get(0));
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    drawCursor(paramGraphics);
    drawItems(paramGraphics);
    drawScroller(paramGraphics);
    drawCap(paramGraphics);
    drawSoft(paramGraphics);
  }
  
  private void drawCap(Graphics paramGraphics) {
    Colors.drawRect(paramGraphics, Config.get(4), Colors.transformColor(Config.get(4), -48), 0, 0, getWidth(), cH);
    if (this.cap != null)
      GFont.font.drawString(paramGraphics, 2, (cH - fH) / 2, this.cap, Config.get(11)); 
  }
  
  private void drawSoft(Graphics paramGraphics) {
    Colors.drawRect(paramGraphics, Colors.transformColor(Config.get(4), -48), Config.get(4), 0, getHeight() - cH, getWidth(), getHeight());
    if (this.cLeft != null)
      GFont.font.drawString(paramGraphics, 2, getHeight() - cH + (cH - fH) / 2, this.cLeft.getLabel(), Config.get(11)); 
    if (this.cRight != null)
      GFont.font.drawString(paramGraphics, getWidth() - GFont.font.getStringWidth(this.cRight.getLabel()), getHeight() - cH + (cH - fH) / 2, this.cRight.getLabel(), Config.get(11)); 
  }
  
  private void drawItems(Graphics paramGraphics) {
    int i = cH + this.topY;
    int j = (iH - fH) / 2;
    for (byte b = 0; b < Math.min(this.visItems, size()); b++) {
      int k;
      ItemEx itemEx = this.vItems.elementAt(b + this.topItem);
      if (b + this.topItem == this.curItem) {
        k = Colors.getInvColor(Config.get(8));
      } else {
        k = Config.get(1);
      } 
      if (itemEx.parent instanceof ChGroupEx || itemEx.parent instanceof TextField) {
        int m = 3;
        if (itemEx.icon != null) {
          m += itemEx.icon.getWidth();
          paramGraphics.drawImage(itemEx.icon, 2, i + b * iH + itemEx.icon.getHeight() / 2, 6);
        } 
        GFont.font.drawString(paramGraphics, m + 1, i + b * iH + j, itemEx.text, k);
      } else if (itemEx.parent instanceof Gauge) {
        int m = ((Gauge)itemEx.parent).getValue();
        int n = ((Gauge)itemEx.parent).getMaxValue();
        int i1 = 2 + (getWidthInt() - 8) * m / n;
        Colors.drawGradient(paramGraphics, 2, i + b * iH + 3, getWidthInt() - 8, iH - 6, Config.get(1), 8, -16, 16);
        Colors.drawGradient(paramGraphics, 3, i + b * iH + 4, i1 - 6, iH - 8, Config.get(4), 8, 16, -16);
      } else {
        GFont.font.drawString(paramGraphics, 3, i + b * iH + j, itemEx.text, k);
      } 
    } 
  }
  
  private void drawScroller(Graphics paramGraphics) {
    int i = Colors.transformColor(Colors.transformColor(Config.get(0), 32), -32);
    if (i == 0)
      i = 8421504; 
    paramGraphics.setStrokeStyle(0);
    int j = getWidth() - 4;
    paramGraphics.setColor(Colors.transformColor(i, -96));
    paramGraphics.drawLine(j, this.topY, j, getHeight());
    paramGraphics.setColor(Colors.transformColor(i, -64));
    paramGraphics.drawLine(j + 1, this.topY, j + 1, getHeight());
    paramGraphics.setColor(Colors.transformColor(i, -32));
    paramGraphics.drawLine(j + 2, this.topY, j + 2, getHeight());
    paramGraphics.setColor(i);
    paramGraphics.drawLine(j + 3, this.topY, j + 3, getHeight());
    if (size() > this.visItems) {
      int k = this.visItems * getHeightInt() / size();
      int m = cH + this.topItem * (getHeightInt() - k) / (size() - this.visItems);
      paramGraphics.setColor(Colors.transformColor(i, -192));
      paramGraphics.drawRect(j, m, sW - 1, k);
      paramGraphics.setColor(Colors.transformColor(Config.get(4), 96));
      paramGraphics.drawLine(j + 1, m + 1, j + 1, m + k - 1);
      paramGraphics.setColor(Config.get(4));
      paramGraphics.drawLine(j + 2, m + 1, j + 2, m + k - 1);
    } 
  }
  
  private void drawCursor(Graphics paramGraphics) {
    Colors.drawGradient(paramGraphics, 1, (this.curItem - this.topItem) * iH + this.topY + cH, getWidthInt() - 3, iH - 1, Config.get(8), 16, -32, 0);
    int i = Config.get(23);
    if (i == 0)
      i = Colors.transformColor(Config.get(8), -48); 
    paramGraphics.setColor(i);
    paramGraphics.drawRect(1, (this.curItem - this.topItem) * iH + this.topY + cH, getWidthInt() - 3, iH - 1);
  }
  
  private void moveCursor(int paramInt) {
    this.curItem += paramInt;
    if (this.curItem < 0)
      this.curItem = size() - 1; 
    if (this.curItem == size())
      this.curItem = 0; 
    if (size() > this.visItems)
      setTopItem(paramInt); 
  }
  
  void setTopItem(int paramInt) {
    if (paramInt > 0) {
      if (this.curItem > this.visItems + this.topItem - 1 && this.topItem < size() - this.visItems)
        this.topItem += paramInt; 
      if (this.curItem == 0)
        this.topItem = 0; 
    } else {
      if (this.curItem == size() - 1)
        this.topItem = size() - this.visItems; 
      if (this.curItem < this.topItem)
        this.topItem--; 
    } 
  }
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == this.c_sv) {
      TextField textField = (TextField)(getItem(this.curItem)).parent;
      textField.setString(((TextBox)paramDisplayable).getString());
      this.vItems.setElementAt(new ItemEx(textField, Colors.get("/ui/res/4.png"), textField.getString(), -1), this.curItem);
    } 
    this.display.setCurrent((Displayable)this);
    setFullScreenMode(true);
  }
  
  public void keyPressed(int paramInt) {
    ItemEx itemEx;
    switch (getKeyEx(paramInt)) {
      case -6:
        if (this.cLeft != null)
          execCommand(this.cLeft); 
        break;
      case -7:
        if (this.cRight != null)
          execCommand(this.cRight); 
        break;
      case -11:
        if (this.cLeft != null && this.cLeft.getCommandType() == 2) {
          execCommand(this.cLeft);
          break;
        } 
        if (this.cRight != null && this.cRight.getCommandType() == 2)
          execCommand(this.cRight); 
        break;
      case 2:
      case 5:
      case 52:
      case 54:
        itemEx = getItem(this.curItem);
        if (itemEx.parent instanceof Gauge) {
          Gauge gauge = (Gauge)itemEx.parent;
          gauge.setValue(gauge.getValue() + ((paramInt == 54 || getKeyEx(paramInt) == 5) ? 1 : -1));
        } 
        break;
      case 8:
      case 53:
        itemEx = getItem(this.curItem);
        if (itemEx.parent instanceof ChGroupEx) {
          updateItems(itemEx);
          break;
        } 
        if (itemEx.parent instanceof TextField) {
          if (this.display != null) {
            TextField textField = (TextField)itemEx.parent;
            TextBox textBox = new TextBox(textField.getLabel(), textField.getString(), textField.getMaxSize(), textField.getConstraints());
            textBox.addCommand(this.c_bk);
            textBox.addCommand(this.c_sv);
            textBox.setCommandListener(this);
            this.display.setCurrent((Displayable)textBox);
          } 
          break;
        } 
        if (itemEx.index == -2)
          this.cl.commandAction(List.SELECT_COMMAND, (Displayable)this); 
        break;
      case 6:
      case 56:
        moveCursor(1);
        break;
      case 1:
      case 50:
        moveCursor(-1);
        break;
    } 
    repaint();
  }
  
  private void execCommand(Command paramCommand) {
    if (this.cl != null)
      this.cl.commandAction(paramCommand, (Displayable)this); 
  }
  
  private void updateItems(ItemEx paramItemEx) {
    ChGroupEx chGroupEx = (ChGroupEx)paramItemEx.parent;
    chGroupEx.setSelectedIndex(paramItemEx.index, !chGroupEx.isSelected(paramItemEx.index));
    byte b = 0;
    if (chGroupEx.type == 2)
      b += true; 
    if (chGroupEx.type == 1) {
      int i = this.curItem - paramItemEx.index;
      for (int j = i; j < i + chGroupEx.size(); j++)
        this.vItems.setElementAt(new ItemEx(chGroupEx, Colors.getImage((chGroupEx.isSelected(j - i) ? b : (b + 1)) + ".png"), chGroupEx.getString(j - i), j - i), j); 
    } else {
      this.vItems.setElementAt(new ItemEx(chGroupEx, Colors.getImage((chGroupEx.isSelected(paramItemEx.index) ? b : (b + 1)) + ".png"), chGroupEx.getString(paramItemEx.index), paramItemEx.index), this.curItem);
    } 
  }
  
  public int getKeyEx(int paramInt) {
    return (getGameAction(paramInt) > 0) ? getGameAction(paramInt) : paramInt;
  }
  
  public void keyRepeated(int paramInt) {
    switch (getKeyEx(paramInt)) {
      case 1:
      case 6:
      case 50:
      case 56:
        if (this.task == null)
          this.task = new Task(this, getKeyEx(paramInt)); 
        break;
    } 
  }
  
  public void keyReleased(int paramInt) {
    switch (getKeyEx(paramInt)) {
      case 1:
      case 6:
      case 50:
      case 56:
        if (this.task != null) {
          this.task.cancel();
          this.task = null;
        } 
        break;
    } 
  }
  
  static {
    GFont.font = new GFont("/ui/res/font.prs");
    GFont.font.setImage("/ui/res/font.png");
  }
  
  class Task extends TimerTask {
    String text;
    
    int mode;
    
    private final FormEx this$0;
    
    public Task(FormEx this$0, int param1Int) {
      this.this$0 = this$0;
      this.mode = param1Int;
      if (param1Int == 0) {
        ItemEx itemEx = this$0.getItem(this$0.curItem);
        this.text = itemEx.text;
      } else {
        (new Timer()).schedule(this, 60L, 60L);
      } 
    }
    
    public void run() {
      if (this.mode == 56 || this.mode == 6) {
        this.this$0.moveCursor(1);
      } else if (this.mode == 50 || this.mode == 1) {
        this.this$0.moveCursor(-1);
      } else {
        this.text = this.text.substring(1, this.text.length());
        this.this$0.vItems.setElementAt(new ItemEx(null, null, this.text, -1), this.this$0.curItem);
      } 
      this.this$0.repaint();
    }
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar\\ui\FormEx.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */