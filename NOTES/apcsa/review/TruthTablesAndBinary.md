# Truth Tables and Binary

A **truth table** is used to examine the outcomes of complex conditions.

The number of combos needed is `2^n`.


### Example: (P || Q) && R

number of combos: 2^3 = 8 different combos and 8 rows

| P | Q | R | P or Q | (P or Q) and R | 
|---|---|---|---|---|
| 0 | 0 | 0 | 0 | 0 |
| 0 | 0 | 1 | 0 | 0 |
| 0 | 1 | 0 | 1 | 0 |
| 0 | 1 | 1 | 1 | 1* |
| 1 | 0 | 0 | 1 | 0 |
| 1 | 0 | 1 | 1 | 1* |
| 1 | 1 | 0 | 1 | 0 |
| 1 | 1 | 1 | 1 | 1* |
---


(P, Q, R)
---
(0, 1, 1),
(1, 0, 1),
(1, 1, 1)
