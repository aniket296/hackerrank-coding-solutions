# Java Stdin and Stdout II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Java's *System.out.printf* function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using *printf*.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

**Input Format**

Every line of input will contain a *String* followed by an *integer*.		
Each *String* will have a maximum of $10$ alphabetic characters, and each *integer* will be in the inclusive range from $0$ to $999$.

**Output Format**

In each line of output there should be two columns:		
The first column contains the *String* and is left justified using exactly $15$ characters. 	
The second column contains the *integer*, expressed in exactly $3$ digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T19:18:02.557Z  

```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        
        scan.nextLine();
        
        String s = scan.nextLine();
        
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-output-formatting/problem)