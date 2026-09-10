# over-loaded methods

an over loaded method is a method with the same name as another method (in the same class file).
these methods must have a diffrence in params, in order to co-exist. 
        
## specifically : 

- a diffrent number of params
- a diffrent order of params (by data type)
- a diffrent type of params
- *NOTE : changing return type will not create a valid overloaded method*

## Examples 

```java
public static double avg(double num1, double num2) { ... } 
public static double avg(double num1, double num2, double num3) { ... } // diff # of params
public static double avg(int num1, int num2) { ... } // diff params than 1 & diff # of params than 2
public static double avg(int num1, double num2) { ... } 
public static double avg(double num1, int num2) { ... }
```

