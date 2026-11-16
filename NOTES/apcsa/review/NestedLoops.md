# Nested Loops

We can create loops inside of loop... as long as the control vars are unique!

**Ex. Print a multiplication table from 2-10**
```
(num) * (multiplier)
[2,10]     [1,10]
```

```java
for (int i = 2; i <= 10; ++i) {
    for (int j = 1; j <= 10; ++j) {
        System.out.printf("%4d", i * j);
    }
    
    System.out.println();
}
```
