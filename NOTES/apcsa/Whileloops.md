# While loop

A while loop generally will run an unknown amount of times.

*Control variable for the `while` loop must be declared before*

```java
String word = new String(); // CONTROL VARIABLE

while (!word.equalsIgnoreCase("stop")) {
    System.out.print("Guess word");
    word = read.nextLine(); // CV UPDATE

    if (word.equalsIgnoreCase("Crysler")) {
        System.out.print("You guessed correctly ");
        break;
    }
}

System.out.println("The game has ended");
```

**NOTES**:

- CV established before the loop *not scoped to the loop*
- Update happened inside the `while`'s body tropically towards the end.
