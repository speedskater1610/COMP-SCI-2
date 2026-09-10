# Password Generator

Write a method called passwordGen that will be used to generate a "strong password" based on the values of parameters. The method will take a user's first name, age, and a random word. Then, the method will generate and return a String password that the user could easily remember, that would be considered strong. 
The password will be: (second half of their name) + (their age multiplied by 5) + (the capitalized version of the word). 


```java
public String passwordGen(String name, int age, String word) { 
    String secHalf name.substring(name.length()/2);
    int ageX5 age*5;
    String capword = word.toUpperCase(); return secHalf ageX5+ capword;
}
```
