# Java Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

We define the following:

- A *subarray* of an $n$-element array is an array composed from a contiguous block of the original array's elements. For example, if $array = [1, 2, 3]$, then the subarrays are $[1]$, $[2]$, $[3]$, $[1, 2]$, $[2, 3]$, and $[1, 2, 3]$. Something like $[1, 3]$ would *not* be a subarray as it's not a contiguous subsection of the original array.
- The *sum* of an array is the total sum of its elements.
	- An array's sum is *negative* if the total sum of its elements is negative.
    - An array's sum is *positive* if the total sum of its elements is positive.

Given an array of $n$ integers, find and print its number of *negative subarrays* on a new line.

**Input Format**

The first line contains a single integer, $n$, denoting the length of array $A = [a_0, a_1, \ldots, a_{n - 1}]$.	
The second line contains $n$ space-separated integers describing each respective element, $a_i$, in array $A$. 

**Constraints**

- $1 \le n \le 100$
- $-10^4 \le a_i \le 10^4$

**Output Format**

Print the number of subarrays of $A$ having negative sums.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T10:55:05.017Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int negativeCount = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    negativeCount++;
                }
            }
        }

        System.out.println(negativeCount);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-negative-subarray/problem)