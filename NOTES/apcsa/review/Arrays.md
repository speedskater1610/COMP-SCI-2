# Arrays

An array is a container object that holds a fixed number of values, of a single type. Each value called an element has a index value - starting with zero.

# Creating arrays

Two options

- Literal syntax `int[] nums = {67, 69, 420};`
- Object syntax `int[] nums = new int[3];` -> `{0, 0, 0}` 

when using the object syntax, the object will be filled with the defualt values for that type.

### Default types
| int | char | double | boolean | Object |
| --- | --- | --- | --- | --- |
| 0 | '\0' | 0.0 | false | null |

---

# Accessing Elements

Each element of an array can be accessed / modified individually

### Ex.
```java
double[] gpaValues = {3.88, 3.93, 2.736};
gpaValues[2] *= 1.35;
gpaValues[1] -= .5;
System.out.println("gpa: " + gpaValues[1]);
```

# Printing Arrays
We can print an array using these 2 common ways

1. `Arrays.toString()` *must import `java.util.Arrays`*
2. Use a for loops and print each element throughout the array.
