# Iteration with arrays
Looping through an array typically involves a for loop or for-each loop.

- `for` loops -> tracks index and can modify values.
- `foreach` loops -> Does not track index and is used to access values from index [0, `.length`-1].

**Ex.** Given an `int[]` nums:
```java
// Increase all elements by 5
for (int i = 0; i < nums.length; ++i) {
    nums[i] += 5;
}

// Sum all the elements
int sum = 0;
for (int num : nums) {
    sum += num;
}
```

### Uses of for-each loops
- summing all of the values in an array.
- Doing a search to see if a value exists in an array. *Not searching for an index just if it exists or not*
- Printing each value in order of the array.

### Linear search
The linear search algorithm searches a data structure for a specific value: starting at the first/last index and progressing linearly through the data.

**Ex.** 
```java
public static int findElsa(String[] cats) {
    int elsaIndex = -1;

    for (int i = 0; i < cats.length; ++i) {
        if (cats[i].equalsIgnoreCase("Elsa")) {
            elsaIndex = i;
            break;
        }
    }

    return elsaIndex;
}
```
