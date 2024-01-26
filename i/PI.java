package i;

import cp;

public abstract class PI {
  public String getName() {
    return "Plugin";
  }
  
  public I getIcon() {
    return null;
  }
  
  public Object activate(int paramInt) {
    return activate(paramInt, null, null);
  }
  
  public abstract Object activate(int paramInt, Object[] paramArrayOfObject, Object paramObject);
  
  public Object request(int paramInt, Object[] paramArrayOfObject, Object paramObject) {
    return cp.a(paramInt, paramObject, paramArrayOfObject, this);
  }
  
  public Object request(int paramInt, Object paramObject) {
    return request(paramInt, null, paramObject);
  }
  
  public Object request(int paramInt) {
    return request(paramInt, null, null);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\i\PI.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */