# Java Currency Formatter

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The Java *instanceof* operator is used to test if the object or instance is an instanceof the specified type.

In this problem we have given you three classes in the editor:

* Student class
* Rockstar class 
* Hacker class 

In the main method, we populated an *ArrayList* with several instances of these classes. *count* method calculates how many instances of each type is present in the ArrayList. The code prints three integers, the number of instance of Student class, the number of instance of Rockstar class, the number of instance of Hacker class.


But some lines of the code are missing, and you have to fix it by modifying only $3$ lines! Don't add, delete or modify any extra line. 

To restore the original code in the editor, click on the top left icon in the editor and create a new buffer.

**Sample Input**

    5
    Student
    Student
    Rockstar
    Student
    Hacker

**Sample Output**

    3 1 1

**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T10:28:00.710Z  

```java

import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        // US
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // India
        DecimalFormat india = (DecimalFormat)
            NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        DecimalFormatSymbols indiaSymbols = india.getDecimalFormatSymbols();
        indiaSymbols.setCurrencySymbol("Rs.");
        india.setDecimalFormatSymbols(indiaSymbols);

        // China
        DecimalFormat china = (DecimalFormat)
            NumberFormat.getCurrencyInstance(Locale.CHINA);

        DecimalFormatSymbols chinaSymbols = china.getDecimalFormatSymbols();
        chinaSymbols.setCurrencySymbol("\uFFE5");
        china.setDecimalFormatSymbols(chinaSymbols);

        // France
        DecimalFormat france = (DecimalFormat)
            NumberFormat.getCurrencyInstance(Locale.FRANCE);

        france.applyPattern("#,##0.00 \u00A4");

        String franceFormatted = france.format(payment);

        // Replace narrow non-breaking space with non-breaking space
        franceFormatted = franceFormatted.replace('\u202F', '\u00A0');

        // Print results
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + franceFormatted);

        sc.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-instanceof-keyword/problem)