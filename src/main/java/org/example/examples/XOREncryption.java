package org.example.examples;

public class XOREncryption {
    public static void main(String[] args) {

        String message = "Hello World!";
        int key = 0xAA; // 170 in decimal
        StringBuilder encryptedString = new StringBuilder();

        for (int i =0 ; i< message.length() ; i++) {
            encryptedString.append((char) (message.charAt(i) ^ key));
        }
        System.out.println(encryptedString);
    }
}
