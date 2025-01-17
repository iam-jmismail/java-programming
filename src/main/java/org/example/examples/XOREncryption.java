package org.example.examples;

import java.util.Base64;

public class XOREncryption {
    public static void main(String[] args) {

        String message = "Hello World!";
//        int key = 0xAA; // 170 in decimal
        int key = 1024; // 170 in decimal

        // Encrypting
        StringBuilder encryptedString = new StringBuilder();

        for (int i =0 ; i< message.length() ; i++) {
            encryptedString.append((char) (message.charAt(i) ^ key));
        }

        // String to Bytes
        byte[] encryptedBytes = encryptedString.toString().getBytes();

        // Encode Bytes to Base 64
        String base64Encoded = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println(base64Encoded);

        // Decrypting

        // Decode base64 back to Bytes array
        byte[] decodedBytes = Base64.getDecoder().decode(base64Encoded);

        // Convert Bytes back to String
        String decodedEncryptedString = new String(decodedBytes);

        // Decrypt
        StringBuilder decryptedString = new StringBuilder();
        for (int i = 0; i < decodedEncryptedString.length(); i++) {
            decryptedString.append((char) (decodedEncryptedString.charAt(i) ^ key));
        }

        System.out.println("Decrypted Message: " + decryptedString);


    }
}
