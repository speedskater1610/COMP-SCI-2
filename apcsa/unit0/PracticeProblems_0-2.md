# AP Computer Science - A
# Practice Problems 0.2 - Math Methods & Custom Methods


### Directions

Complete the practice problems below in your coding workspace. You should write all methods in one class file and call them from the main method unless otherwise directed. You should be able to talk through and explain each problem. Comment your code, practice good indentation, name variables appropriately, etc. Keep it clean.



*The following methods should be created in a new file called Tools.java. You will write these methods in Tools.java and then call them from the main method in your main java file.*

---

<!-- 
USE THIS FORMAT FOR QUESTIONS


1.

```
Example
```

*Note: *

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java

```
</details>

---

-->

1. Create a new method called printMessages. The method should have parameters for a person's full name (first and last, separated by a space), age, weight (in pounds, a double), and height (in feet, a double). The method should print out the following messages to the console:


```
First Name: 	<first name>
Last Name: 		<last name>
% Life Remain: 	<calculated %>
Current BMI: 	<calculated BMI>
```

*Use the following for your calculations:* 
* The average lifespan of an adult is 79.6 years (USA, 2025)
* BMI Calculation: (weight in pounds × 703) / (height in inches)²

* Note: Use escape sequences to line the data up nicely (\t).*

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
public static void printMessages(
                            String name, 
                            int age, 
                            double weight, 
                            double height) {
    int seperationSpaceIndex = name.trim().indexOf(" ");
    String firstName = name.trim().substring(0, seperationSpaceIndex);
    String lastName = name.trim().substring(seperationSpaceIndex);
        
    double percentOfLifeRemaining = 100 * (age / 79.6);
    double bmi = (weight * 703) / Math.pow(height, 2);
        
    System.out.printf(
            "First Name:\t\t%s" +
            "Last Name:\t\t%s" +
            "% Life Remain:\t%.3f%" +
            "Current BMI:\t\t%.3f",
            firstName,
            lastName,
            percentOfLifeRemaining,
            bmi
    );
}
```
</details>

---

2. Create a new method called calcArea. The method should have 2 double parameters representing the length and width of a rectangle / square. The method should return the area of the rectangle, as a double, rounded to 2 decimal places. 

* *Note: You will need to use String.format() to do custom rounding.*


#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
public static double calcArea(double length, double width) {
    double area = length * width;
    return Math.round(area * 100) / 100d;
}
```
</details>

---


3. Create a new method called calcVolume. The method should have 3 double parameters representing the length, width, and height of a rectangular prism. The method should use the calcArea method as a helper method to calculate the volume. The method should return the volume of the prism, as a double, rounded to 3 decimal places.

* *Note: You will need to use String.format() to do custom rounding.*


#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
public static double calcVolume(double length, double width, double height) {
    double volume = calcArea(length, width) * height;
    return Math.round(volume * 1000) / 1000d;
}
```
</details>

---

4. Create a new method called printMaxRoll. The method should have two parameters: an integer parameter representing the dice type to be rolled (6 = 6-sided, 12 = 12-sided, etc.); and a second integer parameter representing how many rolls to perform. The method should perform the number of rolls requested and print out the highest result to the console using the following message:

```
A <num>-sided die was rolled <num> times…max roll: <maxRoll>
```

* *Note: You will need to use a loop to successfully write this method.*

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
public static void printMaxRoll(int diceSides, int rolls) {
    int highestRoll = -1; // Can't possibly roll lower.
        
    for(int i = 0; i < rolls; ++i) {
        int roll = (int)(Math.random() * (diceSides + 1));
        if (roll > highestRoll) highestRoll = roll;
    }
        
    System.out.printf("A %d-sided die was rolled %d times...max roll: %d",
        diceSides, rolls, highestRoll
    );
}
```
</details>

---

5. Create a new method called getDistance. The method should have 4 double parameters representing two cartesian coordinates (x1, y1) and (x2, y2). The method should calculate and return the distance between the two coordinates using the distance formula below. The method should return the distance as a double rounded to one decimal place. 

* *Note: You will need to use String.format() to do custom rounding.*

```
d = √((x2 - x1)² + (y2 - y1)²)
```

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
public static double getDistance(double x1, double y1,
                                 double x2, double y2) {
    double distance = Math.sqrt(
                        Math.pow(x2 - x1, 2) + 
                        Math.pow(y2 - y1, 2)
    ); 
                        
    return Math.round(distance * 10) / 10D;
}
```
</details>

---


6. Create a new method called `getCircleArea`. The method should have a single double parameter representing the radius of a circle. The method should calculate the area of the circle using the radius, and return the area as an unrounded double value. 

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
public static double getCircleArea(double rad) {
    return Math.PI * Math.pow(rad, 2);
}
```
</details>

---

7. Create a new method called `getCircleCirc`. This method should be a private method, meaning it can only be called within `Tools.java`. The method should have a single double parameter representing the radius of a circle. The method should calculate the circumference of the circle using the radius, and return the circumference as an unrounded double value.


* *Note: Try to call this method from the main method in Driver.java. Does it work? If not, what type of error do you get?*

<details>
<summary>Click to view *Note* answer</summary>
It will not be able to be called since the method is `private to `Tool.java` so you will get a compilation error.
</details>

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
private static double getCircleCirc(double rad) {
    return 2D * Math.PI * rad;
}
```
</details>

---

8.Create a new method called `printCircleData`. The method should have a single double parameter representing the radius of a circle. The method should calculate both the area and circumference of the circle using the radius. The method should use `getCircleArea` and `getCircleCirc` as helper methods to accomplish its task. Then, the method should print the results to the console using the following format:


```
Circle of radius <radius>:
Area = <calculated area>
Circumference = <calculated circumference> 
```


* *Note: Are you able to successfully call `printCircleData` from the main method in `Driver.java`? Why?*
<details>
<summary>Click to view *Note* answer</summary>
You are able to since it is a public method and it is also static like the main method.
</details>

#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java
public static void printCircleData(double rad) {
    double area = getCircleArea(rad);
    double circ = getCircleCirc(rad);
        
    System.out.printf(
        "Circle of radius %.3f:\n" +
        "Area = %.3f\n" +
        "Circumference = %.3f"
    );
}
```
</details>

---