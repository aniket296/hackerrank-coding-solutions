# Java BigDecimal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A prime number is a natural number greater than $1$ whose only positive divisors are $1$ and itself. For example, the first six prime numbers are $2$, $3$, $5$, $7$, $11$, and $13$.

Given a large integer, $n$, use the Java *BigInteger* class' [*isProbablePrime*](https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29) method to determine and print whether it's ``prime`` or  ``not prime``.

**Input Format**

A single line containing an integer, $n$ (the number to be checked).

**Constraints**

* $n$ contains at most $100$ digits.

**Constraints**

 

**Output Format**

If $n$ is a prime number, print ``prime``; otherwise, print ``not prime``.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T07:53:35.138Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/java-primality-test/problem)