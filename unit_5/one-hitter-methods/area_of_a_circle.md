# Area of a circle
Write a method called circArea that calculates and returns the area of a circle with a given radius. The method will use a parameter for the radius value. The method should return the area of the circle, as a double, rounded to 3 decimal places. 
Hint: We can use String.format() to round the value, and then parse that string as a double! 

```java

public double circArea(double radius) {
    // pi r^2
    return Double.parseDouble(String.format("%.3f", Math.PI Math.pow(radius, 2)));
}
```
