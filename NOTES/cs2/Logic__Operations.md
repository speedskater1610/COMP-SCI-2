# Logic Operations
There are 3 main logic operations that we can use to combine and manipulate conditions in order to create more complex conditions

## conditions 
- `AND` (`&&`) 
- `OR` (`||`)
- `NOT` (`!`)

When using `AND` and `OR` we must have a complete condition / `boolean` type value, on both sides of the logic operation.
```java
(cond1 && cond2)
```
both conditions must be true 

```java
cond1 || cond2
```
At least one ondition must be true

The not operation is the negation opperation, it will change the outcome of a condition to the opposite boolean value  
Ex.
```java
double gpa = 2.736;
(gpa >= 3.5);     // false
!(gpa >= 3.5);    // true
```

### Examples
```java
String subject = "computer science";
int days = 90;
double gpa = 3.7;

if (subject.equals("computer science") && days <= 30) {
  System.out.println("it is early your grade is fine");
}
else if (gpa >= 3.5 && days >= 75 && subject.equals("computer science")) {
  System.out.println("You have a good grade");
}
else if (gpa <= 2.0)  {
  System.out.println("Start worrying and lock in");
}
```

### Order of operations :
1. Not (`!`)
2. And (`&&`)
3. Or (`||`)
*From left to right without grouping symbols.*
**We should use parenthesis (grouping symbols) to control which conditions occur first**


### NOTE:
So we can NOT
```java
1 <= hours <= 12
```

So you must do somehting like this
```java
1 <= hours && hours <= 12
```
