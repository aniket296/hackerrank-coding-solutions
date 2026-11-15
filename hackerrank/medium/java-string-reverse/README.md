# Java Substring Comparisons

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.  

***
Given a string $A$, print ``Yes`` if it is a palindrome, print ``No`` otherwise. 


**Input Format**

 

**Constraints**

* $A$ will consist at most $50$ lower case english letters.

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T14:16:32.463Z  

```java

public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);
    
    for (int i = 0; i <= s.length() - k; i++) {
        String sub = s.substring(i, i + k);
        
        if (sub.compareTo(smallest) < 0) {
            smallest = sub;
        }
        
        if (sub.compareTo(largest) > 0) {
            largest = sub;
        }
    }
    
    return smallest + "\n" + largest;
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-reverse/problem)