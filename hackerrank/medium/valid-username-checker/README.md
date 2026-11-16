# Java Regex 2 - Duplicate Words

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

- The username consists of $8$ to $30$ characters inclusive. If the username consists of less than $8$ or greater than $30$ characters, then it is an invalid username.
- The username can only contain alphanumeric characters and underscores (`_`). Alphanumeric characters describe the character set consisting of *lowercase* characters $[a-z]$, *uppercase* characters $[A-Z]$, and digits $[0-9]$.
- The *first* character of the username must be an *alphabetic* character, i.e., either *lowercase* character $[a-z]$ or *uppercase* character $[A-Z]$.

For example:


| Username | Validity 
|:-------:|:---:|
| $\color{red}\texttt{Julia}$| INVALID; Username length < 8 characters  |  
|  $\color{green}\texttt{Samantha}$  | VALID | 
| $\color{green}\texttt{Samantha_21}$     | VALID | 
| $\color{red}\texttt{1}\color{black}\texttt{Samantha}$| INVALID; Username begins with non-alphabetic character | 
| $\color{black}\texttt{Samantha}\color{red}\texttt{?}\color{black}\texttt{10_2A}$ | INVALID; '?' character not allowed  | 


Update the value of *regularExpression* field in the *UsernameValidator* class so that the regular expression only matches with valid usernames. 

**Input Format**

The first line of input contains an integer $n$, describing the total number of usernames. Each of the next $n$ lines contains a string describing the username. The locked stub code reads the inputs and validates the username.

**Constraints**

- $1 \le n \le 100$
- The username consists of any printable characters.

**Output Format**

For each of the usernames, the locked stub code prints `Valid` if the username is valid; otherwise `Invalid` each on a new line.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T18:28:01.532Z  

```java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/valid-username-checker/problem)