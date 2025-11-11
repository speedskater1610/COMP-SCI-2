# Problem 1
## APCS AMUSEMENT PARK

Most hourly jobs require someone to enter information on a timesheet. The APCS Amusement Park is open from 9:00 a.m. to 5:00 p.m. The Business Office enters a code representing the location where an employee works and the starting time and ending time for each day. The codes entered are as follows:
9:00 = 1    	9:30 = 2    	10:00 = 3   	10:30 = 4   	11:00 = 5   	11:30 = 6   	12:00 = 7
12:30 = 8   	1:00 = 9    	1:30 = A   	2:00 = B    	2:30 = C    	3:00 = D   	3:30 = E
4:00 = F    	4:30 = G   	5:00 = H
 
Locations 100-199 get paid $10.00 per hour with time and a half for any hours over 5 per day.
Locations 200-299 get paid $7.50 per hour with double time for hours worked over 6 per day.
Locations 300-399 get paid $9.25 for the first 4 hours and $10.50 for the rest.
Locations 400-499 get paid $13.50 per hour on Sundays (day 1) and Saturdays (day 7) and $6.75 per hour otherwise.
Locations 500-599 get paid $8.00 per hour for the first 6 hours per day and $12.00 per hour after that. 

INPUT: There will be 5 lines of input. Each line will contain the employee information for 2 work days. The data will represent in order the location, the day number, the start time and the end time for each day.

OUTPUT: The total amount of money that the employee gets paid for the two days printed as dollars and cents rounded to the nearest cent.  

| SAMPLE INPUT			| 		SAMPLE OUTPUT | 
|---|---|
| 1. 125, 2, 1, 7, 125, 3, 5, H      	  |  			1.  $95.00 |
| 2. 214, 4, 1, H, 314, 5, 5, H      	  |  			2. $133.00 |
| 3. 318, 1, 1, H, 319, 3, 3, D      	  |  			3. $126.50 |
| 4. 423, 1, 1, 7, 500, 2, 5, H      	  |  			4.  $88.50 |
| 5. 529, 6, 1, G, 100, 4, 2, G      	  |  			5. $146.00 |



