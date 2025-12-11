In this example, you will write a method that returns a String message. 

The method you will write is called `checkDNDstatus`.
The purpose of the method is to check and see whether or not a student is able to attend the Dungeons & Dragons club.
The following criteria must be met in order for a student to attend DND club:
- The day of the week must be Wednesday. The day will be stored as a String. 
- The student must have a character made. The characterStatus will be stored as a boolean variable.

### <strong>Parameters</strong>
The method will get 2 parameters - one for the day of the week (String), and another for the student character status (boolean). 

### <strong>Returns</strong>
The method will return one of the following messages based on the values of the parameters. 
-  If the day is Wednesday and the student has a character -- `Welcome to DND club!`
- If the day is Wednesday, but the student does not have a character -- `You do not have a character - you can't play.`
- If the day is not Wednesday, but the student does have a character -- `DND Club is on Wednesday - we are not playing today.`
- If the day is not Wednesday, and the student does not have a character -- `There is no DND club today, and you don't have a character.`

### Solution
The better solution would be
```java
public String checkDNDstatus(String day, boolean hasCharacter) {
    boolean isWednesday = day.equalsIgnoreCase("Wednesday");
    if (isWednesday && hasCharacter) {
        return "Welcome to DND club!";
    }
    else if (isWednesday && !hasCharacter) {
        return "You do not have a character - you can't play.";
    }
    else if (!isWednesday && hasCharacter) {
        return "DND Club is on Wednesday - we are not playing today.";
    }
	return "There is no DND club today, and you don't have a character.";
}
```

but this also passes
```java
public String checkDNDstatus(String day, boolean hasCharacter) {
    boolean isWednesday = day.equalsIgnoreCase("Wednesday");

    return (isWednesday && hasCharacter) ? "Welcome to DND club!" :
        ((isWednesday && !hasCharacter) ? "You do not have a character - you can't play." : 
            ((!isWednesday && hasCharacter) ? "DND Club is on Wednesday - we are not playing today." :
                "There is no DND club today, and you don't have a character."
            )
        );
}
```
