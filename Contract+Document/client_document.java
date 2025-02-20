import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class client {


    public static void main(String[] args) {
        contractBuilder contract = new concreteBuilder()
            .buildContractId("abcd")
            .buildPropertyId("1234")
            .buildTenantId("xyz")
            .buildRentAmount(10000);
        
        try {
            SecretKey key = generateKey();
    
            String info = contract.signLongTerm().toString();
            
            String encryptedMessage = encrypt(info, key);
            System.out.println("Chuoi sau khi ma hoa: " + encryptedMessage);
    
            String decryptedMessage = decrypt(encryptedMessage, key);
            System.out.println("Chuoi goc: " + decryptedMessage);
    
            } catch (Exception e) {
                e.printStackTrace();
            }



    }

     private static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);  
        return keyGen.generateKey();
    }

    // Ma hoa chuoi bang AES, tra ve chuoi ma hoa bieu dien duoi dinh dang Base64 (De doc)
    // Truyen vao chuoi + key
    public static String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes); 
    }

    // Giai ma de Test thu xem ma hoa dung khong\
    // Truyen vao chuoi da ma hoa (Base64, tra ve chuoi ban dau)
    public static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }
}
