# Controls and if statements
*A lot of this will be familiar from last year because it is very similar to JavaScript*

## conditional operators
Java has 6 conditional operators to compare <ins>**primitive**</ins> values. 
- `==` equality - checks if 2 things are equal to each other
- `>=` greater than or equal too
- `!=` not equal too
- `<=` less that or equal too
- `<` less than
- `>` greater than

Java uses diffrent operations to compare reference data types, such as `String`
Strings utilize the `.equal()` method to compare 2 String. 

<strong><ins>Ex.</ins></strong> 
```java
String str =  "banana";
String str2 = "Anti-matter"; // bc apperently demkning thinks bananas radiate anti-matter and this sparked a argument
str.equals(str2); // boolean false
```

## writing conditions
a condition is a comparision of two compatible values. 
Conditions aways result in a boolean `true/false`.

<strong><ins>Ex.</strong></ins>
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

## analysis of `==` vs `.equals()` in `String` objects
```java
String str = "apple";
String str2 = "brisket";
```

### str
on the stack ->
```
------
|#ref|
------
```
str on the stack holds refrence (pointer) to the heap where the object of the String class is held

`#ref` in memory points to 

`{'a', 'p', 'p', 'l', 'e'}`
*and all of the `String` methods*

---
### str2
```
------
|#ref|
------
```
str on the stack holds refrence (pointer) to the heap

`#ref` in memory points to  

`{'b', 'r', 'i', 's', 'k', 'e', 't'}`
*and all of the `String` methods*

---
`==` compares the values on the stack (memory adresses)
`.equals()` compared the String values...

---
# odd cases
although if 2 `String` variables are made in the same scope and point to the same data the `==` operator can return `true` because they are optimized to point to the same data and they will be equal since they both point to the same adress. This is primarily because Strings in java are immutable. *NOTE: if this was rust then this wouldn't be a problem but thanks java I guess.*

<strong><ins>Ex.</strong></ins>
```java
{ // scope 1
    // javac will optimize and make them point to the same `String` in memory
    String str1 = "hello";
    String str2 = "hello";

    System.out.println(str1 == str2);  // true
}
```
we can prove this by using unsafe java with the unsafe java api `sun.misc.Unsafe`. 
if you would like to see that you can click [here](https://github.com/speedskater1610/COMP-SCI-2/blob/main/NOTE_EXTRAS/String_unsafe_proof.md)



