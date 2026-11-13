# Java Loops I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

We use the integers $a$, $b$, and $n$ to create the following series:

$$(a+2^{0} \cdot b), (a+2^{0} \cdot b + 2^{1} \cdot b), \ldots , (a + 2^{0} \cdot b+2^{1} \cdot b + \ldots + 2^{n-1} \cdot b)$$

You are given $q$ queries in the form of $a$, $b$, and $n$. For each query, print the series corresponding to the given $a$, $b$, and $n$ values as a single line of $n$ space-separated integers. 

**Input Format**

The first line contains an integer, $q$, denoting the number of queries. 	
Each line $i$ of the $q$ subsequent lines contains three space-separated integers describing the respective $a_i$, $b_i$, and $n_i$ values for that query. 

**Constraints**

* $0 \le q \le 500$
* $0 \le a, b \le 50$
* $1 \le n \le 15$

**Output Format**

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of $n$ space-separated integers.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T19:01:04.820Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }

        bufferedReader.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-loops/problem)