```java
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;

public class Problem1 {
    public static Stack<Worker> workers = new Stack<Worker>();
    private static String adminPassword = "1234";
    
    public static void main(String[] args) {

        while (true) {
            String cmd = readLine("Enter command >");
            parseCmd(cmd);
        }
    }
    public static String readLine (String out) {
        Scanner input = new Scanner(System.in);
        System.out.print(out);
        String in = input.nextLine();
        return in;
    }
    
    public static void parseCmd (String cmd) {
        switch (cmd) {
            case "help":
                System.out.println(
                    "\tnew - creates a new worker\n" + 
                    "\tshow - shows all of the workers names\n" +
                    "\tnewDay - steps the day up by one for all of the workers\n" +
                    "\tsetDay - will prompt you with the new day that you want to set every one to\n" +
                    "\tshowPin - shows the pin assigned to each worker *NOTE: must have admin password to see this*\n" + 
                    "\tcheckIn - \n" +
                    "\tcheckOut - \n" +
                    "\tshowIndex - shows the index of each worker and there name - this can be helpful for when you have to check in and out workers\n" +
                    "\tclear - clear the screen -  good when sensitive info has just been typed in" +
                    "\t"
                );
                break;
            case "new" :
                String confirm = readLine("\tAre your sure that you want to make a new worker (y/n):");
                
                if (confirm.charAt(0) == 'y') {
                    System.out.println("\t\t\tDont include any spaces before or after your input");
                    String fName = readLine("\t\tEnter First Name: ");
                    String lName = readLine("\t\tEnter Last name: ");
                    String pin = readLine("\tplease enter a pin: ");
                    
                    String confirmName = readLine("is  \"" + fName + " " + lName + "\" Correct (y/n)?");
                    if (confirmName.charAt(0) == 'y') {
                        // make a temp var  with the info then push it to the global one
                        Worker temp  = new Worker (fName + " " + lName);
                        temp.setPin(pin);
                        workers.push(temp);
                    } else if (confirmName.charAt(0) == 'n') {
                        System.out.println("Okay then please restart");
                        break;
                    } else {
                        System.out.println("Invalid character");
                        break;
                    }
                    
                } else if (confirm == "n")  {
                    System.out.println("Okay then please restart");
                    break;
                } else {
                    System.out.println("\t\tPlease enter a valid character");
                    break;
                }
                break;
            case "show":
                for (Worker element : workers) {
                    System.out.println("\t" + element.name);
                }
                break;
            case "newDay":
                for (Worker element : workers) {
                    element.newDay();
                }
                break;
            case "setDay":
                String newDay = readLine("\tSet a new day (sat/sun/mon/tue/wen/thu/fri) - ");
                switch (newDay) {
                    case "sat":
                        for (Worker worker : workers) {
                            worker.day = Week.SATURDAY;
                        }
                        break;
                    case "sun":
                        for (Worker worker : workers) {
                            worker.day = Week.SUNDAY;
                        }
                        break;
                    case "mon":
                        for (Worker worker : workers) {
                            worker.day = Week.MONDAY;
                        }
                        break;
                    case "tue":
                        for (Worker worker : workers) {
                            worker.day = Week.TUESDAY;
                        }
                        break;
                    case "wen":
                        for (Worker worker : workers) {
                            worker.day = Week.WEDNESDAY;
                        }
                        break;
                    case "thu":
                        for (Worker worker : workers) {
                            worker.day = Week.THURSDAY;
                        }
                        break;
                    case "fir":
                        for (Worker worker : workers) {
                            worker.day = Week.FRIDAY;
                        }
                        break;
                    
                    default :
                        System.out.println("\nPlease enter a valid day of the week");
                        break;
                }
                break;
                
            case "showPin":
                String tempAdminPasswod = readLine("Enter the admin code - ");
                if ( tempAdminPasswod.charAt(0) == adminPassword.charAt(0)
            &&
            tempAdminPasswod.charAt(1) == adminPassword.charAt(1)
            &&
            tempAdminPasswod.charAt(2) == adminPassword.charAt(2)
            &&
            tempAdminPasswod.charAt(3) == adminPassword.charAt(3) ) {
                    for (Worker worker : workers) {
                        System.out.print(worker.name + " - ");
                        worker.showPin();
                    }
                }
                break;
            
            case "showIndex" :
                int workerIndex = 0;
                for (Worker worker : workers) {
                    System.out.println("\t" + worker.name + " - " + workerIndex);
                    workerIndex++;
                }
                break;
                
            case "clear" :
                System.out.print("\u001b[H\u001b[2J");
                break;
            
            case "checkIn":
                // Time time, int location, Week day, String pin
                // get the time
                String stringTime = readLine("\tEnter check in time according to this format\n\t\t9:00 = 1\n\t\t9:30 = 2\n\t\t10:00 = 3\n\t\t10:30 = 4\n\t\t11:00 = 5\n\t\t11:30 = 6\n\t\t12:00 = 7\n\t\t12:30 = 8\n\t\t1:00 = 9\n\t\t1:30 = A\n\t\t2:00 = B\n\t\t2:30 = C\n\t\t3:00 = D\n\t\t3:30 = E\n\t\t4:00 = F\n\t\t4:30 = G\n\t\t5:00 = H\n\n\t- ");
                char charTime = stringTime.charAt(0);
                
                
                Time time = Time.ONE;   // defualt
                
                // assign based off of the input
                switch(charTime) {
                    case '1':
                        time = Time.ONE;
                        break;
                        
                    case '2':
                        time = Time.TWO;
                        break;
                    
                    case '3':
                        time = Time.THREE;
                        break;
                    
                    case '4':
                        time = Time.FOUR;
                        break;
                    
                    case '5':
                        time = Time.FIVE;
                        break;
                    
                    case '6':
                        time = Time.SIX;
                        break;
                    
                    case '7':
                        time = Time.SEVEN;
                        break;
                    
                    case '8':
                        time = Time.EIGHT;
                        break;
                    
                    case '9':
                        time = Time.NINE;
                        break;
                    
                    case 'A':
                        time = Time.A;
                        break;
                    
                    case 'B':
                        time = Time.B;
                        break;
                    
                    case 'C':
                        time = Time.C;
                        break;
                    
                    case 'D':
                        time = Time.D;
                        break;
                    
                    case 'E':
                        time = Time.E;
                        break;
                    
                    case 'F':
                        time = Time.F;
                        break;

                    case 'G':
                        time = Time.G;
                        break;

                    case 'H':
                        time = Time.H;
                        break;
                }
                
                // get the location
                String stringLocation = readLine("Enter the location that you are checking into to - "); 
                int location = Integer.parseInt(stringLocation);
                
                // get there pin 
                String pin = readLine("Enter your pin - ");
                
                // get there index 
                String stringIndex = readLine("What is your index - ");
                int index = Integer.parseInt(stringIndex);
                
                
                // Time time, int location, Week day, String pin
                // holy rust ahh syntax
                workers
                    .elementAt(index)
                    .checkIn(
                        time, 
                        location, 
                        workers
                            .elementAt(index)
                            .day,
                        pin);
                        
                break;
                
            
            case "checkOut":
                // get the time
                String checkOutStringTime = readLine("\tEnter check out time according to this format\n\t\t9:00 = 1\n\t\t9:30 = 2\n\t\t10:00 = 3\n\t\t10:30 = 4\n\t\t11:00 = 5\n\t\t11:30 = 6\n\t\t12:00 = 7\n\t\t12:30 = 8\n\t\t1:00 = 9\n\t\t1:30 = A\n\t\t2:00 = B\n\t\t2:30 = C\n\t\t3:00 = D\n\t\t3:30 = E\n\t\t4:00 = F\n\t\t4:30 = G\n\t\t5:00 = H\n\n\t- ");
                char checkOutCharTime = checkOutStringTime.charAt(0);
                
                
                
                Time checkOutTime = Time.ONE;   // defualt
                
                // assign based off of the input
                switch(checkOutCharTime) {
                    case '1':
                        checkOutTime = Time.ONE;
                        break;
                        
                    case '2':
                        checkOutTime = Time.TWO;
                        break;
                    
                    case '3':
                        checkOutTime = Time.THREE;
                        break;
                    
                    case '4':
                        checkOutTime = Time.FOUR;
                        break;
                    
                    case '5':
                        checkOutTime = Time.FIVE;
                        break;
                    
                    case '6':
                        checkOutTime = Time.SIX;
                        break;
                    
                    case '7':
                        checkOutTime = Time.SEVEN;
                        break;
                    
                    case '8':
                        checkOutTime = Time.EIGHT;
                        break;
                    
                    case '9':
                        checkOutTime = Time.NINE;
                        break;
                    
                    case 'A':
                        checkOutTime = Time.A;
                        break;
                    
                    case 'B':
                        checkOutTime = Time.B;
                        break;
                    
                    case 'C':
                        checkOutTime = Time.C;
                        break;
                    
                    case 'D':
                        checkOutTime = Time.D;
                        break;
                    
                    case 'E':
                        checkOutTime = Time.E;
                        break;
                    
                    case 'F':
                        checkOutTime = Time.F;
                        break;

                    case 'G':
                        checkOutTime = Time.G;
                        break;

                    case 'H':
                        checkOutTime = Time.H;
                        break;
                }
                
                // get there index 
                String checkOutStringIndex = readLine("What is your index - ");
                int checkOutIndex = Integer.parseInt(checkOutStringIndex);
                
                
                // get their pin
                String CheckOutPin = readLine("Enter your Pin: ");
                
                
                
                // "R*ST"
                workers
                    .elementAt(checkOutIndex)
                    .checkOut (
                            checkOutTime,
                            CheckOutPin
                        );
                break;
            
            default:
                System.out.println("\tType \"help\" to get a list of commands");
                break;
        }
    }
    
    public static class Worker {
        public String name;         // name
        public Time checkIn;        // when they check in
        public Time checkOut;       // when they check out
        private double totalPay;     // there total amount of pay over the course of there life
        private int location;        // what location they are working
        public Clock formatingTimes;// for formatting times to be able to make the print look nice
        public Week day;            // the day of the week that they are working on
        private String pin;
            
        public Worker (String name) {
            this.name = name;
            this.formatingTimes = new Clock((double)(00.00));
            this.day = Week.SUNDAY;
        }
        public void setPin (String newPin) {
            this.pin = newPin;
        }
        public void showPin () {
            System.out.println(this.pin);
        }
        
        public void newDay () {
            switch (this.day) {
                case Week.SATURDAY:
                    this.day = Week.SUNDAY;
                    break;
                case Week.SUNDAY:
                    this.day = Week.MONDAY;
                    break;
                case Week.MONDAY:
                    this.day = Week.TUESDAY;
                    break;
                case Week.TUESDAY:
                    this.day = Week.WEDNESDAY;
                    break;
                case Week.WEDNESDAY:
                    this.day = Week.THURSDAY; 
                    break;
                case Week.THURSDAY:
                    this.day = Week.FRIDAY;
                    break;
                case Week.FRIDAY:
                    this.day = Week.SATURDAY;
                    break;
            }
        }
        
        // When the worker checks in
        public void checkIn (Time time, int location, Week day, String pin) {
    if (
        pin.charAt(0) == this.pin.charAt(0)
            &&
            pin.charAt(1) == this.pin.charAt(1)
            &&
            pin.charAt(2) == this.pin.charAt(2)
            &&
            pin.charAt(3) == this.pin.charAt(3)
        ) 
        {
            // Print the time that the worker checked in
            formatingTimes.setTime((double)time.getValue());
            System.out.println("Worker " + this.name + " checked in at " + time);
            
            // Set the time
            this.checkIn = time;
            
            // Set the location
            this.location = location;
        
            // Set the day
            this.day = day;
    } 
    
    else {
        System.out.println("INCORRECT PIN");
    }
    
        }
        
        // When the worker checks out 
        public void checkOut (Time time, String pin) {
    if (
        pin.charAt(0) == this.pin.charAt(0)
            &&
            pin.charAt(1) == this.pin.charAt(1)
            &&
            pin.charAt(2) == this.pin.charAt(2)
            &&
            pin.charAt(3) == this.pin.charAt(3)
        ) 
        {
            // Print out the time
            formatingTimes.setTime((double)time.getValue());
            System.out.println("Worker " + this.name + " checked out at " + time);
            
            // set the time
            this.checkOut = time;
            this.pay();
    }
        }
        
        // helper for the pay method
        public static boolean isBetween(int x, int lower, int upper) {
            return lower <= x && x <= upper;
        }
        
        
        private void pay () {
            double checkInTime = this.checkIn.getValue();
            double checkOutTime = this.checkOut.getValue();
            
            double timeWorked = checkOutTime - checkInTime;
            
            double amountPaying = 0;
            
            
            // get the pay by checking the place and seeing if it is between the 2 requirments for that area
            if (isBetween(this.location, 100, 199)) {
                // $10.00 per hour with time and a half for any hours over 5 per day
                double amountPerHour = 10.00;
                
                
                if (timeWorked > 5) {
                    // Pay for the first 5 hours
                    amountPaying += 5*amountPerHour;
                    
                    // set the half for over 5
                    timeWorked -= 5;
                    timeWorked *= 1.5;
                    amountPaying += timeWorked*amountPerHour;
                } 
                else {
                    amountPaying += timeWorked*amountPerHour;
                }
            } 
            
            else if (isBetween(this.location, 200, 299)) {
                // $7.50 per hour with double time for hours worked over 6 per day
                double amountPerHour = 7.50;
                if (timeWorked > 6) {
                    // Pay for the firts 5 hours
                    amountPaying += 5*amountPerHour;
                    
                    // set the half for over 5
                    timeWorked -= 6;
                    timeWorked *= 2;
                    amountPaying += timeWorked*amountPerHour;
                } 
                else {
                    amountPaying += timeWorked*amountPerHour;
                }
            }
            
            else if (isBetween(this.location, 300, 399)) {
                // $9.25 for the first 4 hours and $10.50 for the rest
                double amountPerHour1 = 9.25;
                double amountPerHour2 = 10.50;
                
                if (timeWorked > 4) {
                    amountPaying += 4*amountPerHour1;
                    
                    timeWorked -= 4;
                    amountPaying += timeWorked*amountPerHour2;
                } 
                else {
                    amountPaying += timeWorked*amountPerHour1;
                }
            }
            
            else if (isBetween(this.location, 400, 499)) {
                // $13.50 per hour on Sundays (day 1) 
                // Saturdays (day 7) and $6.75 per hour otherwise.
                double amountPerHour1 = 13.50;
                double amountPerHour2 = 6.75;
                
                
                // I dont know if this should have this.day.getValue();
                if (this.day == Week.SUNDAY || this.day == Week.SATURDAY) {
                    amountPaying += timeWorked*amountPerHour1;
                } 
                else {
                    amountPaying += timeWorked*amountPerHour2;
                }
            }
            
            else if (isBetween(this.location, 500, 599)) {
                // $8.00 per hour for the first 6 hours per day 
                // $12.00 per hour after that
                double amountPerHour1 = 8.00;
                double amountPerHour2 = 12.00;
                
                if (timeWorked > 6) {
                    amountPaying += (amountPerHour1*6);
                    timeWorked -= 6;
                    
                    amountPaying += (amountPerHour2*timeWorked);
                } 
                else {
                    amountPaying += (amountPerHour1*timeWorked);
                }
                
            }
            
            System.out.printf("Paying %s - $%.2f", this.name, amountPaying);
            this.totalPay += amountPaying;
            
        }
    }
    
    /*
            
        Locations 200-299 get paid 
        $7.50 per hour with double time for hours worked over 6 per day.
            
        Locations 300-399 get paid 
        $9.25 for the first 4 hours and $10.50 for the rest.
            
        Locations 400-499 get paid 
        $13.50 per hour on Sundays (day 1) 
        Saturdays (day 7) and $6.75 per hour otherwise.
            
        Locations 500-599 get paid 
        $8.00 per hour for the first 6 hours per day and $12.00 per hour after that. 
    */
    
    public enum Week {
        SUNDAY(0),
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),   
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6);
    
        private int value;
    
        // constructor
        private Week (int value) {
            this.value = value;
        }
    
        // getter method
        public Week getValue () {
            switch (this.value) {
                case 0:
                    return Week.SUNDAY;
                case 1:
                    return Week.MONDAY;
                case 2:
                    return Week.TUESDAY;
                case 3:
                    return Week.WEDNESDAY;
                case 4:
                    return Week.THURSDAY;
                case 5:
                    return Week.FRIDAY;
                case 6:
                    return Week.SATURDAY;
            }
            return Week.SUNDAY;
        }
    }

    public enum Time {
        ONE(9.00),
        TWO(9.30),
        THREE(10.00),
        FOUR(10.30),
        FIVE(11.00),
        SIX(11.30),
        SEVEN(12.00),
        EIGHT(12.30),
        NINE(13.00),
        A(13.30),
        B(14.00),
        C(14.30),
        D(15.00),
        E(15.30),
        F(16.00),
        G(16.30),
        H(17.00);
    
        private final double value;

        // constructor
        private Time (double value) {
            this.value = value;
        }
    
        // getter method 
        public double getValue () {
            return this.value;
        }
        
    }

    
    public static class Clock {
        private String time;
        
        
        // first 2 digits are the hour and the first 2 decimals are the minutes
        public Clock (double time) {
            this.setTime(time);
        }
        
        
        public void setTime (double time) {
            // pattern to format
            String pattern = "00.00";
            
            DecimalFormat timeFormat = new DecimalFormat(pattern);
            String formattedTime = timeFormat.format(time);

            // Assign it
            this.time = formattedTime;
        }
        
        
        
        public String getTimeRaw () {
            return this.time;
        }
        
        
        public String getTimeFormatted () {
            String pattern = "#0:00";
            
            DecimalFormat timeFormat = new DecimalFormat(pattern);
            String formattedTime = timeFormat.format(this.time);
            
            return formattedTime;
        }
    }
}
```

