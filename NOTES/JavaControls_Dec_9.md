# Controls and if statements
*A lot of this will be familiar from last year because it is very similar to js*
## conditional operators
Java has 6 conditional operators to compare **primitive** values. 
- `==` equality - checks if 2 things are equal to each other
- `>=` greater than or equal too
- `!=` not equal too
- `<=` less that or equal too
- `<` less than
- `>` greater than

Java uses diffrent operations to compare reference data types, such as `String`
Strings utilize the `.equal()` method to compare 2 String. 
Ex. 
```java
String str =  "banana";
String str2 = "Anti-matter"; // bc apperently demkning thinks bananas radiate anti-matter and this sparked a argument
str.equals(str2); // boolean false
```

## writing conditions
a condition is a comparision of two compatible values. 
Conditions aways result in a boolean `true/false`.
Ex. 
```java
int num = 65;
double val  = 68.3;
char init = 'J';
String str = "violence".

num < 70;             // true
val > 10;             // true
init < 'A';           // false
str.equals("cheese"); // false
```

## analysis of `==` vs `.equals()`
```java
String str = "apple";
String str2 = "brisket";
```

### str
```
------
|#ref|
------
```
str on the stack holds refrence (pointer) to the heap

`#ref` in memory
{'a', 'p', 'p', 'l', 'e'}
and all of the `String` methods

---
### str2
```
------
|#ref|
------
```
str on the stack holds refrence (pointer) to the heap

`#ref` in memory
{'b', 'r', 'i', 's', 'k', 'e', 't'}
and all of the `String` methods

---
`==` compares the values on the stack (memory adresses)
`.equals()` compared the String values...
