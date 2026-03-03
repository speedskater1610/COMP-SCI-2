# Iteration

There  are 2 types of loops,**pre**-test and **post**-test loop, for and while are both **pre**-test while do-while is the only **post**-test.

Iteration also know as looping, is the process of repeating a block of code, multiple times until a condition is met. There are 3 types of loops, they are: for; while; do-while.

### General loop stuff
All loops have the same core 4 peices.

- Control Variable
- Loop condition (with the C.V.)
- Loop body (The code that gets repeated)
- Update to the C.V.

### Pre-test VS post-test
A pre-test checks the loop conditions before running, including the first time.
A post-test checks the loops condition after running, the loops body runs first. 

## The for Loop

it has all of the 4 core peices of a loop, it runs some finite number of times. 

```java
for(int i = 0; i < 10; i++) { ~~4~~ } // runs ten times
    ~~~~~~~     ~~~    ~~~
       1         2      3

1. Control variable declaration/init
2. Loop condition 
3. Update to control variable
4. Body of the loop
```
