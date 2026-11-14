# Java Currency Formatter

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a [double-precision](https://en.wikipedia.org/wiki/Double-precision_floating-point_format) number, $payment$, denoting an amount of money, use the [NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html) class' [getCurrencyInstance](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-) method to convert $payment$ into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

    US: formattedPayment
    India: formattedPayment
    China: formattedPayment
    France: formattedPayment
    
where $formattedPayment$ is $payment$ formatted according to the appropriate [Locale](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)'s currency.

**Note:** India does not have a built-in Locale, so you must [construct one](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#Locale-java.lang.String-java.lang.String-) where the language is `en` (i.e., English).

**Input Format**

A single double-precision number denoting $payment$.

**Constraints**

- $ 0 \le payment \le 10^{9}$

**Output Format**

On the first line, print `US: u` where $u$ is $payment$ formatted for US currency.		
On the second line, print `India: i` where $i$ is $payment$ formatted for Indian currency.		
On the third line, print `China: c` where $c$ is $payment$ formatted for Chinese currency.		
On the fourth line, print `France: f`, where $f$ is $payment$ formatted for French currency.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T10:27:44.867Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/java-currency-formatter/problem)