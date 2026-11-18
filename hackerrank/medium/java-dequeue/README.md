# Java Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added  to or removed from either the front (head) or back (tail).

    
Deque interfaces can be implemented using various types of collections such as `LinkedList` or `ArrayDeque` classes. For example, deque can be declared as:

    Deque deque = new LinkedList<>();
    or
    Deque deque = new ArrayDeque<>();
    
You can find more details about Deque [here](http://docs.oracle.com/javase/7/docs/api/java/util/Deque.html).

In this problem, you are given $N$ integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size $M$.

*Note*: Time limit is $3$ second for this problem.


**Input Format**

The first line of input contains two integers $N$ and $M$: representing the total number of integers and the size of the subarray, respectively. The next line contains $N$ space separated integers. 

**Constraints**

$1 \le N \le 100000$<br>
$1 \le M \le 100000$<br>
$M\le N$<br>
The numbers in the array will range between $[0,10000000]$.


**Output Format**

Print the *maximum* number of unique integers among all possible contiguous subarrays of size $M$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T08:03:34.497Z  

```java
import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student student = new Student(id, fname, cgpa);
            studentList.add(student);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                } else if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname());
                } else {
                    return Integer.compare(s1.getId(), s2.getId());
                }
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-dequeue/problem)