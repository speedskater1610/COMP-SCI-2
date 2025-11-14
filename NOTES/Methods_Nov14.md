# Helper methods
A <u>helper method</u> is a method a that helps anther method do its job.
helper methods are called inside the method that they are helping.

Ex. 
```java
public static String middle3 (String str) {
    int midIndex = str.length() / 2;
    String result = str.substring(midChar-1, midIndex+2);    // substring is helping (a helper method)
    return result;
}  
```

# Method Storage options
We are able to access `public static` methods from diffrent class files as long as the class files are stored in the same directory. 
Ex. 
```
folder ->
    Main.java (has main method)
    Example.java (has `method01` and `method02`)
    Stuff.java (has `method03`)    
```
## Main.java:
```java
public static void main(String[] args) {
    Example.method01();
    Example.method02();
    Stuff.method03();
}
```
