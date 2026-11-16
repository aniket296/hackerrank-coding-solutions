import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextLine()) {
            System.out.println(0);
            scan.close();
            return;
        }
        String s = scan.nextLine().trim();
        
        if (s.isEmpty()) {
            System.out.println(0);
            scan.close();
            return;
        }
        
        String[] tokens = s.split("[\\s!,?._'@]+");
        
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        
        scan.close();
    }
}
