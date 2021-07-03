//package com.encrypt.ase;
//
//import javax.crypto.Cipher;
//import javax.crypto.spec.IvParameterSpec;
//import javax.crypto.spec.SecretKeySpec;
//
//import java.util.Base64;
//
///**
// *
// */
//public class Decrypt {
//
//    private static final String KEY = "";
//    private static final String IV = "";
//
//
//    public static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
//    public static final String ALGORITHM = "AES";
//
//    public static void main(String[] args) throws Exception{
//        String string = decode("");
//        System.out.println(string);
//    }
//
//    private static String decode(String encodeStr) throws Exception {
//        byte[] decode = Base64.getDecoder().decode(encodeStr);
//        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
//        SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
//        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, new IvParameterSpec(IV.getBytes()));
//        return new String(cipher.doFinal(decode));
//    }
//}
