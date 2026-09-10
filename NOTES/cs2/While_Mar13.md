# While loops
`while` loops run a undeterminded amount of times, while `for` loops run until certain amount of times.

A `while` loop is a **pretest** loop, that runs an undetermined amount of times.

### Syntax - Example
```Java
String pq = "";

while (!pw.equals("elsaQueen!67")) { //  bros cat
    System.out.print("Enter password: ");
    pw = reader.nextLine();

    if (!pw.equals("elsaQueen!67")) {
        System.out.println("Incorrect password");
    }
}

System.out.println("Login sucessful");
```

- do we have a control variable? - Yes `pw`; it exists before the loop so it isnt scopped to the loop.
- We obvoisly have a condition involving the CV
- Loop body obvoisly exists
- and `pw = reader.nextLine();` is the update to the CV *inside the loop*


### Alternate example - pre-read
```Java
System.out.print("Enter our password: ");
String pw = reader.nextLine();

while (!pw.equals("elsaQueen!67")) {
    System.out.println("Password Incorrect");

    System.out.print("Enter pw: ");
    pw = reader.nextLine();
}

System.out.println("acess granted");
```
