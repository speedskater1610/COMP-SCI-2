# Do ... While loops

A `do...while` loop runs at least one time. This is because it is a post test loop, so it checks the condition after running the loop body.


Example:


```java
String pin = "";

do {
    System.out.print("PIN: ");
    pin = reader.nextLine
    
    if (pin.length() != 4) {
        System.out.println("Invalid pin");
    }
} while (!pin.equals("1234"));

System.out.println("PIN Accepted");
```
