/*    */ package com.infosight.open.api.utils;
/*    */ 
/*    */ import java.security.Key;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESedeKeySpec;
/*    */ import sun.misc.BASE64Decoder;
/*    */ 
/*    */ public class TribleDesDecrypt
/*    */ {
/*    */   public String decrypt(String deskey, String decryptData)
/*    */     throws Exception
/*    */   {
/* 15 */     if (deskey == null) {
/* 16 */       throw new Exception("deskey is null");
/*    */     }
/* 18 */     if (decryptData == null) {
/* 19 */       throw new Exception("decryptData is null");
/*    */     }
/*    */ 
/* 22 */     String decoded = decryptMode(deskey, decryptData);
/* 23 */     return decoded;
/*    */   }
/*    */ 
/*    */   public static String decryptMode(String skey, String sdata) throws Exception
/*    */   {
/* 28 */     byte[] key = new BASE64Decoder().decodeBuffer(skey);
/* 29 */     byte[] data = new BASE64Decoder().decodeBuffer(sdata);
/*    */ 
/* 31 */     Key deskey = null;
/* 32 */     DESedeKeySpec spec = new DESedeKeySpec(key);
/* 33 */     SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
/* 34 */     deskey = keyfactory.generateSecret(spec);
/* 35 */     Cipher cipher = Cipher.getInstance("desede/ECB/PKCS5Padding");
/* 36 */     cipher.init(2, deskey);
/* 37 */     byte[] bOut = cipher.doFinal(data);
/* 38 */     return new String(bOut, "UTF-8");
/*    */   }
/*    */ }

/* Location:           C:\Users\Administrator\Desktop\shanqb-sdk-1.0.jar
 * Qualified Name:     com.infosight.open.api.utils.TribleDesDecrypt
 * JD-Core Version:    0.6.0
 */