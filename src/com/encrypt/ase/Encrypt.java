package com.encrypt.ase;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *
 * @date 2020/2/25
 */
public class Encrypt {

    private static final String KEY = "";
    private static final String IV = "";


    public static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    public static final String ALGORITHM = "AES";

    public static String encrypt(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, new IvParameterSpec(IV.getBytes()));
        byte[] bytes = cipher.doFinal(str.getBytes());
        byte[] bs = Base64.getEncoder().encode(bytes);
        return new String(bs);
    }

    public static void main(String[] args) {
        String testStr = "xxxxxxxxxxxx";
        try {
            String ciphertext = encrypt(testStr);
            System.out.println(ciphertext);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
