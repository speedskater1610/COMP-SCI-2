# Truth Tables
We have taked about and `&&` , or `||`, and not `!`.  

A **<u>truth table</u>** is  tool that we can use to evaluate complex conditions.

--- 

## Setup
Determin how many diffrent combinations exist. 
Given conditions, `P`,`Q`,`R`, and `S`...
Image these are all something like `temp >=  86` or `time == 9`.
If we have `P && Q`: 2 Condititions involved. 

That means 2^2 possibilites or 4 possible combos. 
Base: **Number or possible states is 2** because either `true` or `false`. And the exponent is the number of conditions involved.  

-> `P || (Q && R)`:
meaning 2^3 or 8


## Tables

### `P && Q`

| P | Q | `P && Q` |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 0 |
| 1 | 0 | 0 |
| 1 | 1 | 1 |
---

### P || (Q && R)
| P | Q | R | `P &vert;&vert; (Q & R)` |
|---|---|---|---|
| 0 | 0 | 0 | 0 |
| 0 | 0 | 1 | 0 |
| 0 | 1 | 0 | 0 |
| 0 | 1 | 1 | 1 |
| 1 | 0 | 0 | 1 |
| 1 | 0 | 1 | 1 |
| 1 | 1 | 0 | 1 |
| 1 | 1 | 1 | 1 |


---
True
(P,Q,R)
(0,1,1)
(1,0,0)
(1,0,1)
(1,1,0)
(1,1,1)


---
#### P,Q,R...

### (P || R) && Q
| P | R | Q | Result |
| --- | --- | --- | --- |
| 0 | 0 | 0 | 0 |
| 0 | 0 | 1 | 0 |
| 0 | 1 | 0 | 0 |
| 0 | 1 | 1 | 1 |
| 1 | 0 | 0 | 0 |
| 1 | 0 | 1 | 1 |
| 1 | 1 | 0 | 0 |
| 1 | 1 | 1 | 1 |

---

### !(P && Q) || R

| P | R | Q | Result |  
| --- | --- | --- | --- |  
| 0 | 0 | 0 | 1 |  
| 0 | 0 | 1 | 1 |  
| 0 | 1 | 0 | 1 |  
| 0 | 1 | 1 | 1 |  
| 1 | 0 | 0 | 1 |  
| 1 | 0 | 1 | 1 |  
| 1 | 1 | 0 | 0 |  
| 1 | 1 | 1 | 1 |  

--- 

