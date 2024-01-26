public final class ey {
  public long a;
  
  private int b;
  
  public ey(boolean paramBoolean1, long paramLong, int paramInt, boolean paramBoolean2) {
    this.a = paramLong;
    this.b = paramInt & 0xFFFFFF | (paramBoolean2 ? 134217728 : 0) | (paramBoolean1 ? 67108864 : 0);
  }
  
  public final boolean a() {
    return ((this.b & 0x4000000) != 0);
  }
  
  public final int b() {
    return this.b & 0xFFFFFF;
  }
  
  public final boolean c() {
    return ((this.b & 0x8000000) != 0);
  }
}


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\ey.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */