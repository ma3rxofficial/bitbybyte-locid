/*     */ package borisplus.j2me.mail;
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
/*     */ public class Smtp
/*     */ {
/*     */   public static final boolean DEBUG = false;
/*     */   private MailSocket mailSocket;
/*     */   
/*     */   public Smtp(String _serverAddress, String _serverPort, String _login, String _password) {
/*  82 */     this.mailSocket = new MailSocket(_serverAddress, _serverPort, _login, _password);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MailSocket getMailSocket() {
/*  91 */     return this.mailSocket;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean connect() throws MailException {
/*     */     try {
/*  99 */       getMailSocket().connect();
/* 100 */       if (!getMailSocket().isOk(getMailSocket().readLine(), "220", "Сервер не отвечает или прервана связь")) {
/* 101 */         disconnect();
/* 102 */         return false;
/*     */       } 
/* 104 */     } catch (MailException mExc) {
/* 105 */       throw mExc;
/*     */     } 
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean authenticate() throws MailException {
/*     */     try {
/* 115 */       getMailSocket().writeCommand("EHLO " + getMailSocket().getLogin().substring(0, getMailSocket().getLogin().indexOf('@', 0)) + "\r\n");
/* 116 */       getMailSocket().isOk(getMailSocket().readAll(), "250", "Сервер не отвечает или прервана связь");
/* 117 */       getMailSocket().writeCommand("AUTH LOGIN \r\n");
/* 118 */       getMailSocket().isOk(getMailSocket().readLine(), "334", "Сервер не отвечает или прервана связь");
/* 119 */       getMailSocket().writeCommand(Base64.encode(getMailSocket().getLogin()) + "\r\n");
/* 120 */       getMailSocket().isOk(getMailSocket().readLine(), "334", "Сервер не отвечает или прервана связь");
/* 121 */       getMailSocket().writeCommand(Base64.encode(getMailSocket().getPassword()) + "\r\n");
/* 122 */       getMailSocket().isOk(getMailSocket().readLine(), "235", "Сервер не отвечает или прервана связь");
/* 123 */     } catch (MailException mExc) {
/* 124 */       throw mExc;
/*     */     } 
/* 126 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void disconnect() {
/* 132 */     getMailSocket().disconnect();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean send(Message message) throws MailException {
/*     */     try {
/* 142 */       String command = "";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 147 */       if (getMailSocket().getLogin() != null && getMailSocket().getLogin().length() != 0) {
/* 148 */         command = "MAIL FROM: <" + getMailSocket().getLogin() + ">" + "\r\n";
/*     */       } else {
/* 150 */         command = "MAIL FROM: < > \r\n";
/* 151 */       }  getMailSocket().writeCommand(command);
/*     */       
/* 153 */       getMailSocket().isOk(getMailSocket().readLine(), "250", "Ошибка отправки (MAIL FROM)");
/*     */ 
/*     */       
/* 156 */       command = "";
/* 157 */       for (int i = 0; i < message.getAddresses().size(); i++) {
/* 158 */         command = command + "RCPT TO: <" + message.getAddresses().elementAt(i) + ">" + "\r\n";
/*     */       }
/* 160 */       getMailSocket().writeCommand(command);
/*     */       
/* 162 */       getMailSocket().isOk(getMailSocket().readAll(), "250", "Ошибка отправки (RCPT)");
/*     */ 
/*     */ 
/*     */       
/* 166 */       getMailSocket().writeCommand("DATA\r\n");
/*     */       
/* 168 */       getMailSocket().isOk(getMailSocket().readLine(), "354", "Ошибка формирвания содержания письма (DATA)");
/*     */ 
/*     */ 
/*     */       
/* 172 */       message.setFrom(getMailSocket().getLogin());
/*     */       
/* 174 */       getMailSocket().writeCommand(message.toSmtpData());
/*     */ 
/*     */       
/* 177 */       getMailSocket().isOk(getMailSocket().readLine(), "250", "Ошибка окончания письма ('.')");
/* 178 */     } catch (MailException mExc) {
/* 179 */       throw mExc;
/*     */     } 
/* 181 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean deauthenticate() throws MailException {
/*     */     try {
/* 189 */       getMailSocket().writeCommand("QUIT\r\n");
/*     */       
/* 191 */       getMailSocket().isOk(getMailSocket().readLine(), "221", "Ошибка закрытия соединения (QUIT)");
/* 192 */     } catch (MailException mExc) {
/* 193 */       throw mExc;
/*     */     } 
/* 195 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Desktop\kemulator\LocID_BitByByte.jar!\borisplus\j2me\mail\Smtp.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */