# Number Systems
Everything in computers from images to numbers are stored in binary.

## Decimal Number System
*Decimal: Base 10*
```
      7               6           1  
hundreds place; tens place ; ones place   
10^2              10^1          10^0
```
in base **10** we work off of powers of **10**

this is really
```
  1 * 10^0
  6 * 10^1
+ 7 * 10^2
-----------
    761
```
in base **10** there are **10** possible digits. for each spot.

---

## Binary: base 2
```

_    _    _    _    _    _    _    _
2^7  2^6 2^5 2^4  2^3  2^2   2^1 2^0
```
digit : bit  
byte : 8 bits  
nibble : 4 bits   

Base **2** (binary) has **2** possible digits `0` or `1`

Lets say we have
```
1    0    0    1    1   0     1    0
_    _    _    _    _    _    _    _
2^7  2^6 2^5 2^4  2^3  2^2   2^1 2^0
```

2 + 8 + 16 + 128 = 154

## Base 10 to binary
167 -> 0b10000111
```
1   0     0    0   0   1   1   1
_   _     _    _   _   _   _   _ 
128 64   32   16   8   4   2   1
167 - 128 = 39
39 - 32 = 7
7 - 4 = 3
3 - 2 = 1
1 - 1 = 0 
```
