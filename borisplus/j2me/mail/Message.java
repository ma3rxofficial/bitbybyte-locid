/*     */ package borisplus.j2me.mail;
/*     */ 
/*     */ import java.util.Date;
/*     */ import java.util.Vector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Message
/*     */ {
/*     */   public static final String CRLF = "\r\n";
/*     */   public static final String CONTYPE_TEXT_PLAIN = "text/plain";
/*     */   public static final String CONTYPE_TEXT_HTML = "text/html";
/*     */   public static final String CONTYPE_AUDIO_MIDI = "audio/midi";
/*     */   public static final String CHARSET_KOI8_R = "koi8-r";
/*     */   public static final String CHARSET_WINDOWS_1251 = "windows-1251";
/*     */   public static final String CHARSET_UTF_8 = "utf-8";
/*     */   public static final String CTE_BASE64 = "base64";
/*     */   public static final String CTE_QUOTED_PRINTABLE = "quoted-printable";
/*     */   public static final String CTE_7BIT = "7bit";
/*     */   public static final String CTE_8BIT = "8bit";
/*     */   public static final String CTE_BINARY = "binary";
/*     */   private static final boolean DEBUG = true;
/*     */   private String subject;
/*     */   private String from;
/*     */   private Vector addressesVector;
/*     */   private String header;
/*     */   private String replyTo;
/*     */   private String contentType;
/*     */   private String charset;
/*     */   private String contentTransferEncoding;
/*     */   private String xMailer;
/*     */   private Date date;
/*     */   private String body;
/*     */   
/*     */   public Message() {
/* 126 */     this.subject = "";
/* 127 */     this.from = "";
/* 128 */     this.addressesVector = new Vector();
/*     */     
/* 130 */     this.header = "";
/* 131 */     this.replyTo = "";
/* 132 */     this.contentType = "text/html";
/* 133 */     this.charset = "koi8-r";
/* 134 */     this.contentTransferEncoding = "binary";
/* 135 */     this.xMailer = "BorisPlusMailer";
/* 136 */     this.date = new Date();
/* 137 */     this.body = "";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Message(String _subject, String _from, Vector _addressesVector, String _header, String _replyTo, String _contentType, String _charset, String _contentTransferEncoding, String _xMailer, Date _date, String _body) {
/* 176 */     this.subject = _subject;
/* 177 */     this.from = _from;
/* 178 */     this.addressesVector = _addressesVector;
/* 179 */     this.header = _header;
/* 180 */     this.replyTo = _replyTo;
/* 181 */     this.contentType = _contentType;
/* 182 */     this.charset = _charset;
/* 183 */     this.contentTransferEncoding = _contentTransferEncoding;
/* 184 */     this.xMailer = "BorisPlusMailer";
/* 185 */     this.date = new Date();
/* 186 */     this.body = _body;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSubject() {
/* 192 */     return this.subject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSubject(String _subject) {
/* 200 */     this.subject = _subject;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFrom() {
/* 206 */     return this.from;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrom(String _from) {
/* 214 */     this.from = _from;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addAddress(String _address) {
/* 229 */     getAddresses().addElement(_address);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void deleteAddress(int _index) {
/* 237 */     if (0 < _index && _index <= getAddresses().size())
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 247 */       getAddresses().removeElementAt(_index);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean deleteAddress(String _address) {
/* 259 */     return getAddresses().removeElement(_address);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Vector getAddresses() {
/* 265 */     return this.addressesVector;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getHeader() {
/* 271 */     return this.header;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHeader(String _header) {
/* 281 */     this.header = _header;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getReplyTo() {
/* 287 */     return this.replyTo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReplyTo(String _replyTo) {
/* 295 */     this.replyTo = _replyTo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getContentType() {
/* 301 */     return this.contentType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContentType(String _contentType) {
/* 310 */     this.contentType = _contentType;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCharset() {
/* 316 */     return this.charset;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCharset(String _charset) {
/* 325 */     this.charset = _charset;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getContentTransferEncoding() {
/* 331 */     return this.contentTransferEncoding;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContentTransferEncoding(String _contentTransferEncoding) {
/* 345 */     this.contentTransferEncoding = _contentTransferEncoding;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getXMailer() {
/* 351 */     return this.xMailer;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDate() {
/* 357 */     return this.date;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDate(Date _date) {
/* 365 */     this.date = _date;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getBody() {
/* 371 */     return this.body;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBody(String _body) {
/* 379 */     this.body = _body;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addToBody(String _addToBody) {
/* 387 */     this.body += _addToBody;
/*     */   }
/*     */   public String toSmtpData() {
/* 390 */     String result = "";
/* 391 */     result = result + "Subject: " + ((getSubject().length() != 0) ? getSubject() : " ") + "\r\n";
/* 392 */     if (getFrom() != null && getFrom().length() != 0) {
/* 393 */       result = result + "From: " + getFrom() + "\r\n";
/*     */     }
/* 395 */     for (int i = 0; i < getAddresses().size(); i++) {
/* 396 */       result = result + "To:" + getAddresses().elementAt(i) + "\r\n";
/*     */     }
/* 398 */     if (getHeader() != null && getHeader().length() != 0) {
/* 399 */       result = result + getHeader();
/*     */     }
/* 401 */     if (getReplyTo() != null && getReplyTo().length() != 0) {
/* 402 */       result = result + "Reply-To: " + getReplyTo() + "\r\n";
/*     */     }
/* 404 */     if (getContentType() != null && getContentType().length() != 0 && getCharset() != null && getCharset().length() != 0)
/*     */     {
/* 406 */       result = result + "Content-Type: " + getReplyTo() + "; charset=" + getCharset() + "\r\n";
/*     */     }
/* 408 */     if (getContentTransferEncoding() != null && getContentTransferEncoding().length() != 0) {
/* 409 */       result = result + "Content-Transfer-Encoding: " + getContentTransferEncoding() + "\r\n";
/*     */     }
/* 411 */     if (getXMailer() != null && getXMailer().length() != 0) {
/* 412 */       result = result + "X-Mailer: " + getXMailer() + "\r\n";
/*     */     }
/* 414 */     if (getDate() != null) {
/* 415 */       result = result + "Date: " + getDate() + "\r\n";
/*     */     }
/* 417 */     if (getBody() != null && getBody().length() != 0) {
/* 418 */       result = result + getBody() + "\r\n";
/*     */     }
/* 420 */     result = result + "\r\n.\r\n";
/* 421 */     return result;
/*     */   }
/*     */ }


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\borisplus\j2me\mail\Message.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */