# Lexical analysis

## Definition
he first phase of a compiler that reads the source code character by character and groups them into meaningful sequences called tokens

### What is a token?

A token is a sequence of characters that represents a basic unit of meaning in a programming language. They are generated from the source code by the lexer, and then are used by the parser to understand the program's structure. One way that you might represent a token is using a [enum](https://en.wikipedia.org/wiki/Enumerated_type) <!-- NOTE: when I write my own enum notes use those --> and then representing the entire program as an [array](https://github.com/speedskater1610/COMP-SCI-2/blob/main/NOTES/cs2/Arrays_May6.md) [(another array notes)](https://github.com/speedskater1610/COMP-SCI-2/blob/main/NOTES/cs2/Arrays_apr30.md) of these tokens.


For example take the following `C` program

```C
int main() {
    return 0 + 1;
}
```

We can assume that this program would generate tokens or something like the follow:

```
int -> main -> ( -> ) -> { -> return -> 0 -> + -> 1 -> ; -> }
```

Obviously we can assume a lot more information based off of the syntax and these tokens. with the token string above `1` and `main` are considered the same to the compiler since they hold no other meta-data with them. Instead the compiler can also assume all of the following data based on `C`'s syntax rules

-  `int main()` function names "`main`" returning `int` must be passed 0 args
    -    
