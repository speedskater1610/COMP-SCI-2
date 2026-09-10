# Conditions, Comparison Operations, Truth Tables, DeMorgans law, also review basic if/else statements.

---

Before notes [read Chapter 5 starts page 93](https://www.greenteapress.com/thinkjava7/thinkjava2.pdf)

---

## Conditions and controls

A <u>**Condition**</u> is a comparison of 2 values that evaluates to a boolean value (*true/false*).
Conditions compare 2 values at a time.

### Primitive Comparison Operations:  
- `==`
- `!=`
- `>=`
- `<=`
- `>`
- `<`

*These can ONLY compare primitive NOT references*

**Objects in general are compared with a `.equals` method** *which gets inhereted from `Object`*

Why tho??


```java
int age = 41;
```

```
  age 
 -------
|   41  | 32 bits wide
 -------
```

This looks in the default memory location above
```java
age == 41 
```

---

```java
String tattoo = "Dec 11th";
```

```
  tatto0
 -----------
| 0xrefAddr | 64 bits wide
 -----------
```


```java
tattoo == "soup"
```

This will initialize "soup" as its own `String` object and compare the reference address.
Instead of  comparing the reference address we want to compare the characters stores inside so we can use the `.equals()` method

```
tattoo.equals("soup");
```

**NOTE:**
sometimes comparing `String`s with `==` will work since `String`s are immutable and if they are created in the same scope the compiler will use the same reference address for both of the `String`s.


---

## 3 Logical Operators (Boolean)
- AND: `&&`
- OR: `||`
- NOT: `!`


`||` and `&&` need a condition or Boolean value on either side

```java
(6 > 4) || false;
```

`!` needs a boolean after it and flips its state

```java
!(5 <= 9);
```

---

**Examples**:
```java
int num = 66;
double val = 78.3;
char letter = 'E';
String word = new String("bucket");
```


- `num > val` evals to `false`
- `num > 'b'` evals to `true` *compares the ASCII/UNICODE value of `'b'`*
- `word.equals("Bucket");` evals to `false` *Since `'b'` and `'B'` have different ASCII values*
- `(letter < 'D') && (num > 5)` evals to `false` - Will this eval both conditions - **yes** since they are surrounded in parenthesis.
