## Array Data Analysis Application

## Project Overview

This Java console application demonstrates fundamental array operations, manual sorting, multi-dimensional array handling, and exception management. It fulfills all requirements outlined in the task specification, including data analysis, manual sorting without built-in methods, and proper error handling.

---
## Features Implemented
1. Single-Dimensional Array Operations
    . Accepts user input for array elements

    . Calculates: Sum, Average, Maximum, Minimum

    . Implements manual Bubble Sort (no built-in methods)

    . Displays formatted results

2. Multi-Dimensional Array Demonstration
    . Predefined 2D array (matrix) initialization

    . Nested loop traversal and display

3. Exception Handling
    . Catches ArrayIndexOutOfBoundsException

    . Demonstrates both valid and invalid array access

4. Efficient Loop Usage
    . Optimized traversal for calculations and sorting

    . Clean separation of concerns in logic

---
## How to Run
**Prerequisites**
   
. Java JDK 8 or higher

. Terminal or Command Prompt

**Compilation & Execution**
```
javac Array.java
java Array
```

---
## Sample Output
```
Enter number of elements: 
5
Enter elements: 
2 5 1 7 4

----- Data Analysis Result -----
Sum : 19
Average : 3.8
Max : 7
Min : 1
Sorted Array: 1 2 4 5 7

----- 2D Array -----
1 2 3
4 5 6

Accessing invalid index:
Exception caught: Array index out of bounds
```

---
## Technical Highlights:
. Manual sorting algorithm (Bubble Sort)

. Exception handling best practices

. Clean, commented code for readability

. Formatted console output

---
## Notes
. The program uses only core Java libraries

. All logic is implemented manually without relying on built-in sorting/analysis methods

. Code includes explanatory comments for educational clarity

. Exception demonstration is intentionally triggered for learning purposes
