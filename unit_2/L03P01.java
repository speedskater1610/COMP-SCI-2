/*
Interact with the user and ask for the necessary information to create the following mad lib:
Dear (Relative),
I am having a(n) (Adjective) time at camp. The counselor is (Adjective) and the food is (Adjective). I met (Name Of Person In Room) and we became (Adjective) friends. Unfortunately, (Name Of Person In Room) is (Adjective) and I (Verb Ending In Ed)my (Body Part) so we couldn't go (Verb Ending In Ing) like everybody else. I need more (Plural Noun) and a (Noun) sharpener, so please (Adverb) (Verb) more when you(Verb) back.
Your (Relative),
(Person In Room)
*/

import java.util.Scanner;

public class L03P01 {
    /**
     * @breif - a function that prints and takes user input
     * @return - String - returns the input that the user makes from the console as a String
     * @param - output - prints that before getting the input (acts as the question you are asking)
     */
    public static String readLine(String output) {
        Scanner input = new Scanner(System.in);
        System.out.print(output);
        return input.nextLine();
    }
    
    public static void main(String[] args) {
        String name = readLine("What is your name - ");
        String adj1 = readLine("Enter a Adjective - ");
        String adj2 = readLine("Enter a Adjective - ");
        String adj3 = readLine("Enter a Adjective - ");
        String adj4 = readLine("Enter a Adjective - ");
        String adj5 = readLine("Enter a Adjective - ");
        String verb_ing = readLine("Enter a verb ending in \"-ing\" - ");
        String verb_ed = readLine("Enter a verb ending in \"-ed\" - ");
        String nameOfPersonInRoom = readLine("Enter a name - ");
        String relativeName = readLine("Enter a name - ");
        String bodyPart1 = readLine("Enter a body part - ");
        String bodyPart2 = readLine("Enter a body part - ");
        String noun = readLine("Enter a noun - ");
        String pluralNoun = readLine("Enter a plural noun - ");
        String verb1 = readLine("Enter a verb - ");
        String verb2 = readLine("Enter a verb - "); 
        String adverb = readLine("Enter a abverb - "); 
        
        
        
        System.out.println(
            "Dear, " + relativeName  + ".\nI am having a(n) " + adj1 + " time at camp. The counselor is " + adj2 + " and the food is " + adj4 + ". I met " + nameOfPersonInRoom + " and we became " + adj3 + " friends. Unfortunately, " + nameOfPersonInRoom + " is " + adj5 + " and I " + verb_ed + " my " + bodyPart1 + " so we couldn't go " + verb_ing + " like everybody else. I need more " + pluralNoun + " and a " + noun + " sharpener, so please " + adverb + " " + verb1 + " more when you " + verb2 + " back. Your " + name);
    }
}