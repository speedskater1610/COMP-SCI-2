## <ins> The if Statement </ins>

The if statement uses a condition to determine if a block of code will exacute or not. 
The structure is :
```java
if (condition)  {
    // If block / body
    // This code runs when the condition is true
}
```

* *NOTE : we should use curly brases `{}` with all if statements but technically, they are not needed when the `if` block only as one line*
<strong><ins>Ex</ins></strong>
```java
if (name.equals("Eli"))
  System.out.println("Go away!");
```

## The else Clause
We can optionally include a else clause with the if statement. The else clause will exacute the condtion is `false`.
<strong><ins>Ex.</ins></strong>
```java
if (age <= 60) {
    System.out.println("You are still young");
} else {
    System.out.println("You are elderly.");
}
```

## Nesting & Chaining if Statements
We can utilize multiple `if` `else` statements to create more complex decision making.

<ins>Chaining</ins> : 
```java
if (condition1) {

}
else if (condition2) {

}
else{

}
```

## nesting if statements
<ins>Nesting</ins> : 
```java
if (con1) {
    if (con2) {
        // con1 and con2 are both true
    } 
    else {
         // con1 if true and con2 is false
    }
}
else {
    // runs when con1 is false
}
```
