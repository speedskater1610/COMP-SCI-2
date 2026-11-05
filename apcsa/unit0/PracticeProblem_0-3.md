# AP Computer Science - A
# Practice Problems 0.3 - Controls and Conditions



### Directions


Complete the practice problems below in your coding workspace. Write all code in the main method of your main file. Any additional methods you write should be in the same class file unless otherwise directed. 


You should be able to talk through and explain each problem. Comment your code, practice good indentation, name variables appropriately, etc. Keep it clean.

---

## 1. ON PAPER - Given the following conditions (P, Q, and R):

P = System safety OK (boolean)
Q = System pressure at least 200psi
R = System temperature between 2600 - 3100 degrees F (inclusive)

The system of this steel mill requires that the safety system is active and OK to operate. Additionally, the pressure threshold or the temperature range must be met in order for the system to operate. 

Write a condition for the system to operate, and create a truth table showing the different states of the system. Then, write test data (example: Safety OK, Pressure = 100psi, Temp = 100 degrees) for each row of the truth table that can be used to test the system.


## 2. ON PAPER - Given the following conditions (P, Q, and R):

Consider the code structure shown below. Write a single conditional statement (using AND &&, OR ||, and NOT !) that represents when each block of code will execute. 

```java
if(P && Q){
	//Block #1
}
else if(R){
	//Block #2
}
else {
	//Block #3
}
```


<!-- 
USE THIS FORMAT FOR QUESTIONS
#### Solution:

<details>
<summary>Click to view Solution</summary>
  
```java

```
</details>

---
-->

## 3.

Create a Scanner called reader. Then, use the Scanner to take a user’s input for a strong password. A strong password must be at least 16 characters long, contain at least one special character (ASCII table values 33-47), and use at least 1 capital letter. If the user successfully enters a strong password, tell them their password is accepted. If not, give them specific feedback on what was wrong with their password. 

**Note**: *Use a for loop to complete this problem successfully.*

#### Solution:

<details>
<summary>Click to view Solution</summary>

```java
/* Problem 3 */
    /*
    Rules for password
    - must be at least 16 characters long
    - contain at least one special character (ASCII 33-47)
    - use at least 1 capital letter
    */
    public static void getUserPassword() {
        Map<String, Predicate<String>> rules = Map.of(
            "Must be at least 16 characters long", s -> s.length() >= 16,
            "Must contain at least a special character", s -> s.matches(".*[\\x21-\\x2F].*"), /* 0x21 is 33; 0x2F is 47 */
            "Must have at least a capital charcter", s -> !(s.equals(s.toLowerCase()))
        );
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter password: ");
        String password = sc.nextLine().trim();
        
        List<String> errors = rules.entrySet().stream()
            .filter(e -> e.getValue().negate().test(password))
            .map(Map.Entry::getKey) // func sigs look so nice
            .collect(Collectors.toList());
            
        if (errors.isEmpty()) {
            System.out.println("Password is valid.");
        }
        else {
            /* Print out all of the reasons why the password is invalid */
            System.out.println("Password is not valid because...");
            errors.forEach(error -> System.out.printf("\t%s.\n", error));
            
            System.out.println("\nPlease try again.");
            
            getUserPassword();
        }
    }
```

</details>

---

## 4.

Write a code snippet that uses a switch statement to print out a message based on a Philly sports team. Start by prompting the user to enter the name of a Philly sports team, taking their input with a Scanner. The following values should be used to print the messages shown below:

- User enters “Eagles” = The Eagles will win the Super Bowl
- User enters “Phillies” = The Phillies will win the World Series
- User enters “Sixers” = The Sixers will win the NBA Title
- User enters “Flyers” = Will the Flyers ever win the Stanley Cup again?

Any other value should print the message: “You did not enter a valid team jawn.” (soccer is not a major sport in the USA).

**Note**: *The program should work regardless of capitalization. You may use the .equalsIgnoreCase() string instance method if you wish.*

#### Solution:

<details>
<summary>Click to view Solution</summary>

```java
/* Problem 4 */
    public static void getPhillySportTeam() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sports team: ");
        String team = sc.nextLine().trim();
        
        switch (team.toLowerCase()) { /* Ignore casing */
            case "eagles":
                System.out.println("The Eagles will win the Super Bowl");
                break;
                
            case "phillies":
                System.out.println("The Phillies will win the World Series");
                break;
                
            case "sixers":
                System.out.println("The Sixers will win the NBA Title");
                break;
                
            case "flyers":
                System.out.println("Will the Flyers ever win the Stanley Cup again?");
                break;
                
            default:
                System.out.println("You did not enter a valid team jawn.");
                break;
        }
    }
```

</details>

---

## 5.

Write a code snippet that asks the user to enter a meal selection and prints their selection out to them. The following meals are available:

- 1 = Cheeseburger
- 2 = Chicken Sandwich
- 3 or 4 = Delicious Salad
- 5 = Nuggies

Any other value should print the message: Invalid Selection. Additionally, the user should be re-prompted to enter a meal until they enter a valid option.

**Note**: *Use a while loop to complete this problem successfully.*

#### Solution:

<details>
<summary>Click to view Solution</summary>

```java
/* Problem 5 */
    public static void takeMeal() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\t1 = Cheeseburger\n" +
                            "\t2 = Chicken Sandwich\n" +
                            "\t3 or 4 = Delicious Salad\n" +
                            "\t5 = Nuggies\n"
        );
        System.out.print("Enter meal number: ");
        int meal = sc.nextInt();
        
        sc.nextLine(); /* Since this is a method and you dont know what 
                        type of data could be read next dummy read just in case*/
                        
        switch (meal) {
            case 1:
                System.out.println("Cheeseburger");
                break;
                
            case 2:
                System.out.println("Chicken Sandwich");
                break;
                
            case 3:
            case 4:
                System.out.println("Delicious Salad");
                break;
                
            case 5:
                System.out.println("Nuggies");
                break;
                
            default:
                System.out.println("Invalid Selection");
                takeMeal();
                break;
        }
    }
```

</details>

---


