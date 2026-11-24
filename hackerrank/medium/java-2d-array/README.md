# Java 1D Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a $6*6$ 2D array. An hourglass in an array is a portion shaped like this:

    a b c
      d
    e f g

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

    1 1 1     1 1 0     1 0 0
      1         0         0
    1 1 1     1 1 0     1 0 0

The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to *print the largest sum among all the hourglasses* in the array.

**Input Format**

There will be exactly $6$ lines, each containing $6$ integers seperated by spaces. Each integer will be between $-9$ and $9$ inclusive.

**Constraints**

 

**Output Format**

Print the answer to this problem on a single line.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T10:51:20.076Z  

```java

        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-2d-array/problem)