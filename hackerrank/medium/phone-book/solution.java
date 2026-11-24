import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String queryType = sc.next();
            if ("Insert".equals(queryType)) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if ("Delete".equals(queryType)) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        sc.close();

        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
