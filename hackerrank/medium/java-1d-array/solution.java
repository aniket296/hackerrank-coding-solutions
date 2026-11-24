import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<Integer>(d);
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            lines.add(row);
        }

        int q = sc.nextInt();

        for (int k = 0; k < q; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x >= 1 && x <= lines.size()) {
                ArrayList<Integer> row = lines.get(x - 1);
                if (y >= 1 && y <= row.size()) {
                    System.out.println(row.get(y - 1));
                    continue;
                }
            }
            System.out.println("ERROR!");
        }

        sc.close();
    }
}
