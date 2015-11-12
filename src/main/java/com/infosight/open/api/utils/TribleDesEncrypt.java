/*    */ package com.infosight.open.api.utils;
/*    */ 
/*    */ import java.security.Key;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESedeKeySpec;
/*    */ import sun.misc.BASE64Decoder;
/*    */ import sun.misc.BASE64Encoder;
/*    */ 
/*    */ public class TribleDesEncrypt
/*    */ {
/*    */   public String encrpt(String deskey, String encryptData)
/*    */     throws Exception
/*    */   {
/* 15 */     if (deskey == null) {
/* 16 */       throw new Exception("deskey is null");
/*    */     }
/* 18 */     if (encryptData == null) {
/* 19 */       throw new Exception("encryptData is null");
/*    */     }
/*    */ 
/* 22 */     String encoded = encryptMode(deskey, encryptData);
/* 23 */     return encoded;
/*    */   }
/*    */ 
/*    */   public static String encryptMode(String skey, String sdata) throws Exception {
/* 27 */     byte[] key = new BASE64Decoder().decodeBuffer(skey);
/* 28 */     byte[] data = sdata.getBytes("UTF-8");
/*    */ 
/* 30 */     Key deskey = null;
/* 31 */     DESedeKeySpec spec = new DESedeKeySpec(key);
/* 32 */     SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
/* 33 */     deskey = keyfactory.generateSecret(spec);
/*    */ 
/* 35 */     Cipher cipher = Cipher.getInstance("desede/ECB/PKCS5Padding");
/*    */ 
/* 37 */     cipher.init(1, deskey);
/* 38 */     byte[] bOut = cipher.doFinal(data);
/*    */ 
/* 40 */     return new BASE64Encoder().encode(bOut);
/*    */   }
/*    */ }

/* Location:           C:\Users\Administrator\Desktop\shanqb-sdk-1.0.jar
 * Qualified Name:     com.infosight.open.api.utils.TribleDesEncrypt
 * JD-Core Version:    0.6.0
 */