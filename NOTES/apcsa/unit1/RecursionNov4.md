## Warm-up: Create a stack diagram

```java
public static int sumInts(int start) {
    // Base case
    if (start == 0)
        return 0;
    
    else return start + sumInts(start - 1);
}
```

#### **The Stack**
```java
sumInts(6);
```

```
Calls                                     End of Execution
|     [ sumInts(6); -> 21 = 6 + sumInts(5) ]   ^
|     [ sumInts(5); -> 15 = 5 + sumInts(4) ]   |
|     [ sumInts(4); -> 10 = 4 + sumInts(3) ]   |
|     [ sumInts(3); -> 6 = 3 + sumInts(2) ]    |
|     [ sumInts(2); -> 3 = 2 + sumInts(1) ]    |
|     [ sumInts(1); -> 1 = 1 + sumInts(0) ]    |
|     [ sumInts(0); -> 0 = 0 ]                 |
v                                              |
```

## Recursive Method Examples

**Factorial**: Product of a givem integer multiplied by all of the previous Integers up to and including 1.

- `5!` -> `5 * 4 * 3 * 2 * 1` -> `5 * 4!`
- `4!` -> `4 * 3 * 2 * 1` -> `4 * 3!`
- `3!` -> `3 * 2 * 1` -> `3 * 2!`
- `2!` -> `2 * 1` -> `2 * 1!`
- `1!` -> `1`
- `0!` -> `1`

```java
public static int factorial(int num) {
    if (num == 1 || num == 0)
        return 1;
    
    return num * factorial(num - 1);
}
```

```
Calls                                       End of Execution
|     [ factorial(5); -> 5 * factorial(4) = 120]   ^
|     [ factorial(4); -> 4 * factorial(3) = 24]    |
|     [ factorial(3); -> 3 * factorial(2) = 6]     |
|     [ factorial(2); -> 2 * factorial(1) = 2]     |
|     [ factorial(1); 1 ]                          |
v                                                  |
```

---

**Fibonacci Sequence**: 

Value:          0, 1, 1, 2, 3, 5, 8, 13, 21
Term Number:    1, 2, 3, 4, 5, 6, 7,  8,  9 

```java
public static int fib(int term) {
    if (term == 1) return 0;
    if (term == 2) return 1;
    
    return fib(term - 1) + fib(term - 2);
}
```
