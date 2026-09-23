# For loop markdown

```java
String str = "bananas"

for (int i = 0; i < str.length(); ++i) {
    if (i % 2 == 0)
        System.out.print(str.charAt(i));
}
```
Prints every even (including 0) index of str. `bnns`

![https://github.com/speedskater1610/COMP-SCI-2/NOTES/apcsa/forLoopWarmUpPhoto.png]()

To rewrite this without if statements in the body:
```java
for (int i = 0; i < str.length(); i += 2)
    System.out.print(str.charAt(i));
```
