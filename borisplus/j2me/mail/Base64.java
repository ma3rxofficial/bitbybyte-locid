/*    */ package borisplus.j2me.mail;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Base64
/*    */ {
/*    */   public static String encode(String input_string) {
/* 18 */     StringBuffer output = new StringBuffer();
/* 19 */     byte[] enc = new byte[64];
/* 20 */     int i = 0, j = 0;
/*    */     
/* 22 */     int length = input_string.length();
/*    */     
/* 24 */     while (i < 26) { enc[i] = (byte)(65 + j++); i++; }  j = 0;
/* 25 */     while (i < 52) { enc[i] = (byte)(97 + j++); i++; }  j = 0;
/* 26 */     while (i < 62) { enc[i] = (byte)(48 + j++); i++; }
/* 27 */      enc[i++] = 43;
/* 28 */     enc[i++] = 47;
/*    */     
/* 30 */     i = 0;
/* 31 */     while (i < length - 2) {
/* 32 */       int s0 = input_string.charAt(i++);
/* 33 */       int s1 = input_string.charAt(i++);
/* 34 */       int s2 = input_string.charAt(i++);
/*    */       
/* 36 */       output.append((char)enc[s0 >> 2 & 0x3F]);
/* 37 */       output.append((char)enc[(s0 << 4 | s1 >> 4) & 0x3F]);
/* 38 */       output.append((char)enc[(s1 << 2 | s2 >> 6) & 0x3F]);
/* 39 */       output.append((char)enc[s2 & 0x3F]);
/*    */     } 
/* 41 */     if (length - i == 1) {
/* 42 */       int s0 = input_string.charAt(i++);
/* 43 */       output.append((char)enc[s0 >> 2 & 0x3F]);
/* 44 */       output.append((char)enc[s0 << 4 & 0x3F]);
/* 45 */       output.append('=');
/* 46 */       output.append('=');
/* 47 */     } else if (length - i == 2) {
/* 48 */       int s0 = input_string.charAt(i++);
/* 49 */       int s1 = input_string.charAt(i++);
/* 50 */       output.append((char)enc[s0 >> 2 & 0x3F]);
/* 51 */       output.append((char)enc[(s0 << 4 | s1 >> 4) & 0x3F]);
/* 52 */       output.append((char)enc[s1 << 2 & 0x3F]);
/* 53 */       output.append('=');
/*    */     } 
/* 55 */     return output.toString();
/*    */   }
/*    */ }


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\borisplus\j2me\mail\Base64.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */