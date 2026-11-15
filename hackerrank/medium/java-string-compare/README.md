# Java Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

We define the following terms:

- [Lexicographical Order](https://en.wikipedia.org/wiki/Lexicographical_order), also known as *alphabetic* or *dictionary* order, orders characters as follows:		
	$$\texttt{A} \lt \texttt{B} \lt \ldots \lt \texttt{Y} \lt \texttt{Z} \lt \texttt{a} \lt \texttt{b} \lt \ldots \lt \texttt{y} \lt \texttt{z}$$ 
    
    For example, `ball < cat`, `dog < dorm`, `Happy < happy`, `Zoo < ball`.
- A [substring](https://en.wikipedia.org/wiki/Substring) of a string is a contiguous block of characters in the string. For example, the substrings of `abc` are `a`, `b`, `c`, `ab`, `bc`, and `abc`.

Given a string, $s$, and an integer, $k$, complete the function so that it finds the lexicographically *smallest* and *largest* substrings of length $k$.   

**Function Description**   

Complete the *getSmallestAndLargest* function in the editor below.   

*getSmallestAndLargest* has the following parameters:   

- *string s:* a string  
- *int k:* the length of the substrings to find   

**Returns**  

- *string:* the string '<smallest> + "\n" + <largest>' where <smallest> and <largest> are the two substrings   

**Input Format**

The first line contains a string denoting $s$.		
The second line contains an integer denoting $k$.

**Constraints**

- $1 \le |s| \le 1000$
- $s$ consists of English alphabetic letters only (i.e., `[a-zA-Z]`).

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T14:13:09.937Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start, end));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-compare/problem)