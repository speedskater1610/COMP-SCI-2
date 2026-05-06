# Arrays advanced topics

### Linear search

Linear Search is a basic searching algorithm;
where we begin by checking index 0 and progress linearly 
through the array.

---
##### Ex.
```Java
public static int search(int arr[], int target) {
    for (int i = 0 ; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }
    return -1;
}
```

---
---

### Copying arrays
To copy an array, we must write code to do an element by element copy.
1. Create new array of same type and length
2. use a for loop to copy each element over to new array

##### Ex.
Given an array called names...

```Java
String namesCopy[] = new String[names.length];

for (int i = 0; i < names.length; ++i) {
    namesCopy[i] = names[i]; 
} 
```

---

#### Alias vs copies
```Java
int nums[] = {1, 2, 3};
int numsCopy = nums;
```
