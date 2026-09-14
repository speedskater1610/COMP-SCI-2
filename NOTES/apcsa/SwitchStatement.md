# Switch statements

A switch statement can be used when the value of a single variable drives a decision...

*  **Works with `int`s, `String`s, and `char`s not `double`s**  
    *  This is because of rounding errors

```java
switch(variableName) {
    case literalVal:
        code to run...
        break;
    case literalVal2:
        code to run 2...
        break;
    default: (optional)
        code to run...
        break;
}
```

- Once it hits a a `break` you will leave the scope of the switch.
- You can have as many cases as you want.
- if you don't have a `break` you will run all the code until you hit one allowing for a "fall through"