# Problem 2
## SECRET CODES

Cryptography is the art of writing/solving codes. Computers encode and decode information often as precious data is sent across the big, bad internet. One method of enciphering and deciphering messages is to use shifts and circles. In this problem, you will take a series of commands, separated by slashes and a string and apply the appropriate actions to the string. The action definitions are as follows:

LS-X: Shifts all the characters of the string X places to the left. The leftmost X characters are deleted and X #’s are inserted on the right to return the string to its original length. 


LS–3 COMPUTER = PUTER###
 
RS–X: Shifts all the characters of the string X places to the right. The rightmost X characters are deleted and X #’s are inserted on the left to return the string to its original length. 


RS–3 COMPUTER = ###COMPU
 
LC-X: Circulates the leftmost X characters to the right-hand side of the string. 


LC–3 COMPUTER = PUTERCOM
 
RC–X: Circulates the rightmost X characters to the left-hand side of the string. 


RC–3 COMPUTER = TERCOMPU
 
MC– SLXD: Circulates the sub-string starting in position S with a length of L, X characters, in the direction D. All the arguments (S, L, X and D will be one character in length. The direction will be either L or R for left and right.

MC–332R COMPUTER = COPUMTER
 
REV–SL: Reverses the order of the characters starting at position S with a length of L. 


REV–33 COMPUTER = COUPMTER


INPUT: There will be five lines of input. Each line will be a string. Each string will consist of one or more commands and a character string to operate on. The commands will be separated from each other by a slash. The order of operation is always from left to right as the commands appear. 

OUTPUT: For each line of input, print the resulting string.

| SAMPLE INPUT		 | SAMPLE OUTPUT |
|---|---|
| 1. LS-1/RS-1/OHIO			|		1. #HIO |
| 2. RC-2/LC-5/CINCINNATI			|	2. CINNATICIN |
| 3. LS-1/LC-3/MC-453L/MEMORIAL	|		3. RIAMOL#E |
```java
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Process 5 test cases (5 lines of input)
        for (int caseNum = 1; caseNum <= 5; caseNum++) {
            // Split the input by "/" into commands and the initial string
            String[] tokens = sc.nextLine().split("/");
            String str = tokens[tokens.length - 1];  // last token is the base string

            // Apply each command from left to right (all except the last token)
            for (int i = 0; i < tokens.length - 1; i++) {
                String cmd = tokens[i];

                if (cmd.startsWith("LS-")) {
                    int x = Integer.parseInt(cmd.substring(3));
                    str = str.substring(x) + "#".repeat(x);

                } else if (cmd.startsWith("RS-")) {
                    int x = Integer.parseInt(cmd.substring(3));
                    str = "#".repeat(x) + str.substring(0, str.length() - x);

                } else if (cmd.startsWith("LC-")) {
                    int x = Integer.parseInt(cmd.substring(3));
                    str = str.substring(x) + str.substring(0, x);

                } else if (cmd.startsWith("RC-")) {
                    int x = Integer.parseInt(cmd.substring(3));
                    str = str.substring(str.length() - x) + str.substring(0, str.length() - x);

                } else if (cmd.startsWith("MC-")) {
                    // Format: MC–SLXD
                    int s = Character.getNumericValue(cmd.charAt(3)); // start position
                    int l = Character.getNumericValue(cmd.charAt(4)); // length
                    int x = Character.getNumericValue(cmd.charAt(5)); // shift amount
                    char d = cmd.charAt(6);                          // direction (L or R)

                    String before = str.substring(0, s - 1);
                    String mid = str.substring(s - 1, s - 1 + l);
                    String after = str.substring(s - 1 + l);

                    if (d == 'L') {
                        x %= l;
                        mid = mid.substring(x) + mid.substring(0, x);
                    } else {
                        x %= l;
                        mid = mid.substring(l - x) + mid.substring(0, l - x);
                    }

                    str = before + mid + after;

                } else if (cmd.startsWith("REV-")) {
                    // Format: REV–SL
                    int s = Character.getNumericValue(cmd.charAt(4)); // start position
                    int l = Character.getNumericValue(cmd.charAt(5)); // length

                    String before = str.substring(0, s - 1);
                    String mid = str.substring(s - 1, s - 1 + l);
                    String after = str.substring(s - 1 + l);

                    StringBuilder rev = new StringBuilder(mid);
                    rev.reverse();

                    str = before + rev + after;
                }
            }

            // Print the resulting string for this test case
            System.out.println(caseNum + ". " + str);
        }
    }
}
```
