# Java BigDecimal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, $s$, of $n$ real number strings, sort them in descending order &mdash; but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that $.1$ is printed as $.1$, and $0.1$ is printed as $0.1$. If two numbers represent numerically equivalent values (e.g., $.1 \equiv 0.1$), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array $s$'s elements according to the instructions above.

**Input Format**

The first line consists of a single integer, $n$, denoting the number of integer strings.		
Each line $i$ of the $n$ subsequent lines contains a real number denoting the value of $s_i$.

**Constraints**

* $1 \le n \le 200$ 
* Each $s_i$ has *at most* $300$ digits.


**Output Format**

Locked stub code in the editor will print the contents of array $s$ to stdout. You are only responsible for reordering the array's elements.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T07:53:22.433Z  

```java
import java.math.BigDecimal;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        Arrays.sort(s, new Comparator<String>() {
            public int compare(String str1, String str2) {
                BigDecimal bd1 = new BigDecimal(str1);
                BigDecimal bd2 = new BigDecimal(str2);
                return bd2.compareTo(bd1);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-bigdecimal/problem)