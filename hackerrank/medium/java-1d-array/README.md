# Java Arraylist

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Let's play a game on an array! You're standing at index $0$ of an $n$-element array named $game$. From some index $i$ (where $0 \le i \lt n$), you can perform one of the following moves:

* *Move Backward:* If cell $i - 1$ exists *and* contains a $0$, you can walk back to cell $i - 1$.
* *Move Forward:* 
	- If cell $i + 1$ contains a zero, you can walk to cell $i + 1$.
    - If cell $i + leap$ contains a zero, you can jump to cell $i + leap$.
    - If you're standing in cell $n - 1$ or the value of $i + leap \ge n$, you can walk or jump off the end of the array and win the game.

In other words, you can move from index $i$ to index $i+1$, $i-1$, or $i + leap$ as long as the destination index is a cell containing a $0$. If the destination index is greater than $n-1$, you win the game.

**Function Description**   

Complete the *canWin* function in the editor below.   

*canWin* has the following parameters:   

- *int leap:* the size of the leap   
- *int game[n]:* the array to traverse   

**Returns**   

- *boolean:* true if the game can be won, otherwise false   

**Input Format**

The first line contains an integer, $q$, denoting the number of queries (i.e., function calls). 	
The $2 \cdot q$ subsequent lines describe each query over two lines:

1. The first line contains two space-separated integers describing the respective values of $n$ and $leap$.
2. The second line contains $n$ space-separated binary integers (i.e., zeroes and ones) describing the respective values of $game_0, game_1, \ldots, game_{n-1}$.

**Constraints**

* $1 \le q \le 5000$
* $2 \le n \le 100$
* $0 \le leap \le 100$
* It is guaranteed that the value of $game[0]$ is always $0$.

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T10:56:48.450Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-1d-array/problem)