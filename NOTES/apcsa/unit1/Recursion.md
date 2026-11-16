# Recursion

A recursive method is a method that calls itself, as a part of its exacution.
Recursion is an alternate approach to iteration.

## The Stack

The **Stack** is a "Last in First Out" (LIFO) data structure. All methods calls go on the stack and remain there until fully resolved...

**Ex.**

```java
public static void main(String... args) {
    doStuff();
}

public static void doStuff() {
    printStuff();
}

public static void printStuff() {
    System.out.println("The eagles are cooked.");
}
```

### The Stack

```
[ System.out.println ]
    ^
    |
[ printStuff ]
    ^
    |
[ doStuff ]
    ^
    |
[ Main ]
```

**NOTE**: *I told ianelli about how this model is wrong since the stack grows downwards, and he changed how he teaches it now, view more about that [here](https://github.com/speedskater1610/COMP-SCI-2/new/main/NOTES/apcsa/RecursionNov4.md)*

## Anatomy of Recursive methods

Every recursive method has 2 peices:
1. Base Case(s) - when the method is done
2. Recursive call - A call to the method w/different arguments

**Ex.** Countdown Method
```java
/* Iterative */
public static void countDown(int start) {
    for (int i = start; i > 0; --i)
        System.out.println(i);
        
    System.out.println("Blast-off");
}

/* Recursive */
public static void countDown(int start) {
    if (start == 0) {
        System.out.println("Blast-off");
        return;
    } else {
        System.out.print(start);
    }
    
    countDown(start - 1);
}
```

#### Call stack 

```
[ countDown(5) ]
  v
[ countDown(4) ]
  v
  ...
```
