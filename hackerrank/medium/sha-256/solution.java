import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            byte[] hashBytes = md.digest(s.getBytes("UTF-8"));
            
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            
            System.out.println(hexString.toString());
            
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
