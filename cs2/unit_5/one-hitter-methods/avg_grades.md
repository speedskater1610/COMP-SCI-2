Write a method called average that will calculate and return the average of five grades. Each grade will be a parameter of the method. The method should return a double value, which corresponds to the average (mean) of the grades, rounded to two decimal places. 

*Hint: We can use String.format() to round the value, and then parse the resulting String to a double!*




```java
public double average (double score1, double score2, double score3, double score4, double score5) {
    double floating_sum = (score1 + score2 + score3 + score4 + score5) / 5;
    String string_sum = String.format("%.2f", floating_sum);
    return Double.parseDouble(string_sum);
}
```
