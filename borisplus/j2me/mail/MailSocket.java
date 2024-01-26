/*     */ package borisplus.j2me.mail;
/*     */ 
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.StreamConnection;
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
/*     */ public class MailSocket
/*     */ {
/*     */   private static final boolean DEBUG = false;
/*     */   public static final String CRLF = "\r\n";
/*     */   private String serverAddress;
/*     */   private String serverPort;
/*     */   private String login;
/*     */   private String password;
/*     */   private StreamConnection connection;
/*     */   private DataInputStream in;
/*     */   private DataOutputStream out;
/*     */   private String error;
/*     */   
/*     */   public MailSocket(String _serverAddress, String _serverPort, String _login, String _password) {
/*  83 */     this.serverAddress = _serverAddress;
/*  84 */     this.serverPort = _serverPort;
/*  85 */     this.login = _login;
/*  86 */     this.password = _password;
/*  87 */     this.connection = null;
/*  88 */     this.in = null;
/*  89 */     this.out = null;
/*  90 */     this.error = "";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getError() {
/*  96 */     return this.error;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getServerAddress() {
/* 102 */     return this.serverAddress;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setServerAddress(String _serverAddress) {
/* 110 */     this.serverAddress = _serverAddress;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getServerPort() {
/* 116 */     return this.serverPort;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setServerPort(String _serverPort) {
/* 124 */     this.serverPort = _serverPort;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLogin() {
/* 130 */     return this.login;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLogin(String _login) {
/* 139 */     this.login = _login;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPassword() {
/* 145 */     return this.password;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPassword(String _password) {
/* 153 */     this.password = _password;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public DataInputStream getInput() {
/* 159 */     return this.in;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInput(DataInputStream _in) {
/* 167 */     this.in = _in;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public DataOutputStream getOutput() {
/* 173 */     return this.out;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOutput(DataOutputStream _out) {
/* 181 */     this.out = _out;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public StreamConnection getStreamConnection() {
/* 187 */     return this.connection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStreamConnection(StreamConnection _connection) {
/* 195 */     this.connection = _connection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void connect() throws MailException {
/*     */     try {
/* 205 */       setStreamConnection((StreamConnection)Connector.open("socket://" + getServerAddress() + ":" + getServerPort(), 3));
/* 206 */       setInput(getStreamConnection().openDataInputStream());
/* 207 */       setOutput(getStreamConnection().openDataOutputStream());
/* 208 */     } catch (IOException exc) {
/* 209 */       throw new MailException("Connect MailSocet IOException");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void disconnect() {
/* 217 */     if (getInput() != null)
/* 218 */       try { getInput().close(); } catch (IOException ex) {} 
/* 219 */     if (getOutput() != null)
/* 220 */       try { getOutput().close(); } catch (IOException ex) {} 
/* 221 */     if (getStreamConnection() != null)
/* 222 */       try { getStreamConnection().close(); } catch (IOException ex) {} 
/* 223 */     setInput(null);
/* 224 */     setOutput(null);
/* 225 */     setStreamConnection(null);
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
/*     */   public void writeCommand(String command) throws MailException {
/*     */     try {
/* 291 */       byte[] b = command.getBytes();
/* 292 */       getOutput().write(b, 0, b.length);
/* 293 */       getOutput().flush();
/* 294 */     } catch (IOException exc) {
/*     */       
/* 296 */       throw new MailException("WriteCommand MailSocet IOException");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String readLine() throws MailException {
/* 303 */     StringBuffer buffer = new StringBuffer();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 308 */       byte[] ch = new byte[1];
/* 309 */       getInput().read(ch);
/* 310 */       while (ch[0] != 13) {
/* 311 */         buffer.append(new String(ch));
/* 312 */         getInput().read(ch);
/*     */       } 
/* 314 */       getInput().read(ch);
/*     */     }
/* 316 */     catch (IOException exc) {
/* 317 */       throw new MailException("WriteCommand MailSocet IOException");
/*     */     } 
/* 319 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String readAll() throws MailException {
/* 325 */     StringBuffer buffer = new StringBuffer();
/*     */     try {
/* 327 */       int c = 0;
/* 328 */       while ((c = getInput().read()) != -1 && getInput().available() > 0) {
/* 329 */         buffer.append((char)c);
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 337 */     catch (IOException exc) {
/* 338 */       throw new MailException("WriteCommand MailSocet IOException");
/*     */     } 
/* 340 */     return buffer.toString();
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
/*     */   public boolean isOk(String serverMessage, String ok, String message) throws MailException {
/* 353 */     if (serverMessage == null || !serverMessage.trim().startsWith(ok)) {
/* 354 */       this.error = message + ":'" + serverMessage + "'";
/* 355 */       throw new MailException(this.error);
/*     */     } 
/* 357 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\borisplus\j2me\mail\MailSocket.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */