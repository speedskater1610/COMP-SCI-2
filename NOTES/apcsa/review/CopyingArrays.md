# Copying Arrays

Copying an array involves making a new array, of the same type and length, and using a for loop.

**Ex.**
```java
int nums[] = {5, 13, 17};

int numsCopy[] = new int[nums.length];

for (int i = 0; i < nums.lenght; ++i) {
    numsCopy[i] = nums[i];
}
```

### Alias vs copy
```
int nums[] = {5, 13, 17};
int numsCopy[] = nums;
```

`nums` and `numsCopy` will now point to the same reference addr.
